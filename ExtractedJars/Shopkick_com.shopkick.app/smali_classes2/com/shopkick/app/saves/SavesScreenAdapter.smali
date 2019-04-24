.class public Lcom/shopkick/app/saves/SavesScreenAdapter;
.super Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;
.source "SavesScreenAdapter.java"


# instance fields
.field private storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Lcom/shopkick/app/screens/AppScreen;",
            "Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;",
            "Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/logging/IUserEventCoordinator;",
            ">;)V"
        }
    .end annotation

    .line 18
    invoke-direct/range {p0 .. p6}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;)V

    .line 24
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    iput-object p1, p0, Lcom/shopkick/app/saves/SavesScreenAdapter;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    return-void
.end method


# virtual methods
.method public savedCollectionUpdated()V
    .locals 4

    .line 29
    iget-object v0, p0, Lcom/shopkick/app/saves/SavesScreenAdapter;->feedTiles:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    .line 32
    :goto_0
    iget-object v2, p0, Lcom/shopkick/app/saves/SavesScreenAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_3

    .line 33
    iget-object v2, p0, Lcom/shopkick/app/saves/SavesScreenAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 34
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/shopkick/app/saves/SavesScreenAdapter;->storiesDataSource:Lcom/shopkick/app/stories/StoriesDataSource;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->token:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    invoke-virtual {v3, v2, v0}, Lcom/shopkick/app/stories/StoriesDataSource;->getSaveStateForItem(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    move v2, v0

    :goto_1
    if-nez v2, :cond_2

    .line 36
    iget-object v0, p0, Lcom/shopkick/app/saves/SavesScreenAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 37
    invoke-virtual {p0, v1}, Lcom/shopkick/app/saves/SavesScreenAdapter;->notifyItemRemoved(I)V

    goto :goto_2

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 41
    :cond_3
    :goto_2
    iget-object v0, p0, Lcom/shopkick/app/saves/SavesScreenAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_4

    .line 43
    invoke-virtual {p0}, Lcom/shopkick/app/saves/SavesScreenAdapter;->clear()V

    .line 44
    invoke-virtual {p0}, Lcom/shopkick/app/saves/SavesScreenAdapter;->fetchNextPage()V

    .line 45
    invoke-virtual {p0}, Lcom/shopkick/app/saves/SavesScreenAdapter;->notifyDataSetChanged()V

    :cond_4
    return-void
.end method
