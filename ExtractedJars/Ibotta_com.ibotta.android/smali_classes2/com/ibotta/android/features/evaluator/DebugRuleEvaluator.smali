.class public Lcom/ibotta/android/features/evaluator/DebugRuleEvaluator;
.super Ljava/lang/Object;
.source "DebugRuleEvaluator.java"

# interfaces
.implements Lcom/ibotta/android/features/evaluator/RuleEvaluator;


# instance fields
.field private final buildProfile:Lcom/ibotta/android/profile/BuildProfile;

.field private final storage:Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

.field private final testName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;Lcom/ibotta/android/profile/BuildProfile;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/features/evaluator/DebugRuleEvaluator;->testName:Ljava/lang/String;

    .line 19
    iput-object p2, p0, Lcom/ibotta/android/features/evaluator/DebugRuleEvaluator;->storage:Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

    .line 20
    iput-object p3, p0, Lcom/ibotta/android/features/evaluator/DebugRuleEvaluator;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    return-void
.end method


# virtual methods
.method public isRuleAppeased()Z
    .locals 2

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/features/evaluator/DebugRuleEvaluator;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    invoke-interface {v0}, Lcom/ibotta/android/profile/BuildProfile;->shouldAllowFeatureFlagOverrides()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/features/evaluator/DebugRuleEvaluator;->storage:Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

    iget-object v1, p0, Lcom/ibotta/android/features/evaluator/DebugRuleEvaluator;->testName:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;->getFeatureFlagState(Ljava/lang/String;)Lcom/ibotta/android/features/storage/DebugFeatureFlagState;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 34
    invoke-virtual {v0}, Lcom/ibotta/android/features/storage/DebugFeatureFlagState;->isEnabled()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
