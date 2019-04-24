.class public Lcom/huawei/nfc/carrera/logic/ese/response/QueryTradeRecordsResponse;
.super Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardBaseResponse;
.source "SourceFile"


# instance fields
.field public records:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/logic/ese/model/TradeRecord;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardBaseResponse;-><init>()V

    .line 14
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryTradeRecordsResponse;->resultCode:I

    .line 15
    return-void
.end method

.method public constructor <init>(ILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lcom/huawei/nfc/carrera/logic/ese/model/TradeRecord;>;)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardBaseResponse;-><init>()V

    .line 20
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryTradeRecordsResponse;->resultCode:I

    .line 21
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryTradeRecordsResponse;->records:Ljava/util/List;

    .line 22
    return-void
.end method
