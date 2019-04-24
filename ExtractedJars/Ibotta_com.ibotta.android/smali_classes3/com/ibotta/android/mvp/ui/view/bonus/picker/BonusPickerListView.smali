.class public Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;
.super Landroid/support/v7/widget/RecyclerView;
.source "BonusPickerListView.java"

# interfaces
.implements Lcom/ibotta/android/views/util/VisibilityListener;


# instance fields
.field private final GRID_COLUMN_SIZE:I

.field private adapter:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;

.field private bonusesTracking:Lcom/ibotta/android/mvp/ui/activity/bonus/BonusesTracking;

.field eventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "BonusesEventContextProvider"
    .end annotation
.end field

.field private scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

.field trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private visible:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 43
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x3

    .line 33
    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->GRID_COLUMN_SIZE:I

    .line 44
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 48
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x3

    .line 33
    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->GRID_COLUMN_SIZE:I

    .line 49
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 53
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x3

    .line 33
    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->GRID_COLUMN_SIZE:I

    .line 54
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->initLayout()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;)Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;
    .locals 0

    .line 32
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->adapter:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;ILcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;I)I
    .locals 0

    .line 32
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->initSpanSize(ILcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;I)I

    move-result p0

    return p0
.end method

.method private initAdapter()V
    .locals 1

    .line 89
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->adapter:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->adapter:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 67
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;)V

    .line 69
    new-instance v0, Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Landroid/support/v7/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 71
    new-instance v1, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView$1;

    invoke-direct {v1, p0, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView$1;-><init>(Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;Landroid/support/v7/widget/GridLayoutManager;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/GridLayoutManager;->setSpanSizeLookup(Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;)V

    .line 78
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 79
    invoke-virtual {v0}, Landroid/support/v7/widget/GridLayoutManager;->getSpanCount()I

    move-result v0

    .line 80
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070165

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 82
    new-instance v2, Lcom/ibotta/android/mvp/ui/view/bonus/picker/GridSpacingItemDecoration;

    invoke-direct {v2, v0, v1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/GridSpacingItemDecoration;-><init>(II)V

    invoke-virtual {p0, v2}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 84
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->initAdapter()V

    .line 85
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->initScrollListener()V

    return-void
.end method

.method private initScrollListener()V
    .locals 2

    .line 113
    new-instance v0, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;

    invoke-direct {v0, p0}, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    .line 115
    new-instance v1, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    invoke-direct {v1, v0, p0}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;-><init>(Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;Landroid/view/View;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    const-string v1, "Bonuses"

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setDebugTrackingLabel(Ljava/lang/String;)V

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->visible:Z

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setEnabled(Z)V

    return-void
.end method

.method private initScrollTracking()V
    .locals 4

    .line 121
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/bonus/BonusesTracking;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->adapter:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->eventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/bonus/BonusesTracking;-><init>(Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->bonusesTracking:Lcom/ibotta/android/mvp/ui/activity/bonus/BonusesTracking;

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->bonusesTracking:Lcom/ibotta/android/mvp/ui/activity/bonus/BonusesTracking;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setVisibilityTrackingListener(Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;)V

    return-void
.end method

.method private initSpanSize(ILcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;I)I
    .locals 6

    .line 95
    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;

    move-result-object p1

    .line 96
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;->getTypeEnum()Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    move-result-object p2

    sget-object v0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->FEATURED_BONUSES:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p2, v0, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 97
    :goto_0
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;->getTypeEnum()Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    move-result-object v0

    sget-object v3, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->TITLE_BAR:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    if-ne v0, v3, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    .line 98
    :goto_1
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;->getTypeEnum()Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    move-result-object v3

    sget-object v4, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->EMPTY_COMPLETED_BONUSES:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    if-ne v3, v4, :cond_2

    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    .line 99
    :goto_2
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;->getTypeEnum()Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    move-result-object v4

    sget-object v5, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->TEAMWORK_BONUSES:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    if-ne v4, v5, :cond_3

    const/4 v1, 0x1

    :cond_3
    if-nez p2, :cond_5

    if-nez v0, :cond_5

    if-nez v3, :cond_5

    if-eqz v1, :cond_4

    goto :goto_3

    .line 105
    :cond_4
    instance-of p1, p1, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/BonusPickerRow;

    goto :goto_4

    :cond_5
    :goto_3
    move v2, p3

    :goto_4
    return v2
.end method


# virtual methods
.method public onVisibilityChanged(Z)V
    .locals 2

    .line 127
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->visible:Z

    .line 129
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    if-eqz v0, :cond_0

    .line 130
    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setEnabled(Z)V

    .line 133
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->adapter:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 134
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->adapter:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;->getItemCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 135
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->adapter:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;->setContainerVisible(Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;)V
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->adapter:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;->setListener(Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRecyclerListener;)V

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;",
            ">;)V"
        }
    .end annotation

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->adapter:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerAdapter;->setRows(Ljava/util/List;)V

    .line 63
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->initScrollTracking()V

    return-void
.end method

.method public trackBonusClick(Lcom/ibotta/api/model/BonusModel;)V
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->bonusesTracking:Lcom/ibotta/android/mvp/ui/activity/bonus/BonusesTracking;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/bonus/BonusesTracking;->trackBonusClick(Lcom/ibotta/api/model/BonusModel;)V

    return-void
.end method

.method public trackSubListContentClicked(Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;Lcom/ibotta/api/model/BonusModel;I)V
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->bonusesTracking:Lcom/ibotta/android/mvp/ui/activity/bonus/BonusesTracking;

    invoke-virtual {v0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/bonus/BonusesTracking;->trackSubListContentClicked(Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;Lcom/ibotta/api/model/BonusModel;I)V

    return-void
.end method

.method public trackSubListContentVisible(Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;Lcom/ibotta/api/model/BonusModel;I)V
    .locals 1

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerListView;->bonusesTracking:Lcom/ibotta/android/mvp/ui/activity/bonus/BonusesTracking;

    invoke-virtual {v0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/bonus/BonusesTracking;->trackSubListContentVisible(Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;Lcom/ibotta/api/model/BonusModel;I)V

    return-void
.end method
