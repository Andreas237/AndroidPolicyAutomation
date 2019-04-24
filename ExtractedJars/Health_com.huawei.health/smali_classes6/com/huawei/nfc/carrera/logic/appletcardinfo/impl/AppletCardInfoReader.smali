.class public Lcom/huawei/nfc/carrera/logic/appletcardinfo/impl/AppletCardInfoReader;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/appletcardinfo/AppletCardInfoReadApi;


# static fields
.field private static final TAG:Ljava/lang/String; = "AppletCardInfo"


# instance fields
.field private configData:Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigData;

.field private mContext:Landroid/content/Context;

.field private omaService:Lcom/huawei/nfc/carrera/logic/oma/IOmaService;

.field private tCardInfoReader:Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/impl/AppletCardInfoReader;->mContext:Landroid/content/Context;

    .line 53
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/impl/AppletCardInfoReader;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigDataManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/impl/AppletCardInfoReader;->configData:Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigData;

    .line 54
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/impl/AppletCardInfoReader;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/oma/OmaApduManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/oma/OmaApduManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/impl/AppletCardInfoReader;->omaService:Lcom/huawei/nfc/carrera/logic/oma/IOmaService;

    .line 55
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/impl/AppletCardInfoReader;->omaService:Lcom/huawei/nfc/carrera/logic/oma/IOmaService;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/impl/AppletCardInfoReader;->configData:Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigData;

    invoke-direct {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;-><init>(Lcom/huawei/nfc/carrera/logic/oma/IOmaService;Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigData;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/impl/AppletCardInfoReader;->tCardInfoReader:Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;

    .line 56
    return-void
.end method

.method private reportErrorInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;)V
    .locals 6

    .line 118
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 119
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p5}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->getPrintMsg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 120
    const-string v0, "aid"

    invoke-virtual {v4, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    const-string v0, "productId"

    invoke-virtual {v4, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    const-string v0, "data_type"

    invoke-virtual {v4, v0, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    const-string v0, "fail_code"

    invoke-virtual {p5}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->getResultCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    const-string v0, "fail_reason"

    invoke-virtual {v4, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    const-string v0, "AppletCardInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    return-void
.end method


# virtual methods
.method public readTrafficCardInfo(Ljava/lang/String;Ljava/lang/String;I)Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;I)Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult<Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;>;"
        }
    .end annotation

    .line 60
    const-string v0, "AppletCardInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " readTrafficCardInfo begin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    new-instance v6, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;

    invoke-direct {v6}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;-><init>()V

    .line 65
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/impl/AppletCardInfoReader;->tCardInfoReader:Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;

    invoke-virtual {v0, p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->readCardInfo(Ljava/lang/String;Ljava/lang/String;I)Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;

    move-result-object v7

    .line 66
    invoke-virtual {v6, v7}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->setData(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    goto :goto_0

    .line 67
    :catch_0
    move-exception v7

    .line 68
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/impl/AppletCardInfoReader;->tCardInfoReader:Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->closeChannel()V

    .line 69
    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;->getErrCode()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->setResultCode(I)V

    .line 70
    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->setMsg(Ljava/lang/String;)V

    .line 71
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    const-string v3, "readTrafficCardInfo"

    move-object v5, v6

    const v4, 0x3611a3f4

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/impl/AppletCardInfoReader;->reportErrorInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;)V

    .line 74
    :goto_0
    const-string v0, "AppletCardInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " readTrafficCardInfo end. result : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->getResultCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    return-object v6
.end method

.method public readTrafficCardTransactionRecord(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult<Ljava/util/List<Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;>;>;"
        }
    .end annotation

    .line 80
    const-string v0, "AppletCardInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " readTrafficCardTransactionRecord begin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    new-instance v6, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;

    invoke-direct {v6}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;-><init>()V

    .line 83
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/impl/AppletCardInfoReader;->tCardInfoReader:Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;

    invoke-virtual {v0, p1, p2}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->readTransactionRecords(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v7

    .line 84
    invoke-virtual {v6, v7}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->setData(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    goto :goto_0

    .line 85
    :catch_0
    move-exception v7

    .line 86
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/impl/AppletCardInfoReader;->tCardInfoReader:Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->closeChannel()V

    .line 87
    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;->getErrCode()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->setResultCode(I)V

    .line 88
    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->setMsg(Ljava/lang/String;)V

    .line 89
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    const-string v3, "readTrafficCardTransactionRecord"

    move-object v5, v6

    const v4, 0x3611a3f3

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/impl/AppletCardInfoReader;->reportErrorInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;)V

    .line 92
    :goto_0
    const-string v0, "AppletCardInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " readTrafficCardTransactionRecord end. result : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->getResultCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    return-object v6
.end method
