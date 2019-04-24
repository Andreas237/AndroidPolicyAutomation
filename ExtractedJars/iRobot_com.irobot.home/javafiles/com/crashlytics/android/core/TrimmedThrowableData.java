// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//			StackTraceTrimmingStrategy

class TrimmedThrowableData
{

	public TrimmedThrowableData(Throwable throwable, StackTraceTrimmingStrategy stacktracetrimmingstrategy)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		localizedMessage = throwable.getLocalizedMessage();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #22  <Method String Throwable.getLocalizedMessage()>
	//    5    9:putfield        #24  <Field String localizedMessage>
		className = ((Object) (throwable)).getClass().getName();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #28  <Method Class Object.getClass()>
	//    9   17:invokevirtual   #33  <Method String Class.getName()>
	//   10   20:putfield        #35  <Field String className>
		stacktrace = stacktracetrimmingstrategy.getTrimmedStackTrace(throwable.getStackTrace());
	//   11   23:aload_0         
	//   12   24:aload_2         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #39  <Method StackTraceElement[] Throwable.getStackTrace()>
	//   15   29:invokeinterface #45  <Method StackTraceElement[] StackTraceTrimmingStrategy.getTrimmedStackTrace(StackTraceElement[])>
	//   16   34:putfield        #47  <Field StackTraceElement[] stacktrace>
		throwable = throwable.getCause();
	//   17   37:aload_1         
	//   18   38:invokevirtual   #51  <Method Throwable Throwable.getCause()>
	//   19   41:astore_1        
		if(throwable != null)
	//*  20   42:aload_1         
	//*  21   43:ifnull          59
			throwable = ((Throwable) (new TrimmedThrowableData(throwable, stacktracetrimmingstrategy)));
	//   22   46:new             #2   <Class TrimmedThrowableData>
	//   23   49:dup             
	//   24   50:aload_1         
	//   25   51:aload_2         
	//   26   52:invokespecial   #53  <Method void TrimmedThrowableData(Throwable, StackTraceTrimmingStrategy)>
	//   27   55:astore_1        
		else
	//*  28   56:goto            61
			throwable = null;
	//   29   59:aconst_null     
	//   30   60:astore_1        
		cause = ((TrimmedThrowableData) (throwable));
	//   31   61:aload_0         
	//   32   62:aload_1         
	//   33   63:putfield        #55  <Field TrimmedThrowableData cause>
	//   34   66:return          
	}

	public final TrimmedThrowableData cause;
	public final String className;
	public final String localizedMessage;
	public final StackTraceElement stacktrace[];
}
