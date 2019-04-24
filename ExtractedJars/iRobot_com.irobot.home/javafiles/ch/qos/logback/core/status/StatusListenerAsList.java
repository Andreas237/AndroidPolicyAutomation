// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.status;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package ch.qos.logback.core.status:
//			StatusListener, Status

public class StatusListenerAsList
	implements StatusListener
{

	public StatusListenerAsList()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		statusList = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #15  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void ArrayList()>
	//    6   12:putfield        #18  <Field List statusList>
	//    7   15:return          
	}

	public void addStatusEvent(Status status)
	{
		statusList.add(((Object) (status)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field List statusList>
	//    2    4:aload_1         
	//    3    5:invokeinterface #27  <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public List getStatusList()
	{
		return statusList;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field List statusList>
	//    2    4:areturn         
	}

	List statusList;
}
