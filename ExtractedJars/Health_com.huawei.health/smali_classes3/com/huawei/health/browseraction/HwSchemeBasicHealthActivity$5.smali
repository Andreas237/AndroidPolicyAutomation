.class Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

.field final synthetic c:J


# direct methods
.method constructor <init>(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;J)V
    .locals 0

    .line 315
    iput-object p1, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$5;->a:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

    iput-wide p2, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$5;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 318
    const-string v0, "HwSchemeBasicHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestCoreSleepSummary aggregateHiHealthData onResult 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 320
    if-eqz p1, :cond_0

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 321
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$5;->a:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

    invoke-static {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->e(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$c;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 322
    const/4 v0, 0x3

    iput v0, v4, Landroid/os/Message;->what:I

    .line 323
    const/4 v0, 0x1

    iput v0, v4, Landroid/os/Message;->arg1:I

    .line 324
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$5;->a:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

    invoke-static {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->e(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$c;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$c;->sendMessage(Landroid/os/Message;)Z

    .line 325
    return-void

    .line 328
    :cond_1
    const-string v0, "HwSchemeBasicHealthActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestCoreSleepSummary datas="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 330
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealth/HiHealthData;

    .line 332
    const-wide/16 v5, 0x0

    .line 333
    const-string v0, "core_sleep_shallow_key"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v7

    .line 334
    const-string v0, "core_sleep_deep_key"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v8

    .line 335
    const-string v0, "core_sleep_wake_dream_key"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v9

    .line 336
    const-string v0, "sleep_core_sleep_noon_duration_key"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v10

    .line 337
    const-string v0, "HwSchemeBasicHealthActivity"

    const/16 v1, 0xa

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "firstShallowSum == "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", firstDeepSum == "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ", firstDreamSum == "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ", firstNoonDurationSum == "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    .line 338
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, ", data.getStartTime() = "

    const/16 v3, 0x8

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    .line 337
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    if-gtz v7, :cond_2

    if-gtz v8, :cond_2

    if-gtz v9, :cond_2

    if-lez v10, :cond_3

    .line 341
    :cond_2
    add-int v0, v7, v8

    add-int/2addr v0, v9

    add-int/2addr v0, v10

    int-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x404e000000000000L    # 60.0

    div-double v5, v0, v2

    .line 342
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->a(Z)Z

    goto :goto_0

    .line 344
    :cond_3
    const-string v0, "sleep_deep_key"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v11

    .line 345
    const-string v0, "sleep_shallow_key"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v12

    .line 346
    add-int v0, v11, v12

    int-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    const-wide v2, 0x40ac200000000000L    # 3600.0

    div-double v5, v0, v2

    .line 347
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->a(Z)Z

    .line 350
    :goto_0
    new-instance v11, Ljava/util/Date;

    invoke-virtual {v4}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-direct {v11, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 351
    new-instance v12, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "M/d"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v12, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 352
    invoke-virtual {v12, v11}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v13

    .line 353
    new-instance v0, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v12, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v14

    .line 354
    const-wide v0, 0x3ee4f8b580000000L    # 9.999999747378752E-6

    add-double v15, v5, v0

    .line 355
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 356
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$5;->a:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

    invoke-static {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->e(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$c;->obtainMessage()Landroid/os/Message;

    move-result-object v17

    .line 357
    const/4 v0, 0x3

    move-object/from16 v1, v17

    iput v0, v1, Landroid/os/Message;->what:I

    .line 358
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$5;->a:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

    invoke-static {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->e(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$c;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$c;->sendMessage(Landroid/os/Message;)Z

    .line 359
    return-void

    .line 362
    :cond_4
    const-wide/16 v0, 0x0

    cmpl-double v0, v15, v0

    if-nez v0, :cond_5

    .line 363
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$5;->a:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

    invoke-static {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->e(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$c;->obtainMessage()Landroid/os/Message;

    move-result-object v17

    .line 364
    const/4 v0, 0x3

    move-object/from16 v1, v17

    iput v0, v1, Landroid/os/Message;->what:I

    .line 365
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$5;->a:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

    invoke-static {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->e(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$c;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$c;->sendMessage(Landroid/os/Message;)Z

    .line 366
    return-void

    .line 368
    :cond_5
    const/16 v17, 0x7

    .line 369
    const/16 v18, 0x5a0

    .line 371
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$5;->a:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

    invoke-static {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->c(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 372
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$5;->a:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

    invoke-static {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->b(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 373
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$5;->a:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

    invoke-static {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->a(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 374
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$5;->a:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

    invoke-static {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->k(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 377
    const/16 v19, 0x0

    :goto_1
    move/from16 v0, v19

    move/from16 v1, v17

    if-ge v0, v1, :cond_a

    .line 378
    const/16 v20, 0x0

    .line 379
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v19

    if-le v0, v1, :cond_6

    .line 380
    move-object/from16 v0, p1

    move/from16 v1, v19

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Lcom/huawei/hihealth/HiHealthData;

    .line 383
    :cond_6
    const/4 v0, 0x0

    move-object/from16 v1, v20

    if-ne v0, v1, :cond_7

    .line 384
    goto/16 :goto_3

    .line 386
    :cond_7
    invoke-virtual/range {v20 .. v20}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v21

    .line 389
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$5;->c:J

    sub-long v0, v0, v21

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    const-wide/16 v2, 0x3c

    div-long/2addr v0, v2

    const-wide/16 v2, 0x5a0

    div-long/2addr v0, v2

    long-to-int v2, v0

    move/from16 v23, v2

    .line 390
    const-string v0, "HwSchemeBasicHealthActivity"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestCoreSleepSummary  i = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " time = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " currentCount = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " data = "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const/4 v2, 0x7

    aput-object v20, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 392
    const-string v0, "core_sleep_shallow_key"

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v24

    .line 393
    const-string v0, "core_sleep_deep_key"

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v25

    .line 394
    const-string v0, "core_sleep_wake_dream_key"

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v26

    .line 395
    const-string v0, "sleep_core_sleep_noon_duration_key"

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v27

    .line 396
    if-gtz v24, :cond_8

    if-gtz v25, :cond_8

    if-gtz v26, :cond_8

    if-lez v27, :cond_9

    .line 397
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$5;->a:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

    invoke-static {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->c(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Ljava/util/List;

    move-result-object v0

    move/from16 v1, v25

    int-to-float v1, v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 398
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$5;->a:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

    invoke-static {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->b(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Ljava/util/List;

    move-result-object v0

    move/from16 v1, v24

    int-to-float v1, v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 399
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$5;->a:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

    invoke-static {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->a(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Ljava/util/List;

    move-result-object v0

    move/from16 v1, v26

    int-to-float v1, v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 400
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$5;->a:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

    invoke-static {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->k(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Ljava/util/List;

    move-result-object v0

    move/from16 v1, v27

    int-to-float v1, v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    .line 403
    :cond_9
    const-string v0, "sleep_deep_key"

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v28

    .line 404
    const-string v0, "HwSchemeBasicHealthActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestCoreSleepSummary  normaldeepSum = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v28 .. v28}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 406
    const-string v0, "sleep_shallow_key"

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v29

    .line 407
    const-string v0, "HwSchemeBasicHealthActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestCoreSleepSummary  normalshallowSum = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 410
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$5;->a:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

    invoke-static {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->c(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Ljava/util/List;

    move-result-object v0

    move/from16 v1, v28

    int-to-float v1, v1

    const/high16 v2, 0x42700000    # 60.0f

    div-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 411
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$5;->a:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

    invoke-static {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->b(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Ljava/util/List;

    move-result-object v0

    move/from16 v1, v29

    int-to-float v1, v1

    const/high16 v2, 0x42700000    # 60.0f

    div-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 412
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$5;->a:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

    invoke-static {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->a(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 413
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$5;->a:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

    invoke-static {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->k(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 377
    :goto_2
    add-int/lit8 v19, v19, 0x1

    goto/16 :goto_1

    .line 417
    :cond_a
    :goto_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$5;->a:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

    invoke-static {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->e(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$c;->obtainMessage()Landroid/os/Message;

    move-result-object v19

    .line 418
    const/4 v0, 0x3

    move-object/from16 v1, v19

    iput v0, v1, Landroid/os/Message;->what:I

    .line 419
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$5;->a:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

    invoke-static {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->c(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$5;->a:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

    invoke-static {v1}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->b(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    add-float/2addr v0, v1

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$5;->a:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

    invoke-static {v1}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->a(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    add-float/2addr v0, v1

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$5;->a:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

    invoke-static {v1}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->k(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    add-float/2addr v0, v1

    float-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v1, v19

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 420
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$5;->a:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

    invoke-static {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->e(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$c;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$c;->sendMessage(Landroid/os/Message;)Z

    .line 423
    return-void
.end method
