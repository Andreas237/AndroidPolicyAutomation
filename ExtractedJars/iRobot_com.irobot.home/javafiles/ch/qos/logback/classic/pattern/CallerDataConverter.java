// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.status.ErrorStatus;
import java.util.*;

// Referenced classes of package ch.qos.logback.classic.pattern:
//			ClassicConverter

public class CallerDataConverter extends ClassicConverter
{

	public CallerDataConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void ClassicConverter()>
		depth = 5;
	//    2    4:aload_0         
	//    3    5:iconst_5        
	//    4    6:putfield        #21  <Field int depth>
		evaluatorList = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #23  <Field List evaluatorList>
	//    8   14:aload_0         
	//    9   15:iconst_4        
	//   10   16:putfield        #25  <Field int MAX_ERROR_COUNT>
		errorCount = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #27  <Field int errorCount>
	//   14   24:return          
	}

	private void addEvaluator(EventEvaluator eventevaluator)
	{
		if(evaluatorList == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field List evaluatorList>
	//*   2    4:ifnonnull       18
			evaluatorList = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #32  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #33  <Method void ArrayList()>
	//    7   15:putfield        #23  <Field List evaluatorList>
		evaluatorList.add(((Object) (eventevaluator)));
	//    8   18:aload_0         
	//    9   19:getfield        #23  <Field List evaluatorList>
	//   10   22:aload_1         
	//   11   23:invokeinterface #39  <Method boolean List.add(Object)>
	//   12   28:pop             
	//   13   29:return          
	}

	public String convert(ILoggingEvent iloggingevent)
	{
		int i;
		int k;
		StringBuilder stringbuilder;
		stringbuilder = new StringBuilder();
	//    0    0:new             #47  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void StringBuilder()>
	//    3    7:astore          7
		List list = evaluatorList;
	//    4    9:aload_0         
	//    5   10:getfield        #23  <Field List evaluatorList>
	//    6   13:astore          8
		k = 0;
	//    7   15:iconst_0        
	//    8   16:istore_3        
		if(list == null)
			break MISSING_BLOCK_LABEL_252;
	//    9   17:aload           8
	//   10   19:ifnull          252
		i = 0;
	//   11   22:iconst_0        
	//   12   23:istore_2        
_L2:
		boolean flag;
		Object obj;
		int l = evaluatorList.size();
	//   13   24:aload_0         
	//   14   25:getfield        #23  <Field List evaluatorList>
	//   15   28:invokeinterface #52  <Method int List.size()>
	//   16   33:istore          5
		flag = true;
	//   17   35:iconst_1        
	//   18   36:istore          4
		if(i >= l)
			break; /* Loop/switch isn't completed */
	//   19   38:iload_2         
	//   20   39:iload           5
	//   21   41:icmpge          243
		obj = ((Object) ((EventEvaluator)evaluatorList.get(i)));
	//   22   44:aload_0         
	//   23   45:getfield        #23  <Field List evaluatorList>
	//   24   48:iload_2         
	//   25   49:invokeinterface #56  <Method Object List.get(int)>
	//   26   54:checkcast       #58  <Class EventEvaluator>
	//   27   57:astore          8
		boolean flag1 = ((EventEvaluator) (obj)).evaluate(((Object) (iloggingevent)));
	//   28   59:aload           8
	//   29   61:aload_1         
	//   30   62:invokeinterface #61  <Method boolean EventEvaluator.evaluate(Object)>
	//   31   67:istore          6
		if(flag1)
	//*  32   69:iload           6
	//*  33   71:ifeq            236
		{
			i = ((int) (flag));
	//   34   74:iload           4
	//   35   76:istore_2        
			break MISSING_BLOCK_LABEL_245;
	//   36   77:goto            245
		}
		break MISSING_BLOCK_LABEL_236;
		EvaluationException evaluationexception;
		evaluationexception;
	//   37   80:astore          9
		errorCount = errorCount + 1;
	//   38   82:aload_0         
	//   39   83:aload_0         
	//   40   84:getfield        #27  <Field int errorCount>
	//   41   87:iconst_1        
	//   42   88:iadd            
	//   43   89:putfield        #27  <Field int errorCount>
		if(errorCount < 4)
	//*  44   92:aload_0         
	//*  45   93:getfield        #27  <Field int errorCount>
	//*  46   96:iconst_4        
	//*  47   97:icmpge          152
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   48  100:new             #47  <Class StringBuilder>
	//   49  103:dup             
	//   50  104:invokespecial   #48  <Method void StringBuilder()>
	//   51  107:astore          10
			stringbuilder1.append("Exception thrown for evaluator named [");
	//   52  109:aload           10
	//   53  111:ldc1            #63  <String "Exception thrown for evaluator named [">
	//   54  113:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   55  116:pop             
			stringbuilder1.append(((EventEvaluator) (obj)).getName());
	//   56  117:aload           10
	//   57  119:aload           8
	//   58  121:invokeinterface #71  <Method String EventEvaluator.getName()>
	//   59  126:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   60  129:pop             
			stringbuilder1.append("]");
	//   61  130:aload           10
	//   62  132:ldc1            #73  <String "]">
	//   63  134:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   64  137:pop             
			addError(stringbuilder1.toString(), ((Throwable) (evaluationexception)));
	//   65  138:aload_0         
	//   66  139:aload           10
	//   67  141:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   68  144:aload           9
	//   69  146:invokevirtual   #80  <Method void addError(String, Throwable)>
		} else
	//*  70  149:goto            236
		if(errorCount == 4)
	//*  71  152:aload_0         
	//*  72  153:getfield        #27  <Field int errorCount>
	//*  73  156:iconst_4        
	//*  74  157:icmpne          236
		{
			StringBuilder stringbuilder2 = new StringBuilder();
	//   75  160:new             #47  <Class StringBuilder>
	//   76  163:dup             
	//   77  164:invokespecial   #48  <Method void StringBuilder()>
	//   78  167:astore          10
			stringbuilder2.append("Exception thrown for evaluator named [");
	//   79  169:aload           10
	//   80  171:ldc1            #63  <String "Exception thrown for evaluator named [">
	//   81  173:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   82  176:pop             
			stringbuilder2.append(((EventEvaluator) (obj)).getName());
	//   83  177:aload           10
	//   84  179:aload           8
	//   85  181:invokeinterface #71  <Method String EventEvaluator.getName()>
	//   86  186:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   87  189:pop             
			stringbuilder2.append("].");
	//   88  190:aload           10
	//   89  192:ldc1            #82  <String "].">
	//   90  194:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   91  197:pop             
			obj = ((Object) (new ErrorStatus(stringbuilder2.toString(), ((Object) (this)), ((Throwable) (evaluationexception)))));
	//   92  198:new             #84  <Class ErrorStatus>
	//   93  201:dup             
	//   94  202:aload           10
	//   95  204:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   96  207:aload_0         
	//   97  208:aload           9
	//   98  210:invokespecial   #87  <Method void ErrorStatus(String, Object, Throwable)>
	//   99  213:astore          8
			((ErrorStatus) (obj)).add(((ch.qos.logback.core.status.Status) (new ErrorStatus("This was the last warning about this evaluator's errors.We don't want the StatusManager to get flooded.", ((Object) (this))))));
	//  100  215:aload           8
	//  101  217:new             #84  <Class ErrorStatus>
	//  102  220:dup             
	//  103  221:ldc1            #89  <String "This was the last warning about this evaluator's errors.We don't want the StatusManager to get flooded.">
	//  104  223:aload_0         
	//  105  224:invokespecial   #92  <Method void ErrorStatus(String, Object)>
	//  106  227:invokevirtual   #95  <Method void ErrorStatus.add(ch.qos.logback.core.status.Status)>
			addStatus(((ch.qos.logback.core.status.Status) (obj)));
	//  107  230:aload_0         
	//  108  231:aload           8
	//  109  233:invokevirtual   #98  <Method void addStatus(ch.qos.logback.core.status.Status)>
		}
		i++;
	//  110  236:iload_2         
	//  111  237:iconst_1        
	//  112  238:iadd            
	//  113  239:istore_2        
		if(true) goto _L2; else goto _L1
	//  114  240:goto            24
_L1:
		i = 0;
	//  115  243:iconst_0        
	//  116  244:istore_2        
		if(i == 0)
	//* 117  245:iload_2         
	//* 118  246:ifne            252
			return "";
	//  119  249:ldc1            #100 <String "">
	//  120  251:areturn         
		iloggingevent = ((ILoggingEvent) (iloggingevent.getCallerData()));
	//  121  252:aload_1         
	//  122  253:invokeinterface #106 <Method StackTraceElement[] ILoggingEvent.getCallerData()>
	//  123  258:astore_1        
		if(iloggingevent != null && iloggingevent.length > 0)
	//* 124  259:aload_1         
	//* 125  260:ifnull          349
	//* 126  263:aload_1         
	//* 127  264:arraylength     
	//* 128  265:ifle            349
		{
			int j;
			if(depth < iloggingevent.length)
	//* 129  268:aload_0         
	//* 130  269:getfield        #21  <Field int depth>
	//* 131  272:aload_1         
	//* 132  273:arraylength     
	//* 133  274:icmpge          285
				j = depth;
	//  134  277:aload_0         
	//  135  278:getfield        #21  <Field int depth>
	//  136  281:istore_2        
			else
	//* 137  282:goto            288
				j = iloggingevent.length;
	//  138  285:aload_1         
	//  139  286:arraylength     
	//  140  287:istore_2        
			for(; k < j; k++)
	//* 141  288:iload_3         
	//* 142  289:iload_2         
	//* 143  290:icmpge          343
			{
				stringbuilder.append(getCallerLinePrefix());
	//  144  293:aload           7
	//  145  295:aload_0         
	//  146  296:invokevirtual   #109 <Method String getCallerLinePrefix()>
	//  147  299:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//  148  302:pop             
				stringbuilder.append(k);
	//  149  303:aload           7
	//  150  305:iload_3         
	//  151  306:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
	//  152  309:pop             
				stringbuilder.append("\t at ");
	//  153  310:aload           7
	//  154  312:ldc1            #114 <String "\t at ">
	//  155  314:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//  156  317:pop             
				stringbuilder.append(((Object) (iloggingevent[k])));
	//  157  318:aload           7
	//  158  320:aload_1         
	//  159  321:iload_3         
	//  160  322:aaload          
	//  161  323:invokevirtual   #117 <Method StringBuilder StringBuilder.append(Object)>
	//  162  326:pop             
				stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//  163  327:aload           7
	//  164  329:getstatic       #122 <Field String CoreConstants.LINE_SEPARATOR>
	//  165  332:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//  166  335:pop             
			}

	//  167  336:iload_3         
	//  168  337:iconst_1        
	//  169  338:iadd            
	//  170  339:istore_3        
	//* 171  340:goto            288
			return stringbuilder.toString();
	//  172  343:aload           7
	//  173  345:invokevirtual   #76  <Method String StringBuilder.toString()>
	//  174  348:areturn         
		} else
		{
			return CallerData.CALLER_DATA_NA;
	//  175  349:getstatic       #127 <Field String CallerData.CALLER_DATA_NA>
	//  176  352:areturn         
		}
	}

	public volatile String convert(Object obj)
	{
		return convert((ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #102 <Class ILoggingEvent>
	//    3    5:invokevirtual   #130 <Method String convert(ILoggingEvent)>
	//    4    8:areturn         
	}

	protected String getCallerLinePrefix()
	{
		return "Caller+";
	//    0    0:ldc1            #8   <String "Caller+">
	//    1    2:areturn         
	}

	public void start()
	{
		Object obj = ((Object) (getFirstOption()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #136 <Method String getFirstOption()>
	//    2    4:astore_3        
		if(obj == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		try
		{
			depth = Integer.parseInt(((String) (obj)));
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:invokestatic    #142 <Method int Integer.parseInt(String)>
	//    9   15:putfield        #21  <Field int depth>
		}
	//*  10   18:goto            66
		catch(NumberFormatException numberformatexception)
	//*  11   21:astore          4
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   12   23:new             #47  <Class StringBuilder>
	//   13   26:dup             
	//   14   27:invokespecial   #48  <Method void StringBuilder()>
	//   15   30:astore          5
			stringbuilder.append("Failed to parse depth option [");
	//   16   32:aload           5
	//   17   34:ldc1            #144 <String "Failed to parse depth option [">
	//   18   36:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
			stringbuilder.append(((String) (obj)));
	//   20   40:aload           5
	//   21   42:aload_3         
	//   22   43:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   23   46:pop             
			stringbuilder.append("]");
	//   24   47:aload           5
	//   25   49:ldc1            #73  <String "]">
	//   26   51:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   27   54:pop             
			addError(stringbuilder.toString(), ((Throwable) (numberformatexception)));
	//   28   55:aload_0         
	//   29   56:aload           5
	//   30   58:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   31   61:aload           4
	//   32   63:invokevirtual   #80  <Method void addError(String, Throwable)>
		}
		obj = ((Object) (getOptionList()));
	//   33   66:aload_0         
	//   34   67:invokevirtual   #148 <Method List getOptionList()>
	//   35   70:astore_3        
		if(obj != null)
	//*  36   71:aload_3         
	//*  37   72:ifnull          166
		{
			int j = ((List) (obj)).size();
	//   38   75:aload_3         
	//   39   76:invokeinterface #52  <Method int List.size()>
	//   40   81:istore_2        
			int i = 1;
	//   41   82:iconst_1        
	//   42   83:istore_1        
			if(j > 1)
	//*  43   84:iload_2         
	//*  44   85:iconst_1        
	//*  45   86:icmple          166
			{
				for(int k = ((List) (obj)).size(); i < k; i++)
	//*  46   89:aload_3         
	//*  47   90:invokeinterface #52  <Method int List.size()>
	//*  48   95:istore_2        
	//*  49   96:iload_1         
	//*  50   97:iload_2         
	//*  51   98:icmpge          166
				{
					Object obj1 = ((Object) ((String)((List) (obj)).get(i)));
	//   52  101:aload_3         
	//   53  102:iload_1         
	//   54  103:invokeinterface #56  <Method Object List.get(int)>
	//   55  108:checkcast       #150 <Class String>
	//   56  111:astore          4
					Context context = getContext();
	//   57  113:aload_0         
	//   58  114:invokevirtual   #154 <Method Context getContext()>
	//   59  117:astore          5
					if(context == null)
						continue;
	//   60  119:aload           5
	//   61  121:ifnull          159
					obj1 = ((Object) ((EventEvaluator)((Map)context.getObject("EVALUATOR_MAP")).get(obj1)));
	//   62  124:aload           5
	//   63  126:ldc1            #156 <String "EVALUATOR_MAP">
	//   64  128:invokeinterface #162 <Method Object Context.getObject(String)>
	//   65  133:checkcast       #164 <Class Map>
	//   66  136:aload           4
	//   67  138:invokeinterface #167 <Method Object Map.get(Object)>
	//   68  143:checkcast       #58  <Class EventEvaluator>
	//   69  146:astore          4
					if(obj1 != null)
	//*  70  148:aload           4
	//*  71  150:ifnull          159
						addEvaluator(((EventEvaluator) (obj1)));
	//   72  153:aload_0         
	//   73  154:aload           4
	//   74  156:invokespecial   #169 <Method void addEvaluator(EventEvaluator)>
				}

	//   75  159:iload_1         
	//   76  160:iconst_1        
	//   77  161:iadd            
	//   78  162:istore_1        
			}
		}
	//*  79  163:goto            96
	//   80  166:return          
	}

	public static final String DEFAULT_CALLER_LINE_PREFIX = "Caller+";
	final int MAX_ERROR_COUNT = 4;
	int depth;
	int errorCount;
	List evaluatorList;
}
