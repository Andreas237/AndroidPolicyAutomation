// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.util.*;
import org.json.*;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//			GoogleSignInAccountCreator, zza

public class GoogleSignInAccount extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	GoogleSignInAccount(int i, String s, String s1, String s2, String s3, Uri uri, String s4, 
			long l, String s5, List list, String s6, String s7)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method void AbstractSafeParcelable()>
		zzp = ((Set) (new HashSet()));
	//    2    4:aload_0         
	//    3    5:new             #86  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #87  <Method void HashSet()>
	//    6   12:putfield        #89  <Field Set zzp>
		versionCode = i;
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:putfield        #91  <Field int versionCode>
		zze = s;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #93  <Field String zze>
		zzf = s1;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #95  <Field String zzf>
		zzg = s2;
	//   16   30:aload_0         
	//   17   31:aload           4
	//   18   33:putfield        #97  <Field String zzg>
		zzh = s3;
	//   19   36:aload_0         
	//   20   37:aload           5
	//   21   39:putfield        #99  <Field String zzh>
		zzi = uri;
	//   22   42:aload_0         
	//   23   43:aload           6
	//   24   45:putfield        #101 <Field Uri zzi>
		zzj = s4;
	//   25   48:aload_0         
	//   26   49:aload           7
	//   27   51:putfield        #103 <Field String zzj>
		zzk = l;
	//   28   54:aload_0         
	//   29   55:lload           8
	//   30   57:putfield        #105 <Field long zzk>
		zzl = s5;
	//   31   60:aload_0         
	//   32   61:aload           10
	//   33   63:putfield        #107 <Field String zzl>
		zzm = list;
	//   34   66:aload_0         
	//   35   67:aload           11
	//   36   69:putfield        #109 <Field List zzm>
		zzn = s6;
	//   37   72:aload_0         
	//   38   73:aload           12
	//   39   75:putfield        #111 <Field String zzn>
		zzo = s7;
	//   40   78:aload_0         
	//   41   79:aload           13
	//   42   81:putfield        #113 <Field String zzo>
	//   43   84:return          
	}

	public static GoogleSignInAccount create(String s, String s1, String s2, String s3, Uri uri, Long long1, String s4, Set set)
	{
		return create(s, s1, s2, s3, ((String) (null)), ((String) (null)), uri, long1, s4, set);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:aload           4
	//    7    8:aload           5
	//    8   10:aload           6
	//    9   12:aload           7
	//   10   14:invokestatic    #124 <Method GoogleSignInAccount create(String, String, String, String, String, String, Uri, Long, String, Set)>
	//   11   17:areturn         
	}

	public static GoogleSignInAccount create(String s, String s1, String s2, String s3, String s4, String s5, Uri uri, Long long1, 
			String s6, Set set)
	{
		if(long1 == null)
	//*   0    0:aload           7
	//*   1    2:ifnonnull       25
			long1 = Long.valueOf(sClock.currentTimeMillis() / 1000L);
	//    2    5:getstatic       #79  <Field Clock sClock>
	//    3    8:invokeinterface #131 <Method long Clock.currentTimeMillis()>
	//    4   13:ldc2w           #132 <Long 1000L>
	//    5   16:ldiv            
	//    6   17:invokestatic    #139 <Method Long Long.valueOf(long)>
	//    7   20:astore          7
	//*   8   22:goto            25
		return new GoogleSignInAccount(3, s, s1, s2, s3, uri, ((String) (null)), long1.longValue(), Preconditions.checkNotEmpty(s6), ((List) (new ArrayList((Collection)Preconditions.checkNotNull(((Object) (set)))))), s4, s5);
	//    9   25:new             #2   <Class GoogleSignInAccount>
	//   10   28:dup             
	//   11   29:iconst_3        
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:aload_2         
	//   15   33:aload_3         
	//   16   34:aload           6
	//   17   36:aconst_null     
	//   18   37:aload           7
	//   19   39:invokevirtual   #142 <Method long Long.longValue()>
	//   20   42:aload           8
	//   21   44:invokestatic    #148 <Method String Preconditions.checkNotEmpty(String)>
	//   22   47:new             #150 <Class ArrayList>
	//   23   50:dup             
	//   24   51:aload           9
	//   25   53:invokestatic    #154 <Method Object Preconditions.checkNotNull(Object)>
	//   26   56:checkcast       #156 <Class Collection>
	//   27   59:invokespecial   #159 <Method void ArrayList(Collection)>
	//   28   62:aload           4
	//   29   64:aload           5
	//   30   66:invokespecial   #161 <Method void GoogleSignInAccount(int, String, String, String, String, Uri, String, long, String, List, String, String)>
	//   31   69:areturn         
	}

	public static GoogleSignInAccount createDefault()
	{
		return zza(new Account("<<default account>>", "com.google"), ((Set) (new HashSet())));
	//    0    0:new             #166 <Class Account>
	//    1    3:dup             
	//    2    4:ldc1            #168 <String "<<default account>>">
	//    3    6:ldc1            #170 <String "com.google">
	//    4    8:invokespecial   #173 <Method void Account(String, String)>
	//    5   11:new             #86  <Class HashSet>
	//    6   14:dup             
	//    7   15:invokespecial   #87  <Method void HashSet()>
	//    8   18:invokestatic    #177 <Method GoogleSignInAccount zza(Account, Set)>
	//    9   21:areturn         
	}

	public static transient GoogleSignInAccount fromAccountAndScopes(Account account, Scope scope, Scope ascope[])
	{
		Preconditions.checkNotNull(((Object) (account)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #154 <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		Preconditions.checkNotNull(((Object) (scope)));
	//    3    5:aload_1         
	//    4    6:invokestatic    #154 <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:pop             
		HashSet hashset = new HashSet();
	//    6   10:new             #86  <Class HashSet>
	//    7   13:dup             
	//    8   14:invokespecial   #87  <Method void HashSet()>
	//    9   17:astore_3        
		((Set) (hashset)).add(((Object) (scope)));
	//   10   18:aload_3         
	//   11   19:aload_1         
	//   12   20:invokeinterface #185 <Method boolean Set.add(Object)>
	//   13   25:pop             
		((Set) (hashset)).addAll(((Collection) (Arrays.asList(((Object []) (ascope))))));
	//   14   26:aload_3         
	//   15   27:aload_2         
	//   16   28:invokestatic    #191 <Method List Arrays.asList(Object[])>
	//   17   31:invokeinterface #195 <Method boolean Set.addAll(Collection)>
	//   18   36:pop             
		return zza(account, ((Set) (hashset)));
	//   19   37:aload_0         
	//   20   38:aload_3         
	//   21   39:invokestatic    #177 <Method GoogleSignInAccount zza(Account, Set)>
	//   22   42:areturn         
	}

	public static GoogleSignInAccount fromJsonString(String s)
		throws JSONException
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #205 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		JSONObject jsonobject = new JSONObject(s);
	//    5    9:new             #207 <Class JSONObject>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokespecial   #210 <Method void JSONObject(String)>
	//    9   17:astore          5
		s = jsonobject.optString("photoUrl", ((String) (null)));
	//   10   19:aload           5
	//   11   21:ldc1            #212 <String "photoUrl">
	//   12   23:aconst_null     
	//   13   24:invokevirtual   #216 <Method String JSONObject.optString(String, String)>
	//   14   27:astore_0        
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*  15   28:aload_0         
	//*  16   29:invokestatic    #205 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  17   32:ifne            43
			s = ((String) (Uri.parse(s)));
	//   18   35:aload_0         
	//   19   36:invokestatic    #222 <Method Uri Uri.parse(String)>
	//   20   39:astore_0        
		else
	//*  21   40:goto            45
			s = null;
	//   22   43:aconst_null     
	//   23   44:astore_0        
		long l = Long.parseLong(jsonobject.getString("expirationTime"));
	//   24   45:aload           5
	//   25   47:ldc1            #224 <String "expirationTime">
	//   26   49:invokevirtual   #227 <Method String JSONObject.getString(String)>
	//   27   52:invokestatic    #231 <Method long Long.parseLong(String)>
	//   28   55:lstore_3        
		HashSet hashset = new HashSet();
	//   29   56:new             #86  <Class HashSet>
	//   30   59:dup             
	//   31   60:invokespecial   #87  <Method void HashSet()>
	//   32   63:astore          6
		JSONArray jsonarray = jsonobject.getJSONArray("grantedScopes");
	//   33   65:aload           5
	//   34   67:ldc1            #233 <String "grantedScopes">
	//   35   69:invokevirtual   #237 <Method JSONArray JSONObject.getJSONArray(String)>
	//   36   72:astore          7
		int j = jsonarray.length();
	//   37   74:aload           7
	//   38   76:invokevirtual   #243 <Method int JSONArray.length()>
	//   39   79:istore_2        
		for(int i = 0; i < j; i++)
	//*  40   80:iconst_0        
	//*  41   81:istore_1        
	//*  42   82:iload_1         
	//*  43   83:iload_2         
	//*  44   84:icmpge          115
			((Set) (hashset)).add(((Object) (new Scope(jsonarray.getString(i)))));
	//   45   87:aload           6
	//   46   89:new             #245 <Class Scope>
	//   47   92:dup             
	//   48   93:aload           7
	//   49   95:iload_1         
	//   50   96:invokevirtual   #248 <Method String JSONArray.getString(int)>
	//   51   99:invokespecial   #249 <Method void Scope(String)>
	//   52  102:invokeinterface #185 <Method boolean Set.add(Object)>
	//   53  107:pop             

	//   54  108:iload_1         
	//   55  109:iconst_1        
	//   56  110:iadd            
	//   57  111:istore_1        
	//*  58  112:goto            82
		return create(jsonobject.optString("id"), jsonobject.optString("tokenId", ((String) (null))), jsonobject.optString("email", ((String) (null))), jsonobject.optString("displayName", ((String) (null))), jsonobject.optString("givenName", ((String) (null))), jsonobject.optString("familyName", ((String) (null))), ((Uri) (s)), Long.valueOf(l), jsonobject.getString("obfuscatedIdentifier"), ((Set) (hashset))).setServerAuthCode(jsonobject.optString("serverAuthCode", ((String) (null))));
	//   59  115:aload           5
	//   60  117:ldc1            #250 <String "id">
	//   61  119:invokevirtual   #252 <Method String JSONObject.optString(String)>
	//   62  122:aload           5
	//   63  124:ldc1            #254 <String "tokenId">
	//   64  126:aconst_null     
	//   65  127:invokevirtual   #216 <Method String JSONObject.optString(String, String)>
	//   66  130:aload           5
	//   67  132:ldc2            #256 <String "email">
	//   68  135:aconst_null     
	//   69  136:invokevirtual   #216 <Method String JSONObject.optString(String, String)>
	//   70  139:aload           5
	//   71  141:ldc2            #258 <String "displayName">
	//   72  144:aconst_null     
	//   73  145:invokevirtual   #216 <Method String JSONObject.optString(String, String)>
	//   74  148:aload           5
	//   75  150:ldc2            #260 <String "givenName">
	//   76  153:aconst_null     
	//   77  154:invokevirtual   #216 <Method String JSONObject.optString(String, String)>
	//   78  157:aload           5
	//   79  159:ldc2            #262 <String "familyName">
	//   80  162:aconst_null     
	//   81  163:invokevirtual   #216 <Method String JSONObject.optString(String, String)>
	//   82  166:aload_0         
	//   83  167:lload_3         
	//   84  168:invokestatic    #139 <Method Long Long.valueOf(long)>
	//   85  171:aload           5
	//   86  173:ldc2            #264 <String "obfuscatedIdentifier">
	//   87  176:invokevirtual   #227 <Method String JSONObject.getString(String)>
	//   88  179:aload           6
	//   89  181:invokestatic    #124 <Method GoogleSignInAccount create(String, String, String, String, String, String, Uri, Long, String, Set)>
	//   90  184:aload           5
	//   91  186:ldc2            #266 <String "serverAuthCode">
	//   92  189:aconst_null     
	//   93  190:invokevirtual   #216 <Method String JSONObject.optString(String, String)>
	//   94  193:invokevirtual   #269 <Method GoogleSignInAccount setServerAuthCode(String)>
	//   95  196:areturn         
	}

	static final int zza(Scope scope, Scope scope1)
	{
		return scope.getScopeUri().compareTo(scope1.getScopeUri());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #275 <Method String Scope.getScopeUri()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #275 <Method String Scope.getScopeUri()>
	//    4    8:invokevirtual   #281 <Method int String.compareTo(String)>
	//    5   11:ireturn         
	}

	private static GoogleSignInAccount zza(Account account, Set set)
	{
		return create(((String) (null)), ((String) (null)), account.name, ((String) (null)), ((String) (null)), ((String) (null)), ((Uri) (null)), Long.valueOf(0L), account.name, set);
	//    0    0:aconst_null     
	//    1    1:aconst_null     
	//    2    2:aload_0         
	//    3    3:getfield        #284 <Field String Account.name>
	//    4    6:aconst_null     
	//    5    7:aconst_null     
	//    6    8:aconst_null     
	//    7    9:aconst_null     
	//    8   10:lconst_0        
	//    9   11:invokestatic    #139 <Method Long Long.valueOf(long)>
	//   10   14:aload_0         
	//   11   15:getfield        #284 <Field String Account.name>
	//   12   18:aload_1         
	//   13   19:invokestatic    #124 <Method GoogleSignInAccount create(String, String, String, String, String, String, Uri, Long, String, Set)>
	//   14   22:areturn         
	}

	private final JSONObject zza()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #207 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #287 <Method void JSONObject()>
	//    3    7:astore_3        
		int i;
		int j;
		JSONArray jsonarray;
		Scope ascope[];
		try
		{
			if(getId() != null)
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #289 <Method String getId()>
	//*   6   12:ifnull          26
				jsonobject.put("id", ((Object) (getId())));
	//    7   15:aload_3         
	//    8   16:ldc1            #250 <String "id">
	//    9   18:aload_0         
	//   10   19:invokevirtual   #289 <Method String getId()>
	//   11   22:invokevirtual   #293 <Method JSONObject JSONObject.put(String, Object)>
	//   12   25:pop             
			if(getIdToken() != null)
	//*  13   26:aload_0         
	//*  14   27:invokevirtual   #295 <Method String getIdToken()>
	//*  15   30:ifnull          44
				jsonobject.put("tokenId", ((Object) (getIdToken())));
	//   16   33:aload_3         
	//   17   34:ldc1            #254 <String "tokenId">
	//   18   36:aload_0         
	//   19   37:invokevirtual   #295 <Method String getIdToken()>
	//   20   40:invokevirtual   #293 <Method JSONObject JSONObject.put(String, Object)>
	//   21   43:pop             
			if(getEmail() != null)
	//*  22   44:aload_0         
	//*  23   45:invokevirtual   #297 <Method String getEmail()>
	//*  24   48:ifnull          63
				jsonobject.put("email", ((Object) (getEmail())));
	//   25   51:aload_3         
	//   26   52:ldc2            #256 <String "email">
	//   27   55:aload_0         
	//   28   56:invokevirtual   #297 <Method String getEmail()>
	//   29   59:invokevirtual   #293 <Method JSONObject JSONObject.put(String, Object)>
	//   30   62:pop             
			if(getDisplayName() != null)
	//*  31   63:aload_0         
	//*  32   64:invokevirtual   #299 <Method String getDisplayName()>
	//*  33   67:ifnull          82
				jsonobject.put("displayName", ((Object) (getDisplayName())));
	//   34   70:aload_3         
	//   35   71:ldc2            #258 <String "displayName">
	//   36   74:aload_0         
	//   37   75:invokevirtual   #299 <Method String getDisplayName()>
	//   38   78:invokevirtual   #293 <Method JSONObject JSONObject.put(String, Object)>
	//   39   81:pop             
			if(getGivenName() != null)
	//*  40   82:aload_0         
	//*  41   83:invokevirtual   #301 <Method String getGivenName()>
	//*  42   86:ifnull          101
				jsonobject.put("givenName", ((Object) (getGivenName())));
	//   43   89:aload_3         
	//   44   90:ldc2            #260 <String "givenName">
	//   45   93:aload_0         
	//   46   94:invokevirtual   #301 <Method String getGivenName()>
	//   47   97:invokevirtual   #293 <Method JSONObject JSONObject.put(String, Object)>
	//   48  100:pop             
			if(getFamilyName() != null)
	//*  49  101:aload_0         
	//*  50  102:invokevirtual   #303 <Method String getFamilyName()>
	//*  51  105:ifnull          120
				jsonobject.put("familyName", ((Object) (getFamilyName())));
	//   52  108:aload_3         
	//   53  109:ldc2            #262 <String "familyName">
	//   54  112:aload_0         
	//   55  113:invokevirtual   #303 <Method String getFamilyName()>
	//   56  116:invokevirtual   #293 <Method JSONObject JSONObject.put(String, Object)>
	//   57  119:pop             
			if(getPhotoUrl() != null)
	//*  58  120:aload_0         
	//*  59  121:invokevirtual   #306 <Method Uri getPhotoUrl()>
	//*  60  124:ifnull          141
				jsonobject.put("photoUrl", ((Object) (getPhotoUrl().toString())));
	//   61  127:aload_3         
	//   62  128:ldc1            #212 <String "photoUrl">
	//   63  130:aload_0         
	//   64  131:invokevirtual   #306 <Method Uri getPhotoUrl()>
	//   65  134:invokevirtual   #309 <Method String Uri.toString()>
	//   66  137:invokevirtual   #293 <Method JSONObject JSONObject.put(String, Object)>
	//   67  140:pop             
			if(getServerAuthCode() != null)
	//*  68  141:aload_0         
	//*  69  142:invokevirtual   #311 <Method String getServerAuthCode()>
	//*  70  145:ifnull          160
				jsonobject.put("serverAuthCode", ((Object) (getServerAuthCode())));
	//   71  148:aload_3         
	//   72  149:ldc2            #266 <String "serverAuthCode">
	//   73  152:aload_0         
	//   74  153:invokevirtual   #311 <Method String getServerAuthCode()>
	//   75  156:invokevirtual   #293 <Method JSONObject JSONObject.put(String, Object)>
	//   76  159:pop             
			jsonobject.put("expirationTime", zzk);
	//   77  160:aload_3         
	//   78  161:ldc1            #224 <String "expirationTime">
	//   79  163:aload_0         
	//   80  164:getfield        #105 <Field long zzk>
	//   81  167:invokevirtual   #314 <Method JSONObject JSONObject.put(String, long)>
	//   82  170:pop             
			jsonobject.put("obfuscatedIdentifier", ((Object) (getObfuscatedIdentifier())));
	//   83  171:aload_3         
	//   84  172:ldc2            #264 <String "obfuscatedIdentifier">
	//   85  175:aload_0         
	//   86  176:invokevirtual   #316 <Method String getObfuscatedIdentifier()>
	//   87  179:invokevirtual   #293 <Method JSONObject JSONObject.put(String, Object)>
	//   88  182:pop             
			jsonarray = new JSONArray();
	//   89  183:new             #239 <Class JSONArray>
	//   90  186:dup             
	//   91  187:invokespecial   #317 <Method void JSONArray()>
	//   92  190:astore          4
			ascope = (Scope[])zzm.toArray(((Object []) (new Scope[zzm.size()])));
	//   93  192:aload_0         
	//   94  193:getfield        #109 <Field List zzm>
	//   95  196:aload_0         
	//   96  197:getfield        #109 <Field List zzm>
	//   97  200:invokeinterface #322 <Method int List.size()>
	//   98  205:anewarray       Scope[]
	//   99  208:invokeinterface #326 <Method Object[] List.toArray(Object[])>
	//  100  213:checkcast       #328 <Class Scope[]>
	//  101  216:astore          5
			Arrays.sort(((Object []) (ascope)), zza.zzq);
	//  102  218:aload           5
	//  103  220:getstatic       #334 <Field java.util.Comparator zza.zzq>
	//  104  223:invokestatic    #338 <Method void Arrays.sort(Object[], java.util.Comparator)>
			j = ascope.length;
	//  105  226:aload           5
	//  106  228:arraylength     
	//  107  229:istore_2        
		}
	//* 108  230:iconst_0        
	//* 109  231:istore_1        
	//* 110  232:iload_1         
	//* 111  233:iload_2         
	//* 112  234:icmpge          257
	//* 113  237:aload           4
	//* 114  239:aload           5
	//* 115  241:iload_1         
	//* 116  242:aaload          
	//* 117  243:invokevirtual   #275 <Method String Scope.getScopeUri()>
	//* 118  246:invokevirtual   #341 <Method JSONArray JSONArray.put(Object)>
	//* 119  249:pop             
	//* 120  250:iload_1         
	//* 121  251:iconst_1        
	//* 122  252:iadd            
	//* 123  253:istore_1        
	//* 124  254:goto            232
	//* 125  257:aload_3         
	//* 126  258:ldc1            #233 <String "grantedScopes">
	//* 127  260:aload           4
	//* 128  262:invokevirtual   #293 <Method JSONObject JSONObject.put(String, Object)>
	//* 129  265:pop             
	//* 130  266:aload_3         
	//* 131  267:areturn         
		catch(JSONException jsonexception)
	//* 132  268:astore_3        
		{
			throw new RuntimeException(((Throwable) (jsonexception)));
	//  133  269:new             #343 <Class RuntimeException>
	//  134  272:dup             
	//  135  273:aload_3         
	//  136  274:invokespecial   #346 <Method void RuntimeException(Throwable)>
	//  137  277:athrow          
		}
		i = 0;
		if(i >= j)
			break; /* Loop/switch isn't completed */
		jsonarray.put(((Object) (ascope[i].getScopeUri())));
		i++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_232;
_L1:
		jsonobject.put("grantedScopes", ((Object) (jsonarray)));
		return jsonobject;
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof GoogleSignInAccount))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class GoogleSignInAccount>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((GoogleSignInAccount)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class GoogleSignInAccount>
	//   12   20:astore_1        
		return ((GoogleSignInAccount) (obj)).getObfuscatedIdentifier().equals(((Object) (getObfuscatedIdentifier()))) && ((GoogleSignInAccount) (obj)).getRequestedScopes().equals(((Object) (getRequestedScopes())));
	//   13   21:aload_1         
	//   14   22:invokevirtual   #316 <Method String getObfuscatedIdentifier()>
	//   15   25:aload_0         
	//   16   26:invokevirtual   #316 <Method String getObfuscatedIdentifier()>
	//   17   29:invokevirtual   #349 <Method boolean String.equals(Object)>
	//   18   32:ifeq            53
	//   19   35:aload_1         
	//   20   36:invokevirtual   #353 <Method Set getRequestedScopes()>
	//   21   39:aload_0         
	//   22   40:invokevirtual   #353 <Method Set getRequestedScopes()>
	//   23   43:invokeinterface #354 <Method boolean Set.equals(Object)>
	//   24   48:ifeq            53
	//   25   51:iconst_1        
	//   26   52:ireturn         
	//   27   53:iconst_0        
	//   28   54:ireturn         
	}

	public Account getAccount()
	{
		if(zzg == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field String zzg>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return new Account(zzg, "com.google");
	//    5    9:new             #166 <Class Account>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #97  <Field String zzg>
	//    9   17:ldc1            #170 <String "com.google">
	//   10   19:invokespecial   #173 <Method void Account(String, String)>
	//   11   22:areturn         
	}

	public String getDisplayName()
	{
		return zzh;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field String zzh>
	//    2    4:areturn         
	}

	public String getEmail()
	{
		return zzg;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field String zzg>
	//    2    4:areturn         
	}

	public long getExpirationTimeSecs()
	{
		return zzk;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field long zzk>
	//    2    4:lreturn         
	}

	public String getFamilyName()
	{
		return zzo;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field String zzo>
	//    2    4:areturn         
	}

	public String getGivenName()
	{
		return zzn;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field String zzn>
	//    2    4:areturn         
	}

	public Set getGrantedScopes()
	{
		return ((Set) (new HashSet(((Collection) (zzm)))));
	//    0    0:new             #86  <Class HashSet>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #109 <Field List zzm>
	//    4    8:invokespecial   #358 <Method void HashSet(Collection)>
	//    5   11:areturn         
	}

	public String getId()
	{
		return zze;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field String zze>
	//    2    4:areturn         
	}

	public String getIdToken()
	{
		return zzf;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field String zzf>
	//    2    4:areturn         
	}

	public String getObfuscatedIdentifier()
	{
		return zzl;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field String zzl>
	//    2    4:areturn         
	}

	public Uri getPhotoUrl()
	{
		return zzi;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field Uri zzi>
	//    2    4:areturn         
	}

	public Set getRequestedScopes()
	{
		HashSet hashset = new HashSet(((Collection) (zzm)));
	//    0    0:new             #86  <Class HashSet>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #109 <Field List zzm>
	//    4    8:invokespecial   #358 <Method void HashSet(Collection)>
	//    5   11:astore_1        
		((Set) (hashset)).addAll(((Collection) (zzp)));
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #89  <Field Set zzp>
	//    9   17:invokeinterface #195 <Method boolean Set.addAll(Collection)>
	//   10   22:pop             
		return ((Set) (hashset));
	//   11   23:aload_1         
	//   12   24:areturn         
	}

	public String getServerAuthCode()
	{
		return zzj;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field String zzj>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return (527 + getObfuscatedIdentifier().hashCode()) * 31 + getRequestedScopes().hashCode();
	//    0    0:sipush          527
	//    1    3:aload_0         
	//    2    4:invokevirtual   #316 <Method String getObfuscatedIdentifier()>
	//    3    7:invokevirtual   #362 <Method int String.hashCode()>
	//    4   10:iadd            
	//    5   11:bipush          31
	//    6   13:imul            
	//    7   14:aload_0         
	//    8   15:invokevirtual   #353 <Method Set getRequestedScopes()>
	//    9   18:invokeinterface #363 <Method int Set.hashCode()>
	//   10   23:iadd            
	//   11   24:ireturn         
	}

	public boolean isExpired()
	{
		return sClock.currentTimeMillis() / 1000L >= zzk - 300L;
	//    0    0:getstatic       #79  <Field Clock sClock>
	//    1    3:invokeinterface #131 <Method long Clock.currentTimeMillis()>
	//    2    8:ldc2w           #132 <Long 1000L>
	//    3   11:ldiv            
	//    4   12:aload_0         
	//    5   13:getfield        #105 <Field long zzk>
	//    6   16:ldc2w           #366 <Long 300L>
	//    7   19:lsub            
	//    8   20:lcmp            
	//    9   21:iflt            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public transient GoogleSignInAccount requestExtraScopes(Scope ascope[])
	{
		if(ascope != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
			Collections.addAll(((Collection) (zzp)), ((Object []) (ascope)));
	//    2    4:aload_0         
	//    3    5:getfield        #89  <Field Set zzp>
	//    4    8:aload_1         
	//    5    9:invokestatic    #374 <Method boolean Collections.addAll(Collection, Object[])>
	//    6   12:pop             
		return this;
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public GoogleSignInAccount setServerAuthCode(String s)
	{
		zzj = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #103 <Field String zzj>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public String toJson()
	{
		return zza().toString();
	//    0    0:aload_0         
	//    1    1:invokespecial   #377 <Method JSONObject zza()>
	//    2    4:invokevirtual   #378 <Method String JSONObject.toString()>
	//    3    7:areturn         
	}

	public String toJsonForStorage()
	{
		JSONObject jsonobject = zza();
	//    0    0:aload_0         
	//    1    1:invokespecial   #377 <Method JSONObject zza()>
	//    2    4:astore_1        
		jsonobject.remove("serverAuthCode");
	//    3    5:aload_1         
	//    4    6:ldc2            #266 <String "serverAuthCode">
	//    5    9:invokevirtual   #383 <Method Object JSONObject.remove(String)>
	//    6   12:pop             
		return jsonobject.toString();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #378 <Method String JSONObject.toString()>
	//    9   17:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #391 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeInt(parcel, 1, versionCode);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #91  <Field int versionCode>
	//    7   11:invokestatic    #395 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeString(parcel, 2, getId(), false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #289 <Method String getId()>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #399 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 3, getIdToken(), false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:invokevirtual   #295 <Method String getIdToken()>
	//   18   30:iconst_0        
	//   19   31:invokestatic    #399 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 4, getEmail(), false);
	//   20   34:aload_1         
	//   21   35:iconst_4        
	//   22   36:aload_0         
	//   23   37:invokevirtual   #297 <Method String getEmail()>
	//   24   40:iconst_0        
	//   25   41:invokestatic    #399 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 5, getDisplayName(), false);
	//   26   44:aload_1         
	//   27   45:iconst_5        
	//   28   46:aload_0         
	//   29   47:invokevirtual   #299 <Method String getDisplayName()>
	//   30   50:iconst_0        
	//   31   51:invokestatic    #399 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 6, ((android.os.Parcelable) (getPhotoUrl())), i, false);
	//   32   54:aload_1         
	//   33   55:bipush          6
	//   34   57:aload_0         
	//   35   58:invokevirtual   #306 <Method Uri getPhotoUrl()>
	//   36   61:iload_2         
	//   37   62:iconst_0        
	//   38   63:invokestatic    #403 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeString(parcel, 7, getServerAuthCode(), false);
	//   39   66:aload_1         
	//   40   67:bipush          7
	//   41   69:aload_0         
	//   42   70:invokevirtual   #311 <Method String getServerAuthCode()>
	//   43   73:iconst_0        
	//   44   74:invokestatic    #399 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeLong(parcel, 8, getExpirationTimeSecs());
	//   45   77:aload_1         
	//   46   78:bipush          8
	//   47   80:aload_0         
	//   48   81:invokevirtual   #405 <Method long getExpirationTimeSecs()>
	//   49   84:invokestatic    #409 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeString(parcel, 9, getObfuscatedIdentifier(), false);
	//   50   87:aload_1         
	//   51   88:bipush          9
	//   52   90:aload_0         
	//   53   91:invokevirtual   #316 <Method String getObfuscatedIdentifier()>
	//   54   94:iconst_0        
	//   55   95:invokestatic    #399 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeTypedList(parcel, 10, zzm, false);
	//   56   98:aload_1         
	//   57   99:bipush          10
	//   58  101:aload_0         
	//   59  102:getfield        #109 <Field List zzm>
	//   60  105:iconst_0        
	//   61  106:invokestatic    #413 <Method void SafeParcelWriter.writeTypedList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeString(parcel, 11, getGivenName(), false);
	//   62  109:aload_1         
	//   63  110:bipush          11
	//   64  112:aload_0         
	//   65  113:invokevirtual   #301 <Method String getGivenName()>
	//   66  116:iconst_0        
	//   67  117:invokestatic    #399 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 12, getFamilyName(), false);
	//   68  120:aload_1         
	//   69  121:bipush          12
	//   70  123:aload_0         
	//   71  124:invokevirtual   #303 <Method String getFamilyName()>
	//   72  127:iconst_0        
	//   73  128:invokestatic    #399 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   74  131:aload_1         
	//   75  132:iload_3         
	//   76  133:invokestatic    #416 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   77  136:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new GoogleSignInAccountCreator();
	public static Clock sClock = DefaultClock.getInstance();
	private final int versionCode;
	private String zze;
	private String zzf;
	private String zzg;
	private String zzh;
	private Uri zzi;
	private String zzj;
	private long zzk;
	private String zzl;
	private List zzm;
	private String zzn;
	private String zzo;
	private Set zzp;

	static 
	{
	//    0    0:new             #66  <Class GoogleSignInAccountCreator>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void GoogleSignInAccountCreator()>
	//    3    7:putstatic       #71  <Field android.os.Parcelable$Creator CREATOR>
	//    4   10:invokestatic    #77  <Method Clock DefaultClock.getInstance()>
	//    5   13:putstatic       #79  <Field Clock sClock>
	//*   6   16:return          
	}
}
