.class public Lcom/huawei/hwfitnessmgr/receiver/SendDataToDeviceBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 34
    invoke-static {}, Lo/dbf;->q()Z

    move-result v0

    if-nez v0, :cond_0

    .line 35
    return-void

    .line 37
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 38
    const-string v0, "SendDataToDeviceBroadcastReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SendDataToDeviceBroadcastReceiver onReceive action() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 40
    :cond_1
    return-void

    .line 42
    :goto_0
    const-string v0, "com.huawei.bone.ACTION_RECEIVE_SEND_HEART_CONFIG"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 43
    invoke-static {p1}, Lo/dez;->c(Landroid/content/Context;)Lo/dez;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwfitnessmgr/receiver/SendDataToDeviceBroadcastReceiver$4;

    invoke-direct {v1, p0}, Lcom/huawei/hwfitnessmgr/receiver/SendDataToDeviceBroadcastReceiver$4;-><init>(Lcom/huawei/hwfitnessmgr/receiver/SendDataToDeviceBroadcastReceiver;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/dez;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    goto :goto_1

    .line 52
    :cond_2
    const-string v0, "com.huawei.bone.ACTION_RECEIVE_SEND_SPORT_GOAL"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 53
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v4

    .line 54
    new-instance v0, Lcom/huawei/hwfitnessmgr/receiver/SendDataToDeviceBroadcastReceiver$1;

    invoke-direct {v0, p0, p1}, Lcom/huawei/hwfitnessmgr/receiver/SendDataToDeviceBroadcastReceiver$1;-><init>(Lcom/huawei/hwfitnessmgr/receiver/SendDataToDeviceBroadcastReceiver;Landroid/content/Context;)V

    invoke-interface {v4, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 61
    :cond_3
    :goto_1
    return-void
.end method
