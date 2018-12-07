import com.example.samplekotlinboot.repository.MerchantDao;
import com.example.samplekotlinboot.repository.MerchantDaoImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ComponentScan
public class SampleTest {

    @Autowired
    private MerchantDao merchantDao;

    @Test
    public void test(){
        merchantDao.findAll();

    }
}
