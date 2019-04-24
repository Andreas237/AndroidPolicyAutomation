.class public Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;
.super Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;
.source "QuestsModuleViewHolder.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapterListener;
.implements Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$HorizScrollingModuleListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder<",
        "Lcom/ibotta/android/mvp/ui/activity/featured/row/QuestsRow;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapterListener;",
        "Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$HorizScrollingModuleListener;"
    }
.end annotation


# instance fields
.field private final hsmvQuests:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

.field private listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

.field private final models:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;"
        }
    .end annotation
.end field

.field private module:Lcom/ibotta/api/model/base/Module;

.field private final questAdapter:Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;)V
    .locals 1

    .line 38
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;-><init>(Landroid/view/View;)V

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;->models:Ljava/util/List;

    .line 39
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;->hsmvQuests:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    .line 40
    new-instance p1, Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter;

    invoke-direct {p1}, Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;->questAdapter:Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter;

    .line 41
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;->initHorizScrollingModule()V

    return-void
.end method

.method private initHorizScrollingModule()V
    .locals 3

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;->hsmvQuests:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setListener(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$HorizScrollingModuleListener;)V

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;->hsmvQuests:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070165

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setItemSpacing(I)V

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;->hsmvQuests:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;->questAdapter:Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method public static synthetic lambda$bind$0(Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;Z)V
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;->hsmvQuests:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setVisibilityScrollTrackingEnabled(Z)V

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V
    .locals 0

    .line 28
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/row/QuestsRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;->bind(Lcom/ibotta/android/mvp/ui/activity/featured/row/QuestsRow;Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/activity/featured/row/QuestsRow;Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V
    .locals 1

    .line 52
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    .line 54
    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/featured/holder/-$$Lambda$QuestsModuleViewHolder$0XPX7f51Ew4AEFhsNqRua4BiRac;

    invoke-direct {p2, p0}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/-$$Lambda$QuestsModuleViewHolder$0XPX7f51Ew4AEFhsNqRua4BiRac;-><init>(Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;)V

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/row/QuestsRow;->setListener(Lcom/ibotta/android/views/util/VisibilityListener;)V

    .line 56
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/QuestsRow;->getModule()Lcom/ibotta/api/model/base/Module;

    move-result-object p2

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;->module:Lcom/ibotta/api/model/base/Module;

    .line 57
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;->models:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->clear()V

    .line 58
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;->models:Ljava/util/List;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/QuestsRow;->getModels()Ljava/util/List;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 60
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;->hsmvQuests:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/QuestsRow;->getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->updateTitleBarViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 62
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;->questAdapter:Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter;->setListener(Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapterListener;)V

    .line 63
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;->questAdapter:Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter;

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;->models:Ljava/util/List;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter;->setBonusModels(Ljava/util/List;)V

    return-void
.end method

.method public getRowViewState()Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 99
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState;->builder()Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;->hsmvQuests:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

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

    const-string v0, "onItemsVisible: %1$d"

    const/4 v1, 0x1

    .line 68
    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;->module:Lcom/ibotta/api/model/base/Module;

    if-nez v0, :cond_0

    goto :goto_1

    .line 73
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

    .line 74
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ltz v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;->models:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lt v1, v2, :cond_2

    goto :goto_0

    .line 78
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;->models:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/BonusModel;

    if-eqz v1, :cond_1

    .line 80
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;->module:Lcom/ibotta/api/model/base/Module;

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

.method public onQuestClicked(Lcom/ibotta/api/model/BonusModel;)V
    .locals 3

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;->module:Lcom/ibotta/api/model/base/Module;

    if-eqz v1, :cond_0

    .line 93
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;->models:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v2

    invoke-interface {v0, v1, p1, v2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;->onQuestClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/BonusModel;I)V

    :cond_0
    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 104
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;->updateViewState(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;)V

    .line 105
    instance-of v0, p1, Lcom/ibotta/android/mvp/ui/activity/featured/holder/FeaturedSSViewState;

    if-eqz v0, :cond_0

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;->hsmvQuests:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

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

    .line 28
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/QuestsModuleViewHolder;->updateViewState(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;)V

    return-void
.end method
