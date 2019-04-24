.class public Lcom/shopkick/app/products/ScanCategoryJumpAdapter;
.super Lcom/shopkick/app/adapter/SKAdapter;
.source "ScanCategoryJumpAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/products/ScanCategoryJumpAdapter$JumpCategoryClick;
    }
.end annotation


# instance fields
.field private appScreenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation
.end field

.field private categoryInfos:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;",
            ">;"
        }
    .end annotation
.end field

.field private categoryJumperControllerRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/products/CategoryJumperController;",
            ">;"
        }
    .end annotation
.end field

.field private context:Landroid/content/Context;

.field private coordinator:Lcom/shopkick/app/logging/UserEventListViewCoordinator;

.field private isHeaderSkLinkEnabled:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/products/CategoryJumperController;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Lcom/shopkick/app/adapter/SKAdapter;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/shopkick/app/products/ScanCategoryJumpAdapter;->context:Landroid/content/Context;

    .line 37
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/products/ScanCategoryJumpAdapter;->categoryInfos:Ljava/util/ArrayList;

    .line 39
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/products/ScanCategoryJumpAdapter;->appScreenRef:Ljava/lang/ref/WeakReference;

    .line 40
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/products/ScanCategoryJumpAdapter;->categoryJumperControllerRef:Ljava/lang/ref/WeakReference;

    .line 42
    new-instance p1, Lcom/shopkick/app/logging/UserEventListViewCoordinator;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/shopkick/app/logging/UserEventListViewCoordinator;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/shopkick/app/products/ScanCategoryJumpAdapter;->coordinator:Lcom/shopkick/app/logging/UserEventListViewCoordinator;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/products/ScanCategoryJumpAdapter;)Z
    .locals 0

    .line 24
    iget-boolean p0, p0, Lcom/shopkick/app/products/ScanCategoryJumpAdapter;->isHeaderSkLinkEnabled:Z

    return p0
.end method

.method private scanText(I)Ljava/lang/String;
    .locals 3

    .line 105
    iget-object v0, p0, Lcom/shopkick/app/products/ScanCategoryJumpAdapter;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0f003a

    .line 106
    invoke-virtual {v0, v1, p1}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    .line 107
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    .line 105
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private setupLogging(Lcom/shopkick/app/logging/IUserEventView;Ljava/lang/String;I)V
    .locals 4

    .line 111
    iget-object v0, p0, Lcom/shopkick/app/products/ScanCategoryJumpAdapter;->appScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    if-nez v0, :cond_0

    return-void

    .line 116
    :cond_0
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v2, 0x90

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 117
    invoke-virtual {v1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductHierarchyId(Ljava/lang/String;)V

    .line 118
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 120
    new-instance p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {p2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 121
    iget-object v2, p0, Lcom/shopkick/app/products/ScanCategoryJumpAdapter;->coordinator:Lcom/shopkick/app/logging/UserEventListViewCoordinator;

    iput-object v2, p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    const/4 v2, 0x1

    .line 122
    iput-boolean v2, p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 123
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    iput-object p3, p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->verticalListDisplayPos:Ljava/lang/Integer;

    .line 125
    iget-object p3, v0, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-interface {p1, v1, p3, p2}, Lcom/shopkick/app/logging/IUserEventView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method


# virtual methods
.method public destroyAdapter()V
    .locals 0

    return-void
.end method

.method public getCount()I
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/shopkick/app/products/ScanCategoryJumpAdapter;->categoryInfos:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/shopkick/app/products/ScanCategoryJumpAdapter;->categoryInfos:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 80
    iget-object v0, p0, Lcom/shopkick/app/products/ScanCategoryJumpAdapter;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    if-nez p2, :cond_0

    const p2, 0x7f0c019b

    const/4 v1, 0x0

    .line 83
    invoke-virtual {v0, p2, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 84
    new-instance p3, Lcom/shopkick/app/adapter/ViewHolder;

    invoke-direct {p3}, Lcom/shopkick/app/adapter/ViewHolder;-><init>()V

    .line 85
    invoke-virtual {p3, p2}, Lcom/shopkick/app/adapter/ViewHolder;->populate(Landroid/view/View;)V

    .line 86
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 88
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/shopkick/app/adapter/ViewHolder;

    .line 90
    :goto_0
    invoke-virtual {p0, p1}, Lcom/shopkick/app/products/ScanCategoryJumpAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;

    .line 91
    iget-object v1, v0, Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;->categoryName:Ljava/lang/String;

    .line 92
    iget v2, v0, Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;->numScans:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const v3, 0x7f090360

    .line 93
    invoke-virtual {p3, v3}, Lcom/shopkick/app/adapter/ViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v1, 0x7f090361

    .line 94
    invoke-virtual {p3, v1}, Lcom/shopkick/app/adapter/ViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object p3

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/shopkick/app/products/ScanCategoryJumpAdapter;->scanText(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 95
    new-instance p3, Lcom/shopkick/app/products/ScanCategoryJumpAdapter$JumpCategoryClick;

    iget-object v1, p0, Lcom/shopkick/app/products/ScanCategoryJumpAdapter;->categoryJumperControllerRef:Ljava/lang/ref/WeakReference;

    invoke-direct {p3, p0, v1, v0}, Lcom/shopkick/app/products/ScanCategoryJumpAdapter$JumpCategoryClick;-><init>(Lcom/shopkick/app/products/ScanCategoryJumpAdapter;Ljava/lang/ref/WeakReference;Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 97
    instance-of p3, p2, Lcom/shopkick/app/logging/IUserEventView;

    if-eqz p3, :cond_1

    .line 98
    move-object p3, p2

    check-cast p3, Lcom/shopkick/app/logging/IUserEventView;

    iget-object v0, v0, Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;->productHierarchyId:Ljava/lang/String;

    invoke-direct {p0, p3, v0, p1}, Lcom/shopkick/app/products/ScanCategoryJumpAdapter;->setupLogging(Lcom/shopkick/app/logging/IUserEventView;Ljava/lang/String;I)V

    :cond_1
    return-object p2
.end method

.method public getViewTypeCount()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public setCategoryInfos(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;",
            ">;)V"
        }
    .end annotation

    .line 130
    new-instance v0, Lcom/shopkick/app/products/ScanCategoryJumpAdapter$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/products/ScanCategoryJumpAdapter$1;-><init>(Lcom/shopkick/app/products/ScanCategoryJumpAdapter;)V

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 156
    iput-object p1, p0, Lcom/shopkick/app/products/ScanCategoryJumpAdapter;->categoryInfos:Ljava/util/ArrayList;

    return-void
.end method

.method public setHeaderSkLinkEnabled(Z)V
    .locals 0

    .line 46
    iput-boolean p1, p0, Lcom/shopkick/app/products/ScanCategoryJumpAdapter;->isHeaderSkLinkEnabled:Z

    return-void
.end method
