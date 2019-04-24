.class public Lcom/ibotta/android/features/selector/RootVariantSelector;
.super Ljava/lang/Object;
.source "RootVariantSelector.java"

# interfaces
.implements Lcom/ibotta/android/features/selector/VariantSelector;


# instance fields
.field private final controlVariant:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ControlVariant;",
            ">;"
        }
    .end annotation
.end field

.field private final rootChain:Lcom/ibotta/android/features/chains/VariantChain;

.field private final variantMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ExperimentalVariant;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/util/Map;Lcom/ibotta/android/features/chains/VariantChain;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ControlVariant;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ExperimentalVariant;",
            ">;>;",
            "Lcom/ibotta/android/features/chains/VariantChain;",
            ")V"
        }
    .end annotation

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/features/selector/RootVariantSelector;->controlVariant:Ljava/lang/Class;

    .line 25
    iput-object p2, p0, Lcom/ibotta/android/features/selector/RootVariantSelector;->variantMap:Ljava/util/Map;

    .line 26
    iput-object p3, p0, Lcom/ibotta/android/features/selector/RootVariantSelector;->rootChain:Lcom/ibotta/android/features/chains/VariantChain;

    return-void
.end method


# virtual methods
.method public getControlVariant()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ControlVariant;",
            ">;"
        }
    .end annotation

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/features/selector/RootVariantSelector;->controlVariant:Ljava/lang/Class;

    return-object v0
.end method

.method public getExperimentalVariants()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ExperimentalVariant;",
            ">;>;"
        }
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/features/selector/RootVariantSelector;->variantMap:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public selectVariant()Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/Variant;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/features/selector/RootVariantSelector;->rootChain:Lcom/ibotta/android/features/chains/VariantChain;

    invoke-virtual {v0}, Lcom/ibotta/android/features/chains/VariantChain;->selectVariant()Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "no variant found for this user"

    const/4 v1, 0x0

    .line 44
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/features/selector/RootVariantSelector;->controlVariant:Ljava/lang/Class;

    :cond_0
    return-object v0
.end method
