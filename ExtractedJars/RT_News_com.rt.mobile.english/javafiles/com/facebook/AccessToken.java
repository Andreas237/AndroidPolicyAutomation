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


	AccessToken(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #97  <Method void Object()>
		expires = new Date(parcel.readLong());
	//    2    4:aload_0         
	//    3    5:new             #70  <Class Date>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokevirtual   #103 <Method long Parcel.readLong()>
	//    7   13:invokespecial   #76  <Method void Date(long)>
	//    8   16:putfield        #105 <Field Date expires>
		ArrayList arraylist = new ArrayList();
	//    9   19:new             #107 <Class ArrayList>
	//   10   22:dup             
	//   11   23:invokespecial   #108 <Method void ArrayList()>
	//   12   26:astore_2        
		parcel.readStringList(((List) (arraylist)));
	//   13   27:aload_1         
	//   14   28:aload_2         
	//   15   29:invokevirtual   #112 <Method void Parcel.readStringList(List)>
		permissions = Collections.unmodifiableSet(((Set) (new HashSet(((Collection) (arraylist))))));
	//   16   32:aload_0         
	//   17   33:new             #114 <Class HashSet>
	//   18   36:dup             
	//   19   37:aload_2         
	//   20   38:invokespecial   #117 <Method void HashSet(Collection)>
	//   21   41:invokestatic    #123 <Method Set Collections.unmodifiableSet(Set)>
	//   22   44:putfield        #125 <Field Set permissions>
		arraylist.clear();
	//   23   47:aload_2         
	//   24   48:invokevirtual   #128 <Method void ArrayList.clear()>
		parcel.readStringList(((List) (arraylist)));
	//   25   51:aload_1         
	//   26   52:aload_2         
	//   27   53:invokevirtual   #112 <Method void Parcel.readStringList(List)>
		declinedPermissions = Collections.unmodifiableSet(((Set) (new HashSet(((Collection) (arraylist))))));
	//   28   56:aload_0         
	//   29   57:new             #114 <Class HashSet>
	//   30   60:dup             
	//   31   61:aload_2         
	//   32   62:invokespecial   #117 <Method void HashSet(Collection)>
	//   33   65:invokestatic    #123 <Method Set Collections.unmodifiableSet(Set)>
	//   34   68:putfield        #130 <Field Set declinedPermissions>
		token = parcel.readString();
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:invokevirtual   #134 <Method String Parcel.readString()>
	//   38   76:putfield        #136 <Field String token>
		source = AccessTokenSource.valueOf(parcel.readString());
	//   39   79:aload_0         
	//   40   80:aload_1         
	//   41   81:invokevirtual   #134 <Method String Parcel.readString()>
	//   42   84:invokestatic    #140 <Method AccessTokenSource AccessTokenSource.valueOf(String)>
	//   43   87:putfield        #142 <Field AccessTokenSource source>
		lastRefresh = new Date(parcel.readLong());
	//   44   90:aload_0         
	//   45   91:new             #70  <Class Date>
	//   46   94:dup             
	//   47   95:aload_1         
	//   48   96:invokevirtual   #103 <Method long Parcel.readLong()>
	//   49   99:invokespecial   #76  <Method void Date(long)>
	//   50  102:putfield        #144 <Field Date lastRefresh>
		applicationId = parcel.readString();
	//   51  105:aload_0         
	//   52  106:aload_1         
	//   53  107:invokevirtual   #134 <Method String Parcel.readString()>
	//   54  110:putfield        #146 <Field String applicationId>
		userId = parcel.readString();
	//   55  113:aload_0         
	//   56  114:aload_1         
	//   57  115:invokevirtual   #134 <Method String Parcel.readString()>
	//   58  118:putfield        #148 <Field String userId>
	//   59  121:return          
	}

	public AccessToken(String s, String s1, String s2, Collection collection, Collection collection1, AccessTokenSource accesstokensource, Date date, 
			Date date1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #97  <Method void Object()>
		Validate.notNullOrEmpty(s, "accessToken");
	//    2    4:aload_1         
	//    3    5:ldc1            #152 <String "accessToken">
	//    4    7:invokestatic    #158 <Method void Validate.notNullOrEmpty(String, String)>
		Validate.notNullOrEmpty(s1, "applicationId");
	//    5   10:aload_2         
	//    6   11:ldc1            #159 <String "applicationId">
	//    7   13:invokestatic    #158 <Method void Validate.notNullOrEmpty(String, String)>
		Validate.notNullOrEmpty(s2, "userId");
	//    8   16:aload_3         
	//    9   17:ldc1            #160 <String "userId">
	//   10   19:invokestatic    #158 <Method void Validate.notNullOrEmpty(String, String)>
		if(date == null)
	//*  11   22:aload           7
	//*  12   24:ifnull          30
	//*  13   27:goto            35
			date = DEFAULT_EXPIRATION_TIME;
	//   14   30:getstatic       #80  <Field Date DEFAULT_EXPIRATION_TIME>
	//   15   33:astore          7
		expires = date;
	//   16   35:aload_0         
	//   17   36:aload           7
	//   18   38:putfield        #105 <Field Date expires>
		if(collection != null)
	//*  19   41:aload           4
	//*  20   43:ifnull          60
			collection = ((Collection) (new HashSet(collection)));
	//   21   46:new             #114 <Class HashSet>
	//   22   49:dup             
	//   23   50:aload           4
	//   24   52:invokespecial   #117 <Method void HashSet(Collection)>
	//   25   55:astore          4
		else
	//*  26   57:goto            69
			collection = ((Collection) (new HashSet()));
	//   27   60:new             #114 <Class HashSet>
	//   28   63:dup             
	//   29   64:invokespecial   #161 <Method void HashSet()>
	//   30   67:astore          4
		permissions = Collections.unmodifiableSet(((Set) (collection)));
	//   31   69:aload_0         
	//   32   70:aload           4
	//   33   72:invokestatic    #123 <Method Set Collections.unmodifiableSet(Set)>
	//   34   75:putfield        #125 <Field Set permissions>
		if(collection1 != null)
	//*  35   78:aload           5
	//*  36   80:ifnull          97
			collection = ((Collection) (new HashSet(collection1)));
	//   37   83:new             #114 <Class HashSet>
	//   38   86:dup             
	//   39   87:aload           5
	//   40   89:invokespecial   #117 <Method void HashSet(Collection)>
	//   41   92:astore          4
		else
	//*  42   94:goto            106
			collection = ((Collection) (new HashSet()));
	//   43   97:new             #114 <Class HashSet>
	//   44  100:dup             
	//   45  101:invokespecial   #161 <Method void HashSet()>
	//   46  104:astore          4
		declinedPermissions = Collections.unmodifiableSet(((Set) (collection)));
	//   47  106:aload_0         
	//   48  107:aload           4
	//   49  109:invokestatic    #123 <Method Set Collections.unmodifiableSet(Set)>
	//   50  112:putfield        #130 <Field Set declinedPermissions>
		token = s;
	//   51  115:aload_0         
	//   52  116:aload_1         
	//   53  117:putfield        #136 <Field String token>
		if(accesstokensource == null)
	//*  54  120:aload           6
	//*  55  122:ifnull          128
	//*  56  125:goto            133
			accesstokensource = DEFAULT_ACCESS_TOKEN_SOURCE;
	//   57  128:getstatic       #91  <Field AccessTokenSource DEFAULT_ACCESS_TOKEN_SOURCE>
	//   58  131:astore          6
		source = accesstokensource;
	//   59  133:aload_0         
	//   60  134:aload           6
	//   61  136:putfield        #142 <Field AccessTokenSource source>
		if(date1 == null)
	//*  62  139:aload           8
	//*  63  141:ifnull          147
	//*  64  144:goto            152
			date1 = DEFAULT_LAST_REFRESH_TIME;
	//   65  147:getstatic       #84  <Field Date DEFAULT_LAST_REFRESH_TIME>
	//   66  150:astore          8
		lastRefresh = date1;
	//   67  152:aload_0         
	//   68  153:aload           8
	//   69  155:putfield        #144 <Field Date lastRefresh>
		applicationId = s1;
	//   70  158:aload_0         
	//   71  159:aload_2         
	//   72  160:putfield        #146 <Field String applicationId>
		userId = s2;
	//   73  163:aload_0         
	//   74  164:aload_3         
	//   75  165:putfield        #148 <Field String userId>
	//   76  168:return          
	}

	private void appendPermissions(StringBuilder stringbuilder)
	{
		stringbuilder.append(" permissions:");
	//    0    0:aload_1         
	//    1    1:ldc1            #173 <String " permissions:">
	//    2    3:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//    3    6:pop             
		if(permissions == null)
	//*   4    7:aload_0         
	//*   5    8:getfield        #125 <Field Set permissions>
	//*   6   11:ifnonnull       22
		{
			stringbuilder.append("null");
	//    7   14:aload_1         
	//    8   15:ldc1            #181 <String "null">
	//    9   17:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
			return;
	//   11   21:return          
		} else
		{
			stringbuilder.append("[");
	//   12   22:aload_1         
	//   13   23:ldc1            #183 <String "[">
	//   14   25:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//   15   28:pop             
			stringbuilder.append(TextUtils.join(", ", ((Iterable) (permissions))));
	//   16   29:aload_1         
	//   17   30:ldc1            #185 <String ", ">
	//   18   32:aload_0         
	//   19   33:getfield        #125 <Field Set permissions>
	//   20   36:invokestatic    #191 <Method String TextUtils.join(CharSequence, Iterable)>
	//   21   39:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
			stringbuilder.append("]");
	//   23   43:aload_1         
	//   24   44:ldc1            #193 <String "]">
	//   25   46:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
			return;
	//   27   50:return          
		}
	}

	private static AccessToken createFromBundle(List list, Bundle bundle, AccessTokenSource accesstokensource, Date date, String s)
	{
		String s1 = bundle.getString("access_token");
	//    0    0:aload_1         
	//    1    1:ldc1            #17  <String "access_token">
	//    2    3:invokevirtual   #199 <Method String Bundle.getString(String)>
	//    3    6:astore          5
		date = Utility.getBundleLongAsDate(bundle, "expires_in", date);
	//    4    8:aload_1         
	//    5    9:ldc1            #40  <String "expires_in">
	//    6   11:aload_3         
	//    7   12:invokestatic    #205 <Method Date Utility.getBundleLongAsDate(Bundle, String, Date)>
	//    8   15:astore_3        
		bundle = ((Bundle) (bundle.getString("user_id")));
	//    9   16:aload_1         
	//   10   17:ldc1            #56  <String "user_id">
	//   11   19:invokevirtual   #199 <Method String Bundle.getString(String)>
	//   12   22:astore_1        
		if(!Utility.isNullOrEmpty(s1) && date != null)
	//*  13   23:aload           5
	//*  14   25:invokestatic    #209 <Method boolean Utility.isNullOrEmpty(String)>
	//*  15   28:ifne            62
	//*  16   31:aload_3         
	//*  17   32:ifnonnull       38
	//*  18   35:goto            62
			return new AccessToken(s1, s, ((String) (bundle)), ((Collection) (list)), ((Collection) (null)), accesstokensource, date, new Date());
	//   19   38:new             #2   <Class AccessToken>
	//   20   41:dup             
	//   21   42:aload           5
	//   22   44:aload           4
	//   23   46:aload_1         
	//   24   47:aload_0         
	//   25   48:aconst_null     
	//   26   49:aload_2         
	//   27   50:aload_3         
	//   28   51:new             #70  <Class Date>
	//   29   54:dup             
	//   30   55:invokespecial   #82  <Method void Date()>
	//   31   58:invokespecial   #211 <Method void AccessToken(String, String, String, Collection, Collection, AccessTokenSource, Date, Date)>
	//   32   61:areturn         
		else
			return null;
	//   33   62:aconst_null     
	//   34   63:areturn         
	}

	static AccessToken createFromJSONObject(JSONObject jsonobject)
		throws JSONException
	{
		if(jsonobject.getInt("version") > 1)
	//*   0    0:aload_0         
	//*   1    1:ldc1            #59  <String "version">
	//*   2    3:invokevirtual   #222 <Method int JSONObject.getInt(String)>
	//*   3    6:iconst_1        
	//*   4    7:icmple          20
		{
			throw new FacebookException("Unknown AccessToken serialization format.");
	//    5   10:new             #224 <Class FacebookException>
	//    6   13:dup             
	//    7   14:ldc1            #226 <String "Unknown AccessToken serialization format.">
	//    8   16:invokespecial   #229 <Method void FacebookException(String)>
	//    9   19:athrow          
		} else
		{
			String s = jsonobject.getString("token");
	//   10   20:aload_0         
	//   11   21:ldc1            #53  <String "token">
	//   12   23:invokevirtual   #230 <Method String JSONObject.getString(String)>
	//   13   26:astore_1        
			Date date = new Date(jsonobject.getLong("expires_at"));
	//   14   27:new             #70  <Class Date>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:ldc1            #37  <String "expires_at">
	//   18   34:invokevirtual   #234 <Method long JSONObject.getLong(String)>
	//   19   37:invokespecial   #76  <Method void Date(long)>
	//   20   40:astore_2        
			JSONArray jsonarray = jsonobject.getJSONArray("permissions");
	//   21   41:aload_0         
	//   22   42:ldc1            #47  <String "permissions">
	//   23   44:invokevirtual   #238 <Method JSONArray JSONObject.getJSONArray(String)>
	//   24   47:astore_3        
			JSONArray jsonarray1 = jsonobject.getJSONArray("declined_permissions");
	//   25   48:aload_0         
	//   26   49:ldc1            #29  <String "declined_permissions">
	//   27   51:invokevirtual   #238 <Method JSONArray JSONObject.getJSONArray(String)>
	//   28   54:astore          4
			Date date1 = new Date(jsonobject.getLong("last_refresh"));
	//   29   56:new             #70  <Class Date>
	//   30   59:dup             
	//   31   60:aload_0         
	//   32   61:ldc1            #43  <String "last_refresh">
	//   33   63:invokevirtual   #234 <Method long JSONObject.getLong(String)>
	//   34   66:invokespecial   #76  <Method void Date(long)>
	//   35   69:astore          5
			AccessTokenSource accesstokensource = AccessTokenSource.valueOf(jsonobject.getString("source"));
	//   36   71:aload_0         
	//   37   72:ldc1            #50  <String "source">
	//   38   74:invokevirtual   #230 <Method String JSONObject.getString(String)>
	//   39   77:invokestatic    #140 <Method AccessTokenSource AccessTokenSource.valueOf(String)>
	//   40   80:astore          6
			return new AccessToken(s, jsonobject.getString("application_id"), jsonobject.getString("user_id"), ((Collection) (Utility.jsonArrayToStringList(jsonarray))), ((Collection) (Utility.jsonArrayToStringList(jsonarray1))), accesstokensource, date, date1);
	//   41   82:new             #2   <Class AccessToken>
	//   42   85:dup             
	//   43   86:aload_1         
	//   44   87:aload_0         
	//   45   88:ldc1            #20  <String "application_id">
	//   46   90:invokevirtual   #230 <Method String JSONObject.getString(String)>
	//   47   93:aload_0         
	//   48   94:ldc1            #56  <String "user_id">
	//   49   96:invokevirtual   #230 <Method String JSONObject.getString(String)>
	//   50   99:aload_3         
	//   51  100:invokestatic    #242 <Method List Utility.jsonArrayToStringList(JSONArray)>
	//   52  103:aload           4
	//   53  105:invokestatic    #242 <Method List Utility.jsonArrayToStringList(JSONArray)>
	//   54  108:aload           6
	//   55  110:aload_2         
	//   56  111:aload           5
	//   57  113:invokespecial   #211 <Method void AccessToken(String, String, String, Collection, Collection, AccessTokenSource, Date, Date)>
	//   58  116:areturn         
		}
	}

	static AccessToken createFromLegacyCache(Bundle bundle)
	{
		List list = getPermissionsFromBundle(bundle, "com.facebook.TokenCachingStrategy.Permissions");
	//    0    0:aload_0         
	//    1    1:ldc1            #247 <String "com.facebook.TokenCachingStrategy.Permissions">
	//    2    3:invokestatic    #251 <Method List getPermissionsFromBundle(Bundle, String)>
	//    3    6:astore_3        
		List list1 = getPermissionsFromBundle(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
	//    4    7:aload_0         
	//    5    8:ldc1            #253 <String "com.facebook.TokenCachingStrategy.DeclinedPermissions">
	//    6   10:invokestatic    #251 <Method List getPermissionsFromBundle(Bundle, String)>
	//    7   13:astore          4
		String s1 = LegacyTokenHelper.getApplicationId(bundle);
	//    8   15:aload_0         
	//    9   16:invokestatic    #259 <Method String LegacyTokenHelper.getApplicationId(Bundle)>
	//   10   19:astore_2        
		String s = s1;
	//   11   20:aload_2         
	//   12   21:astore_1        
		if(Utility.isNullOrEmpty(s1))
	//*  13   22:aload_2         
	//*  14   23:invokestatic    #209 <Method boolean Utility.isNullOrEmpty(String)>
	//*  15   26:ifeq            33
			s = FacebookSdk.getApplicationId();
	//   16   29:invokestatic    #263 <Method String FacebookSdk.getApplicationId()>
	//   17   32:astore_1        
		s1 = LegacyTokenHelper.getToken(bundle);
	//   18   33:aload_0         
	//   19   34:invokestatic    #266 <Method String LegacyTokenHelper.getToken(Bundle)>
	//   20   37:astore_2        
		Object obj = ((Object) (Utility.awaitGetGraphMeRequestWithCache(s1)));
	//   21   38:aload_2         
	//   22   39:invokestatic    #270 <Method JSONObject Utility.awaitGetGraphMeRequestWithCache(String)>
	//   23   42:astore          5
		try
		{
			obj = ((Object) (((JSONObject) (obj)).getString("id")));
	//   24   44:aload           5
	//   25   46:ldc2            #272 <String "id">
	//   26   49:invokevirtual   #230 <Method String JSONObject.getString(String)>
	//   27   52:astore          5
		}
	//*  28   54:new             #2   <Class AccessToken>
	//*  29   57:dup             
	//*  30   58:aload_2         
	//*  31   59:aload_1         
	//*  32   60:aload           5
	//*  33   62:aload_3         
	//*  34   63:aload           4
	//*  35   65:aload_0         
	//*  36   66:invokestatic    #276 <Method AccessTokenSource LegacyTokenHelper.getSource(Bundle)>
	//*  37   69:aload_0         
	//*  38   70:ldc2            #278 <String "com.facebook.TokenCachingStrategy.ExpirationDate">
	//*  39   73:invokestatic    #282 <Method Date LegacyTokenHelper.getDate(Bundle, String)>
	//*  40   76:aload_0         
	//*  41   77:ldc2            #284 <String "com.facebook.TokenCachingStrategy.LastRefreshDate">
	//*  42   80:invokestatic    #282 <Method Date LegacyTokenHelper.getDate(Bundle, String)>
	//*  43   83:invokespecial   #211 <Method void AccessToken(String, String, String, Collection, Collection, AccessTokenSource, Date, Date)>
	//*  44   86:areturn         
	//*  45   87:aconst_null     
	//*  46   88:areturn         
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
		{
			return null;
		}
		return new AccessToken(s1, s, ((String) (obj)), ((Collection) (list)), ((Collection) (list1)), LegacyTokenHelper.getSource(bundle), LegacyTokenHelper.getDate(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate"), LegacyTokenHelper.getDate(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"));
	//*  47   89:astore_0        
	//*  48   90:goto            87
	}

	public static void createFromNativeLinkingIntent(Intent intent, String s, AccessTokenCreationCallback accesstokencreationcallback)
	{
		Validate.notNull(((Object) (intent)), "intent");
	//    0    0:aload_0         
	//    1    1:ldc2            #288 <String "intent">
	//    2    4:invokestatic    #292 <Method void Validate.notNull(Object, String)>
		if(intent.getExtras() == null)
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #298 <Method Bundle Intent.getExtras()>
	//*   5   11:ifnonnull       31
		{
			accesstokencreationcallback.onError(new FacebookException("No extras found on intent"));
	//    6   14:aload_2         
	//    7   15:new             #224 <Class FacebookException>
	//    8   18:dup             
	//    9   19:ldc2            #300 <String "No extras found on intent">
	//   10   22:invokespecial   #229 <Method void FacebookException(String)>
	//   11   25:invokeinterface #304 <Method void AccessToken$AccessTokenCreationCallback.onError(FacebookException)>
			return;
	//   12   30:return          
		}
		intent = ((Intent) (new Bundle(intent.getExtras())));
	//   13   31:new             #195 <Class Bundle>
	//   14   34:dup             
	//   15   35:aload_0         
	//   16   36:invokevirtual   #298 <Method Bundle Intent.getExtras()>
	//   17   39:invokespecial   #307 <Method void Bundle(Bundle)>
	//   18   42:astore_0        
		String s1 = ((Bundle) (intent)).getString("access_token");
	//   19   43:aload_0         
	//   20   44:ldc1            #17  <String "access_token">
	//   21   46:invokevirtual   #199 <Method String Bundle.getString(String)>
	//   22   49:astore_3        
		if(s1 != null && !s1.isEmpty())
	//*  23   50:aload_3         
	//*  24   51:ifnull          126
	//*  25   54:aload_3         
	//*  26   55:invokevirtual   #313 <Method boolean String.isEmpty()>
	//*  27   58:ifeq            64
	//*  28   61:goto            126
		{
			String s2 = ((Bundle) (intent)).getString("user_id");
	//   29   64:aload_0         
	//   30   65:ldc1            #56  <String "user_id">
	//   31   67:invokevirtual   #199 <Method String Bundle.getString(String)>
	//   32   70:astore          4
			if(s2 != null && !s2.isEmpty())
	//*  33   72:aload           4
	//*  34   74:ifnull          111
	//*  35   77:aload           4
	//*  36   79:invokevirtual   #313 <Method boolean String.isEmpty()>
	//*  37   82:ifeq            88
	//*  38   85:goto            111
			{
				accesstokencreationcallback.onSuccess(createFromBundle(((List) (null)), ((Bundle) (intent)), AccessTokenSource.FACEBOOK_APPLICATION_WEB, new Date(), s));
	//   39   88:aload_2         
	//   40   89:aconst_null     
	//   41   90:aload_0         
	//   42   91:getstatic       #89  <Field AccessTokenSource AccessTokenSource.FACEBOOK_APPLICATION_WEB>
	//   43   94:new             #70  <Class Date>
	//   44   97:dup             
	//   45   98:invokespecial   #82  <Method void Date()>
	//   46  101:aload_1         
	//   47  102:invokestatic    #169 <Method AccessToken createFromBundle(List, Bundle, AccessTokenSource, Date, String)>
	//   48  105:invokeinterface #317 <Method void AccessToken$AccessTokenCreationCallback.onSuccess(AccessToken)>
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
	//   56  119:invokespecial   #320 <Method void AccessToken$1(Bundle, AccessToken$AccessTokenCreationCallback, String)>
	//   57  122:invokestatic    #324 <Method void Utility.getGraphMeRequestWithCacheAsync(String, com.facebook.internal.Utility$GraphMeRequestWithCacheCallback)>
				return;
	//   58  125:return          
			}
		} else
		{
			accesstokencreationcallback.onError(new FacebookException("No access token found on intent"));
	//   59  126:aload_2         
	//   60  127:new             #224 <Class FacebookException>
	//   61  130:dup             
	//   62  131:ldc2            #326 <String "No access token found on intent">
	//   63  134:invokespecial   #229 <Method void FacebookException(String)>
	//   64  137:invokeinterface #304 <Method void AccessToken$AccessTokenCreationCallback.onError(FacebookException)>
			return;
	//   65  142:return          
		}
	}

	static AccessToken createFromRefresh(AccessToken accesstoken, Bundle bundle)
	{
		if(accesstoken.source != AccessTokenSource.FACEBOOK_APPLICATION_WEB && accesstoken.source != AccessTokenSource.FACEBOOK_APPLICATION_NATIVE && accesstoken.source != AccessTokenSource.FACEBOOK_APPLICATION_SERVICE)
	//*   0    0:aload_0         
	//*   1    1:getfield        #142 <Field AccessTokenSource source>
	//*   2    4:getstatic       #89  <Field AccessTokenSource AccessTokenSource.FACEBOOK_APPLICATION_WEB>
	//*   3    7:if_acmpeq       67
	//*   4   10:aload_0         
	//*   5   11:getfield        #142 <Field AccessTokenSource source>
	//*   6   14:getstatic       #334 <Field AccessTokenSource AccessTokenSource.FACEBOOK_APPLICATION_NATIVE>
	//*   7   17:if_acmpeq       67
	//*   8   20:aload_0         
	//*   9   21:getfield        #142 <Field AccessTokenSource source>
	//*  10   24:getstatic       #337 <Field AccessTokenSource AccessTokenSource.FACEBOOK_APPLICATION_SERVICE>
	//*  11   27:if_acmpeq       67
		{
			bundle = ((Bundle) (new StringBuilder()));
	//   12   30:new             #175 <Class StringBuilder>
	//   13   33:dup             
	//   14   34:invokespecial   #338 <Method void StringBuilder()>
	//   15   37:astore_1        
			((StringBuilder) (bundle)).append("Invalid token source: ");
	//   16   38:aload_1         
	//   17   39:ldc2            #340 <String "Invalid token source: ">
	//   18   42:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//   19   45:pop             
			((StringBuilder) (bundle)).append(((Object) (accesstoken.source)));
	//   20   46:aload_1         
	//   21   47:aload_0         
	//   22   48:getfield        #142 <Field AccessTokenSource source>
	//   23   51:invokevirtual   #343 <Method StringBuilder StringBuilder.append(Object)>
	//   24   54:pop             
			throw new FacebookException(((StringBuilder) (bundle)).toString());
	//   25   55:new             #224 <Class FacebookException>
	//   26   58:dup             
	//   27   59:aload_1         
	//   28   60:invokevirtual   #346 <Method String StringBuilder.toString()>
	//   29   63:invokespecial   #229 <Method void FacebookException(String)>
	//   30   66:athrow          
		}
		Date date = Utility.getBundleLongAsDate(bundle, "expires_in", new Date(0L));
	//   31   67:aload_1         
	//   32   68:ldc1            #40  <String "expires_in">
	//   33   70:new             #70  <Class Date>
	//   34   73:dup             
	//   35   74:lconst_0        
	//   36   75:invokespecial   #76  <Method void Date(long)>
	//   37   78:invokestatic    #205 <Method Date Utility.getBundleLongAsDate(Bundle, String, Date)>
	//   38   81:astore_2        
		bundle = ((Bundle) (bundle.getString("access_token")));
	//   39   82:aload_1         
	//   40   83:ldc1            #17  <String "access_token">
	//   41   85:invokevirtual   #199 <Method String Bundle.getString(String)>
	//   42   88:astore_1        
		if(Utility.isNullOrEmpty(((String) (bundle))))
	//*  43   89:aload_1         
	//*  44   90:invokestatic    #209 <Method boolean Utility.isNullOrEmpty(String)>
	//*  45   93:ifeq            98
			return null;
	//   46   96:aconst_null     
	//   47   97:areturn         
		else
			return new AccessToken(((String) (bundle)), accesstoken.applicationId, accesstoken.getUserId(), ((Collection) (accesstoken.getPermissions())), ((Collection) (accesstoken.getDeclinedPermissions())), accesstoken.source, date, new Date());
	//   48   98:new             #2   <Class AccessToken>
	//   49  101:dup             
	//   50  102:aload_1         
	//   51  103:aload_0         
	//   52  104:getfield        #146 <Field String applicationId>
	//   53  107:aload_0         
	//   54  108:invokevirtual   #349 <Method String getUserId()>
	//   55  111:aload_0         
	//   56  112:invokevirtual   #353 <Method Set getPermissions()>
	//   57  115:aload_0         
	//   58  116:invokevirtual   #356 <Method Set getDeclinedPermissions()>
	//   59  119:aload_0         
	//   60  120:getfield        #142 <Field AccessTokenSource source>
	//   61  123:aload_2         
	//   62  124:new             #70  <Class Date>
	//   63  127:dup             
	//   64  128:invokespecial   #82  <Method void Date()>
	//   65  131:invokespecial   #211 <Method void AccessToken(String, String, String, Collection, Collection, AccessTokenSource, Date, Date)>
	//   66  134:areturn         
	}

	public static AccessToken getCurrentAccessToken()
	{
		return AccessTokenManager.getInstance().getCurrentAccessToken();
	//    0    0:invokestatic    #365 <Method AccessTokenManager AccessTokenManager.getInstance()>
	//    1    3:invokevirtual   #367 <Method AccessToken AccessTokenManager.getCurrentAccessToken()>
	//    2    6:areturn         
	}

	static List getPermissionsFromBundle(Bundle bundle, String s)
	{
		bundle = ((Bundle) (bundle.getStringArrayList(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #371 <Method ArrayList Bundle.getStringArrayList(String)>
	//    3    5:astore_0        
		if(bundle == null)
	//*   4    6:aload_0         
	//*   5    7:ifnonnull       14
			return Collections.emptyList();
	//    6   10:invokestatic    #375 <Method List Collections.emptyList()>
	//    7   13:areturn         
		else
			return Collections.unmodifiableList(((List) (new ArrayList(((Collection) (bundle))))));
	//    8   14:new             #107 <Class ArrayList>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:invokespecial   #376 <Method void ArrayList(Collection)>
	//   12   22:invokestatic    #380 <Method List Collections.unmodifiableList(List)>
	//   13   25:areturn         
	}

	public static void refreshCurrentAccessTokenAsync()
	{
		AccessTokenManager.getInstance().refreshCurrentAccessToken();
	//    0    0:invokestatic    #365 <Method AccessTokenManager AccessTokenManager.getInstance()>
	//    1    3:invokevirtual   #385 <Method void AccessTokenManager.refreshCurrentAccessToken()>
	//    2    6:return          
	}

	public static void setCurrentAccessToken(AccessToken accesstoken)
	{
		AccessTokenManager.getInstance().setCurrentAccessToken(accesstoken);
	//    0    0:invokestatic    #365 <Method AccessTokenManager AccessTokenManager.getInstance()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #388 <Method void AccessTokenManager.setCurrentAccessToken(AccessToken)>
	//    3    7:return          
	}

	private String tokenToString()
	{
		if(token == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #136 <Field String token>
	//*   2    4:ifnonnull       10
			return "null";
	//    3    7:ldc1            #181 <String "null">
	//    4    9:areturn         
		if(FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.INCLUDE_ACCESS_TOKENS))
	//*   5   10:getstatic       #395 <Field LoggingBehavior LoggingBehavior.INCLUDE_ACCESS_TOKENS>
	//*   6   13:invokestatic    #399 <Method boolean FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior)>
	//*   7   16:ifeq            24
			return token;
	//    8   19:aload_0         
	//    9   20:getfield        #136 <Field String token>
	//   10   23:areturn         
		else
			return "ACCESS_TOKEN_REMOVED";
	//   11   24:ldc2            #401 <String "ACCESS_TOKEN_REMOVED">
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
		return expires.equals(((Object) (((AccessToken) (obj)).expires))) && permissions.equals(((Object) (((AccessToken) (obj)).permissions))) && declinedPermissions.equals(((Object) (((AccessToken) (obj)).declinedPermissions))) && token.equals(((Object) (((AccessToken) (obj)).token))) && source == ((AccessToken) (obj)).source && lastRefresh.equals(((Object) (((AccessToken) (obj)).lastRefresh))) && (applicationId != null ? applicationId.equals(((Object) (((AccessToken) (obj)).applicationId))) : ((AccessToken) (obj)).applicationId == null) && userId.equals(((Object) (((AccessToken) (obj)).userId)));
	//   13   21:aload_0         
	//   14   22:getfield        #105 <Field Date expires>
	//   15   25:aload_1         
	//   16   26:getfield        #105 <Field Date expires>
	//   17   29:invokevirtual   #407 <Method boolean Date.equals(Object)>
	//   18   32:ifeq            153
	//   19   35:aload_0         
	//   20   36:getfield        #125 <Field Set permissions>
	//   21   39:aload_1         
	//   22   40:getfield        #125 <Field Set permissions>
	//   23   43:invokeinterface #410 <Method boolean Set.equals(Object)>
	//   24   48:ifeq            153
	//   25   51:aload_0         
	//   26   52:getfield        #130 <Field Set declinedPermissions>
	//   27   55:aload_1         
	//   28   56:getfield        #130 <Field Set declinedPermissions>
	//   29   59:invokeinterface #410 <Method boolean Set.equals(Object)>
	//   30   64:ifeq            153
	//   31   67:aload_0         
	//   32   68:getfield        #136 <Field String token>
	//   33   71:aload_1         
	//   34   72:getfield        #136 <Field String token>
	//   35   75:invokevirtual   #411 <Method boolean String.equals(Object)>
	//   36   78:ifeq            153
	//   37   81:aload_0         
	//   38   82:getfield        #142 <Field AccessTokenSource source>
	//   39   85:aload_1         
	//   40   86:getfield        #142 <Field AccessTokenSource source>
	//   41   89:if_acmpne       153
	//   42   92:aload_0         
	//   43   93:getfield        #144 <Field Date lastRefresh>
	//   44   96:aload_1         
	//   45   97:getfield        #144 <Field Date lastRefresh>
	//   46  100:invokevirtual   #407 <Method boolean Date.equals(Object)>
	//   47  103:ifeq            153
	//   48  106:aload_0         
	//   49  107:getfield        #146 <Field String applicationId>
	//   50  110:ifnonnull       123
	//   51  113:aload_1         
	//   52  114:getfield        #146 <Field String applicationId>
	//   53  117:ifnonnull       153
	//   54  120:goto            137
	//   55  123:aload_0         
	//   56  124:getfield        #146 <Field String applicationId>
	//   57  127:aload_1         
	//   58  128:getfield        #146 <Field String applicationId>
	//   59  131:invokevirtual   #411 <Method boolean String.equals(Object)>
	//   60  134:ifeq            153
	//   61  137:aload_0         
	//   62  138:getfield        #148 <Field String userId>
	//   63  141:aload_1         
	//   64  142:getfield        #148 <Field String userId>
	//   65  145:invokevirtual   #411 <Method boolean String.equals(Object)>
	//   66  148:ifeq            153
	//   67  151:iconst_1        
	//   68  152:ireturn         
	//   69  153:iconst_0        
	//   70  154:ireturn         
	}

	public String getApplicationId()
	{
		return applicationId;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field String applicationId>
	//    2    4:areturn         
	}

	public Set getDeclinedPermissions()
	{
		return declinedPermissions;
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field Set declinedPermissions>
	//    2    4:areturn         
	}

	public Date getExpires()
	{
		return expires;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field Date expires>
	//    2    4:areturn         
	}

	public Date getLastRefresh()
	{
		return lastRefresh;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field Date lastRefresh>
	//    2    4:areturn         
	}

	public Set getPermissions()
	{
		return permissions;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field Set permissions>
	//    2    4:areturn         
	}

	public AccessTokenSource getSource()
	{
		return source;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field AccessTokenSource source>
	//    2    4:areturn         
	}

	public String getToken()
	{
		return token;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field String token>
	//    2    4:areturn         
	}

	public String getUserId()
	{
		return userId;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field String userId>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		int j = expires.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field Date expires>
	//    2    4:invokevirtual   #419 <Method int Date.hashCode()>
	//    3    7:istore_2        
		int k = permissions.hashCode();
	//    4    8:aload_0         
	//    5    9:getfield        #125 <Field Set permissions>
	//    6   12:invokeinterface #420 <Method int Set.hashCode()>
	//    7   17:istore_3        
		int l = declinedPermissions.hashCode();
	//    8   18:aload_0         
	//    9   19:getfield        #130 <Field Set declinedPermissions>
	//   10   22:invokeinterface #420 <Method int Set.hashCode()>
	//   11   27:istore          4
		int i1 = token.hashCode();
	//   12   29:aload_0         
	//   13   30:getfield        #136 <Field String token>
	//   14   33:invokevirtual   #421 <Method int String.hashCode()>
	//   15   36:istore          5
		int j1 = source.hashCode();
	//   16   38:aload_0         
	//   17   39:getfield        #142 <Field AccessTokenSource source>
	//   18   42:invokevirtual   #422 <Method int AccessTokenSource.hashCode()>
	//   19   45:istore          6
		int k1 = lastRefresh.hashCode();
	//   20   47:aload_0         
	//   21   48:getfield        #144 <Field Date lastRefresh>
	//   22   51:invokevirtual   #419 <Method int Date.hashCode()>
	//   23   54:istore          7
		int i;
		if(applicationId == null)
	//*  24   56:aload_0         
	//*  25   57:getfield        #146 <Field String applicationId>
	//*  26   60:ifnonnull       68
			i = 0;
	//   27   63:iconst_0        
	//   28   64:istore_1        
		else
	//*  29   65:goto            76
			i = applicationId.hashCode();
	//   30   68:aload_0         
	//   31   69:getfield        #146 <Field String applicationId>
	//   32   72:invokevirtual   #421 <Method int String.hashCode()>
	//   33   75:istore_1        
		return (((((((527 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + i) * 31 + userId.hashCode();
	//   34   76:sipush          527
	//   35   79:iload_2         
	//   36   80:iadd            
	//   37   81:bipush          31
	//   38   83:imul            
	//   39   84:iload_3         
	//   40   85:iadd            
	//   41   86:bipush          31
	//   42   88:imul            
	//   43   89:iload           4
	//   44   91:iadd            
	//   45   92:bipush          31
	//   46   94:imul            
	//   47   95:iload           5
	//   48   97:iadd            
	//   49   98:bipush          31
	//   50  100:imul            
	//   51  101:iload           6
	//   52  103:iadd            
	//   53  104:bipush          31
	//   54  106:imul            
	//   55  107:iload           7
	//   56  109:iadd            
	//   57  110:bipush          31
	//   58  112:imul            
	//   59  113:iload_1         
	//   60  114:iadd            
	//   61  115:bipush          31
	//   62  117:imul            
	//   63  118:aload_0         
	//   64  119:getfield        #148 <Field String userId>
	//   65  122:invokevirtual   #421 <Method int String.hashCode()>
	//   66  125:iadd            
	//   67  126:ireturn         
	}

	public boolean isExpired()
	{
		return (new Date()).after(expires);
	//    0    0:new             #70  <Class Date>
	//    1    3:dup             
	//    2    4:invokespecial   #82  <Method void Date()>
	//    3    7:aload_0         
	//    4    8:getfield        #105 <Field Date expires>
	//    5   11:invokevirtual   #427 <Method boolean Date.after(Date)>
	//    6   14:ireturn         
	}

	JSONObject toJSONObject()
		throws JSONException
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #218 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #430 <Method void JSONObject()>
	//    3    7:astore_1        
		jsonobject.put("version", 1);
	//    4    8:aload_1         
	//    5    9:ldc1            #59  <String "version">
	//    6   11:iconst_1        
	//    7   12:invokevirtual   #434 <Method JSONObject JSONObject.put(String, int)>
	//    8   15:pop             
		jsonobject.put("token", ((Object) (token)));
	//    9   16:aload_1         
	//   10   17:ldc1            #53  <String "token">
	//   11   19:aload_0         
	//   12   20:getfield        #136 <Field String token>
	//   13   23:invokevirtual   #437 <Method JSONObject JSONObject.put(String, Object)>
	//   14   26:pop             
		jsonobject.put("expires_at", expires.getTime());
	//   15   27:aload_1         
	//   16   28:ldc1            #37  <String "expires_at">
	//   17   30:aload_0         
	//   18   31:getfield        #105 <Field Date expires>
	//   19   34:invokevirtual   #440 <Method long Date.getTime()>
	//   20   37:invokevirtual   #443 <Method JSONObject JSONObject.put(String, long)>
	//   21   40:pop             
		jsonobject.put("permissions", ((Object) (new JSONArray(((Collection) (permissions))))));
	//   22   41:aload_1         
	//   23   42:ldc1            #47  <String "permissions">
	//   24   44:new             #445 <Class JSONArray>
	//   25   47:dup             
	//   26   48:aload_0         
	//   27   49:getfield        #125 <Field Set permissions>
	//   28   52:invokespecial   #446 <Method void JSONArray(Collection)>
	//   29   55:invokevirtual   #437 <Method JSONObject JSONObject.put(String, Object)>
	//   30   58:pop             
		jsonobject.put("declined_permissions", ((Object) (new JSONArray(((Collection) (declinedPermissions))))));
	//   31   59:aload_1         
	//   32   60:ldc1            #29  <String "declined_permissions">
	//   33   62:new             #445 <Class JSONArray>
	//   34   65:dup             
	//   35   66:aload_0         
	//   36   67:getfield        #130 <Field Set declinedPermissions>
	//   37   70:invokespecial   #446 <Method void JSONArray(Collection)>
	//   38   73:invokevirtual   #437 <Method JSONObject JSONObject.put(String, Object)>
	//   39   76:pop             
		jsonobject.put("last_refresh", lastRefresh.getTime());
	//   40   77:aload_1         
	//   41   78:ldc1            #43  <String "last_refresh">
	//   42   80:aload_0         
	//   43   81:getfield        #144 <Field Date lastRefresh>
	//   44   84:invokevirtual   #440 <Method long Date.getTime()>
	//   45   87:invokevirtual   #443 <Method JSONObject JSONObject.put(String, long)>
	//   46   90:pop             
		jsonobject.put("source", ((Object) (source.name())));
	//   47   91:aload_1         
	//   48   92:ldc1            #50  <String "source">
	//   49   94:aload_0         
	//   50   95:getfield        #142 <Field AccessTokenSource source>
	//   51   98:invokevirtual   #449 <Method String AccessTokenSource.name()>
	//   52  101:invokevirtual   #437 <Method JSONObject JSONObject.put(String, Object)>
	//   53  104:pop             
		jsonobject.put("application_id", ((Object) (applicationId)));
	//   54  105:aload_1         
	//   55  106:ldc1            #20  <String "application_id">
	//   56  108:aload_0         
	//   57  109:getfield        #146 <Field String applicationId>
	//   58  112:invokevirtual   #437 <Method JSONObject JSONObject.put(String, Object)>
	//   59  115:pop             
		jsonobject.put("user_id", ((Object) (userId)));
	//   60  116:aload_1         
	//   61  117:ldc1            #56  <String "user_id">
	//   62  119:aload_0         
	//   63  120:getfield        #148 <Field String userId>
	//   64  123:invokevirtual   #437 <Method JSONObject JSONObject.put(String, Object)>
	//   65  126:pop             
		return jsonobject;
	//   66  127:aload_1         
	//   67  128:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #175 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #338 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("{AccessToken");
	//    4    8:aload_1         
	//    5    9:ldc2            #451 <String "{AccessToken">
	//    6   12:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(" token:");
	//    8   16:aload_1         
	//    9   17:ldc2            #453 <String " token:">
	//   10   20:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		stringbuilder.append(tokenToString());
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:invokespecial   #455 <Method String tokenToString()>
	//   15   29:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		appendPermissions(stringbuilder);
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:invokespecial   #457 <Method void appendPermissions(StringBuilder)>
		stringbuilder.append("}");
	//   20   38:aload_1         
	//   21   39:ldc2            #459 <String "}">
	//   22   42:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
		return stringbuilder.toString();
	//   24   46:aload_1         
	//   25   47:invokevirtual   #346 <Method String StringBuilder.toString()>
	//   26   50:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeLong(expires.getTime());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #105 <Field Date expires>
	//    3    5:invokevirtual   #440 <Method long Date.getTime()>
	//    4    8:invokevirtual   #464 <Method void Parcel.writeLong(long)>
		parcel.writeStringList(((List) (new ArrayList(((Collection) (permissions))))));
	//    5   11:aload_1         
	//    6   12:new             #107 <Class ArrayList>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:getfield        #125 <Field Set permissions>
	//   10   20:invokespecial   #376 <Method void ArrayList(Collection)>
	//   11   23:invokevirtual   #467 <Method void Parcel.writeStringList(List)>
		parcel.writeStringList(((List) (new ArrayList(((Collection) (declinedPermissions))))));
	//   12   26:aload_1         
	//   13   27:new             #107 <Class ArrayList>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:getfield        #130 <Field Set declinedPermissions>
	//   17   35:invokespecial   #376 <Method void ArrayList(Collection)>
	//   18   38:invokevirtual   #467 <Method void Parcel.writeStringList(List)>
		parcel.writeString(token);
	//   19   41:aload_1         
	//   20   42:aload_0         
	//   21   43:getfield        #136 <Field String token>
	//   22   46:invokevirtual   #470 <Method void Parcel.writeString(String)>
		parcel.writeString(source.name());
	//   23   49:aload_1         
	//   24   50:aload_0         
	//   25   51:getfield        #142 <Field AccessTokenSource source>
	//   26   54:invokevirtual   #449 <Method String AccessTokenSource.name()>
	//   27   57:invokevirtual   #470 <Method void Parcel.writeString(String)>
		parcel.writeLong(lastRefresh.getTime());
	//   28   60:aload_1         
	//   29   61:aload_0         
	//   30   62:getfield        #144 <Field Date lastRefresh>
	//   31   65:invokevirtual   #440 <Method long Date.getTime()>
	//   32   68:invokevirtual   #464 <Method void Parcel.writeLong(long)>
		parcel.writeString(applicationId);
	//   33   71:aload_1         
	//   34   72:aload_0         
	//   35   73:getfield        #146 <Field String applicationId>
	//   36   76:invokevirtual   #470 <Method void Parcel.writeString(String)>
		parcel.writeString(userId);
	//   37   79:aload_1         
	//   38   80:aload_0         
	//   39   81:getfield        #148 <Field String userId>
	//   40   84:invokevirtual   #470 <Method void Parcel.writeString(String)>
	//   41   87:return          
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
	//    0    0:new             #70  <Class Date>
	//    1    3:dup             
	//    2    4:ldc2w           #71  <Long 0xffffffffL>
	//    3    7:invokespecial   #76  <Method void Date(long)>
	//    4   10:putstatic       #78  <Field Date MAX_DATE>
		DEFAULT_EXPIRATION_TIME = MAX_DATE;
	//    5   13:getstatic       #78  <Field Date MAX_DATE>
	//    6   16:putstatic       #80  <Field Date DEFAULT_EXPIRATION_TIME>
	//    7   19:new             #70  <Class Date>
	//    8   22:dup             
	//    9   23:invokespecial   #82  <Method void Date()>
	//   10   26:putstatic       #84  <Field Date DEFAULT_LAST_REFRESH_TIME>
		DEFAULT_ACCESS_TOKEN_SOURCE = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
	//   11   29:getstatic       #89  <Field AccessTokenSource AccessTokenSource.FACEBOOK_APPLICATION_WEB>
	//   12   32:putstatic       #91  <Field AccessTokenSource DEFAULT_ACCESS_TOKEN_SOURCE>
	//   13   35:new             #10  <Class AccessToken$2>
	//   14   38:dup             
	//   15   39:invokespecial   #92  <Method void AccessToken$2()>
	//   16   42:putstatic       #94  <Field android.os.Parcelable$Creator CREATOR>
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
	//    5    6:invokestatic    #169 <Method AccessToken createFromBundle(List, Bundle, AccessTokenSource, Date, String)>
	//    6    9:areturn         
	}

*/
}
