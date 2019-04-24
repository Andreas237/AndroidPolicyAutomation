// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.sift;

import ch.qos.logback.core.Appender;
import ch.qos.logback.core.Context;
import java.util.List;
import java.util.Map;

// Referenced classes of package ch.qos.logback.core.sift:
//			AppenderFactory, SiftingJoranConfiguratorBase

public abstract class AbstractAppenderFactoryUsingJoran
	implements AppenderFactory
{

	protected AbstractAppenderFactoryUsingJoran(List list, String s, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		eventList = removeSiftElement(list);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #24  <Method List removeSiftElement(List)>
	//    6   10:putfield        #26  <Field List eventList>
		key = s;
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:putfield        #28  <Field String key>
		parentPropertyMap = map;
	//   10   18:aload_0         
	//   11   19:aload_3         
	//   12   20:putfield        #30  <Field Map parentPropertyMap>
	//   13   23:return          
	}

	public Appender buildAppender(Context context, String s)
	{
		s = ((String) (getSiftingJoranConfigurator(s)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #39  <Method SiftingJoranConfiguratorBase getSiftingJoranConfigurator(String)>
	//    3    5:astore_2        
		((SiftingJoranConfiguratorBase) (s)).setContext(context);
	//    4    6:aload_2         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #45  <Method void SiftingJoranConfiguratorBase.setContext(Context)>
		((SiftingJoranConfiguratorBase) (s)).doConfigure(eventList);
	//    7   11:aload_2         
	//    8   12:aload_0         
	//    9   13:getfield        #26  <Field List eventList>
	//   10   16:invokevirtual   #49  <Method void SiftingJoranConfiguratorBase.doConfigure(List)>
		return ((SiftingJoranConfiguratorBase) (s)).getAppender();
	//   11   19:aload_2         
	//   12   20:invokevirtual   #53  <Method Appender SiftingJoranConfiguratorBase.getAppender()>
	//   13   23:areturn         
	}

	public List getEventList()
	{
		return eventList;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field List eventList>
	//    2    4:areturn         
	}

	public abstract SiftingJoranConfiguratorBase getSiftingJoranConfigurator(String s);

	List removeSiftElement(List list)
	{
		return list.subList(1, list.size() - 1);
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:aload_1         
	//    3    3:invokeinterface #63  <Method int List.size()>
	//    4    8:iconst_1        
	//    5    9:isub            
	//    6   10:invokeinterface #67  <Method List List.subList(int, int)>
	//    7   15:areturn         
	}

	final List eventList;
	protected String key;
	protected Map parentPropertyMap;
}
