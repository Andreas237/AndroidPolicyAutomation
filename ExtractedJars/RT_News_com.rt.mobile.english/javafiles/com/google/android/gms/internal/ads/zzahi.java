// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzahc, zzahd, zzagz, zzahb, 
//			zzane, zzxn

public final class zzahi extends RemoteCreator
{

	public zzahi()
	{
		super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl">
	//    2    3:invokespecial   #13  <Method void RemoteCreator(String)>
	//    3    6:return          
	}

	protected final Object getRemoteCreator(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
	//    4    6:aload_1         
	//    5    7:ldc1            #18  <String "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator">
	//    6    9:invokeinterface #24  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_2        
		if(iinterface instanceof zzahc)
	//*   8   15:aload_2         
	//*   9   16:instanceof      #26  <Class zzahc>
	//*  10   19:ifeq            27
			return ((Object) ((zzahc)iinterface));
	//   11   22:aload_2         
	//   12   23:checkcast       #26  <Class zzahc>
	//   13   26:areturn         
		else
			return ((Object) (new zzahd(ibinder)));
	//   14   27:new             #28  <Class zzahd>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokespecial   #31  <Method void zzahd(IBinder)>
	//   18   35:areturn         
	}

	public final zzagz zza(Context context, zzxn zzxn)
	{
		try
		{
			com.google.android.gms.dynamic.IObjectWrapper iobjectwrapper = ObjectWrapper.wrap(((Object) (context)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #43  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    2    4:astore_3        
			context = ((Context) (((zzahc)getRemoteCreatorInstance(context)).zza(iobjectwrapper, zzxn, 0xbdfcb8)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #47  <Method Object getRemoteCreatorInstance(Context)>
	//    6   10:checkcast       #26  <Class zzahc>
	//    7   13:aload_3         
	//    8   14:aload_2         
	//    9   15:ldc1            #48  <Int 0xbdfcb8>
	//   10   17:invokeinterface #51  <Method IBinder zzahc.zza(com.google.android.gms.dynamic.IObjectWrapper, zzxn, int)>
	//   11   22:astore_1        
		}
	//*  12   23:aload_1         
	//*  13   24:ifnonnull       29
	//*  14   27:aconst_null     
	//*  15   28:areturn         
	//*  16   29:aload_1         
	//*  17   30:ldc1            #53  <String "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd">
	//*  18   32:invokeinterface #24  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//*  19   37:astore_2        
	//*  20   38:aload_2         
	//*  21   39:instanceof      #55  <Class zzagz>
	//*  22   42:ifeq            50
	//*  23   45:aload_2         
	//*  24   46:checkcast       #55  <Class zzagz>
	//*  25   49:areturn         
	//*  26   50:new             #57  <Class zzahb>
	//*  27   53:dup             
	//*  28   54:aload_1         
	//*  29   55:invokespecial   #58  <Method void zzahb(IBinder)>
	//*  30   58:astore_1        
	//*  31   59:aload_1         
	//*  32   60:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  33   61:astore_1        
		{
			zzane.zzc("Could not get remote RewardedVideoAd.", ((Throwable) (context)));
	//   34   62:ldc1            #60  <String "Could not get remote RewardedVideoAd.">
	//   35   64:aload_1         
	//   36   65:invokestatic    #66  <Method void zzane.zzc(String, Throwable)>
			return null;
	//   37   68:aconst_null     
	//   38   69:areturn         
		}
		if(context == null)
			return null;
		zzxn = ((zzxn) (((IBinder) (context)).queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd")));
		if(zzxn instanceof zzagz)
			return (zzagz)zzxn;
		context = ((Context) (new zzahb(((IBinder) (context)))));
		return ((zzagz) (context));
	}
}
