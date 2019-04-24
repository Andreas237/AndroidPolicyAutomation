// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.health;

import android.content.Context;
import android.os.Process;
import android.os.StrictMode;
import com.huawei.hidatamanager.HiDataManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.squareup.leakcanary.*;
import o.*;

// Referenced classes of package com.huawei.health:
//			LeakUploadService

public class HealthApplication extends BaseApplication
{

	public HealthApplication()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void BaseApplication()>
	//    2    4:return          
	}

	private void a(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            43
		{
			StrictMode.setThreadPolicy((new android.os.StrictMode.ThreadPolicy.Builder()).detectAll().penaltyLog().build());
	//    2    4:new             #16  <Class android.os.StrictMode$ThreadPolicy$Builder>
	//    3    7:dup             
	//    4    8:invokespecial   #17  <Method void android.os.StrictMode$ThreadPolicy$Builder()>
	//    5   11:invokevirtual   #21  <Method android.os.StrictMode$ThreadPolicy$Builder android.os.StrictMode$ThreadPolicy$Builder.detectAll()>
	//    6   14:invokevirtual   #24  <Method android.os.StrictMode$ThreadPolicy$Builder android.os.StrictMode$ThreadPolicy$Builder.penaltyLog()>
	//    7   17:invokevirtual   #28  <Method android.os.StrictMode$ThreadPolicy android.os.StrictMode$ThreadPolicy$Builder.build()>
	//    8   20:invokestatic    #34  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
			StrictMode.setVmPolicy((new android.os.StrictMode.VmPolicy.Builder()).detectAll().penaltyLog().build());
	//    9   23:new             #36  <Class android.os.StrictMode$VmPolicy$Builder>
	//   10   26:dup             
	//   11   27:invokespecial   #37  <Method void android.os.StrictMode$VmPolicy$Builder()>
	//   12   30:invokevirtual   #40  <Method android.os.StrictMode$VmPolicy$Builder android.os.StrictMode$VmPolicy$Builder.detectAll()>
	//   13   33:invokevirtual   #42  <Method android.os.StrictMode$VmPolicy$Builder android.os.StrictMode$VmPolicy$Builder.penaltyLog()>
	//   14   36:invokevirtual   #45  <Method android.os.StrictMode$VmPolicy android.os.StrictMode$VmPolicy$Builder.build()>
	//   15   39:invokestatic    #49  <Method void StrictMode.setVmPolicy(android.os.StrictMode$VmPolicy)>
			return;
	//   16   42:return          
		} else
		{
			StrictMode.setThreadPolicy((new android.os.StrictMode.ThreadPolicy.Builder()).build());
	//   17   43:new             #16  <Class android.os.StrictMode$ThreadPolicy$Builder>
	//   18   46:dup             
	//   19   47:invokespecial   #17  <Method void android.os.StrictMode$ThreadPolicy$Builder()>
	//   20   50:invokevirtual   #28  <Method android.os.StrictMode$ThreadPolicy android.os.StrictMode$ThreadPolicy$Builder.build()>
	//   21   53:invokestatic    #34  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
			StrictMode.setVmPolicy((new android.os.StrictMode.VmPolicy.Builder()).build());
	//   22   56:new             #36  <Class android.os.StrictMode$VmPolicy$Builder>
	//   23   59:dup             
	//   24   60:invokespecial   #37  <Method void android.os.StrictMode$VmPolicy$Builder()>
	//   25   63:invokevirtual   #45  <Method android.os.StrictMode$VmPolicy android.os.StrictMode$VmPolicy$Builder.build()>
	//   26   66:invokestatic    #49  <Method void StrictMode.setVmPolicy(android.os.StrictMode$VmPolicy)>
			return;
	//   27   69:return          
		}
	}

	public void attachBaseContext(Context context)
	{
		super.attachBaseContext(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #54  <Method void BaseApplication.attachBaseContext(Context)>
	//    3    5:return          
	}

	protected RefWatcher e()
	{
		return LeakCanary.refWatcher(((Context) (this))).listenerServiceClass(com/huawei/health/LeakUploadService).buildAndInstall();
	//    0    0:aload_0         
	//    1    1:invokestatic    #62  <Method AndroidRefWatcherBuilder LeakCanary.refWatcher(Context)>
	//    2    4:ldc1            #64  <Class LeakUploadService>
	//    3    6:invokevirtual   #70  <Method AndroidRefWatcherBuilder AndroidRefWatcherBuilder.listenerServiceClass(Class)>
	//    4    9:invokevirtual   #73  <Method RefWatcher AndroidRefWatcherBuilder.buildAndInstall()>
	//    5   12:areturn         
	}

	public void onCreate()
	{
		super.onCreate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method void BaseApplication.onCreate()>
		dho.b("HealthApplication", new Object[] {
			" onCreate, BuildConfig.CRASH_LOG_UPLOAD = ", Boolean.valueOf(true)
		});
	//    2    4:ldc1            #78  <String "HealthApplication">
	//    3    6:iconst_2        
	//    4    7:anewarray       Object[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:ldc1            #82  <String " onCreate, BuildConfig.CRASH_LOG_UPLOAD = ">
	//    8   14:aastore         
	//    9   15:dup             
	//   10   16:iconst_1        
	//   11   17:iconst_1        
	//   12   18:invokestatic    #88  <Method Boolean Boolean.valueOf(boolean)>
	//   13   21:aastore         
	//   14   22:invokestatic    #94  <Method void dho.b(String, Object[])>
		ahj.b(((Context) (this)));
	//   15   25:aload_0         
	//   16   26:invokestatic    #98  <Method void ahj.b(Context)>
		if(dbf.o())
	//*  17   29:invokestatic    #104 <Method boolean dbf.o()>
	//*  18   32:ifeq            62
		{
			dho.b("HealthApplication", new Object[] {
				"CommonUtil.isEMUI_9_0() = true, HiDataManager.init "
			});
	//   19   35:ldc1            #78  <String "HealthApplication">
	//   20   37:iconst_1        
	//   21   38:anewarray       Object[]
	//   22   41:dup             
	//   23   42:iconst_0        
	//   24   43:ldc1            #106 <String "CommonUtil.isEMUI_9_0() = true, HiDataManager.init ">
	//   25   45:aastore         
	//   26   46:invokestatic    #94  <Method void dho.b(String, Object[])>
			dnn.d.init(getApplicationContext());
	//   27   49:getstatic       #112 <Field HiDataManager dnn.d>
	//   28   52:aload_0         
	//   29   53:invokevirtual   #116 <Method Context getApplicationContext()>
	//   30   56:invokevirtual   #121 <Method void HiDataManager.init(Context)>
		} else
	//*  31   59:goto            82
		{
			dho.b("HealthApplication", new Object[] {
				"CommonUtil.isEMUI_9_0() = false,   Version = ", dbf.a()
			});
	//   32   62:ldc1            #78  <String "HealthApplication">
	//   33   64:iconst_2        
	//   34   65:anewarray       Object[]
	//   35   68:dup             
	//   36   69:iconst_0        
	//   37   70:ldc1            #123 <String "CommonUtil.isEMUI_9_0() = false,   Version = ">
	//   38   72:aastore         
	//   39   73:dup             
	//   40   74:iconst_1        
	//   41   75:invokestatic    #126 <Method String dbf.a()>
	//   42   78:aastore         
	//   43   79:invokestatic    #94  <Method void dho.b(String, Object[])>
		}
		def.d();
	//   44   82:invokestatic    #130 <Method void def.d()>
		dbf.a("TimeEat_HealthApplication", "Enter onCreate");
	//   45   85:ldc1            #132 <String "TimeEat_HealthApplication">
	//   46   87:ldc1            #134 <String "Enter onCreate">
	//   47   89:invokestatic    #137 <Method void dbf.a(String, String)>
		BaseApplication.d("com.huawei.health".equals(((Object) (dbf.e(Process.myPid())))));
	//   48   92:ldc1            #139 <String "com.huawei.health">
	//   49   94:invokestatic    #145 <Method int Process.myPid()>
	//   50   97:invokestatic    #148 <Method String dbf.e(int)>
	//   51  100:invokevirtual   #154 <Method boolean String.equals(Object)>
	//   52  103:invokestatic    #156 <Method void BaseApplication.d(boolean)>
		if(BaseApplication.b())
	//*  53  106:invokestatic    #158 <Method boolean BaseApplication.b()>
	//*  54  109:ifeq            132
		{
			ebm.a().b(((o.ebh) (new czc())));
	//   55  112:invokestatic    #163 <Method ebm ebm.a()>
	//   56  115:new             #165 <Class czc>
	//   57  118:dup             
	//   58  119:invokespecial   #166 <Method void czc()>
	//   59  122:invokevirtual   #169 <Method void ebm.b(o.ebh)>
			registerComponentCallbacks(((android.content.ComponentCallbacks) (ebm.a())));
	//   60  125:aload_0         
	//   61  126:invokestatic    #163 <Method ebm ebm.a()>
	//   62  129:invokevirtual   #173 <Method void registerComponentCallbacks(android.content.ComponentCallbacks)>
		}
		if("debug".equals("release"))
	//*  63  132:ldc1            #175 <String "debug">
	//*  64  134:ldc1            #177 <String "release">
	//*  65  136:invokevirtual   #154 <Method boolean String.equals(Object)>
	//*  66  139:ifeq            147
			e();
	//   67  142:aload_0         
	//   68  143:invokevirtual   #179 <Method RefWatcher e()>
	//   69  146:pop             
		if("release".equals("release"))
	//*  70  147:ldc1            #177 <String "release">
	//*  71  149:ldc1            #177 <String "release">
	//*  72  151:invokevirtual   #154 <Method boolean String.equals(Object)>
	//*  73  154:ifeq            165
			a(false);
	//   74  157:aload_0         
	//   75  158:iconst_0        
	//   76  159:invokespecial   #181 <Method void a(boolean)>
		else
	//*  77  162:goto            170
			a(true);
	//   78  165:aload_0         
	//   79  166:iconst_1        
	//   80  167:invokespecial   #181 <Method void a(boolean)>
		cwn.a().e(getApplicationContext());
	//   81  170:invokestatic    #186 <Method cwn cwn.a()>
	//   82  173:aload_0         
	//   83  174:invokevirtual   #116 <Method Context getApplicationContext()>
	//   84  177:invokevirtual   #188 <Method void cwn.e(Context)>
		dho.b("TimeEat_HealthApplication", new Object[] {
			"BUILD_TYPE is ", "release"
		});
	//   85  180:ldc1            #132 <String "TimeEat_HealthApplication">
	//   86  182:iconst_2        
	//   87  183:anewarray       Object[]
	//   88  186:dup             
	//   89  187:iconst_0        
	//   90  188:ldc1            #190 <String "BUILD_TYPE is ">
	//   91  190:aastore         
	//   92  191:dup             
	//   93  192:iconst_1        
	//   94  193:ldc1            #177 <String "release">
	//   95  195:aastore         
	//   96  196:invokestatic    #94  <Method void dho.b(String, Object[])>
	//   97  199:return          
	}

	public void onTerminate()
	{
		if(BaseApplication.b())
	//*   0    0:invokestatic    #158 <Method boolean BaseApplication.b()>
	//*   1    3:ifeq            13
			unregisterComponentCallbacks(((android.content.ComponentCallbacks) (ebm.a())));
	//    2    6:aload_0         
	//    3    7:invokestatic    #163 <Method ebm ebm.a()>
	//    4   10:invokevirtual   #194 <Method void unregisterComponentCallbacks(android.content.ComponentCallbacks)>
		if(dbf.o())
	//*   5   13:invokestatic    #104 <Method boolean dbf.o()>
	//*   6   16:ifeq            39
		{
			dho.b("HealthApplication", new Object[] {
				"CommonUtil.isEMUI_9_0() = true, HiDataManager.destroy"
			});
	//    7   19:ldc1            #78  <String "HealthApplication">
	//    8   21:iconst_1        
	//    9   22:anewarray       Object[]
	//   10   25:dup             
	//   11   26:iconst_0        
	//   12   27:ldc1            #196 <String "CommonUtil.isEMUI_9_0() = true, HiDataManager.destroy">
	//   13   29:aastore         
	//   14   30:invokestatic    #94  <Method void dho.b(String, Object[])>
			dnn.d.destroy();
	//   15   33:getstatic       #112 <Field HiDataManager dnn.d>
	//   16   36:invokevirtual   #199 <Method void HiDataManager.destroy()>
		}
		super.onTerminate();
	//   17   39:aload_0         
	//   18   40:invokespecial   #201 <Method void BaseApplication.onTerminate()>
	//   19   43:return          
	}
}
