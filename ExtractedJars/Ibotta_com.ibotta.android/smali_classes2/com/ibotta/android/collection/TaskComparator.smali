.class public Lcom/ibotta/android/collection/TaskComparator;
.super Ljava/lang/Object;
.source "TaskComparator.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/ibotta/api/model/TaskModel;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private getWeight(Lcom/ibotta/api/model/TaskModel;)I
    .locals 1

    .line 54
    instance-of v0, p1, Lcom/ibotta/api/model/RewardModel;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/ibotta/api/model/RewardModel;

    invoke-interface {p1}, Lcom/ibotta/api/model/RewardModel;->getWeight()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 55
    invoke-interface {p1}, Lcom/ibotta/api/model/RewardModel;->getWeight()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public compare(Lcom/ibotta/api/model/TaskModel;Lcom/ibotta/api/model/TaskModel;)I
    .locals 5

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 v1, -0x1

    if-nez p2, :cond_1

    return v1

    .line 24
    :cond_1
    invoke-interface {p1}, Lcom/ibotta/api/model/TaskModel;->getLinkedOfferIds()Ljava/util/Set;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    invoke-interface {p1}, Lcom/ibotta/api/model/TaskModel;->getLinkedOfferIds()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    .line 25
    :goto_0
    invoke-interface {p2}, Lcom/ibotta/api/model/TaskModel;->getLinkedOfferIds()Ljava/util/Set;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-interface {p2}, Lcom/ibotta/api/model/TaskModel;->getLinkedOfferIds()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_3

    const/4 v4, 0x1

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    :goto_1
    if-eqz v2, :cond_4

    if-eqz v4, :cond_4

    goto :goto_2

    :cond_4
    if-eqz v2, :cond_5

    const/4 v3, 0x1

    goto :goto_2

    :cond_5
    if-eqz v4, :cond_6

    const/4 v3, -0x1

    :cond_6
    :goto_2
    if-nez v3, :cond_7

    .line 37
    invoke-direct {p0, p1}, Lcom/ibotta/android/collection/TaskComparator;->getWeight(Lcom/ibotta/api/model/TaskModel;)I

    move-result v0

    .line 38
    invoke-direct {p0, p2}, Lcom/ibotta/android/collection/TaskComparator;->getWeight(Lcom/ibotta/api/model/TaskModel;)I

    move-result v2

    .line 40
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    move-result v0

    mul-int/lit8 v3, v0, -0x1

    :cond_7
    if-nez v3, :cond_8

    .line 45
    invoke-interface {p1}, Lcom/ibotta/api/model/TaskModel;->getRewardId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {p2}, Lcom/ibotta/api/model/TaskModel;->getRewardId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Long;->compareTo(Ljava/lang/Long;)I

    move-result v3

    :cond_8
    return v3
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 13
    check-cast p1, Lcom/ibotta/api/model/TaskModel;

    check-cast p2, Lcom/ibotta/api/model/TaskModel;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/collection/TaskComparator;->compare(Lcom/ibotta/api/model/TaskModel;Lcom/ibotta/api/model/TaskModel;)I

    move-result p1

    return p1
.end method
