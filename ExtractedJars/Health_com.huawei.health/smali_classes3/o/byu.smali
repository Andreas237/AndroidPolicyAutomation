.class public Lo/byu;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/view/View;>;"
        }
    .end annotation
.end field

.field private c:Landroid/graphics/Rect;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/graphics/Rect;>;"
        }
    .end annotation
.end field

.field private e:Landroid/view/View;

.field private f:F

.field private g:I

.field private k:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 56
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/byu;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 57
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 60
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/byu;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 61
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 64
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 39
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lo/byu;->c:Landroid/graphics/Rect;

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/byu;->b:Ljava/util/List;

    .line 43
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/byu;->d:Ljava/util/List;

    .line 46
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/byu;->a:Z

    .line 65
    invoke-direct {p0}, Lo/byu;->b()V

    .line 66
    return-void
.end method

.method private b()V
    .locals 1

    .line 70
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/byu;->setVerticalScrollBarEnabled(Z)V

    .line 71
    return-void
.end method

.method static synthetic d(Lo/byu;)Ljava/util/List;
    .locals 1

    .line 26
    iget-object v0, p0, Lo/byu;->d:Ljava/util/List;

    return-object v0
.end method

.method private d()V
    .locals 7

    .line 191
    iget-boolean v0, p0, Lo/byu;->a:Z

    if-nez v0, :cond_0

    .line 192
    return-void

    .line 195
    :cond_0
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lo/byu;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_2

    .line 196
    iget-object v0, p0, Lo/byu;->d:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 197
    new-instance v6, Landroid/view/animation/TranslateAnimation;

    iget-object v0, p0, Lo/byu;->b:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lo/byu;->d:Ljava/util/List;

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->top:I

    int-to-float v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v6, v2, v3, v0, v1}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 198
    const-wide/16 v0, 0x190

    invoke-virtual {v6, v0, v1}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 199
    iget-object v0, p0, Lo/byu;->b:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, v6}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 200
    iget-object v0, p0, Lo/byu;->b:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    iget-object v1, p0, Lo/byu;->d:Ljava/util/List;

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    iget-object v2, p0, Lo/byu;->d:Ljava/util/List;

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    iget-object v3, p0, Lo/byu;->d:Ljava/util/List;

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->right:I

    iget-object v4, p0, Lo/byu;->d:Ljava/util/List;

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->layout(IIII)V

    .line 195
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 205
    :cond_2
    new-instance v5, Landroid/view/animation/TranslateAnimation;

    iget-object v0, p0, Lo/byu;->e:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    iget-object v1, p0, Lo/byu;->c:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->top:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v5, v1, v2, v0, v3}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 206
    const-wide/16 v0, 0x190

    invoke-virtual {v5, v0, v1}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 207
    iget-object v0, p0, Lo/byu;->e:Landroid/view/View;

    invoke-virtual {v0, v5}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 209
    iget-object v0, p0, Lo/byu;->e:Landroid/view/View;

    iget-object v1, p0, Lo/byu;->c:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    iget-object v2, p0, Lo/byu;->c:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    iget-object v3, p0, Lo/byu;->c:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->right:I

    iget-object v4, p0, Lo/byu;->c:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->layout(IIII)V

    .line 211
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/byu;->a:Z

    .line 212
    return-void
.end method

.method private e()Z
    .locals 2

    .line 261
    iget-object v0, p0, Lo/byu;->e:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 262
    iget-object v0, p0, Lo/byu;->e:Landroid/view/View;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroid/support/v4/view/ViewCompat;->canScrollVertically(Landroid/view/View;I)Z

    move-result v0

    return v0

    .line 264
    :cond_0
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 124
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget-object v1, p0, Lo/byu;->c:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-gez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget-object v1, p0, Lo/byu;->c:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->top:I

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_1

    :cond_0
    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    .line 125
    :goto_0
    if-eqz v4, :cond_3

    .line 126
    iget-boolean v0, p0, Lo/byu;->a:Z

    if-eqz v0, :cond_2

    .line 127
    invoke-direct {p0}, Lo/byu;->d()V

    .line 129
    :cond_2
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->setAction(I)V

    .line 132
    :cond_3
    :try_start_0
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 133
    :catch_0
    move-exception v5

    .line 134
    const-string v0, "PullRecyclerViewGroup"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    const/4 v0, 0x0

    return v0
.end method

.method protected onFinishInflate()V
    .locals 3

    .line 79
    invoke-virtual {p0}, Lo/byu;->getChildCount()I

    move-result v0

    if-lez v0, :cond_3

    .line 80
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p0}, Lo/byu;->getChildCount()I

    move-result v0

    if-ge v2, v0, :cond_3

    .line 81
    invoke-virtual {p0, v2}, Lo/byu;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    instance-of v0, v0, Landroid/support/v7/widget/RecyclerView;

    if-nez v0, :cond_0

    invoke-virtual {p0, v2}, Lo/byu;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    instance-of v0, v0, Landroid/widget/ListView;

    if-nez v0, :cond_0

    invoke-virtual {p0, v2}, Lo/byu;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    instance-of v0, v0, Landroid/widget/ScrollView;

    if-eqz v0, :cond_2

    .line 82
    :cond_0
    iget-object v0, p0, Lo/byu;->e:Landroid/view/View;

    if-nez v0, :cond_1

    .line 83
    invoke-virtual {p0, v2}, Lo/byu;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/byu;->e:Landroid/view/View;

    goto :goto_1

    .line 85
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "PullRecyclerViewGroup \u4e2d\u53ea\u80fd\u5b58\u5728\u4e00\u4e2aRecyclerView\u3001ListView\u6216\u8005ScrollView"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 80
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 91
    :cond_3
    iget-object v0, p0, Lo/byu;->e:Landroid/view/View;

    if-nez v0, :cond_4

    .line 92
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "PullRecyclerViewGroup \u5b50\u5bb9\u5668\u4e2d\u5fc5\u987b\u6709\u4e00\u4e2aRecyclerView\u3001ListView\u6216\u8005ScrollView"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 95
    :cond_4
    invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V

    .line 96
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 9

    .line 223
    const/4 v2, 0x0

    .line 224
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    .line 225
    packed-switch v3, :pswitch_data_0

    goto/16 :goto_1

    .line 228
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lo/byu;->f:F

    .line 229
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lo/byu;->g:I

    .line 230
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lo/byu;->k:I

    .line 231
    goto :goto_1

    .line 233
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    .line 234
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v5

    .line 235
    iget v0, p0, Lo/byu;->f:F

    sub-float v0, v4, v0

    float-to-int v6, v0

    .line 236
    iget v0, p0, Lo/byu;->g:I

    int-to-float v0, v0

    sub-float v0, v4, v0

    float-to-int v7, v0

    .line 237
    iget v0, p0, Lo/byu;->k:I

    int-to-float v0, v0

    sub-float v0, v5, v0

    float-to-int v8, v0

    .line 238
    invoke-direct {p0}, Lo/byu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    if-gez v6, :cond_0

    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    move-result v0

    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    move-result v1

    if-le v0, v1, :cond_0

    .line 239
    const/4 v2, 0x1

    goto :goto_0

    .line 241
    :cond_0
    const/4 v2, 0x0

    .line 243
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lo/byu;->g:I

    .line 244
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lo/byu;->k:I

    .line 245
    goto :goto_1

    .line 247
    :pswitch_2
    const/4 v2, 0x0

    .line 248
    .line 252
    :goto_1
    return v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method protected onLayout(ZIIII)V
    .locals 7

    .line 101
    invoke-super/range {p0 .. p5}, Landroid/widget/LinearLayout;->onLayout(ZIIII)V

    .line 103
    iget-object v0, p0, Lo/byu;->c:Landroid/graphics/Rect;

    iget-object v1, p0, Lo/byu;->e:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v1

    iget-object v2, p0, Lo/byu;->e:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v2

    iget-object v3, p0, Lo/byu;->e:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    move-result v3

    iget-object v4, p0, Lo/byu;->e:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getBottom()I

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 104
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lo/byu;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_0

    .line 105
    iget-object v0, p0, Lo/byu;->b:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/view/View;

    .line 106
    new-instance v0, Lo/byu$1;

    invoke-direct {v0, p0}, Lo/byu$1;-><init>(Lo/byu;)V

    invoke-virtual {v6, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 104
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 116
    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 10

    .line 145
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v5

    .line 146
    packed-switch v5, :pswitch_data_0

    goto/16 :goto_2

    .line 149
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lo/byu;->f:F

    .line 150
    goto/16 :goto_2

    .line 152
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v6

    .line 154
    iget v0, p0, Lo/byu;->f:F

    sub-float v0, v6, v0

    float-to-int v7, v0

    .line 157
    invoke-direct {p0}, Lo/byu;->e()Z

    move-result v0

    if-nez v0, :cond_2

    if-gez v7, :cond_2

    .line 158
    int-to-float v0, v7

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v0, v1

    float-to-int v8, v0

    .line 159
    iget-object v0, p0, Lo/byu;->e:Landroid/view/View;

    iget-object v1, p0, Lo/byu;->c:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    iget-object v2, p0, Lo/byu;->c:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    add-int/2addr v2, v8

    iget-object v3, p0, Lo/byu;->c:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->right:I

    iget-object v4, p0, Lo/byu;->c:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v4, v8

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->layout(IIII)V

    .line 160
    const/4 v9, 0x0

    :goto_0
    iget-object v0, p0, Lo/byu;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_1

    .line 161
    iget-object v0, p0, Lo/byu;->b:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 162
    iget-object v0, p0, Lo/byu;->b:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    iget-object v1, p0, Lo/byu;->d:Ljava/util/List;

    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    iget-object v2, p0, Lo/byu;->d:Ljava/util/List;

    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    add-int/2addr v2, v8

    iget-object v3, p0, Lo/byu;->d:Ljava/util/List;

    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->right:I

    iget-object v4, p0, Lo/byu;->d:Ljava/util/List;

    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v4, v8

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->layout(IIII)V

    .line 160
    :cond_0
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 165
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/byu;->a:Z

    .line 166
    goto :goto_1

    .line 167
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lo/byu;->f:F

    .line 168
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/byu;->a:Z

    .line 169
    invoke-direct {p0}, Lo/byu;->d()V

    .line 171
    :goto_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lo/byu;->k:I

    .line 172
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lo/byu;->g:I

    .line 173
    goto :goto_2

    .line 176
    :pswitch_2
    iget-boolean v0, p0, Lo/byu;->a:Z

    if-eqz v0, :cond_3

    .line 177
    invoke-direct {p0}, Lo/byu;->d()V

    .line 183
    :cond_3
    :goto_2
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public setMoveViews(Landroid/view/View;)V
    .locals 1

    .line 274
    iget-object v0, p0, Lo/byu;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 275
    invoke-virtual {p0}, Lo/byu;->requestLayout()V

    .line 276
    return-void
.end method
