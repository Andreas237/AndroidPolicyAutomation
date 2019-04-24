.class Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V
    .locals 1

    .line 396
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 398
    if-eqz p1, :cond_0

    .line 399
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$d;->c:Ljava/lang/ref/WeakReference;

    .line 401
    :cond_0
    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 12

    .line 406
    const-string v0, "DeviceStateCallback"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "err_code:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " objData:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 408
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$d;->c:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_3

    .line 409
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$d;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    .line 411
    if-eqz v4, :cond_3

    .line 413
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_2

    .line 415
    :sswitch_0
    move-object v0, p2

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 416
    const-string v0, "DeviceStateCallback"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GET_FIT_RUN_COURSE_INFO receive:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 417
    const v0, 0x186a0

    if-ne v0, v5, :cond_0

    .line 418
    const-string v0, "DeviceStateCallback"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "push success!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 419
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->i(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/os/Handler;

    move-result-object v6

    .line 420
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v7

    .line 421
    invoke-virtual {v6, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 422
    goto/16 :goto_3

    :cond_0
    const v0, 0x1a1fb

    if-ne v0, v5, :cond_3

    .line 423
    const-string v0, "DeviceStateCallback"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "course exceed the limit!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 424
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->i(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/os/Handler;

    move-result-object v6

    .line 425
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v7

    .line 426
    invoke-virtual {v6, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 427
    goto/16 :goto_3

    .line 430
    :sswitch_1
    move-object v0, p2

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 431
    const-string v0, "DeviceStateCallback"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PUSH_FIT_RUN_COURSE_DATA receive:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 432
    const/4 v0, -0x1

    if-eq v0, v6, :cond_3

    .line 434
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->c(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;I)V

    .line 435
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->i(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/os/Handler;

    move-result-object v7

    .line 436
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v8

    .line 437
    const/4 v0, 0x1

    iput v0, v8, Landroid/os/Message;->arg1:I

    .line 438
    invoke-virtual {v7, v8}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 439
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Z)Z

    .line 440
    goto :goto_3

    .line 443
    :sswitch_2
    move-object v0, p2

    check-cast v0, [Ljava/lang/String;

    move-object v7, v0

    check-cast v7, [Ljava/lang/String;

    .line 444
    if-eqz v7, :cond_2

    array-length v0, v7

    if-eqz v0, :cond_2

    .line 445
    move-object v8, v7

    array-length v9, v8

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v9, :cond_1

    aget-object v11, v8, v10

    .line 446
    invoke-static {v4, v11}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Ljava/lang/String;)Ljava/lang/String;

    .line 445
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_1
    goto :goto_1

    .line 449
    :cond_2
    const-string v0, "DeviceStateCallback"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GET_DEVICE_FONT_DATA failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 451
    :goto_1
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->m()V

    .line 452
    goto :goto_3

    .line 455
    :goto_2
    const-string v0, "DeviceStateCallback"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "COMMAND_ID not found!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 460
    :cond_3
    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_2
        0xc -> :sswitch_1
        0xd -> :sswitch_0
    .end sparse-switch
.end method
