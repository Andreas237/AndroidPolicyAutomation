// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.c.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bxx, bxy, bxu, bxw, 
//			aag

public final class byx extends e
{

	public byx()
	{
		super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
	//    0    0:aload_0         
	//    1    1:ldc1            #9   <String "com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl">
	//    2    3:invokespecial   #12  <Method void e(String)>
	//    3    6:return          
	}

	protected final Object a(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
	//    4    6:aload_1         
	//    5    7:ldc1            #17  <String "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator">
	//    6    9:invokeinterface #23  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_2        
		if(iinterface instanceof bxx)
	//*   8   15:aload_2         
	//*   9   16:instanceof      #25  <Class bxx>
	//*  10   19:ifeq            27
			return ((Object) ((bxx)iinterface));
	//   11   22:aload_2         
	//   12   23:checkcast       #25  <Class bxx>
	//   13   26:areturn         
		else
			return ((Object) (new bxy(ibinder)));
	//   14   27:new             #27  <Class bxy>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokespecial   #30  <Method void bxy(IBinder)>
	//   18   35:areturn         
	}

	public final bxu b(Context context)
	{
		com.google.android.gms.c.a a1 = d.a(((Object) (context)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #41  <Method com.google.android.gms.c.a d.a(Object)>
	//    2    4:astore_2        
		context = ((Context) (((bxx)a(context)).a(a1, 0xda3360)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #44  <Method Object a(Context)>
	//    6   10:checkcast       #25  <Class bxx>
	//    7   13:aload_2         
	//    8   14:ldc1            #45  <Int 0xda3360>
	//    9   16:invokeinterface #48  <Method IBinder bxx.a(com.google.android.gms.c.a, int)>
	//   10   21:astore_1        
		if(context == null)
	//*  11   22:aload_1         
	//*  12   23:ifnonnull       28
			return null;
	//   13   26:aconst_null     
	//   14   27:areturn         
		android.os.IInterface iinterface = ((IBinder) (context)).queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
	//   15   28:aload_1         
	//   16   29:ldc1            #50  <String "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager">
	//   17   31:invokeinterface #23  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   18   36:astore_2        
		if(iinterface instanceof bxu)
	//*  19   37:aload_2         
	//*  20   38:instanceof      #52  <Class bxu>
	//*  21   41:ifeq            49
			return (bxu)iinterface;
	//   22   44:aload_2         
	//   23   45:checkcast       #52  <Class bxu>
	//   24   48:areturn         
		context = ((Context) (new bxw(((IBinder) (context)))));
	//   25   49:new             #54  <Class bxw>
	//   26   52:dup             
	//   27   53:aload_1         
	//   28   54:invokespecial   #55  <Method void bxw(IBinder)>
	//   29   57:astore_1        
		return ((bxu) (context));
	//   30   58:aload_1         
	//   31   59:areturn         
		context;
	//   32   60:astore_1        
		break MISSING_BLOCK_LABEL_65;
	//   33   61:goto            65
		context;
	//   34   64:astore_1        
		aag.c("Could not get remote MobileAdsSettingManager.", ((Throwable) (context)));
	//   35   65:ldc1            #57  <String "Could not get remote MobileAdsSettingManager.">
	//   36   67:aload_1         
	//   37   68:invokestatic    #63  <Method void aag.c(String, Throwable)>
		return null;
	//   38   71:aconst_null     
	//   39   72:areturn         
	}
}
