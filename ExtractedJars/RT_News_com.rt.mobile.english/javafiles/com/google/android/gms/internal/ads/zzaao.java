// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaas, zzaat, zzaap, zzaar, 
//			zzane

public final class zzaao extends RemoteCreator
{

	public zzaao()
	{
		super("com.google.android.gms.ads.AdOverlayCreatorImpl");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.AdOverlayCreatorImpl">
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
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
	//    4    6:aload_1         
	//    5    7:ldc1            #18  <String "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator">
	//    6    9:invokeinterface #24  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_2        
		if(iinterface instanceof zzaas)
	//*   8   15:aload_2         
	//*   9   16:instanceof      #26  <Class zzaas>
	//*  10   19:ifeq            27
			return ((Object) ((zzaas)iinterface));
	//   11   22:aload_2         
	//   12   23:checkcast       #26  <Class zzaas>
	//   13   26:areturn         
		else
			return ((Object) (new zzaat(ibinder)));
	//   14   27:new             #28  <Class zzaat>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokespecial   #31  <Method void zzaat(IBinder)>
	//   18   35:areturn         
	}

	public final zzaap zze(Activity activity)
	{
		android.os.IInterface iinterface;
		try
		{
			com.google.android.gms.dynamic.IObjectWrapper iobjectwrapper = ObjectWrapper.wrap(((Object) (activity)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #43  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    2    4:astore_2        
			activity = ((Activity) (((zzaas)getRemoteCreatorInstance(((android.content.Context) (activity)))).zzp(iobjectwrapper)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #47  <Method Object getRemoteCreatorInstance(android.content.Context)>
	//    6   10:checkcast       #26  <Class zzaas>
	//    7   13:aload_2         
	//    8   14:invokeinterface #51  <Method IBinder zzaas.zzp(com.google.android.gms.dynamic.IObjectWrapper)>
	//    9   19:astore_1        
		}
	//*  10   20:aload_1         
	//*  11   21:ifnonnull       26
	//*  12   24:aconst_null     
	//*  13   25:areturn         
	//*  14   26:aload_1         
	//*  15   27:ldc1            #53  <String "com.google.android.gms.ads.internal.overlay.client.IAdOverlay">
	//*  16   29:invokeinterface #24  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//*  17   34:astore_2        
	//*  18   35:aload_2         
	//*  19   36:instanceof      #55  <Class zzaap>
	//*  20   39:ifeq            47
	//*  21   42:aload_2         
	//*  22   43:checkcast       #55  <Class zzaap>
	//*  23   46:areturn         
	//*  24   47:new             #57  <Class zzaar>
	//*  25   50:dup             
	//*  26   51:aload_1         
	//*  27   52:invokespecial   #58  <Method void zzaar(IBinder)>
	//*  28   55:astore_1        
	//*  29   56:aload_1         
	//*  30   57:areturn         
		// Misplaced declaration of an exception variable
		catch(Activity activity)
	//*  31   58:astore_1        
		{
			zzane.zzc("Could not create remote AdOverlay.", ((Throwable) (activity)));
	//   32   59:ldc1            #60  <String "Could not create remote AdOverlay.">
	//   33   61:aload_1         
	//   34   62:invokestatic    #66  <Method void zzane.zzc(String, Throwable)>
			return null;
	//   35   65:aconst_null     
	//   36   66:areturn         
		}
		if(activity == null)
			return null;
		iinterface = ((IBinder) (activity)).queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
		if(iinterface instanceof zzaap)
			return (zzaap)iinterface;
		activity = ((Activity) (new zzaar(((IBinder) (activity)))));
		return ((zzaap) (activity));
	}
}
