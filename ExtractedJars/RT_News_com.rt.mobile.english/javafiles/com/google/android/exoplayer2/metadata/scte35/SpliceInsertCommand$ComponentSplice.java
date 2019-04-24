// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;

// Referenced classes of package com.google.android.exoplayer2.metadata.scte35:
//			SpliceInsertCommand

public static final class SpliceInsertCommand$ComponentSplice
{

	public static SpliceInsertCommand$ComponentSplice createFromParcel(Parcel parcel)
	{
		return new SpliceInsertCommand$ComponentSplice(parcel.readInt(), parcel.readLong(), parcel.readLong());
	//    0    0:new             #2   <Class SpliceInsertCommand$ComponentSplice>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #35  <Method int Parcel.readInt()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #39  <Method long Parcel.readLong()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #39  <Method long Parcel.readLong()>
	//    8   16:invokespecial   #27  <Method void SpliceInsertCommand$ComponentSplice(int, long, long)>
	//    9   19:areturn         
	}

	public void writeToParcel(Parcel parcel)
	{
		parcel.writeInt(componentTag);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #19  <Field int componentTag>
	//    3    5:invokevirtual   #45  <Method void Parcel.writeInt(int)>
		parcel.writeLong(componentSplicePts);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field long componentSplicePts>
	//    7   13:invokevirtual   #49  <Method void Parcel.writeLong(long)>
		parcel.writeLong(componentSplicePlaybackPositionUs);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #23  <Field long componentSplicePlaybackPositionUs>
	//   11   21:invokevirtual   #49  <Method void Parcel.writeLong(long)>
	//   12   24:return          
	}

	public final long componentSplicePlaybackPositionUs;
	public final long componentSplicePts;
	public final int componentTag;

	private SpliceInsertCommand$ComponentSplice(int i, long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		componentTag = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #19  <Field int componentTag>
		componentSplicePts = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #21  <Field long componentSplicePts>
		componentSplicePlaybackPositionUs = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #23  <Field long componentSplicePlaybackPositionUs>
	//   11   20:return          
	}

	SpliceInsertCommand$ComponentSplice(int i, long l, long l1, SpliceInsertCommand._cls1 _pcls1)
	{
		this(i, l, l1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:lload_2         
	//    3    3:lload           4
	//    4    5:invokespecial   #27  <Method void SpliceInsertCommand$ComponentSplice(int, long, long)>
	//    5    8:return          
	}
}
