// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.*;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Annotation;

// Referenced classes of package com.google.android.exoplayer2.upstream.cache:
//			CacheDataSink, Cache, ContentMetadataInternal, CacheSpan, 
//			ContentMetadataMutations, CacheUtil

public final class CacheDataSource
	implements DataSource
{
	public static interface CacheIgnoredReason
		extends Annotation
	{
	}

	public static interface EventListener
	{

		public abstract void onCacheIgnored(int i);

		public abstract void onCachedBytesRead(long l, long l1);
	}

	public static interface Flags
		extends Annotation
	{
	}


	public CacheDataSource(Cache cache1, DataSource datasource)
	{
		this(cache1, datasource, 0, 0x200000L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:ldc2w           #25  <Long 0x200000L>
	//    5    7:invokespecial   #68  <Method void CacheDataSource(Cache, DataSource, int, long)>
	//    6   10:return          
	}

	public CacheDataSource(Cache cache1, DataSource datasource, int i)
	{
		this(cache1, datasource, i, 0x200000L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:ldc2w           #25  <Long 0x200000L>
	//    5    7:invokespecial   #68  <Method void CacheDataSource(Cache, DataSource, int, long)>
	//    6   10:return          
	}

	public CacheDataSource(Cache cache1, DataSource datasource, int i, long l)
	{
		this(cache1, datasource, ((DataSource) (new FileDataSource())), ((DataSink) (new CacheDataSink(cache1, l))), i, ((EventListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #72  <Class FileDataSource>
	//    4    6:dup             
	//    5    7:invokespecial   #75  <Method void FileDataSource()>
	//    6   10:new             #77  <Class CacheDataSink>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:lload           4
	//   10   17:invokespecial   #80  <Method void CacheDataSink(Cache, long)>
	//   11   20:iload_3         
	//   12   21:aconst_null     
	//   13   22:invokespecial   #83  <Method void CacheDataSource(Cache, DataSource, DataSource, DataSink, int, CacheDataSource$EventListener)>
	//   14   25:return          
	}

	public CacheDataSource(Cache cache1, DataSource datasource, DataSource datasource1, DataSink datasink, int i, EventListener eventlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method void Object()>
		cache = cache1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #86  <Field Cache cache>
		cacheReadDataSource = datasource1;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #88  <Field DataSource cacheReadDataSource>
		boolean flag1 = false;
	//    8   14:iconst_0        
	//    9   15:istore          8
		boolean flag;
		if((i & 1) != 0)
	//*  10   17:iload           5
	//*  11   19:iconst_1        
	//*  12   20:iand            
	//*  13   21:ifeq            30
			flag = true;
	//   14   24:iconst_1        
	//   15   25:istore          7
		else
	//*  16   27:goto            33
			flag = false;
	//   17   30:iconst_0        
	//   18   31:istore          7
		blockOnCache = flag;
	//   19   33:aload_0         
	//   20   34:iload           7
	//   21   36:putfield        #90  <Field boolean blockOnCache>
		if((i & 2) != 0)
	//*  22   39:iload           5
	//*  23   41:iconst_2        
	//*  24   42:iand            
	//*  25   43:ifeq            52
			flag = true;
	//   26   46:iconst_1        
	//   27   47:istore          7
		else
	//*  28   49:goto            55
			flag = false;
	//   29   52:iconst_0        
	//   30   53:istore          7
		ignoreCacheOnError = flag;
	//   31   55:aload_0         
	//   32   56:iload           7
	//   33   58:putfield        #92  <Field boolean ignoreCacheOnError>
		flag = flag1;
	//   34   61:iload           8
	//   35   63:istore          7
		if((i & 4) != 0)
	//*  36   65:iload           5
	//*  37   67:iconst_4        
	//*  38   68:iand            
	//*  39   69:ifeq            75
			flag = true;
	//   40   72:iconst_1        
	//   41   73:istore          7
		ignoreCacheForUnsetLengthRequests = flag;
	//   42   75:aload_0         
	//   43   76:iload           7
	//   44   78:putfield        #94  <Field boolean ignoreCacheForUnsetLengthRequests>
		upstreamDataSource = datasource;
	//   45   81:aload_0         
	//   46   82:aload_2         
	//   47   83:putfield        #96  <Field DataSource upstreamDataSource>
		if(datasink != null)
	//*  48   86:aload           4
	//*  49   88:ifnull          108
			cacheWriteDataSource = ((DataSource) (new TeeDataSource(datasource, datasink)));
	//   50   91:aload_0         
	//   51   92:new             #98  <Class TeeDataSource>
	//   52   95:dup             
	//   53   96:aload_2         
	//   54   97:aload           4
	//   55   99:invokespecial   #101 <Method void TeeDataSource(DataSource, DataSink)>
	//   56  102:putfield        #103 <Field DataSource cacheWriteDataSource>
		else
	//*  57  105:goto            113
			cacheWriteDataSource = null;
	//   58  108:aload_0         
	//   59  109:aconst_null     
	//   60  110:putfield        #103 <Field DataSource cacheWriteDataSource>
		eventListener = eventlistener;
	//   61  113:aload_0         
	//   62  114:aload           6
	//   63  116:putfield        #105 <Field CacheDataSource$EventListener eventListener>
	//   64  119:return          
	}

	private void closeCurrentSource()
		throws IOException
	{
		if(currentDataSource == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #111 <Field DataSource currentDataSource>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		currentDataSource.close();
	//    4    8:aload_0         
	//    5    9:getfield        #111 <Field DataSource currentDataSource>
	//    6   12:invokeinterface #114 <Method void DataSource.close()>
		currentDataSource = null;
	//    7   17:aload_0         
	//    8   18:aconst_null     
	//    9   19:putfield        #111 <Field DataSource currentDataSource>
		currentDataSpecLengthUnset = false;
	//   10   22:aload_0         
	//   11   23:iconst_0        
	//   12   24:putfield        #116 <Field boolean currentDataSpecLengthUnset>
		if(currentHoleSpan != null)
	//*  13   27:aload_0         
	//*  14   28:getfield        #118 <Field CacheSpan currentHoleSpan>
	//*  15   31:ifnull          52
		{
			cache.releaseHoleSpan(currentHoleSpan);
	//   16   34:aload_0         
	//   17   35:getfield        #86  <Field Cache cache>
	//   18   38:aload_0         
	//   19   39:getfield        #118 <Field CacheSpan currentHoleSpan>
	//   20   42:invokeinterface #124 <Method void Cache.releaseHoleSpan(CacheSpan)>
			currentHoleSpan = null;
	//   21   47:aload_0         
	//   22   48:aconst_null     
	//   23   49:putfield        #118 <Field CacheSpan currentHoleSpan>
		}
		return;
	//   24   52:return          
		Exception exception;
		exception;
	//   25   53:astore_1        
		currentDataSource = null;
	//   26   54:aload_0         
	//   27   55:aconst_null     
	//   28   56:putfield        #111 <Field DataSource currentDataSource>
		currentDataSpecLengthUnset = false;
	//   29   59:aload_0         
	//   30   60:iconst_0        
	//   31   61:putfield        #116 <Field boolean currentDataSpecLengthUnset>
		if(currentHoleSpan != null)
	//*  32   64:aload_0         
	//*  33   65:getfield        #118 <Field CacheSpan currentHoleSpan>
	//*  34   68:ifnull          89
		{
			cache.releaseHoleSpan(currentHoleSpan);
	//   35   71:aload_0         
	//   36   72:getfield        #86  <Field Cache cache>
	//   37   75:aload_0         
	//   38   76:getfield        #118 <Field CacheSpan currentHoleSpan>
	//   39   79:invokeinterface #124 <Method void Cache.releaseHoleSpan(CacheSpan)>
			currentHoleSpan = null;
	//   40   84:aload_0         
	//   41   85:aconst_null     
	//   42   86:putfield        #118 <Field CacheSpan currentHoleSpan>
		}
		throw exception;
	//   43   89:aload_1         
	//   44   90:athrow          
	}

	private static Uri getRedirectedUriOrDefault(Cache cache1, String s, Uri uri1)
	{
		s = ((String) (ContentMetadataInternal.getRedirectedUri(cache1.getContentMetadata(s))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #131 <Method ContentMetadata Cache.getContentMetadata(String)>
	//    3    7:invokestatic    #137 <Method Uri ContentMetadataInternal.getRedirectedUri(ContentMetadata)>
	//    4   10:astore_1        
		cache1 = ((Cache) (s));
	//    5   11:aload_1         
	//    6   12:astore_0        
		if(s == null)
	//*   7   13:aload_1         
	//*   8   14:ifnonnull       19
			cache1 = ((Cache) (uri1));
	//    9   17:aload_2         
	//   10   18:astore_0        
		return ((Uri) (cache1));
	//   11   19:aload_0         
	//   12   20:areturn         
	}

	private void handleBeforeThrow(IOException ioexception)
	{
		if(isReadingFromCache() || (ioexception instanceof Cache.CacheException))
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #143 <Method boolean isReadingFromCache()>
	//*   2    4:ifne            14
	//*   3    7:aload_1         
	//*   4    8:instanceof      #145 <Class Cache$CacheException>
	//*   5   11:ifeq            19
			seenCacheError = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #147 <Field boolean seenCacheError>
	//    9   19:return          
	}

	private boolean isBypassingCache()
	{
		return currentDataSource == upstreamDataSource;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field DataSource currentDataSource>
	//    2    4:aload_0         
	//    3    5:getfield        #96  <Field DataSource upstreamDataSource>
	//    4    8:if_acmpne       13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	private static boolean isCausedByPositionOutOfRange(IOException ioexception)
	{
		for(; ioexception != null; ioexception = ((IOException) (((Throwable) (ioexception)).getCause())))
	//*   0    0:aload_0         
	//*   1    1:ifnull          31
			if((ioexception instanceof DataSourceException) && ((DataSourceException)ioexception).reason == 0)
	//*   2    4:aload_0         
	//*   3    5:instanceof      #152 <Class DataSourceException>
	//*   4    8:ifeq            23
	//*   5   11:aload_0         
	//*   6   12:checkcast       #152 <Class DataSourceException>
	//*   7   15:getfield        #155 <Field int DataSourceException.reason>
	//*   8   18:ifne            23
				return true;
	//    9   21:iconst_1        
	//   10   22:ireturn         

	//   11   23:aload_0         
	//   12   24:invokevirtual   #161 <Method Throwable Throwable.getCause()>
	//   13   27:astore_0        
	//*  14   28:goto            0
		return false;
	//   15   31:iconst_0        
	//   16   32:ireturn         
	}

	private boolean isReadingFromCache()
	{
		return currentDataSource == cacheReadDataSource;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field DataSource currentDataSource>
	//    2    4:aload_0         
	//    3    5:getfield        #88  <Field DataSource cacheReadDataSource>
	//    4    8:if_acmpne       13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	private boolean isReadingFromUpstream()
	{
		return isReadingFromCache() ^ true;
	//    0    0:aload_0         
	//    1    1:invokespecial   #143 <Method boolean isReadingFromCache()>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:ireturn         
	}

	private boolean isWritingToCache()
	{
		return currentDataSource == cacheWriteDataSource;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field DataSource currentDataSource>
	//    2    4:aload_0         
	//    3    5:getfield        #103 <Field DataSource cacheWriteDataSource>
	//    4    8:if_acmpne       13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	private void notifyBytesRead()
	{
		if(eventListener != null && totalCachedBytesRead > 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #105 <Field CacheDataSource$EventListener eventListener>
	//*   2    4:ifnull          43
	//*   3    7:aload_0         
	//*   4    8:getfield        #166 <Field long totalCachedBytesRead>
	//*   5   11:lconst_0        
	//*   6   12:lcmp            
	//*   7   13:ifle            43
		{
			eventListener.onCachedBytesRead(cache.getCacheSpace(), totalCachedBytesRead);
	//    8   16:aload_0         
	//    9   17:getfield        #105 <Field CacheDataSource$EventListener eventListener>
	//   10   20:aload_0         
	//   11   21:getfield        #86  <Field Cache cache>
	//   12   24:invokeinterface #170 <Method long Cache.getCacheSpace()>
	//   13   29:aload_0         
	//   14   30:getfield        #166 <Field long totalCachedBytesRead>
	//   15   33:invokeinterface #174 <Method void CacheDataSource$EventListener.onCachedBytesRead(long, long)>
			totalCachedBytesRead = 0L;
	//   16   38:aload_0         
	//   17   39:lconst_0        
	//   18   40:putfield        #166 <Field long totalCachedBytesRead>
		}
	//   19   43:return          
	}

	private void notifyCacheIgnored(int i)
	{
		if(eventListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #105 <Field CacheDataSource$EventListener eventListener>
	//*   2    4:ifnull          17
			eventListener.onCacheIgnored(i);
	//    3    7:aload_0         
	//    4    8:getfield        #105 <Field CacheDataSource$EventListener eventListener>
	//    5   11:iload_1         
	//    6   12:invokeinterface #179 <Method void CacheDataSource$EventListener.onCacheIgnored(int)>
	//    7   17:return          
	}

	private void openNextSource(boolean flag)
		throws IOException
	{
		InterruptedException interruptedexception;
		Object obj;
		if(currentRequestIgnoresCache)
	//*   0    0:aload_0         
	//*   1    1:getfield        #185 <Field boolean currentRequestIgnoresCache>
	//*   2    4:ifeq            13
			obj = null;
	//    3    7:aconst_null     
	//    4    8:astore          6
		else
	//*   5   10:goto            75
		if(blockOnCache)
	//*   6   13:aload_0         
	//*   7   14:getfield        #90  <Field boolean blockOnCache>
	//*   8   17:ifeq            56
			try
			{
				obj = ((Object) (cache.startReadWrite(key, readPosition)));
	//    9   20:aload_0         
	//   10   21:getfield        #86  <Field Cache cache>
	//   11   24:aload_0         
	//   12   25:getfield        #187 <Field String key>
	//   13   28:aload_0         
	//   14   29:getfield        #189 <Field long readPosition>
	//   15   32:invokeinterface #193 <Method CacheSpan Cache.startReadWrite(String, long)>
	//   16   37:astore          6
			}
	//*  17   39:goto            75
	//*  18   42:invokestatic    #199 <Method Thread Thread.currentThread()>
	//*  19   45:invokevirtual   #202 <Method void Thread.interrupt()>
	//*  20   48:new             #204 <Class InterruptedIOException>
	//*  21   51:dup             
	//*  22   52:invokespecial   #205 <Method void InterruptedIOException()>
	//*  23   55:athrow          
	//*  24   56:aload_0         
	//*  25   57:getfield        #86  <Field Cache cache>
	//*  26   60:aload_0         
	//*  27   61:getfield        #187 <Field String key>
	//*  28   64:aload_0         
	//*  29   65:getfield        #189 <Field long readPosition>
	//*  30   68:invokeinterface #208 <Method CacheSpan Cache.startReadWriteNonBlocking(String, long)>
	//*  31   73:astore          6
	//*  32   75:aload           6
	//*  33   77:ifnonnull       126
	//*  34   80:aload_0         
	//*  35   81:getfield        #96  <Field DataSource upstreamDataSource>
	//*  36   84:astore          9
	//*  37   86:new             #210 <Class DataSpec>
	//*  38   89:dup             
	//*  39   90:aload_0         
	//*  40   91:getfield        #212 <Field Uri uri>
	//*  41   94:aload_0         
	//*  42   95:getfield        #189 <Field long readPosition>
	//*  43   98:aload_0         
	//*  44   99:getfield        #214 <Field long bytesRemaining>
	//*  45  102:aload_0         
	//*  46  103:getfield        #187 <Field String key>
	//*  47  106:aload_0         
	//*  48  107:getfield        #216 <Field int flags>
	//*  49  110:invokespecial   #219 <Method void DataSpec(Uri, long, long, String, int)>
	//*  50  113:astore          7
	//*  51  115:aload           6
	//*  52  117:astore          8
	//*  53  119:aload           9
	//*  54  121:astore          6
	//*  55  123:goto            355
	//*  56  126:aload           6
	//*  57  128:getfield        #224 <Field boolean CacheSpan.isCached>
	//*  58  131:ifeq            231
	//*  59  134:aload           6
	//*  60  136:getfield        #228 <Field java.io.File CacheSpan.file>
	//*  61  139:invokestatic    #234 <Method Uri Uri.fromFile(java.io.File)>
	//*  62  142:astore          7
	//*  63  144:aload_0         
	//*  64  145:getfield        #189 <Field long readPosition>
	//*  65  148:aload           6
	//*  66  150:getfield        #237 <Field long CacheSpan.position>
	//*  67  153:lsub            
	//*  68  154:lstore          4
	//*  69  156:aload           6
	//*  70  158:getfield        #240 <Field long CacheSpan.length>
	//*  71  161:lload           4
	//*  72  163:lsub            
	//*  73  164:lstore_2        
	//*  74  165:aload_0         
	//*  75  166:getfield        #214 <Field long bytesRemaining>
	//*  76  169:ldc2w           #241 <Long -1L>
	//*  77  172:lcmp            
	//*  78  173:ifeq            188
	//*  79  176:lload_2         
	//*  80  177:aload_0         
	//*  81  178:getfield        #214 <Field long bytesRemaining>
	//*  82  181:invokestatic    #248 <Method long Math.min(long, long)>
	//*  83  184:lstore_2        
	//*  84  185:goto            188
	//*  85  188:new             #210 <Class DataSpec>
	//*  86  191:dup             
	//*  87  192:aload           7
	//*  88  194:aload_0         
	//*  89  195:getfield        #189 <Field long readPosition>
	//*  90  198:lload           4
	//*  91  200:lload_2         
	//*  92  201:aload_0         
	//*  93  202:getfield        #187 <Field String key>
	//*  94  205:aload_0         
	//*  95  206:getfield        #216 <Field int flags>
	//*  96  209:invokespecial   #251 <Method void DataSpec(Uri, long, long, long, String, int)>
	//*  97  212:astore          7
	//*  98  214:aload_0         
	//*  99  215:getfield        #88  <Field DataSource cacheReadDataSource>
	//* 100  218:astore          9
	//* 101  220:aload           6
	//* 102  222:astore          8
	//* 103  224:aload           9
	//* 104  226:astore          6
	//* 105  228:goto            355
	//* 106  231:aload           6
	//* 107  233:invokevirtual   #254 <Method boolean CacheSpan.isOpenEnded()>
	//* 108  236:ifeq            247
	//* 109  239:aload_0         
	//* 110  240:getfield        #214 <Field long bytesRemaining>
	//* 111  243:lstore_2        
	//* 112  244:goto            281
	//* 113  247:aload           6
	//* 114  249:getfield        #240 <Field long CacheSpan.length>
	//* 115  252:lstore          4
	//* 116  254:lload           4
	//* 117  256:lstore_2        
	//* 118  257:aload_0         
	//* 119  258:getfield        #214 <Field long bytesRemaining>
	//* 120  261:ldc2w           #241 <Long -1L>
	//* 121  264:lcmp            
	//* 122  265:ifeq            244
	//* 123  268:lload           4
	//* 124  270:aload_0         
	//* 125  271:getfield        #214 <Field long bytesRemaining>
	//* 126  274:invokestatic    #248 <Method long Math.min(long, long)>
	//* 127  277:lstore_2        
	//* 128  278:goto            244
	//* 129  281:new             #210 <Class DataSpec>
	//* 130  284:dup             
	//* 131  285:aload_0         
	//* 132  286:getfield        #212 <Field Uri uri>
	//* 133  289:aload_0         
	//* 134  290:getfield        #189 <Field long readPosition>
	//* 135  293:lload_2         
	//* 136  294:aload_0         
	//* 137  295:getfield        #187 <Field String key>
	//* 138  298:aload_0         
	//* 139  299:getfield        #216 <Field int flags>
	//* 140  302:invokespecial   #219 <Method void DataSpec(Uri, long, long, String, int)>
	//* 141  305:astore          7
	//* 142  307:aload_0         
	//* 143  308:getfield        #103 <Field DataSource cacheWriteDataSource>
	//* 144  311:ifnull          331
	//* 145  314:aload_0         
	//* 146  315:getfield        #103 <Field DataSource cacheWriteDataSource>
	//* 147  318:astore          9
	//* 148  320:aload           6
	//* 149  322:astore          8
	//* 150  324:aload           9
	//* 151  326:astore          6
	//* 152  328:goto            355
	//* 153  331:aload_0         
	//* 154  332:getfield        #96  <Field DataSource upstreamDataSource>
	//* 155  335:astore          9
	//* 156  337:aload_0         
	//* 157  338:getfield        #86  <Field Cache cache>
	//* 158  341:aload           6
	//* 159  343:invokeinterface #124 <Method void Cache.releaseHoleSpan(CacheSpan)>
	//* 160  348:aconst_null     
	//* 161  349:astore          8
	//* 162  351:aload           9
	//* 163  353:astore          6
	//* 164  355:aload_0         
	//* 165  356:getfield        #185 <Field boolean currentRequestIgnoresCache>
	//* 166  359:ifne            383
	//* 167  362:aload           6
	//* 168  364:aload_0         
	//* 169  365:getfield        #96  <Field DataSource upstreamDataSource>
	//* 170  368:if_acmpne       383
	//* 171  371:aload_0         
	//* 172  372:getfield        #189 <Field long readPosition>
	//* 173  375:ldc2w           #33  <Long 0x19000L>
	//* 174  378:ladd            
	//* 175  379:lstore_2        
	//* 176  380:goto            387
	//* 177  383:ldc2w           #255 <Long 0xffffffffL>
	//* 178  386:lstore_2        
	//* 179  387:aload_0         
	//* 180  388:lload_2         
	//* 181  389:putfield        #258 <Field long checkCachePosition>
	//* 182  392:iload_1         
	//* 183  393:ifeq            444
	//* 184  396:aload_0         
	//* 185  397:invokespecial   #260 <Method boolean isBypassingCache()>
	//* 186  400:invokestatic    #265 <Method void Assertions.checkState(boolean)>
	//* 187  403:aload           6
	//* 188  405:aload_0         
	//* 189  406:getfield        #96  <Field DataSource upstreamDataSource>
	//* 190  409:if_acmpne       413
	//* 191  412:return          
	//* 192  413:aload_0         
	//* 193  414:invokespecial   #267 <Method void closeCurrentSource()>
	//* 194  417:goto            444
	//* 195  420:astore          6
	//* 196  422:aload           8
	//* 197  424:invokevirtual   #270 <Method boolean CacheSpan.isHoleSpan()>
	//* 198  427:ifeq            441
	//* 199  430:aload_0         
	//* 200  431:getfield        #86  <Field Cache cache>
	//* 201  434:aload           8
	//* 202  436:invokeinterface #124 <Method void Cache.releaseHoleSpan(CacheSpan)>
	//* 203  441:aload           6
	//* 204  443:athrow          
	//* 205  444:aload           8
	//* 206  446:ifnull          463
	//* 207  449:aload           8
	//* 208  451:invokevirtual   #270 <Method boolean CacheSpan.isHoleSpan()>
	//* 209  454:ifeq            463
	//* 210  457:aload_0         
	//* 211  458:aload           8
	//* 212  460:putfield        #118 <Field CacheSpan currentHoleSpan>
	//* 213  463:aload_0         
	//* 214  464:aload           6
	//* 215  466:putfield        #111 <Field DataSource currentDataSource>
	//* 216  469:aload           7
	//* 217  471:getfield        #271 <Field long DataSpec.length>
	//* 218  474:ldc2w           #241 <Long -1L>
	//* 219  477:lcmp            
	//* 220  478:ifne            486
	//* 221  481:iconst_1        
	//* 222  482:istore_1        
	//* 223  483:goto            488
	//* 224  486:iconst_0        
	//* 225  487:istore_1        
	//* 226  488:aload_0         
	//* 227  489:iload_1         
	//* 228  490:putfield        #116 <Field boolean currentDataSpecLengthUnset>
	//* 229  493:aload           6
	//* 230  495:aload           7
	//* 231  497:invokeinterface #275 <Method long DataSource.open(DataSpec)>
	//* 232  502:lstore_2        
	//* 233  503:new             #277 <Class ContentMetadataMutations>
	//* 234  506:dup             
	//* 235  507:invokespecial   #278 <Method void ContentMetadataMutations()>
	//* 236  510:astore          6
	//* 237  512:aload_0         
	//* 238  513:getfield        #116 <Field boolean currentDataSpecLengthUnset>
	//* 239  516:ifeq            546
	//* 240  519:lload_2         
	//* 241  520:ldc2w           #241 <Long -1L>
	//* 242  523:lcmp            
	//* 243  524:ifeq            546
	//* 244  527:aload_0         
	//* 245  528:lload_2         
	//* 246  529:putfield        #214 <Field long bytesRemaining>
	//* 247  532:aload           6
	//* 248  534:aload_0         
	//* 249  535:getfield        #189 <Field long readPosition>
	//* 250  538:aload_0         
	//* 251  539:getfield        #214 <Field long bytesRemaining>
	//* 252  542:ladd            
	//* 253  543:invokestatic    #282 <Method void ContentMetadataInternal.setContentLength(ContentMetadataMutations, long)>
	//* 254  546:aload_0         
	//* 255  547:invokespecial   #284 <Method boolean isReadingFromUpstream()>
	//* 256  550:ifeq            599
	//* 257  553:aload_0         
	//* 258  554:aload_0         
	//* 259  555:getfield        #111 <Field DataSource currentDataSource>
	//* 260  558:invokeinterface #288 <Method Uri DataSource.getUri()>
	//* 261  563:putfield        #290 <Field Uri actualUri>
	//* 262  566:aload_0         
	//* 263  567:getfield        #212 <Field Uri uri>
	//* 264  570:aload_0         
	//* 265  571:getfield        #290 <Field Uri actualUri>
	//* 266  574:invokevirtual   #294 <Method boolean Uri.equals(Object)>
	//* 267  577:iconst_1        
	//* 268  578:ixor            
	//* 269  579:ifeq            594
	//* 270  582:aload           6
	//* 271  584:aload_0         
	//* 272  585:getfield        #290 <Field Uri actualUri>
	//* 273  588:invokestatic    #298 <Method void ContentMetadataInternal.setRedirectedUri(ContentMetadataMutations, Uri)>
	//* 274  591:goto            599
	//* 275  594:aload           6
	//* 276  596:invokestatic    #302 <Method void ContentMetadataInternal.removeRedirectedUri(ContentMetadataMutations)>
	//* 277  599:aload_0         
	//* 278  600:invokespecial   #304 <Method boolean isWritingToCache()>
	//* 279  603:ifeq            621
	//* 280  606:aload_0         
	//* 281  607:getfield        #86  <Field Cache cache>
	//* 282  610:aload_0         
	//* 283  611:getfield        #187 <Field String key>
	//* 284  614:aload           6
	//* 285  616:invokeinterface #308 <Method void Cache.applyContentMetadataMutations(String, ContentMetadataMutations)>
	//* 286  621:return          
			// Misplaced declaration of an exception variable
			catch(InterruptedException interruptedexception)
			{
				Thread.currentThread().interrupt();
				throw new InterruptedIOException();
			}
		else
			obj = ((Object) (cache.startReadWriteNonBlocking(key, readPosition)));
		Object obj1;
		Object obj2;
		if(obj == null)
		{
			DataSource datasource = upstreamDataSource;
			obj1 = ((Object) (new DataSpec(uri, readPosition, bytesRemaining, key, flags)));
			obj2 = obj;
			obj = ((Object) (datasource));
		} else
		if(((CacheSpan) (obj)).isCached)
		{
			obj1 = ((Object) (Uri.fromFile(((CacheSpan) (obj)).file)));
			long l3 = readPosition - ((CacheSpan) (obj)).position;
			long l = ((CacheSpan) (obj)).length - l3;
			if(bytesRemaining != -1L)
				l = Math.min(l, bytesRemaining);
			obj1 = ((Object) (new DataSpec(((Uri) (obj1)), readPosition, l3, l, key, flags)));
			DataSource datasource1 = cacheReadDataSource;
			obj2 = obj;
			obj = ((Object) (datasource1));
		} else
		{
			long l1;
			if(((CacheSpan) (obj)).isOpenEnded())
			{
				l1 = bytesRemaining;
			} else
			{
				long l4 = ((CacheSpan) (obj)).length;
				l1 = l4;
				if(bytesRemaining != -1L)
					l1 = Math.min(l4, bytesRemaining);
			}
			obj1 = ((Object) (new DataSpec(uri, readPosition, l1, key, flags)));
			if(cacheWriteDataSource != null)
			{
				DataSource datasource2 = cacheWriteDataSource;
				obj2 = obj;
				obj = ((Object) (datasource2));
			} else
			{
				DataSource datasource3 = upstreamDataSource;
				cache.releaseHoleSpan(((CacheSpan) (obj)));
				obj2 = null;
				obj = ((Object) (datasource3));
			}
		}
		long l2;
		if(!currentRequestIgnoresCache && obj == upstreamDataSource)
			l2 = readPosition + 0x19000L;
		else
			l2 = 0xffffffffL;
		checkCachePosition = l2;
		if(flag)
		{
			Assertions.checkState(isBypassingCache());
			if(obj == upstreamDataSource)
				return;
			try
			{
				closeCurrentSource();
			}
			// Misplaced declaration of an exception variable
			catch(Object obj)
			{
				if(((CacheSpan) (obj2)).isHoleSpan())
					cache.releaseHoleSpan(((CacheSpan) (obj2)));
				throw obj;
			}
		}
		if(obj2 != null && ((CacheSpan) (obj2)).isHoleSpan())
			currentHoleSpan = ((CacheSpan) (obj2));
		currentDataSource = ((DataSource) (obj));
		if(((DataSpec) (obj1)).length == -1L)
			flag = true;
		else
			flag = false;
		currentDataSpecLengthUnset = flag;
		l2 = ((DataSource) (obj)).open(((DataSpec) (obj1)));
		obj = ((Object) (new ContentMetadataMutations()));
		if(currentDataSpecLengthUnset && l2 != -1L)
		{
			bytesRemaining = l2;
			ContentMetadataInternal.setContentLength(((ContentMetadataMutations) (obj)), readPosition + bytesRemaining);
		}
		if(isReadingFromUpstream())
		{
			actualUri = currentDataSource.getUri();
			if(uri.equals(((Object) (actualUri))) ^ true)
				ContentMetadataInternal.setRedirectedUri(((ContentMetadataMutations) (obj)), actualUri);
			else
				ContentMetadataInternal.removeRedirectedUri(((ContentMetadataMutations) (obj)));
		}
		if(isWritingToCache())
			cache.applyContentMetadataMutations(key, ((ContentMetadataMutations) (obj)));
	//* 287  622:astore          6
	//* 288  624:goto            42
	}

	private void setNoBytesRemainingAndMaybeStoreLength()
		throws IOException
	{
		bytesRemaining = 0L;
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:putfield        #214 <Field long bytesRemaining>
		if(isWritingToCache())
	//*   3    5:aload_0         
	//*   4    6:invokespecial   #304 <Method boolean isWritingToCache()>
	//*   5    9:ifeq            29
			cache.setContentLength(key, readPosition);
	//    6   12:aload_0         
	//    7   13:getfield        #86  <Field Cache cache>
	//    8   16:aload_0         
	//    9   17:getfield        #187 <Field String key>
	//   10   20:aload_0         
	//   11   21:getfield        #189 <Field long readPosition>
	//   12   24:invokeinterface #312 <Method void Cache.setContentLength(String, long)>
	//   13   29:return          
	}

	private int shouldIgnoreCacheForRequest(DataSpec dataspec)
	{
		if(ignoreCacheOnError && seenCacheError)
	//*   0    0:aload_0         
	//*   1    1:getfield        #92  <Field boolean ignoreCacheOnError>
	//*   2    4:ifeq            16
	//*   3    7:aload_0         
	//*   4    8:getfield        #147 <Field boolean seenCacheError>
	//*   5   11:ifeq            16
			return 0;
	//    6   14:iconst_0        
	//    7   15:ireturn         
		return !ignoreCacheForUnsetLengthRequests || dataspec.length != -1L ? -1 : 1;
	//    8   16:aload_0         
	//    9   17:getfield        #94  <Field boolean ignoreCacheForUnsetLengthRequests>
	//   10   20:ifeq            36
	//   11   23:aload_1         
	//   12   24:getfield        #271 <Field long DataSpec.length>
	//   13   27:ldc2w           #241 <Long -1L>
	//   14   30:lcmp            
	//   15   31:ifne            36
	//   16   34:iconst_1        
	//   17   35:ireturn         
	//   18   36:iconst_m1       
	//   19   37:ireturn         
	}

	public void close()
		throws IOException
	{
		uri = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #212 <Field Uri uri>
		actualUri = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #290 <Field Uri actualUri>
		notifyBytesRead();
	//    6   10:aload_0         
	//    7   11:invokespecial   #316 <Method void notifyBytesRead()>
		try
		{
			closeCurrentSource();
	//    8   14:aload_0         
	//    9   15:invokespecial   #267 <Method void closeCurrentSource()>
			return;
	//   10   18:return          
		}
		catch(IOException ioexception)
	//*  11   19:astore_1        
		{
			handleBeforeThrow(ioexception);
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokespecial   #318 <Method void handleBeforeThrow(IOException)>
			throw ioexception;
	//   15   25:aload_1         
	//   16   26:athrow          
		}
	}

	public Uri getUri()
	{
		return actualUri;
	//    0    0:aload_0         
	//    1    1:getfield        #290 <Field Uri actualUri>
	//    2    4:areturn         
	}

	public long open(DataSpec dataspec)
		throws IOException
	{
		int i;
		boolean flag;
		long l;
		try
		{
			key = CacheUtil.getKey(dataspec);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #324 <Method String CacheUtil.getKey(DataSpec)>
	//    3    5:putfield        #187 <Field String key>
			uri = dataspec.uri;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #325 <Field Uri DataSpec.uri>
	//    7   13:putfield        #212 <Field Uri uri>
			actualUri = getRedirectedUriOrDefault(cache, key, uri);
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #86  <Field Cache cache>
	//   11   21:aload_0         
	//   12   22:getfield        #187 <Field String key>
	//   13   25:aload_0         
	//   14   26:getfield        #212 <Field Uri uri>
	//   15   29:invokestatic    #327 <Method Uri getRedirectedUriOrDefault(Cache, String, Uri)>
	//   16   32:putfield        #290 <Field Uri actualUri>
			flags = dataspec.flags;
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:getfield        #328 <Field int DataSpec.flags>
	//   20   40:putfield        #216 <Field int flags>
			readPosition = dataspec.position;
	//   21   43:aload_0         
	//   22   44:aload_1         
	//   23   45:getfield        #329 <Field long DataSpec.position>
	//   24   48:putfield        #189 <Field long readPosition>
			i = shouldIgnoreCacheForRequest(dataspec);
	//   25   51:aload_0         
	//   26   52:aload_1         
	//   27   53:invokespecial   #331 <Method int shouldIgnoreCacheForRequest(DataSpec)>
	//   28   56:istore_2        
		}
	//*  29   57:iload_2         
	//*  30   58:iconst_m1       
	//*  31   59:icmpeq          194
	//*  32   62:iconst_1        
	//*  33   63:istore_3        
	//*  34   64:goto            67
	//*  35   67:aload_0         
	//*  36   68:iload_3         
	//*  37   69:putfield        #185 <Field boolean currentRequestIgnoresCache>
	//*  38   72:aload_0         
	//*  39   73:getfield        #185 <Field boolean currentRequestIgnoresCache>
	//*  40   76:ifeq            84
	//*  41   79:aload_0         
	//*  42   80:iload_2         
	//*  43   81:invokespecial   #333 <Method void notifyCacheIgnored(int)>
	//*  44   84:aload_1         
	//*  45   85:getfield        #271 <Field long DataSpec.length>
	//*  46   88:ldc2w           #241 <Long -1L>
	//*  47   91:lcmp            
	//*  48   92:ifne            164
	//*  49   95:aload_0         
	//*  50   96:getfield        #185 <Field boolean currentRequestIgnoresCache>
	//*  51   99:ifeq            105
	//*  52  102:goto            164
	//*  53  105:aload_0         
	//*  54  106:aload_0         
	//*  55  107:getfield        #86  <Field Cache cache>
	//*  56  110:aload_0         
	//*  57  111:getfield        #187 <Field String key>
	//*  58  114:invokeinterface #337 <Method long Cache.getContentLength(String)>
	//*  59  119:putfield        #214 <Field long bytesRemaining>
	//*  60  122:aload_0         
	//*  61  123:getfield        #214 <Field long bytesRemaining>
	//*  62  126:ldc2w           #241 <Long -1L>
	//*  63  129:lcmp            
	//*  64  130:ifeq            172
	//*  65  133:aload_0         
	//*  66  134:aload_0         
	//*  67  135:getfield        #214 <Field long bytesRemaining>
	//*  68  138:aload_1         
	//*  69  139:getfield        #329 <Field long DataSpec.position>
	//*  70  142:lsub            
	//*  71  143:putfield        #214 <Field long bytesRemaining>
	//*  72  146:aload_0         
	//*  73  147:getfield        #214 <Field long bytesRemaining>
	//*  74  150:lconst_0        
	//*  75  151:lcmp            
	//*  76  152:ifgt            172
	//*  77  155:new             #152 <Class DataSourceException>
	//*  78  158:dup             
	//*  79  159:iconst_0        
	//*  80  160:invokespecial   #339 <Method void DataSourceException(int)>
	//*  81  163:athrow          
	//*  82  164:aload_0         
	//*  83  165:aload_1         
	//*  84  166:getfield        #271 <Field long DataSpec.length>
	//*  85  169:putfield        #214 <Field long bytesRemaining>
	//*  86  172:aload_0         
	//*  87  173:iconst_0        
	//*  88  174:invokespecial   #341 <Method void openNextSource(boolean)>
	//*  89  177:aload_0         
	//*  90  178:getfield        #214 <Field long bytesRemaining>
	//*  91  181:lstore          4
	//*  92  183:lload           4
	//*  93  185:lreturn         
		// Misplaced declaration of an exception variable
		catch(DataSpec dataspec)
	//*  94  186:astore_1        
		{
			handleBeforeThrow(((IOException) (dataspec)));
	//   95  187:aload_0         
	//   96  188:aload_1         
	//   97  189:invokespecial   #318 <Method void handleBeforeThrow(IOException)>
			throw dataspec;
	//   98  192:aload_1         
	//   99  193:athrow          
		}
		if(i != -1)
			flag = true;
		else
			flag = false;
	//  100  194:iconst_0        
	//  101  195:istore_3        
		currentRequestIgnoresCache = flag;
		if(currentRequestIgnoresCache)
			notifyCacheIgnored(i);
		if(dataspec.length != -1L || currentRequestIgnoresCache)
			break MISSING_BLOCK_LABEL_164;
		bytesRemaining = cache.getContentLength(key);
		if(bytesRemaining != -1L)
		{
			bytesRemaining = bytesRemaining - dataspec.position;
			if(bytesRemaining <= 0L)
				throw new DataSourceException(0);
		}
		break MISSING_BLOCK_LABEL_172;
		bytesRemaining = dataspec.length;
		openNextSource(false);
		l = bytesRemaining;
		return l;
	//* 102  196:goto            67
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		int k;
		if(j == 0)
	//*   0    0:iload_3         
	//*   1    1:ifne            6
			return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		if(bytesRemaining == 0L)
	//*   4    6:aload_0         
	//*   5    7:getfield        #214 <Field long bytesRemaining>
	//*   6   10:lconst_0        
	//*   7   11:lcmp            
	//*   8   12:ifne            17
			return -1;
	//    9   15:iconst_m1       
	//   10   16:ireturn         
		long l;
		long l1;
		try
		{
			if(readPosition >= checkCachePosition)
	//*  11   17:aload_0         
	//*  12   18:getfield        #189 <Field long readPosition>
	//*  13   21:aload_0         
	//*  14   22:getfield        #258 <Field long checkCachePosition>
	//*  15   25:lcmp            
	//*  16   26:iflt            34
				openNextSource(true);
	//   17   29:aload_0         
	//   18   30:iconst_1        
	//   19   31:invokespecial   #341 <Method void openNextSource(boolean)>
			k = currentDataSource.read(abyte0, i, j);
	//   20   34:aload_0         
	//   21   35:getfield        #111 <Field DataSource currentDataSource>
	//   22   38:aload_1         
	//   23   39:iload_2         
	//   24   40:iload_3         
	//   25   41:invokeinterface #345 <Method int DataSource.read(byte[], int, int)>
	//   26   46:istore          4
		}
	//*  27   48:iload           4
	//*  28   50:iconst_m1       
	//*  29   51:icmpeq          118
	//*  30   54:aload_0         
	//*  31   55:invokespecial   #143 <Method boolean isReadingFromCache()>
	//*  32   58:ifeq            73
	//*  33   61:aload_0         
	//*  34   62:aload_0         
	//*  35   63:getfield        #166 <Field long totalCachedBytesRead>
	//*  36   66:iload           4
	//*  37   68:i2l             
	//*  38   69:ladd            
	//*  39   70:putfield        #166 <Field long totalCachedBytesRead>
	//*  40   73:aload_0         
	//*  41   74:getfield        #189 <Field long readPosition>
	//*  42   77:lstore          5
	//*  43   79:iload           4
	//*  44   81:i2l             
	//*  45   82:lstore          7
	//*  46   84:aload_0         
	//*  47   85:lload           5
	//*  48   87:lload           7
	//*  49   89:ladd            
	//*  50   90:putfield        #189 <Field long readPosition>
	//*  51   93:aload_0         
	//*  52   94:getfield        #214 <Field long bytesRemaining>
	//*  53   97:ldc2w           #241 <Long -1L>
	//*  54  100:lcmp            
	//*  55  101:ifeq            202
	//*  56  104:aload_0         
	//*  57  105:aload_0         
	//*  58  106:getfield        #214 <Field long bytesRemaining>
	//*  59  109:lload           7
	//*  60  111:lsub            
	//*  61  112:putfield        #214 <Field long bytesRemaining>
	//*  62  115:iload           4
	//*  63  117:ireturn         
	//*  64  118:aload_0         
	//*  65  119:getfield        #116 <Field boolean currentDataSpecLengthUnset>
	//*  66  122:ifeq            132
	//*  67  125:aload_0         
	//*  68  126:invokespecial   #347 <Method void setNoBytesRemainingAndMaybeStoreLength()>
	//*  69  129:iload           4
	//*  70  131:ireturn         
	//*  71  132:aload_0         
	//*  72  133:getfield        #214 <Field long bytesRemaining>
	//*  73  136:lconst_0        
	//*  74  137:lcmp            
	//*  75  138:ifgt            155
	//*  76  141:aload_0         
	//*  77  142:getfield        #214 <Field long bytesRemaining>
	//*  78  145:ldc2w           #241 <Long -1L>
	//*  79  148:lcmp            
	//*  80  149:ifne            202
	//*  81  152:goto            155
	//*  82  155:aload_0         
	//*  83  156:invokespecial   #267 <Method void closeCurrentSource()>
	//*  84  159:aload_0         
	//*  85  160:iconst_0        
	//*  86  161:invokespecial   #341 <Method void openNextSource(boolean)>
	//*  87  164:aload_0         
	//*  88  165:aload_1         
	//*  89  166:iload_2         
	//*  90  167:iload_3         
	//*  91  168:invokevirtual   #348 <Method int read(byte[], int, int)>
	//*  92  171:istore_2        
	//*  93  172:iload_2         
	//*  94  173:ireturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  95  174:astore_1        
		{
			if(currentDataSpecLengthUnset && isCausedByPositionOutOfRange(((IOException) (abyte0))))
	//*  96  175:aload_0         
	//*  97  176:getfield        #116 <Field boolean currentDataSpecLengthUnset>
	//*  98  179:ifeq            195
	//*  99  182:aload_1         
	//* 100  183:invokestatic    #350 <Method boolean isCausedByPositionOutOfRange(IOException)>
	//* 101  186:ifeq            195
			{
				setNoBytesRemainingAndMaybeStoreLength();
	//  102  189:aload_0         
	//  103  190:invokespecial   #347 <Method void setNoBytesRemainingAndMaybeStoreLength()>
				return -1;
	//  104  193:iconst_m1       
	//  105  194:ireturn         
			} else
			{
				handleBeforeThrow(((IOException) (abyte0)));
	//  106  195:aload_0         
	//  107  196:aload_1         
	//  108  197:invokespecial   #318 <Method void handleBeforeThrow(IOException)>
				throw abyte0;
	//  109  200:aload_1         
	//  110  201:athrow          
			}
		}
		if(k == -1)
			break MISSING_BLOCK_LABEL_118;
		if(isReadingFromCache())
			totalCachedBytesRead = totalCachedBytesRead + (long)k;
		l = readPosition;
		l1 = k;
		readPosition = l + l1;
		if(bytesRemaining == -1L)
			break MISSING_BLOCK_LABEL_202;
		bytesRemaining = bytesRemaining - l1;
		return k;
		if(!currentDataSpecLengthUnset)
			break MISSING_BLOCK_LABEL_132;
		setNoBytesRemainingAndMaybeStoreLength();
		return k;
		if(bytesRemaining <= 0L && bytesRemaining != -1L)
			break MISSING_BLOCK_LABEL_202;
		closeCurrentSource();
		openNextSource(false);
		i = read(abyte0, i, j);
		return i;
		return k;
	//  111  202:iload           4
	//  112  204:ireturn         
	}

	public static final int CACHE_IGNORED_REASON_ERROR = 0;
	public static final int CACHE_IGNORED_REASON_UNSET_LENGTH = 1;
	private static final int CACHE_NOT_IGNORED = -1;
	public static final long DEFAULT_MAX_CACHE_FILE_SIZE = 0x200000L;
	public static final int FLAG_BLOCK_ON_CACHE = 1;
	public static final int FLAG_IGNORE_CACHE_FOR_UNSET_LENGTH_REQUESTS = 4;
	public static final int FLAG_IGNORE_CACHE_ON_ERROR = 2;
	private static final long MIN_READ_BEFORE_CHECKING_CACHE = 0x19000L;
	private Uri actualUri;
	private final boolean blockOnCache;
	private long bytesRemaining;
	private final Cache cache;
	private final DataSource cacheReadDataSource;
	private final DataSource cacheWriteDataSource;
	private long checkCachePosition;
	private DataSource currentDataSource;
	private boolean currentDataSpecLengthUnset;
	private CacheSpan currentHoleSpan;
	private boolean currentRequestIgnoresCache;
	private final EventListener eventListener;
	private int flags;
	private final boolean ignoreCacheForUnsetLengthRequests;
	private final boolean ignoreCacheOnError;
	private String key;
	private long readPosition;
	private boolean seenCacheError;
	private long totalCachedBytesRead;
	private final DataSource upstreamDataSource;
	private Uri uri;
}
