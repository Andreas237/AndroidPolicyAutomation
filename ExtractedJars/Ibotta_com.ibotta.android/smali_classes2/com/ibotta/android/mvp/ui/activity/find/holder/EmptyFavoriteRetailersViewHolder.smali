.class public Lcom/ibotta/android/mvp/ui/activity/find/holder/EmptyFavoriteRetailersViewHolder;
.super Lcom/ibotta/android/mvp/ui/activity/find/holder/AbstractFindRebatesViewHolder;
.source "EmptyFavoriteRetailersViewHolder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/activity/find/holder/AbstractFindRebatesViewHolder<",
        "Lcom/ibotta/android/mvp/ui/activity/find/row/EmptyFavoriteRetailersRow;",
        ">;"
    }
.end annotation


# instance fields
.field private final evEmptyView:Lcom/ibotta/android/views/empty/EmptyView;

.field private listener:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/empty/EmptyView;)V
    .locals 1

    .line 22
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/find/holder/AbstractFindRebatesViewHolder;-><init>(Landroid/view/View;)V

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/EmptyFavoriteRetailersViewHolder;->evEmptyView:Lcom/ibotta/android/views/empty/EmptyView;

    .line 24
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/EmptyFavoriteRetailersViewHolder;->evEmptyView:Lcom/ibotta/android/views/empty/EmptyView;

    const v0, 0x7f0600fe

    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/empty/EmptyView;->setBackgroundResource(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;)V
    .locals 0

    .line 16
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/find/row/EmptyFavoriteRetailersRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/find/holder/EmptyFavoriteRetailersViewHolder;->bind(Lcom/ibotta/android/mvp/ui/activity/find/row/EmptyFavoriteRetailersRow;Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/activity/find/row/EmptyFavoriteRetailersRow;Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;)V
    .locals 3

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/EmptyFavoriteRetailersViewHolder;->listener:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapterListener;

    .line 31
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/holder/EmptyFavoriteRetailersViewHolder;->evEmptyView:Lcom/ibotta/android/views/empty/EmptyView;

    new-instance p2, Lcom/ibotta/android/views/empty/EmptyViewState;

    .line 33
    invoke-virtual {p1}, Lcom/ibotta/android/views/empty/EmptyView;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f1102b4

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    const v2, 0x7f0801a3

    invoke-direct {p2, v2, v0, v1}, Lcom/ibotta/android/views/empty/EmptyViewState;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 31
    invoke-virtual {p1, p2}, Lcom/ibotta/android/views/empty/EmptyView;->updateViewState(Lcom/ibotta/android/views/empty/EmptyViewState;)V

    return-void
.end method
