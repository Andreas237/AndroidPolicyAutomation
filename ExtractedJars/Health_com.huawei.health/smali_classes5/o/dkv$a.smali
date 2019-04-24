.class Lo/dkv$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dkv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# direct methods
.method constructor <init>(Landroid/os/Looper;)V
    .locals 0

    .line 389
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 390
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 9

    .line 394
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 395
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/huawei/datatype/TransferTaskInfo;

    .line 396
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_5

    .line 398
    :pswitch_0
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GPS\u8fd4\u56de"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 399
    iget v0, p1, Landroid/os/Message;->arg1:I

    const v1, 0x19643

    if-ne v1, v0, :cond_0

    .line 400
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u4e2d\u65ad\u8fd4\u56de\u7684\u9519\u8bef\u7801\u6682\u4e0d\u5904\u7406"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_5

    .line 402
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/datatype/TransferTaskInfo;->getObject1()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/yg;

    .line 403
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v4}, Lcom/huawei/datatype/TransferTaskInfo;->getObject2()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Lo/yg;->onResponse(ILjava/lang/Object;)V

    .line 405
    goto/16 :goto_5

    .line 408
    :pswitch_1
    :try_start_0
    invoke-virtual {v4}, Lcom/huawei/datatype/TransferTaskInfo;->getObject1()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/djv;

    .line 409
    const/4 v0, 0x0

    if-eq v0, v5, :cond_7

    .line 410
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u7cbe\u7ec6\u5316\u7761\u7720\u8fd4\u56de"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 411
    const-string v6, ""

    .line 412
    const-string v7, ""

    .line 413
    const-string v8, ""

    .line 414
    iget v0, p1, Landroid/os/Message;->arg1:I

    const/16 v1, 0x2710

    if-ne v1, v0, :cond_3

    .line 415
    invoke-virtual {v4}, Lcom/huawei/datatype/TransferTaskInfo;->getObject2()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 416
    invoke-virtual {v4}, Lcom/huawei/datatype/TransferTaskInfo;->getObject2()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 418
    :cond_1
    invoke-virtual {v4}, Lcom/huawei/datatype/TransferTaskInfo;->getObject3()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 419
    invoke-virtual {v4}, Lcom/huawei/datatype/TransferTaskInfo;->getObject3()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 421
    :cond_2
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-interface {v5, v0, v6, v7}, Lo/djv;->onSuccess(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 422
    :cond_3
    iget v0, p1, Landroid/os/Message;->arg1:I

    const/16 v1, 0x4e20

    if-ne v1, v0, :cond_4

    .line 423
    iget v0, p1, Landroid/os/Message;->arg2:I

    const/4 v1, 0x0

    invoke-interface {v5, v0, v1}, Lo/djv;->onProgress(ILjava/lang/String;)V

    goto :goto_0

    .line 424
    :cond_4
    iget v0, p1, Landroid/os/Message;->arg1:I

    const v1, 0x19643

    if-ne v1, v0, :cond_5

    .line 425
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u79d1\u5b66\u7761\u7720\u4e2d\u65ad\u8fd4\u56de\u7684\u9519\u8bef\u7801\u6682\u4e0d\u5904\u7406"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 427
    :cond_5
    invoke-virtual {v4}, Lcom/huawei/datatype/TransferTaskInfo;->getObject2()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 428
    invoke-virtual {v4}, Lcom/huawei/datatype/TransferTaskInfo;->getObject2()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    .line 430
    :cond_6
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-interface {v5, v0, v8}, Lo/djv;->onFailure(ILjava/lang/String;)V

    .line 432
    :goto_0
    goto :goto_1

    .line 433
    :cond_7
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u7cbe\u7ec6\u5316\u7761\u7720\u8fd4\u56de sleepCallback = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 438
    :goto_1
    goto/16 :goto_5

    .line 435
    :catch_0
    move-exception v5

    .line 436
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u7cbe\u7ec6\u5316\u7761\u7720\u8fd4\u56de \u5f02\u5e38 e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 437
    invoke-static {}, Lcom/huawei/hwfitnessmgr/receiver/SyncFitnessDetailDataBroadcastReceiver;->b()V

    .line 439
    goto/16 :goto_5

    .line 442
    :pswitch_2
    :try_start_1
    invoke-virtual {v4}, Lcom/huawei/datatype/TransferTaskInfo;->getObject1()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/djv;

    .line 443
    const/4 v0, 0x0

    if-eq v0, v5, :cond_b

    .line 444
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u53ef\u7ef4\u53ef\u6d4b\u8fd4\u56de"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 445
    iget v0, p1, Landroid/os/Message;->arg1:I

    const/16 v1, 0x2710

    if-ne v1, v0, :cond_8

    .line 446
    iget v0, p1, Landroid/os/Message;->arg1:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v5, v0, v1, v2}, Lo/djv;->onSuccess(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 447
    :cond_8
    iget v0, p1, Landroid/os/Message;->arg1:I

    const/16 v1, 0x4e21

    if-ne v1, v0, :cond_9

    .line 448
    iget v0, p1, Landroid/os/Message;->arg2:I

    invoke-virtual {v4}, Lcom/huawei/datatype/TransferTaskInfo;->getObject2()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Lo/djv;->onProgress(ILjava/lang/String;)V

    goto :goto_2

    .line 449
    :cond_9
    iget v0, p1, Landroid/os/Message;->arg1:I

    const v1, 0x19643

    if-ne v1, v0, :cond_a

    .line 450
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u4e2d\u65ad\u8fd4\u56de\u7684\u9519\u8bef\u7801\u6682\u4e0d\u5904\u7406DFX"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 452
    :cond_a
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v4}, Lcom/huawei/datatype/TransferTaskInfo;->getObject2()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Lo/djv;->onFailure(ILjava/lang/String;)V

    goto :goto_2

    .line 455
    :cond_b
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u53ef\u7ef4\u53ef\u6d4b\u8fd4\u56de dfxCallback = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 459
    :goto_2
    goto/16 :goto_5

    .line 457
    :catch_1
    move-exception v5

    .line 458
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u53ef\u7ef4\u53ef\u6d4b\u8fd4\u56de \u5f02\u5e38 e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 460
    goto/16 :goto_5

    .line 463
    :pswitch_3
    :try_start_2
    invoke-virtual {v4}, Lcom/huawei/datatype/TransferTaskInfo;->getObject1()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/djv;

    .line 464
    const/4 v0, 0x0

    if-eq v0, v5, :cond_10

    .line 465
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5468\u671fRRI\u6587\u4ef6\u8fd4\u56de"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 466
    const-string v6, ""

    .line 467
    const-string v7, ""

    .line 468
    const-string v8, ""

    .line 469
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "msg.arg1 \uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 470
    iget v0, p1, Landroid/os/Message;->arg1:I

    const/16 v1, 0x2710

    if-ne v1, v0, :cond_e

    .line 471
    invoke-virtual {v4}, Lcom/huawei/datatype/TransferTaskInfo;->getObject2()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_c

    .line 472
    invoke-virtual {v4}, Lcom/huawei/datatype/TransferTaskInfo;->getObject2()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 474
    :cond_c
    invoke-virtual {v4}, Lcom/huawei/datatype/TransferTaskInfo;->getObject3()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_d

    .line 475
    invoke-virtual {v4}, Lcom/huawei/datatype/TransferTaskInfo;->getObject3()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 477
    :cond_d
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dataPath : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "   statePath : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 478
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-interface {v5, v0, v6, v7}, Lo/djv;->onSuccess(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    .line 480
    :cond_e
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u540c\u6b65\u5931\u8d25 \uff1acode "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 481
    invoke-virtual {v4}, Lcom/huawei/datatype/TransferTaskInfo;->getObject2()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_f

    .line 482
    invoke-virtual {v4}, Lcom/huawei/datatype/TransferTaskInfo;->getObject2()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    .line 484
    :cond_f
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u540c\u6b65\u5931\u8d25 \uff1amsg2 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 485
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-interface {v5, v0, v8}, Lo/djv;->onFailure(ILjava/lang/String;)V

    .line 487
    :goto_3
    goto :goto_4

    .line 488
    :cond_10
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5468\u671fRRI\u6587\u4ef6\u8fd4\u56de sleepCallback = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    .line 493
    :goto_4
    goto :goto_5

    .line 490
    :catch_2
    move-exception v5

    .line 491
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5468\u671fRRI\u6587\u4ef6\u8fd4\u56de \u5f02\u5e38 e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 492
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->getmInstance()Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->notifyOtherSyncTask()V

    .line 494
    .line 498
    :goto_5
    :pswitch_4
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method
