// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.gcm;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.gcm:
//			OneoffTask

final class OneoffTask$1
	implements android.os.eator
{

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzgh(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #20  <Method OneoffTask zzgh(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzju(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #26  <Method OneoffTask[] zzju(int)>
	//    3    5:areturn         
	}

	public OneoffTask zzgh(Parcel parcel)
	{
		return new OneoffTask(parcel, ((OneoffTask$1) (null)));
	//    0    0:new             #9   <Class OneoffTask>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #29  <Method void OneoffTask(Parcel, OneoffTask$1)>
	//    5    9:areturn         
	}

	public OneoffTask[] zzju(int i)
	{
		return new OneoffTask[i];
	//    0    0:iload_1         
	//    1    1:anewarray       OneoffTask[]
	//    2    4:areturn         
	}

	OneoffTask$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
