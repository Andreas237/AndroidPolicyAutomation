.class Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$7$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$7;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$7;

.field final synthetic b:Z


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$7;Z)V
    .locals 0

    .line 305
    iput-object p1, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$7$3;->a:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$7;

    iput-boolean p2, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$7$3;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 308
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$7$3;->b:Z

    if-eqz v0, :cond_0

    .line 309
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$7$3;->a:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$7;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$7;->b:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->a(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Landroid/widget/RadioButton;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 310
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$7$3;->a:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$7;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$7;->b:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->e(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Landroid/widget/RadioButton;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto :goto_0

    .line 312
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$7$3;->a:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$7;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$7;->b:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->a(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Landroid/widget/RadioButton;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 313
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$7$3;->a:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$7;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$7;->b:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->e(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Landroid/widget/RadioButton;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 316
    :goto_0
    return-void
.end method
