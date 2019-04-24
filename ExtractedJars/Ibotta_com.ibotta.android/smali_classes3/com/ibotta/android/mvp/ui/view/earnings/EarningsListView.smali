.class public Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;
.super Landroid/support/v7/widget/RecyclerView;
.source "EarningsListView.java"


# instance fields
.field private adapter:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;

.field private filter:Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;

.field private layoutManager:Landroid/support/v7/widget/LinearLayoutManager;

.field private listener:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsRecyclerListener;

.field private loadingRow:Lcom/ibotta/android/mvp/ui/view/earnings/row/LoadingSpinnerRow;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    .line 32
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 36
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 37
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 41
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 42
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->initLayout()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;I)Z
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->shouldGetLastPosition(I)Z

    move-result p0

    return p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->isLastItemDisplayed()V

    return-void
.end method

.method private initAdapter()V
    .locals 1

    .line 82
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->adapter:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->adapter:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method private initDivider()V
    .locals 3

    .line 71
    new-instance v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0600fa

    .line 72
    invoke-virtual {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->colorResId(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    const v1, 0x7f07015d

    .line 73
    invoke-virtual {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->sizeResId(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    const v1, 0x7f070165

    const v2, 0x7f07015c

    .line 74
    invoke-virtual {v0, v1, v2}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->marginResId(II)Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    move-result-object v0

    .line 75
    invoke-virtual {v0}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->showLastDivider()Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    .line 76
    invoke-virtual {v0}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->build()Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;

    move-result-object v0

    .line 78
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    return-void
.end method

.method private initLayout()V
    .locals 0

    .line 59
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->initLayoutManager()V

    .line 60
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->initDivider()V

    .line 61
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->initAdapter()V

    .line 62
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->initScrollListener()V

    return-void
.end method

.method private initLayoutManager()V
    .locals 4

    .line 66
    new-instance v0, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->layoutManager:Landroid/support/v7/widget/LinearLayoutManager;

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->layoutManager:Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    return-void
.end method

.method private initScrollListener()V
    .locals 1

    .line 87
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView$1;-><init>(Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;)V

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->addOnScrollListener(Landroid/support/v7/widget/RecyclerView$OnScrollListener;)V

    return-void
.end method

.method private isLastItemDisplayed()V
    .locals 2

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->layoutManager:Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    move-result v0

    .line 106
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->adapter:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;->getItemCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-lt v0, v1, :cond_0

    .line 107
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->listener:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsRecyclerListener;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->filter:Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsRecyclerListener;->onLastItemDisplayed(Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;)V

    :cond_0
    return-void
.end method

.method private shouldGetLastPosition(I)Z
    .locals 1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    .line 100
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->listener:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsRecyclerListener;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->adapter:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;->getItemCount()I

    move-result p1

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public hideLoading()V
    .locals 2

    .line 125
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->loadingRow:Lcom/ibotta/android/mvp/ui/view/earnings/row/LoadingSpinnerRow;

    if-nez v0, :cond_0

    return-void

    .line 129
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->adapter:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;->getRows()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->loadingRow:Lcom/ibotta/android/mvp/ui/view/earnings/row/LoadingSpinnerRow;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->adapter:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;->notifyDataSetChanged()V

    const/4 v0, 0x0

    .line 132
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->loadingRow:Lcom/ibotta/android/mvp/ui/view/earnings/row/LoadingSpinnerRow;

    return-void
.end method

.method public setFilter(Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->filter:Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;

    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/earnings/EarningsRecyclerListener;)V
    .locals 1

    .line 46
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->listener:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsRecyclerListener;

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->adapter:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;->setListener(Lcom/ibotta/android/mvp/ui/view/earnings/EarningsRecyclerListener;)V

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/earnings/row/AbstractEarningsRow;",
            ">;)V"
        }
    .end annotation

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->adapter:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;->setRows(Ljava/util/List;)V

    return-void
.end method

.method public showLoading()V
    .locals 2

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->loadingRow:Lcom/ibotta/android/mvp/ui/view/earnings/row/LoadingSpinnerRow;

    if-eqz v0, :cond_0

    return-void

    .line 116
    :cond_0
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/earnings/row/LoadingSpinnerRow;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/earnings/row/LoadingSpinnerRow;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->loadingRow:Lcom/ibotta/android/mvp/ui/view/earnings/row/LoadingSpinnerRow;

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->adapter:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;->getRows()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->loadingRow:Lcom/ibotta/android/mvp/ui/view/earnings/row/LoadingSpinnerRow;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->adapter:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;->notifyDataSetChanged()V

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->adapter:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsAdapter;->getItemCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->scrollToPosition(I)V

    return-void
.end method
