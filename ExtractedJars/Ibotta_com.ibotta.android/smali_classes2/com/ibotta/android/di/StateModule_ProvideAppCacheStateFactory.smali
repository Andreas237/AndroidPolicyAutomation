.class public final Lcom/ibotta/android/di/StateModule_ProvideAppCacheStateFactory;
.super Ljava/lang/Object;
.source "StateModule_ProvideAppCacheStateFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/state/app/cache/AppCacheState;",
        ">;"
    }
.end annotation


# instance fields
.field private final appConfigProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;"
        }
    .end annotation
.end field

.field private final cacheDirProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field private final globalEventManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/GlobalEventManager;",
            ">;"
        }
    .end annotation
.end field

.field private final prefsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/io/File;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/GlobalEventManager;",
            ">;)V"
        }
    .end annotation

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/di/StateModule_ProvideAppCacheStateFactory;->appConfigProvider:Ljavax/inject/Provider;

    .line 32
    iput-object p2, p0, Lcom/ibotta/android/di/StateModule_ProvideAppCacheStateFactory;->prefsProvider:Ljavax/inject/Provider;

    .line 33
    iput-object p3, p0, Lcom/ibotta/android/di/StateModule_ProvideAppCacheStateFactory;->cacheDirProvider:Ljavax/inject/Provider;

    .line 34
    iput-object p4, p0, Lcom/ibotta/android/di/StateModule_ProvideAppCacheStateFactory;->globalEventManagerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/StateModule_ProvideAppCacheStateFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/io/File;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/GlobalEventManager;",
            ">;)",
            "Lcom/ibotta/android/di/StateModule_ProvideAppCacheStateFactory;"
        }
    .end annotation

    .line 60
    new-instance v0, Lcom/ibotta/android/di/StateModule_ProvideAppCacheStateFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/di/StateModule_ProvideAppCacheStateFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/state/app/cache/AppCacheState;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/SharedPreferences;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/io/File;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/GlobalEventManager;",
            ">;)",
            "Lcom/ibotta/android/state/app/cache/AppCacheState;"
        }
    .end annotation

    .line 49
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/state/app/config/AppConfig;

    .line 50
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/SharedPreferences;

    .line 51
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/io/File;

    .line 52
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ibotta/android/state/GlobalEventManager;

    .line 48
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/StateModule_ProvideAppCacheStateFactory;->proxyProvideAppCacheState(Lcom/ibotta/android/state/app/config/AppConfig;Landroid/content/SharedPreferences;Ljava/io/File;Lcom/ibotta/android/state/GlobalEventManager;)Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideAppCacheState(Lcom/ibotta/android/state/app/config/AppConfig;Landroid/content/SharedPreferences;Ljava/io/File;Lcom/ibotta/android/state/GlobalEventManager;)Lcom/ibotta/android/state/app/cache/AppCacheState;
    .locals 0

    .line 70
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/StateModule;->provideAppCacheState(Lcom/ibotta/android/state/app/config/AppConfig;Landroid/content/SharedPreferences;Ljava/io/File;Lcom/ibotta/android/state/GlobalEventManager;)Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 69
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/state/app/cache/AppCacheState;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/state/app/cache/AppCacheState;
    .locals 4

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/di/StateModule_ProvideAppCacheStateFactory;->appConfigProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/StateModule_ProvideAppCacheStateFactory;->prefsProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/StateModule_ProvideAppCacheStateFactory;->cacheDirProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/StateModule_ProvideAppCacheStateFactory;->globalEventManagerProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/di/StateModule_ProvideAppCacheStateFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/ibotta/android/di/StateModule_ProvideAppCacheStateFactory;->get()Lcom/ibotta/android/state/app/cache/AppCacheState;

    move-result-object v0

    return-object v0
.end method
