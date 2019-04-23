// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.common.internal.e;

// Referenced classes of package com.google.android.gms.internal.ads:
//			tk, rp, rr

public final class rj extends d
{

	public rj(Context context, Looper looper, com.google.android.gms.common.internal.d d1, e e1)
	{
		super(tk.a(context), looper, 8, d1, e1, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #13  <Method Context tk.a(Context)>
	//    3    5:aload_2         
	//    4    6:bipush          8
	//    5    8:aload_3         
	//    6    9:aload           4
	//    7   11:aconst_null     
	//    8   12:invokespecial   #16  <Method void d(Context, Looper, int, com.google.android.gms.common.internal.d, e, String)>
	//    9   15:return          
	}

	protected final IInterface a(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
	//    4    6:aload_1         
	//    5    7:ldc1            #20  <String "com.google.android.gms.ads.internal.request.IAdRequestService">
	//    6    9:invokeinterface #26  <Method IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_2        
		if(iinterface instanceof rp)
	//*   8   15:aload_2         
	//*   9   16:instanceof      #28  <Class rp>
	//*  10   19:ifeq            27
			return ((IInterface) ((rp)iinterface));
	//   11   22:aload_2         
	//   12   23:checkcast       #28  <Class rp>
	//   13   26:areturn         
		else
			return ((IInterface) (new rr(ibinder)));
	//   14   27:new             #30  <Class rr>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokespecial   #33  <Method void rr(IBinder)>
	//   18   35:areturn         
	}

	protected final String b()
	{
		return "com.google.android.gms.ads.internal.request.IAdRequestService";
	//    0    0:ldc1            #20  <String "com.google.android.gms.ads.internal.request.IAdRequestService">
	//    1    2:areturn         
	}

	protected final String c_()
	{
		return "com.google.android.gms.ads.service.START";
	//    0    0:ldc1            #38  <String "com.google.android.gms.ads.service.START">
	//    1    2:areturn         
	}

	public final rp e()
	{
		return (rp)super.x();
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method IInterface d.x()>
	//    2    4:checkcast       #28  <Class rp>
	//    3    7:areturn         
	}
}
