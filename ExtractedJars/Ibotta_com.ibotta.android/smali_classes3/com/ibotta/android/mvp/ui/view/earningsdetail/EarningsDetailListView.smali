.class public Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailListView;
.super Landroid/support/v7/widget/RecyclerView;
.source "EarningsDetailListView.java"


# instance fields
.field private adapter:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapter;

.field private layoutManager:Landroid/support/v7/widget/LinearLayoutManager;

.field private listener:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    .line 23
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailListView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 27
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 28
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailListView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 32
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 33
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailListView;->initLayout()V

    return-void
.end method

.method private initAdapter()V
    .locals 1

    .line 56
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapter;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapter;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailListView;->adapter:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapter;

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailListView;->adapter:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapter;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailListView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method private initLayout()V
    .locals 0

    .line 46
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailListView;->initLayoutManager()V

    .line 47
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailListView;->initAdapter()V

    return-void
.end method

.method private initLayoutManager()V
    .locals 4

    .line 51
    new-instance v0, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailListView;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailListView;->layoutManager:Landroid/support/v7/widget/LinearLayoutManager;

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailListView;->layoutManager:Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailListView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    return-void
.end method


# virtual methods
.method public setListener(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;)V
    .locals 1

    .line 37
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailListView;->listener:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailListView;->adapter:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapter;->setListener(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;)V

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailRow;",
            ">;)V"
        }
    .end annotation

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailListView;->adapter:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapter;->setRows(Ljava/util/List;)V

    return-void
.end method
