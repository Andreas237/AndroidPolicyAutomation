// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.events;

import bo.app.dt;
import com.appboy.models.IInAppMessage;
import com.appboy.support.AppboyLogger;
import org.json.JSONObject;

public final class InAppMessageEvent
{

	public InAppMessageEvent(IInAppMessage iinappmessage, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		c = s;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #26  <Field String c>
		if(iinappmessage != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          19
		{
			b = iinappmessage;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:putfield        #28  <Field IInAppMessage b>
			return;
	//   10   18:return          
		} else
		{
			throw new NullPointerException();
	//   11   19:new             #30  <Class NullPointerException>
	//   12   22:dup             
	//   13   23:invokespecial   #31  <Method void NullPointerException()>
	//   14   26:athrow          
		}
	}

	public IInAppMessage getInAppMessage()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field IInAppMessage b>
	//    2    4:areturn         
	}

	public String getUserId()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String c>
	//    2    4:areturn         
	}

	public String toString()
	{
		return dt.a((JSONObject)b.forJsonPut());
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field IInAppMessage b>
	//    2    4:invokeinterface #42  <Method Object IInAppMessage.forJsonPut()>
	//    3    9:checkcast       #44  <Class JSONObject>
	//    4   12:invokestatic    #49  <Method String dt.a(JSONObject)>
	//    5   15:areturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(com/appboy/events/InAppMessageEvent);
	private final IInAppMessage b;
	private final String c;

	static 
	{
	//    0    0:ldc1            #2   <Class InAppMessageEvent>
	//    1    2:invokestatic    #17  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #19  <Field String a>
	//*   3    8:return          
	}
}
