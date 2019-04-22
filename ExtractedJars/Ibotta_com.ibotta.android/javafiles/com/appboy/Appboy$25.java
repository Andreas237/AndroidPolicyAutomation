// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import bo.app.dn;
import com.appboy.events.ContentCardsUpdatedEvent;
import java.util.concurrent.Callable;

// Referenced classes of package com.appboy:
//			Appboy

class Appboy$25
	implements Callable
{

	public ContentCardsUpdatedEvent a()
	{
		return a.h.a();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Appboy a>
	//    2    4:getfield        #26  <Field dn Appboy.h>
	//    3    7:invokevirtual   #30  <Method ContentCardsUpdatedEvent dn.a()>
	//    4   10:areturn         
	}

	public Object call()
	{
		return ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method ContentCardsUpdatedEvent a()>
	//    2    4:areturn         
	}

	final Appboy a;

	Appboy$25(Appboy appboy)
	{
		a = appboy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Appboy a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
