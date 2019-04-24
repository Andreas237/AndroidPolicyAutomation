.class Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankCardInfoCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->doReaddCard(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;

.field final synthetic val$processFragment:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)V
    .locals 0

    .line 560
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;

    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity$2;->val$processFragment:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public queryBankCardInfoCallback(ILcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;)V
    .locals 4

    .line 564
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 566
    const-string v0, "rebindcard interface."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 567
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->access$200(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;)Ljava/lang/String;

    move-result-object v1

    .line 568
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;->getProductId()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;

    .line 567
    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->retryDownloadCard(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/InstallCardResultCallback;)V

    goto :goto_0

    .line 572
    :cond_0
    const-string v0, "===123====rebindcard interface.else"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 573
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity$2;->val$processFragment:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->access$300(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;

    invoke-static {v2}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;->access$400(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardActivity;)I

    move-result v2

    const/16 v3, -0x63

    invoke-virtual {v0, v3, v1, v2}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->bindFailed(ILjava/lang/String;I)V

    .line 575
    :goto_0
    return-void
.end method
