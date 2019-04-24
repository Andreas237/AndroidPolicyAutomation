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
	//    2    2:putfield        #65  <Field Context context>
		action = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #67  <Field String action>
		if(bundle != null)
	//*   6   10:aload_3         
	//*   7   11:ifnull          20
		{
			parameters = bundle;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #69  <Field Bundle parameters>
			return;
	//   11   19:return          
		} else
		{
			parameters = new Bundle();
	//   12   20:aload_0         
	//   13   21:new             #71  <Class Bundle>
	//   14   24:dup             
	//   15   25:invokespecial   #72  <Method void Bundle()>
	//   16   28:putfield        #69  <Field Bundle parameters>
			return;
	//   17   31:return          
		}
	}

	public WebDialog build()
	{
		if(accessToken != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field AccessToken accessToken>
	//*   2    4:ifnull          42
		{
			parameters.putString("app_id", accessToken.getApplicationId());
	//    3    7:aload_0         
	//    4    8:getfield        #69  <Field Bundle parameters>
	//    5   11:ldc1            #76  <String "app_id">
	//    6   13:aload_0         
	//    7   14:getfield        #36  <Field AccessToken accessToken>
	//    8   17:invokevirtual   #80  <Method String AccessToken.getApplicationId()>
	//    9   20:invokevirtual   #83  <Method void Bundle.putString(String, String)>
			parameters.putString("access_token", accessToken.getToken());
	//   10   23:aload_0         
	//   11   24:getfield        #69  <Field Bundle parameters>
	//   12   27:ldc1            #85  <String "access_token">
	//   13   29:aload_0         
	//   14   30:getfield        #36  <Field AccessToken accessToken>
	//   15   33:invokevirtual   #88  <Method String AccessToken.getToken()>
	//   16   36:invokevirtual   #83  <Method void Bundle.putString(String, String)>
		} else
	//*  17   39:goto            55
		{
			parameters.putString("app_id", applicationId);
	//   18   42:aload_0         
	//   19   43:getfield        #69  <Field Bundle parameters>
	//   20   46:ldc1            #76  <String "app_id">
	//   21   48:aload_0         
	//   22   49:getfield        #44  <Field String applicationId>
	//   23   52:invokevirtual   #83  <Method void Bundle.putString(String, String)>
		}
		return new WebDialog(context, action, parameters, theme, listener);
	//   24   55:new             #6   <Class WebDialog>
	//   25   58:dup             
	//   26   59:aload_0         
	//   27   60:getfield        #65  <Field Context context>
	//   28   63:aload_0         
	//   29   64:getfield        #67  <Field String action>
	//   30   67:aload_0         
	//   31   68:getfield        #69  <Field Bundle parameters>
	//   32   71:aload_0         
	//   33   72:getfield        #28  <Field int theme>
	//   34   75:aload_0         
	//   35   76:getfield        #90  <Field WebDialog$OnCompleteListener listener>
	//   36   79:invokespecial   #93  <Method void WebDialog(Context, String, Bundle, int, WebDialog$OnCompleteListener)>
	//   37   82:areturn         
	}

	public String getApplicationId()
	{
		return applicationId;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String applicationId>
	//    2    4:areturn         
	}

	public Context getContext()
	{
		return context;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Context context>
	//    2    4:areturn         
	}

	public teListener getListener()
	{
		return listener;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field WebDialog$OnCompleteListener listener>
	//    2    4:areturn         
	}

	public Bundle getParameters()
	{
		return parameters;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Bundle parameters>
	//    2    4:areturn         
	}

	public int getTheme()
	{
		return theme;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int theme>
	//    2    4:ireturn         
	}

	public WebDialog$Builder setOnCompleteListener(teListener telistener)
	{
		listener = telistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #90  <Field WebDialog$OnCompleteListener listener>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public WebDialog$Builder setTheme(int i)
	{
		theme = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #28  <Field int theme>
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
		theme = 0x1030010;
	//    2    4:aload_0         
	//    3    5:ldc1            #26  <Int 0x1030010>
	//    4    7:putfield        #28  <Field int theme>
		accessToken = AccessToken.getCurrentAccessToken();
	//    5   10:aload_0         
	//    6   11:invokestatic    #34  <Method AccessToken AccessToken.getCurrentAccessToken()>
	//    7   14:putfield        #36  <Field AccessToken accessToken>
		if(accessToken == null)
	//*   8   17:aload_0         
	//*   9   18:getfield        #36  <Field AccessToken accessToken>
	//*  10   21:ifnonnull       54
		{
			String s1 = Utility.getMetadataApplicationId(context1);
	//   11   24:aload_1         
	//   12   25:invokestatic    #42  <Method String Utility.getMetadataApplicationId(Context)>
	//   13   28:astore          4
			if(s1 != null)
	//*  14   30:aload           4
	//*  15   32:ifnull          44
				applicationId = s1;
	//   16   35:aload_0         
	//   17   36:aload           4
	//   18   38:putfield        #44  <Field String applicationId>
			else
	//*  19   41:goto            54
				throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
	//   20   44:new             #46  <Class FacebookException>
	//   21   47:dup             
	//   22   48:ldc1            #48  <String "Attempted to create a builder without a valid access token or a valid default Application ID.">
	//   23   50:invokespecial   #51  <Method void FacebookException(String)>
	//   24   53:athrow          
		}
		finishInit(context1, s, bundle);
	//   25   54:aload_0         
	//   26   55:aload_1         
	//   27   56:aload_2         
	//   28   57:aload_3         
	//   29   58:invokespecial   #54  <Method void finishInit(Context, String, Bundle)>
	//   30   61:return          
	}

	public WebDialog$Builder(Context context1, String s, String s1, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		theme = 0x1030010;
	//    2    4:aload_0         
	//    3    5:ldc1            #26  <Int 0x1030010>
	//    4    7:putfield        #28  <Field int theme>
		String s2 = s;
	//    5   10:aload_2         
	//    6   11:astore          5
		if(s == null)
	//*   7   13:aload_2         
	//*   8   14:ifnonnull       23
			s2 = Utility.getMetadataApplicationId(context1);
	//    9   17:aload_1         
	//   10   18:invokestatic    #42  <Method String Utility.getMetadataApplicationId(Context)>
	//   11   21:astore          5
		Validate.notNullOrEmpty(s2, "applicationId");
	//   12   23:aload           5
	//   13   25:ldc1            #57  <String "applicationId">
	//   14   27:invokestatic    #63  <Method void Validate.notNullOrEmpty(String, String)>
		applicationId = s2;
	//   15   30:aload_0         
	//   16   31:aload           5
	//   17   33:putfield        #44  <Field String applicationId>
		finishInit(context1, s1, bundle);
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:aload_3         
	//   21   39:aload           4
	//   22   41:invokespecial   #54  <Method void finishInit(Context, String, Bundle)>
	//   23   44:return          
	}
}
