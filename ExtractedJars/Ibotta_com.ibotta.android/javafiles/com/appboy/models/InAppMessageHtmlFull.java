// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.models;

import bo.app.bt;
import com.appboy.enums.inappmessage.MessageType;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appboy.models:
//			InAppMessageHtmlBase

public class InAppMessageHtmlFull extends InAppMessageHtmlBase
{

	public InAppMessageHtmlFull()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void InAppMessageHtmlBase()>
	//    2    4:return          
	}

	public InAppMessageHtmlFull(JSONObject jsonobject, bt bt)
	{
		super(jsonobject, bt);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #12  <Method void InAppMessageHtmlBase(JSONObject, bt)>
	//    4    6:return          
	}

	public volatile Object forJsonPut()
	{
		return ((Object) (forJsonPut()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #17  <Method JSONObject forJsonPut()>
	//    2    4:areturn         
	}

	public JSONObject forJsonPut()
	{
		JSONException jsonexception;
		if(h != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field JSONObject h>
	//*   2    4:ifnull          12
			return h;
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field JSONObject h>
	//    5   11:areturn         
		JSONObject jsonobject;
		try
		{
			jsonobject = super.forJsonPut();
	//    6   12:aload_0         
	//    7   13:invokespecial   #24  <Method JSONObject InAppMessageHtmlBase.forJsonPut()>
	//    8   16:astore_1        
			jsonobject.put("type", ((Object) (MessageType.HTML_FULL.name())));
	//    9   17:aload_1         
	//   10   18:ldc1            #26  <String "type">
	//   11   20:getstatic       #32  <Field MessageType MessageType.HTML_FULL>
	//   12   23:invokevirtual   #36  <Method String MessageType.name()>
	//   13   26:invokevirtual   #42  <Method JSONObject JSONObject.put(String, Object)>
	//   14   29:pop             
		}
	//*  15   30:aload_1         
	//*  16   31:areturn         
	//*  17   32:aconst_null     
	//*  18   33:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONException jsonexception)
		{
			return null;
		}
		return jsonobject;
	//*  19   34:astore_1        
	//*  20   35:goto            32
	}
}
