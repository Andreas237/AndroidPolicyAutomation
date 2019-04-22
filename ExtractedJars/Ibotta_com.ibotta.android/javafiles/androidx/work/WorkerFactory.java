// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import android.content.Context;
import java.lang.reflect.Constructor;

// Referenced classes of package androidx.work:
//			ListenableWorker, WorkerParameters, Logger

public abstract class WorkerFactory
{

	public WorkerFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public static WorkerFactory getDefaultWorkerFactory()
	{
		return ((WorkerFactory) (new WorkerFactory() {

			public ListenableWorker createWorker(Context context, String s, WorkerParameters workerparameters)
			{
				return null;
			//    0    0:aconst_null     
			//    1    1:areturn         
			}

		}
));
	//    0    0:new             #6   <Class WorkerFactory$1>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void WorkerFactory$1()>
	//    3    7:areturn         
	}

	public abstract ListenableWorker createWorker(Context context, String s, WorkerParameters workerparameters);

	public final ListenableWorker createWorkerWithDefaultFallback(Context context, String s, WorkerParameters workerparameters)
	{
		Object obj = ((Object) (createWorker(context, s, workerparameters)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #30  <Method ListenableWorker createWorker(Context, String, WorkerParameters)>
	//    5    7:astore          4
		if(obj != null)
	//*   6    9:aload           4
	//*   7   11:ifnull          17
			return ((ListenableWorker) (obj));
	//    8   14:aload           4
	//    9   16:areturn         
		try
		{
			obj = ((Object) (Class.forName(s).asSubclass(androidx/work/ListenableWorker)));
	//   10   17:aload_2         
	//   11   18:invokestatic    #36  <Method Class Class.forName(String)>
	//   12   21:ldc1            #38  <Class ListenableWorker>
	//   13   23:invokevirtual   #42  <Method Class Class.asSubclass(Class)>
	//   14   26:astore          4
		}
	//*  15   28:aload           4
	//*  16   30:iconst_2        
	//*  17   31:anewarray       Class[]
	//*  18   34:dup             
	//*  19   35:iconst_0        
	//*  20   36:ldc1            #44  <Class Context>
	//*  21   38:aastore         
	//*  22   39:dup             
	//*  23   40:iconst_1        
	//*  24   41:ldc1            #46  <Class WorkerParameters>
	//*  25   43:aastore         
	//*  26   44:invokevirtual   #50  <Method Constructor Class.getDeclaredConstructor(Class[])>
	//*  27   47:iconst_2        
	//*  28   48:anewarray       Object[]
	//*  29   51:dup             
	//*  30   52:iconst_0        
	//*  31   53:aload_1         
	//*  32   54:aastore         
	//*  33   55:dup             
	//*  34   56:iconst_1        
	//*  35   57:aload_3         
	//*  36   58:aastore         
	//*  37   59:invokevirtual   #56  <Method Object Constructor.newInstance(Object[])>
	//*  38   62:checkcast       #38  <Class ListenableWorker>
	//*  39   65:astore_1        
	//*  40   66:aload_1         
	//*  41   67:areturn         
	//*  42   68:astore_1        
	//*  43   69:new             #58  <Class StringBuilder>
	//*  44   72:dup             
	//*  45   73:invokespecial   #59  <Method void StringBuilder()>
	//*  46   76:astore_3        
	//*  47   77:aload_3         
	//*  48   78:ldc1            #61  <String "Could not instantiate ">
	//*  49   80:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//*  50   83:pop             
	//*  51   84:aload_3         
	//*  52   85:aload_2         
	//*  53   86:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//*  54   89:pop             
	//*  55   90:ldc1            #67  <String "WorkerFactory">
	//*  56   92:aload_3         
	//*  57   93:invokevirtual   #71  <Method String StringBuilder.toString()>
	//*  58   96:iconst_1        
	//*  59   97:anewarray       Throwable[]
	//*  60  100:dup             
	//*  61  101:iconst_0        
	//*  62  102:aload_1         
	//*  63  103:aastore         
	//*  64  104:invokestatic    #79  <Method void Logger.error(String, String, Throwable[])>
	//*  65  107:aconst_null     
	//*  66  108:areturn         
	//*  67  109:new             #58  <Class StringBuilder>
	//*  68  112:dup             
	//*  69  113:invokespecial   #59  <Method void StringBuilder()>
	//*  70  116:astore_1        
	//*  71  117:aload_1         
	//*  72  118:ldc1            #81  <String "Class not found: ">
	//*  73  120:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//*  74  123:pop             
	//*  75  124:aload_1         
	//*  76  125:aload_2         
	//*  77  126:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//*  78  129:pop             
	//*  79  130:ldc1            #67  <String "WorkerFactory">
	//*  80  132:aload_1         
	//*  81  133:invokevirtual   #71  <Method String StringBuilder.toString()>
	//*  82  136:iconst_0        
	//*  83  137:anewarray       Throwable[]
	//*  84  140:invokestatic    #79  <Method void Logger.error(String, String, Throwable[])>
	//*  85  143:aconst_null     
	//*  86  144:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			context = ((Context) (new StringBuilder()));
			((StringBuilder) (context)).append("Class not found: ");
			((StringBuilder) (context)).append(s);
			Logger.error("WorkerFactory", ((StringBuilder) (context)).toString(), new Throwable[0]);
			return null;
		}
		try
		{
			context = ((Context) ((ListenableWorker)((Class) (obj)).getDeclaredConstructor(new Class[] {
				android/content/Context, androidx/work/WorkerParameters
			}).newInstance(new Object[] {
				context, workerparameters
			})));
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			workerparameters = ((WorkerParameters) (new StringBuilder()));
			((StringBuilder) (workerparameters)).append("Could not instantiate ");
			((StringBuilder) (workerparameters)).append(s);
			Logger.error("WorkerFactory", ((StringBuilder) (workerparameters)).toString(), new Throwable[] {
				context
			});
			return null;
		}
		return ((ListenableWorker) (context));
	//*  87  145:astore_1        
	//*  88  146:goto            109
	}
}
