// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.util.Assertions;
import java.io.*;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.upstream.cache:
//			DefaultContentMetadata, ContentMetadataMutations, ContentMetadataInternal, SimpleCacheSpan, 
//			CacheSpan, ContentMetadata

final class CachedContent
{

	public CachedContent(int i, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		id = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #26  <Field int id>
		key = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field String key>
		metadata = DefaultContentMetadata.EMPTY;
	//    8   14:aload_0         
	//    9   15:getstatic       #33  <Field DefaultContentMetadata DefaultContentMetadata.EMPTY>
	//   10   18:putfield        #35  <Field DefaultContentMetadata metadata>
	//   11   21:aload_0         
	//   12   22:new             #37  <Class TreeSet>
	//   13   25:dup             
	//   14   26:invokespecial   #38  <Method void TreeSet()>
	//   15   29:putfield        #40  <Field TreeSet cachedSpans>
	//   16   32:return          
	}

	public static CachedContent readFromStream(int i, DataInputStream datainputstream)
		throws IOException
	{
		CachedContent cachedcontent = new CachedContent(datainputstream.readInt(), datainputstream.readUTF());
	//    0    0:new             #2   <Class CachedContent>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #51  <Method int DataInputStream.readInt()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #55  <Method String DataInputStream.readUTF()>
	//    6   12:invokespecial   #57  <Method void CachedContent(int, String)>
	//    7   15:astore          4
		if(i < 2)
	//*   8   17:iload_0         
	//*   9   18:iconst_2        
	//*  10   19:icmpge          50
		{
			long l = datainputstream.readLong();
	//   11   22:aload_1         
	//   12   23:invokevirtual   #61  <Method long DataInputStream.readLong()>
	//   13   26:lstore_2        
			datainputstream = ((DataInputStream) (new ContentMetadataMutations()));
	//   14   27:new             #63  <Class ContentMetadataMutations>
	//   15   30:dup             
	//   16   31:invokespecial   #64  <Method void ContentMetadataMutations()>
	//   17   34:astore_1        
			ContentMetadataInternal.setContentLength(((ContentMetadataMutations) (datainputstream)), l);
	//   18   35:aload_1         
	//   19   36:lload_2         
	//   20   37:invokestatic    #70  <Method void ContentMetadataInternal.setContentLength(ContentMetadataMutations, long)>
			cachedcontent.applyMetadataMutations(((ContentMetadataMutations) (datainputstream)));
	//   21   40:aload           4
	//   22   42:aload_1         
	//   23   43:invokevirtual   #74  <Method boolean applyMetadataMutations(ContentMetadataMutations)>
	//   24   46:pop             
			return cachedcontent;
	//   25   47:aload           4
	//   26   49:areturn         
		} else
		{
			cachedcontent.metadata = DefaultContentMetadata.readFromStream(datainputstream);
	//   27   50:aload           4
	//   28   52:aload_1         
	//   29   53:invokestatic    #77  <Method DefaultContentMetadata DefaultContentMetadata.readFromStream(DataInputStream)>
	//   30   56:putfield        #35  <Field DefaultContentMetadata metadata>
			return cachedcontent;
	//   31   59:aload           4
	//   32   61:areturn         
		}
	}

	public void addSpan(SimpleCacheSpan simplecachespan)
	{
		cachedSpans.add(((Object) (simplecachespan)));
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field TreeSet cachedSpans>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #84  <Method boolean TreeSet.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public boolean applyMetadataMutations(ContentMetadataMutations contentmetadatamutations)
	{
		DefaultContentMetadata defaultcontentmetadata = metadata;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field DefaultContentMetadata metadata>
	//    2    4:astore_2        
		metadata = metadata.copyWithMutationsApplied(contentmetadatamutations);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #35  <Field DefaultContentMetadata metadata>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #88  <Method DefaultContentMetadata DefaultContentMetadata.copyWithMutationsApplied(ContentMetadataMutations)>
	//    8   14:putfield        #35  <Field DefaultContentMetadata metadata>
		return metadata.equals(((Object) (defaultcontentmetadata))) ^ true;
	//    9   17:aload_0         
	//   10   18:getfield        #35  <Field DefaultContentMetadata metadata>
	//   11   21:aload_2         
	//   12   22:invokevirtual   #91  <Method boolean DefaultContentMetadata.equals(Object)>
	//   13   25:iconst_1        
	//   14   26:ixor            
	//   15   27:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          86
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #96  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #96  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((CachedContent)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class CachedContent>
	//   16   28:astore_1        
			return id == ((CachedContent) (obj)).id && key.equals(((Object) (((CachedContent) (obj)).key))) && cachedSpans.equals(((Object) (((CachedContent) (obj)).cachedSpans))) && metadata.equals(((Object) (((CachedContent) (obj)).metadata)));
	//   17   29:aload_0         
	//   18   30:getfield        #26  <Field int id>
	//   19   33:aload_1         
	//   20   34:getfield        #26  <Field int id>
	//   21   37:icmpne          84
	//   22   40:aload_0         
	//   23   41:getfield        #28  <Field String key>
	//   24   44:aload_1         
	//   25   45:getfield        #28  <Field String key>
	//   26   48:invokevirtual   #99  <Method boolean String.equals(Object)>
	//   27   51:ifeq            84
	//   28   54:aload_0         
	//   29   55:getfield        #40  <Field TreeSet cachedSpans>
	//   30   58:aload_1         
	//   31   59:getfield        #40  <Field TreeSet cachedSpans>
	//   32   62:invokevirtual   #100 <Method boolean TreeSet.equals(Object)>
	//   33   65:ifeq            84
	//   34   68:aload_0         
	//   35   69:getfield        #35  <Field DefaultContentMetadata metadata>
	//   36   72:aload_1         
	//   37   73:getfield        #35  <Field DefaultContentMetadata metadata>
	//   38   76:invokevirtual   #91  <Method boolean DefaultContentMetadata.equals(Object)>
	//   39   79:ifeq            84
	//   40   82:iconst_1        
	//   41   83:ireturn         
	//   42   84:iconst_0        
	//   43   85:ireturn         
		} else
		{
			return false;
	//   44   86:iconst_0        
	//   45   87:ireturn         
		}
	}

	public long getCachedBytesLength(long l, long l1)
	{
		Object obj = ((Object) (getSpan(l)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #107 <Method SimpleCacheSpan getSpan(long)>
	//    3    5:astore          11
		if(((SimpleCacheSpan) (obj)).isHoleSpan())
	//*   4    7:aload           11
	//*   5    9:invokevirtual   #113 <Method boolean SimpleCacheSpan.isHoleSpan()>
	//*   6   12:ifeq            43
		{
			if(((SimpleCacheSpan) (obj)).isOpenEnded())
	//*   7   15:aload           11
	//*   8   17:invokevirtual   #116 <Method boolean SimpleCacheSpan.isOpenEnded()>
	//*   9   20:ifeq            30
				l = 0xffffffffL;
	//   10   23:ldc2w           #117 <Long 0xffffffffL>
	//   11   26:lstore_1        
			else
	//*  12   27:goto            36
				l = ((SimpleCacheSpan) (obj)).length;
	//   13   30:aload           11
	//   14   32:getfield        #122 <Field long SimpleCacheSpan.length>
	//   15   35:lstore_1        
			return -Math.min(l, l1);
	//   16   36:lload_1         
	//   17   37:lload_3         
	//   18   38:invokestatic    #127 <Method long Math.min(long, long)>
	//   19   41:lneg            
	//   20   42:lreturn         
		}
		long l4 = l + l1;
	//   21   43:lload_1         
	//   22   44:lload_3         
	//   23   45:ladd            
	//   24   46:lstore          9
		long l3 = ((SimpleCacheSpan) (obj)).position + ((SimpleCacheSpan) (obj)).length;
	//   25   48:aload           11
	//   26   50:getfield        #130 <Field long SimpleCacheSpan.position>
	//   27   53:aload           11
	//   28   55:getfield        #122 <Field long SimpleCacheSpan.length>
	//   29   58:ladd            
	//   30   59:lstore          7
		long l2 = l3;
	//   31   61:lload           7
	//   32   63:lstore          5
		if(l3 < l4)
	//*  33   65:lload           7
	//*  34   67:lload           9
	//*  35   69:lcmp            
	//*  36   70:ifge            170
		{
			obj = ((Object) (cachedSpans.tailSet(obj, false).iterator()));
	//   37   73:aload_0         
	//   38   74:getfield        #40  <Field TreeSet cachedSpans>
	//   39   77:aload           11
	//   40   79:iconst_0        
	//   41   80:invokevirtual   #134 <Method NavigableSet TreeSet.tailSet(Object, boolean)>
	//   42   83:invokeinterface #140 <Method Iterator NavigableSet.iterator()>
	//   43   88:astore          11
			do
			{
				l2 = l3;
	//   44   90:lload           7
	//   45   92:lstore          5
				if(!((Iterator) (obj)).hasNext())
					break;
	//   46   94:aload           11
	//   47   96:invokeinterface #145 <Method boolean Iterator.hasNext()>
	//   48  101:ifeq            170
				SimpleCacheSpan simplecachespan = (SimpleCacheSpan)((Iterator) (obj)).next();
	//   49  104:aload           11
	//   50  106:invokeinterface #149 <Method Object Iterator.next()>
	//   51  111:checkcast       #109 <Class SimpleCacheSpan>
	//   52  114:astore          12
				if(simplecachespan.position > l3)
	//*  53  116:aload           12
	//*  54  118:getfield        #130 <Field long SimpleCacheSpan.position>
	//*  55  121:lload           7
	//*  56  123:lcmp            
	//*  57  124:ifle            134
				{
					l2 = l3;
	//   58  127:lload           7
	//   59  129:lstore          5
					break;
	//   60  131:goto            170
				}
				l2 = Math.max(l3, simplecachespan.position + simplecachespan.length);
	//   61  134:lload           7
	//   62  136:aload           12
	//   63  138:getfield        #130 <Field long SimpleCacheSpan.position>
	//   64  141:aload           12
	//   65  143:getfield        #122 <Field long SimpleCacheSpan.length>
	//   66  146:ladd            
	//   67  147:invokestatic    #152 <Method long Math.max(long, long)>
	//   68  150:lstore          5
				if(l2 >= l4)
	//*  69  152:lload           5
	//*  70  154:lload           9
	//*  71  156:lcmp            
	//*  72  157:iflt            163
					break;
	//   73  160:goto            170
				l3 = l2;
	//   74  163:lload           5
	//   75  165:lstore          7
			} while(true);
	//   76  167:goto            90
		}
		return Math.min(l2 - l, l1);
	//   77  170:lload           5
	//   78  172:lload_1         
	//   79  173:lsub            
	//   80  174:lload_3         
	//   81  175:invokestatic    #127 <Method long Math.min(long, long)>
	//   82  178:lreturn         
	}

	public ContentMetadata getMetadata()
	{
		return ((ContentMetadata) (metadata));
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field DefaultContentMetadata metadata>
	//    2    4:areturn         
	}

	public SimpleCacheSpan getSpan(long l)
	{
		SimpleCacheSpan simplecachespan = SimpleCacheSpan.createLookup(key, l);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String key>
	//    2    4:lload_1         
	//    3    5:invokestatic    #158 <Method SimpleCacheSpan SimpleCacheSpan.createLookup(String, long)>
	//    4    8:astore_3        
		SimpleCacheSpan simplecachespan1 = (SimpleCacheSpan)cachedSpans.floor(((Object) (simplecachespan)));
	//    5    9:aload_0         
	//    6   10:getfield        #40  <Field TreeSet cachedSpans>
	//    7   13:aload_3         
	//    8   14:invokevirtual   #162 <Method Object TreeSet.floor(Object)>
	//    9   17:checkcast       #109 <Class SimpleCacheSpan>
	//   10   20:astore          4
		if(simplecachespan1 != null && simplecachespan1.position + simplecachespan1.length > l)
	//*  11   22:aload           4
	//*  12   24:ifnull          46
	//*  13   27:aload           4
	//*  14   29:getfield        #130 <Field long SimpleCacheSpan.position>
	//*  15   32:aload           4
	//*  16   34:getfield        #122 <Field long SimpleCacheSpan.length>
	//*  17   37:ladd            
	//*  18   38:lload_1         
	//*  19   39:lcmp            
	//*  20   40:ifle            46
			return simplecachespan1;
	//   21   43:aload           4
	//   22   45:areturn         
		simplecachespan = (SimpleCacheSpan)cachedSpans.ceiling(((Object) (simplecachespan)));
	//   23   46:aload_0         
	//   24   47:getfield        #40  <Field TreeSet cachedSpans>
	//   25   50:aload_3         
	//   26   51:invokevirtual   #165 <Method Object TreeSet.ceiling(Object)>
	//   27   54:checkcast       #109 <Class SimpleCacheSpan>
	//   28   57:astore_3        
		if(simplecachespan == null)
	//*  29   58:aload_3         
	//*  30   59:ifnonnull       71
			return SimpleCacheSpan.createOpenHole(key, l);
	//   31   62:aload_0         
	//   32   63:getfield        #28  <Field String key>
	//   33   66:lload_1         
	//   34   67:invokestatic    #168 <Method SimpleCacheSpan SimpleCacheSpan.createOpenHole(String, long)>
	//   35   70:areturn         
		else
			return SimpleCacheSpan.createClosedHole(key, l, simplecachespan.position - l);
	//   36   71:aload_0         
	//   37   72:getfield        #28  <Field String key>
	//   38   75:lload_1         
	//   39   76:aload_3         
	//   40   77:getfield        #130 <Field long SimpleCacheSpan.position>
	//   41   80:lload_1         
	//   42   81:lsub            
	//   43   82:invokestatic    #172 <Method SimpleCacheSpan SimpleCacheSpan.createClosedHole(String, long, long)>
	//   44   85:areturn         
	}

	public TreeSet getSpans()
	{
		return cachedSpans;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field TreeSet cachedSpans>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return 31 * headerHashCode(0x7fffffff) + cachedSpans.hashCode();
	//    0    0:bipush          31
	//    1    2:aload_0         
	//    2    3:ldc1            #7   <Int 0x7fffffff>
	//    3    5:invokevirtual   #181 <Method int headerHashCode(int)>
	//    4    8:imul            
	//    5    9:aload_0         
	//    6   10:getfield        #40  <Field TreeSet cachedSpans>
	//    7   13:invokevirtual   #183 <Method int TreeSet.hashCode()>
	//    8   16:iadd            
	//    9   17:ireturn         
	}

	public int headerHashCode(int i)
	{
		int j = id * 31 + key.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int id>
	//    2    4:bipush          31
	//    3    6:imul            
	//    4    7:aload_0         
	//    5    8:getfield        #28  <Field String key>
	//    6   11:invokevirtual   #184 <Method int String.hashCode()>
	//    7   14:iadd            
	//    8   15:istore_2        
		if(i < 2)
	//*   9   16:iload_1         
	//*  10   17:iconst_2        
	//*  11   18:icmpge          42
		{
			long l = ContentMetadataInternal.getContentLength(((ContentMetadata) (metadata)));
	//   12   21:aload_0         
	//   13   22:getfield        #35  <Field DefaultContentMetadata metadata>
	//   14   25:invokestatic    #188 <Method long ContentMetadataInternal.getContentLength(ContentMetadata)>
	//   15   28:lstore_3        
			return 31 * j + (int)(l ^ l >>> 32);
	//   16   29:bipush          31
	//   17   31:iload_2         
	//   18   32:imul            
	//   19   33:lload_3         
	//   20   34:lload_3         
	//   21   35:bipush          32
	//   22   37:lushr           
	//   23   38:lxor            
	//   24   39:l2i             
	//   25   40:iadd            
	//   26   41:ireturn         
		} else
		{
			return 31 * j + metadata.hashCode();
	//   27   42:bipush          31
	//   28   44:iload_2         
	//   29   45:imul            
	//   30   46:aload_0         
	//   31   47:getfield        #35  <Field DefaultContentMetadata metadata>
	//   32   50:invokevirtual   #189 <Method int DefaultContentMetadata.hashCode()>
	//   33   53:iadd            
	//   34   54:ireturn         
		}
	}

	public boolean isEmpty()
	{
		return cachedSpans.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field TreeSet cachedSpans>
	//    2    4:invokevirtual   #192 <Method boolean TreeSet.isEmpty()>
	//    3    7:ireturn         
	}

	public boolean isLocked()
	{
		return locked;
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field boolean locked>
	//    2    4:ireturn         
	}

	public boolean removeSpan(CacheSpan cachespan)
	{
		if(cachedSpans.remove(((Object) (cachespan))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field TreeSet cachedSpans>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #200 <Method boolean TreeSet.remove(Object)>
	//*   4    8:ifeq            21
		{
			cachespan.file.delete();
	//    5   11:aload_1         
	//    6   12:getfield        #206 <Field File CacheSpan.file>
	//    7   15:invokevirtual   #211 <Method boolean File.delete()>
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

	public void setLocked(boolean flag)
	{
		locked = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #195 <Field boolean locked>
	//    3    5:return          
	}

	public SimpleCacheSpan touch(SimpleCacheSpan simplecachespan)
		throws Cache.CacheException
	{
		Assertions.checkState(cachedSpans.remove(((Object) (simplecachespan))));
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field TreeSet cachedSpans>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #200 <Method boolean TreeSet.remove(Object)>
	//    4    8:invokestatic    #222 <Method void Assertions.checkState(boolean)>
		SimpleCacheSpan simplecachespan1 = simplecachespan.copyWithUpdatedLastAccessTime(id);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #26  <Field int id>
	//    8   16:invokevirtual   #226 <Method SimpleCacheSpan SimpleCacheSpan.copyWithUpdatedLastAccessTime(int)>
	//    9   19:astore_2        
		if(!simplecachespan.file.renameTo(simplecachespan1.file))
	//*  10   20:aload_1         
	//*  11   21:getfield        #227 <Field File SimpleCacheSpan.file>
	//*  12   24:aload_2         
	//*  13   25:getfield        #227 <Field File SimpleCacheSpan.file>
	//*  14   28:invokevirtual   #231 <Method boolean File.renameTo(File)>
	//*  15   31:ifne            93
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   16   34:new             #233 <Class StringBuilder>
	//   17   37:dup             
	//   18   38:invokespecial   #234 <Method void StringBuilder()>
	//   19   41:astore_3        
			stringbuilder.append("Renaming of ");
	//   20   42:aload_3         
	//   21   43:ldc1            #236 <String "Renaming of ">
	//   22   45:invokevirtual   #240 <Method StringBuilder StringBuilder.append(String)>
	//   23   48:pop             
			stringbuilder.append(((Object) (simplecachespan.file)));
	//   24   49:aload_3         
	//   25   50:aload_1         
	//   26   51:getfield        #227 <Field File SimpleCacheSpan.file>
	//   27   54:invokevirtual   #243 <Method StringBuilder StringBuilder.append(Object)>
	//   28   57:pop             
			stringbuilder.append(" to ");
	//   29   58:aload_3         
	//   30   59:ldc1            #245 <String " to ">
	//   31   61:invokevirtual   #240 <Method StringBuilder StringBuilder.append(String)>
	//   32   64:pop             
			stringbuilder.append(((Object) (simplecachespan1.file)));
	//   33   65:aload_3         
	//   34   66:aload_2         
	//   35   67:getfield        #227 <Field File SimpleCacheSpan.file>
	//   36   70:invokevirtual   #243 <Method StringBuilder StringBuilder.append(Object)>
	//   37   73:pop             
			stringbuilder.append(" failed.");
	//   38   74:aload_3         
	//   39   75:ldc1            #247 <String " failed.">
	//   40   77:invokevirtual   #240 <Method StringBuilder StringBuilder.append(String)>
	//   41   80:pop             
			throw new Cache.CacheException(stringbuilder.toString());
	//   42   81:new             #217 <Class Cache$CacheException>
	//   43   84:dup             
	//   44   85:aload_3         
	//   45   86:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   46   89:invokespecial   #253 <Method void Cache$CacheException(String)>
	//   47   92:athrow          
		} else
		{
			cachedSpans.add(((Object) (simplecachespan1)));
	//   48   93:aload_0         
	//   49   94:getfield        #40  <Field TreeSet cachedSpans>
	//   50   97:aload_2         
	//   51   98:invokevirtual   #84  <Method boolean TreeSet.add(Object)>
	//   52  101:pop             
			return simplecachespan1;
	//   53  102:aload_2         
	//   54  103:areturn         
		}
	}

	public void writeToStream(DataOutputStream dataoutputstream)
		throws IOException
	{
		dataoutputstream.writeInt(id);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #26  <Field int id>
	//    3    5:invokevirtual   #261 <Method void DataOutputStream.writeInt(int)>
		dataoutputstream.writeUTF(key);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #28  <Field String key>
	//    7   13:invokevirtual   #264 <Method void DataOutputStream.writeUTF(String)>
		metadata.writeToStream(dataoutputstream);
	//    8   16:aload_0         
	//    9   17:getfield        #35  <Field DefaultContentMetadata metadata>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #266 <Method void DefaultContentMetadata.writeToStream(DataOutputStream)>
	//   12   24:return          
	}

	private static final int VERSION_MAX = 0x7fffffff;
	private static final int VERSION_METADATA_INTRODUCED = 2;
	private final TreeSet cachedSpans = new TreeSet();
	public final int id;
	public final String key;
	private boolean locked;
	private DefaultContentMetadata metadata;
}
