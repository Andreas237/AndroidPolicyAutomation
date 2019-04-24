.class Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$c;
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
    name = "c"
.end annotation


# instance fields
.field d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V
    .locals 1

    .line 2523
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2524
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$c;->d:Ljava/lang/ref/WeakReference;

    .line 2525
    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 8

    .line 2529
    const-string v0, "TrainDetail"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkDeviceSportStatus: onResponse "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2530
    const v0, 0x186a0

    if-ne p1, v0, :cond_2

    if-eqz p2, :cond_2

    .line 2532
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    move-object v1, p2

    check-cast v1, Ljava/lang/String;

    const-class v2, Lcom/huawei/datatype/OperatorStatus;

    invoke-virtual {v0, v1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/datatype/OperatorStatus;

    .line 2533
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$c;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    .line 2534
    if-eqz v5, :cond_1

    invoke-static {v5}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->i(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2535
    invoke-static {v5}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->i(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/os/Handler;

    move-result-object v6

    .line 2536
    invoke-virtual {v4}, Lcom/huawei/datatype/OperatorStatus;->getTrain_monitor_state()I

    move-result v0

    if-nez v0, :cond_0

    .line 2538
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not running"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2539
    const/16 v0, 0x66

    invoke-virtual {v6, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v7

    .line 2540
    invoke-virtual {v6, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 2541
    goto :goto_0

    .line 2543
    :cond_0
    const/16 v0, 0x67

    invoke-virtual {v6, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v7

    .line 2544
    invoke-virtual {v6, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 2547
    :goto_0
    goto :goto_1

    .line 2548
    :cond_1
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "activity or handler is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2553
    :cond_2
    :goto_1
    return-void
.end method
