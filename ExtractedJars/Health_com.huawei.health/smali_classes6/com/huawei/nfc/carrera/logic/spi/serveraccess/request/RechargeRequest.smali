.class public Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;
.super Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest$RechargeRequestSai10;,
        Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest$RechargeRequestSai9;,
        Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest$RechargeRequestSai8;,
        Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest$RechargeRequestSai7;,
        Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest$RechargeRequestSai6;,
        Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest$RechargeRequestSai5;,
        Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest$RechargeRequestSai4;,
        Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest$RechargeRequestSai3;,
        Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest$RechargeRequestSai2;,
        Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest$RechargeRequestSai1;
    }
.end annotation


# static fields
.field public static final RECHARGE_FLAG_CONTACTLESS:Ljava/lang/String; = "3"

.field public static final RECHARGE_MODE_FIRST:Ljava/lang/String; = "0"

.field public static final RECHARGE_MODE_REPEAT:Ljava/lang/String; = "1"

.field public static final RECHARGE_SCRIPT_FLAG:Ljava/lang/String; = "1"


# instance fields
.field private appCode:Ljava/lang/String;

.field private balance:I

.field private flag:Ljava/lang/String;

.field private partnerId:Ljava/lang/String;

.field private rechargeMode:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 60
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;-><init>()V

    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->rechargeMode:Ljava/lang/String;

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->flag:Ljava/lang/String;

    .line 61
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->setIssuerId(Ljava/lang/String;)V

    .line 62
    invoke-virtual {p0, p2}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->setAppletAid(Ljava/lang/String;)V

    .line 63
    invoke-virtual {p0, p5}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->setTrafficCardId(Ljava/lang/String;)V

    .line 64
    invoke-virtual {p0, p3}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->setOrderId(Ljava/lang/String;)V

    .line 65
    invoke-virtual {p0, p4}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->setCplc(Ljava/lang/String;)V

    .line 66
    invoke-virtual {p0, p6}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->setSystemType(Ljava/lang/String;)V

    .line 67
    invoke-virtual {p0, p7}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->setSystemVersion(Ljava/lang/String;)V

    .line 68
    invoke-virtual {p0, p8}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->setDeviceModel(Ljava/lang/String;)V

    .line 69
    invoke-virtual {p0, p9}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->setSeChipManuFacturer(Ljava/lang/String;)V

    .line 70
    return-void
.end method


# virtual methods
.method public getAppCode()Ljava/lang/String;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->appCode:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getBalance()I
    .locals 1

    .line 110
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->balance:I

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

    .line 85
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->flag:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getPartnerId()Ljava/lang/String;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->partnerId:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getRechargeMode()Ljava/lang/String;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->rechargeMode:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public setAppCode(Ljava/lang/String;)V
    .locals 1

    .line 98
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->appCode:Ljava/lang/String;

    .line 99
    return-void
.end method

.method public setBalance(I)V
    .locals 1

    .line 114
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->balance:I

    .line 115
    return-void
.end method

.method public setFlag(Ljava/lang/String;)V
    .locals 1

    .line 90
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->flag:Ljava/lang/String;

    .line 91
    return-void
.end method

.method public setPartnerId(Ljava/lang/String;)V
    .locals 1

    .line 106
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->partnerId:Ljava/lang/String;

    .line 107
    return-void
.end method

.method public setRechargeMode(Ljava/lang/String;)V
    .locals 1

    .line 79
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->rechargeMode:Ljava/lang/String;

    .line 80
    return-void
.end method
