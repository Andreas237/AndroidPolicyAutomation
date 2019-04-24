// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzxm, zzahm, zzjz, zzkb, 
//			zzjr, zzagz, zzlj, zzane, 
//			zzjw, zzmc, zzmd

public final class zzmb
{

	private zzmb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static zzmb zziv()
	{
		zzmb zzmb1;
		synchronized(sLock)
	//*   0    0:getstatic       #22  <Field Object sLock>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			if(zzate == null)
	//*   4    6:getstatic       #27  <Field zzmb zzate>
	//*   5    9:ifnonnull       22
				zzate = new zzmb();
	//    6   12:new             #2   <Class zzmb>
	//    7   15:dup             
	//    8   16:invokespecial   #28  <Method void zzmb()>
	//    9   19:putstatic       #27  <Field zzmb zzate>
			zzmb1 = zzate;
	//   10   22:getstatic       #27  <Field zzmb zzate>
	//   11   25:astore_1        
		}
	//   12   26:aload_0         
	//   13   27:monitorexit     
		return zzmb1;
	//   14   28:aload_1         
	//   15   29:areturn         
		exception;
	//   16   30:astore_1        
		obj;
	//   17   31:aload_0         
		JVM INSTR monitorexit ;
	//   18   32:monitorexit     
		throw exception;
	//   19   33:aload_1         
	//   20   34:athrow          
	}

	public final RewardedVideoAd getRewardedVideoAdInstance(Context context)
	{
label0:
		{
			synchronized(sLock)
	//*   0    0:getstatic       #22  <Field Object sLock>
	//*   1    3:astore_2        
	//*   2    4:aload_2         
	//*   3    5:monitorenter    
			{
				if(zzatg == null)
					break label0;
	//    4    6:aload_0         
	//    5    7:getfield        #32  <Field RewardedVideoAd zzatg>
	//    6   10:ifnull          22
				context = ((Context) (zzatg));
	//    7   13:aload_0         
	//    8   14:getfield        #32  <Field RewardedVideoAd zzatg>
	//    9   17:astore_1        
			}
	//   10   18:aload_2         
	//   11   19:monitorexit     
			return ((RewardedVideoAd) (context));
	//   12   20:aload_1         
	//   13   21:areturn         
		}
		zzxm zzxm1 = new zzxm();
	//   14   22:new             #34  <Class zzxm>
	//   15   25:dup             
	//   16   26:invokespecial   #35  <Method void zzxm()>
	//   17   29:astore_3        
		zzatg = ((RewardedVideoAd) (new zzahm(context, (zzagz)zzjr.zza(context, false, ((zzjr.zza) (new zzjz(zzkb.zzig(), context, ((zzxn) (zzxm1)))))))));
	//   18   30:aload_0         
	//   19   31:new             #37  <Class zzahm>
	//   20   34:dup             
	//   21   35:aload_1         
	//   22   36:aload_1         
	//   23   37:iconst_0        
	//   24   38:new             #39  <Class zzjz>
	//   25   41:dup             
	//   26   42:invokestatic    #45  <Method zzjr zzkb.zzig()>
	//   27   45:aload_1         
	//   28   46:aload_3         
	//   29   47:invokespecial   #48  <Method void zzjz(zzjr, Context, zzxn)>
	//   30   50:invokestatic    #54  <Method Object zzjr.zza(Context, boolean, zzjr$zza)>
	//   31   53:checkcast       #56  <Class zzagz>
	//   32   56:invokespecial   #59  <Method void zzahm(Context, zzagz)>
	//   33   59:putfield        #32  <Field RewardedVideoAd zzatg>
		context = ((Context) (zzatg));
	//   34   62:aload_0         
	//   35   63:getfield        #32  <Field RewardedVideoAd zzatg>
	//   36   66:astore_1        
		obj;
	//   37   67:aload_2         
		JVM INSTR monitorexit ;
	//   38   68:monitorexit     
		return ((RewardedVideoAd) (context));
	//   39   69:aload_1         
	//   40   70:areturn         
		context;
	//   41   71:astore_1        
		obj;
	//   42   72:aload_2         
		JVM INSTR monitorexit ;
	//   43   73:monitorexit     
		throw context;
	//   44   74:aload_1         
	//   45   75:athrow          
	}

	public final void openDebugMenu(Context context, String s)
	{
		boolean flag;
		if(zzatf != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field zzlj zzatf>
	//*   2    4:ifnull          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_3        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_3        
		Preconditions.checkState(flag, "MobileAds.initialize() must be called prior to opening debug menu.");
	//    8   14:iload_3         
	//    9   15:ldc1            #67  <String "MobileAds.initialize() must be called prior to opening debug menu.">
	//   10   17:invokestatic    #73  <Method void Preconditions.checkState(boolean, Object)>
		try
		{
			zzatf.zzb(ObjectWrapper.wrap(((Object) (context))), s);
	//   11   20:aload_0         
	//   12   21:getfield        #65  <Field zzlj zzatf>
	//   13   24:aload_1         
	//   14   25:invokestatic    #79  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   15   28:aload_2         
	//   16   29:invokeinterface #85  <Method void zzlj.zzb(com.google.android.gms.dynamic.IObjectWrapper, String)>
			return;
	//   17   34:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  18   35:astore_1        
		{
			zzane.zzb("Unable to open debug menu.", ((Throwable) (context)));
	//   19   36:ldc1            #87  <String "Unable to open debug menu.">
	//   20   38:aload_1         
	//   21   39:invokestatic    #92  <Method void zzane.zzb(String, Throwable)>
		}
	//   22   42:return          
	}

	public final void setAppMuted(boolean flag)
	{
		boolean flag1;
		if(zzatf != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field zzlj zzatf>
	//*   2    4:ifnull          12
			flag1 = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag1 = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		Preconditions.checkState(flag1, "MobileAds.initialize() must be called prior to setting app muted state.");
	//    8   14:iload_2         
	//    9   15:ldc1            #96  <String "MobileAds.initialize() must be called prior to setting app muted state.">
	//   10   17:invokestatic    #73  <Method void Preconditions.checkState(boolean, Object)>
		try
		{
			zzatf.setAppMuted(flag);
	//   11   20:aload_0         
	//   12   21:getfield        #65  <Field zzlj zzatf>
	//   13   24:iload_1         
	//   14   25:invokeinterface #98  <Method void zzlj.setAppMuted(boolean)>
			return;
	//   15   30:return          
		}
		catch(RemoteException remoteexception)
	//*  16   31:astore_3        
		{
			zzane.zzb("Unable to set app mute state.", ((Throwable) (remoteexception)));
	//   17   32:ldc1            #100 <String "Unable to set app mute state.">
	//   18   34:aload_3         
	//   19   35:invokestatic    #92  <Method void zzane.zzb(String, Throwable)>
		}
	//   20   38:return          
	}

	public final void setAppVolume(float f)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag;
		if(0.0F <= f && f <= 1.0F)
	//*   2    2:fconst_0        
	//*   3    3:fload_1         
	//*   4    4:fcmpg           
	//*   5    5:ifgt            19
	//*   6    8:fload_1         
	//*   7    9:fconst_1        
	//*   8   10:fcmpg           
	//*   9   11:ifgt            19
			flag = true;
	//   10   14:iconst_1        
	//   11   15:istore_2        
		else
	//*  12   16:goto            21
			flag = false;
	//   13   19:iconst_0        
	//   14   20:istore_2        
		Preconditions.checkArgument(flag, "The app volume must be a value between 0 and 1 inclusive.");
	//   15   21:iload_2         
	//   16   22:ldc1            #104 <String "The app volume must be a value between 0 and 1 inclusive.">
	//   17   24:invokestatic    #107 <Method void Preconditions.checkArgument(boolean, Object)>
		flag = flag1;
	//   18   27:iload_3         
	//   19   28:istore_2        
		if(zzatf != null)
	//*  20   29:aload_0         
	//*  21   30:getfield        #65  <Field zzlj zzatf>
	//*  22   33:ifnull          38
			flag = true;
	//   23   36:iconst_1        
	//   24   37:istore_2        
		Preconditions.checkState(flag, "MobileAds.initialize() must be called prior to setting the app volume.");
	//   25   38:iload_2         
	//   26   39:ldc1            #109 <String "MobileAds.initialize() must be called prior to setting the app volume.">
	//   27   41:invokestatic    #73  <Method void Preconditions.checkState(boolean, Object)>
		try
		{
			zzatf.setAppVolume(f);
	//   28   44:aload_0         
	//   29   45:getfield        #65  <Field zzlj zzatf>
	//   30   48:fload_1         
	//   31   49:invokeinterface #111 <Method void zzlj.setAppVolume(float)>
			return;
	//   32   54:return          
		}
		catch(RemoteException remoteexception)
	//*  33   55:astore          4
		{
			zzane.zzb("Unable to set app volume.", ((Throwable) (remoteexception)));
	//   34   57:ldc1            #113 <String "Unable to set app volume.">
	//   35   59:aload           4
	//   36   61:invokestatic    #92  <Method void zzane.zzb(String, Throwable)>
		}
	//   37   64:return          
	}

	public final void zza(Context context, String s, zzmd zzmd)
	{
label0:
		{
			synchronized(sLock)
	//*   0    0:getstatic       #22  <Field Object sLock>
	//*   1    3:astore_3        
	//*   2    4:aload_3         
	//*   3    5:monitorenter    
			{
				if(zzatf == null)
					break label0;
	//    4    6:aload_0         
	//    5    7:getfield        #65  <Field zzlj zzatf>
	//    6   10:ifnull          16
			}
	//    7   13:aload_3         
	//    8   14:monitorexit     
			return;
	//    9   15:return          
		}
		if(context != null)
			break MISSING_BLOCK_LABEL_30;
	//   10   16:aload_1         
	//   11   17:ifnonnull       30
		throw new IllegalArgumentException("Context cannot be null.");
	//   12   20:new             #116 <Class IllegalArgumentException>
	//   13   23:dup             
	//   14   24:ldc1            #118 <String "Context cannot be null.">
	//   15   26:invokespecial   #121 <Method void IllegalArgumentException(String)>
	//   16   29:athrow          
		zzatf = (zzlj)zzjr.zza(context, false, ((zzjr.zza) (new zzjw(zzkb.zzig(), context))));
	//   17   30:aload_0         
	//   18   31:aload_1         
	//   19   32:iconst_0        
	//   20   33:new             #123 <Class zzjw>
	//   21   36:dup             
	//   22   37:invokestatic    #45  <Method zzjr zzkb.zzig()>
	//   23   40:aload_1         
	//   24   41:invokespecial   #126 <Method void zzjw(zzjr, Context)>
	//   25   44:invokestatic    #54  <Method Object zzjr.zza(Context, boolean, zzjr$zza)>
	//   26   47:checkcast       #81  <Class zzlj>
	//   27   50:putfield        #65  <Field zzlj zzatf>
		zzatf.zza();
	//   28   53:aload_0         
	//   29   54:getfield        #65  <Field zzlj zzatf>
	//   30   57:invokeinterface #128 <Method void zzlj.zza()>
		if(s == null)
			break MISSING_BLOCK_LABEL_98;
	//   31   62:aload_2         
	//   32   63:ifnull          98
		try
		{
			zzatf.zza(s, ObjectWrapper.wrap(((Object) (new zzmc(this, context)))));
	//   33   66:aload_0         
	//   34   67:getfield        #65  <Field zzlj zzatf>
	//   35   70:aload_2         
	//   36   71:new             #130 <Class zzmc>
	//   37   74:dup             
	//   38   75:aload_0         
	//   39   76:aload_1         
	//   40   77:invokespecial   #133 <Method void zzmc(zzmb, Context)>
	//   41   80:invokestatic    #79  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   42   83:invokeinterface #136 <Method void zzlj.zza(String, com.google.android.gms.dynamic.IObjectWrapper)>
			break MISSING_BLOCK_LABEL_98;
	//   43   88:goto            98
		}
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//   44   91:astore_1        
		zzane.zzc("MobileAdsSettingManager initialization failed", ((Throwable) (context)));
	//   45   92:ldc1            #138 <String "MobileAdsSettingManager initialization failed">
	//   46   94:aload_1         
	//   47   95:invokestatic    #141 <Method void zzane.zzc(String, Throwable)>
		zzmd;
	//   48   98:aload_3         
		JVM INSTR monitorexit ;
	//   49   99:monitorexit     
		return;
	//   50  100:return          
		context;
	//   51  101:astore_1        
		zzmd;
	//   52  102:aload_3         
		JVM INSTR monitorexit ;
	//   53  103:monitorexit     
		throw context;
	//   54  104:aload_1         
	//   55  105:athrow          
	}

	public final float zzdo()
	{
		if(zzatf == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field zzlj zzatf>
	//*   2    4:ifnonnull       9
			return 1.0F;
	//    3    7:fconst_1        
	//    4    8:freturn         
		float f;
		try
		{
			f = zzatf.zzdo();
	//    5    9:aload_0         
	//    6   10:getfield        #65  <Field zzlj zzatf>
	//    7   13:invokeinterface #145 <Method float zzlj.zzdo()>
	//    8   18:fstore_1        
		}
	//*   9   19:fload_1         
	//*  10   20:freturn         
		catch(RemoteException remoteexception)
	//*  11   21:astore_2        
		{
			zzane.zzb("Unable to get app volume.", ((Throwable) (remoteexception)));
	//   12   22:ldc1            #147 <String "Unable to get app volume.">
	//   13   24:aload_2         
	//   14   25:invokestatic    #92  <Method void zzane.zzb(String, Throwable)>
			return 1.0F;
	//   15   28:fconst_1        
	//   16   29:freturn         
		}
		return f;
	}

	public final boolean zzdp()
	{
		if(zzatf == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field zzlj zzatf>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		boolean flag;
		try
		{
			flag = zzatf.zzdp();
	//    5    9:aload_0         
	//    6   10:getfield        #65  <Field zzlj zzatf>
	//    7   13:invokeinterface #151 <Method boolean zzlj.zzdp()>
	//    8   18:istore_1        
		}
	//*   9   19:iload_1         
	//*  10   20:ireturn         
		catch(RemoteException remoteexception)
	//*  11   21:astore_2        
		{
			zzane.zzb("Unable to get app mute state.", ((Throwable) (remoteexception)));
	//   12   22:ldc1            #153 <String "Unable to get app mute state.">
	//   13   24:aload_2         
	//   14   25:invokestatic    #92  <Method void zzane.zzb(String, Throwable)>
			return false;
	//   15   28:iconst_0        
	//   16   29:ireturn         
		}
		return flag;
	}

	private static final Object sLock = new Object();
	private static zzmb zzate;
	private zzlj zzatf;
	private RewardedVideoAd zzatg;

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void Object()>
	//    3    7:putstatic       #22  <Field Object sLock>
	//*   4   10:return          
	}
}
