.class Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$4$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$4;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$4;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$4;)V
    .locals 0

    .line 127
    iput-object p1, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$4$3;->a:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$4$3;->a:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$4;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$4;->a:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->d(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)V

    .line 131
    return-void
.end method
