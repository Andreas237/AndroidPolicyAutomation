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

	private final String zac(String s)
	{
		Preconditions.checkNotEmpty(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #96  <Method String Preconditions.checkNotEmpty(String)>
	//    2    4:pop             
		String s1 = zaab;
	//    3    5:aload_0         
	//    4    6:getfield        #74  <Field String zaab>
	//    5    9:astore_3        
		boolean flag;
		if(s1 != null && !s1.equals(((Object) (s))))
	//*   6   10:aload_3         
	//*   7   11:ifnull          30
	//*   8   14:aload_3         
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #102 <Method boolean String.equals(Object)>
	//*  11   19:ifeq            25
	//*  12   22:goto            30
			flag = false;
	//   13   25:iconst_0        
	//   14   26:istore_2        
		else
	//*  15   27:goto            32
			flag = true;
	//   16   30:iconst_1        
	//   17   31:istore_2        
		Preconditions.checkArgument(flag, "two different server client ids provided");
	//   18   32:iload_2         
	//   19   33:ldc1            #104 <String "two different server client ids provided">
	//   20   35:invokestatic    #108 <Method void Preconditions.checkArgument(boolean, Object)>
		return s;
	//   21   38:aload_1         
	//   22   39:areturn         
	}

	public final GoogleSignInOptions$Builder addExtension(GoogleSignInOptionsExtension googlesigninoptionsextension)
	{
		if(!zaag.containsKey(((Object) (Integer.valueOf(googlesigninoptionsextension.getExtensionType())))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field Map zaag>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #116 <Method int GoogleSignInOptionsExtension.getExtensionType()>
	//*   4   10:invokestatic    #122 <Method Integer Integer.valueOf(int)>
	//*   5   13:invokeinterface #127 <Method boolean Map.containsKey(Object)>
	//*   6   18:ifne            75
		{
			if(googlesigninoptionsextension.getImpliedScopes() != null)
	//*   7   21:aload_1         
	//*   8   22:invokeinterface #131 <Method java.util.List GoogleSignInOptionsExtension.getImpliedScopes()>
	//*   9   27:ifnull          46
				mScopes.addAll(((java.util.Collection) (googlesigninoptionsextension.getImpliedScopes())));
	//   10   30:aload_0         
	//   11   31:getfield        #31  <Field Set mScopes>
	//   12   34:aload_1         
	//   13   35:invokeinterface #131 <Method java.util.List GoogleSignInOptionsExtension.getImpliedScopes()>
	//   14   40:invokeinterface #137 <Method boolean Set.addAll(java.util.Collection)>
	//   15   45:pop             
			zaag.put(((Object) (Integer.valueOf(googlesigninoptionsextension.getExtensionType()))), ((Object) (new GoogleSignInOptionsExtensionParcelable(googlesigninoptionsextension))));
	//   16   46:aload_0         
	//   17   47:getfield        #36  <Field Map zaag>
	//   18   50:aload_1         
	//   19   51:invokeinterface #116 <Method int GoogleSignInOptionsExtension.getExtensionType()>
	//   20   56:invokestatic    #122 <Method Integer Integer.valueOf(int)>
	//   21   59:new             #139 <Class GoogleSignInOptionsExtensionParcelable>
	//   22   62:dup             
	//   23   63:aload_1         
	//   24   64:invokespecial   #142 <Method void GoogleSignInOptionsExtensionParcelable(GoogleSignInOptionsExtension)>
	//   25   67:invokeinterface #146 <Method Object Map.put(Object, Object)>
	//   26   72:pop             
			return this;
	//   27   73:aload_0         
	//   28   74:areturn         
		} else
		{
			throw new IllegalStateException("Only one extension per type may be added");
	//   29   75:new             #148 <Class IllegalStateException>
	//   30   78:dup             
	//   31   79:ldc1            #150 <String "Only one extension per type may be added">
	//   32   81:invokespecial   #153 <Method void IllegalStateException(String)>
	//   33   84:athrow          
		}
	}

	public final GoogleSignInOptions build()
	{
		if(mScopes.contains(((Object) (GoogleSignInOptions.zav))) && mScopes.contains(((Object) (GoogleSignInOptions.zau))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field Set mScopes>
	//*   2    4:getstatic       #159 <Field Scope GoogleSignInOptions.zav>
	//*   3    7:invokeinterface #162 <Method boolean Set.contains(Object)>
	//*   4   12:ifeq            43
	//*   5   15:aload_0         
	//*   6   16:getfield        #31  <Field Set mScopes>
	//*   7   19:getstatic       #165 <Field Scope GoogleSignInOptions.zau>
	//*   8   22:invokeinterface #162 <Method boolean Set.contains(Object)>
	//*   9   27:ifeq            43
			mScopes.remove(((Object) (GoogleSignInOptions.zau)));
	//   10   30:aload_0         
	//   11   31:getfield        #31  <Field Set mScopes>
	//   12   34:getstatic       #165 <Field Scope GoogleSignInOptions.zau>
	//   13   37:invokeinterface #168 <Method boolean Set.remove(Object)>
	//   14   42:pop             
		if(zay && (zax == null || !mScopes.isEmpty()))
	//*  15   43:aload_0         
	//*  16   44:getfield        #68  <Field boolean zay>
	//*  17   47:ifeq            74
	//*  18   50:aload_0         
	//*  19   51:getfield        #80  <Field Account zax>
	//*  20   54:ifnull          69
	//*  21   57:aload_0         
	//*  22   58:getfield        #31  <Field Set mScopes>
	//*  23   61:invokeinterface #172 <Method boolean Set.isEmpty()>
	//*  24   66:ifne            74
			requestId();
	//   25   69:aload_0         
	//   26   70:invokevirtual   #176 <Method GoogleSignInOptions$Builder requestId()>
	//   27   73:pop             
		return new GoogleSignInOptions(3, new ArrayList(((java.util.Collection) (mScopes))), zax, zay, zaz, zaaa, zaab, zaac, zaag, ((zac) (null)));
	//   28   74:new             #6   <Class GoogleSignInOptions>
	//   29   77:dup             
	//   30   78:iconst_3        
	//   31   79:new             #178 <Class ArrayList>
	//   32   82:dup             
	//   33   83:aload_0         
	//   34   84:getfield        #31  <Field Set mScopes>
	//   35   87:invokespecial   #179 <Method void ArrayList(java.util.Collection)>
	//   36   90:aload_0         
	//   37   91:getfield        #80  <Field Account zax>
	//   38   94:aload_0         
	//   39   95:getfield        #68  <Field boolean zay>
	//   40   98:aload_0         
	//   41   99:getfield        #58  <Field boolean zaz>
	//   42  102:aload_0         
	//   43  103:getfield        #63  <Field boolean zaaa>
	//   44  106:aload_0         
	//   45  107:getfield        #74  <Field String zaab>
	//   46  110:aload_0         
	//   47  111:getfield        #85  <Field String zaac>
	//   48  114:aload_0         
	//   49  115:getfield        #36  <Field Map zaag>
	//   50  118:aconst_null     
	//   51  119:invokespecial   #182 <Method void GoogleSignInOptions(int, ArrayList, Account, boolean, boolean, boolean, String, String, Map, zac)>
	//   52  122:areturn         
	}

	public final GoogleSignInOptions$Builder requestEmail()
	{
		mScopes.add(((Object) (GoogleSignInOptions.zas)));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Set mScopes>
	//    2    4:getstatic       #186 <Field Scope GoogleSignInOptions.zas>
	//    3    7:invokeinterface #189 <Method boolean Set.add(Object)>
	//    4   12:pop             
		return this;
	//    5   13:aload_0         
	//    6   14:areturn         
	}

	public final GoogleSignInOptions$Builder requestId()
	{
		mScopes.add(((Object) (GoogleSignInOptions.zat)));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Set mScopes>
	//    2    4:getstatic       #192 <Field Scope GoogleSignInOptions.zat>
	//    3    7:invokeinterface #189 <Method boolean Set.add(Object)>
	//    4   12:pop             
		return this;
	//    5   13:aload_0         
	//    6   14:areturn         
	}

	public final GoogleSignInOptions$Builder requestIdToken(String s)
	{
		zay = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #68  <Field boolean zay>
		zaab = zac(s);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #196 <Method String zac(String)>
	//    7   11:putfield        #74  <Field String zaab>
		return this;
	//    8   14:aload_0         
	//    9   15:areturn         
	}

	public final GoogleSignInOptions$Builder requestProfile()
	{
		mScopes.add(((Object) (GoogleSignInOptions.zar)));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Set mScopes>
	//    2    4:getstatic       #200 <Field Scope GoogleSignInOptions.zar>
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
	//    8   16:invokestatic    #208 <Method java.util.List Arrays.asList(Object[])>
	//    9   19:invokeinterface #137 <Method boolean Set.addAll(java.util.Collection)>
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
	//    3    3:invokevirtual   #212 <Method GoogleSignInOptions$Builder requestServerAuthCode(String, boolean)>
	//    4    6:areturn         
	}

	public final GoogleSignInOptions$Builder requestServerAuthCode(String s, boolean flag)
	{
		zaz = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #58  <Field boolean zaz>
		zaab = zac(s);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #196 <Method String zac(String)>
	//    7   11:putfield        #74  <Field String zaab>
		zaaa = flag;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #63  <Field boolean zaaa>
		return this;
	//   11   19:aload_0         
	//   12   20:areturn         
	}

	public final GoogleSignInOptions$Builder setAccountName(String s)
	{
		zax = new Account(Preconditions.checkNotEmpty(s), "com.google");
	//    0    0:aload_0         
	//    1    1:new             #215 <Class Account>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokestatic    #96  <Method String Preconditions.checkNotEmpty(String)>
	//    5    9:ldc1            #217 <String "com.google">
	//    6   11:invokespecial   #220 <Method void Account(String, String)>
	//    7   14:putfield        #80  <Field Account zax>
		return this;
	//    8   17:aload_0         
	//    9   18:areturn         
	}

	public final GoogleSignInOptions$Builder setHostedDomain(String s)
	{
		zaac = Preconditions.checkNotEmpty(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #96  <Method String Preconditions.checkNotEmpty(String)>
	//    3    5:putfield        #85  <Field String zaac>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	private Set mScopes;
	private boolean zaaa;
	private String zaab;
	private String zaac;
	private Map zaag;
	private Account zax;
	private boolean zay;
	private boolean zaz;

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
		zaag = ((Map) (new HashMap()));
	//    7   15:aload_0         
	//    8   16:new             #33  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #34  <Method void HashMap()>
	//   11   23:putfield        #36  <Field Map zaag>
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
		zaag = ((Map) (new HashMap()));
	//    7   15:aload_0         
	//    8   16:new             #33  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #34  <Method void HashMap()>
	//   11   23:putfield        #36  <Field Map zaag>
		Preconditions.checkNotNull(((Object) (googlesigninoptions)));
	//   12   26:aload_1         
	//   13   27:invokestatic    #45  <Method Object Preconditions.checkNotNull(Object)>
	//   14   30:pop             
		mScopes = ((Set) (new HashSet(((java.util.Collection) (GoogleSignInOptions.zaa(googlesigninoptions))))));
	//   15   31:aload_0         
	//   16   32:new             #28  <Class HashSet>
	//   17   35:dup             
	//   18   36:aload_1         
	//   19   37:invokestatic    #49  <Method ArrayList GoogleSignInOptions.zaa(GoogleSignInOptions)>
	//   20   40:invokespecial   #52  <Method void HashSet(java.util.Collection)>
	//   21   43:putfield        #31  <Field Set mScopes>
		zaz = GoogleSignInOptions.zab(googlesigninoptions);
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:invokestatic    #56  <Method boolean GoogleSignInOptions.zab(GoogleSignInOptions)>
	//   25   51:putfield        #58  <Field boolean zaz>
		zaaa = GoogleSignInOptions.zac(googlesigninoptions);
	//   26   54:aload_0         
	//   27   55:aload_1         
	//   28   56:invokestatic    #61  <Method boolean GoogleSignInOptions.zac(GoogleSignInOptions)>
	//   29   59:putfield        #63  <Field boolean zaaa>
		zay = GoogleSignInOptions.zad(googlesigninoptions);
	//   30   62:aload_0         
	//   31   63:aload_1         
	//   32   64:invokestatic    #66  <Method boolean GoogleSignInOptions.zad(GoogleSignInOptions)>
	//   33   67:putfield        #68  <Field boolean zay>
		zaab = GoogleSignInOptions.zae(googlesigninoptions);
	//   34   70:aload_0         
	//   35   71:aload_1         
	//   36   72:invokestatic    #72  <Method String GoogleSignInOptions.zae(GoogleSignInOptions)>
	//   37   75:putfield        #74  <Field String zaab>
		zax = GoogleSignInOptions.zaf(googlesigninoptions);
	//   38   78:aload_0         
	//   39   79:aload_1         
	//   40   80:invokestatic    #78  <Method Account GoogleSignInOptions.zaf(GoogleSignInOptions)>
	//   41   83:putfield        #80  <Field Account zax>
		zaac = GoogleSignInOptions.zag(googlesigninoptions);
	//   42   86:aload_0         
	//   43   87:aload_1         
	//   44   88:invokestatic    #83  <Method String GoogleSignInOptions.zag(GoogleSignInOptions)>
	//   45   91:putfield        #85  <Field String zaac>
		zaag = GoogleSignInOptions.zab(((java.util.List) (GoogleSignInOptions.zah(googlesigninoptions))));
	//   46   94:aload_0         
	//   47   95:aload_1         
	//   48   96:invokestatic    #88  <Method ArrayList GoogleSignInOptions.zah(GoogleSignInOptions)>
	//   49   99:invokestatic    #91  <Method Map GoogleSignInOptions.zab(java.util.List)>
	//   50  102:putfield        #36  <Field Map zaag>
	//   51  105:return          
	}
}
