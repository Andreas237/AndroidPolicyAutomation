// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor;

import com.google.android.exoplayer.CryptoInfo;
import com.google.android.exoplayer.SampleHolder;
import com.google.android.exoplayer.upstream.*;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.ParsableByteArray;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;

// Referenced classes of package com.google.android.exoplayer.extractor:
//			ExtractorInput

final class RollingSampleBuffer
{
	private static final class InfoQueue
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

		public boolean peekSample(SampleHolder sampleholder, SampleExtrasHolder sampleextrasholder)
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
			sampleextrasholder.offset = offsets[relativeReadIndex];
		//   32   54:aload_2         
		//   33   55:aload_0         
		//   34   56:getfield        #31  <Field long[] offsets>
		//   35   59:aload_0         
		//   36   60:getfield        #47  <Field int relativeReadIndex>
		//   37   63:laload          
		//   38   64:putfield        #92  <Field long RollingSampleBuffer$SampleExtrasHolder.offset>
			sampleextrasholder.encryptionKeyId = encryptionKeys[relativeReadIndex];
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

		public InfoQueue()
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

	private static final class SampleExtrasHolder
	{

		public byte encryptionKeyId[];
		public long offset;

		private SampleExtrasHolder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:return          
		}

	}


	public RollingSampleBuffer(Allocator allocator1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		allocator = allocator1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #40  <Field Allocator allocator>
		allocationLength = allocator1.getIndividualAllocationLength();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokeinterface #46  <Method int Allocator.getIndividualAllocationLength()>
	//    8   16:putfield        #48  <Field int allocationLength>
	//    9   19:aload_0         
	//   10   20:new             #8   <Class RollingSampleBuffer$InfoQueue>
	//   11   23:dup             
	//   12   24:invokespecial   #49  <Method void RollingSampleBuffer$InfoQueue()>
	//   13   27:putfield        #51  <Field RollingSampleBuffer$InfoQueue infoQueue>
	//   14   30:aload_0         
	//   15   31:new             #53  <Class LinkedBlockingDeque>
	//   16   34:dup             
	//   17   35:invokespecial   #54  <Method void LinkedBlockingDeque()>
	//   18   38:putfield        #56  <Field LinkedBlockingDeque dataQueue>
	//   19   41:aload_0         
	//   20   42:new             #11  <Class RollingSampleBuffer$SampleExtrasHolder>
	//   21   45:dup             
	//   22   46:aconst_null     
	//   23   47:invokespecial   #59  <Method void RollingSampleBuffer$SampleExtrasHolder(RollingSampleBuffer$1)>
	//   24   50:putfield        #61  <Field RollingSampleBuffer$SampleExtrasHolder extrasHolder>
	//   25   53:aload_0         
	//   26   54:new             #63  <Class ParsableByteArray>
	//   27   57:dup             
	//   28   58:bipush          32
	//   29   60:invokespecial   #66  <Method void ParsableByteArray(int)>
	//   30   63:putfield        #68  <Field ParsableByteArray scratch>
		lastAllocationOffset = allocationLength;
	//   31   66:aload_0         
	//   32   67:aload_0         
	//   33   68:getfield        #48  <Field int allocationLength>
	//   34   71:putfield        #70  <Field int lastAllocationOffset>
	//   35   74:return          
	}

	private void dropDownstreamTo(long l)
	{
		int j = (int)(l - totalBytesDropped) / allocationLength;
	//    0    0:lload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #75  <Field long totalBytesDropped>
	//    3    5:lsub            
	//    4    6:l2i             
	//    5    7:aload_0         
	//    6    8:getfield        #48  <Field int allocationLength>
	//    7   11:idiv            
	//    8   12:istore          4
		for(int i = 0; i < j; i++)
	//*   9   14:iconst_0        
	//*  10   15:istore_3        
	//*  11   16:iload_3         
	//*  12   17:iload           4
	//*  13   19:icmpge          62
		{
			allocator.release((Allocation)dataQueue.remove());
	//   14   22:aload_0         
	//   15   23:getfield        #40  <Field Allocator allocator>
	//   16   26:aload_0         
	//   17   27:getfield        #56  <Field LinkedBlockingDeque dataQueue>
	//   18   30:invokevirtual   #79  <Method Object LinkedBlockingDeque.remove()>
	//   19   33:checkcast       #81  <Class Allocation>
	//   20   36:invokeinterface #85  <Method void Allocator.release(Allocation)>
			totalBytesDropped = totalBytesDropped + (long)allocationLength;
	//   21   41:aload_0         
	//   22   42:aload_0         
	//   23   43:getfield        #75  <Field long totalBytesDropped>
	//   24   46:aload_0         
	//   25   47:getfield        #48  <Field int allocationLength>
	//   26   50:i2l             
	//   27   51:ladd            
	//   28   52:putfield        #75  <Field long totalBytesDropped>
		}

	//   29   55:iload_3         
	//   30   56:iconst_1        
	//   31   57:iadd            
	//   32   58:istore_3        
	//*  33   59:goto            16
	//   34   62:return          
	}

	private void dropUpstreamFrom(long l)
	{
		int j = (int)(l - totalBytesDropped);
	//    0    0:lload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #75  <Field long totalBytesDropped>
	//    3    5:lsub            
	//    4    6:l2i             
	//    5    7:istore          4
		int i1 = allocationLength;
	//    6    9:aload_0         
	//    7   10:getfield        #48  <Field int allocationLength>
	//    8   13:istore          5
		int i = j / i1;
	//    9   15:iload           4
	//   10   17:iload           5
	//   11   19:idiv            
	//   12   20:istore_3        
		i1 = j % i1;
	//   13   21:iload           4
	//   14   23:iload           5
	//   15   25:irem            
	//   16   26:istore          5
		j = dataQueue.size() - i - 1;
	//   17   28:aload_0         
	//   18   29:getfield        #56  <Field LinkedBlockingDeque dataQueue>
	//   19   32:invokevirtual   #89  <Method int LinkedBlockingDeque.size()>
	//   20   35:iload_3         
	//   21   36:isub            
	//   22   37:iconst_1        
	//   23   38:isub            
	//   24   39:istore          4
		i = j;
	//   25   41:iload           4
	//   26   43:istore_3        
		if(i1 == 0)
	//*  27   44:iload           5
	//*  28   46:ifne            54
			i = j + 1;
	//   29   49:iload           4
	//   30   51:iconst_1        
	//   31   52:iadd            
	//   32   53:istore_3        
		for(int k = 0; k < i; k++)
	//*  33   54:iconst_0        
	//*  34   55:istore          4
	//*  35   57:iload           4
	//*  36   59:iload_3         
	//*  37   60:icmpge          91
			allocator.release((Allocation)dataQueue.removeLast());
	//   38   63:aload_0         
	//   39   64:getfield        #40  <Field Allocator allocator>
	//   40   67:aload_0         
	//   41   68:getfield        #56  <Field LinkedBlockingDeque dataQueue>
	//   42   71:invokevirtual   #92  <Method Object LinkedBlockingDeque.removeLast()>
	//   43   74:checkcast       #81  <Class Allocation>
	//   44   77:invokeinterface #85  <Method void Allocator.release(Allocation)>

	//   45   82:iload           4
	//   46   84:iconst_1        
	//   47   85:iadd            
	//   48   86:istore          4
	//*  49   88:goto            57
		lastAllocation = (Allocation)dataQueue.peekLast();
	//   50   91:aload_0         
	//   51   92:aload_0         
	//   52   93:getfield        #56  <Field LinkedBlockingDeque dataQueue>
	//   53   96:invokevirtual   #95  <Method Object LinkedBlockingDeque.peekLast()>
	//   54   99:checkcast       #81  <Class Allocation>
	//   55  102:putfield        #97  <Field Allocation lastAllocation>
		i = i1;
	//   56  105:iload           5
	//   57  107:istore_3        
		if(i1 == 0)
	//*  58  108:iload           5
	//*  59  110:ifne            118
			i = allocationLength;
	//   60  113:aload_0         
	//   61  114:getfield        #48  <Field int allocationLength>
	//   62  117:istore_3        
		lastAllocationOffset = i;
	//   63  118:aload_0         
	//   64  119:iload_3         
	//   65  120:putfield        #70  <Field int lastAllocationOffset>
	//   66  123:return          
	}

	private static void ensureCapacity(ParsableByteArray parsablebytearray, int i)
	{
		if(parsablebytearray.limit() < i)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #102 <Method int ParsableByteArray.limit()>
	//*   2    4:iload_1         
	//*   3    5:icmpge          16
			parsablebytearray.reset(new byte[i], i);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:newarray        byte[]
	//    7   12:iload_1         
	//    8   13:invokevirtual   #106 <Method void ParsableByteArray.reset(byte[], int)>
	//    9   16:return          
	}

	private int prepareForAppend(int i)
	{
		if(lastAllocationOffset == allocationLength)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field int lastAllocationOffset>
	//*   2    4:aload_0         
	//*   3    5:getfield        #48  <Field int allocationLength>
	//*   4    8:icmpne          41
		{
			lastAllocationOffset = 0;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #70  <Field int lastAllocationOffset>
			lastAllocation = allocator.allocate();
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #40  <Field Allocator allocator>
	//   11   21:invokeinterface #112 <Method Allocation Allocator.allocate()>
	//   12   26:putfield        #97  <Field Allocation lastAllocation>
			dataQueue.add(((Object) (lastAllocation)));
	//   13   29:aload_0         
	//   14   30:getfield        #56  <Field LinkedBlockingDeque dataQueue>
	//   15   33:aload_0         
	//   16   34:getfield        #97  <Field Allocation lastAllocation>
	//   17   37:invokevirtual   #116 <Method boolean LinkedBlockingDeque.add(Object)>
	//   18   40:pop             
		}
		return Math.min(i, allocationLength - lastAllocationOffset);
	//   19   41:iload_1         
	//   20   42:aload_0         
	//   21   43:getfield        #48  <Field int allocationLength>
	//   22   46:aload_0         
	//   23   47:getfield        #70  <Field int lastAllocationOffset>
	//   24   50:isub            
	//   25   51:invokestatic    #122 <Method int Math.min(int, int)>
	//   26   54:ireturn         
	}

	private void readData(long l, ByteBuffer bytebuffer, int i)
	{
		int k;
		for(; i > 0; i -= k)
	//*   0    0:iload           4
	//*   1    2:ifle            80
		{
			dropDownstreamTo(l);
	//    2    5:aload_0         
	//    3    6:lload_1         
	//    4    7:invokespecial   #126 <Method void dropDownstreamTo(long)>
			int j = (int)(l - totalBytesDropped);
	//    5   10:lload_1         
	//    6   11:aload_0         
	//    7   12:getfield        #75  <Field long totalBytesDropped>
	//    8   15:lsub            
	//    9   16:l2i             
	//   10   17:istore          5
			k = Math.min(i, allocationLength - j);
	//   11   19:iload           4
	//   12   21:aload_0         
	//   13   22:getfield        #48  <Field int allocationLength>
	//   14   25:iload           5
	//   15   27:isub            
	//   16   28:invokestatic    #122 <Method int Math.min(int, int)>
	//   17   31:istore          6
			Allocation allocation = (Allocation)dataQueue.peek();
	//   18   33:aload_0         
	//   19   34:getfield        #56  <Field LinkedBlockingDeque dataQueue>
	//   20   37:invokevirtual   #129 <Method Object LinkedBlockingDeque.peek()>
	//   21   40:checkcast       #81  <Class Allocation>
	//   22   43:astore          7
			bytebuffer.put(allocation.data, allocation.translateOffset(j), k);
	//   23   45:aload_3         
	//   24   46:aload           7
	//   25   48:getfield        #133 <Field byte[] Allocation.data>
	//   26   51:aload           7
	//   27   53:iload           5
	//   28   55:invokevirtual   #136 <Method int Allocation.translateOffset(int)>
	//   29   58:iload           6
	//   30   60:invokevirtual   #142 <Method ByteBuffer ByteBuffer.put(byte[], int, int)>
	//   31   63:pop             
			l += k;
	//   32   64:lload_1         
	//   33   65:iload           6
	//   34   67:i2l             
	//   35   68:ladd            
	//   36   69:lstore_1        
		}

	//   37   70:iload           4
	//   38   72:iload           6
	//   39   74:isub            
	//   40   75:istore          4
	//*  41   77:goto            0
	//   42   80:return          
	}

	private void readData(long l, byte abyte0[], int i)
	{
		int i1;
		for(int j = 0; j < i; j += i1)
	//*   0    0:iconst_0        
	//*   1    1:istore          5
	//*   2    3:iload           5
	//*   3    5:iload           4
	//*   4    7:icmpge          89
		{
			dropDownstreamTo(l);
	//    5   10:aload_0         
	//    6   11:lload_1         
	//    7   12:invokespecial   #126 <Method void dropDownstreamTo(long)>
			int k = (int)(l - totalBytesDropped);
	//    8   15:lload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #75  <Field long totalBytesDropped>
	//   11   20:lsub            
	//   12   21:l2i             
	//   13   22:istore          6
			i1 = Math.min(i - j, allocationLength - k);
	//   14   24:iload           4
	//   15   26:iload           5
	//   16   28:isub            
	//   17   29:aload_0         
	//   18   30:getfield        #48  <Field int allocationLength>
	//   19   33:iload           6
	//   20   35:isub            
	//   21   36:invokestatic    #122 <Method int Math.min(int, int)>
	//   22   39:istore          7
			Allocation allocation = (Allocation)dataQueue.peek();
	//   23   41:aload_0         
	//   24   42:getfield        #56  <Field LinkedBlockingDeque dataQueue>
	//   25   45:invokevirtual   #129 <Method Object LinkedBlockingDeque.peek()>
	//   26   48:checkcast       #81  <Class Allocation>
	//   27   51:astore          8
			System.arraycopy(((Object) (allocation.data)), allocation.translateOffset(k), ((Object) (abyte0)), j, i1);
	//   28   53:aload           8
	//   29   55:getfield        #133 <Field byte[] Allocation.data>
	//   30   58:aload           8
	//   31   60:iload           6
	//   32   62:invokevirtual   #136 <Method int Allocation.translateOffset(int)>
	//   33   65:aload_3         
	//   34   66:iload           5
	//   35   68:iload           7
	//   36   70:invokestatic    #149 <Method void System.arraycopy(Object, int, Object, int, int)>
			l += i1;
	//   37   73:lload_1         
	//   38   74:iload           7
	//   39   76:i2l             
	//   40   77:ladd            
	//   41   78:lstore_1        
		}

	//   42   79:iload           5
	//   43   81:iload           7
	//   44   83:iadd            
	//   45   84:istore          5
	//*  46   86:goto            3
	//   47   89:return          
	}

	private void readEncryptionData(SampleHolder sampleholder, SampleExtrasHolder sampleextrasholder)
	{
		long l = sampleextrasholder.offset;
	//    0    0:aload_2         
	//    1    1:getfield        #154 <Field long RollingSampleBuffer$SampleExtrasHolder.offset>
	//    2    4:lstore          6
		readData(l, scratch.data, 1);
	//    3    6:aload_0         
	//    4    7:lload           6
	//    5    9:aload_0         
	//    6   10:getfield        #68  <Field ParsableByteArray scratch>
	//    7   13:getfield        #155 <Field byte[] ParsableByteArray.data>
	//    8   16:iconst_1        
	//    9   17:invokespecial   #157 <Method void readData(long, byte[], int)>
		l++;
	//   10   20:lload           6
	//   11   22:lconst_1        
	//   12   23:ladd            
	//   13   24:lstore          6
		int ai[] = ((int []) (scratch.data));
	//   14   26:aload_0         
	//   15   27:getfield        #68  <Field ParsableByteArray scratch>
	//   16   30:getfield        #155 <Field byte[] ParsableByteArray.data>
	//   17   33:astore          10
		boolean flag1 = false;
	//   18   35:iconst_0        
	//   19   36:istore          5
		int k = ((int) (ai[0]));
	//   20   38:aload           10
	//   21   40:iconst_0        
	//   22   41:baload          
	//   23   42:istore          4
		boolean flag;
		if((k & 0x80) != 0)
	//*  24   44:iload           4
	//*  25   46:sipush          128
	//*  26   49:iand            
	//*  27   50:ifeq            58
			flag = true;
	//   28   53:iconst_1        
	//   29   54:istore_3        
		else
	//*  30   55:goto            60
			flag = false;
	//   31   58:iconst_0        
	//   32   59:istore_3        
		k &= 0x7f;
	//   33   60:iload           4
	//   34   62:bipush          127
	//   35   64:iand            
	//   36   65:istore          4
		if(sampleholder.cryptoInfo.iv == null)
	//*  37   67:aload_1         
	//*  38   68:getfield        #163 <Field CryptoInfo SampleHolder.cryptoInfo>
	//*  39   71:getfield        #168 <Field byte[] CryptoInfo.iv>
	//*  40   74:ifnonnull       88
			sampleholder.cryptoInfo.iv = new byte[16];
	//   41   77:aload_1         
	//   42   78:getfield        #163 <Field CryptoInfo SampleHolder.cryptoInfo>
	//   43   81:bipush          16
	//   44   83:newarray        byte[]
	//   45   85:putfield        #168 <Field byte[] CryptoInfo.iv>
		readData(l, sampleholder.cryptoInfo.iv, k);
	//   46   88:aload_0         
	//   47   89:lload           6
	//   48   91:aload_1         
	//   49   92:getfield        #163 <Field CryptoInfo SampleHolder.cryptoInfo>
	//   50   95:getfield        #168 <Field byte[] CryptoInfo.iv>
	//   51   98:iload           4
	//   52  100:invokespecial   #157 <Method void readData(long, byte[], int)>
		l += k;
	//   53  103:lload           6
	//   54  105:iload           4
	//   55  107:i2l             
	//   56  108:ladd            
	//   57  109:lstore          6
		if(flag)
	//*  58  111:iload_3         
	//*  59  112:ifeq            157
		{
			readData(l, scratch.data, 2);
	//   60  115:aload_0         
	//   61  116:lload           6
	//   62  118:aload_0         
	//   63  119:getfield        #68  <Field ParsableByteArray scratch>
	//   64  122:getfield        #155 <Field byte[] ParsableByteArray.data>
	//   65  125:iconst_2        
	//   66  126:invokespecial   #157 <Method void readData(long, byte[], int)>
			l += 2L;
	//   67  129:lload           6
	//   68  131:ldc2w           #169 <Long 2L>
	//   69  134:ladd            
	//   70  135:lstore          6
			scratch.setPosition(0);
	//   71  137:aload_0         
	//   72  138:getfield        #68  <Field ParsableByteArray scratch>
	//   73  141:iconst_0        
	//   74  142:invokevirtual   #173 <Method void ParsableByteArray.setPosition(int)>
			k = scratch.readUnsignedShort();
	//   75  145:aload_0         
	//   76  146:getfield        #68  <Field ParsableByteArray scratch>
	//   77  149:invokevirtual   #176 <Method int ParsableByteArray.readUnsignedShort()>
	//   78  152:istore          4
		} else
	//*  79  154:goto            160
		{
			k = 1;
	//   80  157:iconst_1        
	//   81  158:istore          4
		}
		ai = sampleholder.cryptoInfo.numBytesOfClearData;
	//   82  160:aload_1         
	//   83  161:getfield        #163 <Field CryptoInfo SampleHolder.cryptoInfo>
	//   84  164:getfield        #180 <Field int[] CryptoInfo.numBytesOfClearData>
	//   85  167:astore          10
		if(ai == null || ai.length < k)
	//*  86  169:aload           10
	//*  87  171:ifnull          188
	//*  88  174:aload           10
	//*  89  176:arraylength     
	//*  90  177:iload           4
	//*  91  179:icmpge          185
	//*  92  182:goto            188
	//*  93  185:goto            194
			ai = new int[k];
	//   94  188:iload           4
	//   95  190:newarray        int[]
	//   96  192:astore          10
		int ai1[] = sampleholder.cryptoInfo.numBytesOfEncryptedData;
	//   97  194:aload_1         
	//   98  195:getfield        #163 <Field CryptoInfo SampleHolder.cryptoInfo>
	//   99  198:getfield        #183 <Field int[] CryptoInfo.numBytesOfEncryptedData>
	//  100  201:astore          11
		if(ai1 == null || ai1.length < k)
	//* 101  203:aload           11
	//* 102  205:ifnull          222
	//* 103  208:aload           11
	//* 104  210:arraylength     
	//* 105  211:iload           4
	//* 106  213:icmpge          219
	//* 107  216:goto            222
	//* 108  219:goto            228
			ai1 = new int[k];
	//  109  222:iload           4
	//  110  224:newarray        int[]
	//  111  226:astore          11
		if(flag)
	//* 112  228:iload_3         
	//* 113  229:ifeq            317
		{
			int i = k * 6;
	//  114  232:iload           4
	//  115  234:bipush          6
	//  116  236:imul            
	//  117  237:istore_3        
			ensureCapacity(scratch, i);
	//  118  238:aload_0         
	//  119  239:getfield        #68  <Field ParsableByteArray scratch>
	//  120  242:iload_3         
	//  121  243:invokestatic    #185 <Method void ensureCapacity(ParsableByteArray, int)>
			readData(l, scratch.data, i);
	//  122  246:aload_0         
	//  123  247:lload           6
	//  124  249:aload_0         
	//  125  250:getfield        #68  <Field ParsableByteArray scratch>
	//  126  253:getfield        #155 <Field byte[] ParsableByteArray.data>
	//  127  256:iload_3         
	//  128  257:invokespecial   #157 <Method void readData(long, byte[], int)>
			long l1 = l + (long)i;
	//  129  260:lload           6
	//  130  262:iload_3         
	//  131  263:i2l             
	//  132  264:ladd            
	//  133  265:lstore          8
			scratch.setPosition(0);
	//  134  267:aload_0         
	//  135  268:getfield        #68  <Field ParsableByteArray scratch>
	//  136  271:iconst_0        
	//  137  272:invokevirtual   #173 <Method void ParsableByteArray.setPosition(int)>
			i = ((int) (flag1));
	//  138  275:iload           5
	//  139  277:istore_3        
			do
			{
				l = l1;
	//  140  278:lload           8
	//  141  280:lstore          6
				if(i >= k)
					break;
	//  142  282:iload_3         
	//  143  283:iload           4
	//  144  285:icmpge          339
				ai[i] = scratch.readUnsignedShort();
	//  145  288:aload           10
	//  146  290:iload_3         
	//  147  291:aload_0         
	//  148  292:getfield        #68  <Field ParsableByteArray scratch>
	//  149  295:invokevirtual   #176 <Method int ParsableByteArray.readUnsignedShort()>
	//  150  298:iastore         
				ai1[i] = scratch.readUnsignedIntToInt();
	//  151  299:aload           11
	//  152  301:iload_3         
	//  153  302:aload_0         
	//  154  303:getfield        #68  <Field ParsableByteArray scratch>
	//  155  306:invokevirtual   #188 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  156  309:iastore         
				i++;
	//  157  310:iload_3         
	//  158  311:iconst_1        
	//  159  312:iadd            
	//  160  313:istore_3        
			} while(true);
	//  161  314:goto            278
		} else
		{
			ai[0] = 0;
	//  162  317:aload           10
	//  163  319:iconst_0        
	//  164  320:iconst_0        
	//  165  321:iastore         
			ai1[0] = sampleholder.size - (int)(l - sampleextrasholder.offset);
	//  166  322:aload           11
	//  167  324:iconst_0        
	//  168  325:aload_1         
	//  169  326:getfield        #190 <Field int SampleHolder.size>
	//  170  329:lload           6
	//  171  331:aload_2         
	//  172  332:getfield        #154 <Field long RollingSampleBuffer$SampleExtrasHolder.offset>
	//  173  335:lsub            
	//  174  336:l2i             
	//  175  337:isub            
	//  176  338:iastore         
		}
		sampleholder.cryptoInfo.set(k, ai, ai1, sampleextrasholder.encryptionKeyId, sampleholder.cryptoInfo.iv, 1);
	//  177  339:aload_1         
	//  178  340:getfield        #163 <Field CryptoInfo SampleHolder.cryptoInfo>
	//  179  343:iload           4
	//  180  345:aload           10
	//  181  347:aload           11
	//  182  349:aload_2         
	//  183  350:getfield        #193 <Field byte[] RollingSampleBuffer$SampleExtrasHolder.encryptionKeyId>
	//  184  353:aload_1         
	//  185  354:getfield        #163 <Field CryptoInfo SampleHolder.cryptoInfo>
	//  186  357:getfield        #168 <Field byte[] CryptoInfo.iv>
	//  187  360:iconst_1        
	//  188  361:invokevirtual   #197 <Method void CryptoInfo.set(int, int[], int[], byte[], byte[], int)>
		int j = (int)(l - sampleextrasholder.offset);
	//  189  364:lload           6
	//  190  366:aload_2         
	//  191  367:getfield        #154 <Field long RollingSampleBuffer$SampleExtrasHolder.offset>
	//  192  370:lsub            
	//  193  371:l2i             
	//  194  372:istore_3        
		sampleextrasholder.offset = sampleextrasholder.offset + (long)j;
	//  195  373:aload_2         
	//  196  374:aload_2         
	//  197  375:getfield        #154 <Field long RollingSampleBuffer$SampleExtrasHolder.offset>
	//  198  378:iload_3         
	//  199  379:i2l             
	//  200  380:ladd            
	//  201  381:putfield        #154 <Field long RollingSampleBuffer$SampleExtrasHolder.offset>
		sampleholder.size = sampleholder.size - j;
	//  202  384:aload_1         
	//  203  385:aload_1         
	//  204  386:getfield        #190 <Field int SampleHolder.size>
	//  205  389:iload_3         
	//  206  390:isub            
	//  207  391:putfield        #190 <Field int SampleHolder.size>
	//  208  394:return          
	}

	public int appendData(ExtractorInput extractorinput, int i, boolean flag)
		throws IOException, InterruptedException
	{
		i = prepareForAppend(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokespecial   #205 <Method int prepareForAppend(int)>
	//    3    5:istore_2        
		i = extractorinput.read(lastAllocation.data, lastAllocation.translateOffset(lastAllocationOffset), i);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #97  <Field Allocation lastAllocation>
	//    7   11:getfield        #133 <Field byte[] Allocation.data>
	//    8   14:aload_0         
	//    9   15:getfield        #97  <Field Allocation lastAllocation>
	//   10   18:aload_0         
	//   11   19:getfield        #70  <Field int lastAllocationOffset>
	//   12   22:invokevirtual   #136 <Method int Allocation.translateOffset(int)>
	//   13   25:iload_2         
	//   14   26:invokeinterface #211 <Method int ExtractorInput.read(byte[], int, int)>
	//   15   31:istore_2        
		if(i == -1)
	//*  16   32:iload_2         
	//*  17   33:iconst_m1       
	//*  18   34:icmpne          51
		{
			if(flag)
	//*  19   37:iload_3         
	//*  20   38:ifeq            43
				return -1;
	//   21   41:iconst_m1       
	//   22   42:ireturn         
			else
				throw new EOFException();
	//   23   43:new             #213 <Class EOFException>
	//   24   46:dup             
	//   25   47:invokespecial   #214 <Method void EOFException()>
	//   26   50:athrow          
		} else
		{
			lastAllocationOffset = lastAllocationOffset + i;
	//   27   51:aload_0         
	//   28   52:aload_0         
	//   29   53:getfield        #70  <Field int lastAllocationOffset>
	//   30   56:iload_2         
	//   31   57:iadd            
	//   32   58:putfield        #70  <Field int lastAllocationOffset>
			totalBytesWritten = totalBytesWritten + (long)i;
	//   33   61:aload_0         
	//   34   62:aload_0         
	//   35   63:getfield        #216 <Field long totalBytesWritten>
	//   36   66:iload_2         
	//   37   67:i2l             
	//   38   68:ladd            
	//   39   69:putfield        #216 <Field long totalBytesWritten>
			return i;
	//   40   72:iload_2         
	//   41   73:ireturn         
		}
	}

	public int appendData(DataSource datasource, int i, boolean flag)
		throws IOException
	{
		i = prepareForAppend(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokespecial   #205 <Method int prepareForAppend(int)>
	//    3    5:istore_2        
		i = datasource.read(lastAllocation.data, lastAllocation.translateOffset(lastAllocationOffset), i);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #97  <Field Allocation lastAllocation>
	//    7   11:getfield        #133 <Field byte[] Allocation.data>
	//    8   14:aload_0         
	//    9   15:getfield        #97  <Field Allocation lastAllocation>
	//   10   18:aload_0         
	//   11   19:getfield        #70  <Field int lastAllocationOffset>
	//   12   22:invokevirtual   #136 <Method int Allocation.translateOffset(int)>
	//   13   25:iload_2         
	//   14   26:invokeinterface #221 <Method int DataSource.read(byte[], int, int)>
	//   15   31:istore_2        
		if(i == -1)
	//*  16   32:iload_2         
	//*  17   33:iconst_m1       
	//*  18   34:icmpne          51
		{
			if(flag)
	//*  19   37:iload_3         
	//*  20   38:ifeq            43
				return -1;
	//   21   41:iconst_m1       
	//   22   42:ireturn         
			else
				throw new EOFException();
	//   23   43:new             #213 <Class EOFException>
	//   24   46:dup             
	//   25   47:invokespecial   #214 <Method void EOFException()>
	//   26   50:athrow          
		} else
		{
			lastAllocationOffset = lastAllocationOffset + i;
	//   27   51:aload_0         
	//   28   52:aload_0         
	//   29   53:getfield        #70  <Field int lastAllocationOffset>
	//   30   56:iload_2         
	//   31   57:iadd            
	//   32   58:putfield        #70  <Field int lastAllocationOffset>
			totalBytesWritten = totalBytesWritten + (long)i;
	//   33   61:aload_0         
	//   34   62:aload_0         
	//   35   63:getfield        #216 <Field long totalBytesWritten>
	//   36   66:iload_2         
	//   37   67:i2l             
	//   38   68:ladd            
	//   39   69:putfield        #216 <Field long totalBytesWritten>
			return i;
	//   40   72:iload_2         
	//   41   73:ireturn         
		}
	}

	public void appendData(ParsableByteArray parsablebytearray, int i)
	{
		int j;
		for(; i > 0; i -= j)
	//*   0    0:iload_2         
	//*   1    1:ifle            61
		{
			j = prepareForAppend(i);
	//    2    4:aload_0         
	//    3    5:iload_2         
	//    4    6:invokespecial   #205 <Method int prepareForAppend(int)>
	//    5    9:istore_3        
			parsablebytearray.readBytes(lastAllocation.data, lastAllocation.translateOffset(lastAllocationOffset), j);
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:getfield        #97  <Field Allocation lastAllocation>
	//    9   15:getfield        #133 <Field byte[] Allocation.data>
	//   10   18:aload_0         
	//   11   19:getfield        #97  <Field Allocation lastAllocation>
	//   12   22:aload_0         
	//   13   23:getfield        #70  <Field int lastAllocationOffset>
	//   14   26:invokevirtual   #136 <Method int Allocation.translateOffset(int)>
	//   15   29:iload_3         
	//   16   30:invokevirtual   #225 <Method void ParsableByteArray.readBytes(byte[], int, int)>
			lastAllocationOffset = lastAllocationOffset + j;
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:getfield        #70  <Field int lastAllocationOffset>
	//   20   38:iload_3         
	//   21   39:iadd            
	//   22   40:putfield        #70  <Field int lastAllocationOffset>
			totalBytesWritten = totalBytesWritten + (long)j;
	//   23   43:aload_0         
	//   24   44:aload_0         
	//   25   45:getfield        #216 <Field long totalBytesWritten>
	//   26   48:iload_3         
	//   27   49:i2l             
	//   28   50:ladd            
	//   29   51:putfield        #216 <Field long totalBytesWritten>
		}

	//   30   54:iload_2         
	//   31   55:iload_3         
	//   32   56:isub            
	//   33   57:istore_2        
	//*  34   58:goto            0
	//   35   61:return          
	}

	public void clear()
	{
		infoQueue.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field RollingSampleBuffer$InfoQueue infoQueue>
	//    2    4:invokevirtual   #228 <Method void RollingSampleBuffer$InfoQueue.clear()>
		Allocator allocator1 = allocator;
	//    3    7:aload_0         
	//    4    8:getfield        #40  <Field Allocator allocator>
	//    5   11:astore_1        
		LinkedBlockingDeque linkedblockingdeque = dataQueue;
	//    6   12:aload_0         
	//    7   13:getfield        #56  <Field LinkedBlockingDeque dataQueue>
	//    8   16:astore_2        
		allocator1.release((Allocation[])linkedblockingdeque.toArray(((Object []) (new Allocation[linkedblockingdeque.size()]))));
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #89  <Method int LinkedBlockingDeque.size()>
	//   13   23:anewarray       Allocation[]
	//   14   26:invokevirtual   #232 <Method Object[] LinkedBlockingDeque.toArray(Object[])>
	//   15   29:checkcast       #234 <Class Allocation[]>
	//   16   32:invokeinterface #237 <Method void Allocator.release(Allocation[])>
		dataQueue.clear();
	//   17   37:aload_0         
	//   18   38:getfield        #56  <Field LinkedBlockingDeque dataQueue>
	//   19   41:invokevirtual   #238 <Method void LinkedBlockingDeque.clear()>
		totalBytesDropped = 0L;
	//   20   44:aload_0         
	//   21   45:lconst_0        
	//   22   46:putfield        #75  <Field long totalBytesDropped>
		totalBytesWritten = 0L;
	//   23   49:aload_0         
	//   24   50:lconst_0        
	//   25   51:putfield        #216 <Field long totalBytesWritten>
		lastAllocation = null;
	//   26   54:aload_0         
	//   27   55:aconst_null     
	//   28   56:putfield        #97  <Field Allocation lastAllocation>
		lastAllocationOffset = allocationLength;
	//   29   59:aload_0         
	//   30   60:aload_0         
	//   31   61:getfield        #48  <Field int allocationLength>
	//   32   64:putfield        #70  <Field int lastAllocationOffset>
	//   33   67:return          
	}

	public void commitSample(long l, int i, long l1, int j, byte abyte0[])
	{
		infoQueue.commitSample(l, i, l1, j, abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field RollingSampleBuffer$InfoQueue infoQueue>
	//    2    4:lload_1         
	//    3    5:iload_3         
	//    4    6:lload           4
	//    5    8:iload           6
	//    6   10:aload           7
	//    7   12:invokevirtual   #242 <Method void RollingSampleBuffer$InfoQueue.commitSample(long, int, long, int, byte[])>
	//    8   15:return          
	}

	public void discardUpstreamSamples(int i)
	{
		totalBytesWritten = infoQueue.discardUpstreamSamples(i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #51  <Field RollingSampleBuffer$InfoQueue infoQueue>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #246 <Method long RollingSampleBuffer$InfoQueue.discardUpstreamSamples(int)>
	//    5    9:putfield        #216 <Field long totalBytesWritten>
		dropUpstreamFrom(totalBytesWritten);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #216 <Field long totalBytesWritten>
	//    9   17:invokespecial   #248 <Method void dropUpstreamFrom(long)>
	//   10   20:return          
	}

	public int getReadIndex()
	{
		return infoQueue.getReadIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field RollingSampleBuffer$InfoQueue infoQueue>
	//    2    4:invokevirtual   #251 <Method int RollingSampleBuffer$InfoQueue.getReadIndex()>
	//    3    7:ireturn         
	}

	public int getWriteIndex()
	{
		return infoQueue.getWriteIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field RollingSampleBuffer$InfoQueue infoQueue>
	//    2    4:invokevirtual   #254 <Method int RollingSampleBuffer$InfoQueue.getWriteIndex()>
	//    3    7:ireturn         
	}

	public long getWritePosition()
	{
		return totalBytesWritten;
	//    0    0:aload_0         
	//    1    1:getfield        #216 <Field long totalBytesWritten>
	//    2    4:lreturn         
	}

	public boolean peekSample(SampleHolder sampleholder)
	{
		return infoQueue.peekSample(sampleholder, extrasHolder);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field RollingSampleBuffer$InfoQueue infoQueue>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #61  <Field RollingSampleBuffer$SampleExtrasHolder extrasHolder>
	//    5    9:invokevirtual   #261 <Method boolean RollingSampleBuffer$InfoQueue.peekSample(SampleHolder, RollingSampleBuffer$SampleExtrasHolder)>
	//    6   12:ireturn         
	}

	public boolean readSample(SampleHolder sampleholder)
	{
		if(!infoQueue.peekSample(sampleholder, extrasHolder))
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field RollingSampleBuffer$InfoQueue infoQueue>
	//*   2    4:aload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #61  <Field RollingSampleBuffer$SampleExtrasHolder extrasHolder>
	//*   5    9:invokevirtual   #261 <Method boolean RollingSampleBuffer$InfoQueue.peekSample(SampleHolder, RollingSampleBuffer$SampleExtrasHolder)>
	//*   6   12:ifne            17
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
		if(sampleholder.isEncrypted())
	//*   9   17:aload_1         
	//*  10   18:invokevirtual   #266 <Method boolean SampleHolder.isEncrypted()>
	//*  11   21:ifeq            33
			readEncryptionData(sampleholder, extrasHolder);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #61  <Field RollingSampleBuffer$SampleExtrasHolder extrasHolder>
	//   16   30:invokespecial   #268 <Method void readEncryptionData(SampleHolder, RollingSampleBuffer$SampleExtrasHolder)>
		sampleholder.ensureSpaceForWrite(sampleholder.size);
	//   17   33:aload_1         
	//   18   34:aload_1         
	//   19   35:getfield        #190 <Field int SampleHolder.size>
	//   20   38:invokevirtual   #271 <Method void SampleHolder.ensureSpaceForWrite(int)>
		readData(extrasHolder.offset, sampleholder.data, sampleholder.size);
	//   21   41:aload_0         
	//   22   42:aload_0         
	//   23   43:getfield        #61  <Field RollingSampleBuffer$SampleExtrasHolder extrasHolder>
	//   24   46:getfield        #154 <Field long RollingSampleBuffer$SampleExtrasHolder.offset>
	//   25   49:aload_1         
	//   26   50:getfield        #274 <Field ByteBuffer SampleHolder.data>
	//   27   53:aload_1         
	//   28   54:getfield        #190 <Field int SampleHolder.size>
	//   29   57:invokespecial   #276 <Method void readData(long, ByteBuffer, int)>
		dropDownstreamTo(infoQueue.moveToNextSample());
	//   30   60:aload_0         
	//   31   61:aload_0         
	//   32   62:getfield        #51  <Field RollingSampleBuffer$InfoQueue infoQueue>
	//   33   65:invokevirtual   #279 <Method long RollingSampleBuffer$InfoQueue.moveToNextSample()>
	//   34   68:invokespecial   #126 <Method void dropDownstreamTo(long)>
		return true;
	//   35   71:iconst_1        
	//   36   72:ireturn         
	}

	public void skipSample()
	{
		dropDownstreamTo(infoQueue.moveToNextSample());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #51  <Field RollingSampleBuffer$InfoQueue infoQueue>
	//    3    5:invokevirtual   #279 <Method long RollingSampleBuffer$InfoQueue.moveToNextSample()>
	//    4    8:invokespecial   #126 <Method void dropDownstreamTo(long)>
	//    5   11:return          
	}

	public boolean skipToKeyframeBefore(long l)
	{
		l = infoQueue.skipToKeyframeBefore(l);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field RollingSampleBuffer$InfoQueue infoQueue>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #285 <Method long RollingSampleBuffer$InfoQueue.skipToKeyframeBefore(long)>
	//    4    8:lstore_1        
		if(l == -1L)
	//*   5    9:lload_1         
	//*   6   10:ldc2w           #286 <Long -1L>
	//*   7   13:lcmp            
	//*   8   14:ifne            19
		{
			return false;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		} else
		{
			dropDownstreamTo(l);
	//   11   19:aload_0         
	//   12   20:lload_1         
	//   13   21:invokespecial   #126 <Method void dropDownstreamTo(long)>
			return true;
	//   14   24:iconst_1        
	//   15   25:ireturn         
		}
	}

	private static final int INITIAL_SCRATCH_SIZE = 32;
	private final int allocationLength;
	private final Allocator allocator;
	private final LinkedBlockingDeque dataQueue = new LinkedBlockingDeque();
	private final SampleExtrasHolder extrasHolder = new SampleExtrasHolder();
	private final InfoQueue infoQueue = new InfoQueue();
	private Allocation lastAllocation;
	private int lastAllocationOffset;
	private final ParsableByteArray scratch = new ParsableByteArray(32);
	private long totalBytesDropped;
	private long totalBytesWritten;
}
