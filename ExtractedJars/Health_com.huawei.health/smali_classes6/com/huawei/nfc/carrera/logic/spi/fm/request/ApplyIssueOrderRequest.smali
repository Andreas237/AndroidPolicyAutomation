.class public Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;
.super Lcom/huawei/nfc/carrera/logic/spi/fm/request/FMBaseRequest;
.source "SourceFile"


# instance fields
.field private actCode:[B

.field private aid:Ljava/lang/String;

.field private amount:I

.field private module:Ljava/lang/String;

.field private productCode:Ljava/lang/String;

.field private seid:[B


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/FMBaseRequest;-><init>()V

    return-void
.end method

.method public static build(I[BLjava/lang/String;[BLjava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;
    .locals 1

    .line 106
    new-instance v0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;-><init>()V

    .line 107
    iput p0, v0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->amount:I

    .line 108
    iput-object p1, v0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->seid:[B

    .line 109
    iput-object p2, v0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->module:Ljava/lang/String;

    .line 110
    iput-object p3, v0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->actCode:[B

    .line 111
    iput-object p4, v0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->aid:Ljava/lang/String;

    .line 112
    return-object v0
.end method

.method public static build(Ljava/lang/String;[BLjava/lang/String;[BLjava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;
    .locals 1

    .line 127
    new-instance v0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;-><init>()V

    .line 128
    iput-object p0, v0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->productCode:Ljava/lang/String;

    .line 129
    iput-object p1, v0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->seid:[B

    .line 130
    iput-object p2, v0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->module:Ljava/lang/String;

    .line 131
    iput-object p3, v0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->actCode:[B

    .line 132
    iput-object p4, v0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->aid:Ljava/lang/String;

    .line 133
    return-object v0
.end method


# virtual methods
.method public getActCode()[B
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->actCode:[B

    return-object v0
.end method

.method public getAid()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->aid:Ljava/lang/String;

    return-object v0
.end method

.method public getAmount()I
    .locals 1

    .line 17
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->amount:I

    return v0
.end method

.method public getModule()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->module:Ljava/lang/String;

    return-object v0
.end method

.method public getProductCode()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->productCode:Ljava/lang/String;

    return-object v0
.end method

.method public getSeid()[B
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->seid:[B

    return-object v0
.end method

.method public setActCode([B)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->actCode:[B

    .line 46
    return-void
.end method

.method public setAid(Ljava/lang/String;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->aid:Ljava/lang/String;

    .line 54
    return-void
.end method

.method public setAmount(I)V
    .locals 0

    .line 33
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->amount:I

    .line 34
    return-void
.end method

.method public setModule(Ljava/lang/String;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->module:Ljava/lang/String;

    .line 42
    return-void
.end method

.method public setProductCode(Ljava/lang/String;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->productCode:Ljava/lang/String;

    .line 62
    return-void
.end method

.method public setSeid([B)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyIssueOrderRequest;->seid:[B

    .line 38
    return-void
.end method
