package org.tony.chenjy.movie_recommender_system.dev;

public class DriverWithAverage {
	public static void main(String[] args) throws Exception {
		args = new String[]{"src/main/resources/recommender_system/input_small/*",
							// "src/main/resources/recommender_system/input_big/*",
							"src/main/resources/recommender_system/output/userRatingList",
							"src/main/resources/recommender_system/output/coOccurrenceMatrix",
							"src/main/resources/recommender_system/output/normalizeMatrix",

							"src/main/resources/recommender_system/output/userAverageRating",
							"src/main/resources/recommender_system/output/multiplicationUnitWithAverage",
							"src/main/resources/recommender_system/output/sumWithAverage",
							"src/main/resources/recommender_system/output/compareWithAverage"};

		String userRating = args[0];
		String userRatingList = args[1];
		String coOccurrenceMatrix = args[2];
		String normalizeMatrix = args[3];

		String[] path1 = {userRating, userRatingList};
		String[] path2 = {userRatingList, coOccurrenceMatrix};
		String[] path3 = {coOccurrenceMatrix, normalizeMatrix};

		// DataDividerByUser.main(path1);
		// CoOccurrenceMatrixGenerator.main(path2);
		// Normalize.main(path3);

		// with average rating
		String userAverageRating = args[4];
		String multiplicationUnitWithAverage = args[5];
		String sumWithAverage = args[6];
		String compareWithAverage = args[7];

		String[] path4 = {userRating, userAverageRating};
		String[] path5 = {normalizeMatrix, userRating, multiplicationUnitWithAverage, userAverageRating};
		String[] path6 = {multiplicationUnitWithAverage, sumWithAverage};
		String[] path7 = {userRating, sumWithAverage, compareWithAverage};

		AverageRating.main(path4);
		MultiplicationWithAverage.main(path5);
		Sum.main(path6);
		Compare.main(path7);

	}

}
