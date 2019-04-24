.class public Lo/bym;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:F

.field private c:Landroid/view/ViewGroup;

.field private d:Landroid/graphics/Rect;

.field private e:Z

.field private g:F

.field private h:Z

.field private k:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 60
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 46
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lo/bym;->d:Landroid/graphics/Rect;

    .line 49
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bym;->e:Z

    .line 52
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bym;->a:Z

    .line 55
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bym;->h:Z

    .line 61
    invoke-direct {p0}, Lo/bym;->d()V

    .line 63
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 66
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 46
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lo/bym;->d:Landroid/graphics/Rect;

    .line 49
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bym;->e:Z

    .line 52
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bym;->a:Z

    .line 55
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bym;->h:Z

    .line 67
    invoke-direct {p0}, Lo/bym;->d()V

    .line 69
    return-void
.end method

.method private a()Z
    .locals 2

    .line 224
    iget-object v0, p0, Lo/bym;->c:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 225
    iget-object v0, p0, Lo/bym;->c:Landroid/view/ViewGroup;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroid/support/v4/view/ViewCompat;->canScrollHorizontally(Landroid/view/View;I)Z

    move-result v0

    return v0

    .line 227
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method private b()Z
    .locals 2

    .line 214
    iget-object v0, p0, Lo/bym;->c:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 215
    iget-object v0, p0, Lo/bym;->c:Landroid/view/ViewGroup;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Landroid/support/v4/view/ViewCompat;->canScrollHorizontally(Landroid/view/View;I)Z

    move-result v0

    return v0

    .line 217
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method private d()V
    .locals 2

    .line 73
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_0

    .line 74
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lo/bym;->setOverScrollMode(I)V

    .line 76
    :cond_0
    return-void
.end method

.method private e()V
    .locals 6

    .line 191
    iget-boolean v0, p0, Lo/bym;->h:Z

    if-nez v0, :cond_0

    .line 192
    return-void

    .line 196
    :cond_0
    new-instance v5, Landroid/view/animation/TranslateAnimation;

    iget-object v0, p0, Lo/bym;->c:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLeft()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lo/bym;->d:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v5, v0, v1, v2, v3}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 198
    const-wide/16 v0, 0x12c

    invoke-virtual {v5, v0, v1}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 199
    new-instance v0, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-virtual {v5, v0}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 201
    iget-object v0, p0, Lo/bym;->c:Landroid/view/ViewGroup;

    iget-object v1, p0, Lo/bym;->d:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    iget-object v2, p0, Lo/bym;->d:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    iget-object v3, p0, Lo/bym;->d:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->right:I

    iget-object v4, p0, Lo/bym;->d:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/ViewGroup;->layout(IIII)V

    .line 202
    iget-object v0, p0, Lo/bym;->c:Landroid/view/ViewGroup;

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->startAnimation(Landroid/view/animation/Animation;)V

    .line 204
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bym;->e:Z

    .line 205
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bym;->a:Z

    .line 206
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bym;->h:Z

    .line 207
    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    .line 231
    move-object v1, p0

    .line 232
    :goto_0
    instance-of v0, v1, Landroid/support/v4/view/ViewPager;

    if-nez v0, :cond_1

    .line 233
    if-nez v1, :cond_0

    .line 234
    return-void

    .line 236
    :cond_0
    invoke-interface {v1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    goto :goto_0

    .line 238
    :cond_1
    const/4 v0, 0x1

    invoke-interface {v1, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 239
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 14

    .line 103
    iget-object v0, p0, Lo/bym;->c:Landroid/view/ViewGroup;

    if-nez v0, :cond_0

    .line 104
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 106
    :cond_0
    invoke-virtual {p0}, Lo/bym;->c()V

    .line 108
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget-object v1, p0, Lo/bym;->d:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->right:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-gez v0, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget-object v1, p0, Lo/bym;->d:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_2

    :cond_1
    const/4 v5, 0x1

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    .line 109
    :goto_0
    if-eqz v5, :cond_4

    .line 111
    iget-boolean v0, p0, Lo/bym;->h:Z

    if-eqz v0, :cond_3

    .line 112
    invoke-direct {p0}, Lo/bym;->e()V

    .line 114
    :cond_3
    const/4 v0, 0x1

    return v0

    .line 117
    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v6

    .line 119
    packed-switch v6, :pswitch_data_0

    goto/16 :goto_2

    .line 123
    :pswitch_0
    invoke-direct {p0}, Lo/bym;->b()Z

    move-result v0

    iput-boolean v0, p0, Lo/bym;->e:Z

    .line 124
    invoke-direct {p0}, Lo/bym;->a()Z

    move-result v0

    iput-boolean v0, p0, Lo/bym;->a:Z

    .line 127
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lo/bym;->b:F

    .line 128
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lo/bym;->g:F

    .line 129
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lo/bym;->k:F

    .line 130
    goto/16 :goto_2

    .line 132
    :pswitch_1
    iget-boolean v0, p0, Lo/bym;->h:Z

    if-eqz v0, :cond_c

    .line 133
    invoke-direct {p0}, Lo/bym;->e()V

    .line 134
    const/4 v0, 0x1

    return v0

    .line 138
    :pswitch_2
    iget-boolean v0, p0, Lo/bym;->h:Z

    if-eqz v0, :cond_c

    .line 139
    invoke-direct {p0}, Lo/bym;->e()V

    .line 140
    const/4 v0, 0x1

    return v0

    .line 146
    :pswitch_3
    iget-boolean v0, p0, Lo/bym;->e:Z

    if-nez v0, :cond_5

    iget-boolean v0, p0, Lo/bym;->a:Z

    if-nez v0, :cond_5

    .line 147
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lo/bym;->b:F

    .line 148
    invoke-direct {p0}, Lo/bym;->b()Z

    move-result v0

    iput-boolean v0, p0, Lo/bym;->e:Z

    .line 149
    invoke-direct {p0}, Lo/bym;->a()Z

    move-result v0

    iput-boolean v0, p0, Lo/bym;->a:Z

    .line 150
    goto/16 :goto_2

    .line 154
    :cond_5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v7

    .line 155
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v8, v0

    .line 156
    iget v0, p0, Lo/bym;->b:F

    sub-float v0, v7, v0

    float-to-int v9, v0

    .line 157
    iget v0, p0, Lo/bym;->g:F

    sub-float v0, v7, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-int v10, v0

    .line 158
    int-to-float v0, v8

    iget v1, p0, Lo/bym;->k:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-int v11, v0

    .line 161
    iget-boolean v0, p0, Lo/bym;->e:Z

    if-nez v0, :cond_6

    if-gtz v9, :cond_8

    :cond_6
    iget-boolean v0, p0, Lo/bym;->a:Z

    if-nez v0, :cond_7

    if-ltz v9, :cond_8

    :cond_7
    iget-boolean v0, p0, Lo/bym;->a:Z

    if-nez v0, :cond_9

    iget-boolean v0, p0, Lo/bym;->e:Z

    if-nez v0, :cond_9

    :cond_8
    if-gt v10, v11, :cond_a

    :cond_9
    iget-object v0, p0, Lo/bym;->c:Landroid/view/ViewGroup;

    .line 163
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLeft()I

    move-result v0

    iget-object v1, p0, Lo/bym;->d:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    if-gt v0, v1, :cond_a

    iget-object v0, p0, Lo/bym;->c:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getRight()I

    move-result v0

    iget-object v1, p0, Lo/bym;->d:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->right:I

    if-ge v0, v1, :cond_b

    :cond_a
    const/4 v12, 0x1

    goto :goto_1

    :cond_b
    const/4 v12, 0x0

    .line 164
    :goto_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lo/bym;->g:F

    .line 165
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lo/bym;->k:F

    .line 166
    if-eqz v12, :cond_c

    .line 168
    int-to-float v0, v9

    const v1, 0x3e99999a    # 0.3f

    mul-float/2addr v0, v1

    float-to-int v13, v0

    .line 170
    iget-object v0, p0, Lo/bym;->c:Landroid/view/ViewGroup;

    iget-object v1, p0, Lo/bym;->d:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    add-int/2addr v1, v13

    iget-object v2, p0, Lo/bym;->d:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    iget-object v3, p0, Lo/bym;->d:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->right:I

    add-int/2addr v3, v13

    iget-object v4, p0, Lo/bym;->d:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/ViewGroup;->layout(IIII)V

    .line 172
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bym;->h:Z

    .line 173
    invoke-virtual {p0}, Lo/bym;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 175
    const/4 v0, 0x1

    return v0

    .line 182
    :cond_c
    :goto_2
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_1
    .end packed-switch
.end method

.method protected onFinishInflate()V
    .locals 1

    .line 80
    invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V

    .line 81
    invoke-virtual {p0}, Lo/bym;->getChildCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 82
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/bym;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lo/bym;->c:Landroid/view/ViewGroup;

    .line 84
    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 5

    .line 88
    invoke-super/range {p0 .. p5}, Landroid/widget/LinearLayout;->onLayout(ZIIII)V

    .line 89
    iget-object v0, p0, Lo/bym;->c:Landroid/view/ViewGroup;

    if-nez v0, :cond_0

    .line 90
    return-void

    .line 92
    :cond_0
    iget-object v0, p0, Lo/bym;->d:Landroid/graphics/Rect;

    iget-object v1, p0, Lo/bym;->c:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getLeft()I

    move-result v1

    iget-object v2, p0, Lo/bym;->c:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getTop()I

    move-result v2

    iget-object v3, p0, Lo/bym;->c:Landroid/view/ViewGroup;

    .line 93
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getRight()I

    move-result v3

    iget-object v4, p0, Lo/bym;->c:Landroid/view/ViewGroup;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getBottom()I

    move-result v4

    .line 92
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 94
    return-void
.end method
