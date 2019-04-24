.class public Lcom/shopkick/app/feed/AppboyNewsfeedDiffCallback;
.super Lcom/shopkick/app/feed/FeedRecyclerViewAdapterDiffCallback;
.source "AppboyNewsfeedDiffCallback.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapterDiffCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public areContentsTheSame(II)Z
    .locals 0

    .line 25
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/feed/AppboyNewsfeedDiffCallback;->areItemsTheSame(II)Z

    move-result p1

    return p1
.end method

.method public areItemsTheSame(II)Z
    .locals 3

    .line 11
    iget-object v0, p0, Lcom/shopkick/app/feed/AppboyNewsfeedDiffCallback;->oldTileList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 12
    iget-object v0, p0, Lcom/shopkick/app/feed/AppboyNewsfeedDiffCallback;->newTileList:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 14
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v0, v2}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v2, -0x3b

    if-ne v0, v2, :cond_2

    .line 16
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object p1

    const-string v0, "paramNewsFeedCardObject"

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/appboy/models/cards/Card;

    .line 17
    invoke-virtual {p2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object p2

    const-string v0, "paramNewsFeedCardObject"

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/appboy/models/cards/Card;

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    .line 18
    invoke-virtual {p1, p2}, Lcom/appboy/models/cards/Card;->isEqualToCard(Lcom/appboy/models/cards/Card;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1

    :cond_2
    return v1

    :cond_3
    :goto_0
    return v1
.end method
