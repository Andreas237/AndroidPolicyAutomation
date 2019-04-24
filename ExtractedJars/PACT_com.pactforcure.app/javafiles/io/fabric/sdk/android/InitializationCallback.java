// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android;


public interface InitializationCallback
{
	public static class Empty
		implements InitializationCallback
	{

		public void failure(Exception exception)
		{
		//    0    0:return          
		}

		public void success(Object obj)
		{
		//    0    0:return          
		}

		private Empty()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void Object()>
		//    2    4:return          
		}

	}


	public abstract void failure(Exception exception);

	public abstract void success(Object obj);

	public static final InitializationCallback EMPTY = new Empty();

	/* static  */
	/* { */
	//    0    0:new             #9   <Class InitializationCallback$Empty>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #18  <Method void InitializationCallback$Empty(InitializationCallback$1)>
	//    4    8:putstatic       #20  <Field InitializationCallback EMPTY>
	//*   5   11:return          
	/* } */
}
