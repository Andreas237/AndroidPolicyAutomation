.class Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$2;->syncRFConfFilesResult(Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$2;

.field final synthetic val$id:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$2;Ljava/lang/String;)V
    .locals 0

    .line 740
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$2$1;->this$1:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$2;

    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$2$1;->val$id:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 745
    new-instance v4, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncFileToWatchTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$2$1;->this$1:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$2;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$2;->this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->access$000(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {v4, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncFileToWatchTask;-><init>(Landroid/content/Context;)V

    .line 746
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$2$1;->val$id:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncFileToWatchTask;->getTACardToSendFile(Ljava/lang/String;)V

    .line 747
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$2$1;->this$1:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$2;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$2;->this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->access$000(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getDefaultCard()Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v5

    .line 748
    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$2$1;->val$id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 749
    const-string v0, "CardListsLoader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "syncRFConfFilesResult : the new ver conf downloaded,set new conf for <"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$2$1;->val$id:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "> defaultcard."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 750
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$2$1;->this$1:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$2;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$2;->this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->access$000(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->setDefaultCardRFConf(IZ)V

    .line 754
    :cond_0
    return-void
.end method
