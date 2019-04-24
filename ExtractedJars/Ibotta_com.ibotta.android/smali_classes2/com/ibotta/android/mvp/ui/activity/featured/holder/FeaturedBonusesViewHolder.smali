.class public Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;
.super Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;
.source "FeaturedBonusesViewHolder.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$BonusesListener;
.implements Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$HorizScrollingModuleListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder<",
        "Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedBonusRow;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$BonusesListener;",
        "Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$HorizScrollingModuleListener;"
    }
.end annotation


# instance fields
.field private bonusesAdapter:Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;

.field private hsmvBonuses:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

.field private listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

.field private models:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;"
        }
    .end annotation
.end field

.field private module:Lcom/ibotta/api/model/base/Module;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;)V
    .locals 2

    .line 39
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;-><init>(Landroid/view/View;)V

    .line 33
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->bonusesAdapter:Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;

    .line 40
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->hsmvBonuses:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->hsmvBonuses:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v1, 0x7f0600fc

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setBackgroundColor(I)V

    .line 43
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->bonusesAdapter:Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;->setListener(Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter$BonusesListener;)V

    return-void
.end method

.method public static synthetic lambda$bind$0(Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;Z)V
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->hsmvBonuses:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setVisibilityScrollTrackingEnabled(Z)V

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V
    .locals 0

    .line 29
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedBonusRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->bind(Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedBonusRow;Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedBonusRow;Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V
    .locals 1

    .line 48
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    .line 50
    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/featured/holder/-$$Lambda$FeaturedBonusesViewHolder$LsD6JiKIHaa_goL4R0G-XtaI-kA;

    invoke-direct {p2, p0}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/-$$Lambda$FeaturedBonusesViewHolder$LsD6JiKIHaa_goL4R0G-XtaI-kA;-><init>(Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;)V

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedBonusRow;->setListener(Lcom/ibotta/android/views/util/VisibilityListener;)V

    .line 52
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedBonusRow;->getModule()Lcom/ibotta/api/model/base/Module;

    move-result-object p2

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->module:Lcom/ibotta/api/model/base/Module;

    .line 53
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedBonusRow;->getModels()Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->models:Ljava/util/List;

    .line 55
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->bonusesAdapter:Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->models:Ljava/util/List;

    invoke-static {v0}, Lcom/ibotta/android/mvp/parser/BonusParser;->fromBonusModels(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;->setBonusItems(Ljava/util/List;)V

    .line 57
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->hsmvBonuses:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedBonusRow;->getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->updateTitleBarViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 58
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->hsmvBonuses:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->bonusesAdapter:Lcom/ibotta/android/mvp/ui/view/bonus/BonusesAdapter;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 60
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->module:Lcom/ibotta/api/model/base/Module;

    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getMoreAction()Lcom/ibotta/api/model/content/Action;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->module:Lcom/ibotta/api/model/base/Module;

    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getMoreAction()Lcom/ibotta/api/model/content/Action;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/api/model/content/Action;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 61
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->hsmvBonuses:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->module:Lcom/ibotta/api/model/base/Module;

    invoke-virtual {p2}, Lcom/ibotta/api/model/base/Module;->getMoreAction()Lcom/ibotta/api/model/content/Action;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ibotta/api/model/content/Action;->getText()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setBottomButtonLabel(Ljava/lang/String;)V

    goto :goto_0

    .line 63
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->hsmvBonuses:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setBottomButtonLabel(Ljava/lang/String;)V

    .line 66
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->hsmvBonuses:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setListener(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$HorizScrollingModuleListener;)V

    return-void
.end method

.method public getRowViewState()Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 103
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState;->builder()Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->hsmvBonuses:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->getLayoutState()Landroid/os/Parcelable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState$Builder;->savedState(Landroid/os/Parcelable;)Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState;

    move-result-object v0

    return-object v0
.end method

.method public onBonusClicked(Lcom/ibotta/android/view/model/content/BonusItem;)V
    .locals 2

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    if-eqz v0, :cond_0

    .line 72
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->module:Lcom/ibotta/api/model/base/Module;

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;->onBonusClicked(Lcom/ibotta/android/view/model/content/BonusItem;Lcom/ibotta/api/model/base/Module;)V

    :cond_0
    return-void
.end method

.method public onBottomButtonClicked()V
    .locals 3

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    if-eqz v0, :cond_0

    .line 97
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->module:Lcom/ibotta/api/model/base/Module;

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

    .line 78
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->module:Lcom/ibotta/api/model/base/Module;

    if-nez v0, :cond_0

    goto :goto_1

    .line 82
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

    .line 83
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ltz v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->models:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lt v1, v2, :cond_2

    goto :goto_0

    .line 87
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->models:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/BonusModel;

    if-eqz v1, :cond_1

    .line 89
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->module:Lcom/ibotta/api/model/base/Module;

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

.method public updateViewState(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 108
    instance-of v0, p1, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState;

    if-eqz v0, :cond_0

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->hsmvBonuses:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

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

    .line 29
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedBonusesViewHolder;->updateViewState(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;)V

    return-void
.end method
