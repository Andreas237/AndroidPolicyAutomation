// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.models;

import com.appboy.support.AppboyLogger;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appboy.models:
//			IPutIntoJson

public class GcmMessage
	implements IPutIntoJson
{

	public GcmMessage(String s, String s1, Map map, String s2, String s3, Integer integer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		b = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #35  <Field String b>
		c = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #37  <Field String c>
		if(map != null)
	//*   8   14:aload_3         
	//*   9   15:ifnull          26
			d = map;
	//   10   18:aload_0         
	//   11   19:aload_3         
	//   12   20:putfield        #39  <Field Map d>
		else
	//*  13   23:goto            37
			d = ((Map) (new HashMap()));
	//   14   26:aload_0         
	//   15   27:new             #41  <Class HashMap>
	//   16   30:dup             
	//   17   31:invokespecial   #42  <Method void HashMap()>
	//   18   34:putfield        #39  <Field Map d>
		e = s2;
	//   19   37:aload_0         
	//   20   38:aload           4
	//   21   40:putfield        #44  <Field String e>
		f = s3;
	//   22   43:aload_0         
	//   23   44:aload           5
	//   24   46:putfield        #46  <Field String f>
		g = integer;
	//   25   49:aload_0         
	//   26   50:aload           6
	//   27   52:putfield        #48  <Field Integer g>
	//   28   55:return          
	}

	public volatile Object forJsonPut()
	{
		return ((Object) (forJsonPut()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #55  <Method JSONObject forJsonPut()>
	//    2    4:areturn         
	}

	public JSONObject forJsonPut()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #59  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void JSONObject()>
	//    3    7:astore_1        
		jsonobject.put("title", ((Object) (b)));
	//    4    8:aload_1         
	//    5    9:ldc1            #62  <String "title">
	//    6   11:aload_0         
	//    7   12:getfield        #35  <Field String b>
	//    8   15:invokevirtual   #66  <Method JSONObject JSONObject.put(String, Object)>
	//    9   18:pop             
		jsonobject.put("content", ((Object) (c)));
	//   10   19:aload_1         
	//   11   20:ldc1            #68  <String "content">
	//   12   22:aload_0         
	//   13   23:getfield        #37  <Field String c>
	//   14   26:invokevirtual   #66  <Method JSONObject JSONObject.put(String, Object)>
	//   15   29:pop             
		jsonobject.put("extras", ((Object) (new JSONObject(d))));
	//   16   30:aload_1         
	//   17   31:ldc1            #70  <String "extras">
	//   18   33:new             #59  <Class JSONObject>
	//   19   36:dup             
	//   20   37:aload_0         
	//   21   38:getfield        #39  <Field Map d>
	//   22   41:invokespecial   #73  <Method void JSONObject(Map)>
	//   23   44:invokevirtual   #66  <Method JSONObject JSONObject.put(String, Object)>
	//   24   47:pop             
		if(e != null)
	//*  25   48:aload_0         
	//*  26   49:getfield        #44  <Field String e>
	//*  27   52:ifnull          66
			jsonobject.put("collapse_key", ((Object) (e)));
	//   28   55:aload_1         
	//   29   56:ldc1            #75  <String "collapse_key">
	//   30   58:aload_0         
	//   31   59:getfield        #44  <Field String e>
	//   32   62:invokevirtual   #66  <Method JSONObject JSONObject.put(String, Object)>
	//   33   65:pop             
		if(f != null)
	//*  34   66:aload_0         
	//*  35   67:getfield        #46  <Field String f>
	//*  36   70:ifnull          84
			jsonobject.put("campaign_id", ((Object) (f)));
	//   37   73:aload_1         
	//   38   74:ldc1            #77  <String "campaign_id">
	//   39   76:aload_0         
	//   40   77:getfield        #46  <Field String f>
	//   41   80:invokevirtual   #66  <Method JSONObject JSONObject.put(String, Object)>
	//   42   83:pop             
		if(g == null)
			break MISSING_BLOCK_LABEL_115;
	//   43   84:aload_0         
	//   44   85:getfield        #48  <Field Integer g>
	//   45   88:ifnull          115
		jsonobject.put("notification_id", ((Object) (g)));
	//   46   91:aload_1         
	//   47   92:ldc1            #79  <String "notification_id">
	//   48   94:aload_0         
	//   49   95:getfield        #48  <Field Integer g>
	//   50   98:invokevirtual   #66  <Method JSONObject JSONObject.put(String, Object)>
	//   51  101:pop             
		return jsonobject;
	//   52  102:aload_1         
	//   53  103:areturn         
		JSONException jsonexception;
		jsonexception;
	//   54  104:astore_2        
		AppboyLogger.e(a, "Caught exception creating gcm message Json.", ((Throwable) (jsonexception)));
	//   55  105:getstatic       #28  <Field String a>
	//   56  108:ldc1            #81  <String "Caught exception creating gcm message Json.">
	//   57  110:aload_2         
	//   58  111:invokestatic    #84  <Method int AppboyLogger.e(String, String, Throwable)>
	//   59  114:pop             
		return jsonobject;
	//   60  115:aload_1         
	//   61  116:areturn         
	}

	public String getCampaignId()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String f>
	//    2    4:areturn         
	}

	public String getContent()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String c>
	//    2    4:areturn         
	}

	public Map getExtras()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Map d>
	//    2    4:areturn         
	}

	public Integer getNotificationId()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Integer g>
	//    2    4:areturn         
	}

	public String getTitle()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String b>
	//    2    4:areturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(com/appboy/models/GcmMessage);
	private final String b;
	private final String c;
	private final Map d;
	private final String e;
	private final String f;
	private final Integer g;

	static 
	{
	//    0    0:ldc1            #2   <Class GcmMessage>
	//    1    2:invokestatic    #26  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #28  <Field String a>
	//*   3    8:return          
	}
}
