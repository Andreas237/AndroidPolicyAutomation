.class public Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;
.super Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;
.source "SourceFile"


# instance fields
.field private clientVersion:Ljava/lang/String;

.field private cplc:Ljava/lang/String;

.field private issuerId:Ljava/lang/String;

.field private terminal:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 33
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;-><init>()V

    .line 16
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;->cplc:Ljava/lang/String;

    .line 20
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;->issuerId:Ljava/lang/String;

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;->terminal:Ljava/lang/String;

    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;->clientVersion:Ljava/lang/String;

    .line 34
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;->cplc:Ljava/lang/String;

    .line 35
    iput-object p2, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;->issuerId:Ljava/lang/String;

    .line 36
    iput-object p3, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;->terminal:Ljava/lang/String;

    .line 37
    return-void
.end method


# virtual methods
.method public getClientVersion()Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;->clientVersion:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getCplc()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;->cplc:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getIssuerId()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;->issuerId:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getTerminal()Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;->terminal:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public setClientVersion(Ljava/lang/String;)V
    .locals 1

    .line 71
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;->clientVersion:Ljava/lang/String;

    .line 72
    return-void
.end method

.method public setCplc(Ljava/lang/String;)V
    .locals 1

    .line 46
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;->cplc:Ljava/lang/String;

    .line 47
    return-void
.end method

.method public setIssuerId(Ljava/lang/String;)V
    .locals 1

    .line 56
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryPayChannelListModelRequest;->issuerId:Ljava/lang/String;

    .line 57
    return-void
.end method
