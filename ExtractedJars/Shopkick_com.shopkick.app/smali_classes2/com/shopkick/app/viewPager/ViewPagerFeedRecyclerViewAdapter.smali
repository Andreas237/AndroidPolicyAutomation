.class public Lcom/shopkick/app/viewPager/ViewPagerFeedRecyclerViewAdapter;
.super Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;
.source "ViewPagerFeedRecyclerViewAdapter.java"


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

    .line 27
    invoke-direct/range {p0 .. p6}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;)V

    return-void
.end method


# virtual methods
.method public attachNewRecyclerView(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Lcom/shopkick/app/logging/UserEventLogger;)V
    .locals 1

    .line 32
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/viewPager/ViewPagerFeedRecyclerViewAdapter;->recyclerViewWeakReference:Ljava/lang/ref/WeakReference;

    .line 33
    invoke-virtual {p0}, Lcom/shopkick/app/viewPager/ViewPagerFeedRecyclerViewAdapter;->getUserEventRecyclerViewCoordinator()Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;

    move-result-object v0

    .line 34
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V

    .line 35
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V

    .line 36
    invoke-virtual {p0}, Lcom/shopkick/app/viewPager/ViewPagerFeedRecyclerViewAdapter;->getDividerItemDecoration()Lcom/shopkick/app/view/SKRecyclerView/DividerItemDecoration;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 37
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getItemAnimator()Landroid/support/v7/widget/RecyclerView$ItemAnimator;

    move-result-object p2

    .line 38
    instance-of v0, p2, Landroid/support/v7/widget/SimpleItemAnimator;

    if-eqz v0, :cond_0

    .line 39
    check-cast p2, Landroid/support/v7/widget/SimpleItemAnimator;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/support/v7/widget/SimpleItemAnimator;->setSupportsChangeAnimations(Z)V

    .line 41
    :cond_0
    new-instance p2, Lcom/shopkick/app/controllers/RecyclerViewImageController;

    invoke-direct {p2, p1, p0}, Lcom/shopkick/app/controllers/RecyclerViewImageController;-><init>(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Lcom/shopkick/app/controllers/IRecyclerViewImageControllerCallback;)V

    iput-object p2, p0, Lcom/shopkick/app/viewPager/ViewPagerFeedRecyclerViewAdapter;->recyclerViewImageController:Lcom/shopkick/app/controllers/RecyclerViewImageController;

    return-void
.end method

.method public removeTileAtPosition(I)V
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/shopkick/app/viewPager/ViewPagerFeedRecyclerViewAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 46
    invoke-virtual {p0, p1}, Lcom/shopkick/app/viewPager/ViewPagerFeedRecyclerViewAdapter;->notifyItemRemoved(I)V

    return-void
.end method
