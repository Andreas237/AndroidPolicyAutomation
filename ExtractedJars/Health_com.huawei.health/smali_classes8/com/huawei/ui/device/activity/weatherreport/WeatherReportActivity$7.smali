.class Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)V
    .locals 0

    .line 288
    iput-object p1, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$7;->b:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 291
    const-string v0, "WeatherReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WEATHER_SWITCH_UNIT_STATUS err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 292
    const/4 v4, 0x1

    .line 293
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 294
    move-object v5, p2

    check-cast v5, Ljava/lang/String;

    .line 295
    const-string v0, "false"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 296
    const/4 v4, 0x0

    .line 298
    :cond_0
    goto :goto_0

    .line 299
    :cond_1
    invoke-static {}, Lo/cxh;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 300
    const/4 v4, 0x0

    .line 303
    :cond_2
    :goto_0
    const-string v0, "WeatherReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WEATHER_SWITCH_UNIT_STATUS enable = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 304
    move v5, v4

    .line 305
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$7;->b:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    new-instance v1, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$7$3;

    invoke-direct {v1, p0, v5}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$7$3;-><init>(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$7;Z)V

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 318
    return-void
.end method
