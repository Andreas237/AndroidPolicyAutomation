.class Lcom/huawei/nfc/NFCEntranceActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/NFCEntranceActivity;->showOpenNFCDialog()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/NFCEntranceActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/NFCEntranceActivity;)V
    .locals 0

    .line 365
    iput-object p1, p0, Lcom/huawei/nfc/NFCEntranceActivity$1;->this$0:Lcom/huawei/nfc/NFCEntranceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 369
    const-string v0, "cancel to openNFC"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 370
    iget-object v0, p0, Lcom/huawei/nfc/NFCEntranceActivity$1;->this$0:Lcom/huawei/nfc/NFCEntranceActivity;

    invoke-static {v0}, Lcom/huawei/nfc/NFCEntranceActivity;->access$000(Lcom/huawei/nfc/NFCEntranceActivity;)V

    .line 371
    iget-object v0, p0, Lcom/huawei/nfc/NFCEntranceActivity$1;->this$0:Lcom/huawei/nfc/NFCEntranceActivity;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_list_cancel_tip:I

    invoke-static {v0, v1}, Lcom/huawei/pay/ui/util/ToastManager;->show(Landroid/content/Context;I)V

    .line 372
    iget-object v0, p0, Lcom/huawei/nfc/NFCEntranceActivity$1;->this$0:Lcom/huawei/nfc/NFCEntranceActivity;

    invoke-virtual {v0}, Lcom/huawei/nfc/NFCEntranceActivity;->finish()V

    .line 373
    return-void
.end method
