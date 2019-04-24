.class Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$9;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;)V
    .locals 0

    .line 653
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$9;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public dispatchMessage(Landroid/os/Message;)V
    .locals 2

    .line 656
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 657
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$9;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->access$1000(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;Z)V

    goto/16 :goto_0

    .line 658
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 659
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$9;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->access$1000(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;Z)V

    goto :goto_0

    .line 660
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x3

    if-ne v1, v0, :cond_2

    .line 661
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$9;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    sget v1, Lcom/huawei/wallet/R$string;->huaweipay_loading:I

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->access$1100(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;I)V

    goto :goto_0

    .line 662
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x4

    if-ne v1, v0, :cond_3

    .line 663
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$9;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->access$1200(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;)V

    goto :goto_0

    .line 664
    :cond_3
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x5

    if-ne v1, v0, :cond_4

    .line 665
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$9;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->access$1300(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;)V

    goto :goto_0

    .line 666
    :cond_4
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x6

    if-ne v1, v0, :cond_5

    .line 667
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$9;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bind_card_fail_open_overcount:I

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->access$1400(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;I)V

    goto :goto_0

    .line 668
    :cond_5
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x7

    if-ne v1, v0, :cond_6

    .line 669
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$9;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$9;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->access$200(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->access$1500(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;Ljava/util/ArrayList;)V

    goto :goto_0

    .line 670
    :cond_6
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x8

    if-ne v1, v0, :cond_7

    .line 671
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$9;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->access$1600(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;)V

    .line 673
    :cond_7
    :goto_0
    return-void
.end method
