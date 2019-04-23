// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import org.json.JSONException;
import org.json.JSONObject;

public class CraftARCollection
{

	CraftARCollection(JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		reloadFromJSONObject(jsonobject);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #17  <Method void reloadFromJSONObject(JSONObject)>
	//    5    9:return          
	}

	String getAppID()
	{
		return mAppID;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String mAppID>
	//    2    4:areturn         
	}

	public String getImageFieldTemplate()
	{
		return mImageFieldTemplate;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String mImageFieldTemplate>
	//    2    4:areturn         
	}

	String getLocalPath()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String getPublicKey()
	{
		return mPublicKey;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String mPublicKey>
	//    2    4:areturn         
	}

	public String getUUID()
	{
		return mUUID;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String mUUID>
	//    2    4:areturn         
	}

	void reloadFromJSONObject(JSONObject jsonobject)
	{
		try
		{
			mPublicKey = jsonobject.getString("pubkey");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #36  <String "pubkey">
	//    3    4:invokevirtual   #42  <Method String JSONObject.getString(String)>
	//    4    7:putfield        #29  <Field String mPublicKey>
			mUUID = jsonobject.getString("uuid");
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:ldc1            #44  <String "uuid">
	//    8   14:invokevirtual   #42  <Method String JSONObject.getString(String)>
	//    9   17:putfield        #32  <Field String mUUID>
			mAppID = jsonobject.getString("app_id");
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:ldc1            #46  <String "app_id">
	//   13   24:invokevirtual   #42  <Method String JSONObject.getString(String)>
	//   14   27:putfield        #22  <Field String mAppID>
			mImageFieldTemplate = jsonobject.getString("image_template");
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:ldc1            #48  <String "image_template">
	//   18   34:invokevirtual   #42  <Method String JSONObject.getString(String)>
	//   19   37:putfield        #25  <Field String mImageFieldTemplate>
			return;
	//   20   40:return          
		}
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//*  21   41:astore_1        
		{
			((JSONException) (jsonobject)).printStackTrace();
	//   22   42:aload_1         
	//   23   43:invokevirtual   #51  <Method void JSONException.printStackTrace()>
		}
	//   24   46:return          
	}

	String mAppID;
	String mImageFieldTemplate;
	String mPublicKey;
	String mUUID;
}
