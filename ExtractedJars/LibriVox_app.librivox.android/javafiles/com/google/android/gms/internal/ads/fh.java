// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcj, fg, fi

public abstract class fh extends bcj
	implements fg
{

	public static fg a(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
	//    4    6:aload_0         
	//    5    7:ldc1            #10  <String "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback">
	//    6    9:invokeinterface #16  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof fg)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class fg>
	//*  10   19:ifeq            27
			return (fg)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class fg>
	//   13   26:areturn         
		else
			return ((fg) (new fi(ibinder)));
	//   14   27:new             #18  <Class fi>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #22  <Method void fi(IBinder)>
	//   18   35:areturn         
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
	{
		throw new NoSuchMethodError();
	//    0    0:new             #27  <Class NoSuchMethodError>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void NoSuchMethodError()>
	//    3    7:athrow          
	}
}
