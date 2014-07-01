package zdd.annotations;

public enum Complaints {
	/**
	 * メモリを無駄に馬鹿食いするメソッド
	 */
	HEAP_EATER("メモリを無駄に馬鹿食いするメソッド"),
	/**
	 * 1リクエスト中でライフサイクルが維持されるべきオブジェクトなのに、呼び出しごとに無駄にインスタンス化されてしまうメソッド
	 */
	TOO_SHORT_LIFETIME("1リクエスト中でライフサイクルが維持されるべきオブジェクトなのに、呼び出しごとに無駄にインスタンス化されてしまうメソッド"),
	/**
	 * パラメータチェックを十分に行っていないメソッド
	 */
	UNSUFFICIENT_PARAM_CHECK("パラメータチェックを十分に行っていないメソッド"),
	/**
	 * スレッドセーフでない
	 */
	NOT_THREAD_SAFE("スレッドセーフでない"),
	/**
	 * メソッド名が実際の処理内容と乖離している
	 */
	BAD_NAME_FOR_IMPLEMENTATION("メソッド名が実際の処理内容と乖離している"),
	/**
	 * 呼び出しに副作用がある（引数インスタンスあるいは自インスタンスを変更してしまう）
	 */
	SIDE_EFFECT_METHOD("呼び出しに副作用がある（引数インスタンスあるいは自インスタンスを変更してしまう）"),
	/**
	 * finalでない定数
	 */
	MODIFIRABLE_CONSTANT("finalでない定数"),
	/**
	 * javadocコメントがないクラス、定数、変数、メソッド
	 */
	NEED_DOCUMENT("javadocコメントがないクラス、定数、変数、メソッド"),
	/**
	 * 例外を握りつぶしている
	 */
	IGNORES_EXCEPTION("例外を握りつぶしている"),
	/**
	 * 名前が汎用すぎて何かわからないメンバ変数やメソッド
	 */
	BAD_NAME_TO_UNDERSTAND("名前が汎用すぎて何かわからないメンバ変数やメソッド");
	
	private final String warningMessage;
	
	Complaints(String warningMessage){
		this.warningMessage = warningMessage;
	}
	
	public String warningMessage(){
		return warningMessage;
	}
	
}
