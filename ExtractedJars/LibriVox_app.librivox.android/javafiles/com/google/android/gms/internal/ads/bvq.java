// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.c.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bxa, bwx, bwz, aag, 
//			bxb, km

public final class bvq extends e
{

	public bvq()
	{
		super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
	//    0    0:aload_0         
	//    1    1:ldc1            #9   <String "com.google.android.gms.ads.AdLoaderBuilderCreatorImpl">
	//    2    3:invokespecial   #12  <Method void e(String)>
	//    3    6:return          
	}

	public final bwx a(Context context, String s, km km)
	{
		com.google.android.gms.c.a a1 = d.a(((Object) (context)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #24  <Method com.google.android.gms.c.a d.a(Object)>
	//    2    4:astore          4
		context = ((Context) (((bxa)a(context)).a(a1, s, km, 0xda3360)));
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #27  <Method Object a(Context)>
	//    6   11:checkcast       #29  <Class bxa>
	//    7   14:aload           4
	//    8   16:aload_2         
	//    9   17:aload_3         
	//   10   18:ldc1            #30  <Int 0xda3360>
	//   11   20:invokeinterface #33  <Method IBinder bxa.a(com.google.android.gms.c.a, String, km, int)>
	//   12   25:astore_1        
		if(context == null)
	//*  13   26:aload_1         
	//*  14   27:ifnonnull       32
			return null;
	//   15   30:aconst_null     
	//   16   31:areturn         
		s = ((String) (((IBinder) (context)).queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder")));
	//   17   32:aload_1         
	//   18   33:ldc1            #35  <String "com.google.android.gms.ads.internal.client.IAdLoaderBuilder">
	//   19   35:invokeinterface #41  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   20   40:astore_2        
		if(s instanceof bwx)
	//*  21   41:aload_2         
	//*  22   42:instanceof      #43  <Class bwx>
	//*  23   45:ifeq            53
			return (bwx)s;
	//   24   48:aload_2         
	//   25   49:checkcast       #43  <Class bwx>
	//   26   52:areturn         
		context = ((Context) (new bwz(((IBinder) (context)))));
	//   27   53:new             #45  <Class bwz>
	//   28   56:dup             
	//   29   57:aload_1         
	//   30   58:invokespecial   #48  <Method void bwz(IBinder)>
	//   31   61:astore_1        
		return ((bwx) (context));
	//   32   62:aload_1         
	//   33   63:areturn         
		context;
	//   34   64:astore_1        
		break MISSING_BLOCK_LABEL_69;
	//   35   65:goto            69
		context;
	//   36   68:astore_1        
		aag.c("Could not create remote builder for AdLoader.", ((Throwable) (context)));
	//   37   69:ldc1            #50  <String "Could not create remote builder for AdLoader.">
	//   38   71:aload_1         
	//   39   72:invokestatic    #56  <Method void aag.c(String, Throwable)>
		return null;
	//   40   75:aconst_null     
	//   41   76:areturn         
	}

	protected final Object a(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
	//    4    6:aload_1         
	//    5    7:ldc1            #59  <String "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator">
	//    6    9:invokeinterface #41  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_2        
		if(iinterface instanceof bxa)
	//*   8   15:aload_2         
	//*   9   16:instanceof      #29  <Class bxa>
	//*  10   19:ifeq            27
			return ((Object) ((bxa)iinterface));
	//   11   22:aload_2         
	//   12   23:checkcast       #29  <Class bxa>
	//   13   26:areturn         
		else
			return ((Object) (new bxb(ibinder)));
	//   14   27:new             #61  <Class bxb>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokespecial   #62  <Method void bxb(IBinder)>
	//   18   35:areturn         
	}
}
