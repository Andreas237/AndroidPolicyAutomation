.class public Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAppCodeResponse;
.super Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;
.source "SourceFile"


# instance fields
.field private availableCity:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/LntCityInfo;>;"
        }
    .end annotation
.end field

.field private recommendedCity:Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/LntCityInfo;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getAvailableCity()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/LntCityInfo;>;"
        }
    .end annotation

    .line 24
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAppCodeResponse;->availableCity:Ljava/util/List;

    return-object v0
.end method

.method public getRecommendedCity()Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/LntCityInfo;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAppCodeResponse;->recommendedCity:Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/LntCityInfo;

    return-object v0
.end method

.method public setAvailableCity(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/LntCityInfo;>;)V"
        }
    .end annotation

    .line 28
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAppCodeResponse;->availableCity:Ljava/util/List;

    .line 29
    return-void
.end method

.method public setRecommendedCity(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/LntCityInfo;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAppCodeResponse;->recommendedCity:Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/LntCityInfo;

    .line 33
    return-void
.end method
