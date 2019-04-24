.class Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncInfosFromServerCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;)V
    .locals 0

    .line 136
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$1;->this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public syncCardProductInfosFromServerResult(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;>;)V"
        }
    .end annotation

    .line 157
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    .line 158
    if-lez v2, :cond_1

    .line 161
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "syncCardProductInfosFromServerResult remove the old icon. sz : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 162
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;

    .line 164
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$1;->this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->access$000(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    move-result-object v0

    iget-object v1, v4, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->productId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->removeCardIcon(Ljava/lang/String;)V

    .line 165
    goto :goto_0

    .line 167
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$1;->this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->access$100(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->loadCardLists()V

    .line 169
    :cond_1
    return-void
.end method

.method public syncIssuerInfosFromServerResult(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;>;)V"
        }
    .end annotation

    .line 140
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    .line 141
    if-lez v2, :cond_1

    .line 144
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "syncIssuerInfosFromServerResult remove the old logo. sz : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 145
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 147
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$1;->this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->access$000(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->removeLogo(Ljava/lang/String;)V

    .line 148
    goto :goto_0

    .line 150
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$1;->this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->access$100(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->loadCardLists()V

    .line 152
    :cond_1
    return-void
.end method
