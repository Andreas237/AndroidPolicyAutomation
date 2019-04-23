// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


class MySynchronizedPool extends Pools.SynchronizedPool
{

	public MySynchronizedPool(int i)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #11  <Method void Pools$SynchronizedPool(int)>
		mElementCount = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #13  <Field int mElementCount>
	//    6   10:return          
	}

	public Object acquire()
	{
		Object obj = super.acquire();
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method Object Pools$SynchronizedPool.acquire()>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          19
			mElementCount = mElementCount - 1;
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #13  <Field int mElementCount>
	//    8   14:iconst_1        
	//    9   15:isub            
	//   10   16:putfield        #13  <Field int mElementCount>
		return obj;
	//   11   19:aload_1         
	//   12   20:areturn         
	}

	public int getObjectCount()
	{
		return mElementCount;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field int mElementCount>
	//    2    4:ireturn         
	}

	public boolean release(Object obj)
	{
		boolean flag;
		try
		{
			flag = super.release(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #28  <Method boolean Pools$SynchronizedPool.release(Object)>
	//    3    5:istore_2        
		}
	//*   4    6:goto            11
	//*   5    9:iconst_0        
	//*   6   10:istore_2        
	//*   7   11:iload_2         
	//*   8   12:ifeq            25
	//*   9   15:aload_0         
	//*  10   16:aload_0         
	//*  11   17:getfield        #13  <Field int mElementCount>
	//*  12   20:iconst_1        
	//*  13   21:iadd            
	//*  14   22:putfield        #13  <Field int mElementCount>
	//*  15   25:iload_2         
	//*  16   26:ireturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			flag = false;
		}
		if(flag)
			mElementCount = mElementCount + 1;
		return flag;
	//*  17   27:astore_1        
	//*  18   28:goto            9
	}

	int mElementCount;
}
