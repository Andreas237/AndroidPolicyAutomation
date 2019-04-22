// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.support.v4.util.ArraySet;
import android.view.View;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.SignInOptions;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.internal:
//			Preconditions

public final class ClientSettings
{
	public static final class Builder
	{

		public final Builder addAllRequiredScopes(Collection collection)
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

		public final Builder addRequiredScope(Scope scope)
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
			return new ClientSettings(zzs, ((Set) (zzsd)), zzsa, zzcx, zzcy, zzcz, zzda, zzsb);
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
		//   18   36:invokespecial   #72  <Method void ClientSettings(Account, Set, Map, int, View, String, String, SignInOptions)>
		//   19   39:areturn         
		}

		public final Builder setAccount(Account account)
		{
			zzs = account;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #61  <Field Account zzs>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setGravityForPopups(int i)
		{
			zzcx = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #30  <Field int zzcx>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setOptionalApiSettingsMap(Map map)
		{
			zzsa = map;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #63  <Field Map zzsa>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setRealClientClassName(String s)
		{
			zzda = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #69  <Field String zzda>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setRealClientPackageName(String s)
		{
			zzcz = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #67  <Field String zzcz>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setSignInOptions(SignInOptions signinoptions)
		{
			zzsb = signinoptions;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #37  <Field SignInOptions zzsb>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setViewForPopups(View view)
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

		public Builder()
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

	public static final class OptionalApiSettings
	{

		public final Set mScopes;

		public OptionalApiSettings(Set set)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			Preconditions.checkNotNull(((Object) (set)));
		//    2    4:aload_1         
		//    3    5:invokestatic    #21  <Method Object Preconditions.checkNotNull(Object)>
		//    4    8:pop             
			mScopes = Collections.unmodifiableSet(set);
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:invokestatic    #27  <Method Set Collections.unmodifiableSet(Set)>
		//    8   14:putfield        #29  <Field Set mScopes>
		//    9   17:return          
		}
	}


	public ClientSettings(Account account, Set set, Map map, int i, View view, String s, String s1, 
			SignInOptions signinoptions)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		zzs = account;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #41  <Field Account zzs>
		if(set == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       20
			account = ((Account) (Collections.EMPTY_SET));
	//    7   13:getstatic       #46  <Field Set Collections.EMPTY_SET>
	//    8   16:astore_1        
		else
	//*   9   17:goto            25
			account = ((Account) (Collections.unmodifiableSet(set)));
	//   10   20:aload_2         
	//   11   21:invokestatic    #50  <Method Set Collections.unmodifiableSet(Set)>
	//   12   24:astore_1        
		zzcv = ((Set) (account));
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #52  <Field Set zzcv>
		account = ((Account) (map));
	//   16   30:aload_3         
	//   17   31:astore_1        
		if(map == null)
	//*  18   32:aload_3         
	//*  19   33:ifnonnull       40
			account = ((Account) (Collections.EMPTY_MAP));
	//   20   36:getstatic       #55  <Field Map Collections.EMPTY_MAP>
	//   21   39:astore_1        
		zzsa = ((Map) (account));
	//   22   40:aload_0         
	//   23   41:aload_1         
	//   24   42:putfield        #57  <Field Map zzsa>
		zzcy = view;
	//   25   45:aload_0         
	//   26   46:aload           5
	//   27   48:putfield        #59  <Field View zzcy>
		zzcx = i;
	//   28   51:aload_0         
	//   29   52:iload           4
	//   30   54:putfield        #61  <Field int zzcx>
		zzcz = s;
	//   31   57:aload_0         
	//   32   58:aload           6
	//   33   60:putfield        #63  <Field String zzcz>
		zzda = s1;
	//   34   63:aload_0         
	//   35   64:aload           7
	//   36   66:putfield        #65  <Field String zzda>
		zzsb = signinoptions;
	//   37   69:aload_0         
	//   38   70:aload           8
	//   39   72:putfield        #67  <Field SignInOptions zzsb>
		account = ((Account) (new HashSet(((Collection) (zzcv)))));
	//   40   75:new             #69  <Class HashSet>
	//   41   78:dup             
	//   42   79:aload_0         
	//   43   80:getfield        #52  <Field Set zzcv>
	//   44   83:invokespecial   #72  <Method void HashSet(Collection)>
	//   45   86:astore_1        
		for(set = ((Set) (zzsa.values().iterator())); ((Iterator) (set)).hasNext(); ((Set) (account)).addAll(((Collection) (((OptionalApiSettings)((Iterator) (set)).next()).mScopes))));
	//   46   87:aload_0         
	//   47   88:getfield        #57  <Field Map zzsa>
	//   48   91:invokeinterface #78  <Method Collection Map.values()>
	//   49   96:invokeinterface #84  <Method Iterator Collection.iterator()>
	//   50  101:astore_2        
	//   51  102:aload_2         
	//   52  103:invokeinterface #90  <Method boolean Iterator.hasNext()>
	//   53  108:ifeq            133
	//   54  111:aload_1         
	//   55  112:aload_2         
	//   56  113:invokeinterface #94  <Method Object Iterator.next()>
	//   57  118:checkcast       #9   <Class ClientSettings$OptionalApiSettings>
	//   58  121:getfield        #97  <Field Set ClientSettings$OptionalApiSettings.mScopes>
	//   59  124:invokeinterface #103 <Method boolean Set.addAll(Collection)>
	//   60  129:pop             
	//*  61  130:goto            102
		zzrz = Collections.unmodifiableSet(((Set) (account)));
	//   62  133:aload_0         
	//   63  134:aload_1         
	//   64  135:invokestatic    #50  <Method Set Collections.unmodifiableSet(Set)>
	//   65  138:putfield        #105 <Field Set zzrz>
	//   66  141:return          
	}

	public static ClientSettings createDefault(Context context)
	{
		return (new com.google.android.gms.common.api.GoogleApiClient.Builder(context)).buildClientSettings();
	//    0    0:new             #112 <Class com.google.android.gms.common.api.GoogleApiClient$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #115 <Method void com.google.android.gms.common.api.GoogleApiClient$Builder(Context)>
	//    4    8:invokevirtual   #119 <Method ClientSettings com.google.android.gms.common.api.GoogleApiClient$Builder.buildClientSettings()>
	//    5   11:areturn         
	}

	public final Account getAccount()
	{
		return zzs;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Account zzs>
	//    2    4:areturn         
	}

	public final String getAccountName()
	{
		Account account = zzs;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Account zzs>
	//    2    4:astore_1        
		if(account != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return account.name;
	//    5    9:aload_1         
	//    6   10:getfield        #131 <Field String Account.name>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public final Account getAccountOrDefault()
	{
		Account account = zzs;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Account zzs>
	//    2    4:astore_1        
		if(account != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return account;
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			return new Account("<<default account>>", "com.google");
	//    7   11:new             #128 <Class Account>
	//    8   14:dup             
	//    9   15:ldc1            #134 <String "<<default account>>">
	//   10   17:ldc1            #136 <String "com.google">
	//   11   19:invokespecial   #139 <Method void Account(String, String)>
	//   12   22:areturn         
	}

	public final Set getAllRequestedScopes()
	{
		return zzrz;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field Set zzrz>
	//    2    4:areturn         
	}

	public final Set getApplicableScopes(Api api)
	{
		api = ((Api) ((OptionalApiSettings)zzsa.get(((Object) (api)))));
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Map zzsa>
	//    2    4:aload_1         
	//    3    5:invokeinterface #148 <Method Object Map.get(Object)>
	//    4   10:checkcast       #9   <Class ClientSettings$OptionalApiSettings>
	//    5   13:astore_1        
		if(api != null && !((OptionalApiSettings) (api)).mScopes.isEmpty())
	//*   6   14:aload_1         
	//*   7   15:ifnull          58
	//*   8   18:aload_1         
	//*   9   19:getfield        #97  <Field Set ClientSettings$OptionalApiSettings.mScopes>
	//*  10   22:invokeinterface #151 <Method boolean Set.isEmpty()>
	//*  11   27:ifeq            33
	//*  12   30:goto            58
		{
			HashSet hashset = new HashSet(((Collection) (zzcv)));
	//   13   33:new             #69  <Class HashSet>
	//   14   36:dup             
	//   15   37:aload_0         
	//   16   38:getfield        #52  <Field Set zzcv>
	//   17   41:invokespecial   #72  <Method void HashSet(Collection)>
	//   18   44:astore_2        
			((Set) (hashset)).addAll(((Collection) (((OptionalApiSettings) (api)).mScopes)));
	//   19   45:aload_2         
	//   20   46:aload_1         
	//   21   47:getfield        #97  <Field Set ClientSettings$OptionalApiSettings.mScopes>
	//   22   50:invokeinterface #103 <Method boolean Set.addAll(Collection)>
	//   23   55:pop             
			return ((Set) (hashset));
	//   24   56:aload_2         
	//   25   57:areturn         
		} else
		{
			return zzcv;
	//   26   58:aload_0         
	//   27   59:getfield        #52  <Field Set zzcv>
	//   28   62:areturn         
		}
	}

	public final Integer getClientSessionId()
	{
		return zzsc;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field Integer zzsc>
	//    2    4:areturn         
	}

	public final int getGravityForPopups()
	{
		return zzcx;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int zzcx>
	//    2    4:ireturn         
	}

	public final Map getOptionalApiSettings()
	{
		return zzsa;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Map zzsa>
	//    2    4:areturn         
	}

	public final String getRealClientClassName()
	{
		return zzda;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field String zzda>
	//    2    4:areturn         
	}

	public final String getRealClientPackageName()
	{
		return zzcz;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String zzcz>
	//    2    4:areturn         
	}

	public final Set getRequiredScopes()
	{
		return zzcv;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Set zzcv>
	//    2    4:areturn         
	}

	public final SignInOptions getSignInOptions()
	{
		return zzsb;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field SignInOptions zzsb>
	//    2    4:areturn         
	}

	public final View getViewForPopups()
	{
		return zzcy;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field View zzcy>
	//    2    4:areturn         
	}

	public final void setClientSessionId(Integer integer)
	{
		zzsc = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #156 <Field Integer zzsc>
	//    3    5:return          
	}

	public static final String KEY_CLIENT_SESSION_ID = "com.google.android.gms.common.internal.ClientSettings.sessionId";
	private final Set zzcv;
	private final int zzcx;
	private final View zzcy;
	private final String zzcz;
	private final String zzda;
	private final Set zzrz;
	private final Account zzs;
	private final Map zzsa;
	private final SignInOptions zzsb;
	private Integer zzsc;
}
