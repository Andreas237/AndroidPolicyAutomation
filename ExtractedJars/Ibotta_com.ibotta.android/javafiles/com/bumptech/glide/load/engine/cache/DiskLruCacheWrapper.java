// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.cache;

import android.util.Log;
import com.bumptech.glide.disklrucache.DiskLruCache;
import com.bumptech.glide.load.Key;
import java.io.File;
import java.io.IOException;

// Referenced classes of package com.bumptech.glide.load.engine.cache:
//			DiskCache, DiskCacheWriteLocker, SafeKeyGenerator

public class DiskLruCacheWrapper
	implements DiskCache
{

	protected DiskLruCacheWrapper(File file, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #24  <Class DiskCacheWriteLocker>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void DiskCacheWriteLocker()>
	//    6   12:putfield        #27  <Field DiskCacheWriteLocker writeLocker>
		directory = file;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #29  <Field File directory>
		maxSize = l;
	//   10   20:aload_0         
	//   11   21:lload_2         
	//   12   22:putfield        #31  <Field long maxSize>
	//   13   25:aload_0         
	//   14   26:new             #33  <Class SafeKeyGenerator>
	//   15   29:dup             
	//   16   30:invokespecial   #34  <Method void SafeKeyGenerator()>
	//   17   33:putfield        #36  <Field SafeKeyGenerator safeKeyGenerator>
	//   18   36:return          
	}

	public static DiskCache create(File file, long l)
	{
		return ((DiskCache) (new DiskLruCacheWrapper(file, l)));
	//    0    0:new             #2   <Class DiskLruCacheWrapper>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:invokespecial   #42  <Method void DiskLruCacheWrapper(File, long)>
	//    5    9:areturn         
	}

	private DiskLruCache getDiskCache()
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		DiskLruCache disklrucache;
		if(diskLruCache == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #48  <Field DiskLruCache diskLruCache>
	//*   4    6:ifnonnull       26
			diskLruCache = DiskLruCache.open(directory, 1, 1, maxSize);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #29  <Field File directory>
	//    8   14:iconst_1        
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #31  <Field long maxSize>
	//   12   20:invokestatic    #54  <Method DiskLruCache DiskLruCache.open(File, int, int, long)>
	//   13   23:putfield        #48  <Field DiskLruCache diskLruCache>
		disklrucache = diskLruCache;
	//   14   26:aload_0         
	//   15   27:getfield        #48  <Field DiskLruCache diskLruCache>
	//   16   30:astore_1        
		this;
	//   17   31:aload_0         
		JVM INSTR monitorexit ;
	//   18   32:monitorexit     
		return disklrucache;
	//   19   33:aload_1         
	//   20   34:areturn         
		Exception exception;
		exception;
	//   21   35:astore_1        
	//*  22   36:aload_0         
		throw exception;
	//   23   37:monitorexit     
	//   24   38:aload_1         
	//   25   39:athrow          
	}

	private void resetDiskCache()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		diskLruCache = null;
	//    2    2:aload_0         
	//    3    3:aconst_null     
	//    4    4:putfield        #48  <Field DiskLruCache diskLruCache>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		Exception exception;
		exception;
	//    8   10:astore_1        
	//*   9   11:aload_0         
		throw exception;
	//   10   12:monitorexit     
	//   11   13:aload_1         
	//   12   14:athrow          
	}

	public void clear()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		getDiskCache().delete();
	//    2    2:aload_0         
	//    3    3:invokespecial   #59  <Method DiskLruCache getDiskCache()>
	//    4    6:invokevirtual   #62  <Method void DiskLruCache.delete()>
_L2:
		resetDiskCache();
	//    5    9:aload_0         
	//    6   10:invokespecial   #64  <Method void resetDiskCache()>
		break; /* Loop/switch isn't completed */
	//    7   13:goto            42
		Object obj;
		obj;
	//    8   16:astore_1        
		break MISSING_BLOCK_LABEL_45;
	//    9   17:goto            45
		obj;
	//   10   20:astore_1        
		if(Log.isLoggable("DiskLruCacheWrapper", 5))
	//*  11   21:ldc1            #66  <String "DiskLruCacheWrapper">
	//*  12   23:iconst_5        
	//*  13   24:invokestatic    #72  <Method boolean Log.isLoggable(String, int)>
	//*  14   27:ifeq            9
			Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", ((Throwable) (obj)));
	//   15   30:ldc1            #66  <String "DiskLruCacheWrapper">
	//   16   32:ldc1            #74  <String "Unable to clear disk cache or disk cache cleared externally">
	//   17   34:aload_1         
	//   18   35:invokestatic    #78  <Method int Log.w(String, String, Throwable)>
	//   19   38:pop             
		if(true) goto _L2; else goto _L1
	//   20   39:goto            9
_L1:
		this;
	//   21   42:aload_0         
		JVM INSTR monitorexit ;
	//   22   43:monitorexit     
		return;
	//   23   44:return          
		resetDiskCache();
	//   24   45:aload_0         
	//   25   46:invokespecial   #64  <Method void resetDiskCache()>
		throw obj;
	//   26   49:aload_1         
	//   27   50:athrow          
		obj;
	//   28   51:astore_1        
		this;
	//   29   52:aload_0         
		JVM INSTR monitorexit ;
	//   30   53:monitorexit     
		throw obj;
	//   31   54:aload_1         
	//   32   55:athrow          
	}

	public void delete(Key key)
	{
		key = ((Key) (safeKeyGenerator.getSafeKey(key)));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field SafeKeyGenerator safeKeyGenerator>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #83  <Method String SafeKeyGenerator.getSafeKey(Key)>
	//    4    8:astore_1        
		try
		{
			getDiskCache().remove(((String) (key)));
	//    5    9:aload_0         
	//    6   10:invokespecial   #59  <Method DiskLruCache getDiskCache()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #87  <Method boolean DiskLruCache.remove(String)>
	//    9   17:pop             
			return;
	//   10   18:return          
		}
		// Misplaced declaration of an exception variable
		catch(Key key) { }
	//   11   19:astore_1        
		if(Log.isLoggable("DiskLruCacheWrapper", 5))
	//*  12   20:ldc1            #66  <String "DiskLruCacheWrapper">
	//*  13   22:iconst_5        
	//*  14   23:invokestatic    #72  <Method boolean Log.isLoggable(String, int)>
	//*  15   26:ifeq            38
			Log.w("DiskLruCacheWrapper", "Unable to delete from disk cache", ((Throwable) (key)));
	//   16   29:ldc1            #66  <String "DiskLruCacheWrapper">
	//   17   31:ldc1            #89  <String "Unable to delete from disk cache">
	//   18   33:aload_1         
	//   19   34:invokestatic    #78  <Method int Log.w(String, String, Throwable)>
	//   20   37:pop             
	//   21   38:return          
	}

	public File get(Key key)
	{
		String s;
		s = safeKeyGenerator.getSafeKey(key);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field SafeKeyGenerator safeKeyGenerator>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #83  <Method String SafeKeyGenerator.getSafeKey(Key)>
	//    4    8:astore_2        
		if(Log.isLoggable("DiskLruCacheWrapper", 2))
	//*   5    9:ldc1            #66  <String "DiskLruCacheWrapper">
	//*   6   11:iconst_2        
	//*   7   12:invokestatic    #72  <Method boolean Log.isLoggable(String, int)>
	//*   8   15:ifeq            62
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    9   18:new             #93  <Class StringBuilder>
	//   10   21:dup             
	//   11   22:invokespecial   #94  <Method void StringBuilder()>
	//   12   25:astore_3        
			stringbuilder.append("Get: Obtained: ");
	//   13   26:aload_3         
	//   14   27:ldc1            #96  <String "Get: Obtained: ">
	//   15   29:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
			stringbuilder.append(s);
	//   17   33:aload_3         
	//   18   34:aload_2         
	//   19   35:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
			stringbuilder.append(" for for Key: ");
	//   21   39:aload_3         
	//   22   40:ldc1            #102 <String " for for Key: ">
	//   23   42:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   24   45:pop             
			stringbuilder.append(((Object) (key)));
	//   25   46:aload_3         
	//   26   47:aload_1         
	//   27   48:invokevirtual   #105 <Method StringBuilder StringBuilder.append(Object)>
	//   28   51:pop             
			Log.v("DiskLruCacheWrapper", stringbuilder.toString());
	//   29   52:ldc1            #66  <String "DiskLruCacheWrapper">
	//   30   54:aload_3         
	//   31   55:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   32   58:invokestatic    #113 <Method int Log.v(String, String)>
	//   33   61:pop             
		}
		key = ((Key) (getDiskCache().get(s)));
	//   34   62:aload_0         
	//   35   63:invokespecial   #59  <Method DiskLruCache getDiskCache()>
	//   36   66:aload_2         
	//   37   67:invokevirtual   #116 <Method com.bumptech.glide.disklrucache.DiskLruCache$Value DiskLruCache.get(String)>
	//   38   70:astore_1        
		if(key == null)
			break MISSING_BLOCK_LABEL_102;
	//   39   71:aload_1         
	//   40   72:ifnull          102
		key = ((Key) (((com.bumptech.glide.disklrucache.DiskLruCache.Value) (key)).getFile(0)));
	//   41   75:aload_1         
	//   42   76:iconst_0        
	//   43   77:invokevirtual   #122 <Method File com.bumptech.glide.disklrucache.DiskLruCache$Value.getFile(int)>
	//   44   80:astore_1        
		return ((File) (key));
	//   45   81:aload_1         
	//   46   82:areturn         
		key;
	//   47   83:astore_1        
		if(Log.isLoggable("DiskLruCacheWrapper", 5))
	//*  48   84:ldc1            #66  <String "DiskLruCacheWrapper">
	//*  49   86:iconst_5        
	//*  50   87:invokestatic    #72  <Method boolean Log.isLoggable(String, int)>
	//*  51   90:ifeq            102
			Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", ((Throwable) (key)));
	//   52   93:ldc1            #66  <String "DiskLruCacheWrapper">
	//   53   95:ldc1            #124 <String "Unable to get from disk cache">
	//   54   97:aload_1         
	//   55   98:invokestatic    #78  <Method int Log.w(String, String, Throwable)>
	//   56  101:pop             
		return null;
	//   57  102:aconst_null     
	//   58  103:areturn         
	}

	public void put(Key key, DiskCache.Writer writer)
	{
		String s;
		s = safeKeyGenerator.getSafeKey(key);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field SafeKeyGenerator safeKeyGenerator>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #83  <Method String SafeKeyGenerator.getSafeKey(Key)>
	//    4    8:astore_3        
		writeLocker.acquire(s);
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field DiskCacheWriteLocker writeLocker>
	//    7   13:aload_3         
	//    8   14:invokevirtual   #130 <Method void DiskCacheWriteLocker.acquire(String)>
		if(Log.isLoggable("DiskLruCacheWrapper", 2))
	//*   9   17:ldc1            #66  <String "DiskLruCacheWrapper">
	//*  10   19:iconst_2        
	//*  11   20:invokestatic    #72  <Method boolean Log.isLoggable(String, int)>
	//*  12   23:ifeq            76
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   13   26:new             #93  <Class StringBuilder>
	//   14   29:dup             
	//   15   30:invokespecial   #94  <Method void StringBuilder()>
	//   16   33:astore          4
			stringbuilder.append("Put: Obtained: ");
	//   17   35:aload           4
	//   18   37:ldc1            #132 <String "Put: Obtained: ">
	//   19   39:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   20   42:pop             
			stringbuilder.append(s);
	//   21   43:aload           4
	//   22   45:aload_3         
	//   23   46:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   24   49:pop             
			stringbuilder.append(" for for Key: ");
	//   25   50:aload           4
	//   26   52:ldc1            #102 <String " for for Key: ">
	//   27   54:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   28   57:pop             
			stringbuilder.append(((Object) (key)));
	//   29   58:aload           4
	//   30   60:aload_1         
	//   31   61:invokevirtual   #105 <Method StringBuilder StringBuilder.append(Object)>
	//   32   64:pop             
			Log.v("DiskLruCacheWrapper", stringbuilder.toString());
	//   33   65:ldc1            #66  <String "DiskLruCacheWrapper">
	//   34   67:aload           4
	//   35   69:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   36   72:invokestatic    #113 <Method int Log.v(String, String)>
	//   37   75:pop             
		}
		com.bumptech.glide.disklrucache.DiskLruCache.Value value;
		key = ((Key) (getDiskCache()));
	//   38   76:aload_0         
	//   39   77:invokespecial   #59  <Method DiskLruCache getDiskCache()>
	//   40   80:astore_1        
		value = ((DiskLruCache) (key)).get(s);
	//   41   81:aload_1         
	//   42   82:aload_3         
	//   43   83:invokevirtual   #116 <Method com.bumptech.glide.disklrucache.DiskLruCache$Value DiskLruCache.get(String)>
	//   44   86:astore          4
		if(value != null)
	//*  45   88:aload           4
	//*  46   90:ifnull          102
		{
			writeLocker.release(s);
	//   47   93:aload_0         
	//   48   94:getfield        #27  <Field DiskCacheWriteLocker writeLocker>
	//   49   97:aload_3         
	//   50   98:invokevirtual   #135 <Method void DiskCacheWriteLocker.release(String)>
			return;
	//   51  101:return          
		}
		key = ((Key) (((DiskLruCache) (key)).edit(s)));
	//   52  102:aload_1         
	//   53  103:aload_3         
	//   54  104:invokevirtual   #139 <Method com.bumptech.glide.disklrucache.DiskLruCache$Editor DiskLruCache.edit(String)>
	//   55  107:astore_1        
		if(key == null)
			break MISSING_BLOCK_LABEL_144;
	//   56  108:aload_1         
	//   57  109:ifnull          144
		if(writer.write(((com.bumptech.glide.disklrucache.DiskLruCache.Editor) (key)).getFile(0)))
	//*  58  112:aload_2         
	//*  59  113:aload_1         
	//*  60  114:iconst_0        
	//*  61  115:invokevirtual   #142 <Method File com.bumptech.glide.disklrucache.DiskLruCache$Editor.getFile(int)>
	//*  62  118:invokeinterface #148 <Method boolean DiskCache$Writer.write(File)>
	//*  63  123:ifeq            130
			((com.bumptech.glide.disklrucache.DiskLruCache.Editor) (key)).commit();
	//   64  126:aload_1         
	//   65  127:invokevirtual   #151 <Method void com.bumptech.glide.disklrucache.DiskLruCache$Editor.commit()>
		try
		{
			((com.bumptech.glide.disklrucache.DiskLruCache.Editor) (key)).abortUnlessCommitted();
	//   66  130:aload_1         
	//   67  131:invokevirtual   #154 <Method void com.bumptech.glide.disklrucache.DiskLruCache$Editor.abortUnlessCommitted()>
			break MISSING_BLOCK_LABEL_196;
	//   68  134:goto            196
		}
	//*  69  137:astore_2        
	//*  70  138:aload_1         
	//*  71  139:invokevirtual   #154 <Method void com.bumptech.glide.disklrucache.DiskLruCache$Editor.abortUnlessCommitted()>
	//*  72  142:aload_2         
	//*  73  143:athrow          
	//*  74  144:new             #93  <Class StringBuilder>
	//*  75  147:dup             
	//*  76  148:invokespecial   #94  <Method void StringBuilder()>
	//*  77  151:astore_1        
	//*  78  152:aload_1         
	//*  79  153:ldc1            #156 <String "Had two simultaneous puts for: ">
	//*  80  155:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//*  81  158:pop             
	//*  82  159:aload_1         
	//*  83  160:aload_3         
	//*  84  161:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//*  85  164:pop             
	//*  86  165:new             #158 <Class IllegalStateException>
	//*  87  168:dup             
	//*  88  169:aload_1         
	//*  89  170:invokevirtual   #109 <Method String StringBuilder.toString()>
	//*  90  173:invokespecial   #160 <Method void IllegalStateException(String)>
	//*  91  176:athrow          
		// Misplaced declaration of an exception variable
		catch(Key key) { }
	//   92  177:astore_1        
		break MISSING_BLOCK_LABEL_178;
		writer;
		((com.bumptech.glide.disklrucache.DiskLruCache.Editor) (key)).abortUnlessCommitted();
		throw writer;
		key = ((Key) (new StringBuilder()));
		((StringBuilder) (key)).append("Had two simultaneous puts for: ");
		((StringBuilder) (key)).append(s);
		throw new IllegalStateException(((StringBuilder) (key)).toString());
		if(Log.isLoggable("DiskLruCacheWrapper", 5))
	//*  93  178:ldc1            #66  <String "DiskLruCacheWrapper">
	//*  94  180:iconst_5        
	//*  95  181:invokestatic    #72  <Method boolean Log.isLoggable(String, int)>
	//*  96  184:ifeq            196
			Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", ((Throwable) (key)));
	//   97  187:ldc1            #66  <String "DiskLruCacheWrapper">
	//   98  189:ldc1            #162 <String "Unable to put to disk cache">
	//   99  191:aload_1         
	//  100  192:invokestatic    #78  <Method int Log.w(String, String, Throwable)>
	//  101  195:pop             
		writeLocker.release(s);
	//  102  196:aload_0         
	//  103  197:getfield        #27  <Field DiskCacheWriteLocker writeLocker>
	//  104  200:aload_3         
	//  105  201:invokevirtual   #135 <Method void DiskCacheWriteLocker.release(String)>
		return;
	//  106  204:return          
		key;
	//  107  205:astore_1        
		writeLocker.release(s);
	//  108  206:aload_0         
	//  109  207:getfield        #27  <Field DiskCacheWriteLocker writeLocker>
	//  110  210:aload_3         
	//  111  211:invokevirtual   #135 <Method void DiskCacheWriteLocker.release(String)>
		throw key;
	//  112  214:aload_1         
	//  113  215:athrow          
	}

	private final File directory;
	private DiskLruCache diskLruCache;
	private final long maxSize;
	private final SafeKeyGenerator safeKeyGenerator = new SafeKeyGenerator();
	private final DiskCacheWriteLocker writeLocker = new DiskCacheWriteLocker();
}
