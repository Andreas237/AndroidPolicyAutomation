.class public Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardDeleteTask;
.super Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;
.source "SourceFile"


# instance fields
.field private final mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleOperationResutTask;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/CardOperateListener;)V
    .locals 0

    .line 40
    invoke-direct {p0, p2, p3, p4}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;-><init>(Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleOperationResutTask;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/CardOperateListener;)V

    .line 41
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardDeleteTask;->mContext:Landroid/content/Context;

    .line 42
    return-void
.end method


# virtual methods
.method protected getOperateEventTag()Ljava/lang/String;
    .locals 1

    .line 47
    const-string v0, "DELETE"

    return-object v0
.end method

.method protected handleFailResult(Ljava/util/List;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;I)V"
        }
    .end annotation

    .line 145
    return-void
.end method

.method protected handleSuccessResult(Ljava/util/List;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Z"
        }
    .end annotation

    .line 111
    const/4 v3, 0x1

    .line 112
    const/4 v4, 0x0

    .line 113
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 115
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "delete ta info now, refId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 116
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardDeleteTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v4

    .line 117
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 119
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "delete ta info now, not existed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 120
    goto :goto_0

    .line 125
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardDeleteTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->removeCard(Ljava/lang/String;)V

    .line 126
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardDeleteTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardLostManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    move-result-object v0

    iget-object v1, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;->reportCardDeletedStatus(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_1

    .line 136
    goto :goto_1

    .line 128
    :catch_0
    move-exception v7

    .line 130
    const-string v0, "ta card not exist exception."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 136
    goto :goto_1

    .line 132
    :catch_1
    move-exception v7

    .line 134
    const-string v0, "wallet ta system error exception."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 135
    const/4 v3, 0x0

    .line 137
    :goto_1
    goto/16 :goto_0

    .line 138
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardDeleteTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->refreshCardList()V

    .line 139
    return v3
.end method

.method protected isOperationSatisfied(Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Z"
        }
    .end annotation

    .line 54
    const/4 v0, 0x1

    return v0
.end method

.method protected prepareLocalInfo(Ljava/util/List;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Z"
        }
    .end annotation

    .line 61
    const/4 v2, 0x0

    .line 63
    const/4 v3, 0x0

    .line 64
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 66
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardDeleteTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v2

    .line 67
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 69
    const-string v0, "delete prepare, refId not exsited in ta."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 70
    goto :goto_0

    .line 73
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "delete prepare now, refId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",existed status: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 74
    iget v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/4 v1, 0x3

    if-ne v1, v0, :cond_1

    .line 76
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "delete prepare, card nullified in ta, refId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 77
    goto :goto_0

    .line 82
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardDeleteTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v5, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->updateCardStatus(Ljava/lang/String;I)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_1

    .line 93
    goto :goto_1

    .line 84
    :catch_0
    move-exception v6

    .line 86
    const-string v0, "ta card not exist exception."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 87
    const/4 v0, 0x0

    return v0

    .line 89
    :catch_1
    move-exception v6

    .line 91
    const-string v0, "wallet ta system error exception."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 92
    const/4 v0, 0x0

    return v0

    .line 95
    :goto_1
    const/4 v3, 0x1

    .line 96
    goto/16 :goto_0

    .line 98
    :cond_2
    if-eqz v3, :cond_3

    .line 101
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardDeleteTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->refreshCardList()V

    .line 104
    :cond_3
    const/4 v0, 0x1

    return v0
.end method
