.class public Lo/emb;
.super Landroid/support/v7/widget/RecyclerView;
.source "SourceFile"


# instance fields
.field private a:F

.field private b:Z

.field private c:F

.field private d:I

.field private e:Z

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private k:I

.field private m:Landroid/os/Handler;

.field private o:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 39
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 30
    const/4 v0, 0x0

    iput v0, p0, Lo/emb;->h:I

    .line 31
    const/4 v0, 0x0

    iput v0, p0, Lo/emb;->g:I

    .line 32
    const/4 v0, 0x0

    iput v0, p0, Lo/emb;->i:I

    .line 33
    const/4 v0, 0x0

    iput v0, p0, Lo/emb;->f:I

    .line 34
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/emb;->o:Z

    .line 36
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lo/emb;->m:Landroid/os/Handler;

    .line 40
    invoke-virtual {p0}, Lo/emb;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Lo/emb;->k:I

    .line 41
    invoke-direct {p0, p1}, Lo/emb;->b(Landroid/content/Context;)V

    .line 42
    return-void
.end method

.method static synthetic a(Lo/emb;)I
    .locals 1

    .line 21
    iget v0, p0, Lo/emb;->f:I

    return v0
.end method

.method static synthetic b(Lo/emb;)I
    .locals 1

    .line 21
    iget v0, p0, Lo/emb;->g:I

    return v0
.end method

.method private b(Landroid/content/Context;)V
    .locals 1

    .line 46
    invoke-virtual {p0}, Lo/emb;->getPaddingLeft()I

    move-result v0

    iput v0, p0, Lo/emb;->h:I

    .line 47
    invoke-virtual {p0}, Lo/emb;->getPaddingRight()I

    move-result v0

    iput v0, p0, Lo/emb;->g:I

    .line 48
    invoke-virtual {p0}, Lo/emb;->getPaddingTop()I

    move-result v0

    iput v0, p0, Lo/emb;->i:I

    .line 49
    invoke-virtual {p0}, Lo/emb;->getPaddingBottom()I

    move-result v0

    iput v0, p0, Lo/emb;->f:I

    .line 50
    return-void
.end method

.method private b()Z
    .locals 1

    .line 237
    const/4 v0, -0x1

    invoke-static {p0, v0}, Landroid/support/v4/view/ViewCompat;->canScrollHorizontally(Landroid/view/View;I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic d(Lo/emb;)I
    .locals 1

    .line 21
    iget v0, p0, Lo/emb;->i:I

    return v0
.end method

.method private d(Landroid/view/MotionEvent;)V
    .locals 4

    .line 250
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I

    move-result v1

    .line 251
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    .line 252
    iget v0, p0, Lo/emb;->d:I

    if-ne v2, v0, :cond_1

    .line 253
    if-nez v1, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 254
    :goto_0
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Lo/emb;->d:I

    .line 256
    :cond_1
    return-void
.end method

.method private e(Landroid/view/MotionEvent;)F
    .locals 2

    .line 245
    iget v0, p0, Lo/emb;->d:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v1

    .line 246
    if-gez v1, :cond_0

    const/high16 v0, -0x40800000    # -1.0f

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    :goto_0
    return v0
.end method

.method static synthetic e(Lo/emb;)I
    .locals 1

    .line 21
    iget v0, p0, Lo/emb;->h:I

    return v0
.end method

.method private e()Z
    .locals 1

    .line 241
    const/4 v0, 0x1

    invoke-static {p0, v0}, Landroid/support/v4/view/ViewCompat;->canScrollHorizontally(Landroid/view/View;I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 55
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I

    move-result v2

    .line 56
    iget-boolean v0, p0, Lo/emb;->b:Z

    if-eqz v0, :cond_0

    if-nez v2, :cond_0

    .line 57
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/emb;->b:Z

    .line 59
    :cond_0
    invoke-virtual {p0}, Lo/emb;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lo/emb;->b:Z

    if-nez v0, :cond_1

    invoke-direct {p0}, Lo/emb;->b()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-direct {p0}, Lo/emb;->e()Z

    move-result v0

    if-nez v0, :cond_2

    .line 60
    :cond_1
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 62
    :cond_2
    packed-switch v2, :pswitch_data_0

    goto/16 :goto_0

    .line 64
    :pswitch_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Lo/emb;->d:I

    .line 65
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/emb;->e:Z

    .line 66
    invoke-direct {p0, p1}, Lo/emb;->e(Landroid/view/MotionEvent;)F

    move-result v3

    .line 67
    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, v3, v0

    if-nez v0, :cond_3

    .line 68
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 70
    :cond_3
    iput v3, p0, Lo/emb;->a:F

    .line 71
    goto/16 :goto_1

    .line 74
    :pswitch_1
    iget v0, p0, Lo/emb;->d:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_4

    .line 75
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 77
    :cond_4
    invoke-direct {p0, p1}, Lo/emb;->e(Landroid/view/MotionEvent;)F

    move-result v3

    .line 78
    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, v3, v0

    if-nez v0, :cond_5

    .line 79
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 81
    :cond_5
    invoke-direct {p0}, Lo/emb;->b()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-direct {p0}, Lo/emb;->e()Z

    move-result v0

    if-nez v0, :cond_7

    .line 83
    iget v0, p0, Lo/emb;->a:F

    sub-float v4, v3, v0

    .line 84
    iget v0, p0, Lo/emb;->k:I

    int-to-float v0, v0

    cmpl-float v0, v4, v0

    if-lez v0, :cond_6

    iget-boolean v0, p0, Lo/emb;->e:Z

    if-nez v0, :cond_6

    .line 85
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/emb;->e:Z

    .line 87
    :cond_6
    goto/16 :goto_1

    :cond_7
    invoke-direct {p0}, Lo/emb;->b()Z

    move-result v0

    if-nez v0, :cond_9

    invoke-direct {p0}, Lo/emb;->e()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 89
    iget v0, p0, Lo/emb;->a:F

    sub-float v4, v0, v3

    .line 90
    iget v0, p0, Lo/emb;->k:I

    int-to-float v0, v0

    cmpl-float v0, v4, v0

    if-lez v0, :cond_8

    iget-boolean v0, p0, Lo/emb;->e:Z

    if-nez v0, :cond_8

    .line 91
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/emb;->e:Z

    .line 93
    :cond_8
    goto :goto_1

    :cond_9
    invoke-direct {p0}, Lo/emb;->b()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-direct {p0}, Lo/emb;->e()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 95
    iget v0, p0, Lo/emb;->a:F

    sub-float v4, v3, v0

    .line 96
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v1, p0, Lo/emb;->k:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_a

    iget-boolean v0, p0, Lo/emb;->e:Z

    if-nez v0, :cond_a

    .line 97
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/emb;->e:Z

    .line 99
    :cond_a
    goto :goto_1

    .line 101
    :cond_b
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 106
    :pswitch_2
    invoke-direct {p0, p1}, Lo/emb;->d(Landroid/view/MotionEvent;)V

    .line 107
    goto :goto_1

    .line 110
    :pswitch_3
    const/4 v0, -0x1

    iput v0, p0, Lo/emb;->d:I

    .line 111
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/emb;->e:Z

    .line 112
    goto :goto_1

    .line 114
    :goto_0
    :pswitch_4
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 116
    :goto_1
    iget-boolean v0, p0, Lo/emb;->e:Z

    if-nez v0, :cond_c

    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_d

    :cond_c
    const/4 v0, 0x1

    goto :goto_2

    :cond_d
    const/4 v0, 0x0

    :goto_2
    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_3
        :pswitch_1
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_2
    .end packed-switch
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 7

    .line 121
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_3

    .line 123
    :pswitch_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Lo/emb;->d:I

    .line 124
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/emb;->e:Z

    .line 125
    goto/16 :goto_3

    .line 127
    :pswitch_1
    invoke-direct {p0, p1}, Lo/emb;->e(Landroid/view/MotionEvent;)F

    move-result v4

    .line 128
    invoke-direct {p0}, Lo/emb;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lo/emb;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 130
    iget v0, p0, Lo/emb;->a:F

    sub-float v0, v4, v0

    iput v0, p0, Lo/emb;->c:F

    .line 131
    iget v0, p0, Lo/emb;->c:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 132
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 135
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/emb;->o:Z

    .line 136
    iget v0, p0, Lo/emb;->c:F

    float-to-int v0, v0

    div-int/lit8 v5, v0, 0x3

    .line 137
    iget v0, p0, Lo/emb;->h:I

    add-int/2addr v5, v0

    .line 138
    const-string v0, "UIHLH_ParallaxRecyclerView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ACTION_MOVE \u53f3\u62c9 paddingLeft "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    iget v0, p0, Lo/emb;->i:I

    iget v1, p0, Lo/emb;->g:I

    iget v2, p0, Lo/emb;->f:I

    invoke-virtual {p0, v5, v0, v1, v2}, Lo/emb;->setPadding(IIII)V

    .line 141
    const/4 v0, 0x1

    return v0

    .line 142
    :cond_1
    invoke-direct {p0}, Lo/emb;->b()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-direct {p0}, Lo/emb;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 144
    iget v0, p0, Lo/emb;->a:F

    sub-float/2addr v0, v4

    iput v0, p0, Lo/emb;->c:F

    .line 145
    iget v0, p0, Lo/emb;->c:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    .line 146
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 149
    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/emb;->o:Z

    .line 150
    iget v0, p0, Lo/emb;->c:F

    float-to-int v0, v0

    div-int/lit8 v5, v0, 0x3

    .line 151
    iget v0, p0, Lo/emb;->g:I

    add-int/2addr v5, v0

    .line 152
    iget v0, p0, Lo/emb;->h:I

    iget v1, p0, Lo/emb;->i:I

    iget v2, p0, Lo/emb;->f:I

    invoke-virtual {p0, v0, v1, v5, v2}, Lo/emb;->setPadding(IIII)V

    .line 154
    const/4 v0, 0x1

    return v0

    .line 155
    :cond_3
    invoke-direct {p0}, Lo/emb;->b()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-direct {p0}, Lo/emb;->e()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 157
    invoke-virtual {p0}, Lo/emb;->getChildCount()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 158
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 159
    :cond_4
    iget v0, p0, Lo/emb;->a:F

    sub-float v0, v4, v0

    iput v0, p0, Lo/emb;->c:F

    .line 160
    iget v0, p0, Lo/emb;->c:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_5

    .line 162
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/emb;->o:Z

    .line 163
    iget v0, p0, Lo/emb;->c:F

    float-to-int v0, v0

    div-int/lit8 v5, v0, 0x3

    .line 164
    iget v0, p0, Lo/emb;->h:I

    add-int/2addr v5, v0

    .line 165
    const-string v0, "UIHLH_ParallaxRecyclerView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ACTION_MOVE \u53f3\u62c9  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    iget v0, p0, Lo/emb;->i:I

    iget v1, p0, Lo/emb;->g:I

    iget v2, p0, Lo/emb;->f:I

    invoke-virtual {p0, v5, v0, v1, v2}, Lo/emb;->setPadding(IIII)V

    .line 167
    goto :goto_0

    .line 169
    :cond_5
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/emb;->o:Z

    .line 170
    iget v0, p0, Lo/emb;->c:F

    neg-float v0, v0

    float-to-int v0, v0

    div-int/lit8 v5, v0, 0x3

    .line 171
    iget v0, p0, Lo/emb;->g:I

    add-int/2addr v5, v0

    .line 172
    iget v0, p0, Lo/emb;->h:I

    iget v1, p0, Lo/emb;->i:I

    iget v2, p0, Lo/emb;->f:I

    invoke-virtual {p0, v0, v1, v5, v2}, Lo/emb;->setPadding(IIII)V

    .line 174
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 177
    :cond_6
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 181
    :pswitch_2
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Lo/emb;->d:I

    .line 182
    goto/16 :goto_3

    .line 184
    :pswitch_3
    invoke-direct {p0, p1}, Lo/emb;->d(Landroid/view/MotionEvent;)V

    .line 185
    goto/16 :goto_3

    .line 188
    :pswitch_4
    iget-boolean v0, p0, Lo/emb;->o:Z

    if-eqz v0, :cond_9

    .line 190
    invoke-virtual {p0}, Lo/emb;->getPaddingLeft()I

    move-result v4

    .line 191
    const/4 v5, 0x0

    .line 192
    const-string v0, "UIHLH_ParallaxRecyclerView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ACTION_UP getPaddingLeft "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " paddingLeft "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/emb;->h:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    :goto_1
    iget v0, p0, Lo/emb;->h:I

    if-le v4, v0, :cond_8

    .line 195
    add-int/lit8 v4, v4, -0xa

    .line 196
    if-gez v4, :cond_7

    .line 197
    const/4 v4, 0x0

    .line 198
    :cond_7
    add-int/lit8 v5, v5, 0xa

    .line 199
    move v6, v4

    .line 201
    iget-object v0, p0, Lo/emb;->m:Landroid/os/Handler;

    new-instance v1, Lo/emb$5;

    invoke-direct {v1, p0, v6}, Lo/emb$5;-><init>(Lo/emb;I)V

    int-to-long v2, v5

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 207
    goto :goto_1

    .line 208
    :cond_8
    goto :goto_3

    .line 210
    :cond_9
    invoke-virtual {p0}, Lo/emb;->getPaddingRight()I

    move-result v4

    .line 211
    const/4 v5, 0x0

    .line 213
    :goto_2
    iget v0, p0, Lo/emb;->g:I

    if-le v4, v0, :cond_b

    .line 215
    add-int/lit8 v4, v4, -0xa

    .line 216
    if-gez v4, :cond_a

    .line 217
    const/4 v4, 0x0

    .line 218
    :cond_a
    add-int/lit8 v5, v5, 0xa

    .line 219
    move v6, v4

    .line 221
    iget-object v0, p0, Lo/emb;->m:Landroid/os/Handler;

    new-instance v1, Lo/emb$3;

    invoke-direct {v1, p0, v6}, Lo/emb$3;-><init>(Lo/emb;I)V

    int-to-long v2, v5

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 228
    goto :goto_2

    .line 233
    :cond_b
    :goto_3
    :pswitch_5
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_4
        :pswitch_1
        :pswitch_4
        :pswitch_5
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
