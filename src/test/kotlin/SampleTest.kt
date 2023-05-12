import com.github.paczek9000.infrastructure.TestProperties
import com.github.paczek9000.infrastructure.profileresolver.SystemActivePropertyProfileResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ActiveProfiles
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test

@ActiveProfiles(value = ["rd"], resolver = SystemActivePropertyProfileResolver::class)
@Test
class SampleTest : TestDependencies() {

    @Autowired
    val testProperties : TestProperties? = null
    @BeforeTest
    protected fun setupTest(){
        super.springTestContextPrepareTestInstance();
    }


    @Test
    fun tc1_springConfigurationContainsEnvProperties(){
        println(testProperties!!.gridOn)
    }
}