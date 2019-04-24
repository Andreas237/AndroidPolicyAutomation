// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;


public final class Pools
{
	public static interface Pool
	{

		public abstract Object acquire();

		public abstract boolean release(Object obj);
	}

	public static class SimplePool
		implements Pool
	{

		private boolean isInPool(Object obj)
		{
			boolean flag1 = false;
		//    0    0:iconst_0        
		//    1    1:istore          4
			int i = 0;
		//    2    3:iconst_0        
		//    3    4:istore_2        
			do
			{
label0:
				{
					boolean flag = flag1;
		//    4    5:iload           4
		//    5    7:istore_3        
					if(i < mPoolSize)
		//*   6    8:iload_2         
		//*   7    9:aload_0         
		//*   8   10:getfield        #33  <Field int mPoolSize>
		//*   9   13:icmpge          28
					{
						if(mPool[i] != obj)
							break label0;
		//   10   16:aload_0         
		//   11   17:getfield        #28  <Field Object[] mPool>
		//   12   20:iload_2         
		//   13   21:aaload          
		//   14   22:aload_1         
		//   15   23:if_acmpne       30
						flag = true;
		//   16   26:iconst_1        
		//   17   27:istore_3        
					}
					return flag;
		//   18   28:iload_3         
		//   19   29:ireturn         
				}
				i++;
		//   20   30:iload_2         
		//   21   31:iconst_1        
		//   22   32:iadd            
		//   23   33:istore_2        
			} while(true);
		//   24   34:goto            5
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

		public boolean release(Object obj)
		{
			if(isInPool(obj))
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:invokespecial   #41  <Method boolean isInPool(Object)>
		//*   3    5:ifeq            18
				throw new IllegalStateException("Already in the pool!");
		//    4    8:new             #43  <Class IllegalStateException>
		//    5   11:dup             
		//    6   12:ldc1            #45  <String "Already in the pool!">
		//    7   14:invokespecial   #46  <Method void IllegalStateException(String)>
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

		public SimplePool(int i)
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

	public static class SynchronizedPool extends SimplePool
	{

		public Object acquire()
		{
			Object obj1;
			synchronized(mLock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field Object mLock>
		//*   2    4:astore_1        
		//*   3    5:aload_1         
		//*   4    6:monitorenter    
			{
				obj1 = super.acquire();
		//    5    7:aload_0         
		//    6    8:invokespecial   #26  <Method Object Pools$SimplePool.acquire()>
		//    7   11:astore_2        
			}
		//    8   12:aload_1         
		//    9   13:monitorexit     
			return obj1;
		//   10   14:aload_2         
		//   11   15:areturn         
			exception;
		//   12   16:astore_2        
			obj;
		//   13   17:aload_1         
			JVM INSTR monitorexit ;
		//   14   18:monitorexit     
			throw exception;
		//   15   19:aload_2         
		//   16   20:athrow          
		}

		public boolean release(Object obj)
		{
			boolean flag;
			synchronized(mLock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field Object mLock>
		//*   2    4:astore_3        
		//*   3    5:aload_3         
		//*   4    6:monitorenter    
			{
				flag = super.release(obj);
		//    5    7:aload_0         
		//    6    8:aload_1         
		//    7    9:invokespecial   #32  <Method boolean Pools$SimplePool.release(Object)>
		//    8   12:istore_2        
			}
		//    9   13:aload_3         
		//   10   14:monitorexit     
			return flag;
		//   11   15:iload_2         
		//   12   16:ireturn         
			obj;
		//   13   17:astore_1        
			obj1;
		//   14   18:aload_3         
			JVM INSTR monitorexit ;
		//   15   19:monitorexit     
			throw obj;
		//   16   20:aload_1         
		//   17   21:athrow          
		}

		private final Object mLock = new Object();

		public SynchronizedPool(int i)
		{
			super(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #14  <Method void Pools$SimplePool(int)>
		//    3    5:aload_0         
		//    4    6:new             #16  <Class Object>
		//    5    9:dup             
		//    6   10:invokespecial   #19  <Method void Object()>
		//    7   13:putfield        #21  <Field Object mLock>
		//    8   16:return          
		}
	}


	private Pools()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}
}
