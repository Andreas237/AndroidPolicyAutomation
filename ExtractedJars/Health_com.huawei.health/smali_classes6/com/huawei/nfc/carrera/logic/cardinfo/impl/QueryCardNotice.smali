.class public Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QueryCardNotice;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QueryCardNotice;->mContext:Landroid/content/Context;

    .line 29
    return-void
.end method


# virtual methods
.method public getCardNotice(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List<Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;>;"
        }
    .end annotation

    .line 34
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/request/QueryCardNoticeRequest;

    invoke-direct {v3}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardNoticeRequest;-><init>()V

    .line 35
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardNoticeRequest;->setIssuerId(Ljava/lang/String;)V

    .line 36
    invoke-virtual {v3, p2}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardNoticeRequest;->setNoticeType(Ljava/lang/String;)V

    .line 37
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QueryCardNotice;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/server/ServerServiceFactory;->createCardServerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/server/card/CardServerApi;

    move-result-object v0

    invoke-interface {v0, v3}, Lcom/huawei/nfc/carrera/server/card/CardServerApi;->queryCardNotice(Lcom/huawei/nfc/carrera/server/card/request/QueryCardNoticeRequest;)Lcom/huawei/nfc/carrera/server/card/response/QueryCardNoticeResponse;

    move-result-object v4

    .line 38
    if-nez v4, :cond_0

    .line 40
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 42
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getCardNotice queryCardNoticeResponse returnCode : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v4, Lcom/huawei/nfc/carrera/server/card/response/QueryCardNoticeResponse;->returnCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 44
    iget v0, v4, Lcom/huawei/nfc/carrera/server/card/response/QueryCardNoticeResponse;->returnCode:I

    if-eqz v0, :cond_1

    .line 46
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getCardNotice queryCardNoticeResponse fail, error code : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v4, Lcom/huawei/nfc/carrera/server/card/response/QueryCardNoticeResponse;->returnCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 48
    const-string v0, "fail_reason"

    invoke-interface {v5, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    const-string v0, "issuerId"

    invoke-interface {v5, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    const-string v0, "noticeType"

    invoke-interface {v5, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    const v0, 0x3611a443

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v5, v6, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 54
    :cond_1
    iget-object v0, v4, Lcom/huawei/nfc/carrera/server/card/response/QueryCardNoticeResponse;->noticeLists:Ljava/util/List;

    return-object v0
.end method
