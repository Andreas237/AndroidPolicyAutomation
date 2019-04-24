.class public Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView;
.super Landroid/support/v7/widget/RecyclerView;
.source "WithdrawListView.java"


# instance fields
.field private adapter:Lcom/ibotta/android/mvp/ui/activity/account/withdraw/WithdrawAdapter;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    .line 27
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 31
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 32
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 36
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 37
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView;->initLayout()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView;)Lcom/ibotta/android/mvp/ui/activity/account/withdraw/WithdrawAdapter;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/account/withdraw/WithdrawAdapter;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView;ILcom/ibotta/android/mvp/ui/activity/account/withdraw/WithdrawAdapter;I)I
    .locals 0

    .line 22
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView;->initSpanSize(ILcom/ibotta/android/mvp/ui/activity/account/withdraw/WithdrawAdapter;I)I

    move-result p0

    return p0
.end method

.method private initAdapter()V
    .locals 1

    .line 69
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/account/withdraw/WithdrawAdapter;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/account/withdraw/WithdrawAdapter;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/account/withdraw/WithdrawAdapter;

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/account/withdraw/WithdrawAdapter;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 49
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView;->initSpanCount()I

    move-result v0

    .line 50
    new-instance v1, Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Landroid/support/v7/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 52
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView$1;

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView$1;-><init>(Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView;Landroid/support/v7/widget/GridLayoutManager;)V

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/GridLayoutManager;->setSpanSizeLookup(Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;)V

    .line 59
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 60
    invoke-virtual {v1}, Landroid/support/v7/widget/GridLayoutManager;->getSpanCount()I

    move-result v0

    .line 61
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/App;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070165

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 63
    new-instance v2, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GridSpacingItemDecoration;

    invoke-direct {v2, v0, v1}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GridSpacingItemDecoration;-><init>(II)V

    invoke-virtual {p0, v2}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 65
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView;->initAdapter()V

    return-void
.end method

.method private initSpanCount()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method private initSpanSize(ILcom/ibotta/android/mvp/ui/activity/account/withdraw/WithdrawAdapter;I)I
    .locals 5

    .line 79
    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/account/withdraw/WithdrawAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/activity/account/withdraw/row/AbstractWithdrawRow;

    move-result-object p1

    .line 80
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/account/withdraw/row/AbstractWithdrawRow;->getTypeEnum()Lcom/ibotta/android/mvp/ui/activity/account/withdraw/row/WithdrawRowType;

    move-result-object p2

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/account/withdraw/row/WithdrawRowType;->EMPTY:Lcom/ibotta/android/mvp/ui/activity/account/withdraw/row/WithdrawRowType;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p2, v0, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 81
    :goto_0
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/account/withdraw/row/AbstractWithdrawRow;->getTypeEnum()Lcom/ibotta/android/mvp/ui/activity/account/withdraw/row/WithdrawRowType;

    move-result-object v0

    sget-object v3, Lcom/ibotta/android/mvp/ui/activity/account/withdraw/row/WithdrawRowType;->TITLE:Lcom/ibotta/android/mvp/ui/activity/account/withdraw/row/WithdrawRowType;

    if-ne v0, v3, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    .line 82
    :goto_1
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/account/withdraw/row/AbstractWithdrawRow;->getTypeEnum()Lcom/ibotta/android/mvp/ui/activity/account/withdraw/row/WithdrawRowType;

    move-result-object v3

    sget-object v4, Lcom/ibotta/android/mvp/ui/activity/account/withdraw/row/WithdrawRowType;->CASH:Lcom/ibotta/android/mvp/ui/activity/account/withdraw/row/WithdrawRowType;

    if-ne v3, v4, :cond_2

    const/4 v1, 0x1

    .line 83
    :cond_2
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/account/withdraw/row/AbstractWithdrawRow;->getTypeEnum()Lcom/ibotta/android/mvp/ui/activity/account/withdraw/row/WithdrawRowType;

    move-result-object p1

    sget-object v3, Lcom/ibotta/android/mvp/ui/activity/account/withdraw/row/WithdrawRowType;->GIFT_CARD:Lcom/ibotta/android/mvp/ui/activity/account/withdraw/row/WithdrawRowType;

    if-nez p2, :cond_4

    if-nez v0, :cond_4

    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    const/4 p3, 0x1

    :cond_4
    :goto_2
    return p3
.end method


# virtual methods
.method public setListener(Lcom/ibotta/android/mvp/ui/activity/account/withdraw/WithdrawAdapterListener;)V
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/account/withdraw/WithdrawAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/account/withdraw/WithdrawAdapter;->setListener(Lcom/ibotta/android/mvp/ui/activity/account/withdraw/WithdrawAdapterListener;)V

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/account/withdraw/row/AbstractWithdrawRow;",
            ">;)V"
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/account/withdraw/WithdrawAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/account/withdraw/WithdrawAdapter;->setRows(Ljava/util/List;)V

    return-void
.end method
