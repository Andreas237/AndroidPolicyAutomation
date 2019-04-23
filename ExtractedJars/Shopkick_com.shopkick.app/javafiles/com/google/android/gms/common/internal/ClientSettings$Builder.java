// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.support.v4.util.ArraySet;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.SignInOptions;
import java.util.Collection;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.internal:
//			ClientSettings

public static final class ClientSettings$Builder
{

	public final ClientSettings$Builder addAllRequiredScopes(Collection collection)
	{
		if(zaoe == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field ArraySet zaoe>
	//*   2    4:ifnonnull       18
			zaoe = new ArraySet();
	//    3    7:aload_0         
	//    4    8:new             #45  <Class ArraySet>
	//    5   11:dup             
	//    6   12:invokespecial   #46  <Method void ArraySet()>
	//    7   15:putfield        #43  <Field ArraySet zaoe>
		zaoe.addAll(collection);
	//    8   18:aload_0         
	//    9   19:getfield        #43  <Field ArraySet zaoe>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #50  <Method boolean ArraySet.addAll(Collection)>
	//   12   26:pop             
		return this;
	//   13   27:aload_0         
	//   14   28:areturn         
	}

	public final ClientSettings$Builder addRequiredScope(Scope scope)
	{
		if(zaoe == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field ArraySet zaoe>
	//*   2    4:ifnonnull       18
			zaoe = new ArraySet();
	//    3    7:aload_0         
	//    4    8:new             #45  <Class ArraySet>
	//    5   11:dup             
	//    6   12:invokespecial   #46  <Method void ArraySet()>
	//    7   15:putfield        #43  <Field ArraySet zaoe>
		zaoe.add(((Object) (scope)));
	//    8   18:aload_0         
	//    9   19:getfield        #43  <Field ArraySet zaoe>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #58  <Method boolean ArraySet.add(Object)>
	//   12   26:pop             
		return this;
	//   13   27:aload_0         
	//   14   28:areturn         
	}

	public final ClientSettings build()
	{
		return new ClientSettings(zax, ((java.util.Set) (zaoe)), zaob, zabt, zabu, zabv, zabw, zaoc);
	//    0    0:new             #6   <Class ClientSettings>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #62  <Field Account zax>
	//    4    8:aload_0         
	//    5    9:getfield        #43  <Field ArraySet zaoe>
	//    6   12:aload_0         
	//    7   13:getfield        #64  <Field Map zaob>
	//    8   16:aload_0         
	//    9   17:getfield        #31  <Field int zabt>
	//   10   20:aload_0         
	//   11   21:getfield        #66  <Field View zabu>
	//   12   24:aload_0         
	//   13   25:getfield        #68  <Field String zabv>
	//   14   28:aload_0         
	//   15   29:getfield        #70  <Field String zabw>
	//   16   32:aload_0         
	//   17   33:getfield        #38  <Field SignInOptions zaoc>
	//   18   36:invokespecial   #73  <Method void ClientSettings(Account, java.util.Set, Map, int, View, String, String, SignInOptions)>
	//   19   39:areturn         
	}

	public final ClientSettings$Builder setAccount(Account account)
	{
		zax = account;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field Account zax>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final ClientSettings$Builder setGravityForPopups(int i)
	{
		zabt = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #31  <Field int zabt>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final ClientSettings$Builder setOptionalApiSettingsMap(Map map)
	{
		zaob = map;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #64  <Field Map zaob>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final ClientSettings$Builder setRealClientClassName(String s)
	{
		zabw = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #70  <Field String zabw>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final ClientSettings$Builder setRealClientPackageName(String s)
	{
		zabv = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #68  <Field String zabv>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final ClientSettings$Builder setSignInOptions(SignInOptions signinoptions)
	{
		zaoc = signinoptions;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field SignInOptions zaoc>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final ClientSettings$Builder setViewForPopups(View view)
	{
		zabu = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #66  <Field View zabu>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private int zabt;
	private View zabu;
	private String zabv;
	private String zabw;
	private Map zaob;
	private SignInOptions zaoc;
	private ArraySet zaoe;
	private Account zax;

	public ClientSettings$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		zabt = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #31  <Field int zabt>
		zaoc = SignInOptions.DEFAULT;
	//    5    9:aload_0         
	//    6   10:getstatic       #36  <Field SignInOptions SignInOptions.DEFAULT>
	//    7   13:putfield        #38  <Field SignInOptions zaoc>
	//    8   16:return          
	}
}
