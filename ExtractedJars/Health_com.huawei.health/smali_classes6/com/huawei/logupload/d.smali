.class Lcom/huawei/logupload/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/logupload/LogUploadService;

.field private final synthetic b:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/huawei/logupload/LogUploadService;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/huawei/logupload/d;->a:Lcom/huawei/logupload/LogUploadService;

    iput-object p2, p0, Lcom/huawei/logupload/d;->b:Landroid/content/Context;

    .line 303
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 20

    .line 306
    new-instance v4, Lcom/huawei/logupload/a/c;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/logupload/d;->b:Landroid/content/Context;

    invoke-direct {v4, v0}, Lcom/huawei/logupload/a/c;-><init>(Landroid/content/Context;)V

    .line 307
    const/4 v5, 0x0

    .line 309
    const/4 v6, 0x0

    .line 310
    sget-object v7, Lcom/huawei/logupload/c/c;->D:Ljava/lang/Object;

    monitor-enter v7

    .line 312
    :try_start_0
    invoke-static {v4}, Lcom/huawei/logupload/a/a;->a(Lcom/huawei/logupload/a/c;)Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v5

    .line 310
    monitor-exit v7

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v7

    throw v0

    .line 316
    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_a

    .line 318
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    .line 319
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, " sizeLimit "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 320
    const/4 v8, 0x0

    goto/16 :goto_2

    .line 321
    :cond_0
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v0}, Lcom/huawei/logupload/LogUpload;->B()J

    move-result-wide v9

    .line 322
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, " size "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v2}, Lcom/huawei/logupload/LogUpload;->k()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 323
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "startTime="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 324
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    .line 325
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "currentTimeMillis="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 327
    sub-long v0, v11, v9

    const-wide/32 v2, 0xf731400

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    .line 328
    const-string v0, "LogUpload Service"

    const-string v1, "Begin to delete the task..."

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 330
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/logupload/LogUpload;

    .line 342
    const/4 v0, 0x0

    invoke-static {v13, v0}, Lcom/huawei/logupload/k;->a(Lcom/huawei/logupload/LogUpload;Z)V

    .line 345
    goto/16 :goto_1

    .line 350
    :cond_1
    const/4 v13, 0x0

    .line 351
    invoke-static {}, Lcom/huawei/logupload/c/c;->c()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 352
    invoke-static {}, Lcom/huawei/logupload/c/c;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 353
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "CommonConstants.getTaskList() "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/logupload/c/c;->c()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 354
    const-string v2, "CommonConstants.getTaskList().size() "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lcom/huawei/logupload/c/c;->c()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 353
    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 355
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 356
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "lstUploadInfo.get(i).getTaskId() "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v2}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 358
    :cond_2
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "CommonConstants.getTaskList() "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/logupload/c/c;->c()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 360
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v1}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->c(Ljava/lang/String;)I

    move-result v13

    .line 363
    :cond_3
    const/4 v0, 0x1

    if-eq v13, v0, :cond_4

    const/4 v0, 0x2

    if-ne v13, v0, :cond_5

    .line 364
    :cond_4
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "taskId:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v2}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "status:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 365
    const/4 v6, 0x1

    .line 366
    goto/16 :goto_1

    .line 371
    :cond_5
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v0}, Lcom/huawei/logupload/LogUpload;->m()I

    move-result v14

    .line 372
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "uploadFlags "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "taskStatus"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 375
    and-int/lit8 v15, v14, 0x1

    .line 376
    and-int/lit8 v16, v14, 0x2

    .line 377
    and-int/lit8 v17, v14, 0x4

    .line 378
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "flagWifi "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "flag3g"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move/from16 v2, v16

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "flag2g"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move/from16 v2, v17

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 379
    invoke-static {}, Lcom/huawei/logupload/c/c;->f()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_7

    .line 381
    const/4 v0, 0x1

    if-ne v15, v0, :cond_9

    .line 384
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v0}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v0}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_6

    .line 385
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v0}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_6

    .line 387
    invoke-static {}, Lcom/huawei/logupload/c/i;->d()V

    .line 389
    :cond_6
    const/4 v6, 0x1

    .line 390
    const-string v0, "LogUpload Service"

    const-string v1, "Begin to start the thread..."

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 391
    new-instance v0, Lcom/huawei/logupload/c/i$a;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/logupload/c/i$a;-><init>(Landroid/os/Looper;)V

    move-object/from16 v18, v0

    .line 392
    move-object/from16 v0, v18

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/huawei/logupload/c/i$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v19

    .line 393
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v1, v19

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 394
    invoke-static {}, Lcom/huawei/logupload/LogUploadService;->a()I

    move-result v0

    move-object/from16 v1, v19

    iput v0, v1, Landroid/os/Message;->arg1:I

    .line 395
    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Lcom/huawei/logupload/c/i$a;->sendMessage(Landroid/os/Message;)Z

    .line 399
    goto :goto_1

    .line 400
    :cond_7
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "networkType "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/logupload/c/c;->f()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 403
    move/from16 v0, v16

    const/4 v1, 0x2

    if-eq v0, v1, :cond_8

    .line 404
    move/from16 v0, v17

    const/4 v1, 0x4

    if-ne v0, v1, :cond_9

    .line 405
    :cond_8
    const/4 v6, 0x1

    .line 406
    const-string v0, "LogUpload Service"

    const-string v1, "Begin to start the thread..."

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 407
    new-instance v0, Lcom/huawei/logupload/c/i$a;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/logupload/c/i$a;-><init>(Landroid/os/Looper;)V

    move-object/from16 v18, v0

    .line 408
    move-object/from16 v0, v18

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/huawei/logupload/c/i$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v19

    .line 409
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v1, v19

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 410
    invoke-static {}, Lcom/huawei/logupload/LogUploadService;->a()I

    move-result v0

    move-object/from16 v1, v19

    iput v0, v1, Landroid/os/Message;->arg1:I

    .line 411
    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Lcom/huawei/logupload/c/i$a;->sendMessage(Landroid/os/Message;)Z

    .line 320
    :cond_9
    :goto_1
    add-int/lit8 v8, v8, 0x1

    :goto_2
    if-lt v8, v7, :cond_0

    .line 418
    if-nez v6, :cond_b

    .line 419
    const-string v0, "LogUpload Service"

    const-string v1, "No task\uff0cstart to kill process!"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 420
    new-instance v8, Lcom/huawei/logupload/c/i$a;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v8, v0}, Lcom/huawei/logupload/c/i$a;-><init>(Landroid/os/Looper;)V

    .line 421
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lcom/huawei/logupload/c/i$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v9

    .line 422
    new-instance v10, Landroid/os/Bundle;

    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    .line 423
    const-string v0, "packagename"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/logupload/d;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 424
    invoke-virtual {v9, v10}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 425
    invoke-virtual {v8, v9}, Lcom/huawei/logupload/c/i$a;->sendMessage(Landroid/os/Message;)Z

    .line 429
    goto :goto_3

    .line 430
    :cond_a
    const-string v0, "LogUpload Service"

    const-string v1, "Start to kill process!"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 431
    new-instance v7, Lcom/huawei/logupload/c/i$a;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v7, v0}, Lcom/huawei/logupload/c/i$a;-><init>(Landroid/os/Looper;)V

    .line 432
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lcom/huawei/logupload/c/i$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v8

    .line 433
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 434
    const-string v0, "packagename"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/logupload/d;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 435
    invoke-virtual {v8, v9}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 436
    invoke-virtual {v7, v8}, Lcom/huawei/logupload/c/i$a;->sendMessage(Landroid/os/Message;)Z

    .line 439
    :cond_b
    :goto_3
    return-void
.end method
