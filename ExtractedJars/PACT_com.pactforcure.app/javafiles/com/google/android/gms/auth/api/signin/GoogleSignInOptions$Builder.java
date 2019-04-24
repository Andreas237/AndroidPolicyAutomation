// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzac;
import java.util.*;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//			GoogleSignInOptions

public static final class GoogleSignInOptions$Builder
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
		return new GoogleSignInOptions(zzajm, zzagg, zzajh, zzaji, zzajj, zzajk, zzajl, ((GoogleSignInOptions._cls1) (null)));
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

	public GoogleSignInOptions$Builder requestEmail()
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

	public GoogleSignInOptions$Builder requestId()
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

	public GoogleSignInOptions$Builder requestIdToken(String s)
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

	public GoogleSignInOptions$Builder requestProfile()
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

	public transient GoogleSignInOptions$Builder requestScopes(Scope scope, Scope ascope[])
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

	public GoogleSignInOptions$Builder requestServerAuthCode(String s)
	{
		return requestServerAuthCode(s, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #144 <Method GoogleSignInOptions$Builder requestServerAuthCode(String, boolean)>
	//    4    6:areturn         
	}

	public GoogleSignInOptions$Builder requestServerAuthCode(String s, boolean flag)
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

	public GoogleSignInOptions$Builder setAccountName(String s)
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

	public GoogleSignInOptions$Builder setHostedDomain(String s)
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

	public GoogleSignInOptions$Builder()
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

	public GoogleSignInOptions$Builder(GoogleSignInOptions googlesigninoptions)
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
	//   14   26:invokestatic    #41  <Method java.util.ArrayList GoogleSignInOptions.zzb(GoogleSignInOptions)>
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
		zzajk = GoogleSignInOptions.zzf(googlesigninoptions);
	//   29   59:aload_0         
	//   30   60:aload_1         
	//   31   61:invokestatic    #64  <Method String GoogleSignInOptions.zzf(GoogleSignInOptions)>
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
