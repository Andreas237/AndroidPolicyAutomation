// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.*;
import org.json.*;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//			b, g, f

public class GoogleSignInOptions extends AbstractSafeParcelable
	implements j, ReflectedParcelable
{

	GoogleSignInOptions(int i1, ArrayList arraylist, Account account, boolean flag, boolean flag1, boolean flag2, String s, 
			String s1, ArrayList arraylist1)
	{
		this(i1, arraylist, account, flag, flag1, flag2, s, s1, b(((List) (arraylist1))));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:aload           7
	//    8   12:aload           8
	//    9   14:aload           9
	//   10   16:invokestatic    #99  <Method Map b(List)>
	//   11   19:invokespecial   #102 <Method void GoogleSignInOptions(int, ArrayList, Account, boolean, boolean, boolean, String, String, Map)>
	//   12   22:return          
	}

	private GoogleSignInOptions(int i1, ArrayList arraylist, Account account, boolean flag, boolean flag1, boolean flag2, String s, 
			String s1, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #103 <Method void AbstractSafeParcelable()>
		h = i1;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #105 <Field int h>
		i = arraylist;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #107 <Field ArrayList i>
		j = account;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #109 <Field Account j>
		k = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #111 <Field boolean k>
		l = flag1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #113 <Field boolean l>
		m = flag2;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #115 <Field boolean m>
		n = s;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #117 <Field String n>
		o = s1;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #119 <Field String o>
		p = new ArrayList(map.values());
	//   26   49:aload_0         
	//   27   50:new             #121 <Class ArrayList>
	//   28   53:dup             
	//   29   54:aload           9
	//   30   56:invokeinterface #127 <Method java.util.Collection Map.values()>
	//   31   61:invokespecial   #130 <Method void ArrayList(java.util.Collection)>
	//   32   64:putfield        #132 <Field ArrayList p>
		q = map;
	//   33   67:aload_0         
	//   34   68:aload           9
	//   35   70:putfield        #134 <Field Map q>
	//   36   73:return          
	}

	GoogleSignInOptions(int i1, ArrayList arraylist, Account account, boolean flag, boolean flag1, boolean flag2, String s, 
			String s1, Map map, f f1)
	{
		this(3, arraylist, account, flag, flag1, flag2, s, s1, map);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:aload           7
	//    8   12:aload           8
	//    9   14:aload           9
	//   10   16:invokespecial   #102 <Method void GoogleSignInOptions(int, ArrayList, Account, boolean, boolean, boolean, String, String, Map)>
	//   11   19:return          
	}

	public static GoogleSignInOptions a(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #142 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		JSONObject jsonobject = new JSONObject(s);
	//    5    9:new             #144 <Class JSONObject>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokespecial   #145 <Method void JSONObject(String)>
	//    9   17:astore_3        
		HashSet hashset = new HashSet();
	//   10   18:new             #147 <Class HashSet>
	//   11   21:dup             
	//   12   22:invokespecial   #148 <Method void HashSet()>
	//   13   25:astore          4
		s = ((String) (jsonobject.getJSONArray("scopes")));
	//   14   27:aload_3         
	//   15   28:ldc1            #150 <String "scopes">
	//   16   30:invokevirtual   #154 <Method JSONArray JSONObject.getJSONArray(String)>
	//   17   33:astore_0        
		int j1 = ((JSONArray) (s)).length();
	//   18   34:aload_0         
	//   19   35:invokevirtual   #160 <Method int JSONArray.length()>
	//   20   38:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*  21   39:iconst_0        
	//*  22   40:istore_1        
	//*  23   41:iload_1         
	//*  24   42:iload_2         
	//*  25   43:icmpge          73
			((Set) (hashset)).add(((Object) (new Scope(((JSONArray) (s)).getString(i1)))));
	//   26   46:aload           4
	//   27   48:new             #41  <Class Scope>
	//   28   51:dup             
	//   29   52:aload_0         
	//   30   53:iload_1         
	//   31   54:invokevirtual   #164 <Method String JSONArray.getString(int)>
	//   32   57:invokespecial   #47  <Method void Scope(String)>
	//   33   60:invokeinterface #170 <Method boolean Set.add(Object)>
	//   34   65:pop             

	//   35   66:iload_1         
	//   36   67:iconst_1        
	//   37   68:iadd            
	//   38   69:istore_1        
	//*  39   70:goto            41
		s = jsonobject.optString("accountName", ((String) (null)));
	//   40   73:aload_3         
	//   41   74:ldc1            #172 <String "accountName">
	//   42   76:aconst_null     
	//   43   77:invokevirtual   #176 <Method String JSONObject.optString(String, String)>
	//   44   80:astore_0        
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*  45   81:aload_0         
	//*  46   82:invokestatic    #142 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  47   85:ifne            102
			s = ((String) (new Account(s, "com.google")));
	//   48   88:new             #178 <Class Account>
	//   49   91:dup             
	//   50   92:aload_0         
	//   51   93:ldc1            #180 <String "com.google">
	//   52   95:invokespecial   #183 <Method void Account(String, String)>
	//   53   98:astore_0        
		else
	//*  54   99:goto            104
			s = null;
	//   55  102:aconst_null     
	//   56  103:astore_0        
		return new GoogleSignInOptions(3, new ArrayList(((java.util.Collection) (hashset))), ((Account) (s)), jsonobject.getBoolean("idTokenRequested"), jsonobject.getBoolean("serverAuthRequested"), jsonobject.getBoolean("forceCodeForRefreshToken"), jsonobject.optString("serverClientId", ((String) (null))), jsonobject.optString("hostedDomain", ((String) (null))), ((Map) (new HashMap())));
	//   57  104:new             #2   <Class GoogleSignInOptions>
	//   58  107:dup             
	//   59  108:iconst_3        
	//   60  109:new             #121 <Class ArrayList>
	//   61  112:dup             
	//   62  113:aload           4
	//   63  115:invokespecial   #130 <Method void ArrayList(java.util.Collection)>
	//   64  118:aload_0         
	//   65  119:aload_3         
	//   66  120:ldc1            #185 <String "idTokenRequested">
	//   67  122:invokevirtual   #189 <Method boolean JSONObject.getBoolean(String)>
	//   68  125:aload_3         
	//   69  126:ldc1            #191 <String "serverAuthRequested">
	//   70  128:invokevirtual   #189 <Method boolean JSONObject.getBoolean(String)>
	//   71  131:aload_3         
	//   72  132:ldc1            #193 <String "forceCodeForRefreshToken">
	//   73  134:invokevirtual   #189 <Method boolean JSONObject.getBoolean(String)>
	//   74  137:aload_3         
	//   75  138:ldc1            #195 <String "serverClientId">
	//   76  140:aconst_null     
	//   77  141:invokevirtual   #176 <Method String JSONObject.optString(String, String)>
	//   78  144:aload_3         
	//   79  145:ldc1            #197 <String "hostedDomain">
	//   80  147:aconst_null     
	//   81  148:invokevirtual   #176 <Method String JSONObject.optString(String, String)>
	//   82  151:new             #199 <Class HashMap>
	//   83  154:dup             
	//   84  155:invokespecial   #200 <Method void HashMap()>
	//   85  158:invokespecial   #102 <Method void GoogleSignInOptions(int, ArrayList, Account, boolean, boolean, boolean, String, String, Map)>
	//   86  161:areturn         
	}

	static ArrayList a(GoogleSignInOptions googlesigninoptions)
	{
		return googlesigninoptions.i;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field ArrayList i>
	//    2    4:areturn         
	}

	static Map a(List list)
	{
		return b(list);
	//    0    0:aload_0         
	//    1    1:invokestatic    #99  <Method Map b(List)>
	//    2    4:areturn         
	}

	private static Map b(List list)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #199 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #200 <Method void HashMap()>
	//    3    7:astore_1        
		if(list == null)
	//*   4    8:aload_0         
	//*   5    9:ifnonnull       14
			return ((Map) (hashmap));
	//    6   12:aload_1         
	//    7   13:areturn         
		GoogleSignInOptionsExtensionParcelable googlesigninoptionsextensionparcelable;
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((Map) (hashmap)).put(((Object) (Integer.valueOf(googlesigninoptionsextensionparcelable.a()))), ((Object) (googlesigninoptionsextensionparcelable))))
	//*   8   14:aload_0         
	//*   9   15:invokeinterface #207 <Method Iterator List.iterator()>
	//*  10   20:astore_0        
	//*  11   21:aload_0         
	//*  12   22:invokeinterface #213 <Method boolean Iterator.hasNext()>
	//*  13   27:ifeq            58
			googlesigninoptionsextensionparcelable = (GoogleSignInOptionsExtensionParcelable)((Iterator) (list)).next();
	//   14   30:aload_0         
	//   15   31:invokeinterface #217 <Method Object Iterator.next()>
	//   16   36:checkcast       #219 <Class GoogleSignInOptionsExtensionParcelable>
	//   17   39:astore_2        

	//   18   40:aload_1         
	//   19   41:aload_2         
	//   20   42:invokevirtual   #221 <Method int GoogleSignInOptionsExtensionParcelable.a()>
	//   21   45:invokestatic    #227 <Method Integer Integer.valueOf(int)>
	//   22   48:aload_2         
	//   23   49:invokeinterface #231 <Method Object Map.put(Object, Object)>
	//   24   54:pop             
	//*  25   55:goto            21
		return ((Map) (hashmap));
	//   26   58:aload_1         
	//   27   59:areturn         
	}

	static boolean b(GoogleSignInOptions googlesigninoptions)
	{
		return googlesigninoptions.l;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field boolean l>
	//    2    4:ireturn         
	}

	static boolean c(GoogleSignInOptions googlesigninoptions)
	{
		return googlesigninoptions.m;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field boolean m>
	//    2    4:ireturn         
	}

	static boolean d(GoogleSignInOptions googlesigninoptions)
	{
		return googlesigninoptions.k;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field boolean k>
	//    2    4:ireturn         
	}

	static String e(GoogleSignInOptions googlesigninoptions)
	{
		return googlesigninoptions.n;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field String n>
	//    2    4:areturn         
	}

	static Account f(GoogleSignInOptions googlesigninoptions)
	{
		return googlesigninoptions.j;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Account j>
	//    2    4:areturn         
	}

	static String g(GoogleSignInOptions googlesigninoptions)
	{
		return googlesigninoptions.o;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field String o>
	//    2    4:areturn         
	}

	static ArrayList h(GoogleSignInOptions googlesigninoptions)
	{
		return googlesigninoptions.p;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field ArrayList p>
	//    2    4:areturn         
	}

	private final JSONObject i()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #144 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #238 <Method void JSONObject()>
	//    3    7:astore_3        
		int i1;
		int j1;
		JSONArray jsonarray;
		ArrayList arraylist;
		Object obj;
		try
		{
			jsonarray = new JSONArray();
	//    4    8:new             #156 <Class JSONArray>
	//    5   11:dup             
	//    6   12:invokespecial   #239 <Method void JSONArray()>
	//    7   15:astore          4
			Collections.sort(((List) (i)), r);
	//    8   17:aload_0         
	//    9   18:getfield        #107 <Field ArrayList i>
	//   10   21:getstatic       #94  <Field Comparator r>
	//   11   24:invokestatic    #245 <Method void Collections.sort(List, Comparator)>
			arraylist = (ArrayList)i;
	//   12   27:aload_0         
	//   13   28:getfield        #107 <Field ArrayList i>
	//   14   31:checkcast       #121 <Class ArrayList>
	//   15   34:astore          5
			j1 = arraylist.size();
	//   16   36:aload           5
	//   17   38:invokevirtual   #248 <Method int ArrayList.size()>
	//   18   41:istore_2        
		}
	//*  19   42:iconst_0        
	//*  20   43:istore_1        
	//*  21   44:iload_1         
	//*  22   45:iload_2         
	//*  23   46:icmpge          78
	//*  24   49:aload           5
	//*  25   51:iload_1         
	//*  26   52:invokevirtual   #252 <Method Object ArrayList.get(int)>
	//*  27   55:astore          6
	//*  28   57:iload_1         
	//*  29   58:iconst_1        
	//*  30   59:iadd            
	//*  31   60:istore_1        
	//*  32   61:aload           4
	//*  33   63:aload           6
	//*  34   65:checkcast       #41  <Class Scope>
	//*  35   68:invokevirtual   #255 <Method String Scope.a()>
	//*  36   71:invokevirtual   #258 <Method JSONArray JSONArray.put(Object)>
	//*  37   74:pop             
	//*  38   75:goto            44
	//*  39   78:aload_3         
	//*  40   79:ldc1            #150 <String "scopes">
	//*  41   81:aload           4
	//*  42   83:invokevirtual   #261 <Method JSONObject JSONObject.put(String, Object)>
	//*  43   86:pop             
	//*  44   87:aload_0         
	//*  45   88:getfield        #109 <Field Account j>
	//*  46   91:ifnull          108
	//*  47   94:aload_3         
	//*  48   95:ldc1            #172 <String "accountName">
	//*  49   97:aload_0         
	//*  50   98:getfield        #109 <Field Account j>
	//*  51  101:getfield        #264 <Field String Account.name>
	//*  52  104:invokevirtual   #261 <Method JSONObject JSONObject.put(String, Object)>
	//*  53  107:pop             
	//*  54  108:aload_3         
	//*  55  109:ldc1            #185 <String "idTokenRequested">
	//*  56  111:aload_0         
	//*  57  112:getfield        #111 <Field boolean k>
	//*  58  115:invokevirtual   #267 <Method JSONObject JSONObject.put(String, boolean)>
	//*  59  118:pop             
	//*  60  119:aload_3         
	//*  61  120:ldc1            #193 <String "forceCodeForRefreshToken">
	//*  62  122:aload_0         
	//*  63  123:getfield        #115 <Field boolean m>
	//*  64  126:invokevirtual   #267 <Method JSONObject JSONObject.put(String, boolean)>
	//*  65  129:pop             
	//*  66  130:aload_3         
	//*  67  131:ldc1            #191 <String "serverAuthRequested">
	//*  68  133:aload_0         
	//*  69  134:getfield        #113 <Field boolean l>
	//*  70  137:invokevirtual   #267 <Method JSONObject JSONObject.put(String, boolean)>
	//*  71  140:pop             
	//*  72  141:aload_0         
	//*  73  142:getfield        #117 <Field String n>
	//*  74  145:invokestatic    #142 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  75  148:ifne            162
	//*  76  151:aload_3         
	//*  77  152:ldc1            #195 <String "serverClientId">
	//*  78  154:aload_0         
	//*  79  155:getfield        #117 <Field String n>
	//*  80  158:invokevirtual   #261 <Method JSONObject JSONObject.put(String, Object)>
	//*  81  161:pop             
	//*  82  162:aload_0         
	//*  83  163:getfield        #119 <Field String o>
	//*  84  166:invokestatic    #142 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  85  169:ifne            183
	//*  86  172:aload_3         
	//*  87  173:ldc1            #197 <String "hostedDomain">
	//*  88  175:aload_0         
	//*  89  176:getfield        #119 <Field String o>
	//*  90  179:invokevirtual   #261 <Method JSONObject JSONObject.put(String, Object)>
	//*  91  182:pop             
	//*  92  183:aload_3         
	//*  93  184:areturn         
		catch(JSONException jsonexception)
	//*  94  185:astore_3        
		{
			throw new RuntimeException(((Throwable) (jsonexception)));
	//   95  186:new             #269 <Class RuntimeException>
	//   96  189:dup             
	//   97  190:aload_3         
	//   98  191:invokespecial   #272 <Method void RuntimeException(Throwable)>
	//   99  194:athrow          
		}
		i1 = 0;
		if(i1 >= j1)
			break MISSING_BLOCK_LABEL_78;
		obj = arraylist.get(i1);
		i1++;
		jsonarray.put(((Object) (((Scope)obj).a())));
		break MISSING_BLOCK_LABEL_44;
		jsonobject.put("scopes", ((Object) (jsonarray)));
		if(j != null)
			jsonobject.put("accountName", ((Object) (j.name)));
		jsonobject.put("idTokenRequested", k);
		jsonobject.put("forceCodeForRefreshToken", m);
		jsonobject.put("serverAuthRequested", l);
		if(!TextUtils.isEmpty(((CharSequence) (n))))
			jsonobject.put("serverClientId", ((Object) (n)));
		if(!TextUtils.isEmpty(((CharSequence) (o))))
			jsonobject.put("hostedDomain", ((Object) (o)));
		return jsonobject;
	}

	public ArrayList a()
	{
		return new ArrayList(((java.util.Collection) (i)));
	//    0    0:new             #121 <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #107 <Field ArrayList i>
	//    4    8:invokespecial   #130 <Method void ArrayList(java.util.Collection)>
	//    5   11:areturn         
	}

	public Account b()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Account j>
	//    2    4:areturn         
	}

	public boolean c()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field boolean k>
	//    2    4:ireturn         
	}

	public boolean d()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field boolean l>
	//    2    4:ireturn         
	}

	public boolean e()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field boolean m>
	//    2    4:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		obj = ((Object) ((GoogleSignInOptions)obj));
	//    4    6:aload_1         
	//    5    7:checkcast       #2   <Class GoogleSignInOptions>
	//    6   10:astore_1        
		if(p.size() > 0)
			break MISSING_BLOCK_LABEL_177;
	//    7   11:aload_0         
	//    8   12:getfield        #132 <Field ArrayList p>
	//    9   15:invokevirtual   #248 <Method int ArrayList.size()>
	//   10   18:ifgt            177
		if(((GoogleSignInOptions) (obj)).p.size() > 0)
	//*  11   21:aload_1         
	//*  12   22:getfield        #132 <Field ArrayList p>
	//*  13   25:invokevirtual   #248 <Method int ArrayList.size()>
	//*  14   28:ifle            33
			return false;
	//   15   31:iconst_0        
	//   16   32:ireturn         
		if(i.size() != ((GoogleSignInOptions) (obj)).a().size())
			break MISSING_BLOCK_LABEL_175;
	//   17   33:aload_0         
	//   18   34:getfield        #107 <Field ArrayList i>
	//   19   37:invokevirtual   #248 <Method int ArrayList.size()>
	//   20   40:aload_1         
	//   21   41:invokevirtual   #279 <Method ArrayList a()>
	//   22   44:invokevirtual   #248 <Method int ArrayList.size()>
	//   23   47:icmpne          175
		if(!i.containsAll(((java.util.Collection) (((GoogleSignInOptions) (obj)).a()))))
	//*  24   50:aload_0         
	//*  25   51:getfield        #107 <Field ArrayList i>
	//*  26   54:aload_1         
	//*  27   55:invokevirtual   #279 <Method ArrayList a()>
	//*  28   58:invokevirtual   #283 <Method boolean ArrayList.containsAll(java.util.Collection)>
	//*  29   61:ifne            66
			return false;
	//   30   64:iconst_0        
	//   31   65:ireturn         
		boolean flag;
		boolean flag1;
		try
		{
			if(j == null)
	//*  32   66:aload_0         
	//*  33   67:getfield        #109 <Field Account j>
	//*  34   70:ifnonnull       83
			{
				if(((GoogleSignInOptions) (obj)).b() != null)
	//*  35   73:aload_1         
	//*  36   74:invokevirtual   #285 <Method Account b()>
	//*  37   77:ifnonnull       173
					break MISSING_BLOCK_LABEL_173;
	//   38   80:goto            97
				break MISSING_BLOCK_LABEL_97;
			}
		}
	//*  39   83:aload_0         
	//*  40   84:getfield        #109 <Field Account j>
	//*  41   87:aload_1         
	//*  42   88:invokevirtual   #285 <Method Account b()>
	//*  43   91:invokevirtual   #287 <Method boolean Account.equals(Object)>
	//*  44   94:ifeq            173
	//*  45   97:aload_0         
	//*  46   98:getfield        #117 <Field String n>
	//*  47  101:invokestatic    #142 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  48  104:ifeq            120
	//*  49  107:aload_1         
	//*  50  108:invokevirtual   #289 <Method String f()>
	//*  51  111:invokestatic    #142 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  52  114:ifeq            173
	//*  53  117:goto            134
	//*  54  120:aload_0         
	//*  55  121:getfield        #117 <Field String n>
	//*  56  124:aload_1         
	//*  57  125:invokevirtual   #289 <Method String f()>
	//*  58  128:invokevirtual   #292 <Method boolean String.equals(Object)>
	//*  59  131:ifeq            173
	//*  60  134:aload_0         
	//*  61  135:getfield        #115 <Field boolean m>
	//*  62  138:aload_1         
	//*  63  139:invokevirtual   #294 <Method boolean e()>
	//*  64  142:icmpne          173
	//*  65  145:aload_0         
	//*  66  146:getfield        #111 <Field boolean k>
	//*  67  149:aload_1         
	//*  68  150:invokevirtual   #296 <Method boolean c()>
	//*  69  153:icmpne          173
	//*  70  156:aload_0         
	//*  71  157:getfield        #113 <Field boolean l>
	//*  72  160:istore_2        
	//*  73  161:aload_1         
	//*  74  162:invokevirtual   #298 <Method boolean d()>
	//*  75  165:istore_3        
	//*  76  166:iload_2         
	//*  77  167:iload_3         
	//*  78  168:icmpne          173
	//*  79  171:iconst_1        
	//*  80  172:ireturn         
	//*  81  173:iconst_0        
	//*  82  174:ireturn         
	//*  83  175:iconst_0        
	//*  84  176:ireturn         
	//*  85  177:iconst_0        
	//*  86  178:ireturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  87  179:astore_1        
		{
			return false;
	//   88  180:iconst_0        
	//   89  181:ireturn         
		}
		if(!j.equals(((Object) (((GoogleSignInOptions) (obj)).b()))))
			break MISSING_BLOCK_LABEL_173;
		if(TextUtils.isEmpty(((CharSequence) (n))))
		{
			if(!TextUtils.isEmpty(((CharSequence) (((GoogleSignInOptions) (obj)).f()))))
				break MISSING_BLOCK_LABEL_173;
			break MISSING_BLOCK_LABEL_134;
		}
		if(!n.equals(((Object) (((GoogleSignInOptions) (obj)).f()))))
			break MISSING_BLOCK_LABEL_173;
		if(m != ((GoogleSignInOptions) (obj)).e() || k != ((GoogleSignInOptions) (obj)).c())
			break MISSING_BLOCK_LABEL_173;
		flag = l;
		flag1 = ((GoogleSignInOptions) (obj)).d();
		if(flag == flag1)
			return true;
		return false;
		return false;
		return false;
	}

	public String f()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field String n>
	//    2    4:areturn         
	}

	public ArrayList g()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field ArrayList p>
	//    2    4:areturn         
	}

	public final String h()
	{
		return i().toString();
	//    0    0:aload_0         
	//    1    1:invokespecial   #300 <Method JSONObject i()>
	//    2    4:invokevirtual   #303 <Method String JSONObject.toString()>
	//    3    7:areturn         
	}

	public int hashCode()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #121 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #305 <Method void ArrayList()>
	//    3    7:astore_3        
		ArrayList arraylist1 = (ArrayList)i;
	//    4    8:aload_0         
	//    5    9:getfield        #107 <Field ArrayList i>
	//    6   12:checkcast       #121 <Class ArrayList>
	//    7   15:astore          4
		int j1 = arraylist1.size();
	//    8   17:aload           4
	//    9   19:invokevirtual   #248 <Method int ArrayList.size()>
	//   10   22:istore_2        
		for(int i1 = 0; i1 < j1;)
	//*  11   23:iconst_0        
	//*  12   24:istore_1        
	//*  13   25:iload_1         
	//*  14   26:iload_2         
	//*  15   27:icmpge          58
		{
			Object obj = arraylist1.get(i1);
	//   16   30:aload           4
	//   17   32:iload_1         
	//   18   33:invokevirtual   #252 <Method Object ArrayList.get(int)>
	//   19   36:astore          5
			i1++;
	//   20   38:iload_1         
	//   21   39:iconst_1        
	//   22   40:iadd            
	//   23   41:istore_1        
			arraylist.add(((Object) (((Scope)obj).a())));
	//   24   42:aload_3         
	//   25   43:aload           5
	//   26   45:checkcast       #41  <Class Scope>
	//   27   48:invokevirtual   #255 <Method String Scope.a()>
	//   28   51:invokevirtual   #306 <Method boolean ArrayList.add(Object)>
	//   29   54:pop             
		}

	//*  30   55:goto            25
		Collections.sort(((List) (arraylist)));
	//   31   58:aload_3         
	//   32   59:invokestatic    #309 <Method void Collections.sort(List)>
		return (new a()).a(((Object) (arraylist))).a(((Object) (j))).a(((Object) (n))).a(m).a(k).a(l).a();
	//   33   62:new             #311 <Class a>
	//   34   65:dup             
	//   35   66:invokespecial   #312 <Method void a()>
	//   36   69:aload_3         
	//   37   70:invokevirtual   #315 <Method a a.a(Object)>
	//   38   73:aload_0         
	//   39   74:getfield        #109 <Field Account j>
	//   40   77:invokevirtual   #315 <Method a a.a(Object)>
	//   41   80:aload_0         
	//   42   81:getfield        #117 <Field String n>
	//   43   84:invokevirtual   #315 <Method a a.a(Object)>
	//   44   87:aload_0         
	//   45   88:getfield        #115 <Field boolean m>
	//   46   91:invokevirtual   #318 <Method a a.a(boolean)>
	//   47   94:aload_0         
	//   48   95:getfield        #111 <Field boolean k>
	//   49   98:invokevirtual   #318 <Method a a.a(boolean)>
	//   50  101:aload_0         
	//   51  102:getfield        #113 <Field boolean l>
	//   52  105:invokevirtual   #318 <Method a a.a(boolean)>
	//   53  108:invokevirtual   #319 <Method int a.a()>
	//   54  111:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i1)
	{
		int j1 = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #326 <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, h);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #105 <Field int h>
	//    7   11:invokestatic    #329 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.c(parcel, 2, ((List) (a())), false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #279 <Method ArrayList a()>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #332 <Method void c.c(Parcel, int, List, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, ((android.os.Parcelable) (b())), i1, false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:invokevirtual   #285 <Method Account b()>
	//   18   30:iload_2         
	//   19   31:iconst_0        
	//   20   32:invokestatic    #335 <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, c());
	//   21   35:aload_1         
	//   22   36:iconst_4        
	//   23   37:aload_0         
	//   24   38:invokevirtual   #296 <Method boolean c()>
	//   25   41:invokestatic    #338 <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, d());
	//   26   44:aload_1         
	//   27   45:iconst_5        
	//   28   46:aload_0         
	//   29   47:invokevirtual   #298 <Method boolean d()>
	//   30   50:invokestatic    #338 <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, e());
	//   31   53:aload_1         
	//   32   54:bipush          6
	//   33   56:aload_0         
	//   34   57:invokevirtual   #294 <Method boolean e()>
	//   35   60:invokestatic    #338 <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, f(), false);
	//   36   63:aload_1         
	//   37   64:bipush          7
	//   38   66:aload_0         
	//   39   67:invokevirtual   #289 <Method String f()>
	//   40   70:iconst_0        
	//   41   71:invokestatic    #341 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, o, false);
	//   42   74:aload_1         
	//   43   75:bipush          8
	//   44   77:aload_0         
	//   45   78:getfield        #119 <Field String o>
	//   46   81:iconst_0        
	//   47   82:invokestatic    #341 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.c(parcel, 9, ((List) (g())), false);
	//   48   85:aload_1         
	//   49   86:bipush          9
	//   50   88:aload_0         
	//   51   89:invokevirtual   #343 <Method ArrayList g()>
	//   52   92:iconst_0        
	//   53   93:invokestatic    #332 <Method void c.c(Parcel, int, List, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j1);
	//   54   96:aload_1         
	//   55   97:iload_3         
	//   56   98:invokestatic    #345 <Method void c.a(Parcel, int)>
	//   57  101:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new g();
	public static final Scope a = new Scope("profile");
	public static final Scope b = new Scope("email");
	public static final Scope c = new Scope("openid");
	public static final Scope d;
	public static final Scope e = new Scope("https://www.googleapis.com/auth/games");
	public static final GoogleSignInOptions f = (new b()).a().c().d();
	public static final GoogleSignInOptions g;
	private static Comparator r = new f();
	private final int h;
	private final ArrayList i;
	private Account j;
	private boolean k;
	private final boolean l;
	private final boolean m;
	private String n;
	private String o;
	private ArrayList p;
	private Map q;

	static 
	{
	//    0    0:new             #41  <Class Scope>
	//    1    3:dup             
	//    2    4:ldc1            #43  <String "profile">
	//    3    6:invokespecial   #47  <Method void Scope(String)>
	//    4    9:putstatic       #49  <Field Scope a>
	//    5   12:new             #41  <Class Scope>
	//    6   15:dup             
	//    7   16:ldc1            #51  <String "email">
	//    8   18:invokespecial   #47  <Method void Scope(String)>
	//    9   21:putstatic       #53  <Field Scope b>
	//   10   24:new             #41  <Class Scope>
	//   11   27:dup             
	//   12   28:ldc1            #55  <String "openid">
	//   13   30:invokespecial   #47  <Method void Scope(String)>
	//   14   33:putstatic       #57  <Field Scope c>
		d = new Scope("https://www.googleapis.com/auth/games_lite");
	//   15   36:new             #41  <Class Scope>
	//   16   39:dup             
	//   17   40:ldc1            #59  <String "https://www.googleapis.com/auth/games_lite">
	//   18   42:invokespecial   #47  <Method void Scope(String)>
	//   19   45:putstatic       #61  <Field Scope d>
	//   20   48:new             #41  <Class Scope>
	//   21   51:dup             
	//   22   52:ldc1            #63  <String "https://www.googleapis.com/auth/games">
	//   23   54:invokespecial   #47  <Method void Scope(String)>
	//   24   57:putstatic       #65  <Field Scope e>
	//   25   60:new             #67  <Class b>
	//   26   63:dup             
	//   27   64:invokespecial   #69  <Method void b()>
	//   28   67:invokevirtual   #72  <Method b com.google.android.gms.auth.api.signin.b.a()>
	//   29   70:invokevirtual   #74  <Method b com.google.android.gms.auth.api.signin.b.c()>
	//   30   73:invokevirtual   #77  <Method GoogleSignInOptions b.d()>
	//   31   76:putstatic       #79  <Field GoogleSignInOptions f>
		g = (new b()).a(d, new Scope[0]).d();
	//   32   79:new             #67  <Class b>
	//   33   82:dup             
	//   34   83:invokespecial   #69  <Method void b()>
	//   35   86:getstatic       #61  <Field Scope d>
	//   36   89:iconst_0        
	//   37   90:anewarray       Scope[]
	//   38   93:invokevirtual   #82  <Method b com.google.android.gms.auth.api.signin.b.a(Scope, Scope[])>
	//   39   96:invokevirtual   #77  <Method GoogleSignInOptions b.d()>
	//   40   99:putstatic       #84  <Field GoogleSignInOptions g>
	//   41  102:new             #86  <Class g>
	//   42  105:dup             
	//   43  106:invokespecial   #87  <Method void g()>
	//   44  109:putstatic       #89  <Field android.os.Parcelable$Creator CREATOR>
	//   45  112:new             #91  <Class f>
	//   46  115:dup             
	//   47  116:invokespecial   #92  <Method void f()>
	//   48  119:putstatic       #94  <Field Comparator r>
	//*  49  122:return          
	}
}
