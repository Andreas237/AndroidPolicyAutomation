// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.support.v4.f.b;
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
			if(zaoe == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #43  <Field b zaoe>
		//*   2    4:ifnonnull       18
				zaoe = new b();
		//    3    7:aload_0         
		//    4    8:new             #45  <Class b>
		//    5   11:dup             
		//    6   12:invokespecial   #46  <Method void b()>
		//    7   15:putfield        #43  <Field b zaoe>
			zaoe.addAll(collection);
		//    8   18:aload_0         
		//    9   19:getfield        #43  <Field b zaoe>
		//   10   22:aload_1         
		//   11   23:invokevirtual   #50  <Method boolean b.addAll(Collection)>
		//   12   26:pop             
			return this;
		//   13   27:aload_0         
		//   14   28:areturn         
		}

		public final Builder addRequiredScope(Scope scope)
		{
			if(zaoe == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #43  <Field b zaoe>
		//*   2    4:ifnonnull       18
				zaoe = new b();
		//    3    7:aload_0         
		//    4    8:new             #45  <Class b>
		//    5   11:dup             
		//    6   12:invokespecial   #46  <Method void b()>
		//    7   15:putfield        #43  <Field b zaoe>
			zaoe.add(((Object) (scope)));
		//    8   18:aload_0         
		//    9   19:getfield        #43  <Field b zaoe>
		//   10   22:aload_1         
		//   11   23:invokevirtual   #58  <Method boolean b.add(Object)>
		//   12   26:pop             
			return this;
		//   13   27:aload_0         
		//   14   28:areturn         
		}

		public final ClientSettings build()
		{
			return new ClientSettings(zax, ((Set) (zaoe)), zaob, zabt, zabu, zabv, zabw, zaoc);
		//    0    0:new             #6   <Class ClientSettings>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #62  <Field Account zax>
		//    4    8:aload_0         
		//    5    9:getfield        #43  <Field b zaoe>
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
		//   18   36:invokespecial   #73  <Method void ClientSettings(Account, Set, Map, int, View, String, String, SignInOptions)>
		//   19   39:areturn         
		}

		public final Builder setAccount(Account account)
		{
			zax = account;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #62  <Field Account zax>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setGravityForPopups(int i)
		{
			zabt = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #31  <Field int zabt>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setOptionalApiSettingsMap(Map map)
		{
			zaob = map;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #64  <Field Map zaob>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setRealClientClassName(String s)
		{
			zabw = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #70  <Field String zabw>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setRealClientPackageName(String s)
		{
			zabv = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #68  <Field String zabv>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setSignInOptions(SignInOptions signinoptions)
		{
			zaoc = signinoptions;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #38  <Field SignInOptions zaoc>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder setViewForPopups(View view)
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
		private b zaoe;
		private Account zax;

		public Builder()
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
	//    1    1:invokespecial   #40  <Method void Object()>
		zax = account;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #42  <Field Account zax>
		if(set == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       20
			account = ((Account) (Collections.EMPTY_SET));
	//    7   13:getstatic       #47  <Field Set Collections.EMPTY_SET>
	//    8   16:astore_1        
		else
	//*   9   17:goto            25
			account = ((Account) (Collections.unmodifiableSet(set)));
	//   10   20:aload_2         
	//   11   21:invokestatic    #51  <Method Set Collections.unmodifiableSet(Set)>
	//   12   24:astore_1        
		zabr = ((Set) (account));
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #53  <Field Set zabr>
		account = ((Account) (map));
	//   16   30:aload_3         
	//   17   31:astore_1        
		if(map == null)
	//*  18   32:aload_3         
	//*  19   33:ifnonnull       40
			account = ((Account) (Collections.EMPTY_MAP));
	//   20   36:getstatic       #56  <Field Map Collections.EMPTY_MAP>
	//   21   39:astore_1        
		zaob = ((Map) (account));
	//   22   40:aload_0         
	//   23   41:aload_1         
	//   24   42:putfield        #58  <Field Map zaob>
		zabu = view;
	//   25   45:aload_0         
	//   26   46:aload           5
	//   27   48:putfield        #60  <Field View zabu>
		zabt = i;
	//   28   51:aload_0         
	//   29   52:iload           4
	//   30   54:putfield        #62  <Field int zabt>
		zabv = s;
	//   31   57:aload_0         
	//   32   58:aload           6
	//   33   60:putfield        #64  <Field String zabv>
		zabw = s1;
	//   34   63:aload_0         
	//   35   64:aload           7
	//   36   66:putfield        #66  <Field String zabw>
		zaoc = signinoptions;
	//   37   69:aload_0         
	//   38   70:aload           8
	//   39   72:putfield        #68  <Field SignInOptions zaoc>
		account = ((Account) (new HashSet(((Collection) (zabr)))));
	//   40   75:new             #70  <Class HashSet>
	//   41   78:dup             
	//   42   79:aload_0         
	//   43   80:getfield        #53  <Field Set zabr>
	//   44   83:invokespecial   #73  <Method void HashSet(Collection)>
	//   45   86:astore_1        
		for(set = ((Set) (zaob.values().iterator())); ((Iterator) (set)).hasNext(); ((Set) (account)).addAll(((Collection) (((OptionalApiSettings)((Iterator) (set)).next()).mScopes))));
	//   46   87:aload_0         
	//   47   88:getfield        #58  <Field Map zaob>
	//   48   91:invokeinterface #79  <Method Collection Map.values()>
	//   49   96:invokeinterface #85  <Method Iterator Collection.iterator()>
	//   50  101:astore_2        
	//   51  102:aload_2         
	//   52  103:invokeinterface #91  <Method boolean Iterator.hasNext()>
	//   53  108:ifeq            133
	//   54  111:aload_1         
	//   55  112:aload_2         
	//   56  113:invokeinterface #95  <Method Object Iterator.next()>
	//   57  118:checkcast       #9   <Class ClientSettings$OptionalApiSettings>
	//   58  121:getfield        #98  <Field Set ClientSettings$OptionalApiSettings.mScopes>
	//   59  124:invokeinterface #104 <Method boolean Set.addAll(Collection)>
	//   60  129:pop             
	//*  61  130:goto            102
		zaoa = Collections.unmodifiableSet(((Set) (account)));
	//   62  133:aload_0         
	//   63  134:aload_1         
	//   64  135:invokestatic    #51  <Method Set Collections.unmodifiableSet(Set)>
	//   65  138:putfield        #106 <Field Set zaoa>
	//   66  141:return          
	}

	public static ClientSettings createDefault(Context context)
	{
		return (new com.google.android.gms.common.api.GoogleApiClient.Builder(context)).buildClientSettings();
	//    0    0:new             #113 <Class com.google.android.gms.common.api.GoogleApiClient$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #116 <Method void com.google.android.gms.common.api.GoogleApiClient$Builder(Context)>
	//    4    8:invokevirtual   #120 <Method ClientSettings com.google.android.gms.common.api.GoogleApiClient$Builder.buildClientSettings()>
	//    5   11:areturn         
	}

	public final Account getAccount()
	{
		return zax;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Account zax>
	//    2    4:areturn         
	}

	public final String getAccountName()
	{
		if(zax != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field Account zax>
	//*   2    4:ifnull          15
			return zax.name;
	//    3    7:aload_0         
	//    4    8:getfield        #42  <Field Account zax>
	//    5   11:getfield        #133 <Field String Account.name>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public final Account getAccountOrDefault()
	{
		if(zax != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field Account zax>
	//*   2    4:ifnull          12
			return zax;
	//    3    7:aload_0         
	//    4    8:getfield        #42  <Field Account zax>
	//    5   11:areturn         
		else
			return new Account("<<default account>>", "com.google");
	//    6   12:new             #130 <Class Account>
	//    7   15:dup             
	//    8   16:ldc1            #136 <String "<<default account>>">
	//    9   18:ldc1            #138 <String "com.google">
	//   10   20:invokespecial   #141 <Method void Account(String, String)>
	//   11   23:areturn         
	}

	public final Set getAllRequestedScopes()
	{
		return zaoa;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field Set zaoa>
	//    2    4:areturn         
	}

	public final Set getApplicableScopes(Api api)
	{
		api = ((Api) ((OptionalApiSettings)zaob.get(((Object) (api)))));
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Map zaob>
	//    2    4:aload_1         
	//    3    5:invokeinterface #150 <Method Object Map.get(Object)>
	//    4   10:checkcast       #9   <Class ClientSettings$OptionalApiSettings>
	//    5   13:astore_1        
		if(api != null && !((OptionalApiSettings) (api)).mScopes.isEmpty())
	//*   6   14:aload_1         
	//*   7   15:ifnull          58
	//*   8   18:aload_1         
	//*   9   19:getfield        #98  <Field Set ClientSettings$OptionalApiSettings.mScopes>
	//*  10   22:invokeinterface #153 <Method boolean Set.isEmpty()>
	//*  11   27:ifeq            33
	//*  12   30:goto            58
		{
			HashSet hashset = new HashSet(((Collection) (zabr)));
	//   13   33:new             #70  <Class HashSet>
	//   14   36:dup             
	//   15   37:aload_0         
	//   16   38:getfield        #53  <Field Set zabr>
	//   17   41:invokespecial   #73  <Method void HashSet(Collection)>
	//   18   44:astore_2        
			((Set) (hashset)).addAll(((Collection) (((OptionalApiSettings) (api)).mScopes)));
	//   19   45:aload_2         
	//   20   46:aload_1         
	//   21   47:getfield        #98  <Field Set ClientSettings$OptionalApiSettings.mScopes>
	//   22   50:invokeinterface #104 <Method boolean Set.addAll(Collection)>
	//   23   55:pop             
			return ((Set) (hashset));
	//   24   56:aload_2         
	//   25   57:areturn         
		} else
		{
			return zabr;
	//   26   58:aload_0         
	//   27   59:getfield        #53  <Field Set zabr>
	//   28   62:areturn         
		}
	}

	public final Integer getClientSessionId()
	{
		return zaod;
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field Integer zaod>
	//    2    4:areturn         
	}

	public final int getGravityForPopups()
	{
		return zabt;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int zabt>
	//    2    4:ireturn         
	}

	public final Map getOptionalApiSettings()
	{
		return zaob;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Map zaob>
	//    2    4:areturn         
	}

	public final String getRealClientClassName()
	{
		return zabw;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field String zabw>
	//    2    4:areturn         
	}

	public final String getRealClientPackageName()
	{
		return zabv;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field String zabv>
	//    2    4:areturn         
	}

	public final Set getRequiredScopes()
	{
		return zabr;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Set zabr>
	//    2    4:areturn         
	}

	public final SignInOptions getSignInOptions()
	{
		return zaoc;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field SignInOptions zaoc>
	//    2    4:areturn         
	}

	public final View getViewForPopups()
	{
		return zabu;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field View zabu>
	//    2    4:areturn         
	}

	public final void setClientSessionId(Integer integer)
	{
		zaod = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #158 <Field Integer zaod>
	//    3    5:return          
	}

	public static final String KEY_CLIENT_SESSION_ID = "com.google.android.gms.common.internal.ClientSettings.sessionId";
	private final Set zabr;
	private final int zabt;
	private final View zabu;
	private final String zabv;
	private final String zabw;
	private final Set zaoa;
	private final Map zaob;
	private final SignInOptions zaoc;
	private Integer zaod;
	private final Account zax;
}
