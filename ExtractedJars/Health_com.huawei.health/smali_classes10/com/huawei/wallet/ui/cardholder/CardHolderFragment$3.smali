.class Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;


# direct methods
.method constructor <init>(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)V
    .locals 0

    .line 842
    iput-object p1, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$3;->b:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 846
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$3;->b:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getWalletAbility()Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;

    move-result-object v4

    .line 847
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 848
    const-string v0, "PluginPay CardHolderFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " getWalletSupport  walletabillity :  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 850
    :cond_0
    new-instance v4, Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;

    const-string v0, ""

    invoke-direct {v4, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;-><init>(Ljava/lang/String;)V

    .line 852
    :goto_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$3;->b:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;->getSupportBusiness()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->a(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;Ljava/lang/String;)Ljava/lang/String;

    .line 854
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$3;->b:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-static {v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->k(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 856
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$3;->b:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-static {v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->l(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardHandler;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 857
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$3;->b:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-static {v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->l(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardHandler;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$CardHandler;->sendEmptyMessage(I)Z

    .line 862
    :cond_1
    return-void
.end method
