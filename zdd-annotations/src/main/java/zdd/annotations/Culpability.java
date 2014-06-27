package zdd.annotations;

public enum Culpability {
	HEAP_EATER("メモリを無駄に馬鹿食いするメソッド"),
	TOO_SHORT_LIFETIME("1リクエスト中でライフサイクルが維持されるべきオブジェクトなのに、呼び出しごとに無駄にインスタンス化されてしまうメソッド"),
	UNSUFFICIENT_PARAM_CHECK("パラメータチェックを十分に行っていないメソッド"),
	NOT_THREAD_SAFE("スレッドセーフでない"),
	BAD_NAME_FOR_IMPLEMENTATION("メソッド名が実際の処理内容と乖離している"),
	SIDE_EFFECT_METHOD("呼び出しに副作用がある（引数インスタンスあるいは自インスタンスを変更してしまう）"),
	MODIFIRABLE_CONSTANT("finalでない定数"),
	NEED_DOCUMENT("javadocコメントがないクラス、定数、変数、メソッド"),
	IGNORES_EXCEPTION("例外を握りつぶしている"),
	BAD_NAME_TO_UNDERSTAND("名前が汎用すぎて何かわからないメンバ変数やメソッド");
	
	private final String warningMessage;
	
	Culpability(String warningMessage){
		this.warningMessage = warningMessage;
	}
	
	public String warningMessage(){
		return warningMessage;
	}
	
}
