// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.net.Uri;
import com.appboy.Appboy;
import com.appboy.enums.SdkFlavor;
import com.appboy.models.ResponseError;
import com.appboy.support.AppboyLogger;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			cs, bw, co, ag, 
//			aa, ad, ce, ch, 
//			bt, dt, cg

public abstract class ci extends cs
	implements bw, co
{

	protected ci(Uri uri, Map map)
	{
		super(uri, map);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #41  <Method void cs(Uri, Map)>
	//    4    6:return          
	}

	public Uri a()
	{
		return Appboy.getAppboyApiEndpoint(a);
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Uri a>
	//    2    4:invokestatic    #54  <Method Uri Appboy.getAppboyApiEndpoint(Uri)>
	//    3    7:areturn         
	}

	public void a(long l1)
	{
		c = Long.valueOf(l1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #61  <Method Long Long.valueOf(long)>
	//    3    5:putfield        #63  <Field Long c>
	//    4    8:return          
	}

	public void a(aa aa1)
	{
		Object obj = ((Object) (j));
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field ch j>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          25
			aa1.a(((Object) (new ag(((ch) (obj))))), bo/app/ag);
	//    5    9:aload_1         
	//    6   10:new             #68  <Class ag>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:invokespecial   #71  <Method void ag(ch)>
	//   10   18:ldc1            #68  <Class ag>
	//   11   20:invokeinterface #76  <Method void aa.a(Object, Class)>
		obj = ((Object) (g));
	//   12   25:aload_0         
	//   13   26:getfield        #78  <Field ce g>
	//   14   29:astore_2        
		if(obj != null)
	//*  15   30:aload_2         
	//*  16   31:ifnull          50
			aa1.a(((Object) (new ad(((ce) (obj))))), bo/app/ad);
	//   17   34:aload_1         
	//   18   35:new             #80  <Class ad>
	//   19   38:dup             
	//   20   39:aload_2         
	//   21   40:invokespecial   #83  <Method void ad(ce)>
	//   22   43:ldc1            #80  <Class ad>
	//   23   45:invokeinterface #76  <Method void aa.a(Object, Class)>
	//   24   50:return          
	}

	public void a(aa aa1, ResponseError responseerror)
	{
		aa1 = ((aa) (b));
	//    0    0:getstatic       #36  <Field String b>
	//    1    3:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #86  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #88  <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("Error occurred while executing Braze request: ");
	//    6   12:aload_3         
	//    7   13:ldc1            #90  <String "Error occurred while executing Braze request: ">
	//    8   15:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(responseerror.getMessage());
	//   10   19:aload_3         
	//   11   20:aload_2         
	//   12   21:invokevirtual   #100 <Method String ResponseError.getMessage()>
	//   13   24:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
		AppboyLogger.e(((String) (aa1)), stringbuilder.toString());
	//   15   28:aload_1         
	//   16   29:aload_3         
	//   17   30:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   18   33:invokestatic    #106 <Method int AppboyLogger.e(String, String)>
	//   19   36:pop             
	//   20   37:return          
	}

	public void a(bt bt1)
	{
		l = bt1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #109 <Field bt l>
	//    3    5:return          
	}

	public void a(ce ce1)
	{
		g = ce1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #78  <Field ce g>
	//    3    5:return          
	}

	public void a(cg cg)
	{
		k = cg;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #112 <Field cg k>
	//    3    5:return          
	}

	public void a(ch ch1)
	{
		j = ch1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #66  <Field ch j>
	//    3    5:return          
	}

	public void a(SdkFlavor sdkflavor)
	{
		i = sdkflavor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #115 <Field SdkFlavor i>
	//    3    5:return          
	}

	public void a(String s)
	{
		d = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #118 <Field String d>
	//    3    5:return          
	}

	public void a(Map map)
	{
		map.put("X-Braze-Api-Key", ((Object) (e)));
	//    0    0:aload_1         
	//    1    1:ldc1            #121 <String "X-Braze-Api-Key">
	//    2    3:aload_0         
	//    3    4:getfield        #123 <Field String e>
	//    4    7:invokeinterface #129 <Method Object Map.put(Object, Object)>
	//    5   12:pop             
	//    6   13:return          
	}

	public void b(String s)
	{
		e = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #123 <Field String e>
	//    3    5:return          
	}

	public boolean b()
	{
		Object obj = ((Object) (new ArrayList()));
	//    0    0:new             #133 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #134 <Method void ArrayList()>
	//    3    7:astore_1        
		((List) (obj)).add(((Object) (g)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #78  <Field ce g>
	//    7   13:invokeinterface #140 <Method boolean List.add(Object)>
	//    8   18:pop             
		((List) (obj)).add(((Object) (j)));
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:getfield        #66  <Field ch j>
	//   12   24:invokeinterface #140 <Method boolean List.add(Object)>
	//   13   29:pop             
		((List) (obj)).add(((Object) (l)));
	//   14   30:aload_1         
	//   15   31:aload_0         
	//   16   32:getfield        #109 <Field bt l>
	//   17   35:invokeinterface #140 <Method boolean List.add(Object)>
	//   18   40:pop             
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
	//*  19   41:aload_1         
	//*  20   42:invokeinterface #144 <Method Iterator List.iterator()>
	//*  21   47:astore_1        
	//*  22   48:aload_1         
	//*  23   49:invokeinterface #149 <Method boolean Iterator.hasNext()>
	//*  24   54:ifeq            82
		{
			bw bw1 = (bw)((Iterator) (obj)).next();
	//   25   57:aload_1         
	//   26   58:invokeinterface #153 <Method Object Iterator.next()>
	//   27   63:checkcast       #6   <Class bw>
	//   28   66:astore_2        
			if(bw1 != null && !bw1.b())
	//*  29   67:aload_2         
	//*  30   68:ifnull          48
	//*  31   71:aload_2         
	//*  32   72:invokeinterface #155 <Method boolean bw.b()>
	//*  33   77:ifne            48
				return false;
	//   34   80:iconst_0        
	//   35   81:ireturn         
		}

		return true;
	//   36   82:iconst_1        
	//   37   83:ireturn         
	}

	public ce c()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field ce g>
	//    2    4:areturn         
	}

	public void c(String s)
	{
		f = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #158 <Field String f>
	//    3    5:return          
	}

	public ch d()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field ch j>
	//    2    4:areturn         
	}

	public void d(String s)
	{
		h = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #161 <Field String h>
	//    3    5:return          
	}

	public cg e()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field cg k>
	//    2    4:areturn         
	}

	public bt f()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field bt l>
	//    2    4:areturn         
	}

	public JSONObject g()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #168 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #169 <Method void JSONObject()>
	//    3    7:astore_1        
		try
		{
			if(h != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #161 <Field String h>
	//*   6   12:ifnull          26
				jsonobject.put("app_version", ((Object) (h)));
	//    7   15:aload_1         
	//    8   16:ldc1            #171 <String "app_version">
	//    9   18:aload_0         
	//   10   19:getfield        #161 <Field String h>
	//   11   22:invokevirtual   #174 <Method JSONObject JSONObject.put(String, Object)>
	//   12   25:pop             
			if(d != null)
	//*  13   26:aload_0         
	//*  14   27:getfield        #118 <Field String d>
	//*  15   30:ifnull          44
				jsonobject.put("device_id", ((Object) (d)));
	//   16   33:aload_1         
	//   17   34:ldc1            #176 <String "device_id">
	//   18   36:aload_0         
	//   19   37:getfield        #118 <Field String d>
	//   20   40:invokevirtual   #174 <Method JSONObject JSONObject.put(String, Object)>
	//   21   43:pop             
			if(c != null)
	//*  22   44:aload_0         
	//*  23   45:getfield        #63  <Field Long c>
	//*  24   48:ifnull          62
				jsonobject.put("time", ((Object) (c)));
	//   25   51:aload_1         
	//   26   52:ldc1            #178 <String "time">
	//   27   54:aload_0         
	//   28   55:getfield        #63  <Field Long c>
	//   29   58:invokevirtual   #174 <Method JSONObject JSONObject.put(String, Object)>
	//   30   61:pop             
			if(e != null)
	//*  31   62:aload_0         
	//*  32   63:getfield        #123 <Field String e>
	//*  33   66:ifnull          80
				jsonobject.put("api_key", ((Object) (e)));
	//   34   69:aload_1         
	//   35   70:ldc1            #180 <String "api_key">
	//   36   72:aload_0         
	//   37   73:getfield        #123 <Field String e>
	//   38   76:invokevirtual   #174 <Method JSONObject JSONObject.put(String, Object)>
	//   39   79:pop             
			if(f != null)
	//*  40   80:aload_0         
	//*  41   81:getfield        #158 <Field String f>
	//*  42   84:ifnull          98
				jsonobject.put("sdk_version", ((Object) (f)));
	//   43   87:aload_1         
	//   44   88:ldc1            #182 <String "sdk_version">
	//   45   90:aload_0         
	//   46   91:getfield        #158 <Field String f>
	//   47   94:invokevirtual   #174 <Method JSONObject JSONObject.put(String, Object)>
	//   48   97:pop             
			if(g != null && !g.b())
	//*  49   98:aload_0         
	//*  50   99:getfield        #78  <Field ce g>
	//*  51  102:ifnull          129
	//*  52  105:aload_0         
	//*  53  106:getfield        #78  <Field ce g>
	//*  54  109:invokevirtual   #185 <Method boolean ce.b()>
	//*  55  112:ifne            129
				jsonobject.put("device", ((Object) (g.a())));
	//   56  115:aload_1         
	//   57  116:ldc1            #187 <String "device">
	//   58  118:aload_0         
	//   59  119:getfield        #78  <Field ce g>
	//   60  122:invokevirtual   #189 <Method JSONObject ce.a()>
	//   61  125:invokevirtual   #174 <Method JSONObject JSONObject.put(String, Object)>
	//   62  128:pop             
			if(j != null && !j.b())
	//*  63  129:aload_0         
	//*  64  130:getfield        #66  <Field ch j>
	//*  65  133:ifnull          160
	//*  66  136:aload_0         
	//*  67  137:getfield        #66  <Field ch j>
	//*  68  140:invokevirtual   #192 <Method boolean ch.b()>
	//*  69  143:ifne            160
				jsonobject.put("attributes", ((Object) (j.c())));
	//   70  146:aload_1         
	//   71  147:ldc1            #194 <String "attributes">
	//   72  149:aload_0         
	//   73  150:getfield        #66  <Field ch j>
	//   74  153:invokevirtual   #197 <Method org.json.JSONArray ch.c()>
	//   75  156:invokevirtual   #174 <Method JSONObject JSONObject.put(String, Object)>
	//   76  159:pop             
			if(l != null && !l.b())
	//*  77  160:aload_0         
	//*  78  161:getfield        #109 <Field bt l>
	//*  79  164:ifnull          194
	//*  80  167:aload_0         
	//*  81  168:getfield        #109 <Field bt l>
	//*  82  171:invokevirtual   #200 <Method boolean bt.b()>
	//*  83  174:ifne            194
				jsonobject.put("events", ((Object) (dt.a(((java.util.Collection) (l.a()))))));
	//   84  177:aload_1         
	//   85  178:ldc1            #202 <String "events">
	//   86  180:aload_0         
	//   87  181:getfield        #109 <Field bt l>
	//   88  184:invokevirtual   #205 <Method java.util.Set bt.a()>
	//   89  187:invokestatic    #210 <Method org.json.JSONArray dt.a(java.util.Collection)>
	//   90  190:invokevirtual   #174 <Method JSONObject JSONObject.put(String, Object)>
	//   91  193:pop             
			if(i != null)
	//*  92  194:aload_0         
	//*  93  195:getfield        #115 <Field SdkFlavor i>
	//*  94  198:ifnull          215
				jsonobject.put("sdk_flavor", ((Object) (i.forJsonPut())));
	//   95  201:aload_1         
	//   96  202:ldc1            #212 <String "sdk_flavor">
	//   97  204:aload_0         
	//   98  205:getfield        #115 <Field SdkFlavor i>
	//   99  208:invokevirtual   #217 <Method String SdkFlavor.forJsonPut()>
	//  100  211:invokevirtual   #174 <Method JSONObject JSONObject.put(String, Object)>
	//  101  214:pop             
		}
	//* 102  215:aload_1         
	//* 103  216:areturn         
		catch(JSONException jsonexception)
	//* 104  217:astore_1        
		{
			AppboyLogger.w(b, "Experienced JSONException while retrieving parameters. Returning null.", ((Throwable) (jsonexception)));
	//  105  218:getstatic       #36  <Field String b>
	//  106  221:ldc1            #219 <String "Experienced JSONException while retrieving parameters. Returning null.">
	//  107  223:aload_1         
	//  108  224:invokestatic    #223 <Method int AppboyLogger.w(String, String, Throwable)>
	//  109  227:pop             
			return null;
	//  110  228:aconst_null     
	//  111  229:areturn         
		}
		return jsonobject;
	}

	public boolean h()
	{
		return b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #224 <Method boolean b()>
	//    2    4:ireturn         
	}

	private static final String b = AppboyLogger.getAppboyLogTag(bo/app/ci);
	private Long c;
	private String d;
	private String e;
	private String f;
	private ce g;
	private String h;
	private SdkFlavor i;
	private ch j;
	private cg k;
	private bt l;

	static 
	{
	//    0    0:ldc1            #2   <Class ci>
	//    1    2:invokestatic    #34  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #36  <Field String b>
	//*   3    8:return          
	}
}
