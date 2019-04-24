.class public Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;
.super Landroid/widget/LinearLayout;
.source "RelatedOffersList.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;


# instance fields
.field protected appConfig:Lcom/ibotta/android/state/app/config/AppConfig;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected buildProfile:Lcom/ibotta/android/profile/BuildProfile;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private contentCardViewEvents:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

.field protected offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected rvRelatedOffers:Landroid/support/v7/widget/RecyclerView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903dc
    .end annotation
.end field

.field protected tbvTitleBarView:Lcom/ibotta/android/views/base/title/TitleBarView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09044d
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 64
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 68
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 69
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 73
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 74
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 79
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 80
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 5

    .line 109
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;)V

    const/4 v0, 0x1

    .line 111
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;->setOrientation(I)V

    .line 112
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c01d0

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 114
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;->rvRelatedOffers:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;->getContext()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Landroid/support/v7/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;->rvRelatedOffers:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/gallery/NewGalleryItemDecoration;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f070165

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    invoke-direct {v1, v3, v2}, Lcom/ibotta/android/mvp/ui/view/gallery/NewGalleryItemDecoration;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;->rvRelatedOffers:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    return-void
.end method


# virtual methods
.method public onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 128
    instance-of v0, p1, Lcom/ibotta/api/model/OfferModel;

    if-eqz v0, :cond_0

    .line 129
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;->contentCardViewEvents:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;->onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    :cond_0
    return-void
.end method

.method public onFeatureClicked(Lcom/ibotta/api/model/base/Routable;)V
    .locals 0

    return-void
.end method

.method public onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 149
    instance-of v0, p1, Lcom/ibotta/api/model/OfferModel;

    if-eqz v0, :cond_0

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;->contentCardViewEvents:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;->onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    :cond_0
    return-void
.end method

.method public onSpecialConditionsLearnMoreClicked(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0

    return-void
.end method

.method public onTrackContentClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
    .locals 0

    return-void
.end method

.method public onTrackShopClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
    .locals 0

    return-void
.end method

.method public onTrackUnlockClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
    .locals 0

    return-void
.end method

.method public onTrackUnlockedClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
    .locals 0

    return-void
.end method

.method public onUnlockClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 135
    instance-of v0, p1, Lcom/ibotta/api/model/OfferModel;

    if-eqz v0, :cond_0

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;->contentCardViewEvents:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;->onUnlockClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    :cond_0
    return-void
.end method

.method public onUnlockedClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 142
    instance-of v0, p1, Lcom/ibotta/api/model/OfferModel;

    if-eqz v0, :cond_0

    .line 143
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;->contentCardViewEvents:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;->onUnlockedClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    :cond_0
    return-void
.end method

.method public setContentCardViewEvents(Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;->contentCardViewEvents:Lcom/ibotta/android/mvp/ui/view/content/ContentCardViewEvents;

    return-void
.end method

.method public setup(Lcom/ibotta/android/views/base/title/TitleBarViewState;Ljava/util/LinkedHashMap;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/views/base/title/TitleBarViewState;",
            "Ljava/util/LinkedHashMap<",
            "Lcom/ibotta/api/model/OfferModel;",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)V"
        }
    .end annotation

    .line 88
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 90
    invoke-virtual {p2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 91
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/OfferModel;

    .line 92
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/RetailerModel;

    .line 94
    new-instance v3, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;

    invoke-direct {v3}, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;-><init>()V

    .line 95
    invoke-virtual {v3, v1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;->setRetailerModel(Lcom/ibotta/api/model/RetailerModel;)V

    .line 96
    new-instance v1, Lcom/ibotta/android/view/model/content/OfferItem;

    invoke-direct {v1, v2}, Lcom/ibotta/android/view/model/content/OfferItem;-><init>(Lcom/ibotta/api/model/OfferModel;)V

    invoke-virtual {v3, v1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;->setOfferCategoryItem(Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;)V

    .line 98
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 101
    :cond_0
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedRebatesAdapter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;->contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;

    invoke-direct {p2, v0, v1}, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedRebatesAdapter;-><init>(Ljava/util/List;Lcom/ibotta/android/content/card/ContentCardReducer;)V

    .line 102
    invoke-virtual {p2, p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedRebatesAdapter;->setListener(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;)V

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;->rvRelatedOffers:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, p2}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 105
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;->tbvTitleBarView:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    return-void
.end method
