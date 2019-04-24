.class public Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;
.super Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;
.source "SourceFile"


# static fields
.field public static final CARD_STATUS_REPORT_DELETED:Ljava/lang/String; = "6"

.field public static final CARD_STATUS_REPORT_LOCKED:Ljava/lang/String; = "3"

.field public static final CARD_STATUS_REPORT_NOT_ACTIVED:Ljava/lang/String; = "7"

.field public static final CARD_STATUS_REPORT_OPENED:Ljava/lang/String; = "0"


# instance fields
.field private aid:Ljava/lang/String;

.field private cardName:Ljava/lang/String;

.field private cardNumber:Ljava/lang/String;

.field private cardType:I

.field private cplc:Ljava/lang/String;

.field private dpanid:Ljava/lang/String;

.field private ifNotify:Z

.field private imei:Ljava/lang/String;

.field private issuerId:Ljava/lang/String;

.field private status:Ljava/lang/String;

.field private terminal:Ljava/lang/String;

.field private userID:Ljava/lang/String;

.field private walletVersion:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;-><init>()V

    return-void
.end method


# virtual methods
.method public getAid()Ljava/lang/String;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->aid:Ljava/lang/String;

    return-object v0
.end method

.method public getCardName()Ljava/lang/String;
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->cardName:Ljava/lang/String;

    return-object v0
.end method

.method public getCardNumber()Ljava/lang/String;
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->cardNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getCardType()I
    .locals 1

    .line 161
    iget v0, p0, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->cardType:I

    return v0
.end method

.method public getCplc()Ljava/lang/String;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->cplc:Ljava/lang/String;

    return-object v0
.end method

.method public getDpanid()Ljava/lang/String;
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->dpanid:Ljava/lang/String;

    return-object v0
.end method

.method public getImei()Ljava/lang/String;
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->imei:Ljava/lang/String;

    return-object v0
.end method

.method public getIssuerId()Ljava/lang/String;
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->issuerId:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()Ljava/lang/String;
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->status:Ljava/lang/String;

    return-object v0
.end method

.method public getTerminal()Ljava/lang/String;
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->terminal:Ljava/lang/String;

    return-object v0
.end method

.method public getUserID()Ljava/lang/String;
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->userID:Ljava/lang/String;

    return-object v0
.end method

.method public getWalletVersion()Ljava/lang/String;
    .locals 1

    .line 151
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->walletVersion:Ljava/lang/String;

    return-object v0
.end method

.method public isIfNotify()Z
    .locals 1

    .line 166
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->ifNotify:Z

    return v0
.end method

.method public setAid(Ljava/lang/String;)V
    .locals 0

    .line 186
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->aid:Ljava/lang/String;

    .line 187
    return-void
.end method

.method public setCardName(Ljava/lang/String;)V
    .locals 0

    .line 206
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->cardName:Ljava/lang/String;

    .line 207
    return-void
.end method

.method public setCardNumber(Ljava/lang/String;)V
    .locals 0

    .line 211
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->cardNumber:Ljava/lang/String;

    .line 212
    return-void
.end method

.method public setCardType(I)V
    .locals 0

    .line 226
    iput p1, p0, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->cardType:I

    .line 227
    return-void
.end method

.method public setCplc(Ljava/lang/String;)V
    .locals 0

    .line 171
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->cplc:Ljava/lang/String;

    .line 172
    return-void
.end method

.method public setDpanid(Ljava/lang/String;)V
    .locals 0

    .line 201
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->dpanid:Ljava/lang/String;

    .line 202
    return-void
.end method

.method public setIfNotify(Z)V
    .locals 0

    .line 231
    iput-boolean p1, p0, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->ifNotify:Z

    .line 232
    return-void
.end method

.method public setImei(Ljava/lang/String;)V
    .locals 0

    .line 196
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->imei:Ljava/lang/String;

    .line 197
    return-void
.end method

.method public setIssuerId(Ljava/lang/String;)V
    .locals 0

    .line 221
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->issuerId:Ljava/lang/String;

    .line 222
    return-void
.end method

.method public setStatus(Ljava/lang/String;)V
    .locals 0

    .line 191
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->status:Ljava/lang/String;

    .line 192
    return-void
.end method

.method public setTerminal(Ljava/lang/String;)V
    .locals 0

    .line 176
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->terminal:Ljava/lang/String;

    .line 177
    return-void
.end method

.method public setUserID(Ljava/lang/String;)V
    .locals 0

    .line 181
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->userID:Ljava/lang/String;

    .line 182
    return-void
.end method

.method public setWalletVersion(Ljava/lang/String;)V
    .locals 0

    .line 216
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->walletVersion:Ljava/lang/String;

    .line 217
    return-void
.end method
