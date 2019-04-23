// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor;

import com.google.android.exoplayer.util.Util;

// Referenced classes of package com.google.android.exoplayer.extractor:
//			SeekMap

public final class ChunkIndex
	implements SeekMap
{

	public ChunkIndex(int ai[], long al[], long al1[], long al2[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		length = ai.length;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:arraylength     
	//    5    7:putfield        #21  <Field int length>
		sizes = ai;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:putfield        #23  <Field int[] sizes>
		offsets = al;
	//    9   15:aload_0         
	//   10   16:aload_2         
	//   11   17:putfield        #25  <Field long[] offsets>
		durationsUs = al1;
	//   12   20:aload_0         
	//   13   21:aload_3         
	//   14   22:putfield        #27  <Field long[] durationsUs>
		timesUs = al2;
	//   15   25:aload_0         
	//   16   26:aload           4
	//   17   28:putfield        #29  <Field long[] timesUs>
	//   18   31:return          
	}

	public int getChunkIndex(long l)
	{
		return Util.binarySearchFloor(timesUs, l, true, true);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field long[] timesUs>
	//    2    4:lload_1         
	//    3    5:iconst_1        
	//    4    6:iconst_1        
	//    5    7:invokestatic    #38  <Method int Util.binarySearchFloor(long[], long, boolean, boolean)>
	//    6   10:ireturn         
	}

	public long getPosition(long l)
	{
		return offsets[getChunkIndex(l)];
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field long[] offsets>
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:invokevirtual   #42  <Method int getChunkIndex(long)>
	//    5    9:laload          
	//    6   10:lreturn         
	}

	public boolean isSeekable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public final long durationsUs[];
	public final int length;
	public final long offsets[];
	public final int sizes[];
	public final long timesUs[];
}
