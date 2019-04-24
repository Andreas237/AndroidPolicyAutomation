.class public Lcom/ibotta/android/features/evaluator/UserIdRuleEvaluator;
.super Ljava/lang/Object;
.source "UserIdRuleEvaluator.java"

# interfaces
.implements Lcom/ibotta/android/features/evaluator/RuleEvaluator;


# instance fields
.field private final allowedUserIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final currentCustomerId:I


# direct methods
.method public constructor <init>(ILjava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput p1, p0, Lcom/ibotta/android/features/evaluator/UserIdRuleEvaluator;->currentCustomerId:I

    .line 16
    iput-object p2, p0, Lcom/ibotta/android/features/evaluator/UserIdRuleEvaluator;->allowedUserIds:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public isRuleAppeased()Z
    .locals 2

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/features/evaluator/UserIdRuleEvaluator;->allowedUserIds:Ljava/util/Set;

    iget v1, p0, Lcom/ibotta/android/features/evaluator/UserIdRuleEvaluator;->currentCustomerId:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
