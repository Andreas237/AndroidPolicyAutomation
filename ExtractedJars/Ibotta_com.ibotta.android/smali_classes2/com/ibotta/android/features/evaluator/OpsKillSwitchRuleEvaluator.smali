.class public Lcom/ibotta/android/features/evaluator/OpsKillSwitchRuleEvaluator;
.super Ljava/lang/Object;
.source "OpsKillSwitchRuleEvaluator.java"

# interfaces
.implements Lcom/ibotta/android/features/evaluator/RuleEvaluator;


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final mvtTestsHolder:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

.field private final testName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/features/evaluator/OpsKillSwitchRuleEvaluator;->testName:Ljava/lang/String;

    .line 22
    iput-object p2, p0, Lcom/ibotta/android/features/evaluator/OpsKillSwitchRuleEvaluator;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 23
    iput-object p3, p0, Lcom/ibotta/android/features/evaluator/OpsKillSwitchRuleEvaluator;->mvtTestsHolder:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

    return-void
.end method


# virtual methods
.method public isRuleAppeased()Z
    .locals 5

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/features/evaluator/OpsKillSwitchRuleEvaluator;->mvtTestsHolder:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;->isFetched()Z

    move-result v0

    .line 35
    iget-object v1, p0, Lcom/ibotta/android/features/evaluator/OpsKillSwitchRuleEvaluator;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/config/AppConfig;->getOpsKillSwitchConfig()Lcom/ibotta/android/state/app/config/ops/OpsKillSwitchConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/state/app/config/ops/OpsKillSwitchConfig;->getKillSwitches()Ljava/util/Map;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_2

    .line 41
    iget-object v4, p0, Lcom/ibotta/android/features/evaluator/OpsKillSwitchRuleEvaluator;->testName:Ljava/lang/String;

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    if-eqz v1, :cond_1

    .line 42
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    if-eqz v0, :cond_3

    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    :goto_2
    return v2
.end method
