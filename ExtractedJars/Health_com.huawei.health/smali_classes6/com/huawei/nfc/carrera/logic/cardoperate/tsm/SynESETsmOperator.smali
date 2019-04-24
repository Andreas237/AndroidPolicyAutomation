.class public Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/SynESETsmOperator;
.super Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;
.source "SourceFile"


# instance fields
.field private aid:Ljava/lang/String;

.field private mIssuerId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 27
    const-string v0, "SynESE"

    invoke-direct {p0, p1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 28
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/SynESETsmOperator;->aid:Ljava/lang/String;

    .line 29
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/SynESETsmOperator;->mIssuerId:Ljava/lang/String;

    .line 30
    return-void
.end method


# virtual methods
.method public bridge synthetic excute()I
    .locals 1

    .line 20
    invoke-super {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;->excute()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getIssuerId()Ljava/lang/String;
    .locals 1

    .line 20
    invoke-super {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method queryOperateParams(Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;
    .locals 3

    .line 35
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/SynESETsmOperator;->aid:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->setAid(Ljava/lang/String;)V

    .line 36
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/SynESETsmOperator;->mIssuerId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->setIssuerId(Ljava/lang/String;)V

    .line 37
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/SynESETsmOperator;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;-><init>(Landroid/content/Context;)V

    .line 38
    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->queryInfoSynTsmParam(Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;

    move-result-object v2

    .line 39
    return-object v2
.end method

.method public bridge synthetic setIssuerId(Ljava/lang/String;)V
    .locals 0

    .line 20
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;->setIssuerId(Ljava/lang/String;)V

    return-void
.end method
