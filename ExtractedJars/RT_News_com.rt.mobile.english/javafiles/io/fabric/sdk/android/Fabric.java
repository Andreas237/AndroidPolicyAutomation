// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.concurrency.DependsOn;
import io.fabric.sdk.android.services.concurrency.PriorityThreadPoolExecutor;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
import java.lang.ref.WeakReference;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package io.fabric.sdk.android:
//			DefaultLogger, Kit, KitGroup, ActivityLifecycleManager, 
//			InitializationTask, FabricKitsFinder, Onboarding, InitializationCallback, 
//			Logger

public class Fabric
{

	Fabric(Context context1, Map map, PriorityThreadPoolExecutor prioritythreadpoolexecutor, Handler handler, Logger logger1, boolean flag, InitializationCallback initializationcallback, 
			IdManager idmanager)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #59  <Field Context context>
		kits = map;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #61  <Field Map kits>
		executorService = ((ExecutorService) (prioritythreadpoolexecutor));
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #63  <Field ExecutorService executorService>
		mainHandler = handler;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #65  <Field Handler mainHandler>
		logger = logger1;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #67  <Field Logger logger>
		debuggable = flag;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #69  <Field boolean debuggable>
		initializationCallback = initializationcallback;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #71  <Field InitializationCallback initializationCallback>
		initialized = new AtomicBoolean(false);
	//   23   43:aload_0         
	//   24   44:new             #73  <Class AtomicBoolean>
	//   25   47:dup             
	//   26   48:iconst_0        
	//   27   49:invokespecial   #76  <Method void AtomicBoolean(boolean)>
	//   28   52:putfield        #78  <Field AtomicBoolean initialized>
		kitInitializationCallback = createKitInitializationCallback(map.size());
	//   29   55:aload_0         
	//   30   56:aload_0         
	//   31   57:aload_2         
	//   32   58:invokeinterface #84  <Method int Map.size()>
	//   33   63:invokevirtual   #88  <Method InitializationCallback createKitInitializationCallback(int)>
	//   34   66:putfield        #90  <Field InitializationCallback kitInitializationCallback>
		idManager = idmanager;
	//   35   69:aload_0         
	//   36   70:aload           8
	//   37   72:putfield        #92  <Field IdManager idManager>
	//   38   75:return          
	}

	private static void addToKitMap(Map map, Collection collection)
	{
		collection = ((Collection) (collection.iterator()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #111 <Method Iterator Collection.iterator()>
	//    2    6:astore_1        
		do
		{
			if(!((Iterator) (collection)).hasNext())
				break;
	//    3    7:aload_1         
	//    4    8:invokeinterface #117 <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            61
			Kit kit = (Kit)((Iterator) (collection)).next();
	//    6   16:aload_1         
	//    7   17:invokeinterface #121 <Method Object Iterator.next()>
	//    8   22:checkcast       #123 <Class Kit>
	//    9   25:astore_2        
			map.put(((Object) (((Object) (kit)).getClass())), ((Object) (kit)));
	//   10   26:aload_0         
	//   11   27:aload_2         
	//   12   28:invokevirtual   #127 <Method Class Object.getClass()>
	//   13   31:aload_2         
	//   14   32:invokeinterface #131 <Method Object Map.put(Object, Object)>
	//   15   37:pop             
			if(kit instanceof KitGroup)
	//*  16   38:aload_2         
	//*  17   39:instanceof      #133 <Class KitGroup>
	//*  18   42:ifeq            7
				addToKitMap(map, ((KitGroup)kit).getKits());
	//   19   45:aload_0         
	//   20   46:aload_2         
	//   21   47:checkcast       #133 <Class KitGroup>
	//   22   50:invokeinterface #137 <Method Collection KitGroup.getKits()>
	//   23   55:invokestatic    #139 <Method void addToKitMap(Map, Collection)>
		} while(true);
	//   24   58:goto            7
	//   25   61:return          
	}

	private Activity extractActivity(Context context1)
	{
		if(context1 instanceof Activity)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #144 <Class Activity>
	//*   2    4:ifeq            12
			return (Activity)context1;
	//    3    7:aload_1         
	//    4    8:checkcast       #144 <Class Activity>
	//    5   11:areturn         
		else
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
	}

	public static Kit getKit(Class class1)
	{
		return (Kit)singleton().kits.get(((Object) (class1)));
	//    0    0:invokestatic    #149 <Method Fabric singleton()>
	//    1    3:getfield        #61  <Field Map kits>
	//    2    6:aload_0         
	//    3    7:invokeinterface #153 <Method Object Map.get(Object)>
	//    4   12:checkcast       #123 <Class Kit>
	//    5   15:areturn         
	}

	private static Map getKitMap(Collection collection)
	{
		HashMap hashmap = new HashMap(collection.size());
	//    0    0:new             #156 <Class HashMap>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #157 <Method int Collection.size()>
	//    4   10:invokespecial   #160 <Method void HashMap(int)>
	//    5   13:astore_1        
		addToKitMap(((Map) (hashmap)), collection);
	//    6   14:aload_1         
	//    7   15:aload_0         
	//    8   16:invokestatic    #139 <Method void addToKitMap(Map, Collection)>
		return ((Map) (hashmap));
	//    9   19:aload_1         
	//   10   20:areturn         
	}

	public static Logger getLogger()
	{
		if(singleton == null)
	//*   0    0:getstatic       #165 <Field Fabric singleton>
	//*   1    3:ifnonnull       10
			return DEFAULT_LOGGER;
	//    2    6:getstatic       #54  <Field Logger DEFAULT_LOGGER>
	//    3    9:areturn         
		else
			return singleton.logger;
	//    4   10:getstatic       #165 <Field Fabric singleton>
	//    5   13:getfield        #67  <Field Logger logger>
	//    6   16:areturn         
	}

	private void init()
	{
		setCurrentActivity(extractActivity(context));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #59  <Field Context context>
	//    4    6:invokespecial   #168 <Method Activity extractActivity(Context)>
	//    5    9:invokevirtual   #172 <Method Fabric setCurrentActivity(Activity)>
	//    6   12:pop             
		activityLifecycleManager = new ActivityLifecycleManager(context);
	//    7   13:aload_0         
	//    8   14:new             #174 <Class ActivityLifecycleManager>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:getfield        #59  <Field Context context>
	//   12   22:invokespecial   #177 <Method void ActivityLifecycleManager(Context)>
	//   13   25:putfield        #179 <Field ActivityLifecycleManager activityLifecycleManager>
		activityLifecycleManager.registerCallbacks(((ActivityLifecycleManager.Callbacks) (new _cls1())));
	//   14   28:aload_0         
	//   15   29:getfield        #179 <Field ActivityLifecycleManager activityLifecycleManager>
	//   16   32:new             #181 <Class Fabric$1>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:invokespecial   #184 <Method void Fabric$1(Fabric)>
	//   20   40:invokevirtual   #188 <Method boolean ActivityLifecycleManager.registerCallbacks(ActivityLifecycleManager$Callbacks)>
	//   21   43:pop             
		initializeKits(context);
	//   22   44:aload_0         
	//   23   45:aload_0         
	//   24   46:getfield        #59  <Field Context context>
	//   25   49:invokevirtual   #191 <Method void initializeKits(Context)>
	//   26   52:return          
	}

	public static boolean isDebuggable()
	{
		if(singleton == null)
	//*   0    0:getstatic       #165 <Field Fabric singleton>
	//*   1    3:ifnonnull       8
			return false;
	//    2    6:iconst_0        
	//    3    7:ireturn         
		else
			return singleton.debuggable;
	//    4    8:getstatic       #165 <Field Fabric singleton>
	//    5   11:getfield        #69  <Field boolean debuggable>
	//    6   14:ireturn         
	}

	public static boolean isInitialized()
	{
		return singleton != null && singleton.initialized.get();
	//    0    0:getstatic       #165 <Field Fabric singleton>
	//    1    3:ifnull          20
	//    2    6:getstatic       #165 <Field Fabric singleton>
	//    3    9:getfield        #78  <Field AtomicBoolean initialized>
	//    4   12:invokevirtual   #195 <Method boolean AtomicBoolean.get()>
	//    5   15:ifeq            20
	//    6   18:iconst_1        
	//    7   19:ireturn         
	//    8   20:iconst_0        
	//    9   21:ireturn         
	}

	private static void setFabric(Fabric fabric)
	{
		singleton = fabric;
	//    0    0:aload_0         
	//    1    1:putstatic       #165 <Field Fabric singleton>
		fabric.init();
	//    2    4:aload_0         
	//    3    5:invokespecial   #198 <Method void init()>
	//    4    8:return          
	}

	static Fabric singleton()
	{
		if(singleton == null)
	//*   0    0:getstatic       #165 <Field Fabric singleton>
	//*   1    3:ifnonnull       16
			throw new IllegalStateException("Must Initialize Fabric before using singleton()");
	//    2    6:new             #200 <Class IllegalStateException>
	//    3    9:dup             
	//    4   10:ldc1            #202 <String "Must Initialize Fabric before using singleton()">
	//    5   12:invokespecial   #205 <Method void IllegalStateException(String)>
	//    6   15:athrow          
		else
			return singleton;
	//    7   16:getstatic       #165 <Field Fabric singleton>
	//    8   19:areturn         
	}

	public static transient Fabric with(Context context1, Kit akit[])
	{
		if(singleton != null)
			break MISSING_BLOCK_LABEL_45;
	//    0    0:getstatic       #165 <Field Fabric singleton>
	//    1    3:ifnonnull       45
		io/fabric/sdk/android/Fabric;
	//    2    6:ldc1            #2   <Class Fabric>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
	/* block-local class not found */
	class Builder {}

		if(singleton == null)
	//*   4    9:getstatic       #165 <Field Fabric singleton>
	//*   5   12:ifnonnull       33
			setFabric((new Builder(context1)).kits(akit).build());
	//    6   15:new             #6   <Class Fabric$Builder>
	//    7   18:dup             
	//    8   19:aload_0         
	//    9   20:invokespecial   #208 <Method void Fabric$Builder(Context)>
	//   10   23:aload_1         
	//   11   24:invokevirtual   #211 <Method Fabric$Builder Fabric$Builder.kits(Kit[])>
	//   12   27:invokevirtual   #214 <Method Fabric Fabric$Builder.build()>
	//   13   30:invokestatic    #216 <Method void setFabric(Fabric)>
		io/fabric/sdk/android/Fabric;
	//   14   33:ldc1            #2   <Class Fabric>
		JVM INSTR monitorexit ;
	//   15   35:monitorexit     
		break MISSING_BLOCK_LABEL_45;
	//   16   36:goto            45
		context1;
	//   17   39:astore_0        
		io/fabric/sdk/android/Fabric;
	//   18   40:ldc1            #2   <Class Fabric>
		JVM INSTR monitorexit ;
	//   19   42:monitorexit     
		throw context1;
	//   20   43:aload_0         
	//   21   44:athrow          
		return singleton;
	//   22   45:getstatic       #165 <Field Fabric singleton>
	//   23   48:areturn         
	}

	public static Fabric with(Fabric fabric)
	{
		if(singleton != null)
			break MISSING_BLOCK_LABEL_31;
	//    0    0:getstatic       #165 <Field Fabric singleton>
	//    1    3:ifnonnull       31
		io/fabric/sdk/android/Fabric;
	//    2    6:ldc1            #2   <Class Fabric>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
		if(singleton == null)
	//*   4    9:getstatic       #165 <Field Fabric singleton>
	//*   5   12:ifnonnull       19
			setFabric(fabric);
	//    6   15:aload_0         
	//    7   16:invokestatic    #216 <Method void setFabric(Fabric)>
		io/fabric/sdk/android/Fabric;
	//    8   19:ldc1            #2   <Class Fabric>
		JVM INSTR monitorexit ;
	//    9   21:monitorexit     
		break MISSING_BLOCK_LABEL_31;
	//   10   22:goto            31
		fabric;
	//   11   25:astore_0        
		io/fabric/sdk/android/Fabric;
	//   12   26:ldc1            #2   <Class Fabric>
		JVM INSTR monitorexit ;
	//   13   28:monitorexit     
		throw fabric;
	//   14   29:aload_0         
	//   15   30:athrow          
		return singleton;
	//   16   31:getstatic       #165 <Field Fabric singleton>
	//   17   34:areturn         
	}

	void addAnnotatedDependencies(Map map, Kit kit)
	{
		DependsOn dependson = (DependsOn)((Object) (kit)).getClass().getAnnotation(io/fabric/sdk/android/services/concurrency/DependsOn);
	//    0    0:aload_2         
	//    1    1:invokevirtual   #127 <Method Class Object.getClass()>
	//    2    4:ldc1            #221 <Class DependsOn>
	//    3    6:invokevirtual   #227 <Method java.lang.annotation.Annotation Class.getAnnotation(Class)>
	//    4    9:checkcast       #221 <Class DependsOn>
	//    5   12:astore          5
		if(dependson != null)
	//*   6   14:aload           5
	//*   7   16:ifnull          170
		{
			Class aclass[] = dependson.value();
	//    8   19:aload           5
	//    9   21:invokeinterface #231 <Method Class[] DependsOn.value()>
	//   10   26:astore          5
			int j = aclass.length;
	//   11   28:aload           5
	//   12   30:arraylength     
	//   13   31:istore          4
label0:
			for(int i = 0; i < j; i++)
	//*  14   33:iconst_0        
	//*  15   34:istore_3        
	//*  16   35:iload_3         
	//*  17   36:iload           4
	//*  18   38:icmpge          170
			{
				Class class1 = aclass[i];
	//   19   41:aload           5
	//   20   43:iload_3         
	//   21   44:aaload          
	//   22   45:astore          6
				if(class1.isInterface())
	//*  23   47:aload           6
	//*  24   49:invokevirtual   #234 <Method boolean Class.isInterface()>
	//*  25   52:ifeq            118
				{
					Iterator iterator = map.values().iterator();
	//   26   55:aload_1         
	//   27   56:invokeinterface #237 <Method Collection Map.values()>
	//   28   61:invokeinterface #111 <Method Iterator Collection.iterator()>
	//   29   66:astore          7
					do
					{
						Kit kit1;
						do
						{
							if(!iterator.hasNext())
								continue label0;
	//   30   68:aload           7
	//   31   70:invokeinterface #117 <Method boolean Iterator.hasNext()>
	//   32   75:ifeq            163
							kit1 = (Kit)iterator.next();
	//   33   78:aload           7
	//   34   80:invokeinterface #121 <Method Object Iterator.next()>
	//   35   85:checkcast       #123 <Class Kit>
	//   36   88:astore          8
						} while(!class1.isAssignableFrom(((Object) (kit1)).getClass()));
	//   37   90:aload           6
	//   38   92:aload           8
	//   39   94:invokevirtual   #127 <Method Class Object.getClass()>
	//   40   97:invokevirtual   #241 <Method boolean Class.isAssignableFrom(Class)>
	//   41  100:ifeq            68
						kit.initializationTask.addDependency(((io.fabric.sdk.android.services.concurrency.Task) (kit1.initializationTask)));
	//   42  103:aload_2         
	//   43  104:getfield        #245 <Field InitializationTask Kit.initializationTask>
	//   44  107:aload           8
	//   45  109:getfield        #245 <Field InitializationTask Kit.initializationTask>
	//   46  112:invokevirtual   #251 <Method void InitializationTask.addDependency(io.fabric.sdk.android.services.concurrency.Task)>
					} while(true);
	//   47  115:goto            68
				}
				if((Kit)map.get(((Object) (class1))) == null)
	//*  48  118:aload_1         
	//*  49  119:aload           6
	//*  50  121:invokeinterface #153 <Method Object Map.get(Object)>
	//*  51  126:checkcast       #123 <Class Kit>
	//*  52  129:ifnonnull       142
					throw new UnmetDependencyException("Referenced Kit was null, does the kit exist?");
	//   53  132:new             #253 <Class UnmetDependencyException>
	//   54  135:dup             
	//   55  136:ldc1            #255 <String "Referenced Kit was null, does the kit exist?">
	//   56  138:invokespecial   #256 <Method void UnmetDependencyException(String)>
	//   57  141:athrow          
				kit.initializationTask.addDependency(((io.fabric.sdk.android.services.concurrency.Task) (((Kit)map.get(((Object) (class1)))).initializationTask)));
	//   58  142:aload_2         
	//   59  143:getfield        #245 <Field InitializationTask Kit.initializationTask>
	//   60  146:aload_1         
	//   61  147:aload           6
	//   62  149:invokeinterface #153 <Method Object Map.get(Object)>
	//   63  154:checkcast       #123 <Class Kit>
	//   64  157:getfield        #245 <Field InitializationTask Kit.initializationTask>
	//   65  160:invokevirtual   #251 <Method void InitializationTask.addDependency(io.fabric.sdk.android.services.concurrency.Task)>
			}

	//   66  163:iload_3         
	//   67  164:iconst_1        
	//   68  165:iadd            
	//   69  166:istore_3        
		}
	//*  70  167:goto            35
	//   71  170:return          
	}

	InitializationCallback createKitInitializationCallback(int i)
	{
		return ((InitializationCallback) (new _cls2(i)));
	//    0    0:new             #259 <Class Fabric$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #262 <Method void Fabric$2(Fabric, int)>
	//    5    9:areturn         
	}

	public ActivityLifecycleManager getActivityLifecycleManager()
	{
		return activityLifecycleManager;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field ActivityLifecycleManager activityLifecycleManager>
	//    2    4:areturn         
	}

	public String getAppIdentifier()
	{
		return idManager.getAppIdentifier();
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field IdManager idManager>
	//    2    4:invokevirtual   #271 <Method String IdManager.getAppIdentifier()>
	//    3    7:areturn         
	}

	public String getAppInstallIdentifier()
	{
		return idManager.getAppInstallIdentifier();
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field IdManager idManager>
	//    2    4:invokevirtual   #274 <Method String IdManager.getAppInstallIdentifier()>
	//    3    7:areturn         
	}

	public Activity getCurrentActivity()
	{
		if(activity != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #278 <Field WeakReference activity>
	//*   2    4:ifnull          18
			return (Activity)activity.get();
	//    3    7:aload_0         
	//    4    8:getfield        #278 <Field WeakReference activity>
	//    5   11:invokevirtual   #282 <Method Object WeakReference.get()>
	//    6   14:checkcast       #144 <Class Activity>
	//    7   17:areturn         
		else
			return null;
	//    8   18:aconst_null     
	//    9   19:areturn         
	}

	public ExecutorService getExecutorService()
	{
		return executorService;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field ExecutorService executorService>
	//    2    4:areturn         
	}

	public String getIdentifier()
	{
		return "io.fabric.sdk.android:fabric";
	//    0    0:ldc2            #287 <String "io.fabric.sdk.android:fabric">
	//    1    3:areturn         
	}

	public Collection getKits()
	{
		return kits.values();
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field Map kits>
	//    2    4:invokeinterface #237 <Method Collection Map.values()>
	//    3    9:areturn         
	}

	Future getKitsFinderFuture(Context context1)
	{
		context1 = ((Context) (new FabricKitsFinder(context1.getPackageCodePath())));
	//    0    0:new             #292 <Class FabricKitsFinder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #297 <Method String Context.getPackageCodePath()>
	//    4    8:invokespecial   #298 <Method void FabricKitsFinder(String)>
	//    5   11:astore_1        
		return getExecutorService().submit(((java.util.concurrent.Callable) (context1)));
	//    6   12:aload_0         
	//    7   13:invokevirtual   #300 <Method ExecutorService getExecutorService()>
	//    8   16:aload_1         
	//    9   17:invokeinterface #306 <Method Future ExecutorService.submit(java.util.concurrent.Callable)>
	//   10   22:areturn         
	}

	public Handler getMainHandler()
	{
		return mainHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Handler mainHandler>
	//    2    4:areturn         
	}

	public String getVersion()
	{
		return "1.3.10.97";
	//    0    0:ldc2            #312 <String "1.3.10.97">
	//    1    3:areturn         
	}

	void initializeKits(Context context1)
	{
		Object obj = ((Object) (getKitsFinderFuture(context1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #314 <Method Future getKitsFinderFuture(Context)>
	//    3    5:astore_2        
		Object obj1 = ((Object) (getKits()));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #315 <Method Collection getKits()>
	//    6   10:astore_3        
		obj = ((Object) (new Onboarding(((Future) (obj)), ((Collection) (obj1)))));
	//    7   11:new             #317 <Class Onboarding>
	//    8   14:dup             
	//    9   15:aload_2         
	//   10   16:aload_3         
	//   11   17:invokespecial   #320 <Method void Onboarding(Future, Collection)>
	//   12   20:astore_2        
		obj1 = ((Object) (new ArrayList(((Collection) (obj1)))));
	//   13   21:new             #322 <Class ArrayList>
	//   14   24:dup             
	//   15   25:aload_3         
	//   16   26:invokespecial   #325 <Method void ArrayList(Collection)>
	//   17   29:astore_3        
		Collections.sort(((List) (obj1)));
	//   18   30:aload_3         
	//   19   31:invokestatic    #331 <Method void Collections.sort(List)>
		((Onboarding) (obj)).injectParameters(context1, this, InitializationCallback.EMPTY, idManager);
	//   20   34:aload_2         
	//   21   35:aload_1         
	//   22   36:aload_0         
	//   23   37:getstatic       #336 <Field InitializationCallback InitializationCallback.EMPTY>
	//   24   40:aload_0         
	//   25   41:getfield        #92  <Field IdManager idManager>
	//   26   44:invokevirtual   #340 <Method void Onboarding.injectParameters(Context, Fabric, InitializationCallback, IdManager)>
		for(Iterator iterator = ((List) (obj1)).iterator(); iterator.hasNext(); ((Kit)iterator.next()).injectParameters(context1, this, kitInitializationCallback, idManager));
	//   27   47:aload_3         
	//   28   48:invokeinterface #343 <Method Iterator List.iterator()>
	//   29   53:astore          4
	//   30   55:aload           4
	//   31   57:invokeinterface #117 <Method boolean Iterator.hasNext()>
	//   32   62:ifeq            91
	//   33   65:aload           4
	//   34   67:invokeinterface #121 <Method Object Iterator.next()>
	//   35   72:checkcast       #123 <Class Kit>
	//   36   75:aload_1         
	//   37   76:aload_0         
	//   38   77:aload_0         
	//   39   78:getfield        #90  <Field InitializationCallback kitInitializationCallback>
	//   40   81:aload_0         
	//   41   82:getfield        #92  <Field IdManager idManager>
	//   42   85:invokevirtual   #344 <Method void Kit.injectParameters(Context, Fabric, InitializationCallback, IdManager)>
	//*  43   88:goto            55
		((Onboarding) (obj)).initialize();
	//   44   91:aload_2         
	//   45   92:invokevirtual   #347 <Method void Onboarding.initialize()>
		if(getLogger().isLoggable("Fabric", 3))
	//*  46   95:invokestatic    #349 <Method Logger getLogger()>
	//*  47   98:ldc1            #18  <String "Fabric">
	//*  48  100:iconst_3        
	//*  49  101:invokeinterface #355 <Method boolean Logger.isLoggable(String, int)>
	//*  50  106:ifeq            157
		{
			context1 = ((Context) (new StringBuilder("Initializing ")));
	//   51  109:new             #357 <Class StringBuilder>
	//   52  112:dup             
	//   53  113:ldc2            #359 <String "Initializing ">
	//   54  116:invokespecial   #360 <Method void StringBuilder(String)>
	//   55  119:astore_1        
			((StringBuilder) (context1)).append(getIdentifier());
	//   56  120:aload_1         
	//   57  121:aload_0         
	//   58  122:invokevirtual   #362 <Method String getIdentifier()>
	//   59  125:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//   60  128:pop             
			((StringBuilder) (context1)).append(" [Version: ");
	//   61  129:aload_1         
	//   62  130:ldc2            #368 <String " [Version: ">
	//   63  133:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//   64  136:pop             
			((StringBuilder) (context1)).append(getVersion());
	//   65  137:aload_1         
	//   66  138:aload_0         
	//   67  139:invokevirtual   #370 <Method String getVersion()>
	//   68  142:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//   69  145:pop             
			((StringBuilder) (context1)).append("], with the following kits:\n");
	//   70  146:aload_1         
	//   71  147:ldc2            #372 <String "], with the following kits:\n">
	//   72  150:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//   73  153:pop             
		} else
	//*  74  154:goto            159
		{
			context1 = null;
	//   75  157:aconst_null     
	//   76  158:astore_1        
		}
		obj1 = ((Object) (((List) (obj1)).iterator()));
	//   77  159:aload_3         
	//   78  160:invokeinterface #343 <Method Iterator List.iterator()>
	//   79  165:astore_3        
		do
		{
			if(!((Iterator) (obj1)).hasNext())
				break;
	//   80  166:aload_3         
	//   81  167:invokeinterface #117 <Method boolean Iterator.hasNext()>
	//   82  172:ifeq            256
			Kit kit = (Kit)((Iterator) (obj1)).next();
	//   83  175:aload_3         
	//   84  176:invokeinterface #121 <Method Object Iterator.next()>
	//   85  181:checkcast       #123 <Class Kit>
	//   86  184:astore          4
			kit.initializationTask.addDependency(((io.fabric.sdk.android.services.concurrency.Task) (((Onboarding) (obj)).initializationTask)));
	//   87  186:aload           4
	//   88  188:getfield        #245 <Field InitializationTask Kit.initializationTask>
	//   89  191:aload_2         
	//   90  192:getfield        #373 <Field InitializationTask Onboarding.initializationTask>
	//   91  195:invokevirtual   #251 <Method void InitializationTask.addDependency(io.fabric.sdk.android.services.concurrency.Task)>
			addAnnotatedDependencies(kits, kit);
	//   92  198:aload_0         
	//   93  199:aload_0         
	//   94  200:getfield        #61  <Field Map kits>
	//   95  203:aload           4
	//   96  205:invokevirtual   #375 <Method void addAnnotatedDependencies(Map, Kit)>
			kit.initialize();
	//   97  208:aload           4
	//   98  210:invokevirtual   #376 <Method void Kit.initialize()>
			if(context1 != null)
	//*  99  213:aload_1         
	//* 100  214:ifnull          166
			{
				((StringBuilder) (context1)).append(kit.getIdentifier());
	//  101  217:aload_1         
	//  102  218:aload           4
	//  103  220:invokevirtual   #377 <Method String Kit.getIdentifier()>
	//  104  223:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//  105  226:pop             
				((StringBuilder) (context1)).append(" [Version: ");
	//  106  227:aload_1         
	//  107  228:ldc2            #368 <String " [Version: ">
	//  108  231:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//  109  234:pop             
				((StringBuilder) (context1)).append(kit.getVersion());
	//  110  235:aload_1         
	//  111  236:aload           4
	//  112  238:invokevirtual   #378 <Method String Kit.getVersion()>
	//  113  241:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//  114  244:pop             
				((StringBuilder) (context1)).append("]\n");
	//  115  245:aload_1         
	//  116  246:ldc2            #380 <String "]\n">
	//  117  249:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//  118  252:pop             
			}
		} while(true);
	//  119  253:goto            166
		if(context1 != null)
	//* 120  256:aload_1         
	//* 121  257:ifnull          274
			getLogger().d("Fabric", ((StringBuilder) (context1)).toString());
	//  122  260:invokestatic    #349 <Method Logger getLogger()>
	//  123  263:ldc1            #18  <String "Fabric">
	//  124  265:aload_1         
	//  125  266:invokevirtual   #383 <Method String StringBuilder.toString()>
	//  126  269:invokeinterface #387 <Method void Logger.d(String, String)>
	//  127  274:return          
	}

	public Fabric setCurrentActivity(Activity activity1)
	{
		activity = new WeakReference(((Object) (activity1)));
	//    0    0:aload_0         
	//    1    1:new             #280 <Class WeakReference>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #390 <Method void WeakReference(Object)>
	//    5    9:putfield        #278 <Field WeakReference activity>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	static final boolean DEFAULT_DEBUGGABLE = false;
	static final Logger DEFAULT_LOGGER = new DefaultLogger();
	static final String ROOT_DIR = ".Fabric";
	public static final String TAG = "Fabric";
	static volatile Fabric singleton;
	private WeakReference activity;
	private ActivityLifecycleManager activityLifecycleManager;
	private final Context context;
	final boolean debuggable;
	private final ExecutorService executorService;
	private final IdManager idManager;
	private final InitializationCallback initializationCallback;
	private AtomicBoolean initialized;
	private final InitializationCallback kitInitializationCallback;
	private final Map kits;
	final Logger logger;
	private final Handler mainHandler;

	static 
	{
	//    0    0:new             #49  <Class DefaultLogger>
	//    1    3:dup             
	//    2    4:invokespecial   #52  <Method void DefaultLogger()>
	//    3    7:putstatic       #54  <Field Logger DEFAULT_LOGGER>
	//*   4   10:return          
	}


/*
	static Map access$000(Collection collection)
	{
		return getKitMap(collection);
	//    0    0:aload_0         
	//    1    1:invokestatic    #99  <Method Map getKitMap(Collection)>
	//    2    4:areturn         
	}

*/


/*
	static AtomicBoolean access$100(Fabric fabric)
	{
		return fabric.initialized;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field AtomicBoolean initialized>
	//    2    4:areturn         
	}

*/


/*
	static InitializationCallback access$200(Fabric fabric)
	{
		return fabric.initializationCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field InitializationCallback initializationCallback>
	//    2    4:areturn         
	}

*/

	/* member class not found */
	class _cls1 {}


	/* member class not found */
	class _cls2 {}

}
