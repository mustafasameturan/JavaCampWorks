package oopIntroHomework;

public class CategoryManager {
	public void changeCategoryName(Category category, String newCategoryName) {
		category.categoryName = newCategoryName;
		System.out.println("Yeni Kategori Ad� : " + newCategoryName);
	}
}
