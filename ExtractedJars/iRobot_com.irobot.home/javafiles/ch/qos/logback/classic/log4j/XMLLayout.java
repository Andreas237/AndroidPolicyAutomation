// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.log4j;

import ch.qos.logback.classic.spi.*;
import ch.qos.logback.core.LayoutBase;
import ch.qos.logback.core.helpers.Transform;
import java.util.*;

public class XMLLayout extends LayoutBase
{

	public XMLLayout()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void LayoutBase()>
		buf = new StringBuilder(256);
	//    2    4:aload_0         
	//    3    5:new             #21  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:sipush          256
	//    6   12:invokespecial   #24  <Method void StringBuilder(int)>
	//    7   15:putfield        #26  <Field StringBuilder buf>
		locationInfo = false;
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:putfield        #28  <Field boolean locationInfo>
		properties = false;
	//   11   23:aload_0         
	//   12   24:iconst_0        
	//   13   25:putfield        #30  <Field boolean properties>
	//   14   28:return          
	}

	public String doLayout(ILoggingEvent iloggingevent)
	{
		if(buf.capacity() > 2048)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field StringBuilder buf>
	//*   2    4:invokevirtual   #37  <Method int StringBuilder.capacity()>
	//*   3    7:sipush          2048
	//*   4   10:icmple          30
			buf = new StringBuilder(256);
	//    5   13:aload_0         
	//    6   14:new             #21  <Class StringBuilder>
	//    7   17:dup             
	//    8   18:sipush          256
	//    9   21:invokespecial   #24  <Method void StringBuilder(int)>
	//   10   24:putfield        #26  <Field StringBuilder buf>
		else
	//*  11   27:goto            38
			buf.setLength(0);
	//   12   30:aload_0         
	//   13   31:getfield        #26  <Field StringBuilder buf>
	//   14   34:iconst_0        
	//   15   35:invokevirtual   #40  <Method void StringBuilder.setLength(int)>
		buf.append("<log4j:event logger=\"");
	//   16   38:aload_0         
	//   17   39:getfield        #26  <Field StringBuilder buf>
	//   18   42:ldc1            #42  <String "<log4j:event logger=\"">
	//   19   44:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   20   47:pop             
		buf.append(iloggingevent.getLoggerName());
	//   21   48:aload_0         
	//   22   49:getfield        #26  <Field StringBuilder buf>
	//   23   52:aload_1         
	//   24   53:invokeinterface #52  <Method String ILoggingEvent.getLoggerName()>
	//   25   58:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   26   61:pop             
		buf.append("\"\r\n");
	//   27   62:aload_0         
	//   28   63:getfield        #26  <Field StringBuilder buf>
	//   29   66:ldc1            #54  <String "\"\r\n">
	//   30   68:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   31   71:pop             
		buf.append("             timestamp=\"");
	//   32   72:aload_0         
	//   33   73:getfield        #26  <Field StringBuilder buf>
	//   34   76:ldc1            #56  <String "             timestamp=\"">
	//   35   78:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   36   81:pop             
		buf.append(iloggingevent.getTimeStamp());
	//   37   82:aload_0         
	//   38   83:getfield        #26  <Field StringBuilder buf>
	//   39   86:aload_1         
	//   40   87:invokeinterface #60  <Method long ILoggingEvent.getTimeStamp()>
	//   41   92:invokevirtual   #63  <Method StringBuilder StringBuilder.append(long)>
	//   42   95:pop             
		buf.append("\" level=\"");
	//   43   96:aload_0         
	//   44   97:getfield        #26  <Field StringBuilder buf>
	//   45  100:ldc1            #65  <String "\" level=\"">
	//   46  102:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   47  105:pop             
		buf.append(((Object) (iloggingevent.getLevel())));
	//   48  106:aload_0         
	//   49  107:getfield        #26  <Field StringBuilder buf>
	//   50  110:aload_1         
	//   51  111:invokeinterface #69  <Method ch.qos.logback.classic.Level ILoggingEvent.getLevel()>
	//   52  116:invokevirtual   #72  <Method StringBuilder StringBuilder.append(Object)>
	//   53  119:pop             
		buf.append("\" thread=\"");
	//   54  120:aload_0         
	//   55  121:getfield        #26  <Field StringBuilder buf>
	//   56  124:ldc1            #74  <String "\" thread=\"">
	//   57  126:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   58  129:pop             
		buf.append(iloggingevent.getThreadName());
	//   59  130:aload_0         
	//   60  131:getfield        #26  <Field StringBuilder buf>
	//   61  134:aload_1         
	//   62  135:invokeinterface #77  <Method String ILoggingEvent.getThreadName()>
	//   63  140:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   64  143:pop             
		buf.append("\">\r\n");
	//   65  144:aload_0         
	//   66  145:getfield        #26  <Field StringBuilder buf>
	//   67  148:ldc1            #79  <String "\">\r\n">
	//   68  150:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   69  153:pop             
		buf.append("  <log4j:message><![CDATA[");
	//   70  154:aload_0         
	//   71  155:getfield        #26  <Field StringBuilder buf>
	//   72  158:ldc1            #81  <String "  <log4j:message><![CDATA[">
	//   73  160:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   74  163:pop             
		Transform.appendEscapingCDATA(buf, iloggingevent.getFormattedMessage());
	//   75  164:aload_0         
	//   76  165:getfield        #26  <Field StringBuilder buf>
	//   77  168:aload_1         
	//   78  169:invokeinterface #84  <Method String ILoggingEvent.getFormattedMessage()>
	//   79  174:invokestatic    #90  <Method void Transform.appendEscapingCDATA(StringBuilder, String)>
		buf.append("]]></log4j:message>\r\n");
	//   80  177:aload_0         
	//   81  178:getfield        #26  <Field StringBuilder buf>
	//   82  181:ldc1            #92  <String "]]></log4j:message>\r\n">
	//   83  183:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   84  186:pop             
		IThrowableProxy ithrowableproxy = iloggingevent.getThrowableProxy();
	//   85  187:aload_1         
	//   86  188:invokeinterface #96  <Method IThrowableProxy ILoggingEvent.getThrowableProxy()>
	//   87  193:astore          4
		if(ithrowableproxy != null)
	//*  88  195:aload           4
	//*  89  197:ifnull          286
		{
			StackTraceElementProxy astacktraceelementproxy[] = ithrowableproxy.getStackTraceElementProxyArray();
	//   90  200:aload           4
	//   91  202:invokeinterface #102 <Method StackTraceElementProxy[] IThrowableProxy.getStackTraceElementProxyArray()>
	//   92  207:astore          4
			buf.append("  <log4j:throwable><![CDATA[");
	//   93  209:aload_0         
	//   94  210:getfield        #26  <Field StringBuilder buf>
	//   95  213:ldc1            #104 <String "  <log4j:throwable><![CDATA[">
	//   96  215:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   97  218:pop             
			int j = astacktraceelementproxy.length;
	//   98  219:aload           4
	//   99  221:arraylength     
	//  100  222:istore_3        
			for(int i = 0; i < j; i++)
	//* 101  223:iconst_0        
	//* 102  224:istore_2        
	//* 103  225:iload_2         
	//* 104  226:iload_3         
	//* 105  227:icmpge          276
			{
				StackTraceElementProxy stacktraceelementproxy = astacktraceelementproxy[i];
	//  106  230:aload           4
	//  107  232:iload_2         
	//  108  233:aaload          
	//  109  234:astore          5
				buf.append('\t');
	//  110  236:aload_0         
	//  111  237:getfield        #26  <Field StringBuilder buf>
	//  112  240:bipush          9
	//  113  242:invokevirtual   #107 <Method StringBuilder StringBuilder.append(char)>
	//  114  245:pop             
				buf.append(stacktraceelementproxy.toString());
	//  115  246:aload_0         
	//  116  247:getfield        #26  <Field StringBuilder buf>
	//  117  250:aload           5
	//  118  252:invokevirtual   #112 <Method String StackTraceElementProxy.toString()>
	//  119  255:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//  120  258:pop             
				buf.append("\r\n");
	//  121  259:aload_0         
	//  122  260:getfield        #26  <Field StringBuilder buf>
	//  123  263:ldc1            #114 <String "\r\n">
	//  124  265:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//  125  268:pop             
			}

	//  126  269:iload_2         
	//  127  270:iconst_1        
	//  128  271:iadd            
	//  129  272:istore_2        
	//* 130  273:goto            225
			buf.append("]]></log4j:throwable>\r\n");
	//  131  276:aload_0         
	//  132  277:getfield        #26  <Field StringBuilder buf>
	//  133  280:ldc1            #116 <String "]]></log4j:throwable>\r\n">
	//  134  282:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//  135  285:pop             
		}
		if(locationInfo)
	//* 136  286:aload_0         
	//* 137  287:getfield        #28  <Field boolean locationInfo>
	//* 138  290:ifeq            433
		{
			StackTraceElement astacktraceelement[] = iloggingevent.getCallerData();
	//  139  293:aload_1         
	//  140  294:invokeinterface #120 <Method StackTraceElement[] ILoggingEvent.getCallerData()>
	//  141  299:astore          4
			if(astacktraceelement != null && astacktraceelement.length > 0)
	//* 142  301:aload           4
	//* 143  303:ifnull          433
	//* 144  306:aload           4
	//* 145  308:arraylength     
	//* 146  309:ifle            433
			{
				StackTraceElement stacktraceelement = astacktraceelement[0];
	//  147  312:aload           4
	//  148  314:iconst_0        
	//  149  315:aaload          
	//  150  316:astore          4
				buf.append("  <log4j:locationInfo class=\"");
	//  151  318:aload_0         
	//  152  319:getfield        #26  <Field StringBuilder buf>
	//  153  322:ldc1            #122 <String "  <log4j:locationInfo class=\"">
	//  154  324:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//  155  327:pop             
				buf.append(stacktraceelement.getClassName());
	//  156  328:aload_0         
	//  157  329:getfield        #26  <Field StringBuilder buf>
	//  158  332:aload           4
	//  159  334:invokevirtual   #127 <Method String StackTraceElement.getClassName()>
	//  160  337:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//  161  340:pop             
				buf.append("\"\r\n");
	//  162  341:aload_0         
	//  163  342:getfield        #26  <Field StringBuilder buf>
	//  164  345:ldc1            #54  <String "\"\r\n">
	//  165  347:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//  166  350:pop             
				buf.append("                      method=\"");
	//  167  351:aload_0         
	//  168  352:getfield        #26  <Field StringBuilder buf>
	//  169  355:ldc1            #129 <String "                      method=\"">
	//  170  357:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//  171  360:pop             
				buf.append(Transform.escapeTags(stacktraceelement.getMethodName()));
	//  172  361:aload_0         
	//  173  362:getfield        #26  <Field StringBuilder buf>
	//  174  365:aload           4
	//  175  367:invokevirtual   #132 <Method String StackTraceElement.getMethodName()>
	//  176  370:invokestatic    #136 <Method String Transform.escapeTags(String)>
	//  177  373:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//  178  376:pop             
				buf.append("\" file=\"");
	//  179  377:aload_0         
	//  180  378:getfield        #26  <Field StringBuilder buf>
	//  181  381:ldc1            #138 <String "\" file=\"">
	//  182  383:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//  183  386:pop             
				buf.append(stacktraceelement.getFileName());
	//  184  387:aload_0         
	//  185  388:getfield        #26  <Field StringBuilder buf>
	//  186  391:aload           4
	//  187  393:invokevirtual   #141 <Method String StackTraceElement.getFileName()>
	//  188  396:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//  189  399:pop             
				buf.append("\" line=\"");
	//  190  400:aload_0         
	//  191  401:getfield        #26  <Field StringBuilder buf>
	//  192  404:ldc1            #143 <String "\" line=\"">
	//  193  406:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//  194  409:pop             
				buf.append(stacktraceelement.getLineNumber());
	//  195  410:aload_0         
	//  196  411:getfield        #26  <Field StringBuilder buf>
	//  197  414:aload           4
	//  198  416:invokevirtual   #146 <Method int StackTraceElement.getLineNumber()>
	//  199  419:invokevirtual   #149 <Method StringBuilder StringBuilder.append(int)>
	//  200  422:pop             
				buf.append("\"/>\r\n");
	//  201  423:aload_0         
	//  202  424:getfield        #26  <Field StringBuilder buf>
	//  203  427:ldc1            #151 <String "\"/>\r\n">
	//  204  429:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//  205  432:pop             
			}
		}
		if(getProperties())
	//* 206  433:aload_0         
	//* 207  434:invokevirtual   #155 <Method boolean getProperties()>
	//* 208  437:ifeq            659
		{
			iloggingevent = ((ILoggingEvent) (iloggingevent.getMDCPropertyMap()));
	//  209  440:aload_1         
	//  210  441:invokeinterface #159 <Method Map ILoggingEvent.getMDCPropertyMap()>
	//  211  446:astore_1        
			if(iloggingevent != null && ((Map) (iloggingevent)).size() != 0)
	//* 212  447:aload_1         
	//* 213  448:ifnull          659
	//* 214  451:aload_1         
	//* 215  452:invokeinterface #164 <Method int Map.size()>
	//* 216  457:ifeq            659
			{
				iloggingevent = ((ILoggingEvent) (((Map) (iloggingevent)).entrySet()));
	//  217  460:aload_1         
	//  218  461:invokeinterface #168 <Method Set Map.entrySet()>
	//  219  466:astore_1        
				buf.append("  <log4j:properties>");
	//  220  467:aload_0         
	//  221  468:getfield        #26  <Field StringBuilder buf>
	//  222  471:ldc1            #170 <String "  <log4j:properties>">
	//  223  473:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//  224  476:pop             
				for(iloggingevent = ((ILoggingEvent) (((Set) (iloggingevent)).iterator())); ((Iterator) (iloggingevent)).hasNext(); buf.append(" />"))
	//* 225  477:aload_1         
	//* 226  478:invokeinterface #176 <Method Iterator Set.iterator()>
	//* 227  483:astore_1        
	//* 228  484:aload_1         
	//* 229  485:invokeinterface #181 <Method boolean Iterator.hasNext()>
	//* 230  490:ifeq            649
				{
					java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (iloggingevent)).next();
	//  231  493:aload_1         
	//  232  494:invokeinterface #185 <Method Object Iterator.next()>
	//  233  499:checkcast       #187 <Class java.util.Map$Entry>
	//  234  502:astore          4
					buf.append("\r\n    <log4j:data");
	//  235  504:aload_0         
	//  236  505:getfield        #26  <Field StringBuilder buf>
	//  237  508:ldc1            #189 <String "\r\n    <log4j:data">
	//  238  510:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//  239  513:pop             
					StringBuilder stringbuilder = buf;
	//  240  514:aload_0         
	//  241  515:getfield        #26  <Field StringBuilder buf>
	//  242  518:astore          5
					StringBuilder stringbuilder1 = new StringBuilder();
	//  243  520:new             #21  <Class StringBuilder>
	//  244  523:dup             
	//  245  524:invokespecial   #190 <Method void StringBuilder()>
	//  246  527:astore          6
					stringbuilder1.append(" name='");
	//  247  529:aload           6
	//  248  531:ldc1            #192 <String " name='">
	//  249  533:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//  250  536:pop             
					stringbuilder1.append(Transform.escapeTags((String)entry.getKey()));
	//  251  537:aload           6
	//  252  539:aload           4
	//  253  541:invokeinterface #195 <Method Object java.util.Map$Entry.getKey()>
	//  254  546:checkcast       #197 <Class String>
	//  255  549:invokestatic    #136 <Method String Transform.escapeTags(String)>
	//  256  552:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//  257  555:pop             
					stringbuilder1.append("'");
	//  258  556:aload           6
	//  259  558:ldc1            #199 <String "'">
	//  260  560:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//  261  563:pop             
					stringbuilder.append(stringbuilder1.toString());
	//  262  564:aload           5
	//  263  566:aload           6
	//  264  568:invokevirtual   #200 <Method String StringBuilder.toString()>
	//  265  571:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//  266  574:pop             
					stringbuilder = buf;
	//  267  575:aload_0         
	//  268  576:getfield        #26  <Field StringBuilder buf>
	//  269  579:astore          5
					stringbuilder1 = new StringBuilder();
	//  270  581:new             #21  <Class StringBuilder>
	//  271  584:dup             
	//  272  585:invokespecial   #190 <Method void StringBuilder()>
	//  273  588:astore          6
					stringbuilder1.append(" value='");
	//  274  590:aload           6
	//  275  592:ldc1            #202 <String " value='">
	//  276  594:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//  277  597:pop             
					stringbuilder1.append(Transform.escapeTags((String)entry.getValue()));
	//  278  598:aload           6
	//  279  600:aload           4
	//  280  602:invokeinterface #205 <Method Object java.util.Map$Entry.getValue()>
	//  281  607:checkcast       #197 <Class String>
	//  282  610:invokestatic    #136 <Method String Transform.escapeTags(String)>
	//  283  613:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//  284  616:pop             
					stringbuilder1.append("'");
	//  285  617:aload           6
	//  286  619:ldc1            #199 <String "'">
	//  287  621:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//  288  624:pop             
					stringbuilder.append(stringbuilder1.toString());
	//  289  625:aload           5
	//  290  627:aload           6
	//  291  629:invokevirtual   #200 <Method String StringBuilder.toString()>
	//  292  632:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//  293  635:pop             
				}

	//  294  636:aload_0         
	//  295  637:getfield        #26  <Field StringBuilder buf>
	//  296  640:ldc1            #207 <String " />">
	//  297  642:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//  298  645:pop             
	//* 299  646:goto            484
				buf.append("\r\n  </log4j:properties>");
	//  300  649:aload_0         
	//  301  650:getfield        #26  <Field StringBuilder buf>
	//  302  653:ldc1            #209 <String "\r\n  </log4j:properties>">
	//  303  655:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//  304  658:pop             
			}
		}
		buf.append("\r\n</log4j:event>\r\n\r\n");
	//  305  659:aload_0         
	//  306  660:getfield        #26  <Field StringBuilder buf>
	//  307  663:ldc1            #211 <String "\r\n</log4j:event>\r\n\r\n">
	//  308  665:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//  309  668:pop             
		return buf.toString();
	//  310  669:aload_0         
	//  311  670:getfield        #26  <Field StringBuilder buf>
	//  312  673:invokevirtual   #200 <Method String StringBuilder.toString()>
	//  313  676:areturn         
	}

	public volatile String doLayout(Object obj)
	{
		return doLayout((ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #48  <Class ILoggingEvent>
	//    3    5:invokevirtual   #214 <Method String doLayout(ILoggingEvent)>
	//    4    8:areturn         
	}

	public String getContentType()
	{
		return "text/xml";
	//    0    0:ldc1            #217 <String "text/xml">
	//    1    2:areturn         
	}

	public boolean getLocationInfo()
	{
		return locationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field boolean locationInfo>
	//    2    4:ireturn         
	}

	public boolean getProperties()
	{
		return properties;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field boolean properties>
	//    2    4:ireturn         
	}

	public void setLocationInfo(boolean flag)
	{
		locationInfo = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #28  <Field boolean locationInfo>
	//    3    5:return          
	}

	public void setProperties(boolean flag)
	{
		properties = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field boolean properties>
	//    3    5:return          
	}

	public void start()
	{
		super.start();
	//    0    0:aload_0         
	//    1    1:invokespecial   #224 <Method void LayoutBase.start()>
	//    2    4:return          
	}

	private static final int DEFAULT_SIZE = 256;
	private static final int UPPER_LIMIT = 2048;
	private StringBuilder buf;
	private boolean locationInfo;
	private boolean properties;
}
