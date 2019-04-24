// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.*;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.status.ErrorStatus;
import java.util.*;

// Referenced classes of package ch.qos.logback.classic.pattern:
//			ThrowableHandlingConverter

public class ThrowableProxyConverter extends ThrowableHandlingConverter
{

	public ThrowableProxyConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void ThrowableHandlingConverter()>
		evaluatorList = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #18  <Field List evaluatorList>
		errorCount = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #20  <Field int errorCount>
	//    8   14:return          
	}

	private void addEvaluator(EventEvaluator eventevaluator)
	{
		if(evaluatorList == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field List evaluatorList>
	//*   2    4:ifnonnull       18
			evaluatorList = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #25  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #26  <Method void ArrayList()>
	//    7   15:putfield        #18  <Field List evaluatorList>
		evaluatorList.add(((Object) (eventevaluator)));
	//    8   18:aload_0         
	//    9   19:getfield        #18  <Field List evaluatorList>
	//   10   22:aload_1         
	//   11   23:invokeinterface #32  <Method boolean List.add(Object)>
	//   12   28:pop             
	//   13   29:return          
	}

	private void recursiveAppend(StringBuilder stringbuilder, String s, int i, IThrowableProxy ithrowableproxy)
	{
		if(ithrowableproxy == null)
	//*   0    0:aload           4
	//*   1    2:ifnonnull       6
			return;
	//    2    5:return          
		subjoinFirstLine(stringbuilder, s, i, ithrowableproxy);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:aload_2         
	//    6    9:iload_3         
	//    7   10:aload           4
	//    8   12:invokespecial   #39  <Method void subjoinFirstLine(StringBuilder, String, int, IThrowableProxy)>
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//    9   15:aload_1         
	//   10   16:getstatic       #45  <Field String CoreConstants.LINE_SEPARATOR>
	//   11   19:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   12   22:pop             
		subjoinSTEPArray(stringbuilder, i, ithrowableproxy);
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:iload_3         
	//   16   26:aload           4
	//   17   28:invokevirtual   #55  <Method void subjoinSTEPArray(StringBuilder, int, IThrowableProxy)>
		s = ((String) (ithrowableproxy.getSuppressed()));
	//   18   31:aload           4
	//   19   33:invokeinterface #61  <Method IThrowableProxy[] IThrowableProxy.getSuppressed()>
	//   20   38:astore_2        
		if(s != null)
	//*  21   39:aload_2         
	//*  22   40:ifnull          80
		{
			int k = s.length;
	//   23   43:aload_2         
	//   24   44:arraylength     
	//   25   45:istore          6
			for(int j = 0; j < k; j++)
	//*  26   47:iconst_0        
	//*  27   48:istore          5
	//*  28   50:iload           5
	//*  29   52:iload           6
	//*  30   54:icmpge          80
				recursiveAppend(stringbuilder, "Suppressed: ", i + 1, ((IThrowableProxy) (s[j])));
	//   31   57:aload_0         
	//   32   58:aload_1         
	//   33   59:ldc1            #63  <String "Suppressed: ">
	//   34   61:iload_3         
	//   35   62:iconst_1        
	//   36   63:iadd            
	//   37   64:aload_2         
	//   38   65:iload           5
	//   39   67:aaload          
	//   40   68:invokespecial   #65  <Method void recursiveAppend(StringBuilder, String, int, IThrowableProxy)>

	//   41   71:iload           5
	//   42   73:iconst_1        
	//   43   74:iadd            
	//   44   75:istore          5
		}
	//*  45   77:goto            50
		recursiveAppend(stringbuilder, "Caused by: ", i, ithrowableproxy.getCause());
	//   46   80:aload_0         
	//   47   81:aload_1         
	//   48   82:ldc1            #67  <String "Caused by: ">
	//   49   84:iload_3         
	//   50   85:aload           4
	//   51   87:invokeinterface #71  <Method IThrowableProxy IThrowableProxy.getCause()>
	//   52   92:invokespecial   #65  <Method void recursiveAppend(StringBuilder, String, int, IThrowableProxy)>
	//   53   95:return          
	}

	private void subjoinExceptionMessage(StringBuilder stringbuilder, IThrowableProxy ithrowableproxy)
	{
		stringbuilder.append(ithrowableproxy.getClassName());
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #77  <Method String IThrowableProxy.getClassName()>
	//    3    7:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//    4   10:pop             
		stringbuilder.append(": ");
	//    5   11:aload_1         
	//    6   12:ldc1            #79  <String ": ">
	//    7   14:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//    8   17:pop             
		stringbuilder.append(ithrowableproxy.getMessage());
	//    9   18:aload_1         
	//   10   19:aload_2         
	//   11   20:invokeinterface #82  <Method String IThrowableProxy.getMessage()>
	//   12   25:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   13   28:pop             
	//   14   29:return          
	}

	private void subjoinFirstLine(StringBuilder stringbuilder, String s, int i, IThrowableProxy ithrowableproxy)
	{
		ThrowableProxyUtil.indent(stringbuilder, i - 1);
	//    0    0:aload_1         
	//    1    1:iload_3         
	//    2    2:iconst_1        
	//    3    3:isub            
	//    4    4:invokestatic    #88  <Method void ThrowableProxyUtil.indent(StringBuilder, int)>
		if(s != null)
	//*   5    7:aload_2         
	//*   6    8:ifnull          17
			stringbuilder.append(s);
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   10   16:pop             
		subjoinExceptionMessage(stringbuilder, ithrowableproxy);
	//   11   17:aload_0         
	//   12   18:aload_1         
	//   13   19:aload           4
	//   14   21:invokespecial   #90  <Method void subjoinExceptionMessage(StringBuilder, IThrowableProxy)>
	//   15   24:return          
	}

	public String convert(ILoggingEvent iloggingevent)
	{
		int i;
		boolean flag;
		IThrowableProxy ithrowableproxy;
		ithrowableproxy = iloggingevent.getThrowableProxy();
	//    0    0:aload_1         
	//    1    1:invokeinterface #99  <Method IThrowableProxy ILoggingEvent.getThrowableProxy()>
	//    2    6:astore          5
		if(ithrowableproxy == null)
	//*   3    8:aload           5
	//*   4   10:ifnonnull       16
			return "";
	//    5   13:ldc1            #101 <String "">
	//    6   15:areturn         
		if(evaluatorList == null)
			break MISSING_BLOCK_LABEL_247;
	//    7   16:aload_0         
	//    8   17:getfield        #18  <Field List evaluatorList>
	//    9   20:ifnull          247
		flag = false;
	//   10   23:iconst_0        
	//   11   24:istore_3        
		i = 0;
	//   12   25:iconst_0        
	//   13   26:istore_2        
_L3:
		if(i >= evaluatorList.size()) goto _L2; else goto _L1
	//   14   27:iload_2         
	//   15   28:aload_0         
	//   16   29:getfield        #18  <Field List evaluatorList>
	//   17   32:invokeinterface #105 <Method int List.size()>
	//   18   37:icmpge          238
_L1:
		Object obj = ((Object) ((EventEvaluator)evaluatorList.get(i)));
	//   19   40:aload_0         
	//   20   41:getfield        #18  <Field List evaluatorList>
	//   21   44:iload_2         
	//   22   45:invokeinterface #109 <Method Object List.get(int)>
	//   23   50:checkcast       #111 <Class EventEvaluator>
	//   24   53:astore          6
		boolean flag1 = ((EventEvaluator) (obj)).evaluate(((Object) (iloggingevent)));
	//   25   55:aload           6
	//   26   57:aload_1         
	//   27   58:invokeinterface #114 <Method boolean EventEvaluator.evaluate(Object)>
	//   28   63:istore          4
		if(!flag1)
			continue; /* Loop/switch isn't completed */
	//   29   65:iload           4
	//   30   67:ifeq            231
		i = ((int) (flag));
	//   31   70:iload_3         
	//   32   71:istore_2        
		break MISSING_BLOCK_LABEL_240;
	//   33   72:goto            240
		EvaluationException evaluationexception;
		evaluationexception;
	//   34   75:astore          7
		errorCount = errorCount + 1;
	//   35   77:aload_0         
	//   36   78:aload_0         
	//   37   79:getfield        #20  <Field int errorCount>
	//   38   82:iconst_1        
	//   39   83:iadd            
	//   40   84:putfield        #20  <Field int errorCount>
		if(errorCount < 4)
	//*  41   87:aload_0         
	//*  42   88:getfield        #20  <Field int errorCount>
	//*  43   91:iconst_4        
	//*  44   92:icmpge          147
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   45   95:new             #47  <Class StringBuilder>
	//   46   98:dup             
	//   47   99:invokespecial   #115 <Method void StringBuilder()>
	//   48  102:astore          8
			stringbuilder.append("Exception thrown for evaluator named [");
	//   49  104:aload           8
	//   50  106:ldc1            #117 <String "Exception thrown for evaluator named [">
	//   51  108:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   52  111:pop             
			stringbuilder.append(((EventEvaluator) (obj)).getName());
	//   53  112:aload           8
	//   54  114:aload           6
	//   55  116:invokeinterface #120 <Method String EventEvaluator.getName()>
	//   56  121:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   57  124:pop             
			stringbuilder.append("]");
	//   58  125:aload           8
	//   59  127:ldc1            #122 <String "]">
	//   60  129:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   61  132:pop             
			addError(stringbuilder.toString(), ((Throwable) (evaluationexception)));
	//   62  133:aload_0         
	//   63  134:aload           8
	//   64  136:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   65  139:aload           7
	//   66  141:invokevirtual   #129 <Method void addError(String, Throwable)>
			continue; /* Loop/switch isn't completed */
	//   67  144:goto            231
		}
		if(errorCount == 4)
	//*  68  147:aload_0         
	//*  69  148:getfield        #20  <Field int errorCount>
	//*  70  151:iconst_4        
	//*  71  152:icmpne          231
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   72  155:new             #47  <Class StringBuilder>
	//   73  158:dup             
	//   74  159:invokespecial   #115 <Method void StringBuilder()>
	//   75  162:astore          8
			stringbuilder1.append("Exception thrown for evaluator named [");
	//   76  164:aload           8
	//   77  166:ldc1            #117 <String "Exception thrown for evaluator named [">
	//   78  168:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   79  171:pop             
			stringbuilder1.append(((EventEvaluator) (obj)).getName());
	//   80  172:aload           8
	//   81  174:aload           6
	//   82  176:invokeinterface #120 <Method String EventEvaluator.getName()>
	//   83  181:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   84  184:pop             
			stringbuilder1.append("].");
	//   85  185:aload           8
	//   86  187:ldc1            #131 <String "].">
	//   87  189:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   88  192:pop             
			obj = ((Object) (new ErrorStatus(stringbuilder1.toString(), ((Object) (this)), ((Throwable) (evaluationexception)))));
	//   89  193:new             #133 <Class ErrorStatus>
	//   90  196:dup             
	//   91  197:aload           8
	//   92  199:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   93  202:aload_0         
	//   94  203:aload           7
	//   95  205:invokespecial   #136 <Method void ErrorStatus(String, Object, Throwable)>
	//   96  208:astore          6
			((ErrorStatus) (obj)).add(((ch.qos.logback.core.status.Status) (new ErrorStatus("This was the last warning about this evaluator's errors.We don't want the StatusManager to get flooded.", ((Object) (this))))));
	//   97  210:aload           6
	//   98  212:new             #133 <Class ErrorStatus>
	//   99  215:dup             
	//  100  216:ldc1            #138 <String "This was the last warning about this evaluator's errors.We don't want the StatusManager to get flooded.">
	//  101  218:aload_0         
	//  102  219:invokespecial   #141 <Method void ErrorStatus(String, Object)>
	//  103  222:invokevirtual   #144 <Method void ErrorStatus.add(ch.qos.logback.core.status.Status)>
			addStatus(((ch.qos.logback.core.status.Status) (obj)));
	//  104  225:aload_0         
	//  105  226:aload           6
	//  106  228:invokevirtual   #147 <Method void addStatus(ch.qos.logback.core.status.Status)>
		}
		i++;
	//  107  231:iload_2         
	//  108  232:iconst_1        
	//  109  233:iadd            
	//  110  234:istore_2        
		  goto _L3
	//* 111  235:goto            27
_L2:
		i = 1;
	//  112  238:iconst_1        
	//  113  239:istore_2        
		if(i == 0)
	//* 114  240:iload_2         
	//* 115  241:ifne            247
			return "";
	//  116  244:ldc1            #101 <String "">
	//  117  246:areturn         
		return throwableProxyToString(ithrowableproxy);
	//  118  247:aload_0         
	//  119  248:aload           5
	//  120  250:invokevirtual   #151 <Method String throwableProxyToString(IThrowableProxy)>
	//  121  253:areturn         
	}

	public volatile String convert(Object obj)
	{
		return convert((ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #96  <Class ILoggingEvent>
	//    3    5:invokevirtual   #154 <Method String convert(ILoggingEvent)>
	//    4    8:areturn         
	}

	protected void extraData(StringBuilder stringbuilder, StackTraceElementProxy stacktraceelementproxy)
	{
	//    0    0:return          
	}

	public void start()
	{
		int i;
		String s;
		s = getFirstOption();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #162 <Method String getFirstOption()>
	//    2    4:astore_3        
		i = 1;
	//    3    5:iconst_1        
	//    4    6:istore_1        
		if(s != null) goto _L2; else goto _L1
	//    5    7:aload_3         
	//    6    8:ifnonnull       20
_L1:
		lengthOption = 0x7fffffff;
	//    7   11:aload_0         
	//    8   12:ldc1            #163 <Int 0x7fffffff>
	//    9   14:putfield        #165 <Field int lengthOption>
		break; /* Loop/switch isn't completed */
	//   10   17:goto            109
_L2:
		s = s.toLowerCase();
	//   11   20:aload_3         
	//   12   21:invokevirtual   #170 <Method String String.toLowerCase()>
	//   13   24:astore_3        
		if("full".equals(((Object) (s))))
	//*  14   25:ldc1            #172 <String "full">
	//*  15   27:aload_3         
	//*  16   28:invokevirtual   #175 <Method boolean String.equals(Object)>
	//*  17   31:ifeq            37
			continue; /* Loop/switch isn't completed */
	//   18   34:goto            11
		if("short".equals(((Object) (s))))
	//*  19   37:ldc1            #177 <String "short">
	//*  20   39:aload_3         
	//*  21   40:invokevirtual   #175 <Method boolean String.equals(Object)>
	//*  22   43:ifeq            54
		{
			lengthOption = 1;
	//   23   46:aload_0         
	//   24   47:iconst_1        
	//   25   48:putfield        #165 <Field int lengthOption>
			break; /* Loop/switch isn't completed */
	//   26   51:goto            109
		}
		StringBuilder stringbuilder;
		try
		{
			lengthOption = Integer.parseInt(s);
	//   27   54:aload_0         
	//   28   55:aload_3         
	//   29   56:invokestatic    #183 <Method int Integer.parseInt(String)>
	//   30   59:putfield        #165 <Field int lengthOption>
			break; /* Loop/switch isn't completed */
	//   31   62:goto            109
		}
	//*  32   65:new             #47  <Class StringBuilder>
	//*  33   68:dup             
	//*  34   69:invokespecial   #115 <Method void StringBuilder()>
	//*  35   72:astore          4
	//*  36   74:aload           4
	//*  37   76:ldc1            #185 <String "Could not parse [">
	//*  38   78:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//*  39   81:pop             
	//*  40   82:aload           4
	//*  41   84:aload_3         
	//*  42   85:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//*  43   88:pop             
	//*  44   89:aload           4
	//*  45   91:ldc1            #187 <String "] as an integer">
	//*  46   93:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//*  47   96:pop             
	//*  48   97:aload_0         
	//*  49   98:aload           4
	//*  50  100:invokevirtual   #125 <Method String StringBuilder.toString()>
	//*  51  103:invokevirtual   #190 <Method void addError(String)>
	//*  52  106:goto            11
	//*  53  109:aload_0         
	//*  54  110:invokevirtual   #194 <Method List getOptionList()>
	//*  55  113:astore_3        
	//*  56  114:aload_3         
	//*  57  115:ifnull          187
	//*  58  118:aload_3         
	//*  59  119:invokeinterface #105 <Method int List.size()>
	//*  60  124:iconst_1        
	//*  61  125:icmple          187
	//*  62  128:aload_3         
	//*  63  129:invokeinterface #105 <Method int List.size()>
	//*  64  134:istore_2        
	//*  65  135:iload_1         
	//*  66  136:iload_2         
	//*  67  137:icmpge          187
	//*  68  140:aload_3         
	//*  69  141:iload_1         
	//*  70  142:invokeinterface #109 <Method Object List.get(int)>
	//*  71  147:checkcast       #167 <Class String>
	//*  72  150:astore          4
	//*  73  152:aload_0         
	//*  74  153:aload_0         
	//*  75  154:invokevirtual   #198 <Method Context getContext()>
	//*  76  157:ldc1            #200 <String "EVALUATOR_MAP">
	//*  77  159:invokeinterface #206 <Method Object Context.getObject(String)>
	//*  78  164:checkcast       #208 <Class Map>
	//*  79  167:aload           4
	//*  80  169:invokeinterface #211 <Method Object Map.get(Object)>
	//*  81  174:checkcast       #111 <Class EventEvaluator>
	//*  82  177:invokespecial   #213 <Method void addEvaluator(EventEvaluator)>
	//*  83  180:iload_1         
	//*  84  181:iconst_1        
	//*  85  182:iadd            
	//*  86  183:istore_1        
	//*  87  184:goto            135
	//*  88  187:aload_0         
	//*  89  188:invokespecial   #215 <Method void ThrowableHandlingConverter.start()>
	//*  90  191:return          
		// Misplaced declaration of an exception variable
		catch(NumberFormatException numberformatexception)
		{
			stringbuilder = new StringBuilder();
			stringbuilder.append("Could not parse [");
			stringbuilder.append(s);
			stringbuilder.append("] as an integer");
			addError(stringbuilder.toString());
		}
		if(true) goto _L1; else goto _L3
_L3:
		NumberFormatException numberformatexception;
		List list = getOptionList();
		if(list != null && list.size() > 1)
		{
			for(int j = list.size(); i < j; i++)
			{
				String s1 = (String)list.get(i);
				addEvaluator((EventEvaluator)((Map)getContext().getObject("EVALUATOR_MAP")).get(((Object) (s1))));
			}

		}
		super.start();
		return;
	//*  91  192:astore          4
	//*  92  194:goto            65
	}

	public void stop()
	{
		evaluatorList = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #18  <Field List evaluatorList>
		super.stop();
	//    3    5:aload_0         
	//    4    6:invokespecial   #218 <Method void ThrowableHandlingConverter.stop()>
	//    5    9:return          
	}

	protected void subjoinSTEPArray(StringBuilder stringbuilder, int i, IThrowableProxy ithrowableproxy)
	{
		StackTraceElementProxy astacktraceelementproxy[] = ithrowableproxy.getStackTraceElementProxyArray();
	//    0    0:aload_3         
	//    1    1:invokeinterface #222 <Method StackTraceElementProxy[] IThrowableProxy.getStackTraceElementProxyArray()>
	//    2    6:astore          10
		int j1 = ithrowableproxy.getCommonFrames();
	//    3    8:aload_3         
	//    4    9:invokeinterface #225 <Method int IThrowableProxy.getCommonFrames()>
	//    5   14:istore          9
		int j = lengthOption;
	//    6   16:aload_0         
	//    7   17:getfield        #165 <Field int lengthOption>
	//    8   20:istore          4
		int k = astacktraceelementproxy.length;
	//    9   22:aload           10
	//   10   24:arraylength     
	//   11   25:istore          5
		boolean flag1 = false;
	//   12   27:iconst_0        
	//   13   28:istore          8
		boolean flag;
		if(j > k)
	//*  14   30:iload           4
	//*  15   32:iload           5
	//*  16   34:icmple          43
			flag = true;
	//   17   37:iconst_1        
	//   18   38:istore          5
		else
	//*  19   40:goto            46
			flag = false;
	//   20   43:iconst_0        
	//   21   44:istore          5
		if(flag)
	//*  22   46:iload           5
	//*  23   48:ifeq            59
			j = astacktraceelementproxy.length;
	//   24   51:aload           10
	//   25   53:arraylength     
	//   26   54:istore          4
		else
	//*  27   56:goto            65
			j = lengthOption;
	//   28   59:aload_0         
	//   29   60:getfield        #165 <Field int lengthOption>
	//   30   63:istore          4
		int l = j;
	//   31   65:iload           4
	//   32   67:istore          6
		int i1 = ((int) (flag1));
	//   33   69:iload           8
	//   34   71:istore          7
		if(j1 > 0)
	//*  35   73:iload           9
	//*  36   75:ifle            102
		{
			l = j;
	//   37   78:iload           4
	//   38   80:istore          6
			i1 = ((int) (flag1));
	//   39   82:iload           8
	//   40   84:istore          7
			if(flag)
	//*  41   86:iload           5
	//*  42   88:ifeq            102
			{
				l = j - j1;
	//   43   91:iload           4
	//   44   93:iload           9
	//   45   95:isub            
	//   46   96:istore          6
				i1 = ((int) (flag1));
	//   47   98:iload           8
	//   48  100:istore          7
			}
		}
		for(; i1 < l; i1++)
	//*  49  102:iload           7
	//*  50  104:iload           6
	//*  51  106:icmpge          151
		{
			ThrowableProxyUtil.indent(stringbuilder, i);
	//   52  109:aload_1         
	//   53  110:iload_2         
	//   54  111:invokestatic    #88  <Method void ThrowableProxyUtil.indent(StringBuilder, int)>
			stringbuilder.append(((Object) (astacktraceelementproxy[i1])));
	//   55  114:aload_1         
	//   56  115:aload           10
	//   57  117:iload           7
	//   58  119:aaload          
	//   59  120:invokevirtual   #228 <Method StringBuilder StringBuilder.append(Object)>
	//   60  123:pop             
			extraData(stringbuilder, astacktraceelementproxy[i1]);
	//   61  124:aload_0         
	//   62  125:aload_1         
	//   63  126:aload           10
	//   64  128:iload           7
	//   65  130:aaload          
	//   66  131:invokevirtual   #230 <Method void extraData(StringBuilder, StackTraceElementProxy)>
			stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   67  134:aload_1         
	//   68  135:getstatic       #45  <Field String CoreConstants.LINE_SEPARATOR>
	//   69  138:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   70  141:pop             
		}

	//   71  142:iload           7
	//   72  144:iconst_1        
	//   73  145:iadd            
	//   74  146:istore          7
	//*  75  148:goto            102
		if(j1 > 0 && flag)
	//*  76  151:iload           9
	//*  77  153:ifle            199
	//*  78  156:iload           5
	//*  79  158:ifeq            199
		{
			ThrowableProxyUtil.indent(stringbuilder, i);
	//   80  161:aload_1         
	//   81  162:iload_2         
	//   82  163:invokestatic    #88  <Method void ThrowableProxyUtil.indent(StringBuilder, int)>
			stringbuilder.append("... ");
	//   83  166:aload_1         
	//   84  167:ldc1            #232 <String "... ">
	//   85  169:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   86  172:pop             
			stringbuilder.append(ithrowableproxy.getCommonFrames());
	//   87  173:aload_1         
	//   88  174:aload_3         
	//   89  175:invokeinterface #225 <Method int IThrowableProxy.getCommonFrames()>
	//   90  180:invokevirtual   #235 <Method StringBuilder StringBuilder.append(int)>
	//   91  183:pop             
			stringbuilder.append(" common frames omitted");
	//   92  184:aload_1         
	//   93  185:ldc1            #237 <String " common frames omitted">
	//   94  187:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   95  190:pop             
			stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   96  191:aload_1         
	//   97  192:getstatic       #45  <Field String CoreConstants.LINE_SEPARATOR>
	//   98  195:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   99  198:pop             
		}
	//  100  199:return          
	}

	protected String throwableProxyToString(IThrowableProxy ithrowableproxy)
	{
		StringBuilder stringbuilder = new StringBuilder(2048);
	//    0    0:new             #47  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:sipush          2048
	//    3    7:invokespecial   #240 <Method void StringBuilder(int)>
	//    4   10:astore_2        
		recursiveAppend(stringbuilder, ((String) (null)), 1, ithrowableproxy);
	//    5   11:aload_0         
	//    6   12:aload_2         
	//    7   13:aconst_null     
	//    8   14:iconst_1        
	//    9   15:aload_1         
	//   10   16:invokespecial   #65  <Method void recursiveAppend(StringBuilder, String, int, IThrowableProxy)>
		return stringbuilder.toString();
	//   11   19:aload_2         
	//   12   20:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   13   23:areturn         
	}

	protected static final int BUILDER_CAPACITY = 2048;
	int errorCount;
	List evaluatorList;
	int lengthOption;
}
