// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.models;

import bo.app.bt;
import bo.app.ek;
import com.appboy.enums.inappmessage.CropType;
import com.appboy.enums.inappmessage.MessageType;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appboy.models:
//			InAppMessageImmersiveBase

public class InAppMessageFull extends InAppMessageImmersiveBase
{

	public InAppMessageFull()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void InAppMessageImmersiveBase()>
		e = CropType.CENTER_CROP;
	//    2    4:aload_0         
	//    3    5:getstatic       #14  <Field CropType CropType.CENTER_CROP>
	//    4    8:putfield        #17  <Field CropType e>
	//    5   11:return          
	}

	public InAppMessageFull(JSONObject jsonobject, bt bt)
	{
		super(jsonobject, bt);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void InAppMessageImmersiveBase(JSONObject, bt)>
		e = (CropType)ek.a(jsonobject, "crop_type", com/appboy/enums/inappmessage/CropType, ((Enum) (CropType.CENTER_CROP)));
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:ldc1            #23  <String "crop_type">
	//    7   10:ldc1            #10  <Class CropType>
	//    8   12:getstatic       #14  <Field CropType CropType.CENTER_CROP>
	//    9   15:invokestatic    #29  <Method Enum ek.a(JSONObject, String, Class, Enum)>
	//   10   18:checkcast       #10  <Class CropType>
	//   11   21:putfield        #17  <Field CropType e>
	//   12   24:return          
	}

	public volatile Object forJsonPut()
	{
		return ((Object) (forJsonPut()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #34  <Method JSONObject forJsonPut()>
	//    2    4:areturn         
	}

	public JSONObject forJsonPut()
	{
		JSONException jsonexception;
		if(h != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field JSONObject h>
	//*   2    4:ifnull          12
			return h;
	//    3    7:aload_0         
	//    4    8:getfield        #40  <Field JSONObject h>
	//    5   11:areturn         
		JSONObject jsonobject;
		try
		{
			jsonobject = super.forJsonPut();
	//    6   12:aload_0         
	//    7   13:invokespecial   #41  <Method JSONObject InAppMessageImmersiveBase.forJsonPut()>
	//    8   16:astore_1        
			jsonobject.put("type", ((Object) (MessageType.FULL.name())));
	//    9   17:aload_1         
	//   10   18:ldc1            #43  <String "type">
	//   11   20:getstatic       #49  <Field MessageType MessageType.FULL>
	//   12   23:invokevirtual   #53  <Method String MessageType.name()>
	//   13   26:invokevirtual   #59  <Method JSONObject JSONObject.put(String, Object)>
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
