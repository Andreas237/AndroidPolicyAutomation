.class Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->unBindDevice(Ljava/lang/String;)V
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
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)V
    .locals 0

    .line 406
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public operationResult(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Ljava/lang/String;Z)V
    .locals 7

    .line 408
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unBindDevice :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 409
    if-nez p3, :cond_2

    .line 410
    const/16 v4, 0x7cf

    .line 411
    const-string v5, "unknown error"

    .line 412
    if-eqz p1, :cond_0

    .line 413
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;->getResultCode()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 414
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;->getResultDesc()Ljava/lang/String;

    move-result-object v5

    .line 416
    :cond_0
    const v0, 0x6acfc00

    if-eq v0, v4, :cond_1

    .line 417
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v6

    .line 418
    const/4 v0, 0x5

    iput v0, v6, Landroid/os/Message;->what:I

    .line 419
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)I

    move-result v0

    iput v0, v6, Landroid/os/Message;->arg1:I

    .line 420
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$1700(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;->sendMessage(Landroid/os/Message;)Z

    .line 422
    :cond_1
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " unBindDevice error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",resultDesc:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 424
    :cond_2
    return-void
.end method

.method public bridge synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 406
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;

    invoke-virtual {p0, v0, p2, p3}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$4;->operationResult(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Ljava/lang/String;Z)V

    return-void
.end method
