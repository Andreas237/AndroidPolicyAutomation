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
import com.facebook.*;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.util.*;
import org.json.*;

// Referenced classes of package com.facebook.login:
//			LoginMethodHandler, LoginBehavior, GetTokenLoginMethodHandler, KatanaProxyLoginMethodHandler, 
//			WebViewLoginMethodHandler, LoginLogger, DefaultAudience, LoginManager

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

	private static class PermissionsPair
	{

		public List getDeclinedPermissions()
		{
			return declinedPermissions;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field List declinedPermissions>
		//    2    4:areturn         
		}

		public List getGrantedPermissions()
		{
			return grantedPermissions;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field List grantedPermissions>
		//    2    4:areturn         
		}

		List declinedPermissions;
		List grantedPermissions;

		public PermissionsPair(List list, List list1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			grantedPermissions = list;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field List grantedPermissions>
			declinedPermissions = list1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #20  <Field List declinedPermissions>
		//    8   14:return          
		}
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
		//    1    1:getfield        #75  <Field String applicationId>
		//    2    4:areturn         
		}

		String getAuthId()
		{
			return authId;
		//    0    0:aload_0         
		//    1    1:getfield        #77  <Field String authId>
		//    2    4:areturn         
		}

		DefaultAudience getDefaultAudience()
		{
			return defaultAudience;
		//    0    0:aload_0         
		//    1    1:getfield        #73  <Field DefaultAudience defaultAudience>
		//    2    4:areturn         
		}

		LoginBehavior getLoginBehavior()
		{
			return loginBehavior;
		//    0    0:aload_0         
		//    1    1:getfield        #52  <Field LoginBehavior loginBehavior>
		//    2    4:areturn         
		}

		Set getPermissions()
		{
			return permissions;
		//    0    0:aload_0         
		//    1    1:getfield        #66  <Field Set permissions>
		//    2    4:areturn         
		}

		boolean hasPublishPermission()
		{
			for(Iterator iterator = permissions.iterator(); iterator.hasNext();)
		//*   0    0:aload_0         
		//*   1    1:getfield        #66  <Field Set permissions>
		//*   2    4:invokeinterface #107 <Method Iterator Set.iterator()>
		//*   3    9:astore_1        
		//*   4   10:aload_1         
		//*   5   11:invokeinterface #112 <Method boolean Iterator.hasNext()>
		//*   6   16:ifeq            36
				if(LoginManager.isPublishPermission((String)iterator.next()))
		//*   7   19:aload_1         
		//*   8   20:invokeinterface #116 <Method Object Iterator.next()>
		//*   9   25:checkcast       #118 <Class String>
		//*  10   28:invokestatic    #124 <Method boolean LoginManager.isPublishPermission(String)>
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
		//    1    1:getfield        #38  <Field boolean isRerequest>
		//    2    4:ireturn         
		}

		void setPermissions(Set set)
		{
			Validate.notNull(((Object) (set)), "permissions");
		//    0    0:aload_1         
		//    1    1:ldc1            #127 <String "permissions">
		//    2    3:invokestatic    #133 <Method void Validate.notNull(Object, String)>
			permissions = set;
		//    3    6:aload_0         
		//    4    7:aload_1         
		//    5    8:putfield        #66  <Field Set permissions>
		//    6   11:return          
		}

		void setRerequest(boolean flag)
		{
			isRerequest = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #38  <Field boolean isRerequest>
		//    3    5:return          
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			Object obj = ((Object) (loginBehavior));
		//    0    0:aload_0         
		//    1    1:getfield        #52  <Field LoginBehavior loginBehavior>
		//    2    4:astore_3        
			Object obj1 = null;
		//    3    5:aconst_null     
		//    4    6:astore          4
			if(obj != null)
		//*   5    8:aload_3         
		//*   6    9:ifnull          23
				obj = ((Object) (loginBehavior.name()));
		//    7   12:aload_0         
		//    8   13:getfield        #52  <Field LoginBehavior loginBehavior>
		//    9   16:invokevirtual   #141 <Method String LoginBehavior.name()>
		//   10   19:astore_3        
			else
		//*  11   20:goto            25
				obj = null;
		//   12   23:aconst_null     
		//   13   24:astore_3        
			parcel.writeString(((String) (obj)));
		//   14   25:aload_1         
		//   15   26:aload_3         
		//   16   27:invokevirtual   #145 <Method void Parcel.writeString(String)>
			parcel.writeStringList(((List) (new ArrayList(((Collection) (permissions))))));
		//   17   30:aload_1         
		//   18   31:new             #54  <Class ArrayList>
		//   19   34:dup             
		//   20   35:aload_0         
		//   21   36:getfield        #66  <Field Set permissions>
		//   22   39:invokespecial   #146 <Method void ArrayList(Collection)>
		//   23   42:invokevirtual   #149 <Method void Parcel.writeStringList(List)>
			obj = ((Object) (obj1));
		//   24   45:aload           4
		//   25   47:astore_3        
			if(defaultAudience != null)
		//*  26   48:aload_0         
		//*  27   49:getfield        #73  <Field DefaultAudience defaultAudience>
		//*  28   52:ifnull          63
				obj = ((Object) (defaultAudience.name()));
		//   29   55:aload_0         
		//   30   56:getfield        #73  <Field DefaultAudience defaultAudience>
		//   31   59:invokevirtual   #150 <Method String DefaultAudience.name()>
		//   32   62:astore_3        
			parcel.writeString(((String) (obj)));
		//   33   63:aload_1         
		//   34   64:aload_3         
		//   35   65:invokevirtual   #145 <Method void Parcel.writeString(String)>
			parcel.writeString(applicationId);
		//   36   68:aload_1         
		//   37   69:aload_0         
		//   38   70:getfield        #75  <Field String applicationId>
		//   39   73:invokevirtual   #145 <Method void Parcel.writeString(String)>
			parcel.writeString(authId);
		//   40   76:aload_1         
		//   41   77:aload_0         
		//   42   78:getfield        #77  <Field String authId>
		//   43   81:invokevirtual   #145 <Method void Parcel.writeString(String)>
			parcel.writeByte((byte)isRerequest);
		//   44   84:aload_1         
		//   45   85:aload_0         
		//   46   86:getfield        #38  <Field boolean isRerequest>
		//   47   89:int2byte        
		//   48   90:invokevirtual   #154 <Method void Parcel.writeByte(byte)>
		//   49   93:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public Request createFromParcel(Parcel parcel)
			{
				return new Request(parcel);
			//    0    0:new             #8   <Class LoginClient$Request>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #21  <Method void LoginClient$Request(Parcel, LoginClient$1)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #24  <Method LoginClient$Request createFromParcel(Parcel)>
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
			//    2    2:invokevirtual   #29  <Method LoginClient$Request[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		private final String applicationId;
		private final String authId;
		private final DefaultAudience defaultAudience;
		private boolean isRerequest;
		private final LoginBehavior loginBehavior;
		private Set permissions;

		static 
		{
		//    0    0:new             #11  <Class LoginClient$Request$1>
		//    1    3:dup             
		//    2    4:invokespecial   #31  <Method void LoginClient$Request$1()>
		//    3    7:putstatic       #33  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		private Request(Parcel parcel)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #36  <Method void Object()>
			boolean flag = false;
		//    2    4:iconst_0        
		//    3    5:istore_2        
			isRerequest = false;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #38  <Field boolean isRerequest>
			Object obj = ((Object) (parcel.readString()));
		//    7   11:aload_1         
		//    8   12:invokevirtual   #44  <Method String Parcel.readString()>
		//    9   15:astore_3        
			Object obj1 = null;
		//   10   16:aconst_null     
		//   11   17:astore          4
			if(obj != null)
		//*  12   19:aload_3         
		//*  13   20:ifnull          31
				obj = ((Object) (LoginBehavior.valueOf(((String) (obj)))));
		//   14   23:aload_3         
		//   15   24:invokestatic    #50  <Method LoginBehavior LoginBehavior.valueOf(String)>
		//   16   27:astore_3        
			else
		//*  17   28:goto            33
				obj = null;
		//   18   31:aconst_null     
		//   19   32:astore_3        
			loginBehavior = ((LoginBehavior) (obj));
		//   20   33:aload_0         
		//   21   34:aload_3         
		//   22   35:putfield        #52  <Field LoginBehavior loginBehavior>
			obj = ((Object) (new ArrayList()));
		//   23   38:new             #54  <Class ArrayList>
		//   24   41:dup             
		//   25   42:invokespecial   #55  <Method void ArrayList()>
		//   26   45:astore_3        
			parcel.readStringList(((List) (obj)));
		//   27   46:aload_1         
		//   28   47:aload_3         
		//   29   48:invokevirtual   #59  <Method void Parcel.readStringList(List)>
			permissions = ((Set) (new HashSet(((Collection) (obj)))));
		//   30   51:aload_0         
		//   31   52:new             #61  <Class HashSet>
		//   32   55:dup             
		//   33   56:aload_3         
		//   34   57:invokespecial   #64  <Method void HashSet(Collection)>
		//   35   60:putfield        #66  <Field Set permissions>
			String s = parcel.readString();
		//   36   63:aload_1         
		//   37   64:invokevirtual   #44  <Method String Parcel.readString()>
		//   38   67:astore          5
			obj = ((Object) (obj1));
		//   39   69:aload           4
		//   40   71:astore_3        
			if(s != null)
		//*  41   72:aload           5
		//*  42   74:ifnull          83
				obj = ((Object) (DefaultAudience.valueOf(s)));
		//   43   77:aload           5
		//   44   79:invokestatic    #71  <Method DefaultAudience DefaultAudience.valueOf(String)>
		//   45   82:astore_3        
			defaultAudience = ((DefaultAudience) (obj));
		//   46   83:aload_0         
		//   47   84:aload_3         
		//   48   85:putfield        #73  <Field DefaultAudience defaultAudience>
			applicationId = parcel.readString();
		//   49   88:aload_0         
		//   50   89:aload_1         
		//   51   90:invokevirtual   #44  <Method String Parcel.readString()>
		//   52   93:putfield        #75  <Field String applicationId>
			authId = parcel.readString();
		//   53   96:aload_0         
		//   54   97:aload_1         
		//   55   98:invokevirtual   #44  <Method String Parcel.readString()>
		//   56  101:putfield        #77  <Field String authId>
			if(parcel.readByte() != 0)
		//*  57  104:aload_1         
		//*  58  105:invokevirtual   #81  <Method byte Parcel.readByte()>
		//*  59  108:ifeq            113
				flag = true;
		//   60  111:iconst_1        
		//   61  112:istore_2        
			isRerequest = flag;
		//   62  113:aload_0         
		//   63  114:iload_2         
		//   64  115:putfield        #38  <Field boolean isRerequest>
		//   65  118:return          
		}


		Request(LoginBehavior loginbehavior, Set set, DefaultAudience defaultaudience, String s, String s1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #36  <Method void Object()>
			isRerequest = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #38  <Field boolean isRerequest>
			loginBehavior = loginbehavior;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #52  <Field LoginBehavior loginBehavior>
			if(set == null)
		//*   8   14:aload_2         
		//*   9   15:ifnull          21
		//*  10   18:goto            29
				set = ((Set) (new HashSet()));
		//   11   21:new             #61  <Class HashSet>
		//   12   24:dup             
		//   13   25:invokespecial   #86  <Method void HashSet()>
		//   14   28:astore_2        
			permissions = set;
		//   15   29:aload_0         
		//   16   30:aload_2         
		//   17   31:putfield        #66  <Field Set permissions>
			defaultAudience = defaultaudience;
		//   18   34:aload_0         
		//   19   35:aload_3         
		//   20   36:putfield        #73  <Field DefaultAudience defaultAudience>
			applicationId = s;
		//   21   39:aload_0         
		//   22   40:aload           4
		//   23   42:putfield        #75  <Field String applicationId>
			authId = s1;
		//   24   45:aload_0         
		//   25   46:aload           5
		//   26   48:putfield        #77  <Field String authId>
		//   27   51:return          
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
		//    3    5:getstatic       #96  <Field LoginClient$Result$Code LoginClient$Result$Code.CANCEL>
		//    4    8:aconst_null     
		//    5    9:aload_1         
		//    6   10:aconst_null     
		//    7   11:invokespecial   #98  <Method void LoginClient$Result(LoginClient$Request, LoginClient$Result$Code, AccessToken, String, String)>
		//    8   14:areturn         
		}

		static Result createErrorResult(Request request1, String s, String s1)
		{
			return createErrorResult(request1, s, s1, ((String) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aconst_null     
		//    4    4:invokestatic    #103 <Method LoginClient$Result createErrorResult(LoginClient$Request, String, String, String)>
		//    5    7:areturn         
		}

		static Result createErrorResult(Request request1, String s, String s1, String s2)
		{
			s = TextUtils.join(": ", ((Iterable) (Utility.asListNoNulls(((Object []) (new String[] {
				s, s1
			}))))));
		//    0    0:ldc1            #105 <String ": ">
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
		//   11   14:invokestatic    #111 <Method List Utility.asListNoNulls(Object[])>
		//   12   17:invokestatic    #117 <Method String TextUtils.join(CharSequence, Iterable)>
		//   13   20:astore_1        
			return new Result(request1, Code.ERROR, ((AccessToken) (null)), s, s2);
		//   14   21:new             #2   <Class LoginClient$Result>
		//   15   24:dup             
		//   16   25:aload_0         
		//   17   26:getstatic       #120 <Field LoginClient$Result$Code LoginClient$Result$Code.ERROR>
		//   18   29:aconst_null     
		//   19   30:aload_1         
		//   20   31:aload_3         
		//   21   32:invokespecial   #98  <Method void LoginClient$Result(LoginClient$Request, LoginClient$Result$Code, AccessToken, String, String)>
		//   22   35:areturn         
		}

		static Result createTokenResult(Request request1, AccessToken accesstoken)
		{
			return new Result(request1, Code.SUCCESS, accesstoken, ((String) (null)), ((String) (null)));
		//    0    0:new             #2   <Class LoginClient$Result>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getstatic       #125 <Field LoginClient$Result$Code LoginClient$Result$Code.SUCCESS>
		//    4    8:aload_1         
		//    5    9:aconst_null     
		//    6   10:aconst_null     
		//    7   11:invokespecial   #98  <Method void LoginClient$Result(LoginClient$Request, LoginClient$Result$Code, AccessToken, String, String)>
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
		//    2    2:getfield        #50  <Field LoginClient$Result$Code code>
		//    3    5:invokevirtual   #132 <Method String LoginClient$Result$Code.name()>
		//    4    8:invokevirtual   #136 <Method void Parcel.writeString(String)>
			parcel.writeParcelable(((Parcelable) (token)), i);
		//    5   11:aload_1         
		//    6   12:aload_0         
		//    7   13:getfield        #64  <Field AccessToken token>
		//    8   16:iload_2         
		//    9   17:invokevirtual   #140 <Method void Parcel.writeParcelable(Parcelable, int)>
			parcel.writeString(errorMessage);
		//   10   20:aload_1         
		//   11   21:aload_0         
		//   12   22:getfield        #66  <Field String errorMessage>
		//   13   25:invokevirtual   #136 <Method void Parcel.writeString(String)>
			parcel.writeString(errorCode);
		//   14   28:aload_1         
		//   15   29:aload_0         
		//   16   30:getfield        #68  <Field String errorCode>
		//   17   33:invokevirtual   #136 <Method void Parcel.writeString(String)>
			parcel.writeParcelable(((Parcelable) (request)), i);
		//   18   36:aload_1         
		//   19   37:aload_0         
		//   20   38:getfield        #72  <Field LoginClient$Request request>
		//   21   41:iload_2         
		//   22   42:invokevirtual   #140 <Method void Parcel.writeParcelable(Parcelable, int)>
			Utility.writeStringMapToParcel(parcel, loggingExtras);
		//   23   45:aload_1         
		//   24   46:aload_0         
		//   25   47:getfield        #80  <Field Map loggingExtras>
		//   26   50:invokestatic    #144 <Method void Utility.writeStringMapToParcel(Parcel, Map)>
		//   27   53:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public Result createFromParcel(Parcel parcel)
			{
				return new Result(parcel);
			//    0    0:new             #8   <Class LoginClient$Result>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #21  <Method void LoginClient$Result(Parcel, LoginClient$1)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #24  <Method LoginClient$Result createFromParcel(Parcel)>
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
			//    2    2:invokevirtual   #29  <Method LoginClient$Result[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		final Code code;
		final String errorCode;
		final String errorMessage;
		public Map loggingExtras;
		final Request request;
		final AccessToken token;

		static 
		{
		//    0    0:new             #11  <Class LoginClient$Result$1>
		//    1    3:dup             
		//    2    4:invokespecial   #34  <Method void LoginClient$Result$1()>
		//    3    7:putstatic       #36  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		private Result(Parcel parcel)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #38  <Method void Object()>
			code = Code.valueOf(parcel.readString());
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #44  <Method String Parcel.readString()>
		//    5    9:invokestatic    #48  <Method LoginClient$Result$Code LoginClient$Result$Code.valueOf(String)>
		//    6   12:putfield        #50  <Field LoginClient$Result$Code code>
			token = (AccessToken)parcel.readParcelable(((Class) (com/facebook/AccessToken)).getClassLoader());
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:ldc1            #52  <Class AccessToken>
		//   10   19:invokevirtual   #58  <Method ClassLoader Class.getClassLoader()>
		//   11   22:invokevirtual   #62  <Method Parcelable Parcel.readParcelable(ClassLoader)>
		//   12   25:checkcast       #52  <Class AccessToken>
		//   13   28:putfield        #64  <Field AccessToken token>
			errorMessage = parcel.readString();
		//   14   31:aload_0         
		//   15   32:aload_1         
		//   16   33:invokevirtual   #44  <Method String Parcel.readString()>
		//   17   36:putfield        #66  <Field String errorMessage>
			errorCode = parcel.readString();
		//   18   39:aload_0         
		//   19   40:aload_1         
		//   20   41:invokevirtual   #44  <Method String Parcel.readString()>
		//   21   44:putfield        #68  <Field String errorCode>
			request = (Request)parcel.readParcelable(((Class) (com/facebook/login/LoginClient$Request)).getClassLoader());
		//   22   47:aload_0         
		//   23   48:aload_1         
		//   24   49:ldc1            #70  <Class LoginClient$Request>
		//   25   51:invokevirtual   #58  <Method ClassLoader Class.getClassLoader()>
		//   26   54:invokevirtual   #62  <Method Parcelable Parcel.readParcelable(ClassLoader)>
		//   27   57:checkcast       #70  <Class LoginClient$Request>
		//   28   60:putfield        #72  <Field LoginClient$Request request>
			loggingExtras = Utility.readStringMapFromParcel(parcel);
		//   29   63:aload_0         
		//   30   64:aload_1         
		//   31   65:invokestatic    #78  <Method Map Utility.readStringMapFromParcel(Parcel)>
		//   32   68:putfield        #80  <Field Map loggingExtras>
		//   33   71:return          
		}


		Result(Request request1, Code code1, AccessToken accesstoken, String s, String s1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #38  <Method void Object()>
			Validate.notNull(((Object) (code1)), "code");
		//    2    4:aload_2         
		//    3    5:ldc1            #85  <String "code">
		//    4    7:invokestatic    #91  <Method void Validate.notNull(Object, String)>
			request = request1;
		//    5   10:aload_0         
		//    6   11:aload_1         
		//    7   12:putfield        #72  <Field LoginClient$Request request>
			token = accesstoken;
		//    8   15:aload_0         
		//    9   16:aload_3         
		//   10   17:putfield        #64  <Field AccessToken token>
			errorMessage = s;
		//   11   20:aload_0         
		//   12   21:aload           4
		//   13   23:putfield        #66  <Field String errorMessage>
			code = code1;
		//   14   26:aload_0         
		//   15   27:aload_2         
		//   16   28:putfield        #50  <Field LoginClient$Result$Code code>
			errorCode = s1;
		//   17   31:aload_0         
		//   18   32:aload           5
		//   19   34:putfield        #68  <Field String errorCode>
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
	//    1    1:invokespecial   #61  <Method void Object()>
		currentHandler = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #63  <Field int currentHandler>
		Parcelable aparcelable[] = parcel.readParcelableArray(((Class) (com/facebook/login/LoginMethodHandler)).getClassLoader());
	//    5    9:aload_1         
	//    6   10:ldc1            #65  <Class LoginMethodHandler>
	//    7   12:invokevirtual   #71  <Method ClassLoader Class.getClassLoader()>
	//    8   15:invokevirtual   #77  <Method Parcelable[] Parcel.readParcelableArray(ClassLoader)>
	//    9   18:astore_3        
		int i = 0;
	//   10   19:iconst_0        
	//   11   20:istore_2        
		handlersToTry = new LoginMethodHandler[aparcelable.length];
	//   12   21:aload_0         
	//   13   22:aload_3         
	//   14   23:arraylength     
	//   15   24:anewarray       LoginMethodHandler[]
	//   16   27:putfield        #79  <Field LoginMethodHandler[] handlersToTry>
		for(; i < aparcelable.length; i++)
	//*  17   30:iload_2         
	//*  18   31:aload_3         
	//*  19   32:arraylength     
	//*  20   33:icmpge          65
		{
			handlersToTry[i] = (LoginMethodHandler)aparcelable[i];
	//   21   36:aload_0         
	//   22   37:getfield        #79  <Field LoginMethodHandler[] handlersToTry>
	//   23   40:iload_2         
	//   24   41:aload_3         
	//   25   42:iload_2         
	//   26   43:aaload          
	//   27   44:checkcast       #65  <Class LoginMethodHandler>
	//   28   47:aastore         
			handlersToTry[i].setLoginClient(this);
	//   29   48:aload_0         
	//   30   49:getfield        #79  <Field LoginMethodHandler[] handlersToTry>
	//   31   52:iload_2         
	//   32   53:aaload          
	//   33   54:aload_0         
	//   34   55:invokevirtual   #83  <Method void LoginMethodHandler.setLoginClient(LoginClient)>
		}

	//   35   58:iload_2         
	//   36   59:iconst_1        
	//   37   60:iadd            
	//   38   61:istore_2        
	//*  39   62:goto            30
		currentHandler = parcel.readInt();
	//   40   65:aload_0         
	//   41   66:aload_1         
	//   42   67:invokevirtual   #87  <Method int Parcel.readInt()>
	//   43   70:putfield        #63  <Field int currentHandler>
		pendingRequest = (Request)parcel.readParcelable(((Class) (com/facebook/login/LoginClient$Request)).getClassLoader());
	//   44   73:aload_0         
	//   45   74:aload_1         
	//   46   75:ldc1            #19  <Class LoginClient$Request>
	//   47   77:invokevirtual   #71  <Method ClassLoader Class.getClassLoader()>
	//   48   80:invokevirtual   #91  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   49   83:checkcast       #19  <Class LoginClient$Request>
	//   50   86:putfield        #93  <Field LoginClient$Request pendingRequest>
		loggingExtras = Utility.readStringMapFromParcel(parcel);
	//   51   89:aload_0         
	//   52   90:aload_1         
	//   53   91:invokestatic    #99  <Method Map Utility.readStringMapFromParcel(Parcel)>
	//   54   94:putfield        #101 <Field Map loggingExtras>
	//   55   97:return          
	}

	public LoginClient(Fragment fragment1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #61  <Method void Object()>
		currentHandler = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #63  <Field int currentHandler>
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
	//*   1    1:getfield        #101 <Field Map loggingExtras>
	//*   2    4:ifnonnull       18
			loggingExtras = ((Map) (new HashMap()));
	//    3    7:aload_0         
	//    4    8:new             #108 <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #109 <Method void HashMap()>
	//    7   15:putfield        #101 <Field Map loggingExtras>
		Object obj = ((Object) (s1));
	//    8   18:aload_2         
	//    9   19:astore          4
		if(loggingExtras.containsKey(((Object) (s))))
	//*  10   21:aload_0         
	//*  11   22:getfield        #101 <Field Map loggingExtras>
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
	//   25   53:getfield        #101 <Field Map loggingExtras>
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
	//   43   92:getfield        #101 <Field Map loggingExtras>
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
	//    2    2:getfield        #93  <Field LoginClient$Request pendingRequest>
	//    3    5:ldc1            #141 <String "Login attempt failed.">
	//    4    7:aconst_null     
	//    5    8:invokestatic    #145 <Method LoginClient$Result LoginClient$Result.createErrorResult(LoginClient$Request, String, String)>
	//    6   11:invokevirtual   #149 <Method void complete(LoginClient$Result)>
	//    7   14:return          
	}

	private static AccessToken createFromTokenWithRefreshedPermissions(AccessToken accesstoken, Collection collection, Collection collection1)
	{
		return new AccessToken(accesstoken.getToken(), accesstoken.getApplicationId(), accesstoken.getUserId(), collection, collection1, accesstoken.getSource(), accesstoken.getExpires(), accesstoken.getLastRefresh());
	//    0    0:new             #153 <Class AccessToken>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #156 <Method String AccessToken.getToken()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #159 <Method String AccessToken.getApplicationId()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #162 <Method String AccessToken.getUserId()>
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #166 <Method com.facebook.AccessTokenSource AccessToken.getSource()>
	//   12   22:aload_0         
	//   13   23:invokevirtual   #170 <Method java.util.Date AccessToken.getExpires()>
	//   14   26:aload_0         
	//   15   27:invokevirtual   #173 <Method java.util.Date AccessToken.getLastRefresh()>
	//   16   30:invokespecial   #176 <Method void AccessToken(String, String, String, Collection, Collection, com.facebook.AccessTokenSource, java.util.Date, java.util.Date)>
	//   17   33:areturn         
	}

	private LoginMethodHandler getCurrentHandler()
	{
		if(currentHandler >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field int currentHandler>
	//*   2    4:iflt            17
			return handlersToTry[currentHandler];
	//    3    7:aload_0         
	//    4    8:getfield        #79  <Field LoginMethodHandler[] handlersToTry>
	//    5   11:aload_0         
	//    6   12:getfield        #63  <Field int currentHandler>
	//    7   15:aaload          
	//    8   16:areturn         
		else
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
	}

	static String getE2E()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #185 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #186 <Method void JSONObject()>
	//    3    7:astore_0        
		try
		{
			jsonobject.put("init", System.currentTimeMillis());
	//    4    8:aload_0         
	//    5    9:ldc1            #188 <String "init">
	//    6   11:invokestatic    #194 <Method long System.currentTimeMillis()>
	//    7   14:invokevirtual   #197 <Method JSONObject JSONObject.put(String, long)>
	//    8   17:pop             
		}
	//*   9   18:aload_0         
	//*  10   19:invokevirtual   #198 <Method String JSONObject.toString()>
	//*  11   22:areturn         
		catch(JSONException jsonexception) { }
	//   12   23:astore_1        
		return jsonobject.toString();
	//*  13   24:goto            18
	}

	private LoginMethodHandler[] getHandlersToTry(Request request)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #202 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #203 <Method void ArrayList()>
	//    3    7:astore_2        
		request = ((Request) (request.getLoginBehavior()));
	//    4    8:aload_1         
	//    5    9:invokevirtual   #207 <Method LoginBehavior LoginClient$Request.getLoginBehavior()>
	//    6   12:astore_1        
		if(((LoginBehavior) (request)).allowsKatanaAuth())
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #213 <Method boolean LoginBehavior.allowsKatanaAuth()>
	//*   9   17:ifeq            46
		{
			arraylist.add(((Object) (new GetTokenLoginMethodHandler(this))));
	//   10   20:aload_2         
	//   11   21:new             #215 <Class GetTokenLoginMethodHandler>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:invokespecial   #217 <Method void GetTokenLoginMethodHandler(LoginClient)>
	//   15   29:invokevirtual   #220 <Method boolean ArrayList.add(Object)>
	//   16   32:pop             
			arraylist.add(((Object) (new KatanaProxyLoginMethodHandler(this))));
	//   17   33:aload_2         
	//   18   34:new             #222 <Class KatanaProxyLoginMethodHandler>
	//   19   37:dup             
	//   20   38:aload_0         
	//   21   39:invokespecial   #223 <Method void KatanaProxyLoginMethodHandler(LoginClient)>
	//   22   42:invokevirtual   #220 <Method boolean ArrayList.add(Object)>
	//   23   45:pop             
		}
		if(((LoginBehavior) (request)).allowsWebViewAuth())
	//*  24   46:aload_1         
	//*  25   47:invokevirtual   #226 <Method boolean LoginBehavior.allowsWebViewAuth()>
	//*  26   50:ifeq            66
			arraylist.add(((Object) (new WebViewLoginMethodHandler(this))));
	//   27   53:aload_2         
	//   28   54:new             #228 <Class WebViewLoginMethodHandler>
	//   29   57:dup             
	//   30   58:aload_0         
	//   31   59:invokespecial   #229 <Method void WebViewLoginMethodHandler(LoginClient)>
	//   32   62:invokevirtual   #220 <Method boolean ArrayList.add(Object)>
	//   33   65:pop             
		request = ((Request) (new LoginMethodHandler[arraylist.size()]));
	//   34   66:aload_2         
	//   35   67:invokevirtual   #232 <Method int ArrayList.size()>
	//   36   70:anewarray       LoginMethodHandler[]
	//   37   73:astore_1        
		arraylist.toArray(((Object []) (request)));
	//   38   74:aload_2         
	//   39   75:aload_1         
	//   40   76:invokevirtual   #236 <Method Object[] ArrayList.toArray(Object[])>
	//   41   79:pop             
		return ((LoginMethodHandler []) (request));
	//   42   80:aload_1         
	//   43   81:areturn         
	}

	private LoginLogger getLogger()
	{
		if(loginLogger == null || !loginLogger.getApplicationId().equals(((Object) (pendingRequest.getApplicationId()))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #240 <Field LoginLogger loginLogger>
	//*   2    4:ifnull          27
	//*   3    7:aload_0         
	//*   4    8:getfield        #240 <Field LoginLogger loginLogger>
	//*   5   11:invokevirtual   #243 <Method String LoginLogger.getApplicationId()>
	//*   6   14:aload_0         
	//*   7   15:getfield        #93  <Field LoginClient$Request pendingRequest>
	//*   8   18:invokevirtual   #244 <Method String LoginClient$Request.getApplicationId()>
	//*   9   21:invokevirtual   #247 <Method boolean String.equals(Object)>
	//*  10   24:ifne            49
			loginLogger = new LoginLogger(((android.content.Context) (getActivity())), pendingRequest.getApplicationId());
	//   11   27:aload_0         
	//   12   28:new             #242 <Class LoginLogger>
	//   13   31:dup             
	//   14   32:aload_0         
	//   15   33:invokevirtual   #251 <Method FragmentActivity getActivity()>
	//   16   36:aload_0         
	//   17   37:getfield        #93  <Field LoginClient$Request pendingRequest>
	//   18   40:invokevirtual   #244 <Method String LoginClient$Request.getApplicationId()>
	//   19   43:invokespecial   #254 <Method void LoginLogger(android.content.Context, String)>
	//   20   46:putfield        #240 <Field LoginLogger loginLogger>
		return loginLogger;
	//   21   49:aload_0         
	//   22   50:getfield        #240 <Field LoginLogger loginLogger>
	//   23   53:areturn         
	}

	public static int getLoginRequestCode()
	{
		return com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
	//    0    0:getstatic       #261 <Field com.facebook.internal.CallbackManagerImpl$RequestCodeOffset com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.Login>
	//    1    3:invokevirtual   #264 <Method int com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.toRequestCode()>
	//    2    6:ireturn         
	}

	private static PermissionsPair handlePermissionResponse(GraphResponse graphresponse)
	{
		if(graphresponse.getError() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #272 <Method com.facebook.FacebookRequestError GraphResponse.getError()>
	//*   2    4:ifnull          9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		graphresponse = ((GraphResponse) (graphresponse.getJSONObject()));
	//    5    9:aload_0         
	//    6   10:invokevirtual   #276 <Method JSONObject GraphResponse.getJSONObject()>
	//    7   13:astore_0        
		if(graphresponse == null)
	//*   8   14:aload_0         
	//*   9   15:ifnonnull       20
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		graphresponse = ((GraphResponse) (((JSONObject) (graphresponse)).optJSONArray("data")));
	//   12   20:aload_0         
	//   13   21:ldc2            #278 <String "data">
	//   14   24:invokevirtual   #282 <Method JSONArray JSONObject.optJSONArray(String)>
	//   15   27:astore_0        
		if(graphresponse != null)
	//*  16   28:aload_0         
	//*  17   29:ifnull          189
		{
			if(((JSONArray) (graphresponse)).length() == 0)
	//*  18   32:aload_0         
	//*  19   33:invokevirtual   #287 <Method int JSONArray.length()>
	//*  20   36:ifne            41
				return null;
	//   21   39:aconst_null     
	//   22   40:areturn         
			ArrayList arraylist = new ArrayList(((JSONArray) (graphresponse)).length());
	//   23   41:new             #202 <Class ArrayList>
	//   24   44:dup             
	//   25   45:aload_0         
	//   26   46:invokevirtual   #287 <Method int JSONArray.length()>
	//   27   49:invokespecial   #290 <Method void ArrayList(int)>
	//   28   52:astore_2        
			ArrayList arraylist1 = new ArrayList(((JSONArray) (graphresponse)).length());
	//   29   53:new             #202 <Class ArrayList>
	//   30   56:dup             
	//   31   57:aload_0         
	//   32   58:invokevirtual   #287 <Method int JSONArray.length()>
	//   33   61:invokespecial   #290 <Method void ArrayList(int)>
	//   34   64:astore_3        
			for(int i = 0; i < ((JSONArray) (graphresponse)).length(); i++)
	//*  35   65:iconst_0        
	//*  36   66:istore_1        
	//*  37   67:iload_1         
	//*  38   68:aload_0         
	//*  39   69:invokevirtual   #287 <Method int JSONArray.length()>
	//*  40   72:icmpge          179
			{
				Object obj = ((Object) (((JSONArray) (graphresponse)).optJSONObject(i)));
	//   41   75:aload_0         
	//   42   76:iload_1         
	//   43   77:invokevirtual   #294 <Method JSONObject JSONArray.optJSONObject(int)>
	//   44   80:astore          5
				String s = ((JSONObject) (obj)).optString("permission");
	//   45   82:aload           5
	//   46   84:ldc2            #296 <String "permission">
	//   47   87:invokevirtual   #300 <Method String JSONObject.optString(String)>
	//   48   90:astore          4
				if(s == null || s.equals("installed"))
	//*  49   92:aload           4
	//*  50   94:ifnull          172
	//*  51   97:aload           4
	//*  52   99:ldc2            #302 <String "installed">
	//*  53  102:invokevirtual   #247 <Method boolean String.equals(Object)>
	//*  54  105:ifeq            111
					continue;
	//   55  108:goto            172
				obj = ((Object) (((JSONObject) (obj)).optString("status")));
	//   56  111:aload           5
	//   57  113:ldc2            #304 <String "status">
	//   58  116:invokevirtual   #300 <Method String JSONObject.optString(String)>
	//   59  119:astore          5
				if(obj == null)
	//*  60  121:aload           5
	//*  61  123:ifnonnull       129
					continue;
	//   62  126:goto            172
				if(((String) (obj)).equals("granted"))
	//*  63  129:aload           5
	//*  64  131:ldc2            #306 <String "granted">
	//*  65  134:invokevirtual   #247 <Method boolean String.equals(Object)>
	//*  66  137:ifeq            152
				{
					((List) (arraylist)).add(((Object) (s)));
	//   67  140:aload_2         
	//   68  141:aload           4
	//   69  143:invokeinterface #309 <Method boolean List.add(Object)>
	//   70  148:pop             
					continue;
	//   71  149:goto            172
				}
				if(((String) (obj)).equals("declined"))
	//*  72  152:aload           5
	//*  73  154:ldc2            #311 <String "declined">
	//*  74  157:invokevirtual   #247 <Method boolean String.equals(Object)>
	//*  75  160:ifeq            172
					((List) (arraylist1)).add(((Object) (s)));
	//   76  163:aload_3         
	//   77  164:aload           4
	//   78  166:invokeinterface #309 <Method boolean List.add(Object)>
	//   79  171:pop             
			}

	//   80  172:iload_1         
	//   81  173:iconst_1        
	//   82  174:iadd            
	//   83  175:istore_1        
	//*  84  176:goto            67
			return new PermissionsPair(((List) (arraylist)), ((List) (arraylist1)));
	//   85  179:new             #16  <Class LoginClient$PermissionsPair>
	//   86  182:dup             
	//   87  183:aload_2         
	//   88  184:aload_3         
	//   89  185:invokespecial   #314 <Method void LoginClient$PermissionsPair(List, List)>
	//   90  188:areturn         
		} else
		{
			return null;
	//   91  189:aconst_null     
	//   92  190:areturn         
		}
	}

	private void logAuthorizationMethodComplete(String s, Result result, Map map)
	{
		logAuthorizationMethodComplete(s, result.code.getLoggingValue(), result.errorMessage, result.errorCode, map);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getfield        #320 <Field LoginClient$Result$Code LoginClient$Result.code>
	//    4    6:invokevirtual   #323 <Method String LoginClient$Result$Code.getLoggingValue()>
	//    5    9:aload_2         
	//    6   10:getfield        #327 <Field String LoginClient$Result.errorMessage>
	//    7   13:aload_2         
	//    8   14:getfield        #330 <Field String LoginClient$Result.errorCode>
	//    9   17:aload_3         
	//   10   18:invokespecial   #333 <Method void logAuthorizationMethodComplete(String, String, String, String, Map)>
	//   11   21:return          
	}

	private void logAuthorizationMethodComplete(String s, String s1, String s2, String s3, Map map)
	{
		if(pendingRequest == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #93  <Field LoginClient$Request pendingRequest>
	//*   2    4:ifnonnull       22
		{
			getLogger().logUnexpectedError("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", s);
	//    3    7:aload_0         
	//    4    8:invokespecial   #336 <Method LoginLogger getLogger()>
	//    5   11:ldc2            #338 <String "fb_mobile_login_method_complete">
	//    6   14:ldc2            #340 <String "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.">
	//    7   17:aload_1         
	//    8   18:invokevirtual   #344 <Method void LoginLogger.logUnexpectedError(String, String, String)>
			return;
	//    9   21:return          
		} else
		{
			getLogger().logAuthorizationMethodComplete(pendingRequest.getAuthId(), s, s1, s2, s3, map);
	//   10   22:aload_0         
	//   11   23:invokespecial   #336 <Method LoginLogger getLogger()>
	//   12   26:aload_0         
	//   13   27:getfield        #93  <Field LoginClient$Request pendingRequest>
	//   14   30:invokevirtual   #347 <Method String LoginClient$Request.getAuthId()>
	//   15   33:aload_1         
	//   16   34:aload_2         
	//   17   35:aload_3         
	//   18   36:aload           4
	//   19   38:aload           5
	//   20   40:invokevirtual   #350 <Method void LoginLogger.logAuthorizationMethodComplete(String, String, String, String, String, Map)>
			return;
	//   21   43:return          
		}
	}

	private void notifyOnCompleteListener(Result result)
	{
		if(onCompletedListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #354 <Field LoginClient$OnCompletedListener onCompletedListener>
	//*   2    4:ifnull          17
			onCompletedListener.onCompleted(result);
	//    3    7:aload_0         
	//    4    8:getfield        #354 <Field LoginClient$OnCompletedListener onCompletedListener>
	//    5   11:aload_1         
	//    6   12:invokeinterface #357 <Method void LoginClient$OnCompletedListener.onCompleted(LoginClient$Result)>
	//    7   17:return          
	}

	void authorize(Request request)
	{
		if(request == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(pendingRequest != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #93  <Field LoginClient$Request pendingRequest>
	//*   5    9:ifnull          23
			throw new FacebookException("Attempted to authorize while a request is pending.");
	//    6   12:new             #361 <Class FacebookException>
	//    7   15:dup             
	//    8   16:ldc2            #363 <String "Attempted to authorize while a request is pending.">
	//    9   19:invokespecial   #366 <Method void FacebookException(String)>
	//   10   22:athrow          
		if(AccessToken.getCurrentAccessToken() != null && !checkInternetPermission())
	//*  11   23:invokestatic    #370 <Method AccessToken AccessToken.getCurrentAccessToken()>
	//*  12   26:ifnull          37
	//*  13   29:aload_0         
	//*  14   30:invokevirtual   #373 <Method boolean checkInternetPermission()>
	//*  15   33:ifne            37
		{
			return;
	//   16   36:return          
		} else
		{
			pendingRequest = request;
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:putfield        #93  <Field LoginClient$Request pendingRequest>
			handlersToTry = getHandlersToTry(request);
	//   20   42:aload_0         
	//   21   43:aload_0         
	//   22   44:aload_1         
	//   23   45:invokespecial   #375 <Method LoginMethodHandler[] getHandlersToTry(LoginClient$Request)>
	//   24   48:putfield        #79  <Field LoginMethodHandler[] handlersToTry>
			tryNextHandler();
	//   25   51:aload_0         
	//   26   52:invokevirtual   #378 <Method void tryNextHandler()>
			return;
	//   27   55:return          
		}
	}

	void cancelCurrentHandler()
	{
		if(currentHandler >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field int currentHandler>
	//*   2    4:iflt            14
			getCurrentHandler().cancel();
	//    3    7:aload_0         
	//    4    8:invokespecial   #381 <Method LoginMethodHandler getCurrentHandler()>
	//    5   11:invokevirtual   #384 <Method void LoginMethodHandler.cancel()>
	//    6   14:return          
	}

	boolean checkInternetPermission()
	{
		if(checkedInternetPermission)
	//*   0    0:aload_0         
	//*   1    1:getfield        #386 <Field boolean checkedInternetPermission>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(checkPermission("android.permission.INTERNET") != 0)
	//*   5    9:aload_0         
	//*   6   10:ldc2            #388 <String "android.permission.INTERNET">
	//*   7   13:invokevirtual   #392 <Method int checkPermission(String)>
	//*   8   16:ifeq            55
		{
			Object obj = ((Object) (getActivity()));
	//    9   19:aload_0         
	//   10   20:invokevirtual   #251 <Method FragmentActivity getActivity()>
	//   11   23:astore_2        
			String s = ((Activity) (obj)).getString(com.facebook.R.string.com_facebook_internet_permission_error_title);
	//   12   24:aload_2         
	//   13   25:getstatic       #397 <Field int com.facebook.R$string.com_facebook_internet_permission_error_title>
	//   14   28:invokevirtual   #403 <Method String Activity.getString(int)>
	//   15   31:astore_1        
			obj = ((Object) (((Activity) (obj)).getString(com.facebook.R.string.com_facebook_internet_permission_error_message)));
	//   16   32:aload_2         
	//   17   33:getstatic       #406 <Field int com.facebook.R$string.com_facebook_internet_permission_error_message>
	//   18   36:invokevirtual   #403 <Method String Activity.getString(int)>
	//   19   39:astore_2        
			complete(Result.createErrorResult(pendingRequest, s, ((String) (obj))));
	//   20   40:aload_0         
	//   21   41:aload_0         
	//   22   42:getfield        #93  <Field LoginClient$Request pendingRequest>
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
	//   31   57:putfield        #386 <Field boolean checkedInternetPermission>
			return true;
	//   32   60:iconst_1        
	//   33   61:ireturn         
		}
	}

	int checkPermission(String s)
	{
		return getActivity().checkCallingOrSelfPermission(s);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #251 <Method FragmentActivity getActivity()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #411 <Method int FragmentActivity.checkCallingOrSelfPermission(String)>
	//    4    8:ireturn         
	}

	void complete(Result result)
	{
		LoginMethodHandler loginmethodhandler = getCurrentHandler();
	//    0    0:aload_0         
	//    1    1:invokespecial   #381 <Method LoginMethodHandler getCurrentHandler()>
	//    2    4:astore_2        
		if(loginmethodhandler != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          22
			logAuthorizationMethodComplete(loginmethodhandler.getNameForLogging(), result, loginmethodhandler.methodLoggingExtras);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #414 <Method String LoginMethodHandler.getNameForLogging()>
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:getfield        #417 <Field Map LoginMethodHandler.methodLoggingExtras>
	//   11   19:invokespecial   #419 <Method void logAuthorizationMethodComplete(String, LoginClient$Result, Map)>
		if(loggingExtras != null)
	//*  12   22:aload_0         
	//*  13   23:getfield        #101 <Field Map loggingExtras>
	//*  14   26:ifnull          37
			result.loggingExtras = loggingExtras;
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:getfield        #101 <Field Map loggingExtras>
	//   18   34:putfield        #420 <Field Map LoginClient$Result.loggingExtras>
		handlersToTry = null;
	//   19   37:aload_0         
	//   20   38:aconst_null     
	//   21   39:putfield        #79  <Field LoginMethodHandler[] handlersToTry>
		currentHandler = -1;
	//   22   42:aload_0         
	//   23   43:iconst_m1       
	//   24   44:putfield        #63  <Field int currentHandler>
		pendingRequest = null;
	//   25   47:aload_0         
	//   26   48:aconst_null     
	//   27   49:putfield        #93  <Field LoginClient$Request pendingRequest>
		loggingExtras = null;
	//   28   52:aload_0         
	//   29   53:aconst_null     
	//   30   54:putfield        #101 <Field Map loggingExtras>
		notifyOnCompleteListener(result);
	//   31   57:aload_0         
	//   32   58:aload_1         
	//   33   59:invokespecial   #422 <Method void notifyOnCompleteListener(LoginClient$Result)>
	//   34   62:return          
	}

	void completeAndValidate(Result result)
	{
		if(result.token != null && AccessToken.getCurrentAccessToken() != null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #427 <Field AccessToken LoginClient$Result.token>
	//*   2    4:ifnull          19
	//*   3    7:invokestatic    #370 <Method AccessToken AccessToken.getCurrentAccessToken()>
	//*   4   10:ifnull          19
		{
			validateSameFbidAndFinish(result);
	//    5   13:aload_0         
	//    6   14:aload_1         
	//    7   15:invokevirtual   #430 <Method void validateSameFbidAndFinish(LoginClient$Result)>
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
	//    2    4:invokevirtual   #434 <Method FragmentActivity Fragment.getActivity()>
	//    3    7:areturn         
	}

	BackgroundProcessingListener getBackgroundProcessingListener()
	{
		return backgroundProcessingListener;
	//    0    0:aload_0         
	//    1    1:getfield        #438 <Field LoginClient$BackgroundProcessingListener backgroundProcessingListener>
	//    2    4:areturn         
	}

	public Fragment getFragment()
	{
		return fragment;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field Fragment fragment>
	//    2    4:areturn         
	}

	boolean getInProgress()
	{
		return pendingRequest != null && currentHandler >= 0;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field LoginClient$Request pendingRequest>
	//    2    4:ifnull          16
	//    3    7:aload_0         
	//    4    8:getfield        #63  <Field int currentHandler>
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
	//    1    1:getfield        #354 <Field LoginClient$OnCompletedListener onCompletedListener>
	//    2    4:areturn         
	}

	public Request getPendingRequest()
	{
		return pendingRequest;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field LoginClient$Request pendingRequest>
	//    2    4:areturn         
	}

	void notifyBackgroundProcessingStart()
	{
		if(backgroundProcessingListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #438 <Field LoginClient$BackgroundProcessingListener backgroundProcessingListener>
	//*   2    4:ifnull          16
			backgroundProcessingListener.onBackgroundProcessingStarted();
	//    3    7:aload_0         
	//    4    8:getfield        #438 <Field LoginClient$BackgroundProcessingListener backgroundProcessingListener>
	//    5   11:invokeinterface #449 <Method void LoginClient$BackgroundProcessingListener.onBackgroundProcessingStarted()>
	//    6   16:return          
	}

	void notifyBackgroundProcessingStop()
	{
		if(backgroundProcessingListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #438 <Field LoginClient$BackgroundProcessingListener backgroundProcessingListener>
	//*   2    4:ifnull          16
			backgroundProcessingListener.onBackgroundProcessingStopped();
	//    3    7:aload_0         
	//    4    8:getfield        #438 <Field LoginClient$BackgroundProcessingListener backgroundProcessingListener>
	//    5   11:invokeinterface #453 <Method void LoginClient$BackgroundProcessingListener.onBackgroundProcessingStopped()>
	//    6   16:return          
	}

	public boolean onActivityResult(int i, int j, Intent intent)
	{
		if(pendingRequest != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #93  <Field LoginClient$Request pendingRequest>
	//*   2    4:ifnull          18
			return getCurrentHandler().onActivityResult(i, j, intent);
	//    3    7:aload_0         
	//    4    8:invokespecial   #381 <Method LoginMethodHandler getCurrentHandler()>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:aload_3         
	//    8   14:invokevirtual   #457 <Method boolean LoginMethodHandler.onActivityResult(int, int, Intent)>
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
	//    2    2:putfield        #438 <Field LoginClient$BackgroundProcessingListener backgroundProcessingListener>
	//    3    5:return          
	}

	void setFragment(Fragment fragment1)
	{
		if(fragment != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #104 <Field Fragment fragment>
	//*   2    4:ifnull          18
		{
			throw new FacebookException("Can't set fragment once it is already set.");
	//    3    7:new             #361 <Class FacebookException>
	//    4   10:dup             
	//    5   11:ldc2            #462 <String "Can't set fragment once it is already set.">
	//    6   14:invokespecial   #366 <Method void FacebookException(String)>
	//    7   17:athrow          
		} else
		{
			fragment = fragment1;
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:putfield        #104 <Field Fragment fragment>
			return;
	//   11   23:return          
		}
	}

	void setOnCompletedListener(OnCompletedListener oncompletedlistener)
	{
		onCompletedListener = oncompletedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #354 <Field LoginClient$OnCompletedListener onCompletedListener>
	//    3    5:return          
	}

	void startOrContinueAuth(Request request)
	{
		if(!getInProgress())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #467 <Method boolean getInProgress()>
	//*   2    4:ifne            12
			authorize(request);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #469 <Method void authorize(LoginClient$Request)>
	//    6   12:return          
	}

	boolean tryCurrentHandler()
	{
		LoginMethodHandler loginmethodhandler = getCurrentHandler();
	//    0    0:aload_0         
	//    1    1:invokespecial   #381 <Method LoginMethodHandler getCurrentHandler()>
	//    2    4:astore_2        
		if(loginmethodhandler.needsInternetPermission() && !checkInternetPermission())
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #473 <Method boolean LoginMethodHandler.needsInternetPermission()>
	//*   5    9:ifeq            32
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #373 <Method boolean checkInternetPermission()>
	//*   8   16:ifne            32
		{
			addLoggingExtra("no_internet_permission", "1", false);
	//    9   19:aload_0         
	//   10   20:ldc2            #475 <String "no_internet_permission">
	//   11   23:ldc2            #477 <String "1">
	//   12   26:iconst_0        
	//   13   27:invokespecial   #479 <Method void addLoggingExtra(String, String, boolean)>
			return false;
	//   14   30:iconst_0        
	//   15   31:ireturn         
		}
		boolean flag = loginmethodhandler.tryAuthorize(pendingRequest);
	//   16   32:aload_2         
	//   17   33:aload_0         
	//   18   34:getfield        #93  <Field LoginClient$Request pendingRequest>
	//   19   37:invokevirtual   #483 <Method boolean LoginMethodHandler.tryAuthorize(LoginClient$Request)>
	//   20   40:istore_1        
		if(flag)
	//*  21   41:iload_1         
	//*  22   42:ifeq            65
		{
			getLogger().logAuthorizationMethodStart(pendingRequest.getAuthId(), loginmethodhandler.getNameForLogging());
	//   23   45:aload_0         
	//   24   46:invokespecial   #336 <Method LoginLogger getLogger()>
	//   25   49:aload_0         
	//   26   50:getfield        #93  <Field LoginClient$Request pendingRequest>
	//   27   53:invokevirtual   #347 <Method String LoginClient$Request.getAuthId()>
	//   28   56:aload_2         
	//   29   57:invokevirtual   #414 <Method String LoginMethodHandler.getNameForLogging()>
	//   30   60:invokevirtual   #487 <Method void LoginLogger.logAuthorizationMethodStart(String, String)>
			return flag;
	//   31   63:iload_1         
	//   32   64:ireturn         
		} else
		{
			addLoggingExtra("not_tried", loginmethodhandler.getNameForLogging(), true);
	//   33   65:aload_0         
	//   34   66:ldc2            #489 <String "not_tried">
	//   35   69:aload_2         
	//   36   70:invokevirtual   #414 <Method String LoginMethodHandler.getNameForLogging()>
	//   37   73:iconst_1        
	//   38   74:invokespecial   #479 <Method void addLoggingExtra(String, String, boolean)>
			return flag;
	//   39   77:iload_1         
	//   40   78:ireturn         
		}
	}

	void tryNextHandler()
	{
		if(currentHandler >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field int currentHandler>
	//*   2    4:iflt            30
			logAuthorizationMethodComplete(getCurrentHandler().getNameForLogging(), "skipped", ((String) (null)), ((String) (null)), getCurrentHandler().methodLoggingExtras);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokespecial   #381 <Method LoginMethodHandler getCurrentHandler()>
	//    6   12:invokevirtual   #414 <Method String LoginMethodHandler.getNameForLogging()>
	//    7   15:ldc2            #491 <String "skipped">
	//    8   18:aconst_null     
	//    9   19:aconst_null     
	//   10   20:aload_0         
	//   11   21:invokespecial   #381 <Method LoginMethodHandler getCurrentHandler()>
	//   12   24:getfield        #417 <Field Map LoginMethodHandler.methodLoggingExtras>
	//   13   27:invokespecial   #333 <Method void logAuthorizationMethodComplete(String, String, String, String, Map)>
		while(handlersToTry != null && currentHandler < handlersToTry.length - 1) 
	//*  14   30:aload_0         
	//*  15   31:getfield        #79  <Field LoginMethodHandler[] handlersToTry>
	//*  16   34:ifnull          69
	//*  17   37:aload_0         
	//*  18   38:getfield        #63  <Field int currentHandler>
	//*  19   41:aload_0         
	//*  20   42:getfield        #79  <Field LoginMethodHandler[] handlersToTry>
	//*  21   45:arraylength     
	//*  22   46:iconst_1        
	//*  23   47:isub            
	//*  24   48:icmpge          69
		{
			currentHandler = currentHandler + 1;
	//   25   51:aload_0         
	//   26   52:aload_0         
	//   27   53:getfield        #63  <Field int currentHandler>
	//   28   56:iconst_1        
	//   29   57:iadd            
	//   30   58:putfield        #63  <Field int currentHandler>
			if(tryCurrentHandler())
	//*  31   61:aload_0         
	//*  32   62:invokevirtual   #493 <Method boolean tryCurrentHandler()>
	//*  33   65:ifeq            30
				return;
	//   34   68:return          
		}
		if(pendingRequest != null)
	//*  35   69:aload_0         
	//*  36   70:getfield        #93  <Field LoginClient$Request pendingRequest>
	//*  37   73:ifnull          80
			completeWithFailure();
	//   38   76:aload_0         
	//   39   77:invokespecial   #495 <Method void completeWithFailure()>
	//   40   80:return          
	}

	void validateSameFbidAndFinish(Result result)
	{
		if(result.token == null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #427 <Field AccessToken LoginClient$Result.token>
	//*   2    4:ifnonnull       18
			throw new FacebookException("Can't validate without a token");
	//    3    7:new             #361 <Class FacebookException>
	//    4   10:dup             
	//    5   11:ldc2            #499 <String "Can't validate without a token">
	//    6   14:invokespecial   #366 <Method void FacebookException(String)>
	//    7   17:athrow          
		AccessToken accesstoken = AccessToken.getCurrentAccessToken();
	//    8   18:invokestatic    #370 <Method AccessToken AccessToken.getCurrentAccessToken()>
	//    9   21:astore_2        
		AccessToken accesstoken1 = result.token;
	//   10   22:aload_1         
	//   11   23:getfield        #427 <Field AccessToken LoginClient$Result.token>
	//   12   26:astore_3        
		if(accesstoken != null && accesstoken1 != null)
	//*  13   27:aload_2         
	//*  14   28:ifnull          64
	//*  15   31:aload_3         
	//*  16   32:ifnull          64
			try
			{
				if(accesstoken.getUserId().equals(((Object) (accesstoken1.getUserId()))))
	//*  17   35:aload_2         
	//*  18   36:invokevirtual   #162 <Method String AccessToken.getUserId()>
	//*  19   39:aload_3         
	//*  20   40:invokevirtual   #162 <Method String AccessToken.getUserId()>
	//*  21   43:invokevirtual   #247 <Method boolean String.equals(Object)>
	//*  22   46:ifeq            64
				{
					result = Result.createTokenResult(pendingRequest, result.token);
	//   23   49:aload_0         
	//   24   50:getfield        #93  <Field LoginClient$Request pendingRequest>
	//   25   53:aload_1         
	//   26   54:getfield        #427 <Field AccessToken LoginClient$Result.token>
	//   27   57:invokestatic    #503 <Method LoginClient$Result LoginClient$Result.createTokenResult(LoginClient$Request, AccessToken)>
	//   28   60:astore_1        
					break MISSING_BLOCK_LABEL_76;
	//   29   61:goto            76
				}
			}
	//*  30   64:aload_0         
	//*  31   65:getfield        #93  <Field LoginClient$Request pendingRequest>
	//*  32   68:ldc2            #505 <String "User logged in as different Facebook user.">
	//*  33   71:aconst_null     
	//*  34   72:invokestatic    #145 <Method LoginClient$Result LoginClient$Result.createErrorResult(LoginClient$Request, String, String)>
	//*  35   75:astore_1        
	//*  36   76:aload_0         
	//*  37   77:aload_1         
	//*  38   78:invokevirtual   #149 <Method void complete(LoginClient$Result)>
	//*  39   81:return          
			// Misplaced declaration of an exception variable
			catch(Result result)
	//*  40   82:astore_1        
			{
				complete(Result.createErrorResult(pendingRequest, "Caught exception", ((Exception) (result)).getMessage()));
	//   41   83:aload_0         
	//   42   84:aload_0         
	//   43   85:getfield        #93  <Field LoginClient$Request pendingRequest>
	//   44   88:ldc2            #507 <String "Caught exception">
	//   45   91:aload_1         
	//   46   92:invokevirtual   #510 <Method String Exception.getMessage()>
	//   47   95:invokestatic    #145 <Method LoginClient$Result LoginClient$Result.createErrorResult(LoginClient$Request, String, String)>
	//   48   98:invokevirtual   #149 <Method void complete(LoginClient$Result)>
				return;
	//   49  101:return          
			}
		result = Result.createErrorResult(pendingRequest, "User logged in as different Facebook user.", ((String) (null)));
		complete(result);
		return;
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeParcelableArray(((Parcelable []) (handlersToTry)), i);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #79  <Field LoginMethodHandler[] handlersToTry>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #516 <Method void Parcel.writeParcelableArray(Parcelable[], int)>
		parcel.writeInt(currentHandler);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #63  <Field int currentHandler>
	//    8   14:invokevirtual   #519 <Method void Parcel.writeInt(int)>
		parcel.writeParcelable(((Parcelable) (pendingRequest)), i);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #93  <Field LoginClient$Request pendingRequest>
	//   12   22:iload_2         
	//   13   23:invokevirtual   #523 <Method void Parcel.writeParcelable(Parcelable, int)>
		Utility.writeStringMapToParcel(parcel, loggingExtras);
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:getfield        #101 <Field Map loggingExtras>
	//   17   31:invokestatic    #527 <Method void Utility.writeStringMapToParcel(Parcel, Map)>
	//   18   34:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public LoginClient createFromParcel(Parcel parcel)
		{
			return new LoginClient(parcel);
		//    0    0:new             #8   <Class LoginClient>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #18  <Method void LoginClient(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #21  <Method LoginClient createFromParcel(Parcel)>
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
		//    2    2:invokevirtual   #26  <Method LoginClient[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	BackgroundProcessingListener backgroundProcessingListener;
	boolean checkedInternetPermission;
	int currentHandler;
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
	//    2    4:invokespecial   #57  <Method void LoginClient$1()>
	//    3    7:putstatic       #59  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
