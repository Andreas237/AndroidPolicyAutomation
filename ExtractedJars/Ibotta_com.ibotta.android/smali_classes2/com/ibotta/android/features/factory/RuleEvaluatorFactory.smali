.class public Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;
.super Ljava/lang/Object;
.source "RuleEvaluatorFactory.java"


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final appSemver:Lcom/ibotta/android/util/AppSemver;

.field private final buildProfile:Lcom/ibotta/android/profile/BuildProfile;

.field private final debugFfStorage:Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

.field private final ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

.field private final mvtTestsHolder:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

.field private final semverFactory:Lcom/ibotta/android/util/SemverFactory;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/features/FeatureFlagResponseUtil;Lcom/ibotta/android/util/AppSemver;Lcom/ibotta/android/util/SemverFactory;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 43
    iput-object p2, p0, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 44
    iput-object p3, p0, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    .line 45
    iput-object p4, p0, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->debugFfStorage:Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

    .line 46
    iput-object p5, p0, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->mvtTestsHolder:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

    .line 47
    iput-object p6, p0, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 48
    iput-object p7, p0, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    .line 49
    iput-object p8, p0, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->appSemver:Lcom/ibotta/android/util/AppSemver;

    .line 50
    iput-object p9, p0, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->semverFactory:Lcom/ibotta/android/util/SemverFactory;

    return-void
.end method


# virtual methods
.method public createAppConfigRuleEvaluator(Ljava/lang/String;)Lcom/ibotta/android/features/evaluator/experimental/AppConfigRuleEvaluator;
    .locals 10

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    sget v1, Lcom/ibotta/android/features/R$string;->feature_flag_app_config_help:I

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 55
    new-instance v0, Lcom/ibotta/android/features/evaluator/experimental/AppConfigRuleEvaluator;

    iget-object v6, p0, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    iget-object v7, p0, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    iget-object v8, p0, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    iget-object v9, p0, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->mvtTestsHolder:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

    move-object v3, v0

    move-object v5, p1

    invoke-direct/range {v3 .. v9}, Lcom/ibotta/android/features/evaluator/experimental/AppConfigRuleEvaluator;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/features/FeatureFlagResponseUtil;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;)V

    return-object v0
.end method

.method public createDebugRuleEvaluator(Ljava/lang/String;)Lcom/ibotta/android/features/evaluator/DebugRuleEvaluator;
    .locals 3

    .line 71
    new-instance v0, Lcom/ibotta/android/features/evaluator/DebugRuleEvaluator;

    iget-object v1, p0, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->debugFfStorage:Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

    iget-object v2, p0, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    invoke-direct {v0, p1, v1, v2}, Lcom/ibotta/android/features/evaluator/DebugRuleEvaluator;-><init>(Ljava/lang/String;Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;Lcom/ibotta/android/profile/BuildProfile;)V

    return-object v0
.end method

.method public createEmployeeTesterRuleEvaluator(Ljava/lang/String;)Lcom/ibotta/android/features/evaluator/EmployeeTesterRuleEvaluator;
    .locals 4

    .line 79
    new-instance v0, Lcom/ibotta/android/features/evaluator/EmployeeTesterRuleEvaluator;

    iget-object v1, p0, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    iget-object v2, p0, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    iget-object v3, p0, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    invoke-direct {v0, p1, v1, v2, v3}, Lcom/ibotta/android/features/evaluator/EmployeeTesterRuleEvaluator;-><init>(Ljava/lang/String;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/features/FeatureFlagResponseUtil;)V

    return-object v0
.end method

.method public createMinVersionRuleEvaluator(Ljava/lang/String;)Lcom/ibotta/android/features/evaluator/MinVersionRuleEvaluator;
    .locals 7

    .line 67
    new-instance v6, Lcom/ibotta/android/features/evaluator/MinVersionRuleEvaluator;

    iget-object v2, p0, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    iget-object v3, p0, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->semverFactory:Lcom/ibotta/android/util/SemverFactory;

    iget-object v0, p0, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->appSemver:Lcom/ibotta/android/util/AppSemver;

    invoke-interface {v0}, Lcom/ibotta/android/util/AppSemver;->getSemver()Lcom/vdurmont/semver4j/Semver;

    move-result-object v4

    iget-object v5, p0, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->mvtTestsHolder:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/features/evaluator/MinVersionRuleEvaluator;-><init>(Ljava/lang/String;Lcom/ibotta/android/features/FeatureFlagResponseUtil;Lcom/ibotta/android/util/SemverFactory;Lcom/vdurmont/semver4j/Semver;Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;)V

    return-object v6
.end method

.method public createMvtRuleEvaluator(Ljava/lang/String;)Lcom/ibotta/android/features/evaluator/experimental/MvtRuleEvaluator;
    .locals 4

    .line 59
    new-instance v0, Lcom/ibotta/android/features/evaluator/experimental/MvtRuleEvaluator;

    iget-object v1, p0, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->mvtTestsHolder:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

    iget-object v2, p0, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    iget-object v3, p0, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    invoke-direct {v0, p1, v1, v2, v3}, Lcom/ibotta/android/features/evaluator/experimental/MvtRuleEvaluator;-><init>(Ljava/lang/String;Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/features/FeatureFlagResponseUtil;)V

    return-object v0
.end method

.method public createMvtWinnerRuleEvaluator(Ljava/lang/String;)Lcom/ibotta/android/features/evaluator/MvtWinnerRuleEvaluator;
    .locals 4

    .line 75
    new-instance v0, Lcom/ibotta/android/features/evaluator/MvtWinnerRuleEvaluator;

    iget-object v1, p0, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    iget-object v3, p0, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    invoke-direct {v0, p1, v1, v2, v3}, Lcom/ibotta/android/features/evaluator/MvtWinnerRuleEvaluator;-><init>(Ljava/lang/String;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/features/FeatureFlagResponseUtil;)V

    return-object v0
.end method

.method public createOpsKillSwitchRuleEvaluator(Ljava/lang/String;)Lcom/ibotta/android/features/evaluator/OpsKillSwitchRuleEvaluator;
    .locals 3

    .line 63
    new-instance v0, Lcom/ibotta/android/features/evaluator/OpsKillSwitchRuleEvaluator;

    iget-object v1, p0, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    iget-object v2, p0, Lcom/ibotta/android/features/factory/RuleEvaluatorFactory;->mvtTestsHolder:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

    invoke-direct {v0, p1, v1, v2}, Lcom/ibotta/android/features/evaluator/OpsKillSwitchRuleEvaluator;-><init>(Ljava/lang/String;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;)V

    return-object v0
.end method
