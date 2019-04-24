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

	protected DiskLruCacheWrapper(File file, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #36  <Class DiskCacheWriteLocker>
	//    4    8:dup             
	//    5    9:invokespecial   #37  <Method void DiskCacheWriteLocker()>
	//    6   12:putfield        #39  <Field DiskCacheWriteLocker writeLocker>
		directory = file;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #41  <Field File directory>
		maxSize = i;
	//   10   20:aload_0         
	//   11   21:iload_2         
	//   12   22:putfield        #43  <Field int maxSize>
	//   13   25:aload_0         
	//   14   26:new             #45  <Class SafeKeyGenerator>
	//   15   29:dup             
	//   16   30:invokespecial   #46  <Method void SafeKeyGenerator()>
	//   17   33:putfield        #48  <Field SafeKeyGenerator safeKeyGenerator>
	//   18   36:return          
	}

	public static DiskCache get(File file, int i)
	{
		com/bumptech/glide/load/engine/cache/DiskLruCacheWrapper;
	//    0    0:ldc1            #2   <Class DiskLruCacheWrapper>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(wrapper == null)
	//*   2    3:getstatic       #29  <Field DiskLruCacheWrapper wrapper>
	//*   3    6:ifnonnull       21
			wrapper = new DiskLruCacheWrapper(file, i);
	//    4    9:new             #2   <Class DiskLruCacheWrapper>
	//    5   12:dup             
	//    6   13:aload_0         
	//    7   14:iload_1         
	//    8   15:invokespecial   #52  <Method void DiskLruCacheWrapper(File, int)>
	//    9   18:putstatic       #29  <Field DiskLruCacheWrapper wrapper>
		file = ((File) (wrapper));
	//   10   21:getstatic       #29  <Field DiskLruCacheWrapper wrapper>
	//   11   24:astore_0        
		com/bumptech/glide/load/engine/cache/DiskLruCacheWrapper;
	//   12   25:ldc1            #2   <Class DiskLruCacheWrapper>
		JVM INSTR monitorexit ;
	//   13   27:monitorexit     
		return ((DiskCache) (file));
	//   14   28:aload_0         
	//   15   29:areturn         
		file;
	//   16   30:astore_0        
	//*  17   31:ldc1            #2   <Class DiskLruCacheWrapper>
		throw file;
	//   18   33:monitorexit     
	//   19   34:aload_0         
	//   20   35:athrow          
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
	//*   3    3:getfield        #58  <Field DiskLruCache diskLruCache>
	//*   4    6:ifnonnull       27
			diskLruCache = DiskLruCache.open(directory, 1, 1, maxSize);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #41  <Field File directory>
	//    8   14:iconst_1        
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #43  <Field int maxSize>
	//   12   20:i2l             
	//   13   21:invokestatic    #64  <Method DiskLruCache DiskLruCache.open(File, int, int, long)>
	//   14   24:putfield        #58  <Field DiskLruCache diskLruCache>
		disklrucache = diskLruCache;
	//   15   27:aload_0         
	//   16   28:getfield        #58  <Field DiskLruCache diskLruCache>
	//   17   31:astore_1        
		this;
	//   18   32:aload_0         
		JVM INSTR monitorexit ;
	//   19   33:monitorexit     
		return disklrucache;
	//   20   34:aload_1         
	//   21   35:areturn         
		Exception exception;
		exception;
	//   22   36:astore_1        
	//*  23   37:aload_0         
		throw exception;
	//   24   38:monitorexit     
	//   25   39:aload_1         
	//   26   40:athrow          
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
	//    4    4:putfield        #58  <Field DiskLruCache diskLruCache>
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
	//    3    3:invokespecial   #69  <Method DiskLruCache getDiskCache()>
	//    4    6:invokevirtual   #72  <Method void DiskLruCache.delete()>
		resetDiskCache();
	//    5    9:aload_0         
	//    6   10:invokespecial   #74  <Method void resetDiskCache()>
		break MISSING_BLOCK_LABEL_35;
	//    7   13:goto            35
		Object obj;
		obj;
	//    8   16:astore_1        
		if(Log.isLoggable("DiskLruCacheWrapper", 5))
	//*   9   17:ldc1            #13  <String "DiskLruCacheWrapper">
	//*  10   19:iconst_5        
	//*  11   20:invokestatic    #80  <Method boolean Log.isLoggable(String, int)>
	//*  12   23:ifeq            35
			Log.w("DiskLruCacheWrapper", "Unable to clear disk cache", ((Throwable) (obj)));
	//   13   26:ldc1            #13  <String "DiskLruCacheWrapper">
	//   14   28:ldc1            #82  <String "Unable to clear disk cache">
	//   15   30:aload_1         
	//   16   31:invokestatic    #86  <Method int Log.w(String, String, Throwable)>
	//   17   34:pop             
		this;
	//   18   35:aload_0         
		JVM INSTR monitorexit ;
	//   19   36:monitorexit     
		return;
	//   20   37:return          
		obj;
	//   21   38:astore_1        
	//*  22   39:aload_0         
		throw obj;
	//   23   40:monitorexit     
	//   24   41:aload_1         
	//   25   42:athrow          
	}

	public void delete(Key key)
	{
		key = ((Key) (safeKeyGenerator.getSafeKey(key)));
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field SafeKeyGenerator safeKeyGenerator>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #91  <Method String SafeKeyGenerator.getSafeKey(Key)>
	//    4    8:astore_1        
		try
		{
			getDiskCache().remove(((String) (key)));
	//    5    9:aload_0         
	//    6   10:invokespecial   #69  <Method DiskLruCache getDiskCache()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #95  <Method boolean DiskLruCache.remove(String)>
	//    9   17:pop             
			return;
	//   10   18:return          
		}
		// Misplaced declaration of an exception variable
		catch(Key key) { }
	//   11   19:astore_1        
		if(Log.isLoggable("DiskLruCacheWrapper", 5))
	//*  12   20:ldc1            #13  <String "DiskLruCacheWrapper">
	//*  13   22:iconst_5        
	//*  14   23:invokestatic    #80  <Method boolean Log.isLoggable(String, int)>
	//*  15   26:ifeq            38
			Log.w("DiskLruCacheWrapper", "Unable to delete from disk cache", ((Throwable) (key)));
	//   16   29:ldc1            #13  <String "DiskLruCacheWrapper">
	//   17   31:ldc1            #97  <String "Unable to delete from disk cache">
	//   18   33:aload_1         
	//   19   34:invokestatic    #86  <Method int Log.w(String, String, Throwable)>
	//   20   37:pop             
	//   21   38:return          
	}

	public File get(Key key)
	{
		Object obj = ((Object) (safeKeyGenerator.getSafeKey(key)));
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field SafeKeyGenerator safeKeyGenerator>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #91  <Method String SafeKeyGenerator.getSafeKey(Key)>
	//    4    8:astore_2        
		if(Log.isLoggable("DiskLruCacheWrapper", 2))
	//*   5    9:ldc1            #13  <String "DiskLruCacheWrapper">
	//*   6   11:iconst_2        
	//*   7   12:invokestatic    #80  <Method boolean Log.isLoggable(String, int)>
	//*   8   15:ifeq            52
			Log.v("DiskLruCacheWrapper", (new StringBuilder()).append("Get: Obtained: ").append(((String) (obj))).append(" for for Key: ").append(((Object) (key))).toString());
	//    9   18:ldc1            #13  <String "DiskLruCacheWrapper">
	//   10   20:new             #100 <Class StringBuilder>
	//   11   23:dup             
	//   12   24:invokespecial   #101 <Method void StringBuilder()>
	//   13   27:ldc1            #103 <String "Get: Obtained: ">
	//   14   29:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   15   32:aload_2         
	//   16   33:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   17   36:ldc1            #109 <String " for for Key: ">
	//   18   38:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   19   41:aload_1         
	//   20   42:invokevirtual   #112 <Method StringBuilder StringBuilder.append(Object)>
	//   21   45:invokevirtual   #116 <Method String StringBuilder.toString()>
	//   22   48:invokestatic    #120 <Method int Log.v(String, String)>
	//   23   51:pop             
		key = null;
	//   24   52:aconst_null     
	//   25   53:astore_1        
		try
		{
			obj = ((Object) (getDiskCache().get(((String) (obj)))));
	//   26   54:aload_0         
	//   27   55:invokespecial   #69  <Method DiskLruCache getDiskCache()>
	//   28   58:aload_2         
	//   29   59:invokevirtual   #123 <Method com.bumptech.glide.disklrucache.DiskLruCache$Value DiskLruCache.get(String)>
	//   30   62:astore_2        
		}
	//*  31   63:aload_2         
	//*  32   64:ifnull          73
	//*  33   67:aload_2         
	//*  34   68:iconst_0        
	//*  35   69:invokevirtual   #129 <Method File com.bumptech.glide.disklrucache.DiskLruCache$Value.getFile(int)>
	//*  36   72:astore_1        
	//*  37   73:aload_1         
	//*  38   74:areturn         
		// Misplaced declaration of an exception variable
		catch(Key key)
	//*  39   75:astore_1        
		{
			if(Log.isLoggable("DiskLruCacheWrapper", 5))
	//*  40   76:ldc1            #13  <String "DiskLruCacheWrapper">
	//*  41   78:iconst_5        
	//*  42   79:invokestatic    #80  <Method boolean Log.isLoggable(String, int)>
	//*  43   82:ifeq            94
				Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", ((Throwable) (key)));
	//   44   85:ldc1            #13  <String "DiskLruCacheWrapper">
	//   45   87:ldc1            #131 <String "Unable to get from disk cache">
	//   46   89:aload_1         
	//   47   90:invokestatic    #86  <Method int Log.w(String, String, Throwable)>
	//   48   93:pop             
			return null;
	//   49   94:aconst_null     
	//   50   95:areturn         
		}
		if(obj == null)
			break MISSING_BLOCK_LABEL_73;
		key = ((Key) (((com.bumptech.glide.disklrucache.DiskLruCache.Value) (obj)).getFile(0)));
		return ((File) (key));
	}

	public void put(Key key, DiskCache.Writer writer)
	{
		writeLocker.acquire(key);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field DiskCacheWriteLocker writeLocker>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #136 <Method void DiskCacheWriteLocker.acquire(Key)>
		String s;
		s = safeKeyGenerator.getSafeKey(key);
	//    4    8:aload_0         
	//    5    9:getfield        #48  <Field SafeKeyGenerator safeKeyGenerator>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #91  <Method String SafeKeyGenerator.getSafeKey(Key)>
	//    8   16:astore_3        
		if(Log.isLoggable("DiskLruCacheWrapper", 2))
	//*   9   17:ldc1            #13  <String "DiskLruCacheWrapper">
	//*  10   19:iconst_2        
	//*  11   20:invokestatic    #80  <Method boolean Log.isLoggable(String, int)>
	//*  12   23:ifeq            60
			Log.v("DiskLruCacheWrapper", (new StringBuilder()).append("Put: Obtained: ").append(s).append(" for for Key: ").append(((Object) (key))).toString());
	//   13   26:ldc1            #13  <String "DiskLruCacheWrapper">
	//   14   28:new             #100 <Class StringBuilder>
	//   15   31:dup             
	//   16   32:invokespecial   #101 <Method void StringBuilder()>
	//   17   35:ldc1            #138 <String "Put: Obtained: ">
	//   18   37:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   19   40:aload_3         
	//   20   41:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   21   44:ldc1            #109 <String " for for Key: ">
	//   22   46:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   23   49:aload_1         
	//   24   50:invokevirtual   #112 <Method StringBuilder StringBuilder.append(Object)>
	//   25   53:invokevirtual   #116 <Method String StringBuilder.toString()>
	//   26   56:invokestatic    #120 <Method int Log.v(String, String)>
	//   27   59:pop             
		Object obj;
		com.bumptech.glide.disklrucache.DiskLruCache.Value value;
		obj = ((Object) (getDiskCache()));
	//   28   60:aload_0         
	//   29   61:invokespecial   #69  <Method DiskLruCache getDiskCache()>
	//   30   64:astore          4
		value = ((DiskLruCache) (obj)).get(s);
	//   31   66:aload           4
	//   32   68:aload_3         
	//   33   69:invokevirtual   #123 <Method com.bumptech.glide.disklrucache.DiskLruCache$Value DiskLruCache.get(String)>
	//   34   72:astore          5
		if(value != null)
	//*  35   74:aload           5
	//*  36   76:ifnull          88
		{
			writeLocker.release(key);
	//   37   79:aload_0         
	//   38   80:getfield        #39  <Field DiskCacheWriteLocker writeLocker>
	//   39   83:aload_1         
	//   40   84:invokevirtual   #141 <Method void DiskCacheWriteLocker.release(Key)>
			return;
	//   41   87:return          
		}
		obj = ((Object) (((DiskLruCache) (obj)).edit(s)));
	//   42   88:aload           4
	//   43   90:aload_3         
	//   44   91:invokevirtual   #145 <Method com.bumptech.glide.disklrucache.DiskLruCache$Editor DiskLruCache.edit(String)>
	//   45   94:astore          4
		if(obj != null)
			break MISSING_BLOCK_LABEL_128;
	//   46   96:aload           4
	//   47   98:ifnonnull       128
		try
		{
			throw new IllegalStateException((new StringBuilder()).append("Had two simultaneous puts for: ").append(s).toString());
	//   48  101:new             #147 <Class IllegalStateException>
	//   49  104:dup             
	//   50  105:new             #100 <Class StringBuilder>
	//   51  108:dup             
	//   52  109:invokespecial   #101 <Method void StringBuilder()>
	//   53  112:ldc1            #149 <String "Had two simultaneous puts for: ">
	//   54  114:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   55  117:aload_3         
	//   56  118:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   57  121:invokevirtual   #116 <Method String StringBuilder.toString()>
	//   58  124:invokespecial   #152 <Method void IllegalStateException(String)>
	//   59  127:athrow          
		}
	//*  60  128:aload_2         
	//*  61  129:aload           4
	//*  62  131:iconst_0        
	//*  63  132:invokevirtual   #155 <Method File com.bumptech.glide.disklrucache.DiskLruCache$Editor.getFile(int)>
	//*  64  135:invokeinterface #161 <Method boolean DiskCache$Writer.write(File)>
	//*  65  140:ifeq            148
	//*  66  143:aload           4
	//*  67  145:invokevirtual   #164 <Method void com.bumptech.glide.disklrucache.DiskLruCache$Editor.commit()>
	//*  68  148:aload           4
	//*  69  150:invokevirtual   #167 <Method void com.bumptech.glide.disklrucache.DiskLruCache$Editor.abortUnlessCommitted()>
	//*  70  153:goto            164
	//*  71  156:astore_2        
	//*  72  157:aload           4
	//*  73  159:invokevirtual   #167 <Method void com.bumptech.glide.disklrucache.DiskLruCache$Editor.abortUnlessCommitted()>
	//*  74  162:aload_2         
	//*  75  163:athrow          
	//*  76  164:goto            186
		// Misplaced declaration of an exception variable
		catch(DiskCache.Writer writer) { }
	//   77  167:astore_2        
		break MISSING_BLOCK_LABEL_168;
		if(writer.write(((com.bumptech.glide.disklrucache.DiskLruCache.Editor) (obj)).getFile(0)))
			((com.bumptech.glide.disklrucache.DiskLruCache.Editor) (obj)).commit();
		((com.bumptech.glide.disklrucache.DiskLruCache.Editor) (obj)).abortUnlessCommitted();
		break MISSING_BLOCK_LABEL_186;
		writer;
		((com.bumptech.glide.disklrucache.DiskLruCache.Editor) (obj)).abortUnlessCommitted();
		throw writer;
		if(Log.isLoggable("DiskLruCacheWrapper", 5))
	//*  78  168:ldc1            #13  <String "DiskLruCacheWrapper">
	//*  79  170:iconst_5        
	//*  80  171:invokestatic    #80  <Method boolean Log.isLoggable(String, int)>
	//*  81  174:ifeq            186
			Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", ((Throwable) (writer)));
	//   82  177:ldc1            #13  <String "DiskLruCacheWrapper">
	//   83  179:ldc1            #169 <String "Unable to put to disk cache">
	//   84  181:aload_2         
	//   85  182:invokestatic    #86  <Method int Log.w(String, String, Throwable)>
	//   86  185:pop             
		writeLocker.release(key);
	//   87  186:aload_0         
	//   88  187:getfield        #39  <Field DiskCacheWriteLocker writeLocker>
	//   89  190:aload_1         
	//   90  191:invokevirtual   #141 <Method void DiskCacheWriteLocker.release(Key)>
		return;
	//   91  194:return          
		writer;
	//   92  195:astore_2        
		writeLocker.release(key);
	//   93  196:aload_0         
	//   94  197:getfield        #39  <Field DiskCacheWriteLocker writeLocker>
	//   95  200:aload_1         
	//   96  201:invokevirtual   #141 <Method void DiskCacheWriteLocker.release(Key)>
		throw writer;
	//   97  204:aload_2         
	//   98  205:athrow          
	}

	private static final int APP_VERSION = 1;
	private static final String TAG = "DiskLruCacheWrapper";
	private static final int VALUE_COUNT = 1;
	private static DiskLruCacheWrapper wrapper = null;
	private final File directory;
	private DiskLruCache diskLruCache;
	private final int maxSize;
	private final SafeKeyGenerator safeKeyGenerator = new SafeKeyGenerator();
	private final DiskCacheWriteLocker writeLocker = new DiskCacheWriteLocker();

	static 
	{
	//    0    0:aconst_null     
	//    1    1:putstatic       #29  <Field DiskLruCacheWrapper wrapper>
	//*   2    4:return          
	}
}
