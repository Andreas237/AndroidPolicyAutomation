.class Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

.field c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)V
    .locals 1

    .line 415
    iput-object p1, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$a;->a:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 416
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$a;->c:Ljava/lang/ref/WeakReference;

    .line 417
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 421
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 422
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$a;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    .line 423
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 424
    return-void

    .line 426
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$a;->removeMessages(I)V

    .line 427
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$a;->a:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->f(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Landroid/widget/Switch;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setEnabled(Z)V

    .line 428
    const-string v0, "WeatherReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mHandler mWeatherReportFlag = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$a;->a:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->c(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 429
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$a;->a:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->f(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Landroid/widget/Switch;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$a;->a:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->c(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 430
    return-void
.end method
