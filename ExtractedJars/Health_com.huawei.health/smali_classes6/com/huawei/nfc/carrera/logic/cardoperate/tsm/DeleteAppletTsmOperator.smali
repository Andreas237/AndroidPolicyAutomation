.class public Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteAppletTsmOperator;
.super Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;
.source "SourceFile"


# instance fields
.field private bankRsaIndex:Ljava/lang/String;

.field private final mAid:Ljava/lang/String;

.field private mIssuerId:Ljava/lang/String;

.field private verifySign:Ljava/lang/String;

.field private verifyTime:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 56
    const-string v0, "DeleteApplet"

    invoke-direct {p0, p1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 57
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteAppletTsmOperator;->mAid:Ljava/lang/String;

    .line 58
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteAppletTsmOperator;->mIssuerId:Ljava/lang/String;

    .line 59
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 71
    const-string v0, "DeleteApplet"

    invoke-direct {p0, p1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 72
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteAppletTsmOperator;->mAid:Ljava/lang/String;

    .line 73
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteAppletTsmOperator;->verifySign:Ljava/lang/String;

    .line 74
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteAppletTsmOperator;->verifyTime:Ljava/lang/String;

    .line 75
    iput-object p5, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteAppletTsmOperator;->bankRsaIndex:Ljava/lang/String;

    .line 76
    return-void
.end method


# virtual methods
.method public bridge synthetic excute()I
    .locals 1

    .line 23
    invoke-super {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;->excute()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getIssuerId()Ljava/lang/String;
    .locals 1

    .line 23
    invoke-super {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method queryOperateParams(Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;
    .locals 4

    .line 88
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteAppletTsmOperator;->mAid:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->setAid(Ljava/lang/String;)V

    .line 89
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteAppletTsmOperator;->verifySign:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->setBankSignResult(Ljava/lang/String;)V

    .line 90
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteAppletTsmOperator;->verifyTime:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->setBankSignTime(Ljava/lang/String;)V

    .line 91
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteAppletTsmOperator;->bankRsaIndex:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->setBankRsaIndex(Ljava/lang/String;)V

    .line 92
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteAppletTsmOperator;->mIssuerId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->setIssuerId(Ljava/lang/String;)V

    .line 93
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteAppletTsmOperator;->mContext:Landroid/content/Context;

    const-string v2, "TransportationCard"

    invoke-direct {v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 94
    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->queryDeleteAppletTsmParam(Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;

    move-result-object v3

    .line 96
    return-object v3
.end method

.method public bridge synthetic setIssuerId(Ljava/lang/String;)V
    .locals 0

    .line 23
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;->setIssuerId(Ljava/lang/String;)V

    return-void
.end method
