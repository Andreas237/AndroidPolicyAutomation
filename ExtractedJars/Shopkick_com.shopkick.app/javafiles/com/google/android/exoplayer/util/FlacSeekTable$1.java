// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util;

import com.google.android.exoplayer.extractor.SeekMap;

// Referenced classes of package com.google.android.exoplayer.util:
//			FlacSeekTable, Util

class FlacSeekTable$1
	implements SeekMap
{

	public long getPosition(long l)
	{
		l = (l * val$sampleRate) / 0xf4240L;
	//    0    0:lload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field long val$sampleRate>
	//    3    5:lmul            
	//    4    6:ldc2w           #31  <Long 0xf4240L>
	//    5    9:ldiv            
	//    6   10:lstore_1        
		int i = Util.binarySearchFloor(FlacSeekTable.access$000(FlacSeekTable.this), l, true, true);
	//    7   11:aload_0         
	//    8   12:getfield        #20  <Field FlacSeekTable this$0>
	//    9   15:invokestatic    #36  <Method long[] FlacSeekTable.access$000(FlacSeekTable)>
	//   10   18:lload_1         
	//   11   19:iconst_1        
	//   12   20:iconst_1        
	//   13   21:invokestatic    #42  <Method int Util.binarySearchFloor(long[], long, boolean, boolean)>
	//   14   24:istore_3        
		return val$firstFrameOffset + FlacSeekTable.access$100(FlacSeekTable.this)[i];
	//   15   25:aload_0         
	//   16   26:getfield        #24  <Field long val$firstFrameOffset>
	//   17   29:aload_0         
	//   18   30:getfield        #20  <Field FlacSeekTable this$0>
	//   19   33:invokestatic    #45  <Method long[] FlacSeekTable.access$100(FlacSeekTable)>
	//   20   36:iload_3         
	//   21   37:laload          
	//   22   38:ladd            
	//   23   39:lreturn         
	}

	public boolean isSeekable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	final FlacSeekTable this$0;
	final long val$firstFrameOffset;
	final long val$sampleRate;

	FlacSeekTable$1()
	{
		this$0 = final_flacseektable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field FlacSeekTable this$0>
		val$sampleRate = l;
	//    3    5:aload_0         
	//    4    6:lload_2         
	//    5    7:putfield        #22  <Field long val$sampleRate>
		val$firstFrameOffset = J.this;
	//    6   10:aload_0         
	//    7   11:lload           4
	//    8   13:putfield        #24  <Field long val$firstFrameOffset>
		super();
	//    9   16:aload_0         
	//   10   17:invokespecial   #27  <Method void Object()>
	//   11   20:return          
	}
}
