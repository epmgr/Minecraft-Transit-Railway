package mtr.model;

public class ModelCTrainSmall extends ModelCTrain {

	@Override
	protected int[] getWindowPositions() {
		return new int[]{-80, 0, 80};
	}

	@Override
	protected int[] getDoorPositions() {
		return new int[]{-120, -40, 40, 120};
	}

	@Override
	protected int[] getEndPositions() {
		return new int[]{-144, 144};
	}

	@Override
	protected int[] getBogiePositions() {
		return new int[]{-96, 96};
	}
}
