.class public final Lcom/ibotta/android/di/VariantModule_ProvideFlippedFlowVariantFactory;
.super Ljava/lang/Object;
.source "VariantModule_ProvideFlippedFlowVariantFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;",
        ">;"
    }
.end annotation


# instance fields
.field private final variantFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/factory/VariantFactory;",
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
            "Lcom/ibotta/android/features/factory/VariantFactory;",
            ">;)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/di/VariantModule_ProvideFlippedFlowVariantFactory;->variantFactoryProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/VariantModule_ProvideFlippedFlowVariantFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/factory/VariantFactory;",
            ">;)",
            "Lcom/ibotta/android/di/VariantModule_ProvideFlippedFlowVariantFactory;"
        }
    .end annotation

    .line 35
    new-instance v0, Lcom/ibotta/android/di/VariantModule_ProvideFlippedFlowVariantFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/VariantModule_ProvideFlippedFlowVariantFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/factory/VariantFactory;",
            ">;)",
            "Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;"
        }
    .end annotation

    .line 30
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/features/factory/VariantFactory;

    invoke-static {p0}, Lcom/ibotta/android/di/VariantModule_ProvideFlippedFlowVariantFactory;->proxyProvideFlippedFlowVariant(Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideFlippedFlowVariant(Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;
    .locals 1

    .line 40
    invoke-static {p0}, Lcom/ibotta/android/di/VariantModule;->provideFlippedFlowVariant(Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 39
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/di/VariantModule_ProvideFlippedFlowVariantFactory;->variantFactoryProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/VariantModule_ProvideFlippedFlowVariantFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/VariantModule_ProvideFlippedFlowVariantFactory;->get()Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;

    move-result-object v0

    return-object v0
.end method
