.class Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$18;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->i(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V
    .locals 0

    .line 1858
    iput-object p1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$18;->d:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1861
    new-instance v2, Lo/aev;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$18;->d:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-direct {v2, v0}, Lo/aev;-><init>(Landroid/content/Context;)V

    .line 1862
    const-string v0, "is_down_device"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Lo/aev;->d(Ljava/lang/String;Z)V

    .line 1863
    new-instance v3, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd hh:mm:ss"

    invoke-direct {v3, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 1864
    const-string v0, "is_download_device_time"

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v3, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lo/aev;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1865
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$18;->d:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->j(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 1866
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$18;->d:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->a(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Lo/egv;)Lo/egv;

    .line 1867
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$18;->d:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->finish()V

    .line 1868
    return-void
.end method
