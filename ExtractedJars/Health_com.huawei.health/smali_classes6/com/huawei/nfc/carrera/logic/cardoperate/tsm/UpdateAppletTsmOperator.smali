.class public Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/UpdateAppletTsmOperator;
.super Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;
.source "SourceFile"


# instance fields
.field private final aid:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 25
    const-string v0, "UpdateApplet"

    invoke-direct {p0, p1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 26
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/UpdateAppletTsmOperator;->aid:Ljava/lang/String;

    .line 27
    return-void
.end method


# virtual methods
.method public bridge synthetic excute()I
    .locals 1

    .line 16
    invoke-super {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;->excute()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getIssuerId()Ljava/lang/String;
    .locals 1

    .line 16
    invoke-super {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method queryOperateParams(Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;
    .locals 2

    .line 32
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/UpdateAppletTsmOperator;->aid:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->setAid(Ljava/lang/String;)V

    .line 33
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/UpdateAppletTsmOperator;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;->setIssuerId(Ljava/lang/String;)V

    .line 34
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/UpdateAppletTsmOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/server/ServerServiceFactory;->createCardServerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/server/card/CardServerApi;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/huawei/nfc/carrera/server/card/CardServerApi;->queryUpdateTsmParam(Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;

    move-result-object v1

    .line 36
    return-object v1
.end method

.method public bridge synthetic setIssuerId(Ljava/lang/String;)V
    .locals 0

    .line 16
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;->setIssuerId(Ljava/lang/String;)V

    return-void
.end method
