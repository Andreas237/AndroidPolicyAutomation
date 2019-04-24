.class public Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;
.super Lcom/huawei/nfc/carrera/logic/spi/fm/request/FMBaseRequest;
.source "SourceFile"


# instance fields
.field private aid:Ljava/lang/String;

.field private businessOrderType:I

.field private orderStatuses:[I

.field private seid:[B

.field private start:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/FMBaseRequest;-><init>()V

    return-void
.end method

.method public static build(I[II[BLjava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;
    .locals 1

    .line 53
    new-instance v0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;-><init>()V

    .line 54
    iput p0, v0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->start:I

    .line 55
    iput-object p1, v0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->orderStatuses:[I

    .line 56
    iput p2, v0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->businessOrderType:I

    .line 57
    iput-object p3, v0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->seid:[B

    .line 58
    iput-object p4, v0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->aid:Ljava/lang/String;

    .line 59
    return-object v0
.end method


# virtual methods
.method public getAid()Ljava/lang/String;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->aid:Ljava/lang/String;

    return-object v0
.end method

.method public getBusinessOrderType()I
    .locals 1

    .line 79
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->businessOrderType:I

    return v0
.end method

.method public getOrderStatuses()[I
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->orderStatuses:[I

    return-object v0
.end method

.method public getSeid()[B
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->seid:[B

    return-object v0
.end method

.method public getStart()I
    .locals 1

    .line 63
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->start:I

    return v0
.end method

.method public setAid(Ljava/lang/String;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->aid:Ljava/lang/String;

    .line 101
    return-void
.end method

.method public setBusinessOrderType(I)V
    .locals 0

    .line 83
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->businessOrderType:I

    .line 84
    return-void
.end method

.method public setOrderStatuses([I)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->orderStatuses:[I

    .line 76
    return-void
.end method

.method public setSeid([B)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->seid:[B

    .line 93
    return-void
.end method

.method public setStart(I)V
    .locals 0

    .line 67
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->start:I

    .line 68
    return-void
.end method
