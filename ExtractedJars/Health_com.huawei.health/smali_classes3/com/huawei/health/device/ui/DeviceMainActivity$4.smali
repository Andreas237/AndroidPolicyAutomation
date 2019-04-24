.class Lcom/huawei/health/device/ui/DeviceMainActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/DeviceMainActivity;->d(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/device/ui/DeviceMainActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/DeviceMainActivity;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lcom/huawei/health/device/ui/DeviceMainActivity$4;->a:Lcom/huawei/health/device/ui/DeviceMainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 154
    new-instance v4, Lo/aev;

    iget-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity$4;->a:Lcom/huawei/health/device/ui/DeviceMainActivity;

    invoke-direct {v4, v0}, Lo/aev;-><init>(Landroid/content/Context;)V

    .line 155
    const-string v0, "is_down_device"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Lo/aev;->d(Ljava/lang/String;Z)V

    .line 156
    new-instance v5, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd hh:mm:ss"

    invoke-direct {v5, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 157
    const-string v0, "is_download_device_time"

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v5, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lo/aev;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    iget-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity$4;->a:Lcom/huawei/health/device/ui/DeviceMainActivity;

    invoke-static {v0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->c(Lcom/huawei/health/device/ui/DeviceMainActivity;)Lo/egv;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 159
    iget-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity$4;->a:Lcom/huawei/health/device/ui/DeviceMainActivity;

    invoke-static {v0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->c(Lcom/huawei/health/device/ui/DeviceMainActivity;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 160
    iget-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity$4;->a:Lcom/huawei/health/device/ui/DeviceMainActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/DeviceMainActivity;->a(Lcom/huawei/health/device/ui/DeviceMainActivity;Lo/egv;)Lo/egv;

    .line 161
    iget-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity$4;->a:Lcom/huawei/health/device/ui/DeviceMainActivity;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->onBackPressed()V

    goto :goto_0

    .line 163
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMainActivity showDialog setNegativeButton downloadDialog = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    :goto_0
    return-void
.end method
