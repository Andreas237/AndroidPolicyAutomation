.class public Lcom/shopkick/app/widget/ViewPagerScroller;
.super Landroid/widget/Scroller;
.source "ViewPagerScroller.java"


# instance fields
.field private scrollDuration:I


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 12
    invoke-direct {p0, p1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    .line 13
    iput p2, p0, Lcom/shopkick/app/widget/ViewPagerScroller;->scrollDuration:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/animation/Interpolator;I)V
    .locals 0

    .line 17
    invoke-direct {p0, p1, p2}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    .line 18
    iput p3, p0, Lcom/shopkick/app/widget/ViewPagerScroller;->scrollDuration:I

    return-void
.end method


# virtual methods
.method public startScroll(IIII)V
    .locals 6

    .line 30
    iget v5, p0, Lcom/shopkick/app/widget/ViewPagerScroller;->scrollDuration:I

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-super/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V

    return-void
.end method

.method public startScroll(IIIII)V
    .locals 6

    .line 24
    iget v5, p0, Lcom/shopkick/app/widget/ViewPagerScroller;->scrollDuration:I

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-super/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V

    return-void
.end method
