// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			IStatusCallback

public static abstract class IStatusCallback$Stub extends zab
	implements IStatusCallback
{
	public static final class zaa extends com.google.android.gms.internal.base.zaa
		implements IStatusCallback
	{

		public final void onResult(Status status)
		{
			Parcel parcel = ((com.google.android.gms.internal.base.zaa)this).zaa();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #23  <Method Parcel com.google.android.gms.internal.base.zaa.zaa()>
		//    2    4:astore_2        
			zac.zaa(parcel, ((android.os.Parcelable) (status)));
		//    3    5:aload_2         
		//    4    6:aload_1         
		//    5    7:invokestatic    #28  <Method void zac.zaa(Parcel, android.os.Parcelable)>
			((com.google.android.gms.internal.base.zaa)this).zac(1, parcel);
		//    6   10:aload_0         
		//    7   11:iconst_1        
		//    8   12:aload_2         
		//    9   13:invokevirtual   #32  <Method void com.google.android.gms.internal.base.zaa.zac(int, Parcel)>
		//   10   16:return          
		}

		zaa(IBinder ibinder)
		{
			super(ibinder, "com.google.android.gms.common.api.internal.IStatusCallback");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #14  <String "com.google.android.gms.common.api.internal.IStatusCallback">
		//    3    4:invokespecial   #17  <Method void com.google.android.gms.internal.base.zaa(IBinder, String)>
		//    4    7:return          
		}
	}


	public static IStatusCallback asInterface(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
	//    4    6:aload_0         
	//    5    7:ldc1            #14  <String "com.google.android.gms.common.api.internal.IStatusCallback">
	//    6    9:invokeinterface #26  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof IStatusCallback)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class IStatusCallback>
	//*  10   19:ifeq            27
			return (IStatusCallback)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class IStatusCallback>
	//   13   26:areturn         
		else
			return ((IStatusCallback) (new zaa(ibinder)));
	//   14   27:new             #9   <Class IStatusCallback$Stub$zaa>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #29  <Method void IStatusCallback$Stub$zaa(IBinder)>
	//   18   35:areturn         
	}

	protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          21
		{
			onResult((Status)zac.zaa(parcel, Status.CREATOR));
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:getstatic       #37  <Field android.os.Parcelable$Creator Status.CREATOR>
	//    6   10:invokestatic    #42  <Method android.os.Parcelable zac.zaa(Parcel, android.os.Parcelable$Creator)>
	//    7   13:checkcast       #33  <Class Status>
	//    8   16:invokevirtual   #46  <Method void onResult(Status)>
			return true;
	//    9   19:iconst_1        
	//   10   20:ireturn         
		} else
		{
			return false;
	//   11   21:iconst_0        
	//   12   22:ireturn         
		}
	}

	public IStatusCallback$Stub()
	{
		super("com.google.android.gms.common.api.internal.IStatusCallback");
	//    0    0:aload_0         
	//    1    1:ldc1            #14  <String "com.google.android.gms.common.api.internal.IStatusCallback">
	//    2    3:invokespecial   #17  <Method void zab(String)>
	//    3    6:return          
	}
}
