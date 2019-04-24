// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;


// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplBase

static final class AppCompatDelegateImplBase$1
	implements ler
{

	private boolean shouldWrapException(Throwable throwable)
	{
		if(throwable instanceof android.content.res.Resources$NotFoundException)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #22  <Class android.content.res.Resources$NotFoundException>
	//*   2    4:ifeq            38
		{
			throwable = ((Throwable) (throwable.getMessage()));
	//    3    7:aload_1         
	//    4    8:invokevirtual   #28  <Method String Throwable.getMessage()>
	//    5   11:astore_1        
			return throwable != null && (((String) (throwable)).contains("drawable") || ((String) (throwable)).contains("Drawable"));
	//    6   12:aload_1         
	//    7   13:ifnull          36
	//    8   16:aload_1         
	//    9   17:ldc1            #30  <String "drawable">
	//   10   19:invokevirtual   #36  <Method boolean String.contains(CharSequence)>
	//   11   22:ifne            34
	//   12   25:aload_1         
	//   13   26:ldc1            #38  <String "Drawable">
	//   14   28:invokevirtual   #36  <Method boolean String.contains(CharSequence)>
	//   15   31:ifeq            36
	//   16   34:iconst_1        
	//   17   35:ireturn         
	//   18   36:iconst_0        
	//   19   37:ireturn         
		} else
		{
			return false;
	//   20   38:iconst_0        
	//   21   39:ireturn         
		}
	}

	public void uncaughtException(Thread thread, Throwable throwable)
	{
		if(shouldWrapException(throwable))
	//*   0    0:aload_0         
	//*   1    1:aload_2         
	//*   2    2:invokespecial   #42  <Method boolean shouldWrapException(Throwable)>
	//*   3    5:ifeq            67
		{
			android.content.res.Resources$NotFoundException resources$notfoundexception = new android.content.res.Resources$NotFoundException((new StringBuilder()).append(throwable.getMessage()).append(". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.").toString());
	//    4    8:new             #22  <Class android.content.res.Resources$NotFoundException>
	//    5   11:dup             
	//    6   12:new             #44  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #45  <Method void StringBuilder()>
	//    9   19:aload_2         
	//   10   20:invokevirtual   #28  <Method String Throwable.getMessage()>
	//   11   23:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   12   26:ldc1            #51  <String ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.">
	//   13   28:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   14   31:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   15   34:invokespecial   #57  <Method void android.content.res.Resources$NotFoundException(String)>
	//   16   37:astore_3        
			((Throwable) (resources$notfoundexception)).initCause(throwable.getCause());
	//   17   38:aload_3         
	//   18   39:aload_2         
	//   19   40:invokevirtual   #61  <Method Throwable Throwable.getCause()>
	//   20   43:invokevirtual   #65  <Method Throwable Throwable.initCause(Throwable)>
	//   21   46:pop             
			((Throwable) (resources$notfoundexception)).setStackTrace(throwable.getStackTrace());
	//   22   47:aload_3         
	//   23   48:aload_2         
	//   24   49:invokevirtual   #69  <Method StackTraceElement[] Throwable.getStackTrace()>
	//   25   52:invokevirtual   #73  <Method void Throwable.setStackTrace(StackTraceElement[])>
			val$defHandler.uncaughtException(thread, ((Throwable) (resources$notfoundexception)));
	//   26   55:aload_0         
	//   27   56:getfield        #14  <Field Thread$UncaughtExceptionHandler val$defHandler>
	//   28   59:aload_1         
	//   29   60:aload_3         
	//   30   61:invokeinterface #75  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
			return;
	//   31   66:return          
		} else
		{
			val$defHandler.uncaughtException(thread, throwable);
	//   32   67:aload_0         
	//   33   68:getfield        #14  <Field Thread$UncaughtExceptionHandler val$defHandler>
	//   34   71:aload_1         
	//   35   72:aload_2         
	//   36   73:invokeinterface #75  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
			return;
	//   37   78:return          
		}
	}

	final ler val$defHandler;

	AppCompatDelegateImplBase$1(ler ler)
	{
		val$defHandler = ler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field Thread$UncaughtExceptionHandler val$defHandler>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
