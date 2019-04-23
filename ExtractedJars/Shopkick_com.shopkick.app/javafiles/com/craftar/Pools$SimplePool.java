// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
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
	//*   7   11:getfield        #21  <Field Object[] mPool>
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
		int i = mPoolSize;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int mPoolSize>
	//    2    4:istore_1        
		if(i > 0)
	//*   3    5:iload_1         
	//*   4    6:ifle            37
		{
			int j = i - 1;
	//    5    9:iload_1         
	//    6   10:iconst_1        
	//    7   11:isub            
	//    8   12:istore_2        
			Object aobj[] = mPool;
	//    9   13:aload_0         
	//   10   14:getfield        #21  <Field Object[] mPool>
	//   11   17:astore_3        
			Object obj = aobj[j];
	//   12   18:aload_3         
	//   13   19:iload_2         
	//   14   20:aaload          
	//   15   21:astore          4
			aobj[j] = null;
	//   16   23:aload_3         
	//   17   24:iload_2         
	//   18   25:aconst_null     
	//   19   26:aastore         
			mPoolSize = i - 1;
	//   20   27:aload_0         
	//   21   28:iload_1         
	//   22   29:iconst_1        
	//   23   30:isub            
	//   24   31:putfield        #33  <Field int mPoolSize>
			return obj;
	//   25   34:aload           4
	//   26   36:areturn         
		} else
		{
			return ((Object) (null));
	//   27   37:aconst_null     
	//   28   38:areturn         
		}
	}

	public boolean release(Object obj)
	{
		if(!isInPool(obj))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #41  <Method boolean isInPool(Object)>
	//*   3    5:ifne            39
		{
			int i = mPoolSize;
	//    4    8:aload_0         
	//    5    9:getfield        #33  <Field int mPoolSize>
	//    6   12:istore_2        
			Object aobj[] = mPool;
	//    7   13:aload_0         
	//    8   14:getfield        #21  <Field Object[] mPool>
	//    9   17:astore_3        
			if(i < aobj.length)
	//*  10   18:iload_2         
	//*  11   19:aload_3         
	//*  12   20:arraylength     
	//*  13   21:icmpge          37
			{
				aobj[i] = obj;
	//   14   24:aload_3         
	//   15   25:iload_2         
	//   16   26:aload_1         
	//   17   27:aastore         
				mPoolSize = i + 1;
	//   18   28:aload_0         
	//   19   29:iload_2         
	//   20   30:iconst_1        
	//   21   31:iadd            
	//   22   32:putfield        #33  <Field int mPoolSize>
				return true;
	//   23   35:iconst_1        
	//   24   36:ireturn         
			} else
			{
				return false;
	//   25   37:iconst_0        
	//   26   38:ireturn         
			}
		} else
		{
			throw new IllegalStateException("Already in the pool!");
	//   27   39:new             #43  <Class IllegalStateException>
	//   28   42:dup             
	//   29   43:ldc1            #45  <String "Already in the pool!">
	//   30   45:invokespecial   #46  <Method void IllegalStateException(String)>
	//   31   48:athrow          
		}
	}

	private final Object mPool[];
	private int mPoolSize;

	public Pools$SimplePool(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		if(i > 0)
	//*   2    4:iload_1         
	//*   3    5:ifle            17
		{
			mPool = new Object[i];
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:anewarray       Object[]
	//    7   13:putfield        #21  <Field Object[] mPool>
			return;
	//    8   16:return          
		} else
		{
			throw new IllegalArgumentException("The max pool size must be > 0");
	//    9   17:new             #23  <Class IllegalArgumentException>
	//   10   20:dup             
	//   11   21:ldc1            #25  <String "The max pool size must be > 0">
	//   12   23:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//   13   26:athrow          
		}
	}
}
