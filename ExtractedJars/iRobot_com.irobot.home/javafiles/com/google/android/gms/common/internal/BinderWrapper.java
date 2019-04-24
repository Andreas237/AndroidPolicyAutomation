// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.common.internal:
//			zza

public final class BinderWrapper
	implements Parcelable
{

	public BinderWrapper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		zzcy = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #26  <Field IBinder zzcy>
	//    5    9:return          
	}

	public BinderWrapper(IBinder ibinder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		zzcy = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #26  <Field IBinder zzcy>
		zzcy = ibinder;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #26  <Field IBinder zzcy>
	//    8   14:return          
	}

	private BinderWrapper(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		zzcy = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #26  <Field IBinder zzcy>
		zzcy = parcel.readStrongBinder();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #35  <Method IBinder Parcel.readStrongBinder()>
	//    8   14:putfield        #26  <Field IBinder zzcy>
	//    9   17:return          
	}

	BinderWrapper(Parcel parcel, zza zza1)
	{
		this(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #38  <Method void BinderWrapper(Parcel)>
	//    3    5:return          
	}

	public final int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeStrongBinder(zzcy);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #26  <Field IBinder zzcy>
	//    3    5:invokevirtual   #45  <Method void Parcel.writeStrongBinder(IBinder)>
	//    4    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zza();
	private IBinder zzcy;

	static 
	{
	//    0    0:new             #17  <Class zza>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void zza()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
