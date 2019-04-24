.class public Lcom/ibotta/android/features/factory/RootVariantSelectorFactoryImpl;
.super Ljava/lang/Object;
.source "RootVariantSelectorFactoryImpl.java"

# interfaces
.implements Lcom/ibotta/android/features/factory/RootVariantSelectorFactory;


# instance fields
.field private final reFactory:Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;

.field private final variantChainFactory:Lcom/ibotta/android/features/selector/VariantChainFactory;

.field private final vsFactory:Lcom/ibotta/android/features/factory/VariantSelectorFactory;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;Lcom/ibotta/android/features/factory/VariantSelectorFactory;Lcom/ibotta/android/features/selector/VariantChainFactory;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/ibotta/android/features/factory/RootVariantSelectorFactoryImpl;->reFactory:Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;

    .line 35
    iput-object p2, p0, Lcom/ibotta/android/features/factory/RootVariantSelectorFactoryImpl;->vsFactory:Lcom/ibotta/android/features/factory/VariantSelectorFactory;

    .line 36
    iput-object p3, p0, Lcom/ibotta/android/features/factory/RootVariantSelectorFactoryImpl;->variantChainFactory:Lcom/ibotta/android/features/selector/VariantChainFactory;

    return-void
.end method

.method private createRootVariantSelector(Ljava/lang/String;Lcom/ibotta/android/features/evaluator/experimental/ExperimentalRuleEvaluator;Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;Ljava/lang/Class;Ljava/util/Map;Lcom/ibotta/android/features/chains/VariantChainStrategy;)Lcom/ibotta/android/features/selector/RootVariantSelector;
    .locals 7
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
            "Lcom/ibotta/android/features/selector/RootVariantSelector;"
        }
    .end annotation

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/features/factory/RootVariantSelectorFactoryImpl;->variantChainFactory:Lcom/ibotta/android/features/selector/VariantChainFactory;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Lcom/ibotta/android/features/selector/VariantChainFactory;->createVariantChain(Ljava/lang/String;Lcom/ibotta/android/features/evaluator/experimental/ExperimentalRuleEvaluator;Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;Ljava/lang/Class;Ljava/util/Map;Lcom/ibotta/android/features/chains/VariantChainStrategy;)Lcom/ibotta/android/features/chains/VariantChain;

    move-result-object p1

    .line 145
    new-instance p2, Lcom/ibotta/android/features/selector/RootVariantSelector;

    invoke-direct {p2, p4, p5, p1}, Lcom/ibotta/android/features/selector/RootVariantSelector;-><init>(Ljava/lang/Class;Ljava/util/Map;Lcom/ibotta/android/features/chains/VariantChain;)V

    return-object p2
.end method

.method private createSingleVariantMap(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ExperimentalVariant;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ExperimentalVariant;",
            ">;>;"
        }
    .end annotation

    .line 153
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 155
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public createLaunchDarklyOnlyVariantSelector(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Class;)Lcom/ibotta/android/features/selector/RootVariantSelector;
    .locals 7
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

    .line 117
    sget-object v2, Lcom/ibotta/android/features/evaluator/experimental/EmptyRuleEvaluator;->TRUE:Lcom/ibotta/android/features/evaluator/experimental/EmptyRuleEvaluator;

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/features/factory/RootVariantSelectorFactoryImpl;->vsFactory:Lcom/ibotta/android/features/factory/VariantSelectorFactory;

    invoke-virtual {v0, p1, p2, p4, p3}, Lcom/ibotta/android/features/factory/VariantSelectorFactory;->createLaunchDarklyVariantSelector(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/util/Map;)Lcom/ibotta/android/features/selector/experimental/LaunchDarklyVariantSelector;

    move-result-object v3

    .line 121
    sget-object v6, Lcom/ibotta/android/features/chains/VariantChainStrategy;->LAUNCH_DARKLY_FLAGS_AND_AUDIENCE:Lcom/ibotta/android/features/chains/VariantChainStrategy;

    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    move-object v5, p3

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/features/factory/RootVariantSelectorFactoryImpl;->createRootVariantSelector(Ljava/lang/String;Lcom/ibotta/android/features/evaluator/experimental/ExperimentalRuleEvaluator;Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;Ljava/lang/Class;Ljava/util/Map;Lcom/ibotta/android/features/chains/VariantChainStrategy;)Lcom/ibotta/android/features/selector/RootVariantSelector;

    move-result-object p1

    return-object p1
.end method

.method public createMvtRootVariantSelector(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Class;)Lcom/ibotta/android/features/selector/RootVariantSelector;
    .locals 8
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

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/features/factory/RootVariantSelectorFactoryImpl;->reFactory:Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->createMvtRuleEvaluator(Ljava/lang/String;)Lcom/ibotta/android/features/evaluator/experimental/MvtRuleEvaluator;

    move-result-object v3

    .line 66
    iget-object v0, p0, Lcom/ibotta/android/features/factory/RootVariantSelectorFactoryImpl;->vsFactory:Lcom/ibotta/android/features/factory/VariantSelectorFactory;

    invoke-virtual {v0, p1, p3, p2}, Lcom/ibotta/android/features/factory/VariantSelectorFactory;->createMvtVariantSelector(Ljava/lang/String;Ljava/lang/Class;Ljava/util/Map;)Lcom/ibotta/android/features/selector/experimental/MvtVariantSelector;

    move-result-object v4

    .line 69
    sget-object v7, Lcom/ibotta/android/features/chains/VariantChainStrategy;->APP_CONFIG_FLAGS_AND_MVT_AUDIENCE:Lcom/ibotta/android/features/chains/VariantChainStrategy;

    move-object v1, p0

    move-object v2, p1

    move-object v5, p3

    move-object v6, p2

    invoke-direct/range {v1 .. v7}, Lcom/ibotta/android/features/factory/RootVariantSelectorFactoryImpl;->createRootVariantSelector(Ljava/lang/String;Lcom/ibotta/android/features/evaluator/experimental/ExperimentalRuleEvaluator;Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;Ljava/lang/Class;Ljava/util/Map;Lcom/ibotta/android/features/chains/VariantChainStrategy;)Lcom/ibotta/android/features/selector/RootVariantSelector;

    move-result-object p1

    return-object p1
.end method

.method public createSingleMvtRootVariantSelector(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Lcom/ibotta/android/features/selector/RootVariantSelector;
    .locals 7
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

    .line 45
    invoke-direct {p0, p2, p3}, Lcom/ibotta/android/features/factory/RootVariantSelectorFactoryImpl;->createSingleVariantMap(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/Map;

    move-result-object v5

    .line 47
    iget-object p2, p0, Lcom/ibotta/android/features/factory/RootVariantSelectorFactoryImpl;->reFactory:Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->createMvtRuleEvaluator(Ljava/lang/String;)Lcom/ibotta/android/features/evaluator/experimental/MvtRuleEvaluator;

    move-result-object v2

    .line 48
    iget-object p2, p0, Lcom/ibotta/android/features/factory/RootVariantSelectorFactoryImpl;->vsFactory:Lcom/ibotta/android/features/factory/VariantSelectorFactory;

    invoke-virtual {p2, p1, p4, v5}, Lcom/ibotta/android/features/factory/VariantSelectorFactory;->createMvtVariantSelector(Ljava/lang/String;Ljava/lang/Class;Ljava/util/Map;)Lcom/ibotta/android/features/selector/experimental/MvtVariantSelector;

    move-result-object v3

    .line 51
    sget-object v6, Lcom/ibotta/android/features/chains/VariantChainStrategy;->APP_CONFIG_FLAGS_AND_MVT_AUDIENCE:Lcom/ibotta/android/features/chains/VariantChainStrategy;

    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/features/factory/RootVariantSelectorFactoryImpl;->createRootVariantSelector(Ljava/lang/String;Lcom/ibotta/android/features/evaluator/experimental/ExperimentalRuleEvaluator;Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;Ljava/lang/Class;Ljava/util/Map;Lcom/ibotta/android/features/chains/VariantChainStrategy;)Lcom/ibotta/android/features/selector/RootVariantSelector;

    move-result-object p1

    return-object p1
.end method

.method public createSingleRootVariantSelector(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Lcom/ibotta/android/features/selector/RootVariantSelector;
    .locals 6
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

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 84
    invoke-virtual/range {v0 .. v5}, Lcom/ibotta/android/features/factory/RootVariantSelectorFactoryImpl;->createSingleRootVariantSelector(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;Z)Lcom/ibotta/android/features/selector/RootVariantSelector;

    move-result-object p1

    return-object p1
.end method

.method public createSingleRootVariantSelector(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;Z)Lcom/ibotta/android/features/selector/RootVariantSelector;
    .locals 7
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

    .line 96
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 97
    invoke-interface {v5, p4, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    sget-object v2, Lcom/ibotta/android/features/evaluator/experimental/EmptyRuleEvaluator;->TRUE:Lcom/ibotta/android/features/evaluator/experimental/EmptyRuleEvaluator;

    .line 99
    new-instance v3, Lcom/ibotta/android/features/selector/experimental/SingleVariantSelector;

    invoke-direct {v3, p3, p2, p4, p5}, Lcom/ibotta/android/features/selector/experimental/SingleVariantSelector;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;Z)V

    .line 102
    sget-object v6, Lcom/ibotta/android/features/chains/VariantChainStrategy;->APP_CONFIG_FLAGS_AND_NO_AUDIENCE:Lcom/ibotta/android/features/chains/VariantChainStrategy;

    move-object v0, p0

    move-object v1, p1

    move-object v4, p3

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/features/factory/RootVariantSelectorFactoryImpl;->createRootVariantSelector(Ljava/lang/String;Lcom/ibotta/android/features/evaluator/experimental/ExperimentalRuleEvaluator;Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;Ljava/lang/Class;Ljava/util/Map;Lcom/ibotta/android/features/chains/VariantChainStrategy;)Lcom/ibotta/android/features/selector/RootVariantSelector;

    move-result-object p1

    return-object p1
.end method
