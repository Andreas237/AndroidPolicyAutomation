.class public Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAppCodeRequest;
.super Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;
.source "SourceFile"


# instance fields
.field private latitude:Ljava/lang/String;

.field private longitude:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAppCodeRequest;->longitude:Ljava/lang/String;

    .line 14
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAppCodeRequest;->latitude:Ljava/lang/String;

    .line 15
    invoke-virtual {p0, p3}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAppCodeRequest;->setCplc(Ljava/lang/String;)V

    .line 16
    invoke-virtual {p0, p4}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAppCodeRequest;->setDeviceModel(Ljava/lang/String;)V

    .line 18
    invoke-virtual {p0, p5}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAppCodeRequest;->setSn(Ljava/lang/String;)V

    .line 19
    return-void
.end method


# virtual methods
.method public getLatitude()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAppCodeRequest;->latitude:Ljava/lang/String;

    return-object v0
.end method

.method public getLongitude()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAppCodeRequest;->longitude:Ljava/lang/String;

    return-object v0
.end method

.method public setLatitude(Ljava/lang/String;)V
    .locals 0

    .line 34
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAppCodeRequest;->latitude:Ljava/lang/String;

    .line 35
    return-void
.end method

.method public setLongitude(Ljava/lang/String;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAppCodeRequest;->longitude:Ljava/lang/String;

    .line 27
    return-void
.end method
