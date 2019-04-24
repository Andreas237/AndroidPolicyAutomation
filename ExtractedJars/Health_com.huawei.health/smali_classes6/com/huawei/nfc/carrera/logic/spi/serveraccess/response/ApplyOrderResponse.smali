.class public Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;
.super Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;
.source "SourceFile"


# instance fields
.field private appCode:Ljava/lang/String;

.field private orderList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;>;"
        }
    .end annotation
.end field

.field private wxOrderListJsonString:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;-><init>()V

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;->orderList:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getAppCode()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;->appCode:Ljava/lang/String;

    return-object v0
.end method

.method public getOrderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;>;"
        }
    .end annotation

    .line 37
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;->orderList:Ljava/util/List;

    return-object v0
.end method

.method public getWxOrderListJsonString()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;->wxOrderListJsonString:Ljava/lang/String;

    return-object v0
.end method

.method public setAppCode(Ljava/lang/String;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;->appCode:Ljava/lang/String;

    .line 47
    return-void
.end method

.method public setOrderList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;>;)V"
        }
    .end annotation

    .line 42
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;->orderList:Ljava/util/List;

    .line 43
    return-void
.end method

.method public setWxOrderListJsonString(Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;->wxOrderListJsonString:Ljava/lang/String;

    .line 55
    return-void
.end method
