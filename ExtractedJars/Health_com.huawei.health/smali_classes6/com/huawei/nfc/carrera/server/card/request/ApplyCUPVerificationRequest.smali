.class public Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPVerificationRequest;
.super Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;
.source "SourceFile"


# instance fields
.field private cardRefId:Ljava/lang/String;

.field private cplc:Ljava/lang/String;

.field private method:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;-><init>()V

    .line 13
    const-string v0, "OTPSMS"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPVerificationRequest;->method:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getCardRefId()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPVerificationRequest;->cardRefId:Ljava/lang/String;

    return-object v0
.end method

.method public getCplc()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPVerificationRequest;->cplc:Ljava/lang/String;

    return-object v0
.end method

.method public getMethod()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPVerificationRequest;->method:Ljava/lang/String;

    return-object v0
.end method

.method public setCardRefId(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPVerificationRequest;->cardRefId:Ljava/lang/String;

    .line 48
    return-void
.end method

.method public setCplc(Ljava/lang/String;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPVerificationRequest;->cplc:Ljava/lang/String;

    .line 38
    return-void
.end method

.method public setMethod(Ljava/lang/String;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPVerificationRequest;->method:Ljava/lang/String;

    .line 43
    return-void
.end method
