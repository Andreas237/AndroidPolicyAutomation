.class public Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;
.super Landroid/support/v7/widget/RecyclerView;
.source "FeaturedListView.java"

# interfaces
.implements Lcom/ibotta/android/views/util/VisibilityListener;


# static fields
.field private static final PERCENTAGE_VISIBLE:D = 0.5


# instance fields
.field private adapter:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;

.field appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field eventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "FeaturedEventContextProvider"
    .end annotation
.end field

.field private featuredTracking:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;

.field hardware:Lcom/ibotta/android/hardware/Hardware;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private layoutManager:Landroid/support/v7/widget/LinearLayoutManager;

.field trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private trackingScrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

.field private visible:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 48
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    .line 49
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 53
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 54
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 58
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 59
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->initLayout()V

    return-void
.end method

.method private initAdapter()V
    .locals 4

    .line 81
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->hardware:Lcom/ibotta/android/hardware/Hardware;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/images/ImageCache;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method private initLayout()V
    .locals 4

    .line 72
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;)V

    .line 74
    new-instance v0, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->layoutManager:Landroid/support/v7/widget/LinearLayoutManager;

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->layoutManager:Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 76
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->initAdapter()V

    .line 77
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->initScrollListener()V

    return-void
.end method

.method private initScrollListener()V
    .locals 4

    .line 86
    new-instance v0, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;

    invoke-direct {v0, p0}, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    .line 88
    new-instance v1, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    invoke-direct {v1, v0, v2, v3, p0}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;-><init>(Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;DLandroid/view/View;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->trackingScrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->trackingScrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    const-string v1, "Featured"

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setDebugTrackingLabel(Ljava/lang/String;)V

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->trackingScrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->visible:Z

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setEnabled(Z)V

    return-void
.end method

.method private initScrollTracking()V
    .locals 4

    .line 94
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->eventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;-><init>(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->featuredTracking:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->trackingScrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->featuredTracking:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setVisibilityTrackingListener(Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;)V

    return-void
.end method


# virtual methods
.method public onVisibilityChanged(Z)V
    .locals 2

    .line 100
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->visible:Z

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->trackingScrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    if-eqz v0, :cond_0

    .line 103
    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setEnabled(Z)V

    .line 106
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 107
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->getItemCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 108
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;->setContainerVisible(Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public resetViewStates()V
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->resetViewStates()V

    return-void
.end method

.method public saveVisibleViewStates()V
    .locals 4

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->layoutManager:Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result v0

    .line 151
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->layoutManager:Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {v1}, Landroid/support/v7/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    move-result v1

    :goto_0
    if-gt v0, v1, :cond_1

    .line 153
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->findViewHolderForAdapterPosition(I)Landroid/support/v7/widget/RecyclerView$ViewHolder;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 155
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;

    invoke-virtual {v3, v0, v2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->saveStateForViewHolder(ILandroid/support/v7/widget/RecyclerView$ViewHolder;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->setListener(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;",
            ">;)V"
        }
    .end annotation

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapter;->setRows(Ljava/util/List;)V

    .line 68
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->initScrollTracking()V

    return-void
.end method

.method public trackClick(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/android/view/model/content/BonusItem;)V
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->featuredTracking:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackClick(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/android/view/model/content/BonusItem;)V

    return-void
.end method

.method public trackClick(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;)V
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->featuredTracking:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackClick(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;)V

    return-void
.end method

.method public trackModuleActionClicked(Lcom/ibotta/api/model/base/Module;)V
    .locals 1

    .line 138
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->featuredTracking:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackModuleActionClicked(Lcom/ibotta/api/model/base/Module;)V

    return-void
.end method

.method public trackModuleTitleMenuClicked(Lcom/ibotta/api/model/base/Module;)V
    .locals 1

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->featuredTracking:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackModuleTitleMenuClicked(Lcom/ibotta/api/model/base/Module;)V

    return-void
.end method

.method public trackQuestClick(Lcom/ibotta/api/model/base/Module;ILjava/lang/String;I)V
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->featuredTracking:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackQuestClick(Lcom/ibotta/api/model/base/Module;ILjava/lang/String;I)V

    return-void
.end method

.method public trackShop(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;)V
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->featuredTracking:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackShop(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;)V

    return-void
.end method

.method public trackSubListContentVisible(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->featuredTracking:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;

    invoke-virtual {v0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackSubListContentVisible(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V

    return-void
.end method

.method public trackUnlock(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;)V
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedListView;->featuredTracking:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedTracking;->trackUnlock(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;)V

    return-void
.end method
