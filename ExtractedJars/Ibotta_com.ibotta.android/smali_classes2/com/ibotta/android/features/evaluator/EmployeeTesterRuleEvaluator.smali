.class public Lcom/ibotta/android/features/evaluator/EmployeeTesterRuleEvaluator;
.super Ljava/lang/Object;
.source "EmployeeTesterRuleEvaluator.java"

# interfaces
.implements Lcom/ibotta/android/features/evaluator/RuleEvaluator;


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

.field private final testName:Ljava/lang/String;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/features/FeatureFlagResponseUtil;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/features/evaluator/EmployeeTesterRuleEvaluator;->testName:Ljava/lang/String;

    .line 19
    iput-object p2, p0, Lcom/ibotta/android/features/evaluator/EmployeeTesterRuleEvaluator;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 20
    iput-object p3, p0, Lcom/ibotta/android/features/evaluator/EmployeeTesterRuleEvaluator;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 21
    iput-object p4, p0, Lcom/ibotta/android/features/evaluator/EmployeeTesterRuleEvaluator;->ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    return-void
.end method


# virtual methods
.method public isRuleAppeased()Z
    .locals 4

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/features/evaluator/EmployeeTesterRuleEvaluator;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getFeatureFlags()Ljava/util/Map;

    move-result-object v0

    .line 30
    iget-object v1, p0, Lcom/ibotta/android/features/evaluator/EmployeeTesterRuleEvaluator;->ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    iget-object v2, p0, Lcom/ibotta/android/features/evaluator/EmployeeTesterRuleEvaluator;->testName:Ljava/lang/String;

    invoke-interface {v1, v0, v2}, Lcom/ibotta/android/features/FeatureFlagResponseUtil;->getFeatureFlagInfoByName(Ljava/util/Map;Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag;

    move-result-object v0

    .line 31
    invoke-virtual {v0}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->getEmployeeVariantName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 32
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 33
    :goto_0
    iget-object v3, p0, Lcom/ibotta/android/features/evaluator/EmployeeTesterRuleEvaluator;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v3}, Lcom/ibotta/android/state/user/UserState;->hasEmployeeTesterRole()Z

    move-result v3

    if-eqz v0, :cond_1

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    return v1
.end method
