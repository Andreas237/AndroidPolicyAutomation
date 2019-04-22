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
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
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
	//    1    1:invokespecial   #85  <Method void AbstractSafeParcelable()>
		zzp = ((Set) (new HashSet()));
	//    2    4:aload_0         
	//    3    5:new             #87  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #88  <Method void HashSet()>
	//    6   12:putfield        #90  <Field Set zzp>
		versionCode = i;
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:putfield        #92  <Field int versionCode>
		zze = s;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #94  <Field String zze>
		zzf = s1;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #96  <Field String zzf>
		zzg = s2;
	//   16   30:aload_0         
	//   17   31:aload           4
	//   18   33:putfield        #98  <Field String zzg>
		zzh = s3;
	//   19   36:aload_0         
	//   20   37:aload           5
	//   21   39:putfield        #100 <Field String zzh>
		zzi = uri;
	//   22   42:aload_0         
	//   23   43:aload           6
	//   24   45:putfield        #102 <Field Uri zzi>
		zzj = s4;
	//   25   48:aload_0         
	//   26   49:aload           7
	//   27   51:putfield        #104 <Field String zzj>
		zzk = l;
	//   28   54:aload_0         
	//   29   55:lload           8
	//   30   57:putfield        #106 <Field long zzk>
		zzl = s5;
	//   31   60:aload_0         
	//   32   61:aload           10
	//   33   63:putfield        #108 <Field String zzl>
		zzm = list;
	//   34   66:aload_0         
	//   35   67:aload           11
	//   36   69:putfield        #110 <Field List zzm>
		zzn = s6;
	//   37   72:aload_0         
	//   38   73:aload           12
	//   39   75:putfield        #112 <Field String zzn>
		zzo = s7;
	//   40   78:aload_0         
	//   41   79:aload           13
	//   42   81:putfield        #114 <Field String zzo>
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
	//   10   14:invokestatic    #125 <Method GoogleSignInAccount create(String, String, String, String, String, String, Uri, Long, String, Set)>
	//   11   17:areturn         
	}

	public static GoogleSignInAccount create(String s, String s1, String s2, String s3, String s4, String s5, Uri uri, Long long1, 
			String s6, Set set)
	{
		if(long1 == null)
	//*   0    0:aload           7
	//*   1    2:ifnonnull       25
			long1 = Long.valueOf(sClock.currentTimeMillis() / 1000L);
	//    2    5:getstatic       #80  <Field Clock sClock>
	//    3    8:invokeinterface #132 <Method long Clock.currentTimeMillis()>
	//    4   13:ldc2w           #133 <Long 1000L>
	//    5   16:ldiv            
	//    6   17:invokestatic    #140 <Method Long Long.valueOf(long)>
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
	//   19   39:invokevirtual   #143 <Method long Long.longValue()>
	//   20   42:aload           8
	//   21   44:invokestatic    #149 <Method String Preconditions.checkNotEmpty(String)>
	//   22   47:new             #151 <Class ArrayList>
	//   23   50:dup             
	//   24   51:aload           9
	//   25   53:invokestatic    #155 <Method Object Preconditions.checkNotNull(Object)>
	//   26   56:checkcast       #157 <Class Collection>
	//   27   59:invokespecial   #160 <Method void ArrayList(Collection)>
	//   28   62:aload           4
	//   29   64:aload           5
	//   30   66:invokespecial   #162 <Method void GoogleSignInAccount(int, String, String, String, String, Uri, String, long, String, List, String, String)>
	//   31   69:areturn         
	}

	public static GoogleSignInAccount createDefault()
	{
		return zza(new Account("<<default account>>", "com.google"), ((Set) (new HashSet())));
	//    0    0:new             #167 <Class Account>
	//    1    3:dup             
	//    2    4:ldc1            #169 <String "<<default account>>">
	//    3    6:ldc1            #171 <String "com.google">
	//    4    8:invokespecial   #174 <Method void Account(String, String)>
	//    5   11:new             #87  <Class HashSet>
	//    6   14:dup             
	//    7   15:invokespecial   #88  <Method void HashSet()>
	//    8   18:invokestatic    #178 <Method GoogleSignInAccount zza(Account, Set)>
	//    9   21:areturn         
	}

	public static transient GoogleSignInAccount fromAccountAndScopes(Account account, Scope scope, Scope ascope[])
	{
		Preconditions.checkNotNull(((Object) (account)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #155 <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		Preconditions.checkNotNull(((Object) (scope)));
	//    3    5:aload_1         
	//    4    6:invokestatic    #155 <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:pop             
		HashSet hashset = new HashSet();
	//    6   10:new             #87  <Class HashSet>
	//    7   13:dup             
	//    8   14:invokespecial   #88  <Method void HashSet()>
	//    9   17:astore_3        
		((Set) (hashset)).add(((Object) (scope)));
	//   10   18:aload_3         
	//   11   19:aload_1         
	//   12   20:invokeinterface #186 <Method boolean Set.add(Object)>
	//   13   25:pop             
		((Set) (hashset)).addAll(((Collection) (Arrays.asList(((Object []) (ascope))))));
	//   14   26:aload_3         
	//   15   27:aload_2         
	//   16   28:invokestatic    #192 <Method List Arrays.asList(Object[])>
	//   17   31:invokeinterface #196 <Method boolean Set.addAll(Collection)>
	//   18   36:pop             
		return zza(account, ((Set) (hashset)));
	//   19   37:aload_0         
	//   20   38:aload_3         
	//   21   39:invokestatic    #178 <Method GoogleSignInAccount zza(Account, Set)>
	//   22   42:areturn         
	}

	public static GoogleSignInAccount fromJsonString(String s)
		throws JSONException
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #206 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		JSONObject jsonobject = JSONObjectInstrumentation.init(s);
	//    5    9:aload_0         
	//    6   10:invokestatic    #212 <Method JSONObject JSONObjectInstrumentation.init(String)>
	//    7   13:astore          5
		s = jsonobject.optString("photoUrl", ((String) (null)));
	//    8   15:aload           5
	//    9   17:ldc1            #214 <String "photoUrl">
	//   10   19:aconst_null     
	//   11   20:invokevirtual   #220 <Method String JSONObject.optString(String, String)>
	//   12   23:astore_0        
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*  13   24:aload_0         
	//*  14   25:invokestatic    #206 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  15   28:ifne            39
			s = ((String) (Uri.parse(s)));
	//   16   31:aload_0         
	//   17   32:invokestatic    #226 <Method Uri Uri.parse(String)>
	//   18   35:astore_0        
		else
	//*  19   36:goto            41
			s = null;
	//   20   39:aconst_null     
	//   21   40:astore_0        
		long l = Long.parseLong(jsonobject.getString("expirationTime"));
	//   22   41:aload           5
	//   23   43:ldc1            #228 <String "expirationTime">
	//   24   45:invokevirtual   #231 <Method String JSONObject.getString(String)>
	//   25   48:invokestatic    #235 <Method long Long.parseLong(String)>
	//   26   51:lstore_3        
		HashSet hashset = new HashSet();
	//   27   52:new             #87  <Class HashSet>
	//   28   55:dup             
	//   29   56:invokespecial   #88  <Method void HashSet()>
	//   30   59:astore          6
		JSONArray jsonarray = jsonobject.getJSONArray("grantedScopes");
	//   31   61:aload           5
	//   32   63:ldc1            #237 <String "grantedScopes">
	//   33   65:invokevirtual   #241 <Method JSONArray JSONObject.getJSONArray(String)>
	//   34   68:astore          7
		int j = jsonarray.length();
	//   35   70:aload           7
	//   36   72:invokevirtual   #247 <Method int JSONArray.length()>
	//   37   75:istore_2        
		for(int i = 0; i < j; i++)
	//*  38   76:iconst_0        
	//*  39   77:istore_1        
	//*  40   78:iload_1         
	//*  41   79:iload_2         
	//*  42   80:icmpge          111
			((Set) (hashset)).add(((Object) (new Scope(jsonarray.getString(i)))));
	//   43   83:aload           6
	//   44   85:new             #249 <Class Scope>
	//   45   88:dup             
	//   46   89:aload           7
	//   47   91:iload_1         
	//   48   92:invokevirtual   #252 <Method String JSONArray.getString(int)>
	//   49   95:invokespecial   #255 <Method void Scope(String)>
	//   50   98:invokeinterface #186 <Method boolean Set.add(Object)>
	//   51  103:pop             

	//   52  104:iload_1         
	//   53  105:iconst_1        
	//   54  106:iadd            
	//   55  107:istore_1        
	//*  56  108:goto            78
		return create(jsonobject.optString("id"), jsonobject.optString("tokenId", ((String) (null))), jsonobject.optString("email", ((String) (null))), jsonobject.optString("displayName", ((String) (null))), jsonobject.optString("givenName", ((String) (null))), jsonobject.optString("familyName", ((String) (null))), ((Uri) (s)), Long.valueOf(l), jsonobject.getString("obfuscatedIdentifier"), ((Set) (hashset))).setServerAuthCode(jsonobject.optString("serverAuthCode", ((String) (null))));
	//   57  111:aload           5
	//   58  113:ldc2            #256 <String "id">
	//   59  116:invokevirtual   #258 <Method String JSONObject.optString(String)>
	//   60  119:aload           5
	//   61  121:ldc2            #260 <String "tokenId">
	//   62  124:aconst_null     
	//   63  125:invokevirtual   #220 <Method String JSONObject.optString(String, String)>
	//   64  128:aload           5
	//   65  130:ldc2            #262 <String "email">
	//   66  133:aconst_null     
	//   67  134:invokevirtual   #220 <Method String JSONObject.optString(String, String)>
	//   68  137:aload           5
	//   69  139:ldc2            #264 <String "displayName">
	//   70  142:aconst_null     
	//   71  143:invokevirtual   #220 <Method String JSONObject.optString(String, String)>
	//   72  146:aload           5
	//   73  148:ldc2            #266 <String "givenName">
	//   74  151:aconst_null     
	//   75  152:invokevirtual   #220 <Method String JSONObject.optString(String, String)>
	//   76  155:aload           5
	//   77  157:ldc2            #268 <String "familyName">
	//   78  160:aconst_null     
	//   79  161:invokevirtual   #220 <Method String JSONObject.optString(String, String)>
	//   80  164:aload_0         
	//   81  165:lload_3         
	//   82  166:invokestatic    #140 <Method Long Long.valueOf(long)>
	//   83  169:aload           5
	//   84  171:ldc2            #270 <String "obfuscatedIdentifier">
	//   85  174:invokevirtual   #231 <Method String JSONObject.getString(String)>
	//   86  177:aload           6
	//   87  179:invokestatic    #125 <Method GoogleSignInAccount create(String, String, String, String, String, String, Uri, Long, String, Set)>
	//   88  182:aload           5
	//   89  184:ldc2            #272 <String "serverAuthCode">
	//   90  187:aconst_null     
	//   91  188:invokevirtual   #220 <Method String JSONObject.optString(String, String)>
	//   92  191:invokevirtual   #275 <Method GoogleSignInAccount setServerAuthCode(String)>
	//   93  194:areturn         
	}

	static final int zza(Scope scope, Scope scope1)
	{
		return scope.getScopeUri().compareTo(scope1.getScopeUri());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #281 <Method String Scope.getScopeUri()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #281 <Method String Scope.getScopeUri()>
	//    4    8:invokevirtual   #287 <Method int String.compareTo(String)>
	//    5   11:ireturn         
	}

	private static GoogleSignInAccount zza(Account account, Set set)
	{
		return create(((String) (null)), ((String) (null)), account.name, ((String) (null)), ((String) (null)), ((String) (null)), ((Uri) (null)), Long.valueOf(0L), account.name, set);
	//    0    0:aconst_null     
	//    1    1:aconst_null     
	//    2    2:aload_0         
	//    3    3:getfield        #290 <Field String Account.name>
	//    4    6:aconst_null     
	//    5    7:aconst_null     
	//    6    8:aconst_null     
	//    7    9:aconst_null     
	//    8   10:lconst_0        
	//    9   11:invokestatic    #140 <Method Long Long.valueOf(long)>
	//   10   14:aload_0         
	//   11   15:getfield        #290 <Field String Account.name>
	//   12   18:aload_1         
	//   13   19:invokestatic    #125 <Method GoogleSignInAccount create(String, String, String, String, String, String, Uri, Long, String, Set)>
	//   14   22:areturn         
	}

	private final JSONObject zza()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #216 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #293 <Method void JSONObject()>
	//    3    7:astore_3        
		int i;
		int j;
		JSONArray jsonarray;
		Scope ascope[];
		try
		{
			if(getId() != null)
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #295 <Method String getId()>
	//*   6   12:ifnull          27
				jsonobject.put("id", ((Object) (getId())));
	//    7   15:aload_3         
	//    8   16:ldc2            #256 <String "id">
	//    9   19:aload_0         
	//   10   20:invokevirtual   #295 <Method String getId()>
	//   11   23:invokevirtual   #299 <Method JSONObject JSONObject.put(String, Object)>
	//   12   26:pop             
			if(getIdToken() != null)
	//*  13   27:aload_0         
	//*  14   28:invokevirtual   #301 <Method String getIdToken()>
	//*  15   31:ifnull          46
				jsonobject.put("tokenId", ((Object) (getIdToken())));
	//   16   34:aload_3         
	//   17   35:ldc2            #260 <String "tokenId">
	//   18   38:aload_0         
	//   19   39:invokevirtual   #301 <Method String getIdToken()>
	//   20   42:invokevirtual   #299 <Method JSONObject JSONObject.put(String, Object)>
	//   21   45:pop             
			if(getEmail() != null)
	//*  22   46:aload_0         
	//*  23   47:invokevirtual   #303 <Method String getEmail()>
	//*  24   50:ifnull          65
				jsonobject.put("email", ((Object) (getEmail())));
	//   25   53:aload_3         
	//   26   54:ldc2            #262 <String "email">
	//   27   57:aload_0         
	//   28   58:invokevirtual   #303 <Method String getEmail()>
	//   29   61:invokevirtual   #299 <Method JSONObject JSONObject.put(String, Object)>
	//   30   64:pop             
			if(getDisplayName() != null)
	//*  31   65:aload_0         
	//*  32   66:invokevirtual   #305 <Method String getDisplayName()>
	//*  33   69:ifnull          84
				jsonobject.put("displayName", ((Object) (getDisplayName())));
	//   34   72:aload_3         
	//   35   73:ldc2            #264 <String "displayName">
	//   36   76:aload_0         
	//   37   77:invokevirtual   #305 <Method String getDisplayName()>
	//   38   80:invokevirtual   #299 <Method JSONObject JSONObject.put(String, Object)>
	//   39   83:pop             
			if(getGivenName() != null)
	//*  40   84:aload_0         
	//*  41   85:invokevirtual   #307 <Method String getGivenName()>
	//*  42   88:ifnull          103
				jsonobject.put("givenName", ((Object) (getGivenName())));
	//   43   91:aload_3         
	//   44   92:ldc2            #266 <String "givenName">
	//   45   95:aload_0         
	//   46   96:invokevirtual   #307 <Method String getGivenName()>
	//   47   99:invokevirtual   #299 <Method JSONObject JSONObject.put(String, Object)>
	//   48  102:pop             
			if(getFamilyName() != null)
	//*  49  103:aload_0         
	//*  50  104:invokevirtual   #309 <Method String getFamilyName()>
	//*  51  107:ifnull          122
				jsonobject.put("familyName", ((Object) (getFamilyName())));
	//   52  110:aload_3         
	//   53  111:ldc2            #268 <String "familyName">
	//   54  114:aload_0         
	//   55  115:invokevirtual   #309 <Method String getFamilyName()>
	//   56  118:invokevirtual   #299 <Method JSONObject JSONObject.put(String, Object)>
	//   57  121:pop             
			if(getPhotoUrl() != null)
	//*  58  122:aload_0         
	//*  59  123:invokevirtual   #312 <Method Uri getPhotoUrl()>
	//*  60  126:ifnull          143
				jsonobject.put("photoUrl", ((Object) (getPhotoUrl().toString())));
	//   61  129:aload_3         
	//   62  130:ldc1            #214 <String "photoUrl">
	//   63  132:aload_0         
	//   64  133:invokevirtual   #312 <Method Uri getPhotoUrl()>
	//   65  136:invokevirtual   #315 <Method String Uri.toString()>
	//   66  139:invokevirtual   #299 <Method JSONObject JSONObject.put(String, Object)>
	//   67  142:pop             
			if(getServerAuthCode() != null)
	//*  68  143:aload_0         
	//*  69  144:invokevirtual   #317 <Method String getServerAuthCode()>
	//*  70  147:ifnull          162
				jsonobject.put("serverAuthCode", ((Object) (getServerAuthCode())));
	//   71  150:aload_3         
	//   72  151:ldc2            #272 <String "serverAuthCode">
	//   73  154:aload_0         
	//   74  155:invokevirtual   #317 <Method String getServerAuthCode()>
	//   75  158:invokevirtual   #299 <Method JSONObject JSONObject.put(String, Object)>
	//   76  161:pop             
			jsonobject.put("expirationTime", zzk);
	//   77  162:aload_3         
	//   78  163:ldc1            #228 <String "expirationTime">
	//   79  165:aload_0         
	//   80  166:getfield        #106 <Field long zzk>
	//   81  169:invokevirtual   #320 <Method JSONObject JSONObject.put(String, long)>
	//   82  172:pop             
			jsonobject.put("obfuscatedIdentifier", ((Object) (getObfuscatedIdentifier())));
	//   83  173:aload_3         
	//   84  174:ldc2            #270 <String "obfuscatedIdentifier">
	//   85  177:aload_0         
	//   86  178:invokevirtual   #322 <Method String getObfuscatedIdentifier()>
	//   87  181:invokevirtual   #299 <Method JSONObject JSONObject.put(String, Object)>
	//   88  184:pop             
			jsonarray = new JSONArray();
	//   89  185:new             #243 <Class JSONArray>
	//   90  188:dup             
	//   91  189:invokespecial   #323 <Method void JSONArray()>
	//   92  192:astore          4
			ascope = (Scope[])zzm.toArray(((Object []) (new Scope[zzm.size()])));
	//   93  194:aload_0         
	//   94  195:getfield        #110 <Field List zzm>
	//   95  198:aload_0         
	//   96  199:getfield        #110 <Field List zzm>
	//   97  202:invokeinterface #328 <Method int List.size()>
	//   98  207:anewarray       Scope[]
	//   99  210:invokeinterface #332 <Method Object[] List.toArray(Object[])>
	//  100  215:checkcast       #334 <Class Scope[]>
	//  101  218:astore          5
			Arrays.sort(((Object []) (ascope)), zza.zzq);
	//  102  220:aload           5
	//  103  222:getstatic       #340 <Field java.util.Comparator zza.zzq>
	//  104  225:invokestatic    #344 <Method void Arrays.sort(Object[], java.util.Comparator)>
			j = ascope.length;
	//  105  228:aload           5
	//  106  230:arraylength     
	//  107  231:istore_2        
		}
	//* 108  232:iconst_0        
	//* 109  233:istore_1        
	//* 110  234:iload_1         
	//* 111  235:iload_2         
	//* 112  236:icmpge          259
	//* 113  239:aload           4
	//* 114  241:aload           5
	//* 115  243:iload_1         
	//* 116  244:aaload          
	//* 117  245:invokevirtual   #281 <Method String Scope.getScopeUri()>
	//* 118  248:invokevirtual   #347 <Method JSONArray JSONArray.put(Object)>
	//* 119  251:pop             
	//* 120  252:iload_1         
	//* 121  253:iconst_1        
	//* 122  254:iadd            
	//* 123  255:istore_1        
	//* 124  256:goto            234
	//* 125  259:aload_3         
	//* 126  260:ldc1            #237 <String "grantedScopes">
	//* 127  262:aload           4
	//* 128  264:invokevirtual   #299 <Method JSONObject JSONObject.put(String, Object)>
	//* 129  267:pop             
	//* 130  268:aload_3         
	//* 131  269:areturn         
		catch(JSONException jsonexception)
	//* 132  270:astore_3        
		{
			throw new RuntimeException(((Throwable) (jsonexception)));
	//  133  271:new             #349 <Class RuntimeException>
	//  134  274:dup             
	//  135  275:aload_3         
	//  136  276:invokespecial   #352 <Method void RuntimeException(Throwable)>
	//  137  279:athrow          
		}
		i = 0;
		if(i >= j)
			break; /* Loop/switch isn't completed */
		jsonarray.put(((Object) (ascope[i].getScopeUri())));
		i++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_234;
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
	//   14   22:invokevirtual   #322 <Method String getObfuscatedIdentifier()>
	//   15   25:aload_0         
	//   16   26:invokevirtual   #322 <Method String getObfuscatedIdentifier()>
	//   17   29:invokevirtual   #355 <Method boolean String.equals(Object)>
	//   18   32:ifeq            53
	//   19   35:aload_1         
	//   20   36:invokevirtual   #359 <Method Set getRequestedScopes()>
	//   21   39:aload_0         
	//   22   40:invokevirtual   #359 <Method Set getRequestedScopes()>
	//   23   43:invokeinterface #360 <Method boolean Set.equals(Object)>
	//   24   48:ifeq            53
	//   25   51:iconst_1        
	//   26   52:ireturn         
	//   27   53:iconst_0        
	//   28   54:ireturn         
	}

	public Account getAccount()
	{
		String s = zzg;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field String zzg>
	//    2    4:astore_1        
		if(s == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return new Account(s, "com.google");
	//    7   11:new             #167 <Class Account>
	//    8   14:dup             
	//    9   15:aload_1         
	//   10   16:ldc1            #171 <String "com.google">
	//   11   18:invokespecial   #174 <Method void Account(String, String)>
	//   12   21:areturn         
	}

	public String getDisplayName()
	{
		return zzh;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field String zzh>
	//    2    4:areturn         
	}

	public String getEmail()
	{
		return zzg;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field String zzg>
	//    2    4:areturn         
	}

	public long getExpirationTimeSecs()
	{
		return zzk;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field long zzk>
	//    2    4:lreturn         
	}

	public String getFamilyName()
	{
		return zzo;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field String zzo>
	//    2    4:areturn         
	}

	public String getGivenName()
	{
		return zzn;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field String zzn>
	//    2    4:areturn         
	}

	public Set getGrantedScopes()
	{
		return ((Set) (new HashSet(((Collection) (zzm)))));
	//    0    0:new             #87  <Class HashSet>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #110 <Field List zzm>
	//    4    8:invokespecial   #364 <Method void HashSet(Collection)>
	//    5   11:areturn         
	}

	public String getId()
	{
		return zze;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field String zze>
	//    2    4:areturn         
	}

	public String getIdToken()
	{
		return zzf;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field String zzf>
	//    2    4:areturn         
	}

	public String getObfuscatedIdentifier()
	{
		return zzl;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field String zzl>
	//    2    4:areturn         
	}

	public Uri getPhotoUrl()
	{
		return zzi;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field Uri zzi>
	//    2    4:areturn         
	}

	public Set getRequestedScopes()
	{
		HashSet hashset = new HashSet(((Collection) (zzm)));
	//    0    0:new             #87  <Class HashSet>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #110 <Field List zzm>
	//    4    8:invokespecial   #364 <Method void HashSet(Collection)>
	//    5   11:astore_1        
		((Set) (hashset)).addAll(((Collection) (zzp)));
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #90  <Field Set zzp>
	//    9   17:invokeinterface #196 <Method boolean Set.addAll(Collection)>
	//   10   22:pop             
		return ((Set) (hashset));
	//   11   23:aload_1         
	//   12   24:areturn         
	}

	public String getServerAuthCode()
	{
		return zzj;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field String zzj>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return (getObfuscatedIdentifier().hashCode() + 527) * 31 + getRequestedScopes().hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #322 <Method String getObfuscatedIdentifier()>
	//    2    4:invokevirtual   #368 <Method int String.hashCode()>
	//    3    7:sipush          527
	//    4   10:iadd            
	//    5   11:bipush          31
	//    6   13:imul            
	//    7   14:aload_0         
	//    8   15:invokevirtual   #359 <Method Set getRequestedScopes()>
	//    9   18:invokeinterface #369 <Method int Set.hashCode()>
	//   10   23:iadd            
	//   11   24:ireturn         
	}

	public boolean isExpired()
	{
		return sClock.currentTimeMillis() / 1000L >= zzk - 300L;
	//    0    0:getstatic       #80  <Field Clock sClock>
	//    1    3:invokeinterface #132 <Method long Clock.currentTimeMillis()>
	//    2    8:ldc2w           #133 <Long 1000L>
	//    3   11:ldiv            
	//    4   12:aload_0         
	//    5   13:getfield        #106 <Field long zzk>
	//    6   16:ldc2w           #372 <Long 300L>
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
	//    3    5:getfield        #90  <Field Set zzp>
	//    4    8:aload_1         
	//    5    9:invokestatic    #380 <Method boolean Collections.addAll(Collection, Object[])>
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
	//    2    2:putfield        #104 <Field String zzj>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public String toJson()
	{
		JSONObject jsonobject = zza();
	//    0    0:aload_0         
	//    1    1:invokespecial   #383 <Method JSONObject zza()>
	//    2    4:astore_1        
		if(!(jsonobject instanceof JSONObject))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #216 <Class JSONObject>
	//*   5    9:ifne            17
			return jsonobject.toString();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #384 <Method String JSONObject.toString()>
	//    8   16:areturn         
		else
			return JSONObjectInstrumentation.toString((JSONObject)jsonobject);
	//    9   17:aload_1         
	//   10   18:checkcast       #216 <Class JSONObject>
	//   11   21:invokestatic    #387 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   12   24:areturn         
	}

	public String toJsonForStorage()
	{
		JSONObject jsonobject = zza();
	//    0    0:aload_0         
	//    1    1:invokespecial   #383 <Method JSONObject zza()>
	//    2    4:astore_1        
		jsonobject.remove("serverAuthCode");
	//    3    5:aload_1         
	//    4    6:ldc2            #272 <String "serverAuthCode">
	//    5    9:invokevirtual   #392 <Method Object JSONObject.remove(String)>
	//    6   12:pop             
		if(!(jsonobject instanceof JSONObject))
	//*   7   13:aload_1         
	//*   8   14:instanceof      #216 <Class JSONObject>
	//*   9   17:ifne            25
			return jsonobject.toString();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #384 <Method String JSONObject.toString()>
	//   12   24:areturn         
		else
			return JSONObjectInstrumentation.toString((JSONObject)jsonobject);
	//   13   25:aload_1         
	//   14   26:checkcast       #216 <Class JSONObject>
	//   15   29:invokestatic    #387 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   16   32:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #400 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeInt(parcel, 1, versionCode);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #92  <Field int versionCode>
	//    7   11:invokestatic    #404 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeString(parcel, 2, getId(), false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #295 <Method String getId()>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #408 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 3, getIdToken(), false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:invokevirtual   #301 <Method String getIdToken()>
	//   18   30:iconst_0        
	//   19   31:invokestatic    #408 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 4, getEmail(), false);
	//   20   34:aload_1         
	//   21   35:iconst_4        
	//   22   36:aload_0         
	//   23   37:invokevirtual   #303 <Method String getEmail()>
	//   24   40:iconst_0        
	//   25   41:invokestatic    #408 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 5, getDisplayName(), false);
	//   26   44:aload_1         
	//   27   45:iconst_5        
	//   28   46:aload_0         
	//   29   47:invokevirtual   #305 <Method String getDisplayName()>
	//   30   50:iconst_0        
	//   31   51:invokestatic    #408 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 6, ((android.os.Parcelable) (getPhotoUrl())), i, false);
	//   32   54:aload_1         
	//   33   55:bipush          6
	//   34   57:aload_0         
	//   35   58:invokevirtual   #312 <Method Uri getPhotoUrl()>
	//   36   61:iload_2         
	//   37   62:iconst_0        
	//   38   63:invokestatic    #412 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeString(parcel, 7, getServerAuthCode(), false);
	//   39   66:aload_1         
	//   40   67:bipush          7
	//   41   69:aload_0         
	//   42   70:invokevirtual   #317 <Method String getServerAuthCode()>
	//   43   73:iconst_0        
	//   44   74:invokestatic    #408 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeLong(parcel, 8, getExpirationTimeSecs());
	//   45   77:aload_1         
	//   46   78:bipush          8
	//   47   80:aload_0         
	//   48   81:invokevirtual   #414 <Method long getExpirationTimeSecs()>
	//   49   84:invokestatic    #418 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeString(parcel, 9, getObfuscatedIdentifier(), false);
	//   50   87:aload_1         
	//   51   88:bipush          9
	//   52   90:aload_0         
	//   53   91:invokevirtual   #322 <Method String getObfuscatedIdentifier()>
	//   54   94:iconst_0        
	//   55   95:invokestatic    #408 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeTypedList(parcel, 10, zzm, false);
	//   56   98:aload_1         
	//   57   99:bipush          10
	//   58  101:aload_0         
	//   59  102:getfield        #110 <Field List zzm>
	//   60  105:iconst_0        
	//   61  106:invokestatic    #422 <Method void SafeParcelWriter.writeTypedList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeString(parcel, 11, getGivenName(), false);
	//   62  109:aload_1         
	//   63  110:bipush          11
	//   64  112:aload_0         
	//   65  113:invokevirtual   #307 <Method String getGivenName()>
	//   66  116:iconst_0        
	//   67  117:invokestatic    #408 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 12, getFamilyName(), false);
	//   68  120:aload_1         
	//   69  121:bipush          12
	//   70  123:aload_0         
	//   71  124:invokevirtual   #309 <Method String getFamilyName()>
	//   72  127:iconst_0        
	//   73  128:invokestatic    #408 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   74  131:aload_1         
	//   75  132:iload_3         
	//   76  133:invokestatic    #425 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
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
	//    0    0:new             #67  <Class GoogleSignInAccountCreator>
	//    1    3:dup             
	//    2    4:invokespecial   #70  <Method void GoogleSignInAccountCreator()>
	//    3    7:putstatic       #72  <Field android.os.Parcelable$Creator CREATOR>
	//    4   10:invokestatic    #78  <Method Clock DefaultClock.getInstance()>
	//    5   13:putstatic       #80  <Field Clock sClock>
	//*   6   16:return          
	}
}
