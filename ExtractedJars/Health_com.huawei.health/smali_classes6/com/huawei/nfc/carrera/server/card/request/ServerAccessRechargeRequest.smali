.class public Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;
.super Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;
.source "SourceFile"


# static fields
.field public static final RECHARGE_MODE_FIRST:Ljava/lang/String; = "0"

.field public static final RECHARGE_MODE_REPEAT:Ljava/lang/String; = "1"


# instance fields
.field private appCode:Ljava/lang/String;

.field private balance:I

.field private flag:Ljava/lang/String;

.field private partnerId:Ljava/lang/String;

.field private rechargeMode:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 50
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;-><init>()V

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->rechargeMode:Ljava/lang/String;

    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->flag:Ljava/lang/String;

    .line 51
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->setIssuerId(Ljava/lang/String;)V

    .line 52
    invoke-virtual {p0, p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->setAppletAid(Ljava/lang/String;)V

    .line 53
    invoke-virtual {p0, p3}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->setCplc(Ljava/lang/String;)V

    .line 54
    invoke-virtual {p0, p5}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->setCardId(Ljava/lang/String;)V

    .line 55
    invoke-virtual {p0, p4}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->setOrderId(Ljava/lang/String;)V

    .line 56
    invoke-virtual {p0, p6}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->setSystemType(Ljava/lang/String;)V

    .line 57
    invoke-virtual {p0, p7}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->setSystemVersion(Ljava/lang/String;)V

    .line 58
    invoke-virtual {p0, p8}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->setDeviceModel(Ljava/lang/String;)V

    .line 59
    invoke-virtual {p0, p9}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->setSeChipManuFacturer(Ljava/lang/String;)V

    .line 60
    return-void
.end method


# virtual methods
.method public getAppCode()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->appCode:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getBalance()I
    .locals 1

    .line 103
    iget v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->balance:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getFlag()Ljava/lang/String;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->flag:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getPartnerId()Ljava/lang/String;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->partnerId:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getRechargeMode()Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->rechargeMode:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public setAppCode(Ljava/lang/String;)V
    .locals 1

    .line 87
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->appCode:Ljava/lang/String;

    .line 88
    return-void
.end method

.method public setBalance(I)V
    .locals 1

    .line 99
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->balance:I

    .line 100
    return-void
.end method

.method public setFlag(Ljava/lang/String;)V
    .locals 1

    .line 79
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->flag:Ljava/lang/String;

    .line 80
    return-void
.end method

.method public setPartnerId(Ljava/lang/String;)V
    .locals 1

    .line 95
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->partnerId:Ljava/lang/String;

    .line 96
    return-void
.end method

.method public setRechargeMode(Ljava/lang/String;)V
    .locals 1

    .line 69
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->rechargeMode:Ljava/lang/String;

    .line 70
    return-void
.end method
