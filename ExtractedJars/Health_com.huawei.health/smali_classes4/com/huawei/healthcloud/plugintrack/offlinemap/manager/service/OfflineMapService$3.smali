.class Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->b(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Ljava/lang/String;

.field final synthetic e:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Ljava/lang/String;)V
    .locals 0

    .line 1192
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$3;->e:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

    iput-object p2, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$3;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1196
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$3;->e:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$3;->e:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->b(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->d(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    .line 1197
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$3;->e:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->l(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)V

    .line 1198
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$3;->e:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$3;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Ljava/lang/String;)V

    .line 1199
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$3;->e:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$3;->c:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->a(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Ljava/util/List;Ljava/lang/String;)V

    .line 1200
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$3;->e:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->o(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)V

    .line 1201
    return-void
.end method
