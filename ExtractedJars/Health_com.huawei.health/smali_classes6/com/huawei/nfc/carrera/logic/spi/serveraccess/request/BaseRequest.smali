.class public Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final PAY_TYPE_HUAWEIPAY:Ljava/lang/String; = "Huaweipay"

.field public static final PAY_TYPE_HUAWEIPAY_UNION:Ljava/lang/String; = "huaweipayonline"

.field public static final PAY_TYPE_HUAWEIPAY_WALLET:Ljava/lang/String; = "IAP"

.field public static final PAY_TYPE_WECHAT:Ljava/lang/String; = "wechat"

.field public static final SE_CHIP_MANUFACTURER_HISEE:Ljava/lang/String; = "02"

.field public static final SE_CHIP_MANUFACTURER_NXP:Ljava/lang/String; = "01"


# instance fields
.field private accountUserId:Ljava/lang/String;

.field private appletAid:Ljava/lang/String;

.field private basebandVersion:Ljava/lang/String;

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

.field private trafficCardId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    const-string v0, "Huaweipay"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->payType:Ljava/lang/String;

    .line 53
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->issuerId:Ljava/lang/String;

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->accountUserId:Ljava/lang/String;

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->phoneNumber:Ljava/lang/String;

    .line 68
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->cplc:Ljava/lang/String;

    .line 73
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->appletAid:Ljava/lang/String;

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->reserved:Ljava/lang/String;

    .line 83
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->seChipManuFacturer:Ljava/lang/String;

    .line 88
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->deviceModel:Ljava/lang/String;

    .line 93
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->imei:Ljava/lang/String;

    .line 97
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->sn:Ljava/lang/String;

    .line 102
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->phoneManufacturer:Ljava/lang/String;

    .line 107
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->trafficCardId:Ljava/lang/String;

    .line 112
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->basebandVersion:Ljava/lang/String;

    .line 117
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->systemType:Ljava/lang/String;

    .line 122
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->systemVersion:Ljava/lang/String;

    .line 127
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->seCosVersion:Ljava/lang/String;

    .line 132
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->orderId:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getAccountUserId()Ljava/lang/String;
    .locals 1

    .line 181
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->accountUserId:Ljava/lang/String;

    return-object v0
.end method

.method public getAppletAid()Ljava/lang/String;
    .locals 1

    .line 205
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->appletAid:Ljava/lang/String;

    return-object v0
.end method

.method public getBasebandVersion()Ljava/lang/String;
    .locals 1

    .line 237
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->basebandVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getCplc()Ljava/lang/String;
    .locals 1

    .line 197
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->cplc:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceModel()Ljava/lang/String;
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->deviceModel:Ljava/lang/String;

    return-object v0
.end method

.method public getImei()Ljava/lang/String;
    .locals 1

    .line 213
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->imei:Ljava/lang/String;

    return-object v0
.end method

.method public getIssuerId()Ljava/lang/String;
    .locals 1

    .line 173
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->issuerId:Ljava/lang/String;

    return-object v0
.end method

.method public getOrderId()Ljava/lang/String;
    .locals 1

    .line 269
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->orderId:Ljava/lang/String;

    return-object v0
.end method

.method public getPayType()Ljava/lang/String;
    .locals 1

    .line 165
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->payType:Ljava/lang/String;

    return-object v0
.end method

.method public getPhoneManufacturer()Ljava/lang/String;
    .locals 1

    .line 221
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->phoneManufacturer:Ljava/lang/String;

    return-object v0
.end method

.method public getPhoneNumber()Ljava/lang/String;
    .locals 1

    .line 189
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->phoneNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getReserved()Ljava/lang/String;
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->reserved:Ljava/lang/String;

    return-object v0
.end method

.method public getSeChipManuFacturer()Ljava/lang/String;
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->seChipManuFacturer:Ljava/lang/String;

    return-object v0
.end method

.method public getSeCosVersion()Ljava/lang/String;
    .locals 1

    .line 261
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->seCosVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getSn()Ljava/lang/String;
    .locals 1

    .line 277
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->sn:Ljava/lang/String;

    return-object v0
.end method

.method public getSystemType()Ljava/lang/String;
    .locals 1

    .line 245
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->systemType:Ljava/lang/String;

    return-object v0
.end method

.method public getSystemVersion()Ljava/lang/String;
    .locals 1

    .line 253
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->systemVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getTrafficCardId()Ljava/lang/String;
    .locals 1

    .line 229
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->trafficCardId:Ljava/lang/String;

    return-object v0
.end method

.method public setAccountUserId(Ljava/lang/String;)V
    .locals 0

    .line 185
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->accountUserId:Ljava/lang/String;

    .line 186
    return-void
.end method

.method public setAppletAid(Ljava/lang/String;)V
    .locals 0

    .line 209
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->appletAid:Ljava/lang/String;

    .line 210
    return-void
.end method

.method public setBasebandVersion(Ljava/lang/String;)V
    .locals 0

    .line 241
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->basebandVersion:Ljava/lang/String;

    .line 242
    return-void
.end method

.method public setCplc(Ljava/lang/String;)V
    .locals 0

    .line 201
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->cplc:Ljava/lang/String;

    .line 202
    return-void
.end method

.method public setDeviceModel(Ljava/lang/String;)V
    .locals 0

    .line 161
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->deviceModel:Ljava/lang/String;

    .line 162
    return-void
.end method

.method public setImei(Ljava/lang/String;)V
    .locals 0

    .line 217
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->imei:Ljava/lang/String;

    .line 218
    return-void
.end method

.method public setIssuerId(Ljava/lang/String;)V
    .locals 0

    .line 177
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->issuerId:Ljava/lang/String;

    .line 178
    return-void
.end method

.method public setOrderId(Ljava/lang/String;)V
    .locals 0

    .line 273
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->orderId:Ljava/lang/String;

    .line 274
    return-void
.end method

.method public setPayType(Ljava/lang/String;)V
    .locals 0

    .line 169
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->payType:Ljava/lang/String;

    .line 170
    return-void
.end method

.method public setPhoneManufacturer(Ljava/lang/String;)V
    .locals 0

    .line 225
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->phoneManufacturer:Ljava/lang/String;

    .line 226
    return-void
.end method

.method public setPhoneNumber(Ljava/lang/String;)V
    .locals 0

    .line 193
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->phoneNumber:Ljava/lang/String;

    .line 194
    return-void
.end method

.method public setReserved(Ljava/lang/String;)V
    .locals 0

    .line 141
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->reserved:Ljava/lang/String;

    .line 142
    return-void
.end method

.method public setSeChipManuFacturer(Ljava/lang/String;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->seChipManuFacturer:Ljava/lang/String;

    .line 152
    return-void
.end method

.method public setSeCosVersion(Ljava/lang/String;)V
    .locals 0

    .line 265
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->seCosVersion:Ljava/lang/String;

    .line 266
    return-void
.end method

.method public setSn(Ljava/lang/String;)V
    .locals 0

    .line 281
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->sn:Ljava/lang/String;

    .line 282
    return-void
.end method

.method public setSystemType(Ljava/lang/String;)V
    .locals 0

    .line 249
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->systemType:Ljava/lang/String;

    .line 250
    return-void
.end method

.method public setSystemVersion(Ljava/lang/String;)V
    .locals 0

    .line 257
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->systemVersion:Ljava/lang/String;

    .line 258
    return-void
.end method

.method public setTrafficCardId(Ljava/lang/String;)V
    .locals 0

    .line 233
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;->trafficCardId:Ljava/lang/String;

    .line 234
    return-void
.end method
