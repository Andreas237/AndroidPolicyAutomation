// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			eq, ff, fb

public final class en extends eq
{

	public en(JSONObject jsonobject)
	{
		super(jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void eq(JSONObject)>
		c = jsonobject.getJSONObject("data").getString("product_id");
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #24  <String "data">
	//    6    9:invokevirtual   #30  <Method JSONObject JSONObject.getJSONObject(String)>
	//    7   12:ldc1            #32  <String "product_id">
	//    8   14:invokevirtual   #36  <Method String JSONObject.getString(String)>
	//    9   17:putfield        #38  <Field String c>
	//   10   20:return          
	}

	public JSONObject a()
	{
		JSONObject jsonobject = super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method JSONObject eq.a()>
	//    2    4:astore_1        
		try
		{
			jsonobject.put("type", "purchase_property");
	//    3    5:aload_1         
	//    4    6:ldc1            #46  <String "type">
	//    5    8:ldc1            #48  <String "purchase_property">
	//    6   10:invokevirtual   #52  <Method JSONObject JSONObject.put(String, Object)>
	//    7   13:pop             
			JSONObject jsonobject1 = jsonobject.getJSONObject("data");
	//    8   14:aload_1         
	//    9   15:ldc1            #24  <String "data">
	//   10   17:invokevirtual   #30  <Method JSONObject JSONObject.getJSONObject(String)>
	//   11   20:astore_2        
			jsonobject1.put("product_id", ((Object) (c)));
	//   12   21:aload_2         
	//   13   22:ldc1            #32  <String "product_id">
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
			AppboyLogger.e(b, "Caught exception creating Json.", ((Throwable) (jsonexception)));
	//   26   43:getstatic       #17  <Field String b>
	//   27   46:ldc1            #54  <String "Caught exception creating Json.">
	//   28   48:aload_2         
	//   29   49:invokestatic    #58  <Method int AppboyLogger.e(String, String, Throwable)>
	//   30   52:pop             
			return jsonobject;
	//   31   53:aload_1         
	//   32   54:areturn         
		}
		return jsonobject;
	}

	public boolean a(fb fb)
	{
		if(fb instanceof ff)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #61  <Class ff>
	//*   2    4:ifeq            54
		{
			if(StringUtils.isNullOrBlank(c))
	//*   3    7:aload_0         
	//*   4    8:getfield        #38  <Field String c>
	//*   5   11:invokestatic    #67  <Method boolean StringUtils.isNullOrBlank(String)>
	//*   6   14:ifeq            19
				return false;
	//    7   17:iconst_0        
	//    8   18:ireturn         
			ff ff1 = (ff)fb;
	//    9   19:aload_1         
	//   10   20:checkcast       #61  <Class ff>
	//   11   23:astore_2        
			if(!StringUtils.isNullOrBlank(ff1.a()) && ff1.a().equals(((Object) (c))))
	//*  12   24:aload_2         
	//*  13   25:invokevirtual   #70  <Method String ff.a()>
	//*  14   28:invokestatic    #67  <Method boolean StringUtils.isNullOrBlank(String)>
	//*  15   31:ifne            54
	//*  16   34:aload_2         
	//*  17   35:invokevirtual   #70  <Method String ff.a()>
	//*  18   38:aload_0         
	//*  19   39:getfield        #38  <Field String c>
	//*  20   42:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  21   45:ifeq            54
				return super.a(fb);
	//   22   48:aload_0         
	//   23   49:aload_1         
	//   24   50:invokespecial   #78  <Method boolean eq.a(fb)>
	//   25   53:ireturn         
		}
		return false;
	//   26   54:iconst_0        
	//   27   55:ireturn         
	}

	public Object forJsonPut()
	{
		return ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #81  <Method JSONObject a()>
	//    2    4:areturn         
	}

	private static final String b = AppboyLogger.getAppboyLogTag(bo/app/en);
	private String c;

	static 
	{
	//    0    0:ldc1            #2   <Class en>
	//    1    2:invokestatic    #15  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #17  <Field String b>
	//*   3    8:return          
	}
}
