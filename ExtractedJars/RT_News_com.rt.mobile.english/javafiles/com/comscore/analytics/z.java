// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.analytics;

import com.comscore.applications.EventType;
import java.util.HashMap;

// Referenced classes of package com.comscore.analytics:
//			Core

class z
	implements Runnable
{

	z(Core core, EventType eventtype, HashMap hashmap)
	{
		c = core;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field Core c>
		a = eventtype;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field EventType a>
		b = hashmap;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #20  <Field HashMap b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #23  <Method void Object()>
	//   11   19:return          
	}

	public void run()
	{
		c.a(a, b);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Core c>
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field EventType a>
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field HashMap b>
	//    6   12:invokevirtual   #30  <Method void Core.a(EventType, HashMap)>
	//    7   15:return          
	}

	final EventType a;
	final HashMap b;
	final Core c;
}
