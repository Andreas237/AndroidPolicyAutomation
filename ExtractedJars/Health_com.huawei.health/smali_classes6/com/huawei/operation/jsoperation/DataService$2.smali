.class Lcom/huawei/operation/jsoperation/DataService$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cme;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/jsoperation/DataService;->registerDataClient(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/jsoperation/JsCommandOption;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/operation/jsoperation/DataService;

.field final synthetic val$functionRes:Ljava/lang/String;

.field final synthetic val$web:Lcom/huawei/operation/activity/WebViewActivity;


# direct methods
.method constructor <init>(Lcom/huawei/operation/jsoperation/DataService;Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;)V
    .locals 0

    .line 156
    iput-object p1, p0, Lcom/huawei/operation/jsoperation/DataService$2;->this$0:Lcom/huawei/operation/jsoperation/DataService;

    iput-object p2, p0, Lcom/huawei/operation/jsoperation/DataService$2;->val$web:Lcom/huawei/operation/activity/WebViewActivity;

    iput-object p3, p0, Lcom/huawei/operation/jsoperation/DataService$2;->val$functionRes:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Lcom/huawei/hihealth/HiHealthClient;)V
    .locals 4

    .line 159
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 160
    const-string v0, "Opera_DataService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerDataClient onResult:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthClient;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    const-string v0, "Opera_DataService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerDataClient onResult:client.getHiDeviceInfo().toString() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthClient;->getHiDeviceInfo()Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/hihealth/HiDeviceInfo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    iget-object v0, p0, Lcom/huawei/operation/jsoperation/DataService$2;->val$web:Lcom/huawei/operation/activity/WebViewActivity;

    iget-object v1, p0, Lcom/huawei/operation/jsoperation/DataService$2;->val$functionRes:Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/operation/jsoperation/JsUtil;->runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_0

    .line 164
    :cond_0
    const-string v0, "Opera_DataService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cannot registerDataClient to HiHealth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    iget-object v0, p0, Lcom/huawei/operation/jsoperation/DataService$2;->val$web:Lcom/huawei/operation/activity/WebViewActivity;

    iget-object v1, p0, Lcom/huawei/operation/jsoperation/DataService$2;->val$functionRes:Ljava/lang/String;

    const/16 v2, 0x3e9

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/operation/jsoperation/JsUtil;->runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V

    .line 168
    :goto_0
    return-void
.end method
