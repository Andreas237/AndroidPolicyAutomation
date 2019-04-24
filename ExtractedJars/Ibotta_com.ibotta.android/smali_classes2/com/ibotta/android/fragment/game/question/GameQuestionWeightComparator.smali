.class public Lcom/ibotta/android/fragment/game/question/GameQuestionWeightComparator;
.super Ljava/lang/Object;
.source "GameQuestionWeightComparator.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/ibotta/android/fragment/game/question/GameQuestion;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/ibotta/android/fragment/game/question/GameQuestion;Lcom/ibotta/android/fragment/game/question/GameQuestion;)I
    .locals 4

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, -0x1

    if-nez p2, :cond_1

    return v0

    .line 18
    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/game/question/GameQuestion;->getWeight()Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/game/question/GameQuestion;->getWeight()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    .line 19
    :goto_0
    invoke-virtual {p2}, Lcom/ibotta/android/fragment/game/question/GameQuestion;->getWeight()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {p2}, Lcom/ibotta/android/fragment/game/question/GameQuestion;->getWeight()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 21
    :cond_3
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    move-result v1

    mul-int/lit8 v1, v1, -0x1

    if-nez v1, :cond_4

    .line 25
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/game/question/GameQuestion;->getId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p2}, Lcom/ibotta/android/fragment/game/question/GameQuestion;->getId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Long;->compareTo(Ljava/lang/Long;)I

    move-result v1

    :cond_4
    return v1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 8
    check-cast p1, Lcom/ibotta/android/fragment/game/question/GameQuestion;

    check-cast p2, Lcom/ibotta/android/fragment/game/question/GameQuestion;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/fragment/game/question/GameQuestionWeightComparator;->compare(Lcom/ibotta/android/fragment/game/question/GameQuestion;Lcom/ibotta/android/fragment/game/question/GameQuestion;)I

    move-result p1

    return p1
.end method
