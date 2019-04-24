.class public Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;
.super Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;
.source "BrandedLookbookRecyclerView.java"


# instance fields
.field private final FLING_VELOCITY_X_THRESHOLD:I

.field private allowIdleCenter:Z

.field private position:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 10
    iput p1, p0, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;->position:I

    const/16 p1, 0x12c

    .line 11
    iput p1, p0, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;->FLING_VELOCITY_X_THRESHOLD:I

    .line 15
    invoke-direct {p0}, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;->setupFling()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 10
    iput p1, p0, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;->position:I

    const/16 p1, 0x12c

    .line 11
    iput p1, p0, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;->FLING_VELOCITY_X_THRESHOLD:I

    .line 20
    invoke-direct {p0}, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;->setupFling()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 24
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 10
    iput p1, p0, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;->position:I

    const/16 p1, 0x12c

    .line 11
    iput p1, p0, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;->FLING_VELOCITY_X_THRESHOLD:I

    .line 25
    invoke-direct {p0}, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;->setupFling()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;)Z
    .locals 0

    .line 8
    iget-boolean p0, p0, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;->allowIdleCenter:Z

    return p0
.end method

.method static synthetic access$002(Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;Z)Z
    .locals 0

    .line 8
    iput-boolean p1, p0, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;->allowIdleCenter:Z

    return p1
.end method

.method private setupFling()V
    .locals 1

    .line 29
    new-instance v0, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView$1;-><init>(Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;)V

    invoke-virtual {p0, v0}, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;->addOnScrollListener(Landroid/support/v7/widget/RecyclerView$OnScrollListener;)V

    return-void
.end method


# virtual methods
.method public fling(II)Z
    .locals 3

    .line 53
    invoke-virtual {p0}, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object p2

    check-cast p2, Landroid/support/v7/widget/LinearLayoutManager;

    .line 55
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v0

    const/4 v1, 0x1

    const/16 v2, 0x12c

    if-lt v0, v2, :cond_1

    if-lez p1, :cond_0

    .line 58
    iget p1, p0, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;->position:I

    add-int/2addr p1, v1

    invoke-virtual {p2, p1}, Landroid/support/v7/widget/LinearLayoutManager;->findViewByPosition(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 59
    iget p1, p0, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;->position:I

    add-int/2addr p1, v1

    iput p1, p0, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;->position:I

    goto :goto_0

    .line 62
    :cond_0
    iget p1, p0, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;->position:I

    sub-int/2addr p1, v1

    invoke-virtual {p2, p1}, Landroid/support/v7/widget/LinearLayoutManager;->findViewByPosition(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 63
    iget p1, p0, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;->position:I

    sub-int/2addr p1, v1

    iput p1, p0, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;->position:I

    .line 67
    :cond_1
    :goto_0
    iget p1, p0, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;->position:I

    invoke-virtual {p0, p1}, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;->smoothScrollToPosition(I)V

    return v1
.end method
