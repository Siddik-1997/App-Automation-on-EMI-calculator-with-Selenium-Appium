import org.testng.annotations.DataProvider;

public class DataSet {
    @DataProvider(name = "data-provider")
    public Object[][] setData() {
        return new Object[][]{
                {100000, 6, 2000, 2, 2000,  15361.08, 2000, 115361.08,4,10},
                {200000, 8, 5000, 2, 5000,  33391.61, 4000, 233391.61,3,11},
                {250000, 7, 8000, 1.5, 8000,26804.51, 3750,  276804.51,2,11},
                {50000, 10, 1000, 5,   1000,14949.12, 2500,  64949.12,5,5 }
        };
    }
}
