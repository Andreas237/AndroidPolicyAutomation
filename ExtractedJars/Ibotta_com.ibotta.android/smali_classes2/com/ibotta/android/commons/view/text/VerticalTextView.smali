.class public final Lcom/ibotta/android/commons/view/text/VerticalTextView;
.super Landroid/support/v7/widget/AppCompatTextView;
.source "VerticalTextView.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0014R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/ibotta/android/commons/view/text/VerticalTextView;",
        "Landroid/support/v7/widget/AppCompatTextView;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "topDown",
        "",
        "isBottomUp",
        "gravity",
        "",
        "onDraw",
        "",
        "canvas",
        "Landroid/graphics/Canvas;",
        "onMeasure",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "ibotta-commons_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final topDown:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 24
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/text/VerticalTextView;->getGravity()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/commons/view/text/VerticalTextView;->isBottomUp(I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 25
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/text/VerticalTextView;->getGravity()I

    move-result p1

    and-int/lit8 p1, p1, 0x7

    or-int/lit8 p1, p1, 0x30

    invoke-virtual {p0, p1}, Lcom/ibotta/android/commons/view/text/VerticalTextView;->setGravity(I)V

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    .line 24
    :goto_0
    iput-boolean p1, p0, Lcom/ibotta/android/commons/view/text/VerticalTextView;->topDown:Z

    return-void
.end method

.method private final isBottomUp(I)Z
    .locals 1

    .line 33
    invoke-static {p1}, Landroid/view/Gravity;->isVertical(I)Z

    move-result v0

    if-eqz v0, :cond_0

    and-int/lit8 p1, p1, 0x70

    const/16 v0, 0x50

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 2
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/text/VerticalTextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    const-string v1, "textPaint"

    .line 42
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/text/VerticalTextView;->getCurrentTextColor()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setColor(I)V

    .line 43
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/text/VerticalTextView;->getDrawableState()[I

    move-result-object v1

    iput-object v1, v0, Landroid/text/TextPaint;->drawableState:[I

    .line 45
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 47
    iget-boolean v0, p0, Lcom/ibotta/android/commons/view/text/VerticalTextView;->topDown:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 48
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/text/VerticalTextView;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    const/high16 v0, 0x42b40000    # 90.0f

    .line 49
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->rotate(F)V

    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/text/VerticalTextView;->getHeight()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->translate(FF)V

    const/high16 v0, -0x3d4c0000    # -90.0f

    .line 52
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->rotate(F)V

    .line 55
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/text/VerticalTextView;->getCompoundPaddingLeft()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/text/VerticalTextView;->getExtendedPaddingTop()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 57
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/text/VerticalTextView;->getLayout()Landroid/text/Layout;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 58
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 0

    .line 36
    invoke-super {p0, p2, p1}, Landroid/support/v7/widget/AppCompatTextView;->onMeasure(II)V

    .line 37
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/text/VerticalTextView;->getMeasuredHeight()I

    move-result p1

    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/text/VerticalTextView;->getMeasuredWidth()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/commons/view/text/VerticalTextView;->setMeasuredDimension(II)V

    return-void
.end method
