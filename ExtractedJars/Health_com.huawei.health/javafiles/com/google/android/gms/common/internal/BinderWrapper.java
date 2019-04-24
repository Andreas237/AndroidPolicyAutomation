// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.*;

public final class BinderWrapper
	implements Parcelable
{

	public BinderWrapper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		zzaFz = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #25  <Field IBinder zzaFz>
	//    5    9:return          
	}

	public BinderWrapper(IBinder ibinder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		zzaFz = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #25  <Field IBinder zzaFz>
		zzaFz = ibinder;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #25  <Field IBinder zzaFz>
	//    8   14:return          
	}

	private BinderWrapper(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		zzaFz = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #25  <Field IBinder zzaFz>
		zzaFz = parcel.readStrongBinder();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #33  <Method IBinder Parcel.readStrongBinder()>
	//    8   14:putfield        #25  <Field IBinder zzaFz>
	//    9   17:return          
	}


	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeStrongBinder(zzaFz);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #25  <Field IBinder zzaFz>
	//    3    5:invokevirtual   #43  <Method void Parcel.writeStrongBinder(IBinder)>
	//    4    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (zzaR(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #20  <Method BinderWrapper zzaR(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (zzcT(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #26  <Method BinderWrapper[] zzcT(int)>
		//    3    5:areturn         
		}

		public BinderWrapper zzaR(Parcel parcel)
		{
			return new BinderWrapper(parcel);
		//    0    0:new             #9   <Class BinderWrapper>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #29  <Method void BinderWrapper(Parcel, BinderWrapper$1)>
		//    5    9:areturn         
		}

		public BinderWrapper[] zzcT(int i)
		{
			return new BinderWrapper[i];
		//    0    0:iload_1         
		//    1    1:anewarray       BinderWrapper[]
		//    2    4:areturn         
		}

	}
;
	private IBinder zzaFz;

	static 
	{
	//    0    0:new             #8   <Class BinderWrapper$1>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void BinderWrapper$1()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
