
import com.github.paczek9000.infrastructure.TestApplicationContext
import com.github.paczek9000.infrastructure.TestProperties
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests

@ExtendWith(SpringExtension::class)
@SpringBootTest
@ContextConfiguration(classes = [TestApplicationContext::class, TestProperties::class])
class TestDependencies : AbstractTestNGSpringContextTests(){

}