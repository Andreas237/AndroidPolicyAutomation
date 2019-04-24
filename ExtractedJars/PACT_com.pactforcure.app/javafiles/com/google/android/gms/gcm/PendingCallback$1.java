// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.gcm;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.gcm:
//			PendingCallback

final class PendingCallback$1
	implements android.os.
{

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

	PendingCallback$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
