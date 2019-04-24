.class Lcom/huawei/qrcode/logic/ScanQrcodeManger$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/qrcode/logic/IEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/qrcode/logic/ScanQrcodeManger;->startScanQrcode(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/String;Lcom/huawei/qrcode/logic/IScanQrcodeListener;)V
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

    iput-object p1, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger$1;->this$0:Lcom/huawei/qrcode/logic/ScanQrcodeManger;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEventCallBack(ILjava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger$1;->this$0:Lcom/huawei/qrcode/logic/ScanQrcodeManger;

    invoke-static {v0}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->access$100(Lcom/huawei/qrcode/logic/ScanQrcodeManger;)Lcom/huawei/qrcode/logic/IScanQrcodeListener;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    const/16 v0, 0xfa5

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger$1;->this$0:Lcom/huawei/qrcode/logic/ScanQrcodeManger;

    invoke-static {v0}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->access$200(Lcom/huawei/qrcode/logic/ScanQrcodeManger;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger$1;->this$0:Lcom/huawei/qrcode/logic/ScanQrcodeManger;

    invoke-static {}, Lcom/huawei/qrcode/logic/ExternalValueManager;->getInstance()Lcom/huawei/qrcode/logic/ExternalValueManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/qrcode/logic/ExternalValueManager;->getExternalValue()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, p1, p2, v1}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->access$300(Lcom/huawei/qrcode/logic/ScanQrcodeManger;ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string v0, "ScanQrcodeManger startScanQrcode mScanCodeListener is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    :goto_0
    return-void
.end method

.method public onEventNotify(Ljava/lang/Object;)V
    .locals 2

    const-string v0, "ScanQrcodeManger onEventNotify."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    return-void
.end method
