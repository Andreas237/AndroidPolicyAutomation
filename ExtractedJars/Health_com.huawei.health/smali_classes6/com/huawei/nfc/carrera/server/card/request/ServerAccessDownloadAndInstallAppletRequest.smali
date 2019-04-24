.class public Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;
.super Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;
.source "SourceFile"


# instance fields
.field private appCode:Ljava/lang/String;

.field private onlyCap:Ljava/lang/String;

.field private partnerId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;-><init>()V

    .line 41
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->setIssuerId(Ljava/lang/String;)V

    .line 42
    invoke-virtual {p0, p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->setCplc(Ljava/lang/String;)V

    .line 43
    invoke-virtual {p0, p3}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->setAppletAid(Ljava/lang/String;)V

    .line 44
    invoke-virtual {p0, p4}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->setDeviceModel(Ljava/lang/String;)V

    .line 45
    invoke-virtual {p0, p5}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->setSeChipManuFacturer(Ljava/lang/String;)V

    .line 46
    return-void
.end method


# virtual methods
.method public getAppCode()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->appCode:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getOnlyCap()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->onlyCap:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getPartnerId()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->partnerId:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public setAppCode(Ljava/lang/String;)V
    .locals 1

    .line 53
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->appCode:Ljava/lang/String;

    .line 54
    return-void
.end method

.method public setOnlyCap(Ljava/lang/String;)V
    .locals 1

    .line 69
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->onlyCap:Ljava/lang/String;

    .line 70
    return-void
.end method

.method public setPartnerId(Ljava/lang/String;)V
    .locals 1

    .line 61
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->partnerId:Ljava/lang/String;

    .line 62
    return-void
.end method
