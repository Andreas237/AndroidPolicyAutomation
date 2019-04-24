.class public Lcom/huawei/pay/ui/widget/LocalLinkMovementMethod;
.super Landroid/text/method/LinkMovementMethod;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/pay/ui/widget/LocalLinkMovementMethod$Singletone;
    }
.end annotation


# instance fields
.field private clickColor:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 25
    invoke-direct {p0}, Landroid/text/method/LinkMovementMethod;-><init>()V

    .line 30
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/pay/ui/widget/LocalLinkMovementMethod;->clickColor:I

    return-void
.end method

.method public static getInstance()Lcom/huawei/pay/ui/widget/LocalLinkMovementMethod;
    .locals 1

    .line 39
    sget-object v0, Lcom/huawei/pay/ui/widget/LocalLinkMovementMethod$Singletone;->INSTANCE:Lcom/huawei/pay/ui/widget/LocalLinkMovementMethod;

    return-object v0
.end method


# virtual methods
.method public onTouchEvent(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/MotionEvent;)Z
    .locals 11

    .line 50
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getAction()I

    move-result v4

    .line 52
    const/4 v0, 0x1

    if-eq v4, v0, :cond_0

    if-nez v4, :cond_4

    .line 54
    :cond_0
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v5, v0

    .line 55
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v6, v0

    .line 58
    invoke-virtual {p1}, Landroid/widget/TextView;->getTotalPaddingLeft()I

    move-result v0

    sub-int/2addr v5, v0

    .line 59
    invoke-virtual {p1}, Landroid/widget/TextView;->getTotalPaddingTop()I

    move-result v0

    sub-int/2addr v6, v0

    .line 62
    invoke-virtual {p1}, Landroid/widget/TextView;->getScrollX()I

    move-result v0

    add-int/2addr v5, v0

    .line 63
    invoke-virtual {p1}, Landroid/widget/TextView;->getScrollY()I

    move-result v0

    add-int/2addr v6, v0

    .line 67
    invoke-virtual {p1}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v7

    .line 69
    invoke-virtual {v7, v6}, Landroid/text/Layout;->getLineForVertical(I)I

    move-result v8

    .line 71
    int-to-float v0, v5

    invoke-virtual {v7, v8, v0}, Landroid/text/Layout;->getOffsetForHorizontal(IF)I

    move-result v9

    .line 76
    const-class v0, Landroid/text/style/ClickableSpan;

    invoke-interface {p2, v9, v9, v0}, Landroid/text/Spannable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, [Landroid/text/style/ClickableSpan;

    .line 78
    array-length v0, v10

    if-eqz v0, :cond_3

    .line 80
    const/4 v0, 0x1

    if-ne v4, v0, :cond_1

    .line 82
    const/4 v0, 0x0

    aget-object v0, v10, v0

    invoke-virtual {v0, p1}, Landroid/text/style/ClickableSpan;->onClick(Landroid/view/View;)V

    .line 84
    new-instance v0, Landroid/text/style/BackgroundColorSpan;

    iget v1, p0, Lcom/huawei/pay/ui/widget/LocalLinkMovementMethod;->clickColor:I

    invoke-direct {v0, v1}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    const/4 v1, 0x0

    aget-object v1, v10, v1

    invoke-interface {p2, v1}, Landroid/text/Spannable;->getSpanStart(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, 0x0

    aget-object v2, v10, v2

    .line 85
    invoke-interface {p2, v2}, Landroid/text/Spannable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v2

    .line 84
    const/16 v3, 0x21

    invoke-interface {p2, v0, v1, v2, v3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_0

    .line 88
    :cond_1
    if-nez v4, :cond_2

    .line 90
    new-instance v0, Landroid/text/style/BackgroundColorSpan;

    iget v1, p0, Lcom/huawei/pay/ui/widget/LocalLinkMovementMethod;->clickColor:I

    invoke-direct {v0, v1}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    const/4 v1, 0x0

    aget-object v1, v10, v1

    invoke-interface {p2, v1}, Landroid/text/Spannable;->getSpanStart(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, 0x0

    aget-object v2, v10, v2

    .line 91
    invoke-interface {p2, v2}, Landroid/text/Spannable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v2

    .line 90
    const/16 v3, 0x21

    invoke-interface {p2, v0, v1, v2, v3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 94
    :cond_2
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 98
    :cond_3
    invoke-static {p2}, Landroid/text/Selection;->removeSelection(Landroid/text/Spannable;)V

    .line 99
    invoke-static {p1, p2, p3}, Landroid/text/method/Touch;->onTouchEvent(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/MotionEvent;)Z

    .line 100
    const/4 v0, 0x0

    return v0

    .line 103
    :cond_4
    invoke-static {p1, p2, p3}, Landroid/text/method/Touch;->onTouchEvent(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public setClickColor(I)V
    .locals 0

    .line 44
    iput p1, p0, Lcom/huawei/pay/ui/widget/LocalLinkMovementMethod;->clickColor:I

    .line 45
    return-void
.end method
