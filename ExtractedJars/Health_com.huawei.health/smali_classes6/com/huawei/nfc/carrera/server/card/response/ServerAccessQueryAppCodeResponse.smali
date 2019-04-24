.class public Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAppCodeResponse;
.super Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;
.source "SourceFile"


# instance fields
.field private availableCity:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/server/card/model/ServerAccessLntCityInfo;>;"
        }
    .end annotation
.end field

.field private recommendedCity:Lcom/huawei/nfc/carrera/server/card/model/ServerAccessLntCityInfo;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;-><init>()V

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAppCodeResponse;->availableCity:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getAvailableCity()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/nfc/carrera/server/card/model/ServerAccessLntCityInfo;>;"
        }
    .end annotation

    .line 26
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAppCodeResponse;->availableCity:Ljava/util/List;

    return-object v0
.end method

.method public getRecommendedCity()Lcom/huawei/nfc/carrera/server/card/model/ServerAccessLntCityInfo;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAppCodeResponse;->recommendedCity:Lcom/huawei/nfc/carrera/server/card/model/ServerAccessLntCityInfo;

    return-object v0
.end method

.method public setAvailableCity(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/server/card/model/ServerAccessLntCityInfo;>;)V"
        }
    .end annotation

    .line 30
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAppCodeResponse;->availableCity:Ljava/util/List;

    .line 31
    return-void
.end method

.method public setRecommendedCity(Lcom/huawei/nfc/carrera/server/card/model/ServerAccessLntCityInfo;)V
    .locals 0

    .line 34
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAppCodeResponse;->recommendedCity:Lcom/huawei/nfc/carrera/server/card/model/ServerAccessLntCityInfo;

    .line 35
    return-void
.end method
