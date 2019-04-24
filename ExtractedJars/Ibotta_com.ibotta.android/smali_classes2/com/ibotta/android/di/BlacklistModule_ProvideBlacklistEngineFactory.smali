.class public final Lcom/ibotta/android/di/BlacklistModule_ProvideBlacklistEngineFactory;
.super Ljava/lang/Object;
.source "BlacklistModule_ProvideBlacklistEngineFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/blacklist/BlacklistEngine;",
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

.field private final factoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;",
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
            "Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;)V"
        }
    .end annotation

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/di/BlacklistModule_ProvideBlacklistEngineFactory;->factoryProvider:Ljavax/inject/Provider;

    .line 24
    iput-object p2, p0, Lcom/ibotta/android/di/BlacklistModule_ProvideBlacklistEngineFactory;->appConfigProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/BlacklistModule_ProvideBlacklistEngineFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;)",
            "Lcom/ibotta/android/di/BlacklistModule_ProvideBlacklistEngineFactory;"
        }
    .end annotation

    .line 39
    new-instance v0, Lcom/ibotta/android/di/BlacklistModule_ProvideBlacklistEngineFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/di/BlacklistModule_ProvideBlacklistEngineFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/blacklist/BlacklistEngine;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;)",
            "Lcom/ibotta/android/blacklist/BlacklistEngine;"
        }
    .end annotation

    .line 34
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-static {p0, p1}, Lcom/ibotta/android/di/BlacklistModule_ProvideBlacklistEngineFactory;->proxyProvideBlacklistEngine(Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;Lcom/ibotta/android/state/app/config/AppConfig;)Lcom/ibotta/android/blacklist/BlacklistEngine;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideBlacklistEngine(Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;Lcom/ibotta/android/state/app/config/AppConfig;)Lcom/ibotta/android/blacklist/BlacklistEngine;
    .locals 0

    .line 45
    invoke-static {p0, p1}, Lcom/ibotta/android/di/BlacklistModule;->provideBlacklistEngine(Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;Lcom/ibotta/android/state/app/config/AppConfig;)Lcom/ibotta/android/blacklist/BlacklistEngine;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 44
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/blacklist/BlacklistEngine;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/blacklist/BlacklistEngine;
    .locals 2

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/di/BlacklistModule_ProvideBlacklistEngineFactory;->factoryProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/BlacklistModule_ProvideBlacklistEngineFactory;->appConfigProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/di/BlacklistModule_ProvideBlacklistEngineFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/blacklist/BlacklistEngine;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/di/BlacklistModule_ProvideBlacklistEngineFactory;->get()Lcom/ibotta/android/blacklist/BlacklistEngine;

    move-result-object v0

    return-object v0
.end method
