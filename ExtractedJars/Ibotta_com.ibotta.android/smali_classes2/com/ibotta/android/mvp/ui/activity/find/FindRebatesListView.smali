.class public Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;
.super Landroid/support/v7/widget/RecyclerView;
.source "FindRebatesListView.java"

# interfaces
.implements Lcom/ibotta/android/views/util/VisibilityListener;


# instance fields
.field private adapter:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field eventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "FindRebatesEventContextProvider"
    .end annotation
.end field

.field private findRebatesTracking:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesTracking;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field protected trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private trackingScrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private visible:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    .line 40
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 44
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 45
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 49
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 50
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->initLayout()V

    return-void
.end method

.method private initAdapter()V
    .locals 1

    .line 75
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method private initLayout()V
    .locals 4

    .line 67
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;)V

    .line 69
    new-instance v0, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 70
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->initAdapter()V

    .line 71
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->initScrollListener()V

    return-void
.end method

.method private initScrollListener()V
    .locals 2

    .line 80
    new-instance v0, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;

    invoke-direct {v0, p0}, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    .line 82
    new-instance v1, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    invoke-direct {v1, v0, p0}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;-><init>(Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;Landroid/view/View;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->trackingScrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->trackingScrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    const-string v1, "Find Rebates"

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setDebugTrackingLabel(Ljava/lang/String;)V

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->trackingScrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->visible:Z

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setEnabled(Z)V

    return-void
.end method

.method private initScrollTracking()V
    .locals 4

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->trackingScrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    if-eqz v1, :cond_0

    .line 89
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesTracking;

    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/find/-$$Lambda$FindRebatesListView$LiAZrIRwlodjrAohY0euVK7AhPo;

    invoke-direct {v2, p0}, Lcom/ibotta/android/mvp/ui/activity/find/-$$Lambda$FindRebatesListView$LiAZrIRwlodjrAohY0euVK7AhPo;-><init>(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;)V

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-direct {v1, v0, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesTracking;-><init>(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;Lcom/ibotta/android/tracking/proprietary/event/EventContributor;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->findRebatesTracking:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesTracking;

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->trackingScrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->findRebatesTracking:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesTracking;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setVisibilityTrackingListener(Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;)V

    :cond_0
    return-void
.end method

.method public static synthetic lambda$initScrollTracking$0(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->eventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/EventContextProvider;->provideContext(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method


# virtual methods
.method public onVisibilityChanged(Z)V
    .locals 2

    .line 97
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->visible:Z

    .line 99
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->trackingScrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    if-eqz v0, :cond_0

    .line 100
    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setEnabled(Z)V

    .line 103
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 104
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;->getItemCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 105
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;->setContainerVisible(Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;)V
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;

    if-eqz v0, :cond_0

    .line 55
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;->setListener(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;)V

    :cond_0
    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;",
            ">;)V"
        }
    .end annotation

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;

    if-eqz v0, :cond_0

    .line 61
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;->setRows(Ljava/util/List;)V

    .line 62
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->initScrollTracking()V

    :cond_0
    return-void
.end method

.method public trackRetailerClicked(Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;Lcom/ibotta/android/apiandroid/content/ContentId;I)V
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->findRebatesTracking:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesTracking;

    if-eqz v0, :cond_0

    .line 118
    invoke-virtual {v0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesTracking;->trackRetailerClicked(Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;Lcom/ibotta/android/apiandroid/content/ContentId;I)V

    :cond_0
    return-void
.end method

.method public trackSubListContentVisible(Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;Lcom/ibotta/android/apiandroid/content/ContentId;I)V
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesListView;->findRebatesTracking:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesTracking;

    if-eqz v0, :cond_0

    .line 112
    invoke-virtual {v0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesTracking;->trackSubListContentVisible(Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;Lcom/ibotta/android/apiandroid/content/ContentId;I)V

    :cond_0
    return-void
.end method
