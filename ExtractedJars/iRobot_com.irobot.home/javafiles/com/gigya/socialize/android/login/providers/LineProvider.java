// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.login.providers;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.gigya.socialize.GSObject;
import com.gigya.socialize.android.GSAPI;
import com.gigya.socialize.android.log.GigyaLog;
import com.linecorp.linesdk.*;
import com.linecorp.linesdk.auth.LineLoginApi;
import com.linecorp.linesdk.auth.LineLoginResult;

// Referenced classes of package com.gigya.socialize.android.login.providers:
//			LoginProvider

public class LineProvider extends LoginProvider
{

	public LineProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void LoginProvider()>
	//    2    4:return          
	}

	public static boolean isConfigured()
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		boolean flag;
		boolean flag2;
		Object obj;
		try
		{
			obj = ((Object) (GSAPI.getInstance().getContext()));
	//    2    2:invokestatic    #28  <Method GSAPI GSAPI.getInstance()>
	//    3    5:invokevirtual   #32  <Method Context GSAPI.getContext()>
	//    4    8:astore_3        
			obj = ((Object) ((String)((Context) (obj)).getPackageManager().getApplicationInfo(((Context) (obj)).getPackageName(), 128).metaData.get("lineChannelID")));
	//    5    9:aload_3         
	//    6   10:invokevirtual   #38  <Method PackageManager Context.getPackageManager()>
	//    7   13:aload_3         
	//    8   14:invokevirtual   #42  <Method String Context.getPackageName()>
	//    9   17:sipush          128
	//   10   20:invokevirtual   #48  <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//   11   23:getfield        #54  <Field Bundle ApplicationInfo.metaData>
	//   12   26:ldc1            #56  <String "lineChannelID">
	//   13   28:invokevirtual   #62  <Method Object Bundle.get(String)>
	//   14   31:checkcast       #64  <Class String>
	//   15   34:astore_3        
			flag2 = isClassExist("com.linecorp.linesdk.auth.LineLoginApi");
	//   16   35:ldc1            #66  <String "com.linecorp.linesdk.auth.LineLoginApi">
	//   17   37:invokestatic    #70  <Method boolean isClassExist(String)>
	//   18   40:istore_2        
		}
	//*  19   41:iload_1         
	//*  20   42:istore_0        
	//*  21   43:iload_2         
	//*  22   44:ifeq            55
	//*  23   47:iload_1         
	//*  24   48:istore_0        
	//*  25   49:aload_3         
	//*  26   50:ifnull          55
	//*  27   53:iconst_1        
	//*  28   54:istore_0        
	//*  29   55:iload_0         
	//*  30   56:ireturn         
		catch(Throwable throwable)
	//*  31   57:astore_3        
		{
			return false;
	//   32   58:iconst_0        
	//   33   59:ireturn         
		}
		flag = flag1;
		if(flag2)
		{
			flag = flag1;
			if(obj != null)
				flag = true;
		}
		return flag;
	}

	public void clearSession()
	{
	//    0    0:return          
	}

	protected void finish()
	{
		if(currentActivity != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Activity currentActivity>
	//*   2    4:ifnull          19
		{
			currentActivity.finish();
	//    3    7:aload_0         
	//    4    8:getfield        #74  <Field Activity currentActivity>
	//    5   11:invokevirtual   #78  <Method void Activity.finish()>
			currentActivity = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #74  <Field Activity currentActivity>
		}
	//    9   19:return          
	}

	public void login(Activity activity, GSObject gsobject, Boolean boolean1, final LoginProvider.ProviderCallback callback)
	{
		if(currentActivity != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field Activity currentActivity>
	//*   2    4:ifnull          14
			currentActivity.finish();
	//    3    7:aload_0         
	//    4    8:getfield        #74  <Field Activity currentActivity>
	//    5   11:invokevirtual   #78  <Method void Activity.finish()>
		createActivity(new com.gigya.socialize.android.ui.HostActivity.HostActivityHandler() {

			public void onActivityResult(FragmentActivity fragmentactivity, int i, int j, Intent intent)
			{
				if(i != 1)
			//*   0    0:iload_2         
			//*   1    1:iconst_1        
			//*   2    2:icmpeq          13
				{
					GigyaLog.e("ERROR", "Unsupported Request");
			//    3    5:ldc1            #29  <String "ERROR">
			//    4    7:ldc1            #31  <String "Unsupported Request">
			//    5    9:invokestatic    #37  <Method void GigyaLog.e(String, String)>
					return;
			//    6   12:return          
				}
				fragmentactivity = ((FragmentActivity) (LineLoginApi.getLoginResultFromIntent(intent)));
			//    7   13:aload           4
			//    8   15:invokestatic    #43  <Method LineLoginResult LineLoginApi.getLoginResultFromIntent(Intent)>
			//    9   18:astore_1        
				static class _cls2
				{

					static final int $SwitchMap$com$linecorp$linesdk$LineApiResponseCode[];

					static 
					{
						$SwitchMap$com$linecorp$linesdk$LineApiResponseCode = new int[LineApiResponseCode.values().length];
					//    0    0:invokestatic    #18  <Method LineApiResponseCode[] LineApiResponseCode.values()>
					//    1    3:arraylength     
					//    2    4:newarray        int[]
					//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$linecorp$linesdk$LineApiResponseCode>
						try
						{
							$SwitchMap$com$linecorp$linesdk$LineApiResponseCode[LineApiResponseCode.SUCCESS.ordinal()] = 1;
					//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$linecorp$linesdk$LineApiResponseCode>
					//    5   12:getstatic       #24  <Field LineApiResponseCode LineApiResponseCode.SUCCESS>
					//    6   15:invokevirtual   #28  <Method int LineApiResponseCode.ordinal()>
					//    7   18:iconst_1        
					//    8   19:iastore         
						}
					//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$linecorp$linesdk$LineApiResponseCode>
					//*  10   23:getstatic       #31  <Field LineApiResponseCode LineApiResponseCode.CANCEL>
					//*  11   26:invokevirtual   #28  <Method int LineApiResponseCode.ordinal()>
					//*  12   29:iconst_2        
					//*  13   30:iastore         
					//*  14   31:return          
						catch(NoSuchFieldError nosuchfielderror) { }
					//   15   32:astore_0        
						try
						{
							$SwitchMap$com$linecorp$linesdk$LineApiResponseCode[LineApiResponseCode.CANCEL.ordinal()] = 2;
						}
					//*  16   33:goto            20
						catch(NoSuchFieldError nosuchfielderror1) { }
					//   17   36:astore_0        
					//*  18   37:return          
					}
				}

				switch(_cls2..SwitchMap.com.linecorp.linesdk.LineApiResponseCode[((LineLoginResult) (fragmentactivity)).getResponseCode().ordinal()])
			//*  10   19:getstatic       #49  <Field int[] LineProvider$2.$SwitchMap$com$linecorp$linesdk$LineApiResponseCode>
			//*  11   22:aload_1         
			//*  12   23:invokevirtual   #55  <Method LineApiResponseCode LineLoginResult.getResponseCode()>
			//*  13   26:invokevirtual   #61  <Method int LineApiResponseCode.ordinal()>
			//*  14   29:iaload          
				{
			//*  15   30:tableswitch     1 2: default 52
			//			               1 102
			//			               2 83
				default:
					GigyaLog.e("ERROR", "Line Login FAILED!");
			//   16   52:ldc1            #29  <String "ERROR">
			//   17   54:ldc1            #63  <String "Line Login FAILED!">
			//   18   56:invokestatic    #37  <Method void GigyaLog.e(String, String)>
					GigyaLog.e("ERROR", ((LineLoginResult) (fragmentactivity)).getErrorData().toString());
			//   19   59:ldc1            #29  <String "ERROR">
			//   20   61:aload_1         
			//   21   62:invokevirtual   #67  <Method LineApiError LineLoginResult.getErrorData()>
			//   22   65:invokevirtual   #73  <Method String LineApiError.toString()>
			//   23   68:invokestatic    #37  <Method void GigyaLog.e(String, String)>
					cancel(callback);
			//   24   71:aload_0         
			//   25   72:getfield        #19  <Field LineProvider this$0>
			//   26   75:aload_0         
			//   27   76:getfield        #21  <Field LoginProvider$ProviderCallback val$callback>
			//   28   79:invokevirtual   #77  <Method void LineProvider.cancel(LoginProvider$ProviderCallback)>
					return;
			//   29   82:return          

				case 2: // '\002'
					cancel(callback);
			//   30   83:aload_0         
			//   31   84:getfield        #19  <Field LineProvider this$0>
			//   32   87:aload_0         
			//   33   88:getfield        #21  <Field LoginProvider$ProviderCallback val$callback>
			//   34   91:invokevirtual   #77  <Method void LineProvider.cancel(LoginProvider$ProviderCallback)>
					GigyaLog.e("ERROR", "Line Login Canceled");
			//   35   94:ldc1            #29  <String "ERROR">
			//   36   96:ldc1            #79  <String "Line Login Canceled">
			//   37   98:invokestatic    #37  <Method void GigyaLog.e(String, String)>
					return;
			//   38  101:return          

				case 1: // '\001'
					fragmentactivity = ((FragmentActivity) (((LineLoginResult) (fragmentactivity)).getLineCredential().getAccessToken().getAccessToken()));
			//   39  102:aload_1         
			//   40  103:invokevirtual   #83  <Method LineCredential LineLoginResult.getLineCredential()>
			//   41  106:invokevirtual   #89  <Method LineAccessToken LineCredential.getAccessToken()>
			//   42  109:invokevirtual   #93  <Method String LineAccessToken.getAccessToken()>
			//   43  112:astore_1        
					success(callback, ((String) (fragmentactivity)), -1L);
			//   44  113:aload_0         
			//   45  114:getfield        #19  <Field LineProvider this$0>
			//   46  117:aload_0         
			//   47  118:getfield        #21  <Field LoginProvider$ProviderCallback val$callback>
			//   48  121:aload_1         
			//   49  122:ldc2w           #94  <Long -1L>
			//   50  125:invokevirtual   #99  <Method void LineProvider.success(LoginProvider$ProviderCallback, String, long)>
					return;
			//   51  128:return          
				}
			}

			public void onCancel(FragmentActivity fragmentactivity)
			{
				cancel(callback);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field LineProvider this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field LoginProvider$ProviderCallback val$callback>
			//    4    8:invokevirtual   #77  <Method void LineProvider.cancel(LoginProvider$ProviderCallback)>
			//    5   11:return          
			}

			public void onCreate(FragmentActivity fragmentactivity, Bundle bundle)
			{
				currentActivity = ((Activity) (fragmentactivity));
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field LineProvider this$0>
			//    2    4:aload_1         
			//    3    5:putfield        #109 <Field Activity LineProvider.currentActivity>
				fragmentactivity = ((FragmentActivity) (GSAPI.getInstance().getContext()));
			//    4    8:invokestatic    #115 <Method GSAPI GSAPI.getInstance()>
			//    5   11:invokevirtual   #119 <Method Context GSAPI.getContext()>
			//    6   14:astore_1        
				try
				{
					fragmentactivity = ((FragmentActivity) (LineLoginApi.getLoginIntent(((Context) (fragmentactivity)), (String)((Context) (fragmentactivity)).getPackageManager().getApplicationInfo(((Context) (fragmentactivity)).getPackageName(), 128).metaData.get("lineChannelID"))));
			//    7   15:aload_1         
			//    8   16:aload_1         
			//    9   17:invokevirtual   #125 <Method PackageManager Context.getPackageManager()>
			//   10   20:aload_1         
			//   11   21:invokevirtual   #128 <Method String Context.getPackageName()>
			//   12   24:sipush          128
			//   13   27:invokevirtual   #134 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
			//   14   30:getfield        #140 <Field Bundle ApplicationInfo.metaData>
			//   15   33:ldc1            #142 <String "lineChannelID">
			//   16   35:invokevirtual   #148 <Method Object Bundle.get(String)>
			//   17   38:checkcast       #150 <Class String>
			//   18   41:invokestatic    #154 <Method Intent LineLoginApi.getLoginIntent(Context, String)>
			//   19   44:astore_1        
					currentActivity.startActivityForResult(((Intent) (fragmentactivity)), 1);
			//   20   45:aload_0         
			//   21   46:getfield        #19  <Field LineProvider this$0>
			//   22   49:getfield        #109 <Field Activity LineProvider.currentActivity>
			//   23   52:aload_1         
			//   24   53:iconst_1        
			//   25   54:invokevirtual   #160 <Method void Activity.startActivityForResult(Intent, int)>
					return;
			//   26   57:return          
				}
				// Misplaced declaration of an exception variable
				catch(FragmentActivity fragmentactivity)
			//*  27   58:astore_1        
				{
					return;
			//   28   59:return          
				}
			}

			public void onResume(FragmentActivity fragmentactivity)
			{
			//    0    0:return          
			}

			public void onStart(FragmentActivity fragmentactivity)
			{
			//    0    0:return          
			}

			final LineProvider this$0;
			final LoginProvider.ProviderCallback val$callback;

			
			{
				this$0 = LineProvider.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field LineProvider this$0>
				callback = providercallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field LoginProvider$ProviderCallback val$callback>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    6   14:aload_0         
	//    7   15:new             #6   <Class LineProvider$1>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:aload           4
	//   11   22:invokespecial   #83  <Method void LineProvider$1(LineProvider, LoginProvider$ProviderCallback)>
	//   12   25:invokevirtual   #87  <Method void createActivity(com.gigya.socialize.android.ui.HostActivity$HostActivityHandler)>
	//   13   28:return          
	}

	private static final int REQUEST_CODE = 1;
	Activity currentActivity;
}
