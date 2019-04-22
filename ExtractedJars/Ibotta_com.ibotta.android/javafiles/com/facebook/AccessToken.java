// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.os.*;
import android.text.TextUtils;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.util.*;
import org.json.*;

// Referenced classes of package com.facebook:
//			AccessTokenSource, FacebookException, LegacyTokenHelper, FacebookSdk, 
//			AccessTokenManager, LoggingBehavior

public final class AccessToken
	implements Parcelable
{
	public static interface AccessTokenCreationCallback
	{

		public abstract void onError(FacebookException facebookexception);

		public abstract void onSuccess(AccessToken accesstoken);
	}

	public static interface AccessTokenRefreshCallback
	{

		public abstract void OnTokenRefreshFailed(FacebookException facebookexception);

		public abstract void OnTokenRefreshed(AccessToken accesstoken);
	}


	AccessToken(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void Object()>
		expires = new Date(parcel.readLong());
	//    2    4:aload_0         
	//    3    5:new             #38  <Class Date>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokevirtual   #71  <Method long Parcel.readLong()>
	//    7   13:invokespecial   #44  <Method void Date(long)>
	//    8   16:putfield        #73  <Field Date expires>
		ArrayList arraylist = new ArrayList();
	//    9   19:new             #75  <Class ArrayList>
	//   10   22:dup             
	//   11   23:invokespecial   #76  <Method void ArrayList()>
	//   12   26:astore_2        
		parcel.readStringList(((List) (arraylist)));
	//   13   27:aload_1         
	//   14   28:aload_2         
	//   15   29:invokevirtual   #80  <Method void Parcel.readStringList(List)>
		permissions = Collections.unmodifiableSet(((Set) (new HashSet(((Collection) (arraylist))))));
	//   16   32:aload_0         
	//   17   33:new             #82  <Class HashSet>
	//   18   36:dup             
	//   19   37:aload_2         
	//   20   38:invokespecial   #85  <Method void HashSet(Collection)>
	//   21   41:invokestatic    #91  <Method Set Collections.unmodifiableSet(Set)>
	//   22   44:putfield        #93  <Field Set permissions>
		arraylist.clear();
	//   23   47:aload_2         
	//   24   48:invokevirtual   #96  <Method void ArrayList.clear()>
		parcel.readStringList(((List) (arraylist)));
	//   25   51:aload_1         
	//   26   52:aload_2         
	//   27   53:invokevirtual   #80  <Method void Parcel.readStringList(List)>
		declinedPermissions = Collections.unmodifiableSet(((Set) (new HashSet(((Collection) (arraylist))))));
	//   28   56:aload_0         
	//   29   57:new             #82  <Class HashSet>
	//   30   60:dup             
	//   31   61:aload_2         
	//   32   62:invokespecial   #85  <Method void HashSet(Collection)>
	//   33   65:invokestatic    #91  <Method Set Collections.unmodifiableSet(Set)>
	//   34   68:putfield        #98  <Field Set declinedPermissions>
		token = parcel.readString();
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:invokevirtual   #102 <Method String Parcel.readString()>
	//   38   76:putfield        #104 <Field String token>
		source = AccessTokenSource.valueOf(parcel.readString());
	//   39   79:aload_0         
	//   40   80:aload_1         
	//   41   81:invokevirtual   #102 <Method String Parcel.readString()>
	//   42   84:invokestatic    #108 <Method AccessTokenSource AccessTokenSource.valueOf(String)>
	//   43   87:putfield        #110 <Field AccessTokenSource source>
		lastRefresh = new Date(parcel.readLong());
	//   44   90:aload_0         
	//   45   91:new             #38  <Class Date>
	//   46   94:dup             
	//   47   95:aload_1         
	//   48   96:invokevirtual   #71  <Method long Parcel.readLong()>
	//   49   99:invokespecial   #44  <Method void Date(long)>
	//   50  102:putfield        #112 <Field Date lastRefresh>
		applicationId = parcel.readString();
	//   51  105:aload_0         
	//   52  106:aload_1         
	//   53  107:invokevirtual   #102 <Method String Parcel.readString()>
	//   54  110:putfield        #114 <Field String applicationId>
		userId = parcel.readString();
	//   55  113:aload_0         
	//   56  114:aload_1         
	//   57  115:invokevirtual   #102 <Method String Parcel.readString()>
	//   58  118:putfield        #116 <Field String userId>
	//   59  121:return          
	}

	public AccessToken(String s, String s1, String s2, Collection collection, Collection collection1, AccessTokenSource accesstokensource, Date date, 
			Date date1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void Object()>
		Validate.notNullOrEmpty(s, "accessToken");
	//    2    4:aload_1         
	//    3    5:ldc1            #120 <String "accessToken">
	//    4    7:invokestatic    #126 <Method void Validate.notNullOrEmpty(String, String)>
		Validate.notNullOrEmpty(s1, "applicationId");
	//    5   10:aload_2         
	//    6   11:ldc1            #127 <String "applicationId">
	//    7   13:invokestatic    #126 <Method void Validate.notNullOrEmpty(String, String)>
		Validate.notNullOrEmpty(s2, "userId");
	//    8   16:aload_3         
	//    9   17:ldc1            #128 <String "userId">
	//   10   19:invokestatic    #126 <Method void Validate.notNullOrEmpty(String, String)>
		if(date == null)
	//*  11   22:aload           7
	//*  12   24:ifnull          30
	//*  13   27:goto            35
			date = DEFAULT_EXPIRATION_TIME;
	//   14   30:getstatic       #48  <Field Date DEFAULT_EXPIRATION_TIME>
	//   15   33:astore          7
		expires = date;
	//   16   35:aload_0         
	//   17   36:aload           7
	//   18   38:putfield        #73  <Field Date expires>
		if(collection != null)
	//*  19   41:aload           4
	//*  20   43:ifnull          60
			collection = ((Collection) (new HashSet(collection)));
	//   21   46:new             #82  <Class HashSet>
	//   22   49:dup             
	//   23   50:aload           4
	//   24   52:invokespecial   #85  <Method void HashSet(Collection)>
	//   25   55:astore          4
		else
	//*  26   57:goto            69
			collection = ((Collection) (new HashSet()));
	//   27   60:new             #82  <Class HashSet>
	//   28   63:dup             
	//   29   64:invokespecial   #129 <Method void HashSet()>
	//   30   67:astore          4
		permissions = Collections.unmodifiableSet(((Set) (collection)));
	//   31   69:aload_0         
	//   32   70:aload           4
	//   33   72:invokestatic    #91  <Method Set Collections.unmodifiableSet(Set)>
	//   34   75:putfield        #93  <Field Set permissions>
		if(collection1 != null)
	//*  35   78:aload           5
	//*  36   80:ifnull          97
			collection = ((Collection) (new HashSet(collection1)));
	//   37   83:new             #82  <Class HashSet>
	//   38   86:dup             
	//   39   87:aload           5
	//   40   89:invokespecial   #85  <Method void HashSet(Collection)>
	//   41   92:astore          4
		else
	//*  42   94:goto            106
			collection = ((Collection) (new HashSet()));
	//   43   97:new             #82  <Class HashSet>
	//   44  100:dup             
	//   45  101:invokespecial   #129 <Method void HashSet()>
	//   46  104:astore          4
		declinedPermissions = Collections.unmodifiableSet(((Set) (collection)));
	//   47  106:aload_0         
	//   48  107:aload           4
	//   49  109:invokestatic    #91  <Method Set Collections.unmodifiableSet(Set)>
	//   50  112:putfield        #98  <Field Set declinedPermissions>
		token = s;
	//   51  115:aload_0         
	//   52  116:aload_1         
	//   53  117:putfield        #104 <Field String token>
		if(accesstokensource == null)
	//*  54  120:aload           6
	//*  55  122:ifnull          128
	//*  56  125:goto            133
			accesstokensource = DEFAULT_ACCESS_TOKEN_SOURCE;
	//   57  128:getstatic       #59  <Field AccessTokenSource DEFAULT_ACCESS_TOKEN_SOURCE>
	//   58  131:astore          6
		source = accesstokensource;
	//   59  133:aload_0         
	//   60  134:aload           6
	//   61  136:putfield        #110 <Field AccessTokenSource source>
		if(date1 == null)
	//*  62  139:aload           8
	//*  63  141:ifnull          147
	//*  64  144:goto            152
			date1 = DEFAULT_LAST_REFRESH_TIME;
	//   65  147:getstatic       #52  <Field Date DEFAULT_LAST_REFRESH_TIME>
	//   66  150:astore          8
		lastRefresh = date1;
	//   67  152:aload_0         
	//   68  153:aload           8
	//   69  155:putfield        #112 <Field Date lastRefresh>
		applicationId = s1;
	//   70  158:aload_0         
	//   71  159:aload_2         
	//   72  160:putfield        #114 <Field String applicationId>
		userId = s2;
	//   73  163:aload_0         
	//   74  164:aload_3         
	//   75  165:putfield        #116 <Field String userId>
	//   76  168:return          
	}

	private void appendPermissions(StringBuilder stringbuilder)
	{
		stringbuilder.append(" permissions:");
	//    0    0:aload_1         
	//    1    1:ldc1            #136 <String " permissions:">
	//    2    3:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//    3    6:pop             
		if(permissions == null)
	//*   4    7:aload_0         
	//*   5    8:getfield        #93  <Field Set permissions>
	//*   6   11:ifnonnull       22
		{
			stringbuilder.append("null");
	//    7   14:aload_1         
	//    8   15:ldc1            #144 <String "null">
	//    9   17:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
			return;
	//   11   21:return          
		} else
		{
			stringbuilder.append("[");
	//   12   22:aload_1         
	//   13   23:ldc1            #146 <String "[">
	//   14   25:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   15   28:pop             
			stringbuilder.append(TextUtils.join(", ", ((Iterable) (permissions))));
	//   16   29:aload_1         
	//   17   30:ldc1            #148 <String ", ">
	//   18   32:aload_0         
	//   19   33:getfield        #93  <Field Set permissions>
	//   20   36:invokestatic    #154 <Method String TextUtils.join(CharSequence, Iterable)>
	//   21   39:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
			stringbuilder.append("]");
	//   23   43:aload_1         
	//   24   44:ldc1            #156 <String "]">
	//   25   46:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
			return;
	//   27   50:return          
		}
	}

	static AccessToken createExpired(AccessToken accesstoken)
	{
		return new AccessToken(accesstoken.token, accesstoken.applicationId, accesstoken.getUserId(), ((Collection) (accesstoken.getPermissions())), ((Collection) (accesstoken.getDeclinedPermissions())), accesstoken.source, new Date(), new Date());
	//    0    0:new             #2   <Class AccessToken>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #104 <Field String token>
	//    4    8:aload_0         
	//    5    9:getfield        #114 <Field String applicationId>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #161 <Method String getUserId()>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #165 <Method Set getPermissions()>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #168 <Method Set getDeclinedPermissions()>
	//   12   24:aload_0         
	//   13   25:getfield        #110 <Field AccessTokenSource source>
	//   14   28:new             #38  <Class Date>
	//   15   31:dup             
	//   16   32:invokespecial   #50  <Method void Date()>
	//   17   35:new             #38  <Class Date>
	//   18   38:dup             
	//   19   39:invokespecial   #50  <Method void Date()>
	//   20   42:invokespecial   #170 <Method void AccessToken(String, String, String, Collection, Collection, AccessTokenSource, Date, Date)>
	//   21   45:areturn         
	}

	static AccessToken createFromJSONObject(JSONObject jsonobject)
		throws JSONException
	{
		if(jsonobject.getInt("version") <= 1)
	//*   0    0:aload_0         
	//*   1    1:ldc1            #176 <String "version">
	//*   2    3:invokevirtual   #182 <Method int JSONObject.getInt(String)>
	//*   3    6:iconst_1        
	//*   4    7:icmpgt          107
		{
			String s = jsonobject.getString("token");
	//    5   10:aload_0         
	//    6   11:ldc1            #183 <String "token">
	//    7   13:invokevirtual   #187 <Method String JSONObject.getString(String)>
	//    8   16:astore_1        
			Date date = new Date(jsonobject.getLong("expires_at"));
	//    9   17:new             #38  <Class Date>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:ldc1            #189 <String "expires_at">
	//   13   24:invokevirtual   #193 <Method long JSONObject.getLong(String)>
	//   14   27:invokespecial   #44  <Method void Date(long)>
	//   15   30:astore_2        
			JSONArray jsonarray = jsonobject.getJSONArray("permissions");
	//   16   31:aload_0         
	//   17   32:ldc1            #194 <String "permissions">
	//   18   34:invokevirtual   #198 <Method JSONArray JSONObject.getJSONArray(String)>
	//   19   37:astore_3        
			JSONArray jsonarray1 = jsonobject.getJSONArray("declined_permissions");
	//   20   38:aload_0         
	//   21   39:ldc1            #200 <String "declined_permissions">
	//   22   41:invokevirtual   #198 <Method JSONArray JSONObject.getJSONArray(String)>
	//   23   44:astore          4
			Date date1 = new Date(jsonobject.getLong("last_refresh"));
	//   24   46:new             #38  <Class Date>
	//   25   49:dup             
	//   26   50:aload_0         
	//   27   51:ldc1            #202 <String "last_refresh">
	//   28   53:invokevirtual   #193 <Method long JSONObject.getLong(String)>
	//   29   56:invokespecial   #44  <Method void Date(long)>
	//   30   59:astore          5
			AccessTokenSource accesstokensource = AccessTokenSource.valueOf(jsonobject.getString("source"));
	//   31   61:aload_0         
	//   32   62:ldc1            #203 <String "source">
	//   33   64:invokevirtual   #187 <Method String JSONObject.getString(String)>
	//   34   67:invokestatic    #108 <Method AccessTokenSource AccessTokenSource.valueOf(String)>
	//   35   70:astore          6
			return new AccessToken(s, jsonobject.getString("application_id"), jsonobject.getString("user_id"), ((Collection) (Utility.jsonArrayToStringList(jsonarray))), ((Collection) (Utility.jsonArrayToStringList(jsonarray1))), accesstokensource, date, date1);
	//   36   72:new             #2   <Class AccessToken>
	//   37   75:dup             
	//   38   76:aload_1         
	//   39   77:aload_0         
	//   40   78:ldc1            #205 <String "application_id">
	//   41   80:invokevirtual   #187 <Method String JSONObject.getString(String)>
	//   42   83:aload_0         
	//   43   84:ldc1            #207 <String "user_id">
	//   44   86:invokevirtual   #187 <Method String JSONObject.getString(String)>
	//   45   89:aload_3         
	//   46   90:invokestatic    #213 <Method List Utility.jsonArrayToStringList(JSONArray)>
	//   47   93:aload           4
	//   48   95:invokestatic    #213 <Method List Utility.jsonArrayToStringList(JSONArray)>
	//   49   98:aload           6
	//   50  100:aload_2         
	//   51  101:aload           5
	//   52  103:invokespecial   #170 <Method void AccessToken(String, String, String, Collection, Collection, AccessTokenSource, Date, Date)>
	//   53  106:areturn         
		} else
		{
			throw new FacebookException("Unknown AccessToken serialization format.");
	//   54  107:new             #215 <Class FacebookException>
	//   55  110:dup             
	//   56  111:ldc1            #217 <String "Unknown AccessToken serialization format.">
	//   57  113:invokespecial   #220 <Method void FacebookException(String)>
	//   58  116:athrow          
		}
	}

	static AccessToken createFromLegacyCache(Bundle bundle)
	{
		List list = getPermissionsFromBundle(bundle, "com.facebook.TokenCachingStrategy.Permissions");
	//    0    0:aload_0         
	//    1    1:ldc1            #225 <String "com.facebook.TokenCachingStrategy.Permissions">
	//    2    3:invokestatic    #229 <Method List getPermissionsFromBundle(Bundle, String)>
	//    3    6:astore_2        
		List list1 = getPermissionsFromBundle(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
	//    4    7:aload_0         
	//    5    8:ldc1            #231 <String "com.facebook.TokenCachingStrategy.DeclinedPermissions">
	//    6   10:invokestatic    #229 <Method List getPermissionsFromBundle(Bundle, String)>
	//    7   13:astore_3        
		String s = LegacyTokenHelper.getApplicationId(bundle);
	//    8   14:aload_0         
	//    9   15:invokestatic    #237 <Method String LegacyTokenHelper.getApplicationId(Bundle)>
	//   10   18:astore_1        
		if(Utility.isNullOrEmpty(s))
	//*  11   19:aload_1         
	//*  12   20:invokestatic    #241 <Method boolean Utility.isNullOrEmpty(String)>
	//*  13   23:ifeq            33
			s = FacebookSdk.getApplicationId();
	//   14   26:invokestatic    #245 <Method String FacebookSdk.getApplicationId()>
	//   15   29:astore_1        
	//*  16   30:goto            33
		String s1 = LegacyTokenHelper.getToken(bundle);
	//   17   33:aload_0         
	//   18   34:invokestatic    #248 <Method String LegacyTokenHelper.getToken(Bundle)>
	//   19   37:astore          4
		Object obj = ((Object) (Utility.awaitGetGraphMeRequestWithCache(s1)));
	//   20   39:aload           4
	//   21   41:invokestatic    #252 <Method JSONObject Utility.awaitGetGraphMeRequestWithCache(String)>
	//   22   44:astore          5
		try
		{
			obj = ((Object) (((JSONObject) (obj)).getString("id")));
	//   23   46:aload           5
	//   24   48:ldc1            #254 <String "id">
	//   25   50:invokevirtual   #187 <Method String JSONObject.getString(String)>
	//   26   53:astore          5
		}
	//*  27   55:new             #2   <Class AccessToken>
	//*  28   58:dup             
	//*  29   59:aload           4
	//*  30   61:aload_1         
	//*  31   62:aload           5
	//*  32   64:aload_2         
	//*  33   65:aload_3         
	//*  34   66:aload_0         
	//*  35   67:invokestatic    #258 <Method AccessTokenSource LegacyTokenHelper.getSource(Bundle)>
	//*  36   70:aload_0         
	//*  37   71:ldc2            #260 <String "com.facebook.TokenCachingStrategy.ExpirationDate">
	//*  38   74:invokestatic    #264 <Method Date LegacyTokenHelper.getDate(Bundle, String)>
	//*  39   77:aload_0         
	//*  40   78:ldc2            #266 <String "com.facebook.TokenCachingStrategy.LastRefreshDate">
	//*  41   81:invokestatic    #264 <Method Date LegacyTokenHelper.getDate(Bundle, String)>
	//*  42   84:invokespecial   #170 <Method void AccessToken(String, String, String, Collection, Collection, AccessTokenSource, Date, Date)>
	//*  43   87:areturn         
	//*  44   88:aconst_null     
	//*  45   89:areturn         
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
		{
			return null;
		}
		return new AccessToken(s1, s, ((String) (obj)), ((Collection) (list)), ((Collection) (list1)), LegacyTokenHelper.getSource(bundle), LegacyTokenHelper.getDate(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate"), LegacyTokenHelper.getDate(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"));
	//*  46   90:astore_0        
	//*  47   91:goto            88
	}

	static void expireCurrentAccessToken()
	{
		AccessToken accesstoken = AccessTokenManager.getInstance().getCurrentAccessToken();
	//    0    0:invokestatic    #273 <Method AccessTokenManager AccessTokenManager.getInstance()>
	//    1    3:invokevirtual   #277 <Method AccessToken AccessTokenManager.getCurrentAccessToken()>
	//    2    6:astore_0        
		if(accesstoken != null)
	//*   3    7:aload_0         
	//*   4    8:ifnull          18
			setCurrentAccessToken(createExpired(accesstoken));
	//    5   11:aload_0         
	//    6   12:invokestatic    #279 <Method AccessToken createExpired(AccessToken)>
	//    7   15:invokestatic    #283 <Method void setCurrentAccessToken(AccessToken)>
	//    8   18:return          
	}

	public static AccessToken getCurrentAccessToken()
	{
		return AccessTokenManager.getInstance().getCurrentAccessToken();
	//    0    0:invokestatic    #273 <Method AccessTokenManager AccessTokenManager.getInstance()>
	//    1    3:invokevirtual   #277 <Method AccessToken AccessTokenManager.getCurrentAccessToken()>
	//    2    6:areturn         
	}

	static List getPermissionsFromBundle(Bundle bundle, String s)
	{
		bundle = ((Bundle) (bundle.getStringArrayList(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #289 <Method ArrayList Bundle.getStringArrayList(String)>
	//    3    5:astore_0        
		if(bundle == null)
	//*   4    6:aload_0         
	//*   5    7:ifnonnull       14
			return Collections.emptyList();
	//    6   10:invokestatic    #293 <Method List Collections.emptyList()>
	//    7   13:areturn         
		else
			return Collections.unmodifiableList(((List) (new ArrayList(((Collection) (bundle))))));
	//    8   14:new             #75  <Class ArrayList>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:invokespecial   #294 <Method void ArrayList(Collection)>
	//   12   22:invokestatic    #298 <Method List Collections.unmodifiableList(List)>
	//   13   25:areturn         
	}

	public static boolean isCurrentAccessTokenActive()
	{
		AccessToken accesstoken = AccessTokenManager.getInstance().getCurrentAccessToken();
	//    0    0:invokestatic    #273 <Method AccessTokenManager AccessTokenManager.getInstance()>
	//    1    3:invokevirtual   #277 <Method AccessToken AccessTokenManager.getCurrentAccessToken()>
	//    2    6:astore_0        
		return accesstoken != null && !accesstoken.isExpired();
	//    3    7:aload_0         
	//    4    8:ifnull          20
	//    5   11:aload_0         
	//    6   12:invokevirtual   #304 <Method boolean isExpired()>
	//    7   15:ifne            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public static void setCurrentAccessToken(AccessToken accesstoken)
	{
		AccessTokenManager.getInstance().setCurrentAccessToken(accesstoken);
	//    0    0:invokestatic    #273 <Method AccessTokenManager AccessTokenManager.getInstance()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #305 <Method void AccessTokenManager.setCurrentAccessToken(AccessToken)>
	//    3    7:return          
	}

	private String tokenToString()
	{
		if(token == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #104 <Field String token>
	//*   2    4:ifnonnull       10
			return "null";
	//    3    7:ldc1            #144 <String "null">
	//    4    9:areturn         
		if(FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.INCLUDE_ACCESS_TOKENS))
	//*   5   10:getstatic       #312 <Field LoggingBehavior LoggingBehavior.INCLUDE_ACCESS_TOKENS>
	//*   6   13:invokestatic    #316 <Method boolean FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior)>
	//*   7   16:ifeq            24
			return token;
	//    8   19:aload_0         
	//    9   20:getfield        #104 <Field String token>
	//   10   23:areturn         
		else
			return "ACCESS_TOKEN_REMOVED";
	//   11   24:ldc2            #318 <String "ACCESS_TOKEN_REMOVED">
	//   12   27:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof AccessToken))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class AccessToken>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((AccessToken)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class AccessToken>
	//   12   20:astore_1        
		if(expires.equals(((Object) (((AccessToken) (obj)).expires))) && permissions.equals(((Object) (((AccessToken) (obj)).permissions))) && declinedPermissions.equals(((Object) (((AccessToken) (obj)).declinedPermissions))) && token.equals(((Object) (((AccessToken) (obj)).token))) && source == ((AccessToken) (obj)).source && lastRefresh.equals(((Object) (((AccessToken) (obj)).lastRefresh))))
	//*  13   21:aload_0         
	//*  14   22:getfield        #73  <Field Date expires>
	//*  15   25:aload_1         
	//*  16   26:getfield        #73  <Field Date expires>
	//*  17   29:invokevirtual   #324 <Method boolean Date.equals(Object)>
	//*  18   32:ifeq            152
	//*  19   35:aload_0         
	//*  20   36:getfield        #93  <Field Set permissions>
	//*  21   39:aload_1         
	//*  22   40:getfield        #93  <Field Set permissions>
	//*  23   43:invokeinterface #327 <Method boolean Set.equals(Object)>
	//*  24   48:ifeq            152
	//*  25   51:aload_0         
	//*  26   52:getfield        #98  <Field Set declinedPermissions>
	//*  27   55:aload_1         
	//*  28   56:getfield        #98  <Field Set declinedPermissions>
	//*  29   59:invokeinterface #327 <Method boolean Set.equals(Object)>
	//*  30   64:ifeq            152
	//*  31   67:aload_0         
	//*  32   68:getfield        #104 <Field String token>
	//*  33   71:aload_1         
	//*  34   72:getfield        #104 <Field String token>
	//*  35   75:invokevirtual   #330 <Method boolean String.equals(Object)>
	//*  36   78:ifeq            152
	//*  37   81:aload_0         
	//*  38   82:getfield        #110 <Field AccessTokenSource source>
	//*  39   85:aload_1         
	//*  40   86:getfield        #110 <Field AccessTokenSource source>
	//*  41   89:if_acmpne       152
	//*  42   92:aload_0         
	//*  43   93:getfield        #112 <Field Date lastRefresh>
	//*  44   96:aload_1         
	//*  45   97:getfield        #112 <Field Date lastRefresh>
	//*  46  100:invokevirtual   #324 <Method boolean Date.equals(Object)>
	//*  47  103:ifeq            152
		{
			String s = applicationId;
	//   48  106:aload_0         
	//   49  107:getfield        #114 <Field String applicationId>
	//   50  110:astore_2        
			if((s != null ? s.equals(((Object) (((AccessToken) (obj)).applicationId))) : ((AccessToken) (obj)).applicationId == null) && userId.equals(((Object) (((AccessToken) (obj)).userId))))
	//*  51  111:aload_2         
	//*  52  112:ifnonnull       125
	//*  53  115:aload_1         
	//*  54  116:getfield        #114 <Field String applicationId>
	//*  55  119:ifnonnull       152
	//*  56  122:goto            136
	//*  57  125:aload_2         
	//*  58  126:aload_1         
	//*  59  127:getfield        #114 <Field String applicationId>
	//*  60  130:invokevirtual   #330 <Method boolean String.equals(Object)>
	//*  61  133:ifeq            152
	//*  62  136:aload_0         
	//*  63  137:getfield        #116 <Field String userId>
	//*  64  140:aload_1         
	//*  65  141:getfield        #116 <Field String userId>
	//*  66  144:invokevirtual   #330 <Method boolean String.equals(Object)>
	//*  67  147:ifeq            152
				return true;
	//   68  150:iconst_1        
	//   69  151:ireturn         
		}
		return false;
	//   70  152:iconst_0        
	//   71  153:ireturn         
	}

	public String getApplicationId()
	{
		return applicationId;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field String applicationId>
	//    2    4:areturn         
	}

	public Set getDeclinedPermissions()
	{
		return declinedPermissions;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field Set declinedPermissions>
	//    2    4:areturn         
	}

	public Date getExpires()
	{
		return expires;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field Date expires>
	//    2    4:areturn         
	}

	public Date getLastRefresh()
	{
		return lastRefresh;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field Date lastRefresh>
	//    2    4:areturn         
	}

	public Set getPermissions()
	{
		return permissions;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field Set permissions>
	//    2    4:areturn         
	}

	public AccessTokenSource getSource()
	{
		return source;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field AccessTokenSource source>
	//    2    4:areturn         
	}

	public String getToken()
	{
		return token;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field String token>
	//    2    4:areturn         
	}

	public String getUserId()
	{
		return userId;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field String userId>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		int j = expires.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field Date expires>
	//    2    4:invokevirtual   #338 <Method int Date.hashCode()>
	//    3    7:istore_2        
		int k = permissions.hashCode();
	//    4    8:aload_0         
	//    5    9:getfield        #93  <Field Set permissions>
	//    6   12:invokeinterface #339 <Method int Set.hashCode()>
	//    7   17:istore_3        
		int l = declinedPermissions.hashCode();
	//    8   18:aload_0         
	//    9   19:getfield        #98  <Field Set declinedPermissions>
	//   10   22:invokeinterface #339 <Method int Set.hashCode()>
	//   11   27:istore          4
		int i1 = token.hashCode();
	//   12   29:aload_0         
	//   13   30:getfield        #104 <Field String token>
	//   14   33:invokevirtual   #340 <Method int String.hashCode()>
	//   15   36:istore          5
		int j1 = source.hashCode();
	//   16   38:aload_0         
	//   17   39:getfield        #110 <Field AccessTokenSource source>
	//   18   42:invokevirtual   #341 <Method int AccessTokenSource.hashCode()>
	//   19   45:istore          6
		int k1 = lastRefresh.hashCode();
	//   20   47:aload_0         
	//   21   48:getfield        #112 <Field Date lastRefresh>
	//   22   51:invokevirtual   #338 <Method int Date.hashCode()>
	//   23   54:istore          7
		String s = applicationId;
	//   24   56:aload_0         
	//   25   57:getfield        #114 <Field String applicationId>
	//   26   60:astore          8
		int i;
		if(s == null)
	//*  27   62:aload           8
	//*  28   64:ifnonnull       72
			i = 0;
	//   29   67:iconst_0        
	//   30   68:istore_1        
		else
	//*  31   69:goto            78
			i = s.hashCode();
	//   32   72:aload           8
	//   33   74:invokevirtual   #340 <Method int String.hashCode()>
	//   34   77:istore_1        
		return (((((((527 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + i) * 31 + userId.hashCode();
	//   35   78:sipush          527
	//   36   81:iload_2         
	//   37   82:iadd            
	//   38   83:bipush          31
	//   39   85:imul            
	//   40   86:iload_3         
	//   41   87:iadd            
	//   42   88:bipush          31
	//   43   90:imul            
	//   44   91:iload           4
	//   45   93:iadd            
	//   46   94:bipush          31
	//   47   96:imul            
	//   48   97:iload           5
	//   49   99:iadd            
	//   50  100:bipush          31
	//   51  102:imul            
	//   52  103:iload           6
	//   53  105:iadd            
	//   54  106:bipush          31
	//   55  108:imul            
	//   56  109:iload           7
	//   57  111:iadd            
	//   58  112:bipush          31
	//   59  114:imul            
	//   60  115:iload_1         
	//   61  116:iadd            
	//   62  117:bipush          31
	//   63  119:imul            
	//   64  120:aload_0         
	//   65  121:getfield        #116 <Field String userId>
	//   66  124:invokevirtual   #340 <Method int String.hashCode()>
	//   67  127:iadd            
	//   68  128:ireturn         
	}

	public boolean isExpired()
	{
		return (new Date()).after(expires);
	//    0    0:new             #38  <Class Date>
	//    1    3:dup             
	//    2    4:invokespecial   #50  <Method void Date()>
	//    3    7:aload_0         
	//    4    8:getfield        #73  <Field Date expires>
	//    5   11:invokevirtual   #345 <Method boolean Date.after(Date)>
	//    6   14:ireturn         
	}

	JSONObject toJSONObject()
		throws JSONException
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #178 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #348 <Method void JSONObject()>
	//    3    7:astore_1        
		jsonobject.put("version", 1);
	//    4    8:aload_1         
	//    5    9:ldc1            #176 <String "version">
	//    6   11:iconst_1        
	//    7   12:invokevirtual   #352 <Method JSONObject JSONObject.put(String, int)>
	//    8   15:pop             
		jsonobject.put("token", ((Object) (token)));
	//    9   16:aload_1         
	//   10   17:ldc1            #183 <String "token">
	//   11   19:aload_0         
	//   12   20:getfield        #104 <Field String token>
	//   13   23:invokevirtual   #355 <Method JSONObject JSONObject.put(String, Object)>
	//   14   26:pop             
		jsonobject.put("expires_at", expires.getTime());
	//   15   27:aload_1         
	//   16   28:ldc1            #189 <String "expires_at">
	//   17   30:aload_0         
	//   18   31:getfield        #73  <Field Date expires>
	//   19   34:invokevirtual   #358 <Method long Date.getTime()>
	//   20   37:invokevirtual   #361 <Method JSONObject JSONObject.put(String, long)>
	//   21   40:pop             
		jsonobject.put("permissions", ((Object) (new JSONArray(((Collection) (permissions))))));
	//   22   41:aload_1         
	//   23   42:ldc1            #194 <String "permissions">
	//   24   44:new             #363 <Class JSONArray>
	//   25   47:dup             
	//   26   48:aload_0         
	//   27   49:getfield        #93  <Field Set permissions>
	//   28   52:invokespecial   #364 <Method void JSONArray(Collection)>
	//   29   55:invokevirtual   #355 <Method JSONObject JSONObject.put(String, Object)>
	//   30   58:pop             
		jsonobject.put("declined_permissions", ((Object) (new JSONArray(((Collection) (declinedPermissions))))));
	//   31   59:aload_1         
	//   32   60:ldc1            #200 <String "declined_permissions">
	//   33   62:new             #363 <Class JSONArray>
	//   34   65:dup             
	//   35   66:aload_0         
	//   36   67:getfield        #98  <Field Set declinedPermissions>
	//   37   70:invokespecial   #364 <Method void JSONArray(Collection)>
	//   38   73:invokevirtual   #355 <Method JSONObject JSONObject.put(String, Object)>
	//   39   76:pop             
		jsonobject.put("last_refresh", lastRefresh.getTime());
	//   40   77:aload_1         
	//   41   78:ldc1            #202 <String "last_refresh">
	//   42   80:aload_0         
	//   43   81:getfield        #112 <Field Date lastRefresh>
	//   44   84:invokevirtual   #358 <Method long Date.getTime()>
	//   45   87:invokevirtual   #361 <Method JSONObject JSONObject.put(String, long)>
	//   46   90:pop             
		jsonobject.put("source", ((Object) (source.name())));
	//   47   91:aload_1         
	//   48   92:ldc1            #203 <String "source">
	//   49   94:aload_0         
	//   50   95:getfield        #110 <Field AccessTokenSource source>
	//   51   98:invokevirtual   #367 <Method String AccessTokenSource.name()>
	//   52  101:invokevirtual   #355 <Method JSONObject JSONObject.put(String, Object)>
	//   53  104:pop             
		jsonobject.put("application_id", ((Object) (applicationId)));
	//   54  105:aload_1         
	//   55  106:ldc1            #205 <String "application_id">
	//   56  108:aload_0         
	//   57  109:getfield        #114 <Field String applicationId>
	//   58  112:invokevirtual   #355 <Method JSONObject JSONObject.put(String, Object)>
	//   59  115:pop             
		jsonobject.put("user_id", ((Object) (userId)));
	//   60  116:aload_1         
	//   61  117:ldc1            #207 <String "user_id">
	//   62  119:aload_0         
	//   63  120:getfield        #116 <Field String userId>
	//   64  123:invokevirtual   #355 <Method JSONObject JSONObject.put(String, Object)>
	//   65  126:pop             
		return jsonobject;
	//   66  127:aload_1         
	//   67  128:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #138 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #369 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("{AccessToken");
	//    4    8:aload_1         
	//    5    9:ldc2            #371 <String "{AccessToken">
	//    6   12:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(" token:");
	//    8   16:aload_1         
	//    9   17:ldc2            #373 <String " token:">
	//   10   20:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		stringbuilder.append(tokenToString());
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:invokespecial   #375 <Method String tokenToString()>
	//   15   29:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		appendPermissions(stringbuilder);
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:invokespecial   #377 <Method void appendPermissions(StringBuilder)>
		stringbuilder.append("}");
	//   20   38:aload_1         
	//   21   39:ldc2            #379 <String "}">
	//   22   42:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
		return stringbuilder.toString();
	//   24   46:aload_1         
	//   25   47:invokevirtual   #381 <Method String StringBuilder.toString()>
	//   26   50:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeLong(expires.getTime());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #73  <Field Date expires>
	//    3    5:invokevirtual   #358 <Method long Date.getTime()>
	//    4    8:invokevirtual   #386 <Method void Parcel.writeLong(long)>
		parcel.writeStringList(((List) (new ArrayList(((Collection) (permissions))))));
	//    5   11:aload_1         
	//    6   12:new             #75  <Class ArrayList>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:getfield        #93  <Field Set permissions>
	//   10   20:invokespecial   #294 <Method void ArrayList(Collection)>
	//   11   23:invokevirtual   #389 <Method void Parcel.writeStringList(List)>
		parcel.writeStringList(((List) (new ArrayList(((Collection) (declinedPermissions))))));
	//   12   26:aload_1         
	//   13   27:new             #75  <Class ArrayList>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:getfield        #98  <Field Set declinedPermissions>
	//   17   35:invokespecial   #294 <Method void ArrayList(Collection)>
	//   18   38:invokevirtual   #389 <Method void Parcel.writeStringList(List)>
		parcel.writeString(token);
	//   19   41:aload_1         
	//   20   42:aload_0         
	//   21   43:getfield        #104 <Field String token>
	//   22   46:invokevirtual   #392 <Method void Parcel.writeString(String)>
		parcel.writeString(source.name());
	//   23   49:aload_1         
	//   24   50:aload_0         
	//   25   51:getfield        #110 <Field AccessTokenSource source>
	//   26   54:invokevirtual   #367 <Method String AccessTokenSource.name()>
	//   27   57:invokevirtual   #392 <Method void Parcel.writeString(String)>
		parcel.writeLong(lastRefresh.getTime());
	//   28   60:aload_1         
	//   29   61:aload_0         
	//   30   62:getfield        #112 <Field Date lastRefresh>
	//   31   65:invokevirtual   #358 <Method long Date.getTime()>
	//   32   68:invokevirtual   #386 <Method void Parcel.writeLong(long)>
		parcel.writeString(applicationId);
	//   33   71:aload_1         
	//   34   72:aload_0         
	//   35   73:getfield        #114 <Field String applicationId>
	//   36   76:invokevirtual   #392 <Method void Parcel.writeString(String)>
		parcel.writeString(userId);
	//   37   79:aload_1         
	//   38   80:aload_0         
	//   39   81:getfield        #116 <Field String userId>
	//   40   84:invokevirtual   #392 <Method void Parcel.writeString(String)>
	//   41   87:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public AccessToken createFromParcel(Parcel parcel)
		{
			return new AccessToken(parcel);
		//    0    0:new             #8   <Class AccessToken>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #18  <Method void AccessToken(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #21  <Method AccessToken createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public AccessToken[] newArray(int i)
		{
			return new AccessToken[i];
		//    0    0:iload_1         
		//    1    1:anewarray       AccessToken[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #26  <Method AccessToken[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private static final AccessTokenSource DEFAULT_ACCESS_TOKEN_SOURCE;
	private static final Date DEFAULT_EXPIRATION_TIME;
	private static final Date DEFAULT_LAST_REFRESH_TIME = new Date();
	private static final Date MAX_DATE;
	private final String applicationId;
	private final Set declinedPermissions;
	private final Date expires;
	private final Date lastRefresh;
	private final Set permissions;
	private final AccessTokenSource source;
	private final String token;
	private final String userId;

	static 
	{
		MAX_DATE = new Date(0xffffffffL);
	//    0    0:new             #38  <Class Date>
	//    1    3:dup             
	//    2    4:ldc2w           #39  <Long 0xffffffffL>
	//    3    7:invokespecial   #44  <Method void Date(long)>
	//    4   10:putstatic       #46  <Field Date MAX_DATE>
		DEFAULT_EXPIRATION_TIME = MAX_DATE;
	//    5   13:getstatic       #46  <Field Date MAX_DATE>
	//    6   16:putstatic       #48  <Field Date DEFAULT_EXPIRATION_TIME>
	//    7   19:new             #38  <Class Date>
	//    8   22:dup             
	//    9   23:invokespecial   #50  <Method void Date()>
	//   10   26:putstatic       #52  <Field Date DEFAULT_LAST_REFRESH_TIME>
		DEFAULT_ACCESS_TOKEN_SOURCE = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
	//   11   29:getstatic       #57  <Field AccessTokenSource AccessTokenSource.FACEBOOK_APPLICATION_WEB>
	//   12   32:putstatic       #59  <Field AccessTokenSource DEFAULT_ACCESS_TOKEN_SOURCE>
	//   13   35:new             #8   <Class AccessToken$2>
	//   14   38:dup             
	//   15   39:invokespecial   #60  <Method void AccessToken$2()>
	//   16   42:putstatic       #62  <Field android.os.Parcelable$Creator CREATOR>
	//*  17   45:return          
	}
}
