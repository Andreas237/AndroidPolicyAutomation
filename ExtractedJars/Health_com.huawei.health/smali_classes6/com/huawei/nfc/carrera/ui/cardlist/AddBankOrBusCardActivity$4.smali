.class Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/wallet/logic/cardidentify/ICardIdentifyCallBack;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->goToBankCardCaptureActivity()V
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

    .line 394
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$4;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCardBackPressed()V
    .locals 0

    .line 411
    return-void
.end method

.method public onIndetify(Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;)V
    .locals 1

    .line 397
    if-eqz p1, :cond_0

    .line 398
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$4;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    invoke-static {v0, p1}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->access$500(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;)V

    .line 400
    :cond_0
    return-void
.end method

.method public onSwitch2Input()V
    .locals 2

    .line 404
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$4;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->access$500(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;)V

    .line 405
    return-void
.end method
