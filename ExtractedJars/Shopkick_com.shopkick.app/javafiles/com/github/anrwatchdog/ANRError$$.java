// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.anrwatchdog;

import java.io.Serializable;

// Referenced classes of package com.github.anrwatchdog:
//			ANRError

class ANRError$$
	implements Serializable
{
	private class _Thread extends Throwable
	{

		public Throwable fillInStackTrace()
		{
			setStackTrace(_stackTrace);
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

		private _Thread(_Thread _pthread)
		{
			this$0 = ANRError$$.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field ANRError$$ this$0>
			super(_name, ((Throwable) (_pthread)));
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokestatic    #20  <Method String ANRError$$.access$000(ANRError$$)>
		//    6   10:aload_2         
		//    7   11:invokespecial   #23  <Method void Throwable(String, Throwable)>
		//    8   14:return          
		}

		_Thread(_Thread _pthread, ANRError._cls1 _pcls1)
		{
			this(_pthread);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #27  <Method void ANRError$$$_Thread(ANRError$$, ANRError$$$_Thread)>
		//    4    6:return          
		}
	}


	private ANRError$$(String s, StackTraceElement astacktraceelement[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		_name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field String _name>
		_stackTrace = astacktraceelement;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field StackTraceElement[] _stackTrace>
	//    8   14:return          
	}

	ANRError$$(String s, StackTraceElement astacktraceelement[], ANRError._cls1 _pcls1)
	{
		this(s, astacktraceelement);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #29  <Method void ANRError$$(String, StackTraceElement[])>
	//    4    6:return          
	}

	private final String _name;
	private final StackTraceElement _stackTrace[];


/*
	static String access$000(ANRError$$ anrerror$$)
	{
		return anrerror$$._name;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String _name>
	//    2    4:areturn         
	}

*/


/*
	static StackTraceElement[] access$100(ANRError$$ anrerror$$)
	{
		return anrerror$$._stackTrace;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field StackTraceElement[] _stackTrace>
	//    2    4:areturn         
	}

*/
}
