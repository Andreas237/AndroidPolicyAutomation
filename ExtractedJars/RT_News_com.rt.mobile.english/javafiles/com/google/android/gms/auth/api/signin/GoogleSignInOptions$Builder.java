// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import java.util.*;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//			GoogleSignInOptions, GoogleSignInOptionsExtension

public static final class GoogleSignInOptions$Builder
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

	public final GoogleSignInOptions$Builder addExtension(GoogleSignInOptionsExtension googlesigninoptionsextension)
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
	//*  13   32:invokeinterface #138 <Method java.util.List GoogleSignInOptionsExtension.getImpliedScopes()>
	//*  14   37:ifnull          56
			mScopes.addAll(((java.util.Collection) (googlesigninoptionsextension.getImpliedScopes())));
	//   15   40:aload_0         
	//   16   41:getfield        #31  <Field Set mScopes>
	//   17   44:aload_1         
	//   18   45:invokeinterface #138 <Method java.util.List GoogleSignInOptionsExtension.getImpliedScopes()>
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

	public final GoogleSignInOptions$Builder requestEmail()
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

	public final GoogleSignInOptions$Builder requestId()
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

	public final GoogleSignInOptions$Builder requestIdToken(String s)
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

	public final GoogleSignInOptions$Builder requestPhatIdToken(String s)
	{
		return requestIdToken(s).requestProfile().requestEmail();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #199 <Method GoogleSignInOptions$Builder requestIdToken(String)>
	//    3    5:invokevirtual   #202 <Method GoogleSignInOptions$Builder requestProfile()>
	//    4    8:invokevirtual   #204 <Method GoogleSignInOptions$Builder requestEmail()>
	//    5   11:areturn         
	}

	public final GoogleSignInOptions$Builder requestProfile()
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

	public final transient GoogleSignInOptions$Builder requestScopes(Scope scope, Scope ascope[])
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
	//    8   16:invokestatic    #215 <Method java.util.List Arrays.asList(Object[])>
	//    9   19:invokeinterface #144 <Method boolean Set.addAll(java.util.Collection)>
	//   10   24:pop             
		return this;
	//   11   25:aload_0         
	//   12   26:areturn         
	}

	public final GoogleSignInOptions$Builder requestServerAuthCode(String s)
	{
		return requestServerAuthCode(s, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #219 <Method GoogleSignInOptions$Builder requestServerAuthCode(String, boolean)>
	//    4    6:areturn         
	}

	public final GoogleSignInOptions$Builder requestServerAuthCode(String s, boolean flag)
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

	public final GoogleSignInOptions$Builder setAccount(Account account)
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

	public final GoogleSignInOptions$Builder setAccountName(String s)
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

	public final GoogleSignInOptions$Builder setHostedDomain(String s)
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

	public GoogleSignInOptions$Builder()
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

	public GoogleSignInOptions$Builder(GoogleSignInOptions googlesigninoptions)
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
		zzab = GoogleSignInOptions.zzb(((java.util.List) (GoogleSignInOptions.zzh(googlesigninoptions))));
	//   46   94:aload_0         
	//   47   95:aload_1         
	//   48   96:invokestatic    #88  <Method ArrayList GoogleSignInOptions.zzh(GoogleSignInOptions)>
	//   49   99:invokestatic    #91  <Method Map GoogleSignInOptions.zzb(java.util.List)>
	//   50  102:putfield        #36  <Field Map zzab>
	//   51  105:return          
	}
}
