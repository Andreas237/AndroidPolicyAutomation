.class public Lcom/huawei/nfc/carrera/server/card/request/VerifiyCUPRequest;
.super Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;
.source "SourceFile"


# instance fields
.field private cardRefId:Ljava/lang/String;

.field private cplc:Ljava/lang/String;

.field private optValue:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;-><init>()V

    return-void
.end method


# virtual methods
.method public getCardRefId()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/VerifiyCUPRequest;->cardRefId:Ljava/lang/String;

    return-object v0
.end method

.method public getCplc()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/VerifiyCUPRequest;->cplc:Ljava/lang/String;

    return-object v0
.end method

.method public getOptValue()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/VerifiyCUPRequest;->optValue:Ljava/lang/String;

    return-object v0
.end method

.method public setCardRefId(Ljava/lang/String;)V
    .locals 0

    .line 14
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/VerifiyCUPRequest;->cardRefId:Ljava/lang/String;

    .line 15
    return-void
.end method

.method public setCplc(Ljava/lang/String;)V
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/VerifiyCUPRequest;->cplc:Ljava/lang/String;

    .line 7
    return-void
.end method

.method public setOptValue(Ljava/lang/String;)V
    .locals 0

    .line 10
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/VerifiyCUPRequest;->optValue:Ljava/lang/String;

    .line 11
    return-void
.end method
