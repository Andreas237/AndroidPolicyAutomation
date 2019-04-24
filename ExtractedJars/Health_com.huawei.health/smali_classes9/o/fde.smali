.class public Lo/fde;
.super Landroid/widget/HorizontalScrollView;
.source "SourceFile"


# instance fields
.field private c:Lo/fcw;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 11
    invoke-direct {p0, p1}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;)V

    .line 8
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fde;->c:Lo/fcw;

    .line 12
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 15
    invoke-direct {p0, p1, p2}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 8
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fde;->c:Lo/fcw;

    .line 16
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 19
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 8
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fde;->c:Lo/fcw;

    .line 20
    return-void
.end method


# virtual methods
.method protected onScrollChanged(IIII)V
    .locals 6

    .line 28
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/HorizontalScrollView;->onScrollChanged(IIII)V

    .line 29
    iget-object v0, p0, Lo/fde;->c:Lo/fcw;

    if-eqz v0, :cond_0

    .line 30
    iget-object v0, p0, Lo/fde;->c:Lo/fcw;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Lo/fcw;->c(Lo/fde;IIII)V

    .line 32
    :cond_0
    return-void
.end method

.method public setScrollViewListener(Lo/fcw;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lo/fde;->c:Lo/fcw;

    .line 24
    return-void
.end method
