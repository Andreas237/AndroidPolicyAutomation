.class public Lcom/ibotta/android/mvp/ui/view/listview/holder/NoResultsViewHolder;
.super Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;
.source "NoResultsViewHolder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/views/list/holder/IbottaListViewHolder<",
        "Lcom/ibotta/android/views/empty/EmptyViewState;",
        "Lcom/ibotta/android/views/empty/EmptyViewEvents;",
        ">;"
    }
.end annotation


# instance fields
.field private final evEmpty:Lcom/ibotta/android/views/empty/EmptyView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/empty/EmptyView;)V
    .locals 3

    .line 21
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;-><init>(Landroid/view/View;)V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/NoResultsViewHolder;->evEmpty:Lcom/ibotta/android/views/empty/EmptyView;

    .line 23
    new-instance v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/support/v7/widget/RecyclerView$LayoutParams;-><init>(II)V

    .line 25
    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/empty/EmptyView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/views/components/ViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 16
    check-cast p1, Lcom/ibotta/android/views/empty/EmptyViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/listview/holder/NoResultsViewHolder;->bindViewEvents(Lcom/ibotta/android/views/empty/EmptyViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/empty/EmptyViewEvents;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/empty/EmptyViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/NoResultsViewHolder;->evEmpty:Lcom/ibotta/android/views/empty/EmptyView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/empty/EmptyView;->bindViewEvents(Lcom/ibotta/android/views/empty/EmptyViewEvents;)V

    return-void
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/views/list/IbottaListViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 16
    check-cast p1, Lcom/ibotta/android/views/empty/EmptyViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/listview/holder/NoResultsViewHolder;->bindViewEvents(Lcom/ibotta/android/views/empty/EmptyViewEvents;)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/views/components/ViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 16
    check-cast p1, Lcom/ibotta/android/views/empty/EmptyViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/listview/holder/NoResultsViewHolder;->updateViewState(Lcom/ibotta/android/views/empty/EmptyViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/empty/EmptyViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/empty/EmptyViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/NoResultsViewHolder;->evEmpty:Lcom/ibotta/android/views/empty/EmptyView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/empty/EmptyView;->updateViewState(Lcom/ibotta/android/views/empty/EmptyViewState;)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/list/ContentViewState;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/views/list/ContentViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 16
    check-cast p1, Lcom/ibotta/android/views/empty/EmptyViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/listview/holder/NoResultsViewHolder;->updateViewState(Lcom/ibotta/android/views/empty/EmptyViewState;)V

    return-void
.end method
