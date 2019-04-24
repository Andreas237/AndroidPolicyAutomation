// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hidatamanager;

import android.content.*;
import android.os.RemoteException;
import com.huawei.hidatamanager.util.LogUtils;
import o.yf;

public class CaptureLocalService
{

	private CaptureLocalService(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		mCaptureService = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #26  <Field yf mCaptureService>
	//    5    9:aload_0         
	//    6   10:new             #28  <Class CaptureLocalService$1>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #31  <Method void CaptureLocalService$1(CaptureLocalService)>
	//   10   18:putfield        #33  <Field ServiceConnection mConnection>
		mContext = context;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #35  <Field Context mContext>
	//   14   26:return          
	}

	public static CaptureLocalService getInstance(Context context)
	{
		com/huawei/hidatamanager/CaptureLocalService;
	//    0    0:ldc1            #2   <Class CaptureLocalService>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(sAPIService == null)
	//*   2    3:getstatic       #42  <Field CaptureLocalService sAPIService>
	//*   3    6:ifnonnull       20
			sAPIService = new CaptureLocalService(context);
	//    4    9:new             #2   <Class CaptureLocalService>
	//    5   12:dup             
	//    6   13:aload_0         
	//    7   14:invokespecial   #44  <Method void CaptureLocalService(Context)>
	//    8   17:putstatic       #42  <Field CaptureLocalService sAPIService>
		context = ((Context) (sAPIService));
	//    9   20:getstatic       #42  <Field CaptureLocalService sAPIService>
	//   10   23:astore_0        
		com/huawei/hidatamanager/CaptureLocalService;
	//   11   24:ldc1            #2   <Class CaptureLocalService>
		JVM INSTR monitorexit ;
	//   12   26:monitorexit     
		return ((CaptureLocalService) (context));
	//   13   27:aload_0         
	//   14   28:areturn         
		context;
	//   15   29:astore_0        
	//*  16   30:ldc1            #2   <Class CaptureLocalService>
		throw context;
	//   17   32:monitorexit     
	//   18   33:aload_0         
	//   19   34:athrow          
	}

	public boolean bindService()
	{
		if(mContext == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Context mContext>
	//*   2    4:ifnonnull       16
		{
			LogUtils.e("CaptureLocalService", "mContext = null, local service not init.");
	//    3    7:ldc1            #11  <String "CaptureLocalService">
	//    4    9:ldc1            #50  <String "mContext = null, local service not init.">
	//    5   11:invokestatic    #56  <Method void LogUtils.e(String, String)>
			return false;
	//    6   14:iconst_0        
	//    7   15:ireturn         
		}
		if(mCaptureService == null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #26  <Field yf mCaptureService>
	//*  10   20:ifnonnull       100
			try
			{
				LogUtils.i("CaptureLocalService", "start bind CaptureDataService.");
	//   11   23:ldc1            #11  <String "CaptureLocalService">
	//   12   25:ldc1            #58  <String "start bind CaptureDataService.">
	//   13   27:invokestatic    #61  <Method void LogUtils.i(String, String)>
				Intent intent = new Intent("huawei.intent.action.CAPTURE_DATA_SERVICE");
	//   14   30:new             #63  <Class Intent>
	//   15   33:dup             
	//   16   34:ldc1            #65  <String "huawei.intent.action.CAPTURE_DATA_SERVICE">
	//   17   36:invokespecial   #68  <Method void Intent(String)>
	//   18   39:astore_2        
				intent.setPackage("com.huawei.contentsensor");
	//   19   40:aload_2         
	//   20   41:ldc1            #70  <String "com.huawei.contentsensor">
	//   21   43:invokevirtual   #74  <Method Intent Intent.setPackage(String)>
	//   22   46:pop             
				boolean flag = mContext.bindService(intent, mConnection, 1);
	//   23   47:aload_0         
	//   24   48:getfield        #35  <Field Context mContext>
	//   25   51:aload_2         
	//   26   52:aload_0         
	//   27   53:getfield        #33  <Field ServiceConnection mConnection>
	//   28   56:iconst_1        
	//   29   57:invokevirtual   #79  <Method boolean Context.bindService(Intent, ServiceConnection, int)>
	//   30   60:istore_1        
				LogUtils.i("CaptureLocalService", (new StringBuilder()).append("bind service ret : ").append(flag).toString());
	//   31   61:ldc1            #11  <String "CaptureLocalService">
	//   32   63:new             #81  <Class StringBuilder>
	//   33   66:dup             
	//   34   67:invokespecial   #82  <Method void StringBuilder()>
	//   35   70:ldc1            #84  <String "bind service ret : ">
	//   36   72:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   37   75:iload_1         
	//   38   76:invokevirtual   #91  <Method StringBuilder StringBuilder.append(boolean)>
	//   39   79:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   40   82:invokestatic    #61  <Method void LogUtils.i(String, String)>
			}
	//*  41   85:goto            107
			catch(Exception exception)
	//*  42   88:astore_2        
			{
				LogUtils.e("CaptureLocalService", "bindService err", ((Throwable) (exception)));
	//   43   89:ldc1            #11  <String "CaptureLocalService">
	//   44   91:ldc1            #97  <String "bindService err">
	//   45   93:aload_2         
	//   46   94:invokestatic    #100 <Method void LogUtils.e(String, String, Throwable)>
			}
		else
	//*  47   97:goto            107
			LogUtils.i("CaptureLocalService", "service is already binded.");
	//   48  100:ldc1            #11  <String "CaptureLocalService">
	//   49  102:ldc1            #102 <String "service is already binded.">
	//   50  104:invokestatic    #61  <Method void LogUtils.i(String, String)>
		return mCaptureService != null;
	//   51  107:aload_0         
	//   52  108:getfield        #26  <Field yf mCaptureService>
	//   53  111:ifnull          116
	//   54  114:iconst_1        
	//   55  115:ireturn         
	//   56  116:iconst_0        
	//   57  117:ireturn         
	}

	public int subscribeFeatureData(long l, ComponentName componentname, String s)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          5
label0:
		{
			if(!bindService())
	//*   2    3:aload_0         
	//*   3    4:invokevirtual   #108 <Method boolean bindService()>
	//*   4    7:ifne            20
			{
				LogUtils.w("CaptureLocalService", "have not bindService");
	//    5   10:ldc1            #11  <String "CaptureLocalService">
	//    6   12:ldc1            #110 <String "have not bindService">
	//    7   14:invokestatic    #113 <Method void LogUtils.w(String, String)>
				break label0;
	//    8   17:goto            35
			}
			try
			{
				i = mCaptureService.e(l, componentname, s);
	//    9   20:aload_0         
	//   10   21:getfield        #26  <Field yf mCaptureService>
	//   11   24:lload_1         
	//   12   25:aload_3         
	//   13   26:aload           4
	//   14   28:invokeinterface #117 <Method int yf.e(long, ComponentName, String)>
	//   15   33:istore          5
			}
	//*  16   35:iload           5
	//*  17   37:ireturn         
			// Misplaced declaration of an exception variable
			catch(ComponentName componentname)
	//*  18   38:astore_3        
			{
				LogUtils.e("CaptureLocalService", "subscribeFeatureData error");
	//   19   39:ldc1            #11  <String "CaptureLocalService">
	//   20   41:ldc1            #119 <String "subscribeFeatureData error">
	//   21   43:invokestatic    #56  <Method void LogUtils.e(String, String)>
				return 0;
	//   22   46:iconst_0        
	//   23   47:ireturn         
			}
		}
		return i;
	}

	public void unBindService()
	{
		if(mContext != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Context mContext>
	//*   2    4:ifnull          18
			mContext.unbindService(mConnection);
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field Context mContext>
	//    5   11:aload_0         
	//    6   12:getfield        #33  <Field ServiceConnection mConnection>
	//    7   15:invokevirtual   #124 <Method void Context.unbindService(ServiceConnection)>
		mCaptureService = null;
	//    8   18:aload_0         
	//    9   19:aconst_null     
	//   10   20:putfield        #26  <Field yf mCaptureService>
	//   11   23:return          
	}

	public int unSubscribeFeatureData(long l, ComponentName componentname)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
label0:
		{
			if(!bindService())
	//*   2    3:aload_0         
	//*   3    4:invokevirtual   #108 <Method boolean bindService()>
	//*   4    7:ifne            20
			{
				LogUtils.w("CaptureLocalService", "have not bindService");
	//    5   10:ldc1            #11  <String "CaptureLocalService">
	//    6   12:ldc1            #110 <String "have not bindService">
	//    7   14:invokestatic    #113 <Method void LogUtils.w(String, String)>
				break label0;
	//    8   17:goto            33
			}
			try
			{
				i = mCaptureService.e(l, componentname);
	//    9   20:aload_0         
	//   10   21:getfield        #26  <Field yf mCaptureService>
	//   11   24:lload_1         
	//   12   25:aload_3         
	//   13   26:invokeinterface #128 <Method int yf.e(long, ComponentName)>
	//   14   31:istore          4
			}
	//*  15   33:iload           4
	//*  16   35:ireturn         
			// Misplaced declaration of an exception variable
			catch(ComponentName componentname)
	//*  17   36:astore_3        
			{
				LogUtils.e("CaptureLocalService", "unSubscribeFeatureData error");
	//   18   37:ldc1            #11  <String "CaptureLocalService">
	//   19   39:ldc1            #130 <String "unSubscribeFeatureData error">
	//   20   41:invokestatic    #56  <Method void LogUtils.e(String, String)>
				return 0;
	//   21   44:iconst_0        
	//   22   45:ireturn         
			}
		}
		return i;
	}

	private static final int RET_FAIL = 0;
	private static final String TAG = "CaptureLocalService";
	private static CaptureLocalService sAPIService;
	private yf mCaptureService;
	private final ServiceConnection mConnection = new _cls1();
	private Context mContext;


/*
	static yf access$002(CaptureLocalService capturelocalservice, yf yf1)
	{
		capturelocalservice.mCaptureService = yf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field yf mCaptureService>
		return yf1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/

	/* member class not found */
	class _cls1 {}

}
