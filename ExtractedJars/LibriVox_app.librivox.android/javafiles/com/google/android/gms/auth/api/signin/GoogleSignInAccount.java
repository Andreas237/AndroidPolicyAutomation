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
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import java.util.*;
import org.json.*;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//			e, d

public class GoogleSignInAccount extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	GoogleSignInAccount(int i1, String s, String s1, String s2, String s3, Uri uri, String s4, 
			long l1, String s5, List list, String s6, String s7)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void AbstractSafeParcelable()>
		n = ((Set) (new HashSet()));
	//    2    4:aload_0         
	//    3    5:new             #50  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #51  <Method void HashSet()>
	//    6   12:putfield        #53  <Field Set n>
		b = i1;
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:putfield        #55  <Field int b>
		c = s;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #57  <Field String c>
		d = s1;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #59  <Field String d>
		e = s2;
	//   16   30:aload_0         
	//   17   31:aload           4
	//   18   33:putfield        #61  <Field String e>
		f = s3;
	//   19   36:aload_0         
	//   20   37:aload           5
	//   21   39:putfield        #63  <Field String f>
		g = uri;
	//   22   42:aload_0         
	//   23   43:aload           6
	//   24   45:putfield        #65  <Field Uri g>
		h = s4;
	//   25   48:aload_0         
	//   26   49:aload           7
	//   27   51:putfield        #67  <Field String h>
		i = l1;
	//   28   54:aload_0         
	//   29   55:lload           8
	//   30   57:putfield        #69  <Field long i>
		j = s5;
	//   31   60:aload_0         
	//   32   61:aload           10
	//   33   63:putfield        #71  <Field String j>
		k = list;
	//   34   66:aload_0         
	//   35   67:aload           11
	//   36   69:putfield        #73  <Field List k>
		l = s6;
	//   37   72:aload_0         
	//   38   73:aload           12
	//   39   75:putfield        #75  <Field String l>
		m = s7;
	//   40   78:aload_0         
	//   41   79:aload           13
	//   42   81:putfield        #77  <Field String m>
	//   43   84:return          
	}

	static final int a(Scope scope, Scope scope1)
	{
		return scope.a().compareTo(scope1.a());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #83  <Method String Scope.a()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #83  <Method String Scope.a()>
	//    4    8:invokevirtual   #89  <Method int String.compareTo(String)>
	//    5   11:ireturn         
	}

	public static GoogleSignInAccount a(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #96  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		JSONObject jsonobject = new JSONObject(s);
	//    5    9:new             #98  <Class JSONObject>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokespecial   #101 <Method void JSONObject(String)>
	//    9   17:astore          5
		s = jsonobject.optString("photoUrl", ((String) (null)));
	//   10   19:aload           5
	//   11   21:ldc1            #103 <String "photoUrl">
	//   12   23:aconst_null     
	//   13   24:invokevirtual   #107 <Method String JSONObject.optString(String, String)>
	//   14   27:astore_0        
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*  15   28:aload_0         
	//*  16   29:invokestatic    #96  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  17   32:ifne            43
			s = ((String) (Uri.parse(s)));
	//   18   35:aload_0         
	//   19   36:invokestatic    #113 <Method Uri Uri.parse(String)>
	//   20   39:astore_0        
		else
	//*  21   40:goto            45
			s = null;
	//   22   43:aconst_null     
	//   23   44:astore_0        
		long l1 = Long.parseLong(jsonobject.getString("expirationTime"));
	//   24   45:aload           5
	//   25   47:ldc1            #115 <String "expirationTime">
	//   26   49:invokevirtual   #119 <Method String JSONObject.getString(String)>
	//   27   52:invokestatic    #125 <Method long Long.parseLong(String)>
	//   28   55:lstore_3        
		HashSet hashset = new HashSet();
	//   29   56:new             #50  <Class HashSet>
	//   30   59:dup             
	//   31   60:invokespecial   #51  <Method void HashSet()>
	//   32   63:astore          6
		JSONArray jsonarray = jsonobject.getJSONArray("grantedScopes");
	//   33   65:aload           5
	//   34   67:ldc1            #127 <String "grantedScopes">
	//   35   69:invokevirtual   #131 <Method JSONArray JSONObject.getJSONArray(String)>
	//   36   72:astore          7
		int j1 = jsonarray.length();
	//   37   74:aload           7
	//   38   76:invokevirtual   #137 <Method int JSONArray.length()>
	//   39   79:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*  40   80:iconst_0        
	//*  41   81:istore_1        
	//*  42   82:iload_1         
	//*  43   83:iload_2         
	//*  44   84:icmpge          115
			((Set) (hashset)).add(((Object) (new Scope(jsonarray.getString(i1)))));
	//   45   87:aload           6
	//   46   89:new             #80  <Class Scope>
	//   47   92:dup             
	//   48   93:aload           7
	//   49   95:iload_1         
	//   50   96:invokevirtual   #140 <Method String JSONArray.getString(int)>
	//   51   99:invokespecial   #141 <Method void Scope(String)>
	//   52  102:invokeinterface #147 <Method boolean Set.add(Object)>
	//   53  107:pop             

	//   54  108:iload_1         
	//   55  109:iconst_1        
	//   56  110:iadd            
	//   57  111:istore_1        
	//*  58  112:goto            82
		s = ((String) (a(jsonobject.optString("id"), jsonobject.optString("tokenId", ((String) (null))), jsonobject.optString("email", ((String) (null))), jsonobject.optString("displayName", ((String) (null))), jsonobject.optString("givenName", ((String) (null))), jsonobject.optString("familyName", ((String) (null))), ((Uri) (s)), Long.valueOf(l1), jsonobject.getString("obfuscatedIdentifier"), ((Set) (hashset)))));
	//   59  115:aload           5
	//   60  117:ldc1            #149 <String "id">
	//   61  119:invokevirtual   #151 <Method String JSONObject.optString(String)>
	//   62  122:aload           5
	//   63  124:ldc1            #153 <String "tokenId">
	//   64  126:aconst_null     
	//   65  127:invokevirtual   #107 <Method String JSONObject.optString(String, String)>
	//   66  130:aload           5
	//   67  132:ldc1            #155 <String "email">
	//   68  134:aconst_null     
	//   69  135:invokevirtual   #107 <Method String JSONObject.optString(String, String)>
	//   70  138:aload           5
	//   71  140:ldc1            #157 <String "displayName">
	//   72  142:aconst_null     
	//   73  143:invokevirtual   #107 <Method String JSONObject.optString(String, String)>
	//   74  146:aload           5
	//   75  148:ldc1            #159 <String "givenName">
	//   76  150:aconst_null     
	//   77  151:invokevirtual   #107 <Method String JSONObject.optString(String, String)>
	//   78  154:aload           5
	//   79  156:ldc1            #161 <String "familyName">
	//   80  158:aconst_null     
	//   81  159:invokevirtual   #107 <Method String JSONObject.optString(String, String)>
	//   82  162:aload_0         
	//   83  163:lload_3         
	//   84  164:invokestatic    #165 <Method Long Long.valueOf(long)>
	//   85  167:aload           5
	//   86  169:ldc1            #167 <String "obfuscatedIdentifier">
	//   87  171:invokevirtual   #119 <Method String JSONObject.getString(String)>
	//   88  174:aload           6
	//   89  176:invokestatic    #170 <Method GoogleSignInAccount a(String, String, String, String, String, String, Uri, Long, String, Set)>
	//   90  179:astore_0        
		s.h = jsonobject.optString("serverAuthCode", ((String) (null)));
	//   91  180:aload_0         
	//   92  181:aload           5
	//   93  183:ldc1            #172 <String "serverAuthCode">
	//   94  185:aconst_null     
	//   95  186:invokevirtual   #107 <Method String JSONObject.optString(String, String)>
	//   96  189:putfield        #67  <Field String h>
		return ((GoogleSignInAccount) (s));
	//   97  192:aload_0         
	//   98  193:areturn         
	}

	private static GoogleSignInAccount a(String s, String s1, String s2, String s3, String s4, String s5, Uri uri, Long long1, 
			String s6, Set set)
	{
		if(long1 == null)
	//*   0    0:aload           7
	//*   1    2:ifnonnull       25
			long1 = Long.valueOf(a.a() / 1000L);
	//    2    5:getstatic       #45  <Field e a>
	//    3    8:invokeinterface #177 <Method long e.a()>
	//    4   13:ldc2w           #178 <Long 1000L>
	//    5   16:ldiv            
	//    6   17:invokestatic    #165 <Method Long Long.valueOf(long)>
	//    7   20:astore          7
	//*   8   22:goto            25
		return new GoogleSignInAccount(3, s, s1, s2, s3, uri, ((String) (null)), long1.longValue(), am.a(s6), ((List) (new ArrayList((Collection)am.a(((Object) (set)))))), s4, s5);
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
	//   19   39:invokevirtual   #182 <Method long Long.longValue()>
	//   20   42:aload           8
	//   21   44:invokestatic    #186 <Method String am.a(String)>
	//   22   47:new             #188 <Class ArrayList>
	//   23   50:dup             
	//   24   51:aload           9
	//   25   53:invokestatic    #191 <Method Object am.a(Object)>
	//   26   56:checkcast       #193 <Class Collection>
	//   27   59:invokespecial   #196 <Method void ArrayList(Collection)>
	//   28   62:aload           4
	//   29   64:aload           5
	//   30   66:invokespecial   #198 <Method void GoogleSignInAccount(int, String, String, String, String, Uri, String, long, String, List, String, String)>
	//   31   69:areturn         
	}

	private final JSONObject n()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #98  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #202 <Method void JSONObject()>
	//    3    7:astore_3        
		int i1;
		int j1;
		JSONArray jsonarray;
		Scope ascope[];
		try
		{
			if(a() != null)
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #203 <Method String a()>
	//*   6   12:ifnull          26
				jsonobject.put("id", ((Object) (a())));
	//    7   15:aload_3         
	//    8   16:ldc1            #149 <String "id">
	//    9   18:aload_0         
	//   10   19:invokevirtual   #203 <Method String a()>
	//   11   22:invokevirtual   #207 <Method JSONObject JSONObject.put(String, Object)>
	//   12   25:pop             
			if(b() != null)
	//*  13   26:aload_0         
	//*  14   27:invokevirtual   #209 <Method String b()>
	//*  15   30:ifnull          44
				jsonobject.put("tokenId", ((Object) (b())));
	//   16   33:aload_3         
	//   17   34:ldc1            #153 <String "tokenId">
	//   18   36:aload_0         
	//   19   37:invokevirtual   #209 <Method String b()>
	//   20   40:invokevirtual   #207 <Method JSONObject JSONObject.put(String, Object)>
	//   21   43:pop             
			if(c() != null)
	//*  22   44:aload_0         
	//*  23   45:invokevirtual   #211 <Method String c()>
	//*  24   48:ifnull          62
				jsonobject.put("email", ((Object) (c())));
	//   25   51:aload_3         
	//   26   52:ldc1            #155 <String "email">
	//   27   54:aload_0         
	//   28   55:invokevirtual   #211 <Method String c()>
	//   29   58:invokevirtual   #207 <Method JSONObject JSONObject.put(String, Object)>
	//   30   61:pop             
			if(e() != null)
	//*  31   62:aload_0         
	//*  32   63:invokevirtual   #213 <Method String e()>
	//*  33   66:ifnull          80
				jsonobject.put("displayName", ((Object) (e())));
	//   34   69:aload_3         
	//   35   70:ldc1            #157 <String "displayName">
	//   36   72:aload_0         
	//   37   73:invokevirtual   #213 <Method String e()>
	//   38   76:invokevirtual   #207 <Method JSONObject JSONObject.put(String, Object)>
	//   39   79:pop             
			if(f() != null)
	//*  40   80:aload_0         
	//*  41   81:invokevirtual   #215 <Method String f()>
	//*  42   84:ifnull          98
				jsonobject.put("givenName", ((Object) (f())));
	//   43   87:aload_3         
	//   44   88:ldc1            #159 <String "givenName">
	//   45   90:aload_0         
	//   46   91:invokevirtual   #215 <Method String f()>
	//   47   94:invokevirtual   #207 <Method JSONObject JSONObject.put(String, Object)>
	//   48   97:pop             
			if(g() != null)
	//*  49   98:aload_0         
	//*  50   99:invokevirtual   #217 <Method String g()>
	//*  51  102:ifnull          116
				jsonobject.put("familyName", ((Object) (g())));
	//   52  105:aload_3         
	//   53  106:ldc1            #161 <String "familyName">
	//   54  108:aload_0         
	//   55  109:invokevirtual   #217 <Method String g()>
	//   56  112:invokevirtual   #207 <Method JSONObject JSONObject.put(String, Object)>
	//   57  115:pop             
			if(h() != null)
	//*  58  116:aload_0         
	//*  59  117:invokevirtual   #220 <Method Uri h()>
	//*  60  120:ifnull          137
				jsonobject.put("photoUrl", ((Object) (h().toString())));
	//   61  123:aload_3         
	//   62  124:ldc1            #103 <String "photoUrl">
	//   63  126:aload_0         
	//   64  127:invokevirtual   #220 <Method Uri h()>
	//   65  130:invokevirtual   #223 <Method String Uri.toString()>
	//   66  133:invokevirtual   #207 <Method JSONObject JSONObject.put(String, Object)>
	//   67  136:pop             
			if(i() != null)
	//*  68  137:aload_0         
	//*  69  138:invokevirtual   #225 <Method String i()>
	//*  70  141:ifnull          155
				jsonobject.put("serverAuthCode", ((Object) (i())));
	//   71  144:aload_3         
	//   72  145:ldc1            #172 <String "serverAuthCode">
	//   73  147:aload_0         
	//   74  148:invokevirtual   #225 <Method String i()>
	//   75  151:invokevirtual   #207 <Method JSONObject JSONObject.put(String, Object)>
	//   76  154:pop             
			jsonobject.put("expirationTime", i);
	//   77  155:aload_3         
	//   78  156:ldc1            #115 <String "expirationTime">
	//   79  158:aload_0         
	//   80  159:getfield        #69  <Field long i>
	//   81  162:invokevirtual   #228 <Method JSONObject JSONObject.put(String, long)>
	//   82  165:pop             
			jsonobject.put("obfuscatedIdentifier", ((Object) (j)));
	//   83  166:aload_3         
	//   84  167:ldc1            #167 <String "obfuscatedIdentifier">
	//   85  169:aload_0         
	//   86  170:getfield        #71  <Field String j>
	//   87  173:invokevirtual   #207 <Method JSONObject JSONObject.put(String, Object)>
	//   88  176:pop             
			jsonarray = new JSONArray();
	//   89  177:new             #133 <Class JSONArray>
	//   90  180:dup             
	//   91  181:invokespecial   #229 <Method void JSONArray()>
	//   92  184:astore          4
			ascope = (Scope[])k.toArray(((Object []) (new Scope[k.size()])));
	//   93  186:aload_0         
	//   94  187:getfield        #73  <Field List k>
	//   95  190:aload_0         
	//   96  191:getfield        #73  <Field List k>
	//   97  194:invokeinterface #234 <Method int List.size()>
	//   98  199:anewarray       Scope[]
	//   99  202:invokeinterface #238 <Method Object[] List.toArray(Object[])>
	//  100  207:checkcast       #240 <Class Scope[]>
	//  101  210:astore          5
			Arrays.sort(((Object []) (ascope)), d.a);
	//  102  212:aload           5
	//  103  214:getstatic       #245 <Field java.util.Comparator d.a>
	//  104  217:invokestatic    #251 <Method void Arrays.sort(Object[], java.util.Comparator)>
			j1 = ascope.length;
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
	//* 117  237:invokevirtual   #83  <Method String Scope.a()>
	//* 118  240:invokevirtual   #254 <Method JSONArray JSONArray.put(Object)>
	//* 119  243:pop             
	//* 120  244:iload_1         
	//* 121  245:iconst_1        
	//* 122  246:iadd            
	//* 123  247:istore_1        
	//* 124  248:goto            226
	//* 125  251:aload_3         
	//* 126  252:ldc1            #127 <String "grantedScopes">
	//* 127  254:aload           4
	//* 128  256:invokevirtual   #207 <Method JSONObject JSONObject.put(String, Object)>
	//* 129  259:pop             
	//* 130  260:aload_3         
	//* 131  261:areturn         
		catch(JSONException jsonexception)
	//* 132  262:astore_3        
		{
			throw new RuntimeException(((Throwable) (jsonexception)));
	//  133  263:new             #256 <Class RuntimeException>
	//  134  266:dup             
	//  135  267:aload_3         
	//  136  268:invokespecial   #259 <Method void RuntimeException(Throwable)>
	//  137  271:athrow          
		}
		i1 = 0;
		if(i1 >= j1)
			break; /* Loop/switch isn't completed */
		jsonarray.put(((Object) (ascope[i1].a())));
		i1++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_226;
_L1:
		jsonobject.put("grantedScopes", ((Object) (jsonarray)));
		return jsonobject;
	}

	public String a()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field String c>
	//    2    4:areturn         
	}

	public String b()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field String d>
	//    2    4:areturn         
	}

	public String c()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field String e>
	//    2    4:areturn         
	}

	public Account d()
	{
		String s = e;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field String e>
	//    2    4:astore_1        
		if(s == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return new Account(s, "com.google");
	//    7   11:new             #262 <Class Account>
	//    8   14:dup             
	//    9   15:aload_1         
	//   10   16:ldc2            #264 <String "com.google">
	//   11   19:invokespecial   #267 <Method void Account(String, String)>
	//   12   22:areturn         
	}

	public String e()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String f>
	//    2    4:areturn         
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
		return ((GoogleSignInAccount) (obj)).j.equals(((Object) (j))) && ((GoogleSignInAccount) (obj)).l().equals(((Object) (l())));
	//   13   21:aload_1         
	//   14   22:getfield        #71  <Field String j>
	//   15   25:aload_0         
	//   16   26:getfield        #71  <Field String j>
	//   17   29:invokevirtual   #270 <Method boolean String.equals(Object)>
	//   18   32:ifeq            53
	//   19   35:aload_1         
	//   20   36:invokevirtual   #273 <Method Set l()>
	//   21   39:aload_0         
	//   22   40:invokevirtual   #273 <Method Set l()>
	//   23   43:invokeinterface #274 <Method boolean Set.equals(Object)>
	//   24   48:ifeq            53
	//   25   51:iconst_1        
	//   26   52:ireturn         
	//   27   53:iconst_0        
	//   28   54:ireturn         
	}

	public String f()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field String l>
	//    2    4:areturn         
	}

	public String g()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field String m>
	//    2    4:areturn         
	}

	public Uri h()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Uri g>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return (j.hashCode() + 527) * 31 + l().hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field String j>
	//    2    4:invokevirtual   #277 <Method int String.hashCode()>
	//    3    7:sipush          527
	//    4   10:iadd            
	//    5   11:bipush          31
	//    6   13:imul            
	//    7   14:aload_0         
	//    8   15:invokevirtual   #273 <Method Set l()>
	//    9   18:invokeinterface #278 <Method int Set.hashCode()>
	//   10   23:iadd            
	//   11   24:ireturn         
	}

	public String i()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field String h>
	//    2    4:areturn         
	}

	public boolean j()
	{
		return a.a() / 1000L >= i - 300L;
	//    0    0:getstatic       #45  <Field e a>
	//    1    3:invokeinterface #177 <Method long e.a()>
	//    2    8:ldc2w           #178 <Long 1000L>
	//    3   11:ldiv            
	//    4   12:aload_0         
	//    5   13:getfield        #69  <Field long i>
	//    6   16:ldc2w           #280 <Long 300L>
	//    7   19:lsub            
	//    8   20:lcmp            
	//    9   21:iflt            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public final String k()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field String j>
	//    2    4:areturn         
	}

	public Set l()
	{
		HashSet hashset = new HashSet(((Collection) (k)));
	//    0    0:new             #50  <Class HashSet>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #73  <Field List k>
	//    4    8:invokespecial   #282 <Method void HashSet(Collection)>
	//    5   11:astore_1        
		((Set) (hashset)).addAll(((Collection) (n)));
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #53  <Field Set n>
	//    9   17:invokeinterface #286 <Method boolean Set.addAll(Collection)>
	//   10   22:pop             
		return ((Set) (hashset));
	//   11   23:aload_1         
	//   12   24:areturn         
	}

	public final String m()
	{
		JSONObject jsonobject = n();
	//    0    0:aload_0         
	//    1    1:invokespecial   #288 <Method JSONObject n()>
	//    2    4:astore_1        
		jsonobject.remove("serverAuthCode");
	//    3    5:aload_1         
	//    4    6:ldc1            #172 <String "serverAuthCode">
	//    5    8:invokevirtual   #292 <Method Object JSONObject.remove(String)>
	//    6   11:pop             
		return jsonobject.toString();
	//    7   12:aload_1         
	//    8   13:invokevirtual   #293 <Method String JSONObject.toString()>
	//    9   16:areturn         
	}

	public void writeToParcel(Parcel parcel, int i1)
	{
		int j1 = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #300 <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, b);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #55  <Field int b>
	//    7   11:invokestatic    #303 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a(), false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #203 <Method String a()>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #306 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b(), false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:invokevirtual   #209 <Method String b()>
	//   18   30:iconst_0        
	//   19   31:invokestatic    #306 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, c(), false);
	//   20   34:aload_1         
	//   21   35:iconst_4        
	//   22   36:aload_0         
	//   23   37:invokevirtual   #211 <Method String c()>
	//   24   40:iconst_0        
	//   25   41:invokestatic    #306 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, e(), false);
	//   26   44:aload_1         
	//   27   45:iconst_5        
	//   28   46:aload_0         
	//   29   47:invokevirtual   #213 <Method String e()>
	//   30   50:iconst_0        
	//   31   51:invokestatic    #306 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, ((android.os.Parcelable) (h())), i1, false);
	//   32   54:aload_1         
	//   33   55:bipush          6
	//   34   57:aload_0         
	//   35   58:invokevirtual   #220 <Method Uri h()>
	//   36   61:iload_2         
	//   37   62:iconst_0        
	//   38   63:invokestatic    #309 <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, i(), false);
	//   39   66:aload_1         
	//   40   67:bipush          7
	//   41   69:aload_0         
	//   42   70:invokevirtual   #225 <Method String i()>
	//   43   73:iconst_0        
	//   44   74:invokestatic    #306 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, i);
	//   45   77:aload_1         
	//   46   78:bipush          8
	//   47   80:aload_0         
	//   48   81:getfield        #69  <Field long i>
	//   49   84:invokestatic    #312 <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, j, false);
	//   50   87:aload_1         
	//   51   88:bipush          9
	//   52   90:aload_0         
	//   53   91:getfield        #71  <Field String j>
	//   54   94:iconst_0        
	//   55   95:invokestatic    #306 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.c(parcel, 10, k, false);
	//   56   98:aload_1         
	//   57   99:bipush          10
	//   58  101:aload_0         
	//   59  102:getfield        #73  <Field List k>
	//   60  105:iconst_0        
	//   61  106:invokestatic    #315 <Method void c.c(Parcel, int, List, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, f(), false);
	//   62  109:aload_1         
	//   63  110:bipush          11
	//   64  112:aload_0         
	//   65  113:invokevirtual   #215 <Method String f()>
	//   66  116:iconst_0        
	//   67  117:invokestatic    #306 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 12, g(), false);
	//   68  120:aload_1         
	//   69  121:bipush          12
	//   70  123:aload_0         
	//   71  124:invokevirtual   #217 <Method String g()>
	//   72  127:iconst_0        
	//   73  128:invokestatic    #306 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j1);
	//   74  131:aload_1         
	//   75  132:iload_3         
	//   76  133:invokestatic    #317 <Method void c.a(Parcel, int)>
	//   77  136:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.auth.api.signin.e();
	private static e a = com.google.android.gms.common.util.h.d();
	private final int b;
	private String c;
	private String d;
	private String e;
	private String f;
	private Uri g;
	private String h;
	private long i;
	private String j;
	private List k;
	private String l;
	private String m;
	private Set n;

	static 
	{
	//    0    0:new             #33  <Class com.google.android.gms.auth.api.signin.e>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void com.google.android.gms.auth.api.signin.e()>
	//    3    7:putstatic       #38  <Field android.os.Parcelable$Creator CREATOR>
	//    4   10:invokestatic    #43  <Method e h.d()>
	//    5   13:putstatic       #45  <Field e a>
	//*   6   16:return          
	}
}
