.class Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)V
    .locals 0

    .line 320
    iput-object p1, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$8;->d:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 4

    .line 323
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$8;->d:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->c(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 324
    const-string v0, "WeatherReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mWeatherReportFlag is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$8;->d:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->c(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 325
    return-void

    .line 327
    :cond_0
    sget v0, Lcom/huawei/ui/device/R$id;->rb_celsius:I

    if-ne p2, v0, :cond_1

    .line 328
    const-string v0, "WeatherReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "rb_celsius is checked!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$8;->d:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->b(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Lo/enz;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/enz;->d(Z)V

    goto :goto_0

    .line 330
    :cond_1
    sget v0, Lcom/huawei/ui/device/R$id;->rb_fahrenheit:I

    if-ne p2, v0, :cond_2

    .line 331
    const-string v0, "WeatherReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "rb_fahrenheit is checked!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$8;->d:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->b(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Lo/enz;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/enz;->d(Z)V

    .line 334
    :cond_2
    :goto_0
    return-void
.end method
