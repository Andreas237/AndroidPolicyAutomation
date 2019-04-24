.class Lcom/huawei/operation/jsoperation/DataService$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/jsoperation/DataService;->selectMotionPathData(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/operation/jsoperation/DataService;

.field final synthetic val$activity:Lcom/huawei/operation/activity/WebViewActivity;

.field final synthetic val$functionRes:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/operation/jsoperation/DataService;Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;)V
    .locals 0

    .line 417
    iput-object p1, p0, Lcom/huawei/operation/jsoperation/DataService$8;->this$0:Lcom/huawei/operation/jsoperation/DataService;

    iput-object p2, p0, Lcom/huawei/operation/jsoperation/DataService$8;->val$activity:Lcom/huawei/operation/activity/WebViewActivity;

    iput-object p3, p0, Lcom/huawei/operation/jsoperation/DataService$8;->val$functionRes:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 420
    const-string v0, "Opera_DataService"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "motion path err_code = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",objData = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 421
    const/16 v0, 0x3e9

    if-eq p1, v0, :cond_0

    const/16 v0, 0x7cf

    if-eq p1, v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 422
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/jsoperation/DataService$8;->val$activity:Lcom/huawei/operation/activity/WebViewActivity;

    iget-object v1, p0, Lcom/huawei/operation/jsoperation/DataService$8;->val$functionRes:Ljava/lang/String;

    const-string v2, "null"

    invoke-static {v0, v1, p1, v2}, Lcom/huawei/operation/jsoperation/JsUtil;->runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V

    .line 423
    return-void

    .line 426
    :cond_1
    const-string v0, "Opera_DataService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "objData = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 428
    iget-object v0, p0, Lcom/huawei/operation/jsoperation/DataService$8;->val$activity:Lcom/huawei/operation/activity/WebViewActivity;

    iget-object v1, p0, Lcom/huawei/operation/jsoperation/DataService$8;->val$functionRes:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, p1, v2}, Lcom/huawei/operation/jsoperation/JsUtil;->runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V

    .line 429
    return-void
.end method
