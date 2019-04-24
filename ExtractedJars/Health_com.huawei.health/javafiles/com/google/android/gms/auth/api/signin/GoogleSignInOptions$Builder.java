// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import com.google.android.gms.auth.api.signin.internal.zzg;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzac;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//			GoogleSignInOptions, GoogleSignInOptionsExtension

public static final class GoogleSignInOptions$Builder
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

	public GoogleSignInOptions$Builder addExtension(GoogleSignInOptionsExtension googlesigninoptionsextension)
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
		return new GoogleSignInOptions(3, new ArrayList(((java.util.Collection) (zzakq))), zzahh, zzajv, zzakl, zzakm, zzajw, zzakn, zzakr, ((GoogleSignInOptions._cls1) (null)));
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

	public GoogleSignInOptions$Builder requestEmail()
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

	public GoogleSignInOptions$Builder requestId()
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

	public GoogleSignInOptions$Builder requestIdToken(String s)
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

	public GoogleSignInOptions$Builder requestProfile()
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

	public transient GoogleSignInOptions$Builder requestScopes(Scope scope, Scope ascope[])
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
	//    8   16:invokestatic    #183 <Method java.util.List Arrays.asList(Object[])>
	//    9   19:invokeinterface #187 <Method boolean Set.addAll(java.util.Collection)>
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
	//    3    3:invokevirtual   #191 <Method GoogleSignInOptions$Builder requestServerAuthCode(String, boolean)>
	//    4    6:areturn         
	}

	public GoogleSignInOptions$Builder requestServerAuthCode(String s, boolean flag)
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

	public GoogleSignInOptions$Builder setAccountName(String s)
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

	public GoogleSignInOptions$Builder setHostedDomain(String s)
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

	public GoogleSignInOptions$Builder()
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

	public GoogleSignInOptions$Builder(GoogleSignInOptions googlesigninoptions)
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
		zzakn = GoogleSignInOptions.zzh(googlesigninoptions);
	//   42   86:aload_0         
	//   43   87:aload_1         
	//   44   88:invokestatic    #83  <Method String GoogleSignInOptions.zzh(GoogleSignInOptions)>
	//   45   91:putfield        #85  <Field String zzakn>
		zzakr = GoogleSignInOptions.zzy(((java.util.List) (GoogleSignInOptions.zzi(googlesigninoptions))));
	//   46   94:aload_0         
	//   47   95:aload_1         
	//   48   96:invokestatic    #88  <Method ArrayList GoogleSignInOptions.zzi(GoogleSignInOptions)>
	//   49   99:invokestatic    #92  <Method Map GoogleSignInOptions.zzy(java.util.List)>
	//   50  102:putfield        #36  <Field Map zzakr>
	//   51  105:return          
	}
}
