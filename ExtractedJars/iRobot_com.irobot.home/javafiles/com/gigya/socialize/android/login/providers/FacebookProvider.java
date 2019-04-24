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
import com.facebook.*;
import com.facebook.login.*;
import com.gigya.socialize.*;
import com.gigya.socialize.android.*;
import java.util.*;

// Referenced classes of package com.gigya.socialize.android.login.providers:
//			LoginProvider

public class FacebookProvider extends LoginProvider
{

	public FacebookProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void LoginProvider()>
		try
		{
			FacebookSdk.sdkInitialize(GSAPI.getInstance().getContext());
	//    2    4:invokestatic    #68  <Method GSAPI GSAPI.getInstance()>
	//    3    7:invokevirtual   #72  <Method Context GSAPI.getContext()>
	//    4   10:invokestatic    #78  <Method void FacebookSdk.sdkInitialize(Context)>
			fbLoginManager = LoginManager.getInstance();
	//    5   13:aload_0         
	//    6   14:invokestatic    #83  <Method LoginManager LoginManager.getInstance()>
	//    7   17:putfield        #85  <Field LoginManager fbLoginManager>
			fbCallbackManager = com.facebook.CallbackManager.Factory.create();
	//    8   20:aload_0         
	//    9   21:invokestatic    #91  <Method CallbackManager com.facebook.CallbackManager$Factory.create()>
	//   10   24:putfield        #93  <Field CallbackManager fbCallbackManager>
			new AccessTokenTracker() {

				protected void onCurrentAccessTokenChanged(AccessToken accesstoken, AccessToken accesstoken1)
				{
					if(permissionsActivity != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #14  <Field FacebookProvider this$0>
				//*   2    4:invokestatic    #22  <Method FragmentActivity FacebookProvider.access$000(FacebookProvider)>
				//*   3    7:ifnull          29
					{
						permissionsActivity.finish();
				//    4   10:aload_0         
				//    5   11:getfield        #14  <Field FacebookProvider this$0>
				//    6   14:invokestatic    #22  <Method FragmentActivity FacebookProvider.access$000(FacebookProvider)>
				//    7   17:invokevirtual   #27  <Method void FragmentActivity.finish()>
						permissionsActivity = null;
				//    8   20:aload_0         
				//    9   21:getfield        #14  <Field FacebookProvider this$0>
				//   10   24:aconst_null     
				//   11   25:invokestatic    #31  <Method FragmentActivity FacebookProvider.access$002(FacebookProvider, FragmentActivity)>
				//   12   28:pop             
					}
					permissionsHandler = null;
				//   13   29:aload_0         
				//   14   30:getfield        #14  <Field FacebookProvider this$0>
				//   15   33:aconst_null     
				//   16   34:invokestatic    #35  <Method GSPermissionResultHandler FacebookProvider.access$102(FacebookProvider, GSPermissionResultHandler)>
				//   17   37:pop             
					accesstoken = ((AccessToken) (GSAPI.getInstance().getSession()));
				//   18   38:invokestatic    #41  <Method GSAPI GSAPI.getInstance()>
				//   19   41:invokevirtual   #45  <Method GSSession GSAPI.getSession()>
				//   20   44:astore_1        
					if(FacebookProvider.isLoggedIn() && accesstoken != null)
				//*  21   45:invokestatic    #49  <Method boolean FacebookProvider.isLoggedIn()>
				//*  22   48:ifeq            71
				//*  23   51:aload_1         
				//*  24   52:ifnull          71
					{
						if(!((GSSession) (accesstoken)).isValid())
				//*  25   55:aload_1         
				//*  26   56:invokevirtual   #54  <Method boolean GSSession.isValid()>
				//*  27   59:ifne            63
							return;
				//   28   62:return          
						reportExtendedToken(accesstoken1);
				//   29   63:aload_0         
				//   30   64:getfield        #14  <Field FacebookProvider this$0>
				//   31   67:aload_2         
				//   32   68:invokestatic    #58  <Method void FacebookProvider.access$200(FacebookProvider, AccessToken)>
					}
				//   33   71:return          
				}

				final FacebookProvider this$0;

			
			{
				this$0 = FacebookProvider.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field FacebookProvider this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void AccessTokenTracker()>
			//    5    9:return          
			}
			}
;
	//   11   27:new             #6   <Class FacebookProvider$1>
	//   12   30:dup             
	//   13   31:aload_0         
	//   14   32:invokespecial   #96  <Method void FacebookProvider$1(FacebookProvider)>
	//   15   35:pop             
			return;
	//   16   36:return          
		}
		catch(Exception exception)
	//*  17   37:astore_1        
		{
			return;
	//   18   38:return          
		}
	}

	private LoginBehavior extractLoginBehavior(GSObject gsobject)
	{
		String s = "NATIVE_WITH_FALLBACK";
	//    0    0:ldc1            #142 <String "NATIVE_WITH_FALLBACK">
	//    1    2:astore_2        
		if(GSAPI.getInstance().getLoginBehavior() == com.gigya.socialize.android.GSAPI.LoginBehavior.WEBVIEW_DIALOG)
	//*   2    3:invokestatic    #68  <Method GSAPI GSAPI.getInstance()>
	//*   3    6:invokevirtual   #146 <Method com.gigya.socialize.android.GSAPI$LoginBehavior GSAPI.getLoginBehavior()>
	//*   4    9:getstatic       #152 <Field com.gigya.socialize.android.GSAPI$LoginBehavior com.gigya.socialize.android.GSAPI$LoginBehavior.WEBVIEW_DIALOG>
	//*   5   12:if_acmpne       18
			s = "WEB_ONLY";
	//    6   15:ldc1            #154 <String "WEB_ONLY">
	//    7   17:astore_2        
		return LoginBehavior.valueOf(gsobject.getString("facebookLoginBehavior", s));
	//    8   18:aload_1         
	//    9   19:ldc1            #156 <String "facebookLoginBehavior">
	//   10   21:aload_2         
	//   11   22:invokevirtual   #162 <Method String GSObject.getString(String, String)>
	//   12   25:invokestatic    #168 <Method LoginBehavior LoginBehavior.valueOf(String)>
	//   13   28:areturn         
	}

	private static AccessToken getAccessToken()
	{
		return AccessToken.getCurrentAccessToken();
	//    0    0:invokestatic    #173 <Method AccessToken AccessToken.getCurrentAccessToken()>
	//    1    3:areturn         
	}

	private List getDeclinedPermissionsFromArray(List list)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #175 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #176 <Method void ArrayList()>
	//    3    7:astore_2        
		Set set = getAccessToken().getDeclinedPermissions();
	//    4    8:invokestatic    #129 <Method AccessToken getAccessToken()>
	//    5   11:invokevirtual   #180 <Method Set AccessToken.getDeclinedPermissions()>
	//    6   14:astore_3        
		list = ((List) (list.iterator()));
	//    7   15:aload_1         
	//    8   16:invokeinterface #186 <Method Iterator List.iterator()>
	//    9   21:astore_1        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//   10   22:aload_1         
	//   11   23:invokeinterface #192 <Method boolean Iterator.hasNext()>
	//   12   28:ifeq            65
			String s = (String)((Iterator) (list)).next();
	//   13   31:aload_1         
	//   14   32:invokeinterface #196 <Method Object Iterator.next()>
	//   15   37:checkcast       #32  <Class String>
	//   16   40:astore          4
			if(set.contains(((Object) (s))))
	//*  17   42:aload_3         
	//*  18   43:aload           4
	//*  19   45:invokeinterface #202 <Method boolean Set.contains(Object)>
	//*  20   50:ifeq            22
				((List) (arraylist)).add(((Object) (s)));
	//   21   53:aload_2         
	//   22   54:aload           4
	//   23   56:invokeinterface #205 <Method boolean List.add(Object)>
	//   24   61:pop             
		} while(true);
	//   25   62:goto            22
		return ((List) (arraylist));
	//   26   65:aload_2         
	//   27   66:areturn         
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
	//    2    2:invokestatic    #68  <Method GSAPI GSAPI.getInstance()>
	//    3    5:invokevirtual   #72  <Method Context GSAPI.getContext()>
	//    4    8:astore_3        
			obj = ((Object) ((String)((Context) (obj)).getPackageManager().getApplicationInfo(((Context) (obj)).getPackageName(), 128).metaData.get("com.facebook.sdk.ApplicationId")));
	//    5    9:aload_3         
	//    6   10:invokevirtual   #216 <Method PackageManager Context.getPackageManager()>
	//    7   13:aload_3         
	//    8   14:invokevirtual   #220 <Method String Context.getPackageName()>
	//    9   17:sipush          128
	//   10   20:invokevirtual   #226 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//   11   23:getfield        #232 <Field Bundle ApplicationInfo.metaData>
	//   12   26:ldc1            #234 <String "com.facebook.sdk.ApplicationId">
	//   13   28:invokevirtual   #240 <Method Object Bundle.get(String)>
	//   14   31:checkcast       #32  <Class String>
	//   15   34:astore_3        
			flag2 = isClassExist("com.facebook.login.LoginManager");
	//   16   35:ldc1            #242 <String "com.facebook.login.LoginManager">
	//   17   37:invokestatic    #246 <Method boolean isClassExist(String)>
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

	public static boolean isLoggedIn()
	{
		return getAccessToken() != null;
	//    0    0:invokestatic    #129 <Method AccessToken getAccessToken()>
	//    1    3:ifnull          8
	//    2    6:iconst_1        
	//    3    7:ireturn         
	//    4    8:iconst_0        
	//    5    9:ireturn         
	}

	private boolean isPermissionsGranted(List list)
	{
		Set set = getAccessToken().getPermissions();
	//    0    0:invokestatic    #129 <Method AccessToken getAccessToken()>
	//    1    3:invokevirtual   #252 <Method Set AccessToken.getPermissions()>
	//    2    6:astore_2        
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext();)
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #186 <Method Iterator List.iterator()>
	//*   5   13:astore_1        
	//*   6   14:aload_1         
	//*   7   15:invokeinterface #192 <Method boolean Iterator.hasNext()>
	//*   8   20:ifeq            43
			if(!set.contains(((Object) ((String)((Iterator) (list)).next()))))
	//*   9   23:aload_2         
	//*  10   24:aload_1         
	//*  11   25:invokeinterface #196 <Method Object Iterator.next()>
	//*  12   30:checkcast       #32  <Class String>
	//*  13   33:invokeinterface #202 <Method boolean Set.contains(Object)>
	//*  14   38:ifne            14
				return false;
	//   15   41:iconst_0        
	//   16   42:ireturn         

		return true;
	//   17   43:iconst_1        
	//   18   44:ireturn         
	}

	private List mergeLoginReadPermissions(GSObject gsobject)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #175 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #176 <Method void ArrayList()>
	//    3    7:astore_2        
		((List) (arraylist)).addAll(((java.util.Collection) (Arrays.asList(((Object []) (DEFAULT_FACEBOOK_READ_PERMISSIONS))))));
	//    4    8:aload_2         
	//    5    9:getstatic       #56  <Field String[] DEFAULT_FACEBOOK_READ_PERMISSIONS>
	//    6   12:invokestatic    #261 <Method List Arrays.asList(Object[])>
	//    7   15:invokeinterface #265 <Method boolean List.addAll(java.util.Collection)>
	//    8   20:pop             
		String s = gsobject.getString("defaultPermissions", ((String) (null)));
	//    9   21:aload_1         
	//   10   22:ldc2            #267 <String "defaultPermissions">
	//   11   25:aconst_null     
	//   12   26:invokevirtual   #162 <Method String GSObject.getString(String, String)>
	//   13   29:astore_3        
		if(s != null)
	//*  14   30:aload_3         
	//*  15   31:ifnull          50
			mergePermissions(((List) (arraylist)), Arrays.asList(((Object []) (s.split(",")))));
	//   16   34:aload_0         
	//   17   35:aload_2         
	//   18   36:aload_3         
	//   19   37:ldc2            #269 <String ",">
	//   20   40:invokevirtual   #273 <Method String[] String.split(String)>
	//   21   43:invokestatic    #261 <Method List Arrays.asList(Object[])>
	//   22   46:invokespecial   #277 <Method List mergePermissions(List, List)>
	//   23   49:pop             
		gsobject = ((GSObject) (gsobject.getString("facebookReadPermissions", ((String) (null)))));
	//   24   50:aload_1         
	//   25   51:ldc2            #279 <String "facebookReadPermissions">
	//   26   54:aconst_null     
	//   27   55:invokevirtual   #162 <Method String GSObject.getString(String, String)>
	//   28   58:astore_1        
		if(gsobject != null)
	//*  29   59:aload_1         
	//*  30   60:ifnull          79
			mergePermissions(((List) (arraylist)), Arrays.asList(((Object []) (((String) (gsobject)).split(",")))));
	//   31   63:aload_0         
	//   32   64:aload_2         
	//   33   65:aload_1         
	//   34   66:ldc2            #269 <String ",">
	//   35   69:invokevirtual   #273 <Method String[] String.split(String)>
	//   36   72:invokestatic    #261 <Method List Arrays.asList(Object[])>
	//   37   75:invokespecial   #277 <Method List mergePermissions(List, List)>
	//   38   78:pop             
		((List) (arraylist)).removeAll(((java.util.Collection) (Arrays.asList(((Object []) (PUBLISH_PERMISSIONS))))));
	//   39   79:aload_2         
	//   40   80:getstatic       #52  <Field String[] PUBLISH_PERMISSIONS>
	//   41   83:invokestatic    #261 <Method List Arrays.asList(Object[])>
	//   42   86:invokeinterface #282 <Method boolean List.removeAll(java.util.Collection)>
	//   43   91:pop             
		return ((List) (arraylist));
	//   44   92:aload_2         
	//   45   93:areturn         
	}

	private List mergePermissions(List list, List list1)
	{
		list1 = ((List) (list1.iterator()));
	//    0    0:aload_2         
	//    1    1:invokeinterface #186 <Method Iterator List.iterator()>
	//    2    6:astore_2        
		do
		{
			if(!((Iterator) (list1)).hasNext())
				break;
	//    3    7:aload_2         
	//    4    8:invokeinterface #192 <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            47
			String s = (String)((Iterator) (list1)).next();
	//    6   16:aload_2         
	//    7   17:invokeinterface #196 <Method Object Iterator.next()>
	//    8   22:checkcast       #32  <Class String>
	//    9   25:astore_3        
			if(!list.contains(((Object) (s))))
	//*  10   26:aload_1         
	//*  11   27:aload_3         
	//*  12   28:invokeinterface #284 <Method boolean List.contains(Object)>
	//*  13   33:ifne            7
				list.add(((Object) (s)));
	//   14   36:aload_1         
	//   15   37:aload_3         
	//   16   38:invokeinterface #205 <Method boolean List.add(Object)>
	//   17   43:pop             
		} while(true);
	//   18   44:goto            7
		return list;
	//   19   47:aload_1         
	//   20   48:areturn         
	}

	private void reportExtendedToken(AccessToken accesstoken)
	{
		try
		{
			GSObject gsobject = new GSObject();
	//    0    0:new             #158 <Class GSObject>
	//    1    3:dup             
	//    2    4:invokespecial   #286 <Method void GSObject()>
	//    3    7:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #288 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #289 <Method void StringBuilder()>
	//    7   15:astore_3        
			stringbuilder.append("{\"facebook\": { \"authToken\": \"");
	//    8   16:aload_3         
	//    9   17:ldc2            #291 <String "{\"facebook\": { \"authToken\": \"">
	//   10   20:invokevirtual   #295 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
			stringbuilder.append(accesstoken.getToken());
	//   12   24:aload_3         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #298 <Method String AccessToken.getToken()>
	//   15   29:invokevirtual   #295 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
			stringbuilder.append("\", \"tokenExpiration\": ");
	//   17   33:aload_3         
	//   18   34:ldc2            #300 <String "\", \"tokenExpiration\": ">
	//   19   37:invokevirtual   #295 <Method StringBuilder StringBuilder.append(String)>
	//   20   40:pop             
			stringbuilder.append(accesstoken.getExpires().getTime());
	//   21   41:aload_3         
	//   22   42:aload_1         
	//   23   43:invokevirtual   #304 <Method Date AccessToken.getExpires()>
	//   24   46:invokevirtual   #310 <Method long Date.getTime()>
	//   25   49:invokevirtual   #313 <Method StringBuilder StringBuilder.append(long)>
	//   26   52:pop             
			stringbuilder.append("}}");
	//   27   53:aload_3         
	//   28   54:ldc2            #315 <String "}}">
	//   29   57:invokevirtual   #295 <Method StringBuilder StringBuilder.append(String)>
	//   30   60:pop             
			gsobject.put("providerSession", stringbuilder.toString());
	//   31   61:aload_2         
	//   32   62:ldc2            #317 <String "providerSession">
	//   33   65:aload_3         
	//   34   66:invokevirtual   #320 <Method String StringBuilder.toString()>
	//   35   69:invokevirtual   #324 <Method void GSObject.put(String, String)>
			GSAPI.getInstance().sendRequest("refreshProviderSession", gsobject, new GSResponseListener() {

				public void onGSResponse(String s, GSResponse gsresponse, Object obj)
				{
					if(permissionsHandler != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #17  <Field FacebookProvider this$0>
				//*   2    4:invokestatic    #27  <Method GSPermissionResultHandler FacebookProvider.access$100(FacebookProvider)>
				//*   3    7:ifnull          137
					{
						obj = ((Object) (Boolean.valueOf(true)));
				//    4   10:iconst_1        
				//    5   11:invokestatic    #33  <Method Boolean Boolean.valueOf(boolean)>
				//    6   14:astore_3        
						if(gsresponse.getErrorCode() == 0)
				//*   7   15:aload_2         
				//*   8   16:invokevirtual   #39  <Method int GSResponse.getErrorCode()>
				//*   9   19:ifne            112
						{
							gsresponse = ((GSResponse) (new ArrayList()));
				//   10   22:new             #41  <Class ArrayList>
				//   11   25:dup             
				//   12   26:invokespecial   #42  <Method void ArrayList()>
				//   13   29:astore_2        
							s = ((String) (obj));
				//   14   30:aload_3         
				//   15   31:astore_1        
							if(requestedPermissions != null)
				//*  16   32:aload_0         
				//*  17   33:getfield        #17  <Field FacebookProvider this$0>
				//*  18   36:invokestatic    #46  <Method List FacebookProvider.access$700(FacebookProvider)>
				//*  19   39:ifnull          93
							{
								List list = getDeclinedPermissionsFromArray(requestedPermissions);
				//   20   42:aload_0         
				//   21   43:getfield        #17  <Field FacebookProvider this$0>
				//   22   46:aload_0         
				//   23   47:getfield        #17  <Field FacebookProvider this$0>
				//   24   50:invokestatic    #46  <Method List FacebookProvider.access$700(FacebookProvider)>
				//   25   53:invokestatic    #50  <Method List FacebookProvider.access$800(FacebookProvider, List)>
				//   26   56:astore          4
								s = ((String) (obj));
				//   27   58:aload_3         
				//   28   59:astore_1        
								gsresponse = ((GSResponse) (list));
				//   29   60:aload           4
				//   30   62:astore_2        
								if(requestedPermissions.size() == list.size())
				//*  31   63:aload_0         
				//*  32   64:getfield        #17  <Field FacebookProvider this$0>
				//*  33   67:invokestatic    #46  <Method List FacebookProvider.access$700(FacebookProvider)>
				//*  34   70:invokeinterface #55  <Method int List.size()>
				//*  35   75:aload           4
				//*  36   77:invokeinterface #55  <Method int List.size()>
				//*  37   82:icmpne          93
								{
									s = ((String) (Boolean.valueOf(false)));
				//   38   85:iconst_0        
				//   39   86:invokestatic    #33  <Method Boolean Boolean.valueOf(boolean)>
				//   40   89:astore_1        
									gsresponse = ((GSResponse) (list));
				//   41   90:aload           4
				//   42   92:astore_2        
								}
							}
							permissionsHandler.onResult(((Boolean) (s)).booleanValue(), ((Exception) (null)), ((List) (gsresponse)));
				//   43   93:aload_0         
				//   44   94:getfield        #17  <Field FacebookProvider this$0>
				//   45   97:invokestatic    #27  <Method GSPermissionResultHandler FacebookProvider.access$100(FacebookProvider)>
				//   46  100:aload_1         
				//   47  101:invokevirtual   #59  <Method boolean Boolean.booleanValue()>
				//   48  104:aconst_null     
				//   49  105:aload_2         
				//   50  106:invokeinterface #65  <Method void GSPermissionResultHandler.onResult(boolean, Exception, List)>
							return;
				//   51  111:return          
						}
						permissionsHandler.onResult(false, new Exception(gsresponse.getErrorMessage()), ((List) (null)));
				//   52  112:aload_0         
				//   53  113:getfield        #17  <Field FacebookProvider this$0>
				//   54  116:invokestatic    #27  <Method GSPermissionResultHandler FacebookProvider.access$100(FacebookProvider)>
				//   55  119:iconst_0        
				//   56  120:new             #67  <Class Exception>
				//   57  123:dup             
				//   58  124:aload_2         
				//   59  125:invokevirtual   #71  <Method String GSResponse.getErrorMessage()>
				//   60  128:invokespecial   #74  <Method void Exception(String)>
				//   61  131:aconst_null     
				//   62  132:invokeinterface #65  <Method void GSPermissionResultHandler.onResult(boolean, Exception, List)>
					}
				//   63  137:return          
				}

				final FacebookProvider this$0;

			
			{
				this$0 = FacebookProvider.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field FacebookProvider this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
, ((Object) (null)));
	//   36   72:invokestatic    #68  <Method GSAPI GSAPI.getInstance()>
	//   37   75:ldc2            #326 <String "refreshProviderSession">
	//   38   78:aload_2         
	//   39   79:new             #14  <Class FacebookProvider$4>
	//   40   82:dup             
	//   41   83:aload_0         
	//   42   84:invokespecial   #327 <Method void FacebookProvider$4(FacebookProvider)>
	//   43   87:aconst_null     
	//   44   88:invokevirtual   #331 <Method void GSAPI.sendRequest(String, GSObject, GSResponseListener, Object)>
			return;
	//   45   91:return          
		}
	//*  46   92:aload_0         
	//*  47   93:getfield        #106 <Field GSPermissionResultHandler permissionsHandler>
	//*  48   96:ifnull          111
	//*  49   99:aload_0         
	//*  50  100:getfield        #106 <Field GSPermissionResultHandler permissionsHandler>
	//*  51  103:iconst_0        
	//*  52  104:aconst_null     
	//*  53  105:aconst_null     
	//*  54  106:invokeinterface #337 <Method void GSPermissionResultHandler.onResult(boolean, Exception, List)>
	//*  55  111:return          
		// Misplaced declaration of an exception variable
		catch(AccessToken accesstoken) { }
	//   56  112:astore_1        
		if(permissionsHandler != null)
			permissionsHandler.onResult(false, ((Exception) (null)), ((List) (null)));
	//*  57  113:goto            92
	}

	public void clearSession()
	{
		if(getAccessToken() != null)
	//*   0    0:invokestatic    #129 <Method AccessToken getAccessToken()>
	//*   1    3:ifnull          13
			fbLoginManager.logOut();
	//    2    6:aload_0         
	//    3    7:getfield        #85  <Field LoginManager fbLoginManager>
	//    4   10:invokevirtual   #341 <Method void LoginManager.logOut()>
	//    5   13:return          
	}

	protected void finish()
	{
	//    0    0:return          
	}

	public void login(final Activity permissions, final GSObject params, final Boolean fbAccessTokenBeforeLogin, final LoginProvider.ProviderCallback callback)
	{
		if(fbAccessTokenBeforeLogin.booleanValue())
	//*   0    0:aload_3         
	//*   1    1:invokevirtual   #349 <Method boolean Boolean.booleanValue()>
	//*   2    4:ifeq            17
		{
			fail(callback, "Silent login is not supported for this provider.");
	//    3    7:aload_0         
	//    4    8:aload           4
	//    5   10:ldc2            #351 <String "Silent login is not supported for this provider.">
	//    6   13:invokevirtual   #355 <Method void fail(LoginProvider$ProviderCallback, String)>
			return;
	//    7   16:return          
		}
		permissions = ((Activity) (mergeLoginReadPermissions(params)));
	//    8   17:aload_0         
	//    9   18:aload_2         
	//   10   19:invokespecial   #357 <Method List mergeLoginReadPermissions(GSObject)>
	//   11   22:astore_1        
		fbAccessTokenBeforeLogin = ((Boolean) (getAccessToken()));
	//   12   23:invokestatic    #129 <Method AccessToken getAccessToken()>
	//   13   26:astore_3        
		if(fbAccessTokenBeforeLogin != null && isPermissionsGranted(((List) (permissions))))
	//*  14   27:aload_3         
	//*  15   28:ifnull          57
	//*  16   31:aload_0         
	//*  17   32:aload_1         
	//*  18   33:invokespecial   #359 <Method boolean isPermissionsGranted(List)>
	//*  19   36:ifeq            57
		{
			success(callback, ((AccessToken) (fbAccessTokenBeforeLogin)).getToken(), ((AccessToken) (fbAccessTokenBeforeLogin)).getExpires().getTime());
	//   20   39:aload_0         
	//   21   40:aload           4
	//   22   42:aload_3         
	//   23   43:invokevirtual   #298 <Method String AccessToken.getToken()>
	//   24   46:aload_3         
	//   25   47:invokevirtual   #304 <Method Date AccessToken.getExpires()>
	//   26   50:invokevirtual   #310 <Method long Date.getTime()>
	//   27   53:invokevirtual   #363 <Method void success(LoginProvider$ProviderCallback, String, long)>
			return;
	//   28   56:return          
		} else
		{
			createActivity(new com.gigya.socialize.android.ui.HostActivity.HostActivityHandler() {

				public void onActivityResult(FragmentActivity fragmentactivity, int i, int j, Intent intent)
				{
					fbCallbackManager.onActivityResult(i, j, intent);
				//    0    0:aload_0         
				//    1    1:getfield        #27  <Field FacebookProvider this$0>
				//    2    4:invokestatic    #45  <Method CallbackManager FacebookProvider.access$500(FacebookProvider)>
				//    3    7:iload_2         
				//    4    8:iload_3         
				//    5    9:aload           4
				//    6   11:invokeinterface #50  <Method boolean CallbackManager.onActivityResult(int, int, Intent)>
				//    7   16:pop             
				//    8   17:return          
				}

				public void onCancel(FragmentActivity fragmentactivity)
				{
					cancel(callback);
				//    0    0:aload_0         
				//    1    1:getfield        #27  <Field FacebookProvider this$0>
				//    2    4:aload_0         
				//    3    5:getfield        #33  <Field LoginProvider$ProviderCallback val$callback>
				//    4    8:invokevirtual   #56  <Method void FacebookProvider.cancel(LoginProvider$ProviderCallback)>
				//    5   11:return          
				}

				public void onCreate(FragmentActivity fragmentactivity, Bundle bundle)
				{
					try
					{
						fbLoginManager.setLoginBehavior(extractLoginBehavior(params));
				//    0    0:aload_0         
				//    1    1:getfield        #27  <Field FacebookProvider this$0>
				//    2    4:invokestatic    #64  <Method LoginManager FacebookProvider.access$400(FacebookProvider)>
				//    3    7:aload_0         
				//    4    8:getfield        #27  <Field FacebookProvider this$0>
				//    5   11:aload_0         
				//    6   12:getfield        #29  <Field GSObject val$params>
				//    7   15:invokestatic    #68  <Method LoginBehavior FacebookProvider.access$300(FacebookProvider, GSObject)>
				//    8   18:invokevirtual   #74  <Method LoginManager LoginManager.setLoginBehavior(LoginBehavior)>
				//    9   21:pop             
						fbLoginManager.registerCallback(fbCallbackManager, ((_cls1) (fragmentactivity)). new FacebookCallback() {

							public void onCancel()
							{
								activity.finish();
							//    0    0:aload_0         
							//    1    1:getfield        #22  <Field FragmentActivity val$activity>
							//    2    4:invokevirtual   #32  <Method void FragmentActivity.finish()>
								cancel(callback);
							//    3    7:aload_0         
							//    4    8:getfield        #20  <Field FacebookProvider$2 this$1>
							//    5   11:getfield        #36  <Field FacebookProvider FacebookProvider$2.this$0>
							//    6   14:aload_0         
							//    7   15:getfield        #20  <Field FacebookProvider$2 this$1>
							//    8   18:getfield        #40  <Field LoginProvider$ProviderCallback FacebookProvider$2.val$callback>
							//    9   21:invokevirtual   #46  <Method void FacebookProvider.cancel(LoginProvider$ProviderCallback)>
								fbLoginManager.registerCallback(fbCallbackManager, ((FacebookCallback) (null)));
							//   10   24:aload_0         
							//   11   25:getfield        #20  <Field FacebookProvider$2 this$1>
							//   12   28:getfield        #36  <Field FacebookProvider FacebookProvider$2.this$0>
							//   13   31:invokestatic    #50  <Method LoginManager FacebookProvider.access$400(FacebookProvider)>
							//   14   34:aload_0         
							//   15   35:getfield        #20  <Field FacebookProvider$2 this$1>
							//   16   38:getfield        #36  <Field FacebookProvider FacebookProvider$2.this$0>
							//   17   41:invokestatic    #54  <Method CallbackManager FacebookProvider.access$500(FacebookProvider)>
							//   18   44:aconst_null     
							//   19   45:invokevirtual   #60  <Method void LoginManager.registerCallback(CallbackManager, FacebookCallback)>
							//   20   48:return          
							}

							public void onError(FacebookException facebookexception)
							{
								activity.finish();
							//    0    0:aload_0         
							//    1    1:getfield        #22  <Field FragmentActivity val$activity>
							//    2    4:invokevirtual   #32  <Method void FragmentActivity.finish()>
								fail(callback, facebookexception.getMessage());
							//    3    7:aload_0         
							//    4    8:getfield        #20  <Field FacebookProvider$2 this$1>
							//    5   11:getfield        #36  <Field FacebookProvider FacebookProvider$2.this$0>
							//    6   14:aload_0         
							//    7   15:getfield        #20  <Field FacebookProvider$2 this$1>
							//    8   18:getfield        #40  <Field LoginProvider$ProviderCallback FacebookProvider$2.val$callback>
							//    9   21:aload_1         
							//   10   22:invokevirtual   #68  <Method String FacebookException.getMessage()>
							//   11   25:invokevirtual   #72  <Method void FacebookProvider.fail(LoginProvider$ProviderCallback, String)>
								fbLoginManager.registerCallback(fbCallbackManager, ((FacebookCallback) (null)));
							//   12   28:aload_0         
							//   13   29:getfield        #20  <Field FacebookProvider$2 this$1>
							//   14   32:getfield        #36  <Field FacebookProvider FacebookProvider$2.this$0>
							//   15   35:invokestatic    #50  <Method LoginManager FacebookProvider.access$400(FacebookProvider)>
							//   16   38:aload_0         
							//   17   39:getfield        #20  <Field FacebookProvider$2 this$1>
							//   18   42:getfield        #36  <Field FacebookProvider FacebookProvider$2.this$0>
							//   19   45:invokestatic    #54  <Method CallbackManager FacebookProvider.access$500(FacebookProvider)>
							//   20   48:aconst_null     
							//   21   49:invokevirtual   #60  <Method void LoginManager.registerCallback(CallbackManager, FacebookCallback)>
							//   22   52:return          
							}

							public void onSuccess(LoginResult loginresult)
							{
								activity.finish();
							//    0    0:aload_0         
							//    1    1:getfield        #22  <Field FragmentActivity val$activity>
							//    2    4:invokevirtual   #32  <Method void FragmentActivity.finish()>
								loginresult = ((LoginResult) (GSAPI.getInstance().getSession()));
							//    3    7:invokestatic    #80  <Method GSAPI GSAPI.getInstance()>
							//    4   10:invokevirtual   #84  <Method GSSession GSAPI.getSession()>
							//    5   13:astore_1        
								AccessToken accesstoken = FacebookProvider.getAccessToken();
							//    6   14:invokestatic    #88  <Method AccessToken FacebookProvider.access$600()>
							//    7   17:astore          4
								AccessToken accesstoken1 = fbAccessTokenBeforeLogin;
							//    8   19:aload_0         
							//    9   20:getfield        #20  <Field FacebookProvider$2 this$1>
							//   10   23:getfield        #92  <Field AccessToken FacebookProvider$2.val$fbAccessTokenBeforeLogin>
							//   11   26:astore          5
								boolean flag1 = true;
							//   12   28:iconst_1        
							//   13   29:istore_3        
								boolean flag;
								if(accesstoken1 != null)
							//*  14   30:aload           5
							//*  15   32:ifnull          80
								{
									flag = accesstoken.getApplicationId().equals(((Object) (fbAccessTokenBeforeLogin.getApplicationId()))) ^ true;
							//   16   35:aload           4
							//   17   37:invokevirtual   #97  <Method String AccessToken.getApplicationId()>
							//   18   40:aload_0         
							//   19   41:getfield        #20  <Field FacebookProvider$2 this$1>
							//   20   44:getfield        #92  <Field AccessToken FacebookProvider$2.val$fbAccessTokenBeforeLogin>
							//   21   47:invokevirtual   #97  <Method String AccessToken.getApplicationId()>
							//   22   50:invokevirtual   #103 <Method boolean String.equals(Object)>
							//   23   53:iconst_1        
							//   24   54:ixor            
							//   25   55:istore_2        
									flag1 = true ^ accesstoken.getUserId().equals(((Object) (fbAccessTokenBeforeLogin.getUserId())));
							//   26   56:iconst_1        
							//   27   57:aload           4
							//   28   59:invokevirtual   #106 <Method String AccessToken.getUserId()>
							//   29   62:aload_0         
							//   30   63:getfield        #20  <Field FacebookProvider$2 this$1>
							//   31   66:getfield        #92  <Field AccessToken FacebookProvider$2.val$fbAccessTokenBeforeLogin>
							//   32   69:invokevirtual   #106 <Method String AccessToken.getUserId()>
							//   33   72:invokevirtual   #103 <Method boolean String.equals(Object)>
							//   34   75:ixor            
							//   35   76:istore_3        
								} else
							//*  36   77:goto            82
								{
									flag = true;
							//   37   80:iconst_1        
							//   38   81:istore_2        
								}
								if(!flag && !flag1 && loginresult != null && ((GSSession) (loginresult)).isValid())
							//*  39   82:iload_2         
							//*  40   83:ifne            119
							//*  41   86:iload_3         
							//*  42   87:ifne            119
							//*  43   90:aload_1         
							//*  44   91:ifnull          119
							//*  45   94:aload_1         
							//*  46   95:invokevirtual   #112 <Method boolean GSSession.isValid()>
							//*  47   98:ifne            104
							//*  48  101:goto            119
									reportExtendedToken(accesstoken);
							//   49  104:aload_0         
							//   50  105:getfield        #20  <Field FacebookProvider$2 this$1>
							//   51  108:getfield        #36  <Field FacebookProvider FacebookProvider$2.this$0>
							//   52  111:aload           4
							//   53  113:invokestatic    #116 <Method void FacebookProvider.access$200(FacebookProvider, AccessToken)>
								else
							//*  54  116:goto            149
									success(callback, accesstoken.getToken(), accesstoken.getExpires().getTime());
							//   55  119:aload_0         
							//   56  120:getfield        #20  <Field FacebookProvider$2 this$1>
							//   57  123:getfield        #36  <Field FacebookProvider FacebookProvider$2.this$0>
							//   58  126:aload_0         
							//   59  127:getfield        #20  <Field FacebookProvider$2 this$1>
							//   60  130:getfield        #40  <Field LoginProvider$ProviderCallback FacebookProvider$2.val$callback>
							//   61  133:aload           4
							//   62  135:invokevirtual   #119 <Method String AccessToken.getToken()>
							//   63  138:aload           4
							//   64  140:invokevirtual   #123 <Method Date AccessToken.getExpires()>
							//   65  143:invokevirtual   #129 <Method long Date.getTime()>
							//   66  146:invokevirtual   #133 <Method void FacebookProvider.success(LoginProvider$ProviderCallback, String, long)>
								fbLoginManager.registerCallback(fbCallbackManager, ((FacebookCallback) (null)));
							//   67  149:aload_0         
							//   68  150:getfield        #20  <Field FacebookProvider$2 this$1>
							//   69  153:getfield        #36  <Field FacebookProvider FacebookProvider$2.this$0>
							//   70  156:invokestatic    #50  <Method LoginManager FacebookProvider.access$400(FacebookProvider)>
							//   71  159:aload_0         
							//   72  160:getfield        #20  <Field FacebookProvider$2 this$1>
							//   73  163:getfield        #36  <Field FacebookProvider FacebookProvider$2.this$0>
							//   74  166:invokestatic    #54  <Method CallbackManager FacebookProvider.access$500(FacebookProvider)>
							//   75  169:aconst_null     
							//   76  170:invokevirtual   #60  <Method void LoginManager.registerCallback(CallbackManager, FacebookCallback)>
							//   77  173:return          
							}

							public volatile void onSuccess(Object obj)
							{
								onSuccess((LoginResult)obj);
							//    0    0:aload_0         
							//    1    1:aload_1         
							//    2    2:checkcast       #136 <Class LoginResult>
							//    3    5:invokevirtual   #138 <Method void onSuccess(LoginResult)>
							//    4    8:return          
							}

							final _cls2 this$1;
							final FragmentActivity val$activity;

			
			{
				this$1 = final__pcls2;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field FacebookProvider$2 this$1>
				activity = FragmentActivity.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field FragmentActivity val$activity>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
						}
);
				//   10   22:aload_0         
				//   11   23:getfield        #27  <Field FacebookProvider this$0>
				//   12   26:invokestatic    #64  <Method LoginManager FacebookProvider.access$400(FacebookProvider)>
				//   13   29:aload_0         
				//   14   30:getfield        #27  <Field FacebookProvider this$0>
				//   15   33:invokestatic    #45  <Method CallbackManager FacebookProvider.access$500(FacebookProvider)>
				//   16   36:new             #13  <Class FacebookProvider$2$1>
				//   17   39:dup             
				//   18   40:aload_0         
				//   19   41:aload_1         
				//   20   42:invokespecial   #77  <Method void FacebookProvider$2$1(FacebookProvider$2, FragmentActivity)>
				//   21   45:invokevirtual   #81  <Method void LoginManager.registerCallback(CallbackManager, FacebookCallback)>
						fbLoginManager.logInWithReadPermissions(((Activity) (fragmentactivity)), ((java.util.Collection) (permissions)));
				//   22   48:aload_0         
				//   23   49:getfield        #27  <Field FacebookProvider this$0>
				//   24   52:invokestatic    #64  <Method LoginManager FacebookProvider.access$400(FacebookProvider)>
				//   25   55:aload_1         
				//   26   56:aload_0         
				//   27   57:getfield        #35  <Field List val$permissions>
				//   28   60:invokevirtual   #85  <Method void LoginManager.logInWithReadPermissions(Activity, java.util.Collection)>
						return;
				//   29   63:return          
					}
					// Misplaced declaration of an exception variable
					catch(Bundle bundle)
				//*  30   64:astore_2        
					{
						fragmentactivity.finish();
				//   31   65:aload_1         
				//   32   66:invokevirtual   #90  <Method void FragmentActivity.finish()>
					}
					fail(callback, ((Exception) (bundle)).getMessage());
				//   33   69:aload_0         
				//   34   70:getfield        #27  <Field FacebookProvider this$0>
				//   35   73:aload_0         
				//   36   74:getfield        #33  <Field LoginProvider$ProviderCallback val$callback>
				//   37   77:aload_2         
				//   38   78:invokevirtual   #94  <Method String Exception.getMessage()>
				//   39   81:invokevirtual   #98  <Method void FacebookProvider.fail(LoginProvider$ProviderCallback, String)>
				//   40   84:return          
				}

				public void onResume(FragmentActivity fragmentactivity)
				{
				//    0    0:return          
				}

				public void onStart(FragmentActivity fragmentactivity)
				{
				//    0    0:return          
				}

				final FacebookProvider this$0;
				final LoginProvider.ProviderCallback val$callback;
				final AccessToken val$fbAccessTokenBeforeLogin;
				final GSObject val$params;
				final List val$permissions;

			
			{
				this$0 = FacebookProvider.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #27  <Field FacebookProvider this$0>
				params = gsobject;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #29  <Field GSObject val$params>
				fbAccessTokenBeforeLogin = accesstoken;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #31  <Field AccessToken val$fbAccessTokenBeforeLogin>
				callback = providercallback;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #33  <Field LoginProvider$ProviderCallback val$callback>
				permissions = list;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #35  <Field List val$permissions>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #38  <Method void Object()>
			//   17   31:return          
			}
			}
);
	//   29   57:aload_0         
	//   30   58:new             #8   <Class FacebookProvider$2>
	//   31   61:dup             
	//   32   62:aload_0         
	//   33   63:aload_2         
	//   34   64:aload_3         
	//   35   65:aload           4
	//   36   67:aload_1         
	//   37   68:invokespecial   #366 <Method void FacebookProvider$2(FacebookProvider, GSObject, AccessToken, LoginProvider$ProviderCallback, List)>
	//   38   71:invokevirtual   #370 <Method void createActivity(com.gigya.socialize.android.ui.HostActivity$HostActivityHandler)>
			return;
	//   39   74:return          
		}
	}

	public void reportDeepLink(Intent intent)
	{
		if(intent.getAction().contains("com.facebook.application"))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #377 <Method String Intent.getAction()>
	//*   2    4:ldc2            #379 <String "com.facebook.application">
	//*   3    7:invokevirtual   #382 <Method boolean String.contains(CharSequence)>
	//*   4   10:ifeq            26
			GSAPI.getInstance().reportURIReferral(intent.getData(), "facebook");
	//    5   13:invokestatic    #68  <Method GSAPI GSAPI.getInstance()>
	//    6   16:aload_1         
	//    7   17:invokevirtual   #386 <Method android.net.Uri Intent.getData()>
	//    8   20:ldc2            #388 <String "facebook">
	//    9   23:invokevirtual   #392 <Method void GSAPI.reportURIReferral(android.net.Uri, String)>
	//   10   26:return          
	}

	public void requestPermissions(final String type, final List permissions, final GSPermissionResultHandler callback)
	{
		if(getAccessToken() == null)
	//*   0    0:invokestatic    #129 <Method AccessToken getAccessToken()>
	//*   1    3:ifnonnull       16
		{
			callback.onResult(false, ((Exception) (null)), ((List) (null)));
	//    2    6:aload_3         
	//    3    7:iconst_0        
	//    4    8:aconst_null     
	//    5    9:aconst_null     
	//    6   10:invokeinterface #337 <Method void GSPermissionResultHandler.onResult(boolean, Exception, List)>
			return;
	//    7   15:return          
		}
		if(isPermissionsGranted(permissions))
	//*   8   16:aload_0         
	//*   9   17:aload_2         
	//*  10   18:invokespecial   #359 <Method boolean isPermissionsGranted(List)>
	//*  11   21:ifeq            40
		{
			callback.onResult(true, ((Exception) (null)), ((List) (new ArrayList())));
	//   12   24:aload_3         
	//   13   25:iconst_1        
	//   14   26:aconst_null     
	//   15   27:new             #175 <Class ArrayList>
	//   16   30:dup             
	//   17   31:invokespecial   #176 <Method void ArrayList()>
	//   18   34:invokeinterface #337 <Method void GSPermissionResultHandler.onResult(boolean, Exception, List)>
			return;
	//   19   39:return          
		} else
		{
			permissionsHandler = callback;
	//   20   40:aload_0         
	//   21   41:aload_3         
	//   22   42:putfield        #106 <Field GSPermissionResultHandler permissionsHandler>
			createActivity(new com.gigya.socialize.android.ui.HostActivity.HostActivityHandler() {

				public void onActivityResult(FragmentActivity fragmentactivity, int i, int j, Intent intent)
				{
					fbCallbackManager.onActivityResult(i, j, intent);
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field FacebookProvider this$0>
				//    2    4:invokestatic    #39  <Method CallbackManager FacebookProvider.access$500(FacebookProvider)>
				//    3    7:iload_2         
				//    4    8:iload_3         
				//    5    9:aload           4
				//    6   11:invokeinterface #44  <Method boolean CallbackManager.onActivityResult(int, int, Intent)>
				//    7   16:pop             
				//    8   17:return          
				}

				public void onCancel(FragmentActivity fragmentactivity)
				{
					callback.onResult(false, ((Exception) (null)), ((List) (null)));
				//    0    0:aload_0         
				//    1    1:getfield        #29  <Field GSPermissionResultHandler val$callback>
				//    2    4:iconst_0        
				//    3    5:aconst_null     
				//    4    6:aconst_null     
				//    5    7:invokeinterface #52  <Method void GSPermissionResultHandler.onResult(boolean, Exception, List)>
				//    6   12:return          
				}

				public void onCreate(FragmentActivity fragmentactivity, Bundle bundle)
				{
					permissionsActivity = fragmentactivity;
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field FacebookProvider this$0>
				//    2    4:aload_1         
				//    3    5:invokestatic    #58  <Method FragmentActivity FacebookProvider.access$002(FacebookProvider, FragmentActivity)>
				//    4    8:pop             
					requestedPermissions = ((List) (new ArrayList(((java.util.Collection) (permissions)))));
				//    5    9:aload_0         
				//    6   10:getfield        #23  <Field FacebookProvider this$0>
				//    7   13:new             #60  <Class ArrayList>
				//    8   16:dup             
				//    9   17:aload_0         
				//   10   18:getfield        #25  <Field List val$permissions>
				//   11   21:invokespecial   #63  <Method void ArrayList(java.util.Collection)>
				//   12   24:invokestatic    #67  <Method List FacebookProvider.access$702(FacebookProvider, List)>
				//   13   27:pop             
					fbLoginManager.setDefaultAudience(DefaultAudience.FRIENDS);
				//   14   28:aload_0         
				//   15   29:getfield        #23  <Field FacebookProvider this$0>
				//   16   32:invokestatic    #71  <Method LoginManager FacebookProvider.access$400(FacebookProvider)>
				//   17   35:getstatic       #77  <Field DefaultAudience DefaultAudience.FRIENDS>
				//   18   38:invokevirtual   #83  <Method LoginManager LoginManager.setDefaultAudience(DefaultAudience)>
				//   19   41:pop             
					if(type.equals("publish"))
				//*  20   42:aload_0         
				//*  21   43:getfield        #27  <Field String val$type>
				//*  22   46:ldc1            #85  <String "publish">
				//*  23   48:invokevirtual   #91  <Method boolean String.equals(Object)>
				//*  24   51:ifeq            70
					{
						fbLoginManager.logInWithPublishPermissions(((Activity) (fragmentactivity)), ((java.util.Collection) (permissions)));
				//   25   54:aload_0         
				//   26   55:getfield        #23  <Field FacebookProvider this$0>
				//   27   58:invokestatic    #71  <Method LoginManager FacebookProvider.access$400(FacebookProvider)>
				//   28   61:aload_1         
				//   29   62:aload_0         
				//   30   63:getfield        #25  <Field List val$permissions>
				//   31   66:invokevirtual   #95  <Method void LoginManager.logInWithPublishPermissions(Activity, java.util.Collection)>
						return;
				//   32   69:return          
					} else
					{
						fbLoginManager.logInWithReadPermissions(((Activity) (fragmentactivity)), ((java.util.Collection) (permissions)));
				//   33   70:aload_0         
				//   34   71:getfield        #23  <Field FacebookProvider this$0>
				//   35   74:invokestatic    #71  <Method LoginManager FacebookProvider.access$400(FacebookProvider)>
				//   36   77:aload_1         
				//   37   78:aload_0         
				//   38   79:getfield        #25  <Field List val$permissions>
				//   39   82:invokevirtual   #98  <Method void LoginManager.logInWithReadPermissions(Activity, java.util.Collection)>
						return;
				//   40   85:return          
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

				final FacebookProvider this$0;
				final GSPermissionResultHandler val$callback;
				final List val$permissions;
				final String val$type;

			
			{
				this$0 = FacebookProvider.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field FacebookProvider this$0>
				permissions = list;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field List val$permissions>
				type = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field String val$type>
				callback = gspermissionresulthandler;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field GSPermissionResultHandler val$callback>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//   23   45:aload_0         
	//   24   46:new             #12  <Class FacebookProvider$3>
	//   25   49:dup             
	//   26   50:aload_0         
	//   27   51:aload_2         
	//   28   52:aload_1         
	//   29   53:aload_3         
	//   30   54:invokespecial   #397 <Method void FacebookProvider$3(FacebookProvider, List, String, GSPermissionResultHandler)>
	//   31   57:invokevirtual   #370 <Method void createActivity(com.gigya.socialize.android.ui.HostActivity$HostActivityHandler)>
			return;
	//   32   60:return          
		}
	}

	private static final String DEFAULT_FACEBOOK_READ_PERMISSIONS[] = {
		"email"
	};
	private static final String PUBLISH_PERMISSIONS[] = {
		"ads_management", "create_event", "manage_friendlists", "manage_notifications", "publish_actions", "publish_stream", "rsvp_event", "publish_pages", "manage_pages"
	};
	private CallbackManager fbCallbackManager;
	private LoginManager fbLoginManager;
	private FragmentActivity permissionsActivity;
	private GSPermissionResultHandler permissionsHandler;
	private List requestedPermissions;

	static 
	{
	//    0    0:bipush          9
	//    1    2:anewarray       String[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #34  <String "ads_management">
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #36  <String "create_event">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #38  <String "manage_friendlists">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #40  <String "manage_notifications">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #42  <String "publish_actions">
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #44  <String "publish_stream">
	//   25   34:aastore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:ldc1            #46  <String "rsvp_event">
	//   29   40:aastore         
	//   30   41:dup             
	//   31   42:bipush          7
	//   32   44:ldc1            #48  <String "publish_pages">
	//   33   46:aastore         
	//   34   47:dup             
	//   35   48:bipush          8
	//   36   50:ldc1            #50  <String "manage_pages">
	//   37   52:aastore         
	//   38   53:putstatic       #52  <Field String[] PUBLISH_PERMISSIONS>
	//   39   56:iconst_1        
	//   40   57:anewarray       String[]
	//   41   60:dup             
	//   42   61:iconst_0        
	//   43   62:ldc1            #54  <String "email">
	//   44   64:aastore         
	//   45   65:putstatic       #56  <Field String[] DEFAULT_FACEBOOK_READ_PERMISSIONS>
	//*  46   68:return          
	}


/*
	static FragmentActivity access$000(FacebookProvider facebookprovider)
	{
		return facebookprovider.permissionsActivity;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field FragmentActivity permissionsActivity>
	//    2    4:areturn         
	}

*/


/*
	static FragmentActivity access$002(FacebookProvider facebookprovider, FragmentActivity fragmentactivity)
	{
		facebookprovider.permissionsActivity = fragmentactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #100 <Field FragmentActivity permissionsActivity>
		return fragmentactivity;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static GSPermissionResultHandler access$100(FacebookProvider facebookprovider)
	{
		return facebookprovider.permissionsHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field GSPermissionResultHandler permissionsHandler>
	//    2    4:areturn         
	}

*/


/*
	static GSPermissionResultHandler access$102(FacebookProvider facebookprovider, GSPermissionResultHandler gspermissionresulthandler)
	{
		facebookprovider.permissionsHandler = gspermissionresulthandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #106 <Field GSPermissionResultHandler permissionsHandler>
		return gspermissionresulthandler;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static void access$200(FacebookProvider facebookprovider, AccessToken accesstoken)
	{
		facebookprovider.reportExtendedToken(accesstoken);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #114 <Method void reportExtendedToken(AccessToken)>
		return;
	//    3    5:return          
	}

*/


/*
	static LoginBehavior access$300(FacebookProvider facebookprovider, GSObject gsobject)
	{
		return facebookprovider.extractLoginBehavior(gsobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #120 <Method LoginBehavior extractLoginBehavior(GSObject)>
	//    3    5:areturn         
	}

*/


/*
	static LoginManager access$400(FacebookProvider facebookprovider)
	{
		return facebookprovider.fbLoginManager;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field LoginManager fbLoginManager>
	//    2    4:areturn         
	}

*/


/*
	static CallbackManager access$500(FacebookProvider facebookprovider)
	{
		return facebookprovider.fbCallbackManager;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field CallbackManager fbCallbackManager>
	//    2    4:areturn         
	}

*/


/*
	static AccessToken access$600()
	{
		return getAccessToken();
	//    0    0:invokestatic    #129 <Method AccessToken getAccessToken()>
	//    1    3:areturn         
	}

*/


/*
	static List access$700(FacebookProvider facebookprovider)
	{
		return facebookprovider.requestedPermissions;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field List requestedPermissions>
	//    2    4:areturn         
	}

*/


/*
	static List access$702(FacebookProvider facebookprovider, List list)
	{
		facebookprovider.requestedPermissions = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #133 <Field List requestedPermissions>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static List access$800(FacebookProvider facebookprovider, List list)
	{
		return facebookprovider.getDeclinedPermissionsFromArray(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #140 <Method List getDeclinedPermissionsFromArray(List)>
	//    3    5:areturn         
	}

*/
}
