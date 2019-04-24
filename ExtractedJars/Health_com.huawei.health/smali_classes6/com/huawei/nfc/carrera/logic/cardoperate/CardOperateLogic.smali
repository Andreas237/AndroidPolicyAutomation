.class public final Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;


# static fields
.field private static final SYNC_LOCK:[B

.field private static instance:Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;


# instance fields
.field private auxOperateHandler:Landroid/os/Handler;

.field private auxOperateHandlerThread:Landroid/os/HandlerThread;

.field private final mContext:Landroid/content/Context;

.field private mQueryRecordsTask:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;

.field private final operateHandler:Landroid/os/Handler;

.field private final operateResultHandler:Landroid/os/Handler;

.field private final operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 74
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->SYNC_LOCK:[B

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 116
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->mContext:Landroid/content/Context;

    .line 118
    new-instance v3, Landroid/os/HandlerThread;

    const-string v0, "card_operate_thread"

    invoke-direct {v3, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 119
    invoke-virtual {v3}, Landroid/os/HandlerThread;->start()V

    .line 120
    invoke-virtual {v3}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v4

    .line 121
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operateHandler:Landroid/os/Handler;

    .line 123
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operateResultHandler:Landroid/os/Handler;

    .line 124
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operateHandler:Landroid/os/Handler;

    invoke-direct {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;

    .line 125
    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;
    .locals 4

    .line 174
    sget-object v2, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->SYNC_LOCK:[B

    monitor-enter v2

    .line 175
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->instance:Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 176
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->instance:Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;

    .line 178
    :cond_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->instance:Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 179
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private startAuxOperateHandlerThread()V
    .locals 2

    .line 129
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->auxOperateHandlerThread:Landroid/os/HandlerThread;

    if-nez v0, :cond_0

    .line 131
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "aux_card_operate_thread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->auxOperateHandlerThread:Landroid/os/HandlerThread;

    .line 132
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->auxOperateHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 133
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->auxOperateHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->auxOperateHandler:Landroid/os/Handler;

    goto :goto_0

    .line 137
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->auxOperateHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->isAlive()Z

    move-result v0

    if-nez v0, :cond_1

    .line 139
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->auxOperateHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 140
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->auxOperateHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->auxOperateHandler:Landroid/os/Handler;

    .line 143
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public applyPayOrder(Ljava/lang/String;DIILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/ApplyPayOrderCallback;)V
    .locals 13

    .line 226
    if-nez p7, :cond_0

    .line 228
    const-string v0, "CardOperateLogic applyPayOrder, null == callback"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 229
    return-void

    .line 232
    :cond_0
    const/4 v10, 0x0

    .line 234
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "applyPayOrder orderType is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, p4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 236
    move/from16 v0, p4

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    move/from16 v0, p4

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 238
    :cond_1
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->startAuxOperateHandlerThread()V

    .line 239
    iget-object v10, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->auxOperateHandler:Landroid/os/Handler;

    goto :goto_0

    .line 243
    :cond_2
    iget-object v10, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operateHandler:Landroid/os/Handler;

    .line 246
    :goto_0
    new-instance v11, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operateResultHandler:Landroid/os/Handler;

    move-object/from16 v1, p7

    invoke-direct {v11, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;-><init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/ApplyPayOrderCallback;)V

    .line 247
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/ApplyPayOrderTask;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;

    move-object v3, p1

    move-wide v4, p2

    move/from16 v6, p4

    move/from16 v7, p5

    move-object/from16 v8, p6

    move-object v9, v11

    invoke-direct/range {v0 .. v9}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/ApplyPayOrderTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;Ljava/lang/String;DIILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;)V

    move-object v12, v0

    .line 250
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "applyPayOrder operateHandler is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 251
    invoke-virtual {v10, v12}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 252
    return-void
.end method

.method public applyPayOrder(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/ApplyPayOrderCallback;)V
    .locals 9

    .line 202
    if-nez p3, :cond_0

    .line 204
    const-string v0, "CardOperateLogic applyPayOrder, null == callback"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 205
    return-void

    .line 207
    :cond_0
    const/4 v6, 0x0

    .line 208
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getOrderType()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->getOrderType()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 210
    :cond_1
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->startAuxOperateHandlerThread()V

    .line 211
    iget-object v6, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->auxOperateHandler:Landroid/os/Handler;

    goto :goto_0

    .line 215
    :cond_2
    iget-object v6, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operateHandler:Landroid/os/Handler;

    .line 218
    :goto_0
    new-instance v7, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operateResultHandler:Landroid/os/Handler;

    invoke-direct {v7, v0, p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;-><init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/ApplyPayOrderCallback;)V

    .line 219
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/ApplyPayOrderTask1;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;

    move-object v3, p1

    move-object v4, p2

    move-object v5, v7

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/ApplyPayOrderTask1;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/ApplyPayOrderResultHandler;)V

    move-object v8, v0

    .line 220
    invoke-virtual {v6, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 221
    return-void
.end method

.method public checkCloudTransferOutCondition(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/CheckTransferOutConditionCallback;)V
    .locals 1

    .line 391
    if-nez p2, :cond_0

    .line 393
    const-string v0, "CardOperateLogic checkCloudTransferOutCondition, null == callback"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 394
    return-void

    .line 400
    :cond_0
    return-void
.end method

.method public initEseInfo()V
    .locals 2

    .line 185
    const-string v0, "initEseInfo."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 186
    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/EseTsmInitLoader;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->mContext:Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/EseTsmInitLoader;-><init>(Landroid/content/Context;)V

    .line 187
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operateHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 188
    return-void
.end method

.method public initEseInfo(Lcom/huawei/nfc/carrera/logic/cardoperate/response/InitEseResultCallback;)V
    .locals 3

    .line 381
    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/init/HandleInitEseResultTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operateResultHandler:Landroid/os/Handler;

    invoke-direct {v1, v0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/init/HandleInitEseResultTask;-><init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/response/InitEseResultCallback;)V

    .line 382
    new-instance v2, Lcom/huawei/nfc/carrera/logic/cardoperate/init/InitEseTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->mContext:Landroid/content/Context;

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/init/InitEseTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/init/HandleInitEseResultTask;)V

    .line 383
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operateHandler:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 384
    return-void
.end method

.method public issueTrafficCard(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/IssueTrafficCardCallback;)V
    .locals 8

    .line 257
    if-nez p3, :cond_0

    .line 259
    const-string v0, "CardOperateLogic issueTrafficCard, null == callback"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 260
    return-void

    .line 262
    :cond_0
    new-instance v6, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operateResultHandler:Landroid/os/Handler;

    invoke-direct {v6, v0, p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;-><init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/IssueTrafficCardCallback;)V

    .line 263
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/IssueTrafficCardTask;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;

    move-object v3, p1

    move-object v4, p2

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/IssueTrafficCardTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;)V

    move-object v7, v0

    .line 265
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "issueTrafficCard operateHandler is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operateHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 266
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operateHandler:Landroid/os/Handler;

    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 267
    return-void
.end method

.method public preIssueTrafficCard(Ljava/lang/String;)V
    .locals 3

    .line 193
    const-string v0, "tsm preIssueTrafficCard"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 194
    new-instance v2, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/PreIssueTrafficCardTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;

    invoke-direct {v2, v0, p1, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/PreIssueTrafficCardTask;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;)V

    .line 196
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "preIssueTrafficCard operateHandler is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operateHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 197
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operateHandler:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 198
    return-void
.end method

.method public queryAndHandleUnfinfishedOrders(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryAndHandleUnfinishedOrderCallback;)V
    .locals 8

    .line 296
    if-nez p3, :cond_0

    .line 298
    const-string v0, "CardOperateLogic queryAndHandleUnfinfishedOrders, null == callback"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 299
    return-void

    .line 304
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->mQueryRecordsTask:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 305
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operateHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->mQueryRecordsTask:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 308
    :cond_1
    new-instance v6, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operateResultHandler:Landroid/os/Handler;

    invoke-direct {v6, v0, p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;-><init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryAndHandleUnfinishedOrderCallback;)V

    .line 310
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/QueryAndHandleUnfinishedOrdersTask;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;

    move-object v3, p1

    move v4, p2

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/QueryAndHandleUnfinishedOrdersTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryAndHandleUnfinishedOrderResultHandler;)V

    move-object v7, v0

    .line 312
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operateHandler:Landroid/os/Handler;

    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 316
    return-void
.end method

.method public queryOfflineTrafficCardInfo(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryOfflineTrafficCardInfoCallback;)V
    .locals 8

    .line 355
    if-nez p3, :cond_0

    .line 357
    const-string v0, "CardOperateLogic queryTrafficCardBalance, null == callback"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 358
    return-void

    .line 363
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->mQueryRecordsTask:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 364
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operateHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->mQueryRecordsTask:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 367
    :cond_1
    new-instance v6, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operateResultHandler:Landroid/os/Handler;

    invoke-direct {v6, v0, p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler;-><init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryOfflineTrafficCardInfoCallback;)V

    .line 369
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/QueryTrafficCardBalanceTask;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;

    move-object v3, p1

    move v4, p2

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/QueryTrafficCardBalanceTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryOfflineTrafficCardInfoResultHandler;)V

    move-object v7, v0

    .line 371
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operateHandler:Landroid/os/Handler;

    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 375
    return-void
.end method

.method public queryRecords(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryRecordsListCallback;)V
    .locals 7

    .line 321
    const-string v0, "CardOperateLogic queryRecords enter"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 322
    if-nez p3, :cond_0

    .line 324
    const-string v0, "CardOperateLogic queryRecords, null == callback"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 325
    return-void

    .line 329
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->mQueryRecordsTask:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 330
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operateHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->mQueryRecordsTask:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 333
    :cond_1
    new-instance v6, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operateResultHandler:Landroid/os/Handler;

    invoke-direct {v6, v0, p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;-><init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryRecordsListCallback;)V

    .line 334
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/QueryRecordsListTask;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;

    move-object v3, p1

    move v4, p2

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/QueryRecordsListTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->mQueryRecordsTask:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;

    .line 336
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operateHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->mQueryRecordsTask:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/base/TrafficCardBaseTask;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 337
    return-void
.end method

.method public recharge(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/RechargeCallback;)V
    .locals 8

    .line 282
    if-nez p3, :cond_0

    .line 284
    const-string v0, "CardOperateLogic recharge, null == callback"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 285
    return-void

    .line 287
    :cond_0
    new-instance v6, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operateResultHandler:Landroid/os/Handler;

    invoke-direct {v6, v0, p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;-><init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/RechargeCallback;)V

    .line 288
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/RechargeTask;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;

    move-object v3, p1

    move-object v4, p2

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/RechargeTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;)V

    move-object v7, v0

    .line 289
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operateHandler:Landroid/os/Handler;

    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 290
    return-void
.end method

.method public refund(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/RefundCallback;)V
    .locals 8

    .line 342
    if-nez p3, :cond_0

    .line 344
    const-string v0, "CardOperateLogic refund, null == callback"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 345
    return-void

    .line 347
    :cond_0
    new-instance v6, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operateResultHandler:Landroid/os/Handler;

    invoke-direct {v6, v0, p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler;-><init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/RefundCallback;)V

    .line 348
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/RefundTask;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;

    move-object v3, p1

    move-object v4, p2

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/RefundTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RefundResultHandler;)V

    move-object v7, v0

    .line 349
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operateHandler:Landroid/os/Handler;

    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 350
    return-void
.end method

.method public uninstallTrafficCard(Ljava/lang/String;ZLjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/UninstallTrafficCardCallback;)V
    .locals 9

    .line 272
    const-string v0, "CardOperateLogic uninstallTrafficCard"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 273
    new-instance v7, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/UninstallTrafficCardResultHandler;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operateResultHandler:Landroid/os/Handler;

    invoke-direct {v7, v0, p4}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/UninstallTrafficCardResultHandler;-><init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/UninstallTrafficCardCallback;)V

    .line 275
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/UninstallTrafficCardTask;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;

    move-object v3, p1

    move-object v4, v7

    move-object v5, p3

    move v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/UninstallTrafficCardTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/impl/SPIOperatorManager;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/UninstallTrafficCardResultHandler;Ljava/lang/String;Z)V

    move-object v8, v0

    .line 276
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->operateHandler:Landroid/os/Handler;

    invoke-virtual {v0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 277
    return-void
.end method
