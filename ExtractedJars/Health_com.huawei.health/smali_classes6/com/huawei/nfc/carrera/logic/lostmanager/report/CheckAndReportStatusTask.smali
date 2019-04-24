.class public Lcom/huawei/nfc/carrera/logic/lostmanager/report/CheckAndReportStatusTask;
.super Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportStatusBaseTask;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportStatusBaseTask;-><init>(Landroid/content/Context;)V

    .line 30
    return-void
.end method

.method private getDeviceStatus()Ljava/lang/String;
    .locals 3

    .line 74
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/CheckAndReportStatusTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    const-string v1, "device_status"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private queryWaitingReportStatus()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;>;"
        }
    .end annotation

    .line 68
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/CheckAndReportStatusTask;->reportStatusDBManager:Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusDBManager;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusDBManager;->queryReportStatusList()Ljava/util/List;

    move-result-object v1

    .line 69
    return-object v1
.end method


# virtual methods
.method public run()V
    .locals 14

    .line 36
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/CheckAndReportStatusTask;->getDeviceStatus()Ljava/lang/String;

    move-result-object v10

    .line 37
    const/4 v0, 0x0

    if-eq v0, v10, :cond_0

    invoke-virtual {p0, v10}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/CheckAndReportStatusTask;->reportStatusToServer(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 39
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/CheckAndReportStatusTask;->removeDeviceStatus()V

    .line 42
    :cond_0
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/CheckAndReportStatusTask;->queryWaitingReportStatus()Ljava/util/List;

    move-result-object v11

    .line 43
    const/4 v0, 0x0

    if-eq v0, v11, :cond_1

    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 45
    :cond_1
    const-string v0, "no status items waiting to report."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 46
    return-void

    .line 49
    :cond_2
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;

    .line 52
    move-object v0, p0

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->getCardStatus()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->getUserId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->getDpanId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->getCardName()Ljava/lang/String;

    move-result-object v5

    .line 53
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->getCardNumber()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->getIssuerID()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->getCardType()I

    move-result v8

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->isIfNotify()Z

    move-result v9

    .line 52
    invoke-virtual/range {v0 .. v9}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/CheckAndReportStatusTask;->reportStatusToServer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 56
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->getAid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/CheckAndReportStatusTask;->removeDBStatusItem(Ljava/lang/String;)V

    .line 58
    :cond_3
    goto :goto_0

    .line 59
    :cond_4
    return-void
.end method
