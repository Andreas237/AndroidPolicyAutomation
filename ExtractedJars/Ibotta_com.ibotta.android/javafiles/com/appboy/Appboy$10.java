// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import bo.app.ac;
import bo.app.dr;
import com.appboy.events.FeedUpdatedEvent;
import com.appboy.support.AppboyLogger;
import org.json.JSONException;

// Referenced classes of package com.appboy:
//			Appboy

class Appboy$10
	implements Runnable
{

	public void run()
	{
		try
		{
			Appboy.c(a).a(((Object) (a.c.a())), com/appboy/events/FeedUpdatedEvent);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Appboy a>
	//    2    4:invokestatic    #27  <Method ac Appboy.c(Appboy)>
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field Appboy a>
	//    5   11:getfield        #30  <Field dr Appboy.c>
	//    6   14:invokevirtual   #35  <Method FeedUpdatedEvent dr.a()>
	//    7   17:ldc1            #37  <Class FeedUpdatedEvent>
	//    8   19:invokevirtual   #42  <Method void ac.a(Object, Class)>
			return;
	//    9   22:return          
		}
		catch(JSONException jsonexception)
	//*  10   23:astore_1        
		{
			AppboyLogger.w(Appboy.b(), "Failed to retrieve and publish feed from offline cache.", ((Throwable) (jsonexception)));
	//   11   24:invokestatic    #46  <Method String Appboy.b()>
	//   12   27:ldc1            #48  <String "Failed to retrieve and publish feed from offline cache.">
	//   13   29:aload_1         
	//   14   30:invokestatic    #54  <Method int AppboyLogger.w(String, String, Throwable)>
	//   15   33:pop             
		}
	//   16   34:return          
	}

	final Appboy a;

	Appboy$10(Appboy appboy)
	{
		a = appboy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field Appboy a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
