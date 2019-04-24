.class Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$MyIResourceFileListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aff;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MyIResourceFileListener"
.end annotation


# instance fields
.field weakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;)V
    .locals 1

    .line 449
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 450
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$MyIResourceFileListener;->weakReference:Ljava/lang/ref/WeakReference;

    .line 451
    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/String;)V
    .locals 4

    .line 456
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$MyIResourceFileListener;->weakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;

    .line 457
    if-eqz v1, :cond_2

    .line 458
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_1

    .line 460
    const-string v0, "group"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 461
    const/4 v0, 0x1

    invoke-static {v1, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->access$702(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;Z)Z

    .line 462
    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->access$800(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;)Ljava/lang/Runnable;

    move-result-object v0

    invoke-static {v0}, Lo/ahj;->c(Ljava/lang/Runnable;)V

    .line 463
    return-void

    .line 465
    :cond_0
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v2

    .line 466
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v3

    .line 467
    const/4 v0, 0x1

    iput v0, v3, Landroid/os/Message;->what:I

    .line 468
    iput-object v2, v3, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 469
    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->access$900(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 472
    :cond_1
    const/4 v0, -0x1

    if-ne p1, v0, :cond_2

    .line 473
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v2

    .line 474
    const/4 v0, 0x2

    iput v0, v2, Landroid/os/Message;->what:I

    .line 475
    iput-object p2, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 476
    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->access$900(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 479
    :cond_2
    return-void
.end method
