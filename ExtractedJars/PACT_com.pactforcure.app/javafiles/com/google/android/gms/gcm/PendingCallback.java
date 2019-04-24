// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.gcm;

import android.os.*;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class PendingCallback
	implements Parcelable, ReflectedParcelable
{

	public PendingCallback(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		zzaEa = parcel.readStrongBinder();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #31  <Method IBinder Parcel.readStrongBinder()>
	//    5    9:putfield        #33  <Field IBinder zzaEa>
	//    6   12:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public IBinder getIBinder()
	{
		return zzaEa;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field IBinder zzaEa>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeStrongBinder(zzaEa);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #33  <Field IBinder zzaEa>
	//    3    5:invokevirtual   #42  <Method void Parcel.writeStrongBinder(IBinder)>
	//    4    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (zzgi(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #20  <Method PendingCallback zzgi(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (zzjv(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #26  <Method PendingCallback[] zzjv(int)>
		//    3    5:areturn         
		}

		public PendingCallback zzgi(Parcel parcel)
		{
			return new PendingCallback(parcel);
		//    0    0:new             #9   <Class PendingCallback>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #29  <Method void PendingCallback(Parcel)>
		//    4    8:areturn         
		}

		public PendingCallback[] zzjv(int i)
		{
			return new PendingCallback[i];
		//    0    0:iload_1         
		//    1    1:anewarray       PendingCallback[]
		//    2    4:areturn         
		}

	}
;
	final IBinder zzaEa;

	static 
	{
	//    0    0:new             #10  <Class PendingCallback$1>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void PendingCallback$1()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
