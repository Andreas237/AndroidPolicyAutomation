// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.security.NetworkSecurityPolicy;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.*;
import org.json.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzakf, zzajx, zzanz, zzakb, 
//			zzake, zzakh, zzajl

public final class zzakd
{

	public zzakd()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #46  <Method void Object()>
	//    6   12:putfield        #48  <Field Object mLock>
		zzcqv = new CopyOnWriteArraySet();
	//    7   15:aload_0         
	//    8   16:new             #50  <Class CopyOnWriteArraySet>
	//    9   19:dup             
	//   10   20:invokespecial   #51  <Method void CopyOnWriteArraySet()>
	//   11   23:putfield        #53  <Field CopyOnWriteArraySet zzcqv>
		zzcqx = false;
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:putfield        #55  <Field boolean zzcqx>
		zzcik = true;
	//   15   31:aload_0         
	//   16   32:iconst_1        
	//   17   33:putfield        #57  <Field boolean zzcik>
		zzcit = false;
	//   18   36:aload_0         
	//   19   37:iconst_0        
	//   20   38:putfield        #59  <Field boolean zzcit>
		zzcpj = "";
	//   21   41:aload_0         
	//   22   42:ldc1            #61  <String "">
	//   23   44:putfield        #63  <Field String zzcpj>
		zzcra = 0L;
	//   24   47:aload_0         
	//   25   48:lconst_0        
	//   26   49:putfield        #65  <Field long zzcra>
		zzcrb = 0L;
	//   27   52:aload_0         
	//   28   53:lconst_0        
	//   29   54:putfield        #67  <Field long zzcrb>
		zzcrc = 0L;
	//   30   57:aload_0         
	//   31   58:lconst_0        
	//   32   59:putfield        #69  <Field long zzcrc>
		zzcqg = -1;
	//   33   62:aload_0         
	//   34   63:iconst_m1       
	//   35   64:putfield        #71  <Field int zzcqg>
		zzcrd = 0;
	//   36   67:aload_0         
	//   37   68:iconst_0        
	//   38   69:putfield        #73  <Field int zzcrd>
		zzcre = Collections.emptySet();
	//   39   72:aload_0         
	//   40   73:invokestatic    #79  <Method Set Collections.emptySet()>
	//   41   76:putfield        #81  <Field Set zzcre>
		zzcrf = new JSONObject();
	//   42   79:aload_0         
	//   43   80:new             #83  <Class JSONObject>
	//   44   83:dup             
	//   45   84:invokespecial   #84  <Method void JSONObject()>
	//   46   87:putfield        #86  <Field JSONObject zzcrf>
		zzcil = true;
	//   47   90:aload_0         
	//   48   91:iconst_1        
	//   49   92:putfield        #88  <Field boolean zzcil>
		zzcim = true;
	//   50   95:aload_0         
	//   51   96:iconst_1        
	//   52   97:putfield        #90  <Field boolean zzcim>
	//   53  100:return          
	}

	static int zza(zzakd zzakd1, int i)
	{
		zzakd1.zzcrd = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #73  <Field int zzcrd>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static long zza(zzakd zzakd1, long l)
	{
		zzakd1.zzcra = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #65  <Field long zzcra>
		return l;
	//    3    5:lload_1         
	//    4    6:lreturn         
	}

	static SharedPreferences zza(zzakd zzakd1, SharedPreferences sharedpreferences)
	{
		zzakd1.zzatw = sharedpreferences;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #97  <Field SharedPreferences zzatw>
		return sharedpreferences;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static Object zza(zzakd zzakd1)
	{
		return zzakd1.mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Object mLock>
	//    2    4:areturn         
	}

	static String zza(zzakd zzakd1, String s)
	{
		zzakd1.zzcqy = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #101 <Field String zzcqy>
		return s;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static Set zza(zzakd zzakd1, Set set)
	{
		zzakd1.zzcre = set;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #81  <Field Set zzcre>
		return set;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static JSONObject zza(zzakd zzakd1, JSONObject jsonobject)
	{
		zzakd1.zzcrf = jsonobject;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #86  <Field JSONObject zzcrf>
		return jsonobject;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static void zza(zzakd zzakd1, Bundle bundle)
	{
		zzakd1.zze(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #108 <Method void zze(Bundle)>
	//    3    5:return          
	}

	static boolean zza(zzakd zzakd1, boolean flag)
	{
		zzakd1.zzcqx = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #55  <Field boolean zzcqx>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static int zzb(zzakd zzakd1, int i)
	{
		zzakd1.zzcqg = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #71  <Field int zzcqg>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static long zzb(zzakd zzakd1, long l)
	{
		zzakd1.zzcrb = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #67  <Field long zzcrb>
		return l;
	//    3    5:lload_1         
	//    4    6:lreturn         
	}

	static String zzb(zzakd zzakd1, String s)
	{
		zzakd1.zzcqz = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #112 <Field String zzcqz>
		return s;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static boolean zzb(zzakd zzakd1)
	{
		return zzqq();
	//    0    0:invokestatic    #117 <Method boolean zzqq()>
	//    1    3:ireturn         
	}

	static boolean zzb(zzakd zzakd1, boolean flag)
	{
		zzakd1.zzcik = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #57  <Field boolean zzcik>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static long zzc(zzakd zzakd1, long l)
	{
		zzakd1.zzcrc = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #69  <Field long zzcrc>
		return l;
	//    3    5:lload_1         
	//    4    6:lreturn         
	}

	static String zzc(zzakd zzakd1, String s)
	{
		zzakd1.zzcpj = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #63  <Field String zzcpj>
		return s;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static boolean zzc(zzakd zzakd1)
	{
		return zzakd1.zzcik;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field boolean zzcik>
	//    2    4:ireturn         
	}

	static boolean zzc(zzakd zzakd1, boolean flag)
	{
		zzakd1.zzcil = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #88  <Field boolean zzcil>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static SharedPreferences zzd(zzakd zzakd1)
	{
		return zzakd1.zzatw;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field SharedPreferences zzatw>
	//    2    4:areturn         
	}

	static boolean zzd(zzakd zzakd1, boolean flag)
	{
		zzakd1.zzcit = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #59  <Field boolean zzcit>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private final void zze(Bundle bundle)
	{
		((zzajx) (new zzakf(this, bundle))).zznt();
	//    0    0:new             #122 <Class zzakf>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #124 <Method void zzakf(zzakd, Bundle)>
	//    5    9:invokevirtual   #130 <Method Object zzajx.zznt()>
	//    6   12:pop             
	//    7   13:return          
	}

	static boolean zze(zzakd zzakd1)
	{
		return zzakd1.zzcil;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field boolean zzcil>
	//    2    4:ireturn         
	}

	static boolean zze(zzakd zzakd1, boolean flag)
	{
		zzakd1.zzcim = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #90  <Field boolean zzcim>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static String zzf(zzakd zzakd1)
	{
		return zzakd1.zzcqy;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field String zzcqy>
	//    2    4:areturn         
	}

	static boolean zzg(zzakd zzakd1)
	{
		return zzakd1.zzcit;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field boolean zzcit>
	//    2    4:ireturn         
	}

	static boolean zzh(zzakd zzakd1)
	{
		return zzakd1.zzcim;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field boolean zzcim>
	//    2    4:ireturn         
	}

	static String zzi(zzakd zzakd1)
	{
		return zzakd1.zzcqz;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field String zzcqz>
	//    2    4:areturn         
	}

	static int zzj(zzakd zzakd1)
	{
		return zzakd1.zzcrd;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field int zzcrd>
	//    2    4:ireturn         
	}

	static String zzk(zzakd zzakd1)
	{
		return zzakd1.zzcpj;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String zzcpj>
	//    2    4:areturn         
	}

	static long zzl(zzakd zzakd1)
	{
		return zzakd1.zzcra;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field long zzcra>
	//    2    4:lreturn         
	}

	static long zzm(zzakd zzakd1)
	{
		return zzakd1.zzcrb;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field long zzcrb>
	//    2    4:lreturn         
	}

	static int zzn(zzakd zzakd1)
	{
		return zzakd1.zzcqg;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field int zzcqg>
	//    2    4:ireturn         
	}

	static long zzo(zzakd zzakd1)
	{
		return zzakd1.zzcrc;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field long zzcrc>
	//    2    4:lreturn         
	}

	static Set zzp(zzakd zzakd1)
	{
		return zzakd1.zzcre;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field Set zzcre>
	//    2    4:areturn         
	}

	static Bundle zzq(zzakd zzakd1)
	{
		return zzakd1.zzqs();
	//    0    0:aload_0         
	//    1    1:invokespecial   #151 <Method Bundle zzqs()>
	//    2    4:areturn         
	}

	private static boolean zzqq()
	{
		return PlatformVersion.isAtLeastM() && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
	//    0    0:invokestatic    #158 <Method boolean PlatformVersion.isAtLeastM()>
	//    1    3:ifeq            17
	//    2    6:invokestatic    #164 <Method NetworkSecurityPolicy NetworkSecurityPolicy.getInstance()>
	//    3    9:invokevirtual   #167 <Method boolean NetworkSecurityPolicy.isCleartextTrafficPermitted()>
	//    4   12:ifne            17
	//    5   15:iconst_1        
	//    6   16:ireturn         
	//    7   17:iconst_0        
	//    8   18:ireturn         
	}

	private final void zzqr()
	{
		if(zzcqu == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #179 <Field zzanz zzcqu>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		if(zzcqu.isDone())
	//*   4    8:aload_0         
	//*   5    9:getfield        #179 <Field zzanz zzcqu>
	//*   6   12:invokeinterface #184 <Method boolean zzanz.isDone()>
	//*   7   17:ifeq            21
			return;
	//    8   20:return          
		try
		{
			zzcqu.get(1L, TimeUnit.SECONDS);
	//    9   21:aload_0         
	//   10   22:getfield        #179 <Field zzanz zzcqu>
	//   11   25:lconst_1        
	//   12   26:getstatic       #190 <Field TimeUnit TimeUnit.SECONDS>
	//   13   29:invokeinterface #194 <Method Object zzanz.get(long, TimeUnit)>
	//   14   34:pop             
			return;
	//   15   35:return          
		}
	//*  16   36:astore_1        
	//*  17   37:ldc1            #196 <String "Fail to initialize AdSharedPreferenceManager.">
	//*  18   39:aload_1         
	//*  19   40:invokestatic    #201 <Method void zzakb.zzb(String, Throwable)>
	//*  20   43:return          
		catch(InterruptedException interruptedexception)
	//*  21   44:astore_1        
		{
			Thread.currentThread().interrupt();
	//   22   45:invokestatic    #207 <Method Thread Thread.currentThread()>
	//   23   48:invokevirtual   #210 <Method void Thread.interrupt()>
			zzakb.zzc("Interrupted while waiting for preferences loaded.", ((Throwable) (interruptedexception)));
	//   24   51:ldc1            #212 <String "Interrupted while waiting for preferences loaded.">
	//   25   53:aload_1         
	//   26   54:invokestatic    #214 <Method void zzakb.zzc(String, Throwable)>
			return;
	//   27   57:return          
		}
		catch(Object obj)
		{
			zzakb.zzb("Fail to initialize AdSharedPreferenceManager.", ((Throwable) (obj)));
			return;
		}
	}

	private final Bundle zzqs()
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #216 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #217 <Method void Bundle()>
	//    3    7:astore_2        
		bundle.putBoolean("listener_registration_bundle", true);
	//    4    8:aload_2         
	//    5    9:ldc1            #219 <String "listener_registration_bundle">
	//    6   11:iconst_1        
	//    7   12:invokevirtual   #223 <Method void Bundle.putBoolean(String, boolean)>
		synchronized(mLock)
	//*   8   15:aload_0         
	//*   9   16:getfield        #48  <Field Object mLock>
	//*  10   19:astore_1        
	//*  11   20:aload_1         
	//*  12   21:monitorenter    
		{
			bundle.putBoolean("use_https", zzcik);
	//   13   22:aload_2         
	//   14   23:ldc1            #225 <String "use_https">
	//   15   25:aload_0         
	//   16   26:getfield        #57  <Field boolean zzcik>
	//   17   29:invokevirtual   #223 <Method void Bundle.putBoolean(String, boolean)>
			bundle.putBoolean("content_url_opted_out", zzcil);
	//   18   32:aload_2         
	//   19   33:ldc1            #227 <String "content_url_opted_out">
	//   20   35:aload_0         
	//   21   36:getfield        #88  <Field boolean zzcil>
	//   22   39:invokevirtual   #223 <Method void Bundle.putBoolean(String, boolean)>
			bundle.putBoolean("content_vertical_opted_out", zzcim);
	//   23   42:aload_2         
	//   24   43:ldc1            #229 <String "content_vertical_opted_out">
	//   25   45:aload_0         
	//   26   46:getfield        #90  <Field boolean zzcim>
	//   27   49:invokevirtual   #223 <Method void Bundle.putBoolean(String, boolean)>
			bundle.putBoolean("auto_collect_location", zzcit);
	//   28   52:aload_2         
	//   29   53:ldc1            #231 <String "auto_collect_location">
	//   30   55:aload_0         
	//   31   56:getfield        #59  <Field boolean zzcit>
	//   32   59:invokevirtual   #223 <Method void Bundle.putBoolean(String, boolean)>
			bundle.putInt("version_code", zzcrd);
	//   33   62:aload_2         
	//   34   63:ldc1            #233 <String "version_code">
	//   35   65:aload_0         
	//   36   66:getfield        #73  <Field int zzcrd>
	//   37   69:invokevirtual   #237 <Method void Bundle.putInt(String, int)>
			bundle.putStringArray("never_pool_slots", (String[])zzcre.toArray(((Object []) (new String[zzcre.size()]))));
	//   38   72:aload_2         
	//   39   73:ldc1            #239 <String "never_pool_slots">
	//   40   75:aload_0         
	//   41   76:getfield        #81  <Field Set zzcre>
	//   42   79:aload_0         
	//   43   80:getfield        #81  <Field Set zzcre>
	//   44   83:invokeinterface #245 <Method int Set.size()>
	//   45   88:anewarray       String[]
	//   46   91:invokeinterface #251 <Method Object[] Set.toArray(Object[])>
	//   47   96:checkcast       #253 <Class String[]>
	//   48   99:invokevirtual   #257 <Method void Bundle.putStringArray(String, String[])>
			bundle.putString("app_settings_json", zzcpj);
	//   49  102:aload_2         
	//   50  103:ldc2            #259 <String "app_settings_json">
	//   51  106:aload_0         
	//   52  107:getfield        #63  <Field String zzcpj>
	//   53  110:invokevirtual   #263 <Method void Bundle.putString(String, String)>
			bundle.putLong("app_settings_last_update_ms", zzcra);
	//   54  113:aload_2         
	//   55  114:ldc2            #265 <String "app_settings_last_update_ms">
	//   56  117:aload_0         
	//   57  118:getfield        #65  <Field long zzcra>
	//   58  121:invokevirtual   #269 <Method void Bundle.putLong(String, long)>
			bundle.putLong("app_last_background_time_ms", zzcrb);
	//   59  124:aload_2         
	//   60  125:ldc2            #271 <String "app_last_background_time_ms">
	//   61  128:aload_0         
	//   62  129:getfield        #67  <Field long zzcrb>
	//   63  132:invokevirtual   #269 <Method void Bundle.putLong(String, long)>
			bundle.putInt("request_in_session_count", zzcqg);
	//   64  135:aload_2         
	//   65  136:ldc2            #273 <String "request_in_session_count">
	//   66  139:aload_0         
	//   67  140:getfield        #71  <Field int zzcqg>
	//   68  143:invokevirtual   #237 <Method void Bundle.putInt(String, int)>
			bundle.putLong("first_ad_req_time_ms", zzcrc);
	//   69  146:aload_2         
	//   70  147:ldc2            #275 <String "first_ad_req_time_ms">
	//   71  150:aload_0         
	//   72  151:getfield        #69  <Field long zzcrc>
	//   73  154:invokevirtual   #269 <Method void Bundle.putLong(String, long)>
			bundle.putString("native_advanced_settings", zzcrf.toString());
	//   74  157:aload_2         
	//   75  158:ldc2            #277 <String "native_advanced_settings">
	//   76  161:aload_0         
	//   77  162:getfield        #86  <Field JSONObject zzcrf>
	//   78  165:invokevirtual   #281 <Method String JSONObject.toString()>
	//   79  168:invokevirtual   #263 <Method void Bundle.putString(String, String)>
			if(zzcqy != null)
	//*  80  171:aload_0         
	//*  81  172:getfield        #101 <Field String zzcqy>
	//*  82  175:ifnull          189
				bundle.putString("content_url_hashes", zzcqy);
	//   83  178:aload_2         
	//   84  179:ldc2            #283 <String "content_url_hashes">
	//   85  182:aload_0         
	//   86  183:getfield        #101 <Field String zzcqy>
	//   87  186:invokevirtual   #263 <Method void Bundle.putString(String, String)>
			if(zzcqz != null)
	//*  88  189:aload_0         
	//*  89  190:getfield        #112 <Field String zzcqz>
	//*  90  193:ifnull          207
				bundle.putString("content_vertical_hashes", zzcqz);
	//   91  196:aload_2         
	//   92  197:ldc2            #285 <String "content_vertical_hashes">
	//   93  200:aload_0         
	//   94  201:getfield        #112 <Field String zzcqz>
	//   95  204:invokevirtual   #263 <Method void Bundle.putString(String, String)>
		}
	//   96  207:aload_1         
	//   97  208:monitorexit     
		return bundle;
	//   98  209:aload_2         
	//   99  210:areturn         
		exception;
	//  100  211:astore_2        
		obj;
	//  101  212:aload_1         
		JVM INSTR monitorexit ;
	//  102  213:monitorexit     
		throw exception;
	//  103  214:aload_2         
	//  104  215:athrow          
	}

	static CopyOnWriteArraySet zzr(zzakd zzakd1)
	{
		return zzakd1.zzcqv;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field CopyOnWriteArraySet zzcqv>
	//    2    4:areturn         
	}

	public final void initialize(Context context)
	{
		if(context.getApplicationContext() != null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #295 <Method Context Context.getApplicationContext()>
	//*   2    4:ifnonnull       10
	//*   3    7:goto            15
			context = context.getApplicationContext();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #295 <Method Context Context.getApplicationContext()>
	//    6   14:astore_1        
		zzcqu = (zzanz)((zzajx) (new zzake(this, context))).zznt();
	//    7   15:aload_0         
	//    8   16:new             #297 <Class zzake>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokespecial   #300 <Method void zzake(zzakd, Context)>
	//   13   25:invokevirtual   #130 <Method Object zzajx.zznt()>
	//   14   28:checkcast       #181 <Class zzanz>
	//   15   31:putfield        #179 <Field zzanz zzcqu>
	//   16   34:return          
	}

	public final void zza(zzakh zzakh1)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(zzcqu != null && zzcqu.isDone())
	//*   5    7:aload_0         
	//*   6    8:getfield        #179 <Field zzanz zzcqu>
	//*   7   11:ifnull          36
	//*   8   14:aload_0         
	//*   9   15:getfield        #179 <Field zzanz zzcqu>
	//*  10   18:invokeinterface #184 <Method boolean zzanz.isDone()>
	//*  11   23:ifeq            36
				zzakh1.zzd(zzqs());
	//   12   26:aload_1         
	//   13   27:aload_0         
	//   14   28:invokespecial   #151 <Method Bundle zzqs()>
	//   15   31:invokeinterface #305 <Method void zzakh.zzd(Bundle)>
			zzcqv.add(((Object) (zzakh1)));
	//   16   36:aload_0         
	//   17   37:getfield        #53  <Field CopyOnWriteArraySet zzcqv>
	//   18   40:aload_1         
	//   19   41:invokevirtual   #309 <Method boolean CopyOnWriteArraySet.add(Object)>
	//   20   44:pop             
		}
	//   21   45:aload_2         
	//   22   46:monitorexit     
		return;
	//   23   47:return          
		zzakh1;
	//   24   48:astore_1        
		obj;
	//   25   49:aload_2         
		JVM INSTR monitorexit ;
	//   26   50:monitorexit     
		throw zzakh1;
	//   27   51:aload_1         
	//   28   52:athrow          
	}

	public final void zza(String s, String s1, boolean flag)
	{
		zzqr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #314 <Method void zzqr()>
		Object obj1 = mLock;
	//    2    4:aload_0         
	//    3    5:getfield        #48  <Field Object mLock>
	//    4    8:astore          9
		obj1;
	//    5   10:aload           9
		JVM INSTR monitorenter ;
	//    6   12:monitorenter    
		Object obj = ((Object) (zzcrf.optJSONArray(s)));
	//    7   13:aload_0         
	//    8   14:getfield        #86  <Field JSONObject zzcrf>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #318 <Method JSONArray JSONObject.optJSONArray(String)>
	//   11   21:astore          8
		JSONArray jsonarray;
		jsonarray = ((JSONArray) (obj));
	//   12   23:aload           8
	//   13   25:astore          7
		if(obj != null)
			break MISSING_BLOCK_LABEL_41;
	//   14   27:aload           8
	//   15   29:ifnonnull       41
		jsonarray = new JSONArray();
	//   16   32:new             #320 <Class JSONArray>
	//   17   35:dup             
	//   18   36:invokespecial   #321 <Method void JSONArray()>
	//   19   39:astore          7
		int k = jsonarray.length();
	//   20   41:aload           7
	//   21   43:invokevirtual   #324 <Method int JSONArray.length()>
	//   22   46:istore          6
		int i = 0;
	//   23   48:iconst_0        
	//   24   49:istore          4
_L2:
		int j = k;
	//   25   51:iload           6
	//   26   53:istore          5
		if(i >= jsonarray.length())
			break; /* Loop/switch isn't completed */
	//   27   55:iload           4
	//   28   57:aload           7
	//   29   59:invokevirtual   #324 <Method int JSONArray.length()>
	//   30   62:icmpge          136
		obj = ((Object) (jsonarray.optJSONObject(i)));
	//   31   65:aload           7
	//   32   67:iload           4
	//   33   69:invokevirtual   #328 <Method JSONObject JSONArray.optJSONObject(int)>
	//   34   72:astore          8
		if(obj != null)
			break MISSING_BLOCK_LABEL_83;
	//   35   74:aload           8
	//   36   76:ifnonnull       83
		obj1;
	//   37   79:aload           9
		JVM INSTR monitorexit ;
	//   38   81:monitorexit     
		return;
	//   39   82:return          
		if(!s1.equals(((Object) (((JSONObject) (obj)).optString("template_id")))))
			break MISSING_BLOCK_LABEL_127;
	//   40   83:aload_2         
	//   41   84:aload           8
	//   42   86:ldc2            #330 <String "template_id">
	//   43   89:invokevirtual   #334 <Method String JSONObject.optString(String)>
	//   44   92:invokevirtual   #337 <Method boolean String.equals(Object)>
	//   45   95:ifeq            127
		if(!flag)
			break MISSING_BLOCK_LABEL_120;
	//   46   98:iload_3         
	//   47   99:iconst_1        
	//   48  100:icmpne          120
		if(((JSONObject) (obj)).optBoolean("uses_media_view", false) != flag)
			break MISSING_BLOCK_LABEL_120;
	//   49  103:aload           8
	//   50  105:ldc2            #339 <String "uses_media_view">
	//   51  108:iconst_0        
	//   52  109:invokevirtual   #343 <Method boolean JSONObject.optBoolean(String, boolean)>
	//   53  112:iload_3         
	//   54  113:icmpne          120
		obj1;
	//   55  116:aload           9
		JVM INSTR monitorexit ;
	//   56  118:monitorexit     
		return;
	//   57  119:return          
		j = i;
	//   58  120:iload           4
	//   59  122:istore          5
		break; /* Loop/switch isn't completed */
	//   60  124:goto            136
		i++;
	//   61  127:iload           4
	//   62  129:iconst_1        
	//   63  130:iadd            
	//   64  131:istore          4
		if(true) goto _L2; else goto _L1
	//   65  133:goto            51
_L1:
		try
		{
			JSONObject jsonobject = new JSONObject();
	//   66  136:new             #83  <Class JSONObject>
	//   67  139:dup             
	//   68  140:invokespecial   #84  <Method void JSONObject()>
	//   69  143:astore          8
			jsonobject.put("template_id", ((Object) (s1)));
	//   70  145:aload           8
	//   71  147:ldc2            #330 <String "template_id">
	//   72  150:aload_2         
	//   73  151:invokevirtual   #347 <Method JSONObject JSONObject.put(String, Object)>
	//   74  154:pop             
			jsonobject.put("uses_media_view", flag);
	//   75  155:aload           8
	//   76  157:ldc2            #339 <String "uses_media_view">
	//   77  160:iload_3         
	//   78  161:invokevirtual   #350 <Method JSONObject JSONObject.put(String, boolean)>
	//   79  164:pop             
			jsonobject.put("timestamp_ms", zzbv.zzer().currentTimeMillis());
	//   80  165:aload           8
	//   81  167:ldc2            #352 <String "timestamp_ms">
	//   82  170:invokestatic    #358 <Method Clock zzbv.zzer()>
	//   83  173:invokeinterface #364 <Method long Clock.currentTimeMillis()>
	//   84  178:invokevirtual   #367 <Method JSONObject JSONObject.put(String, long)>
	//   85  181:pop             
			jsonarray.put(j, ((Object) (jsonobject)));
	//   86  182:aload           7
	//   87  184:iload           5
	//   88  186:aload           8
	//   89  188:invokevirtual   #370 <Method JSONArray JSONArray.put(int, Object)>
	//   90  191:pop             
			zzcrf.put(s, ((Object) (jsonarray)));
	//   91  192:aload_0         
	//   92  193:getfield        #86  <Field JSONObject zzcrf>
	//   93  196:aload_1         
	//   94  197:aload           7
	//   95  199:invokevirtual   #347 <Method JSONObject JSONObject.put(String, Object)>
	//   96  202:pop             
			break MISSING_BLOCK_LABEL_214;
	//   97  203:goto            214
		}
		// Misplaced declaration of an exception variable
		catch(String s) { }
	//   98  206:astore_1        
		zzakb.zzc("Could not update native advanced settings", ((Throwable) (s)));
	//   99  207:ldc2            #372 <String "Could not update native advanced settings">
	//  100  210:aload_1         
	//  101  211:invokestatic    #214 <Method void zzakb.zzc(String, Throwable)>
		if(zzcqw != null)
	//* 102  214:aload_0         
	//* 103  215:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//* 104  218:ifnull          250
		{
			zzcqw.putString("native_advanced_settings", zzcrf.toString());
	//  105  221:aload_0         
	//  106  222:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//  107  225:ldc2            #277 <String "native_advanced_settings">
	//  108  228:aload_0         
	//  109  229:getfield        #86  <Field JSONObject zzcrf>
	//  110  232:invokevirtual   #281 <Method String JSONObject.toString()>
	//  111  235:invokeinterface #379 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//  112  240:pop             
			zzcqw.apply();
	//  113  241:aload_0         
	//  114  242:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//  115  245:invokeinterface #382 <Method void android.content.SharedPreferences$Editor.apply()>
		}
		s = ((String) (new Bundle()));
	//  116  250:new             #216 <Class Bundle>
	//  117  253:dup             
	//  118  254:invokespecial   #217 <Method void Bundle()>
	//  119  257:astore_1        
		((Bundle) (s)).putString("native_advanced_settings", zzcrf.toString());
	//  120  258:aload_1         
	//  121  259:ldc2            #277 <String "native_advanced_settings">
	//  122  262:aload_0         
	//  123  263:getfield        #86  <Field JSONObject zzcrf>
	//  124  266:invokevirtual   #281 <Method String JSONObject.toString()>
	//  125  269:invokevirtual   #263 <Method void Bundle.putString(String, String)>
		zze(((Bundle) (s)));
	//  126  272:aload_0         
	//  127  273:aload_1         
	//  128  274:invokespecial   #108 <Method void zze(Bundle)>
		obj1;
	//  129  277:aload           9
		JVM INSTR monitorexit ;
	//  130  279:monitorexit     
		return;
	//  131  280:return          
		s;
	//  132  281:astore_1        
		obj1;
	//  133  282:aload           9
		JVM INSTR monitorexit ;
	//  134  284:monitorexit     
		throw s;
	//  135  285:aload_1         
	//  136  286:athrow          
	}

	public final void zzab(boolean flag)
	{
label0:
		{
			zzqr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #314 <Method void zzqr()>
			synchronized(mLock)
	//*   2    4:aload_0         
	//*   3    5:getfield        #48  <Field Object mLock>
	//*   4    8:astore_2        
	//*   5    9:aload_2         
	//*   6   10:monitorenter    
			{
				if(zzcik != flag)
					break label0;
	//    7   11:aload_0         
	//    8   12:getfield        #57  <Field boolean zzcik>
	//    9   15:iload_1         
	//   10   16:icmpne          22
			}
	//   11   19:aload_2         
	//   12   20:monitorexit     
			return;
	//   13   21:return          
		}
		zzcik = flag;
	//   14   22:aload_0         
	//   15   23:iload_1         
	//   16   24:putfield        #57  <Field boolean zzcik>
		if(zzcqw != null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//*  19   31:ifnull          56
		{
			zzcqw.putBoolean("use_https", flag);
	//   20   34:aload_0         
	//   21   35:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//   22   38:ldc1            #225 <String "use_https">
	//   23   40:iload_1         
	//   24   41:invokeinterface #387 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   25   46:pop             
			zzcqw.apply();
	//   26   47:aload_0         
	//   27   48:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//   28   51:invokeinterface #382 <Method void android.content.SharedPreferences$Editor.apply()>
		}
		if(!zzcqx)
	//*  29   56:aload_0         
	//*  30   57:getfield        #55  <Field boolean zzcqx>
	//*  31   60:ifne            83
		{
			Bundle bundle = new Bundle();
	//   32   63:new             #216 <Class Bundle>
	//   33   66:dup             
	//   34   67:invokespecial   #217 <Method void Bundle()>
	//   35   70:astore_3        
			bundle.putBoolean("use_https", flag);
	//   36   71:aload_3         
	//   37   72:ldc1            #225 <String "use_https">
	//   38   74:iload_1         
	//   39   75:invokevirtual   #223 <Method void Bundle.putBoolean(String, boolean)>
			zze(bundle);
	//   40   78:aload_0         
	//   41   79:aload_3         
	//   42   80:invokespecial   #108 <Method void zze(Bundle)>
		}
		obj;
	//   43   83:aload_2         
		JVM INSTR monitorexit ;
	//   44   84:monitorexit     
		return;
	//   45   85:return          
		exception;
	//   46   86:astore_3        
		obj;
	//   47   87:aload_2         
		JVM INSTR monitorexit ;
	//   48   88:monitorexit     
		throw exception;
	//   49   89:aload_3         
	//   50   90:athrow          
	}

	public final void zzac(boolean flag)
	{
label0:
		{
			zzqr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #314 <Method void zzqr()>
			synchronized(mLock)
	//*   2    4:aload_0         
	//*   3    5:getfield        #48  <Field Object mLock>
	//*   4    8:astore_2        
	//*   5    9:aload_2         
	//*   6   10:monitorenter    
			{
				if(zzcil != flag)
					break label0;
	//    7   11:aload_0         
	//    8   12:getfield        #88  <Field boolean zzcil>
	//    9   15:iload_1         
	//   10   16:icmpne          22
			}
	//   11   19:aload_2         
	//   12   20:monitorexit     
			return;
	//   13   21:return          
		}
		zzcil = flag;
	//   14   22:aload_0         
	//   15   23:iload_1         
	//   16   24:putfield        #88  <Field boolean zzcil>
		if(zzcqw != null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//*  19   31:ifnull          56
		{
			zzcqw.putBoolean("content_url_opted_out", flag);
	//   20   34:aload_0         
	//   21   35:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//   22   38:ldc1            #227 <String "content_url_opted_out">
	//   23   40:iload_1         
	//   24   41:invokeinterface #387 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   25   46:pop             
			zzcqw.apply();
	//   26   47:aload_0         
	//   27   48:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//   28   51:invokeinterface #382 <Method void android.content.SharedPreferences$Editor.apply()>
		}
		Bundle bundle = new Bundle();
	//   29   56:new             #216 <Class Bundle>
	//   30   59:dup             
	//   31   60:invokespecial   #217 <Method void Bundle()>
	//   32   63:astore_3        
		bundle.putBoolean("content_url_opted_out", zzcil);
	//   33   64:aload_3         
	//   34   65:ldc1            #227 <String "content_url_opted_out">
	//   35   67:aload_0         
	//   36   68:getfield        #88  <Field boolean zzcil>
	//   37   71:invokevirtual   #223 <Method void Bundle.putBoolean(String, boolean)>
		bundle.putBoolean("content_vertical_opted_out", zzcim);
	//   38   74:aload_3         
	//   39   75:ldc1            #229 <String "content_vertical_opted_out">
	//   40   77:aload_0         
	//   41   78:getfield        #90  <Field boolean zzcim>
	//   42   81:invokevirtual   #223 <Method void Bundle.putBoolean(String, boolean)>
		zze(bundle);
	//   43   84:aload_0         
	//   44   85:aload_3         
	//   45   86:invokespecial   #108 <Method void zze(Bundle)>
		obj;
	//   46   89:aload_2         
		JVM INSTR monitorexit ;
	//   47   90:monitorexit     
		return;
	//   48   91:return          
		exception;
	//   49   92:astore_3        
		obj;
	//   50   93:aload_2         
		JVM INSTR monitorexit ;
	//   51   94:monitorexit     
		throw exception;
	//   52   95:aload_3         
	//   53   96:athrow          
	}

	public final void zzad(boolean flag)
	{
label0:
		{
			zzqr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #314 <Method void zzqr()>
			synchronized(mLock)
	//*   2    4:aload_0         
	//*   3    5:getfield        #48  <Field Object mLock>
	//*   4    8:astore_2        
	//*   5    9:aload_2         
	//*   6   10:monitorenter    
			{
				if(zzcim != flag)
					break label0;
	//    7   11:aload_0         
	//    8   12:getfield        #90  <Field boolean zzcim>
	//    9   15:iload_1         
	//   10   16:icmpne          22
			}
	//   11   19:aload_2         
	//   12   20:monitorexit     
			return;
	//   13   21:return          
		}
		zzcim = flag;
	//   14   22:aload_0         
	//   15   23:iload_1         
	//   16   24:putfield        #90  <Field boolean zzcim>
		if(zzcqw != null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//*  19   31:ifnull          56
		{
			zzcqw.putBoolean("content_vertical_opted_out", flag);
	//   20   34:aload_0         
	//   21   35:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//   22   38:ldc1            #229 <String "content_vertical_opted_out">
	//   23   40:iload_1         
	//   24   41:invokeinterface #387 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   25   46:pop             
			zzcqw.apply();
	//   26   47:aload_0         
	//   27   48:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//   28   51:invokeinterface #382 <Method void android.content.SharedPreferences$Editor.apply()>
		}
		Bundle bundle = new Bundle();
	//   29   56:new             #216 <Class Bundle>
	//   30   59:dup             
	//   31   60:invokespecial   #217 <Method void Bundle()>
	//   32   63:astore_3        
		bundle.putBoolean("content_url_opted_out", zzcil);
	//   33   64:aload_3         
	//   34   65:ldc1            #227 <String "content_url_opted_out">
	//   35   67:aload_0         
	//   36   68:getfield        #88  <Field boolean zzcil>
	//   37   71:invokevirtual   #223 <Method void Bundle.putBoolean(String, boolean)>
		bundle.putBoolean("content_vertical_opted_out", zzcim);
	//   38   74:aload_3         
	//   39   75:ldc1            #229 <String "content_vertical_opted_out">
	//   40   77:aload_0         
	//   41   78:getfield        #90  <Field boolean zzcim>
	//   42   81:invokevirtual   #223 <Method void Bundle.putBoolean(String, boolean)>
		zze(bundle);
	//   43   84:aload_0         
	//   44   85:aload_3         
	//   45   86:invokespecial   #108 <Method void zze(Bundle)>
		obj;
	//   46   89:aload_2         
		JVM INSTR monitorexit ;
	//   47   90:monitorexit     
		return;
	//   48   91:return          
		exception;
	//   49   92:astore_3        
		obj;
	//   50   93:aload_2         
		JVM INSTR monitorexit ;
	//   51   94:monitorexit     
		throw exception;
	//   52   95:aload_3         
	//   53   96:athrow          
	}

	public final void zzae(int i)
	{
label0:
		{
			zzqr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #314 <Method void zzqr()>
			synchronized(mLock)
	//*   2    4:aload_0         
	//*   3    5:getfield        #48  <Field Object mLock>
	//*   4    8:astore_2        
	//*   5    9:aload_2         
	//*   6   10:monitorenter    
			{
				if(zzcrd != i)
					break label0;
	//    7   11:aload_0         
	//    8   12:getfield        #73  <Field int zzcrd>
	//    9   15:iload_1         
	//   10   16:icmpne          22
			}
	//   11   19:aload_2         
	//   12   20:monitorexit     
			return;
	//   13   21:return          
		}
		zzcrd = i;
	//   14   22:aload_0         
	//   15   23:iload_1         
	//   16   24:putfield        #73  <Field int zzcrd>
		if(zzcqw != null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//*  19   31:ifnull          56
		{
			zzcqw.putInt("version_code", i);
	//   20   34:aload_0         
	//   21   35:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//   22   38:ldc1            #233 <String "version_code">
	//   23   40:iload_1         
	//   24   41:invokeinterface #394 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//   25   46:pop             
			zzcqw.apply();
	//   26   47:aload_0         
	//   27   48:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//   28   51:invokeinterface #382 <Method void android.content.SharedPreferences$Editor.apply()>
		}
		Bundle bundle = new Bundle();
	//   29   56:new             #216 <Class Bundle>
	//   30   59:dup             
	//   31   60:invokespecial   #217 <Method void Bundle()>
	//   32   63:astore_3        
		bundle.putInt("version_code", i);
	//   33   64:aload_3         
	//   34   65:ldc1            #233 <String "version_code">
	//   35   67:iload_1         
	//   36   68:invokevirtual   #237 <Method void Bundle.putInt(String, int)>
		zze(bundle);
	//   37   71:aload_0         
	//   38   72:aload_3         
	//   39   73:invokespecial   #108 <Method void zze(Bundle)>
		obj;
	//   40   76:aload_2         
		JVM INSTR monitorexit ;
	//   41   77:monitorexit     
		return;
	//   42   78:return          
		exception;
	//   43   79:astore_3        
		obj;
	//   44   80:aload_2         
		JVM INSTR monitorexit ;
	//   45   81:monitorexit     
		throw exception;
	//   46   82:aload_3         
	//   47   83:athrow          
	}

	public final void zzae(boolean flag)
	{
label0:
		{
			zzqr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #314 <Method void zzqr()>
			synchronized(mLock)
	//*   2    4:aload_0         
	//*   3    5:getfield        #48  <Field Object mLock>
	//*   4    8:astore_2        
	//*   5    9:aload_2         
	//*   6   10:monitorenter    
			{
				if(zzcit != flag)
					break label0;
	//    7   11:aload_0         
	//    8   12:getfield        #59  <Field boolean zzcit>
	//    9   15:iload_1         
	//   10   16:icmpne          22
			}
	//   11   19:aload_2         
	//   12   20:monitorexit     
			return;
	//   13   21:return          
		}
		zzcit = flag;
	//   14   22:aload_0         
	//   15   23:iload_1         
	//   16   24:putfield        #59  <Field boolean zzcit>
		if(zzcqw != null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//*  19   31:ifnull          56
		{
			zzcqw.putBoolean("auto_collect_location", flag);
	//   20   34:aload_0         
	//   21   35:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//   22   38:ldc1            #231 <String "auto_collect_location">
	//   23   40:iload_1         
	//   24   41:invokeinterface #387 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   25   46:pop             
			zzcqw.apply();
	//   26   47:aload_0         
	//   27   48:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//   28   51:invokeinterface #382 <Method void android.content.SharedPreferences$Editor.apply()>
		}
		Bundle bundle = new Bundle();
	//   29   56:new             #216 <Class Bundle>
	//   30   59:dup             
	//   31   60:invokespecial   #217 <Method void Bundle()>
	//   32   63:astore_3        
		bundle.putBoolean("auto_collect_location", flag);
	//   33   64:aload_3         
	//   34   65:ldc1            #231 <String "auto_collect_location">
	//   35   67:iload_1         
	//   36   68:invokevirtual   #223 <Method void Bundle.putBoolean(String, boolean)>
		zze(bundle);
	//   37   71:aload_0         
	//   38   72:aload_3         
	//   39   73:invokespecial   #108 <Method void zze(Bundle)>
		obj;
	//   40   76:aload_2         
		JVM INSTR monitorexit ;
	//   41   77:monitorexit     
		return;
	//   42   78:return          
		exception;
	//   43   79:astore_3        
		obj;
	//   44   80:aload_2         
		JVM INSTR monitorexit ;
	//   45   81:monitorexit     
		throw exception;
	//   46   82:aload_3         
	//   47   83:athrow          
	}

	public final void zzaf(int i)
	{
label0:
		{
			zzqr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #314 <Method void zzqr()>
			synchronized(mLock)
	//*   2    4:aload_0         
	//*   3    5:getfield        #48  <Field Object mLock>
	//*   4    8:astore_2        
	//*   5    9:aload_2         
	//*   6   10:monitorenter    
			{
				if(zzcqg != i)
					break label0;
	//    7   11:aload_0         
	//    8   12:getfield        #71  <Field int zzcqg>
	//    9   15:iload_1         
	//   10   16:icmpne          22
			}
	//   11   19:aload_2         
	//   12   20:monitorexit     
			return;
	//   13   21:return          
		}
		zzcqg = i;
	//   14   22:aload_0         
	//   15   23:iload_1         
	//   16   24:putfield        #71  <Field int zzcqg>
		if(zzcqw != null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//*  19   31:ifnull          57
		{
			zzcqw.putInt("request_in_session_count", i);
	//   20   34:aload_0         
	//   21   35:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//   22   38:ldc2            #273 <String "request_in_session_count">
	//   23   41:iload_1         
	//   24   42:invokeinterface #394 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//   25   47:pop             
			zzcqw.apply();
	//   26   48:aload_0         
	//   27   49:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//   28   52:invokeinterface #382 <Method void android.content.SharedPreferences$Editor.apply()>
		}
		Bundle bundle = new Bundle();
	//   29   57:new             #216 <Class Bundle>
	//   30   60:dup             
	//   31   61:invokespecial   #217 <Method void Bundle()>
	//   32   64:astore_3        
		bundle.putInt("request_in_session_count", i);
	//   33   65:aload_3         
	//   34   66:ldc2            #273 <String "request_in_session_count">
	//   35   69:iload_1         
	//   36   70:invokevirtual   #237 <Method void Bundle.putInt(String, int)>
		zze(bundle);
	//   37   73:aload_0         
	//   38   74:aload_3         
	//   39   75:invokespecial   #108 <Method void zze(Bundle)>
		obj;
	//   40   78:aload_2         
		JVM INSTR monitorexit ;
	//   41   79:monitorexit     
		return;
	//   42   80:return          
		exception;
	//   43   81:astore_3        
		obj;
	//   44   82:aload_2         
		JVM INSTR monitorexit ;
	//   45   83:monitorexit     
		throw exception;
	//   46   84:aload_3         
	//   47   85:athrow          
	}

	public final void zzcn(String s)
	{
		zzqr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #314 <Method void zzqr()>
		Object obj = mLock;
	//    2    4:aload_0         
	//    3    5:getfield        #48  <Field Object mLock>
	//    4    8:astore_2        
		obj;
	//    5    9:aload_2         
		JVM INSTR monitorenter ;
	//    6   10:monitorenter    
		if(s == null)
			break MISSING_BLOCK_LABEL_88;
	//    7   11:aload_1         
	//    8   12:ifnull          88
		if(s.equals(((Object) (zzcqy))))
	//*   9   15:aload_1         
	//*  10   16:aload_0         
	//*  11   17:getfield        #101 <Field String zzcqy>
	//*  12   20:invokevirtual   #337 <Method boolean String.equals(Object)>
	//*  13   23:ifeq            29
			break MISSING_BLOCK_LABEL_88;
	//   14   26:goto            88
		zzcqy = s;
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:putfield        #101 <Field String zzcqy>
		if(zzcqw != null)
	//*  18   34:aload_0         
	//*  19   35:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//*  20   38:ifnull          64
		{
			zzcqw.putString("content_url_hashes", s);
	//   21   41:aload_0         
	//   22   42:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//   23   45:ldc2            #283 <String "content_url_hashes">
	//   24   48:aload_1         
	//   25   49:invokeinterface #379 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   26   54:pop             
			zzcqw.apply();
	//   27   55:aload_0         
	//   28   56:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//   29   59:invokeinterface #382 <Method void android.content.SharedPreferences$Editor.apply()>
		}
		Bundle bundle = new Bundle();
	//   30   64:new             #216 <Class Bundle>
	//   31   67:dup             
	//   32   68:invokespecial   #217 <Method void Bundle()>
	//   33   71:astore_3        
		bundle.putString("content_url_hashes", s);
	//   34   72:aload_3         
	//   35   73:ldc2            #283 <String "content_url_hashes">
	//   36   76:aload_1         
	//   37   77:invokevirtual   #263 <Method void Bundle.putString(String, String)>
		zze(bundle);
	//   38   80:aload_0         
	//   39   81:aload_3         
	//   40   82:invokespecial   #108 <Method void zze(Bundle)>
		obj;
	//   41   85:aload_2         
		JVM INSTR monitorexit ;
	//   42   86:monitorexit     
		return;
	//   43   87:return          
		obj;
	//   44   88:aload_2         
		JVM INSTR monitorexit ;
	//   45   89:monitorexit     
		return;
	//   46   90:return          
_L2:
		obj;
	//   47   91:aload_2         
		JVM INSTR monitorexit ;
	//   48   92:monitorexit     
		throw s;
	//   49   93:aload_1         
	//   50   94:athrow          
		s;
	//   51   95:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  52   96:goto            91
	}

	public final void zzco(String s)
	{
		zzqr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #314 <Method void zzqr()>
		Object obj = mLock;
	//    2    4:aload_0         
	//    3    5:getfield        #48  <Field Object mLock>
	//    4    8:astore_2        
		obj;
	//    5    9:aload_2         
		JVM INSTR monitorenter ;
	//    6   10:monitorenter    
		if(s == null)
			break MISSING_BLOCK_LABEL_88;
	//    7   11:aload_1         
	//    8   12:ifnull          88
		if(s.equals(((Object) (zzcqz))))
	//*   9   15:aload_1         
	//*  10   16:aload_0         
	//*  11   17:getfield        #112 <Field String zzcqz>
	//*  12   20:invokevirtual   #337 <Method boolean String.equals(Object)>
	//*  13   23:ifeq            29
			break MISSING_BLOCK_LABEL_88;
	//   14   26:goto            88
		zzcqz = s;
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:putfield        #112 <Field String zzcqz>
		if(zzcqw != null)
	//*  18   34:aload_0         
	//*  19   35:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//*  20   38:ifnull          64
		{
			zzcqw.putString("content_vertical_hashes", s);
	//   21   41:aload_0         
	//   22   42:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//   23   45:ldc2            #285 <String "content_vertical_hashes">
	//   24   48:aload_1         
	//   25   49:invokeinterface #379 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   26   54:pop             
			zzcqw.apply();
	//   27   55:aload_0         
	//   28   56:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//   29   59:invokeinterface #382 <Method void android.content.SharedPreferences$Editor.apply()>
		}
		Bundle bundle = new Bundle();
	//   30   64:new             #216 <Class Bundle>
	//   31   67:dup             
	//   32   68:invokespecial   #217 <Method void Bundle()>
	//   33   71:astore_3        
		bundle.putString("content_vertical_hashes", s);
	//   34   72:aload_3         
	//   35   73:ldc2            #285 <String "content_vertical_hashes">
	//   36   76:aload_1         
	//   37   77:invokevirtual   #263 <Method void Bundle.putString(String, String)>
		zze(bundle);
	//   38   80:aload_0         
	//   39   81:aload_3         
	//   40   82:invokespecial   #108 <Method void zze(Bundle)>
		obj;
	//   41   85:aload_2         
		JVM INSTR monitorexit ;
	//   42   86:monitorexit     
		return;
	//   43   87:return          
		obj;
	//   44   88:aload_2         
		JVM INSTR monitorexit ;
	//   45   89:monitorexit     
		return;
	//   46   90:return          
_L2:
		obj;
	//   47   91:aload_2         
		JVM INSTR monitorexit ;
	//   48   92:monitorexit     
		throw s;
	//   49   93:aload_1         
	//   50   94:athrow          
		s;
	//   51   95:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  52   96:goto            91
	}

	public final void zzcp(String s)
	{
label0:
		{
			zzqr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #314 <Method void zzqr()>
			synchronized(mLock)
	//*   2    4:aload_0         
	//*   3    5:getfield        #48  <Field Object mLock>
	//*   4    8:astore_2        
	//*   5    9:aload_2         
	//*   6   10:monitorenter    
			{
				if(!zzcre.contains(((Object) (s))))
					break label0;
	//    7   11:aload_0         
	//    8   12:getfield        #81  <Field Set zzcre>
	//    9   15:aload_1         
	//   10   16:invokeinterface #403 <Method boolean Set.contains(Object)>
	//   11   21:ifeq            27
			}
	//   12   24:aload_2         
	//   13   25:monitorexit     
			return;
	//   14   26:return          
		}
		zzcre.add(((Object) (s)));
	//   15   27:aload_0         
	//   16   28:getfield        #81  <Field Set zzcre>
	//   17   31:aload_1         
	//   18   32:invokeinterface #404 <Method boolean Set.add(Object)>
	//   19   37:pop             
		if(zzcqw != null)
	//*  20   38:aload_0         
	//*  21   39:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//*  22   42:ifnull          70
		{
			zzcqw.putStringSet("never_pool_slots", zzcre);
	//   23   45:aload_0         
	//   24   46:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//   25   49:ldc1            #239 <String "never_pool_slots">
	//   26   51:aload_0         
	//   27   52:getfield        #81  <Field Set zzcre>
	//   28   55:invokeinterface #408 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putStringSet(String, Set)>
	//   29   60:pop             
			zzcqw.apply();
	//   30   61:aload_0         
	//   31   62:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//   32   65:invokeinterface #382 <Method void android.content.SharedPreferences$Editor.apply()>
		}
		s = ((String) (new Bundle()));
	//   33   70:new             #216 <Class Bundle>
	//   34   73:dup             
	//   35   74:invokespecial   #217 <Method void Bundle()>
	//   36   77:astore_1        
		((Bundle) (s)).putStringArray("never_pool_slots", (String[])zzcre.toArray(((Object []) (new String[zzcre.size()]))));
	//   37   78:aload_1         
	//   38   79:ldc1            #239 <String "never_pool_slots">
	//   39   81:aload_0         
	//   40   82:getfield        #81  <Field Set zzcre>
	//   41   85:aload_0         
	//   42   86:getfield        #81  <Field Set zzcre>
	//   43   89:invokeinterface #245 <Method int Set.size()>
	//   44   94:anewarray       String[]
	//   45   97:invokeinterface #251 <Method Object[] Set.toArray(Object[])>
	//   46  102:checkcast       #253 <Class String[]>
	//   47  105:invokevirtual   #257 <Method void Bundle.putStringArray(String, String[])>
		zze(((Bundle) (s)));
	//   48  108:aload_0         
	//   49  109:aload_1         
	//   50  110:invokespecial   #108 <Method void zze(Bundle)>
		obj;
	//   51  113:aload_2         
		JVM INSTR monitorexit ;
	//   52  114:monitorexit     
		return;
	//   53  115:return          
		s;
	//   54  116:astore_1        
		obj;
	//   55  117:aload_2         
		JVM INSTR monitorexit ;
	//   56  118:monitorexit     
		throw s;
	//   57  119:aload_1         
	//   58  120:athrow          
	}

	public final void zzcq(String s)
	{
label0:
		{
			zzqr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #314 <Method void zzqr()>
			synchronized(mLock)
	//*   2    4:aload_0         
	//*   3    5:getfield        #48  <Field Object mLock>
	//*   4    8:astore_2        
	//*   5    9:aload_2         
	//*   6   10:monitorenter    
			{
				if(zzcre.contains(((Object) (s))))
					break label0;
	//    7   11:aload_0         
	//    8   12:getfield        #81  <Field Set zzcre>
	//    9   15:aload_1         
	//   10   16:invokeinterface #403 <Method boolean Set.contains(Object)>
	//   11   21:ifne            27
			}
	//   12   24:aload_2         
	//   13   25:monitorexit     
			return;
	//   14   26:return          
		}
		zzcre.remove(((Object) (s)));
	//   15   27:aload_0         
	//   16   28:getfield        #81  <Field Set zzcre>
	//   17   31:aload_1         
	//   18   32:invokeinterface #412 <Method boolean Set.remove(Object)>
	//   19   37:pop             
		if(zzcqw != null)
	//*  20   38:aload_0         
	//*  21   39:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//*  22   42:ifnull          70
		{
			zzcqw.putStringSet("never_pool_slots", zzcre);
	//   23   45:aload_0         
	//   24   46:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//   25   49:ldc1            #239 <String "never_pool_slots">
	//   26   51:aload_0         
	//   27   52:getfield        #81  <Field Set zzcre>
	//   28   55:invokeinterface #408 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putStringSet(String, Set)>
	//   29   60:pop             
			zzcqw.apply();
	//   30   61:aload_0         
	//   31   62:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//   32   65:invokeinterface #382 <Method void android.content.SharedPreferences$Editor.apply()>
		}
		s = ((String) (new Bundle()));
	//   33   70:new             #216 <Class Bundle>
	//   34   73:dup             
	//   35   74:invokespecial   #217 <Method void Bundle()>
	//   36   77:astore_1        
		((Bundle) (s)).putStringArray("never_pool_slots", (String[])zzcre.toArray(((Object []) (new String[zzcre.size()]))));
	//   37   78:aload_1         
	//   38   79:ldc1            #239 <String "never_pool_slots">
	//   39   81:aload_0         
	//   40   82:getfield        #81  <Field Set zzcre>
	//   41   85:aload_0         
	//   42   86:getfield        #81  <Field Set zzcre>
	//   43   89:invokeinterface #245 <Method int Set.size()>
	//   44   94:anewarray       String[]
	//   45   97:invokeinterface #251 <Method Object[] Set.toArray(Object[])>
	//   46  102:checkcast       #253 <Class String[]>
	//   47  105:invokevirtual   #257 <Method void Bundle.putStringArray(String, String[])>
		zze(((Bundle) (s)));
	//   48  108:aload_0         
	//   49  109:aload_1         
	//   50  110:invokespecial   #108 <Method void zze(Bundle)>
		obj;
	//   51  113:aload_2         
		JVM INSTR monitorexit ;
	//   52  114:monitorexit     
		return;
	//   53  115:return          
		s;
	//   54  116:astore_1        
		obj;
	//   55  117:aload_2         
		JVM INSTR monitorexit ;
	//   56  118:monitorexit     
		throw s;
	//   57  119:aload_1         
	//   58  120:athrow          
	}

	public final boolean zzcr(String s)
	{
		zzqr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #314 <Method void zzqr()>
		boolean flag;
		synchronized(mLock)
	//*   2    4:aload_0         
	//*   3    5:getfield        #48  <Field Object mLock>
	//*   4    8:astore_3        
	//*   5    9:aload_3         
	//*   6   10:monitorenter    
		{
			flag = zzcre.contains(((Object) (s)));
	//    7   11:aload_0         
	//    8   12:getfield        #81  <Field Set zzcre>
	//    9   15:aload_1         
	//   10   16:invokeinterface #403 <Method boolean Set.contains(Object)>
	//   11   21:istore_2        
		}
	//   12   22:aload_3         
	//   13   23:monitorexit     
		return flag;
	//   14   24:iload_2         
	//   15   25:ireturn         
		s;
	//   16   26:astore_1        
		obj;
	//   17   27:aload_3         
		JVM INSTR monitorexit ;
	//   18   28:monitorexit     
		throw s;
	//   19   29:aload_1         
	//   20   30:athrow          
	}

	public final void zzcs(String s)
	{
		zzqr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #314 <Method void zzqr()>
		Object obj = mLock;
	//    2    4:aload_0         
	//    3    5:getfield        #48  <Field Object mLock>
	//    4    8:astore          4
		obj;
	//    5   10:aload           4
		JVM INSTR monitorenter ;
	//    6   12:monitorenter    
		long l;
		l = zzbv.zzer().currentTimeMillis();
	//    7   13:invokestatic    #358 <Method Clock zzbv.zzer()>
	//    8   16:invokeinterface #364 <Method long Clock.currentTimeMillis()>
	//    9   21:lstore_2        
		zzcra = l;
	//   10   22:aload_0         
	//   11   23:lload_2         
	//   12   24:putfield        #65  <Field long zzcra>
		if(s == null)
			break MISSING_BLOCK_LABEL_131;
	//   13   27:aload_1         
	//   14   28:ifnull          131
		if(s.equals(((Object) (zzcpj))))
	//*  15   31:aload_1         
	//*  16   32:aload_0         
	//*  17   33:getfield        #63  <Field String zzcpj>
	//*  18   36:invokevirtual   #337 <Method boolean String.equals(Object)>
	//*  19   39:ifeq            45
			break MISSING_BLOCK_LABEL_131;
	//   20   42:goto            131
		zzcpj = s;
	//   21   45:aload_0         
	//   22   46:aload_1         
	//   23   47:putfield        #63  <Field String zzcpj>
		if(zzcqw != null)
	//*  24   50:aload_0         
	//*  25   51:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//*  26   54:ifnull          94
		{
			zzcqw.putString("app_settings_json", s);
	//   27   57:aload_0         
	//   28   58:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//   29   61:ldc2            #259 <String "app_settings_json">
	//   30   64:aload_1         
	//   31   65:invokeinterface #379 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   32   70:pop             
			zzcqw.putLong("app_settings_last_update_ms", l);
	//   33   71:aload_0         
	//   34   72:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//   35   75:ldc2            #265 <String "app_settings_last_update_ms">
	//   36   78:lload_2         
	//   37   79:invokeinterface #418 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   38   84:pop             
			zzcqw.apply();
	//   39   85:aload_0         
	//   40   86:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//   41   89:invokeinterface #382 <Method void android.content.SharedPreferences$Editor.apply()>
		}
		Bundle bundle = new Bundle();
	//   42   94:new             #216 <Class Bundle>
	//   43   97:dup             
	//   44   98:invokespecial   #217 <Method void Bundle()>
	//   45  101:astore          5
		bundle.putString("app_settings_json", s);
	//   46  103:aload           5
	//   47  105:ldc2            #259 <String "app_settings_json">
	//   48  108:aload_1         
	//   49  109:invokevirtual   #263 <Method void Bundle.putString(String, String)>
		bundle.putLong("app_settings_last_update_ms", l);
	//   50  112:aload           5
	//   51  114:ldc2            #265 <String "app_settings_last_update_ms">
	//   52  117:lload_2         
	//   53  118:invokevirtual   #269 <Method void Bundle.putLong(String, long)>
		zze(bundle);
	//   54  121:aload_0         
	//   55  122:aload           5
	//   56  124:invokespecial   #108 <Method void zze(Bundle)>
		obj;
	//   57  127:aload           4
		JVM INSTR monitorexit ;
	//   58  129:monitorexit     
		return;
	//   59  130:return          
		obj;
	//   60  131:aload           4
		JVM INSTR monitorexit ;
	//   61  133:monitorexit     
		return;
	//   62  134:return          
		s;
	//   63  135:astore_1        
		obj;
	//   64  136:aload           4
		JVM INSTR monitorexit ;
	//   65  138:monitorexit     
		throw s;
	//   66  139:aload_1         
	//   67  140:athrow          
	}

	public final void zzj(long l)
	{
label0:
		{
			zzqr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #314 <Method void zzqr()>
			synchronized(mLock)
	//*   2    4:aload_0         
	//*   3    5:getfield        #48  <Field Object mLock>
	//*   4    8:astore_3        
	//*   5    9:aload_3         
	//*   6   10:monitorenter    
			{
				if(zzcrb != l)
					break label0;
	//    7   11:aload_0         
	//    8   12:getfield        #67  <Field long zzcrb>
	//    9   15:lload_1         
	//   10   16:lcmp            
	//   11   17:ifne            23
			}
	//   12   20:aload_3         
	//   13   21:monitorexit     
			return;
	//   14   22:return          
		}
		zzcrb = l;
	//   15   23:aload_0         
	//   16   24:lload_1         
	//   17   25:putfield        #67  <Field long zzcrb>
		if(zzcqw != null)
	//*  18   28:aload_0         
	//*  19   29:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//*  20   32:ifnull          58
		{
			zzcqw.putLong("app_last_background_time_ms", l);
	//   21   35:aload_0         
	//   22   36:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//   23   39:ldc2            #271 <String "app_last_background_time_ms">
	//   24   42:lload_1         
	//   25   43:invokeinterface #418 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   26   48:pop             
			zzcqw.apply();
	//   27   49:aload_0         
	//   28   50:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//   29   53:invokeinterface #382 <Method void android.content.SharedPreferences$Editor.apply()>
		}
		Bundle bundle = new Bundle();
	//   30   58:new             #216 <Class Bundle>
	//   31   61:dup             
	//   32   62:invokespecial   #217 <Method void Bundle()>
	//   33   65:astore          4
		bundle.putLong("app_last_background_time_ms", l);
	//   34   67:aload           4
	//   35   69:ldc2            #271 <String "app_last_background_time_ms">
	//   36   72:lload_1         
	//   37   73:invokevirtual   #269 <Method void Bundle.putLong(String, long)>
		zze(bundle);
	//   38   76:aload_0         
	//   39   77:aload           4
	//   40   79:invokespecial   #108 <Method void zze(Bundle)>
		obj;
	//   41   82:aload_3         
		JVM INSTR monitorexit ;
	//   42   83:monitorexit     
		return;
	//   43   84:return          
		exception;
	//   44   85:astore          4
		obj;
	//   45   87:aload_3         
		JVM INSTR monitorexit ;
	//   46   88:monitorexit     
		throw exception;
	//   47   89:aload           4
	//   48   91:athrow          
	}

	public final void zzk(long l)
	{
label0:
		{
			zzqr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #314 <Method void zzqr()>
			synchronized(mLock)
	//*   2    4:aload_0         
	//*   3    5:getfield        #48  <Field Object mLock>
	//*   4    8:astore_3        
	//*   5    9:aload_3         
	//*   6   10:monitorenter    
			{
				if(zzcrc != l)
					break label0;
	//    7   11:aload_0         
	//    8   12:getfield        #69  <Field long zzcrc>
	//    9   15:lload_1         
	//   10   16:lcmp            
	//   11   17:ifne            23
			}
	//   12   20:aload_3         
	//   13   21:monitorexit     
			return;
	//   14   22:return          
		}
		zzcrc = l;
	//   15   23:aload_0         
	//   16   24:lload_1         
	//   17   25:putfield        #69  <Field long zzcrc>
		if(zzcqw != null)
	//*  18   28:aload_0         
	//*  19   29:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//*  20   32:ifnull          58
		{
			zzcqw.putLong("first_ad_req_time_ms", l);
	//   21   35:aload_0         
	//   22   36:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//   23   39:ldc2            #275 <String "first_ad_req_time_ms">
	//   24   42:lload_1         
	//   25   43:invokeinterface #418 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   26   48:pop             
			zzcqw.apply();
	//   27   49:aload_0         
	//   28   50:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//   29   53:invokeinterface #382 <Method void android.content.SharedPreferences$Editor.apply()>
		}
		Bundle bundle = new Bundle();
	//   30   58:new             #216 <Class Bundle>
	//   31   61:dup             
	//   32   62:invokespecial   #217 <Method void Bundle()>
	//   33   65:astore          4
		bundle.putLong("first_ad_req_time_ms", l);
	//   34   67:aload           4
	//   35   69:ldc2            #275 <String "first_ad_req_time_ms">
	//   36   72:lload_1         
	//   37   73:invokevirtual   #269 <Method void Bundle.putLong(String, long)>
		zze(bundle);
	//   38   76:aload_0         
	//   39   77:aload           4
	//   40   79:invokespecial   #108 <Method void zze(Bundle)>
		obj;
	//   41   82:aload_3         
		JVM INSTR monitorexit ;
	//   42   83:monitorexit     
		return;
	//   43   84:return          
		exception;
	//   44   85:astore          4
		obj;
	//   45   87:aload_3         
		JVM INSTR monitorexit ;
	//   46   88:monitorexit     
		throw exception;
	//   47   89:aload           4
	//   48   91:athrow          
	}

	public final boolean zzqt()
	{
		zzqr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #314 <Method void zzqr()>
		Object obj = mLock;
	//    2    4:aload_0         
	//    3    5:getfield        #48  <Field Object mLock>
	//    4    8:astore_2        
		obj;
	//    5    9:aload_2         
		JVM INSTR monitorenter ;
	//    6   10:monitorenter    
		boolean flag;
		Exception exception;
		if(!zzcik && !zzcqx)
	//*   7   11:aload_0         
	//*   8   12:getfield        #57  <Field boolean zzcik>
	//*   9   15:ifne            42
	//*  10   18:aload_0         
	//*  11   19:getfield        #55  <Field boolean zzcqx>
	//*  12   22:ifeq            37
	//*  13   25:goto            42
	//*  14   28:aload_2         
	//*  15   29:monitorexit     
	//*  16   30:iload_1         
	//*  17   31:ireturn         
	//*  18   32:astore_3        
	//*  19   33:aload_2         
	//*  20   34:monitorexit     
	//*  21   35:aload_3         
	//*  22   36:athrow          
			flag = false;
	//   23   37:iconst_0        
	//   24   38:istore_1        
		else
	//*  25   39:goto            28
			flag = true;
	//   26   42:iconst_1        
	//   27   43:istore_1        
		obj;
		JVM INSTR monitorexit ;
		return flag;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  28   44:goto            28
	}

	public final boolean zzqu()
	{
		zzqr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #314 <Method void zzqr()>
		boolean flag;
		synchronized(mLock)
	//*   2    4:aload_0         
	//*   3    5:getfield        #48  <Field Object mLock>
	//*   4    8:astore_2        
	//*   5    9:aload_2         
	//*   6   10:monitorenter    
		{
			flag = zzcil;
	//    7   11:aload_0         
	//    8   12:getfield        #88  <Field boolean zzcil>
	//    9   15:istore_1        
		}
	//   10   16:aload_2         
	//   11   17:monitorexit     
		return flag;
	//   12   18:iload_1         
	//   13   19:ireturn         
		exception;
	//   14   20:astore_3        
		obj;
	//   15   21:aload_2         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw exception;
	//   17   23:aload_3         
	//   18   24:athrow          
	}

	public final String zzqv()
	{
		zzqr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #314 <Method void zzqr()>
		String s;
		synchronized(mLock)
	//*   2    4:aload_0         
	//*   3    5:getfield        #48  <Field Object mLock>
	//*   4    8:astore_1        
	//*   5    9:aload_1         
	//*   6   10:monitorenter    
		{
			s = zzcqy;
	//    7   11:aload_0         
	//    8   12:getfield        #101 <Field String zzcqy>
	//    9   15:astore_2        
		}
	//   10   16:aload_1         
	//   11   17:monitorexit     
		return s;
	//   12   18:aload_2         
	//   13   19:areturn         
		exception;
	//   14   20:astore_2        
		obj;
	//   15   21:aload_1         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw exception;
	//   17   23:aload_2         
	//   18   24:athrow          
	}

	public final boolean zzqw()
	{
		zzqr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #314 <Method void zzqr()>
		boolean flag;
		synchronized(mLock)
	//*   2    4:aload_0         
	//*   3    5:getfield        #48  <Field Object mLock>
	//*   4    8:astore_2        
	//*   5    9:aload_2         
	//*   6   10:monitorenter    
		{
			flag = zzcim;
	//    7   11:aload_0         
	//    8   12:getfield        #90  <Field boolean zzcim>
	//    9   15:istore_1        
		}
	//   10   16:aload_2         
	//   11   17:monitorexit     
		return flag;
	//   12   18:iload_1         
	//   13   19:ireturn         
		exception;
	//   14   20:astore_3        
		obj;
	//   15   21:aload_2         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw exception;
	//   17   23:aload_3         
	//   18   24:athrow          
	}

	public final String zzqx()
	{
		zzqr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #314 <Method void zzqr()>
		String s;
		synchronized(mLock)
	//*   2    4:aload_0         
	//*   3    5:getfield        #48  <Field Object mLock>
	//*   4    8:astore_1        
	//*   5    9:aload_1         
	//*   6   10:monitorenter    
		{
			s = zzcqz;
	//    7   11:aload_0         
	//    8   12:getfield        #112 <Field String zzcqz>
	//    9   15:astore_2        
		}
	//   10   16:aload_1         
	//   11   17:monitorexit     
		return s;
	//   12   18:aload_2         
	//   13   19:areturn         
		exception;
	//   14   20:astore_2        
		obj;
	//   15   21:aload_1         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw exception;
	//   17   23:aload_2         
	//   18   24:athrow          
	}

	public final boolean zzqy()
	{
		zzqr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #314 <Method void zzqr()>
		boolean flag;
		synchronized(mLock)
	//*   2    4:aload_0         
	//*   3    5:getfield        #48  <Field Object mLock>
	//*   4    8:astore_2        
	//*   5    9:aload_2         
	//*   6   10:monitorenter    
		{
			flag = zzcit;
	//    7   11:aload_0         
	//    8   12:getfield        #59  <Field boolean zzcit>
	//    9   15:istore_1        
		}
	//   10   16:aload_2         
	//   11   17:monitorexit     
		return flag;
	//   12   18:iload_1         
	//   13   19:ireturn         
		exception;
	//   14   20:astore_3        
		obj;
	//   15   21:aload_2         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw exception;
	//   17   23:aload_3         
	//   18   24:athrow          
	}

	public final int zzqz()
	{
		zzqr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #314 <Method void zzqr()>
		int i;
		synchronized(mLock)
	//*   2    4:aload_0         
	//*   3    5:getfield        #48  <Field Object mLock>
	//*   4    8:astore_2        
	//*   5    9:aload_2         
	//*   6   10:monitorenter    
		{
			i = zzcrd;
	//    7   11:aload_0         
	//    8   12:getfield        #73  <Field int zzcrd>
	//    9   15:istore_1        
		}
	//   10   16:aload_2         
	//   11   17:monitorexit     
		return i;
	//   12   18:iload_1         
	//   13   19:ireturn         
		exception;
	//   14   20:astore_3        
		obj;
	//   15   21:aload_2         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw exception;
	//   17   23:aload_3         
	//   18   24:athrow          
	}

	public final zzajl zzra()
	{
		zzqr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #314 <Method void zzqr()>
		zzajl zzajl1;
		synchronized(mLock)
	//*   2    4:aload_0         
	//*   3    5:getfield        #48  <Field Object mLock>
	//*   4    8:astore_1        
	//*   5    9:aload_1         
	//*   6   10:monitorenter    
		{
			zzajl1 = new zzajl(zzcpj, zzcra);
	//    7   11:new             #431 <Class zzajl>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:getfield        #63  <Field String zzcpj>
	//   11   19:aload_0         
	//   12   20:getfield        #65  <Field long zzcra>
	//   13   23:invokespecial   #433 <Method void zzajl(String, long)>
	//   14   26:astore_2        
		}
	//   15   27:aload_1         
	//   16   28:monitorexit     
		return zzajl1;
	//   17   29:aload_2         
	//   18   30:areturn         
		exception;
	//   19   31:astore_2        
		obj;
	//   20   32:aload_1         
		JVM INSTR monitorexit ;
	//   21   33:monitorexit     
		throw exception;
	//   22   34:aload_2         
	//   23   35:athrow          
	}

	public final long zzrb()
	{
		zzqr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #314 <Method void zzqr()>
		long l;
		synchronized(mLock)
	//*   2    4:aload_0         
	//*   3    5:getfield        #48  <Field Object mLock>
	//*   4    8:astore_3        
	//*   5    9:aload_3         
	//*   6   10:monitorenter    
		{
			l = zzcrb;
	//    7   11:aload_0         
	//    8   12:getfield        #67  <Field long zzcrb>
	//    9   15:lstore_1        
		}
	//   10   16:aload_3         
	//   11   17:monitorexit     
		return l;
	//   12   18:lload_1         
	//   13   19:lreturn         
		exception;
	//   14   20:astore          4
		obj;
	//   15   22:aload_3         
		JVM INSTR monitorexit ;
	//   16   23:monitorexit     
		throw exception;
	//   17   24:aload           4
	//   18   26:athrow          
	}

	public final int zzrc()
	{
		zzqr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #314 <Method void zzqr()>
		int i;
		synchronized(mLock)
	//*   2    4:aload_0         
	//*   3    5:getfield        #48  <Field Object mLock>
	//*   4    8:astore_2        
	//*   5    9:aload_2         
	//*   6   10:monitorenter    
		{
			i = zzcqg;
	//    7   11:aload_0         
	//    8   12:getfield        #71  <Field int zzcqg>
	//    9   15:istore_1        
		}
	//   10   16:aload_2         
	//   11   17:monitorexit     
		return i;
	//   12   18:iload_1         
	//   13   19:ireturn         
		exception;
	//   14   20:astore_3        
		obj;
	//   15   21:aload_2         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw exception;
	//   17   23:aload_3         
	//   18   24:athrow          
	}

	public final long zzrd()
	{
		zzqr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #314 <Method void zzqr()>
		long l;
		synchronized(mLock)
	//*   2    4:aload_0         
	//*   3    5:getfield        #48  <Field Object mLock>
	//*   4    8:astore_3        
	//*   5    9:aload_3         
	//*   6   10:monitorenter    
		{
			l = zzcrc;
	//    7   11:aload_0         
	//    8   12:getfield        #69  <Field long zzcrc>
	//    9   15:lstore_1        
		}
	//   10   16:aload_3         
	//   11   17:monitorexit     
		return l;
	//   12   18:lload_1         
	//   13   19:lreturn         
		exception;
	//   14   20:astore          4
		obj;
	//   15   22:aload_3         
		JVM INSTR monitorexit ;
	//   16   23:monitorexit     
		throw exception;
	//   17   24:aload           4
	//   18   26:athrow          
	}

	public final JSONObject zzre()
	{
		zzqr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #314 <Method void zzqr()>
		JSONObject jsonobject;
		synchronized(mLock)
	//*   2    4:aload_0         
	//*   3    5:getfield        #48  <Field Object mLock>
	//*   4    8:astore_1        
	//*   5    9:aload_1         
	//*   6   10:monitorenter    
		{
			jsonobject = zzcrf;
	//    7   11:aload_0         
	//    8   12:getfield        #86  <Field JSONObject zzcrf>
	//    9   15:astore_2        
		}
	//   10   16:aload_1         
	//   11   17:monitorexit     
		return jsonobject;
	//   12   18:aload_2         
	//   13   19:areturn         
		exception;
	//   14   20:astore_2        
		obj;
	//   15   21:aload_1         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw exception;
	//   17   23:aload_2         
	//   18   24:athrow          
	}

	public final void zzrf()
	{
		zzqr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #314 <Method void zzqr()>
		synchronized(mLock)
	//*   2    4:aload_0         
	//*   3    5:getfield        #48  <Field Object mLock>
	//*   4    8:astore_1        
	//*   5    9:aload_1         
	//*   6   10:monitorenter    
		{
			zzcrf = new JSONObject();
	//    7   11:aload_0         
	//    8   12:new             #83  <Class JSONObject>
	//    9   15:dup             
	//   10   16:invokespecial   #84  <Method void JSONObject()>
	//   11   19:putfield        #86  <Field JSONObject zzcrf>
			if(zzcqw != null)
	//*  12   22:aload_0         
	//*  13   23:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//*  14   26:ifnull          51
			{
				zzcqw.remove("native_advanced_settings");
	//   15   29:aload_0         
	//   16   30:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//   17   33:ldc2            #277 <String "native_advanced_settings">
	//   18   36:invokeinterface #442 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   19   41:pop             
				zzcqw.apply();
	//   20   42:aload_0         
	//   21   43:getfield        #374 <Field android.content.SharedPreferences$Editor zzcqw>
	//   22   46:invokeinterface #382 <Method void android.content.SharedPreferences$Editor.apply()>
			}
			Bundle bundle = new Bundle();
	//   23   51:new             #216 <Class Bundle>
	//   24   54:dup             
	//   25   55:invokespecial   #217 <Method void Bundle()>
	//   26   58:astore_2        
			bundle.putString("native_advanced_settings", "{}");
	//   27   59:aload_2         
	//   28   60:ldc2            #277 <String "native_advanced_settings">
	//   29   63:ldc2            #444 <String "{}">
	//   30   66:invokevirtual   #263 <Method void Bundle.putString(String, String)>
			zze(bundle);
	//   31   69:aload_0         
	//   32   70:aload_2         
	//   33   71:invokespecial   #108 <Method void zze(Bundle)>
		}
	//   34   74:aload_1         
	//   35   75:monitorexit     
		return;
	//   36   76:return          
		exception;
	//   37   77:astore_2        
		obj;
	//   38   78:aload_1         
		JVM INSTR monitorexit ;
	//   39   79:monitorexit     
		throw exception;
	//   40   80:aload_2         
	//   41   81:athrow          
	}

	private final Object mLock = new Object();
	private SharedPreferences zzatw;
	private boolean zzcik;
	private boolean zzcil;
	private boolean zzcim;
	private boolean zzcit;
	private String zzcpj;
	private int zzcqg;
	private zzanz zzcqu;
	private CopyOnWriteArraySet zzcqv;
	android.content.SharedPreferences.Editor zzcqw;
	private boolean zzcqx;
	private String zzcqy;
	private String zzcqz;
	private long zzcra;
	private long zzcrb;
	private long zzcrc;
	private int zzcrd;
	private Set zzcre;
	private JSONObject zzcrf;
}
