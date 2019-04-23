// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.os.Parcel;
import android.support.v4.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;

// Referenced classes of package com.facebook.login:
//			LoginMethodHandler, LoginClient, DeviceAuthDialog

class DeviceAuthMethodHandler extends LoginMethodHandler
{

	protected DeviceAuthMethodHandler(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void LoginMethodHandler(Parcel)>
	//    3    5:return          
	}

	DeviceAuthMethodHandler(LoginClient loginclient)
	{
		super(loginclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void LoginMethodHandler(LoginClient)>
	//    3    5:return          
	}

	public static ScheduledThreadPoolExecutor getBackgroundExecutor()
	{
		com/facebook/login/DeviceAuthMethodHandler;
	//    0    0:ldc1            #2   <Class DeviceAuthMethodHandler>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		ScheduledThreadPoolExecutor scheduledthreadpoolexecutor;
		if(backgroundExecutor == null)
	//*   2    3:getstatic       #29  <Field ScheduledThreadPoolExecutor backgroundExecutor>
	//*   3    6:ifnonnull       20
			backgroundExecutor = new ScheduledThreadPoolExecutor(1);
	//    4    9:new             #31  <Class ScheduledThreadPoolExecutor>
	//    5   12:dup             
	//    6   13:iconst_1        
	//    7   14:invokespecial   #34  <Method void ScheduledThreadPoolExecutor(int)>
	//    8   17:putstatic       #29  <Field ScheduledThreadPoolExecutor backgroundExecutor>
		scheduledthreadpoolexecutor = backgroundExecutor;
	//    9   20:getstatic       #29  <Field ScheduledThreadPoolExecutor backgroundExecutor>
	//   10   23:astore_0        
		com/facebook/login/DeviceAuthMethodHandler;
	//   11   24:ldc1            #2   <Class DeviceAuthMethodHandler>
		JVM INSTR monitorexit ;
	//   12   26:monitorexit     
		return scheduledthreadpoolexecutor;
	//   13   27:aload_0         
	//   14   28:areturn         
		Exception exception;
		exception;
	//   15   29:astore_0        
	//*  16   30:ldc1            #2   <Class DeviceAuthMethodHandler>
		throw exception;
	//   17   32:monitorexit     
	//   18   33:aload_0         
	//   19   34:athrow          
	}

	private void showDialog(LoginClient.Request request)
	{
		DeviceAuthDialog deviceauthdialog = createDeviceAuthDialog();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method DeviceAuthDialog createDeviceAuthDialog()>
	//    2    4:astore_2        
		deviceauthdialog.show(loginClient.getActivity().getSupportFragmentManager(), "login_with_facebook");
	//    3    5:aload_2         
	//    4    6:aload_0         
	//    5    7:getfield        #44  <Field LoginClient loginClient>
	//    6   10:invokevirtual   #50  <Method FragmentActivity LoginClient.getActivity()>
	//    7   13:invokevirtual   #56  <Method android.support.v4.app.FragmentManager FragmentActivity.getSupportFragmentManager()>
	//    8   16:ldc1            #58  <String "login_with_facebook">
	//    9   18:invokevirtual   #64  <Method void DeviceAuthDialog.show(android.support.v4.app.FragmentManager, String)>
		deviceauthdialog.startLogin(request);
	//   10   21:aload_2         
	//   11   22:aload_1         
	//   12   23:invokevirtual   #67  <Method void DeviceAuthDialog.startLogin(LoginClient$Request)>
	//   13   26:return          
	}

	protected DeviceAuthDialog createDeviceAuthDialog()
	{
		return new DeviceAuthDialog();
	//    0    0:new             #60  <Class DeviceAuthDialog>
	//    1    3:dup             
	//    2    4:invokespecial   #68  <Method void DeviceAuthDialog()>
	//    3    7:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	String getNameForLogging()
	{
		return "device_auth";
	//    0    0:ldc1            #74  <String "device_auth">
	//    1    2:areturn         
	}

	public void onCancel()
	{
		LoginClient.Result result = LoginClient.Result.createCancelResult(loginClient.getPendingRequest(), "User canceled log in.");
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field LoginClient loginClient>
	//    2    4:invokevirtual   #79  <Method LoginClient$Request LoginClient.getPendingRequest()>
	//    3    7:ldc1            #81  <String "User canceled log in.">
	//    4    9:invokestatic    #87  <Method LoginClient$Result LoginClient$Result.createCancelResult(LoginClient$Request, String)>
	//    5   12:astore_1        
		loginClient.completeAndValidate(result);
	//    6   13:aload_0         
	//    7   14:getfield        #44  <Field LoginClient loginClient>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #91  <Method void LoginClient.completeAndValidate(LoginClient$Result)>
	//   10   21:return          
	}

	public void onError(Exception exception)
	{
		exception = ((Exception) (LoginClient.Result.createErrorResult(loginClient.getPendingRequest(), ((String) (null)), exception.getMessage())));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field LoginClient loginClient>
	//    2    4:invokevirtual   #79  <Method LoginClient$Request LoginClient.getPendingRequest()>
	//    3    7:aconst_null     
	//    4    8:aload_1         
	//    5    9:invokevirtual   #98  <Method String Exception.getMessage()>
	//    6   12:invokestatic    #102 <Method LoginClient$Result LoginClient$Result.createErrorResult(LoginClient$Request, String, String)>
	//    7   15:astore_1        
		loginClient.completeAndValidate(((LoginClient.Result) (exception)));
	//    8   16:aload_0         
	//    9   17:getfield        #44  <Field LoginClient loginClient>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #91  <Method void LoginClient.completeAndValidate(LoginClient$Result)>
	//   12   24:return          
	}

	public void onSuccess(String s, String s1, String s2, Collection collection, Collection collection1, AccessTokenSource accesstokensource, Date date, 
			Date date1, Date date2)
	{
		s = ((String) (new AccessToken(s, s1, s2, collection, collection1, accesstokensource, date, date1, date2)));
	//    0    0:new             #106 <Class AccessToken>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:aload           6
	//    8   13:aload           7
	//    9   15:aload           8
	//   10   17:aload           9
	//   11   19:invokespecial   #108 <Method void AccessToken(String, String, String, Collection, Collection, AccessTokenSource, Date, Date, Date)>
	//   12   22:astore_1        
		s = ((String) (LoginClient.Result.createTokenResult(loginClient.getPendingRequest(), ((AccessToken) (s)))));
	//   13   23:aload_0         
	//   14   24:getfield        #44  <Field LoginClient loginClient>
	//   15   27:invokevirtual   #79  <Method LoginClient$Request LoginClient.getPendingRequest()>
	//   16   30:aload_1         
	//   17   31:invokestatic    #112 <Method LoginClient$Result LoginClient$Result.createTokenResult(LoginClient$Request, AccessToken)>
	//   18   34:astore_1        
		loginClient.completeAndValidate(((LoginClient.Result) (s)));
	//   19   35:aload_0         
	//   20   36:getfield        #44  <Field LoginClient loginClient>
	//   21   39:aload_1         
	//   22   40:invokevirtual   #91  <Method void LoginClient.completeAndValidate(LoginClient$Result)>
	//   23   43:return          
	}

	boolean tryAuthorize(LoginClient.Request request)
	{
		showDialog(request);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #118 <Method void showDialog(LoginClient$Request)>
		return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #122 <Method void LoginMethodHandler.writeToParcel(Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public DeviceAuthMethodHandler createFromParcel(Parcel parcel)
		{
			return new DeviceAuthMethodHandler(parcel);
		//    0    0:new             #8   <Class DeviceAuthMethodHandler>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #18  <Method void DeviceAuthMethodHandler(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #21  <Method DeviceAuthMethodHandler createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public DeviceAuthMethodHandler[] newArray(int i)
		{
			return new DeviceAuthMethodHandler[i];
		//    0    0:iload_1         
		//    1    1:anewarray       DeviceAuthMethodHandler[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #26  <Method DeviceAuthMethodHandler[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private static ScheduledThreadPoolExecutor backgroundExecutor;

	static 
	{
	//    0    0:new             #6   <Class DeviceAuthMethodHandler$1>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void DeviceAuthMethodHandler$1()>
	//    3    7:putstatic       #18  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
