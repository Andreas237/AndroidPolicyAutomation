.class public Lo/ehf;
.super Landroid/widget/HorizontalScrollView;
.source "SourceFile"


# instance fields
.field private a:Landroid/view/View;

.field private b:Z

.field private d:I

.field private e:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 19
    invoke-direct {p0, p1, p2}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 25
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lo/ehf;->e:Landroid/graphics/Rect;

    .line 28
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ehf;->b:Z

    .line 20
    return-void
.end method

.method private a()Z
    .locals 4

    .line 129
    iget-object v0, p0, Lo/ehf;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p0}, Lo/ehf;->getWidth()I

    move-result v1

    sub-int v2, v0, v1

    .line 130
    invoke-virtual {p0}, Lo/ehf;->getScrollX()I

    move-result v3

    .line 132
    if-eqz v3, :cond_0

    if-ne v3, v2, :cond_1

    .line 133
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 135
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private c()V
    .locals 7

    .line 112
    new-instance v5, Landroid/view/animation/TranslateAnimation;

    iget-object v0, p0, Lo/ehf;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lo/ehf;->e:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v5, v0, v1, v2, v3}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 113
    const-wide/16 v0, 0x96

    invoke-virtual {v5, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 114
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 115
    new-instance v6, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v6}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 116
    invoke-virtual {v5, v6}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 117
    iget-object v0, p0, Lo/ehf;->a:Landroid/view/View;

    invoke-virtual {v0, v5}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 118
    iget-object v0, p0, Lo/ehf;->a:Landroid/view/View;

    iget-object v1, p0, Lo/ehf;->e:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    iget-object v2, p0, Lo/ehf;->e:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    iget-object v3, p0, Lo/ehf;->e:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->right:I

    iget-object v4, p0, Lo/ehf;->e:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->layout(IIII)V

    .line 119
    iget-object v0, p0, Lo/ehf;->e:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    .line 120
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ehf;->b:Z

    .line 121
    return-void
.end method

.method private d(Landroid/view/MotionEvent;)V
    .locals 3

    .line 54
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    .line 55
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    .line 59
    :sswitch_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v2, v0

    .line 60
    invoke-direct {p0, v2}, Lo/ehf;->setOverScrollPosition(I)V

    .line 61
    goto :goto_0

    .line 65
    :sswitch_1
    iget-object v0, p0, Lo/ehf;->e:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 67
    invoke-direct {p0}, Lo/ehf;->c()V

    .line 73
    :cond_0
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_0
    .end sparse-switch
.end method

.method private setOverScrollPosition(I)V
    .locals 8

    .line 79
    iget v0, p0, Lo/ehf;->d:I

    sub-int v6, p1, v0

    .line 80
    iput p1, p0, Lo/ehf;->d:I

    .line 81
    iget-boolean v0, p0, Lo/ehf;->b:Z

    if-nez v0, :cond_0

    .line 82
    const/4 v6, 0x0

    .line 83
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ehf;->b:Z

    .line 86
    :cond_0
    invoke-direct {p0}, Lo/ehf;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 87
    iget-object v0, p0, Lo/ehf;->e:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 89
    iget-object v0, p0, Lo/ehf;->e:Landroid/graphics/Rect;

    iget-object v1, p0, Lo/ehf;->a:Landroid/view/View;

    .line 90
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v1

    iget-object v2, p0, Lo/ehf;->a:Landroid/view/View;

    .line 91
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v2

    iget-object v3, p0, Lo/ehf;->a:Landroid/view/View;

    .line 92
    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    move-result v3

    iget-object v4, p0, Lo/ehf;->a:Landroid/view/View;

    .line 93
    invoke-virtual {v4}, Landroid/view/View;->getBottom()I

    move-result v4

    .line 89
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 97
    :cond_1
    iget-object v0, p0, Lo/ehf;->e:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    iget-object v1, p0, Lo/ehf;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    invoke-virtual {p0}, Lo/ehf;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x4

    if-ge v0, v1, :cond_2

    const/4 v7, 0x1

    goto :goto_0

    :cond_2
    const/4 v7, 0x0

    .line 98
    :goto_0
    if-eqz v7, :cond_3

    .line 99
    iget-object v0, p0, Lo/ehf;->a:Landroid/view/View;

    iget-object v1, p0, Lo/ehf;->a:Landroid/view/View;

    .line 100
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v1

    mul-int/lit8 v2, v6, 0x2

    div-int/lit8 v2, v2, 0x3

    add-int/2addr v1, v2

    iget-object v2, p0, Lo/ehf;->a:Landroid/view/View;

    .line 101
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v2

    iget-object v3, p0, Lo/ehf;->a:Landroid/view/View;

    .line 102
    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    move-result v3

    mul-int/lit8 v4, v6, 0x2

    div-int/lit8 v4, v4, 0x3

    add-int/2addr v3, v4

    iget-object v4, p0, Lo/ehf;->a:Landroid/view/View;

    .line 103
    invoke-virtual {v4}, Landroid/view/View;->getBottom()I

    move-result v4

    .line 99
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->layout(IIII)V

    .line 105
    :cond_3
    return-void
.end method


# virtual methods
.method protected onFinishInflate()V
    .locals 1

    .line 36
    invoke-virtual {p0}, Lo/ehf;->getChildCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 37
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ehf;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/ehf;->a:Landroid/view/View;

    .line 38
    :cond_0
    invoke-super {p0}, Landroid/widget/HorizontalScrollView;->onFinishInflate()V

    .line 39
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 43
    iget-object v0, p0, Lo/ehf;->a:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 44
    invoke-direct {p0, p1}, Lo/ehf;->d(Landroid/view/MotionEvent;)V

    .line 46
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method
