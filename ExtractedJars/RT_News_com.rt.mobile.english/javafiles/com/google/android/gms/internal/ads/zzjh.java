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
//			zzkv, zzkw, zzks, zzku, 
//			zzane, zzjn, zzxn

public final class zzjh extends RemoteCreator
{

	public zzjh()
	{
		super("com.google.android.gms.ads.AdManagerCreatorImpl");
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <String "com.google.android.gms.ads.AdManagerCreatorImpl">
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
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
	//    4    6:aload_1         
	//    5    7:ldc1            #20  <String "com.google.android.gms.ads.internal.client.IAdManagerCreator">
	//    6    9:invokeinterface #26  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_2        
		if(iinterface instanceof zzkv)
	//*   8   15:aload_2         
	//*   9   16:instanceof      #28  <Class zzkv>
	//*  10   19:ifeq            27
			return ((Object) ((zzkv)iinterface));
	//   11   22:aload_2         
	//   12   23:checkcast       #28  <Class zzkv>
	//   13   26:areturn         
		else
			return ((Object) (new zzkw(ibinder)));
	//   14   27:new             #30  <Class zzkw>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokespecial   #33  <Method void zzkw(IBinder)>
	//   18   35:areturn         
	}

	public final zzks zza(Context context, zzjn zzjn, String s, zzxn zzxn, int i)
	{
		try
		{
			com.google.android.gms.dynamic.IObjectWrapper iobjectwrapper = ObjectWrapper.wrap(((Object) (context)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #45  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    2    4:astore          6
			context = ((Context) (((zzkv)getRemoteCreatorInstance(context)).zza(iobjectwrapper, zzjn, s, zzxn, 0xbdfcb8, i)));
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #49  <Method Object getRemoteCreatorInstance(Context)>
	//    6   11:checkcast       #28  <Class zzkv>
	//    7   14:aload           6
	//    8   16:aload_2         
	//    9   17:aload_3         
	//   10   18:aload           4
	//   11   20:ldc1            #50  <Int 0xbdfcb8>
	//   12   22:iload           5
	//   13   24:invokeinterface #53  <Method IBinder zzkv.zza(com.google.android.gms.dynamic.IObjectWrapper, zzjn, String, zzxn, int, int)>
	//   14   29:astore_1        
		}
	//*  15   30:aload_1         
	//*  16   31:ifnonnull       36
	//*  17   34:aconst_null     
	//*  18   35:areturn         
	//*  19   36:aload_1         
	//*  20   37:ldc1            #55  <String "com.google.android.gms.ads.internal.client.IAdManager">
	//*  21   39:invokeinterface #26  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//*  22   44:astore_2        
	//*  23   45:aload_2         
	//*  24   46:instanceof      #57  <Class zzks>
	//*  25   49:ifeq            57
	//*  26   52:aload_2         
	//*  27   53:checkcast       #57  <Class zzks>
	//*  28   56:areturn         
	//*  29   57:new             #59  <Class zzku>
	//*  30   60:dup             
	//*  31   61:aload_1         
	//*  32   62:invokespecial   #60  <Method void zzku(IBinder)>
	//*  33   65:astore_1        
	//*  34   66:aload_1         
	//*  35   67:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  36   68:astore_1        
		{
			zzane.zza("Could not create remote AdManager.", ((Throwable) (context)));
	//   37   69:ldc1            #62  <String "Could not create remote AdManager.">
	//   38   71:aload_1         
	//   39   72:invokestatic    #67  <Method void zzane.zza(String, Throwable)>
			return null;
	//   40   75:aconst_null     
	//   41   76:areturn         
		}
		if(context == null)
			return null;
		zzjn = ((zzjn) (((IBinder) (context)).queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager")));
		if(zzjn instanceof zzks)
			return (zzks)zzjn;
		context = ((Context) (new zzku(((IBinder) (context)))));
		return ((zzks) (context));
	}
}
