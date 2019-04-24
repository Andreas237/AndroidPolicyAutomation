// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.sift;

import ch.qos.logback.core.sift.AbstractAppenderFactoryUsingJoran;
import ch.qos.logback.core.sift.SiftingJoranConfiguratorBase;
import java.util.List;
import java.util.Map;

// Referenced classes of package ch.qos.logback.classic.sift:
//			SiftingJoranConfigurator

public class AppenderFactoryUsingJoran extends AbstractAppenderFactoryUsingJoran
{

	AppenderFactoryUsingJoran(List list, String s, Map map)
	{
		super(list, s, map);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #9   <Method void AbstractAppenderFactoryUsingJoran(List, String, Map)>
	//    5    7:return          
	}

	public SiftingJoranConfiguratorBase getSiftingJoranConfigurator(String s)
	{
		return ((SiftingJoranConfiguratorBase) (new SiftingJoranConfigurator(key, s, parentPropertyMap)));
	//    0    0:new             #16  <Class SiftingJoranConfigurator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field String key>
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #24  <Field Map parentPropertyMap>
	//    7   13:invokespecial   #27  <Method void SiftingJoranConfigurator(String, String, Map)>
	//    8   16:areturn         
	}
}
