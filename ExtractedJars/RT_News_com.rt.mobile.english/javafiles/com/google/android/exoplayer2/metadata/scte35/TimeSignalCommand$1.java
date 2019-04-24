// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;

// Referenced classes of package com.google.android.exoplayer2.metadata.scte35:
//			TimeSignalCommand

static final class TimeSignalCommand$1
	implements android.os.Parcelable.Creator
{

	public TimeSignalCommand createFromParcel(Parcel parcel)
	{
		return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), ((TimeSignalCommand$1) (null)));
	//    0    0:new             #9   <Class TimeSignalCommand>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #22  <Method long Parcel.readLong()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #22  <Method long Parcel.readLong()>
	//    6   12:aconst_null     
	//    7   13:invokespecial   #25  <Method void TimeSignalCommand(long, long, TimeSignalCommand$1)>
	//    8   16:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #28  <Method TimeSignalCommand createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public TimeSignalCommand[] newArray(int i)
	{
		return new TimeSignalCommand[i];
	//    0    0:iload_1         
	//    1    1:anewarray       TimeSignalCommand[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #33  <Method TimeSignalCommand[] newArray(int)>
	//    3    5:areturn         
	}

	TimeSignalCommand$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
