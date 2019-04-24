.class public Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxTitleBarRowViewHolder;
.super Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/AbstractEarningsDetailViewHolder;
.source "TxTitleBarRowViewHolder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/AbstractEarningsDetailViewHolder<",
        "Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxTitleRow;",
        ">;"
    }
.end annotation


# instance fields
.field private final tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/base/title/TitleBarView;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/AbstractEarningsDetailViewHolder;-><init>(Landroid/view/View;)V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxTitleBarRowViewHolder;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailRow;Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;)V
    .locals 0

    .line 14
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxTitleRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxTitleBarRowViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxTitleRow;Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxTitleRow;Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailAdapterListener;)V
    .locals 2

    .line 25
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxTitleBarRowViewHolder;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxTitleRow;->getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 27
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxTitleBarRowViewHolder;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f070165

    .line 28
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    const v0, 0x7f07016d

    .line 29
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    const v1, 0x7f07018d

    .line 30
    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    .line 32
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxTitleBarRowViewHolder;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {v1, p2, p1, p2, v0}, Lcom/ibotta/android/views/base/title/TitleBarView;->setPadding(IIII)V

    .line 33
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/holder/TxTitleBarRowViewHolder;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    const p2, 0x7f060171

    invoke-virtual {p1, p2}, Lcom/ibotta/android/views/base/title/TitleBarView;->setBackgroundResource(I)V

    return-void
.end method
