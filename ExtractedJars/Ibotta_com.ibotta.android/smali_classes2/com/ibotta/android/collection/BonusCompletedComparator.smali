.class public Lcom/ibotta/android/collection/BonusCompletedComparator;
.super Lcom/ibotta/android/collection/BonusWeightComparator;
.source "BonusCompletedComparator.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Lcom/ibotta/android/collection/BonusWeightComparator;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/ibotta/api/model/BonusModel;Lcom/ibotta/api/model/BonusModel;)I
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 11
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->isCompleted()Z

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz p2, :cond_1

    .line 12
    invoke-interface {p2}, Lcom/ibotta/api/model/BonusModel;->isCompleted()Z

    move-result v0

    .line 14
    :cond_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/Boolean;->compareTo(Ljava/lang/Boolean;)I

    move-result v0

    if-nez v0, :cond_2

    .line 17
    invoke-super {p0, p1, p2}, Lcom/ibotta/android/collection/BonusWeightComparator;->compare(Lcom/ibotta/api/model/BonusModel;Lcom/ibotta/api/model/BonusModel;)I

    move-result v0

    :cond_2
    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 8
    check-cast p1, Lcom/ibotta/api/model/BonusModel;

    check-cast p2, Lcom/ibotta/api/model/BonusModel;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/collection/BonusCompletedComparator;->compare(Lcom/ibotta/api/model/BonusModel;Lcom/ibotta/api/model/BonusModel;)I

    move-result p1

    return p1
.end method
