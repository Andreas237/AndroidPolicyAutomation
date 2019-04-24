.class public Lcom/ibotta/android/features/selector/ControlVariantSelector;
.super Ljava/lang/Object;
.source "ControlVariantSelector.java"

# interfaces
.implements Lcom/ibotta/android/features/selector/VariantSelector;


# instance fields
.field private final controlVariantClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ControlVariant;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ControlVariant;",
            ">;)V"
        }
    .end annotation

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/features/selector/ControlVariantSelector;->controlVariantClass:Ljava/lang/Class;

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

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/features/selector/ControlVariantSelector;->controlVariantClass:Ljava/lang/Class;

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

    .line 26
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

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

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/features/selector/ControlVariantSelector;->controlVariantClass:Ljava/lang/Class;

    return-object v0
.end method
