.class public Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;
.super Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;
.source "SourceFile"


# instance fields
.field private romVersion:Ljava/lang/String;

.field private terminal:Ljava/lang/String;

.field private timeStamp:J

.field private walletVersion:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;-><init>()V

    return-void
.end method


# virtual methods
.method public getRomVersion()Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;->romVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getTerminal()Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;->terminal:Ljava/lang/String;

    return-object v0
.end method

.method public getTimeStamp()J
    .locals 2

    .line 28
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;->timeStamp:J

    return-wide v0
.end method

.method public getWalletVersion()Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;->walletVersion:Ljava/lang/String;

    return-object v0
.end method

.method public setRomVersion(Ljava/lang/String;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;->romVersion:Ljava/lang/String;

    .line 49
    return-void
.end method

.method public setTerminal(Ljava/lang/String;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;->terminal:Ljava/lang/String;

    .line 41
    return-void
.end method

.method public setTimeStamp(J)V
    .locals 0

    .line 32
    iput-wide p1, p0, Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;->timeStamp:J

    .line 33
    return-void
.end method

.method public setWalletVersion(Ljava/lang/String;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;->walletVersion:Ljava/lang/String;

    .line 57
    return-void
.end method
