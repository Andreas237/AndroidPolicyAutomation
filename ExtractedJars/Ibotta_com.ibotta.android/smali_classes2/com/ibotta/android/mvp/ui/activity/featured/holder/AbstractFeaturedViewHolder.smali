.class public abstract Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "AbstractFeaturedViewHolder.java"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;",
        ">",
        "Landroid/support/v7/widget/RecyclerView$ViewHolder;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;",
        "Lcom/ibotta/android/views/components/NoViewEvents;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 3

    .line 28
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 30
    new-instance v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/support/v7/widget/RecyclerView$LayoutParams;-><init>(II)V

    .line 32
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method


# virtual methods
.method public abstract bind(Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;",
            "Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRecyclerAdapterListener;",
            ")V"
        }
    .end annotation
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/components/NoViewEvents;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/views/components/NoViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    return-void
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/views/components/ViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 22
    check-cast p1, Lcom/ibotta/android/views/components/NoViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;->bindViewEvents(Lcom/ibotta/android/views/components/NoViewEvents;)V

    return-void
.end method

.method public getRowViewState()Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 43
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/featured/holder/DefaultFeaturedRowViewState;->EMPTY:Lcom/ibotta/android/mvp/ui/activity/featured/holder/DefaultFeaturedRowViewState;

    return-object v0
.end method

.method public onViewAttachedToWindow()V
    .locals 0

    return-void
.end method

.method public onViewDetachedToWindow()V
    .locals 0

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/views/components/ViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 22
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/featured/holder/AbstractFeaturedViewHolder;->updateViewState(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowViewState;)V

    return-void
.end method
