// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.anrwatchdog;

import android.os.Looper;
import java.io.Serializable;
import java.util.*;

// Referenced classes of package com.github.anrwatchdog:
//			ANRError$$

public class ANRError extends Error
{
	private static class ANRError$$
		implements Serializable
	{

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

	}

	private class .._Thread extends Throwable
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

		private .._Thread(.._Thread _pthread)
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

	}


	private ANRError(.._Thread _pthread)
	{
		super("Application Not Responding", ((Throwable) (_pthread)));
	//    0    0:aload_0         
	//    1    1:ldc1            #20  <String "Application Not Responding">
	//    2    3:aload_1         
	//    3    4:invokespecial   #23  <Method void Error(String, Throwable)>
	//    4    7:return          
	}

	static ANRError New(String s, boolean flag)
	{
		Object obj = ((Object) (Looper.getMainLooper().getThread()));
	//    0    0:invokestatic    #32  <Method Looper Looper.getMainLooper()>
	//    1    3:invokevirtual   #36  <Method Thread Looper.getThread()>
	//    2    6:astore_2        
		TreeMap treemap = new TreeMap(new Comparator(((Thread) (obj))) {

			public volatile int compare(Object obj2, Object obj3)
			{
				return compare((Thread)obj2, (Thread)obj3);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class Thread>
			//    3    5:aload_2         
			//    4    6:checkcast       #26  <Class Thread>
			//    5    9:invokevirtual   #29  <Method int compare(Thread, Thread)>
			//    6   12:ireturn         
			}

			public int compare(Thread thread, Thread thread1)
			{
				if(thread == thread1)
			//*   0    0:aload_1         
			//*   1    1:aload_2         
			//*   2    2:if_acmpne       7
					return 0;
			//    3    5:iconst_0        
			//    4    6:ireturn         
				Thread thread2 = mainThread;
			//    5    7:aload_0         
			//    6    8:getfield        #18  <Field Thread val$mainThread>
			//    7   11:astore_3        
				if(thread == thread2)
			//*   8   12:aload_1         
			//*   9   13:aload_3         
			//*  10   14:if_acmpne       19
					return 1;
			//   11   17:iconst_1        
			//   12   18:ireturn         
				if(thread1 == thread2)
			//*  13   19:aload_2         
			//*  14   20:aload_3         
			//*  15   21:if_acmpne       26
					return -1;
			//   16   24:iconst_m1       
			//   17   25:ireturn         
				else
					return thread1.getName().compareTo(thread.getName());
			//   18   26:aload_2         
			//   19   27:invokevirtual   #33  <Method String Thread.getName()>
			//   20   30:aload_1         
			//   21   31:invokevirtual   #33  <Method String Thread.getName()>
			//   22   34:invokevirtual   #39  <Method int String.compareTo(String)>
			//   23   37:ireturn         
			}

			final Thread val$mainThread;

			
			{
				mainThread = thread;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field Thread val$mainThread>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    3    7:new             #38  <Class TreeMap>
	//    4   10:dup             
	//    5   11:new             #12  <Class ANRError$1>
	//    6   14:dup             
	//    7   15:aload_2         
	//    8   16:invokespecial   #41  <Method void ANRError$1(Thread)>
	//    9   19:invokespecial   #44  <Method void TreeMap(Comparator)>
	//   10   22:astore_3        
		Iterator iterator = Thread.getAllStackTraces().entrySet().iterator();
	//   11   23:invokestatic    #50  <Method Map Thread.getAllStackTraces()>
	//   12   26:invokeinterface #56  <Method Set Map.entrySet()>
	//   13   31:invokeinterface #62  <Method Iterator Set.iterator()>
	//   14   36:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   15   38:aload           4
	//   16   40:invokeinterface #68  <Method boolean Iterator.hasNext()>
	//   17   45:ifeq            133
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   18   48:aload           4
	//   19   50:invokeinterface #72  <Method Object Iterator.next()>
	//   20   55:checkcast       #74  <Class java.util.Map$Entry>
	//   21   58:astore          5
			if(entry.getKey() == obj || ((Thread)entry.getKey()).getName().startsWith(s) && (flag || ((StackTraceElement[])entry.getValue()).length > 0))
	//*  22   60:aload           5
	//*  23   62:invokeinterface #77  <Method Object java.util.Map$Entry.getKey()>
	//*  24   67:aload_2         
	//*  25   68:if_acmpeq       109
	//*  26   71:aload           5
	//*  27   73:invokeinterface #77  <Method Object java.util.Map$Entry.getKey()>
	//*  28   78:checkcast       #46  <Class Thread>
	//*  29   81:invokevirtual   #81  <Method String Thread.getName()>
	//*  30   84:aload_0         
	//*  31   85:invokevirtual   #87  <Method boolean String.startsWith(String)>
	//*  32   88:ifeq            38
	//*  33   91:iload_1         
	//*  34   92:ifne            109
	//*  35   95:aload           5
	//*  36   97:invokeinterface #90  <Method Object java.util.Map$Entry.getValue()>
	//*  37  102:checkcast       #92  <Class StackTraceElement[]>
	//*  38  105:arraylength     
	//*  39  106:ifle            38
				((Map) (treemap)).put(entry.getKey(), entry.getValue());
	//   40  109:aload_3         
	//   41  110:aload           5
	//   42  112:invokeinterface #77  <Method Object java.util.Map$Entry.getKey()>
	//   43  117:aload           5
	//   44  119:invokeinterface #90  <Method Object java.util.Map$Entry.getValue()>
	//   45  124:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//   46  129:pop             
		} while(true);
	//   47  130:goto            38
		if(!((Map) (treemap)).containsKey(obj))
	//*  48  133:aload_3         
	//*  49  134:aload_2         
	//*  50  135:invokeinterface #100 <Method boolean Map.containsKey(Object)>
	//*  51  140:ifne            155
			((Map) (treemap)).put(obj, ((Object) (((Thread) (obj)).getStackTrace())));
	//   52  143:aload_3         
	//   53  144:aload_2         
	//   54  145:aload_2         
	//   55  146:invokevirtual   #104 <Method StackTraceElement[] Thread.getStackTrace()>
	//   56  149:invokeinterface #96  <Method Object Map.put(Object, Object)>
	//   57  154:pop             
		obj = ((Object) (((Map) (treemap)).entrySet().iterator()));
	//   58  155:aload_3         
	//   59  156:invokeinterface #56  <Method Set Map.entrySet()>
	//   60  161:invokeinterface #62  <Method Iterator Set.iterator()>
	//   61  166:astore_2        
		Object obj1;
		for(s = null; ((Iterator) (obj)).hasNext(); s = ((String) (((.._Thread) (obj1)). new .._Thread(((.._Thread) (s))))))
	//*  62  167:aconst_null     
	//*  63  168:astore_0        
	//*  64  169:aload_2         
	//*  65  170:invokeinterface #68  <Method boolean Iterator.hasNext()>
	//*  66  175:ifeq            237
		{
			obj1 = ((Object) ((java.util.Map.Entry)((Iterator) (obj)).next()));
	//   67  178:aload_2         
	//   68  179:invokeinterface #72  <Method Object Iterator.next()>
	//   69  184:checkcast       #74  <Class java.util.Map$Entry>
	//   70  187:astore_3        
			obj1 = ((Object) (new ANRError$$(getThreadTitle((Thread)((java.util.Map.Entry) (obj1)).getKey()), (StackTraceElement[])((java.util.Map.Entry) (obj1)).getValue())));
	//   71  188:new             #6   <Class ANRError$$>
	//   72  191:dup             
	//   73  192:aload_3         
	//   74  193:invokeinterface #77  <Method Object java.util.Map$Entry.getKey()>
	//   75  198:checkcast       #46  <Class Thread>
	//   76  201:invokestatic    #108 <Method String getThreadTitle(Thread)>
	//   77  204:aload_3         
	//   78  205:invokeinterface #90  <Method Object java.util.Map$Entry.getValue()>
	//   79  210:checkcast       #92  <Class StackTraceElement[]>
	//   80  213:aconst_null     
	//   81  214:invokespecial   #111 <Method void ANRError$$(String, StackTraceElement[], ANRError$1)>
	//   82  217:astore_3        
			obj1.getClass();
	//   83  218:aload_3         
	//   84  219:invokevirtual   #117 <Method Class Object.getClass()>
	//   85  222:pop             
		}

	//   86  223:new             #9   <Class ANRError$$$_Thread>
	//   87  226:dup             
	//   88  227:aload_3         
	//   89  228:aload_0         
	//   90  229:aconst_null     
	//   91  230:invokespecial   #120 <Method void ANRError$$$_Thread(ANRError$$, ANRError$$$_Thread, ANRError$1)>
	//   92  233:astore_0        
	//*  93  234:goto            169
		return new ANRError(((.._Thread) (s)));
	//   94  237:new             #2   <Class ANRError>
	//   95  240:dup             
	//   96  241:aload_0         
	//   97  242:invokespecial   #122 <Method void ANRError(ANRError$$$_Thread)>
	//   98  245:areturn         
	}

	static ANRError NewMainOnly()
	{
		Object obj = ((Object) (Looper.getMainLooper().getThread()));
	//    0    0:invokestatic    #32  <Method Looper Looper.getMainLooper()>
	//    1    3:invokevirtual   #36  <Method Thread Looper.getThread()>
	//    2    6:astore_0        
		StackTraceElement astacktraceelement[] = ((Thread) (obj)).getStackTrace();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #104 <Method StackTraceElement[] Thread.getStackTrace()>
	//    5   11:astore_1        
		obj = ((Object) (new ANRError$$(getThreadTitle(((Thread) (obj))), astacktraceelement)));
	//    6   12:new             #6   <Class ANRError$$>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokestatic    #108 <Method String getThreadTitle(Thread)>
	//   10   20:aload_1         
	//   11   21:aconst_null     
	//   12   22:invokespecial   #111 <Method void ANRError$$(String, StackTraceElement[], ANRError$1)>
	//   13   25:astore_0        
		obj.getClass();
	//   14   26:aload_0         
	//   15   27:invokevirtual   #117 <Method Class Object.getClass()>
	//   16   30:pop             
		return new ANRError(((.._Thread) (obj)). new .._Thread(((.._Thread) (null))));
	//   17   31:new             #2   <Class ANRError>
	//   18   34:dup             
	//   19   35:new             #9   <Class ANRError$$$_Thread>
	//   20   38:dup             
	//   21   39:aload_0         
	//   22   40:aconst_null     
	//   23   41:aconst_null     
	//   24   42:invokespecial   #120 <Method void ANRError$$$_Thread(ANRError$$, ANRError$$$_Thread, ANRError$1)>
	//   25   45:invokespecial   #122 <Method void ANRError(ANRError$$$_Thread)>
	//   26   48:areturn         
	}

	private static String getThreadTitle(Thread thread)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #126 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #129 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(thread.getName());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #81  <Method String Thread.getName()>
	//    7   13:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(" (state = ");
	//    9   17:aload_1         
	//   10   18:ldc1            #135 <String " (state = ">
	//   11   20:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(((Object) (thread.getState())));
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:invokevirtual   #139 <Method Thread$State Thread.getState()>
	//   16   29:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
	//   17   32:pop             
		stringbuilder.append(")");
	//   18   33:aload_1         
	//   19   34:ldc1            #144 <String ")">
	//   20   36:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		return stringbuilder.toString();
	//   22   40:aload_1         
	//   23   41:invokevirtual   #147 <Method String StringBuilder.toString()>
	//   24   44:areturn         
	}

	public Throwable fillInStackTrace()
	{
		setStackTrace(new StackTraceElement[0]);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:anewarray       StackTraceElement[]
	//    3    5:invokevirtual   #155 <Method void setStackTrace(StackTraceElement[])>
		return ((Throwable) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	private static final long serialVersionUID = 1L;
}
