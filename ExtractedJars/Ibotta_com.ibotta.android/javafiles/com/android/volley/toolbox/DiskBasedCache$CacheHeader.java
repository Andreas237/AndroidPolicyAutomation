// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import com.android.volley.VolleyLog;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.android.volley.toolbox:
//			DiskBasedCache, HttpHeaderParser

static class DiskBasedCache$CacheHeader
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
	//    7   13:getfield        #74  <Field java.util.Map com.android.volley.Cache$Entry.responseHeaders>
	//    8   16:invokestatic    #80  <Method List HttpHeaderParser.toAllHeaderList(java.util.Map)>
	//    9   19:areturn         
	}

	static DiskBasedCache$CacheHeader readHeader(tStream tstream)
		throws IOException
	{
		if(DiskBasedCache.readInt(((java.io.InputStream) (tstream))) == 0x20150306)
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #89  <Method int DiskBasedCache.readInt(java.io.InputStream)>
	//*   2    4:ldc1            #90  <Int 0x20150306>
	//*   3    6:icmpne          45
			return new DiskBasedCache$CacheHeader(DiskBasedCache.readString(tstream), DiskBasedCache.readString(tstream), DiskBasedCache.readLong(((java.io.InputStream) (tstream))), DiskBasedCache.readLong(((java.io.InputStream) (tstream))), DiskBasedCache.readLong(((java.io.InputStream) (tstream))), DiskBasedCache.readLong(((java.io.InputStream) (tstream))), DiskBasedCache.readHeaderList(tstream));
	//    4    9:new             #2   <Class DiskBasedCache$CacheHeader>
	//    5   12:dup             
	//    6   13:aload_0         
	//    7   14:invokestatic    #94  <Method String DiskBasedCache.readString(DiskBasedCache$CountingInputStream)>
	//    8   17:aload_0         
	//    9   18:invokestatic    #94  <Method String DiskBasedCache.readString(DiskBasedCache$CountingInputStream)>
	//   10   21:aload_0         
	//   11   22:invokestatic    #98  <Method long DiskBasedCache.readLong(java.io.InputStream)>
	//   12   25:aload_0         
	//   13   26:invokestatic    #98  <Method long DiskBasedCache.readLong(java.io.InputStream)>
	//   14   29:aload_0         
	//   15   30:invokestatic    #98  <Method long DiskBasedCache.readLong(java.io.InputStream)>
	//   16   33:aload_0         
	//   17   34:invokestatic    #98  <Method long DiskBasedCache.readLong(java.io.InputStream)>
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
	//   30   58:invokestatic    #111 <Method java.util.Map HttpHeaderParser.toHeaderMap(List)>
	//   31   61:putfield        #74  <Field java.util.Map com.android.volley.Cache$Entry.responseHeaders>
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

	DiskBasedCache$CacheHeader(String s, com.android.volley.Cache.Entry entry)
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

	private DiskBasedCache$CacheHeader(String s, String s1, long l, long l1, long l2, long l3, List list)
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
