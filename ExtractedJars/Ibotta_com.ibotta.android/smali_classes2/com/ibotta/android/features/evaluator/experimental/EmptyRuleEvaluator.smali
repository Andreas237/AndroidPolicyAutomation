.class public Lcom/ibotta/android/features/evaluator/experimental/EmptyRuleEvaluator;
.super Ljava/lang/Object;
.source "EmptyRuleEvaluator.java"

# interfaces
.implements Lcom/ibotta/android/features/evaluator/RuleEvaluator;
.implements Lcom/ibotta/android/features/evaluator/experimental/ExperimentalRuleEvaluator;


# static fields
.field public static TRUE:Lcom/ibotta/android/features/evaluator/experimental/EmptyRuleEvaluator;


# instance fields
.field private final isRuleAppeased:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 9
    new-instance v0, Lcom/ibotta/android/features/evaluator/experimental/EmptyRuleEvaluator;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/ibotta/android/features/evaluator/experimental/EmptyRuleEvaluator;-><init>(Z)V

    sput-object v0, Lcom/ibotta/android/features/evaluator/experimental/EmptyRuleEvaluator;->TRUE:Lcom/ibotta/android/features/evaluator/experimental/EmptyRuleEvaluator;

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-boolean p1, p0, Lcom/ibotta/android/features/evaluator/experimental/EmptyRuleEvaluator;->isRuleAppeased:Z

    return-void
.end method


# virtual methods
.method public isRuleAppeased()Z
    .locals 1

    .line 22
    iget-boolean v0, p0, Lcom/ibotta/android/features/evaluator/experimental/EmptyRuleEvaluator;->isRuleAppeased:Z

    return v0
.end method
