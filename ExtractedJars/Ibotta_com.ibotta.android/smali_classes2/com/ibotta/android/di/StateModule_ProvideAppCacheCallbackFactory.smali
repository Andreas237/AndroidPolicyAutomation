.class public final Lcom/ibotta/android/di/StateModule_ProvideAppCacheCallbackFactory;
.super Ljava/lang/Object;
.source "StateModule_ProvideAppCacheCallbackFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/state/app/AppCacheCallback;",
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


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/di/StateModule_ProvideAppCacheCallbackFactory;->appCacheProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/StateModule_ProvideAppCacheCallbackFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;)",
            "Lcom/ibotta/android/di/StateModule_ProvideAppCacheCallbackFactory;"
        }
    .end annotation

    .line 32
    new-instance v0, Lcom/ibotta/android/di/StateModule_ProvideAppCacheCallbackFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/StateModule_ProvideAppCacheCallbackFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/state/app/AppCacheCallback;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/AppCache;",
            ">;)",
            "Lcom/ibotta/android/state/app/AppCacheCallback;"
        }
    .end annotation

    .line 27
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/appcache/AppCache;

    invoke-static {p0}, Lcom/ibotta/android/di/StateModule_ProvideAppCacheCallbackFactory;->proxyProvideAppCacheCallback(Lcom/ibotta/android/appcache/AppCache;)Lcom/ibotta/android/state/app/AppCacheCallback;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideAppCacheCallback(Lcom/ibotta/android/appcache/AppCache;)Lcom/ibotta/android/state/app/AppCacheCallback;
    .locals 1

    .line 37
    invoke-static {p0}, Lcom/ibotta/android/di/StateModule;->provideAppCacheCallback(Lcom/ibotta/android/appcache/AppCache;)Lcom/ibotta/android/state/app/AppCacheCallback;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 36
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/state/app/AppCacheCallback;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/state/app/AppCacheCallback;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/di/StateModule_ProvideAppCacheCallbackFactory;->appCacheProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/StateModule_ProvideAppCacheCallbackFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/state/app/AppCacheCallback;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/StateModule_ProvideAppCacheCallbackFactory;->get()Lcom/ibotta/android/state/app/AppCacheCallback;

    move-result-object v0

    return-object v0
.end method
