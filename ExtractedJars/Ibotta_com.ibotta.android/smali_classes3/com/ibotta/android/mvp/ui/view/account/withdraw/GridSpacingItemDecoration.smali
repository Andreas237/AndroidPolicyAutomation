.class public Lcom/ibotta/android/mvp/ui/view/account/withdraw/GridSpacingItemDecoration;
.super Landroid/support/v7/widget/RecyclerView$ItemDecoration;
.source "GridSpacingItemDecoration.java"


# instance fields
.field private spacing:I

.field private spanCount:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 21
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$ItemDecoration;-><init>()V

    .line 22
    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GridSpacingItemDecoration;->spanCount:I

    .line 23
    iput p2, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GridSpacingItemDecoration;->spacing:I

    return-void
.end method

.method private getDistanceFromFirstGiftCardInPack(Lcom/ibotta/android/mvp/ui/activity/account/withdraw/WithdrawAdapter;I)I
    .locals 5

    move v0, p2

    move v1, v0

    :goto_0
    if-ltz v0, :cond_1

    .line 62
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/account/withdraw/WithdrawAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/activity/account/withdraw/row/AbstractWithdrawRow;

    move-result-object v2

    .line 63
    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/account/withdraw/row/AbstractWithdrawRow;->getTypeEnum()Lcom/ibotta/android/mvp/ui/activity/account/withdraw/row/WithdrawRowType;

    move-result-object v2

    sget-object v3, Lcom/ibotta/android/mvp/ui/activity/account/withdraw/row/WithdrawRowType;->GIFT_CARD:Lcom/ibotta/android/mvp/ui/activity/account/withdraw/row/WithdrawRowType;

    if-eq v2, v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v0, -0x1

    move v4, v1

    move v1, v0

    move v0, v4

    goto :goto_0

    :cond_1
    :goto_1
    sub-int/2addr p2, v1

    return p2
.end method


# virtual methods
.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$State;)V
    .locals 4

    .line 28
    invoke-virtual {p3, p2}, Landroid/support/v7/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result v0

    .line 30
    invoke-virtual {p3}, Landroid/support/v7/widget/RecyclerView;->getAdapter()Landroid/support/v7/widget/RecyclerView$Adapter;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/account/withdraw/WithdrawAdapter;

    .line 32
    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/account/withdraw/WithdrawAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/activity/account/withdraw/row/AbstractWithdrawRow;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/account/withdraw/row/AbstractWithdrawRow;->getTypeEnum()Lcom/ibotta/android/mvp/ui/activity/account/withdraw/row/WithdrawRowType;

    move-result-object v2

    .line 34
    sget-object v3, Lcom/ibotta/android/mvp/ui/activity/account/withdraw/row/WithdrawRowType;->GIFT_CARD:Lcom/ibotta/android/mvp/ui/activity/account/withdraw/row/WithdrawRowType;

    if-eq v2, v3, :cond_0

    .line 36
    invoke-super {p0, p1, p2, p3, p4}, Landroid/support/v7/widget/RecyclerView$ItemDecoration;->getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$State;)V

    goto :goto_2

    .line 38
    :cond_0
    invoke-direct {p0, v1, v0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GridSpacingItemDecoration;->getDistanceFromFirstGiftCardInPack(Lcom/ibotta/android/mvp/ui/activity/account/withdraw/WithdrawAdapter;I)I

    move-result p2

    .line 39
    iget p3, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GridSpacingItemDecoration;->spanCount:I

    rem-int/2addr p2, p3

    if-nez p2, :cond_1

    .line 42
    iget p3, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GridSpacingItemDecoration;->spacing:I

    iput p3, p1, Landroid/graphics/Rect;->left:I

    goto :goto_0

    .line 44
    :cond_1
    iget p3, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GridSpacingItemDecoration;->spacing:I

    div-int/lit8 p3, p3, 0x2

    iput p3, p1, Landroid/graphics/Rect;->left:I

    .line 47
    :goto_0
    iget p3, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GridSpacingItemDecoration;->spanCount:I

    add-int/lit8 p3, p3, -0x1

    if-ne p2, p3, :cond_2

    .line 48
    iget p2, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GridSpacingItemDecoration;->spacing:I

    iput p2, p1, Landroid/graphics/Rect;->right:I

    goto :goto_1

    .line 50
    :cond_2
    iget p2, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GridSpacingItemDecoration;->spacing:I

    div-int/lit8 p2, p2, 0x2

    iput p2, p1, Landroid/graphics/Rect;->right:I

    .line 53
    :goto_1
    iget p2, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GridSpacingItemDecoration;->spacing:I

    iput p2, p1, Landroid/graphics/Rect;->top:I

    .line 54
    iput p2, p1, Landroid/graphics/Rect;->bottom:I

    :goto_2
    return-void
.end method
