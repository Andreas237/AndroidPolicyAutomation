// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils.futures;


// Referenced classes of package androidx.work.impl.utils.futures:
//			AbstractFuture

private static final class AbstractFuture$Cancellation
{

	static final AbstractFuture$Cancellation CAUSELESS_CANCELLED;
	static final AbstractFuture$Cancellation CAUSELESS_INTERRUPTED;
	final Throwable cause;
	final boolean wasInterrupted;

	static 
	{
		if(AbstractFuture.GENERATE_CANCELLATION_CAUSES)
	//*   0    0:getstatic       #20  <Field boolean AbstractFuture.GENERATE_CANCELLATION_CAUSES>
	//*   1    3:ifeq            15
		{
			CAUSELESS_CANCELLED = null;
	//    2    6:aconst_null     
	//    3    7:putstatic       #22  <Field AbstractFuture$Cancellation CAUSELESS_CANCELLED>
			CAUSELESS_INTERRUPTED = null;
	//    4   10:aconst_null     
	//    5   11:putstatic       #24  <Field AbstractFuture$Cancellation CAUSELESS_INTERRUPTED>
	//    6   14:return          
		} else
		{
			CAUSELESS_CANCELLED = new AbstractFuture$Cancellation(false, ((Throwable) (null)));
	//    7   15:new             #2   <Class AbstractFuture$Cancellation>
	//    8   18:dup             
	//    9   19:iconst_0        
	//   10   20:aconst_null     
	//   11   21:invokespecial   #28  <Method void AbstractFuture$Cancellation(boolean, Throwable)>
	//   12   24:putstatic       #22  <Field AbstractFuture$Cancellation CAUSELESS_CANCELLED>
			CAUSELESS_INTERRUPTED = new AbstractFuture$Cancellation(true, ((Throwable) (null)));
	//   13   27:new             #2   <Class AbstractFuture$Cancellation>
	//   14   30:dup             
	//   15   31:iconst_1        
	//   16   32:aconst_null     
	//   17   33:invokespecial   #28  <Method void AbstractFuture$Cancellation(boolean, Throwable)>
	//   18   36:putstatic       #24  <Field AbstractFuture$Cancellation CAUSELESS_INTERRUPTED>
		}
	//*  19   39:return          
	}

	AbstractFuture$Cancellation(boolean flag, Throwable throwable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		wasInterrupted = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #33  <Field boolean wasInterrupted>
		cause = throwable;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #35  <Field Throwable cause>
	//    8   14:return          
	}
}
