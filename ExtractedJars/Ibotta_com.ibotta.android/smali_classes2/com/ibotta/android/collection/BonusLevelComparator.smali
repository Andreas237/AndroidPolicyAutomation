.class public Lcom/ibotta/android/collection/BonusLevelComparator;
.super Lcom/ibotta/android/collection/BonusWeightComparator;
.source "BonusLevelComparator.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Lcom/ibotta/android/collection/BonusWeightComparator;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/ibotta/api/model/BonusModel;Lcom/ibotta/api/model/BonusModel;)I
    .locals 3

    const v0, 0x7fffffff

    if-eqz p1, :cond_0

    .line 9
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getLevel()I

    move-result v1

    goto :goto_0

    :cond_0
    const v1, 0x7fffffff

    :goto_0
    if-eqz p2, :cond_1

    .line 10
    invoke-interface {p2}, Lcom/ibotta/api/model/BonusModel;->getLevel()I

    move-result v0

    .line 12
    :cond_1
    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v1}, Ljava/lang/Integer;-><init>(I)V

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    move-result v0

    if-nez v0, :cond_2

    .line 15
    invoke-super {p0, p1, p2}, Lcom/ibotta/android/collection/BonusWeightComparator;->compare(Lcom/ibotta/api/model/BonusModel;Lcom/ibotta/api/model/BonusModel;)I

    move-result v0

    :cond_2
    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 6
    check-cast p1, Lcom/ibotta/api/model/BonusModel;

    check-cast p2, Lcom/ibotta/api/model/BonusModel;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/collection/BonusLevelComparator;->compare(Lcom/ibotta/api/model/BonusModel;Lcom/ibotta/api/model/BonusModel;)I

    move-result p1

    return p1
.end method
