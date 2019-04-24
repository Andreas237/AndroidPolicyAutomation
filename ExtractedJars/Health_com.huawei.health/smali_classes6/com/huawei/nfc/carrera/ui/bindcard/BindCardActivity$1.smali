.class Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankIssuerInfoCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->contactToServer()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;)V
    .locals 0

    .line 436
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public queryBankIssuerInfoCallback(ILcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;)V
    .locals 4

    .line 440
    if-nez p1, :cond_2

    if-eqz p2, :cond_2

    .line 442
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->getDebitContactNumber()Ljava/lang/String;

    move-result-object v2

    .line 443
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->getCrebitContactNumber()Ljava/lang/String;

    move-result-object v3

    .line 444
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_0

    .line 446
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;

    invoke-static {v0, v2}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->access$100(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;Ljava/lang/String;)V

    goto :goto_0

    .line 448
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_1

    .line 450
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;

    invoke-static {v0, v3}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->access$100(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;Ljava/lang/String;)V

    goto :goto_0

    .line 454
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->getContactNumber()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->access$100(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;Ljava/lang/String;)V

    .line 457
    :cond_2
    :goto_0
    return-void
.end method
