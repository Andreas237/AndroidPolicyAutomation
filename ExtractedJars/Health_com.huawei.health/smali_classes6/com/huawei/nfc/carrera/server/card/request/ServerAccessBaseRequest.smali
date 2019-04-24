.class public Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;
.super Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;
.source "SourceFile"


# static fields
.field public static final PAY_TYPE_HUAWEIPAY:Ljava/lang/String; = "Huaweipay"

.field public static final SE_CHIP_MANUFACTURER_HISEE:Ljava/lang/String; = "02"

.field public static final SE_CHIP_MANUFACTURER_NXP:Ljava/lang/String; = "01"


# instance fields
.field private appletAid:Ljava/lang/String;

.field private basebandVersion:Ljava/lang/String;

.field private cardId:Ljava/lang/String;

.field private cplc:Ljava/lang/String;

.field private deviceModel:Ljava/lang/String;

.field private imei:Ljava/lang/String;

.field private issuerId:Ljava/lang/String;

.field private orderId:Ljava/lang/String;

.field private payType:Ljava/lang/String;

.field private phoneManufacturer:Ljava/lang/String;

.field private phoneNumber:Ljava/lang/String;

.field private reserved:Ljava/lang/String;

.field private seChipManuFacturer:Ljava/lang/String;

.field private seCosVersion:Ljava/lang/String;

.field private sn:Ljava/lang/String;

.field private systemType:Ljava/lang/String;

.field private systemVersion:Ljava/lang/String;

.field private userID:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;-><init>()V

    .line 33
    const-string v0, "Huaweipay"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->payType:Ljava/lang/String;

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->issuerId:Ljava/lang/String;

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->userID:Ljava/lang/String;

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->phoneNumber:Ljava/lang/String;

    .line 53
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->cplc:Ljava/lang/String;

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->appletAid:Ljava/lang/String;

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->reserved:Ljava/lang/String;

    .line 68
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->seChipManuFacturer:Ljava/lang/String;

    .line 73
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->deviceModel:Ljava/lang/String;

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->imei:Ljava/lang/String;

    .line 83
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->sn:Ljava/lang/String;

    .line 88
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->phoneManufacturer:Ljava/lang/String;

    .line 93
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->cardId:Ljava/lang/String;

    .line 98
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->basebandVersion:Ljava/lang/String;

    .line 103
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->systemType:Ljava/lang/String;

    .line 108
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->systemVersion:Ljava/lang/String;

    .line 114
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->seCosVersion:Ljava/lang/String;

    .line 120
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->orderId:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getAppletAid()Ljava/lang/String;
    .locals 1

    .line 194
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->appletAid:Ljava/lang/String;

    return-object v0
.end method

.method public getBasebandVersion()Ljava/lang/String;
    .locals 1

    .line 226
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->basebandVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getCardId()Ljava/lang/String;
    .locals 1

    .line 218
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->cardId:Ljava/lang/String;

    return-object v0
.end method

.method public getCplc()Ljava/lang/String;
    .locals 1

    .line 186
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->cplc:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceModel()Ljava/lang/String;
    .locals 1

    .line 144
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->deviceModel:Ljava/lang/String;

    return-object v0
.end method

.method public getImei()Ljava/lang/String;
    .locals 1

    .line 202
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->imei:Ljava/lang/String;

    return-object v0
.end method

.method public getIssuerId()Ljava/lang/String;
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->issuerId:Ljava/lang/String;

    return-object v0
.end method

.method public getOrderId()Ljava/lang/String;
    .locals 1

    .line 258
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->orderId:Ljava/lang/String;

    return-object v0
.end method

.method public getPayType()Ljava/lang/String;
    .locals 1

    .line 154
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->payType:Ljava/lang/String;

    return-object v0
.end method

.method public getPhoneManufacturer()Ljava/lang/String;
    .locals 1

    .line 210
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->phoneManufacturer:Ljava/lang/String;

    return-object v0
.end method

.method public getPhoneNumber()Ljava/lang/String;
    .locals 1

    .line 178
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->phoneNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getReserved()Ljava/lang/String;
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->reserved:Ljava/lang/String;

    return-object v0
.end method

.method public getSeChipManuFacturer()Ljava/lang/String;
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->seChipManuFacturer:Ljava/lang/String;

    return-object v0
.end method

.method public getSeCosVersion()Ljava/lang/String;
    .locals 1

    .line 250
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->seCosVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getSn()Ljava/lang/String;
    .locals 1

    .line 266
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->sn:Ljava/lang/String;

    return-object v0
.end method

.method public getSystemType()Ljava/lang/String;
    .locals 1

    .line 234
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->systemType:Ljava/lang/String;

    return-object v0
.end method

.method public getSystemVersion()Ljava/lang/String;
    .locals 1

    .line 242
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->systemVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getUserID()Ljava/lang/String;
    .locals 1

    .line 170
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->userID:Ljava/lang/String;

    return-object v0
.end method

.method public setAppletAid(Ljava/lang/String;)V
    .locals 0

    .line 198
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->appletAid:Ljava/lang/String;

    .line 199
    return-void
.end method

.method public setBasebandVersion(Ljava/lang/String;)V
    .locals 0

    .line 230
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->basebandVersion:Ljava/lang/String;

    .line 231
    return-void
.end method

.method public setCardId(Ljava/lang/String;)V
    .locals 0

    .line 222
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->cardId:Ljava/lang/String;

    .line 223
    return-void
.end method

.method public setCplc(Ljava/lang/String;)V
    .locals 0

    .line 190
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->cplc:Ljava/lang/String;

    .line 191
    return-void
.end method

.method public setDeviceModel(Ljava/lang/String;)V
    .locals 0

    .line 149
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->deviceModel:Ljava/lang/String;

    .line 150
    return-void
.end method

.method public setImei(Ljava/lang/String;)V
    .locals 0

    .line 206
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->imei:Ljava/lang/String;

    .line 207
    return-void
.end method

.method public setIssuerId(Ljava/lang/String;)V
    .locals 0

    .line 166
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->issuerId:Ljava/lang/String;

    .line 167
    return-void
.end method

.method public setOrderId(Ljava/lang/String;)V
    .locals 0

    .line 262
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->orderId:Ljava/lang/String;

    .line 263
    return-void
.end method

.method public setPayType(Ljava/lang/String;)V
    .locals 0

    .line 158
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->payType:Ljava/lang/String;

    .line 159
    return-void
.end method

.method public setPhoneManufacturer(Ljava/lang/String;)V
    .locals 0

    .line 214
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->phoneManufacturer:Ljava/lang/String;

    .line 215
    return-void
.end method

.method public setPhoneNumber(Ljava/lang/String;)V
    .locals 0

    .line 182
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->phoneNumber:Ljava/lang/String;

    .line 183
    return-void
.end method

.method public setReserved(Ljava/lang/String;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->reserved:Ljava/lang/String;

    .line 130
    return-void
.end method

.method public setSeChipManuFacturer(Ljava/lang/String;)V
    .locals 0

    .line 139
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->seChipManuFacturer:Ljava/lang/String;

    .line 140
    return-void
.end method

.method public setSeCosVersion(Ljava/lang/String;)V
    .locals 0

    .line 254
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->seCosVersion:Ljava/lang/String;

    .line 255
    return-void
.end method

.method public setSn(Ljava/lang/String;)V
    .locals 0

    .line 270
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->sn:Ljava/lang/String;

    .line 271
    return-void
.end method

.method public setSystemType(Ljava/lang/String;)V
    .locals 0

    .line 238
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->systemType:Ljava/lang/String;

    .line 239
    return-void
.end method

.method public setSystemVersion(Ljava/lang/String;)V
    .locals 0

    .line 246
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->systemVersion:Ljava/lang/String;

    .line 247
    return-void
.end method

.method public setUserID(Ljava/lang/String;)V
    .locals 0

    .line 174
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;->userID:Ljava/lang/String;

    .line 175
    return-void
.end method
