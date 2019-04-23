// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor;

import com.google.android.exoplayer.SampleHolder;
import com.google.android.exoplayer.util.Assertions;

// Referenced classes of package com.google.android.exoplayer.extractor:
//			RollingSampleBuffer

private static final class RollingSampleBuffer$InfoQueue
{

	public void clear()
	{
		absoluteReadIndex = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #45  <Field int absoluteReadIndex>
		relativeReadIndex = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #47  <Field int relativeReadIndex>
		relativeWriteIndex = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #49  <Field int relativeWriteIndex>
		queueSize = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #51  <Field int queueSize>
	//   12   20:return          
	}

	public void commitSample(long l, int i, long l1, int j, byte abyte0[])
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		timesUs[relativeWriteIndex] = l;
	//    2    2:aload_0         
	//    3    3:getfield        #33  <Field long[] timesUs>
	//    4    6:aload_0         
	//    5    7:getfield        #49  <Field int relativeWriteIndex>
	//    6   10:lload_1         
	//    7   11:lastore         
		offsets[relativeWriteIndex] = l1;
	//    8   12:aload_0         
	//    9   13:getfield        #31  <Field long[] offsets>
	//   10   16:aload_0         
	//   11   17:getfield        #49  <Field int relativeWriteIndex>
	//   12   20:lload           4
	//   13   22:lastore         
		sizes[relativeWriteIndex] = j;
	//   14   23:aload_0         
	//   15   24:getfield        #37  <Field int[] sizes>
	//   16   27:aload_0         
	//   17   28:getfield        #49  <Field int relativeWriteIndex>
	//   18   31:iload           6
	//   19   33:iastore         
		flags[relativeWriteIndex] = i;
	//   20   34:aload_0         
	//   21   35:getfield        #35  <Field int[] flags>
	//   22   38:aload_0         
	//   23   39:getfield        #49  <Field int relativeWriteIndex>
	//   24   42:iload_3         
	//   25   43:iastore         
		encryptionKeys[relativeWriteIndex] = abyte0;
	//   26   44:aload_0         
	//   27   45:getfield        #41  <Field byte[][] encryptionKeys>
	//   28   48:aload_0         
	//   29   49:getfield        #49  <Field int relativeWriteIndex>
	//   30   52:aload           7
	//   31   54:aastore         
		queueSize = queueSize + 1;
	//   32   55:aload_0         
	//   33   56:aload_0         
	//   34   57:getfield        #51  <Field int queueSize>
	//   35   60:iconst_1        
	//   36   61:iadd            
	//   37   62:putfield        #51  <Field int queueSize>
		if(queueSize == capacity)
	//*  38   65:aload_0         
	//*  39   66:getfield        #51  <Field int queueSize>
	//*  40   69:aload_0         
	//*  41   70:getfield        #29  <Field int capacity>
	//*  42   73:icmpne          337
		{
			i = capacity + 1000;
	//   43   76:aload_0         
	//   44   77:getfield        #29  <Field int capacity>
	//   45   80:sipush          1000
	//   46   83:iadd            
	//   47   84:istore_3        
			abyte0 = ((byte []) (new long[i]));
	//   48   85:iload_3         
	//   49   86:newarray        long[]
	//   50   88:astore          7
			long al[] = new long[i];
	//   51   90:iload_3         
	//   52   91:newarray        long[]
	//   53   93:astore          9
			int ai[] = new int[i];
	//   54   95:iload_3         
	//   55   96:newarray        int[]
	//   56   98:astore          10
			int ai1[] = new int[i];
	//   57  100:iload_3         
	//   58  101:newarray        int[]
	//   59  103:astore          11
			byte abyte1[][] = new byte[i][];
	//   60  105:iload_3         
	//   61  106:anewarray       byte[][]
	//   62  109:astore          12
			j = capacity - relativeReadIndex;
	//   63  111:aload_0         
	//   64  112:getfield        #29  <Field int capacity>
	//   65  115:aload_0         
	//   66  116:getfield        #47  <Field int relativeReadIndex>
	//   67  119:isub            
	//   68  120:istore          6
			System.arraycopy(((Object) (offsets)), relativeReadIndex, ((Object) (abyte0)), 0, j);
	//   69  122:aload_0         
	//   70  123:getfield        #31  <Field long[] offsets>
	//   71  126:aload_0         
	//   72  127:getfield        #47  <Field int relativeReadIndex>
	//   73  130:aload           7
	//   74  132:iconst_0        
	//   75  133:iload           6
	//   76  135:invokestatic    #59  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (timesUs)), relativeReadIndex, ((Object) (al)), 0, j);
	//   77  138:aload_0         
	//   78  139:getfield        #33  <Field long[] timesUs>
	//   79  142:aload_0         
	//   80  143:getfield        #47  <Field int relativeReadIndex>
	//   81  146:aload           9
	//   82  148:iconst_0        
	//   83  149:iload           6
	//   84  151:invokestatic    #59  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (flags)), relativeReadIndex, ((Object) (ai)), 0, j);
	//   85  154:aload_0         
	//   86  155:getfield        #35  <Field int[] flags>
	//   87  158:aload_0         
	//   88  159:getfield        #47  <Field int relativeReadIndex>
	//   89  162:aload           10
	//   90  164:iconst_0        
	//   91  165:iload           6
	//   92  167:invokestatic    #59  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (sizes)), relativeReadIndex, ((Object) (ai1)), 0, j);
	//   93  170:aload_0         
	//   94  171:getfield        #37  <Field int[] sizes>
	//   95  174:aload_0         
	//   96  175:getfield        #47  <Field int relativeReadIndex>
	//   97  178:aload           11
	//   98  180:iconst_0        
	//   99  181:iload           6
	//  100  183:invokestatic    #59  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (encryptionKeys)), relativeReadIndex, ((Object) (abyte1)), 0, j);
	//  101  186:aload_0         
	//  102  187:getfield        #41  <Field byte[][] encryptionKeys>
	//  103  190:aload_0         
	//  104  191:getfield        #47  <Field int relativeReadIndex>
	//  105  194:aload           12
	//  106  196:iconst_0        
	//  107  197:iload           6
	//  108  199:invokestatic    #59  <Method void System.arraycopy(Object, int, Object, int, int)>
			int k = relativeReadIndex;
	//  109  202:aload_0         
	//  110  203:getfield        #47  <Field int relativeReadIndex>
	//  111  206:istore          8
			System.arraycopy(((Object) (offsets)), 0, ((Object) (abyte0)), j, k);
	//  112  208:aload_0         
	//  113  209:getfield        #31  <Field long[] offsets>
	//  114  212:iconst_0        
	//  115  213:aload           7
	//  116  215:iload           6
	//  117  217:iload           8
	//  118  219:invokestatic    #59  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (timesUs)), 0, ((Object) (al)), j, k);
	//  119  222:aload_0         
	//  120  223:getfield        #33  <Field long[] timesUs>
	//  121  226:iconst_0        
	//  122  227:aload           9
	//  123  229:iload           6
	//  124  231:iload           8
	//  125  233:invokestatic    #59  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (flags)), 0, ((Object) (ai)), j, k);
	//  126  236:aload_0         
	//  127  237:getfield        #35  <Field int[] flags>
	//  128  240:iconst_0        
	//  129  241:aload           10
	//  130  243:iload           6
	//  131  245:iload           8
	//  132  247:invokestatic    #59  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (sizes)), 0, ((Object) (ai1)), j, k);
	//  133  250:aload_0         
	//  134  251:getfield        #37  <Field int[] sizes>
	//  135  254:iconst_0        
	//  136  255:aload           11
	//  137  257:iload           6
	//  138  259:iload           8
	//  139  261:invokestatic    #59  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (encryptionKeys)), 0, ((Object) (abyte1)), j, k);
	//  140  264:aload_0         
	//  141  265:getfield        #41  <Field byte[][] encryptionKeys>
	//  142  268:iconst_0        
	//  143  269:aload           12
	//  144  271:iload           6
	//  145  273:iload           8
	//  146  275:invokestatic    #59  <Method void System.arraycopy(Object, int, Object, int, int)>
			offsets = ((long []) (abyte0));
	//  147  278:aload_0         
	//  148  279:aload           7
	//  149  281:putfield        #31  <Field long[] offsets>
			timesUs = al;
	//  150  284:aload_0         
	//  151  285:aload           9
	//  152  287:putfield        #33  <Field long[] timesUs>
			flags = ai;
	//  153  290:aload_0         
	//  154  291:aload           10
	//  155  293:putfield        #35  <Field int[] flags>
			sizes = ai1;
	//  156  296:aload_0         
	//  157  297:aload           11
	//  158  299:putfield        #37  <Field int[] sizes>
			encryptionKeys = abyte1;
	//  159  302:aload_0         
	//  160  303:aload           12
	//  161  305:putfield        #41  <Field byte[][] encryptionKeys>
			relativeReadIndex = 0;
	//  162  308:aload_0         
	//  163  309:iconst_0        
	//  164  310:putfield        #47  <Field int relativeReadIndex>
			relativeWriteIndex = capacity;
	//  165  313:aload_0         
	//  166  314:aload_0         
	//  167  315:getfield        #29  <Field int capacity>
	//  168  318:putfield        #49  <Field int relativeWriteIndex>
			queueSize = capacity;
	//  169  321:aload_0         
	//  170  322:aload_0         
	//  171  323:getfield        #29  <Field int capacity>
	//  172  326:putfield        #51  <Field int queueSize>
			capacity = i;
	//  173  329:aload_0         
	//  174  330:iload_3         
	//  175  331:putfield        #29  <Field int capacity>
			break MISSING_BLOCK_LABEL_363;
	//  176  334:goto            363
		}
		relativeWriteIndex = relativeWriteIndex + 1;
	//  177  337:aload_0         
	//  178  338:aload_0         
	//  179  339:getfield        #49  <Field int relativeWriteIndex>
	//  180  342:iconst_1        
	//  181  343:iadd            
	//  182  344:putfield        #49  <Field int relativeWriteIndex>
		if(relativeWriteIndex == capacity)
	//* 183  347:aload_0         
	//* 184  348:getfield        #49  <Field int relativeWriteIndex>
	//* 185  351:aload_0         
	//* 186  352:getfield        #29  <Field int capacity>
	//* 187  355:icmpne          363
			relativeWriteIndex = 0;
	//  188  358:aload_0         
	//  189  359:iconst_0        
	//  190  360:putfield        #49  <Field int relativeWriteIndex>
		this;
	//  191  363:aload_0         
		JVM INSTR monitorexit ;
	//  192  364:monitorexit     
		return;
	//  193  365:return          
		abyte0;
	//  194  366:astore          7
	//* 195  368:aload_0         
		throw abyte0;
	//  196  369:monitorexit     
	//  197  370:aload           7
	//  198  372:athrow          
	}

	public long discardUpstreamSamples(int i)
	{
		i = getWriteIndex() - i;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method int getWriteIndex()>
	//    2    4:iload_1         
	//    3    5:isub            
	//    4    6:istore_1        
		boolean flag;
		if(i >= 0 && i <= queueSize)
	//*   5    7:iload_1         
	//*   6    8:iflt            25
	//*   7   11:iload_1         
	//*   8   12:aload_0         
	//*   9   13:getfield        #51  <Field int queueSize>
	//*  10   16:icmpgt          25
			flag = true;
	//   11   19:iconst_1        
	//   12   20:istore          4
		else
	//*  13   22:goto            28
			flag = false;
	//   14   25:iconst_0        
	//   15   26:istore          4
		Assertions.checkArgument(flag);
	//   16   28:iload           4
	//   17   30:invokestatic    #71  <Method void Assertions.checkArgument(boolean)>
		if(i == 0)
	//*  18   33:iload_1         
	//*  19   34:ifne            81
		{
			if(absoluteReadIndex == 0)
	//*  20   37:aload_0         
	//*  21   38:getfield        #45  <Field int absoluteReadIndex>
	//*  22   41:ifne            46
				return 0L;
	//   23   44:lconst_0        
	//   24   45:lreturn         
			int j = relativeWriteIndex;
	//   25   46:aload_0         
	//   26   47:getfield        #49  <Field int relativeWriteIndex>
	//   27   50:istore_2        
			i = j;
	//   28   51:iload_2         
	//   29   52:istore_1        
			if(j == 0)
	//*  30   53:iload_2         
	//*  31   54:ifne            62
				i = capacity;
	//   32   57:aload_0         
	//   33   58:getfield        #29  <Field int capacity>
	//   34   61:istore_1        
			i--;
	//   35   62:iload_1         
	//   36   63:iconst_1        
	//   37   64:isub            
	//   38   65:istore_1        
			return offsets[i] + (long)sizes[i];
	//   39   66:aload_0         
	//   40   67:getfield        #31  <Field long[] offsets>
	//   41   70:iload_1         
	//   42   71:laload          
	//   43   72:aload_0         
	//   44   73:getfield        #37  <Field int[] sizes>
	//   45   76:iload_1         
	//   46   77:iaload          
	//   47   78:i2l             
	//   48   79:ladd            
	//   49   80:lreturn         
		} else
		{
			queueSize = queueSize - i;
	//   50   81:aload_0         
	//   51   82:aload_0         
	//   52   83:getfield        #51  <Field int queueSize>
	//   53   86:iload_1         
	//   54   87:isub            
	//   55   88:putfield        #51  <Field int queueSize>
			int k = relativeWriteIndex;
	//   56   91:aload_0         
	//   57   92:getfield        #49  <Field int relativeWriteIndex>
	//   58   95:istore_2        
			int l = capacity;
	//   59   96:aload_0         
	//   60   97:getfield        #29  <Field int capacity>
	//   61  100:istore_3        
			relativeWriteIndex = ((k + l) - i) % l;
	//   62  101:aload_0         
	//   63  102:iload_2         
	//   64  103:iload_3         
	//   65  104:iadd            
	//   66  105:iload_1         
	//   67  106:isub            
	//   68  107:iload_3         
	//   69  108:irem            
	//   70  109:putfield        #49  <Field int relativeWriteIndex>
			return offsets[relativeWriteIndex];
	//   71  112:aload_0         
	//   72  113:getfield        #31  <Field long[] offsets>
	//   73  116:aload_0         
	//   74  117:getfield        #49  <Field int relativeWriteIndex>
	//   75  120:laload          
	//   76  121:lreturn         
		}
	}

	public int getReadIndex()
	{
		return absoluteReadIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int absoluteReadIndex>
	//    2    4:ireturn         
	}

	public int getWriteIndex()
	{
		return absoluteReadIndex + queueSize;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int absoluteReadIndex>
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field int queueSize>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public long moveToNextSample()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i;
		long l;
		queueSize = queueSize - 1;
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:getfield        #51  <Field int queueSize>
	//    5    7:iconst_1        
	//    6    8:isub            
	//    7    9:putfield        #51  <Field int queueSize>
		i = relativeReadIndex;
	//    8   12:aload_0         
	//    9   13:getfield        #47  <Field int relativeReadIndex>
	//   10   16:istore_1        
		relativeReadIndex = i + 1;
	//   11   17:aload_0         
	//   12   18:iload_1         
	//   13   19:iconst_1        
	//   14   20:iadd            
	//   15   21:putfield        #47  <Field int relativeReadIndex>
		absoluteReadIndex = absoluteReadIndex + 1;
	//   16   24:aload_0         
	//   17   25:aload_0         
	//   18   26:getfield        #45  <Field int absoluteReadIndex>
	//   19   29:iconst_1        
	//   20   30:iadd            
	//   21   31:putfield        #45  <Field int absoluteReadIndex>
		if(relativeReadIndex == capacity)
	//*  22   34:aload_0         
	//*  23   35:getfield        #47  <Field int relativeReadIndex>
	//*  24   38:aload_0         
	//*  25   39:getfield        #29  <Field int capacity>
	//*  26   42:icmpne          50
			relativeReadIndex = 0;
	//   27   45:aload_0         
	//   28   46:iconst_0        
	//   29   47:putfield        #47  <Field int relativeReadIndex>
		if(queueSize > 0)
	//*  30   50:aload_0         
	//*  31   51:getfield        #51  <Field int queueSize>
	//*  32   54:ifle            70
		{
			l = offsets[relativeReadIndex];
	//   33   57:aload_0         
	//   34   58:getfield        #31  <Field long[] offsets>
	//   35   61:aload_0         
	//   36   62:getfield        #47  <Field int relativeReadIndex>
	//   37   65:laload          
	//   38   66:lstore_2        
			break MISSING_BLOCK_LABEL_91;
	//   39   67:goto            91
		}
		long l1;
		l = sizes[i];
	//   40   70:aload_0         
	//   41   71:getfield        #37  <Field int[] sizes>
	//   42   74:iload_1         
	//   43   75:iaload          
	//   44   76:i2l             
	//   45   77:lstore_2        
		l1 = offsets[i];
	//   46   78:aload_0         
	//   47   79:getfield        #31  <Field long[] offsets>
	//   48   82:iload_1         
	//   49   83:laload          
	//   50   84:lstore          4
		l += l1;
	//   51   86:lload_2         
	//   52   87:lload           4
	//   53   89:ladd            
	//   54   90:lstore_2        
		this;
	//   55   91:aload_0         
		JVM INSTR monitorexit ;
	//   56   92:monitorexit     
		return l;
	//   57   93:lload_2         
	//   58   94:lreturn         
		Exception exception;
		exception;
	//   59   95:astore          6
	//*  60   97:aload_0         
		throw exception;
	//   61   98:monitorexit     
	//   62   99:aload           6
	//   63  101:athrow          
	}

	public boolean peekSample(SampleHolder sampleholder, asHolder asholder)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = queueSize;
	//    2    2:aload_0         
	//    3    3:getfield        #51  <Field int queueSize>
	//    4    6:istore_3        
		if(i != 0)
			break MISSING_BLOCK_LABEL_15;
	//    5    7:iload_3         
	//    6    8:ifne            15
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return false;
	//    9   13:iconst_0        
	//   10   14:ireturn         
		sampleholder.timeUs = timesUs[relativeReadIndex];
	//   11   15:aload_1         
	//   12   16:aload_0         
	//   13   17:getfield        #33  <Field long[] timesUs>
	//   14   20:aload_0         
	//   15   21:getfield        #47  <Field int relativeReadIndex>
	//   16   24:laload          
	//   17   25:putfield        #82  <Field long SampleHolder.timeUs>
		sampleholder.size = sizes[relativeReadIndex];
	//   18   28:aload_1         
	//   19   29:aload_0         
	//   20   30:getfield        #37  <Field int[] sizes>
	//   21   33:aload_0         
	//   22   34:getfield        #47  <Field int relativeReadIndex>
	//   23   37:iaload          
	//   24   38:putfield        #85  <Field int SampleHolder.size>
		sampleholder.flags = flags[relativeReadIndex];
	//   25   41:aload_1         
	//   26   42:aload_0         
	//   27   43:getfield        #35  <Field int[] flags>
	//   28   46:aload_0         
	//   29   47:getfield        #47  <Field int relativeReadIndex>
	//   30   50:iaload          
	//   31   51:putfield        #87  <Field int SampleHolder.flags>
		asholder.offset = offsets[relativeReadIndex];
	//   32   54:aload_2         
	//   33   55:aload_0         
	//   34   56:getfield        #31  <Field long[] offsets>
	//   35   59:aload_0         
	//   36   60:getfield        #47  <Field int relativeReadIndex>
	//   37   63:laload          
	//   38   64:putfield        #92  <Field long RollingSampleBuffer$SampleExtrasHolder.offset>
		asholder.encryptionKeyId = encryptionKeys[relativeReadIndex];
	//   39   67:aload_2         
	//   40   68:aload_0         
	//   41   69:getfield        #41  <Field byte[][] encryptionKeys>
	//   42   72:aload_0         
	//   43   73:getfield        #47  <Field int relativeReadIndex>
	//   44   76:aaload          
	//   45   77:putfield        #95  <Field byte[] RollingSampleBuffer$SampleExtrasHolder.encryptionKeyId>
		this;
	//   46   80:aload_0         
		JVM INSTR monitorexit ;
	//   47   81:monitorexit     
		return true;
	//   48   82:iconst_1        
	//   49   83:ireturn         
		sampleholder;
	//   50   84:astore_1        
	//*  51   85:aload_0         
		throw sampleholder;
	//   52   86:monitorexit     
	//   53   87:aload_1         
	//   54   88:athrow          
	}

	public long skipToKeyframeBefore(long l)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(queueSize == 0 || l < timesUs[relativeReadIndex])
	//*   2    2:aload_0         
	//*   3    3:getfield        #51  <Field int queueSize>
	//*   4    6:ifeq            201
	//*   5    9:lload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #33  <Field long[] timesUs>
	//*   8   14:aload_0         
	//*   9   15:getfield        #47  <Field int relativeReadIndex>
	//*  10   18:laload          
	//*  11   19:lcmp            
	//*  12   20:ifge            26
			break MISSING_BLOCK_LABEL_201;
	//   13   23:goto            201
		int i;
		if(relativeWriteIndex == 0)
	//*  14   26:aload_0         
	//*  15   27:getfield        #49  <Field int relativeWriteIndex>
	//*  16   30:ifne            41
		{
			i = capacity;
	//   17   33:aload_0         
	//   18   34:getfield        #29  <Field int capacity>
	//   19   37:istore_3        
			break MISSING_BLOCK_LABEL_46;
	//   20   38:goto            46
		}
		i = relativeWriteIndex;
	//   21   41:aload_0         
	//   22   42:getfield        #49  <Field int relativeWriteIndex>
	//   23   45:istore_3        
		long l1 = timesUs[i - 1];
	//   24   46:aload_0         
	//   25   47:getfield        #33  <Field long[] timesUs>
	//   26   50:iload_3         
	//   27   51:iconst_1        
	//   28   52:isub            
	//   29   53:laload          
	//   30   54:lstore          6
		if(l <= l1)
			break MISSING_BLOCK_LABEL_69;
	//   31   56:lload_1         
	//   32   57:lload           6
	//   33   59:lcmp            
	//   34   60:ifle            69
		this;
	//   35   63:aload_0         
		JVM INSTR monitorexit ;
	//   36   64:monitorexit     
		return -1L;
	//   37   65:ldc2w           #98  <Long -1L>
	//   38   68:lreturn         
		int j = relativeReadIndex;
	//   39   69:aload_0         
	//   40   70:getfield        #47  <Field int relativeReadIndex>
	//   41   73:istore          4
		int k;
		i = 0;
	//   42   75:iconst_0        
	//   43   76:istore_3        
		k = -1;
	//   44   77:iconst_m1       
	//   45   78:istore          5
_L2:
		if(j == relativeWriteIndex || timesUs[j] > l)
	//*  46   80:iload           4
	//*  47   82:aload_0         
	//*  48   83:getfield        #49  <Field int relativeWriteIndex>
	//*  49   86:icmpeq          137
	//*  50   89:aload_0         
	//*  51   90:getfield        #33  <Field long[] timesUs>
	//*  52   93:iload           4
	//*  53   95:laload          
	//*  54   96:lload_1         
	//*  55   97:lcmp            
	//*  56   98:ifle            104
			break; /* Loop/switch isn't completed */
	//   57  101:goto            137
		if((flags[j] & 1) != 0)
	//*  58  104:aload_0         
	//*  59  105:getfield        #35  <Field int[] flags>
	//*  60  108:iload           4
	//*  61  110:iaload          
	//*  62  111:iconst_1        
	//*  63  112:iand            
	//*  64  113:ifeq            119
			k = i;
	//   65  116:iload_3         
	//   66  117:istore          5
		j = (j + 1) % capacity;
	//   67  119:iload           4
	//   68  121:iconst_1        
	//   69  122:iadd            
	//   70  123:aload_0         
	//   71  124:getfield        #29  <Field int capacity>
	//   72  127:irem            
	//   73  128:istore          4
		i++;
	//   74  130:iload_3         
	//   75  131:iconst_1        
	//   76  132:iadd            
	//   77  133:istore_3        
		if(true) goto _L2; else goto _L1
	//   78  134:goto            80
_L1:
		if(k == -1)
	//*  79  137:iload           5
	//*  80  139:iconst_m1       
	//*  81  140:icmpne          149
	//*  82  143:aload_0         
			return -1L;
	//   83  144:monitorexit     
	//   84  145:ldc2w           #98  <Long -1L>
	//   85  148:lreturn         
		queueSize = queueSize - k;
	//   86  149:aload_0         
	//   87  150:aload_0         
	//   88  151:getfield        #51  <Field int queueSize>
	//   89  154:iload           5
	//   90  156:isub            
	//   91  157:putfield        #51  <Field int queueSize>
		relativeReadIndex = (relativeReadIndex + k) % capacity;
	//   92  160:aload_0         
	//   93  161:aload_0         
	//   94  162:getfield        #47  <Field int relativeReadIndex>
	//   95  165:iload           5
	//   96  167:iadd            
	//   97  168:aload_0         
	//   98  169:getfield        #29  <Field int capacity>
	//   99  172:irem            
	//  100  173:putfield        #47  <Field int relativeReadIndex>
		absoluteReadIndex = absoluteReadIndex + k;
	//  101  176:aload_0         
	//  102  177:aload_0         
	//  103  178:getfield        #45  <Field int absoluteReadIndex>
	//  104  181:iload           5
	//  105  183:iadd            
	//  106  184:putfield        #45  <Field int absoluteReadIndex>
		l = offsets[relativeReadIndex];
	//  107  187:aload_0         
	//  108  188:getfield        #31  <Field long[] offsets>
	//  109  191:aload_0         
	//  110  192:getfield        #47  <Field int relativeReadIndex>
	//  111  195:laload          
	//  112  196:lstore_1        
		this;
	//  113  197:aload_0         
		JVM INSTR monitorexit ;
	//  114  198:monitorexit     
		return l;
	//  115  199:lload_1         
	//  116  200:lreturn         
		this;
	//  117  201:aload_0         
		JVM INSTR monitorexit ;
	//  118  202:monitorexit     
		return -1L;
	//  119  203:ldc2w           #98  <Long -1L>
	//  120  206:lreturn         
		Exception exception;
		exception;
	//  121  207:astore          8
	//* 122  209:aload_0         
		throw exception;
	//  123  210:monitorexit     
	//  124  211:aload           8
	//  125  213:athrow          
	}

	private static final int SAMPLE_CAPACITY_INCREMENT = 1000;
	private int absoluteReadIndex;
	private int capacity;
	private byte encryptionKeys[][];
	private int flags[];
	private long offsets[];
	private int queueSize;
	private int relativeReadIndex;
	private int relativeWriteIndex;
	private int sizes[];
	private long timesUs[];

	public RollingSampleBuffer$InfoQueue()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		capacity = 1000;
	//    2    4:aload_0         
	//    3    5:sipush          1000
	//    4    8:putfield        #29  <Field int capacity>
		int i = capacity;
	//    5   11:aload_0         
	//    6   12:getfield        #29  <Field int capacity>
	//    7   15:istore_1        
		offsets = new long[i];
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:newarray        long[]
	//   11   20:putfield        #31  <Field long[] offsets>
		timesUs = new long[i];
	//   12   23:aload_0         
	//   13   24:iload_1         
	//   14   25:newarray        long[]
	//   15   27:putfield        #33  <Field long[] timesUs>
		flags = new int[i];
	//   16   30:aload_0         
	//   17   31:iload_1         
	//   18   32:newarray        int[]
	//   19   34:putfield        #35  <Field int[] flags>
		sizes = new int[i];
	//   20   37:aload_0         
	//   21   38:iload_1         
	//   22   39:newarray        int[]
	//   23   41:putfield        #37  <Field int[] sizes>
		encryptionKeys = new byte[i][];
	//   24   44:aload_0         
	//   25   45:iload_1         
	//   26   46:anewarray       byte[][]
	//   27   49:putfield        #41  <Field byte[][] encryptionKeys>
	//   28   52:return          
	}
}
