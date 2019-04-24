// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.autorun;

import android.content.*;
import android.os.IBinder;
import android.os.RemoteException;
import com.samsung.aasaservice.IAASA;
import com.sec.android.service.health.util.LOG;
import java.lang.reflect.InvocationTargetException;

// Referenced classes of package com.sec.android.service.health.autorun:
//			AutoRunService

public class AutoRunHandler
{

	public AutoRunHandler(Context context)
		throws SecurityException, NoSuchMethodException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void Object()>
		mConnection = new ServiceConnection() {

			public void onServiceConnected(ComponentName componentname, IBinder ibinder)
			{
				LOG.d(AutoRunHandler.TAG, "onServiceConnected() : IAASA");
			//    0    0:invokestatic    #24  <Method Class AutoRunHandler.access$000()>
			//    1    3:ldc1            #26  <String "onServiceConnected() : IAASA">
			//    2    5:invokestatic    #32  <Method void LOG.d(Class, String)>
				mAASA = com.samsung.aasaservice.IAASA.Stub.asInterface(ibinder);
			//    3    8:aload_0         
			//    4    9:getfield        #14  <Field AutoRunHandler this$0>
			//    5   12:aload_2         
			//    6   13:invokestatic    #38  <Method IAASA com.samsung.aasaservice.IAASA$Stub.asInterface(IBinder)>
			//    7   16:invokestatic    #42  <Method IAASA AutoRunHandler.access$102(AutoRunHandler, IAASA)>
			//    8   19:pop             
			//    9   20:return          
			}

			public void onServiceDisconnected(ComponentName componentname)
			{
				LOG.d(AutoRunHandler.TAG, "onServiceConnected() : IAASA");
			//    0    0:invokestatic    #24  <Method Class AutoRunHandler.access$000()>
			//    1    3:ldc1            #26  <String "onServiceConnected() : IAASA">
			//    2    5:invokestatic    #32  <Method void LOG.d(Class, String)>
			//    3    8:return          
			}

			final AutoRunHandler this$0;

			
			{
				this$0 = AutoRunHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field AutoRunHandler this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    2    4:aload_0         
	//    3    5:new             #6   <Class AutoRunHandler$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #54  <Method void AutoRunHandler$1(AutoRunHandler)>
	//    7   13:putfield        #56  <Field ServiceConnection mConnection>
	//    8   16:return          
	}

	public void deinitAutoRunHandler(Context context)
	{
		LOG.d(TAG, "deinitAutoRunHandler()");
	//    0    0:getstatic       #42  <Field Class TAG>
	//    1    3:ldc1            #66  <String "deinitAutoRunHandler()">
	//    2    5:invokestatic    #72  <Method void LOG.d(Class, String)>
		context.unbindService(mConnection);
	//    3    8:aload_1         
	//    4    9:aload_0         
	//    5   10:getfield        #56  <Field ServiceConnection mConnection>
	//    6   13:invokevirtual   #78  <Method void Context.unbindService(ServiceConnection)>
	//    7   16:return          
	}

	public int disableMode(String s)
		throws IllegalArgumentException, IllegalAccessException, InvocationTargetException
	{
label0:
		{
			byte byte0 = -3;
	//    0    0:bipush          -3
	//    1    2:istore_2        
			try
			{
				if(mAASA == null)
					break label0;
	//    2    3:aload_0         
	//    3    4:getfield        #63  <Field IAASA mAASA>
	//    4    7:ifnull          54
				LOG.d(TAG, (new StringBuilder()).append("modeDisable : ").append(s).toString());
	//    5   10:getstatic       #42  <Field Class TAG>
	//    6   13:new             #90  <Class StringBuilder>
	//    7   16:dup             
	//    8   17:invokespecial   #91  <Method void StringBuilder()>
	//    9   20:ldc1            #93  <String "modeDisable : ">
	//   10   22:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   13   29:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   14   32:invokestatic    #72  <Method void LOG.d(Class, String)>
				mAASA.blockAutoRun(new String[] {
					s
				});
	//   15   35:aload_0         
	//   16   36:getfield        #63  <Field IAASA mAASA>
	//   17   39:iconst_1        
	//   18   40:anewarray       String[]
	//   19   43:dup             
	//   20   44:iconst_0        
	//   21   45:aload_1         
	//   22   46:aastore         
	//   23   47:invokeinterface #109 <Method void IAASA.blockAutoRun(String[])>
			}
	//*  24   52:iconst_2        
	//*  25   53:istore_2        
	//*  26   54:iload_2         
	//*  27   55:ireturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  28   56:astore_1        
			{
				return -3;
	//   29   57:bipush          -3
	//   30   59:ireturn         
			}
			byte0 = 2;
		}
		return ((int) (byte0));
	}

	public int enableMode(String s)
		throws IllegalArgumentException, IllegalAccessException, InvocationTargetException
	{
label0:
		{
			try
			{
				if(mAASA == null)
					break label0;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field IAASA mAASA>
	//    2    4:ifnull          55
				LOG.d(TAG, (new StringBuilder()).append("modeEnable : ").append(s).toString());
	//    3    7:getstatic       #42  <Field Class TAG>
	//    4   10:new             #90  <Class StringBuilder>
	//    5   13:dup             
	//    6   14:invokespecial   #91  <Method void StringBuilder()>
	//    7   17:ldc1            #112 <String "modeEnable : ">
	//    8   19:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:aload_1         
	//   10   23:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   11   26:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   12   29:invokestatic    #72  <Method void LOG.d(Class, String)>
				mAASA.allowAutoRun(new String[] {
					s
				});
	//   13   32:aload_0         
	//   14   33:getfield        #63  <Field IAASA mAASA>
	//   15   36:iconst_1        
	//   16   37:anewarray       String[]
	//   17   40:dup             
	//   18   41:iconst_0        
	//   19   42:aload_1         
	//   20   43:aastore         
	//   21   44:invokeinterface #115 <Method void IAASA.allowAutoRun(String[])>
			}
	//*  22   49:iconst_1        
	//*  23   50:ireturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  24   51:astore_1        
			{
				return -2;
	//   25   52:bipush          -2
	//   26   54:ireturn         
			}
			return 1;
		}
		return -2;
	//   27   55:bipush          -2
	//   28   57:ireturn         
	}

	public void initAutoRunHandler(Context context)
	{
		LOG.d(TAG, "initAutoRunHandler()");
	//    0    0:getstatic       #42  <Field Class TAG>
	//    1    3:ldc1            #118 <String "initAutoRunHandler()">
	//    2    5:invokestatic    #72  <Method void LOG.d(Class, String)>
		Intent intent = new Intent("com.samsung.aasaservice");
	//    3    8:new             #120 <Class Intent>
	//    4   11:dup             
	//    5   12:ldc1            #122 <String "com.samsung.aasaservice">
	//    6   14:invokespecial   #125 <Method void Intent(String)>
	//    7   17:astore_2        
		intent.setComponent(new ComponentName("com.samsung.aasaservice", "com.samsung.aasaservice.AASAService"));
	//    8   18:aload_2         
	//    9   19:new             #127 <Class ComponentName>
	//   10   22:dup             
	//   11   23:ldc1            #122 <String "com.samsung.aasaservice">
	//   12   25:ldc1            #129 <String "com.samsung.aasaservice.AASAService">
	//   13   27:invokespecial   #132 <Method void ComponentName(String, String)>
	//   14   30:invokevirtual   #136 <Method Intent Intent.setComponent(ComponentName)>
	//   15   33:pop             
		context.bindService(intent, mConnection, 1);
	//   16   34:aload_1         
	//   17   35:aload_2         
	//   18   36:aload_0         
	//   19   37:getfield        #56  <Field ServiceConnection mConnection>
	//   20   40:iconst_1        
	//   21   41:invokevirtual   #140 <Method boolean Context.bindService(Intent, ServiceConnection, int)>
	//   22   44:pop             
	//   23   45:return          
	}

	public int isEnabled(String s)
		throws IllegalArgumentException, IllegalAccessException, InvocationTargetException
	{
label0:
		{
label1:
			{
				byte byte0 = -4;
	//    0    0:bipush          -4
	//    1    2:istore_2        
				boolean flag;
				try
				{
					if(mAASA == null)
						break label1;
	//    2    3:aload_0         
	//    3    4:getfield        #63  <Field IAASA mAASA>
	//    4    7:ifnull          54
					LOG.d(TAG, (new StringBuilder()).append("isBlockedAutoRunPackage : ").append(s).toString());
	//    5   10:getstatic       #42  <Field Class TAG>
	//    6   13:new             #90  <Class StringBuilder>
	//    7   16:dup             
	//    8   17:invokespecial   #91  <Method void StringBuilder()>
	//    9   20:ldc1            #143 <String "isBlockedAutoRunPackage : ">
	//   10   22:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   13   29:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   14   32:invokestatic    #72  <Method void LOG.d(Class, String)>
					flag = mAASA.isBlockedAutoRunPackage(s);
	//   15   35:aload_0         
	//   16   36:getfield        #63  <Field IAASA mAASA>
	//   17   39:aload_1         
	//   18   40:invokeinterface #147 <Method boolean IAASA.isBlockedAutoRunPackage(String)>
	//   19   45:istore_3        
				}
	//*  20   46:iload_3         
	//*  21   47:iconst_1        
	//*  22   48:icmpne          56
	//*  23   51:bipush          11
	//*  24   53:istore_2        
	//*  25   54:iload_2         
	//*  26   55:ireturn         
	//*  27   56:bipush          10
	//*  28   58:ireturn         
				// Misplaced declaration of an exception variable
				catch(String s)
	//*  29   59:astore_1        
				{
					return -4;
	//   30   60:bipush          -4
	//   31   62:ireturn         
				}
				if(!flag)
					break label0;
				byte0 = 11;
			}
			return ((int) (byte0));
		}
		return 10;
	}

	public static final int AUTORUN_CHECK_FAILED = -4;
	public static final int AUTORUN_DISABLE = 101;
	public static final int AUTORUN_DISABLE_FAILED = -3;
	public static final int AUTORUN_DISABLE_SUCCEEDED = 2;
	public static final int AUTORUN_ENABLE = 100;
	public static final int AUTORUN_ENABLE_FAILED = -2;
	public static final int AUTORUN_ENABLE_SUCCEEDED = 1;
	public static final int AUTORUN_FAILED = -1;
	public static final int AUTORUN_FAILED_NO_PERMISSION = -5;
	public static final int AUTORUN_IS_DISABLED = 11;
	public static final int AUTORUN_IS_ENABLED = 10;
	private static final Class TAG = com/sec/android/service/health/autorun/AutoRunService;
	private IAASA mAASA;
	ServiceConnection mConnection;

	static 
	{
	//    0    0:ldc1            #40  <Class AutoRunService>
	//    1    2:putstatic       #42  <Field Class TAG>
	//*   2    5:return          
	}


/*
	static Class access$000()
	{
		return TAG;
	//    0    0:getstatic       #42  <Field Class TAG>
	//    1    3:areturn         
	}

*/


/*
	static IAASA access$102(AutoRunHandler autorunhandler, IAASA iaasa)
	{
		autorunhandler.mAASA = iaasa;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #63  <Field IAASA mAASA>
		return iaasa;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/
}
