.class public final Lcom/ibotta/android/di/StateModule_ProvideFeatureFlagResponseUtilFactory;
.super Ljava/lang/Object;
.source "StateModule_ProvideFeatureFlagResponseUtilFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/features/FeatureFlagResponseUtil;",
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


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;)V"
        }
    .end annotation

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/di/StateModule_ProvideFeatureFlagResponseUtilFactory;->appConfigProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/StateModule_ProvideFeatureFlagResponseUtilFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;)",
            "Lcom/ibotta/android/di/StateModule_ProvideFeatureFlagResponseUtilFactory;"
        }
    .end annotation

    .line 33
    new-instance v0, Lcom/ibotta/android/di/StateModule_ProvideFeatureFlagResponseUtilFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/StateModule_ProvideFeatureFlagResponseUtilFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/features/FeatureFlagResponseUtil;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;)",
            "Lcom/ibotta/android/features/FeatureFlagResponseUtil;"
        }
    .end annotation

    .line 28
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-static {p0}, Lcom/ibotta/android/di/StateModule_ProvideFeatureFlagResponseUtilFactory;->proxyProvideFeatureFlagResponseUtil(Lcom/ibotta/android/state/app/config/AppConfig;)Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideFeatureFlagResponseUtil(Lcom/ibotta/android/state/app/config/AppConfig;)Lcom/ibotta/android/features/FeatureFlagResponseUtil;
    .locals 1

    .line 38
    invoke-static {p0}, Lcom/ibotta/android/di/StateModule;->provideFeatureFlagResponseUtil(Lcom/ibotta/android/state/app/config/AppConfig;)Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 37
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/features/FeatureFlagResponseUtil;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/di/StateModule_ProvideFeatureFlagResponseUtilFactory;->appConfigProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/StateModule_ProvideFeatureFlagResponseUtilFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/StateModule_ProvideFeatureFlagResponseUtilFactory;->get()Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    move-result-object v0

    return-object v0
.end method
