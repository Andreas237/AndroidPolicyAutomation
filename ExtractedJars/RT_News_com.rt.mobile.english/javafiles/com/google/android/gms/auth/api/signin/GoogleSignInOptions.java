// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.HashAccumulator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.*;
import org.json.*;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//			GoogleSignInOptionsCreator, zzb, GoogleSignInOptionsExtension

public class GoogleSignInOptions extends AbstractSafeParcelable
	implements com.google.android.gms.common.api.Api.ApiOptions.Optional, ReflectedParcelable
{
	public static final class Builder
	{

		private final String zza(String s)
		{
			Preconditions.checkNotEmpty(s);
		//    0    0:aload_1         
		//    1    1:invokestatic    #96  <Method String Preconditions.checkNotEmpty(String)>
		//    2    4:pop             
			boolean flag;
			if(zzw != null && !zzw.equals(((Object) (s))))
		//*   3    5:aload_0         
		//*   4    6:getfield        #74  <Field String zzw>
		//*   5    9:ifnull          31
		//*   6   12:aload_0         
		//*   7   13:getfield        #74  <Field String zzw>
		//*   8   16:aload_1         
		//*   9   17:invokevirtual   #102 <Method boolean String.equals(Object)>
		//*  10   20:ifeq            26
		//*  11   23:goto            31
				flag = false;
		//   12   26:iconst_0        
		//   13   27:istore_2        
			else
		//*  14   28:goto            33
				flag = true;
		//   15   31:iconst_1        
		//   16   32:istore_2        
			Preconditions.checkArgument(flag, "two different server client ids provided");
		//   17   33:iload_2         
		//   18   34:ldc1            #104 <String "two different server client ids provided">
		//   19   36:invokestatic    #108 <Method void Preconditions.checkArgument(boolean, Object)>
			return s;
		//   20   39:aload_1         
		//   21   40:areturn         
		}

		public final Builder addExtension(GoogleSignInOptionsExtension googlesigninoptionsextension)
		{
			if(zzab.containsKey(((Object) (Integer.valueOf(googlesigninoptionsextension.getExtensionType())))))
		//*   0    0:aload_0         
		//*   1    1:getfield        #36  <Field Map zzab>
		//*   2    4:aload_1         
		//*   3    5:invokeinterface #116 <Method int GoogleSignInOptionsExtension.getExtensionType()>
		//*   4   10:invokestatic    #122 <Method Integer Integer.valueOf(int)>
		//*   5   13:invokeinterface #127 <Method boolean Map.containsKey(Object)>
		//*   6   18:ifeq            31
				throw new IllegalStateException("Only one extension per type may be added");
		//    7   21:new             #129 <Class IllegalStateException>
		//    8   24:dup             
		//    9   25:ldc1            #131 <String "Only one extension per type may be added">
		//   10   27:invokespecial   #134 <Method void IllegalStateException(String)>
		//   11   30:athrow          
			if(googlesigninoptionsextension.getImpliedScopes() != null)
		//*  12   31:aload_1         
		//*  13   32:invokeinterface #138 <Method List GoogleSignInOptionsExtension.getImpliedScopes()>
		//*  14   37:ifnull          56
				mScopes.addAll(((java.util.Collection) (googlesigninoptionsextension.getImpliedScopes())));
		//   15   40:aload_0         
		//   16   41:getfield        #31  <Field Set mScopes>
		//   17   44:aload_1         
		//   18   45:invokeinterface #138 <Method List GoogleSignInOptionsExtension.getImpliedScopes()>
		//   19   50:invokeinterface #144 <Method boolean Set.addAll(java.util.Collection)>
		//   20   55:pop             
			zzab.put(((Object) (Integer.valueOf(googlesigninoptionsextension.getExtensionType()))), ((Object) (new GoogleSignInOptionsExtensionParcelable(googlesigninoptionsextension))));
		//   21   56:aload_0         
		//   22   57:getfield        #36  <Field Map zzab>
		//   23   60:aload_1         
		//   24   61:invokeinterface #116 <Method int GoogleSignInOptionsExtension.getExtensionType()>
		//   25   66:invokestatic    #122 <Method Integer Integer.valueOf(int)>
		//   26   69:new             #146 <Class GoogleSignInOptionsExtensionParcelable>
		//   27   72:dup             
		//   28   73:aload_1         
		//   29   74:invokespecial   #149 <Method void GoogleSignInOptionsExtensionParcelable(GoogleSignInOptionsExtension)>
		//   30   77:invokeinterface #153 <Method Object Map.put(Object, Object)>
		//   31   82:pop             
			return this;
		//   32   83:aload_0         
		//   33   84:areturn         
		}

		public final GoogleSignInOptions build()
		{
			if(mScopes.contains(((Object) (GoogleSignInOptions.SCOPE_GAMES))) && mScopes.contains(((Object) (GoogleSignInOptions.SCOPE_GAMES_LITE))))
		//*   0    0:aload_0         
		//*   1    1:getfield        #31  <Field Set mScopes>
		//*   2    4:getstatic       #159 <Field Scope GoogleSignInOptions.SCOPE_GAMES>
		//*   3    7:invokeinterface #162 <Method boolean Set.contains(Object)>
		//*   4   12:ifeq            43
		//*   5   15:aload_0         
		//*   6   16:getfield        #31  <Field Set mScopes>
		//*   7   19:getstatic       #165 <Field Scope GoogleSignInOptions.SCOPE_GAMES_LITE>
		//*   8   22:invokeinterface #162 <Method boolean Set.contains(Object)>
		//*   9   27:ifeq            43
				mScopes.remove(((Object) (GoogleSignInOptions.SCOPE_GAMES_LITE)));
		//   10   30:aload_0         
		//   11   31:getfield        #31  <Field Set mScopes>
		//   12   34:getstatic       #165 <Field Scope GoogleSignInOptions.SCOPE_GAMES_LITE>
		//   13   37:invokeinterface #168 <Method boolean Set.remove(Object)>
		//   14   42:pop             
			if(zzt && (zzs == null || !mScopes.isEmpty()))
		//*  15   43:aload_0         
		//*  16   44:getfield        #68  <Field boolean zzt>
		//*  17   47:ifeq            74
		//*  18   50:aload_0         
		//*  19   51:getfield        #80  <Field Account zzs>
		//*  20   54:ifnull          69
		//*  21   57:aload_0         
		//*  22   58:getfield        #31  <Field Set mScopes>
		//*  23   61:invokeinterface #172 <Method boolean Set.isEmpty()>
		//*  24   66:ifne            74
				requestId();
		//   25   69:aload_0         
		//   26   70:invokevirtual   #176 <Method GoogleSignInOptions$Builder requestId()>
		//   27   73:pop             
			return new GoogleSignInOptions(3, new ArrayList(((java.util.Collection) (mScopes))), zzs, zzt, zzu, zzv, zzw, zzx, zzab, ((zzb) (null)));
		//   28   74:new             #6   <Class GoogleSignInOptions>
		//   29   77:dup             
		//   30   78:iconst_3        
		//   31   79:new             #178 <Class ArrayList>
		//   32   82:dup             
		//   33   83:aload_0         
		//   34   84:getfield        #31  <Field Set mScopes>
		//   35   87:invokespecial   #179 <Method void ArrayList(java.util.Collection)>
		//   36   90:aload_0         
		//   37   91:getfield        #80  <Field Account zzs>
		//   38   94:aload_0         
		//   39   95:getfield        #68  <Field boolean zzt>
		//   40   98:aload_0         
		//   41   99:getfield        #58  <Field boolean zzu>
		//   42  102:aload_0         
		//   43  103:getfield        #63  <Field boolean zzv>
		//   44  106:aload_0         
		//   45  107:getfield        #74  <Field String zzw>
		//   46  110:aload_0         
		//   47  111:getfield        #85  <Field String zzx>
		//   48  114:aload_0         
		//   49  115:getfield        #36  <Field Map zzab>
		//   50  118:aconst_null     
		//   51  119:invokespecial   #182 <Method void GoogleSignInOptions(int, ArrayList, Account, boolean, boolean, boolean, String, String, Map, zzb)>
		//   52  122:areturn         
		}

		public final Builder requestEmail()
		{
			mScopes.add(((Object) (GoogleSignInOptions.SCOPE_EMAIL)));
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field Set mScopes>
		//    2    4:getstatic       #186 <Field Scope GoogleSignInOptions.SCOPE_EMAIL>
		//    3    7:invokeinterface #189 <Method boolean Set.add(Object)>
		//    4   12:pop             
			return this;
		//    5   13:aload_0         
		//    6   14:areturn         
		}

		public final Builder requestId()
		{
			mScopes.add(((Object) (GoogleSignInOptions.SCOPE_OPEN_ID)));
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field Set mScopes>
		//    2    4:getstatic       #192 <Field Scope GoogleSignInOptions.SCOPE_OPEN_ID>
		//    3    7:invokeinterface #189 <Method boolean Set.add(Object)>
		//    4   12:pop             
			return this;
		//    5   13:aload_0         
		//    6   14:areturn         
		}

		public final Builder requestIdToken(String s)
		{
			zzt = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #68  <Field boolean zzt>
			zzw = zza(s);
		//    3    5:aload_0         
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokespecial   #196 <Method String zza(String)>
		//    7   11:putfield        #74  <Field String zzw>
			return this;
		//    8   14:aload_0         
		//    9   15:areturn         
		}

		public final Builder requestPhatIdToken(String s)
		{
			return requestIdToken(s).requestProfile().requestEmail();
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #199 <Method GoogleSignInOptions$Builder requestIdToken(String)>
		//    3    5:invokevirtual   #202 <Method GoogleSignInOptions$Builder requestProfile()>
		//    4    8:invokevirtual   #204 <Method GoogleSignInOptions$Builder requestEmail()>
		//    5   11:areturn         
		}

		public final Builder requestProfile()
		{
			mScopes.add(((Object) (GoogleSignInOptions.SCOPE_PROFILE)));
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field Set mScopes>
		//    2    4:getstatic       #207 <Field Scope GoogleSignInOptions.SCOPE_PROFILE>
		//    3    7:invokeinterface #189 <Method boolean Set.add(Object)>
		//    4   12:pop             
			return this;
		//    5   13:aload_0         
		//    6   14:areturn         
		}

		public final transient Builder requestScopes(Scope scope, Scope ascope[])
		{
			mScopes.add(((Object) (scope)));
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field Set mScopes>
		//    2    4:aload_1         
		//    3    5:invokeinterface #189 <Method boolean Set.add(Object)>
		//    4   10:pop             
			mScopes.addAll(((java.util.Collection) (Arrays.asList(((Object []) (ascope))))));
		//    5   11:aload_0         
		//    6   12:getfield        #31  <Field Set mScopes>
		//    7   15:aload_2         
		//    8   16:invokestatic    #215 <Method List Arrays.asList(Object[])>
		//    9   19:invokeinterface #144 <Method boolean Set.addAll(java.util.Collection)>
		//   10   24:pop             
			return this;
		//   11   25:aload_0         
		//   12   26:areturn         
		}

		public final Builder requestServerAuthCode(String s)
		{
			return requestServerAuthCode(s, false);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #219 <Method GoogleSignInOptions$Builder requestServerAuthCode(String, boolean)>
		//    4    6:areturn         
		}

		public final Builder requestServerAuthCode(String s, boolean flag)
		{
			zzu = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #58  <Field boolean zzu>
			zzw = zza(s);
		//    3    5:aload_0         
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokespecial   #196 <Method String zza(String)>
		//    7   11:putfield        #74  <Field String zzw>
			zzv = flag;
		//    8   14:aload_0         
		//    9   15:iload_2         
		//   10   16:putfield        #63  <Field boolean zzv>
			return this;
		//   11   19:aload_0         
		//   12   20:areturn         
		}

		public final Builder setAccount(Account account)
		{
			zzs = (Account)Preconditions.checkNotNull(((Object) (account)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #45  <Method Object Preconditions.checkNotNull(Object)>
		//    3    5:checkcast       #223 <Class Account>
		//    4    8:putfield        #80  <Field Account zzs>
			return this;
		//    5   11:aload_0         
		//    6   12:areturn         
		}

		public final Builder setAccountName(String s)
		{
			zzs = new Account(Preconditions.checkNotEmpty(s), "com.google");
		//    0    0:aload_0         
		//    1    1:new             #223 <Class Account>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:invokestatic    #96  <Method String Preconditions.checkNotEmpty(String)>
		//    5    9:ldc1            #226 <String "com.google">
		//    6   11:invokespecial   #229 <Method void Account(String, String)>
		//    7   14:putfield        #80  <Field Account zzs>
			return this;
		//    8   17:aload_0         
		//    9   18:areturn         
		}

		public final Builder setHostedDomain(String s)
		{
			zzx = Preconditions.checkNotEmpty(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #96  <Method String Preconditions.checkNotEmpty(String)>
		//    3    5:putfield        #85  <Field String zzx>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		private Set mScopes;
		private Map zzab;
		private Account zzs;
		private boolean zzt;
		private boolean zzu;
		private boolean zzv;
		private String zzw;
		private String zzx;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			mScopes = ((Set) (new HashSet()));
		//    2    4:aload_0         
		//    3    5:new             #28  <Class HashSet>
		//    4    8:dup             
		//    5    9:invokespecial   #29  <Method void HashSet()>
		//    6   12:putfield        #31  <Field Set mScopes>
			zzab = ((Map) (new HashMap()));
		//    7   15:aload_0         
		//    8   16:new             #33  <Class HashMap>
		//    9   19:dup             
		//   10   20:invokespecial   #34  <Method void HashMap()>
		//   11   23:putfield        #36  <Field Map zzab>
		//   12   26:return          
		}

		public Builder(GoogleSignInOptions googlesigninoptions)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			mScopes = ((Set) (new HashSet()));
		//    2    4:aload_0         
		//    3    5:new             #28  <Class HashSet>
		//    4    8:dup             
		//    5    9:invokespecial   #29  <Method void HashSet()>
		//    6   12:putfield        #31  <Field Set mScopes>
			zzab = ((Map) (new HashMap()));
		//    7   15:aload_0         
		//    8   16:new             #33  <Class HashMap>
		//    9   19:dup             
		//   10   20:invokespecial   #34  <Method void HashMap()>
		//   11   23:putfield        #36  <Field Map zzab>
			Preconditions.checkNotNull(((Object) (googlesigninoptions)));
		//   12   26:aload_1         
		//   13   27:invokestatic    #45  <Method Object Preconditions.checkNotNull(Object)>
		//   14   30:pop             
			mScopes = ((Set) (new HashSet(((java.util.Collection) (GoogleSignInOptions.zza(googlesigninoptions))))));
		//   15   31:aload_0         
		//   16   32:new             #28  <Class HashSet>
		//   17   35:dup             
		//   18   36:aload_1         
		//   19   37:invokestatic    #49  <Method ArrayList GoogleSignInOptions.zza(GoogleSignInOptions)>
		//   20   40:invokespecial   #52  <Method void HashSet(java.util.Collection)>
		//   21   43:putfield        #31  <Field Set mScopes>
			zzu = GoogleSignInOptions.zzb(googlesigninoptions);
		//   22   46:aload_0         
		//   23   47:aload_1         
		//   24   48:invokestatic    #56  <Method boolean GoogleSignInOptions.zzb(GoogleSignInOptions)>
		//   25   51:putfield        #58  <Field boolean zzu>
			zzv = GoogleSignInOptions.zzc(googlesigninoptions);
		//   26   54:aload_0         
		//   27   55:aload_1         
		//   28   56:invokestatic    #61  <Method boolean GoogleSignInOptions.zzc(GoogleSignInOptions)>
		//   29   59:putfield        #63  <Field boolean zzv>
			zzt = GoogleSignInOptions.zzd(googlesigninoptions);
		//   30   62:aload_0         
		//   31   63:aload_1         
		//   32   64:invokestatic    #66  <Method boolean GoogleSignInOptions.zzd(GoogleSignInOptions)>
		//   33   67:putfield        #68  <Field boolean zzt>
			zzw = GoogleSignInOptions.zze(googlesigninoptions);
		//   34   70:aload_0         
		//   35   71:aload_1         
		//   36   72:invokestatic    #72  <Method String GoogleSignInOptions.zze(GoogleSignInOptions)>
		//   37   75:putfield        #74  <Field String zzw>
			zzs = GoogleSignInOptions.zzf(googlesigninoptions);
		//   38   78:aload_0         
		//   39   79:aload_1         
		//   40   80:invokestatic    #78  <Method Account GoogleSignInOptions.zzf(GoogleSignInOptions)>
		//   41   83:putfield        #80  <Field Account zzs>
			zzx = GoogleSignInOptions.zzg(googlesigninoptions);
		//   42   86:aload_0         
		//   43   87:aload_1         
		//   44   88:invokestatic    #83  <Method String GoogleSignInOptions.zzg(GoogleSignInOptions)>
		//   45   91:putfield        #85  <Field String zzx>
			zzab = GoogleSignInOptions.zzb(((List) (GoogleSignInOptions.zzh(googlesigninoptions))));
		//   46   94:aload_0         
		//   47   95:aload_1         
		//   48   96:invokestatic    #88  <Method ArrayList GoogleSignInOptions.zzh(GoogleSignInOptions)>
		//   49   99:invokestatic    #91  <Method Map GoogleSignInOptions.zzb(List)>
		//   50  102:putfield        #36  <Field Map zzab>
		//   51  105:return          
		}
	}


	GoogleSignInOptions(int i, ArrayList arraylist, Account account, boolean flag, boolean flag1, boolean flag2, String s, 
			String s1, ArrayList arraylist1)
	{
		this(i, arraylist, account, flag, flag1, flag2, s, s1, zza(((List) (arraylist1))));
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
	//   10   16:invokestatic    #137 <Method Map zza(List)>
	//   11   19:invokespecial   #140 <Method void GoogleSignInOptions(int, ArrayList, Account, boolean, boolean, boolean, String, String, Map)>
	//   12   22:return          
	}

	private GoogleSignInOptions(int i, ArrayList arraylist, Account account, boolean flag, boolean flag1, boolean flag2, String s, 
			String s1, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #145 <Method void AbstractSafeParcelable()>
		versionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #147 <Field int versionCode>
		zzr = arraylist;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #149 <Field ArrayList zzr>
		zzs = account;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #151 <Field Account zzs>
		zzt = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #153 <Field boolean zzt>
		zzu = flag1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #155 <Field boolean zzu>
		zzv = flag2;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #157 <Field boolean zzv>
		zzw = s;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #159 <Field String zzw>
		zzx = s1;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #161 <Field String zzx>
		zzy = new ArrayList(map.values());
	//   26   49:aload_0         
	//   27   50:new             #163 <Class ArrayList>
	//   28   53:dup             
	//   29   54:aload           9
	//   30   56:invokeinterface #169 <Method java.util.Collection Map.values()>
	//   31   61:invokespecial   #172 <Method void ArrayList(java.util.Collection)>
	//   32   64:putfield        #174 <Field ArrayList zzy>
		zzz = map;
	//   33   67:aload_0         
	//   34   68:aload           9
	//   35   70:putfield        #176 <Field Map zzz>
	//   36   73:return          
	}

	GoogleSignInOptions(int i, ArrayList arraylist, Account account, boolean flag, boolean flag1, boolean flag2, String s, 
			String s1, Map map, zzb zzb1)
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
	//   10   16:invokespecial   #140 <Method void GoogleSignInOptions(int, ArrayList, Account, boolean, boolean, boolean, String, String, Map)>
	//   11   19:return          
	}

	public static GoogleSignInOptions fromJsonString(String s)
		throws JSONException
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #189 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		JSONObject jsonobject = new JSONObject(s);
	//    5    9:new             #191 <Class JSONObject>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokespecial   #192 <Method void JSONObject(String)>
	//    9   17:astore_3        
		HashSet hashset = new HashSet();
	//   10   18:new             #194 <Class HashSet>
	//   11   21:dup             
	//   12   22:invokespecial   #195 <Method void HashSet()>
	//   13   25:astore          4
		s = ((String) (jsonobject.getJSONArray("scopes")));
	//   14   27:aload_3         
	//   15   28:ldc1            #197 <String "scopes">
	//   16   30:invokevirtual   #201 <Method JSONArray JSONObject.getJSONArray(String)>
	//   17   33:astore_0        
		int j = ((JSONArray) (s)).length();
	//   18   34:aload_0         
	//   19   35:invokevirtual   #207 <Method int JSONArray.length()>
	//   20   38:istore_2        
		for(int i = 0; i < j; i++)
	//*  21   39:iconst_0        
	//*  22   40:istore_1        
	//*  23   41:iload_1         
	//*  24   42:iload_2         
	//*  25   43:icmpge          73
			((Set) (hashset)).add(((Object) (new Scope(((JSONArray) (s)).getString(i)))));
	//   26   46:aload           4
	//   27   48:new             #74  <Class Scope>
	//   28   51:dup             
	//   29   52:aload_0         
	//   30   53:iload_1         
	//   31   54:invokevirtual   #211 <Method String JSONArray.getString(int)>
	//   32   57:invokespecial   #80  <Method void Scope(String)>
	//   33   60:invokeinterface #217 <Method boolean Set.add(Object)>
	//   34   65:pop             

	//   35   66:iload_1         
	//   36   67:iconst_1        
	//   37   68:iadd            
	//   38   69:istore_1        
	//*  39   70:goto            41
		s = jsonobject.optString("accountName", ((String) (null)));
	//   40   73:aload_3         
	//   41   74:ldc1            #219 <String "accountName">
	//   42   76:aconst_null     
	//   43   77:invokevirtual   #223 <Method String JSONObject.optString(String, String)>
	//   44   80:astore_0        
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*  45   81:aload_0         
	//*  46   82:invokestatic    #189 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  47   85:ifne            102
			s = ((String) (new Account(s, "com.google")));
	//   48   88:new             #225 <Class Account>
	//   49   91:dup             
	//   50   92:aload_0         
	//   51   93:ldc1            #227 <String "com.google">
	//   52   95:invokespecial   #230 <Method void Account(String, String)>
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
	//   60  109:new             #163 <Class ArrayList>
	//   61  112:dup             
	//   62  113:aload           4
	//   63  115:invokespecial   #172 <Method void ArrayList(java.util.Collection)>
	//   64  118:aload_0         
	//   65  119:aload_3         
	//   66  120:ldc1            #232 <String "idTokenRequested">
	//   67  122:invokevirtual   #236 <Method boolean JSONObject.getBoolean(String)>
	//   68  125:aload_3         
	//   69  126:ldc1            #238 <String "serverAuthRequested">
	//   70  128:invokevirtual   #236 <Method boolean JSONObject.getBoolean(String)>
	//   71  131:aload_3         
	//   72  132:ldc1            #240 <String "forceCodeForRefreshToken">
	//   73  134:invokevirtual   #236 <Method boolean JSONObject.getBoolean(String)>
	//   74  137:aload_3         
	//   75  138:ldc1            #242 <String "serverClientId">
	//   76  140:aconst_null     
	//   77  141:invokevirtual   #223 <Method String JSONObject.optString(String, String)>
	//   78  144:aload_3         
	//   79  145:ldc1            #244 <String "hostedDomain">
	//   80  147:aconst_null     
	//   81  148:invokevirtual   #223 <Method String JSONObject.optString(String, String)>
	//   82  151:new             #246 <Class HashMap>
	//   83  154:dup             
	//   84  155:invokespecial   #247 <Method void HashMap()>
	//   85  158:invokespecial   #140 <Method void GoogleSignInOptions(int, ArrayList, Account, boolean, boolean, boolean, String, String, Map)>
	//   86  161:areturn         
	}

	static ArrayList zza(GoogleSignInOptions googlesigninoptions)
	{
		return googlesigninoptions.zzr;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field ArrayList zzr>
	//    2    4:areturn         
	}

	private static Map zza(List list)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #246 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #247 <Method void HashMap()>
	//    3    7:astore_1        
		if(list == null)
	//*   4    8:aload_0         
	//*   5    9:ifnonnull       14
			return ((Map) (hashmap));
	//    6   12:aload_1         
	//    7   13:areturn         
		GoogleSignInOptionsExtensionParcelable googlesigninoptionsextensionparcelable;
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((Map) (hashmap)).put(((Object) (Integer.valueOf(googlesigninoptionsextensionparcelable.getType()))), ((Object) (googlesigninoptionsextensionparcelable))))
	//*   8   14:aload_0         
	//*   9   15:invokeinterface #255 <Method Iterator List.iterator()>
	//*  10   20:astore_0        
	//*  11   21:aload_0         
	//*  12   22:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//*  13   27:ifeq            58
			googlesigninoptionsextensionparcelable = (GoogleSignInOptionsExtensionParcelable)((Iterator) (list)).next();
	//   14   30:aload_0         
	//   15   31:invokeinterface #265 <Method Object Iterator.next()>
	//   16   36:checkcast       #267 <Class GoogleSignInOptionsExtensionParcelable>
	//   17   39:astore_2        

	//   18   40:aload_1         
	//   19   41:aload_2         
	//   20   42:invokevirtual   #270 <Method int GoogleSignInOptionsExtensionParcelable.getType()>
	//   21   45:invokestatic    #276 <Method Integer Integer.valueOf(int)>
	//   22   48:aload_2         
	//   23   49:invokeinterface #280 <Method Object Map.put(Object, Object)>
	//   24   54:pop             
	//*  25   55:goto            21
		return ((Map) (hashmap));
	//   26   58:aload_1         
	//   27   59:areturn         
	}

	private final JSONObject zza()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #191 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #283 <Method void JSONObject()>
	//    3    7:astore_3        
		int i;
		int j;
		JSONArray jsonarray;
		ArrayList arraylist;
		Object obj;
		try
		{
			jsonarray = new JSONArray();
	//    4    8:new             #203 <Class JSONArray>
	//    5   11:dup             
	//    6   12:invokespecial   #284 <Method void JSONArray()>
	//    7   15:astore          4
			Collections.sort(((List) (zzr)), zzaa);
	//    8   17:aload_0         
	//    9   18:getfield        #149 <Field ArrayList zzr>
	//   10   21:getstatic       #129 <Field Comparator zzaa>
	//   11   24:invokestatic    #290 <Method void Collections.sort(List, Comparator)>
			arraylist = (ArrayList)zzr;
	//   12   27:aload_0         
	//   13   28:getfield        #149 <Field ArrayList zzr>
	//   14   31:checkcast       #163 <Class ArrayList>
	//   15   34:astore          5
			j = arraylist.size();
	//   16   36:aload           5
	//   17   38:invokevirtual   #293 <Method int ArrayList.size()>
	//   18   41:istore_2        
		}
	//*  19   42:iconst_0        
	//*  20   43:istore_1        
	//*  21   44:iload_1         
	//*  22   45:iload_2         
	//*  23   46:icmpge          78
	//*  24   49:aload           5
	//*  25   51:iload_1         
	//*  26   52:invokevirtual   #297 <Method Object ArrayList.get(int)>
	//*  27   55:astore          6
	//*  28   57:iload_1         
	//*  29   58:iconst_1        
	//*  30   59:iadd            
	//*  31   60:istore_1        
	//*  32   61:aload           4
	//*  33   63:aload           6
	//*  34   65:checkcast       #74  <Class Scope>
	//*  35   68:invokevirtual   #301 <Method String Scope.getScopeUri()>
	//*  36   71:invokevirtual   #304 <Method JSONArray JSONArray.put(Object)>
	//*  37   74:pop             
	//*  38   75:goto            44
	//*  39   78:aload_3         
	//*  40   79:ldc1            #197 <String "scopes">
	//*  41   81:aload           4
	//*  42   83:invokevirtual   #307 <Method JSONObject JSONObject.put(String, Object)>
	//*  43   86:pop             
	//*  44   87:aload_0         
	//*  45   88:getfield        #151 <Field Account zzs>
	//*  46   91:ifnull          108
	//*  47   94:aload_3         
	//*  48   95:ldc1            #219 <String "accountName">
	//*  49   97:aload_0         
	//*  50   98:getfield        #151 <Field Account zzs>
	//*  51  101:getfield        #310 <Field String Account.name>
	//*  52  104:invokevirtual   #307 <Method JSONObject JSONObject.put(String, Object)>
	//*  53  107:pop             
	//*  54  108:aload_3         
	//*  55  109:ldc1            #232 <String "idTokenRequested">
	//*  56  111:aload_0         
	//*  57  112:getfield        #153 <Field boolean zzt>
	//*  58  115:invokevirtual   #313 <Method JSONObject JSONObject.put(String, boolean)>
	//*  59  118:pop             
	//*  60  119:aload_3         
	//*  61  120:ldc1            #240 <String "forceCodeForRefreshToken">
	//*  62  122:aload_0         
	//*  63  123:getfield        #157 <Field boolean zzv>
	//*  64  126:invokevirtual   #313 <Method JSONObject JSONObject.put(String, boolean)>
	//*  65  129:pop             
	//*  66  130:aload_3         
	//*  67  131:ldc1            #238 <String "serverAuthRequested">
	//*  68  133:aload_0         
	//*  69  134:getfield        #155 <Field boolean zzu>
	//*  70  137:invokevirtual   #313 <Method JSONObject JSONObject.put(String, boolean)>
	//*  71  140:pop             
	//*  72  141:aload_0         
	//*  73  142:getfield        #159 <Field String zzw>
	//*  74  145:invokestatic    #189 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  75  148:ifne            162
	//*  76  151:aload_3         
	//*  77  152:ldc1            #242 <String "serverClientId">
	//*  78  154:aload_0         
	//*  79  155:getfield        #159 <Field String zzw>
	//*  80  158:invokevirtual   #307 <Method JSONObject JSONObject.put(String, Object)>
	//*  81  161:pop             
	//*  82  162:aload_0         
	//*  83  163:getfield        #161 <Field String zzx>
	//*  84  166:invokestatic    #189 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  85  169:ifne            183
	//*  86  172:aload_3         
	//*  87  173:ldc1            #244 <String "hostedDomain">
	//*  88  175:aload_0         
	//*  89  176:getfield        #161 <Field String zzx>
	//*  90  179:invokevirtual   #307 <Method JSONObject JSONObject.put(String, Object)>
	//*  91  182:pop             
	//*  92  183:aload_3         
	//*  93  184:areturn         
		catch(JSONException jsonexception)
	//*  94  185:astore_3        
		{
			throw new RuntimeException(((Throwable) (jsonexception)));
	//   95  186:new             #315 <Class RuntimeException>
	//   96  189:dup             
	//   97  190:aload_3         
	//   98  191:invokespecial   #318 <Method void RuntimeException(Throwable)>
	//   99  194:athrow          
		}
		i = 0;
		if(i >= j)
			break MISSING_BLOCK_LABEL_78;
		obj = arraylist.get(i);
		i++;
		jsonarray.put(((Object) (((Scope)obj).getScopeUri())));
		break MISSING_BLOCK_LABEL_44;
		jsonobject.put("scopes", ((Object) (jsonarray)));
		if(zzs != null)
			jsonobject.put("accountName", ((Object) (zzs.name)));
		jsonobject.put("idTokenRequested", zzt);
		jsonobject.put("forceCodeForRefreshToken", zzv);
		jsonobject.put("serverAuthRequested", zzu);
		if(!TextUtils.isEmpty(((CharSequence) (zzw))))
			jsonobject.put("serverClientId", ((Object) (zzw)));
		if(!TextUtils.isEmpty(((CharSequence) (zzx))))
			jsonobject.put("hostedDomain", ((Object) (zzx)));
		return jsonobject;
	}

	static Map zzb(List list)
	{
		return zza(list);
	//    0    0:aload_0         
	//    1    1:invokestatic    #137 <Method Map zza(List)>
	//    2    4:areturn         
	}

	static boolean zzb(GoogleSignInOptions googlesigninoptions)
	{
		return googlesigninoptions.zzu;
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field boolean zzu>
	//    2    4:ireturn         
	}

	static boolean zzc(GoogleSignInOptions googlesigninoptions)
	{
		return googlesigninoptions.zzv;
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field boolean zzv>
	//    2    4:ireturn         
	}

	static boolean zzd(GoogleSignInOptions googlesigninoptions)
	{
		return googlesigninoptions.zzt;
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field boolean zzt>
	//    2    4:ireturn         
	}

	static String zze(GoogleSignInOptions googlesigninoptions)
	{
		return googlesigninoptions.zzw;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field String zzw>
	//    2    4:areturn         
	}

	static Account zzf(GoogleSignInOptions googlesigninoptions)
	{
		return googlesigninoptions.zzs;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field Account zzs>
	//    2    4:areturn         
	}

	static String zzg(GoogleSignInOptions googlesigninoptions)
	{
		return googlesigninoptions.zzx;
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field String zzx>
	//    2    4:areturn         
	}

	static ArrayList zzh(GoogleSignInOptions googlesigninoptions)
	{
		return googlesigninoptions.zzy;
	//    0    0:aload_0         
	//    1    1:getfield        #174 <Field ArrayList zzy>
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
		obj = ((Object) ((GoogleSignInOptions)obj));
	//    4    6:aload_1         
	//    5    7:checkcast       #2   <Class GoogleSignInOptions>
	//    6   10:astore_1        
		if(zzy.size() > 0)
			break MISSING_BLOCK_LABEL_173;
	//    7   11:aload_0         
	//    8   12:getfield        #174 <Field ArrayList zzy>
	//    9   15:invokevirtual   #293 <Method int ArrayList.size()>
	//   10   18:ifgt            173
		if(((GoogleSignInOptions) (obj)).zzy.size() > 0)
	//*  11   21:aload_1         
	//*  12   22:getfield        #174 <Field ArrayList zzy>
	//*  13   25:invokevirtual   #293 <Method int ArrayList.size()>
	//*  14   28:ifle            33
			return false;
	//   15   31:iconst_0        
	//   16   32:ireturn         
		if(zzr.size() != ((GoogleSignInOptions) (obj)).getScopes().size())
			break MISSING_BLOCK_LABEL_173;
	//   17   33:aload_0         
	//   18   34:getfield        #149 <Field ArrayList zzr>
	//   19   37:invokevirtual   #293 <Method int ArrayList.size()>
	//   20   40:aload_1         
	//   21   41:invokevirtual   #334 <Method ArrayList getScopes()>
	//   22   44:invokevirtual   #293 <Method int ArrayList.size()>
	//   23   47:icmpne          173
		if(!zzr.containsAll(((java.util.Collection) (((GoogleSignInOptions) (obj)).getScopes()))))
	//*  24   50:aload_0         
	//*  25   51:getfield        #149 <Field ArrayList zzr>
	//*  26   54:aload_1         
	//*  27   55:invokevirtual   #334 <Method ArrayList getScopes()>
	//*  28   58:invokevirtual   #338 <Method boolean ArrayList.containsAll(java.util.Collection)>
	//*  29   61:ifne            66
			return false;
	//   30   64:iconst_0        
	//   31   65:ireturn         
		boolean flag;
		boolean flag1;
		try
		{
			if(zzs == null)
	//*  32   66:aload_0         
	//*  33   67:getfield        #151 <Field Account zzs>
	//*  34   70:ifnonnull       83
			{
				if(((GoogleSignInOptions) (obj)).getAccount() != null)
	//*  35   73:aload_1         
	//*  36   74:invokevirtual   #341 <Method Account getAccount()>
	//*  37   77:ifnonnull       173
					break MISSING_BLOCK_LABEL_173;
	//   38   80:goto            97
				break MISSING_BLOCK_LABEL_97;
			}
		}
	//*  39   83:aload_0         
	//*  40   84:getfield        #151 <Field Account zzs>
	//*  41   87:aload_1         
	//*  42   88:invokevirtual   #341 <Method Account getAccount()>
	//*  43   91:invokevirtual   #343 <Method boolean Account.equals(Object)>
	//*  44   94:ifeq            173
	//*  45   97:aload_0         
	//*  46   98:getfield        #159 <Field String zzw>
	//*  47  101:invokestatic    #189 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  48  104:ifeq            120
	//*  49  107:aload_1         
	//*  50  108:invokevirtual   #345 <Method String getServerClientId()>
	//*  51  111:invokestatic    #189 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  52  114:ifeq            173
	//*  53  117:goto            134
	//*  54  120:aload_0         
	//*  55  121:getfield        #159 <Field String zzw>
	//*  56  124:aload_1         
	//*  57  125:invokevirtual   #345 <Method String getServerClientId()>
	//*  58  128:invokevirtual   #348 <Method boolean String.equals(Object)>
	//*  59  131:ifeq            173
	//*  60  134:aload_0         
	//*  61  135:getfield        #157 <Field boolean zzv>
	//*  62  138:aload_1         
	//*  63  139:invokevirtual   #350 <Method boolean isForceCodeForRefreshToken()>
	//*  64  142:icmpne          173
	//*  65  145:aload_0         
	//*  66  146:getfield        #153 <Field boolean zzt>
	//*  67  149:aload_1         
	//*  68  150:invokevirtual   #352 <Method boolean isIdTokenRequested()>
	//*  69  153:icmpne          173
	//*  70  156:aload_0         
	//*  71  157:getfield        #155 <Field boolean zzu>
	//*  72  160:istore_2        
	//*  73  161:aload_1         
	//*  74  162:invokevirtual   #354 <Method boolean isServerAuthCodeRequested()>
	//*  75  165:istore_3        
	//*  76  166:iload_2         
	//*  77  167:iload_3         
	//*  78  168:icmpne          173
	//*  79  171:iconst_1        
	//*  80  172:ireturn         
	//*  81  173:iconst_0        
	//*  82  174:ireturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  83  175:astore_1        
		{
			return false;
	//   84  176:iconst_0        
	//   85  177:ireturn         
		}
		if(!zzs.equals(((Object) (((GoogleSignInOptions) (obj)).getAccount()))))
			break MISSING_BLOCK_LABEL_173;
		if(TextUtils.isEmpty(((CharSequence) (zzw))))
		{
			if(!TextUtils.isEmpty(((CharSequence) (((GoogleSignInOptions) (obj)).getServerClientId()))))
				break MISSING_BLOCK_LABEL_173;
			break MISSING_BLOCK_LABEL_134;
		}
		if(!zzw.equals(((Object) (((GoogleSignInOptions) (obj)).getServerClientId()))))
			break MISSING_BLOCK_LABEL_173;
		if(zzv != ((GoogleSignInOptions) (obj)).isForceCodeForRefreshToken() || zzt != ((GoogleSignInOptions) (obj)).isIdTokenRequested())
			break MISSING_BLOCK_LABEL_173;
		flag = zzu;
		flag1 = ((GoogleSignInOptions) (obj)).isServerAuthCodeRequested();
		if(flag == flag1)
			return true;
		return false;
	}

	public Account getAccount()
	{
		return zzs;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field Account zzs>
	//    2    4:areturn         
	}

	public GoogleSignInOptionsExtensionParcelable getExtension(int i)
	{
		return (GoogleSignInOptionsExtensionParcelable)zzz.get(((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #176 <Field Map zzz>
	//    2    4:iload_1         
	//    3    5:invokestatic    #276 <Method Integer Integer.valueOf(int)>
	//    4    8:invokeinterface #360 <Method Object Map.get(Object)>
	//    5   13:checkcast       #267 <Class GoogleSignInOptionsExtensionParcelable>
	//    6   16:areturn         
	}

	public ArrayList getExtensions()
	{
		return zzy;
	//    0    0:aload_0         
	//    1    1:getfield        #174 <Field ArrayList zzy>
	//    2    4:areturn         
	}

	public String getHostedDomain()
	{
		return zzx;
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field String zzx>
	//    2    4:areturn         
	}

	public Scope[] getScopeArray()
	{
		return (Scope[])zzr.toArray(((Object []) (new Scope[zzr.size()])));
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field ArrayList zzr>
	//    2    4:aload_0         
	//    3    5:getfield        #149 <Field ArrayList zzr>
	//    4    8:invokevirtual   #293 <Method int ArrayList.size()>
	//    5   11:anewarray       Scope[]
	//    6   14:invokevirtual   #367 <Method Object[] ArrayList.toArray(Object[])>
	//    7   17:checkcast       #369 <Class Scope[]>
	//    8   20:areturn         
	}

	public ArrayList getScopes()
	{
		return new ArrayList(((java.util.Collection) (zzr)));
	//    0    0:new             #163 <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #149 <Field ArrayList zzr>
	//    4    8:invokespecial   #172 <Method void ArrayList(java.util.Collection)>
	//    5   11:areturn         
	}

	public String getServerClientId()
	{
		return zzw;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field String zzw>
	//    2    4:areturn         
	}

	public boolean hasExtension(int i)
	{
		return zzz.containsKey(((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #176 <Field Map zzz>
	//    2    4:iload_1         
	//    3    5:invokestatic    #276 <Method Integer Integer.valueOf(int)>
	//    4    8:invokeinterface #375 <Method boolean Map.containsKey(Object)>
	//    5   13:ireturn         
	}

	public int hashCode()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #163 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #377 <Method void ArrayList()>
	//    3    7:astore_3        
		ArrayList arraylist1 = (ArrayList)zzr;
	//    4    8:aload_0         
	//    5    9:getfield        #149 <Field ArrayList zzr>
	//    6   12:checkcast       #163 <Class ArrayList>
	//    7   15:astore          4
		int j = arraylist1.size();
	//    8   17:aload           4
	//    9   19:invokevirtual   #293 <Method int ArrayList.size()>
	//   10   22:istore_2        
		for(int i = 0; i < j;)
	//*  11   23:iconst_0        
	//*  12   24:istore_1        
	//*  13   25:iload_1         
	//*  14   26:iload_2         
	//*  15   27:icmpge          58
		{
			Object obj = arraylist1.get(i);
	//   16   30:aload           4
	//   17   32:iload_1         
	//   18   33:invokevirtual   #297 <Method Object ArrayList.get(int)>
	//   19   36:astore          5
			i++;
	//   20   38:iload_1         
	//   21   39:iconst_1        
	//   22   40:iadd            
	//   23   41:istore_1        
			arraylist.add(((Object) (((Scope)obj).getScopeUri())));
	//   24   42:aload_3         
	//   25   43:aload           5
	//   26   45:checkcast       #74  <Class Scope>
	//   27   48:invokevirtual   #301 <Method String Scope.getScopeUri()>
	//   28   51:invokevirtual   #378 <Method boolean ArrayList.add(Object)>
	//   29   54:pop             
		}

	//*  30   55:goto            25
		Collections.sort(((List) (arraylist)));
	//   31   58:aload_3         
	//   32   59:invokestatic    #381 <Method void Collections.sort(List)>
		return (new HashAccumulator()).addObject(((Object) (arraylist))).addObject(((Object) (zzs))).addObject(((Object) (zzw))).addBoolean(zzv).addBoolean(zzt).addBoolean(zzu).hash();
	//   33   62:new             #383 <Class HashAccumulator>
	//   34   65:dup             
	//   35   66:invokespecial   #384 <Method void HashAccumulator()>
	//   36   69:aload_3         
	//   37   70:invokevirtual   #388 <Method HashAccumulator HashAccumulator.addObject(Object)>
	//   38   73:aload_0         
	//   39   74:getfield        #151 <Field Account zzs>
	//   40   77:invokevirtual   #388 <Method HashAccumulator HashAccumulator.addObject(Object)>
	//   41   80:aload_0         
	//   42   81:getfield        #159 <Field String zzw>
	//   43   84:invokevirtual   #388 <Method HashAccumulator HashAccumulator.addObject(Object)>
	//   44   87:aload_0         
	//   45   88:getfield        #157 <Field boolean zzv>
	//   46   91:invokevirtual   #392 <Method HashAccumulator HashAccumulator.addBoolean(boolean)>
	//   47   94:aload_0         
	//   48   95:getfield        #153 <Field boolean zzt>
	//   49   98:invokevirtual   #392 <Method HashAccumulator HashAccumulator.addBoolean(boolean)>
	//   50  101:aload_0         
	//   51  102:getfield        #155 <Field boolean zzu>
	//   52  105:invokevirtual   #392 <Method HashAccumulator HashAccumulator.addBoolean(boolean)>
	//   53  108:invokevirtual   #395 <Method int HashAccumulator.hash()>
	//   54  111:ireturn         
	}

	public boolean isForceCodeForRefreshToken()
	{
		return zzv;
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field boolean zzv>
	//    2    4:ireturn         
	}

	public boolean isIdTokenRequested()
	{
		return zzt;
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field boolean zzt>
	//    2    4:ireturn         
	}

	public boolean isServerAuthCodeRequested()
	{
		return zzu;
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field boolean zzu>
	//    2    4:ireturn         
	}

	public String toJson()
	{
		return zza().toString();
	//    0    0:aload_0         
	//    1    1:invokespecial   #398 <Method JSONObject zza()>
	//    2    4:invokevirtual   #401 <Method String JSONObject.toString()>
	//    3    7:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #409 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeInt(parcel, 1, versionCode);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #147 <Field int versionCode>
	//    7   11:invokestatic    #413 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeTypedList(parcel, 2, ((List) (getScopes())), false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #334 <Method ArrayList getScopes()>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #417 <Method void SafeParcelWriter.writeTypedList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 3, ((android.os.Parcelable) (getAccount())), i, false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:invokevirtual   #341 <Method Account getAccount()>
	//   18   30:iload_2         
	//   19   31:iconst_0        
	//   20   32:invokestatic    #421 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 4, isIdTokenRequested());
	//   21   35:aload_1         
	//   22   36:iconst_4        
	//   23   37:aload_0         
	//   24   38:invokevirtual   #352 <Method boolean isIdTokenRequested()>
	//   25   41:invokestatic    #425 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 5, isServerAuthCodeRequested());
	//   26   44:aload_1         
	//   27   45:iconst_5        
	//   28   46:aload_0         
	//   29   47:invokevirtual   #354 <Method boolean isServerAuthCodeRequested()>
	//   30   50:invokestatic    #425 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 6, isForceCodeForRefreshToken());
	//   31   53:aload_1         
	//   32   54:bipush          6
	//   33   56:aload_0         
	//   34   57:invokevirtual   #350 <Method boolean isForceCodeForRefreshToken()>
	//   35   60:invokestatic    #425 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeString(parcel, 7, getServerClientId(), false);
	//   36   63:aload_1         
	//   37   64:bipush          7
	//   38   66:aload_0         
	//   39   67:invokevirtual   #345 <Method String getServerClientId()>
	//   40   70:iconst_0        
	//   41   71:invokestatic    #429 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 8, getHostedDomain(), false);
	//   42   74:aload_1         
	//   43   75:bipush          8
	//   44   77:aload_0         
	//   45   78:invokevirtual   #431 <Method String getHostedDomain()>
	//   46   81:iconst_0        
	//   47   82:invokestatic    #429 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeTypedList(parcel, 9, ((List) (getExtensions())), false);
	//   48   85:aload_1         
	//   49   86:bipush          9
	//   50   88:aload_0         
	//   51   89:invokevirtual   #433 <Method ArrayList getExtensions()>
	//   52   92:iconst_0        
	//   53   93:invokestatic    #417 <Method void SafeParcelWriter.writeTypedList(Parcel, int, List, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   54   96:aload_1         
	//   55   97:iload_3         
	//   56   98:invokestatic    #436 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   57  101:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new GoogleSignInOptionsCreator();
	public static final GoogleSignInOptions DEFAULT_GAMES_SIGN_IN;
	public static final GoogleSignInOptions DEFAULT_SIGN_IN = (new Builder()).requestId().requestProfile().build();
	public static final Scope SCOPE_EMAIL = new Scope("email");
	public static final Scope SCOPE_GAMES = new Scope("https://www.googleapis.com/auth/games");
	public static final Scope SCOPE_GAMES_LITE;
	public static final Scope SCOPE_OPEN_ID = new Scope("openid");
	public static final Scope SCOPE_PROFILE = new Scope("profile");
	private static Comparator zzaa = new zzb();
	private final int versionCode;
	private final ArrayList zzr;
	private Account zzs;
	private boolean zzt;
	private final boolean zzu;
	private final boolean zzv;
	private String zzw;
	private String zzx;
	private ArrayList zzy;
	private Map zzz;

	static 
	{
	//    0    0:new             #74  <Class Scope>
	//    1    3:dup             
	//    2    4:ldc1            #76  <String "profile">
	//    3    6:invokespecial   #80  <Method void Scope(String)>
	//    4    9:putstatic       #82  <Field Scope SCOPE_PROFILE>
	//    5   12:new             #74  <Class Scope>
	//    6   15:dup             
	//    7   16:ldc1            #84  <String "email">
	//    8   18:invokespecial   #80  <Method void Scope(String)>
	//    9   21:putstatic       #86  <Field Scope SCOPE_EMAIL>
	//   10   24:new             #74  <Class Scope>
	//   11   27:dup             
	//   12   28:ldc1            #88  <String "openid">
	//   13   30:invokespecial   #80  <Method void Scope(String)>
	//   14   33:putstatic       #90  <Field Scope SCOPE_OPEN_ID>
		SCOPE_GAMES_LITE = new Scope("https://www.googleapis.com/auth/games_lite");
	//   15   36:new             #74  <Class Scope>
	//   16   39:dup             
	//   17   40:ldc1            #92  <String "https://www.googleapis.com/auth/games_lite">
	//   18   42:invokespecial   #80  <Method void Scope(String)>
	//   19   45:putstatic       #94  <Field Scope SCOPE_GAMES_LITE>
	//   20   48:new             #74  <Class Scope>
	//   21   51:dup             
	//   22   52:ldc1            #96  <String "https://www.googleapis.com/auth/games">
	//   23   54:invokespecial   #80  <Method void Scope(String)>
	//   24   57:putstatic       #98  <Field Scope SCOPE_GAMES>
	//   25   60:new             #10  <Class GoogleSignInOptions$Builder>
	//   26   63:dup             
	//   27   64:invokespecial   #100 <Method void GoogleSignInOptions$Builder()>
	//   28   67:invokevirtual   #104 <Method GoogleSignInOptions$Builder GoogleSignInOptions$Builder.requestId()>
	//   29   70:invokevirtual   #107 <Method GoogleSignInOptions$Builder GoogleSignInOptions$Builder.requestProfile()>
	//   30   73:invokevirtual   #111 <Method GoogleSignInOptions GoogleSignInOptions$Builder.build()>
	//   31   76:putstatic       #113 <Field GoogleSignInOptions DEFAULT_SIGN_IN>
		DEFAULT_GAMES_SIGN_IN = (new Builder()).requestScopes(SCOPE_GAMES_LITE, new Scope[0]).build();
	//   32   79:new             #10  <Class GoogleSignInOptions$Builder>
	//   33   82:dup             
	//   34   83:invokespecial   #100 <Method void GoogleSignInOptions$Builder()>
	//   35   86:getstatic       #94  <Field Scope SCOPE_GAMES_LITE>
	//   36   89:iconst_0        
	//   37   90:anewarray       Scope[]
	//   38   93:invokevirtual   #117 <Method GoogleSignInOptions$Builder GoogleSignInOptions$Builder.requestScopes(Scope, Scope[])>
	//   39   96:invokevirtual   #111 <Method GoogleSignInOptions GoogleSignInOptions$Builder.build()>
	//   40   99:putstatic       #119 <Field GoogleSignInOptions DEFAULT_GAMES_SIGN_IN>
	//   41  102:new             #121 <Class GoogleSignInOptionsCreator>
	//   42  105:dup             
	//   43  106:invokespecial   #122 <Method void GoogleSignInOptionsCreator()>
	//   44  109:putstatic       #124 <Field android.os.Parcelable$Creator CREATOR>
	//   45  112:new             #126 <Class zzb>
	//   46  115:dup             
	//   47  116:invokespecial   #127 <Method void zzb()>
	//   48  119:putstatic       #129 <Field Comparator zzaa>
	//*  49  122:return          
	}
}
