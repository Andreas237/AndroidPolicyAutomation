// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.concurrency.PriorityThreadPoolExecutor;
import java.util.*;
import java.util.concurrent.ExecutorService;

// Referenced classes of package io.fabric.sdk.android:
//			Fabric, DefaultLogger, InitializationCallback, Kit, 
//			Logger

public static class Fabric$Builder
{

	public Fabric$Builder appIdentifier(String s)
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

	public Fabric$Builder appInstallIdentifier(String s)
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
	//*  57  125:invokeinterface #114 <Method java.util.Collection Map.values()>
	//*  58  130:invokespecial   #117 <Method void IdManager(Context, String, String, java.util.Collection)>
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
			obj = ((Object) (Fabric.access$000(((java.util.Collection) (Arrays.asList(((Object []) (kits))))))));
	//   84  182:aload_0         
	//   85  183:getfield        #103 <Field Kit[] kits>
	//   86  186:invokestatic    #127 <Method java.util.List Arrays.asList(Object[])>
	//   87  189:invokestatic    #131 <Method Map Fabric.access$000(java.util.Collection)>
	//   88  192:astore_1        
		idmanager = new IdManager(context, appIdentifier, appInstallIdentifier, ((Map) (obj)).values());
		return new Fabric(context, ((Map) (obj)), threadPoolExecutor, handler, logger, debuggable, initializationCallback, idmanager);
	//*  89  193:goto            108
	}

	public Fabric$Builder debuggable(boolean flag)
	{
		debuggable = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #83  <Field boolean debuggable>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Fabric$Builder executorService(ExecutorService executorservice)
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public Fabric$Builder handler(Handler handler1)
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public Fabric$Builder initializationCallback(InitializationCallback initializationcallback)
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

	public transient Fabric$Builder kits(Kit akit[])
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

	public Fabric$Builder logger(Logger logger1)
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

	public Fabric$Builder threadPoolExecutor(PriorityThreadPoolExecutor prioritythreadpoolexecutor)
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

	public Fabric$Builder(Context context1)
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
