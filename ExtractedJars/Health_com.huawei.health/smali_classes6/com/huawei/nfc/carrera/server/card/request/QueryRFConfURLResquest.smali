.class public Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;
.super Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;
.source "SourceFile"


# instance fields
.field private issuerId:Ljava/lang/String;

.field private model:Ljava/lang/String;

.field private romVersion:Ljava/lang/String;

.field private timestamp:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;->model:Ljava/lang/String;

    .line 33
    iput-object p2, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;->romVersion:Ljava/lang/String;

    .line 34
    iput-object p3, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;->issuerId:Ljava/lang/String;

    .line 35
    iput-wide p4, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;->timestamp:J

    .line 36
    return-void
.end method


# virtual methods
.method public getIssuerId()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;->issuerId:Ljava/lang/String;

    return-object v0
.end method

.method public getModel()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;->model:Ljava/lang/String;

    return-object v0
.end method

.method public getRomVersion()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;->romVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getTimeStamp()J
    .locals 2

    .line 70
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;->timestamp:J

    return-wide v0
.end method

.method public setIssuerId(Ljava/lang/String;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;->issuerId:Ljava/lang/String;

    .line 66
    return-void
.end method

.method public setModel(Ljava/lang/String;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;->model:Ljava/lang/String;

    .line 46
    return-void
.end method

.method public setRomVersion(Ljava/lang/String;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;->romVersion:Ljava/lang/String;

    .line 56
    return-void
.end method

.method public setTimeStamp(J)V
    .locals 0

    .line 75
    iput-wide p1, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;->timestamp:J

    .line 76
    return-void
.end method
