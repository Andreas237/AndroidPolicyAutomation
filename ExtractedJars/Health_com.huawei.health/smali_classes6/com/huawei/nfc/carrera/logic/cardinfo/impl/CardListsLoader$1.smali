.class Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->checkDefaultCard(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;

.field final synthetic val$finalWouldBeDefaultCard:Lcom/huawei/wallet/model/unicard/UniCardInfo;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;Lcom/huawei/wallet/model/unicard/UniCardInfo;)V
    .locals 0

    .line 467
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$1;->this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;

    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$1;->val$finalWouldBeDefaultCard:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 471
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$1;->this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->access$000(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$1;->val$finalWouldBeDefaultCard:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {v1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->setDefaultCard(Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_1

    .line 476
    goto :goto_0

    .line 472
    :catch_0
    move-exception v2

    .line 473
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "set card default fail, WalletTaCardNotExistException: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 476
    goto :goto_0

    .line 474
    :catch_1
    move-exception v2

    .line 475
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "set card default fail, WalletTaSystemErrorException: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 477
    :goto_0
    return-void
.end method
