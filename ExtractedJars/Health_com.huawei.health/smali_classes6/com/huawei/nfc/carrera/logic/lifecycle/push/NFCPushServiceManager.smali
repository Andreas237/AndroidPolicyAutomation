.class public Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager$PushServiceHandler;
    }
.end annotation


# static fields
.field private static final RECEIVE_PUSH_MESSAGE:I = 0x2

.field private static final RECEIVE_PUSH_TOKEN_INFO:I = 0x1

.field private static final REUPLOAD_TIME:J = 0x5265c00L

.field private static final SHAREPREFRENCE_KEY_PUSHSUCCESSTIME:Ljava/lang/String; = "nfc_pushtoken_successtime"

.field private static final SHAREPREFRENCE_KEY_REUPLOADED:Ljava/lang/String; = "nfc_pushtoken_reuploaded"

.field private static final SHAREPREFRENCE_KEY_UPLOADED_PUSHTOKEN:Ljava/lang/String; = "nfc_uploaded_pushtoken"

.field private static final SYNC_LOCK:[B

.field private static final TAG:Ljava/lang/String; = "PluginPay NFCPushServiceManager"

.field private static volatile instance:Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager; = null

.field private static final listenerLock:Ljava/lang/Object;


# instance fields
.field private mContext:Landroid/content/Context;

.field private final pushServiceHandler:Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager$PushServiceHandler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 62
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->SYNC_LOCK:[B

    .line 110
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->listenerLock:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 136
    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 137
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->mContext:Landroid/content/Context;

    goto :goto_0

    .line 139
    :cond_0
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->mContext:Landroid/content/Context;

    .line 142
    :goto_0
    new-instance v2, Landroid/os/HandlerThread;

    const-string v0, "pushServiceHandlerThread"

    invoke-direct {v2, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 143
    invoke-virtual {v2}, Landroid/os/HandlerThread;->start()V

    .line 144
    new-instance v0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager$PushServiceHandler;

    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager$PushServiceHandler;-><init>(Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->pushServiceHandler:Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager$PushServiceHandler;

    .line 145
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;Ljava/lang/String;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->checkAndUploadPushToken(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;Ljava/lang/String;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->handlePushMessage(Ljava/lang/String;)V

    return-void
.end method

.method private checkAndUploadPushToken(Ljava/lang/String;)V
    .locals 10

    .line 225
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->queryCplc()Ljava/lang/String;

    move-result-object v4

    .line 226
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getDeviceSN()Ljava/lang/String;

    move-result-object v5

    .line 227
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-static {v5, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 228
    :cond_0
    const-string v0, "uploadNewPushToken fail cplc == null or pushToken == null or sn == null "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 229
    return-void

    .line 232
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->getUploadedPushToken()Ljava/lang/String;

    move-result-object v6

    .line 233
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "nfc_pushtoken_reuploaded"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v7

    .line 235
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->getCurrentSuccessTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/32 v2, 0x5265c00

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    const/4 v8, 0x1

    goto :goto_0

    :cond_2
    const/4 v8, 0x0

    .line 236
    :goto_0
    if-eqz v7, :cond_3

    if-eqz v8, :cond_3

    const/4 v0, 0x1

    invoke-static {v6, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v6, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 237
    const-string v0, "uploadNewPushToken, the token had reported."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 238
    return-void

    .line 241
    :cond_3
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->uploadNewPushToken(Ljava/lang/String;)Z

    move-result v9

    .line 244
    if-eqz v9, :cond_4

    .line 245
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    const-string v1, "nfc_pushtoken_successtime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->putLong(Ljava/lang/String;Ljava/lang/Long;)Z

    .line 246
    invoke-direct {p0, p1, v5}, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->storageUploadedPushToken(Ljava/lang/String;Ljava/lang/String;)V

    .line 248
    :cond_4
    return-void
.end method

.method private getCurrentSuccessTime()J
    .locals 4

    .line 436
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    const-string v1, "nfc_pushtoken_successtime"

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getLong(Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;
    .locals 4

    .line 124
    sget-object v0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->instance:Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 125
    sget-object v2, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->SYNC_LOCK:[B

    monitor-enter v2

    .line 126
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->instance:Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 127
    new-instance v0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->instance:Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 132
    :cond_1
    :goto_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->instance:Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;

    return-object v0
.end method

.method private getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 420
    const/4 v0, 0x0

    return-object v0
.end method

.method private getSharedPreference(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 410
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->mContext:Landroid/content/Context;

    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private handelCUPPersonalizedMessage(Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPPersonalizedMessage;)V
    .locals 4

    .line 358
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->mContext:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPPersonalizedMessage;->getCplc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPPersonalizedMessage;->getVirtualCardRefID()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPPersonalizedMessage;->getAid()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPOperateServiceManager;->startCUPPersonalService(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 359
    return-void
.end method

.method private handelNullifyAccountMessage(Lcom/huawei/nfc/carrera/lifecycle/push/data/PushNullifyAccountMessage;)V
    .locals 4

    .line 369
    const-string v0, "handelNullifyAccountMessage"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 370
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->mContext:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushNullifyAccountMessage;->getUser()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushNullifyAccountMessage;->getCplc()Ljava/lang/String;

    move-result-object v2

    .line 371
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushNullifyAccountMessage;->getSign()Ljava/lang/String;

    move-result-object v3

    .line 370
    invoke-static {v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyServiceManager;->startNullifyAccountManageService(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 372
    return-void
.end method

.method private handleCUPTsmlibPushMessage(Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;)V
    .locals 5

    .line 363
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleCUPTsmlibPushMessage,cup operate cplc: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;->getCplc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Z)V

    .line 364
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->mContext:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;->getEvent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;->getSsid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;->getSign()Ljava/lang/String;

    move-result-object v3

    .line 365
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;->getVirtualCards()Ljava/util/ArrayList;

    move-result-object v4

    .line 364
    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPOperateServiceManager;->startCUPOperateService(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 366
    return-void
.end method

.method private handlePushMessage(Ljava/lang/String;)V
    .locals 8

    .line 318
    new-instance v5, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushMessageParser;

    invoke-direct {v5}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushMessageParser;-><init>()V

    .line 319
    invoke-virtual {v5, p1}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushMessageParser;->parsePushMessage(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    .line 320
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 321
    const-string v0, "handlePushMessage, push msg is null."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 322
    return-void

    .line 325
    :cond_0
    instance-of v0, v6, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushLostMessage;

    if-eqz v0, :cond_1

    .line 326
    move-object v7, v6

    check-cast v7, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushLostMessage;

    .line 327
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->mContext:Landroid/content/Context;

    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushLostMessage;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushLostMessage;->getStatus()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushLostMessage;->getCplc()Ljava/lang/String;

    move-result-object v3

    .line 328
    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushLostMessage;->getDpanid()Ljava/lang/String;

    move-result-object v4

    .line 327
    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/nfc/carrera/lifecycle/lostservice/LostServiceManager;->startCardLostManageService(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 329
    goto :goto_0

    :cond_1
    instance-of v0, v6, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushConsumeMessage;

    if-eqz v0, :cond_2

    goto :goto_0

    .line 331
    :cond_2
    instance-of v0, v6, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;

    if-eqz v0, :cond_3

    .line 332
    move-object v0, v6

    check-cast v0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->handleCUPTsmlibPushMessage(Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPOperateMessage;)V

    goto :goto_0

    .line 333
    :cond_3
    instance-of v0, v6, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPPersonalizedMessage;

    if-eqz v0, :cond_4

    .line 334
    move-object v0, v6

    check-cast v0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPPersonalizedMessage;

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->handelCUPPersonalizedMessage(Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPPersonalizedMessage;)V

    goto :goto_0

    .line 335
    :cond_4
    instance-of v0, v6, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushNullifyAccountMessage;

    if-eqz v0, :cond_5

    .line 336
    move-object v0, v6

    check-cast v0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushNullifyAccountMessage;

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->handelNullifyAccountMessage(Lcom/huawei/nfc/carrera/lifecycle/push/data/PushNullifyAccountMessage;)V

    goto :goto_0

    .line 337
    :cond_5
    instance-of v0, v6, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushDevicesLostMessage;

    if-eqz v0, :cond_6

    .line 339
    move-object v7, v6

    check-cast v7, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushDevicesLostMessage;

    .line 340
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->mContext:Landroid/content/Context;

    iget-object v1, v7, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushDevicesLostMessage;->cplc:Ljava/lang/String;

    iget-object v2, v7, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushDevicesLostMessage;->sign:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/lifecycle/lostservice/LostServiceManager;->startDevicesLostManageService(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 341
    goto :goto_0

    .line 342
    :cond_6
    const-string v0, "handlePushMessage, unknown msg"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 344
    :goto_0
    return-void
.end method

.method private setCurrentSuccessTime(J)V
    .locals 3

    .line 429
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    const-string v1, "nfc_pushtoken_successtime"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->putLong(Ljava/lang/String;Ljava/lang/Long;)Z

    .line 430
    return-void
.end method

.method private setSharedPreference(Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I
    .locals 2

    .line 401
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->mContext:Landroid/content/Context;

    .line 402
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 401
    invoke-static {v0, v1, p1, p2, p3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    move-result v0

    return v0
.end method

.method private storageUploadedPushToken(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 308
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->savePushToken(Ljava/lang/String;)V

    .line 309
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "nfc_pushtoken_reuploaded"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->putBoolean(Ljava/lang/String;Z)Z

    .line 310
    return-void
.end method

.method private uploadNewPushToken(Ljava/lang/String;)Z
    .locals 6

    .line 277
    const-string v0, "enter uploadNewPushToken "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 278
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/request/PushInfoReportRequest;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/server/card/request/PushInfoReportRequest;-><init>()V

    .line 279
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->queryCplc()Ljava/lang/String;

    move-result-object v3

    .line 280
    invoke-virtual {v2, v3}, Lcom/huawei/nfc/carrera/server/card/request/PushInfoReportRequest;->setCplc(Ljava/lang/String;)V

    .line 281
    const-string v0, "ptoken"

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/request/PushInfoReportRequest;->setReportType(Ljava/lang/String;)V

    .line 282
    invoke-virtual {v2, p1}, Lcom/huawei/nfc/carrera/server/card/request/PushInfoReportRequest;->setDeviceInfo(Ljava/lang/String;)V

    .line 283
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getDeviceSN()Ljava/lang/String;

    move-result-object v4

    .line 284
    invoke-virtual {v2, v4}, Lcom/huawei/nfc/carrera/server/card/request/PushInfoReportRequest;->setSn(Ljava/lang/String;)V

    .line 286
    const-string v0, "260086000000068459"

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/request/PushInfoReportRequest;->setMerchantID(Ljava/lang/String;)V

    .line 287
    const/4 v0, -0x1

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/request/PushInfoReportRequest;->setRsaKeyIndex(I)V

    .line 288
    invoke-static {}, Lcom/huawei/wallet/utils/Generator;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/request/PushInfoReportRequest;->setSrcTransactionID(Ljava/lang/String;)V

    .line 289
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;-><init>(Landroid/content/Context;)V

    .line 290
    invoke-virtual {v0, v2}, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->reportPushInfo(Lcom/huawei/nfc/carrera/server/card/request/PushInfoReportRequest;)Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;

    move-result-object v5

    .line 292
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    iget v0, v5, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;->returnCode:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 294
    const-string v0, "uploadNewPushToken success"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 295
    const/4 v0, 0x1

    return v0

    .line 298
    :cond_0
    const-string v0, "uploadNewPushToken failed"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 299
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public getPushToken()V
    .locals 1

    .line 151
    const-string v0, "getPushToken"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 154
    return-void
.end method

.method public getUploadedPushToken()Ljava/lang/String;
    .locals 1

    .line 389
    const-string v0, "nfc_uploaded_pushtoken"

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->getSharedPreference(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method receivePushMessage(Ljava/lang/String;)V
    .locals 3

    .line 178
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->pushServiceHandler:Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager$PushServiceHandler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->pushServiceHandler:Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager$PushServiceHandler;

    const/4 v2, 0x2

    invoke-virtual {v1, v2, p1}, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager$PushServiceHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager$PushServiceHandler;->sendMessage(Landroid/os/Message;)Z

    .line 179
    return-void
.end method

.method public receivePushToken(Ljava/lang/String;)V
    .locals 3

    .line 169
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->pushServiceHandler:Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager$PushServiceHandler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->pushServiceHandler:Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager$PushServiceHandler;

    const/4 v2, 0x1

    invoke-virtual {v1, v2, p1}, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager$PushServiceHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager$PushServiceHandler;->sendMessage(Landroid/os/Message;)Z

    .line 170
    return-void
.end method

.method public savePushToken(Ljava/lang/String;)V
    .locals 5

    .line 378
    const-string v0, "PluginPay NFCPushServiceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "save push token savePushToken = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 379
    const-string v0, "nfc_uploaded_pushtoken"

    new-instance v1, Lo/dcy;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lo/dcy;-><init>(I)V

    invoke-direct {p0, v0, p1, v1}, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->setSharedPreference(Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    move-result v4

    .line 380
    const-string v0, "PluginPay NFCPushServiceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "save push token result = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 381
    return-void
.end method
