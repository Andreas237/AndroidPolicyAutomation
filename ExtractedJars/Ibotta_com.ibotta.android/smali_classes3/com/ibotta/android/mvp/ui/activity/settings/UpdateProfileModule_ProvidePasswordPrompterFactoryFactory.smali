.class public final Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule_ProvidePasswordPrompterFactoryFactory;
.super Ljava/lang/Object;
.source "UpdateProfileModule_ProvidePasswordPrompterFactoryFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactory;",
        ">;"
    }
.end annotation


# instance fields
.field private final appHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule;

.field private final passwordCacheProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/security/PasswordCache;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/security/PasswordCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)V"
        }
    .end annotation

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule_ProvidePasswordPrompterFactoryFactory;->module:Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule;

    .line 28
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule_ProvidePasswordPrompterFactoryFactory;->passwordCacheProvider:Ljavax/inject/Provider;

    .line 29
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule_ProvidePasswordPrompterFactoryFactory;->appHelperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule_ProvidePasswordPrompterFactoryFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/security/PasswordCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule_ProvidePasswordPrompterFactoryFactory;"
        }
    .end annotation

    .line 49
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule_ProvidePasswordPrompterFactoryFactory;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule_ProvidePasswordPrompterFactoryFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactory;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/security/PasswordCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactory;"
        }
    .end annotation

    .line 42
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/security/PasswordCache;

    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/util/AppHelper;

    .line 41
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule_ProvidePasswordPrompterFactoryFactory;->proxyProvidePasswordPrompterFactory(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule;Lcom/ibotta/android/security/PasswordCache;Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactory;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvidePasswordPrompterFactory(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule;Lcom/ibotta/android/security/PasswordCache;Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactory;
    .locals 0

    .line 56
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule;->providePasswordPrompterFactory(Lcom/ibotta/android/security/PasswordCache;Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactory;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 55
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactory;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactory;
    .locals 3

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule_ProvidePasswordPrompterFactoryFactory;->module:Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule_ProvidePasswordPrompterFactoryFactory;->passwordCacheProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule_ProvidePasswordPrompterFactoryFactory;->appHelperProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule_ProvidePasswordPrompterFactoryFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactory;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule_ProvidePasswordPrompterFactoryFactory;->get()Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactory;

    move-result-object v0

    return-object v0
.end method
