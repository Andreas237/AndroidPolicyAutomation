.class Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$18;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V
    .locals 0

    .line 1451
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$18;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public dispatchMessage(Landroid/os/Message;)V
    .locals 2

    .line 1454
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 1455
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$18;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    sget v1, Lcom/huawei/wallet/R$string;->huaweipay_loading:I

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->showLoadingDialog(I)V

    goto :goto_0

    .line 1456
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 1457
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$18;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->destroyLoadingDialog()V

    goto :goto_0

    .line 1458
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x3

    if-ne v1, v0, :cond_2

    .line 1459
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$18;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->bindCardInputNextStep()V

    .line 1461
    :cond_2
    :goto_0
    return-void
.end method
