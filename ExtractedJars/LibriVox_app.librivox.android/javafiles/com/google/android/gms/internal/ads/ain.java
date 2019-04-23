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
//			aiq, air

public final class ain extends d
{

	public ain(Context context, Looper looper, com.google.android.gms.common.internal.d d1, e e1)
	{
		super(context, looper, 116, d1, e1, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:bipush          116
	//    4    5:aload_3         
	//    5    6:aload           4
	//    6    8:aconst_null     
	//    7    9:invokespecial   #9   <Method void d(Context, Looper, int, com.google.android.gms.common.internal.d, e, String)>
	//    8   12:return          
	}

	protected final IInterface a(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
	//    4    6:aload_1         
	//    5    7:ldc1            #14  <String "com.google.android.gms.gass.internal.IGassService">
	//    6    9:invokeinterface #20  <Method IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_2        
		if(iinterface instanceof aiq)
	//*   8   15:aload_2         
	//*   9   16:instanceof      #22  <Class aiq>
	//*  10   19:ifeq            27
			return ((IInterface) ((aiq)iinterface));
	//   11   22:aload_2         
	//   12   23:checkcast       #22  <Class aiq>
	//   13   26:areturn         
		else
			return ((IInterface) (new air(ibinder)));
	//   14   27:new             #24  <Class air>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokespecial   #27  <Method void air(IBinder)>
	//   18   35:areturn         
	}

	protected final String b()
	{
		return "com.google.android.gms.gass.internal.IGassService";
	//    0    0:ldc1            #14  <String "com.google.android.gms.gass.internal.IGassService">
	//    1    2:areturn         
	}

	protected final String c_()
	{
		return "com.google.android.gms.gass.START";
	//    0    0:ldc1            #32  <String "com.google.android.gms.gass.START">
	//    1    2:areturn         
	}

	public final aiq e()
	{
		return (aiq)super.x();
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method IInterface d.x()>
	//    2    4:checkcast       #22  <Class aiq>
	//    3    7:areturn         
	}
}
