.class public Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;
.super Landroid/support/v7/widget/RecyclerView;
.source "GalleryListView.java"

# interfaces
.implements Lcom/ibotta/android/views/util/VisibilityListener;


# static fields
.field public static final OFFER_GRID_SPAN_COUNT:I = 0x2


# instance fields
.field private adapter:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;

.field protected contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private galleryTracking:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking;

.field protected scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

.field protected trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private visible:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    .line 46
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 50
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 51
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 55
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 56
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->initLayout()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;)Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->adapter:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;ILcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;I)I
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->initSpanSize(ILcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;I)I

    move-result p0

    return p0
.end method

.method private initAdapter()V
    .locals 2

    .line 95
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;-><init>(Lcom/ibotta/android/content/card/ContentCardReducer;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->adapter:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->adapter:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method private initLayout()V
    .locals 4

    .line 72
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;)V

    .line 74
    new-instance v0, Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Landroid/support/v7/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 75
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 77
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->initSpanSizeLookup(Landroid/support/v7/widget/GridLayoutManager;)V

    .line 79
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/gallery/NewGalleryItemDecoration;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f070165

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    invoke-direct {v0, v2, v1}, Lcom/ibotta/android/mvp/ui/view/gallery/NewGalleryItemDecoration;-><init>(II)V

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 81
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->initAdapter()V

    .line 82
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->initScrollListener()V

    return-void
.end method

.method private initSpanSize(ILcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;I)I
    .locals 1

    if-ltz p1, :cond_2

    .line 100
    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;->getItemCount()I

    move-result v0

    if-lt p1, v0, :cond_0

    goto :goto_2

    .line 104
    :cond_0
    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;

    move-result-object p1

    .line 108
    instance-of p2, p1, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;

    const/4 v0, 0x1

    if-nez p2, :cond_1

    goto :goto_0

    .line 111
    :cond_1
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;->getOfferCategoryItem()Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;->getStyle()Lcom/ibotta/android/views/content/ContentStyle;

    move-result-object p1

    .line 113
    sget-object p2, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView$2;->$SwitchMap$com$ibotta$android$views$content$ContentStyle:[I

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
        :pswitch_0
    .end packed-switch
.end method

.method private initSpanSizeLookup(Landroid/support/v7/widget/GridLayoutManager;)V
    .locals 1

    .line 86
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView$1;-><init>(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;Landroid/support/v7/widget/GridLayoutManager;)V

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/GridLayoutManager;->setSpanSizeLookup(Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;)V

    return-void
.end method


# virtual methods
.method protected initScrollListener()V
    .locals 2

    .line 127
    new-instance v0, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;

    invoke-direct {v0, p0}, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    .line 129
    new-instance v1, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    invoke-direct {v1, v0, p0}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;-><init>(Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;Landroid/view/View;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    const-string v1, "Gallery"

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setDebugTrackingLabel(Ljava/lang/String;)V

    .line 131
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->visible:Z

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setEnabled(Z)V

    return-void
.end method

.method protected initScrollTracking()V
    .locals 3

    .line 135
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->adapter:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking;-><init>(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->galleryTracking:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking;

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->galleryTracking:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setVisibilityTrackingListener(Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;)V

    return-void
.end method

.method public onVisibilityChanged(Z)V
    .locals 1

    .line 141
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->visible:Z

    .line 143
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    if-eqz v0, :cond_0

    .line 144
    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setEnabled(Z)V

    :cond_0
    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->adapter:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;->setListener(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;",
            ">;)V"
        }
    .end annotation

    .line 64
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;->getTypeEnum()Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    move-result-object v1

    sget-object v2, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->OFFER_CARD:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    if-ne v1, v2, :cond_0

    .line 65
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07017b

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    invoke-virtual {p0, v0, v1, v0, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->setPadding(IIII)V

    .line 67
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->adapter:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;->setRows(Ljava/util/List;)V

    .line 68
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->initScrollTracking()V

    return-void
.end method

.method public trackContentClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->galleryTracking:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking;->trackContentClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    return-void
.end method

.method public trackShopClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
    .locals 1

    .line 161
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->galleryTracking:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking;->trackShopClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    return-void
.end method

.method public trackUnlockClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
    .locals 1

    .line 153
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->galleryTracking:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking;->trackUnlockClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    return-void
.end method

.method public trackUnlockedClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
    .locals 1

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->galleryTracking:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryTracking;->trackUnlockedClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    return-void
.end method
