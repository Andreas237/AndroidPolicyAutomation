.class Lcom/huawei/nfc/NFCEntranceActivity$2;
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

    .line 354
    iput-object p1, p0, Lcom/huawei/nfc/NFCEntranceActivity$2;->this$0:Lcom/huawei/nfc/NFCEntranceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 358
    iget-object v0, p0, Lcom/huawei/nfc/NFCEntranceActivity$2;->this$0:Lcom/huawei/nfc/NFCEntranceActivity;

    iget-object v1, p0, Lcom/huawei/nfc/NFCEntranceActivity$2;->this$0:Lcom/huawei/nfc/NFCEntranceActivity;

    sget v2, Lcom/huawei/wallet/R$string;->nfc_open_swipe_setting:I

    invoke-virtual {v1, v2}, Lcom/huawei/nfc/NFCEntranceActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/NFCEntranceActivity;->access$100(Lcom/huawei/nfc/NFCEntranceActivity;Ljava/lang/String;)V

    .line 360
    iget-object v0, p0, Lcom/huawei/nfc/NFCEntranceActivity$2;->this$0:Lcom/huawei/nfc/NFCEntranceActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->setAutoOpenNFC()V

    .line 362
    iget-object v0, p0, Lcom/huawei/nfc/NFCEntranceActivity$2;->this$0:Lcom/huawei/nfc/NFCEntranceActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/NFCEntranceActivity$2;->this$0:Lcom/huawei/nfc/NFCEntranceActivity;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->openNFCEnvironment(Landroid/app/Activity;)V

    .line 363
    return-void
.end method
