.class Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aff;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V
    .locals 1

    .line 1682
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1683
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$d;->a:Ljava/lang/ref/WeakReference;

    .line 1684
    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/String;)V
    .locals 3

    .line 1688
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$d;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    .line 1689
    if-eqz v1, :cond_1

    .line 1690
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_0

    .line 1692
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v2

    .line 1693
    const/4 v0, 0x1

    iput v0, v2, Landroid/os/Message;->what:I

    .line 1694
    iput-object p2, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1695
    invoke-static {v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->f(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;->sendMessage(Landroid/os/Message;)Z

    .line 1698
    :cond_0
    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    .line 1699
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v2

    .line 1700
    const/4 v0, 0x2

    iput v0, v2, Landroid/os/Message;->what:I

    .line 1701
    iput-object p2, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1702
    invoke-static {v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->f(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;->sendMessage(Landroid/os/Message;)Z

    .line 1705
    :cond_1
    return-void
.end method
