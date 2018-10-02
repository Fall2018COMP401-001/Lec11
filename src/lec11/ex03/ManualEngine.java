package lec11.ex03;

public class ManualEngine extends EngineImpl {

	@Override
	public void setGear(Gear new_gear) {
		switch(new_gear) {
		case PARK:
			if (getThrottle() != 0) {
				throw new RuntimeException("Attempted to park while throttle not at zero");
			}
		case FIRST:
		case SECOND:
		case THIRD:
		case FOURTH:
		case FIFTH:
			super.setGear(new_gear);
			break;
		default:
			throw new RuntimeException("Invalid Gear");
		}
	}

}
