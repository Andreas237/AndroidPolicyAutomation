// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.*;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzkb, zzamu, zzane, zznk, 
//			zzni, zzle, zzjx, zzqa, 
//			zzjy, zzqf, zzka, zzaap, 
//			zzjv, zzkn, zzld, zzjh, 
//			zzjg, zzme, zzrv, zzahi, 
//			zzaao, zzrw, zzxn

public class zzjr
{
	abstract class zza
	{

		protected abstract Object zza(zzld zzld)
			throws RemoteException;

		protected abstract Object zzib()
			throws RemoteException;

		protected final Object zzic()
		{
			Object obj = ((Object) (zzjr.zza(zzart)));
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field zzjr zzart>
		//    2    4:invokestatic    #29  <Method zzld zzjr.zza(zzjr)>
		//    3    7:astore_1        
			if(obj == null)
		//*   4    8:aload_1         
		//*   5    9:ifnonnull       19
			{
				zzane.zzdk("ClientApi class cannot be loaded.");
		//    6   12:ldc1            #31  <String "ClientApi class cannot be loaded.">
		//    7   14:invokestatic    #37  <Method void zzane.zzdk(String)>
				return ((Object) (null));
		//    8   17:aconst_null     
		//    9   18:areturn         
			}
			try
			{
				obj = zza(((zzld) (obj)));
		//   10   19:aload_0         
		//   11   20:aload_1         
		//   12   21:invokevirtual   #39  <Method Object zza(zzld)>
		//   13   24:astore_1        
			}
		//*  14   25:aload_1         
		//*  15   26:areturn         
			catch(RemoteException remoteexception)
		//*  16   27:astore_1        
			{
				zzane.zzc("Cannot invoke local loader using ClientApi class", ((Throwable) (remoteexception)));
		//   17   28:ldc1            #41  <String "Cannot invoke local loader using ClientApi class">
		//   18   30:aload_1         
		//   19   31:invokestatic    #45  <Method void zzane.zzc(String, Throwable)>
				return ((Object) (null));
		//   20   34:aconst_null     
		//   21   35:areturn         
			}
			return obj;
		}

		protected final Object zzid()
		{
			Object obj;
			try
			{
				obj = zzib();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #51  <Method Object zzib()>
		//    2    4:astore_1        
			}
		//*   3    5:aload_1         
		//*   4    6:areturn         
			catch(RemoteException remoteexception)
		//*   5    7:astore_1        
			{
				zzane.zzc("Cannot invoke remote loader", ((Throwable) (remoteexception)));
		//    6    8:ldc1            #53  <String "Cannot invoke remote loader">
		//    7   10:aload_1         
		//    8   11:invokestatic    #45  <Method void zzane.zzc(String, Throwable)>
				return ((Object) (null));
		//    9   14:aconst_null     
		//   10   15:areturn         
			}
			return obj;
		}

		private final zzjr zzart;

		zza()
		{
			zzart = zzjr.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field zzjr zzart>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}


	public zzjr(zzjh zzjh, zzjg zzjg, zzme zzme, zzrv zzrv, zzahi zzahi, zzaao zzaao, zzrw zzrw)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void Object()>
	//    6   12:putfield        #35  <Field Object mLock>
		zzarj = zzjh;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #37  <Field zzjh zzarj>
		zzark = zzjg;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #39  <Field zzjg zzark>
		zzarl = zzme;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #41  <Field zzme zzarl>
		zzarm = zzrv;
	//   16   30:aload_0         
	//   17   31:aload           4
	//   18   33:putfield        #43  <Field zzrv zzarm>
		zzarn = zzahi;
	//   19   36:aload_0         
	//   20   37:aload           5
	//   21   39:putfield        #45  <Field zzahi zzarn>
		zzaro = zzaao;
	//   22   42:aload_0         
	//   23   43:aload           6
	//   24   45:putfield        #47  <Field zzaao zzaro>
		zzarp = zzrw;
	//   25   48:aload_0         
	//   26   49:aload           7
	//   27   51:putfield        #49  <Field zzrw zzarp>
	//   28   54:return          
	}

	static zzld zza(zzjr zzjr1)
	{
		return zzjr1.zzia();
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method zzld zzia()>
	//    2    4:areturn         
	}

	static Object zza(Context context, boolean flag, zza zza1)
	{
		boolean flag1 = flag;
	//    0    0:iload_1         
	//    1    1:istore          4
		if(!flag)
	//*   2    3:iload_1         
	//*   3    4:ifne            29
		{
			zzkb.zzif();
	//    4    7:invokestatic    #63  <Method zzamu zzkb.zzif()>
	//    5   10:pop             
			flag1 = flag;
	//    6   11:iload_1         
	//    7   12:istore          4
			if(!zzamu.zzbe(context))
	//*   8   14:aload_0         
	//*   9   15:invokestatic    #69  <Method boolean zzamu.zzbe(Context)>
	//*  10   18:ifne            29
			{
				zzane.zzck("Google Play Services is not available");
	//   11   21:ldc1            #71  <String "Google Play Services is not available">
	//   12   23:invokestatic    #77  <Method void zzane.zzck(String)>
				flag1 = true;
	//   13   26:iconst_1        
	//   14   27:istore          4
			}
		}
		zzkb.zzif();
	//   15   29:invokestatic    #63  <Method zzamu zzkb.zzif()>
	//   16   32:pop             
		int i = zzamu.zzbg(context);
	//   17   33:aload_0         
	//   18   34:invokestatic    #81  <Method int zzamu.zzbg(Context)>
	//   19   37:istore_3        
		zzkb.zzif();
	//   20   38:invokestatic    #63  <Method zzamu zzkb.zzif()>
	//   21   41:pop             
		if(i > zzamu.zzbf(context))
	//*  22   42:iload_3         
	//*  23   43:aload_0         
	//*  24   44:invokestatic    #84  <Method int zzamu.zzbf(Context)>
	//*  25   47:icmple          53
			flag1 = true;
	//   26   50:iconst_1        
	//   27   51:istore          4
		zznk.initialize(context);
	//   28   53:aload_0         
	//   29   54:invokestatic    #90  <Method void zznk.initialize(Context)>
		context = ((Context) (zznk.zzber));
	//   30   57:getstatic       #94  <Field zzna zznk.zzber>
	//   31   60:astore_0        
		if(((Boolean)zzkb.zzik().zzd(((zzna) (context)))).booleanValue())
	//*  32   61:invokestatic    #98  <Method zzni zzkb.zzik()>
	//*  33   64:aload_0         
	//*  34   65:invokevirtual   #104 <Method Object zzni.zzd(zzna)>
	//*  35   68:checkcast       #106 <Class Boolean>
	//*  36   71:invokevirtual   #110 <Method boolean Boolean.booleanValue()>
	//*  37   74:ifeq            80
			flag1 = false;
	//   38   77:iconst_0        
	//   39   78:istore          4
		if(flag1)
	//*  40   80:iload           4
	//*  41   82:ifeq            104
		{
			Object obj = zza1.zzic();
	//   42   85:aload_2         
	//   43   86:invokevirtual   #114 <Method Object zzjr$zza.zzic()>
	//   44   89:astore          5
			context = ((Context) (obj));
	//   45   91:aload           5
	//   46   93:astore_0        
			if(obj == null)
	//*  47   94:aload           5
	//*  48   96:ifnonnull       123
				return zza1.zzid();
	//   49   99:aload_2         
	//   50  100:invokevirtual   #117 <Method Object zzjr$zza.zzid()>
	//   51  103:areturn         
		} else
		{
			Object obj1 = zza1.zzid();
	//   52  104:aload_2         
	//   53  105:invokevirtual   #117 <Method Object zzjr$zza.zzid()>
	//   54  108:astore          5
			context = ((Context) (obj1));
	//   55  110:aload           5
	//   56  112:astore_0        
			if(obj1 == null)
	//*  57  113:aload           5
	//*  58  115:ifnonnull       123
				context = ((Context) (zza1.zzic()));
	//   59  118:aload_2         
	//   60  119:invokevirtual   #114 <Method Object zzjr$zza.zzic()>
	//   61  122:astore_0        
		}
		return ((Object) (context));
	//   62  123:aload_0         
	//   63  124:areturn         
	}

	private static void zza(Context context, String s)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #123 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #124 <Method void Bundle()>
	//    3    7:astore_2        
		bundle.putString("action", "no_ads_fallback");
	//    4    8:aload_2         
	//    5    9:ldc1            #126 <String "action">
	//    6   11:ldc1            #128 <String "no_ads_fallback">
	//    7   13:invokevirtual   #132 <Method void Bundle.putString(String, String)>
		bundle.putString("flow", s);
	//    8   16:aload_2         
	//    9   17:ldc1            #134 <String "flow">
	//   10   19:aload_1         
	//   11   20:invokevirtual   #132 <Method void Bundle.putString(String, String)>
		zzkb.zzif().zza(context, ((String) (null)), "gmob-apps", bundle, true);
	//   12   23:invokestatic    #63  <Method zzamu zzkb.zzif()>
	//   13   26:aload_0         
	//   14   27:aconst_null     
	//   15   28:ldc1            #136 <String "gmob-apps">
	//   16   30:aload_2         
	//   17   31:iconst_1        
	//   18   32:invokevirtual   #139 <Method void zzamu.zza(Context, String, String, Bundle, boolean)>
	//   19   35:return          
	}

	static void zza(zzjr zzjr1, Context context, String s)
	{
		zza(context, s);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #142 <Method void zza(Context, String)>
	//    3    5:return          
	}

	static zzjh zzb(zzjr zzjr1)
	{
		return zzjr1.zzarj;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field zzjh zzarj>
	//    2    4:areturn         
	}

	static zzjg zzc(zzjr zzjr1)
	{
		return zzjr1.zzark;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field zzjg zzark>
	//    2    4:areturn         
	}

	static zzme zzd(zzjr zzjr1)
	{
		return zzjr1.zzarl;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field zzme zzarl>
	//    2    4:areturn         
	}

	static zzrv zze(zzjr zzjr1)
	{
		return zzjr1.zzarm;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field zzrv zzarm>
	//    2    4:areturn         
	}

	static zzrw zzf(zzjr zzjr1)
	{
		return zzjr1.zzarp;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field zzrw zzarp>
	//    2    4:areturn         
	}

	static zzahi zzg(zzjr zzjr1)
	{
		return zzjr1.zzarn;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field zzahi zzarn>
	//    2    4:areturn         
	}

	static zzaao zzh(zzjr zzjr1)
	{
		return zzjr1.zzaro;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field zzaao zzaro>
	//    2    4:areturn         
	}

	private static zzld zzhz()
	{
		Object obj;
		obj = ((Class) (com/google/android/gms/internal/ads/zzjr)).getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").newInstance();
	//    0    0:ldc1            #2   <Class zzjr>
	//    1    2:invokevirtual   #165 <Method ClassLoader Class.getClassLoader()>
	//    2    5:ldc1            #167 <String "com.google.android.gms.ads.internal.ClientApi">
	//    3    7:invokevirtual   #173 <Method Class ClassLoader.loadClass(String)>
	//    4   10:invokevirtual   #176 <Method Object Class.newInstance()>
	//    5   13:astore_0        
		if(obj instanceof IBinder)
			break MISSING_BLOCK_LABEL_28;
	//    6   14:aload_0         
	//    7   15:instanceof      #178 <Class IBinder>
	//    8   18:ifne            28
		zzane.zzdk("ClientApi class is not an instance of IBinder");
	//    9   21:ldc1            #180 <String "ClientApi class is not an instance of IBinder">
	//   10   23:invokestatic    #183 <Method void zzane.zzdk(String)>
		return null;
	//   11   26:aconst_null     
	//   12   27:areturn         
		try
		{
			obj = ((Object) (zzle.asInterface((IBinder)obj)));
	//   13   28:aload_0         
	//   14   29:checkcast       #178 <Class IBinder>
	//   15   32:invokestatic    #189 <Method zzld zzle.asInterface(IBinder)>
	//   16   35:astore_0        
		}
	//*  17   36:aload_0         
	//*  18   37:areturn         
		catch(Exception exception)
	//*  19   38:astore_0        
		{
			zzane.zzc("Failed to instantiate ClientApi class.", ((Throwable) (exception)));
	//   20   39:ldc1            #191 <String "Failed to instantiate ClientApi class.">
	//   21   41:aload_0         
	//   22   42:invokestatic    #194 <Method void zzane.zzc(String, Throwable)>
			return null;
	//   23   45:aconst_null     
	//   24   46:areturn         
		}
		return ((zzld) (obj));
	}

	private final zzld zzia()
	{
		zzld zzld;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(zzari == null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #196 <Field zzld zzari>
	//*   7   11:ifnonnull       21
				zzari = zzhz();
	//    8   14:aload_0         
	//    9   15:invokestatic    #198 <Method zzld zzhz()>
	//   10   18:putfield        #196 <Field zzld zzari>
			zzld = zzari;
	//   11   21:aload_0         
	//   12   22:getfield        #196 <Field zzld zzari>
	//   13   25:astore_2        
		}
	//   14   26:aload_1         
	//   15   27:monitorexit     
		return zzld;
	//   16   28:aload_2         
	//   17   29:areturn         
		exception;
	//   18   30:astore_2        
		obj;
	//   19   31:aload_1         
		JVM INSTR monitorexit ;
	//   20   32:monitorexit     
		throw exception;
	//   21   33:aload_2         
	//   22   34:athrow          
	}

	public final zzqa zza(Context context, FrameLayout framelayout, FrameLayout framelayout1)
	{
		return (zzqa)zza(context, false, ((zza) (new zzjx(this, framelayout, framelayout1, context))));
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:new             #201 <Class zzjx>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:aload_1         
	//    8   10:invokespecial   #204 <Method void zzjx(zzjr, FrameLayout, FrameLayout, Context)>
	//    9   13:invokestatic    #206 <Method Object zza(Context, boolean, zzjr$zza)>
	//   10   16:checkcast       #208 <Class zzqa>
	//   11   19:areturn         
	}

	public final zzqf zza(View view, HashMap hashmap, HashMap hashmap1)
	{
		return (zzqf)zza(view.getContext(), false, ((zza) (new zzjy(this, view, hashmap, hashmap1))));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #215 <Method Context View.getContext()>
	//    2    4:iconst_0        
	//    3    5:new             #217 <Class zzjy>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:invokespecial   #220 <Method void zzjy(zzjr, View, HashMap, HashMap)>
	//   10   16:invokestatic    #206 <Method Object zza(Context, boolean, zzjr$zza)>
	//   11   19:checkcast       #222 <Class zzqf>
	//   12   22:areturn         
	}

	public final zzaap zzb(Activity activity)
	{
		Intent intent = activity.getIntent();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #230 <Method Intent Activity.getIntent()>
	//    2    4:astore          4
		boolean flag1 = intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar");
	//    3    6:aload           4
	//    4    8:ldc1            #232 <String "com.google.android.gms.ads.internal.overlay.useClientJar">
	//    5   10:invokevirtual   #238 <Method boolean Intent.hasExtra(String)>
	//    6   13:istore_3        
		boolean flag = false;
	//    7   14:iconst_0        
	//    8   15:istore_2        
		if(!flag1)
	//*   9   16:iload_3         
	//*  10   17:ifne            28
			zzane.e("useClientJar flag not found in activity intent extras.");
	//   11   20:ldc1            #240 <String "useClientJar flag not found in activity intent extras.">
	//   12   22:invokestatic    #243 <Method void zzane.e(String)>
		else
	//*  13   25:goto            37
			flag = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
	//   14   28:aload           4
	//   15   30:ldc1            #232 <String "com.google.android.gms.ads.internal.overlay.useClientJar">
	//   16   32:iconst_0        
	//   17   33:invokevirtual   #247 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//   18   36:istore_2        
		return (zzaap)zza(((Context) (activity)), flag, ((zza) (new zzka(this, activity))));
	//   19   37:aload_1         
	//   20   38:iload_2         
	//   21   39:new             #249 <Class zzka>
	//   22   42:dup             
	//   23   43:aload_0         
	//   24   44:aload_1         
	//   25   45:invokespecial   #252 <Method void zzka(zzjr, Activity)>
	//   26   48:invokestatic    #206 <Method Object zza(Context, boolean, zzjr$zza)>
	//   27   51:checkcast       #254 <Class zzaap>
	//   28   54:areturn         
	}

	public final zzkn zzb(Context context, String s, zzxn zzxn)
	{
		return (zzkn)zza(context, false, ((zza) (new zzjv(this, context, s, zzxn))));
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:new             #257 <Class zzjv>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:aload_3         
	//    8   10:invokespecial   #260 <Method void zzjv(zzjr, Context, String, zzxn)>
	//    9   13:invokestatic    #206 <Method Object zza(Context, boolean, zzjr$zza)>
	//   10   16:checkcast       #262 <Class zzkn>
	//   11   19:areturn         
	}

	private final Object mLock = new Object();
	private zzld zzari;
	private final zzjh zzarj;
	private final zzjg zzark;
	private final zzme zzarl;
	private final zzrv zzarm;
	private final zzahi zzarn;
	private final zzaao zzaro;
	private final zzrw zzarp;
}
