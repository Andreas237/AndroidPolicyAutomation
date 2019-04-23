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
	//    2    2:putfield        #66  <Field Context context>
		action = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #68  <Field String action>
		if(bundle != null)
	//*   6   10:aload_3         
	//*   7   11:ifnull          20
		{
			parameters = bundle;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #70  <Field Bundle parameters>
			return;
	//   11   19:return          
		} else
		{
			parameters = new Bundle();
	//   12   20:aload_0         
	//   13   21:new             #72  <Class Bundle>
	//   14   24:dup             
	//   15   25:invokespecial   #73  <Method void Bundle()>
	//   16   28:putfield        #70  <Field Bundle parameters>
			return;
	//   17   31:return          
		}
	}

	public WebDialog build()
	{
		AccessToken accesstoken = accessToken;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field AccessToken accessToken>
	//    2    4:astore_1        
		if(accesstoken != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          41
		{
			parameters.putString("app_id", accesstoken.getApplicationId());
	//    5    9:aload_0         
	//    6   10:getfield        #70  <Field Bundle parameters>
	//    7   13:ldc1            #77  <String "app_id">
	//    8   15:aload_1         
	//    9   16:invokevirtual   #81  <Method String AccessToken.getApplicationId()>
	//   10   19:invokevirtual   #84  <Method void Bundle.putString(String, String)>
			parameters.putString("access_token", accessToken.getToken());
	//   11   22:aload_0         
	//   12   23:getfield        #70  <Field Bundle parameters>
	//   13   26:ldc1            #86  <String "access_token">
	//   14   28:aload_0         
	//   15   29:getfield        #33  <Field AccessToken accessToken>
	//   16   32:invokevirtual   #89  <Method String AccessToken.getToken()>
	//   17   35:invokevirtual   #84  <Method void Bundle.putString(String, String)>
		} else
	//*  18   38:goto            54
		{
			parameters.putString("app_id", applicationId);
	//   19   41:aload_0         
	//   20   42:getfield        #70  <Field Bundle parameters>
	//   21   45:ldc1            #77  <String "app_id">
	//   22   47:aload_0         
	//   23   48:getfield        #45  <Field String applicationId>
	//   24   51:invokevirtual   #84  <Method void Bundle.putString(String, String)>
		}
		return WebDialog.newInstance(context, action, parameters, theme, listener);
	//   25   54:aload_0         
	//   26   55:getfield        #66  <Field Context context>
	//   27   58:aload_0         
	//   28   59:getfield        #68  <Field String action>
	//   29   62:aload_0         
	//   30   63:getfield        #70  <Field Bundle parameters>
	//   31   66:aload_0         
	//   32   67:getfield        #91  <Field int theme>
	//   33   70:aload_0         
	//   34   71:getfield        #93  <Field WebDialog$OnCompleteListener listener>
	//   35   74:invokestatic    #97  <Method WebDialog WebDialog.newInstance(Context, String, Bundle, int, WebDialog$OnCompleteListener)>
	//   36   77:areturn         
	}

	public String getApplicationId()
	{
		return applicationId;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field String applicationId>
	//    2    4:areturn         
	}

	public Context getContext()
	{
		return context;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Context context>
	//    2    4:areturn         
	}

	public teListener getListener()
	{
		return listener;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field WebDialog$OnCompleteListener listener>
	//    2    4:areturn         
	}

	public Bundle getParameters()
	{
		return parameters;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field Bundle parameters>
	//    2    4:areturn         
	}

	public int getTheme()
	{
		return theme;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field int theme>
	//    2    4:ireturn         
	}

	public WebDialog$Builder setOnCompleteListener(teListener telistener)
	{
		listener = telistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #93  <Field WebDialog$OnCompleteListener listener>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public WebDialog$Builder setTheme(int i)
	{
		theme = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #91  <Field int theme>
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
		accessToken = AccessToken.getCurrentAccessToken();
	//    2    4:aload_0         
	//    3    5:invokestatic    #31  <Method AccessToken AccessToken.getCurrentAccessToken()>
	//    4    8:putfield        #33  <Field AccessToken accessToken>
		if(!AccessToken.isCurrentAccessTokenActive())
	//*   5   11:invokestatic    #37  <Method boolean AccessToken.isCurrentAccessTokenActive()>
	//*   6   14:ifne            47
		{
			String s1 = Utility.getMetadataApplicationId(context1);
	//    7   17:aload_1         
	//    8   18:invokestatic    #43  <Method String Utility.getMetadataApplicationId(Context)>
	//    9   21:astore          4
			if(s1 != null)
	//*  10   23:aload           4
	//*  11   25:ifnull          37
				applicationId = s1;
	//   12   28:aload_0         
	//   13   29:aload           4
	//   14   31:putfield        #45  <Field String applicationId>
			else
	//*  15   34:goto            47
				throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
	//   16   37:new             #47  <Class FacebookException>
	//   17   40:dup             
	//   18   41:ldc1            #49  <String "Attempted to create a builder without a valid access token or a valid default Application ID.">
	//   19   43:invokespecial   #52  <Method void FacebookException(String)>
	//   20   46:athrow          
		}
		finishInit(context1, s, bundle);
	//   21   47:aload_0         
	//   22   48:aload_1         
	//   23   49:aload_2         
	//   24   50:aload_3         
	//   25   51:invokespecial   #55  <Method void finishInit(Context, String, Bundle)>
	//   26   54:return          
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
	//    7   12:invokestatic    #43  <Method String Utility.getMetadataApplicationId(Context)>
	//    8   15:astore          5
		Validate.notNullOrEmpty(s2, "applicationId");
	//    9   17:aload           5
	//   10   19:ldc1            #58  <String "applicationId">
	//   11   21:invokestatic    #64  <Method void Validate.notNullOrEmpty(String, String)>
		applicationId = s2;
	//   12   24:aload_0         
	//   13   25:aload           5
	//   14   27:putfield        #45  <Field String applicationId>
		finishInit(context1, s1, bundle);
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:aload_3         
	//   18   33:aload           4
	//   19   35:invokespecial   #55  <Method void finishInit(Context, String, Bundle)>
	//   20   38:return          
	}
}
