.class public Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;
.super Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;
.source "SourceFile"


# instance fields
.field private orderList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;-><init>()V

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->orderList:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getOrderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;>;"
        }
    .end annotation

    .line 27
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->orderList:Ljava/util/List;

    return-object v0
.end method

.method public setOrderList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;>;)V"
        }
    .end annotation

    .line 32
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->orderList:Ljava/util/List;

    .line 33
    return-void
.end method
