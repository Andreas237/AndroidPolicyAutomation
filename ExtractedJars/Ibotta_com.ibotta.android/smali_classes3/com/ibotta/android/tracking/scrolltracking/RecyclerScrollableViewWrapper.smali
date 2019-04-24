.class public Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;
.super Lcom/ibotta/android/tracking/scrolltracking/AbstractScrollableViewWrapper;
.source "RecyclerScrollableViewWrapper.java"


# instance fields
.field private final layoutManager:Landroid/support/v7/widget/LinearLayoutManager;

.field private final onScrollListener:Landroid/support/v7/widget/RecyclerView$OnScrollListener;

.field private final recyclerView:Landroid/support/v7/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroid/support/v7/widget/RecyclerView;)V
    .locals 1

    .line 19
    invoke-direct {p0, p1}, Lcom/ibotta/android/tracking/scrolltracking/AbstractScrollableViewWrapper;-><init>(Landroid/view/ViewGroup;)V

    .line 21
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    instance-of v0, v0, Landroid/support/v7/widget/LinearLayoutManager;

    if-eqz v0, :cond_0

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    .line 26
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    iput-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;->layoutManager:Landroid/support/v7/widget/LinearLayoutManager;

    .line 28
    new-instance v0, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper$1;-><init>(Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;)V

    iput-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;->onScrollListener:Landroid/support/v7/widget/RecyclerView$OnScrollListener;

    .line 41
    new-instance v0, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper$2;

    invoke-direct {v0, p0}, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper$2;-><init>(Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;)V

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/RecyclerView;->setOnHierarchyChangeListener(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V

    return-void

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Layout manager must be an instance of LinearLayoutManager"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic access$000(Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;I)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;->notifyScrollStateChanged(I)V

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;->notifyDataChanged()V

    return-void
.end method

.method private notifyDataChanged()V
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;->dataSetListener:Lcom/ibotta/android/tracking/scrolltracking/DataSetListener;

    if-eqz v0, :cond_0

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;->dataSetListener:Lcom/ibotta/android/tracking/scrolltracking/DataSetListener;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/scrolltracking/DataSetListener;->onDataChanged()V

    :cond_0
    return-void
.end method

.method private notifyScrollStateChanged(I)V
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;->scrollListener:Lcom/ibotta/android/tracking/scrolltracking/ScrollListener;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    .line 81
    sget-object p1, Lcom/ibotta/android/tracking/scrolltracking/ScrollState;->IDLE:Lcom/ibotta/android/tracking/scrolltracking/ScrollState;

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/ibotta/android/tracking/scrolltracking/ScrollState;->MOVING:Lcom/ibotta/android/tracking/scrolltracking/ScrollState;

    .line 82
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;->scrollListener:Lcom/ibotta/android/tracking/scrolltracking/ScrollListener;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/scrolltracking/ScrollListener;->onScrollStateChanged(Lcom/ibotta/android/tracking/scrolltracking/ScrollState;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public getFirstVisibleViewIndex()I
    .locals 2

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;->layoutManager:Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/LinearLayoutManager;->findViewByPosition(I)Landroid/view/View;

    move-result-object v0

    .line 64
    iget-object v1, p0, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/RecyclerView;->indexOfChild(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public getLastVisibleViewIndex()I
    .locals 2

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;->layoutManager:Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/LinearLayoutManager;->findViewByPosition(I)Landroid/view/View;

    move-result-object v0

    .line 70
    iget-object v1, p0, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/RecyclerView;->indexOfChild(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public getPositionForChildIndex(I)I
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;->layoutManager:Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/LinearLayoutManager;->getPosition(Landroid/view/View;)I

    move-result p1

    return p1
.end method

.method public registerScrollListener(Lcom/ibotta/android/tracking/scrolltracking/ScrollListener;)V
    .locals 1

    .line 56
    invoke-super {p0, p1}, Lcom/ibotta/android/tracking/scrolltracking/AbstractScrollableViewWrapper;->registerScrollListener(Lcom/ibotta/android/tracking/scrolltracking/ScrollListener;)V

    .line 57
    iget-object p1, p0, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;->onScrollListener:Landroid/support/v7/widget/RecyclerView$OnScrollListener;

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/RecyclerView;->removeOnScrollListener(Landroid/support/v7/widget/RecyclerView$OnScrollListener;)V

    .line 58
    iget-object p1, p0, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;->onScrollListener:Landroid/support/v7/widget/RecyclerView$OnScrollListener;

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/RecyclerView;->addOnScrollListener(Landroid/support/v7/widget/RecyclerView$OnScrollListener;)V

    return-void
.end method
