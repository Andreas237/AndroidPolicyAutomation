.class public Lcom/shopkick/app/feed/FilterableAdapter;
.super Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;
.source "FilterableAdapter.java"

# interfaces
.implements Landroid/widget/Filterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/feed/FilterableAdapter$StoreSelectorScreenFilter;
    }
.end annotation


# static fields
.field public static final STORE_SELECTOR_SCREEN_FILTER:I = 0x1


# instance fields
.field private filtered:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation
.end field

.field private theFilter:Landroid/widget/Filter;

.field private unfiltered:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;I)V
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
            ">;I)V"
        }
    .end annotation

    .line 32
    invoke-direct/range {p0 .. p6}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;)V

    .line 34
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/feed/FilterableAdapter;->filtered:Ljava/util/List;

    .line 35
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/feed/FilterableAdapter;->unfiltered:Ljava/util/List;

    const/4 p1, 0x1

    if-eq p7, p1, :cond_0

    const/4 p1, 0x0

    .line 41
    iput-object p1, p0, Lcom/shopkick/app/feed/FilterableAdapter;->theFilter:Landroid/widget/Filter;

    goto :goto_0

    .line 38
    :cond_0
    new-instance p1, Lcom/shopkick/app/feed/FilterableAdapter$StoreSelectorScreenFilter;

    invoke-direct {p1, p0}, Lcom/shopkick/app/feed/FilterableAdapter$StoreSelectorScreenFilter;-><init>(Lcom/shopkick/app/feed/FilterableAdapter;)V

    iput-object p1, p0, Lcom/shopkick/app/feed/FilterableAdapter;->theFilter:Landroid/widget/Filter;

    :goto_0
    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/feed/FilterableAdapter;)Ljava/util/List;
    .locals 0

    .line 18
    iget-object p0, p0, Lcom/shopkick/app/feed/FilterableAdapter;->unfiltered:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/feed/FilterableAdapter;)Ljava/util/List;
    .locals 0

    .line 18
    iget-object p0, p0, Lcom/shopkick/app/feed/FilterableAdapter;->filtered:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$102(Lcom/shopkick/app/feed/FilterableAdapter;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 18
    iput-object p1, p0, Lcom/shopkick/app/feed/FilterableAdapter;->filtered:Ljava/util/List;

    return-object p1
.end method


# virtual methods
.method public addTiles(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;)V"
        }
    .end annotation

    .line 133
    invoke-super {p0, p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addTiles(Ljava/util/List;)V

    .line 134
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 136
    iget-object v1, p0, Lcom/shopkick/app/feed/FilterableAdapter;->unfiltered:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 137
    iget-object v1, p0, Lcom/shopkick/app/feed/FilterableAdapter;->unfiltered:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 138
    iget-object v1, p0, Lcom/shopkick/app/feed/FilterableAdapter;->filtered:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public getFilter()Landroid/widget/Filter;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/shopkick/app/feed/FilterableAdapter;->theFilter:Landroid/widget/Filter;

    return-object v0
.end method

.method public setupForSearch()V
    .locals 3

    .line 47
    iget-object v0, p0, Lcom/shopkick/app/feed/FilterableAdapter;->feedTiles:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v2, -0x2e

    if-ne v0, v2, :cond_0

    .line 48
    iget-object v0, p0, Lcom/shopkick/app/feed/FilterableAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 49
    iget-object v0, p0, Lcom/shopkick/app/feed/FilterableAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    const/4 v0, 0x2

    .line 50
    invoke-virtual {p0, v1, v0}, Lcom/shopkick/app/feed/FilterableAdapter;->notifyItemRangeRemoved(II)V

    :cond_0
    return-void
.end method
