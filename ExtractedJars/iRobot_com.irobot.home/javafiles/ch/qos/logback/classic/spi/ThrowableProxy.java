// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.spi;

import ch.qos.logback.core.CoreConstants;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package ch.qos.logback.classic.spi:
//			IThrowableProxy, ThrowableProxyUtil, PackagingDataCalculator, StackTraceElementProxy

public class ThrowableProxy
	implements IThrowableProxy
{

	public ThrowableProxy(Throwable throwable1)
	{
		int i;
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void Object()>
		suppressed = NO_SUPPRESSED;
	//    2    4:aload_0         
	//    3    5:getstatic       #44  <Field ThrowableProxy[] NO_SUPPRESSED>
	//    4    8:putfield        #55  <Field ThrowableProxy[] suppressed>
		i = 0;
	//    5   11:iconst_0        
	//    6   12:istore_2        
		calculatedPackageData = false;
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:putfield        #57  <Field boolean calculatedPackageData>
		throwable = throwable1;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:putfield        #59  <Field Throwable throwable>
		className = ((Object) (throwable1)).getClass().getName();
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:invokevirtual   #63  <Method Class Object.getClass()>
	//   16   28:invokevirtual   #67  <Method String Class.getName()>
	//   17   31:putfield        #69  <Field String className>
		message = throwable1.getMessage();
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #72  <Method String Throwable.getMessage()>
	//   21   39:putfield        #74  <Field String message>
		stackTraceElementProxyArray = ThrowableProxyUtil.steArrayToStepArray(throwable1.getStackTrace());
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:invokevirtual   #78  <Method StackTraceElement[] Throwable.getStackTrace()>
	//   25   47:invokestatic    #84  <Method StackTraceElementProxy[] ThrowableProxyUtil.steArrayToStepArray(StackTraceElement[])>
	//   26   50:putfield        #86  <Field StackTraceElementProxy[] stackTraceElementProxyArray>
		Throwable throwable2 = throwable1.getCause();
	//   27   53:aload_1         
	//   28   54:invokevirtual   #90  <Method Throwable Throwable.getCause()>
	//   29   57:astore_3        
		if(throwable2 != null)
	//*  30   58:aload_3         
	//*  31   59:ifnull          92
		{
			cause = new ThrowableProxy(throwable2);
	//   32   62:aload_0         
	//   33   63:new             #2   <Class ThrowableProxy>
	//   34   66:dup             
	//   35   67:aload_3         
	//   36   68:invokespecial   #92  <Method void ThrowableProxy(Throwable)>
	//   37   71:putfield        #94  <Field ThrowableProxy cause>
			cause.commonFrames = ThrowableProxyUtil.findNumberOfCommonFrames(throwable2.getStackTrace(), stackTraceElementProxyArray);
	//   38   74:aload_0         
	//   39   75:getfield        #94  <Field ThrowableProxy cause>
	//   40   78:aload_3         
	//   41   79:invokevirtual   #78  <Method StackTraceElement[] Throwable.getStackTrace()>
	//   42   82:aload_0         
	//   43   83:getfield        #86  <Field StackTraceElementProxy[] stackTraceElementProxyArray>
	//   44   86:invokestatic    #98  <Method int ThrowableProxyUtil.findNumberOfCommonFrames(StackTraceElement[], StackTraceElementProxy[])>
	//   45   89:putfield        #100 <Field int commonFrames>
		}
		if(GET_SUPPRESSED_METHOD == null)
			break MISSING_BLOCK_LABEL_187;
	//   46   92:getstatic       #42  <Field Method GET_SUPPRESSED_METHOD>
	//   47   95:ifnull          187
		throwable1 = ((Throwable) (GET_SUPPRESSED_METHOD.invoke(((Object) (throwable1)), new Object[0])));
	//   48   98:getstatic       #42  <Field Method GET_SUPPRESSED_METHOD>
	//   49  101:aload_1         
	//   50  102:iconst_0        
	//   51  103:anewarray       Object[]
	//   52  106:invokevirtual   #106 <Method Object Method.invoke(Object, Object[])>
	//   53  109:astore_1        
		if(!(throwable1 instanceof Throwable[]))
			break MISSING_BLOCK_LABEL_187;
	//   54  110:aload_1         
	//   55  111:instanceof      #108 <Class Throwable[]>
	//   56  114:ifeq            187
		throwable1 = ((Throwable) ((Throwable[])throwable1));
	//   57  117:aload_1         
	//   58  118:checkcast       #108 <Class Throwable[]>
	//   59  121:astore_1        
		if(throwable1.length <= 0)
			break MISSING_BLOCK_LABEL_187;
	//   60  122:aload_1         
	//   61  123:arraylength     
	//   62  124:ifle            187
		suppressed = new ThrowableProxy[throwable1.length];
	//   63  127:aload_0         
	//   64  128:aload_1         
	//   65  129:arraylength     
	//   66  130:anewarray       ThrowableProxy[]
	//   67  133:putfield        #55  <Field ThrowableProxy[] suppressed>
_L1:
		if(i >= throwable1.length)
			break MISSING_BLOCK_LABEL_187;
	//   68  136:iload_2         
	//   69  137:aload_1         
	//   70  138:arraylength     
	//   71  139:icmpge          187
		suppressed[i] = new ThrowableProxy(((Throwable) (throwable1[i])));
	//   72  142:aload_0         
	//   73  143:getfield        #55  <Field ThrowableProxy[] suppressed>
	//   74  146:iload_2         
	//   75  147:new             #2   <Class ThrowableProxy>
	//   76  150:dup             
	//   77  151:aload_1         
	//   78  152:iload_2         
	//   79  153:aaload          
	//   80  154:invokespecial   #92  <Method void ThrowableProxy(Throwable)>
	//   81  157:aastore         
		suppressed[i].commonFrames = ThrowableProxyUtil.findNumberOfCommonFrames(((Throwable) (throwable1[i])).getStackTrace(), stackTraceElementProxyArray);
	//   82  158:aload_0         
	//   83  159:getfield        #55  <Field ThrowableProxy[] suppressed>
	//   84  162:iload_2         
	//   85  163:aaload          
	//   86  164:aload_1         
	//   87  165:iload_2         
	//   88  166:aaload          
	//   89  167:invokevirtual   #78  <Method StackTraceElement[] Throwable.getStackTrace()>
	//   90  170:aload_0         
	//   91  171:getfield        #86  <Field StackTraceElementProxy[] stackTraceElementProxyArray>
	//   92  174:invokestatic    #98  <Method int ThrowableProxyUtil.findNumberOfCommonFrames(StackTraceElement[], StackTraceElementProxy[])>
	//   93  177:putfield        #100 <Field int commonFrames>
		i++;
	//   94  180:iload_2         
	//   95  181:iconst_1        
	//   96  182:iadd            
	//   97  183:istore_2        
		  goto _L1
	//*  98  184:goto            136
		return;
	//   99  187:return          
		throwable1;
	//  100  188:astore_1        
	//  101  189:return          
	}

	public void calculatePackagingData()
	{
		if(calculatedPackageData)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field boolean calculatedPackageData>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		PackagingDataCalculator packagingdatacalculator = getPackagingDataCalculator();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #113 <Method PackagingDataCalculator getPackagingDataCalculator()>
	//    6   12:astore_1        
		if(packagingdatacalculator != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          27
		{
			calculatedPackageData = true;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #57  <Field boolean calculatedPackageData>
			packagingdatacalculator.calculate(((IThrowableProxy) (this)));
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:invokevirtual   #119 <Method void PackagingDataCalculator.calculate(IThrowableProxy)>
		}
	//   15   27:return          
	}

	public void fullDump()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #122 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #123 <Method void StringBuilder()>
	//    3    7:astore_3        
		StackTraceElementProxy astacktraceelementproxy[] = stackTraceElementProxyArray;
	//    4    8:aload_0         
	//    5    9:getfield        #86  <Field StackTraceElementProxy[] stackTraceElementProxyArray>
	//    6   12:astore          4
		int j = astacktraceelementproxy.length;
	//    7   14:aload           4
	//    8   16:arraylength     
	//    9   17:istore_2        
		for(int i = 0; i < j; i++)
	//*  10   18:iconst_0        
	//*  11   19:istore_1        
	//*  12   20:iload_1         
	//*  13   21:iload_2         
	//*  14   22:icmpge          73
		{
			StackTraceElementProxy stacktraceelementproxy = astacktraceelementproxy[i];
	//   15   25:aload           4
	//   16   27:iload_1         
	//   17   28:aaload          
	//   18   29:astore          5
			String s = stacktraceelementproxy.toString();
	//   19   31:aload           5
	//   20   33:invokevirtual   #128 <Method String StackTraceElementProxy.toString()>
	//   21   36:astore          6
			stringbuilder.append('\t');
	//   22   38:aload_3         
	//   23   39:bipush          9
	//   24   41:invokevirtual   #132 <Method StringBuilder StringBuilder.append(char)>
	//   25   44:pop             
			stringbuilder.append(s);
	//   26   45:aload_3         
	//   27   46:aload           6
	//   28   48:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   29   51:pop             
			ThrowableProxyUtil.subjoinPackagingData(stringbuilder, stacktraceelementproxy);
	//   30   52:aload_3         
	//   31   53:aload           5
	//   32   55:invokestatic    #139 <Method void ThrowableProxyUtil.subjoinPackagingData(StringBuilder, StackTraceElementProxy)>
			stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   33   58:aload_3         
	//   34   59:getstatic       #144 <Field String CoreConstants.LINE_SEPARATOR>
	//   35   62:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   36   65:pop             
		}

	//   37   66:iload_1         
	//   38   67:iconst_1        
	//   39   68:iadd            
	//   40   69:istore_1        
	//*  41   70:goto            20
		System.out.println(stringbuilder.toString());
	//   42   73:getstatic       #150 <Field PrintStream System.out>
	//   43   76:aload_3         
	//   44   77:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   45   80:invokevirtual   #157 <Method void PrintStream.println(String)>
	//   46   83:return          
	}

	public IThrowableProxy getCause()
	{
		return ((IThrowableProxy) (cause));
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field ThrowableProxy cause>
	//    2    4:areturn         
	}

	public String getClassName()
	{
		return className;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field String className>
	//    2    4:areturn         
	}

	public int getCommonFrames()
	{
		return commonFrames;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field int commonFrames>
	//    2    4:ireturn         
	}

	public String getMessage()
	{
		return message;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field String message>
	//    2    4:areturn         
	}

	public PackagingDataCalculator getPackagingDataCalculator()
	{
		if(throwable != null && packagingDataCalculator == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field Throwable throwable>
	//*   2    4:ifnull          25
	//*   3    7:aload_0         
	//*   4    8:getfield        #163 <Field PackagingDataCalculator packagingDataCalculator>
	//*   5   11:ifnonnull       25
			packagingDataCalculator = new PackagingDataCalculator();
	//    6   14:aload_0         
	//    7   15:new             #115 <Class PackagingDataCalculator>
	//    8   18:dup             
	//    9   19:invokespecial   #164 <Method void PackagingDataCalculator()>
	//   10   22:putfield        #163 <Field PackagingDataCalculator packagingDataCalculator>
		return packagingDataCalculator;
	//   11   25:aload_0         
	//   12   26:getfield        #163 <Field PackagingDataCalculator packagingDataCalculator>
	//   13   29:areturn         
	}

	public StackTraceElementProxy[] getStackTraceElementProxyArray()
	{
		return stackTraceElementProxyArray;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field StackTraceElementProxy[] stackTraceElementProxyArray>
	//    2    4:areturn         
	}

	public IThrowableProxy[] getSuppressed()
	{
		return ((IThrowableProxy []) (suppressed));
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field ThrowableProxy[] suppressed>
	//    2    4:areturn         
	}

	public Throwable getThrowable()
	{
		return throwable;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Throwable throwable>
	//    2    4:areturn         
	}

	private static final Method GET_SUPPRESSED_METHOD;
	private static final ThrowableProxy NO_SUPPRESSED[] = new ThrowableProxy[0];
	private boolean calculatedPackageData;
	private ThrowableProxy cause;
	private String className;
	int commonFrames;
	private String message;
	private transient PackagingDataCalculator packagingDataCalculator;
	StackTraceElementProxy stackTraceElementProxyArray[];
	private ThrowableProxy suppressed[];
	private Throwable throwable;

	static 
	{
		NoSuchMethodException nosuchmethodexception;
		Method method;
		try
		{
			method = ((Class) (java/lang/Throwable)).getMethod("getSuppressed", new Class[0]);
	//    0    0:ldc1            #32  <Class Throwable>
	//    1    2:ldc1            #34  <String "getSuppressed">
	//    2    4:iconst_0        
	//    3    5:anewarray       Class[]
	//    4    8:invokevirtual   #40  <Method Method Class.getMethod(String, Class[])>
	//    5   11:astore_0        
		}
	//*   6   12:goto            17
	//*   7   15:aconst_null     
	//*   8   16:astore_0        
	//*   9   17:aload_0         
	//*  10   18:putstatic       #42  <Field Method GET_SUPPRESSED_METHOD>
	//*  11   21:iconst_0        
	//*  12   22:anewarray       ThrowableProxy[]
	//*  13   25:putstatic       #44  <Field ThrowableProxy[] NO_SUPPRESSED>
	//*  14   28:return          
		// Misplaced declaration of an exception variable
		catch(NoSuchMethodException nosuchmethodexception)
		{
			method = null;
		}
		GET_SUPPRESSED_METHOD = method;
	//*  15   29:astore_0        
	//*  16   30:goto            15
	}
}
