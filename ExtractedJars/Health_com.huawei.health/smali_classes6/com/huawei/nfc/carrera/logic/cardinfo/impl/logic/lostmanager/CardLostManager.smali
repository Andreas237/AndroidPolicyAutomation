.class public final Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;


# static fields
.field private static final SYNC_LOCK:[B

.field private static final TAG:Ljava/lang/String; = "CardLostManager"

.field private static instance:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager; = null


# instance fields
.field private mContext:Landroid/content/Context;

.field private final mServiceLooper:Landroid/os/Looper;

.field private final taskHandler:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 64
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->SYNC_LOCK:[B

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 76
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->mContext:Landroid/content/Context;

    goto :goto_0

    .line 80
    :cond_0
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->mContext:Landroid/content/Context;

    .line 83
    :goto_0
    new-instance v2, Landroid/os/HandlerThread;

    const-string v0, "CardLostManager"

    const/16 v1, 0xa

    invoke-direct {v2, v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 84
    invoke-virtual {v2}, Landroid/os/HandlerThread;->start()V

    .line 86
    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->mServiceLooper:Landroid/os/Looper;

    .line 87
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->mServiceLooper:Landroid/os/Looper;

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->taskHandler:Landroid/os/Handler;

    .line 88
    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;
    .locals 4

    .line 97
    sget-object v2, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->SYNC_LOCK:[B

    monitor-enter v2

    .line 98
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->instance:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 99
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->instance:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;

    .line 101
    :cond_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->instance:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 102
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public checkCardStatusWaitingReport()V
    .locals 2

    .line 183
    const-string v0, "checkCardStatusWaitingReport"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 184
    new-instance v1, Lcom/huawei/nfc/carrera/logic/lostmanager/report/CheckAndReportStatusTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->mContext:Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/CheckAndReportStatusTask;-><init>(Landroid/content/Context;)V

    .line 185
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->taskHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 186
    return-void
.end method

.method public checkDeviceStatus(Lcom/huawei/nfc/carrera/logic/lostmanager/callback/CheckDeviceStatusCallback;)V
    .locals 2

    .line 239
    const-string v0, "checkDeviceStatus"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 240
    new-instance v1, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CheckAndHandleCardStatusModifiedTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->mContext:Landroid/content/Context;

    invoke-direct {v1, v0, p1}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CheckAndHandleCardStatusModifiedTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/lostmanager/callback/CheckDeviceStatusCallback;)V

    .line 241
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->taskHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 242
    return-void
.end method

.method public clearAllNullifiedCardLocalInfo()V
    .locals 2

    .line 280
    const-string v0, "clearAllNullifiedCardLocalInfo"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 281
    new-instance v1, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/ClearAllNullifiedCardTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->mContext:Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/ClearAllNullifiedCardTask;-><init>(Landroid/content/Context;)V

    .line 282
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->taskHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 283
    return-void
.end method

.method public clearNullifiedCardLocalInfo(Ljava/lang/String;)V
    .locals 3

    .line 191
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "clearNullifiedCardLocalInfo, aid: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 192
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 194
    const-string v0, "clearNullifiedCardLocalInfo, but params illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 195
    return-void

    .line 198
    :cond_0
    new-instance v2, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCardNullifiedTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->mContext:Landroid/content/Context;

    invoke-direct {v2, v0, p1}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCardNullifiedTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 199
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->taskHandler:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 200
    return-void
.end method

.method public deleteLocalBankCards(Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleDeleteLocalCardsCallback;)V
    .locals 2

    .line 269
    const-string v0, "deleteLocalCards"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 272
    new-instance v1, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CleanAllLocalBankCardsTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->mContext:Landroid/content/Context;

    invoke-direct {v1, v0, p1}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CleanAllLocalBankCardsTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleDeleteLocalCardsCallback;)V

    .line 274
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->taskHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 275
    return-void
.end method

.method public handleDeviceRepair(ILcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleDeviceRepairCallback;)V
    .locals 4

    .line 247
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 250
    :sswitch_0
    const-string v0, "repair task, update server info"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 251
    new-instance v2, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportDeviceStatusTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->mContext:Landroid/content/Context;

    const-string v1, "01"

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportDeviceStatusTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 253
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->taskHandler:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 254
    goto :goto_1

    .line 256
    :sswitch_1
    const-string v0, "repair task, wait for del cards"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 257
    new-instance v3, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/DeleteAllLocalCardsTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-direct {v3, v0, v1, p2}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/DeleteAllLocalCardsTask;-><init>(Landroid/content/Context;ILcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleDeviceRepairCallback;)V

    .line 259
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->taskHandler:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 260
    goto :goto_1

    .line 262
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "repair task, get error code : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 265
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method public handleServerCardLostMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleServerCardLostMsgCallback;)V
    .locals 8

    .line 206
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleServerCardLostMessage, aid: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", status: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 208
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-static {p2, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-static {p3, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 210
    :cond_0
    const-string v0, "handleServerCardLostMessage, but params illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 211
    const/4 v0, 0x0

    if-eq v0, p5, :cond_1

    .line 213
    const/4 v0, 0x0

    invoke-interface {p5, v0, p1, p3}, Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleServerCardLostMsgCallback;->handleServerMsgResult(ZLjava/lang/String;Ljava/lang/String;)V

    .line 215
    :cond_1
    return-void

    .line 218
    :cond_2
    const-string v0, "5"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "2"

    .line 219
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "1"

    .line 220
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "00"

    .line 221
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 223
    const-string v0, "handleServerCardLostMessage, invalid status, no need to handle it."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 224
    const/4 v0, 0x0

    if-eq v0, p5, :cond_3

    .line 226
    const/4 v0, 0x0

    invoke-interface {p5, v0, p1, p3}, Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleServerCardLostMsgCallback;->handleServerMsgResult(ZLjava/lang/String;Ljava/lang/String;)V

    .line 228
    :cond_3
    return-void

    .line 231
    :cond_4
    new-instance v0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->mContext:Landroid/content/Context;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleServerCardLostMsgCallback;)V

    move-object v7, v0

    .line 233
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->taskHandler:Landroid/os/Handler;

    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 234
    return-void
.end method

.method public reportCardDeletedStatus(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 153
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "reportCardDeletedStatus, aid: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 154
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 156
    const-string v0, "reportCardDeletedStatus, but card id is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 157
    return-void

    .line 160
    :cond_0
    new-instance v0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->mContext:Landroid/content/Context;

    move-object v2, p1

    const-string v3, "6"

    move-object v4, p2

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v7, v0

    .line 162
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->taskHandler:Landroid/os/Handler;

    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 163
    return-void
.end method

.method public reportCardDeletedStatus(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 9

    .line 168
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "reportCardDeletedStatus, aid: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 169
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 171
    const-string v0, "reportCardDeletedStatus, but card id is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 172
    return-void

    .line 175
    :cond_0
    new-instance v0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->mContext:Landroid/content/Context;

    move-object v2, p1

    const-string v3, "6"

    move-object v4, p2

    move v7, p3

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object v8, v0

    .line 177
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->taskHandler:Landroid/os/Handler;

    invoke-virtual {v0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 178
    return-void
.end method

.method public reportCardLockedStatus(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 138
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "reportCardLockedStatus, aid: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 139
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 141
    const-string v0, "reportCardLockedStatus, but card id is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 142
    return-void

    .line 145
    :cond_0
    new-instance v0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->mContext:Landroid/content/Context;

    move-object v2, p1

    const-string v3, "3"

    move-object v4, p2

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v7, v0

    .line 147
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->taskHandler:Landroid/os/Handler;

    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 148
    return-void
.end method

.method public reportCardOpenedAvailableStatus(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 10

    .line 123
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "reportCardOpenedAvailableStatus, aid: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 124
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 126
    const-string v0, "reportCardOpenedAvailableStatus, but card id is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 127
    return-void

    .line 130
    :cond_0
    new-instance v0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->mContext:Landroid/content/Context;

    move-object v2, p1

    const-string v3, "0"

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    move/from16 v8, p6

    invoke-direct/range {v0 .. v8}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    move-object v9, v0

    .line 132
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->taskHandler:Landroid/os/Handler;

    invoke-virtual {v0, v9}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 133
    return-void
.end method

.method public reportCardOpenedNotActiveStatus(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 108
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "reportCardOpenedAvailableStatus, aid: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 109
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 111
    const-string v0, "reportCardOpenedButNotAvailableStatus, illegal params"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 112
    return-void

    .line 115
    :cond_0
    new-instance v0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->mContext:Landroid/content/Context;

    move-object v2, p1

    const-string v3, "7"

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportCardStatusTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v7, v0

    .line 117
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/logic/lostmanager/CardLostManager;->taskHandler:Landroid/os/Handler;

    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 118
    return-void
.end method
