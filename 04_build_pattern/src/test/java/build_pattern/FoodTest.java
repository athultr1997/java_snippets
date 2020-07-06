// package build_pattern;

// import org.junit.Test;
// import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertTrue;

// public class FoodTest {
// 	@Test
// 	public void Food_BuilderPatternInitialization_NoExceptions() {
// 		Food food = new Food.Builder(101.0).fat(0.1).acid(10.4).sugar(34.0).preservativesPresent(false).isOrganic(true).build();
// 		assertEquals(101, food.getCalories(), 0.0001);
// 		assertEquals(0.1, food.getFat(), 0.0001);
// 		assertEquals(10.4, food.getAcid(), 0.0001);
// 		assertEquals(34, food.getSugar(), 0.0001);
// 		assertEquals(false, food.arePreservativesPresent());
// 		assertEquals(true, food.isOrganic());
// 	}

// 	@Test
// 	public void Food_OrderOfInitialization_Same() {
// 		Food food1 = new Food.Builder(101.0).fat(0.1).acid(10.4).sugar(34.0).preservativesPresent(false).isOrganic(true).build();
// 		Food food2 = new Food.Builder(101.0).sugar(34.0).fat(0.1).isOrganic(true).preservativesPresent(false).acid(10.4).build();
// 		assertEquals(food1.getCalories(), food2.getCalories(), 0.0001);
// 		assertEquals(food1.getFat(), food2.getFat(), 0.0001);
// 		assertEquals(food1.getAcid(), food2.getAcid(), 0.0001);
// 		assertEquals(food1.getSugar(), food2.getSugar(), 0.0001);
// 		assertEquals(food1.arePreservativesPresent(), food2.arePreservativesPresent());
// 		assertEquals(food1.isOrganic(), food2.isOrganic());
// 	}
// }

