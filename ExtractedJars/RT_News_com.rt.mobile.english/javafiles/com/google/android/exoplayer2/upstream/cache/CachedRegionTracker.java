// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream.cache;

import android.util.Log;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.upstream.cache:
//			Cache, CacheSpan

public final class CachedRegionTracker
	implements Cache.Listener
{
	private static class Region
		implements Comparable
	{

		public int compareTo(Region region)
		{
			if(startOffset < region.startOffset)
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field long startOffset>
		//*   2    4:aload_1         
		//*   3    5:getfield        #22  <Field long startOffset>
		//*   4    8:lcmp            
		//*   5    9:ifge            14
				return -1;
		//    6   12:iconst_m1       
		//    7   13:ireturn         
			return startOffset != region.startOffset ? 1 : 0;
		//    8   14:aload_0         
		//    9   15:getfield        #22  <Field long startOffset>
		//   10   18:aload_1         
		//   11   19:getfield        #22  <Field long startOffset>
		//   12   22:lcmp            
		//   13   23:ifne            28
		//   14   26:iconst_0        
		//   15   27:ireturn         
		//   16   28:iconst_1        
		//   17   29:ireturn         
		}

		public volatile int compareTo(Object obj)
		{
			return compareTo((Region)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #2   <Class CachedRegionTracker$Region>
		//    3    5:invokevirtual   #32  <Method int compareTo(CachedRegionTracker$Region)>
		//    4    8:ireturn         
		}

		public long endOffset;
		public int endOffsetIndex;
		public long startOffset;

		public Region(long l, long l1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			startOffset = l;
		//    2    4:aload_0         
		//    3    5:lload_1         
		//    4    6:putfield        #22  <Field long startOffset>
			endOffset = l1;
		//    5    9:aload_0         
		//    6   10:lload_3         
		//    7   11:putfield        #24  <Field long endOffset>
		//    8   14:return          
		}
	}


	public CachedRegionTracker(Cache cache1, String s, ChunkIndex chunkindex)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		cache = cache1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #35  <Field Cache cache>
		cacheKey = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #37  <Field String cacheKey>
		chunkIndex = chunkindex;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #39  <Field ChunkIndex chunkIndex>
		regions = new TreeSet();
	//   11   19:aload_0         
	//   12   20:new             #41  <Class TreeSet>
	//   13   23:dup             
	//   14   24:invokespecial   #42  <Method void TreeSet()>
	//   15   27:putfield        #44  <Field TreeSet regions>
	//   16   30:aload_0         
	//   17   31:new             #8   <Class CachedRegionTracker$Region>
	//   18   34:dup             
	//   19   35:lconst_0        
	//   20   36:lconst_0        
	//   21   37:invokespecial   #47  <Method void CachedRegionTracker$Region(long, long)>
	//   22   40:putfield        #49  <Field CachedRegionTracker$Region lookupRegion>
		this;
	//   23   43:aload_0         
		JVM INSTR monitorenter ;
	//   24   44:monitorenter    
		for(cache1 = ((Cache) (cache1.addListener(s, ((Cache.Listener) (this))).descendingIterator())); ((Iterator) (cache1)).hasNext(); mergeSpan((CacheSpan)((Iterator) (cache1)).next()));
	//   25   45:aload_1         
	//   26   46:aload_2         
	//   27   47:aload_0         
	//   28   48:invokeinterface #55  <Method NavigableSet Cache.addListener(String, Cache$Listener)>
	//   29   53:invokeinterface #61  <Method Iterator NavigableSet.descendingIterator()>
	//   30   58:astore_1        
	//   31   59:aload_1         
	//   32   60:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//   33   65:ifeq            84
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:invokeinterface #71  <Method Object Iterator.next()>
	//   37   75:checkcast       #73  <Class CacheSpan>
	//   38   78:invokespecial   #77  <Method void mergeSpan(CacheSpan)>
	//*  39   81:goto            59
		this;
	//   40   84:aload_0         
		JVM INSTR monitorexit ;
	//   41   85:monitorexit     
		return;
	//   42   86:return          
		cache1;
	//   43   87:astore_1        
		this;
	//   44   88:aload_0         
		JVM INSTR monitorexit ;
	//   45   89:monitorexit     
		throw cache1;
	//   46   90:aload_1         
	//   47   91:athrow          
	}

	private void mergeSpan(CacheSpan cachespan)
	{
		Object obj = ((Object) (new Region(cachespan.position, cachespan.position + cachespan.length)));
	//    0    0:new             #8   <Class CachedRegionTracker$Region>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:getfield        #82  <Field long CacheSpan.position>
	//    4    8:aload_1         
	//    5    9:getfield        #82  <Field long CacheSpan.position>
	//    6   12:aload_1         
	//    7   13:getfield        #85  <Field long CacheSpan.length>
	//    8   16:ladd            
	//    9   17:invokespecial   #47  <Method void CachedRegionTracker$Region(long, long)>
	//   10   20:astore          5
		cachespan = ((CacheSpan) ((Region)regions.floor(obj)));
	//   11   22:aload_0         
	//   12   23:getfield        #44  <Field TreeSet regions>
	//   13   26:aload           5
	//   14   28:invokevirtual   #89  <Method Object TreeSet.floor(Object)>
	//   15   31:checkcast       #8   <Class CachedRegionTracker$Region>
	//   16   34:astore_1        
		Region region = (Region)regions.ceiling(obj);
	//   17   35:aload_0         
	//   18   36:getfield        #44  <Field TreeSet regions>
	//   19   39:aload           5
	//   20   41:invokevirtual   #92  <Method Object TreeSet.ceiling(Object)>
	//   21   44:checkcast       #8   <Class CachedRegionTracker$Region>
	//   22   47:astore          6
		boolean flag = regionsConnect(((Region) (cachespan)), ((Region) (obj)));
	//   23   49:aload_0         
	//   24   50:aload_1         
	//   25   51:aload           5
	//   26   53:invokespecial   #96  <Method boolean regionsConnect(CachedRegionTracker$Region, CachedRegionTracker$Region)>
	//   27   56:istore          4
		if(regionsConnect(((Region) (obj)), region))
	//*  28   58:aload_0         
	//*  29   59:aload           5
	//*  30   61:aload           6
	//*  31   63:invokespecial   #96  <Method boolean regionsConnect(CachedRegionTracker$Region, CachedRegionTracker$Region)>
	//*  32   66:ifeq            136
		{
			if(flag)
	//*  33   69:iload           4
	//*  34   71:ifeq            95
			{
				cachespan.endOffset = region.endOffset;
	//   35   74:aload_1         
	//   36   75:aload           6
	//   37   77:getfield        #99  <Field long CachedRegionTracker$Region.endOffset>
	//   38   80:putfield        #99  <Field long CachedRegionTracker$Region.endOffset>
				cachespan.endOffsetIndex = region.endOffsetIndex;
	//   39   83:aload_1         
	//   40   84:aload           6
	//   41   86:getfield        #102 <Field int CachedRegionTracker$Region.endOffsetIndex>
	//   42   89:putfield        #102 <Field int CachedRegionTracker$Region.endOffsetIndex>
			} else
	//*  43   92:goto            125
			{
				obj.endOffset = region.endOffset;
	//   44   95:aload           5
	//   45   97:aload           6
	//   46   99:getfield        #99  <Field long CachedRegionTracker$Region.endOffset>
	//   47  102:putfield        #99  <Field long CachedRegionTracker$Region.endOffset>
				obj.endOffsetIndex = region.endOffsetIndex;
	//   48  105:aload           5
	//   49  107:aload           6
	//   50  109:getfield        #102 <Field int CachedRegionTracker$Region.endOffsetIndex>
	//   51  112:putfield        #102 <Field int CachedRegionTracker$Region.endOffsetIndex>
				regions.add(obj);
	//   52  115:aload_0         
	//   53  116:getfield        #44  <Field TreeSet regions>
	//   54  119:aload           5
	//   55  121:invokevirtual   #106 <Method boolean TreeSet.add(Object)>
	//   56  124:pop             
			}
			regions.remove(((Object) (region)));
	//   57  125:aload_0         
	//   58  126:getfield        #44  <Field TreeSet regions>
	//   59  129:aload           6
	//   60  131:invokevirtual   #109 <Method boolean TreeSet.remove(Object)>
	//   61  134:pop             
			return;
	//   62  135:return          
		}
		if(flag)
	//*  63  136:iload           4
	//*  64  138:ifeq            204
		{
			cachespan.endOffset = ((Region) (obj)).endOffset;
	//   65  141:aload_1         
	//   66  142:aload           5
	//   67  144:getfield        #99  <Field long CachedRegionTracker$Region.endOffset>
	//   68  147:putfield        #99  <Field long CachedRegionTracker$Region.endOffset>
			int i = ((Region) (cachespan)).endOffsetIndex;
	//   69  150:aload_1         
	//   70  151:getfield        #102 <Field int CachedRegionTracker$Region.endOffsetIndex>
	//   71  154:istore_2        
			do
			{
				if(i >= chunkIndex.length - 1)
					break;
	//   72  155:iload_2         
	//   73  156:aload_0         
	//   74  157:getfield        #39  <Field ChunkIndex chunkIndex>
	//   75  160:getfield        #113 <Field int ChunkIndex.length>
	//   76  163:iconst_1        
	//   77  164:isub            
	//   78  165:icmpge          198
				obj = ((Object) (chunkIndex.offsets));
	//   79  168:aload_0         
	//   80  169:getfield        #39  <Field ChunkIndex chunkIndex>
	//   81  172:getfield        #117 <Field long[] ChunkIndex.offsets>
	//   82  175:astore          5
				int k = i + 1;
	//   83  177:iload_2         
	//   84  178:iconst_1        
	//   85  179:iadd            
	//   86  180:istore_3        
				if(obj[k] > ((Region) (cachespan)).endOffset)
					break;
	//   87  181:aload           5
	//   88  183:iload_3         
	//   89  184:laload          
	//   90  185:aload_1         
	//   91  186:getfield        #99  <Field long CachedRegionTracker$Region.endOffset>
	//   92  189:lcmp            
	//   93  190:ifgt            198
				i = k;
	//   94  193:iload_3         
	//   95  194:istore_2        
			} while(true);
	//   96  195:goto            155
			cachespan.endOffsetIndex = i;
	//   97  198:aload_1         
	//   98  199:iload_2         
	//   99  200:putfield        #102 <Field int CachedRegionTracker$Region.endOffsetIndex>
			return;
	//  100  203:return          
		}
		int l = Arrays.binarySearch(chunkIndex.offsets, ((Region) (obj)).endOffset);
	//  101  204:aload_0         
	//  102  205:getfield        #39  <Field ChunkIndex chunkIndex>
	//  103  208:getfield        #117 <Field long[] ChunkIndex.offsets>
	//  104  211:aload           5
	//  105  213:getfield        #99  <Field long CachedRegionTracker$Region.endOffset>
	//  106  216:invokestatic    #123 <Method int Arrays.binarySearch(long[], long)>
	//  107  219:istore_3        
		int j = l;
	//  108  220:iload_3         
	//  109  221:istore_2        
		if(l < 0)
	//* 110  222:iload_3         
	//* 111  223:ifge            231
			j = -l - 2;
	//  112  226:iload_3         
	//  113  227:ineg            
	//  114  228:iconst_2        
	//  115  229:isub            
	//  116  230:istore_2        
		obj.endOffsetIndex = j;
	//  117  231:aload           5
	//  118  233:iload_2         
	//  119  234:putfield        #102 <Field int CachedRegionTracker$Region.endOffsetIndex>
		regions.add(obj);
	//  120  237:aload_0         
	//  121  238:getfield        #44  <Field TreeSet regions>
	//  122  241:aload           5
	//  123  243:invokevirtual   #106 <Method boolean TreeSet.add(Object)>
	//  124  246:pop             
	//  125  247:return          
	}

	private boolean regionsConnect(Region region, Region region1)
	{
		return region != null && region1 != null && region.endOffset == region1.startOffset;
	//    0    0:aload_1         
	//    1    1:ifnull          22
	//    2    4:aload_2         
	//    3    5:ifnull          22
	//    4    8:aload_1         
	//    5    9:getfield        #99  <Field long CachedRegionTracker$Region.endOffset>
	//    6   12:aload_2         
	//    7   13:getfield        #126 <Field long CachedRegionTracker$Region.startOffset>
	//    8   16:lcmp            
	//    9   17:ifne            22
	//   10   20:iconst_1        
	//   11   21:ireturn         
	//   12   22:iconst_0        
	//   13   23:ireturn         
	}

	public int getRegionEndTimeMs(long l)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Region region;
		lookupRegion.startOffset = l;
	//    2    2:aload_0         
	//    3    3:getfield        #49  <Field CachedRegionTracker$Region lookupRegion>
	//    4    6:lload_1         
	//    5    7:putfield        #126 <Field long CachedRegionTracker$Region.startOffset>
		region = (Region)regions.floor(((Object) (lookupRegion)));
	//    6   10:aload_0         
	//    7   11:getfield        #44  <Field TreeSet regions>
	//    8   14:aload_0         
	//    9   15:getfield        #49  <Field CachedRegionTracker$Region lookupRegion>
	//   10   18:invokevirtual   #89  <Method Object TreeSet.floor(Object)>
	//   11   21:checkcast       #8   <Class CachedRegionTracker$Region>
	//   12   24:astore          7
		if(region == null)
			break MISSING_BLOCK_LABEL_176;
	//   13   26:aload           7
	//   14   28:ifnull          176
		if(l > region.endOffset || region.endOffsetIndex == -1)
	//*  15   31:lload_1         
	//*  16   32:aload           7
	//*  17   34:getfield        #99  <Field long CachedRegionTracker$Region.endOffset>
	//*  18   37:lcmp            
	//*  19   38:ifgt            176
	//*  20   41:aload           7
	//*  21   43:getfield        #102 <Field int CachedRegionTracker$Region.endOffsetIndex>
	//*  22   46:iconst_m1       
	//*  23   47:icmpne          53
			break MISSING_BLOCK_LABEL_176;
	//   24   50:goto            176
		int i;
		int j;
		long l1;
		i = region.endOffsetIndex;
	//   25   53:aload           7
	//   26   55:getfield        #102 <Field int CachedRegionTracker$Region.endOffsetIndex>
	//   27   58:istore_3        
		if(i != chunkIndex.length - 1)
			break MISSING_BLOCK_LABEL_116;
	//   28   59:iload_3         
	//   29   60:aload_0         
	//   30   61:getfield        #39  <Field ChunkIndex chunkIndex>
	//   31   64:getfield        #113 <Field int ChunkIndex.length>
	//   32   67:iconst_1        
	//   33   68:isub            
	//   34   69:icmpne          116
		l = region.endOffset;
	//   35   72:aload           7
	//   36   74:getfield        #99  <Field long CachedRegionTracker$Region.endOffset>
	//   37   77:lstore_1        
		l1 = chunkIndex.offsets[i];
	//   38   78:aload_0         
	//   39   79:getfield        #39  <Field ChunkIndex chunkIndex>
	//   40   82:getfield        #117 <Field long[] ChunkIndex.offsets>
	//   41   85:iload_3         
	//   42   86:laload          
	//   43   87:lstore          5
		j = chunkIndex.sizes[i];
	//   44   89:aload_0         
	//   45   90:getfield        #39  <Field ChunkIndex chunkIndex>
	//   46   93:getfield        #132 <Field int[] ChunkIndex.sizes>
	//   47   96:iload_3         
	//   48   97:iaload          
	//   49   98:istore          4
		if(l != l1 + (long)j)
			break MISSING_BLOCK_LABEL_116;
	//   50  100:lload_1         
	//   51  101:lload           5
	//   52  103:iload           4
	//   53  105:i2l             
	//   54  106:ladd            
	//   55  107:lcmp            
	//   56  108:ifne            116
		this;
	//   57  111:aload_0         
		JVM INSTR monitorexit ;
	//   58  112:monitorexit     
		return -2;
	//   59  113:bipush          -2
	//   60  115:ireturn         
		l = (chunkIndex.durationsUs[i] * (region.endOffset - chunkIndex.offsets[i])) / (long)chunkIndex.sizes[i];
	//   61  116:aload_0         
	//   62  117:getfield        #39  <Field ChunkIndex chunkIndex>
	//   63  120:getfield        #135 <Field long[] ChunkIndex.durationsUs>
	//   64  123:iload_3         
	//   65  124:laload          
	//   66  125:aload           7
	//   67  127:getfield        #99  <Field long CachedRegionTracker$Region.endOffset>
	//   68  130:aload_0         
	//   69  131:getfield        #39  <Field ChunkIndex chunkIndex>
	//   70  134:getfield        #117 <Field long[] ChunkIndex.offsets>
	//   71  137:iload_3         
	//   72  138:laload          
	//   73  139:lsub            
	//   74  140:lmul            
	//   75  141:aload_0         
	//   76  142:getfield        #39  <Field ChunkIndex chunkIndex>
	//   77  145:getfield        #132 <Field int[] ChunkIndex.sizes>
	//   78  148:iload_3         
	//   79  149:iaload          
	//   80  150:i2l             
	//   81  151:ldiv            
	//   82  152:lstore_1        
		l = (chunkIndex.timesUs[i] + l) / 1000L;
	//   83  153:aload_0         
	//   84  154:getfield        #39  <Field ChunkIndex chunkIndex>
	//   85  157:getfield        #138 <Field long[] ChunkIndex.timesUs>
	//   86  160:iload_3         
	//   87  161:laload          
	//   88  162:lload_1         
	//   89  163:ladd            
	//   90  164:ldc2w           #139 <Long 1000L>
	//   91  167:ldiv            
	//   92  168:lstore_1        
		i = (int)l;
	//   93  169:lload_1         
	//   94  170:l2i             
	//   95  171:istore_3        
		this;
	//   96  172:aload_0         
		JVM INSTR monitorexit ;
	//   97  173:monitorexit     
		return i;
	//   98  174:iload_3         
	//   99  175:ireturn         
		this;
	//  100  176:aload_0         
		JVM INSTR monitorexit ;
	//  101  177:monitorexit     
		return -1;
	//  102  178:iconst_m1       
	//  103  179:ireturn         
		Exception exception;
		exception;
	//  104  180:astore          7
	//* 105  182:aload_0         
		throw exception;
	//  106  183:monitorexit     
	//  107  184:aload           7
	//  108  186:athrow          
	}

	public void onSpanAdded(Cache cache1, CacheSpan cachespan)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		mergeSpan(cachespan);
	//    2    2:aload_0         
	//    3    3:aload_2         
	//    4    4:invokespecial   #77  <Method void mergeSpan(CacheSpan)>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		cache1;
	//    8   10:astore_1        
	//*   9   11:aload_0         
		throw cache1;
	//   10   12:monitorexit     
	//   11   13:aload_1         
	//   12   14:athrow          
	}

	public void onSpanRemoved(Cache cache1, CacheSpan cachespan)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		cachespan = ((CacheSpan) (new Region(cachespan.position, cachespan.position + cachespan.length)));
	//    2    2:new             #8   <Class CachedRegionTracker$Region>
	//    3    5:dup             
	//    4    6:aload_2         
	//    5    7:getfield        #82  <Field long CacheSpan.position>
	//    6   10:aload_2         
	//    7   11:getfield        #82  <Field long CacheSpan.position>
	//    8   14:aload_2         
	//    9   15:getfield        #85  <Field long CacheSpan.length>
	//   10   18:ladd            
	//   11   19:invokespecial   #47  <Method void CachedRegionTracker$Region(long, long)>
	//   12   22:astore_2        
		cache1 = ((Cache) ((Region)regions.floor(((Object) (cachespan)))));
	//   13   23:aload_0         
	//   14   24:getfield        #44  <Field TreeSet regions>
	//   15   27:aload_2         
	//   16   28:invokevirtual   #89  <Method Object TreeSet.floor(Object)>
	//   17   31:checkcast       #8   <Class CachedRegionTracker$Region>
	//   18   34:astore_1        
		if(cache1 != null)
			break MISSING_BLOCK_LABEL_50;
	//   19   35:aload_1         
	//   20   36:ifnonnull       50
		Log.e("CachedRegionTracker", "Removed a span we were not aware of");
	//   21   39:ldc1            #18  <String "CachedRegionTracker">
	//   22   41:ldc1            #145 <String "Removed a span we were not aware of">
	//   23   43:invokestatic    #151 <Method int Log.e(String, String)>
	//   24   46:pop             
		this;
	//   25   47:aload_0         
		JVM INSTR monitorexit ;
	//   26   48:monitorexit     
		return;
	//   27   49:return          
		int j;
		Region region;
		regions.remove(((Object) (cache1)));
	//   28   50:aload_0         
	//   29   51:getfield        #44  <Field TreeSet regions>
	//   30   54:aload_1         
	//   31   55:invokevirtual   #109 <Method boolean TreeSet.remove(Object)>
	//   32   58:pop             
		if(((Region) (cache1)).startOffset >= ((Region) (cachespan)).startOffset)
			break MISSING_BLOCK_LABEL_135;
	//   33   59:aload_1         
	//   34   60:getfield        #126 <Field long CachedRegionTracker$Region.startOffset>
	//   35   63:aload_2         
	//   36   64:getfield        #126 <Field long CachedRegionTracker$Region.startOffset>
	//   37   67:lcmp            
	//   38   68:ifge            135
		region = new Region(((Region) (cache1)).startOffset, ((Region) (cachespan)).startOffset);
	//   39   71:new             #8   <Class CachedRegionTracker$Region>
	//   40   74:dup             
	//   41   75:aload_1         
	//   42   76:getfield        #126 <Field long CachedRegionTracker$Region.startOffset>
	//   43   79:aload_2         
	//   44   80:getfield        #126 <Field long CachedRegionTracker$Region.startOffset>
	//   45   83:invokespecial   #47  <Method void CachedRegionTracker$Region(long, long)>
	//   46   86:astore          5
		j = Arrays.binarySearch(chunkIndex.offsets, region.endOffset);
	//   47   88:aload_0         
	//   48   89:getfield        #39  <Field ChunkIndex chunkIndex>
	//   49   92:getfield        #117 <Field long[] ChunkIndex.offsets>
	//   50   95:aload           5
	//   51   97:getfield        #99  <Field long CachedRegionTracker$Region.endOffset>
	//   52  100:invokestatic    #123 <Method int Arrays.binarySearch(long[], long)>
	//   53  103:istore          4
		int i;
		i = j;
	//   54  105:iload           4
	//   55  107:istore_3        
		if(j < 0)
	//*  56  108:iload           4
	//*  57  110:ifge            119
			i = -j - 2;
	//   58  113:iload           4
	//   59  115:ineg            
	//   60  116:iconst_2        
	//   61  117:isub            
	//   62  118:istore_3        
		region.endOffsetIndex = i;
	//   63  119:aload           5
	//   64  121:iload_3         
	//   65  122:putfield        #102 <Field int CachedRegionTracker$Region.endOffsetIndex>
		regions.add(((Object) (region)));
	//   66  125:aload_0         
	//   67  126:getfield        #44  <Field TreeSet regions>
	//   68  129:aload           5
	//   69  131:invokevirtual   #106 <Method boolean TreeSet.add(Object)>
	//   70  134:pop             
		if(((Region) (cache1)).endOffset > ((Region) (cachespan)).endOffset)
	//*  71  135:aload_1         
	//*  72  136:getfield        #99  <Field long CachedRegionTracker$Region.endOffset>
	//*  73  139:aload_2         
	//*  74  140:getfield        #99  <Field long CachedRegionTracker$Region.endOffset>
	//*  75  143:lcmp            
	//*  76  144:ifle            182
		{
			cachespan = ((CacheSpan) (new Region(((Region) (cachespan)).endOffset + 1L, ((Region) (cache1)).endOffset)));
	//   77  147:new             #8   <Class CachedRegionTracker$Region>
	//   78  150:dup             
	//   79  151:aload_2         
	//   80  152:getfield        #99  <Field long CachedRegionTracker$Region.endOffset>
	//   81  155:lconst_1        
	//   82  156:ladd            
	//   83  157:aload_1         
	//   84  158:getfield        #99  <Field long CachedRegionTracker$Region.endOffset>
	//   85  161:invokespecial   #47  <Method void CachedRegionTracker$Region(long, long)>
	//   86  164:astore_2        
			cachespan.endOffsetIndex = ((Region) (cache1)).endOffsetIndex;
	//   87  165:aload_2         
	//   88  166:aload_1         
	//   89  167:getfield        #102 <Field int CachedRegionTracker$Region.endOffsetIndex>
	//   90  170:putfield        #102 <Field int CachedRegionTracker$Region.endOffsetIndex>
			regions.add(((Object) (cachespan)));
	//   91  173:aload_0         
	//   92  174:getfield        #44  <Field TreeSet regions>
	//   93  177:aload_2         
	//   94  178:invokevirtual   #106 <Method boolean TreeSet.add(Object)>
	//   95  181:pop             
		}
		this;
	//   96  182:aload_0         
		JVM INSTR monitorexit ;
	//   97  183:monitorexit     
		return;
	//   98  184:return          
		cache1;
	//   99  185:astore_1        
	//* 100  186:aload_0         
		throw cache1;
	//  101  187:monitorexit     
	//  102  188:aload_1         
	//  103  189:athrow          
	}

	public void onSpanTouched(Cache cache1, CacheSpan cachespan, CacheSpan cachespan1)
	{
	//    0    0:return          
	}

	public void release()
	{
		cache.removeListener(cacheKey, ((Cache.Listener) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Cache cache>
	//    2    4:aload_0         
	//    3    5:getfield        #37  <Field String cacheKey>
	//    4    8:aload_0         
	//    5    9:invokeinterface #158 <Method void Cache.removeListener(String, Cache$Listener)>
	//    6   14:return          
	}

	public static final int CACHED_TO_END = -2;
	public static final int NOT_CACHED = -1;
	private static final String TAG = "CachedRegionTracker";
	private final Cache cache;
	private final String cacheKey;
	private final ChunkIndex chunkIndex;
	private final Region lookupRegion = new Region(0L, 0L);
	private final TreeSet regions;
}
