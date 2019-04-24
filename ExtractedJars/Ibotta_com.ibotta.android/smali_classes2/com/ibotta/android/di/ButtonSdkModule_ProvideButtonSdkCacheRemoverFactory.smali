.class public final Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkCacheRemoverFactory;
.super Ljava/lang/Object;
.source "ButtonSdkModule_ProvideButtonSdkCacheRemoverFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;",
        ">;"
    }
.end annotation


# instance fields
.field private final appCacheProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;"
        }
    .end annotation
.end field

.field private final userStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;)V"
        }
    .end annotation

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkCacheRemoverFactory;->appCacheProvider:Ljavax/inject/Provider;

    .line 24
    iput-object p2, p0, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkCacheRemoverFactory;->userStateProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkCacheRemoverFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;)",
            "Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkCacheRemoverFactory;"
        }
    .end annotation

    .line 39
    new-instance v0, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkCacheRemoverFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkCacheRemoverFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;)",
            "Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;"
        }
    .end annotation

    .line 34
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/appcache/AppCache;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/state/user/UserState;

    invoke-static {p0, p1}, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkCacheRemoverFactory;->proxyProvideButtonSdkCacheRemover(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/user/UserState;)Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideButtonSdkCacheRemover(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/user/UserState;)Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;
    .locals 0

    .line 46
    invoke-static {p0, p1}, Lcom/ibotta/android/di/ButtonSdkModule;->provideButtonSdkCacheRemover(Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/state/user/UserState;)Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 45
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;
    .locals 2

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkCacheRemoverFactory;->appCacheProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkCacheRemoverFactory;->userStateProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkCacheRemoverFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/di/ButtonSdkModule_ProvideButtonSdkCacheRemoverFactory;->get()Lcom/ibotta/android/buttonsdk/ButtonSdkCacheRemover;

    move-result-object v0

    return-object v0
.end method
