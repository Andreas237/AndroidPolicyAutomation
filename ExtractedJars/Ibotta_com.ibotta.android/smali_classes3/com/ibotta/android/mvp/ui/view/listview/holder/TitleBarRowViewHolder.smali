.class public Lcom/ibotta/android/mvp/ui/view/listview/holder/TitleBarRowViewHolder;
.super Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;
.source "TitleBarRowViewHolder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/views/list/holder/IbottaListViewHolder<",
        "Lcom/ibotta/android/views/base/title/TitleBarViewState;",
        "Lcom/ibotta/android/views/list/IbottaListViewEvents;",
        ">;"
    }
.end annotation


# instance fields
.field private final tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/base/title/TitleBarView;)V
    .locals 3

    .line 20
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;-><init>(Landroid/view/View;)V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/TitleBarRowViewHolder;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    .line 23
    new-instance v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/support/v7/widget/RecyclerView$LayoutParams;-><init>(II)V

    .line 25
    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/base/title/TitleBarView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 27
    invoke-virtual {p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070165

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->leftMargin:I

    .line 28
    invoke-virtual {p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->bottomMargin:I

    .line 30
    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/base/title/TitleBarView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 15
    check-cast p1, Lcom/ibotta/android/views/list/IbottaListViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/listview/holder/TitleBarRowViewHolder;->bindViewEvents(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V
    .locals 0

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/holder/TitleBarRowViewHolder;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 15
    check-cast p1, Lcom/ibotta/android/views/base/title/TitleBarViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/listview/holder/TitleBarRowViewHolder;->updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/list/ContentViewState;)V
    .locals 0

    .line 15
    check-cast p1, Lcom/ibotta/android/views/base/title/TitleBarViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/listview/holder/TitleBarRowViewHolder;->updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    return-void
.end method
