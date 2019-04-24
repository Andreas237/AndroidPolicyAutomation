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
//			zzkq, zzkr, zzkn, zzkp, 
//			zzane, zzxn

public final class zzjg extends RemoteCreator
{

	public zzjg()
	{
		super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.AdLoaderBuilderCreatorImpl">
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
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
	//    4    6:aload_1         
	//    5    7:ldc1            #18  <String "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator">
	//    6    9:invokeinterface #24  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_2        
		if(iinterface instanceof zzkq)
	//*   8   15:aload_2         
	//*   9   16:instanceof      #26  <Class zzkq>
	//*  10   19:ifeq            27
			return ((Object) ((zzkq)iinterface));
	//   11   22:aload_2         
	//   12   23:checkcast       #26  <Class zzkq>
	//   13   26:areturn         
		else
			return ((Object) (new zzkr(ibinder)));
	//   14   27:new             #28  <Class zzkr>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokespecial   #31  <Method void zzkr(IBinder)>
	//   18   35:areturn         
	}

	public final zzkn zza(Context context, String s, zzxn zzxn)
	{
		try
		{
			com.google.android.gms.dynamic.IObjectWrapper iobjectwrapper = ObjectWrapper.wrap(((Object) (context)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #43  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    2    4:astore          4
			context = ((Context) (((zzkq)getRemoteCreatorInstance(context)).zza(iobjectwrapper, s, zzxn, 0xbdfcb8)));
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #47  <Method Object getRemoteCreatorInstance(Context)>
	//    6   11:checkcast       #26  <Class zzkq>
	//    7   14:aload           4
	//    8   16:aload_2         
	//    9   17:aload_3         
	//   10   18:ldc1            #48  <Int 0xbdfcb8>
	//   11   20:invokeinterface #51  <Method IBinder zzkq.zza(com.google.android.gms.dynamic.IObjectWrapper, String, zzxn, int)>
	//   12   25:astore_1        
		}
	//*  13   26:aload_1         
	//*  14   27:ifnonnull       32
	//*  15   30:aconst_null     
	//*  16   31:areturn         
	//*  17   32:aload_1         
	//*  18   33:ldc1            #53  <String "com.google.android.gms.ads.internal.client.IAdLoaderBuilder">
	//*  19   35:invokeinterface #24  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//*  20   40:astore_2        
	//*  21   41:aload_2         
	//*  22   42:instanceof      #55  <Class zzkn>
	//*  23   45:ifeq            53
	//*  24   48:aload_2         
	//*  25   49:checkcast       #55  <Class zzkn>
	//*  26   52:areturn         
	//*  27   53:new             #57  <Class zzkp>
	//*  28   56:dup             
	//*  29   57:aload_1         
	//*  30   58:invokespecial   #58  <Method void zzkp(IBinder)>
	//*  31   61:astore_1        
	//*  32   62:aload_1         
	//*  33   63:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  34   64:astore_1        
		{
			zzane.zzc("Could not create remote builder for AdLoader.", ((Throwable) (context)));
	//   35   65:ldc1            #60  <String "Could not create remote builder for AdLoader.">
	//   36   67:aload_1         
	//   37   68:invokestatic    #66  <Method void zzane.zzc(String, Throwable)>
			return null;
	//   38   71:aconst_null     
	//   39   72:areturn         
		}
		if(context == null)
			return null;
		s = ((String) (((IBinder) (context)).queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder")));
		if(s instanceof zzkn)
			return (zzkn)s;
		context = ((Context) (new zzkp(((IBinder) (context)))));
		return ((zzkn) (context));
	}
}
