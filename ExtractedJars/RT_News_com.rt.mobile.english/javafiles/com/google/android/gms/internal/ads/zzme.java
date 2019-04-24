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
//			zzlm, zzln, zzlj, zzll, 
//			zzane

public final class zzme extends RemoteCreator
{

	public zzme()
	{
		super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl">
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
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
	//    4    6:aload_1         
	//    5    7:ldc1            #18  <String "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator">
	//    6    9:invokeinterface #24  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_2        
		if(iinterface instanceof zzlm)
	//*   8   15:aload_2         
	//*   9   16:instanceof      #26  <Class zzlm>
	//*  10   19:ifeq            27
			return ((Object) ((zzlm)iinterface));
	//   11   22:aload_2         
	//   12   23:checkcast       #26  <Class zzlm>
	//   13   26:areturn         
		else
			return ((Object) (new zzln(ibinder)));
	//   14   27:new             #28  <Class zzln>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokespecial   #31  <Method void zzln(IBinder)>
	//   18   35:areturn         
	}

	public final zzlj zzg(Context context)
	{
		android.os.IInterface iinterface;
		try
		{
			com.google.android.gms.dynamic.IObjectWrapper iobjectwrapper = ObjectWrapper.wrap(((Object) (context)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #43  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    2    4:astore_2        
			context = ((Context) (((zzlm)getRemoteCreatorInstance(context)).zza(iobjectwrapper, 0xbdfcb8)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #47  <Method Object getRemoteCreatorInstance(Context)>
	//    6   10:checkcast       #26  <Class zzlm>
	//    7   13:aload_2         
	//    8   14:ldc1            #48  <Int 0xbdfcb8>
	//    9   16:invokeinterface #52  <Method IBinder zzlm.zza(com.google.android.gms.dynamic.IObjectWrapper, int)>
	//   10   21:astore_1        
		}
	//*  11   22:aload_1         
	//*  12   23:ifnonnull       28
	//*  13   26:aconst_null     
	//*  14   27:areturn         
	//*  15   28:aload_1         
	//*  16   29:ldc1            #54  <String "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager">
	//*  17   31:invokeinterface #24  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//*  18   36:astore_2        
	//*  19   37:aload_2         
	//*  20   38:instanceof      #56  <Class zzlj>
	//*  21   41:ifeq            49
	//*  22   44:aload_2         
	//*  23   45:checkcast       #56  <Class zzlj>
	//*  24   48:areturn         
	//*  25   49:new             #58  <Class zzll>
	//*  26   52:dup             
	//*  27   53:aload_1         
	//*  28   54:invokespecial   #59  <Method void zzll(IBinder)>
	//*  29   57:astore_1        
	//*  30   58:aload_1         
	//*  31   59:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  32   60:astore_1        
		{
			zzane.zzc("Could not get remote MobileAdsSettingManager.", ((Throwable) (context)));
	//   33   61:ldc1            #61  <String "Could not get remote MobileAdsSettingManager.">
	//   34   63:aload_1         
	//   35   64:invokestatic    #67  <Method void zzane.zzc(String, Throwable)>
			return null;
	//   36   67:aconst_null     
	//   37   68:areturn         
		}
		if(context == null)
			return null;
		iinterface = ((IBinder) (context)).queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
		if(iinterface instanceof zzlj)
			return (zzlj)iinterface;
		context = ((Context) (new zzll(((IBinder) (context)))));
		return ((zzlj) (context));
	}
}
