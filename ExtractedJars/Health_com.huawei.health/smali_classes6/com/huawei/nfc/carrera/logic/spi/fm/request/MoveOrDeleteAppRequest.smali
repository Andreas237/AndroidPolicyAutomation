.class public Lcom/huawei/nfc/carrera/logic/spi/fm/request/MoveOrDeleteAppRequest;
.super Lcom/huawei/nfc/carrera/logic/spi/fm/request/FMBaseRequest;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/logic/spi/fm/request/MoveOrDeleteAppRequest$MoveOrDeleteAppRequestSAI5;,
        Lcom/huawei/nfc/carrera/logic/spi/fm/request/MoveOrDeleteAppRequest$MoveOrDeleteAppRequestSAI4;,
        Lcom/huawei/nfc/carrera/logic/spi/fm/request/MoveOrDeleteAppRequest$MoveOrDeleteAppRequestSAI3;,
        Lcom/huawei/nfc/carrera/logic/spi/fm/request/MoveOrDeleteAppRequest$MoveOrDeleteAppRequestSAI2;,
        Lcom/huawei/nfc/carrera/logic/spi/fm/request/MoveOrDeleteAppRequest$MoveOrDeleteAppRequestSAI1;
    }
.end annotation


# instance fields
.field private manageCode:[B

.field private module:Ljava/lang/String;

.field private seid:[B


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/FMBaseRequest;-><init>()V

    return-void
.end method

.method public static build([B[BLjava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/request/MoveOrDeleteAppRequest;
    .locals 1

    .line 67
    new-instance v0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/MoveOrDeleteAppRequest;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/MoveOrDeleteAppRequest;-><init>()V

    .line 68
    iput-object p0, v0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/MoveOrDeleteAppRequest;->manageCode:[B

    .line 69
    iput-object p1, v0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/MoveOrDeleteAppRequest;->seid:[B

    .line 70
    iput-object p2, v0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/MoveOrDeleteAppRequest;->module:Ljava/lang/String;

    .line 71
    return-object v0
.end method


# virtual methods
.method public getManageCode()[B
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/MoveOrDeleteAppRequest;->manageCode:[B

    return-object v0
.end method

.method public getModule()Ljava/lang/String;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/MoveOrDeleteAppRequest;->module:Ljava/lang/String;

    return-object v0
.end method

.method public getSeid()[B
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/MoveOrDeleteAppRequest;->seid:[B

    return-object v0
.end method

.method public setManageCode([B)V
    .locals 0

    .line 17
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/MoveOrDeleteAppRequest;->manageCode:[B

    .line 18
    return-void
.end method

.method public setModule(Ljava/lang/String;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/MoveOrDeleteAppRequest;->module:Ljava/lang/String;

    .line 26
    return-void
.end method

.method public setSeid([B)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/MoveOrDeleteAppRequest;->seid:[B

    .line 22
    return-void
.end method
