.class Lcom/huawei/hwservicesmgr/receiver/ScreenReceiver$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwservicesmgr/receiver/ScreenReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/huawei/hwservicesmgr/receiver/ScreenReceiver;

.field final synthetic d:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/receiver/ScreenReceiver;Ljava/lang/String;Landroid/content/Context;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/receiver/ScreenReceiver$2;->b:Lcom/huawei/hwservicesmgr/receiver/ScreenReceiver;

    iput-object p2, p0, Lcom/huawei/hwservicesmgr/receiver/ScreenReceiver$2;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/hwservicesmgr/receiver/ScreenReceiver$2;->d:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 32
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/receiver/ScreenReceiver$2;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hwservicesmgr/receiver/ScreenReceiver$2;->a:Ljava/lang/String;

    const-string v1, "android.intent.action.USER_PRESENT"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 34
    invoke-static {}, Lo/ddq;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 35
    const-string v0, "ScreenReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ScreenBroadcastReceiver : has device so start PhoneService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/hwservicesmgr/receiver/ScreenReceiver$2;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 37
    const-string v0, "android.intent.action.USER_PRESENT"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 38
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/receiver/ScreenReceiver$2;->d:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const-string v0, "ScreenReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ScreenBroadcastReceiver : have no device so do not need to start PhoneService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    :goto_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/receiver/ScreenReceiver$2;->b:Lcom/huawei/hwservicesmgr/receiver/ScreenReceiver;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/receiver/ScreenReceiver;->d(Lcom/huawei/hwservicesmgr/receiver/ScreenReceiver;)Landroid/os/HandlerThread;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->quit()V

    .line 44
    :cond_1
    return-void
.end method
