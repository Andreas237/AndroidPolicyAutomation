// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.anrwatchdog;

import android.os.*;
import android.util.Log;

// Referenced classes of package com.github.anrwatchdog:
//			ANRError

public class ANRWatchDog extends Thread
{
	public static interface ANRListener
	{

		public abstract void onAppNotResponding(ANRError anrerror);
	}

	public static interface InterruptionListener
	{

		public abstract void onInterrupted(InterruptedException interruptedexception);
	}


	public ANRWatchDog()
	{
		this(5000);
	//    0    0:aload_0         
	//    1    1:sipush          5000
	//    2    4:invokespecial   #50  <Method void ANRWatchDog(int)>
	//    3    7:return          
	}

	public ANRWatchDog(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void Thread()>
		_anrListener = DEFAULT_ANR_LISTENER;
	//    2    4:aload_0         
	//    3    5:getstatic       #43  <Field ANRWatchDog$ANRListener DEFAULT_ANR_LISTENER>
	//    4    8:putfield        #53  <Field ANRWatchDog$ANRListener _anrListener>
		_interruptionListener = DEFAULT_INTERRUPTION_LISTENER;
	//    5   11:aload_0         
	//    6   12:getstatic       #46  <Field ANRWatchDog$InterruptionListener DEFAULT_INTERRUPTION_LISTENER>
	//    7   15:putfield        #55  <Field ANRWatchDog$InterruptionListener _interruptionListener>
		_uiHandler = new Handler(Looper.getMainLooper());
	//    8   18:aload_0         
	//    9   19:new             #57  <Class Handler>
	//   10   22:dup             
	//   11   23:invokestatic    #63  <Method Looper Looper.getMainLooper()>
	//   12   26:invokespecial   #66  <Method void Handler(Looper)>
	//   13   29:putfield        #68  <Field Handler _uiHandler>
		_namePrefix = "";
	//   14   32:aload_0         
	//   15   33:ldc1            #70  <String "">
	//   16   35:putfield        #72  <Field String _namePrefix>
		_logThreadsWithoutStackTrace = false;
	//   17   38:aload_0         
	//   18   39:iconst_0        
	//   19   40:putfield        #74  <Field boolean _logThreadsWithoutStackTrace>
		_ignoreDebugger = false;
	//   20   43:aload_0         
	//   21   44:iconst_0        
	//   22   45:putfield        #76  <Field boolean _ignoreDebugger>
		_tick = 0;
	//   23   48:aload_0         
	//   24   49:iconst_0        
	//   25   50:putfield        #78  <Field int _tick>
		_ticker = new Runnable() {

			public void run()
			{
				ANRWatchDog anrwatchdog = ANRWatchDog.this;
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field ANRWatchDog this$0>
			//    2    4:astore_1        
				anrwatchdog._tick = (anrwatchdog._tick + 1) % 0x7fffffff;
			//    3    5:aload_1         
			//    4    6:aload_1         
			//    5    7:invokestatic    #23  <Method int ANRWatchDog.access$000(ANRWatchDog)>
			//    6   10:iconst_1        
			//    7   11:iadd            
			//    8   12:ldc1            #24  <Int 0x7fffffff>
			//    9   14:irem            
			//   10   15:invokestatic    #28  <Method int ANRWatchDog.access$002(ANRWatchDog, int)>
			//   11   18:pop             
			//   12   19:return          
			}

			final ANRWatchDog this$0;

			
			{
				this$0 = ANRWatchDog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ANRWatchDog this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   26   53:aload_0         
	//   27   54:new             #10  <Class ANRWatchDog$3>
	//   28   57:dup             
	//   29   58:aload_0         
	//   30   59:invokespecial   #81  <Method void ANRWatchDog$3(ANRWatchDog)>
	//   31   62:putfield        #83  <Field Runnable _ticker>
		_timeoutInterval = i;
	//   32   65:aload_0         
	//   33   66:iload_1         
	//   34   67:putfield        #85  <Field int _timeoutInterval>
	//   35   70:return          
	}

	public void run()
	{
		setName("|ANR-WatchDog|");
	//    0    0:aload_0         
	//    1    1:ldc1            #94  <String "|ANR-WatchDog|">
	//    2    3:invokevirtual   #98  <Method void setName(String)>
		int i = -1;
	//    3    6:iconst_m1       
	//    4    7:istore_1        
		do
		{
			if(isInterrupted())
				break;
	//    5    8:aload_0         
	//    6    9:invokevirtual   #102 <Method boolean isInterrupted()>
	//    7   12:ifne            133
			int j = _tick;
	//    8   15:aload_0         
	//    9   16:getfield        #78  <Field int _tick>
	//   10   19:istore_2        
			_uiHandler.post(_ticker);
	//   11   20:aload_0         
	//   12   21:getfield        #68  <Field Handler _uiHandler>
	//   13   24:aload_0         
	//   14   25:getfield        #83  <Field Runnable _ticker>
	//   15   28:invokevirtual   #106 <Method boolean Handler.post(Runnable)>
	//   16   31:pop             
			try
			{
				Thread.sleep(_timeoutInterval);
	//   17   32:aload_0         
	//   18   33:getfield        #85  <Field int _timeoutInterval>
	//   19   36:i2l             
	//   20   37:invokestatic    #110 <Method void Thread.sleep(long)>
			}
	//*  21   40:aload_0         
	//*  22   41:getfield        #78  <Field int _tick>
	//*  23   44:iload_2         
	//*  24   45:icmpne          8
	//*  25   48:aload_0         
	//*  26   49:getfield        #76  <Field boolean _ignoreDebugger>
	//*  27   52:ifne            85
	//*  28   55:invokestatic    #115 <Method boolean Debug.isDebuggerConnected()>
	//*  29   58:ifeq            85
	//*  30   61:aload_0         
	//*  31   62:getfield        #78  <Field int _tick>
	//*  32   65:iload_1         
	//*  33   66:icmpeq          77
	//*  34   69:ldc1            #117 <String "ANRWatchdog">
	//*  35   71:ldc1            #119 <String "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))">
	//*  36   73:invokestatic    #125 <Method int Log.w(String, String)>
	//*  37   76:pop             
	//*  38   77:aload_0         
	//*  39   78:getfield        #78  <Field int _tick>
	//*  40   81:istore_1        
	//*  41   82:goto            8
	//*  42   85:aload_0         
	//*  43   86:getfield        #72  <Field String _namePrefix>
	//*  44   89:astore_3        
	//*  45   90:aload_3         
	//*  46   91:ifnull          106
	//*  47   94:aload_3         
	//*  48   95:aload_0         
	//*  49   96:getfield        #74  <Field boolean _logThreadsWithoutStackTrace>
	//*  50   99:invokestatic    #131 <Method ANRError ANRError.New(String, boolean)>
	//*  51  102:astore_3        
	//*  52  103:goto            110
	//*  53  106:invokestatic    #135 <Method ANRError ANRError.NewMainOnly()>
	//*  54  109:astore_3        
	//*  55  110:aload_0         
	//*  56  111:getfield        #53  <Field ANRWatchDog$ANRListener _anrListener>
	//*  57  114:aload_3         
	//*  58  115:invokeinterface #139 <Method void ANRWatchDog$ANRListener.onAppNotResponding(ANRError)>
	//*  59  120:return          
			catch(InterruptedException interruptedexception)
	//*  60  121:astore_3        
			{
				_interruptionListener.onInterrupted(interruptedexception);
	//   61  122:aload_0         
	//   62  123:getfield        #55  <Field ANRWatchDog$InterruptionListener _interruptionListener>
	//   63  126:aload_3         
	//   64  127:invokeinterface #143 <Method void ANRWatchDog$InterruptionListener.onInterrupted(InterruptedException)>
				return;
	//   65  132:return          
			}
			if(_tick == j)
				if(!_ignoreDebugger && Debug.isDebuggerConnected())
				{
					if(_tick != i)
						Log.w("ANRWatchdog", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
					i = _tick;
				} else
				{
					Object obj = ((Object) (_namePrefix));
					if(obj != null)
						obj = ((Object) (ANRError.New(((String) (obj)), _logThreadsWithoutStackTrace)));
					else
						obj = ((Object) (ANRError.NewMainOnly()));
					_anrListener.onAppNotResponding(((ANRError) (obj)));
					return;
				}
		} while(true);
	//   66  133:return          
	}

	public ANRWatchDog setANRListener(ANRListener anrlistener)
	{
		if(anrlistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
		{
			_anrListener = DEFAULT_ANR_LISTENER;
	//    2    4:aload_0         
	//    3    5:getstatic       #43  <Field ANRWatchDog$ANRListener DEFAULT_ANR_LISTENER>
	//    4    8:putfield        #53  <Field ANRWatchDog$ANRListener _anrListener>
			return this;
	//    5   11:aload_0         
	//    6   12:areturn         
		} else
		{
			_anrListener = anrlistener;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:putfield        #53  <Field ANRWatchDog$ANRListener _anrListener>
			return this;
	//   10   18:aload_0         
	//   11   19:areturn         
		}
	}

	public ANRWatchDog setIgnoreDebugger(boolean flag)
	{
		_ignoreDebugger = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #76  <Field boolean _ignoreDebugger>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ANRWatchDog setInterruptionListener(InterruptionListener interruptionlistener)
	{
		if(interruptionlistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
		{
			_interruptionListener = DEFAULT_INTERRUPTION_LISTENER;
	//    2    4:aload_0         
	//    3    5:getstatic       #46  <Field ANRWatchDog$InterruptionListener DEFAULT_INTERRUPTION_LISTENER>
	//    4    8:putfield        #55  <Field ANRWatchDog$InterruptionListener _interruptionListener>
			return this;
	//    5   11:aload_0         
	//    6   12:areturn         
		} else
		{
			_interruptionListener = interruptionlistener;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:putfield        #55  <Field ANRWatchDog$InterruptionListener _interruptionListener>
			return this;
	//   10   18:aload_0         
	//   11   19:areturn         
		}
	}

	public ANRWatchDog setLogThreadsWithoutStackTrace(boolean flag)
	{
		_logThreadsWithoutStackTrace = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #74  <Field boolean _logThreadsWithoutStackTrace>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ANRWatchDog setReportMainThreadOnly()
	{
		_namePrefix = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #72  <Field String _namePrefix>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ANRWatchDog setReportThreadNamePrefix(String s)
	{
		String s1 = s;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(s == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       9
			s1 = "";
	//    4    6:ldc1            #70  <String "">
	//    5    8:astore_2        
		_namePrefix = s1;
	//    6    9:aload_0         
	//    7   10:aload_2         
	//    8   11:putfield        #72  <Field String _namePrefix>
		return this;
	//    9   14:aload_0         
	//   10   15:areturn         
	}

	private static final ANRListener DEFAULT_ANR_LISTENER = new ANRListener() {

		public void onAppNotResponding(ANRError anrerror)
		{
			throw anrerror;
		//    0    0:aload_1         
		//    1    1:athrow          
		}

	}
;
	private static final int DEFAULT_ANR_TIMEOUT = 5000;
	private static final InterruptionListener DEFAULT_INTERRUPTION_LISTENER = new InterruptionListener() {

		public void onInterrupted(InterruptedException interruptedexception)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #17  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #18  <Method void StringBuilder()>
		//    3    7:astore_2        
			stringbuilder.append("Interrupted: ");
		//    4    8:aload_2         
		//    5    9:ldc1            #20  <String "Interrupted: ">
		//    6   11:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(interruptedexception.getMessage());
		//    8   15:aload_2         
		//    9   16:aload_1         
		//   10   17:invokevirtual   #30  <Method String InterruptedException.getMessage()>
		//   11   20:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
		//   12   23:pop             
			Log.w("ANRWatchdog", stringbuilder.toString());
		//   13   24:ldc1            #32  <String "ANRWatchdog">
		//   14   26:aload_2         
		//   15   27:invokevirtual   #35  <Method String StringBuilder.toString()>
		//   16   30:invokestatic    #41  <Method int Log.w(String, String)>
		//   17   33:pop             
		//   18   34:return          
		}

	}
;
	private ANRListener _anrListener;
	private boolean _ignoreDebugger;
	private InterruptionListener _interruptionListener;
	private boolean _logThreadsWithoutStackTrace;
	private String _namePrefix;
	private volatile int _tick;
	private final Runnable _ticker;
	private final int _timeoutInterval;
	private final Handler _uiHandler;

	static 
	{
	//    0    0:new             #6   <Class ANRWatchDog$1>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void ANRWatchDog$1()>
	//    3    7:putstatic       #43  <Field ANRWatchDog$ANRListener DEFAULT_ANR_LISTENER>
	//    4   10:new             #8   <Class ANRWatchDog$2>
	//    5   13:dup             
	//    6   14:invokespecial   #44  <Method void ANRWatchDog$2()>
	//    7   17:putstatic       #46  <Field ANRWatchDog$InterruptionListener DEFAULT_INTERRUPTION_LISTENER>
	//*   8   20:return          
	}


/*
	static int access$000(ANRWatchDog anrwatchdog)
	{
		return anrwatchdog._tick;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field int _tick>
	//    2    4:ireturn         
	}

*/


/*
	static int access$002(ANRWatchDog anrwatchdog, int i)
	{
		anrwatchdog._tick = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #78  <Field int _tick>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/
}
