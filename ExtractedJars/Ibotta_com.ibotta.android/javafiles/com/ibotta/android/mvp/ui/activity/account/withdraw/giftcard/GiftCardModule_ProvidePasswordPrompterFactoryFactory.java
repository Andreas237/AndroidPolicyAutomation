// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.giftcard;

import com.ibotta.android.mvp.ui.misc.password.PasswordPrompterFactory;
import com.ibotta.android.security.PasswordCache;
import com.ibotta.android.util.AppHelper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.giftcard:
//			GiftCardModule

public final class GiftCardModule_ProvidePasswordPrompterFactoryFactory
	implements Factory
{

	public GiftCardModule_ProvidePasswordPrompterFactoryFactory(GiftCardModule giftcardmodule, Provider provider, Provider provider1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		module = giftcardmodule;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field GiftCardModule module>
		passwordCacheProvider = provider;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field Provider passwordCacheProvider>
		appHelperProvider = provider1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field Provider appHelperProvider>
	//   11   19:return          
	}

	public static GiftCardModule_ProvidePasswordPrompterFactoryFactory create(GiftCardModule giftcardmodule, Provider provider, Provider provider1)
	{
		return new GiftCardModule_ProvidePasswordPrompterFactoryFactory(giftcardmodule, provider, provider1);
	//    0    0:new             #2   <Class GiftCardModule_ProvidePasswordPrompterFactoryFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #32  <Method void GiftCardModule_ProvidePasswordPrompterFactoryFactory(GiftCardModule, Provider, Provider)>
	//    6   10:areturn         
	}

	public static PasswordPrompterFactory provideInstance(GiftCardModule giftcardmodule, Provider provider, Provider provider1)
	{
		return proxyProvidePasswordPrompterFactory(giftcardmodule, (PasswordCache)provider.get(), (AppHelper)provider1.get());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #41  <Method Object Provider.get()>
	//    3    7:checkcast       #43  <Class PasswordCache>
	//    4   10:aload_2         
	//    5   11:invokeinterface #41  <Method Object Provider.get()>
	//    6   16:checkcast       #45  <Class AppHelper>
	//    7   19:invokestatic    #49  <Method PasswordPrompterFactory proxyProvidePasswordPrompterFactory(GiftCardModule, PasswordCache, AppHelper)>
	//    8   22:areturn         
	}

	public static PasswordPrompterFactory proxyProvidePasswordPrompterFactory(GiftCardModule giftcardmodule, PasswordCache passwordcache, AppHelper apphelper)
	{
		return (PasswordPrompterFactory)Preconditions.checkNotNull(((Object) (giftcardmodule.providePasswordPrompterFactory(passwordcache, apphelper))), "Cannot return null from a non-@Nullable @Provides method");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #56  <Method PasswordPrompterFactory GiftCardModule.providePasswordPrompterFactory(PasswordCache, AppHelper)>
	//    4    6:ldc1            #58  <String "Cannot return null from a non-@Nullable @Provides method">
	//    5    8:invokestatic    #64  <Method Object Preconditions.checkNotNull(Object, String)>
	//    6   11:checkcast       #66  <Class PasswordPrompterFactory>
	//    7   14:areturn         
	}

	public PasswordPrompterFactory get()
	{
		return provideInstance(module, passwordCacheProvider, appHelperProvider);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field GiftCardModule module>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field Provider passwordCacheProvider>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field Provider appHelperProvider>
	//    6   12:invokestatic    #69  <Method PasswordPrompterFactory provideInstance(GiftCardModule, Provider, Provider)>
	//    7   15:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method PasswordPrompterFactory get()>
	//    2    4:areturn         
	}

	private final Provider appHelperProvider;
	private final GiftCardModule module;
	private final Provider passwordCacheProvider;
}
