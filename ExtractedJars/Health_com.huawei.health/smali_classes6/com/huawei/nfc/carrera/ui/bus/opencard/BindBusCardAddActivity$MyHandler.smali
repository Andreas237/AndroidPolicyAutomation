.class public Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$MyHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "MyHandler"
.end annotation


# instance fields
.field mActivityReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;>;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)V
    .locals 1

    .line 1025
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$MyHandler;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 1026
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$MyHandler;->mActivityReference:Ljava/lang/ref/WeakReference;

    .line 1027
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 1031
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 1032
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$MyHandler;->mActivityReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    .line 1033
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 1034
    return-void

    .line 1036
    :cond_0
    const-string v0, "BindBusCardAddActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " handleMessage msg : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->what:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1037
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 1039
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$MyHandler;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$MyHandler;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    iget-object v1, v1, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->startPay(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    .line 1040
    goto :goto_0

    .line 1042
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$MyHandler;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bus_card_pay_fail:I

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->showToast(I)V

    .line 1043
    goto :goto_0

    .line 1045
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$MyHandler;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->access$500(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)V

    .line 1046
    goto :goto_0

    .line 1048
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$MyHandler;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->showProgressDialog()V

    .line 1049
    goto :goto_0

    .line 1051
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$MyHandler;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$MyHandler;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->access$600(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)Lo/egn;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->access$700(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;Lo/egn;)V

    .line 1052
    iget v5, p1, Landroid/os/Message;->arg1:I

    .line 1053
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BindBusCardAddActivity:handler:HANDLE_CLOSE_GET_PAY_TYPE_RESULT, returnCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1054
    if-eqz v5, :cond_1

    .line 1057
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$MyHandler;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$MyHandler;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    sget v2, Lcom/huawei/wallet/R$string;->nfc_get_pay_type_failed:I

    invoke-virtual {v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->showErrorDialog(Ljava/lang/String;)V

    .line 1058
    return-void

    .line 1062
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$MyHandler;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->access$800(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)V

    .line 1063
    .line 1067
    :goto_0
    :pswitch_5
    return-void

    :pswitch_data_0
    .packed-switch 0x64
        :pswitch_0
        :pswitch_5
        :pswitch_5
        :pswitch_1
        :pswitch_2
        :pswitch_5
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
