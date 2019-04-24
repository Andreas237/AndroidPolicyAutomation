// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.events;

import java.util.Comparator;

// Referenced classes of package io.fabric.sdk.android.services.events:
//			EventsFilesManager

class EventsFilesManager$1
	implements Comparator
{

	public int compare(leWithTimestamp lewithtimestamp, leWithTimestamp lewithtimestamp1)
	{
		return (int)(lewithtimestamp.timestamp - lewithtimestamp1.timestamp);
	//    0    0:aload_1         
	//    1    1:getfield        #29  <Field long EventsFilesManager$FileWithTimestamp.timestamp>
	//    2    4:aload_2         
	//    3    5:getfield        #29  <Field long EventsFilesManager$FileWithTimestamp.timestamp>
	//    4    8:lsub            
	//    5    9:l2i             
	//    6   10:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((leWithTimestamp)obj, (leWithTimestamp)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #25  <Class EventsFilesManager$FileWithTimestamp>
	//    3    5:aload_2         
	//    4    6:checkcast       #25  <Class EventsFilesManager$FileWithTimestamp>
	//    5    9:invokevirtual   #32  <Method int compare(EventsFilesManager$FileWithTimestamp, EventsFilesManager$FileWithTimestamp)>
	//    6   12:ireturn         
	}

	final EventsFilesManager this$0;

	EventsFilesManager$1()
	{
		this$0 = EventsFilesManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field EventsFilesManager this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
