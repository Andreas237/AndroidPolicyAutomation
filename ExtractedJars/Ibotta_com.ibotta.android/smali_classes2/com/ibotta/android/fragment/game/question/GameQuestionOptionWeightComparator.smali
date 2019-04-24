.class public Lcom/ibotta/android/fragment/game/question/GameQuestionOptionWeightComparator;
.super Ljava/lang/Object;
.source "GameQuestionOptionWeightComparator.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/ibotta/api/model/OptionModel;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/ibotta/api/model/OptionModel;Lcom/ibotta/api/model/OptionModel;)I
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, -0x1

    if-nez p2, :cond_1

    return v0

    .line 19
    :cond_1
    invoke-interface {p1}, Lcom/ibotta/api/model/OptionModel;->getWeight()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {p2}, Lcom/ibotta/api/model/OptionModel;->getWeight()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Float;->compareTo(Ljava/lang/Float;)I

    move-result v1

    mul-int/lit8 v1, v1, -0x1

    if-nez v1, :cond_2

    .line 23
    invoke-interface {p1}, Lcom/ibotta/api/model/OptionModel;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2}, Lcom/ibotta/api/model/OptionModel;->getId()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    move-result v1

    :cond_2
    return v1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 10
    check-cast p1, Lcom/ibotta/api/model/OptionModel;

    check-cast p2, Lcom/ibotta/api/model/OptionModel;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/fragment/game/question/GameQuestionOptionWeightComparator;->compare(Lcom/ibotta/api/model/OptionModel;Lcom/ibotta/api/model/OptionModel;)I

    move-result p1

    return p1
.end method
