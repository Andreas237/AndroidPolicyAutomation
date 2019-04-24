.class public Lo/fim;
.super Landroid/widget/Scroller;
.source "SourceFile"


# instance fields
.field private c:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 15
    invoke-direct {p0, p1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    .line 12
    const/4 v0, 0x0

    iput v0, p0, Lo/fim;->c:I

    .line 16
    return-void
.end method


# virtual methods
.method public c(I)V
    .locals 0

    .line 37
    iput p1, p0, Lo/fim;->c:I

    .line 38
    return-void
.end method

.method public startScroll(IIII)V
    .locals 6

    .line 33
    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    iget v5, p0, Lo/fim;->c:I

    invoke-super/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V

    .line 34
    return-void
.end method

.method public startScroll(IIIII)V
    .locals 6

    .line 28
    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    iget v5, p0, Lo/fim;->c:I

    invoke-super/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V

    .line 29
    return-void
.end method
