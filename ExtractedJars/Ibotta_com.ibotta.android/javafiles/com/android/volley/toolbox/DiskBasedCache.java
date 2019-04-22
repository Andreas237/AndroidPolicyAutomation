// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.volley.*;
import java.io.*;
import java.util.*;

// Referenced classes of package com.android.volley.toolbox:
//			HttpHeaderParser

public class DiskBasedCache
	implements Cache
{
	static class CacheHeader
	{

		private static List getAllResponseHeaders(com.android.volley.Cache.Entry entry)
		{
			if(entry.allResponseHeaders != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #70  <Field List com.android.volley.Cache$Entry.allResponseHeaders>
		//*   2    4:ifnull          12
				return entry.allResponseHeaders;
		//    3    7:aload_0         
		//    4    8:getfield        #70  <Field List com.android.volley.Cache$Entry.allResponseHeaders>
		//    5   11:areturn         
			else
				return HttpHeaderParser.toAllHeaderList(entry.responseHeaders);
		//    6   12:aload_0         
		//    7   13:getfield        #74  <Field Map com.android.volley.Cache$Entry.responseHeaders>
		//    8   16:invokestatic    #80  <Method List HttpHeaderParser.toAllHeaderList(Map)>
		//    9   19:areturn         
		}

		static CacheHeader readHeader(CountingInputStream countinginputstream)
			throws IOException
		{
			if(DiskBasedCache.readInt(((InputStream) (countinginputstream))) == 0x20150306)
		//*   0    0:aload_0         
		//*   1    1:invokestatic    #89  <Method int DiskBasedCache.readInt(InputStream)>
		//*   2    4:ldc1            #90  <Int 0x20150306>
		//*   3    6:icmpne          45
				return new CacheHeader(DiskBasedCache.readString(countinginputstream), DiskBasedCache.readString(countinginputstream), DiskBasedCache.readLong(((InputStream) (countinginputstream))), DiskBasedCache.readLong(((InputStream) (countinginputstream))), DiskBasedCache.readLong(((InputStream) (countinginputstream))), DiskBasedCache.readLong(((InputStream) (countinginputstream))), DiskBasedCache.readHeaderList(countinginputstream));
		//    4    9:new             #2   <Class DiskBasedCache$CacheHeader>
		//    5   12:dup             
		//    6   13:aload_0         
		//    7   14:invokestatic    #94  <Method String DiskBasedCache.readString(DiskBasedCache$CountingInputStream)>
		//    8   17:aload_0         
		//    9   18:invokestatic    #94  <Method String DiskBasedCache.readString(DiskBasedCache$CountingInputStream)>
		//   10   21:aload_0         
		//   11   22:invokestatic    #98  <Method long DiskBasedCache.readLong(InputStream)>
		//   12   25:aload_0         
		//   13   26:invokestatic    #98  <Method long DiskBasedCache.readLong(InputStream)>
		//   14   29:aload_0         
		//   15   30:invokestatic    #98  <Method long DiskBasedCache.readLong(InputStream)>
		//   16   33:aload_0         
		//   17   34:invokestatic    #98  <Method long DiskBasedCache.readLong(InputStream)>
		//   18   37:aload_0         
		//   19   38:invokestatic    #102 <Method List DiskBasedCache.readHeaderList(DiskBasedCache$CountingInputStream)>
		//   20   41:invokespecial   #40  <Method void DiskBasedCache$CacheHeader(String, String, long, long, long, long, List)>
		//   21   44:areturn         
			else
				throw new IOException();
		//   22   45:new             #85  <Class IOException>
		//   23   48:dup             
		//   24   49:invokespecial   #103 <Method void IOException()>
		//   25   52:athrow          
		}

		com.android.volley.Cache.Entry toCacheEntry(byte abyte0[])
		{
			com.android.volley.Cache.Entry entry = new com.android.volley.Cache.Entry();
		//    0    0:new             #23  <Class com.android.volley.Cache$Entry>
		//    1    3:dup             
		//    2    4:invokespecial   #107 <Method void com.android.volley.Cache$Entry()>
		//    3    7:astore_2        
			entry.data = abyte0;
		//    4    8:aload_2         
		//    5    9:aload_1         
		//    6   10:putfield        #44  <Field byte[] com.android.volley.Cache$Entry.data>
			entry.etag = etag;
		//    7   13:aload_2         
		//    8   14:aload_0         
		//    9   15:getfield        #61  <Field String etag>
		//   10   18:putfield        #25  <Field String com.android.volley.Cache$Entry.etag>
			entry.serverDate = serverDate;
		//   11   21:aload_2         
		//   12   22:aload_0         
		//   13   23:getfield        #62  <Field long serverDate>
		//   14   26:putfield        #27  <Field long com.android.volley.Cache$Entry.serverDate>
			entry.lastModified = lastModified;
		//   15   29:aload_2         
		//   16   30:aload_0         
		//   17   31:getfield        #63  <Field long lastModified>
		//   18   34:putfield        #29  <Field long com.android.volley.Cache$Entry.lastModified>
			entry.ttl = ttl;
		//   19   37:aload_2         
		//   20   38:aload_0         
		//   21   39:getfield        #64  <Field long ttl>
		//   22   42:putfield        #31  <Field long com.android.volley.Cache$Entry.ttl>
			entry.softTtl = softTtl;
		//   23   45:aload_2         
		//   24   46:aload_0         
		//   25   47:getfield        #65  <Field long softTtl>
		//   26   50:putfield        #33  <Field long com.android.volley.Cache$Entry.softTtl>
			entry.responseHeaders = HttpHeaderParser.toHeaderMap(allResponseHeaders);
		//   27   53:aload_2         
		//   28   54:aload_0         
		//   29   55:getfield        #67  <Field List allResponseHeaders>
		//   30   58:invokestatic    #111 <Method Map HttpHeaderParser.toHeaderMap(List)>
		//   31   61:putfield        #74  <Field Map com.android.volley.Cache$Entry.responseHeaders>
			entry.allResponseHeaders = Collections.unmodifiableList(allResponseHeaders);
		//   32   64:aload_2         
		//   33   65:aload_0         
		//   34   66:getfield        #67  <Field List allResponseHeaders>
		//   35   69:invokestatic    #117 <Method List Collections.unmodifiableList(List)>
		//   36   72:putfield        #70  <Field List com.android.volley.Cache$Entry.allResponseHeaders>
			return entry;
		//   37   75:aload_2         
		//   38   76:areturn         
		}

		boolean writeHeader(OutputStream outputstream)
		{
			DiskBasedCache.writeInt(outputstream, 0x20150306);
		//    0    0:aload_1         
		//    1    1:ldc1            #90  <Int 0x20150306>
		//    2    3:invokestatic    #123 <Method void DiskBasedCache.writeInt(OutputStream, int)>
			DiskBasedCache.writeString(outputstream, key);
		//    3    6:aload_1         
		//    4    7:aload_0         
		//    5    8:getfield        #52  <Field String key>
		//    6   11:invokestatic    #127 <Method void DiskBasedCache.writeString(OutputStream, String)>
			String s;
			if(etag == null)
		//*   7   14:aload_0         
		//*   8   15:getfield        #61  <Field String etag>
		//*   9   18:ifnonnull       27
			{
				s = "";
		//   10   21:ldc1            #54  <String "">
		//   11   23:astore_2        
				break MISSING_BLOCK_LABEL_32;
		//   12   24:goto            32
			}
			s = etag;
		//   13   27:aload_0         
		//   14   28:getfield        #61  <Field String etag>
		//   15   31:astore_2        
			DiskBasedCache.writeString(outputstream, s);
		//   16   32:aload_1         
		//   17   33:aload_2         
		//   18   34:invokestatic    #127 <Method void DiskBasedCache.writeString(OutputStream, String)>
			DiskBasedCache.writeLong(outputstream, serverDate);
		//   19   37:aload_1         
		//   20   38:aload_0         
		//   21   39:getfield        #62  <Field long serverDate>
		//   22   42:invokestatic    #131 <Method void DiskBasedCache.writeLong(OutputStream, long)>
			DiskBasedCache.writeLong(outputstream, lastModified);
		//   23   45:aload_1         
		//   24   46:aload_0         
		//   25   47:getfield        #63  <Field long lastModified>
		//   26   50:invokestatic    #131 <Method void DiskBasedCache.writeLong(OutputStream, long)>
			DiskBasedCache.writeLong(outputstream, ttl);
		//   27   53:aload_1         
		//   28   54:aload_0         
		//   29   55:getfield        #64  <Field long ttl>
		//   30   58:invokestatic    #131 <Method void DiskBasedCache.writeLong(OutputStream, long)>
			DiskBasedCache.writeLong(outputstream, softTtl);
		//   31   61:aload_1         
		//   32   62:aload_0         
		//   33   63:getfield        #65  <Field long softTtl>
		//   34   66:invokestatic    #131 <Method void DiskBasedCache.writeLong(OutputStream, long)>
			DiskBasedCache.writeHeaderList(allResponseHeaders, outputstream);
		//   35   69:aload_0         
		//   36   70:getfield        #67  <Field List allResponseHeaders>
		//   37   73:aload_1         
		//   38   74:invokestatic    #135 <Method void DiskBasedCache.writeHeaderList(List, OutputStream)>
			outputstream.flush();
		//   39   77:aload_1         
		//   40   78:invokevirtual   #140 <Method void OutputStream.flush()>
			return true;
		//   41   81:iconst_1        
		//   42   82:ireturn         
			outputstream;
		//   43   83:astore_1        
			VolleyLog.d("%s", new Object[] {
				((IOException) (outputstream)).toString()
			});
		//   44   84:ldc1            #142 <String "%s">
		//   45   86:iconst_1        
		//   46   87:anewarray       Object[]
		//   47   90:dup             
		//   48   91:iconst_0        
		//   49   92:aload_1         
		//   50   93:invokevirtual   #146 <Method String IOException.toString()>
		//   51   96:aastore         
		//   52   97:invokestatic    #152 <Method void VolleyLog.d(String, Object[])>
			return false;
		//   53  100:iconst_0        
		//   54  101:ireturn         
		}

		final List allResponseHeaders;
		final String etag;
		final String key;
		final long lastModified;
		final long serverDate;
		long size;
		final long softTtl;
		final long ttl;

		CacheHeader(String s, com.android.volley.Cache.Entry entry)
		{
			this(s, entry.etag, entry.serverDate, entry.lastModified, entry.ttl, entry.softTtl, getAllResponseHeaders(entry));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:getfield        #25  <Field String com.android.volley.Cache$Entry.etag>
		//    4    6:aload_2         
		//    5    7:getfield        #27  <Field long com.android.volley.Cache$Entry.serverDate>
		//    6   10:aload_2         
		//    7   11:getfield        #29  <Field long com.android.volley.Cache$Entry.lastModified>
		//    8   14:aload_2         
		//    9   15:getfield        #31  <Field long com.android.volley.Cache$Entry.ttl>
		//   10   18:aload_2         
		//   11   19:getfield        #33  <Field long com.android.volley.Cache$Entry.softTtl>
		//   12   22:aload_2         
		//   13   23:invokestatic    #37  <Method List getAllResponseHeaders(com.android.volley.Cache$Entry)>
		//   14   26:invokespecial   #40  <Method void DiskBasedCache$CacheHeader(String, String, long, long, long, long, List)>
			size = entry.data.length;
		//   15   29:aload_0         
		//   16   30:aload_2         
		//   17   31:getfield        #44  <Field byte[] com.android.volley.Cache$Entry.data>
		//   18   34:arraylength     
		//   19   35:i2l             
		//   20   36:putfield        #46  <Field long size>
		//   21   39:return          
		}

		private CacheHeader(String s, String s1, long l, long l1, long l2, long l3, List list)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #50  <Method void Object()>
			key = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #52  <Field String key>
			s = s1;
		//    5    9:aload_2         
		//    6   10:astore_1        
			if("".equals(((Object) (s1))))
		//*   7   11:ldc1            #54  <String "">
		//*   8   13:aload_2         
		//*   9   14:invokevirtual   #60  <Method boolean String.equals(Object)>
		//*  10   17:ifeq            22
				s = null;
		//   11   20:aconst_null     
		//   12   21:astore_1        
			etag = s;
		//   13   22:aload_0         
		//   14   23:aload_1         
		//   15   24:putfield        #61  <Field String etag>
			serverDate = l;
		//   16   27:aload_0         
		//   17   28:lload_3         
		//   18   29:putfield        #62  <Field long serverDate>
			lastModified = l1;
		//   19   32:aload_0         
		//   20   33:lload           5
		//   21   35:putfield        #63  <Field long lastModified>
			ttl = l2;
		//   22   38:aload_0         
		//   23   39:lload           7
		//   24   41:putfield        #64  <Field long ttl>
			softTtl = l3;
		//   25   44:aload_0         
		//   26   45:lload           9
		//   27   47:putfield        #65  <Field long softTtl>
			allResponseHeaders = list;
		//   28   50:aload_0         
		//   29   51:aload           11
		//   30   53:putfield        #67  <Field List allResponseHeaders>
		//   31   56:return          
		}
	}

	static class CountingInputStream extends FilterInputStream
	{

		long bytesRemaining()
		{
			return length - bytesRead;
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field long length>
		//    2    4:aload_0         
		//    3    5:getfield        #22  <Field long bytesRead>
		//    4    8:lsub            
		//    5    9:lreturn         
		}

		public int read()
			throws IOException
		{
			int i = super.read();
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method int FilterInputStream.read()>
		//    2    4:istore_1        
			if(i != -1)
		//*   3    5:iload_1         
		//*   4    6:iconst_m1       
		//*   5    7:icmpeq          20
				bytesRead = bytesRead + 1L;
		//    6   10:aload_0         
		//    7   11:aload_0         
		//    8   12:getfield        #22  <Field long bytesRead>
		//    9   15:lconst_1        
		//   10   16:ladd            
		//   11   17:putfield        #22  <Field long bytesRead>
			return i;
		//   12   20:iload_1         
		//   13   21:ireturn         
		}

		public int read(byte abyte0[], int i, int j)
			throws IOException
		{
			i = super.read(abyte0, i, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:invokespecial   #32  <Method int FilterInputStream.read(byte[], int, int)>
		//    5    7:istore_2        
			if(i != -1)
		//*   6    8:iload_2         
		//*   7    9:iconst_m1       
		//*   8   10:icmpeq          24
				bytesRead = bytesRead + (long)i;
		//    9   13:aload_0         
		//   10   14:aload_0         
		//   11   15:getfield        #22  <Field long bytesRead>
		//   12   18:iload_2         
		//   13   19:i2l             
		//   14   20:ladd            
		//   15   21:putfield        #22  <Field long bytesRead>
			return i;
		//   16   24:iload_2         
		//   17   25:ireturn         
		}

		private long bytesRead;
		private final long length;

		CountingInputStream(InputStream inputstream, long l)
		{
			super(inputstream);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #15  <Method void FilterInputStream(InputStream)>
			length = l;
		//    3    5:aload_0         
		//    4    6:lload_2         
		//    5    7:putfield        #17  <Field long length>
		//    6   10:return          
		}
	}


	public DiskBasedCache(File file)
	{
		this(file, 0x500000);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #24  <Int 0x500000>
	//    3    4:invokespecial   #27  <Method void DiskBasedCache(File, int)>
	//    4    7:return          
	}

	public DiskBasedCache(File file, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		mEntries = ((Map) (new LinkedHashMap(16, 0.75F, true)));
	//    2    4:aload_0         
	//    3    5:new             #33  <Class LinkedHashMap>
	//    4    8:dup             
	//    5    9:bipush          16
	//    6   11:ldc1            #34  <Float 0.75F>
	//    7   13:iconst_1        
	//    8   14:invokespecial   #37  <Method void LinkedHashMap(int, float, boolean)>
	//    9   17:putfield        #39  <Field Map mEntries>
		mTotalSize = 0L;
	//   10   20:aload_0         
	//   11   21:lconst_0        
	//   12   22:putfield        #41  <Field long mTotalSize>
		mRootDirectory = file;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #43  <Field File mRootDirectory>
		mMaxCacheSizeInBytes = i;
	//   16   30:aload_0         
	//   17   31:iload_2         
	//   18   32:putfield        #45  <Field int mMaxCacheSizeInBytes>
	//   19   35:return          
	}

	private String getFilenameForKey(String s)
	{
		int i = s.length() / 2;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #53  <Method int String.length()>
	//    2    4:iconst_2        
	//    3    5:idiv            
	//    4    6:istore_2        
		int j = s.substring(0, i).hashCode();
	//    5    7:aload_1         
	//    6    8:iconst_0        
	//    7    9:iload_2         
	//    8   10:invokevirtual   #57  <Method String String.substring(int, int)>
	//    9   13:invokevirtual   #60  <Method int String.hashCode()>
	//   10   16:istore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   11   17:new             #62  <Class StringBuilder>
	//   12   20:dup             
	//   13   21:invokespecial   #63  <Method void StringBuilder()>
	//   14   24:astore          4
		stringbuilder.append(String.valueOf(j));
	//   15   26:aload           4
	//   16   28:iload_3         
	//   17   29:invokestatic    #67  <Method String String.valueOf(int)>
	//   18   32:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
		stringbuilder.append(String.valueOf(s.substring(i).hashCode()));
	//   20   36:aload           4
	//   21   38:aload_1         
	//   22   39:iload_2         
	//   23   40:invokevirtual   #73  <Method String String.substring(int)>
	//   24   43:invokevirtual   #60  <Method int String.hashCode()>
	//   25   46:invokestatic    #67  <Method String String.valueOf(int)>
	//   26   49:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   27   52:pop             
		return stringbuilder.toString();
	//   28   53:aload           4
	//   29   55:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   30   58:areturn         
	}

	private void pruneIfNeeded(int i)
	{
		long l1 = mTotalSize;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field long mTotalSize>
	//    2    4:lstore          5
		long l = i;
	//    3    6:iload_1         
	//    4    7:i2l             
	//    5    8:lstore_3        
		if(l1 + l < (long)mMaxCacheSizeInBytes)
	//*   6    9:lload           5
	//*   7   11:lload_3         
	//*   8   12:ladd            
	//*   9   13:aload_0         
	//*  10   14:getfield        #45  <Field int mMaxCacheSizeInBytes>
	//*  11   17:i2l             
	//*  12   18:lcmp            
	//*  13   19:ifge            23
			return;
	//   14   22:return          
		if(VolleyLog.DEBUG)
	//*  15   23:getstatic       #85  <Field boolean VolleyLog.DEBUG>
	//*  16   26:ifeq            38
			VolleyLog.v("Pruning old cache entries.", new Object[0]);
	//   17   29:ldc1            #87  <String "Pruning old cache entries.">
	//   18   31:iconst_0        
	//   19   32:anewarray       Object[]
	//   20   35:invokestatic    #91  <Method void VolleyLog.v(String, Object[])>
		l1 = mTotalSize;
	//   21   38:aload_0         
	//   22   39:getfield        #41  <Field long mTotalSize>
	//   23   42:lstore          5
		long l2 = SystemClock.elapsedRealtime();
	//   24   44:invokestatic    #97  <Method long SystemClock.elapsedRealtime()>
	//   25   47:lstore          7
		Iterator iterator = mEntries.entrySet().iterator();
	//   26   49:aload_0         
	//   27   50:getfield        #39  <Field Map mEntries>
	//   28   53:invokeinterface #103 <Method Set Map.entrySet()>
	//   29   58:invokeinterface #109 <Method Iterator Set.iterator()>
	//   30   63:astore          9
		i = 0;
	//   31   65:iconst_0        
	//   32   66:istore_1        
		int j;
		do
		{
			j = i;
	//   33   67:iload_1         
	//   34   68:istore_2        
			if(!iterator.hasNext())
				break;
	//   35   69:aload           9
	//   36   71:invokeinterface #115 <Method boolean Iterator.hasNext()>
	//   37   76:ifeq            198
			CacheHeader cacheheader = (CacheHeader)((java.util.Map.Entry)iterator.next()).getValue();
	//   38   79:aload           9
	//   39   81:invokeinterface #119 <Method Object Iterator.next()>
	//   40   86:checkcast       #121 <Class java.util.Map$Entry>
	//   41   89:invokeinterface #124 <Method Object java.util.Map$Entry.getValue()>
	//   42   94:checkcast       #8   <Class DiskBasedCache$CacheHeader>
	//   43   97:astore          10
			if(getFileForKey(cacheheader.key).delete())
	//*  44   99:aload_0         
	//*  45  100:aload           10
	//*  46  102:getfield        #128 <Field String DiskBasedCache$CacheHeader.key>
	//*  47  105:invokevirtual   #132 <Method File getFileForKey(String)>
	//*  48  108:invokevirtual   #137 <Method boolean File.delete()>
	//*  49  111:ifeq            131
				mTotalSize = mTotalSize - cacheheader.size;
	//   50  114:aload_0         
	//   51  115:aload_0         
	//   52  116:getfield        #41  <Field long mTotalSize>
	//   53  119:aload           10
	//   54  121:getfield        #140 <Field long DiskBasedCache$CacheHeader.size>
	//   55  124:lsub            
	//   56  125:putfield        #41  <Field long mTotalSize>
			else
	//*  57  128:goto            160
				VolleyLog.d("Could not delete cache entry for key=%s, filename=%s", new Object[] {
					cacheheader.key, getFilenameForKey(cacheheader.key)
				});
	//   58  131:ldc1            #142 <String "Could not delete cache entry for key=%s, filename=%s">
	//   59  133:iconst_2        
	//   60  134:anewarray       Object[]
	//   61  137:dup             
	//   62  138:iconst_0        
	//   63  139:aload           10
	//   64  141:getfield        #128 <Field String DiskBasedCache$CacheHeader.key>
	//   65  144:aastore         
	//   66  145:dup             
	//   67  146:iconst_1        
	//   68  147:aload_0         
	//   69  148:aload           10
	//   70  150:getfield        #128 <Field String DiskBasedCache$CacheHeader.key>
	//   71  153:invokespecial   #144 <Method String getFilenameForKey(String)>
	//   72  156:aastore         
	//   73  157:invokestatic    #147 <Method void VolleyLog.d(String, Object[])>
			iterator.remove();
	//   74  160:aload           9
	//   75  162:invokeinterface #150 <Method void Iterator.remove()>
			i++;
	//   76  167:iload_1         
	//   77  168:iconst_1        
	//   78  169:iadd            
	//   79  170:istore_1        
			if((float)(mTotalSize + l) >= (float)mMaxCacheSizeInBytes * 0.9F)
				continue;
	//   80  171:aload_0         
	//   81  172:getfield        #41  <Field long mTotalSize>
	//   82  175:lload_3         
	//   83  176:ladd            
	//   84  177:l2f             
	//   85  178:aload_0         
	//   86  179:getfield        #45  <Field int mMaxCacheSizeInBytes>
	//   87  182:i2f             
	//   88  183:ldc1            #151 <Float 0.9F>
	//   89  185:fmul            
	//   90  186:fcmpg           
	//   91  187:ifge            195
			j = i;
	//   92  190:iload_1         
	//   93  191:istore_2        
			break;
	//   94  192:goto            198
		} while(true);
	//*  95  195:goto            67
		if(VolleyLog.DEBUG)
	//*  96  198:getstatic       #85  <Field boolean VolleyLog.DEBUG>
	//*  97  201:ifeq            245
			VolleyLog.v("pruned %d files, %d bytes, %d ms", new Object[] {
				Integer.valueOf(j), Long.valueOf(mTotalSize - l1), Long.valueOf(SystemClock.elapsedRealtime() - l2)
			});
	//   98  204:ldc1            #153 <String "pruned %d files, %d bytes, %d ms">
	//   99  206:iconst_3        
	//  100  207:anewarray       Object[]
	//  101  210:dup             
	//  102  211:iconst_0        
	//  103  212:iload_2         
	//  104  213:invokestatic    #158 <Method Integer Integer.valueOf(int)>
	//  105  216:aastore         
	//  106  217:dup             
	//  107  218:iconst_1        
	//  108  219:aload_0         
	//  109  220:getfield        #41  <Field long mTotalSize>
	//  110  223:lload           5
	//  111  225:lsub            
	//  112  226:invokestatic    #163 <Method Long Long.valueOf(long)>
	//  113  229:aastore         
	//  114  230:dup             
	//  115  231:iconst_2        
	//  116  232:invokestatic    #97  <Method long SystemClock.elapsedRealtime()>
	//  117  235:lload           7
	//  118  237:lsub            
	//  119  238:invokestatic    #163 <Method Long Long.valueOf(long)>
	//  120  241:aastore         
	//  121  242:invokestatic    #91  <Method void VolleyLog.v(String, Object[])>
	//  122  245:return          
	}

	private void putEntry(String s, CacheHeader cacheheader)
	{
		if(!mEntries.containsKey(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field Map mEntries>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #169 <Method boolean Map.containsKey(Object)>
	//*   4   10:ifne            29
		{
			mTotalSize = mTotalSize + cacheheader.size;
	//    5   13:aload_0         
	//    6   14:aload_0         
	//    7   15:getfield        #41  <Field long mTotalSize>
	//    8   18:aload_2         
	//    9   19:getfield        #140 <Field long DiskBasedCache$CacheHeader.size>
	//   10   22:ladd            
	//   11   23:putfield        #41  <Field long mTotalSize>
		} else
	//*  12   26:goto            61
		{
			CacheHeader cacheheader1 = (CacheHeader)mEntries.get(((Object) (s)));
	//   13   29:aload_0         
	//   14   30:getfield        #39  <Field Map mEntries>
	//   15   33:aload_1         
	//   16   34:invokeinterface #173 <Method Object Map.get(Object)>
	//   17   39:checkcast       #8   <Class DiskBasedCache$CacheHeader>
	//   18   42:astore_3        
			mTotalSize = mTotalSize + (cacheheader.size - cacheheader1.size);
	//   19   43:aload_0         
	//   20   44:aload_0         
	//   21   45:getfield        #41  <Field long mTotalSize>
	//   22   48:aload_2         
	//   23   49:getfield        #140 <Field long DiskBasedCache$CacheHeader.size>
	//   24   52:aload_3         
	//   25   53:getfield        #140 <Field long DiskBasedCache$CacheHeader.size>
	//   26   56:lsub            
	//   27   57:ladd            
	//   28   58:putfield        #41  <Field long mTotalSize>
		}
		mEntries.put(((Object) (s)), ((Object) (cacheheader)));
	//   29   61:aload_0         
	//   30   62:getfield        #39  <Field Map mEntries>
	//   31   65:aload_1         
	//   32   66:aload_2         
	//   33   67:invokeinterface #177 <Method Object Map.put(Object, Object)>
	//   34   72:pop             
	//   35   73:return          
	}

	private static int read(InputStream inputstream)
		throws IOException
	{
		int i = inputstream.read();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #185 <Method int InputStream.read()>
	//    2    4:istore_1        
		if(i != -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          12
			return i;
	//    6   10:iload_1         
	//    7   11:ireturn         
		else
			throw new EOFException();
	//    8   12:new             #187 <Class EOFException>
	//    9   15:dup             
	//   10   16:invokespecial   #188 <Method void EOFException()>
	//   11   19:athrow          
	}

	static List readHeaderList(CountingInputStream countinginputstream)
		throws IOException
	{
		int j = readInt(((InputStream) (countinginputstream)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #194 <Method int readInt(InputStream)>
	//    2    4:istore_2        
		Object obj;
		if(j == 0)
	//*   3    5:iload_2         
	//*   4    6:ifne            16
			obj = ((Object) (Collections.emptyList()));
	//    5    9:invokestatic    #200 <Method List Collections.emptyList()>
	//    6   12:astore_3        
		else
	//*   7   13:goto            25
			obj = ((Object) (new ArrayList(j)));
	//    8   16:new             #202 <Class ArrayList>
	//    9   19:dup             
	//   10   20:iload_2         
	//   11   21:invokespecial   #204 <Method void ArrayList(int)>
	//   12   24:astore_3        
		for(int i = 0; i < j; i++)
	//*  13   25:iconst_0        
	//*  14   26:istore_1        
	//*  15   27:iload_1         
	//*  16   28:iload_2         
	//*  17   29:icmpge          67
			((List) (obj)).add(((Object) (new Header(readString(countinginputstream).intern(), readString(countinginputstream).intern()))));
	//   18   32:aload_3         
	//   19   33:new             #206 <Class Header>
	//   20   36:dup             
	//   21   37:aload_0         
	//   22   38:invokestatic    #210 <Method String readString(DiskBasedCache$CountingInputStream)>
	//   23   41:invokevirtual   #213 <Method String String.intern()>
	//   24   44:aload_0         
	//   25   45:invokestatic    #210 <Method String readString(DiskBasedCache$CountingInputStream)>
	//   26   48:invokevirtual   #213 <Method String String.intern()>
	//   27   51:invokespecial   #216 <Method void Header(String, String)>
	//   28   54:invokeinterface #221 <Method boolean List.add(Object)>
	//   29   59:pop             

	//   30   60:iload_1         
	//   31   61:iconst_1        
	//   32   62:iadd            
	//   33   63:istore_1        
	//*  34   64:goto            27
		return ((List) (obj));
	//   35   67:aload_3         
	//   36   68:areturn         
	}

	static int readInt(InputStream inputstream)
		throws IOException
	{
		int i = read(inputstream);
	//    0    0:aload_0         
	//    1    1:invokestatic    #225 <Method int read(InputStream)>
	//    2    4:istore_1        
		int j = read(inputstream);
	//    3    5:aload_0         
	//    4    6:invokestatic    #225 <Method int read(InputStream)>
	//    5    9:istore_2        
		int k = read(inputstream);
	//    6   10:aload_0         
	//    7   11:invokestatic    #225 <Method int read(InputStream)>
	//    8   14:istore_3        
		return read(inputstream) << 24 | (i << 0 | 0 | j << 8 | k << 16);
	//    9   15:aload_0         
	//   10   16:invokestatic    #225 <Method int read(InputStream)>
	//   11   19:bipush          24
	//   12   21:ishl            
	//   13   22:iload_1         
	//   14   23:iconst_0        
	//   15   24:ishl            
	//   16   25:iconst_0        
	//   17   26:ior             
	//   18   27:iload_2         
	//   19   28:bipush          8
	//   20   30:ishl            
	//   21   31:ior             
	//   22   32:iload_3         
	//   23   33:bipush          16
	//   24   35:ishl            
	//   25   36:ior             
	//   26   37:ior             
	//   27   38:ireturn         
	}

	static long readLong(InputStream inputstream)
		throws IOException
	{
		return ((long)read(inputstream) & 255L) << 0 | 0L | ((long)read(inputstream) & 255L) << 8 | ((long)read(inputstream) & 255L) << 16 | ((long)read(inputstream) & 255L) << 24 | ((long)read(inputstream) & 255L) << 32 | ((long)read(inputstream) & 255L) << 40 | ((long)read(inputstream) & 255L) << 48 | (255L & (long)read(inputstream)) << 56;
	//    0    0:aload_0         
	//    1    1:invokestatic    #225 <Method int read(InputStream)>
	//    2    4:i2l             
	//    3    5:ldc2w           #228 <Long 255L>
	//    4    8:land            
	//    5    9:iconst_0        
	//    6   10:lshl            
	//    7   11:lconst_0        
	//    8   12:lor             
	//    9   13:aload_0         
	//   10   14:invokestatic    #225 <Method int read(InputStream)>
	//   11   17:i2l             
	//   12   18:ldc2w           #228 <Long 255L>
	//   13   21:land            
	//   14   22:bipush          8
	//   15   24:lshl            
	//   16   25:lor             
	//   17   26:aload_0         
	//   18   27:invokestatic    #225 <Method int read(InputStream)>
	//   19   30:i2l             
	//   20   31:ldc2w           #228 <Long 255L>
	//   21   34:land            
	//   22   35:bipush          16
	//   23   37:lshl            
	//   24   38:lor             
	//   25   39:aload_0         
	//   26   40:invokestatic    #225 <Method int read(InputStream)>
	//   27   43:i2l             
	//   28   44:ldc2w           #228 <Long 255L>
	//   29   47:land            
	//   30   48:bipush          24
	//   31   50:lshl            
	//   32   51:lor             
	//   33   52:aload_0         
	//   34   53:invokestatic    #225 <Method int read(InputStream)>
	//   35   56:i2l             
	//   36   57:ldc2w           #228 <Long 255L>
	//   37   60:land            
	//   38   61:bipush          32
	//   39   63:lshl            
	//   40   64:lor             
	//   41   65:aload_0         
	//   42   66:invokestatic    #225 <Method int read(InputStream)>
	//   43   69:i2l             
	//   44   70:ldc2w           #228 <Long 255L>
	//   45   73:land            
	//   46   74:bipush          40
	//   47   76:lshl            
	//   48   77:lor             
	//   49   78:aload_0         
	//   50   79:invokestatic    #225 <Method int read(InputStream)>
	//   51   82:i2l             
	//   52   83:ldc2w           #228 <Long 255L>
	//   53   86:land            
	//   54   87:bipush          48
	//   55   89:lshl            
	//   56   90:lor             
	//   57   91:ldc2w           #228 <Long 255L>
	//   58   94:aload_0         
	//   59   95:invokestatic    #225 <Method int read(InputStream)>
	//   60   98:i2l             
	//   61   99:land            
	//   62  100:bipush          56
	//   63  102:lshl            
	//   64  103:lor             
	//   65  104:lreturn         
	}

	static String readString(CountingInputStream countinginputstream)
		throws IOException
	{
		return new String(streamToBytes(countinginputstream, readLong(((InputStream) (countinginputstream)))), "UTF-8");
	//    0    0:new             #49  <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokestatic    #231 <Method long readLong(InputStream)>
	//    5    9:invokestatic    #235 <Method byte[] streamToBytes(DiskBasedCache$CountingInputStream, long)>
	//    6   12:ldc1            #237 <String "UTF-8">
	//    7   14:invokespecial   #240 <Method void String(byte[], String)>
	//    8   17:areturn         
	}

	private void removeEntry(String s)
	{
		s = ((String) ((CacheHeader)mEntries.remove(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Map mEntries>
	//    2    4:aload_1         
	//    3    5:invokeinterface #244 <Method Object Map.remove(Object)>
	//    4   10:checkcast       #8   <Class DiskBasedCache$CacheHeader>
	//    5   13:astore_1        
		if(s != null)
	//*   6   14:aload_1         
	//*   7   15:ifnull          31
			mTotalSize = mTotalSize - ((CacheHeader) (s)).size;
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #41  <Field long mTotalSize>
	//   11   23:aload_1         
	//   12   24:getfield        #140 <Field long DiskBasedCache$CacheHeader.size>
	//   13   27:lsub            
	//   14   28:putfield        #41  <Field long mTotalSize>
	//   15   31:return          
	}

	static byte[] streamToBytes(CountingInputStream countinginputstream, long l)
		throws IOException
	{
		long l1 = countinginputstream.bytesRemaining();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #247 <Method long DiskBasedCache$CountingInputStream.bytesRemaining()>
	//    2    4:lstore          4
		if(l >= 0L && l <= l1)
	//*   3    6:lload_1         
	//*   4    7:lconst_0        
	//*   5    8:lcmp            
	//*   6    9:iflt            50
	//*   7   12:lload_1         
	//*   8   13:lload           4
	//*   9   15:lcmp            
	//*  10   16:ifgt            50
		{
			int i = (int)l;
	//   11   19:lload_1         
	//   12   20:l2i             
	//   13   21:istore_3        
			if((long)i == l)
	//*  14   22:iload_3         
	//*  15   23:i2l             
	//*  16   24:lload_1         
	//*  17   25:lcmp            
	//*  18   26:ifne            50
			{
				byte abyte0[] = new byte[i];
	//   19   29:iload_3         
	//   20   30:newarray        byte[]
	//   21   32:astore          6
				(new DataInputStream(((InputStream) (countinginputstream)))).readFully(abyte0);
	//   22   34:new             #249 <Class DataInputStream>
	//   23   37:dup             
	//   24   38:aload_0         
	//   25   39:invokespecial   #252 <Method void DataInputStream(InputStream)>
	//   26   42:aload           6
	//   27   44:invokevirtual   #256 <Method void DataInputStream.readFully(byte[])>
				return abyte0;
	//   28   47:aload           6
	//   29   49:areturn         
			}
		}
		countinginputstream = ((CountingInputStream) (new StringBuilder()));
	//   30   50:new             #62  <Class StringBuilder>
	//   31   53:dup             
	//   32   54:invokespecial   #63  <Method void StringBuilder()>
	//   33   57:astore_0        
		((StringBuilder) (countinginputstream)).append("streamToBytes length=");
	//   34   58:aload_0         
	//   35   59:ldc2            #258 <String "streamToBytes length=">
	//   36   62:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   37   65:pop             
		((StringBuilder) (countinginputstream)).append(l);
	//   38   66:aload_0         
	//   39   67:lload_1         
	//   40   68:invokevirtual   #261 <Method StringBuilder StringBuilder.append(long)>
	//   41   71:pop             
		((StringBuilder) (countinginputstream)).append(", maxLength=");
	//   42   72:aload_0         
	//   43   73:ldc2            #263 <String ", maxLength=">
	//   44   76:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   45   79:pop             
		((StringBuilder) (countinginputstream)).append(l1);
	//   46   80:aload_0         
	//   47   81:lload           4
	//   48   83:invokevirtual   #261 <Method StringBuilder StringBuilder.append(long)>
	//   49   86:pop             
		throw new IOException(((StringBuilder) (countinginputstream)).toString());
	//   50   87:new             #181 <Class IOException>
	//   51   90:dup             
	//   52   91:aload_0         
	//   53   92:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   54   95:invokespecial   #265 <Method void IOException(String)>
	//   55   98:athrow          
	}

	static void writeHeaderList(List list, OutputStream outputstream)
		throws IOException
	{
		if(list != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          59
		{
			writeInt(outputstream, list.size());
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:invokeinterface #269 <Method int List.size()>
	//    5   11:invokestatic    #273 <Method void writeInt(OutputStream, int)>
			Header header;
			for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); writeString(outputstream, header.getValue()))
	//*   6   14:aload_0         
	//*   7   15:invokeinterface #274 <Method Iterator List.iterator()>
	//*   8   20:astore_0        
	//*   9   21:aload_0         
	//*  10   22:invokeinterface #115 <Method boolean Iterator.hasNext()>
	//*  11   27:ifeq            64
			{
				header = (Header)((Iterator) (list)).next();
	//   12   30:aload_0         
	//   13   31:invokeinterface #119 <Method Object Iterator.next()>
	//   14   36:checkcast       #206 <Class Header>
	//   15   39:astore_2        
				writeString(outputstream, header.getName());
	//   16   40:aload_1         
	//   17   41:aload_2         
	//   18   42:invokevirtual   #277 <Method String Header.getName()>
	//   19   45:invokestatic    #281 <Method void writeString(OutputStream, String)>
			}

	//   20   48:aload_1         
	//   21   49:aload_2         
	//   22   50:invokevirtual   #283 <Method String Header.getValue()>
	//   23   53:invokestatic    #281 <Method void writeString(OutputStream, String)>
		} else
	//*  24   56:goto            21
		{
			writeInt(outputstream, 0);
	//   25   59:aload_1         
	//   26   60:iconst_0        
	//   27   61:invokestatic    #273 <Method void writeInt(OutputStream, int)>
		}
	//   28   64:return          
	}

	static void writeInt(OutputStream outputstream, int i)
		throws IOException
	{
		outputstream.write(i >> 0 & 0xff);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:ishr            
	//    4    4:sipush          255
	//    5    7:iand            
	//    6    8:invokevirtual   #289 <Method void OutputStream.write(int)>
		outputstream.write(i >> 8 & 0xff);
	//    7   11:aload_0         
	//    8   12:iload_1         
	//    9   13:bipush          8
	//   10   15:ishr            
	//   11   16:sipush          255
	//   12   19:iand            
	//   13   20:invokevirtual   #289 <Method void OutputStream.write(int)>
		outputstream.write(i >> 16 & 0xff);
	//   14   23:aload_0         
	//   15   24:iload_1         
	//   16   25:bipush          16
	//   17   27:ishr            
	//   18   28:sipush          255
	//   19   31:iand            
	//   20   32:invokevirtual   #289 <Method void OutputStream.write(int)>
		outputstream.write(i >> 24 & 0xff);
	//   21   35:aload_0         
	//   22   36:iload_1         
	//   23   37:bipush          24
	//   24   39:ishr            
	//   25   40:sipush          255
	//   26   43:iand            
	//   27   44:invokevirtual   #289 <Method void OutputStream.write(int)>
	//   28   47:return          
	}

	static void writeLong(OutputStream outputstream, long l)
		throws IOException
	{
		outputstream.write(((int) ((byte)(int)(l >>> 0))));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iconst_0        
	//    3    3:lushr           
	//    4    4:l2i             
	//    5    5:int2byte        
	//    6    6:invokevirtual   #289 <Method void OutputStream.write(int)>
		outputstream.write(((int) ((byte)(int)(l >>> 8))));
	//    7    9:aload_0         
	//    8   10:lload_1         
	//    9   11:bipush          8
	//   10   13:lushr           
	//   11   14:l2i             
	//   12   15:int2byte        
	//   13   16:invokevirtual   #289 <Method void OutputStream.write(int)>
		outputstream.write(((int) ((byte)(int)(l >>> 16))));
	//   14   19:aload_0         
	//   15   20:lload_1         
	//   16   21:bipush          16
	//   17   23:lushr           
	//   18   24:l2i             
	//   19   25:int2byte        
	//   20   26:invokevirtual   #289 <Method void OutputStream.write(int)>
		outputstream.write(((int) ((byte)(int)(l >>> 24))));
	//   21   29:aload_0         
	//   22   30:lload_1         
	//   23   31:bipush          24
	//   24   33:lushr           
	//   25   34:l2i             
	//   26   35:int2byte        
	//   27   36:invokevirtual   #289 <Method void OutputStream.write(int)>
		outputstream.write(((int) ((byte)(int)(l >>> 32))));
	//   28   39:aload_0         
	//   29   40:lload_1         
	//   30   41:bipush          32
	//   31   43:lushr           
	//   32   44:l2i             
	//   33   45:int2byte        
	//   34   46:invokevirtual   #289 <Method void OutputStream.write(int)>
		outputstream.write(((int) ((byte)(int)(l >>> 40))));
	//   35   49:aload_0         
	//   36   50:lload_1         
	//   37   51:bipush          40
	//   38   53:lushr           
	//   39   54:l2i             
	//   40   55:int2byte        
	//   41   56:invokevirtual   #289 <Method void OutputStream.write(int)>
		outputstream.write(((int) ((byte)(int)(l >>> 48))));
	//   42   59:aload_0         
	//   43   60:lload_1         
	//   44   61:bipush          48
	//   45   63:lushr           
	//   46   64:l2i             
	//   47   65:int2byte        
	//   48   66:invokevirtual   #289 <Method void OutputStream.write(int)>
		outputstream.write(((int) ((byte)(int)(l >>> 56))));
	//   49   69:aload_0         
	//   50   70:lload_1         
	//   51   71:bipush          56
	//   52   73:lushr           
	//   53   74:l2i             
	//   54   75:int2byte        
	//   55   76:invokevirtual   #289 <Method void OutputStream.write(int)>
	//   56   79:return          
	}

	static void writeString(OutputStream outputstream, String s)
		throws IOException
	{
		s = ((String) (s.getBytes("UTF-8")));
	//    0    0:aload_1         
	//    1    1:ldc1            #237 <String "UTF-8">
	//    2    3:invokevirtual   #295 <Method byte[] String.getBytes(String)>
	//    3    6:astore_1        
		writeLong(outputstream, s.length);
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:arraylength     
	//    7   10:i2l             
	//    8   11:invokestatic    #297 <Method void writeLong(OutputStream, long)>
		outputstream.write(((byte []) (s)), 0, s.length);
	//    9   14:aload_0         
	//   10   15:aload_1         
	//   11   16:iconst_0        
	//   12   17:aload_1         
	//   13   18:arraylength     
	//   14   19:invokevirtual   #300 <Method void OutputStream.write(byte[], int, int)>
	//   15   22:return          
	}

	public void clear()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		File afile[] = mRootDirectory.listFiles();
	//    2    2:aload_0         
	//    3    3:getfield        #43  <Field File mRootDirectory>
	//    4    6:invokevirtual   #305 <Method File[] File.listFiles()>
	//    5    9:astore_3        
		if(afile == null) goto _L2; else goto _L1
	//    6   10:aload_3         
	//    7   11:ifnull          38
_L1:
		int j = afile.length;
	//    8   14:aload_3         
	//    9   15:arraylength     
	//   10   16:istore_2        
		int i = 0;
	//   11   17:iconst_0        
	//   12   18:istore_1        
_L3:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   13   19:iload_1         
	//   14   20:iload_2         
	//   15   21:icmpge          38
		afile[i].delete();
	//   16   24:aload_3         
	//   17   25:iload_1         
	//   18   26:aaload          
	//   19   27:invokevirtual   #137 <Method boolean File.delete()>
	//   20   30:pop             
		i++;
	//   21   31:iload_1         
	//   22   32:iconst_1        
	//   23   33:iadd            
	//   24   34:istore_1        
		if(true) goto _L3; else goto _L2
	//   25   35:goto            19
_L2:
		mEntries.clear();
	//   26   38:aload_0         
	//   27   39:getfield        #39  <Field Map mEntries>
	//   28   42:invokeinterface #307 <Method void Map.clear()>
		mTotalSize = 0L;
	//   29   47:aload_0         
	//   30   48:lconst_0        
	//   31   49:putfield        #41  <Field long mTotalSize>
		VolleyLog.d("Cache cleared.", new Object[0]);
	//   32   52:ldc2            #309 <String "Cache cleared.">
	//   33   55:iconst_0        
	//   34   56:anewarray       Object[]
	//   35   59:invokestatic    #147 <Method void VolleyLog.d(String, Object[])>
		this;
	//   36   62:aload_0         
		JVM INSTR monitorexit ;
	//   37   63:monitorexit     
		return;
	//   38   64:return          
		Exception exception;
		exception;
	//   39   65:astore_3        
	//*  40   66:aload_0         
		throw exception;
	//   41   67:monitorexit     
	//   42   68:aload_3         
	//   43   69:athrow          
	}

	InputStream createInputStream(File file)
		throws FileNotFoundException
	{
		return ((InputStream) (new FileInputStream(file)));
	//    0    0:new             #315 <Class FileInputStream>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #317 <Method void FileInputStream(File)>
	//    4    8:areturn         
	}

	OutputStream createOutputStream(File file)
		throws FileNotFoundException
	{
		return ((OutputStream) (new FileOutputStream(file)));
	//    0    0:new             #321 <Class FileOutputStream>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #322 <Method void FileOutputStream(File)>
	//    4    8:areturn         
	}

	public com.android.volley.Cache.Entry get(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Object obj = ((Object) ((CacheHeader)mEntries.get(((Object) (s)))));
	//    2    2:aload_0         
	//    3    3:getfield        #39  <Field Map mEntries>
	//    4    6:aload_1         
	//    5    7:invokeinterface #173 <Method Object Map.get(Object)>
	//    6   12:checkcast       #8   <Class DiskBasedCache$CacheHeader>
	//    7   15:astore          4
		if(obj != null)
			break MISSING_BLOCK_LABEL_26;
	//    8   17:aload           4
	//    9   19:ifnonnull       26
		this;
	//   10   22:aload_0         
		JVM INSTR monitorexit ;
	//   11   23:monitorexit     
		return null;
	//   12   24:aconst_null     
	//   13   25:areturn         
		File file = getFileForKey(s);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #132 <Method File getFileForKey(String)>
	//   17   31:astore_2        
		CountingInputStream countinginputstream = new CountingInputStream(((InputStream) (new BufferedInputStream(createInputStream(file)))), file.length());
	//   18   32:new             #11  <Class DiskBasedCache$CountingInputStream>
	//   19   35:dup             
	//   20   36:new             #325 <Class BufferedInputStream>
	//   21   39:dup             
	//   22   40:aload_0         
	//   23   41:aload_2         
	//   24   42:invokevirtual   #327 <Method InputStream createInputStream(File)>
	//   25   45:invokespecial   #328 <Method void BufferedInputStream(InputStream)>
	//   26   48:aload_2         
	//   27   49:invokevirtual   #330 <Method long File.length()>
	//   28   52:invokespecial   #333 <Method void DiskBasedCache$CountingInputStream(InputStream, long)>
	//   29   55:astore_3        
		CacheHeader cacheheader = CacheHeader.readHeader(countinginputstream);
	//   30   56:aload_3         
	//   31   57:invokestatic    #337 <Method DiskBasedCache$CacheHeader DiskBasedCache$CacheHeader.readHeader(DiskBasedCache$CountingInputStream)>
	//   32   60:astore          5
		if(TextUtils.equals(((CharSequence) (s)), ((CharSequence) (cacheheader.key))))
			break MISSING_BLOCK_LABEL_116;
	//   33   62:aload_1         
	//   34   63:aload           5
	//   35   65:getfield        #128 <Field String DiskBasedCache$CacheHeader.key>
	//   36   68:invokestatic    #343 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   37   71:ifne            116
		VolleyLog.d("%s: key=%s, found=%s", new Object[] {
			file.getAbsolutePath(), s, cacheheader.key
		});
	//   38   74:ldc2            #345 <String "%s: key=%s, found=%s">
	//   39   77:iconst_3        
	//   40   78:anewarray       Object[]
	//   41   81:dup             
	//   42   82:iconst_0        
	//   43   83:aload_2         
	//   44   84:invokevirtual   #348 <Method String File.getAbsolutePath()>
	//   45   87:aastore         
	//   46   88:dup             
	//   47   89:iconst_1        
	//   48   90:aload_1         
	//   49   91:aastore         
	//   50   92:dup             
	//   51   93:iconst_2        
	//   52   94:aload           5
	//   53   96:getfield        #128 <Field String DiskBasedCache$CacheHeader.key>
	//   54   99:aastore         
	//   55  100:invokestatic    #147 <Method void VolleyLog.d(String, Object[])>
		removeEntry(s);
	//   56  103:aload_0         
	//   57  104:aload_1         
	//   58  105:invokespecial   #350 <Method void removeEntry(String)>
		countinginputstream.close();
	//   59  108:aload_3         
	//   60  109:invokevirtual   #353 <Method void DiskBasedCache$CountingInputStream.close()>
		this;
	//   61  112:aload_0         
		JVM INSTR monitorexit ;
	//   62  113:monitorexit     
		return null;
	//   63  114:aconst_null     
	//   64  115:areturn         
		obj = ((Object) (((CacheHeader) (obj)).toCacheEntry(streamToBytes(countinginputstream, countinginputstream.bytesRemaining()))));
	//   65  116:aload           4
	//   66  118:aload_3         
	//   67  119:aload_3         
	//   68  120:invokevirtual   #247 <Method long DiskBasedCache$CountingInputStream.bytesRemaining()>
	//   69  123:invokestatic    #235 <Method byte[] streamToBytes(DiskBasedCache$CountingInputStream, long)>
	//   70  126:invokevirtual   #357 <Method com.android.volley.Cache$Entry DiskBasedCache$CacheHeader.toCacheEntry(byte[])>
	//   71  129:astore          4
		countinginputstream.close();
	//   72  131:aload_3         
	//   73  132:invokevirtual   #353 <Method void DiskBasedCache$CountingInputStream.close()>
		this;
	//   74  135:aload_0         
		JVM INSTR monitorexit ;
	//   75  136:monitorexit     
		return ((com.android.volley.Cache.Entry) (obj));
	//   76  137:aload           4
	//   77  139:areturn         
		Exception exception;
		exception;
	//   78  140:astore          4
		countinginputstream.close();
	//   79  142:aload_3         
	//   80  143:invokevirtual   #353 <Method void DiskBasedCache$CountingInputStream.close()>
		throw exception;
	//   81  146:aload           4
	//   82  148:athrow          
		IOException ioexception;
		ioexception;
	//   83  149:astore_3        
		VolleyLog.d("%s: %s", new Object[] {
			file.getAbsolutePath(), ioexception.toString()
		});
	//   84  150:ldc2            #359 <String "%s: %s">
	//   85  153:iconst_2        
	//   86  154:anewarray       Object[]
	//   87  157:dup             
	//   88  158:iconst_0        
	//   89  159:aload_2         
	//   90  160:invokevirtual   #348 <Method String File.getAbsolutePath()>
	//   91  163:aastore         
	//   92  164:dup             
	//   93  165:iconst_1        
	//   94  166:aload_3         
	//   95  167:invokevirtual   #360 <Method String IOException.toString()>
	//   96  170:aastore         
	//   97  171:invokestatic    #147 <Method void VolleyLog.d(String, Object[])>
		remove(s);
	//   98  174:aload_0         
	//   99  175:aload_1         
	//  100  176:invokevirtual   #362 <Method void remove(String)>
		this;
	//  101  179:aload_0         
		JVM INSTR monitorexit ;
	//  102  180:monitorexit     
		return null;
	//  103  181:aconst_null     
	//  104  182:areturn         
		s;
	//  105  183:astore_1        
	//* 106  184:aload_0         
		throw s;
	//  107  185:monitorexit     
	//  108  186:aload_1         
	//  109  187:athrow          
	}

	public File getFileForKey(String s)
	{
		return new File(mRootDirectory, getFilenameForKey(s));
	//    0    0:new             #134 <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #43  <Field File mRootDirectory>
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #144 <Method String getFilenameForKey(String)>
	//    7   13:invokespecial   #365 <Method void File(File, String)>
	//    8   16:areturn         
	}

	public void initialize()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = mRootDirectory.exists();
	//    2    2:aload_0         
	//    3    3:getfield        #43  <Field File mRootDirectory>
	//    4    6:invokevirtual   #369 <Method boolean File.exists()>
	//    5    9:istore_3        
		int i;
		i = 0;
	//    6   10:iconst_0        
	//    7   11:istore_1        
		if(flag)
			break MISSING_BLOCK_LABEL_49;
	//    8   12:iload_3         
	//    9   13:ifne            49
		if(!mRootDirectory.mkdirs())
	//*  10   16:aload_0         
	//*  11   17:getfield        #43  <Field File mRootDirectory>
	//*  12   20:invokevirtual   #372 <Method boolean File.mkdirs()>
	//*  13   23:ifne            46
			VolleyLog.e("Unable to create cache dir %s", new Object[] {
				mRootDirectory.getAbsolutePath()
			});
	//   14   26:ldc2            #374 <String "Unable to create cache dir %s">
	//   15   29:iconst_1        
	//   16   30:anewarray       Object[]
	//   17   33:dup             
	//   18   34:iconst_0        
	//   19   35:aload_0         
	//   20   36:getfield        #43  <Field File mRootDirectory>
	//   21   39:invokevirtual   #348 <Method String File.getAbsolutePath()>
	//   22   42:aastore         
	//   23   43:invokestatic    #377 <Method void VolleyLog.e(String, Object[])>
		this;
	//   24   46:aload_0         
		JVM INSTR monitorexit ;
	//   25   47:monitorexit     
		return;
	//   26   48:return          
		File afile[] = mRootDirectory.listFiles();
	//   27   49:aload_0         
	//   28   50:getfield        #43  <Field File mRootDirectory>
	//   29   53:invokevirtual   #305 <Method File[] File.listFiles()>
	//   30   56:astore          6
		if(afile != null)
			break MISSING_BLOCK_LABEL_66;
	//   31   58:aload           6
	//   32   60:ifnonnull       66
		this;
	//   33   63:aload_0         
		JVM INSTR monitorexit ;
	//   34   64:monitorexit     
		return;
	//   35   65:return          
		int j = afile.length;
	//   36   66:aload           6
	//   37   68:arraylength     
	//   38   69:istore_2        
_L3:
		if(i >= j) goto _L2; else goto _L1
	//   39   70:iload_1         
	//   40   71:iload_2         
	//   41   72:icmpge          168
_L1:
		File file = afile[i];
	//   42   75:aload           6
	//   43   77:iload_1         
	//   44   78:aaload          
	//   45   79:astore          7
		long l;
		CountingInputStream countinginputstream;
		l = file.length();
	//   46   81:aload           7
	//   47   83:invokevirtual   #330 <Method long File.length()>
	//   48   86:lstore          4
		countinginputstream = new CountingInputStream(((InputStream) (new BufferedInputStream(createInputStream(file)))), l);
	//   49   88:new             #11  <Class DiskBasedCache$CountingInputStream>
	//   50   91:dup             
	//   51   92:new             #325 <Class BufferedInputStream>
	//   52   95:dup             
	//   53   96:aload_0         
	//   54   97:aload           7
	//   55   99:invokevirtual   #327 <Method InputStream createInputStream(File)>
	//   56  102:invokespecial   #328 <Method void BufferedInputStream(InputStream)>
	//   57  105:lload           4
	//   58  107:invokespecial   #333 <Method void DiskBasedCache$CountingInputStream(InputStream, long)>
	//   59  110:astore          8
		CacheHeader cacheheader = CacheHeader.readHeader(countinginputstream);
	//   60  112:aload           8
	//   61  114:invokestatic    #337 <Method DiskBasedCache$CacheHeader DiskBasedCache$CacheHeader.readHeader(DiskBasedCache$CountingInputStream)>
	//   62  117:astore          9
		cacheheader.size = l;
	//   63  119:aload           9
	//   64  121:lload           4
	//   65  123:putfield        #140 <Field long DiskBasedCache$CacheHeader.size>
		putEntry(cacheheader.key, cacheheader);
	//   66  126:aload_0         
	//   67  127:aload           9
	//   68  129:getfield        #128 <Field String DiskBasedCache$CacheHeader.key>
	//   69  132:aload           9
	//   70  134:invokespecial   #379 <Method void putEntry(String, DiskBasedCache$CacheHeader)>
		Exception exception1;
		try
		{
			countinginputstream.close();
	//   71  137:aload           8
	//   72  139:invokevirtual   #353 <Method void DiskBasedCache$CountingInputStream.close()>
		}
	//*  73  142:goto            161
	//*  74  145:astore          9
	//*  75  147:aload           8
	//*  76  149:invokevirtual   #353 <Method void DiskBasedCache$CountingInputStream.close()>
	//*  77  152:aload           9
	//*  78  154:athrow          
	//*  79  155:aload           7
	//*  80  157:invokevirtual   #137 <Method boolean File.delete()>
	//*  81  160:pop             
	//*  82  161:iload_1         
	//*  83  162:iconst_1        
	//*  84  163:iadd            
	//*  85  164:istore_1        
	//*  86  165:goto            70
	//*  87  168:aload_0         
	//*  88  169:monitorexit     
	//*  89  170:return          
	//*  90  171:astore          6
	//*  91  173:aload_0         
	//*  92  174:monitorexit     
	//*  93  175:aload           6
	//*  94  177:athrow          
		// Misplaced declaration of an exception variable
		catch(IOException ioexception)
		{
			file.delete();
		}
		continue; /* Loop/switch isn't completed */
		exception1;
		countinginputstream.close();
		throw exception1;
		  goto _L3
_L2:
		this;
		JVM INSTR monitorexit ;
		return;
		Exception exception;
		exception;
		IOException ioexception;
		throw exception;
	//*  95  178:astore          8
	//*  96  180:goto            155
	}

	public void invalidate(String s, boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		com.android.volley.Cache.Entry entry = get(s);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #383 <Method com.android.volley.Cache$Entry get(String)>
	//    5    7:astore_3        
		if(entry == null)
			break MISSING_BLOCK_LABEL_32;
	//    6    8:aload_3         
	//    7    9:ifnull          32
		entry.softTtl = 0L;
	//    8   12:aload_3         
	//    9   13:lconst_0        
	//   10   14:putfield        #388 <Field long com.android.volley.Cache$Entry.softTtl>
		if(!flag)
			break MISSING_BLOCK_LABEL_26;
	//   11   17:iload_2         
	//   12   18:ifeq            26
		entry.ttl = 0L;
	//   13   21:aload_3         
	//   14   22:lconst_0        
	//   15   23:putfield        #391 <Field long com.android.volley.Cache$Entry.ttl>
		put(s, entry);
	//   16   26:aload_0         
	//   17   27:aload_1         
	//   18   28:aload_3         
	//   19   29:invokevirtual   #394 <Method void put(String, com.android.volley.Cache$Entry)>
		this;
	//   20   32:aload_0         
		JVM INSTR monitorexit ;
	//   21   33:monitorexit     
		return;
	//   22   34:return          
		s;
	//   23   35:astore_1        
	//*  24   36:aload_0         
		throw s;
	//   25   37:monitorexit     
	//   26   38:aload_1         
	//   27   39:athrow          
	}

	public void put(String s, com.android.volley.Cache.Entry entry)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		File file;
		pruneIfNeeded(entry.data.length);
	//    2    2:aload_0         
	//    3    3:aload_2         
	//    4    4:getfield        #398 <Field byte[] com.android.volley.Cache$Entry.data>
	//    5    7:arraylength     
	//    6    8:invokespecial   #400 <Method void pruneIfNeeded(int)>
		file = getFileForKey(s);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #132 <Method File getFileForKey(String)>
	//   10   16:astore_3        
		BufferedOutputStream bufferedoutputstream;
		bufferedoutputstream = new BufferedOutputStream(createOutputStream(file));
	//   11   17:new             #402 <Class BufferedOutputStream>
	//   12   20:dup             
	//   13   21:aload_0         
	//   14   22:aload_3         
	//   15   23:invokevirtual   #404 <Method OutputStream createOutputStream(File)>
	//   16   26:invokespecial   #407 <Method void BufferedOutputStream(OutputStream)>
	//   17   29:astore          4
		CacheHeader cacheheader = new CacheHeader(s, entry);
	//   18   31:new             #8   <Class DiskBasedCache$CacheHeader>
	//   19   34:dup             
	//   20   35:aload_1         
	//   21   36:aload_2         
	//   22   37:invokespecial   #409 <Method void DiskBasedCache$CacheHeader(String, com.android.volley.Cache$Entry)>
	//   23   40:astore          5
		if(!cacheheader.writeHeader(((OutputStream) (bufferedoutputstream))))
			break MISSING_BLOCK_LABEL_76;
	//   24   42:aload           5
	//   25   44:aload           4
	//   26   46:invokevirtual   #413 <Method boolean DiskBasedCache$CacheHeader.writeHeader(OutputStream)>
	//   27   49:ifeq            76
		bufferedoutputstream.write(entry.data);
	//   28   52:aload           4
	//   29   54:aload_2         
	//   30   55:getfield        #398 <Field byte[] com.android.volley.Cache$Entry.data>
	//   31   58:invokevirtual   #415 <Method void BufferedOutputStream.write(byte[])>
		bufferedoutputstream.close();
	//   32   61:aload           4
	//   33   63:invokevirtual   #416 <Method void BufferedOutputStream.close()>
		putEntry(s, cacheheader);
	//   34   66:aload_0         
	//   35   67:aload_1         
	//   36   68:aload           5
	//   37   70:invokespecial   #379 <Method void putEntry(String, DiskBasedCache$CacheHeader)>
		this;
	//   38   73:aload_0         
		JVM INSTR monitorexit ;
	//   39   74:monitorexit     
		return;
	//   40   75:return          
		try
		{
			bufferedoutputstream.close();
	//   41   76:aload           4
	//   42   78:invokevirtual   #416 <Method void BufferedOutputStream.close()>
			VolleyLog.d("Failed to write header for %s", new Object[] {
				file.getAbsolutePath()
			});
	//   43   81:ldc2            #418 <String "Failed to write header for %s">
	//   44   84:iconst_1        
	//   45   85:anewarray       Object[]
	//   46   88:dup             
	//   47   89:iconst_0        
	//   48   90:aload_3         
	//   49   91:invokevirtual   #348 <Method String File.getAbsolutePath()>
	//   50   94:aastore         
	//   51   95:invokestatic    #147 <Method void VolleyLog.d(String, Object[])>
			throw new IOException();
	//   52   98:new             #181 <Class IOException>
	//   53  101:dup             
	//   54  102:invokespecial   #419 <Method void IOException()>
	//   55  105:athrow          
		}
	//*  56  106:aload_3         
	//*  57  107:invokevirtual   #137 <Method boolean File.delete()>
	//*  58  110:ifne            130
	//*  59  113:ldc2            #421 <String "Could not clean up file %s">
	//*  60  116:iconst_1        
	//*  61  117:anewarray       Object[]
	//*  62  120:dup             
	//*  63  121:iconst_0        
	//*  64  122:aload_3         
	//*  65  123:invokevirtual   #348 <Method String File.getAbsolutePath()>
	//*  66  126:aastore         
	//*  67  127:invokestatic    #147 <Method void VolleyLog.d(String, Object[])>
	//*  68  130:aload_0         
	//*  69  131:monitorexit     
	//*  70  132:return          
	//*  71  133:astore_1        
	//*  72  134:aload_0         
	//*  73  135:monitorexit     
	//*  74  136:aload_1         
	//*  75  137:athrow          
		// Misplaced declaration of an exception variable
		catch(String s) { }
	//   76  138:astore_1        
		if(!file.delete())
			VolleyLog.d("Could not clean up file %s", new Object[] {
				file.getAbsolutePath()
			});
		this;
		JVM INSTR monitorexit ;
		return;
		s;
		throw s;
	//*  77  139:goto            106
	}

	public void remove(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag;
		flag = getFileForKey(s).delete();
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #132 <Method File getFileForKey(String)>
	//    5    7:invokevirtual   #137 <Method boolean File.delete()>
	//    6   10:istore_2        
		removeEntry(s);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokespecial   #350 <Method void removeEntry(String)>
		if(flag)
			break MISSING_BLOCK_LABEL_41;
	//   10   16:iload_2         
	//   11   17:ifne            41
		VolleyLog.d("Could not delete cache entry for key=%s, filename=%s", new Object[] {
			s, getFilenameForKey(s)
		});
	//   12   20:ldc1            #142 <String "Could not delete cache entry for key=%s, filename=%s">
	//   13   22:iconst_2        
	//   14   23:anewarray       Object[]
	//   15   26:dup             
	//   16   27:iconst_0        
	//   17   28:aload_1         
	//   18   29:aastore         
	//   19   30:dup             
	//   20   31:iconst_1        
	//   21   32:aload_0         
	//   22   33:aload_1         
	//   23   34:invokespecial   #144 <Method String getFilenameForKey(String)>
	//   24   37:aastore         
	//   25   38:invokestatic    #147 <Method void VolleyLog.d(String, Object[])>
		this;
	//   26   41:aload_0         
		JVM INSTR monitorexit ;
	//   27   42:monitorexit     
		return;
	//   28   43:return          
		s;
	//   29   44:astore_1        
	//*  30   45:aload_0         
		throw s;
	//   31   46:monitorexit     
	//   32   47:aload_1         
	//   33   48:athrow          
	}

	private final Map mEntries;
	private final int mMaxCacheSizeInBytes;
	private final File mRootDirectory;
	private long mTotalSize;
}
