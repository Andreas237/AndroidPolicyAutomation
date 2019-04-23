// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import android.os.*;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

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
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #43  <Class Handler>
	//    4    8:dup             
	//    5    9:invokestatic    #49  <Method Looper Looper.getMainLooper()>
	//    6   12:new             #6   <Class ActiveResources$1>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokespecial   #52  <Method void ActiveResources$1(ActiveResources)>
	//   10   20:invokespecial   #55  <Method void Handler(Looper, android.os.Handler$Callback)>
	//   11   23:putfield        #57  <Field Handler mainHandler>
	//   12   26:aload_0         
	//   13   27:new             #59  <Class HashMap>
	//   14   30:dup             
	//   15   31:invokespecial   #60  <Method void HashMap()>
	//   16   34:putfield        #62  <Field Map activeEngineResources>
		isActiveResourceRetentionAllowed = flag;
	//   17   37:aload_0         
	//   18   38:iload_1         
	//   19   39:putfield        #64  <Field boolean isActiveResourceRetentionAllowed>
	//   20   42:return          
	}

	private ReferenceQueue getReferenceQueue()
	{
		if(resourceReferenceQueue == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field ReferenceQueue resourceReferenceQueue>
	//*   2    4:ifnonnull       46
		{
			resourceReferenceQueue = new ReferenceQueue();
	//    3    7:aload_0         
	//    4    8:new             #71  <Class ReferenceQueue>
	//    5   11:dup             
	//    6   12:invokespecial   #72  <Method void ReferenceQueue()>
	//    7   15:putfield        #69  <Field ReferenceQueue resourceReferenceQueue>
			cleanReferenceQueueThread = new Thread(new Runnable() {

				public void run()
				{
					Process.setThreadPriority(10);
				//    0    0:bipush          10
				//    1    2:invokestatic    #28  <Method void Process.setThreadPriority(int)>
					cleanReferenceQueue();
				//    2    5:aload_0         
				//    3    6:getfield        #17  <Field ActiveResources this$0>
				//    4    9:invokevirtual   #31  <Method void ActiveResources.cleanReferenceQueue()>
				//    5   12:return          
				}

				final ActiveResources this$0;

			
			{
				this$0 = ActiveResources.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ActiveResources this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
, "glide-active-resources");
	//    8   18:aload_0         
	//    9   19:new             #74  <Class Thread>
	//   10   22:dup             
	//   11   23:new             #8   <Class ActiveResources$2>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:invokespecial   #75  <Method void ActiveResources$2(ActiveResources)>
	//   15   31:ldc1            #77  <String "glide-active-resources">
	//   16   33:invokespecial   #80  <Method void Thread(Runnable, String)>
	//   17   36:putfield        #82  <Field Thread cleanReferenceQueueThread>
			cleanReferenceQueueThread.start();
	//   18   39:aload_0         
	//   19   40:getfield        #82  <Field Thread cleanReferenceQueueThread>
	//   20   43:invokevirtual   #85  <Method void Thread.start()>
		}
		return resourceReferenceQueue;
	//   21   46:aload_0         
	//   22   47:getfield        #69  <Field ReferenceQueue resourceReferenceQueue>
	//   23   50:areturn         
	}

	void activate(Key key, EngineResource engineresource)
	{
		engineresource = ((EngineResource) (new ResourceWeakReference(key, engineresource, getReferenceQueue(), isActiveResourceRetentionAllowed)));
	//    0    0:new             #13  <Class ActiveResources$ResourceWeakReference>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_0         
	//    5    7:invokespecial   #91  <Method ReferenceQueue getReferenceQueue()>
	//    6   10:aload_0         
	//    7   11:getfield        #64  <Field boolean isActiveResourceRetentionAllowed>
	//    8   14:invokespecial   #94  <Method void ActiveResources$ResourceWeakReference(Key, EngineResource, ReferenceQueue, boolean)>
	//    9   17:astore_2        
		key = ((Key) ((ResourceWeakReference)activeEngineResources.put(((Object) (key)), ((Object) (engineresource)))));
	//   10   18:aload_0         
	//   11   19:getfield        #62  <Field Map activeEngineResources>
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:invokeinterface #100 <Method Object Map.put(Object, Object)>
	//   15   29:checkcast       #13  <Class ActiveResources$ResourceWeakReference>
	//   16   32:astore_1        
		if(key != null)
	//*  17   33:aload_1         
	//*  18   34:ifnull          41
			((ResourceWeakReference) (key)).reset();
	//   19   37:aload_1         
	//   20   38:invokevirtual   #103 <Method void ActiveResources$ResourceWeakReference.reset()>
	//   21   41:return          
	}

	void cleanReferenceQueue()
	{
_L2:
		if(isShutdown)
			break; /* Loop/switch isn't completed */
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field boolean isShutdown>
	//    2    4:ifne            57
		Object obj;
		obj = ((Object) ((ResourceWeakReference)resourceReferenceQueue.remove()));
	//    3    7:aload_0         
	//    4    8:getfield        #69  <Field ReferenceQueue resourceReferenceQueue>
	//    5   11:invokevirtual   #113 <Method java.lang.ref.Reference ReferenceQueue.remove()>
	//    6   14:checkcast       #13  <Class ActiveResources$ResourceWeakReference>
	//    7   17:astore_1        
		mainHandler.obtainMessage(1, obj).sendToTarget();
	//    8   18:aload_0         
	//    9   19:getfield        #57  <Field Handler mainHandler>
	//   10   22:iconst_1        
	//   11   23:aload_1         
	//   12   24:invokevirtual   #117 <Method Message Handler.obtainMessage(int, Object)>
	//   13   27:invokevirtual   #122 <Method void Message.sendToTarget()>
		obj = ((Object) (cb));
	//   14   30:aload_0         
	//   15   31:getfield        #124 <Field ActiveResources$DequeuedResourceCallback cb>
	//   16   34:astore_1        
		if(obj != null)
	//*  17   35:aload_1         
	//*  18   36:ifnull          0
			try
			{
				((DequeuedResourceCallback) (obj)).onResourceDequeued();
	//   19   39:aload_1         
	//   20   40:invokeinterface #127 <Method void ActiveResources$DequeuedResourceCallback.onResourceDequeued()>
			}
	//*  21   45:goto            0
	//*  22   48:invokestatic    #131 <Method Thread Thread.currentThread()>
	//*  23   51:invokevirtual   #134 <Method void Thread.interrupt()>
	//*  24   54:goto            0
	//*  25   57:return          
			// Misplaced declaration of an exception variable
			catch(InterruptedException interruptedexception)
			{
				Thread.currentThread().interrupt();
			}
		if(true) goto _L2; else goto _L1
_L1:
		InterruptedException interruptedexception;
	//*  26   58:astore_1        
	//*  27   59:goto            48
	}

	void cleanupActiveReference(ResourceWeakReference resourceweakreference)
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #142 <Method void Util.assertMainThread()>
		activeEngineResources.remove(((Object) (resourceweakreference.key)));
	//    1    3:aload_0         
	//    2    4:getfield        #62  <Field Map activeEngineResources>
	//    3    7:aload_1         
	//    4    8:getfield        #146 <Field Key ActiveResources$ResourceWeakReference.key>
	//    5   11:invokeinterface #149 <Method Object Map.remove(Object)>
	//    6   16:pop             
		if(resourceweakreference.isCacheable)
	//*   7   17:aload_1         
	//*   8   18:getfield        #152 <Field boolean ActiveResources$ResourceWeakReference.isCacheable>
	//*   9   21:ifeq            73
		{
			if(resourceweakreference.resource == null)
	//*  10   24:aload_1         
	//*  11   25:getfield        #156 <Field Resource ActiveResources$ResourceWeakReference.resource>
	//*  12   28:ifnonnull       32
			{
				return;
	//   13   31:return          
			} else
			{
				EngineResource engineresource = new EngineResource(resourceweakreference.resource, true, false);
	//   14   32:new             #158 <Class EngineResource>
	//   15   35:dup             
	//   16   36:aload_1         
	//   17   37:getfield        #156 <Field Resource ActiveResources$ResourceWeakReference.resource>
	//   18   40:iconst_1        
	//   19   41:iconst_0        
	//   20   42:invokespecial   #161 <Method void EngineResource(Resource, boolean, boolean)>
	//   21   45:astore_2        
				engineresource.setResourceListener(resourceweakreference.key, listener);
	//   22   46:aload_2         
	//   23   47:aload_1         
	//   24   48:getfield        #146 <Field Key ActiveResources$ResourceWeakReference.key>
	//   25   51:aload_0         
	//   26   52:getfield        #163 <Field EngineResource$ResourceListener listener>
	//   27   55:invokevirtual   #167 <Method void EngineResource.setResourceListener(Key, EngineResource$ResourceListener)>
				listener.onResourceReleased(resourceweakreference.key, engineresource);
	//   28   58:aload_0         
	//   29   59:getfield        #163 <Field EngineResource$ResourceListener listener>
	//   30   62:aload_1         
	//   31   63:getfield        #146 <Field Key ActiveResources$ResourceWeakReference.key>
	//   32   66:aload_2         
	//   33   67:invokeinterface #172 <Method void EngineResource$ResourceListener.onResourceReleased(Key, EngineResource)>
				return;
	//   34   72:return          
			}
		} else
		{
			return;
	//   35   73:return          
		}
	}

	void deactivate(Key key)
	{
		key = ((Key) ((ResourceWeakReference)activeEngineResources.remove(((Object) (key)))));
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Map activeEngineResources>
	//    2    4:aload_1         
	//    3    5:invokeinterface #149 <Method Object Map.remove(Object)>
	//    4   10:checkcast       #13  <Class ActiveResources$ResourceWeakReference>
	//    5   13:astore_1        
		if(key != null)
	//*   6   14:aload_1         
	//*   7   15:ifnull          22
			((ResourceWeakReference) (key)).reset();
	//    8   18:aload_1         
	//    9   19:invokevirtual   #103 <Method void ActiveResources$ResourceWeakReference.reset()>
	//   10   22:return          
	}

	EngineResource get(Key key)
	{
		key = ((Key) ((ResourceWeakReference)activeEngineResources.get(((Object) (key)))));
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Map activeEngineResources>
	//    2    4:aload_1         
	//    3    5:invokeinterface #179 <Method Object Map.get(Object)>
	//    4   10:checkcast       #13  <Class ActiveResources$ResourceWeakReference>
	//    5   13:astore_1        
		if(key == null)
	//*   6   14:aload_1         
	//*   7   15:ifnonnull       20
			return null;
	//    8   18:aconst_null     
	//    9   19:areturn         
		EngineResource engineresource = (EngineResource)((ResourceWeakReference) (key)).get();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #182 <Method Object ActiveResources$ResourceWeakReference.get()>
	//   12   24:checkcast       #158 <Class EngineResource>
	//   13   27:astore_2        
		if(engineresource == null)
	//*  14   28:aload_2         
	//*  15   29:ifnonnull       37
			cleanupActiveReference(((ResourceWeakReference) (key)));
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #184 <Method void cleanupActiveReference(ActiveResources$ResourceWeakReference)>
		return engineresource;
	//   19   37:aload_2         
	//   20   38:areturn         
	}

	void setDequeuedResourceCallback(DequeuedResourceCallback dequeuedresourcecallback)
	{
		cb = dequeuedresourcecallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #124 <Field ActiveResources$DequeuedResourceCallback cb>
	//    3    5:return          
	}

	void setListener(EngineResource.ResourceListener resourcelistener)
	{
		listener = resourcelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #163 <Field EngineResource$ResourceListener listener>
	//    3    5:return          
	}

	void shutdown()
	{
		isShutdown = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #109 <Field boolean isShutdown>
		Thread thread = cleanReferenceQueueThread;
	//    3    5:aload_0         
	//    4    6:getfield        #82  <Field Thread cleanReferenceQueueThread>
	//    5    9:astore_1        
		if(thread == null)
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       15
			return;
	//    8   14:return          
		thread.interrupt();
	//    9   15:aload_1         
	//   10   16:invokevirtual   #134 <Method void Thread.interrupt()>
		cleanReferenceQueueThread.join(TimeUnit.SECONDS.toMillis(5L));
	//   11   19:aload_0         
	//   12   20:getfield        #82  <Field Thread cleanReferenceQueueThread>
	//   13   23:getstatic       #197 <Field TimeUnit TimeUnit.SECONDS>
	//   14   26:ldc2w           #198 <Long 5L>
	//   15   29:invokevirtual   #203 <Method long TimeUnit.toMillis(long)>
	//   16   32:invokevirtual   #207 <Method void Thread.join(long)>
		if(!cleanReferenceQueueThread.isAlive())
	//*  17   35:aload_0         
	//*  18   36:getfield        #82  <Field Thread cleanReferenceQueueThread>
	//*  19   39:invokevirtual   #211 <Method boolean Thread.isAlive()>
	//*  20   42:ifne            46
			return;
	//   21   45:return          
		InterruptedException interruptedexception;
		try
		{
			throw new RuntimeException("Failed to join in time");
	//   22   46:new             #213 <Class RuntimeException>
	//   23   49:dup             
	//   24   50:ldc1            #215 <String "Failed to join in time">
	//   25   52:invokespecial   #218 <Method void RuntimeException(String)>
	//   26   55:athrow          
		}
	//*  27   56:invokestatic    #131 <Method Thread Thread.currentThread()>
	//*  28   59:invokevirtual   #134 <Method void Thread.interrupt()>
	//*  29   62:return          
		// Misplaced declaration of an exception variable
		catch(InterruptedException interruptedexception)
		{
			Thread.currentThread().interrupt();
		}
		return;
	//*  30   63:astore_1        
	//*  31   64:goto            56
	}

	private static final int MSG_CLEAN_REF = 1;
	final Map activeEngineResources = new HashMap();
	private volatile DequeuedResourceCallback cb;
	private Thread cleanReferenceQueueThread;
	private final boolean isActiveResourceRetentionAllowed;
	private volatile boolean isShutdown;
	private EngineResource.ResourceListener listener;
	private final Handler mainHandler = new Handler(Looper.getMainLooper(), new android.os.Handler.Callback() {

		public boolean handleMessage(Message message)
		{
			if(message.what == 1)
		//*   0    0:aload_1         
		//*   1    1:getfield        #26  <Field int Message.what>
		//*   2    4:iconst_1        
		//*   3    5:icmpne          24
			{
				cleanupActiveReference((ResourceWeakReference)message.obj);
		//    4    8:aload_0         
		//    5    9:getfield        #14  <Field ActiveResources this$0>
		//    6   12:aload_1         
		//    7   13:getfield        #30  <Field Object Message.obj>
		//    8   16:checkcast       #32  <Class ActiveResources$ResourceWeakReference>
		//    9   19:invokevirtual   #36  <Method void ActiveResources.cleanupActiveReference(ActiveResources$ResourceWeakReference)>
				return true;
		//   10   22:iconst_1        
		//   11   23:ireturn         
			} else
			{
				return false;
		//   12   24:iconst_0        
		//   13   25:ireturn         
			}
		}

		final ActiveResources this$0;

			
			{
				this$0 = ActiveResources.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ActiveResources this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
);
	private ReferenceQueue resourceReferenceQueue;
}
