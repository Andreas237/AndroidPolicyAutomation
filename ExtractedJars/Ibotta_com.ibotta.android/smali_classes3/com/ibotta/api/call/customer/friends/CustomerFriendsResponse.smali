.class public Lcom/ibotta/api/call/customer/friends/CustomerFriendsResponse;
.super Lcom/ibotta/api/CacheableApiResponse;
.source "CustomerFriendsResponse.java"


# instance fields
.field private bonus:Lcom/ibotta/api/model/bonus/Bonus;

.field private bonusLevels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/bonus/Bonus;",
            ">;"
        }
    .end annotation
.end field

.field private friendCount:I

.field private friends:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/friend/Friend;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Lcom/ibotta/api/CacheableApiResponse;-><init>()V

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/call/customer/friends/CustomerFriendsResponse;->bonusLevels:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public copy(Lcom/ibotta/api/CacheableApiResponse;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 58
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/api/CacheableApiResponse;->copy(Lcom/ibotta/api/CacheableApiResponse;)V

    .line 59
    instance-of v0, p1, Lcom/ibotta/api/call/customer/friends/CustomerFriendsResponse;

    if-eqz v0, :cond_1

    .line 60
    check-cast p1, Lcom/ibotta/api/call/customer/friends/CustomerFriendsResponse;

    iget v0, p0, Lcom/ibotta/api/call/customer/friends/CustomerFriendsResponse;->friendCount:I

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/customer/friends/CustomerFriendsResponse;->setFriendCount(I)V

    .line 61
    iget-object v0, p0, Lcom/ibotta/api/call/customer/friends/CustomerFriendsResponse;->friends:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/customer/friends/CustomerFriendsResponse;->setFriends(Ljava/util/List;)V

    .line 62
    iget-object v0, p0, Lcom/ibotta/api/call/customer/friends/CustomerFriendsResponse;->bonus:Lcom/ibotta/api/model/bonus/Bonus;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/customer/friends/CustomerFriendsResponse;->setBonus(Lcom/ibotta/api/model/bonus/Bonus;)V

    .line 63
    iget-object v0, p0, Lcom/ibotta/api/call/customer/friends/CustomerFriendsResponse;->bonusLevels:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/customer/friends/CustomerFriendsResponse;->setBonusLevels(Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method public getBonus()Lcom/ibotta/api/model/bonus/Bonus;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/ibotta/api/call/customer/friends/CustomerFriendsResponse;->bonus:Lcom/ibotta/api/model/bonus/Bonus;

    return-object v0
.end method

.method public getBonusLevels()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/bonus/Bonus;",
            ">;"
        }
    .end annotation

    .line 42
    iget-object v0, p0, Lcom/ibotta/api/call/customer/friends/CustomerFriendsResponse;->bonusLevels:Ljava/util/List;

    return-object v0
.end method

.method public getBonusLevelsAsModels()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;"
        }
    .end annotation

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/ibotta/api/call/customer/friends/CustomerFriendsResponse;->bonusLevels:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getFriendCount()I
    .locals 1

    .line 18
    iget v0, p0, Lcom/ibotta/api/call/customer/friends/CustomerFriendsResponse;->friendCount:I

    return v0
.end method

.method public getFriends()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/friend/Friend;",
            ">;"
        }
    .end annotation

    .line 26
    iget-object v0, p0, Lcom/ibotta/api/call/customer/friends/CustomerFriendsResponse;->friends:Ljava/util/List;

    return-object v0
.end method

.method public setBonus(Lcom/ibotta/api/model/bonus/Bonus;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/ibotta/api/call/customer/friends/CustomerFriendsResponse;->bonus:Lcom/ibotta/api/model/bonus/Bonus;

    return-void
.end method

.method public setBonusLevels(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/bonus/Bonus;",
            ">;)V"
        }
    .end annotation

    .line 50
    iput-object p1, p0, Lcom/ibotta/api/call/customer/friends/CustomerFriendsResponse;->bonusLevels:Ljava/util/List;

    return-void
.end method

.method public setFriendCount(I)V
    .locals 0

    .line 22
    iput p1, p0, Lcom/ibotta/api/call/customer/friends/CustomerFriendsResponse;->friendCount:I

    return-void
.end method

.method public setFriends(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/friend/Friend;",
            ">;)V"
        }
    .end annotation

    .line 30
    iput-object p1, p0, Lcom/ibotta/api/call/customer/friends/CustomerFriendsResponse;->friends:Ljava/util/List;

    return-void
.end method
