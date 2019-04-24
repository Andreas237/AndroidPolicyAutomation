.class Lcom/huawei/qrcode/logic/ScanQrcodeManger$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/qrcode/logic/IEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/qrcode/logic/ScanQrcodeManger;->startAnalyzeQrcode(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/qrcode/logic/IScanQrcodeListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/qrcode/logic/ScanQrcodeManger;


# direct methods
.method constructor <init>(Lcom/huawei/qrcode/logic/ScanQrcodeManger;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger$2;->this$0:Lcom/huawei/qrcode/logic/ScanQrcodeManger;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEventCallBack(ILjava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ScanQrcodeManger onEventCallBack. type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger$2;->this$0:Lcom/huawei/qrcode/logic/ScanQrcodeManger;

    invoke-static {v0}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->access$100(Lcom/huawei/qrcode/logic/ScanQrcodeManger;)Lcom/huawei/qrcode/logic/IScanQrcodeListener;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const/16 v0, 0xfa5

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger$2;->this$0:Lcom/huawei/qrcode/logic/ScanQrcodeManger;

    invoke-static {v0}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->access$200(Lcom/huawei/qrcode/logic/ScanQrcodeManger;)V

    :cond_0
    return-void
.end method

.method public onEventNotify(Ljava/lang/Object;)V
    .locals 5

    move-object v2, p1

    check-cast v2, Lcom/huawei/qrcode/model/QrcodeAppInfo;

    new-instance v3, Landroid/content/Intent;

    const-string v0, "com.huawei.intent.action.QRCODE"

    invoke-direct {v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/huawei/qrcode/model/QrcodeAppInfo;->getQrcodeAppPackage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    const-string v0, "qrcode_intent_key"

    invoke-virtual {v2}, Lcom/huawei/qrcode/model/QrcodeAppInfo;->getQrcodeAppOperationInfo()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "intent_external_value"

    invoke-static {}, Lcom/huawei/qrcode/logic/ExternalValueManager;->getInstance()Lcom/huawei/qrcode/logic/ExternalValueManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/qrcode/logic/ExternalValueManager;->getExternalValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger$2;->this$0:Lcom/huawei/qrcode/logic/ScanQrcodeManger;

    invoke-static {v0}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->access$100(Lcom/huawei/qrcode/logic/ScanQrcodeManger;)Lcom/huawei/qrcode/logic/IScanQrcodeListener;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger$2;->this$0:Lcom/huawei/qrcode/logic/ScanQrcodeManger;

    invoke-static {v0}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->access$100(Lcom/huawei/qrcode/logic/ScanQrcodeManger;)Lcom/huawei/qrcode/logic/IScanQrcodeListener;

    move-result-object v0

    invoke-interface {v0, v3}, Lcom/huawei/qrcode/logic/IScanQrcodeListener;->onAnalyzeSuccessCallBack(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method
