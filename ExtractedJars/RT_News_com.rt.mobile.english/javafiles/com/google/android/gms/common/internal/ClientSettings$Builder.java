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
		if(zzsd == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field ArraySet zzsd>
	//*   2    4:ifnonnull       18
			zzsd = new ArraySet();
	//    3    7:aload_0         
	//    4    8:new             #44  <Class ArraySet>
	//    5   11:dup             
	//    6   12:invokespecial   #45  <Method void ArraySet()>
	//    7   15:putfield        #42  <Field ArraySet zzsd>
		zzsd.addAll(collection);
	//    8   18:aload_0         
	//    9   19:getfield        #42  <Field ArraySet zzsd>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #49  <Method boolean ArraySet.addAll(Collection)>
	//   12   26:pop             
		return this;
	//   13   27:aload_0         
	//   14   28:areturn         
	}

	public final ClientSettings$Builder addRequiredScope(Scope scope)
	{
		if(zzsd == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field ArraySet zzsd>
	//*   2    4:ifnonnull       18
			zzsd = new ArraySet();
	//    3    7:aload_0         
	//    4    8:new             #44  <Class ArraySet>
	//    5   11:dup             
	//    6   12:invokespecial   #45  <Method void ArraySet()>
	//    7   15:putfield        #42  <Field ArraySet zzsd>
		zzsd.add(((Object) (scope)));
	//    8   18:aload_0         
	//    9   19:getfield        #42  <Field ArraySet zzsd>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #57  <Method boolean ArraySet.add(Object)>
	//   12   26:pop             
		return this;
	//   13   27:aload_0         
	//   14   28:areturn         
	}

	public final ClientSettings build()
	{
		return new ClientSettings(zzs, ((java.util.Set) (zzsd)), zzsa, zzcx, zzcy, zzcz, zzda, zzsb);
	//    0    0:new             #6   <Class ClientSettings>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #61  <Field Account zzs>
	//    4    8:aload_0         
	//    5    9:getfield        #42  <Field ArraySet zzsd>
	//    6   12:aload_0         
	//    7   13:getfield        #63  <Field Map zzsa>
	//    8   16:aload_0         
	//    9   17:getfield        #30  <Field int zzcx>
	//   10   20:aload_0         
	//   11   21:getfield        #65  <Field View zzcy>
	//   12   24:aload_0         
	//   13   25:getfield        #67  <Field String zzcz>
	//   14   28:aload_0         
	//   15   29:getfield        #69  <Field String zzda>
	//   16   32:aload_0         
	//   17   33:getfield        #37  <Field SignInOptions zzsb>
	//   18   36:invokespecial   #72  <Method void ClientSettings(Account, java.util.Set, Map, int, View, String, String, SignInOptions)>
	//   19   39:areturn         
	}

	public final ClientSettings$Builder setAccount(Account account)
	{
		zzs = account;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #61  <Field Account zzs>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final ClientSettings$Builder setGravityForPopups(int i)
	{
		zzcx = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field int zzcx>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final ClientSettings$Builder setOptionalApiSettingsMap(Map map)
	{
		zzsa = map;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #63  <Field Map zzsa>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final ClientSettings$Builder setRealClientClassName(String s)
	{
		zzda = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #69  <Field String zzda>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final ClientSettings$Builder setRealClientPackageName(String s)
	{
		zzcz = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #67  <Field String zzcz>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final ClientSettings$Builder setSignInOptions(SignInOptions signinoptions)
	{
		zzsb = signinoptions;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field SignInOptions zzsb>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final ClientSettings$Builder setViewForPopups(View view)
	{
		zzcy = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #65  <Field View zzcy>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private int zzcx;
	private View zzcy;
	private String zzcz;
	private String zzda;
	private Account zzs;
	private Map zzsa;
	private SignInOptions zzsb;
	private ArraySet zzsd;

	public ClientSettings$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		zzcx = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #30  <Field int zzcx>
		zzsb = SignInOptions.DEFAULT;
	//    5    9:aload_0         
	//    6   10:getstatic       #35  <Field SignInOptions SignInOptions.DEFAULT>
	//    7   13:putfield        #37  <Field SignInOptions zzsb>
	//    8   16:return          
	}
}
