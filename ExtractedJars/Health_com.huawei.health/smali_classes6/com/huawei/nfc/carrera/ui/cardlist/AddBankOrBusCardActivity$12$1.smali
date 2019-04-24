.class Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$12$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$12;->handleDeletelocalcardCallback(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$12;

.field final synthetic val$isSuccess:Z


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$12;Z)V
    .locals 0

    .line 778
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$12$1;->this$1:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$12;

    iput-boolean p2, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$12$1;->val$isSuccess:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 781
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$12$1;->this$1:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$12;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$12;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    iget-boolean v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$12$1;->val$isSuccess:Z

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->access$1700(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;Z)V

    .line 782
    return-void
.end method
