.class public interface abstract Lcom/ibotta/android/features/factory/RootVariantSelectorFactory;
.super Ljava/lang/Object;
.source "RootVariantSelectorFactory.java"


# virtual methods
.method public abstract createLaunchDarklyOnlyVariantSelector(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Class;)Lcom/ibotta/android/features/selector/RootVariantSelector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ExperimentalVariant;",
            ">;>;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ControlVariant;",
            ">;)",
            "Lcom/ibotta/android/features/selector/RootVariantSelector;"
        }
    .end annotation
.end method

.method public abstract createMvtRootVariantSelector(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Class;)Lcom/ibotta/android/features/selector/RootVariantSelector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ExperimentalVariant;",
            ">;>;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ControlVariant;",
            ">;)",
            "Lcom/ibotta/android/features/selector/RootVariantSelector;"
        }
    .end annotation
.end method

.method public abstract createSingleMvtRootVariantSelector(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Lcom/ibotta/android/features/selector/RootVariantSelector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ExperimentalVariant;",
            ">;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ControlVariant;",
            ">;)",
            "Lcom/ibotta/android/features/selector/RootVariantSelector;"
        }
    .end annotation
.end method

.method public abstract createSingleRootVariantSelector(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Lcom/ibotta/android/features/selector/RootVariantSelector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ExperimentalVariant;",
            ">;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ControlVariant;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/ibotta/android/features/selector/RootVariantSelector;"
        }
    .end annotation
.end method

.method public abstract createSingleRootVariantSelector(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;Z)Lcom/ibotta/android/features/selector/RootVariantSelector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ExperimentalVariant;",
            ">;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ControlVariant;",
            ">;",
            "Ljava/lang/String;",
            "Z)",
            "Lcom/ibotta/android/features/selector/RootVariantSelector;"
        }
    .end annotation
.end method
