.class Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

.field e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)V
    .locals 1

    .line 307
    iput-object p1, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$b;->d:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 308
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$b;->e:Ljava/lang/ref/WeakReference;

    .line 309
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 313
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 314
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$b;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    .line 315
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 316
    return-void

    .line 318
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$b;->removeMessages(I)V

    .line 319
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$b;->d:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->a(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)Landroid/widget/Switch;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 320
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$b;->d:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->a(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)Landroid/widget/Switch;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setEnabled(Z)V

    .line 321
    const-string v0, "PressAutoMonitorActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mHandler mPressAutoMonitorFlag = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$b;->d:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->h(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$b;->d:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->a(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)Landroid/widget/Switch;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity$b;->d:Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;->h(Lcom/huawei/ui/device/activity/pressautomonitor/PressAutoMonitorActivity;)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 324
    :cond_1
    return-void
.end method
