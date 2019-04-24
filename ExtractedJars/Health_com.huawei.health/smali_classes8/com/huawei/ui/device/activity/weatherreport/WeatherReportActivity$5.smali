.class Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->b()V
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

    .line 158
    iput-object p1, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$5;->b:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 161
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$5;->b:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_homewear_turn_on_location_services_tip:I

    const/16 v2, 0x66

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->a(II)V

    .line 162
    return-void
.end method
