.class Lcom/huawei/operation/jsoperation/DataService$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cma;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/jsoperation/DataService;->insertHealthData(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/jsoperation/JsCommandOption;)V
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

    .line 109
    iput-object p1, p0, Lcom/huawei/operation/jsoperation/DataService$1;->this$0:Lcom/huawei/operation/jsoperation/DataService;

    iput-object p2, p0, Lcom/huawei/operation/jsoperation/DataService$1;->val$web:Lcom/huawei/operation/activity/WebViewActivity;

    iput-object p3, p0, Lcom/huawei/operation/jsoperation/DataService$1;->val$functionRes:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/Object;)V
    .locals 4

    .line 112
    const-string v0, "Opera_DataService"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertHealthData onResult type="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " obj="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    if-nez p1, :cond_0

    .line 114
    const-string v0, "Opera_DataService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertThirdPartServiceDataToHiHealth success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    iget-object v0, p0, Lcom/huawei/operation/jsoperation/DataService$1;->val$web:Lcom/huawei/operation/activity/WebViewActivity;

    iget-object v1, p0, Lcom/huawei/operation/jsoperation/DataService$1;->val$functionRes:Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/operation/jsoperation/JsUtil;->runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_0

    .line 117
    :cond_0
    const-string v0, "Opera_DataService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertThirdPartServiceDataToHiHealth not correct obj="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    iget-object v0, p0, Lcom/huawei/operation/jsoperation/DataService$1;->val$web:Lcom/huawei/operation/activity/WebViewActivity;

    iget-object v1, p0, Lcom/huawei/operation/jsoperation/DataService$1;->val$functionRes:Ljava/lang/String;

    const/16 v2, 0x3e9

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/operation/jsoperation/JsUtil;->runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V

    .line 121
    :goto_0
    return-void
.end method
