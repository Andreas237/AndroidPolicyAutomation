// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.models.IInAppMessage;
import com.appboy.models.ResponseError;
import com.appboy.support.AppboyLogger;
import java.util.List;
import org.json.*;

// Referenced classes of package bo.app:
//			fs, bz, dm, bl

public class bs
{

	public bs(JSONObject jsonobject, bl bl)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		Object obj1 = null;
	//    2    4:aconst_null     
	//    3    5:astore          4
		Object obj = ((Object) (jsonobject.optString("error", ((String) (null)))));
	//    4    7:aload_1         
	//    5    8:ldc1            #40  <String "error">
	//    6   10:aconst_null     
	//    7   11:invokevirtual   #46  <Method String JSONObject.optString(String, String)>
	//    8   14:astore_3        
		if(obj != null)
	//*   9   15:aload_3         
	//*  10   16:ifnull          34
			g = new ResponseError(((String) (obj)));
	//   11   19:aload_0         
	//   12   20:new             #48  <Class ResponseError>
	//   13   23:dup             
	//   14   24:aload_3         
	//   15   25:invokespecial   #51  <Method void ResponseError(String)>
	//   16   28:putfield        #53  <Field ResponseError g>
		else
	//*  17   31:goto            39
			g = null;
	//   18   34:aload_0         
	//   19   35:aconst_null     
	//   20   36:putfield        #53  <Field ResponseError g>
		obj = ((Object) (jsonobject.optJSONArray("feed")));
	//   21   39:aload_1         
	//   22   40:ldc1            #55  <String "feed">
	//   23   42:invokevirtual   #59  <Method JSONArray JSONObject.optJSONArray(String)>
	//   24   45:astore_3        
		if(obj != null)
	//*  25   46:aload_3         
	//*  26   47:ifnull          58
			b = ((JSONArray) (obj));
	//   27   50:aload_0         
	//   28   51:aload_3         
	//   29   52:putfield        #61  <Field JSONArray b>
		else
	//*  30   55:goto            63
			b = null;
	//   31   58:aload_0         
	//   32   59:aconst_null     
	//   33   60:putfield        #61  <Field JSONArray b>
		d = fs.a(jsonobject.optJSONArray("triggers"), bl);
	//   34   63:aload_0         
	//   35   64:aload_1         
	//   36   65:ldc1            #63  <String "triggers">
	//   37   67:invokevirtual   #59  <Method JSONArray JSONObject.optJSONArray(String)>
	//   38   70:aload_2         
	//   39   71:invokestatic    #68  <Method List fs.a(JSONArray, bl)>
	//   40   74:putfield        #70  <Field List d>
		JSONObject jsonobject1 = jsonobject.optJSONObject("config");
	//   41   77:aload_1         
	//   42   78:ldc1            #72  <String "config">
	//   43   80:invokevirtual   #76  <Method JSONObject JSONObject.optJSONObject(String)>
	//   44   83:astore          5
		obj = ((Object) (obj1));
	//   45   85:aload           4
	//   46   87:astore_3        
		if(jsonobject1 != null)
	//*  47   88:aload           5
	//*  48   90:ifnull          207
			try
			{
				obj = ((Object) (new bz(jsonobject1)));
	//   49   93:new             #78  <Class bz>
	//   50   96:dup             
	//   51   97:aload           5
	//   52   99:invokespecial   #81  <Method void bz(JSONObject)>
	//   53  102:astore_3        
			}
	//*  54  103:goto            207
	//*  55  106:astore_3        
	//*  56  107:getstatic       #29  <Field String a>
	//*  57  110:astore          6
	//*  58  112:new             #83  <Class StringBuilder>
	//*  59  115:dup             
	//*  60  116:invokespecial   #84  <Method void StringBuilder()>
	//*  61  119:astore          7
	//*  62  121:aload           7
	//*  63  123:ldc1            #86  <String "Encountered Exception processing server config: ">
	//*  64  125:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//*  65  128:pop             
	//*  66  129:aload           7
	//*  67  131:aload           5
	//*  68  133:invokevirtual   #94  <Method String JSONObject.toString()>
	//*  69  136:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//*  70  139:pop             
	//*  71  140:aload           6
	//*  72  142:aload           7
	//*  73  144:invokevirtual   #95  <Method String StringBuilder.toString()>
	//*  74  147:aload_3         
	//*  75  148:invokestatic    #99  <Method int AppboyLogger.w(String, String, Throwable)>
	//*  76  151:pop             
	//*  77  152:aload           4
	//*  78  154:astore_3        
	//*  79  155:goto            207
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  80  158:astore_3        
			{
				String s1 = a;
	//   81  159:getstatic       #29  <Field String a>
	//   82  162:astore          6
				StringBuilder stringbuilder1 = new StringBuilder();
	//   83  164:new             #83  <Class StringBuilder>
	//   84  167:dup             
	//   85  168:invokespecial   #84  <Method void StringBuilder()>
	//   86  171:astore          7
				stringbuilder1.append("Encountered JSONException processing server config: ");
	//   87  173:aload           7
	//   88  175:ldc1            #101 <String "Encountered JSONException processing server config: ">
	//   89  177:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   90  180:pop             
				stringbuilder1.append(jsonobject1.toString());
	//   91  181:aload           7
	//   92  183:aload           5
	//   93  185:invokevirtual   #94  <Method String JSONObject.toString()>
	//   94  188:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   95  191:pop             
				AppboyLogger.w(s1, stringbuilder1.toString(), ((Throwable) (obj)));
	//   96  192:aload           6
	//   97  194:aload           7
	//   98  196:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   99  199:aload_3         
	//  100  200:invokestatic    #99  <Method int AppboyLogger.w(String, String, Throwable)>
	//  101  203:pop             
				obj = ((Object) (obj1));
	//  102  204:aload           4
	//  103  206:astore_3        
			}
			// Misplaced declaration of an exception variable
			catch(Object obj)
			{
				String s = a;
				StringBuilder stringbuilder = new StringBuilder();
				stringbuilder.append("Encountered Exception processing server config: ");
				stringbuilder.append(jsonobject1.toString());
				AppboyLogger.w(s, stringbuilder.toString(), ((Throwable) (obj)));
				obj = ((Object) (obj1));
			}
		e = ((bz) (obj));
	//  104  207:aload_0         
	//  105  208:aload_3         
	//  106  209:putfield        #103 <Field bz e>
		c = fs.a(jsonobject.optJSONObject("templated_message"), bl);
	//  107  212:aload_0         
	//  108  213:aload_1         
	//  109  214:ldc1            #105 <String "templated_message">
	//  110  216:invokevirtual   #76  <Method JSONObject JSONObject.optJSONObject(String)>
	//  111  219:aload_2         
	//  112  220:invokestatic    #108 <Method IInAppMessage fs.a(JSONObject, bl)>
	//  113  223:putfield        #110 <Field IInAppMessage c>
		f = dm.a(jsonobject.optJSONArray("geofences"));
	//  114  226:aload_0         
	//  115  227:aload_1         
	//  116  228:ldc1            #112 <String "geofences">
	//  117  230:invokevirtual   #59  <Method JSONArray JSONObject.optJSONArray(String)>
	//  118  233:invokestatic    #117 <Method List dm.a(JSONArray)>
	//  119  236:putfield        #119 <Field List f>
	//  120  239:return          
	}

	public boolean a()
	{
		return b != null;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field JSONArray b>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean b()
	{
		return c != null;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field IInAppMessage c>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean c()
	{
		return e != null;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field bz e>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean d()
	{
		return d != null;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field List d>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean e()
	{
		return g != null;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ResponseError g>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean f()
	{
		return f != null;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field List f>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public JSONArray g()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field JSONArray b>
	//    2    4:areturn         
	}

	public IInAppMessage h()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field IInAppMessage c>
	//    2    4:areturn         
	}

	public bz i()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field bz e>
	//    2    4:areturn         
	}

	public List j()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field List d>
	//    2    4:areturn         
	}

	public List k()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field List f>
	//    2    4:areturn         
	}

	public ResponseError l()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ResponseError g>
	//    2    4:areturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/bs);
	private final JSONArray b;
	private final IInAppMessage c;
	private final List d;
	private final bz e;
	private final List f;
	private final ResponseError g;

	static 
	{
	//    0    0:ldc1            #2   <Class bs>
	//    1    2:invokestatic    #27  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #29  <Field String a>
	//*   3    8:return          
	}
}
