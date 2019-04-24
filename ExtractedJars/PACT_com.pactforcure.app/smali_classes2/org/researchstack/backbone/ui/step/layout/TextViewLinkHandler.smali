.class public abstract Lorg/researchstack/backbone/ui/step/layout/TextViewLinkHandler;
.super Landroid/text/method/LinkMovementMethod;
.source "TextViewLinkHandler.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Landroid/text/method/LinkMovementMethod;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract onLinkClick(Ljava/lang/String;)V
.end method

.method public onTouchEvent(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/MotionEvent;)Z
    .locals 8
    .param p1, "widget"    # Landroid/widget/TextView;
    .param p2, "buffer"    # Landroid/text/Spannable;
    .param p3, "event"    # Landroid/view/MotionEvent;

    .prologue
    const/4 v6, 0x1

    .line 14
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getAction()I

    move-result v7

    if-eq v7, v6, :cond_1

    .line 16
    invoke-super {p0, p1, p2, p3}, Landroid/text/method/LinkMovementMethod;->onTouchEvent(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/MotionEvent;)Z

    move-result v6

    .line 37
    :cond_0
    :goto_0
    return v6

    .line 19
    :cond_1
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F

    move-result v7

    float-to-int v4, v7

    .line 20
    .local v4, "x":I
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    move-result v7

    float-to-int v5, v7

    .line 22
    .local v5, "y":I
    invoke-virtual {p1}, Landroid/widget/TextView;->getTotalPaddingLeft()I

    move-result v7

    sub-int/2addr v4, v7

    .line 23
    invoke-virtual {p1}, Landroid/widget/TextView;->getTotalPaddingTop()I

    move-result v7

    sub-int/2addr v5, v7

    .line 25
    invoke-virtual {p1}, Landroid/widget/TextView;->getScrollX()I

    move-result v7

    add-int/2addr v4, v7

    .line 26
    invoke-virtual {p1}, Landroid/widget/TextView;->getScrollY()I

    move-result v7

    add-int/2addr v5, v7

    .line 28
    invoke-virtual {p1}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v0

    .line 29
    .local v0, "layout":Landroid/text/Layout;
    invoke-virtual {v0, v5}, Landroid/text/Layout;->getLineForVertical(I)I

    move-result v1

    .line 30
    .local v1, "line":I
    int-to-float v7, v4

    invoke-virtual {v0, v1, v7}, Landroid/text/Layout;->getOffsetForHorizontal(IF)I

    move-result v3

    .line 32
    .local v3, "off":I
    const-class v7, Landroid/text/style/URLSpan;

    invoke-interface {p2, v3, v3, v7}, Landroid/text/Spannable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Landroid/text/style/URLSpan;

    .line 33
    .local v2, "link":[Landroid/text/style/URLSpan;
    array-length v7, v2

    if-eqz v7, :cond_0

    .line 35
    const/4 v7, 0x0

    aget-object v7, v2, v7

    invoke-virtual {v7}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0, v7}, Lorg/researchstack/backbone/ui/step/layout/TextViewLinkHandler;->onLinkClick(Ljava/lang/String;)V

    goto :goto_0
.end method
