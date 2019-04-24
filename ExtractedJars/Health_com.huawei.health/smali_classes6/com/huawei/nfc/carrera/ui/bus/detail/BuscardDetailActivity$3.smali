.class Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/UninstallTrafficCardCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->deleteBusCard()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;)V
    .locals 0

    .line 738
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public uninstallTrafficCardCallback(I)V
    .locals 3

    .line 741
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;)V

    .line 742
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 745
    :sswitch_0
    const-string v0, "PluginPay BuscardDetailActivity uninstallTrafficCardCallback: Delete card success,go to NFC HomeFragment."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 746
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_delete_done:I

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->showToast(I)V

    .line 748
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 749
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.huawei.wallet.ui.cardholder.CardHolderActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 750
    const/high16 v0, 0x4000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 752
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 753
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;

    invoke-virtual {v0, v2}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->startActivity(Landroid/content/Intent;)V

    .line 754
    goto :goto_1

    .line 756
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;

    sget v1, Lcom/huawei/wallet/R$string;->error_no_network_failed:I

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->showToast(I)V

    .line 757
    goto :goto_1

    .line 759
    :sswitch_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bindcard_error_connection_failed:I

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->showToast(I)V

    .line 760
    goto :goto_1

    .line 762
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_delete_fail:I

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->showToast(I)V

    .line 765
    :goto_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->finish()V

    .line 766
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xb -> :sswitch_1
        0x19 -> :sswitch_2
    .end sparse-switch
.end method
