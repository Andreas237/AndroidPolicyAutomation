// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.content.Intent;
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
	//    1    1:invokespecial   #104 <Method void Object()>
		expires = new Date(parcel.readLong());
	//    2    4:aload_0         
	//    3    5:new             #77  <Class Date>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokevirtual   #110 <Method long Parcel.readLong()>
	//    7   13:invokespecial   #83  <Method void Date(long)>
	//    8   16:putfield        #112 <Field Date expires>
		ArrayList arraylist = new ArrayList();
	//    9   19:new             #114 <Class ArrayList>
	//   10   22:dup             
	//   11   23:invokespecial   #115 <Method void ArrayList()>
	//   12   26:astore_2        
		parcel.readStringList(((List) (arraylist)));
	//   13   27:aload_1         
	//   14   28:aload_2         
	//   15   29:invokevirtual   #119 <Method void Parcel.readStringList(List)>
		permissions = Collections.unmodifiableSet(((Set) (new HashSet(((Collection) (arraylist))))));
	//   16   32:aload_0         
	//   17   33:new             #121 <Class HashSet>
	//   18   36:dup             
	//   19   37:aload_2         
	//   20   38:invokespecial   #124 <Method void HashSet(Collection)>
	//   21   41:invokestatic    #130 <Method Set Collections.unmodifiableSet(Set)>
	//   22   44:putfield        #132 <Field Set permissions>
		arraylist.clear();
	//   23   47:aload_2         
	//   24   48:invokevirtual   #135 <Method void ArrayList.clear()>
		parcel.readStringList(((List) (arraylist)));
	//   25   51:aload_1         
	//   26   52:aload_2         
	//   27   53:invokevirtual   #119 <Method void Parcel.readStringList(List)>
		declinedPermissions = Collections.unmodifiableSet(((Set) (new HashSet(((Collection) (arraylist))))));
	//   28   56:aload_0         
	//   29   57:new             #121 <Class HashSet>
	//   30   60:dup             
	//   31   61:aload_2         
	//   32   62:invokespecial   #124 <Method void HashSet(Collection)>
	//   33   65:invokestatic    #130 <Method Set Collections.unmodifiableSet(Set)>
	//   34   68:putfield        #137 <Field Set declinedPermissions>
		token = parcel.readString();
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:invokevirtual   #141 <Method String Parcel.readString()>
	//   38   76:putfield        #143 <Field String token>
		source = AccessTokenSource.valueOf(parcel.readString());
	//   39   79:aload_0         
	//   40   80:aload_1         
	//   41   81:invokevirtual   #141 <Method String Parcel.readString()>
	//   42   84:invokestatic    #147 <Method AccessTokenSource AccessTokenSource.valueOf(String)>
	//   43   87:putfield        #149 <Field AccessTokenSource source>
		lastRefresh = new Date(parcel.readLong());
	//   44   90:aload_0         
	//   45   91:new             #77  <Class Date>
	//   46   94:dup             
	//   47   95:aload_1         
	//   48   96:invokevirtual   #110 <Method long Parcel.readLong()>
	//   49   99:invokespecial   #83  <Method void Date(long)>
	//   50  102:putfield        #151 <Field Date lastRefresh>
		applicationId = parcel.readString();
	//   51  105:aload_0         
	//   52  106:aload_1         
	//   53  107:invokevirtual   #141 <Method String Parcel.readString()>
	//   54  110:putfield        #153 <Field String applicationId>
		userId = parcel.readString();
	//   55  113:aload_0         
	//   56  114:aload_1         
	//   57  115:invokevirtual   #141 <Method String Parcel.readString()>
	//   58  118:putfield        #155 <Field String userId>
		dataAccessExpirationTime = new Date(parcel.readLong());
	//   59  121:aload_0         
	//   60  122:new             #77  <Class Date>
	//   61  125:dup             
	//   62  126:aload_1         
	//   63  127:invokevirtual   #110 <Method long Parcel.readLong()>
	//   64  130:invokespecial   #83  <Method void Date(long)>
	//   65  133:putfield        #157 <Field Date dataAccessExpirationTime>
	//   66  136:return          
	}

	public AccessToken(String s, String s1, String s2, Collection collection, Collection collection1, AccessTokenSource accesstokensource, Date date, 
			Date date1, Date date2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #104 <Method void Object()>
		Validate.notNullOrEmpty(s, "accessToken");
	//    2    4:aload_1         
	//    3    5:ldc1            #161 <String "accessToken">
	//    4    7:invokestatic    #167 <Method void Validate.notNullOrEmpty(String, String)>
		Validate.notNullOrEmpty(s1, "applicationId");
	//    5   10:aload_2         
	//    6   11:ldc1            #168 <String "applicationId">
	//    7   13:invokestatic    #167 <Method void Validate.notNullOrEmpty(String, String)>
		Validate.notNullOrEmpty(s2, "userId");
	//    8   16:aload_3         
	//    9   17:ldc1            #169 <String "userId">
	//   10   19:invokestatic    #167 <Method void Validate.notNullOrEmpty(String, String)>
		if(date == null)
	//*  11   22:aload           7
	//*  12   24:ifnull          30
	//*  13   27:goto            35
			date = DEFAULT_EXPIRATION_TIME;
	//   14   30:getstatic       #87  <Field Date DEFAULT_EXPIRATION_TIME>
	//   15   33:astore          7
		expires = date;
	//   16   35:aload_0         
	//   17   36:aload           7
	//   18   38:putfield        #112 <Field Date expires>
		if(collection != null)
	//*  19   41:aload           4
	//*  20   43:ifnull          60
			collection = ((Collection) (new HashSet(collection)));
	//   21   46:new             #121 <Class HashSet>
	//   22   49:dup             
	//   23   50:aload           4
	//   24   52:invokespecial   #124 <Method void HashSet(Collection)>
	//   25   55:astore          4
		else
	//*  26   57:goto            69
			collection = ((Collection) (new HashSet()));
	//   27   60:new             #121 <Class HashSet>
	//   28   63:dup             
	//   29   64:invokespecial   #170 <Method void HashSet()>
	//   30   67:astore          4
		permissions = Collections.unmodifiableSet(((Set) (collection)));
	//   31   69:aload_0         
	//   32   70:aload           4
	//   33   72:invokestatic    #130 <Method Set Collections.unmodifiableSet(Set)>
	//   34   75:putfield        #132 <Field Set permissions>
		if(collection1 != null)
	//*  35   78:aload           5
	//*  36   80:ifnull          97
			collection = ((Collection) (new HashSet(collection1)));
	//   37   83:new             #121 <Class HashSet>
	//   38   86:dup             
	//   39   87:aload           5
	//   40   89:invokespecial   #124 <Method void HashSet(Collection)>
	//   41   92:astore          4
		else
	//*  42   94:goto            106
			collection = ((Collection) (new HashSet()));
	//   43   97:new             #121 <Class HashSet>
	//   44  100:dup             
	//   45  101:invokespecial   #170 <Method void HashSet()>
	//   46  104:astore          4
		declinedPermissions = Collections.unmodifiableSet(((Set) (collection)));
	//   47  106:aload_0         
	//   48  107:aload           4
	//   49  109:invokestatic    #130 <Method Set Collections.unmodifiableSet(Set)>
	//   50  112:putfield        #137 <Field Set declinedPermissions>
		token = s;
	//   51  115:aload_0         
	//   52  116:aload_1         
	//   53  117:putfield        #143 <Field String token>
		if(accesstokensource == null)
	//*  54  120:aload           6
	//*  55  122:ifnull          128
	//*  56  125:goto            133
			accesstokensource = DEFAULT_ACCESS_TOKEN_SOURCE;
	//   57  128:getstatic       #98  <Field AccessTokenSource DEFAULT_ACCESS_TOKEN_SOURCE>
	//   58  131:astore          6
		source = accesstokensource;
	//   59  133:aload_0         
	//   60  134:aload           6
	//   61  136:putfield        #149 <Field AccessTokenSource source>
		if(date1 == null)
	//*  62  139:aload           8
	//*  63  141:ifnull          147
	//*  64  144:goto            152
			date1 = DEFAULT_LAST_REFRESH_TIME;
	//   65  147:getstatic       #91  <Field Date DEFAULT_LAST_REFRESH_TIME>
	//   66  150:astore          8
		lastRefresh = date1;
	//   67  152:aload_0         
	//   68  153:aload           8
	//   69  155:putfield        #151 <Field Date lastRefresh>
		applicationId = s1;
	//   70  158:aload_0         
	//   71  159:aload_2         
	//   72  160:putfield        #153 <Field String applicationId>
		userId = s2;
	//   73  163:aload_0         
	//   74  164:aload_3         
	//   75  165:putfield        #155 <Field String userId>
		if(date2 == null || date2.getTime() == 0L)
	//*  76  168:aload           9
	//*  77  170:ifnull          186
	//*  78  173:aload           9
	//*  79  175:invokevirtual   #173 <Method long Date.getTime()>
	//*  80  178:lconst_0        
	//*  81  179:lcmp            
	//*  82  180:ifeq            186
	//*  83  183:goto            191
			date2 = DEFAULT_EXPIRATION_TIME;
	//   84  186:getstatic       #87  <Field Date DEFAULT_EXPIRATION_TIME>
	//   85  189:astore          9
		dataAccessExpirationTime = date2;
	//   86  191:aload_0         
	//   87  192:aload           9
	//   88  194:putfield        #157 <Field Date dataAccessExpirationTime>
	//   89  197:return          
	}

	private void appendPermissions(StringBuilder stringbuilder)
	{
		stringbuilder.append(" permissions:");
	//    0    0:aload_1         
	//    1    1:ldc1            #185 <String " permissions:">
	//    2    3:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//    3    6:pop             
		if(permissions == null)
	//*   4    7:aload_0         
	//*   5    8:getfield        #132 <Field Set permissions>
	//*   6   11:ifnonnull       22
		{
			stringbuilder.append("null");
	//    7   14:aload_1         
	//    8   15:ldc1            #193 <String "null">
	//    9   17:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
			return;
	//   11   21:return          
		} else
		{
			stringbuilder.append("[");
	//   12   22:aload_1         
	//   13   23:ldc1            #195 <String "[">
	//   14   25:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   15   28:pop             
			stringbuilder.append(TextUtils.join(", ", ((Iterable) (permissions))));
	//   16   29:aload_1         
	//   17   30:ldc1            #197 <String ", ">
	//   18   32:aload_0         
	//   19   33:getfield        #132 <Field Set permissions>
	//   20   36:invokestatic    #203 <Method String TextUtils.join(CharSequence, Iterable)>
	//   21   39:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
			stringbuilder.append("]");
	//   23   43:aload_1         
	//   24   44:ldc1            #205 <String "]">
	//   25   46:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
			return;
	//   27   50:return          
		}
	}

	static AccessToken createExpired(AccessToken accesstoken)
	{
		return new AccessToken(accesstoken.token, accesstoken.applicationId, accesstoken.getUserId(), ((Collection) (accesstoken.getPermissions())), ((Collection) (accesstoken.getDeclinedPermissions())), accesstoken.source, new Date(), new Date(), accesstoken.dataAccessExpirationTime);
	//    0    0:new             #2   <Class AccessToken>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #143 <Field String token>
	//    4    8:aload_0         
	//    5    9:getfield        #153 <Field String applicationId>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #210 <Method String getUserId()>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #214 <Method Set getPermissions()>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #217 <Method Set getDeclinedPermissions()>
	//   12   24:aload_0         
	//   13   25:getfield        #149 <Field AccessTokenSource source>
	//   14   28:new             #77  <Class Date>
	//   15   31:dup             
	//   16   32:invokespecial   #89  <Method void Date()>
	//   17   35:new             #77  <Class Date>
	//   18   38:dup             
	//   19   39:invokespecial   #89  <Method void Date()>
	//   20   42:aload_0         
	//   21   43:getfield        #157 <Field Date dataAccessExpirationTime>
	//   22   46:invokespecial   #219 <Method void AccessToken(String, String, String, Collection, Collection, AccessTokenSource, Date, Date, Date)>
	//   23   49:areturn         
	}

	private static AccessToken createFromBundle(List list, Bundle bundle, AccessTokenSource accesstokensource, Date date, String s)
	{
		String s1 = bundle.getString("access_token");
	//    0    0:aload_1         
	//    1    1:ldc1            #20  <String "access_token">
	//    2    3:invokevirtual   #225 <Method String Bundle.getString(String)>
	//    3    6:astore          5
		date = Utility.getBundleLongAsDate(bundle, "expires_in", date);
	//    4    8:aload_1         
	//    5    9:ldc1            #46  <String "expires_in">
	//    6   11:aload_3         
	//    7   12:invokestatic    #231 <Method Date Utility.getBundleLongAsDate(Bundle, String, Date)>
	//    8   15:astore_3        
		String s2 = bundle.getString("user_id");
	//    9   16:aload_1         
	//   10   17:ldc1            #62  <String "user_id">
	//   11   19:invokevirtual   #225 <Method String Bundle.getString(String)>
	//   12   22:astore          6
		bundle = ((Bundle) (Utility.getBundleLongAsDate(bundle, "data_access_expiration_time", new Date(0L))));
	//   13   24:aload_1         
	//   14   25:ldc1            #32  <String "data_access_expiration_time">
	//   15   27:new             #77  <Class Date>
	//   16   30:dup             
	//   17   31:lconst_0        
	//   18   32:invokespecial   #83  <Method void Date(long)>
	//   19   35:invokestatic    #231 <Method Date Utility.getBundleLongAsDate(Bundle, String, Date)>
	//   20   38:astore_1        
		if(!Utility.isNullOrEmpty(s1) && date != null)
	//*  21   39:aload           5
	//*  22   41:invokestatic    #235 <Method boolean Utility.isNullOrEmpty(String)>
	//*  23   44:ifne            80
	//*  24   47:aload_3         
	//*  25   48:ifnonnull       54
	//*  26   51:goto            80
			return new AccessToken(s1, s, s2, ((Collection) (list)), ((Collection) (null)), accesstokensource, date, new Date(), ((Date) (bundle)));
	//   27   54:new             #2   <Class AccessToken>
	//   28   57:dup             
	//   29   58:aload           5
	//   30   60:aload           4
	//   31   62:aload           6
	//   32   64:aload_0         
	//   33   65:aconst_null     
	//   34   66:aload_2         
	//   35   67:aload_3         
	//   36   68:new             #77  <Class Date>
	//   37   71:dup             
	//   38   72:invokespecial   #89  <Method void Date()>
	//   39   75:aload_1         
	//   40   76:invokespecial   #219 <Method void AccessToken(String, String, String, Collection, Collection, AccessTokenSource, Date, Date, Date)>
	//   41   79:areturn         
		else
			return null;
	//   42   80:aconst_null     
	//   43   81:areturn         
	}

	static AccessToken createFromJSONObject(JSONObject jsonobject)
		throws JSONException
	{
		if(jsonobject.getInt("version") <= 1)
	//*   0    0:aload_0         
	//*   1    1:ldc1            #65  <String "version">
	//*   2    3:invokevirtual   #246 <Method int JSONObject.getInt(String)>
	//*   3    6:iconst_1        
	//*   4    7:icmpgt          130
		{
			String s = jsonobject.getString("token");
	//    5   10:aload_0         
	//    6   11:ldc1            #59  <String "token">
	//    7   13:invokevirtual   #247 <Method String JSONObject.getString(String)>
	//    8   16:astore_1        
			Date date = new Date(jsonobject.getLong("expires_at"));
	//    9   17:new             #77  <Class Date>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:ldc1            #43  <String "expires_at">
	//   13   24:invokevirtual   #251 <Method long JSONObject.getLong(String)>
	//   14   27:invokespecial   #83  <Method void Date(long)>
	//   15   30:astore_2        
			JSONArray jsonarray = jsonobject.getJSONArray("permissions");
	//   16   31:aload_0         
	//   17   32:ldc1            #53  <String "permissions">
	//   18   34:invokevirtual   #255 <Method JSONArray JSONObject.getJSONArray(String)>
	//   19   37:astore_3        
			JSONArray jsonarray1 = jsonobject.getJSONArray("declined_permissions");
	//   20   38:aload_0         
	//   21   39:ldc1            #35  <String "declined_permissions">
	//   22   41:invokevirtual   #255 <Method JSONArray JSONObject.getJSONArray(String)>
	//   23   44:astore          4
			Date date1 = new Date(jsonobject.getLong("last_refresh"));
	//   24   46:new             #77  <Class Date>
	//   25   49:dup             
	//   26   50:aload_0         
	//   27   51:ldc1            #49  <String "last_refresh">
	//   28   53:invokevirtual   #251 <Method long JSONObject.getLong(String)>
	//   29   56:invokespecial   #83  <Method void Date(long)>
	//   30   59:astore          5
			AccessTokenSource accesstokensource = AccessTokenSource.valueOf(jsonobject.getString("source"));
	//   31   61:aload_0         
	//   32   62:ldc1            #56  <String "source">
	//   33   64:invokevirtual   #247 <Method String JSONObject.getString(String)>
	//   34   67:invokestatic    #147 <Method AccessTokenSource AccessTokenSource.valueOf(String)>
	//   35   70:astore          6
			String s1 = jsonobject.getString("application_id");
	//   36   72:aload_0         
	//   37   73:ldc1            #23  <String "application_id">
	//   38   75:invokevirtual   #247 <Method String JSONObject.getString(String)>
	//   39   78:astore          7
			String s2 = jsonobject.getString("user_id");
	//   40   80:aload_0         
	//   41   81:ldc1            #62  <String "user_id">
	//   42   83:invokevirtual   #247 <Method String JSONObject.getString(String)>
	//   43   86:astore          8
			jsonobject = ((JSONObject) (new Date(jsonobject.getLong("data_access_expiration_time"))));
	//   44   88:new             #77  <Class Date>
	//   45   91:dup             
	//   46   92:aload_0         
	//   47   93:ldc1            #32  <String "data_access_expiration_time">
	//   48   95:invokevirtual   #251 <Method long JSONObject.getLong(String)>
	//   49   98:invokespecial   #83  <Method void Date(long)>
	//   50  101:astore_0        
			return new AccessToken(s, s1, s2, ((Collection) (Utility.jsonArrayToStringList(jsonarray))), ((Collection) (Utility.jsonArrayToStringList(jsonarray1))), accesstokensource, date, date1, ((Date) (jsonobject)));
	//   51  102:new             #2   <Class AccessToken>
	//   52  105:dup             
	//   53  106:aload_1         
	//   54  107:aload           7
	//   55  109:aload           8
	//   56  111:aload_3         
	//   57  112:invokestatic    #259 <Method List Utility.jsonArrayToStringList(JSONArray)>
	//   58  115:aload           4
	//   59  117:invokestatic    #259 <Method List Utility.jsonArrayToStringList(JSONArray)>
	//   60  120:aload           6
	//   61  122:aload_2         
	//   62  123:aload           5
	//   63  125:aload_0         
	//   64  126:invokespecial   #219 <Method void AccessToken(String, String, String, Collection, Collection, AccessTokenSource, Date, Date, Date)>
	//   65  129:areturn         
		} else
		{
			throw new FacebookException("Unknown AccessToken serialization format.");
	//   66  130:new             #261 <Class FacebookException>
	//   67  133:dup             
	//   68  134:ldc2            #263 <String "Unknown AccessToken serialization format.">
	//   69  137:invokespecial   #266 <Method void FacebookException(String)>
	//   70  140:athrow          
		}
	}

	static AccessToken createFromLegacyCache(Bundle bundle)
	{
		List list = getPermissionsFromBundle(bundle, "com.facebook.TokenCachingStrategy.Permissions");
	//    0    0:aload_0         
	//    1    1:ldc2            #271 <String "com.facebook.TokenCachingStrategy.Permissions">
	//    2    4:invokestatic    #275 <Method List getPermissionsFromBundle(Bundle, String)>
	//    3    7:astore_2        
		List list1 = getPermissionsFromBundle(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
	//    4    8:aload_0         
	//    5    9:ldc2            #277 <String "com.facebook.TokenCachingStrategy.DeclinedPermissions">
	//    6   12:invokestatic    #275 <Method List getPermissionsFromBundle(Bundle, String)>
	//    7   15:astore_3        
		String s = LegacyTokenHelper.getApplicationId(bundle);
	//    8   16:aload_0         
	//    9   17:invokestatic    #283 <Method String LegacyTokenHelper.getApplicationId(Bundle)>
	//   10   20:astore_1        
		if(Utility.isNullOrEmpty(s))
	//*  11   21:aload_1         
	//*  12   22:invokestatic    #235 <Method boolean Utility.isNullOrEmpty(String)>
	//*  13   25:ifeq            35
			s = FacebookSdk.getApplicationId();
	//   14   28:invokestatic    #287 <Method String FacebookSdk.getApplicationId()>
	//   15   31:astore_1        
	//*  16   32:goto            35
		String s1 = LegacyTokenHelper.getToken(bundle);
	//   17   35:aload_0         
	//   18   36:invokestatic    #290 <Method String LegacyTokenHelper.getToken(Bundle)>
	//   19   39:astore          4
		Object obj = ((Object) (Utility.awaitGetGraphMeRequestWithCache(s1)));
	//   20   41:aload           4
	//   21   43:invokestatic    #294 <Method JSONObject Utility.awaitGetGraphMeRequestWithCache(String)>
	//   22   46:astore          5
		try
		{
			obj = ((Object) (((JSONObject) (obj)).getString("id")));
	//   23   48:aload           5
	//   24   50:ldc2            #296 <String "id">
	//   25   53:invokevirtual   #247 <Method String JSONObject.getString(String)>
	//   26   56:astore          5
		}
	//*  27   58:new             #2   <Class AccessToken>
	//*  28   61:dup             
	//*  29   62:aload           4
	//*  30   64:aload_1         
	//*  31   65:aload           5
	//*  32   67:aload_2         
	//*  33   68:aload_3         
	//*  34   69:aload_0         
	//*  35   70:invokestatic    #300 <Method AccessTokenSource LegacyTokenHelper.getSource(Bundle)>
	//*  36   73:aload_0         
	//*  37   74:ldc2            #302 <String "com.facebook.TokenCachingStrategy.ExpirationDate">
	//*  38   77:invokestatic    #306 <Method Date LegacyTokenHelper.getDate(Bundle, String)>
	//*  39   80:aload_0         
	//*  40   81:ldc2            #308 <String "com.facebook.TokenCachingStrategy.LastRefreshDate">
	//*  41   84:invokestatic    #306 <Method Date LegacyTokenHelper.getDate(Bundle, String)>
	//*  42   87:aconst_null     
	//*  43   88:invokespecial   #219 <Method void AccessToken(String, String, String, Collection, Collection, AccessTokenSource, Date, Date, Date)>
	//*  44   91:areturn         
	//*  45   92:aconst_null     
	//*  46   93:areturn         
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
		{
			return null;
		}
		return new AccessToken(s1, s, ((String) (obj)), ((Collection) (list)), ((Collection) (list1)), LegacyTokenHelper.getSource(bundle), LegacyTokenHelper.getDate(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate"), LegacyTokenHelper.getDate(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"), ((Date) (null)));
	//*  47   94:astore_0        
	//*  48   95:goto            92
	}

	public static void createFromNativeLinkingIntent(Intent intent, String s, AccessTokenCreationCallback accesstokencreationcallback)
	{
		Validate.notNull(((Object) (intent)), "intent");
	//    0    0:aload_0         
	//    1    1:ldc2            #312 <String "intent">
	//    2    4:invokestatic    #316 <Method void Validate.notNull(Object, String)>
		if(intent.getExtras() == null)
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #322 <Method Bundle Intent.getExtras()>
	//*   5   11:ifnonnull       31
		{
			accesstokencreationcallback.onError(new FacebookException("No extras found on intent"));
	//    6   14:aload_2         
	//    7   15:new             #261 <Class FacebookException>
	//    8   18:dup             
	//    9   19:ldc2            #324 <String "No extras found on intent">
	//   10   22:invokespecial   #266 <Method void FacebookException(String)>
	//   11   25:invokeinterface #328 <Method void AccessToken$AccessTokenCreationCallback.onError(FacebookException)>
			return;
	//   12   30:return          
		}
		intent = ((Intent) (new Bundle(intent.getExtras())));
	//   13   31:new             #221 <Class Bundle>
	//   14   34:dup             
	//   15   35:aload_0         
	//   16   36:invokevirtual   #322 <Method Bundle Intent.getExtras()>
	//   17   39:invokespecial   #331 <Method void Bundle(Bundle)>
	//   18   42:astore_0        
		String s1 = ((Bundle) (intent)).getString("access_token");
	//   19   43:aload_0         
	//   20   44:ldc1            #20  <String "access_token">
	//   21   46:invokevirtual   #225 <Method String Bundle.getString(String)>
	//   22   49:astore_3        
		if(s1 != null && !s1.isEmpty())
	//*  23   50:aload_3         
	//*  24   51:ifnull          126
	//*  25   54:aload_3         
	//*  26   55:invokevirtual   #337 <Method boolean String.isEmpty()>
	//*  27   58:ifeq            64
	//*  28   61:goto            126
		{
			String s2 = ((Bundle) (intent)).getString("user_id");
	//   29   64:aload_0         
	//   30   65:ldc1            #62  <String "user_id">
	//   31   67:invokevirtual   #225 <Method String Bundle.getString(String)>
	//   32   70:astore          4
			if(s2 != null && !s2.isEmpty())
	//*  33   72:aload           4
	//*  34   74:ifnull          111
	//*  35   77:aload           4
	//*  36   79:invokevirtual   #337 <Method boolean String.isEmpty()>
	//*  37   82:ifeq            88
	//*  38   85:goto            111
			{
				accesstokencreationcallback.onSuccess(createFromBundle(((List) (null)), ((Bundle) (intent)), AccessTokenSource.FACEBOOK_APPLICATION_WEB, new Date(), s));
	//   39   88:aload_2         
	//   40   89:aconst_null     
	//   41   90:aload_0         
	//   42   91:getstatic       #96  <Field AccessTokenSource AccessTokenSource.FACEBOOK_APPLICATION_WEB>
	//   43   94:new             #77  <Class Date>
	//   44   97:dup             
	//   45   98:invokespecial   #89  <Method void Date()>
	//   46  101:aload_1         
	//   47  102:invokestatic    #181 <Method AccessToken createFromBundle(List, Bundle, AccessTokenSource, Date, String)>
	//   48  105:invokeinterface #341 <Method void AccessToken$AccessTokenCreationCallback.onSuccess(AccessToken)>
				return;
	//   49  110:return          
			} else
			{
				Utility.getGraphMeRequestWithCacheAsync(s1, new com.facebook.internal.Utility.GraphMeRequestWithCacheCallback(((Bundle) (intent)), accesstokencreationcallback, s) {

					public void onFailure(FacebookException facebookexception)
					{
						accessTokenCallback.onError(facebookexception);
					//    0    0:aload_0         
					//    1    1:getfield        #23  <Field AccessToken$AccessTokenCreationCallback val$accessTokenCallback>
					//    2    4:aload_1         
					//    3    5:invokeinterface #36  <Method void AccessToken$AccessTokenCreationCallback.onError(FacebookException)>
					//    4   10:return          
					}

					public void onSuccess(JSONObject jsonobject)
					{
						try
						{
							jsonobject = ((JSONObject) (jsonobject.getString("id")));
					//    0    0:aload_1         
					//    1    1:ldc1            #42  <String "id">
					//    2    3:invokevirtual   #48  <Method String JSONObject.getString(String)>
					//    3    6:astore_1        
							extras.putString("user_id", ((String) (jsonobject)));
					//    4    7:aload_0         
					//    5    8:getfield        #21  <Field Bundle val$extras>
					//    6   11:ldc1            #50  <String "user_id">
					//    7   13:aload_1         
					//    8   14:invokevirtual   #56  <Method void Bundle.putString(String, String)>
							accessTokenCallback.onSuccess(AccessToken.createFromBundle(((List) (null)), extras, AccessTokenSource.FACEBOOK_APPLICATION_WEB, new Date(), applicationId));
					//    9   17:aload_0         
					//   10   18:getfield        #23  <Field AccessToken$AccessTokenCreationCallback val$accessTokenCallback>
					//   11   21:aconst_null     
					//   12   22:aload_0         
					//   13   23:getfield        #21  <Field Bundle val$extras>
					//   14   26:getstatic       #62  <Field AccessTokenSource AccessTokenSource.FACEBOOK_APPLICATION_WEB>
					//   15   29:new             #64  <Class Date>
					//   16   32:dup             
					//   17   33:invokespecial   #65  <Method void Date()>
					//   18   36:aload_0         
					//   19   37:getfield        #25  <Field String val$applicationId>
					//   20   40:invokestatic    #69  <Method AccessToken AccessToken.access$000(List, Bundle, AccessTokenSource, Date, String)>
					//   21   43:invokeinterface #72  <Method void AccessToken$AccessTokenCreationCallback.onSuccess(AccessToken)>
							return;
					//   22   48:return          
						}
					//*  23   49:aload_0         
					//*  24   50:getfield        #23  <Field AccessToken$AccessTokenCreationCallback val$accessTokenCallback>
					//*  25   53:new             #74  <Class FacebookException>
					//*  26   56:dup             
					//*  27   57:ldc1            #76  <String "Unable to generate access token due to missing user id">
					//*  28   59:invokespecial   #79  <Method void FacebookException(String)>
					//*  29   62:invokeinterface #36  <Method void AccessToken$AccessTokenCreationCallback.onError(FacebookException)>
					//*  30   67:return          
						// Misplaced declaration of an exception variable
						catch(JSONObject jsonobject)
						{
							accessTokenCallback.onError(new FacebookException("Unable to generate access token due to missing user id"));
						}
					//*  31   68:astore_1        
					//*  32   69:goto            49
					}

					final AccessTokenCreationCallback val$accessTokenCallback;
					final String val$applicationId;
					final Bundle val$extras;

			
			{
				extras = bundle;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field Bundle val$extras>
				accessTokenCallback = accesstokencreationcallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field AccessToken$AccessTokenCreationCallback val$accessTokenCallback>
				applicationId = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field String val$applicationId>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
				}
);
	//   50  111:aload_3         
	//   51  112:new             #8   <Class AccessToken$1>
	//   52  115:dup             
	//   53  116:aload_0         
	//   54  117:aload_2         
	//   55  118:aload_1         
	//   56  119:invokespecial   #344 <Method void AccessToken$1(Bundle, AccessToken$AccessTokenCreationCallback, String)>
	//   57  122:invokestatic    #348 <Method void Utility.getGraphMeRequestWithCacheAsync(String, com.facebook.internal.Utility$GraphMeRequestWithCacheCallback)>
				return;
	//   58  125:return          
			}
		} else
		{
			accesstokencreationcallback.onError(new FacebookException("No access token found on intent"));
	//   59  126:aload_2         
	//   60  127:new             #261 <Class FacebookException>
	//   61  130:dup             
	//   62  131:ldc2            #350 <String "No access token found on intent">
	//   63  134:invokespecial   #266 <Method void FacebookException(String)>
	//   64  137:invokeinterface #328 <Method void AccessToken$AccessTokenCreationCallback.onError(FacebookException)>
			return;
	//   65  142:return          
		}
	}

	static AccessToken createFromRefresh(AccessToken accesstoken, Bundle bundle)
	{
		if(accesstoken.source != AccessTokenSource.FACEBOOK_APPLICATION_WEB && accesstoken.source != AccessTokenSource.FACEBOOK_APPLICATION_NATIVE && accesstoken.source != AccessTokenSource.FACEBOOK_APPLICATION_SERVICE)
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field AccessTokenSource source>
	//*   2    4:getstatic       #96  <Field AccessTokenSource AccessTokenSource.FACEBOOK_APPLICATION_WEB>
	//*   3    7:if_acmpeq       70
	//*   4   10:aload_0         
	//*   5   11:getfield        #149 <Field AccessTokenSource source>
	//*   6   14:getstatic       #358 <Field AccessTokenSource AccessTokenSource.FACEBOOK_APPLICATION_NATIVE>
	//*   7   17:if_acmpeq       70
	//*   8   20:aload_0         
	//*   9   21:getfield        #149 <Field AccessTokenSource source>
	//*  10   24:getstatic       #361 <Field AccessTokenSource AccessTokenSource.FACEBOOK_APPLICATION_SERVICE>
	//*  11   27:if_acmpne       33
	//*  12   30:goto            70
		{
			bundle = ((Bundle) (new StringBuilder()));
	//   13   33:new             #187 <Class StringBuilder>
	//   14   36:dup             
	//   15   37:invokespecial   #362 <Method void StringBuilder()>
	//   16   40:astore_1        
			((StringBuilder) (bundle)).append("Invalid token source: ");
	//   17   41:aload_1         
	//   18   42:ldc2            #364 <String "Invalid token source: ">
	//   19   45:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   20   48:pop             
			((StringBuilder) (bundle)).append(((Object) (accesstoken.source)));
	//   21   49:aload_1         
	//   22   50:aload_0         
	//   23   51:getfield        #149 <Field AccessTokenSource source>
	//   24   54:invokevirtual   #367 <Method StringBuilder StringBuilder.append(Object)>
	//   25   57:pop             
			throw new FacebookException(((StringBuilder) (bundle)).toString());
	//   26   58:new             #261 <Class FacebookException>
	//   27   61:dup             
	//   28   62:aload_1         
	//   29   63:invokevirtual   #370 <Method String StringBuilder.toString()>
	//   30   66:invokespecial   #266 <Method void FacebookException(String)>
	//   31   69:athrow          
		}
		Date date = Utility.getBundleLongAsDate(bundle, "expires_in", new Date(0L));
	//   32   70:aload_1         
	//   33   71:ldc1            #46  <String "expires_in">
	//   34   73:new             #77  <Class Date>
	//   35   76:dup             
	//   36   77:lconst_0        
	//   37   78:invokespecial   #83  <Method void Date(long)>
	//   38   81:invokestatic    #231 <Method Date Utility.getBundleLongAsDate(Bundle, String, Date)>
	//   39   84:astore_2        
		String s = bundle.getString("access_token");
	//   40   85:aload_1         
	//   41   86:ldc1            #20  <String "access_token">
	//   42   88:invokevirtual   #225 <Method String Bundle.getString(String)>
	//   43   91:astore_3        
		bundle = ((Bundle) (Utility.getBundleLongAsDate(bundle, "data_access_expiration_time", new Date(0L))));
	//   44   92:aload_1         
	//   45   93:ldc1            #32  <String "data_access_expiration_time">
	//   46   95:new             #77  <Class Date>
	//   47   98:dup             
	//   48   99:lconst_0        
	//   49  100:invokespecial   #83  <Method void Date(long)>
	//   50  103:invokestatic    #231 <Method Date Utility.getBundleLongAsDate(Bundle, String, Date)>
	//   51  106:astore_1        
		if(Utility.isNullOrEmpty(s))
	//*  52  107:aload_3         
	//*  53  108:invokestatic    #235 <Method boolean Utility.isNullOrEmpty(String)>
	//*  54  111:ifeq            116
			return null;
	//   55  114:aconst_null     
	//   56  115:areturn         
		else
			return new AccessToken(s, accesstoken.applicationId, accesstoken.getUserId(), ((Collection) (accesstoken.getPermissions())), ((Collection) (accesstoken.getDeclinedPermissions())), accesstoken.source, date, new Date(), ((Date) (bundle)));
	//   57  116:new             #2   <Class AccessToken>
	//   58  119:dup             
	//   59  120:aload_3         
	//   60  121:aload_0         
	//   61  122:getfield        #153 <Field String applicationId>
	//   62  125:aload_0         
	//   63  126:invokevirtual   #210 <Method String getUserId()>
	//   64  129:aload_0         
	//   65  130:invokevirtual   #214 <Method Set getPermissions()>
	//   66  133:aload_0         
	//   67  134:invokevirtual   #217 <Method Set getDeclinedPermissions()>
	//   68  137:aload_0         
	//   69  138:getfield        #149 <Field AccessTokenSource source>
	//   70  141:aload_2         
	//   71  142:new             #77  <Class Date>
	//   72  145:dup             
	//   73  146:invokespecial   #89  <Method void Date()>
	//   74  149:aload_1         
	//   75  150:invokespecial   #219 <Method void AccessToken(String, String, String, Collection, Collection, AccessTokenSource, Date, Date, Date)>
	//   76  153:areturn         
	}

	static void expireCurrentAccessToken()
	{
		AccessToken accesstoken = AccessTokenManager.getInstance().getCurrentAccessToken();
	//    0    0:invokestatic    #378 <Method AccessTokenManager AccessTokenManager.getInstance()>
	//    1    3:invokevirtual   #382 <Method AccessToken AccessTokenManager.getCurrentAccessToken()>
	//    2    6:astore_0        
		if(accesstoken != null)
	//*   3    7:aload_0         
	//*   4    8:ifnull          18
			setCurrentAccessToken(createExpired(accesstoken));
	//    5   11:aload_0         
	//    6   12:invokestatic    #384 <Method AccessToken createExpired(AccessToken)>
	//    7   15:invokestatic    #387 <Method void setCurrentAccessToken(AccessToken)>
	//    8   18:return          
	}

	public static AccessToken getCurrentAccessToken()
	{
		return AccessTokenManager.getInstance().getCurrentAccessToken();
	//    0    0:invokestatic    #378 <Method AccessTokenManager AccessTokenManager.getInstance()>
	//    1    3:invokevirtual   #382 <Method AccessToken AccessTokenManager.getCurrentAccessToken()>
	//    2    6:areturn         
	}

	static List getPermissionsFromBundle(Bundle bundle, String s)
	{
		bundle = ((Bundle) (bundle.getStringArrayList(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #391 <Method ArrayList Bundle.getStringArrayList(String)>
	//    3    5:astore_0        
		if(bundle == null)
	//*   4    6:aload_0         
	//*   5    7:ifnonnull       14
			return Collections.emptyList();
	//    6   10:invokestatic    #395 <Method List Collections.emptyList()>
	//    7   13:areturn         
		else
			return Collections.unmodifiableList(((List) (new ArrayList(((Collection) (bundle))))));
	//    8   14:new             #114 <Class ArrayList>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:invokespecial   #396 <Method void ArrayList(Collection)>
	//   12   22:invokestatic    #400 <Method List Collections.unmodifiableList(List)>
	//   13   25:areturn         
	}

	public static boolean isCurrentAccessTokenActive()
	{
		AccessToken accesstoken = AccessTokenManager.getInstance().getCurrentAccessToken();
	//    0    0:invokestatic    #378 <Method AccessTokenManager AccessTokenManager.getInstance()>
	//    1    3:invokevirtual   #382 <Method AccessToken AccessTokenManager.getCurrentAccessToken()>
	//    2    6:astore_0        
		return accesstoken != null && !accesstoken.isExpired();
	//    3    7:aload_0         
	//    4    8:ifnull          20
	//    5   11:aload_0         
	//    6   12:invokevirtual   #405 <Method boolean isExpired()>
	//    7   15:ifne            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public static boolean isDataAccessActive()
	{
		AccessToken accesstoken = AccessTokenManager.getInstance().getCurrentAccessToken();
	//    0    0:invokestatic    #378 <Method AccessTokenManager AccessTokenManager.getInstance()>
	//    1    3:invokevirtual   #382 <Method AccessToken AccessTokenManager.getCurrentAccessToken()>
	//    2    6:astore_0        
		return accesstoken != null && !accesstoken.isDataAccessExpired();
	//    3    7:aload_0         
	//    4    8:ifnull          20
	//    5   11:aload_0         
	//    6   12:invokevirtual   #409 <Method boolean isDataAccessExpired()>
	//    7   15:ifne            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public static void refreshCurrentAccessTokenAsync()
	{
		AccessTokenManager.getInstance().refreshCurrentAccessToken(((AccessTokenRefreshCallback) (null)));
	//    0    0:invokestatic    #378 <Method AccessTokenManager AccessTokenManager.getInstance()>
	//    1    3:aconst_null     
	//    2    4:invokevirtual   #414 <Method void AccessTokenManager.refreshCurrentAccessToken(AccessToken$AccessTokenRefreshCallback)>
	//    3    7:return          
	}

	public static void refreshCurrentAccessTokenAsync(AccessTokenRefreshCallback accesstokenrefreshcallback)
	{
		AccessTokenManager.getInstance().refreshCurrentAccessToken(accesstokenrefreshcallback);
	//    0    0:invokestatic    #378 <Method AccessTokenManager AccessTokenManager.getInstance()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #414 <Method void AccessTokenManager.refreshCurrentAccessToken(AccessToken$AccessTokenRefreshCallback)>
	//    3    7:return          
	}

	public static void setCurrentAccessToken(AccessToken accesstoken)
	{
		AccessTokenManager.getInstance().setCurrentAccessToken(accesstoken);
	//    0    0:invokestatic    #378 <Method AccessTokenManager AccessTokenManager.getInstance()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #415 <Method void AccessTokenManager.setCurrentAccessToken(AccessToken)>
	//    3    7:return          
	}

	private String tokenToString()
	{
		if(token == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field String token>
	//*   2    4:ifnonnull       10
			return "null";
	//    3    7:ldc1            #193 <String "null">
	//    4    9:areturn         
		if(FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.INCLUDE_ACCESS_TOKENS))
	//*   5   10:getstatic       #422 <Field LoggingBehavior LoggingBehavior.INCLUDE_ACCESS_TOKENS>
	//*   6   13:invokestatic    #426 <Method boolean FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior)>
	//*   7   16:ifeq            24
			return token;
	//    8   19:aload_0         
	//    9   20:getfield        #143 <Field String token>
	//   10   23:areturn         
		else
			return "ACCESS_TOKEN_REMOVED";
	//   11   24:ldc2            #428 <String "ACCESS_TOKEN_REMOVED">
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
	//*  14   22:getfield        #112 <Field Date expires>
	//*  15   25:aload_1         
	//*  16   26:getfield        #112 <Field Date expires>
	//*  17   29:invokevirtual   #434 <Method boolean Date.equals(Object)>
	//*  18   32:ifeq            166
	//*  19   35:aload_0         
	//*  20   36:getfield        #132 <Field Set permissions>
	//*  21   39:aload_1         
	//*  22   40:getfield        #132 <Field Set permissions>
	//*  23   43:invokeinterface #437 <Method boolean Set.equals(Object)>
	//*  24   48:ifeq            166
	//*  25   51:aload_0         
	//*  26   52:getfield        #137 <Field Set declinedPermissions>
	//*  27   55:aload_1         
	//*  28   56:getfield        #137 <Field Set declinedPermissions>
	//*  29   59:invokeinterface #437 <Method boolean Set.equals(Object)>
	//*  30   64:ifeq            166
	//*  31   67:aload_0         
	//*  32   68:getfield        #143 <Field String token>
	//*  33   71:aload_1         
	//*  34   72:getfield        #143 <Field String token>
	//*  35   75:invokevirtual   #438 <Method boolean String.equals(Object)>
	//*  36   78:ifeq            166
	//*  37   81:aload_0         
	//*  38   82:getfield        #149 <Field AccessTokenSource source>
	//*  39   85:aload_1         
	//*  40   86:getfield        #149 <Field AccessTokenSource source>
	//*  41   89:if_acmpne       166
	//*  42   92:aload_0         
	//*  43   93:getfield        #151 <Field Date lastRefresh>
	//*  44   96:aload_1         
	//*  45   97:getfield        #151 <Field Date lastRefresh>
	//*  46  100:invokevirtual   #434 <Method boolean Date.equals(Object)>
	//*  47  103:ifeq            166
		{
			String s = applicationId;
	//   48  106:aload_0         
	//   49  107:getfield        #153 <Field String applicationId>
	//   50  110:astore_2        
			if((s != null ? s.equals(((Object) (((AccessToken) (obj)).applicationId))) : ((AccessToken) (obj)).applicationId == null) && (userId.equals(((Object) (((AccessToken) (obj)).userId))) && dataAccessExpirationTime.equals(((Object) (((AccessToken) (obj)).dataAccessExpirationTime)))))
	//*  51  111:aload_2         
	//*  52  112:ifnonnull       125
	//*  53  115:aload_1         
	//*  54  116:getfield        #153 <Field String applicationId>
	//*  55  119:ifnonnull       166
	//*  56  122:goto            136
	//*  57  125:aload_2         
	//*  58  126:aload_1         
	//*  59  127:getfield        #153 <Field String applicationId>
	//*  60  130:invokevirtual   #438 <Method boolean String.equals(Object)>
	//*  61  133:ifeq            166
	//*  62  136:aload_0         
	//*  63  137:getfield        #155 <Field String userId>
	//*  64  140:aload_1         
	//*  65  141:getfield        #155 <Field String userId>
	//*  66  144:invokevirtual   #438 <Method boolean String.equals(Object)>
	//*  67  147:ifeq            166
	//*  68  150:aload_0         
	//*  69  151:getfield        #157 <Field Date dataAccessExpirationTime>
	//*  70  154:aload_1         
	//*  71  155:getfield        #157 <Field Date dataAccessExpirationTime>
	//*  72  158:invokevirtual   #434 <Method boolean Date.equals(Object)>
	//*  73  161:ifeq            166
				return true;
	//   74  164:iconst_1        
	//   75  165:ireturn         
		}
		return false;
	//   76  166:iconst_0        
	//   77  167:ireturn         
	}

	public String getApplicationId()
	{
		return applicationId;
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field String applicationId>
	//    2    4:areturn         
	}

	public Date getDataAccessExpirationTime()
	{
		return dataAccessExpirationTime;
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field Date dataAccessExpirationTime>
	//    2    4:areturn         
	}

	public Set getDeclinedPermissions()
	{
		return declinedPermissions;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field Set declinedPermissions>
	//    2    4:areturn         
	}

	public Date getExpires()
	{
		return expires;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field Date expires>
	//    2    4:areturn         
	}

	public Date getLastRefresh()
	{
		return lastRefresh;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field Date lastRefresh>
	//    2    4:areturn         
	}

	public Set getPermissions()
	{
		return permissions;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field Set permissions>
	//    2    4:areturn         
	}

	public AccessTokenSource getSource()
	{
		return source;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field AccessTokenSource source>
	//    2    4:areturn         
	}

	public String getToken()
	{
		return token;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field String token>
	//    2    4:areturn         
	}

	public String getUserId()
	{
		return userId;
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field String userId>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		int j = expires.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field Date expires>
	//    2    4:invokevirtual   #447 <Method int Date.hashCode()>
	//    3    7:istore_2        
		int k = permissions.hashCode();
	//    4    8:aload_0         
	//    5    9:getfield        #132 <Field Set permissions>
	//    6   12:invokeinterface #448 <Method int Set.hashCode()>
	//    7   17:istore_3        
		int l = declinedPermissions.hashCode();
	//    8   18:aload_0         
	//    9   19:getfield        #137 <Field Set declinedPermissions>
	//   10   22:invokeinterface #448 <Method int Set.hashCode()>
	//   11   27:istore          4
		int i1 = token.hashCode();
	//   12   29:aload_0         
	//   13   30:getfield        #143 <Field String token>
	//   14   33:invokevirtual   #449 <Method int String.hashCode()>
	//   15   36:istore          5
		int j1 = source.hashCode();
	//   16   38:aload_0         
	//   17   39:getfield        #149 <Field AccessTokenSource source>
	//   18   42:invokevirtual   #450 <Method int AccessTokenSource.hashCode()>
	//   19   45:istore          6
		int k1 = lastRefresh.hashCode();
	//   20   47:aload_0         
	//   21   48:getfield        #151 <Field Date lastRefresh>
	//   22   51:invokevirtual   #447 <Method int Date.hashCode()>
	//   23   54:istore          7
		String s = applicationId;
	//   24   56:aload_0         
	//   25   57:getfield        #153 <Field String applicationId>
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
	//   33   74:invokevirtual   #449 <Method int String.hashCode()>
	//   34   77:istore_1        
		return ((((((((527 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + i) * 31 + userId.hashCode()) * 31 + dataAccessExpirationTime.hashCode();
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
	//   65  121:getfield        #155 <Field String userId>
	//   66  124:invokevirtual   #449 <Method int String.hashCode()>
	//   67  127:iadd            
	//   68  128:bipush          31
	//   69  130:imul            
	//   70  131:aload_0         
	//   71  132:getfield        #157 <Field Date dataAccessExpirationTime>
	//   72  135:invokevirtual   #447 <Method int Date.hashCode()>
	//   73  138:iadd            
	//   74  139:ireturn         
	}

	public boolean isDataAccessExpired()
	{
		return (new Date()).after(dataAccessExpirationTime);
	//    0    0:new             #77  <Class Date>
	//    1    3:dup             
	//    2    4:invokespecial   #89  <Method void Date()>
	//    3    7:aload_0         
	//    4    8:getfield        #157 <Field Date dataAccessExpirationTime>
	//    5   11:invokevirtual   #454 <Method boolean Date.after(Date)>
	//    6   14:ireturn         
	}

	public boolean isExpired()
	{
		return (new Date()).after(expires);
	//    0    0:new             #77  <Class Date>
	//    1    3:dup             
	//    2    4:invokespecial   #89  <Method void Date()>
	//    3    7:aload_0         
	//    4    8:getfield        #112 <Field Date expires>
	//    5   11:invokevirtual   #454 <Method boolean Date.after(Date)>
	//    6   14:ireturn         
	}

	JSONObject toJSONObject()
		throws JSONException
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #242 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #457 <Method void JSONObject()>
	//    3    7:astore_1        
		jsonobject.put("version", 1);
	//    4    8:aload_1         
	//    5    9:ldc1            #65  <String "version">
	//    6   11:iconst_1        
	//    7   12:invokevirtual   #461 <Method JSONObject JSONObject.put(String, int)>
	//    8   15:pop             
		jsonobject.put("token", ((Object) (token)));
	//    9   16:aload_1         
	//   10   17:ldc1            #59  <String "token">
	//   11   19:aload_0         
	//   12   20:getfield        #143 <Field String token>
	//   13   23:invokevirtual   #464 <Method JSONObject JSONObject.put(String, Object)>
	//   14   26:pop             
		jsonobject.put("expires_at", expires.getTime());
	//   15   27:aload_1         
	//   16   28:ldc1            #43  <String "expires_at">
	//   17   30:aload_0         
	//   18   31:getfield        #112 <Field Date expires>
	//   19   34:invokevirtual   #173 <Method long Date.getTime()>
	//   20   37:invokevirtual   #467 <Method JSONObject JSONObject.put(String, long)>
	//   21   40:pop             
		jsonobject.put("permissions", ((Object) (new JSONArray(((Collection) (permissions))))));
	//   22   41:aload_1         
	//   23   42:ldc1            #53  <String "permissions">
	//   24   44:new             #469 <Class JSONArray>
	//   25   47:dup             
	//   26   48:aload_0         
	//   27   49:getfield        #132 <Field Set permissions>
	//   28   52:invokespecial   #470 <Method void JSONArray(Collection)>
	//   29   55:invokevirtual   #464 <Method JSONObject JSONObject.put(String, Object)>
	//   30   58:pop             
		jsonobject.put("declined_permissions", ((Object) (new JSONArray(((Collection) (declinedPermissions))))));
	//   31   59:aload_1         
	//   32   60:ldc1            #35  <String "declined_permissions">
	//   33   62:new             #469 <Class JSONArray>
	//   34   65:dup             
	//   35   66:aload_0         
	//   36   67:getfield        #137 <Field Set declinedPermissions>
	//   37   70:invokespecial   #470 <Method void JSONArray(Collection)>
	//   38   73:invokevirtual   #464 <Method JSONObject JSONObject.put(String, Object)>
	//   39   76:pop             
		jsonobject.put("last_refresh", lastRefresh.getTime());
	//   40   77:aload_1         
	//   41   78:ldc1            #49  <String "last_refresh">
	//   42   80:aload_0         
	//   43   81:getfield        #151 <Field Date lastRefresh>
	//   44   84:invokevirtual   #173 <Method long Date.getTime()>
	//   45   87:invokevirtual   #467 <Method JSONObject JSONObject.put(String, long)>
	//   46   90:pop             
		jsonobject.put("source", ((Object) (source.name())));
	//   47   91:aload_1         
	//   48   92:ldc1            #56  <String "source">
	//   49   94:aload_0         
	//   50   95:getfield        #149 <Field AccessTokenSource source>
	//   51   98:invokevirtual   #473 <Method String AccessTokenSource.name()>
	//   52  101:invokevirtual   #464 <Method JSONObject JSONObject.put(String, Object)>
	//   53  104:pop             
		jsonobject.put("application_id", ((Object) (applicationId)));
	//   54  105:aload_1         
	//   55  106:ldc1            #23  <String "application_id">
	//   56  108:aload_0         
	//   57  109:getfield        #153 <Field String applicationId>
	//   58  112:invokevirtual   #464 <Method JSONObject JSONObject.put(String, Object)>
	//   59  115:pop             
		jsonobject.put("user_id", ((Object) (userId)));
	//   60  116:aload_1         
	//   61  117:ldc1            #62  <String "user_id">
	//   62  119:aload_0         
	//   63  120:getfield        #155 <Field String userId>
	//   64  123:invokevirtual   #464 <Method JSONObject JSONObject.put(String, Object)>
	//   65  126:pop             
		jsonobject.put("data_access_expiration_time", dataAccessExpirationTime.getTime());
	//   66  127:aload_1         
	//   67  128:ldc1            #32  <String "data_access_expiration_time">
	//   68  130:aload_0         
	//   69  131:getfield        #157 <Field Date dataAccessExpirationTime>
	//   70  134:invokevirtual   #173 <Method long Date.getTime()>
	//   71  137:invokevirtual   #467 <Method JSONObject JSONObject.put(String, long)>
	//   72  140:pop             
		return jsonobject;
	//   73  141:aload_1         
	//   74  142:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #187 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #362 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("{AccessToken");
	//    4    8:aload_1         
	//    5    9:ldc2            #475 <String "{AccessToken">
	//    6   12:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(" token:");
	//    8   16:aload_1         
	//    9   17:ldc2            #477 <String " token:">
	//   10   20:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		stringbuilder.append(tokenToString());
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:invokespecial   #479 <Method String tokenToString()>
	//   15   29:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		appendPermissions(stringbuilder);
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:invokespecial   #481 <Method void appendPermissions(StringBuilder)>
		stringbuilder.append("}");
	//   20   38:aload_1         
	//   21   39:ldc2            #483 <String "}">
	//   22   42:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
		return stringbuilder.toString();
	//   24   46:aload_1         
	//   25   47:invokevirtual   #370 <Method String StringBuilder.toString()>
	//   26   50:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeLong(expires.getTime());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #112 <Field Date expires>
	//    3    5:invokevirtual   #173 <Method long Date.getTime()>
	//    4    8:invokevirtual   #488 <Method void Parcel.writeLong(long)>
		parcel.writeStringList(((List) (new ArrayList(((Collection) (permissions))))));
	//    5   11:aload_1         
	//    6   12:new             #114 <Class ArrayList>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:getfield        #132 <Field Set permissions>
	//   10   20:invokespecial   #396 <Method void ArrayList(Collection)>
	//   11   23:invokevirtual   #491 <Method void Parcel.writeStringList(List)>
		parcel.writeStringList(((List) (new ArrayList(((Collection) (declinedPermissions))))));
	//   12   26:aload_1         
	//   13   27:new             #114 <Class ArrayList>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:getfield        #137 <Field Set declinedPermissions>
	//   17   35:invokespecial   #396 <Method void ArrayList(Collection)>
	//   18   38:invokevirtual   #491 <Method void Parcel.writeStringList(List)>
		parcel.writeString(token);
	//   19   41:aload_1         
	//   20   42:aload_0         
	//   21   43:getfield        #143 <Field String token>
	//   22   46:invokevirtual   #494 <Method void Parcel.writeString(String)>
		parcel.writeString(source.name());
	//   23   49:aload_1         
	//   24   50:aload_0         
	//   25   51:getfield        #149 <Field AccessTokenSource source>
	//   26   54:invokevirtual   #473 <Method String AccessTokenSource.name()>
	//   27   57:invokevirtual   #494 <Method void Parcel.writeString(String)>
		parcel.writeLong(lastRefresh.getTime());
	//   28   60:aload_1         
	//   29   61:aload_0         
	//   30   62:getfield        #151 <Field Date lastRefresh>
	//   31   65:invokevirtual   #173 <Method long Date.getTime()>
	//   32   68:invokevirtual   #488 <Method void Parcel.writeLong(long)>
		parcel.writeString(applicationId);
	//   33   71:aload_1         
	//   34   72:aload_0         
	//   35   73:getfield        #153 <Field String applicationId>
	//   36   76:invokevirtual   #494 <Method void Parcel.writeString(String)>
		parcel.writeString(userId);
	//   37   79:aload_1         
	//   38   80:aload_0         
	//   39   81:getfield        #155 <Field String userId>
	//   40   84:invokevirtual   #494 <Method void Parcel.writeString(String)>
		parcel.writeLong(dataAccessExpirationTime.getTime());
	//   41   87:aload_1         
	//   42   88:aload_0         
	//   43   89:getfield        #157 <Field Date dataAccessExpirationTime>
	//   44   92:invokevirtual   #173 <Method long Date.getTime()>
	//   45   95:invokevirtual   #488 <Method void Parcel.writeLong(long)>
	//   46   98:return          
	}

	public static final String ACCESS_TOKEN_KEY = "access_token";
	private static final String APPLICATION_ID_KEY = "application_id";
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
	private static final int CURRENT_JSON_FORMAT = 1;
	public static final String DATA_ACCESS_EXPIRATION_TIME = "data_access_expiration_time";
	private static final String DECLINED_PERMISSIONS_KEY = "declined_permissions";
	private static final AccessTokenSource DEFAULT_ACCESS_TOKEN_SOURCE;
	private static final Date DEFAULT_EXPIRATION_TIME;
	private static final Date DEFAULT_LAST_REFRESH_TIME = new Date();
	private static final String EXPIRES_AT_KEY = "expires_at";
	public static final String EXPIRES_IN_KEY = "expires_in";
	private static final String LAST_REFRESH_KEY = "last_refresh";
	private static final Date MAX_DATE;
	private static final String PERMISSIONS_KEY = "permissions";
	private static final String SOURCE_KEY = "source";
	private static final String TOKEN_KEY = "token";
	public static final String USER_ID_KEY = "user_id";
	private static final String VERSION_KEY = "version";
	private final String applicationId;
	private final Date dataAccessExpirationTime;
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
	//    0    0:new             #77  <Class Date>
	//    1    3:dup             
	//    2    4:ldc2w           #78  <Long 0xffffffffL>
	//    3    7:invokespecial   #83  <Method void Date(long)>
	//    4   10:putstatic       #85  <Field Date MAX_DATE>
		DEFAULT_EXPIRATION_TIME = MAX_DATE;
	//    5   13:getstatic       #85  <Field Date MAX_DATE>
	//    6   16:putstatic       #87  <Field Date DEFAULT_EXPIRATION_TIME>
	//    7   19:new             #77  <Class Date>
	//    8   22:dup             
	//    9   23:invokespecial   #89  <Method void Date()>
	//   10   26:putstatic       #91  <Field Date DEFAULT_LAST_REFRESH_TIME>
		DEFAULT_ACCESS_TOKEN_SOURCE = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
	//   11   29:getstatic       #96  <Field AccessTokenSource AccessTokenSource.FACEBOOK_APPLICATION_WEB>
	//   12   32:putstatic       #98  <Field AccessTokenSource DEFAULT_ACCESS_TOKEN_SOURCE>
	//   13   35:new             #10  <Class AccessToken$2>
	//   14   38:dup             
	//   15   39:invokespecial   #99  <Method void AccessToken$2()>
	//   16   42:putstatic       #101 <Field android.os.Parcelable$Creator CREATOR>
	//*  17   45:return          
	}


/*
	static AccessToken access$000(List list, Bundle bundle, AccessTokenSource accesstokensource, Date date, String s)
	{
		return createFromBundle(list, bundle, accesstokensource, date, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokestatic    #181 <Method AccessToken createFromBundle(List, Bundle, AccessTokenSource, Date, String)>
	//    6    9:areturn         
	}

*/
}
