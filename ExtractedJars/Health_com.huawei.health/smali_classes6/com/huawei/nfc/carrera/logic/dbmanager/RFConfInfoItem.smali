.class public Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem$RFConfInfoItemSai7;,
        Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem$RFConfInfoItemSai6;,
        Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem$RFConfInfoItemSai5;,
        Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem$RFConfInfoItemSai4;,
        Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem$RFConfInfoItemSai3;,
        Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem$RFConfInfoItemSai2;,
        Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem$RFConfInfoItemSai1;
    }
.end annotation


# instance fields
.field private issuerId:Ljava/lang/String;

.field private model:Ljava/lang/String;

.field private rfURL:Ljava/lang/String;

.field private romVersion:Ljava/lang/String;

.field private timestamp:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo;)V
    .locals 2

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->issuerId:Ljava/lang/String;

    .line 41
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo;->getModel()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->model:Ljava/lang/String;

    .line 42
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo;->getRomVersion()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->romVersion:Ljava/lang/String;

    .line 43
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo;->getRfURL()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->rfURL:Ljava/lang/String;

    .line 44
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo;->getTimeStamp()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->timestamp:J

    .line 45
    return-void
.end method


# virtual methods
.method public getIssuerId()Ljava/lang/String;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->issuerId:Ljava/lang/String;

    return-object v0
.end method

.method public getModel()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->model:Ljava/lang/String;

    return-object v0
.end method

.method public getRfURL()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->rfURL:Ljava/lang/String;

    return-object v0
.end method

.method public getRomVersion()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->romVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getTimeStamp()J
    .locals 2

    .line 89
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->timestamp:J

    return-wide v0
.end method

.method public setIssuerId(Ljava/lang/String;)V
    .locals 0

    .line 74
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->issuerId:Ljava/lang/String;

    .line 75
    return-void
.end method

.method public setModel(Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->model:Ljava/lang/String;

    .line 55
    return-void
.end method

.method public setRfURL(Ljava/lang/String;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->rfURL:Ljava/lang/String;

    .line 85
    return-void
.end method

.method public setRomVersion(Ljava/lang/String;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->romVersion:Ljava/lang/String;

    .line 65
    return-void
.end method

.method public setTimeStamp(J)V
    .locals 0

    .line 94
    iput-wide p1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->timestamp:J

    .line 95
    return-void
.end method

.method public toContentValues()Landroid/content/ContentValues;
    .locals 4

    .line 99
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 100
    const-string v0, "issuer_id"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->issuerId:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    const-string v0, "model"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->model:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    const-string v0, "rf_conf_url"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->rfURL:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    const-string v0, "rom_version"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->romVersion:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    const-string v0, "timestamp"

    iget-wide v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->timestamp:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 105
    return-object v3
.end method
