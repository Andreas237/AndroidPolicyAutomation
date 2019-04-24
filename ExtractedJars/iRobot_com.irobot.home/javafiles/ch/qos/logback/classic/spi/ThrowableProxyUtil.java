// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.spi;

import ch.qos.logback.core.CoreConstants;

// Referenced classes of package ch.qos.logback.classic.spi:
//			ThrowableProxy, StackTraceElementProxy, IThrowableProxy, ClassPackagingData

public class ThrowableProxyUtil
{

	public ThrowableProxyUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public static String asString(IThrowableProxy ithrowableproxy)
	{
		StringBuilder stringbuilder = new StringBuilder(2048);
	//    0    0:new             #19  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:sipush          2048
	//    3    7:invokespecial   #22  <Method void StringBuilder(int)>
	//    4   10:astore_1        
		recursiveAppend(stringbuilder, ((String) (null)), 1, ithrowableproxy);
	//    5   11:aload_1         
	//    6   12:aconst_null     
	//    7   13:iconst_1        
	//    8   14:aload_0         
	//    9   15:invokestatic    #26  <Method void recursiveAppend(StringBuilder, String, int, IThrowableProxy)>
		return stringbuilder.toString();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #30  <Method String StringBuilder.toString()>
	//   12   22:areturn         
	}

	public static void build(ThrowableProxy throwableproxy, Throwable throwable, ThrowableProxy throwableproxy1)
	{
		throwable = ((Throwable) (throwable.getStackTrace()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #38  <Method StackTraceElement[] Throwable.getStackTrace()>
	//    2    4:astore_1        
		int i;
		if(throwableproxy1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          21
			i = findNumberOfCommonFrames(((StackTraceElement []) (throwable)), throwableproxy1.getStackTraceElementProxyArray());
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #44  <Method StackTraceElementProxy[] ThrowableProxy.getStackTraceElementProxyArray()>
	//    8   14:invokestatic    #48  <Method int findNumberOfCommonFrames(StackTraceElement[], StackTraceElementProxy[])>
	//    9   17:istore_3        
		else
	//*  10   18:goto            23
			i = -1;
	//   11   21:iconst_m1       
	//   12   22:istore_3        
		throwableproxy.commonFrames = i;
	//   13   23:aload_0         
	//   14   24:iload_3         
	//   15   25:putfield        #51  <Field int ThrowableProxy.commonFrames>
		throwableproxy.stackTraceElementProxyArray = steArrayToStepArray(((StackTraceElement []) (throwable)));
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:invokestatic    #55  <Method StackTraceElementProxy[] steArrayToStepArray(StackTraceElement[])>
	//   19   33:putfield        #59  <Field StackTraceElementProxy[] ThrowableProxy.stackTraceElementProxyArray>
	//   20   36:return          
	}

	static int findNumberOfCommonFrames(StackTraceElement astacktraceelement[], StackTraceElementProxy astacktraceelementproxy[])
	{
		int l = 0;
	//    0    0:iconst_0        
	//    1    1:istore          5
		int i = 0;
	//    2    3:iconst_0        
	//    3    4:istore_2        
		if(astacktraceelementproxy != null)
	//*   4    5:aload_1         
	//*   5    6:ifnull          77
		{
			if(astacktraceelement == null)
	//*   6    9:aload_0         
	//*   7   10:ifnonnull       15
				return 0;
	//    8   13:iconst_0        
	//    9   14:ireturn         
			int k = astacktraceelement.length - 1;
	//   10   15:aload_0         
	//   11   16:arraylength     
	//   12   17:iconst_1        
	//   13   18:isub            
	//   14   19:istore          4
			int j = astacktraceelementproxy.length - 1;
	//   15   21:aload_1         
	//   16   22:arraylength     
	//   17   23:iconst_1        
	//   18   24:isub            
	//   19   25:istore_3        
			do
			{
				l = i;
	//   20   26:iload_2         
	//   21   27:istore          5
				if(k < 0)
					break;
	//   22   29:iload           4
	//   23   31:iflt            77
				l = i;
	//   24   34:iload_2         
	//   25   35:istore          5
				if(j < 0)
					break;
	//   26   37:iload_3         
	//   27   38:iflt            77
				l = i;
	//   28   41:iload_2         
	//   29   42:istore          5
				if(!astacktraceelement[k].equals(((Object) (astacktraceelementproxy[j].ste))))
					break;
	//   30   44:aload_0         
	//   31   45:iload           4
	//   32   47:aaload          
	//   33   48:aload_1         
	//   34   49:iload_3         
	//   35   50:aaload          
	//   36   51:getfield        #65  <Field StackTraceElement StackTraceElementProxy.ste>
	//   37   54:invokevirtual   #71  <Method boolean StackTraceElement.equals(Object)>
	//   38   57:ifeq            77
				i++;
	//   39   60:iload_2         
	//   40   61:iconst_1        
	//   41   62:iadd            
	//   42   63:istore_2        
				k--;
	//   43   64:iload           4
	//   44   66:iconst_1        
	//   45   67:isub            
	//   46   68:istore          4
				j--;
	//   47   70:iload_3         
	//   48   71:iconst_1        
	//   49   72:isub            
	//   50   73:istore_3        
			} while(true);
	//   51   74:goto            26
		}
		return l;
	//   52   77:iload           5
	//   53   79:ireturn         
	}

	public static void indent(StringBuilder stringbuilder, int i)
	{
		for(int j = 0; j < i; j++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:iload_1         
	//*   4    4:icmpge          21
			stringbuilder.append('\t');
	//    5    7:aload_0         
	//    6    8:bipush          9
	//    7   10:invokevirtual   #77  <Method StringBuilder StringBuilder.append(char)>
	//    8   13:pop             

	//    9   14:iload_2         
	//   10   15:iconst_1        
	//   11   16:iadd            
	//   12   17:istore_2        
	//*  13   18:goto            2
	//   14   21:return          
	}

	private static void recursiveAppend(StringBuilder stringbuilder, String s, int i, IThrowableProxy ithrowableproxy)
	{
		if(ithrowableproxy == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		subjoinFirstLine(stringbuilder, s, i, ithrowableproxy);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:aload_3         
	//    7    9:invokestatic    #80  <Method void subjoinFirstLine(StringBuilder, String, int, IThrowableProxy)>
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//    8   12:aload_0         
	//    9   13:getstatic       #86  <Field String CoreConstants.LINE_SEPARATOR>
	//   10   16:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   11   19:pop             
		subjoinSTEPArray(stringbuilder, i, ithrowableproxy);
	//   12   20:aload_0         
	//   13   21:iload_2         
	//   14   22:aload_3         
	//   15   23:invokestatic    #93  <Method void subjoinSTEPArray(StringBuilder, int, IThrowableProxy)>
		s = ((String) (ithrowableproxy.getSuppressed()));
	//   16   26:aload_3         
	//   17   27:invokeinterface #99  <Method IThrowableProxy[] IThrowableProxy.getSuppressed()>
	//   18   32:astore_1        
		if(s != null)
	//*  19   33:aload_1         
	//*  20   34:ifnull          73
		{
			int k = s.length;
	//   21   37:aload_1         
	//   22   38:arraylength     
	//   23   39:istore          5
			for(int j = 0; j < k; j++)
	//*  24   41:iconst_0        
	//*  25   42:istore          4
	//*  26   44:iload           4
	//*  27   46:iload           5
	//*  28   48:icmpge          73
				recursiveAppend(stringbuilder, "Suppressed: ", i + 1, ((IThrowableProxy) (s[j])));
	//   29   51:aload_0         
	//   30   52:ldc1            #101 <String "Suppressed: ">
	//   31   54:iload_2         
	//   32   55:iconst_1        
	//   33   56:iadd            
	//   34   57:aload_1         
	//   35   58:iload           4
	//   36   60:aaload          
	//   37   61:invokestatic    #26  <Method void recursiveAppend(StringBuilder, String, int, IThrowableProxy)>

	//   38   64:iload           4
	//   39   66:iconst_1        
	//   40   67:iadd            
	//   41   68:istore          4
		}
	//*  42   70:goto            44
		recursiveAppend(stringbuilder, "Caused by: ", i, ithrowableproxy.getCause());
	//   43   73:aload_0         
	//   44   74:ldc1            #103 <String "Caused by: ">
	//   45   76:iload_2         
	//   46   77:aload_3         
	//   47   78:invokeinterface #107 <Method IThrowableProxy IThrowableProxy.getCause()>
	//   48   83:invokestatic    #26  <Method void recursiveAppend(StringBuilder, String, int, IThrowableProxy)>
	//   49   86:return          
	}

	static StackTraceElementProxy[] steArrayToStepArray(StackTraceElement astacktraceelement[])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(astacktraceelement == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       11
			return new StackTraceElementProxy[0];
	//    4    6:iconst_0        
	//    5    7:anewarray       StackTraceElementProxy[]
	//    6   10:areturn         
		StackTraceElementProxy astacktraceelementproxy[];
		for(astacktraceelementproxy = new StackTraceElementProxy[astacktraceelement.length]; i < astacktraceelementproxy.length; i++)
	//*   7   11:aload_0         
	//*   8   12:arraylength     
	//*   9   13:anewarray       StackTraceElementProxy[]
	//*  10   16:astore_2        
	//*  11   17:iload_1         
	//*  12   18:aload_2         
	//*  13   19:arraylength     
	//*  14   20:icmpge          43
			astacktraceelementproxy[i] = new StackTraceElementProxy(astacktraceelement[i]);
	//   15   23:aload_2         
	//   16   24:iload_1         
	//   17   25:new             #61  <Class StackTraceElementProxy>
	//   18   28:dup             
	//   19   29:aload_0         
	//   20   30:iload_1         
	//   21   31:aaload          
	//   22   32:invokespecial   #110 <Method void StackTraceElementProxy(StackTraceElement)>
	//   23   35:aastore         

	//   24   36:iload_1         
	//   25   37:iconst_1        
	//   26   38:iadd            
	//   27   39:istore_1        
	//*  28   40:goto            17
		return astacktraceelementproxy;
	//   29   43:aload_2         
	//   30   44:areturn         
	}

	private static void subjoinExceptionMessage(StringBuilder stringbuilder, IThrowableProxy ithrowableproxy)
	{
		stringbuilder.append(ithrowableproxy.getClassName());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #115 <Method String IThrowableProxy.getClassName()>
	//    3    7:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//    4   10:pop             
		stringbuilder.append(": ");
	//    5   11:aload_0         
	//    6   12:ldc1            #117 <String ": ">
	//    7   14:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//    8   17:pop             
		stringbuilder.append(ithrowableproxy.getMessage());
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:invokeinterface #120 <Method String IThrowableProxy.getMessage()>
	//   12   25:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   13   28:pop             
	//   14   29:return          
	}

	public static void subjoinFirstLine(StringBuilder stringbuilder, IThrowableProxy ithrowableproxy)
	{
		if(ithrowableproxy.getCommonFrames() > 0)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #124 <Method int IThrowableProxy.getCommonFrames()>
	//*   2    6:ifle            16
			stringbuilder.append("Caused by: ");
	//    3    9:aload_0         
	//    4   10:ldc1            #103 <String "Caused by: ">
	//    5   12:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//    6   15:pop             
		subjoinExceptionMessage(stringbuilder, ithrowableproxy);
	//    7   16:aload_0         
	//    8   17:aload_1         
	//    9   18:invokestatic    #126 <Method void subjoinExceptionMessage(StringBuilder, IThrowableProxy)>
	//   10   21:return          
	}

	private static void subjoinFirstLine(StringBuilder stringbuilder, String s, int i, IThrowableProxy ithrowableproxy)
	{
		indent(stringbuilder, i - 1);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iconst_1        
	//    3    3:isub            
	//    4    4:invokestatic    #128 <Method void indent(StringBuilder, int)>
		if(s != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          17
			stringbuilder.append(s);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   10   16:pop             
		subjoinExceptionMessage(stringbuilder, ithrowableproxy);
	//   11   17:aload_0         
	//   12   18:aload_3         
	//   13   19:invokestatic    #126 <Method void subjoinExceptionMessage(StringBuilder, IThrowableProxy)>
	//   14   22:return          
	}

	public static void subjoinFirstLineRootCauseFirst(StringBuilder stringbuilder, IThrowableProxy ithrowableproxy)
	{
		if(ithrowableproxy.getCause() != null)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #107 <Method IThrowableProxy IThrowableProxy.getCause()>
	//*   2    6:ifnull          16
			stringbuilder.append("Wrapped by: ");
	//    3    9:aload_0         
	//    4   10:ldc1            #131 <String "Wrapped by: ">
	//    5   12:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//    6   15:pop             
		subjoinExceptionMessage(stringbuilder, ithrowableproxy);
	//    7   16:aload_0         
	//    8   17:aload_1         
	//    9   18:invokestatic    #126 <Method void subjoinExceptionMessage(StringBuilder, IThrowableProxy)>
	//   10   21:return          
	}

	public static void subjoinPackagingData(StringBuilder stringbuilder, StackTraceElementProxy stacktraceelementproxy)
	{
		if(stacktraceelementproxy != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          70
		{
			ClassPackagingData classpackagingdata = stacktraceelementproxy.getClassPackagingData();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #137 <Method ClassPackagingData StackTraceElementProxy.getClassPackagingData()>
	//    4    8:astore_2        
			if(classpackagingdata != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          70
			{
				if(!classpackagingdata.isExact())
	//*   7   13:aload_2         
	//*   8   14:invokevirtual   #143 <Method boolean ClassPackagingData.isExact()>
	//*   9   17:ifne            32
					stacktraceelementproxy = " ~[";
	//   10   20:ldc1            #145 <String " ~[">
	//   11   22:astore_1        
				else
	//*  12   23:aload_0         
	//*  13   24:aload_1         
	//*  14   25:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//*  15   28:pop             
	//*  16   29:goto            38
					stacktraceelementproxy = " [";
	//   17   32:ldc1            #147 <String " [">
	//   18   34:astore_1        
				stringbuilder.append(((String) (stacktraceelementproxy)));
	//*  19   35:goto            23
				stringbuilder.append(classpackagingdata.getCodeLocation());
	//   20   38:aload_0         
	//   21   39:aload_2         
	//   22   40:invokevirtual   #150 <Method String ClassPackagingData.getCodeLocation()>
	//   23   43:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   24   46:pop             
				stringbuilder.append(':');
	//   25   47:aload_0         
	//   26   48:bipush          58
	//   27   50:invokevirtual   #77  <Method StringBuilder StringBuilder.append(char)>
	//   28   53:pop             
				stringbuilder.append(classpackagingdata.getVersion());
	//   29   54:aload_0         
	//   30   55:aload_2         
	//   31   56:invokevirtual   #153 <Method String ClassPackagingData.getVersion()>
	//   32   59:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   33   62:pop             
				stringbuilder.append(']');
	//   34   63:aload_0         
	//   35   64:bipush          93
	//   36   66:invokevirtual   #77  <Method StringBuilder StringBuilder.append(char)>
	//   37   69:pop             
			}
		}
	//   38   70:return          
	}

	public static void subjoinSTEP(StringBuilder stringbuilder, StackTraceElementProxy stacktraceelementproxy)
	{
		stringbuilder.append(stacktraceelementproxy.toString());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #155 <Method String StackTraceElementProxy.toString()>
	//    3    5:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//    4    8:pop             
		subjoinPackagingData(stringbuilder, stacktraceelementproxy);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokestatic    #157 <Method void subjoinPackagingData(StringBuilder, StackTraceElementProxy)>
	//    8   14:return          
	}

	public static void subjoinSTEPArray(StringBuilder stringbuilder, int i, IThrowableProxy ithrowableproxy)
	{
		StackTraceElementProxy astacktraceelementproxy[] = ithrowableproxy.getStackTraceElementProxyArray();
	//    0    0:aload_2         
	//    1    1:invokeinterface #158 <Method StackTraceElementProxy[] IThrowableProxy.getStackTraceElementProxyArray()>
	//    2    6:astore          5
		int k = ithrowableproxy.getCommonFrames();
	//    3    8:aload_2         
	//    4    9:invokeinterface #124 <Method int IThrowableProxy.getCommonFrames()>
	//    5   14:istore          4
		for(int j = 0; j < astacktraceelementproxy.length - k; j++)
	//*   6   16:iconst_0        
	//*   7   17:istore_3        
	//*   8   18:iload_3         
	//*   9   19:aload           5
	//*  10   21:arraylength     
	//*  11   22:iload           4
	//*  12   24:isub            
	//*  13   25:icmpge          58
		{
			ithrowableproxy = ((IThrowableProxy) (astacktraceelementproxy[j]));
	//   14   28:aload           5
	//   15   30:iload_3         
	//   16   31:aaload          
	//   17   32:astore_2        
			indent(stringbuilder, i);
	//   18   33:aload_0         
	//   19   34:iload_1         
	//   20   35:invokestatic    #128 <Method void indent(StringBuilder, int)>
			subjoinSTEP(stringbuilder, ((StackTraceElementProxy) (ithrowableproxy)));
	//   21   38:aload_0         
	//   22   39:aload_2         
	//   23   40:invokestatic    #160 <Method void subjoinSTEP(StringBuilder, StackTraceElementProxy)>
			stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   24   43:aload_0         
	//   25   44:getstatic       #86  <Field String CoreConstants.LINE_SEPARATOR>
	//   26   47:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   27   50:pop             
		}

	//   28   51:iload_3         
	//   29   52:iconst_1        
	//   30   53:iadd            
	//   31   54:istore_3        
	//*  32   55:goto            18
		if(k > 0)
	//*  33   58:iload           4
	//*  34   60:ifle            97
		{
			indent(stringbuilder, i);
	//   35   63:aload_0         
	//   36   64:iload_1         
	//   37   65:invokestatic    #128 <Method void indent(StringBuilder, int)>
			stringbuilder.append("... ");
	//   38   68:aload_0         
	//   39   69:ldc1            #162 <String "... ">
	//   40   71:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   41   74:pop             
			stringbuilder.append(k);
	//   42   75:aload_0         
	//   43   76:iload           4
	//   44   78:invokevirtual   #165 <Method StringBuilder StringBuilder.append(int)>
	//   45   81:pop             
			stringbuilder.append(" common frames omitted");
	//   46   82:aload_0         
	//   47   83:ldc1            #167 <String " common frames omitted">
	//   48   85:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   49   88:pop             
			stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   50   89:aload_0         
	//   51   90:getstatic       #86  <Field String CoreConstants.LINE_SEPARATOR>
	//   52   93:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   53   96:pop             
		}
	//   54   97:return          
	}

	public static void subjoinSTEPArray(StringBuilder stringbuilder, IThrowableProxy ithrowableproxy)
	{
		subjoinSTEPArray(stringbuilder, 1, ithrowableproxy);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_1         
	//    3    3:invokestatic    #93  <Method void subjoinSTEPArray(StringBuilder, int, IThrowableProxy)>
	//    4    6:return          
	}

	private static final int BUILDER_CAPACITY = 2048;
	public static final int REGULAR_EXCEPTION_INDENT = 1;
	public static final int SUPPRESSED_EXCEPTION_INDENT = 1;
}
