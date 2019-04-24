.class public Lo/exr;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Ljava/lang/Object;

.field c:Lo/exn$d;

.field private d:Lo/exo;

.field private e:Landroid/content/Context;

.field private f:Lo/exm;

.field private g:Lo/egg;

.field private h:Lo/exm;

.field private i:Lo/exm;

.field private k:Lo/exm;

.field private m:Lo/egg;

.field private n:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lo/exr;->d:Lo/exo;

    .line 35
    const/4 v0, 0x0

    iput v0, p0, Lo/exr;->a:I

    .line 36
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/exr;->b:Ljava/lang/Object;

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lo/exr;->f:Lo/exm;

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lo/exr;->i:Lo/exm;

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lo/exr;->h:Lo/exm;

    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lo/exr;->k:Lo/exm;

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lo/exr;->g:Lo/egg;

    .line 48
    const/4 v0, 0x0

    iput v0, p0, Lo/exr;->n:I

    .line 160
    new-instance v0, Lo/exr$3;

    invoke-direct {v0, p0}, Lo/exr$3;-><init>(Lo/exr;)V

    iput-object v0, p0, Lo/exr;->m:Lo/egg;

    .line 51
    iput-object p1, p0, Lo/exr;->e:Landroid/content/Context;

    .line 53
    iget-object v0, p0, Lo/exr;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/exo;->d(Landroid/content/Context;)Lo/exo;

    move-result-object v0

    iput-object v0, p0, Lo/exr;->d:Lo/exo;

    .line 55
    new-instance v0, Lo/exm;

    invoke-direct {v0}, Lo/exm;-><init>()V

    iput-object v0, p0, Lo/exr;->f:Lo/exm;

    .line 56
    new-instance v0, Lo/exm;

    invoke-direct {v0}, Lo/exm;-><init>()V

    iput-object v0, p0, Lo/exr;->i:Lo/exm;

    .line 57
    new-instance v0, Lo/exm;

    invoke-direct {v0}, Lo/exm;-><init>()V

    iput-object v0, p0, Lo/exr;->h:Lo/exm;

    .line 58
    new-instance v0, Lo/exm;

    invoke-direct {v0}, Lo/exm;-><init>()V

    iput-object v0, p0, Lo/exr;->k:Lo/exm;

    .line 60
    return-void
.end method

.method private a()I
    .locals 3

    .line 69
    iget-object v1, p0, Lo/exr;->b:Ljava/lang/Object;

    monitor-enter v1

    .line 70
    :try_start_0
    iget v0, p0, Lo/exr;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return v0

    .line 71
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method static synthetic a(Lo/exr;I)I
    .locals 0

    .line 22
    iput p1, p0, Lo/exr;->n:I

    return p1
.end method

.method static synthetic a(Lo/exr;)Lo/egg;
    .locals 1

    .line 22
    iget-object v0, p0, Lo/exr;->g:Lo/egg;

    return-object v0
.end method

.method static synthetic b(Lo/exr;Ljava/util/List;I)I
    .locals 1

    .line 22
    invoke-direct {p0, p1, p2}, Lo/exr;->d(Ljava/util/List;I)I

    move-result v0

    return v0
.end method

.method private b()V
    .locals 4

    .line 63
    iget-object v2, p0, Lo/exr;->b:Ljava/lang/Object;

    monitor-enter v2

    .line 64
    :try_start_0
    iget v0, p0, Lo/exr;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/exr;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 66
    :goto_0
    return-void
.end method

.method private b(Lo/exn$d;Lo/exn$d;J)V
    .locals 4

    .line 190
    sget-object v0, Lo/exn$d;->a:Lo/exn$d;

    if-ne v0, p1, :cond_0

    .line 191
    iget-object v0, p0, Lo/exr;->d:Lo/exo;

    new-instance v1, Lo/exr$2;

    invoke-direct {v1, p0}, Lo/exr$2;-><init>(Lo/exr;)V

    invoke-virtual {v0, p3, p4, p1, v1}, Lo/exo;->c(JLo/exn$d;Lo/egg;)V

    .line 213
    new-instance v0, Lo/exr$1;

    invoke-direct {v0, p0}, Lo/exr$1;-><init>(Lo/exr;)V

    invoke-direct {p0, p3, p4, p2, v0}, Lo/exr;->c(JLo/exn$d;Lo/egg;)V

    goto :goto_0

    .line 229
    :cond_0
    new-instance v0, Lo/exr$5;

    invoke-direct {v0, p0}, Lo/exr$5;-><init>(Lo/exr;)V

    invoke-direct {p0, p3, p4, p1, v0}, Lo/exr;->c(JLo/exn$d;Lo/egg;)V

    .line 245
    :goto_0
    const-string v0, "HeartRateDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave requestHeartRateDetailUIData !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    return-void
.end method

.method static synthetic b(Lo/exr;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Lo/exr;->b()V

    return-void
.end method

.method static synthetic c(Lo/exr;)Lo/exm;
    .locals 1

    .line 22
    iget-object v0, p0, Lo/exr;->f:Lo/exm;

    return-object v0
.end method

.method private c()V
    .locals 3

    .line 75
    iget-object v1, p0, Lo/exr;->b:Ljava/lang/Object;

    monitor-enter v1

    .line 76
    const/4 v0, 0x0

    :try_start_0
    iput v0, p0, Lo/exr;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 78
    :goto_0
    return-void
.end method

.method private c(JLo/exn$d;Lo/egg;)V
    .locals 4

    .line 250
    const-string v0, "HeartRateDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter requestHeartRateDetailData !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 251
    iget-object v0, p0, Lo/exr;->d:Lo/exo;

    new-instance v1, Lo/exr$4;

    invoke-direct {v1, p0, p3, p4}, Lo/exr$4;-><init>(Lo/exr;Lo/exn$d;Lo/egg;)V

    invoke-virtual {v0, p1, p2, p3, v1}, Lo/exo;->e(JLo/exn$d;Lo/egg;)V

    .line 334
    const-string v0, "HeartRateDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave requestHeartRateDetailData !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 335
    return-void
.end method

.method private d(Ljava/util/List;I)I
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/eux;>;I)I"
        }
    .end annotation

    .line 338
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    .line 339
    const/4 v2, 0x0

    .line 340
    const/16 v3, 0x7d0

    .line 341
    const/4 v4, 0x0

    .line 342
    const/4 v5, 0x0

    .line 343
    const/4 v6, 0x0

    .line 344
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v1, :cond_3

    .line 345
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/eux;

    .line 346
    invoke-virtual {v8}, Lo/eux;->c()I

    move-result v0

    if-le v0, v2, :cond_0

    .line 347
    invoke-virtual {v8}, Lo/eux;->c()I

    move-result v2

    .line 350
    :cond_0
    invoke-virtual {v8}, Lo/eux;->a()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {v8}, Lo/eux;->a()I

    move-result v0

    if-ge v0, v3, :cond_1

    .line 351
    invoke-virtual {v8}, Lo/eux;->a()I

    move-result v3

    .line 354
    :cond_1
    invoke-virtual {v8}, Lo/eux;->i()I

    move-result v0

    if-lez v0, :cond_2

    .line 355
    invoke-virtual {v8}, Lo/eux;->i()I

    move-result v0

    add-int/2addr v4, v0

    .line 356
    add-int/lit8 v5, v5, 0x1

    .line 344
    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 360
    :cond_3
    const/16 v0, 0x7d0

    if-ne v0, v3, :cond_4

    .line 361
    const/4 v3, 0x0

    .line 364
    :cond_4
    if-lez v5, :cond_5

    .line 365
    div-int v6, v4, v5

    .line 367
    :cond_5
    packed-switch p2, :pswitch_data_0

    goto :goto_1

    .line 369
    :pswitch_0
    return v2

    .line 371
    :pswitch_1
    return v3

    .line 373
    :pswitch_2
    return v6

    .line 375
    :goto_1
    const/4 v0, 0x0

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic d(Lo/exr;)I
    .locals 1

    .line 22
    iget v0, p0, Lo/exr;->n:I

    return v0
.end method

.method static synthetic e(Lo/exr;)I
    .locals 1

    .line 22
    invoke-direct {p0}, Lo/exr;->a()I

    move-result v0

    return v0
.end method

.method static synthetic f(Lo/exr;)Lo/exm;
    .locals 1

    .line 22
    iget-object v0, p0, Lo/exr;->i:Lo/exm;

    return-object v0
.end method

.method static synthetic h(Lo/exr;)Lo/exm;
    .locals 1

    .line 22
    iget-object v0, p0, Lo/exr;->k:Lo/exm;

    return-object v0
.end method

.method static synthetic i(Lo/exr;)Lo/exm;
    .locals 1

    .line 22
    iget-object v0, p0, Lo/exr;->h:Lo/exm;

    return-object v0
.end method


# virtual methods
.method public a(I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Lo/eux;>;"
        }
    .end annotation

    .line 380
    const/4 v2, 0x0

    .line 381
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 383
    :pswitch_0
    iget-object v0, p0, Lo/exr;->f:Lo/exm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 384
    iget-object v0, p0, Lo/exr;->f:Lo/exm;

    invoke-virtual {v0}, Lo/exm;->e()Ljava/util/List;

    move-result-object v2

    goto :goto_0

    .line 388
    :pswitch_1
    iget-object v0, p0, Lo/exr;->i:Lo/exm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 389
    iget-object v0, p0, Lo/exr;->i:Lo/exm;

    invoke-virtual {v0}, Lo/exm;->e()Ljava/util/List;

    move-result-object v2

    goto :goto_0

    .line 393
    :pswitch_2
    iget-object v0, p0, Lo/exr;->h:Lo/exm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 394
    iget-object v0, p0, Lo/exr;->h:Lo/exm;

    invoke-virtual {v0}, Lo/exm;->e()Ljava/util/List;

    move-result-object v2

    goto :goto_0

    .line 398
    :pswitch_3
    iget-object v0, p0, Lo/exr;->k:Lo/exm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 399
    iget-object v0, p0, Lo/exr;->k:Lo/exm;

    invoke-virtual {v0}, Lo/exm;->e()Ljava/util/List;

    move-result-object v2

    .line 406
    :cond_0
    :goto_0
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public b(I)I
    .locals 3

    .line 440
    const/4 v2, 0x0

    .line 441
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 443
    :pswitch_0
    iget-object v0, p0, Lo/exr;->f:Lo/exm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 444
    iget-object v0, p0, Lo/exr;->f:Lo/exm;

    invoke-virtual {v0}, Lo/exm;->d()I

    move-result v2

    goto :goto_0

    .line 448
    :pswitch_1
    iget-object v0, p0, Lo/exr;->i:Lo/exm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 449
    iget-object v0, p0, Lo/exr;->i:Lo/exm;

    invoke-virtual {v0}, Lo/exm;->d()I

    move-result v2

    goto :goto_0

    .line 453
    :pswitch_2
    iget-object v0, p0, Lo/exr;->h:Lo/exm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 454
    iget-object v0, p0, Lo/exr;->h:Lo/exm;

    invoke-virtual {v0}, Lo/exm;->d()I

    move-result v2

    goto :goto_0

    .line 458
    :pswitch_3
    iget-object v0, p0, Lo/exr;->k:Lo/exm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 459
    iget-object v0, p0, Lo/exr;->k:Lo/exm;

    invoke-virtual {v0}, Lo/exm;->d()I

    move-result v2

    .line 466
    :cond_0
    :goto_0
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public c(I)I
    .locals 3

    .line 410
    const/4 v2, 0x0

    .line 411
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 413
    :pswitch_0
    iget-object v0, p0, Lo/exr;->f:Lo/exm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 414
    iget-object v0, p0, Lo/exr;->f:Lo/exm;

    invoke-virtual {v0}, Lo/exm;->c()I

    move-result v2

    goto :goto_0

    .line 418
    :pswitch_1
    iget-object v0, p0, Lo/exr;->i:Lo/exm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 419
    iget-object v0, p0, Lo/exr;->i:Lo/exm;

    invoke-virtual {v0}, Lo/exm;->c()I

    move-result v2

    goto :goto_0

    .line 423
    :pswitch_2
    iget-object v0, p0, Lo/exr;->h:Lo/exm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 424
    iget-object v0, p0, Lo/exr;->h:Lo/exm;

    invoke-virtual {v0}, Lo/exm;->c()I

    move-result v2

    goto :goto_0

    .line 428
    :pswitch_3
    iget-object v0, p0, Lo/exr;->k:Lo/exm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 429
    iget-object v0, p0, Lo/exr;->k:Lo/exm;

    invoke-virtual {v0}, Lo/exm;->c()I

    move-result v2

    .line 436
    :cond_0
    :goto_0
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public d(I)I
    .locals 1

    .line 499
    iget v0, p0, Lo/exr;->n:I

    .line 525
    return v0
.end method

.method public d()Lo/ext;
    .locals 3

    .line 534
    const/4 v2, 0x0

    .line 535
    iget-object v0, p0, Lo/exr;->d:Lo/exo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 536
    iget-object v0, p0, Lo/exr;->d:Lo/exo;

    invoke-virtual {v0}, Lo/exo;->h()Lo/ext;

    move-result-object v2

    .line 538
    :cond_0
    return-object v2
.end method

.method public d(JILo/egg;)V
    .locals 6

    .line 93
    const-string v0, "HeartRateDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter requestHeartRateDetailUIData !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    const-string v0, "HeartRateDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestHeartRateDetailUIData paraUIDataType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    invoke-direct {p0}, Lo/exr;->c()V

    .line 99
    sget-object v4, Lo/exn$d;->c:Lo/exn$d;

    .line 100
    sget-object v5, Lo/exn$d;->c:Lo/exn$d;

    .line 102
    packed-switch p3, :pswitch_data_0

    goto/16 :goto_0

    .line 104
    :pswitch_0
    sget-object v4, Lo/exn$d;->a:Lo/exn$d;

    .line 105
    sget-object v5, Lo/exn$d;->n:Lo/exn$d;

    .line 107
    iget-object v0, p0, Lo/exr;->f:Lo/exm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 108
    iget-object v0, p0, Lo/exr;->f:Lo/exm;

    invoke-virtual {v0}, Lo/exm;->a()V

    .line 109
    iget-object v0, p0, Lo/exr;->f:Lo/exm;

    invoke-virtual {v0, p1, p2}, Lo/exm;->e(J)V

    .line 110
    iget-object v0, p0, Lo/exr;->f:Lo/exm;

    invoke-virtual {v0, p3}, Lo/exm;->e(I)V

    goto/16 :goto_1

    .line 118
    :pswitch_1
    sget-object v4, Lo/exn$d;->b:Lo/exn$d;

    .line 119
    sget-object v5, Lo/exn$d;->p:Lo/exn$d;

    .line 121
    iget-object v0, p0, Lo/exr;->h:Lo/exm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 122
    iget-object v0, p0, Lo/exr;->h:Lo/exm;

    invoke-virtual {v0}, Lo/exm;->a()V

    .line 123
    iget-object v0, p0, Lo/exr;->h:Lo/exm;

    invoke-virtual {v0, p1, p2}, Lo/exm;->e(J)V

    .line 124
    iget-object v0, p0, Lo/exr;->h:Lo/exm;

    invoke-virtual {v0, p3}, Lo/exm;->e(I)V

    goto :goto_1

    .line 128
    :pswitch_2
    sget-object v4, Lo/exn$d;->e:Lo/exn$d;

    .line 129
    sget-object v5, Lo/exn$d;->m:Lo/exn$d;

    .line 131
    iget-object v0, p0, Lo/exr;->i:Lo/exm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 132
    iget-object v0, p0, Lo/exr;->i:Lo/exm;

    invoke-virtual {v0}, Lo/exm;->a()V

    .line 133
    iget-object v0, p0, Lo/exr;->i:Lo/exm;

    invoke-virtual {v0, p1, p2}, Lo/exm;->e(J)V

    .line 134
    iget-object v0, p0, Lo/exr;->i:Lo/exm;

    invoke-virtual {v0, p3}, Lo/exm;->e(I)V

    goto :goto_1

    .line 138
    :pswitch_3
    sget-object v4, Lo/exn$d;->d:Lo/exn$d;

    .line 139
    sget-object v5, Lo/exn$d;->o:Lo/exn$d;

    .line 141
    iget-object v0, p0, Lo/exr;->k:Lo/exm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 142
    iget-object v0, p0, Lo/exr;->k:Lo/exm;

    invoke-virtual {v0}, Lo/exm;->a()V

    .line 143
    iget-object v0, p0, Lo/exr;->k:Lo/exm;

    invoke-virtual {v0, p1, p2}, Lo/exm;->e(J)V

    .line 144
    iget-object v0, p0, Lo/exr;->k:Lo/exm;

    invoke-virtual {v0, p3}, Lo/exm;->e(I)V

    goto :goto_1

    .line 148
    :goto_0
    sget-object v4, Lo/exn$d;->c:Lo/exn$d;

    .line 149
    sget-object v5, Lo/exn$d;->c:Lo/exn$d;

    .line 153
    :cond_0
    :goto_1
    iput-object v4, p0, Lo/exr;->c:Lo/exn$d;

    .line 154
    iput-object p4, p0, Lo/exr;->g:Lo/egg;

    .line 155
    iget-object v0, p0, Lo/exr;->d:Lo/exo;

    iget-object v1, p0, Lo/exr;->m:Lo/egg;

    invoke-virtual {v0, p1, p2, v4, v1}, Lo/exo;->d(JLo/exn$d;Lo/egg;)V

    .line 156
    invoke-direct {p0, v4, v5, p1, p2}, Lo/exr;->b(Lo/exn$d;Lo/exn$d;J)V

    .line 157
    const-string v0, "HeartRateDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave requestHeartRateDetailUIData !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_3
    .end packed-switch
.end method

.method public e(I)I
    .locals 3

    .line 470
    const/4 v2, 0x0

    .line 471
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 473
    :pswitch_0
    iget-object v0, p0, Lo/exr;->f:Lo/exm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 474
    iget-object v0, p0, Lo/exr;->f:Lo/exm;

    invoke-virtual {v0}, Lo/exm;->b()I

    move-result v2

    goto :goto_0

    .line 478
    :pswitch_1
    iget-object v0, p0, Lo/exr;->i:Lo/exm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 479
    iget-object v0, p0, Lo/exr;->i:Lo/exm;

    invoke-virtual {v0}, Lo/exm;->b()I

    move-result v2

    goto :goto_0

    .line 483
    :pswitch_2
    iget-object v0, p0, Lo/exr;->h:Lo/exm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 484
    iget-object v0, p0, Lo/exr;->h:Lo/exm;

    invoke-virtual {v0}, Lo/exm;->b()I

    move-result v2

    goto :goto_0

    .line 488
    :pswitch_3
    iget-object v0, p0, Lo/exr;->k:Lo/exm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 489
    iget-object v0, p0, Lo/exr;->k:Lo/exm;

    invoke-virtual {v0}, Lo/exm;->b()I

    move-result v2

    .line 496
    :cond_0
    :goto_0
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
