.class public Lcom/huawei/nfc/carrera/server/card/request/PushInfoReportRequest;
.super Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;
.source "SourceFile"


# static fields
.field public static final REPORT_TYPE_PUSH_TOKEN:Ljava/lang/String; = "ptoken"


# instance fields
.field private cplc:Ljava/lang/String;

.field private deviceInfo:Ljava/lang/String;

.field private imei:Ljava/lang/String;

.field private reportType:Ljava/lang/String;

.field private sn:Ljava/lang/String;

.field private udid:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;-><init>()V

    return-void
.end method


# virtual methods
.method public getCplc()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/PushInfoReportRequest;->cplc:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceInfo()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/PushInfoReportRequest;->deviceInfo:Ljava/lang/String;

    return-object v0
.end method

.method public getImei()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/PushInfoReportRequest;->imei:Ljava/lang/String;

    return-object v0
.end method

.method public getReportType()Ljava/lang/String;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/PushInfoReportRequest;->reportType:Ljava/lang/String;

    return-object v0
.end method

.method public getSn()Ljava/lang/String;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/PushInfoReportRequest;->sn:Ljava/lang/String;

    return-object v0
.end method

.method public getUdid()Ljava/lang/String;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/PushInfoReportRequest;->udid:Ljava/lang/String;

    return-object v0
.end method

.method public setCplc(Ljava/lang/String;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/PushInfoReportRequest;->cplc:Ljava/lang/String;

    .line 74
    return-void
.end method

.method public setDeviceInfo(Ljava/lang/String;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/PushInfoReportRequest;->deviceInfo:Ljava/lang/String;

    .line 84
    return-void
.end method

.method public setImei(Ljava/lang/String;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/PushInfoReportRequest;->imei:Ljava/lang/String;

    .line 92
    return-void
.end method

.method public setReportType(Ljava/lang/String;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/PushInfoReportRequest;->reportType:Ljava/lang/String;

    .line 79
    return-void
.end method

.method public setSn(Ljava/lang/String;)V
    .locals 0

    .line 99
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/PushInfoReportRequest;->sn:Ljava/lang/String;

    .line 100
    return-void
.end method

.method public setUdid(Ljava/lang/String;)V
    .locals 0

    .line 107
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/PushInfoReportRequest;->udid:Ljava/lang/String;

    .line 108
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 111
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PushInfoReportRequest{cplc=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/request/PushInfoReportRequest;->cplc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", reportType=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/request/PushInfoReportRequest;->reportType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deviceInfo=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/request/PushInfoReportRequest;->deviceInfo:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imei=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/request/PushInfoReportRequest;->imei:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sn=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/request/PushInfoReportRequest;->sn:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
