.class public Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;
.super Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;
.source "SourceFile"


# instance fields
.field private appCode:Ljava/lang/String;

.field private partnerId:Ljava/lang/String;

.field private type:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;-><init>()V

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->type:Ljava/lang/String;

    .line 30
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->setIssuerId(Ljava/lang/String;)V

    .line 31
    invoke-virtual {p0, p2}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->setOrderId(Ljava/lang/String;)V

    .line 32
    invoke-virtual {p0, p3}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->setCplc(Ljava/lang/String;)V

    .line 33
    invoke-virtual {p0, p4}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->setAppletAid(Ljava/lang/String;)V

    .line 34
    invoke-virtual {p0, p5}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->setDeviceModel(Ljava/lang/String;)V

    .line 35
    invoke-virtual {p0, p6}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->setSeChipManuFacturer(Ljava/lang/String;)V

    .line 36
    return-void
.end method


# virtual methods
.method public getAppCode()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->appCode:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getPartnerId()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->partnerId:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->type:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public setAppCode(Ljava/lang/String;)V
    .locals 1

    .line 43
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->appCode:Ljava/lang/String;

    .line 44
    return-void
.end method

.method public setPartnerId(Ljava/lang/String;)V
    .locals 1

    .line 51
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->partnerId:Ljava/lang/String;

    .line 52
    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 1

    .line 61
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->type:Ljava/lang/String;

    .line 62
    return-void
.end method
