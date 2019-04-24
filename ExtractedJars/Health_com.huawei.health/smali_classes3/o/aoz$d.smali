.class public Lo/aoz$d;
.super Landroid/text/method/LinkMovementMethod;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aoz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# static fields
.field private static e:Lo/aoz$d;


# instance fields
.field private c:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 55
    invoke-direct {p0}, Landroid/text/method/LinkMovementMethod;-><init>()V

    return-void
.end method

.method public static b()Lo/aoz$d;
    .locals 2

    .line 68
    sget-object v0, Lo/aoz$d;->e:Lo/aoz$d;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 70
    new-instance v0, Lo/aoz$d;

    invoke-direct {v0}, Lo/aoz$d;-><init>()V

    sput-object v0, Lo/aoz$d;->e:Lo/aoz$d;

    .line 72
    :cond_0
    sget-object v0, Lo/aoz$d;->e:Lo/aoz$d;

    return-object v0
.end method


# virtual methods
.method public onTouchEvent(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/MotionEvent;)Z
    .locals 11

    .line 78
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getAction()I

    move-result v4

    .line 80
    const/4 v0, 0x1

    if-eq v4, v0, :cond_0

    if-nez v4, :cond_4

    .line 82
    :cond_0
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v5, v0

    .line 83
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v6, v0

    .line 85
    invoke-virtual {p1}, Landroid/widget/TextView;->getTotalPaddingTop()I

    move-result v0

    sub-int/2addr v6, v0

    .line 86
    invoke-virtual {p1}, Landroid/widget/TextView;->getTotalPaddingLeft()I

    move-result v0

    sub-int/2addr v5, v0

    .line 88
    invoke-virtual {p1}, Landroid/widget/TextView;->getScrollY()I

    move-result v0

    add-int/2addr v6, v0

    .line 89
    invoke-virtual {p1}, Landroid/widget/TextView;->getScrollX()I

    move-result v0

    add-int/2addr v5, v0

    .line 91
    invoke-virtual {p1}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v7

    .line 92
    invoke-virtual {v7, v6}, Landroid/text/Layout;->getLineForVertical(I)I

    move-result v8

    .line 93
    int-to-float v0, v5

    invoke-virtual {v7, v8, v0}, Landroid/text/Layout;->getOffsetForHorizontal(IF)I

    move-result v9

    .line 95
    const-class v0, Landroid/text/style/ClickableSpan;

    invoke-interface {p2, v9, v9, v0}, Landroid/text/Spannable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, [Landroid/text/style/ClickableSpan;

    .line 97
    array-length v0, v10

    if-eqz v0, :cond_3

    .line 99
    const/4 v0, 0x1

    if-ne v4, v0, :cond_1

    .line 101
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lo/aoz$d;->c:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1f4

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    .line 103
    const/4 v0, 0x0

    aget-object v0, v10, v0

    invoke-virtual {v0, p1}, Landroid/text/style/ClickableSpan;->onClick(Landroid/view/View;)V

    goto :goto_0

    .line 108
    :cond_1
    const/4 v0, 0x0

    aget-object v0, v10, v0

    invoke-interface {p2, v0}, Landroid/text/Spannable;->getSpanStart(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x0

    aget-object v1, v10, v1

    invoke-interface {p2, v1}, Landroid/text/Spannable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p2, v0, v1}, Landroid/text/Selection;->setSelection(Landroid/text/Spannable;II)V

    .line 109
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/aoz$d;->c:J

    .line 111
    :cond_2
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 115
    :cond_3
    invoke-static {p2}, Landroid/text/Selection;->removeSelection(Landroid/text/Spannable;)V

    .line 118
    :cond_4
    invoke-super {p0, p1, p2, p3}, Landroid/text/method/LinkMovementMethod;->onTouchEvent(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method
