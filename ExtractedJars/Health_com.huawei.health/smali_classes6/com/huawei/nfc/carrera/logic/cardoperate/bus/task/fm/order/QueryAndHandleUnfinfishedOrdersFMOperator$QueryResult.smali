.class Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator$QueryResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "QueryResult"
.end annotation


# instance fields
.field mResultInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;

.field mUnfinishedOrders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;>;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V"
        }
    .end annotation

    .line 255
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 256
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator$QueryResult;->mUnfinishedOrders:Ljava/util/List;

    .line 257
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/order/QueryAndHandleUnfinfishedOrdersFMOperator$QueryResult;->mResultInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;

    .line 258
    return-void
.end method
