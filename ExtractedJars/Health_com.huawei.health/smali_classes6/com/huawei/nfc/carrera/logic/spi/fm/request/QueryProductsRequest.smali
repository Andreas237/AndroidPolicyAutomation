.class public Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryProductsRequest;
.super Lcom/huawei/nfc/carrera/logic/spi/fm/request/FMBaseRequest;
.source "SourceFile"


# instance fields
.field private aid:Ljava/lang/String;

.field private city4Current:Ljava/lang/String;

.field private city4sim:Ljava/lang/String;

.field private deviceModel:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 4
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/FMBaseRequest;-><init>()V

    return-void
.end method


# virtual methods
.method public getAid()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryProductsRequest;->aid:Ljava/lang/String;

    return-object v0
.end method

.method public getCity4Current()Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryProductsRequest;->city4Current:Ljava/lang/String;

    return-object v0
.end method

.method public getCity4sim()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryProductsRequest;->city4sim:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceModel()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryProductsRequest;->deviceModel:Ljava/lang/String;

    return-object v0
.end method

.method public setAid(Ljava/lang/String;)V
    .locals 0

    .line 16
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryProductsRequest;->aid:Ljava/lang/String;

    .line 17
    return-void
.end method

.method public setCity4Current(Ljava/lang/String;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryProductsRequest;->city4Current:Ljava/lang/String;

    .line 41
    return-void
.end method

.method public setCity4sim(Ljava/lang/String;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryProductsRequest;->city4sim:Ljava/lang/String;

    .line 33
    return-void
.end method

.method public setDeviceModel(Ljava/lang/String;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryProductsRequest;->deviceModel:Ljava/lang/String;

    .line 25
    return-void
.end method
