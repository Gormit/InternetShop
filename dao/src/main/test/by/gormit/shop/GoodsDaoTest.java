package by.gormit.shop;

import by.gormit.shop.Goods;
import by.gormit.shop.dao.GoodsDao;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Марина on 10.05.2015.
 */
public class GoodsDaoTest {

    private Goods getTestGood() {
        Goods good = new Goods();
        good.setName("testName");
        good.setCategory(1);
        good.setManufacturer(1);
        good.setCount(1);
        good.setPrice(1);
        good.setDescription("description");
        return good;
    }

    @Test
    public void testGet() throws Exception {
        Goods testGood = getTestGood();
        new GoodsDao().add(testGood);
        int id = new GoodsDao().getId("testName");
        testGood.setId(id);
        Goods good = new GoodsDao().get(id);
        Assert.assertEquals("Compare Good", testGood, good);
        new GoodsDao().delete(id);

    }
}