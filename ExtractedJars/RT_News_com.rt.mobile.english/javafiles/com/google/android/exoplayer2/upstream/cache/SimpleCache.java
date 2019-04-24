// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import android.util.Log;
import com.google.android.exoplayer2.util.Assertions;
import java.io.File;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.upstream.cache:
//			Cache, CachedContentIndex, SimpleCacheSpan, CachedContent, 
//			CacheEvictor, CacheSpan, ContentMetadataInternal, ContentMetadataMutations, 
//			ContentMetadata

public final class SimpleCache
	implements Cache
{

	public SimpleCache(File file, CacheEvictor cacheevictor)
	{
		this(file, cacheevictor, ((byte []) (null)), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:iconst_0        
	//    5    5:invokespecial   #43  <Method void SimpleCache(File, CacheEvictor, byte[], boolean)>
	//    6    8:return          
	}

	SimpleCache(File file, CacheEvictor cacheevictor, CachedContentIndex cachedcontentindex)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		if(!lockFolder(file))
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #49  <Method boolean lockFolder(File)>
	//*   4    8:ifne            44
		{
			cacheevictor = ((CacheEvictor) (new StringBuilder()));
	//    5   11:new             #51  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #52  <Method void StringBuilder()>
	//    8   18:astore_2        
			((StringBuilder) (cacheevictor)).append("Another SimpleCache instance uses the folder: ");
	//    9   19:aload_2         
	//   10   20:ldc1            #54  <String "Another SimpleCache instance uses the folder: ">
	//   11   22:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
			((StringBuilder) (cacheevictor)).append(((Object) (file)));
	//   13   26:aload_2         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #61  <Method StringBuilder StringBuilder.append(Object)>
	//   16   31:pop             
			throw new IllegalStateException(((StringBuilder) (cacheevictor)).toString());
	//   17   32:new             #63  <Class IllegalStateException>
	//   18   35:dup             
	//   19   36:aload_2         
	//   20   37:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   21   40:invokespecial   #70  <Method void IllegalStateException(String)>
	//   22   43:athrow          
		} else
		{
			cacheDir = file;
	//   23   44:aload_0         
	//   24   45:aload_1         
	//   25   46:putfield        #72  <Field File cacheDir>
			evictor = cacheevictor;
	//   26   49:aload_0         
	//   27   50:aload_2         
	//   28   51:putfield        #74  <Field CacheEvictor evictor>
			index = cachedcontentindex;
	//   29   54:aload_0         
	//   30   55:aload_3         
	//   31   56:putfield        #76  <Field CachedContentIndex index>
			listeners = new HashMap();
	//   32   59:aload_0         
	//   33   60:new             #78  <Class HashMap>
	//   34   63:dup             
	//   35   64:invokespecial   #79  <Method void HashMap()>
	//   36   67:putfield        #81  <Field HashMap listeners>
			file = ((File) (new ConditionVariable()));
	//   37   70:new             #83  <Class ConditionVariable>
	//   38   73:dup             
	//   39   74:invokespecial   #84  <Method void ConditionVariable()>
	//   40   77:astore_1        
			((_cls1) (new Thread(((ConditionVariable) (file))) {

				public void run()
				{
					synchronized(SimpleCache.this)
				//*   0    0:aload_0         
				//*   1    1:getfield        #16  <Field SimpleCache this$0>
				//*   2    4:astore_1        
				//*   3    5:aload_1         
				//*   4    6:monitorenter    
					{
						conditionVariable.open();
				//    5    7:aload_0         
				//    6    8:getfield        #18  <Field ConditionVariable val$conditionVariable>
				//    7   11:invokevirtual   #29  <Method void ConditionVariable.open()>
						initialize();
				//    8   14:aload_0         
				//    9   15:getfield        #16  <Field SimpleCache this$0>
				//   10   18:invokestatic    #33  <Method void SimpleCache.access$000(SimpleCache)>
						evictor.onCacheInitialized();
				//   11   21:aload_0         
				//   12   22:getfield        #16  <Field SimpleCache this$0>
				//   13   25:invokestatic    #37  <Method CacheEvictor SimpleCache.access$100(SimpleCache)>
				//   14   28:invokeinterface #42  <Method void CacheEvictor.onCacheInitialized()>
					}
				//   15   33:aload_1         
				//   16   34:monitorexit     
					return;
				//   17   35:return          
					exception;
				//   18   36:astore_2        
					simplecache;
				//   19   37:aload_1         
					JVM INSTR monitorexit ;
				//   20   38:monitorexit     
					throw exception;
				//   21   39:aload_2         
				//   22   40:athrow          
				}

				final SimpleCache this$0;
				final ConditionVariable val$conditionVariable;

			
			{
				this$0 = SimpleCache.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field SimpleCache this$0>
				conditionVariable = conditionvariable;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #18  <Field ConditionVariable val$conditionVariable>
				super(final_s);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:invokespecial   #21  <Method void Thread(String)>
			//    9   15:return          
			}
			}
)).start();
	//   41   78:new             #8   <Class SimpleCache$1>
	//   42   81:dup             
	//   43   82:aload_0         
	//   44   83:ldc1            #86  <String "SimpleCache.initialize()">
	//   45   85:aload_1         
	//   46   86:invokespecial   #89  <Method void SimpleCache$1(SimpleCache, String, ConditionVariable)>
	//   47   89:invokevirtual   #92  <Method void SimpleCache$1.start()>
			((ConditionVariable) (file)).block();
	//   48   92:aload_1         
	//   49   93:invokevirtual   #95  <Method void ConditionVariable.block()>
			return;
	//   50   96:return          
		}
	}

	public SimpleCache(File file, CacheEvictor cacheevictor, byte abyte0[])
	{
		boolean flag;
		if(abyte0 != null)
	//*   0    0:aload_3         
	//*   1    1:ifnull          10
			flag = true;
	//    2    4:iconst_1        
	//    3    5:istore          4
		else
	//*   4    7:goto            13
			flag = false;
	//    5   10:iconst_0        
	//    6   11:istore          4
		this(file, cacheevictor, abyte0, flag);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:aload_3         
	//   11   17:iload           4
	//   12   19:invokespecial   #43  <Method void SimpleCache(File, CacheEvictor, byte[], boolean)>
	//   13   22:return          
	}

	public SimpleCache(File file, CacheEvictor cacheevictor, byte abyte0[], boolean flag)
	{
		this(file, cacheevictor, new CachedContentIndex(file, abyte0, flag));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #98  <Class CachedContentIndex>
	//    4    6:dup             
	//    5    7:aload_1         
	//    6    8:aload_3         
	//    7    9:iload           4
	//    8   11:invokespecial   #101 <Method void CachedContentIndex(File, byte[], boolean)>
	//    9   14:invokespecial   #103 <Method void SimpleCache(File, CacheEvictor, CachedContentIndex)>
	//   10   17:return          
	}

	private void addSpan(SimpleCacheSpan simplecachespan)
	{
		index.getOrAdd(simplecachespan.key).addSpan(simplecachespan);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field CachedContentIndex index>
	//    2    4:aload_1         
	//    3    5:getfield        #117 <Field String SimpleCacheSpan.key>
	//    4    8:invokevirtual   #121 <Method CachedContent CachedContentIndex.getOrAdd(String)>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #125 <Method void CachedContent.addSpan(SimpleCacheSpan)>
		totalSpace = totalSpace + simplecachespan.length;
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #127 <Field long totalSpace>
	//   10   20:aload_1         
	//   11   21:getfield        #130 <Field long SimpleCacheSpan.length>
	//   12   24:ladd            
	//   13   25:putfield        #127 <Field long totalSpace>
		notifySpanAdded(simplecachespan);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokespecial   #133 <Method void notifySpanAdded(SimpleCacheSpan)>
	//   17   33:return          
	}

	public static void disableCacheFolderLocking()
	{
		com/google/android/exoplayer2/upstream/cache/SimpleCache;
	//    0    0:ldc1            #2   <Class SimpleCache>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		cacheFolderLockingDisabled = true;
	//    2    3:iconst_1        
	//    3    4:putstatic       #137 <Field boolean cacheFolderLockingDisabled>
		lockedCacheDirs.clear();
	//    4    7:getstatic       #38  <Field HashSet lockedCacheDirs>
	//    5   10:invokevirtual   #140 <Method void HashSet.clear()>
		com/google/android/exoplayer2/upstream/cache/SimpleCache;
	//    6   13:ldc1            #2   <Class SimpleCache>
		JVM INSTR monitorexit ;
	//    7   15:monitorexit     
		return;
	//    8   16:return          
		Exception exception;
		exception;
	//    9   17:astore_0        
	//*  10   18:ldc1            #2   <Class SimpleCache>
		throw exception;
	//   11   20:monitorexit     
	//   12   21:aload_0         
	//   13   22:athrow          
	}

	private SimpleCacheSpan getSpan(String s, long l)
		throws Cache.CacheException
	{
		CachedContent cachedcontent = index.get(s);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field CachedContentIndex index>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #148 <Method CachedContent CachedContentIndex.get(String)>
	//    4    8:astore          4
		if(cachedcontent == null)
	//*   5   10:aload           4
	//*   6   12:ifnonnull       21
			return SimpleCacheSpan.createOpenHole(s, l);
	//    7   15:aload_1         
	//    8   16:lload_2         
	//    9   17:invokestatic    #151 <Method SimpleCacheSpan SimpleCacheSpan.createOpenHole(String, long)>
	//   10   20:areturn         
		do
		{
			s = ((String) (cachedcontent.getSpan(l)));
	//   11   21:aload           4
	//   12   23:lload_2         
	//   13   24:invokevirtual   #154 <Method SimpleCacheSpan CachedContent.getSpan(long)>
	//   14   27:astore_1        
			if(((SimpleCacheSpan) (s)).isCached && !((SimpleCacheSpan) (s)).file.exists())
	//*  15   28:aload_1         
	//*  16   29:getfield        #157 <Field boolean SimpleCacheSpan.isCached>
	//*  17   32:ifeq            52
	//*  18   35:aload_1         
	//*  19   36:getfield        #160 <Field File SimpleCacheSpan.file>
	//*  20   39:invokevirtual   #166 <Method boolean File.exists()>
	//*  21   42:ifne            52
				removeStaleSpansAndCachedContents();
	//   22   45:aload_0         
	//   23   46:invokespecial   #169 <Method void removeStaleSpansAndCachedContents()>
			else
	//*  24   49:goto            21
				return ((SimpleCacheSpan) (s));
	//   25   52:aload_1         
	//   26   53:areturn         
		} while(true);
	}

	private void initialize()
	{
		if(!cacheDir.exists())
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field File cacheDir>
	//*   2    4:invokevirtual   #166 <Method boolean File.exists()>
	//*   3    7:ifne            19
		{
			cacheDir.mkdirs();
	//    4   10:aload_0         
	//    5   11:getfield        #72  <Field File cacheDir>
	//    6   14:invokevirtual   #173 <Method boolean File.mkdirs()>
	//    7   17:pop             
			return;
	//    8   18:return          
		}
		index.load();
	//    9   19:aload_0         
	//   10   20:getfield        #76  <Field CachedContentIndex index>
	//   11   23:invokevirtual   #176 <Method void CachedContentIndex.load()>
		File afile[] = cacheDir.listFiles();
	//   12   26:aload_0         
	//   13   27:getfield        #72  <Field File cacheDir>
	//   14   30:invokevirtual   #180 <Method File[] File.listFiles()>
	//   15   33:astore          4
		if(afile == null)
	//*  16   35:aload           4
	//*  17   37:ifnonnull       41
			return;
	//   18   40:return          
		int j = afile.length;
	//   19   41:aload           4
	//   20   43:arraylength     
	//   21   44:istore_2        
		for(int i = 0; i < j; i++)
	//*  22   45:iconst_0        
	//*  23   46:istore_1        
	//*  24   47:iload_1         
	//*  25   48:iload_2         
	//*  26   49:icmpge          124
		{
			File file = afile[i];
	//   27   52:aload           4
	//   28   54:iload_1         
	//   29   55:aaload          
	//   30   56:astore          5
			if(file.getName().equals("cached_content_index.exi"))
	//*  31   58:aload           5
	//*  32   60:invokevirtual   #183 <Method String File.getName()>
	//*  33   63:ldc1            #185 <String "cached_content_index.exi">
	//*  34   65:invokevirtual   #191 <Method boolean String.equals(Object)>
	//*  35   68:ifeq            74
				continue;
	//   36   71:goto            117
			SimpleCacheSpan simplecachespan;
			if(file.length() > 0L)
	//*  37   74:aload           5
	//*  38   76:invokevirtual   #194 <Method long File.length()>
	//*  39   79:lconst_0        
	//*  40   80:lcmp            
	//*  41   81:ifle            97
				simplecachespan = SimpleCacheSpan.createCacheEntry(file, index);
	//   42   84:aload           5
	//   43   86:aload_0         
	//   44   87:getfield        #76  <Field CachedContentIndex index>
	//   45   90:invokestatic    #198 <Method SimpleCacheSpan SimpleCacheSpan.createCacheEntry(File, CachedContentIndex)>
	//   46   93:astore_3        
			else
	//*  47   94:goto            99
				simplecachespan = null;
	//   48   97:aconst_null     
	//   49   98:astore_3        
			if(simplecachespan != null)
	//*  50   99:aload_3         
	//*  51  100:ifnull          111
				addSpan(simplecachespan);
	//   52  103:aload_0         
	//   53  104:aload_3         
	//   54  105:invokespecial   #199 <Method void addSpan(SimpleCacheSpan)>
			else
	//*  55  108:goto            117
				file.delete();
	//   56  111:aload           5
	//   57  113:invokevirtual   #202 <Method boolean File.delete()>
	//   58  116:pop             
		}

	//   59  117:iload_1         
	//   60  118:iconst_1        
	//   61  119:iadd            
	//   62  120:istore_1        
	//*  63  121:goto            47
		index.removeEmpty();
	//   64  124:aload_0         
	//   65  125:getfield        #76  <Field CachedContentIndex index>
	//   66  128:invokevirtual   #205 <Method void CachedContentIndex.removeEmpty()>
		try
		{
			index.store();
	//   67  131:aload_0         
	//   68  132:getfield        #76  <Field CachedContentIndex index>
	//   69  135:invokevirtual   #208 <Method void CachedContentIndex.store()>
			return;
	//   70  138:return          
		}
		catch(Cache.CacheException cacheexception)
	//*  71  139:astore_3        
		{
			Log.e("SimpleCache", "Storing index file failed", ((Throwable) (cacheexception)));
	//   72  140:ldc1            #12  <String "SimpleCache">
	//   73  142:ldc1            #210 <String "Storing index file failed">
	//   74  144:aload_3         
	//   75  145:invokestatic    #216 <Method int Log.e(String, String, Throwable)>
	//   76  148:pop             
		}
	//   77  149:return          
	}

	public static boolean isCacheFolderLocked(File file)
	{
		com/google/android/exoplayer2/upstream/cache/SimpleCache;
	//    0    0:ldc1            #2   <Class SimpleCache>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		boolean flag = lockedCacheDirs.contains(((Object) (file.getAbsoluteFile())));
	//    2    3:getstatic       #38  <Field HashSet lockedCacheDirs>
	//    3    6:aload_0         
	//    4    7:invokevirtual   #221 <Method File File.getAbsoluteFile()>
	//    5   10:invokevirtual   #224 <Method boolean HashSet.contains(Object)>
	//    6   13:istore_1        
		com/google/android/exoplayer2/upstream/cache/SimpleCache;
	//    7   14:ldc1            #2   <Class SimpleCache>
		JVM INSTR monitorexit ;
	//    8   16:monitorexit     
		return flag;
	//    9   17:iload_1         
	//   10   18:ireturn         
		file;
	//   11   19:astore_0        
	//*  12   20:ldc1            #2   <Class SimpleCache>
		throw file;
	//   13   22:monitorexit     
	//   14   23:aload_0         
	//   15   24:athrow          
	}

	private static boolean lockFolder(File file)
	{
		com/google/android/exoplayer2/upstream/cache/SimpleCache;
	//    0    0:ldc1            #2   <Class SimpleCache>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		boolean flag = cacheFolderLockingDisabled;
	//    2    3:getstatic       #137 <Field boolean cacheFolderLockingDisabled>
	//    3    6:istore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_16;
	//    4    7:iload_1         
	//    5    8:ifeq            16
		com/google/android/exoplayer2/upstream/cache/SimpleCache;
	//    6   11:ldc1            #2   <Class SimpleCache>
		JVM INSTR monitorexit ;
	//    7   13:monitorexit     
		return true;
	//    8   14:iconst_1        
	//    9   15:ireturn         
		flag = lockedCacheDirs.add(((Object) (file.getAbsoluteFile())));
	//   10   16:getstatic       #38  <Field HashSet lockedCacheDirs>
	//   11   19:aload_0         
	//   12   20:invokevirtual   #221 <Method File File.getAbsoluteFile()>
	//   13   23:invokevirtual   #227 <Method boolean HashSet.add(Object)>
	//   14   26:istore_1        
		com/google/android/exoplayer2/upstream/cache/SimpleCache;
	//   15   27:ldc1            #2   <Class SimpleCache>
		JVM INSTR monitorexit ;
	//   16   29:monitorexit     
		return flag;
	//   17   30:iload_1         
	//   18   31:ireturn         
		file;
	//   19   32:astore_0        
	//*  20   33:ldc1            #2   <Class SimpleCache>
		throw file;
	//   21   35:monitorexit     
	//   22   36:aload_0         
	//   23   37:athrow          
	}

	private void notifySpanAdded(SimpleCacheSpan simplecachespan)
	{
		ArrayList arraylist = (ArrayList)listeners.get(((Object) (simplecachespan.key)));
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field HashMap listeners>
	//    2    4:aload_1         
	//    3    5:getfield        #117 <Field String SimpleCacheSpan.key>
	//    4    8:invokevirtual   #230 <Method Object HashMap.get(Object)>
	//    5   11:checkcast       #232 <Class ArrayList>
	//    6   14:astore_3        
		if(arraylist != null)
	//*   7   15:aload_3         
	//*   8   16:ifnull          52
		{
			for(int i = arraylist.size() - 1; i >= 0; i--)
	//*   9   19:aload_3         
	//*  10   20:invokevirtual   #236 <Method int ArrayList.size()>
	//*  11   23:iconst_1        
	//*  12   24:isub            
	//*  13   25:istore_2        
	//*  14   26:iload_2         
	//*  15   27:iflt            52
				((Cache.Listener)arraylist.get(i)).onSpanAdded(((Cache) (this)), ((CacheSpan) (simplecachespan)));
	//   16   30:aload_3         
	//   17   31:iload_2         
	//   18   32:invokevirtual   #239 <Method Object ArrayList.get(int)>
	//   19   35:checkcast       #241 <Class Cache$Listener>
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:invokeinterface #245 <Method void Cache$Listener.onSpanAdded(Cache, CacheSpan)>

	//   23   45:iload_2         
	//   24   46:iconst_1        
	//   25   47:isub            
	//   26   48:istore_2        
		}
	//*  27   49:goto            26
		evictor.onSpanAdded(((Cache) (this)), ((CacheSpan) (simplecachespan)));
	//   28   52:aload_0         
	//   29   53:getfield        #74  <Field CacheEvictor evictor>
	//   30   56:aload_0         
	//   31   57:aload_1         
	//   32   58:invokeinterface #248 <Method void CacheEvictor.onSpanAdded(Cache, CacheSpan)>
	//   33   63:return          
	}

	private void notifySpanRemoved(CacheSpan cachespan)
	{
		ArrayList arraylist = (ArrayList)listeners.get(((Object) (cachespan.key)));
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field HashMap listeners>
	//    2    4:aload_1         
	//    3    5:getfield        #253 <Field String CacheSpan.key>
	//    4    8:invokevirtual   #230 <Method Object HashMap.get(Object)>
	//    5   11:checkcast       #232 <Class ArrayList>
	//    6   14:astore_3        
		if(arraylist != null)
	//*   7   15:aload_3         
	//*   8   16:ifnull          52
		{
			for(int i = arraylist.size() - 1; i >= 0; i--)
	//*   9   19:aload_3         
	//*  10   20:invokevirtual   #236 <Method int ArrayList.size()>
	//*  11   23:iconst_1        
	//*  12   24:isub            
	//*  13   25:istore_2        
	//*  14   26:iload_2         
	//*  15   27:iflt            52
				((Cache.Listener)arraylist.get(i)).onSpanRemoved(((Cache) (this)), cachespan);
	//   16   30:aload_3         
	//   17   31:iload_2         
	//   18   32:invokevirtual   #239 <Method Object ArrayList.get(int)>
	//   19   35:checkcast       #241 <Class Cache$Listener>
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:invokeinterface #256 <Method void Cache$Listener.onSpanRemoved(Cache, CacheSpan)>

	//   23   45:iload_2         
	//   24   46:iconst_1        
	//   25   47:isub            
	//   26   48:istore_2        
		}
	//*  27   49:goto            26
		evictor.onSpanRemoved(((Cache) (this)), cachespan);
	//   28   52:aload_0         
	//   29   53:getfield        #74  <Field CacheEvictor evictor>
	//   30   56:aload_0         
	//   31   57:aload_1         
	//   32   58:invokeinterface #257 <Method void CacheEvictor.onSpanRemoved(Cache, CacheSpan)>
	//   33   63:return          
	}

	private void notifySpanTouched(SimpleCacheSpan simplecachespan, CacheSpan cachespan)
	{
		ArrayList arraylist = (ArrayList)listeners.get(((Object) (simplecachespan.key)));
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field HashMap listeners>
	//    2    4:aload_1         
	//    3    5:getfield        #117 <Field String SimpleCacheSpan.key>
	//    4    8:invokevirtual   #230 <Method Object HashMap.get(Object)>
	//    5   11:checkcast       #232 <Class ArrayList>
	//    6   14:astore          4
		if(arraylist != null)
	//*   7   16:aload           4
	//*   8   18:ifnull          57
		{
			for(int i = arraylist.size() - 1; i >= 0; i--)
	//*   9   21:aload           4
	//*  10   23:invokevirtual   #236 <Method int ArrayList.size()>
	//*  11   26:iconst_1        
	//*  12   27:isub            
	//*  13   28:istore_3        
	//*  14   29:iload_3         
	//*  15   30:iflt            57
				((Cache.Listener)arraylist.get(i)).onSpanTouched(((Cache) (this)), ((CacheSpan) (simplecachespan)), cachespan);
	//   16   33:aload           4
	//   17   35:iload_3         
	//   18   36:invokevirtual   #239 <Method Object ArrayList.get(int)>
	//   19   39:checkcast       #241 <Class Cache$Listener>
	//   20   42:aload_0         
	//   21   43:aload_1         
	//   22   44:aload_2         
	//   23   45:invokeinterface #263 <Method void Cache$Listener.onSpanTouched(Cache, CacheSpan, CacheSpan)>

	//   24   50:iload_3         
	//   25   51:iconst_1        
	//   26   52:isub            
	//   27   53:istore_3        
		}
	//*  28   54:goto            29
		evictor.onSpanTouched(((Cache) (this)), ((CacheSpan) (simplecachespan)), cachespan);
	//   29   57:aload_0         
	//   30   58:getfield        #74  <Field CacheEvictor evictor>
	//   31   61:aload_0         
	//   32   62:aload_1         
	//   33   63:aload_2         
	//   34   64:invokeinterface #264 <Method void CacheEvictor.onSpanTouched(Cache, CacheSpan, CacheSpan)>
	//   35   69:return          
	}

	private void removeSpan(CacheSpan cachespan, boolean flag)
		throws Cache.CacheException
	{
		CachedContent cachedcontent;
		cachedcontent = index.get(cachespan.key);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field CachedContentIndex index>
	//    2    4:aload_1         
	//    3    5:getfield        #253 <Field String CacheSpan.key>
	//    4    8:invokevirtual   #148 <Method CachedContent CachedContentIndex.get(String)>
	//    5   11:astore_3        
		if(cachedcontent == null)
			break MISSING_BLOCK_LABEL_77;
	//    6   12:aload_3         
	//    7   13:ifnull          77
		if(!cachedcontent.removeSpan(cachespan))
	//*   8   16:aload_3         
	//*   9   17:aload_1         
	//*  10   18:invokevirtual   #269 <Method boolean CachedContent.removeSpan(CacheSpan)>
	//*  11   21:ifne            25
			return;
	//   12   24:return          
		totalSpace = totalSpace - cachespan.length;
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #127 <Field long totalSpace>
	//   16   30:aload_1         
	//   17   31:getfield        #270 <Field long CacheSpan.length>
	//   18   34:lsub            
	//   19   35:putfield        #127 <Field long totalSpace>
		if(!flag)
			break MISSING_BLOCK_LABEL_71;
	//   20   38:iload_2         
	//   21   39:ifeq            71
		index.maybeRemove(cachedcontent.key);
	//   22   42:aload_0         
	//   23   43:getfield        #76  <Field CachedContentIndex index>
	//   24   46:aload_3         
	//   25   47:getfield        #271 <Field String CachedContent.key>
	//   26   50:invokevirtual   #274 <Method void CachedContentIndex.maybeRemove(String)>
		index.store();
	//   27   53:aload_0         
	//   28   54:getfield        #76  <Field CachedContentIndex index>
	//   29   57:invokevirtual   #208 <Method void CachedContentIndex.store()>
		break MISSING_BLOCK_LABEL_71;
	//   30   60:goto            71
		Exception exception;
		exception;
	//   31   63:astore_3        
		notifySpanRemoved(cachespan);
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:invokespecial   #276 <Method void notifySpanRemoved(CacheSpan)>
		throw exception;
	//   35   69:aload_3         
	//   36   70:athrow          
		notifySpanRemoved(cachespan);
	//   37   71:aload_0         
	//   38   72:aload_1         
	//   39   73:invokespecial   #276 <Method void notifySpanRemoved(CacheSpan)>
		return;
	//   40   76:return          
	//   41   77:return          
	}

	private void removeStaleSpansAndCachedContents()
		throws Cache.CacheException
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #232 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #277 <Method void ArrayList()>
	//    3    7:astore_2        
		for(Iterator iterator = index.getAll().iterator(); iterator.hasNext();)
	//*   4    8:aload_0         
	//*   5    9:getfield        #76  <Field CachedContentIndex index>
	//*   6   12:invokevirtual   #281 <Method Collection CachedContentIndex.getAll()>
	//*   7   15:invokeinterface #287 <Method Iterator Collection.iterator()>
	//*   8   20:astore_3        
	//*   9   21:aload_3         
	//*  10   22:invokeinterface #292 <Method boolean Iterator.hasNext()>
	//*  11   27:ifeq            90
		{
			Iterator iterator1 = ((CachedContent)iterator.next()).getSpans().iterator();
	//   12   30:aload_3         
	//   13   31:invokeinterface #296 <Method Object Iterator.next()>
	//   14   36:checkcast       #123 <Class CachedContent>
	//   15   39:invokevirtual   #300 <Method TreeSet CachedContent.getSpans()>
	//   16   42:invokevirtual   #303 <Method Iterator TreeSet.iterator()>
	//   17   45:astore          4
			while(iterator1.hasNext()) 
	//*  18   47:aload           4
	//*  19   49:invokeinterface #292 <Method boolean Iterator.hasNext()>
	//*  20   54:ifeq            21
			{
				CacheSpan cachespan = (CacheSpan)iterator1.next();
	//   21   57:aload           4
	//   22   59:invokeinterface #296 <Method Object Iterator.next()>
	//   23   64:checkcast       #252 <Class CacheSpan>
	//   24   67:astore          5
				if(!cachespan.file.exists())
	//*  25   69:aload           5
	//*  26   71:getfield        #304 <Field File CacheSpan.file>
	//*  27   74:invokevirtual   #166 <Method boolean File.exists()>
	//*  28   77:ifne            47
					arraylist.add(((Object) (cachespan)));
	//   29   80:aload_2         
	//   30   81:aload           5
	//   31   83:invokevirtual   #305 <Method boolean ArrayList.add(Object)>
	//   32   86:pop             
			}
		}

	//*  33   87:goto            47
		for(int i = 0; i < arraylist.size(); i++)
	//*  34   90:iconst_0        
	//*  35   91:istore_1        
	//*  36   92:iload_1         
	//*  37   93:aload_2         
	//*  38   94:invokevirtual   #236 <Method int ArrayList.size()>
	//*  39   97:icmpge          120
			removeSpan((CacheSpan)arraylist.get(i), false);
	//   40  100:aload_0         
	//   41  101:aload_2         
	//   42  102:iload_1         
	//   43  103:invokevirtual   #239 <Method Object ArrayList.get(int)>
	//   44  106:checkcast       #252 <Class CacheSpan>
	//   45  109:iconst_0        
	//   46  110:invokespecial   #307 <Method void removeSpan(CacheSpan, boolean)>

	//   47  113:iload_1         
	//   48  114:iconst_1        
	//   49  115:iadd            
	//   50  116:istore_1        
	//*  51  117:goto            92
		index.removeEmpty();
	//   52  120:aload_0         
	//   53  121:getfield        #76  <Field CachedContentIndex index>
	//   54  124:invokevirtual   #205 <Method void CachedContentIndex.removeEmpty()>
		index.store();
	//   55  127:aload_0         
	//   56  128:getfield        #76  <Field CachedContentIndex index>
	//   57  131:invokevirtual   #208 <Method void CachedContentIndex.store()>
	//   58  134:return          
	}

	private static void unlockFolder(File file)
	{
		com/google/android/exoplayer2/upstream/cache/SimpleCache;
	//    0    0:ldc1            #2   <Class SimpleCache>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(!cacheFolderLockingDisabled)
	//*   2    3:getstatic       #137 <Field boolean cacheFolderLockingDisabled>
	//*   3    6:ifne            20
			lockedCacheDirs.remove(((Object) (file.getAbsoluteFile())));
	//    4    9:getstatic       #38  <Field HashSet lockedCacheDirs>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #221 <Method File File.getAbsoluteFile()>
	//    7   16:invokevirtual   #312 <Method boolean HashSet.remove(Object)>
	//    8   19:pop             
		com/google/android/exoplayer2/upstream/cache/SimpleCache;
	//    9   20:ldc1            #2   <Class SimpleCache>
		JVM INSTR monitorexit ;
	//   10   22:monitorexit     
		return;
	//   11   23:return          
		file;
	//   12   24:astore_0        
	//*  13   25:ldc1            #2   <Class SimpleCache>
		throw file;
	//   14   27:monitorexit     
	//   15   28:aload_0         
	//   16   29:athrow          
	}

	public NavigableSet addListener(String s, Cache.Listener listener)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ArrayList arraylist1;
		Assertions.checkState(released ^ true);
	//    2    2:aload_0         
	//    3    3:getfield        #316 <Field boolean released>
	//    4    6:iconst_1        
	//    5    7:ixor            
	//    6    8:invokestatic    #322 <Method void Assertions.checkState(boolean)>
		arraylist1 = (ArrayList)listeners.get(((Object) (s)));
	//    7   11:aload_0         
	//    8   12:getfield        #81  <Field HashMap listeners>
	//    9   15:aload_1         
	//   10   16:invokevirtual   #230 <Method Object HashMap.get(Object)>
	//   11   19:checkcast       #232 <Class ArrayList>
	//   12   22:astore          4
		ArrayList arraylist;
		arraylist = arraylist1;
	//   13   24:aload           4
	//   14   26:astore_3        
		if(arraylist1 != null)
			break MISSING_BLOCK_LABEL_50;
	//   15   27:aload           4
	//   16   29:ifnonnull       50
		arraylist = new ArrayList();
	//   17   32:new             #232 <Class ArrayList>
	//   18   35:dup             
	//   19   36:invokespecial   #277 <Method void ArrayList()>
	//   20   39:astore_3        
		listeners.put(((Object) (s)), ((Object) (arraylist)));
	//   21   40:aload_0         
	//   22   41:getfield        #81  <Field HashMap listeners>
	//   23   44:aload_1         
	//   24   45:aload_3         
	//   25   46:invokevirtual   #326 <Method Object HashMap.put(Object, Object)>
	//   26   49:pop             
		arraylist.add(((Object) (listener)));
	//   27   50:aload_3         
	//   28   51:aload_2         
	//   29   52:invokevirtual   #305 <Method boolean ArrayList.add(Object)>
	//   30   55:pop             
		s = ((String) (getCachedSpans(s)));
	//   31   56:aload_0         
	//   32   57:aload_1         
	//   33   58:invokevirtual   #330 <Method NavigableSet getCachedSpans(String)>
	//   34   61:astore_1        
		this;
	//   35   62:aload_0         
		JVM INSTR monitorexit ;
	//   36   63:monitorexit     
		return ((NavigableSet) (s));
	//   37   64:aload_1         
	//   38   65:areturn         
		s;
	//   39   66:astore_1        
	//*  40   67:aload_0         
		throw s;
	//   41   68:monitorexit     
	//   42   69:aload_1         
	//   43   70:athrow          
	}

	public void applyContentMetadataMutations(String s, ContentMetadataMutations contentmetadatamutations)
		throws Cache.CacheException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Assertions.checkState(released ^ true);
	//    2    2:aload_0         
	//    3    3:getfield        #316 <Field boolean released>
	//    4    6:iconst_1        
	//    5    7:ixor            
	//    6    8:invokestatic    #322 <Method void Assertions.checkState(boolean)>
		index.applyContentMetadataMutations(s, contentmetadatamutations);
	//    7   11:aload_0         
	//    8   12:getfield        #76  <Field CachedContentIndex index>
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokevirtual   #336 <Method void CachedContentIndex.applyContentMetadataMutations(String, ContentMetadataMutations)>
		index.store();
	//   12   20:aload_0         
	//   13   21:getfield        #76  <Field CachedContentIndex index>
	//   14   24:invokevirtual   #208 <Method void CachedContentIndex.store()>
		this;
	//   15   27:aload_0         
		JVM INSTR monitorexit ;
	//   16   28:monitorexit     
		return;
	//   17   29:return          
		s;
	//   18   30:astore_1        
	//*  19   31:aload_0         
		throw s;
	//   20   32:monitorexit     
	//   21   33:aload_1         
	//   22   34:athrow          
	}

	public void commitFile(File file)
		throws Cache.CacheException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = released;
	//    2    2:aload_0         
	//    3    3:getfield        #316 <Field boolean released>
	//    4    6:istore_2        
		boolean flag1 = true;
	//    5    7:iconst_1        
	//    6    8:istore_3        
		SimpleCacheSpan simplecachespan;
		Assertions.checkState(flag ^ true);
	//    7    9:iload_2         
	//    8   10:iconst_1        
	//    9   11:ixor            
	//   10   12:invokestatic    #322 <Method void Assertions.checkState(boolean)>
		simplecachespan = SimpleCacheSpan.createCacheEntry(file, index);
	//   11   15:aload_1         
	//   12   16:aload_0         
	//   13   17:getfield        #76  <Field CachedContentIndex index>
	//   14   20:invokestatic    #198 <Method SimpleCacheSpan SimpleCacheSpan.createCacheEntry(File, CachedContentIndex)>
	//   15   23:astore          6
		long l;
		CachedContent cachedcontent;
		if(simplecachespan != null)
	//*  16   25:aload           6
	//*  17   27:ifnull          166
			flag = true;
	//   18   30:iconst_1        
	//   19   31:istore_2        
		else
	//*  20   32:goto            35
	//*  21   35:iload_2         
	//*  22   36:invokestatic    #322 <Method void Assertions.checkState(boolean)>
	//*  23   39:aload_0         
	//*  24   40:getfield        #76  <Field CachedContentIndex index>
	//*  25   43:aload           6
	//*  26   45:getfield        #117 <Field String SimpleCacheSpan.key>
	//*  27   48:invokevirtual   #148 <Method CachedContent CachedContentIndex.get(String)>
	//*  28   51:astore          7
	//*  29   53:aload           7
	//*  30   55:invokestatic    #340 <Method Object Assertions.checkNotNull(Object)>
	//*  31   58:pop             
	//*  32   59:aload           7
	//*  33   61:invokevirtual   #343 <Method boolean CachedContent.isLocked()>
	//*  34   64:invokestatic    #322 <Method void Assertions.checkState(boolean)>
	//*  35   67:aload_1         
	//*  36   68:invokevirtual   #166 <Method boolean File.exists()>
	//*  37   71:istore_2        
	//*  38   72:iload_2         
	//*  39   73:ifne            79
	//*  40   76:aload_0         
	//*  41   77:monitorexit     
	//*  42   78:return          
	//*  43   79:aload_1         
	//*  44   80:invokevirtual   #194 <Method long File.length()>
	//*  45   83:lconst_0        
	//*  46   84:lcmp            
	//*  47   85:ifne            96
	//*  48   88:aload_1         
	//*  49   89:invokevirtual   #202 <Method boolean File.delete()>
	//*  50   92:pop             
	//*  51   93:aload_0         
	//*  52   94:monitorexit     
	//*  53   95:return          
	//*  54   96:aload           7
	//*  55   98:invokevirtual   #347 <Method ContentMetadata CachedContent.getMetadata()>
	//*  56  101:invokestatic    #353 <Method long ContentMetadataInternal.getContentLength(ContentMetadata)>
	//*  57  104:lstore          4
	//*  58  106:lload           4
	//*  59  108:ldc2w           #354 <Long -1L>
	//*  60  111:lcmp            
	//*  61  112:ifeq            141
	//*  62  115:aload           6
	//*  63  117:getfield        #358 <Field long SimpleCacheSpan.position>
	//*  64  120:aload           6
	//*  65  122:getfield        #130 <Field long SimpleCacheSpan.length>
	//*  66  125:ladd            
	//*  67  126:lload           4
	//*  68  128:lcmp            
	//*  69  129:ifgt            171
	//*  70  132:iload_3         
	//*  71  133:istore_2        
	//*  72  134:goto            137
	//*  73  137:iload_2         
	//*  74  138:invokestatic    #322 <Method void Assertions.checkState(boolean)>
	//*  75  141:aload_0         
	//*  76  142:aload           6
	//*  77  144:invokespecial   #199 <Method void addSpan(SimpleCacheSpan)>
	//*  78  147:aload_0         
	//*  79  148:getfield        #76  <Field CachedContentIndex index>
	//*  80  151:invokevirtual   #208 <Method void CachedContentIndex.store()>
	//*  81  154:aload_0         
	//*  82  155:invokevirtual   #361 <Method void Object.notifyAll()>
	//*  83  158:aload_0         
	//*  84  159:monitorexit     
	//*  85  160:return          
	//*  86  161:astore_1        
	//*  87  162:aload_0         
	//*  88  163:monitorexit     
	//*  89  164:aload_1         
	//*  90  165:athrow          
			flag = false;
	//   91  166:iconst_0        
	//   92  167:istore_2        
		Assertions.checkState(flag);
		cachedcontent = index.get(simplecachespan.key);
		Assertions.checkNotNull(((Object) (cachedcontent)));
		Assertions.checkState(cachedcontent.isLocked());
		flag = file.exists();
		if(flag)
			break MISSING_BLOCK_LABEL_79;
		this;
		JVM INSTR monitorexit ;
		return;
		if(file.length() != 0L)
			break MISSING_BLOCK_LABEL_96;
		file.delete();
		this;
		JVM INSTR monitorexit ;
		return;
		l = ContentMetadataInternal.getContentLength(cachedcontent.getMetadata());
		if(l == -1L)
			break MISSING_BLOCK_LABEL_141;
		if(simplecachespan.position + simplecachespan.length <= l)
			flag = flag1;
		else
	//*  93  168:goto            35
			flag = false;
	//   94  171:iconst_0        
	//   95  172:istore_2        
		Assertions.checkState(flag);
		addSpan(simplecachespan);
		index.store();
		((Object)this).notifyAll();
		this;
		JVM INSTR monitorexit ;
		return;
		file;
		throw file;
	//*  96  173:goto            137
	}

	public long getCacheSpace()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		long l;
		Assertions.checkState(released ^ true);
	//    2    2:aload_0         
	//    3    3:getfield        #316 <Field boolean released>
	//    4    6:iconst_1        
	//    5    7:ixor            
	//    6    8:invokestatic    #322 <Method void Assertions.checkState(boolean)>
		l = totalSpace;
	//    7   11:aload_0         
	//    8   12:getfield        #127 <Field long totalSpace>
	//    9   15:lstore_1        
		this;
	//   10   16:aload_0         
		JVM INSTR monitorexit ;
	//   11   17:monitorexit     
		return l;
	//   12   18:lload_1         
	//   13   19:lreturn         
		Exception exception;
		exception;
	//   14   20:astore_3        
	//*  15   21:aload_0         
		throw exception;
	//   16   22:monitorexit     
	//   17   23:aload_3         
	//   18   24:athrow          
	}

	public long getCachedLength(String s, long l, long l1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Assertions.checkState(released ^ true);
	//    2    2:aload_0         
	//    3    3:getfield        #316 <Field boolean released>
	//    4    6:iconst_1        
	//    5    7:ixor            
	//    6    8:invokestatic    #322 <Method void Assertions.checkState(boolean)>
		s = ((String) (index.get(s)));
	//    7   11:aload_0         
	//    8   12:getfield        #76  <Field CachedContentIndex index>
	//    9   15:aload_1         
	//   10   16:invokevirtual   #148 <Method CachedContent CachedContentIndex.get(String)>
	//   11   19:astore_1        
		if(s == null)
			break MISSING_BLOCK_LABEL_35;
	//   12   20:aload_1         
	//   13   21:ifnull          35
		l = ((CachedContent) (s)).getCachedBytesLength(l, l1);
	//   14   24:aload_1         
	//   15   25:lload_2         
	//   16   26:lload           4
	//   17   28:invokevirtual   #368 <Method long CachedContent.getCachedBytesLength(long, long)>
	//   18   31:lstore_2        
		break MISSING_BLOCK_LABEL_39;
	//   19   32:goto            39
		l = -l1;
	//   20   35:lload           4
	//   21   37:lneg            
	//   22   38:lstore_2        
	//*  23   39:aload_0         
		return l;
	//   24   40:monitorexit     
	//   25   41:lload_2         
	//   26   42:lreturn         
		s;
	//   27   43:astore_1        
	//*  28   44:aload_0         
		throw s;
	//   29   45:monitorexit     
	//   30   46:aload_1         
	//   31   47:athrow          
	}

	public NavigableSet getCachedSpans(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Assertions.checkState(released ^ true);
	//    2    2:aload_0         
	//    3    3:getfield        #316 <Field boolean released>
	//    4    6:iconst_1        
	//    5    7:ixor            
	//    6    8:invokestatic    #322 <Method void Assertions.checkState(boolean)>
		s = ((String) (index.get(s)));
	//    7   11:aload_0         
	//    8   12:getfield        #76  <Field CachedContentIndex index>
	//    9   15:aload_1         
	//   10   16:invokevirtual   #148 <Method CachedContent CachedContentIndex.get(String)>
	//   11   19:astore_1        
		if(s == null)
			break MISSING_BLOCK_LABEL_49;
	//   12   20:aload_1         
	//   13   21:ifnull          49
		if(((CachedContent) (s)).isEmpty())
	//*  14   24:aload_1         
	//*  15   25:invokevirtual   #372 <Method boolean CachedContent.isEmpty()>
	//*  16   28:ifeq            34
			break MISSING_BLOCK_LABEL_49;
	//   17   31:goto            49
		s = ((String) (new TreeSet(((Collection) (((CachedContent) (s)).getSpans())))));
	//   18   34:new             #302 <Class TreeSet>
	//   19   37:dup             
	//   20   38:aload_1         
	//   21   39:invokevirtual   #300 <Method TreeSet CachedContent.getSpans()>
	//   22   42:invokespecial   #375 <Method void TreeSet(Collection)>
	//   23   45:astore_1        
		break MISSING_BLOCK_LABEL_57;
	//   24   46:goto            57
		s = ((String) (new TreeSet()));
	//   25   49:new             #302 <Class TreeSet>
	//   26   52:dup             
	//   27   53:invokespecial   #376 <Method void TreeSet()>
	//   28   56:astore_1        
		this;
	//   29   57:aload_0         
		JVM INSTR monitorexit ;
	//   30   58:monitorexit     
		return ((NavigableSet) (s));
	//   31   59:aload_1         
	//   32   60:areturn         
		s;
	//   33   61:astore_1        
	//*  34   62:aload_0         
		throw s;
	//   35   63:monitorexit     
	//   36   64:aload_1         
	//   37   65:athrow          
	}

	public long getContentLength(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		long l = ContentMetadataInternal.getContentLength(getContentMetadata(s));
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #383 <Method ContentMetadata getContentMetadata(String)>
	//    5    7:invokestatic    #353 <Method long ContentMetadataInternal.getContentLength(ContentMetadata)>
	//    6   10:lstore_2        
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return l;
	//    9   13:lload_2         
	//   10   14:lreturn         
		s;
	//   11   15:astore_1        
	//*  12   16:aload_0         
		throw s;
	//   13   17:monitorexit     
	//   14   18:aload_1         
	//   15   19:athrow          
	}

	public ContentMetadata getContentMetadata(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Assertions.checkState(released ^ true);
	//    2    2:aload_0         
	//    3    3:getfield        #316 <Field boolean released>
	//    4    6:iconst_1        
	//    5    7:ixor            
	//    6    8:invokestatic    #322 <Method void Assertions.checkState(boolean)>
		s = ((String) (index.getContentMetadata(s)));
	//    7   11:aload_0         
	//    8   12:getfield        #76  <Field CachedContentIndex index>
	//    9   15:aload_1         
	//   10   16:invokevirtual   #384 <Method ContentMetadata CachedContentIndex.getContentMetadata(String)>
	//   11   19:astore_1        
		this;
	//   12   20:aload_0         
		JVM INSTR monitorexit ;
	//   13   21:monitorexit     
		return ((ContentMetadata) (s));
	//   14   22:aload_1         
	//   15   23:areturn         
		s;
	//   16   24:astore_1        
	//*  17   25:aload_0         
		throw s;
	//   18   26:monitorexit     
	//   19   27:aload_1         
	//   20   28:athrow          
	}

	public Set getKeys()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		HashSet hashset;
		Assertions.checkState(released ^ true);
	//    2    2:aload_0         
	//    3    3:getfield        #316 <Field boolean released>
	//    4    6:iconst_1        
	//    5    7:ixor            
	//    6    8:invokestatic    #322 <Method void Assertions.checkState(boolean)>
		hashset = new HashSet(((Collection) (index.getKeys())));
	//    7   11:new             #33  <Class HashSet>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:getfield        #76  <Field CachedContentIndex index>
	//   11   19:invokevirtual   #388 <Method Set CachedContentIndex.getKeys()>
	//   12   22:invokespecial   #389 <Method void HashSet(Collection)>
	//   13   25:astore_1        
		this;
	//   14   26:aload_0         
		JVM INSTR monitorexit ;
	//   15   27:monitorexit     
		return ((Set) (hashset));
	//   16   28:aload_1         
	//   17   29:areturn         
		Exception exception;
		exception;
	//   18   30:astore_1        
	//*  19   31:aload_0         
		throw exception;
	//   20   32:monitorexit     
	//   21   33:aload_1         
	//   22   34:athrow          
	}

	public boolean isCached(String s, long l, long l1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag1 = released;
	//    2    2:aload_0         
	//    3    3:getfield        #316 <Field boolean released>
	//    4    6:istore          7
		boolean flag = true;
	//    5    8:iconst_1        
	//    6    9:istore          6
		Assertions.checkState(flag1 ^ true);
	//    7   11:iload           7
	//    8   13:iconst_1        
	//    9   14:ixor            
	//   10   15:invokestatic    #322 <Method void Assertions.checkState(boolean)>
		s = ((String) (index.get(s)));
	//   11   18:aload_0         
	//   12   19:getfield        #76  <Field CachedContentIndex index>
	//   13   22:aload_1         
	//   14   23:invokevirtual   #148 <Method CachedContent CachedContentIndex.get(String)>
	//   15   26:astore_1        
		if(s == null)
			break MISSING_BLOCK_LABEL_49;
	//   16   27:aload_1         
	//   17   28:ifnull          49
		l = ((CachedContent) (s)).getCachedBytesLength(l, l1);
	//   18   31:aload_1         
	//   19   32:lload_2         
	//   20   33:lload           4
	//   21   35:invokevirtual   #368 <Method long CachedContent.getCachedBytesLength(long, long)>
	//   22   38:lstore_2        
		if(l >= l1)
	//*  23   39:lload_2         
	//*  24   40:lload           4
	//*  25   42:lcmp            
	//*  26   43:iflt            49
			break MISSING_BLOCK_LABEL_52;
	//   27   46:goto            52
		flag = false;
	//   28   49:iconst_0        
	//   29   50:istore          6
	//*  30   52:aload_0         
		return flag;
	//   31   53:monitorexit     
	//   32   54:iload           6
	//   33   56:ireturn         
		s;
	//   34   57:astore_1        
	//*  35   58:aload_0         
		throw s;
	//   36   59:monitorexit     
	//   37   60:aload_1         
	//   38   61:athrow          
	}

	public void release()
		throws Cache.CacheException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = released;
	//    2    2:aload_0         
	//    3    3:getfield        #316 <Field boolean released>
	//    4    6:istore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_14;
	//    5    7:iload_1         
	//    6    8:ifeq            14
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		listeners.clear();
	//   10   14:aload_0         
	//   11   15:getfield        #81  <Field HashMap listeners>
	//   12   18:invokevirtual   #393 <Method void HashMap.clear()>
		removeStaleSpansAndCachedContents();
	//   13   21:aload_0         
	//   14   22:invokespecial   #169 <Method void removeStaleSpansAndCachedContents()>
		unlockFolder(cacheDir);
	//   15   25:aload_0         
	//   16   26:getfield        #72  <Field File cacheDir>
	//   17   29:invokestatic    #395 <Method void unlockFolder(File)>
		released = true;
	//   18   32:aload_0         
	//   19   33:iconst_1        
	//   20   34:putfield        #316 <Field boolean released>
		this;
	//   21   37:aload_0         
		JVM INSTR monitorexit ;
	//   22   38:monitorexit     
		return;
	//   23   39:return          
		Exception exception;
		exception;
	//   24   40:astore_2        
		unlockFolder(cacheDir);
	//   25   41:aload_0         
	//   26   42:getfield        #72  <Field File cacheDir>
	//   27   45:invokestatic    #395 <Method void unlockFolder(File)>
		released = true;
	//   28   48:aload_0         
	//   29   49:iconst_1        
	//   30   50:putfield        #316 <Field boolean released>
		throw exception;
	//   31   53:aload_2         
	//   32   54:athrow          
		exception;
	//   33   55:astore_2        
		this;
	//   34   56:aload_0         
		JVM INSTR monitorexit ;
	//   35   57:monitorexit     
		throw exception;
	//   36   58:aload_2         
	//   37   59:athrow          
	}

	public void releaseHoleSpan(CacheSpan cachespan)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Assertions.checkState(released ^ true);
	//    2    2:aload_0         
	//    3    3:getfield        #316 <Field boolean released>
	//    4    6:iconst_1        
	//    5    7:ixor            
	//    6    8:invokestatic    #322 <Method void Assertions.checkState(boolean)>
		cachespan = ((CacheSpan) (index.get(cachespan.key)));
	//    7   11:aload_0         
	//    8   12:getfield        #76  <Field CachedContentIndex index>
	//    9   15:aload_1         
	//   10   16:getfield        #253 <Field String CacheSpan.key>
	//   11   19:invokevirtual   #148 <Method CachedContent CachedContentIndex.get(String)>
	//   12   22:astore_1        
		Assertions.checkNotNull(((Object) (cachespan)));
	//   13   23:aload_1         
	//   14   24:invokestatic    #340 <Method Object Assertions.checkNotNull(Object)>
	//   15   27:pop             
		Assertions.checkState(((CachedContent) (cachespan)).isLocked());
	//   16   28:aload_1         
	//   17   29:invokevirtual   #343 <Method boolean CachedContent.isLocked()>
	//   18   32:invokestatic    #322 <Method void Assertions.checkState(boolean)>
		((CachedContent) (cachespan)).setLocked(false);
	//   19   35:aload_1         
	//   20   36:iconst_0        
	//   21   37:invokevirtual   #399 <Method void CachedContent.setLocked(boolean)>
		index.maybeRemove(((CachedContent) (cachespan)).key);
	//   22   40:aload_0         
	//   23   41:getfield        #76  <Field CachedContentIndex index>
	//   24   44:aload_1         
	//   25   45:getfield        #271 <Field String CachedContent.key>
	//   26   48:invokevirtual   #274 <Method void CachedContentIndex.maybeRemove(String)>
		((Object)this).notifyAll();
	//   27   51:aload_0         
	//   28   52:invokevirtual   #361 <Method void Object.notifyAll()>
		this;
	//   29   55:aload_0         
		JVM INSTR monitorexit ;
	//   30   56:monitorexit     
		return;
	//   31   57:return          
		cachespan;
	//   32   58:astore_1        
	//*  33   59:aload_0         
		throw cachespan;
	//   34   60:monitorexit     
	//   35   61:aload_1         
	//   36   62:athrow          
	}

	public void removeListener(String s, Cache.Listener listener)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = released;
	//    2    2:aload_0         
	//    3    3:getfield        #316 <Field boolean released>
	//    4    6:istore_3        
		if(!flag)
			break MISSING_BLOCK_LABEL_14;
	//    5    7:iload_3         
	//    6    8:ifeq            14
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		ArrayList arraylist = (ArrayList)listeners.get(((Object) (s)));
	//   10   14:aload_0         
	//   11   15:getfield        #81  <Field HashMap listeners>
	//   12   18:aload_1         
	//   13   19:invokevirtual   #230 <Method Object HashMap.get(Object)>
	//   14   22:checkcast       #232 <Class ArrayList>
	//   15   25:astore          4
		if(arraylist == null)
			break MISSING_BLOCK_LABEL_56;
	//   16   27:aload           4
	//   17   29:ifnull          56
		arraylist.remove(((Object) (listener)));
	//   18   32:aload           4
	//   19   34:aload_2         
	//   20   35:invokevirtual   #402 <Method boolean ArrayList.remove(Object)>
	//   21   38:pop             
		if(arraylist.isEmpty())
	//*  22   39:aload           4
	//*  23   41:invokevirtual   #403 <Method boolean ArrayList.isEmpty()>
	//*  24   44:ifeq            56
			listeners.remove(((Object) (s)));
	//   25   47:aload_0         
	//   26   48:getfield        #81  <Field HashMap listeners>
	//   27   51:aload_1         
	//   28   52:invokevirtual   #405 <Method Object HashMap.remove(Object)>
	//   29   55:pop             
		this;
	//   30   56:aload_0         
		JVM INSTR monitorexit ;
	//   31   57:monitorexit     
		return;
	//   32   58:return          
		s;
	//   33   59:astore_1        
	//*  34   60:aload_0         
		throw s;
	//   35   61:monitorexit     
	//   36   62:aload_1         
	//   37   63:athrow          
	}

	public void removeSpan(CacheSpan cachespan)
		throws Cache.CacheException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Assertions.checkState(released ^ true);
	//    2    2:aload_0         
	//    3    3:getfield        #316 <Field boolean released>
	//    4    6:iconst_1        
	//    5    7:ixor            
	//    6    8:invokestatic    #322 <Method void Assertions.checkState(boolean)>
		removeSpan(cachespan, true);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:iconst_1        
	//   10   14:invokespecial   #307 <Method void removeSpan(CacheSpan, boolean)>
		this;
	//   11   17:aload_0         
		JVM INSTR monitorexit ;
	//   12   18:monitorexit     
		return;
	//   13   19:return          
		cachespan;
	//   14   20:astore_1        
	//*  15   21:aload_0         
		throw cachespan;
	//   16   22:monitorexit     
	//   17   23:aload_1         
	//   18   24:athrow          
	}

	public void setContentLength(String s, long l)
		throws Cache.CacheException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ContentMetadataMutations contentmetadatamutations = new ContentMetadataMutations();
	//    2    2:new             #409 <Class ContentMetadataMutations>
	//    3    5:dup             
	//    4    6:invokespecial   #410 <Method void ContentMetadataMutations()>
	//    5    9:astore          4
		ContentMetadataInternal.setContentLength(contentmetadatamutations, l);
	//    6   11:aload           4
	//    7   13:lload_2         
	//    8   14:invokestatic    #413 <Method void ContentMetadataInternal.setContentLength(ContentMetadataMutations, long)>
		applyContentMetadataMutations(s, contentmetadatamutations);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:aload           4
	//   12   21:invokevirtual   #414 <Method void applyContentMetadataMutations(String, ContentMetadataMutations)>
		this;
	//   13   24:aload_0         
		JVM INSTR monitorexit ;
	//   14   25:monitorexit     
		return;
	//   15   26:return          
		s;
	//   16   27:astore_1        
	//*  17   28:aload_0         
		throw s;
	//   18   29:monitorexit     
	//   19   30:aload_1         
	//   20   31:athrow          
	}

	public File startFile(String s, long l, long l1)
		throws Cache.CacheException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Assertions.checkState(released ^ true);
	//    2    2:aload_0         
	//    3    3:getfield        #316 <Field boolean released>
	//    4    6:iconst_1        
	//    5    7:ixor            
	//    6    8:invokestatic    #322 <Method void Assertions.checkState(boolean)>
		CachedContent cachedcontent = index.get(s);
	//    7   11:aload_0         
	//    8   12:getfield        #76  <Field CachedContentIndex index>
	//    9   15:aload_1         
	//   10   16:invokevirtual   #148 <Method CachedContent CachedContentIndex.get(String)>
	//   11   19:astore          6
		Assertions.checkNotNull(((Object) (cachedcontent)));
	//   12   21:aload           6
	//   13   23:invokestatic    #340 <Method Object Assertions.checkNotNull(Object)>
	//   14   26:pop             
		Assertions.checkState(cachedcontent.isLocked());
	//   15   27:aload           6
	//   16   29:invokevirtual   #343 <Method boolean CachedContent.isLocked()>
	//   17   32:invokestatic    #322 <Method void Assertions.checkState(boolean)>
		if(!cacheDir.exists())
	//*  18   35:aload_0         
	//*  19   36:getfield        #72  <Field File cacheDir>
	//*  20   39:invokevirtual   #166 <Method boolean File.exists()>
	//*  21   42:ifne            57
		{
			cacheDir.mkdirs();
	//   22   45:aload_0         
	//   23   46:getfield        #72  <Field File cacheDir>
	//   24   49:invokevirtual   #173 <Method boolean File.mkdirs()>
	//   25   52:pop             
			removeStaleSpansAndCachedContents();
	//   26   53:aload_0         
	//   27   54:invokespecial   #169 <Method void removeStaleSpansAndCachedContents()>
		}
		evictor.onStartFile(((Cache) (this)), s, l, l1);
	//   28   57:aload_0         
	//   29   58:getfield        #74  <Field CacheEvictor evictor>
	//   30   61:aload_0         
	//   31   62:aload_1         
	//   32   63:lload_2         
	//   33   64:lload           4
	//   34   66:invokeinterface #420 <Method void CacheEvictor.onStartFile(Cache, String, long, long)>
		s = ((String) (SimpleCacheSpan.getCacheFile(cacheDir, cachedcontent.id, l, System.currentTimeMillis())));
	//   35   71:aload_0         
	//   36   72:getfield        #72  <Field File cacheDir>
	//   37   75:aload           6
	//   38   77:getfield        #424 <Field int CachedContent.id>
	//   39   80:lload_2         
	//   40   81:invokestatic    #429 <Method long System.currentTimeMillis()>
	//   41   84:invokestatic    #433 <Method File SimpleCacheSpan.getCacheFile(File, int, long, long)>
	//   42   87:astore_1        
		this;
	//   43   88:aload_0         
		JVM INSTR monitorexit ;
	//   44   89:monitorexit     
		return ((File) (s));
	//   45   90:aload_1         
	//   46   91:areturn         
		s;
	//   47   92:astore_1        
	//*  48   93:aload_0         
		throw s;
	//   49   94:monitorexit     
	//   50   95:aload_1         
	//   51   96:athrow          
	}

	public volatile CacheSpan startReadWrite(String s, long l)
		throws InterruptedException, Cache.CacheException
	{
		return ((CacheSpan) (startReadWrite(s, l)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokevirtual   #439 <Method SimpleCacheSpan startReadWrite(String, long)>
	//    4    6:areturn         
	}

	public SimpleCacheSpan startReadWrite(String s, long l)
		throws InterruptedException, Cache.CacheException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
_L2:
		SimpleCacheSpan simplecachespan = startReadWriteNonBlocking(s, l);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:lload_2         
	//    5    5:invokevirtual   #442 <Method SimpleCacheSpan startReadWriteNonBlocking(String, long)>
	//    6    8:astore          4
		if(simplecachespan == null)
			break MISSING_BLOCK_LABEL_20;
	//    7   10:aload           4
	//    8   12:ifnull          20
		this;
	//    9   15:aload_0         
		JVM INSTR monitorexit ;
	//   10   16:monitorexit     
		return simplecachespan;
	//   11   17:aload           4
	//   12   19:areturn         
		((Object)this).wait();
	//   13   20:aload_0         
	//   14   21:invokevirtual   #445 <Method void Object.wait()>
		if(true) goto _L2; else goto _L1
	//   15   24:goto            2
_L1:
		s;
	//   16   27:astore_1        
	//*  17   28:aload_0         
		throw s;
	//   18   29:monitorexit     
	//   19   30:aload_1         
	//   20   31:athrow          
	}

	public volatile CacheSpan startReadWriteNonBlocking(String s, long l)
		throws Cache.CacheException
	{
		return ((CacheSpan) (startReadWriteNonBlocking(s, l)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokevirtual   #442 <Method SimpleCacheSpan startReadWriteNonBlocking(String, long)>
	//    4    6:areturn         
	}

	public SimpleCacheSpan startReadWriteNonBlocking(String s, long l)
		throws Cache.CacheException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		SimpleCacheSpan simplecachespan;
		Assertions.checkState(released ^ true);
	//    2    2:aload_0         
	//    3    3:getfield        #316 <Field boolean released>
	//    4    6:iconst_1        
	//    5    7:ixor            
	//    6    8:invokestatic    #322 <Method void Assertions.checkState(boolean)>
		simplecachespan = getSpan(s, l);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:lload_2         
	//   10   14:invokespecial   #447 <Method SimpleCacheSpan getSpan(String, long)>
	//   11   17:astore          4
		if(!simplecachespan.isCached)
			break MISSING_BLOCK_LABEL_52;
	//   12   19:aload           4
	//   13   21:getfield        #157 <Field boolean SimpleCacheSpan.isCached>
	//   14   24:ifeq            52
		s = ((String) (index.get(s).touch(simplecachespan)));
	//   15   27:aload_0         
	//   16   28:getfield        #76  <Field CachedContentIndex index>
	//   17   31:aload_1         
	//   18   32:invokevirtual   #148 <Method CachedContent CachedContentIndex.get(String)>
	//   19   35:aload           4
	//   20   37:invokevirtual   #451 <Method SimpleCacheSpan CachedContent.touch(SimpleCacheSpan)>
	//   21   40:astore_1        
		notifySpanTouched(simplecachespan, ((CacheSpan) (s)));
	//   22   41:aload_0         
	//   23   42:aload           4
	//   24   44:aload_1         
	//   25   45:invokespecial   #453 <Method void notifySpanTouched(SimpleCacheSpan, CacheSpan)>
		this;
	//   26   48:aload_0         
		JVM INSTR monitorexit ;
	//   27   49:monitorexit     
		return ((SimpleCacheSpan) (s));
	//   28   50:aload_1         
	//   29   51:areturn         
		s = ((String) (index.getOrAdd(s)));
	//   30   52:aload_0         
	//   31   53:getfield        #76  <Field CachedContentIndex index>
	//   32   56:aload_1         
	//   33   57:invokevirtual   #121 <Method CachedContent CachedContentIndex.getOrAdd(String)>
	//   34   60:astore_1        
		if(((CachedContent) (s)).isLocked())
			break MISSING_BLOCK_LABEL_78;
	//   35   61:aload_1         
	//   36   62:invokevirtual   #343 <Method boolean CachedContent.isLocked()>
	//   37   65:ifne            78
		((CachedContent) (s)).setLocked(true);
	//   38   68:aload_1         
	//   39   69:iconst_1        
	//   40   70:invokevirtual   #399 <Method void CachedContent.setLocked(boolean)>
	//*  41   73:aload_0         
	//*  42   74:monitorexit     
		return simplecachespan;
	//   43   75:aload           4
	//   44   77:areturn         
		this;
	//   45   78:aload_0         
		JVM INSTR monitorexit ;
	//   46   79:monitorexit     
		return null;
	//   47   80:aconst_null     
	//   48   81:areturn         
		s;
	//   49   82:astore_1        
	//*  50   83:aload_0         
		throw s;
	//   51   84:monitorexit     
	//   52   85:aload_1         
	//   53   86:athrow          
	}

	private static final String TAG = "SimpleCache";
	private static boolean cacheFolderLockingDisabled;
	private static final HashSet lockedCacheDirs = new HashSet();
	private final File cacheDir;
	private final CacheEvictor evictor;
	private final CachedContentIndex index;
	private final HashMap listeners;
	private boolean released;
	private long totalSpace;

	static 
	{
	//    0    0:new             #33  <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void HashSet()>
	//    3    7:putstatic       #38  <Field HashSet lockedCacheDirs>
	//*   4   10:return          
	}


/*
	static void access$000(SimpleCache simplecache)
	{
		simplecache.initialize();
	//    0    0:aload_0         
	//    1    1:invokespecial   #108 <Method void initialize()>
		return;
	//    2    4:return          
	}

*/


/*
	static CacheEvictor access$100(SimpleCache simplecache)
	{
		return simplecache.evictor;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field CacheEvictor evictor>
	//    2    4:areturn         
	}

*/
}
