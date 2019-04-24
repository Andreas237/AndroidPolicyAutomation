.class public Lcom/ibotta/android/features/evaluator/MinVersionRuleEvaluator;
.super Ljava/lang/Object;
.source "MinVersionRuleEvaluator.java"

# interfaces
.implements Lcom/ibotta/android/features/evaluator/RuleEvaluator;


# instance fields
.field private final appSemver:Lcom/vdurmont/semver4j/Semver;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

.field private final mvtTestsHolder:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

.field private final semverFactory:Lcom/ibotta/android/util/SemverFactory;

.field private final testName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/ibotta/android/features/FeatureFlagResponseUtil;Lcom/ibotta/android/util/SemverFactory;Lcom/vdurmont/semver4j/Semver;Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;)V
    .locals 0
    .param p4    # Lcom/vdurmont/semver4j/Semver;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/features/evaluator/MinVersionRuleEvaluator;->testName:Ljava/lang/String;

    .line 25
    iput-object p2, p0, Lcom/ibotta/android/features/evaluator/MinVersionRuleEvaluator;->ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    .line 26
    iput-object p3, p0, Lcom/ibotta/android/features/evaluator/MinVersionRuleEvaluator;->semverFactory:Lcom/ibotta/android/util/SemverFactory;

    .line 27
    iput-object p4, p0, Lcom/ibotta/android/features/evaluator/MinVersionRuleEvaluator;->appSemver:Lcom/vdurmont/semver4j/Semver;

    .line 28
    iput-object p5, p0, Lcom/ibotta/android/features/evaluator/MinVersionRuleEvaluator;->mvtTestsHolder:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

    return-void
.end method


# virtual methods
.method public isRuleAppeased()Z
    .locals 5

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/features/evaluator/MinVersionRuleEvaluator;->mvtTestsHolder:Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;->isFetched()Z

    move-result v0

    .line 39
    iget-object v1, p0, Lcom/ibotta/android/features/evaluator/MinVersionRuleEvaluator;->ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    iget-object v2, p0, Lcom/ibotta/android/features/evaluator/MinVersionRuleEvaluator;->testName:Ljava/lang/String;

    const-string v3, ""

    sget-object v4, Lcom/ibotta/android/features/evaluator/-$$Lambda$hqljBmDIkk7TnM9ioCBcXUUqk20;->INSTANCE:Lcom/ibotta/android/features/evaluator/-$$Lambda$hqljBmDIkk7TnM9ioCBcXUUqk20;

    invoke-interface {v1, v2, v3, v4}, Lcom/ibotta/android/features/FeatureFlagResponseUtil;->getFeatureFlagFieldOrDefault(Ljava/lang/String;Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 40
    iget-object v2, p0, Lcom/ibotta/android/features/evaluator/MinVersionRuleEvaluator;->semverFactory:Lcom/ibotta/android/util/SemverFactory;

    invoke-virtual {v2, v1}, Lcom/ibotta/android/util/SemverFactory;->create(Ljava/lang/String;)Lcom/vdurmont/semver4j/Semver;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    .line 41
    iget-object v4, p0, Lcom/ibotta/android/features/evaluator/MinVersionRuleEvaluator;->appSemver:Lcom/vdurmont/semver4j/Semver;

    if-eqz v4, :cond_0

    .line 43
    invoke-virtual {v4, v1}, Lcom/vdurmont/semver4j/Semver;->compareTo(Lcom/vdurmont/semver4j/Semver;)I

    move-result v1

    if-ltz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v0, :cond_1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    return v2
.end method
