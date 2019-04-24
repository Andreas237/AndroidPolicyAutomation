// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

final class SampleMetadataQueue
{
	public static final class SampleExtrasHolder
	{

		public com.google.android.exoplayer2.extractor.TrackOutput.CryptoData cryptoData;
		public long offset;
		public int size;

		public SampleExtrasHolder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:return          
		}
	}


	public SampleMetadataQueue()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		capacity = 1000;
	//    2    4:aload_0         
	//    3    5:sipush          1000
	//    4    8:putfield        #41  <Field int capacity>
		sourceIds = new int[capacity];
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #41  <Field int capacity>
	//    8   16:newarray        int[]
	//    9   18:putfield        #43  <Field int[] sourceIds>
		offsets = new long[capacity];
	//   10   21:aload_0         
	//   11   22:aload_0         
	//   12   23:getfield        #41  <Field int capacity>
	//   13   26:newarray        long[]
	//   14   28:putfield        #45  <Field long[] offsets>
		timesUs = new long[capacity];
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #41  <Field int capacity>
	//   18   36:newarray        long[]
	//   19   38:putfield        #47  <Field long[] timesUs>
		flags = new int[capacity];
	//   20   41:aload_0         
	//   21   42:aload_0         
	//   22   43:getfield        #41  <Field int capacity>
	//   23   46:newarray        int[]
	//   24   48:putfield        #49  <Field int[] flags>
		sizes = new int[capacity];
	//   25   51:aload_0         
	//   26   52:aload_0         
	//   27   53:getfield        #41  <Field int capacity>
	//   28   56:newarray        int[]
	//   29   58:putfield        #51  <Field int[] sizes>
		cryptoDatas = new com.google.android.exoplayer2.extractor.TrackOutput.CryptoData[capacity];
	//   30   61:aload_0         
	//   31   62:aload_0         
	//   32   63:getfield        #41  <Field int capacity>
	//   33   66:anewarray       com.google.android.exoplayer2.extractor.TrackOutput.CryptoData[]
	//   34   69:putfield        #55  <Field com.google.android.exoplayer2.extractor.TrackOutput$CryptoData[] cryptoDatas>
		formats = new Format[capacity];
	//   35   72:aload_0         
	//   36   73:aload_0         
	//   37   74:getfield        #41  <Field int capacity>
	//   38   77:anewarray       Format[]
	//   39   80:putfield        #59  <Field Format[] formats>
		largestDiscardedTimestampUs = 0x0L;
	//   40   83:aload_0         
	//   41   84:ldc2w           #60  <Long 0x0L>
	//   42   87:putfield        #63  <Field long largestDiscardedTimestampUs>
		largestQueuedTimestampUs = 0x0L;
	//   43   90:aload_0         
	//   44   91:ldc2w           #60  <Long 0x0L>
	//   45   94:putfield        #65  <Field long largestQueuedTimestampUs>
		upstreamFormatRequired = true;
	//   46   97:aload_0         
	//   47   98:iconst_1        
	//   48   99:putfield        #67  <Field boolean upstreamFormatRequired>
		upstreamKeyframeRequired = true;
	//   49  102:aload_0         
	//   50  103:iconst_1        
	//   51  104:putfield        #69  <Field boolean upstreamKeyframeRequired>
	//   52  107:return          
	}

	private long discardSamples(int i)
	{
		largestDiscardedTimestampUs = Math.max(largestDiscardedTimestampUs, getLargestTimestamp(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #63  <Field long largestDiscardedTimestampUs>
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #75  <Method long getLargestTimestamp(int)>
	//    6   10:invokestatic    #81  <Method long Math.max(long, long)>
	//    7   13:putfield        #63  <Field long largestDiscardedTimestampUs>
		length = length - i;
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #83  <Field int length>
	//   11   21:iload_1         
	//   12   22:isub            
	//   13   23:putfield        #83  <Field int length>
		absoluteFirstIndex = absoluteFirstIndex + i;
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #85  <Field int absoluteFirstIndex>
	//   17   31:iload_1         
	//   18   32:iadd            
	//   19   33:putfield        #85  <Field int absoluteFirstIndex>
		relativeFirstIndex = relativeFirstIndex + i;
	//   20   36:aload_0         
	//   21   37:aload_0         
	//   22   38:getfield        #87  <Field int relativeFirstIndex>
	//   23   41:iload_1         
	//   24   42:iadd            
	//   25   43:putfield        #87  <Field int relativeFirstIndex>
		if(relativeFirstIndex >= capacity)
	//*  26   46:aload_0         
	//*  27   47:getfield        #87  <Field int relativeFirstIndex>
	//*  28   50:aload_0         
	//*  29   51:getfield        #41  <Field int capacity>
	//*  30   54:icmplt          70
			relativeFirstIndex = relativeFirstIndex - capacity;
	//   31   57:aload_0         
	//   32   58:aload_0         
	//   33   59:getfield        #87  <Field int relativeFirstIndex>
	//   34   62:aload_0         
	//   35   63:getfield        #41  <Field int capacity>
	//   36   66:isub            
	//   37   67:putfield        #87  <Field int relativeFirstIndex>
		readPosition = readPosition - i;
	//   38   70:aload_0         
	//   39   71:aload_0         
	//   40   72:getfield        #89  <Field int readPosition>
	//   41   75:iload_1         
	//   42   76:isub            
	//   43   77:putfield        #89  <Field int readPosition>
		if(readPosition < 0)
	//*  44   80:aload_0         
	//*  45   81:getfield        #89  <Field int readPosition>
	//*  46   84:ifge            92
			readPosition = 0;
	//   47   87:aload_0         
	//   48   88:iconst_0        
	//   49   89:putfield        #89  <Field int readPosition>
		if(length == 0)
	//*  50   92:aload_0         
	//*  51   93:getfield        #83  <Field int length>
	//*  52   96:ifne            138
		{
			if(relativeFirstIndex == 0)
	//*  53   99:aload_0         
	//*  54  100:getfield        #87  <Field int relativeFirstIndex>
	//*  55  103:ifne            114
				i = capacity;
	//   56  106:aload_0         
	//   57  107:getfield        #41  <Field int capacity>
	//   58  110:istore_1        
			else
	//*  59  111:goto            119
				i = relativeFirstIndex;
	//   60  114:aload_0         
	//   61  115:getfield        #87  <Field int relativeFirstIndex>
	//   62  118:istore_1        
			i--;
	//   63  119:iload_1         
	//   64  120:iconst_1        
	//   65  121:isub            
	//   66  122:istore_1        
			return offsets[i] + (long)sizes[i];
	//   67  123:aload_0         
	//   68  124:getfield        #45  <Field long[] offsets>
	//   69  127:iload_1         
	//   70  128:laload          
	//   71  129:aload_0         
	//   72  130:getfield        #51  <Field int[] sizes>
	//   73  133:iload_1         
	//   74  134:iaload          
	//   75  135:i2l             
	//   76  136:ladd            
	//   77  137:lreturn         
		} else
		{
			return offsets[relativeFirstIndex];
	//   78  138:aload_0         
	//   79  139:getfield        #45  <Field long[] offsets>
	//   80  142:aload_0         
	//   81  143:getfield        #87  <Field int relativeFirstIndex>
	//   82  146:laload          
	//   83  147:lreturn         
		}
	}

	private int findSampleBefore(int i, int j, long l, boolean flag)
	{
		int i1 = -1;
	//    0    0:iconst_m1       
	//    1    1:istore          7
		int k = i;
	//    2    3:iload_1         
	//    3    4:istore          6
		for(i = 0; i < j && timesUs[k] <= l; i++)
	//*   4    6:iconst_0        
	//*   5    7:istore_1        
	//*   6    8:iload_1         
	//*   7    9:iload_2         
	//*   8   10:icmpge          74
	//*   9   13:aload_0         
	//*  10   14:getfield        #47  <Field long[] timesUs>
	//*  11   17:iload           6
	//*  12   19:laload          
	//*  13   20:lload_3         
	//*  14   21:lcmp            
	//*  15   22:ifgt            74
		{
			if(!flag || (flags[k] & 1) != 0)
	//*  16   25:iload           5
	//*  17   27:ifeq            42
	//*  18   30:aload_0         
	//*  19   31:getfield        #49  <Field int[] flags>
	//*  20   34:iload           6
	//*  21   36:iaload          
	//*  22   37:iconst_1        
	//*  23   38:iand            
	//*  24   39:ifeq            45
				i1 = i;
	//   25   42:iload_1         
	//   26   43:istore          7
			int j1 = k + 1;
	//   27   45:iload           6
	//   28   47:iconst_1        
	//   29   48:iadd            
	//   30   49:istore          8
			k = j1;
	//   31   51:iload           8
	//   32   53:istore          6
			if(j1 == capacity)
	//*  33   55:iload           8
	//*  34   57:aload_0         
	//*  35   58:getfield        #41  <Field int capacity>
	//*  36   61:icmpne          67
				k = 0;
	//   37   64:iconst_0        
	//   38   65:istore          6
		}

	//   39   67:iload_1         
	//   40   68:iconst_1        
	//   41   69:iadd            
	//   42   70:istore_1        
	//*  43   71:goto            8
		return i1;
	//   44   74:iload           7
	//   45   76:ireturn         
	}

	private long getLargestTimestamp(int i)
	{
		long l1 = 0x0L;
	//    0    0:ldc2w           #60  <Long 0x0L>
	//    1    3:lstore          5
		if(i == 0)
	//*   2    5:iload_1         
	//*   3    6:ifne            13
			return 0x0L;
	//    4    9:ldc2w           #60  <Long 0x0L>
	//    5   12:lreturn         
		int j = getRelativeIndex(i - 1);
	//    6   13:aload_0         
	//    7   14:iload_1         
	//    8   15:iconst_1        
	//    9   16:isub            
	//   10   17:invokespecial   #95  <Method int getRelativeIndex(int)>
	//   11   20:istore_2        
		for(int k = 0; k < i; k++)
	//*  12   21:iconst_0        
	//*  13   22:istore_3        
	//*  14   23:iload_3         
	//*  15   24:iload_1         
	//*  16   25:icmpge          83
		{
			l1 = Math.max(l1, timesUs[j]);
	//   17   28:lload           5
	//   18   30:aload_0         
	//   19   31:getfield        #47  <Field long[] timesUs>
	//   20   34:iload_2         
	//   21   35:laload          
	//   22   36:invokestatic    #81  <Method long Math.max(long, long)>
	//   23   39:lstore          5
			if((flags[j] & 1) != 0)
	//*  24   41:aload_0         
	//*  25   42:getfield        #49  <Field int[] flags>
	//*  26   45:iload_2         
	//*  27   46:iaload          
	//*  28   47:iconst_1        
	//*  29   48:iand            
	//*  30   49:ifeq            55
				return l1;
	//   31   52:lload           5
	//   32   54:lreturn         
			int l = j - 1;
	//   33   55:iload_2         
	//   34   56:iconst_1        
	//   35   57:isub            
	//   36   58:istore          4
			j = l;
	//   37   60:iload           4
	//   38   62:istore_2        
			if(l == -1)
	//*  39   63:iload           4
	//*  40   65:iconst_m1       
	//*  41   66:icmpne          76
				j = capacity - 1;
	//   42   69:aload_0         
	//   43   70:getfield        #41  <Field int capacity>
	//   44   73:iconst_1        
	//   45   74:isub            
	//   46   75:istore_2        
		}

	//   47   76:iload_3         
	//   48   77:iconst_1        
	//   49   78:iadd            
	//   50   79:istore_3        
	//*  51   80:goto            23
		return l1;
	//   52   83:lload           5
	//   53   85:lreturn         
	}

	private int getRelativeIndex(int i)
	{
		i = relativeFirstIndex + i;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int relativeFirstIndex>
	//    2    4:iload_1         
	//    3    5:iadd            
	//    4    6:istore_1        
		if(i < capacity)
	//*   5    7:iload_1         
	//*   6    8:aload_0         
	//*   7    9:getfield        #41  <Field int capacity>
	//*   8   12:icmpge          17
			return i;
	//    9   15:iload_1         
	//   10   16:ireturn         
		else
			return i - capacity;
	//   11   17:iload_1         
	//   12   18:aload_0         
	//   13   19:getfield        #41  <Field int capacity>
	//   14   22:isub            
	//   15   23:ireturn         
	}

	public int advanceTo(long l, boolean flag, boolean flag1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = getRelativeIndex(readPosition);
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:getfield        #89  <Field int readPosition>
	//    5    7:invokespecial   #95  <Method int getRelativeIndex(int)>
	//    6   10:istore          5
		if(!hasNextSample() || l < timesUs[i] || l > largestQueuedTimestampUs && !flag1)
	//*   7   12:aload_0         
	//*   8   13:invokevirtual   #101 <Method boolean hasNextSample()>
	//*   9   16:ifeq            93
	//*  10   19:lload_1         
	//*  11   20:aload_0         
	//*  12   21:getfield        #47  <Field long[] timesUs>
	//*  13   24:iload           5
	//*  14   26:laload          
	//*  15   27:lcmp            
	//*  16   28:iflt            93
	//*  17   31:lload_1         
	//*  18   32:aload_0         
	//*  19   33:getfield        #65  <Field long largestQueuedTimestampUs>
	//*  20   36:lcmp            
	//*  21   37:ifle            48
	//*  22   40:iload           4
	//*  23   42:ifne            48
			break MISSING_BLOCK_LABEL_93;
	//   24   45:goto            93
		i = findSampleBefore(i, length - readPosition, l, flag);
	//   25   48:aload_0         
	//   26   49:iload           5
	//   27   51:aload_0         
	//   28   52:getfield        #83  <Field int length>
	//   29   55:aload_0         
	//   30   56:getfield        #89  <Field int readPosition>
	//   31   59:isub            
	//   32   60:lload_1         
	//   33   61:iload_3         
	//   34   62:invokespecial   #103 <Method int findSampleBefore(int, int, long, boolean)>
	//   35   65:istore          5
		if(i != -1)
			break MISSING_BLOCK_LABEL_77;
	//   36   67:iload           5
	//   37   69:iconst_m1       
	//   38   70:icmpne          77
		this;
	//   39   73:aload_0         
		JVM INSTR monitorexit ;
	//   40   74:monitorexit     
		return -1;
	//   41   75:iconst_m1       
	//   42   76:ireturn         
		readPosition = readPosition + i;
	//   43   77:aload_0         
	//   44   78:aload_0         
	//   45   79:getfield        #89  <Field int readPosition>
	//   46   82:iload           5
	//   47   84:iadd            
	//   48   85:putfield        #89  <Field int readPosition>
		this;
	//   49   88:aload_0         
		JVM INSTR monitorexit ;
	//   50   89:monitorexit     
		return i;
	//   51   90:iload           5
	//   52   92:ireturn         
		this;
	//   53   93:aload_0         
		JVM INSTR monitorexit ;
	//   54   94:monitorexit     
		return -1;
	//   55   95:iconst_m1       
	//   56   96:ireturn         
		Exception exception;
		exception;
	//   57   97:astore          6
	//*  58   99:aload_0         
		throw exception;
	//   59  100:monitorexit     
	//   60  101:aload           6
	//   61  103:athrow          
	}

	public int advanceToEnd()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i;
		int j;
		i = length;
	//    2    2:aload_0         
	//    3    3:getfield        #83  <Field int length>
	//    4    6:istore_1        
		j = readPosition;
	//    5    7:aload_0         
	//    6    8:getfield        #89  <Field int readPosition>
	//    7   11:istore_2        
		readPosition = length;
	//    8   12:aload_0         
	//    9   13:aload_0         
	//   10   14:getfield        #83  <Field int length>
	//   11   17:putfield        #89  <Field int readPosition>
		this;
	//   12   20:aload_0         
		JVM INSTR monitorexit ;
	//   13   21:monitorexit     
		return i - j;
	//   14   22:iload_1         
	//   15   23:iload_2         
	//   16   24:isub            
	//   17   25:ireturn         
		Exception exception;
		exception;
	//   18   26:astore_3        
	//*  19   27:aload_0         
		throw exception;
	//   20   28:monitorexit     
	//   21   29:aload_3         
	//   22   30:athrow          
	}

	public boolean attemptSplice(long l)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = length;
	//    2    2:aload_0         
	//    3    3:getfield        #83  <Field int length>
	//    4    6:istore_3        
		boolean flag;
		flag = false;
	//    5    7:iconst_0        
	//    6    8:istore          9
		if(i != 0)
			break MISSING_BLOCK_LABEL_35;
	//    7   10:iload_3         
	//    8   11:ifne            35
		long l1 = largestDiscardedTimestampUs;
	//    9   14:aload_0         
	//   10   15:getfield        #63  <Field long largestDiscardedTimestampUs>
	//   11   18:lstore          7
		if(l > l1)
	//*  12   20:lload_1         
	//*  13   21:lload           7
	//*  14   23:lcmp            
	//*  15   24:ifle            30
			flag = true;
	//   16   27:iconst_1        
	//   17   28:istore          9
		this;
	//   18   30:aload_0         
		JVM INSTR monitorexit ;
	//   19   31:monitorexit     
		return flag;
	//   20   32:iload           9
	//   21   34:ireturn         
		l1 = Math.max(largestDiscardedTimestampUs, getLargestTimestamp(readPosition));
	//   22   35:aload_0         
	//   23   36:getfield        #63  <Field long largestDiscardedTimestampUs>
	//   24   39:aload_0         
	//   25   40:aload_0         
	//   26   41:getfield        #89  <Field int readPosition>
	//   27   44:invokespecial   #75  <Method long getLargestTimestamp(int)>
	//   28   47:invokestatic    #81  <Method long Math.max(long, long)>
	//   29   50:lstore          7
		if(l1 < l)
			break MISSING_BLOCK_LABEL_63;
	//   30   52:lload           7
	//   31   54:lload_1         
	//   32   55:lcmp            
	//   33   56:iflt            63
		this;
	//   34   59:aload_0         
		JVM INSTR monitorexit ;
	//   35   60:monitorexit     
		return false;
	//   36   61:iconst_0        
	//   37   62:ireturn         
		int j;
		j = length;
	//   38   63:aload_0         
	//   39   64:getfield        #83  <Field int length>
	//   40   67:istore          4
		i = getRelativeIndex(length - 1);
	//   41   69:aload_0         
	//   42   70:aload_0         
	//   43   71:getfield        #83  <Field int length>
	//   44   74:iconst_1        
	//   45   75:isub            
	//   46   76:invokespecial   #95  <Method int getRelativeIndex(int)>
	//   47   79:istore_3        
_L2:
		if(j <= readPosition || timesUs[i] < l)
			break MISSING_BLOCK_LABEL_138;
	//   48   80:iload           4
	//   49   82:aload_0         
	//   50   83:getfield        #89  <Field int readPosition>
	//   51   86:icmple          138
	//   52   89:aload_0         
	//   53   90:getfield        #47  <Field long[] timesUs>
	//   54   93:iload_3         
	//   55   94:laload          
	//   56   95:lload_1         
	//   57   96:lcmp            
	//   58   97:iflt            138
		int k;
		int i1;
		k = j - 1;
	//   59  100:iload           4
	//   60  102:iconst_1        
	//   61  103:isub            
	//   62  104:istore          5
		i1 = i - 1;
	//   63  106:iload_3         
	//   64  107:iconst_1        
	//   65  108:isub            
	//   66  109:istore          6
		j = k;
	//   67  111:iload           5
	//   68  113:istore          4
		i = i1;
	//   69  115:iload           6
	//   70  117:istore_3        
		if(i1 != -1) goto _L2; else goto _L1
	//   71  118:iload           6
	//   72  120:iconst_m1       
	//   73  121:icmpne          80
_L1:
		i = capacity - 1;
	//   74  124:aload_0         
	//   75  125:getfield        #41  <Field int capacity>
	//   76  128:iconst_1        
	//   77  129:isub            
	//   78  130:istore_3        
		j = k;
	//   79  131:iload           5
	//   80  133:istore          4
		  goto _L2
	//*  81  135:goto            80
		discardUpstreamSamples(absoluteFirstIndex + j);
	//   82  138:aload_0         
	//   83  139:aload_0         
	//   84  140:getfield        #85  <Field int absoluteFirstIndex>
	//   85  143:iload           4
	//   86  145:iadd            
	//   87  146:invokevirtual   #110 <Method long discardUpstreamSamples(int)>
	//   88  149:pop2            
		this;
	//   89  150:aload_0         
		JVM INSTR monitorexit ;
	//   90  151:monitorexit     
		return true;
	//   91  152:iconst_1        
	//   92  153:ireturn         
		Exception exception;
		exception;
	//   93  154:astore          10
	//*  94  156:aload_0         
		throw exception;
	//   95  157:monitorexit     
	//   96  158:aload           10
	//   97  160:athrow          
	}

	public void commitSample(long l, int i, long l1, int j, com.google.android.exoplayer2.extractor.TrackOutput.CryptoData cryptodata)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = upstreamKeyframeRequired;
	//    2    2:aload_0         
	//    3    3:getfield        #69  <Field boolean upstreamKeyframeRequired>
	//    4    6:istore          9
		if(!flag)
			break MISSING_BLOCK_LABEL_27;
	//    5    8:iload           9
	//    6   10:ifeq            27
		if((i & 1) == 0)
	//*   7   13:iload_3         
	//*   8   14:iconst_1        
	//*   9   15:iand            
	//*  10   16:ifne            22
	//*  11   19:aload_0         
			return;
	//   12   20:monitorexit     
	//   13   21:return          
		upstreamKeyframeRequired = false;
	//   14   22:aload_0         
	//   15   23:iconst_0        
	//   16   24:putfield        #69  <Field boolean upstreamKeyframeRequired>
		Assertions.checkState(upstreamFormatRequired ^ true);
	//   17   27:aload_0         
	//   18   28:getfield        #67  <Field boolean upstreamFormatRequired>
	//   19   31:iconst_1        
	//   20   32:ixor            
	//   21   33:invokestatic    #118 <Method void Assertions.checkState(boolean)>
		commitSampleTimestamp(l);
	//   22   36:aload_0         
	//   23   37:lload_1         
	//   24   38:invokevirtual   #122 <Method void commitSampleTimestamp(long)>
		int k = getRelativeIndex(length);
	//   25   41:aload_0         
	//   26   42:aload_0         
	//   27   43:getfield        #83  <Field int length>
	//   28   46:invokespecial   #95  <Method int getRelativeIndex(int)>
	//   29   49:istore          8
		timesUs[k] = l;
	//   30   51:aload_0         
	//   31   52:getfield        #47  <Field long[] timesUs>
	//   32   55:iload           8
	//   33   57:lload_1         
	//   34   58:lastore         
		offsets[k] = l1;
	//   35   59:aload_0         
	//   36   60:getfield        #45  <Field long[] offsets>
	//   37   63:iload           8
	//   38   65:lload           4
	//   39   67:lastore         
		sizes[k] = j;
	//   40   68:aload_0         
	//   41   69:getfield        #51  <Field int[] sizes>
	//   42   72:iload           8
	//   43   74:iload           6
	//   44   76:iastore         
		flags[k] = i;
	//   45   77:aload_0         
	//   46   78:getfield        #49  <Field int[] flags>
	//   47   81:iload           8
	//   48   83:iload_3         
	//   49   84:iastore         
		cryptoDatas[k] = cryptodata;
	//   50   85:aload_0         
	//   51   86:getfield        #55  <Field com.google.android.exoplayer2.extractor.TrackOutput$CryptoData[] cryptoDatas>
	//   52   89:iload           8
	//   53   91:aload           7
	//   54   93:aastore         
		formats[k] = upstreamFormat;
	//   55   94:aload_0         
	//   56   95:getfield        #59  <Field Format[] formats>
	//   57   98:iload           8
	//   58  100:aload_0         
	//   59  101:getfield        #124 <Field Format upstreamFormat>
	//   60  104:aastore         
		sourceIds[k] = upstreamSourceId;
	//   61  105:aload_0         
	//   62  106:getfield        #43  <Field int[] sourceIds>
	//   63  109:iload           8
	//   64  111:aload_0         
	//   65  112:getfield        #126 <Field int upstreamSourceId>
	//   66  115:iastore         
		length = length + 1;
	//   67  116:aload_0         
	//   68  117:aload_0         
	//   69  118:getfield        #83  <Field int length>
	//   70  121:iconst_1        
	//   71  122:iadd            
	//   72  123:putfield        #83  <Field int length>
		if(length == capacity)
	//*  73  126:aload_0         
	//*  74  127:getfield        #83  <Field int length>
	//*  75  130:aload_0         
	//*  76  131:getfield        #41  <Field int capacity>
	//*  77  134:icmpne          470
		{
			i = capacity + 1000;
	//   78  137:aload_0         
	//   79  138:getfield        #41  <Field int capacity>
	//   80  141:sipush          1000
	//   81  144:iadd            
	//   82  145:istore_3        
			cryptodata = ((com.google.android.exoplayer2.extractor.TrackOutput.CryptoData) (new int[i]));
	//   83  146:iload_3         
	//   84  147:newarray        int[]
	//   85  149:astore          7
			long al[] = new long[i];
	//   86  151:iload_3         
	//   87  152:newarray        long[]
	//   88  154:astore          10
			long al1[] = new long[i];
	//   89  156:iload_3         
	//   90  157:newarray        long[]
	//   91  159:astore          11
			int ai[] = new int[i];
	//   92  161:iload_3         
	//   93  162:newarray        int[]
	//   94  164:astore          12
			int ai1[] = new int[i];
	//   95  166:iload_3         
	//   96  167:newarray        int[]
	//   97  169:astore          13
			com.google.android.exoplayer2.extractor.TrackOutput.CryptoData acryptodata[] = new com.google.android.exoplayer2.extractor.TrackOutput.CryptoData[i];
	//   98  171:iload_3         
	//   99  172:anewarray       com.google.android.exoplayer2.extractor.TrackOutput.CryptoData[]
	//  100  175:astore          14
			Format aformat[] = new Format[i];
	//  101  177:iload_3         
	//  102  178:anewarray       Format[]
	//  103  181:astore          15
			j = capacity - relativeFirstIndex;
	//  104  183:aload_0         
	//  105  184:getfield        #41  <Field int capacity>
	//  106  187:aload_0         
	//  107  188:getfield        #87  <Field int relativeFirstIndex>
	//  108  191:isub            
	//  109  192:istore          6
			System.arraycopy(((Object) (offsets)), relativeFirstIndex, ((Object) (al)), 0, j);
	//  110  194:aload_0         
	//  111  195:getfield        #45  <Field long[] offsets>
	//  112  198:aload_0         
	//  113  199:getfield        #87  <Field int relativeFirstIndex>
	//  114  202:aload           10
	//  115  204:iconst_0        
	//  116  205:iload           6
	//  117  207:invokestatic    #132 <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (timesUs)), relativeFirstIndex, ((Object) (al1)), 0, j);
	//  118  210:aload_0         
	//  119  211:getfield        #47  <Field long[] timesUs>
	//  120  214:aload_0         
	//  121  215:getfield        #87  <Field int relativeFirstIndex>
	//  122  218:aload           11
	//  123  220:iconst_0        
	//  124  221:iload           6
	//  125  223:invokestatic    #132 <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (flags)), relativeFirstIndex, ((Object) (ai)), 0, j);
	//  126  226:aload_0         
	//  127  227:getfield        #49  <Field int[] flags>
	//  128  230:aload_0         
	//  129  231:getfield        #87  <Field int relativeFirstIndex>
	//  130  234:aload           12
	//  131  236:iconst_0        
	//  132  237:iload           6
	//  133  239:invokestatic    #132 <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (sizes)), relativeFirstIndex, ((Object) (ai1)), 0, j);
	//  134  242:aload_0         
	//  135  243:getfield        #51  <Field int[] sizes>
	//  136  246:aload_0         
	//  137  247:getfield        #87  <Field int relativeFirstIndex>
	//  138  250:aload           13
	//  139  252:iconst_0        
	//  140  253:iload           6
	//  141  255:invokestatic    #132 <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (cryptoDatas)), relativeFirstIndex, ((Object) (acryptodata)), 0, j);
	//  142  258:aload_0         
	//  143  259:getfield        #55  <Field com.google.android.exoplayer2.extractor.TrackOutput$CryptoData[] cryptoDatas>
	//  144  262:aload_0         
	//  145  263:getfield        #87  <Field int relativeFirstIndex>
	//  146  266:aload           14
	//  147  268:iconst_0        
	//  148  269:iload           6
	//  149  271:invokestatic    #132 <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (formats)), relativeFirstIndex, ((Object) (aformat)), 0, j);
	//  150  274:aload_0         
	//  151  275:getfield        #59  <Field Format[] formats>
	//  152  278:aload_0         
	//  153  279:getfield        #87  <Field int relativeFirstIndex>
	//  154  282:aload           15
	//  155  284:iconst_0        
	//  156  285:iload           6
	//  157  287:invokestatic    #132 <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (sourceIds)), relativeFirstIndex, ((Object) (cryptodata)), 0, j);
	//  158  290:aload_0         
	//  159  291:getfield        #43  <Field int[] sourceIds>
	//  160  294:aload_0         
	//  161  295:getfield        #87  <Field int relativeFirstIndex>
	//  162  298:aload           7
	//  163  300:iconst_0        
	//  164  301:iload           6
	//  165  303:invokestatic    #132 <Method void System.arraycopy(Object, int, Object, int, int)>
			int i1 = relativeFirstIndex;
	//  166  306:aload_0         
	//  167  307:getfield        #87  <Field int relativeFirstIndex>
	//  168  310:istore          8
			System.arraycopy(((Object) (offsets)), 0, ((Object) (al)), j, i1);
	//  169  312:aload_0         
	//  170  313:getfield        #45  <Field long[] offsets>
	//  171  316:iconst_0        
	//  172  317:aload           10
	//  173  319:iload           6
	//  174  321:iload           8
	//  175  323:invokestatic    #132 <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (timesUs)), 0, ((Object) (al1)), j, i1);
	//  176  326:aload_0         
	//  177  327:getfield        #47  <Field long[] timesUs>
	//  178  330:iconst_0        
	//  179  331:aload           11
	//  180  333:iload           6
	//  181  335:iload           8
	//  182  337:invokestatic    #132 <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (flags)), 0, ((Object) (ai)), j, i1);
	//  183  340:aload_0         
	//  184  341:getfield        #49  <Field int[] flags>
	//  185  344:iconst_0        
	//  186  345:aload           12
	//  187  347:iload           6
	//  188  349:iload           8
	//  189  351:invokestatic    #132 <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (sizes)), 0, ((Object) (ai1)), j, i1);
	//  190  354:aload_0         
	//  191  355:getfield        #51  <Field int[] sizes>
	//  192  358:iconst_0        
	//  193  359:aload           13
	//  194  361:iload           6
	//  195  363:iload           8
	//  196  365:invokestatic    #132 <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (cryptoDatas)), 0, ((Object) (acryptodata)), j, i1);
	//  197  368:aload_0         
	//  198  369:getfield        #55  <Field com.google.android.exoplayer2.extractor.TrackOutput$CryptoData[] cryptoDatas>
	//  199  372:iconst_0        
	//  200  373:aload           14
	//  201  375:iload           6
	//  202  377:iload           8
	//  203  379:invokestatic    #132 <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (formats)), 0, ((Object) (aformat)), j, i1);
	//  204  382:aload_0         
	//  205  383:getfield        #59  <Field Format[] formats>
	//  206  386:iconst_0        
	//  207  387:aload           15
	//  208  389:iload           6
	//  209  391:iload           8
	//  210  393:invokestatic    #132 <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (sourceIds)), 0, ((Object) (cryptodata)), j, i1);
	//  211  396:aload_0         
	//  212  397:getfield        #43  <Field int[] sourceIds>
	//  213  400:iconst_0        
	//  214  401:aload           7
	//  215  403:iload           6
	//  216  405:iload           8
	//  217  407:invokestatic    #132 <Method void System.arraycopy(Object, int, Object, int, int)>
			offsets = al;
	//  218  410:aload_0         
	//  219  411:aload           10
	//  220  413:putfield        #45  <Field long[] offsets>
			timesUs = al1;
	//  221  416:aload_0         
	//  222  417:aload           11
	//  223  419:putfield        #47  <Field long[] timesUs>
			flags = ai;
	//  224  422:aload_0         
	//  225  423:aload           12
	//  226  425:putfield        #49  <Field int[] flags>
			sizes = ai1;
	//  227  428:aload_0         
	//  228  429:aload           13
	//  229  431:putfield        #51  <Field int[] sizes>
			cryptoDatas = acryptodata;
	//  230  434:aload_0         
	//  231  435:aload           14
	//  232  437:putfield        #55  <Field com.google.android.exoplayer2.extractor.TrackOutput$CryptoData[] cryptoDatas>
			formats = aformat;
	//  233  440:aload_0         
	//  234  441:aload           15
	//  235  443:putfield        #59  <Field Format[] formats>
			sourceIds = ((int []) (cryptodata));
	//  236  446:aload_0         
	//  237  447:aload           7
	//  238  449:putfield        #43  <Field int[] sourceIds>
			relativeFirstIndex = 0;
	//  239  452:aload_0         
	//  240  453:iconst_0        
	//  241  454:putfield        #87  <Field int relativeFirstIndex>
			length = capacity;
	//  242  457:aload_0         
	//  243  458:aload_0         
	//  244  459:getfield        #41  <Field int capacity>
	//  245  462:putfield        #83  <Field int length>
			capacity = i;
	//  246  465:aload_0         
	//  247  466:iload_3         
	//  248  467:putfield        #41  <Field int capacity>
		}
		this;
	//  249  470:aload_0         
		JVM INSTR monitorexit ;
	//  250  471:monitorexit     
		return;
	//  251  472:return          
		cryptodata;
	//  252  473:astore          7
	//* 253  475:aload_0         
		throw cryptodata;
	//  254  476:monitorexit     
	//  255  477:aload           7
	//  256  479:athrow          
	}

	public void commitSampleTimestamp(long l)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		largestQueuedTimestampUs = Math.max(largestQueuedTimestampUs, l);
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:getfield        #65  <Field long largestQueuedTimestampUs>
	//    5    7:lload_1         
	//    6    8:invokestatic    #81  <Method long Math.max(long, long)>
	//    7   11:putfield        #65  <Field long largestQueuedTimestampUs>
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		Exception exception;
		exception;
	//   11   17:astore_3        
	//*  12   18:aload_0         
		throw exception;
	//   13   19:monitorexit     
	//   14   20:aload_3         
	//   15   21:athrow          
	}

	public long discardTo(long l, boolean flag, boolean flag1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(length == 0 || l < timesUs[relativeFirstIndex])
	//*   2    2:aload_0         
	//*   3    3:getfield        #83  <Field int length>
	//*   4    6:ifeq            96
	//*   5    9:lload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #47  <Field long[] timesUs>
	//*   8   14:aload_0         
	//*   9   15:getfield        #87  <Field int relativeFirstIndex>
	//*  10   18:laload          
	//*  11   19:lcmp            
	//*  12   20:ifge            26
			break MISSING_BLOCK_LABEL_96;
	//   13   23:goto            96
		if(!flag1)
			break MISSING_BLOCK_LABEL_53;
	//   14   26:iload           4
	//   15   28:ifeq            53
		int i;
		if(readPosition != length)
	//*  16   31:aload_0         
	//*  17   32:getfield        #89  <Field int readPosition>
	//*  18   35:aload_0         
	//*  19   36:getfield        #83  <Field int length>
	//*  20   39:icmpeq          53
		{
			i = readPosition + 1;
	//   21   42:aload_0         
	//   22   43:getfield        #89  <Field int readPosition>
	//   23   46:iconst_1        
	//   24   47:iadd            
	//   25   48:istore          5
			break MISSING_BLOCK_LABEL_59;
	//   26   50:goto            59
		}
		i = length;
	//   27   53:aload_0         
	//   28   54:getfield        #83  <Field int length>
	//   29   57:istore          5
		i = findSampleBefore(relativeFirstIndex, i, l, flag);
	//   30   59:aload_0         
	//   31   60:aload_0         
	//   32   61:getfield        #87  <Field int relativeFirstIndex>
	//   33   64:iload           5
	//   34   66:lload_1         
	//   35   67:iload_3         
	//   36   68:invokespecial   #103 <Method int findSampleBefore(int, int, long, boolean)>
	//   37   71:istore          5
		if(i != -1)
			break MISSING_BLOCK_LABEL_85;
	//   38   73:iload           5
	//   39   75:iconst_m1       
	//   40   76:icmpne          85
		this;
	//   41   79:aload_0         
		JVM INSTR monitorexit ;
	//   42   80:monitorexit     
		return -1L;
	//   43   81:ldc2w           #135 <Long -1L>
	//   44   84:lreturn         
		l = discardSamples(i);
	//   45   85:aload_0         
	//   46   86:iload           5
	//   47   88:invokespecial   #138 <Method long discardSamples(int)>
	//   48   91:lstore_1        
		this;
	//   49   92:aload_0         
		JVM INSTR monitorexit ;
	//   50   93:monitorexit     
		return l;
	//   51   94:lload_1         
	//   52   95:lreturn         
		this;
	//   53   96:aload_0         
		JVM INSTR monitorexit ;
	//   54   97:monitorexit     
		return -1L;
	//   55   98:ldc2w           #135 <Long -1L>
	//   56  101:lreturn         
		Exception exception;
		exception;
	//   57  102:astore          6
	//*  58  104:aload_0         
		throw exception;
	//   59  105:monitorexit     
	//   60  106:aload           6
	//   61  108:athrow          
	}

	public long discardToEnd()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = length;
	//    2    2:aload_0         
	//    3    3:getfield        #83  <Field int length>
	//    4    6:istore_1        
		if(i != 0)
			break MISSING_BLOCK_LABEL_17;
	//    5    7:iload_1         
	//    6    8:ifne            17
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return -1L;
	//    9   13:ldc2w           #135 <Long -1L>
	//   10   16:lreturn         
		long l = discardSamples(length);
	//   11   17:aload_0         
	//   12   18:aload_0         
	//   13   19:getfield        #83  <Field int length>
	//   14   22:invokespecial   #138 <Method long discardSamples(int)>
	//   15   25:lstore_2        
		this;
	//   16   26:aload_0         
		JVM INSTR monitorexit ;
	//   17   27:monitorexit     
		return l;
	//   18   28:lload_2         
	//   19   29:lreturn         
		Exception exception;
		exception;
	//   20   30:astore          4
	//*  21   32:aload_0         
		throw exception;
	//   22   33:monitorexit     
	//   23   34:aload           4
	//   24   36:athrow          
	}

	public long discardToRead()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = readPosition;
	//    2    2:aload_0         
	//    3    3:getfield        #89  <Field int readPosition>
	//    4    6:istore_1        
		if(i != 0)
			break MISSING_BLOCK_LABEL_17;
	//    5    7:iload_1         
	//    6    8:ifne            17
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return -1L;
	//    9   13:ldc2w           #135 <Long -1L>
	//   10   16:lreturn         
		long l = discardSamples(readPosition);
	//   11   17:aload_0         
	//   12   18:aload_0         
	//   13   19:getfield        #89  <Field int readPosition>
	//   14   22:invokespecial   #138 <Method long discardSamples(int)>
	//   15   25:lstore_2        
		this;
	//   16   26:aload_0         
		JVM INSTR monitorexit ;
	//   17   27:monitorexit     
		return l;
	//   18   28:lload_2         
	//   19   29:lreturn         
		Exception exception;
		exception;
	//   20   30:astore          4
	//*  21   32:aload_0         
		throw exception;
	//   22   33:monitorexit     
	//   23   34:aload           4
	//   24   36:athrow          
	}

	public long discardUpstreamSamples(int i)
	{
		i = getWriteIndex() - i;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #144 <Method int getWriteIndex()>
	//    2    4:iload_1         
	//    3    5:isub            
	//    4    6:istore_1        
		boolean flag;
		if(i >= 0 && i <= length - readPosition)
	//*   5    7:iload_1         
	//*   6    8:iflt            29
	//*   7   11:iload_1         
	//*   8   12:aload_0         
	//*   9   13:getfield        #83  <Field int length>
	//*  10   16:aload_0         
	//*  11   17:getfield        #89  <Field int readPosition>
	//*  12   20:isub            
	//*  13   21:icmpgt          29
			flag = true;
	//   14   24:iconst_1        
	//   15   25:istore_2        
		else
	//*  16   26:goto            31
			flag = false;
	//   17   29:iconst_0        
	//   18   30:istore_2        
		Assertions.checkArgument(flag);
	//   19   31:iload_2         
	//   20   32:invokestatic    #147 <Method void Assertions.checkArgument(boolean)>
		length = length - i;
	//   21   35:aload_0         
	//   22   36:aload_0         
	//   23   37:getfield        #83  <Field int length>
	//   24   40:iload_1         
	//   25   41:isub            
	//   26   42:putfield        #83  <Field int length>
		largestQueuedTimestampUs = Math.max(largestDiscardedTimestampUs, getLargestTimestamp(length));
	//   27   45:aload_0         
	//   28   46:aload_0         
	//   29   47:getfield        #63  <Field long largestDiscardedTimestampUs>
	//   30   50:aload_0         
	//   31   51:aload_0         
	//   32   52:getfield        #83  <Field int length>
	//   33   55:invokespecial   #75  <Method long getLargestTimestamp(int)>
	//   34   58:invokestatic    #81  <Method long Math.max(long, long)>
	//   35   61:putfield        #65  <Field long largestQueuedTimestampUs>
		if(length == 0)
	//*  36   64:aload_0         
	//*  37   65:getfield        #83  <Field int length>
	//*  38   68:ifne            73
		{
			return 0L;
	//   39   71:lconst_0        
	//   40   72:lreturn         
		} else
		{
			i = getRelativeIndex(length - 1);
	//   41   73:aload_0         
	//   42   74:aload_0         
	//   43   75:getfield        #83  <Field int length>
	//   44   78:iconst_1        
	//   45   79:isub            
	//   46   80:invokespecial   #95  <Method int getRelativeIndex(int)>
	//   47   83:istore_1        
			return offsets[i] + (long)sizes[i];
	//   48   84:aload_0         
	//   49   85:getfield        #45  <Field long[] offsets>
	//   50   88:iload_1         
	//   51   89:laload          
	//   52   90:aload_0         
	//   53   91:getfield        #51  <Field int[] sizes>
	//   54   94:iload_1         
	//   55   95:iaload          
	//   56   96:i2l             
	//   57   97:ladd            
	//   58   98:lreturn         
		}
	}

	public boolean format(Format format1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(format1 != null)
			break MISSING_BLOCK_LABEL_19;
	//    2    2:aload_1         
	//    3    3:ifnonnull       19
		upstreamFormatRequired = true;
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:putfield        #67  <Field boolean upstreamFormatRequired>
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return false;
	//    9   13:iconst_0        
	//   10   14:ireturn         
		format1;
	//   11   15:astore_1        
		break MISSING_BLOCK_LABEL_51;
	//   12   16:goto            50
		boolean flag;
		upstreamFormatRequired = false;
	//   13   19:aload_0         
	//   14   20:iconst_0        
	//   15   21:putfield        #67  <Field boolean upstreamFormatRequired>
		flag = Util.areEqual(((Object) (format1)), ((Object) (upstreamFormat)));
	//   16   24:aload_1         
	//   17   25:aload_0         
	//   18   26:getfield        #124 <Field Format upstreamFormat>
	//   19   29:invokestatic    #155 <Method boolean Util.areEqual(Object, Object)>
	//   20   32:istore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_41;
	//   21   33:iload_2         
	//   22   34:ifeq            41
		this;
	//   23   37:aload_0         
		JVM INSTR monitorexit ;
	//   24   38:monitorexit     
		return false;
	//   25   39:iconst_0        
	//   26   40:ireturn         
		upstreamFormat = format1;
	//   27   41:aload_0         
	//   28   42:aload_1         
	//   29   43:putfield        #124 <Field Format upstreamFormat>
		this;
	//   30   46:aload_0         
		JVM INSTR monitorexit ;
	//   31   47:monitorexit     
		return true;
	//   32   48:iconst_1        
	//   33   49:ireturn         
	//*  34   50:aload_0         
		throw format1;
	//   35   51:monitorexit     
	//   36   52:aload_1         
	//   37   53:athrow          
	}

	public int getFirstIndex()
	{
		return absoluteFirstIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field int absoluteFirstIndex>
	//    2    4:ireturn         
	}

	public long getFirstTimestampUs()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		long l;
		if(length == 0)
	//*   2    2:aload_0         
	//*   3    3:getfield        #83  <Field int length>
	//*   4    6:ifne            16
		{
			l = 0x0L;
	//    5    9:ldc2w           #60  <Long 0x0L>
	//    6   12:lstore_1        
			break MISSING_BLOCK_LABEL_26;
	//    7   13:goto            26
		}
		l = timesUs[relativeFirstIndex];
	//    8   16:aload_0         
	//    9   17:getfield        #47  <Field long[] timesUs>
	//   10   20:aload_0         
	//   11   21:getfield        #87  <Field int relativeFirstIndex>
	//   12   24:laload          
	//   13   25:lstore_1        
		this;
	//   14   26:aload_0         
		JVM INSTR monitorexit ;
	//   15   27:monitorexit     
		return l;
	//   16   28:lload_1         
	//   17   29:lreturn         
		Exception exception;
		exception;
	//   18   30:astore_3        
	//*  19   31:aload_0         
		throw exception;
	//   20   32:monitorexit     
	//   21   33:aload_3         
	//   22   34:athrow          
	}

	public long getLargestQueuedTimestampUs()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		long l = largestQueuedTimestampUs;
	//    2    2:aload_0         
	//    3    3:getfield        #65  <Field long largestQueuedTimestampUs>
	//    4    6:lstore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return l;
	//    7    9:lload_1         
	//    8   10:lreturn         
		Exception exception;
		exception;
	//    9   11:astore_3        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_3         
	//   13   15:athrow          
	}

	public int getReadIndex()
	{
		return absoluteFirstIndex + readPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field int absoluteFirstIndex>
	//    2    4:aload_0         
	//    3    5:getfield        #89  <Field int readPosition>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public Format getUpstreamFormat()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Format format1;
		if(upstreamFormatRequired)
	//*   2    2:aload_0         
	//*   3    3:getfield        #67  <Field boolean upstreamFormatRequired>
	//*   4    6:ifeq            14
		{
			format1 = null;
	//    5    9:aconst_null     
	//    6   10:astore_1        
			break MISSING_BLOCK_LABEL_19;
	//    7   11:goto            19
		}
		format1 = upstreamFormat;
	//    8   14:aload_0         
	//    9   15:getfield        #124 <Field Format upstreamFormat>
	//   10   18:astore_1        
		this;
	//   11   19:aload_0         
		JVM INSTR monitorexit ;
	//   12   20:monitorexit     
		return format1;
	//   13   21:aload_1         
	//   14   22:areturn         
		Exception exception;
		exception;
	//   15   23:astore_1        
	//*  16   24:aload_0         
		throw exception;
	//   17   25:monitorexit     
	//   18   26:aload_1         
	//   19   27:athrow          
	}

	public int getWriteIndex()
	{
		return absoluteFirstIndex + length;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field int absoluteFirstIndex>
	//    2    4:aload_0         
	//    3    5:getfield        #83  <Field int length>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public boolean hasNextSample()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i;
		int j;
		i = readPosition;
	//    2    2:aload_0         
	//    3    3:getfield        #89  <Field int readPosition>
	//    4    6:istore_1        
		j = length;
	//    5    7:aload_0         
	//    6    8:getfield        #83  <Field int length>
	//    7   11:istore_2        
		boolean flag;
		if(i != j)
	//*   8   12:iload_1         
	//*   9   13:iload_2         
	//*  10   14:icmpeq          22
			flag = true;
	//   11   17:iconst_1        
	//   12   18:istore_3        
		else
	//*  13   19:goto            24
			flag = false;
	//   14   22:iconst_0        
	//   15   23:istore_3        
		this;
	//   16   24:aload_0         
		JVM INSTR monitorexit ;
	//   17   25:monitorexit     
		return flag;
	//   18   26:iload_3         
	//   19   27:ireturn         
		Exception exception;
		exception;
	//   20   28:astore          4
	//*  21   30:aload_0         
		throw exception;
	//   22   31:monitorexit     
	//   23   32:aload           4
	//   24   34:athrow          
	}

	public int peekSourceId()
	{
		int i = getRelativeIndex(readPosition);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #89  <Field int readPosition>
	//    3    5:invokespecial   #95  <Method int getRelativeIndex(int)>
	//    4    8:istore_1        
		if(hasNextSample())
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #101 <Method boolean hasNextSample()>
	//*   7   13:ifeq            23
			return sourceIds[i];
	//    8   16:aload_0         
	//    9   17:getfield        #43  <Field int[] sourceIds>
	//   10   20:iload_1         
	//   11   21:iaload          
	//   12   22:ireturn         
		else
			return upstreamSourceId;
	//   13   23:aload_0         
	//   14   24:getfield        #126 <Field int upstreamSourceId>
	//   15   27:ireturn         
	}

	public int read(FormatHolder formatholder, DecoderInputBuffer decoderinputbuffer, boolean flag, boolean flag1, Format format1, SampleExtrasHolder sampleextrasholder)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(hasNextSample())
			break MISSING_BLOCK_LABEL_62;
	//    2    2:aload_0         
	//    3    3:invokevirtual   #101 <Method boolean hasNextSample()>
	//    4    6:ifne            62
		if(!flag1)
			break MISSING_BLOCK_LABEL_24;
	//    5    9:iload           4
	//    6   11:ifeq            24
		decoderinputbuffer.setFlags(4);
	//    7   14:aload_2         
	//    8   15:iconst_4        
	//    9   16:invokevirtual   #170 <Method void DecoderInputBuffer.setFlags(int)>
		this;
	//   10   19:aload_0         
		JVM INSTR monitorexit ;
	//   11   20:monitorexit     
		return -4;
	//   12   21:bipush          -4
	//   13   23:ireturn         
		if(upstreamFormat == null)
			break MISSING_BLOCK_LABEL_57;
	//   14   24:aload_0         
	//   15   25:getfield        #124 <Field Format upstreamFormat>
	//   16   28:ifnull          57
		if(flag)
			break MISSING_BLOCK_LABEL_44;
	//   17   31:iload_3         
	//   18   32:ifne            44
		if(upstreamFormat == format1)
			break MISSING_BLOCK_LABEL_57;
	//   19   35:aload_0         
	//   20   36:getfield        #124 <Field Format upstreamFormat>
	//   21   39:aload           5
	//   22   41:if_acmpeq       57
		formatholder.format = upstreamFormat;
	//   23   44:aload_1         
	//   24   45:aload_0         
	//   25   46:getfield        #124 <Field Format upstreamFormat>
	//   26   49:putfield        #174 <Field Format FormatHolder.format>
		this;
	//   27   52:aload_0         
		JVM INSTR monitorexit ;
	//   28   53:monitorexit     
		return -5;
	//   29   54:bipush          -5
	//   30   56:ireturn         
		this;
	//   31   57:aload_0         
		JVM INSTR monitorexit ;
	//   32   58:monitorexit     
		return -3;
	//   33   59:bipush          -3
	//   34   61:ireturn         
		int i = getRelativeIndex(readPosition);
	//   35   62:aload_0         
	//   36   63:aload_0         
	//   37   64:getfield        #89  <Field int readPosition>
	//   38   67:invokespecial   #95  <Method int getRelativeIndex(int)>
	//   39   70:istore          7
		if(flag)
			break MISSING_BLOCK_LABEL_178;
	//   40   72:iload_3         
	//   41   73:ifne            178
		if(formats[i] != format1)
	//*  42   76:aload_0         
	//*  43   77:getfield        #59  <Field Format[] formats>
	//*  44   80:iload           7
	//*  45   82:aaload          
	//*  46   83:aload           5
	//*  47   85:if_acmpeq       91
			break MISSING_BLOCK_LABEL_178;
	//   48   88:goto            178
		flag = decoderinputbuffer.isFlagsOnly();
	//   49   91:aload_2         
	//   50   92:invokevirtual   #177 <Method boolean DecoderInputBuffer.isFlagsOnly()>
	//   51   95:istore_3        
		if(!flag)
			break MISSING_BLOCK_LABEL_105;
	//   52   96:iload_3         
	//   53   97:ifeq            105
		this;
	//   54  100:aload_0         
		JVM INSTR monitorexit ;
	//   55  101:monitorexit     
		return -3;
	//   56  102:bipush          -3
	//   57  104:ireturn         
		decoderinputbuffer.timeUs = timesUs[i];
	//   58  105:aload_2         
	//   59  106:aload_0         
	//   60  107:getfield        #47  <Field long[] timesUs>
	//   61  110:iload           7
	//   62  112:laload          
	//   63  113:putfield        #180 <Field long DecoderInputBuffer.timeUs>
		decoderinputbuffer.setFlags(flags[i]);
	//   64  116:aload_2         
	//   65  117:aload_0         
	//   66  118:getfield        #49  <Field int[] flags>
	//   67  121:iload           7
	//   68  123:iaload          
	//   69  124:invokevirtual   #170 <Method void DecoderInputBuffer.setFlags(int)>
		sampleextrasholder.size = sizes[i];
	//   70  127:aload           6
	//   71  129:aload_0         
	//   72  130:getfield        #51  <Field int[] sizes>
	//   73  133:iload           7
	//   74  135:iaload          
	//   75  136:putfield        #183 <Field int SampleMetadataQueue$SampleExtrasHolder.size>
		sampleextrasholder.offset = offsets[i];
	//   76  139:aload           6
	//   77  141:aload_0         
	//   78  142:getfield        #45  <Field long[] offsets>
	//   79  145:iload           7
	//   80  147:laload          
	//   81  148:putfield        #186 <Field long SampleMetadataQueue$SampleExtrasHolder.offset>
		sampleextrasholder.cryptoData = cryptoDatas[i];
	//   82  151:aload           6
	//   83  153:aload_0         
	//   84  154:getfield        #55  <Field com.google.android.exoplayer2.extractor.TrackOutput$CryptoData[] cryptoDatas>
	//   85  157:iload           7
	//   86  159:aaload          
	//   87  160:putfield        #190 <Field com.google.android.exoplayer2.extractor.TrackOutput$CryptoData SampleMetadataQueue$SampleExtrasHolder.cryptoData>
		readPosition = readPosition + 1;
	//   88  163:aload_0         
	//   89  164:aload_0         
	//   90  165:getfield        #89  <Field int readPosition>
	//   91  168:iconst_1        
	//   92  169:iadd            
	//   93  170:putfield        #89  <Field int readPosition>
		this;
	//   94  173:aload_0         
		JVM INSTR monitorexit ;
	//   95  174:monitorexit     
		return -4;
	//   96  175:bipush          -4
	//   97  177:ireturn         
		formatholder.format = formats[i];
	//   98  178:aload_1         
	//   99  179:aload_0         
	//  100  180:getfield        #59  <Field Format[] formats>
	//  101  183:iload           7
	//  102  185:aaload          
	//  103  186:putfield        #174 <Field Format FormatHolder.format>
		this;
	//  104  189:aload_0         
		JVM INSTR monitorexit ;
	//  105  190:monitorexit     
		return -5;
	//  106  191:bipush          -5
	//  107  193:ireturn         
		formatholder;
	//  108  194:astore_1        
	//* 109  195:aload_0         
		throw formatholder;
	//  110  196:monitorexit     
	//  111  197:aload_1         
	//  112  198:athrow          
	}

	public void reset(boolean flag)
	{
		length = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #83  <Field int length>
		absoluteFirstIndex = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #85  <Field int absoluteFirstIndex>
		relativeFirstIndex = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #87  <Field int relativeFirstIndex>
		readPosition = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #89  <Field int readPosition>
		upstreamKeyframeRequired = true;
	//   12   20:aload_0         
	//   13   21:iconst_1        
	//   14   22:putfield        #69  <Field boolean upstreamKeyframeRequired>
		largestDiscardedTimestampUs = 0x0L;
	//   15   25:aload_0         
	//   16   26:ldc2w           #60  <Long 0x0L>
	//   17   29:putfield        #63  <Field long largestDiscardedTimestampUs>
		largestQueuedTimestampUs = 0x0L;
	//   18   32:aload_0         
	//   19   33:ldc2w           #60  <Long 0x0L>
	//   20   36:putfield        #65  <Field long largestQueuedTimestampUs>
		if(flag)
	//*  21   39:iload_1         
	//*  22   40:ifeq            53
		{
			upstreamFormat = null;
	//   23   43:aload_0         
	//   24   44:aconst_null     
	//   25   45:putfield        #124 <Field Format upstreamFormat>
			upstreamFormatRequired = true;
	//   26   48:aload_0         
	//   27   49:iconst_1        
	//   28   50:putfield        #67  <Field boolean upstreamFormatRequired>
		}
	//   29   53:return          
	}

	public void rewind()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		readPosition = 0;
	//    2    2:aload_0         
	//    3    3:iconst_0        
	//    4    4:putfield        #89  <Field int readPosition>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		Exception exception;
		exception;
	//    8   10:astore_1        
	//*   9   11:aload_0         
		throw exception;
	//   10   12:monitorexit     
	//   11   13:aload_1         
	//   12   14:athrow          
	}

	public boolean setReadPosition(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(absoluteFirstIndex > i || i > absoluteFirstIndex + length)
			break MISSING_BLOCK_LABEL_37;
	//    2    2:aload_0         
	//    3    3:getfield        #85  <Field int absoluteFirstIndex>
	//    4    6:iload_1         
	//    5    7:icmpgt          37
	//    6   10:iload_1         
	//    7   11:aload_0         
	//    8   12:getfield        #85  <Field int absoluteFirstIndex>
	//    9   15:aload_0         
	//   10   16:getfield        #83  <Field int length>
	//   11   19:iadd            
	//   12   20:icmpgt          37
		readPosition = i - absoluteFirstIndex;
	//   13   23:aload_0         
	//   14   24:iload_1         
	//   15   25:aload_0         
	//   16   26:getfield        #85  <Field int absoluteFirstIndex>
	//   17   29:isub            
	//   18   30:putfield        #89  <Field int readPosition>
	//*  19   33:aload_0         
	//*  20   34:monitorexit     
		return true;
	//   21   35:iconst_1        
	//   22   36:ireturn         
		this;
	//   23   37:aload_0         
		JVM INSTR monitorexit ;
	//   24   38:monitorexit     
		return false;
	//   25   39:iconst_0        
	//   26   40:ireturn         
		Exception exception;
		exception;
	//   27   41:astore_2        
	//*  28   42:aload_0         
		throw exception;
	//   29   43:monitorexit     
	//   30   44:aload_2         
	//   31   45:athrow          
	}

	public void sourceId(int i)
	{
		upstreamSourceId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #126 <Field int upstreamSourceId>
	//    3    5:return          
	}

	private static final int SAMPLE_CAPACITY_INCREMENT = 1000;
	private int absoluteFirstIndex;
	private int capacity;
	private com.google.android.exoplayer2.extractor.TrackOutput.CryptoData cryptoDatas[];
	private int flags[];
	private Format formats[];
	private long largestDiscardedTimestampUs;
	private long largestQueuedTimestampUs;
	private int length;
	private long offsets[];
	private int readPosition;
	private int relativeFirstIndex;
	private int sizes[];
	private int sourceIds[];
	private long timesUs[];
	private Format upstreamFormat;
	private boolean upstreamFormatRequired;
	private boolean upstreamKeyframeRequired;
	private int upstreamSourceId;
}
