.class public Lo/dyt;
.super Lo/elm;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field private a:I

.field private b:Z

.field private c:I

.field private d:I

.field private e:I

.field private f:Z

.field private g:Z

.field private h:I

.field private i:Z

.field private k:Z

.field private l:I

.field private m:F

.field private n:Landroid/os/Handler;

.field private o:F

.field private p:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 75
    invoke-direct {p0, p1}, Lo/elm;-><init>(Landroid/content/Context;)V

    .line 33
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dyt;->f:Z

    .line 36
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dyt;->k:Z

    .line 43
    const/high16 v0, 0x40200000    # 2.5f

    iput v0, p0, Lo/dyt;->o:F

    .line 44
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lo/dyt;->n:Landroid/os/Handler;

    .line 47
    const/16 v0, 0x14

    iput v0, p0, Lo/dyt;->l:I

    .line 76
    invoke-direct {p0}, Lo/dyt;->c()V

    .line 77
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 80
    invoke-direct {p0, p1, p2}, Lo/elm;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 33
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dyt;->f:Z

    .line 36
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dyt;->k:Z

    .line 43
    const/high16 v0, 0x40200000    # 2.5f

    iput v0, p0, Lo/dyt;->o:F

    .line 44
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lo/dyt;->n:Landroid/os/Handler;

    .line 47
    const/16 v0, 0x14

    iput v0, p0, Lo/dyt;->l:I

    .line 81
    invoke-direct {p0}, Lo/dyt;->c()V

    .line 82
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 85
    invoke-direct {p0, p1, p2, p3}, Lo/elm;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 33
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dyt;->f:Z

    .line 36
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dyt;->k:Z

    .line 43
    const/high16 v0, 0x40200000    # 2.5f

    iput v0, p0, Lo/dyt;->o:F

    .line 44
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lo/dyt;->n:Landroid/os/Handler;

    .line 47
    const/16 v0, 0x14

    iput v0, p0, Lo/dyt;->l:I

    .line 86
    invoke-direct {p0}, Lo/dyt;->c()V

    .line 87
    return-void
.end method

.method static synthetic a(Lo/dyt;)I
    .locals 1

    .line 18
    iget v0, p0, Lo/dyt;->d:I

    return v0
.end method

.method static synthetic b(Lo/dyt;)I
    .locals 1

    .line 18
    iget v0, p0, Lo/dyt;->c:I

    return v0
.end method

.method static synthetic c(Lo/dyt;)I
    .locals 1

    .line 18
    iget v0, p0, Lo/dyt;->a:I

    return v0
.end method

.method private c()V
    .locals 2

    .line 91
    invoke-virtual {p0}, Lo/dyt;->getPaddingLeft()I

    move-result v0

    iput v0, p0, Lo/dyt;->a:I

    .line 92
    invoke-virtual {p0}, Lo/dyt;->getPaddingRight()I

    move-result v0

    iput v0, p0, Lo/dyt;->c:I

    .line 93
    invoke-virtual {p0}, Lo/dyt;->getPaddingTop()I

    move-result v0

    iput v0, p0, Lo/dyt;->e:I

    .line 94
    invoke-virtual {p0}, Lo/dyt;->getPaddingBottom()I

    move-result v0

    iput v0, p0, Lo/dyt;->d:I

    .line 96
    invoke-virtual {p0, p0}, Lo/dyt;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 98
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_0

    .line 99
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lo/dyt;->setOverScrollMode(I)V

    .line 102
    :cond_0
    return-void
.end method

.method static synthetic e(Lo/dyt;)I
    .locals 1

    .line 18
    iget v0, p0, Lo/dyt;->e:I

    return v0
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 1

    .line 197
    if-nez p2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lo/dyt;->g:Z

    .line 198
    add-int v0, p2, p3

    if-ne v0, p4, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lo/dyt;->i:Z

    .line 199
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 0

    .line 203
    iput p2, p0, Lo/dyt;->h:I

    .line 204
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 107
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_3

    .line 109
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lo/dyt;->p:F

    .line 110
    goto/16 :goto_3

    .line 114
    :pswitch_1
    iget-object v0, p0, Lo/dyt;->n:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 116
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lo/dyt;->m:F

    .line 117
    iget v0, p0, Lo/dyt;->m:F

    iget v1, p0, Lo/dyt;->p:F

    sub-float/2addr v0, v1

    iget v1, p0, Lo/dyt;->o:F

    div-float/2addr v0, v1

    float-to-int v4, v0

    .line 118
    if-lez v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lo/dyt;->b:Z

    .line 120
    iget-boolean v0, p0, Lo/dyt;->b:Z

    if-eqz v0, :cond_1

    .line 121
    iget-boolean v0, p0, Lo/dyt;->f:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lo/dyt;->g:Z

    if-eqz v0, :cond_4

    iget v0, p0, Lo/dyt;->h:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    .line 122
    iget v0, p0, Lo/dyt;->e:I

    add-int/2addr v4, v0

    .line 123
    iget v0, p0, Lo/dyt;->a:I

    iget v1, p0, Lo/dyt;->c:I

    iget v2, p0, Lo/dyt;->d:I

    invoke-virtual {p0, v0, v4, v1, v2}, Lo/dyt;->setPadding(IIII)V

    .line 124
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/dyt;->setSelection(I)V

    goto/16 :goto_3

    .line 128
    :cond_1
    iget-boolean v0, p0, Lo/dyt;->k:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lo/dyt;->i:Z

    if-eqz v0, :cond_4

    iget v0, p0, Lo/dyt;->h:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    .line 129
    iget v0, p0, Lo/dyt;->d:I

    sub-int/2addr v4, v0

    .line 130
    iget v0, p0, Lo/dyt;->a:I

    iget v1, p0, Lo/dyt;->e:I

    iget v2, p0, Lo/dyt;->c:I

    neg-int v3, v4

    invoke-virtual {p0, v0, v1, v2, v3}, Lo/dyt;->setPadding(IIII)V

    .line 131
    invoke-virtual {p0}, Lo/dyt;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Lo/dyt;->setSelection(I)V

    goto/16 :goto_3

    .line 137
    :pswitch_2
    iget-boolean v0, p0, Lo/dyt;->b:Z

    if-eqz v0, :cond_3

    .line 138
    iget-boolean v0, p0, Lo/dyt;->f:Z

    if-eqz v0, :cond_4

    .line 139
    invoke-virtual {p0}, Lo/dyt;->getPaddingTop()I

    move-result v5

    .line 140
    const/4 v6, 0x0

    .line 142
    :goto_1
    iget v0, p0, Lo/dyt;->e:I

    if-le v5, v0, :cond_2

    .line 143
    iget v0, p0, Lo/dyt;->l:I

    sub-int/2addr v5, v0

    .line 144
    add-int/lit8 v6, v6, 0xa

    .line 145
    move v7, v5

    .line 147
    iget-object v0, p0, Lo/dyt;->n:Landroid/os/Handler;

    new-instance v1, Lo/dyt$1;

    invoke-direct {v1, p0, v7}, Lo/dyt$1;-><init>(Lo/dyt;I)V

    int-to-long v2, v6

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 161
    goto :goto_1

    .line 162
    :cond_2
    goto :goto_3

    .line 164
    :cond_3
    iget-boolean v0, p0, Lo/dyt;->k:Z

    if-eqz v0, :cond_4

    .line 165
    invoke-virtual {p0}, Lo/dyt;->getPaddingBottom()I

    move-result v5

    .line 166
    const/4 v6, 0x0

    .line 168
    :goto_2
    iget v0, p0, Lo/dyt;->d:I

    if-le v5, v0, :cond_4

    .line 169
    iget v0, p0, Lo/dyt;->l:I

    sub-int/2addr v5, v0

    .line 170
    add-int/lit8 v6, v6, 0xa

    .line 171
    move v7, v5

    .line 173
    iget-object v0, p0, Lo/dyt;->n:Landroid/os/Handler;

    new-instance v1, Lo/dyt$4;

    invoke-direct {v1, p0, v7}, Lo/dyt$4;-><init>(Lo/dyt;I)V

    int-to-long v2, v6

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 184
    goto :goto_2

    .line 185
    .line 191
    :cond_4
    :goto_3
    invoke-super {p0, p1}, Lo/elm;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method protected overScrollBy(IIIIIIIIZ)Z
    .locals 1

    .line 210
    invoke-super/range {p0 .. p9}, Lo/elm;->overScrollBy(IIIIIIIIZ)Z

    move-result v0

    return v0
.end method

.method public setBottomNotChange()V
    .locals 1

    .line 64
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dyt;->k:Z

    .line 65
    return-void
.end method

.method public setSpringBackSpeed(I)V
    .locals 0

    .line 54
    if-gtz p1, :cond_0

    .line 55
    return-void

    .line 57
    :cond_0
    iput p1, p0, Lo/dyt;->l:I

    .line 58
    return-void
.end method

.method public setTopNotChange()V
    .locals 1

    .line 71
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dyt;->f:Z

    .line 72
    return-void
.end method
