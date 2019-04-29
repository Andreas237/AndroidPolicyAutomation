// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap.maploader;


// Referenced classes of package com.autonavi.ae.gmap.maploader:
//			Pools

public static class Pools$SimplePool
	implements Pools.Pool
{

	private boolean isInPool(Object obj)
	{
		for(int i = 0; i < mPoolSize; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #33  <Field int mPoolSize>
	//*   5    7:icmpge          29
			if(mPool[i] == obj)
	//*   6   10:aload_0         
	//*   7   11:getfield        #28  <Field Object[] mPool>
	//*   8   14:iload_2         
	//*   9   15:aaload          
	//*  10   16:aload_1         
	//*  11   17:if_acmpne       22
				return true;
	//   12   20:iconst_1        
	//   13   21:ireturn         

	//   14   22:iload_2         
	//   15   23:iconst_1        
	//   16   24:iadd            
	//   17   25:istore_2        
	//*  18   26:goto            2
		return false;
	//   19   29:iconst_0        
	//   20   30:ireturn         
	}

	public Object acquire()
	{
		if(mPoolSize > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field int mPoolSize>
	//*   2    4:ifle            40
		{
			int i = mPoolSize - 1;
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field int mPoolSize>
	//    5   11:iconst_1        
	//    6   12:isub            
	//    7   13:istore_1        
			Object obj = mPool[i];
	//    8   14:aload_0         
	//    9   15:getfield        #28  <Field Object[] mPool>
	//   10   18:iload_1         
	//   11   19:aaload          
	//   12   20:astore_2        
			mPool[i] = null;
	//   13   21:aload_0         
	//   14   22:getfield        #28  <Field Object[] mPool>
	//   15   25:iload_1         
	//   16   26:aconst_null     
	//   17   27:aastore         
			mPoolSize = mPoolSize - 1;
	//   18   28:aload_0         
	//   19   29:aload_0         
	//   20   30:getfield        #33  <Field int mPoolSize>
	//   21   33:iconst_1        
	//   22   34:isub            
	//   23   35:putfield        #33  <Field int mPoolSize>
			return obj;
	//   24   38:aload_2         
	//   25   39:areturn         
		} else
		{
			return ((Object) (null));
	//   26   40:aconst_null     
	//   27   41:areturn         
		}
	}

	public void destory()
	{
		for(int i = 0; i < mPool.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #28  <Field Object[] mPool>
	//*   5    7:arraylength     
	//*   6    8:icmpge          25
			mPool[i] = null;
	//    7   11:aload_0         
	//    8   12:getfield        #28  <Field Object[] mPool>
	//    9   15:iload_1         
	//   10   16:aconst_null     
	//   11   17:aastore         

	//   12   18:iload_1         
	//   13   19:iconst_1        
	//   14   20:iadd            
	//   15   21:istore_1        
	//*  16   22:goto            2
	//   17   25:return          
	}

	public boolean release(Object obj)
	{
		if(isInPool(obj))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #42  <Method boolean isInPool(Object)>
	//*   3    5:ifeq            18
			throw new IllegalStateException("Already in the pool!");
	//    4    8:new             #44  <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:ldc1            #46  <String "Already in the pool!">
	//    7   14:invokespecial   #47  <Method void IllegalStateException(String)>
	//    8   17:athrow          
		if(mPoolSize < mPool.length)
	//*   9   18:aload_0         
	//*  10   19:getfield        #33  <Field int mPoolSize>
	//*  11   22:aload_0         
	//*  12   23:getfield        #28  <Field Object[] mPool>
	//*  13   26:arraylength     
	//*  14   27:icmpge          52
		{
			mPool[mPoolSize] = obj;
	//   15   30:aload_0         
	//   16   31:getfield        #28  <Field Object[] mPool>
	//   17   34:aload_0         
	//   18   35:getfield        #33  <Field int mPoolSize>
	//   19   38:aload_1         
	//   20   39:aastore         
			mPoolSize = mPoolSize + 1;
	//   21   40:aload_0         
	//   22   41:aload_0         
	//   23   42:getfield        #33  <Field int mPoolSize>
	//   24   45:iconst_1        
	//   25   46:iadd            
	//   26   47:putfield        #33  <Field int mPoolSize>
			return true;
	//   27   50:iconst_1        
	//   28   51:ireturn         
		} else
		{
			return false;
	//   29   52:iconst_0        
	//   30   53:ireturn         
		}
	}

	private final Object mPool[];
	private int mPoolSize;

	public Pools$SimplePool(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		if(i <= 0)
	//*   2    4:iload_1         
	//*   3    5:ifgt            18
		{
			throw new IllegalArgumentException("The max pool size must be > 0");
	//    4    8:new             #21  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #23  <String "The max pool size must be > 0">
	//    7   14:invokespecial   #26  <Method void IllegalArgumentException(String)>
	//    8   17:athrow          
		} else
		{
			mPool = new Object[i];
	//    9   18:aload_0         
	//   10   19:iload_1         
	//   11   20:anewarray       Object[]
	//   12   23:putfield        #28  <Field Object[] mPool>
			return;
	//   13   26:return          
		}
	}
}