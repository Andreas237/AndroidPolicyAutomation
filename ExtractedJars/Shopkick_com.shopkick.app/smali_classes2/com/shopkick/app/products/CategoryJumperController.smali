.class public Lcom/shopkick/app/products/CategoryJumperController;
.super Landroid/support/v7/widget/RecyclerView$AdapterDataObserver;
.source "CategoryJumperController.java"

# interfaces
.implements Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private JUMP_CATEGORY_HEIGHT_DP:F

.field private MIN_JUMP_HEADER_CATEGORIES:I

.field private MIN_JUMP_HEADER_SCANS:I

.field private appScreen:Lcom/shopkick/app/screens/AppScreen;

.field private areShowingJumpHeader:Z

.field private categoryJumpHeader:Landroid/view/View;

.field private categoryJumpList:Landroid/widget/ListView;

.field private categoryJumpListIsShowing:Z

.field private categoryListToggleListener:Landroid/view/View$OnClickListener;

.field private containerPosition:I

.field private contentTileTypes:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private didImpressionLog:Z

.field private dismissFooter:Landroid/view/View;

.field private dummyHeight:I

.field private dummyPosition:I

.field private isDisable:Z

.field private jumpCapableAdapter:Lcom/shopkick/app/products/JumpCapableAdapter;

.field private jumpHeaderContainer:Landroid/view/View;

.field private minIndex:I

.field private pickerHeight:I

.field private scanCategoryJumpAdapter:Lcom/shopkick/app/products/ScanCategoryJumpAdapter;

.field private scanRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

.field private stickyHeaderDummy:Landroid/view/ViewGroup;

.field private stickyHeaderRendererConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

.field private stickyHeaderViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

.field private storedHeaderTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private topSpacingItemDecoration:Lcom/shopkick/app/view/SKRecyclerView/TopSpacingItemDecoration;

.field private triedToAddFooter:Z

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/url/URLDispatcher;Landroid/view/View;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V
    .locals 6

    .line 119
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$AdapterDataObserver;-><init>()V

    const/4 v0, 0x3

    .line 51
    iput v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->MIN_JUMP_HEADER_CATEGORIES:I

    const/4 v1, 0x6

    .line 52
    iput v1, p0, Lcom/shopkick/app/products/CategoryJumperController;->MIN_JUMP_HEADER_SCANS:I

    const/high16 v1, 0x42480000    # 50.0f

    .line 54
    iput v1, p0, Lcom/shopkick/app/products/CategoryJumperController;->JUMP_CATEGORY_HEIGHT_DP:F

    const/4 v1, 0x0

    .line 82
    iput v1, p0, Lcom/shopkick/app/products/CategoryJumperController;->containerPosition:I

    .line 83
    iput v1, p0, Lcom/shopkick/app/products/CategoryJumperController;->dummyPosition:I

    .line 84
    iput v1, p0, Lcom/shopkick/app/products/CategoryJumperController;->pickerHeight:I

    .line 85
    iput v1, p0, Lcom/shopkick/app/products/CategoryJumperController;->dummyHeight:I

    .line 88
    iput v1, p0, Lcom/shopkick/app/products/CategoryJumperController;->minIndex:I

    .line 91
    new-instance v2, Ljava/util/HashSet;

    new-array v0, v0, [Ljava/lang/Integer;

    const/16 v3, 0x17

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v1

    const/16 v3, 0x32

    .line 92
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v0, v4

    const/16 v3, 0x2c

    .line 93
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v5, 0x2

    aput-object v3, v0, v5

    .line 91
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v2, p0, Lcom/shopkick/app/products/CategoryJumperController;->contentTileTypes:Ljava/util/HashSet;

    .line 120
    iput-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->appScreen:Lcom/shopkick/app/screens/AppScreen;

    .line 121
    iput-object p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 123
    iput-object p4, p0, Lcom/shopkick/app/products/CategoryJumperController;->scanRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 124
    invoke-virtual {p4}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getAdapter()Landroid/support/v7/widget/RecyclerView$Adapter;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/products/JumpCapableAdapter;

    iput-object p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->jumpCapableAdapter:Lcom/shopkick/app/products/JumpCapableAdapter;

    .line 125
    iput-boolean v1, p0, Lcom/shopkick/app/products/CategoryJumperController;->isDisable:Z

    const p2, 0x7f0900d5

    .line 127
    invoke-virtual {p3, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ListView;

    iput-object p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->categoryJumpList:Landroid/widget/ListView;

    const p2, 0x7f090364

    .line 128
    invoke-virtual {p3, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->categoryJumpHeader:Landroid/view/View;

    const p2, 0x7f090363

    .line 129
    invoke-virtual {p3, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->jumpHeaderContainer:Landroid/view/View;

    const p2, 0x7f0906de

    .line 130
    invoke-virtual {p3, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/view/ViewGroup;

    iput-object p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->stickyHeaderDummy:Landroid/view/ViewGroup;

    .line 132
    new-instance p2, Lcom/shopkick/app/view/SKRecyclerView/TopSpacingItemDecoration;

    iget p4, p0, Lcom/shopkick/app/products/CategoryJumperController;->JUMP_CATEGORY_HEIGHT_DP:F

    float-to-int p4, p4

    invoke-direct {p2, p4}, Lcom/shopkick/app/view/SKRecyclerView/TopSpacingItemDecoration;-><init>(I)V

    iput-object p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->topSpacingItemDecoration:Lcom/shopkick/app/view/SKRecyclerView/TopSpacingItemDecoration;

    .line 133
    iget p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->JUMP_CATEGORY_HEIGHT_DP:F

    float-to-int p2, p2

    invoke-static {p2, p3}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result p2

    iput p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->pickerHeight:I

    .line 135
    iget-object p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->scanRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {p2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object p2

    instance-of p2, p2, Landroid/support/v7/widget/StaggeredGridLayoutManager;

    if-eqz p2, :cond_0

    .line 136
    new-instance p2, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingStaggeredGridLayoutManager;

    invoke-direct {p2, v5, v4}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingStaggeredGridLayoutManager;-><init>(II)V

    .line 138
    iget-object p3, p0, Lcom/shopkick/app/products/CategoryJumperController;->scanRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {p3, p2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    goto :goto_0

    .line 140
    :cond_0
    new-instance p2, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;

    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p2, p3}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 141
    invoke-virtual {p2, v4}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 142
    iget-object p3, p0, Lcom/shopkick/app/products/CategoryJumperController;->scanRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {p3, p2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 146
    :goto_0
    iget-object p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->scanRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {p2, p0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V

    .line 149
    iget-object p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->jumpCapableAdapter:Lcom/shopkick/app/products/JumpCapableAdapter;

    invoke-interface {p2, p0}, Lcom/shopkick/app/products/JumpCapableAdapter;->registerAdapterDataObserver(Landroid/support/v7/widget/RecyclerView$AdapterDataObserver;)V

    .line 152
    new-instance p2, Lcom/shopkick/app/products/ScanCategoryJumpAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p2, p3, p1, p0}, Lcom/shopkick/app/products/ScanCategoryJumpAdapter;-><init>(Landroid/content/Context;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/products/CategoryJumperController;)V

    iput-object p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->scanCategoryJumpAdapter:Lcom/shopkick/app/products/ScanCategoryJumpAdapter;

    .line 153
    iget-object p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->categoryJumpList:Landroid/widget/ListView;

    iget-object p3, p0, Lcom/shopkick/app/products/CategoryJumperController;->scanCategoryJumpAdapter:Lcom/shopkick/app/products/ScanCategoryJumpAdapter;

    invoke-virtual {p2, p3}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 156
    new-instance p2, Lcom/shopkick/app/products/CategoryJumperController$1;

    invoke-direct {p2, p0}, Lcom/shopkick/app/products/CategoryJumperController$1;-><init>(Lcom/shopkick/app/products/CategoryJumperController;)V

    iput-object p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->categoryListToggleListener:Landroid/view/View$OnClickListener;

    .line 177
    iget-object p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->categoryJumpHeader:Landroid/view/View;

    iget-object p3, p0, Lcom/shopkick/app/products/CategoryJumperController;->categoryListToggleListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 179
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 p3, 0x8f

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 p4, 0x4

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-direct {p2, p3, p4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 181
    new-instance p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {p3}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 182
    new-instance p4, Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p4, v0}, Lcom/shopkick/app/logging/UserEventRecyclerViewCoordinator;-><init>(Ljava/lang/String;)V

    iput-object p4, p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    .line 183
    iput-boolean v4, p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 185
    iget-object p4, p0, Lcom/shopkick/app/products/CategoryJumperController;->categoryJumpHeader:Landroid/view/View;

    instance-of v0, p4, Lcom/shopkick/app/logging/IUserEventView;

    if-eqz v0, :cond_1

    .line 186
    check-cast p4, Lcom/shopkick/app/logging/IUserEventView;

    .line 187
    iget-object p1, p1, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-interface {p4, p2, p1, p3}, Lcom/shopkick/app/logging/IUserEventView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    :cond_1
    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/products/CategoryJumperController;)Z
    .locals 0

    .line 49
    iget-boolean p0, p0, Lcom/shopkick/app/products/CategoryJumperController;->categoryJumpListIsShowing:Z

    return p0
.end method

.method static synthetic access$002(Lcom/shopkick/app/products/CategoryJumperController;Z)Z
    .locals 0

    .line 49
    iput-boolean p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->categoryJumpListIsShowing:Z

    return p1
.end method

.method static synthetic access$100(Lcom/shopkick/app/products/CategoryJumperController;)Landroid/widget/ListView;
    .locals 0

    .line 49
    iget-object p0, p0, Lcom/shopkick/app/products/CategoryJumperController;->categoryJumpList:Landroid/widget/ListView;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/products/CategoryJumperController;)Z
    .locals 0

    .line 49
    iget-boolean p0, p0, Lcom/shopkick/app/products/CategoryJumperController;->triedToAddFooter:Z

    return p0
.end method

.method static synthetic access$202(Lcom/shopkick/app/products/CategoryJumperController;Z)Z
    .locals 0

    .line 49
    iput-boolean p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->triedToAddFooter:Z

    return p1
.end method

.method static synthetic access$300(Lcom/shopkick/app/products/CategoryJumperController;)Lcom/shopkick/app/screens/AppScreen;
    .locals 0

    .line 49
    iget-object p0, p0, Lcom/shopkick/app/products/CategoryJumperController;->appScreen:Lcom/shopkick/app/screens/AppScreen;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/products/CategoryJumperController;Landroid/view/LayoutInflater;)V
    .locals 0

    .line 49
    invoke-direct {p0, p1}, Lcom/shopkick/app/products/CategoryJumperController;->maybeAddCategoryJumpFooter(Landroid/view/LayoutInflater;)V

    return-void
.end method

.method static synthetic access$502(Lcom/shopkick/app/products/CategoryJumperController;I)I
    .locals 0

    .line 49
    iput p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->pickerHeight:I

    return p1
.end method

.method static synthetic access$600(Lcom/shopkick/app/products/CategoryJumperController;)Landroid/view/View;
    .locals 0

    .line 49
    iget-object p0, p0, Lcom/shopkick/app/products/CategoryJumperController;->categoryJumpHeader:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$702(Lcom/shopkick/app/products/CategoryJumperController;I)I
    .locals 0

    .line 49
    iput p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->dummyHeight:I

    return p1
.end method

.method static synthetic access$800(Lcom/shopkick/app/products/CategoryJumperController;)Landroid/view/ViewGroup;
    .locals 0

    .line 49
    iget-object p0, p0, Lcom/shopkick/app/products/CategoryJumperController;->stickyHeaderDummy:Landroid/view/ViewGroup;

    return-object p0
.end method

.method private getNextHeaderTileScrollPosition(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)I
    .locals 7

    .line 524
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getAdapter()Landroid/support/v7/widget/RecyclerView$Adapter;

    move-result-object v0

    .line 525
    instance-of v1, v0, Lcom/shopkick/app/products/JumpCapableAdapter;

    const/high16 v2, -0x80000000

    if-nez v1, :cond_0

    return v2

    .line 527
    :cond_0
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findFirstVisibleItemPosition()I

    move-result v1

    .line 528
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findLastVisibleItemPosition()I

    move-result v3

    .line 529
    check-cast v0, Lcom/shopkick/app/products/JumpCapableAdapter;

    .line 530
    new-instance v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v4}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    move v5, v1

    :goto_0
    if-gt v5, v3, :cond_2

    .line 533
    invoke-interface {v0, v5}, Lcom/shopkick/app/products/JumpCapableAdapter;->getItemViewType(I)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    iput-object v6, v4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 534
    invoke-interface {v0, v4}, Lcom/shopkick/app/products/JumpCapableAdapter;->isHeaderTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v6

    if-eqz v6, :cond_1

    sub-int/2addr v5, v1

    .line 535
    invoke-virtual {p1, v5}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getY()F

    move-result p1

    float-to-int p1, p1

    return p1

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    return v2
.end method

.method private getYForHeaderDummy()F
    .locals 2

    .line 370
    iget-object v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->stickyHeaderDummy:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 371
    iget-object v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->stickyHeaderDummy:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 372
    iget v1, p0, Lcom/shopkick/app/products/CategoryJumperController;->dummyPosition:I

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    sub-int/2addr v1, v0

    int-to-float v0, v1

    return v0

    .line 374
    :cond_0
    iget v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->dummyPosition:I

    int-to-float v0, v0

    return v0
.end method

.method private isTrue(Ljava/lang/Boolean;)Z
    .locals 0

    if-eqz p1, :cond_0

    .line 305
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private maybeAddCategoryJumpFooter(Landroid/view/LayoutInflater;)V
    .locals 4

    .line 192
    iget-object v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->appScreen:Lcom/shopkick/app/screens/AppScreen;

    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 193
    iget-object v1, p0, Lcom/shopkick/app/products/CategoryJumperController;->categoryJumpList:Landroid/widget/ListView;

    invoke-virtual {v1}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    .line 194
    invoke-interface {v1}, Landroid/widget/ListAdapter;->getCount()I

    move-result v1

    .line 196
    iget v2, p0, Lcom/shopkick/app/products/CategoryJumperController;->JUMP_CATEGORY_HEIGHT_DP:F

    mul-float/2addr v2, v0

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    mul-int/2addr v2, v1

    .line 197
    iget v1, p0, Lcom/shopkick/app/products/CategoryJumperController;->JUMP_CATEGORY_HEIGHT_DP:F

    mul-float/2addr v1, v0

    float-to-double v0, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    add-int/2addr v2, v0

    .line 199
    iget-object v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->categoryJumpList:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    sub-int/2addr v0, v2

    if-lez v0, :cond_0

    const v1, 0x7f0c010c

    .line 204
    iget-object v2, p0, Lcom/shopkick/app/products/CategoryJumperController;->categoryJumpList:Landroid/widget/ListView;

    const/4 v3, 0x0

    invoke-virtual {p1, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->dismissFooter:Landroid/view/View;

    .line 206
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->dismissFooter:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    .line 207
    iput v0, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 208
    iget-object v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->dismissFooter:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 209
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->dismissFooter:Landroid/view/View;

    iget-object v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->categoryListToggleListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 210
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->categoryJumpList:Landroid/widget/ListView;

    iget-object v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->dismissFooter:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;)V

    .line 213
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->categoryJumpList:Landroid/widget/ListView;

    iget-object v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->scanCategoryJumpAdapter:Lcom/shopkick/app/products/ScanCategoryJumpAdapter;

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    :cond_0
    return-void
.end method

.method private updateContainerLayout()V
    .locals 2

    .line 585
    iget-object v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->stickyHeaderDummy:Landroid/view/ViewGroup;

    new-instance v1, Lcom/shopkick/app/products/CategoryJumperController$2;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/CategoryJumperController$2;-><init>(Lcom/shopkick/app/products/CategoryJumperController;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private updateStickyHeaderTitle(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V
    .locals 4

    .line 544
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getAdapter()Landroid/support/v7/widget/RecyclerView$Adapter;

    move-result-object v0

    .line 545
    instance-of v1, v0, Lcom/shopkick/app/products/JumpCapableAdapter;

    if-nez v1, :cond_0

    return-void

    .line 547
    :cond_0
    check-cast v0, Lcom/shopkick/app/products/JumpCapableAdapter;

    .line 550
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findFirstVisibleItemPosition()I

    move-result v1

    .line 553
    invoke-interface {v0, v1}, Lcom/shopkick/app/products/JumpCapableAdapter;->getCategoryTileForPosition(I)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v1

    if-nez v1, :cond_1

    .line 557
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->stickyHeaderDummy:Landroid/view/ViewGroup;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void

    .line 563
    :cond_1
    iget-object v2, p0, Lcom/shopkick/app/products/CategoryJumperController;->storedHeaderTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz v2, :cond_2

    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    iget-object v3, p0, Lcom/shopkick/app/products/CategoryJumperController;->storedHeaderTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lcom/shopkick/app/products/CategoryJumperController;->stickyHeaderRendererConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    if-nez v2, :cond_3

    .line 565
    :cond_2
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v0, v2}, Lcom/shopkick/app/products/JumpCapableAdapter;->getConfigurator(I)Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->stickyHeaderRendererConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    .line 566
    iput-object v1, p0, Lcom/shopkick/app/products/CategoryJumperController;->storedHeaderTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 569
    iget-object v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->stickyHeaderDummy:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViewsInLayout()V

    .line 570
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "layout_inflater"

    .line 571
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/LayoutInflater;

    .line 572
    iget-object v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->stickyHeaderRendererConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    invoke-virtual {v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;->getLayout()I

    move-result v0

    iget-object v2, p0, Lcom/shopkick/app/products/CategoryJumperController;->stickyHeaderDummy:Landroid/view/ViewGroup;

    const/4 v3, 0x1

    invoke-virtual {p1, v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 573
    new-instance p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    iget-object v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->stickyHeaderDummy:Landroid/view/ViewGroup;

    invoke-direct {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->stickyHeaderViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    .line 574
    invoke-direct {p0}, Lcom/shopkick/app/products/CategoryJumperController;->updateContainerLayout()V

    .line 577
    :cond_3
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->stickyHeaderRendererConfigurator:Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;

    if-eqz p1, :cond_4

    iget-object v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->stickyHeaderViewHolder:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    if-eqz v0, :cond_4

    .line 578
    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;->onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 579
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->stickyHeaderDummy:Landroid/view/ViewGroup;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_4
    return-void
.end method


# virtual methods
.method public disableJumperHeader(Ljava/lang/Boolean;)V
    .locals 0

    .line 309
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->isDisable:Z

    return-void
.end method

.method public dispatchUrl(Ljava/lang/String;)V
    .locals 2

    .line 313
    iget-object v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->categoryJumpList:Landroid/widget/ListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    const/4 v0, 0x0

    .line 314
    iput-boolean v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->categoryJumpListIsShowing:Z

    .line 316
    iget-object v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 317
    iget-object v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    :cond_0
    return-void
.end method

.method public isShowingController()Z
    .locals 1

    .line 97
    iget-boolean v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->areShowingJumpHeader:Z

    return v0
.end method

.method public onAttach(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V
    .locals 0

    return-void
.end method

.method public onChanged()V
    .locals 1

    .line 336
    iget-object v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->jumpCapableAdapter:Lcom/shopkick/app/products/JumpCapableAdapter;

    invoke-interface {v0}, Lcom/shopkick/app/products/JumpCapableAdapter;->getFilteredTiles()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/shopkick/app/products/CategoryJumperController;->setupJumpHeader(Ljava/util/List;)V

    return-void
.end method

.method public onItemActive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    return-void
.end method

.method public onItemInactive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    return-void
.end method

.method public onItemRangeChanged(II)V
    .locals 0

    .line 341
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->jumpCapableAdapter:Lcom/shopkick/app/products/JumpCapableAdapter;

    invoke-interface {p1}, Lcom/shopkick/app/products/JumpCapableAdapter;->getFilteredTiles()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/products/CategoryJumperController;->setupJumpHeader(Ljava/util/List;)V

    return-void
.end method

.method public onItemRangeChanged(IILjava/lang/Object;)V
    .locals 0

    .line 346
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->jumpCapableAdapter:Lcom/shopkick/app/products/JumpCapableAdapter;

    invoke-interface {p1}, Lcom/shopkick/app/products/JumpCapableAdapter;->getFilteredTiles()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/products/CategoryJumperController;->setupJumpHeader(Ljava/util/List;)V

    return-void
.end method

.method public onItemRangeInserted(II)V
    .locals 0

    .line 351
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->jumpCapableAdapter:Lcom/shopkick/app/products/JumpCapableAdapter;

    invoke-interface {p1}, Lcom/shopkick/app/products/JumpCapableAdapter;->getFilteredTiles()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/products/CategoryJumperController;->setupJumpHeader(Ljava/util/List;)V

    return-void
.end method

.method public onItemRangeMoved(III)V
    .locals 0

    .line 361
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->jumpCapableAdapter:Lcom/shopkick/app/products/JumpCapableAdapter;

    invoke-interface {p1}, Lcom/shopkick/app/products/JumpCapableAdapter;->getFilteredTiles()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/products/CategoryJumperController;->setupJumpHeader(Ljava/util/List;)V

    return-void
.end method

.method public onItemRangeRemoved(II)V
    .locals 0

    .line 356
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->jumpCapableAdapter:Lcom/shopkick/app/products/JumpCapableAdapter;

    invoke-interface {p1}, Lcom/shopkick/app/products/JumpCapableAdapter;->getFilteredTiles()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/products/CategoryJumperController;->setupJumpHeader(Ljava/util/List;)V

    return-void
.end method

.method public onScrollStateChanged(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;I)V
    .locals 3

    .line 474
    iget-boolean v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->areShowingJumpHeader:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p2, :cond_4

    .line 480
    iget p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->containerPosition:I

    neg-int v0, p2

    iget v1, p0, Lcom/shopkick/app/products/CategoryJumperController;->pickerHeight:I

    if-eq v0, v1, :cond_3

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    add-int/2addr p2, v1

    .line 485
    div-int/lit8 v0, v1, 0x2

    const/4 v2, 0x0

    if-lt p2, v0, :cond_2

    .line 490
    iput v2, p0, Lcom/shopkick/app/products/CategoryJumperController;->containerPosition:I

    sub-int/2addr p2, v1

    goto :goto_0

    :cond_2
    neg-int v0, v1

    .line 496
    iput v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->containerPosition:I

    .line 499
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->jumpHeaderContainer:Landroid/view/View;

    iget v1, p0, Lcom/shopkick/app/products/CategoryJumperController;->containerPosition:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setY(F)V

    .line 500
    iget-object v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->jumpHeaderContainer:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 503
    invoke-virtual {p1, v2, p2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->scrollBy(II)V

    goto :goto_2

    :cond_3
    :goto_1
    return-void

    :cond_4
    :goto_2
    return-void
.end method

.method public onScrolled(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;II)V
    .locals 5

    .line 389
    iget p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->minIndex:I

    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findViewHolderForAdapterPosition(I)Landroid/support/v7/widget/RecyclerView$ViewHolder;

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    .line 391
    iget-object p2, p2, Landroid/support/v7/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 392
    iput v0, p2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 397
    :cond_0
    iget p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->minIndex:I

    const/16 v1, 0x8

    if-lez p2, :cond_1

    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findFirstVisibleItemPosition()I

    move-result p2

    iget v2, p0, Lcom/shopkick/app/products/CategoryJumperController;->minIndex:I

    if-ge p2, v2, :cond_1

    .line 398
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->jumpHeaderContainer:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 402
    :cond_1
    iget p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->minIndex:I

    if-lez p2, :cond_2

    iget-boolean p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->categoryJumpListIsShowing:Z

    if-eqz p2, :cond_2

    .line 403
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->jumpHeaderContainer:Landroid/view/View;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setY(F)V

    .line 404
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->jumpHeaderContainer:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 406
    :cond_2
    iget p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->minIndex:I

    if-lez p2, :cond_3

    iget-object p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->jumpHeaderContainer:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    move-result p2

    if-ne p2, v1, :cond_3

    .line 407
    iget-object p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->jumpHeaderContainer:Landroid/view/View;

    iget v1, p0, Lcom/shopkick/app/products/CategoryJumperController;->pickerHeight:I

    neg-int v1, v1

    int-to-float v1, v1

    invoke-virtual {p2, v1}, Landroid/view/View;->setY(F)V

    .line 408
    iget-object p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->jumpHeaderContainer:Landroid/view/View;

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 411
    :cond_3
    iget-boolean p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->areShowingJumpHeader:Z

    if-nez p2, :cond_4

    return-void

    .line 415
    :cond_4
    invoke-direct {p0, p1}, Lcom/shopkick/app/products/CategoryJumperController;->getNextHeaderTileScrollPosition(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)I

    move-result p2

    if-lez p3, :cond_7

    .line 419
    invoke-direct {p0, p1}, Lcom/shopkick/app/products/CategoryJumperController;->updateStickyHeaderTitle(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V

    .line 421
    iget v1, p0, Lcom/shopkick/app/products/CategoryJumperController;->containerPosition:I

    iget v2, p0, Lcom/shopkick/app/products/CategoryJumperController;->pickerHeight:I

    neg-int v3, v2

    if-ne v1, v3, :cond_6

    if-lez p2, :cond_5

    .line 423
    iget v1, p0, Lcom/shopkick/app/products/CategoryJumperController;->dummyHeight:I

    if-gt p2, v1, :cond_5

    sub-int/2addr v1, p2

    neg-int p2, v1

    add-int/2addr p2, v2

    .line 424
    iput p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->dummyPosition:I

    goto :goto_0

    .line 426
    :cond_5
    iget p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->pickerHeight:I

    iput p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->dummyPosition:I

    .line 428
    :goto_0
    iget-object p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->stickyHeaderDummy:Landroid/view/ViewGroup;

    invoke-direct {p0}, Lcom/shopkick/app/products/CategoryJumperController;->getYForHeaderDummy()F

    move-result v1

    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->setY(F)V

    goto :goto_1

    :cond_6
    neg-int p2, v2

    .line 433
    iget-object v1, p0, Lcom/shopkick/app/products/CategoryJumperController;->jumpHeaderContainer:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getY()F

    move-result v1

    float-to-int v1, v1

    sub-int/2addr v1, p3

    invoke-static {p2, v1}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    iput p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->containerPosition:I

    .line 435
    iget-object p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->jumpHeaderContainer:Landroid/view/View;

    iget v1, p0, Lcom/shopkick/app/products/CategoryJumperController;->containerPosition:I

    int-to-float v1, v1

    invoke-virtual {p2, v1}, Landroid/view/View;->setY(F)V

    :cond_7
    :goto_1
    if-gez p3, :cond_a

    .line 441
    invoke-direct {p0, p1}, Lcom/shopkick/app/products/CategoryJumperController;->getNextHeaderTileScrollPosition(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)I

    move-result p2

    .line 442
    iget v1, p0, Lcom/shopkick/app/products/CategoryJumperController;->containerPosition:I

    iget v2, p0, Lcom/shopkick/app/products/CategoryJumperController;->pickerHeight:I

    add-int v3, v1, v2

    iget v4, p0, Lcom/shopkick/app/products/CategoryJumperController;->dummyHeight:I

    add-int/2addr v3, v4

    add-int v4, v1, v2

    if-gt p2, v4, :cond_8

    neg-int p1, v2

    sub-int/2addr v1, p3

    .line 446
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->containerPosition:I

    .line 447
    iget p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->pickerHeight:I

    iput p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->dummyPosition:I

    .line 449
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->jumpHeaderContainer:Landroid/view/View;

    iget p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->containerPosition:I

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setY(F)V

    .line 450
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->stickyHeaderDummy:Landroid/view/ViewGroup;

    invoke-direct {p0}, Lcom/shopkick/app/products/CategoryJumperController;->getYForHeaderDummy()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setY(F)V

    goto :goto_2

    :cond_8
    if-ge p2, v3, :cond_9

    .line 455
    invoke-direct {p0, p1}, Lcom/shopkick/app/products/CategoryJumperController;->updateStickyHeaderTitle(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V

    .line 456
    iget p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->dummyHeight:I

    sub-int/2addr p2, p1

    iget p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->containerPosition:I

    sub-int/2addr p2, p1

    iput p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->dummyPosition:I

    .line 458
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->stickyHeaderDummy:Landroid/view/ViewGroup;

    invoke-direct {p0}, Lcom/shopkick/app/products/CategoryJumperController;->getYForHeaderDummy()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setY(F)V

    goto :goto_2

    .line 461
    :cond_9
    invoke-direct {p0, p1}, Lcom/shopkick/app/products/CategoryJumperController;->updateStickyHeaderTitle(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V

    .line 462
    iget p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->pickerHeight:I

    neg-int p1, p1

    iget p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->containerPosition:I

    sub-int/2addr p2, p3

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->containerPosition:I

    .line 463
    iget p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->pickerHeight:I

    iput p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->dummyPosition:I

    .line 465
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->jumpHeaderContainer:Landroid/view/View;

    iget p2, p0, Lcom/shopkick/app/products/CategoryJumperController;->containerPosition:I

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setY(F)V

    .line 466
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->stickyHeaderDummy:Landroid/view/ViewGroup;

    invoke-direct {p0}, Lcom/shopkick/app/products/CategoryJumperController;->getYForHeaderDummy()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setY(F)V

    :cond_a
    :goto_2
    return-void
.end method

.method public onViewRecycled(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 0

    return-void
.end method

.method public scrollToPosition(I)V
    .locals 2

    .line 322
    iget-object v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->categoryJumpList:Landroid/widget/ListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    const/4 v0, 0x0

    .line 323
    iput-boolean v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->categoryJumpListIsShowing:Z

    .line 326
    iget-object v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->scanRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    add-int/lit8 v1, p1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    move p1, v1

    .line 327
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->scanRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->smoothScrollToPosition(I)V

    return-void
.end method

.method public setHeaderSkLinkEnabled(Z)V
    .locals 1

    .line 222
    iget-object v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->scanCategoryJumpAdapter:Lcom/shopkick/app/products/ScanCategoryJumpAdapter;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/products/ScanCategoryJumpAdapter;->setHeaderSkLinkEnabled(Z)V

    return-void
.end method

.method public setMinIndex(I)V
    .locals 0

    .line 218
    iput p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->minIndex:I

    return-void
.end method

.method public setupJumpHeader(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;)V"
        }
    .end annotation

    .line 226
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 230
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x1

    move v3, v1

    move v5, v3

    move v4, v2

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 231
    iget-object v7, p0, Lcom/shopkick/app/products/CategoryJumperController;->jumpCapableAdapter:Lcom/shopkick/app/products/JumpCapableAdapter;

    invoke-interface {v7, v6}, Lcom/shopkick/app/products/JumpCapableAdapter;->isHeaderTile(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 232
    new-instance v4, Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;

    iget-object v7, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    iget-object v8, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productHierarchyId:Ljava/lang/String;

    invoke-direct {v4, p0, v7, v8, v3}, Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;-><init>(Lcom/shopkick/app/products/CategoryJumperController;Ljava/lang/String;Ljava/lang/String;I)V

    .line 233
    iget-object v7, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    iput-object v7, v4, Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;->skLink:Ljava/lang/String;

    .line 234
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    iget-object v7, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->numScans:Ljava/lang/Integer;

    invoke-static {v7}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 238
    iget-object v7, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->numScans:Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iput v7, v4, Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;->numScans:I

    .line 239
    iget-object v4, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->numScans:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    add-int/2addr v5, v4

    move v4, v1

    goto :goto_1

    :cond_0
    move v4, v2

    goto :goto_1

    .line 243
    :cond_1
    iget-object v7, p0, Lcom/shopkick/app/products/CategoryJumperController;->contentTileTypes:Ljava/util/HashSet;

    iget-object v8, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v7, v8}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    if-eqz v4, :cond_4

    .line 244
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-nez v7, :cond_2

    goto :goto_2

    .line 249
    :cond_2
    iget-object v7, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanCompleted:Ljava/lang/Boolean;

    invoke-direct {p0, v7}, Lcom/shopkick/app/products/CategoryJumperController;->isTrue(Ljava/lang/Boolean;)Z

    move-result v7

    if-eqz v7, :cond_3

    iget-object v6, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanCompleted:Ljava/lang/Boolean;

    invoke-direct {p0, v6}, Lcom/shopkick/app/products/CategoryJumperController;->isTrue(Ljava/lang/Boolean;)Z

    move-result v6

    if-nez v6, :cond_4

    .line 250
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v6

    sub-int/2addr v6, v2

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;

    iget v7, v6, Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;->numScans:I

    add-int/2addr v7, v2

    iput v7, v6, Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;->numScans:I

    add-int/lit8 v5, v5, 0x1

    :cond_4
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 258
    :cond_5
    :goto_2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 260
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v4, v1

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;

    .line 261
    iget v6, v6, Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;->numScans:I

    if-nez v6, :cond_6

    .line 262
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 266
    :cond_7
    invoke-static {}, Ljava/util/Collections;->reverseOrder()Ljava/util/Comparator;

    move-result-object v3

    invoke-static {p1, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 267
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    .line 268
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_4

    .line 272
    :cond_8
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->scanRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object v3, p0, Lcom/shopkick/app/products/CategoryJumperController;->topSpacingItemDecoration:Lcom/shopkick/app/view/SKRecyclerView/TopSpacingItemDecoration;

    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->removeItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 273
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    iget v3, p0, Lcom/shopkick/app/products/CategoryJumperController;->MIN_JUMP_HEADER_CATEGORIES:I

    if-lt p1, v3, :cond_c

    iget p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->MIN_JUMP_HEADER_SCANS:I

    if-lt v5, p1, :cond_c

    iget-boolean p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->isDisable:Z

    if-eqz p1, :cond_9

    goto :goto_5

    .line 278
    :cond_9
    iput-boolean v2, p0, Lcom/shopkick/app/products/CategoryJumperController;->areShowingJumpHeader:Z

    .line 279
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->jumpHeaderContainer:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 280
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->categoryJumpHeader:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 283
    iput-boolean v1, p0, Lcom/shopkick/app/products/CategoryJumperController;->triedToAddFooter:Z

    .line 284
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->dismissFooter:Landroid/view/View;

    if-eqz p1, :cond_a

    .line 285
    iget-object v1, p0, Lcom/shopkick/app/products/CategoryJumperController;->categoryJumpList:Landroid/widget/ListView;

    invoke-virtual {v1, p1}, Landroid/widget/ListView;->removeFooterView(Landroid/view/View;)Z

    .line 289
    :cond_a
    iget p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->minIndex:I

    if-nez p1, :cond_b

    .line 290
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->scanRecyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object v1, p0, Lcom/shopkick/app/products/CategoryJumperController;->topSpacingItemDecoration:Lcom/shopkick/app/view/SKRecyclerView/TopSpacingItemDecoration;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 292
    :cond_b
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->scanCategoryJumpAdapter:Lcom/shopkick/app/products/ScanCategoryJumpAdapter;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/products/ScanCategoryJumpAdapter;->setCategoryInfos(Ljava/util/ArrayList;)V

    .line 293
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->scanCategoryJumpAdapter:Lcom/shopkick/app/products/ScanCategoryJumpAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/products/ScanCategoryJumpAdapter;->notifyDataSetChanged()V

    .line 296
    iget-boolean p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->didImpressionLog:Z

    if-nez p1, :cond_d

    .line 297
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0x8f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 298
    iget-object v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->appScreen:Lcom/shopkick/app/screens/AppScreen;

    iget-object v0, v0, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 299
    iput-boolean v2, p0, Lcom/shopkick/app/products/CategoryJumperController;->didImpressionLog:Z

    goto :goto_6

    .line 275
    :cond_c
    :goto_5
    iput-boolean v1, p0, Lcom/shopkick/app/products/CategoryJumperController;->areShowingJumpHeader:Z

    .line 276
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController;->jumpHeaderContainer:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_d
    :goto_6
    return-void
.end method

.method public showJumpToCategoryList()V
    .locals 4

    .line 601
    iget-object v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->categoryJumpHeader:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 602
    iget v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->minIndex:I

    if-lez v0, :cond_0

    .line 603
    invoke-virtual {p0, v0}, Lcom/shopkick/app/products/CategoryJumperController;->scrollToPosition(I)V

    .line 605
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->categoryJumpListIsShowing:Z

    const/4 v2, 0x1

    xor-int/2addr v0, v2

    iput-boolean v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->categoryJumpListIsShowing:Z

    .line 606
    iget-object v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->categoryJumpList:Landroid/widget/ListView;

    iget-boolean v3, p0, Lcom/shopkick/app/products/CategoryJumperController;->categoryJumpListIsShowing:Z

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x4

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 607
    iget-boolean v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->triedToAddFooter:Z

    if-nez v0, :cond_2

    .line 610
    iget-object v0, p0, Lcom/shopkick/app/products/CategoryJumperController;->categoryJumpList:Landroid/widget/ListView;

    new-instance v1, Lcom/shopkick/app/products/CategoryJumperController$3;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/CategoryJumperController$3;-><init>(Lcom/shopkick/app/products/CategoryJumperController;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->post(Ljava/lang/Runnable;)Z

    .line 619
    iput-boolean v2, p0, Lcom/shopkick/app/products/CategoryJumperController;->triedToAddFooter:Z

    :cond_2
    return-void
.end method
