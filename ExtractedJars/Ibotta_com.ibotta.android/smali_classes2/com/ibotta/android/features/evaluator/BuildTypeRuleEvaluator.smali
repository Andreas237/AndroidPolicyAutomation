.class public Lcom/ibotta/android/features/evaluator/BuildTypeRuleEvaluator;
.super Ljava/lang/Object;
.source "BuildTypeRuleEvaluator.java"

# interfaces
.implements Lcom/ibotta/android/features/evaluator/RuleEvaluator;


# instance fields
.field private final buildProfile:Lcom/ibotta/android/profile/BuildProfile;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/profile/BuildProfile;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/ibotta/android/features/evaluator/BuildTypeRuleEvaluator;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    return-void
.end method


# virtual methods
.method public isRuleAppeased()Z
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/features/evaluator/BuildTypeRuleEvaluator;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    invoke-interface {v0}, Lcom/ibotta/android/profile/BuildProfile;->shouldAllowFeatureFlagOverrides()Z

    move-result v0

    return v0
.end method
