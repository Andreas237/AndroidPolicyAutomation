.class public Lcom/ibotta/android/fragment/activity/FriendItemsLifetimeEarningsComparator;
.super Ljava/lang/Object;
.source "FriendItemsLifetimeEarningsComparator.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/ibotta/android/view/model/FriendItem;",
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
.method public compare(Lcom/ibotta/android/view/model/FriendItem;Lcom/ibotta/android/view/model/FriendItem;)I
    .locals 3

    const/4 v0, -0x1

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    if-nez p2, :cond_2

    goto :goto_0

    .line 23
    :cond_2
    invoke-virtual {p1}, Lcom/ibotta/android/view/model/FriendItem;->getFriend()Lcom/ibotta/api/model/friend/Friend;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/friend/Friend;->getTotalEarnings()F

    move-result v1

    .line 24
    invoke-virtual {p2}, Lcom/ibotta/android/view/model/FriendItem;->getFriend()Lcom/ibotta/api/model/friend/Friend;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/api/model/friend/Friend;->getTotalEarnings()F

    move-result v2

    .line 25
    invoke-static {v1, v2}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    mul-int/lit8 v0, v1, -0x1

    :goto_0
    if-nez v0, :cond_3

    .line 29
    invoke-virtual {p1}, Lcom/ibotta/android/view/model/FriendItem;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lcom/ibotta/android/view/model/FriendItem;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    :cond_3
    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 10
    check-cast p1, Lcom/ibotta/android/view/model/FriendItem;

    check-cast p2, Lcom/ibotta/android/view/model/FriendItem;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/fragment/activity/FriendItemsLifetimeEarningsComparator;->compare(Lcom/ibotta/android/view/model/FriendItem;Lcom/ibotta/android/view/model/FriendItem;)I

    move-result p1

    return p1
.end method
