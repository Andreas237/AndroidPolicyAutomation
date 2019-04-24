.class public abstract Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/response/CUPOperationListener;


# static fields
.field private static final DOWNLOAD_OPERATION_FINISHED:I = 0x1

.field private static final DOWNLOAD_OPERATION_NOT_START:I = -0x1

.field private static final DOWNLOAD_OPERATION_RESULT_UNINIT:I = 0x63

.field private static final DOWNLOAD_OPERATION_STARTED:I = 0x0

.field private static final FIRST_WAIT_OPERATION_TIME_OUT:I = 0x1770

.field private static final NOTIFY_INSTALL_RESULT_DELAY:I = 0x2bf20

.field private static final WAITING_TIMES:I = 0x6

.field private static final WAIT_OPERATION_TIME_OUT:I = 0xbb8


# instance fields
.field protected final curOperator:Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;

.field private downloadOperationResult:I

.field private downloadOperationStatus:I

.field protected final mContext:Landroid/content/Context;

.field protected final mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;

.field protected final mServerApi:Lcom/huawei/wallet/bankcard/server/BankCardServerApi;

.field public pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;Lcom/huawei/wallet/bankcard/server/BankCardServerApi;)V
    .locals 1

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->downloadOperationStatus:I

    .line 79
    const/16 v0, 0x63

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->downloadOperationResult:I

    .line 106
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->mContext:Landroid/content/Context;

    .line 107
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->curOperator:Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;

    .line 108
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;

    .line 109
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->mServerApi:Lcom/huawei/wallet/bankcard/server/BankCardServerApi;

    .line 110
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/PluginPayAdapter;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    .line 111
    return-void
.end method

.method private getWatchConnectedStatus()I
    .locals 2

    .line 177
    const-string v0, "enter getWatchConnectedStatus "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 178
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v0}, Lcom/huawei/nfc/PluginPayAdapter;->getDeviceConnectState()I

    move-result v1

    .line 179
    return v1
.end method

.method private handleDownloadResult(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 295
    const/16 v2, -0x63

    .line 296
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->downloadOperationResult:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->downloadOperationResult:I

    const/16 v1, 0x63

    if-ne v1, v0, :cond_1

    .line 299
    :cond_0
    const-string v0, "===123====\u8fd4\u56de\u7ed3\u679cINSTALL_RESULT_CODE_SUCCESS"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 300
    const/4 v2, 0x0

    goto :goto_0

    .line 302
    :cond_1
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->downloadOperationResult:I

    const/4 v1, -0x1

    if-ne v1, v0, :cond_2

    .line 304
    const-string v0, "===123====OPERATE_RESULT_FAILED_DATA_OUT_OF_USE"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 305
    const/4 v0, 0x1

    invoke-direct {p0, p2, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->updateTaCardStatusToErr(Ljava/lang/String;Z)V

    .line 306
    const/16 v2, -0x13

    goto :goto_0

    .line 308
    :cond_2
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->downloadOperationResult:I

    const/16 v1, -0x62

    if-ne v1, v0, :cond_3

    .line 309
    const-string v0, "===123====OPERATE_RESULT_DEAL"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 310
    const/4 v0, 0x1

    invoke-direct {p0, p2, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->updateTaCardStatusToErr(Ljava/lang/String;Z)V

    .line 311
    const/4 v2, -0x4

    goto :goto_0

    .line 315
    :cond_3
    const-string v0, "===123====updateTaCardStatusToErr"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 316
    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->updateTaCardStatusToErr(Ljava/lang/String;Z)V

    .line 318
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "===123===getTsmLibData getWatchConnectedStatus() : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->getWatchConnectedStatus()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 319
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->getWatchConnectedStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/ecz;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 320
    :cond_4
    const-string v0, "watch or network is disConnected ."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 321
    const/4 v2, -0x4

    .line 323
    :cond_5
    invoke-virtual {p0, v2, p1, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->handleResult(ILjava/lang/String;Ljava/lang/String;)V

    .line 324
    return-void
.end method

.method private handlePushMessage(Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;Ljava/lang/String;)Z
    .locals 6

    .line 439
    const-string v0, "DOWNLOAD"

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;->getEvent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 441
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;->getVirtualCards()Ljava/util/ArrayList;

    move-result-object v4

    .line 442
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 444
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 445
    if-eqz v5, :cond_0

    invoke-virtual {v5, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 447
    const-string v0, "startCUPOperateService, download refid : "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 448
    const/4 v0, 0x1

    invoke-static {v5, v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 449
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->mContext:Landroid/content/Context;

    const-string v1, "DOWNLOAD"

    .line 450
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;->getSsid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;->getSign()Ljava/lang/String;

    move-result-object v3

    .line 449
    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPOperateServiceManager;->startCUPOperateService(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 451
    const/4 v0, 0x1

    return v0

    .line 455
    :cond_0
    const-string v0, "query CUP tsmlibdata unstatified!"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 456
    const/4 v0, 0x0

    return v0
.end method

.method private updateTaCardStatusToErr(Ljava/lang/String;Z)V
    .locals 6

    .line 341
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v2

    .line 342
    if-nez v2, :cond_0

    .line 344
    const-string v0, "updateTaCardStatusToErr, card is null"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 345
    return-void

    .line 347
    :cond_0
    if-eqz p2, :cond_1

    .line 349
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->deleteCard(Ljava/lang/String;)V

    .line 350
    return-void

    .line 352
    :cond_1
    iget v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x5d

    if-eq v0, v1, :cond_2

    iget v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x5e

    if-eq v0, v1, :cond_2

    iget v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    iget v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    :cond_2
    const/4 v3, 0x1

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    .line 356
    :goto_0
    if-eqz v3, :cond_4

    .line 358
    return-void

    .line 360
    :cond_4
    const/16 v4, 0x5e

    .line 361
    iget v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x60

    if-eq v0, v1, :cond_5

    iget v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x5f

    if-ne v0, v1, :cond_6

    .line 364
    :cond_5
    const/16 v4, 0x5d

    .line 368
    :cond_6
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, p1, v4}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->updateCardStatus(Ljava/lang/String;I)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_1

    .line 377
    goto :goto_1

    .line 370
    :catch_0
    move-exception v5

    .line 372
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "card info has been already deleted! refID = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 377
    goto :goto_1

    .line 374
    :catch_1
    move-exception v5

    .line 376
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "updateCardStatus err! refID = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 378
    :goto_1
    return-void
.end method

.method private declared-synchronized waitAndHandleDownloadResult(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    monitor-enter p0

    .line 234
    :try_start_0
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->downloadOperationStatus:I

    const/4 v1, -0x1

    if-ne v1, v0, :cond_2

    .line 236
    const-string v0, "DOWNLOAD_OPERATION_NOT_START!"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 238
    instance-of v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;

    if-eqz v0, :cond_1

    .line 240
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v3

    .line 241
    if-eqz v3, :cond_1

    .line 245
    :try_start_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, p1, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->updateCardStatus(Ljava/lang/String;I)V

    .line 247
    iget v0, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x62

    if-ne v0, v1, :cond_0

    .line 249
    const-string v0, "== cleanUnstartedData"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 250
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->cleanUnstartedData(Ljava/lang/String;)V
    :try_end_1
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 260
    :cond_0
    goto :goto_0

    .line 253
    :catch_0
    move-exception v4

    .line 255
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "card info has been already deleted! refID = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 260
    goto :goto_0

    .line 257
    :catch_1
    move-exception v4

    .line 259
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "updateCardStatus err! refID = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 264
    :cond_1
    :goto_0
    const/4 v0, -0x4

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->handleResult(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 265
    monitor-exit p0

    return-void

    .line 271
    :cond_2
    :try_start_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "check download operation result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->downloadOperationResult:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 272
    :cond_3
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->downloadOperationResult:I

    const/16 v1, 0x63

    if-ne v1, v0, :cond_4

    .line 274
    const-string v0, "===123===\u5f00\u59cb\u7b49\u5f85 "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 275
    const-wide/32 v0, 0x2bf20

    invoke-virtual {p0, v0, v1}, Ljava/lang/Object;->wait(J)V

    .line 276
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "after wait for a while, the download operation result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->downloadOperationResult:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 278
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->downloadOperationResult:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->downloadOperationResult:I
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/16 v1, -0x63

    if-eq v1, v0, :cond_3

    .line 281
    .line 288
    :cond_4
    goto :goto_1

    .line 285
    :catch_2
    move-exception v3

    .line 287
    const-string v0, "install cup card wait the download result, but interrupted."

    :try_start_4
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 290
    :goto_1
    invoke-direct {p0, p2, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->handleDownloadResult(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 291
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized waitDownloadStarted(Ljava/lang/String;)V
    .locals 3

    monitor-enter p0

    .line 186
    const/4 v2, 0x0

    .line 189
    :cond_0
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getTsmLibData getWatchConnectedStatus() : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->getWatchConnectedStatus()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 190
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->getWatchConnectedStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/ecz;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 191
    :cond_1
    const-string v0, "watch or network is disConnected ."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 192
    goto :goto_1

    .line 195
    :cond_2
    if-nez v2, :cond_3

    .line 197
    const-wide/16 v0, 0x1770

    invoke-virtual {p0, v0, v1}, Ljava/lang/Object;->wait(J)V

    goto :goto_0

    .line 201
    :cond_3
    const-wide/16 v0, 0xbb8

    invoke-virtual {p0, v0, v1}, Ljava/lang/Object;->wait(J)V

    .line 203
    :goto_0
    add-int/lit8 v2, v2, 0x1

    .line 205
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->downloadOperationStatus:I

    const/4 v1, -0x1

    if-ne v1, v0, :cond_5

    .line 208
    const-string v0, "===123===leibinsheng \u8f6e\u8bad\u83b7\u53d6aid start getTsmLibData "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 209
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->getTsmLibData(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 211
    const-wide/16 v0, 0xbb8

    invoke-virtual {p0, v0, v1}, Ljava/lang/Object;->wait(J)V

    .line 213
    :cond_4
    const-string v0, "end getTsmLibData "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 217
    :cond_5
    const/4 v0, 0x6

    if-gt v2, v0, :cond_6

    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->downloadOperationStatus:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->downloadOperationStatus:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 220
    :cond_6
    const-string v0, "wait download operation start, timeout."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 221
    .line 228
    :goto_1
    goto :goto_2

    .line 225
    :catch_0
    move-exception v2

    .line 227
    const-string v0, "wait download operation time out."

    :try_start_1
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 229
    :goto_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method abstract cleanUnstartedData(Ljava/lang/String;)V
.end method

.method protected deleteCard(Ljava/lang/String;)V
    .locals 5

    .line 382
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DownloadObserver  and refid is :"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 383
    const/4 v2, 0x0

    .line 384
    const/4 v3, 0x0

    .line 387
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v4

    .line 388
    if-eqz v4, :cond_0

    .line 390
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, p1, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->updateCardStatus(Ljava/lang/String;I)V

    .line 391
    const/4 v2, 0x1

    .line 392
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getAid()Ljava/lang/String;
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v3, v0

    .line 402
    :cond_0
    goto :goto_0

    .line 395
    :catch_0
    move-exception v4

    .line 397
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "deleteCard card info has been already deleted! refID = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 402
    goto :goto_0

    .line 399
    :catch_1
    move-exception v4

    .line 401
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "deleteCard updateCardStatus NULLIFIED err! refID = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 403
    :goto_0
    if-eqz v2, :cond_1

    .line 405
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->refreshCardList()V

    .line 406
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardLostManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    move-result-object v0

    invoke-interface {v0, v3}, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;->clearNullifiedCardLocalInfo(Ljava/lang/String;)V

    .line 408
    :cond_1
    return-void
.end method

.method protected getTsmLibData(Ljava/lang/String;)Z
    .locals 6

    .line 418
    new-instance v1, Lcom/huawei/nfc/carrera/server/card/request/QueryUnionPayPushRequest;

    invoke-direct {v1}, Lcom/huawei/nfc/carrera/server/card/request/QueryUnionPayPushRequest;-><init>()V

    .line 419
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->queryCplc()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/server/card/request/QueryUnionPayPushRequest;->cplc:Ljava/lang/String;

    .line 420
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->mServerApi:Lcom/huawei/wallet/bankcard/server/BankCardServerApi;

    invoke-interface {v0, v1}, Lcom/huawei/wallet/bankcard/server/BankCardServerApi;->c(Lcom/huawei/nfc/carrera/server/card/request/QueryUnionPayPushRequest;)Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;

    move-result-object v2

    .line 421
    if-eqz v2, :cond_0

    iget v0, v2, Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;->returnCode:I

    if-nez v0, :cond_0

    .line 423
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;->getPushMsg()Ljava/lang/String;

    move-result-object v3

    .line 424
    if-eqz v3, :cond_0

    .line 426
    new-instance v4, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushMessageParser;

    invoke-direct {v4}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushMessageParser;-><init>()V

    .line 427
    invoke-virtual {v4, v3}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushMessageParser;->parsePushMessage(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    .line 428
    instance-of v0, v5, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;

    if-eqz v0, :cond_0

    .line 430
    move-object v0, v5

    check-cast v0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;

    invoke-direct {p0, v0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->handlePushMessage(Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;Ljava/lang/String;)Z

    move-result v0

    return v0

    .line 434
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected handleResult(ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 333
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 335
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;

    invoke-virtual {v0, p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;->notifyInstallResult(ILjava/lang/String;Ljava/lang/String;)V

    .line 337
    :cond_0
    return-void
.end method

.method protected isCardDownload(Ljava/lang/String;)Z
    .locals 3

    .line 161
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v2

    .line 163
    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    .line 165
    iget v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/4 v1, 0x2

    if-eq v1, v0, :cond_0

    iget v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 168
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 172
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method protected observeDownloadResult(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 143
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->curOperator:Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;

    const-string v1, "DOWNLOAD"

    invoke-virtual {v0, v1, p1, p0}, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->registerOperationListener(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/CUPOperationListener;)V

    .line 145
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->waitDownloadStarted(Ljava/lang/String;)V

    .line 146
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->waitAndHandleDownloadResult(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->curOperator:Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;

    const-string v1, "DOWNLOAD"

    invoke-virtual {v0, v1, p1, p0}, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->unregisterOperationListener(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/CUPOperationListener;)V

    .line 150
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->refreshCardList()V

    .line 151
    return-void
.end method

.method public operateFinished(I)V
    .locals 4

    .line 127
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

    .line 128
    move-object v2, p0

    monitor-enter v2

    .line 130
    const/4 v0, 0x1

    :try_start_0
    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->downloadOperationStatus:I

    .line 131
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->downloadOperationResult:I

    .line 132
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 134
    :goto_0
    return-void
.end method

.method public operateStart()V
    .locals 3

    .line 116
    const-string v0, "operateStart now."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 117
    move-object v1, p0

    monitor-enter v1

    .line 119
    const/4 v0, 0x0

    :try_start_0
    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;->downloadOperationStatus:I

    .line 120
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 122
    :goto_0
    return-void
.end method
