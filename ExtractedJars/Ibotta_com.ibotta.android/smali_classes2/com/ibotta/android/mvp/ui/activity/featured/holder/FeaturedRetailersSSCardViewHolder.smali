.class public Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;
.super Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;
.source "FeaturedRetailersSSCardViewHolder.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$HorizScrollingModuleListener;
.implements Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder<",
        "Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedRetailersRow;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$HorizScrollingModuleListener;",
        "Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;"
    }
.end annotation


# instance fields
.field private final hsmvRetailers:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

.field private listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

.field private final models:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation
.end field

.field private module:Lcom/ibotta/api/model/base/Module;

.field private final retailerSSItemAdapter:Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;)V
    .locals 1

    .line 44
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;-><init>(Landroid/view/View;)V

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->models:Ljava/util/List;

    .line 45
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->hsmvRetailers:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    .line 47
    new-instance p1, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;

    invoke-direct {p1}, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->retailerSSItemAdapter:Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;

    .line 48
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->retailerSSItemAdapter:Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;->bindViewEvents(Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;)V

    return-void
.end method

.method private setupModuleView(Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedRetailersRow;)V
    .locals 4

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->hsmvRetailers:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setItemSpacing(I)V

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->hsmvRetailers:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0701bb

    .line 78
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v2

    .line 79
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->hsmvRetailers:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {v3, v2, v1, v2, v1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setListViewPadding(IIII)V

    .line 81
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->hsmvRetailers:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    const v2, 0x7f060171

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setBackgroundColor(I)V

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->hsmvRetailers:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedRetailersRow;->getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->updateTitleBarViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 83
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->hsmvRetailers:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->retailerSSItemAdapter:Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 85
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->module:Lcom/ibotta/api/model/base/Module;

    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getMoreAction()Lcom/ibotta/api/model/content/Action;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->module:Lcom/ibotta/api/model/base/Module;

    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getMoreAction()Lcom/ibotta/api/model/content/Action;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/api/model/content/Action;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 86
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->hsmvRetailers:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->module:Lcom/ibotta/api/model/base/Module;

    invoke-virtual {v0}, Lcom/ibotta/api/model/base/Module;->getMoreAction()Lcom/ibotta/api/model/content/Action;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/api/model/content/Action;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setBottomButtonLabel(Ljava/lang/String;)V

    goto :goto_0

    .line 88
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->hsmvRetailers:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setBottomButtonLabel(Ljava/lang/String;)V

    .line 91
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->hsmvRetailers:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setListener(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$HorizScrollingModuleListener;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V
    .locals 0

    .line 34
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedRetailersRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->bind(Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedRetailersRow;Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedRetailersRow;Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V
    .locals 2

    .line 53
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    .line 55
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->hsmvRetailers:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/-$$Lambda$lNddZEahCWqPUs4Qub-KAhn5xhg;

    invoke-direct {v0, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/-$$Lambda$lNddZEahCWqPUs4Qub-KAhn5xhg;-><init>(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;)V

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedRetailersRow;->setListener(Lcom/ibotta/android/views/util/VisibilityListener;)V

    .line 57
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedRetailersRow;->getModule()Lcom/ibotta/api/model/base/Module;

    move-result-object p2

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->module:Lcom/ibotta/api/model/base/Module;

    .line 59
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->models:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->clear()V

    .line 60
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedRetailersRow;->getModule()Lcom/ibotta/api/model/base/Module;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/base/BaseContent;

    .line 61
    instance-of v1, v0, Lcom/ibotta/api/model/content/RetailerContent;

    if-eqz v1, :cond_0

    .line 62
    check-cast v0, Lcom/ibotta/api/model/content/RetailerContent;

    .line 63
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->models:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 67
    :cond_1
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->retailerSSItemAdapter:Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedRetailersRow;->getListViewState()Lcom/ibotta/android/horiz/RetailerSSCardListViewState;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;->updateViewState(Lcom/ibotta/android/horiz/RetailerSSCardListViewState;)V

    .line 69
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->setupModuleView(Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedRetailersRow;)V

    return-void
.end method

.method public getRowViewState()Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 129
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState;->builder()Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->hsmvRetailers:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->getLayoutState()Landroid/os/Parcelable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState$Builder;->savedState(Landroid/os/Parcelable;)Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState;

    move-result-object v0

    return-object v0
.end method

.method public onBottomButtonClicked()V
    .locals 3

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    if-eqz v0, :cond_0

    .line 123
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->module:Lcom/ibotta/api/model/base/Module;

    invoke-virtual {v1}, Lcom/ibotta/api/model/base/Module;->getMoreAction()Lcom/ibotta/api/model/content/Action;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;->onActionClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/base/Actionable;)V

    :cond_0
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

    const-string v0, "onItemsVisible: %1$d"

    const/4 v1, 0x1

    .line 103
    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->module:Lcom/ibotta/api/model/base/Module;

    if-nez v0, :cond_0

    goto :goto_1

    .line 108
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

    .line 109
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ltz v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->models:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lt v1, v2, :cond_2

    goto :goto_0

    .line 113
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->models:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/RetailerModel;

    if-eqz v1, :cond_1

    .line 115
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->module:Lcom/ibotta/api/model/base/Module;

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

.method public synthetic onListViewTouched()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmDefault;
    .end annotation

    invoke-static {p0}, Lcom/ibotta/android/views/list/IbottaListViewEvents$-CC;->$default$onListViewTouched(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method

.method public onRetailerClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 2

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    if-eqz v0, :cond_0

    .line 97
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->module:Lcom/ibotta/api/model/base/Module;

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;->onRetailerClicked(Lcom/ibotta/android/apiandroid/content/ContentId;Lcom/ibotta/api/model/base/Module;)V

    :cond_0
    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 134
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;->updateViewState(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;)V

    .line 135
    instance-of v0, p1, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState;

    if-eqz v0, :cond_0

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->hsmvRetailers:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState;->getSavedState()Landroid/os/Parcelable;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->restoreLayoutState(Landroid/os/Parcelable;)V

    goto :goto_0

    .line 137
    :cond_0
    instance-of p1, p1, Lcom/ibotta/android/mvp/ui/activity/featured/holder/DefaultFeaturedRowViewState;

    if-eqz p1, :cond_1

    .line 138
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->hsmvRetailers:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->retailerSSItemAdapter:Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/views/components/ViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 34
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedRetailersSSCardViewHolder;->updateViewState(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;)V

    return-void
.end method
