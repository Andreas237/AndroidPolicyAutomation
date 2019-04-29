// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Util;
import java.util.Queue;

public class ModelCache
{
	static final class ModelKey
	{

		static ModelKey get(Object obj, int i, int j)
		{
			Queue queue = KEY_QUEUE;
		//    0    0:getstatic       #27  <Field Queue KEY_QUEUE>
		//    1    3:astore_3        
			queue;
		//    2    4:aload_3         
			JVM INSTR monitorenter ;
		//    3    5:monitorenter    
			ModelKey modelkey1 = (ModelKey)KEY_QUEUE.poll();
		//    4    6:getstatic       #27  <Field Queue KEY_QUEUE>
		//    5    9:invokeinterface #39  <Method Object Queue.poll()>
		//    6   14:checkcast       #2   <Class ModelCache$ModelKey>
		//    7   17:astore          4
			queue;
		//    8   19:aload_3         
			JVM INSTR monitorexit ;
		//    9   20:monitorexit     
			  goto _L1
		//*  10   21:goto            29
			obj;
		//   11   24:astore_0        
		//*  12   25:aload_3         
			throw obj;
		//   13   26:monitorexit     
		//   14   27:aload_0         
		//   15   28:athrow          
_L1:
			ModelKey modelkey = modelkey1;
		//   16   29:aload           4
		//   17   31:astore_3        
			if(modelkey1 == null)
		//*  18   32:aload           4
		//*  19   34:ifnonnull       45
				modelkey = new ModelKey();
		//   20   37:new             #2   <Class ModelCache$ModelKey>
		//   21   40:dup             
		//   22   41:invokespecial   #40  <Method void ModelCache$ModelKey()>
		//   23   44:astore_3        
			modelkey.init(obj, i, j);
		//   24   45:aload_3         
		//   25   46:aload_0         
		//   26   47:iload_1         
		//   27   48:iload_2         
		//   28   49:invokespecial   #44  <Method void init(Object, int, int)>
			return modelkey;
		//   29   52:aload_3         
		//   30   53:areturn         
		}

		private void init(Object obj, int i, int j)
		{
			model = obj;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #48  <Field Object model>
			width = i;
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:putfield        #50  <Field int width>
			height = j;
		//    6   10:aload_0         
		//    7   11:iload_3         
		//    8   12:putfield        #52  <Field int height>
		//    9   15:return          
		}

		public boolean equals(Object obj)
		{
			if(obj instanceof ModelKey)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #2   <Class ModelCache$ModelKey>
		//*   2    4:ifeq            52
			{
				obj = ((Object) ((ModelKey)obj));
		//    3    7:aload_1         
		//    4    8:checkcast       #2   <Class ModelCache$ModelKey>
		//    5   11:astore_1        
				return width == ((ModelKey) (obj)).width && height == ((ModelKey) (obj)).height && model.equals(((ModelKey) (obj)).model);
		//    6   12:aload_0         
		//    7   13:getfield        #50  <Field int width>
		//    8   16:aload_1         
		//    9   17:getfield        #50  <Field int width>
		//   10   20:icmpne          50
		//   11   23:aload_0         
		//   12   24:getfield        #52  <Field int height>
		//   13   27:aload_1         
		//   14   28:getfield        #52  <Field int height>
		//   15   31:icmpne          50
		//   16   34:aload_0         
		//   17   35:getfield        #48  <Field Object model>
		//   18   38:aload_1         
		//   19   39:getfield        #48  <Field Object model>
		//   20   42:invokevirtual   #57  <Method boolean Object.equals(Object)>
		//   21   45:ifeq            50
		//   22   48:iconst_1        
		//   23   49:ireturn         
		//   24   50:iconst_0        
		//   25   51:ireturn         
			} else
			{
				return false;
		//   26   52:iconst_0        
		//   27   53:ireturn         
			}
		}

		public int hashCode()
		{
			return (height * 31 + width) * 31 + model.hashCode();
		//    0    0:aload_0         
		//    1    1:getfield        #52  <Field int height>
		//    2    4:bipush          31
		//    3    6:imul            
		//    4    7:aload_0         
		//    5    8:getfield        #50  <Field int width>
		//    6   11:iadd            
		//    7   12:bipush          31
		//    8   14:imul            
		//    9   15:aload_0         
		//   10   16:getfield        #48  <Field Object model>
		//   11   19:invokevirtual   #61  <Method int Object.hashCode()>
		//   12   22:iadd            
		//   13   23:ireturn         
		}

		public void release()
		{
			Queue queue = KEY_QUEUE;
		//    0    0:getstatic       #27  <Field Queue KEY_QUEUE>
		//    1    3:astore_1        
			queue;
		//    2    4:aload_1         
			JVM INSTR monitorenter ;
		//    3    5:monitorenter    
			KEY_QUEUE.offer(((Object) (this)));
		//    4    6:getstatic       #27  <Field Queue KEY_QUEUE>
		//    5    9:aload_0         
		//    6   10:invokeinterface #65  <Method boolean Queue.offer(Object)>
		//    7   15:pop             
			queue;
		//    8   16:aload_1         
			JVM INSTR monitorexit ;
		//    9   17:monitorexit     
			return;
		//   10   18:return          
			Exception exception;
			exception;
		//   11   19:astore_2        
		//*  12   20:aload_1         
			throw exception;
		//   13   21:monitorexit     
		//   14   22:aload_2         
		//   15   23:athrow          
		}

		private static final Queue KEY_QUEUE = Util.createQueue(0);
		private int height;
		private Object model;
		private int width;

		static 
		{
		//    0    0:iconst_0        
		//    1    1:invokestatic    #25  <Method Queue Util.createQueue(int)>
		//    2    4:putstatic       #27  <Field Queue KEY_QUEUE>
		//*   3    7:return          
		}

		private ModelKey()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #31  <Method void Object()>
		//    2    4:return          
		}
	}


	public ModelCache()
	{
		this(250);
	//    0    0:aload_0         
	//    1    1:sipush          250
	//    2    4:invokespecial   #21  <Method void ModelCache(int)>
	//    3    7:return          
	}

	public ModelCache(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		cache = ((LruCache) (new LruCache(i) {

			protected void onItemEvicted(ModelKey modelkey, Object obj)
			{
				modelkey.release();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #25  <Method void ModelCache$ModelKey.release()>
			//    2    4:return          
			}

			public volatile void onItemEvicted(Object obj, Object obj1)
			{
				onItemEvicted((ModelKey)obj, obj1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #21  <Class ModelCache$ModelKey>
			//    3    5:aload_2         
			//    4    6:invokevirtual   #30  <Method void onItemEvicted(ModelCache$ModelKey, Object)>
			//    5    9:return          
			}

			final ModelCache this$0;

			
			{
				this$0 = ModelCache.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field ModelCache this$0>
				super(i);
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:invokespecial   #16  <Method void LruCache(int)>
			//    6   10:return          
			}
		}
));
	//    2    4:aload_0         
	//    3    5:new             #7   <Class ModelCache$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:invokespecial   #27  <Method void ModelCache$1(ModelCache, int)>
	//    8   14:putfield        #29  <Field LruCache cache>
	//    9   17:return          
	}

	public void clear()
	{
		cache.clearMemory();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field LruCache cache>
	//    2    4:invokevirtual   #35  <Method void LruCache.clearMemory()>
	//    3    7:return          
	}

	public Object get(Object obj, int i, int j)
	{
		obj = ((Object) (ModelKey.get(obj, i, j)));
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:invokestatic    #41  <Method ModelCache$ModelKey ModelCache$ModelKey.get(Object, int, int)>
	//    4    6:astore_1        
		Object obj1 = cache.get(obj);
	//    5    7:aload_0         
	//    6    8:getfield        #29  <Field LruCache cache>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #44  <Method Object LruCache.get(Object)>
	//    9   15:astore          4
		((ModelKey) (obj)).release();
	//   10   17:aload_1         
	//   11   18:invokevirtual   #47  <Method void ModelCache$ModelKey.release()>
		return obj1;
	//   12   21:aload           4
	//   13   23:areturn         
	}

	public void put(Object obj, int i, int j, Object obj1)
	{
		obj = ((Object) (ModelKey.get(obj, i, j)));
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:invokestatic    #41  <Method ModelCache$ModelKey ModelCache$ModelKey.get(Object, int, int)>
	//    4    6:astore_1        
		cache.put(obj, obj1);
	//    5    7:aload_0         
	//    6    8:getfield        #29  <Field LruCache cache>
	//    7   11:aload_1         
	//    8   12:aload           4
	//    9   14:invokevirtual   #55  <Method Object LruCache.put(Object, Object)>
	//   10   17:pop             
	//   11   18:return          
	}

	private static final int DEFAULT_SIZE = 250;
	private final LruCache cache;
}