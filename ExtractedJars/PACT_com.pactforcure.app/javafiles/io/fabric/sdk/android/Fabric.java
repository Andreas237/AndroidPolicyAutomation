// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android;

import android.app.Activity;
import android.content.Context;
import android.os.*;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.concurrency.DependsOn;
import io.fabric.sdk.android.services.concurrency.PriorityThreadPoolExecutor;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
import java.lang.ref.WeakReference;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package io.fabric.sdk.android:
//			DefaultLogger, Kit, KitGroup, ActivityLifecycleManager, 
//			InitializationTask, FabricKitsFinder, Onboarding, InitializationCallback, 
//			Logger

public class Fabric
{
	public static class Builder
	{

		public Builder appIdentifier(String s)
		{
			if(s == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       14
				throw new IllegalArgumentException("appIdentifier must not be null.");
		//    2    4:new             #32  <Class IllegalArgumentException>
		//    3    7:dup             
		//    4    8:ldc1            #43  <String "appIdentifier must not be null.">
		//    5   10:invokespecial   #37  <Method void IllegalArgumentException(String)>
		//    6   13:athrow          
			if(appIdentifier != null)
		//*   7   14:aload_0         
		//*   8   15:getfield        #45  <Field String appIdentifier>
		//*   9   18:ifnull          31
			{
				throw new IllegalStateException("appIdentifier already set.");
		//   10   21:new             #47  <Class IllegalStateException>
		//   11   24:dup             
		//   12   25:ldc1            #49  <String "appIdentifier already set.">
		//   13   27:invokespecial   #50  <Method void IllegalStateException(String)>
		//   14   30:athrow          
			} else
			{
				appIdentifier = s;
		//   15   31:aload_0         
		//   16   32:aload_1         
		//   17   33:putfield        #45  <Field String appIdentifier>
				return this;
		//   18   36:aload_0         
		//   19   37:areturn         
			}
		}

		public Builder appInstallIdentifier(String s)
		{
			if(s == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       14
				throw new IllegalArgumentException("appInstallIdentifier must not be null.");
		//    2    4:new             #32  <Class IllegalArgumentException>
		//    3    7:dup             
		//    4    8:ldc1            #52  <String "appInstallIdentifier must not be null.">
		//    5   10:invokespecial   #37  <Method void IllegalArgumentException(String)>
		//    6   13:athrow          
			if(appInstallIdentifier != null)
		//*   7   14:aload_0         
		//*   8   15:getfield        #54  <Field String appInstallIdentifier>
		//*   9   18:ifnull          31
			{
				throw new IllegalStateException("appInstallIdentifier already set.");
		//   10   21:new             #47  <Class IllegalStateException>
		//   11   24:dup             
		//   12   25:ldc1            #56  <String "appInstallIdentifier already set.">
		//   13   27:invokespecial   #50  <Method void IllegalStateException(String)>
		//   14   30:athrow          
			} else
			{
				appInstallIdentifier = s;
		//   15   31:aload_0         
		//   16   32:aload_1         
		//   17   33:putfield        #54  <Field String appInstallIdentifier>
				return this;
		//   18   36:aload_0         
		//   19   37:areturn         
			}
		}

		public Fabric build()
		{
			if(threadPoolExecutor == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #60  <Field PriorityThreadPoolExecutor threadPoolExecutor>
		//*   2    4:ifnonnull       14
				threadPoolExecutor = PriorityThreadPoolExecutor.create();
		//    3    7:aload_0         
		//    4    8:invokestatic    #66  <Method PriorityThreadPoolExecutor PriorityThreadPoolExecutor.create()>
		//    5   11:putfield        #60  <Field PriorityThreadPoolExecutor threadPoolExecutor>
			if(handler == null)
		//*   6   14:aload_0         
		//*   7   15:getfield        #68  <Field Handler handler>
		//*   8   18:ifnonnull       35
				handler = new Handler(Looper.getMainLooper());
		//    9   21:aload_0         
		//   10   22:new             #70  <Class Handler>
		//   11   25:dup             
		//   12   26:invokestatic    #76  <Method Looper Looper.getMainLooper()>
		//   13   29:invokespecial   #79  <Method void Handler(Looper)>
		//   14   32:putfield        #68  <Field Handler handler>
			Object obj;
			IdManager idmanager;
			if(logger == null)
		//*  15   35:aload_0         
		//*  16   36:getfield        #81  <Field Logger logger>
		//*  17   39:ifnonnull       61
				if(debuggable)
		//*  18   42:aload_0         
		//*  19   43:getfield        #83  <Field boolean debuggable>
		//*  20   46:ifeq            168
					logger = ((Logger) (new DefaultLogger(3)));
		//   21   49:aload_0         
		//   22   50:new             #85  <Class DefaultLogger>
		//   23   53:dup             
		//   24   54:iconst_3        
		//   25   55:invokespecial   #88  <Method void DefaultLogger(int)>
		//   26   58:putfield        #81  <Field Logger logger>
				else
		//*  27   61:aload_0         
		//*  28   62:getfield        #45  <Field String appIdentifier>
		//*  29   65:ifnonnull       79
		//*  30   68:aload_0         
		//*  31   69:aload_0         
		//*  32   70:getfield        #39  <Field Context context>
		//*  33   73:invokevirtual   #94  <Method String Context.getPackageName()>
		//*  34   76:putfield        #45  <Field String appIdentifier>
		//*  35   79:aload_0         
		//*  36   80:getfield        #96  <Field InitializationCallback initializationCallback>
		//*  37   83:ifnonnull       93
		//*  38   86:aload_0         
		//*  39   87:getstatic       #101 <Field InitializationCallback InitializationCallback.EMPTY>
		//*  40   90:putfield        #96  <Field InitializationCallback initializationCallback>
		//*  41   93:aload_0         
		//*  42   94:getfield        #103 <Field Kit[] kits>
		//*  43   97:ifnonnull       182
		//*  44  100:new             #105 <Class HashMap>
		//*  45  103:dup             
		//*  46  104:invokespecial   #106 <Method void HashMap()>
		//*  47  107:astore_1        
		//*  48  108:new             #108 <Class IdManager>
		//*  49  111:dup             
		//*  50  112:aload_0         
		//*  51  113:getfield        #39  <Field Context context>
		//*  52  116:aload_0         
		//*  53  117:getfield        #45  <Field String appIdentifier>
		//*  54  120:aload_0         
		//*  55  121:getfield        #54  <Field String appInstallIdentifier>
		//*  56  124:aload_1         
		//*  57  125:invokeinterface #114 <Method Collection Map.values()>
		//*  58  130:invokespecial   #117 <Method void IdManager(Context, String, String, Collection)>
		//*  59  133:astore_2        
		//*  60  134:new             #6   <Class Fabric>
		//*  61  137:dup             
		//*  62  138:aload_0         
		//*  63  139:getfield        #39  <Field Context context>
		//*  64  142:aload_1         
		//*  65  143:aload_0         
		//*  66  144:getfield        #60  <Field PriorityThreadPoolExecutor threadPoolExecutor>
		//*  67  147:aload_0         
		//*  68  148:getfield        #68  <Field Handler handler>
		//*  69  151:aload_0         
		//*  70  152:getfield        #81  <Field Logger logger>
		//*  71  155:aload_0         
		//*  72  156:getfield        #83  <Field boolean debuggable>
		//*  73  159:aload_0         
		//*  74  160:getfield        #96  <Field InitializationCallback initializationCallback>
		//*  75  163:aload_2         
		//*  76  164:invokespecial   #120 <Method void Fabric(Context, Map, PriorityThreadPoolExecutor, Handler, Logger, boolean, InitializationCallback, IdManager)>
		//*  77  167:areturn         
					logger = ((Logger) (new DefaultLogger()));
		//   78  168:aload_0         
		//   79  169:new             #85  <Class DefaultLogger>
		//   80  172:dup             
		//   81  173:invokespecial   #121 <Method void DefaultLogger()>
		//   82  176:putfield        #81  <Field Logger logger>
			if(appIdentifier == null)
				appIdentifier = context.getPackageName();
			if(initializationCallback == null)
				initializationCallback = InitializationCallback.EMPTY;
			if(kits == null)
				obj = ((Object) (new HashMap()));
			else
		//*  83  179:goto            61
				obj = ((Object) (Fabric.getKitMap(((Collection) (Arrays.asList(((Object []) (kits))))))));
		//   84  182:aload_0         
		//   85  183:getfield        #103 <Field Kit[] kits>
		//   86  186:invokestatic    #127 <Method List Arrays.asList(Object[])>
		//   87  189:invokestatic    #131 <Method Map Fabric.access$000(Collection)>
		//   88  192:astore_1        
			idmanager = new IdManager(context, appIdentifier, appInstallIdentifier, ((Map) (obj)).values());
			return new Fabric(context, ((Map) (obj)), threadPoolExecutor, handler, logger, debuggable, initializationCallback, idmanager);
		//*  89  193:goto            108
		}

		public Builder debuggable(boolean flag)
		{
			debuggable = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #83  <Field boolean debuggable>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder executorService(ExecutorService executorservice)
		{
			return this;
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		public Builder handler(Handler handler1)
		{
			return this;
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		public Builder initializationCallback(InitializationCallback initializationcallback)
		{
			if(initializationcallback == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       14
				throw new IllegalArgumentException("initializationCallback must not be null.");
		//    2    4:new             #32  <Class IllegalArgumentException>
		//    3    7:dup             
		//    4    8:ldc1            #140 <String "initializationCallback must not be null.">
		//    5   10:invokespecial   #37  <Method void IllegalArgumentException(String)>
		//    6   13:athrow          
			if(initializationCallback != null)
		//*   7   14:aload_0         
		//*   8   15:getfield        #96  <Field InitializationCallback initializationCallback>
		//*   9   18:ifnull          31
			{
				throw new IllegalStateException("initializationCallback already set.");
		//   10   21:new             #47  <Class IllegalStateException>
		//   11   24:dup             
		//   12   25:ldc1            #142 <String "initializationCallback already set.">
		//   13   27:invokespecial   #50  <Method void IllegalStateException(String)>
		//   14   30:athrow          
			} else
			{
				initializationCallback = initializationcallback;
		//   15   31:aload_0         
		//   16   32:aload_1         
		//   17   33:putfield        #96  <Field InitializationCallback initializationCallback>
				return this;
		//   18   36:aload_0         
		//   19   37:areturn         
			}
		}

		public transient Builder kits(Kit akit[])
		{
			if(kits != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #103 <Field Kit[] kits>
		//*   2    4:ifnull          17
			{
				throw new IllegalStateException("Kits already set.");
		//    3    7:new             #47  <Class IllegalStateException>
		//    4   10:dup             
		//    5   11:ldc1            #147 <String "Kits already set.">
		//    6   13:invokespecial   #50  <Method void IllegalStateException(String)>
		//    7   16:athrow          
			} else
			{
				kits = akit;
		//    8   17:aload_0         
		//    9   18:aload_1         
		//   10   19:putfield        #103 <Field Kit[] kits>
				return this;
		//   11   22:aload_0         
		//   12   23:areturn         
			}
		}

		public Builder logger(Logger logger1)
		{
			if(logger1 == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       14
				throw new IllegalArgumentException("Logger must not be null.");
		//    2    4:new             #32  <Class IllegalArgumentException>
		//    3    7:dup             
		//    4    8:ldc1            #150 <String "Logger must not be null.">
		//    5   10:invokespecial   #37  <Method void IllegalArgumentException(String)>
		//    6   13:athrow          
			if(logger != null)
		//*   7   14:aload_0         
		//*   8   15:getfield        #81  <Field Logger logger>
		//*   9   18:ifnull          31
			{
				throw new IllegalStateException("Logger already set.");
		//   10   21:new             #47  <Class IllegalStateException>
		//   11   24:dup             
		//   12   25:ldc1            #152 <String "Logger already set.">
		//   13   27:invokespecial   #50  <Method void IllegalStateException(String)>
		//   14   30:athrow          
			} else
			{
				logger = logger1;
		//   15   31:aload_0         
		//   16   32:aload_1         
		//   17   33:putfield        #81  <Field Logger logger>
				return this;
		//   18   36:aload_0         
		//   19   37:areturn         
			}
		}

		public Builder threadPoolExecutor(PriorityThreadPoolExecutor prioritythreadpoolexecutor)
		{
			if(prioritythreadpoolexecutor == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       14
				throw new IllegalArgumentException("PriorityThreadPoolExecutor must not be null.");
		//    2    4:new             #32  <Class IllegalArgumentException>
		//    3    7:dup             
		//    4    8:ldc1            #155 <String "PriorityThreadPoolExecutor must not be null.">
		//    5   10:invokespecial   #37  <Method void IllegalArgumentException(String)>
		//    6   13:athrow          
			if(threadPoolExecutor != null)
		//*   7   14:aload_0         
		//*   8   15:getfield        #60  <Field PriorityThreadPoolExecutor threadPoolExecutor>
		//*   9   18:ifnull          31
			{
				throw new IllegalStateException("PriorityThreadPoolExecutor already set.");
		//   10   21:new             #47  <Class IllegalStateException>
		//   11   24:dup             
		//   12   25:ldc1            #157 <String "PriorityThreadPoolExecutor already set.">
		//   13   27:invokespecial   #50  <Method void IllegalStateException(String)>
		//   14   30:athrow          
			} else
			{
				threadPoolExecutor = prioritythreadpoolexecutor;
		//   15   31:aload_0         
		//   16   32:aload_1         
		//   17   33:putfield        #60  <Field PriorityThreadPoolExecutor threadPoolExecutor>
				return this;
		//   18   36:aload_0         
		//   19   37:areturn         
			}
		}

		private String appIdentifier;
		private String appInstallIdentifier;
		private final Context context;
		private boolean debuggable;
		private Handler handler;
		private InitializationCallback initializationCallback;
		private Kit kits[];
		private Logger logger;
		private PriorityThreadPoolExecutor threadPoolExecutor;

		public Builder(Context context1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #30  <Method void Object()>
			if(context1 == null)
		//*   2    4:aload_1         
		//*   3    5:ifnonnull       18
			{
				throw new IllegalArgumentException("Context must not be null.");
		//    4    8:new             #32  <Class IllegalArgumentException>
		//    5   11:dup             
		//    6   12:ldc1            #34  <String "Context must not be null.">
		//    7   14:invokespecial   #37  <Method void IllegalArgumentException(String)>
		//    8   17:athrow          
			} else
			{
				context = context1;
		//    9   18:aload_0         
		//   10   19:aload_1         
		//   11   20:putfield        #39  <Field Context context>
				return;
		//   12   23:return          
			}
		}
	}


	Fabric(Context context1, Map map, PriorityThreadPoolExecutor prioritythreadpoolexecutor, Handler handler, Logger logger1, boolean flag, InitializationCallback initializationcallback, 
			IdManager idmanager)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void Object()>
		context = context1.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #68  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #70  <Field Context context>
		kits = map;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #72  <Field Map kits>
		executorService = ((ExecutorService) (prioritythreadpoolexecutor));
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:putfield        #74  <Field ExecutorService executorService>
		mainHandler = handler;
	//   12   22:aload_0         
	//   13   23:aload           4
	//   14   25:putfield        #76  <Field Handler mainHandler>
		logger = logger1;
	//   15   28:aload_0         
	//   16   29:aload           5
	//   17   31:putfield        #78  <Field Logger logger>
		debuggable = flag;
	//   18   34:aload_0         
	//   19   35:iload           6
	//   20   37:putfield        #80  <Field boolean debuggable>
		initializationCallback = initializationcallback;
	//   21   40:aload_0         
	//   22   41:aload           7
	//   23   43:putfield        #82  <Field InitializationCallback initializationCallback>
		initialized = new AtomicBoolean(false);
	//   24   46:aload_0         
	//   25   47:new             #84  <Class AtomicBoolean>
	//   26   50:dup             
	//   27   51:iconst_0        
	//   28   52:invokespecial   #87  <Method void AtomicBoolean(boolean)>
	//   29   55:putfield        #89  <Field AtomicBoolean initialized>
		kitInitializationCallback = createKitInitializationCallback(map.size());
	//   30   58:aload_0         
	//   31   59:aload_0         
	//   32   60:aload_2         
	//   33   61:invokeinterface #95  <Method int Map.size()>
	//   34   66:invokevirtual   #99  <Method InitializationCallback createKitInitializationCallback(int)>
	//   35   69:putfield        #101 <Field InitializationCallback kitInitializationCallback>
		idManager = idmanager;
	//   36   72:aload_0         
	//   37   73:aload           8
	//   38   75:putfield        #103 <Field IdManager idManager>
		setCurrentActivity(extractActivity(context1));
	//   39   78:aload_0         
	//   40   79:aload_0         
	//   41   80:aload_1         
	//   42   81:invokespecial   #107 <Method Activity extractActivity(Context)>
	//   43   84:invokevirtual   #111 <Method Fabric setCurrentActivity(Activity)>
	//   44   87:pop             
	//   45   88:return          
	}

	private static void addToKitMap(Map map, Collection collection)
	{
		collection = ((Collection) (collection.iterator()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #130 <Method Iterator Collection.iterator()>
	//    2    6:astore_1        
		do
		{
			if(!((Iterator) (collection)).hasNext())
				break;
	//    3    7:aload_1         
	//    4    8:invokeinterface #136 <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            61
			Kit kit = (Kit)((Iterator) (collection)).next();
	//    6   16:aload_1         
	//    7   17:invokeinterface #140 <Method Object Iterator.next()>
	//    8   22:checkcast       #142 <Class Kit>
	//    9   25:astore_2        
			map.put(((Object) (((Object) (kit)).getClass())), ((Object) (kit)));
	//   10   26:aload_0         
	//   11   27:aload_2         
	//   12   28:invokevirtual   #146 <Method Class Object.getClass()>
	//   13   31:aload_2         
	//   14   32:invokeinterface #150 <Method Object Map.put(Object, Object)>
	//   15   37:pop             
			if(kit instanceof KitGroup)
	//*  16   38:aload_2         
	//*  17   39:instanceof      #152 <Class KitGroup>
	//*  18   42:ifeq            7
				addToKitMap(map, ((KitGroup)kit).getKits());
	//   19   45:aload_0         
	//   20   46:aload_2         
	//   21   47:checkcast       #152 <Class KitGroup>
	//   22   50:invokeinterface #156 <Method Collection KitGroup.getKits()>
	//   23   55:invokestatic    #158 <Method void addToKitMap(Map, Collection)>
		} while(true);
	//   24   58:goto            7
	//   25   61:return          
	}

	private Activity extractActivity(Context context1)
	{
		if(context1 instanceof Activity)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #161 <Class Activity>
	//*   2    4:ifeq            12
			return (Activity)context1;
	//    3    7:aload_1         
	//    4    8:checkcast       #161 <Class Activity>
	//    5   11:areturn         
		else
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
	}

	public static Kit getKit(Class class1)
	{
		return (Kit)singleton().kits.get(((Object) (class1)));
	//    0    0:invokestatic    #166 <Method Fabric singleton()>
	//    1    3:getfield        #72  <Field Map kits>
	//    2    6:aload_0         
	//    3    7:invokeinterface #170 <Method Object Map.get(Object)>
	//    4   12:checkcast       #142 <Class Kit>
	//    5   15:areturn         
	}

	private static Map getKitMap(Collection collection)
	{
		HashMap hashmap = new HashMap(collection.size());
	//    0    0:new             #173 <Class HashMap>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #174 <Method int Collection.size()>
	//    4   10:invokespecial   #177 <Method void HashMap(int)>
	//    5   13:astore_1        
		addToKitMap(((Map) (hashmap)), collection);
	//    6   14:aload_1         
	//    7   15:aload_0         
	//    8   16:invokestatic    #158 <Method void addToKitMap(Map, Collection)>
		return ((Map) (hashmap));
	//    9   19:aload_1         
	//   10   20:areturn         
	}

	public static Logger getLogger()
	{
		if(singleton == null)
	//*   0    0:getstatic       #182 <Field Fabric singleton>
	//*   1    3:ifnonnull       10
			return DEFAULT_LOGGER;
	//    2    6:getstatic       #59  <Field Logger DEFAULT_LOGGER>
	//    3    9:areturn         
		else
			return singleton.logger;
	//    4   10:getstatic       #182 <Field Fabric singleton>
	//    5   13:getfield        #78  <Field Logger logger>
	//    6   16:areturn         
	}

	private void init()
	{
		activityLifecycleManager = new ActivityLifecycleManager(context);
	//    0    0:aload_0         
	//    1    1:new             #185 <Class ActivityLifecycleManager>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #70  <Field Context context>
	//    5    9:invokespecial   #188 <Method void ActivityLifecycleManager(Context)>
	//    6   12:putfield        #190 <Field ActivityLifecycleManager activityLifecycleManager>
		activityLifecycleManager.registerCallbacks(((ActivityLifecycleManager.Callbacks) (new ActivityLifecycleManager.Callbacks() {

			public void onActivityCreated(Activity activity1, Bundle bundle)
			{
				setCurrentActivity(activity1);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field Fabric this$0>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #24  <Method Fabric Fabric.setCurrentActivity(Activity)>
			//    4    8:pop             
			//    5    9:return          
			}

			public void onActivityResumed(Activity activity1)
			{
				setCurrentActivity(activity1);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field Fabric this$0>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #24  <Method Fabric Fabric.setCurrentActivity(Activity)>
			//    4    8:pop             
			//    5    9:return          
			}

			public void onActivityStarted(Activity activity1)
			{
				setCurrentActivity(activity1);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field Fabric this$0>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #24  <Method Fabric Fabric.setCurrentActivity(Activity)>
			//    4    8:pop             
			//    5    9:return          
			}

			final Fabric this$0;

			
			{
				this$0 = Fabric.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field Fabric this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void ActivityLifecycleManager$Callbacks()>
			//    5    9:return          
			}
		}
)));
	//    7   15:aload_0         
	//    8   16:getfield        #190 <Field ActivityLifecycleManager activityLifecycleManager>
	//    9   19:new             #6   <Class Fabric$1>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokespecial   #193 <Method void Fabric$1(Fabric)>
	//   13   27:invokevirtual   #197 <Method boolean ActivityLifecycleManager.registerCallbacks(ActivityLifecycleManager$Callbacks)>
	//   14   30:pop             
		initializeKits(context);
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #70  <Field Context context>
	//   18   36:invokevirtual   #200 <Method void initializeKits(Context)>
	//   19   39:return          
	}

	public static boolean isDebuggable()
	{
		if(singleton == null)
	//*   0    0:getstatic       #182 <Field Fabric singleton>
	//*   1    3:ifnonnull       8
			return false;
	//    2    6:iconst_0        
	//    3    7:ireturn         
		else
			return singleton.debuggable;
	//    4    8:getstatic       #182 <Field Fabric singleton>
	//    5   11:getfield        #80  <Field boolean debuggable>
	//    6   14:ireturn         
	}

	public static boolean isInitialized()
	{
		return singleton != null && singleton.initialized.get();
	//    0    0:getstatic       #182 <Field Fabric singleton>
	//    1    3:ifnull          20
	//    2    6:getstatic       #182 <Field Fabric singleton>
	//    3    9:getfield        #89  <Field AtomicBoolean initialized>
	//    4   12:invokevirtual   #204 <Method boolean AtomicBoolean.get()>
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
	//    1    1:putstatic       #182 <Field Fabric singleton>
		fabric.init();
	//    2    4:aload_0         
	//    3    5:invokespecial   #207 <Method void init()>
	//    4    8:return          
	}

	static Fabric singleton()
	{
		if(singleton == null)
	//*   0    0:getstatic       #182 <Field Fabric singleton>
	//*   1    3:ifnonnull       16
			throw new IllegalStateException("Must Initialize Fabric before using singleton()");
	//    2    6:new             #209 <Class IllegalStateException>
	//    3    9:dup             
	//    4   10:ldc1            #211 <String "Must Initialize Fabric before using singleton()">
	//    5   12:invokespecial   #214 <Method void IllegalStateException(String)>
	//    6   15:athrow          
		else
			return singleton;
	//    7   16:getstatic       #182 <Field Fabric singleton>
	//    8   19:areturn         
	}

	public static transient Fabric with(Context context1, Kit akit[])
	{
		if(singleton != null) goto _L2; else goto _L1
	//    0    0:getstatic       #182 <Field Fabric singleton>
	//    1    3:ifnonnull       36
_L1:
		io/fabric/sdk/android/Fabric;
	//    2    6:ldc1            #2   <Class Fabric>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
		if(singleton == null)
	//*   4    9:getstatic       #182 <Field Fabric singleton>
	//*   5   12:ifnonnull       33
			setFabric((new Builder(context1)).kits(akit).build());
	//    6   15:new             #10  <Class Fabric$Builder>
	//    7   18:dup             
	//    8   19:aload_0         
	//    9   20:invokespecial   #217 <Method void Fabric$Builder(Context)>
	//   10   23:aload_1         
	//   11   24:invokevirtual   #220 <Method Fabric$Builder Fabric$Builder.kits(Kit[])>
	//   12   27:invokevirtual   #223 <Method Fabric Fabric$Builder.build()>
	//   13   30:invokestatic    #225 <Method void setFabric(Fabric)>
		io/fabric/sdk/android/Fabric;
	//   14   33:ldc1            #2   <Class Fabric>
		JVM INSTR monitorexit ;
	//   15   35:monitorexit     
_L2:
		return singleton;
	//   16   36:getstatic       #182 <Field Fabric singleton>
	//   17   39:areturn         
		context1;
	//   18   40:astore_0        
		io/fabric/sdk/android/Fabric;
	//   19   41:ldc1            #2   <Class Fabric>
		JVM INSTR monitorexit ;
	//   20   43:monitorexit     
		throw context1;
	//   21   44:aload_0         
	//   22   45:athrow          
	}

	public static Fabric with(Fabric fabric)
	{
		if(singleton != null) goto _L2; else goto _L1
	//    0    0:getstatic       #182 <Field Fabric singleton>
	//    1    3:ifnonnull       22
_L1:
		io/fabric/sdk/android/Fabric;
	//    2    6:ldc1            #2   <Class Fabric>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
		if(singleton == null)
	//*   4    9:getstatic       #182 <Field Fabric singleton>
	//*   5   12:ifnonnull       19
			setFabric(fabric);
	//    6   15:aload_0         
	//    7   16:invokestatic    #225 <Method void setFabric(Fabric)>
		io/fabric/sdk/android/Fabric;
	//    8   19:ldc1            #2   <Class Fabric>
		JVM INSTR monitorexit ;
	//    9   21:monitorexit     
_L2:
		return singleton;
	//   10   22:getstatic       #182 <Field Fabric singleton>
	//   11   25:areturn         
		fabric;
	//   12   26:astore_0        
		io/fabric/sdk/android/Fabric;
	//   13   27:ldc1            #2   <Class Fabric>
		JVM INSTR monitorexit ;
	//   14   29:monitorexit     
		throw fabric;
	//   15   30:aload_0         
	//   16   31:athrow          
	}

	void addAnnotatedDependencies(Map map, Kit kit)
	{
		DependsOn dependson = kit.dependsOnAnnotation;
	//    0    0:aload_2         
	//    1    1:getfield        #232 <Field DependsOn Kit.dependsOnAnnotation>
	//    2    4:astore          5
		if(dependson != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          163
		{
			Class aclass[] = dependson.value();
	//    5   11:aload           5
	//    6   13:invokeinterface #238 <Method Class[] DependsOn.value()>
	//    7   18:astore          5
			int j = aclass.length;
	//    8   20:aload           5
	//    9   22:arraylength     
	//   10   23:istore          4
label0:
			for(int i = 0; i < j; i++)
	//*  11   25:iconst_0        
	//*  12   26:istore_3        
	//*  13   27:iload_3         
	//*  14   28:iload           4
	//*  15   30:icmpge          163
			{
				Class class1 = aclass[i];
	//   16   33:aload           5
	//   17   35:iload_3         
	//   18   36:aaload          
	//   19   37:astore          6
				if(class1.isInterface())
	//*  20   39:aload           6
	//*  21   41:invokevirtual   #243 <Method boolean Class.isInterface()>
	//*  22   44:ifeq            110
				{
					Iterator iterator = map.values().iterator();
	//   23   47:aload_1         
	//   24   48:invokeinterface #246 <Method Collection Map.values()>
	//   25   53:invokeinterface #130 <Method Iterator Collection.iterator()>
	//   26   58:astore          7
					do
					{
						Kit kit1;
						do
						{
							if(!iterator.hasNext())
								continue label0;
	//   27   60:aload           7
	//   28   62:invokeinterface #136 <Method boolean Iterator.hasNext()>
	//   29   67:ifeq            156
							kit1 = (Kit)iterator.next();
	//   30   70:aload           7
	//   31   72:invokeinterface #140 <Method Object Iterator.next()>
	//   32   77:checkcast       #142 <Class Kit>
	//   33   80:astore          8
						} while(!class1.isAssignableFrom(((Object) (kit1)).getClass()));
	//   34   82:aload           6
	//   35   84:aload           8
	//   36   86:invokevirtual   #146 <Method Class Object.getClass()>
	//   37   89:invokevirtual   #250 <Method boolean Class.isAssignableFrom(Class)>
	//   38   92:ifeq            60
						kit.initializationTask.addDependency(((io.fabric.sdk.android.services.concurrency.Task) (kit1.initializationTask)));
	//   39   95:aload_2         
	//   40   96:getfield        #254 <Field InitializationTask Kit.initializationTask>
	//   41   99:aload           8
	//   42  101:getfield        #254 <Field InitializationTask Kit.initializationTask>
	//   43  104:invokevirtual   #260 <Method void InitializationTask.addDependency(io.fabric.sdk.android.services.concurrency.Task)>
					} while(true);
	//   44  107:goto            60
				}
				if((Kit)map.get(((Object) (class1))) == null)
	//*  45  110:aload_1         
	//*  46  111:aload           6
	//*  47  113:invokeinterface #170 <Method Object Map.get(Object)>
	//*  48  118:checkcast       #142 <Class Kit>
	//*  49  121:ifnonnull       135
					throw new UnmetDependencyException("Referenced Kit was null, does the kit exist?");
	//   50  124:new             #262 <Class UnmetDependencyException>
	//   51  127:dup             
	//   52  128:ldc2            #264 <String "Referenced Kit was null, does the kit exist?">
	//   53  131:invokespecial   #265 <Method void UnmetDependencyException(String)>
	//   54  134:athrow          
				kit.initializationTask.addDependency(((io.fabric.sdk.android.services.concurrency.Task) (((Kit)map.get(((Object) (class1)))).initializationTask)));
	//   55  135:aload_2         
	//   56  136:getfield        #254 <Field InitializationTask Kit.initializationTask>
	//   57  139:aload_1         
	//   58  140:aload           6
	//   59  142:invokeinterface #170 <Method Object Map.get(Object)>
	//   60  147:checkcast       #142 <Class Kit>
	//   61  150:getfield        #254 <Field InitializationTask Kit.initializationTask>
	//   62  153:invokevirtual   #260 <Method void InitializationTask.addDependency(io.fabric.sdk.android.services.concurrency.Task)>
			}

	//   63  156:iload_3         
	//   64  157:iconst_1        
	//   65  158:iadd            
	//   66  159:istore_3        
		}
	//*  67  160:goto            27
	//   68  163:return          
	}

	InitializationCallback createKitInitializationCallback(final int size)
	{
		return new InitializationCallback() {

			public void failure(Exception exception)
			{
				initializationCallback.failure(exception);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field Fabric this$0>
			//    2    4:invokestatic    #40  <Method InitializationCallback Fabric.access$200(Fabric)>
			//    3    7:aload_1         
			//    4    8:invokeinterface #42  <Method void InitializationCallback.failure(Exception)>
			//    5   13:return          
			}

			public void success(Object obj)
			{
				kitInitializedLatch.countDown();
			//    0    0:aload_0         
			//    1    1:getfield        #33  <Field CountDownLatch kitInitializedLatch>
			//    2    4:invokevirtual   #47  <Method void CountDownLatch.countDown()>
				if(kitInitializedLatch.getCount() == 0L)
			//*   3    7:aload_0         
			//*   4    8:getfield        #33  <Field CountDownLatch kitInitializedLatch>
			//*   5   11:invokevirtual   #51  <Method long CountDownLatch.getCount()>
			//*   6   14:lconst_0        
			//*   7   15:lcmp            
			//*   8   16:ifne            46
				{
					initialized.set(true);
			//    9   19:aload_0         
			//   10   20:getfield        #21  <Field Fabric this$0>
			//   11   23:invokestatic    #55  <Method AtomicBoolean Fabric.access$100(Fabric)>
			//   12   26:iconst_1        
			//   13   27:invokevirtual   #61  <Method void AtomicBoolean.set(boolean)>
					initializationCallback.success(((Object) (Fabric.this)));
			//   14   30:aload_0         
			//   15   31:getfield        #21  <Field Fabric this$0>
			//   16   34:invokestatic    #40  <Method InitializationCallback Fabric.access$200(Fabric)>
			//   17   37:aload_0         
			//   18   38:getfield        #21  <Field Fabric this$0>
			//   19   41:invokeinterface #63  <Method void InitializationCallback.success(Object)>
				}
			//   20   46:return          
			}

			final CountDownLatch kitInitializedLatch;
			final Fabric this$0;
			final int val$size;

			
			{
				this$0 = Fabric.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field Fabric this$0>
				size = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #23  <Field int val$size>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
				kitInitializedLatch = new CountDownLatch(size);
			//    8   14:aload_0         
			//    9   15:new             #28  <Class CountDownLatch>
			//   10   18:dup             
			//   11   19:aload_0         
			//   12   20:getfield        #23  <Field int val$size>
			//   13   23:invokespecial   #31  <Method void CountDownLatch(int)>
			//   14   26:putfield        #33  <Field CountDownLatch kitInitializedLatch>
			//   15   29:return          
			}
		}
;
	//    0    0:new             #8   <Class Fabric$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #269 <Method void Fabric$2(Fabric, int)>
	//    5    9:areturn         
	}

	public ActivityLifecycleManager getActivityLifecycleManager()
	{
		return activityLifecycleManager;
	//    0    0:aload_0         
	//    1    1:getfield        #190 <Field ActivityLifecycleManager activityLifecycleManager>
	//    2    4:areturn         
	}

	public String getAppIdentifier()
	{
		return idManager.getAppIdentifier();
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field IdManager idManager>
	//    2    4:invokevirtual   #278 <Method String IdManager.getAppIdentifier()>
	//    3    7:areturn         
	}

	public String getAppInstallIdentifier()
	{
		return idManager.getAppInstallIdentifier();
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field IdManager idManager>
	//    2    4:invokevirtual   #281 <Method String IdManager.getAppInstallIdentifier()>
	//    3    7:areturn         
	}

	public Activity getCurrentActivity()
	{
		if(activity != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #285 <Field WeakReference activity>
	//*   2    4:ifnull          18
			return (Activity)activity.get();
	//    3    7:aload_0         
	//    4    8:getfield        #285 <Field WeakReference activity>
	//    5   11:invokevirtual   #289 <Method Object WeakReference.get()>
	//    6   14:checkcast       #161 <Class Activity>
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
	//    1    1:getfield        #74  <Field ExecutorService executorService>
	//    2    4:areturn         
	}

	public String getIdentifier()
	{
		return "io.fabric.sdk.android:fabric";
	//    0    0:ldc2            #294 <String "io.fabric.sdk.android:fabric">
	//    1    3:areturn         
	}

	public Collection getKits()
	{
		return kits.values();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Map kits>
	//    2    4:invokeinterface #246 <Method Collection Map.values()>
	//    3    9:areturn         
	}

	Future getKitsFinderFuture(Context context1)
	{
		context1 = ((Context) (new FabricKitsFinder(context1.getPackageCodePath())));
	//    0    0:new             #299 <Class FabricKitsFinder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #302 <Method String Context.getPackageCodePath()>
	//    4    8:invokespecial   #303 <Method void FabricKitsFinder(String)>
	//    5   11:astore_1        
		return getExecutorService().submit(((java.util.concurrent.Callable) (context1)));
	//    6   12:aload_0         
	//    7   13:invokevirtual   #305 <Method ExecutorService getExecutorService()>
	//    8   16:aload_1         
	//    9   17:invokeinterface #311 <Method Future ExecutorService.submit(java.util.concurrent.Callable)>
	//   10   22:areturn         
	}

	public Handler getMainHandler()
	{
		return mainHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Handler mainHandler>
	//    2    4:areturn         
	}

	public String getVersion()
	{
		return "1.3.14.143";
	//    0    0:ldc2            #317 <String "1.3.14.143">
	//    1    3:areturn         
	}

	void initializeKits(Context context1)
	{
		Object obj = ((Object) (getKitsFinderFuture(context1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #319 <Method Future getKitsFinderFuture(Context)>
	//    3    5:astore_2        
		Object obj1 = ((Object) (getKits()));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #320 <Method Collection getKits()>
	//    6   10:astore_3        
		obj = ((Object) (new Onboarding(((Future) (obj)), ((Collection) (obj1)))));
	//    7   11:new             #322 <Class Onboarding>
	//    8   14:dup             
	//    9   15:aload_2         
	//   10   16:aload_3         
	//   11   17:invokespecial   #325 <Method void Onboarding(Future, Collection)>
	//   12   20:astore_2        
		obj1 = ((Object) (new ArrayList(((Collection) (obj1)))));
	//   13   21:new             #327 <Class ArrayList>
	//   14   24:dup             
	//   15   25:aload_3         
	//   16   26:invokespecial   #330 <Method void ArrayList(Collection)>
	//   17   29:astore_3        
		Collections.sort(((List) (obj1)));
	//   18   30:aload_3         
	//   19   31:invokestatic    #336 <Method void Collections.sort(List)>
		((Onboarding) (obj)).injectParameters(context1, this, InitializationCallback.EMPTY, idManager);
	//   20   34:aload_2         
	//   21   35:aload_1         
	//   22   36:aload_0         
	//   23   37:getstatic       #341 <Field InitializationCallback InitializationCallback.EMPTY>
	//   24   40:aload_0         
	//   25   41:getfield        #103 <Field IdManager idManager>
	//   26   44:invokevirtual   #345 <Method void Onboarding.injectParameters(Context, Fabric, InitializationCallback, IdManager)>
		for(Iterator iterator = ((List) (obj1)).iterator(); iterator.hasNext(); ((Kit)iterator.next()).injectParameters(context1, this, kitInitializationCallback, idManager));
	//   27   47:aload_3         
	//   28   48:invokeinterface #348 <Method Iterator List.iterator()>
	//   29   53:astore          4
	//   30   55:aload           4
	//   31   57:invokeinterface #136 <Method boolean Iterator.hasNext()>
	//   32   62:ifeq            91
	//   33   65:aload           4
	//   34   67:invokeinterface #140 <Method Object Iterator.next()>
	//   35   72:checkcast       #142 <Class Kit>
	//   36   75:aload_1         
	//   37   76:aload_0         
	//   38   77:aload_0         
	//   39   78:getfield        #101 <Field InitializationCallback kitInitializationCallback>
	//   40   81:aload_0         
	//   41   82:getfield        #103 <Field IdManager idManager>
	//   42   85:invokevirtual   #349 <Method void Kit.injectParameters(Context, Fabric, InitializationCallback, IdManager)>
	//*  43   88:goto            55
		((Onboarding) (obj)).initialize();
	//   44   91:aload_2         
	//   45   92:invokevirtual   #352 <Method void Onboarding.initialize()>
		if(getLogger().isLoggable("Fabric", 3))
	//*  46   95:invokestatic    #354 <Method Logger getLogger()>
	//*  47   98:ldc1            #23  <String "Fabric">
	//*  48  100:iconst_3        
	//*  49  101:invokeinterface #360 <Method boolean Logger.isLoggable(String, int)>
	//*  50  106:ifeq            237
			context1 = ((Context) ((new StringBuilder("Initializing ")).append(getIdentifier()).append(" [Version: ").append(getVersion()).append("], with the following kits:\n")));
	//   51  109:new             #362 <Class StringBuilder>
	//   52  112:dup             
	//   53  113:ldc2            #364 <String "Initializing ">
	//   54  116:invokespecial   #365 <Method void StringBuilder(String)>
	//   55  119:aload_0         
	//   56  120:invokevirtual   #367 <Method String getIdentifier()>
	//   57  123:invokevirtual   #371 <Method StringBuilder StringBuilder.append(String)>
	//   58  126:ldc2            #373 <String " [Version: ">
	//   59  129:invokevirtual   #371 <Method StringBuilder StringBuilder.append(String)>
	//   60  132:aload_0         
	//   61  133:invokevirtual   #375 <Method String getVersion()>
	//   62  136:invokevirtual   #371 <Method StringBuilder StringBuilder.append(String)>
	//   63  139:ldc2            #377 <String "], with the following kits:\n">
	//   64  142:invokevirtual   #371 <Method StringBuilder StringBuilder.append(String)>
	//   65  145:astore_1        
		else
	//*  66  146:aload_3         
	//*  67  147:invokeinterface #348 <Method Iterator List.iterator()>
	//*  68  152:astore_3        
	//*  69  153:aload_3         
	//*  70  154:invokeinterface #136 <Method boolean Iterator.hasNext()>
	//*  71  159:ifeq            242
	//*  72  162:aload_3         
	//*  73  163:invokeinterface #140 <Method Object Iterator.next()>
	//*  74  168:checkcast       #142 <Class Kit>
	//*  75  171:astore          4
	//*  76  173:aload           4
	//*  77  175:getfield        #254 <Field InitializationTask Kit.initializationTask>
	//*  78  178:aload_2         
	//*  79  179:getfield        #378 <Field InitializationTask Onboarding.initializationTask>
	//*  80  182:invokevirtual   #260 <Method void InitializationTask.addDependency(io.fabric.sdk.android.services.concurrency.Task)>
	//*  81  185:aload_0         
	//*  82  186:aload_0         
	//*  83  187:getfield        #72  <Field Map kits>
	//*  84  190:aload           4
	//*  85  192:invokevirtual   #380 <Method void addAnnotatedDependencies(Map, Kit)>
	//*  86  195:aload           4
	//*  87  197:invokevirtual   #381 <Method void Kit.initialize()>
	//*  88  200:aload_1         
	//*  89  201:ifnull          153
	//*  90  204:aload_1         
	//*  91  205:aload           4
	//*  92  207:invokevirtual   #382 <Method String Kit.getIdentifier()>
	//*  93  210:invokevirtual   #371 <Method StringBuilder StringBuilder.append(String)>
	//*  94  213:ldc2            #373 <String " [Version: ">
	//*  95  216:invokevirtual   #371 <Method StringBuilder StringBuilder.append(String)>
	//*  96  219:aload           4
	//*  97  221:invokevirtual   #383 <Method String Kit.getVersion()>
	//*  98  224:invokevirtual   #371 <Method StringBuilder StringBuilder.append(String)>
	//*  99  227:ldc2            #385 <String "]\n">
	//* 100  230:invokevirtual   #371 <Method StringBuilder StringBuilder.append(String)>
	//* 101  233:pop             
	//* 102  234:goto            153
			context1 = null;
	//  103  237:aconst_null     
	//  104  238:astore_1        
		obj1 = ((Object) (((List) (obj1)).iterator()));
		do
		{
			if(!((Iterator) (obj1)).hasNext())
				break;
			Kit kit = (Kit)((Iterator) (obj1)).next();
			kit.initializationTask.addDependency(((io.fabric.sdk.android.services.concurrency.Task) (((Onboarding) (obj)).initializationTask)));
			addAnnotatedDependencies(kits, kit);
			kit.initialize();
			if(context1 != null)
				((StringBuilder) (context1)).append(kit.getIdentifier()).append(" [Version: ").append(kit.getVersion()).append("]\n");
		} while(true);
	//* 105  239:goto            146
		if(context1 != null)
	//* 106  242:aload_1         
	//* 107  243:ifnull          260
			getLogger().d("Fabric", ((StringBuilder) (context1)).toString());
	//  108  246:invokestatic    #354 <Method Logger getLogger()>
	//  109  249:ldc1            #23  <String "Fabric">
	//  110  251:aload_1         
	//  111  252:invokevirtual   #388 <Method String StringBuilder.toString()>
	//  112  255:invokeinterface #392 <Method void Logger.d(String, String)>
	//  113  260:return          
	}

	public Fabric setCurrentActivity(Activity activity1)
	{
		activity = new WeakReference(((Object) (activity1)));
	//    0    0:aload_0         
	//    1    1:new             #287 <Class WeakReference>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #395 <Method void WeakReference(Object)>
	//    5    9:putfield        #285 <Field WeakReference activity>
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
	//    0    0:new             #54  <Class DefaultLogger>
	//    1    3:dup             
	//    2    4:invokespecial   #57  <Method void DefaultLogger()>
	//    3    7:putstatic       #59  <Field Logger DEFAULT_LOGGER>
	//*   4   10:return          
	}


/*
	static Map access$000(Collection collection)
	{
		return getKitMap(collection);
	//    0    0:aload_0         
	//    1    1:invokestatic    #118 <Method Map getKitMap(Collection)>
	//    2    4:areturn         
	}

*/


/*
	static AtomicBoolean access$100(Fabric fabric)
	{
		return fabric.initialized;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field AtomicBoolean initialized>
	//    2    4:areturn         
	}

*/


/*
	static InitializationCallback access$200(Fabric fabric)
	{
		return fabric.initializationCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field InitializationCallback initializationCallback>
	//    2    4:areturn         
	}

*/
}
