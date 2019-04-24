// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.zzg;
import com.google.android.gms.auth.api.signin.internal.zzh;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzac;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//			zzb, GoogleSignInOptionsExtension

public class GoogleSignInOptions extends zza
	implements com.google.android.gms.common.api.Api.ApiOptions.Optional, ReflectedParcelable
{
	public static final class Builder
	{

		private String zzcy(String s)
		{
			zzac.zzdr(s);
		//    0    0:aload_1         
		//    1    1:invokestatic    #98  <Method String zzac.zzdr(String)>
		//    2    4:pop             
			boolean flag;
			if(zzajw == null || zzajw.equals(((Object) (s))))
		//*   3    5:aload_0         
		//*   4    6:getfield        #74  <Field String zzajw>
		//*   5    9:ifnull          23
		//*   6   12:aload_0         
		//*   7   13:getfield        #74  <Field String zzajw>
		//*   8   16:aload_1         
		//*   9   17:invokevirtual   #104 <Method boolean String.equals(Object)>
		//*  10   20:ifeq            28
				flag = true;
		//   11   23:iconst_1        
		//   12   24:istore_2        
			else
		//*  13   25:goto            30
				flag = false;
		//   14   28:iconst_0        
		//   15   29:istore_2        
			zzac.zzb(flag, "two different server client ids provided");
		//   16   30:iload_2         
		//   17   31:ldc1            #106 <String "two different server client ids provided">
		//   18   33:invokestatic    #109 <Method void zzac.zzb(boolean, Object)>
			return s;
		//   19   36:aload_1         
		//   20   37:areturn         
		}

		public Builder addExtension(GoogleSignInOptionsExtension googlesigninoptionsextension)
		{
			if(zzakr.containsKey(((Object) (Integer.valueOf(1)))))
		//*   0    0:aload_0         
		//*   1    1:getfield        #36  <Field Map zzakr>
		//*   2    4:iconst_1        
		//*   3    5:invokestatic    #117 <Method Integer Integer.valueOf(int)>
		//*   4    8:invokeinterface #122 <Method boolean Map.containsKey(Object)>
		//*   5   13:ifeq            26
			{
				throw new IllegalStateException("Only one extension per type may be added");
		//    6   16:new             #124 <Class IllegalStateException>
		//    7   19:dup             
		//    8   20:ldc1            #126 <String "Only one extension per type may be added">
		//    9   22:invokespecial   #129 <Method void IllegalStateException(String)>
		//   10   25:athrow          
			} else
			{
				zzakr.put(((Object) (Integer.valueOf(1))), ((Object) (new zzg(googlesigninoptionsextension))));
		//   11   26:aload_0         
		//   12   27:getfield        #36  <Field Map zzakr>
		//   13   30:iconst_1        
		//   14   31:invokestatic    #117 <Method Integer Integer.valueOf(int)>
		//   15   34:new             #131 <Class zzg>
		//   16   37:dup             
		//   17   38:aload_1         
		//   18   39:invokespecial   #134 <Method void zzg(GoogleSignInOptionsExtension)>
		//   19   42:invokeinterface #138 <Method Object Map.put(Object, Object)>
		//   20   47:pop             
				return this;
		//   21   48:aload_0         
		//   22   49:areturn         
			}
		}

		public GoogleSignInOptions build()
		{
			if(zzajv && (zzahh == null || !zzakq.isEmpty()))
		//*   0    0:aload_0         
		//*   1    1:getfield        #68  <Field boolean zzajv>
		//*   2    4:ifeq            31
		//*   3    7:aload_0         
		//*   4    8:getfield        #80  <Field Account zzahh>
		//*   5   11:ifnull          26
		//*   6   14:aload_0         
		//*   7   15:getfield        #31  <Field Set zzakq>
		//*   8   18:invokeinterface #146 <Method boolean Set.isEmpty()>
		//*   9   23:ifne            31
				requestId();
		//   10   26:aload_0         
		//   11   27:invokevirtual   #150 <Method GoogleSignInOptions$Builder requestId()>
		//   12   30:pop             
			return new GoogleSignInOptions(3, new ArrayList(((java.util.Collection) (zzakq))), zzahh, zzajv, zzakl, zzakm, zzajw, zzakn, zzakr);
		//   13   31:new             #6   <Class GoogleSignInOptions>
		//   14   34:dup             
		//   15   35:iconst_3        
		//   16   36:new             #152 <Class ArrayList>
		//   17   39:dup             
		//   18   40:aload_0         
		//   19   41:getfield        #31  <Field Set zzakq>
		//   20   44:invokespecial   #153 <Method void ArrayList(java.util.Collection)>
		//   21   47:aload_0         
		//   22   48:getfield        #80  <Field Account zzahh>
		//   23   51:aload_0         
		//   24   52:getfield        #68  <Field boolean zzajv>
		//   25   55:aload_0         
		//   26   56:getfield        #58  <Field boolean zzakl>
		//   27   59:aload_0         
		//   28   60:getfield        #63  <Field boolean zzakm>
		//   29   63:aload_0         
		//   30   64:getfield        #74  <Field String zzajw>
		//   31   67:aload_0         
		//   32   68:getfield        #85  <Field String zzakn>
		//   33   71:aload_0         
		//   34   72:getfield        #36  <Field Map zzakr>
		//   35   75:aconst_null     
		//   36   76:invokespecial   #156 <Method void GoogleSignInOptions(int, ArrayList, Account, boolean, boolean, boolean, String, String, Map, GoogleSignInOptions$1)>
		//   37   79:areturn         
		}

		public Builder requestEmail()
		{
			zzakq.add(((Object) (GoogleSignInOptions.zzaki)));
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field Set zzakq>
		//    2    4:getstatic       #161 <Field Scope GoogleSignInOptions.zzaki>
		//    3    7:invokeinterface #164 <Method boolean Set.add(Object)>
		//    4   12:pop             
			return this;
		//    5   13:aload_0         
		//    6   14:areturn         
		}

		public Builder requestId()
		{
			zzakq.add(((Object) (GoogleSignInOptions.zzakj)));
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field Set zzakq>
		//    2    4:getstatic       #167 <Field Scope GoogleSignInOptions.zzakj>
		//    3    7:invokeinterface #164 <Method boolean Set.add(Object)>
		//    4   12:pop             
			return this;
		//    5   13:aload_0         
		//    6   14:areturn         
		}

		public Builder requestIdToken(String s)
		{
			zzajv = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #68  <Field boolean zzajv>
			zzajw = zzcy(s);
		//    3    5:aload_0         
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokespecial   #171 <Method String zzcy(String)>
		//    7   11:putfield        #74  <Field String zzajw>
			return this;
		//    8   14:aload_0         
		//    9   15:areturn         
		}

		public Builder requestProfile()
		{
			zzakq.add(((Object) (GoogleSignInOptions.zzakh)));
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field Set zzakq>
		//    2    4:getstatic       #175 <Field Scope GoogleSignInOptions.zzakh>
		//    3    7:invokeinterface #164 <Method boolean Set.add(Object)>
		//    4   12:pop             
			return this;
		//    5   13:aload_0         
		//    6   14:areturn         
		}

		public transient Builder requestScopes(Scope scope, Scope ascope[])
		{
			zzakq.add(((Object) (scope)));
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field Set zzakq>
		//    2    4:aload_1         
		//    3    5:invokeinterface #164 <Method boolean Set.add(Object)>
		//    4   10:pop             
			zzakq.addAll(((java.util.Collection) (Arrays.asList(((Object []) (ascope))))));
		//    5   11:aload_0         
		//    6   12:getfield        #31  <Field Set zzakq>
		//    7   15:aload_2         
		//    8   16:invokestatic    #183 <Method List Arrays.asList(Object[])>
		//    9   19:invokeinterface #187 <Method boolean Set.addAll(java.util.Collection)>
		//   10   24:pop             
			return this;
		//   11   25:aload_0         
		//   12   26:areturn         
		}

		public Builder requestServerAuthCode(String s)
		{
			return requestServerAuthCode(s, false);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #191 <Method GoogleSignInOptions$Builder requestServerAuthCode(String, boolean)>
		//    4    6:areturn         
		}

		public Builder requestServerAuthCode(String s, boolean flag)
		{
			zzakl = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #58  <Field boolean zzakl>
			zzajw = zzcy(s);
		//    3    5:aload_0         
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokespecial   #171 <Method String zzcy(String)>
		//    7   11:putfield        #74  <Field String zzajw>
			zzakm = flag;
		//    8   14:aload_0         
		//    9   15:iload_2         
		//   10   16:putfield        #63  <Field boolean zzakm>
			return this;
		//   11   19:aload_0         
		//   12   20:areturn         
		}

		public Builder setAccountName(String s)
		{
			zzahh = new Account(zzac.zzdr(s), "com.google");
		//    0    0:aload_0         
		//    1    1:new             #194 <Class Account>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:invokestatic    #98  <Method String zzac.zzdr(String)>
		//    5    9:ldc1            #196 <String "com.google">
		//    6   11:invokespecial   #199 <Method void Account(String, String)>
		//    7   14:putfield        #80  <Field Account zzahh>
			return this;
		//    8   17:aload_0         
		//    9   18:areturn         
		}

		public Builder setHostedDomain(String s)
		{
			zzakn = zzac.zzdr(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #98  <Method String zzac.zzdr(String)>
		//    3    5:putfield        #85  <Field String zzakn>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		private Account zzahh;
		private boolean zzajv;
		private String zzajw;
		private boolean zzakl;
		private boolean zzakm;
		private String zzakn;
		private Set zzakq;
		private Map zzakr;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			zzakq = ((Set) (new HashSet()));
		//    2    4:aload_0         
		//    3    5:new             #28  <Class HashSet>
		//    4    8:dup             
		//    5    9:invokespecial   #29  <Method void HashSet()>
		//    6   12:putfield        #31  <Field Set zzakq>
			zzakr = ((Map) (new HashMap()));
		//    7   15:aload_0         
		//    8   16:new             #33  <Class HashMap>
		//    9   19:dup             
		//   10   20:invokespecial   #34  <Method void HashMap()>
		//   11   23:putfield        #36  <Field Map zzakr>
		//   12   26:return          
		}

		public Builder(GoogleSignInOptions googlesigninoptions)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			zzakq = ((Set) (new HashSet()));
		//    2    4:aload_0         
		//    3    5:new             #28  <Class HashSet>
		//    4    8:dup             
		//    5    9:invokespecial   #29  <Method void HashSet()>
		//    6   12:putfield        #31  <Field Set zzakq>
			zzakr = ((Map) (new HashMap()));
		//    7   15:aload_0         
		//    8   16:new             #33  <Class HashMap>
		//    9   19:dup             
		//   10   20:invokespecial   #34  <Method void HashMap()>
		//   11   23:putfield        #36  <Field Map zzakr>
			zzac.zzw(((Object) (googlesigninoptions)));
		//   12   26:aload_1         
		//   13   27:invokestatic    #45  <Method Object zzac.zzw(Object)>
		//   14   30:pop             
			zzakq = ((Set) (new HashSet(((java.util.Collection) (GoogleSignInOptions.zzb(googlesigninoptions))))));
		//   15   31:aload_0         
		//   16   32:new             #28  <Class HashSet>
		//   17   35:dup             
		//   18   36:aload_1         
		//   19   37:invokestatic    #49  <Method ArrayList GoogleSignInOptions.zzb(GoogleSignInOptions)>
		//   20   40:invokespecial   #52  <Method void HashSet(java.util.Collection)>
		//   21   43:putfield        #31  <Field Set zzakq>
			zzakl = GoogleSignInOptions.zzc(googlesigninoptions);
		//   22   46:aload_0         
		//   23   47:aload_1         
		//   24   48:invokestatic    #56  <Method boolean GoogleSignInOptions.zzc(GoogleSignInOptions)>
		//   25   51:putfield        #58  <Field boolean zzakl>
			zzakm = GoogleSignInOptions.zzd(googlesigninoptions);
		//   26   54:aload_0         
		//   27   55:aload_1         
		//   28   56:invokestatic    #61  <Method boolean GoogleSignInOptions.zzd(GoogleSignInOptions)>
		//   29   59:putfield        #63  <Field boolean zzakm>
			zzajv = GoogleSignInOptions.zze(googlesigninoptions);
		//   30   62:aload_0         
		//   31   63:aload_1         
		//   32   64:invokestatic    #66  <Method boolean GoogleSignInOptions.zze(GoogleSignInOptions)>
		//   33   67:putfield        #68  <Field boolean zzajv>
			zzajw = GoogleSignInOptions.zzf(googlesigninoptions);
		//   34   70:aload_0         
		//   35   71:aload_1         
		//   36   72:invokestatic    #72  <Method String GoogleSignInOptions.zzf(GoogleSignInOptions)>
		//   37   75:putfield        #74  <Field String zzajw>
			zzahh = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zzg(googlesigninoptions);
		//   38   78:aload_0         
		//   39   79:aload_1         
		//   40   80:invokestatic    #78  <Method Account com.google.android.gms.auth.api.signin.GoogleSignInOptions.zzg(GoogleSignInOptions)>
		//   41   83:putfield        #80  <Field Account zzahh>
			zzakn = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zzh(googlesigninoptions);
		//   42   86:aload_0         
		//   43   87:aload_1         
		//   44   88:invokestatic    #83  <Method String com.google.android.gms.auth.api.signin.GoogleSignInOptions.zzh(GoogleSignInOptions)>
		//   45   91:putfield        #85  <Field String zzakn>
			zzakr = GoogleSignInOptions.zzy(((List) (GoogleSignInOptions.zzi(googlesigninoptions))));
		//   46   94:aload_0         
		//   47   95:aload_1         
		//   48   96:invokestatic    #88  <Method ArrayList GoogleSignInOptions.zzi(GoogleSignInOptions)>
		//   49   99:invokestatic    #92  <Method Map GoogleSignInOptions.zzy(List)>
		//   50  102:putfield        #36  <Field Map zzakr>
		//   51  105:return          
		}
	}


	GoogleSignInOptions(int i, ArrayList arraylist, Account account, boolean flag, boolean flag1, boolean flag2, String s, 
			String s1, ArrayList arraylist1)
	{
		this(i, arraylist, account, flag, flag1, flag2, s, s1, zzx(((List) (arraylist1))));
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
	//   10   16:invokestatic    #105 <Method Map zzx(List)>
	//   11   19:invokespecial   #108 <Method void GoogleSignInOptions(int, ArrayList, Account, boolean, boolean, boolean, String, String, Map)>
	//   12   22:return          
	}

	private GoogleSignInOptions(int i, ArrayList arraylist, Account account, boolean flag, boolean flag1, boolean flag2, String s, 
			String s1, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #111 <Method void zza()>
		versionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #113 <Field int versionCode>
		zzakk = arraylist;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #115 <Field ArrayList zzakk>
		zzahh = account;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #117 <Field Account zzahh>
		zzajv = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #119 <Field boolean zzajv>
		zzakl = flag1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #121 <Field boolean zzakl>
		zzakm = flag2;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #123 <Field boolean zzakm>
		zzajw = s;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #125 <Field String zzajw>
		zzakn = s1;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #127 <Field String zzakn>
		zzako = new ArrayList(map.values());
	//   26   49:aload_0         
	//   27   50:new             #129 <Class ArrayList>
	//   28   53:dup             
	//   29   54:aload           9
	//   30   56:invokeinterface #135 <Method java.util.Collection Map.values()>
	//   31   61:invokespecial   #138 <Method void ArrayList(java.util.Collection)>
	//   32   64:putfield        #140 <Field ArrayList zzako>
		zzakp = map;
	//   33   67:aload_0         
	//   34   68:aload           9
	//   35   70:putfield        #142 <Field Map zzakp>
	//   36   73:return          
	}


	static ArrayList zzb(GoogleSignInOptions googlesigninoptions)
	{
		return googlesigninoptions.zzakk;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field ArrayList zzakk>
	//    2    4:areturn         
	}

	static boolean zzc(GoogleSignInOptions googlesigninoptions)
	{
		return googlesigninoptions.zzakl;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field boolean zzakl>
	//    2    4:ireturn         
	}

	public static GoogleSignInOptions zzcx(String s)
		throws JSONException
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #159 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		JSONObject jsonobject = new JSONObject(s);
	//    5    9:new             #161 <Class JSONObject>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokespecial   #162 <Method void JSONObject(String)>
	//    9   17:astore_3        
		HashSet hashset = new HashSet();
	//   10   18:new             #164 <Class HashSet>
	//   11   21:dup             
	//   12   22:invokespecial   #165 <Method void HashSet()>
	//   13   25:astore          4
		s = ((String) (jsonobject.getJSONArray("scopes")));
	//   14   27:aload_3         
	//   15   28:ldc1            #167 <String "scopes">
	//   16   30:invokevirtual   #171 <Method JSONArray JSONObject.getJSONArray(String)>
	//   17   33:astore_0        
		int j = ((JSONArray) (s)).length();
	//   18   34:aload_0         
	//   19   35:invokevirtual   #177 <Method int JSONArray.length()>
	//   20   38:istore_2        
		for(int i = 0; i < j; i++)
	//*  21   39:iconst_0        
	//*  22   40:istore_1        
	//*  23   41:iload_1         
	//*  24   42:iload_2         
	//*  25   43:icmpge          73
			((Set) (hashset)).add(((Object) (new Scope(((JSONArray) (s)).getString(i)))));
	//   26   46:aload           4
	//   27   48:new             #50  <Class Scope>
	//   28   51:dup             
	//   29   52:aload_0         
	//   30   53:iload_1         
	//   31   54:invokevirtual   #181 <Method String JSONArray.getString(int)>
	//   32   57:invokespecial   #56  <Method void Scope(String)>
	//   33   60:invokeinterface #187 <Method boolean Set.add(Object)>
	//   34   65:pop             

	//   35   66:iload_1         
	//   36   67:iconst_1        
	//   37   68:iadd            
	//   38   69:istore_1        
	//*  39   70:goto            41
		s = null;
	//   40   73:aconst_null     
	//   41   74:astore_0        
		String s1 = jsonobject.optString("accountName", ((String) (null)));
	//   42   75:aload_3         
	//   43   76:ldc1            #189 <String "accountName">
	//   44   78:aconst_null     
	//   45   79:invokevirtual   #193 <Method String JSONObject.optString(String, String)>
	//   46   82:astore          5
		if(!TextUtils.isEmpty(((CharSequence) (s1))))
	//*  47   84:aload           5
	//*  48   86:invokestatic    #159 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  49   89:ifne            104
			s = ((String) (new Account(s1, "com.google")));
	//   50   92:new             #195 <Class Account>
	//   51   95:dup             
	//   52   96:aload           5
	//   53   98:ldc1            #197 <String "com.google">
	//   54  100:invokespecial   #200 <Method void Account(String, String)>
	//   55  103:astore_0        
		return new GoogleSignInOptions(3, new ArrayList(((java.util.Collection) (hashset))), ((Account) (s)), jsonobject.getBoolean("idTokenRequested"), jsonobject.getBoolean("serverAuthRequested"), jsonobject.getBoolean("forceCodeForRefreshToken"), jsonobject.optString("serverClientId", ((String) (null))), jsonobject.optString("hostedDomain", ((String) (null))), ((Map) (new HashMap())));
	//   56  104:new             #2   <Class GoogleSignInOptions>
	//   57  107:dup             
	//   58  108:iconst_3        
	//   59  109:new             #129 <Class ArrayList>
	//   60  112:dup             
	//   61  113:aload           4
	//   62  115:invokespecial   #138 <Method void ArrayList(java.util.Collection)>
	//   63  118:aload_0         
	//   64  119:aload_3         
	//   65  120:ldc1            #202 <String "idTokenRequested">
	//   66  122:invokevirtual   #206 <Method boolean JSONObject.getBoolean(String)>
	//   67  125:aload_3         
	//   68  126:ldc1            #208 <String "serverAuthRequested">
	//   69  128:invokevirtual   #206 <Method boolean JSONObject.getBoolean(String)>
	//   70  131:aload_3         
	//   71  132:ldc1            #210 <String "forceCodeForRefreshToken">
	//   72  134:invokevirtual   #206 <Method boolean JSONObject.getBoolean(String)>
	//   73  137:aload_3         
	//   74  138:ldc1            #212 <String "serverClientId">
	//   75  140:aconst_null     
	//   76  141:invokevirtual   #193 <Method String JSONObject.optString(String, String)>
	//   77  144:aload_3         
	//   78  145:ldc1            #214 <String "hostedDomain">
	//   79  147:aconst_null     
	//   80  148:invokevirtual   #193 <Method String JSONObject.optString(String, String)>
	//   81  151:new             #216 <Class HashMap>
	//   82  154:dup             
	//   83  155:invokespecial   #217 <Method void HashMap()>
	//   84  158:invokespecial   #108 <Method void GoogleSignInOptions(int, ArrayList, Account, boolean, boolean, boolean, String, String, Map)>
	//   85  161:areturn         
	}

	static boolean zzd(GoogleSignInOptions googlesigninoptions)
	{
		return googlesigninoptions.zzakm;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field boolean zzakm>
	//    2    4:ireturn         
	}

	static boolean zze(GoogleSignInOptions googlesigninoptions)
	{
		return googlesigninoptions.zzajv;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field boolean zzajv>
	//    2    4:ireturn         
	}

	static String zzf(GoogleSignInOptions googlesigninoptions)
	{
		return googlesigninoptions.zzajw;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field String zzajw>
	//    2    4:areturn         
	}

	static Account zzg(GoogleSignInOptions googlesigninoptions)
	{
		return googlesigninoptions.zzahh;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field Account zzahh>
	//    2    4:areturn         
	}

	static String zzh(GoogleSignInOptions googlesigninoptions)
	{
		return googlesigninoptions.zzakn;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field String zzakn>
	//    2    4:areturn         
	}

	static ArrayList zzi(GoogleSignInOptions googlesigninoptions)
	{
		return googlesigninoptions.zzako;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field ArrayList zzako>
	//    2    4:areturn         
	}

	private JSONObject zzri()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #161 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #231 <Method void JSONObject()>
	//    3    7:astore_1        
		JSONArray jsonarray;
		try
		{
			jsonarray = new JSONArray();
	//    4    8:new             #173 <Class JSONArray>
	//    5   11:dup             
	//    6   12:invokespecial   #232 <Method void JSONArray()>
	//    7   15:astore_2        
			Collections.sort(((List) (zzakk)), zzakg);
	//    8   16:aload_0         
	//    9   17:getfield        #115 <Field ArrayList zzakk>
	//   10   20:getstatic       #99  <Field Comparator zzakg>
	//   11   23:invokestatic    #238 <Method void Collections.sort(List, Comparator)>
			for(Iterator iterator = zzakk.iterator(); iterator.hasNext(); jsonarray.put(((Object) (((Scope)iterator.next()).zzvt()))));
	//   12   26:aload_0         
	//   13   27:getfield        #115 <Field ArrayList zzakk>
	//   14   30:invokevirtual   #242 <Method Iterator ArrayList.iterator()>
	//   15   33:astore_3        
	//   16   34:aload_3         
	//   17   35:invokeinterface #248 <Method boolean Iterator.hasNext()>
	//   18   40:ifeq            63
	//   19   43:aload_2         
	//   20   44:aload_3         
	//   21   45:invokeinterface #252 <Method Object Iterator.next()>
	//   22   50:checkcast       #50  <Class Scope>
	//   23   53:invokevirtual   #256 <Method String Scope.zzvt()>
	//   24   56:invokevirtual   #260 <Method JSONArray JSONArray.put(Object)>
	//   25   59:pop             
		}
	//*  26   60:goto            34
	//*  27   63:aload_1         
	//*  28   64:ldc1            #167 <String "scopes">
	//*  29   66:aload_2         
	//*  30   67:invokevirtual   #263 <Method JSONObject JSONObject.put(String, Object)>
	//*  31   70:pop             
	//*  32   71:aload_0         
	//*  33   72:getfield        #117 <Field Account zzahh>
	//*  34   75:ifnull          92
	//*  35   78:aload_1         
	//*  36   79:ldc1            #189 <String "accountName">
	//*  37   81:aload_0         
	//*  38   82:getfield        #117 <Field Account zzahh>
	//*  39   85:getfield        #266 <Field String Account.name>
	//*  40   88:invokevirtual   #263 <Method JSONObject JSONObject.put(String, Object)>
	//*  41   91:pop             
	//*  42   92:aload_1         
	//*  43   93:ldc1            #202 <String "idTokenRequested">
	//*  44   95:aload_0         
	//*  45   96:getfield        #119 <Field boolean zzajv>
	//*  46   99:invokevirtual   #269 <Method JSONObject JSONObject.put(String, boolean)>
	//*  47  102:pop             
	//*  48  103:aload_1         
	//*  49  104:ldc1            #210 <String "forceCodeForRefreshToken">
	//*  50  106:aload_0         
	//*  51  107:getfield        #123 <Field boolean zzakm>
	//*  52  110:invokevirtual   #269 <Method JSONObject JSONObject.put(String, boolean)>
	//*  53  113:pop             
	//*  54  114:aload_1         
	//*  55  115:ldc1            #208 <String "serverAuthRequested">
	//*  56  117:aload_0         
	//*  57  118:getfield        #121 <Field boolean zzakl>
	//*  58  121:invokevirtual   #269 <Method JSONObject JSONObject.put(String, boolean)>
	//*  59  124:pop             
	//*  60  125:aload_0         
	//*  61  126:getfield        #125 <Field String zzajw>
	//*  62  129:invokestatic    #159 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  63  132:ifne            146
	//*  64  135:aload_1         
	//*  65  136:ldc1            #212 <String "serverClientId">
	//*  66  138:aload_0         
	//*  67  139:getfield        #125 <Field String zzajw>
	//*  68  142:invokevirtual   #263 <Method JSONObject JSONObject.put(String, Object)>
	//*  69  145:pop             
	//*  70  146:aload_0         
	//*  71  147:getfield        #127 <Field String zzakn>
	//*  72  150:invokestatic    #159 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  73  153:ifne            167
	//*  74  156:aload_1         
	//*  75  157:ldc1            #214 <String "hostedDomain">
	//*  76  159:aload_0         
	//*  77  160:getfield        #127 <Field String zzakn>
	//*  78  163:invokevirtual   #263 <Method JSONObject JSONObject.put(String, Object)>
	//*  79  166:pop             
	//*  80  167:aload_1         
	//*  81  168:areturn         
		catch(JSONException jsonexception)
	//*  82  169:astore_1        
		{
			throw new RuntimeException(((Throwable) (jsonexception)));
	//   83  170:new             #271 <Class RuntimeException>
	//   84  173:dup             
	//   85  174:aload_1         
	//   86  175:invokespecial   #274 <Method void RuntimeException(Throwable)>
	//   87  178:athrow          
		}
		jsonobject.put("scopes", ((Object) (jsonarray)));
		if(zzahh != null)
			jsonobject.put("accountName", ((Object) (zzahh.name)));
		jsonobject.put("idTokenRequested", zzajv);
		jsonobject.put("forceCodeForRefreshToken", zzakm);
		jsonobject.put("serverAuthRequested", zzakl);
		if(!TextUtils.isEmpty(((CharSequence) (zzajw))))
			jsonobject.put("serverClientId", ((Object) (zzajw)));
		if(!TextUtils.isEmpty(((CharSequence) (zzakn))))
			jsonobject.put("hostedDomain", ((Object) (zzakn)));
		return jsonobject;
	}

	private static Map zzx(List list)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #216 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #217 <Method void HashMap()>
	//    3    7:astore_1        
		if(list == null)
	//*   4    8:aload_0         
	//*   5    9:ifnonnull       14
			return ((Map) (hashmap));
	//    6   12:aload_1         
	//    7   13:areturn         
		zzg zzg1;
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((Map) (hashmap)).put(((Object) (Integer.valueOf(zzg1.getType()))), ((Object) (zzg1))))
	//*   8   14:aload_0         
	//*   9   15:invokeinterface #277 <Method Iterator List.iterator()>
	//*  10   20:astore_0        
	//*  11   21:aload_0         
	//*  12   22:invokeinterface #248 <Method boolean Iterator.hasNext()>
	//*  13   27:ifeq            58
			zzg1 = (zzg)((Iterator) (list)).next();
	//   14   30:aload_0         
	//   15   31:invokeinterface #252 <Method Object Iterator.next()>
	//   16   36:checkcast       #279 <Class zzg>
	//   17   39:astore_2        

	//   18   40:aload_1         
	//   19   41:aload_2         
	//   20   42:invokevirtual   #282 <Method int zzg.getType()>
	//   21   45:invokestatic    #288 <Method Integer Integer.valueOf(int)>
	//   22   48:aload_2         
	//   23   49:invokeinterface #291 <Method Object Map.put(Object, Object)>
	//   24   54:pop             
	//*  25   55:goto            21
		return ((Map) (hashmap));
	//   26   58:aload_1         
	//   27   59:areturn         
	}

	static Map zzy(List list)
	{
		return zzx(list);
	//    0    0:aload_0         
	//    1    1:invokestatic    #105 <Method Map zzx(List)>
	//    2    4:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		int i;
		obj = ((Object) ((GoogleSignInOptions)obj));
	//    4    6:aload_1         
	//    5    7:checkcast       #2   <Class GoogleSignInOptions>
	//    6   10:astore_1        
		if(zzako.size() > 0)
			break MISSING_BLOCK_LABEL_33;
	//    7   11:aload_0         
	//    8   12:getfield        #140 <Field ArrayList zzako>
	//    9   15:invokevirtual   #299 <Method int ArrayList.size()>
	//   10   18:ifgt            33
		i = ((GoogleSignInOptions) (obj)).zzako.size();
	//   11   21:aload_1         
	//   12   22:getfield        #140 <Field ArrayList zzako>
	//   13   25:invokevirtual   #299 <Method int ArrayList.size()>
	//   14   28:istore_2        
		if(i <= 0)
			break MISSING_BLOCK_LABEL_35;
	//   15   29:iload_2         
	//   16   30:ifle            35
		return false;
	//   17   33:iconst_0        
	//   18   34:ireturn         
		boolean flag;
		if(zzakk.size() != ((GoogleSignInOptions) (obj)).zzrj().size())
			break MISSING_BLOCK_LABEL_68;
	//   19   35:aload_0         
	//   20   36:getfield        #115 <Field ArrayList zzakk>
	//   21   39:invokevirtual   #299 <Method int ArrayList.size()>
	//   22   42:aload_1         
	//   23   43:invokevirtual   #303 <Method ArrayList zzrj()>
	//   24   46:invokevirtual   #299 <Method int ArrayList.size()>
	//   25   49:icmpne          68
		flag = zzakk.containsAll(((java.util.Collection) (((GoogleSignInOptions) (obj)).zzrj())));
	//   26   52:aload_0         
	//   27   53:getfield        #115 <Field ArrayList zzakk>
	//   28   56:aload_1         
	//   29   57:invokevirtual   #303 <Method ArrayList zzrj()>
	//   30   60:invokevirtual   #307 <Method boolean ArrayList.containsAll(java.util.Collection)>
	//   31   63:istore_3        
		if(flag)
			break MISSING_BLOCK_LABEL_70;
	//   32   64:iload_3         
	//   33   65:ifne            70
		return false;
	//   34   68:iconst_0        
	//   35   69:ireturn         
		boolean flag1;
		try
		{
			if(zzahh == null)
	//*  36   70:aload_0         
	//*  37   71:getfield        #117 <Field Account zzahh>
	//*  38   74:ifnonnull       87
			{
				if(((GoogleSignInOptions) (obj)).getAccount() != null)
	//*  39   77:aload_1         
	//*  40   78:invokevirtual   #311 <Method Account getAccount()>
	//*  41   81:ifnonnull       179
					break MISSING_BLOCK_LABEL_179;
	//   42   84:goto            101
				break MISSING_BLOCK_LABEL_101;
			}
		}
	//*  43   87:aload_0         
	//*  44   88:getfield        #117 <Field Account zzahh>
	//*  45   91:aload_1         
	//*  46   92:invokevirtual   #311 <Method Account getAccount()>
	//*  47   95:invokevirtual   #313 <Method boolean Account.equals(Object)>
	//*  48   98:ifeq            179
	//*  49  101:aload_0         
	//*  50  102:getfield        #125 <Field String zzajw>
	//*  51  105:invokestatic    #159 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  52  108:ifeq            124
	//*  53  111:aload_1         
	//*  54  112:invokevirtual   #316 <Method String getServerClientId()>
	//*  55  115:invokestatic    #159 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  56  118:ifeq            179
	//*  57  121:goto            138
	//*  58  124:aload_0         
	//*  59  125:getfield        #125 <Field String zzajw>
	//*  60  128:aload_1         
	//*  61  129:invokevirtual   #316 <Method String getServerClientId()>
	//*  62  132:invokevirtual   #319 <Method boolean String.equals(Object)>
	//*  63  135:ifeq            179
	//*  64  138:aload_0         
	//*  65  139:getfield        #123 <Field boolean zzakm>
	//*  66  142:aload_1         
	//*  67  143:invokevirtual   #322 <Method boolean zzrl()>
	//*  68  146:icmpne          179
	//*  69  149:aload_0         
	//*  70  150:getfield        #119 <Field boolean zzajv>
	//*  71  153:aload_1         
	//*  72  154:invokevirtual   #325 <Method boolean isIdTokenRequested()>
	//*  73  157:icmpne          179
	//*  74  160:aload_0         
	//*  75  161:getfield        #121 <Field boolean zzakl>
	//*  76  164:istore_3        
	//*  77  165:aload_1         
	//*  78  166:invokevirtual   #328 <Method boolean zzrk()>
	//*  79  169:istore          4
	//*  80  171:iload_3         
	//*  81  172:iload           4
	//*  82  174:icmpne          179
	//*  83  177:iconst_1        
	//*  84  178:ireturn         
	//*  85  179:iconst_0        
	//*  86  180:ireturn         
	//*  87  181:iconst_0        
	//*  88  182:ireturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			return false;
		}
		if(!zzahh.equals(((Object) (((GoogleSignInOptions) (obj)).getAccount()))))
			break MISSING_BLOCK_LABEL_179;
		if(TextUtils.isEmpty(((CharSequence) (zzajw))))
		{
			if(!TextUtils.isEmpty(((CharSequence) (((GoogleSignInOptions) (obj)).getServerClientId()))))
				break MISSING_BLOCK_LABEL_179;
			break MISSING_BLOCK_LABEL_138;
		}
		if(!zzajw.equals(((Object) (((GoogleSignInOptions) (obj)).getServerClientId()))))
			break MISSING_BLOCK_LABEL_179;
		if(zzakm != ((GoogleSignInOptions) (obj)).zzrl() || zzajv != ((GoogleSignInOptions) (obj)).isIdTokenRequested())
			break MISSING_BLOCK_LABEL_179;
		flag = zzakl;
		flag1 = ((GoogleSignInOptions) (obj)).zzrk();
		if(flag == flag1)
			return true;
		return false;
	//*  89  183:astore_1        
	//*  90  184:goto            181
	}

	public Account getAccount()
	{
		return zzahh;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field Account zzahh>
	//    2    4:areturn         
	}

	public Scope[] getScopeArray()
	{
		return (Scope[])zzakk.toArray(((Object []) (new Scope[zzakk.size()])));
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field ArrayList zzakk>
	//    2    4:aload_0         
	//    3    5:getfield        #115 <Field ArrayList zzakk>
	//    4    8:invokevirtual   #299 <Method int ArrayList.size()>
	//    5   11:anewarray       Scope[]
	//    6   14:invokevirtual   #334 <Method Object[] ArrayList.toArray(Object[])>
	//    7   17:checkcast       #336 <Class Scope[]>
	//    8   20:areturn         
	}

	public String getServerClientId()
	{
		return zzajw;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field String zzajw>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #129 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #338 <Method void ArrayList()>
	//    3    7:astore_1        
		for(Iterator iterator = zzakk.iterator(); iterator.hasNext(); arraylist.add(((Object) (((Scope)iterator.next()).zzvt()))));
	//    4    8:aload_0         
	//    5    9:getfield        #115 <Field ArrayList zzakk>
	//    6   12:invokevirtual   #242 <Method Iterator ArrayList.iterator()>
	//    7   15:astore_2        
	//    8   16:aload_2         
	//    9   17:invokeinterface #248 <Method boolean Iterator.hasNext()>
	//   10   22:ifeq            45
	//   11   25:aload_1         
	//   12   26:aload_2         
	//   13   27:invokeinterface #252 <Method Object Iterator.next()>
	//   14   32:checkcast       #50  <Class Scope>
	//   15   35:invokevirtual   #256 <Method String Scope.zzvt()>
	//   16   38:invokevirtual   #339 <Method boolean ArrayList.add(Object)>
	//   17   41:pop             
	//*  18   42:goto            16
		Collections.sort(((List) (arraylist)));
	//   19   45:aload_1         
	//   20   46:invokestatic    #342 <Method void Collections.sort(List)>
		return (new zzh()).zzq(((Object) (arraylist))).zzq(((Object) (zzahh))).zzq(((Object) (zzajw))).zzae(zzakm).zzae(zzajv).zzae(zzakl).zzru();
	//   21   49:new             #344 <Class zzh>
	//   22   52:dup             
	//   23   53:invokespecial   #345 <Method void zzh()>
	//   24   56:aload_1         
	//   25   57:invokevirtual   #349 <Method zzh zzh.zzq(Object)>
	//   26   60:aload_0         
	//   27   61:getfield        #117 <Field Account zzahh>
	//   28   64:invokevirtual   #349 <Method zzh zzh.zzq(Object)>
	//   29   67:aload_0         
	//   30   68:getfield        #125 <Field String zzajw>
	//   31   71:invokevirtual   #349 <Method zzh zzh.zzq(Object)>
	//   32   74:aload_0         
	//   33   75:getfield        #123 <Field boolean zzakm>
	//   34   78:invokevirtual   #353 <Method zzh zzh.zzae(boolean)>
	//   35   81:aload_0         
	//   36   82:getfield        #119 <Field boolean zzajv>
	//   37   85:invokevirtual   #353 <Method zzh zzh.zzae(boolean)>
	//   38   88:aload_0         
	//   39   89:getfield        #121 <Field boolean zzakl>
	//   40   92:invokevirtual   #353 <Method zzh zzh.zzae(boolean)>
	//   41   95:invokevirtual   #356 <Method int zzh.zzru()>
	//   42   98:ireturn         
	}

	public boolean isIdTokenRequested()
	{
		return zzajv;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field boolean zzajv>
	//    2    4:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.auth.api.signin.zzb.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #362 <Method void com.google.android.gms.auth.api.signin.zzb.zza(GoogleSignInOptions, Parcel, int)>
	//    4    6:return          
	}

	public String zzrg()
	{
		return zzri().toString();
	//    0    0:aload_0         
	//    1    1:invokespecial   #365 <Method JSONObject zzri()>
	//    2    4:invokevirtual   #368 <Method String JSONObject.toString()>
	//    3    7:areturn         
	}

	public ArrayList zzrj()
	{
		return new ArrayList(((java.util.Collection) (zzakk)));
	//    0    0:new             #129 <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #115 <Field ArrayList zzakk>
	//    4    8:invokespecial   #138 <Method void ArrayList(java.util.Collection)>
	//    5   11:areturn         
	}

	public boolean zzrk()
	{
		return zzakl;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field boolean zzakl>
	//    2    4:ireturn         
	}

	public boolean zzrl()
	{
		return zzakm;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field boolean zzakm>
	//    2    4:ireturn         
	}

	public String zzrm()
	{
		return zzakn;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field String zzakn>
	//    2    4:areturn         
	}

	public ArrayList zzrn()
	{
		return zzako;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field ArrayList zzako>
	//    2    4:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzb();
	public static final GoogleSignInOptions DEFAULT_GAMES_SIGN_IN;
	public static final GoogleSignInOptions DEFAULT_SIGN_IN = (new Builder()).requestId().requestProfile().build();
	public static final Scope SCOPE_GAMES;
	private static Comparator zzakg = new Comparator() {

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
			return scope.zzvt().compareTo(scope1.zzvt());
		//    0    0:aload_1         
		//    1    1:invokevirtual   #26  <Method String Scope.zzvt()>
		//    2    4:aload_2         
		//    3    5:invokevirtual   #26  <Method String Scope.zzvt()>
		//    4    8:invokevirtual   #32  <Method int String.compareTo(String)>
		//    5   11:ireturn         
		}

	}
;
	public static final Scope zzakh = new Scope("profile");
	public static final Scope zzaki = new Scope("email");
	public static final Scope zzakj = new Scope("openid");
	final int versionCode;
	private Account zzahh;
	private boolean zzajv;
	private String zzajw;
	private final ArrayList zzakk;
	private final boolean zzakl;
	private final boolean zzakm;
	private String zzakn;
	private ArrayList zzako;
	private Map zzakp;

	static 
	{
	//    0    0:new             #50  <Class Scope>
	//    1    3:dup             
	//    2    4:ldc1            #52  <String "profile">
	//    3    6:invokespecial   #56  <Method void Scope(String)>
	//    4    9:putstatic       #58  <Field Scope zzakh>
	//    5   12:new             #50  <Class Scope>
	//    6   15:dup             
	//    7   16:ldc1            #60  <String "email">
	//    8   18:invokespecial   #56  <Method void Scope(String)>
	//    9   21:putstatic       #62  <Field Scope zzaki>
	//   10   24:new             #50  <Class Scope>
	//   11   27:dup             
	//   12   28:ldc1            #64  <String "openid">
	//   13   30:invokespecial   #56  <Method void Scope(String)>
	//   14   33:putstatic       #66  <Field Scope zzakj>
		SCOPE_GAMES = new Scope("https://www.googleapis.com/auth/games");
	//   15   36:new             #50  <Class Scope>
	//   16   39:dup             
	//   17   40:ldc1            #68  <String "https://www.googleapis.com/auth/games">
	//   18   42:invokespecial   #56  <Method void Scope(String)>
	//   19   45:putstatic       #70  <Field Scope SCOPE_GAMES>
	//   20   48:new             #12  <Class GoogleSignInOptions$Builder>
	//   21   51:dup             
	//   22   52:invokespecial   #72  <Method void GoogleSignInOptions$Builder()>
	//   23   55:invokevirtual   #76  <Method GoogleSignInOptions$Builder GoogleSignInOptions$Builder.requestId()>
	//   24   58:invokevirtual   #79  <Method GoogleSignInOptions$Builder GoogleSignInOptions$Builder.requestProfile()>
	//   25   61:invokevirtual   #83  <Method GoogleSignInOptions GoogleSignInOptions$Builder.build()>
	//   26   64:putstatic       #85  <Field GoogleSignInOptions DEFAULT_SIGN_IN>
		DEFAULT_GAMES_SIGN_IN = (new Builder()).requestScopes(SCOPE_GAMES, new Scope[0]).build();
	//   27   67:new             #12  <Class GoogleSignInOptions$Builder>
	//   28   70:dup             
	//   29   71:invokespecial   #72  <Method void GoogleSignInOptions$Builder()>
	//   30   74:getstatic       #70  <Field Scope SCOPE_GAMES>
	//   31   77:iconst_0        
	//   32   78:anewarray       Scope[]
	//   33   81:invokevirtual   #89  <Method GoogleSignInOptions$Builder GoogleSignInOptions$Builder.requestScopes(Scope, Scope[])>
	//   34   84:invokevirtual   #83  <Method GoogleSignInOptions GoogleSignInOptions$Builder.build()>
	//   35   87:putstatic       #91  <Field GoogleSignInOptions DEFAULT_GAMES_SIGN_IN>
	//   36   90:new             #93  <Class zzb>
	//   37   93:dup             
	//   38   94:invokespecial   #94  <Method void zzb()>
	//   39   97:putstatic       #96  <Field android.os.Parcelable$Creator CREATOR>
	//   40  100:new             #10  <Class GoogleSignInOptions$1>
	//   41  103:dup             
	//   42  104:invokespecial   #97  <Method void GoogleSignInOptions$1()>
	//   43  107:putstatic       #99  <Field Comparator zzakg>
	//*  44  110:return          
	}
}
