.class Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankIssuerInfoCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete;

.field final synthetic val$mTaCardInfo:Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete;Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)V
    .locals 0

    .line 115
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete$1;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete;

    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete$1;->val$mTaCardInfo:Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public queryBankIssuerInfoCallback(ILcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;)V
    .locals 4

    .line 120
    if-nez p1, :cond_0

    if-eqz p2, :cond_0

    .line 123
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 124
    const-string v0, "readd_card"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 125
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete$1;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete;->access$000(Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 126
    const-string v0, "issuer_id"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete$1;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete;->access$100(Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete;)Lcom/huawei/wallet/model/unicard/UniCardInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 127
    const-string v0, "card_type"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete$1;->val$mTaCardInfo:Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    iget v1, v1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardType:I

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 128
    const-string v0, "issuer_mode"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->getMode()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 129
    const-string v0, "reference_id"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete$1;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete;->access$100(Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete;)Lcom/huawei/wallet/model/unicard/UniCardInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 130
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete$1;->val$mTaCardInfo:Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanDigest:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete$1;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete;->access$000(Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dtj;->b(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    .line 131
    const-string v0, "card_num"

    invoke-virtual {v2, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 132
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete$1;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete;->access$000(Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstructionToDelete;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 134
    :cond_0
    return-void
.end method
