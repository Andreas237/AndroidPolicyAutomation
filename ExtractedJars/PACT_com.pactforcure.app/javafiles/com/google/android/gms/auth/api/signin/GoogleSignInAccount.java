// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.util.zze;
import com.google.android.gms.common.util.zzh;
import java.util.*;
import org.json.*;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//			zza

public class GoogleSignInAccount extends zza
	implements ReflectedParcelable
{

	GoogleSignInAccount(int i, String s, String s1, String s2, String s3, Uri uri, String s4, 
			long l, String s5, List list, String s6, String s7)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void zza()>
		versionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #59  <Field int versionCode>
		zzGu = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #61  <Field String zzGu>
		zzaix = s1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #63  <Field String zzaix>
		zzaiW = s2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #65  <Field String zzaiW>
		zzaiX = s3;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #67  <Field String zzaiX>
		zzaiY = uri;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #69  <Field Uri zzaiY>
		zzaiZ = s4;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #71  <Field String zzaiZ>
		zzaja = l;
	//   23   43:aload_0         
	//   24   44:lload           8
	//   25   46:putfield        #73  <Field long zzaja>
		zzajb = s5;
	//   26   49:aload_0         
	//   27   50:aload           10
	//   28   52:putfield        #75  <Field String zzajb>
		zzahM = list;
	//   29   55:aload_0         
	//   30   56:aload           11
	//   31   58:putfield        #77  <Field List zzahM>
		zzaik = s6;
	//   32   61:aload_0         
	//   33   62:aload           12
	//   34   64:putfield        #79  <Field String zzaik>
		zzail = s7;
	//   35   67:aload_0         
	//   36   68:aload           13
	//   37   70:putfield        #81  <Field String zzail>
	//   38   73:return          
	}

	public static GoogleSignInAccount zza(String s, String s1, String s2, String s3, String s4, String s5, Uri uri, Long long1, 
			String s6, Set set)
	{
		Long long2 = long1;
	//    0    0:aload           7
	//    1    2:astore          10
		if(long1 == null)
	//*   2    4:aload           7
	//*   3    6:ifnonnull       26
			long2 = Long.valueOf(zzaiV.currentTimeMillis() / 1000L);
	//    4    9:getstatic       #51  <Field zze zzaiV>
	//    5   12:invokeinterface #93  <Method long zze.currentTimeMillis()>
	//    6   17:ldc2w           #94  <Long 1000L>
	//    7   20:ldiv            
	//    8   21:invokestatic    #101 <Method Long Long.valueOf(long)>
	//    9   24:astore          10
		return new GoogleSignInAccount(3, s, s1, s2, s3, uri, ((String) (null)), long2.longValue(), zzac.zzdv(s6), ((List) (new ArrayList((Collection)zzac.zzw(((Object) (set)))))), s4, s5);
	//   10   26:new             #2   <Class GoogleSignInAccount>
	//   11   29:dup             
	//   12   30:iconst_3        
	//   13   31:aload_0         
	//   14   32:aload_1         
	//   15   33:aload_2         
	//   16   34:aload_3         
	//   17   35:aload           6
	//   18   37:aconst_null     
	//   19   38:aload           10
	//   20   40:invokevirtual   #104 <Method long Long.longValue()>
	//   21   43:aload           8
	//   22   45:invokestatic    #110 <Method String zzac.zzdv(String)>
	//   23   48:new             #112 <Class ArrayList>
	//   24   51:dup             
	//   25   52:aload           9
	//   26   54:invokestatic    #116 <Method Object zzac.zzw(Object)>
	//   27   57:checkcast       #118 <Class Collection>
	//   28   60:invokespecial   #121 <Method void ArrayList(Collection)>
	//   29   63:aload           4
	//   30   65:aload           5
	//   31   67:invokespecial   #123 <Method void GoogleSignInAccount(int, String, String, String, String, Uri, String, long, String, List, String, String)>
	//   32   70:areturn         
	}

	public static GoogleSignInAccount zzcu(String s)
		throws JSONException
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #135 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		JSONObject jsonobject = new JSONObject(s);
	//    5    9:new             #137 <Class JSONObject>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokespecial   #140 <Method void JSONObject(String)>
	//    9   17:astore          5
		s = jsonobject.optString("photoUrl", ((String) (null)));
	//   10   19:aload           5
	//   11   21:ldc1            #142 <String "photoUrl">
	//   12   23:aconst_null     
	//   13   24:invokevirtual   #146 <Method String JSONObject.optString(String, String)>
	//   14   27:astore_0        
		int j;
		long l;
		HashSet hashset;
		JSONArray jsonarray;
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*  15   28:aload_0         
	//*  16   29:invokestatic    #135 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  17   32:ifne            186
			s = ((String) (Uri.parse(s)));
	//   18   35:aload_0         
	//   19   36:invokestatic    #152 <Method Uri Uri.parse(String)>
	//   20   39:astore_0        
		else
	//*  21   40:aload           5
	//*  22   42:ldc1            #154 <String "expirationTime">
	//*  23   44:invokevirtual   #157 <Method String JSONObject.getString(String)>
	//*  24   47:invokestatic    #161 <Method long Long.parseLong(String)>
	//*  25   50:lstore_3        
	//*  26   51:new             #163 <Class HashSet>
	//*  27   54:dup             
	//*  28   55:invokespecial   #164 <Method void HashSet()>
	//*  29   58:astore          6
	//*  30   60:aload           5
	//*  31   62:ldc1            #166 <String "grantedScopes">
	//*  32   64:invokevirtual   #170 <Method JSONArray JSONObject.getJSONArray(String)>
	//*  33   67:astore          7
	//*  34   69:aload           7
	//*  35   71:invokevirtual   #176 <Method int JSONArray.length()>
	//*  36   74:istore_2        
	//*  37   75:iconst_0        
	//*  38   76:istore_1        
	//*  39   77:iload_1         
	//*  40   78:iload_2         
	//*  41   79:icmpge          110
	//*  42   82:aload           6
	//*  43   84:new             #178 <Class Scope>
	//*  44   87:dup             
	//*  45   88:aload           7
	//*  46   90:iload_1         
	//*  47   91:invokevirtual   #181 <Method String JSONArray.getString(int)>
	//*  48   94:invokespecial   #182 <Method void Scope(String)>
	//*  49   97:invokeinterface #188 <Method boolean Set.add(Object)>
	//*  50  102:pop             
	//*  51  103:iload_1         
	//*  52  104:iconst_1        
	//*  53  105:iadd            
	//*  54  106:istore_1        
	//*  55  107:goto            77
	//*  56  110:aload           5
	//*  57  112:ldc1            #190 <String "id">
	//*  58  114:invokevirtual   #192 <Method String JSONObject.optString(String)>
	//*  59  117:aload           5
	//*  60  119:ldc1            #194 <String "tokenId">
	//*  61  121:aconst_null     
	//*  62  122:invokevirtual   #146 <Method String JSONObject.optString(String, String)>
	//*  63  125:aload           5
	//*  64  127:ldc1            #196 <String "email">
	//*  65  129:aconst_null     
	//*  66  130:invokevirtual   #146 <Method String JSONObject.optString(String, String)>
	//*  67  133:aload           5
	//*  68  135:ldc1            #198 <String "displayName">
	//*  69  137:aconst_null     
	//*  70  138:invokevirtual   #146 <Method String JSONObject.optString(String, String)>
	//*  71  141:aload           5
	//*  72  143:ldc1            #200 <String "givenName">
	//*  73  145:aconst_null     
	//*  74  146:invokevirtual   #146 <Method String JSONObject.optString(String, String)>
	//*  75  149:aload           5
	//*  76  151:ldc1            #202 <String "familyName">
	//*  77  153:aconst_null     
	//*  78  154:invokevirtual   #146 <Method String JSONObject.optString(String, String)>
	//*  79  157:aload_0         
	//*  80  158:lload_3         
	//*  81  159:invokestatic    #101 <Method Long Long.valueOf(long)>
	//*  82  162:aload           5
	//*  83  164:ldc1            #204 <String "obfuscatedIdentifier">
	//*  84  166:invokevirtual   #157 <Method String JSONObject.getString(String)>
	//*  85  169:aload           6
	//*  86  171:invokestatic    #206 <Method GoogleSignInAccount zza(String, String, String, String, String, String, Uri, Long, String, Set)>
	//*  87  174:aload           5
	//*  88  176:ldc1            #208 <String "serverAuthCode">
	//*  89  178:aconst_null     
	//*  90  179:invokevirtual   #146 <Method String JSONObject.optString(String, String)>
	//*  91  182:invokevirtual   #211 <Method GoogleSignInAccount zzcv(String)>
	//*  92  185:areturn         
			s = null;
	//   93  186:aconst_null     
	//   94  187:astore_0        
		l = Long.parseLong(jsonobject.getString("expirationTime"));
		hashset = new HashSet();
		jsonarray = jsonobject.getJSONArray("grantedScopes");
		j = jsonarray.length();
		for(int i = 0; i < j; i++)
			((Set) (hashset)).add(((Object) (new Scope(jsonarray.getString(i)))));

		return zza(jsonobject.optString("id"), jsonobject.optString("tokenId", ((String) (null))), jsonobject.optString("email", ((String) (null))), jsonobject.optString("displayName", ((String) (null))), jsonobject.optString("givenName", ((String) (null))), jsonobject.optString("familyName", ((String) (null))), ((Uri) (s)), Long.valueOf(l), jsonobject.getString("obfuscatedIdentifier"), ((Set) (hashset))).zzcv(jsonobject.optString("serverAuthCode", ((String) (null))));
	//*  95  188:goto            40
	}

	private JSONObject zzqI()
	{
		Object obj;
		JSONArray jsonarray;
		obj = ((Object) (new JSONObject()));
	//    0    0:new             #137 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #216 <Method void JSONObject()>
	//    3    7:astore_1        
		try
		{
			if(getId() != null)
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #220 <Method String getId()>
	//*   6   12:ifnull          26
				((JSONObject) (obj)).put("id", ((Object) (getId())));
	//    7   15:aload_1         
	//    8   16:ldc1            #190 <String "id">
	//    9   18:aload_0         
	//   10   19:invokevirtual   #220 <Method String getId()>
	//   11   22:invokevirtual   #224 <Method JSONObject JSONObject.put(String, Object)>
	//   12   25:pop             
			if(getIdToken() != null)
	//*  13   26:aload_0         
	//*  14   27:invokevirtual   #227 <Method String getIdToken()>
	//*  15   30:ifnull          44
				((JSONObject) (obj)).put("tokenId", ((Object) (getIdToken())));
	//   16   33:aload_1         
	//   17   34:ldc1            #194 <String "tokenId">
	//   18   36:aload_0         
	//   19   37:invokevirtual   #227 <Method String getIdToken()>
	//   20   40:invokevirtual   #224 <Method JSONObject JSONObject.put(String, Object)>
	//   21   43:pop             
			if(getEmail() != null)
	//*  22   44:aload_0         
	//*  23   45:invokevirtual   #230 <Method String getEmail()>
	//*  24   48:ifnull          62
				((JSONObject) (obj)).put("email", ((Object) (getEmail())));
	//   25   51:aload_1         
	//   26   52:ldc1            #196 <String "email">
	//   27   54:aload_0         
	//   28   55:invokevirtual   #230 <Method String getEmail()>
	//   29   58:invokevirtual   #224 <Method JSONObject JSONObject.put(String, Object)>
	//   30   61:pop             
			if(getDisplayName() != null)
	//*  31   62:aload_0         
	//*  32   63:invokevirtual   #233 <Method String getDisplayName()>
	//*  33   66:ifnull          80
				((JSONObject) (obj)).put("displayName", ((Object) (getDisplayName())));
	//   34   69:aload_1         
	//   35   70:ldc1            #198 <String "displayName">
	//   36   72:aload_0         
	//   37   73:invokevirtual   #233 <Method String getDisplayName()>
	//   38   76:invokevirtual   #224 <Method JSONObject JSONObject.put(String, Object)>
	//   39   79:pop             
			if(getGivenName() != null)
	//*  40   80:aload_0         
	//*  41   81:invokevirtual   #236 <Method String getGivenName()>
	//*  42   84:ifnull          98
				((JSONObject) (obj)).put("givenName", ((Object) (getGivenName())));
	//   43   87:aload_1         
	//   44   88:ldc1            #200 <String "givenName">
	//   45   90:aload_0         
	//   46   91:invokevirtual   #236 <Method String getGivenName()>
	//   47   94:invokevirtual   #224 <Method JSONObject JSONObject.put(String, Object)>
	//   48   97:pop             
			if(getFamilyName() != null)
	//*  49   98:aload_0         
	//*  50   99:invokevirtual   #239 <Method String getFamilyName()>
	//*  51  102:ifnull          116
				((JSONObject) (obj)).put("familyName", ((Object) (getFamilyName())));
	//   52  105:aload_1         
	//   53  106:ldc1            #202 <String "familyName">
	//   54  108:aload_0         
	//   55  109:invokevirtual   #239 <Method String getFamilyName()>
	//   56  112:invokevirtual   #224 <Method JSONObject JSONObject.put(String, Object)>
	//   57  115:pop             
			if(getPhotoUrl() != null)
	//*  58  116:aload_0         
	//*  59  117:invokevirtual   #243 <Method Uri getPhotoUrl()>
	//*  60  120:ifnull          137
				((JSONObject) (obj)).put("photoUrl", ((Object) (getPhotoUrl().toString())));
	//   61  123:aload_1         
	//   62  124:ldc1            #142 <String "photoUrl">
	//   63  126:aload_0         
	//   64  127:invokevirtual   #243 <Method Uri getPhotoUrl()>
	//   65  130:invokevirtual   #246 <Method String Uri.toString()>
	//   66  133:invokevirtual   #224 <Method JSONObject JSONObject.put(String, Object)>
	//   67  136:pop             
			if(getServerAuthCode() != null)
	//*  68  137:aload_0         
	//*  69  138:invokevirtual   #249 <Method String getServerAuthCode()>
	//*  70  141:ifnull          155
				((JSONObject) (obj)).put("serverAuthCode", ((Object) (getServerAuthCode())));
	//   71  144:aload_1         
	//   72  145:ldc1            #208 <String "serverAuthCode">
	//   73  147:aload_0         
	//   74  148:invokevirtual   #249 <Method String getServerAuthCode()>
	//   75  151:invokevirtual   #224 <Method JSONObject JSONObject.put(String, Object)>
	//   76  154:pop             
			((JSONObject) (obj)).put("expirationTime", zzaja);
	//   77  155:aload_1         
	//   78  156:ldc1            #154 <String "expirationTime">
	//   79  158:aload_0         
	//   80  159:getfield        #73  <Field long zzaja>
	//   81  162:invokevirtual   #252 <Method JSONObject JSONObject.put(String, long)>
	//   82  165:pop             
			((JSONObject) (obj)).put("obfuscatedIdentifier", ((Object) (zzqF())));
	//   83  166:aload_1         
	//   84  167:ldc1            #204 <String "obfuscatedIdentifier">
	//   85  169:aload_0         
	//   86  170:invokevirtual   #255 <Method String zzqF()>
	//   87  173:invokevirtual   #224 <Method JSONObject JSONObject.put(String, Object)>
	//   88  176:pop             
			jsonarray = new JSONArray();
	//   89  177:new             #172 <Class JSONArray>
	//   90  180:dup             
	//   91  181:invokespecial   #256 <Method void JSONArray()>
	//   92  184:astore_2        
			Collections.sort(zzahM, zzajc);
	//   93  185:aload_0         
	//   94  186:getfield        #77  <Field List zzahM>
	//   95  189:getstatic       #54  <Field Comparator zzajc>
	//   96  192:invokestatic    #262 <Method void Collections.sort(List, Comparator)>
			for(Iterator iterator = zzahM.iterator(); iterator.hasNext(); jsonarray.put(((Object) (((Scope)iterator.next()).zzuS()))));
	//   97  195:aload_0         
	//   98  196:getfield        #77  <Field List zzahM>
	//   99  199:invokeinterface #268 <Method Iterator List.iterator()>
	//  100  204:astore_3        
	//  101  205:aload_3         
	//  102  206:invokeinterface #274 <Method boolean Iterator.hasNext()>
	//  103  211:ifeq            244
	//  104  214:aload_2         
	//  105  215:aload_3         
	//  106  216:invokeinterface #278 <Method Object Iterator.next()>
	//  107  221:checkcast       #178 <Class Scope>
	//  108  224:invokevirtual   #281 <Method String Scope.zzuS()>
	//  109  227:invokevirtual   #284 <Method JSONArray JSONArray.put(Object)>
	//  110  230:pop             
		}
	//* 111  231:goto            205
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 112  234:astore_1        
		{
			throw new RuntimeException(((Throwable) (obj)));
	//  113  235:new             #286 <Class RuntimeException>
	//  114  238:dup             
	//  115  239:aload_1         
	//  116  240:invokespecial   #289 <Method void RuntimeException(Throwable)>
	//  117  243:athrow          
		}
		((JSONObject) (obj)).put("grantedScopes", ((Object) (jsonarray)));
	//  118  244:aload_1         
	//  119  245:ldc1            #166 <String "grantedScopes">
	//  120  247:aload_2         
	//  121  248:invokevirtual   #224 <Method JSONObject JSONObject.put(String, Object)>
	//  122  251:pop             
		return ((JSONObject) (obj));
	//  123  252:aload_1         
	//  124  253:areturn         
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof GoogleSignInAccount))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class GoogleSignInAccount>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return ((GoogleSignInAccount)obj).zzqG().equals(((Object) (zzqG())));
	//    5    9:aload_1         
	//    6   10:checkcast       #2   <Class GoogleSignInAccount>
	//    7   13:invokevirtual   #293 <Method String zzqG()>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #293 <Method String zzqG()>
	//   10   20:invokevirtual   #297 <Method boolean String.equals(Object)>
	//   11   23:ireturn         
	}

	public Account getAccount()
	{
		if(zzaiW == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field String zzaiW>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return new Account(zzaiW, "com.google");
	//    5    9:new             #301 <Class Account>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #65  <Field String zzaiW>
	//    9   17:ldc2            #303 <String "com.google">
	//   10   20:invokespecial   #306 <Method void Account(String, String)>
	//   11   23:areturn         
	}

	public String getDisplayName()
	{
		return zzaiX;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field String zzaiX>
	//    2    4:areturn         
	}

	public String getEmail()
	{
		return zzaiW;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field String zzaiW>
	//    2    4:areturn         
	}

	public String getFamilyName()
	{
		return zzail;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field String zzail>
	//    2    4:areturn         
	}

	public String getGivenName()
	{
		return zzaik;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field String zzaik>
	//    2    4:areturn         
	}

	public Set getGrantedScopes()
	{
		return ((Set) (new HashSet(((Collection) (zzahM)))));
	//    0    0:new             #163 <Class HashSet>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #77  <Field List zzahM>
	//    4    8:invokespecial   #309 <Method void HashSet(Collection)>
	//    5   11:areturn         
	}

	public String getId()
	{
		return zzGu;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field String zzGu>
	//    2    4:areturn         
	}

	public String getIdToken()
	{
		return zzaix;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String zzaix>
	//    2    4:areturn         
	}

	public Uri getPhotoUrl()
	{
		return zzaiY;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Uri zzaiY>
	//    2    4:areturn         
	}

	public String getServerAuthCode()
	{
		return zzaiZ;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field String zzaiZ>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return zzqG().hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #293 <Method String zzqG()>
	//    2    4:invokevirtual   #313 <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.auth.api.signin.zza.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #318 <Method void com.google.android.gms.auth.api.signin.zza.zza(GoogleSignInAccount, Parcel, int)>
	//    4    6:return          
	}

	public boolean zza()
	{
		return zzaiV.currentTimeMillis() / 1000L >= zzaja - 300L;
	//    0    0:getstatic       #51  <Field zze zzaiV>
	//    1    3:invokeinterface #93  <Method long zze.currentTimeMillis()>
	//    2    8:ldc2w           #94  <Long 1000L>
	//    3   11:ldiv            
	//    4   12:aload_0         
	//    5   13:getfield        #73  <Field long zzaja>
	//    6   16:ldc2w           #319 <Long 300L>
	//    7   19:lsub            
	//    8   20:lcmp            
	//    9   21:iflt            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public GoogleSignInAccount zzcv(String s)
	{
		zzaiZ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #71  <Field String zzaiZ>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public long zzqE()
	{
		return zzaja;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field long zzaja>
	//    2    4:lreturn         
	}

	public String zzqF()
	{
		return zzajb;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field String zzajb>
	//    2    4:areturn         
	}

	public String zzqG()
	{
		return zzqI().toString();
	//    0    0:aload_0         
	//    1    1:invokespecial   #323 <Method JSONObject zzqI()>
	//    2    4:invokevirtual   #324 <Method String JSONObject.toString()>
	//    3    7:areturn         
	}

	public String zzqH()
	{
		JSONObject jsonobject = zzqI();
	//    0    0:aload_0         
	//    1    1:invokespecial   #323 <Method JSONObject zzqI()>
	//    2    4:astore_1        
		jsonobject.remove("serverAuthCode");
	//    3    5:aload_1         
	//    4    6:ldc1            #208 <String "serverAuthCode">
	//    5    8:invokevirtual   #329 <Method Object JSONObject.remove(String)>
	//    6   11:pop             
		return jsonobject.toString();
	//    7   12:aload_1         
	//    8   13:invokevirtual   #324 <Method String JSONObject.toString()>
	//    9   16:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.auth.api.signin.zza();
	public static zze zzaiV = zzh.zzyv();
	private static Comparator zzajc = new Comparator() {

		public int compare(Object obj, Object obj1)
		{
			return zza((Scope)obj, (Scope)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #18  <Class Scope>
		//    3    5:aload_2         
		//    4    6:checkcast       #18  <Class Scope>
		//    5    9:invokevirtual   #22  <Method int zza(Scope, Scope)>
		//    6   12:ireturn         
		}

		public int zza(Scope scope, Scope scope1)
		{
			return scope.zzuS().compareTo(scope1.zzuS());
		//    0    0:aload_1         
		//    1    1:invokevirtual   #26  <Method String Scope.zzuS()>
		//    2    4:aload_2         
		//    3    5:invokevirtual   #26  <Method String Scope.zzuS()>
		//    4    8:invokevirtual   #32  <Method int String.compareTo(String)>
		//    5   11:ireturn         
		}

	}
;
	final int versionCode;
	private String zzGu;
	List zzahM;
	private String zzaiW;
	private String zzaiX;
	private Uri zzaiY;
	private String zzaiZ;
	private String zzaik;
	private String zzail;
	private String zzaix;
	private long zzaja;
	private String zzajb;

	static 
	{
	//    0    0:new             #38  <Class com.google.android.gms.auth.api.signin.zza>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void com.google.android.gms.auth.api.signin.zza()>
	//    3    7:putstatic       #43  <Field android.os.Parcelable$Creator CREATOR>
	//    4   10:invokestatic    #49  <Method zze zzh.zzyv()>
	//    5   13:putstatic       #51  <Field zze zzaiV>
	//    6   16:new             #8   <Class GoogleSignInAccount$1>
	//    7   19:dup             
	//    8   20:invokespecial   #52  <Method void GoogleSignInAccount$1()>
	//    9   23:putstatic       #54  <Field Comparator zzajc>
	//*  10   26:return          
	}
}
