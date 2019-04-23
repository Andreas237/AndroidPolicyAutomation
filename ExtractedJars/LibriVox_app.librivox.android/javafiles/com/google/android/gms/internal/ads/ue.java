// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.c.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			tx, tu, tw, aag, 
//			tz, km

public final class ue extends e
{

	public ue()
	{
		super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
	//    0    0:aload_0         
	//    1    1:ldc1            #9   <String "com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl">
	//    2    3:invokespecial   #12  <Method void e(String)>
	//    3    6:return          
	}

	public final tu a(Context context, km km)
	{
		com.google.android.gms.c.a a1 = d.a(((Object) (context)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #24  <Method com.google.android.gms.c.a d.a(Object)>
	//    2    4:astore_3        
		context = ((Context) (((tx)a(context)).a(a1, km, 0xda3360)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #27  <Method Object a(Context)>
	//    6   10:checkcast       #29  <Class tx>
	//    7   13:aload_3         
	//    8   14:aload_2         
	//    9   15:ldc1            #30  <Int 0xda3360>
	//   10   17:invokeinterface #33  <Method IBinder tx.a(com.google.android.gms.c.a, km, int)>
	//   11   22:astore_1        
		if(context == null)
	//*  12   23:aload_1         
	//*  13   24:ifnonnull       29
			return null;
	//   14   27:aconst_null     
	//   15   28:areturn         
		km = ((km) (((IBinder) (context)).queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd")));
	//   16   29:aload_1         
	//   17   30:ldc1            #35  <String "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd">
	//   18   32:invokeinterface #41  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   19   37:astore_2        
		if(km instanceof tu)
	//*  20   38:aload_2         
	//*  21   39:instanceof      #43  <Class tu>
	//*  22   42:ifeq            50
			return (tu)km;
	//   23   45:aload_2         
	//   24   46:checkcast       #43  <Class tu>
	//   25   49:areturn         
		context = ((Context) (new tw(((IBinder) (context)))));
	//   26   50:new             #45  <Class tw>
	//   27   53:dup             
	//   28   54:aload_1         
	//   29   55:invokespecial   #48  <Method void tw(IBinder)>
	//   30   58:astore_1        
		return ((tu) (context));
	//   31   59:aload_1         
	//   32   60:areturn         
		context;
	//   33   61:astore_1        
		break MISSING_BLOCK_LABEL_66;
	//   34   62:goto            66
		context;
	//   35   65:astore_1        
		aag.c("Could not get remote RewardedVideoAd.", ((Throwable) (context)));
	//   36   66:ldc1            #50  <String "Could not get remote RewardedVideoAd.">
	//   37   68:aload_1         
	//   38   69:invokestatic    #56  <Method void aag.c(String, Throwable)>
		return null;
	//   39   72:aconst_null     
	//   40   73:areturn         
	}

	protected final Object a(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
	//    4    6:aload_1         
	//    5    7:ldc1            #59  <String "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator">
	//    6    9:invokeinterface #41  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_2        
		if(iinterface instanceof tx)
	//*   8   15:aload_2         
	//*   9   16:instanceof      #29  <Class tx>
	//*  10   19:ifeq            27
			return ((Object) ((tx)iinterface));
	//   11   22:aload_2         
	//   12   23:checkcast       #29  <Class tx>
	//   13   26:areturn         
		else
			return ((Object) (new tz(ibinder)));
	//   14   27:new             #61  <Class tz>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokespecial   #62  <Method void tz(IBinder)>
	//   18   35:areturn         
	}
}
