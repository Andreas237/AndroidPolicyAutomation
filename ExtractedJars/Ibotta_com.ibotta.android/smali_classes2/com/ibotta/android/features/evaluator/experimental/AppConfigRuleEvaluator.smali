.class public Lcom/ibotta/android/features/evaluator/experimental/AppConfigRuleEvaluator;
.super Ljava/lang/Object;
.source "AppConfigRuleEvaluator.java"

# interfaces
.implements Lcom/ibotta/android/features/evaluator/RuleEvaluator;


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final buildProfile:Lcom/ibotta/android/profile/BuildProfile;

.field private final ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

.field private final helpUrl:Ljava/lang/String;

.field private final mvtTestsHolder:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

.field private final testName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/features/FeatureFlagResponseUtil;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/features/evaluator/experimental/AppConfigRuleEvaluator;->helpUrl:Ljava/lang/String;

    .line 28
    iput-object p2, p0, Lcom/ibotta/android/features/evaluator/experimental/AppConfigRuleEvaluator;->testName:Ljava/lang/String;

    .line 29
    iput-object p3, p0, Lcom/ibotta/android/features/evaluator/experimental/AppConfigRuleEvaluator;->ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    .line 30
    iput-object p4, p0, Lcom/ibotta/android/features/evaluator/experimental/AppConfigRuleEvaluator;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    .line 31
    iput-object p5, p0, Lcom/ibotta/android/features/evaluator/experimental/AppConfigRuleEvaluator;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 32
    iput-object p6, p0, Lcom/ibotta/android/features/evaluator/experimental/AppConfigRuleEvaluator;->mvtTestsHolder:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

    return-void
.end method


# virtual methods
.method public isRuleAppeased()Z
    .locals 6

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/features/evaluator/experimental/AppConfigRuleEvaluator;->mvtTestsHolder:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;->isFetched()Z

    move-result v0

    .line 47
    iget-object v1, p0, Lcom/ibotta/android/features/evaluator/experimental/AppConfigRuleEvaluator;->ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    iget-object v2, p0, Lcom/ibotta/android/features/evaluator/experimental/AppConfigRuleEvaluator;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v2}, Lcom/ibotta/android/state/app/config/AppConfig;->getFeatureFlags()Ljava/util/Map;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/features/evaluator/experimental/AppConfigRuleEvaluator;->testName:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lcom/ibotta/android/features/FeatureFlagResponseUtil;->getFeatureFlagInfoByName(Ljava/util/Map;Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag;

    move-result-object v1

    .line 48
    sget-object v2, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->EMPTY:Lcom/ibotta/android/state/app/featureflag/FeatureFlag;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    if-nez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    const-string v1, "Must setup %s in AppConfig for this test to go live, otherwise only control will be selected! See: %s"

    const/4 v4, 0x2

    .line 56
    new-array v4, v4, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/ibotta/android/features/evaluator/experimental/AppConfigRuleEvaluator;->testName:Ljava/lang/String;

    aput-object v5, v4, v3

    iget-object v3, p0, Lcom/ibotta/android/features/evaluator/experimental/AppConfigRuleEvaluator;->helpUrl:Ljava/lang/String;

    aput-object v3, v4, v2

    invoke-static {v1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 57
    new-instance v2, Lcom/ibotta/android/features/evaluator/experimental/AppConfigFeatureFlagException;

    invoke-direct {v2, v1}, Lcom/ibotta/android/features/evaluator/experimental/AppConfigFeatureFlagException;-><init>(Ljava/lang/String;)V

    .line 59
    iget-object v1, p0, Lcom/ibotta/android/features/evaluator/experimental/AppConfigRuleEvaluator;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    invoke-interface {v1}, Lcom/ibotta/android/profile/BuildProfile;->isFeatureFlagInAppConfigMandatory()Z

    move-result v1

    if-nez v1, :cond_1

    .line 62
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    goto :goto_1

    .line 60
    :cond_1
    throw v2

    :cond_2
    :goto_1
    return v0
.end method
