.class public Lo/efz;
.super Lo/efb;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/view/GestureDetector;

.field private c:Lo/efw;

.field private e:Landroid/graphics/Rect;

.field private f:Z

.field private g:Lo/efo;

.field private h:Lo/efo;

.field private i:Lo/efo;

.field private k:Lo/efo;

.field private l:J

.field private m:Landroid/animation/TimeInterpolator;

.field private n:Lo/efo;

.field private o:Lo/efo;

.field private p:Landroid/animation/ValueAnimator;

.field private q:Z

.field private s:Z

.field private t:Lo/efo;

.field private u:Lo/eft;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 43
    invoke-direct {p0, p1}, Lo/efb;-><init>(Landroid/content/Context;)V

    .line 95
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/efz;->f:Z

    .line 173
    const-wide/16 v0, 0x320

    iput-wide v0, p0, Lo/efz;->l:J

    .line 178
    new-instance v0, Lo/eft;

    invoke-direct {v0}, Lo/eft;-><init>()V

    iput-object v0, p0, Lo/efz;->u:Lo/eft;

    .line 242
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/efz;->q:Z

    .line 243
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/efz;->s:Z

    .line 44
    invoke-direct {p0, p1}, Lo/efz;->e(Landroid/content/Context;)V

    .line 45
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 48
    invoke-direct {p0, p1, p2}, Lo/efb;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 95
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/efz;->f:Z

    .line 173
    const-wide/16 v0, 0x320

    iput-wide v0, p0, Lo/efz;->l:J

    .line 178
    new-instance v0, Lo/eft;

    invoke-direct {v0}, Lo/eft;-><init>()V

    iput-object v0, p0, Lo/efz;->u:Lo/eft;

    .line 242
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/efz;->q:Z

    .line 243
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/efz;->s:Z

    .line 49
    invoke-direct {p0, p1}, Lo/efz;->e(Landroid/content/Context;)V

    .line 50
    return-void
.end method

.method static synthetic a(Lo/efz;)Lo/efo;
    .locals 1

    .line 35
    iget-object v0, p0, Lo/efz;->o:Lo/efo;

    return-object v0
.end method

.method static synthetic b(Lo/efz;)Lo/efo;
    .locals 1

    .line 35
    iget-object v0, p0, Lo/efz;->i:Lo/efo;

    return-object v0
.end method

.method static synthetic c(Lo/efz;)Lo/efo;
    .locals 1

    .line 35
    iget-object v0, p0, Lo/efz;->g:Lo/efo;

    return-object v0
.end method

.method static synthetic c(Lo/efz;Lo/efo;)Lo/efo;
    .locals 0

    .line 35
    iput-object p1, p0, Lo/efz;->t:Lo/efo;

    return-object p1
.end method

.method private c()V
    .locals 5

    .line 86
    new-instance v0, Lo/efw;

    iget-object v1, p0, Lo/efz;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/efw;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/efz;->c:Lo/efw;

    .line 87
    iget-object v0, p0, Lo/efz;->c:Lo/efw;

    const-string v1, "medal/medal.mat"

    invoke-virtual {v0, v1}, Lo/efw;->a(Ljava/lang/String;)V

    .line 88
    iget-object v0, p0, Lo/efz;->c:Lo/efw;

    const/high16 v1, -0x3e100000    # -30.0f

    const/high16 v2, 0x41a00000    # 20.0f

    const/high16 v3, 0x41200000    # 10.0f

    invoke-virtual {v0, v1, v2, v3}, Lo/efw;->b(FFF)V

    .line 89
    iget-object v0, p0, Lo/efz;->c:Lo/efw;

    const/high16 v1, 0x3f000000    # 0.5f

    const v2, 0x3e99999a    # 0.3f

    const v3, 0x3ecccccd    # 0.4f

    const/high16 v4, 0x42ba0000    # 93.0f

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/efw;->b(FFFF)V

    .line 90
    iget-object v0, p0, Lo/efz;->c:Lo/efw;

    const/high16 v1, 0x42c80000    # 100.0f

    const/high16 v2, -0x3db80000    # -50.0f

    const/high16 v3, 0x41200000    # 10.0f

    invoke-virtual {v0, v1, v2, v3}, Lo/efw;->a(FFF)V

    .line 91
    iget-object v0, p0, Lo/efz;->c:Lo/efw;

    const v1, 0x3dcccccd    # 0.1f

    const v2, 0x3e4ccccd    # 0.2f

    const v3, 0x3ecccccd    # 0.4f

    const/high16 v4, 0x42b60000    # 91.0f

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/efw;->e(FFFF)V

    .line 92
    iget-object v0, p0, Lo/efz;->d:Lo/efd;

    const/4 v1, 0x1

    new-array v1, v1, [Lo/eew;

    iget-object v2, p0, Lo/efz;->c:Lo/efw;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Lo/efd;->c([Lo/eew;)V

    .line 93
    return-void
.end method

.method static synthetic d(Lo/efz;)Lo/efo;
    .locals 1

    .line 35
    iget-object v0, p0, Lo/efz;->k:Lo/efo;

    return-object v0
.end method

.method static synthetic d(Lo/efz;Lo/efo;)Lo/efo;
    .locals 0

    .line 35
    iput-object p1, p0, Lo/efz;->n:Lo/efo;

    return-object p1
.end method

.method static synthetic e(Lo/efz;)Lo/efw;
    .locals 1

    .line 35
    iget-object v0, p0, Lo/efz;->c:Lo/efw;

    return-object v0
.end method

.method private e(Landroid/content/Context;)V
    .locals 3

    .line 53
    const-string v0, "MedalView"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/eez;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " current version name="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "1.7.0"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eez;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    iput-object p1, p0, Lo/efz;->a:Landroid/content/Context;

    .line 57
    new-instance v0, Landroid/view/GestureDetector;

    iget-object v1, p0, Lo/efz;->a:Landroid/content/Context;

    new-instance v2, Lo/efz$4;

    invoke-direct {v2, p0}, Lo/efz$4;-><init>(Lo/efz;)V

    invoke-direct {v0, v1, v2}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lo/efz;->b:Landroid/view/GestureDetector;

    .line 78
    invoke-virtual {p0}, Lo/efz;->requestFocus()Z

    .line 79
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/efz;->setFocusableInTouchMode(Z)V

    .line 80
    new-instance v0, Lo/efv;

    invoke-direct {v0}, Lo/efv;-><init>()V

    invoke-virtual {p0, v0}, Lo/efz;->setTranslucent(Landroid/opengl/GLSurfaceView$EGLConfigChooser;)V

    .line 81
    invoke-virtual {p0}, Lo/efz;->d()V

    .line 82
    invoke-direct {p0}, Lo/efz;->c()V

    .line 83
    return-void
.end method

.method static synthetic f(Lo/efz;)Lo/efo;
    .locals 1

    .line 35
    iget-object v0, p0, Lo/efz;->t:Lo/efo;

    return-object v0
.end method

.method static synthetic g(Lo/efz;)Z
    .locals 1

    .line 35
    iget-boolean v0, p0, Lo/efz;->q:Z

    return v0
.end method

.method static synthetic i(Lo/efz;)Lo/efo;
    .locals 1

    .line 35
    iget-object v0, p0, Lo/efz;->h:Lo/efo;

    return-object v0
.end method

.method static synthetic k(Lo/efz;)Lo/efo;
    .locals 1

    .line 35
    iget-object v0, p0, Lo/efz;->n:Lo/efo;

    return-object v0
.end method


# virtual methods
.method public b()V
    .locals 1

    .line 140
    iget-object v0, p0, Lo/efz;->p:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/efz;->p:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 141
    iget-object v0, p0, Lo/efz;->p:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->end()V

    .line 142
    const/4 v0, 0x0

    iput-object v0, p0, Lo/efz;->p:Landroid/animation/ValueAnimator;

    .line 144
    :cond_0
    iget-object v0, p0, Lo/efz;->c:Lo/efw;

    if-eqz v0, :cond_1

    .line 145
    iget-object v0, p0, Lo/efz;->c:Lo/efw;

    invoke-virtual {v0}, Lo/efw;->c()V

    .line 146
    const/4 v0, 0x0

    iput-object v0, p0, Lo/efz;->c:Lo/efw;

    .line 148
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lo/efz;->e:Landroid/graphics/Rect;

    .line 149
    iget-object v0, p0, Lo/efz;->u:Lo/eft;

    if-eqz v0, :cond_2

    .line 150
    iget-object v0, p0, Lo/efz;->u:Lo/eft;

    invoke-virtual {v0}, Lo/eft;->e()V

    .line 151
    const/4 v0, 0x0

    iput-object v0, p0, Lo/efz;->u:Lo/eft;

    .line 153
    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lo/efz;->g:Lo/efo;

    .line 154
    const/4 v0, 0x0

    iput-object v0, p0, Lo/efz;->i:Lo/efo;

    .line 155
    const/4 v0, 0x0

    iput-object v0, p0, Lo/efz;->h:Lo/efo;

    .line 156
    const/4 v0, 0x0

    iput-object v0, p0, Lo/efz;->k:Lo/efo;

    .line 157
    const/4 v0, 0x0

    iput-object v0, p0, Lo/efz;->o:Lo/efo;

    .line 158
    const/4 v0, 0x0

    iput-object v0, p0, Lo/efz;->n:Lo/efo;

    .line 159
    const/4 v0, 0x0

    iput-object v0, p0, Lo/efz;->t:Lo/efo;

    .line 160
    const/4 v0, 0x0

    iput-object v0, p0, Lo/efz;->m:Landroid/animation/TimeInterpolator;

    .line 161
    invoke-super {p0}, Lo/efb;->b()V

    .line 162
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 99
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v2

    .line 100
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v3

    .line 101
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_2

    .line 102
    iget-object v0, p0, Lo/efz;->e:Landroid/graphics/Rect;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/efz;->e:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    int-to-float v0, v0

    cmpl-float v0, v2, v0

    if-lez v0, :cond_1

    iget-object v0, p0, Lo/efz;->e:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    int-to-float v0, v0

    cmpg-float v0, v2, v0

    if-gez v0, :cond_1

    iget-object v0, p0, Lo/efz;->e:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->top:I

    int-to-float v0, v0

    cmpl-float v0, v3, v0

    if-lez v0, :cond_1

    iget-object v0, p0, Lo/efz;->e:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    int-to-float v0, v0

    cmpg-float v0, v3, v0

    if-gez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lo/efz;->f:Z

    .line 104
    :cond_2
    iget-boolean v0, p0, Lo/efz;->f:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lo/efz;->c:Lo/efw;

    if-eqz v0, :cond_3

    .line 105
    iget-object v0, p0, Lo/efz;->b:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 106
    iget-object v0, p0, Lo/efz;->c:Lo/efw;

    invoke-virtual {v0, p1}, Lo/efw;->b(Landroid/view/MotionEvent;)V

    .line 108
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_5

    .line 109
    :cond_4
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/efz;->f:Z

    .line 111
    :cond_5
    iget-boolean v0, p0, Lo/efz;->f:Z

    return v0
.end method

.method public e()V
    .locals 3

    .line 248
    iget-object v0, p0, Lo/efz;->c:Lo/efw;

    new-instance v1, Lo/efz$2;

    invoke-direct {v1, p0}, Lo/efz$2;-><init>(Lo/efz;)V

    invoke-virtual {v0, v1}, Lo/efw;->c(Ljava/lang/Runnable;)V

    .line 269
    iget-object v0, p0, Lo/efz;->p:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/efz;->p:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 270
    iget-object v0, p0, Lo/efz;->p:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 272
    :cond_0
    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lo/efz;->p:Landroid/animation/ValueAnimator;

    .line 273
    iget-object v0, p0, Lo/efz;->u:Lo/eft;

    invoke-virtual {v0}, Lo/eft;->b()V

    .line 274
    iget-object v0, p0, Lo/efz;->p:Landroid/animation/ValueAnimator;

    iget-wide v1, p0, Lo/efz;->l:J

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 275
    iget-object v0, p0, Lo/efz;->p:Landroid/animation/ValueAnimator;

    iget-object v1, p0, Lo/efz;->m:Landroid/animation/TimeInterpolator;

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 276
    iget-object v0, p0, Lo/efz;->p:Landroid/animation/ValueAnimator;

    new-instance v1, Lo/efz$5;

    invoke-direct {v1, p0}, Lo/efz$5;-><init>(Lo/efz;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 322
    iget-object v0, p0, Lo/efz;->p:Landroid/animation/ValueAnimator;

    new-instance v1, Lo/efz$3;

    invoke-direct {v1, p0}, Lo/efz$3;-><init>(Lo/efz;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 340
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/efz;->q:Z

    .line 341
    iget-object v0, p0, Lo/efz;->p:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 343
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public onPause()V
    .locals 1

    .line 134
    invoke-super {p0}, Lo/efb;->onPause()V

    .line 135
    iget-object v0, p0, Lo/efz;->c:Lo/efw;

    invoke-virtual {v0}, Lo/efw;->b()V

    .line 136
    return-void
.end method

.method public onResume()V
    .locals 1

    .line 128
    invoke-super {p0}, Lo/efb;->onResume()V

    .line 129
    iget-object v0, p0, Lo/efz;->c:Lo/efw;

    invoke-virtual {v0}, Lo/efw;->a()V

    .line 130
    return-void
.end method

.method public setAnimatorDuration(J)V
    .locals 3

    .line 227
    iget-object v0, p0, Lo/efz;->p:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/efz;->p:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 228
    const-string v0, "MedalView"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/eez;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " mShowAnimator is running"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eez;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    return-void

    .line 231
    :cond_0
    iput-wide p1, p0, Lo/efz;->l:J

    .line 232
    return-void
.end method

.method public setAnimatorInterpolator(Landroid/animation/TimeInterpolator;)V
    .locals 3

    .line 235
    iget-object v0, p0, Lo/efz;->p:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/efz;->p:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 236
    const-string v0, "MedalView"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/eez;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " mShowAnimator is running"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eez;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    return-void

    .line 239
    :cond_0
    iput-object p1, p0, Lo/efz;->m:Landroid/animation/TimeInterpolator;

    .line 240
    return-void
.end method

.method public setAnimatorPositionX(FF)V
    .locals 3

    .line 211
    iget-object v0, p0, Lo/efz;->p:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/efz;->p:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 212
    const-string v0, "MedalView"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/eez;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " mShowAnimator is running"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eez;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    return-void

    .line 215
    :cond_0
    new-instance v0, Lo/efo;

    invoke-direct {v0, p1, p2}, Lo/efo;-><init>(FF)V

    iput-object v0, p0, Lo/efz;->k:Lo/efo;

    .line 216
    return-void
.end method

.method public setAnimatorPositionY(FF)V
    .locals 3

    .line 219
    iget-object v0, p0, Lo/efz;->p:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/efz;->p:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 220
    const-string v0, "MedalView"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/eez;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " mShowAnimator is running"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eez;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    return-void

    .line 223
    :cond_0
    new-instance v0, Lo/efo;

    invoke-direct {v0, p1, p2}, Lo/efo;-><init>(FF)V

    iput-object v0, p0, Lo/efz;->o:Lo/efo;

    .line 224
    return-void
.end method

.method public setAnimatorRotationY(FF)V
    .locals 3

    .line 203
    iget-object v0, p0, Lo/efz;->p:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/efz;->p:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 204
    const-string v0, "MedalView"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/eez;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " mShowAnimator is running"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eez;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    return-void

    .line 207
    :cond_0
    new-instance v0, Lo/efo;

    invoke-direct {v0, p1, p2}, Lo/efo;-><init>(FF)V

    iput-object v0, p0, Lo/efz;->h:Lo/efo;

    .line 208
    return-void
.end method

.method public setAnimatorScaleX(FF)V
    .locals 3

    .line 187
    iget-object v0, p0, Lo/efz;->p:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/efz;->p:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 188
    const-string v0, "MedalView"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/eez;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " mShowAnimator is running"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eez;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    return-void

    .line 191
    :cond_0
    new-instance v0, Lo/efo;

    invoke-direct {v0, p1, p2}, Lo/efo;-><init>(FF)V

    iput-object v0, p0, Lo/efz;->g:Lo/efo;

    .line 192
    return-void
.end method

.method public setAnimatorScaleY(FF)V
    .locals 3

    .line 195
    iget-object v0, p0, Lo/efz;->p:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/efz;->p:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 196
    const-string v0, "MedalView"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/eez;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " mShowAnimator is running"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eez;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    return-void

    .line 199
    :cond_0
    new-instance v0, Lo/efo;

    invoke-direct {v0, p1, p2}, Lo/efo;-><init>(FF)V

    iput-object v0, p0, Lo/efz;->i:Lo/efo;

    .line 200
    return-void
.end method

.method public setAutoRotate(Z)V
    .locals 2

    .line 477
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Lo/efz;->setRenderMode(I)V

    .line 478
    iget-object v0, p0, Lo/efz;->p:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/efz;->p:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-nez v0, :cond_2

    .line 479
    :cond_1
    iget-object v0, p0, Lo/efz;->c:Lo/efw;

    invoke-virtual {v0, p1}, Lo/efw;->b(Z)V

    goto :goto_1

    .line 481
    :cond_2
    iget-object v0, p0, Lo/efz;->p:Landroid/animation/ValueAnimator;

    new-instance v1, Lo/efz$1;

    invoke-direct {v1, p0, p1}, Lo/efz$1;-><init>(Lo/efz;Z)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 492
    :goto_1
    return-void
.end method

.method public setBackContent(Lo/ega;)V
    .locals 1

    .line 504
    iget-object v0, p0, Lo/efz;->c:Lo/efw;

    invoke-virtual {v0, p1}, Lo/efw;->d(Lo/ega;)V

    .line 505
    return-void
.end method

.method public setBackContent([Ljava/lang/String;Landroid/graphics/Bitmap;Lo/egc$b;Lo/egc$a;)V
    .locals 3

    .line 515
    new-instance v0, Lo/ega$c;

    iget-object v1, p0, Lo/efz;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/ega$c;-><init>(Landroid/content/Context;)V

    .line 516
    invoke-virtual {v0, p3}, Lo/ega$c;->c(Lo/egc$b;)Lo/ega$c;

    move-result-object v0

    .line 517
    invoke-virtual {v0, p4}, Lo/ega$c;->e(Lo/egc$a;)Lo/ega$c;

    move-result-object v0

    .line 521
    invoke-virtual {v0, p2}, Lo/ega$c;->e(Landroid/graphics/Bitmap;)Lo/ega$c;

    move-result-object v0

    .line 522
    invoke-virtual {v0, p1}, Lo/ega$c;->a([Ljava/lang/String;)Lo/ega$c;

    move-result-object v0

    .line 523
    invoke-virtual {v0}, Lo/ega$c;->b()Lo/ega;

    move-result-object v2

    .line 524
    invoke-virtual {p0, v2}, Lo/efz;->setBackContent(Lo/ega;)V

    .line 525
    return-void
.end method

.method public setBackContent([Ljava/lang/String;Lo/egc$b;Lo/egc$a;)V
    .locals 1

    .line 534
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2, p3}, Lo/efz;->setBackContent([Ljava/lang/String;Landroid/graphics/Bitmap;Lo/egc$b;Lo/egc$a;)V

    .line 535
    return-void
.end method

.method public setBackContentTest([Ljava/lang/String;Landroid/graphics/Bitmap;Lo/egc$b;Lo/egc$a;)V
    .locals 3

    .line 538
    new-instance v0, Lo/ega$c;

    iget-object v1, p0, Lo/efz;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/ega$c;-><init>(Landroid/content/Context;)V

    .line 539
    invoke-virtual {v0, p3}, Lo/ega$c;->c(Lo/egc$b;)Lo/ega$c;

    move-result-object v0

    .line 540
    invoke-virtual {v0, p4}, Lo/ega$c;->e(Lo/egc$a;)Lo/ega$c;

    move-result-object v0

    .line 544
    invoke-virtual {v0, p2}, Lo/ega$c;->e(Landroid/graphics/Bitmap;)Lo/ega$c;

    move-result-object v0

    .line 545
    invoke-virtual {v0, p1}, Lo/ega$c;->a([Ljava/lang/String;)Lo/ega$c;

    move-result-object v0

    .line 546
    invoke-virtual {v0}, Lo/ega$c;->b()Lo/ega;

    move-result-object v2

    .line 547
    iget-object v0, p0, Lo/efz;->c:Lo/efw;

    invoke-virtual {v0, v2, p2}, Lo/efw;->c(Lo/ega;Landroid/graphics/Bitmap;)V

    .line 548
    return-void
.end method

.method public setFrameRotationYAngle(F)V
    .locals 1

    .line 495
    iget-object v0, p0, Lo/efz;->c:Lo/efw;

    invoke-virtual {v0, p1}, Lo/efw;->b(F)V

    .line 496
    return-void
.end method

.method public setObjData(Lo/efj$d;)V
    .locals 4

    .line 123
    iget-object v0, p0, Lo/efz;->c:Lo/efw;

    invoke-virtual {p1}, Lo/efj$d;->b()[F

    move-result-object v1

    invoke-virtual {p1}, Lo/efj$d;->d()[F

    move-result-object v2

    invoke-virtual {p1}, Lo/efj$d;->c()[F

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lo/efw;->e([F[F[F)V

    .line 124
    return-void
.end method

.method public setTexture(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 115
    iget-object v0, p0, Lo/efz;->c:Lo/efw;

    invoke-virtual {v0, p1}, Lo/efw;->b(Landroid/graphics/Bitmap;)V

    .line 116
    return-void
.end method

.method public setTexture(Landroid/graphics/Bitmap;Z)V
    .locals 1

    .line 119
    iget-object v0, p0, Lo/efz;->c:Lo/efw;

    invoke-virtual {v0, p1, p2}, Lo/efw;->c(Landroid/graphics/Bitmap;Z)V

    .line 120
    return-void
.end method

.method public setTouchRect(Landroid/graphics/Rect;)V
    .locals 0

    .line 165
    iput-object p1, p0, Lo/efz;->e:Landroid/graphics/Rect;

    .line 166
    return-void
.end method
