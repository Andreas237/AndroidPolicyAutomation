.class Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleDeleteLocalCardsCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->cleanLocalBankCard()V
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

    .line 775
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$12;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleDeletelocalcardCallback(Z)V
    .locals 2

    .line 778
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$12;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$12$1;

    invoke-direct {v1, p0, p1}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$12$1;-><init>(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$12;Z)V

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 784
    return-void
.end method
