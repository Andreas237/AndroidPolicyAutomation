// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcj, bxh, bxj

public abstract class bxi extends bcj
	implements bxh
{

	public bxi()
	{
		super("com.google.android.gms.ads.internal.client.IAdMetadataListener");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IAdMetadataListener">
	//    2    3:invokespecial   #13  <Method void bcj(String)>
	//    3    6:return          
	}

	public static bxh a(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
	//    4    6:aload_0         
	//    5    7:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IAdMetadataListener">
	//    6    9:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof bxh)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class bxh>
	//*  10   19:ifeq            27
			return (bxh)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class bxh>
	//   13   26:areturn         
		else
			return ((bxh) (new bxj(ibinder)));
	//   14   27:new             #24  <Class bxj>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #27  <Method void bxj(IBinder)>
	//   18   35:areturn         
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          15
		{
			a();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #31  <Method void a()>
			parcel1.writeNoException();
	//    5    9:aload_3         
	//    6   10:invokevirtual   #36  <Method void Parcel.writeNoException()>
			return true;
	//    7   13:iconst_1        
	//    8   14:ireturn         
		} else
		{
			return false;
	//    9   15:iconst_0        
	//   10   16:ireturn         
		}
	}
}
