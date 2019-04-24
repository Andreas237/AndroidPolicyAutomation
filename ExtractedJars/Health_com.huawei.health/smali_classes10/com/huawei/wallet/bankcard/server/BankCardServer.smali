.class public Lcom/huawei/wallet/bankcard/server/BankCardServer;
.super Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/wallet/bankcard/server/BankCardServerApi;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 49
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;-><init>(Landroid/content/Context;)V

    .line 50
    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;)Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;
    .locals 4

    .line 65
    const-string v0, "applyCUPCard begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 66
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/impl/ApplyCUPCardTask;

    iget-object v0, p0, Lcom/huawei/wallet/bankcard/server/BankCardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/wallet/bankcard/server/BankCardServer;->serverTotalUrl:Ljava/lang/String;

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/ApplyCUPCardTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 67
    invoke-virtual {v2, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ApplyCUPCardTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;

    .line 68
    return-object v3
.end method

.method public a(Lcom/huawei/nfc/carrera/server/card/request/WipeAllCUPCardRequest;)Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;
    .locals 4

    .line 110
    const-string v0, "wipeAllCUPCard begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 111
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/impl/WipeAllCUPCardTask;

    iget-object v0, p0, Lcom/huawei/wallet/bankcard/server/BankCardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/wallet/bankcard/server/BankCardServer;->serverTotalUrl:Ljava/lang/String;

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/WipeAllCUPCardTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 112
    invoke-virtual {v2, p1}, Lcom/huawei/nfc/carrera/server/card/impl/WipeAllCUPCardTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;

    .line 113
    return-object v3
.end method

.method public a(Lcom/huawei/nfc/carrera/server/card/request/NullifyCUPCardRequest;)Lcom/huawei/nfc/carrera/server/card/response/NullifyCardResponse;
    .locals 4

    .line 92
    const-string v0, "nullifyCUPCard begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 93
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/impl/NullifyCUPCardTask;

    iget-object v0, p0, Lcom/huawei/wallet/bankcard/server/BankCardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/wallet/bankcard/server/BankCardServer;->serverTotalUrl:Ljava/lang/String;

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/NullifyCUPCardTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 94
    invoke-virtual {v2, p1}, Lcom/huawei/nfc/carrera/server/card/impl/NullifyCUPCardTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/server/card/response/NullifyCardResponse;

    .line 95
    return-object v3
.end method

.method public b(Lcom/huawei/nfc/carrera/server/card/request/VerifiyCUPRequest;)Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;
    .locals 4

    .line 83
    const-string v0, "verifyOnCUP begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 84
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/impl/VerifyCUPTask;

    iget-object v0, p0, Lcom/huawei/wallet/bankcard/server/BankCardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/wallet/bankcard/server/BankCardServer;->serverTotalUrl:Ljava/lang/String;

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/VerifyCUPTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 85
    invoke-virtual {v2, p1}, Lcom/huawei/nfc/carrera/server/card/impl/VerifyCUPTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;

    .line 86
    return-object v3
.end method

.method public c(Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPVerificationRequest;)Lcom/huawei/nfc/carrera/server/card/response/ApplyVerificationResponse;
    .locals 4

    .line 74
    const-string v0, "applyCUPVerification begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 75
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/impl/ApplyCUPVerificationTask;

    iget-object v0, p0, Lcom/huawei/wallet/bankcard/server/BankCardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/wallet/bankcard/server/BankCardServer;->serverTotalUrl:Ljava/lang/String;

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/ApplyCUPVerificationTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 76
    invoke-virtual {v2, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ApplyCUPVerificationTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/server/card/response/ApplyVerificationResponse;

    .line 77
    return-object v3
.end method

.method public c(Lcom/huawei/nfc/carrera/server/card/request/QueryUnionPayPushRequest;)Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;
    .locals 4

    .line 118
    const-string v0, "queryUnionPayPush begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 119
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/impl/QueryUnionPayPushTask;

    iget-object v0, p0, Lcom/huawei/wallet/bankcard/server/BankCardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/wallet/bankcard/server/BankCardServer;->serverTotalUrl:Ljava/lang/String;

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/QueryUnionPayPushTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 120
    invoke-virtual {v2, p1}, Lcom/huawei/nfc/carrera/server/card/impl/QueryUnionPayPushTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;

    .line 121
    return-object v3
.end method

.method public e(Lcom/huawei/nfc/carrera/server/card/request/IdentifyCUPCardRequest;)Lcom/huawei/nfc/carrera/server/card/response/IdentifyCUPCardResponse;
    .locals 4

    .line 56
    const-string v0, "identifyCUPCard begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 57
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/impl/IdentifyCUPCardTask;

    iget-object v0, p0, Lcom/huawei/wallet/bankcard/server/BankCardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/wallet/bankcard/server/BankCardServer;->serverTotalUrl:Ljava/lang/String;

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/IdentifyCUPCardTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 58
    invoke-virtual {v2, p1}, Lcom/huawei/nfc/carrera/server/card/impl/IdentifyCUPCardTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/server/card/response/IdentifyCUPCardResponse;

    .line 59
    return-object v3
.end method

.method public e(Lcom/huawei/nfc/carrera/server/card/request/QueryAidRequest;)Lcom/huawei/nfc/carrera/server/card/response/QueryAidResponse;
    .locals 4

    .line 101
    const-string v0, "queryAidOnCUP begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 102
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/impl/QueryAidOnCUPCardTask;

    iget-object v0, p0, Lcom/huawei/wallet/bankcard/server/BankCardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/wallet/bankcard/server/BankCardServer;->serverTotalUrl:Ljava/lang/String;

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/QueryAidOnCUPCardTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 103
    invoke-virtual {v2, p1}, Lcom/huawei/nfc/carrera/server/card/impl/QueryAidOnCUPCardTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/server/card/response/QueryAidResponse;

    .line 104
    return-object v3
.end method
