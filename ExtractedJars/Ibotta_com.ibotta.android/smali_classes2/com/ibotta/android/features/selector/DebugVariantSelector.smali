.class public Lcom/ibotta/android/features/selector/DebugVariantSelector;
.super Ljava/lang/Object;
.source "DebugVariantSelector.java"

# interfaces
.implements Lcom/ibotta/android/features/selector/VariantSelector;


# instance fields
.field private final storage:Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

.field private final testName:Ljava/lang/String;

.field private final variantSelector:Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/features/selector/DebugVariantSelector;->testName:Ljava/lang/String;

    .line 30
    iput-object p2, p0, Lcom/ibotta/android/features/selector/DebugVariantSelector;->storage:Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

    .line 31
    iput-object p3, p0, Lcom/ibotta/android/features/selector/DebugVariantSelector;->variantSelector:Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;

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

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/features/selector/DebugVariantSelector;->variantSelector:Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;

    invoke-interface {v0}, Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;->getControlVariant()Ljava/lang/Class;

    move-result-object v0

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

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/features/selector/DebugVariantSelector;->variantSelector:Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;

    invoke-interface {v0}, Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;->getExperimentalVariants()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public selectVariant()Ljava/lang/Class;
    .locals 6
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

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/features/selector/DebugVariantSelector;->storage:Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

    iget-object v1, p0, Lcom/ibotta/android/features/selector/DebugVariantSelector;->testName:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;->getFeatureFlagState(Ljava/lang/String;)Lcom/ibotta/android/features/storage/DebugFeatureFlagState;

    move-result-object v0

    .line 50
    iget-object v1, p0, Lcom/ibotta/android/features/selector/DebugVariantSelector;->variantSelector:Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;

    invoke-interface {v1}, Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;->getExperimentalVariants()Ljava/util/Map;

    move-result-object v1

    if-eqz v0, :cond_2

    .line 53
    invoke-virtual {v0}, Lcom/ibotta/android/features/storage/DebugFeatureFlagState;->getVariantName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "control"

    .line 55
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 57
    invoke-virtual {p0}, Lcom/ibotta/android/features/selector/DebugVariantSelector;->getControlVariant()Ljava/lang/Class;

    move-result-object v0

    goto :goto_0

    .line 59
    :cond_0
    iget-object v2, p0, Lcom/ibotta/android/features/selector/DebugVariantSelector;->variantSelector:Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;

    invoke-interface {v2}, Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;->getExperimentalVariants()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 60
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v0, "Debug override active for: testName=%1$s, chosen variant=%2$s"

    const/4 v2, 0x2

    .line 61
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/ibotta/android/features/selector/DebugVariantSelector;->testName:Ljava/lang/String;

    aput-object v5, v2, v4

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_3

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/features/selector/DebugVariantSelector;->variantSelector:Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;

    invoke-interface {v0}, Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;->selectVariant()Ljava/lang/Class;

    move-result-object v0

    :cond_3
    return-object v0
.end method
