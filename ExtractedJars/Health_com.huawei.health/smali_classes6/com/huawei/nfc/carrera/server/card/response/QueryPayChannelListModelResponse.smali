.class public Lcom/huawei/nfc/carrera/server/card/response/QueryPayChannelListModelResponse;
.super Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;
.source "SourceFile"


# instance fields
.field private payType:Ljava/lang/String;

.field private promotionInfoList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/nfc/carrera/server/card/model/PromotionInfo;>;"
        }
    .end annotation
.end field

.field private resultDesc:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;-><init>()V

    .line 17
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryPayChannelListModelResponse;->resultDesc:Ljava/lang/String;

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryPayChannelListModelResponse;->payType:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getPayType()Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryPayChannelListModelResponse;->payType:Ljava/lang/String;

    return-object v0
.end method

.method public getPromotionInfoList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/nfc/carrera/server/card/model/PromotionInfo;>;"
        }
    .end annotation

    .line 44
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryPayChannelListModelResponse;->promotionInfoList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getResultDesc()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryPayChannelListModelResponse;->resultDesc:Ljava/lang/String;

    return-object v0
.end method

.method public setPayType(Ljava/lang/String;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryPayChannelListModelResponse;->payType:Ljava/lang/String;

    .line 41
    return-void
.end method

.method public setPromotionInfoList(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/nfc/carrera/server/card/model/PromotionInfo;>;)V"
        }
    .end annotation

    .line 48
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryPayChannelListModelResponse;->promotionInfoList:Ljava/util/ArrayList;

    .line 49
    return-void
.end method

.method public setResultDesc(Ljava/lang/String;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryPayChannelListModelResponse;->resultDesc:Ljava/lang/String;

    .line 33
    return-void
.end method
