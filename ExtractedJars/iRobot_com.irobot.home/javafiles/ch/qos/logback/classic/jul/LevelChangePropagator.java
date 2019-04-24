// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.jul;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.spi.LoggerContextListener;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.LifeCycle;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.LogManager;
import java.util.logging.Logger;

// Referenced classes of package ch.qos.logback.classic.jul:
//			JULHelper

public class LevelChangePropagator extends ContextAwareBase
	implements LoggerContextListener, LifeCycle
{

	public LevelChangePropagator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void ContextAwareBase()>
		julLoggerSet = ((Set) (new HashSet()));
	//    2    4:aload_0         
	//    3    5:new             #20  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void HashSet()>
	//    6   12:putfield        #23  <Field Set julLoggerSet>
		isStarted = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #25  <Field boolean isStarted>
		resetJUL = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #27  <Field boolean resetJUL>
	//   13   25:return          
	}

	private void propagate(ch.qos.logback.classic.Logger logger, Level level)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #32  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("Propagating ");
	//    4    8:aload_3         
	//    5    9:ldc1            #35  <String "Propagating ">
	//    6   11:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (level)));
	//    8   15:aload_3         
	//    9   16:aload_2         
	//   10   17:invokevirtual   #42  <Method StringBuilder StringBuilder.append(Object)>
	//   11   20:pop             
		stringbuilder.append(" level on ");
	//   12   21:aload_3         
	//   13   22:ldc1            #44  <String " level on ">
	//   14   24:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		stringbuilder.append(((Object) (logger)));
	//   16   28:aload_3         
	//   17   29:aload_1         
	//   18   30:invokevirtual   #42  <Method StringBuilder StringBuilder.append(Object)>
	//   19   33:pop             
		stringbuilder.append(" onto the JUL framework");
	//   20   34:aload_3         
	//   21   35:ldc1            #46  <String " onto the JUL framework">
	//   22   37:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   23   40:pop             
		addInfo(stringbuilder.toString());
	//   24   41:aload_0         
	//   25   42:aload_3         
	//   26   43:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   27   46:invokevirtual   #54  <Method void addInfo(String)>
		logger = ((ch.qos.logback.classic.Logger) (JULHelper.asJULLogger(logger)));
	//   28   49:aload_1         
	//   29   50:invokestatic    #60  <Method Logger JULHelper.asJULLogger(ch.qos.logback.classic.Logger)>
	//   30   53:astore_1        
		julLoggerSet.add(((Object) (logger)));
	//   31   54:aload_0         
	//   32   55:getfield        #23  <Field Set julLoggerSet>
	//   33   58:aload_1         
	//   34   59:invokeinterface #66  <Method boolean Set.add(Object)>
	//   35   64:pop             
		((Logger) (logger)).setLevel(JULHelper.asJULLevel(level));
	//   36   65:aload_1         
	//   37   66:aload_2         
	//   38   67:invokestatic    #70  <Method java.util.logging.Level JULHelper.asJULLevel(Level)>
	//   39   70:invokevirtual   #76  <Method void Logger.setLevel(java.util.logging.Level)>
	//   40   73:return          
	}

	private void propagateExistingLoggerLevels()
	{
		Iterator iterator = ((LoggerContext)context).getLoggerList().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field ch.qos.logback.core.Context context>
	//    2    4:checkcast       #83  <Class LoggerContext>
	//    3    7:invokevirtual   #87  <Method List LoggerContext.getLoggerList()>
	//    4   10:invokeinterface #93  <Method Iterator List.iterator()>
	//    5   15:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//    6   16:aload_1         
	//    7   17:invokeinterface #99  <Method boolean Iterator.hasNext()>
	//    8   22:ifeq            54
			ch.qos.logback.classic.Logger logger = (ch.qos.logback.classic.Logger)iterator.next();
	//    9   25:aload_1         
	//   10   26:invokeinterface #103 <Method Object Iterator.next()>
	//   11   31:checkcast       #105 <Class ch.qos.logback.classic.Logger>
	//   12   34:astore_2        
			if(logger.getLevel() != null)
	//*  13   35:aload_2         
	//*  14   36:invokevirtual   #109 <Method Level ch.qos.logback.classic.Logger.getLevel()>
	//*  15   39:ifnull          16
				propagate(logger, logger.getLevel());
	//   16   42:aload_0         
	//   17   43:aload_2         
	//   18   44:aload_2         
	//   19   45:invokevirtual   #109 <Method Level ch.qos.logback.classic.Logger.getLevel()>
	//   20   48:invokespecial   #111 <Method void propagate(ch.qos.logback.classic.Logger, Level)>
		} while(true);
	//   21   51:goto            16
	//   22   54:return          
	}

	public boolean isResetResistant()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isStarted()
	{
		return isStarted;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field boolean isStarted>
	//    2    4:ireturn         
	}

	public void onLevelChange(ch.qos.logback.classic.Logger logger, Level level)
	{
		propagate(logger, level);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #111 <Method void propagate(ch.qos.logback.classic.Logger, Level)>
	//    4    6:return          
	}

	public void onReset(LoggerContext loggercontext)
	{
	//    0    0:return          
	}

	public void onStart(LoggerContext loggercontext)
	{
	//    0    0:return          
	}

	public void onStop(LoggerContext loggercontext)
	{
	//    0    0:return          
	}

	public void resetJULLevels()
	{
		LogManager logmanager = LogManager.getLogManager();
	//    0    0:invokestatic    #124 <Method LogManager LogManager.getLogManager()>
	//    1    3:astore_1        
		Enumeration enumeration = logmanager.getLoggerNames();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #128 <Method Enumeration LogManager.getLoggerNames()>
	//    4    8:astore_2        
		do
		{
			if(!enumeration.hasMoreElements())
				break;
	//    5    9:aload_2         
	//    6   10:invokeinterface #133 <Method boolean Enumeration.hasMoreElements()>
	//    7   15:ifeq            101
			String s = (String)enumeration.nextElement();
	//    8   18:aload_2         
	//    9   19:invokeinterface #136 <Method Object Enumeration.nextElement()>
	//   10   24:checkcast       #138 <Class String>
	//   11   27:astore_3        
			Logger logger = logmanager.getLogger(s);
	//   12   28:aload_1         
	//   13   29:aload_3         
	//   14   30:invokevirtual   #142 <Method Logger LogManager.getLogger(String)>
	//   15   33:astore          4
			if(JULHelper.isRegularNonRootLogger(logger) && logger.getLevel() != null)
	//*  16   35:aload           4
	//*  17   37:invokestatic    #146 <Method boolean JULHelper.isRegularNonRootLogger(Logger)>
	//*  18   40:ifeq            9
	//*  19   43:aload           4
	//*  20   45:invokevirtual   #149 <Method java.util.logging.Level Logger.getLevel()>
	//*  21   48:ifnull          9
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   22   51:new             #32  <Class StringBuilder>
	//   23   54:dup             
	//   24   55:invokespecial   #33  <Method void StringBuilder()>
	//   25   58:astore          5
				stringbuilder.append("Setting level of jul logger [");
	//   26   60:aload           5
	//   27   62:ldc1            #151 <String "Setting level of jul logger [">
	//   28   64:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   29   67:pop             
				stringbuilder.append(s);
	//   30   68:aload           5
	//   31   70:aload_3         
	//   32   71:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   33   74:pop             
				stringbuilder.append("] to null");
	//   34   75:aload           5
	//   35   77:ldc1            #153 <String "] to null">
	//   36   79:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   37   82:pop             
				addInfo(stringbuilder.toString());
	//   38   83:aload_0         
	//   39   84:aload           5
	//   40   86:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   41   89:invokevirtual   #54  <Method void addInfo(String)>
				logger.setLevel(((java.util.logging.Level) (null)));
	//   42   92:aload           4
	//   43   94:aconst_null     
	//   44   95:invokevirtual   #76  <Method void Logger.setLevel(java.util.logging.Level)>
			}
		} while(true);
	//   45   98:goto            9
	//   46  101:return          
	}

	public void setResetJUL(boolean flag)
	{
		resetJUL = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #27  <Field boolean resetJUL>
	//    3    5:return          
	}

	public void start()
	{
		if(resetJUL)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field boolean resetJUL>
	//*   2    4:ifeq            11
			resetJULLevels();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #158 <Method void resetJULLevels()>
		propagateExistingLoggerLevels();
	//    5   11:aload_0         
	//    6   12:invokespecial   #160 <Method void propagateExistingLoggerLevels()>
		isStarted = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #25  <Field boolean isStarted>
	//   10   20:return          
	}

	public void stop()
	{
		isStarted = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #25  <Field boolean isStarted>
	//    3    5:return          
	}

	boolean isStarted;
	private Set julLoggerSet;
	boolean resetJUL;
}
