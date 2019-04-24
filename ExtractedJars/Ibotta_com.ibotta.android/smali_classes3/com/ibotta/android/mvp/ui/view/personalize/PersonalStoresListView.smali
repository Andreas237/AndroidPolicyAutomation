.class public Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;
.super Landroid/support/v7/widget/RecyclerView;
.source "PersonalStoresListView.java"


# static fields
.field private static final SPAN_COUNT:I = 0x3


# instance fields
.field private adapter:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;

.field private personalStoresTracking:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresTracking;

.field private scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

.field protected trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 40
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 44
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 48
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 49
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->initLayout()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;)Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->adapter:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;ILcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;)I
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->initSpanSize(ILcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;)I

    move-result p0

    return p0
.end method

.method private initAdapter()V
    .locals 1

    .line 106
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->adapter:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;

    .line 107
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->adapter:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method private initDivider()V
    .locals 3

    .line 90
    new-instance v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x106000d

    .line 91
    invoke-virtual {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->colorResId(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    const v1, 0x7f07015d

    .line 92
    invoke-virtual {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->sizeResId(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    const v1, 0x7f070165

    const v2, 0x7f07015c

    .line 93
    invoke-virtual {v0, v1, v2}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->marginResId(II)Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView$2;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView$2;-><init>(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;)V

    .line 94
    invoke-virtual {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->visibilityProvider(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$VisibilityProvider;)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    .line 100
    invoke-virtual {v0}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->build()Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;

    move-result-object v0

    .line 102
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 62
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;)V

    .line 63
    new-instance v0, Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Landroid/support/v7/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 64
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 66
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->initSpanSizeLookup(Landroid/support/v7/widget/GridLayoutManager;)V

    .line 67
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->initSpacingItemDecoration(Landroid/support/v7/widget/GridLayoutManager;)V

    .line 68
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->initDivider()V

    .line 69
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->initAdapter()V

    .line 70
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->initScrollListener()V

    return-void
.end method

.method private initSpacingItemDecoration(Landroid/support/v7/widget/GridLayoutManager;)V
    .locals 2

    .line 83
    invoke-virtual {p1}, Landroid/support/v7/widget/GridLayoutManager;->getSpanCount()I

    move-result p1

    .line 84
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f070165

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 86
    new-instance v1, Lcom/ibotta/android/mvp/ui/view/personalize/GridSpacingItemDecoration;

    invoke-direct {v1, p1, v0}, Lcom/ibotta/android/mvp/ui/view/personalize/GridSpacingItemDecoration;-><init>(II)V

    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    return-void
.end method

.method private initSpanSize(ILcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;)I
    .locals 0

    .line 111
    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/view/personalize/row/AbstractPersonalStoreRow;

    move-result-object p1

    .line 114
    instance-of p1, p1, Lcom/ibotta/android/mvp/ui/view/personalize/row/PersonalStoreRow;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x3

    :goto_0
    return p1
.end method

.method private initSpanSizeLookup(Landroid/support/v7/widget/GridLayoutManager;)V
    .locals 1

    .line 74
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView$1;-><init>(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;)V

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/GridLayoutManager;->setSpanSizeLookup(Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;)V

    return-void
.end method


# virtual methods
.method protected initScrollListener()V
    .locals 2

    .line 124
    new-instance v0, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;

    invoke-direct {v0, p0}, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    .line 125
    new-instance v1, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    invoke-direct {v1, v0, p0}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;-><init>(Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;Landroid/view/View;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    const-string v1, "PersonalStores"

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setDebugTrackingLabel(Ljava/lang/String;)V

    return-void
.end method

.method protected initScrollTracking(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;)V
    .locals 3

    .line 130
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresTracking;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->adapter:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-direct {v0, v1, v2, p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresTracking;-><init>(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->personalStoresTracking:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresTracking;

    .line 131
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->personalStoresTracking:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresTracking;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setVisibilityTrackingListener(Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;)V

    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresRecyclerListener;)V
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->adapter:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;->setListener(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresRecyclerListener;)V

    return-void
.end method

.method public setRows(Ljava/util/List;Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/personalize/row/AbstractPersonalStoreRow;",
            ">;",
            "Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;",
            ")V"
        }
    .end annotation

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->adapter:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;->setRows(Ljava/util/List;)V

    .line 58
    invoke-virtual {p0, p2}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->initScrollTracking(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;)V

    return-void
.end method

.method public trackRetailerClick(Lcom/ibotta/android/view/model/PersonalStoresItem;)V
    .locals 1

    .line 135
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresListView;->personalStoresTracking:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresTracking;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresTracking;->trackRetailerClick(Lcom/ibotta/android/view/model/PersonalStoresItem;)V

    return-void
.end method
