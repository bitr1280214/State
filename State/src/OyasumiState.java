class OyasumiState extends DogState {
	private static OyasumiState s = new OyasumiState();
	private OyasumiState() {
		}
	public static DogState getInstance() {
		return s;
		} public void tukareta(Dog moto) {
			moto.changeState(TanoshiiState.getInstance());
			}
		public void tabeta(Dog moto) {
			// なにもしない
			}
		public String toString() {
			return "おやすみ状態";
			}
	}