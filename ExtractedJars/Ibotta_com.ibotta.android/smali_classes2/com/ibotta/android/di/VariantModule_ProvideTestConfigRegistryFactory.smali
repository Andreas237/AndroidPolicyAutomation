.class public final Lcom/ibotta/android/di/VariantModule_ProvideTestConfigRegistryFactory;
.super Ljava/lang/Object;
.source "VariantModule_ProvideTestConfigRegistryFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/features/registry/ConfigRegistry;",
        ">;"
    }
.end annotation


# instance fields
.field private final testConfigMapProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/features/TestConfig;",
            ">;>;"
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
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/features/TestConfig;",
            ">;>;)V"
        }
    .end annotation

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/di/VariantModule_ProvideTestConfigRegistryFactory;->testConfigMapProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/VariantModule_ProvideTestConfigRegistryFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/features/TestConfig;",
            ">;>;)",
            "Lcom/ibotta/android/di/VariantModule_ProvideTestConfigRegistryFactory;"
        }
    .end annotation

    .line 36
    new-instance v0, Lcom/ibotta/android/di/VariantModule_ProvideTestConfigRegistryFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/VariantModule_ProvideTestConfigRegistryFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/features/registry/ConfigRegistry;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/features/TestConfig;",
            ">;>;)",
            "Lcom/ibotta/android/features/registry/ConfigRegistry;"
        }
    .end annotation

    .line 31
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map;

    invoke-static {p0}, Lcom/ibotta/android/di/VariantModule_ProvideTestConfigRegistryFactory;->proxyProvideTestConfigRegistry(Ljava/util/Map;)Lcom/ibotta/android/features/registry/ConfigRegistry;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideTestConfigRegistry(Ljava/util/Map;)Lcom/ibotta/android/features/registry/ConfigRegistry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/features/TestConfig;",
            ">;)",
            "Lcom/ibotta/android/features/registry/ConfigRegistry;"
        }
    .end annotation

    .line 42
    invoke-static {p0}, Lcom/ibotta/android/di/VariantModule;->provideTestConfigRegistry(Ljava/util/Map;)Lcom/ibotta/android/features/registry/ConfigRegistry;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 41
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/features/registry/ConfigRegistry;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/features/registry/ConfigRegistry;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/di/VariantModule_ProvideTestConfigRegistryFactory;->testConfigMapProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/VariantModule_ProvideTestConfigRegistryFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/features/registry/ConfigRegistry;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/di/VariantModule_ProvideTestConfigRegistryFactory;->get()Lcom/ibotta/android/features/registry/ConfigRegistry;

    move-result-object v0

    return-object v0
.end method
