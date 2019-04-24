.class Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;)V
    .locals 1

    .line 461
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 462
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$a;->a:Ljava/lang/ref/WeakReference;

    .line 463
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    .line 468
    if-nez p2, :cond_0

    .line 470
    const-string v0, "OfflineMapTabActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyBroadcastReceiver onReceive() intent null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 471
    return-void

    .line 473
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;

    .line 474
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 476
    const-string v0, "OfflineMapTabActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyBroadcastReceiver onReceive() activity null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 477
    return-void

    .line 479
    :cond_1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v5

    .line 480
    const-string v0, "OfflineMapTabActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyBroadcastReceiver onReceive() action :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 482
    const-string v0, "ACTION_MAP_ONDOWNLOAD_SA"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->b(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 485
    invoke-static {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->e(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;

    move-result-object v0

    const/16 v1, 0x64

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, p2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v6

    .line 486
    invoke-static {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->e(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;->sendMessage(Landroid/os/Message;)Z

    .line 487
    goto/16 :goto_0

    .line 488
    :cond_2
    const-string v0, "ACTION_REFRESH_ACTIVITY_SA"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 490
    invoke-static {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->e(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;

    move-result-object v0

    const/16 v1, 0x64

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, p2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v6

    .line 491
    invoke-static {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->e(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;->sendMessage(Landroid/os/Message;)Z

    .line 492
    goto :goto_0

    .line 493
    :cond_3
    const-string v0, "ACTION_INIT_ACTIVITY_SA"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 496
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->b(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;Z)Z

    .line 497
    invoke-static {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->e(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;

    move-result-object v0

    const/16 v1, 0x64

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, p2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v6

    .line 498
    invoke-static {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->e(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;->sendMessage(Landroid/os/Message;)Z

    .line 499
    goto :goto_0

    .line 500
    :cond_4
    const-string v0, "ACTION_MAP_ONREMOVE_SA"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 503
    invoke-static {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->e(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;

    move-result-object v0

    const/16 v1, 0x64

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, p2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v6

    .line 504
    invoke-static {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->e(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;->sendMessage(Landroid/os/Message;)Z

    .line 505
    goto :goto_0

    .line 506
    :cond_5
    const-string v0, "ACTION_MAP_LOAD_WAIT_SUCCESS_SA"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 509
    invoke-static {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->e(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;

    move-result-object v0

    const/16 v1, 0x64

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, p2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v6

    .line 510
    invoke-static {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->e(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;->sendMessage(Landroid/os/Message;)Z

    .line 512
    :cond_6
    :goto_0
    return-void
.end method
