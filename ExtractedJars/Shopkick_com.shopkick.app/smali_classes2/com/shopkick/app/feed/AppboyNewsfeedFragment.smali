.class public Lcom/shopkick/app/feed/AppboyNewsfeedFragment;
.super Landroid/support/v4/app/Fragment;
.source "AppboyNewsfeedFragment.java"

# interfaces
.implements Lcom/appboy/events/IEventSubscriber;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v4/app/Fragment;",
        "Lcom/appboy/events/IEventSubscriber<",
        "Lcom/appboy/events/FeedUpdatedEvent;",
        ">;"
    }
.end annotation


# instance fields
.field private adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

.field private appScreenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation
.end field

.field private recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

.field private screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

.field private screenLoadingSpinner:Landroid/widget/ProgressBar;

.field private shouldRefresh:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 30
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    const/4 v0, 0x1

    .line 40
    iput-boolean v0, p0, Lcom/shopkick/app/feed/AppboyNewsfeedFragment;->shouldRefresh:Z

    return-void
.end method

.method public static synthetic lambda$trigger$72(Lcom/shopkick/app/feed/AppboyNewsfeedFragment;Ljava/util/List;)V
    .locals 2

    .line 117
    iget-object v0, p0, Lcom/shopkick/app/feed/AppboyNewsfeedFragment;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 118
    iget-object v0, p0, Lcom/shopkick/app/feed/AppboyNewsfeedFragment;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    new-instance v1, Lcom/shopkick/app/feed/AppboyNewsfeedDiffCallback;

    invoke-direct {v1}, Lcom/shopkick/app/feed/AppboyNewsfeedDiffCallback;-><init>()V

    invoke-virtual {v0, p1, v1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->updateTilesWithDiffCallback(Ljava/util/List;Lcom/shopkick/app/feed/FeedRecyclerViewAdapterDiffCallback;)V

    return-void
.end method

.method private setupForRecyclerView()V
    .locals 8

    .line 65
    new-instance v5, Ljava/util/HashSet;

    const/16 v0, -0x3b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v5, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 66
    new-instance v7, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    iget-object v1, p0, Lcom/shopkick/app/feed/AppboyNewsfeedFragment;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, p0, Lcom/shopkick/app/feed/AppboyNewsfeedFragment;->appScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/shopkick/app/screens/AppScreen;

    iget-object v4, p0, Lcom/shopkick/app/feed/AppboyNewsfeedFragment;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    const/4 v3, 0x0

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;)V

    iput-object v7, p0, Lcom/shopkick/app/feed/AppboyNewsfeedFragment;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    .line 67
    iget-object v0, p0, Lcom/shopkick/app/feed/AppboyNewsfeedFragment;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->removeDefaultItemDecoration()V

    .line 69
    iget-object v0, p0, Lcom/shopkick/app/feed/AppboyNewsfeedFragment;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/shopkick/app/feed/AppboyNewsfeedFragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 70
    iget-object v0, p0, Lcom/shopkick/app/feed/AppboyNewsfeedFragment;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v1, Lcom/shopkick/app/feed/AppboyNewsfeedRecyclerViewModule;

    iget-object v2, p0, Lcom/shopkick/app/feed/AppboyNewsfeedFragment;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-direct {v1, v2}, Lcom/shopkick/app/feed/AppboyNewsfeedRecyclerViewModule;-><init>(Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V

    .line 71
    iget-object v0, p0, Lcom/shopkick/app/feed/AppboyNewsfeedFragment;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object v1, p0, Lcom/shopkick/app/feed/AppboyNewsfeedFragment;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    return-void
.end method


# virtual methods
.method public init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/shopkick/app/feed/AppboyNewsfeedFragment;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    .line 44
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/feed/AppboyNewsfeedFragment;->appScreenRef:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const/4 p3, 0x0

    const v0, 0x7f0c0023

    .line 49
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const v0, 0x7f09059a

    .line 51
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iput-object v0, p0, Lcom/shopkick/app/feed/AppboyNewsfeedFragment;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    const v0, 0x7f090628

    .line 52
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/shopkick/app/feed/AppboyNewsfeedFragment;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    .line 53
    iget-object v0, p0, Lcom/shopkick/app/feed/AppboyNewsfeedFragment;->screenLoadingSpinner:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 54
    invoke-direct {p0}, Lcom/shopkick/app/feed/AppboyNewsfeedFragment;->setupForRecyclerView()V

    .line 57
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    .line 58
    invoke-static {p2}, Lcom/appboy/Appboy;->getInstance(Landroid/content/Context;)Lcom/appboy/Appboy;

    move-result-object p3

    const-class v0, Lcom/appboy/events/FeedUpdatedEvent;

    invoke-virtual {p3, p0, v0}, Lcom/appboy/Appboy;->removeSingleSubscription(Lcom/appboy/events/IEventSubscriber;Ljava/lang/Class;)V

    .line 59
    invoke-static {p2}, Lcom/appboy/Appboy;->getInstance(Landroid/content/Context;)Lcom/appboy/Appboy;

    move-result-object p2

    invoke-virtual {p2, p0}, Lcom/appboy/Appboy;->subscribeToFeedUpdates(Lcom/appboy/events/IEventSubscriber;)V

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 88
    invoke-virtual {p0}, Lcom/shopkick/app/feed/AppboyNewsfeedFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/appboy/Appboy;->getInstance(Landroid/content/Context;)Lcom/appboy/Appboy;

    move-result-object v0

    const-class v1, Lcom/appboy/events/FeedUpdatedEvent;

    invoke-virtual {v0, p0, v1}, Lcom/appboy/Appboy;->removeSingleSubscription(Lcom/appboy/events/IEventSubscriber;Ljava/lang/Class;)V

    .line 90
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    return-void
.end method

.method public onStart()V
    .locals 1

    .line 76
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStart()V

    .line 78
    iget-boolean v0, p0, Lcom/shopkick/app/feed/AppboyNewsfeedFragment;->shouldRefresh:Z

    if-eqz v0, :cond_0

    .line 80
    invoke-virtual {p0}, Lcom/shopkick/app/feed/AppboyNewsfeedFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/appboy/Appboy;->getInstance(Landroid/content/Context;)Lcom/appboy/Appboy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appboy/Appboy;->requestFeedRefresh()V

    const/4 v0, 0x0

    .line 81
    iput-boolean v0, p0, Lcom/shopkick/app/feed/AppboyNewsfeedFragment;->shouldRefresh:Z

    :cond_0
    return-void
.end method

.method public trigger(Lcom/appboy/events/FeedUpdatedEvent;)V
    .locals 5

    if-nez p1, :cond_0

    return-void

    .line 102
    :cond_0
    invoke-virtual {p1}, Lcom/appboy/events/FeedUpdatedEvent;->getFeedCards()Ljava/util/List;

    move-result-object p1

    .line 103
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 105
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/appboy/models/cards/Card;

    .line 106
    instance-of v2, v1, Lcom/appboy/models/cards/ShortNewsCard;

    if-nez v2, :cond_1

    goto :goto_0

    .line 108
    :cond_1
    check-cast v1, Lcom/appboy/models/cards/ShortNewsCard;

    .line 109
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/16 v3, -0x3b

    .line 110
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 111
    invoke-virtual {v2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v3

    const-string v4, "paramNewsFeedCardObject"

    invoke-virtual {v3, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 116
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/feed/AppboyNewsfeedFragment;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    new-instance v1, Lcom/shopkick/app/feed/-$$Lambda$AppboyNewsfeedFragment$0maUB6tsMLx1fFSoUfxX31gwjjg;

    invoke-direct {v1, p0, v0}, Lcom/shopkick/app/feed/-$$Lambda$AppboyNewsfeedFragment$0maUB6tsMLx1fFSoUfxX31gwjjg;-><init>(Lcom/shopkick/app/feed/AppboyNewsfeedFragment;Ljava/util/List;)V

    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public bridge synthetic trigger(Ljava/lang/Object;)V
    .locals 0

    .line 30
    check-cast p1, Lcom/appboy/events/FeedUpdatedEvent;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/feed/AppboyNewsfeedFragment;->trigger(Lcom/appboy/events/FeedUpdatedEvent;)V

    return-void
.end method
