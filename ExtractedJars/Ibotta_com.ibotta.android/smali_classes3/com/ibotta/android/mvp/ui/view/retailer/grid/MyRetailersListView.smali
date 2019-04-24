.class public Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;
.super Landroid/support/v7/widget/RecyclerView;
.source "MyRetailersListView.java"

# interfaces
.implements Lcom/ibotta/android/views/util/VisibilityListener;


# static fields
.field private static final SPAN_COUNT:I = 0x3


# instance fields
.field private adapter:Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersAdapter;

.field private myRetailersTracking:Lcom/ibotta/android/mvp/ui/view/retailer/MyRetailersTracking;

.field private scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

.field private visible:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    .line 35
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 39
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 40
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 44
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 45
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->initLayout()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;)Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersAdapter;
    .locals 0

    .line 24
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->adapter:Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersAdapter;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;ILcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersAdapter;I)I
    .locals 0

    .line 24
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->initSpanSize(ILcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersAdapter;I)I

    move-result p0

    return p0
.end method

.method private initAdapter()V
    .locals 1

    .line 87
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersAdapter;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersAdapter;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->adapter:Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersAdapter;

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->adapter:Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersAdapter;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 58
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;)V

    .line 60
    new-instance v0, Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Landroid/support/v7/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 62
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 64
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->initSpanSizeLookup(Landroid/support/v7/widget/GridLayoutManager;)V

    .line 65
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->initSpacingItemDecoration(Landroid/support/v7/widget/GridLayoutManager;)V

    .line 66
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->initAdapter()V

    .line 67
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->initScrollListener()V

    return-void
.end method

.method private initSpacingItemDecoration(Landroid/support/v7/widget/GridLayoutManager;)V
    .locals 2

    .line 80
    invoke-virtual {p1}, Landroid/support/v7/widget/GridLayoutManager;->getSpanCount()I

    move-result p1

    .line 81
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f070165

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 83
    new-instance v1, Lcom/ibotta/android/mvp/ui/view/retailer/grid/GridSpacingItemDecoration;

    invoke-direct {v1, p1, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/GridSpacingItemDecoration;-><init>(II)V

    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    return-void
.end method

.method private initSpanSize(ILcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersAdapter;I)I
    .locals 0

    .line 92
    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;

    move-result-object p1

    .line 95
    instance-of p1, p1, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;

    if-eqz p1, :cond_0

    const/4 p3, 0x1

    :cond_0
    return p3
.end method

.method private initSpanSizeLookup(Landroid/support/v7/widget/GridLayoutManager;)V
    .locals 1

    .line 71
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView$1;-><init>(Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;Landroid/support/v7/widget/GridLayoutManager;)V

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/GridLayoutManager;->setSpanSizeLookup(Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;)V

    return-void
.end method


# virtual methods
.method protected initScrollListener()V
    .locals 2

    .line 105
    new-instance v0, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;

    invoke-direct {v0, p0}, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    .line 106
    new-instance v1, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    invoke-direct {v1, v0, p0}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;-><init>(Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;Landroid/view/View;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    .line 107
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    const-string v1, "My Retailers"

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setDebugTrackingLabel(Ljava/lang/String;)V

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->visible:Z

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setEnabled(Z)V

    return-void
.end method

.method protected initScrollTracking()V
    .locals 2

    .line 112
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/retailer/MyRetailersTracking;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->adapter:Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersAdapter;

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/view/retailer/MyRetailersTracking;-><init>(Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersAdapter;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->myRetailersTracking:Lcom/ibotta/android/mvp/ui/view/retailer/MyRetailersTracking;

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->myRetailersTracking:Lcom/ibotta/android/mvp/ui/view/retailer/MyRetailersTracking;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setVisibilityTrackingListener(Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;)V

    return-void
.end method

.method public onVisibilityChanged(Z)V
    .locals 1

    .line 118
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->visible:Z

    .line 120
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    if-eqz v0, :cond_0

    .line 121
    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setEnabled(Z)V

    :cond_0
    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRecyclerListener;)V
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->adapter:Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersAdapter;->setListener(Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRecyclerListener;)V

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;",
            ">;)V"
        }
    .end annotation

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->adapter:Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersAdapter;->setRows(Ljava/util/List;)V

    .line 54
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->initScrollTracking()V

    return-void
.end method

.method public trackRetailerCardClicked(Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;)V
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->myRetailersTracking:Lcom/ibotta/android/mvp/ui/view/retailer/MyRetailersTracking;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/MyRetailersTracking;->trackRetailerCardClicked(Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;)V

    return-void
.end method
