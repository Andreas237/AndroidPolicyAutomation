// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;


// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImpl

static final class AppCompatDelegateImpl$1
	implements Handler
{

	private boolean shouldWrapException(Throwable throwable)
	{
label0:
		{
			boolean flag;
label1:
			{
				flag = throwable instanceof android.content.res.ion;
	//    0    0:aload_1         
	//    1    1:instanceof      #22  <Class android.content.res.Resources$NotFoundException>
	//    2    4:istore_2        
				boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
				if(!flag)
					break label0;
	//    5    7:iload_2         
	//    6    8:ifeq            46
				throwable = ((Throwable) (throwable.getMessage()));
	//    7   11:aload_1         
	//    8   12:invokevirtual   #28  <Method String Throwable.getMessage()>
	//    9   15:astore_1        
				flag = flag1;
	//   10   16:iload_3         
	//   11   17:istore_2        
				if(throwable == null)
					break label1;
	//   12   18:aload_1         
	//   13   19:ifnull          44
				if(!((String) (throwable)).contains("drawable"))
	//*  14   22:aload_1         
	//*  15   23:ldc1            #30  <String "drawable">
	//*  16   25:invokevirtual   #36  <Method boolean String.contains(CharSequence)>
	//*  17   28:ifne            42
				{
					flag = flag1;
	//   18   31:iload_3         
	//   19   32:istore_2        
					if(!((String) (throwable)).contains("Drawable"))
						break label1;
	//   20   33:aload_1         
	//   21   34:ldc1            #38  <String "Drawable">
	//   22   36:invokevirtual   #36  <Method boolean String.contains(CharSequence)>
	//   23   39:ifeq            44
				}
				flag = true;
	//   24   42:iconst_1        
	//   25   43:istore_2        
			}
			return flag;
	//   26   44:iload_2         
	//   27   45:ireturn         
		}
		return false;
	//   28   46:iconst_0        
	//   29   47:ireturn         
	}

	public void uncaughtException(Thread thread, Throwable throwable)
	{
		if(shouldWrapException(throwable))
	//*   0    0:aload_0         
	//*   1    1:aload_2         
	//*   2    2:invokespecial   #42  <Method boolean shouldWrapException(Throwable)>
	//*   3    5:ifeq            73
		{
			Object obj = ((Object) (new StringBuilder()));
	//    4    8:new             #44  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #45  <Method void StringBuilder()>
	//    7   15:astore_3        
			((StringBuilder) (obj)).append(throwable.getMessage());
	//    8   16:aload_3         
	//    9   17:aload_2         
	//   10   18:invokevirtual   #28  <Method String Throwable.getMessage()>
	//   11   21:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
			((StringBuilder) (obj)).append(". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
	//   13   25:aload_3         
	//   14   26:ldc1            #51  <String ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.">
	//   15   28:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
			obj = ((Object) (new android.content.res.ion(((StringBuilder) (obj)).toString())));
	//   17   32:new             #22  <Class android.content.res.Resources$NotFoundException>
	//   18   35:dup             
	//   19   36:aload_3         
	//   20   37:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   21   40:invokespecial   #57  <Method void android.content.res.Resources$NotFoundException(String)>
	//   22   43:astore_3        
			((Throwable) (obj)).initCause(throwable.getCause());
	//   23   44:aload_3         
	//   24   45:aload_2         
	//   25   46:invokevirtual   #61  <Method Throwable Throwable.getCause()>
	//   26   49:invokevirtual   #65  <Method Throwable Throwable.initCause(Throwable)>
	//   27   52:pop             
			((Throwable) (obj)).setStackTrace(throwable.getStackTrace());
	//   28   53:aload_3         
	//   29   54:aload_2         
	//   30   55:invokevirtual   #69  <Method StackTraceElement[] Throwable.getStackTrace()>
	//   31   58:invokevirtual   #73  <Method void Throwable.setStackTrace(StackTraceElement[])>
			val$defHandler.uncaughtException(thread, ((Throwable) (obj)));
	//   32   61:aload_0         
	//   33   62:getfield        #14  <Field Thread$UncaughtExceptionHandler val$defHandler>
	//   34   65:aload_1         
	//   35   66:aload_3         
	//   36   67:invokeinterface #75  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
			return;
	//   37   72:return          
		} else
		{
			val$defHandler.uncaughtException(thread, throwable);
	//   38   73:aload_0         
	//   39   74:getfield        #14  <Field Thread$UncaughtExceptionHandler val$defHandler>
	//   40   77:aload_1         
	//   41   78:aload_2         
	//   42   79:invokeinterface #75  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
			return;
	//   43   84:return          
		}
	}

	final Handler val$defHandler;

	AppCompatDelegateImpl$1(Handler handler)
	{
		val$defHandler = handler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field Thread$UncaughtExceptionHandler val$defHandler>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
