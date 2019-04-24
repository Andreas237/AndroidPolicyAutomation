// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.autorun;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.sec.android.service.health.cp.accesscontrol.AccesscontrolUtil;
import com.sec.android.service.health.util.LOG;

// Referenced classes of package com.sec.android.service.health.autorun:
//			AutoRunHandler

public class AutoRunService extends Service
{

	public AutoRunService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Service()>
		mAutoRunHandler = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #29  <Field AutoRunHandler mAutoRunHandler>
		mBinder = ((IAutoRunInterface.Stub) (new IAutoRunInterface.Stub() {

			public int isAutoRunModeEnabled(String s)
				throws RemoteException
			{
				LOG.d(AutoRunService.TAG, "isAutoRunModeEnabled()");
			//    0    0:invokestatic    #26  <Method Class AutoRunService.access$000()>
			//    1    3:ldc1            #28  <String "isAutoRunModeEnabled()">
			//    2    5:invokestatic    #34  <Method void LOG.d(Class, String)>
				if(!AccesscontrolUtil.checkSignature(((android.content.Context) (mContext)), AccesscontrolUtil.getCallerPackage(((android.content.Context) (mContext)))))
			//*   3    8:aload_0         
			//*   4    9:getfield        #12  <Field AutoRunService this$0>
			//*   5   12:invokestatic    #38  <Method AutoRunService AutoRunService.access$100(AutoRunService)>
			//*   6   15:aload_0         
			//*   7   16:getfield        #12  <Field AutoRunService this$0>
			//*   8   19:invokestatic    #38  <Method AutoRunService AutoRunService.access$100(AutoRunService)>
			//*   9   22:invokestatic    #44  <Method String AccesscontrolUtil.getCallerPackage(android.content.Context)>
			//*  10   25:invokestatic    #48  <Method boolean AccesscontrolUtil.checkSignature(android.content.Context, String)>
			//*  11   28:ifne            42
				{
					LOG.d(AutoRunService.TAG, "[AutoRunService] isAutoRunModeEnable : Security exception - Caller application not privileged");
			//   12   31:invokestatic    #26  <Method Class AutoRunService.access$000()>
			//   13   34:ldc1            #50  <String "[AutoRunService] isAutoRunModeEnable : Security exception - Caller application not privileged">
			//   14   36:invokestatic    #34  <Method void LOG.d(Class, String)>
					return -5;
			//   15   39:bipush          -5
			//   16   41:ireturn         
				}
				int i;
				if(mAutoRunHandler == null)
					break MISSING_BLOCK_LABEL_71;
			//   17   42:aload_0         
			//   18   43:getfield        #12  <Field AutoRunService this$0>
			//   19   46:invokestatic    #54  <Method AutoRunHandler AutoRunService.access$200(AutoRunService)>
			//   20   49:ifnull          71
				i = mAutoRunHandler.isEnabled(s);
			//   21   52:aload_0         
			//   22   53:getfield        #12  <Field AutoRunService this$0>
			//   23   56:invokestatic    #54  <Method AutoRunHandler AutoRunService.access$200(AutoRunService)>
			//   24   59:aload_1         
			//   25   60:invokevirtual   #59  <Method int AutoRunHandler.isEnabled(String)>
			//   26   63:istore_2        
				return i;
			//   27   64:iload_2         
			//   28   65:ireturn         
				s;
			//   29   66:astore_1        
				((Exception) (s)).printStackTrace();
			//   30   67:aload_1         
			//   31   68:invokevirtual   #62  <Method void Exception.printStackTrace()>
				return -1;
			//   32   71:iconst_m1       
			//   33   72:ireturn         
			}

			public int setAutoRunMode(String s, int i)
				throws RemoteException
			{
				LOG.d(AutoRunService.TAG, "autoRunModeEnable()");
			//    0    0:invokestatic    #26  <Method Class AutoRunService.access$000()>
			//    1    3:ldc1            #67  <String "autoRunModeEnable()">
			//    2    5:invokestatic    #34  <Method void LOG.d(Class, String)>
				if(!AccesscontrolUtil.checkSignature(((android.content.Context) (mContext)), AccesscontrolUtil.getCallerPackage(((android.content.Context) (mContext)))))
			//*   3    8:aload_0         
			//*   4    9:getfield        #12  <Field AutoRunService this$0>
			//*   5   12:invokestatic    #38  <Method AutoRunService AutoRunService.access$100(AutoRunService)>
			//*   6   15:aload_0         
			//*   7   16:getfield        #12  <Field AutoRunService this$0>
			//*   8   19:invokestatic    #38  <Method AutoRunService AutoRunService.access$100(AutoRunService)>
			//*   9   22:invokestatic    #44  <Method String AccesscontrolUtil.getCallerPackage(android.content.Context)>
			//*  10   25:invokestatic    #48  <Method boolean AccesscontrolUtil.checkSignature(android.content.Context, String)>
			//*  11   28:ifne            42
				{
					LOG.d(AutoRunService.TAG, "[AutoRunService] autoRunModeEnable : Security exception - Caller application not privileged");
			//   12   31:invokestatic    #26  <Method Class AutoRunService.access$000()>
			//   13   34:ldc1            #69  <String "[AutoRunService] autoRunModeEnable : Security exception - Caller application not privileged">
			//   14   36:invokestatic    #34  <Method void LOG.d(Class, String)>
					return -5;
			//   15   39:bipush          -5
			//   16   41:ireturn         
				}
				if(i == 100)
			//*  17   42:iload_2         
			//*  18   43:bipush          100
			//*  19   45:icmpne          70
				{
					try
					{
						if(mAutoRunHandler != null)
			//*  20   48:aload_0         
			//*  21   49:getfield        #12  <Field AutoRunService this$0>
			//*  22   52:invokestatic    #54  <Method AutoRunHandler AutoRunService.access$200(AutoRunService)>
			//*  23   55:ifnull          105
							return mAutoRunHandler.enableMode(s);
			//   24   58:aload_0         
			//   25   59:getfield        #12  <Field AutoRunService this$0>
			//   26   62:invokestatic    #54  <Method AutoRunHandler AutoRunService.access$200(AutoRunService)>
			//   27   65:aload_1         
			//   28   66:invokevirtual   #72  <Method int AutoRunHandler.enableMode(String)>
			//   29   69:ireturn         
					}
			//*  30   70:iload_2         
			//*  31   71:bipush          101
			//*  32   73:icmpne          105
			//*  33   76:aload_0         
			//*  34   77:getfield        #12  <Field AutoRunService this$0>
			//*  35   80:invokestatic    #54  <Method AutoRunHandler AutoRunService.access$200(AutoRunService)>
			//*  36   83:ifnull          105
			//*  37   86:aload_0         
			//*  38   87:getfield        #12  <Field AutoRunService this$0>
			//*  39   90:invokestatic    #54  <Method AutoRunHandler AutoRunService.access$200(AutoRunService)>
			//*  40   93:aload_1         
			//*  41   94:invokevirtual   #75  <Method int AutoRunHandler.disableMode(String)>
			//*  42   97:istore_2        
			//*  43   98:iload_2         
			//*  44   99:ireturn         
					// Misplaced declaration of an exception variable
					catch(String s)
			//*  45  100:astore_1        
					{
						((Exception) (s)).printStackTrace();
			//   46  101:aload_1         
			//   47  102:invokevirtual   #62  <Method void Exception.printStackTrace()>
					}
					break MISSING_BLOCK_LABEL_105;
				}
				if(i != 101)
					break MISSING_BLOCK_LABEL_105;
				if(mAutoRunHandler == null)
					break MISSING_BLOCK_LABEL_105;
				i = mAutoRunHandler.disableMode(s);
				return i;
				return -1;
			//   48  105:iconst_m1       
			//   49  106:ireturn         
			}

			final AutoRunService this$0;

			
			{
				this$0 = AutoRunService.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field AutoRunService this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void IAutoRunInterface$Stub()>
			//    5    9:return          
			}
		}
));
	//    5    9:aload_0         
	//    6   10:new             #6   <Class AutoRunService$1>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #32  <Method void AutoRunService$1(AutoRunService)>
	//   10   18:putfield        #34  <Field IAutoRunInterface$Stub mBinder>
	//   11   21:return          
	}

	public IBinder onBind(Intent intent)
	{
		LOG.d(TAG, "onBind()");
	//    0    0:getstatic       #23  <Field Class TAG>
	//    1    3:ldc1            #46  <String "onBind()">
	//    2    5:invokestatic    #52  <Method void LOG.d(Class, String)>
		intent = ((Intent) (intent.getAction()));
	//    3    8:aload_1         
	//    4    9:invokevirtual   #58  <Method String Intent.getAction()>
	//    5   12:astore_1        
		if(intent != null && !((String) (intent)).isEmpty() && ((String) (intent)).equals("com.sec.android.service.health.autorun.ModeControl"))
	//*   6   13:aload_1         
	//*   7   14:ifnull          39
	//*   8   17:aload_1         
	//*   9   18:invokevirtual   #64  <Method boolean String.isEmpty()>
	//*  10   21:iconst_1        
	//*  11   22:icmpeq          39
	//*  12   25:aload_1         
	//*  13   26:ldc1            #10  <String "com.sec.android.service.health.autorun.ModeControl">
	//*  14   28:invokevirtual   #68  <Method boolean String.equals(Object)>
	//*  15   31:ifeq            39
			return ((IBinder) (mBinder));
	//   16   34:aload_0         
	//   17   35:getfield        #34  <Field IAutoRunInterface$Stub mBinder>
	//   18   38:areturn         
		else
			return null;
	//   19   39:aconst_null     
	//   20   40:areturn         
	}

	public void onCreate()
	{
		super.onCreate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #75  <Method void Service.onCreate()>
		LOG.setLogger();
	//    2    4:invokestatic    #78  <Method void LOG.setLogger()>
		mContext = this;
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:putfield        #40  <Field AutoRunService mContext>
		LOG.d(TAG, "onCreate()");
	//    6   12:getstatic       #23  <Field Class TAG>
	//    7   15:ldc1            #80  <String "onCreate()">
	//    8   17:invokestatic    #52  <Method void LOG.d(Class, String)>
		try
		{
			mAutoRunHandler = new AutoRunHandler(((android.content.Context) (this)));
	//    9   20:aload_0         
	//   10   21:new             #82  <Class AutoRunHandler>
	//   11   24:dup             
	//   12   25:aload_0         
	//   13   26:invokespecial   #85  <Method void AutoRunHandler(android.content.Context)>
	//   14   29:putfield        #29  <Field AutoRunHandler mAutoRunHandler>
			if(mAutoRunHandler != null)
	//*  15   32:aload_0         
	//*  16   33:getfield        #29  <Field AutoRunHandler mAutoRunHandler>
	//*  17   36:ifnull          47
				mAutoRunHandler.initAutoRunHandler(((android.content.Context) (this)));
	//   18   39:aload_0         
	//   19   40:getfield        #29  <Field AutoRunHandler mAutoRunHandler>
	//   20   43:aload_0         
	//   21   44:invokevirtual   #88  <Method void AutoRunHandler.initAutoRunHandler(android.content.Context)>
			return;
	//   22   47:return          
		}
		catch(SecurityException securityexception)
	//*  23   48:astore_1        
		{
			securityexception.printStackTrace();
	//   24   49:aload_1         
	//   25   50:invokevirtual   #91  <Method void SecurityException.printStackTrace()>
			return;
	//   26   53:return          
		}
		catch(NoSuchMethodException nosuchmethodexception)
	//*  27   54:astore_1        
		{
			nosuchmethodexception.printStackTrace();
	//   28   55:aload_1         
	//   29   56:invokevirtual   #92  <Method void NoSuchMethodException.printStackTrace()>
		}
	//   30   59:return          
	}

	public void onDestroy()
	{
		mContext = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #40  <Field AutoRunService mContext>
		super.onDestroy();
	//    3    5:aload_0         
	//    4    6:invokespecial   #95  <Method void Service.onDestroy()>
		if(mAutoRunHandler != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #29  <Field AutoRunHandler mAutoRunHandler>
	//*   7   13:ifnull          24
			mAutoRunHandler.deinitAutoRunHandler(((android.content.Context) (this)));
	//    8   16:aload_0         
	//    9   17:getfield        #29  <Field AutoRunHandler mAutoRunHandler>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #98  <Method void AutoRunHandler.deinitAutoRunHandler(android.content.Context)>
	//   12   24:return          
	}

	private static final String ACTION_AUTORUN_MODE_CONTROL = "com.sec.android.service.health.autorun.ModeControl";
	private static final Class TAG = com/sec/android/service/health/autorun/AutoRunService;
	private AutoRunHandler mAutoRunHandler;
	IAutoRunInterface.Stub mBinder;
	private AutoRunService mContext;

	static 
	{
	//    0    0:ldc1            #2   <Class AutoRunService>
	//    1    2:putstatic       #23  <Field Class TAG>
	//*   2    5:return          
	}


/*
	static Class access$000()
	{
		return TAG;
	//    0    0:getstatic       #23  <Field Class TAG>
	//    1    3:areturn         
	}

*/


/*
	static AutoRunService access$100(AutoRunService autorunservice)
	{
		return autorunservice.mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field AutoRunService mContext>
	//    2    4:areturn         
	}

*/


/*
	static AutoRunHandler access$200(AutoRunService autorunservice)
	{
		return autorunservice.mAutoRunHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field AutoRunHandler mAutoRunHandler>
	//    2    4:areturn         
	}

*/
}
