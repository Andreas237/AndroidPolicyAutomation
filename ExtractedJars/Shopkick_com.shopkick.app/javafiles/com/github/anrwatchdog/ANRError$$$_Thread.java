// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.anrwatchdog;


// Referenced classes of package com.github.anrwatchdog:
//			ANRError$$, ANRError

private class ANRError$$$_Thread extends Throwable
{

	public Throwable fillInStackTrace()
	{
		setStackTrace(ANRError$$.access$100(ANRError$$.this));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #16  <Field ANRError$$ this$0>
	//    3    5:invokestatic    #33  <Method StackTraceElement[] ANRError$$.access$100(ANRError$$)>
	//    4    8:invokevirtual   #37  <Method void setStackTrace(StackTraceElement[])>
		return ((Throwable) (this));
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	final ANRError$$ this$0;

	private ANRError$$$_Thread(ANRError$$$_Thread anrerror$$$_thread)
	{
		this$0 = ANRError$$.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field ANRError$$ this$0>
		super(ANRError$$.access$000(ANRError$$.this), ((Throwable) (anrerror$$$_thread)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokestatic    #20  <Method String ANRError$$.access$000(ANRError$$)>
	//    6   10:aload_2         
	//    7   11:invokespecial   #23  <Method void Throwable(String, Throwable)>
	//    8   14:return          
	}

	ANRError$$$_Thread(ANRError$$$_Thread anrerror$$$_thread, ANRError._cls1 _pcls1)
	{
		this(anrerror$$$_thread);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #27  <Method void ANRError$$$_Thread(ANRError$$, ANRError$$$_Thread)>
	//    4    6:return          
	}
}
