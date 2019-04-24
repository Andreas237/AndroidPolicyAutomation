// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic;

import ch.qos.logback.classic.android.AndroidManifestPropertiesUtil;
import ch.qos.logback.classic.spi.LoggerComparator;
import ch.qos.logback.classic.spi.LoggerContextListener;
import ch.qos.logback.classic.spi.LoggerContextVO;
import ch.qos.logback.classic.spi.TurboFilterList;
import ch.qos.logback.classic.turbo.TurboFilter;
import ch.qos.logback.classic.util.LoggerNameUtil;
import ch.qos.logback.core.ContextBase;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.spi.FilterReply;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.status.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.*;

// Referenced classes of package ch.qos.logback.classic:
//			Logger, Level

public class LoggerContext extends ContextBase
	implements LifeCycle, ILoggerFactory
{

	public LoggerContext()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void ContextBase()>
		noAppenderWarning = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #36  <Field int noAppenderWarning>
	//    5    9:aload_0         
	//    6   10:new             #38  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #39  <Method void ArrayList()>
	//    9   17:putfield        #41  <Field List loggerContextListenerList>
	//   10   20:aload_0         
	//   11   21:new             #43  <Class TurboFilterList>
	//   12   24:dup             
	//   13   25:invokespecial   #44  <Method void TurboFilterList()>
	//   14   28:putfield        #46  <Field TurboFilterList turboFilterList>
		packagingDataEnabled = true;
	//   15   31:aload_0         
	//   16   32:iconst_1        
	//   17   33:putfield        #48  <Field boolean packagingDataEnabled>
		androidPropsInitialized = false;
	//   18   36:aload_0         
	//   19   37:iconst_0        
	//   20   38:putfield        #50  <Field boolean androidPropsInitialized>
		maxCallerDataDepth = 8;
	//   21   41:aload_0         
	//   22   42:bipush          8
	//   23   44:putfield        #52  <Field int maxCallerDataDepth>
		resetCount = 0;
	//   24   47:aload_0         
	//   25   48:iconst_0        
	//   26   49:putfield        #54  <Field int resetCount>
		loggerCache = ((Map) (new ConcurrentHashMap()));
	//   27   52:aload_0         
	//   28   53:new             #56  <Class ConcurrentHashMap>
	//   29   56:dup             
	//   30   57:invokespecial   #57  <Method void ConcurrentHashMap()>
	//   31   60:putfield        #59  <Field Map loggerCache>
		loggerContextRemoteView = new LoggerContextVO(this);
	//   32   63:aload_0         
	//   33   64:new             #61  <Class LoggerContextVO>
	//   34   67:dup             
	//   35   68:aload_0         
	//   36   69:invokespecial   #64  <Method void LoggerContextVO(LoggerContext)>
	//   37   72:putfield        #66  <Field LoggerContextVO loggerContextRemoteView>
	//   38   75:aload_0         
	//   39   76:new             #68  <Class ch.qos.logback.classic.Logger>
	//   40   79:dup             
	//   41   80:ldc1            #70  <String "ROOT">
	//   42   82:aconst_null     
	//   43   83:aload_0         
	//   44   84:invokespecial   #73  <Method void ch.qos.logback.classic.Logger(String, ch.qos.logback.classic.Logger, LoggerContext)>
	//   45   87:putfield        #75  <Field ch.qos.logback.classic.Logger root>
		root.setLevel(Level.DEBUG);
	//   46   90:aload_0         
	//   47   91:getfield        #75  <Field ch.qos.logback.classic.Logger root>
	//   48   94:getstatic       #81  <Field Level Level.DEBUG>
	//   49   97:invokevirtual   #85  <Method void Logger.setLevel(Level)>
		loggerCache.put("ROOT", ((Object) (root)));
	//   50  100:aload_0         
	//   51  101:getfield        #59  <Field Map loggerCache>
	//   52  104:ldc1            #70  <String "ROOT">
	//   53  106:aload_0         
	//   54  107:getfield        #75  <Field ch.qos.logback.classic.Logger root>
	//   55  110:invokeinterface #91  <Method Object Map.put(Object, Object)>
	//   56  115:pop             
		initEvaluatorMap();
	//   57  116:aload_0         
	//   58  117:invokevirtual   #94  <Method void initEvaluatorMap()>
		size = 1;
	//   59  120:aload_0         
	//   60  121:iconst_1        
	//   61  122:putfield        #96  <Field int size>
		frameworkPackages = ((List) (new ArrayList()));
	//   62  125:aload_0         
	//   63  126:new             #38  <Class ArrayList>
	//   64  129:dup             
	//   65  130:invokespecial   #39  <Method void ArrayList()>
	//   66  133:putfield        #98  <Field List frameworkPackages>
	//   67  136:return          
	}

	private void fireOnReset()
	{
		for(Iterator iterator = loggerContextListenerList.iterator(); iterator.hasNext(); ((LoggerContextListener)iterator.next()).onReset(this));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List loggerContextListenerList>
	//    2    4:invokeinterface #106 <Method Iterator List.iterator()>
	//    3    9:astore_1        
	//    4   10:aload_1         
	//    5   11:invokeinterface #112 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            37
	//    7   19:aload_1         
	//    8   20:invokeinterface #116 <Method Object Iterator.next()>
	//    9   25:checkcast       #118 <Class LoggerContextListener>
	//   10   28:aload_0         
	//   11   29:invokeinterface #121 <Method void LoggerContextListener.onReset(LoggerContext)>
	//*  12   34:goto            10
	//   13   37:return          
	}

	private void fireOnStart()
	{
		for(Iterator iterator = loggerContextListenerList.iterator(); iterator.hasNext(); ((LoggerContextListener)iterator.next()).onStart(this));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List loggerContextListenerList>
	//    2    4:invokeinterface #106 <Method Iterator List.iterator()>
	//    3    9:astore_1        
	//    4   10:aload_1         
	//    5   11:invokeinterface #112 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            37
	//    7   19:aload_1         
	//    8   20:invokeinterface #116 <Method Object Iterator.next()>
	//    9   25:checkcast       #118 <Class LoggerContextListener>
	//   10   28:aload_0         
	//   11   29:invokeinterface #125 <Method void LoggerContextListener.onStart(LoggerContext)>
	//*  12   34:goto            10
	//   13   37:return          
	}

	private void fireOnStop()
	{
		for(Iterator iterator = loggerContextListenerList.iterator(); iterator.hasNext(); ((LoggerContextListener)iterator.next()).onStop(this));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List loggerContextListenerList>
	//    2    4:invokeinterface #106 <Method Iterator List.iterator()>
	//    3    9:astore_1        
	//    4   10:aload_1         
	//    5   11:invokeinterface #112 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            37
	//    7   19:aload_1         
	//    8   20:invokeinterface #116 <Method Object Iterator.next()>
	//    9   25:checkcast       #118 <Class LoggerContextListener>
	//   10   28:aload_0         
	//   11   29:invokeinterface #129 <Method void LoggerContextListener.onStop(LoggerContext)>
	//*  12   34:goto            10
	//   13   37:return          
	}

	private void incSize()
	{
		size = size + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #96  <Field int size>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #96  <Field int size>
	//    6   10:return          
	}

	private boolean isSpecialKey(String s)
	{
		return s.equals("PACKAGE_NAME") || s.equals("VERSION_NAME") || s.equals("VERSION_CODE") || s.equals("EXT_DIR") || s.equals("DATA_DIR");
	//    0    0:aload_1         
	//    1    1:ldc1            #134 <String "PACKAGE_NAME">
	//    2    3:invokevirtual   #140 <Method boolean String.equals(Object)>
	//    3    6:ifne            50
	//    4    9:aload_1         
	//    5   10:ldc1            #142 <String "VERSION_NAME">
	//    6   12:invokevirtual   #140 <Method boolean String.equals(Object)>
	//    7   15:ifne            50
	//    8   18:aload_1         
	//    9   19:ldc1            #144 <String "VERSION_CODE">
	//   10   21:invokevirtual   #140 <Method boolean String.equals(Object)>
	//   11   24:ifne            50
	//   12   27:aload_1         
	//   13   28:ldc1            #146 <String "EXT_DIR">
	//   14   30:invokevirtual   #140 <Method boolean String.equals(Object)>
	//   15   33:ifne            50
	//   16   36:aload_1         
	//   17   37:ldc1            #148 <String "DATA_DIR">
	//   18   39:invokevirtual   #140 <Method boolean String.equals(Object)>
	//   19   42:ifeq            48
	//   20   45:goto            50
	//   21   48:iconst_0        
	//   22   49:ireturn         
	//   23   50:iconst_1        
	//   24   51:ireturn         
	}

	private void resetAllListeners()
	{
		loggerContextListenerList.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List loggerContextListenerList>
	//    2    4:invokeinterface #152 <Method void List.clear()>
	//    3    9:return          
	}

	private void resetListenersExceptResetResistant()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #38  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void ArrayList()>
	//    3    7:astore_1        
		Iterator iterator = loggerContextListenerList.iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #41  <Field List loggerContextListenerList>
	//    6   12:invokeinterface #106 <Method Iterator List.iterator()>
	//    7   17:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   18:aload_2         
	//    9   19:invokeinterface #112 <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            57
			LoggerContextListener loggercontextlistener = (LoggerContextListener)iterator.next();
	//   11   27:aload_2         
	//   12   28:invokeinterface #116 <Method Object Iterator.next()>
	//   13   33:checkcast       #118 <Class LoggerContextListener>
	//   14   36:astore_3        
			if(loggercontextlistener.isResetResistant())
	//*  15   37:aload_3         
	//*  16   38:invokeinterface #156 <Method boolean LoggerContextListener.isResetResistant()>
	//*  17   43:ifeq            18
				((List) (arraylist)).add(((Object) (loggercontextlistener)));
	//   18   46:aload_1         
	//   19   47:aload_3         
	//   20   48:invokeinterface #159 <Method boolean List.add(Object)>
	//   21   53:pop             
		} while(true);
	//   22   54:goto            18
		loggerContextListenerList.retainAll(((java.util.Collection) (arraylist)));
	//   23   57:aload_0         
	//   24   58:getfield        #41  <Field List loggerContextListenerList>
	//   25   61:aload_1         
	//   26   62:invokeinterface #163 <Method boolean List.retainAll(java.util.Collection)>
	//   27   67:pop             
	//   28   68:return          
	}

	private void resetStatusListeners()
	{
		StatusManager statusmanager = getStatusManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #168 <Method StatusManager getStatusManager()>
	//    2    4:astore_1        
		for(Iterator iterator = statusmanager.getCopyOfStatusListenerList().iterator(); iterator.hasNext(); statusmanager.remove((StatusListener)iterator.next()));
	//    3    5:aload_1         
	//    4    6:invokeinterface #174 <Method List StatusManager.getCopyOfStatusListenerList()>
	//    5   11:invokeinterface #106 <Method Iterator List.iterator()>
	//    6   16:astore_2        
	//    7   17:aload_2         
	//    8   18:invokeinterface #112 <Method boolean Iterator.hasNext()>
	//    9   23:ifeq            44
	//   10   26:aload_1         
	//   11   27:aload_2         
	//   12   28:invokeinterface #116 <Method Object Iterator.next()>
	//   13   33:checkcast       #176 <Class StatusListener>
	//   14   36:invokeinterface #180 <Method void StatusManager.remove(StatusListener)>
	//*  15   41:goto            17
	//   16   44:return          
	}

	private void updateLoggerContextVO()
	{
		loggerContextRemoteView = new LoggerContextVO(this);
	//    0    0:aload_0         
	//    1    1:new             #61  <Class LoggerContextVO>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #64  <Method void LoggerContextVO(LoggerContext)>
	//    5    9:putfield        #66  <Field LoggerContextVO loggerContextRemoteView>
	//    6   12:return          
	}

	public void addListener(LoggerContextListener loggercontextlistener)
	{
		loggerContextListenerList.add(((Object) (loggercontextlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List loggerContextListenerList>
	//    2    4:aload_1         
	//    3    5:invokeinterface #159 <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void addTurboFilter(TurboFilter turbofilter)
	{
		turboFilterList.add(((Object) (turbofilter)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field TurboFilterList turboFilterList>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #186 <Method boolean TurboFilterList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public ch.qos.logback.classic.Logger exists(String s)
	{
		return (ch.qos.logback.classic.Logger)loggerCache.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Map loggerCache>
	//    2    4:aload_1         
	//    3    5:invokeinterface #192 <Method Object Map.get(Object)>
	//    4   10:checkcast       #68  <Class ch.qos.logback.classic.Logger>
	//    5   13:areturn         
	}

	void fireOnLevelChange(ch.qos.logback.classic.Logger logger, Level level)
	{
		for(Iterator iterator = loggerContextListenerList.iterator(); iterator.hasNext(); ((LoggerContextListener)iterator.next()).onLevelChange(logger, level));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List loggerContextListenerList>
	//    2    4:invokeinterface #106 <Method Iterator List.iterator()>
	//    3    9:astore_3        
	//    4   10:aload_3         
	//    5   11:invokeinterface #112 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            38
	//    7   19:aload_3         
	//    8   20:invokeinterface #116 <Method Object Iterator.next()>
	//    9   25:checkcast       #118 <Class LoggerContextListener>
	//   10   28:aload_1         
	//   11   29:aload_2         
	//   12   30:invokeinterface #197 <Method void LoggerContextListener.onLevelChange(ch.qos.logback.classic.Logger, Level)>
	//*  13   35:goto            10
	//   14   38:return          
	}

	public List getCopyOfListenerList()
	{
		return ((List) (new ArrayList(((java.util.Collection) (loggerContextListenerList)))));
	//    0    0:new             #38  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field List loggerContextListenerList>
	//    4    8:invokespecial   #201 <Method void ArrayList(java.util.Collection)>
	//    5   11:areturn         
	}

	public List getFrameworkPackages()
	{
		return frameworkPackages;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field List frameworkPackages>
	//    2    4:areturn         
	}

	public final ch.qos.logback.classic.Logger getLogger(Class class1)
	{
		return getLogger(class1.getName());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #213 <Method String Class.getName()>
	//    3    5:invokevirtual   #215 <Method ch.qos.logback.classic.Logger getLogger(String)>
	//    4    8:areturn         
	}

	public final ch.qos.logback.classic.Logger getLogger(String s)
	{
		int i;
		ch.qos.logback.classic.Logger logger2;
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("name argument cannot be null");
	//    2    4:new             #217 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #219 <String "name argument cannot be null">
	//    5   10:invokespecial   #222 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		if("ROOT".equalsIgnoreCase(s))
	//*   7   14:ldc1            #70  <String "ROOT">
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #225 <Method boolean String.equalsIgnoreCase(String)>
	//*  10   20:ifeq            28
			return root;
	//   11   23:aload_0         
	//   12   24:getfield        #75  <Field ch.qos.logback.classic.Logger root>
	//   13   27:areturn         
		logger2 = root;
	//   14   28:aload_0         
	//   15   29:getfield        #75  <Field ch.qos.logback.classic.Logger root>
	//   16   32:astore          4
		ch.qos.logback.classic.Logger logger = (ch.qos.logback.classic.Logger)loggerCache.get(((Object) (s)));
	//   17   34:aload_0         
	//   18   35:getfield        #59  <Field Map loggerCache>
	//   19   38:aload_1         
	//   20   39:invokeinterface #192 <Method Object Map.get(Object)>
	//   21   44:checkcast       #68  <Class ch.qos.logback.classic.Logger>
	//   22   47:astore_3        
		if(logger != null)
	//*  23   48:aload_3         
	//*  24   49:ifnull          54
			return logger;
	//   25   52:aload_3         
	//   26   53:areturn         
		i = 0;
	//   27   54:iconst_0        
	//   28   55:istore_2        
_L2:
		String s1;
		i = LoggerNameUtil.getSeparatorIndexOf(s, i);
	//   29   56:aload_1         
	//   30   57:iload_2         
	//   31   58:invokestatic    #231 <Method int LoggerNameUtil.getSeparatorIndexOf(String, int)>
	//   32   61:istore_2        
		if(i == -1)
	//*  33   62:iload_2         
	//*  34   63:iconst_m1       
	//*  35   64:icmpne          73
			s1 = s;
	//   36   67:aload_1         
	//   37   68:astore          5
		else
	//*  38   70:goto            81
			s1 = s.substring(0, i);
	//   39   73:aload_1         
	//   40   74:iconst_0        
	//   41   75:iload_2         
	//   42   76:invokevirtual   #235 <Method String String.substring(int, int)>
	//   43   79:astore          5
		logger2;
	//   44   81:aload           4
		JVM INSTR monitorenter ;
	//   45   83:monitorenter    
		ch.qos.logback.classic.Logger logger3 = logger2.getChildByName(s1);
	//   46   84:aload           4
	//   47   86:aload           5
	//   48   88:invokevirtual   #238 <Method ch.qos.logback.classic.Logger Logger.getChildByName(String)>
	//   49   91:astore          6
		ch.qos.logback.classic.Logger logger1;
		logger1 = logger3;
	//   50   93:aload           6
	//   51   95:astore_3        
		if(logger3 != null)
			break MISSING_BLOCK_LABEL_126;
	//   52   96:aload           6
	//   53   98:ifnonnull       126
		logger1 = logger2.createChildByName(s1);
	//   54  101:aload           4
	//   55  103:aload           5
	//   56  105:invokevirtual   #241 <Method ch.qos.logback.classic.Logger Logger.createChildByName(String)>
	//   57  108:astore_3        
		loggerCache.put(((Object) (s1)), ((Object) (logger1)));
	//   58  109:aload_0         
	//   59  110:getfield        #59  <Field Map loggerCache>
	//   60  113:aload           5
	//   61  115:aload_3         
	//   62  116:invokeinterface #91  <Method Object Map.put(Object, Object)>
	//   63  121:pop             
		incSize();
	//   64  122:aload_0         
	//   65  123:invokespecial   #243 <Method void incSize()>
		logger2;
	//   66  126:aload           4
		JVM INSTR monitorexit ;
	//   67  128:monitorexit     
		if(i == -1)
	//*  68  129:iload_2         
	//*  69  130:iconst_m1       
	//*  70  131:icmpne          142
			return logger1;
	//   71  134:aload_3         
	//   72  135:areturn         
		break MISSING_BLOCK_LABEL_142;
		s;
	//   73  136:astore_1        
		logger2;
	//   74  137:aload           4
		JVM INSTR monitorexit ;
	//   75  139:monitorexit     
		throw s;
	//   76  140:aload_1         
	//   77  141:athrow          
		i++;
	//   78  142:iload_2         
	//   79  143:iconst_1        
	//   80  144:iadd            
	//   81  145:istore_2        
		logger2 = logger1;
	//   82  146:aload_3         
	//   83  147:astore          4
		if(true) goto _L2; else goto _L1
	//   84  149:goto            56
_L1:
	}

	public volatile Logger getLogger(String s)
	{
		return ((Logger) (getLogger(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #215 <Method ch.qos.logback.classic.Logger getLogger(String)>
	//    3    5:areturn         
	}

	public LoggerContextVO getLoggerContextRemoteView()
	{
		return loggerContextRemoteView;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field LoggerContextVO loggerContextRemoteView>
	//    2    4:areturn         
	}

	public List getLoggerList()
	{
		ArrayList arraylist = new ArrayList(loggerCache.values());
	//    0    0:new             #38  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #59  <Field Map loggerCache>
	//    4    8:invokeinterface #251 <Method java.util.Collection Map.values()>
	//    5   13:invokespecial   #201 <Method void ArrayList(java.util.Collection)>
	//    6   16:astore_1        
		Collections.sort(((List) (arraylist)), ((java.util.Comparator) (new LoggerComparator())));
	//    7   17:aload_1         
	//    8   18:new             #253 <Class LoggerComparator>
	//    9   21:dup             
	//   10   22:invokespecial   #254 <Method void LoggerComparator()>
	//   11   25:invokestatic    #260 <Method void Collections.sort(List, java.util.Comparator)>
		return ((List) (arraylist));
	//   12   28:aload_1         
	//   13   29:areturn         
	}

	public int getMaxCallerDataDepth()
	{
		return maxCallerDataDepth;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int maxCallerDataDepth>
	//    2    4:ireturn         
	}

	public String getProperty(String s)
	{
		if(isSpecialKey(s))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #269 <Method boolean isSpecialKey(String)>
	//*   3    5:ifeq            53
			try
			{
				if(!androidPropsInitialized)
	//*   4    8:aload_0         
	//*   5    9:getfield        #50  <Field boolean androidPropsInitialized>
	//*   6   12:ifne            53
				{
					androidPropsInitialized = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #50  <Field boolean androidPropsInitialized>
					AndroidManifestPropertiesUtil.setAndroidProperties(((ch.qos.logback.core.Context) (this)));
	//   10   20:aload_0         
	//   11   21:invokestatic    #275 <Method void AndroidManifestPropertiesUtil.setAndroidProperties(ch.qos.logback.core.Context)>
				}
			}
	//*  12   24:goto            53
			catch(JoranException joranexception)
	//*  13   27:astore_2        
			{
				getStatusManager().add(((ch.qos.logback.core.status.Status) (new WarnStatus("Can't set manifest properties", ((Object) (joranexception))))));
	//   14   28:aload_0         
	//   15   29:invokevirtual   #168 <Method StatusManager getStatusManager()>
	//   16   32:new             #277 <Class WarnStatus>
	//   17   35:dup             
	//   18   36:ldc2            #279 <String "Can't set manifest properties">
	//   19   39:aload_2         
	//   20   40:invokespecial   #282 <Method void WarnStatus(String, Object)>
	//   21   43:invokeinterface #285 <Method void StatusManager.add(ch.qos.logback.core.status.Status)>
				androidPropsInitialized = false;
	//   22   48:aload_0         
	//   23   49:iconst_0        
	//   24   50:putfield        #50  <Field boolean androidPropsInitialized>
			}
		return super.getProperty(s);
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:invokespecial   #287 <Method String ContextBase.getProperty(String)>
	//   28   58:areturn         
	}

	final FilterReply getTurboFilterChainDecision_0_3OrMore(Marker marker, ch.qos.logback.classic.Logger logger, Level level, String s, Object aobj[], Throwable throwable)
	{
		if(turboFilterList.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field TurboFilterList turboFilterList>
	//*   2    4:invokevirtual   #291 <Method int TurboFilterList.size()>
	//*   3    7:ifne            14
			return FilterReply.NEUTRAL;
	//    4   10:getstatic       #297 <Field FilterReply FilterReply.NEUTRAL>
	//    5   13:areturn         
		else
			return turboFilterList.getTurboFilterChainDecision(marker, logger, level, s, aobj, throwable);
	//    6   14:aload_0         
	//    7   15:getfield        #46  <Field TurboFilterList turboFilterList>
	//    8   18:aload_1         
	//    9   19:aload_2         
	//   10   20:aload_3         
	//   11   21:aload           4
	//   12   23:aload           5
	//   13   25:aload           6
	//   14   27:invokevirtual   #300 <Method FilterReply TurboFilterList.getTurboFilterChainDecision(Marker, ch.qos.logback.classic.Logger, Level, String, Object[], Throwable)>
	//   15   30:areturn         
	}

	final FilterReply getTurboFilterChainDecision_1(Marker marker, ch.qos.logback.classic.Logger logger, Level level, String s, Object obj, Throwable throwable)
	{
		if(turboFilterList.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field TurboFilterList turboFilterList>
	//*   2    4:invokevirtual   #291 <Method int TurboFilterList.size()>
	//*   3    7:ifne            14
			return FilterReply.NEUTRAL;
	//    4   10:getstatic       #297 <Field FilterReply FilterReply.NEUTRAL>
	//    5   13:areturn         
		else
			return turboFilterList.getTurboFilterChainDecision(marker, logger, level, s, new Object[] {
				obj
			}, throwable);
	//    6   14:aload_0         
	//    7   15:getfield        #46  <Field TurboFilterList turboFilterList>
	//    8   18:aload_1         
	//    9   19:aload_2         
	//   10   20:aload_3         
	//   11   21:aload           4
	//   12   23:iconst_1        
	//   13   24:anewarray       Object[]
	//   14   27:dup             
	//   15   28:iconst_0        
	//   16   29:aload           5
	//   17   31:aastore         
	//   18   32:aload           6
	//   19   34:invokevirtual   #300 <Method FilterReply TurboFilterList.getTurboFilterChainDecision(Marker, ch.qos.logback.classic.Logger, Level, String, Object[], Throwable)>
	//   20   37:areturn         
	}

	final FilterReply getTurboFilterChainDecision_2(Marker marker, ch.qos.logback.classic.Logger logger, Level level, String s, Object obj, Object obj1, Throwable throwable)
	{
		if(turboFilterList.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field TurboFilterList turboFilterList>
	//*   2    4:invokevirtual   #291 <Method int TurboFilterList.size()>
	//*   3    7:ifne            14
			return FilterReply.NEUTRAL;
	//    4   10:getstatic       #297 <Field FilterReply FilterReply.NEUTRAL>
	//    5   13:areturn         
		else
			return turboFilterList.getTurboFilterChainDecision(marker, logger, level, s, new Object[] {
				obj, obj1
			}, throwable);
	//    6   14:aload_0         
	//    7   15:getfield        #46  <Field TurboFilterList turboFilterList>
	//    8   18:aload_1         
	//    9   19:aload_2         
	//   10   20:aload_3         
	//   11   21:aload           4
	//   12   23:iconst_2        
	//   13   24:anewarray       Object[]
	//   14   27:dup             
	//   15   28:iconst_0        
	//   16   29:aload           5
	//   17   31:aastore         
	//   18   32:dup             
	//   19   33:iconst_1        
	//   20   34:aload           6
	//   21   36:aastore         
	//   22   37:aload           7
	//   23   39:invokevirtual   #300 <Method FilterReply TurboFilterList.getTurboFilterChainDecision(Marker, ch.qos.logback.classic.Logger, Level, String, Object[], Throwable)>
	//   24   42:areturn         
	}

	public TurboFilterList getTurboFilterList()
	{
		return turboFilterList;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field TurboFilterList turboFilterList>
	//    2    4:areturn         
	}

	void initEvaluatorMap()
	{
		putObject("EVALUATOR_MAP", ((Object) (new HashMap())));
	//    0    0:aload_0         
	//    1    1:ldc2            #310 <String "EVALUATOR_MAP">
	//    2    4:new             #312 <Class HashMap>
	//    3    7:dup             
	//    4    8:invokespecial   #313 <Method void HashMap()>
	//    5   11:invokevirtual   #316 <Method void putObject(String, Object)>
	//    6   14:return          
	}

	public boolean isPackagingDataEnabled()
	{
		return packagingDataEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field boolean packagingDataEnabled>
	//    2    4:ireturn         
	}

	final void noAppenderDefinedWarning(ch.qos.logback.classic.Logger logger)
	{
		int i = noAppenderWarning;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int noAppenderWarning>
	//    2    4:istore_2        
		noAppenderWarning = i + 1;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:putfield        #36  <Field int noAppenderWarning>
		if(i == 0)
	//*   8   12:iload_2         
	//*   9   13:ifne            96
		{
			StatusManager statusmanager = getStatusManager();
	//   10   16:aload_0         
	//   11   17:invokevirtual   #168 <Method StatusManager getStatusManager()>
	//   12   20:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   13   21:new             #321 <Class StringBuilder>
	//   14   24:dup             
	//   15   25:invokespecial   #322 <Method void StringBuilder()>
	//   16   28:astore          4
			stringbuilder.append("No appenders present in context [");
	//   17   30:aload           4
	//   18   32:ldc2            #324 <String "No appenders present in context [">
	//   19   35:invokevirtual   #328 <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
			stringbuilder.append(getName());
	//   21   39:aload           4
	//   22   41:aload_0         
	//   23   42:invokevirtual   #329 <Method String getName()>
	//   24   45:invokevirtual   #328 <Method StringBuilder StringBuilder.append(String)>
	//   25   48:pop             
			stringbuilder.append("] for logger [");
	//   26   49:aload           4
	//   27   51:ldc2            #331 <String "] for logger [">
	//   28   54:invokevirtual   #328 <Method StringBuilder StringBuilder.append(String)>
	//   29   57:pop             
			stringbuilder.append(logger.getName());
	//   30   58:aload           4
	//   31   60:aload_1         
	//   32   61:invokevirtual   #332 <Method String Logger.getName()>
	//   33   64:invokevirtual   #328 <Method StringBuilder StringBuilder.append(String)>
	//   34   67:pop             
			stringbuilder.append("].");
	//   35   68:aload           4
	//   36   70:ldc2            #334 <String "].">
	//   37   73:invokevirtual   #328 <Method StringBuilder StringBuilder.append(String)>
	//   38   76:pop             
			statusmanager.add(((ch.qos.logback.core.status.Status) (new WarnStatus(stringbuilder.toString(), ((Object) (logger))))));
	//   39   77:aload_3         
	//   40   78:new             #277 <Class WarnStatus>
	//   41   81:dup             
	//   42   82:aload           4
	//   43   84:invokevirtual   #337 <Method String StringBuilder.toString()>
	//   44   87:aload_1         
	//   45   88:invokespecial   #282 <Method void WarnStatus(String, Object)>
	//   46   91:invokeinterface #285 <Method void StatusManager.add(ch.qos.logback.core.status.Status)>
		}
	//   47   96:return          
	}

	public void putProperty(String s, String s1)
	{
		super.putProperty(s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #341 <Method void ContextBase.putProperty(String, String)>
		updateLoggerContextVO();
	//    4    6:aload_0         
	//    5    7:invokespecial   #343 <Method void updateLoggerContextVO()>
	//    6   10:return          
	}

	public void removeListener(LoggerContextListener loggercontextlistener)
	{
		loggerContextListenerList.remove(((Object) (loggercontextlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List loggerContextListenerList>
	//    2    4:aload_1         
	//    3    5:invokeinterface #346 <Method boolean List.remove(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void reset()
	{
		resetCount = resetCount + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #54  <Field int resetCount>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #54  <Field int resetCount>
		super.reset();
	//    6   10:aload_0         
	//    7   11:invokespecial   #349 <Method void ContextBase.reset()>
		initEvaluatorMap();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #94  <Method void initEvaluatorMap()>
		root.recursiveReset();
	//   10   18:aload_0         
	//   11   19:getfield        #75  <Field ch.qos.logback.classic.Logger root>
	//   12   22:invokevirtual   #352 <Method void Logger.recursiveReset()>
		resetTurboFilterList();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #355 <Method void resetTurboFilterList()>
		fireOnReset();
	//   15   29:aload_0         
	//   16   30:invokespecial   #357 <Method void fireOnReset()>
		resetListenersExceptResetResistant();
	//   17   33:aload_0         
	//   18   34:invokespecial   #359 <Method void resetListenersExceptResetResistant()>
		resetStatusListeners();
	//   19   37:aload_0         
	//   20   38:invokespecial   #361 <Method void resetStatusListeners()>
	//   21   41:return          
	}

	public void resetTurboFilterList()
	{
		for(Iterator iterator = turboFilterList.iterator(); iterator.hasNext(); ((TurboFilter)iterator.next()).stop());
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field TurboFilterList turboFilterList>
	//    2    4:invokevirtual   #362 <Method Iterator TurboFilterList.iterator()>
	//    3    7:astore_1        
	//    4    8:aload_1         
	//    5    9:invokeinterface #112 <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            32
	//    7   17:aload_1         
	//    8   18:invokeinterface #116 <Method Object Iterator.next()>
	//    9   23:checkcast       #364 <Class TurboFilter>
	//   10   26:invokevirtual   #367 <Method void TurboFilter.stop()>
	//*  11   29:goto            8
		turboFilterList.clear();
	//   12   32:aload_0         
	//   13   33:getfield        #46  <Field TurboFilterList turboFilterList>
	//   14   36:invokevirtual   #368 <Method void TurboFilterList.clear()>
	//   15   39:return          
	}

	public void setMaxCallerDataDepth(int i)
	{
		maxCallerDataDepth = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #52  <Field int maxCallerDataDepth>
	//    3    5:return          
	}

	public void setName(String s)
	{
		super.setName(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #373 <Method void ContextBase.setName(String)>
		updateLoggerContextVO();
	//    3    5:aload_0         
	//    4    6:invokespecial   #343 <Method void updateLoggerContextVO()>
	//    5    9:return          
	}

	public void setPackagingDataEnabled(boolean flag)
	{
		packagingDataEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #48  <Field boolean packagingDataEnabled>
	//    3    5:return          
	}

	int size()
	{
		return size;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field int size>
	//    2    4:ireturn         
	}

	public void start()
	{
		super.start();
	//    0    0:aload_0         
	//    1    1:invokespecial   #378 <Method void ContextBase.start()>
		fireOnStart();
	//    2    4:aload_0         
	//    3    5:invokespecial   #380 <Method void fireOnStart()>
	//    4    8:return          
	}

	public void stop()
	{
		reset();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #381 <Method void reset()>
		fireOnStop();
	//    2    4:aload_0         
	//    3    5:invokespecial   #383 <Method void fireOnStop()>
		resetAllListeners();
	//    4    8:aload_0         
	//    5    9:invokespecial   #385 <Method void resetAllListeners()>
		super.stop();
	//    6   12:aload_0         
	//    7   13:invokespecial   #386 <Method void ContextBase.stop()>
	//    8   16:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #321 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #322 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(((Object)this).getClass().getName());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #390 <Method Class Object.getClass()>
	//    7   13:invokevirtual   #213 <Method String Class.getName()>
	//    8   16:invokevirtual   #328 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append("[");
	//   10   20:aload_1         
	//   11   21:ldc2            #392 <String "[">
	//   12   24:invokevirtual   #328 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		stringbuilder.append(getName());
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:invokevirtual   #329 <Method String getName()>
	//   17   33:invokevirtual   #328 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
		stringbuilder.append("]");
	//   19   37:aload_1         
	//   20   38:ldc2            #394 <String "]">
	//   21   41:invokevirtual   #328 <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
		return stringbuilder.toString();
	//   23   45:aload_1         
	//   24   46:invokevirtual   #337 <Method String StringBuilder.toString()>
	//   25   49:areturn         
	}

	private boolean androidPropsInitialized;
	private List frameworkPackages;
	private Map loggerCache;
	private final List loggerContextListenerList = new ArrayList();
	private LoggerContextVO loggerContextRemoteView;
	private int maxCallerDataDepth;
	private int noAppenderWarning;
	private boolean packagingDataEnabled;
	int resetCount;
	final ch.qos.logback.classic.Logger root = new ch.qos.logback.classic.Logger("ROOT", ((ch.qos.logback.classic.Logger) (null)), this);
	private int size;
	private final TurboFilterList turboFilterList = new TurboFilterList();
}
