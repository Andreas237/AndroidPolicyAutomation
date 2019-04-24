.class Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$4;
.super Lo/aaz$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)V
    .locals 0

    .line 236
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$4;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-direct {p0}, Lo/aaz$c;-><init>()V

    return-void
.end method


# virtual methods
.method public requestWearTask(Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 239
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestWearTask has been called"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the function name is "

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

    .line 241
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the parameters are "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "parameters"

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 242
    const-string v0, "parameters"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 243
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$1200()Ljava/util/Map;

    move-result-object v0

    const-string v1, "funcName"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwservicesmgr/remote/parser/IParser;

    .line 244
    if-nez v5, :cond_0

    .line 245
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 246
    const-string v0, "code"

    const-string v1, "100000"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    const-string v0, "value"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "funcName"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not found"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$100()Lo/aau;

    move-result-object v0

    invoke-interface {v0, v6}, Lo/aau;->a(Ljava/util/Map;)Z

    .line 249
    return-void

    .line 253
    :cond_0
    const-string v0, "syncFitnessDetailData"

    const-string v1, "funcName"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 254
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "user refresh data in health homePage.Agree to do coreSleep sync."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    new-instance v6, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.action.ACTION_HEALTH_MANUAL_DROP_DO_REFRESH"

    invoke-direct {v6, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 257
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$4;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$1000(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v6, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 260
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$4;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$1400(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$4$1;

    invoke-direct {v1, p0, v4, v5, p1}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$4$1;-><init>(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$4;Ljava/lang/String;Lcom/huawei/hwservicesmgr/remote/parser/IParser;Ljava/util/Map;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 286
    return-void
.end method
