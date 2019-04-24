.class public Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private description:Ljava/lang/String;

.field private fontColor:Ljava/lang/String;

.field private issuerId:Ljava/lang/String;

.field private mktInfo:Ljava/lang/String;

.field private pictureUrl:Ljava/lang/String;

.field private productId:Ljava/lang/String;

.field private productName:Ljava/lang/String;

.field private reserved1:Ljava/lang/String;

.field private reserved2:Ljava/lang/String;

.field private reserved3:Ljava/lang/String;

.field private reserved4:Ljava/lang/String;

.field private reserved5:Ljava/lang/String;

.field private reserved6:Ljava/lang/String;

.field private reservedInfo:Ljava/lang/String;

.field private timeStamp:J

.field private type:I

.field private version:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBundle()Landroid/os/Bundle;
    .locals 4

    .line 274
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 275
    const-string v0, "productId"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->getProductId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 276
    const-string v0, "productName"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->getProductName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    const-string v0, "pictureUrl"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->getPictureUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    const-string v0, "description"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 279
    const-string v0, "type"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->getType()I

    move-result v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 280
    const-string v0, "timeStamp"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->getTimeStamp()J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 281
    const-string v0, "version"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->getVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    const-string v0, "issuerId"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    const-string v0, "mktInfo"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->getMktInfo()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    const-string v0, "reservedInfo"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->getReservedInfo()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    const-string v0, "fontColor"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->getFontColor()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    const-string v0, "reserved1"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->getReserved1()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    const-string v0, "reserved2"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->getReserved2()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    const-string v0, "reserved3"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->getReserved3()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    const-string v0, "reserved4"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->getReserved4()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    const-string v0, "reserved5"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->getReserved5()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 291
    const-string v0, "reserved6"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->getReserved6()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 292
    return-object v3
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getFontColor()Ljava/lang/String;
    .locals 1

    .line 204
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->fontColor:Ljava/lang/String;

    return-object v0
.end method

.method public getIssuerId()Ljava/lang/String;
    .locals 1

    .line 174
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->issuerId:Ljava/lang/String;

    return-object v0
.end method

.method public getMktInfo()Ljava/lang/String;
    .locals 1

    .line 184
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->mktInfo:Ljava/lang/String;

    return-object v0
.end method

.method public getPictureUrl()Ljava/lang/String;
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->pictureUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getProductId()Ljava/lang/String;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->productId:Ljava/lang/String;

    return-object v0
.end method

.method public getProductName()Ljava/lang/String;
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->productName:Ljava/lang/String;

    return-object v0
.end method

.method public getReserved1()Ljava/lang/String;
    .locals 1

    .line 214
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->reserved1:Ljava/lang/String;

    return-object v0
.end method

.method public getReserved2()Ljava/lang/String;
    .locals 1

    .line 224
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->reserved2:Ljava/lang/String;

    return-object v0
.end method

.method public getReserved3()Ljava/lang/String;
    .locals 1

    .line 234
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->reserved3:Ljava/lang/String;

    return-object v0
.end method

.method public getReserved4()Ljava/lang/String;
    .locals 1

    .line 244
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->reserved4:Ljava/lang/String;

    return-object v0
.end method

.method public getReserved5()Ljava/lang/String;
    .locals 1

    .line 254
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->reserved5:Ljava/lang/String;

    return-object v0
.end method

.method public getReserved6()Ljava/lang/String;
    .locals 1

    .line 264
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->reserved6:Ljava/lang/String;

    return-object v0
.end method

.method public getReservedInfo()Ljava/lang/String;
    .locals 1

    .line 194
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->reservedInfo:Ljava/lang/String;

    return-object v0
.end method

.method public getTimeStamp()J
    .locals 2

    .line 154
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->timeStamp:J

    return-wide v0
.end method

.method public getType()I
    .locals 1

    .line 144
    iget v0, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->type:I

    return v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->version:Ljava/lang/String;

    return-object v0
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 139
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->description:Ljava/lang/String;

    .line 140
    return-void
.end method

.method public setFontColor(Ljava/lang/String;)V
    .locals 0

    .line 209
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->fontColor:Ljava/lang/String;

    .line 210
    return-void
.end method

.method public setIssuerId(Ljava/lang/String;)V
    .locals 0

    .line 179
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->issuerId:Ljava/lang/String;

    .line 180
    return-void
.end method

.method public setMktInfo(Ljava/lang/String;)V
    .locals 0

    .line 189
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->mktInfo:Ljava/lang/String;

    .line 190
    return-void
.end method

.method public setPictureUrl(Ljava/lang/String;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->pictureUrl:Ljava/lang/String;

    .line 130
    return-void
.end method

.method public setProductId(Ljava/lang/String;)V
    .locals 0

    .line 109
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->productId:Ljava/lang/String;

    .line 110
    return-void
.end method

.method public setProductName(Ljava/lang/String;)V
    .locals 0

    .line 119
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->productName:Ljava/lang/String;

    .line 120
    return-void
.end method

.method public setReserved1(Ljava/lang/String;)V
    .locals 0

    .line 219
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->reserved1:Ljava/lang/String;

    .line 220
    return-void
.end method

.method public setReserved2(Ljava/lang/String;)V
    .locals 0

    .line 229
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->reserved2:Ljava/lang/String;

    .line 230
    return-void
.end method

.method public setReserved3(Ljava/lang/String;)V
    .locals 0

    .line 239
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->reserved3:Ljava/lang/String;

    .line 240
    return-void
.end method

.method public setReserved4(Ljava/lang/String;)V
    .locals 0

    .line 249
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->reserved4:Ljava/lang/String;

    .line 250
    return-void
.end method

.method public setReserved5(Ljava/lang/String;)V
    .locals 0

    .line 259
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->reserved5:Ljava/lang/String;

    .line 260
    return-void
.end method

.method public setReserved6(Ljava/lang/String;)V
    .locals 0

    .line 269
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->reserved6:Ljava/lang/String;

    .line 270
    return-void
.end method

.method public setReservedInfo(Ljava/lang/String;)V
    .locals 0

    .line 199
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->reservedInfo:Ljava/lang/String;

    .line 200
    return-void
.end method

.method public setTimeStamp(J)V
    .locals 0

    .line 159
    iput-wide p1, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->timeStamp:J

    .line 160
    return-void
.end method

.method public setType(I)V
    .locals 0

    .line 149
    iput p1, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->type:I

    .line 150
    return-void
.end method

.method public setVersion(Ljava/lang/String;)V
    .locals 0

    .line 169
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->version:Ljava/lang/String;

    .line 170
    return-void
.end method
