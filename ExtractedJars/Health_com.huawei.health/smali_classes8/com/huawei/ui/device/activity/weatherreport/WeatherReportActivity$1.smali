.class Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$1;
.super Lo/dbs;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->d([Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)V
    .locals 0

    .line 207
    iput-object p1, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$1;->c:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-direct {p0}, Lo/dbs;-><init>()V

    return-void
.end method


# virtual methods
.method public onDenied(Ljava/lang/String;)V
    .locals 4

    .line 215
    const-string v0, "WeatherReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestPermissions() permission onDenied()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    return-void
.end method

.method public onGranted()V
    .locals 4

    .line 210
    const-string v0, "WeatherReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestPermissions() permission onGranted()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 211
    return-void
.end method
