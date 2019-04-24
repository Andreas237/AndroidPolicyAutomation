.class public Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/LntCityInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final CITY_ID_LNT_ALL:Ljava/lang/String; = "00"

.field public static final CITY_ID_LNT_GZ:Ljava/lang/String; = "01"

.field public static final SERVER_CITY_ID_LNT_ALL:Ljava/lang/String; = "9000"

.field public static final SERVER_CITY_ID_LNT_GZ:Ljava/lang/String; = "0020"


# instance fields
.field private appCode:Ljava/lang/String;

.field private cityName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/LntCityInfo;->appCode:Ljava/lang/String;

    .line 42
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/LntCityInfo;->cityName:Ljava/lang/String;

    .line 43
    return-void
.end method


# virtual methods
.method public getAppCode()Ljava/lang/String;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/LntCityInfo;->appCode:Ljava/lang/String;

    return-object v0
.end method

.method public getCityName()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/LntCityInfo;->cityName:Ljava/lang/String;

    return-object v0
.end method

.method public setAppCode(Ljava/lang/String;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/LntCityInfo;->appCode:Ljava/lang/String;

    .line 51
    return-void
.end method

.method public setCityName(Ljava/lang/String;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/LntCityInfo;->cityName:Ljava/lang/String;

    .line 59
    return-void
.end method
