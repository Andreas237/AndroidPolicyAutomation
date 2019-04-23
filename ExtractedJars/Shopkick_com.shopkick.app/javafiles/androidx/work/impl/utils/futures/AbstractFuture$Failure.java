// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils.futures;


// Referenced classes of package androidx.work.impl.utils.futures:
//			AbstractFuture

private static final class AbstractFuture$Failure
{

	static final AbstractFuture$Failure FALLBACK_INSTANCE = new AbstractFuture$Failure(((Throwable) (new Throwable("Failure occurred while trying to finish a future.") {

		public Throwable fillInStackTrace()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
		//*   2    2:aload_0         
			return ((Throwable) (this));
		//    3    3:monitorexit     
		//    4    4:aload_0         
		//    5    5:areturn         
		}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokespecial   #13  <Method void Throwable(String)>
			//    3    5:return          
			}
	}
)));
	final Throwable exception;

	static 
	{
	//    0    0:new             #2   <Class AbstractFuture$Failure>
	//    1    3:dup             
	//    2    4:new             #9   <Class AbstractFuture$Failure$1>
	//    3    7:dup             
	//    4    8:ldc1            #17  <String "Failure occurred while trying to finish a future.">
	//    5   10:invokespecial   #21  <Method void AbstractFuture$Failure$1(String)>
	//    6   13:invokespecial   #24  <Method void AbstractFuture$Failure(Throwable)>
	//    7   16:putstatic       #26  <Field AbstractFuture$Failure FALLBACK_INSTANCE>
	//*   8   19:return          
	}

	AbstractFuture$Failure(Throwable throwable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		exception = (Throwable)AbstractFuture.checkNotNull(((Object) (throwable)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #33  <Method Object AbstractFuture.checkNotNull(Object)>
	//    5    9:checkcast       #35  <Class Throwable>
	//    6   12:putfield        #37  <Field Throwable exception>
	//    7   15:return          
	}
}
