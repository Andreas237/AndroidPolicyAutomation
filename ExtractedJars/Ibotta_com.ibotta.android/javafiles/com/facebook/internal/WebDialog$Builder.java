// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookException;

// Referenced classes of package com.facebook.internal:
//			WebDialog, Utility, Validate

public static class WebDialog$Builder
{

	private void finishInit(Context context1, String s, Bundle bundle)
	{
		context = context1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #60  <Field Context context>
		action = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #62  <Field String action>
		if(bundle != null)
	//*   6   10:aload_3         
	//*   7   11:ifnull          20
		{
			parameters = bundle;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #64  <Field Bundle parameters>
			return;
	//   11   19:return          
		} else
		{
			parameters = new Bundle();
	//   12   20:aload_0         
	//   13   21:new             #66  <Class Bundle>
	//   14   24:dup             
	//   15   25:invokespecial   #67  <Method void Bundle()>
	//   16   28:putfield        #64  <Field Bundle parameters>
			return;
	//   17   31:return          
		}
	}

	public WebDialog build()
	{
		AccessToken accesstoken = accessToken;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field AccessToken accessToken>
	//    2    4:astore_1        
		if(accesstoken != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          41
		{
			parameters.putString("app_id", accesstoken.getApplicationId());
	//    5    9:aload_0         
	//    6   10:getfield        #64  <Field Bundle parameters>
	//    7   13:ldc1            #73  <String "app_id">
	//    8   15:aload_1         
	//    9   16:invokevirtual   #77  <Method String AccessToken.getApplicationId()>
	//   10   19:invokevirtual   #80  <Method void Bundle.putString(String, String)>
			parameters.putString("access_token", accessToken.getToken());
	//   11   22:aload_0         
	//   12   23:getfield        #64  <Field Bundle parameters>
	//   13   26:ldc1            #82  <String "access_token">
	//   14   28:aload_0         
	//   15   29:getfield        #71  <Field AccessToken accessToken>
	//   16   32:invokevirtual   #85  <Method String AccessToken.getToken()>
	//   17   35:invokevirtual   #80  <Method void Bundle.putString(String, String)>
		} else
	//*  18   38:goto            54
		{
			parameters.putString("app_id", applicationId);
	//   19   41:aload_0         
	//   20   42:getfield        #64  <Field Bundle parameters>
	//   21   45:ldc1            #73  <String "app_id">
	//   22   47:aload_0         
	//   23   48:getfield        #39  <Field String applicationId>
	//   24   51:invokevirtual   #80  <Method void Bundle.putString(String, String)>
		}
		return WebDialog.newInstance(context, action, parameters, theme, listener);
	//   25   54:aload_0         
	//   26   55:getfield        #60  <Field Context context>
	//   27   58:aload_0         
	//   28   59:getfield        #62  <Field String action>
	//   29   62:aload_0         
	//   30   63:getfield        #64  <Field Bundle parameters>
	//   31   66:aload_0         
	//   32   67:getfield        #87  <Field int theme>
	//   33   70:aload_0         
	//   34   71:getfield        #89  <Field WebDialog$OnCompleteListener listener>
	//   35   74:invokestatic    #93  <Method WebDialog WebDialog.newInstance(Context, String, Bundle, int, WebDialog$OnCompleteListener)>
	//   36   77:areturn         
	}

	public String getApplicationId()
	{
		return applicationId;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String applicationId>
	//    2    4:areturn         
	}

	public Context getContext()
	{
		return context;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Context context>
	//    2    4:areturn         
	}

	public teListener getListener()
	{
		return listener;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field WebDialog$OnCompleteListener listener>
	//    2    4:areturn         
	}

	public Bundle getParameters()
	{
		return parameters;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field Bundle parameters>
	//    2    4:areturn         
	}

	public int getTheme()
	{
		return theme;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int theme>
	//    2    4:ireturn         
	}

	public WebDialog$Builder setOnCompleteListener(teListener telistener)
	{
		listener = telistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #89  <Field WebDialog$OnCompleteListener listener>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private AccessToken accessToken;
	private String action;
	private String applicationId;
	private Context context;
	private teListener listener;
	private Bundle parameters;
	private int theme;

	public WebDialog$Builder(Context context1, String s, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		if(!AccessToken.isCurrentAccessTokenActive())
	//*   2    4:invokestatic    #31  <Method boolean AccessToken.isCurrentAccessTokenActive()>
	//*   3    7:ifne            40
		{
			String s1 = Utility.getMetadataApplicationId(context1);
	//    4   10:aload_1         
	//    5   11:invokestatic    #37  <Method String Utility.getMetadataApplicationId(Context)>
	//    6   14:astore          4
			if(s1 != null)
	//*   7   16:aload           4
	//*   8   18:ifnull          30
				applicationId = s1;
	//    9   21:aload_0         
	//   10   22:aload           4
	//   11   24:putfield        #39  <Field String applicationId>
			else
	//*  12   27:goto            40
				throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
	//   13   30:new             #41  <Class FacebookException>
	//   14   33:dup             
	//   15   34:ldc1            #43  <String "Attempted to create a builder without a valid access token or a valid default Application ID.">
	//   16   36:invokespecial   #46  <Method void FacebookException(String)>
	//   17   39:athrow          
		}
		finishInit(context1, s, bundle);
	//   18   40:aload_0         
	//   19   41:aload_1         
	//   20   42:aload_2         
	//   21   43:aload_3         
	//   22   44:invokespecial   #49  <Method void finishInit(Context, String, Bundle)>
	//   23   47:return          
	}

	public WebDialog$Builder(Context context1, String s, String s1, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		String s2 = s;
	//    2    4:aload_2         
	//    3    5:astore          5
		if(s == null)
	//*   4    7:aload_2         
	//*   5    8:ifnonnull       17
			s2 = Utility.getMetadataApplicationId(context1);
	//    6   11:aload_1         
	//    7   12:invokestatic    #37  <Method String Utility.getMetadataApplicationId(Context)>
	//    8   15:astore          5
		Validate.notNullOrEmpty(s2, "applicationId");
	//    9   17:aload           5
	//   10   19:ldc1            #52  <String "applicationId">
	//   11   21:invokestatic    #58  <Method void Validate.notNullOrEmpty(String, String)>
		applicationId = s2;
	//   12   24:aload_0         
	//   13   25:aload           5
	//   14   27:putfield        #39  <Field String applicationId>
		finishInit(context1, s1, bundle);
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:aload_3         
	//   18   33:aload           4
	//   19   35:invokespecial   #49  <Method void finishInit(Context, String, Bundle)>
	//   20   38:return          
	}
}
