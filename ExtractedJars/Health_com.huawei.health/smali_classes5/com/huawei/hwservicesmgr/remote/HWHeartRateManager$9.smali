.class Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;)V
    .locals 0

    .line 696
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$9;->this$0:Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 699
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stressAlgorithmCallback onResponse"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 700
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 701
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->access$100()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    monitor-enter v4

    .line 702
    :try_start_0
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->access$100()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 703
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stressAlgorithmCallback onResponse mDeviceStressCallbackList back,objdata = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 704
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->access$100()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "notificationStressInfo"

    .line 705
    invoke-static {p2, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 704
    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 708
    :cond_0
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 710
    :cond_1
    :goto_0
    return-void
.end method
