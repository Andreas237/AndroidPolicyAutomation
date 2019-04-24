// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;

// Referenced classes of package com.google.android.exoplayer2.metadata.scte35:
//			SpliceScheduleCommand

public static final class SpliceScheduleCommand$ComponentSplice
{

	private static SpliceScheduleCommand$ComponentSplice createFromParcel(Parcel parcel)
	{
		return new SpliceScheduleCommand$ComponentSplice(parcel.readInt(), parcel.readLong());
	//    0    0:new             #2   <Class SpliceScheduleCommand$ComponentSplice>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #41  <Method int Parcel.readInt()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #45  <Method long Parcel.readLong()>
	//    6   12:invokespecial   #24  <Method void SpliceScheduleCommand$ComponentSplice(int, long)>
	//    7   15:areturn         
	}

	private void writeToParcel(Parcel parcel)
	{
		parcel.writeInt(componentTag);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #18  <Field int componentTag>
	//    3    5:invokevirtual   #49  <Method void Parcel.writeInt(int)>
		parcel.writeLong(utcSpliceTime);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field long utcSpliceTime>
	//    7   13:invokevirtual   #53  <Method void Parcel.writeLong(long)>
	//    8   16:return          
	}

	public final int componentTag;
	public final long utcSpliceTime;


/*
	static SpliceScheduleCommand$ComponentSplice access$000(Parcel parcel)
	{
		return createFromParcel(parcel);
	//    0    0:aload_0         
	//    1    1:invokestatic    #29  <Method SpliceScheduleCommand$ComponentSplice createFromParcel(Parcel)>
	//    2    4:areturn         
	}

*/


/*
	static void access$200(SpliceScheduleCommand$ComponentSplice spliceschedulecommand$componentsplice, Parcel parcel)
	{
		spliceschedulecommand$componentsplice.writeToParcel(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #35  <Method void writeToParcel(Parcel)>
		return;
	//    3    5:return          
	}

*/

	private SpliceScheduleCommand$ComponentSplice(int i, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		componentTag = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #18  <Field int componentTag>
		utcSpliceTime = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #20  <Field long utcSpliceTime>
	//    8   14:return          
	}

	SpliceScheduleCommand$ComponentSplice(int i, long l, SpliceScheduleCommand._cls1 _pcls1)
	{
		this(i, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:lload_2         
	//    3    3:invokespecial   #24  <Method void SpliceScheduleCommand$ComponentSplice(int, long)>
	//    4    6:return          
	}
}
