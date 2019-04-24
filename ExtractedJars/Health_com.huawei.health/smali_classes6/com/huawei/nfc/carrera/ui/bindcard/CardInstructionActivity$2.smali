.class Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankIssuerInfoCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->initAndLoadCardInstructionUrl()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;)V
    .locals 0

    .line 189
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public queryBankIssuerInfoCallback(ILcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;)V
    .locals 3

    .line 192
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->access$100(Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "queryBankIssuerInfoCallback begin"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    if-nez p1, :cond_2

    if-eqz p2, :cond_2

    .line 194
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->access$300(Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v1, v0, :cond_0

    .line 195
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->getCreditTcUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->access$002(Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    .line 196
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->access$300(Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 197
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;->getDebitTcUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->access$002(Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    .line 199
    :cond_1
    const-string v0, "initCardInstructionUrl, card type illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 200
    return-void

    .line 204
    :cond_2
    return-void

    .line 206
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_3

    .line 207
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->access$100(Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "queryBankIssuerInfoCallback is ok.mInstructionUrl."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;

    invoke-static {v2}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;->access$400(Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;Ljava/lang/String;)V

    .line 210
    :cond_3
    return-void
.end method
