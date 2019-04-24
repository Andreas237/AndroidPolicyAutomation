.class public Lcom/ibotta/android/mvp/ui/view/listview/holder/IbottaNestedListViewHolder;
.super Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;
.source "IbottaNestedListViewHolder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/views/list/holder/IbottaListViewHolder<",
        "Lcom/ibotta/android/views/list/IbottaListViewState;",
        "Lcom/ibotta/android/views/list/IbottaListViewEvents;",
        ">;"
    }
.end annotation


# instance fields
.field private final ilvList:Lcom/ibotta/android/views/list/IbottaListView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/list/IbottaListView;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;-><init>(Landroid/view/View;)V

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/IbottaNestedListViewHolder;->ilvList:Lcom/ibotta/android/views/list/IbottaListView;

    return-void
.end method


# virtual methods
.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 11
    check-cast p1, Lcom/ibotta/android/views/list/IbottaListViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/listview/holder/IbottaNestedListViewHolder;->bindViewEvents(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/IbottaNestedListViewHolder;->ilvList:Lcom/ibotta/android/views/list/IbottaListView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/list/IbottaListView;->bindViewEvents(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 11
    check-cast p1, Lcom/ibotta/android/views/list/IbottaListViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/listview/holder/IbottaNestedListViewHolder;->updateViewState(Lcom/ibotta/android/views/list/IbottaListViewState;)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/list/ContentViewState;)V
    .locals 0

    .line 11
    check-cast p1, Lcom/ibotta/android/views/list/IbottaListViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/listview/holder/IbottaNestedListViewHolder;->updateViewState(Lcom/ibotta/android/views/list/IbottaListViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/list/IbottaListViewState;)V
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/IbottaNestedListViewHolder;->ilvList:Lcom/ibotta/android/views/list/IbottaListView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/list/IbottaListView;->updateViewState(Lcom/ibotta/android/views/list/IbottaListViewState;)V

    return-void
.end method
