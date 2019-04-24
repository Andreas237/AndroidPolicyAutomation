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
	//    1    1:invokestatic    #94  <Method String Preconditions.checkNotEmpty(String)>
	//    2    4:pop             
		boolean flag;
		if(zaab != null && !zaab.equals(((Object) (s))))
	//*   3    5:aload_0         
	//*   4    6:getfield        #73  <Field String zaab>
	//*   5    9:ifnull          31
	//*   6   12:aload_0         
	//*   7   13:getfield        #73  <Field String zaab>
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #100 <Method boolean String.equals(Object)>
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
	//   18   34:ldc1            #102 <String "two different server client ids provided">
	//   19   36:invokestatic    #106 <Method void Preconditions.checkArgument(boolean, Object)>
		return s;
	//   20   39:aload_1         
	//   21   40:areturn         
	}

	public final GoogleSignInOptions$Builder addExtension(GoogleSignInOptionsExtension googlesigninoptionsextension)
	{
		if(zaag.containsKey(((Object) (Integer.valueOf(googlesigninoptionsextension.getExtensionType())))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field Map zaag>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #114 <Method int GoogleSignInOptionsExtension.getExtensionType()>
	//*   4   10:invokestatic    #120 <Method Integer Integer.valueOf(int)>
	//*   5   13:invokeinterface #125 <Method boolean Map.containsKey(Object)>
	//*   6   18:ifeq            31
			throw new IllegalStateException("Only one extension per type may be added");
	//    7   21:new             #127 <Class IllegalStateException>
	//    8   24:dup             
	//    9   25:ldc1            #129 <String "Only one extension per type may be added">
	//   10   27:invokespecial   #132 <Method void IllegalStateException(String)>
	//   11   30:athrow          
		if(googlesigninoptionsextension.getImpliedScopes() != null)
	//*  12   31:aload_1         
	//*  13   32:invokeinterface #136 <Method java.util.List GoogleSignInOptionsExtension.getImpliedScopes()>
	//*  14   37:ifnull          56
			mScopes.addAll(((java.util.Collection) (googlesigninoptionsextension.getImpliedScopes())));
	//   15   40:aload_0         
	//   16   41:getfield        #31  <Field Set mScopes>
	//   17   44:aload_1         
	//   18   45:invokeinterface #136 <Method java.util.List GoogleSignInOptionsExtension.getImpliedScopes()>
	//   19   50:invokeinterface #142 <Method boolean Set.addAll(java.util.Collection)>
	//   20   55:pop             
		zaag.put(((Object) (Integer.valueOf(googlesigninoptionsextension.getExtensionType()))), ((Object) (new GoogleSignInOptionsExtensionParcelable(googlesigninoptionsextension))));
	//   21   56:aload_0         
	//   22   57:getfield        #36  <Field Map zaag>
	//   23   60:aload_1         
	//   24   61:invokeinterface #114 <Method int GoogleSignInOptionsExtension.getExtensionType()>
	//   25   66:invokestatic    #120 <Method Integer Integer.valueOf(int)>
	//   26   69:new             #144 <Class GoogleSignInOptionsExtensionParcelable>
	//   27   72:dup             
	//   28   73:aload_1         
	//   29   74:invokespecial   #147 <Method void GoogleSignInOptionsExtensionParcelable(GoogleSignInOptionsExtension)>
	//   30   77:invokeinterface #151 <Method Object Map.put(Object, Object)>
	//   31   82:pop             
		return this;
	//   32   83:aload_0         
	//   33   84:areturn         
	}

	public final GoogleSignInOptions build()
	{
		if(mScopes.contains(((Object) (GoogleSignInOptions.zav))) && mScopes.contains(((Object) (GoogleSignInOptions.zau))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field Set mScopes>
	//*   2    4:getstatic       #157 <Field Scope GoogleSignInOptions.zav>
	//*   3    7:invokeinterface #160 <Method boolean Set.contains(Object)>
	//*   4   12:ifeq            43
	//*   5   15:aload_0         
	//*   6   16:getfield        #31  <Field Set mScopes>
	//*   7   19:getstatic       #163 <Field Scope GoogleSignInOptions.zau>
	//*   8   22:invokeinterface #160 <Method boolean Set.contains(Object)>
	//*   9   27:ifeq            43
			mScopes.remove(((Object) (GoogleSignInOptions.zau)));
	//   10   30:aload_0         
	//   11   31:getfield        #31  <Field Set mScopes>
	//   12   34:getstatic       #163 <Field Scope GoogleSignInOptions.zau>
	//   13   37:invokeinterface #166 <Method boolean Set.remove(Object)>
	//   14   42:pop             
		if(zay && (zax == null || !mScopes.isEmpty()))
	//*  15   43:aload_0         
	//*  16   44:getfield        #67  <Field boolean zay>
	//*  17   47:ifeq            74
	//*  18   50:aload_0         
	//*  19   51:getfield        #79  <Field Account zax>
	//*  20   54:ifnull          69
	//*  21   57:aload_0         
	//*  22   58:getfield        #31  <Field Set mScopes>
	//*  23   61:invokeinterface #170 <Method boolean Set.isEmpty()>
	//*  24   66:ifne            74
			requestId();
	//   25   69:aload_0         
	//   26   70:invokevirtual   #174 <Method GoogleSignInOptions$Builder requestId()>
	//   27   73:pop             
		return new GoogleSignInOptions(3, new ArrayList(((java.util.Collection) (mScopes))), zax, zay, zaz, zaaa, zaab, zaac, zaag, ((zac) (null)));
	//   28   74:new             #6   <Class GoogleSignInOptions>
	//   29   77:dup             
	//   30   78:iconst_3        
	//   31   79:new             #176 <Class ArrayList>
	//   32   82:dup             
	//   33   83:aload_0         
	//   34   84:getfield        #31  <Field Set mScopes>
	//   35   87:invokespecial   #177 <Method void ArrayList(java.util.Collection)>
	//   36   90:aload_0         
	//   37   91:getfield        #79  <Field Account zax>
	//   38   94:aload_0         
	//   39   95:getfield        #67  <Field boolean zay>
	//   40   98:aload_0         
	//   41   99:getfield        #57  <Field boolean zaz>
	//   42  102:aload_0         
	//   43  103:getfield        #62  <Field boolean zaaa>
	//   44  106:aload_0         
	//   45  107:getfield        #73  <Field String zaab>
	//   46  110:aload_0         
	//   47  111:getfield        #84  <Field String zaac>
	//   48  114:aload_0         
	//   49  115:getfield        #36  <Field Map zaag>
	//   50  118:aconst_null     
	//   51  119:invokespecial   #180 <Method void GoogleSignInOptions(int, ArrayList, Account, boolean, boolean, boolean, String, String, Map, zac)>
	//   52  122:areturn         
	}

	public final GoogleSignInOptions$Builder requestEmail()
	{
		mScopes.add(((Object) (GoogleSignInOptions.zas)));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Set mScopes>
	//    2    4:getstatic       #184 <Field Scope GoogleSignInOptions.zas>
	//    3    7:invokeinterface #187 <Method boolean Set.add(Object)>
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
	//    2    4:getstatic       #190 <Field Scope GoogleSignInOptions.zat>
	//    3    7:invokeinterface #187 <Method boolean Set.add(Object)>
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
	//    2    2:putfield        #67  <Field boolean zay>
		zaab = zac(s);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #194 <Method String zac(String)>
	//    7   11:putfield        #73  <Field String zaab>
		return this;
	//    8   14:aload_0         
	//    9   15:areturn         
	}

	public final GoogleSignInOptions$Builder requestProfile()
	{
		mScopes.add(((Object) (GoogleSignInOptions.zar)));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Set mScopes>
	//    2    4:getstatic       #198 <Field Scope GoogleSignInOptions.zar>
	//    3    7:invokeinterface #187 <Method boolean Set.add(Object)>
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
	//    3    5:invokeinterface #187 <Method boolean Set.add(Object)>
	//    4   10:pop             
		mScopes.addAll(((java.util.Collection) (Arrays.asList(((Object []) (ascope))))));
	//    5   11:aload_0         
	//    6   12:getfield        #31  <Field Set mScopes>
	//    7   15:aload_2         
	//    8   16:invokestatic    #206 <Method java.util.List Arrays.asList(Object[])>
	//    9   19:invokeinterface #142 <Method boolean Set.addAll(java.util.Collection)>
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
	//    3    3:invokevirtual   #210 <Method GoogleSignInOptions$Builder requestServerAuthCode(String, boolean)>
	//    4    6:areturn         
	}

	public final GoogleSignInOptions$Builder requestServerAuthCode(String s, boolean flag)
	{
		zaz = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #57  <Field boolean zaz>
		zaab = zac(s);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #194 <Method String zac(String)>
	//    7   11:putfield        #73  <Field String zaab>
		zaaa = flag;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #62  <Field boolean zaaa>
		return this;
	//   11   19:aload_0         
	//   12   20:areturn         
	}

	public final GoogleSignInOptions$Builder setAccountName(String s)
	{
		zax = new Account(Preconditions.checkNotEmpty(s), "com.google");
	//    0    0:aload_0         
	//    1    1:new             #213 <Class Account>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokestatic    #94  <Method String Preconditions.checkNotEmpty(String)>
	//    5    9:ldc1            #215 <String "com.google">
	//    6   11:invokespecial   #218 <Method void Account(String, String)>
	//    7   14:putfield        #79  <Field Account zax>
		return this;
	//    8   17:aload_0         
	//    9   18:areturn         
	}

	public final GoogleSignInOptions$Builder setHostedDomain(String s)
	{
		zaac = Preconditions.checkNotEmpty(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #94  <Method String Preconditions.checkNotEmpty(String)>
	//    3    5:putfield        #84  <Field String zaac>
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
	//   13   27:invokestatic    #44  <Method Object Preconditions.checkNotNull(Object)>
	//   14   30:pop             
		mScopes = ((Set) (new HashSet(((java.util.Collection) (GoogleSignInOptions.zaa(googlesigninoptions))))));
	//   15   31:aload_0         
	//   16   32:new             #28  <Class HashSet>
	//   17   35:dup             
	//   18   36:aload_1         
	//   19   37:invokestatic    #48  <Method ArrayList GoogleSignInOptions.zaa(GoogleSignInOptions)>
	//   20   40:invokespecial   #51  <Method void HashSet(java.util.Collection)>
	//   21   43:putfield        #31  <Field Set mScopes>
		zaz = GoogleSignInOptions.zab(googlesigninoptions);
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:invokestatic    #55  <Method boolean GoogleSignInOptions.zab(GoogleSignInOptions)>
	//   25   51:putfield        #57  <Field boolean zaz>
		zaaa = GoogleSignInOptions.zac(googlesigninoptions);
	//   26   54:aload_0         
	//   27   55:aload_1         
	//   28   56:invokestatic    #60  <Method boolean GoogleSignInOptions.zac(GoogleSignInOptions)>
	//   29   59:putfield        #62  <Field boolean zaaa>
		zay = GoogleSignInOptions.zad(googlesigninoptions);
	//   30   62:aload_0         
	//   31   63:aload_1         
	//   32   64:invokestatic    #65  <Method boolean GoogleSignInOptions.zad(GoogleSignInOptions)>
	//   33   67:putfield        #67  <Field boolean zay>
		zaab = GoogleSignInOptions.zae(googlesigninoptions);
	//   34   70:aload_0         
	//   35   71:aload_1         
	//   36   72:invokestatic    #71  <Method String GoogleSignInOptions.zae(GoogleSignInOptions)>
	//   37   75:putfield        #73  <Field String zaab>
		zax = GoogleSignInOptions.zaf(googlesigninoptions);
	//   38   78:aload_0         
	//   39   79:aload_1         
	//   40   80:invokestatic    #77  <Method Account GoogleSignInOptions.zaf(GoogleSignInOptions)>
	//   41   83:putfield        #79  <Field Account zax>
		zaac = GoogleSignInOptions.zag(googlesigninoptions);
	//   42   86:aload_0         
	//   43   87:aload_1         
	//   44   88:invokestatic    #82  <Method String GoogleSignInOptions.zag(GoogleSignInOptions)>
	//   45   91:putfield        #84  <Field String zaac>
		zaag = GoogleSignInOptions.zab(((java.util.List) (GoogleSignInOptions.zah(googlesigninoptions))));
	//   46   94:aload_0         
	//   47   95:aload_1         
	//   48   96:invokestatic    #87  <Method ArrayList GoogleSignInOptions.zah(GoogleSignInOptions)>
	//   49   99:invokestatic    #90  <Method Map GoogleSignInOptions.zab(java.util.List)>
	//   50  102:putfield        #36  <Field Map zaag>
	//   51  105:return          
	}
}
