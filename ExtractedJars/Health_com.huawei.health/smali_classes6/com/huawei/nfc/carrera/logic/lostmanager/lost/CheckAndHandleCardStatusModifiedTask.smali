.class public Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CheckAndHandleCardStatusModifiedTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final TAG:Ljava/lang/String; = "CheckAndHandleCardStatusModifiedTask"


# instance fields
.field private final mCallback:Lcom/huawei/nfc/carrera/logic/lostmanager/callback/CheckDeviceStatusCallback;

.field private final mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/lostmanager/callback/CheckDeviceStatusCallback;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CheckAndHandleCardStatusModifiedTask;->mContext:Landroid/content/Context;

    .line 42
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CheckAndHandleCardStatusModifiedTask;->mCallback:Lcom/huawei/nfc/carrera/logic/lostmanager/callback/CheckDeviceStatusCallback;

    .line 43
    return-void
.end method

.method private queryCardsStatus()Lcom/huawei/nfc/carrera/server/card/response/CardStatusQueryResponse;
    .locals 6

    .line 127
    const-string v0, "CheckAndHandleCardStatusModifiedTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "== card status queryCardsStatus"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    new-instance v4, Lcom/huawei/nfc/carrera/server/card/request/CardStatusQueryRequest;

    invoke-direct {v4}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusQueryRequest;-><init>()V

    .line 129
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CheckAndHandleCardStatusModifiedTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->queryCplc()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/server/card/request/CardStatusQueryRequest;->cplc:Ljava/lang/String;

    .line 130
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CheckAndHandleCardStatusModifiedTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->getDeviceSN()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/server/card/request/CardStatusQueryRequest;->imei:Ljava/lang/String;

    .line 131
    const-string v0, "260086000000068459"

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusQueryRequest;->setMerchantID(Ljava/lang/String;)V

    .line 132
    const/4 v0, -0x1

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusQueryRequest;->setRsaKeyIndex(I)V

    .line 133
    const-string v0, "260086000000068459"

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusQueryRequest;->setSrcTransactionID(Ljava/lang/String;)V

    .line 135
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CheckAndHandleCardStatusModifiedTask;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/server/ServerServiceFactory;->createCardServerApi(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/server/card/CardServerApi;

    move-result-object v0

    invoke-interface {v0, v4}, Lcom/huawei/nfc/carrera/server/card/CardServerApi;->queryCardStatus(Lcom/huawei/nfc/carrera/server/card/request/CardStatusQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/CardStatusQueryResponse;

    move-result-object v5

    .line 137
    return-object v5
.end method

.method private updateCardState(Lcom/huawei/nfc/carrera/server/card/response/CardStatusQueryResponse;)V
    .locals 9

    .line 105
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/response/CardStatusQueryResponse;->getItems()Ljava/util/List;

    move-result-object v6

    .line 106
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 108
    :cond_0
    const-string v0, "CheckAndHandleCardStatusModifiedTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "== card status no server card status queried."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    return-void

    .line 112
    :cond_1
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/nfc/carrera/server/card/response/CardStatusItem;

    .line 114
    const-string v0, "CheckAndHandleCardStatusModifiedTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "== card status server card list, aid:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/server/card/response/CardStatusItem;->getAid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", status:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/server/card/response/CardStatusItem;->getStatus()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", dpanid:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/server/card/response/CardStatusItem;->getDpanid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", userid:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/server/card/response/CardStatusItem;->getUserID()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CheckAndHandleCardStatusModifiedTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardLostManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    move-result-object v0

    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/server/card/response/CardStatusItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/server/card/response/CardStatusItem;->getStatus()Ljava/lang/String;

    move-result-object v2

    .line 116
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/server/card/response/CardStatusItem;->getCplc()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/server/card/response/CardStatusItem;->getDpanid()Ljava/lang/String;

    move-result-object v4

    .line 115
    const/4 v5, 0x0

    invoke-interface/range {v0 .. v5}, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;->handleServerCardLostMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleServerCardLostMsgCallback;)V

    .line 117
    goto/16 :goto_0

    .line 118
    :cond_2
    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 48
    const-string v0, "CheckAndHandleCardStatusModifiedTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "== card status Enter CheckAndHandleCardStatusModifiedTask run "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CheckAndHandleCardStatusModifiedTask;->queryCardsStatus()Lcom/huawei/nfc/carrera/server/card/response/CardStatusQueryResponse;

    move-result-object v5

    .line 51
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 53
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 54
    const-string v7, "CheckAndHandleCardStatusModifiedTask, response is null"

    .line 55
    const-string v0, "fail_reason"

    invoke-interface {v6, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    const-string v0, "== card status null == serverQueryRespons"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    return-void

    .line 59
    :cond_0
    const-string v0, "CheckAndHandleCardStatusModifiedTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "== card status null == serverQueryRespons,serverQueryResponse.returnCode="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v5, Lcom/huawei/nfc/carrera/server/card/response/CardStatusQueryResponse;->returnCode:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    iget v0, v5, Lcom/huawei/nfc/carrera/server/card/response/CardStatusQueryResponse;->returnCode:I

    const/4 v1, -0x4

    if-ne v1, v0, :cond_1

    .line 63
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 64
    const-string v7, "queryCardsStatus retrun code server overload"

    .line 65
    const-string v0, "fail_reason"

    invoke-interface {v6, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    const-string v0, "CheckAndHandleCardStatusModifiedTask"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const v2, 0x3611a442

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    const/4 v2, 0x2

    aput-object v7, v1, v2

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    return-void

    .line 70
    :cond_1
    iget v0, v5, Lcom/huawei/nfc/carrera/server/card/response/CardStatusQueryResponse;->returnCode:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 72
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 73
    const-string v7, "query card status from server failed."

    .line 74
    const-string v0, "fail_reason"

    invoke-interface {v6, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    const-string v0, "CheckAndHandleCardStatusModifiedTask"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const v2, 0x3611a443

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    const/4 v2, 0x2

    aput-object v7, v1, v2

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    return-void

    .line 79
    :cond_2
    const-string v0, "CheckAndHandleCardStatusModifiedTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "== card status query response : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/server/card/response/CardStatusQueryResponse;->getDevStatus()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",card count: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/server/card/response/CardStatusQueryResponse;->getCardCount()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    const-string v0, "2"

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/server/card/response/CardStatusQueryResponse;->getDevStatus()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 84
    new-instance v6, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/DeleteAllLocalCardsTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CheckAndHandleCardStatusModifiedTask;->mContext:Landroid/content/Context;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v6, v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/DeleteAllLocalCardsTask;-><init>(Landroid/content/Context;ILcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleDeviceRepairCallback;)V

    .line 86
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/DeleteAllLocalCardsTask;->run()V

    .line 87
    return-void

    .line 90
    :cond_3
    const-string v0, "4"

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/server/card/response/CardStatusQueryResponse;->getDevStatus()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 92
    const-string v0, "CheckAndHandleCardStatusModifiedTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "== card status dev status queried from server: dev repair."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CheckAndHandleCardStatusModifiedTask;->mCallback:Lcom/huawei/nfc/carrera/logic/lostmanager/callback/CheckDeviceStatusCallback;

    if-eqz v0, :cond_4

    .line 95
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CheckAndHandleCardStatusModifiedTask;->mCallback:Lcom/huawei/nfc/carrera/logic/lostmanager/callback/CheckDeviceStatusCallback;

    const-string v1, "4"

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/lostmanager/callback/CheckDeviceStatusCallback;->checkDeviceStatusCallback(Ljava/lang/String;)V

    .line 97
    :cond_4
    return-void

    .line 100
    :cond_5
    invoke-direct {p0, v5}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CheckAndHandleCardStatusModifiedTask;->updateCardState(Lcom/huawei/nfc/carrera/server/card/response/CardStatusQueryResponse;)V

    .line 101
    return-void
.end method
