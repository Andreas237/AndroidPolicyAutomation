.class public interface abstract Lcom/ibotta/android/features/selector/VariantSelector;
.super Ljava/lang/Object;
.source "VariantSelector.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0012\u0010\r\u001a\u000c\u0012\u0006\u0008\u0001\u0012\u00020\u000e\u0018\u00010\u0003H&R\u001a\u0010\u0002\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R&\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\n0\u00030\u0008X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/ibotta/android/features/selector/VariantSelector;",
        "",
        "controlVariant",
        "Ljava/lang/Class;",
        "Lcom/ibotta/android/features/ControlVariant;",
        "getControlVariant",
        "()Ljava/lang/Class;",
        "experimentalVariants",
        "",
        "",
        "Lcom/ibotta/android/features/ExperimentalVariant;",
        "getExperimentalVariants",
        "()Ljava/util/Map;",
        "selectVariant",
        "Lcom/ibotta/android/features/Variant;",
        "ibotta-features-kotlin_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# virtual methods
.method public abstract getControlVariant()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ControlVariant;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getExperimentalVariants()Ljava/util/Map;
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

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract selectVariant()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/Variant;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method
