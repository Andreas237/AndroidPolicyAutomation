.class Lcom/huawei/operation/jsoperation/StressService$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/jsoperation/StressService;->checkConnected(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/operation/jsoperation/StressService;

.field final synthetic val$functionRes:Ljava/lang/String;

.field final synthetic val$web:Lcom/huawei/operation/activity/WebViewActivity;


# direct methods
.method constructor <init>(Lcom/huawei/operation/jsoperation/StressService;Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;)V
    .locals 0

    .line 270
    iput-object p1, p0, Lcom/huawei/operation/jsoperation/StressService$8;->this$0:Lcom/huawei/operation/jsoperation/StressService;

    iput-object p2, p0, Lcom/huawei/operation/jsoperation/StressService$8;->val$web:Lcom/huawei/operation/activity/WebViewActivity;

    iput-object p3, p0, Lcom/huawei/operation/jsoperation/StressService$8;->val$functionRes:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 273
    iget-object v0, p0, Lcom/huawei/operation/jsoperation/StressService$8;->val$web:Lcom/huawei/operation/activity/WebViewActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/operation/jsoperation/StressService$8;->val$web:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-virtual {v0}, Lcom/huawei/operation/activity/WebViewActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 274
    :cond_0
    return-void

    .line 277
    :cond_1
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 278
    const-string v0, "monitor_type"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 279
    iget-object v0, p0, Lcom/huawei/operation/jsoperation/StressService$8;->val$web:Lcom/huawei/operation/activity/WebViewActivity;

    iget-object v1, p0, Lcom/huawei/operation/jsoperation/StressService$8;->val$functionRes:Ljava/lang/String;

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, p1, v2}, Lcom/huawei/operation/jsoperation/JsUtil;->runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 283
    goto :goto_0

    .line 280
    :catch_0
    move-exception v4

    .line 281
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkConnected"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 282
    iget-object v0, p0, Lcom/huawei/operation/jsoperation/StressService$8;->val$web:Lcom/huawei/operation/activity/WebViewActivity;

    iget-object v1, p0, Lcom/huawei/operation/jsoperation/StressService$8;->val$functionRes:Ljava/lang/String;

    invoke-static {v0, v1, p1, p2}, Lcom/huawei/operation/jsoperation/JsUtil;->runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V

    .line 284
    :goto_0
    return-void
.end method
