// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import android.content.Context;
import java.lang.reflect.Constructor;

// Referenced classes of package androidx.work:
//			Logger, ListenableWorker, WorkerParameters

public abstract class WorkerFactory
{

	public WorkerFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
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
	//    2    4:invokespecial   #31  <Method void WorkerFactory$1()>
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
	//    4    4:invokevirtual   #43  <Method ListenableWorker createWorker(Context, String, WorkerParameters)>
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
	//   11   18:invokestatic    #49  <Method Class Class.forName(String)>
	//   12   21:ldc1            #51  <Class ListenableWorker>
	//   13   23:invokevirtual   #55  <Method Class Class.asSubclass(Class)>
	//   14   26:astore          4
		}
	//*  15   28:aload           4
	//*  16   30:iconst_2        
	//*  17   31:anewarray       Class[]
	//*  18   34:dup             
	//*  19   35:iconst_0        
	//*  20   36:ldc1            #57  <Class Context>
	//*  21   38:aastore         
	//*  22   39:dup             
	//*  23   40:iconst_1        
	//*  24   41:ldc1            #59  <Class WorkerParameters>
	//*  25   43:aastore         
	//*  26   44:invokevirtual   #63  <Method Constructor Class.getDeclaredConstructor(Class[])>
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
	//*  37   59:invokevirtual   #69  <Method Object Constructor.newInstance(Object[])>
	//*  38   62:checkcast       #51  <Class ListenableWorker>
	//*  39   65:astore_1        
	//*  40   66:aload_1         
	//*  41   67:areturn         
	//*  42   68:astore_1        
	//*  43   69:invokestatic    #73  <Method Logger Logger.get()>
	//*  44   72:astore_3        
	//*  45   73:getstatic       #20  <Field String TAG>
	//*  46   76:astore          4
	//*  47   78:new             #75  <Class StringBuilder>
	//*  48   81:dup             
	//*  49   82:invokespecial   #76  <Method void StringBuilder()>
	//*  50   85:astore          5
	//*  51   87:aload           5
	//*  52   89:ldc1            #78  <String "Could not instantiate ">
	//*  53   91:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//*  54   94:pop             
	//*  55   95:aload           5
	//*  56   97:aload_2         
	//*  57   98:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//*  58  101:pop             
	//*  59  102:aload_3         
	//*  60  103:aload           4
	//*  61  105:aload           5
	//*  62  107:invokevirtual   #86  <Method String StringBuilder.toString()>
	//*  63  110:iconst_1        
	//*  64  111:anewarray       Throwable[]
	//*  65  114:dup             
	//*  66  115:iconst_0        
	//*  67  116:aload_1         
	//*  68  117:aastore         
	//*  69  118:invokevirtual   #92  <Method void Logger.error(String, String, Throwable[])>
	//*  70  121:aconst_null     
	//*  71  122:areturn         
	//*  72  123:invokestatic    #73  <Method Logger Logger.get()>
	//*  73  126:astore_1        
	//*  74  127:getstatic       #20  <Field String TAG>
	//*  75  130:astore_3        
	//*  76  131:new             #75  <Class StringBuilder>
	//*  77  134:dup             
	//*  78  135:invokespecial   #76  <Method void StringBuilder()>
	//*  79  138:astore          4
	//*  80  140:aload           4
	//*  81  142:ldc1            #94  <String "Class not found: ">
	//*  82  144:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//*  83  147:pop             
	//*  84  148:aload           4
	//*  85  150:aload_2         
	//*  86  151:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//*  87  154:pop             
	//*  88  155:aload_1         
	//*  89  156:aload_3         
	//*  90  157:aload           4
	//*  91  159:invokevirtual   #86  <Method String StringBuilder.toString()>
	//*  92  162:iconst_0        
	//*  93  163:anewarray       Throwable[]
	//*  94  166:invokevirtual   #92  <Method void Logger.error(String, String, Throwable[])>
	//*  95  169:aconst_null     
	//*  96  170:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			context = ((Context) (Logger.get()));
			workerparameters = ((WorkerParameters) (TAG));
			obj = ((Object) (new StringBuilder()));
			((StringBuilder) (obj)).append("Class not found: ");
			((StringBuilder) (obj)).append(s);
			((Logger) (context)).error(((String) (workerparameters)), ((StringBuilder) (obj)).toString(), new Throwable[0]);
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
			workerparameters = ((WorkerParameters) (Logger.get()));
			obj = ((Object) (TAG));
			StringBuilder stringbuilder = new StringBuilder();
			stringbuilder.append("Could not instantiate ");
			stringbuilder.append(s);
			((Logger) (workerparameters)).error(((String) (obj)), stringbuilder.toString(), new Throwable[] {
				context
			});
			return null;
		}
		return ((ListenableWorker) (context));
	//*  97  171:astore_1        
	//*  98  172:goto            123
	}

	private static final String TAG = Logger.tagWithPrefix("WorkerFactory");

	static 
	{
	//    0    0:ldc1            #12  <String "WorkerFactory">
	//    1    2:invokestatic    #18  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #20  <Field String TAG>
	//*   3    8:return          
	}
}
