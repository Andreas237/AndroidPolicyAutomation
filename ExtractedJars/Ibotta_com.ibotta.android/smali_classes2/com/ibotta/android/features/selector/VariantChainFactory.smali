.class public interface abstract Lcom/ibotta/android/features/selector/VariantChainFactory;
.super Ljava/lang/Object;
.source "VariantChainFactory.java"


# virtual methods
.method public abstract createVariantChain(Ljava/lang/String;Lcom/ibotta/android/features/evaluator/experimental/ExperimentalRuleEvaluator;Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;Ljava/lang/Class;Ljava/util/Map;Lcom/ibotta/android/features/chains/VariantChainStrategy;)Lcom/ibotta/android/features/chains/VariantChain;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/features/evaluator/experimental/ExperimentalRuleEvaluator;",
            "Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;",
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
            "Lcom/ibotta/android/features/chains/VariantChainStrategy;",
            ")",
            "Lcom/ibotta/android/features/chains/VariantChain;"
        }
    .end annotation
.end method
