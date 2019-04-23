// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream.cache;

import android.os.ConditionVariable;
import com.google.android.exoplayer.util.Assertions;
import java.io.File;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer.upstream.cache:
//			Cache, CachedContentIndex, SimpleCacheSpan, CachedContent, 
//			CacheEvictor, CacheSpan

public final class SimpleCache
	implements Cache
{

	public SimpleCache(File file, CacheEvictor cacheevictor)
	{
		this(file, cacheevictor, ((byte []) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #28  <Method void SimpleCache(File, CacheEvictor, byte[])>
	//    5    7:return          
	}

	public SimpleCache(File file, CacheEvictor cacheevictor, byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		totalSpace = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #34  <Field long totalSpace>
		cacheDir = file;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #36  <Field File cacheDir>
		evictor = cacheevictor;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #38  <Field CacheEvictor evictor>
		lockedSpans = new HashMap();
	//   11   19:aload_0         
	//   12   20:new             #40  <Class HashMap>
	//   13   23:dup             
	//   14   24:invokespecial   #41  <Method void HashMap()>
	//   15   27:putfield        #43  <Field HashMap lockedSpans>
		index = new CachedContentIndex(file, abyte0);
	//   16   30:aload_0         
	//   17   31:new             #45  <Class CachedContentIndex>
	//   18   34:dup             
	//   19   35:aload_1         
	//   20   36:aload_3         
	//   21   37:invokespecial   #48  <Method void CachedContentIndex(File, byte[])>
	//   22   40:putfield        #50  <Field CachedContentIndex index>
		listeners = new HashMap();
	//   23   43:aload_0         
	//   24   44:new             #40  <Class HashMap>
	//   25   47:dup             
	//   26   48:invokespecial   #41  <Method void HashMap()>
	//   27   51:putfield        #52  <Field HashMap listeners>
		file = ((File) (new ConditionVariable()));
	//   28   54:new             #54  <Class ConditionVariable>
	//   29   57:dup             
	//   30   58:invokespecial   #55  <Method void ConditionVariable()>
	//   31   61:astore_1        
		((_cls1) (new Thread(((ConditionVariable) (file))) {

			public void run()
			{
				SimpleCache simplecache = SimpleCache.this;
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field SimpleCache this$0>
			//    2    4:astore_1        
				simplecache;
			//    3    5:aload_1         
				JVM INSTR monitorenter ;
			//    4    6:monitorenter    
				conditionVariable.open();
			//    5    7:aload_0         
			//    6    8:getfield        #18  <Field ConditionVariable val$conditionVariable>
			//    7   11:invokevirtual   #31  <Method void ConditionVariable.open()>
				initialize();
			//    8   14:aload_0         
			//    9   15:getfield        #16  <Field SimpleCache this$0>
			//   10   18:invokestatic    #35  <Method void SimpleCache.access$000(SimpleCache)>
				break MISSING_BLOCK_LABEL_34;
			//   11   21:goto            34
				Object obj;
				obj;
			//   12   24:astore_2        
				initializationException = ((Cache.CacheException) (obj));
			//   13   25:aload_0         
			//   14   26:getfield        #16  <Field SimpleCache this$0>
			//   15   29:aload_2         
			//   16   30:invokestatic    #39  <Method Cache$CacheException SimpleCache.access$102(SimpleCache, Cache$CacheException)>
			//   17   33:pop             
				evictor.onCacheInitialized();
			//   18   34:aload_0         
			//   19   35:getfield        #16  <Field SimpleCache this$0>
			//   20   38:invokestatic    #43  <Method CacheEvictor SimpleCache.access$200(SimpleCache)>
			//   21   41:invokeinterface #48  <Method void CacheEvictor.onCacheInitialized()>
				simplecache;
			//   22   46:aload_1         
				JVM INSTR monitorexit ;
			//   23   47:monitorexit     
				return;
			//   24   48:return          
				obj;
			//   25   49:astore_2        
				simplecache;
			//   26   50:aload_1         
				JVM INSTR monitorexit ;
			//   27   51:monitorexit     
				throw obj;
			//   28   52:aload_2         
			//   29   53:athrow          
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
	//   32   62:new             #8   <Class SimpleCache$1>
	//   33   65:dup             
	//   34   66:aload_0         
	//   35   67:ldc1            #57  <String "SimpleCache.initialize()">
	//   36   69:aload_1         
	//   37   70:invokespecial   #60  <Method void SimpleCache$1(SimpleCache, String, ConditionVariable)>
	//   38   73:invokevirtual   #63  <Method void SimpleCache$1.start()>
		((ConditionVariable) (file)).block();
	//   39   76:aload_1         
	//   40   77:invokevirtual   #66  <Method void ConditionVariable.block()>
	//   41   80:return          
	}

	private void addSpan(SimpleCacheSpan simplecachespan)
	{
		index.add(simplecachespan.key).addSpan(simplecachespan);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field CachedContentIndex index>
	//    2    4:aload_1         
	//    3    5:getfield        #88  <Field String SimpleCacheSpan.key>
	//    4    8:invokevirtual   #92  <Method CachedContent CachedContentIndex.add(String)>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #96  <Method void CachedContent.addSpan(SimpleCacheSpan)>
		totalSpace = totalSpace + simplecachespan.length;
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #34  <Field long totalSpace>
	//   10   20:aload_1         
	//   11   21:getfield        #99  <Field long SimpleCacheSpan.length>
	//   12   24:ladd            
	//   13   25:putfield        #34  <Field long totalSpace>
		notifySpanAdded(simplecachespan);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokespecial   #102 <Method void notifySpanAdded(SimpleCacheSpan)>
	//   17   33:return          
	}

	private SimpleCacheSpan getSpan(String s, long l)
		throws Cache.CacheException
	{
		CachedContent cachedcontent = index.get(s);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field CachedContentIndex index>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #107 <Method CachedContent CachedContentIndex.get(String)>
	//    4    8:astore          4
		if(cachedcontent == null)
	//*   5   10:aload           4
	//*   6   12:ifnonnull       21
			return SimpleCacheSpan.createOpenHole(s, l);
	//    7   15:aload_1         
	//    8   16:lload_2         
	//    9   17:invokestatic    #110 <Method SimpleCacheSpan SimpleCacheSpan.createOpenHole(String, long)>
	//   10   20:areturn         
		do
		{
			s = ((String) (cachedcontent.getSpan(l)));
	//   11   21:aload           4
	//   12   23:lload_2         
	//   13   24:invokevirtual   #113 <Method SimpleCacheSpan CachedContent.getSpan(long)>
	//   14   27:astore_1        
			if(((SimpleCacheSpan) (s)).isCached && !((SimpleCacheSpan) (s)).file.exists())
	//*  15   28:aload_1         
	//*  16   29:getfield        #117 <Field boolean SimpleCacheSpan.isCached>
	//*  17   32:ifeq            52
	//*  18   35:aload_1         
	//*  19   36:getfield        #120 <Field File SimpleCacheSpan.file>
	//*  20   39:invokevirtual   #126 <Method boolean File.exists()>
	//*  21   42:ifne            52
				removeStaleSpansAndCachedContents();
	//   22   45:aload_0         
	//   23   46:invokespecial   #129 <Method void removeStaleSpansAndCachedContents()>
			else
	//*  24   49:goto            21
				return ((SimpleCacheSpan) (s));
	//   25   52:aload_1         
	//   26   53:areturn         
		} while(true);
	}

	private void initialize()
		throws Cache.CacheException
	{
		if(!cacheDir.exists())
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field File cacheDir>
	//*   2    4:invokevirtual   #126 <Method boolean File.exists()>
	//*   3    7:ifne            19
		{
			cacheDir.mkdirs();
	//    4   10:aload_0         
	//    5   11:getfield        #36  <Field File cacheDir>
	//    6   14:invokevirtual   #132 <Method boolean File.mkdirs()>
	//    7   17:pop             
			return;
	//    8   18:return          
		}
		index.load();
	//    9   19:aload_0         
	//   10   20:getfield        #50  <Field CachedContentIndex index>
	//   11   23:invokevirtual   #135 <Method void CachedContentIndex.load()>
		File afile[] = cacheDir.listFiles();
	//   12   26:aload_0         
	//   13   27:getfield        #36  <Field File cacheDir>
	//   14   30:invokevirtual   #139 <Method File[] File.listFiles()>
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
	//*  32   60:invokevirtual   #143 <Method String File.getName()>
	//*  33   63:ldc1            #145 <String "cached_content_index.exi">
	//*  34   65:invokevirtual   #151 <Method boolean String.equals(Object)>
	//*  35   68:ifeq            74
				continue;
	//   36   71:goto            117
			SimpleCacheSpan simplecachespan;
			if(file.length() > 0L)
	//*  37   74:aload           5
	//*  38   76:invokevirtual   #154 <Method long File.length()>
	//*  39   79:lconst_0        
	//*  40   80:lcmp            
	//*  41   81:ifle            97
				simplecachespan = SimpleCacheSpan.createCacheEntry(file, index);
	//   42   84:aload           5
	//   43   86:aload_0         
	//   44   87:getfield        #50  <Field CachedContentIndex index>
	//   45   90:invokestatic    #158 <Method SimpleCacheSpan SimpleCacheSpan.createCacheEntry(File, CachedContentIndex)>
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
	//   54  105:invokespecial   #159 <Method void addSpan(SimpleCacheSpan)>
			else
	//*  55  108:goto            117
				file.delete();
	//   56  111:aload           5
	//   57  113:invokevirtual   #162 <Method boolean File.delete()>
	//   58  116:pop             
		}

	//   59  117:iload_1         
	//   60  118:iconst_1        
	//   61  119:iadd            
	//   62  120:istore_1        
	//*  63  121:goto            47
		index.removeEmpty();
	//   64  124:aload_0         
	//   65  125:getfield        #50  <Field CachedContentIndex index>
	//   66  128:invokevirtual   #165 <Method void CachedContentIndex.removeEmpty()>
		index.store();
	//   67  131:aload_0         
	//   68  132:getfield        #50  <Field CachedContentIndex index>
	//   69  135:invokevirtual   #168 <Method void CachedContentIndex.store()>
	//   70  138:return          
	}

	private void notifySpanAdded(SimpleCacheSpan simplecachespan)
	{
		ArrayList arraylist = (ArrayList)listeners.get(((Object) (simplecachespan.key)));
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field HashMap listeners>
	//    2    4:aload_1         
	//    3    5:getfield        #88  <Field String SimpleCacheSpan.key>
	//    4    8:invokevirtual   #171 <Method Object HashMap.get(Object)>
	//    5   11:checkcast       #173 <Class ArrayList>
	//    6   14:astore_3        
		if(arraylist != null)
	//*   7   15:aload_3         
	//*   8   16:ifnull          52
		{
			for(int i = arraylist.size() - 1; i >= 0; i--)
	//*   9   19:aload_3         
	//*  10   20:invokevirtual   #177 <Method int ArrayList.size()>
	//*  11   23:iconst_1        
	//*  12   24:isub            
	//*  13   25:istore_2        
	//*  14   26:iload_2         
	//*  15   27:iflt            52
				((Cache.Listener)arraylist.get(i)).onSpanAdded(((Cache) (this)), ((CacheSpan) (simplecachespan)));
	//   16   30:aload_3         
	//   17   31:iload_2         
	//   18   32:invokevirtual   #180 <Method Object ArrayList.get(int)>
	//   19   35:checkcast       #182 <Class Cache$Listener>
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:invokeinterface #186 <Method void Cache$Listener.onSpanAdded(Cache, CacheSpan)>

	//   23   45:iload_2         
	//   24   46:iconst_1        
	//   25   47:isub            
	//   26   48:istore_2        
		}
	//*  27   49:goto            26
		evictor.onSpanAdded(((Cache) (this)), ((CacheSpan) (simplecachespan)));
	//   28   52:aload_0         
	//   29   53:getfield        #38  <Field CacheEvictor evictor>
	//   30   56:aload_0         
	//   31   57:aload_1         
	//   32   58:invokeinterface #189 <Method void CacheEvictor.onSpanAdded(Cache, CacheSpan)>
	//   33   63:return          
	}

	private void notifySpanRemoved(CacheSpan cachespan)
	{
		ArrayList arraylist = (ArrayList)listeners.get(((Object) (cachespan.key)));
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field HashMap listeners>
	//    2    4:aload_1         
	//    3    5:getfield        #194 <Field String CacheSpan.key>
	//    4    8:invokevirtual   #171 <Method Object HashMap.get(Object)>
	//    5   11:checkcast       #173 <Class ArrayList>
	//    6   14:astore_3        
		if(arraylist != null)
	//*   7   15:aload_3         
	//*   8   16:ifnull          52
		{
			for(int i = arraylist.size() - 1; i >= 0; i--)
	//*   9   19:aload_3         
	//*  10   20:invokevirtual   #177 <Method int ArrayList.size()>
	//*  11   23:iconst_1        
	//*  12   24:isub            
	//*  13   25:istore_2        
	//*  14   26:iload_2         
	//*  15   27:iflt            52
				((Cache.Listener)arraylist.get(i)).onSpanRemoved(((Cache) (this)), cachespan);
	//   16   30:aload_3         
	//   17   31:iload_2         
	//   18   32:invokevirtual   #180 <Method Object ArrayList.get(int)>
	//   19   35:checkcast       #182 <Class Cache$Listener>
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:invokeinterface #197 <Method void Cache$Listener.onSpanRemoved(Cache, CacheSpan)>

	//   23   45:iload_2         
	//   24   46:iconst_1        
	//   25   47:isub            
	//   26   48:istore_2        
		}
	//*  27   49:goto            26
		evictor.onSpanRemoved(((Cache) (this)), cachespan);
	//   28   52:aload_0         
	//   29   53:getfield        #38  <Field CacheEvictor evictor>
	//   30   56:aload_0         
	//   31   57:aload_1         
	//   32   58:invokeinterface #198 <Method void CacheEvictor.onSpanRemoved(Cache, CacheSpan)>
	//   33   63:return          
	}

	private void notifySpanTouched(SimpleCacheSpan simplecachespan, CacheSpan cachespan)
	{
		ArrayList arraylist = (ArrayList)listeners.get(((Object) (simplecachespan.key)));
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field HashMap listeners>
	//    2    4:aload_1         
	//    3    5:getfield        #88  <Field String SimpleCacheSpan.key>
	//    4    8:invokevirtual   #171 <Method Object HashMap.get(Object)>
	//    5   11:checkcast       #173 <Class ArrayList>
	//    6   14:astore          4
		if(arraylist != null)
	//*   7   16:aload           4
	//*   8   18:ifnull          57
		{
			for(int i = arraylist.size() - 1; i >= 0; i--)
	//*   9   21:aload           4
	//*  10   23:invokevirtual   #177 <Method int ArrayList.size()>
	//*  11   26:iconst_1        
	//*  12   27:isub            
	//*  13   28:istore_3        
	//*  14   29:iload_3         
	//*  15   30:iflt            57
				((Cache.Listener)arraylist.get(i)).onSpanTouched(((Cache) (this)), ((CacheSpan) (simplecachespan)), cachespan);
	//   16   33:aload           4
	//   17   35:iload_3         
	//   18   36:invokevirtual   #180 <Method Object ArrayList.get(int)>
	//   19   39:checkcast       #182 <Class Cache$Listener>
	//   20   42:aload_0         
	//   21   43:aload_1         
	//   22   44:aload_2         
	//   23   45:invokeinterface #204 <Method void Cache$Listener.onSpanTouched(Cache, CacheSpan, CacheSpan)>

	//   24   50:iload_3         
	//   25   51:iconst_1        
	//   26   52:isub            
	//   27   53:istore_3        
		}
	//*  28   54:goto            29
		evictor.onSpanTouched(((Cache) (this)), ((CacheSpan) (simplecachespan)), cachespan);
	//   29   57:aload_0         
	//   30   58:getfield        #38  <Field CacheEvictor evictor>
	//   31   61:aload_0         
	//   32   62:aload_1         
	//   33   63:aload_2         
	//   34   64:invokeinterface #205 <Method void CacheEvictor.onSpanTouched(Cache, CacheSpan, CacheSpan)>
	//   35   69:return          
	}

	private void removeSpan(CacheSpan cachespan, boolean flag)
		throws Cache.CacheException
	{
		CachedContent cachedcontent = index.get(cachespan.key);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field CachedContentIndex index>
	//    2    4:aload_1         
	//    3    5:getfield        #194 <Field String CacheSpan.key>
	//    4    8:invokevirtual   #107 <Method CachedContent CachedContentIndex.get(String)>
	//    5   11:astore_3        
		Assertions.checkState(cachedcontent.removeSpan(cachespan));
	//    6   12:aload_3         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #210 <Method boolean CachedContent.removeSpan(CacheSpan)>
	//    9   17:invokestatic    #216 <Method void Assertions.checkState(boolean)>
		totalSpace = totalSpace - cachespan.length;
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:getfield        #34  <Field long totalSpace>
	//   13   25:aload_1         
	//   14   26:getfield        #217 <Field long CacheSpan.length>
	//   15   29:lsub            
	//   16   30:putfield        #34  <Field long totalSpace>
		if(flag && cachedcontent.isEmpty())
	//*  17   33:iload_2         
	//*  18   34:ifeq            62
	//*  19   37:aload_3         
	//*  20   38:invokevirtual   #220 <Method boolean CachedContent.isEmpty()>
	//*  21   41:ifeq            62
		{
			index.removeEmpty(cachedcontent.key);
	//   22   44:aload_0         
	//   23   45:getfield        #50  <Field CachedContentIndex index>
	//   24   48:aload_3         
	//   25   49:getfield        #221 <Field String CachedContent.key>
	//   26   52:invokevirtual   #224 <Method void CachedContentIndex.removeEmpty(String)>
			index.store();
	//   27   55:aload_0         
	//   28   56:getfield        #50  <Field CachedContentIndex index>
	//   29   59:invokevirtual   #168 <Method void CachedContentIndex.store()>
		}
		notifySpanRemoved(cachespan);
	//   30   62:aload_0         
	//   31   63:aload_1         
	//   32   64:invokespecial   #226 <Method void notifySpanRemoved(CacheSpan)>
	//   33   67:return          
	}

	private void removeStaleSpansAndCachedContents()
		throws Cache.CacheException
	{
		Object obj = ((Object) (new LinkedList()));
	//    0    0:new             #228 <Class LinkedList>
	//    1    3:dup             
	//    2    4:invokespecial   #229 <Method void LinkedList()>
	//    3    7:astore_1        
		for(Iterator iterator = index.getAll().iterator(); iterator.hasNext();)
	//*   4    8:aload_0         
	//*   5    9:getfield        #50  <Field CachedContentIndex index>
	//*   6   12:invokevirtual   #233 <Method Collection CachedContentIndex.getAll()>
	//*   7   15:invokeinterface #239 <Method Iterator Collection.iterator()>
	//*   8   20:astore_2        
	//*   9   21:aload_2         
	//*  10   22:invokeinterface #244 <Method boolean Iterator.hasNext()>
	//*  11   27:ifeq            87
		{
			Iterator iterator1 = ((CachedContent)iterator.next()).getSpans().iterator();
	//   12   30:aload_2         
	//   13   31:invokeinterface #248 <Method Object Iterator.next()>
	//   14   36:checkcast       #94  <Class CachedContent>
	//   15   39:invokevirtual   #252 <Method TreeSet CachedContent.getSpans()>
	//   16   42:invokevirtual   #255 <Method Iterator TreeSet.iterator()>
	//   17   45:astore_3        
			while(iterator1.hasNext()) 
	//*  18   46:aload_3         
	//*  19   47:invokeinterface #244 <Method boolean Iterator.hasNext()>
	//*  20   52:ifeq            21
			{
				CacheSpan cachespan = (CacheSpan)iterator1.next();
	//   21   55:aload_3         
	//   22   56:invokeinterface #248 <Method Object Iterator.next()>
	//   23   61:checkcast       #193 <Class CacheSpan>
	//   24   64:astore          4
				if(!cachespan.file.exists())
	//*  25   66:aload           4
	//*  26   68:getfield        #256 <Field File CacheSpan.file>
	//*  27   71:invokevirtual   #126 <Method boolean File.exists()>
	//*  28   74:ifne            46
					((LinkedList) (obj)).add(((Object) (cachespan)));
	//   29   77:aload_1         
	//   30   78:aload           4
	//   31   80:invokevirtual   #258 <Method boolean LinkedList.add(Object)>
	//   32   83:pop             
			}
		}

	//*  33   84:goto            46
		for(obj = ((Object) (((LinkedList) (obj)).iterator())); ((Iterator) (obj)).hasNext(); removeSpan((CacheSpan)((Iterator) (obj)).next(), false));
	//   34   87:aload_1         
	//   35   88:invokevirtual   #259 <Method Iterator LinkedList.iterator()>
	//   36   91:astore_1        
	//   37   92:aload_1         
	//   38   93:invokeinterface #244 <Method boolean Iterator.hasNext()>
	//   39   98:ifeq            118
	//   40  101:aload_0         
	//   41  102:aload_1         
	//   42  103:invokeinterface #248 <Method Object Iterator.next()>
	//   43  108:checkcast       #193 <Class CacheSpan>
	//   44  111:iconst_0        
	//   45  112:invokespecial   #261 <Method void removeSpan(CacheSpan, boolean)>
	//*  46  115:goto            92
		index.removeEmpty();
	//   47  118:aload_0         
	//   48  119:getfield        #50  <Field CachedContentIndex index>
	//   49  122:invokevirtual   #165 <Method void CachedContentIndex.removeEmpty()>
		index.store();
	//   50  125:aload_0         
	//   51  126:getfield        #50  <Field CachedContentIndex index>
	//   52  129:invokevirtual   #168 <Method void CachedContentIndex.store()>
	//   53  132:return          
	}

	public NavigableSet addListener(String s, Cache.Listener listener)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ArrayList arraylist1 = (ArrayList)listeners.get(((Object) (s)));
	//    2    2:aload_0         
	//    3    3:getfield        #52  <Field HashMap listeners>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #171 <Method Object HashMap.get(Object)>
	//    6   10:checkcast       #173 <Class ArrayList>
	//    7   13:astore          4
		ArrayList arraylist;
		arraylist = arraylist1;
	//    8   15:aload           4
	//    9   17:astore_3        
		if(arraylist1 != null)
			break MISSING_BLOCK_LABEL_41;
	//   10   18:aload           4
	//   11   20:ifnonnull       41
		arraylist = new ArrayList();
	//   12   23:new             #173 <Class ArrayList>
	//   13   26:dup             
	//   14   27:invokespecial   #264 <Method void ArrayList()>
	//   15   30:astore_3        
		listeners.put(((Object) (s)), ((Object) (arraylist)));
	//   16   31:aload_0         
	//   17   32:getfield        #52  <Field HashMap listeners>
	//   18   35:aload_1         
	//   19   36:aload_3         
	//   20   37:invokevirtual   #268 <Method Object HashMap.put(Object, Object)>
	//   21   40:pop             
		arraylist.add(((Object) (listener)));
	//   22   41:aload_3         
	//   23   42:aload_2         
	//   24   43:invokevirtual   #269 <Method boolean ArrayList.add(Object)>
	//   25   46:pop             
		s = ((String) (getCachedSpans(s)));
	//   26   47:aload_0         
	//   27   48:aload_1         
	//   28   49:invokevirtual   #273 <Method NavigableSet getCachedSpans(String)>
	//   29   52:astore_1        
		this;
	//   30   53:aload_0         
		JVM INSTR monitorexit ;
	//   31   54:monitorexit     
		return ((NavigableSet) (s));
	//   32   55:aload_1         
	//   33   56:areturn         
		s;
	//   34   57:astore_1        
	//*  35   58:aload_0         
		throw s;
	//   36   59:monitorexit     
	//   37   60:aload_1         
	//   38   61:athrow          
	}

	public void commitFile(File file)
		throws Cache.CacheException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		SimpleCacheSpan simplecachespan = SimpleCacheSpan.createCacheEntry(file, index);
	//    2    2:aload_1         
	//    3    3:aload_0         
	//    4    4:getfield        #50  <Field CachedContentIndex index>
	//    5    7:invokestatic    #158 <Method SimpleCacheSpan SimpleCacheSpan.createCacheEntry(File, CachedContentIndex)>
	//    6   10:astore_3        
		boolean flag;
		if(simplecachespan != null)
	//*   7   11:aload_3         
	//*   8   12:ifnull          91
			flag = true;
	//    9   15:iconst_1        
	//   10   16:istore_2        
		else
	//*  11   17:goto            20
	//*  12   20:iload_2         
	//*  13   21:invokestatic    #216 <Method void Assertions.checkState(boolean)>
	//*  14   24:aload_0         
	//*  15   25:getfield        #43  <Field HashMap lockedSpans>
	//*  16   28:aload_3         
	//*  17   29:getfield        #88  <Field String SimpleCacheSpan.key>
	//*  18   32:invokevirtual   #280 <Method boolean HashMap.containsKey(Object)>
	//*  19   35:invokestatic    #216 <Method void Assertions.checkState(boolean)>
	//*  20   38:aload_1         
	//*  21   39:invokevirtual   #126 <Method boolean File.exists()>
	//*  22   42:istore_2        
	//*  23   43:iload_2         
	//*  24   44:ifne            50
	//*  25   47:aload_0         
	//*  26   48:monitorexit     
	//*  27   49:return          
	//*  28   50:aload_1         
	//*  29   51:invokevirtual   #154 <Method long File.length()>
	//*  30   54:lconst_0        
	//*  31   55:lcmp            
	//*  32   56:ifne            67
	//*  33   59:aload_1         
	//*  34   60:invokevirtual   #162 <Method boolean File.delete()>
	//*  35   63:pop             
	//*  36   64:aload_0         
	//*  37   65:monitorexit     
	//*  38   66:return          
	//*  39   67:aload_0         
	//*  40   68:aload_3         
	//*  41   69:invokespecial   #159 <Method void addSpan(SimpleCacheSpan)>
	//*  42   72:aload_0         
	//*  43   73:getfield        #50  <Field CachedContentIndex index>
	//*  44   76:invokevirtual   #168 <Method void CachedContentIndex.store()>
	//*  45   79:aload_0         
	//*  46   80:invokevirtual   #283 <Method void Object.notifyAll()>
	//*  47   83:aload_0         
	//*  48   84:monitorexit     
	//*  49   85:return          
	//*  50   86:astore_1        
	//*  51   87:aload_0         
	//*  52   88:monitorexit     
	//*  53   89:aload_1         
	//*  54   90:athrow          
			flag = false;
	//   55   91:iconst_0        
	//   56   92:istore_2        
		Assertions.checkState(flag);
		Assertions.checkState(lockedSpans.containsKey(((Object) (simplecachespan.key))));
		flag = file.exists();
		if(flag)
			break MISSING_BLOCK_LABEL_50;
		this;
		JVM INSTR monitorexit ;
		return;
		if(file.length() != 0L)
			break MISSING_BLOCK_LABEL_67;
		file.delete();
		this;
		JVM INSTR monitorexit ;
		return;
		addSpan(simplecachespan);
		index.store();
		((Object)this).notifyAll();
		this;
		JVM INSTR monitorexit ;
		return;
		file;
		throw file;
	//*  57   93:goto            20
	}

	public long getCacheSpace()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		long l = totalSpace;
	//    2    2:aload_0         
	//    3    3:getfield        #34  <Field long totalSpace>
	//    4    6:lstore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return l;
	//    7    9:lload_1         
	//    8   10:lreturn         
		Exception exception;
		exception;
	//    9   11:astore_3        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_3         
	//   13   15:athrow          
	}

	public NavigableSet getCachedSpans(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		s = ((String) (index.get(s)));
	//    2    2:aload_0         
	//    3    3:getfield        #50  <Field CachedContentIndex index>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #107 <Method CachedContent CachedContentIndex.get(String)>
	//    6   10:astore_1        
		if(s == null)
	//*   7   11:aload_1         
	//*   8   12:ifnonnull       20
		{
			s = null;
	//    9   15:aconst_null     
	//   10   16:astore_1        
			break MISSING_BLOCK_LABEL_32;
	//   11   17:goto            32
		}
		s = ((String) (new TreeSet(((Collection) (((CachedContent) (s)).getSpans())))));
	//   12   20:new             #254 <Class TreeSet>
	//   13   23:dup             
	//   14   24:aload_1         
	//   15   25:invokevirtual   #252 <Method TreeSet CachedContent.getSpans()>
	//   16   28:invokespecial   #287 <Method void TreeSet(Collection)>
	//   17   31:astore_1        
		this;
	//   18   32:aload_0         
		JVM INSTR monitorexit ;
	//   19   33:monitorexit     
		return ((NavigableSet) (s));
	//   20   34:aload_1         
	//   21   35:areturn         
		s;
	//   22   36:astore_1        
	//*  23   37:aload_0         
		throw s;
	//   24   38:monitorexit     
	//   25   39:aload_1         
	//   26   40:athrow          
	}

	public Set getKeys()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		HashSet hashset = new HashSet(((Collection) (index.getKeys())));
	//    2    2:new             #292 <Class HashSet>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:getfield        #50  <Field CachedContentIndex index>
	//    6   10:invokevirtual   #294 <Method Set CachedContentIndex.getKeys()>
	//    7   13:invokespecial   #295 <Method void HashSet(Collection)>
	//    8   16:astore_1        
		this;
	//    9   17:aload_0         
		JVM INSTR monitorexit ;
	//   10   18:monitorexit     
		return ((Set) (hashset));
	//   11   19:aload_1         
	//   12   20:areturn         
		Exception exception;
		exception;
	//   13   21:astore_1        
	//*  14   22:aload_0         
		throw exception;
	//   15   23:monitorexit     
	//   16   24:aload_1         
	//   17   25:athrow          
	}

	public boolean isCached(String s, long l, long l1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		s = ((String) (index.get(s)));
	//    2    2:aload_0         
	//    3    3:getfield        #50  <Field CachedContentIndex index>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #107 <Method CachedContent CachedContentIndex.get(String)>
	//    6   10:astore_1        
		if(s == null)
			break MISSING_BLOCK_LABEL_35;
	//    7   11:aload_1         
	//    8   12:ifnull          35
		boolean flag = ((CachedContent) (s)).isCached(l, l1);
	//    9   15:aload_1         
	//   10   16:lload_2         
	//   11   17:lload           4
	//   12   19:invokevirtual   #300 <Method boolean CachedContent.isCached(long, long)>
	//   13   22:istore          6
		if(flag)
	//*  14   24:iload           6
	//*  15   26:ifeq            35
		{
			flag = true;
	//   16   29:iconst_1        
	//   17   30:istore          6
			break MISSING_BLOCK_LABEL_38;
	//   18   32:goto            38
		}
		flag = false;
	//   19   35:iconst_0        
	//   20   36:istore          6
	//*  21   38:aload_0         
		return flag;
	//   22   39:monitorexit     
	//   23   40:iload           6
	//   24   42:ireturn         
		s;
	//   25   43:astore_1        
	//*  26   44:aload_0         
		throw s;
	//   27   45:monitorexit     
	//   28   46:aload_1         
	//   29   47:athrow          
	}

	public void releaseHoleSpan(CacheSpan cachespan)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag;
		if(cachespan == lockedSpans.remove(((Object) (cachespan.key))))
	//*   2    2:aload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #43  <Field HashMap lockedSpans>
	//*   5    7:aload_1         
	//*   6    8:getfield        #194 <Field String CacheSpan.key>
	//*   7   11:invokevirtual   #304 <Method Object HashMap.remove(Object)>
	//*   8   14:if_acmpne       38
			flag = true;
	//    9   17:iconst_1        
	//   10   18:istore_2        
		else
	//*  11   19:goto            22
	//*  12   22:iload_2         
	//*  13   23:invokestatic    #216 <Method void Assertions.checkState(boolean)>
	//*  14   26:aload_0         
	//*  15   27:invokevirtual   #283 <Method void Object.notifyAll()>
	//*  16   30:aload_0         
	//*  17   31:monitorexit     
	//*  18   32:return          
	//*  19   33:astore_1        
	//*  20   34:aload_0         
	//*  21   35:monitorexit     
	//*  22   36:aload_1         
	//*  23   37:athrow          
			flag = false;
	//   24   38:iconst_0        
	//   25   39:istore_2        
		Assertions.checkState(flag);
		((Object)this).notifyAll();
		this;
		JVM INSTR monitorexit ;
		return;
		cachespan;
		throw cachespan;
	//*  26   40:goto            22
	}

	public void removeListener(String s, Cache.Listener listener)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ArrayList arraylist = (ArrayList)listeners.get(((Object) (s)));
	//    2    2:aload_0         
	//    3    3:getfield        #52  <Field HashMap listeners>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #171 <Method Object HashMap.get(Object)>
	//    6   10:checkcast       #173 <Class ArrayList>
	//    7   13:astore_3        
		if(arraylist == null)
			break MISSING_BLOCK_LABEL_40;
	//    8   14:aload_3         
	//    9   15:ifnull          40
		arraylist.remove(((Object) (listener)));
	//   10   18:aload_3         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #308 <Method boolean ArrayList.remove(Object)>
	//   13   23:pop             
		if(arraylist.isEmpty())
	//*  14   24:aload_3         
	//*  15   25:invokevirtual   #309 <Method boolean ArrayList.isEmpty()>
	//*  16   28:ifeq            40
			listeners.remove(((Object) (s)));
	//   17   31:aload_0         
	//   18   32:getfield        #52  <Field HashMap listeners>
	//   19   35:aload_1         
	//   20   36:invokevirtual   #304 <Method Object HashMap.remove(Object)>
	//   21   39:pop             
		this;
	//   22   40:aload_0         
		JVM INSTR monitorexit ;
	//   23   41:monitorexit     
		return;
	//   24   42:return          
		s;
	//   25   43:astore_1        
	//*  26   44:aload_0         
		throw s;
	//   27   45:monitorexit     
	//   28   46:aload_1         
	//   29   47:athrow          
	}

	public void removeSpan(CacheSpan cachespan)
		throws Cache.CacheException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		removeSpan(cachespan, true);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:iconst_1        
	//    5    5:invokespecial   #261 <Method void removeSpan(CacheSpan, boolean)>
		this;
	//    6    8:aload_0         
		JVM INSTR monitorexit ;
	//    7    9:monitorexit     
		return;
	//    8   10:return          
		cachespan;
	//    9   11:astore_1        
	//*  10   12:aload_0         
		throw cachespan;
	//   11   13:monitorexit     
	//   12   14:aload_1         
	//   13   15:athrow          
	}

	public File startFile(String s, long l, long l1)
		throws Cache.CacheException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Assertions.checkState(lockedSpans.containsKey(((Object) (s))));
	//    2    2:aload_0         
	//    3    3:getfield        #43  <Field HashMap lockedSpans>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #280 <Method boolean HashMap.containsKey(Object)>
	//    6   10:invokestatic    #216 <Method void Assertions.checkState(boolean)>
		if(!cacheDir.exists())
	//*   7   13:aload_0         
	//*   8   14:getfield        #36  <Field File cacheDir>
	//*   9   17:invokevirtual   #126 <Method boolean File.exists()>
	//*  10   20:ifne            35
		{
			removeStaleSpansAndCachedContents();
	//   11   23:aload_0         
	//   12   24:invokespecial   #129 <Method void removeStaleSpansAndCachedContents()>
			cacheDir.mkdirs();
	//   13   27:aload_0         
	//   14   28:getfield        #36  <Field File cacheDir>
	//   15   31:invokevirtual   #132 <Method boolean File.mkdirs()>
	//   16   34:pop             
		}
		evictor.onStartFile(((Cache) (this)), s, l, l1);
	//   17   35:aload_0         
	//   18   36:getfield        #38  <Field CacheEvictor evictor>
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:lload_2         
	//   22   42:lload           4
	//   23   44:invokeinterface #315 <Method void CacheEvictor.onStartFile(Cache, String, long, long)>
		s = ((String) (SimpleCacheSpan.getCacheFile(cacheDir, index.assignIdForKey(s), l, System.currentTimeMillis())));
	//   24   49:aload_0         
	//   25   50:getfield        #36  <Field File cacheDir>
	//   26   53:aload_0         
	//   27   54:getfield        #50  <Field CachedContentIndex index>
	//   28   57:aload_1         
	//   29   58:invokevirtual   #319 <Method int CachedContentIndex.assignIdForKey(String)>
	//   30   61:lload_2         
	//   31   62:invokestatic    #324 <Method long System.currentTimeMillis()>
	//   32   65:invokestatic    #328 <Method File SimpleCacheSpan.getCacheFile(File, int, long, long)>
	//   33   68:astore_1        
		this;
	//   34   69:aload_0         
		JVM INSTR monitorexit ;
	//   35   70:monitorexit     
		return ((File) (s));
	//   36   71:aload_1         
	//   37   72:areturn         
		s;
	//   38   73:astore_1        
	//*  39   74:aload_0         
		throw s;
	//   40   75:monitorexit     
	//   41   76:aload_1         
	//   42   77:athrow          
	}

	public volatile CacheSpan startReadWrite(String s, long l)
		throws InterruptedException, Cache.CacheException
	{
		return ((CacheSpan) (startReadWrite(s, l)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokevirtual   #334 <Method SimpleCacheSpan startReadWrite(String, long)>
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
	//    5    5:invokevirtual   #337 <Method SimpleCacheSpan startReadWriteNonBlocking(String, long)>
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
	//   14   21:invokevirtual   #340 <Method void Object.wait()>
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
	//    3    3:invokevirtual   #337 <Method SimpleCacheSpan startReadWriteNonBlocking(String, long)>
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
		if(initializationException != null)
			break MISSING_BLOCK_LABEL_81;
	//    2    2:aload_0         
	//    3    3:getfield        #78  <Field Cache$CacheException initializationException>
	//    4    6:ifnonnull       81
		simplecachespan = getSpan(s, l);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:lload_2         
	//    8   12:invokespecial   #342 <Method SimpleCacheSpan getSpan(String, long)>
	//    9   15:astore          4
		if(!simplecachespan.isCached)
			break MISSING_BLOCK_LABEL_50;
	//   10   17:aload           4
	//   11   19:getfield        #117 <Field boolean SimpleCacheSpan.isCached>
	//   12   22:ifeq            50
		s = ((String) (index.get(s).touch(simplecachespan)));
	//   13   25:aload_0         
	//   14   26:getfield        #50  <Field CachedContentIndex index>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #107 <Method CachedContent CachedContentIndex.get(String)>
	//   17   33:aload           4
	//   18   35:invokevirtual   #346 <Method SimpleCacheSpan CachedContent.touch(SimpleCacheSpan)>
	//   19   38:astore_1        
		notifySpanTouched(simplecachespan, ((CacheSpan) (s)));
	//   20   39:aload_0         
	//   21   40:aload           4
	//   22   42:aload_1         
	//   23   43:invokespecial   #348 <Method void notifySpanTouched(SimpleCacheSpan, CacheSpan)>
		this;
	//   24   46:aload_0         
		JVM INSTR monitorexit ;
	//   25   47:monitorexit     
		return ((SimpleCacheSpan) (s));
	//   26   48:aload_1         
	//   27   49:areturn         
		if(lockedSpans.containsKey(((Object) (s))))
			break MISSING_BLOCK_LABEL_77;
	//   28   50:aload_0         
	//   29   51:getfield        #43  <Field HashMap lockedSpans>
	//   30   54:aload_1         
	//   31   55:invokevirtual   #280 <Method boolean HashMap.containsKey(Object)>
	//   32   58:ifne            77
		lockedSpans.put(((Object) (s)), ((Object) (simplecachespan)));
	//   33   61:aload_0         
	//   34   62:getfield        #43  <Field HashMap lockedSpans>
	//   35   65:aload_1         
	//   36   66:aload           4
	//   37   68:invokevirtual   #268 <Method Object HashMap.put(Object, Object)>
	//   38   71:pop             
	//*  39   72:aload_0         
	//*  40   73:monitorexit     
		return simplecachespan;
	//   41   74:aload           4
	//   42   76:areturn         
		this;
	//   43   77:aload_0         
		JVM INSTR monitorexit ;
	//   44   78:monitorexit     
		return null;
	//   45   79:aconst_null     
	//   46   80:areturn         
		throw initializationException;
	//   47   81:aload_0         
	//   48   82:getfield        #78  <Field Cache$CacheException initializationException>
	//   49   85:athrow          
		s;
	//   50   86:astore_1        
		this;
	//   51   87:aload_0         
		JVM INSTR monitorexit ;
	//   52   88:monitorexit     
		throw s;
	//   53   89:aload_1         
	//   54   90:athrow          
	}

	private final File cacheDir;
	private final CacheEvictor evictor;
	private final CachedContentIndex index;
	private Cache.CacheException initializationException;
	private final HashMap listeners;
	private final HashMap lockedSpans;
	private long totalSpace;


/*
	static void access$000(SimpleCache simplecache)
		throws Cache.CacheException
	{
		simplecache.initialize();
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method void initialize()>
		return;
	//    2    4:return          
	}

*/


/*
	static Cache.CacheException access$102(SimpleCache simplecache, Cache.CacheException cacheexception)
	{
		simplecache.initializationException = cacheexception;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #78  <Field Cache$CacheException initializationException>
		return cacheexception;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static CacheEvictor access$200(SimpleCache simplecache)
	{
		return simplecache.evictor;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field CacheEvictor evictor>
	//    2    4:areturn         
	}

*/
}
