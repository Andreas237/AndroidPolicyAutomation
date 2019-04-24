.class Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)V
    .locals 0

    .line 771
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$1;->d:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 775
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$1;->d:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->d(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Ljava/util/ArrayList;

    move-result-object v4

    .line 776
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$1;->d:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

    invoke-static {v0, v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->d(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v5

    .line 777
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$1;->d:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

    invoke-static {v0, v5}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->c(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Ljava/util/ArrayList;)Z

    move-result v6

    .line 778
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$1;->d:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->k(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cfv;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v7

    .line 779
    const-string v0, "OfflineMapService"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startStopServiceThread() mExtenalStatus : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$1;->d:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

    .line 781
    invoke-static {v2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->g(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " ,isLoading : "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 783
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " ,isTopActivity : "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 785
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 779
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 786
    if-eqz v7, :cond_0

    .line 788
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$1;->d:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->a(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Z)Z

    .line 789
    return-void

    .line 791
    :cond_0
    if-nez v6, :cond_1

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$1;->d:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->g(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;->a:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    if-eq v0, v1, :cond_1

    .line 793
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$1;->d:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->h(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;

    move-result-object v0

    const/16 v1, 0x6b

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;->sendEmptyMessage(I)Z

    .line 795
    :cond_1
    return-void
.end method
