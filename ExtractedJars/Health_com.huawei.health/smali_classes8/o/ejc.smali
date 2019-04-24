.class public Lo/ejc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eje;


# instance fields
.field private a:Lo/nz;

.field private b:Z

.field private c:Z

.field private d:Lo/eie;

.field private e:Landroid/content/Context;

.field private f:Landroid/graphics/Matrix;

.field private g:Lo/eja;

.field private h:Landroid/graphics/Matrix;

.field private i:Lo/ejd;

.field private k:Lo/oa;

.field private l:J

.field private m:I

.field private n:I

.field private o:Landroid/view/VelocityTracker;

.field private p:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private s:Z

.field private t:Z


# direct methods
.method constructor <init>(Landroid/content/Context;Lo/eie;Lo/oa;Lo/eja;)V
    .locals 3

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ejc;->c:Z

    .line 38
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/nz;->d(FF)Lo/nz;

    move-result-object v0

    iput-object v0, p0, Lo/ejc;->a:Lo/nz;

    .line 40
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ejc;->b:Z

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ejc;->d:Lo/eie;

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ejc;->g:Lo/eja;

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ejc;->k:Lo/oa;

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ejc;->f:Landroid/graphics/Matrix;

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ejc;->i:Lo/ejd;

    .line 54
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lo/ejc;->h:Landroid/graphics/Matrix;

    .line 66
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo/ejc;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 69
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ejc;->t:Z

    .line 70
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ejc;->s:Z

    .line 76
    iput-object p1, p0, Lo/ejc;->e:Landroid/content/Context;

    .line 77
    iput-object p2, p0, Lo/ejc;->d:Lo/eie;

    .line 78
    iput-object p3, p0, Lo/ejc;->k:Lo/oa;

    .line 79
    iput-object p4, p0, Lo/ejc;->g:Lo/eja;

    .line 80
    iget-object v0, p0, Lo/ejc;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v2

    .line 81
    const/16 v0, 0x1964

    iput v0, p0, Lo/ejc;->m:I

    .line 82
    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v0

    iput v0, p0, Lo/ejc;->n:I

    .line 83
    invoke-virtual {p3}, Lo/oa;->p()Landroid/graphics/Matrix;

    move-result-object v0

    iput-object v0, p0, Lo/ejc;->f:Landroid/graphics/Matrix;

    .line 85
    new-instance v0, Lo/ejd;

    iget-object v1, p0, Lo/ejc;->d:Lo/eie;

    invoke-direct {v0, v1}, Lo/ejd;-><init>(Lo/eie;)V

    iput-object v0, p0, Lo/ejc;->i:Lo/ejd;

    .line 86
    return-void
.end method

.method private a()V
    .locals 3

    .line 298
    iget-object v0, p0, Lo/ejc;->d:Lo/eie;

    instance-of v0, v0, Lo/eih;

    if-eqz v0, :cond_0

    .line 299
    iget-object v0, p0, Lo/ejc;->d:Lo/eie;

    move-object v2, v0

    check-cast v2, Lo/eih;

    .line 300
    invoke-virtual {v2}, Lo/eih;->Z()Lo/eih$c;

    move-result-object v0

    sget-object v1, Lo/eih$c;->e:Lo/eih$c;

    if-ne v0, v1, :cond_0

    .line 301
    new-instance v0, Lo/ejc$1;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0, p0, v2, v2}, Lo/ejc$1;-><init>(Lo/ejc;Lo/eih;Lo/eih;)V

    invoke-virtual {v2, v0}, Lo/eih;->c(Lo/eih$k;)V

    .line 310
    :cond_0
    return-void
.end method

.method private a(FF)V
    .locals 3

    .line 433
    const-string v0, "cming"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "performDrag:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 434
    iget-object v0, p0, Lo/ejc;->f:Landroid/graphics/Matrix;

    iget-object v1, p0, Lo/ejc;->h:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 435
    iget-object v0, p0, Lo/ejc;->f:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 437
    return-void
.end method

.method private a(Landroid/view/MotionEvent;)V
    .locals 6

    .line 184
    iget-object v0, p0, Lo/ejc;->g:Lo/eja;

    iget-object v0, v0, Lo/eja;->k:Lo/eih$c;

    sget-object v1, Lo/eih$c;->e:Lo/eih$c;

    if-eq v0, v1, :cond_0

    .line 185
    invoke-direct {p0}, Lo/ejc;->c()V

    .line 186
    return-void

    .line 189
    :cond_0
    iget-object v0, p0, Lo/ejc;->o:Landroid/view/VelocityTracker;

    invoke-direct {p0, p1, v0}, Lo/ejc;->a(Landroid/view/MotionEvent;Landroid/view/VelocityTracker;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 190
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget-object v1, p0, Lo/ejc;->a:Lo/nz;

    iget v1, v1, Lo/nz;->e:F

    sub-float v2, v0, v1

    .line 192
    const/4 v0, 0x0

    cmpg-float v0, v2, v0

    if-gez v0, :cond_1

    iget-object v0, p0, Lo/ejc;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/ehw;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x0

    cmpl-float v0, v2, v0

    if-lez v0, :cond_3

    iget-object v0, p0, Lo/ejc;->e:Landroid/content/Context;

    .line 193
    invoke-static {v0}, Lo/ehw;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 195
    :cond_2
    const/4 v3, 0x1

    goto :goto_0

    .line 197
    :cond_3
    const/4 v3, 0x0

    .line 199
    :goto_0
    iget-object v0, p0, Lo/ejc;->o:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v4

    .line 200
    iget v0, p0, Lo/ejc;->m:I

    int-to-float v0, v0

    cmpg-float v0, v4, v0

    if-gez v0, :cond_4

    .line 202
    iget v0, p0, Lo/ejc;->m:I

    int-to-float v4, v0

    .line 204
    :cond_4
    invoke-direct {p0, p1, v4, v3}, Lo/ejc;->d(Landroid/view/MotionEvent;FZ)Z

    move-result v5

    .line 205
    if-eqz v5, :cond_5

    .line 207
    invoke-direct {p0}, Lo/ejc;->c()V

    .line 208
    return-void

    .line 213
    :cond_5
    iget-object v0, p0, Lo/ejc;->d:Lo/eie;

    instance-of v0, v0, Lo/eih;

    if-eqz v0, :cond_6

    .line 214
    iget-object v0, p0, Lo/ejc;->d:Lo/eie;

    move-object v2, v0

    check-cast v2, Lo/eih;

    .line 215
    invoke-virtual {v2}, Lo/eih;->Z()Lo/eih$c;

    move-result-object v0

    sget-object v1, Lo/eih$c;->e:Lo/eih$c;

    if-ne v0, v1, :cond_6

    .line 216
    new-instance v0, Lo/ejc$2;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0, p0, v2, v2}, Lo/ejc$2;-><init>(Lo/ejc;Lo/eih;Lo/eih;)V

    invoke-virtual {v2, v0}, Lo/eih;->c(Lo/eih$k;)V

    .line 226
    :cond_6
    invoke-direct {p0}, Lo/ejc;->c()V

    .line 227
    return-void
.end method

.method private a(Landroid/view/MotionEvent;Landroid/view/VelocityTracker;)Z
    .locals 5

    .line 232
    iget-object v0, p0, Lo/ejc;->o:Landroid/view/VelocityTracker;

    iget v1, p0, Lo/ejc;->n:I

    int-to-float v1, v1

    const/16 v2, 0x3e8

    invoke-virtual {v0, v2, v1}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 234
    iget-object v0, p0, Lo/ejc;->o:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result v4

    .line 237
    iget-object v0, p0, Lo/ejc;->d:Lo/eie;

    instance-of v0, v0, Lo/eih;

    if-eqz v0, :cond_1

    .line 238
    iget-object v0, p0, Lo/ejc;->d:Lo/eie;

    check-cast v0, Lo/eih;

    invoke-virtual {v0}, Lo/eih;->ab()Z

    move-result v0

    if-nez v0, :cond_1

    .line 240
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget-object v1, p0, Lo/ejc;->a:Lo/nz;

    invoke-virtual {v1}, Lo/nz;->d()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget-object v1, p0, Lo/ejc;->k:Lo/oa;

    invoke-virtual {v1}, Lo/oa;->g()F

    move-result v1

    div-float/2addr v0, v1

    const v1, 0x3e2aaaab

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 245
    :cond_1
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v1, p0, Lo/ejc;->m:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    .line 246
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget-object v1, p0, Lo/ejc;->a:Lo/nz;

    invoke-virtual {v1}, Lo/nz;->d()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget-object v1, p0, Lo/ejc;->k:Lo/oa;

    invoke-virtual {v1}, Lo/oa;->g()F

    move-result v1

    div-float/2addr v0, v1

    const v1, 0x3e2aaaab

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    iget-wide v0, p0, Lo/ejc;->l:J

    .line 247
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0x258

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    .line 245
    :goto_1
    return v0
.end method

.method static synthetic b(Lo/ejc;)Lo/eie;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/ejc;->d:Lo/eie;

    return-object v0
.end method

.method private c()V
    .locals 1

    .line 170
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ejc;->c:Z

    .line 173
    iget-object v0, p0, Lo/ejc;->o:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    .line 174
    iget-object v0, p0, Lo/ejc;->o:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    .line 176
    :cond_0
    return-void
.end method

.method private c(Landroid/view/MotionEvent;)V
    .locals 4

    .line 256
    iget-boolean v0, p0, Lo/ejc;->b:Z

    if-nez v0, :cond_1

    .line 257
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget-object v1, p0, Lo/ejc;->a:Lo/nz;

    invoke-virtual {v1}, Lo/nz;->d()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v2

    .line 258
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget-object v1, p0, Lo/ejc;->a:Lo/nz;

    invoke-virtual {v1}, Lo/nz;->c()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v3

    .line 259
    sget v0, Lo/eji;->c:I

    int-to-float v0, v0

    cmpl-float v0, v2, v0

    if-lez v0, :cond_1

    sget v0, Lo/eji;->c:I

    int-to-float v0, v0

    cmpl-float v0, v3, v0

    if-lez v0, :cond_1

    .line 261
    const/high16 v0, 0x40000000    # 2.0f

    mul-float/2addr v0, v3

    cmpg-float v0, v2, v0

    if-gez v0, :cond_0

    .line 262
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ejc;->b:Z

    .line 264
    invoke-direct {p0}, Lo/ejc;->a()V

    .line 265
    invoke-direct {p0}, Lo/ejc;->c()V

    .line 266
    return-void

    .line 269
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ejc;->b:Z

    .line 276
    :cond_1
    const/4 v2, 0x0

    .line 278
    iget-object v0, p0, Lo/ejc;->g:Lo/eja;

    iget-object v0, v0, Lo/eja;->k:Lo/eih$c;

    sget-object v1, Lo/eih$c;->e:Lo/eih$c;

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lo/ejc;->d:Lo/eie;

    check-cast v0, Lo/eih;

    .line 279
    invoke-virtual {v0}, Lo/eih;->ab()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 280
    const/4 v2, 0x1

    .line 283
    :cond_2
    iget-object v0, p0, Lo/ejc;->g:Lo/eja;

    iget-object v0, v0, Lo/eja;->k:Lo/eih$c;

    sget-object v1, Lo/eih$c;->a:Lo/eih$c;

    if-ne v0, v1, :cond_3

    .line 284
    const/4 v2, 0x1

    .line 287
    :cond_3
    if-nez v2, :cond_4

    .line 288
    return-void

    .line 291
    :cond_4
    invoke-direct {p0, p1}, Lo/ejc;->h(Landroid/view/MotionEvent;)V

    .line 293
    return-void
.end method

.method private d(Landroid/view/MotionEvent;FZ)Z
    .locals 5

    .line 315
    iget-object v0, p0, Lo/ejc;->d:Lo/eie;

    instance-of v0, v0, Lo/eih;

    if-nez v0, :cond_0

    .line 316
    const/4 v0, 0x0

    return v0

    .line 319
    :cond_0
    iget-object v0, p0, Lo/ejc;->d:Lo/eie;

    move-object v4, v0

    check-cast v4, Lo/eih;

    .line 321
    invoke-virtual {v4}, Lo/eih;->al()Z

    move-result v0

    if-nez v0, :cond_1

    .line 322
    const/4 v0, 0x0

    return v0

    .line 325
    :cond_1
    if-eqz p3, :cond_3

    .line 326
    invoke-virtual {v4}, Lo/eih;->aj()Z

    move-result v0

    if-nez v0, :cond_2

    .line 327
    const/4 v0, 0x0

    return v0

    .line 329
    :cond_2
    iget-object v0, p0, Lo/ejc;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 330
    new-instance v0, Lo/ejc$3;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0, p0, v4}, Lo/ejc$3;-><init>(Lo/ejc;Lo/eih;)V

    new-instance v1, Lo/ejc$4;

    invoke-direct {v1, p0}, Lo/ejc$4;-><init>(Lo/ejc;)V

    new-instance v2, Lo/ejc$5;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v2, p0, v4, p2}, Lo/ejc$5;-><init>(Lo/ejc;Lo/eih;F)V

    invoke-virtual {v4, v0, v1, v2}, Lo/eih;->e(Lo/eih$k;Lo/eih$a;Lo/eih$d;)V

    goto :goto_0

    .line 352
    :cond_3
    invoke-virtual {v4}, Lo/eih;->ad()Z

    move-result v0

    if-nez v0, :cond_4

    .line 353
    const/4 v0, 0x0

    return v0

    .line 355
    :cond_4
    iget-object v0, p0, Lo/ejc;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 356
    new-instance v0, Lo/ejc$8;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0, p0, v4}, Lo/ejc$8;-><init>(Lo/ejc;Lo/eih;)V

    new-instance v1, Lo/ejc$6;

    invoke-direct {v1, p0}, Lo/ejc$6;-><init>(Lo/ejc;)V

    new-instance v2, Lo/ejc$9;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v2, p0, v4, p2}, Lo/ejc$9;-><init>(Lo/ejc;Lo/eih;F)V

    invoke-virtual {v4, v0, v1, v2}, Lo/eih;->a(Lo/eih$k;Lo/eih$a;Lo/eih$d;)V

    .line 378
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic e(Lo/ejc;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/ejc;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method private e(Landroid/view/MotionEvent;)V
    .locals 0

    .line 251
    invoke-direct {p0, p1}, Lo/ejc;->f(Landroid/view/MotionEvent;)V

    .line 252
    return-void
.end method

.method private f(Landroid/view/MotionEvent;)V
    .locals 2

    .line 422
    iget-object v0, p0, Lo/ejc;->h:Landroid/graphics/Matrix;

    iget-object v1, p0, Lo/ejc;->k:Lo/oa;

    invoke-virtual {v1}, Lo/oa;->p()Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 424
    iget-object v0, p0, Lo/ejc;->a:Lo/nz;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iput v1, v0, Lo/nz;->e:F

    .line 425
    iget-object v0, p0, Lo/ejc;->a:Lo/nz;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iput v1, v0, Lo/nz;->c:F

    .line 426
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lo/ejc;->l:J

    .line 427
    return-void
.end method

.method private h(Landroid/view/MotionEvent;)V
    .locals 7

    .line 383
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget-object v1, p0, Lo/ejc;->a:Lo/nz;

    iget v1, v1, Lo/nz;->e:F

    sub-float v4, v0, v1

    .line 384
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v5

    .line 385
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget-object v1, p0, Lo/ejc;->a:Lo/nz;

    iget v1, v1, Lo/nz;->c:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v6

    .line 388
    iget-object v0, p0, Lo/ejc;->d:Lo/eie;

    invoke-virtual {v0}, Lo/eie;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    cmpl-float v0, v5, v6

    if-ltz v0, :cond_1

    .line 389
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ejc;->t:Z

    .line 390
    sget v0, Lo/eji;->c:I

    int-to-float v0, v0

    cmpl-float v0, v5, v0

    if-gtz v0, :cond_0

    sget v0, Lo/eji;->c:I

    int-to-float v0, v0

    cmpl-float v0, v6, v0

    if-lez v0, :cond_1

    .line 391
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ejc;->s:Z

    .line 396
    :cond_1
    iget-boolean v0, p0, Lo/ejc;->t:Z

    if-nez v0, :cond_2

    .line 397
    return-void

    .line 404
    :cond_2
    const/4 v0, 0x0

    cmpl-float v0, v4, v0

    if-ltz v0, :cond_3

    .line 406
    const/4 v0, 0x0

    invoke-direct {p0, v5, v0}, Lo/ejc;->a(FF)V

    goto :goto_0

    .line 409
    :cond_3
    neg-float v0, v5

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/ejc;->a(FF)V

    .line 413
    :goto_0
    iget-object v0, p0, Lo/ejc;->d:Lo/eie;

    invoke-virtual {v0}, Lo/eie;->getViewPortHandler()Lo/oa;

    move-result-object v0

    check-cast v0, Lo/eip;

    iget-object v1, p0, Lo/ejc;->f:Landroid/graphics/Matrix;

    iget-object v2, p0, Lo/ejc;->d:Lo/eie;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/eip;->d(Landroid/graphics/Matrix;Landroid/view/View;Z)Landroid/graphics/Matrix;

    move-result-object v0

    iput-object v0, p0, Lo/ejc;->f:Landroid/graphics/Matrix;

    .line 416
    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    .line 113
    iget-object v0, p0, Lo/ejc;->o:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    .line 114
    iget-object v0, p0, Lo/ejc;->o:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    .line 115
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ejc;->o:Landroid/view/VelocityTracker;

    .line 117
    :cond_0
    return-void
.end method

.method public b(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 90
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    if-nez v0, :cond_0

    .line 91
    const/4 v0, 0x1

    return v0

    .line 93
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public d(Landroid/view/MotionEvent;)V
    .locals 4

    .line 123
    iget-object v0, p0, Lo/ejc;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 124
    return-void

    .line 127
    :cond_0
    iget-object v0, p0, Lo/ejc;->o:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 129
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 131
    :pswitch_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ejc;->b:Z

    .line 132
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ejc;->t:Z

    .line 133
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ejc;->s:Z

    .line 135
    iget-object v0, p0, Lo/ejc;->i:Lo/ejd;

    invoke-virtual {v0, p1}, Lo/ejd;->e(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 136
    invoke-direct {p0, p1}, Lo/ejc;->e(Landroid/view/MotionEvent;)V

    goto :goto_1

    .line 142
    :pswitch_1
    const-string v0, "cming"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "perform Move :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    iget-object v3, p0, Lo/ejc;->a:Lo/nz;

    invoke-virtual {v3}, Lo/nz;->d()F

    move-result v3

    sub-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 144
    iget-object v0, p0, Lo/ejc;->i:Lo/ejd;

    invoke-virtual {v0, p1}, Lo/ejd;->d(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 145
    invoke-direct {p0, p1}, Lo/ejc;->c(Landroid/view/MotionEvent;)V

    .line 148
    :cond_1
    iget-boolean v0, p0, Lo/ejc;->b:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lo/ejc;->s:Z

    if-eqz v0, :cond_3

    .line 149
    :cond_2
    iget-object v0, p0, Lo/ejc;->i:Lo/ejd;

    invoke-virtual {v0}, Lo/ejd;->d()V

    goto :goto_1

    .line 156
    :pswitch_2
    iget-object v0, p0, Lo/ejc;->i:Lo/ejd;

    invoke-virtual {v0, p1}, Lo/ejd;->a(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 158
    invoke-direct {p0, p1}, Lo/ejc;->a(Landroid/view/MotionEvent;)V

    goto :goto_1

    .line 164
    :goto_0
    invoke-direct {p0}, Lo/ejc;->c()V

    .line 167
    :cond_3
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public d()Z
    .locals 1

    .line 98
    iget-boolean v0, p0, Lo/ejc;->c:Z

    return v0
.end method

.method public e()V
    .locals 1

    .line 103
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ejc;->c:Z

    .line 104
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ejc;->b:Z

    .line 105
    iget-object v0, p0, Lo/ejc;->o:Landroid/view/VelocityTracker;

    if-nez v0, :cond_0

    .line 106
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lo/ejc;->o:Landroid/view/VelocityTracker;

    .line 108
    :cond_0
    return-void
.end method
