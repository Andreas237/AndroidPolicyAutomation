// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.models;

import bo.app.bt;
import bo.app.ek;
import com.appboy.enums.inappmessage.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appboy.models:
//			InAppMessageImmersiveBase

public class InAppMessageModal extends InAppMessageImmersiveBase
{

	public InAppMessageModal()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void InAppMessageImmersiveBase()>
	//    2    4:return          
	}

	public InAppMessageModal(JSONObject jsonobject, bt bt)
	{
		super(jsonobject, bt);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #12  <Method void InAppMessageImmersiveBase(JSONObject, bt)>
		if(j.equals(((Object) (ImageStyle.GRAPHIC))))
	//*   4    6:aload_0         
	//*   5    7:getfield        #16  <Field ImageStyle j>
	//*   6   10:getstatic       #21  <Field ImageStyle ImageStyle.GRAPHIC>
	//*   7   13:invokevirtual   #25  <Method boolean ImageStyle.equals(Object)>
	//*   8   16:ifeq            38
		{
			e = (CropType)ek.a(jsonobject, "crop_type", com/appboy/enums/inappmessage/CropType, ((Enum) (CropType.CENTER_CROP)));
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:ldc1            #27  <String "crop_type">
	//   12   23:ldc1            #29  <Class CropType>
	//   13   25:getstatic       #33  <Field CropType CropType.CENTER_CROP>
	//   14   28:invokestatic    #39  <Method Enum ek.a(JSONObject, String, Class, Enum)>
	//   15   31:checkcast       #29  <Class CropType>
	//   16   34:putfield        #42  <Field CropType e>
			return;
	//   17   37:return          
		} else
		{
			e = (CropType)ek.a(jsonobject, "crop_type", com/appboy/enums/inappmessage/CropType, ((Enum) (CropType.FIT_CENTER)));
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:ldc1            #27  <String "crop_type">
	//   21   42:ldc1            #29  <Class CropType>
	//   22   44:getstatic       #45  <Field CropType CropType.FIT_CENTER>
	//   23   47:invokestatic    #39  <Method Enum ek.a(JSONObject, String, Class, Enum)>
	//   24   50:checkcast       #29  <Class CropType>
	//   25   53:putfield        #42  <Field CropType e>
			return;
	//   26   56:return          
		}
	}

	public volatile Object forJsonPut()
	{
		return ((Object) (forJsonPut()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method JSONObject forJsonPut()>
	//    2    4:areturn         
	}

	public JSONObject forJsonPut()
	{
		JSONException jsonexception;
		if(h != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field JSONObject h>
	//*   2    4:ifnull          12
			return h;
	//    3    7:aload_0         
	//    4    8:getfield        #56  <Field JSONObject h>
	//    5   11:areturn         
		JSONObject jsonobject;
		try
		{
			jsonobject = super.forJsonPut();
	//    6   12:aload_0         
	//    7   13:invokespecial   #57  <Method JSONObject InAppMessageImmersiveBase.forJsonPut()>
	//    8   16:astore_1        
			jsonobject.put("type", ((Object) (MessageType.MODAL.name())));
	//    9   17:aload_1         
	//   10   18:ldc1            #59  <String "type">
	//   11   20:getstatic       #65  <Field MessageType MessageType.MODAL>
	//   12   23:invokevirtual   #69  <Method String MessageType.name()>
	//   13   26:invokevirtual   #75  <Method JSONObject JSONObject.put(String, Object)>
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
