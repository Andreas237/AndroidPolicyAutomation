// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import com.android.volley.VolleyLog;
import java.io.*;
import java.util.Map;

// Referenced classes of package com.android.volley.toolbox:
//			DiskBasedCache

static class DiskBasedCache$CacheHeader
{

	public static DiskBasedCache$CacheHeader readHeader(InputStream inputstream)
		throws IOException
	{
		DiskBasedCache$CacheHeader diskbasedcache$cacheheader = new DiskBasedCache$CacheHeader();
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
		diskbasedcache$cacheheader.key = DiskBasedCache.readString(inputstream);
	//   12   25:aload_1         
	//   13   26:aload_0         
	//   14   27:invokestatic    #68  <Method String DiskBasedCache.readString(InputStream)>
	//   15   30:putfield        #27  <Field String key>
		diskbasedcache$cacheheader.etag = DiskBasedCache.readString(inputstream);
	//   16   33:aload_1         
	//   17   34:aload_0         
	//   18   35:invokestatic    #68  <Method String DiskBasedCache.readString(InputStream)>
	//   19   38:putfield        #38  <Field String etag>
		if(diskbasedcache$cacheheader.etag.equals(""))
	//*  20   41:aload_1         
	//*  21   42:getfield        #38  <Field String etag>
	//*  22   45:ldc1            #70  <String "">
	//*  23   47:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  24   50:ifeq            58
			diskbasedcache$cacheheader.etag = null;
	//   25   53:aload_1         
	//   26   54:aconst_null     
	//   27   55:putfield        #38  <Field String etag>
		diskbasedcache$cacheheader.serverDate = DiskBasedCache.readLong(inputstream);
	//   28   58:aload_1         
	//   29   59:aload_0         
	//   30   60:invokestatic    #80  <Method long DiskBasedCache.readLong(InputStream)>
	//   31   63:putfield        #41  <Field long serverDate>
		diskbasedcache$cacheheader.lastModified = DiskBasedCache.readLong(inputstream);
	//   32   66:aload_1         
	//   33   67:aload_0         
	//   34   68:invokestatic    #80  <Method long DiskBasedCache.readLong(InputStream)>
	//   35   71:putfield        #44  <Field long lastModified>
		diskbasedcache$cacheheader.ttl = DiskBasedCache.readLong(inputstream);
	//   36   74:aload_1         
	//   37   75:aload_0         
	//   38   76:invokestatic    #80  <Method long DiskBasedCache.readLong(InputStream)>
	//   39   79:putfield        #47  <Field long ttl>
		diskbasedcache$cacheheader.softTtl = DiskBasedCache.readLong(inputstream);
	//   40   82:aload_1         
	//   41   83:aload_0         
	//   42   84:invokestatic    #80  <Method long DiskBasedCache.readLong(InputStream)>
	//   43   87:putfield        #50  <Field long softTtl>
		diskbasedcache$cacheheader.responseHeaders = DiskBasedCache.readStringStringMap(inputstream);
	//   44   90:aload_1         
	//   45   91:aload_0         
	//   46   92:invokestatic    #84  <Method Map DiskBasedCache.readStringStringMap(InputStream)>
	//   47   95:putfield        #53  <Field Map responseHeaders>
		return diskbasedcache$cacheheader;
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

	private DiskBasedCache$CacheHeader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}

	public DiskBasedCache$CacheHeader(String s, com.android.volley.Cache.Entry entry)
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
