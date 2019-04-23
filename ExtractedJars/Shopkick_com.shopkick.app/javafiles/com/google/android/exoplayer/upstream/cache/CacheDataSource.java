// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream.cache;

import android.net.Uri;
import android.util.Log;
import com.google.android.exoplayer.upstream.*;
import java.io.IOException;
import java.io.InterruptedIOException;

// Referenced classes of package com.google.android.exoplayer.upstream.cache:
//			CacheDataSink, Cache, CacheSpan

public final class CacheDataSource
	implements DataSource
{
	public static interface EventListener
	{

		public abstract void onCachedBytesRead(long l, long l1);
	}


	public CacheDataSource(Cache cache1, DataSource datasource, DataSource datasource1, DataSink datasink, boolean flag, boolean flag1, EventListener eventlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		cache = cache1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #44  <Field Cache cache>
		cacheReadDataSource = datasource1;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #46  <Field DataSource cacheReadDataSource>
		blockOnCache = flag;
	//    8   14:aload_0         
	//    9   15:iload           5
	//   10   17:putfield        #48  <Field boolean blockOnCache>
		ignoreCacheOnError = flag1;
	//   11   20:aload_0         
	//   12   21:iload           6
	//   13   23:putfield        #50  <Field boolean ignoreCacheOnError>
		upstreamDataSource = datasource;
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:putfield        #52  <Field DataSource upstreamDataSource>
		if(datasink != null)
	//*  17   31:aload           4
	//*  18   33:ifnull          53
			cacheWriteDataSource = ((DataSource) (new TeeDataSource(datasource, datasink)));
	//   19   36:aload_0         
	//   20   37:new             #54  <Class TeeDataSource>
	//   21   40:dup             
	//   22   41:aload_2         
	//   23   42:aload           4
	//   24   44:invokespecial   #57  <Method void TeeDataSource(DataSource, DataSink)>
	//   25   47:putfield        #59  <Field DataSource cacheWriteDataSource>
		else
	//*  26   50:goto            58
			cacheWriteDataSource = null;
	//   27   53:aload_0         
	//   28   54:aconst_null     
	//   29   55:putfield        #59  <Field DataSource cacheWriteDataSource>
		eventListener = eventlistener;
	//   30   58:aload_0         
	//   31   59:aload           7
	//   32   61:putfield        #61  <Field CacheDataSource$EventListener eventListener>
	//   33   64:return          
	}

	public CacheDataSource(Cache cache1, DataSource datasource, boolean flag, boolean flag1)
	{
		this(cache1, datasource, flag, flag1, 0xffffffffL);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:ldc2w           #64  <Long 0xffffffffL>
	//    6    9:invokespecial   #68  <Method void CacheDataSource(Cache, DataSource, boolean, boolean, long)>
	//    7   12:return          
	}

	public CacheDataSource(Cache cache1, DataSource datasource, boolean flag, boolean flag1, long l)
	{
		this(cache1, datasource, ((DataSource) (new FileDataSource())), ((DataSink) (new CacheDataSink(cache1, l))), flag, flag1, ((EventListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #70  <Class FileDataSource>
	//    4    6:dup             
	//    5    7:invokespecial   #71  <Method void FileDataSource()>
	//    6   10:new             #73  <Class CacheDataSink>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:lload           5
	//   10   17:invokespecial   #76  <Method void CacheDataSink(Cache, long)>
	//   11   20:iload_3         
	//   12   21:iload           4
	//   13   23:aconst_null     
	//   14   24:invokespecial   #78  <Method void CacheDataSource(Cache, DataSource, DataSource, DataSink, boolean, boolean, CacheDataSource$EventListener)>
	//   15   27:return          
	}

	private void closeCurrentSource()
		throws IOException
	{
		DataSource datasource;
		datasource = currentDataSource;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field DataSource currentDataSource>
	//    2    4:astore_1        
		if(datasource == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		datasource.close();
	//    6   10:aload_1         
	//    7   11:invokeinterface #86  <Method void DataSource.close()>
		currentDataSource = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #83  <Field DataSource currentDataSource>
		CacheSpan cachespan = lockedSpan;
	//   11   21:aload_0         
	//   12   22:getfield        #88  <Field CacheSpan lockedSpan>
	//   13   25:astore_1        
		if(cachespan != null)
	//*  14   26:aload_1         
	//*  15   27:ifnull          45
		{
			cache.releaseHoleSpan(cachespan);
	//   16   30:aload_0         
	//   17   31:getfield        #44  <Field Cache cache>
	//   18   34:aload_1         
	//   19   35:invokeinterface #94  <Method void Cache.releaseHoleSpan(CacheSpan)>
			lockedSpan = null;
	//   20   40:aload_0         
	//   21   41:aconst_null     
	//   22   42:putfield        #88  <Field CacheSpan lockedSpan>
		}
		return;
	//   23   45:return          
		Exception exception;
		exception;
	//   24   46:astore_1        
		CacheSpan cachespan1 = lockedSpan;
	//   25   47:aload_0         
	//   26   48:getfield        #88  <Field CacheSpan lockedSpan>
	//   27   51:astore_2        
		if(cachespan1 != null)
	//*  28   52:aload_2         
	//*  29   53:ifnull          71
		{
			cache.releaseHoleSpan(cachespan1);
	//   30   56:aload_0         
	//   31   57:getfield        #44  <Field Cache cache>
	//   32   60:aload_2         
	//   33   61:invokeinterface #94  <Method void Cache.releaseHoleSpan(CacheSpan)>
			lockedSpan = null;
	//   34   66:aload_0         
	//   35   67:aconst_null     
	//   36   68:putfield        #88  <Field CacheSpan lockedSpan>
		}
		throw exception;
	//   37   71:aload_1         
	//   38   72:athrow          
	}

	private void handleBeforeThrow(IOException ioexception)
	{
		if(ignoreCacheOnError && (currentDataSource == cacheReadDataSource || (ioexception instanceof Cache.CacheException)))
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field boolean ignoreCacheOnError>
	//*   2    4:ifeq            30
	//*   3    7:aload_0         
	//*   4    8:getfield        #83  <Field DataSource currentDataSource>
	//*   5   11:aload_0         
	//*   6   12:getfield        #46  <Field DataSource cacheReadDataSource>
	//*   7   15:if_acmpeq       25
	//*   8   18:aload_1         
	//*   9   19:instanceof      #99  <Class Cache$CacheException>
	//*  10   22:ifeq            30
			ignoreCache = true;
	//   11   25:aload_0         
	//   12   26:iconst_1        
	//   13   27:putfield        #101 <Field boolean ignoreCache>
	//   14   30:return          
	}

	private void notifyBytesRead()
	{
		EventListener eventlistener = eventListener;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field CacheDataSource$EventListener eventListener>
	//    2    4:astore_1        
		if(eventlistener != null && totalCachedBytesRead > 0L)
	//*   3    5:aload_1         
	//*   4    6:ifnull          42
	//*   5    9:aload_0         
	//*   6   10:getfield        #104 <Field long totalCachedBytesRead>
	//*   7   13:lconst_0        
	//*   8   14:lcmp            
	//*   9   15:ifle            42
		{
			eventlistener.onCachedBytesRead(cache.getCacheSpace(), totalCachedBytesRead);
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #44  <Field Cache cache>
	//   13   23:invokeinterface #108 <Method long Cache.getCacheSpace()>
	//   14   28:aload_0         
	//   15   29:getfield        #104 <Field long totalCachedBytesRead>
	//   16   32:invokeinterface #112 <Method void CacheDataSource$EventListener.onCachedBytesRead(long, long)>
			totalCachedBytesRead = 0L;
	//   17   37:aload_0         
	//   18   38:lconst_0        
	//   19   39:putfield        #104 <Field long totalCachedBytesRead>
		}
	//   20   42:return          
	}

	private void openNextSource()
		throws IOException
	{
		InterruptedException interruptedexception;
		boolean flag = ignoreCache;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field boolean ignoreCache>
	//    2    4:istore_1        
		Object obj = null;
	//    3    5:aconst_null     
	//    4    6:astore          6
		if(!flag)
	//*   5    8:iload_1         
	//*   6    9:ifeq            15
	//*   7   12:goto            93
			if(bytesRemaining == -1L)
	//*   8   15:aload_0         
	//*   9   16:getfield        #117 <Field long bytesRemaining>
	//*  10   19:ldc2w           #118 <Long -1L>
	//*  11   22:lcmp            
	//*  12   23:ifne            37
				Log.w("CacheDataSource", "Cache bypassed due to unbounded length.");
	//   13   26:ldc1            #13  <String "CacheDataSource">
	//   14   28:ldc1            #121 <String "Cache bypassed due to unbounded length.">
	//   15   30:invokestatic    #127 <Method int Log.w(String, String)>
	//   16   33:pop             
			else
	//*  17   34:goto            93
			if(blockOnCache)
	//*  18   37:aload_0         
	//*  19   38:getfield        #48  <Field boolean blockOnCache>
	//*  20   41:ifeq            74
				try
				{
					obj = ((Object) (cache.startReadWrite(key, readPosition)));
	//   21   44:aload_0         
	//   22   45:getfield        #44  <Field Cache cache>
	//   23   48:aload_0         
	//   24   49:getfield        #129 <Field String key>
	//   25   52:aload_0         
	//   26   53:getfield        #131 <Field long readPosition>
	//   27   56:invokeinterface #135 <Method CacheSpan Cache.startReadWrite(String, long)>
	//   28   61:astore          6
				}
	//*  29   63:goto            93
	//*  30   66:new             #137 <Class InterruptedIOException>
	//*  31   69:dup             
	//*  32   70:invokespecial   #138 <Method void InterruptedIOException()>
	//*  33   73:athrow          
	//*  34   74:aload_0         
	//*  35   75:getfield        #44  <Field Cache cache>
	//*  36   78:aload_0         
	//*  37   79:getfield        #129 <Field String key>
	//*  38   82:aload_0         
	//*  39   83:getfield        #131 <Field long readPosition>
	//*  40   86:invokeinterface #141 <Method CacheSpan Cache.startReadWriteNonBlocking(String, long)>
	//*  41   91:astore          6
	//*  42   93:aload           6
	//*  43   95:ifnonnull       138
	//*  44   98:aload_0         
	//*  45   99:aload_0         
	//*  46  100:getfield        #52  <Field DataSource upstreamDataSource>
	//*  47  103:putfield        #83  <Field DataSource currentDataSource>
	//*  48  106:new             #143 <Class DataSpec>
	//*  49  109:dup             
	//*  50  110:aload_0         
	//*  51  111:getfield        #145 <Field Uri uri>
	//*  52  114:aload_0         
	//*  53  115:getfield        #131 <Field long readPosition>
	//*  54  118:aload_0         
	//*  55  119:getfield        #117 <Field long bytesRemaining>
	//*  56  122:aload_0         
	//*  57  123:getfield        #129 <Field String key>
	//*  58  126:aload_0         
	//*  59  127:getfield        #147 <Field int flags>
	//*  60  130:invokespecial   #150 <Method void DataSpec(Uri, long, long, String, int)>
	//*  61  133:astore          6
	//*  62  135:goto            311
	//*  63  138:aload           6
	//*  64  140:getfield        #155 <Field boolean CacheSpan.isCached>
	//*  65  143:ifeq            220
	//*  66  146:aload           6
	//*  67  148:getfield        #159 <Field java.io.File CacheSpan.file>
	//*  68  151:invokestatic    #165 <Method Uri Uri.fromFile(java.io.File)>
	//*  69  154:astore          7
	//*  70  156:aload_0         
	//*  71  157:getfield        #131 <Field long readPosition>
	//*  72  160:aload           6
	//*  73  162:getfield        #168 <Field long CacheSpan.position>
	//*  74  165:lsub            
	//*  75  166:lstore_2        
	//*  76  167:aload           6
	//*  77  169:getfield        #171 <Field long CacheSpan.length>
	//*  78  172:lload_2         
	//*  79  173:lsub            
	//*  80  174:aload_0         
	//*  81  175:getfield        #117 <Field long bytesRemaining>
	//*  82  178:invokestatic    #177 <Method long Math.min(long, long)>
	//*  83  181:lstore          4
	//*  84  183:new             #143 <Class DataSpec>
	//*  85  186:dup             
	//*  86  187:aload           7
	//*  87  189:aload_0         
	//*  88  190:getfield        #131 <Field long readPosition>
	//*  89  193:lload_2         
	//*  90  194:lload           4
	//*  91  196:aload_0         
	//*  92  197:getfield        #129 <Field String key>
	//*  93  200:aload_0         
	//*  94  201:getfield        #147 <Field int flags>
	//*  95  204:invokespecial   #180 <Method void DataSpec(Uri, long, long, long, String, int)>
	//*  96  207:astore          6
	//*  97  209:aload_0         
	//*  98  210:aload_0         
	//*  99  211:getfield        #46  <Field DataSource cacheReadDataSource>
	//* 100  214:putfield        #83  <Field DataSource currentDataSource>
	//* 101  217:goto            311
	//* 102  220:aload_0         
	//* 103  221:aload           6
	//* 104  223:putfield        #88  <Field CacheSpan lockedSpan>
	//* 105  226:aload           6
	//* 106  228:invokevirtual   #184 <Method boolean CacheSpan.isOpenEnded()>
	//* 107  231:ifeq            242
	//* 108  234:aload_0         
	//* 109  235:getfield        #117 <Field long bytesRemaining>
	//* 110  238:lstore_2        
	//* 111  239:goto            255
	//* 112  242:aload           6
	//* 113  244:getfield        #171 <Field long CacheSpan.length>
	//* 114  247:aload_0         
	//* 115  248:getfield        #117 <Field long bytesRemaining>
	//* 116  251:invokestatic    #177 <Method long Math.min(long, long)>
	//* 117  254:lstore_2        
	//* 118  255:new             #143 <Class DataSpec>
	//* 119  258:dup             
	//* 120  259:aload_0         
	//* 121  260:getfield        #145 <Field Uri uri>
	//* 122  263:aload_0         
	//* 123  264:getfield        #131 <Field long readPosition>
	//* 124  267:lload_2         
	//* 125  268:aload_0         
	//* 126  269:getfield        #129 <Field String key>
	//* 127  272:aload_0         
	//* 128  273:getfield        #147 <Field int flags>
	//* 129  276:invokespecial   #150 <Method void DataSpec(Uri, long, long, String, int)>
	//* 130  279:astore          7
	//* 131  281:aload_0         
	//* 132  282:getfield        #59  <Field DataSource cacheWriteDataSource>
	//* 133  285:astore          6
	//* 134  287:aload           6
	//* 135  289:ifnull          295
	//* 136  292:goto            301
	//* 137  295:aload_0         
	//* 138  296:getfield        #52  <Field DataSource upstreamDataSource>
	//* 139  299:astore          6
	//* 140  301:aload_0         
	//* 141  302:aload           6
	//* 142  304:putfield        #83  <Field DataSource currentDataSource>
	//* 143  307:aload           7
	//* 144  309:astore          6
	//* 145  311:aload_0         
	//* 146  312:getfield        #83  <Field DataSource currentDataSource>
	//* 147  315:aload           6
	//* 148  317:invokeinterface #188 <Method long DataSource.open(DataSpec)>
	//* 149  322:pop2            
	//* 150  323:return          
				// Misplaced declaration of an exception variable
				catch(InterruptedException interruptedexception)
				{
					throw new InterruptedIOException();
				}
			else
				obj = ((Object) (cache.startReadWriteNonBlocking(key, readPosition)));
		if(obj == null)
		{
			currentDataSource = upstreamDataSource;
			obj = ((Object) (new DataSpec(uri, readPosition, bytesRemaining, key, flags)));
		} else
		if(((CacheSpan) (obj)).isCached)
		{
			Uri uri1 = Uri.fromFile(((CacheSpan) (obj)).file);
			long l = readPosition - ((CacheSpan) (obj)).position;
			long l2 = Math.min(((CacheSpan) (obj)).length - l, bytesRemaining);
			obj = ((Object) (new DataSpec(uri1, readPosition, l, l2, key, flags)));
			currentDataSource = cacheReadDataSource;
		} else
		{
			lockedSpan = ((CacheSpan) (obj));
			long l1;
			if(((CacheSpan) (obj)).isOpenEnded())
				l1 = bytesRemaining;
			else
				l1 = Math.min(((CacheSpan) (obj)).length, bytesRemaining);
			DataSpec dataspec = new DataSpec(uri, readPosition, l1, key, flags);
			obj = ((Object) (cacheWriteDataSource));
			if(obj == null)
				obj = ((Object) (upstreamDataSource));
			currentDataSource = ((DataSource) (obj));
			obj = ((Object) (dataspec));
		}
		currentDataSource.open(((DataSpec) (obj)));
	//* 151  324:astore          6
	//* 152  326:goto            66
	}

	public void close()
		throws IOException
	{
		notifyBytesRead();
	//    0    0:aload_0         
	//    1    1:invokespecial   #190 <Method void notifyBytesRead()>
		try
		{
			closeCurrentSource();
	//    2    4:aload_0         
	//    3    5:invokespecial   #192 <Method void closeCurrentSource()>
			return;
	//    4    8:return          
		}
		catch(IOException ioexception)
	//*   5    9:astore_1        
		{
			handleBeforeThrow(ioexception);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #194 <Method void handleBeforeThrow(IOException)>
			throw ioexception;
	//    9   15:aload_1         
	//   10   16:athrow          
		}
	}

	public long open(DataSpec dataspec)
		throws IOException
	{
		long l;
		try
		{
			uri = dataspec.uri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #195 <Field Uri DataSpec.uri>
	//    3    5:putfield        #145 <Field Uri uri>
			flags = dataspec.flags;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #196 <Field int DataSpec.flags>
	//    7   13:putfield        #147 <Field int flags>
			key = dataspec.key;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:getfield        #197 <Field String DataSpec.key>
	//   11   21:putfield        #129 <Field String key>
			readPosition = dataspec.position;
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:getfield        #198 <Field long DataSpec.position>
	//   15   29:putfield        #131 <Field long readPosition>
			bytesRemaining = dataspec.length;
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:getfield        #199 <Field long DataSpec.length>
	//   19   37:putfield        #117 <Field long bytesRemaining>
			openNextSource();
	//   20   40:aload_0         
	//   21   41:invokespecial   #201 <Method void openNextSource()>
			l = dataspec.length;
	//   22   44:aload_1         
	//   23   45:getfield        #199 <Field long DataSpec.length>
	//   24   48:lstore_2        
		}
	//*  25   49:lload_2         
	//*  26   50:lreturn         
		// Misplaced declaration of an exception variable
		catch(DataSpec dataspec)
	//*  27   51:astore_1        
		{
			handleBeforeThrow(((IOException) (dataspec)));
	//   28   52:aload_0         
	//   29   53:aload_1         
	//   30   54:invokespecial   #194 <Method void handleBeforeThrow(IOException)>
			throw dataspec;
	//   31   57:aload_1         
	//   32   58:athrow          
		}
		return l;
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		int k;
		long l;
		long l1;
		try
		{
			k = currentDataSource.read(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field DataSource currentDataSource>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokeinterface #205 <Method int DataSource.read(byte[], int, int)>
	//    6   12:istore          4
		}
	//*   7   14:iload           4
	//*   8   16:iflt            87
	//*   9   19:aload_0         
	//*  10   20:getfield        #83  <Field DataSource currentDataSource>
	//*  11   23:aload_0         
	//*  12   24:getfield        #46  <Field DataSource cacheReadDataSource>
	//*  13   27:if_acmpne       42
	//*  14   30:aload_0         
	//*  15   31:aload_0         
	//*  16   32:getfield        #104 <Field long totalCachedBytesRead>
	//*  17   35:iload           4
	//*  18   37:i2l             
	//*  19   38:ladd            
	//*  20   39:putfield        #104 <Field long totalCachedBytesRead>
	//*  21   42:aload_0         
	//*  22   43:getfield        #131 <Field long readPosition>
	//*  23   46:lstore          5
	//*  24   48:iload           4
	//*  25   50:i2l             
	//*  26   51:lstore          7
	//*  27   53:aload_0         
	//*  28   54:lload           5
	//*  29   56:lload           7
	//*  30   58:ladd            
	//*  31   59:putfield        #131 <Field long readPosition>
	//*  32   62:aload_0         
	//*  33   63:getfield        #117 <Field long bytesRemaining>
	//*  34   66:ldc2w           #118 <Long -1L>
	//*  35   69:lcmp            
	//*  36   70:ifeq            125
	//*  37   73:aload_0         
	//*  38   74:aload_0         
	//*  39   75:getfield        #117 <Field long bytesRemaining>
	//*  40   78:lload           7
	//*  41   80:lsub            
	//*  42   81:putfield        #117 <Field long bytesRemaining>
	//*  43   84:iload           4
	//*  44   86:ireturn         
	//*  45   87:aload_0         
	//*  46   88:invokespecial   #192 <Method void closeCurrentSource()>
	//*  47   91:aload_0         
	//*  48   92:getfield        #117 <Field long bytesRemaining>
	//*  49   95:lconst_0        
	//*  50   96:lcmp            
	//*  51   97:ifle            125
	//*  52  100:aload_0         
	//*  53  101:getfield        #117 <Field long bytesRemaining>
	//*  54  104:ldc2w           #118 <Long -1L>
	//*  55  107:lcmp            
	//*  56  108:ifeq            125
	//*  57  111:aload_0         
	//*  58  112:invokespecial   #201 <Method void openNextSource()>
	//*  59  115:aload_0         
	//*  60  116:aload_1         
	//*  61  117:iload_2         
	//*  62  118:iload_3         
	//*  63  119:invokevirtual   #206 <Method int read(byte[], int, int)>
	//*  64  122:istore_2        
	//*  65  123:iload_2         
	//*  66  124:ireturn         
	//*  67  125:iload           4
	//*  68  127:ireturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  69  128:astore_1        
		{
			handleBeforeThrow(((IOException) (abyte0)));
	//   70  129:aload_0         
	//   71  130:aload_1         
	//   72  131:invokespecial   #194 <Method void handleBeforeThrow(IOException)>
			throw abyte0;
	//   73  134:aload_1         
	//   74  135:athrow          
		}
		if(k < 0)
			break MISSING_BLOCK_LABEL_87;
		if(currentDataSource == cacheReadDataSource)
			totalCachedBytesRead = totalCachedBytesRead + (long)k;
		l = readPosition;
		l1 = k;
		readPosition = l + l1;
		if(bytesRemaining == -1L)
			break MISSING_BLOCK_LABEL_125;
		bytesRemaining = bytesRemaining - l1;
		return k;
		closeCurrentSource();
		if(bytesRemaining <= 0L || bytesRemaining == -1L)
			break MISSING_BLOCK_LABEL_125;
		openNextSource();
		i = read(abyte0, i, j);
		return i;
		return k;
	}

	private static final String TAG = "CacheDataSource";
	private final boolean blockOnCache;
	private long bytesRemaining;
	private final Cache cache;
	private final DataSource cacheReadDataSource;
	private final DataSource cacheWriteDataSource;
	private DataSource currentDataSource;
	private final EventListener eventListener;
	private int flags;
	private boolean ignoreCache;
	private final boolean ignoreCacheOnError;
	private String key;
	private CacheSpan lockedSpan;
	private long readPosition;
	private long totalCachedBytesRead;
	private final DataSource upstreamDataSource;
	private Uri uri;
}
