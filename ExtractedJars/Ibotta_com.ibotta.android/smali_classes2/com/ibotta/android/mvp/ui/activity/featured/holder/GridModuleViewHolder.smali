.class public Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder;
.super Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;
.source "GridModuleViewHolder.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder$CategoryToClickListenerMapper;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder<",
        "Lcom/ibotta/android/mvp/ui/activity/featured/row/GridRow;",
        ">;"
    }
.end annotation


# instance fields
.field private final gridModuleView:Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;-><init>(Landroid/view/View;)V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder;->gridModuleView:Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;

    return-void
.end method

.method private mapCategoriesToViewModels(Ljava/util/List;Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder$CategoryToClickListenerMapper;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Category;",
            ">;",
            "Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder$CategoryToClickListenerMapper;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/grid/GridCardView$ViewModel;",
            ">;"
        }
    .end annotation

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 40
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/retailer/Category;

    .line 41
    invoke-direct {p0, v1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder;->mapCategoryToViewModel(Lcom/ibotta/api/model/retailer/Category;Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder$CategoryToClickListenerMapper;)Lcom/ibotta/android/mvp/ui/view/grid/GridCardView$ViewModel;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private mapCategoryToViewModel(Lcom/ibotta/api/model/retailer/Category;Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder$CategoryToClickListenerMapper;)Lcom/ibotta/android/mvp/ui/view/grid/GridCardView$ViewModel;
    .locals 2

    .line 64
    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder$CategoryToClickListenerMapper;->map(Lcom/ibotta/api/model/retailer/Category;)Landroid/view/View$OnClickListener;

    move-result-object p2

    .line 65
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/grid/GridCardView$ViewModel;

    invoke-virtual {p1}, Lcom/ibotta/api/model/retailer/Category;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/api/model/retailer/Category;->getIconUrl()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1, p2}, Lcom/ibotta/android/mvp/ui/view/grid/GridCardView$ViewModel;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V
    .locals 0

    .line 15
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/row/GridRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder;->bind(Lcom/ibotta/android/mvp/ui/activity/featured/row/GridRow;Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/activity/featured/row/GridRow;Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V
    .locals 4

    .line 25
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/GridRow;->getModule()Lcom/ibotta/api/model/base/Module;

    move-result-object v0

    .line 28
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/GridRow;->getCategories()Ljava/util/List;

    move-result-object v1

    .line 29
    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder$CategoryToClickListenerMapper;

    const/4 v3, 0x0

    invoke-direct {v2, p2, v0, v3}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder$CategoryToClickListenerMapper;-><init>(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;Lcom/ibotta/api/model/base/Module;Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder$1;)V

    .line 31
    invoke-direct {p0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder;->mapCategoriesToViewModels(Ljava/util/List;Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder$CategoryToClickListenerMapper;)Ljava/util/List;

    move-result-object p2

    .line 34
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/GridModuleViewHolder;->gridModuleView:Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/featured/row/GridRow;->getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    invoke-virtual {v1, v0, p2, p1}, Lcom/ibotta/android/mvp/ui/view/grid/GridModuleView;->updateRows(Lcom/ibotta/api/model/base/Module;Ljava/util/List;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    return-void
.end method
