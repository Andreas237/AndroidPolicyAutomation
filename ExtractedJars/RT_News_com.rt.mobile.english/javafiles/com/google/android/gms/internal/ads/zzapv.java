// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zznk, zzkb, zzni, zzna

public final class zzapv
{

	public zzapv(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		Object obj = null;
	//    2    4:aconst_null     
	//    3    5:astore_3        
		JSONObject jsonobject = ((JSONObject) (obj));
	//    4    6:aload_3         
	//    5    7:astore_2        
		if(s != null)
	//*   6    8:aload_1         
	//*   7    9:ifnull          21
			try
			{
				jsonobject = new JSONObject(s);
	//    8   12:new             #26  <Class JSONObject>
	//    9   15:dup             
	//   10   16:aload_1         
	//   11   17:invokespecial   #28  <Method void JSONObject(String)>
	//   12   20:astore_2        
			}
	//*  13   21:aload_0         
	//*  14   22:aload_2         
	//*  15   23:ldc1            #30  <String "aggressive_media_codec_release">
	//*  16   25:getstatic       #36  <Field zzna zznk.zzavl>
	//*  17   28:invokestatic    #40  <Method boolean zza(JSONObject, String, zzna)>
	//*  18   31:putfield        #42  <Field boolean zzczu>
	//*  19   34:aload_0         
	//*  20   35:aload_2         
	//*  21   36:ldc1            #44  <String "byte_buffer_precache_limit">
	//*  22   38:getstatic       #47  <Field zzna zznk.zzauv>
	//*  23   41:invokestatic    #51  <Method int zzb(JSONObject, String, zzna)>
	//*  24   44:putfield        #53  <Field int zzczv>
	//*  25   47:aload_0         
	//*  26   48:aload_2         
	//*  27   49:ldc1            #55  <String "exo_cache_buffer_size">
	//*  28   51:getstatic       #58  <Field zzna zznk.zzauz>
	//*  29   54:invokestatic    #51  <Method int zzb(JSONObject, String, zzna)>
	//*  30   57:putfield        #60  <Field int zzczw>
	//*  31   60:aload_0         
	//*  32   61:aload_2         
	//*  33   62:ldc1            #62  <String "exo_connect_timeout_millis">
	//*  34   64:getstatic       #65  <Field zzna zznk.zzaur>
	//*  35   67:invokestatic    #51  <Method int zzb(JSONObject, String, zzna)>
	//*  36   70:putfield        #67  <Field int zzczx>
	//*  37   73:aload_0         
	//*  38   74:aload_2         
	//*  39   75:ldc1            #69  <String "exo_player_version">
	//*  40   77:getstatic       #72  <Field zzna zznk.zzauq>
	//*  41   80:invokestatic    #76  <Method String zzc(JSONObject, String, zzna)>
	//*  42   83:putfield        #78  <Field String zzczy>
	//*  43   86:aload_0         
	//*  44   87:aload_2         
	//*  45   88:ldc1            #80  <String "exo_read_timeout_millis">
	//*  46   90:getstatic       #83  <Field zzna zznk.zzaus>
	//*  47   93:invokestatic    #51  <Method int zzb(JSONObject, String, zzna)>
	//*  48   96:putfield        #85  <Field int zzczz>
	//*  49   99:aload_0         
	//*  50  100:aload_2         
	//*  51  101:ldc1            #87  <String "load_check_interval_bytes">
	//*  52  103:getstatic       #90  <Field zzna zznk.zzaut>
	//*  53  106:invokestatic    #51  <Method int zzb(JSONObject, String, zzna)>
	//*  54  109:putfield        #92  <Field int zzdaa>
	//*  55  112:aload_0         
	//*  56  113:aload_2         
	//*  57  114:ldc1            #94  <String "player_precache_limit">
	//*  58  116:getstatic       #97  <Field zzna zznk.zzauu>
	//*  59  119:invokestatic    #51  <Method int zzb(JSONObject, String, zzna)>
	//*  60  122:putfield        #99  <Field int zzdab>
	//*  61  125:aload_0         
	//*  62  126:aload_2         
	//*  63  127:ldc1            #101 <String "use_cache_data_source">
	//*  64  129:getstatic       #104 <Field zzna zznk.zzbdr>
	//*  65  132:invokestatic    #40  <Method boolean zza(JSONObject, String, zzna)>
	//*  66  135:putfield        #106 <Field boolean zzdac>
	//*  67  138:return          
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  68  139:astore_1        
			{
				jsonobject = ((JSONObject) (obj));
	//   69  140:aload_3         
	//   70  141:astore_2        
			}
		zzczu = zza(jsonobject, "aggressive_media_codec_release", zznk.zzavl);
		zzczv = zzb(jsonobject, "byte_buffer_precache_limit", zznk.zzauv);
		zzczw = zzb(jsonobject, "exo_cache_buffer_size", zznk.zzauz);
		zzczx = zzb(jsonobject, "exo_connect_timeout_millis", zznk.zzaur);
		zzczy = zzc(jsonobject, "exo_player_version", zznk.zzauq);
		zzczz = zzb(jsonobject, "exo_read_timeout_millis", zznk.zzaus);
		zzdaa = zzb(jsonobject, "load_check_interval_bytes", zznk.zzaut);
		zzdab = zzb(jsonobject, "player_precache_limit", zznk.zzauu);
		zzdac = zza(jsonobject, "use_cache_data_source", zznk.zzbdr);
	//*  71  142:goto            21
	}

	private static boolean zza(JSONObject jsonobject, String s, zzna zzna)
	{
		if(jsonobject == null)
			break MISSING_BLOCK_LABEL_12;
	//    0    0:aload_0         
	//    1    1:ifnull          12
		boolean flag = jsonobject.getBoolean(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #111 <Method boolean JSONObject.getBoolean(String)>
	//    5    9:istore_3        
		return flag;
	//    6   10:iload_3         
	//    7   11:ireturn         
_L2:
		return ((Boolean)zzkb.zzik().zzd(zzna)).booleanValue();
	//    8   12:invokestatic    #117 <Method zzni zzkb.zzik()>
	//    9   15:aload_2         
	//   10   16:invokevirtual   #123 <Method Object zzni.zzd(zzna)>
	//   11   19:checkcast       #125 <Class Boolean>
	//   12   22:invokevirtual   #129 <Method boolean Boolean.booleanValue()>
	//   13   25:ireturn         
		jsonobject;
	//   14   26:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  15   27:goto            12
	}

	private static int zzb(JSONObject jsonobject, String s, zzna zzna)
	{
		if(jsonobject == null)
			break MISSING_BLOCK_LABEL_12;
	//    0    0:aload_0         
	//    1    1:ifnull          12
		int i = jsonobject.getInt(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #135 <Method int JSONObject.getInt(String)>
	//    5    9:istore_3        
		return i;
	//    6   10:iload_3         
	//    7   11:ireturn         
_L2:
		return ((Integer)zzkb.zzik().zzd(zzna)).intValue();
	//    8   12:invokestatic    #117 <Method zzni zzkb.zzik()>
	//    9   15:aload_2         
	//   10   16:invokevirtual   #123 <Method Object zzni.zzd(zzna)>
	//   11   19:checkcast       #137 <Class Integer>
	//   12   22:invokevirtual   #141 <Method int Integer.intValue()>
	//   13   25:ireturn         
		jsonobject;
	//   14   26:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  15   27:goto            12
	}

	private static String zzc(JSONObject jsonobject, String s, zzna zzna)
	{
		if(jsonobject == null)
			break MISSING_BLOCK_LABEL_12;
	//    0    0:aload_0         
	//    1    1:ifnull          12
		jsonobject = ((JSONObject) (jsonobject.getString(s)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #146 <Method String JSONObject.getString(String)>
	//    5    9:astore_0        
		return ((String) (jsonobject));
	//    6   10:aload_0         
	//    7   11:areturn         
_L2:
		return (String)zzkb.zzik().zzd(zzna);
	//    8   12:invokestatic    #117 <Method zzni zzkb.zzik()>
	//    9   15:aload_2         
	//   10   16:invokevirtual   #123 <Method Object zzni.zzd(zzna)>
	//   11   19:checkcast       #148 <Class String>
	//   12   22:areturn         
		jsonobject;
	//   13   23:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  14   24:goto            12
	}

	private final boolean zzczu;
	private final int zzczv;
	private final int zzczw;
	private final int zzczx;
	private final String zzczy;
	private final int zzczz;
	private final int zzdaa;
	private final int zzdab;
	private final boolean zzdac;
}
