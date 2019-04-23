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
//			zab, zaa

public class GoogleSignInAccount extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	GoogleSignInAccount(int i, String s, String s1, String s2, String s3, Uri uri, String s4, 
			long l, String s5, List list, String s6, String s7)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method void AbstractSafeParcelable()>
		zap = ((Set) (new HashSet()));
	//    2    4:aload_0         
	//    3    5:new             #86  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #87  <Method void HashSet()>
	//    6   12:putfield        #89  <Field Set zap>
		versionCode = i;
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:putfield        #91  <Field int versionCode>
		mId = s;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #93  <Field String mId>
		zaf = s1;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #95  <Field String zaf>
		zag = s2;
	//   16   30:aload_0         
	//   17   31:aload           4
	//   18   33:putfield        #97  <Field String zag>
		zah = s3;
	//   19   36:aload_0         
	//   20   37:aload           5
	//   21   39:putfield        #99  <Field String zah>
		zai = uri;
	//   22   42:aload_0         
	//   23   43:aload           6
	//   24   45:putfield        #101 <Field Uri zai>
		zaj = s4;
	//   25   48:aload_0         
	//   26   49:aload           7
	//   27   51:putfield        #103 <Field String zaj>
		zak = l;
	//   28   54:aload_0         
	//   29   55:lload           8
	//   30   57:putfield        #105 <Field long zak>
		zal = s5;
	//   31   60:aload_0         
	//   32   61:aload           10
	//   33   63:putfield        #107 <Field String zal>
		zam = list;
	//   34   66:aload_0         
	//   35   67:aload           11
	//   36   69:putfield        #109 <Field List zam>
		zan = s6;
	//   37   72:aload_0         
	//   38   73:aload           12
	//   39   75:putfield        #111 <Field String zan>
		zao = s7;
	//   40   78:aload_0         
	//   41   79:aload           13
	//   42   81:putfield        #113 <Field String zao>
	//   43   84:return          
	}

	public static GoogleSignInAccount createDefault()
	{
		Account account = new Account("<<default account>>", "com.google");
	//    0    0:new             #122 <Class Account>
	//    1    3:dup             
	//    2    4:ldc1            #124 <String "<<default account>>">
	//    3    6:ldc1            #126 <String "com.google">
	//    4    8:invokespecial   #129 <Method void Account(String, String)>
	//    5   11:astore_0        
		HashSet hashset = new HashSet();
	//    6   12:new             #86  <Class HashSet>
	//    7   15:dup             
	//    8   16:invokespecial   #87  <Method void HashSet()>
	//    9   19:astore_1        
		return zaa(((String) (null)), ((String) (null)), account.name, ((String) (null)), ((String) (null)), ((String) (null)), ((Uri) (null)), Long.valueOf(0L), account.name, ((Set) (hashset)));
	//   10   20:aconst_null     
	//   11   21:aconst_null     
	//   12   22:aload_0         
	//   13   23:getfield        #132 <Field String Account.name>
	//   14   26:aconst_null     
	//   15   27:aconst_null     
	//   16   28:aconst_null     
	//   17   29:aconst_null     
	//   18   30:lconst_0        
	//   19   31:invokestatic    #138 <Method Long Long.valueOf(long)>
	//   20   34:aload_0         
	//   21   35:getfield        #132 <Field String Account.name>
	//   22   38:aload_1         
	//   23   39:invokestatic    #142 <Method GoogleSignInAccount zaa(String, String, String, String, String, String, Uri, Long, String, Set)>
	//   24   42:areturn         
	}

	static final int zaa(Scope scope, Scope scope1)
	{
		return scope.getScopeUri().compareTo(scope1.getScopeUri());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #149 <Method String Scope.getScopeUri()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #149 <Method String Scope.getScopeUri()>
	//    4    8:invokevirtual   #155 <Method int String.compareTo(String)>
	//    5   11:ireturn         
	}

	public static GoogleSignInAccount zaa(String s)
		throws JSONException
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #165 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		JSONObject jsonobject = new JSONObject(s);
	//    5    9:new             #167 <Class JSONObject>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokespecial   #170 <Method void JSONObject(String)>
	//    9   17:astore          5
		s = jsonobject.optString("photoUrl", ((String) (null)));
	//   10   19:aload           5
	//   11   21:ldc1            #172 <String "photoUrl">
	//   12   23:aconst_null     
	//   13   24:invokevirtual   #176 <Method String JSONObject.optString(String, String)>
	//   14   27:astore_0        
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*  15   28:aload_0         
	//*  16   29:invokestatic    #165 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  17   32:ifne            43
			s = ((String) (Uri.parse(s)));
	//   18   35:aload_0         
	//   19   36:invokestatic    #182 <Method Uri Uri.parse(String)>
	//   20   39:astore_0        
		else
	//*  21   40:goto            45
			s = null;
	//   22   43:aconst_null     
	//   23   44:astore_0        
		long l = Long.parseLong(jsonobject.getString("expirationTime"));
	//   24   45:aload           5
	//   25   47:ldc1            #184 <String "expirationTime">
	//   26   49:invokevirtual   #188 <Method String JSONObject.getString(String)>
	//   27   52:invokestatic    #192 <Method long Long.parseLong(String)>
	//   28   55:lstore_3        
		HashSet hashset = new HashSet();
	//   29   56:new             #86  <Class HashSet>
	//   30   59:dup             
	//   31   60:invokespecial   #87  <Method void HashSet()>
	//   32   63:astore          6
		JSONArray jsonarray = jsonobject.getJSONArray("grantedScopes");
	//   33   65:aload           5
	//   34   67:ldc1            #194 <String "grantedScopes">
	//   35   69:invokevirtual   #198 <Method JSONArray JSONObject.getJSONArray(String)>
	//   36   72:astore          7
		int j = jsonarray.length();
	//   37   74:aload           7
	//   38   76:invokevirtual   #204 <Method int JSONArray.length()>
	//   39   79:istore_2        
		for(int i = 0; i < j; i++)
	//*  40   80:iconst_0        
	//*  41   81:istore_1        
	//*  42   82:iload_1         
	//*  43   83:iload_2         
	//*  44   84:icmpge          115
			((Set) (hashset)).add(((Object) (new Scope(jsonarray.getString(i)))));
	//   45   87:aload           6
	//   46   89:new             #145 <Class Scope>
	//   47   92:dup             
	//   48   93:aload           7
	//   49   95:iload_1         
	//   50   96:invokevirtual   #207 <Method String JSONArray.getString(int)>
	//   51   99:invokespecial   #208 <Method void Scope(String)>
	//   52  102:invokeinterface #214 <Method boolean Set.add(Object)>
	//   53  107:pop             

	//   54  108:iload_1         
	//   55  109:iconst_1        
	//   56  110:iadd            
	//   57  111:istore_1        
	//*  58  112:goto            82
		s = ((String) (zaa(jsonobject.optString("id"), jsonobject.optString("tokenId", ((String) (null))), jsonobject.optString("email", ((String) (null))), jsonobject.optString("displayName", ((String) (null))), jsonobject.optString("givenName", ((String) (null))), jsonobject.optString("familyName", ((String) (null))), ((Uri) (s)), Long.valueOf(l), jsonobject.getString("obfuscatedIdentifier"), ((Set) (hashset)))));
	//   59  115:aload           5
	//   60  117:ldc1            #215 <String "id">
	//   61  119:invokevirtual   #217 <Method String JSONObject.optString(String)>
	//   62  122:aload           5
	//   63  124:ldc1            #219 <String "tokenId">
	//   64  126:aconst_null     
	//   65  127:invokevirtual   #176 <Method String JSONObject.optString(String, String)>
	//   66  130:aload           5
	//   67  132:ldc1            #221 <String "email">
	//   68  134:aconst_null     
	//   69  135:invokevirtual   #176 <Method String JSONObject.optString(String, String)>
	//   70  138:aload           5
	//   71  140:ldc1            #223 <String "displayName">
	//   72  142:aconst_null     
	//   73  143:invokevirtual   #176 <Method String JSONObject.optString(String, String)>
	//   74  146:aload           5
	//   75  148:ldc1            #225 <String "givenName">
	//   76  150:aconst_null     
	//   77  151:invokevirtual   #176 <Method String JSONObject.optString(String, String)>
	//   78  154:aload           5
	//   79  156:ldc1            #227 <String "familyName">
	//   80  158:aconst_null     
	//   81  159:invokevirtual   #176 <Method String JSONObject.optString(String, String)>
	//   82  162:aload_0         
	//   83  163:lload_3         
	//   84  164:invokestatic    #138 <Method Long Long.valueOf(long)>
	//   85  167:aload           5
	//   86  169:ldc1            #229 <String "obfuscatedIdentifier">
	//   87  171:invokevirtual   #188 <Method String JSONObject.getString(String)>
	//   88  174:aload           6
	//   89  176:invokestatic    #142 <Method GoogleSignInAccount zaa(String, String, String, String, String, String, Uri, Long, String, Set)>
	//   90  179:astore_0        
		s.zaj = jsonobject.optString("serverAuthCode", ((String) (null)));
	//   91  180:aload_0         
	//   92  181:aload           5
	//   93  183:ldc1            #231 <String "serverAuthCode">
	//   94  185:aconst_null     
	//   95  186:invokevirtual   #176 <Method String JSONObject.optString(String, String)>
	//   96  189:putfield        #103 <Field String zaj>
		return ((GoogleSignInAccount) (s));
	//   97  192:aload_0         
	//   98  193:areturn         
	}

	private static GoogleSignInAccount zaa(String s, String s1, String s2, String s3, String s4, String s5, Uri uri, Long long1, 
			String s6, Set set)
	{
		if(long1 == null)
	//*   0    0:aload           7
	//*   1    2:ifnonnull       25
			long1 = Long.valueOf(zae.currentTimeMillis() / 1000L);
	//    2    5:getstatic       #79  <Field Clock zae>
	//    3    8:invokeinterface #239 <Method long Clock.currentTimeMillis()>
	//    4   13:ldc2w           #240 <Long 1000L>
	//    5   16:ldiv            
	//    6   17:invokestatic    #138 <Method Long Long.valueOf(long)>
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
	//   19   39:invokevirtual   #244 <Method long Long.longValue()>
	//   20   42:aload           8
	//   21   44:invokestatic    #249 <Method String Preconditions.checkNotEmpty(String)>
	//   22   47:new             #251 <Class ArrayList>
	//   23   50:dup             
	//   24   51:aload           9
	//   25   53:invokestatic    #255 <Method Object Preconditions.checkNotNull(Object)>
	//   26   56:checkcast       #257 <Class Collection>
	//   27   59:invokespecial   #260 <Method void ArrayList(Collection)>
	//   28   62:aload           4
	//   29   64:aload           5
	//   30   66:invokespecial   #262 <Method void GoogleSignInAccount(int, String, String, String, String, Uri, String, long, String, List, String, String)>
	//   31   69:areturn         
	}

	private final JSONObject zad()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #167 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #266 <Method void JSONObject()>
	//    3    7:astore_3        
		int i;
		int j;
		JSONArray jsonarray;
		Scope ascope[];
		try
		{
			if(getId() != null)
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #268 <Method String getId()>
	//*   6   12:ifnull          26
				jsonobject.put("id", ((Object) (getId())));
	//    7   15:aload_3         
	//    8   16:ldc1            #215 <String "id">
	//    9   18:aload_0         
	//   10   19:invokevirtual   #268 <Method String getId()>
	//   11   22:invokevirtual   #272 <Method JSONObject JSONObject.put(String, Object)>
	//   12   25:pop             
			if(getIdToken() != null)
	//*  13   26:aload_0         
	//*  14   27:invokevirtual   #274 <Method String getIdToken()>
	//*  15   30:ifnull          44
				jsonobject.put("tokenId", ((Object) (getIdToken())));
	//   16   33:aload_3         
	//   17   34:ldc1            #219 <String "tokenId">
	//   18   36:aload_0         
	//   19   37:invokevirtual   #274 <Method String getIdToken()>
	//   20   40:invokevirtual   #272 <Method JSONObject JSONObject.put(String, Object)>
	//   21   43:pop             
			if(getEmail() != null)
	//*  22   44:aload_0         
	//*  23   45:invokevirtual   #276 <Method String getEmail()>
	//*  24   48:ifnull          62
				jsonobject.put("email", ((Object) (getEmail())));
	//   25   51:aload_3         
	//   26   52:ldc1            #221 <String "email">
	//   27   54:aload_0         
	//   28   55:invokevirtual   #276 <Method String getEmail()>
	//   29   58:invokevirtual   #272 <Method JSONObject JSONObject.put(String, Object)>
	//   30   61:pop             
			if(getDisplayName() != null)
	//*  31   62:aload_0         
	//*  32   63:invokevirtual   #278 <Method String getDisplayName()>
	//*  33   66:ifnull          80
				jsonobject.put("displayName", ((Object) (getDisplayName())));
	//   34   69:aload_3         
	//   35   70:ldc1            #223 <String "displayName">
	//   36   72:aload_0         
	//   37   73:invokevirtual   #278 <Method String getDisplayName()>
	//   38   76:invokevirtual   #272 <Method JSONObject JSONObject.put(String, Object)>
	//   39   79:pop             
			if(getGivenName() != null)
	//*  40   80:aload_0         
	//*  41   81:invokevirtual   #280 <Method String getGivenName()>
	//*  42   84:ifnull          98
				jsonobject.put("givenName", ((Object) (getGivenName())));
	//   43   87:aload_3         
	//   44   88:ldc1            #225 <String "givenName">
	//   45   90:aload_0         
	//   46   91:invokevirtual   #280 <Method String getGivenName()>
	//   47   94:invokevirtual   #272 <Method JSONObject JSONObject.put(String, Object)>
	//   48   97:pop             
			if(getFamilyName() != null)
	//*  49   98:aload_0         
	//*  50   99:invokevirtual   #282 <Method String getFamilyName()>
	//*  51  102:ifnull          116
				jsonobject.put("familyName", ((Object) (getFamilyName())));
	//   52  105:aload_3         
	//   53  106:ldc1            #227 <String "familyName">
	//   54  108:aload_0         
	//   55  109:invokevirtual   #282 <Method String getFamilyName()>
	//   56  112:invokevirtual   #272 <Method JSONObject JSONObject.put(String, Object)>
	//   57  115:pop             
			if(getPhotoUrl() != null)
	//*  58  116:aload_0         
	//*  59  117:invokevirtual   #285 <Method Uri getPhotoUrl()>
	//*  60  120:ifnull          137
				jsonobject.put("photoUrl", ((Object) (getPhotoUrl().toString())));
	//   61  123:aload_3         
	//   62  124:ldc1            #172 <String "photoUrl">
	//   63  126:aload_0         
	//   64  127:invokevirtual   #285 <Method Uri getPhotoUrl()>
	//   65  130:invokevirtual   #288 <Method String Uri.toString()>
	//   66  133:invokevirtual   #272 <Method JSONObject JSONObject.put(String, Object)>
	//   67  136:pop             
			if(getServerAuthCode() != null)
	//*  68  137:aload_0         
	//*  69  138:invokevirtual   #290 <Method String getServerAuthCode()>
	//*  70  141:ifnull          155
				jsonobject.put("serverAuthCode", ((Object) (getServerAuthCode())));
	//   71  144:aload_3         
	//   72  145:ldc1            #231 <String "serverAuthCode">
	//   73  147:aload_0         
	//   74  148:invokevirtual   #290 <Method String getServerAuthCode()>
	//   75  151:invokevirtual   #272 <Method JSONObject JSONObject.put(String, Object)>
	//   76  154:pop             
			jsonobject.put("expirationTime", zak);
	//   77  155:aload_3         
	//   78  156:ldc1            #184 <String "expirationTime">
	//   79  158:aload_0         
	//   80  159:getfield        #105 <Field long zak>
	//   81  162:invokevirtual   #293 <Method JSONObject JSONObject.put(String, long)>
	//   82  165:pop             
			jsonobject.put("obfuscatedIdentifier", ((Object) (zal)));
	//   83  166:aload_3         
	//   84  167:ldc1            #229 <String "obfuscatedIdentifier">
	//   85  169:aload_0         
	//   86  170:getfield        #107 <Field String zal>
	//   87  173:invokevirtual   #272 <Method JSONObject JSONObject.put(String, Object)>
	//   88  176:pop             
			jsonarray = new JSONArray();
	//   89  177:new             #200 <Class JSONArray>
	//   90  180:dup             
	//   91  181:invokespecial   #294 <Method void JSONArray()>
	//   92  184:astore          4
			ascope = (Scope[])zam.toArray(((Object []) (new Scope[zam.size()])));
	//   93  186:aload_0         
	//   94  187:getfield        #109 <Field List zam>
	//   95  190:aload_0         
	//   96  191:getfield        #109 <Field List zam>
	//   97  194:invokeinterface #299 <Method int List.size()>
	//   98  199:anewarray       Scope[]
	//   99  202:invokeinterface #303 <Method Object[] List.toArray(Object[])>
	//  100  207:checkcast       #305 <Class Scope[]>
	//  101  210:astore          5
			Arrays.sort(((Object []) (ascope)), zaa.zaq);
	//  102  212:aload           5
	//  103  214:getstatic       #311 <Field java.util.Comparator zaa.zaq>
	//  104  217:invokestatic    #317 <Method void Arrays.sort(Object[], java.util.Comparator)>
			j = ascope.length;
	//  105  220:aload           5
	//  106  222:arraylength     
	//  107  223:istore_2        
		}
	//* 108  224:iconst_0        
	//* 109  225:istore_1        
	//* 110  226:iload_1         
	//* 111  227:iload_2         
	//* 112  228:icmpge          251
	//* 113  231:aload           4
	//* 114  233:aload           5
	//* 115  235:iload_1         
	//* 116  236:aaload          
	//* 117  237:invokevirtual   #149 <Method String Scope.getScopeUri()>
	//* 118  240:invokevirtual   #320 <Method JSONArray JSONArray.put(Object)>
	//* 119  243:pop             
	//* 120  244:iload_1         
	//* 121  245:iconst_1        
	//* 122  246:iadd            
	//* 123  247:istore_1        
	//* 124  248:goto            226
	//* 125  251:aload_3         
	//* 126  252:ldc1            #194 <String "grantedScopes">
	//* 127  254:aload           4
	//* 128  256:invokevirtual   #272 <Method JSONObject JSONObject.put(String, Object)>
	//* 129  259:pop             
	//* 130  260:aload_3         
	//* 131  261:areturn         
		catch(JSONException jsonexception)
	//* 132  262:astore_3        
		{
			throw new RuntimeException(((Throwable) (jsonexception)));
	//  133  263:new             #322 <Class RuntimeException>
	//  134  266:dup             
	//  135  267:aload_3         
	//  136  268:invokespecial   #325 <Method void RuntimeException(Throwable)>
	//  137  271:athrow          
		}
		i = 0;
		if(i >= j)
			break; /* Loop/switch isn't completed */
		jsonarray.put(((Object) (ascope[i].getScopeUri())));
		i++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_226;
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
		return ((GoogleSignInAccount) (obj)).zal.equals(((Object) (zal))) && ((GoogleSignInAccount) (obj)).getRequestedScopes().equals(((Object) (getRequestedScopes())));
	//   13   21:aload_1         
	//   14   22:getfield        #107 <Field String zal>
	//   15   25:aload_0         
	//   16   26:getfield        #107 <Field String zal>
	//   17   29:invokevirtual   #328 <Method boolean String.equals(Object)>
	//   18   32:ifeq            53
	//   19   35:aload_1         
	//   20   36:invokevirtual   #332 <Method Set getRequestedScopes()>
	//   21   39:aload_0         
	//   22   40:invokevirtual   #332 <Method Set getRequestedScopes()>
	//   23   43:invokeinterface #333 <Method boolean Set.equals(Object)>
	//   24   48:ifeq            53
	//   25   51:iconst_1        
	//   26   52:ireturn         
	//   27   53:iconst_0        
	//   28   54:ireturn         
	}

	public Account getAccount()
	{
		String s = zag;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field String zag>
	//    2    4:astore_1        
		if(s == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return new Account(s, "com.google");
	//    7   11:new             #122 <Class Account>
	//    8   14:dup             
	//    9   15:aload_1         
	//   10   16:ldc1            #126 <String "com.google">
	//   11   18:invokespecial   #129 <Method void Account(String, String)>
	//   12   21:areturn         
	}

	public String getDisplayName()
	{
		return zah;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field String zah>
	//    2    4:areturn         
	}

	public String getEmail()
	{
		return zag;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field String zag>
	//    2    4:areturn         
	}

	public String getFamilyName()
	{
		return zao;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field String zao>
	//    2    4:areturn         
	}

	public String getGivenName()
	{
		return zan;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field String zan>
	//    2    4:areturn         
	}

	public Set getGrantedScopes()
	{
		return ((Set) (new HashSet(((Collection) (zam)))));
	//    0    0:new             #86  <Class HashSet>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #109 <Field List zam>
	//    4    8:invokespecial   #337 <Method void HashSet(Collection)>
	//    5   11:areturn         
	}

	public String getId()
	{
		return mId;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field String mId>
	//    2    4:areturn         
	}

	public String getIdToken()
	{
		return zaf;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field String zaf>
	//    2    4:areturn         
	}

	public Uri getPhotoUrl()
	{
		return zai;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field Uri zai>
	//    2    4:areturn         
	}

	public Set getRequestedScopes()
	{
		HashSet hashset = new HashSet(((Collection) (zam)));
	//    0    0:new             #86  <Class HashSet>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #109 <Field List zam>
	//    4    8:invokespecial   #337 <Method void HashSet(Collection)>
	//    5   11:astore_1        
		((Set) (hashset)).addAll(((Collection) (zap)));
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #89  <Field Set zap>
	//    9   17:invokeinterface #342 <Method boolean Set.addAll(Collection)>
	//   10   22:pop             
		return ((Set) (hashset));
	//   11   23:aload_1         
	//   12   24:areturn         
	}

	public String getServerAuthCode()
	{
		return zaj;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field String zaj>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return (zal.hashCode() + 527) * 31 + getRequestedScopes().hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field String zal>
	//    2    4:invokevirtual   #345 <Method int String.hashCode()>
	//    3    7:sipush          527
	//    4   10:iadd            
	//    5   11:bipush          31
	//    6   13:imul            
	//    7   14:aload_0         
	//    8   15:invokevirtual   #332 <Method Set getRequestedScopes()>
	//    9   18:invokeinterface #346 <Method int Set.hashCode()>
	//   10   23:iadd            
	//   11   24:ireturn         
	}

	public boolean isExpired()
	{
		return zae.currentTimeMillis() / 1000L >= zak - 300L;
	//    0    0:getstatic       #79  <Field Clock zae>
	//    1    3:invokeinterface #239 <Method long Clock.currentTimeMillis()>
	//    2    8:ldc2w           #240 <Long 1000L>
	//    3   11:ldiv            
	//    4   12:aload_0         
	//    5   13:getfield        #105 <Field long zak>
	//    6   16:ldc2w           #349 <Long 300L>
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
			Collections.addAll(((Collection) (zap)), ((Object []) (ascope)));
	//    2    4:aload_0         
	//    3    5:getfield        #89  <Field Set zap>
	//    4    8:aload_1         
	//    5    9:invokestatic    #357 <Method boolean Collections.addAll(Collection, Object[])>
	//    6   12:pop             
		return this;
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #365 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeInt(parcel, 1, versionCode);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #91  <Field int versionCode>
	//    7   11:invokestatic    #369 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeString(parcel, 2, getId(), false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #268 <Method String getId()>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #373 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 3, getIdToken(), false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:invokevirtual   #274 <Method String getIdToken()>
	//   18   30:iconst_0        
	//   19   31:invokestatic    #373 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 4, getEmail(), false);
	//   20   34:aload_1         
	//   21   35:iconst_4        
	//   22   36:aload_0         
	//   23   37:invokevirtual   #276 <Method String getEmail()>
	//   24   40:iconst_0        
	//   25   41:invokestatic    #373 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 5, getDisplayName(), false);
	//   26   44:aload_1         
	//   27   45:iconst_5        
	//   28   46:aload_0         
	//   29   47:invokevirtual   #278 <Method String getDisplayName()>
	//   30   50:iconst_0        
	//   31   51:invokestatic    #373 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 6, ((android.os.Parcelable) (getPhotoUrl())), i, false);
	//   32   54:aload_1         
	//   33   55:bipush          6
	//   34   57:aload_0         
	//   35   58:invokevirtual   #285 <Method Uri getPhotoUrl()>
	//   36   61:iload_2         
	//   37   62:iconst_0        
	//   38   63:invokestatic    #377 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeString(parcel, 7, getServerAuthCode(), false);
	//   39   66:aload_1         
	//   40   67:bipush          7
	//   41   69:aload_0         
	//   42   70:invokevirtual   #290 <Method String getServerAuthCode()>
	//   43   73:iconst_0        
	//   44   74:invokestatic    #373 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeLong(parcel, 8, zak);
	//   45   77:aload_1         
	//   46   78:bipush          8
	//   47   80:aload_0         
	//   48   81:getfield        #105 <Field long zak>
	//   49   84:invokestatic    #381 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeString(parcel, 9, zal, false);
	//   50   87:aload_1         
	//   51   88:bipush          9
	//   52   90:aload_0         
	//   53   91:getfield        #107 <Field String zal>
	//   54   94:iconst_0        
	//   55   95:invokestatic    #373 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeTypedList(parcel, 10, zam, false);
	//   56   98:aload_1         
	//   57   99:bipush          10
	//   58  101:aload_0         
	//   59  102:getfield        #109 <Field List zam>
	//   60  105:iconst_0        
	//   61  106:invokestatic    #385 <Method void SafeParcelWriter.writeTypedList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeString(parcel, 11, getGivenName(), false);
	//   62  109:aload_1         
	//   63  110:bipush          11
	//   64  112:aload_0         
	//   65  113:invokevirtual   #280 <Method String getGivenName()>
	//   66  116:iconst_0        
	//   67  117:invokestatic    #373 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 12, getFamilyName(), false);
	//   68  120:aload_1         
	//   69  121:bipush          12
	//   70  123:aload_0         
	//   71  124:invokevirtual   #282 <Method String getFamilyName()>
	//   72  127:iconst_0        
	//   73  128:invokestatic    #373 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   74  131:aload_1         
	//   75  132:iload_3         
	//   76  133:invokestatic    #388 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   77  136:return          
	}

	public final String zab()
	{
		return zal;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field String zal>
	//    2    4:areturn         
	}

	public final String zac()
	{
		JSONObject jsonobject = zad();
	//    0    0:aload_0         
	//    1    1:invokespecial   #392 <Method JSONObject zad()>
	//    2    4:astore_1        
		jsonobject.remove("serverAuthCode");
	//    3    5:aload_1         
	//    4    6:ldc1            #231 <String "serverAuthCode">
	//    5    8:invokevirtual   #396 <Method Object JSONObject.remove(String)>
	//    6   11:pop             
		return jsonobject.toString();
	//    7   12:aload_1         
	//    8   13:invokevirtual   #397 <Method String JSONObject.toString()>
	//    9   16:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zab();
	private static Clock zae = DefaultClock.getInstance();
	private String mId;
	private final int versionCode;
	private String zaf;
	private String zag;
	private String zah;
	private Uri zai;
	private String zaj;
	private long zak;
	private String zal;
	private List zam;
	private String zan;
	private String zao;
	private Set zap;

	static 
	{
	//    0    0:new             #66  <Class zab>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void zab()>
	//    3    7:putstatic       #71  <Field android.os.Parcelable$Creator CREATOR>
	//    4   10:invokestatic    #77  <Method Clock DefaultClock.getInstance()>
	//    5   13:putstatic       #79  <Field Clock zae>
	//*   6   16:return          
	}
}
