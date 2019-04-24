.class public Lcom/shopkick/app/feed/AppboyNewsfeedRecyclerViewModule;
.super Ljava/lang/Object;
.source "AppboyNewsfeedRecyclerViewModule.java"

# interfaces
.implements Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;


# instance fields
.field private adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

.field private final cardIdImpressions:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;)V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/feed/AppboyNewsfeedRecyclerViewModule;->cardIdImpressions:Ljava/util/Set;

    .line 20
    iput-object p1, p0, Lcom/shopkick/app/feed/AppboyNewsfeedRecyclerViewModule;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    return-void
.end method


# virtual methods
.method public onAttach(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V
    .locals 0

    return-void
.end method

.method public onItemActive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    .line 37
    iget-object p1, p0, Lcom/shopkick/app/feed/AppboyNewsfeedRecyclerViewModule;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p1, p3}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getItem(I)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 38
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 39
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/16 p3, -0x3b

    if-ne p2, p3, :cond_3

    .line 40
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object p2

    const-string p3, "paramNewsFeedCardObject"

    invoke-virtual {p2, p3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object p1

    const-string p2, "paramNewsFeedCardObject"

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/appboy/models/cards/Card;

    .line 44
    iget-object p2, p0, Lcom/shopkick/app/feed/AppboyNewsfeedRecyclerViewModule;->cardIdImpressions:Ljava/util/Set;

    invoke-virtual {p1}, Lcom/appboy/models/cards/Card;->getId()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p2, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 45
    iget-object p2, p0, Lcom/shopkick/app/feed/AppboyNewsfeedRecyclerViewModule;->cardIdImpressions:Ljava/util/Set;

    invoke-virtual {p1}, Lcom/appboy/models/cards/Card;->getId()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p2, p3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 46
    invoke-virtual {p1}, Lcom/appboy/models/cards/Card;->logImpression()Z

    .line 50
    :cond_1
    invoke-virtual {p1}, Lcom/appboy/models/cards/Card;->isRead()Z

    move-result p2

    if-nez p2, :cond_2

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/appboy/models/cards/Card;->setIsRead(Z)V

    :cond_2
    return-void

    :cond_3
    :goto_0
    return-void
.end method

.method public onItemInactive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    return-void
.end method

.method public onScrollStateChanged(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;I)V
    .locals 0

    return-void
.end method

.method public onScrolled(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;II)V
    .locals 0

    return-void
.end method

.method public onViewRecycled(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 0

    return-void
.end method
