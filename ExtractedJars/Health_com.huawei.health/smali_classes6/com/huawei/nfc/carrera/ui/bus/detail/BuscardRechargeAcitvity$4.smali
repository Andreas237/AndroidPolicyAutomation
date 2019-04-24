.class Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$4;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;)V
    .locals 0

    .line 612
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$4;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 616
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 617
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 619
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$4;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$4;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->access$000(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->startPay(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    .line 620
    goto :goto_0

    .line 622
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$4;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bus_card_pay_fail:I

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->showToast(I)V

    .line 623
    goto :goto_0

    .line 625
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity$4;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;->access$100(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardRechargeAcitvity;)V

    .line 626
    .line 630
    :goto_0
    :pswitch_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x64
        :pswitch_0
        :pswitch_3
        :pswitch_3
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
