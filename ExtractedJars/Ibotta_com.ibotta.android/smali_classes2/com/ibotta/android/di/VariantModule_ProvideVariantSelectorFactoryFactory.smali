.class public final Lcom/ibotta/android/di/VariantModule_ProvideVariantSelectorFactoryFactory;
.super Ljava/lang/Object;
.source "VariantModule_ProvideVariantSelectorFactoryFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/features/factory/VariantSelectorFactory;",
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

.field private final debugFfStorageProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;",
            ">;"
        }
    .end annotation
.end field

.field private final ffRespUtilProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/FeatureFlagResponseUtil;",
            ">;"
        }
    .end annotation
.end field

.field private final mvtTestsHolderProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;",
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
            "Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/FeatureFlagResponseUtil;",
            ">;)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/di/VariantModule_ProvideVariantSelectorFactoryFactory;->appConfigProvider:Ljavax/inject/Provider;

    .line 33
    iput-object p2, p0, Lcom/ibotta/android/di/VariantModule_ProvideVariantSelectorFactoryFactory;->debugFfStorageProvider:Ljavax/inject/Provider;

    .line 34
    iput-object p3, p0, Lcom/ibotta/android/di/VariantModule_ProvideVariantSelectorFactoryFactory;->mvtTestsHolderProvider:Ljavax/inject/Provider;

    .line 35
    iput-object p4, p0, Lcom/ibotta/android/di/VariantModule_ProvideVariantSelectorFactoryFactory;->ffRespUtilProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/VariantModule_ProvideVariantSelectorFactoryFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/FeatureFlagResponseUtil;",
            ">;)",
            "Lcom/ibotta/android/di/VariantModule_ProvideVariantSelectorFactoryFactory;"
        }
    .end annotation

    .line 61
    new-instance v0, Lcom/ibotta/android/di/VariantModule_ProvideVariantSelectorFactoryFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/di/VariantModule_ProvideVariantSelectorFactoryFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/features/factory/VariantSelectorFactory;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/FeatureFlagResponseUtil;",
            ">;)",
            "Lcom/ibotta/android/features/factory/VariantSelectorFactory;"
        }
    .end annotation

    .line 50
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/state/app/config/AppConfig;

    .line 51
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

    .line 52
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

    .line 53
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    .line 49
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/VariantModule_ProvideVariantSelectorFactoryFactory;->proxyProvideVariantSelectorFactory(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;Lcom/ibotta/android/features/FeatureFlagResponseUtil;)Lcom/ibotta/android/features/factory/VariantSelectorFactory;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideVariantSelectorFactory(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;Lcom/ibotta/android/features/FeatureFlagResponseUtil;)Lcom/ibotta/android/features/factory/VariantSelectorFactory;
    .locals 0

    .line 71
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/VariantModule;->provideVariantSelectorFactory(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;Lcom/ibotta/android/features/FeatureFlagResponseUtil;)Lcom/ibotta/android/features/factory/VariantSelectorFactory;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 70
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/features/factory/VariantSelectorFactory;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/features/factory/VariantSelectorFactory;
    .locals 4

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/di/VariantModule_ProvideVariantSelectorFactoryFactory;->appConfigProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/VariantModule_ProvideVariantSelectorFactoryFactory;->debugFfStorageProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/VariantModule_ProvideVariantSelectorFactoryFactory;->mvtTestsHolderProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/VariantModule_ProvideVariantSelectorFactoryFactory;->ffRespUtilProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/di/VariantModule_ProvideVariantSelectorFactoryFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/features/factory/VariantSelectorFactory;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/ibotta/android/di/VariantModule_ProvideVariantSelectorFactoryFactory;->get()Lcom/ibotta/android/features/factory/VariantSelectorFactory;

    move-result-object v0

    return-object v0
.end method
