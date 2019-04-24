.class public final Lcom/ibotta/android/di/CacheModule_ProvideCacheClearHelperFactory;
.super Ljava/lang/Object;
.source "CacheModule_ProvideCacheClearHelperFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/appcache/CacheClearHelper;",
        ">;"
    }
.end annotation


# instance fields
.field private final cacheClearRunnableFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/CacheClearRunnableFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final fcmStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/fcm/FcmState;",
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
            "Lcom/ibotta/android/appcache/CacheClearRunnableFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/fcm/FcmState;",
            ">;)V"
        }
    .end annotation

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/di/CacheModule_ProvideCacheClearHelperFactory;->cacheClearRunnableFactoryProvider:Ljavax/inject/Provider;

    .line 24
    iput-object p2, p0, Lcom/ibotta/android/di/CacheModule_ProvideCacheClearHelperFactory;->fcmStateProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/CacheModule_ProvideCacheClearHelperFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/CacheClearRunnableFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/fcm/FcmState;",
            ">;)",
            "Lcom/ibotta/android/di/CacheModule_ProvideCacheClearHelperFactory;"
        }
    .end annotation

    .line 42
    new-instance v0, Lcom/ibotta/android/di/CacheModule_ProvideCacheClearHelperFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/di/CacheModule_ProvideCacheClearHelperFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/appcache/CacheClearHelper;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/appcache/CacheClearRunnableFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/fcm/FcmState;",
            ">;)",
            "Lcom/ibotta/android/appcache/CacheClearHelper;"
        }
    .end annotation

    .line 36
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/appcache/CacheClearRunnableFactory;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/state/app/fcm/FcmState;

    .line 35
    invoke-static {p0, p1}, Lcom/ibotta/android/di/CacheModule_ProvideCacheClearHelperFactory;->proxyProvideCacheClearHelper(Lcom/ibotta/android/appcache/CacheClearRunnableFactory;Lcom/ibotta/android/state/app/fcm/FcmState;)Lcom/ibotta/android/appcache/CacheClearHelper;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideCacheClearHelper(Lcom/ibotta/android/appcache/CacheClearRunnableFactory;Lcom/ibotta/android/state/app/fcm/FcmState;)Lcom/ibotta/android/appcache/CacheClearHelper;
    .locals 0

    .line 49
    invoke-static {p0, p1}, Lcom/ibotta/android/di/CacheModule;->provideCacheClearHelper(Lcom/ibotta/android/appcache/CacheClearRunnableFactory;Lcom/ibotta/android/state/app/fcm/FcmState;)Lcom/ibotta/android/appcache/CacheClearHelper;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 48
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/appcache/CacheClearHelper;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/appcache/CacheClearHelper;
    .locals 2

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/di/CacheModule_ProvideCacheClearHelperFactory;->cacheClearRunnableFactoryProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/CacheModule_ProvideCacheClearHelperFactory;->fcmStateProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/di/CacheModule_ProvideCacheClearHelperFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/appcache/CacheClearHelper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/di/CacheModule_ProvideCacheClearHelperFactory;->get()Lcom/ibotta/android/appcache/CacheClearHelper;

    move-result-object v0

    return-object v0
.end method
