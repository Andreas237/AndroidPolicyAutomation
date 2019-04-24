// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;

// Referenced classes of package com.google.android.exoplayer2.metadata.scte35:
//			PrivateCommand

static final class PrivateCommand$1
	implements android.os.r
{

	public PrivateCommand createFromParcel(Parcel parcel)
	{
		return new PrivateCommand(parcel, ((PrivateCommand$1) (null)));
	//    0    0:new             #9   <Class PrivateCommand>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #19  <Method void PrivateCommand(Parcel, PrivateCommand$1)>
	//    5    9:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #22  <Method PrivateCommand createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public PrivateCommand[] newArray(int i)
	{
		return new PrivateCommand[i];
	//    0    0:iload_1         
	//    1    1:anewarray       PrivateCommand[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #27  <Method PrivateCommand[] newArray(int)>
	//    3    5:areturn         
	}

	PrivateCommand$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
