.class public Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryOrderRequest;
.super Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;
.source "SourceFile"


# static fields
.field public static final ORDER_STATUS_ABNOMAL:Ljava/lang/String; = "1"

.field public static final ORDER_STATUS_NOMAL:Ljava/lang/String; = "0"


# instance fields
.field private appCode:Ljava/lang/String;

.field private orderStatus:Ljava/lang/String;

.field private partnerId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 47
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;-><init>()V

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryOrderRequest;->orderStatus:Ljava/lang/String;

    .line 48
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryOrderRequest;->setIssuerId(Ljava/lang/String;)V

    .line 49
    invoke-virtual {p0, p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryOrderRequest;->setCplc(Ljava/lang/String;)V

    .line 50
    invoke-virtual {p0, p3}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryOrderRequest;->setAppletAid(Ljava/lang/String;)V

    .line 51
    invoke-virtual {p0, p4}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryOrderRequest;->setDeviceModel(Ljava/lang/String;)V

    .line 52
    invoke-virtual {p0, p5}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryOrderRequest;->setSeChipManuFacturer(Ljava/lang/String;)V

    .line 53
    return-void
.end method


# virtual methods
.method public getAppCode()Ljava/lang/String;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryOrderRequest;->appCode:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getOrderStatus()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryOrderRequest;->orderStatus:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getPartnerId()Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryOrderRequest;->partnerId:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public setAppCode(Ljava/lang/String;)V
    .locals 1

    .line 78
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryOrderRequest;->appCode:Ljava/lang/String;

    .line 79
    return-void
.end method

.method public setOrderStatus(Ljava/lang/String;)V
    .locals 1

    .line 62
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryOrderRequest;->orderStatus:Ljava/lang/String;

    .line 63
    return-void
.end method

.method public setPartnerId(Ljava/lang/String;)V
    .locals 1

    .line 70
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryOrderRequest;->partnerId:Ljava/lang/String;

    .line 71
    return-void
.end method
