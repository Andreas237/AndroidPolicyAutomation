// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.common.util.e;
import com.google.android.gms.dynamite.DynamiteModule;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			te, p, bwk, m, 
//			aas, zzbbi, iz, td, 
//			abj, wx, abe

public final class tc extends te
{

	public tc(Context context, iz iz1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void te()>
	//    2    4:aload_0         
	//    3    5:new             #20  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void Object()>
	//    6   12:putfield        #23  <Field Object a>
		b = context.getApplicationContext();
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #29  <Method Context Context.getApplicationContext()>
	//   10   20:putfield        #31  <Field Context b>
		d = iz1;
	//   11   23:aload_0         
	//   12   24:aload_2         
	//   13   25:putfield        #33  <Field iz d>
	//   14   28:return          
	}

	public final abe a()
	{
		Object obj = a;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Object a>
	//    2    4:astore          5
		obj;
	//    3    6:aload           5
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		if(c == null) goto _L2; else goto _L1
	//    5    9:aload_0         
	//    6   10:getfield        #39  <Field SharedPreferences c>
	//    7   13:ifnull          22
	//*   8   16:aload           5
	//*   9   18:monitorexit     
	//*  10   19:goto            39
_L2:
		c = b.getSharedPreferences("google_ads_flags_meta", 0);
	//   11   22:aload_0         
	//   12   23:aload_0         
	//   13   24:getfield        #31  <Field Context b>
	//   14   27:ldc1            #41  <String "google_ads_flags_meta">
	//   15   29:iconst_0        
	//   16   30:invokevirtual   #45  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   17   33:putfield        #39  <Field SharedPreferences c>
		obj;
	//   18   36:aload           5
		JVM INSTR monitorexit ;
	//   19   38:monitorexit     
_L1:
		long l = c.getLong("js_last_update", 0L);
	//   20   39:aload_0         
	//   21   40:getfield        #39  <Field SharedPreferences c>
	//   22   43:ldc1            #47  <String "js_last_update">
	//   23   45:lconst_0        
	//   24   46:invokeinterface #53  <Method long SharedPreferences.getLong(String, long)>
	//   25   51:lstore_1        
		long l1 = aw.l().a();
	//   26   52:invokestatic    #59  <Method e aw.l()>
	//   27   55:invokeinterface #64  <Method long e.a()>
	//   28   60:lstore_3        
		obj = ((Object) (p.bu));
	//   29   61:getstatic       #70  <Field com.google.android.gms.internal.ads.e p.bu>
	//   30   64:astore          5
		if(l1 - l < ((Long)com.google.android.gms.internal.ads.bwk.e().a(((com.google.android.gms.internal.ads.e) (obj)))).longValue())
	//*  31   66:lload_3         
	//*  32   67:lload_1         
	//*  33   68:lsub            
	//*  34   69:invokestatic    #76  <Method m com.google.android.gms.internal.ads.bwk.e()>
	//*  35   72:aload           5
	//*  36   74:invokevirtual   #81  <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//*  37   77:checkcast       #83  <Class Long>
	//*  38   80:invokevirtual   #86  <Method long Long.longValue()>
	//*  39   83:lcmp            
	//*  40   84:ifge            92
			return ((abe) (aas.a(((Object) (null)))));
	//   41   87:aconst_null     
	//   42   88:invokestatic    #91  <Method abd aas.a(Object)>
	//   43   91:areturn         
		obj = ((Object) (new JSONObject()));
	//   44   92:new             #93  <Class JSONObject>
	//   45   95:dup             
	//   46   96:invokespecial   #94  <Method void JSONObject()>
	//   47   99:astore          5
		try
		{
			((JSONObject) (obj)).put("js", ((Object) (zzbbi.a().a)));
	//   48  101:aload           5
	//   49  103:ldc1            #96  <String "js">
	//   50  105:invokestatic    #101 <Method zzbbi zzbbi.a()>
	//   51  108:getfield        #104 <Field String zzbbi.a>
	//   52  111:invokevirtual   #108 <Method JSONObject JSONObject.put(String, Object)>
	//   53  114:pop             
			com.google.android.gms.internal.ads.e e1 = p.bv;
	//   54  115:getstatic       #111 <Field com.google.android.gms.internal.ads.e p.bv>
	//   55  118:astore          6
			((JSONObject) (obj)).put("mf", com.google.android.gms.internal.ads.bwk.e().a(e1));
	//   56  120:aload           5
	//   57  122:ldc1            #113 <String "mf">
	//   58  124:invokestatic    #76  <Method m com.google.android.gms.internal.ads.bwk.e()>
	//   59  127:aload           6
	//   60  129:invokevirtual   #81  <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//   61  132:invokevirtual   #108 <Method JSONObject JSONObject.put(String, Object)>
	//   62  135:pop             
			((JSONObject) (obj)).put("cl", "230840877");
	//   63  136:aload           5
	//   64  138:ldc1            #115 <String "cl">
	//   65  140:ldc1            #117 <String "230840877">
	//   66  142:invokevirtual   #108 <Method JSONObject JSONObject.put(String, Object)>
	//   67  145:pop             
			((JSONObject) (obj)).put("rapid_rc", "dev");
	//   68  146:aload           5
	//   69  148:ldc1            #119 <String "rapid_rc">
	//   70  150:ldc1            #121 <String "dev">
	//   71  152:invokevirtual   #108 <Method JSONObject JSONObject.put(String, Object)>
	//   72  155:pop             
			((JSONObject) (obj)).put("rapid_rollup", "HEAD");
	//   73  156:aload           5
	//   74  158:ldc1            #123 <String "rapid_rollup">
	//   75  160:ldc1            #125 <String "HEAD">
	//   76  162:invokevirtual   #108 <Method JSONObject JSONObject.put(String, Object)>
	//   77  165:pop             
			((JSONObject) (obj)).put("dynamite_version", DynamiteModule.b(b, "com.google.android.gms.ads.dynamite"));
	//   78  166:aload           5
	//   79  168:ldc1            #127 <String "dynamite_version">
	//   80  170:aload_0         
	//   81  171:getfield        #31  <Field Context b>
	//   82  174:ldc1            #129 <String "com.google.android.gms.ads.dynamite">
	//   83  176:invokestatic    #134 <Method int DynamiteModule.b(Context, String)>
	//   84  179:invokevirtual   #137 <Method JSONObject JSONObject.put(String, int)>
	//   85  182:pop             
			((JSONObject) (obj)).put("container_version", 0xbdfcc1);
	//   86  183:aload           5
	//   87  185:ldc1            #139 <String "container_version">
	//   88  187:ldc1            #140 <Int 0xbdfcc1>
	//   89  189:invokevirtual   #137 <Method JSONObject JSONObject.put(String, int)>
	//   90  192:pop             
		}
	//*  91  193:aload_0         
	//*  92  194:getfield        #33  <Field iz d>
	//*  93  197:aload           5
	//*  94  199:invokeinterface #145 <Method abe iz.b(Object)>
	//*  95  204:new             #147 <Class td>
	//*  96  207:dup             
	//*  97  208:aload_0         
	//*  98  209:invokespecial   #150 <Method void td(tc)>
	//*  99  212:getstatic       #155 <Field java.util.concurrent.Executor abj.b>
	//* 100  215:invokestatic    #158 <Method abe aas.a(abe, aao, java.util.concurrent.Executor)>
	//* 101  218:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 102  219:astore          5
		{
			wx.b("Unable to populate SDK Core Constants parameters.", ((Throwable) (obj)));
	//  103  221:ldc1            #160 <String "Unable to populate SDK Core Constants parameters.">
	//  104  223:aload           5
	//  105  225:invokestatic    #165 <Method void wx.b(String, Throwable)>
			return ((abe) (aas.a(((Object) (null)))));
	//  106  228:aconst_null     
	//  107  229:invokestatic    #91  <Method abd aas.a(Object)>
	//  108  232:areturn         
		}
		return aas.a(d.b(obj), ((aao) (new td(this))), abj.b);
		Exception exception;
		exception;
	//  109  233:astore          6
		obj;
	//  110  235:aload           5
		JVM INSTR monitorexit ;
	//  111  237:monitorexit     
		throw exception;
	//  112  238:aload           6
	//  113  240:athrow          
	}

	final Void a(JSONObject jsonobject)
	{
		p.a(b, 1, jsonobject);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Context b>
	//    2    4:iconst_1        
	//    3    5:aload_1         
	//    4    6:invokestatic    #169 <Method void p.a(Context, int, JSONObject)>
		c.edit().putLong("js_last_update", aw.l().a()).apply();
	//    5    9:aload_0         
	//    6   10:getfield        #39  <Field SharedPreferences c>
	//    7   13:invokeinterface #173 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    8   18:ldc1            #47  <String "js_last_update">
	//    9   20:invokestatic    #59  <Method e aw.l()>
	//   10   23:invokeinterface #64  <Method long e.a()>
	//   11   28:invokeinterface #179 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   12   33:invokeinterface #182 <Method void android.content.SharedPreferences$Editor.apply()>
		return null;
	//   13   38:aconst_null     
	//   14   39:areturn         
	}

	private final Object a = new Object();
	private final Context b;
	private SharedPreferences c;
	private final iz d;
}
