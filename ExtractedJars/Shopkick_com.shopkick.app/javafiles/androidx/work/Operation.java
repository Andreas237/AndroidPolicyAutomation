// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import android.arch.lifecycle.LiveData;
import com.google.common.util.concurrent.ListenableFuture;

public interface Operation
{
	public static abstract class State
	{

		State()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
		//    2    4:return          
		}
	}

	public static final class State.FAILURE extends State
	{

		public Throwable getThrowable()
		{
			return mThrowable;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Throwable mThrowable>
		//    2    4:areturn         
		}

		public String toString()
		{
			return String.format("FAILURE (%s)", new Object[] {
				mThrowable.getMessage()
			});
		//    0    0:ldc1            #27  <String "FAILURE (%s)">
		//    1    2:iconst_1        
		//    2    3:anewarray       Object[]
		//    3    6:dup             
		//    4    7:iconst_0        
		//    5    8:aload_0         
		//    6    9:getfield        #18  <Field Throwable mThrowable>
		//    7   12:invokevirtual   #34  <Method String Throwable.getMessage()>
		//    8   15:aastore         
		//    9   16:invokestatic    #40  <Method String String.format(String, Object[])>
		//   10   19:areturn         
		}

		private final Throwable mThrowable;

		public State.FAILURE(Throwable throwable)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Operation$State()>
			mThrowable = throwable;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field Throwable mThrowable>
		//    5    9:return          
		}
	}

	public static final class State.IN_PROGRESS extends State
	{

		public String toString()
		{
			return "IN_PROGRESS";
		//    0    0:ldc1            #19  <String "IN_PROGRESS">
		//    1    2:areturn         
		}

		private State.IN_PROGRESS()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void Operation$State()>
		//    2    4:return          
		}

	}

	public static final class State.SUCCESS extends State
	{

		public String toString()
		{
			return "SUCCESS";
		//    0    0:ldc1            #19  <String "SUCCESS">
		//    1    2:areturn         
		}

		private State.SUCCESS()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void Operation$State()>
		//    2    4:return          
		}

	}


	public abstract ListenableFuture getResult();

	public abstract LiveData getState();

	public static final State.IN_PROGRESS IN_PROGRESS = new State.IN_PROGRESS();
	public static final State.SUCCESS SUCCESS = new State.SUCCESS();

	/* static  */
	/* { */
	//    0    0:new             #17  <Class Operation$State$SUCCESS>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #32  <Method void Operation$State$SUCCESS(Operation$1)>
	//    4    8:putstatic       #34  <Field Operation$State$SUCCESS SUCCESS>
	//    5   11:new             #14  <Class Operation$State$IN_PROGRESS>
	//    6   14:dup             
	//    7   15:aconst_null     
	//    8   16:invokespecial   #35  <Method void Operation$State$IN_PROGRESS(Operation$1)>
	//    9   19:putstatic       #37  <Field Operation$State$IN_PROGRESS IN_PROGRESS>
	//*  10   22:return          
	/* } */
}
