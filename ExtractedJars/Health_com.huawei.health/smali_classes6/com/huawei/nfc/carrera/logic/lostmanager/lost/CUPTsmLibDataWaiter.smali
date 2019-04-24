.class public abstract Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/response/CUPOperationListener;


# static fields
.field private static final FIRST_WAIT_OPERATION_START_TIME_OUT:I = 0x1770

.field private static final OPERATION_FINISHED:I = 0x1

.field private static final OPERATION_NOT_START:I = -0x1

.field private static final OPERATION_STARTED:I = 0x0

.field private static final TAG:Ljava/lang/String; = "CUPTsmLibDataWaiter"

.field private static final WAITING_TIMES:I = 0x6

.field private static final WAIT_OPERATION_START_TIME_OUT:I = 0xbb8

.field private static final WAIT_OPERATION_TIME_OUT:I = 0xea60


# instance fields
.field protected final mContext:Landroid/content/Context;

.field private mOperationResult:I

.field private mOperationStatus:I

.field protected final mOperationType:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->mOperationStatus:I

    .line 85
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->mOperationResult:I

    .line 96
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->mContext:Landroid/content/Context;

    .line 97
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->mOperationType:Ljava/lang/String;

    .line 98
    return-void
.end method

.method private handlePushMessage(Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;Ljava/util/List;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;Ljava/util/List<Ljava/lang/String;>;)Z"
        }
    .end annotation

    .line 276
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;->getVirtualCards()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->mOperationType:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;->getEvent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 279
    const-string v0, "WIPEOUT"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->mOperationType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 280
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;->getVirtualCards()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 282
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "startCUPOperateService, mRefIDs size : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 283
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->mOperationStatus:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 285
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->mOperationType:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;->getSsid()Ljava/lang/String;

    move-result-object v2

    .line 286
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;->getSign()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;->getVirtualCards()Ljava/util/ArrayList;

    move-result-object v4

    .line 285
    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPOperateServiceManager;->startCUPOperateService(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 293
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 296
    :cond_2
    const-string v0, "query CUP tsmlibdata unstatified!"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 297
    const/4 v0, 0x0

    return v0
.end method

.method private declared-synchronized waitAndHandleDeleteResult(Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Z"
        }
    .end annotation

    monitor-enter p0

    .line 109
    :try_start_0
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->mOperationStatus:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, -0x1

    if-ne v1, v0, :cond_0

    .line 111
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 116
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "check delete operation result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->mOperationStatus:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 118
    :cond_1
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->mOperationStatus:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 120
    const-wide/32 v0, 0xea60

    invoke-virtual {p0, v0, v1}, Ljava/lang/Object;->wait(J)V

    .line 121
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "after wait for a while, the delete operation result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->mOperationStatus:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 122
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->mOperationResult:I

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->mOperationResult:I
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/16 v1, -0x63

    if-eq v0, v1, :cond_1

    .line 125
    .line 132
    :cond_2
    goto :goto_0

    .line 129
    :catch_0
    move-exception v2

    .line 131
    const-string v0, "install cup card wait the download result, but interrupted."

    :try_start_2
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 133
    :goto_0
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->mOperationResult:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 135
    monitor-exit p0

    const/4 v0, 0x1

    return v0

    .line 137
    :cond_3
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized waitDeleteStarted(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    monitor-enter p0

    .line 198
    const-string v0, "CUPTsmLibDataWaiter"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter waitDeleteStarted "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 202
    const/4 v4, 0x0

    .line 205
    :cond_0
    if-nez v4, :cond_1

    .line 207
    const-wide/16 v0, 0x1770

    :try_start_1
    invoke-virtual {p0, v0, v1}, Ljava/lang/Object;->wait(J)V

    .line 208
    const-string v0, "CUPTsmLibDataWaiter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "waitDeleteStarted wait 6s"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 212
    :cond_1
    const-wide/16 v0, 0xbb8

    invoke-virtual {p0, v0, v1}, Ljava/lang/Object;->wait(J)V

    .line 213
    const-string v0, "CUPTsmLibDataWaiter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "waitDeleteStarted wait 3s"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 215
    :goto_0
    add-int/lit8 v4, v4, 0x1

    .line 217
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->mOperationStatus:I

    const/4 v1, -0x1

    if-ne v1, v0, :cond_2

    .line 220
    const-string v0, "CUPTsmLibDataWaiter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wait delete operation start, quire tsmlibData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->getTsmLibData(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 223
    const-wide/16 v0, 0xbb8

    invoke-virtual {p0, v0, v1}, Ljava/lang/Object;->wait(J)V

    .line 228
    :cond_2
    const-string v0, "CUPTsmLibDataWaiter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "wait delete getTsmLibData end mOperationStatus : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->mOperationStatus:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 230
    const/4 v0, 0x6

    if-gt v4, v0, :cond_3

    iget v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->mOperationStatus:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->mOperationStatus:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 233
    :cond_3
    const-string v0, "CUPTsmLibDataWaiter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wait delete operation start, or timeout."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 234
    .line 241
    goto :goto_1

    .line 238
    :catch_0
    move-exception v4

    .line 240
    const-string v0, "CUPTsmLibDataWaiter"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wait delete operation time out."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 242
    :goto_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method protected checkAndCleanCupTAData(Ljava/util/List;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Z"
        }
    .end annotation

    .line 142
    const/4 v2, 0x1

    .line 143
    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 145
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 147
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v5

    .line 148
    if-eqz v5, :cond_1

    .line 150
    new-instance v6, Lcom/huawei/nfc/carrera/server/card/request/QueryAidRequest;

    invoke-direct {v6}, Lcom/huawei/nfc/carrera/server/card/request/QueryAidRequest;-><init>()V

    .line 151
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->queryCplc()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v6, Lcom/huawei/nfc/carrera/server/card/request/QueryAidRequest;->cplc:Ljava/lang/String;

    .line 152
    const/4 v0, -0x1

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/server/card/request/QueryAidRequest;->setRsaKeyIndex(I)V

    .line 153
    const-string v0, "260086000000068459"

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/server/card/request/QueryAidRequest;->setMerchantID(Ljava/lang/String;)V

    .line 154
    const-string v0, "260086000000068459"

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/server/card/request/QueryAidRequest;->setSrcTransactionID(Ljava/lang/String;)V

    .line 155
    iput-object v4, v6, Lcom/huawei/nfc/carrera/server/card/request/QueryAidRequest;->cardRefId:Ljava/lang/String;

    .line 156
    new-instance v0, Lcom/huawei/wallet/bankcard/server/BankCardServer;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/wallet/bankcard/server/BankCardServer;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v6}, Lcom/huawei/wallet/bankcard/server/BankCardServer;->e(Lcom/huawei/nfc/carrera/server/card/request/QueryAidRequest;)Lcom/huawei/nfc/carrera/server/card/response/QueryAidResponse;

    move-result-object v7

    .line 158
    if-eqz v7, :cond_1

    .line 160
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryAidResponse, resultCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v7, Lcom/huawei/nfc/carrera/server/card/response/QueryAidResponse;->returnCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 161
    iget v0, v7, Lcom/huawei/nfc/carrera/server/card/response/QueryAidResponse;->returnCode:I

    const/4 v1, -0x5

    if-ne v0, v1, :cond_0

    .line 163
    invoke-virtual {p0, v4}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->removeTaInfo(Ljava/lang/String;)Z

    goto :goto_1

    .line 167
    :cond_0
    const/4 v2, 0x0

    .line 171
    :cond_1
    :goto_1
    goto/16 :goto_0

    .line 173
    :cond_2
    return v2
.end method

.method protected getTsmLibData(Ljava/util/List;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Z"
        }
    .end annotation

    .line 253
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/request/QueryUnionPayPushRequest;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/server/card/request/QueryUnionPayPushRequest;-><init>()V

    .line 254
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->queryCplc()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/huawei/nfc/carrera/server/card/request/QueryUnionPayPushRequest;->cplc:Ljava/lang/String;

    .line 255
    new-instance v0, Lcom/huawei/wallet/bankcard/server/BankCardServer;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/wallet/bankcard/server/BankCardServer;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v2}, Lcom/huawei/wallet/bankcard/server/BankCardServer;->c(Lcom/huawei/nfc/carrera/server/card/request/QueryUnionPayPushRequest;)Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;

    move-result-object v3

    .line 257
    if-eqz v3, :cond_0

    iget v0, v3, Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;->returnCode:I

    if-nez v0, :cond_0

    .line 259
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;->getPushMsg()Ljava/lang/String;

    move-result-object v4

    .line 260
    if-eqz v4, :cond_0

    .line 262
    new-instance v5, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushMessageParser;

    invoke-direct {v5}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushMessageParser;-><init>()V

    .line 263
    invoke-virtual {v5, v4}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushMessageParser;->parsePushMessage(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    .line 264
    instance-of v0, v6, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;

    if-eqz v0, :cond_0

    .line 266
    move-object v0, v6

    check-cast v0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;

    invoke-direct {p0, v0, p1}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->handlePushMessage(Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;Ljava/util/List;)Z

    move-result v0

    return v0

    .line 270
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public operateFinished(I)V
    .locals 4

    .line 314
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "operateFinished result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 315
    move-object v2, p0

    monitor-enter v2

    .line 317
    const/4 v0, 0x1

    :try_start_0
    iput v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->mOperationStatus:I

    .line 318
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->mOperationResult:I

    .line 319
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 320
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 321
    :goto_0
    return-void
.end method

.method public operateStart()V
    .locals 3

    .line 303
    const-string v0, "operateStart now."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 304
    move-object v1, p0

    monitor-enter v1

    .line 306
    const/4 v0, 0x0

    :try_start_0
    iput v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->mOperationStatus:I

    .line 307
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 308
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 309
    :goto_0
    return-void
.end method

.method protected removeTaInfo(Ljava/lang/String;)Z
    .locals 3

    .line 180
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->removeCard(Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_1

    .line 181
    const/4 v0, 0x1

    return v0

    .line 183
    :catch_0
    move-exception v2

    .line 185
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WalletTaCardNotExistException, mRefID : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 186
    const/4 v0, 0x1

    return v0

    .line 188
    :catch_1
    move-exception v2

    .line 190
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WalletTaSystemErrorException, mRefID : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 192
    const/4 v0, 0x0

    return v0
.end method

.method protected waitOperationResult(Ljava/util/List;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Z"
        }
    .end annotation

    .line 102
    const-string v0, "CUPTsmLibDataWaiter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter waitOperationResult  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->waitDeleteStarted(Ljava/util/List;)V

    .line 104
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;->waitAndHandleDeleteResult(Ljava/util/List;)Z

    move-result v0

    return v0
.end method
