// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzqd, zzqe, zzqa, zzqc, 
//			zzane

public final class zzrv extends RemoteCreator
{

	public zzrv()
	{
		super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <String "com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl">
	//    2    3:invokespecial   #14  <Method void RemoteCreator(String)>
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
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
	//    4    6:aload_1         
	//    5    7:ldc1            #20  <String "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator">
	//    6    9:invokeinterface #26  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_2        
		if(iinterface instanceof zzqd)
	//*   8   15:aload_2         
	//*   9   16:instanceof      #28  <Class zzqd>
	//*  10   19:ifeq            27
			return ((Object) ((zzqd)iinterface));
	//   11   22:aload_2         
	//   12   23:checkcast       #28  <Class zzqd>
	//   13   26:areturn         
		else
			return ((Object) (new zzqe(ibinder)));
	//   14   27:new             #30  <Class zzqe>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokespecial   #33  <Method void zzqe(IBinder)>
	//   18   35:areturn         
	}

	public final zzqa zzb(Context context, FrameLayout framelayout, FrameLayout framelayout1)
	{
		try
		{
			com.google.android.gms.dynamic.IObjectWrapper iobjectwrapper = ObjectWrapper.wrap(((Object) (context)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #45  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    2    4:astore          4
			framelayout = ((FrameLayout) (ObjectWrapper.wrap(((Object) (framelayout)))));
	//    3    6:aload_2         
	//    4    7:invokestatic    #45  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    5   10:astore_2        
			framelayout1 = ((FrameLayout) (ObjectWrapper.wrap(((Object) (framelayout1)))));
	//    6   11:aload_3         
	//    7   12:invokestatic    #45  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    8   15:astore_3        
			context = ((Context) (((zzqd)getRemoteCreatorInstance(context)).zza(iobjectwrapper, ((com.google.android.gms.dynamic.IObjectWrapper) (framelayout)), ((com.google.android.gms.dynamic.IObjectWrapper) (framelayout1)), 0xbdfcb8)));
	//    9   16:aload_0         
	//   10   17:aload_1         
	//   11   18:invokevirtual   #49  <Method Object getRemoteCreatorInstance(Context)>
	//   12   21:checkcast       #28  <Class zzqd>
	//   13   24:aload           4
	//   14   26:aload_2         
	//   15   27:aload_3         
	//   16   28:ldc1            #50  <Int 0xbdfcb8>
	//   17   30:invokeinterface #54  <Method IBinder zzqd.zza(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper, int)>
	//   18   35:astore_1        
		}
	//*  19   36:aload_1         
	//*  20   37:ifnonnull       42
	//*  21   40:aconst_null     
	//*  22   41:areturn         
	//*  23   42:aload_1         
	//*  24   43:ldc1            #56  <String "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate">
	//*  25   45:invokeinterface #26  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//*  26   50:astore_2        
	//*  27   51:aload_2         
	//*  28   52:instanceof      #58  <Class zzqa>
	//*  29   55:ifeq            63
	//*  30   58:aload_2         
	//*  31   59:checkcast       #58  <Class zzqa>
	//*  32   62:areturn         
	//*  33   63:new             #60  <Class zzqc>
	//*  34   66:dup             
	//*  35   67:aload_1         
	//*  36   68:invokespecial   #61  <Method void zzqc(IBinder)>
	//*  37   71:astore_1        
	//*  38   72:aload_1         
	//*  39   73:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  40   74:astore_1        
		{
			zzane.zzc("Could not create remote NativeAdViewDelegate.", ((Throwable) (context)));
	//   41   75:ldc1            #63  <String "Could not create remote NativeAdViewDelegate.">
	//   42   77:aload_1         
	//   43   78:invokestatic    #69  <Method void zzane.zzc(String, Throwable)>
			return null;
	//   44   81:aconst_null     
	//   45   82:areturn         
		}
		if(context == null)
			return null;
		framelayout = ((FrameLayout) (((IBinder) (context)).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate")));
		if(framelayout instanceof zzqa)
			return (zzqa)framelayout;
		context = ((Context) (new zzqc(((IBinder) (context)))));
		return ((zzqa) (context));
	}
}
