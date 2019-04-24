.class public Lcom/leisen/wallet/sdk/AppConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final APDU_GETCIN:Ljava/lang/String; = "80CA004500"

.field public static final APDU_GETCPLC:Ljava/lang/String; = "80CA9f7f00"

.field public static final APDU_GETIIN:Ljava/lang/String; = "80CA004200"

.field public static final CLIENTVERSION:Ljava/lang/String; = "2.0.6"

.field public static final VERSION:Ljava/lang/String; = "1.0"

.field private static imei:Ljava/lang/String; = null

.field private static mobileType:Ljava/lang/String; = null

.field private static streamUrl:Ljava/lang/String; = null


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 17
    const-string v0, "https://tsm.hicloud.com:9001/TSMAPKP/HwTSMServer/applicationBusiness.action"

    sput-object v0, Lcom/leisen/wallet/sdk/AppConfig;->streamUrl:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getImei()Ljava/lang/String;
    .locals 1

    .line 49
    sget-object v0, Lcom/leisen/wallet/sdk/AppConfig;->imei:Ljava/lang/String;

    return-object v0
.end method

.method private static getImei(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 82
    invoke-static {p0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->getDeviceSN()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getMobileType()Ljava/lang/String;
    .locals 1

    .line 53
    sget-object v0, Lcom/leisen/wallet/sdk/AppConfig;->mobileType:Ljava/lang/String;

    return-object v0
.end method

.method private static getModel(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 62
    invoke-static {p0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->getDeviceModel()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getStreamUrl()Ljava/lang/String;
    .locals 1

    .line 28
    sget-object v0, Lcom/leisen/wallet/sdk/AppConfig;->streamUrl:Ljava/lang/String;

    return-object v0
.end method

.method public static final init(Landroid/content/Context;)V
    .locals 1

    .line 35
    invoke-static {p0}, Lcom/leisen/wallet/sdk/AppConfig;->getImei(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/leisen/wallet/sdk/AppConfig;->imei:Ljava/lang/String;

    .line 36
    invoke-static {p0}, Lcom/leisen/wallet/sdk/AppConfig;->getModel(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/leisen/wallet/sdk/AppConfig;->setMobileType(Ljava/lang/String;)V

    .line 37
    return-void
.end method

.method public static setImei(Ljava/lang/String;)V
    .locals 0

    .line 41
    sput-object p0, Lcom/leisen/wallet/sdk/AppConfig;->imei:Ljava/lang/String;

    .line 42
    return-void
.end method

.method public static setMobileType(Ljava/lang/String;)V
    .locals 0

    .line 45
    sput-object p0, Lcom/leisen/wallet/sdk/AppConfig;->mobileType:Ljava/lang/String;

    .line 46
    return-void
.end method

.method public static setStreamUrl(Ljava/lang/String;)V
    .locals 0

    .line 32
    sput-object p0, Lcom/leisen/wallet/sdk/AppConfig;->streamUrl:Ljava/lang/String;

    .line 33
    return-void
.end method
