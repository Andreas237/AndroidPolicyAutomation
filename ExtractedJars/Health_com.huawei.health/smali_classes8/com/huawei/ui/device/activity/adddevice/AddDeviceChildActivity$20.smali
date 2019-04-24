.class Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$20;
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
.field final synthetic a:Ljava/lang/String;

.field final synthetic e:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Ljava/lang/String;)V
    .locals 0

    .line 1841
    iput-object p1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$20;->e:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    iput-object p2, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$20;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1845
    new-instance v2, Lo/aev;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$20;->e:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-direct {v2, v0}, Lo/aev;-><init>(Landroid/content/Context;)V

    .line 1846
    const-string v0, "is_down_device"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Lo/aev;->d(Ljava/lang/String;Z)V

    .line 1847
    new-instance v3, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd hh:mm:ss"

    invoke-direct {v3, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 1848
    const-string v0, "is_download_device_time"

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v3, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lo/aev;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1849
    const-string v0, "device_download_dialog"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$20;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1850
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0}, Lo/afq;->a()V

    goto :goto_0

    .line 1851
    :cond_0
    const-string v0, "single_device_download_dialog"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$20;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1852
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/afq;->b(Ljava/util/ArrayList;)V

    .line 1854
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$20;->e:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->j(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 1855
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$20;->e:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->a(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Lo/egv;)Lo/egv;

    .line 1856
    return-void
.end method
