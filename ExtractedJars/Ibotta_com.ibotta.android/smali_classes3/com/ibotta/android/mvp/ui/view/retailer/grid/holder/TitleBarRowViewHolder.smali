.class public Lcom/ibotta/android/mvp/ui/view/retailer/grid/holder/TitleBarRowViewHolder;
.super Lcom/ibotta/android/mvp/ui/view/retailer/grid/holder/AbstractMyRetailersViewHolder;
.source "TitleBarRowViewHolder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/view/retailer/grid/holder/AbstractMyRetailersViewHolder<",
        "Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/TitleBarRow;",
        ">;"
    }
.end annotation


# instance fields
.field private final tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/base/title/TitleBarView;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/holder/AbstractMyRetailersViewHolder;-><init>(Landroid/view/View;)V

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/holder/TitleBarRowViewHolder;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRecyclerListener;)V
    .locals 0

    .line 14
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/TitleBarRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/holder/TitleBarRowViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/TitleBarRow;Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRecyclerListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/TitleBarRow;Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRecyclerListener;)V
    .locals 2

    .line 24
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/holder/TitleBarRowViewHolder;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/TitleBarRow;->getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 26
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/holder/TitleBarRowViewHolder;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 28
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/holder/TitleBarRowViewHolder;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p2}, Lcom/ibotta/android/views/base/title/TitleBarView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    const v0, 0x7f070165

    .line 29
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, p2, Landroid/support/v7/widget/RecyclerView$LayoutParams;->leftMargin:I

    .line 30
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    iput p1, p2, Landroid/support/v7/widget/RecyclerView$LayoutParams;->bottomMargin:I

    .line 32
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/holder/TitleBarRowViewHolder;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/views/base/title/TitleBarView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method
