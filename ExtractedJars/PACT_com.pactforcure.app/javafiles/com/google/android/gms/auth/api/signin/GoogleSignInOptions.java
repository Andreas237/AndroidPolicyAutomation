// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.zzf;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzac;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//			zzb

public class GoogleSignInOptions extends zza
	implements com.google.android.gms.common.api.Api.ApiOptions.Optional, ReflectedParcelable
{
	public static final class Builder
	{

		private String zzcx(String s)
		{
			zzac.zzdv(s);
		//    0    0:aload_1         
		//    1    1:invokestatic    #83  <Method String zzac.zzdv(String)>
		//    2    4:pop             
			boolean flag;
			if(zzajk == null || zzajk.equals(((Object) (s))))
		//*   3    5:aload_0         
		//*   4    6:getfield        #66  <Field String zzajk>
		//*   5    9:ifnull          23
		//*   6   12:aload_0         
		//*   7   13:getfield        #66  <Field String zzajk>
		//*   8   16:aload_1         
		//*   9   17:invokevirtual   #89  <Method boolean String.equals(Object)>
		//*  10   20:ifeq            33
				flag = true;
		//   11   23:iconst_1        
		//   12   24:istore_2        
			else
		//*  13   25:iload_2         
		//*  14   26:ldc1            #91  <String "two different server client ids provided">
		//*  15   28:invokestatic    #94  <Method void zzac.zzb(boolean, Object)>
		//*  16   31:aload_1         
		//*  17   32:areturn         
				flag = false;
		//   18   33:iconst_0        
		//   19   34:istore_2        
			zzac.zzb(flag, "two different server client ids provided");
			return s;
		//*  20   35:goto            25
		}

		public GoogleSignInOptions build()
		{
			if(zzajh && (zzagg == null || !zzajm.isEmpty()))
		//*   0    0:aload_0         
		//*   1    1:getfield        #60  <Field boolean zzajh>
		//*   2    4:ifeq            31
		//*   3    7:aload_0         
		//*   4    8:getfield        #72  <Field Account zzagg>
		//*   5   11:ifnull          26
		//*   6   14:aload_0         
		//*   7   15:getfield        #28  <Field Set zzajm>
		//*   8   18:invokeinterface #102 <Method boolean Set.isEmpty()>
		//*   9   23:ifne            31
				requestId();
		//   10   26:aload_0         
		//   11   27:invokevirtual   #106 <Method GoogleSignInOptions$Builder requestId()>
		//   12   30:pop             
			return new GoogleSignInOptions(zzajm, zzagg, zzajh, zzaji, zzajj, zzajk, zzajl);
		//   13   31:new             #6   <Class GoogleSignInOptions>
		//   14   34:dup             
		//   15   35:aload_0         
		//   16   36:getfield        #28  <Field Set zzajm>
		//   17   39:aload_0         
		//   18   40:getfield        #72  <Field Account zzagg>
		//   19   43:aload_0         
		//   20   44:getfield        #60  <Field boolean zzajh>
		//   21   47:aload_0         
		//   22   48:getfield        #50  <Field boolean zzaji>
		//   23   51:aload_0         
		//   24   52:getfield        #55  <Field boolean zzajj>
		//   25   55:aload_0         
		//   26   56:getfield        #66  <Field String zzajk>
		//   27   59:aload_0         
		//   28   60:getfield        #77  <Field String zzajl>
		//   29   63:aconst_null     
		//   30   64:invokespecial   #109 <Method void GoogleSignInOptions(Set, Account, boolean, boolean, boolean, String, String, GoogleSignInOptions$1)>
		//   31   67:areturn         
		}

		public Builder requestEmail()
		{
			zzajm.add(((Object) (GoogleSignInOptions.zzaje)));
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field Set zzajm>
		//    2    4:getstatic       #114 <Field Scope GoogleSignInOptions.zzaje>
		//    3    7:invokeinterface #117 <Method boolean Set.add(Object)>
		//    4   12:pop             
			return this;
		//    5   13:aload_0         
		//    6   14:areturn         
		}

		public Builder requestId()
		{
			zzajm.add(((Object) (GoogleSignInOptions.zzajf)));
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field Set zzajm>
		//    2    4:getstatic       #120 <Field Scope GoogleSignInOptions.zzajf>
		//    3    7:invokeinterface #117 <Method boolean Set.add(Object)>
		//    4   12:pop             
			return this;
		//    5   13:aload_0         
		//    6   14:areturn         
		}

		public Builder requestIdToken(String s)
		{
			zzajh = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #60  <Field boolean zzajh>
			zzajk = zzcx(s);
		//    3    5:aload_0         
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokespecial   #124 <Method String zzcx(String)>
		//    7   11:putfield        #66  <Field String zzajk>
			return this;
		//    8   14:aload_0         
		//    9   15:areturn         
		}

		public Builder requestProfile()
		{
			zzajm.add(((Object) (GoogleSignInOptions.zzajd)));
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field Set zzajm>
		//    2    4:getstatic       #128 <Field Scope GoogleSignInOptions.zzajd>
		//    3    7:invokeinterface #117 <Method boolean Set.add(Object)>
		//    4   12:pop             
			return this;
		//    5   13:aload_0         
		//    6   14:areturn         
		}

		public transient Builder requestScopes(Scope scope, Scope ascope[])
		{
			zzajm.add(((Object) (scope)));
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field Set zzajm>
		//    2    4:aload_1         
		//    3    5:invokeinterface #117 <Method boolean Set.add(Object)>
		//    4   10:pop             
			zzajm.addAll(((java.util.Collection) (Arrays.asList(((Object []) (ascope))))));
		//    5   11:aload_0         
		//    6   12:getfield        #28  <Field Set zzajm>
		//    7   15:aload_2         
		//    8   16:invokestatic    #136 <Method java.util.List Arrays.asList(Object[])>
		//    9   19:invokeinterface #140 <Method boolean Set.addAll(java.util.Collection)>
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
		//    3    3:invokevirtual   #144 <Method GoogleSignInOptions$Builder requestServerAuthCode(String, boolean)>
		//    4    6:areturn         
		}

		public Builder requestServerAuthCode(String s, boolean flag)
		{
			zzaji = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #50  <Field boolean zzaji>
			zzajk = zzcx(s);
		//    3    5:aload_0         
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokespecial   #124 <Method String zzcx(String)>
		//    7   11:putfield        #66  <Field String zzajk>
			zzajj = flag;
		//    8   14:aload_0         
		//    9   15:iload_2         
		//   10   16:putfield        #55  <Field boolean zzajj>
			return this;
		//   11   19:aload_0         
		//   12   20:areturn         
		}

		public Builder setAccountName(String s)
		{
			zzagg = new Account(zzac.zzdv(s), "com.google");
		//    0    0:aload_0         
		//    1    1:new             #147 <Class Account>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:invokestatic    #83  <Method String zzac.zzdv(String)>
		//    5    9:ldc1            #149 <String "com.google">
		//    6   11:invokespecial   #152 <Method void Account(String, String)>
		//    7   14:putfield        #72  <Field Account zzagg>
			return this;
		//    8   17:aload_0         
		//    9   18:areturn         
		}

		public Builder setHostedDomain(String s)
		{
			zzajl = zzac.zzdv(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #83  <Method String zzac.zzdv(String)>
		//    3    5:putfield        #77  <Field String zzajl>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		private Account zzagg;
		private boolean zzajh;
		private boolean zzaji;
		private boolean zzajj;
		private String zzajk;
		private String zzajl;
		private Set zzajm;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			zzajm = ((Set) (new HashSet()));
		//    2    4:aload_0         
		//    3    5:new             #25  <Class HashSet>
		//    4    8:dup             
		//    5    9:invokespecial   #26  <Method void HashSet()>
		//    6   12:putfield        #28  <Field Set zzajm>
		//    7   15:return          
		}

		public Builder(GoogleSignInOptions googlesigninoptions)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			zzajm = ((Set) (new HashSet()));
		//    2    4:aload_0         
		//    3    5:new             #25  <Class HashSet>
		//    4    8:dup             
		//    5    9:invokespecial   #26  <Method void HashSet()>
		//    6   12:putfield        #28  <Field Set zzajm>
			zzac.zzw(((Object) (googlesigninoptions)));
		//    7   15:aload_1         
		//    8   16:invokestatic    #37  <Method Object zzac.zzw(Object)>
		//    9   19:pop             
			zzajm = ((Set) (new HashSet(((java.util.Collection) (GoogleSignInOptions.zzb(googlesigninoptions))))));
		//   10   20:aload_0         
		//   11   21:new             #25  <Class HashSet>
		//   12   24:dup             
		//   13   25:aload_1         
		//   14   26:invokestatic    #41  <Method ArrayList GoogleSignInOptions.zzb(GoogleSignInOptions)>
		//   15   29:invokespecial   #44  <Method void HashSet(java.util.Collection)>
		//   16   32:putfield        #28  <Field Set zzajm>
			zzaji = GoogleSignInOptions.zzc(googlesigninoptions);
		//   17   35:aload_0         
		//   18   36:aload_1         
		//   19   37:invokestatic    #48  <Method boolean GoogleSignInOptions.zzc(GoogleSignInOptions)>
		//   20   40:putfield        #50  <Field boolean zzaji>
			zzajj = GoogleSignInOptions.zzd(googlesigninoptions);
		//   21   43:aload_0         
		//   22   44:aload_1         
		//   23   45:invokestatic    #53  <Method boolean GoogleSignInOptions.zzd(GoogleSignInOptions)>
		//   24   48:putfield        #55  <Field boolean zzajj>
			zzajh = GoogleSignInOptions.zze(googlesigninoptions);
		//   25   51:aload_0         
		//   26   52:aload_1         
		//   27   53:invokestatic    #58  <Method boolean GoogleSignInOptions.zze(GoogleSignInOptions)>
		//   28   56:putfield        #60  <Field boolean zzajh>
			zzajk = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zzf(googlesigninoptions);
		//   29   59:aload_0         
		//   30   60:aload_1         
		//   31   61:invokestatic    #64  <Method String com.google.android.gms.auth.api.signin.GoogleSignInOptions.zzf(GoogleSignInOptions)>
		//   32   64:putfield        #66  <Field String zzajk>
			zzagg = GoogleSignInOptions.zzg(googlesigninoptions);
		//   33   67:aload_0         
		//   34   68:aload_1         
		//   35   69:invokestatic    #70  <Method Account GoogleSignInOptions.zzg(GoogleSignInOptions)>
		//   36   72:putfield        #72  <Field Account zzagg>
			zzajl = GoogleSignInOptions.zzh(googlesigninoptions);
		//   37   75:aload_0         
		//   38   76:aload_1         
		//   39   77:invokestatic    #75  <Method String GoogleSignInOptions.zzh(GoogleSignInOptions)>
		//   40   80:putfield        #77  <Field String zzajl>
		//   41   83:return          
		}
	}


	GoogleSignInOptions(int i, ArrayList arraylist, Account account, boolean flag, boolean flag1, boolean flag2, String s, 
			String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void zza()>
		versionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #87  <Field int versionCode>
		zzajg = arraylist;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #89  <Field ArrayList zzajg>
		zzagg = account;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #91  <Field Account zzagg>
		zzajh = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #93  <Field boolean zzajh>
		zzaji = flag1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #95  <Field boolean zzaji>
		zzajj = flag2;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #97  <Field boolean zzajj>
		zzajk = s;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #99  <Field String zzajk>
		zzajl = s1;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #101 <Field String zzajl>
	//   26   49:return          
	}

	private GoogleSignInOptions(Set set, Account account, boolean flag, boolean flag1, boolean flag2, String s, String s1)
	{
		this(2, new ArrayList(((java.util.Collection) (set))), account, flag, flag1, flag2, s, s1);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:new             #106 <Class ArrayList>
	//    3    5:dup             
	//    4    6:aload_1         
	//    5    7:invokespecial   #109 <Method void ArrayList(java.util.Collection)>
	//    6   10:aload_2         
	//    7   11:iload_3         
	//    8   12:iload           4
	//    9   14:iload           5
	//   10   16:aload           6
	//   11   18:aload           7
	//   12   20:invokespecial   #111 <Method void GoogleSignInOptions(int, ArrayList, Account, boolean, boolean, boolean, String, String)>
	//   13   23:return          
	}


	static ArrayList zzb(GoogleSignInOptions googlesigninoptions)
	{
		return googlesigninoptions.zzajg;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field ArrayList zzajg>
	//    2    4:areturn         
	}

	static boolean zzc(GoogleSignInOptions googlesigninoptions)
	{
		return googlesigninoptions.zzaji;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field boolean zzaji>
	//    2    4:ireturn         
	}

	public static GoogleSignInOptions zzcw(String s)
		throws JSONException
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		JSONObject jsonobject = new JSONObject(s);
	//    5    9:new             #132 <Class JSONObject>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokespecial   #133 <Method void JSONObject(String)>
	//    9   17:astore_3        
		HashSet hashset = new HashSet();
	//   10   18:new             #135 <Class HashSet>
	//   11   21:dup             
	//   12   22:invokespecial   #136 <Method void HashSet()>
	//   13   25:astore          4
		s = ((String) (jsonobject.getJSONArray("scopes")));
	//   14   27:aload_3         
	//   15   28:ldc1            #138 <String "scopes">
	//   16   30:invokevirtual   #142 <Method JSONArray JSONObject.getJSONArray(String)>
	//   17   33:astore_0        
		int j = ((JSONArray) (s)).length();
	//   18   34:aload_0         
	//   19   35:invokevirtual   #148 <Method int JSONArray.length()>
	//   20   38:istore_2        
		for(int i = 0; i < j; i++)
	//*  21   39:iconst_0        
	//*  22   40:istore_1        
	//*  23   41:iload_1         
	//*  24   42:iload_2         
	//*  25   43:icmpge          73
			((Set) (hashset)).add(((Object) (new Scope(((JSONArray) (s)).getString(i)))));
	//   26   46:aload           4
	//   27   48:new             #43  <Class Scope>
	//   28   51:dup             
	//   29   52:aload_0         
	//   30   53:iload_1         
	//   31   54:invokevirtual   #152 <Method String JSONArray.getString(int)>
	//   32   57:invokespecial   #49  <Method void Scope(String)>
	//   33   60:invokeinterface #158 <Method boolean Set.add(Object)>
	//   34   65:pop             

	//   35   66:iload_1         
	//   36   67:iconst_1        
	//   37   68:iadd            
	//   38   69:istore_1        
	//*  39   70:goto            41
		s = jsonobject.optString("accountName", ((String) (null)));
	//   40   73:aload_3         
	//   41   74:ldc1            #160 <String "accountName">
	//   42   76:aconst_null     
	//   43   77:invokevirtual   #164 <Method String JSONObject.optString(String, String)>
	//   44   80:astore_0        
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*  45   81:aload_0         
	//*  46   82:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  47   85:ifne            142
			s = ((String) (new Account(s, "com.google")));
	//   48   88:new             #166 <Class Account>
	//   49   91:dup             
	//   50   92:aload_0         
	//   51   93:ldc1            #168 <String "com.google">
	//   52   95:invokespecial   #171 <Method void Account(String, String)>
	//   53   98:astore_0        
		else
	//*  54   99:new             #2   <Class GoogleSignInOptions>
	//*  55  102:dup             
	//*  56  103:aload           4
	//*  57  105:aload_0         
	//*  58  106:aload_3         
	//*  59  107:ldc1            #173 <String "idTokenRequested">
	//*  60  109:invokevirtual   #177 <Method boolean JSONObject.getBoolean(String)>
	//*  61  112:aload_3         
	//*  62  113:ldc1            #179 <String "serverAuthRequested">
	//*  63  115:invokevirtual   #177 <Method boolean JSONObject.getBoolean(String)>
	//*  64  118:aload_3         
	//*  65  119:ldc1            #181 <String "forceCodeForRefreshToken">
	//*  66  121:invokevirtual   #177 <Method boolean JSONObject.getBoolean(String)>
	//*  67  124:aload_3         
	//*  68  125:ldc1            #183 <String "serverClientId">
	//*  69  127:aconst_null     
	//*  70  128:invokevirtual   #164 <Method String JSONObject.optString(String, String)>
	//*  71  131:aload_3         
	//*  72  132:ldc1            #185 <String "hostedDomain">
	//*  73  134:aconst_null     
	//*  74  135:invokevirtual   #164 <Method String JSONObject.optString(String, String)>
	//*  75  138:invokespecial   #115 <Method void GoogleSignInOptions(Set, Account, boolean, boolean, boolean, String, String)>
	//*  76  141:areturn         
			s = null;
	//   77  142:aconst_null     
	//   78  143:astore_0        
		return new GoogleSignInOptions(((Set) (hashset)), ((Account) (s)), jsonobject.getBoolean("idTokenRequested"), jsonobject.getBoolean("serverAuthRequested"), jsonobject.getBoolean("forceCodeForRefreshToken"), jsonobject.optString("serverClientId", ((String) (null))), jsonobject.optString("hostedDomain", ((String) (null))));
	//*  79  144:goto            99
	}

	static boolean zzd(GoogleSignInOptions googlesigninoptions)
	{
		return googlesigninoptions.zzajj;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field boolean zzajj>
	//    2    4:ireturn         
	}

	static boolean zze(GoogleSignInOptions googlesigninoptions)
	{
		return googlesigninoptions.zzajh;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field boolean zzajh>
	//    2    4:ireturn         
	}

	static String zzf(GoogleSignInOptions googlesigninoptions)
	{
		return googlesigninoptions.zzajk;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field String zzajk>
	//    2    4:areturn         
	}

	static Account zzg(GoogleSignInOptions googlesigninoptions)
	{
		return googlesigninoptions.zzagg;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field Account zzagg>
	//    2    4:areturn         
	}

	static String zzh(GoogleSignInOptions googlesigninoptions)
	{
		return googlesigninoptions.zzajl;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field String zzajl>
	//    2    4:areturn         
	}

	private JSONObject zzqI()
	{
		Object obj;
		JSONArray jsonarray;
		obj = ((Object) (new JSONObject()));
	//    0    0:new             #132 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #198 <Method void JSONObject()>
	//    3    7:astore_1        
		try
		{
			jsonarray = new JSONArray();
	//    4    8:new             #144 <Class JSONArray>
	//    5   11:dup             
	//    6   12:invokespecial   #199 <Method void JSONArray()>
	//    7   15:astore_2        
			Collections.sort(((java.util.List) (zzajg)), zzajc);
	//    8   16:aload_0         
	//    9   17:getfield        #89  <Field ArrayList zzajg>
	//   10   20:getstatic       #82  <Field Comparator zzajc>
	//   11   23:invokestatic    #205 <Method void Collections.sort(java.util.List, Comparator)>
			for(Iterator iterator = zzajg.iterator(); iterator.hasNext(); jsonarray.put(((Object) (((Scope)iterator.next()).zzuS()))));
	//   12   26:aload_0         
	//   13   27:getfield        #89  <Field ArrayList zzajg>
	//   14   30:invokevirtual   #209 <Method Iterator ArrayList.iterator()>
	//   15   33:astore_3        
	//   16   34:aload_3         
	//   17   35:invokeinterface #215 <Method boolean Iterator.hasNext()>
	//   18   40:ifeq            73
	//   19   43:aload_2         
	//   20   44:aload_3         
	//   21   45:invokeinterface #219 <Method Object Iterator.next()>
	//   22   50:checkcast       #43  <Class Scope>
	//   23   53:invokevirtual   #223 <Method String Scope.zzuS()>
	//   24   56:invokevirtual   #227 <Method JSONArray JSONArray.put(Object)>
	//   25   59:pop             
		}
	//*  26   60:goto            34
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  27   63:astore_1        
		{
			throw new RuntimeException(((Throwable) (obj)));
	//   28   64:new             #229 <Class RuntimeException>
	//   29   67:dup             
	//   30   68:aload_1         
	//   31   69:invokespecial   #232 <Method void RuntimeException(Throwable)>
	//   32   72:athrow          
		}
		((JSONObject) (obj)).put("scopes", ((Object) (jsonarray)));
	//   33   73:aload_1         
	//   34   74:ldc1            #138 <String "scopes">
	//   35   76:aload_2         
	//   36   77:invokevirtual   #235 <Method JSONObject JSONObject.put(String, Object)>
	//   37   80:pop             
		if(zzagg != null)
	//*  38   81:aload_0         
	//*  39   82:getfield        #91  <Field Account zzagg>
	//*  40   85:ifnull          102
			((JSONObject) (obj)).put("accountName", ((Object) (zzagg.name)));
	//   41   88:aload_1         
	//   42   89:ldc1            #160 <String "accountName">
	//   43   91:aload_0         
	//   44   92:getfield        #91  <Field Account zzagg>
	//   45   95:getfield        #238 <Field String Account.name>
	//   46   98:invokevirtual   #235 <Method JSONObject JSONObject.put(String, Object)>
	//   47  101:pop             
		((JSONObject) (obj)).put("idTokenRequested", zzajh);
	//   48  102:aload_1         
	//   49  103:ldc1            #173 <String "idTokenRequested">
	//   50  105:aload_0         
	//   51  106:getfield        #93  <Field boolean zzajh>
	//   52  109:invokevirtual   #241 <Method JSONObject JSONObject.put(String, boolean)>
	//   53  112:pop             
		((JSONObject) (obj)).put("forceCodeForRefreshToken", zzajj);
	//   54  113:aload_1         
	//   55  114:ldc1            #181 <String "forceCodeForRefreshToken">
	//   56  116:aload_0         
	//   57  117:getfield        #97  <Field boolean zzajj>
	//   58  120:invokevirtual   #241 <Method JSONObject JSONObject.put(String, boolean)>
	//   59  123:pop             
		((JSONObject) (obj)).put("serverAuthRequested", zzaji);
	//   60  124:aload_1         
	//   61  125:ldc1            #179 <String "serverAuthRequested">
	//   62  127:aload_0         
	//   63  128:getfield        #95  <Field boolean zzaji>
	//   64  131:invokevirtual   #241 <Method JSONObject JSONObject.put(String, boolean)>
	//   65  134:pop             
		if(!TextUtils.isEmpty(((CharSequence) (zzajk))))
	//*  66  135:aload_0         
	//*  67  136:getfield        #99  <Field String zzajk>
	//*  68  139:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  69  142:ifne            156
			((JSONObject) (obj)).put("serverClientId", ((Object) (zzajk)));
	//   70  145:aload_1         
	//   71  146:ldc1            #183 <String "serverClientId">
	//   72  148:aload_0         
	//   73  149:getfield        #99  <Field String zzajk>
	//   74  152:invokevirtual   #235 <Method JSONObject JSONObject.put(String, Object)>
	//   75  155:pop             
		if(!TextUtils.isEmpty(((CharSequence) (zzajl))))
	//*  76  156:aload_0         
	//*  77  157:getfield        #101 <Field String zzajl>
	//*  78  160:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  79  163:ifne            177
			((JSONObject) (obj)).put("hostedDomain", ((Object) (zzajl)));
	//   80  166:aload_1         
	//   81  167:ldc1            #185 <String "hostedDomain">
	//   82  169:aload_0         
	//   83  170:getfield        #101 <Field String zzajl>
	//   84  173:invokevirtual   #235 <Method JSONObject JSONObject.put(String, Object)>
	//   85  176:pop             
		return ((JSONObject) (obj));
	//   86  177:aload_1         
	//   87  178:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj != null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnonnull       6
_L1:
		return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
	//*   4    6:aload_1         
	//*   5    7:checkcast       #2   <Class GoogleSignInOptions>
	//*   6   10:astore_1        
_L2:
		if(zzajg.size() != ((GoogleSignInOptions) (obj = ((Object) ((GoogleSignInOptions)obj)))).zzqJ().size() || !zzajg.containsAll(((java.util.Collection) (((GoogleSignInOptions) (obj)).zzqJ())))) goto _L1; else goto _L3
	//    7   11:aload_0         
	//    8   12:getfield        #89  <Field ArrayList zzajg>
	//    9   15:invokevirtual   #247 <Method int ArrayList.size()>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #251 <Method ArrayList zzqJ()>
	//   12   22:invokevirtual   #247 <Method int ArrayList.size()>
	//   13   25:icmpne          4
	//   14   28:aload_0         
	//   15   29:getfield        #89  <Field ArrayList zzajg>
	//   16   32:aload_1         
	//   17   33:invokevirtual   #251 <Method ArrayList zzqJ()>
	//   18   36:invokevirtual   #255 <Method boolean ArrayList.containsAll(java.util.Collection)>
	//   19   39:ifeq            4
_L3:
		if(zzagg != null) goto _L5; else goto _L4
	//   20   42:aload_0         
	//   21   43:getfield        #91  <Field Account zzagg>
	//   22   46:ifnonnull       111
_L4:
		if(((GoogleSignInOptions) (obj)).getAccount() != null) goto _L1; else goto _L6
	//   23   49:aload_1         
	//   24   50:invokevirtual   #259 <Method Account getAccount()>
	//   25   53:ifnonnull       4
_L6:
		if(!TextUtils.isEmpty(((CharSequence) (zzajk)))) goto _L8; else goto _L7
	//   26   56:aload_0         
	//   27   57:getfield        #99  <Field String zzajk>
	//   28   60:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   29   63:ifeq            128
_L7:
		if(!TextUtils.isEmpty(((CharSequence) (((GoogleSignInOptions) (obj)).zzqN()))))
			break; /* Loop/switch isn't completed */
	//   30   66:aload_1         
	//   31   67:invokevirtual   #262 <Method String zzqN()>
	//   32   70:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   33   73:ifeq            4
_L10:
		if(zzajj == ((GoogleSignInOptions) (obj)).zzqM() && zzajh == ((GoogleSignInOptions) (obj)).zzqK() && zzaji == ((GoogleSignInOptions) (obj)).zzqL())
	//*  34   76:aload_0         
	//*  35   77:getfield        #97  <Field boolean zzajj>
	//*  36   80:aload_1         
	//*  37   81:invokevirtual   #265 <Method boolean zzqM()>
	//*  38   84:icmpne          4
	//*  39   87:aload_0         
	//*  40   88:getfield        #93  <Field boolean zzajh>
	//*  41   91:aload_1         
	//*  42   92:invokevirtual   #268 <Method boolean zzqK()>
	//*  43   95:icmpne          4
	//*  44   98:aload_0         
	//*  45   99:getfield        #95  <Field boolean zzaji>
	//*  46  102:aload_1         
	//*  47  103:invokevirtual   #271 <Method boolean zzqL()>
	//*  48  106:icmpne          4
			return true;
	//   49  109:iconst_1        
	//   50  110:ireturn         
		break; /* Loop/switch isn't completed */
_L5:
		if(!zzagg.equals(((Object) (((GoogleSignInOptions) (obj)).getAccount())))) goto _L9; else goto _L6
	//   51  111:aload_0         
	//   52  112:getfield        #91  <Field Account zzagg>
	//   53  115:aload_1         
	//   54  116:invokevirtual   #259 <Method Account getAccount()>
	//   55  119:invokevirtual   #273 <Method boolean Account.equals(Object)>
	//   56  122:ifeq            4
_L9:
		break; /* Loop/switch isn't completed */
	//   57  125:goto            56
_L8:
		boolean flag;
		try
		{
			flag = zzajk.equals(((Object) (((GoogleSignInOptions) (obj)).zzqN())));
	//   58  128:aload_0         
	//   59  129:getfield        #99  <Field String zzajk>
	//   60  132:aload_1         
	//   61  133:invokevirtual   #262 <Method String zzqN()>
	//   62  136:invokevirtual   #276 <Method boolean String.equals(Object)>
	//   63  139:istore_2        
		}
	//*  64  140:iload_2         
	//*  65  141:ifeq            4
	//*  66  144:goto            76
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  67  147:astore_1        
		{
			return false;
	//   68  148:iconst_0        
	//   69  149:ireturn         
		}
		if(!flag) goto _L1; else goto _L10
	}

	public Account getAccount()
	{
		return zzagg;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field Account zzagg>
	//    2    4:areturn         
	}

	public Scope[] getScopeArray()
	{
		return (Scope[])zzajg.toArray(((Object []) (new Scope[zzajg.size()])));
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field ArrayList zzajg>
	//    2    4:aload_0         
	//    3    5:getfield        #89  <Field ArrayList zzajg>
	//    4    8:invokevirtual   #247 <Method int ArrayList.size()>
	//    5   11:anewarray       Scope[]
	//    6   14:invokevirtual   #282 <Method Object[] ArrayList.toArray(Object[])>
	//    7   17:checkcast       #284 <Class Scope[]>
	//    8   20:areturn         
	}

	public int hashCode()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #106 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #286 <Method void ArrayList()>
	//    3    7:astore_1        
		for(Iterator iterator = zzajg.iterator(); iterator.hasNext(); arraylist.add(((Object) (((Scope)iterator.next()).zzuS()))));
	//    4    8:aload_0         
	//    5    9:getfield        #89  <Field ArrayList zzajg>
	//    6   12:invokevirtual   #209 <Method Iterator ArrayList.iterator()>
	//    7   15:astore_2        
	//    8   16:aload_2         
	//    9   17:invokeinterface #215 <Method boolean Iterator.hasNext()>
	//   10   22:ifeq            45
	//   11   25:aload_1         
	//   12   26:aload_2         
	//   13   27:invokeinterface #219 <Method Object Iterator.next()>
	//   14   32:checkcast       #43  <Class Scope>
	//   15   35:invokevirtual   #223 <Method String Scope.zzuS()>
	//   16   38:invokevirtual   #287 <Method boolean ArrayList.add(Object)>
	//   17   41:pop             
	//*  18   42:goto            16
		Collections.sort(((java.util.List) (arraylist)));
	//   19   45:aload_1         
	//   20   46:invokestatic    #290 <Method void Collections.sort(java.util.List)>
		return (new zzf()).zzq(((Object) (arraylist))).zzq(((Object) (zzagg))).zzq(((Object) (zzajk))).zzad(zzajj).zzad(zzajh).zzad(zzaji).zzqV();
	//   21   49:new             #292 <Class zzf>
	//   22   52:dup             
	//   23   53:invokespecial   #293 <Method void zzf()>
	//   24   56:aload_1         
	//   25   57:invokevirtual   #297 <Method zzf zzf.zzq(Object)>
	//   26   60:aload_0         
	//   27   61:getfield        #91  <Field Account zzagg>
	//   28   64:invokevirtual   #297 <Method zzf zzf.zzq(Object)>
	//   29   67:aload_0         
	//   30   68:getfield        #99  <Field String zzajk>
	//   31   71:invokevirtual   #297 <Method zzf zzf.zzq(Object)>
	//   32   74:aload_0         
	//   33   75:getfield        #97  <Field boolean zzajj>
	//   34   78:invokevirtual   #301 <Method zzf zzf.zzad(boolean)>
	//   35   81:aload_0         
	//   36   82:getfield        #93  <Field boolean zzajh>
	//   37   85:invokevirtual   #301 <Method zzf zzf.zzad(boolean)>
	//   38   88:aload_0         
	//   39   89:getfield        #95  <Field boolean zzaji>
	//   40   92:invokevirtual   #301 <Method zzf zzf.zzad(boolean)>
	//   41   95:invokevirtual   #304 <Method int zzf.zzqV()>
	//   42   98:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.auth.api.signin.zzb.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #310 <Method void com.google.android.gms.auth.api.signin.zzb.zza(GoogleSignInOptions, Parcel, int)>
	//    4    6:return          
	}

	public String zzqG()
	{
		return zzqI().toString();
	//    0    0:aload_0         
	//    1    1:invokespecial   #313 <Method JSONObject zzqI()>
	//    2    4:invokevirtual   #316 <Method String JSONObject.toString()>
	//    3    7:areturn         
	}

	public ArrayList zzqJ()
	{
		return new ArrayList(((java.util.Collection) (zzajg)));
	//    0    0:new             #106 <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #89  <Field ArrayList zzajg>
	//    4    8:invokespecial   #109 <Method void ArrayList(java.util.Collection)>
	//    5   11:areturn         
	}

	public boolean zzqK()
	{
		return zzajh;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field boolean zzajh>
	//    2    4:ireturn         
	}

	public boolean zzqL()
	{
		return zzaji;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field boolean zzaji>
	//    2    4:ireturn         
	}

	public boolean zzqM()
	{
		return zzajj;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field boolean zzajj>
	//    2    4:ireturn         
	}

	public String zzqN()
	{
		return zzajk;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field String zzajk>
	//    2    4:areturn         
	}

	public String zzqO()
	{
		return zzajl;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field String zzajl>
	//    2    4:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzb();
	public static final GoogleSignInOptions DEFAULT_SIGN_IN = (new Builder()).requestId().requestProfile().build();
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
	public static final Scope zzajd = new Scope("profile");
	public static final Scope zzaje = new Scope("email");
	public static final Scope zzajf = new Scope("openid");
	final int versionCode;
	private Account zzagg;
	private final ArrayList zzajg;
	private boolean zzajh;
	private final boolean zzaji;
	private final boolean zzajj;
	private String zzajk;
	private String zzajl;

	static 
	{
	//    0    0:new             #43  <Class Scope>
	//    1    3:dup             
	//    2    4:ldc1            #45  <String "profile">
	//    3    6:invokespecial   #49  <Method void Scope(String)>
	//    4    9:putstatic       #51  <Field Scope zzajd>
	//    5   12:new             #43  <Class Scope>
	//    6   15:dup             
	//    7   16:ldc1            #53  <String "email">
	//    8   18:invokespecial   #49  <Method void Scope(String)>
	//    9   21:putstatic       #55  <Field Scope zzaje>
	//   10   24:new             #43  <Class Scope>
	//   11   27:dup             
	//   12   28:ldc1            #57  <String "openid">
	//   13   30:invokespecial   #49  <Method void Scope(String)>
	//   14   33:putstatic       #59  <Field Scope zzajf>
	//   15   36:new             #12  <Class GoogleSignInOptions$Builder>
	//   16   39:dup             
	//   17   40:invokespecial   #61  <Method void GoogleSignInOptions$Builder()>
	//   18   43:invokevirtual   #65  <Method GoogleSignInOptions$Builder GoogleSignInOptions$Builder.requestId()>
	//   19   46:invokevirtual   #68  <Method GoogleSignInOptions$Builder GoogleSignInOptions$Builder.requestProfile()>
	//   20   49:invokevirtual   #72  <Method GoogleSignInOptions GoogleSignInOptions$Builder.build()>
	//   21   52:putstatic       #74  <Field GoogleSignInOptions DEFAULT_SIGN_IN>
	//   22   55:new             #76  <Class zzb>
	//   23   58:dup             
	//   24   59:invokespecial   #77  <Method void zzb()>
	//   25   62:putstatic       #79  <Field android.os.Parcelable$Creator CREATOR>
	//   26   65:new             #10  <Class GoogleSignInOptions$1>
	//   27   68:dup             
	//   28   69:invokespecial   #80  <Method void GoogleSignInOptions$1()>
	//   29   72:putstatic       #82  <Field Comparator zzajc>
	//*  30   75:return          
	}
}
