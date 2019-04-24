.class public Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCUPCardNullifiedTask;
.super Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "HandleCUPCardNullifiedTask"


# instance fields
.field private final mRefId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 50
    const-string v0, "DELETE"

    invoke-direct {p0, p1, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 51
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCUPCardNullifiedTask;->mRefId:Ljava/lang/String;

    .line 52
    return-void
.end method

.method private checkAndCleanData()Z
    .locals 6

    .line 129
    const/4 v4, 0x0

    .line 130
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCUPCardNullifiedTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;

    move-result-object v0

    const-string v1, "DELETE"

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCUPCardNullifiedTask;->mRefId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->registerCUPOperationListener(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/CUPOperationListener;)V

    .line 132
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 133
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCUPCardNullifiedTask;->mRefId:Ljava/lang/String;

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 134
    const-string v0, "HandleCUPCardNullifiedTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " cleanCUPCard waitOperationResult "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    invoke-virtual {p0, v5}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCUPCardNullifiedTask;->waitOperationResult(Ljava/util/List;)Z

    move-result v4

    .line 136
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCUPCardNullifiedTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;

    move-result-object v0

    const-string v1, "DELETE"

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCUPCardNullifiedTask;->mRefId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->unregisterCUPOperationListener(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/CUPOperationListener;)V

    .line 138
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "checkAndCleanData result : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 139
    if-nez v4, :cond_0

    .line 141
    invoke-virtual {p0, v5}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCUPCardNullifiedTask;->checkAndCleanCupTAData(Ljava/util/List;)Z

    move-result v4

    .line 143
    :cond_0
    return v4
.end method

.method private handleDefaultErr(Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;)Z
    .locals 8

    .line 108
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 109
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCUPCardNullifiedTask;->mRefId:Ljava/lang/String;

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 110
    invoke-virtual {p0, v5}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCUPCardNullifiedTask;->checkAndCleanCupTAData(Ljava/util/List;)Z

    move-result v3

    .line 111
    if-nez v3, :cond_0

    .line 113
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCUPCardNullifiedTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCUPCardNullifiedTask;->mRefId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v6

    .line 114
    if-eqz v6, :cond_0

    .line 116
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 117
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "sendDeleteCardRequest retrun code : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p1, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;->returnCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 118
    const-string v0, "fail_reason"

    invoke-interface {v4, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    const-string v0, "issuerId"

    iget-object v1, v6, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    const-string v0, "productId"

    iget-object v1, v6, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->productId:Ljava/lang/String;

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    const v0, 0x3611a443

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v4, v7, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 124
    :cond_0
    return v3
.end method


# virtual methods
.method public modifyCUPCard()Z
    .locals 8

    .line 62
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/request/NullifyCUPCardRequest;

    invoke-direct {v3}, Lcom/huawei/nfc/carrera/server/card/request/NullifyCUPCardRequest;-><init>()V

    .line 63
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCUPCardNullifiedTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->queryCplc()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lcom/huawei/nfc/carrera/server/card/request/NullifyCUPCardRequest;->cplc:Ljava/lang/String;

    .line 64
    const/4 v0, -0x1

    invoke-virtual {v3, v0}, Lcom/huawei/nfc/carrera/server/card/request/NullifyCUPCardRequest;->setRsaKeyIndex(I)V

    .line 65
    const-string v0, "260086000000068459"

    invoke-virtual {v3, v0}, Lcom/huawei/nfc/carrera/server/card/request/NullifyCUPCardRequest;->setMerchantID(Ljava/lang/String;)V

    .line 66
    const-string v0, "260086000000068459"

    invoke-virtual {v3, v0}, Lcom/huawei/nfc/carrera/server/card/request/NullifyCUPCardRequest;->setSrcTransactionID(Ljava/lang/String;)V

    .line 67
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCUPCardNullifiedTask;->mRefId:Ljava/lang/String;

    iput-object v0, v3, Lcom/huawei/nfc/carrera/server/card/request/NullifyCUPCardRequest;->cardRefId:Ljava/lang/String;

    .line 69
    new-instance v0, Lcom/huawei/wallet/bankcard/server/BankCardServer;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCUPCardNullifiedTask;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/wallet/bankcard/server/BankCardServer;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v3}, Lcom/huawei/wallet/bankcard/server/BankCardServer;->a(Lcom/huawei/nfc/carrera/server/card/request/NullifyCUPCardRequest;)Lcom/huawei/nfc/carrera/server/card/response/NullifyCardResponse;

    move-result-object v4

    .line 70
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 72
    const/4 v0, 0x0

    return v0

    .line 75
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "send delete card request, resultCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v4, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;->returnCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 76
    const/4 v5, 0x0

    .line 78
    iget v0, v4, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;->returnCode:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 81
    :sswitch_0
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCUPCardNullifiedTask;->checkAndCleanData()Z

    move-result v5

    .line 82
    goto :goto_1

    .line 84
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCUPCardNullifiedTask;->mRefId:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCUPCardNullifiedTask;->removeTaInfo(Ljava/lang/String;)Z

    move-result v5

    .line 85
    goto :goto_1

    .line 87
    :sswitch_2
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 88
    const-string v7, "sendDeleteCardRequest nullifyCUPCard server overload 503"

    .line 89
    const-string v0, "fail_reason"

    invoke-interface {v6, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    const v0, 0x3611a442

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v6, v7, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 91
    goto :goto_1

    .line 93
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "nullifyCUPCard err, return code : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v4, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;->returnCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 94
    invoke-direct {p0, v4}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCUPCardNullifiedTask;->handleDefaultErr(Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;)Z

    move-result v5

    .line 97
    :goto_1
    if-eqz v5, :cond_1

    .line 99
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCUPCardNullifiedTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->refreshCardList()V

    .line 101
    :cond_1
    return v5

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4 -> :sswitch_2
        0x0 -> :sswitch_0
        0x53e -> :sswitch_1
    .end sparse-switch
.end method
