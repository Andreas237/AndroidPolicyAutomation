.class public Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/TitleBarViewHolder;
.super Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/AbstractVerifiedRebatesViewHolder;
.source "TitleBarViewHolder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/AbstractVerifiedRebatesViewHolder<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/TitleBarRow;",
        ">;"
    }
.end annotation


# instance fields
.field private final tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/base/title/TitleBarView;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/AbstractVerifiedRebatesViewHolder;-><init>(Landroid/view/View;)V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/TitleBarViewHolder;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AbstractVerifiedRebatesRow;Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapterListener;)V
    .locals 0

    .line 15
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/TitleBarRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/TitleBarViewHolder;->bind(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/TitleBarRow;Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapterListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/TitleBarRow;Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapterListener;)V
    .locals 2

    .line 25
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/TitleBarViewHolder;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/TitleBarRow;->getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 27
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/TitleBarViewHolder;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 29
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/TitleBarViewHolder;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p2}, Lcom/ibotta/android/views/base/title/TitleBarView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    const v0, 0x7f070165

    .line 30
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, p2, Landroid/support/v7/widget/RecyclerView$LayoutParams;->leftMargin:I

    .line 31
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p2, Landroid/support/v7/widget/RecyclerView$LayoutParams;->bottomMargin:I

    const v0, 0x7f0701a3

    .line 32
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    iput p1, p2, Landroid/support/v7/widget/RecyclerView$LayoutParams;->topMargin:I

    .line 34
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/TitleBarViewHolder;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/views/base/title/TitleBarView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method
