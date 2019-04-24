.class public Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DownloadAndInstallAppletRequest;
.super Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;
.source "SourceFile"


# instance fields
.field private appCode:Ljava/lang/String;

.field private onlyCap:Ljava/lang/String;

.field private partnerId:Ljava/lang/String;

.field private type:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 44
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;-><init>()V

    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DownloadAndInstallAppletRequest;->type:Ljava/lang/String;

    .line 45
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DownloadAndInstallAppletRequest;->setIssuerId(Ljava/lang/String;)V

    .line 46
    invoke-virtual {p0, p2}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DownloadAndInstallAppletRequest;->setCplc(Ljava/lang/String;)V

    .line 47
    invoke-virtual {p0, p3}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DownloadAndInstallAppletRequest;->setAppletAid(Ljava/lang/String;)V

    .line 48
    invoke-virtual {p0, p4}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DownloadAndInstallAppletRequest;->setDeviceModel(Ljava/lang/String;)V

    .line 49
    invoke-virtual {p0, p5}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DownloadAndInstallAppletRequest;->setSeChipManuFacturer(Ljava/lang/String;)V

    .line 50
    return-void
.end method


# virtual methods
.method public getAppCode()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DownloadAndInstallAppletRequest;->appCode:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getOnlyCap()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DownloadAndInstallAppletRequest;->onlyCap:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getPartnerId()Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DownloadAndInstallAppletRequest;->partnerId:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DownloadAndInstallAppletRequest;->type:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public setAppCode(Ljava/lang/String;)V
    .locals 1

    .line 57
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DownloadAndInstallAppletRequest;->appCode:Ljava/lang/String;

    .line 58
    return-void
.end method

.method public setOnlyCap(Ljava/lang/String;)V
    .locals 1

    .line 83
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DownloadAndInstallAppletRequest;->onlyCap:Ljava/lang/String;

    .line 84
    return-void
.end method

.method public setPartnerId(Ljava/lang/String;)V
    .locals 1

    .line 65
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DownloadAndInstallAppletRequest;->partnerId:Ljava/lang/String;

    .line 66
    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 1

    .line 75
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DownloadAndInstallAppletRequest;->type:Ljava/lang/String;

    .line 76
    return-void
.end method
