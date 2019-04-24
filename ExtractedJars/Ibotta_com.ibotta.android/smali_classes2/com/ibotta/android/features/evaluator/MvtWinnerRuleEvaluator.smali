.class public Lcom/ibotta/android/features/evaluator/MvtWinnerRuleEvaluator;
.super Ljava/lang/Object;
.source "MvtWinnerRuleEvaluator.java"

# interfaces
.implements Lcom/ibotta/android/features/evaluator/RuleEvaluator;


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

.field private final testName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/features/FeatureFlagResponseUtil;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/features/evaluator/MvtWinnerRuleEvaluator;->testName:Ljava/lang/String;

    .line 17
    iput-object p2, p0, Lcom/ibotta/android/features/evaluator/MvtWinnerRuleEvaluator;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 18
    iput-object p3, p0, Lcom/ibotta/android/features/evaluator/MvtWinnerRuleEvaluator;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 19
    iput-object p4, p0, Lcom/ibotta/android/features/evaluator/MvtWinnerRuleEvaluator;->ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    return-void
.end method

.method private isMvtWinnerDefined()Z
    .locals 3

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/features/evaluator/MvtWinnerRuleEvaluator;->ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    iget-object v1, p0, Lcom/ibotta/android/features/evaluator/MvtWinnerRuleEvaluator;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/config/AppConfig;->getFeatureFlags()Ljava/util/Map;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/features/evaluator/MvtWinnerRuleEvaluator;->testName:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/features/FeatureFlagResponseUtil;->getFeatureFlagInfoByName(Ljava/util/Map;Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag;

    move-result-object v0

    .line 32
    invoke-virtual {v0}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->getWinnerVariantName()Ljava/lang/String;

    move-result-object v0

    .line 34
    iget-object v1, p0, Lcom/ibotta/android/features/evaluator/MvtWinnerRuleEvaluator;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v1, v0}, Lcom/ibotta/android/util/AppHelper;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method


# virtual methods
.method public isRuleAppeased()Z
    .locals 1

    .line 27
    invoke-direct {p0}, Lcom/ibotta/android/features/evaluator/MvtWinnerRuleEvaluator;->isMvtWinnerDefined()Z

    move-result v0

    return v0
.end method
