.class public Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;
.super Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;
.source "SourceFile"


# instance fields
.field private appCode:Ljava/lang/String;

.field private partnerId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;-><init>()V

    .line 22
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->setIssuerId(Ljava/lang/String;)V

    .line 23
    invoke-virtual {p0, p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->setOrderId(Ljava/lang/String;)V

    .line 24
    invoke-virtual {p0, p3}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->setCplc(Ljava/lang/String;)V

    .line 25
    invoke-virtual {p0, p4}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->setAppletAid(Ljava/lang/String;)V

    .line 26
    invoke-virtual {p0, p5}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->setDeviceModel(Ljava/lang/String;)V

    .line 27
    invoke-virtual {p0, p6}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->setSeChipManuFacturer(Ljava/lang/String;)V

    .line 28
    return-void
.end method


# virtual methods
.method public getAppCode()Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->appCode:Ljava/lang/String;

    return-object v0
.end method

.method public getPartnerId()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->partnerId:Ljava/lang/String;

    return-object v0
.end method

.method public setAppCode(Ljava/lang/String;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->appCode:Ljava/lang/String;

    .line 36
    return-void
.end method

.method public setPartnerId(Ljava/lang/String;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->partnerId:Ljava/lang/String;

    .line 44
    return-void
.end method
