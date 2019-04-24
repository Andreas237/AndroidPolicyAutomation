.class public Lcom/ibotta/android/mvp/ui/activity/find/holder/RetailerCategoriesViewHolder;
.super Lcom/ibotta/android/mvp/ui/activity/find/holder/AbstractFindRebatesViewHolder;
.source "RetailerCategoriesViewHolder.java"

# interfaces
.implements Lcom/ibotta/android/views/categories/RetailerCategoryViewEvents;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/activity/find/holder/AbstractFindRebatesViewHolder<",
        "Lcom/ibotta/android/mvp/ui/activity/find/row/RetailerCategoriesRow;",
        ">;",
        "Lcom/ibotta/android/views/categories/RetailerCategoryViewEvents;"
    }
.end annotation


# instance fields
.field private listener:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private rcvRetailerCategories:Lcom/ibotta/android/views/categories/RetailerCategoriesView;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/categories/RetailerCategoriesView;)V
    .locals 2

    .line 23
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/find/holder/AbstractFindRebatesViewHolder;-><init>(Landroid/view/View;)V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/RetailerCategoriesViewHolder;->rcvRetailerCategories:Lcom/ibotta/android/views/categories/RetailerCategoriesView;

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/RetailerCategoriesViewHolder;->rcvRetailerCategories:Lcom/ibotta/android/views/categories/RetailerCategoriesView;

    .line 26
    invoke-virtual {p1}, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v1, 0x7f0701a2

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    .line 25
    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->setTopMargin(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;)V
    .locals 0

    .line 16
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/find/row/RetailerCategoriesRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/find/holder/RetailerCategoriesViewHolder;->bind(Lcom/ibotta/android/mvp/ui/activity/find/row/RetailerCategoriesRow;Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/activity/find/row/RetailerCategoriesRow;Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;)V
    .locals 0

    .line 31
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/RetailerCategoriesViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;

    .line 32
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/RetailerCategoriesViewHolder;->rcvRetailerCategories:Lcom/ibotta/android/views/categories/RetailerCategoriesView;

    if-eqz p2, :cond_0

    .line 33
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/find/row/RetailerCategoriesRow;->getCategories()Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->updateViewState(Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;)V

    .line 34
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/RetailerCategoriesViewHolder;->rcvRetailerCategories:Lcom/ibotta/android/views/categories/RetailerCategoriesView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/views/categories/RetailerCategoriesView;->bindViewEvents(Lcom/ibotta/android/views/categories/RetailerCategoryViewEvents;)V

    :cond_0
    return-void
.end method

.method public onRetailerCategoryClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/RetailerCategoriesViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;

    if-eqz v0, :cond_0

    .line 41
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;->onRetailerCategoryClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V

    :cond_0
    return-void
.end method
