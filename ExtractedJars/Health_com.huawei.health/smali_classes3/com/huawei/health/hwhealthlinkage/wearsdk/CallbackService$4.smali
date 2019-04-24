.class Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;
.super Lo/aau$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;


# direct methods
.method constructor <init>(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)V
    .locals 0

    .line 145
    iput-object p1, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-direct {p0}, Lo/aau$e;-><init>()V

    return-void
.end method

.method private c()V
    .locals 9

    .line 176
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->e(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)[B

    move-result-object v4

    monitor-enter v4

    .line 177
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->f(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 178
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 179
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Map$Entry;

    .line 180
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$b;

    .line 181
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerRemoteCallback remoteFunctionData funcName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$b;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-virtual {v7}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$b;->d()Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 183
    goto :goto_0

    .line 184
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->f(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 185
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v8

    monitor-exit v4

    throw v8

    .line 186
    :goto_1
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;I)Ljava/util/Map;
    .locals 8

    .line 304
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->p(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/google/gson/Gson;

    move-result-object v0

    const-class v1, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    .line 305
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calling updateDateToSuggestion......"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 306
    invoke-static {}, Lo/yy;->b()Lo/yy;

    move-result-object v0

    invoke-virtual {v0, v4, p2}, Lo/yy;->e(Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;I)V

    .line 307
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calling getCurrentRunTime......"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 308
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->s()I

    move-result v5

    .line 309
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calling getPreRunTime......"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->n()I

    move-result v6

    .line 311
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 312
    const-string v0, "track_run_curenttime"

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    const-string v0, "track_run_pretime"

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    return-object v7
.end method

.method public a(Ljava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 399
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0, p1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->b(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 400
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUsedDeviceList the different device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 401
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->e(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)[B

    move-result-object v4

    monitor-enter v4

    .line 402
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->n(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 403
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 405
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0, p1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->c(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;Ljava/util/List;)Ljava/util/List;

    .line 406
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->m(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 407
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->m(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;

    .line 408
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setUsedDeviceListForHealth remoteFunctionData active = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getDeviceActiveState()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "connectstats  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getDeviceConnectState()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 409
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setUsedDeviceListForHealth remoteFunctionData deviceInfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 410
    invoke-virtual {v5}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    invoke-virtual {v5}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_2

    .line 411
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->e(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)[B

    move-result-object v6

    monitor-enter v6

    .line 412
    :try_start_1
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->n(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    .line 413
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 414
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/Map$Entry;

    .line 415
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$b;

    .line 416
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setUsedDeviceListForHealth remoteFunctionData funcName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$b;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "callback "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$b;->d()Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 417
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-virtual {v9}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$b;->d()Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 418
    goto :goto_2

    .line 419
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->n(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 420
    monitor-exit v6

    goto :goto_3

    :catchall_1
    move-exception v10

    monitor-exit v6

    throw v10

    .line 422
    :cond_2
    :goto_3
    goto/16 :goto_1

    .line 424
    :cond_3
    return-void
.end method

.method public a(Ljava/util/Map;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 209
    if-eqz p1, :cond_3

    .line 210
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onResponse called!!"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "funcName"

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 211
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->e(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)[B

    move-result-object v5

    monitor-enter v5

    .line 212
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->h(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "funcName"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 213
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 214
    :goto_0
    if-nez v4, :cond_0

    .line 215
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "oneTime callback iBaseResponseCallback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->i(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "funcName"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    .line 217
    if-eqz v5, :cond_0

    .line 218
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 219
    const-string v0, "code"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const-string v1, "value"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 220
    goto :goto_1

    .line 223
    :cond_0
    if-eqz v4, :cond_4

    .line 225
    const-string v0, "getRunPlanParameter"

    const-string v1, "funcName"

    :try_start_1
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 226
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "runplanlog onResponse value"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "value"

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "runplanlog onResponse code"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "code"

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    const-string v0, "value"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-class v1, Lcom/huawei/exercise/modle/RunPlanParameter;

    invoke-static {v0, v1}, Lo/cae;->d(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/exercise/modle/RunPlanParameter;

    .line 229
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "runplanlog onResponse getRun_plan_sync_size_sub:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/exercise/modle/RunPlanParameter;->getRun_plan_sync_size_sub()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 230
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->g(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "wear"

    invoke-virtual {v5}, Lcom/huawei/exercise/modle/RunPlanParameter;->getRun_plan_sync_size_sub()I

    move-result v2

    invoke-virtual {v5}, Lcom/huawei/exercise/modle/RunPlanParameter;->getRun_plan_sync_size_sub()I

    move-result v3

    add-int/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    :cond_1
    const-string v0, "getRunPlanParameterforhealth"

    const-string v1, "funcName"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 233
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "runplanlog onResponse health value"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "value"

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "runplanlog onResponse health code"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "code"

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    const-string v0, "value"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-class v1, Lcom/huawei/exercise/modle/RunPlanParameter;

    invoke-static {v0, v1}, Lo/cae;->d(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/exercise/modle/RunPlanParameter;

    .line 236
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "runplanlog onResponse health getRun_plan_sync_size_sub"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/exercise/modle/RunPlanParameter;->getRun_plan_sync_size_sub()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 237
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->g(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "health"

    invoke-virtual {v5}, Lcom/huawei/exercise/modle/RunPlanParameter;->getRun_plan_sync_size_sub()I

    move-result v2

    invoke-virtual {v5}, Lcom/huawei/exercise/modle/RunPlanParameter;->getRun_plan_sync_size_sub()I

    move-result v3

    add-int/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_1 .. :try_end_1} :catch_0

    .line 241
    :cond_2
    goto :goto_2

    .line 239
    :catch_0
    move-exception v5

    .line 240
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onResponse JsonSyntaxException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 242
    :goto_2
    const-string v0, "code"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const-string v1, "value"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_3

    .line 245
    :cond_3
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "obj is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    :cond_4
    :goto_3
    const/4 v0, 0x1

    return v0
.end method

.method public b(ILo/aas;)V
    .locals 5

    .line 382
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "calling getCommonData commandType:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 384
    const/4 v0, 0x1

    if-ne v0, p1, :cond_0

    .line 385
    :try_start_0
    new-instance v0, Lo/czp;

    invoke-direct {v0}, Lo/czp;-><init>()V

    invoke-virtual {v0}, Lo/czp;->c()Lcom/huawei/hwcommonmodel/datatypes/HealthSupportModel;

    move-result-object v4

    .line 386
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->p(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/google/gson/Gson;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p2, v1, v0}, Lo/aas;->a(ILjava/lang/String;)V

    .line 387
    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    if-ne v0, p1, :cond_1

    .line 388
    const-string v0, "false"

    const/4 v1, 0x0

    invoke-interface {p2, v1, v0}, Lo/aas;->a(ILjava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 392
    :cond_1
    :goto_0
    goto :goto_1

    .line 390
    :catch_0
    move-exception v4

    .line 391
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RemoteException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 394
    :goto_1
    return-void
.end method

.method public b(Lo/aaz;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 190
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unRegisterRemoteCallback:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->d(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/RemoteCallbackList;->unregister(Landroid/os/IInterface;)Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 195
    goto :goto_0

    .line 193
    :catch_0
    move-exception v4

    .line 194
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mCallbackList RuntimeException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    :goto_0
    :try_start_1
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->b(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/RemoteCallbackList;->unregister(Landroid/os/IInterface;)Z
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 200
    goto :goto_1

    .line 198
    :catch_1
    move-exception v4

    .line 199
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mCallbackListForHealth RuntimeException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    :goto_1
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 428
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "calling setDeviceCapabilityForHealth \uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 429
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    new-instance v2, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4$2;

    invoke-direct {v2, p0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4$2;-><init>(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;)V

    .line 430
    invoke-virtual {v2}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4$2;->getType()Ljava/lang/reflect/Type;

    move-result-object v2

    .line 429
    invoke-virtual {v1, p1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->d(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;Ljava/util/List;)Ljava/util/List;

    .line 431
    return-void
.end method

.method public c(Ljava/lang/String;Lo/aas;)V
    .locals 6

    .line 352
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "calling sendDataToHealth...... data"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 354
    :try_start_0
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 355
    new-instance v5, Landroid/content/ComponentName;

    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.ui.homewear21.intentservice.MessageCenterIntentService"

    invoke-direct {v5, v0, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 356
    invoke-virtual {v4, v5}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 357
    const-string v0, "data"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 358
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 359
    const-string v0, "success"

    const/4 v1, 0x0

    invoke-interface {p2, v1, v0}, Lo/aas;->a(ILjava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 362
    goto :goto_0

    .line 360
    :catch_0
    move-exception v4

    .line 361
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RemoteException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 363
    :goto_0
    return-void
.end method

.method public c(Ljava/lang/String;Lo/aaz;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 167
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerRemoteCallback called packageName:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    const-string v0, "com.huawei.health"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 169
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->e(Z)Z

    .line 170
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->b(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/os/RemoteCallbackList;->register(Landroid/os/IInterface;)Z

    .line 172
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->c()V

    .line 173
    return-void
.end method

.method public c(Lo/aas;)V
    .locals 5

    .line 338
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calling isHealthSupportWearDevice......"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 343
    const-string v0, "false"

    const/4 v1, 0x0

    :try_start_0
    invoke-interface {p1, v1, v0}, Lo/aas;->a(ILjava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 346
    goto :goto_0

    .line 344
    :catch_0
    move-exception v4

    .line 345
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RemoteException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    :goto_0
    return-void
.end method

.method public c(Lo/aax;)V
    .locals 5

    .line 326
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calling getDeviceList......"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    invoke-interface {p1, v0, v1}, Lo/aax;->b(II)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 331
    goto :goto_0

    .line 329
    :catch_0
    move-exception v4

    .line 330
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RemoteException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 334
    :goto_0
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 295
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "calling deviceCapability \uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 296
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->c(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 299
    goto :goto_0

    .line 297
    :catch_0
    move-exception v4

    .line 298
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 300
    :goto_0
    return-void
.end method

.method public d(Lo/aas;)V
    .locals 5

    .line 319
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calling unbindAllDevice......"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 320
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.action.delete.wear.device.list"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 321
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 322
    return-void
.end method

.method public d(Lo/aaz;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 148
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerRemoteCallback called callingApp:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u662f\u5426\u6210\u529f\u8fde\u63a5\u5230PhoneService"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    invoke-static {}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->h()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.huawei.bone"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 151
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->b(Z)Z

    .line 153
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "KEY_CONNECTION_TO_WEAR"

    const-string v3, "0"

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    move-result v5

    .line 154
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u4e0e\u7a7f\u6234App\u7ed1\u5b9a\u7684\u8fde\u63a5\u72b6\u6001\u662f\u5426\u5b58\u5165\u6210\u529f\uff08onbind\uff09 \uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->C(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 156
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->c(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)V

    .line 158
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->d(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/RemoteCallbackList;->register(Landroid/os/IInterface;)Z

    .line 162
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->c()V

    .line 163
    return-void
.end method

.method public e(Landroid/os/IBinder;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 252
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerBinder called "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    new-instance v4, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$a;

    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-direct {v4, v0, p1, p2, p3}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$a;-><init>(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;Landroid/os/IBinder;Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    const/4 v0, 0x0

    invoke-interface {p1, v4, v0}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V

    .line 256
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->k(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 257
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "remoteServerListener is called!!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->o(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 259
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->o(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const-string v1, "success"

    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 261
    :cond_0
    return-void
.end method

.method public e(Ljava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 265
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0, p1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 266
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUsedDeviceList the different device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->e(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)[B

    move-result-object v4

    monitor-enter v4

    .line 268
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->n(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 269
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 271
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0, p1}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->e(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;Ljava/util/List;)Ljava/util/List;

    .line 272
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->l(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 273
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->l(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;

    .line 274
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setUsedDeviceList remoteFunctionData active = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getDeviceActiveState()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "connectstats  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getDeviceConnectState()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setUsedDeviceList remoteFunctionData deviceInfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 276
    invoke-virtual {v5}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    invoke-virtual {v5}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_2

    .line 277
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->e(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)[B

    move-result-object v6

    monitor-enter v6

    .line 278
    :try_start_1
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->n(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    .line 279
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 280
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/Map$Entry;

    .line 281
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$b;

    .line 282
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setUsedDeviceList remoteFunctionData funcName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$b;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "callback "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$b;->d()Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 283
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-virtual {v9}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$b;->d()Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 284
    goto :goto_2

    .line 285
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService$4;->d:Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;

    invoke-static {v0}, Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;->n(Lcom/huawei/health/hwhealthlinkage/wearsdk/CallbackService;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 286
    monitor-exit v6

    goto :goto_3

    :catchall_1
    move-exception v10

    monitor-exit v6

    throw v10

    .line 288
    :cond_2
    :goto_3
    goto/16 :goto_1

    .line 290
    :cond_3
    return-void
.end method

.method public e(Lo/aax;)V
    .locals 7

    .line 368
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calling getDeviceListSize......"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 369
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2728

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "THE_WEAR_DEVICELIST_SIZE"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 370
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v4}, Lo/dbf;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v5

    .line 371
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "calling getDeviceList size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 373
    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p1, v0, v5}, Lo/aax;->b(II)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 376
    goto :goto_0

    .line 374
    :catch_0
    move-exception v6

    .line 375
    const-string v0, "HWhealthLinkage_CallbackService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RemoteException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 378
    :goto_0
    return-void
.end method
