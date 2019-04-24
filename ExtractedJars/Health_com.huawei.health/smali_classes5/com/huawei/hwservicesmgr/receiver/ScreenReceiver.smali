.class public Lcom/huawei/hwservicesmgr/receiver/ScreenReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field private a:Landroid/os/Handler;

.field private d:Landroid/os/HandlerThread;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 14
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 17
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "ScreenReceiver"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/receiver/ScreenReceiver;->d:Landroid/os/HandlerThread;

    .line 18
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/receiver/ScreenReceiver;->a:Landroid/os/Handler;

    return-void
.end method

.method static synthetic d(Lcom/huawei/hwservicesmgr/receiver/ScreenReceiver;)Landroid/os/HandlerThread;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/receiver/ScreenReceiver;->d:Landroid/os/HandlerThread;

    return-object v0
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 22
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 23
    const-string v0, "ScreenReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceive(): intent is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 24
    return-void

    .line 26
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 27
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/receiver/ScreenReceiver;->d:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 28
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/receiver/ScreenReceiver;->d:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/receiver/ScreenReceiver;->a:Landroid/os/Handler;

    .line 29
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/receiver/ScreenReceiver;->a:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/hwservicesmgr/receiver/ScreenReceiver$2;

    invoke-direct {v1, p0, v4, p1}, Lcom/huawei/hwservicesmgr/receiver/ScreenReceiver$2;-><init>(Lcom/huawei/hwservicesmgr/receiver/ScreenReceiver;Ljava/lang/String;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 47
    return-void
.end method
