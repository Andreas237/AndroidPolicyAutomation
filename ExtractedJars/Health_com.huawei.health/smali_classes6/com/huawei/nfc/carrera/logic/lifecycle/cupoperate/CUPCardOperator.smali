.class public Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/CardOperateListener;


# static fields
.field private static final CHECK_INTERRUPTED_DELAY_TIME:I = 0xea60

.field private static final LISTENERS_LOCK:Ljava/lang/Object;

.field public static final OPERATE_EVENT_DELETE:Ljava/lang/String; = "DELETE"

.field public static final OPERATE_EVENT_DOWNLOAD:Ljava/lang/String; = "DOWNLOAD"

.field public static final OPERATE_EVENT_WIPEOUT:Ljava/lang/String; = "WIPEOUT"

.field private static final TAG:Ljava/lang/String; = "CUPCardOperator"


# instance fields
.field private cardModifyHandler:Landroid/os/Handler;

.field private final cardServerApi:Lcom/huawei/wallet/bankcard/server/BankCardServerApi;

.field private final cupServiceApi:Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;

.field private deleteListeners:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/CUPOperationListener;>;"
        }
    .end annotation
.end field

.field private downloadListeners:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/CUPOperationListener;>;"
        }
    .end annotation
.end field

.field private final mContext:Landroid/content/Context;

.field private final operateHandler:Landroid/os/Handler;

.field private wipeoutListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/logic/cardoperate/response/CUPOperationListener;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 128
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->LISTENERS_LOCK:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 2

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 136
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->mContext:Landroid/content/Context;

    .line 137
    new-instance v0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->cupServiceApi:Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;

    .line 138
    new-instance v0, Lcom/huawei/wallet/bankcard/server/BankCardServer;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/wallet/bankcard/server/BankCardServer;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->cardServerApi:Lcom/huawei/wallet/bankcard/server/BankCardServerApi;

    .line 140
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->operateHandler:Landroid/os/Handler;

    .line 141
    return-void
.end method


# virtual methods
.method public active(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/HandleActiveCardResultTask;)V
    .locals 9

    .line 225
    sget-object v6, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->LISTENERS_LOCK:Ljava/lang/Object;

    monitor-enter v6

    .line 227
    :try_start_0
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->cardServerApi:Lcom/huawei/wallet/bankcard/server/BankCardServerApi;

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;-><init>(Landroid/content/Context;Lcom/huawei/wallet/bankcard/server/BankCardServerApi;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/HandleActiveCardResultTask;)V

    move-object v7, v0

    .line 228
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->operateHandler:Landroid/os/Handler;

    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 229
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v8

    monitor-exit v6

    throw v8

    .line 230
    :goto_0
    return-void
.end method

.method public checkInterruptedCard(ZLcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleCheckCUPCardResultTask;)V
    .locals 6

    .line 405
    sget-object v3, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->LISTENERS_LOCK:Ljava/lang/Object;

    monitor-enter v3

    .line 407
    :try_start_0
    new-instance v4, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->mContext:Landroid/content/Context;

    invoke-direct {v4, v0, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleCheckCUPCardResultTask;)V

    .line 408
    if-eqz p1, :cond_0

    .line 410
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->operateHandler:Landroid/os/Handler;

    const-wide/32 v1, 0xea60

    invoke-virtual {v0, v4, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 414
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->operateHandler:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 416
    :goto_0
    monitor-exit v3

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v3

    throw v5

    .line 417
    :goto_1
    return-void
.end method

.method public indentifyCUPCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;
    .locals 4

    .line 162
    new-instance v3, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/CUPCardIdentifier;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->cupServiceApi:Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->cardServerApi:Lcom/huawei/wallet/bankcard/server/BankCardServerApi;

    invoke-direct {v3, v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/CUPCardIdentifier;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;Lcom/huawei/wallet/bankcard/server/BankCardServerApi;)V

    .line 163
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/CUPCardIdentifier;->indentifyCUPCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;

    move-result-object v0

    return-object v0
.end method

.method public init(Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask;)V
    .locals 3

    .line 150
    new-instance v2, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->cupServiceApi:Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;

    invoke-direct {v2, v0, v1, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask;)V

    .line 151
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->operateHandler:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 152
    return-void
.end method

.method public install(Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;)V
    .locals 10

    .line 174
    sget-object v7, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->LISTENERS_LOCK:Ljava/lang/Object;

    monitor-enter v7

    .line 176
    :try_start_0
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->cardServerApi:Lcom/huawei/wallet/bankcard/server/BankCardServerApi;

    iget-object v3, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->cupServiceApi:Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;

    move-object v4, p1

    move-object v5, p2

    move-object v6, p0

    invoke-direct/range {v0 .. v6}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;-><init>(Landroid/content/Context;Lcom/huawei/wallet/bankcard/server/BankCardServerApi;Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;)V

    move-object v8, v0

    .line 178
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->operateHandler:Landroid/os/Handler;

    invoke-virtual {v0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 179
    monitor-exit v7

    goto :goto_0

    :catchall_0
    move-exception v9

    monitor-exit v7

    throw v9

    .line 180
    :goto_0
    return-void
.end method

.method public notifyCardOperation(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleOperationResutTask;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList<Ljava/lang/String;>;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleOperationResutTask;)V"
        }
    .end annotation

    .line 258
    sget-object v2, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->LISTENERS_LOCK:Ljava/lang/Object;

    monitor-enter v2

    .line 260
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->cardModifyHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 262
    new-instance v3, Landroid/os/HandlerThread;

    const-string v0, "cup_card_modify_thread"

    invoke-direct {v3, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 263
    invoke-virtual {v3}, Landroid/os/HandlerThread;->start()V

    .line 264
    invoke-virtual {v3}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v4

    .line 265
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->cardModifyHandler:Landroid/os/Handler;

    .line 268
    :cond_0
    const/4 v3, 0x0

    .line 269
    const-string v0, "DOWNLOAD"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 271
    new-instance v3, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardDownloadTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->cupServiceApi:Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;

    invoke-direct {v3, v0, v1, p5, p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardDownloadTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleOperationResutTask;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/CardOperateListener;)V

    goto :goto_0

    .line 273
    :cond_1
    const-string v0, "DELETE"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 275
    new-instance v3, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardDeleteTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->cupServiceApi:Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;

    invoke-direct {v3, v0, v1, p5, p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardDeleteTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleOperationResutTask;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/CardOperateListener;)V

    goto :goto_0

    .line 277
    :cond_2
    const-string v0, "WIPEOUT"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 279
    new-instance v3, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardSwipeTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->cupServiceApi:Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;

    invoke-direct {v3, v0, v1, p5, p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardSwipeTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleOperationResutTask;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/CardOperateListener;)V

    goto :goto_0

    .line 283
    :cond_3
    const-string v0, "notifyCardOperation, illegal event."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 286
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v3, :cond_4

    .line 288
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->cardModifyHandler:Landroid/os/Handler;

    invoke-virtual {v3, p2, p3, p4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleCardOperateBaseTask;->doTask(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Landroid/os/Handler;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 290
    :cond_4
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v2

    throw v5

    .line 291
    :goto_1
    return-void
.end method

.method public notifyCardPesonalized(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedResultTask;)V
    .locals 11

    .line 382
    sget-object v7, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->LISTENERS_LOCK:Ljava/lang/Object;

    monitor-enter v7

    .line 384
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->cardModifyHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 386
    new-instance v8, Landroid/os/HandlerThread;

    const-string v0, "cup_card_modify_thread"

    invoke-direct {v8, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 387
    invoke-virtual {v8}, Landroid/os/HandlerThread;->start()V

    .line 388
    invoke-virtual {v8}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v9

    .line 389
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, v9}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->cardModifyHandler:Landroid/os/Handler;

    .line 392
    :cond_0
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->mContext:Landroid/content/Context;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p0

    invoke-direct/range {v0 .. v6}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedResultTask;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/CardOperateListener;)V

    move-object v8, v0

    .line 394
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->cardModifyHandler:Landroid/os/Handler;

    invoke-virtual {v0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 395
    monitor-exit v7

    goto :goto_0

    :catchall_0
    move-exception v10

    monitor-exit v7

    throw v10

    .line 396
    :goto_0
    return-void
.end method

.method public nullify(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/HandleNullifyCardResultTask;)V
    .locals 5

    .line 240
    sget-object v2, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->LISTENERS_LOCK:Ljava/lang/Object;

    monitor-enter v2

    .line 242
    :try_start_0
    new-instance v3, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->cardServerApi:Lcom/huawei/wallet/bankcard/server/BankCardServerApi;

    invoke-direct {v3, v0, v1, p1, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;-><init>(Landroid/content/Context;Lcom/huawei/wallet/bankcard/server/BankCardServerApi;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/HandleNullifyCardResultTask;)V

    .line 243
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->operateHandler:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 244
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    .line 245
    :goto_0
    return-void
.end method

.method public operateFinished(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 8

    .line 478
    const-string v0, "CUPCardOperator, operateFinished"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 479
    const/4 v2, 0x0

    .line 480
    sget-object v3, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->LISTENERS_LOCK:Ljava/lang/Object;

    monitor-enter v3

    .line 482
    const/4 v4, 0x0

    .line 483
    const-string v0, "DOWNLOAD"

    :try_start_0
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->downloadListeners:Ljava/util/Map;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 485
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->downloadListeners:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v4

    goto :goto_0

    .line 487
    :cond_0
    const-string v0, "DELETE"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->deleteListeners:Ljava/util/Map;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 489
    const-string v0, "CUPCardOperator, enter operateFinished  OPERATE_EVENT_DELETE"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 490
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->deleteListeners:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v4

    goto :goto_0

    .line 492
    :cond_1
    const-string v0, "WIPEOUT"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->wipeoutListeners:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 494
    iget-object v4, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->wipeoutListeners:Ljava/util/List;

    goto :goto_0

    .line 498
    :cond_2
    const-string v0, "operateStart, illegal event."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 500
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v4, :cond_3

    .line 502
    const-string v0, "operateStart, but no listeners."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 503
    monitor-exit v3

    return-void

    .line 505
    :cond_3
    :try_start_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 506
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/nfc/carrera/logic/cardoperate/response/CUPOperationListener;

    .line 508
    const/4 v0, 0x0

    if-eq v0, v6, :cond_4

    .line 510
    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 512
    :cond_4
    goto :goto_1

    .line 513
    :cond_5
    monitor-exit v3

    goto :goto_2

    :catchall_0
    move-exception v7

    monitor-exit v3

    throw v7

    .line 515
    :goto_2
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/logic/cardoperate/response/CUPOperationListener;

    .line 517
    const/4 v0, 0x0

    if-eq v0, v4, :cond_6

    .line 519
    invoke-interface {v4, p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/response/CUPOperationListener;->operateFinished(I)V

    .line 521
    :cond_6
    goto :goto_3

    .line 522
    :cond_7
    return-void
.end method

.method public operateStart(Ljava/lang/String;Ljava/lang/String;)V
    .locals 10

    .line 422
    const-string v0, "CUPCardOperator, operateStart"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 423
    const/4 v4, 0x0

    .line 424
    sget-object v5, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->LISTENERS_LOCK:Ljava/lang/Object;

    monitor-enter v5

    .line 426
    const/4 v6, 0x0

    .line 427
    const-string v0, "DOWNLOAD"

    :try_start_0
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->downloadListeners:Ljava/util/Map;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 429
    const-string v0, "CUPCardOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " CardEvent DOWNLOAD bank cardEvent refId : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 430
    const/4 v0, 0x1

    invoke-static {p2, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 432
    const-string v0, "CUPCardOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " CardEvent DOWNLOAD bank cardEvent START_LOCK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 433
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, p2, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardEvent(Ljava/lang/String;I)V

    .line 435
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->downloadListeners:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v6

    goto :goto_0

    .line 437
    :cond_1
    const-string v0, "DELETE"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->deleteListeners:Ljava/util/Map;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 439
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->deleteListeners:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v6

    goto :goto_0

    .line 441
    :cond_2
    const-string v0, "WIPEOUT"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->wipeoutListeners:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 443
    iget-object v6, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->wipeoutListeners:Ljava/util/List;

    goto :goto_0

    .line 447
    :cond_3
    const-string v0, "operateStart, illegal event or empty listeners."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 450
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v6, :cond_4

    .line 452
    const-string v0, "operateStart, but no listeners."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 453
    monitor-exit v5

    return-void

    .line 455
    :cond_4
    :try_start_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 456
    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/nfc/carrera/logic/cardoperate/response/CUPOperationListener;

    .line 458
    const/4 v0, 0x0

    if-eq v0, v8, :cond_5

    .line 460
    invoke-interface {v4, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 462
    :cond_5
    goto :goto_1

    .line 463
    :cond_6
    monitor-exit v5

    goto :goto_2

    :catchall_0
    move-exception v9

    monitor-exit v5

    throw v9

    .line 465
    :goto_2
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/nfc/carrera/logic/cardoperate/response/CUPOperationListener;

    .line 467
    const/4 v0, 0x0

    if-eq v0, v6, :cond_7

    .line 469
    invoke-interface {v6}, Lcom/huawei/nfc/carrera/logic/cardoperate/response/CUPOperationListener;->operateStart()V

    .line 471
    :cond_7
    goto :goto_3

    .line 472
    :cond_8
    return-void
.end method

.method public registerOperationListener(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/CUPOperationListener;)V
    .locals 4

    .line 302
    const-string v0, "registerOperationListener, registerOperationListener"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 303
    sget-object v2, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->LISTENERS_LOCK:Ljava/lang/Object;

    monitor-enter v2

    .line 305
    const-string v0, "DOWNLOAD"

    :try_start_0
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 307
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->downloadListeners:Ljava/util/Map;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 309
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->downloadListeners:Ljava/util/Map;

    .line 312
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->downloadListeners:Ljava/util/Map;

    invoke-interface {v0, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 314
    :cond_1
    const-string v0, "DELETE"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 316
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->deleteListeners:Ljava/util/Map;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 318
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->deleteListeners:Ljava/util/Map;

    .line 321
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->deleteListeners:Ljava/util/Map;

    invoke-interface {v0, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 323
    :cond_3
    const-string v0, "WIPEOUT"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 325
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->wipeoutListeners:Ljava/util/List;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 327
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->wipeoutListeners:Ljava/util/List;

    .line 330
    :cond_4
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->wipeoutListeners:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 334
    :cond_5
    const-string v0, "registerOperationListener, illegal event."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 336
    :goto_0
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 337
    :goto_1
    return-void
.end method

.method public reinstall(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;)V
    .locals 10

    .line 191
    sget-object v7, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->LISTENERS_LOCK:Ljava/lang/Object;

    monitor-enter v7

    .line 193
    :try_start_0
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/RetryInstallCupCardTask;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->mContext:Landroid/content/Context;

    move-object v2, p1

    move-object v3, p2

    iget-object v4, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->cardServerApi:Lcom/huawei/wallet/bankcard/server/BankCardServerApi;

    move-object v5, p3

    move-object v6, p0

    invoke-direct/range {v0 .. v6}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/RetryInstallCupCardTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/wallet/bankcard/server/BankCardServerApi;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;)V

    move-object v8, v0

    .line 195
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->operateHandler:Landroid/os/Handler;

    invoke-virtual {v0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 196
    monitor-exit v7

    goto :goto_0

    :catchall_0
    move-exception v9

    monitor-exit v7

    throw v9

    .line 197
    :goto_0
    return-void
.end method

.method public requestActiveVerifyCode(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/HandleVerifyCodeResultTask;)V
    .locals 5

    .line 208
    sget-object v2, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->LISTENERS_LOCK:Ljava/lang/Object;

    monitor-enter v2

    .line 210
    :try_start_0
    new-instance v3, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->cardServerApi:Lcom/huawei/wallet/bankcard/server/BankCardServerApi;

    invoke-direct {v3, v0, v1, p1, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;-><init>(Landroid/content/Context;Lcom/huawei/wallet/bankcard/server/BankCardServerApi;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/HandleVerifyCodeResultTask;)V

    .line 211
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->operateHandler:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 212
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    .line 213
    :goto_0
    return-void
.end method

.method public unregisterOperationListener(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/CUPOperationListener;)V
    .locals 4

    .line 348
    const-string v0, "registerOperationListener, unregisterOperationListener"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 349
    sget-object v2, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->LISTENERS_LOCK:Ljava/lang/Object;

    monitor-enter v2

    .line 351
    const-string v0, "DOWNLOAD"

    :try_start_0
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->downloadListeners:Ljava/util/Map;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 353
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->downloadListeners:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 355
    :cond_0
    const-string v0, "DELETE"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->deleteListeners:Ljava/util/Map;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 357
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->deleteListeners:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 359
    :cond_1
    const-string v0, "WIPEOUT"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->wipeoutListeners:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 361
    const/4 v0, 0x0

    if-eq v0, p3, :cond_3

    .line 363
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->wipeoutListeners:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 368
    :cond_2
    const-string v0, "unregisterOperationListener, illegal event."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 370
    :cond_3
    :goto_0
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 371
    :goto_1
    return-void
.end method
