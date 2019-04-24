.class public Lo/bxb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bru;


# static fields
.field private static volatile d:Lo/bxb;


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:J

.field private e:F

.field private f:I

.field private g:Lcom/huawei/health/suggestion/model/RunWorkout;

.field private h:Lo/brv;

.field private i:I

.field private k:I

.field private l:F

.field private m:F

.field private n:I

.field private o:I

.field private p:Lo/btz;

.field private r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Float;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 55
    const/4 v0, 0x0

    sput-object v0, Lo/bxb;->d:Lo/bxb;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    return-void
.end method

.method private a(I)V
    .locals 5

    .line 201
    const-string v0, "RunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "play stateSound-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    invoke-direct {p0}, Lo/bxb;->f()Lo/bzq;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v0, v2, v1}, Lo/bzq;->b(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 203
    iget-object v0, p0, Lo/bxb;->h:Lo/brv;

    if-eqz v0, :cond_0

    .line 204
    invoke-direct {p0, v4}, Lo/bxb;->c(Ljava/lang/Object;)V

    goto :goto_0

    .line 205
    :cond_0
    instance-of v0, v4, Ljava/lang/Integer;

    if-eqz v0, :cond_1

    .line 206
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/bud;->c(Landroid/content/Context;)Lo/bud;

    move-result-object v0

    move-object v1, v4

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/bud;->d(I)V

    .line 208
    :cond_1
    :goto_0
    return-void
.end method

.method private a(Landroid/os/Bundle;)V
    .locals 3

    .line 461
    const-string v0, "speed"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v2

    .line 464
    iget-object v0, p0, Lo/bxb;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_0

    .line 465
    iget-object v0, p0, Lo/bxb;->r:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 467
    :cond_0
    iget-object v0, p0, Lo/bxb;->r:Ljava/util/List;

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 468
    return-void
.end method

.method private a(Lcom/huawei/health/suggestion/model/RunWorkout;Ljava/lang/String;Lcom/huawei/health/suggestion/model/WorkoutRecord;)V
    .locals 2

    .line 169
    iput-object p2, p0, Lo/bxb;->b:Ljava/lang/String;

    .line 170
    iput-object p1, p0, Lo/bxb;->g:Lcom/huawei/health/suggestion/model/RunWorkout;

    .line 172
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/bxb;->c:J

    .line 173
    iget-object v0, p0, Lo/bxb;->g:Lcom/huawei/health/suggestion/model/RunWorkout;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireDistance()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iput v0, p0, Lo/bxb;->m:F

    .line 174
    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lo/bxb;->l:F

    .line 175
    const/4 v0, 0x0

    iput v0, p0, Lo/bxb;->i:I

    .line 176
    iget-object v0, p0, Lo/bxb;->p:Lo/btz;

    invoke-virtual {v0, p1}, Lo/btz;->a(Lcom/huawei/health/suggestion/model/RunWorkout;)V

    .line 177
    const/4 v0, 0x0

    iput v0, p0, Lo/bxb;->e:F

    .line 178
    const/4 v0, 0x0

    iput v0, p0, Lo/bxb;->a:I

    .line 179
    return-void
.end method

.method private a(Lcom/huawei/health/suggestion/model/SportInfo;)V
    .locals 3

    .line 241
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/SportInfo;->acquireDistance()F

    move-result v1

    .line 242
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/SportInfo;->acquireTime()I

    move-result v2

    .line 244
    const v0, 0x409fae14    # 4.99f

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_1

    .line 246
    iget v0, p0, Lo/bxb;->f:I

    if-lt v2, v0, :cond_0

    iget v0, p0, Lo/bxb;->f:I

    if-gtz v0, :cond_1

    .line 247
    :cond_0
    iput v2, p0, Lo/bxb;->f:I

    .line 251
    :cond_1
    const v0, 0x411fd70a    # 9.99f

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_3

    .line 253
    iget v0, p0, Lo/bxb;->k:I

    if-lt v2, v0, :cond_2

    iget v0, p0, Lo/bxb;->k:I

    if-gtz v0, :cond_3

    .line 254
    :cond_2
    iput v2, p0, Lo/bxb;->k:I

    .line 258
    :cond_3
    const v0, 0x41a8b22d    # 21.087f

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_5

    .line 260
    iget v0, p0, Lo/bxb;->o:I

    if-lt v2, v0, :cond_4

    iget v0, p0, Lo/bxb;->o:I

    if-gtz v0, :cond_5

    .line 261
    :cond_4
    iput v2, p0, Lo/bxb;->o:I

    .line 265
    :cond_5
    const v0, 0x4228bb65

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_7

    .line 267
    iget v0, p0, Lo/bxb;->n:I

    if-lt v2, v0, :cond_6

    iget v0, p0, Lo/bxb;->n:I

    if-gtz v0, :cond_7

    .line 268
    :cond_6
    iput v2, p0, Lo/bxb;->n:I

    .line 271
    :cond_7
    return-void
.end method

.method public static b()Lo/bxb;
    .locals 4

    .line 88
    sget-object v0, Lo/bxb;->d:Lo/bxb;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 89
    const-class v2, Lo/bxb;

    monitor-enter v2

    .line 90
    :try_start_0
    sget-object v0, Lo/bxb;->d:Lo/bxb;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 91
    new-instance v0, Lo/bxb;

    invoke-direct {v0}, Lo/bxb;-><init>()V

    sput-object v0, Lo/bxb;->d:Lo/bxb;

    .line 92
    sget-object v0, Lo/bxb;->d:Lo/bxb;

    invoke-direct {v0}, Lo/bxb;->k()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 96
    :cond_1
    :goto_0
    sget-object v0, Lo/bxb;->d:Lo/bxb;

    return-object v0
.end method

.method private b(ILcom/huawei/health/suggestion/model/SportInfo;)V
    .locals 5

    .line 212
    const-string v0, "RunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "play stateSound-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    invoke-direct {p0}, Lo/bxb;->f()Lo/bzq;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const/4 v2, 0x2

    invoke-interface {v0, v2, v1}, Lo/bzq;->b(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 214
    iget-object v0, p0, Lo/bxb;->h:Lo/brv;

    if-eqz v0, :cond_0

    .line 215
    invoke-direct {p0, v4}, Lo/bxb;->c(Ljava/lang/Object;)V

    goto :goto_0

    .line 216
    :cond_0
    instance-of v0, v4, Ljava/lang/Integer;

    if-eqz v0, :cond_1

    .line 217
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/bud;->c(Landroid/content/Context;)Lo/bud;

    move-result-object v0

    move-object v1, v4

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/bud;->d(I)V

    .line 219
    :cond_1
    :goto_0
    return-void
.end method

.method private b(Lcom/huawei/health/suggestion/model/SportInfo;)V
    .locals 9

    .line 379
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/SportInfo;->acquireTime()I

    move-result v0

    int-to-long v0, v0

    iget-wide v2, p0, Lo/bxb;->c:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x708

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 380
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/SportInfo;->acquireTime()I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lo/bxb;->c:J

    .line 381
    invoke-direct {p0}, Lo/bxb;->h()V

    .line 385
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/SportInfo;->acquireDistance()F

    move-result v4

    .line 386
    iget v0, p0, Lo/bxb;->m:F

    cmpl-float v0, v4, v0

    if-ltz v0, :cond_1

    iget v0, p0, Lo/bxb;->m:F

    const v1, 0x3dcccccd    # 0.1f

    add-float/2addr v0, v1

    cmpg-float v0, v4, v0

    if-gtz v0, :cond_1

    .line 387
    const/high16 v0, 0x41200000    # 10.0f

    mul-float/2addr v0, v4

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v5, v0

    .line 388
    rem-int/lit8 v6, v5, 0xa

    .line 389
    const/4 v0, 0x5

    if-ne v6, v0, :cond_1

    .line 391
    const-string v0, "RunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "play half"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 392
    const/4 v0, 0x0

    iput v0, p0, Lo/bxb;->m:F

    .line 397
    :cond_1
    invoke-direct {p0, p1}, Lo/bxb;->a(Lcom/huawei/health/suggestion/model/SportInfo;)V

    .line 400
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/SportInfo;->acquireTime()I

    move-result v5

    .line 401
    iget v0, p0, Lo/bxb;->l:F

    cmpl-float v0, v4, v0

    if-ltz v0, :cond_5

    .line 403
    const/high16 v0, 0x3f000000    # 0.5f

    div-float v0, v4, v0

    float-to-int v6, v0

    .line 404
    int-to-float v0, v6

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v0, v1

    sub-float v7, v4, v0

    .line 405
    const v0, 0x3ecccccd    # 0.4f

    cmpl-float v0, v7, v0

    if-lez v0, :cond_2

    .line 406
    add-int/lit8 v0, v6, 0x2

    int-to-float v0, v0

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v0, v1

    iput v0, p0, Lo/bxb;->l:F

    goto :goto_0

    .line 408
    :cond_2
    add-int/lit8 v0, v6, 0x1

    int-to-float v0, v0

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v0, v1

    iput v0, p0, Lo/bxb;->l:F

    .line 411
    :goto_0
    iget-object v0, p0, Lo/bxb;->h:Lo/brv;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lo/bxb;->h:Lo/brv;

    invoke-interface {v0}, Lo/brv;->b()Z

    move-result v0

    if-nez v0, :cond_5

    .line 413
    :cond_3
    iget v0, p0, Lo/bxb;->a:I

    sub-int v0, v5, v0

    int-to-float v0, v0

    iget v1, p0, Lo/bxb;->e:F

    sub-float v1, v4, v1

    div-float/2addr v0, v1

    float-to-int v8, v0

    .line 414
    invoke-virtual {p1, v8}, Lcom/huawei/health/suggestion/model/SportInfo;->savePace(I)V

    .line 415
    iget-object v0, p0, Lo/bxb;->p:Lo/btz;

    invoke-virtual {v0, p1}, Lo/btz;->b(Lcom/huawei/health/suggestion/model/SportInfo;)I

    .line 417
    rem-int/lit8 v0, v6, 0x2

    if-nez v0, :cond_4

    .line 418
    iget-object v0, p0, Lo/bxb;->p:Lo/btz;

    invoke-virtual {v0}, Lo/btz;->e()I

    move-result v0

    invoke-direct {p0, v0}, Lo/bxb;->a(I)V

    goto :goto_1

    .line 420
    :cond_4
    int-to-float v0, v6

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v0, v1

    invoke-virtual {p1, v0}, Lcom/huawei/health/suggestion/model/SportInfo;->saveDistance(F)V

    .line 421
    iget-object v0, p0, Lo/bxb;->p:Lo/btz;

    invoke-virtual {v0}, Lo/btz;->e()I

    move-result v0

    invoke-direct {p0, v0, p1}, Lo/bxb;->b(ILcom/huawei/health/suggestion/model/SportInfo;)V

    .line 426
    :cond_5
    :goto_1
    float-to-int v0, v4

    iget v1, p0, Lo/bxb;->e:F

    float-to-int v1, v1

    if-le v0, v1, :cond_6

    .line 427
    iput v5, p0, Lo/bxb;->a:I

    .line 428
    iput v4, p0, Lo/bxb;->e:F

    .line 430
    :cond_6
    return-void
.end method

.method private b(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V
    .locals 4

    .line 334
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireBestPace()I

    move-result v3

    .line 336
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualDistance()F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    .line 337
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquirePlanId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    invoke-interface {v0, v1, v2, v3}, Lo/bsp;->a(Ljava/lang/String;II)Z

    .line 340
    :cond_0
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/bsp;->a(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V

    .line 341
    return-void
.end method

.method private b(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    .line 187
    iget-object v0, p0, Lo/bxb;->h:Lo/brv;

    if-eqz v0, :cond_2

    .line 189
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 190
    iget-object v0, p0, Lo/bxb;->h:Lo/brv;

    move-object v1, p1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v0, v1, p2}, Lo/brv;->a(ILjava/lang/String;)V

    goto :goto_0

    .line 191
    :cond_0
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 192
    iget-object v0, p0, Lo/bxb;->h:Lo/brv;

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0, v1, p2}, Lo/brv;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 193
    :cond_1
    instance-of v0, p1, [I

    if-eqz v0, :cond_2

    .line 194
    iget-object v0, p0, Lo/bxb;->h:Lo/brv;

    move-object v1, p1

    check-cast v1, [I

    check-cast v1, [I

    invoke-interface {v0, v1, p2}, Lo/brv;->c([ILjava/lang/String;)V

    .line 197
    :cond_2
    :goto_0
    return-void
.end method

.method private c(Ljava/lang/Object;)V
    .locals 1

    .line 182
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/bxb;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    return-void
.end method

.method private static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 131
    const/4 v1, 0x0

    .line 132
    if-eqz p0, :cond_0

    .line 133
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v2

    .line 134
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 135
    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/Plan;->acquireName()Ljava/lang/String;

    move-result-object v1

    .line 138
    :cond_0
    return-object v1
.end method

.method private d(I)V
    .locals 2

    .line 434
    iget v0, p0, Lo/bxb;->i:I

    if-eq p1, v0, :cond_1

    .line 436
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 439
    :pswitch_0
    invoke-virtual {p0}, Lo/bxb;->e()V

    .line 440
    goto :goto_0

    .line 443
    :pswitch_1
    iget v0, p0, Lo/bxb;->i:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 444
    invoke-virtual {p0}, Lo/bxb;->a()V

    goto :goto_0

    .line 449
    :pswitch_2
    invoke-virtual {p0}, Lo/bxb;->c()V

    .line 450
    .line 455
    :cond_0
    :goto_0
    iput p1, p0, Lo/bxb;->i:I

    .line 457
    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method private e(Landroid/os/Bundle;)Lcom/huawei/health/suggestion/model/SportInfo;
    .locals 8

    .line 345
    const-string v0, "distance"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    .line 346
    const-string v0, "duration"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v3

    .line 347
    const-string v0, "heartRate"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    .line 348
    const-string v0, "calorie"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v5

    .line 349
    const-string v0, "sportId"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 351
    new-instance v7, Lcom/huawei/health/suggestion/model/SportInfo;

    invoke-direct {v7}, Lcom/huawei/health/suggestion/model/SportInfo;-><init>()V

    .line 352
    invoke-virtual {v7, v3}, Lcom/huawei/health/suggestion/model/SportInfo;->saveTime(I)V

    .line 353
    invoke-virtual {v7, v4}, Lcom/huawei/health/suggestion/model/SportInfo;->saveHeartRate(I)V

    .line 354
    invoke-direct {p0}, Lo/bxb;->i()F

    move-result v0

    invoke-static {v0}, Lo/bzr;->g(F)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/SportInfo;->savePace(I)V

    .line 355
    int-to-float v0, v5

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/SportInfo;->saveCalorie(F)V

    .line 356
    invoke-virtual {v7, v6}, Lcom/huawei/health/suggestion/model/SportInfo;->saveSportId(Ljava/lang/String;)V

    .line 357
    invoke-static {v2}, Lo/bzr;->d(I)F

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/SportInfo;->saveDistance(F)V

    .line 359
    return-object v7
.end method

.method private e(Lcom/huawei/health/suggestion/model/Summary;)Lcom/huawei/health/suggestion/model/WorkoutRecord;
    .locals 8

    .line 275
    new-instance v4, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-direct {v4}, Lcom/huawei/health/suggestion/model/WorkoutRecord;-><init>()V

    .line 276
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Summary;->acquireDistance()F

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveActualDistance(F)V

    .line 277
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Summary;->acquireCalorie()F

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveActualCalorie(F)V

    .line 278
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Summary;->acquireDuring()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveDuring(I)V

    .line 279
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Summary;->acquireExerciseTime()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveExerciseTime(J)V

    .line 280
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Summary;->acquireSportId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveTrajectoryId(Ljava/lang/String;)V

    .line 281
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Summary;->acquireCalorie()F

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveCalorie(F)V

    .line 282
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutOrder(I)V

    .line 283
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveRecordType(I)V

    .line 284
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Summary;->acquireMaxMet()I

    move-result v0

    invoke-static {v0}, Lo/bzr;->c(I)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveOxygen(D)V

    .line 287
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Summary;->acquireBestPace()I

    move-result v0

    if-eqz v0, :cond_0

    .line 288
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Summary;->acquireBestPace()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveBestPace(I)V

    goto :goto_0

    .line 290
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Summary;->acquireDuring()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Summary;->acquireDistance()F

    move-result v1

    div-float/2addr v0, v1

    float-to-int v0, v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveBestPace(I)V

    .line 295
    :goto_0
    iget-object v0, p0, Lo/bxb;->b:Ljava/lang/String;

    if-nez v0, :cond_2

    .line 296
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v6

    .line 297
    if-nez v6, :cond_1

    const/4 v5, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v5

    .line 298
    :goto_1
    goto :goto_2

    .line 299
    :cond_2
    iget-object v5, p0, Lo/bxb;->b:Ljava/lang/String;

    .line 302
    :goto_2
    if-eqz v5, :cond_3

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Summary;->acquirePlanId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 304
    :cond_3
    const-string v0, "RunManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u4e0d\u5904\u7406\u5df2\u7ecf\u7ed3\u675f\u7684\u8ba1\u5212\u7684\u8bb0\u5f55\u6570\u636e,summary.acquirePlanId():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Summary;->acquirePlanId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",currPlanId\uff1a"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 305
    const/4 v0, 0x0

    return-object v0

    .line 311
    :cond_4
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Summary;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/bsp;->d(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/RunWorkout;

    move-result-object v6

    .line 312
    const-string v0, "RunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    if-nez v6, :cond_5

    .line 315
    const-string v0, "RunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u4fdd\u5b58\u8bb0\u5f55\u5931\u8d25\uff0crunWorkout\u4e3anull"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 316
    const/4 v0, 0x0

    return-object v0

    .line 319
    :cond_5
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Summary;->acquireDistance()F

    move-result v0

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireDistance()I

    move-result v1

    invoke-static {v0, v1}, Lo/bya;->d(FI)F

    move-result v7

    .line 321
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireDistance()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveDistance(F)V

    .line 322
    invoke-virtual {v4, v7}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveFinishRate(F)V

    .line 323
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutId(Ljava/lang/String;)V

    .line 324
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutName(Ljava/lang/String;)V

    .line 325
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireWorkoutDate()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutDate(Ljava/lang/String;)V

    .line 326
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Summary;->acquirePlanId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->savePlanId(Ljava/lang/String;)V

    .line 327
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/RunWorkout;->accquireVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveVersion(Ljava/lang/String;)V

    .line 329
    return-object v4
.end method

.method private f()Lo/bzq;
    .locals 1

    .line 222
    invoke-direct {p0}, Lo/bxb;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 223
    invoke-static {}, Lo/bzj;->b()Lo/bzj;

    move-result-object v0

    return-object v0

    .line 225
    :cond_0
    invoke-static {}, Lo/bzh;->e()Lo/bzh;

    move-result-object v0

    return-object v0
.end method

.method private g()Z
    .locals 2

    .line 230
    const-string v0, "zh"

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private h()V
    .locals 4

    .line 235
    const-string v0, "RunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "play remindDrink"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    invoke-direct {p0}, Lo/bxb;->f()Lo/bzq;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/bzq;->b(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bxb;->c(Ljava/lang/Object;)V

    .line 237
    return-void
.end method

.method private i()F
    .locals 4

    .line 472
    iget-object v0, p0, Lo/bxb;->r:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/bxb;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_1

    .line 473
    const/4 v1, 0x0

    .line 474
    iget-object v0, p0, Lo/bxb;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/Float;

    .line 475
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v0

    add-float/2addr v1, v0

    .line 476
    goto :goto_0

    .line 477
    :cond_0
    iget-object v0, p0, Lo/bxb;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-float v0, v0

    div-float v0, v1, v0

    return v0

    .line 479
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private k()V
    .locals 2

    .line 82
    new-instance v0, Lo/btz;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lo/btz;-><init>(I)V

    iput-object v0, p0, Lo/bxb;->p:Lo/btz;

    .line 83
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bxb;->r:Ljava/util/List;

    .line 84
    return-void
.end method

.method private p()V
    .locals 4

    .line 484
    iget v0, p0, Lo/bxb;->f:I

    if-lez v0, :cond_0

    .line 485
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget-object v1, p0, Lo/bxb;->b:Ljava/lang/String;

    iget v2, p0, Lo/bxb;->f:I

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3, v2}, Lo/bsp;->a(Ljava/lang/String;II)Z

    .line 488
    :cond_0
    iget v0, p0, Lo/bxb;->k:I

    if-lez v0, :cond_1

    .line 489
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget-object v1, p0, Lo/bxb;->b:Ljava/lang/String;

    iget v2, p0, Lo/bxb;->k:I

    const/4 v3, 0x1

    invoke-interface {v0, v1, v3, v2}, Lo/bsp;->a(Ljava/lang/String;II)Z

    .line 492
    :cond_1
    iget v0, p0, Lo/bxb;->o:I

    if-lez v0, :cond_2

    .line 493
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget-object v1, p0, Lo/bxb;->b:Ljava/lang/String;

    iget v2, p0, Lo/bxb;->o:I

    const/4 v3, 0x2

    invoke-interface {v0, v1, v3, v2}, Lo/bsp;->a(Ljava/lang/String;II)Z

    .line 496
    :cond_2
    iget v0, p0, Lo/bxb;->n:I

    if-lez v0, :cond_3

    .line 497
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget-object v1, p0, Lo/bxb;->b:Ljava/lang/String;

    iget v2, p0, Lo/bxb;->n:I

    const/4 v3, 0x3

    invoke-interface {v0, v1, v3, v2}, Lo/bsp;->a(Ljava/lang/String;II)Z

    .line 499
    :cond_3
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 374
    return-void
.end method

.method public a(Lcom/huawei/health/suggestion/model/Summary;)V
    .locals 1

    .line 578
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lo/bxb;->e(Lcom/huawei/health/suggestion/model/Summary;Z)V

    .line 579
    return-void
.end method

.method public b(ILandroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Landroid/content/Context;)V
    .locals 7

    .line 656
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 657
    if-eqz p4, :cond_1

    .line 662
    sget v0, Lcom/huawei/health/suggestion/R$string;->IDS_scan_device:I

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p4, v0, v1}, Lo/bxy;->d(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 664
    new-instance v0, Lo/egv$b;

    invoke-direct {v0, p4}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_notify:I

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    .line 665
    invoke-static {p4, v1, v2}, Lo/bxy;->d(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_runcallback_dialog_ete:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v4, v2, v3

    .line 666
    invoke-static {p4, v1, v2}, Lo/bxy;->d(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_coach_dialog_yes:I

    new-instance v2, Lo/bxb$2;

    invoke-direct {v2, p0, p2}, Lo/bxb$2;-><init>(Lo/bxb;Landroid/view/View$OnClickListener;)V

    .line 667
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_cancal:I

    new-instance v2, Lo/bxb$3;

    invoke-direct {v2, p0, p3}, Lo/bxb$3;-><init>(Lo/bxb;Landroid/view/View$OnClickListener;)V

    .line 675
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v6

    .line 684
    invoke-virtual {v6}, Lo/egv$b;->b()Lo/egv;

    move-result-object v5

    .line 685
    invoke-virtual {v5}, Lo/egv;->show()V

    .line 686
    goto :goto_0

    .line 689
    :cond_0
    const-string v0, "RunCallback"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unknow dialog type"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 691
    :cond_1
    :goto_0
    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 5

    .line 589
    const-string v0, "SportCallback"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpdate-"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 590
    if-nez p1, :cond_0

    .line 591
    return-void

    .line 594
    :cond_0
    const-string v0, "sportState"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    .line 596
    invoke-direct {p0, v4}, Lo/bxb;->d(I)V

    .line 598
    const/4 v0, 0x1

    if-ne v4, v0, :cond_1

    .line 600
    invoke-direct {p0, p1}, Lo/bxb;->a(Landroid/os/Bundle;)V

    .line 601
    invoke-direct {p0, p1}, Lo/bxb;->e(Landroid/os/Bundle;)Lcom/huawei/health/suggestion/model/SportInfo;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bxb;->b(Lcom/huawei/health/suggestion/model/SportInfo;)V

    .line 603
    :cond_1
    return-void
.end method

.method public b(Lcom/huawei/health/suggestion/model/RunWorkout;Ljava/lang/String;Lcom/huawei/health/suggestion/model/WorkoutRecord;Landroid/content/Context;)V
    .locals 5

    .line 108
    if-nez p1, :cond_0

    .line 109
    return-void

    .line 112
    :cond_0
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v4

    .line 113
    if-eqz v4, :cond_1

    .line 114
    invoke-interface {v4}, Lo/brr;->e()Lo/brv;

    move-result-object v0

    iput-object v0, p0, Lo/bxb;->h:Lo/brv;

    .line 117
    :cond_1
    iget-object v0, p0, Lo/bxb;->h:Lo/brv;

    if-eqz v0, :cond_2

    .line 118
    const-string v0, "RunManager"

    const/16 v1, 0xa

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start- workoutId:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", workoutDate:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 119
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireWorkoutDate()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ", workoutName:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 120
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ", workoutDistance:"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    .line 121
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireDistance()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, ", workoutDuration"

    const/16 v3, 0x8

    aput-object v2, v1, v3

    .line 122
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireDuration()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    .line 118
    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    invoke-static {p2}, Lo/bxb;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bzm;->c(Ljava/lang/String;)V

    .line 124
    invoke-direct {p0, p1, p2, p3}, Lo/bxb;->a(Lcom/huawei/health/suggestion/model/RunWorkout;Ljava/lang/String;Lcom/huawei/health/suggestion/model/WorkoutRecord;)V

    .line 125
    invoke-static {p1}, Lo/bxn;->d(Lcom/huawei/health/suggestion/model/RunWorkout;)V

    .line 126
    iget-object v0, p0, Lo/bxb;->h:Lo/brv;

    invoke-interface {v0, p2, p1, p0, p4}, Lo/brv;->b(Ljava/lang/String;Lcom/huawei/health/suggestion/model/RunWorkout;Lo/bru;Landroid/content/Context;)V

    .line 128
    :cond_2
    return-void
.end method

.method public c()V
    .locals 0

    .line 367
    return-void
.end method

.method public d()V
    .locals 2

    .line 157
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v1

    .line 158
    if-eqz v1, :cond_0

    .line 159
    invoke-interface {v1}, Lo/brr;->e()Lo/brv;

    move-result-object v0

    iput-object v0, p0, Lo/bxb;->h:Lo/brv;

    .line 162
    :cond_0
    iget-object v0, p0, Lo/bxb;->h:Lo/brv;

    if-eqz v0, :cond_1

    .line 163
    iget-object v0, p0, Lo/bxb;->h:Lo/brv;

    invoke-interface {v0}, Lo/brv;->c()V

    .line 165
    :cond_1
    return-void
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 2

    .line 146
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v1

    .line 147
    if-eqz v1, :cond_0

    .line 148
    invoke-interface {v1}, Lo/brr;->e()Lo/brv;

    move-result-object v0

    iput-object v0, p0, Lo/bxb;->h:Lo/brv;

    .line 151
    :cond_0
    iget-object v0, p0, Lo/bxb;->h:Lo/brv;

    if-eqz v0, :cond_1

    .line 152
    iget-object v0, p0, Lo/bxb;->h:Lo/brv;

    invoke-interface {v0, p1}, Lo/brv;->c(Landroid/os/Bundle;)V

    .line 154
    :cond_1
    return-void
.end method

.method public e()V
    .locals 0

    .line 371
    return-void
.end method

.method public e(ILjava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 614
    const-string v0, "RunManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "phrase_id:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",insert_values:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-interface {p2}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 615
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 627
    :pswitch_0
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lo/bxb;->a(I)V

    .line 628
    goto :goto_0

    .line 635
    :pswitch_1
    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lo/bxb;->a(I)V

    .line 636
    goto :goto_0

    .line 641
    :pswitch_2
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/bxb;->a(I)V

    .line 642
    .line 647
    :goto_0
    :pswitch_3
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public e(Lcom/huawei/health/suggestion/model/Summary;Z)V
    .locals 9

    .line 520
    const-string v0, "RunManager"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " formRunCallback:"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 521
    if-eqz p1, :cond_4

    .line 523
    if-eqz p2, :cond_0

    .line 525
    invoke-direct {p0}, Lo/bxb;->p()V

    .line 529
    :cond_0
    invoke-direct {p0, p1}, Lo/bxb;->e(Lcom/huawei/health/suggestion/model/Summary;)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v4

    .line 530
    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualDistance()F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3fb999999999999aL    # 0.1

    cmpl-double v0, v0, v2

    if-lez v0, :cond_4

    .line 532
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v5

    .line 533
    if-eqz v5, :cond_1

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Summary;->acquirePlanId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 534
    :cond_1
    const-string v0, "RunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "planId is null or is not currentPlan or planType not run, not save record"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 535
    return-void

    .line 537
    :cond_2
    invoke-direct {p0, v4}, Lo/bxb;->b(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V

    .line 539
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 540
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 542
    const-string v0, "plan_name"

    :try_start_0
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 543
    const-string v0, "type"

    const/4 v1, 0x0

    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 544
    invoke-static {}, Lo/bzm;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 545
    const-string v0, "start_time"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Summary;->acquiretStartTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/bzm;->e(J)J

    move-result-wide v1

    invoke-virtual {v7, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 546
    const-string v0, "end_time"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Summary;->acquireEndTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/bzm;->e(J)J

    move-result-wide v1

    invoke-virtual {v7, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 547
    const-string v0, "finish_rate"

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireFinishRate()F

    move-result v1

    invoke-static {v1}, Lo/bzm;->e(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 551
    :cond_3
    const-string v0, "workout_name"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Summary;->acquireWorkoutName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 552
    const-string v0, "data"

    invoke-virtual {v7}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 553
    const-string v0, "1120005"

    invoke-static {v0, v6}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 556
    goto :goto_0

    .line 554
    :catch_0
    move-exception v8

    .line 555
    const-string v0, "RunManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 560
    :cond_4
    :goto_0
    if-eqz p2, :cond_5

    .line 562
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bxb;->b:Ljava/lang/String;

    .line 563
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bxb;->g:Lcom/huawei/health/suggestion/model/RunWorkout;

    .line 564
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bxb;->h:Lo/brv;

    .line 565
    const/4 v0, 0x0

    iput v0, p0, Lo/bxb;->f:I

    .line 566
    const/4 v0, 0x0

    iput v0, p0, Lo/bxb;->k:I

    .line 567
    const/4 v0, 0x0

    iput v0, p0, Lo/bxb;->o:I

    .line 568
    const/4 v0, 0x0

    iput v0, p0, Lo/bxb;->n:I

    .line 570
    :cond_5
    return-void
.end method
