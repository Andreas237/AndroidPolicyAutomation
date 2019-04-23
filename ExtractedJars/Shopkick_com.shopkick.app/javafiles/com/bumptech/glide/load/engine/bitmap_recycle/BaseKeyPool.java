// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.util.Util;
import java.util.Queue;

// Referenced classes of package com.bumptech.glide.load.engine.bitmap_recycle:
//			Poolable

abstract class BaseKeyPool
{

	BaseKeyPool()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:bipush          20
	//    4    7:invokestatic    #21  <Method Queue Util.createQueue(int)>
	//    5   10:putfield        #23  <Field Queue keyPool>
	//    6   13:return          
	}

	abstract Poolable create();

	Poolable get()
	{
		Poolable poolable1 = (Poolable)keyPool.poll();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Queue keyPool>
	//    2    4:invokeinterface #33  <Method Object Queue.poll()>
	//    3    9:checkcast       #35  <Class Poolable>
	//    4   12:astore_2        
		Poolable poolable = poolable1;
	//    5   13:aload_2         
	//    6   14:astore_1        
		if(poolable1 == null)
	//*   7   15:aload_2         
	//*   8   16:ifnonnull       24
			poolable = create();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #37  <Method Poolable create()>
	//   11   23:astore_1        
		return poolable;
	//   12   24:aload_1         
	//   13   25:areturn         
	}

	public void offer(Poolable poolable)
	{
		if(keyPool.size() < 20)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field Queue keyPool>
	//*   2    4:invokeinterface #45  <Method int Queue.size()>
	//*   3    9:bipush          20
	//*   4   11:icmpge          25
			keyPool.offer(((Object) (poolable)));
	//    5   14:aload_0         
	//    6   15:getfield        #23  <Field Queue keyPool>
	//    7   18:aload_1         
	//    8   19:invokeinterface #48  <Method boolean Queue.offer(Object)>
	//    9   24:pop             
	//   10   25:return          
	}

	private static final int MAX_SIZE = 20;
	private final Queue keyPool = Util.createQueue(20);
}
