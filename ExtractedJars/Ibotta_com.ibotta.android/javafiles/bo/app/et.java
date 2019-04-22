// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import org.json.*;

// Referenced classes of package bo.app:
//			eu, er, ek, fl, 
//			bt, gh, fp, ad, 
//			fr

public class et extends eu
	implements er
{

	public et(JSONObject jsonobject, bt bt1)
	{
		super(jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #32  <Method void eu(JSONObject)>
		g = -1L;
	//    3    5:aload_0         
	//    4    6:ldc2w           #33  <Long -1L>
	//    5    9:putfield        #36  <Field long g>
		Object obj = ((Object) (a));
	//    6   12:getstatic       #26  <Field String a>
	//    7   15:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    8   16:new             #38  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #40  <Method void StringBuilder()>
	//   11   23:astore          4
		stringbuilder.append("Parsing templated triggered action with JSON: ");
	//   12   25:aload           4
	//   13   27:ldc1            #42  <String "Parsing templated triggered action with JSON: ">
	//   14   29:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   15   32:pop             
		stringbuilder.append(ek.a(jsonobject));
	//   16   33:aload           4
	//   17   35:aload_1         
	//   18   36:invokestatic    #51  <Method String ek.a(JSONObject)>
	//   19   39:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   20   42:pop             
		AppboyLogger.d(((String) (obj)), stringbuilder.toString());
	//   21   43:aload_3         
	//   22   44:aload           4
	//   23   46:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   24   49:invokestatic    #58  <Method int AppboyLogger.d(String, String)>
	//   25   52:pop             
		jsonobject = jsonobject.getJSONObject("data");
	//   26   53:aload_1         
	//   27   54:ldc1            #60  <String "data">
	//   28   56:invokevirtual   #66  <Method JSONObject JSONObject.getJSONObject(String)>
	//   29   59:astore_1        
		c = jsonobject.getString("trigger_id");
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:ldc1            #68  <String "trigger_id">
	//   33   64:invokevirtual   #72  <Method String JSONObject.getString(String)>
	//   34   67:putfield        #74  <Field String c>
		obj = ((Object) (jsonobject.optJSONArray("prefetch_image_urls")));
	//   35   70:aload_1         
	//   36   71:ldc1            #76  <String "prefetch_image_urls">
	//   37   73:invokevirtual   #80  <Method JSONArray JSONObject.optJSONArray(String)>
	//   38   76:astore_3        
		if(obj != null)
	//*  39   77:aload_3         
	//*  40   78:ifnull          90
			d = ((JSONArray) (obj)).getString(0);
	//   41   81:aload_0         
	//   42   82:aload_3         
	//   43   83:iconst_0        
	//   44   84:invokevirtual   #85  <Method String JSONArray.getString(int)>
	//   45   87:putfield        #87  <Field String d>
		jsonobject = ((JSONObject) (jsonobject.optJSONArray("prefetch_zip_urls")));
	//   46   90:aload_1         
	//   47   91:ldc1            #89  <String "prefetch_zip_urls">
	//   48   93:invokevirtual   #80  <Method JSONArray JSONObject.optJSONArray(String)>
	//   49   96:astore_1        
		if(jsonobject != null)
	//*  50   97:aload_1         
	//*  51   98:ifnull          110
			e = ((JSONArray) (jsonobject)).getString(0);
	//   52  101:aload_0         
	//   53  102:aload_1         
	//   54  103:iconst_0        
	//   55  104:invokevirtual   #85  <Method String JSONArray.getString(int)>
	//   56  107:putfield        #91  <Field String e>
		b = bt1;
	//   57  110:aload_0         
	//   58  111:aload_2         
	//   59  112:putfield        #93  <Field bt b>
	//   60  115:return          
	}

	public void a(Context context, ad ad, fr fr, long l)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #93  <Field bt b>
	//*   2    4:ifnull          73
		{
			g = l;
	//    3    7:aload_0         
	//    4    8:lload           4
	//    5   10:putfield        #36  <Field long g>
			context = ((Context) (a));
	//    6   13:getstatic       #26  <Field String a>
	//    7   16:astore_1        
			ad = ((ad) (new StringBuilder()));
	//    8   17:new             #38  <Class StringBuilder>
	//    9   20:dup             
	//   10   21:invokespecial   #40  <Method void StringBuilder()>
	//   11   24:astore_2        
			((StringBuilder) (ad)).append("Posting templating request after delay of ");
	//   12   25:aload_2         
	//   13   26:ldc1            #96  <String "Posting templating request after delay of ">
	//   14   28:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
			((StringBuilder) (ad)).append(c().d());
	//   16   32:aload_2         
	//   17   33:aload_0         
	//   18   34:invokevirtual   #99  <Method fl c()>
	//   19   37:invokeinterface #104 <Method int fl.d()>
	//   20   42:invokevirtual   #107 <Method StringBuilder StringBuilder.append(int)>
	//   21   45:pop             
			((StringBuilder) (ad)).append(" seconds.");
	//   22   46:aload_2         
	//   23   47:ldc1            #109 <String " seconds.">
	//   24   49:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
			AppboyLogger.d(((String) (context)), ((StringBuilder) (ad)).toString());
	//   26   53:aload_1         
	//   27   54:aload_2         
	//   28   55:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   29   58:invokestatic    #58  <Method int AppboyLogger.d(String, String)>
	//   30   61:pop             
			b.a(this, fr);
	//   31   62:aload_0         
	//   32   63:getfield        #93  <Field bt b>
	//   33   66:aload_0         
	//   34   67:aload_3         
	//   35   68:invokeinterface #114 <Method void bt.a(et, fr)>
		}
	//   36   73:return          
	}

	public void a(String s)
	{
		f = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #117 <Field String f>
	//    3    5:return          
	}

	public gh d()
	{
		if(!StringUtils.isNullOrBlank(d))
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field String d>
	//*   2    4:invokestatic    #124 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   3    7:ifne            25
			return new gh(fp.b, d);
	//    4   10:new             #126 <Class gh>
	//    5   13:dup             
	//    6   14:getstatic       #131 <Field fp fp.b>
	//    7   17:aload_0         
	//    8   18:getfield        #87  <Field String d>
	//    9   21:invokespecial   #134 <Method void gh(fp, String)>
	//   10   24:areturn         
		if(!StringUtils.isNullOrBlank(e))
	//*  11   25:aload_0         
	//*  12   26:getfield        #91  <Field String e>
	//*  13   29:invokestatic    #124 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  14   32:ifne            50
			return new gh(fp.a, e);
	//   15   35:new             #126 <Class gh>
	//   16   38:dup             
	//   17   39:getstatic       #136 <Field fp fp.a>
	//   18   42:aload_0         
	//   19   43:getfield        #91  <Field String e>
	//   20   46:invokespecial   #134 <Method void gh(fp, String)>
	//   21   49:areturn         
		else
			return null;
	//   22   50:aconst_null     
	//   23   51:areturn         
	}

	public JSONObject f()
	{
		JSONException jsonexception;
		JSONObject jsonobject;
		try
		{
			jsonobject = super.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #141 <Method JSONObject eu.f()>
	//    2    4:astore_1        
			jsonobject.put("type", "templated_iam");
	//    3    5:aload_1         
	//    4    6:ldc1            #143 <String "type">
	//    5    8:ldc1            #145 <String "templated_iam">
	//    6   10:invokevirtual   #149 <Method JSONObject JSONObject.put(String, Object)>
	//    7   13:pop             
			JSONObject jsonobject1 = new JSONObject();
	//    8   14:new             #62  <Class JSONObject>
	//    9   17:dup             
	//   10   18:invokespecial   #150 <Method void JSONObject()>
	//   11   21:astore_2        
			jsonobject1.put("trigger_id", ((Object) (c)));
	//   12   22:aload_2         
	//   13   23:ldc1            #68  <String "trigger_id">
	//   14   25:aload_0         
	//   15   26:getfield        #74  <Field String c>
	//   16   29:invokevirtual   #149 <Method JSONObject JSONObject.put(String, Object)>
	//   17   32:pop             
			JSONArray jsonarray = new JSONArray();
	//   18   33:new             #82  <Class JSONArray>
	//   19   36:dup             
	//   20   37:invokespecial   #151 <Method void JSONArray()>
	//   21   40:astore_3        
			if(!StringUtils.isNullOrBlank(d))
	//*  22   41:aload_0         
	//*  23   42:getfield        #87  <Field String d>
	//*  24   45:invokestatic    #124 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  25   48:ifne            68
			{
				jsonarray.put(((Object) (d)));
	//   26   51:aload_3         
	//   27   52:aload_0         
	//   28   53:getfield        #87  <Field String d>
	//   29   56:invokevirtual   #154 <Method JSONArray JSONArray.put(Object)>
	//   30   59:pop             
				jsonobject1.put("prefetch_image_urls", ((Object) (jsonarray)));
	//   31   60:aload_2         
	//   32   61:ldc1            #76  <String "prefetch_image_urls">
	//   33   63:aload_3         
	//   34   64:invokevirtual   #149 <Method JSONObject JSONObject.put(String, Object)>
	//   35   67:pop             
			}
			jsonarray = new JSONArray();
	//   36   68:new             #82  <Class JSONArray>
	//   37   71:dup             
	//   38   72:invokespecial   #151 <Method void JSONArray()>
	//   39   75:astore_3        
			if(!StringUtils.isNullOrBlank(e))
	//*  40   76:aload_0         
	//*  41   77:getfield        #91  <Field String e>
	//*  42   80:invokestatic    #124 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  43   83:ifne            103
			{
				jsonarray.put(((Object) (e)));
	//   44   86:aload_3         
	//   45   87:aload_0         
	//   46   88:getfield        #91  <Field String e>
	//   47   91:invokevirtual   #154 <Method JSONArray JSONArray.put(Object)>
	//   48   94:pop             
				jsonobject1.put("prefetch_zip_urls", ((Object) (jsonarray)));
	//   49   95:aload_2         
	//   50   96:ldc1            #89  <String "prefetch_zip_urls">
	//   51   98:aload_3         
	//   52   99:invokevirtual   #149 <Method JSONObject JSONObject.put(String, Object)>
	//   53  102:pop             
			}
			jsonobject.put("data", ((Object) (jsonobject1)));
	//   54  103:aload_1         
	//   55  104:ldc1            #60  <String "data">
	//   56  106:aload_2         
	//   57  107:invokevirtual   #149 <Method JSONObject JSONObject.put(String, Object)>
	//   58  110:pop             
		}
	//*  59  111:aload_1         
	//*  60  112:areturn         
	//*  61  113:aconst_null     
	//*  62  114:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONException jsonexception)
		{
			return null;
		}
		return jsonobject;
	//*  63  115:astore_1        
	//*  64  116:goto            113
	}

	public Object forJsonPut()
	{
		return ((Object) (f()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #157 <Method JSONObject f()>
	//    2    4:areturn         
	}

	public long g()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field long g>
	//    2    4:lreturn         
	}

	public String h()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field String c>
	//    2    4:areturn         
	}

	public String i()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field String f>
	//    2    4:areturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/et);
	private bt b;
	private String c;
	private String d;
	private String e;
	private String f;
	private long g;

	static 
	{
	//    0    0:ldc1            #2   <Class et>
	//    1    2:invokestatic    #24  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #26  <Field String a>
	//*   3    8:return          
	}
}
