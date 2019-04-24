// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core;

import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.spi.LogbackLock;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.util.ExecutorServiceUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

// Referenced classes of package ch.qos.logback.core:
//			Context, BasicStatusManager, LifeCycleManager

public class ContextBase
	implements Context, LifeCycle
{

	public ContextBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		birthTime = System.currentTimeMillis();
	//    2    4:aload_0         
	//    3    5:invokestatic    #37  <Method long System.currentTimeMillis()>
	//    4    8:putfield        #39  <Field long birthTime>
		sm = ((StatusManager) (new BasicStatusManager()));
	//    5   11:aload_0         
	//    6   12:new             #41  <Class BasicStatusManager>
	//    7   15:dup             
	//    8   16:invokespecial   #42  <Method void BasicStatusManager()>
	//    9   19:putfield        #44  <Field StatusManager sm>
		propertyMap = ((Map) (new HashMap()));
	//   10   22:aload_0         
	//   11   23:new             #46  <Class HashMap>
	//   12   26:dup             
	//   13   27:invokespecial   #47  <Method void HashMap()>
	//   14   30:putfield        #49  <Field Map propertyMap>
		objectMap = ((Map) (new HashMap()));
	//   15   33:aload_0         
	//   16   34:new             #46  <Class HashMap>
	//   17   37:dup             
	//   18   38:invokespecial   #47  <Method void HashMap()>
	//   19   41:putfield        #51  <Field Map objectMap>
		configurationLock = new LogbackLock();
	//   20   44:aload_0         
	//   21   45:new             #53  <Class LogbackLock>
	//   22   48:dup             
	//   23   49:invokespecial   #54  <Method void LogbackLock()>
	//   24   52:putfield        #56  <Field LogbackLock configurationLock>
	//   25   55:return          
	}

	private void stopExecutorService()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(executorService != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #60  <Field ExecutorService executorService>
	//*   4    6:ifnull          21
		{
			ExecutorServiceUtil.shutdown(executorService);
	//    5    9:aload_0         
	//    6   10:getfield        #60  <Field ExecutorService executorService>
	//    7   13:invokestatic    #66  <Method void ExecutorServiceUtil.shutdown(ExecutorService)>
			executorService = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #60  <Field ExecutorService executorService>
		}
		this;
	//   11   21:aload_0         
		JVM INSTR monitorexit ;
	//   12   22:monitorexit     
		return;
	//   13   23:return          
		Exception exception;
		exception;
	//   14   24:astore_1        
	//*  15   25:aload_0         
		throw exception;
	//   16   26:monitorexit     
	//   17   27:aload_1         
	//   18   28:athrow          
	}

	public long getBirthTime()
	{
		return birthTime;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field long birthTime>
	//    2    4:lreturn         
	}

	public Object getConfigurationLock()
	{
		return ((Object) (configurationLock));
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field LogbackLock configurationLock>
	//    2    4:areturn         
	}

	public Map getCopyOfPropertyMap()
	{
		return ((Map) (new HashMap(propertyMap)));
	//    0    0:new             #46  <Class HashMap>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #49  <Field Map propertyMap>
	//    4    8:invokespecial   #74  <Method void HashMap(Map)>
	//    5   11:areturn         
	}

	public ExecutorService getExecutorService()
	{
		if(executorService != null)
			break MISSING_BLOCK_LABEL_33;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field ExecutorService executorService>
	//    2    4:ifnonnull       33
		this;
	//    3    7:aload_0         
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		if(executorService == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #60  <Field ExecutorService executorService>
	//*   7   13:ifnonnull       23
			executorService = ExecutorServiceUtil.newExecutorService();
	//    8   16:aload_0         
	//    9   17:invokestatic    #81  <Method ExecutorService ExecutorServiceUtil.newExecutorService()>
	//   10   20:putfield        #60  <Field ExecutorService executorService>
		this;
	//   11   23:aload_0         
		JVM INSTR monitorexit ;
	//   12   24:monitorexit     
		break MISSING_BLOCK_LABEL_33;
	//   13   25:goto            33
		Exception exception;
		exception;
	//   14   28:astore_1        
		this;
	//   15   29:aload_0         
		JVM INSTR monitorexit ;
	//   16   30:monitorexit     
		throw exception;
	//   17   31:aload_1         
	//   18   32:athrow          
		return executorService;
	//   19   33:aload_0         
	//   20   34:getfield        #60  <Field ExecutorService executorService>
	//   21   37:areturn         
	}

	LifeCycleManager getLifeCycleManager()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		LifeCycleManager lifecyclemanager;
		if(lifeCycleManager == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #85  <Field LifeCycleManager lifeCycleManager>
	//*   4    6:ifnonnull       20
			lifeCycleManager = new LifeCycleManager();
	//    5    9:aload_0         
	//    6   10:new             #87  <Class LifeCycleManager>
	//    7   13:dup             
	//    8   14:invokespecial   #88  <Method void LifeCycleManager()>
	//    9   17:putfield        #85  <Field LifeCycleManager lifeCycleManager>
		lifecyclemanager = lifeCycleManager;
	//   10   20:aload_0         
	//   11   21:getfield        #85  <Field LifeCycleManager lifeCycleManager>
	//   12   24:astore_1        
		this;
	//   13   25:aload_0         
		JVM INSTR monitorexit ;
	//   14   26:monitorexit     
		return lifecyclemanager;
	//   15   27:aload_1         
	//   16   28:areturn         
		Exception exception;
		exception;
	//   17   29:astore_1        
	//*  18   30:aload_0         
		throw exception;
	//   19   31:monitorexit     
	//   20   32:aload_1         
	//   21   33:athrow          
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field String name>
	//    2    4:areturn         
	}

	public Object getObject(String s)
	{
		return objectMap.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Map objectMap>
	//    2    4:aload_1         
	//    3    5:invokeinterface #100 <Method Object Map.get(Object)>
	//    4   10:areturn         
	}

	public String getProperty(String s)
	{
		if("CONTEXT_NAME".equals(((Object) (s))))
	//*   0    0:ldc1            #104 <String "CONTEXT_NAME">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #110 <Method boolean String.equals(Object)>
	//*   3    6:ifeq            14
			return getName();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #112 <Method String getName()>
	//    6   13:areturn         
		else
			return (String)propertyMap.get(((Object) (s)));
	//    7   14:aload_0         
	//    8   15:getfield        #49  <Field Map propertyMap>
	//    9   18:aload_1         
	//   10   19:invokeinterface #100 <Method Object Map.get(Object)>
	//   11   24:checkcast       #106 <Class String>
	//   12   27:areturn         
	}

	public StatusManager getStatusManager()
	{
		return sm;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field StatusManager sm>
	//    2    4:areturn         
	}

	public boolean isStarted()
	{
		return started;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field boolean started>
	//    2    4:ireturn         
	}

	public void putObject(String s, Object obj)
	{
		objectMap.put(((Object) (s)), obj);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Map objectMap>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #124 <Method Object Map.put(Object, Object)>
	//    5   11:pop             
	//    6   12:return          
	}

	public void putProperty(String s, String s1)
	{
		propertyMap.put(((Object) (s)), ((Object) (s1)));
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field Map propertyMap>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #124 <Method Object Map.put(Object, Object)>
	//    5   11:pop             
	//    6   12:return          
	}

	public void register(LifeCycle lifecycle)
	{
		getLifeCycleManager().register(lifecycle);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #130 <Method LifeCycleManager getLifeCycleManager()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #132 <Method void LifeCycleManager.register(LifeCycle)>
	//    4    8:return          
	}

	public void reset()
	{
		getLifeCycleManager().reset();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #130 <Method LifeCycleManager getLifeCycleManager()>
	//    2    4:invokevirtual   #135 <Method void LifeCycleManager.reset()>
		propertyMap.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #49  <Field Map propertyMap>
	//    5   11:invokeinterface #138 <Method void Map.clear()>
		objectMap.clear();
	//    6   16:aload_0         
	//    7   17:getfield        #51  <Field Map objectMap>
	//    8   20:invokeinterface #138 <Method void Map.clear()>
	//    9   25:return          
	}

	public void setName(String s)
	{
		if(s != null && s.equals(((Object) (name))))
	//*   0    0:aload_1         
	//*   1    1:ifnull          16
	//*   2    4:aload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #92  <Field String name>
	//*   5    9:invokevirtual   #110 <Method boolean String.equals(Object)>
	//*   6   12:ifeq            16
			return;
	//    7   15:return          
		if(name != null && !"default".equals(((Object) (name))))
	//*   8   16:aload_0         
	//*   9   17:getfield        #92  <Field String name>
	//*  10   20:ifnull          48
	//*  11   23:ldc1            #142 <String "default">
	//*  12   25:aload_0         
	//*  13   26:getfield        #92  <Field String name>
	//*  14   29:invokevirtual   #110 <Method boolean String.equals(Object)>
	//*  15   32:ifeq            38
	//*  16   35:goto            48
		{
			throw new IllegalStateException("Context has been already given a name");
	//   17   38:new             #144 <Class IllegalStateException>
	//   18   41:dup             
	//   19   42:ldc1            #146 <String "Context has been already given a name">
	//   20   44:invokespecial   #148 <Method void IllegalStateException(String)>
	//   21   47:athrow          
		} else
		{
			name = s;
	//   22   48:aload_0         
	//   23   49:aload_1         
	//   24   50:putfield        #92  <Field String name>
			return;
	//   25   53:return          
		}
	}

	public void setStatusManager(StatusManager statusmanager)
	{
		if(statusmanager == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			throw new IllegalArgumentException("null StatusManager not allowed");
	//    2    4:new             #152 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #154 <String "null StatusManager not allowed">
	//    5   10:invokespecial   #155 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		} else
		{
			sm = statusmanager;
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:putfield        #44  <Field StatusManager sm>
			return;
	//   10   19:return          
		}
	}

	public void start()
	{
		started = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #118 <Field boolean started>
	//    3    5:return          
	}

	public void stop()
	{
		stopExecutorService();
	//    0    0:aload_0         
	//    1    1:invokespecial   #159 <Method void stopExecutorService()>
		started = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #118 <Field boolean started>
	//    5    9:return          
	}

	public String toString()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field String name>
	//    2    4:areturn         
	}

	private long birthTime;
	LogbackLock configurationLock;
	private volatile ExecutorService executorService;
	private LifeCycleManager lifeCycleManager;
	private String name;
	Map objectMap;
	Map propertyMap;
	private StatusManager sm;
	private boolean started;
}
