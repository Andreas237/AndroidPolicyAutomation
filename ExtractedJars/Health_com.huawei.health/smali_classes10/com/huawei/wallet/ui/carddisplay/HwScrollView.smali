.class public Lcom/huawei/wallet/ui/carddisplay/HwScrollView;
.super Landroid/widget/ScrollView;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Z

.field private c:Z

.field private d:Landroid/graphics/Rect;

.field public e:Z

.field private f:Landroid/view/View;

.field private g:I

.field private h:Z

.field private i:F

.field private k:I

.field private n:I

.field private p:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 59
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 60
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 64
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 65
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 69
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 22
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->d:Landroid/graphics/Rect;

    .line 25
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->b:Z

    .line 28
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->c:Z

    .line 31
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->e:Z

    .line 70
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->getPaddingTop()I

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->k:I

    .line 71
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->getPaddingBottom()I

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->g:I

    .line 72
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->getPaddingRight()I

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->n:I

    .line 73
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->getPaddingLeft()I

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->p:I

    .line 74
    return-void
.end method


# virtual methods
.method public b()Z
    .locals 3

    .line 153
    const-string v0, "HwScrollView"

    const-string v1, "enter isCanPullDown"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 154
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->getScrollY()I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->f:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->getScrollY()I

    move-result v2

    add-int/2addr v1, v2

    if-ge v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c()Z
    .locals 3

    .line 162
    const-string v0, "HwScrollView"

    const-string v1, "enter isCanPullUp"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 163
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->f:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->getScrollY()I

    move-result v2

    add-int/2addr v1, v2

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d()Z
    .locals 2

    .line 117
    const-string v0, "HwScrollView"

    const-string v1, "isCanRebound"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->h:Z

    return v0
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 11

    .line 172
    const-string v0, "HwScrollView"

    const-string v1, "enter dispatchTouchEvent"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 173
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->f:Landroid/view/View;

    if-nez v0, :cond_0

    .line 175
    const-string v0, "HwScrollView"

    const-string v1, "mContentView is null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 176
    invoke-super {p0, p1}, Landroid/widget/ScrollView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 179
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 181
    const-string v0, "HwScrollView"

    const-string v1, "judge isCanRebound"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 182
    invoke-super {p0, p1}, Landroid/widget/ScrollView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 185
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v5

    .line 187
    const-string v0, "HwScrollView"

    const-string v1, "next again switch"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 188
    packed-switch v5, :pswitch_data_0

    goto/16 :goto_1

    .line 191
    :pswitch_0
    const-string v0, "HwScrollView"

    const-string v1, "enter ACTION_DOWN"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 194
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->b()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->b:Z

    .line 195
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->c()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->c:Z

    .line 196
    const-string v0, "HwScrollView"

    const-string v1, "midle"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 198
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->i:F

    .line 199
    goto/16 :goto_1

    .line 202
    :pswitch_1
    const-string v0, "HwScrollView"

    const-string v1, "enter ACTION_UP"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 203
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->e:Z

    if-nez v0, :cond_2

    .line 204
    goto/16 :goto_1

    .line 207
    :cond_2
    new-instance v6, Landroid/view/animation/TranslateAnimation;

    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->f:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->d:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->top:I

    int-to-float v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v6, v2, v3, v0, v1}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 208
    const-wide/16 v0, 0x12c

    invoke-virtual {v6, v0, v1}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 209
    const-string v0, "HwScrollView"

    const-string v1, "midle"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 211
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->f:Landroid/view/View;

    invoke-virtual {v0, v6}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 214
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->f:Landroid/view/View;

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->d:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    iget-object v2, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->d:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    iget-object v3, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->d:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->right:I

    iget-object v4, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->d:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->layout(IIII)V

    .line 217
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->b:Z

    .line 218
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->c:Z

    .line 219
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->e:Z

    .line 220
    const-string v0, "HwScrollView"

    const-string v1, "ACTION_UP finish"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 221
    goto/16 :goto_1

    .line 223
    :pswitch_2
    const-string v0, "HwScrollView"

    const-string v1, "enter ACTION_MOVE"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 226
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->b:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->c:Z

    if-nez v0, :cond_3

    .line 228
    const-string v0, "HwScrollView"

    const-string v1, "canPullDown and canPullUp"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 229
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->i:F

    .line 230
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->b()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->b:Z

    .line 231
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->c()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->c:Z

    .line 233
    goto/16 :goto_1

    .line 237
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v7

    .line 238
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->i:F

    sub-float v0, v7, v0

    float-to-int v8, v0

    .line 239
    const-string v0, "HwScrollView"

    const-string v1, "midle"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 241
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->b:Z

    if-eqz v0, :cond_4

    if-gtz v8, :cond_6

    :cond_4
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->c:Z

    if-eqz v0, :cond_5

    if-ltz v8, :cond_6

    :cond_5
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->c:Z

    if-eqz v0, :cond_7

    iget-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->b:Z

    if-eqz v0, :cond_7

    :cond_6
    const/4 v9, 0x1

    goto :goto_0

    :cond_7
    const/4 v9, 0x0

    .line 246
    :goto_0
    if-eqz v9, :cond_8

    .line 248
    const-string v0, "HwScrollView"

    const-string v1, "shouldMove boolean"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 250
    int-to-float v0, v8

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v0, v1

    float-to-int v10, v0

    .line 253
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->f:Landroid/view/View;

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->d:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    iget-object v2, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->d:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    add-int/2addr v2, v10

    iget-object v3, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->d:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->right:I

    iget-object v4, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->d:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v4, v10

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->layout(IIII)V

    .line 256
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->e:Z

    .line 258
    :cond_8
    const-string v0, "HwScrollView"

    const-string v1, "exit ACTION_MOVE"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 259
    .line 263
    :goto_1
    const-string v0, "HwScrollView"

    const-string v1, "onTouch finish"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 264
    invoke-super {p0, p1}, Landroid/widget/ScrollView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public fling(I)V
    .locals 3

    .line 111
    invoke-super {p0, p1}, Landroid/widget/ScrollView;->fling(I)V

    .line 112
    const-string v0, "HwScrollView"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "fling velocityY= "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 113
    return-void
.end method

.method public getContentHeight()I
    .locals 2

    .line 269
    const-string v0, "HwScrollView"

    const-string v1, "enter getContentHeight"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 270
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->f:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 272
    const-string v0, "HwScrollView"

    const-string v1, "judge mContentView is not null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 273
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->f:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    return v0

    .line 275
    :cond_0
    const-string v0, "HwScrollView"

    const-string v1, "exit getContentHeight"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 276
    const/4 v0, 0x0

    return v0
.end method

.method public getHwScrollY()I
    .locals 2

    .line 97
    const-string v0, "HwScrollView"

    const-string v1, "enter getHwScrollY"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 98
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->a:I

    return v0
.end method

.method protected onFinishInflate()V
    .locals 2

    .line 139
    invoke-super {p0}, Landroid/widget/ScrollView;->onFinishInflate()V

    .line 140
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->getChildCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 142
    const-string v0, "HwScrollView"

    const-string v1, "judge getChildCount"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 143
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->f:Landroid/view/View;

    .line 144
    const-string v0, "HwScrollView"

    const-string v1, "judge getChildCount finish"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 146
    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 5

    .line 124
    invoke-super/range {p0 .. p5}, Landroid/widget/ScrollView;->onLayout(ZIIII)V

    .line 126
    const-string v0, "HwScrollView"

    const-string v1, "enter onLayout"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 127
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->f:Landroid/view/View;

    if-nez v0, :cond_0

    .line 128
    return-void

    .line 131
    :cond_0
    const-string v0, "HwScrollView"

    const-string v1, "midle"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 132
    iget-object v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->d:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->f:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->f:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v2

    iget-object v3, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->f:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    move-result v3

    iget-object v4, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->f:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getBottom()I

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 133
    const-string v0, "HwScrollView"

    const-string v1, "exit onLayout"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 134
    return-void
.end method

.method protected onScrollChanged(IIII)V
    .locals 5

    .line 79
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ScrollView;->onScrollChanged(IIII)V

    .line 80
    const-string v0, "HwScrollView"

    const-string v1, "enter onScrollChanged"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 81
    iput p2, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->a:I

    .line 82
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->getScrollY()I

    move-result v4

    .line 83
    if-gez v4, :cond_0

    .line 85
    const-string v0, "HwScrollView"

    const-string v1, "judge scrollY"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 86
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->p:I

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->k:I

    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->n:I

    iget v3, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->g:I

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->setPadding(IIII)V

    goto :goto_0

    .line 90
    :cond_0
    const-string v0, "HwScrollView"

    const-string v1, "judge scrollY enter else"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 91
    iget v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->p:I

    iget v1, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->n:I

    iget v2, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->g:I

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v3, v1, v2}, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->setPadding(IIII)V

    .line 93
    :goto_0
    return-void
.end method

.method public setCanRebound(Z)V
    .locals 2

    .line 103
    const-string v0, "HwScrollView"

    const-string v1, "setCanRebound"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 104
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/carddisplay/HwScrollView;->h:Z

    .line 105
    return-void
.end method
