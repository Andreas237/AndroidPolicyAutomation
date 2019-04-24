.class public Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;
.super Landroid/support/v7/widget/RecyclerView;
.source "RetailerSpreadView.java"


# instance fields
.field private adapter:Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;

.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 29
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 33
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 37
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 38
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 4

    .line 44
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;)V

    .line 46
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;-><init>(Lcom/ibotta/android/images/ImageCache;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;->adapter:Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;->adapter:Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 49
    new-instance v0, Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;->adapter:Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;->getSpan()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/support/v7/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 50
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 52
    invoke-virtual {v0}, Landroid/support/v7/widget/GridLayoutManager;->getSpanCount()I

    move-result v0

    .line 53
    new-instance v1, Lcom/ibotta/android/mvp/ui/adapter/GridSpacingItemDecoration;

    const v2, 0x7f070165

    const/4 v3, 0x0

    invoke-direct {v1, v0, v2, v3}, Lcom/ibotta/android/mvp/ui/adapter/GridSpacingItemDecoration;-><init>(IIZ)V

    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    return-void
.end method


# virtual methods
.method public getMaxRetailers()I
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;->adapter:Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;->getMaxRetailers()I

    move-result v0

    return v0
.end method

.method public isShowingAll()Z
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;->adapter:Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;->isShowingAll()Z

    move-result v0

    return v0
.end method

.method public onToggleShowAll()V
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;->adapter:Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;->toggleShowMore()V

    return-void
.end method

.method public setRetailers(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)V"
        }
    .end annotation

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;->adapter:Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/AvailableAtRetailerAdapter;->setRetailers(Ljava/util/List;)V

    return-void
.end method
