// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.util.pool;


public abstract class StateVerifier
{
	private static class DefaultStateVerifier extends StateVerifier
	{

		public void setRecycled(boolean flag)
		{
			isReleased = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #17  <Field boolean isReleased>
		//    3    5:return          
		}

		public void throwIfRecycled()
		{
			if(!isReleased)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field boolean isReleased>
		//*   2    4:ifne            8
				return;
		//    3    7:return          
			else
				throw new IllegalStateException("Already released");
		//    4    8:new             #20  <Class IllegalStateException>
		//    5   11:dup             
		//    6   12:ldc1            #22  <String "Already released">
		//    7   14:invokespecial   #25  <Method void IllegalStateException(String)>
		//    8   17:athrow          
		}

		private volatile boolean isReleased;

		DefaultStateVerifier()
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #12  <Method void StateVerifier(StateVerifier$1)>
		//    3    5:return          
		}
	}


	private StateVerifier()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}


	public static StateVerifier newInstance()
	{
		return ((StateVerifier) (new DefaultStateVerifier()));
	//    0    0:new             #8   <Class StateVerifier$DefaultStateVerifier>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void StateVerifier$DefaultStateVerifier()>
	//    3    7:areturn         
	}

	abstract void setRecycled(boolean flag);

	public abstract void throwIfRecycled();
}
