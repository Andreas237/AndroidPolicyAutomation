// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account;

import com.ibotta.android.di.MainComponent;
import dagger.internal.Preconditions;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account:
//			DaggerAccountComponent, AccountModule, AccountComponent

public static final class DaggerAccountComponent$Builder
{

	public DaggerAccountComponent$Builder accountModule(AccountModule accountmodule)
	{
		accountModule = (AccountModule)Preconditions.checkNotNull(((Object) (accountmodule)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #33  <Method Object Preconditions.checkNotNull(Object)>
	//    3    5:checkcast       #35  <Class AccountModule>
	//    4    8:putfield        #22  <Field AccountModule accountModule>
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public AccountComponent build()
	{
		if(accountModule != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field AccountModule accountModule>
	//*   2    4:ifnull          61
		{
			if(mainComponent != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #26  <Field MainComponent mainComponent>
	//*   5   11:ifnull          24
			{
				return ((AccountComponent) (new DaggerAccountComponent(this, ((DaggerAccountComponent._cls1) (null)))));
	//    6   14:new             #6   <Class DaggerAccountComponent>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:aconst_null     
	//   10   20:invokespecial   #40  <Method void DaggerAccountComponent(DaggerAccountComponent$Builder, DaggerAccountComponent$1)>
	//   11   23:areturn         
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   12   24:new             #42  <Class StringBuilder>
	//   13   27:dup             
	//   14   28:invokespecial   #43  <Method void StringBuilder()>
	//   15   31:astore_1        
				stringbuilder.append(((Class) (com/ibotta/android/di/MainComponent)).getCanonicalName());
	//   16   32:aload_1         
	//   17   33:ldc1            #45  <Class MainComponent>
	//   18   35:invokevirtual   #51  <Method String Class.getCanonicalName()>
	//   19   38:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   20   41:pop             
				stringbuilder.append(" must be set");
	//   21   42:aload_1         
	//   22   43:ldc1            #57  <String " must be set">
	//   23   45:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   24   48:pop             
				throw new IllegalStateException(stringbuilder.toString());
	//   25   49:new             #59  <Class IllegalStateException>
	//   26   52:dup             
	//   27   53:aload_1         
	//   28   54:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   29   57:invokespecial   #65  <Method void IllegalStateException(String)>
	//   30   60:athrow          
			}
		} else
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   31   61:new             #42  <Class StringBuilder>
	//   32   64:dup             
	//   33   65:invokespecial   #43  <Method void StringBuilder()>
	//   34   68:astore_1        
			stringbuilder1.append(((Class) (com/ibotta/android/mvp/ui/activity/account/AccountModule)).getCanonicalName());
	//   35   69:aload_1         
	//   36   70:ldc1            #35  <Class AccountModule>
	//   37   72:invokevirtual   #51  <Method String Class.getCanonicalName()>
	//   38   75:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   39   78:pop             
			stringbuilder1.append(" must be set");
	//   40   79:aload_1         
	//   41   80:ldc1            #57  <String " must be set">
	//   42   82:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   43   85:pop             
			throw new IllegalStateException(stringbuilder1.toString());
	//   44   86:new             #59  <Class IllegalStateException>
	//   45   89:dup             
	//   46   90:aload_1         
	//   47   91:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   48   94:invokespecial   #65  <Method void IllegalStateException(String)>
	//   49   97:athrow          
		}
	}

	public DaggerAccountComponent$Builder mainComponent(MainComponent maincomponent)
	{
		mainComponent = (MainComponent)Preconditions.checkNotNull(((Object) (maincomponent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #33  <Method Object Preconditions.checkNotNull(Object)>
	//    3    5:checkcast       #45  <Class MainComponent>
	//    4    8:putfield        #26  <Field MainComponent mainComponent>
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	private AccountModule accountModule;
	private MainComponent mainComponent;


/*
	static AccountModule access$100(DaggerAccountComponent$Builder daggeraccountcomponent$builder)
	{
		return daggeraccountcomponent$builder.accountModule;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AccountModule accountModule>
	//    2    4:areturn         
	}

*/


/*
	static MainComponent access$200(DaggerAccountComponent$Builder daggeraccountcomponent$builder)
	{
		return daggeraccountcomponent$builder.mainComponent;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field MainComponent mainComponent>
	//    2    4:areturn         
	}

*/

	private DaggerAccountComponent$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	DaggerAccountComponent$Builder(DaggerAccountComponent._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void DaggerAccountComponent$Builder()>
	//    2    4:return          
	}
}
