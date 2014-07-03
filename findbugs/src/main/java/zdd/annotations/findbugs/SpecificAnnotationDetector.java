package zdd.annotations.findbugs;


import edu.umd.cs.findbugs.BugInstance;
import edu.umd.cs.findbugs.BugReporter;
import edu.umd.cs.findbugs.BytecodeScanningDetector;
import edu.umd.cs.findbugs.MethodAnnotation;
import edu.umd.cs.findbugs.ba.XFactory;
import edu.umd.cs.findbugs.ba.XMethod;
import edu.umd.cs.findbugs.classfile.ClassDescriptor;

/**
 * @author sasaki.ka
 */
public class SpecificAnnotationDetector extends BytecodeScanningDetector {

    public SpecificAnnotationDetector(BugReporter bugReporter){
        this.bugReporter = bugReporter;
    }
    
    private final BugReporter bugReporter;
    
    @Override
    public void sawOpcode(int seen) {
        super.sawOpcode(seen);
        if(isMethodCall()){
        	System.out.println("ismethod failse");
        }
        if(isMethodCall() && isAnnotated(seen)){
        	System.out.println("SPAD found");
            bugReporter.reportBug(new BugInstance("GUILTY_ANNOTATED_METHOD_INVOKATION", HIGH_PRIORITY).addClassAndMethod(this).addSourceLine(this));
        }
        System.out.println("end");
    }

    /**
     * @return
     */
    private boolean isAnnotated(int seen) {
    	System.out.println("isa start");
        XMethod callSeen = XFactory.createXMethod(MethodAnnotation.fromCalledMethod(this));
        System.out.println(callSeen.toString());
        for(ClassDescriptor desc: callSeen.getAnnotationDescriptors()){
        	System.out.println(desc.getDottedClassName());
            if("zdd.annotations.Guilty".equals(desc.getDottedClassName())){
                return true;
            }
        }
        return false;
    }

}
