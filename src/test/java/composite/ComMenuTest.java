package composite;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017-07-13.
 */
public class ComMenuTest extends TestCase {
    public void testInit() {
        ComMenuComponent pancakeHouseMenu = new ComMenu("팬케이크 하우스 메뉴", "아침 메뉴");
        ComMenuComponent cafeMenu = new ComMenu("카페 메뉴", "점심 메뉴");
        ComMenuComponent dinerMenu = new ComMenu("객체마을 식당 메뉴", "저녁 메뉴");
        ComMenuComponent dessertMenu = new ComMenu("디저트 메뉴", "디저트를 즐겨 보세요!");

        ComMenuComponent allMenu = new ComMenu("전체 메뉴", "전체 메뉴");

        allMenu.add(pancakeHouseMenu);
        allMenu.add(dinerMenu);
        allMenu.add(cafeMenu);

        dinerMenu.add(new ComMenuItem("파스타", "마리나라 소스 스파게피, 효모빵도 드립니다.", true, 3.89));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new ComMenuItem("애플 파이", "바삭바삭한 크러스트에 바닐라 아이스크림이 얹혀 있는 애플 파이", true, 1.59));

        ComWaitress waitress = new ComWaitress(allMenu);
        waitress.printMenu();

        waitress.printVegetarianMenu();


    }
}
