.class public Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteSSDTsmOperator;
.super Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;
.source "SourceFile"


# instance fields
.field private final aid:Ljava/lang/String;

.field private deleteRelatedObjects:Z

.field private issuerId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 33
    const-string v0, "DeleteSSD"

    invoke-direct {p0, p1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 27
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteSSDTsmOperator;->deleteRelatedObjects:Z

    .line 34
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteSSDTsmOperator;->aid:Ljava/lang/String;

    .line 35
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 39
    const-string v0, "DeleteSSD"

    invoke-direct {p0, p1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 27
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteSSDTsmOperator;->deleteRelatedObjects:Z

    .line 40
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteSSDTsmOperator;->aid:Ljava/lang/String;

    .line 41
    iput-boolean p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteSSDTsmOperator;->deleteRelatedObjects:Z

    .line 42
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteSSDTsmOperator;->issuerId:Ljava/lang/String;

    .line 43
    return-void
.end method


# virtual methods
.method public bridge synthetic excute()I
    .locals 1

    .line 17
    invoke-super {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;->excute()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getIssuerId()Ljava/lang/String;
    .locals 1

    .line 17
    invoke-super {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method queryOperateParams(Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;
    .locals 4

    .line 48
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteSSDTsmOperator;->aid:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->setAid(Ljava/lang/String;)V

    .line 49
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteSSDTsmOperator;->issuerId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->setIssuerId(Ljava/lang/String;)V

    .line 50
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteSSDTsmOperator;->deleteRelatedObjects:Z

    invoke-virtual {p1, v0}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->setDeleteRelatedObjects(Z)V

    .line 52
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteSSDTsmOperator;->mContext:Landroid/content/Context;

    const-string v2, "TransportationCard"

    invoke-direct {v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->queryDeleteSSDTsmParam(Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;

    move-result-object v3

    .line 53
    return-object v3
.end method

.method public bridge synthetic setIssuerId(Ljava/lang/String;)V
    .locals 0

    .line 17
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;->setIssuerId(Ljava/lang/String;)V

    return-void
.end method
