// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.Cache;
import com.android.volley.VolleyLog;
import java.io.*;
import java.util.*;

public class DiskBasedCache
	implements Cache
{
	static class CacheHeader
	{

		public static CacheHeader readHeader(InputStream inputstream)
			throws IOException
		{
			CacheHeader cacheheader = new CacheHeader();
		//    0    0:new             #2   <Class DiskBasedCache$CacheHeader>
		//    1    3:dup             
		//    2    4:invokespecial   #58  <Method void DiskBasedCache$CacheHeader()>
		//    3    7:astore_1        
			if(DiskBasedCache.readInt(inputstream) != 0x20150306)
		//*   4    8:aload_0         
		//*   5    9:invokestatic    #62  <Method int DiskBasedCache.readInt(InputStream)>
		//*   6   12:ldc1            #63  <Int 0x20150306>
		//*   7   14:icmpeq          25
				throw new IOException();
		//    8   17:new             #57  <Class IOException>
		//    9   20:dup             
		//   10   21:invokespecial   #64  <Method void IOException()>
		//   11   24:athrow          
			cacheheader.key = DiskBasedCache.readString(inputstream);
		//   12   25:aload_1         
		//   13   26:aload_0         
		//   14   27:invokestatic    #68  <Method String DiskBasedCache.readString(InputStream)>
		//   15   30:putfield        #27  <Field String key>
			cacheheader.etag = DiskBasedCache.readString(inputstream);
		//   16   33:aload_1         
		//   17   34:aload_0         
		//   18   35:invokestatic    #68  <Method String DiskBasedCache.readString(InputStream)>
		//   19   38:putfield        #38  <Field String etag>
			if(cacheheader.etag.equals(""))
		//*  20   41:aload_1         
		//*  21   42:getfield        #38  <Field String etag>
		//*  22   45:ldc1            #70  <String "">
		//*  23   47:invokevirtual   #76  <Method boolean String.equals(Object)>
		//*  24   50:ifeq            58
				cacheheader.etag = null;
		//   25   53:aload_1         
		//   26   54:aconst_null     
		//   27   55:putfield        #38  <Field String etag>
			cacheheader.serverDate = DiskBasedCache.readLong(inputstream);
		//   28   58:aload_1         
		//   29   59:aload_0         
		//   30   60:invokestatic    #80  <Method long DiskBasedCache.readLong(InputStream)>
		//   31   63:putfield        #41  <Field long serverDate>
			cacheheader.lastModified = DiskBasedCache.readLong(inputstream);
		//   32   66:aload_1         
		//   33   67:aload_0         
		//   34   68:invokestatic    #80  <Method long DiskBasedCache.readLong(InputStream)>
		//   35   71:putfield        #44  <Field long lastModified>
			cacheheader.ttl = DiskBasedCache.readLong(inputstream);
		//   36   74:aload_1         
		//   37   75:aload_0         
		//   38   76:invokestatic    #80  <Method long DiskBasedCache.readLong(InputStream)>
		//   39   79:putfield        #47  <Field long ttl>
			cacheheader.softTtl = DiskBasedCache.readLong(inputstream);
		//   40   82:aload_1         
		//   41   83:aload_0         
		//   42   84:invokestatic    #80  <Method long DiskBasedCache.readLong(InputStream)>
		//   43   87:putfield        #50  <Field long softTtl>
			cacheheader.responseHeaders = DiskBasedCache.readStringStringMap(inputstream);
		//   44   90:aload_1         
		//   45   91:aload_0         
		//   46   92:invokestatic    #84  <Method Map DiskBasedCache.readStringStringMap(InputStream)>
		//   47   95:putfield        #53  <Field Map responseHeaders>
			return cacheheader;
		//   48   98:aload_1         
		//   49   99:areturn         
		}

		public com.android.volley.Cache.Entry toCacheEntry(byte abyte0[])
		{
			com.android.volley.Cache.Entry entry = new com.android.volley.Cache.Entry();
		//    0    0:new             #29  <Class com.android.volley.Cache$Entry>
		//    1    3:dup             
		//    2    4:invokespecial   #88  <Method void com.android.volley.Cache$Entry()>
		//    3    7:astore_2        
			entry.data = abyte0;
		//    4    8:aload_2         
		//    5    9:aload_1         
		//    6   10:putfield        #33  <Field byte[] com.android.volley.Cache$Entry.data>
			entry.etag = etag;
		//    7   13:aload_2         
		//    8   14:aload_0         
		//    9   15:getfield        #38  <Field String etag>
		//   10   18:putfield        #37  <Field String com.android.volley.Cache$Entry.etag>
			entry.serverDate = serverDate;
		//   11   21:aload_2         
		//   12   22:aload_0         
		//   13   23:getfield        #41  <Field long serverDate>
		//   14   26:putfield        #40  <Field long com.android.volley.Cache$Entry.serverDate>
			entry.lastModified = lastModified;
		//   15   29:aload_2         
		//   16   30:aload_0         
		//   17   31:getfield        #44  <Field long lastModified>
		//   18   34:putfield        #43  <Field long com.android.volley.Cache$Entry.lastModified>
			entry.ttl = ttl;
		//   19   37:aload_2         
		//   20   38:aload_0         
		//   21   39:getfield        #47  <Field long ttl>
		//   22   42:putfield        #46  <Field long com.android.volley.Cache$Entry.ttl>
			entry.softTtl = softTtl;
		//   23   45:aload_2         
		//   24   46:aload_0         
		//   25   47:getfield        #50  <Field long softTtl>
		//   26   50:putfield        #49  <Field long com.android.volley.Cache$Entry.softTtl>
			entry.responseHeaders = responseHeaders;
		//   27   53:aload_2         
		//   28   54:aload_0         
		//   29   55:getfield        #53  <Field Map responseHeaders>
		//   30   58:putfield        #52  <Field Map com.android.volley.Cache$Entry.responseHeaders>
			return entry;
		//   31   61:aload_2         
		//   32   62:areturn         
		}

		public boolean writeHeader(OutputStream outputstream)
		{
			DiskBasedCache.writeInt(outputstream, 0x20150306);
		//    0    0:aload_1         
		//    1    1:ldc1            #63  <Int 0x20150306>
		//    2    3:invokestatic    #94  <Method void DiskBasedCache.writeInt(OutputStream, int)>
			DiskBasedCache.writeString(outputstream, key);
		//    3    6:aload_1         
		//    4    7:aload_0         
		//    5    8:getfield        #27  <Field String key>
		//    6   11:invokestatic    #98  <Method void DiskBasedCache.writeString(OutputStream, String)>
			String s;
			if(etag == null)
		//*   7   14:aload_0         
		//*   8   15:getfield        #38  <Field String etag>
		//*   9   18:ifnonnull       27
			{
				s = "";
		//   10   21:ldc1            #70  <String "">
		//   11   23:astore_2        
				break MISSING_BLOCK_LABEL_32;
		//   12   24:goto            32
			}
			s = etag;
		//   13   27:aload_0         
		//   14   28:getfield        #38  <Field String etag>
		//   15   31:astore_2        
			DiskBasedCache.writeString(outputstream, s);
		//   16   32:aload_1         
		//   17   33:aload_2         
		//   18   34:invokestatic    #98  <Method void DiskBasedCache.writeString(OutputStream, String)>
			DiskBasedCache.writeLong(outputstream, serverDate);
		//   19   37:aload_1         
		//   20   38:aload_0         
		//   21   39:getfield        #41  <Field long serverDate>
		//   22   42:invokestatic    #102 <Method void DiskBasedCache.writeLong(OutputStream, long)>
			DiskBasedCache.writeLong(outputstream, lastModified);
		//   23   45:aload_1         
		//   24   46:aload_0         
		//   25   47:getfield        #44  <Field long lastModified>
		//   26   50:invokestatic    #102 <Method void DiskBasedCache.writeLong(OutputStream, long)>
			DiskBasedCache.writeLong(outputstream, ttl);
		//   27   53:aload_1         
		//   28   54:aload_0         
		//   29   55:getfield        #47  <Field long ttl>
		//   30   58:invokestatic    #102 <Method void DiskBasedCache.writeLong(OutputStream, long)>
			DiskBasedCache.writeLong(outputstream, softTtl);
		//   31   61:aload_1         
		//   32   62:aload_0         
		//   33   63:getfield        #50  <Field long softTtl>
		//   34   66:invokestatic    #102 <Method void DiskBasedCache.writeLong(OutputStream, long)>
			DiskBasedCache.writeStringStringMap(responseHeaders, outputstream);
		//   35   69:aload_0         
		//   36   70:getfield        #53  <Field Map responseHeaders>
		//   37   73:aload_1         
		//   38   74:invokestatic    #106 <Method void DiskBasedCache.writeStringStringMap(Map, OutputStream)>
			outputstream.flush();
		//   39   77:aload_1         
		//   40   78:invokevirtual   #111 <Method void OutputStream.flush()>
			return true;
		//   41   81:iconst_1        
		//   42   82:ireturn         
			outputstream;
		//   43   83:astore_1        
			VolleyLog.d("%s", new Object[] {
				((IOException) (outputstream)).toString()
			});
		//   44   84:ldc1            #113 <String "%s">
		//   45   86:iconst_1        
		//   46   87:anewarray       Object[]
		//   47   90:dup             
		//   48   91:iconst_0        
		//   49   92:aload_1         
		//   50   93:invokevirtual   #117 <Method String IOException.toString()>
		//   51   96:aastore         
		//   52   97:invokestatic    #123 <Method void VolleyLog.d(String, Object[])>
			return false;
		//   53  100:iconst_0        
		//   54  101:ireturn         
		}

		public String etag;
		public String key;
		public long lastModified;
		public Map responseHeaders;
		public long serverDate;
		public long size;
		public long softTtl;
		public long ttl;

		private CacheHeader()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
		//    2    4:return          
		}

		public CacheHeader(String s, com.android.volley.Cache.Entry entry)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			key = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #27  <Field String key>
			size = entry.data.length;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:getfield        #33  <Field byte[] com.android.volley.Cache$Entry.data>
		//    8   14:arraylength     
		//    9   15:i2l             
		//   10   16:putfield        #35  <Field long size>
			etag = entry.etag;
		//   11   19:aload_0         
		//   12   20:aload_2         
		//   13   21:getfield        #37  <Field String com.android.volley.Cache$Entry.etag>
		//   14   24:putfield        #38  <Field String etag>
			serverDate = entry.serverDate;
		//   15   27:aload_0         
		//   16   28:aload_2         
		//   17   29:getfield        #40  <Field long com.android.volley.Cache$Entry.serverDate>
		//   18   32:putfield        #41  <Field long serverDate>
			lastModified = entry.lastModified;
		//   19   35:aload_0         
		//   20   36:aload_2         
		//   21   37:getfield        #43  <Field long com.android.volley.Cache$Entry.lastModified>
		//   22   40:putfield        #44  <Field long lastModified>
			ttl = entry.ttl;
		//   23   43:aload_0         
		//   24   44:aload_2         
		//   25   45:getfield        #46  <Field long com.android.volley.Cache$Entry.ttl>
		//   26   48:putfield        #47  <Field long ttl>
			softTtl = entry.softTtl;
		//   27   51:aload_0         
		//   28   52:aload_2         
		//   29   53:getfield        #49  <Field long com.android.volley.Cache$Entry.softTtl>
		//   30   56:putfield        #50  <Field long softTtl>
			responseHeaders = entry.responseHeaders;
		//   31   59:aload_0         
		//   32   60:aload_2         
		//   33   61:getfield        #52  <Field Map com.android.volley.Cache$Entry.responseHeaders>
		//   34   64:putfield        #53  <Field Map responseHeaders>
		//   35   67:return          
		}
	}

	static class CountingInputStream extends FilterInputStream
	{

		public int read()
			throws IOException
		{
			int i = super.read();
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method int FilterInputStream.read()>
		//    2    4:istore_1        
			if(i != -1)
		//*   3    5:iload_1         
		//*   4    6:iconst_m1       
		//*   5    7:icmpeq          20
				bytesRead = bytesRead + 1;
		//    6   10:aload_0         
		//    7   11:aload_0         
		//    8   12:getfield        #15  <Field int bytesRead>
		//    9   15:iconst_1        
		//   10   16:iadd            
		//   11   17:putfield        #15  <Field int bytesRead>
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
		//    4    4:invokespecial   #30  <Method int FilterInputStream.read(byte[], int, int)>
		//    5    7:istore_2        
			if(i != -1)
		//*   6    8:iload_2         
		//*   7    9:iconst_m1       
		//*   8   10:icmpeq          23
				bytesRead = bytesRead + i;
		//    9   13:aload_0         
		//   10   14:aload_0         
		//   11   15:getfield        #15  <Field int bytesRead>
		//   12   18:iload_2         
		//   13   19:iadd            
		//   14   20:putfield        #15  <Field int bytesRead>
			return i;
		//   15   23:iload_2         
		//   16   24:ireturn         
		}

		private int bytesRead;


/*
		static int access$100(CountingInputStream countinginputstream)
		{
			return countinginputstream.bytesRead;
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field int bytesRead>
		//    2    4:ireturn         
		}

*/

		private CountingInputStream(InputStream inputstream)
		{
			super(inputstream);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #13  <Method void FilterInputStream(InputStream)>
			bytesRead = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #15  <Field int bytesRead>
		//    6   10:return          
		}

	}


	public DiskBasedCache(File file)
	{
		this(file, 0x500000);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #19  <Int 0x500000>
	//    3    4:invokespecial   #35  <Method void DiskBasedCache(File, int)>
	//    4    7:return          
	}

	public DiskBasedCache(File file, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		mEntries = ((Map) (new LinkedHashMap(16, 0.75F, true)));
	//    2    4:aload_0         
	//    3    5:new             #41  <Class LinkedHashMap>
	//    4    8:dup             
	//    5    9:bipush          16
	//    6   11:ldc1            #42  <Float 0.75F>
	//    7   13:iconst_1        
	//    8   14:invokespecial   #45  <Method void LinkedHashMap(int, float, boolean)>
	//    9   17:putfield        #47  <Field Map mEntries>
		mTotalSize = 0L;
	//   10   20:aload_0         
	//   11   21:lconst_0        
	//   12   22:putfield        #49  <Field long mTotalSize>
		mRootDirectory = file;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #51  <Field File mRootDirectory>
		mMaxCacheSizeInBytes = i;
	//   16   30:aload_0         
	//   17   31:iload_2         
	//   18   32:putfield        #53  <Field int mMaxCacheSizeInBytes>
	//   19   35:return          
	}

	private String getFilenameForKey(String s)
	{
		int i = s.length() / 2;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #61  <Method int String.length()>
	//    2    4:iconst_2        
	//    3    5:idiv            
	//    4    6:istore_2        
		int j = s.substring(0, i).hashCode();
	//    5    7:aload_1         
	//    6    8:iconst_0        
	//    7    9:iload_2         
	//    8   10:invokevirtual   #65  <Method String String.substring(int, int)>
	//    9   13:invokevirtual   #68  <Method int String.hashCode()>
	//   10   16:istore_3        
		return (new StringBuilder()).append(String.valueOf(j)).append(String.valueOf(s.substring(i).hashCode())).toString();
	//   11   17:new             #70  <Class StringBuilder>
	//   12   20:dup             
	//   13   21:invokespecial   #71  <Method void StringBuilder()>
	//   14   24:iload_3         
	//   15   25:invokestatic    #75  <Method String String.valueOf(int)>
	//   16   28:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   17   31:aload_1         
	//   18   32:iload_2         
	//   19   33:invokevirtual   #81  <Method String String.substring(int)>
	//   20   36:invokevirtual   #68  <Method int String.hashCode()>
	//   21   39:invokestatic    #75  <Method String String.valueOf(int)>
	//   22   42:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   23   45:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   24   48:areturn         
	}

	private void pruneIfNeeded(int i)
	{
		if(mTotalSize + (long)i < (long)mMaxCacheSizeInBytes)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field long mTotalSize>
	//*   2    4:iload_1         
	//*   3    5:i2l             
	//*   4    6:ladd            
	//*   5    7:aload_0         
	//*   6    8:getfield        #53  <Field int mMaxCacheSizeInBytes>
	//*   7   11:i2l             
	//*   8   12:lcmp            
	//*   9   13:ifge            17
			return;
	//   10   16:return          
		if(VolleyLog.DEBUG)
	//*  11   17:getstatic       #93  <Field boolean VolleyLog.DEBUG>
	//*  12   20:ifeq            32
			VolleyLog.v("Pruning old cache entries.", new Object[0]);
	//   13   23:ldc1            #95  <String "Pruning old cache entries.">
	//   14   25:iconst_0        
	//   15   26:anewarray       Object[]
	//   16   29:invokestatic    #99  <Method void VolleyLog.v(String, Object[])>
		long l = mTotalSize;
	//   17   32:aload_0         
	//   18   33:getfield        #49  <Field long mTotalSize>
	//   19   36:lstore          4
		int j = 0;
	//   20   38:iconst_0        
	//   21   39:istore_2        
		long l1 = SystemClock.elapsedRealtime();
	//   22   40:invokestatic    #105 <Method long SystemClock.elapsedRealtime()>
	//   23   43:lstore          6
		Iterator iterator = mEntries.entrySet().iterator();
	//   24   45:aload_0         
	//   25   46:getfield        #47  <Field Map mEntries>
	//   26   49:invokeinterface #111 <Method Set Map.entrySet()>
	//   27   54:invokeinterface #117 <Method Iterator Set.iterator()>
	//   28   59:astore          8
		int k;
		do
		{
			k = j;
	//   29   61:iload_2         
	//   30   62:istore_3        
			if(!iterator.hasNext())
				break;
	//   31   63:aload           8
	//   32   65:invokeinterface #123 <Method boolean Iterator.hasNext()>
	//   33   70:ifeq            193
			CacheHeader cacheheader = (CacheHeader)((java.util.Map.Entry)iterator.next()).getValue();
	//   34   73:aload           8
	//   35   75:invokeinterface #127 <Method Object Iterator.next()>
	//   36   80:checkcast       #129 <Class java.util.Map$Entry>
	//   37   83:invokeinterface #132 <Method Object java.util.Map$Entry.getValue()>
	//   38   88:checkcast       #10  <Class DiskBasedCache$CacheHeader>
	//   39   91:astore          9
			if(getFileForKey(cacheheader.key).delete())
	//*  40   93:aload_0         
	//*  41   94:aload           9
	//*  42   96:getfield        #136 <Field String DiskBasedCache$CacheHeader.key>
	//*  43   99:invokevirtual   #140 <Method File getFileForKey(String)>
	//*  44  102:invokevirtual   #145 <Method boolean File.delete()>
	//*  45  105:ifeq            125
				mTotalSize = mTotalSize - cacheheader.size;
	//   46  108:aload_0         
	//   47  109:aload_0         
	//   48  110:getfield        #49  <Field long mTotalSize>
	//   49  113:aload           9
	//   50  115:getfield        #148 <Field long DiskBasedCache$CacheHeader.size>
	//   51  118:lsub            
	//   52  119:putfield        #49  <Field long mTotalSize>
			else
	//*  53  122:goto            154
				VolleyLog.d("Could not delete cache entry for key=%s, filename=%s", new Object[] {
					cacheheader.key, getFilenameForKey(cacheheader.key)
				});
	//   54  125:ldc1            #150 <String "Could not delete cache entry for key=%s, filename=%s">
	//   55  127:iconst_2        
	//   56  128:anewarray       Object[]
	//   57  131:dup             
	//   58  132:iconst_0        
	//   59  133:aload           9
	//   60  135:getfield        #136 <Field String DiskBasedCache$CacheHeader.key>
	//   61  138:aastore         
	//   62  139:dup             
	//   63  140:iconst_1        
	//   64  141:aload_0         
	//   65  142:aload           9
	//   66  144:getfield        #136 <Field String DiskBasedCache$CacheHeader.key>
	//   67  147:invokespecial   #152 <Method String getFilenameForKey(String)>
	//   68  150:aastore         
	//   69  151:invokestatic    #155 <Method void VolleyLog.d(String, Object[])>
			iterator.remove();
	//   70  154:aload           8
	//   71  156:invokeinterface #158 <Method void Iterator.remove()>
			j++;
	//   72  161:iload_2         
	//   73  162:iconst_1        
	//   74  163:iadd            
	//   75  164:istore_2        
			if((float)(mTotalSize + (long)i) >= (float)mMaxCacheSizeInBytes * 0.9F)
				continue;
	//   76  165:aload_0         
	//   77  166:getfield        #49  <Field long mTotalSize>
	//   78  169:iload_1         
	//   79  170:i2l             
	//   80  171:ladd            
	//   81  172:l2f             
	//   82  173:aload_0         
	//   83  174:getfield        #53  <Field int mMaxCacheSizeInBytes>
	//   84  177:i2f             
	//   85  178:ldc1            #22  <Float 0.9F>
	//   86  180:fmul            
	//   87  181:fcmpg           
	//   88  182:ifge            190
			k = j;
	//   89  185:iload_2         
	//   90  186:istore_3        
			break;
	//   91  187:goto            193
		} while(true);
	//*  92  190:goto            61
		if(VolleyLog.DEBUG)
	//*  93  193:getstatic       #93  <Field boolean VolleyLog.DEBUG>
	//*  94  196:ifeq            240
			VolleyLog.v("pruned %d files, %d bytes, %d ms", new Object[] {
				Integer.valueOf(k), Long.valueOf(mTotalSize - l), Long.valueOf(SystemClock.elapsedRealtime() - l1)
			});
	//   95  199:ldc1            #160 <String "pruned %d files, %d bytes, %d ms">
	//   96  201:iconst_3        
	//   97  202:anewarray       Object[]
	//   98  205:dup             
	//   99  206:iconst_0        
	//  100  207:iload_3         
	//  101  208:invokestatic    #165 <Method Integer Integer.valueOf(int)>
	//  102  211:aastore         
	//  103  212:dup             
	//  104  213:iconst_1        
	//  105  214:aload_0         
	//  106  215:getfield        #49  <Field long mTotalSize>
	//  107  218:lload           4
	//  108  220:lsub            
	//  109  221:invokestatic    #170 <Method Long Long.valueOf(long)>
	//  110  224:aastore         
	//  111  225:dup             
	//  112  226:iconst_2        
	//  113  227:invokestatic    #105 <Method long SystemClock.elapsedRealtime()>
	//  114  230:lload           6
	//  115  232:lsub            
	//  116  233:invokestatic    #170 <Method Long Long.valueOf(long)>
	//  117  236:aastore         
	//  118  237:invokestatic    #99  <Method void VolleyLog.v(String, Object[])>
	//  119  240:return          
	}

	private void putEntry(String s, CacheHeader cacheheader)
	{
		if(!mEntries.containsKey(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field Map mEntries>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #176 <Method boolean Map.containsKey(Object)>
	//*   4   10:ifne            29
		{
			mTotalSize = mTotalSize + cacheheader.size;
	//    5   13:aload_0         
	//    6   14:aload_0         
	//    7   15:getfield        #49  <Field long mTotalSize>
	//    8   18:aload_2         
	//    9   19:getfield        #148 <Field long DiskBasedCache$CacheHeader.size>
	//   10   22:ladd            
	//   11   23:putfield        #49  <Field long mTotalSize>
		} else
	//*  12   26:goto            61
		{
			CacheHeader cacheheader1 = (CacheHeader)mEntries.get(((Object) (s)));
	//   13   29:aload_0         
	//   14   30:getfield        #47  <Field Map mEntries>
	//   15   33:aload_1         
	//   16   34:invokeinterface #180 <Method Object Map.get(Object)>
	//   17   39:checkcast       #10  <Class DiskBasedCache$CacheHeader>
	//   18   42:astore_3        
			mTotalSize = mTotalSize + (cacheheader.size - cacheheader1.size);
	//   19   43:aload_0         
	//   20   44:aload_0         
	//   21   45:getfield        #49  <Field long mTotalSize>
	//   22   48:aload_2         
	//   23   49:getfield        #148 <Field long DiskBasedCache$CacheHeader.size>
	//   24   52:aload_3         
	//   25   53:getfield        #148 <Field long DiskBasedCache$CacheHeader.size>
	//   26   56:lsub            
	//   27   57:ladd            
	//   28   58:putfield        #49  <Field long mTotalSize>
		}
		mEntries.put(((Object) (s)), ((Object) (cacheheader)));
	//   29   61:aload_0         
	//   30   62:getfield        #47  <Field Map mEntries>
	//   31   65:aload_1         
	//   32   66:aload_2         
	//   33   67:invokeinterface #184 <Method Object Map.put(Object, Object)>
	//   34   72:pop             
	//   35   73:return          
	}

	private static int read(InputStream inputstream)
		throws IOException
	{
		int i = inputstream.read();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #192 <Method int InputStream.read()>
	//    2    4:istore_1        
		if(i == -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpne          18
			throw new EOFException();
	//    6   10:new             #194 <Class EOFException>
	//    7   13:dup             
	//    8   14:invokespecial   #195 <Method void EOFException()>
	//    9   17:athrow          
		else
			return i;
	//   10   18:iload_1         
	//   11   19:ireturn         
	}

	static int readInt(InputStream inputstream)
		throws IOException
	{
		return read(inputstream) << 0 | 0 | read(inputstream) << 8 | read(inputstream) << 16 | read(inputstream) << 24;
	//    0    0:aload_0         
	//    1    1:invokestatic    #199 <Method int read(InputStream)>
	//    2    4:iconst_0        
	//    3    5:ishl            
	//    4    6:iconst_0        
	//    5    7:ior             
	//    6    8:aload_0         
	//    7    9:invokestatic    #199 <Method int read(InputStream)>
	//    8   12:bipush          8
	//    9   14:ishl            
	//   10   15:ior             
	//   11   16:aload_0         
	//   12   17:invokestatic    #199 <Method int read(InputStream)>
	//   13   20:bipush          16
	//   14   22:ishl            
	//   15   23:ior             
	//   16   24:aload_0         
	//   17   25:invokestatic    #199 <Method int read(InputStream)>
	//   18   28:bipush          24
	//   19   30:ishl            
	//   20   31:ior             
	//   21   32:ireturn         
	}

	static long readLong(InputStream inputstream)
		throws IOException
	{
		return 0L | ((long)read(inputstream) & 255L) << 0 | ((long)read(inputstream) & 255L) << 8 | ((long)read(inputstream) & 255L) << 16 | ((long)read(inputstream) & 255L) << 24 | ((long)read(inputstream) & 255L) << 32 | ((long)read(inputstream) & 255L) << 40 | ((long)read(inputstream) & 255L) << 48 | ((long)read(inputstream) & 255L) << 56;
	//    0    0:lconst_0        
	//    1    1:aload_0         
	//    2    2:invokestatic    #199 <Method int read(InputStream)>
	//    3    5:i2l             
	//    4    6:ldc2w           #202 <Long 255L>
	//    5    9:land            
	//    6   10:iconst_0        
	//    7   11:lshl            
	//    8   12:lor             
	//    9   13:aload_0         
	//   10   14:invokestatic    #199 <Method int read(InputStream)>
	//   11   17:i2l             
	//   12   18:ldc2w           #202 <Long 255L>
	//   13   21:land            
	//   14   22:bipush          8
	//   15   24:lshl            
	//   16   25:lor             
	//   17   26:aload_0         
	//   18   27:invokestatic    #199 <Method int read(InputStream)>
	//   19   30:i2l             
	//   20   31:ldc2w           #202 <Long 255L>
	//   21   34:land            
	//   22   35:bipush          16
	//   23   37:lshl            
	//   24   38:lor             
	//   25   39:aload_0         
	//   26   40:invokestatic    #199 <Method int read(InputStream)>
	//   27   43:i2l             
	//   28   44:ldc2w           #202 <Long 255L>
	//   29   47:land            
	//   30   48:bipush          24
	//   31   50:lshl            
	//   32   51:lor             
	//   33   52:aload_0         
	//   34   53:invokestatic    #199 <Method int read(InputStream)>
	//   35   56:i2l             
	//   36   57:ldc2w           #202 <Long 255L>
	//   37   60:land            
	//   38   61:bipush          32
	//   39   63:lshl            
	//   40   64:lor             
	//   41   65:aload_0         
	//   42   66:invokestatic    #199 <Method int read(InputStream)>
	//   43   69:i2l             
	//   44   70:ldc2w           #202 <Long 255L>
	//   45   73:land            
	//   46   74:bipush          40
	//   47   76:lshl            
	//   48   77:lor             
	//   49   78:aload_0         
	//   50   79:invokestatic    #199 <Method int read(InputStream)>
	//   51   82:i2l             
	//   52   83:ldc2w           #202 <Long 255L>
	//   53   86:land            
	//   54   87:bipush          48
	//   55   89:lshl            
	//   56   90:lor             
	//   57   91:aload_0         
	//   58   92:invokestatic    #199 <Method int read(InputStream)>
	//   59   95:i2l             
	//   60   96:ldc2w           #202 <Long 255L>
	//   61   99:land            
	//   62  100:bipush          56
	//   63  102:lshl            
	//   64  103:lor             
	//   65  104:lreturn         
	}

	static String readString(InputStream inputstream)
		throws IOException
	{
		return new String(streamToBytes(inputstream, (int)readLong(inputstream)), "UTF-8");
	//    0    0:new             #57  <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokestatic    #207 <Method long readLong(InputStream)>
	//    5    9:l2i             
	//    6   10:invokestatic    #211 <Method byte[] streamToBytes(InputStream, int)>
	//    7   13:ldc1            #213 <String "UTF-8">
	//    8   15:invokespecial   #216 <Method void String(byte[], String)>
	//    9   18:areturn         
	}

	static Map readStringStringMap(InputStream inputstream)
		throws IOException
	{
		int j = readInt(inputstream);
	//    0    0:aload_0         
	//    1    1:invokestatic    #220 <Method int readInt(InputStream)>
	//    2    4:istore_2        
		Object obj;
		if(j == 0)
	//*   3    5:iload_2         
	//*   4    6:ifne            16
			obj = ((Object) (Collections.emptyMap()));
	//    5    9:invokestatic    #226 <Method Map Collections.emptyMap()>
	//    6   12:astore_3        
		else
	//*   7   13:goto            25
			obj = ((Object) (new HashMap(j)));
	//    8   16:new             #228 <Class HashMap>
	//    9   19:dup             
	//   10   20:iload_2         
	//   11   21:invokespecial   #230 <Method void HashMap(int)>
	//   12   24:astore_3        
		for(int i = 0; i < j; i++)
	//*  13   25:iconst_0        
	//*  14   26:istore_1        
	//*  15   27:iload_1         
	//*  16   28:iload_2         
	//*  17   29:icmpge          60
			((Map) (obj)).put(((Object) (readString(inputstream).intern())), ((Object) (readString(inputstream).intern())));
	//   18   32:aload_3         
	//   19   33:aload_0         
	//   20   34:invokestatic    #232 <Method String readString(InputStream)>
	//   21   37:invokevirtual   #235 <Method String String.intern()>
	//   22   40:aload_0         
	//   23   41:invokestatic    #232 <Method String readString(InputStream)>
	//   24   44:invokevirtual   #235 <Method String String.intern()>
	//   25   47:invokeinterface #184 <Method Object Map.put(Object, Object)>
	//   26   52:pop             

	//   27   53:iload_1         
	//   28   54:iconst_1        
	//   29   55:iadd            
	//   30   56:istore_1        
	//*  31   57:goto            27
		return ((Map) (obj));
	//   32   60:aload_3         
	//   33   61:areturn         
	}

	private void removeEntry(String s)
	{
		CacheHeader cacheheader = (CacheHeader)mEntries.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Map mEntries>
	//    2    4:aload_1         
	//    3    5:invokeinterface #180 <Method Object Map.get(Object)>
	//    4   10:checkcast       #10  <Class DiskBasedCache$CacheHeader>
	//    5   13:astore_2        
		if(cacheheader != null)
	//*   6   14:aload_2         
	//*   7   15:ifnull          42
		{
			mTotalSize = mTotalSize - cacheheader.size;
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #49  <Field long mTotalSize>
	//   11   23:aload_2         
	//   12   24:getfield        #148 <Field long DiskBasedCache$CacheHeader.size>
	//   13   27:lsub            
	//   14   28:putfield        #49  <Field long mTotalSize>
			mEntries.remove(((Object) (s)));
	//   15   31:aload_0         
	//   16   32:getfield        #47  <Field Map mEntries>
	//   17   35:aload_1         
	//   18   36:invokeinterface #241 <Method Object Map.remove(Object)>
	//   19   41:pop             
		}
	//   20   42:return          
	}

	private static byte[] streamToBytes(InputStream inputstream, int i)
		throws IOException
	{
		byte abyte0[] = new byte[i];
	//    0    0:iload_1         
	//    1    1:newarray        byte[]
	//    2    3:astore          4
		int j = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		do
		{
			if(j >= i)
				break;
	//    5    7:iload_2         
	//    6    8:iload_1         
	//    7    9:icmpge          35
			int k = inputstream.read(abyte0, j, i - j);
	//    8   12:aload_0         
	//    9   13:aload           4
	//   10   15:iload_2         
	//   11   16:iload_1         
	//   12   17:iload_2         
	//   13   18:isub            
	//   14   19:invokevirtual   #244 <Method int InputStream.read(byte[], int, int)>
	//   15   22:istore_3        
			if(k == -1)
				break;
	//   16   23:iload_3         
	//   17   24:iconst_m1       
	//   18   25:icmpeq          35
			j += k;
	//   19   28:iload_2         
	//   20   29:iload_3         
	//   21   30:iadd            
	//   22   31:istore_2        
		} while(true);
	//   23   32:goto            7
		if(j != i)
	//*  24   35:iload_2         
	//*  25   36:iload_1         
	//*  26   37:icmpeq          81
			throw new IOException((new StringBuilder()).append("Expected ").append(i).append(" bytes, read ").append(j).append(" bytes").toString());
	//   27   40:new             #188 <Class IOException>
	//   28   43:dup             
	//   29   44:new             #70  <Class StringBuilder>
	//   30   47:dup             
	//   31   48:invokespecial   #71  <Method void StringBuilder()>
	//   32   51:ldc1            #246 <String "Expected ">
	//   33   53:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   34   56:iload_1         
	//   35   57:invokevirtual   #249 <Method StringBuilder StringBuilder.append(int)>
	//   36   60:ldc1            #251 <String " bytes, read ">
	//   37   62:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   38   65:iload_2         
	//   39   66:invokevirtual   #249 <Method StringBuilder StringBuilder.append(int)>
	//   40   69:ldc1            #253 <String " bytes">
	//   41   71:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   42   74:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   43   77:invokespecial   #255 <Method void IOException(String)>
	//   44   80:athrow          
		else
			return abyte0;
	//   45   81:aload           4
	//   46   83:areturn         
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
	//    6    8:invokevirtual   #262 <Method void OutputStream.write(int)>
		outputstream.write(i >> 8 & 0xff);
	//    7   11:aload_0         
	//    8   12:iload_1         
	//    9   13:bipush          8
	//   10   15:ishr            
	//   11   16:sipush          255
	//   12   19:iand            
	//   13   20:invokevirtual   #262 <Method void OutputStream.write(int)>
		outputstream.write(i >> 16 & 0xff);
	//   14   23:aload_0         
	//   15   24:iload_1         
	//   16   25:bipush          16
	//   17   27:ishr            
	//   18   28:sipush          255
	//   19   31:iand            
	//   20   32:invokevirtual   #262 <Method void OutputStream.write(int)>
		outputstream.write(i >> 24 & 0xff);
	//   21   35:aload_0         
	//   22   36:iload_1         
	//   23   37:bipush          24
	//   24   39:ishr            
	//   25   40:sipush          255
	//   26   43:iand            
	//   27   44:invokevirtual   #262 <Method void OutputStream.write(int)>
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
	//    6    6:invokevirtual   #262 <Method void OutputStream.write(int)>
		outputstream.write(((int) ((byte)(int)(l >>> 8))));
	//    7    9:aload_0         
	//    8   10:lload_1         
	//    9   11:bipush          8
	//   10   13:lushr           
	//   11   14:l2i             
	//   12   15:int2byte        
	//   13   16:invokevirtual   #262 <Method void OutputStream.write(int)>
		outputstream.write(((int) ((byte)(int)(l >>> 16))));
	//   14   19:aload_0         
	//   15   20:lload_1         
	//   16   21:bipush          16
	//   17   23:lushr           
	//   18   24:l2i             
	//   19   25:int2byte        
	//   20   26:invokevirtual   #262 <Method void OutputStream.write(int)>
		outputstream.write(((int) ((byte)(int)(l >>> 24))));
	//   21   29:aload_0         
	//   22   30:lload_1         
	//   23   31:bipush          24
	//   24   33:lushr           
	//   25   34:l2i             
	//   26   35:int2byte        
	//   27   36:invokevirtual   #262 <Method void OutputStream.write(int)>
		outputstream.write(((int) ((byte)(int)(l >>> 32))));
	//   28   39:aload_0         
	//   29   40:lload_1         
	//   30   41:bipush          32
	//   31   43:lushr           
	//   32   44:l2i             
	//   33   45:int2byte        
	//   34   46:invokevirtual   #262 <Method void OutputStream.write(int)>
		outputstream.write(((int) ((byte)(int)(l >>> 40))));
	//   35   49:aload_0         
	//   36   50:lload_1         
	//   37   51:bipush          40
	//   38   53:lushr           
	//   39   54:l2i             
	//   40   55:int2byte        
	//   41   56:invokevirtual   #262 <Method void OutputStream.write(int)>
		outputstream.write(((int) ((byte)(int)(l >>> 48))));
	//   42   59:aload_0         
	//   43   60:lload_1         
	//   44   61:bipush          48
	//   45   63:lushr           
	//   46   64:l2i             
	//   47   65:int2byte        
	//   48   66:invokevirtual   #262 <Method void OutputStream.write(int)>
		outputstream.write(((int) ((byte)(int)(l >>> 56))));
	//   49   69:aload_0         
	//   50   70:lload_1         
	//   51   71:bipush          56
	//   52   73:lushr           
	//   53   74:l2i             
	//   54   75:int2byte        
	//   55   76:invokevirtual   #262 <Method void OutputStream.write(int)>
	//   56   79:return          
	}

	static void writeString(OutputStream outputstream, String s)
		throws IOException
	{
		s = ((String) (s.getBytes("UTF-8")));
	//    0    0:aload_1         
	//    1    1:ldc1            #213 <String "UTF-8">
	//    2    3:invokevirtual   #270 <Method byte[] String.getBytes(String)>
	//    3    6:astore_1        
		writeLong(outputstream, s.length);
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:arraylength     
	//    7   10:i2l             
	//    8   11:invokestatic    #272 <Method void writeLong(OutputStream, long)>
		outputstream.write(((byte []) (s)), 0, s.length);
	//    9   14:aload_0         
	//   10   15:aload_1         
	//   11   16:iconst_0        
	//   12   17:aload_1         
	//   13   18:arraylength     
	//   14   19:invokevirtual   #275 <Method void OutputStream.write(byte[], int, int)>
	//   15   22:return          
	}

	static void writeStringStringMap(Map map, OutputStream outputstream)
		throws IOException
	{
		if(map != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          75
		{
			writeInt(outputstream, map.size());
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:invokeinterface #279 <Method int Map.size()>
	//    5   11:invokestatic    #281 <Method void writeInt(OutputStream, int)>
			java.util.Map.Entry entry;
			for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); writeString(outputstream, (String)entry.getValue()))
	//*   6   14:aload_0         
	//*   7   15:invokeinterface #111 <Method Set Map.entrySet()>
	//*   8   20:invokeinterface #117 <Method Iterator Set.iterator()>
	//*   9   25:astore_0        
	//*  10   26:aload_0         
	//*  11   27:invokeinterface #123 <Method boolean Iterator.hasNext()>
	//*  12   32:ifeq            74
			{
				entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   13   35:aload_0         
	//   14   36:invokeinterface #127 <Method Object Iterator.next()>
	//   15   41:checkcast       #129 <Class java.util.Map$Entry>
	//   16   44:astore_2        
				writeString(outputstream, (String)entry.getKey());
	//   17   45:aload_1         
	//   18   46:aload_2         
	//   19   47:invokeinterface #284 <Method Object java.util.Map$Entry.getKey()>
	//   20   52:checkcast       #57  <Class String>
	//   21   55:invokestatic    #286 <Method void writeString(OutputStream, String)>
			}

	//   22   58:aload_1         
	//   23   59:aload_2         
	//   24   60:invokeinterface #132 <Method Object java.util.Map$Entry.getValue()>
	//   25   65:checkcast       #57  <Class String>
	//   26   68:invokestatic    #286 <Method void writeString(OutputStream, String)>
	//*  27   71:goto            26
			return;
	//   28   74:return          
		} else
		{
			writeInt(outputstream, 0);
	//   29   75:aload_1         
	//   30   76:iconst_0        
	//   31   77:invokestatic    #281 <Method void writeInt(OutputStream, int)>
			return;
	//   32   80:return          
		}
	}

	public void clear()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		File afile[] = mRootDirectory.listFiles();
	//    2    2:aload_0         
	//    3    3:getfield        #51  <Field File mRootDirectory>
	//    4    6:invokevirtual   #292 <Method File[] File.listFiles()>
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
	//   19   27:invokevirtual   #145 <Method boolean File.delete()>
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
	//   27   39:getfield        #47  <Field Map mEntries>
	//   28   42:invokeinterface #294 <Method void Map.clear()>
		mTotalSize = 0L;
	//   29   47:aload_0         
	//   30   48:lconst_0        
	//   31   49:putfield        #49  <Field long mTotalSize>
		VolleyLog.d("Cache cleared.", new Object[0]);
	//   32   52:ldc2            #296 <String "Cache cleared.">
	//   33   55:iconst_0        
	//   34   56:anewarray       Object[]
	//   35   59:invokestatic    #155 <Method void VolleyLog.d(String, Object[])>
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

	public com.android.volley.Cache.Entry get(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Object obj2 = ((Object) ((CacheHeader)mEntries.get(((Object) (s)))));
	//    2    2:aload_0         
	//    3    3:getfield        #47  <Field Map mEntries>
	//    4    6:aload_1         
	//    5    7:invokeinterface #180 <Method Object Map.get(Object)>
	//    6   12:checkcast       #10  <Class DiskBasedCache$CacheHeader>
	//    7   15:astore          7
		if(obj2 != null)
			break MISSING_BLOCK_LABEL_26;
	//    8   17:aload           7
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
	//   16   28:invokevirtual   #140 <Method File getFileForKey(String)>
	//   17   31:astore          6
		Object obj;
		CountingInputStream countinginputstream;
		Object obj1;
		obj1 = null;
	//   18   33:aconst_null     
	//   19   34:astore          4
		obj = null;
	//   20   36:aconst_null     
	//   21   37:astore_2        
		countinginputstream = null;
	//   22   38:aconst_null     
	//   23   39:astore_3        
		CountingInputStream countinginputstream1 = new CountingInputStream(((InputStream) (new BufferedInputStream(((InputStream) (new FileInputStream(file)))))));
	//   24   40:new             #13  <Class DiskBasedCache$CountingInputStream>
	//   25   43:dup             
	//   26   44:new             #301 <Class BufferedInputStream>
	//   27   47:dup             
	//   28   48:new             #303 <Class FileInputStream>
	//   29   51:dup             
	//   30   52:aload           6
	//   31   54:invokespecial   #305 <Method void FileInputStream(File)>
	//   32   57:invokespecial   #308 <Method void BufferedInputStream(InputStream)>
	//   33   60:aconst_null     
	//   34   61:invokespecial   #311 <Method void DiskBasedCache$CountingInputStream(InputStream, DiskBasedCache$1)>
	//   35   64:astore          5
		countinginputstream = countinginputstream1;
	//   36   66:aload           5
	//   37   68:astore_3        
		obj1 = ((Object) (countinginputstream1));
	//   38   69:aload           5
	//   39   71:astore          4
		obj = ((Object) (countinginputstream1));
	//   40   73:aload           5
	//   41   75:astore_2        
		CacheHeader.readHeader(((InputStream) (countinginputstream1)));
	//   42   76:aload           5
	//   43   78:invokestatic    #315 <Method DiskBasedCache$CacheHeader DiskBasedCache$CacheHeader.readHeader(InputStream)>
	//   44   81:pop             
		countinginputstream = countinginputstream1;
	//   45   82:aload           5
	//   46   84:astore_3        
		obj1 = ((Object) (countinginputstream1));
	//   47   85:aload           5
	//   48   87:astore          4
		obj = ((Object) (countinginputstream1));
	//   49   89:aload           5
	//   50   91:astore_2        
		obj2 = ((Object) (((CacheHeader) (obj2)).toCacheEntry(streamToBytes(((InputStream) (countinginputstream1)), (int)(file.length() - (long)countinginputstream1.bytesRead)))));
	//   51   92:aload           7
	//   52   94:aload           5
	//   53   96:aload           6
	//   54   98:invokevirtual   #317 <Method long File.length()>
	//   55  101:aload           5
	//   56  103:invokestatic    #321 <Method int DiskBasedCache$CountingInputStream.access$100(DiskBasedCache$CountingInputStream)>
	//   57  106:i2l             
	//   58  107:lsub            
	//   59  108:l2i             
	//   60  109:invokestatic    #211 <Method byte[] streamToBytes(InputStream, int)>
	//   61  112:invokevirtual   #325 <Method com.android.volley.Cache$Entry DiskBasedCache$CacheHeader.toCacheEntry(byte[])>
	//   62  115:astore          7
		if(countinginputstream1 == null)
			break MISSING_BLOCK_LABEL_135;
	//   63  117:aload           5
	//   64  119:ifnull          135
		try
		{
			countinginputstream1.close();
	//   65  122:aload           5
	//   66  124:invokevirtual   #328 <Method void DiskBasedCache$CountingInputStream.close()>
		}
	//*  67  127:goto            135
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  68  130:astore_1        
	//*  69  131:aload_0         
		{
			return null;
	//   70  132:monitorexit     
	//   71  133:aconst_null     
	//   72  134:areturn         
		}
		this;
	//   73  135:aload_0         
		JVM INSTR monitorexit ;
	//   74  136:monitorexit     
		return ((com.android.volley.Cache.Entry) (obj2));
	//   75  137:aload           7
	//   76  139:areturn         
		obj1;
	//   77  140:astore          4
		obj = ((Object) (countinginputstream));
	//   78  142:aload_3         
	//   79  143:astore_2        
		VolleyLog.d("%s: %s", new Object[] {
			file.getAbsolutePath(), ((IOException) (obj1)).toString()
		});
	//   80  144:ldc2            #330 <String "%s: %s">
	//   81  147:iconst_2        
	//   82  148:anewarray       Object[]
	//   83  151:dup             
	//   84  152:iconst_0        
	//   85  153:aload           6
	//   86  155:invokevirtual   #333 <Method String File.getAbsolutePath()>
	//   87  158:aastore         
	//   88  159:dup             
	//   89  160:iconst_1        
	//   90  161:aload           4
	//   91  163:invokevirtual   #334 <Method String IOException.toString()>
	//   92  166:aastore         
	//   93  167:invokestatic    #155 <Method void VolleyLog.d(String, Object[])>
		obj = ((Object) (countinginputstream));
	//   94  170:aload_3         
	//   95  171:astore_2        
		remove(s);
	//   96  172:aload_0         
	//   97  173:aload_1         
	//   98  174:invokevirtual   #336 <Method void remove(String)>
		if(countinginputstream == null)
			break MISSING_BLOCK_LABEL_193;
	//   99  177:aload_3         
	//  100  178:ifnull          193
		try
		{
			countinginputstream.close();
	//  101  181:aload_3         
	//  102  182:invokevirtual   #328 <Method void DiskBasedCache$CountingInputStream.close()>
		}
	//* 103  185:goto            193
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 104  188:astore_1        
	//* 105  189:aload_0         
		{
			return null;
	//  106  190:monitorexit     
	//  107  191:aconst_null     
	//  108  192:areturn         
		}
		this;
	//  109  193:aload_0         
		JVM INSTR monitorexit ;
	//  110  194:monitorexit     
		return null;
	//  111  195:aconst_null     
	//  112  196:areturn         
		NegativeArraySizeException negativearraysizeexception;
		negativearraysizeexception;
	//  113  197:astore_3        
		obj = obj1;
	//  114  198:aload           4
	//  115  200:astore_2        
		VolleyLog.d("%s: %s", new Object[] {
			file.getAbsolutePath(), negativearraysizeexception.toString()
		});
	//  116  201:ldc2            #330 <String "%s: %s">
	//  117  204:iconst_2        
	//  118  205:anewarray       Object[]
	//  119  208:dup             
	//  120  209:iconst_0        
	//  121  210:aload           6
	//  122  212:invokevirtual   #333 <Method String File.getAbsolutePath()>
	//  123  215:aastore         
	//  124  216:dup             
	//  125  217:iconst_1        
	//  126  218:aload_3         
	//  127  219:invokevirtual   #337 <Method String NegativeArraySizeException.toString()>
	//  128  222:aastore         
	//  129  223:invokestatic    #155 <Method void VolleyLog.d(String, Object[])>
		obj = obj1;
	//  130  226:aload           4
	//  131  228:astore_2        
		remove(s);
	//  132  229:aload_0         
	//  133  230:aload_1         
	//  134  231:invokevirtual   #336 <Method void remove(String)>
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_252;
	//  135  234:aload           4
	//  136  236:ifnull          252
		try
		{
			((CountingInputStream) (obj1)).close();
	//  137  239:aload           4
	//  138  241:invokevirtual   #328 <Method void DiskBasedCache$CountingInputStream.close()>
		}
	//* 139  244:goto            252
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 140  247:astore_1        
	//* 141  248:aload_0         
		{
			return null;
	//  142  249:monitorexit     
	//  143  250:aconst_null     
	//  144  251:areturn         
		}
		this;
	//  145  252:aload_0         
		JVM INSTR monitorexit ;
	//  146  253:monitorexit     
		return null;
	//  147  254:aconst_null     
	//  148  255:areturn         
		s;
	//  149  256:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_273;
	//  150  257:aload_2         
	//  151  258:ifnull          273
		try
		{
			((CountingInputStream) (obj)).close();
	//  152  261:aload_2         
	//  153  262:invokevirtual   #328 <Method void DiskBasedCache$CountingInputStream.close()>
		}
	//* 154  265:goto            273
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 155  268:astore_1        
	//* 156  269:aload_0         
		{
			return null;
	//  157  270:monitorexit     
	//  158  271:aconst_null     
	//  159  272:areturn         
		}
		throw s;
	//  160  273:aload_1         
	//  161  274:athrow          
		s;
	//  162  275:astore_1        
		this;
	//  163  276:aload_0         
		JVM INSTR monitorexit ;
	//  164  277:monitorexit     
		throw s;
	//  165  278:aload_1         
	//  166  279:athrow          
	}

	public File getFileForKey(String s)
	{
		return new File(mRootDirectory, getFilenameForKey(s));
	//    0    0:new             #142 <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field File mRootDirectory>
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #152 <Method String getFilenameForKey(String)>
	//    7   13:invokespecial   #340 <Method void File(File, String)>
	//    8   16:areturn         
	}

	public void initialize()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(mRootDirectory.exists())
			break MISSING_BLOCK_LABEL_45;
	//    2    2:aload_0         
	//    3    3:getfield        #51  <Field File mRootDirectory>
	//    4    6:invokevirtual   #344 <Method boolean File.exists()>
	//    5    9:ifne            45
		if(!mRootDirectory.mkdirs())
	//*   6   12:aload_0         
	//*   7   13:getfield        #51  <Field File mRootDirectory>
	//*   8   16:invokevirtual   #347 <Method boolean File.mkdirs()>
	//*   9   19:ifne            42
			VolleyLog.e("Unable to create cache dir %s", new Object[] {
				mRootDirectory.getAbsolutePath()
			});
	//   10   22:ldc2            #349 <String "Unable to create cache dir %s">
	//   11   25:iconst_1        
	//   12   26:anewarray       Object[]
	//   13   29:dup             
	//   14   30:iconst_0        
	//   15   31:aload_0         
	//   16   32:getfield        #51  <Field File mRootDirectory>
	//   17   35:invokevirtual   #333 <Method String File.getAbsolutePath()>
	//   18   38:aastore         
	//   19   39:invokestatic    #352 <Method void VolleyLog.e(String, Object[])>
		this;
	//   20   42:aload_0         
		JVM INSTR monitorexit ;
	//   21   43:monitorexit     
		return;
	//   22   44:return          
		File afile[] = mRootDirectory.listFiles();
	//   23   45:aload_0         
	//   24   46:getfield        #51  <Field File mRootDirectory>
	//   25   49:invokevirtual   #292 <Method File[] File.listFiles()>
	//   26   52:astore          6
		if(afile != null)
			break MISSING_BLOCK_LABEL_62;
	//   27   54:aload           6
	//   28   56:ifnonnull       62
		this;
	//   29   59:aload_0         
		JVM INSTR monitorexit ;
	//   30   60:monitorexit     
		return;
	//   31   61:return          
		int j = afile.length;
	//   32   62:aload           6
	//   33   64:arraylength     
	//   34   65:istore_2        
		int i = 0;
	//   35   66:iconst_0        
	//   36   67:istore_1        
_L3:
		if(i >= j) goto _L2; else goto _L1
	//   37   68:iload_1         
	//   38   69:iload_2         
	//   39   70:icmpge          224
_L1:
		Object obj;
		Object obj1;
		File file;
		file = afile[i];
	//   40   73:aload           6
	//   41   75:iload_1         
	//   42   76:aaload          
	//   43   77:astore          7
		obj1 = null;
	//   44   79:aconst_null     
	//   45   80:astore          4
		obj = null;
	//   46   82:aconst_null     
	//   47   83:astore_3        
		BufferedInputStream bufferedinputstream = new BufferedInputStream(((InputStream) (new FileInputStream(file))));
	//   48   84:new             #301 <Class BufferedInputStream>
	//   49   87:dup             
	//   50   88:new             #303 <Class FileInputStream>
	//   51   91:dup             
	//   52   92:aload           7
	//   53   94:invokespecial   #305 <Method void FileInputStream(File)>
	//   54   97:invokespecial   #308 <Method void BufferedInputStream(InputStream)>
	//   55  100:astore          5
		obj = ((Object) (bufferedinputstream));
	//   56  102:aload           5
	//   57  104:astore_3        
		obj1 = ((Object) (bufferedinputstream));
	//   58  105:aload           5
	//   59  107:astore          4
		CacheHeader cacheheader = CacheHeader.readHeader(((InputStream) (bufferedinputstream)));
	//   60  109:aload           5
	//   61  111:invokestatic    #315 <Method DiskBasedCache$CacheHeader DiskBasedCache$CacheHeader.readHeader(InputStream)>
	//   62  114:astore          8
		obj = ((Object) (bufferedinputstream));
	//   63  116:aload           5
	//   64  118:astore_3        
		obj1 = ((Object) (bufferedinputstream));
	//   65  119:aload           5
	//   66  121:astore          4
		cacheheader.size = file.length();
	//   67  123:aload           8
	//   68  125:aload           7
	//   69  127:invokevirtual   #317 <Method long File.length()>
	//   70  130:putfield        #148 <Field long DiskBasedCache$CacheHeader.size>
		obj = ((Object) (bufferedinputstream));
	//   71  133:aload           5
	//   72  135:astore_3        
		obj1 = ((Object) (bufferedinputstream));
	//   73  136:aload           5
	//   74  138:astore          4
		putEntry(cacheheader.key, cacheheader);
	//   75  140:aload_0         
	//   76  141:aload           8
	//   77  143:getfield        #136 <Field String DiskBasedCache$CacheHeader.key>
	//   78  146:aload           8
	//   79  148:invokespecial   #354 <Method void putEntry(String, DiskBasedCache$CacheHeader)>
		if(bufferedinputstream == null)
			continue; /* Loop/switch isn't completed */
	//   80  151:aload           5
	//   81  153:ifnull          161
		try
		{
			bufferedinputstream.close();
	//   82  156:aload           5
	//   83  158:invokevirtual   #355 <Method void BufferedInputStream.close()>
		}
	//*  84  161:goto            217
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	//   85  164:astore_3        
		continue; /* Loop/switch isn't completed */
	//   86  165:goto            217
		obj1;
	//   87  168:astore          4
		if(file == null)
			break MISSING_BLOCK_LABEL_184;
	//   88  170:aload           7
	//   89  172:ifnull          184
		obj1 = obj;
	//   90  175:aload_3         
	//   91  176:astore          4
		file.delete();
	//   92  178:aload           7
	//   93  180:invokevirtual   #145 <Method boolean File.delete()>
	//   94  183:pop             
		if(obj == null)
			continue; /* Loop/switch isn't completed */
	//   95  184:aload_3         
	//   96  185:ifnull          192
		try
		{
			((BufferedInputStream) (obj)).close();
	//   97  188:aload_3         
	//   98  189:invokevirtual   #355 <Method void BufferedInputStream.close()>
		}
	//*  99  192:goto            217
		catch(IOException ioexception) { }
	//  100  195:astore_3        
		continue; /* Loop/switch isn't completed */
	//  101  196:goto            217
		Exception exception;
		exception;
	//  102  199:astore_3        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_215;
	//  103  200:aload           4
	//  104  202:ifnull          210
		try
		{
			((BufferedInputStream) (obj1)).close();
	//  105  205:aload           4
	//  106  207:invokevirtual   #355 <Method void BufferedInputStream.close()>
		}
	//* 107  210:goto            215
		catch(IOException ioexception1) { }
	//  108  213:astore          4
		throw exception;
	//  109  215:aload_3         
	//  110  216:athrow          
	//  111  217:iload_1         
	//  112  218:iconst_1        
	//  113  219:iadd            
	//  114  220:istore_1        
		  goto _L3
	//* 115  221:goto            68
	//* 116  224:aload_0         
_L2:
		return;
	//  117  225:monitorexit     
	//  118  226:return          
		exception;
	//  119  227:astore_3        
	//* 120  228:aload_0         
		throw exception;
	//  121  229:monitorexit     
	//  122  230:aload_3         
	//  123  231:athrow          
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
	//    4    4:invokevirtual   #359 <Method com.android.volley.Cache$Entry get(String)>
	//    5    7:astore_3        
		if(entry == null)
			break MISSING_BLOCK_LABEL_32;
	//    6    8:aload_3         
	//    7    9:ifnull          32
		entry.softTtl = 0L;
	//    8   12:aload_3         
	//    9   13:lconst_0        
	//   10   14:putfield        #364 <Field long com.android.volley.Cache$Entry.softTtl>
		if(!flag)
			break MISSING_BLOCK_LABEL_26;
	//   11   17:iload_2         
	//   12   18:ifeq            26
		entry.ttl = 0L;
	//   13   21:aload_3         
	//   14   22:lconst_0        
	//   15   23:putfield        #367 <Field long com.android.volley.Cache$Entry.ttl>
		put(s, entry);
	//   16   26:aload_0         
	//   17   27:aload_1         
	//   18   28:aload_3         
	//   19   29:invokevirtual   #370 <Method void put(String, com.android.volley.Cache$Entry)>
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
	//    4    4:getfield        #374 <Field byte[] com.android.volley.Cache$Entry.data>
	//    5    7:arraylength     
	//    6    8:invokespecial   #376 <Method void pruneIfNeeded(int)>
		file = getFileForKey(s);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #140 <Method File getFileForKey(String)>
	//   10   16:astore_3        
		BufferedOutputStream bufferedoutputstream = new BufferedOutputStream(((OutputStream) (new FileOutputStream(file))));
	//   11   17:new             #378 <Class BufferedOutputStream>
	//   12   20:dup             
	//   13   21:new             #380 <Class FileOutputStream>
	//   14   24:dup             
	//   15   25:aload_3         
	//   16   26:invokespecial   #381 <Method void FileOutputStream(File)>
	//   17   29:invokespecial   #384 <Method void BufferedOutputStream(OutputStream)>
	//   18   32:astore          4
		CacheHeader cacheheader = new CacheHeader(s, entry);
	//   19   34:new             #10  <Class DiskBasedCache$CacheHeader>
	//   20   37:dup             
	//   21   38:aload_1         
	//   22   39:aload_2         
	//   23   40:invokespecial   #386 <Method void DiskBasedCache$CacheHeader(String, com.android.volley.Cache$Entry)>
	//   24   43:astore          5
		if(!cacheheader.writeHeader(((OutputStream) (bufferedoutputstream))))
	//*  25   45:aload           5
	//*  26   47:aload           4
	//*  27   49:invokevirtual   #390 <Method boolean DiskBasedCache$CacheHeader.writeHeader(OutputStream)>
	//*  28   52:ifne            85
		{
			bufferedoutputstream.close();
	//   29   55:aload           4
	//   30   57:invokevirtual   #391 <Method void BufferedOutputStream.close()>
			VolleyLog.d("Failed to write header for %s", new Object[] {
				file.getAbsolutePath()
			});
	//   31   60:ldc2            #393 <String "Failed to write header for %s">
	//   32   63:iconst_1        
	//   33   64:anewarray       Object[]
	//   34   67:dup             
	//   35   68:iconst_0        
	//   36   69:aload_3         
	//   37   70:invokevirtual   #333 <Method String File.getAbsolutePath()>
	//   38   73:aastore         
	//   39   74:invokestatic    #155 <Method void VolleyLog.d(String, Object[])>
			throw new IOException();
	//   40   77:new             #188 <Class IOException>
	//   41   80:dup             
	//   42   81:invokespecial   #394 <Method void IOException()>
	//   43   84:athrow          
		}
		bufferedoutputstream.write(entry.data);
	//   44   85:aload           4
	//   45   87:aload_2         
	//   46   88:getfield        #374 <Field byte[] com.android.volley.Cache$Entry.data>
	//   47   91:invokevirtual   #397 <Method void BufferedOutputStream.write(byte[])>
		bufferedoutputstream.close();
	//   48   94:aload           4
	//   49   96:invokevirtual   #391 <Method void BufferedOutputStream.close()>
		putEntry(s, cacheheader);
	//   50   99:aload_0         
	//   51  100:aload_1         
	//   52  101:aload           5
	//   53  103:invokespecial   #354 <Method void putEntry(String, DiskBasedCache$CacheHeader)>
		this;
	//   54  106:aload_0         
		JVM INSTR monitorexit ;
	//   55  107:monitorexit     
		return;
	//   56  108:return          
		s;
	//   57  109:astore_1        
		if(!file.delete())
	//*  58  110:aload_3         
	//*  59  111:invokevirtual   #145 <Method boolean File.delete()>
	//*  60  114:ifne            134
			VolleyLog.d("Could not clean up file %s", new Object[] {
				file.getAbsolutePath()
			});
	//   61  117:ldc2            #399 <String "Could not clean up file %s">
	//   62  120:iconst_1        
	//   63  121:anewarray       Object[]
	//   64  124:dup             
	//   65  125:iconst_0        
	//   66  126:aload_3         
	//   67  127:invokevirtual   #333 <Method String File.getAbsolutePath()>
	//   68  130:aastore         
	//   69  131:invokestatic    #155 <Method void VolleyLog.d(String, Object[])>
		this;
	//   70  134:aload_0         
		JVM INSTR monitorexit ;
	//   71  135:monitorexit     
		return;
	//   72  136:return          
		s;
	//   73  137:astore_1        
	//*  74  138:aload_0         
		throw s;
	//   75  139:monitorexit     
	//   76  140:aload_1         
	//   77  141:athrow          
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
	//    4    4:invokevirtual   #140 <Method File getFileForKey(String)>
	//    5    7:invokevirtual   #145 <Method boolean File.delete()>
	//    6   10:istore_2        
		removeEntry(s);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokespecial   #401 <Method void removeEntry(String)>
		if(flag)
			break MISSING_BLOCK_LABEL_41;
	//   10   16:iload_2         
	//   11   17:ifne            41
		VolleyLog.d("Could not delete cache entry for key=%s, filename=%s", new Object[] {
			s, getFilenameForKey(s)
		});
	//   12   20:ldc1            #150 <String "Could not delete cache entry for key=%s, filename=%s">
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
	//   23   34:invokespecial   #152 <Method String getFilenameForKey(String)>
	//   24   37:aastore         
	//   25   38:invokestatic    #155 <Method void VolleyLog.d(String, Object[])>
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

	private static final int CACHE_MAGIC = 0x20150306;
	private static final int DEFAULT_DISK_USAGE_BYTES = 0x500000;
	private static final float HYSTERESIS_FACTOR = 0.9F;
	private final Map mEntries;
	private final int mMaxCacheSizeInBytes;
	private final File mRootDirectory;
	private long mTotalSize;
}
