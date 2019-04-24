.class Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->clearSingleUserInfo(Lo/acu;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;

.field final synthetic val$userUuid:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;Ljava/lang/String;)V
    .locals 0

    .line 356
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;

    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$1;->val$userUuid:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public operationResult(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Ljava/lang/String;Z)V
    .locals 4

    .line 359
    if-eqz p3, :cond_0

    .line 360
    const-string v0, "WiFiUserClearFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Clear userInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 361
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_clear_user_success:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 362
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$1;->val$userUuid:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;Ljava/lang/String;)V

    goto :goto_0

    .line 364
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 365
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;)Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 366
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->access$600(Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;)Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$1$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$1$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$1;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 375
    :cond_1
    :goto_0
    return-void
.end method

.method public bridge synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 356
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;

    invoke-virtual {p0, v0, p2, p3}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$1;->operationResult(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Ljava/lang/String;Z)V

    return-void
.end method
