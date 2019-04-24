.class Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->setStressReportStatus(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;

.field final synthetic val$callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 192
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;

    iput-object p2, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$1;->val$callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 7

    .line 195
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->access$000(Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;)Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$MyStressHandler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->access$000(Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;)Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$MyStressHandler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$MyStressHandler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 196
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->access$000(Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;)Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$MyStressHandler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$MyStressHandler;->removeMessages(I)V

    .line 198
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p2, :cond_3

    .line 199
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stress open onResponse,objData = "

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

    .line 200
    move-object v0, p2

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 201
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 203
    const-string v0, "type"

    const/4 v1, 0x1

    :try_start_0
    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 204
    const v0, 0x186a0

    if-ne v4, v0, :cond_1

    .line 205
    const-string v0, "result_code"

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    goto :goto_0

    .line 207
    :cond_1
    const-string v0, "result_code"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 211
    :goto_0
    goto :goto_1

    .line 209
    :catch_0
    move-exception v6

    .line 210
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stress open fail,"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    :goto_1
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stress open call back data = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$1;->val$callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 214
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$1;->val$callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "setStressReportStatus"

    invoke-static {v1, v2}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_2

    .line 216
    :cond_2
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stress open call back is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    :cond_3
    :goto_2
    return-void
.end method
