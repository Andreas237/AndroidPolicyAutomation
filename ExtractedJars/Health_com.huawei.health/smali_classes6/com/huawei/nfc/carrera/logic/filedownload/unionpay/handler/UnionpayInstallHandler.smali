.class public Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayInstallHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# static fields
.field public static final SING_UNEQUAL:I = -0x1


# instance fields
.field private WRONG_SIGN_TIP:Ljava/lang/String;

.field private callback:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInstallCallBack;


# direct methods
.method public constructor <init>(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInstallCallBack;)V
    .locals 1

    .line 28
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 24
    const-string v0, "wrong signature"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayInstallHandler;->WRONG_SIGN_TIP:Ljava/lang/String;

    .line 29
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayInstallHandler;->callback:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInstallCallBack;

    .line 30
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 35
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 36
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayInstallHandler;->callback:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInstallCallBack;

    if-nez v0, :cond_0

    .line 38
    const-string v0, "install callback is null \uff0cyou need excute registeListeners()  method  before download() method"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 39
    return-void

    .line 42
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 45
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayInstallHandler;->callback:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInstallCallBack;

    const/16 v1, -0x7d1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInstallCallBack;->installFailed(ILjava/lang/String;)V

    .line 46
    goto :goto_1

    .line 49
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayInstallHandler;->callback:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInstallCallBack;

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInstallCallBack;->installSuccess()V

    .line 50
    goto :goto_1

    .line 52
    :sswitch_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayInstallHandler;->callback:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInstallCallBack;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayInstallHandler;->WRONG_SIGN_TIP:Ljava/lang/String;

    const/4 v2, -0x1

    invoke-interface {v0, v2, v1}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInstallCallBack;->installFailed(ILjava/lang/String;)V

    .line 53
    goto :goto_1

    .line 55
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayInstallHandler;->callback:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInstallCallBack;

    iget v1, p1, Landroid/os/Message;->what:I

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInstallCallBack;->installFailed(ILjava/lang/String;)V

    .line 58
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7d1 -> :sswitch_0
        -0x1 -> :sswitch_2
        0x1 -> :sswitch_1
    .end sparse-switch
.end method

.method public sendFailedMessage()V
    .locals 1

    .line 71
    const/16 v0, -0x7d1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayInstallHandler;->sendEmptyMessage(I)Z

    .line 72
    return-void
.end method

.method public sendWrongSignMessage()V
    .locals 1

    .line 64
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayInstallHandler;->sendEmptyMessage(I)Z

    .line 65
    return-void
.end method

.method public unregisterListener()V
    .locals 1

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayInstallHandler;->callback:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInstallCallBack;

    .line 79
    return-void
.end method
