.class public Lcom/ibotta/android/features/evaluator/experimental/MvtRuleEvaluator;
.super Ljava/lang/Object;
.source "MvtRuleEvaluator.java"

# interfaces
.implements Lcom/ibotta/android/features/evaluator/RuleEvaluator;
.implements Lcom/ibotta/android/features/evaluator/experimental/ExperimentalRuleEvaluator;


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

.field private final mvtTestsHolder:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

.field private final testName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/features/FeatureFlagResponseUtil;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/features/evaluator/experimental/MvtRuleEvaluator;->testName:Ljava/lang/String;

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/features/evaluator/experimental/MvtRuleEvaluator;->mvtTestsHolder:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

    .line 30
    iput-object p3, p0, Lcom/ibotta/android/features/evaluator/experimental/MvtRuleEvaluator;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 31
    iput-object p4, p0, Lcom/ibotta/android/features/evaluator/experimental/MvtRuleEvaluator;->ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    return-void
.end method

.method static synthetic lambda$isRuleAppeased$0(Ljava/lang/String;Lcom/ibotta/api/model/mvt/TestVariant;)Z
    .locals 0

    .line 49
    invoke-virtual {p1}, Lcom/ibotta/api/model/mvt/TestVariant;->getTestName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public isRuleAppeased()Z
    .locals 5

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/features/evaluator/experimental/MvtRuleEvaluator;->mvtTestsHolder:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;->isFetched()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 45
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/features/evaluator/experimental/MvtRuleEvaluator;->ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    iget-object v2, p0, Lcom/ibotta/android/features/evaluator/experimental/MvtRuleEvaluator;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v2}, Lcom/ibotta/android/state/app/config/AppConfig;->getFeatureFlags()Ljava/util/Map;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/features/evaluator/experimental/MvtRuleEvaluator;->testName:Ljava/lang/String;

    invoke-interface {v0, v2, v3}, Lcom/ibotta/android/features/FeatureFlagResponseUtil;->getFeatureFlagInfoByName(Ljava/util/Map;Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag;

    move-result-object v0

    .line 46
    invoke-virtual {v0}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->getMvtTestName()Ljava/lang/String;

    move-result-object v0

    .line 48
    iget-object v2, p0, Lcom/ibotta/android/features/evaluator/experimental/MvtRuleEvaluator;->mvtTestsHolder:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

    invoke-virtual {v2}, Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;->getTestVariants()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v2

    new-instance v3, Lcom/ibotta/android/features/evaluator/experimental/-$$Lambda$MvtRuleEvaluator$kVslHmEF8R7hn8s-M1TS0t0Daqs;

    invoke-direct {v3, v0}, Lcom/ibotta/android/features/evaluator/experimental/-$$Lambda$MvtRuleEvaluator$kVslHmEF8R7hn8s-M1TS0t0Daqs;-><init>(Ljava/lang/String;)V

    .line 49
    invoke-interface {v2, v3}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object v2

    .line 50
    invoke-interface {v2}, Ljava9/util/stream/Stream;->findFirst()Ljava9/util/Optional;

    move-result-object v2

    .line 52
    invoke-virtual {v2}, Ljava9/util/Optional;->isPresent()Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "Could not find mvtVariantName %s in MVT variants"

    const/4 v4, 0x1

    .line 53
    new-array v4, v4, [Ljava/lang/Object;

    aput-object v0, v4, v1

    invoke-static {v3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    :cond_1
    invoke-virtual {v2}, Ljava9/util/Optional;->isPresent()Z

    move-result v0

    return v0
.end method
