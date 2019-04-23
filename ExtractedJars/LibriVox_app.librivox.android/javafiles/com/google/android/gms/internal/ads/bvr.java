// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.c.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bxf, bxc, bxe, aag, 
//			bxg, zzwf, km

public final class bvr extends e
{

	public bvr()
	{
		super("com.google.android.gms.ads.AdManagerCreatorImpl");
	//    0    0:aload_0         
	//    1    1:ldc1            #9   <String "com.google.android.gms.ads.AdManagerCreatorImpl">
	//    2    3:invokespecial   #12  <Method void e(String)>
	//    3    6:return          
	}

	public final bxc a(Context context, zzwf zzwf, String s, km km, int i)
	{
		com.google.android.gms.c.a a1 = d.a(((Object) (context)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #24  <Method com.google.android.gms.c.a d.a(Object)>
	//    2    4:astore          6
		context = ((Context) (((bxf)a(context)).a(a1, zzwf, s, km, 0xda3360, i)));
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #27  <Method Object a(Context)>
	//    6   11:checkcast       #29  <Class bxf>
	//    7   14:aload           6
	//    8   16:aload_2         
	//    9   17:aload_3         
	//   10   18:aload           4
	//   11   20:ldc1            #30  <Int 0xda3360>
	//   12   22:iload           5
	//   13   24:invokeinterface #33  <Method IBinder bxf.a(com.google.android.gms.c.a, zzwf, String, km, int, int)>
	//   14   29:astore_1        
		if(context == null)
	//*  15   30:aload_1         
	//*  16   31:ifnonnull       36
			return null;
	//   17   34:aconst_null     
	//   18   35:areturn         
		zzwf = ((zzwf) (((IBinder) (context)).queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager")));
	//   19   36:aload_1         
	//   20   37:ldc1            #35  <String "com.google.android.gms.ads.internal.client.IAdManager">
	//   21   39:invokeinterface #41  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   22   44:astore_2        
		if(zzwf instanceof bxc)
	//*  23   45:aload_2         
	//*  24   46:instanceof      #43  <Class bxc>
	//*  25   49:ifeq            57
			return (bxc)zzwf;
	//   26   52:aload_2         
	//   27   53:checkcast       #43  <Class bxc>
	//   28   56:areturn         
		context = ((Context) (new bxe(((IBinder) (context)))));
	//   29   57:new             #45  <Class bxe>
	//   30   60:dup             
	//   31   61:aload_1         
	//   32   62:invokespecial   #48  <Method void bxe(IBinder)>
	//   33   65:astore_1        
		return ((bxc) (context));
	//   34   66:aload_1         
	//   35   67:areturn         
		context;
	//   36   68:astore_1        
		break MISSING_BLOCK_LABEL_73;
	//   37   69:goto            73
		context;
	//   38   72:astore_1        
		aag.a("Could not create remote AdManager.", ((Throwable) (context)));
	//   39   73:ldc1            #50  <String "Could not create remote AdManager.">
	//   40   75:aload_1         
	//   41   76:invokestatic    #55  <Method void aag.a(String, Throwable)>
		return null;
	//   42   79:aconst_null     
	//   43   80:areturn         
	}

	protected final Object a(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
	//    4    6:aload_1         
	//    5    7:ldc1            #58  <String "com.google.android.gms.ads.internal.client.IAdManagerCreator">
	//    6    9:invokeinterface #41  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_2        
		if(iinterface instanceof bxf)
	//*   8   15:aload_2         
	//*   9   16:instanceof      #29  <Class bxf>
	//*  10   19:ifeq            27
			return ((Object) ((bxf)iinterface));
	//   11   22:aload_2         
	//   12   23:checkcast       #29  <Class bxf>
	//   13   26:areturn         
		else
			return ((Object) (new bxg(ibinder)));
	//   14   27:new             #60  <Class bxg>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokespecial   #61  <Method void bxg(IBinder)>
	//   18   35:areturn         
	}
}
