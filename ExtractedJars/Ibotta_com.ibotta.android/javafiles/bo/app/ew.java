// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			fg, fq, fr

public final class ew extends fg
{

	public ew(JSONObject jsonobject)
	{
		super(jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void fg(JSONObject)>
		c = jsonobject.getJSONObject("data").getString("event_name");
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #24  <String "data">
	//    6    9:invokevirtual   #30  <Method JSONObject JSONObject.getJSONObject(String)>
	//    7   12:ldc1            #32  <String "event_name">
	//    8   14:invokevirtual   #36  <Method String JSONObject.getString(String)>
	//    9   17:putfield        #38  <Field String c>
	//   10   20:return          
	}

	public JSONObject a()
	{
		JSONObject jsonobject = super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method JSONObject fg.a()>
	//    2    4:astore_1        
		try
		{
			jsonobject.put("type", "custom_event_property");
	//    3    5:aload_1         
	//    4    6:ldc1            #46  <String "type">
	//    5    8:ldc1            #48  <String "custom_event_property">
	//    6   10:invokevirtual   #52  <Method JSONObject JSONObject.put(String, Object)>
	//    7   13:pop             
			JSONObject jsonobject1 = jsonobject.getJSONObject("data");
	//    8   14:aload_1         
	//    9   15:ldc1            #24  <String "data">
	//   10   17:invokevirtual   #30  <Method JSONObject JSONObject.getJSONObject(String)>
	//   11   20:astore_2        
			jsonobject1.put("event_name", ((Object) (c)));
	//   12   21:aload_2         
	//   13   22:ldc1            #32  <String "event_name">
	//   14   24:aload_0         
	//   15   25:getfield        #38  <Field String c>
	//   16   28:invokevirtual   #52  <Method JSONObject JSONObject.put(String, Object)>
	//   17   31:pop             
			jsonobject.put("data", ((Object) (jsonobject1)));
	//   18   32:aload_1         
	//   19   33:ldc1            #24  <String "data">
	//   20   35:aload_2         
	//   21   36:invokevirtual   #52  <Method JSONObject JSONObject.put(String, Object)>
	//   22   39:pop             
		}
	//*  23   40:aload_1         
	//*  24   41:areturn         
		catch(JSONException jsonexception)
	//*  25   42:astore_2        
		{
			AppboyLogger.e(b, "Caught exception creating CustomEventWithPropertiesTriggerCondition Json.", ((Throwable) (jsonexception)));
	//   26   43:getstatic       #17  <Field String b>
	//   27   46:ldc1            #54  <String "Caught exception creating CustomEventWithPropertiesTriggerCondition Json.">
	//   28   48:aload_2         
	//   29   49:invokestatic    #58  <Method int AppboyLogger.e(String, String, Throwable)>
	//   30   52:pop             
			return jsonobject;
	//   31   53:aload_1         
	//   32   54:areturn         
		}
		return jsonobject;
	}

	public boolean a(fr fr)
	{
		if(fr instanceof fq)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #61  <Class fq>
	//*   2    4:ifeq            42
		{
			fq fq1 = (fq)fr;
	//    3    7:aload_1         
	//    4    8:checkcast       #61  <Class fq>
	//    5   11:astore_2        
			if(!StringUtils.isNullOrBlank(fq1.a()) && fq1.a().equals(((Object) (c))))
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #64  <Method String fq.a()>
	//*   8   16:invokestatic    #70  <Method boolean StringUtils.isNullOrBlank(String)>
	//*   9   19:ifne            42
	//*  10   22:aload_2         
	//*  11   23:invokevirtual   #64  <Method String fq.a()>
	//*  12   26:aload_0         
	//*  13   27:getfield        #38  <Field String c>
	//*  14   30:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  15   33:ifeq            42
				return super.a(fr);
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:invokespecial   #78  <Method boolean fg.a(fr)>
	//   19   41:ireturn         
		}
		return false;
	//   20   42:iconst_0        
	//   21   43:ireturn         
	}

	public Object forJsonPut()
	{
		return ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #81  <Method JSONObject a()>
	//    2    4:areturn         
	}

	private static final String b = AppboyLogger.getAppboyLogTag(bo/app/ew);
	private String c;

	static 
	{
	//    0    0:ldc1            #2   <Class ew>
	//    1    2:invokestatic    #15  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #17  <Field String b>
	//*   3    8:return          
	}
}
