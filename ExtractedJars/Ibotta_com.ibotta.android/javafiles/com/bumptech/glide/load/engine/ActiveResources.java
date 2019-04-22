// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import android.os.Process;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

// Referenced classes of package com.bumptech.glide.load.engine:
//			EngineResource, Resource

final class ActiveResources
{
	static interface DequeuedResourceCallback
	{

		public abstract void onResourceDequeued();
	}

	static final class ResourceWeakReference extends WeakReference
	{

		void reset()
		{
			resource = null;
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:putfield        #46  <Field Resource resource>
			clear();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #57  <Method void clear()>
		//    5    9:return          
		}

		final boolean isCacheable;
		final Key key;
		Resource resource;

		ResourceWeakReference(Key key1, EngineResource engineresource, ReferenceQueue referencequeue, boolean flag)
		{
			super(((Object) (engineresource)), referencequeue);
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:invokespecial   #23  <Method void WeakReference(Object, ReferenceQueue)>
			key = (Key)Preconditions.checkNotNull(((Object) (key1)));
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokestatic    #29  <Method Object Preconditions.checkNotNull(Object)>
		//    7   11:checkcast       #31  <Class Key>
		//    8   14:putfield        #33  <Field Key key>
			if(engineresource.isCacheable() && flag)
		//*   9   17:aload_2         
		//*  10   18:invokevirtual   #38  <Method boolean EngineResource.isCacheable()>
		//*  11   21:ifeq            43
		//*  12   24:iload           4
		//*  13   26:ifeq            43
				key1 = ((Key) ((Resource)Preconditions.checkNotNull(((Object) (engineresource.getResource())))));
		//   14   29:aload_2         
		//   15   30:invokevirtual   #42  <Method Resource EngineResource.getResource()>
		//   16   33:invokestatic    #29  <Method Object Preconditions.checkNotNull(Object)>
		//   17   36:checkcast       #44  <Class Resource>
		//   18   39:astore_1        
			else
		//*  19   40:goto            45
				key1 = null;
		//   20   43:aconst_null     
		//   21   44:astore_1        
			resource = ((Resource) (key1));
		//   22   45:aload_0         
		//   23   46:aload_1         
		//   24   47:putfield        #46  <Field Resource resource>
			isCacheable = engineresource.isCacheable();
		//   25   50:aload_0         
		//   26   51:aload_2         
		//   27   52:invokevirtual   #38  <Method boolean EngineResource.isCacheable()>
		//   28   55:putfield        #48  <Field boolean isCacheable>
		//   29   58:return          
		}
	}


	ActiveResources(boolean flag)
	{
		this(flag, ((Executor) (Executors.newSingleThreadExecutor(new ThreadFactory() {

			public Thread newThread(Runnable runnable)
			{
				return new Thread(((_cls1) (runnable)). new Runnable() {

					public void run()
					{
						Process.setThreadPriority(10);
					//    0    0:bipush          10
					//    1    2:invokestatic    #32  <Method void Process.setThreadPriority(int)>
						r.run();
					//    2    5:aload_0         
					//    3    6:getfield        #21  <Field Runnable val$r>
					//    4    9:invokeinterface #34  <Method void Runnable.run()>
					//    5   14:return          
					}

					final _cls1 this$1;
					final Runnable val$r;

			
			{
				this$1 = final__pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ActiveResources$1 this$1>
				r = Runnable.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Runnable val$r>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
				}
, "glide-active-resources");
			//    0    0:new             #22  <Class Thread>
			//    1    3:dup             
			//    2    4:new             #13  <Class ActiveResources$1$1>
			//    3    7:dup             
			//    4    8:aload_0         
			//    5    9:aload_1         
			//    6   10:invokespecial   #25  <Method void ActiveResources$1$1(ActiveResources$1, Runnable)>
			//    7   13:ldc1            #27  <String "glide-active-resources">
			//    8   15:invokespecial   #30  <Method void Thread(Runnable, String)>
			//    9   18:areturn         
			}

		}
))));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:new             #6   <Class ActiveResources$1>
	//    3    5:dup             
	//    4    6:invokespecial   #38  <Method void ActiveResources$1()>
	//    5    9:invokestatic    #44  <Method java.util.concurrent.ExecutorService Executors.newSingleThreadExecutor(ThreadFactory)>
	//    6   12:invokespecial   #47  <Method void ActiveResources(boolean, Executor)>
	//    7   15:return          
	}

	ActiveResources(boolean flag, Executor executor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
		activeEngineResources = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #51  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #52  <Method void HashMap()>
	//    6   12:putfield        #54  <Field Map activeEngineResources>
		resourceReferenceQueue = new ReferenceQueue();
	//    7   15:aload_0         
	//    8   16:new             #56  <Class ReferenceQueue>
	//    9   19:dup             
	//   10   20:invokespecial   #57  <Method void ReferenceQueue()>
	//   11   23:putfield        #59  <Field ReferenceQueue resourceReferenceQueue>
		isActiveResourceRetentionAllowed = flag;
	//   12   26:aload_0         
	//   13   27:iload_1         
	//   14   28:putfield        #61  <Field boolean isActiveResourceRetentionAllowed>
		monitorClearedResourcesExecutor = executor;
	//   15   31:aload_0         
	//   16   32:aload_2         
	//   17   33:putfield        #63  <Field Executor monitorClearedResourcesExecutor>
		executor.execute(new Runnable() {

			public void run()
			{
				cleanReferenceQueue();
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field ActiveResources this$0>
			//    2    4:invokevirtual   #24  <Method void ActiveResources.cleanReferenceQueue()>
			//    3    7:return          
			}

			final ActiveResources this$0;

			
			{
				this$0 = ActiveResources.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field ActiveResources this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   18   36:aload_2         
	//   19   37:new             #10  <Class ActiveResources$2>
	//   20   40:dup             
	//   21   41:aload_0         
	//   22   42:invokespecial   #66  <Method void ActiveResources$2(ActiveResources)>
	//   23   45:invokeinterface #72  <Method void Executor.execute(Runnable)>
	//   24   50:return          
	}

	void activate(Key key, EngineResource engineresource)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		engineresource = ((EngineResource) (new ResourceWeakReference(key, engineresource, resourceReferenceQueue, isActiveResourceRetentionAllowed)));
	//    2    2:new             #15  <Class ActiveResources$ResourceWeakReference>
	//    3    5:dup             
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_0         
	//    7    9:getfield        #59  <Field ReferenceQueue resourceReferenceQueue>
	//    8   12:aload_0         
	//    9   13:getfield        #61  <Field boolean isActiveResourceRetentionAllowed>
	//   10   16:invokespecial   #78  <Method void ActiveResources$ResourceWeakReference(Key, EngineResource, ReferenceQueue, boolean)>
	//   11   19:astore_2        
		key = ((Key) ((ResourceWeakReference)activeEngineResources.put(((Object) (key)), ((Object) (engineresource)))));
	//   12   20:aload_0         
	//   13   21:getfield        #54  <Field Map activeEngineResources>
	//   14   24:aload_1         
	//   15   25:aload_2         
	//   16   26:invokeinterface #84  <Method Object Map.put(Object, Object)>
	//   17   31:checkcast       #15  <Class ActiveResources$ResourceWeakReference>
	//   18   34:astore_1        
		if(key == null)
			break MISSING_BLOCK_LABEL_43;
	//   19   35:aload_1         
	//   20   36:ifnull          43
		((ResourceWeakReference) (key)).reset();
	//   21   39:aload_1         
	//   22   40:invokevirtual   #87  <Method void ActiveResources$ResourceWeakReference.reset()>
		this;
	//   23   43:aload_0         
		JVM INSTR monitorexit ;
	//   24   44:monitorexit     
		return;
	//   25   45:return          
		key;
	//   26   46:astore_1        
	//*  27   47:aload_0         
		throw key;
	//   28   48:monitorexit     
	//   29   49:aload_1         
	//   30   50:athrow          
	}

	void cleanReferenceQueue()
	{
_L2:
		if(isShutdown)
			break; /* Loop/switch isn't completed */
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field boolean isShutdown>
	//    2    4:ifne            48
		DequeuedResourceCallback dequeuedresourcecallback;
		cleanupActiveReference((ResourceWeakReference)resourceReferenceQueue.remove());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #59  <Field ReferenceQueue resourceReferenceQueue>
	//    6   12:invokevirtual   #98  <Method java.lang.ref.Reference ReferenceQueue.remove()>
	//    7   15:checkcast       #15  <Class ActiveResources$ResourceWeakReference>
	//    8   18:invokevirtual   #102 <Method void cleanupActiveReference(ActiveResources$ResourceWeakReference)>
		dequeuedresourcecallback = cb;
	//    9   21:aload_0         
	//   10   22:getfield        #104 <Field ActiveResources$DequeuedResourceCallback cb>
	//   11   25:astore_1        
		if(dequeuedresourcecallback != null)
	//*  12   26:aload_1         
	//*  13   27:ifnull          0
			try
			{
				dequeuedresourcecallback.onResourceDequeued();
	//   14   30:aload_1         
	//   15   31:invokeinterface #107 <Method void ActiveResources$DequeuedResourceCallback.onResourceDequeued()>
			}
	//*  16   36:goto            0
	//*  17   39:invokestatic    #113 <Method Thread Thread.currentThread()>
	//*  18   42:invokevirtual   #116 <Method void Thread.interrupt()>
	//*  19   45:goto            0
	//*  20   48:return          
			// Misplaced declaration of an exception variable
			catch(InterruptedException interruptedexception)
			{
				Thread.currentThread().interrupt();
			}
		if(true) goto _L2; else goto _L1
_L1:
		InterruptedException interruptedexception;
	//*  21   49:astore_1        
	//*  22   50:goto            39
	}

	void cleanupActiveReference(ResourceWeakReference resourceweakreference)
	{
		EngineResource.ResourceListener resourcelistener = listener;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field EngineResource$ResourceListener listener>
	//    2    4:astore_2        
		resourcelistener;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		this;
	//    5    7:aload_0         
		JVM INSTR monitorenter ;
	//    6    8:monitorenter    
		activeEngineResources.remove(((Object) (resourceweakreference.key)));
	//    7    9:aload_0         
	//    8   10:getfield        #54  <Field Map activeEngineResources>
	//    9   13:aload_1         
	//   10   14:getfield        #123 <Field Key ActiveResources$ResourceWeakReference.key>
	//   11   17:invokeinterface #126 <Method Object Map.remove(Object)>
	//   12   22:pop             
		if(!resourceweakreference.isCacheable || resourceweakreference.resource == null)
	//*  13   23:aload_1         
	//*  14   24:getfield        #129 <Field boolean ActiveResources$ResourceWeakReference.isCacheable>
	//*  15   27:ifeq            85
	//*  16   30:aload_1         
	//*  17   31:getfield        #133 <Field Resource ActiveResources$ResourceWeakReference.resource>
	//*  18   34:ifnonnull       40
			break MISSING_BLOCK_LABEL_85;
	//   19   37:goto            85
		EngineResource engineresource = new EngineResource(resourceweakreference.resource, true, false);
	//   20   40:new             #135 <Class EngineResource>
	//   21   43:dup             
	//   22   44:aload_1         
	//   23   45:getfield        #133 <Field Resource ActiveResources$ResourceWeakReference.resource>
	//   24   48:iconst_1        
	//   25   49:iconst_0        
	//   26   50:invokespecial   #138 <Method void EngineResource(Resource, boolean, boolean)>
	//   27   53:astore_3        
		engineresource.setResourceListener(resourceweakreference.key, listener);
	//   28   54:aload_3         
	//   29   55:aload_1         
	//   30   56:getfield        #123 <Field Key ActiveResources$ResourceWeakReference.key>
	//   31   59:aload_0         
	//   32   60:getfield        #119 <Field EngineResource$ResourceListener listener>
	//   33   63:invokevirtual   #142 <Method void EngineResource.setResourceListener(Key, EngineResource$ResourceListener)>
		listener.onResourceReleased(resourceweakreference.key, engineresource);
	//   34   66:aload_0         
	//   35   67:getfield        #119 <Field EngineResource$ResourceListener listener>
	//   36   70:aload_1         
	//   37   71:getfield        #123 <Field Key ActiveResources$ResourceWeakReference.key>
	//   38   74:aload_3         
	//   39   75:invokeinterface #147 <Method void EngineResource$ResourceListener.onResourceReleased(Key, EngineResource)>
		this;
	//   40   80:aload_0         
		JVM INSTR monitorexit ;
	//   41   81:monitorexit     
		resourcelistener;
	//   42   82:aload_2         
		JVM INSTR monitorexit ;
	//   43   83:monitorexit     
		return;
	//   44   84:return          
		this;
	//   45   85:aload_0         
		JVM INSTR monitorexit ;
	//   46   86:monitorexit     
		resourcelistener;
	//   47   87:aload_2         
		JVM INSTR monitorexit ;
	//   48   88:monitorexit     
		return;
	//   49   89:return          
		resourceweakreference;
	//   50   90:astore_1        
		this;
	//   51   91:aload_0         
		JVM INSTR monitorexit ;
	//   52   92:monitorexit     
		throw resourceweakreference;
	//   53   93:aload_1         
	//   54   94:athrow          
		resourceweakreference;
	//   55   95:astore_1        
		resourcelistener;
	//   56   96:aload_2         
		JVM INSTR monitorexit ;
	//   57   97:monitorexit     
		throw resourceweakreference;
	//   58   98:aload_1         
	//   59   99:athrow          
	}

	void deactivate(Key key)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		key = ((Key) ((ResourceWeakReference)activeEngineResources.remove(((Object) (key)))));
	//    2    2:aload_0         
	//    3    3:getfield        #54  <Field Map activeEngineResources>
	//    4    6:aload_1         
	//    5    7:invokeinterface #126 <Method Object Map.remove(Object)>
	//    6   12:checkcast       #15  <Class ActiveResources$ResourceWeakReference>
	//    7   15:astore_1        
		if(key == null)
			break MISSING_BLOCK_LABEL_24;
	//    8   16:aload_1         
	//    9   17:ifnull          24
		((ResourceWeakReference) (key)).reset();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #87  <Method void ActiveResources$ResourceWeakReference.reset()>
		this;
	//   12   24:aload_0         
		JVM INSTR monitorexit ;
	//   13   25:monitorexit     
		return;
	//   14   26:return          
		key;
	//   15   27:astore_1        
	//*  16   28:aload_0         
		throw key;
	//   17   29:monitorexit     
	//   18   30:aload_1         
	//   19   31:athrow          
	}

	EngineResource get(Key key)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		key = ((Key) ((ResourceWeakReference)activeEngineResources.get(((Object) (key)))));
	//    2    2:aload_0         
	//    3    3:getfield        #54  <Field Map activeEngineResources>
	//    4    6:aload_1         
	//    5    7:invokeinterface #154 <Method Object Map.get(Object)>
	//    6   12:checkcast       #15  <Class ActiveResources$ResourceWeakReference>
	//    7   15:astore_1        
		if(key != null)
			break MISSING_BLOCK_LABEL_24;
	//    8   16:aload_1         
	//    9   17:ifnonnull       24
		this;
	//   10   20:aload_0         
		JVM INSTR monitorexit ;
	//   11   21:monitorexit     
		return null;
	//   12   22:aconst_null     
	//   13   23:areturn         
		EngineResource engineresource = (EngineResource)((ResourceWeakReference) (key)).get();
	//   14   24:aload_1         
	//   15   25:invokevirtual   #157 <Method Object ActiveResources$ResourceWeakReference.get()>
	//   16   28:checkcast       #135 <Class EngineResource>
	//   17   31:astore_2        
		if(engineresource != null)
			break MISSING_BLOCK_LABEL_41;
	//   18   32:aload_2         
	//   19   33:ifnonnull       41
		cleanupActiveReference(((ResourceWeakReference) (key)));
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:invokevirtual   #102 <Method void cleanupActiveReference(ActiveResources$ResourceWeakReference)>
		this;
	//   23   41:aload_0         
		JVM INSTR monitorexit ;
	//   24   42:monitorexit     
		return engineresource;
	//   25   43:aload_2         
	//   26   44:areturn         
		key;
	//   27   45:astore_1        
	//*  28   46:aload_0         
		throw key;
	//   29   47:monitorexit     
	//   30   48:aload_1         
	//   31   49:athrow          
	}

	void setListener(EngineResource.ResourceListener resourcelistener)
	{
		resourcelistener;
	//    0    0:aload_1         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		this;
	//    2    2:aload_0         
		JVM INSTR monitorenter ;
	//    3    3:monitorenter    
		listener = resourcelistener;
	//    4    4:aload_0         
	//    5    5:aload_1         
	//    6    6:putfield        #119 <Field EngineResource$ResourceListener listener>
		this;
	//    7    9:aload_0         
		JVM INSTR monitorexit ;
	//    8   10:monitorexit     
		resourcelistener;
	//    9   11:aload_1         
		JVM INSTR monitorexit ;
	//   10   12:monitorexit     
		return;
	//   11   13:return          
		Exception exception;
		exception;
	//   12   14:astore_2        
		this;
	//   13   15:aload_0         
		JVM INSTR monitorexit ;
	//   14   16:monitorexit     
		throw exception;
	//   15   17:aload_2         
	//   16   18:athrow          
		exception;
	//   17   19:astore_2        
		resourcelistener;
	//   18   20:aload_1         
		JVM INSTR monitorexit ;
	//   19   21:monitorexit     
		throw exception;
	//   20   22:aload_2         
	//   21   23:athrow          
	}

	final Map activeEngineResources;
	private volatile DequeuedResourceCallback cb;
	private final boolean isActiveResourceRetentionAllowed;
	private volatile boolean isShutdown;
	private EngineResource.ResourceListener listener;
	private final Executor monitorClearedResourcesExecutor;
	private final ReferenceQueue resourceReferenceQueue;
}
