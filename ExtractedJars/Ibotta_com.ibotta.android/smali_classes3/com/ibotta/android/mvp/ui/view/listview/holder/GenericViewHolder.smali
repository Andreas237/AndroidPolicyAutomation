.class public Lcom/ibotta/android/mvp/ui/view/listview/holder/GenericViewHolder;
.super Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;
.source "GenericViewHolder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/views/list/holder/IbottaListViewHolder<",
        "Lcom/ibotta/android/views/list/NoRowViewState;",
        "Lcom/ibotta/android/views/list/IbottaListViewEvents;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 11
    check-cast p1, Lcom/ibotta/android/views/list/IbottaListViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/listview/holder/GenericViewHolder;->bindViewEvents(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 11
    check-cast p1, Lcom/ibotta/android/views/list/NoRowViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/listview/holder/GenericViewHolder;->updateViewState(Lcom/ibotta/android/views/list/NoRowViewState;)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/list/ContentViewState;)V
    .locals 0

    .line 11
    check-cast p1, Lcom/ibotta/android/views/list/NoRowViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/listview/holder/GenericViewHolder;->updateViewState(Lcom/ibotta/android/views/list/NoRowViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/list/NoRowViewState;)V
    .locals 0

    return-void
.end method
