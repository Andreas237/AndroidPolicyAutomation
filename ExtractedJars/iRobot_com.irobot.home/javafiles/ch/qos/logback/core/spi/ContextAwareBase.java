// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.spi;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.status.*;
import java.io.PrintStream;

// Referenced classes of package ch.qos.logback.core.spi:
//			ContextAware

public class ContextAwareBase
	implements ContextAware
{

	public ContextAwareBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		noContextWarning = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #18  <Field int noContextWarning>
		declaredOrigin = ((Object) (this));
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:putfield        #20  <Field Object declaredOrigin>
	//    8   14:return          
	}

	public ContextAwareBase(ContextAware contextaware)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		noContextWarning = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #18  <Field int noContextWarning>
		declaredOrigin = ((Object) (contextaware));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #20  <Field Object declaredOrigin>
	//    8   14:return          
	}

	public void addError(String s)
	{
		addStatus(((Status) (new ErrorStatus(s, getDeclaredOrigin()))));
	//    0    0:aload_0         
	//    1    1:new             #26  <Class ErrorStatus>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #30  <Method Object getDeclaredOrigin()>
	//    6   10:invokespecial   #33  <Method void ErrorStatus(String, Object)>
	//    7   13:invokevirtual   #37  <Method void addStatus(Status)>
	//    8   16:return          
	}

	public void addError(String s, Throwable throwable)
	{
		addStatus(((Status) (new ErrorStatus(s, getDeclaredOrigin(), throwable))));
	//    0    0:aload_0         
	//    1    1:new             #26  <Class ErrorStatus>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #30  <Method Object getDeclaredOrigin()>
	//    6   10:aload_2         
	//    7   11:invokespecial   #41  <Method void ErrorStatus(String, Object, Throwable)>
	//    8   14:invokevirtual   #37  <Method void addStatus(Status)>
	//    9   17:return          
	}

	public void addInfo(String s)
	{
		addStatus(((Status) (new InfoStatus(s, getDeclaredOrigin()))));
	//    0    0:aload_0         
	//    1    1:new             #44  <Class InfoStatus>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #30  <Method Object getDeclaredOrigin()>
	//    6   10:invokespecial   #45  <Method void InfoStatus(String, Object)>
	//    7   13:invokevirtual   #37  <Method void addStatus(Status)>
	//    8   16:return          
	}

	public void addInfo(String s, Throwable throwable)
	{
		addStatus(((Status) (new InfoStatus(s, getDeclaredOrigin(), throwable))));
	//    0    0:aload_0         
	//    1    1:new             #44  <Class InfoStatus>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #30  <Method Object getDeclaredOrigin()>
	//    6   10:aload_2         
	//    7   11:invokespecial   #46  <Method void InfoStatus(String, Object, Throwable)>
	//    8   14:invokevirtual   #37  <Method void addStatus(Status)>
	//    9   17:return          
	}

	public void addStatus(Status status)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field Context context>
	//*   2    4:ifnonnull       57
		{
			int i = noContextWarning;
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field int noContextWarning>
	//    5   11:istore_2        
			noContextWarning = i + 1;
	//    6   12:aload_0         
	//    7   13:iload_2         
	//    8   14:iconst_1        
	//    9   15:iadd            
	//   10   16:putfield        #18  <Field int noContextWarning>
			if(i == 0)
	//*  11   19:iload_2         
	//*  12   20:ifne            56
			{
				status = ((Status) (System.out));
	//   13   23:getstatic       #54  <Field PrintStream System.out>
	//   14   26:astore_1        
				StringBuilder stringbuilder = new StringBuilder();
	//   15   27:new             #56  <Class StringBuilder>
	//   16   30:dup             
	//   17   31:invokespecial   #57  <Method void StringBuilder()>
	//   18   34:astore_3        
				stringbuilder.append("LOGBACK: No context given for ");
	//   19   35:aload_3         
	//   20   36:ldc1            #59  <String "LOGBACK: No context given for ">
	//   21   38:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   22   41:pop             
				stringbuilder.append(((Object) (this)));
	//   23   42:aload_3         
	//   24   43:aload_0         
	//   25   44:invokevirtual   #66  <Method StringBuilder StringBuilder.append(Object)>
	//   26   47:pop             
				((PrintStream) (status)).println(stringbuilder.toString());
	//   27   48:aload_1         
	//   28   49:aload_3         
	//   29   50:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   30   53:invokevirtual   #75  <Method void PrintStream.println(String)>
			}
			return;
	//   31   56:return          
		}
		StatusManager statusmanager = context.getStatusManager();
	//   32   57:aload_0         
	//   33   58:getfield        #48  <Field Context context>
	//   34   61:invokeinterface #81  <Method StatusManager Context.getStatusManager()>
	//   35   66:astore_3        
		if(statusmanager != null)
	//*  36   67:aload_3         
	//*  37   68:ifnull          78
			statusmanager.add(status);
	//   38   71:aload_3         
	//   39   72:aload_1         
	//   40   73:invokeinterface #86  <Method void StatusManager.add(Status)>
	//   41   78:return          
	}

	public void addWarn(String s)
	{
		addStatus(((Status) (new WarnStatus(s, getDeclaredOrigin()))));
	//    0    0:aload_0         
	//    1    1:new             #89  <Class WarnStatus>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #30  <Method Object getDeclaredOrigin()>
	//    6   10:invokespecial   #90  <Method void WarnStatus(String, Object)>
	//    7   13:invokevirtual   #37  <Method void addStatus(Status)>
	//    8   16:return          
	}

	public void addWarn(String s, Throwable throwable)
	{
		addStatus(((Status) (new WarnStatus(s, getDeclaredOrigin(), throwable))));
	//    0    0:aload_0         
	//    1    1:new             #89  <Class WarnStatus>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #30  <Method Object getDeclaredOrigin()>
	//    6   10:aload_2         
	//    7   11:invokespecial   #91  <Method void WarnStatus(String, Object, Throwable)>
	//    8   14:invokevirtual   #37  <Method void addStatus(Status)>
	//    9   17:return          
	}

	public Context getContext()
	{
		return context;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Context context>
	//    2    4:areturn         
	}

	protected Object getDeclaredOrigin()
	{
		return declaredOrigin;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Object declaredOrigin>
	//    2    4:areturn         
	}

	public StatusManager getStatusManager()
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field Context context>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return context.getStatusManager();
	//    5    9:aload_0         
	//    6   10:getfield        #48  <Field Context context>
	//    7   13:invokeinterface #81  <Method StatusManager Context.getStatusManager()>
	//    8   18:areturn         
	}

	public void setContext(Context context1)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field Context context>
	//*   2    4:ifnonnull       13
		{
			context = context1;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #48  <Field Context context>
			return;
	//    6   12:return          
		}
		if(context != context1)
	//*   7   13:aload_0         
	//*   8   14:getfield        #48  <Field Context context>
	//*   9   17:aload_1         
	//*  10   18:if_acmpeq       31
			throw new IllegalStateException("Context has been already set");
	//   11   21:new             #97  <Class IllegalStateException>
	//   12   24:dup             
	//   13   25:ldc1            #99  <String "Context has been already set">
	//   14   27:invokespecial   #101 <Method void IllegalStateException(String)>
	//   15   30:athrow          
		else
			return;
	//   16   31:return          
	}

	protected Context context;
	final Object declaredOrigin;
	private int noContextWarning;
}
