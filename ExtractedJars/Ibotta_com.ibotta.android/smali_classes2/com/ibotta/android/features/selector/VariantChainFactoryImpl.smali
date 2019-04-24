.class public Lcom/ibotta/android/features/selector/VariantChainFactoryImpl;
.super Ljava/lang/Object;
.source "VariantChainFactoryImpl.java"

# interfaces
.implements Lcom/ibotta/android/features/selector/VariantChainFactory;


# static fields
.field private static final PM_APP_CONFIG:Ljava/lang/String; = "test missing from AppConfig"

.field private static final PM_DEBUG_MENU:Ljava/lang/String; = "debug menu enabled"

.field private static final PM_EMPLOYEE:Ljava/lang/String; = "is an employee tester"

.field private static final PM_KILL_SWITCH:Ljava/lang/String; = "kill switch is on"

.field private static final PM_LD_AUDIENCE:Ljava/lang/String; = "Launch Darkly chose the audience"

.field private static final PM_MIN_VERSION:Ljava/lang/String; = "min version not satisfied"

.field private static final PM_MVT_AUDIENCE:Ljava/lang/String; = "MVT chose the audience"

.field private static final PM_MVT_WINNER:Ljava/lang/String; = "MVT winner enabled"

.field private static final PM_NO_AUDIENCE:Ljava/lang/String; = "no audience allowed. Debugging only"


# instance fields
.field private final ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

.field private final reFactory:Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;

.field private final vsFactory:Lcom/ibotta/android/features/factory/VariantSelectorFactory;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;Lcom/ibotta/android/features/factory/VariantSelectorFactory;Lcom/ibotta/android/features/FeatureFlagResponseUtil;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/ibotta/android/features/selector/VariantChainFactoryImpl;->reFactory:Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;

    .line 38
    iput-object p2, p0, Lcom/ibotta/android/features/selector/VariantChainFactoryImpl;->vsFactory:Lcom/ibotta/android/features/factory/VariantSelectorFactory;

    .line 39
    iput-object p3, p0, Lcom/ibotta/android/features/selector/VariantChainFactoryImpl;->ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    return-void
.end method

.method private createAppConfigAndMvtVariantChain(Ljava/lang/String;Lcom/ibotta/android/features/evaluator/experimental/ExperimentalRuleEvaluator;Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;Ljava/lang/Class;Ljava/lang/String;Ljava/util/Map;)Lcom/ibotta/android/features/chains/VariantChain;
    .locals 16
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
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ExperimentalVariant;",
            ">;>;)",
            "Lcom/ibotta/android/features/chains/VariantChain;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p6

    .line 88
    iget-object v5, v0, Lcom/ibotta/android/features/selector/VariantChainFactoryImpl;->reFactory:Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;

    invoke-virtual {v5, v1}, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->createOpsKillSwitchRuleEvaluator(Ljava/lang/String;)Lcom/ibotta/android/features/evaluator/OpsKillSwitchRuleEvaluator;

    move-result-object v5

    .line 89
    iget-object v6, v0, Lcom/ibotta/android/features/selector/VariantChainFactoryImpl;->reFactory:Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;

    invoke-virtual {v6, v1}, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->createAppConfigRuleEvaluator(Ljava/lang/String;)Lcom/ibotta/android/features/evaluator/experimental/AppConfigRuleEvaluator;

    move-result-object v6

    .line 90
    iget-object v7, v0, Lcom/ibotta/android/features/selector/VariantChainFactoryImpl;->reFactory:Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;

    invoke-virtual {v7, v1}, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->createDebugRuleEvaluator(Ljava/lang/String;)Lcom/ibotta/android/features/evaluator/DebugRuleEvaluator;

    move-result-object v7

    .line 91
    iget-object v8, v0, Lcom/ibotta/android/features/selector/VariantChainFactoryImpl;->reFactory:Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;

    invoke-virtual {v8, v1}, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->createMinVersionRuleEvaluator(Ljava/lang/String;)Lcom/ibotta/android/features/evaluator/MinVersionRuleEvaluator;

    move-result-object v8

    .line 92
    iget-object v9, v0, Lcom/ibotta/android/features/selector/VariantChainFactoryImpl;->reFactory:Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;

    invoke-virtual {v9, v1}, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->createMvtWinnerRuleEvaluator(Ljava/lang/String;)Lcom/ibotta/android/features/evaluator/MvtWinnerRuleEvaluator;

    move-result-object v9

    .line 93
    iget-object v10, v0, Lcom/ibotta/android/features/selector/VariantChainFactoryImpl;->reFactory:Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;

    .line 94
    invoke-virtual {v10, v1}, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->createEmployeeTesterRuleEvaluator(Ljava/lang/String;)Lcom/ibotta/android/features/evaluator/EmployeeTesterRuleEvaluator;

    move-result-object v10

    .line 97
    iget-object v11, v0, Lcom/ibotta/android/features/selector/VariantChainFactoryImpl;->vsFactory:Lcom/ibotta/android/features/factory/VariantSelectorFactory;

    invoke-virtual {v11, v3}, Lcom/ibotta/android/features/factory/VariantSelectorFactory;->createControlVariantSelector(Ljava/lang/Class;)Lcom/ibotta/android/features/selector/VariantSelector;

    move-result-object v11

    .line 98
    iget-object v12, v0, Lcom/ibotta/android/features/selector/VariantChainFactoryImpl;->vsFactory:Lcom/ibotta/android/features/factory/VariantSelectorFactory;

    invoke-virtual {v12, v1, v2}, Lcom/ibotta/android/features/factory/VariantSelectorFactory;->createDebugVariantSelector(Ljava/lang/String;Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;)Lcom/ibotta/android/features/selector/DebugVariantSelector;

    move-result-object v12

    .line 100
    iget-object v13, v0, Lcom/ibotta/android/features/selector/VariantChainFactoryImpl;->vsFactory:Lcom/ibotta/android/features/factory/VariantSelectorFactory;

    invoke-virtual {v13, v1, v3, v4}, Lcom/ibotta/android/features/factory/VariantSelectorFactory;->createMvtWinnerVariantSelector(Ljava/lang/String;Ljava/lang/Class;Ljava/util/Map;)Lcom/ibotta/android/features/selector/MvtWinnerVariantSelector;

    move-result-object v13

    .line 102
    iget-object v14, v0, Lcom/ibotta/android/features/selector/VariantChainFactoryImpl;->vsFactory:Lcom/ibotta/android/features/factory/VariantSelectorFactory;

    iget-object v15, v0, Lcom/ibotta/android/features/selector/VariantChainFactoryImpl;->ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    .line 103
    invoke-virtual {v14, v1, v3, v4, v15}, Lcom/ibotta/android/features/factory/VariantSelectorFactory;->createEmployeeTesterVariantSelector(Ljava/lang/String;Ljava/lang/Class;Ljava/util/Map;Lcom/ibotta/android/features/FeatureFlagResponseUtil;)Lcom/ibotta/android/features/selector/EmployeeTesterVariantSelector;

    move-result-object v3

    .line 105
    new-instance v4, Lcom/ibotta/android/features/chains/VariantChain;

    const-string v14, "kill switch is on"

    invoke-direct {v4, v1, v5, v11, v14}, Lcom/ibotta/android/features/chains/VariantChain;-><init>(Ljava/lang/String;Lcom/ibotta/android/features/evaluator/RuleEvaluator;Lcom/ibotta/android/features/selector/VariantSelector;Ljava/lang/String;)V

    .line 108
    new-instance v5, Lcom/ibotta/android/features/chains/VariantChain;

    const-string v14, "test missing from AppConfig"

    invoke-direct {v5, v1, v6, v11, v14}, Lcom/ibotta/android/features/chains/VariantChain;-><init>(Ljava/lang/String;Lcom/ibotta/android/features/evaluator/RuleEvaluator;Lcom/ibotta/android/features/selector/VariantSelector;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Lcom/ibotta/android/features/chains/VariantChain;->addChain(Lcom/ibotta/android/features/chains/VariantChain;)Lcom/ibotta/android/features/chains/VariantChain;

    move-result-object v5

    new-instance v6, Lcom/ibotta/android/features/chains/VariantChain;

    const-string v14, "debug menu enabled"

    invoke-direct {v6, v1, v7, v12, v14}, Lcom/ibotta/android/features/chains/VariantChain;-><init>(Ljava/lang/String;Lcom/ibotta/android/features/evaluator/RuleEvaluator;Lcom/ibotta/android/features/selector/VariantSelector;Ljava/lang/String;)V

    .line 109
    invoke-virtual {v5, v6}, Lcom/ibotta/android/features/chains/VariantChain;->addChain(Lcom/ibotta/android/features/chains/VariantChain;)Lcom/ibotta/android/features/chains/VariantChain;

    move-result-object v5

    new-instance v6, Lcom/ibotta/android/features/chains/VariantChain;

    const-string v7, "min version not satisfied"

    invoke-direct {v6, v1, v8, v11, v7}, Lcom/ibotta/android/features/chains/VariantChain;-><init>(Ljava/lang/String;Lcom/ibotta/android/features/evaluator/RuleEvaluator;Lcom/ibotta/android/features/selector/VariantSelector;Ljava/lang/String;)V

    .line 110
    invoke-virtual {v5, v6}, Lcom/ibotta/android/features/chains/VariantChain;->addChain(Lcom/ibotta/android/features/chains/VariantChain;)Lcom/ibotta/android/features/chains/VariantChain;

    move-result-object v5

    new-instance v6, Lcom/ibotta/android/features/chains/VariantChain;

    const-string v7, "MVT winner enabled"

    invoke-direct {v6, v1, v9, v13, v7}, Lcom/ibotta/android/features/chains/VariantChain;-><init>(Ljava/lang/String;Lcom/ibotta/android/features/evaluator/RuleEvaluator;Lcom/ibotta/android/features/selector/VariantSelector;Ljava/lang/String;)V

    .line 111
    invoke-virtual {v5, v6}, Lcom/ibotta/android/features/chains/VariantChain;->addChain(Lcom/ibotta/android/features/chains/VariantChain;)Lcom/ibotta/android/features/chains/VariantChain;

    move-result-object v5

    new-instance v6, Lcom/ibotta/android/features/chains/VariantChain;

    const-string v7, "is an employee tester"

    invoke-direct {v6, v1, v10, v3, v7}, Lcom/ibotta/android/features/chains/VariantChain;-><init>(Ljava/lang/String;Lcom/ibotta/android/features/evaluator/RuleEvaluator;Lcom/ibotta/android/features/selector/VariantSelector;Ljava/lang/String;)V

    .line 112
    invoke-virtual {v5, v6}, Lcom/ibotta/android/features/chains/VariantChain;->addChain(Lcom/ibotta/android/features/chains/VariantChain;)Lcom/ibotta/android/features/chains/VariantChain;

    move-result-object v3

    new-instance v5, Lcom/ibotta/android/features/chains/VariantChain;

    move-object/from16 v6, p2

    move-object/from16 v7, p5

    invoke-direct {v5, v1, v6, v2, v7}, Lcom/ibotta/android/features/chains/VariantChain;-><init>(Ljava/lang/String;Lcom/ibotta/android/features/evaluator/RuleEvaluator;Lcom/ibotta/android/features/selector/VariantSelector;Ljava/lang/String;)V

    .line 114
    invoke-virtual {v3, v5}, Lcom/ibotta/android/features/chains/VariantChain;->addChain(Lcom/ibotta/android/features/chains/VariantChain;)Lcom/ibotta/android/features/chains/VariantChain;

    return-object v4
.end method

.method private createLaunchDarklyVariantChain(Ljava/lang/String;Lcom/ibotta/android/features/evaluator/experimental/ExperimentalRuleEvaluator;Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;Ljava/lang/Class;)Lcom/ibotta/android/features/chains/VariantChain;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/features/evaluator/experimental/ExperimentalRuleEvaluator;",
            "Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/features/ControlVariant;",
            ">;)",
            "Lcom/ibotta/android/features/chains/VariantChain;"
        }
    .end annotation

    .line 126
    iget-object p4, p0, Lcom/ibotta/android/features/selector/VariantChainFactoryImpl;->reFactory:Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;

    invoke-virtual {p4, p1}, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->createDebugRuleEvaluator(Ljava/lang/String;)Lcom/ibotta/android/features/evaluator/DebugRuleEvaluator;

    move-result-object p4

    .line 129
    iget-object v0, p0, Lcom/ibotta/android/features/selector/VariantChainFactoryImpl;->vsFactory:Lcom/ibotta/android/features/factory/VariantSelectorFactory;

    invoke-virtual {v0, p1, p3}, Lcom/ibotta/android/features/factory/VariantSelectorFactory;->createDebugVariantSelector(Ljava/lang/String;Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;)Lcom/ibotta/android/features/selector/DebugVariantSelector;

    move-result-object v0

    .line 132
    new-instance v1, Lcom/ibotta/android/features/chains/VariantChain;

    const-string v2, "debug menu enabled"

    invoke-direct {v1, p1, p4, v0, v2}, Lcom/ibotta/android/features/chains/VariantChain;-><init>(Ljava/lang/String;Lcom/ibotta/android/features/evaluator/RuleEvaluator;Lcom/ibotta/android/features/selector/VariantSelector;Ljava/lang/String;)V

    .line 133
    new-instance p4, Lcom/ibotta/android/features/chains/VariantChain;

    const-string v0, "Launch Darkly chose the audience"

    invoke-direct {p4, p1, p2, p3, v0}, Lcom/ibotta/android/features/chains/VariantChain;-><init>(Ljava/lang/String;Lcom/ibotta/android/features/evaluator/RuleEvaluator;Lcom/ibotta/android/features/selector/VariantSelector;Ljava/lang/String;)V

    invoke-virtual {v1, p4}, Lcom/ibotta/android/features/chains/VariantChain;->addChain(Lcom/ibotta/android/features/chains/VariantChain;)Lcom/ibotta/android/features/chains/VariantChain;

    return-object v1
.end method


# virtual methods
.method public createVariantChain(Ljava/lang/String;Lcom/ibotta/android/features/evaluator/experimental/ExperimentalRuleEvaluator;Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;Ljava/lang/Class;Ljava/util/Map;Lcom/ibotta/android/features/chains/VariantChainStrategy;)Lcom/ibotta/android/features/chains/VariantChain;
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
            "Lcom/ibotta/android/features/chains/VariantChain;"
        }
    .end annotation

    .line 50
    sget-object v0, Lcom/ibotta/android/features/selector/VariantChainFactoryImpl$1;->$SwitchMap$com$ibotta$android$features$chains$VariantChainStrategy:[I

    invoke-virtual {p6}, Lcom/ibotta/android/features/chains/VariantChainStrategy;->ordinal()I

    move-result p6

    aget p6, v0, p6

    packed-switch p6, :pswitch_data_0

    const-string v5, "no audience allowed. Debugging only"

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v6, p5

    .line 69
    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/features/selector/VariantChainFactoryImpl;->createAppConfigAndMvtVariantChain(Ljava/lang/String;Lcom/ibotta/android/features/evaluator/experimental/ExperimentalRuleEvaluator;Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;Ljava/lang/Class;Ljava/lang/String;Ljava/util/Map;)Lcom/ibotta/android/features/chains/VariantChain;

    move-result-object p1

    return-object p1

    :pswitch_0
    const-string v5, "MVT chose the audience"

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v6, p5

    .line 59
    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/features/selector/VariantChainFactoryImpl;->createAppConfigAndMvtVariantChain(Ljava/lang/String;Lcom/ibotta/android/features/evaluator/experimental/ExperimentalRuleEvaluator;Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;Ljava/lang/Class;Ljava/lang/String;Ljava/util/Map;)Lcom/ibotta/android/features/chains/VariantChain;

    move-result-object p1

    return-object p1

    .line 52
    :pswitch_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ibotta/android/features/selector/VariantChainFactoryImpl;->createLaunchDarklyVariantChain(Ljava/lang/String;Lcom/ibotta/android/features/evaluator/experimental/ExperimentalRuleEvaluator;Lcom/ibotta/android/features/selector/experimental/ExperimentalVariantSelector;Ljava/lang/Class;)Lcom/ibotta/android/features/chains/VariantChain;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
