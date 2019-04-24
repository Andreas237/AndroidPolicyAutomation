.class public Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;
.super Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;
.source "SmallBannersViewHolder.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapterListener;
.implements Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$HorizScrollingModuleListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder<",
        "Lcom/ibotta/android/mvp/ui/activity/featured/row/SmallBannersRow;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapterListener<",
        "Lcom/ibotta/api/model/FeatureModel;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$HorizScrollingModuleListener;"
    }
.end annotation


# static fields
.field private static final CARD_HEIGHT_PERC_OF_WIDTH:D = 0.66

.field private static final COUNT_VISIBLE:D = 1.0

.field private static final PEAK_OUT_PERCENTAGE:D = 0.8


# instance fields
.field private hsmvSmallBanners:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

.field private listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

.field private models:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/FeatureModel;",
            ">;"
        }
    .end annotation
.end field

.field private module:Lcom/ibotta/api/model/base/Module;

.field private final tileHeight:D

.field private final tileItemAdapter:Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter<",
            "Lcom/ibotta/api/model/FeatureModel;",
            ">;"
        }
    .end annotation
.end field

.field private final tileWidth:D


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/images/ImageCache;Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;)V
    .locals 2

    .line 49
    invoke-direct {p0, p4}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;-><init>(Landroid/view/View;)V

    .line 51
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->hsmvSmallBanners:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->hsmvSmallBanners:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {p4}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->getResources()Landroid/content/res/Resources;

    move-result-object p4

    const v1, 0x7f0701b0

    invoke-virtual {p4, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p4

    invoke-virtual {v0, p4}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setItemSpacing(I)V

    .line 53
    iget-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->hsmvSmallBanners:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    const v0, 0x106000d

    invoke-interface {p1, v0}, Lcom/ibotta/android/util/AppHelper;->getColor(I)I

    move-result p1

    invoke-virtual {p4, p1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setBackgroundColor(I)V

    .line 55
    invoke-interface {p2}, Lcom/ibotta/android/hardware/Hardware;->getScreenSize()Landroid/graphics/Point;

    move-result-object p1

    .line 56
    iget p1, p1, Landroid/graphics/Point;->x:I

    int-to-double p1, p1

    const-wide v0, 0x3ffccccccccccccdL    # 1.8

    div-double/2addr p1, v0

    .line 57
    iput-wide p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->tileWidth:D

    .line 58
    iget-wide p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->tileWidth:D

    const-wide v0, 0x3fe51eb851eb851fL    # 0.66

    mul-double p1, p1, v0

    iput-wide p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->tileHeight:D

    .line 60
    new-instance p1, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter;

    invoke-direct {p1, p3}, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter;-><init>(Lcom/ibotta/android/images/ImageCache;)V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->tileItemAdapter:Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter;

    .line 61
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->tileItemAdapter:Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter;

    iget-wide p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->tileWidth:D

    double-to-int p2, p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter;->setTileWidth(I)V

    .line 62
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->tileItemAdapter:Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter;

    iget-wide p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->tileHeight:D

    double-to-int p2, p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter;->setTileHeight(I)V

    .line 63
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->tileItemAdapter:Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter;->setListener(Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapterListener;)V

    return-void
.end method

.method public static synthetic lambda$bind$0(Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;Z)V
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->hsmvSmallBanners:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setVisibilityScrollTrackingEnabled(Z)V

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V
    .locals 0

    .line 32
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/row/SmallBannersRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->bind(Lcom/ibotta/android/mvp/ui/activity/featured/row/SmallBannersRow;Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/activity/featured/row/SmallBannersRow;Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V
    .locals 3

    .line 68
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    .line 70
    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/featured/holder/-$$Lambda$SmallBannersViewHolder$cY7ACBcg2goBeJizhBcpghc2etM;

    invoke-direct {p2, p0}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/-$$Lambda$SmallBannersViewHolder$cY7ACBcg2goBeJizhBcpghc2etM;-><init>(Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;)V

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/row/SmallBannersRow;->setListener(Lcom/ibotta/android/views/util/VisibilityListener;)V

    .line 72
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/SmallBannersRow;->getModule()Lcom/ibotta/api/model/base/Module;

    move-result-object p2

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->module:Lcom/ibotta/api/model/base/Module;

    .line 73
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/SmallBannersRow;->getModels()Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->models:Ljava/util/List;

    .line 75
    new-instance p2, Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->models:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->models:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/FeatureModel;

    .line 78
    new-instance v2, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItem;

    invoke-direct {v2}, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItem;-><init>()V

    .line 80
    invoke-virtual {v2, v1}, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItem;->setDomainObject(Ljava/lang/Object;)V

    .line 81
    invoke-interface {v1}, Lcom/ibotta/api/model/FeatureModel;->getCategoryImg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItem;->setImageUrl(Ljava/lang/String;)V

    .line 83
    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 86
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->tileItemAdapter:Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter;

    invoke-virtual {v0, p2}, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter;->setTileItems(Ljava/util/List;)V

    .line 88
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->hsmvSmallBanners:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/SmallBannersRow;->getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->updateTitleBarViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 89
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->hsmvSmallBanners:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->tileItemAdapter:Lcom/ibotta/android/mvp/ui/adapter/tile/TileItemAdapter;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 90
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->hsmvSmallBanners:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setListener(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$HorizScrollingModuleListener;)V

    return-void
.end method

.method public getRowViewState()Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 125
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState;->builder()Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->hsmvSmallBanners:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->getLayoutState()Landroid/os/Parcelable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState$Builder;->savedState(Landroid/os/Parcelable;)Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState;

    move-result-object v0

    return-object v0
.end method

.method public onBottomButtonClicked()V
    .locals 0

    return-void
.end method

.method public onItemsVisible(Ljava/util/Set;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->module:Lcom/ibotta/api/model/base/Module;

    if-nez v0, :cond_0

    goto :goto_1

    .line 106
    :cond_0
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 107
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ltz v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->models:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lt v1, v2, :cond_2

    goto :goto_0

    .line 111
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->models:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/FeatureModel;

    if-eqz v1, :cond_1

    .line 113
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->module:Lcom/ibotta/api/model/base/Module;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v2, v3, v1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;->onSubListContentVisible(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/ContentEventTrackable;I)V

    goto :goto_0

    :cond_3
    return-void

    :cond_4
    :goto_1
    return-void
.end method

.method public onTileItemClicked(Lcom/ibotta/android/mvp/ui/adapter/tile/TileItem;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/adapter/tile/TileItem<",
            "Lcom/ibotta/api/model/FeatureModel;",
            ">;)V"
        }
    .end annotation

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    if-eqz v0, :cond_0

    .line 96
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/adapter/tile/TileItem;->getDomainObject()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/FeatureModel;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->module:Lcom/ibotta/api/model/base/Module;

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;->onFeatureClicked(Lcom/ibotta/api/model/FeatureModel;Lcom/ibotta/api/model/base/Module;)V

    :cond_0
    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 130
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;->updateViewState(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;)V

    .line 131
    instance-of v0, p1, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState;

    if-eqz v0, :cond_0

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->hsmvSmallBanners:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState;->getSavedState()Landroid/os/Parcelable;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->restoreLayoutState(Landroid/os/Parcelable;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/views/components/ViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 32
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/SmallBannersViewHolder;->updateViewState(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;)V

    return-void
.end method
