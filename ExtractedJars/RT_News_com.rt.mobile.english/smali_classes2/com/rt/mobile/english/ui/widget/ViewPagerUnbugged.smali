.class public Lcom/rt/mobile/english/ui/widget/ViewPagerUnbugged;
.super Landroid/support/v4/view/ViewPager;
.source "ViewPagerUnbugged.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Landroid/support/v4/view/ViewPager;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method protected onSizeChanged(IIII)V
    .locals 1

    .line 22
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/ViewPagerUnbugged;->getPageMargin()I

    move-result v0

    sub-int/2addr p1, v0

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/ViewPagerUnbugged;->getPageMargin()I

    move-result v0

    sub-int/2addr p3, v0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/support/v4/view/ViewPager;->onSizeChanged(IIII)V

    return-void
.end method
