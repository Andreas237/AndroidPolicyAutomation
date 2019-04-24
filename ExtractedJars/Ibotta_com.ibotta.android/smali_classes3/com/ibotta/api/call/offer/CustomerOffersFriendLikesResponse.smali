.class public Lcom/ibotta/api/call/offer/CustomerOffersFriendLikesResponse;
.super Lcom/ibotta/api/CacheableApiResponse;
.source "CustomerOffersFriendLikesResponse.java"


# instance fields
.field private friends:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/api/model/friend/Friend;",
            ">;"
        }
    .end annotation
.end field

.field private offers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Lcom/ibotta/api/CacheableApiResponse;-><init>()V

    .line 13
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOffersFriendLikesResponse;->friends:Ljava/util/Map;

    .line 14
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOffersFriendLikesResponse;->offers:Ljava/util/Map;

    return-void
.end method

.method public static findFriendsForOffer(Lcom/ibotta/api/call/offer/CustomerOffersFriendLikesResponse;I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/call/offer/CustomerOffersFriendLikesResponse;",
            "I)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/friend/Friend;",
            ">;"
        }
    .end annotation

    .line 45
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-nez p0, :cond_0

    return-object v0

    .line 50
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/api/call/offer/CustomerOffersFriendLikesResponse;->getFriends()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lcom/ibotta/api/call/offer/CustomerOffersFriendLikesResponse;->getOffers()Ljava/util/Map;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_1

    .line 54
    :cond_1
    invoke-virtual {p0}, Lcom/ibotta/api/call/offer/CustomerOffersFriendLikesResponse;->getOffers()Ljava/util/Map;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/HashSet;

    if-eqz p1, :cond_3

    .line 56
    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 57
    invoke-virtual {p0}, Lcom/ibotta/api/call/offer/CustomerOffersFriendLikesResponse;->getFriends()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/friend/Friend;

    if-eqz v1, :cond_2

    .line 59
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v0

    :cond_4
    :goto_1
    return-object v0
.end method


# virtual methods
.method public copy(Lcom/ibotta/api/CacheableApiResponse;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 37
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/api/CacheableApiResponse;->copy(Lcom/ibotta/api/CacheableApiResponse;)V

    .line 38
    instance-of v0, p1, Lcom/ibotta/api/call/offer/CustomerOffersFriendLikesResponse;

    if-eqz v0, :cond_1

    .line 39
    check-cast p1, Lcom/ibotta/api/call/offer/CustomerOffersFriendLikesResponse;

    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOffersFriendLikesResponse;->friends:Ljava/util/Map;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/offer/CustomerOffersFriendLikesResponse;->setFriends(Ljava/util/Map;)V

    .line 40
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOffersFriendLikesResponse;->offers:Ljava/util/Map;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/offer/CustomerOffersFriendLikesResponse;->setOffers(Ljava/util/Map;)V

    :cond_1
    return-void
.end method

.method public getFriends()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/api/model/friend/Friend;",
            ">;"
        }
    .end annotation

    .line 17
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOffersFriendLikesResponse;->friends:Ljava/util/Map;

    return-object v0
.end method

.method public getOffers()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOffersFriendLikesResponse;->offers:Ljava/util/Map;

    return-object v0
.end method

.method public setFriends(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/api/model/friend/Friend;",
            ">;)V"
        }
    .end annotation

    .line 21
    iput-object p1, p0, Lcom/ibotta/api/call/offer/CustomerOffersFriendLikesResponse;->friends:Ljava/util/Map;

    return-void
.end method

.method public setOffers(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;>;)V"
        }
    .end annotation

    .line 29
    iput-object p1, p0, Lcom/ibotta/api/call/offer/CustomerOffersFriendLikesResponse;->offers:Ljava/util/Map;

    return-void
.end method
