// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream.cache;

import com.google.android.exoplayer.util.Assertions;
import java.io.*;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer.upstream.cache:
//			SimpleCacheSpan, CacheSpan

final class CachedContent
{

	public CachedContent(int i, String s, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		id = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #20  <Field int id>
		key = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field String key>
		length = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #24  <Field long length>
		cachedSpans = new TreeSet();
	//   11   19:aload_0         
	//   12   20:new             #26  <Class TreeSet>
	//   13   23:dup             
	//   14   24:invokespecial   #27  <Method void TreeSet()>
	//   15   27:putfield        #29  <Field TreeSet cachedSpans>
	//   16   30:return          
	}

	public CachedContent(DataInputStream datainputstream)
		throws IOException
	{
		this(datainputstream.readInt(), datainputstream.readUTF(), datainputstream.readLong());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #39  <Method int DataInputStream.readInt()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #43  <Method String DataInputStream.readUTF()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #47  <Method long DataInputStream.readLong()>
	//    7   13:invokespecial   #49  <Method void CachedContent(int, String, long)>
	//    8   16:return          
	}

	private SimpleCacheSpan getSpanInternal(long l)
	{
		SimpleCacheSpan simplecachespan1 = SimpleCacheSpan.createLookup(key, l);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String key>
	//    2    4:lload_1         
	//    3    5:invokestatic    #58  <Method SimpleCacheSpan SimpleCacheSpan.createLookup(String, long)>
	//    4    8:astore          4
		SimpleCacheSpan simplecachespan2 = (SimpleCacheSpan)cachedSpans.floor(((Object) (simplecachespan1)));
	//    5   10:aload_0         
	//    6   11:getfield        #29  <Field TreeSet cachedSpans>
	//    7   14:aload           4
	//    8   16:invokevirtual   #62  <Method Object TreeSet.floor(Object)>
	//    9   19:checkcast       #54  <Class SimpleCacheSpan>
	//   10   22:astore          5
		SimpleCacheSpan simplecachespan = simplecachespan1;
	//   11   24:aload           4
	//   12   26:astore_3        
		if(simplecachespan2 != null)
	//*  13   27:aload           5
	//*  14   29:ifnull          54
		{
			if(simplecachespan2.position + simplecachespan2.length <= l)
	//*  15   32:aload           5
	//*  16   34:getfield        #65  <Field long SimpleCacheSpan.position>
	//*  17   37:aload           5
	//*  18   39:getfield        #66  <Field long SimpleCacheSpan.length>
	//*  19   42:ladd            
	//*  20   43:lload_1         
	//*  21   44:lcmp            
	//*  22   45:ifgt            51
				return simplecachespan1;
	//   23   48:aload           4
	//   24   50:areturn         
			simplecachespan = simplecachespan2;
	//   25   51:aload           5
	//   26   53:astore_3        
		}
		return simplecachespan;
	//   27   54:aload_3         
	//   28   55:areturn         
	}

	public void addSpan(SimpleCacheSpan simplecachespan)
	{
		cachedSpans.add(((Object) (simplecachespan)));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field TreeSet cachedSpans>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #72  <Method boolean TreeSet.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public long getLength()
	{
		return length;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field long length>
	//    2    4:lreturn         
	}

	public SimpleCacheSpan getSpan(long l)
	{
		SimpleCacheSpan simplecachespan = getSpanInternal(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #76  <Method SimpleCacheSpan getSpanInternal(long)>
	//    3    5:astore_3        
		if(!simplecachespan.isCached)
	//*   4    6:aload_3         
	//*   5    7:getfield        #80  <Field boolean SimpleCacheSpan.isCached>
	//*   6   10:ifne            53
		{
			simplecachespan = (SimpleCacheSpan)cachedSpans.ceiling(((Object) (simplecachespan)));
	//    7   13:aload_0         
	//    8   14:getfield        #29  <Field TreeSet cachedSpans>
	//    9   17:aload_3         
	//   10   18:invokevirtual   #83  <Method Object TreeSet.ceiling(Object)>
	//   11   21:checkcast       #54  <Class SimpleCacheSpan>
	//   12   24:astore_3        
			if(simplecachespan == null)
	//*  13   25:aload_3         
	//*  14   26:ifnonnull       38
				return SimpleCacheSpan.createOpenHole(key, l);
	//   15   29:aload_0         
	//   16   30:getfield        #22  <Field String key>
	//   17   33:lload_1         
	//   18   34:invokestatic    #86  <Method SimpleCacheSpan SimpleCacheSpan.createOpenHole(String, long)>
	//   19   37:areturn         
			else
				return SimpleCacheSpan.createClosedHole(key, l, simplecachespan.position - l);
	//   20   38:aload_0         
	//   21   39:getfield        #22  <Field String key>
	//   22   42:lload_1         
	//   23   43:aload_3         
	//   24   44:getfield        #65  <Field long SimpleCacheSpan.position>
	//   25   47:lload_1         
	//   26   48:lsub            
	//   27   49:invokestatic    #90  <Method SimpleCacheSpan SimpleCacheSpan.createClosedHole(String, long, long)>
	//   28   52:areturn         
		} else
		{
			return simplecachespan;
	//   29   53:aload_3         
	//   30   54:areturn         
		}
	}

	public TreeSet getSpans()
	{
		return cachedSpans;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field TreeSet cachedSpans>
	//    2    4:areturn         
	}

	public int headerHashCode()
	{
		int i = id;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int id>
	//    2    4:istore_1        
		int j = key.hashCode();
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field String key>
	//    5    9:invokevirtual   #100 <Method int String.hashCode()>
	//    6   12:istore_2        
		long l = length;
	//    7   13:aload_0         
	//    8   14:getfield        #24  <Field long length>
	//    9   17:lstore_3        
		return (i * 31 + j) * 31 + (int)(l ^ l >>> 32);
	//   10   18:iload_1         
	//   11   19:bipush          31
	//   12   21:imul            
	//   13   22:iload_2         
	//   14   23:iadd            
	//   15   24:bipush          31
	//   16   26:imul            
	//   17   27:lload_3         
	//   18   28:lload_3         
	//   19   29:bipush          32
	//   20   31:lushr           
	//   21   32:lxor            
	//   22   33:l2i             
	//   23   34:iadd            
	//   24   35:ireturn         
	}

	public boolean isCached(long l, long l1)
	{
		Object obj = ((Object) (getSpanInternal(l)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #76  <Method SimpleCacheSpan getSpanInternal(long)>
	//    3    5:astore          7
		if(!((SimpleCacheSpan) (obj)).isCached)
	//*   4    7:aload           7
	//*   5    9:getfield        #80  <Field boolean SimpleCacheSpan.isCached>
	//*   6   12:ifne            17
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
		long l2 = l + l1;
	//    9   17:lload_1         
	//   10   18:lload_3         
	//   11   19:ladd            
	//   12   20:lstore          5
		l = ((SimpleCacheSpan) (obj)).position + ((SimpleCacheSpan) (obj)).length;
	//   13   22:aload           7
	//   14   24:getfield        #65  <Field long SimpleCacheSpan.position>
	//   15   27:aload           7
	//   16   29:getfield        #66  <Field long SimpleCacheSpan.length>
	//   17   32:ladd            
	//   18   33:lstore_1        
		if(l >= l2)
	//*  19   34:lload_1         
	//*  20   35:lload           5
	//*  21   37:lcmp            
	//*  22   38:iflt            43
			return true;
	//   23   41:iconst_1        
	//   24   42:ireturn         
		for(obj = ((Object) (cachedSpans.tailSet(obj, false).iterator())); ((Iterator) (obj)).hasNext();)
	//*  25   43:aload_0         
	//*  26   44:getfield        #29  <Field TreeSet cachedSpans>
	//*  27   47:aload           7
	//*  28   49:iconst_0        
	//*  29   50:invokevirtual   #105 <Method NavigableSet TreeSet.tailSet(Object, boolean)>
	//*  30   53:invokeinterface #111 <Method Iterator NavigableSet.iterator()>
	//*  31   58:astore          7
	//*  32   60:aload           7
	//*  33   62:invokeinterface #117 <Method boolean Iterator.hasNext()>
	//*  34   67:ifeq            121
		{
			SimpleCacheSpan simplecachespan = (SimpleCacheSpan)((Iterator) (obj)).next();
	//   35   70:aload           7
	//   36   72:invokeinterface #121 <Method Object Iterator.next()>
	//   37   77:checkcast       #54  <Class SimpleCacheSpan>
	//   38   80:astore          8
			if(simplecachespan.position > l)
	//*  39   82:aload           8
	//*  40   84:getfield        #65  <Field long SimpleCacheSpan.position>
	//*  41   87:lload_1         
	//*  42   88:lcmp            
	//*  43   89:ifle            94
				return false;
	//   44   92:iconst_0        
	//   45   93:ireturn         
			l1 = Math.max(l, simplecachespan.position + simplecachespan.length);
	//   46   94:lload_1         
	//   47   95:aload           8
	//   48   97:getfield        #65  <Field long SimpleCacheSpan.position>
	//   49  100:aload           8
	//   50  102:getfield        #66  <Field long SimpleCacheSpan.length>
	//   51  105:ladd            
	//   52  106:invokestatic    #127 <Method long Math.max(long, long)>
	//   53  109:lstore_3        
			l = l1;
	//   54  110:lload_3         
	//   55  111:lstore_1        
			if(l1 >= l2)
	//*  56  112:lload_3         
	//*  57  113:lload           5
	//*  58  115:lcmp            
	//*  59  116:iflt            60
				return true;
	//   60  119:iconst_1        
	//   61  120:ireturn         
		}

		return false;
	//   62  121:iconst_0        
	//   63  122:ireturn         
	}

	public boolean isEmpty()
	{
		return cachedSpans.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field TreeSet cachedSpans>
	//    2    4:invokevirtual   #130 <Method boolean TreeSet.isEmpty()>
	//    3    7:ireturn         
	}

	public boolean removeSpan(CacheSpan cachespan)
	{
		if(cachedSpans.remove(((Object) (cachespan))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field TreeSet cachedSpans>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #135 <Method boolean TreeSet.remove(Object)>
	//*   4    8:ifeq            21
		{
			cachespan.file.delete();
	//    5   11:aload_1         
	//    6   12:getfield        #141 <Field File CacheSpan.file>
	//    7   15:invokevirtual   #146 <Method boolean File.delete()>
	//    8   18:pop             
			return true;
	//    9   19:iconst_1        
	//   10   20:ireturn         
		} else
		{
			return false;
	//   11   21:iconst_0        
	//   12   22:ireturn         
		}
	}

	public void setLength(long l)
	{
		length = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #24  <Field long length>
	//    3    5:return          
	}

	public SimpleCacheSpan touch(SimpleCacheSpan simplecachespan)
		throws Cache.CacheException
	{
		Assertions.checkState(cachedSpans.remove(((Object) (simplecachespan))));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field TreeSet cachedSpans>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #135 <Method boolean TreeSet.remove(Object)>
	//    4    8:invokestatic    #158 <Method void Assertions.checkState(boolean)>
		SimpleCacheSpan simplecachespan1 = simplecachespan.copyWithUpdatedLastAccessTime(id);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #20  <Field int id>
	//    8   16:invokevirtual   #162 <Method SimpleCacheSpan SimpleCacheSpan.copyWithUpdatedLastAccessTime(int)>
	//    9   19:astore_2        
		if(simplecachespan.file.renameTo(simplecachespan1.file))
	//*  10   20:aload_1         
	//*  11   21:getfield        #163 <Field File SimpleCacheSpan.file>
	//*  12   24:aload_2         
	//*  13   25:getfield        #163 <Field File SimpleCacheSpan.file>
	//*  14   28:invokevirtual   #167 <Method boolean File.renameTo(File)>
	//*  15   31:ifeq            45
		{
			cachedSpans.add(((Object) (simplecachespan1)));
	//   16   34:aload_0         
	//   17   35:getfield        #29  <Field TreeSet cachedSpans>
	//   18   38:aload_2         
	//   19   39:invokevirtual   #72  <Method boolean TreeSet.add(Object)>
	//   20   42:pop             
			return simplecachespan1;
	//   21   43:aload_2         
	//   22   44:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   23   45:new             #169 <Class StringBuilder>
	//   24   48:dup             
	//   25   49:invokespecial   #170 <Method void StringBuilder()>
	//   26   52:astore_3        
			stringbuilder.append("Renaming of ");
	//   27   53:aload_3         
	//   28   54:ldc1            #172 <String "Renaming of ">
	//   29   56:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   30   59:pop             
			stringbuilder.append(((Object) (simplecachespan.file)));
	//   31   60:aload_3         
	//   32   61:aload_1         
	//   33   62:getfield        #163 <Field File SimpleCacheSpan.file>
	//   34   65:invokevirtual   #179 <Method StringBuilder StringBuilder.append(Object)>
	//   35   68:pop             
			stringbuilder.append(" to ");
	//   36   69:aload_3         
	//   37   70:ldc1            #181 <String " to ">
	//   38   72:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   39   75:pop             
			stringbuilder.append(((Object) (simplecachespan1.file)));
	//   40   76:aload_3         
	//   41   77:aload_2         
	//   42   78:getfield        #163 <Field File SimpleCacheSpan.file>
	//   43   81:invokevirtual   #179 <Method StringBuilder StringBuilder.append(Object)>
	//   44   84:pop             
			stringbuilder.append(" failed.");
	//   45   85:aload_3         
	//   46   86:ldc1            #183 <String " failed.">
	//   47   88:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   48   91:pop             
			throw new Cache.CacheException(stringbuilder.toString());
	//   49   92:new             #152 <Class Cache$CacheException>
	//   50   95:dup             
	//   51   96:aload_3         
	//   52   97:invokevirtual   #186 <Method String StringBuilder.toString()>
	//   53  100:invokespecial   #189 <Method void Cache$CacheException(String)>
	//   54  103:athrow          
		}
	}

	public void writeToStream(DataOutputStream dataoutputstream)
		throws IOException
	{
		dataoutputstream.writeInt(id);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field int id>
	//    3    5:invokevirtual   #197 <Method void DataOutputStream.writeInt(int)>
		dataoutputstream.writeUTF(key);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #22  <Field String key>
	//    7   13:invokevirtual   #200 <Method void DataOutputStream.writeUTF(String)>
		dataoutputstream.writeLong(length);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #24  <Field long length>
	//   11   21:invokevirtual   #203 <Method void DataOutputStream.writeLong(long)>
	//   12   24:return          
	}

	private final TreeSet cachedSpans;
	public final int id;
	public final String key;
	private long length;
}
