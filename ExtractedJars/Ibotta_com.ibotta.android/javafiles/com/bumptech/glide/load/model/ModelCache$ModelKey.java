// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import com.bumptech.glide.util.Util;
import java.util.Queue;

// Referenced classes of package com.bumptech.glide.load.model:
//			ModelCache

static final class ModelCache$ModelKey
{

	static ModelCache$ModelKey get(Object obj, int i, int j)
	{
		ModelCache$ModelKey modelcache$modelkey;
		synchronized(KEY_QUEUE)
	//*   0    0:getstatic       #28  <Field Queue KEY_QUEUE>
	//*   1    3:astore_3        
	//*   2    4:aload_3         
	//*   3    5:monitorenter    
		{
			modelcache$modelkey = (ModelCache$ModelKey)KEY_QUEUE.poll();
	//    4    6:getstatic       #28  <Field Queue KEY_QUEUE>
	//    5    9:invokeinterface #40  <Method Object Queue.poll()>
	//    6   14:checkcast       #2   <Class ModelCache$ModelKey>
	//    7   17:astore          4
		}
	//    8   19:aload_3         
	//    9   20:monitorexit     
		obj1 = ((Object) (modelcache$modelkey));
	//   10   21:aload           4
	//   11   23:astore_3        
		if(modelcache$modelkey == null)
	//*  12   24:aload           4
	//*  13   26:ifnonnull       37
			obj1 = ((Object) (new ModelCache$ModelKey()));
	//   14   29:new             #2   <Class ModelCache$ModelKey>
	//   15   32:dup             
	//   16   33:invokespecial   #41  <Method void ModelCache$ModelKey()>
	//   17   36:astore_3        
		((ModelCache$ModelKey) (obj1)).init(obj, i, j);
	//   18   37:aload_3         
	//   19   38:aload_0         
	//   20   39:iload_1         
	//   21   40:iload_2         
	//   22   41:invokespecial   #45  <Method void init(Object, int, int)>
		return ((ModelCache$ModelKey) (obj1));
	//   23   44:aload_3         
	//   24   45:areturn         
		obj;
	//   25   46:astore_0        
		obj1;
	//   26   47:aload_3         
		JVM INSTR monitorexit ;
	//   27   48:monitorexit     
		throw obj;
	//   28   49:aload_0         
	//   29   50:athrow          
	}

	private void init(Object obj, int i, int j)
	{
		model = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #49  <Field Object model>
		width = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #51  <Field int width>
		height = j;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #53  <Field int height>
	//    9   15:return          
	}

	public boolean equals(Object obj)
	{
		boolean flag = obj instanceof ModelCache$ModelKey;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class ModelCache$ModelKey>
	//    2    4:istore_2        
		boolean flag2 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(flag)
	//*   5    7:iload_2         
	//*   6    8:ifeq            62
		{
			obj = ((Object) ((ModelCache$ModelKey)obj));
	//    7   11:aload_1         
	//    8   12:checkcast       #2   <Class ModelCache$ModelKey>
	//    9   15:astore_1        
			boolean flag1 = flag2;
	//   10   16:iload_3         
	//   11   17:istore_2        
			if(width == ((ModelCache$ModelKey) (obj)).width)
	//*  12   18:aload_0         
	//*  13   19:getfield        #51  <Field int width>
	//*  14   22:aload_1         
	//*  15   23:getfield        #51  <Field int width>
	//*  16   26:icmpne          60
			{
				flag1 = flag2;
	//   17   29:iload_3         
	//   18   30:istore_2        
				if(height == ((ModelCache$ModelKey) (obj)).height)
	//*  19   31:aload_0         
	//*  20   32:getfield        #53  <Field int height>
	//*  21   35:aload_1         
	//*  22   36:getfield        #53  <Field int height>
	//*  23   39:icmpne          60
				{
					flag1 = flag2;
	//   24   42:iload_3         
	//   25   43:istore_2        
					if(model.equals(((ModelCache$ModelKey) (obj)).model))
	//*  26   44:aload_0         
	//*  27   45:getfield        #49  <Field Object model>
	//*  28   48:aload_1         
	//*  29   49:getfield        #49  <Field Object model>
	//*  30   52:invokevirtual   #58  <Method boolean Object.equals(Object)>
	//*  31   55:ifeq            60
						flag1 = true;
	//   32   58:iconst_1        
	//   33   59:istore_2        
				}
			}
			return flag1;
	//   34   60:iload_2         
	//   35   61:ireturn         
		} else
		{
			return false;
	//   36   62:iconst_0        
	//   37   63:ireturn         
		}
	}

	public int hashCode()
	{
		return (height * 31 + width) * 31 + model.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int height>
	//    2    4:bipush          31
	//    3    6:imul            
	//    4    7:aload_0         
	//    5    8:getfield        #51  <Field int width>
	//    6   11:iadd            
	//    7   12:bipush          31
	//    8   14:imul            
	//    9   15:aload_0         
	//   10   16:getfield        #49  <Field Object model>
	//   11   19:invokevirtual   #62  <Method int Object.hashCode()>
	//   12   22:iadd            
	//   13   23:ireturn         
	}

	public void release()
	{
		synchronized(KEY_QUEUE)
	//*   0    0:getstatic       #28  <Field Queue KEY_QUEUE>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			KEY_QUEUE.offer(((Object) (this)));
	//    4    6:getstatic       #28  <Field Queue KEY_QUEUE>
	//    5    9:aload_0         
	//    6   10:invokeinterface #66  <Method boolean Queue.offer(Object)>
	//    7   15:pop             
		}
	//    8   16:aload_1         
	//    9   17:monitorexit     
		return;
	//   10   18:return          
		exception;
	//   11   19:astore_2        
		queue;
	//   12   20:aload_1         
		JVM INSTR monitorexit ;
	//   13   21:monitorexit     
		throw exception;
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
	//    1    1:invokestatic    #26  <Method Queue Util.createQueue(int)>
	//    2    4:putstatic       #28  <Field Queue KEY_QUEUE>
	//*   3    7:return          
	}

	private ModelCache$ModelKey()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
	//    2    4:return          
	}
}
