.class Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Ljava/lang/String;)V
    .locals 0

    .line 1175
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$5;->d:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

    iput-object p2, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$5;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1179
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$5;->d:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->i(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Lcom/amap/api/maps/offlinemap/OfflineMapManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$5;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/offlinemap/OfflineMapManager;->remove(Ljava/lang/String;)V

    .line 1180
    return-void
.end method
