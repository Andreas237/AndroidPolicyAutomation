.class Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->a(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;


# direct methods
.method constructor <init>(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)V
    .locals 0

    .line 296
    iput-object p1, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$1;->d:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 299
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$1;->d:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->getActivity()Landroid/app/Activity;

    move-result-object v4

    .line 300
    const-string v0, "PluginPay CardHolderFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initCardsView(),c="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    if-ne v3, v4, :cond_0

    const-string v3, "null"

    goto :goto_0

    :cond_0
    move-object v3, v4

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    if-eqz v4, :cond_3

    .line 302
    invoke-static {v4}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getWalletAbility()Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;

    move-result-object v5

    .line 303
    const-string v0, "PluginPay CardHolderFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initCardsView(),walletSupportInfo="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    if-ne v3, v5, :cond_1

    const-string v3, "null"

    goto :goto_1

    :cond_1
    move-object v3, v5

    :goto_1
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 304
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;->getSupportDefautcard()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 305
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$1;->d:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-static {v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->b(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->setDragEnable(Z)V

    goto :goto_2

    .line 307
    :cond_2
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$1;->d:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-static {v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->b(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->setDragEnable(Z)V

    .line 310
    :cond_3
    :goto_2
    return-void
.end method
