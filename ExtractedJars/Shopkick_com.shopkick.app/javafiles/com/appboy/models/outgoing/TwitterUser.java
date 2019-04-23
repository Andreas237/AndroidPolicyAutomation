// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.models.outgoing;

import com.appboy.models.IPutIntoJson;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class TwitterUser
	implements IPutIntoJson
{

	public TwitterUser(Integer integer, String s, String s1, String s2, Integer integer1, Integer integer2, Integer integer3, 
			String s3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		b = integer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #35  <Field Integer b>
		c = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #37  <Field String c>
		d = s1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #39  <Field String d>
		e = s2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #41  <Field String e>
		f = integer1;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #43  <Field Integer f>
		g = integer2;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #45  <Field Integer g>
		h = integer3;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #47  <Field Integer h>
		i = s3;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #49  <Field String i>
	//   26   49:return          
	}

	public volatile Object forJsonPut()
	{
		return ((Object) (forJsonPut()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #54  <Method JSONObject forJsonPut()>
	//    2    4:areturn         
	}

	public JSONObject forJsonPut()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #58  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #59  <Method void JSONObject()>
	//    3    7:astore_1        
		try
		{
			if(!StringUtils.isNullOrBlank(c))
	//*   4    8:aload_0         
	//*   5    9:getfield        #37  <Field String c>
	//*   6   12:invokestatic    #65  <Method boolean StringUtils.isNullOrBlank(String)>
	//*   7   15:ifne            29
				jsonobject.put("screen_name", ((Object) (c)));
	//    8   18:aload_1         
	//    9   19:ldc1            #67  <String "screen_name">
	//   10   21:aload_0         
	//   11   22:getfield        #37  <Field String c>
	//   12   25:invokevirtual   #71  <Method JSONObject JSONObject.put(String, Object)>
	//   13   28:pop             
			if(!StringUtils.isNullOrBlank(d))
	//*  14   29:aload_0         
	//*  15   30:getfield        #39  <Field String d>
	//*  16   33:invokestatic    #65  <Method boolean StringUtils.isNullOrBlank(String)>
	//*  17   36:ifne            50
				jsonobject.put("name", ((Object) (d)));
	//   18   39:aload_1         
	//   19   40:ldc1            #73  <String "name">
	//   20   42:aload_0         
	//   21   43:getfield        #39  <Field String d>
	//   22   46:invokevirtual   #71  <Method JSONObject JSONObject.put(String, Object)>
	//   23   49:pop             
			if(!StringUtils.isNullOrBlank(e))
	//*  24   50:aload_0         
	//*  25   51:getfield        #41  <Field String e>
	//*  26   54:invokestatic    #65  <Method boolean StringUtils.isNullOrBlank(String)>
	//*  27   57:ifne            71
				jsonobject.put("description", ((Object) (e)));
	//   28   60:aload_1         
	//   29   61:ldc1            #75  <String "description">
	//   30   63:aload_0         
	//   31   64:getfield        #41  <Field String e>
	//   32   67:invokevirtual   #71  <Method JSONObject JSONObject.put(String, Object)>
	//   33   70:pop             
			if(!StringUtils.isNullOrBlank(i))
	//*  34   71:aload_0         
	//*  35   72:getfield        #49  <Field String i>
	//*  36   75:invokestatic    #65  <Method boolean StringUtils.isNullOrBlank(String)>
	//*  37   78:ifne            92
				jsonobject.put("profile_image_url", ((Object) (i)));
	//   38   81:aload_1         
	//   39   82:ldc1            #77  <String "profile_image_url">
	//   40   84:aload_0         
	//   41   85:getfield        #49  <Field String i>
	//   42   88:invokevirtual   #71  <Method JSONObject JSONObject.put(String, Object)>
	//   43   91:pop             
			jsonobject.put("id", ((Object) (b)));
	//   44   92:aload_1         
	//   45   93:ldc1            #79  <String "id">
	//   46   95:aload_0         
	//   47   96:getfield        #35  <Field Integer b>
	//   48   99:invokevirtual   #71  <Method JSONObject JSONObject.put(String, Object)>
	//   49  102:pop             
			jsonobject.put("followers_count", ((Object) (f)));
	//   50  103:aload_1         
	//   51  104:ldc1            #81  <String "followers_count">
	//   52  106:aload_0         
	//   53  107:getfield        #43  <Field Integer f>
	//   54  110:invokevirtual   #71  <Method JSONObject JSONObject.put(String, Object)>
	//   55  113:pop             
			jsonobject.put("friends_count", ((Object) (g)));
	//   56  114:aload_1         
	//   57  115:ldc1            #83  <String "friends_count">
	//   58  117:aload_0         
	//   59  118:getfield        #45  <Field Integer g>
	//   60  121:invokevirtual   #71  <Method JSONObject JSONObject.put(String, Object)>
	//   61  124:pop             
			jsonobject.put("statuses_count", ((Object) (h)));
	//   62  125:aload_1         
	//   63  126:ldc1            #85  <String "statuses_count">
	//   64  128:aload_0         
	//   65  129:getfield        #47  <Field Integer h>
	//   66  132:invokevirtual   #71  <Method JSONObject JSONObject.put(String, Object)>
	//   67  135:pop             
		}
	//*  68  136:aload_1         
	//*  69  137:areturn         
		catch(JSONException jsonexception)
	//*  70  138:astore_2        
		{
			AppboyLogger.e(a, "Caught exception creating twitter user Json.", ((Throwable) (jsonexception)));
	//   71  139:getstatic       #28  <Field String a>
	//   72  142:ldc1            #87  <String "Caught exception creating twitter user Json.">
	//   73  144:aload_2         
	//   74  145:invokestatic    #90  <Method int AppboyLogger.e(String, String, Throwable)>
	//   75  148:pop             
			return jsonobject;
	//   76  149:aload_1         
	//   77  150:areturn         
		}
		return jsonobject;
	}

	private static final String a = AppboyLogger.getAppboyLogTag(com/appboy/models/outgoing/TwitterUser);
	private final Integer b;
	private final String c;
	private final String d;
	private final String e;
	private final Integer f;
	private final Integer g;
	private final Integer h;
	private final String i;

	static 
	{
	//    0    0:ldc1            #2   <Class TwitterUser>
	//    1    2:invokestatic    #26  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #28  <Field String a>
	//*   3    8:return          
	}
}
