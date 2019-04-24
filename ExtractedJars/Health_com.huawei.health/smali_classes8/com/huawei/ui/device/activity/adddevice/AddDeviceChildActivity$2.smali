.class Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V
    .locals 0

    .line 247
    iput-object p1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$2;->b:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 250
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$2;->b:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 251
    if-eqz v2, :cond_0

    const-string v0, "com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity"

    invoke-virtual {v2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 252
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$2;->b:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->a(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    goto :goto_0

    .line 254
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$2;->b:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->finish()V

    .line 256
    :goto_0
    return-void
.end method
