.class public final Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/BankCardOperateLogicApi;


# static fields
.field private static final SYNC_LOCK:[B

.field private static instance:Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final operateHandler:Landroid/os/Handler;

.field private final operateResultHandler:Landroid/os/Handler;

.field private final operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 69
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->SYNC_LOCK:[B

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->mContext:Landroid/content/Context;

    .line 92
    new-instance v3, Landroid/os/HandlerThread;

    const-string v0, "card_operate_thread"

    invoke-direct {v3, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 93
    invoke-virtual {v3}, Landroid/os/HandlerThread;->start()V

    .line 94
    invoke-virtual {v3}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v4

    .line 95
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operateHandler:Landroid/os/Handler;

    .line 97
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operateResultHandler:Landroid/os/Handler;

    .line 98
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operateHandler:Landroid/os/Handler;

    invoke-direct {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;

    .line 99
    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;
    .locals 4

    .line 109
    sget-object v2, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->SYNC_LOCK:[B

    monitor-enter v2

    .line 110
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->instance:Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 111
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->instance:Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;

    .line 113
    :cond_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->instance:Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 114
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public activeCard(Ljava/lang/String;ILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/ActiveCardCallback;)V
    .locals 3

    .line 236
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "requestActiveSmsCode now, refId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "mode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "operatorManager.isCiticMode(mode, refId)="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;

    invoke-virtual {v1, p2, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->isCiticMode(ILjava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 237
    const/4 v0, 0x0

    if-ne v0, p4, :cond_0

    .line 239
    const-string v0, "activeCard, but callback is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 240
    return-void

    .line 243
    :cond_0
    const/4 v0, 0x1

    invoke-static {p3, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 245
    :cond_1
    const-string v0, "activeCard, but params illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 246
    const/16 v0, -0x63

    invoke-interface {p4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/response/ActiveCardCallback;->activeResultCallback(I)V

    .line 247
    return-void

    .line 250
    :cond_2
    new-instance v2, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/HandleActiveCardResultTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operateResultHandler:Landroid/os/Handler;

    invoke-direct {v2, v0, p4}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/HandleActiveCardResultTask;-><init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/response/ActiveCardCallback;)V

    .line 251
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;

    invoke-virtual {v0, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->isCupMode(I)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;

    invoke-virtual {v0, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->isCiticMode(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 253
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->getCUPOperator()Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;

    move-result-object v0

    invoke-virtual {v0, p1, p3, v2}, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->active(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/HandleActiveCardResultTask;)V

    goto :goto_0

    .line 257
    :cond_4
    const-string v0, "requestActiveSmsCode, but the mode is not supported."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 258
    const/4 v0, -0x5

    invoke-interface {p4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/response/ActiveCardCallback;->activeResultCallback(I)V

    .line 260
    :goto_0
    return-void
.end method

.method public checkCUPInterruptedCard(ZLcom/huawei/nfc/carrera/logic/cardoperate/response/CheckCUPCardCallback;)V
    .locals 2

    .line 367
    const-string v0, "checkCUPInterruptedCard."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 368
    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleCheckCUPCardResultTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operateResultHandler:Landroid/os/Handler;

    invoke-direct {v1, p2, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleCheckCUPCardResultTask;-><init>(Lcom/huawei/nfc/carrera/logic/cardoperate/response/CheckCUPCardCallback;Landroid/os/Handler;)V

    .line 369
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->getCUPOperator()Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;

    move-result-object v0

    invoke-virtual {v0, p1, v1}, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->checkInterruptedCard(ZLcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleCheckCUPCardResultTask;)V

    .line 370
    return-void
.end method

.method public identifyCardType(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/CardTypeIdentifyCallback;)V
    .locals 6

    .line 147
    const-string v0, "identifyCardType now."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 150
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    if-ge v0, v1, :cond_1

    .line 152
    :cond_0
    const-string v0, "identifyCardType, cardNum is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 153
    const/4 v0, -0x1

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, -0x1

    invoke-interface {p2, v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/response/CardTypeIdentifyCallback;->identifyResult(ILjava/lang/String;II)V

    .line 154
    return-void

    .line 158
    :cond_1
    new-instance v4, Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/HandleIdentifyIssuerResultTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operateResultHandler:Landroid/os/Handler;

    invoke-direct {v4, v0, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/HandleIdentifyIssuerResultTask;-><init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/response/CardTypeIdentifyCallback;)V

    .line 159
    new-instance v5, Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/CardIssuerIdentifyTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;

    invoke-direct {v5, v0, p1, v1, v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/CardIssuerIdentifyTask;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/HandleIdentifyIssuerResultTask;)V

    .line 160
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operateHandler:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 161
    return-void
.end method

.method public initCUPCardOperator(Lcom/huawei/nfc/carrera/logic/cardoperate/response/InitCUPCardOperatorCallback;)V
    .locals 3

    .line 128
    const-string v0, "initCUPCardOperator"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 130
    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operateResultHandler:Landroid/os/Handler;

    invoke-direct {v1, v0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask;-><init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/response/InitCUPCardOperatorCallback;)V

    .line 132
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->getCUPOperator()Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;

    move-result-object v2

    .line 133
    invoke-virtual {v2, v1}, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->init(Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask;)V

    .line 134
    return-void
.end method

.method public initEseInfo()V
    .locals 2

    .line 120
    const-string v0, "initEseInfo."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 121
    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/EseTsmInitLoader;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->mContext:Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/EseTsmInitLoader;-><init>(Landroid/content/Context;)V

    .line 122
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operateHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 123
    return-void
.end method

.method public initEseInfo(Lcom/huawei/nfc/carrera/logic/cardoperate/response/InitEseResultCallback;)V
    .locals 3

    .line 391
    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/init/HandleInitEseResultTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operateResultHandler:Landroid/os/Handler;

    invoke-direct {v1, v0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/init/HandleInitEseResultTask;-><init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/response/InitEseResultCallback;)V

    .line 392
    new-instance v2, Lcom/huawei/nfc/carrera/logic/cardoperate/init/InitEseTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->mContext:Landroid/content/Context;

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/init/InitEseTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/init/HandleInitEseResultTask;)V

    .line 393
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operateHandler:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 394
    return-void
.end method

.method public notifyCUPCardOperation(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lcom/huawei/nfc/carrera/logic/cardoperate/response/HandleCUPOperateResultCallback;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList<Ljava/lang/String;>;Lcom/huawei/nfc/carrera/logic/cardoperate/response/HandleCUPOperateResultCallback;)V"
        }
    .end annotation

    .line 322
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "notifyCUPCardOperation, event: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 323
    const/4 v0, 0x0

    if-ne v0, p5, :cond_0

    .line 325
    const-string v0, "notifyCUPCardOperation, callback is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 326
    return-void

    .line 329
    :cond_0
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    invoke-static {p2, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    invoke-static {p3, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 331
    :cond_1
    const-string v0, "notifyCUPCardOperation, params is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 332
    const/16 v0, -0x63

    invoke-interface {p5, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/response/HandleCUPOperateResultCallback;->operateResultCallback(I)V

    .line 333
    return-void

    .line 336
    :cond_2
    new-instance v6, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleOperationResutTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operateResultHandler:Landroid/os/Handler;

    invoke-direct {v6, v0, p5}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleOperationResutTask;-><init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/response/HandleCUPOperateResultCallback;)V

    .line 337
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->getCUPOperator()Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;

    move-result-object v0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, v6

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->notifyCardOperation(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/HandleOperationResutTask;)V

    .line 338
    return-void
.end method

.method public notifyCUPCardPersonalized(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/HandleCUPPersonalizedResultCallback;)V
    .locals 3

    .line 344
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "notifyCUPCardPersonalized, refId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",aid: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 345
    const/4 v0, 0x0

    if-ne v0, p4, :cond_0

    .line 347
    const-string v0, "notifyCUPCardPersonalized, callback is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 348
    return-void

    .line 351
    :cond_0
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    invoke-static {p2, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    invoke-static {p3, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 353
    :cond_1
    const-string v0, "notifyCUPCardPersonalized, params is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 354
    const/4 v0, -0x1

    invoke-interface {p4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/response/HandleCUPPersonalizedResultCallback;->handleResultCallback(I)V

    .line 355
    return-void

    .line 358
    :cond_2
    new-instance v2, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedResultTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operateResultHandler:Landroid/os/Handler;

    invoke-direct {v2, p4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedResultTask;-><init>(Lcom/huawei/nfc/carrera/logic/cardoperate/response/HandleCUPPersonalizedResultCallback;Landroid/os/Handler;)V

    .line 359
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->getCUPOperator()Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, v2}, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->notifyCardPesonalized(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedResultTask;)V

    .line 361
    return-void
.end method

.method public nullifyCard(Ljava/lang/String;ILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/NullifyCardResultCallback;)V
    .locals 3

    .line 278
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "nullifyCard now, mode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ,refId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 279
    const/4 v0, 0x0

    if-ne v0, p4, :cond_0

    .line 281
    const-string v0, "nullifyCard, callback is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 282
    return-void

    .line 285
    :cond_0
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 287
    const-string v0, "nullifyCard, params is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 288
    const/4 v0, -0x1

    invoke-interface {p4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/response/NullifyCardResultCallback;->nullifyResultCallback(I)V

    .line 289
    return-void

    .line 292
    :cond_1
    new-instance v2, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/HandleNullifyCardResultTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operateResultHandler:Landroid/os/Handler;

    invoke-direct {v2, v0, p4}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/HandleNullifyCardResultTask;-><init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/response/NullifyCardResultCallback;)V

    .line 293
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;

    invoke-virtual {v0, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->isCupMode(I)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;

    invoke-virtual {v0, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->isCiticMode(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 295
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->getCUPOperator()Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;

    move-result-object v0

    invoke-virtual {v0, p1, v2}, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->nullify(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/HandleNullifyCardResultTask;)V

    goto :goto_0

    .line 299
    :cond_3
    const-string v0, "nullifyCard, but the mode is not supported."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 300
    const/4 v0, -0x2

    invoke-interface {p4, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/response/NullifyCardResultCallback;->nullifyResultCallback(I)V

    .line 302
    :goto_0
    return-void
.end method

.method public openCard(ILcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;Lcom/huawei/nfc/carrera/logic/cardoperate/response/InstallCardResultCallback;)V
    .locals 4

    .line 166
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "openCard now, mode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 167
    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    .line 169
    const-string v0, "openCard, callback is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 170
    return-void

    .line 173
    :cond_0
    new-instance v3, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operateResultHandler:Landroid/os/Handler;

    invoke-direct {v3, v0, p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;-><init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/response/InstallCardResultCallback;)V

    .line 174
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;->getCardNum()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 175
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 177
    :cond_1
    const-string v0, "openCard, input info is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 178
    const/4 v0, -0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v3, v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;->notifyInstallResult(ILjava/lang/String;Ljava/lang/String;)V

    .line 180
    return-void

    .line 183
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->isCupMode(I)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->isCiticMode(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 185
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->getCUPOperator()Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;

    move-result-object v0

    invoke-virtual {v0, p2, v3}, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->install(Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;)V

    goto :goto_0

    .line 189
    :cond_4
    const-string v0, "opencard, but the mode is not supported."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 190
    const/4 v0, -0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v3, v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;->notifyInstallResult(ILjava/lang/String;Ljava/lang/String;)V

    .line 193
    :goto_0
    return-void
.end method

.method public registerCUPOperationListener(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/CUPOperationListener;)V
    .locals 2

    .line 307
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "registerCUPOperationListener, event: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",refId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 308
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->getCUPOperator()Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->registerOperationListener(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/CUPOperationListener;)V

    .line 309
    return-void
.end method

.method public requestActiveSmsCode(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/response/RequestVerifyCodeCallback;)V
    .locals 3

    .line 207
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "requestActiveSmsCode now, refId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "mode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "operatorManager.isCiticMode(mode, refId)="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;

    invoke-virtual {v1, p2, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->isCiticMode(ILjava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 208
    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    .line 210
    const-string v0, "requestActiveSmsCode, but callback is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 211
    return-void

    .line 214
    :cond_0
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 216
    const-string v0, "requestActiveSmsCode, but params is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 217
    const/16 v0, -0x63

    const/4 v1, 0x0

    invoke-interface {p3, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/response/RequestVerifyCodeCallback;->requestResultCallback(ILjava/lang/String;)V

    .line 218
    return-void

    .line 221
    :cond_1
    new-instance v2, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/HandleVerifyCodeResultTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operateResultHandler:Landroid/os/Handler;

    invoke-direct {v2, v0, p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/HandleVerifyCodeResultTask;-><init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/response/RequestVerifyCodeCallback;)V

    .line 222
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;

    invoke-virtual {v0, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->isCupMode(I)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;

    invoke-virtual {v0, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->isCiticMode(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 224
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->getCUPOperator()Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;

    move-result-object v0

    invoke-virtual {v0, p1, v2}, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->requestActiveVerifyCode(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/HandleVerifyCodeResultTask;)V

    goto :goto_0

    .line 228
    :cond_3
    const-string v0, "requestActiveSmsCode, but the mode is not supported."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 229
    const/16 v0, -0x63

    const/4 v1, 0x0

    invoke-interface {p3, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/response/RequestVerifyCodeCallback;->requestResultCallback(ILjava/lang/String;)V

    .line 231
    :goto_0
    return-void
.end method

.method public requestNullifySmsCode(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/response/RequestVerifyCodeCallback;)V
    .locals 2

    .line 265
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "requestNullifySmsCode now, refId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 266
    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    .line 268
    const-string v0, "requestNullifySmsCode, but callback is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 269
    return-void

    .line 271
    :cond_0
    const/16 v0, -0x63

    const/4 v1, 0x0

    invoke-interface {p3, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/response/RequestVerifyCodeCallback;->requestResultCallback(ILjava/lang/String;)V

    .line 273
    return-void
.end method

.method public retryDownloadCard(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/InstallCardResultCallback;)V
    .locals 2

    .line 375
    const-string v0, "retry Download Card now"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 376
    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    .line 378
    const-string v0, "retry Download Card, callback is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 379
    return-void

    .line 382
    :cond_0
    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operateResultHandler:Landroid/os/Handler;

    invoke-direct {v1, v0, p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;-><init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/response/InstallCardResultCallback;)V

    .line 383
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->getCUPOperator()Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;

    move-result-object v0

    invoke-virtual {v0, p1, p2, v1}, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->reinstall(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;)V

    .line 384
    return-void
.end method

.method public unregisterCUPOperationListener(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/CUPOperationListener;)V
    .locals 2

    .line 314
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unregisterCUPOperationListener, event: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",refId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 315
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->operatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->getCUPOperator()Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->unregisterOperationListener(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/CUPOperationListener;)V

    .line 316
    return-void
.end method
