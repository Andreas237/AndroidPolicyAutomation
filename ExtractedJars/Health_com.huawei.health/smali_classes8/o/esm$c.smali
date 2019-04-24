.class Lo/esm$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/esm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/esm;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/esm;)V
    .locals 1

    .line 312
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 313
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/esm$c;->c:Ljava/lang/ref/WeakReference;

    .line 314
    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 319
    if-eqz p1, :cond_0

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 320
    :cond_0
    const-string v0, "SportsRecordingCard"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "all run datas null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 321
    return-void

    .line 324
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/esm$c;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/esm;

    .line 325
    const/4 v0, 0x0

    if-ne v0, v5, :cond_2

    .line 326
    return-void

    .line 329
    :cond_2
    invoke-static {v5}, Lo/esm;->e(Lo/esm;)Lo/esm$a;

    move-result-object v6

    .line 330
    const/4 v0, 0x0

    if-ne v0, v6, :cond_3

    .line 331
    return-void

    .line 334
    :cond_3
    iget-object v7, v5, Lo/esm;->d:Landroid/content/Context;

    .line 335
    const/4 v0, 0x0

    if-ne v0, v7, :cond_4

    .line 336
    return-void

    .line 339
    :cond_4
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hihealth/HiHealthData;

    .line 341
    const-string v0, "wear_device_type_datas"

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v9

    .line 342
    const-wide/16 v10, 0x0

    .line 343
    .line 344
    const/16 v0, 0x2710

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "HOME_HEALTH_SHOW_DOT"

    .line 343
    invoke-static {v7, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 345
    const-string v0, "SportsRecordingCard"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showRedDotStr is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    const-wide/16 v13, 0x0

    .line 350
    int-to-long v15, v9

    .line 352
    .line 353
    const/16 v0, 0x2710

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "HOME_HEALTH_TRACK_NUM"

    .line 352
    invoke-static {v7, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    .line 355
    const-string v0, "SportsRecordingCard"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "trackNumString is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v17

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 356
    const/4 v0, 0x0

    move-object/from16 v1, v17

    if-eq v0, v1, :cond_5

    const-string v0, ""

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-static/range {v17 .. v17}, Lo/esm;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 357
    invoke-static/range {v17 .. v17}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v13

    .line 358
    const-string v0, "SportsRecordingCard"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "trackNumLocal is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 360
    :cond_5
    const-string v0, "SportsRecordingCard"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "trackNumLocal is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "   trackNumData is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide v3, v15

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 362
    cmp-long v0, v13, v15

    if-eqz v0, :cond_6

    .line 364
    new-instance v18, Lo/dcy;

    invoke-direct/range {v18 .. v18}, Lo/dcy;-><init>()V

    .line 365
    const/16 v0, 0x2710

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "HOME_HEALTH_TRACK_NUM"

    .line 366
    invoke-static/range {v15 .. v16}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    .line 365
    move-object/from16 v3, v18

    invoke-static {v7, v0, v1, v2, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 369
    cmp-long v0, v15, v13

    if-lez v0, :cond_6

    .line 371
    new-instance v19, Lo/dcy;

    invoke-direct/range {v19 .. v19}, Lo/dcy;-><init>()V

    .line 372
    const/16 v0, 0x2710

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "HOME_HEALTH_SHOW_DOT"

    const-string v2, "true"

    move-object/from16 v3, v19

    invoke-static {v7, v0, v1, v2, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 374
    .line 375
    const/16 v0, 0x2710

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "HOME_HEALTH_SHOW_DOT"

    .line 374
    invoke-static {v7, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 376
    const-string v0, "SportsRecordingCard"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showRedDot is true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 380
    :cond_6
    invoke-static {}, Lo/ddn;->e()Ljava/lang/String;

    move-result-object v18

    .line 381
    const/4 v0, 0x0

    move-object/from16 v1, v18

    if-eq v0, v1, :cond_7

    const-string v0, ""

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-static/range {v18 .. v18}, Lo/esm;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 382
    invoke-static/range {v18 .. v18}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v10

    .line 384
    :cond_7
    const-string v0, "SportsRecordingCard"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSportsCardRedDot: lastSyncTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 385
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "in_sport_history_activity_time"

    invoke-static {v7, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    .line 386
    const/16 v20, 0x0

    .line 388
    const/4 v0, 0x0

    move-object/from16 v1, v19

    if-eq v0, v1, :cond_8

    const-string v0, ""

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    const-string v0, "##"

    .line 389
    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 390
    const-string v0, "##"

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v20, v0, v1

    .line 392
    :cond_8
    const/4 v0, 0x0

    move-object/from16 v1, v20

    if-eq v0, v1, :cond_a

    const-string v0, ""

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    invoke-static/range {v18 .. v18}, Lo/esm;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 393
    invoke-static/range {v20 .. v20}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v21

    .line 394
    const-string v0, "SportsRecordingCard"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSportsCardRedDot: intoActivityTimeLong = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 396
    cmp-long v0, v10, v21

    if-lez v0, :cond_9

    const/4 v0, 0x0

    if-eq v0, v12, :cond_9

    const-string v0, "true"

    .line 397
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 398
    new-instance v23, Landroid/os/Message;

    invoke-direct/range {v23 .. v23}, Landroid/os/Message;-><init>()V

    .line 399
    const/4 v0, 0x2

    move-object/from16 v1, v23

    iput v0, v1, Landroid/os/Message;->what:I

    .line 400
    move-object/from16 v0, v23

    invoke-virtual {v6, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 401
    const-string v0, "SportsRecordingCard"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSportsCardRedDot: showRedDot first"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 402
    return-void

    .line 405
    :cond_9
    cmp-long v0, v10, v21

    if-gtz v0, :cond_a

    const/4 v0, 0x0

    if-eq v0, v12, :cond_a

    .line 406
    new-instance v23, Lo/dcy;

    invoke-direct/range {v23 .. v23}, Lo/dcy;-><init>()V

    .line 407
    const/16 v0, 0x2710

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "HOME_HEALTH_SHOW_DOT"

    const-string v2, "false"

    .line 408
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 407
    move-object/from16 v3, v23

    invoke-static {v7, v0, v1, v2, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 409
    new-instance v24, Landroid/os/Message;

    invoke-direct/range {v24 .. v24}, Landroid/os/Message;-><init>()V

    .line 410
    const/4 v0, 0x3

    move-object/from16 v1, v24

    iput v0, v1, Landroid/os/Message;->what:I

    .line 411
    move-object/from16 v0, v24

    invoke-virtual {v6, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 412
    const-string v0, "SportsRecordingCard"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSportsCardRedDot: not showRedDot second"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 413
    return-void

    .line 417
    :cond_a
    const-wide/16 v0, 0x0

    cmp-long v0, v0, v10

    if-nez v0, :cond_b

    .line 419
    new-instance v21, Landroid/os/Message;

    invoke-direct/range {v21 .. v21}, Landroid/os/Message;-><init>()V

    .line 420
    const/4 v0, 0x3

    move-object/from16 v1, v21

    iput v0, v1, Landroid/os/Message;->what:I

    .line 421
    move-object/from16 v0, v21

    invoke-virtual {v6, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 422
    new-instance v22, Lo/dcy;

    invoke-direct/range {v22 .. v22}, Lo/dcy;-><init>()V

    .line 423
    const/16 v0, 0x2710

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "HOME_HEALTH_SHOW_DOT"

    const-string v2, "false"

    .line 424
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 423
    move-object/from16 v3, v22

    invoke-static {v7, v0, v1, v2, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 425
    const-string v0, "SportsRecordingCard"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSportsCardRedDot: not showRedDot third"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 426
    return-void

    .line 429
    :cond_b
    const/4 v0, 0x0

    if-eq v0, v12, :cond_c

    const-string v0, "true"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 430
    new-instance v21, Landroid/os/Message;

    invoke-direct/range {v21 .. v21}, Landroid/os/Message;-><init>()V

    .line 431
    const/4 v0, 0x2

    move-object/from16 v1, v21

    iput v0, v1, Landroid/os/Message;->what:I

    .line 432
    move-object/from16 v0, v21

    invoke-virtual {v6, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 433
    new-instance v22, Lo/dcy;

    invoke-direct/range {v22 .. v22}, Lo/dcy;-><init>()V

    .line 434
    const/16 v0, 0x2710

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "HOME_HEALTH_SHOW_DOT"

    const-string v2, "true"

    .line 435
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 434
    move-object/from16 v3, v22

    invoke-static {v7, v0, v1, v2, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 437
    :cond_c
    const-string v0, "SportsRecordingCard"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSportsCardRedDot: showRedDot fourth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 438
    return-void
.end method
