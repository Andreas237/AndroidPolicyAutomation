.class Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankCardInfoCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->setData(Lcom/huawei/wallet/model/unicard/UniCardInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;)V
    .locals 0

    .line 157
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction$1;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public queryBankCardInfoCallback(ILcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;)V
    .locals 2

    .line 162
    if-nez p1, :cond_0

    if-eqz p2, :cond_0

    .line 164
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction$1;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->access$000(Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;->getCardName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 166
    :cond_0
    return-void
.end method
