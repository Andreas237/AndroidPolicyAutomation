.class Lcom/huawei/logupload/j;
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
.field final synthetic a:Lcom/huawei/logupload/UploadReceiver;


# direct methods
.method constructor <init>(Lcom/huawei/logupload/UploadReceiver;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/huawei/logupload/j;->a:Lcom/huawei/logupload/UploadReceiver;

    .line 344
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 20

    .line 346
    const/4 v4, 0x0

    .line 348
    new-instance v5, Lcom/huawei/logupload/a/c;

    invoke-static {}, Lcom/huawei/logupload/UploadReceiver;->a()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v5, v0}, Lcom/huawei/logupload/a/c;-><init>(Landroid/content/Context;)V

    .line 349
    sget-object v6, Lcom/huawei/logupload/c/c;->D:Ljava/lang/Object;

    monitor-enter v6

    .line 351
    :try_start_0
    invoke-static {v5}, Lcom/huawei/logupload/a/a;->a(Lcom/huawei/logupload/a/c;)Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v4

    .line 349
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v6

    throw v0

    .line 354
    :goto_0
    const/4 v6, 0x0

    .line 356
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_10

    .line 358
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v7

    .line 359
    const/4 v8, 0x0

    goto/16 :goto_4

    .line 360
    :cond_0
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v0}, Lcom/huawei/logupload/LogUpload;->B()J

    move-result-wide v9

    .line 361
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/logupload/j;->a:Lcom/huawei/logupload/UploadReceiver;

    invoke-static {v0}, Lcom/huawei/logupload/UploadReceiver;->a(Lcom/huawei/logupload/UploadReceiver;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "startTime="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 362
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    .line 363
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/logupload/j;->a:Lcom/huawei/logupload/UploadReceiver;

    invoke-static {v0}, Lcom/huawei/logupload/UploadReceiver;->a(Lcom/huawei/logupload/UploadReceiver;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "currentTimeMillis="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 365
    sub-long v0, v11, v9

    const-wide/32 v2, 0xf731400

    cmp-long v0, v0, v2

    if-ltz v0, :cond_4

    .line 366
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/logupload/j;->a:Lcom/huawei/logupload/UploadReceiver;

    invoke-static {v0}, Lcom/huawei/logupload/UploadReceiver;->a(Lcom/huawei/logupload/UploadReceiver;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Begin to delete the task..."

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 369
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/logupload/LogUpload;

    .line 371
    invoke-static {v13}, Lcom/huawei/logupload/c/i;->a(Lcom/huawei/logupload/LogUpload;)V

    .line 374
    invoke-virtual {v13}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v14

    .line 375
    const-string v0, "com.huawei.lcagent"

    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 376
    const-string v0, "com.huawei.hidp"

    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 377
    const-string v0, "com.huawei.imonitor"

    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 378
    :cond_1
    invoke-static {}, Lcom/huawei/logupload/UploadReceiver;->a()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v13, v1}, Lcom/huawei/logupload/c/i;->a(Landroid/content/Context;Lcom/huawei/logupload/LogUpload;Z)V

    .line 379
    goto :goto_1

    .line 381
    :cond_2
    invoke-static {}, Lcom/huawei/logupload/c/c;->i()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    .line 382
    new-instance v15, Landroid/content/Intent;

    invoke-direct {v15}, Landroid/content/Intent;-><init>()V

    .line 384
    invoke-virtual {v15, v14}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 385
    const-string v0, "com.example.logupload.progressSmall"

    invoke-virtual {v15, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 386
    const-string v0, "mLogUploadInfo"

    invoke-virtual {v15, v0, v13}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 389
    invoke-static {}, Lcom/huawei/logupload/UploadReceiver;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v15}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 391
    goto :goto_1

    .line 394
    :cond_3
    new-instance v15, Landroid/content/Intent;

    const-string v0, "com.huawei.phoneservice.AUTOUPLOAD_DELETE"

    invoke-direct {v15, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 395
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    const-string v1, "com.huawei.feedback.component.AutoUploadService"

    invoke-virtual {v15, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 397
    const-string v0, "isuploadsuccess"

    const/4 v1, 0x0

    invoke-virtual {v15, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 398
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0, v15}, Landroid/app/Application;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 404
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V

    .line 405
    sget-object v15, Lcom/huawei/logupload/c/c;->D:Ljava/lang/Object;

    monitor-enter v15

    .line 407
    :try_start_1
    invoke-static {v5, v13}, Lcom/huawei/logupload/a/a;->b(Lcom/huawei/logupload/a/c;Lcom/huawei/logupload/LogUpload;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 405
    monitor-exit v15

    goto/16 :goto_3

    :catchall_1
    move-exception v0

    monitor-exit v15

    throw v0

    .line 414
    :cond_4
    const/4 v13, 0x0

    .line 415
    invoke-static {}, Lcom/huawei/logupload/c/c;->c()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {}, Lcom/huawei/logupload/c/c;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 416
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/logupload/j;->a:Lcom/huawei/logupload/UploadReceiver;

    invoke-static {v0}, Lcom/huawei/logupload/UploadReceiver;->a(Lcom/huawei/logupload/UploadReceiver;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "CommonConstants.getTaskList() "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/logupload/c/c;->c()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 417
    const-string v2, "lstUploadInfo.get(i) "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 416
    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 418
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 419
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/logupload/j;->a:Lcom/huawei/logupload/UploadReceiver;

    invoke-static {v0}, Lcom/huawei/logupload/UploadReceiver;->a(Lcom/huawei/logupload/UploadReceiver;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "lstUploadInfo.get(i).getTaskId() "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v2}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 422
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

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

    .line 425
    :cond_6
    const/4 v0, 0x1

    if-eq v13, v0, :cond_7

    const/4 v0, 0x2

    if-ne v13, v0, :cond_8

    .line 426
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/logupload/j;->a:Lcom/huawei/logupload/UploadReceiver;

    invoke-static {v0}, Lcom/huawei/logupload/UploadReceiver;->a(Lcom/huawei/logupload/UploadReceiver;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "taskId:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

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

    .line 427
    const/4 v6, 0x1

    .line 428
    goto/16 :goto_3

    .line 433
    :cond_8
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v0}, Lcom/huawei/logupload/LogUpload;->m()I

    move-result v14

    .line 434
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/logupload/j;->a:Lcom/huawei/logupload/UploadReceiver;

    invoke-static {v0}, Lcom/huawei/logupload/UploadReceiver;->a(Lcom/huawei/logupload/UploadReceiver;)Ljava/lang/String;

    move-result-object v0

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

    .line 437
    and-int/lit8 v15, v14, 0x1

    .line 438
    and-int/lit8 v16, v14, 0x2

    .line 439
    and-int/lit8 v17, v14, 0x4

    .line 440
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/logupload/j;->a:Lcom/huawei/logupload/UploadReceiver;

    invoke-static {v0}, Lcom/huawei/logupload/UploadReceiver;->a(Lcom/huawei/logupload/UploadReceiver;)Ljava/lang/String;

    move-result-object v0

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

    .line 441
    invoke-static {}, Lcom/huawei/logupload/c/c;->f()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_a

    .line 443
    const/4 v0, 0x1

    if-ne v15, v0, :cond_e

    .line 446
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v0}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v0}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_9

    .line 447
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v0}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_9

    .line 449
    invoke-static {}, Lcom/huawei/logupload/c/i;->d()V

    .line 451
    :cond_9
    const/4 v6, 0x1

    .line 452
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/logupload/j;->a:Lcom/huawei/logupload/UploadReceiver;

    invoke-static {v0}, Lcom/huawei/logupload/UploadReceiver;->a(Lcom/huawei/logupload/UploadReceiver;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Begin to start the thread..."

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 453
    new-instance v0, Lcom/huawei/logupload/c/i$a;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/logupload/c/i$a;-><init>(Landroid/os/Looper;)V

    move-object/from16 v18, v0

    .line 454
    move-object/from16 v0, v18

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/huawei/logupload/c/i$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v19

    .line 455
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v1, v19

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 456
    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Lcom/huawei/logupload/c/i$a;->sendMessage(Landroid/os/Message;)Z

    .line 460
    goto/16 :goto_3

    .line 461
    :cond_a
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/logupload/j;->a:Lcom/huawei/logupload/UploadReceiver;

    invoke-static {v0}, Lcom/huawei/logupload/UploadReceiver;->a(Lcom/huawei/logupload/UploadReceiver;)Ljava/lang/String;

    move-result-object v0

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

    .line 462
    invoke-static {}, Lcom/huawei/logupload/c/c;->f()I

    move-result v0

    if-nez v0, :cond_c

    .line 464
    invoke-static {}, Lcom/huawei/logupload/c/i;->e()V

    .line 466
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/logupload/j;->a:Lcom/huawei/logupload/UploadReceiver;

    invoke-static {v0}, Lcom/huawei/logupload/UploadReceiver;->a(Lcom/huawei/logupload/UploadReceiver;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "myPid: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 467
    invoke-static {}, Lcom/huawei/logupload/c/c;->i()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_b

    .line 469
    new-instance v18, Landroid/content/Intent;

    invoke-direct/range {v18 .. v18}, Landroid/content/Intent;-><init>()V

    .line 470
    .line 471
    const-string v0, "com.example.logupload.progress"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 472
    invoke-static {}, Lcom/huawei/logupload/UploadReceiver;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 474
    const-string v0, "exception"

    const-string v1, "1"

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 475
    const-string v0, "exception"

    const-string v1, "1"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 476
    invoke-static {}, Lcom/huawei/logupload/UploadReceiver;->a()Landroid/content/Context;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 477
    goto :goto_2

    .line 480
    :cond_b
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.huawei.phoneservice.AUTOUPLOAD_DELETE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    move-object/from16 v18, v0

    .line 481
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    const-string v1, "com.huawei.feedback.component.AutoUploadService"

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 483
    const-string v0, "isuploadsuccess"

    move-object/from16 v1, v18

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 484
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/app/Application;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 488
    :goto_2
    invoke-static {}, Lcom/huawei/logupload/c/c;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 489
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/logupload/c/c;->a(I)V

    .line 491
    const/4 v0, -0x1

    invoke-static {v0}, Lcom/huawei/logupload/c/c;->c(I)V

    .line 492
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/logupload/c/c;->b(I)V

    .line 494
    const/16 v0, -0x64

    invoke-static {v0}, Lcom/huawei/logupload/UploadReceiver;->a(I)V

    .line 501
    :cond_c
    move/from16 v0, v16

    const/4 v1, 0x2

    if-eq v0, v1, :cond_d

    .line 502
    move/from16 v0, v17

    const/4 v1, 0x4

    if-ne v0, v1, :cond_e

    .line 503
    :cond_d
    const/4 v6, 0x1

    .line 504
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/logupload/j;->a:Lcom/huawei/logupload/UploadReceiver;

    invoke-static {v0}, Lcom/huawei/logupload/UploadReceiver;->a(Lcom/huawei/logupload/UploadReceiver;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Begin to start the thread..."

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 505
    new-instance v0, Lcom/huawei/logupload/c/i$a;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/logupload/c/i$a;-><init>(Landroid/os/Looper;)V

    move-object/from16 v18, v0

    .line 506
    move-object/from16 v0, v18

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/huawei/logupload/c/i$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v19

    .line 507
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v1, v19

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 508
    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Lcom/huawei/logupload/c/i$a;->sendMessage(Landroid/os/Message;)Z

    .line 359
    :cond_e
    :goto_3
    add-int/lit8 v8, v8, 0x1

    :goto_4
    if-lt v8, v7, :cond_0

    .line 515
    if-nez v6, :cond_12

    .line 516
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/logupload/j;->a:Lcom/huawei/logupload/UploadReceiver;

    invoke-static {v0}, Lcom/huawei/logupload/UploadReceiver;->a(Lcom/huawei/logupload/UploadReceiver;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "No task\uff0cstart to kill process!"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 521
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/logupload/j;->a:Lcom/huawei/logupload/UploadReceiver;

    invoke-static {v0}, Lcom/huawei/logupload/UploadReceiver;->a(Lcom/huawei/logupload/UploadReceiver;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "myPid: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 522
    invoke-static {}, Lcom/huawei/logupload/c/c;->i()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_f

    .line 524
    new-instance v8, Landroid/content/Intent;

    invoke-direct {v8}, Landroid/content/Intent;-><init>()V

    .line 525
    .line 526
    const-string v0, "com.example.logupload.progress"

    invoke-virtual {v8, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 527
    invoke-static {}, Lcom/huawei/logupload/UploadReceiver;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 529
    const-string v0, "exception"

    const-string v1, "1"

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 530
    const-string v0, "exception"

    const-string v1, "1"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 531
    invoke-static {}, Lcom/huawei/logupload/UploadReceiver;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 533
    goto :goto_5

    .line 536
    :cond_f
    new-instance v8, Landroid/content/Intent;

    const-string v0, "com.huawei.phoneservice.AUTOUPLOAD_DELETE"

    invoke-direct {v8, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 537
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    const-string v1, "com.huawei.feedback.component.AutoUploadService"

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 539
    const-string v0, "isuploadsuccess"

    const/4 v1, 0x0

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 540
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/app/Application;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 543
    :goto_5
    invoke-static {}, Lcom/huawei/logupload/c/c;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 544
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/logupload/c/c;->a(I)V

    .line 546
    const/4 v0, -0x1

    invoke-static {v0}, Lcom/huawei/logupload/c/c;->c(I)V

    .line 547
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/logupload/c/c;->b(I)V

    .line 549
    const/16 v0, -0x64

    invoke-static {v0}, Lcom/huawei/logupload/UploadReceiver;->a(I)V

    .line 556
    goto/16 :goto_7

    .line 557
    :cond_10
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/logupload/j;->a:Lcom/huawei/logupload/UploadReceiver;

    invoke-static {v0}, Lcom/huawei/logupload/UploadReceiver;->a(Lcom/huawei/logupload/UploadReceiver;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Start to kill process!"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 563
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/logupload/j;->a:Lcom/huawei/logupload/UploadReceiver;

    invoke-static {v0}, Lcom/huawei/logupload/UploadReceiver;->a(Lcom/huawei/logupload/UploadReceiver;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "myPid: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 564
    invoke-static {}, Lcom/huawei/logupload/c/c;->i()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_11

    .line 566
    new-instance v7, Landroid/content/Intent;

    invoke-direct {v7}, Landroid/content/Intent;-><init>()V

    .line 567
    .line 568
    const-string v0, "com.example.logupload.progress"

    invoke-virtual {v7, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 569
    invoke-static {}, Lcom/huawei/logupload/UploadReceiver;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 570
    const-string v0, "exception"

    const-string v1, "1"

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 572
    const-string v0, "exception"

    const-string v1, "1"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 573
    invoke-static {}, Lcom/huawei/logupload/UploadReceiver;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 575
    goto :goto_6

    .line 578
    :cond_11
    new-instance v7, Landroid/content/Intent;

    const-string v0, "com.huawei.phoneservice.AUTOUPLOAD_DELETE"

    invoke-direct {v7, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 579
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    const-string v1, "com.huawei.feedback.component.AutoUploadService"

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 581
    const-string v0, "isuploadsuccess"

    const/4 v1, 0x0

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 582
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/app/Application;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 585
    :goto_6
    invoke-static {}, Lcom/huawei/logupload/c/c;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 586
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/logupload/c/c;->a(I)V

    .line 588
    const/4 v0, -0x1

    invoke-static {v0}, Lcom/huawei/logupload/c/c;->c(I)V

    .line 589
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/logupload/c/c;->b(I)V

    .line 591
    const/16 v0, -0x64

    invoke-static {v0}, Lcom/huawei/logupload/UploadReceiver;->a(I)V

    .line 597
    :cond_12
    :goto_7
    return-void
.end method
