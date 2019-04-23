// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import org.json.*;

// Referenced classes of package com.craftar:
//			CraftARCollection, CLog

public class CraftARItem
{

	public CraftARItem(CraftARCollection craftarcollection, JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		mIsARItem = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #34  <Field boolean mIsARItem>
		mParentCollectionUUID = craftarcollection.getUUID();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #40  <Method String CraftARCollection.getUUID()>
	//    8   14:putfield        #42  <Field String mParentCollectionUUID>
		if(!createFromJson(jsonobject))
	//*   9   17:aload_0         
	//*  10   18:aload_2         
	//*  11   19:invokevirtual   #46  <Method boolean createFromJson(JSONObject)>
	//*  12   22:ifne            30
			CLog.e("CreateFromJSON failed: item is null");
	//   13   25:ldc1            #48  <String "CreateFromJSON failed: item is null">
	//   14   27:invokestatic    #54  <Method void CLog.e(String)>
	//   15   30:return          
	}

	static int getItemTypeFromJSONObject(JSONObject jsonobject)
	{
		return !jsonobject.has("tracking") ? 0 : 1;
	//    0    0:aload_0         
	//    1    1:ldc1            #58  <String "tracking">
	//    2    3:invokevirtual   #64  <Method boolean JSONObject.has(String)>
	//    3    6:ifeq            11
	//    4    9:iconst_1        
	//    5   10:ireturn         
	//    6   11:iconst_0        
	//    7   12:ireturn         
	}

	protected boolean createFromJson(JSONObject jsonobject)
	{
		if(jsonobject == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		json = jsonobject;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #68  <Field JSONObject json>
		StringBuilder stringbuilder = new StringBuilder();
	//    7   11:new             #70  <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #71  <Method void StringBuilder()>
	//   10   18:astore_2        
		stringbuilder.append("Creating item from json:");
	//   11   19:aload_2         
	//   12   20:ldc1            #73  <String "Creating item from json:">
	//   13   22:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   14   25:pop             
		stringbuilder.append(jsonobject.toString());
	//   15   26:aload_2         
	//   16   27:aload_1         
	//   17   28:invokevirtual   #80  <Method String JSONObject.toString()>
	//   18   31:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   19   34:pop             
		CLog.d(stringbuilder.toString());
	//   20   35:aload_2         
	//   21   36:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   22   39:invokestatic    #84  <Method void CLog.d(String)>
		try
		{
			itemUUID = jsonobject.getString("uuid");
	//   23   42:aload_0         
	//   24   43:aload_1         
	//   25   44:ldc1            #86  <String "uuid">
	//   26   46:invokevirtual   #90  <Method String JSONObject.getString(String)>
	//   27   49:putfield        #92  <Field String itemUUID>
			itemName = jsonobject.getString("name");
	//   28   52:aload_0         
	//   29   53:aload_1         
	//   30   54:ldc1            #94  <String "name">
	//   31   56:invokevirtual   #90  <Method String JSONObject.getString(String)>
	//   32   59:putfield        #96  <Field String itemName>
			if(jsonobject.has("url"))
	//*  33   62:aload_1         
	//*  34   63:ldc1            #97  <String "url">
	//*  35   65:invokevirtual   #64  <Method boolean JSONObject.has(String)>
	//*  36   68:ifeq            81
				url = jsonobject.getString("url");
	//   37   71:aload_0         
	//   38   72:aload_1         
	//   39   73:ldc1            #97  <String "url">
	//   40   75:invokevirtual   #90  <Method String JSONObject.getString(String)>
	//   41   78:putfield        #99  <Field String url>
			if(jsonobject.has("custom"))
	//*  42   81:aload_1         
	//*  43   82:ldc1            #100 <String "custom">
	//*  44   84:invokevirtual   #64  <Method boolean JSONObject.has(String)>
	//*  45   87:ifeq            100
				custom = jsonobject.getString("custom");
	//   46   90:aload_0         
	//   47   91:aload_1         
	//   48   92:ldc1            #100 <String "custom">
	//   49   94:invokevirtual   #90  <Method String JSONObject.getString(String)>
	//   50   97:putfield        #102 <Field String custom>
			mIsARItem = false;
	//   51  100:aload_0         
	//   52  101:iconst_0        
	//   53  102:putfield        #34  <Field boolean mIsARItem>
			if(json.has("trackable"))
	//*  54  105:aload_0         
	//*  55  106:getfield        #68  <Field JSONObject json>
	//*  56  109:ldc1            #104 <String "trackable">
	//*  57  111:invokevirtual   #64  <Method boolean JSONObject.has(String)>
	//*  58  114:ifeq            130
				mIsARItem = json.getBoolean("trackable");
	//   59  117:aload_0         
	//   60  118:aload_0         
	//   61  119:getfield        #68  <Field JSONObject json>
	//   62  122:ldc1            #104 <String "trackable">
	//   63  124:invokevirtual   #107 <Method boolean JSONObject.getBoolean(String)>
	//   64  127:putfield        #34  <Field boolean mIsARItem>
		}
	//*  65  130:iconst_1        
	//*  66  131:ireturn         
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//*  67  132:astore_1        
		{
			((JSONException) (jsonobject)).printStackTrace();
	//   68  133:aload_1         
	//   69  134:invokevirtual   #110 <Method void JSONException.printStackTrace()>
			jsonobject = ((JSONObject) (TAG));
	//   70  137:getstatic       #112 <Field String TAG>
	//   71  140:astore_1        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   72  141:new             #70  <Class StringBuilder>
	//   73  144:dup             
	//   74  145:invokespecial   #71  <Method void StringBuilder()>
	//   75  148:astore_2        
			stringbuilder1.append("Data is not a valid JSON object: ");
	//   76  149:aload_2         
	//   77  150:ldc1            #114 <String "Data is not a valid JSON object: ">
	//   78  152:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   79  155:pop             
			stringbuilder1.append(json.toString());
	//   80  156:aload_2         
	//   81  157:aload_0         
	//   82  158:getfield        #68  <Field JSONObject json>
	//   83  161:invokevirtual   #80  <Method String JSONObject.toString()>
	//   84  164:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   85  167:pop             
			CLog.e(((String) (jsonobject)), stringbuilder1.toString());
	//   86  168:aload_1         
	//   87  169:aload_2         
	//   88  170:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   89  173:invokestatic    #117 <Method void CLog.e(String, String)>
			return false;
	//   90  176:iconst_0        
	//   91  177:ireturn         
		}
		return true;
	}

	int getContentVersion()
	{
		return contentVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field int contentVersion>
	//    2    4:ireturn         
	}

	JSONArray getContentsJSON()
	{
		return contentsJSON;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field JSONArray contentsJSON>
	//    2    4:areturn         
	}

	public String getCustom()
	{
		return custom;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field String custom>
	//    2    4:areturn         
	}

	public String getItemId()
	{
		return itemUUID;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field String itemUUID>
	//    2    4:areturn         
	}

	public String getItemName()
	{
		return itemName;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field String itemName>
	//    2    4:areturn         
	}

	public JSONObject getJson()
	{
		return json;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field JSONObject json>
	//    2    4:areturn         
	}

	String getParentCollectionUUID()
	{
		return mParentCollectionUUID;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String mParentCollectionUUID>
	//    2    4:areturn         
	}

	public String getUrl()
	{
		return url;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field String url>
	//    2    4:areturn         
	}

	public boolean isAR()
	{
		return mIsARItem;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field boolean mIsARItem>
	//    2    4:ireturn         
	}

	static final int ITEM_TYPE_AR = 1;
	static final int ITEM_TYPE_RECOGNITION_ONLY = 0;
	private static String TAG = "CraftARItem";
	private int contentVersion;
	private JSONArray contentsJSON;
	private String custom;
	private String itemName;
	private String itemUUID;
	private JSONObject json;
	private boolean mIsARItem;
	private String mParentCollectionUUID;
	private String url;

	static 
	{
	//    0    0:return          
	}
}
