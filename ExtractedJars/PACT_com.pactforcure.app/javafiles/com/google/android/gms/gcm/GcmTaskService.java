// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.gcm;

import android.app.Service;
import android.content.Intent;
import android.os.*;
import android.util.Log;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.gcm:
//			PendingCallback, TaskParams, zzb

public abstract class GcmTaskService extends Service
{
	private class zza
		implements Runnable
	{

		public void run()
		{
			int i = zzbfV.onRunTask(new TaskParams(mTag, mExtras));
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field GcmTaskService zzbfV>
		//    2    4:new             #42  <Class TaskParams>
		//    3    7:dup             
		//    4    8:aload_0         
		//    5    9:getfield        #26  <Field String mTag>
		//    6   12:aload_0         
		//    7   13:getfield        #36  <Field Bundle mExtras>
		//    8   16:invokespecial   #45  <Method void TaskParams(String, Bundle)>
		//    9   19:invokevirtual   #49  <Method int GcmTaskService.onRunTask(TaskParams)>
		//   10   22:istore_1        
			zzbfU.zzjt(i);
		//   11   23:aload_0         
		//   12   24:getfield        #34  <Field zzb zzbfU>
		//   13   27:iload_1         
		//   14   28:invokeinterface #55  <Method void zzb.zzjt(int)>
			GcmTaskService.zza(zzbfV, mTag);
		//   15   33:aload_0         
		//   16   34:getfield        #21  <Field GcmTaskService zzbfV>
		//   17   37:aload_0         
		//   18   38:getfield        #26  <Field String mTag>
		//   19   41:invokestatic    #58  <Method void GcmTaskService.zza(GcmTaskService, String)>
			return;
		//   20   44:return          
			Object obj;
			obj;
		//   21   45:astore_2        
			String s;
			s = String.valueOf(((Object) (mTag)));
		//   22   46:aload_0         
		//   23   47:getfield        #26  <Field String mTag>
		//   24   50:invokestatic    #64  <Method String String.valueOf(Object)>
		//   25   53:astore_2        
			if(s.length() == 0)
				break MISSING_BLOCK_LABEL_87;
		//   26   54:aload_2         
		//   27   55:invokevirtual   #68  <Method int String.length()>
		//   28   58:ifeq            87
			s = "Error reporting result of operation to scheduler for ".concat(s);
		//   29   61:ldc1            #70  <String "Error reporting result of operation to scheduler for ">
		//   30   63:aload_2         
		//   31   64:invokevirtual   #74  <Method String String.concat(String)>
		//   32   67:astore_2        
_L1:
			Log.e("GcmTaskService", s);
		//   33   68:ldc1            #76  <String "GcmTaskService">
		//   34   70:aload_2         
		//   35   71:invokestatic    #82  <Method int Log.e(String, String)>
		//   36   74:pop             
			GcmTaskService.zza(zzbfV, mTag);
		//   37   75:aload_0         
		//   38   76:getfield        #21  <Field GcmTaskService zzbfV>
		//   39   79:aload_0         
		//   40   80:getfield        #26  <Field String mTag>
		//   41   83:invokestatic    #58  <Method void GcmTaskService.zza(GcmTaskService, String)>
			return;
		//   42   86:return          
			s = new String("Error reporting result of operation to scheduler for ");
		//   43   87:new             #60  <Class String>
		//   44   90:dup             
		//   45   91:ldc1            #70  <String "Error reporting result of operation to scheduler for ">
		//   46   93:invokespecial   #85  <Method void String(String)>
		//   47   96:astore_2        
			  goto _L1
		//*  48   97:goto            68
			s;
		//   49  100:astore_2        
			GcmTaskService.zza(zzbfV, mTag);
		//   50  101:aload_0         
		//   51  102:getfield        #21  <Field GcmTaskService zzbfV>
		//   52  105:aload_0         
		//   53  106:getfield        #26  <Field String mTag>
		//   54  109:invokestatic    #58  <Method void GcmTaskService.zza(GcmTaskService, String)>
			throw s;
		//   55  112:aload_2         
		//   56  113:athrow          
		}

		private final Bundle mExtras;
		private final String mTag;
		private final zzb zzbfU;
		final GcmTaskService zzbfV;

		zza(String s, IBinder ibinder, Bundle bundle)
		{
			zzbfV = GcmTaskService.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field GcmTaskService zzbfV>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #24  <Method void Object()>
			mTag = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #26  <Field String mTag>
			zzbfU = zzb.zza.zzcV(ibinder);
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:invokestatic    #32  <Method zzb zzb$zza.zzcV(IBinder)>
		//   11   19:putfield        #34  <Field zzb zzbfU>
			mExtras = bundle;
		//   12   22:aload_0         
		//   13   23:aload           4
		//   14   25:putfield        #36  <Field Bundle mExtras>
		//   15   28:return          
		}
	}


	public GcmTaskService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Service()>
	//    2    4:aload_0         
	//    3    5:new             #32  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void HashSet()>
	//    6   12:putfield        #35  <Field Set zzbfR>
	//    7   15:return          
	}

	static void zza(GcmTaskService gcmtaskservice, String s)
	{
		gcmtaskservice.zzeH(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #41  <Method void zzeH(String)>
	//    3    5:return          
	}

	private void zzeH(String s)
	{
		synchronized(zzbfR)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Set zzbfR>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzbfR.remove(((Object) (s)));
	//    5    7:aload_0         
	//    6    8:getfield        #35  <Field Set zzbfR>
	//    7   11:aload_1         
	//    8   12:invokeinterface #47  <Method boolean Set.remove(Object)>
	//    9   17:pop             
			if(zzbfR.size() == 0)
	//*  10   18:aload_0         
	//*  11   19:getfield        #35  <Field Set zzbfR>
	//*  12   22:invokeinterface #51  <Method int Set.size()>
	//*  13   27:ifne            38
				stopSelf(zzbfS);
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:getfield        #53  <Field int zzbfS>
	//   17   35:invokevirtual   #57  <Method void stopSelf(int)>
		}
	//   18   38:aload_2         
	//   19   39:monitorexit     
		return;
	//   20   40:return          
		s;
	//   21   41:astore_1        
		set;
	//   22   42:aload_2         
		JVM INSTR monitorexit ;
	//   23   43:monitorexit     
		throw s;
	//   24   44:aload_1         
	//   25   45:athrow          
	}

	private void zzjs(int i)
	{
		synchronized(zzbfR)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Set zzbfR>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzbfS = i;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #53  <Field int zzbfS>
			if(zzbfR.size() == 0)
	//*   8   12:aload_0         
	//*   9   13:getfield        #35  <Field Set zzbfR>
	//*  10   16:invokeinterface #51  <Method int Set.size()>
	//*  11   21:ifne            32
				stopSelf(zzbfS);
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #53  <Field int zzbfS>
	//   15   29:invokevirtual   #57  <Method void stopSelf(int)>
		}
	//   16   32:aload_2         
	//   17   33:monitorexit     
		return;
	//   18   34:return          
		exception;
	//   19   35:astore_3        
		set;
	//   20   36:aload_2         
		JVM INSTR monitorexit ;
	//   21   37:monitorexit     
		throw exception;
	//   22   38:aload_3         
	//   23   39:athrow          
	}

	public IBinder onBind(Intent intent)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void onCreate()
	{
		super.onCreate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void Service.onCreate()>
		zzqt = zzGd();
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #68  <Method ExecutorService zzGd()>
	//    5    9:putfield        #70  <Field ExecutorService zzqt>
	//    6   12:return          
	}

	public void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #74  <Method void Service.onDestroy()>
		List list = zzqt.shutdownNow();
	//    2    4:aload_0         
	//    3    5:getfield        #70  <Field ExecutorService zzqt>
	//    4    8:invokeinterface #80  <Method List ExecutorService.shutdownNow()>
	//    5   13:astore_2        
		if(!list.isEmpty())
	//*   6   14:aload_2         
	//*   7   15:invokeinterface #86  <Method boolean List.isEmpty()>
	//*   8   20:ifne            57
		{
			int i = list.size();
	//    9   23:aload_2         
	//   10   24:invokeinterface #87  <Method int List.size()>
	//   11   29:istore_1        
			Log.e("GcmTaskService", (new StringBuilder(79)).append("Shutting down, but not all tasks are finished executing. Remaining: ").append(i).toString());
	//   12   30:ldc1            #89  <String "GcmTaskService">
	//   13   32:new             #91  <Class StringBuilder>
	//   14   35:dup             
	//   15   36:bipush          79
	//   16   38:invokespecial   #93  <Method void StringBuilder(int)>
	//   17   41:ldc1            #95  <String "Shutting down, but not all tasks are finished executing. Remaining: ">
	//   18   43:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   19   46:iload_1         
	//   20   47:invokevirtual   #102 <Method StringBuilder StringBuilder.append(int)>
	//   21   50:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   22   53:invokestatic    #112 <Method int Log.e(String, String)>
	//   23   56:pop             
		}
	//   24   57:return          
	}

	public void onInitializeTasks()
	{
	//    0    0:return          
	}

	public abstract int onRunTask(TaskParams taskparams);

	public int onStartCommand(Intent intent, int i, int j)
	{
		if(intent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       11
		{
			zzjs(j);
	//    2    4:aload_0         
	//    3    5:iload_3         
	//    4    6:invokespecial   #119 <Method void zzjs(int)>
			return 2;
	//    5    9:iconst_2        
	//    6   10:ireturn         
		}
		intent.setExtrasClassLoader(((Class) (com/google/android/gms/gcm/PendingCallback)).getClassLoader());
	//    7   11:aload_1         
	//    8   12:ldc1            #121 <Class PendingCallback>
	//    9   14:invokevirtual   #127 <Method ClassLoader Class.getClassLoader()>
	//   10   17:invokevirtual   #133 <Method void Intent.setExtrasClassLoader(ClassLoader)>
		obj = ((Object) (intent.getAction()));
	//   11   20:aload_1         
	//   12   21:invokevirtual   #136 <Method String Intent.getAction()>
	//   13   24:astore          4
		if(!"com.google.android.gms.gcm.ACTION_TASK_READY".equals(obj)) goto _L2; else goto _L1
	//   14   26:ldc1            #13  <String "com.google.android.gms.gcm.ACTION_TASK_READY">
	//   15   28:aload           4
	//   16   30:invokevirtual   #141 <Method boolean String.equals(Object)>
	//   17   33:ifeq            293
_L1:
		Object obj1;
		Bundle bundle;
		obj = ((Object) (intent.getStringExtra("tag")));
	//   18   36:aload_1         
	//   19   37:ldc1            #143 <String "tag">
	//   20   39:invokevirtual   #147 <Method String Intent.getStringExtra(String)>
	//   21   42:astore          4
		obj1 = ((Object) (intent.getParcelableExtra("callback")));
	//   22   44:aload_1         
	//   23   45:ldc1            #149 <String "callback">
	//   24   47:invokevirtual   #153 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   25   50:astore          5
		bundle = (Bundle)intent.getParcelableExtra("extras");
	//   26   52:aload_1         
	//   27   53:ldc1            #155 <String "extras">
	//   28   55:invokevirtual   #153 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   29   58:checkcast       #157 <Class Bundle>
	//   30   61:astore          6
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_76;
	//   31   63:aload           5
	//   32   65:ifnull          76
		if(obj1 instanceof PendingCallback)
			break MISSING_BLOCK_LABEL_145;
	//   33   68:aload           5
	//   34   70:instanceof      #121 <Class PendingCallback>
	//   35   73:ifne            145
		intent = ((Intent) (String.valueOf(((Object) (getPackageName())))));
	//   36   76:aload_0         
	//   37   77:invokevirtual   #160 <Method String getPackageName()>
	//   38   80:invokestatic    #164 <Method String String.valueOf(Object)>
	//   39   83:astore_1        
		Log.e("GcmTaskService", (new StringBuilder(String.valueOf(((Object) (intent))).length() + 47 + String.valueOf(obj).length())).append(((String) (intent))).append(" ").append(((String) (obj))).append(": Could not process request, invalid callback.").toString());
	//   40   84:ldc1            #89  <String "GcmTaskService">
	//   41   86:new             #91  <Class StringBuilder>
	//   42   89:dup             
	//   43   90:aload_1         
	//   44   91:invokestatic    #164 <Method String String.valueOf(Object)>
	//   45   94:invokevirtual   #167 <Method int String.length()>
	//   46   97:bipush          47
	//   47   99:iadd            
	//   48  100:aload           4
	//   49  102:invokestatic    #164 <Method String String.valueOf(Object)>
	//   50  105:invokevirtual   #167 <Method int String.length()>
	//   51  108:iadd            
	//   52  109:invokespecial   #93  <Method void StringBuilder(int)>
	//   53  112:aload_1         
	//   54  113:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   55  116:ldc1            #169 <String " ">
	//   56  118:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   57  121:aload           4
	//   58  123:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   59  126:ldc1            #171 <String ": Could not process request, invalid callback.">
	//   60  128:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   61  131:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   62  134:invokestatic    #112 <Method int Log.e(String, String)>
	//   63  137:pop             
		zzjs(j);
	//   64  138:aload_0         
	//   65  139:iload_3         
	//   66  140:invokespecial   #119 <Method void zzjs(int)>
		return 2;
	//   67  143:iconst_2        
	//   68  144:ireturn         
label0:
		{
			synchronized(zzbfR)
	//*  69  145:aload_0         
	//*  70  146:getfield        #35  <Field Set zzbfR>
	//*  71  149:astore_1        
	//*  72  150:aload_1         
	//*  73  151:monitorenter    
			{
				if(zzbfR.add(obj))
					break label0;
	//   74  152:aload_0         
	//   75  153:getfield        #35  <Field Set zzbfR>
	//   76  156:aload           4
	//   77  158:invokeinterface #174 <Method boolean Set.add(Object)>
	//   78  163:ifne            240
				obj1 = ((Object) (String.valueOf(((Object) (getPackageName())))));
	//   79  166:aload_0         
	//   80  167:invokevirtual   #160 <Method String getPackageName()>
	//   81  170:invokestatic    #164 <Method String String.valueOf(Object)>
	//   82  173:astore          5
				Log.w("GcmTaskService", (new StringBuilder(String.valueOf(obj1).length() + 44 + String.valueOf(obj).length())).append(((String) (obj1))).append(" ").append(((String) (obj))).append(": Task already running, won't start another").toString());
	//   83  175:ldc1            #89  <String "GcmTaskService">
	//   84  177:new             #91  <Class StringBuilder>
	//   85  180:dup             
	//   86  181:aload           5
	//   87  183:invokestatic    #164 <Method String String.valueOf(Object)>
	//   88  186:invokevirtual   #167 <Method int String.length()>
	//   89  189:bipush          44
	//   90  191:iadd            
	//   91  192:aload           4
	//   92  194:invokestatic    #164 <Method String String.valueOf(Object)>
	//   93  197:invokevirtual   #167 <Method int String.length()>
	//   94  200:iadd            
	//   95  201:invokespecial   #93  <Method void StringBuilder(int)>
	//   96  204:aload           5
	//   97  206:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   98  209:ldc1            #169 <String " ">
	//   99  211:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  100  214:aload           4
	//  101  216:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  102  219:ldc1            #176 <String ": Task already running, won't start another">
	//  103  221:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  104  224:invokevirtual   #106 <Method String StringBuilder.toString()>
	//  105  227:invokestatic    #179 <Method int Log.w(String, String)>
	//  106  230:pop             
			}
	//  107  231:aload_1         
	//  108  232:monitorexit     
			zzjs(j);
	//  109  233:aload_0         
	//  110  234:iload_3         
	//  111  235:invokespecial   #119 <Method void zzjs(int)>
			return 2;
	//  112  238:iconst_2        
	//  113  239:ireturn         
		}
		intent;
	//  114  240:aload_1         
		JVM INSTR monitorexit ;
	//  115  241:monitorexit     
		zzqt.execute(((Runnable) (new zza(((String) (obj)), ((PendingCallback)obj1).getIBinder(), bundle))));
	//  116  242:aload_0         
	//  117  243:getfield        #70  <Field ExecutorService zzqt>
	//  118  246:new             #8   <Class GcmTaskService$zza>
	//  119  249:dup             
	//  120  250:aload_0         
	//  121  251:aload           4
	//  122  253:aload           5
	//  123  255:checkcast       #121 <Class PendingCallback>
	//  124  258:invokevirtual   #183 <Method IBinder PendingCallback.getIBinder()>
	//  125  261:aload           6
	//  126  263:invokespecial   #186 <Method void GcmTaskService$zza(GcmTaskService, String, IBinder, Bundle)>
	//  127  266:invokeinterface #190 <Method void ExecutorService.execute(Runnable)>
_L3:
		zzjs(j);
	//  128  271:aload_0         
	//  129  272:iload_3         
	//  130  273:invokespecial   #119 <Method void zzjs(int)>
		return 2;
	//  131  276:iconst_2        
	//  132  277:ireturn         
		obj;
	//  133  278:astore          4
		intent;
	//  134  280:aload_1         
		JVM INSTR monitorexit ;
	//  135  281:monitorexit     
		throw obj;
	//  136  282:aload           4
	//  137  284:athrow          
		intent;
	//  138  285:astore_1        
		zzjs(j);
	//  139  286:aload_0         
	//  140  287:iload_3         
	//  141  288:invokespecial   #119 <Method void zzjs(int)>
		throw intent;
	//  142  291:aload_1         
	//  143  292:athrow          
_L2:
label1:
		{
			if(!"com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(obj))
				break label1;
	//  144  293:ldc1            #16  <String "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE">
	//  145  295:aload           4
	//  146  297:invokevirtual   #141 <Method boolean String.equals(Object)>
	//  147  300:ifeq            310
			onInitializeTasks();
	//  148  303:aload_0         
	//  149  304:invokevirtual   #192 <Method void onInitializeTasks()>
		}
		  goto _L3
	//* 150  307:goto            271
		Log.e("GcmTaskService", (new StringBuilder(String.valueOf(obj).length() + 37)).append("Unknown action received ").append(((String) (obj))).append(", terminating").toString());
	//  151  310:ldc1            #89  <String "GcmTaskService">
	//  152  312:new             #91  <Class StringBuilder>
	//  153  315:dup             
	//  154  316:aload           4
	//  155  318:invokestatic    #164 <Method String String.valueOf(Object)>
	//  156  321:invokevirtual   #167 <Method int String.length()>
	//  157  324:bipush          37
	//  158  326:iadd            
	//  159  327:invokespecial   #93  <Method void StringBuilder(int)>
	//  160  330:ldc1            #194 <String "Unknown action received ">
	//  161  332:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  162  335:aload           4
	//  163  337:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  164  340:ldc1            #196 <String ", terminating">
	//  165  342:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//  166  345:invokevirtual   #106 <Method String StringBuilder.toString()>
	//  167  348:invokestatic    #112 <Method int Log.e(String, String)>
	//  168  351:pop             
		  goto _L3
	//* 169  352:goto            271
	}

	protected ExecutorService zzGd()
	{
		return Executors.newFixedThreadPool(2, new ThreadFactory() {

			public Thread newThread(Runnable runnable)
			{
				int i = zzbfT.getAndIncrement();
			//    0    0:aload_0         
			//    1    1:getfield        #25  <Field AtomicInteger zzbfT>
			//    2    4:invokevirtual   #33  <Method int AtomicInteger.getAndIncrement()>
			//    3    7:istore_2        
				runnable = ((Runnable) (new Thread(runnable, (new StringBuilder(20)).append("gcm-task#").append(i).toString())));
			//    4    8:new             #35  <Class Thread>
			//    5   11:dup             
			//    6   12:aload_1         
			//    7   13:new             #37  <Class StringBuilder>
			//    8   16:dup             
			//    9   17:bipush          20
			//   10   19:invokespecial   #38  <Method void StringBuilder(int)>
			//   11   22:ldc1            #40  <String "gcm-task#">
			//   12   24:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
			//   13   27:iload_2         
			//   14   28:invokevirtual   #47  <Method StringBuilder StringBuilder.append(int)>
			//   15   31:invokevirtual   #51  <Method String StringBuilder.toString()>
			//   16   34:invokespecial   #54  <Method void Thread(Runnable, String)>
			//   17   37:astore_1        
				((Thread) (runnable)).setPriority(4);
			//   18   38:aload_1         
			//   19   39:iconst_4        
			//   20   40:invokevirtual   #57  <Method void Thread.setPriority(int)>
				return ((Thread) (runnable));
			//   21   43:aload_1         
			//   22   44:areturn         
			}

			private final AtomicInteger zzbfT = new AtomicInteger(1);

			
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #18  <Method void Object()>
			//    2    4:aload_0         
			//    3    5:new             #20  <Class AtomicInteger>
			//    4    8:dup             
			//    5    9:iconst_1        
			//    6   10:invokespecial   #23  <Method void AtomicInteger(int)>
			//    7   13:putfield        #25  <Field AtomicInteger zzbfT>
			//    8   16:return          
			}
		}
);
	//    0    0:iconst_2        
	//    1    1:new             #6   <Class GcmTaskService$1>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #199 <Method void GcmTaskService$1(GcmTaskService)>
	//    5    9:invokestatic    #205 <Method ExecutorService Executors.newFixedThreadPool(int, ThreadFactory)>
	//    6   12:areturn         
	}

	public static final String SERVICE_ACTION_EXECUTE_TASK = "com.google.android.gms.gcm.ACTION_TASK_READY";
	public static final String SERVICE_ACTION_INITIALIZE = "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE";
	public static final String SERVICE_PERMISSION = "com.google.android.gms.permission.BIND_NETWORK_TASK_SERVICE";
	private final Set zzbfR = new HashSet();
	private int zzbfS;
	private ExecutorService zzqt;
}
