// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

// Referenced classes of package com.google.android.exoplayer2.extractor.mp4:
//			Track

final class TrackSampleTable
{

	public TrackSampleTable(Track track1, long al[], int ai[], int i, long al1[], int ai1[], long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		boolean flag1 = false;
	//    2    4:iconst_0        
	//    3    5:istore          10
		boolean flag;
		if(ai.length == al1.length)
	//*   4    7:aload_3         
	//*   5    8:arraylength     
	//*   6    9:aload           5
	//*   7   11:arraylength     
	//*   8   12:icmpne          21
			flag = true;
	//    9   15:iconst_1        
	//   10   16:istore          9
		else
	//*  11   18:goto            24
			flag = false;
	//   12   21:iconst_0        
	//   13   22:istore          9
		Assertions.checkArgument(flag);
	//   14   24:iload           9
	//   15   26:invokestatic    #28  <Method void Assertions.checkArgument(boolean)>
		if(al.length == al1.length)
	//*  16   29:aload_2         
	//*  17   30:arraylength     
	//*  18   31:aload           5
	//*  19   33:arraylength     
	//*  20   34:icmpne          43
			flag = true;
	//   21   37:iconst_1        
	//   22   38:istore          9
		else
	//*  23   40:goto            46
			flag = false;
	//   24   43:iconst_0        
	//   25   44:istore          9
		Assertions.checkArgument(flag);
	//   26   46:iload           9
	//   27   48:invokestatic    #28  <Method void Assertions.checkArgument(boolean)>
		flag = flag1;
	//   28   51:iload           10
	//   29   53:istore          9
		if(ai1.length == al1.length)
	//*  30   55:aload           6
	//*  31   57:arraylength     
	//*  32   58:aload           5
	//*  33   60:arraylength     
	//*  34   61:icmpne          67
			flag = true;
	//   35   64:iconst_1        
	//   36   65:istore          9
		Assertions.checkArgument(flag);
	//   37   67:iload           9
	//   38   69:invokestatic    #28  <Method void Assertions.checkArgument(boolean)>
		track = track1;
	//   39   72:aload_0         
	//   40   73:aload_1         
	//   41   74:putfield        #30  <Field Track track>
		offsets = al;
	//   42   77:aload_0         
	//   43   78:aload_2         
	//   44   79:putfield        #32  <Field long[] offsets>
		sizes = ai;
	//   45   82:aload_0         
	//   46   83:aload_3         
	//   47   84:putfield        #34  <Field int[] sizes>
		maximumSize = i;
	//   48   87:aload_0         
	//   49   88:iload           4
	//   50   90:putfield        #36  <Field int maximumSize>
		timestampsUs = al1;
	//   51   93:aload_0         
	//   52   94:aload           5
	//   53   96:putfield        #38  <Field long[] timestampsUs>
		flags = ai1;
	//   54   99:aload_0         
	//   55  100:aload           6
	//   56  102:putfield        #40  <Field int[] flags>
		durationUs = l;
	//   57  105:aload_0         
	//   58  106:lload           7
	//   59  108:putfield        #42  <Field long durationUs>
		sampleCount = al.length;
	//   60  111:aload_0         
	//   61  112:aload_2         
	//   62  113:arraylength     
	//   63  114:putfield        #44  <Field int sampleCount>
	//   64  117:return          
	}

	public int getIndexOfEarlierOrEqualSynchronizationSample(long l)
	{
		for(int i = Util.binarySearchFloor(timestampsUs, l, true, false); i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field long[] timestampsUs>
	//*   2    4:lload_1         
	//*   3    5:iconst_1        
	//*   4    6:iconst_0        
	//*   5    7:invokestatic    #53  <Method int Util.binarySearchFloor(long[], long, boolean, boolean)>
	//*   6   10:istore_3        
	//*   7   11:iload_3         
	//*   8   12:iflt            35
			if((flags[i] & 1) != 0)
	//*   9   15:aload_0         
	//*  10   16:getfield        #40  <Field int[] flags>
	//*  11   19:iload_3         
	//*  12   20:iaload          
	//*  13   21:iconst_1        
	//*  14   22:iand            
	//*  15   23:ifeq            28
				return i;
	//   16   26:iload_3         
	//   17   27:ireturn         

	//   18   28:iload_3         
	//   19   29:iconst_1        
	//   20   30:isub            
	//   21   31:istore_3        
	//*  22   32:goto            11
		return -1;
	//   23   35:iconst_m1       
	//   24   36:ireturn         
	}

	public int getIndexOfLaterOrEqualSynchronizationSample(long l)
	{
		for(int i = Util.binarySearchCeil(timestampsUs, l, true, false); i < timestampsUs.length; i++)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field long[] timestampsUs>
	//*   2    4:lload_1         
	//*   3    5:iconst_1        
	//*   4    6:iconst_0        
	//*   5    7:invokestatic    #57  <Method int Util.binarySearchCeil(long[], long, boolean, boolean)>
	//*   6   10:istore_3        
	//*   7   11:iload_3         
	//*   8   12:aload_0         
	//*   9   13:getfield        #38  <Field long[] timestampsUs>
	//*  10   16:arraylength     
	//*  11   17:icmpge          40
			if((flags[i] & 1) != 0)
	//*  12   20:aload_0         
	//*  13   21:getfield        #40  <Field int[] flags>
	//*  14   24:iload_3         
	//*  15   25:iaload          
	//*  16   26:iconst_1        
	//*  17   27:iand            
	//*  18   28:ifeq            33
				return i;
	//   19   31:iload_3         
	//   20   32:ireturn         

	//   21   33:iload_3         
	//   22   34:iconst_1        
	//   23   35:iadd            
	//   24   36:istore_3        
	//*  25   37:goto            11
		return -1;
	//   26   40:iconst_m1       
	//   27   41:ireturn         
	}

	public final long durationUs;
	public final int flags[];
	public final int maximumSize;
	public final long offsets[];
	public final int sampleCount;
	public final int sizes[];
	public final long timestampsUs[];
	public final Track track;
}
