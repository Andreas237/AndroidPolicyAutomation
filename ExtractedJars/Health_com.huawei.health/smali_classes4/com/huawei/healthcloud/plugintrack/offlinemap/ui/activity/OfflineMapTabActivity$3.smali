.class Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$3;
.super Lo/dbs;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;)V
    .locals 0

    .line 248
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$3;->a:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;

    invoke-direct {p0}, Lo/dbs;-><init>()V

    return-void
.end method


# virtual methods
.method public onDenied(Ljava/lang/String;)V
    .locals 0

    .line 257
    return-void
.end method

.method public onGranted()V
    .locals 4

    .line 251
    const-string v0, "OfflineMapTabActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onGranted()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 253
    return-void
.end method
