// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls;

import android.util.SparseArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;

public final class TimestampAdjusterProvider
{

	public TimestampAdjusterProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #13  <Class SparseArray>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void SparseArray()>
	//    6   12:putfield        #16  <Field SparseArray timestampAdjusters>
	//    7   15:return          
	}

	public TimestampAdjuster getAdjuster(int i)
	{
		TimestampAdjuster timestampadjuster1 = (TimestampAdjuster)timestampAdjusters.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SparseArray timestampAdjusters>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #23  <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #25  <Class TimestampAdjuster>
	//    5   11:astore_3        
		TimestampAdjuster timestampadjuster = timestampadjuster1;
	//    6   12:aload_3         
	//    7   13:astore_2        
		if(timestampadjuster1 == null)
	//*   8   14:aload_3         
	//*   9   15:ifnonnull       38
		{
			timestampadjuster = new TimestampAdjuster(0xffffffffL);
	//   10   18:new             #25  <Class TimestampAdjuster>
	//   11   21:dup             
	//   12   22:ldc2w           #26  <Long 0xffffffffL>
	//   13   25:invokespecial   #30  <Method void TimestampAdjuster(long)>
	//   14   28:astore_2        
			timestampAdjusters.put(i, ((Object) (timestampadjuster)));
	//   15   29:aload_0         
	//   16   30:getfield        #16  <Field SparseArray timestampAdjusters>
	//   17   33:iload_1         
	//   18   34:aload_2         
	//   19   35:invokevirtual   #34  <Method void SparseArray.put(int, Object)>
		}
		return timestampadjuster;
	//   20   38:aload_2         
	//   21   39:areturn         
	}

	public void reset()
	{
		timestampAdjusters.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SparseArray timestampAdjusters>
	//    2    4:invokevirtual   #38  <Method void SparseArray.clear()>
	//    3    7:return          
	}

	private final SparseArray timestampAdjusters = new SparseArray();
}
