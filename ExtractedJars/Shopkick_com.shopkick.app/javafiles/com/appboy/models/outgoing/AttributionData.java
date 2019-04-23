// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.models.outgoing;

import com.appboy.models.IPutIntoJson;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class AttributionData
	implements IPutIntoJson
{

	public AttributionData(String s, String s1, String s2, String s3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		b = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field String b>
		c = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #32  <Field String c>
		d = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #34  <Field String d>
		e = s3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #36  <Field String e>
	//   14   25:return          
	}

	public volatile Object forJsonPut()
	{
		return ((Object) (forJsonPut()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method JSONObject forJsonPut()>
	//    2    4:areturn         
	}

	public JSONObject forJsonPut()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #45  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #46  <Method void JSONObject()>
	//    3    7:astore_1        
		if(!StringUtils.isNullOrBlank(b))
	//*   4    8:aload_0         
	//*   5    9:getfield        #30  <Field String b>
	//*   6   12:invokestatic    #52  <Method boolean StringUtils.isNullOrBlank(String)>
	//*   7   15:ifne            29
			jsonobject.put("source", ((Object) (b)));
	//    8   18:aload_1         
	//    9   19:ldc1            #54  <String "source">
	//   10   21:aload_0         
	//   11   22:getfield        #30  <Field String b>
	//   12   25:invokevirtual   #58  <Method JSONObject JSONObject.put(String, Object)>
	//   13   28:pop             
		if(!StringUtils.isNullOrBlank(c))
	//*  14   29:aload_0         
	//*  15   30:getfield        #32  <Field String c>
	//*  16   33:invokestatic    #52  <Method boolean StringUtils.isNullOrBlank(String)>
	//*  17   36:ifne            50
			jsonobject.put("campaign", ((Object) (c)));
	//   18   39:aload_1         
	//   19   40:ldc1            #60  <String "campaign">
	//   20   42:aload_0         
	//   21   43:getfield        #32  <Field String c>
	//   22   46:invokevirtual   #58  <Method JSONObject JSONObject.put(String, Object)>
	//   23   49:pop             
		if(!StringUtils.isNullOrBlank(d))
	//*  24   50:aload_0         
	//*  25   51:getfield        #34  <Field String d>
	//*  26   54:invokestatic    #52  <Method boolean StringUtils.isNullOrBlank(String)>
	//*  27   57:ifne            71
			jsonobject.put("adgroup", ((Object) (d)));
	//   28   60:aload_1         
	//   29   61:ldc1            #62  <String "adgroup">
	//   30   63:aload_0         
	//   31   64:getfield        #34  <Field String d>
	//   32   67:invokevirtual   #58  <Method JSONObject JSONObject.put(String, Object)>
	//   33   70:pop             
		if(StringUtils.isNullOrBlank(e))
			break MISSING_BLOCK_LABEL_105;
	//   34   71:aload_0         
	//   35   72:getfield        #36  <Field String e>
	//   36   75:invokestatic    #52  <Method boolean StringUtils.isNullOrBlank(String)>
	//   37   78:ifne            105
		jsonobject.put("ad", ((Object) (e)));
	//   38   81:aload_1         
	//   39   82:ldc1            #64  <String "ad">
	//   40   84:aload_0         
	//   41   85:getfield        #36  <Field String e>
	//   42   88:invokevirtual   #58  <Method JSONObject JSONObject.put(String, Object)>
	//   43   91:pop             
		return jsonobject;
	//   44   92:aload_1         
	//   45   93:areturn         
		JSONException jsonexception;
		jsonexception;
	//   46   94:astore_2        
		AppboyLogger.e(a, "Caught exception creating AttributionData Json.", ((Throwable) (jsonexception)));
	//   47   95:getstatic       #23  <Field String a>
	//   48   98:ldc1            #66  <String "Caught exception creating AttributionData Json.">
	//   49  100:aload_2         
	//   50  101:invokestatic    #69  <Method int AppboyLogger.e(String, String, Throwable)>
	//   51  104:pop             
		return jsonobject;
	//   52  105:aload_1         
	//   53  106:areturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(com/appboy/models/outgoing/AttributionData);
	private final String b;
	private final String c;
	private final String d;
	private final String e;

	static 
	{
	//    0    0:ldc1            #2   <Class AttributionData>
	//    1    2:invokestatic    #21  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #23  <Field String a>
	//*   3    8:return          
	}
}
