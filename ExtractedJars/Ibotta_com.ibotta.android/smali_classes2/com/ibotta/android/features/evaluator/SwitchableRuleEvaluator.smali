.class public Lcom/ibotta/android/features/evaluator/SwitchableRuleEvaluator;
.super Ljava/lang/Object;
.source "SwitchableRuleEvaluator.java"

# interfaces
.implements Lcom/ibotta/android/features/evaluator/RuleEvaluator;


# instance fields
.field private final switchStatesMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final testName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/Map;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/features/evaluator/SwitchableRuleEvaluator;->switchStatesMap:Ljava/util/Map;

    .line 17
    iput-object p2, p0, Lcom/ibotta/android/features/evaluator/SwitchableRuleEvaluator;->testName:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public isRuleAppeased()Z
    .locals 2

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/features/evaluator/SwitchableRuleEvaluator;->switchStatesMap:Ljava/util/Map;

    iget-object v1, p0, Lcom/ibotta/android/features/evaluator/SwitchableRuleEvaluator;->testName:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    .line 26
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
