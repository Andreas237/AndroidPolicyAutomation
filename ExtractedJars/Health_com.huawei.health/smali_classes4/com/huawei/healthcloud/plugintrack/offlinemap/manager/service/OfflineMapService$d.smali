.class Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$d;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;


# direct methods
.method private constructor <init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)V
    .locals 0

    .line 1633
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$d;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$2;)V
    .locals 0

    .line 1633
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$d;-><init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 1637
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 1638
    :cond_0
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "context or intent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1639
    return-void

    .line 1642
    :cond_1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 1643
    const-string v0, "android.location.PROVIDERS_CHANGED"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1644
    invoke-static {p1}, Lo/dhm;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1645
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$d;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->m(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)V

    goto :goto_0

    .line 1647
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$d;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->p(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)V

    .line 1650
    :cond_3
    :goto_0
    return-void
.end method
