// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.*;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.exoplayer2.upstream.cache:
//			CacheDataSource, Cache, CacheSpan

public final class CacheUtil
{
	public static class CachingCounters
	{

		public long totalCachedBytes()
		{
			return alreadyCachedBytes + newlyCachedBytes;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field long alreadyCachedBytes>
		//    2    4:aload_0         
		//    3    5:getfield        #26  <Field long newlyCachedBytes>
		//    4    8:ladd            
		//    5    9:lreturn         
		}

		public volatile long alreadyCachedBytes;
		public volatile long contentLength;
		public volatile long newlyCachedBytes;

		public CachingCounters()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			contentLength = -1L;
		//    2    4:aload_0         
		//    3    5:ldc2w           #16  <Long -1L>
		//    4    8:putfield        #19  <Field long contentLength>
		//    5   11:return          
		}
	}


	private CacheUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public static void cache(DataSpec dataspec, Cache cache1, DataSource datasource, CachingCounters cachingcounters, AtomicBoolean atomicboolean)
		throws IOException, InterruptedException
	{
		cache(dataspec, cache1, new CacheDataSource(cache1, datasource), new byte[0x20000], ((PriorityTaskManager) (null)), 0, cachingcounters, atomicboolean, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #24  <Class CacheDataSource>
	//    3    5:dup             
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #27  <Method void CacheDataSource(Cache, DataSource)>
	//    7   11:ldc1            #10  <Int 0x20000>
	//    8   13:newarray        byte[]
	//    9   15:aconst_null     
	//   10   16:iconst_0        
	//   11   17:aload_3         
	//   12   18:aload           4
	//   13   20:iconst_0        
	//   14   21:invokestatic    #30  <Method void cache(DataSpec, Cache, CacheDataSource, byte[], PriorityTaskManager, int, CacheUtil$CachingCounters, AtomicBoolean, boolean)>
	//   15   24:return          
	}

	public static void cache(DataSpec dataspec, Cache cache1, CacheDataSource cachedatasource, byte abyte0[], PriorityTaskManager prioritytaskmanager, int i, CachingCounters cachingcounters, AtomicBoolean atomicboolean, 
			boolean flag)
		throws IOException, InterruptedException
	{
		Assertions.checkNotNull(((Object) (cachedatasource)));
	//    0    0:aload_2         
	//    1    1:invokestatic    #38  <Method Object Assertions.checkNotNull(Object)>
	//    2    4:pop             
		Assertions.checkNotNull(((Object) (abyte0)));
	//    3    5:aload_3         
	//    4    6:invokestatic    #38  <Method Object Assertions.checkNotNull(Object)>
	//    5    9:pop             
		if(cachingcounters != null)
	//*   6   10:aload           6
	//*   7   12:ifnull          25
			getCached(dataspec, cache1, cachingcounters);
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:aload           6
	//   11   19:invokestatic    #42  <Method void getCached(DataSpec, Cache, CacheUtil$CachingCounters)>
		else
	//*  12   22:goto            37
			cachingcounters = new CachingCounters();
	//   13   25:new             #6   <Class CacheUtil$CachingCounters>
	//   14   28:dup             
	//   15   29:invokespecial   #43  <Method void CacheUtil$CachingCounters()>
	//   16   32:astore          6
	//*  17   34:goto            22
		String s = getKey(dataspec);
	//   18   37:aload_0         
	//   19   38:invokestatic    #47  <Method String getKey(DataSpec)>
	//   20   41:astore          19
		long l4 = dataspec.absoluteStreamPosition;
	//   21   43:aload_0         
	//   22   44:getfield        #53  <Field long DataSpec.absoluteStreamPosition>
	//   23   47:lstore          15
		long l;
		if(dataspec.length != -1L)
	//*  24   49:aload_0         
	//*  25   50:getfield        #56  <Field long DataSpec.length>
	//*  26   53:ldc2w           #57  <Long -1L>
	//*  27   56:lcmp            
	//*  28   57:ifeq            69
			l = dataspec.length;
	//   29   60:aload_0         
	//   30   61:getfield        #56  <Field long DataSpec.length>
	//   31   64:lstore          9
		else
	//*  32   66:goto            79
			l = cache1.getContentLength(s);
	//   33   69:aload_1         
	//   34   70:aload           19
	//   35   72:invokeinterface #64  <Method long Cache.getContentLength(String)>
	//   36   77:lstore          9
		long l3;
		for(; l != 0L; l -= l3)
	//*  37   79:lload           9
	//*  38   81:lconst_0        
	//*  39   82:lcmp            
	//*  40   83:ifeq            242
		{
			if(atomicboolean != null && atomicboolean.get())
	//*  41   86:aload           7
	//*  42   88:ifnull          107
	//*  43   91:aload           7
	//*  44   93:invokevirtual   #70  <Method boolean AtomicBoolean.get()>
	//*  45   96:ifeq            107
				throw new InterruptedException();
	//   46   99:new             #21  <Class InterruptedException>
	//   47  102:dup             
	//   48  103:invokespecial   #71  <Method void InterruptedException()>
	//   49  106:athrow          
			long l1;
			if(l != -1L)
	//*  50  107:lload           9
	//*  51  109:ldc2w           #57  <Long -1L>
	//*  52  112:lcmp            
	//*  53  113:ifeq            123
				l1 = l;
	//   54  116:lload           9
	//   55  118:lstore          11
			else
	//*  56  120:goto            128
				l1 = 0xffffffffL;
	//   57  123:ldc2w           #72  <Long 0xffffffffL>
	//   58  126:lstore          11
			l1 = cache1.getCachedLength(s, l4, l1);
	//   59  128:aload_1         
	//   60  129:aload           19
	//   61  131:lload           15
	//   62  133:lload           11
	//   63  135:invokeinterface #77  <Method long Cache.getCachedLength(String, long, long)>
	//   64  140:lstore          11
			if(l1 <= 0L)
	//*  65  142:lload           11
	//*  66  144:lconst_0        
	//*  67  145:lcmp            
	//*  68  146:ifle            152
	//*  69  149:goto            209
			{
				long l5 = -l1;
	//   70  152:lload           11
	//   71  154:lneg            
	//   72  155:lstore          17
				long l2 = l5;
	//   73  157:lload           17
	//   74  159:lstore          13
				l1 = l2;
	//   75  161:lload           13
	//   76  163:lstore          11
				if(readAndDiscard(dataspec, l4, l5, ((DataSource) (cachedatasource)), abyte0, prioritytaskmanager, i, cachingcounters) < l2)
	//*  77  165:aload_0         
	//*  78  166:lload           15
	//*  79  168:lload           17
	//*  80  170:aload_2         
	//*  81  171:aload_3         
	//*  82  172:aload           4
	//*  83  174:iload           5
	//*  84  176:aload           6
	//*  85  178:invokestatic    #81  <Method long readAndDiscard(DataSpec, long, long, DataSource, byte[], PriorityTaskManager, int, CacheUtil$CachingCounters)>
	//*  86  181:lload           13
	//*  87  183:lcmp            
	//*  88  184:ifge            209
				{
					if(flag && l != -1L)
	//*  89  187:iload           8
	//*  90  189:ifeq            242
	//*  91  192:lload           9
	//*  92  194:ldc2w           #57  <Long -1L>
	//*  93  197:lcmp            
	//*  94  198:ifeq            242
						throw new EOFException();
	//   95  201:new             #83  <Class EOFException>
	//   96  204:dup             
	//   97  205:invokespecial   #84  <Method void EOFException()>
	//   98  208:athrow          
					break;
				}
			}
			l3 = l1;
	//   99  209:lload           11
	//  100  211:lstore          13
			if(l == -1L)
	//* 101  213:lload           9
	//* 102  215:ldc2w           #57  <Long -1L>
	//* 103  218:lcmp            
	//* 104  219:ifne            225
				l3 = 0L;
	//  105  222:lconst_0        
	//  106  223:lstore          13
			l4 += l1;
	//  107  225:lload           15
	//  108  227:lload           11
	//  109  229:ladd            
	//  110  230:lstore          15
		}

	//  111  232:lload           9
	//  112  234:lload           13
	//  113  236:lsub            
	//  114  237:lstore          9
	//* 115  239:goto            79
	//  116  242:return          
	}

	public static String generateKey(Uri uri)
	{
		return uri.toString();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #92  <Method String Uri.toString()>
	//    2    4:areturn         
	}

	public static void getCached(DataSpec dataspec, Cache cache1, CachingCounters cachingcounters)
	{
		String s = getKey(dataspec);
	//    0    0:aload_0         
	//    1    1:invokestatic    #47  <Method String getKey(DataSpec)>
	//    2    4:astore          11
		long l4 = dataspec.absoluteStreamPosition;
	//    3    6:aload_0         
	//    4    7:getfield        #53  <Field long DataSpec.absoluteStreamPosition>
	//    5   10:lstore          9
		long l;
		if(dataspec.length != -1L)
	//*   6   12:aload_0         
	//*   7   13:getfield        #56  <Field long DataSpec.length>
	//*   8   16:ldc2w           #57  <Long -1L>
	//*   9   19:lcmp            
	//*  10   20:ifeq            31
			l = dataspec.length;
	//   11   23:aload_0         
	//   12   24:getfield        #56  <Field long DataSpec.length>
	//   13   27:lstore_3        
		else
	//*  14   28:goto            40
			l = cache1.getContentLength(s);
	//   15   31:aload_1         
	//   16   32:aload           11
	//   17   34:invokeinterface #64  <Method long Cache.getContentLength(String)>
	//   18   39:lstore_3        
		cachingcounters.contentLength = l;
	//   19   40:aload_2         
	//   20   41:lload_3         
	//   21   42:putfield        #95  <Field long CacheUtil$CachingCounters.contentLength>
		cachingcounters.alreadyCachedBytes = 0L;
	//   22   45:aload_2         
	//   23   46:lconst_0        
	//   24   47:putfield        #98  <Field long CacheUtil$CachingCounters.alreadyCachedBytes>
		cachingcounters.newlyCachedBytes = 0L;
	//   25   50:aload_2         
	//   26   51:lconst_0        
	//   27   52:putfield        #101 <Field long CacheUtil$CachingCounters.newlyCachedBytes>
		long l3;
		for(; l != 0L; l -= l3)
	//*  28   55:lload_3         
	//*  29   56:lconst_0        
	//*  30   57:lcmp            
	//*  31   58:ifeq            164
		{
			long l1;
			if(l != -1L)
	//*  32   61:lload_3         
	//*  33   62:ldc2w           #57  <Long -1L>
	//*  34   65:lcmp            
	//*  35   66:ifeq            75
				l1 = l;
	//   36   69:lload_3         
	//   37   70:lstore          5
			else
	//*  38   72:goto            80
				l1 = 0xffffffffL;
	//   39   75:ldc2w           #72  <Long 0xffffffffL>
	//   40   78:lstore          5
			l1 = cache1.getCachedLength(s, l4, l1);
	//   41   80:aload_1         
	//   42   81:aload           11
	//   43   83:lload           9
	//   44   85:lload           5
	//   45   87:invokeinterface #77  <Method long Cache.getCachedLength(String, long, long)>
	//   46   92:lstore          5
			if(l1 > 0L)
	//*  47   94:lload           5
	//*  48   96:lconst_0        
	//*  49   97:lcmp            
	//*  50   98:ifle            115
			{
				cachingcounters.alreadyCachedBytes = cachingcounters.alreadyCachedBytes + l1;
	//   51  101:aload_2         
	//   52  102:aload_2         
	//   53  103:getfield        #98  <Field long CacheUtil$CachingCounters.alreadyCachedBytes>
	//   54  106:lload           5
	//   55  108:ladd            
	//   56  109:putfield        #98  <Field long CacheUtil$CachingCounters.alreadyCachedBytes>
			} else
	//*  57  112:goto            134
			{
				long l2 = -l1;
	//   58  115:lload           5
	//   59  117:lneg            
	//   60  118:lstore          7
				l1 = l2;
	//   61  120:lload           7
	//   62  122:lstore          5
				if(l2 == 0xffffffffL)
	//*  63  124:lload           7
	//*  64  126:ldc2w           #72  <Long 0xffffffffL>
	//*  65  129:lcmp            
	//*  66  130:ifne            134
					return;
	//   67  133:return          
			}
			l3 = l1;
	//   68  134:lload           5
	//   69  136:lstore          7
			if(l == -1L)
	//*  70  138:lload_3         
	//*  71  139:ldc2w           #57  <Long -1L>
	//*  72  142:lcmp            
	//*  73  143:ifne            149
				l3 = 0L;
	//   74  146:lconst_0        
	//   75  147:lstore          7
			l4 += l1;
	//   76  149:lload           9
	//   77  151:lload           5
	//   78  153:ladd            
	//   79  154:lstore          9
		}

	//   80  156:lload_3         
	//   81  157:lload           7
	//   82  159:lsub            
	//   83  160:lstore_3        
	//*  84  161:goto            55
	//   85  164:return          
	}

	public static String getKey(DataSpec dataspec)
	{
		if(dataspec.key != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #105 <Field String DataSpec.key>
	//*   2    4:ifnull          12
			return dataspec.key;
	//    3    7:aload_0         
	//    4    8:getfield        #105 <Field String DataSpec.key>
	//    5   11:areturn         
		else
			return generateKey(dataspec.uri);
	//    6   12:aload_0         
	//    7   13:getfield        #109 <Field Uri DataSpec.uri>
	//    8   16:invokestatic    #111 <Method String generateKey(Uri)>
	//    9   19:areturn         
	}

	private static long readAndDiscard(DataSpec dataspec, long l, long l1, DataSource datasource, byte abyte0[], PriorityTaskManager prioritytaskmanager, 
			int i, CachingCounters cachingcounters)
		throws IOException, InterruptedException
	{
_L2:
		if(prioritytaskmanager != null)
	//*   0    0:aload           7
	//*   1    2:ifnull          12
			prioritytaskmanager.proceed(i);
	//    2    5:aload           7
	//    3    7:iload           8
	//    4    9:invokevirtual   #119 <Method void PriorityTaskManager.proceed(int)>
		DataSpec dataspec1;
		if(Thread.interrupted())
	//*   5   12:invokestatic    #124 <Method boolean Thread.interrupted()>
	//*   6   15:ifeq            26
			throw new InterruptedException();
	//    7   18:new             #21  <Class InterruptedException>
	//    8   21:dup             
	//    9   22:invokespecial   #71  <Method void InterruptedException()>
	//   10   25:athrow          
		dataspec1 = new DataSpec(dataspec.uri, dataspec.postBody, l, (dataspec.position + l) - dataspec.absoluteStreamPosition, -1L, dataspec.key, dataspec.flags | 2);
	//   11   26:new             #49  <Class DataSpec>
	//   12   29:dup             
	//   13   30:aload_0         
	//   14   31:getfield        #109 <Field Uri DataSpec.uri>
	//   15   34:aload_0         
	//   16   35:getfield        #128 <Field byte[] DataSpec.postBody>
	//   17   38:lload_1         
	//   18   39:aload_0         
	//   19   40:getfield        #131 <Field long DataSpec.position>
	//   20   43:lload_1         
	//   21   44:ladd            
	//   22   45:aload_0         
	//   23   46:getfield        #53  <Field long DataSpec.absoluteStreamPosition>
	//   24   49:lsub            
	//   25   50:ldc2w           #57  <Long -1L>
	//   26   53:aload_0         
	//   27   54:getfield        #105 <Field String DataSpec.key>
	//   28   57:aload_0         
	//   29   58:getfield        #134 <Field int DataSpec.flags>
	//   30   61:iconst_2        
	//   31   62:ior             
	//   32   63:invokespecial   #137 <Method void DataSpec(Uri, byte[], long, long, long, String, int)>
	//   33   66:astore          15
		long l2 = datasource.open(dataspec1);
	//   34   68:aload           5
	//   35   70:aload           15
	//   36   72:invokeinterface #143 <Method long DataSource.open(DataSpec)>
	//   37   77:lstore          11
		if(cachingcounters.contentLength != -1L || l2 == -1L)
			break MISSING_BLOCK_LABEL_282;
	//   38   79:aload           9
	//   39   81:getfield        #95  <Field long CacheUtil$CachingCounters.contentLength>
	//   40   84:ldc2w           #57  <Long -1L>
	//   41   87:lcmp            
	//   42   88:ifne            282
	//   43   91:lload           11
	//   44   93:ldc2w           #57  <Long -1L>
	//   45   96:lcmp            
	//   46   97:ifeq            282
		int j;
		long l3;
		try
		{
			cachingcounters.contentLength = dataspec1.absoluteStreamPosition + l2;
	//   47  100:aload           9
	//   48  102:aload           15
	//   49  104:getfield        #53  <Field long DataSpec.absoluteStreamPosition>
	//   50  107:lload           11
	//   51  109:ladd            
	//   52  110:putfield        #95  <Field long CacheUtil$CachingCounters.contentLength>
			break MISSING_BLOCK_LABEL_282;
	//   53  113:goto            282
		}
	//*  54  116:lload           11
	//*  55  118:lload_3         
	//*  56  119:lcmp            
	//*  57  120:ifeq            243
	//*  58  123:invokestatic    #124 <Method boolean Thread.interrupted()>
	//*  59  126:ifeq            137
	//*  60  129:new             #21  <Class InterruptedException>
	//*  61  132:dup             
	//*  62  133:invokespecial   #71  <Method void InterruptedException()>
	//*  63  136:athrow          
	//*  64  137:lload_3         
	//*  65  138:ldc2w           #57  <Long -1L>
	//*  66  141:lcmp            
	//*  67  142:ifeq            162
	//*  68  145:aload           6
	//*  69  147:arraylength     
	//*  70  148:i2l             
	//*  71  149:lload_3         
	//*  72  150:lload           11
	//*  73  152:lsub            
	//*  74  153:invokestatic    #149 <Method long Math.min(long, long)>
	//*  75  156:l2i             
	//*  76  157:istore          10
	//*  77  159:goto            167
	//*  78  162:aload           6
	//*  79  164:arraylength     
	//*  80  165:istore          10
	//*  81  167:aload           5
	//*  82  169:aload           6
	//*  83  171:iconst_0        
	//*  84  172:iload           10
	//*  85  174:invokeinterface #153 <Method int DataSource.read(byte[], int, int)>
	//*  86  179:istore          10
	//*  87  181:iload           10
	//*  88  183:iconst_m1       
	//*  89  184:icmpne          215
	//*  90  187:aload           9
	//*  91  189:getfield        #95  <Field long CacheUtil$CachingCounters.contentLength>
	//*  92  192:ldc2w           #57  <Long -1L>
	//*  93  195:lcmp            
	//*  94  196:ifne            243
	//*  95  199:aload           9
	//*  96  201:aload           15
	//*  97  203:getfield        #53  <Field long DataSpec.absoluteStreamPosition>
	//*  98  206:lload           11
	//*  99  208:ladd            
	//* 100  209:putfield        #95  <Field long CacheUtil$CachingCounters.contentLength>
	//* 101  212:goto            243
	//* 102  215:iload           10
	//* 103  217:i2l             
	//* 104  218:lstore          13
	//* 105  220:aload           9
	//* 106  222:aload           9
	//* 107  224:getfield        #101 <Field long CacheUtil$CachingCounters.newlyCachedBytes>
	//* 108  227:lload           13
	//* 109  229:ladd            
	//* 110  230:putfield        #101 <Field long CacheUtil$CachingCounters.newlyCachedBytes>
	//* 111  233:lload           11
	//* 112  235:lload           13
	//* 113  237:ladd            
	//* 114  238:lstore          11
	//* 115  240:goto            116
	//* 116  243:aload           5
	//* 117  245:invokestatic    #159 <Method void Util.closeQuietly(DataSource)>
	//* 118  248:lload           11
	//* 119  250:lreturn         
	//* 120  251:aload           15
	//* 121  253:astore_0        
	//* 122  254:goto            265
	//* 123  257:astore_0        
	//* 124  258:aload           5
	//* 125  260:invokestatic    #159 <Method void Util.closeQuietly(DataSource)>
	//* 126  263:aload_0         
	//* 127  264:athrow          
	//* 128  265:aload           5
	//* 129  267:invokestatic    #159 <Method void Util.closeQuietly(DataSource)>
	//* 130  270:goto            0
	//* 131  273:astore          15
	//* 132  275:goto            265
		// Misplaced declaration of an exception variable
		catch(DataSpec dataspec)
		{
			dataspec = dataspec1;
		}
		break MISSING_BLOCK_LABEL_265;
		com.google.android.exoplayer2.util.PriorityTaskManager.PriorityTooLowException prioritytoolowexception;
		for(; l2 == l1; l2 = 0L)
			break MISSING_BLOCK_LABEL_243;

	//  133  278:astore_0        
	//  134  279:goto            251
	//  135  282:lconst_0        
	//  136  283:lstore          11
		if(Thread.interrupted())
			throw new InterruptedException();
		if(l1 == -1L)
			break MISSING_BLOCK_LABEL_162;
		j = (int)Math.min(abyte0.length, l1 - l2);
		break MISSING_BLOCK_LABEL_167;
		j = abyte0.length;
		j = datasource.read(abyte0, 0, j);
		if(j != -1)
			break MISSING_BLOCK_LABEL_215;
		if(cachingcounters.contentLength == -1L)
			cachingcounters.contentLength = dataspec1.absoluteStreamPosition + l2;
		break MISSING_BLOCK_LABEL_243;
		l3 = j;
		cachingcounters.newlyCachedBytes = cachingcounters.newlyCachedBytes + l3;
		l2 += l3;
		break MISSING_BLOCK_LABEL_116;
		Util.closeQuietly(datasource);
		return l2;
		dataspec;
		Util.closeQuietly(datasource);
		throw dataspec;
_L3:
		Util.closeQuietly(datasource);
		if(true) goto _L2; else goto _L1
_L1:
		prioritytoolowexception;
		  goto _L3
	//* 137  285:goto            116
	}

	public static void remove(Cache cache1, String s)
	{
		for(s = ((String) (cache1.getCachedSpans(s).iterator())); ((Iterator) (s)).hasNext();)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokeinterface #167 <Method NavigableSet Cache.getCachedSpans(String)>
	//*   3    7:invokeinterface #173 <Method Iterator NavigableSet.iterator()>
	//*   4   12:astore_1        
	//*   5   13:aload_1         
	//*   6   14:invokeinterface #178 <Method boolean Iterator.hasNext()>
	//*   7   19:ifeq            42
		{
			CacheSpan cachespan = (CacheSpan)((Iterator) (s)).next();
	//    8   22:aload_1         
	//    9   23:invokeinterface #182 <Method Object Iterator.next()>
	//   10   28:checkcast       #184 <Class CacheSpan>
	//   11   31:astore_2        
			try
			{
				cache1.removeSpan(cachespan);
	//   12   32:aload_0         
	//   13   33:aload_2         
	//   14   34:invokeinterface #188 <Method void Cache.removeSpan(CacheSpan)>
			}
	//*  15   39:goto            13
	//*  16   42:return          
			catch(Cache.CacheException cacheexception) { }
	//   17   43:astore_2        
		}

	//*  18   44:goto            13
	}

	public static final int DEFAULT_BUFFER_SIZE_BYTES = 0x20000;
}
