// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.login:
//			LoginMethodHandler, GetTokenClient, LoginClient

class GetTokenLoginMethodHandler extends LoginMethodHandler
{

	GetTokenLoginMethodHandler(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #26  <Method void LoginMethodHandler(Parcel)>
	//    3    5:return          
	}

	GetTokenLoginMethodHandler(LoginClient loginclient)
	{
		super(loginclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #29  <Method void LoginMethodHandler(LoginClient)>
	//    3    5:return          
	}

	void cancel()
	{
		GetTokenClient gettokenclient = getTokenClient;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field GetTokenClient getTokenClient>
	//    2    4:astore_1        
		if(gettokenclient != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          26
		{
			gettokenclient.cancel();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #36  <Method void GetTokenClient.cancel()>
			getTokenClient.setCompletedListener(((com.facebook.internal.PlatformServiceClient.CompletedListener) (null)));
	//    7   13:aload_0         
	//    8   14:getfield        #32  <Field GetTokenClient getTokenClient>
	//    9   17:aconst_null     
	//   10   18:invokevirtual   #40  <Method void GetTokenClient.setCompletedListener(com.facebook.internal.PlatformServiceClient$CompletedListener)>
			getTokenClient = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #32  <Field GetTokenClient getTokenClient>
		}
	//   14   26:return          
	}

	void complete(final LoginClient.Request request, final Bundle result)
	{
		String s = result.getString("com.facebook.platform.extra.USER_ID");
	//    0    0:aload_2         
	//    1    1:ldc1            #44  <String "com.facebook.platform.extra.USER_ID">
	//    2    3:invokevirtual   #50  <Method String Bundle.getString(String)>
	//    3    6:astore_3        
		if(s != null && !s.isEmpty())
	//*   4    7:aload_3         
	//*   5    8:ifnull          28
	//*   6   11:aload_3         
	//*   7   12:invokevirtual   #56  <Method boolean String.isEmpty()>
	//*   8   15:ifeq            21
	//*   9   18:goto            28
		{
			onComplete(request, result);
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:aload_2         
	//   13   24:invokevirtual   #59  <Method void onComplete(LoginClient$Request, Bundle)>
			return;
	//   14   27:return          
		} else
		{
			loginClient.notifyBackgroundProcessingStart();
	//   15   28:aload_0         
	//   16   29:getfield        #63  <Field LoginClient loginClient>
	//   17   32:invokevirtual   #68  <Method void LoginClient.notifyBackgroundProcessingStart()>
			Utility.getGraphMeRequestWithCacheAsync(result.getString("com.facebook.platform.extra.ACCESS_TOKEN"), new com.facebook.internal.Utility.GraphMeRequestWithCacheCallback() {

				public void onFailure(FacebookException facebookexception)
				{
					loginClient.complete(LoginClient.Result.createErrorResult(loginClient.getPendingRequest(), "Caught exception", facebookexception.getMessage()));
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field GetTokenLoginMethodHandler this$0>
				//    2    4:getfield        #35  <Field LoginClient GetTokenLoginMethodHandler.loginClient>
				//    3    7:aload_0         
				//    4    8:getfield        #21  <Field GetTokenLoginMethodHandler this$0>
				//    5   11:getfield        #35  <Field LoginClient GetTokenLoginMethodHandler.loginClient>
				//    6   14:invokevirtual   #41  <Method LoginClient$Request LoginClient.getPendingRequest()>
				//    7   17:ldc1            #43  <String "Caught exception">
				//    8   19:aload_1         
				//    9   20:invokevirtual   #49  <Method String FacebookException.getMessage()>
				//   10   23:invokestatic    #55  <Method LoginClient$Result LoginClient$Result.createErrorResult(LoginClient$Request, String, String)>
				//   11   26:invokevirtual   #58  <Method void LoginClient.complete(LoginClient$Result)>
				//   12   29:return          
				}

				public void onSuccess(JSONObject jsonobject)
				{
					try
					{
						jsonobject = ((JSONObject) (jsonobject.getString("id")));
				//    0    0:aload_1         
				//    1    1:ldc1            #64  <String "id">
				//    2    3:invokevirtual   #70  <Method String JSONObject.getString(String)>
				//    3    6:astore_1        
						result.putString("com.facebook.platform.extra.USER_ID", ((String) (jsonobject)));
				//    4    7:aload_0         
				//    5    8:getfield        #23  <Field Bundle val$result>
				//    6   11:ldc1            #72  <String "com.facebook.platform.extra.USER_ID">
				//    7   13:aload_1         
				//    8   14:invokevirtual   #78  <Method void Bundle.putString(String, String)>
						onComplete(request, result);
				//    9   17:aload_0         
				//   10   18:getfield        #21  <Field GetTokenLoginMethodHandler this$0>
				//   11   21:aload_0         
				//   12   22:getfield        #25  <Field LoginClient$Request val$request>
				//   13   25:aload_0         
				//   14   26:getfield        #23  <Field Bundle val$result>
				//   15   29:invokevirtual   #81  <Method void GetTokenLoginMethodHandler.onComplete(LoginClient$Request, Bundle)>
						return;
				//   16   32:return          
					}
					// Misplaced declaration of an exception variable
					catch(JSONObject jsonobject)
				//*  17   33:astore_1        
					{
						loginClient.complete(LoginClient.Result.createErrorResult(loginClient.getPendingRequest(), "Caught exception", ((JSONException) (jsonobject)).getMessage()));
				//   18   34:aload_0         
				//   19   35:getfield        #21  <Field GetTokenLoginMethodHandler this$0>
				//   20   38:getfield        #35  <Field LoginClient GetTokenLoginMethodHandler.loginClient>
				//   21   41:aload_0         
				//   22   42:getfield        #21  <Field GetTokenLoginMethodHandler this$0>
				//   23   45:getfield        #35  <Field LoginClient GetTokenLoginMethodHandler.loginClient>
				//   24   48:invokevirtual   #41  <Method LoginClient$Request LoginClient.getPendingRequest()>
				//   25   51:ldc1            #43  <String "Caught exception">
				//   26   53:aload_1         
				//   27   54:invokevirtual   #82  <Method String JSONException.getMessage()>
				//   28   57:invokestatic    #55  <Method LoginClient$Result LoginClient$Result.createErrorResult(LoginClient$Request, String, String)>
				//   29   60:invokevirtual   #58  <Method void LoginClient.complete(LoginClient$Result)>
					}
				//   30   63:return          
				}

				final GetTokenLoginMethodHandler this$0;
				final LoginClient.Request val$request;
				final Bundle val$result;

			
			{
				this$0 = GetTokenLoginMethodHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field GetTokenLoginMethodHandler this$0>
				result = bundle;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field Bundle val$result>
				request = request1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field LoginClient$Request val$request>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//   18   35:aload_2         
	//   19   36:ldc1            #70  <String "com.facebook.platform.extra.ACCESS_TOKEN">
	//   20   38:invokevirtual   #50  <Method String Bundle.getString(String)>
	//   21   41:new             #8   <Class GetTokenLoginMethodHandler$2>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:aload_2         
	//   25   47:aload_1         
	//   26   48:invokespecial   #73  <Method void GetTokenLoginMethodHandler$2(GetTokenLoginMethodHandler, Bundle, LoginClient$Request)>
	//   27   51:invokestatic    #79  <Method void Utility.getGraphMeRequestWithCacheAsync(String, com.facebook.internal.Utility$GraphMeRequestWithCacheCallback)>
			return;
	//   28   54:return          
		}
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	String getNameForLogging()
	{
		return "get_token";
	//    0    0:ldc1            #85  <String "get_token">
	//    1    2:areturn         
	}

	void getTokenCompleted(LoginClient.Request request, Bundle bundle)
	{
		GetTokenClient gettokenclient = getTokenClient;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field GetTokenClient getTokenClient>
	//    2    4:astore_3        
		if(gettokenclient != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          14
			gettokenclient.setCompletedListener(((com.facebook.internal.PlatformServiceClient.CompletedListener) (null)));
	//    5    9:aload_3         
	//    6   10:aconst_null     
	//    7   11:invokevirtual   #40  <Method void GetTokenClient.setCompletedListener(com.facebook.internal.PlatformServiceClient$CompletedListener)>
		getTokenClient = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #32  <Field GetTokenClient getTokenClient>
		loginClient.notifyBackgroundProcessingStop();
	//   11   19:aload_0         
	//   12   20:getfield        #63  <Field LoginClient loginClient>
	//   13   23:invokevirtual   #89  <Method void LoginClient.notifyBackgroundProcessingStop()>
		if(bundle != null)
	//*  14   26:aload_2         
	//*  15   27:ifnull          154
		{
			ArrayList arraylist = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
	//   16   30:aload_2         
	//   17   31:ldc1            #91  <String "com.facebook.platform.extra.PERMISSIONS">
	//   18   33:invokevirtual   #95  <Method ArrayList Bundle.getStringArrayList(String)>
	//   19   36:astore_3        
			Object obj = ((Object) (request.getPermissions()));
	//   20   37:aload_1         
	//   21   38:invokevirtual   #101 <Method Set LoginClient$Request.getPermissions()>
	//   22   41:astore          4
			if(arraylist != null && (obj == null || arraylist.containsAll(((java.util.Collection) (obj)))))
	//*  23   43:aload_3         
	//*  24   44:ifnull          68
	//*  25   47:aload           4
	//*  26   49:ifnull          61
	//*  27   52:aload_3         
	//*  28   53:aload           4
	//*  29   55:invokevirtual   #107 <Method boolean ArrayList.containsAll(java.util.Collection)>
	//*  30   58:ifeq            68
			{
				complete(request, bundle);
	//   31   61:aload_0         
	//   32   62:aload_1         
	//   33   63:aload_2         
	//   34   64:invokevirtual   #109 <Method void complete(LoginClient$Request, Bundle)>
				return;
	//   35   67:return          
			}
			bundle = ((Bundle) (new HashSet()));
	//   36   68:new             #111 <Class HashSet>
	//   37   71:dup             
	//   38   72:invokespecial   #112 <Method void HashSet()>
	//   39   75:astore_2        
			obj = ((Object) (((Set) (obj)).iterator()));
	//   40   76:aload           4
	//   41   78:invokeinterface #118 <Method Iterator Set.iterator()>
	//   42   83:astore          4
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
	//   43   85:aload           4
	//   44   87:invokeinterface #123 <Method boolean Iterator.hasNext()>
	//   45   92:ifeq            128
				String s = (String)((Iterator) (obj)).next();
	//   46   95:aload           4
	//   47   97:invokeinterface #127 <Method Object Iterator.next()>
	//   48  102:checkcast       #52  <Class String>
	//   49  105:astore          5
				if(!arraylist.contains(((Object) (s))))
	//*  50  107:aload_3         
	//*  51  108:aload           5
	//*  52  110:invokevirtual   #131 <Method boolean ArrayList.contains(Object)>
	//*  53  113:ifne            85
					((Set) (bundle)).add(((Object) (s)));
	//   54  116:aload_2         
	//   55  117:aload           5
	//   56  119:invokeinterface #134 <Method boolean Set.add(Object)>
	//   57  124:pop             
			} while(true);
	//   58  125:goto            85
			if(!((Set) (bundle)).isEmpty())
	//*  59  128:aload_2         
	//*  60  129:invokeinterface #135 <Method boolean Set.isEmpty()>
	//*  61  134:ifne            149
				addLoggingExtra("new_permissions", ((Object) (TextUtils.join(",", ((Iterable) (bundle))))));
	//   62  137:aload_0         
	//   63  138:ldc1            #137 <String "new_permissions">
	//   64  140:ldc1            #139 <String ",">
	//   65  142:aload_2         
	//   66  143:invokestatic    #145 <Method String TextUtils.join(CharSequence, Iterable)>
	//   67  146:invokevirtual   #149 <Method void addLoggingExtra(String, Object)>
			request.setPermissions(((Set) (bundle)));
	//   68  149:aload_1         
	//   69  150:aload_2         
	//   70  151:invokevirtual   #153 <Method void LoginClient$Request.setPermissions(Set)>
		}
		loginClient.tryNextHandler();
	//   71  154:aload_0         
	//   72  155:getfield        #63  <Field LoginClient loginClient>
	//   73  158:invokevirtual   #156 <Method void LoginClient.tryNextHandler()>
	//   74  161:return          
	}

	void onComplete(LoginClient.Request request, Bundle bundle)
	{
		request = ((LoginClient.Request) (createAccessTokenFromNativeLogin(bundle, AccessTokenSource.FACEBOOK_APPLICATION_SERVICE, request.getApplicationId())));
	//    0    0:aload_2         
	//    1    1:getstatic       #162 <Field AccessTokenSource AccessTokenSource.FACEBOOK_APPLICATION_SERVICE>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #165 <Method String LoginClient$Request.getApplicationId()>
	//    4    8:invokestatic    #169 <Method com.facebook.AccessToken createAccessTokenFromNativeLogin(Bundle, AccessTokenSource, String)>
	//    5   11:astore_1        
		request = ((LoginClient.Request) (LoginClient.Result.createTokenResult(loginClient.getPendingRequest(), ((com.facebook.AccessToken) (request)))));
	//    6   12:aload_0         
	//    7   13:getfield        #63  <Field LoginClient loginClient>
	//    8   16:invokevirtual   #173 <Method LoginClient$Request LoginClient.getPendingRequest()>
	//    9   19:aload_1         
	//   10   20:invokestatic    #179 <Method LoginClient$Result LoginClient$Result.createTokenResult(LoginClient$Request, com.facebook.AccessToken)>
	//   11   23:astore_1        
		loginClient.completeAndValidate(((LoginClient.Result) (request)));
	//   12   24:aload_0         
	//   13   25:getfield        #63  <Field LoginClient loginClient>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #183 <Method void LoginClient.completeAndValidate(LoginClient$Result)>
	//   16   32:return          
	}

	boolean tryAuthorize(final LoginClient.Request request)
	{
		getTokenClient = new GetTokenClient(((android.content.Context) (loginClient.getActivity())), request.getApplicationId());
	//    0    0:aload_0         
	//    1    1:new             #34  <Class GetTokenClient>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #63  <Field LoginClient loginClient>
	//    5    9:invokevirtual   #189 <Method android.support.v4.app.FragmentActivity LoginClient.getActivity()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #165 <Method String LoginClient$Request.getApplicationId()>
	//    8   16:invokespecial   #192 <Method void GetTokenClient(android.content.Context, String)>
	//    9   19:putfield        #32  <Field GetTokenClient getTokenClient>
		if(!getTokenClient.start())
	//*  10   22:aload_0         
	//*  11   23:getfield        #32  <Field GetTokenClient getTokenClient>
	//*  12   26:invokevirtual   #195 <Method boolean GetTokenClient.start()>
	//*  13   29:ifne            34
		{
			return false;
	//   14   32:iconst_0        
	//   15   33:ireturn         
		} else
		{
			loginClient.notifyBackgroundProcessingStart();
	//   16   34:aload_0         
	//   17   35:getfield        #63  <Field LoginClient loginClient>
	//   18   38:invokevirtual   #68  <Method void LoginClient.notifyBackgroundProcessingStart()>
			request = ((LoginClient.Request) (new com.facebook.internal.PlatformServiceClient.CompletedListener() {

				public void completed(Bundle bundle)
				{
					getTokenCompleted(request, bundle);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field GetTokenLoginMethodHandler this$0>
				//    2    4:aload_0         
				//    3    5:getfield        #21  <Field LoginClient$Request val$request>
				//    4    8:aload_1         
				//    5    9:invokevirtual   #31  <Method void GetTokenLoginMethodHandler.getTokenCompleted(LoginClient$Request, Bundle)>
				//    6   12:return          
				}

				final GetTokenLoginMethodHandler this$0;
				final LoginClient.Request val$request;

			
			{
				this$0 = GetTokenLoginMethodHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field GetTokenLoginMethodHandler this$0>
				request = request1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field LoginClient$Request val$request>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
));
	//   19   41:new             #6   <Class GetTokenLoginMethodHandler$1>
	//   20   44:dup             
	//   21   45:aload_0         
	//   22   46:aload_1         
	//   23   47:invokespecial   #198 <Method void GetTokenLoginMethodHandler$1(GetTokenLoginMethodHandler, LoginClient$Request)>
	//   24   50:astore_1        
			getTokenClient.setCompletedListener(((com.facebook.internal.PlatformServiceClient.CompletedListener) (request)));
	//   25   51:aload_0         
	//   26   52:getfield        #32  <Field GetTokenClient getTokenClient>
	//   27   55:aload_1         
	//   28   56:invokevirtual   #40  <Method void GetTokenClient.setCompletedListener(com.facebook.internal.PlatformServiceClient$CompletedListener)>
			return true;
	//   29   59:iconst_1        
	//   30   60:ireturn         
		}
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #202 <Method void LoginMethodHandler.writeToParcel(Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public GetTokenLoginMethodHandler createFromParcel(Parcel parcel)
		{
			return new GetTokenLoginMethodHandler(parcel);
		//    0    0:new             #8   <Class GetTokenLoginMethodHandler>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #18  <Method void GetTokenLoginMethodHandler(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #21  <Method GetTokenLoginMethodHandler createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public GetTokenLoginMethodHandler[] newArray(int i)
		{
			return new GetTokenLoginMethodHandler[i];
		//    0    0:iload_1         
		//    1    1:anewarray       GetTokenLoginMethodHandler[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #26  <Method GetTokenLoginMethodHandler[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private GetTokenClient getTokenClient;

	static 
	{
	//    0    0:new             #10  <Class GetTokenLoginMethodHandler$3>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void GetTokenLoginMethodHandler$3()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
