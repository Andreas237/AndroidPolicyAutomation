.class Lcom/huawei/operation/jsoperation/StressService$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/jsoperation/StressService;->calibrationControl(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/adapter/PluginOperationAdapter;Lcom/huawei/operation/jsoperation/JsCommandOption;)V
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

    .line 162
    iput-object p1, p0, Lcom/huawei/operation/jsoperation/StressService$3;->this$0:Lcom/huawei/operation/jsoperation/StressService;

    iput-object p2, p0, Lcom/huawei/operation/jsoperation/StressService$3;->val$web:Lcom/huawei/operation/activity/WebViewActivity;

    iput-object p3, p0, Lcom/huawei/operation/jsoperation/StressService$3;->val$functionRes:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 2

    .line 165
    iget-object v0, p0, Lcom/huawei/operation/jsoperation/StressService$3;->val$web:Lcom/huawei/operation/activity/WebViewActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/operation/jsoperation/StressService$3;->val$web:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-virtual {v0}, Lcom/huawei/operation/activity/WebViewActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 166
    :cond_0
    return-void

    .line 168
    :cond_1
    iget-object v0, p0, Lcom/huawei/operation/jsoperation/StressService$3;->val$web:Lcom/huawei/operation/activity/WebViewActivity;

    iget-object v1, p0, Lcom/huawei/operation/jsoperation/StressService$3;->val$functionRes:Ljava/lang/String;

    invoke-static {v0, v1, p1, p2}, Lcom/huawei/operation/jsoperation/JsUtil;->runJsFunc(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;ILjava/lang/Object;)V

    .line 169
    return-void
.end method
