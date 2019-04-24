.class public Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;
.super Landroid/support/v7/widget/RecyclerView;
.source "MyOffersGalleryListView.java"

# interfaces
.implements Lcom/ibotta/android/views/util/VisibilityListener;


# static fields
.field private static final DEFAULT_SPAN_COUNT:I = 0x2


# instance fields
.field private adapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;

.field protected contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private eventContributor:Lcom/ibotta/android/tracking/proprietary/event/EventContributor;

.field private myOffersGalleryTracking:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryTracking;

.field protected scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

.field protected trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private visible:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    .line 47
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 51
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 52
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 56
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 57
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->initLayout()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;
    .locals 0

    .line 32
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;ILcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;I)I
    .locals 0

    .line 32
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->initSpanSize(ILcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;I)I

    move-result p0

    return p0
.end method

.method private initAdapter()V
    .locals 2

    .line 118
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;-><init>(Lcom/ibotta/android/content/card/ContentCardReducer;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 90
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;)V

    .line 92
    new-instance v0, Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->getSpanCount()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/support/v7/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 93
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 95
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->initSpanSizeLookup(Landroid/support/v7/widget/GridLayoutManager;)V

    .line 96
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->initSpacingItemDecoration(Landroid/support/v7/widget/GridLayoutManager;)V

    .line 97
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->initAdapter()V

    .line 98
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->initScrollListener()V

    return-void
.end method

.method private initSpacingItemDecoration(Landroid/support/v7/widget/GridLayoutManager;)V
    .locals 2

    .line 111
    invoke-virtual {p1}, Landroid/support/v7/widget/GridLayoutManager;->getSpanCount()I

    move-result p1

    .line 112
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f070165

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 114
    new-instance v1, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;

    invoke-direct {v1, p1, v0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;-><init>(II)V

    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    return-void
.end method

.method private initSpanSize(ILcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;I)I
    .locals 1

    if-ltz p1, :cond_2

    .line 123
    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->getItemCount()I

    move-result v0

    if-lt p1, v0, :cond_0

    goto :goto_2

    .line 127
    :cond_0
    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;

    move-result-object p1

    .line 131
    instance-of p2, p1, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;

    const/4 v0, 0x1

    if-nez p2, :cond_1

    goto :goto_0

    .line 134
    :cond_1
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;->getOfferCategoryItem()Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;->getStyle()Lcom/ibotta/android/views/content/ContentStyle;

    move-result-object p1

    .line 136
    sget-object p2, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView$2;->$SwitchMap$com$ibotta$android$views$content$ContentStyle:[I

    invoke-virtual {p1}, Lcom/ibotta/android/views/content/ContentStyle;->ordinal()I

    move-result p1

    aget p1, p2, p1

    packed-switch p1, :pswitch_data_0

    goto :goto_1

    :goto_0
    :pswitch_0
    move v0, p3

    :goto_1
    :pswitch_1
    return v0

    :cond_2
    :goto_2
    const/4 p1, 0x0

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private initSpanSizeLookup(Landroid/support/v7/widget/GridLayoutManager;)V
    .locals 1

    .line 102
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView$1;-><init>(Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;Landroid/support/v7/widget/GridLayoutManager;)V

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/GridLayoutManager;->setSpanSizeLookup(Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;)V

    return-void
.end method


# virtual methods
.method protected getSpanCount()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method protected initScrollListener()V
    .locals 2

    .line 151
    new-instance v0, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;

    invoke-direct {v0, p0}, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    .line 153
    new-instance v1, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    invoke-direct {v1, v0, p0}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;-><init>(Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;Landroid/view/View;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    .line 154
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    const-string v1, "My Retailer Rebates"

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setDebugTrackingLabel(Ljava/lang/String;)V

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->visible:Z

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setEnabled(Z)V

    return-void
.end method

.method protected initScrollTracking()V
    .locals 4

    .line 159
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryTracking;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->eventContributor:Lcom/ibotta/android/tracking/proprietary/event/EventContributor;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryTracking;-><init>(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;Lcom/ibotta/android/tracking/proprietary/event/EventContributor;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->myOffersGalleryTracking:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryTracking;

    .line 163
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->myOffersGalleryTracking:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryTracking;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setVisibilityTrackingListener(Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;)V

    return-void
.end method

.method public onVisibilityChanged(Z)V
    .locals 1

    .line 169
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->visible:Z

    .line 171
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    if-eqz v0, :cond_0

    .line 172
    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setEnabled(Z)V

    :cond_0
    return-void
.end method

.method public setEditing(Z)V
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->setEditing(Z)V

    return-void
.end method

.method public setEventContributor(Lcom/ibotta/android/tracking/proprietary/event/EventContributor;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->eventContributor:Lcom/ibotta/android/tracking/proprietary/event/EventContributor;

    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->setListener(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;",
            ">;)V"
        }
    .end annotation

    .line 70
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;->getTypeEnum()Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    move-result-object v1

    sget-object v2, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->OFFER_CARD:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    if-ne v1, v2, :cond_0

    .line 71
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07017b

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    invoke-virtual {p0, v0, v1, v0, v0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->setPadding(IIII)V

    .line 73
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->setRows(Ljava/util/List;)V

    .line 74
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->initScrollTracking()V

    return-void
.end method

.method public setSelectedOfferModelIds(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 78
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;->adapter:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->setSelectedOfferModelIds(Ljava/util/Set;)V

    return-void
.end method
