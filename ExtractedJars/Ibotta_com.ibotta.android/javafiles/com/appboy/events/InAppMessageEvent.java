// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.events;

import bo.app.ek;
import com.appboy.models.IInAppMessage;
import org.json.JSONObject;

public class InAppMessageEvent
{

	public InAppMessageEvent(IInAppMessage iinappmessage, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		b = s;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #15  <Field String b>
		if(iinappmessage != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          19
		{
			a = iinappmessage;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:putfield        #17  <Field IInAppMessage a>
			return;
	//   10   18:return          
		} else
		{
			throw new NullPointerException();
	//   11   19:new             #19  <Class NullPointerException>
	//   12   22:dup             
	//   13   23:invokespecial   #20  <Method void NullPointerException()>
	//   14   26:athrow          
		}
	}

	public IInAppMessage getInAppMessage()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field IInAppMessage a>
	//    2    4:areturn         
	}

	public String getUserId()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field String b>
	//    2    4:areturn         
	}

	public String toString()
	{
		return ek.a((JSONObject)a.forJsonPut());
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field IInAppMessage a>
	//    2    4:invokeinterface #32  <Method Object IInAppMessage.forJsonPut()>
	//    3    9:checkcast       #34  <Class JSONObject>
	//    4   12:invokestatic    #39  <Method String ek.a(JSONObject)>
	//    5   15:areturn         
	}

	private final IInAppMessage a;
	private final String b;
}
