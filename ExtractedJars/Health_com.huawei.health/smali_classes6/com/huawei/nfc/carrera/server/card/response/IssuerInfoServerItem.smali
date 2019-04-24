.class public Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private appInfo:Ljava/lang/String;

.field private cityCode:Ljava/lang/String;

.field private contactNumber:Ljava/lang/String;

.field private creditCallCenterNumber:Ljava/lang/String;

.field private creditTcUrl:Ljava/lang/String;

.field private creditWebsite:Ljava/lang/String;

.field private debitCallCenterNumber:Ljava/lang/String;

.field private debitTcUrl:Ljava/lang/String;

.field private debitWebsite:Ljava/lang/String;

.field private description:Ljava/lang/String;

.field private issuerId:Ljava/lang/String;

.field private issuerType:I

.field private logoUrl:Ljava/lang/String;

.field private mode:I

.field private name:Ljava/lang/String;

.field private payType:Ljava/lang/String;

.field private reservedInfo:Ljava/lang/String;

.field private sn:I

.field private supportType:I

.field private timeStamp:J

.field private walletVersion:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAppInfo()Ljava/lang/String;
    .locals 1

    .line 237
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->appInfo:Ljava/lang/String;

    return-object v0
.end method

.method public getBundle()Landroid/os/Bundle;
    .locals 4

    .line 286
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 287
    const-string v0, "issuerId"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->issuerId:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    const-string v0, "name"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->name:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    const-string v0, "description"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->description:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    const-string v0, "logoUrl"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->logoUrl:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 291
    const-string v0, "issuerType"

    iget v1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->issuerType:I

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 292
    const-string v0, "supportType"

    iget v1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->supportType:I

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 293
    const-string v0, "mode"

    iget v1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->mode:I

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 294
    const-string v0, "walletVersion"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->walletVersion:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    const-string v0, "contactNumber"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->contactNumber:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    const-string v0, "debitCallCenterNumber"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->debitCallCenterNumber:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 297
    const-string v0, "creditCallCenterNumber"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->creditCallCenterNumber:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 298
    const-string v0, "debitTcUrl"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->debitTcUrl:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 299
    const-string v0, "creditTcUrl"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->creditTcUrl:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    const-string v0, "debitWebsite"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->debitWebsite:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 301
    const-string v0, "creditWebsite"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->creditWebsite:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 302
    const-string v0, "timeStamp"

    iget-wide v1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->timeStamp:J

    invoke-virtual {v3, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 303
    const-string v0, "appInfo"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->appInfo:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    const-string v0, "reservedInfo"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->reservedInfo:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 305
    const-string v0, "sn"

    iget v1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->sn:I

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 306
    const-string v0, "cityCode"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->cityCode:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 307
    const-string v0, "payType"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->payType:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 308
    return-object v3
.end method

.method public getCityCode()Ljava/lang/String;
    .locals 1

    .line 268
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->cityCode:Ljava/lang/String;

    return-object v0
.end method

.method public getContactNumber()Ljava/lang/String;
    .locals 1

    .line 181
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->contactNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getCreditCallCenterNumber()Ljava/lang/String;
    .locals 1

    .line 197
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->creditCallCenterNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getCreditTcUrl()Ljava/lang/String;
    .locals 1

    .line 213
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->creditTcUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getCreditWebsite()Ljava/lang/String;
    .locals 1

    .line 229
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->creditWebsite:Ljava/lang/String;

    return-object v0
.end method

.method public getDebitCallCenterNumber()Ljava/lang/String;
    .locals 1

    .line 189
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->debitCallCenterNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getDebitTcUrl()Ljava/lang/String;
    .locals 1

    .line 205
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->debitTcUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getDebitWebsite()Ljava/lang/String;
    .locals 1

    .line 221
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->debitWebsite:Ljava/lang/String;

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getIssuerId()Ljava/lang/String;
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->issuerId:Ljava/lang/String;

    return-object v0
.end method

.method public getIssuerType()I
    .locals 1

    .line 149
    iget v0, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->issuerType:I

    return v0
.end method

.method public getLogoUrl()Ljava/lang/String;
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->logoUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getMode()I
    .locals 1

    .line 165
    iget v0, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->mode:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getPayType()Ljava/lang/String;
    .locals 1

    .line 276
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->payType:Ljava/lang/String;

    return-object v0
.end method

.method public getReservedInfo()Ljava/lang/String;
    .locals 1

    .line 253
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->reservedInfo:Ljava/lang/String;

    return-object v0
.end method

.method public getSn()I
    .locals 1

    .line 261
    iget v0, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->sn:I

    return v0
.end method

.method public getSupportType()I
    .locals 1

    .line 157
    iget v0, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->supportType:I

    return v0
.end method

.method public getTimeStamp()J
    .locals 2

    .line 245
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->timeStamp:J

    return-wide v0
.end method

.method public getWalletVersion()Ljava/lang/String;
    .locals 1

    .line 173
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->walletVersion:Ljava/lang/String;

    return-object v0
.end method

.method public setAppInfo(Ljava/lang/String;)V
    .locals 0

    .line 241
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->appInfo:Ljava/lang/String;

    .line 242
    return-void
.end method

.method public setCityCode(Ljava/lang/String;)V
    .locals 0

    .line 272
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->cityCode:Ljava/lang/String;

    .line 273
    return-void
.end method

.method public setContactNumber(Ljava/lang/String;)V
    .locals 0

    .line 185
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->contactNumber:Ljava/lang/String;

    .line 186
    return-void
.end method

.method public setCreditCallCenterNumber(Ljava/lang/String;)V
    .locals 0

    .line 201
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->creditCallCenterNumber:Ljava/lang/String;

    .line 202
    return-void
.end method

.method public setCreditTcUrl(Ljava/lang/String;)V
    .locals 0

    .line 217
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->creditTcUrl:Ljava/lang/String;

    .line 218
    return-void
.end method

.method public setCreditWebsite(Ljava/lang/String;)V
    .locals 0

    .line 233
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->creditWebsite:Ljava/lang/String;

    .line 234
    return-void
.end method

.method public setDebitCallCenterNumber(Ljava/lang/String;)V
    .locals 0

    .line 193
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->debitCallCenterNumber:Ljava/lang/String;

    .line 194
    return-void
.end method

.method public setDebitTcUrl(Ljava/lang/String;)V
    .locals 0

    .line 209
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->debitTcUrl:Ljava/lang/String;

    .line 210
    return-void
.end method

.method public setDebitWebsite(Ljava/lang/String;)V
    .locals 0

    .line 225
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->debitWebsite:Ljava/lang/String;

    .line 226
    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 137
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->description:Ljava/lang/String;

    .line 138
    return-void
.end method

.method public setIssuerId(Ljava/lang/String;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->issuerId:Ljava/lang/String;

    .line 122
    return-void
.end method

.method public setIssuerType(I)V
    .locals 0

    .line 153
    iput p1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->issuerType:I

    .line 154
    return-void
.end method

.method public setLogoUrl(Ljava/lang/String;)V
    .locals 0

    .line 145
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->logoUrl:Ljava/lang/String;

    .line 146
    return-void
.end method

.method public setMode(I)V
    .locals 0

    .line 169
    iput p1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->mode:I

    .line 170
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->name:Ljava/lang/String;

    .line 130
    return-void
.end method

.method public setPayType(Ljava/lang/String;)V
    .locals 0

    .line 280
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->payType:Ljava/lang/String;

    .line 281
    return-void
.end method

.method public setReservedInfo(Ljava/lang/String;)V
    .locals 0

    .line 257
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->reservedInfo:Ljava/lang/String;

    .line 258
    return-void
.end method

.method public setSn(I)V
    .locals 0

    .line 265
    iput p1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->sn:I

    .line 266
    return-void
.end method

.method public setSupportType(I)V
    .locals 0

    .line 161
    iput p1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->supportType:I

    .line 162
    return-void
.end method

.method public setTimeStamp(J)V
    .locals 0

    .line 249
    iput-wide p1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->timeStamp:J

    .line 250
    return-void
.end method

.method public setWalletVersion(Ljava/lang/String;)V
    .locals 0

    .line 177
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;->walletVersion:Ljava/lang/String;

    .line 178
    return-void
.end method
