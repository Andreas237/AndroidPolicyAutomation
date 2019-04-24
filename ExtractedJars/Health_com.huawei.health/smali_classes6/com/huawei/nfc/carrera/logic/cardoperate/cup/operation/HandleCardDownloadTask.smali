.class public Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardDownloadTask;
.super Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;
.source "SourceFile"


# instance fields
.field private final mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleOperationResutTask;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/CardOperateListener;)V
    .locals 0

    .line 44
    invoke-direct {p0, p2, p3, p4}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;-><init>(Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleOperationResutTask;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/CardOperateListener;)V

    .line 45
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardDownloadTask;->mContext:Landroid/content/Context;

    .line 46
    return-void
.end method

.method private storeDownloadInfo(Ljava/lang/String;I)V
    .locals 5

    .line 198
    const/4 v3, 0x0

    .line 199
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 202
    const-string v0, "ssid"

    :try_start_0
    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardDownloadTask;->mSsid:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 203
    const-string v0, "sign"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardDownloadTask;->mSign:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 204
    const-string v0, "time_stamp"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 205
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardDownloadTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->remove(Ljava/lang/String;)Z

    .line 206
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardDownloadTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->putString(Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 211
    goto :goto_0

    .line 208
    :catch_0
    move-exception v4

    .line 210
    const-string v0, "parsPushConsumeMsg, get json exception."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 212
    :goto_0
    return-void
.end method


# virtual methods
.method protected getOperateEventTag()Ljava/lang/String;
    .locals 1

    .line 57
    const-string v0, "DOWNLOAD"

    return-object v0
.end method

.method protected handleFailResult(Ljava/util/List;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;I)V"
        }
    .end annotation

    .line 182
    const/4 v2, 0x0

    .line 183
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 185
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardDownloadTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v2

    .line 186
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 188
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "download prepare failed, refId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 189
    goto :goto_0

    .line 191
    :cond_0
    goto :goto_0

    .line 193
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardDownloadTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->refreshCardList()V

    .line 194
    return-void
.end method

.method protected handleSuccessResult(Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Z"
        }
    .end annotation

    .line 176
    const/4 v0, 0x1

    return v0
.end method

.method protected isOperationSatisfied(Ljava/util/List;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Z"
        }
    .end annotation

    .line 69
    const/4 v2, 0x0

    .line 70
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 72
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardDownloadTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v2

    .line 74
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 76
    const-string v0, "handle card download event, but the card not existed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 80
    const-wide/16 v0, 0x1f4

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    goto :goto_1

    .line 82
    :catch_0
    move-exception v5

    .line 84
    const-string v0, "task sleep, interrupted."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 87
    :goto_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardDownloadTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v2

    .line 89
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    iget v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x62

    if-eq v1, v0, :cond_1

    iget v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x61

    if-eq v1, v0, :cond_1

    iget v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x60

    if-eq v1, v0, :cond_1

    iget v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x5f

    if-eq v1, v0, :cond_1

    iget v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x5d

    if-eq v1, v0, :cond_1

    iget v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x5e

    if-ne v1, v0, :cond_2

    :cond_1
    const/4 v5, 0x1

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    .line 95
    :goto_2
    if-eqz v5, :cond_3

    .line 97
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "download statified, refId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 98
    goto/16 :goto_0

    .line 102
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "download not statified, refId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 103
    const/4 v0, 0x0

    return v0

    .line 107
    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method protected prepareLocalInfo(Ljava/util/List;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Z"
        }
    .end annotation

    .line 119
    const/4 v2, 0x0

    .line 120
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 122
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardDownloadTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v2

    .line 123
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 125
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "download prepare failed, refId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 126
    const/4 v0, 0x0

    return v0

    .line 129
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "download prepare now, refId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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

    .line 130
    iget v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 134
    :pswitch_0
    const/16 v0, 0x61

    iput v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    .line 135
    goto :goto_2

    .line 138
    :pswitch_1
    const/16 v0, 0x5f

    iput v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    .line 139
    goto :goto_2

    .line 142
    :pswitch_2
    goto/16 :goto_0

    .line 144
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "download prepare failed, refId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 145
    const/4 v0, 0x0

    return v0

    .line 147
    :goto_2
    const/16 v0, 0x61

    invoke-direct {p0, v4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardDownloadTask;->storeDownloadInfo(Ljava/lang/String;I)V

    .line 150
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardDownloadTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget v1, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    invoke-virtual {v0, v4, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->updateCardStatus(Ljava/lang/String;I)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_1

    .line 161
    goto :goto_3

    .line 152
    :catch_0
    move-exception v5

    .line 154
    const-string v0, "ta card not exist exception."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 155
    const/4 v0, 0x0

    return v0

    .line 157
    :catch_1
    move-exception v5

    .line 159
    const-string v0, "wallet ta system error exception."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 160
    const/4 v0, 0x0

    return v0

    .line 162
    :goto_3
    goto/16 :goto_0

    .line 164
    :cond_1
    const/4 v0, 0x1

    return v0

    :pswitch_data_0
    .packed-switch 0x5d
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method
