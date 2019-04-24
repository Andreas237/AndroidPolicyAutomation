.class public Lcom/ibotta/android/features/selector/experimental/SingleVariantSelector;
.super Ljava/lang/Object;
.source "SingleVariantSelector.java"

# interfaces
.implements Lcom/ibotta/android/features/selector/VariantSelector;
.implements Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;


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

.field private final experimentalVariant:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ExperimentalVariant;",
            ">;"
        }
    .end annotation
.end field

.field private final shouldUseControlAsDefault:Z

.field private final variantName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ControlVariant;",
            ">;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ExperimentalVariant;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 29
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/features/selector/experimental/SingleVariantSelector;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ControlVariant;",
            ">;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ExperimentalVariant;",
            ">;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/ibotta/android/features/selector/experimental/SingleVariantSelector;->controlVariant:Ljava/lang/Class;

    .line 38
    iput-object p2, p0, Lcom/ibotta/android/features/selector/experimental/SingleVariantSelector;->experimentalVariant:Ljava/lang/Class;

    .line 39
    iput-object p3, p0, Lcom/ibotta/android/features/selector/experimental/SingleVariantSelector;->variantName:Ljava/lang/String;

    .line 40
    iput-boolean p4, p0, Lcom/ibotta/android/features/selector/experimental/SingleVariantSelector;->shouldUseControlAsDefault:Z

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

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/features/selector/experimental/SingleVariantSelector;->controlVariant:Ljava/lang/Class;

    return-object v0
.end method

.method public getExperimentalVariants()Ljava/util/Map;
    .locals 3
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

    .line 50
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 51
    iget-object v1, p0, Lcom/ibotta/android/features/selector/experimental/SingleVariantSelector;->variantName:Ljava/lang/String;

    iget-object v2, p0, Lcom/ibotta/android/features/selector/experimental/SingleVariantSelector;->experimentalVariant:Ljava/lang/Class;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public selectVariant()Ljava/lang/Class;
    .locals 1
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

    .line 58
    iget-boolean v0, p0, Lcom/ibotta/android/features/selector/experimental/SingleVariantSelector;->shouldUseControlAsDefault:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/features/selector/experimental/SingleVariantSelector;->controlVariant:Ljava/lang/Class;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/features/selector/experimental/SingleVariantSelector;->experimentalVariant:Ljava/lang/Class;

    :goto_0
    return-object v0
.end method
