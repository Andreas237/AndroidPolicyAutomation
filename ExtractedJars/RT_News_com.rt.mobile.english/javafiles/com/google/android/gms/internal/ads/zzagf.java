// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.Clock;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzagh, zznk, zzkb, zzni, 
//			zzano, zzang, zzwf, zzagg, 
//			zzaoe, zzakb, zzanz

public final class zzagf extends zzagh
{

	public zzagf(Context context, zzwf zzwf1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void zzagh()>
	//    2    4:aload_0         
	//    3    5:new             #22  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void Object()>
	//    6   12:putfield        #25  <Field Object mLock>
		zzaeo = context.getApplicationContext();
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #31  <Method Context Context.getApplicationContext()>
	//   10   20:putfield        #33  <Field Context zzaeo>
		zzcko = zzwf1;
	//   11   23:aload_0         
	//   12   24:aload_2         
	//   13   25:putfield        #35  <Field zzwf zzcko>
	//   14   28:return          
	}

	final Void zzn(JSONObject jsonobject)
	{
		zznk.zza(zzaeo, 1, jsonobject);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Context zzaeo>
	//    2    4:iconst_1        
	//    3    5:aload_1         
	//    4    6:invokestatic    #46  <Method void zznk.zza(Context, int, JSONObject)>
		zzckn.edit().putLong("js_last_update", zzbv.zzer().currentTimeMillis()).apply();
	//    5    9:aload_0         
	//    6   10:getfield        #48  <Field SharedPreferences zzckn>
	//    7   13:invokeinterface #54  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    8   18:ldc1            #56  <String "js_last_update">
	//    9   20:invokestatic    #62  <Method Clock zzbv.zzer()>
	//   10   23:invokeinterface #68  <Method long Clock.currentTimeMillis()>
	//   11   28:invokeinterface #74  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   12   33:invokeinterface #77  <Method void android.content.SharedPreferences$Editor.apply()>
		return null;
	//   13   38:aconst_null     
	//   14   39:areturn         
	}

	public final zzanz zzop()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Object mLock>
	//    2    4:astore          5
		obj;
	//    3    6:aload           5
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		if(zzckn != null)
			break MISSING_BLOCK_LABEL_39;
	//    5    9:aload_0         
	//    6   10:getfield        #48  <Field SharedPreferences zzckn>
	//    7   13:ifnull          22
	//*   8   16:aload           5
	//*   9   18:monitorexit     
	//*  10   19:goto            39
		zzckn = zzaeo.getSharedPreferences("google_ads_flags_meta", 0);
	//   11   22:aload_0         
	//   12   23:aload_0         
	//   13   24:getfield        #33  <Field Context zzaeo>
	//   14   27:ldc1            #83  <String "google_ads_flags_meta">
	//   15   29:iconst_0        
	//   16   30:invokevirtual   #87  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   17   33:putfield        #48  <Field SharedPreferences zzckn>
	//*  18   36:goto            16
		long l = zzckn.getLong("js_last_update", 0L);
	//   19   39:aload_0         
	//   20   40:getfield        #48  <Field SharedPreferences zzckn>
	//   21   43:ldc1            #56  <String "js_last_update">
	//   22   45:lconst_0        
	//   23   46:invokeinterface #91  <Method long SharedPreferences.getLong(String, long)>
	//   24   51:lstore_1        
		long l1 = zzbv.zzer().currentTimeMillis();
	//   25   52:invokestatic    #62  <Method Clock zzbv.zzer()>
	//   26   55:invokeinterface #68  <Method long Clock.currentTimeMillis()>
	//   27   60:lstore_3        
		obj = ((Object) (zznk.zzbbl));
	//   28   61:getstatic       #95  <Field zzna zznk.zzbbl>
	//   29   64:astore          5
		if(l1 - l < ((Long)zzkb.zzik().zzd(((zzna) (obj)))).longValue())
	//*  30   66:lload_3         
	//*  31   67:lload_1         
	//*  32   68:lsub            
	//*  33   69:invokestatic    #101 <Method zzni zzkb.zzik()>
	//*  34   72:aload           5
	//*  35   74:invokevirtual   #107 <Method Object zzni.zzd(zzna)>
	//*  36   77:checkcast       #109 <Class Long>
	//*  37   80:invokevirtual   #112 <Method long Long.longValue()>
	//*  38   83:lcmp            
	//*  39   84:ifge            92
			return ((zzanz) (zzano.zzi(((Object) (null)))));
	//   40   87:aconst_null     
	//   41   88:invokestatic    #118 <Method zzany zzano.zzi(Object)>
	//   42   91:areturn         
		obj = ((Object) (new JSONObject()));
	//   43   92:new             #120 <Class JSONObject>
	//   44   95:dup             
	//   45   96:invokespecial   #121 <Method void JSONObject()>
	//   46   99:astore          5
		try
		{
			((JSONObject) (obj)).put("js", ((Object) (zzang.zzsl().zzcw)));
	//   47  101:aload           5
	//   48  103:ldc1            #123 <String "js">
	//   49  105:invokestatic    #129 <Method zzang zzang.zzsl()>
	//   50  108:getfield        #133 <Field String zzang.zzcw>
	//   51  111:invokevirtual   #137 <Method JSONObject JSONObject.put(String, Object)>
	//   52  114:pop             
			zzna zzna = zznk.zzbbm;
	//   53  115:getstatic       #140 <Field zzna zznk.zzbbm>
	//   54  118:astore          6
			((JSONObject) (obj)).put("mf", zzkb.zzik().zzd(zzna));
	//   55  120:aload           5
	//   56  122:ldc1            #142 <String "mf">
	//   57  124:invokestatic    #101 <Method zzni zzkb.zzik()>
	//   58  127:aload           6
	//   59  129:invokevirtual   #107 <Method Object zzni.zzd(zzna)>
	//   60  132:invokevirtual   #137 <Method JSONObject JSONObject.put(String, Object)>
	//   61  135:pop             
			((JSONObject) (obj)).put("cl", "193400285");
	//   62  136:aload           5
	//   63  138:ldc1            #144 <String "cl">
	//   64  140:ldc1            #146 <String "193400285">
	//   65  142:invokevirtual   #137 <Method JSONObject JSONObject.put(String, Object)>
	//   66  145:pop             
			((JSONObject) (obj)).put("rapid_rc", "dev");
	//   67  146:aload           5
	//   68  148:ldc1            #148 <String "rapid_rc">
	//   69  150:ldc1            #150 <String "dev">
	//   70  152:invokevirtual   #137 <Method JSONObject JSONObject.put(String, Object)>
	//   71  155:pop             
			((JSONObject) (obj)).put("rapid_rollup", "HEAD");
	//   72  156:aload           5
	//   73  158:ldc1            #152 <String "rapid_rollup">
	//   74  160:ldc1            #154 <String "HEAD">
	//   75  162:invokevirtual   #137 <Method JSONObject JSONObject.put(String, Object)>
	//   76  165:pop             
			((JSONObject) (obj)).put("dynamite_version", 279);
	//   77  166:aload           5
	//   78  168:ldc1            #156 <String "dynamite_version">
	//   79  170:sipush          279
	//   80  173:invokevirtual   #159 <Method JSONObject JSONObject.put(String, int)>
	//   81  176:pop             
		}
	//*  82  177:aload_0         
	//*  83  178:getfield        #35  <Field zzwf zzcko>
	//*  84  181:aload           5
	//*  85  183:invokeinterface #165 <Method zzanz zzwf.zzf(Object)>
	//*  86  188:new             #167 <Class zzagg>
	//*  87  191:dup             
	//*  88  192:aload_0         
	//*  89  193:invokespecial   #170 <Method void zzagg(zzagf)>
	//*  90  196:getstatic       #176 <Field java.util.concurrent.Executor zzaoe.zzcvz>
	//*  91  199:invokestatic    #179 <Method zzanz zzano.zza(zzanz, zzank, java.util.concurrent.Executor)>
	//*  92  202:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  93  203:astore          5
		{
			zzakb.zzb("Unable to populate SDK Core Constants parameters.", ((Throwable) (obj)));
	//   94  205:ldc1            #181 <String "Unable to populate SDK Core Constants parameters.">
	//   95  207:aload           5
	//   96  209:invokestatic    #187 <Method void zzakb.zzb(String, Throwable)>
			return ((zzanz) (zzano.zzi(((Object) (null)))));
	//   97  212:aconst_null     
	//   98  213:invokestatic    #118 <Method zzany zzano.zzi(Object)>
	//   99  216:areturn         
		}
		return zzano.zza(zzcko.zzf(obj), ((zzank) (new zzagg(this))), zzaoe.zzcvz);
		Exception exception;
		exception;
	//  100  217:astore          6
		obj;
	//  101  219:aload           5
		JVM INSTR monitorexit ;
	//  102  221:monitorexit     
		throw exception;
	//  103  222:aload           6
	//  104  224:athrow          
	}

	private final Object mLock = new Object();
	private final Context zzaeo;
	private SharedPreferences zzckn;
	private final zzwf zzcko;
}
