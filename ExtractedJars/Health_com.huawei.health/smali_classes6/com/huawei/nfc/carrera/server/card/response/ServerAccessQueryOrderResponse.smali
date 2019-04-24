.class public Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryOrderResponse;
.super Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;
.source "SourceFile"


# instance fields
.field private orderList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;-><init>()V

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryOrderResponse;->orderList:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getOrderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;>;"
        }
    .end annotation

    .line 28
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryOrderResponse;->orderList:Ljava/util/List;

    return-object v0
.end method

.method public setOrderList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;>;)V"
        }
    .end annotation

    .line 33
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryOrderResponse;->orderList:Ljava/util/List;

    .line 34
    return-void
.end method
