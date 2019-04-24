.class public Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;
.super Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;
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

    .line 45
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;-><init>()V

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->orderStatus:Ljava/lang/String;

    .line 46
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->setIssuerId(Ljava/lang/String;)V

    .line 47
    invoke-virtual {p0, p2}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->setCplc(Ljava/lang/String;)V

    .line 48
    invoke-virtual {p0, p3}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->setAppletAid(Ljava/lang/String;)V

    .line 49
    invoke-virtual {p0, p4}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->setDeviceModel(Ljava/lang/String;)V

    .line 50
    invoke-virtual {p0, p5}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->setSeChipManuFacturer(Ljava/lang/String;)V

    .line 51
    return-void
.end method


# virtual methods
.method public getAppCode()Ljava/lang/String;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->appCode:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getOrderStatus()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->orderStatus:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getPartnerId()Ljava/lang/String;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->partnerId:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public setAppCode(Ljava/lang/String;)V
    .locals 1

    .line 75
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->appCode:Ljava/lang/String;

    .line 76
    return-void
.end method

.method public setOrderStatus(Ljava/lang/String;)V
    .locals 1

    .line 60
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->orderStatus:Ljava/lang/String;

    .line 61
    return-void
.end method

.method public setPartnerId(Ljava/lang/String;)V
    .locals 1

    .line 67
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->partnerId:Ljava/lang/String;

    .line 68
    return-void
.end method
