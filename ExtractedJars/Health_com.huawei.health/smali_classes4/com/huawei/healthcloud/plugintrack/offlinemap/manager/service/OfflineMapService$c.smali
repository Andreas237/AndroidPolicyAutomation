.class Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$c;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private final d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)V
    .locals 1

    .line 833
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 834
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$c;->d:Ljava/lang/ref/WeakReference;

    .line 835
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8

    .line 840
    if-nez p2, :cond_0

    .line 842
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NetWorkBroadcastReceiver onReceive() intent null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 843
    return-void

    .line 845
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$c;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

    .line 846
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 848
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NetWorkBroadcastReceiver onReceive() service null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 849
    return-void

    .line 851
    :cond_1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v5

    .line 852
    const-string v0, "OfflineMapService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NetWorkBroadcastReceiver onReceive() action = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 853
    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 855
    invoke-static {p1}, Lo/cfu;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 857
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NetWorkBroadcastReceiver onReceive() network is wifi"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 858
    invoke-static {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->b(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/amap/api/maps/offlinemap/OfflineMapCity;

    .line 859
    invoke-virtual {v7}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getState()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    .line 860
    invoke-virtual {v7}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getCity()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Ljava/lang/String;)V

    .line 862
    :cond_2
    goto :goto_0

    :cond_3
    goto :goto_3

    .line 864
    :cond_4
    invoke-static {p1}, Lo/cfu;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 866
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NetWorkBroadcastReceiver onReceive() network is not wifi"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 867
    invoke-static {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->b(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/amap/api/maps/offlinemap/OfflineMapCity;

    .line 869
    invoke-virtual {v7}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getState()I

    move-result v0

    if-nez v0, :cond_5

    .line 871
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NetWorkBroadcastReceiver onReceive() network is not wifi pause loading"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 872
    invoke-static {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->i(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Lcom/amap/api/maps/offlinemap/OfflineMapManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amap/api/maps/offlinemap/OfflineMapManager;->pause()V

    .line 873
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_offlinemap_service_net_change:I

    invoke-static {v4, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;I)V

    .line 874
    goto :goto_2

    .line 876
    :cond_5
    goto :goto_1

    :cond_6
    :goto_2
    goto :goto_3

    .line 880
    :cond_7
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NetWorkBroadcastReceiver onReceive() no network"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 884
    :cond_8
    :goto_3
    return-void
.end method
