.class public abstract Lcom/huawei/nfc/carrera/server/card/impl/BaseReportTask;
.super Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<RequestParams:Ljava/lang/Object;>Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask<Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;TRequestParams;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 29
    return-void
.end method


# virtual methods
.method protected readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;
    .locals 2

    .line 34
    new-instance v1, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;

    invoke-direct {v1}, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;-><init>()V

    .line 35
    const/4 v0, -0x1

    if-ne v0, p1, :cond_0

    .line 37
    const/4 v0, -0x1

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;->returnCode:I

    goto :goto_0

    .line 39
    :cond_0
    const/4 v0, -0x3

    if-ne v0, p1, :cond_1

    .line 41
    const/4 v0, 0x1

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;->returnCode:I

    goto :goto_0

    .line 43
    :cond_1
    const/4 v0, -0x2

    if-ne v0, p1, :cond_2

    .line 45
    const/4 v0, -0x2

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;->returnCode:I

    goto :goto_0

    .line 47
    :cond_2
    const/4 v0, -0x4

    if-ne v0, p1, :cond_3

    .line 49
    const/4 v0, -0x4

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;->returnCode:I

    .line 51
    :cond_3
    :goto_0
    return-object v1
.end method

.method public bridge synthetic readErrorResponse(I)Ljava/lang/Object;
    .locals 1

    .line 23
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/impl/BaseReportTask;->readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;

    move-result-object v0

    return-object v0
.end method

.method protected readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;
    .locals 3

    .line 57
    if-nez p3, :cond_0

    .line 58
    const-string v0, "dataObject == null"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 59
    const/4 v0, 0x0

    return-object v0

    .line 61
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "readSuccessResponse response str : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 62
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;-><init>()V

    .line 63
    iput p1, v2, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;->returnCode:I

    .line 64
    invoke-virtual {v2, p2}, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;->setResultDesc(Ljava/lang/String;)V

    .line 65
    return-object v2
.end method

.method public bridge synthetic readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 1

    .line 23
    invoke-virtual {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/server/card/impl/BaseReportTask;->readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;

    move-result-object v0

    return-object v0
.end method
