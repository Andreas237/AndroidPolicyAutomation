.class public Lo/exl;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lo/exo;

.field private b:I

.field private c:Z

.field private d:Landroid/content/Context;

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private k:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lo/exl;->a:Lo/exo;

    .line 29
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/exl;->c:Z

    .line 33
    const/4 v0, 0x0

    iput v0, p0, Lo/exl;->b:I

    .line 35
    const/4 v0, 0x0

    iput v0, p0, Lo/exl;->e:I

    .line 36
    const/4 v0, 0x0

    iput v0, p0, Lo/exl;->g:I

    .line 37
    const/4 v0, 0x0

    iput v0, p0, Lo/exl;->f:I

    .line 38
    const/4 v0, 0x0

    iput v0, p0, Lo/exl;->h:I

    .line 39
    const/4 v0, 0x0

    iput v0, p0, Lo/exl;->i:I

    .line 40
    const/4 v0, 0x0

    iput v0, p0, Lo/exl;->k:I

    .line 43
    iput-object p1, p0, Lo/exl;->d:Landroid/content/Context;

    .line 44
    iget-object v0, p0, Lo/exl;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/exo;->d(Landroid/content/Context;)Lo/exo;

    move-result-object v0

    iput-object v0, p0, Lo/exl;->a:Lo/exo;

    .line 48
    invoke-direct {p0}, Lo/exl;->i()V

    .line 49
    return-void
.end method

.method static synthetic a(Lo/exl;)I
    .locals 1

    .line 23
    iget v0, p0, Lo/exl;->e:I

    return v0
.end method

.method static synthetic a(Lo/exl;I)I
    .locals 0

    .line 23
    iput p1, p0, Lo/exl;->g:I

    return p1
.end method

.method static synthetic b(Lo/exl;)I
    .locals 1

    .line 23
    iget v0, p0, Lo/exl;->i:I

    return v0
.end method

.method static synthetic b(Lo/exl;I)I
    .locals 0

    .line 23
    iput p1, p0, Lo/exl;->i:I

    return p1
.end method

.method private b(JLo/egg;)V
    .locals 3

    .line 256
    iget-object v0, p0, Lo/exl;->a:Lo/exo;

    sget-object v1, Lo/exn$d;->n:Lo/exn$d;

    new-instance v2, Lo/exl$4;

    invoke-direct {v2, p0, p3}, Lo/exl$4;-><init>(Lo/exl;Lo/egg;)V

    invoke-virtual {v0, p1, p2, v1, v2}, Lo/exo;->d(JLo/exn$d;Lo/egg;)V

    .line 283
    return-void
.end method

.method static synthetic c(Lo/exl;)I
    .locals 1

    .line 23
    iget v0, p0, Lo/exl;->b:I

    return v0
.end method

.method static synthetic c(Lo/exl;I)I
    .locals 0

    .line 23
    iput p1, p0, Lo/exl;->h:I

    return p1
.end method

.method static synthetic d(Lo/exl;)I
    .locals 2

    .line 23
    iget v0, p0, Lo/exl;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/exl;->b:I

    return v0
.end method

.method static synthetic d(Lo/exl;I)I
    .locals 0

    .line 23
    iput p1, p0, Lo/exl;->e:I

    return p1
.end method

.method static synthetic e(Lo/exl;)I
    .locals 1

    .line 23
    iget v0, p0, Lo/exl;->g:I

    return v0
.end method

.method static synthetic e(Lo/exl;I)I
    .locals 0

    .line 23
    iput p1, p0, Lo/exl;->f:I

    return p1
.end method

.method static synthetic g(Lo/exl;I)I
    .locals 0

    .line 23
    iput p1, p0, Lo/exl;->k:I

    return p1
.end method

.method static synthetic h(Lo/exl;)I
    .locals 1

    .line 23
    iget v0, p0, Lo/exl;->k:I

    return v0
.end method

.method private i()V
    .locals 1

    .line 410
    const/4 v0, 0x0

    iput v0, p0, Lo/exl;->e:I

    .line 411
    const/4 v0, 0x0

    iput v0, p0, Lo/exl;->g:I

    .line 412
    const/4 v0, 0x0

    iput v0, p0, Lo/exl;->f:I

    .line 413
    const/4 v0, 0x0

    iput v0, p0, Lo/exl;->h:I

    .line 414
    const/4 v0, 0x0

    iput v0, p0, Lo/exl;->i:I

    .line 415
    const/4 v0, 0x0

    iput v0, p0, Lo/exl;->k:I

    .line 437
    return-void
.end method

.method static synthetic k(Lo/exl;)I
    .locals 1

    .line 23
    iget v0, p0, Lo/exl;->f:I

    return v0
.end method


# virtual methods
.method public a()I
    .locals 2

    .line 440
    iget-object v0, p0, Lo/exl;->a:Lo/exo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-boolean v0, p0, Lo/exl;->c:Z

    if-eqz v0, :cond_0

    .line 441
    iget-object v0, p0, Lo/exl;->a:Lo/exo;

    invoke-virtual {v0}, Lo/exo;->d()I

    move-result v0

    iput v0, p0, Lo/exl;->e:I

    .line 448
    :cond_0
    iget v0, p0, Lo/exl;->e:I

    return v0
.end method

.method public a(JLo/egg;)V
    .locals 6

    .line 305
    const-string v0, "FitnessDataListInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestSpecificOneDayFitnessTotalData !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 306
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/exl;->c:Z

    .line 308
    iget-object v0, p0, Lo/exl;->a:Lo/exo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 309
    iget-object v0, p0, Lo/exl;->a:Lo/exo;

    move-wide v1, p1

    sget-object v4, Lo/exn$d;->n:Lo/exn$d;

    new-instance v5, Lo/exl$3;

    invoke-direct {v5, p0, p3}, Lo/exl$3;-><init>(Lo/exl;Lo/egg;)V

    const/16 v3, 0xdd

    invoke-virtual/range {v0 .. v5}, Lo/exo;->b(JILo/exn$d;Lo/egg;)V

    .line 329
    :cond_0
    return-void
.end method

.method public b()I
    .locals 1

    .line 501
    iget v0, p0, Lo/exl;->i:I

    return v0
.end method

.method public b(Lo/egg;)V
    .locals 5

    .line 119
    invoke-direct {p0}, Lo/exl;->i()V

    .line 120
    const/4 v0, 0x0

    iput v0, p0, Lo/exl;->b:I

    .line 121
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/exl;->c:Z

    .line 123
    invoke-static {}, Lo/dbu;->c()Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v3

    .line 125
    iget-object v0, p0, Lo/exl;->a:Lo/exo;

    sget-object v1, Lo/exn$d;->a:Lo/exn$d;

    new-instance v2, Lo/exl$2;

    invoke-direct {v2, p0, p1}, Lo/exl$2;-><init>(Lo/exl;Lo/egg;)V

    invoke-virtual {v0, v3, v4, v1, v2}, Lo/exo;->d(JLo/exn$d;Lo/egg;)V

    .line 153
    new-instance v0, Lo/exl$7;

    invoke-direct {v0, p0, p1}, Lo/exl$7;-><init>(Lo/exl;Lo/egg;)V

    invoke-virtual {p0, v0}, Lo/exl;->c(Lo/egg;)V

    .line 163
    new-instance v0, Lo/exl$6;

    invoke-direct {v0, p0, p1}, Lo/exl$6;-><init>(Lo/exl;Lo/egg;)V

    invoke-virtual {p0, v0}, Lo/exl;->e(Lo/egg;)V

    .line 172
    return-void
.end method

.method public c()I
    .locals 2

    .line 466
    iget-object v0, p0, Lo/exl;->a:Lo/exo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-boolean v0, p0, Lo/exl;->c:Z

    if-eqz v0, :cond_0

    .line 467
    iget-object v0, p0, Lo/exl;->a:Lo/exo;

    invoke-virtual {v0}, Lo/exo;->e()I

    move-result v0

    iput v0, p0, Lo/exl;->f:I

    .line 474
    :cond_0
    iget v0, p0, Lo/exl;->f:I

    return v0
.end method

.method public c(JLo/egg;)V
    .locals 4

    .line 220
    const-string v0, "FitnessDataListInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter requestSpecificOneDayCoreSleepFitnessDataList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    invoke-direct {p0}, Lo/exl;->i()V

    .line 222
    const/4 v0, 0x0

    iput v0, p0, Lo/exl;->b:I

    .line 223
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/exl;->c:Z

    .line 225
    iget-object v0, p0, Lo/exl;->a:Lo/exo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 226
    invoke-direct {p0, p1, p2, p3}, Lo/exl;->b(JLo/egg;)V

    .line 229
    :cond_0
    new-instance v0, Lo/exl$8;

    invoke-direct {v0, p0, p3}, Lo/exl$8;-><init>(Lo/exl;Lo/egg;)V

    invoke-virtual {p0, p1, p2, v0}, Lo/exl;->a(JLo/egg;)V

    .line 240
    new-instance v0, Lo/exl$5;

    invoke-direct {v0, p0, p3}, Lo/exl$5;-><init>(Lo/exl;Lo/egg;)V

    invoke-virtual {p0, p1, p2, v0}, Lo/exl;->e(JLo/egg;)V

    .line 251
    const-string v0, "FitnessDataListInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave requestSpecificOneDayFitnessDataList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 252
    return-void
.end method

.method public c(Lo/egg;)V
    .locals 2

    .line 292
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/exl;->c:Z

    .line 294
    iget-object v0, p0, Lo/exl;->a:Lo/exo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 295
    iget-object v0, p0, Lo/exl;->a:Lo/exo;

    invoke-virtual {v0, p1}, Lo/exo;->e(Lo/egg;)V

    .line 297
    :cond_0
    return-void
.end method

.method public d()I
    .locals 2

    .line 479
    iget-object v0, p0, Lo/exl;->a:Lo/exo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-boolean v0, p0, Lo/exl;->c:Z

    if-eqz v0, :cond_0

    .line 480
    iget-object v0, p0, Lo/exl;->a:Lo/exo;

    invoke-virtual {v0}, Lo/exo;->c()I

    move-result v0

    iput v0, p0, Lo/exl;->h:I

    .line 487
    :cond_0
    iget v0, p0, Lo/exl;->h:I

    return v0
.end method

.method public e()I
    .locals 2

    .line 453
    iget-object v0, p0, Lo/exl;->a:Lo/exo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-boolean v0, p0, Lo/exl;->c:Z

    if-eqz v0, :cond_0

    .line 454
    iget-object v0, p0, Lo/exl;->a:Lo/exo;

    invoke-virtual {v0}, Lo/exo;->b()I

    move-result v0

    iput v0, p0, Lo/exl;->g:I

    .line 461
    :cond_0
    iget v0, p0, Lo/exl;->g:I

    return v0
.end method

.method public e(JLo/egg;)V
    .locals 9

    .line 387
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/exl;->c:Z

    .line 388
    new-instance v6, Ljava/util/Date;

    const-wide/16 v0, 0x3e8

    mul-long/2addr v0, p1

    invoke-direct {v6, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 389
    const-string v0, "FitnessDataListInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestSpecificOneDaySleepTotalData  startDate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 390
    invoke-static {v6}, Lo/dbu;->d(Ljava/util/Date;)J

    move-result-wide v7

    .line 391
    iget-object v0, p0, Lo/exl;->a:Lo/exo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 392
    iget-object v0, p0, Lo/exl;->a:Lo/exo;

    move-wide v1, v7

    sget-object v3, Lo/exn$d;->v:Lo/exn$d;

    sget-object v4, Lo/exn$a;->b:Lo/exn$a;

    new-instance v5, Lo/exl$1;

    invoke-direct {v5, p0, p3}, Lo/exl$1;-><init>(Lo/exl;Lo/egg;)V

    invoke-virtual/range {v0 .. v5}, Lo/exo;->e(JLo/exn$d;Lo/exn$a;Lo/egg;)V

    .line 407
    :cond_0
    return-void
.end method

.method public e(Lo/egg;)V
    .locals 2

    .line 348
    iget-object v0, p0, Lo/exl;->a:Lo/exo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 349
    iget-object v0, p0, Lo/exl;->a:Lo/exo;

    sget-object v1, Lo/exn$a;->b:Lo/exn$a;

    invoke-virtual {v0, v1, p1}, Lo/exo;->b(Lo/exn$a;Lo/egg;)V

    .line 351
    :cond_0
    return-void
.end method

.method public f()I
    .locals 2

    .line 505
    iget-object v0, p0, Lo/exl;->a:Lo/exo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-boolean v0, p0, Lo/exl;->c:Z

    if-eqz v0, :cond_0

    .line 506
    iget-object v0, p0, Lo/exl;->a:Lo/exo;

    invoke-virtual {v0}, Lo/exo;->a()I

    move-result v0

    iput v0, p0, Lo/exl;->k:I

    .line 513
    :cond_0
    iget v0, p0, Lo/exl;->k:I

    return v0
.end method
