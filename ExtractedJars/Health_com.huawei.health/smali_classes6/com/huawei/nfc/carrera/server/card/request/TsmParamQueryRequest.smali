.class public Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;
.super Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;
.source "SourceFile"


# instance fields
.field private aid:Ljava/lang/String;

.field private bankRsaIndex:Ljava/lang/String;

.field private bankSignResult:Ljava/lang/String;

.field private bankSignTime:Ljava/lang/String;

.field private cplc:Ljava/lang/String;

.field private deleteRelatedObjects:Z

.field private issuerId:Ljava/lang/String;

.field private signType:Ljava/lang/String;

.field private terminal:Ljava/lang/String;

.field private tsmParamIMEI:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 61
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;-><init>()V

    .line 51
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->deleteRelatedObjects:Z

    .line 63
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 68
    invoke-direct {p0, p2, p3, p4}, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 51
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->deleteRelatedObjects:Z

    .line 69
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->cplc:Ljava/lang/String;

    .line 70
    iput-object p5, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->terminal:Ljava/lang/String;

    .line 71
    iput-object p6, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->tsmParamIMEI:Ljava/lang/String;

    .line 73
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 78
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;-><init>()V

    .line 51
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->deleteRelatedObjects:Z

    .line 79
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->cplc:Ljava/lang/String;

    .line 80
    iput-object p2, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->aid:Ljava/lang/String;

    .line 81
    iput-object p3, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->terminal:Ljava/lang/String;

    .line 82
    iput-object p4, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->bankSignResult:Ljava/lang/String;

    .line 83
    iput-object p5, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->bankSignTime:Ljava/lang/String;

    .line 84
    iput-object p6, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->bankRsaIndex:Ljava/lang/String;

    .line 85
    iput-object p7, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->tsmParamIMEI:Ljava/lang/String;

    .line 86
    iput-boolean p8, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->deleteRelatedObjects:Z

    .line 87
    return-void
.end method


# virtual methods
.method public getAid()Ljava/lang/String;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->aid:Ljava/lang/String;

    return-object v0
.end method

.method public getBankRsaIndex()Ljava/lang/String;
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->bankRsaIndex:Ljava/lang/String;

    return-object v0
.end method

.method public getBankSignResult()Ljava/lang/String;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->bankSignResult:Ljava/lang/String;

    return-object v0
.end method

.method public getBankSignTime()Ljava/lang/String;
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->bankSignTime:Ljava/lang/String;

    return-object v0
.end method

.method public getCplc()Ljava/lang/String;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->cplc:Ljava/lang/String;

    return-object v0
.end method

.method public getIssuerId()Ljava/lang/String;
    .locals 1

    .line 180
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->issuerId:Ljava/lang/String;

    return-object v0
.end method

.method public getSignType()Ljava/lang/String;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->signType:Ljava/lang/String;

    return-object v0
.end method

.method public getTerminal()Ljava/lang/String;
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->terminal:Ljava/lang/String;

    return-object v0
.end method

.method public getTsmParamIMEI()Ljava/lang/String;
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->tsmParamIMEI:Ljava/lang/String;

    return-object v0
.end method

.method public isDeleteRelatedObjects()Z
    .locals 1

    .line 126
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->deleteRelatedObjects:Z

    return v0
.end method

.method public setAid(Ljava/lang/String;)V
    .locals 0

    .line 141
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->aid:Ljava/lang/String;

    .line 142
    return-void
.end method

.method public setBankRsaIndex(Ljava/lang/String;)V
    .locals 0

    .line 161
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->bankRsaIndex:Ljava/lang/String;

    .line 162
    return-void
.end method

.method public setBankSignResult(Ljava/lang/String;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->bankSignResult:Ljava/lang/String;

    .line 152
    return-void
.end method

.method public setBankSignTime(Ljava/lang/String;)V
    .locals 0

    .line 156
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->bankSignTime:Ljava/lang/String;

    .line 157
    return-void
.end method

.method public setCplc(Ljava/lang/String;)V
    .locals 0

    .line 136
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->cplc:Ljava/lang/String;

    .line 137
    return-void
.end method

.method public setDeleteRelatedObjects(Z)V
    .locals 0

    .line 171
    iput-boolean p1, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->deleteRelatedObjects:Z

    .line 172
    return-void
.end method

.method public setIssuerId(Ljava/lang/String;)V
    .locals 0

    .line 184
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->issuerId:Ljava/lang/String;

    .line 185
    return-void
.end method

.method public setSignType(Ljava/lang/String;)V
    .locals 0

    .line 166
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->signType:Ljava/lang/String;

    .line 167
    return-void
.end method

.method public setTerminal(Ljava/lang/String;)V
    .locals 0

    .line 146
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->terminal:Ljava/lang/String;

    .line 147
    return-void
.end method

.method public setTsmParamIMEI(Ljava/lang/String;)V
    .locals 0

    .line 176
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->tsmParamIMEI:Ljava/lang/String;

    .line 177
    return-void
.end method
