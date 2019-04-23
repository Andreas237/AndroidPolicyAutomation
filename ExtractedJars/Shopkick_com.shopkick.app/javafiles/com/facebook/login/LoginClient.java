// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.login:
//			LoginMethodHandler, LoginLogger, LoginBehavior, GetTokenLoginMethodHandler, 
//			KatanaProxyLoginMethodHandler, FacebookLiteLoginMethodHandler, CustomTabLoginMethodHandler, WebViewLoginMethodHandler, 
//			DeviceAuthMethodHandler, DefaultAudience, LoginManager

class LoginClient
	implements Parcelable
{
	static interface BackgroundProcessingListener
	{

		public abstract void onBackgroundProcessingStarted();

		public abstract void onBackgroundProcessingStopped();
	}

	public static interface OnCompletedListener
	{

		public abstract void onCompleted(Result result);
	}

	public static class Request
		implements Parcelable
	{

		public int describeContents()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		String getApplicationId()
		{
			return applicationId;
		//    0    0:aload_0         
		//    1    1:getfield        #78  <Field String applicationId>
		//    2    4:areturn         
		}

		String getAuthId()
		{
			return authId;
		//    0    0:aload_0         
		//    1    1:getfield        #80  <Field String authId>
		//    2    4:areturn         
		}

		String getAuthType()
		{
			return authType;
		//    0    0:aload_0         
		//    1    1:getfield        #88  <Field String authType>
		//    2    4:areturn         
		}

		DefaultAudience getDefaultAudience()
		{
			return defaultAudience;
		//    0    0:aload_0         
		//    1    1:getfield        #76  <Field DefaultAudience defaultAudience>
		//    2    4:areturn         
		}

		String getDeviceAuthTargetUserId()
		{
			return deviceAuthTargetUserId;
		//    0    0:aload_0         
		//    1    1:getfield        #90  <Field String deviceAuthTargetUserId>
		//    2    4:areturn         
		}

		String getDeviceRedirectUriString()
		{
			return deviceRedirectUriString;
		//    0    0:aload_0         
		//    1    1:getfield        #86  <Field String deviceRedirectUriString>
		//    2    4:areturn         
		}

		LoginBehavior getLoginBehavior()
		{
			return loginBehavior;
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field LoginBehavior loginBehavior>
		//    2    4:areturn         
		}

		Set getPermissions()
		{
			return permissions;
		//    0    0:aload_0         
		//    1    1:getfield        #69  <Field Set permissions>
		//    2    4:areturn         
		}

		boolean hasPublishPermission()
		{
			for(Iterator iterator = permissions.iterator(); iterator.hasNext();)
		//*   0    0:aload_0         
		//*   1    1:getfield        #69  <Field Set permissions>
		//*   2    4:invokeinterface #119 <Method Iterator Set.iterator()>
		//*   3    9:astore_1        
		//*   4   10:aload_1         
		//*   5   11:invokeinterface #124 <Method boolean Iterator.hasNext()>
		//*   6   16:ifeq            36
				if(LoginManager.isPublishPermission((String)iterator.next()))
		//*   7   19:aload_1         
		//*   8   20:invokeinterface #128 <Method Object Iterator.next()>
		//*   9   25:checkcast       #130 <Class String>
		//*  10   28:invokestatic    #136 <Method boolean LoginManager.isPublishPermission(String)>
		//*  11   31:ifeq            10
					return true;
		//   12   34:iconst_1        
		//   13   35:ireturn         

			return false;
		//   14   36:iconst_0        
		//   15   37:ireturn         
		}

		boolean isRerequest()
		{
			return isRerequest;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field boolean isRerequest>
		//    2    4:ireturn         
		}

		void setAuthType(String s)
		{
			authType = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #88  <Field String authType>
		//    3    5:return          
		}

		void setDeviceAuthTargetUserId(String s)
		{
			deviceAuthTargetUserId = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #90  <Field String deviceAuthTargetUserId>
		//    3    5:return          
		}

		void setDeviceRedirectUriString(String s)
		{
			deviceRedirectUriString = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #86  <Field String deviceRedirectUriString>
		//    3    5:return          
		}

		void setPermissions(Set set)
		{
			Validate.notNull(((Object) (set)), "permissions");
		//    0    0:aload_1         
		//    1    1:ldc1            #143 <String "permissions">
		//    2    3:invokestatic    #149 <Method void Validate.notNull(Object, String)>
			permissions = set;
		//    3    6:aload_0         
		//    4    7:aload_1         
		//    5    8:putfield        #69  <Field Set permissions>
		//    6   11:return          
		}

		void setRerequest(boolean flag)
		{
			isRerequest = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #41  <Field boolean isRerequest>
		//    3    5:return          
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			Object obj = ((Object) (loginBehavior));
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field LoginBehavior loginBehavior>
		//    2    4:astore_3        
			Object obj1 = null;
		//    3    5:aconst_null     
		//    4    6:astore          4
			if(obj != null)
		//*   5    8:aload_3         
		//*   6    9:ifnull          20
				obj = ((Object) (((LoginBehavior) (obj)).name()));
		//    7   12:aload_3         
		//    8   13:invokevirtual   #157 <Method String LoginBehavior.name()>
		//    9   16:astore_3        
			else
		//*  10   17:goto            22
				obj = null;
		//   11   20:aconst_null     
		//   12   21:astore_3        
			parcel.writeString(((String) (obj)));
		//   13   22:aload_1         
		//   14   23:aload_3         
		//   15   24:invokevirtual   #160 <Method void Parcel.writeString(String)>
			parcel.writeStringList(((java.util.List) (new ArrayList(((java.util.Collection) (permissions))))));
		//   16   27:aload_1         
		//   17   28:new             #57  <Class ArrayList>
		//   18   31:dup             
		//   19   32:aload_0         
		//   20   33:getfield        #69  <Field Set permissions>
		//   21   36:invokespecial   #161 <Method void ArrayList(java.util.Collection)>
		//   22   39:invokevirtual   #164 <Method void Parcel.writeStringList(java.util.List)>
			DefaultAudience defaultaudience = defaultAudience;
		//   23   42:aload_0         
		//   24   43:getfield        #76  <Field DefaultAudience defaultAudience>
		//   25   46:astore          5
			obj = ((Object) (obj1));
		//   26   48:aload           4
		//   27   50:astore_3        
			if(defaultaudience != null)
		//*  28   51:aload           5
		//*  29   53:ifnull          62
				obj = ((Object) (defaultaudience.name()));
		//   30   56:aload           5
		//   31   58:invokevirtual   #165 <Method String DefaultAudience.name()>
		//   32   61:astore_3        
			parcel.writeString(((String) (obj)));
		//   33   62:aload_1         
		//   34   63:aload_3         
		//   35   64:invokevirtual   #160 <Method void Parcel.writeString(String)>
			parcel.writeString(applicationId);
		//   36   67:aload_1         
		//   37   68:aload_0         
		//   38   69:getfield        #78  <Field String applicationId>
		//   39   72:invokevirtual   #160 <Method void Parcel.writeString(String)>
			parcel.writeString(authId);
		//   40   75:aload_1         
		//   41   76:aload_0         
		//   42   77:getfield        #80  <Field String authId>
		//   43   80:invokevirtual   #160 <Method void Parcel.writeString(String)>
			parcel.writeByte((byte)isRerequest);
		//   44   83:aload_1         
		//   45   84:aload_0         
		//   46   85:getfield        #41  <Field boolean isRerequest>
		//   47   88:int2byte        
		//   48   89:invokevirtual   #169 <Method void Parcel.writeByte(byte)>
			parcel.writeString(deviceRedirectUriString);
		//   49   92:aload_1         
		//   50   93:aload_0         
		//   51   94:getfield        #86  <Field String deviceRedirectUriString>
		//   52   97:invokevirtual   #160 <Method void Parcel.writeString(String)>
			parcel.writeString(authType);
		//   53  100:aload_1         
		//   54  101:aload_0         
		//   55  102:getfield        #88  <Field String authType>
		//   56  105:invokevirtual   #160 <Method void Parcel.writeString(String)>
			parcel.writeString(deviceAuthTargetUserId);
		//   57  108:aload_1         
		//   58  109:aload_0         
		//   59  110:getfield        #90  <Field String deviceAuthTargetUserId>
		//   60  113:invokevirtual   #160 <Method void Parcel.writeString(String)>
		//   61  116:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public Request createFromParcel(Parcel parcel)
			{
				return new Request(parcel);
			//    0    0:new             #9   <Class LoginClient$Request>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void LoginClient$Request(Parcel, LoginClient$1)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #25  <Method LoginClient$Request createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public Request[] newArray(int i)
			{
				return new Request[i];
			//    0    0:iload_1         
			//    1    1:anewarray       Request[]
			//    2    4:areturn         
			}

			public volatile Object[] newArray(int i)
			{
				return ((Object []) (newArray(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #30  <Method LoginClient$Request[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		private final String applicationId;
		private final String authId;
		private String authType;
		private final DefaultAudience defaultAudience;
		private String deviceAuthTargetUserId;
		private String deviceRedirectUriString;
		private boolean isRerequest;
		private final LoginBehavior loginBehavior;
		private Set permissions;

		static 
		{
		//    0    0:new             #11  <Class LoginClient$Request$1>
		//    1    3:dup             
		//    2    4:invokespecial   #34  <Method void LoginClient$Request$1()>
		//    3    7:putstatic       #36  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		private Request(Parcel parcel)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #39  <Method void Object()>
			boolean flag = false;
		//    2    4:iconst_0        
		//    3    5:istore_2        
			isRerequest = false;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #41  <Field boolean isRerequest>
			Object obj = ((Object) (parcel.readString()));
		//    7   11:aload_1         
		//    8   12:invokevirtual   #47  <Method String Parcel.readString()>
		//    9   15:astore_3        
			Object obj1 = null;
		//   10   16:aconst_null     
		//   11   17:astore          4
			if(obj != null)
		//*  12   19:aload_3         
		//*  13   20:ifnull          31
				obj = ((Object) (LoginBehavior.valueOf(((String) (obj)))));
		//   14   23:aload_3         
		//   15   24:invokestatic    #53  <Method LoginBehavior LoginBehavior.valueOf(String)>
		//   16   27:astore_3        
			else
		//*  17   28:goto            33
				obj = null;
		//   18   31:aconst_null     
		//   19   32:astore_3        
			loginBehavior = ((LoginBehavior) (obj));
		//   20   33:aload_0         
		//   21   34:aload_3         
		//   22   35:putfield        #55  <Field LoginBehavior loginBehavior>
			obj = ((Object) (new ArrayList()));
		//   23   38:new             #57  <Class ArrayList>
		//   24   41:dup             
		//   25   42:invokespecial   #58  <Method void ArrayList()>
		//   26   45:astore_3        
			parcel.readStringList(((java.util.List) (obj)));
		//   27   46:aload_1         
		//   28   47:aload_3         
		//   29   48:invokevirtual   #62  <Method void Parcel.readStringList(java.util.List)>
			permissions = ((Set) (new HashSet(((java.util.Collection) (obj)))));
		//   30   51:aload_0         
		//   31   52:new             #64  <Class HashSet>
		//   32   55:dup             
		//   33   56:aload_3         
		//   34   57:invokespecial   #67  <Method void HashSet(java.util.Collection)>
		//   35   60:putfield        #69  <Field Set permissions>
			String s = parcel.readString();
		//   36   63:aload_1         
		//   37   64:invokevirtual   #47  <Method String Parcel.readString()>
		//   38   67:astore          5
			obj = ((Object) (obj1));
		//   39   69:aload           4
		//   40   71:astore_3        
			if(s != null)
		//*  41   72:aload           5
		//*  42   74:ifnull          83
				obj = ((Object) (DefaultAudience.valueOf(s)));
		//   43   77:aload           5
		//   44   79:invokestatic    #74  <Method DefaultAudience DefaultAudience.valueOf(String)>
		//   45   82:astore_3        
			defaultAudience = ((DefaultAudience) (obj));
		//   46   83:aload_0         
		//   47   84:aload_3         
		//   48   85:putfield        #76  <Field DefaultAudience defaultAudience>
			applicationId = parcel.readString();
		//   49   88:aload_0         
		//   50   89:aload_1         
		//   51   90:invokevirtual   #47  <Method String Parcel.readString()>
		//   52   93:putfield        #78  <Field String applicationId>
			authId = parcel.readString();
		//   53   96:aload_0         
		//   54   97:aload_1         
		//   55   98:invokevirtual   #47  <Method String Parcel.readString()>
		//   56  101:putfield        #80  <Field String authId>
			if(parcel.readByte() != 0)
		//*  57  104:aload_1         
		//*  58  105:invokevirtual   #84  <Method byte Parcel.readByte()>
		//*  59  108:ifeq            113
				flag = true;
		//   60  111:iconst_1        
		//   61  112:istore_2        
			isRerequest = flag;
		//   62  113:aload_0         
		//   63  114:iload_2         
		//   64  115:putfield        #41  <Field boolean isRerequest>
			deviceRedirectUriString = parcel.readString();
		//   65  118:aload_0         
		//   66  119:aload_1         
		//   67  120:invokevirtual   #47  <Method String Parcel.readString()>
		//   68  123:putfield        #86  <Field String deviceRedirectUriString>
			authType = parcel.readString();
		//   69  126:aload_0         
		//   70  127:aload_1         
		//   71  128:invokevirtual   #47  <Method String Parcel.readString()>
		//   72  131:putfield        #88  <Field String authType>
			deviceAuthTargetUserId = parcel.readString();
		//   73  134:aload_0         
		//   74  135:aload_1         
		//   75  136:invokevirtual   #47  <Method String Parcel.readString()>
		//   76  139:putfield        #90  <Field String deviceAuthTargetUserId>
		//   77  142:return          
		}


		Request(LoginBehavior loginbehavior, Set set, DefaultAudience defaultaudience, String s, String s1, String s2)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #39  <Method void Object()>
			isRerequest = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #41  <Field boolean isRerequest>
			loginBehavior = loginbehavior;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #55  <Field LoginBehavior loginBehavior>
			if(set == null)
		//*   8   14:aload_2         
		//*   9   15:ifnull          21
		//*  10   18:goto            29
				set = ((Set) (new HashSet()));
		//   11   21:new             #64  <Class HashSet>
		//   12   24:dup             
		//   13   25:invokespecial   #95  <Method void HashSet()>
		//   14   28:astore_2        
			permissions = set;
		//   15   29:aload_0         
		//   16   30:aload_2         
		//   17   31:putfield        #69  <Field Set permissions>
			defaultAudience = defaultaudience;
		//   18   34:aload_0         
		//   19   35:aload_3         
		//   20   36:putfield        #76  <Field DefaultAudience defaultAudience>
			authType = s;
		//   21   39:aload_0         
		//   22   40:aload           4
		//   23   42:putfield        #88  <Field String authType>
			applicationId = s1;
		//   24   45:aload_0         
		//   25   46:aload           5
		//   26   48:putfield        #78  <Field String applicationId>
			authId = s2;
		//   27   51:aload_0         
		//   28   52:aload           6
		//   29   54:putfield        #80  <Field String authId>
		//   30   57:return          
		}
	}

	public static class Result
		implements Parcelable
	{

		static Result createCancelResult(Request request1, String s)
		{
			return new Result(request1, Code.CANCEL, ((AccessToken) (null)), s, ((String) (null)));
		//    0    0:new             #2   <Class LoginClient$Result>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getstatic       #99  <Field LoginClient$Result$Code LoginClient$Result$Code.CANCEL>
		//    4    8:aconst_null     
		//    5    9:aload_1         
		//    6   10:aconst_null     
		//    7   11:invokespecial   #101 <Method void LoginClient$Result(LoginClient$Request, LoginClient$Result$Code, AccessToken, String, String)>
		//    8   14:areturn         
		}

		static Result createErrorResult(Request request1, String s, String s1)
		{
			return createErrorResult(request1, s, s1, ((String) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aconst_null     
		//    4    4:invokestatic    #106 <Method LoginClient$Result createErrorResult(LoginClient$Request, String, String, String)>
		//    5    7:areturn         
		}

		static Result createErrorResult(Request request1, String s, String s1, String s2)
		{
			s = TextUtils.join(": ", ((Iterable) (Utility.asListNoNulls(((Object []) (new String[] {
				s, s1
			}))))));
		//    0    0:ldc1            #108 <String ": ">
		//    1    2:iconst_2        
		//    2    3:anewarray       String[]
		//    3    6:dup             
		//    4    7:iconst_0        
		//    5    8:aload_1         
		//    6    9:aastore         
		//    7   10:dup             
		//    8   11:iconst_1        
		//    9   12:aload_2         
		//   10   13:aastore         
		//   11   14:invokestatic    #114 <Method java.util.List Utility.asListNoNulls(Object[])>
		//   12   17:invokestatic    #120 <Method String TextUtils.join(CharSequence, Iterable)>
		//   13   20:astore_1        
			return new Result(request1, Code.ERROR, ((AccessToken) (null)), s, s2);
		//   14   21:new             #2   <Class LoginClient$Result>
		//   15   24:dup             
		//   16   25:aload_0         
		//   17   26:getstatic       #123 <Field LoginClient$Result$Code LoginClient$Result$Code.ERROR>
		//   18   29:aconst_null     
		//   19   30:aload_1         
		//   20   31:aload_3         
		//   21   32:invokespecial   #101 <Method void LoginClient$Result(LoginClient$Request, LoginClient$Result$Code, AccessToken, String, String)>
		//   22   35:areturn         
		}

		static Result createTokenResult(Request request1, AccessToken accesstoken)
		{
			return new Result(request1, Code.SUCCESS, accesstoken, ((String) (null)), ((String) (null)));
		//    0    0:new             #2   <Class LoginClient$Result>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getstatic       #128 <Field LoginClient$Result$Code LoginClient$Result$Code.SUCCESS>
		//    4    8:aload_1         
		//    5    9:aconst_null     
		//    6   10:aconst_null     
		//    7   11:invokespecial   #101 <Method void LoginClient$Result(LoginClient$Request, LoginClient$Result$Code, AccessToken, String, String)>
		//    8   14:areturn         
		}

		public int describeContents()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			parcel.writeString(code.name());
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #51  <Field LoginClient$Result$Code code>
		//    3    5:invokevirtual   #135 <Method String LoginClient$Result$Code.name()>
		//    4    8:invokevirtual   #139 <Method void Parcel.writeString(String)>
			parcel.writeParcelable(((Parcelable) (token)), i);
		//    5   11:aload_1         
		//    6   12:aload_0         
		//    7   13:getfield        #65  <Field AccessToken token>
		//    8   16:iload_2         
		//    9   17:invokevirtual   #143 <Method void Parcel.writeParcelable(Parcelable, int)>
			parcel.writeString(errorMessage);
		//   10   20:aload_1         
		//   11   21:aload_0         
		//   12   22:getfield        #67  <Field String errorMessage>
		//   13   25:invokevirtual   #139 <Method void Parcel.writeString(String)>
			parcel.writeString(errorCode);
		//   14   28:aload_1         
		//   15   29:aload_0         
		//   16   30:getfield        #69  <Field String errorCode>
		//   17   33:invokevirtual   #139 <Method void Parcel.writeString(String)>
			parcel.writeParcelable(((Parcelable) (request)), i);
		//   18   36:aload_1         
		//   19   37:aload_0         
		//   20   38:getfield        #73  <Field LoginClient$Request request>
		//   21   41:iload_2         
		//   22   42:invokevirtual   #143 <Method void Parcel.writeParcelable(Parcelable, int)>
			Utility.writeStringMapToParcel(parcel, loggingExtras);
		//   23   45:aload_1         
		//   24   46:aload_0         
		//   25   47:getfield        #81  <Field Map loggingExtras>
		//   26   50:invokestatic    #147 <Method void Utility.writeStringMapToParcel(Parcel, Map)>
			Utility.writeStringMapToParcel(parcel, extraData);
		//   27   53:aload_1         
		//   28   54:aload_0         
		//   29   55:getfield        #83  <Field Map extraData>
		//   30   58:invokestatic    #147 <Method void Utility.writeStringMapToParcel(Parcel, Map)>
		//   31   61:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public Result createFromParcel(Parcel parcel)
			{
				return new Result(parcel);
			//    0    0:new             #9   <Class LoginClient$Result>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void LoginClient$Result(Parcel, LoginClient$1)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #25  <Method LoginClient$Result createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public Result[] newArray(int i)
			{
				return new Result[i];
			//    0    0:iload_1         
			//    1    1:anewarray       Result[]
			//    2    4:areturn         
			}

			public volatile Object[] newArray(int i)
			{
				return ((Object []) (newArray(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #30  <Method LoginClient$Result[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		final Code code;
		final String errorCode;
		final String errorMessage;
		public Map extraData;
		public Map loggingExtras;
		final Request request;
		final AccessToken token;

		static 
		{
		//    0    0:new             #11  <Class LoginClient$Result$1>
		//    1    3:dup             
		//    2    4:invokespecial   #35  <Method void LoginClient$Result$1()>
		//    3    7:putstatic       #37  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		private Result(Parcel parcel)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #39  <Method void Object()>
			code = Code.valueOf(parcel.readString());
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #45  <Method String Parcel.readString()>
		//    5    9:invokestatic    #49  <Method LoginClient$Result$Code LoginClient$Result$Code.valueOf(String)>
		//    6   12:putfield        #51  <Field LoginClient$Result$Code code>
			token = (AccessToken)parcel.readParcelable(((Class) (com/facebook/AccessToken)).getClassLoader());
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:ldc1            #53  <Class AccessToken>
		//   10   19:invokevirtual   #59  <Method ClassLoader Class.getClassLoader()>
		//   11   22:invokevirtual   #63  <Method Parcelable Parcel.readParcelable(ClassLoader)>
		//   12   25:checkcast       #53  <Class AccessToken>
		//   13   28:putfield        #65  <Field AccessToken token>
			errorMessage = parcel.readString();
		//   14   31:aload_0         
		//   15   32:aload_1         
		//   16   33:invokevirtual   #45  <Method String Parcel.readString()>
		//   17   36:putfield        #67  <Field String errorMessage>
			errorCode = parcel.readString();
		//   18   39:aload_0         
		//   19   40:aload_1         
		//   20   41:invokevirtual   #45  <Method String Parcel.readString()>
		//   21   44:putfield        #69  <Field String errorCode>
			request = (Request)parcel.readParcelable(((Class) (com/facebook/login/LoginClient$Request)).getClassLoader());
		//   22   47:aload_0         
		//   23   48:aload_1         
		//   24   49:ldc1            #71  <Class LoginClient$Request>
		//   25   51:invokevirtual   #59  <Method ClassLoader Class.getClassLoader()>
		//   26   54:invokevirtual   #63  <Method Parcelable Parcel.readParcelable(ClassLoader)>
		//   27   57:checkcast       #71  <Class LoginClient$Request>
		//   28   60:putfield        #73  <Field LoginClient$Request request>
			loggingExtras = Utility.readStringMapFromParcel(parcel);
		//   29   63:aload_0         
		//   30   64:aload_1         
		//   31   65:invokestatic    #79  <Method Map Utility.readStringMapFromParcel(Parcel)>
		//   32   68:putfield        #81  <Field Map loggingExtras>
			extraData = Utility.readStringMapFromParcel(parcel);
		//   33   71:aload_0         
		//   34   72:aload_1         
		//   35   73:invokestatic    #79  <Method Map Utility.readStringMapFromParcel(Parcel)>
		//   36   76:putfield        #83  <Field Map extraData>
		//   37   79:return          
		}


		Result(Request request1, Code code1, AccessToken accesstoken, String s, String s1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #39  <Method void Object()>
			Validate.notNull(((Object) (code1)), "code");
		//    2    4:aload_2         
		//    3    5:ldc1            #88  <String "code">
		//    4    7:invokestatic    #94  <Method void Validate.notNull(Object, String)>
			request = request1;
		//    5   10:aload_0         
		//    6   11:aload_1         
		//    7   12:putfield        #73  <Field LoginClient$Request request>
			token = accesstoken;
		//    8   15:aload_0         
		//    9   16:aload_3         
		//   10   17:putfield        #65  <Field AccessToken token>
			errorMessage = s;
		//   11   20:aload_0         
		//   12   21:aload           4
		//   13   23:putfield        #67  <Field String errorMessage>
			code = code1;
		//   14   26:aload_0         
		//   15   27:aload_2         
		//   16   28:putfield        #51  <Field LoginClient$Result$Code code>
			errorCode = s1;
		//   17   31:aload_0         
		//   18   32:aload           5
		//   19   34:putfield        #69  <Field String errorCode>
		//   20   37:return          
		}
	}

	static final class Result.Code extends Enum
	{

		public static Result.Code valueOf(String s)
		{
			return (Result.Code)Enum.valueOf(com/facebook/login/LoginClient$Result$Code, s);
		//    0    0:ldc1            #2   <Class LoginClient$Result$Code>
		//    1    2:aload_0         
		//    2    3:invokestatic    #54  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class LoginClient$Result$Code>
		//    4    9:areturn         
		}

		public static Result.Code[] values()
		{
			return (Result.Code[])((Result.Code []) ($VALUES)).clone();
		//    0    0:getstatic       #42  <Field LoginClient$Result$Code[] $VALUES>
		//    1    3:invokevirtual   #61  <Method Object _5B_Lcom.facebook.login.LoginClient$Result$Code_3B_.clone()>
		//    2    6:checkcast       #57  <Class LoginClient$Result$Code[]>
		//    3    9:areturn         
		}

		String getLoggingValue()
		{
			return loggingValue;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field String loggingValue>
		//    2    4:areturn         
		}

		private static final Result.Code $VALUES[];
		public static final Result.Code CANCEL;
		public static final Result.Code ERROR;
		public static final Result.Code SUCCESS;
		private final String loggingValue;

		static 
		{
			SUCCESS = new Result.Code("SUCCESS", 0, "success");
		//    0    0:new             #2   <Class LoginClient$Result$Code>
		//    1    3:dup             
		//    2    4:ldc1            #22  <String "SUCCESS">
		//    3    6:iconst_0        
		//    4    7:ldc1            #24  <String "success">
		//    5    9:invokespecial   #28  <Method void LoginClient$Result$Code(String, int, String)>
		//    6   12:putstatic       #30  <Field LoginClient$Result$Code SUCCESS>
			CANCEL = new Result.Code("CANCEL", 1, "cancel");
		//    7   15:new             #2   <Class LoginClient$Result$Code>
		//    8   18:dup             
		//    9   19:ldc1            #31  <String "CANCEL">
		//   10   21:iconst_1        
		//   11   22:ldc1            #33  <String "cancel">
		//   12   24:invokespecial   #28  <Method void LoginClient$Result$Code(String, int, String)>
		//   13   27:putstatic       #35  <Field LoginClient$Result$Code CANCEL>
			ERROR = new Result.Code("ERROR", 2, "error");
		//   14   30:new             #2   <Class LoginClient$Result$Code>
		//   15   33:dup             
		//   16   34:ldc1            #36  <String "ERROR">
		//   17   36:iconst_2        
		//   18   37:ldc1            #38  <String "error">
		//   19   39:invokespecial   #28  <Method void LoginClient$Result$Code(String, int, String)>
		//   20   42:putstatic       #40  <Field LoginClient$Result$Code ERROR>
			$VALUES = (new Result.Code[] {
				SUCCESS, CANCEL, ERROR
			});
		//   21   45:iconst_3        
		//   22   46:anewarray       Result.Code[]
		//   23   49:dup             
		//   24   50:iconst_0        
		//   25   51:getstatic       #30  <Field LoginClient$Result$Code SUCCESS>
		//   26   54:aastore         
		//   27   55:dup             
		//   28   56:iconst_1        
		//   29   57:getstatic       #35  <Field LoginClient$Result$Code CANCEL>
		//   30   60:aastore         
		//   31   61:dup             
		//   32   62:iconst_2        
		//   33   63:getstatic       #40  <Field LoginClient$Result$Code ERROR>
		//   34   66:aastore         
		//   35   67:putstatic       #42  <Field LoginClient$Result$Code[] $VALUES>
		//*  36   70:return          
		}

		private Result.Code(String s, int i, String s1)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #45  <Method void Enum(String, int)>
			loggingValue = s1;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #47  <Field String loggingValue>
		//    7   11:return          
		}
	}


	public LoginClient(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void Object()>
		currentHandler = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #61  <Field int currentHandler>
		Parcelable aparcelable[] = parcel.readParcelableArray(((Class) (com/facebook/login/LoginMethodHandler)).getClassLoader());
	//    5    9:aload_1         
	//    6   10:ldc1            #63  <Class LoginMethodHandler>
	//    7   12:invokevirtual   #69  <Method ClassLoader Class.getClassLoader()>
	//    8   15:invokevirtual   #75  <Method Parcelable[] Parcel.readParcelableArray(ClassLoader)>
	//    9   18:astore_3        
		handlersToTry = new LoginMethodHandler[aparcelable.length];
	//   10   19:aload_0         
	//   11   20:aload_3         
	//   12   21:arraylength     
	//   13   22:anewarray       LoginMethodHandler[]
	//   14   25:putfield        #77  <Field LoginMethodHandler[] handlersToTry>
		for(int i = 0; i < aparcelable.length; i++)
	//*  15   28:iconst_0        
	//*  16   29:istore_2        
	//*  17   30:iload_2         
	//*  18   31:aload_3         
	//*  19   32:arraylength     
	//*  20   33:icmpge          67
		{
			LoginMethodHandler aloginmethodhandler[] = handlersToTry;
	//   21   36:aload_0         
	//   22   37:getfield        #77  <Field LoginMethodHandler[] handlersToTry>
	//   23   40:astore          4
			aloginmethodhandler[i] = (LoginMethodHandler)aparcelable[i];
	//   24   42:aload           4
	//   25   44:iload_2         
	//   26   45:aload_3         
	//   27   46:iload_2         
	//   28   47:aaload          
	//   29   48:checkcast       #63  <Class LoginMethodHandler>
	//   30   51:aastore         
			aloginmethodhandler[i].setLoginClient(this);
	//   31   52:aload           4
	//   32   54:iload_2         
	//   33   55:aaload          
	//   34   56:aload_0         
	//   35   57:invokevirtual   #81  <Method void LoginMethodHandler.setLoginClient(LoginClient)>
		}

	//   36   60:iload_2         
	//   37   61:iconst_1        
	//   38   62:iadd            
	//   39   63:istore_2        
	//*  40   64:goto            30
		currentHandler = parcel.readInt();
	//   41   67:aload_0         
	//   42   68:aload_1         
	//   43   69:invokevirtual   #85  <Method int Parcel.readInt()>
	//   44   72:putfield        #61  <Field int currentHandler>
		pendingRequest = (Request)parcel.readParcelable(((Class) (com/facebook/login/LoginClient$Request)).getClassLoader());
	//   45   75:aload_0         
	//   46   76:aload_1         
	//   47   77:ldc1            #16  <Class LoginClient$Request>
	//   48   79:invokevirtual   #69  <Method ClassLoader Class.getClassLoader()>
	//   49   82:invokevirtual   #89  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   50   85:checkcast       #16  <Class LoginClient$Request>
	//   51   88:putfield        #91  <Field LoginClient$Request pendingRequest>
		loggingExtras = Utility.readStringMapFromParcel(parcel);
	//   52   91:aload_0         
	//   53   92:aload_1         
	//   54   93:invokestatic    #97  <Method Map Utility.readStringMapFromParcel(Parcel)>
	//   55   96:putfield        #99  <Field Map loggingExtras>
		extraData = Utility.readStringMapFromParcel(parcel);
	//   56   99:aload_0         
	//   57  100:aload_1         
	//   58  101:invokestatic    #97  <Method Map Utility.readStringMapFromParcel(Parcel)>
	//   59  104:putfield        #101 <Field Map extraData>
	//   60  107:return          
	}

	public LoginClient(Fragment fragment1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void Object()>
		currentHandler = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #61  <Field int currentHandler>
		fragment = fragment1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #104 <Field Fragment fragment>
	//    8   14:return          
	}

	private void addLoggingExtra(String s, String s1, boolean flag)
	{
		if(loggingExtras == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #99  <Field Map loggingExtras>
	//*   2    4:ifnonnull       18
			loggingExtras = ((Map) (new HashMap()));
	//    3    7:aload_0         
	//    4    8:new             #108 <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #109 <Method void HashMap()>
	//    7   15:putfield        #99  <Field Map loggingExtras>
		Object obj = ((Object) (s1));
	//    8   18:aload_2         
	//    9   19:astore          4
		if(loggingExtras.containsKey(((Object) (s))))
	//*  10   21:aload_0         
	//*  11   22:getfield        #99  <Field Map loggingExtras>
	//*  12   25:aload_1         
	//*  13   26:invokeinterface #115 <Method boolean Map.containsKey(Object)>
	//*  14   31:ifeq            91
		{
			obj = ((Object) (s1));
	//   15   34:aload_2         
	//   16   35:astore          4
			if(flag)
	//*  17   37:iload_3         
	//*  18   38:ifeq            91
			{
				obj = ((Object) (new StringBuilder()));
	//   19   41:new             #117 <Class StringBuilder>
	//   20   44:dup             
	//   21   45:invokespecial   #118 <Method void StringBuilder()>
	//   22   48:astore          4
				((StringBuilder) (obj)).append((String)loggingExtras.get(((Object) (s))));
	//   23   50:aload           4
	//   24   52:aload_0         
	//   25   53:getfield        #99  <Field Map loggingExtras>
	//   26   56:aload_1         
	//   27   57:invokeinterface #122 <Method Object Map.get(Object)>
	//   28   62:checkcast       #124 <Class String>
	//   29   65:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   30   68:pop             
				((StringBuilder) (obj)).append(",");
	//   31   69:aload           4
	//   32   71:ldc1            #130 <String ",">
	//   33   73:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   34   76:pop             
				((StringBuilder) (obj)).append(s1);
	//   35   77:aload           4
	//   36   79:aload_2         
	//   37   80:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   38   83:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   39   84:aload           4
	//   40   86:invokevirtual   #134 <Method String StringBuilder.toString()>
	//   41   89:astore          4
			}
		}
		loggingExtras.put(((Object) (s)), obj);
	//   42   91:aload_0         
	//   43   92:getfield        #99  <Field Map loggingExtras>
	//   44   95:aload_1         
	//   45   96:aload           4
	//   46   98:invokeinterface #138 <Method Object Map.put(Object, Object)>
	//   47  103:pop             
	//   48  104:return          
	}

	private void completeWithFailure()
	{
		complete(Result.createErrorResult(pendingRequest, "Login attempt failed.", ((String) (null))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #91  <Field LoginClient$Request pendingRequest>
	//    3    5:ldc1            #141 <String "Login attempt failed.">
	//    4    7:aconst_null     
	//    5    8:invokestatic    #145 <Method LoginClient$Result LoginClient$Result.createErrorResult(LoginClient$Request, String, String)>
	//    6   11:invokevirtual   #149 <Method void complete(LoginClient$Result)>
	//    7   14:return          
	}

	static String getE2E()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #154 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #155 <Method void JSONObject()>
	//    3    7:astore_0        
		try
		{
			jsonobject.put("init", System.currentTimeMillis());
	//    4    8:aload_0         
	//    5    9:ldc1            #157 <String "init">
	//    6   11:invokestatic    #163 <Method long System.currentTimeMillis()>
	//    7   14:invokevirtual   #166 <Method JSONObject JSONObject.put(String, long)>
	//    8   17:pop             
		}
	//*   9   18:aload_0         
	//*  10   19:invokevirtual   #167 <Method String JSONObject.toString()>
	//*  11   22:areturn         
		catch(JSONException jsonexception) { }
	//   12   23:astore_1        
		return jsonobject.toString();
	//*  13   24:goto            18
	}

	private LoginLogger getLogger()
	{
		LoginLogger loginlogger = loginLogger;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field LoginLogger loginLogger>
	//    2    4:astore_1        
		if(loginlogger == null || !loginlogger.getApplicationId().equals(((Object) (pendingRequest.getApplicationId()))))
	//*   3    5:aload_1         
	//*   4    6:ifnull          26
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #176 <Method String LoginLogger.getApplicationId()>
	//*   7   13:aload_0         
	//*   8   14:getfield        #91  <Field LoginClient$Request pendingRequest>
	//*   9   17:invokevirtual   #177 <Method String LoginClient$Request.getApplicationId()>
	//*  10   20:invokevirtual   #180 <Method boolean String.equals(Object)>
	//*  11   23:ifne            48
			loginLogger = new LoginLogger(((android.content.Context) (getActivity())), pendingRequest.getApplicationId());
	//   12   26:aload_0         
	//   13   27:new             #173 <Class LoginLogger>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:invokevirtual   #184 <Method FragmentActivity getActivity()>
	//   17   35:aload_0         
	//   18   36:getfield        #91  <Field LoginClient$Request pendingRequest>
	//   19   39:invokevirtual   #177 <Method String LoginClient$Request.getApplicationId()>
	//   20   42:invokespecial   #187 <Method void LoginLogger(android.content.Context, String)>
	//   21   45:putfield        #171 <Field LoginLogger loginLogger>
		return loginLogger;
	//   22   48:aload_0         
	//   23   49:getfield        #171 <Field LoginLogger loginLogger>
	//   24   52:areturn         
	}

	public static int getLoginRequestCode()
	{
		return com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
	//    0    0:getstatic       #194 <Field com.facebook.internal.CallbackManagerImpl$RequestCodeOffset com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.Login>
	//    1    3:invokevirtual   #197 <Method int com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.toRequestCode()>
	//    2    6:ireturn         
	}

	private void logAuthorizationMethodComplete(String s, Result result, Map map)
	{
		logAuthorizationMethodComplete(s, result.code.getLoggingValue(), result.errorMessage, result.errorCode, map);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getfield        #203 <Field LoginClient$Result$Code LoginClient$Result.code>
	//    4    6:invokevirtual   #206 <Method String LoginClient$Result$Code.getLoggingValue()>
	//    5    9:aload_2         
	//    6   10:getfield        #210 <Field String LoginClient$Result.errorMessage>
	//    7   13:aload_2         
	//    8   14:getfield        #213 <Field String LoginClient$Result.errorCode>
	//    9   17:aload_3         
	//   10   18:invokespecial   #216 <Method void logAuthorizationMethodComplete(String, String, String, String, Map)>
	//   11   21:return          
	}

	private void logAuthorizationMethodComplete(String s, String s1, String s2, String s3, Map map)
	{
		if(pendingRequest == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #91  <Field LoginClient$Request pendingRequest>
	//*   2    4:ifnonnull       20
		{
			getLogger().logUnexpectedError("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", s);
	//    3    7:aload_0         
	//    4    8:invokespecial   #220 <Method LoginLogger getLogger()>
	//    5   11:ldc1            #222 <String "fb_mobile_login_method_complete">
	//    6   13:ldc1            #224 <String "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.">
	//    7   15:aload_1         
	//    8   16:invokevirtual   #228 <Method void LoginLogger.logUnexpectedError(String, String, String)>
			return;
	//    9   19:return          
		} else
		{
			getLogger().logAuthorizationMethodComplete(pendingRequest.getAuthId(), s, s1, s2, s3, map);
	//   10   20:aload_0         
	//   11   21:invokespecial   #220 <Method LoginLogger getLogger()>
	//   12   24:aload_0         
	//   13   25:getfield        #91  <Field LoginClient$Request pendingRequest>
	//   14   28:invokevirtual   #231 <Method String LoginClient$Request.getAuthId()>
	//   15   31:aload_1         
	//   16   32:aload_2         
	//   17   33:aload_3         
	//   18   34:aload           4
	//   19   36:aload           5
	//   20   38:invokevirtual   #234 <Method void LoginLogger.logAuthorizationMethodComplete(String, String, String, String, String, Map)>
			return;
	//   21   41:return          
		}
	}

	private void notifyOnCompleteListener(Result result)
	{
		OnCompletedListener oncompletedlistener = onCompletedListener;
	//    0    0:aload_0         
	//    1    1:getfield        #238 <Field LoginClient$OnCompletedListener onCompletedListener>
	//    2    4:astore_2        
		if(oncompletedlistener != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			oncompletedlistener.onCompleted(result);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #241 <Method void LoginClient$OnCompletedListener.onCompleted(LoginClient$Result)>
	//    8   16:return          
	}

	void addExtraData(String s, String s1, boolean flag)
	{
		if(extraData == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Map extraData>
	//*   2    4:ifnonnull       18
			extraData = ((Map) (new HashMap()));
	//    3    7:aload_0         
	//    4    8:new             #108 <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #109 <Method void HashMap()>
	//    7   15:putfield        #101 <Field Map extraData>
		Object obj = ((Object) (s1));
	//    8   18:aload_2         
	//    9   19:astore          4
		if(extraData.containsKey(((Object) (s))))
	//*  10   21:aload_0         
	//*  11   22:getfield        #101 <Field Map extraData>
	//*  12   25:aload_1         
	//*  13   26:invokeinterface #115 <Method boolean Map.containsKey(Object)>
	//*  14   31:ifeq            91
		{
			obj = ((Object) (s1));
	//   15   34:aload_2         
	//   16   35:astore          4
			if(flag)
	//*  17   37:iload_3         
	//*  18   38:ifeq            91
			{
				obj = ((Object) (new StringBuilder()));
	//   19   41:new             #117 <Class StringBuilder>
	//   20   44:dup             
	//   21   45:invokespecial   #118 <Method void StringBuilder()>
	//   22   48:astore          4
				((StringBuilder) (obj)).append((String)extraData.get(((Object) (s))));
	//   23   50:aload           4
	//   24   52:aload_0         
	//   25   53:getfield        #101 <Field Map extraData>
	//   26   56:aload_1         
	//   27   57:invokeinterface #122 <Method Object Map.get(Object)>
	//   28   62:checkcast       #124 <Class String>
	//   29   65:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   30   68:pop             
				((StringBuilder) (obj)).append(",");
	//   31   69:aload           4
	//   32   71:ldc1            #130 <String ",">
	//   33   73:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   34   76:pop             
				((StringBuilder) (obj)).append(s1);
	//   35   77:aload           4
	//   36   79:aload_2         
	//   37   80:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   38   83:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   39   84:aload           4
	//   40   86:invokevirtual   #134 <Method String StringBuilder.toString()>
	//   41   89:astore          4
			}
		}
		extraData.put(((Object) (s)), obj);
	//   42   91:aload_0         
	//   43   92:getfield        #101 <Field Map extraData>
	//   44   95:aload_1         
	//   45   96:aload           4
	//   46   98:invokeinterface #138 <Method Object Map.put(Object, Object)>
	//   47  103:pop             
	//   48  104:return          
	}

	void authorize(Request request)
	{
		if(request == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(pendingRequest == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #91  <Field LoginClient$Request pendingRequest>
	//*   5    9:ifnonnull       45
		{
			if(AccessToken.isCurrentAccessTokenActive() && !checkInternetPermission())
	//*   6   12:invokestatic    #250 <Method boolean AccessToken.isCurrentAccessTokenActive()>
	//*   7   15:ifeq            26
	//*   8   18:aload_0         
	//*   9   19:invokevirtual   #253 <Method boolean checkInternetPermission()>
	//*  10   22:ifne            26
			{
				return;
	//   11   25:return          
			} else
			{
				pendingRequest = request;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #91  <Field LoginClient$Request pendingRequest>
				handlersToTry = getHandlersToTry(request);
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #257 <Method LoginMethodHandler[] getHandlersToTry(LoginClient$Request)>
	//   19   37:putfield        #77  <Field LoginMethodHandler[] handlersToTry>
				tryNextHandler();
	//   20   40:aload_0         
	//   21   41:invokevirtual   #260 <Method void tryNextHandler()>
				return;
	//   22   44:return          
			}
		} else
		{
			throw new FacebookException("Attempted to authorize while a request is pending.");
	//   23   45:new             #262 <Class FacebookException>
	//   24   48:dup             
	//   25   49:ldc2            #264 <String "Attempted to authorize while a request is pending.">
	//   26   52:invokespecial   #267 <Method void FacebookException(String)>
	//   27   55:athrow          
		}
	}

	void cancelCurrentHandler()
	{
		if(currentHandler >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int currentHandler>
	//*   2    4:iflt            14
			getCurrentHandler().cancel();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #272 <Method LoginMethodHandler getCurrentHandler()>
	//    5   11:invokevirtual   #275 <Method void LoginMethodHandler.cancel()>
	//    6   14:return          
	}

	boolean checkInternetPermission()
	{
		if(checkedInternetPermission)
	//*   0    0:aload_0         
	//*   1    1:getfield        #277 <Field boolean checkedInternetPermission>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(checkPermission("android.permission.INTERNET") != 0)
	//*   5    9:aload_0         
	//*   6   10:ldc2            #279 <String "android.permission.INTERNET">
	//*   7   13:invokevirtual   #283 <Method int checkPermission(String)>
	//*   8   16:ifeq            55
		{
			Object obj = ((Object) (getActivity()));
	//    9   19:aload_0         
	//   10   20:invokevirtual   #184 <Method FragmentActivity getActivity()>
	//   11   23:astore_2        
			String s = ((Activity) (obj)).getString(com.facebook.common.R.string.com_facebook_internet_permission_error_title);
	//   12   24:aload_2         
	//   13   25:getstatic       #288 <Field int com.facebook.common.R$string.com_facebook_internet_permission_error_title>
	//   14   28:invokevirtual   #294 <Method String Activity.getString(int)>
	//   15   31:astore_1        
			obj = ((Object) (((Activity) (obj)).getString(com.facebook.common.R.string.com_facebook_internet_permission_error_message)));
	//   16   32:aload_2         
	//   17   33:getstatic       #297 <Field int com.facebook.common.R$string.com_facebook_internet_permission_error_message>
	//   18   36:invokevirtual   #294 <Method String Activity.getString(int)>
	//   19   39:astore_2        
			complete(Result.createErrorResult(pendingRequest, s, ((String) (obj))));
	//   20   40:aload_0         
	//   21   41:aload_0         
	//   22   42:getfield        #91  <Field LoginClient$Request pendingRequest>
	//   23   45:aload_1         
	//   24   46:aload_2         
	//   25   47:invokestatic    #145 <Method LoginClient$Result LoginClient$Result.createErrorResult(LoginClient$Request, String, String)>
	//   26   50:invokevirtual   #149 <Method void complete(LoginClient$Result)>
			return false;
	//   27   53:iconst_0        
	//   28   54:ireturn         
		} else
		{
			checkedInternetPermission = true;
	//   29   55:aload_0         
	//   30   56:iconst_1        
	//   31   57:putfield        #277 <Field boolean checkedInternetPermission>
			return true;
	//   32   60:iconst_1        
	//   33   61:ireturn         
		}
	}

	int checkPermission(String s)
	{
		return getActivity().checkCallingOrSelfPermission(s);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #184 <Method FragmentActivity getActivity()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #302 <Method int FragmentActivity.checkCallingOrSelfPermission(String)>
	//    4    8:ireturn         
	}

	void complete(Result result)
	{
		Object obj = ((Object) (getCurrentHandler()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #272 <Method LoginMethodHandler getCurrentHandler()>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          22
			logAuthorizationMethodComplete(((LoginMethodHandler) (obj)).getNameForLogging(), result, ((LoginMethodHandler) (obj)).methodLoggingExtras);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #305 <Method String LoginMethodHandler.getNameForLogging()>
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:getfield        #308 <Field Map LoginMethodHandler.methodLoggingExtras>
	//   11   19:invokespecial   #310 <Method void logAuthorizationMethodComplete(String, LoginClient$Result, Map)>
		obj = ((Object) (loggingExtras));
	//   12   22:aload_0         
	//   13   23:getfield        #99  <Field Map loggingExtras>
	//   14   26:astore_2        
		if(obj != null)
	//*  15   27:aload_2         
	//*  16   28:ifnull          36
			result.loggingExtras = ((Map) (obj));
	//   17   31:aload_1         
	//   18   32:aload_2         
	//   19   33:putfield        #311 <Field Map LoginClient$Result.loggingExtras>
		obj = ((Object) (extraData));
	//   20   36:aload_0         
	//   21   37:getfield        #101 <Field Map extraData>
	//   22   40:astore_2        
		if(obj != null)
	//*  23   41:aload_2         
	//*  24   42:ifnull          50
			result.extraData = ((Map) (obj));
	//   25   45:aload_1         
	//   26   46:aload_2         
	//   27   47:putfield        #312 <Field Map LoginClient$Result.extraData>
		handlersToTry = null;
	//   28   50:aload_0         
	//   29   51:aconst_null     
	//   30   52:putfield        #77  <Field LoginMethodHandler[] handlersToTry>
		currentHandler = -1;
	//   31   55:aload_0         
	//   32   56:iconst_m1       
	//   33   57:putfield        #61  <Field int currentHandler>
		pendingRequest = null;
	//   34   60:aload_0         
	//   35   61:aconst_null     
	//   36   62:putfield        #91  <Field LoginClient$Request pendingRequest>
		loggingExtras = null;
	//   37   65:aload_0         
	//   38   66:aconst_null     
	//   39   67:putfield        #99  <Field Map loggingExtras>
		notifyOnCompleteListener(result);
	//   40   70:aload_0         
	//   41   71:aload_1         
	//   42   72:invokespecial   #314 <Method void notifyOnCompleteListener(LoginClient$Result)>
	//   43   75:return          
	}

	void completeAndValidate(Result result)
	{
		if(result.token != null && AccessToken.isCurrentAccessTokenActive())
	//*   0    0:aload_1         
	//*   1    1:getfield        #319 <Field AccessToken LoginClient$Result.token>
	//*   2    4:ifnull          19
	//*   3    7:invokestatic    #250 <Method boolean AccessToken.isCurrentAccessTokenActive()>
	//*   4   10:ifeq            19
		{
			validateSameFbidAndFinish(result);
	//    5   13:aload_0         
	//    6   14:aload_1         
	//    7   15:invokevirtual   #322 <Method void validateSameFbidAndFinish(LoginClient$Result)>
			return;
	//    8   18:return          
		} else
		{
			complete(result);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #149 <Method void complete(LoginClient$Result)>
			return;
	//   12   24:return          
		}
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	FragmentActivity getActivity()
	{
		return fragment.getActivity();
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field Fragment fragment>
	//    2    4:invokevirtual   #326 <Method FragmentActivity Fragment.getActivity()>
	//    3    7:areturn         
	}

	BackgroundProcessingListener getBackgroundProcessingListener()
	{
		return backgroundProcessingListener;
	//    0    0:aload_0         
	//    1    1:getfield        #330 <Field LoginClient$BackgroundProcessingListener backgroundProcessingListener>
	//    2    4:areturn         
	}

	LoginMethodHandler getCurrentHandler()
	{
		int i = currentHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int currentHandler>
	//    2    4:istore_1        
		if(i >= 0)
	//*   3    5:iload_1         
	//*   4    6:iflt            16
			return handlersToTry[i];
	//    5    9:aload_0         
	//    6   10:getfield        #77  <Field LoginMethodHandler[] handlersToTry>
	//    7   13:iload_1         
	//    8   14:aaload          
	//    9   15:areturn         
		else
			return null;
	//   10   16:aconst_null     
	//   11   17:areturn         
	}

	public Fragment getFragment()
	{
		return fragment;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field Fragment fragment>
	//    2    4:areturn         
	}

	protected LoginMethodHandler[] getHandlersToTry(Request request)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #334 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #335 <Method void ArrayList()>
	//    3    7:astore_2        
		request = ((Request) (request.getLoginBehavior()));
	//    4    8:aload_1         
	//    5    9:invokevirtual   #339 <Method LoginBehavior LoginClient$Request.getLoginBehavior()>
	//    6   12:astore_1        
		if(((LoginBehavior) (request)).allowsGetTokenAuth())
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #344 <Method boolean LoginBehavior.allowsGetTokenAuth()>
	//*   9   17:ifeq            33
			arraylist.add(((Object) (new GetTokenLoginMethodHandler(this))));
	//   10   20:aload_2         
	//   11   21:new             #346 <Class GetTokenLoginMethodHandler>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:invokespecial   #348 <Method void GetTokenLoginMethodHandler(LoginClient)>
	//   15   29:invokevirtual   #351 <Method boolean ArrayList.add(Object)>
	//   16   32:pop             
		if(((LoginBehavior) (request)).allowsKatanaAuth())
	//*  17   33:aload_1         
	//*  18   34:invokevirtual   #354 <Method boolean LoginBehavior.allowsKatanaAuth()>
	//*  19   37:ifeq            53
			arraylist.add(((Object) (new KatanaProxyLoginMethodHandler(this))));
	//   20   40:aload_2         
	//   21   41:new             #356 <Class KatanaProxyLoginMethodHandler>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:invokespecial   #357 <Method void KatanaProxyLoginMethodHandler(LoginClient)>
	//   25   49:invokevirtual   #351 <Method boolean ArrayList.add(Object)>
	//   26   52:pop             
		if(((LoginBehavior) (request)).allowsFacebookLiteAuth())
	//*  27   53:aload_1         
	//*  28   54:invokevirtual   #360 <Method boolean LoginBehavior.allowsFacebookLiteAuth()>
	//*  29   57:ifeq            73
			arraylist.add(((Object) (new FacebookLiteLoginMethodHandler(this))));
	//   30   60:aload_2         
	//   31   61:new             #362 <Class FacebookLiteLoginMethodHandler>
	//   32   64:dup             
	//   33   65:aload_0         
	//   34   66:invokespecial   #363 <Method void FacebookLiteLoginMethodHandler(LoginClient)>
	//   35   69:invokevirtual   #351 <Method boolean ArrayList.add(Object)>
	//   36   72:pop             
		if(((LoginBehavior) (request)).allowsCustomTabAuth())
	//*  37   73:aload_1         
	//*  38   74:invokevirtual   #366 <Method boolean LoginBehavior.allowsCustomTabAuth()>
	//*  39   77:ifeq            93
			arraylist.add(((Object) (new CustomTabLoginMethodHandler(this))));
	//   40   80:aload_2         
	//   41   81:new             #368 <Class CustomTabLoginMethodHandler>
	//   42   84:dup             
	//   43   85:aload_0         
	//   44   86:invokespecial   #369 <Method void CustomTabLoginMethodHandler(LoginClient)>
	//   45   89:invokevirtual   #351 <Method boolean ArrayList.add(Object)>
	//   46   92:pop             
		if(((LoginBehavior) (request)).allowsWebViewAuth())
	//*  47   93:aload_1         
	//*  48   94:invokevirtual   #372 <Method boolean LoginBehavior.allowsWebViewAuth()>
	//*  49   97:ifeq            113
			arraylist.add(((Object) (new WebViewLoginMethodHandler(this))));
	//   50  100:aload_2         
	//   51  101:new             #374 <Class WebViewLoginMethodHandler>
	//   52  104:dup             
	//   53  105:aload_0         
	//   54  106:invokespecial   #375 <Method void WebViewLoginMethodHandler(LoginClient)>
	//   55  109:invokevirtual   #351 <Method boolean ArrayList.add(Object)>
	//   56  112:pop             
		if(((LoginBehavior) (request)).allowsDeviceAuth())
	//*  57  113:aload_1         
	//*  58  114:invokevirtual   #378 <Method boolean LoginBehavior.allowsDeviceAuth()>
	//*  59  117:ifeq            133
			arraylist.add(((Object) (new DeviceAuthMethodHandler(this))));
	//   60  120:aload_2         
	//   61  121:new             #380 <Class DeviceAuthMethodHandler>
	//   62  124:dup             
	//   63  125:aload_0         
	//   64  126:invokespecial   #381 <Method void DeviceAuthMethodHandler(LoginClient)>
	//   65  129:invokevirtual   #351 <Method boolean ArrayList.add(Object)>
	//   66  132:pop             
		request = ((Request) (new LoginMethodHandler[arraylist.size()]));
	//   67  133:aload_2         
	//   68  134:invokevirtual   #384 <Method int ArrayList.size()>
	//   69  137:anewarray       LoginMethodHandler[]
	//   70  140:astore_1        
		arraylist.toArray(((Object []) (request)));
	//   71  141:aload_2         
	//   72  142:aload_1         
	//   73  143:invokevirtual   #388 <Method Object[] ArrayList.toArray(Object[])>
	//   74  146:pop             
		return ((LoginMethodHandler []) (request));
	//   75  147:aload_1         
	//   76  148:areturn         
	}

	boolean getInProgress()
	{
		return pendingRequest != null && currentHandler >= 0;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field LoginClient$Request pendingRequest>
	//    2    4:ifnull          16
	//    3    7:aload_0         
	//    4    8:getfield        #61  <Field int currentHandler>
	//    5   11:iflt            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	OnCompletedListener getOnCompletedListener()
	{
		return onCompletedListener;
	//    0    0:aload_0         
	//    1    1:getfield        #238 <Field LoginClient$OnCompletedListener onCompletedListener>
	//    2    4:areturn         
	}

	public Request getPendingRequest()
	{
		return pendingRequest;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field LoginClient$Request pendingRequest>
	//    2    4:areturn         
	}

	void notifyBackgroundProcessingStart()
	{
		BackgroundProcessingListener backgroundprocessinglistener = backgroundProcessingListener;
	//    0    0:aload_0         
	//    1    1:getfield        #330 <Field LoginClient$BackgroundProcessingListener backgroundProcessingListener>
	//    2    4:astore_1        
		if(backgroundprocessinglistener != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			backgroundprocessinglistener.onBackgroundProcessingStarted();
	//    5    9:aload_1         
	//    6   10:invokeinterface #397 <Method void LoginClient$BackgroundProcessingListener.onBackgroundProcessingStarted()>
	//    7   15:return          
	}

	void notifyBackgroundProcessingStop()
	{
		BackgroundProcessingListener backgroundprocessinglistener = backgroundProcessingListener;
	//    0    0:aload_0         
	//    1    1:getfield        #330 <Field LoginClient$BackgroundProcessingListener backgroundProcessingListener>
	//    2    4:astore_1        
		if(backgroundprocessinglistener != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			backgroundprocessinglistener.onBackgroundProcessingStopped();
	//    5    9:aload_1         
	//    6   10:invokeinterface #401 <Method void LoginClient$BackgroundProcessingListener.onBackgroundProcessingStopped()>
	//    7   15:return          
	}

	public boolean onActivityResult(int i, int j, Intent intent)
	{
		if(pendingRequest != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #91  <Field LoginClient$Request pendingRequest>
	//*   2    4:ifnull          18
			return getCurrentHandler().onActivityResult(i, j, intent);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #272 <Method LoginMethodHandler getCurrentHandler()>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:aload_3         
	//    8   14:invokevirtual   #405 <Method boolean LoginMethodHandler.onActivityResult(int, int, Intent)>
	//    9   17:ireturn         
		else
			return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	void setBackgroundProcessingListener(BackgroundProcessingListener backgroundprocessinglistener)
	{
		backgroundProcessingListener = backgroundprocessinglistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #330 <Field LoginClient$BackgroundProcessingListener backgroundProcessingListener>
	//    3    5:return          
	}

	void setFragment(Fragment fragment1)
	{
		if(fragment == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #104 <Field Fragment fragment>
	//*   2    4:ifnonnull       13
		{
			fragment = fragment1;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #104 <Field Fragment fragment>
			return;
	//    6   12:return          
		} else
		{
			throw new FacebookException("Can't set fragment once it is already set.");
	//    7   13:new             #262 <Class FacebookException>
	//    8   16:dup             
	//    9   17:ldc2            #410 <String "Can't set fragment once it is already set.">
	//   10   20:invokespecial   #267 <Method void FacebookException(String)>
	//   11   23:athrow          
		}
	}

	void setOnCompletedListener(OnCompletedListener oncompletedlistener)
	{
		onCompletedListener = oncompletedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #238 <Field LoginClient$OnCompletedListener onCompletedListener>
	//    3    5:return          
	}

	void startOrContinueAuth(Request request)
	{
		if(!getInProgress())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #415 <Method boolean getInProgress()>
	//*   2    4:ifne            12
			authorize(request);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #417 <Method void authorize(LoginClient$Request)>
	//    6   12:return          
	}

	boolean tryCurrentHandler()
	{
		LoginMethodHandler loginmethodhandler = getCurrentHandler();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #272 <Method LoginMethodHandler getCurrentHandler()>
	//    2    4:astore_2        
		if(loginmethodhandler.needsInternetPermission() && !checkInternetPermission())
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #421 <Method boolean LoginMethodHandler.needsInternetPermission()>
	//*   5    9:ifeq            32
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #253 <Method boolean checkInternetPermission()>
	//*   8   16:ifne            32
		{
			addLoggingExtra("no_internet_permission", "1", false);
	//    9   19:aload_0         
	//   10   20:ldc2            #423 <String "no_internet_permission">
	//   11   23:ldc2            #425 <String "1">
	//   12   26:iconst_0        
	//   13   27:invokespecial   #427 <Method void addLoggingExtra(String, String, boolean)>
			return false;
	//   14   30:iconst_0        
	//   15   31:ireturn         
		}
		boolean flag = loginmethodhandler.tryAuthorize(pendingRequest);
	//   16   32:aload_2         
	//   17   33:aload_0         
	//   18   34:getfield        #91  <Field LoginClient$Request pendingRequest>
	//   19   37:invokevirtual   #431 <Method boolean LoginMethodHandler.tryAuthorize(LoginClient$Request)>
	//   20   40:istore_1        
		if(flag)
	//*  21   41:iload_1         
	//*  22   42:ifeq            65
		{
			getLogger().logAuthorizationMethodStart(pendingRequest.getAuthId(), loginmethodhandler.getNameForLogging());
	//   23   45:aload_0         
	//   24   46:invokespecial   #220 <Method LoginLogger getLogger()>
	//   25   49:aload_0         
	//   26   50:getfield        #91  <Field LoginClient$Request pendingRequest>
	//   27   53:invokevirtual   #231 <Method String LoginClient$Request.getAuthId()>
	//   28   56:aload_2         
	//   29   57:invokevirtual   #305 <Method String LoginMethodHandler.getNameForLogging()>
	//   30   60:invokevirtual   #435 <Method void LoginLogger.logAuthorizationMethodStart(String, String)>
			return flag;
	//   31   63:iload_1         
	//   32   64:ireturn         
		} else
		{
			getLogger().logAuthorizationMethodNotTried(pendingRequest.getAuthId(), loginmethodhandler.getNameForLogging());
	//   33   65:aload_0         
	//   34   66:invokespecial   #220 <Method LoginLogger getLogger()>
	//   35   69:aload_0         
	//   36   70:getfield        #91  <Field LoginClient$Request pendingRequest>
	//   37   73:invokevirtual   #231 <Method String LoginClient$Request.getAuthId()>
	//   38   76:aload_2         
	//   39   77:invokevirtual   #305 <Method String LoginMethodHandler.getNameForLogging()>
	//   40   80:invokevirtual   #438 <Method void LoginLogger.logAuthorizationMethodNotTried(String, String)>
			addLoggingExtra("not_tried", loginmethodhandler.getNameForLogging(), true);
	//   41   83:aload_0         
	//   42   84:ldc2            #440 <String "not_tried">
	//   43   87:aload_2         
	//   44   88:invokevirtual   #305 <Method String LoginMethodHandler.getNameForLogging()>
	//   45   91:iconst_1        
	//   46   92:invokespecial   #427 <Method void addLoggingExtra(String, String, boolean)>
			return flag;
	//   47   95:iload_1         
	//   48   96:ireturn         
		}
	}

	void tryNextHandler()
	{
		if(currentHandler >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int currentHandler>
	//*   2    4:iflt            30
			logAuthorizationMethodComplete(getCurrentHandler().getNameForLogging(), "skipped", ((String) (null)), ((String) (null)), getCurrentHandler().methodLoggingExtras);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #272 <Method LoginMethodHandler getCurrentHandler()>
	//    6   12:invokevirtual   #305 <Method String LoginMethodHandler.getNameForLogging()>
	//    7   15:ldc2            #442 <String "skipped">
	//    8   18:aconst_null     
	//    9   19:aconst_null     
	//   10   20:aload_0         
	//   11   21:invokevirtual   #272 <Method LoginMethodHandler getCurrentHandler()>
	//   12   24:getfield        #308 <Field Map LoginMethodHandler.methodLoggingExtras>
	//   13   27:invokespecial   #216 <Method void logAuthorizationMethodComplete(String, String, String, String, Map)>
		do
		{
			LoginMethodHandler aloginmethodhandler[] = handlersToTry;
	//   14   30:aload_0         
	//   15   31:getfield        #77  <Field LoginMethodHandler[] handlersToTry>
	//   16   34:astore_2        
			if(aloginmethodhandler == null)
				break;
	//   17   35:aload_2         
	//   18   36:ifnull          67
			int i = currentHandler;
	//   19   39:aload_0         
	//   20   40:getfield        #61  <Field int currentHandler>
	//   21   43:istore_1        
			if(i >= aloginmethodhandler.length - 1)
				break;
	//   22   44:iload_1         
	//   23   45:aload_2         
	//   24   46:arraylength     
	//   25   47:iconst_1        
	//   26   48:isub            
	//   27   49:icmpge          67
			currentHandler = i + 1;
	//   28   52:aload_0         
	//   29   53:iload_1         
	//   30   54:iconst_1        
	//   31   55:iadd            
	//   32   56:putfield        #61  <Field int currentHandler>
			if(tryCurrentHandler())
	//*  33   59:aload_0         
	//*  34   60:invokevirtual   #444 <Method boolean tryCurrentHandler()>
	//*  35   63:ifeq            30
				return;
	//   36   66:return          
		} while(true);
		if(pendingRequest != null)
	//*  37   67:aload_0         
	//*  38   68:getfield        #91  <Field LoginClient$Request pendingRequest>
	//*  39   71:ifnull          78
			completeWithFailure();
	//   40   74:aload_0         
	//   41   75:invokespecial   #446 <Method void completeWithFailure()>
	//   42   78:return          
	}

	void validateSameFbidAndFinish(Result result)
	{
label0:
		{
			if(result.token == null)
				break label0;
	//    0    0:aload_1         
	//    1    1:getfield        #319 <Field AccessToken LoginClient$Result.token>
	//    2    4:ifnull          91
			AccessToken accesstoken = AccessToken.getCurrentAccessToken();
	//    3    7:invokestatic    #452 <Method AccessToken AccessToken.getCurrentAccessToken()>
	//    4   10:astore_2        
			AccessToken accesstoken1 = result.token;
	//    5   11:aload_1         
	//    6   12:getfield        #319 <Field AccessToken LoginClient$Result.token>
	//    7   15:astore_3        
			if(accesstoken != null && accesstoken1 != null)
	//*   8   16:aload_2         
	//*   9   17:ifnull          53
	//*  10   20:aload_3         
	//*  11   21:ifnull          53
				try
				{
					if(accesstoken.getUserId().equals(((Object) (accesstoken1.getUserId()))))
	//*  12   24:aload_2         
	//*  13   25:invokevirtual   #455 <Method String AccessToken.getUserId()>
	//*  14   28:aload_3         
	//*  15   29:invokevirtual   #455 <Method String AccessToken.getUserId()>
	//*  16   32:invokevirtual   #180 <Method boolean String.equals(Object)>
	//*  17   35:ifeq            53
					{
						result = Result.createTokenResult(pendingRequest, result.token);
	//   18   38:aload_0         
	//   19   39:getfield        #91  <Field LoginClient$Request pendingRequest>
	//   20   42:aload_1         
	//   21   43:getfield        #319 <Field AccessToken LoginClient$Result.token>
	//   22   46:invokestatic    #459 <Method LoginClient$Result LoginClient$Result.createTokenResult(LoginClient$Request, AccessToken)>
	//   23   49:astore_1        
						break MISSING_BLOCK_LABEL_65;
	//   24   50:goto            65
					}
				}
	//*  25   53:aload_0         
	//*  26   54:getfield        #91  <Field LoginClient$Request pendingRequest>
	//*  27   57:ldc2            #461 <String "User logged in as different Facebook user.">
	//*  28   60:aconst_null     
	//*  29   61:invokestatic    #145 <Method LoginClient$Result LoginClient$Result.createErrorResult(LoginClient$Request, String, String)>
	//*  30   64:astore_1        
	//*  31   65:aload_0         
	//*  32   66:aload_1         
	//*  33   67:invokevirtual   #149 <Method void complete(LoginClient$Result)>
	//*  34   70:return          
				// Misplaced declaration of an exception variable
				catch(Result result)
	//*  35   71:astore_1        
				{
					complete(Result.createErrorResult(pendingRequest, "Caught exception", ((Exception) (result)).getMessage()));
	//   36   72:aload_0         
	//   37   73:aload_0         
	//   38   74:getfield        #91  <Field LoginClient$Request pendingRequest>
	//   39   77:ldc2            #463 <String "Caught exception">
	//   40   80:aload_1         
	//   41   81:invokevirtual   #466 <Method String Exception.getMessage()>
	//   42   84:invokestatic    #145 <Method LoginClient$Result LoginClient$Result.createErrorResult(LoginClient$Request, String, String)>
	//   43   87:invokevirtual   #149 <Method void complete(LoginClient$Result)>
					return;
	//   44   90:return          
				}
		}
		result = Result.createErrorResult(pendingRequest, "User logged in as different Facebook user.", ((String) (null)));
		complete(result);
		return;
		throw new FacebookException("Can't validate without a token");
	//   45   91:new             #262 <Class FacebookException>
	//   46   94:dup             
	//   47   95:ldc2            #468 <String "Can't validate without a token">
	//   48   98:invokespecial   #267 <Method void FacebookException(String)>
	//   49  101:athrow          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeParcelableArray(((Parcelable []) (handlersToTry)), i);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #77  <Field LoginMethodHandler[] handlersToTry>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #474 <Method void Parcel.writeParcelableArray(Parcelable[], int)>
		parcel.writeInt(currentHandler);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #61  <Field int currentHandler>
	//    8   14:invokevirtual   #478 <Method void Parcel.writeInt(int)>
		parcel.writeParcelable(((Parcelable) (pendingRequest)), i);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #91  <Field LoginClient$Request pendingRequest>
	//   12   22:iload_2         
	//   13   23:invokevirtual   #482 <Method void Parcel.writeParcelable(Parcelable, int)>
		Utility.writeStringMapToParcel(parcel, loggingExtras);
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:getfield        #99  <Field Map loggingExtras>
	//   17   31:invokestatic    #486 <Method void Utility.writeStringMapToParcel(Parcel, Map)>
		Utility.writeStringMapToParcel(parcel, extraData);
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #101 <Field Map extraData>
	//   21   39:invokestatic    #486 <Method void Utility.writeStringMapToParcel(Parcel, Map)>
	//   22   42:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public LoginClient createFromParcel(Parcel parcel)
		{
			return new LoginClient(parcel);
		//    0    0:new             #9   <Class LoginClient>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void LoginClient(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method LoginClient createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public LoginClient[] newArray(int i)
		{
			return new LoginClient[i];
		//    0    0:iload_1         
		//    1    1:anewarray       LoginClient[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method LoginClient[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	BackgroundProcessingListener backgroundProcessingListener;
	boolean checkedInternetPermission;
	int currentHandler;
	Map extraData;
	Fragment fragment;
	LoginMethodHandler handlersToTry[];
	Map loggingExtras;
	private LoginLogger loginLogger;
	OnCompletedListener onCompletedListener;
	Request pendingRequest;

	static 
	{
	//    0    0:new             #8   <Class LoginClient$1>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void LoginClient$1()>
	//    3    7:putstatic       #57  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
