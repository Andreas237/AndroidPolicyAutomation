// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.gcm;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.gcm:
//			PeriodicTask

final class PeriodicTask$1
	implements android.os.tor
{

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzgj(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #20  <Method PeriodicTask zzgj(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzjw(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #26  <Method PeriodicTask[] zzjw(int)>
	//    3    5:areturn         
	}

	public PeriodicTask zzgj(Parcel parcel)
	{
		return new PeriodicTask(parcel, ((PeriodicTask$1) (null)));
	//    0    0:new             #9   <Class PeriodicTask>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #29  <Method void PeriodicTask(Parcel, PeriodicTask$1)>
	//    5    9:areturn         
	}

	public PeriodicTask[] zzjw(int i)
	{
		return new PeriodicTask[i];
	//    0    0:iload_1         
	//    1    1:anewarray       PeriodicTask[]
	//    2    4:areturn         
	}

	PeriodicTask$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
