// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.dumpapp.plugins;

import android.os.Process;
import com.facebook.stetho.common.ExceptionUtil;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.dumpapp.*;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;

public class CrashDumperPlugin
	implements DumperPlugin
{
	private static class ThrowRunnable
		implements Runnable
	{

		public void run()
		{
			ExceptionUtil.sneakyThrow(mThrowable);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Throwable mThrowable>
		//    2    4:invokestatic    #25  <Method void ExceptionUtil.sneakyThrow(Throwable)>
		//    3    7:return          
		}

		private final Throwable mThrowable;

		public ThrowRunnable(Throwable throwable)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			mThrowable = throwable;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field Throwable mThrowable>
		//    5    9:return          
		}
	}


	public CrashDumperPlugin()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}

	private void doKill(DumperContext dumpercontext, Iterator iterator)
		throws DumpException
	{
		iterator = ((Iterator) (ArgsHelper.nextOptionalArg(iterator, "9")));
	//    0    0:aload_2         
	//    1    1:ldc1            #19  <String "9">
	//    2    3:invokestatic    #39  <Method String ArgsHelper.nextOptionalArg(Iterator, String)>
	//    3    6:astore_2        
		ProcessBuilder processbuilder = new ProcessBuilder(new String[0]);
	//    4    7:new             #41  <Class ProcessBuilder>
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:anewarray       String[]
	//    8   15:invokespecial   #46  <Method void ProcessBuilder(String[])>
	//    9   18:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   10   19:new             #48  <Class StringBuilder>
	//   11   22:dup             
	//   12   23:invokespecial   #49  <Method void StringBuilder()>
	//   13   26:astore          4
		stringbuilder.append("-");
	//   14   28:aload           4
	//   15   30:ldc1            #51  <String "-">
	//   16   32:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
		stringbuilder.append(((String) (iterator)));
	//   18   36:aload           4
	//   19   38:aload_2         
	//   20   39:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   21   42:pop             
		iterator = ((Iterator) (processbuilder.command(new String[] {
			"/system/bin/kill", stringbuilder.toString(), String.valueOf(Process.myPid())
		}).redirectErrorStream(true).start()));
	//   22   43:aload_3         
	//   23   44:iconst_3        
	//   24   45:anewarray       String[]
	//   25   48:dup             
	//   26   49:iconst_0        
	//   27   50:ldc1            #57  <String "/system/bin/kill">
	//   28   52:aastore         
	//   29   53:dup             
	//   30   54:iconst_1        
	//   31   55:aload           4
	//   32   57:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   33   60:aastore         
	//   34   61:dup             
	//   35   62:iconst_2        
	//   36   63:invokestatic    #67  <Method int Process.myPid()>
	//   37   66:invokestatic    #71  <Method String String.valueOf(int)>
	//   38   69:aastore         
	//   39   70:invokevirtual   #75  <Method ProcessBuilder ProcessBuilder.command(String[])>
	//   40   73:iconst_1        
	//   41   74:invokevirtual   #79  <Method ProcessBuilder ProcessBuilder.redirectErrorStream(boolean)>
	//   42   77:invokevirtual   #83  <Method Process ProcessBuilder.start()>
	//   43   80:astore_2        
		Util.copy(((Process) (iterator)).getInputStream(), ((java.io.OutputStream) (dumpercontext.getStdout())), new byte[1024]);
	//   44   81:aload_2         
	//   45   82:invokevirtual   #89  <Method java.io.InputStream Process.getInputStream()>
	//   46   85:aload_1         
	//   47   86:invokevirtual   #95  <Method PrintStream DumperContext.getStdout()>
	//   48   89:sipush          1024
	//   49   92:newarray        byte[]
	//   50   94:invokestatic    #101 <Method void Util.copy(java.io.InputStream, java.io.OutputStream, byte[])>
		try
		{
			((Process) (iterator)).destroy();
	//   51   97:aload_2         
	//   52   98:invokevirtual   #104 <Method void Process.destroy()>
			return;
	//   53  101:return          
		}
	//*  54  102:astore_1        
	//*  55  103:aload_2         
	//*  56  104:invokevirtual   #104 <Method void Process.destroy()>
	//*  57  107:aload_1         
	//*  58  108:athrow          
		// Misplaced declaration of an exception variable
		catch(DumperContext dumpercontext)
	//*  59  109:astore_1        
		{
			iterator = ((Iterator) (new StringBuilder()));
	//   60  110:new             #48  <Class StringBuilder>
	//   61  113:dup             
	//   62  114:invokespecial   #49  <Method void StringBuilder()>
	//   63  117:astore_2        
		}
		break MISSING_BLOCK_LABEL_118;
		dumpercontext;
		((Process) (iterator)).destroy();
		throw dumpercontext;
		((StringBuilder) (iterator)).append("Failed to invoke kill: ");
	//   64  118:aload_2         
	//   65  119:ldc1            #106 <String "Failed to invoke kill: ">
	//   66  121:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   67  124:pop             
		((StringBuilder) (iterator)).append(((Object) (dumpercontext)));
	//   68  125:aload_2         
	//   69  126:aload_1         
	//   70  127:invokevirtual   #109 <Method StringBuilder StringBuilder.append(Object)>
	//   71  130:pop             
		throw new DumpException(((StringBuilder) (iterator)).toString());
	//   72  131:new             #31  <Class DumpException>
	//   73  134:dup             
	//   74  135:aload_2         
	//   75  136:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   76  139:invokespecial   #112 <Method void DumpException(String)>
	//   77  142:athrow          
	}

	private void doSystemExit(Iterator iterator)
	{
		System.exit(Integer.parseInt(ArgsHelper.nextOptionalArg(iterator, "0")));
	//    0    0:aload_1         
	//    1    1:ldc1            #16  <String "0">
	//    2    3:invokestatic    #39  <Method String ArgsHelper.nextOptionalArg(Iterator, String)>
	//    3    6:invokestatic    #123 <Method int Integer.parseInt(String)>
	//    4    9:invokestatic    #129 <Method void System.exit(int)>
	//    5   12:return          
	}

	private void doUncaughtException(Iterator iterator)
		throws DumpException
	{
		iterator = ((Iterator) (ArgsHelper.nextOptionalArg(iterator, "java.lang.Error")));
	//    0    0:aload_1         
	//    1    1:ldc1            #22  <String "java.lang.Error">
	//    2    3:invokestatic    #39  <Method String ArgsHelper.nextOptionalArg(Iterator, String)>
	//    3    6:astore_1        
		Constructor constructor;
		iterator = ((Iterator) (Class.forName(((String) (iterator)))));
	//    4    7:aload_1         
	//    5    8:invokestatic    #149 <Method Class Class.forName(String)>
	//    6   11:astore_1        
		constructor = tryGetDeclaredConstructor(((Class) (iterator)), new Class[] {
			java/lang/String
		});
	//    7   12:aload_1         
	//    8   13:iconst_1        
	//    9   14:anewarray       Class[]
	//   10   17:dup             
	//   11   18:iconst_0        
	//   12   19:ldc1            #43  <Class String>
	//   13   21:aastore         
	//   14   22:invokestatic    #153 <Method Constructor tryGetDeclaredConstructor(Class, Class[])>
	//   15   25:astore_2        
		if(constructor == null) goto _L2; else goto _L1
	//   16   26:aload_2         
	//   17   27:ifnull          50
_L1:
		try
		{
			iterator = ((Iterator) ((Throwable)constructor.newInstance(new Object[] {
				"Uncaught exception triggered by Stetho"
			})));
	//   18   30:aload_2         
	//   19   31:iconst_1        
	//   20   32:anewarray       Object[]
	//   21   35:dup             
	//   22   36:iconst_0        
	//   23   37:ldc1            #155 <String "Uncaught exception triggered by Stetho">
	//   24   39:aastore         
	//   25   40:invokevirtual   #161 <Method Object Constructor.newInstance(Object[])>
	//   26   43:checkcast       #163 <Class Throwable>
	//   27   46:astore_1        
			break MISSING_BLOCK_LABEL_69;
	//   28   47:goto            69
		}
	//*  29   50:aload_1         
	//*  30   51:iconst_0        
	//*  31   52:anewarray       Class[]
	//*  32   55:invokevirtual   #167 <Method Constructor Class.getDeclaredConstructor(Class[])>
	//*  33   58:iconst_0        
	//*  34   59:anewarray       Object[]
	//*  35   62:invokevirtual   #161 <Method Object Constructor.newInstance(Object[])>
	//*  36   65:checkcast       #163 <Class Throwable>
	//*  37   68:astore_1        
	//*  38   69:new             #169 <Class Thread>
	//*  39   72:dup             
	//*  40   73:new             #8   <Class CrashDumperPlugin$ThrowRunnable>
	//*  41   76:dup             
	//*  42   77:aload_1         
	//*  43   78:invokespecial   #172 <Method void CrashDumperPlugin$ThrowRunnable(Throwable)>
	//*  44   81:invokespecial   #175 <Method void Thread(Runnable)>
	//*  45   84:astore_1        
	//*  46   85:aload_1         
	//*  47   86:invokevirtual   #177 <Method void Thread.start()>
	//*  48   89:aload_1         
	//*  49   90:invokestatic    #181 <Method void Util.joinUninterruptibly(Thread)>
	//*  50   93:return          
	//*  51   94:astore_1        
	//*  52   95:aload_1         
	//*  53   96:invokevirtual   #185 <Method Throwable InvocationTargetException.getCause()>
	//*  54   99:invokestatic    #191 <Method RuntimeException ExceptionUtil.propagate(Throwable)>
	//*  55  102:athrow          
	//*  56  103:astore_1        
	//*  57  104:goto            120
	//*  58  107:astore_1        
	//*  59  108:goto            120
	//*  60  111:astore_1        
	//*  61  112:goto            120
	//*  62  115:astore_1        
	//*  63  116:goto            120
		// Misplaced declaration of an exception variable
		catch(Iterator iterator) { }
	//   64  119:astore_1        
		// Misplaced declaration of an exception variable
		catch(Iterator iterator)
		{
			break MISSING_BLOCK_LABEL_120;
		}
		// Misplaced declaration of an exception variable
		catch(Iterator iterator)
		{
			break MISSING_BLOCK_LABEL_120;
		}
		// Misplaced declaration of an exception variable
		catch(Iterator iterator)
		{
			break MISSING_BLOCK_LABEL_120;
		}
		// Misplaced declaration of an exception variable
		catch(Iterator iterator)
		{
			break MISSING_BLOCK_LABEL_120;
		}
		// Misplaced declaration of an exception variable
		catch(Iterator iterator)
		{
			throw ExceptionUtil.propagate(((InvocationTargetException) (iterator)).getCause());
		}
		  goto _L3
_L2:
		iterator = ((Iterator) ((Throwable)((Class) (iterator)).getDeclaredConstructor(new Class[0]).newInstance(new Object[0])));
		iterator = ((Iterator) (new Thread(((Runnable) (new ThrowRunnable(((Throwable) (iterator))))))));
		((Thread) (iterator)).start();
		Util.joinUninterruptibly(((Thread) (iterator)));
		return;
_L3:
		StringBuilder stringbuilder = new StringBuilder();
	//   65  120:new             #48  <Class StringBuilder>
	//   66  123:dup             
	//   67  124:invokespecial   #49  <Method void StringBuilder()>
	//   68  127:astore_2        
		stringbuilder.append("Invalid supplied Throwable class: ");
	//   69  128:aload_2         
	//   70  129:ldc1            #193 <String "Invalid supplied Throwable class: ">
	//   71  131:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   72  134:pop             
		stringbuilder.append(((Object) (iterator)));
	//   73  135:aload_2         
	//   74  136:aload_1         
	//   75  137:invokevirtual   #109 <Method StringBuilder StringBuilder.append(Object)>
	//   76  140:pop             
		throw new DumpException(stringbuilder.toString());
	//   77  141:new             #31  <Class DumpException>
	//   78  144:dup             
	//   79  145:aload_2         
	//   80  146:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   81  149:invokespecial   #112 <Method void DumpException(String)>
	//   82  152:athrow          
	}

	private void doUsage(PrintStream printstream)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #48  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #49  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Usage: dumpapp crash ");
	//    4    8:aload_2         
	//    5    9:ldc1            #197 <String "Usage: dumpapp crash ">
	//    6   11:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append("<command> [command-options]");
	//    8   15:aload_2         
	//    9   16:ldc1            #199 <String "<command> [command-options]">
	//   10   18:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		printstream.println(stringbuilder.toString());
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   15   27:invokevirtual   #204 <Method void PrintStream.println(String)>
		stringbuilder = new StringBuilder();
	//   16   30:new             #48  <Class StringBuilder>
	//   17   33:dup             
	//   18   34:invokespecial   #49  <Method void StringBuilder()>
	//   19   37:astore_2        
		stringbuilder.append("Usage: dumpapp crash ");
	//   20   38:aload_2         
	//   21   39:ldc1            #197 <String "Usage: dumpapp crash ">
	//   22   41:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
		stringbuilder.append("throw");
	//   24   45:aload_2         
	//   25   46:ldc1            #206 <String "throw">
	//   26   48:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
		printstream.println(stringbuilder.toString());
	//   28   52:aload_1         
	//   29   53:aload_2         
	//   30   54:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   31   57:invokevirtual   #204 <Method void PrintStream.println(String)>
		stringbuilder = new StringBuilder();
	//   32   60:new             #48  <Class StringBuilder>
	//   33   63:dup             
	//   34   64:invokespecial   #49  <Method void StringBuilder()>
	//   35   67:astore_2        
		stringbuilder.append("       dumpapp crash ");
	//   36   68:aload_2         
	//   37   69:ldc1            #208 <String "       dumpapp crash ">
	//   38   71:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   39   74:pop             
		stringbuilder.append("kill");
	//   40   75:aload_2         
	//   41   76:ldc1            #210 <String "kill">
	//   42   78:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   43   81:pop             
		printstream.println(stringbuilder.toString());
	//   44   82:aload_1         
	//   45   83:aload_2         
	//   46   84:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   47   87:invokevirtual   #204 <Method void PrintStream.println(String)>
		stringbuilder = new StringBuilder();
	//   48   90:new             #48  <Class StringBuilder>
	//   49   93:dup             
	//   50   94:invokespecial   #49  <Method void StringBuilder()>
	//   51   97:astore_2        
		stringbuilder.append("       dumpapp crash ");
	//   52   98:aload_2         
	//   53   99:ldc1            #208 <String "       dumpapp crash ">
	//   54  101:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   55  104:pop             
		stringbuilder.append("exit");
	//   56  105:aload_2         
	//   57  106:ldc1            #211 <String "exit">
	//   58  108:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   59  111:pop             
		printstream.println(stringbuilder.toString());
	//   60  112:aload_1         
	//   61  113:aload_2         
	//   62  114:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   63  117:invokevirtual   #204 <Method void PrintStream.println(String)>
		printstream.println();
	//   64  120:aload_1         
	//   65  121:invokevirtual   #213 <Method void PrintStream.println()>
		printstream.println("dumpapp crash throw: Throw an uncaught exception (simulates a program crash)");
	//   66  124:aload_1         
	//   67  125:ldc1            #215 <String "dumpapp crash throw: Throw an uncaught exception (simulates a program crash)">
	//   68  127:invokevirtual   #204 <Method void PrintStream.println(String)>
		printstream.println("    <Throwable>: Throwable class to use (default: java.lang.Error)");
	//   69  130:aload_1         
	//   70  131:ldc1            #217 <String "    <Throwable>: Throwable class to use (default: java.lang.Error)">
	//   71  133:invokevirtual   #204 <Method void PrintStream.println(String)>
		printstream.println();
	//   72  136:aload_1         
	//   73  137:invokevirtual   #213 <Method void PrintStream.println()>
		printstream.println("dumpapp crash kill: Send a signal to this process (simulates the low memory killer)");
	//   74  140:aload_1         
	//   75  141:ldc1            #219 <String "dumpapp crash kill: Send a signal to this process (simulates the low memory killer)">
	//   76  143:invokevirtual   #204 <Method void PrintStream.println(String)>
		printstream.println("    <SIGNAL>: Either signal name or number to send (default: 9)");
	//   77  146:aload_1         
	//   78  147:ldc1            #221 <String "    <SIGNAL>: Either signal name or number to send (default: 9)">
	//   79  149:invokevirtual   #204 <Method void PrintStream.println(String)>
		printstream.println("              See `adb shell kill -l` for more information");
	//   80  152:aload_1         
	//   81  153:ldc1            #223 <String "              See `adb shell kill -l` for more information">
	//   82  155:invokevirtual   #204 <Method void PrintStream.println(String)>
		printstream.println();
	//   83  158:aload_1         
	//   84  159:invokevirtual   #213 <Method void PrintStream.println()>
		printstream.println("dumpapp crash exit: Invoke System.exit (simulates an abnormal Android exit strategy)");
	//   85  162:aload_1         
	//   86  163:ldc1            #225 <String "dumpapp crash exit: Invoke System.exit (simulates an abnormal Android exit strategy)">
	//   87  165:invokevirtual   #204 <Method void PrintStream.println(String)>
		printstream.println("    <code>: Exit code (default: 0)");
	//   88  168:aload_1         
	//   89  169:ldc1            #227 <String "    <code>: Exit code (default: 0)">
	//   90  171:invokevirtual   #204 <Method void PrintStream.println(String)>
	//   91  174:return          
	}

	private static transient Constructor tryGetDeclaredConstructor(Class class1, Class aclass[])
	{
		try
		{
			class1 = ((Class) (class1.getDeclaredConstructor(aclass)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #167 <Method Constructor Class.getDeclaredConstructor(Class[])>
	//    3    5:astore_0        
		}
	//*   4    6:aload_0         
	//*   5    7:areturn         
	//*   6    8:aconst_null     
	//*   7    9:areturn         
		// Misplaced declaration of an exception variable
		catch(Class class1)
		{
			return null;
		}
		return ((Constructor) (class1));
	//*   8   10:astore_0        
	//*   9   11:goto            8
	}

	public void dump(DumperContext dumpercontext)
		throws DumpException
	{
		Iterator iterator = dumpercontext.getArgsAsList().iterator();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #236 <Method List DumperContext.getArgsAsList()>
	//    2    4:invokeinterface #242 <Method Iterator List.iterator()>
	//    3    9:astore_3        
		String s = ArgsHelper.nextOptionalArg(iterator, ((String) (null)));
	//    4   10:aload_3         
	//    5   11:aconst_null     
	//    6   12:invokestatic    #39  <Method String ArgsHelper.nextOptionalArg(Iterator, String)>
	//    7   15:astore_2        
		if("throw".equals(((Object) (s))))
	//*   8   16:ldc1            #206 <String "throw">
	//*   9   18:aload_2         
	//*  10   19:invokevirtual   #246 <Method boolean String.equals(Object)>
	//*  11   22:ifeq            31
		{
			doUncaughtException(iterator);
	//   12   25:aload_0         
	//   13   26:aload_3         
	//   14   27:invokespecial   #248 <Method void doUncaughtException(Iterator)>
			return;
	//   15   30:return          
		}
		if("kill".equals(((Object) (s))))
	//*  16   31:ldc1            #210 <String "kill">
	//*  17   33:aload_2         
	//*  18   34:invokevirtual   #246 <Method boolean String.equals(Object)>
	//*  19   37:ifeq            47
		{
			doKill(dumpercontext, iterator);
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:aload_3         
	//   23   43:invokespecial   #250 <Method void doKill(DumperContext, Iterator)>
			return;
	//   24   46:return          
		}
		if("exit".equals(((Object) (s))))
	//*  25   47:ldc1            #211 <String "exit">
	//*  26   49:aload_2         
	//*  27   50:invokevirtual   #246 <Method boolean String.equals(Object)>
	//*  28   53:ifeq            62
		{
			doSystemExit(iterator);
	//   29   56:aload_0         
	//   30   57:aload_3         
	//   31   58:invokespecial   #252 <Method void doSystemExit(Iterator)>
			return;
	//   32   61:return          
		}
		doUsage(dumpercontext.getStdout());
	//   33   62:aload_0         
	//   34   63:aload_1         
	//   35   64:invokevirtual   #95  <Method PrintStream DumperContext.getStdout()>
	//   36   67:invokespecial   #254 <Method void doUsage(PrintStream)>
		if(s == null)
	//*  37   70:aload_2         
	//*  38   71:ifnonnull       75
		{
			return;
	//   39   74:return          
		} else
		{
			dumpercontext = ((DumperContext) (new StringBuilder()));
	//   40   75:new             #48  <Class StringBuilder>
	//   41   78:dup             
	//   42   79:invokespecial   #49  <Method void StringBuilder()>
	//   43   82:astore_1        
			((StringBuilder) (dumpercontext)).append("Unsupported command: ");
	//   44   83:aload_1         
	//   45   84:ldc2            #256 <String "Unsupported command: ">
	//   46   87:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   47   90:pop             
			((StringBuilder) (dumpercontext)).append(s);
	//   48   91:aload_1         
	//   49   92:aload_2         
	//   50   93:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   51   96:pop             
			throw new DumpUsageException(((StringBuilder) (dumpercontext)).toString());
	//   52   97:new             #258 <Class DumpUsageException>
	//   53  100:dup             
	//   54  101:aload_1         
	//   55  102:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   56  105:invokespecial   #259 <Method void DumpUsageException(String)>
	//   57  108:athrow          
		}
	}

	public String getName()
	{
		return "crash";
	//    0    0:ldc1            #13  <String "crash">
	//    1    2:areturn         
	}

	private static final String NAME = "crash";
	private static final String OPTION_EXIT_DEFAULT = "0";
	private static final String OPTION_KILL_DEFAULT = "9";
	private static final String OPTION_THROW_DEFAULT = "java.lang.Error";
}
