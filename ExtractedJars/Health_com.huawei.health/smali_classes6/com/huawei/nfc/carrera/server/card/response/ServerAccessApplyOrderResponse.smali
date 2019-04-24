.class public Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;
.super Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;
.source "SourceFile"


# instance fields
.field private appCode:Ljava/lang/String;

.field private orderList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;>;"
        }
    .end annotation
.end field

.field private wxOrderListJsonString:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;-><init>()V

    .line 22
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;->orderList:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getAppCode()Ljava/lang/String;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;->appCode:Ljava/lang/String;

    return-object v0
.end method

.method public getOrderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;>;"
        }
    .end annotation

    .line 32
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;->orderList:Ljava/util/List;

    return-object v0
.end method

.method public getWxOrderListJsonString()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;->wxOrderListJsonString:Ljava/lang/String;

    return-object v0
.end method

.method public setAppCode(Ljava/lang/String;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;->appCode:Ljava/lang/String;

    .line 42
    return-void
.end method

.method public setOrderList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;>;)V"
        }
    .end annotation

    .line 37
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;->orderList:Ljava/util/List;

    .line 38
    return-void
.end method

.method public setWxOrderListJsonString(Ljava/lang/String;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;->wxOrderListJsonString:Ljava/lang/String;

    .line 50
    return-void
.end method
