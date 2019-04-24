.class Lo/exp$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exp;->a(JILo/exn$d;Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/exp;

.field final synthetic b:Lo/exn$d;

.field final synthetic c:Lo/egg;

.field final synthetic e:J


# direct methods
.method constructor <init>(Lo/exp;JLo/exn$d;Lo/egg;)V
    .locals 0

    .line 2370
    iput-object p1, p0, Lo/exp$2;->a:Lo/exp;

    iput-wide p2, p0, Lo/exp$2;->e:J

    iput-object p4, p0, Lo/exp$2;->b:Lo/exn$d;

    iput-object p5, p0, Lo/exp$2;->c:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 2374
    if-nez p1, :cond_0

    .line 2375
    const-string v0, "UIHLH_FitnessCoreSleepDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBaseTime datas is empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2376
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exp$2;->a:Lo/exp;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/exp;->n(Lo/exp;I)I

    .line 2377
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exp$2;->a:Lo/exp;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/exp;->q(Lo/exp;I)I

    .line 2378
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exp$2;->a:Lo/exp;

    move-object/from16 v1, p0

    iget-wide v1, v1, Lo/exp$2;->e:J

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/exp$2;->b:Lo/exn$d;

    move-object/from16 v4, p0

    iget-object v4, v4, Lo/exp$2;->c:Lo/egg;

    invoke-static {v0, v1, v2, v3, v4}, Lo/exp;->e(Lo/exp;JLo/exn$d;Lo/egg;)V

    .line 2379
    return-void

    .line 2382
    :cond_0
    move-object/from16 v5, p1

    .line 2383
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2384
    const-string v0, "UIHLH_FitnessCoreSleepDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBaseTime sumDataList is empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2385
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exp$2;->a:Lo/exp;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/exp;->n(Lo/exp;I)I

    .line 2386
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exp$2;->a:Lo/exp;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/exp;->q(Lo/exp;I)I

    .line 2387
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exp$2;->a:Lo/exp;

    move-object/from16 v1, p0

    iget-wide v1, v1, Lo/exp$2;->e:J

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/exp$2;->b:Lo/exn$d;

    move-object/from16 v4, p0

    iget-object v4, v4, Lo/exp$2;->c:Lo/egg;

    invoke-static {v0, v1, v2, v3, v4}, Lo/exp;->e(Lo/exp;JLo/exn$d;Lo/egg;)V

    .line 2388
    return-void

    .line 2390
    :cond_1
    const-string v0, "UIHLH_FitnessCoreSleepDetailInteractor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBaseTime sumDataList="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2392
    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 2394
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exp$2;->a:Lo/exp;

    invoke-static {v0}, Lo/exp;->q(Lo/exp;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2395
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/hihealth/HiHealthData;

    .line 2396
    new-instance v14, Lcom/huawei/ui/main/stories/recommendcloud/data/CoreSleepWakeSleepData;

    invoke-direct {v14}, Lcom/huawei/ui/main/stories/recommendcloud/data/CoreSleepWakeSleepData;-><init>()V

    .line 2397
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->o(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/huawei/ui/main/stories/recommendcloud/data/CoreSleepWakeSleepData;->setCurrentDay(Ljava/lang/String;)V

    .line 2398
    const-string v0, "core_sleep_fall_key"

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v8

    .line 2399
    const-wide/16 v0, 0x0

    cmpl-double v0, v0, v8

    if-eqz v0, :cond_2

    .line 2400
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "HH"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    move-object v15, v0

    .line 2402
    new-instance v0, Ljava/util/Date;

    double-to-long v1, v8

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v15, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v16

    .line 2403
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "mm"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    move-object v15, v0

    .line 2404
    new-instance v0, Ljava/util/Date;

    double-to-long v1, v8

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v15, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v17

    .line 2405
    const/16 v18, 0x0

    .line 2406
    const/16 v19, 0x0

    .line 2408
    :try_start_0
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move/from16 v18, v0

    .line 2409
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move/from16 v19, v0

    .line 2412
    goto :goto_1

    .line 2410
    :catch_0
    move-exception v20

    .line 2411
    const-string v0, "UIHLH_FitnessCoreSleepDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBaseTime NumberFormatException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2413
    :goto_1
    add-int/lit8 v6, v6, 0x1

    .line 2414
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exp$2;->a:Lo/exp;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/exp$2;->a:Lo/exp;

    invoke-static {v1}, Lo/exp;->s(Lo/exp;)I

    move-result v1

    mul-int/lit8 v2, v18, 0x3c

    add-int v2, v2, v19

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Lo/exp;->n(Lo/exp;I)I

    .line 2418
    :cond_2
    const-string v0, "core_sleep_wake_up_key"

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v10

    .line 2419
    const-wide/16 v0, 0x0

    cmpl-double v0, v0, v10

    if-eqz v0, :cond_3

    .line 2420
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "HH"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    move-object v15, v0

    .line 2421
    new-instance v0, Ljava/util/Date;

    double-to-long v1, v10

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v15, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v16

    .line 2422
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "mm"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    move-object v15, v0

    .line 2423
    new-instance v0, Ljava/util/Date;

    double-to-long v1, v10

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v15, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v17

    .line 2424
    const/16 v18, 0x0

    .line 2425
    const/16 v19, 0x0

    .line 2427
    :try_start_1
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move/from16 v18, v0

    .line 2428
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    move/from16 v19, v0

    .line 2431
    goto :goto_2

    .line 2429
    :catch_1
    move-exception v20

    .line 2430
    const-string v0, "UIHLH_FitnessCoreSleepDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBaseTime NumberFormatException !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2432
    :goto_2
    add-int/lit8 v7, v7, 0x1

    .line 2433
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exp$2;->a:Lo/exp;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/exp$2;->a:Lo/exp;

    invoke-static {v1}, Lo/exp;->u(Lo/exp;)I

    move-result v1

    mul-int/lit8 v2, v19, 0x3c

    add-int v2, v2, v18

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Lo/exp;->q(Lo/exp;I)I

    .line 2435
    :cond_3
    goto/16 :goto_0

    .line 2438
    :cond_4
    const/4 v0, 0x0

    if-eq v0, v6, :cond_5

    .line 2439
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exp$2;->a:Lo/exp;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/exp$2;->a:Lo/exp;

    invoke-static {v1}, Lo/exp;->s(Lo/exp;)I

    move-result v1

    div-int/2addr v1, v6

    invoke-static {v0, v1}, Lo/exp;->n(Lo/exp;I)I

    .line 2441
    :cond_5
    const-string v0, "UIHLH_FitnessCoreSleepDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getBaseTime unitCount is 1  mBaseTimeFall = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/exp$2;->a:Lo/exp;

    invoke-static {v3}, Lo/exp;->s(Lo/exp;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2443
    const/4 v0, 0x0

    if-eq v0, v7, :cond_6

    .line 2444
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exp$2;->a:Lo/exp;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/exp$2;->a:Lo/exp;

    invoke-static {v1}, Lo/exp;->u(Lo/exp;)I

    move-result v1

    div-int/2addr v1, v7

    invoke-static {v0, v1}, Lo/exp;->q(Lo/exp;I)I

    .line 2446
    :cond_6
    const-string v0, "UIHLH_FitnessCoreSleepDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getBaseTime unitCount is 1  mBaseTimeWakeUp = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/exp$2;->a:Lo/exp;

    invoke-static {v3}, Lo/exp;->u(Lo/exp;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2449
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exp$2;->a:Lo/exp;

    move-object/from16 v1, p0

    iget-wide v1, v1, Lo/exp$2;->e:J

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/exp$2;->b:Lo/exn$d;

    move-object/from16 v4, p0

    iget-object v4, v4, Lo/exp$2;->c:Lo/egg;

    invoke-static {v0, v1, v2, v3, v4}, Lo/exp;->e(Lo/exp;JLo/exn$d;Lo/egg;)V

    .line 2450
    return-void
.end method
