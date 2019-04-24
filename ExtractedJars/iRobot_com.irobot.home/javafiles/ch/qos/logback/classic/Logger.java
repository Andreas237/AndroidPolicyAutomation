// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.LoggingEvent;
import ch.qos.logback.classic.util.LoggerNameUtil;
import ch.qos.logback.core.Appender;
import ch.qos.logback.core.spi.AppenderAttachable;
import ch.qos.logback.core.spi.AppenderAttachableImpl;
import ch.qos.logback.core.spi.FilterReply;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.spi.LocationAwareLogger;

// Referenced classes of package ch.qos.logback.classic:
//			LoggerContext, Level

public final class Logger
	implements AppenderAttachable, Serializable, org.slf4j.Logger, LocationAwareLogger
{

	Logger(String s, Logger logger, LoggerContext loggercontext)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
		additive = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #49  <Field boolean additive>
		name = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #51  <Field String name>
		parent = logger;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #53  <Field Logger parent>
		loggerContext = loggercontext;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #55  <Field LoggerContext loggerContext>
	//   14   24:return          
	}

	private int appendLoopOnAppenders(ILoggingEvent iloggingevent)
	{
		if(aai != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field AppenderAttachableImpl aai>
	//*   2    4:ifnull          16
			return aai.appendLoopOnAppenders(((Object) (iloggingevent)));
	//    3    7:aload_0         
	//    4    8:getfield        #59  <Field AppenderAttachableImpl aai>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #64  <Method int AppenderAttachableImpl.appendLoopOnAppenders(Object)>
	//    7   15:ireturn         
		else
			return 0;
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	private void buildLoggingEventAndAppend(String s, Marker marker, Level level1, String s1, Object aobj[], Throwable throwable)
	{
		s = ((String) (new LoggingEvent(s, this, level1, s1, throwable, aobj)));
	//    0    0:new             #68  <Class LoggingEvent>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload           6
	//    7   11:aload           5
	//    8   13:invokespecial   #71  <Method void LoggingEvent(String, Logger, Level, String, Throwable, Object[])>
	//    9   16:astore_1        
		((LoggingEvent) (s)).setMarker(marker);
	//   10   17:aload_1         
	//   11   18:aload_2         
	//   12   19:invokevirtual   #75  <Method void LoggingEvent.setMarker(Marker)>
		callAppenders(((ILoggingEvent) (s)));
	//   13   22:aload_0         
	//   14   23:aload_1         
	//   15   24:invokevirtual   #79  <Method void callAppenders(ILoggingEvent)>
	//   16   27:return          
	}

	private FilterReply callTurboFilters(Marker marker, Level level1)
	{
		return loggerContext.getTurboFilterChainDecision_0_3OrMore(marker, this, level1, ((String) (null)), ((Object []) (null)), ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field LoggerContext loggerContext>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aconst_null     
	//    6    8:aconst_null     
	//    7    9:aconst_null     
	//    8   10:invokevirtual   #87  <Method FilterReply LoggerContext.getTurboFilterChainDecision_0_3OrMore(Marker, Logger, Level, String, Object[], Throwable)>
	//    9   13:areturn         
	}

	private void filterAndLog_0_Or3Plus(String s, Marker marker, Level level1, String s1, Object aobj[], Throwable throwable)
	{
		FilterReply filterreply = loggerContext.getTurboFilterChainDecision_0_3OrMore(marker, this, level1, s1, aobj, throwable);
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field LoggerContext loggerContext>
	//    2    4:aload_2         
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:aload           6
	//    8   13:invokevirtual   #87  <Method FilterReply LoggerContext.getTurboFilterChainDecision_0_3OrMore(Marker, Logger, Level, String, Object[], Throwable)>
	//    9   16:astore          7
		if(filterreply == FilterReply.NEUTRAL)
	//*  10   18:aload           7
	//*  11   20:getstatic       #94  <Field FilterReply FilterReply.NEUTRAL>
	//*  12   23:if_acmpne       38
		{
			if(effectiveLevelInt > level1.levelInt)
	//*  13   26:aload_0         
	//*  14   27:getfield        #96  <Field int effectiveLevelInt>
	//*  15   30:aload_3         
	//*  16   31:getfield        #101 <Field int Level.levelInt>
	//*  17   34:icmple          47
				return;
	//   18   37:return          
		} else
		if(filterreply == FilterReply.DENY)
	//*  19   38:aload           7
	//*  20   40:getstatic       #104 <Field FilterReply FilterReply.DENY>
	//*  21   43:if_acmpne       47
			return;
	//   22   46:return          
		buildLoggingEventAndAppend(s, marker, level1, s1, aobj, throwable);
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:aload_2         
	//   26   50:aload_3         
	//   27   51:aload           4
	//   28   53:aload           5
	//   29   55:aload           6
	//   30   57:invokespecial   #106 <Method void buildLoggingEventAndAppend(String, Marker, Level, String, Object[], Throwable)>
	//   31   60:return          
	}

	private void filterAndLog_1(String s, Marker marker, Level level1, String s1, Object obj, Throwable throwable)
	{
		FilterReply filterreply = loggerContext.getTurboFilterChainDecision_1(marker, this, level1, s1, obj, throwable);
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field LoggerContext loggerContext>
	//    2    4:aload_2         
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:aload           6
	//    8   13:invokevirtual   #112 <Method FilterReply LoggerContext.getTurboFilterChainDecision_1(Marker, Logger, Level, String, Object, Throwable)>
	//    9   16:astore          7
		if(filterreply == FilterReply.NEUTRAL)
	//*  10   18:aload           7
	//*  11   20:getstatic       #94  <Field FilterReply FilterReply.NEUTRAL>
	//*  12   23:if_acmpne       38
		{
			if(effectiveLevelInt > level1.levelInt)
	//*  13   26:aload_0         
	//*  14   27:getfield        #96  <Field int effectiveLevelInt>
	//*  15   30:aload_3         
	//*  16   31:getfield        #101 <Field int Level.levelInt>
	//*  17   34:icmple          47
				return;
	//   18   37:return          
		} else
		if(filterreply == FilterReply.DENY)
	//*  19   38:aload           7
	//*  20   40:getstatic       #104 <Field FilterReply FilterReply.DENY>
	//*  21   43:if_acmpne       47
			return;
	//   22   46:return          
		buildLoggingEventAndAppend(s, marker, level1, s1, new Object[] {
			obj
		}, throwable);
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:aload_2         
	//   26   50:aload_3         
	//   27   51:aload           4
	//   28   53:iconst_1        
	//   29   54:anewarray       Object[]
	//   30   57:dup             
	//   31   58:iconst_0        
	//   32   59:aload           5
	//   33   61:aastore         
	//   34   62:aload           6
	//   35   64:invokespecial   #106 <Method void buildLoggingEventAndAppend(String, Marker, Level, String, Object[], Throwable)>
	//   36   67:return          
	}

	private void filterAndLog_2(String s, Marker marker, Level level1, String s1, Object obj, Object obj1, Throwable throwable)
	{
		FilterReply filterreply = loggerContext.getTurboFilterChainDecision_2(marker, this, level1, s1, obj, obj1, throwable);
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field LoggerContext loggerContext>
	//    2    4:aload_2         
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:aload           6
	//    8   13:aload           7
	//    9   15:invokevirtual   #118 <Method FilterReply LoggerContext.getTurboFilterChainDecision_2(Marker, Logger, Level, String, Object, Object, Throwable)>
	//   10   18:astore          8
		if(filterreply == FilterReply.NEUTRAL)
	//*  11   20:aload           8
	//*  12   22:getstatic       #94  <Field FilterReply FilterReply.NEUTRAL>
	//*  13   25:if_acmpne       40
		{
			if(effectiveLevelInt > level1.levelInt)
	//*  14   28:aload_0         
	//*  15   29:getfield        #96  <Field int effectiveLevelInt>
	//*  16   32:aload_3         
	//*  17   33:getfield        #101 <Field int Level.levelInt>
	//*  18   36:icmple          49
				return;
	//   19   39:return          
		} else
		if(filterreply == FilterReply.DENY)
	//*  20   40:aload           8
	//*  21   42:getstatic       #104 <Field FilterReply FilterReply.DENY>
	//*  22   45:if_acmpne       49
			return;
	//   23   48:return          
		buildLoggingEventAndAppend(s, marker, level1, s1, new Object[] {
			obj, obj1
		}, throwable);
	//   24   49:aload_0         
	//   25   50:aload_1         
	//   26   51:aload_2         
	//   27   52:aload_3         
	//   28   53:aload           4
	//   29   55:iconst_2        
	//   30   56:anewarray       Object[]
	//   31   59:dup             
	//   32   60:iconst_0        
	//   33   61:aload           5
	//   34   63:aastore         
	//   35   64:dup             
	//   36   65:iconst_1        
	//   37   66:aload           6
	//   38   68:aastore         
	//   39   69:aload           7
	//   40   71:invokespecial   #106 <Method void buildLoggingEventAndAppend(String, Marker, Level, String, Object[], Throwable)>
	//   41   74:return          
	}

	private void handleParentLevelChange(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(level != null) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #122 <Field Level level>
	//    4    6:ifnonnull       62
_L1:
		effectiveLevelInt = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #96  <Field int effectiveLevelInt>
		if(childrenList == null) goto _L2; else goto _L3
	//    8   14:aload_0         
	//    9   15:getfield        #124 <Field List childrenList>
	//   10   18:ifnull          62
_L3:
		int k = childrenList.size();
	//   11   21:aload_0         
	//   12   22:getfield        #124 <Field List childrenList>
	//   13   25:invokeinterface #130 <Method int List.size()>
	//   14   30:istore_3        
		int j = 0;
	//   15   31:iconst_0        
	//   16   32:istore_2        
_L4:
		if(j >= k)
			break; /* Loop/switch isn't completed */
	//   17   33:iload_2         
	//   18   34:iload_3         
	//   19   35:icmpge          62
		((Logger)childrenList.get(j)).handleParentLevelChange(i);
	//   20   38:aload_0         
	//   21   39:getfield        #124 <Field List childrenList>
	//   22   42:iload_2         
	//   23   43:invokeinterface #134 <Method Object List.get(int)>
	//   24   48:checkcast       #2   <Class Logger>
	//   25   51:iload_1         
	//   26   52:invokespecial   #136 <Method void handleParentLevelChange(int)>
		j++;
	//   27   55:iload_2         
	//   28   56:iconst_1        
	//   29   57:iadd            
	//   30   58:istore_2        
		if(true) goto _L4; else goto _L2
	//   31   59:goto            33
_L2:
		this;
	//   32   62:aload_0         
		JVM INSTR monitorexit ;
	//   33   63:monitorexit     
		return;
	//   34   64:return          
		Exception exception;
		exception;
	//   35   65:astore          4
	//*  36   67:aload_0         
		throw exception;
	//   37   68:monitorexit     
	//   38   69:aload           4
	//   39   71:athrow          
	}

	private boolean isRootLogger()
	{
		return parent == null;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Logger parent>
	//    2    4:ifnonnull       9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	private void localLevelReset()
	{
		effectiveLevelInt = 10000;
	//    0    0:aload_0         
	//    1    1:sipush          10000
	//    2    4:putfield        #96  <Field int effectiveLevelInt>
		Level level1;
		if(isRootLogger())
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #141 <Method boolean isRootLogger()>
	//*   5   11:ifeq            24
			level1 = Level.DEBUG;
	//    6   14:getstatic       #144 <Field Level Level.DEBUG>
	//    7   17:astore_1        
		else
	//*   8   18:aload_0         
	//*   9   19:aload_1         
	//*  10   20:putfield        #122 <Field Level level>
	//*  11   23:return          
			level1 = null;
	//   12   24:aconst_null     
	//   13   25:astore_1        
		level = level1;
	//*  14   26:goto            18
	}

	public void addAppender(Appender appender)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(aai == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #59  <Field AppenderAttachableImpl aai>
	//*   4    6:ifnonnull       20
			aai = new AppenderAttachableImpl();
	//    5    9:aload_0         
	//    6   10:new             #61  <Class AppenderAttachableImpl>
	//    7   13:dup             
	//    8   14:invokespecial   #147 <Method void AppenderAttachableImpl()>
	//    9   17:putfield        #59  <Field AppenderAttachableImpl aai>
		aai.addAppender(appender);
	//   10   20:aload_0         
	//   11   21:getfield        #59  <Field AppenderAttachableImpl aai>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #149 <Method void AppenderAttachableImpl.addAppender(Appender)>
		this;
	//   14   28:aload_0         
		JVM INSTR monitorexit ;
	//   15   29:monitorexit     
		return;
	//   16   30:return          
		appender;
	//   17   31:astore_1        
	//*  18   32:aload_0         
		throw appender;
	//   19   33:monitorexit     
	//   20   34:aload_1         
	//   21   35:athrow          
	}

	public void callAppenders(ILoggingEvent iloggingevent)
	{
		Logger logger = this;
	//    0    0:aload_0         
	//    1    1:astore          4
		int i = 0;
	//    2    3:iconst_0        
	//    3    4:istore_2        
		int j;
		do
		{
			j = i;
	//    4    5:iload_2         
	//    5    6:istore_3        
			if(logger == null)
				break;
	//    6    7:aload           4
	//    7    9:ifnull          44
			i += logger.appendLoopOnAppenders(iloggingevent);
	//    8   12:iload_2         
	//    9   13:aload           4
	//   10   15:aload_1         
	//   11   16:invokespecial   #153 <Method int appendLoopOnAppenders(ILoggingEvent)>
	//   12   19:iadd            
	//   13   20:istore_2        
			if(!logger.additive)
	//*  14   21:aload           4
	//*  15   23:getfield        #49  <Field boolean additive>
	//*  16   26:ifne            34
			{
				j = i;
	//   17   29:iload_2         
	//   18   30:istore_3        
				break;
	//   19   31:goto            44
			}
			logger = logger.parent;
	//   20   34:aload           4
	//   21   36:getfield        #53  <Field Logger parent>
	//   22   39:astore          4
		} while(true);
	//   23   41:goto            5
		if(j == 0)
	//*  24   44:iload_3         
	//*  25   45:ifne            56
			loggerContext.noAppenderDefinedWarning(this);
	//   26   48:aload_0         
	//   27   49:getfield        #55  <Field LoggerContext loggerContext>
	//   28   52:aload_0         
	//   29   53:invokevirtual   #157 <Method void LoggerContext.noAppenderDefinedWarning(Logger)>
	//   30   56:return          
	}

	Logger createChildByLastNamePart(String s)
	{
		if(LoggerNameUtil.getFirstSeparatorIndexOf(s) != -1)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #165 <Method int LoggerNameUtil.getFirstSeparatorIndexOf(String)>
	//*   2    4:iconst_m1       
	//*   3    5:icmpeq          62
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #167 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #168 <Method void StringBuilder()>
	//    7   15:astore_2        
			stringbuilder.append("Child name [");
	//    8   16:aload_2         
	//    9   17:ldc1            #170 <String "Child name [">
	//   10   19:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
			stringbuilder.append(s);
	//   12   23:aload_2         
	//   13   24:aload_1         
	//   14   25:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   15   28:pop             
			stringbuilder.append(" passed as parameter, may not include [");
	//   16   29:aload_2         
	//   17   30:ldc1            #176 <String " passed as parameter, may not include [">
	//   18   32:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
			stringbuilder.append('.');
	//   20   36:aload_2         
	//   21   37:bipush          46
	//   22   39:invokevirtual   #179 <Method StringBuilder StringBuilder.append(char)>
	//   23   42:pop             
			stringbuilder.append("]");
	//   24   43:aload_2         
	//   25   44:ldc1            #181 <String "]">
	//   26   46:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   27   49:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   28   50:new             #183 <Class IllegalArgumentException>
	//   29   53:dup             
	//   30   54:aload_2         
	//   31   55:invokevirtual   #187 <Method String StringBuilder.toString()>
	//   32   58:invokespecial   #190 <Method void IllegalArgumentException(String)>
	//   33   61:athrow          
		}
		if(childrenList == null)
	//*  34   62:aload_0         
	//*  35   63:getfield        #124 <Field List childrenList>
	//*  36   66:ifnonnull       80
			childrenList = ((List) (new ArrayList()));
	//   37   69:aload_0         
	//   38   70:new             #192 <Class ArrayList>
	//   39   73:dup             
	//   40   74:invokespecial   #193 <Method void ArrayList()>
	//   41   77:putfield        #124 <Field List childrenList>
		if(isRootLogger())
	//*  42   80:aload_0         
	//*  43   81:invokespecial   #141 <Method boolean isRootLogger()>
	//*  44   84:ifeq            104
		{
			s = ((String) (new Logger(s, this, loggerContext)));
	//   45   87:new             #2   <Class Logger>
	//   46   90:dup             
	//   47   91:aload_1         
	//   48   92:aload_0         
	//   49   93:aload_0         
	//   50   94:getfield        #55  <Field LoggerContext loggerContext>
	//   51   97:invokespecial   #195 <Method void Logger(String, Logger, LoggerContext)>
	//   52  100:astore_1        
		} else
	//*  53  101:goto            151
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   54  104:new             #167 <Class StringBuilder>
	//   55  107:dup             
	//   56  108:invokespecial   #168 <Method void StringBuilder()>
	//   57  111:astore_2        
			stringbuilder1.append(name);
	//   58  112:aload_2         
	//   59  113:aload_0         
	//   60  114:getfield        #51  <Field String name>
	//   61  117:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   62  120:pop             
			stringbuilder1.append('.');
	//   63  121:aload_2         
	//   64  122:bipush          46
	//   65  124:invokevirtual   #179 <Method StringBuilder StringBuilder.append(char)>
	//   66  127:pop             
			stringbuilder1.append(s);
	//   67  128:aload_2         
	//   68  129:aload_1         
	//   69  130:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   70  133:pop             
			s = ((String) (new Logger(stringbuilder1.toString(), this, loggerContext)));
	//   71  134:new             #2   <Class Logger>
	//   72  137:dup             
	//   73  138:aload_2         
	//   74  139:invokevirtual   #187 <Method String StringBuilder.toString()>
	//   75  142:aload_0         
	//   76  143:aload_0         
	//   77  144:getfield        #55  <Field LoggerContext loggerContext>
	//   78  147:invokespecial   #195 <Method void Logger(String, Logger, LoggerContext)>
	//   79  150:astore_1        
		}
		childrenList.add(((Object) (s)));
	//   80  151:aload_0         
	//   81  152:getfield        #124 <Field List childrenList>
	//   82  155:aload_1         
	//   83  156:invokeinterface #199 <Method boolean List.add(Object)>
	//   84  161:pop             
		s.effectiveLevelInt = effectiveLevelInt;
	//   85  162:aload_1         
	//   86  163:aload_0         
	//   87  164:getfield        #96  <Field int effectiveLevelInt>
	//   88  167:putfield        #96  <Field int effectiveLevelInt>
		return ((Logger) (s));
	//   89  170:aload_1         
	//   90  171:areturn         
	}

	Logger createChildByName(String s)
	{
		if(LoggerNameUtil.getSeparatorIndexOf(s, name.length() + 1) != -1)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #51  <Field String name>
	//*   3    5:invokevirtual   #205 <Method int String.length()>
	//*   4    8:iconst_1        
	//*   5    9:iadd            
	//*   6   10:invokestatic    #209 <Method int LoggerNameUtil.getSeparatorIndexOf(String, int)>
	//*   7   13:iconst_m1       
	//*   8   14:icmpeq          87
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    9   17:new             #167 <Class StringBuilder>
	//   10   20:dup             
	//   11   21:invokespecial   #168 <Method void StringBuilder()>
	//   12   24:astore_2        
			stringbuilder.append("For logger [");
	//   13   25:aload_2         
	//   14   26:ldc1            #211 <String "For logger [">
	//   15   28:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
			stringbuilder.append(name);
	//   17   32:aload_2         
	//   18   33:aload_0         
	//   19   34:getfield        #51  <Field String name>
	//   20   37:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
			stringbuilder.append("] child name [");
	//   22   41:aload_2         
	//   23   42:ldc1            #213 <String "] child name [">
	//   24   44:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   25   47:pop             
			stringbuilder.append(s);
	//   26   48:aload_2         
	//   27   49:aload_1         
	//   28   50:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   29   53:pop             
			stringbuilder.append(" passed as parameter, may not include '.' after index");
	//   30   54:aload_2         
	//   31   55:ldc1            #215 <String " passed as parameter, may not include '.' after index">
	//   32   57:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   33   60:pop             
			stringbuilder.append(name.length() + 1);
	//   34   61:aload_2         
	//   35   62:aload_0         
	//   36   63:getfield        #51  <Field String name>
	//   37   66:invokevirtual   #205 <Method int String.length()>
	//   38   69:iconst_1        
	//   39   70:iadd            
	//   40   71:invokevirtual   #218 <Method StringBuilder StringBuilder.append(int)>
	//   41   74:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   42   75:new             #183 <Class IllegalArgumentException>
	//   43   78:dup             
	//   44   79:aload_2         
	//   45   80:invokevirtual   #187 <Method String StringBuilder.toString()>
	//   46   83:invokespecial   #190 <Method void IllegalArgumentException(String)>
	//   47   86:athrow          
		}
		if(childrenList == null)
	//*  48   87:aload_0         
	//*  49   88:getfield        #124 <Field List childrenList>
	//*  50   91:ifnonnull       106
			childrenList = ((List) (new ArrayList(5)));
	//   51   94:aload_0         
	//   52   95:new             #192 <Class ArrayList>
	//   53   98:dup             
	//   54   99:iconst_5        
	//   55  100:invokespecial   #220 <Method void ArrayList(int)>
	//   56  103:putfield        #124 <Field List childrenList>
		s = ((String) (new Logger(s, this, loggerContext)));
	//   57  106:new             #2   <Class Logger>
	//   58  109:dup             
	//   59  110:aload_1         
	//   60  111:aload_0         
	//   61  112:aload_0         
	//   62  113:getfield        #55  <Field LoggerContext loggerContext>
	//   63  116:invokespecial   #195 <Method void Logger(String, Logger, LoggerContext)>
	//   64  119:astore_1        
		childrenList.add(((Object) (s)));
	//   65  120:aload_0         
	//   66  121:getfield        #124 <Field List childrenList>
	//   67  124:aload_1         
	//   68  125:invokeinterface #199 <Method boolean List.add(Object)>
	//   69  130:pop             
		s.effectiveLevelInt = effectiveLevelInt;
	//   70  131:aload_1         
	//   71  132:aload_0         
	//   72  133:getfield        #96  <Field int effectiveLevelInt>
	//   73  136:putfield        #96  <Field int effectiveLevelInt>
		return ((Logger) (s));
	//   74  139:aload_1         
	//   75  140:areturn         
	}

	public void debug(String s)
	{
		filterAndLog_0_Or3Plus(FQCN, ((Marker) (null)), Level.DEBUG, s, ((Object []) (null)), ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aconst_null     
	//    3    5:getstatic       #144 <Field Level Level.DEBUG>
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:aconst_null     
	//    7   11:invokespecial   #225 <Method void filterAndLog_0_Or3Plus(String, Marker, Level, String, Object[], Throwable)>
	//    8   14:return          
	}

	public void debug(String s, Object obj)
	{
		filterAndLog_1(FQCN, ((Marker) (null)), Level.DEBUG, s, obj, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aconst_null     
	//    3    5:getstatic       #144 <Field Level Level.DEBUG>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #228 <Method void filterAndLog_1(String, Marker, Level, String, Object, Throwable)>
	//    8   14:return          
	}

	public void debug(String s, Object obj, Object obj1)
	{
		filterAndLog_2(FQCN, ((Marker) (null)), Level.DEBUG, s, obj, obj1, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aconst_null     
	//    3    5:getstatic       #144 <Field Level Level.DEBUG>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aconst_null     
	//    8   12:invokespecial   #231 <Method void filterAndLog_2(String, Marker, Level, String, Object, Object, Throwable)>
	//    9   15:return          
	}

	public void debug(String s, Throwable throwable)
	{
		filterAndLog_0_Or3Plus(FQCN, ((Marker) (null)), Level.DEBUG, s, ((Object []) (null)), throwable);
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aconst_null     
	//    3    5:getstatic       #144 <Field Level Level.DEBUG>
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:aload_2         
	//    7   11:invokespecial   #225 <Method void filterAndLog_0_Or3Plus(String, Marker, Level, String, Object[], Throwable)>
	//    8   14:return          
	}

	public void debug(String s, Object aobj[])
	{
		filterAndLog_0_Or3Plus(FQCN, ((Marker) (null)), Level.DEBUG, s, aobj, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aconst_null     
	//    3    5:getstatic       #144 <Field Level Level.DEBUG>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #225 <Method void filterAndLog_0_Or3Plus(String, Marker, Level, String, Object[], Throwable)>
	//    8   14:return          
	}

	public void debug(Marker marker, String s)
	{
		filterAndLog_0_Or3Plus(FQCN, marker, Level.DEBUG, s, ((Object []) (null)), ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aload_1         
	//    3    5:getstatic       #144 <Field Level Level.DEBUG>
	//    4    8:aload_2         
	//    5    9:aconst_null     
	//    6   10:aconst_null     
	//    7   11:invokespecial   #225 <Method void filterAndLog_0_Or3Plus(String, Marker, Level, String, Object[], Throwable)>
	//    8   14:return          
	}

	public void debug(Marker marker, String s, Object obj)
	{
		filterAndLog_1(FQCN, marker, Level.DEBUG, s, obj, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aload_1         
	//    3    5:getstatic       #144 <Field Level Level.DEBUG>
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #228 <Method void filterAndLog_1(String, Marker, Level, String, Object, Throwable)>
	//    8   14:return          
	}

	public void debug(Marker marker, String s, Object obj, Object obj1)
	{
		filterAndLog_2(FQCN, marker, Level.DEBUG, s, obj, obj1, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aload_1         
	//    3    5:getstatic       #144 <Field Level Level.DEBUG>
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aload           4
	//    7   12:aconst_null     
	//    8   13:invokespecial   #231 <Method void filterAndLog_2(String, Marker, Level, String, Object, Object, Throwable)>
	//    9   16:return          
	}

	public void debug(Marker marker, String s, Throwable throwable)
	{
		filterAndLog_0_Or3Plus(FQCN, marker, Level.DEBUG, s, ((Object []) (null)), throwable);
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aload_1         
	//    3    5:getstatic       #144 <Field Level Level.DEBUG>
	//    4    8:aload_2         
	//    5    9:aconst_null     
	//    6   10:aload_3         
	//    7   11:invokespecial   #225 <Method void filterAndLog_0_Or3Plus(String, Marker, Level, String, Object[], Throwable)>
	//    8   14:return          
	}

	public void debug(Marker marker, String s, Object aobj[])
	{
		filterAndLog_0_Or3Plus(FQCN, marker, Level.DEBUG, s, aobj, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aload_1         
	//    3    5:getstatic       #144 <Field Level Level.DEBUG>
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #225 <Method void filterAndLog_0_Or3Plus(String, Marker, Level, String, Object[], Throwable)>
	//    8   14:return          
	}

	public void detachAndStopAllAppenders()
	{
		if(aai != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field AppenderAttachableImpl aai>
	//*   2    4:ifnull          14
			aai.detachAndStopAllAppenders();
	//    3    7:aload_0         
	//    4    8:getfield        #59  <Field AppenderAttachableImpl aai>
	//    5   11:invokevirtual   #241 <Method void AppenderAttachableImpl.detachAndStopAllAppenders()>
	//    6   14:return          
	}

	public boolean detachAppender(Appender appender)
	{
		if(aai == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field AppenderAttachableImpl aai>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return aai.detachAppender(appender);
	//    5    9:aload_0         
	//    6   10:getfield        #59  <Field AppenderAttachableImpl aai>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #245 <Method boolean AppenderAttachableImpl.detachAppender(Appender)>
	//    9   17:ireturn         
	}

	public boolean detachAppender(String s)
	{
		if(aai == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field AppenderAttachableImpl aai>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return aai.detachAppender(s);
	//    5    9:aload_0         
	//    6   10:getfield        #59  <Field AppenderAttachableImpl aai>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #249 <Method boolean AppenderAttachableImpl.detachAppender(String)>
	//    9   17:ireturn         
	}

	public void error(String s)
	{
		filterAndLog_0_Or3Plus(FQCN, ((Marker) (null)), Level.ERROR, s, ((Object []) (null)), ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aconst_null     
	//    3    5:getstatic       #253 <Field Level Level.ERROR>
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:aconst_null     
	//    7   11:invokespecial   #225 <Method void filterAndLog_0_Or3Plus(String, Marker, Level, String, Object[], Throwable)>
	//    8   14:return          
	}

	public void error(String s, Object obj)
	{
		filterAndLog_1(FQCN, ((Marker) (null)), Level.ERROR, s, obj, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aconst_null     
	//    3    5:getstatic       #253 <Field Level Level.ERROR>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #228 <Method void filterAndLog_1(String, Marker, Level, String, Object, Throwable)>
	//    8   14:return          
	}

	public void error(String s, Object obj, Object obj1)
	{
		filterAndLog_2(FQCN, ((Marker) (null)), Level.ERROR, s, obj, obj1, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aconst_null     
	//    3    5:getstatic       #253 <Field Level Level.ERROR>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aconst_null     
	//    8   12:invokespecial   #231 <Method void filterAndLog_2(String, Marker, Level, String, Object, Object, Throwable)>
	//    9   15:return          
	}

	public void error(String s, Throwable throwable)
	{
		filterAndLog_0_Or3Plus(FQCN, ((Marker) (null)), Level.ERROR, s, ((Object []) (null)), throwable);
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aconst_null     
	//    3    5:getstatic       #253 <Field Level Level.ERROR>
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:aload_2         
	//    7   11:invokespecial   #225 <Method void filterAndLog_0_Or3Plus(String, Marker, Level, String, Object[], Throwable)>
	//    8   14:return          
	}

	public void error(String s, Object aobj[])
	{
		filterAndLog_0_Or3Plus(FQCN, ((Marker) (null)), Level.ERROR, s, aobj, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aconst_null     
	//    3    5:getstatic       #253 <Field Level Level.ERROR>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #225 <Method void filterAndLog_0_Or3Plus(String, Marker, Level, String, Object[], Throwable)>
	//    8   14:return          
	}

	public void error(Marker marker, String s)
	{
		filterAndLog_0_Or3Plus(FQCN, marker, Level.ERROR, s, ((Object []) (null)), ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aload_1         
	//    3    5:getstatic       #253 <Field Level Level.ERROR>
	//    4    8:aload_2         
	//    5    9:aconst_null     
	//    6   10:aconst_null     
	//    7   11:invokespecial   #225 <Method void filterAndLog_0_Or3Plus(String, Marker, Level, String, Object[], Throwable)>
	//    8   14:return          
	}

	public void error(Marker marker, String s, Object obj)
	{
		filterAndLog_1(FQCN, marker, Level.ERROR, s, obj, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aload_1         
	//    3    5:getstatic       #253 <Field Level Level.ERROR>
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #228 <Method void filterAndLog_1(String, Marker, Level, String, Object, Throwable)>
	//    8   14:return          
	}

	public void error(Marker marker, String s, Object obj, Object obj1)
	{
		filterAndLog_2(FQCN, marker, Level.ERROR, s, obj, obj1, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aload_1         
	//    3    5:getstatic       #253 <Field Level Level.ERROR>
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aload           4
	//    7   12:aconst_null     
	//    8   13:invokespecial   #231 <Method void filterAndLog_2(String, Marker, Level, String, Object, Object, Throwable)>
	//    9   16:return          
	}

	public void error(Marker marker, String s, Throwable throwable)
	{
		filterAndLog_0_Or3Plus(FQCN, marker, Level.ERROR, s, ((Object []) (null)), throwable);
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aload_1         
	//    3    5:getstatic       #253 <Field Level Level.ERROR>
	//    4    8:aload_2         
	//    5    9:aconst_null     
	//    6   10:aload_3         
	//    7   11:invokespecial   #225 <Method void filterAndLog_0_Or3Plus(String, Marker, Level, String, Object[], Throwable)>
	//    8   14:return          
	}

	public void error(Marker marker, String s, Object aobj[])
	{
		filterAndLog_0_Or3Plus(FQCN, marker, Level.ERROR, s, aobj, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aload_1         
	//    3    5:getstatic       #253 <Field Level Level.ERROR>
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #225 <Method void filterAndLog_0_Or3Plus(String, Marker, Level, String, Object[], Throwable)>
	//    8   14:return          
	}

	public Appender getAppender(String s)
	{
		if(aai == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field AppenderAttachableImpl aai>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return aai.getAppender(s);
	//    5    9:aload_0         
	//    6   10:getfield        #59  <Field AppenderAttachableImpl aai>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #257 <Method Appender AppenderAttachableImpl.getAppender(String)>
	//    9   17:areturn         
	}

	Logger getChildByName(String s)
	{
		if(childrenList == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #124 <Field List childrenList>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		int j = childrenList.size();
	//    5    9:aload_0         
	//    6   10:getfield        #124 <Field List childrenList>
	//    7   13:invokeinterface #130 <Method int List.size()>
	//    8   18:istore_3        
		for(int i = 0; i < j; i++)
	//*   9   19:iconst_0        
	//*  10   20:istore_2        
	//*  11   21:iload_2         
	//*  12   22:iload_3         
	//*  13   23:icmpge          63
		{
			Logger logger = (Logger)childrenList.get(i);
	//   14   26:aload_0         
	//   15   27:getfield        #124 <Field List childrenList>
	//   16   30:iload_2         
	//   17   31:invokeinterface #134 <Method Object List.get(int)>
	//   18   36:checkcast       #2   <Class Logger>
	//   19   39:astore          4
			if(s.equals(((Object) (logger.getName()))))
	//*  20   41:aload_1         
	//*  21   42:aload           4
	//*  22   44:invokevirtual   #262 <Method String getName()>
	//*  23   47:invokevirtual   #265 <Method boolean String.equals(Object)>
	//*  24   50:ifeq            56
				return logger;
	//   25   53:aload           4
	//   26   55:areturn         
		}

	//   27   56:iload_2         
	//   28   57:iconst_1        
	//   29   58:iadd            
	//   30   59:istore_2        
	//*  31   60:goto            21
		return null;
	//   32   63:aconst_null     
	//   33   64:areturn         
	}

	public Level getEffectiveLevel()
	{
		return Level.toLevel(effectiveLevelInt);
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field int effectiveLevelInt>
	//    2    4:invokestatic    #271 <Method Level Level.toLevel(int)>
	//    3    7:areturn         
	}

	int getEffectiveLevelInt()
	{
		return effectiveLevelInt;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field int effectiveLevelInt>
	//    2    4:ireturn         
	}

	public Level getLevel()
	{
		return level;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field Level level>
	//    2    4:areturn         
	}

	public LoggerContext getLoggerContext()
	{
		return loggerContext;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field LoggerContext loggerContext>
	//    2    4:areturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String name>
	//    2    4:areturn         
	}

	public void info(String s)
	{
		filterAndLog_0_Or3Plus(FQCN, ((Marker) (null)), Level.INFO, s, ((Object []) (null)), ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aconst_null     
	//    3    5:getstatic       #279 <Field Level Level.INFO>
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:aconst_null     
	//    7   11:invokespecial   #225 <Method void filterAndLog_0_Or3Plus(String, Marker, Level, String, Object[], Throwable)>
	//    8   14:return          
	}

	public void info(String s, Object obj)
	{
		filterAndLog_1(FQCN, ((Marker) (null)), Level.INFO, s, obj, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aconst_null     
	//    3    5:getstatic       #279 <Field Level Level.INFO>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #228 <Method void filterAndLog_1(String, Marker, Level, String, Object, Throwable)>
	//    8   14:return          
	}

	public void info(String s, Object obj, Object obj1)
	{
		filterAndLog_2(FQCN, ((Marker) (null)), Level.INFO, s, obj, obj1, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aconst_null     
	//    3    5:getstatic       #279 <Field Level Level.INFO>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aconst_null     
	//    8   12:invokespecial   #231 <Method void filterAndLog_2(String, Marker, Level, String, Object, Object, Throwable)>
	//    9   15:return          
	}

	public void info(String s, Throwable throwable)
	{
		filterAndLog_0_Or3Plus(FQCN, ((Marker) (null)), Level.INFO, s, ((Object []) (null)), throwable);
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aconst_null     
	//    3    5:getstatic       #279 <Field Level Level.INFO>
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:aload_2         
	//    7   11:invokespecial   #225 <Method void filterAndLog_0_Or3Plus(String, Marker, Level, String, Object[], Throwable)>
	//    8   14:return          
	}

	public void info(String s, Object aobj[])
	{
		filterAndLog_0_Or3Plus(FQCN, ((Marker) (null)), Level.INFO, s, aobj, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aconst_null     
	//    3    5:getstatic       #279 <Field Level Level.INFO>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #225 <Method void filterAndLog_0_Or3Plus(String, Marker, Level, String, Object[], Throwable)>
	//    8   14:return          
	}

	public void info(Marker marker, String s)
	{
		filterAndLog_0_Or3Plus(FQCN, marker, Level.INFO, s, ((Object []) (null)), ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aload_1         
	//    3    5:getstatic       #279 <Field Level Level.INFO>
	//    4    8:aload_2         
	//    5    9:aconst_null     
	//    6   10:aconst_null     
	//    7   11:invokespecial   #225 <Method void filterAndLog_0_Or3Plus(String, Marker, Level, String, Object[], Throwable)>
	//    8   14:return          
	}

	public void info(Marker marker, String s, Object obj)
	{
		filterAndLog_1(FQCN, marker, Level.INFO, s, obj, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aload_1         
	//    3    5:getstatic       #279 <Field Level Level.INFO>
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #228 <Method void filterAndLog_1(String, Marker, Level, String, Object, Throwable)>
	//    8   14:return          
	}

	public void info(Marker marker, String s, Object obj, Object obj1)
	{
		filterAndLog_2(FQCN, marker, Level.INFO, s, obj, obj1, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aload_1         
	//    3    5:getstatic       #279 <Field Level Level.INFO>
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aload           4
	//    7   12:aconst_null     
	//    8   13:invokespecial   #231 <Method void filterAndLog_2(String, Marker, Level, String, Object, Object, Throwable)>
	//    9   16:return          
	}

	public void info(Marker marker, String s, Throwable throwable)
	{
		filterAndLog_0_Or3Plus(FQCN, marker, Level.INFO, s, ((Object []) (null)), throwable);
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aload_1         
	//    3    5:getstatic       #279 <Field Level Level.INFO>
	//    4    8:aload_2         
	//    5    9:aconst_null     
	//    6   10:aload_3         
	//    7   11:invokespecial   #225 <Method void filterAndLog_0_Or3Plus(String, Marker, Level, String, Object[], Throwable)>
	//    8   14:return          
	}

	public void info(Marker marker, String s, Object aobj[])
	{
		filterAndLog_0_Or3Plus(FQCN, marker, Level.INFO, s, aobj, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aload_1         
	//    3    5:getstatic       #279 <Field Level Level.INFO>
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #225 <Method void filterAndLog_0_Or3Plus(String, Marker, Level, String, Object[], Throwable)>
	//    8   14:return          
	}

	public boolean isAdditive()
	{
		return additive;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field boolean additive>
	//    2    4:ireturn         
	}

	public boolean isAttached(Appender appender)
	{
		if(aai == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field AppenderAttachableImpl aai>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return aai.isAttached(appender);
	//    5    9:aload_0         
	//    6   10:getfield        #59  <Field AppenderAttachableImpl aai>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #283 <Method boolean AppenderAttachableImpl.isAttached(Appender)>
	//    9   17:ireturn         
	}

	public boolean isDebugEnabled()
	{
		return isDebugEnabled(((Marker) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #287 <Method boolean isDebugEnabled(Marker)>
	//    3    5:ireturn         
	}

	public boolean isDebugEnabled(Marker marker)
	{
		marker = ((Marker) (callTurboFilters(marker, Level.DEBUG)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #144 <Field Level Level.DEBUG>
	//    3    5:invokespecial   #289 <Method FilterReply callTurboFilters(Marker, Level)>
	//    4    8:astore_1        
		FilterReply filterreply = FilterReply.NEUTRAL;
	//    5    9:getstatic       #94  <Field FilterReply FilterReply.NEUTRAL>
	//    6   12:astore_3        
		boolean flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_2        
		if(marker == filterreply)
	//*   9   15:aload_1         
	//*  10   16:aload_3         
	//*  11   17:if_acmpne       34
		{
			if(effectiveLevelInt <= 10000)
	//*  12   20:aload_0         
	//*  13   21:getfield        #96  <Field int effectiveLevelInt>
	//*  14   24:sipush          10000
	//*  15   27:icmpgt          32
				flag = true;
	//   16   30:iconst_1        
	//   17   31:istore_2        
			return flag;
	//   18   32:iload_2         
	//   19   33:ireturn         
		}
		if(marker == FilterReply.DENY)
	//*  20   34:aload_1         
	//*  21   35:getstatic       #104 <Field FilterReply FilterReply.DENY>
	//*  22   38:if_acmpne       43
			return false;
	//   23   41:iconst_0        
	//   24   42:ireturn         
		if(marker == FilterReply.ACCEPT)
	//*  25   43:aload_1         
	//*  26   44:getstatic       #292 <Field FilterReply FilterReply.ACCEPT>
	//*  27   47:if_acmpne       52
		{
			return true;
	//   28   50:iconst_1        
	//   29   51:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   30   52:new             #167 <Class StringBuilder>
	//   31   55:dup             
	//   32   56:invokespecial   #168 <Method void StringBuilder()>
	//   33   59:astore_3        
			stringbuilder.append("Unknown FilterReply value: ");
	//   34   60:aload_3         
	//   35   61:ldc2            #294 <String "Unknown FilterReply value: ">
	//   36   64:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   37   67:pop             
			stringbuilder.append(((Object) (marker)));
	//   38   68:aload_3         
	//   39   69:aload_1         
	//   40   70:invokevirtual   #297 <Method StringBuilder StringBuilder.append(Object)>
	//   41   73:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   42   74:new             #299 <Class IllegalStateException>
	//   43   77:dup             
	//   44   78:aload_3         
	//   45   79:invokevirtual   #187 <Method String StringBuilder.toString()>
	//   46   82:invokespecial   #300 <Method void IllegalStateException(String)>
	//   47   85:athrow          
		}
	}

	public boolean isEnabledFor(Level level1)
	{
		return isEnabledFor(((Marker) (null)), level1);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokevirtual   #305 <Method boolean isEnabledFor(Marker, Level)>
	//    4    6:ireturn         
	}

	public boolean isEnabledFor(Marker marker, Level level1)
	{
		marker = ((Marker) (callTurboFilters(marker, level1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #289 <Method FilterReply callTurboFilters(Marker, Level)>
	//    4    6:astore_1        
		FilterReply filterreply = FilterReply.NEUTRAL;
	//    5    7:getstatic       #94  <Field FilterReply FilterReply.NEUTRAL>
	//    6   10:astore          4
		boolean flag = false;
	//    7   12:iconst_0        
	//    8   13:istore_3        
		if(marker == filterreply)
	//*   9   14:aload_1         
	//*  10   15:aload           4
	//*  11   17:if_acmpne       35
		{
			if(effectiveLevelInt <= level1.levelInt)
	//*  12   20:aload_0         
	//*  13   21:getfield        #96  <Field int effectiveLevelInt>
	//*  14   24:aload_2         
	//*  15   25:getfield        #101 <Field int Level.levelInt>
	//*  16   28:icmpgt          33
				flag = true;
	//   17   31:iconst_1        
	//   18   32:istore_3        
			return flag;
	//   19   33:iload_3         
	//   20   34:ireturn         
		}
		if(marker == FilterReply.DENY)
	//*  21   35:aload_1         
	//*  22   36:getstatic       #104 <Field FilterReply FilterReply.DENY>
	//*  23   39:if_acmpne       44
			return false;
	//   24   42:iconst_0        
	//   25   43:ireturn         
		if(marker == FilterReply.ACCEPT)
	//*  26   44:aload_1         
	//*  27   45:getstatic       #292 <Field FilterReply FilterReply.ACCEPT>
	//*  28   48:if_acmpne       53
		{
			return true;
	//   29   51:iconst_1        
	//   30   52:ireturn         
		} else
		{
			level1 = ((Level) (new StringBuilder()));
	//   31   53:new             #167 <Class StringBuilder>
	//   32   56:dup             
	//   33   57:invokespecial   #168 <Method void StringBuilder()>
	//   34   60:astore_2        
			((StringBuilder) (level1)).append("Unknown FilterReply value: ");
	//   35   61:aload_2         
	//   36   62:ldc2            #294 <String "Unknown FilterReply value: ">
	//   37   65:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   38   68:pop             
			((StringBuilder) (level1)).append(((Object) (marker)));
	//   39   69:aload_2         
	//   40   70:aload_1         
	//   41   71:invokevirtual   #297 <Method StringBuilder StringBuilder.append(Object)>
	//   42   74:pop             
			throw new IllegalStateException(((StringBuilder) (level1)).toString());
	//   43   75:new             #299 <Class IllegalStateException>
	//   44   78:dup             
	//   45   79:aload_2         
	//   46   80:invokevirtual   #187 <Method String StringBuilder.toString()>
	//   47   83:invokespecial   #300 <Method void IllegalStateException(String)>
	//   48   86:athrow          
		}
	}

	public boolean isErrorEnabled()
	{
		return isErrorEnabled(((Marker) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #308 <Method boolean isErrorEnabled(Marker)>
	//    3    5:ireturn         
	}

	public boolean isErrorEnabled(Marker marker)
	{
		marker = ((Marker) (callTurboFilters(marker, Level.ERROR)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #253 <Field Level Level.ERROR>
	//    3    5:invokespecial   #289 <Method FilterReply callTurboFilters(Marker, Level)>
	//    4    8:astore_1        
		FilterReply filterreply = FilterReply.NEUTRAL;
	//    5    9:getstatic       #94  <Field FilterReply FilterReply.NEUTRAL>
	//    6   12:astore_3        
		boolean flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_2        
		if(marker == filterreply)
	//*   9   15:aload_1         
	//*  10   16:aload_3         
	//*  11   17:if_acmpne       34
		{
			if(effectiveLevelInt <= 40000)
	//*  12   20:aload_0         
	//*  13   21:getfield        #96  <Field int effectiveLevelInt>
	//*  14   24:ldc2            #309 <Int 40000>
	//*  15   27:icmpgt          32
				flag = true;
	//   16   30:iconst_1        
	//   17   31:istore_2        
			return flag;
	//   18   32:iload_2         
	//   19   33:ireturn         
		}
		if(marker == FilterReply.DENY)
	//*  20   34:aload_1         
	//*  21   35:getstatic       #104 <Field FilterReply FilterReply.DENY>
	//*  22   38:if_acmpne       43
			return false;
	//   23   41:iconst_0        
	//   24   42:ireturn         
		if(marker == FilterReply.ACCEPT)
	//*  25   43:aload_1         
	//*  26   44:getstatic       #292 <Field FilterReply FilterReply.ACCEPT>
	//*  27   47:if_acmpne       52
		{
			return true;
	//   28   50:iconst_1        
	//   29   51:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   30   52:new             #167 <Class StringBuilder>
	//   31   55:dup             
	//   32   56:invokespecial   #168 <Method void StringBuilder()>
	//   33   59:astore_3        
			stringbuilder.append("Unknown FilterReply value: ");
	//   34   60:aload_3         
	//   35   61:ldc2            #294 <String "Unknown FilterReply value: ">
	//   36   64:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   37   67:pop             
			stringbuilder.append(((Object) (marker)));
	//   38   68:aload_3         
	//   39   69:aload_1         
	//   40   70:invokevirtual   #297 <Method StringBuilder StringBuilder.append(Object)>
	//   41   73:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   42   74:new             #299 <Class IllegalStateException>
	//   43   77:dup             
	//   44   78:aload_3         
	//   45   79:invokevirtual   #187 <Method String StringBuilder.toString()>
	//   46   82:invokespecial   #300 <Method void IllegalStateException(String)>
	//   47   85:athrow          
		}
	}

	public boolean isInfoEnabled()
	{
		return isInfoEnabled(((Marker) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #312 <Method boolean isInfoEnabled(Marker)>
	//    3    5:ireturn         
	}

	public boolean isInfoEnabled(Marker marker)
	{
		marker = ((Marker) (callTurboFilters(marker, Level.INFO)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #279 <Field Level Level.INFO>
	//    3    5:invokespecial   #289 <Method FilterReply callTurboFilters(Marker, Level)>
	//    4    8:astore_1        
		FilterReply filterreply = FilterReply.NEUTRAL;
	//    5    9:getstatic       #94  <Field FilterReply FilterReply.NEUTRAL>
	//    6   12:astore_3        
		boolean flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_2        
		if(marker == filterreply)
	//*   9   15:aload_1         
	//*  10   16:aload_3         
	//*  11   17:if_acmpne       34
		{
			if(effectiveLevelInt <= 20000)
	//*  12   20:aload_0         
	//*  13   21:getfield        #96  <Field int effectiveLevelInt>
	//*  14   24:sipush          20000
	//*  15   27:icmpgt          32
				flag = true;
	//   16   30:iconst_1        
	//   17   31:istore_2        
			return flag;
	//   18   32:iload_2         
	//   19   33:ireturn         
		}
		if(marker == FilterReply.DENY)
	//*  20   34:aload_1         
	//*  21   35:getstatic       #104 <Field FilterReply FilterReply.DENY>
	//*  22   38:if_acmpne       43
			return false;
	//   23   41:iconst_0        
	//   24   42:ireturn         
		if(marker == FilterReply.ACCEPT)
	//*  25   43:aload_1         
	//*  26   44:getstatic       #292 <Field FilterReply FilterReply.ACCEPT>
	//*  27   47:if_acmpne       52
		{
			return true;
	//   28   50:iconst_1        
	//   29   51:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   30   52:new             #167 <Class StringBuilder>
	//   31   55:dup             
	//   32   56:invokespecial   #168 <Method void StringBuilder()>
	//   33   59:astore_3        
			stringbuilder.append("Unknown FilterReply value: ");
	//   34   60:aload_3         
	//   35   61:ldc2            #294 <String "Unknown FilterReply value: ">
	//   36   64:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   37   67:pop             
			stringbuilder.append(((Object) (marker)));
	//   38   68:aload_3         
	//   39   69:aload_1         
	//   40   70:invokevirtual   #297 <Method StringBuilder StringBuilder.append(Object)>
	//   41   73:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   42   74:new             #299 <Class IllegalStateException>
	//   43   77:dup             
	//   44   78:aload_3         
	//   45   79:invokevirtual   #187 <Method String StringBuilder.toString()>
	//   46   82:invokespecial   #300 <Method void IllegalStateException(String)>
	//   47   85:athrow          
		}
	}

	public boolean isTraceEnabled()
	{
		return isTraceEnabled(((Marker) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #315 <Method boolean isTraceEnabled(Marker)>
	//    3    5:ireturn         
	}

	public boolean isTraceEnabled(Marker marker)
	{
		marker = ((Marker) (callTurboFilters(marker, Level.TRACE)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #318 <Field Level Level.TRACE>
	//    3    5:invokespecial   #289 <Method FilterReply callTurboFilters(Marker, Level)>
	//    4    8:astore_1        
		FilterReply filterreply = FilterReply.NEUTRAL;
	//    5    9:getstatic       #94  <Field FilterReply FilterReply.NEUTRAL>
	//    6   12:astore_3        
		boolean flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_2        
		if(marker == filterreply)
	//*   9   15:aload_1         
	//*  10   16:aload_3         
	//*  11   17:if_acmpne       34
		{
			if(effectiveLevelInt <= 5000)
	//*  12   20:aload_0         
	//*  13   21:getfield        #96  <Field int effectiveLevelInt>
	//*  14   24:sipush          5000
	//*  15   27:icmpgt          32
				flag = true;
	//   16   30:iconst_1        
	//   17   31:istore_2        
			return flag;
	//   18   32:iload_2         
	//   19   33:ireturn         
		}
		if(marker == FilterReply.DENY)
	//*  20   34:aload_1         
	//*  21   35:getstatic       #104 <Field FilterReply FilterReply.DENY>
	//*  22   38:if_acmpne       43
			return false;
	//   23   41:iconst_0        
	//   24   42:ireturn         
		if(marker == FilterReply.ACCEPT)
	//*  25   43:aload_1         
	//*  26   44:getstatic       #292 <Field FilterReply FilterReply.ACCEPT>
	//*  27   47:if_acmpne       52
		{
			return true;
	//   28   50:iconst_1        
	//   29   51:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   30   52:new             #167 <Class StringBuilder>
	//   31   55:dup             
	//   32   56:invokespecial   #168 <Method void StringBuilder()>
	//   33   59:astore_3        
			stringbuilder.append("Unknown FilterReply value: ");
	//   34   60:aload_3         
	//   35   61:ldc2            #294 <String "Unknown FilterReply value: ">
	//   36   64:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   37   67:pop             
			stringbuilder.append(((Object) (marker)));
	//   38   68:aload_3         
	//   39   69:aload_1         
	//   40   70:invokevirtual   #297 <Method StringBuilder StringBuilder.append(Object)>
	//   41   73:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   42   74:new             #299 <Class IllegalStateException>
	//   43   77:dup             
	//   44   78:aload_3         
	//   45   79:invokevirtual   #187 <Method String StringBuilder.toString()>
	//   46   82:invokespecial   #300 <Method void IllegalStateException(String)>
	//   47   85:athrow          
		}
	}

	public boolean isWarnEnabled()
	{
		return isWarnEnabled(((Marker) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #321 <Method boolean isWarnEnabled(Marker)>
	//    3    5:ireturn         
	}

	public boolean isWarnEnabled(Marker marker)
	{
		marker = ((Marker) (callTurboFilters(marker, Level.WARN)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #324 <Field Level Level.WARN>
	//    3    5:invokespecial   #289 <Method FilterReply callTurboFilters(Marker, Level)>
	//    4    8:astore_1        
		FilterReply filterreply = FilterReply.NEUTRAL;
	//    5    9:getstatic       #94  <Field FilterReply FilterReply.NEUTRAL>
	//    6   12:astore_3        
		boolean flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_2        
		if(marker == filterreply)
	//*   9   15:aload_1         
	//*  10   16:aload_3         
	//*  11   17:if_acmpne       34
		{
			if(effectiveLevelInt <= 30000)
	//*  12   20:aload_0         
	//*  13   21:getfield        #96  <Field int effectiveLevelInt>
	//*  14   24:sipush          30000
	//*  15   27:icmpgt          32
				flag = true;
	//   16   30:iconst_1        
	//   17   31:istore_2        
			return flag;
	//   18   32:iload_2         
	//   19   33:ireturn         
		}
		if(marker == FilterReply.DENY)
	//*  20   34:aload_1         
	//*  21   35:getstatic       #104 <Field FilterReply FilterReply.DENY>
	//*  22   38:if_acmpne       43
			return false;
	//   23   41:iconst_0        
	//   24   42:ireturn         
		if(marker == FilterReply.ACCEPT)
	//*  25   43:aload_1         
	//*  26   44:getstatic       #292 <Field FilterReply FilterReply.ACCEPT>
	//*  27   47:if_acmpne       52
		{
			return true;
	//   28   50:iconst_1        
	//   29   51:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   30   52:new             #167 <Class StringBuilder>
	//   31   55:dup             
	//   32   56:invokespecial   #168 <Method void StringBuilder()>
	//   33   59:astore_3        
			stringbuilder.append("Unknown FilterReply value: ");
	//   34   60:aload_3         
	//   35   61:ldc2            #294 <String "Unknown FilterReply value: ">
	//   36   64:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   37   67:pop             
			stringbuilder.append(((Object) (marker)));
	//   38   68:aload_3         
	//   39   69:aload_1         
	//   40   70:invokevirtual   #297 <Method StringBuilder StringBuilder.append(Object)>
	//   41   73:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   42   74:new             #299 <Class IllegalStateException>
	//   43   77:dup             
	//   44   78:aload_3         
	//   45   79:invokevirtual   #187 <Method String StringBuilder.toString()>
	//   46   82:invokespecial   #300 <Method void IllegalStateException(String)>
	//   47   85:athrow          
		}
	}

	public Iterator iteratorForAppenders()
	{
		if(aai == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field AppenderAttachableImpl aai>
	//*   2    4:ifnonnull       16
			return Collections.EMPTY_LIST.iterator();
	//    3    7:getstatic       #331 <Field List Collections.EMPTY_LIST>
	//    4   10:invokeinterface #334 <Method Iterator List.iterator()>
	//    5   15:areturn         
		else
			return aai.iteratorForAppenders();
	//    6   16:aload_0         
	//    7   17:getfield        #59  <Field AppenderAttachableImpl aai>
	//    8   20:invokevirtual   #336 <Method Iterator AppenderAttachableImpl.iteratorForAppenders()>
	//    9   23:areturn         
	}

	public void log(Marker marker, String s, int i, String s1, Object aobj[], Throwable throwable)
	{
		filterAndLog_0_Or3Plus(s, marker, Level.fromLocationAwareLoggerInteger(i), s1, aobj, throwable);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_1         
	//    3    3:iload_3         
	//    4    4:invokestatic    #342 <Method Level Level.fromLocationAwareLoggerInteger(int)>
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:aload           6
	//    8   13:invokespecial   #225 <Method void filterAndLog_0_Or3Plus(String, Marker, Level, String, Object[], Throwable)>
	//    9   16:return          
	}

	protected Object readResolve()
	{
		return ((Object) (LoggerFactory.getLogger(getName())));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #262 <Method String getName()>
	//    2    4:invokestatic    #350 <Method org.slf4j.Logger LoggerFactory.getLogger(String)>
	//    3    7:areturn         
	}

	void recursiveReset()
	{
		detachAndStopAllAppenders();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #352 <Method void detachAndStopAllAppenders()>
		localLevelReset();
	//    2    4:aload_0         
	//    3    5:invokespecial   #354 <Method void localLevelReset()>
		additive = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #49  <Field boolean additive>
		if(childrenList == null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #124 <Field List childrenList>
	//*   9   17:ifnonnull       21
			return;
	//   10   20:return          
		for(Iterator iterator = (new CopyOnWriteArrayList(((java.util.Collection) (childrenList)))).iterator(); iterator.hasNext(); ((Logger)iterator.next()).recursiveReset());
	//   11   21:new             #356 <Class CopyOnWriteArrayList>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:getfield        #124 <Field List childrenList>
	//   15   29:invokespecial   #359 <Method void CopyOnWriteArrayList(java.util.Collection)>
	//   16   32:invokevirtual   #360 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   17   35:astore_1        
	//   18   36:aload_1         
	//   19   37:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//   20   42:ifeq            60
	//   21   45:aload_1         
	//   22   46:invokeinterface #368 <Method Object Iterator.next()>
	//   23   51:checkcast       #2   <Class Logger>
	//   24   54:invokevirtual   #370 <Method void recursiveReset()>
	//*  25   57:goto            36
	//   26   60:return          
	}

	public void setAdditive(boolean flag)
	{
		additive = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #49  <Field boolean additive>
	//    3    5:return          
	}

	public void setLevel(Level level1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Level level2 = level;
	//    2    2:aload_0         
	//    3    3:getfield        #122 <Field Level level>
	//    4    6:astore          4
		if(level2 != level1)
			break MISSING_BLOCK_LABEL_17;
	//    5    8:aload           4
	//    6   10:aload_1         
	//    7   11:if_acmpne       17
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		if(level1 != null)
			break MISSING_BLOCK_LABEL_39;
	//   11   17:aload_1         
	//   12   18:ifnonnull       39
		if(isRootLogger())
	//*  13   21:aload_0         
	//*  14   22:invokespecial   #141 <Method boolean isRootLogger()>
	//*  15   25:ifeq            39
			throw new IllegalArgumentException("The level of the root logger cannot be set to null");
	//   16   28:new             #183 <Class IllegalArgumentException>
	//   17   31:dup             
	//   18   32:ldc2            #376 <String "The level of the root logger cannot be set to null">
	//   19   35:invokespecial   #190 <Method void IllegalArgumentException(String)>
	//   20   38:athrow          
		level = level1;
	//   21   39:aload_0         
	//   22   40:aload_1         
	//   23   41:putfield        #122 <Field Level level>
		if(level1 != null)
			break MISSING_BLOCK_LABEL_70;
	//   24   44:aload_1         
	//   25   45:ifnonnull       70
		effectiveLevelInt = parent.effectiveLevelInt;
	//   26   48:aload_0         
	//   27   49:aload_0         
	//   28   50:getfield        #53  <Field Logger parent>
	//   29   53:getfield        #96  <Field int effectiveLevelInt>
	//   30   56:putfield        #96  <Field int effectiveLevelInt>
		level1 = parent.getEffectiveLevel();
	//   31   59:aload_0         
	//   32   60:getfield        #53  <Field Logger parent>
	//   33   63:invokevirtual   #378 <Method Level getEffectiveLevel()>
	//   34   66:astore_1        
		break MISSING_BLOCK_LABEL_78;
	//   35   67:goto            78
		effectiveLevelInt = level1.levelInt;
	//   36   70:aload_0         
	//   37   71:aload_1         
	//   38   72:getfield        #101 <Field int Level.levelInt>
	//   39   75:putfield        #96  <Field int effectiveLevelInt>
		if(childrenList == null) goto _L2; else goto _L1
	//   40   78:aload_0         
	//   41   79:getfield        #124 <Field List childrenList>
	//   42   82:ifnull          129
_L1:
		int j = childrenList.size();
	//   43   85:aload_0         
	//   44   86:getfield        #124 <Field List childrenList>
	//   45   89:invokeinterface #130 <Method int List.size()>
	//   46   94:istore_3        
		int i = 0;
	//   47   95:iconst_0        
	//   48   96:istore_2        
_L3:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   49   97:iload_2         
	//   50   98:iload_3         
	//   51   99:icmpge          129
		((Logger)childrenList.get(i)).handleParentLevelChange(effectiveLevelInt);
	//   52  102:aload_0         
	//   53  103:getfield        #124 <Field List childrenList>
	//   54  106:iload_2         
	//   55  107:invokeinterface #134 <Method Object List.get(int)>
	//   56  112:checkcast       #2   <Class Logger>
	//   57  115:aload_0         
	//   58  116:getfield        #96  <Field int effectiveLevelInt>
	//   59  119:invokespecial   #136 <Method void handleParentLevelChange(int)>
		i++;
	//   60  122:iload_2         
	//   61  123:iconst_1        
	//   62  124:iadd            
	//   63  125:istore_2        
		if(true) goto _L3; else goto _L2
	//   64  126:goto            97
_L2:
		loggerContext.fireOnLevelChange(this, level1);
	//   65  129:aload_0         
	//   66  130:getfield        #55  <Field LoggerContext loggerContext>
	//   67  133:aload_0         
	//   68  134:aload_1         
	//   69  135:invokevirtual   #382 <Method void LoggerContext.fireOnLevelChange(Logger, Level)>
		this;
	//   70  138:aload_0         
		JVM INSTR monitorexit ;
	//   71  139:monitorexit     
		return;
	//   72  140:return          
		level1;
	//   73  141:astore_1        
	//*  74  142:aload_0         
		throw level1;
	//   75  143:monitorexit     
	//   76  144:aload_1         
	//   77  145:athrow          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #167 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #168 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Logger[");
	//    4    8:aload_1         
	//    5    9:ldc2            #384 <String "Logger[">
	//    6   12:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(name);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #51  <Field String name>
	//   11   21:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append("]");
	//   13   25:aload_1         
	//   14   26:ldc1            #181 <String "]">
	//   15   28:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
		return stringbuilder.toString();
	//   17   32:aload_1         
	//   18   33:invokevirtual   #187 <Method String StringBuilder.toString()>
	//   19   36:areturn         
	}

	public void trace(String s)
	{
		filterAndLog_0_Or3Plus(FQCN, ((Marker) (null)), Level.TRACE, s, ((Object []) (null)), ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aconst_null     
	//    3    5:getstatic       #318 <Field Level Level.TRACE>
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:aconst_null     
	//    7   11:invokespecial   #225 <Method void filterAndLog_0_Or3Plus(String, Marker, Level, String, Object[], Throwable)>
	//    8   14:return          
	}

	public void trace(String s, Object obj)
	{
		filterAndLog_1(FQCN, ((Marker) (null)), Level.TRACE, s, obj, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aconst_null     
	//    3    5:getstatic       #318 <Field Level Level.TRACE>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #228 <Method void filterAndLog_1(String, Marker, Level, String, Object, Throwable)>
	//    8   14:return          
	}

	public void trace(String s, Object obj, Object obj1)
	{
		filterAndLog_2(FQCN, ((Marker) (null)), Level.TRACE, s, obj, obj1, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aconst_null     
	//    3    5:getstatic       #318 <Field Level Level.TRACE>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aconst_null     
	//    8   12:invokespecial   #231 <Method void filterAndLog_2(String, Marker, Level, String, Object, Object, Throwable)>
	//    9   15:return          
	}

	public void trace(String s, Throwable throwable)
	{
		filterAndLog_0_Or3Plus(FQCN, ((Marker) (null)), Level.TRACE, s, ((Object []) (null)), throwable);
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aconst_null     
	//    3    5:getstatic       #318 <Field Level Level.TRACE>
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:aload_2         
	//    7   11:invokespecial   #225 <Method void filterAndLog_0_Or3Plus(String, Marker, Level, String, Object[], Throwable)>
	//    8   14:return          
	}

	public void trace(String s, Object aobj[])
	{
		filterAndLog_0_Or3Plus(FQCN, ((Marker) (null)), Level.TRACE, s, aobj, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aconst_null     
	//    3    5:getstatic       #318 <Field Level Level.TRACE>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #225 <Method void filterAndLog_0_Or3Plus(String, Marker, Level, String, Object[], Throwable)>
	//    8   14:return          
	}

	public void trace(Marker marker, String s)
	{
		filterAndLog_0_Or3Plus(FQCN, marker, Level.TRACE, s, ((Object []) (null)), ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aload_1         
	//    3    5:getstatic       #318 <Field Level Level.TRACE>
	//    4    8:aload_2         
	//    5    9:aconst_null     
	//    6   10:aconst_null     
	//    7   11:invokespecial   #225 <Method void filterAndLog_0_Or3Plus(String, Marker, Level, String, Object[], Throwable)>
	//    8   14:return          
	}

	public void trace(Marker marker, String s, Object obj)
	{
		filterAndLog_1(FQCN, marker, Level.TRACE, s, obj, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aload_1         
	//    3    5:getstatic       #318 <Field Level Level.TRACE>
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #228 <Method void filterAndLog_1(String, Marker, Level, String, Object, Throwable)>
	//    8   14:return          
	}

	public void trace(Marker marker, String s, Object obj, Object obj1)
	{
		filterAndLog_2(FQCN, marker, Level.TRACE, s, obj, obj1, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aload_1         
	//    3    5:getstatic       #318 <Field Level Level.TRACE>
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aload           4
	//    7   12:aconst_null     
	//    8   13:invokespecial   #231 <Method void filterAndLog_2(String, Marker, Level, String, Object, Object, Throwable)>
	//    9   16:return          
	}

	public void trace(Marker marker, String s, Throwable throwable)
	{
		filterAndLog_0_Or3Plus(FQCN, marker, Level.TRACE, s, ((Object []) (null)), throwable);
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aload_1         
	//    3    5:getstatic       #318 <Field Level Level.TRACE>
	//    4    8:aload_2         
	//    5    9:aconst_null     
	//    6   10:aload_3         
	//    7   11:invokespecial   #225 <Method void filterAndLog_0_Or3Plus(String, Marker, Level, String, Object[], Throwable)>
	//    8   14:return          
	}

	public void trace(Marker marker, String s, Object aobj[])
	{
		filterAndLog_0_Or3Plus(FQCN, marker, Level.TRACE, s, aobj, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aload_1         
	//    3    5:getstatic       #318 <Field Level Level.TRACE>
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #225 <Method void filterAndLog_0_Or3Plus(String, Marker, Level, String, Object[], Throwable)>
	//    8   14:return          
	}

	public void warn(String s)
	{
		filterAndLog_0_Or3Plus(FQCN, ((Marker) (null)), Level.WARN, s, ((Object []) (null)), ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aconst_null     
	//    3    5:getstatic       #324 <Field Level Level.WARN>
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:aconst_null     
	//    7   11:invokespecial   #225 <Method void filterAndLog_0_Or3Plus(String, Marker, Level, String, Object[], Throwable)>
	//    8   14:return          
	}

	public void warn(String s, Object obj)
	{
		filterAndLog_1(FQCN, ((Marker) (null)), Level.WARN, s, obj, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aconst_null     
	//    3    5:getstatic       #324 <Field Level Level.WARN>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #228 <Method void filterAndLog_1(String, Marker, Level, String, Object, Throwable)>
	//    8   14:return          
	}

	public void warn(String s, Object obj, Object obj1)
	{
		filterAndLog_2(FQCN, ((Marker) (null)), Level.WARN, s, obj, obj1, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aconst_null     
	//    3    5:getstatic       #324 <Field Level Level.WARN>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aconst_null     
	//    8   12:invokespecial   #231 <Method void filterAndLog_2(String, Marker, Level, String, Object, Object, Throwable)>
	//    9   15:return          
	}

	public void warn(String s, Throwable throwable)
	{
		filterAndLog_0_Or3Plus(FQCN, ((Marker) (null)), Level.WARN, s, ((Object []) (null)), throwable);
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aconst_null     
	//    3    5:getstatic       #324 <Field Level Level.WARN>
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:aload_2         
	//    7   11:invokespecial   #225 <Method void filterAndLog_0_Or3Plus(String, Marker, Level, String, Object[], Throwable)>
	//    8   14:return          
	}

	public void warn(String s, Object aobj[])
	{
		filterAndLog_0_Or3Plus(FQCN, ((Marker) (null)), Level.WARN, s, aobj, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aconst_null     
	//    3    5:getstatic       #324 <Field Level Level.WARN>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #225 <Method void filterAndLog_0_Or3Plus(String, Marker, Level, String, Object[], Throwable)>
	//    8   14:return          
	}

	public void warn(Marker marker, String s)
	{
		filterAndLog_0_Or3Plus(FQCN, marker, Level.WARN, s, ((Object []) (null)), ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aload_1         
	//    3    5:getstatic       #324 <Field Level Level.WARN>
	//    4    8:aload_2         
	//    5    9:aconst_null     
	//    6   10:aconst_null     
	//    7   11:invokespecial   #225 <Method void filterAndLog_0_Or3Plus(String, Marker, Level, String, Object[], Throwable)>
	//    8   14:return          
	}

	public void warn(Marker marker, String s, Object obj)
	{
		filterAndLog_1(FQCN, marker, Level.WARN, s, obj, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aload_1         
	//    3    5:getstatic       #324 <Field Level Level.WARN>
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #228 <Method void filterAndLog_1(String, Marker, Level, String, Object, Throwable)>
	//    8   14:return          
	}

	public void warn(Marker marker, String s, Object obj, Object obj1)
	{
		filterAndLog_2(FQCN, marker, Level.WARN, s, obj, obj1, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aload_1         
	//    3    5:getstatic       #324 <Field Level Level.WARN>
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aload           4
	//    7   12:aconst_null     
	//    8   13:invokespecial   #231 <Method void filterAndLog_2(String, Marker, Level, String, Object, Object, Throwable)>
	//    9   16:return          
	}

	public void warn(Marker marker, String s, Throwable throwable)
	{
		filterAndLog_0_Or3Plus(FQCN, marker, Level.WARN, s, ((Object []) (null)), throwable);
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aload_1         
	//    3    5:getstatic       #324 <Field Level Level.WARN>
	//    4    8:aload_2         
	//    5    9:aconst_null     
	//    6   10:aload_3         
	//    7   11:invokespecial   #225 <Method void filterAndLog_0_Or3Plus(String, Marker, Level, String, Object[], Throwable)>
	//    8   14:return          
	}

	public void warn(Marker marker, String s, Object aobj[])
	{
		filterAndLog_0_Or3Plus(FQCN, marker, Level.WARN, s, aobj, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #223 <Field String FQCN>
	//    2    4:aload_1         
	//    3    5:getstatic       #324 <Field Level Level.WARN>
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #225 <Method void filterAndLog_0_Or3Plus(String, Marker, Level, String, Object[], Throwable)>
	//    8   14:return          
	}

	private static final int DEFAULT_CHILD_ARRAY_SIZE = 5;
	public static final String FQCN = "ch.qos.logback.classic.Logger";
	private static final long serialVersionUID = 0x92d542c2L;
	private transient AppenderAttachableImpl aai;
	private transient boolean additive;
	private transient List childrenList;
	private transient int effectiveLevelInt;
	private transient Level level;
	final transient LoggerContext loggerContext;
	private String name;
	private transient Logger parent;

	static 
	{
	//    0    0:return          
	}
}
