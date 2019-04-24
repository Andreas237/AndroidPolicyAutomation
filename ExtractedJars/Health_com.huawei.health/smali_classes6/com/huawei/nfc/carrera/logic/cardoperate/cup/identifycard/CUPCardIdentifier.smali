.class public Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/CUPCardIdentifier;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field mCardServerApi:Lcom/huawei/wallet/bankcard/server/BankCardServerApi;

.field mContext:Landroid/content/Context;

.field mCupServiceApi:Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;Lcom/huawei/wallet/bankcard/server/BankCardServerApi;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/CUPCardIdentifier;->mContext:Landroid/content/Context;

    .line 36
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/CUPCardIdentifier;->mCupServiceApi:Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;

    .line 37
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/CUPCardIdentifier;->mCardServerApi:Lcom/huawei/wallet/bankcard/server/BankCardServerApi;

    .line 38
    return-void
.end method


# virtual methods
.method public indentifyCUPCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;
    .locals 10

    .line 48
    new-instance v4, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;

    invoke-direct {v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;-><init>()V

    .line 49
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/CUPCardIdentifier;->mCupServiceApi:Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;

    invoke-interface {v0, p1}, Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;->encryptCardInfo(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/unionpay/response/CUPEncryptResponse;

    move-result-object v5

    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "indentifyCard, encrypte response code: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v5, Lcom/huawei/nfc/carrera/logic/spi/unionpay/response/CUPEncryptResponse;->responseCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 51
    iget v0, v5, Lcom/huawei/nfc/carrera/logic/spi/unionpay/response/CUPEncryptResponse;->responseCode:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 53
    iget v0, v5, Lcom/huawei/nfc/carrera/logic/spi/unionpay/response/CUPEncryptResponse;->responseCode:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 56
    :pswitch_0
    const/4 v0, -0x1

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;->setResultCode(I)V

    .line 57
    goto :goto_1

    .line 59
    :pswitch_1
    const/4 v0, -0x3

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;->setResultCode(I)V

    .line 60
    goto :goto_1

    .line 62
    :pswitch_2
    const/4 v0, -0x5

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;->setResultCode(I)V

    .line 63
    goto :goto_1

    .line 65
    :goto_0
    :pswitch_3
    const/16 v0, -0x63

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;->setResultCode(I)V

    .line 68
    :goto_1
    return-object v4

    .line 71
    :cond_0
    iget-object v0, v5, Lcom/huawei/nfc/carrera/logic/spi/unionpay/response/CUPEncryptResponse;->encrytedStr:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 73
    const-string v0, "indentifyCard, encryptedStr is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 74
    const/16 v0, -0x63

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;->setResultCode(I)V

    .line 75
    return-object v4

    .line 78
    :cond_1
    new-instance v6, Lcom/huawei/nfc/carrera/server/card/request/IdentifyCUPCardRequest;

    invoke-direct {v6}, Lcom/huawei/nfc/carrera/server/card/request/IdentifyCUPCardRequest;-><init>()V

    .line 79
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/CUPCardIdentifier;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->queryCplc()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v6, Lcom/huawei/nfc/carrera/server/card/request/IdentifyCUPCardRequest;->cplc:Ljava/lang/String;

    .line 80
    iget-object v0, v5, Lcom/huawei/nfc/carrera/logic/spi/unionpay/response/CUPEncryptResponse;->encrytedStr:Ljava/lang/String;

    iput-object v0, v6, Lcom/huawei/nfc/carrera/server/card/request/IdentifyCUPCardRequest;->encryptedFpan:Ljava/lang/String;

    .line 81
    const-string v0, "260086000000068459"

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/server/card/request/IdentifyCUPCardRequest;->setMerchantID(Ljava/lang/String;)V

    .line 82
    const/4 v0, -0x1

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/server/card/request/IdentifyCUPCardRequest;->setRsaKeyIndex(I)V

    .line 83
    const-string v0, "260086000000068459"

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/server/card/request/IdentifyCUPCardRequest;->setSrcTransactionID(Ljava/lang/String;)V

    .line 84
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/CUPCardIdentifier;->mCardServerApi:Lcom/huawei/wallet/bankcard/server/BankCardServerApi;

    invoke-interface {v0, v6}, Lcom/huawei/wallet/bankcard/server/BankCardServerApi;->e(Lcom/huawei/nfc/carrera/server/card/request/IdentifyCUPCardRequest;)Lcom/huawei/nfc/carrera/server/card/response/IdentifyCUPCardResponse;

    move-result-object v7

    .line 85
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "indentifyCard, response"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v7, Lcom/huawei/nfc/carrera/server/card/response/IdentifyCUPCardResponse;->returnCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 86
    iget v0, v7, Lcom/huawei/nfc/carrera/server/card/response/IdentifyCUPCardResponse;->returnCode:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_2

    .line 89
    :sswitch_0
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;->setResultCode(I)V

    .line 90
    iget-object v0, v7, Lcom/huawei/nfc/carrera/server/card/response/IdentifyCUPCardResponse;->issuerId:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;->setIssuerId(Ljava/lang/String;)V

    .line 91
    iget v0, v7, Lcom/huawei/nfc/carrera/server/card/response/IdentifyCUPCardResponse;->cardType:I

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;->setBankCardType(I)V

    .line 92
    goto :goto_3

    .line 94
    :sswitch_1
    const/4 v0, -0x2

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;->setResultCode(I)V

    .line 95
    goto :goto_3

    .line 97
    :sswitch_2
    const/4 v0, -0x3

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;->setResultCode(I)V

    .line 98
    goto :goto_3

    .line 104
    :sswitch_3
    const/4 v0, -0x4

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;->setResultCode(I)V

    .line 105
    goto :goto_3

    .line 107
    :sswitch_4
    const/4 v0, -0x3

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;->setResultCode(I)V

    .line 108
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 109
    const-string v0, "fail_reason"

    const-string v1, "CUPCardOperator identifyCUPCard server overload 503"

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    const-string v0, "indentifyCUPCard err"

    const v1, 0x3611a3fc

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v8, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 112
    goto :goto_3

    .line 114
    :goto_2
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 115
    const-string v0, "fail_code"

    iget v1, v7, Lcom/huawei/nfc/carrera/server/card/response/IdentifyCUPCardResponse;->returnCode:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    const-string v0, "indentifyCUPCard err"

    const v1, 0x3611a3fc

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v1, v9, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 118
    const/16 v0, -0x63

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;->setResultCode(I)V

    .line 121
    :goto_3
    return-object v4

    :pswitch_data_0
    .packed-switch -0x5
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_3
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        -0x4 -> :sswitch_4
        -0x2 -> :sswitch_2
        -0x1 -> :sswitch_1
        0x0 -> :sswitch_0
        0x456 -> :sswitch_3
        0x515 -> :sswitch_3
        0x545 -> :sswitch_3
        0x651 -> :sswitch_3
        0x652 -> :sswitch_3
    .end sparse-switch
.end method
