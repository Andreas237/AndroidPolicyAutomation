// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;

import android.content.Context;
import android.os.*;
import com.google.android.gms.common.api.y;
import com.google.android.gms.common.api.z;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.u;

// Referenced classes of package com.google.android.gms.internal.clearcut:
//			jz, ka

public final class jv extends u
{

	public jv(Context context, Looper looper, p p, y y, z z)
	{
		super(context, looper, 40, p, y, z);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:bipush          40
	//    4    5:aload_3         
	//    5    6:aload           4
	//    6    8:aload           5
	//    7   10:invokespecial   #9   <Method void u(Context, Looper, int, p, y, z)>
	//    8   13:return          
	}

	protected final IInterface a(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
	//    4    6:aload_1         
	//    5    7:ldc1            #14  <String "com.google.android.gms.clearcut.internal.IClearcutLoggerService">
	//    6    9:invokeinterface #20  <Method IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_2        
		if(iinterface instanceof jz)
	//*   8   15:aload_2         
	//*   9   16:instanceof      #22  <Class jz>
	//*  10   19:ifeq            27
			return ((IInterface) ((jz)iinterface));
	//   11   22:aload_2         
	//   12   23:checkcast       #22  <Class jz>
	//   13   26:areturn         
		else
			return ((IInterface) (new ka(ibinder)));
	//   14   27:new             #24  <Class ka>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokespecial   #27  <Method void ka(IBinder)>
	//   18   35:areturn         
	}

	protected final String b()
	{
		return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
	//    0    0:ldc1            #14  <String "com.google.android.gms.clearcut.internal.IClearcutLoggerService">
	//    1    2:areturn         
	}

	protected final String c_()
	{
		return "com.google.android.gms.clearcut.service.START";
	//    0    0:ldc1            #32  <String "com.google.android.gms.clearcut.service.START">
	//    1    2:areturn         
	}

	public final int f()
	{
		return 0xb5f608;
	//    0    0:ldc1            #35  <Int 0xb5f608>
	//    1    2:ireturn         
	}
}
