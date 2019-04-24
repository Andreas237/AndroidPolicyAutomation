.class public Lcom/huawei/nfc/carrera/logic/ese/response/CardQueryResponse;
.super Lcom/huawei/nfc/carrera/logic/spi/snb/response/SNBBaseResponse;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/logic/ese/response/CardQueryResponse$CardQueryResponseSAI4;,
        Lcom/huawei/nfc/carrera/logic/ese/response/CardQueryResponse$CardQueryResponseSAI3;,
        Lcom/huawei/nfc/carrera/logic/ese/response/CardQueryResponse$CardQueryResponseSAI2;,
        Lcom/huawei/nfc/carrera/logic/ese/response/CardQueryResponse$CardQueryResponseSAI1;
    }
.end annotation


# instance fields
.field public cardInfo:Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/snb/response/SNBBaseResponse;-><init>()V

    .line 17
    return-void
.end method

.method public constructor <init>(Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;I)V
    .locals 1

    .line 20
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/snb/response/SNBBaseResponse;-><init>()V

    .line 21
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/ese/response/CardQueryResponse;->cardInfo:Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;

    .line 22
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/ese/response/CardQueryResponse;->returnCd:I

    .line 23
    return-void
.end method
