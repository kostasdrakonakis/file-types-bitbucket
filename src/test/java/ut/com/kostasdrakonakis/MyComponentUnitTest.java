package ut.com.kostasdrakonakis;

import org.junit.Test;
import com.kostasdrakonakis.api.MyPluginComponent;
import com.kostasdrakonakis.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}