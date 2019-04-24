.class Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankIssuerInfoCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock$1;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public queryBankIssuerInfoCallback(ILcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;)V
    .locals 2

    .line 102
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 104
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->getContactNumber()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 106
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock$1;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->getContactNumber()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;->access$000(Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionLock;Ljava/lang/String;)V

    .line 109
    :cond_0
    return-void
.end method
