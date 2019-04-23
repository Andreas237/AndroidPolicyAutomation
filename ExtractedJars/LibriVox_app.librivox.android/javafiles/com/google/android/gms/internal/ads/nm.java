// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.c.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			nq, nn, np, aag, 
//			nr

public final class nm extends e
{

	public nm()
	{
		super("com.google.android.gms.ads.AdOverlayCreatorImpl");
	//    0    0:aload_0         
	//    1    1:ldc1            #9   <String "com.google.android.gms.ads.AdOverlayCreatorImpl">
	//    2    3:invokespecial   #12  <Method void e(String)>
	//    3    6:return          
	}

	public final nn a(Activity activity)
	{
		android.os.IInterface iinterface;
		try
		{
			com.google.android.gms.c.a a1 = d.a(((Object) (activity)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #24  <Method com.google.android.gms.c.a d.a(Object)>
	//    2    4:astore_2        
			activity = ((Activity) (((nq)a(((android.content.Context) (activity)))).a(a1)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #27  <Method Object a(android.content.Context)>
	//    6   10:checkcast       #29  <Class nq>
	//    7   13:aload_2         
	//    8   14:invokeinterface #32  <Method IBinder nq.a(com.google.android.gms.c.a)>
	//    9   19:astore_1        
		}
	//*  10   20:aload_1         
	//*  11   21:ifnonnull       26
	//*  12   24:aconst_null     
	//*  13   25:areturn         
	//*  14   26:aload_1         
	//*  15   27:ldc1            #34  <String "com.google.android.gms.ads.internal.overlay.client.IAdOverlay">
	//*  16   29:invokeinterface #40  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//*  17   34:astore_2        
	//*  18   35:aload_2         
	//*  19   36:instanceof      #42  <Class nn>
	//*  20   39:ifeq            47
	//*  21   42:aload_2         
	//*  22   43:checkcast       #42  <Class nn>
	//*  23   46:areturn         
	//*  24   47:new             #44  <Class np>
	//*  25   50:dup             
	//*  26   51:aload_1         
	//*  27   52:invokespecial   #47  <Method void np(IBinder)>
	//*  28   55:astore_1        
	//*  29   56:aload_1         
	//*  30   57:areturn         
	//*  31   58:astore_1        
	//*  32   59:ldc1            #49  <String "Could not create remote AdOverlay.">
	//*  33   61:aload_1         
	//*  34   62:invokestatic    #55  <Method void aag.c(String, Throwable)>
	//*  35   65:aconst_null     
	//*  36   66:areturn         
		// Misplaced declaration of an exception variable
		catch(Activity activity)
	//*  37   67:astore_1        
		{
			aag.c("Could not create remote AdOverlay.", ((Throwable) (activity)));
	//   38   68:ldc1            #49  <String "Could not create remote AdOverlay.">
	//   39   70:aload_1         
	//   40   71:invokestatic    #55  <Method void aag.c(String, Throwable)>
			return null;
	//   41   74:aconst_null     
	//   42   75:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(Activity activity)
		{
			aag.c("Could not create remote AdOverlay.", ((Throwable) (activity)));
			return null;
		}
		if(activity == null)
			return null;
		iinterface = ((IBinder) (activity)).queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
		if(iinterface instanceof nn)
			return (nn)iinterface;
		activity = ((Activity) (new np(((IBinder) (activity)))));
		return ((nn) (activity));
	}

	protected final Object a(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
	//    4    6:aload_1         
	//    5    7:ldc1            #58  <String "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator">
	//    6    9:invokeinterface #40  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_2        
		if(iinterface instanceof nq)
	//*   8   15:aload_2         
	//*   9   16:instanceof      #29  <Class nq>
	//*  10   19:ifeq            27
			return ((Object) ((nq)iinterface));
	//   11   22:aload_2         
	//   12   23:checkcast       #29  <Class nq>
	//   13   26:areturn         
		else
			return ((Object) (new nr(ibinder)));
	//   14   27:new             #60  <Class nr>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokespecial   #61  <Method void nr(IBinder)>
	//   18   35:areturn         
	}
}
