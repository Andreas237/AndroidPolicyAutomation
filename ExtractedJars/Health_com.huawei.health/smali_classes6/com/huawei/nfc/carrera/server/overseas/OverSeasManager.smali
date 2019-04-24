.class public Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager$InnerInitGrsResultCallBack;
    }
.end annotation


# static fields
.field public static final COUNTRY_CHINA:Ljava/lang/String; = "CN"

.field private static final GRS_APPNAME_DEFAULT:Ljava/lang/String; = "hiwallet"

.field private static final GRS_SERVICENAME_CFG_WALLETSERVICES_DEFAULT:Ljava/lang/String; = "hiwalletServices"

.field private static final LOCK:Ljava/lang/Object;

.field public static final SERVICENAME_CFG_AGREEMENTSERVICE:Ljava/lang/String; = "com.huawei.cloud.agreementservice"

.field public static final SERVICE_NAME_GREEMENT:Ljava/lang/String; = "GREMENT"

.field private static final SYNCLOCK:Ljava/lang/Object;

.field private static volatile instance:Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager; = null


# instance fields
.field private addressMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private context:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 31
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->LOCK:Ljava/lang/Object;

    .line 36
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->SYNCLOCK:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->addressMap:Ljava/util/Map;

    .line 66
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->context:Landroid/content/Context;

    .line 67
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;Ljava/lang/String;)Z
    .locals 1

    .line 26
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->isNeedInit(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method static synthetic access$100()Ljava/lang/Object;
    .locals 1

    .line 26
    sget-object v0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->SYNCLOCK:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;)Ljava/lang/String;
    .locals 1

    .line 26
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->getGrsAppName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;)Landroid/content/Context;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->context:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$400(Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;)Ljava/lang/String;
    .locals 1

    .line 26
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->getServiceNameCfgWalletServices()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$502(Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->addressMap:Ljava/util/Map;

    return-object p1
.end method

.method private getGrsAppName()Ljava/lang/String;
    .locals 3

    .line 263
    const-string v2, "hiwallet"

    .line 264
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 265
    const-string v2, "hiwallet"

    .line 267
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getGrsAppName app name = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 268
    return-object v2
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;
    .locals 4

    .line 71
    sget-object v0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->instance:Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 73
    sget-object v2, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->LOCK:Ljava/lang/Object;

    monitor-enter v2

    .line 75
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->instance:Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 77
    new-instance v0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->instance:Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 81
    :cond_1
    :goto_0
    sget-object v0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->instance:Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;

    return-object v0
.end method

.method private getServiceNameCfgWalletServices()Ljava/lang/String;
    .locals 3

    .line 272
    const-string v2, "hiwalletServices"

    .line 273
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 274
    const-string v2, "hiwalletServices"

    .line 276
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getServiceNameCfgWalletServices serviceName = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 277
    return-object v2
.end method

.method private isNeedInit(Ljava/lang/String;)Z
    .locals 7

    .line 209
    const/4 v3, 0x1

    .line 210
    move-object v4, p1

    .line 212
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 214
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/nfc/PluginPayAdapter;

    .line 215
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 216
    invoke-interface {v5}, Lcom/huawei/nfc/PluginPayAdapter;->getServiceCountryCode()Ljava/lang/String;

    move-result-object v4

    .line 219
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/wallet/storage/sp/AccountPreferences;->b(Landroid/content/Context;)Lcom/huawei/wallet/storage/sp/AccountPreferences;

    move-result-object v0

    const-string v1, "account_service_country_code"

    const-string v2, "CN"

    invoke-virtual {v0, v1, v2}, Lcom/huawei/wallet/storage/sp/AccountPreferences;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 220
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/server/overseas/storage/OverSeasPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/server/overseas/storage/OverSeasPreferences;

    move-result-object v0

    const-string v1, "HASURLS"

    const-string v2, "false"

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/server/overseas/storage/OverSeasPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 221
    invoke-virtual {v5, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->addressMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "true"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 223
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->addressMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "true"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 225
    const-string v0, "OverSeasManager isNeedInit set the mem as sp."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Z)V

    .line 226
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/server/overseas/storage/OverSeasPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/server/overseas/storage/OverSeasPreferences;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/server/overseas/storage/OverSeasPreferences;->getAll()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->addressMap:Ljava/util/Map;

    .line 228
    :cond_2
    const/4 v3, 0x0

    .line 231
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OverSeasManager isNeedInit :"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Z)V

    .line 232
    return v3
.end method


# virtual methods
.method public getGrsUrlSync(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 103
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 104
    const-string v0, "OverSeasManager getGrsUrlSync method BEGIN"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Z)V

    .line 105
    const-string v5, ""

    .line 107
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->isNeedInit(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 109
    new-instance v6, Ljava/util/concurrent/CountDownLatch;

    const/4 v0, 0x1

    invoke-direct {v6, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 110
    new-instance v0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager$InnerInitGrsResultCallBack;

    invoke-direct {v0, v6}, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager$InnerInitGrsResultCallBack;-><init>(Ljava/util/concurrent/CountDownLatch;)V

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->initGrs(Lcom/huawei/nfc/carrera/server/overseas/InitGrsResultCallBack;)V

    .line 113
    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->isNeedInit(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 115
    invoke-virtual {v6}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    :cond_0
    goto :goto_0

    .line 118
    :catch_0
    move-exception v7

    .line 120
    const-string v0, "OverSeasManager getGrsUrlSync isNeedInit lock exception"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Z)V

    .line 124
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->addressMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 125
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OverSeasManager getGrsUrlSync method END,,cost :"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Z)V

    .line 126
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OverSeasManager getGrsUrlSync method END,url is :"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Z)V

    .line 127
    return-object v5
.end method

.method public getUrlMapFromGrs(Ljava/lang/String;Lcom/huawei/nfc/carrera/server/overseas/InitGrsResultCallBack;)V
    .locals 2

    .line 132
    new-instance v1, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager$1;-><init>(Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;Ljava/lang/String;Lcom/huawei/nfc/carrera/server/overseas/InitGrsResultCallBack;)V

    .line 204
    invoke-static {}, Lcom/huawei/wallet/commonbase/thread/ThreadPoolManager;->c()Lcom/huawei/wallet/commonbase/thread/ThreadPoolManager;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/commonbase/thread/ThreadPoolManager;->e(Ljava/lang/Runnable;)V

    .line 205
    return-void
.end method

.method public initGrs(Lcom/huawei/nfc/carrera/server/overseas/InitGrsResultCallBack;)V
    .locals 4

    .line 238
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->isNeedInit(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 240
    const-string v0, "OverSeasManager.initGrs no need init."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Z)V

    .line 241
    const-string v0, "00"

    invoke-interface {p1, v0}, Lcom/huawei/nfc/carrera/server/overseas/InitGrsResultCallBack;->finish(Ljava/lang/String;)V

    .line 242
    return-void

    .line 245
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/nfc/PluginPayAdapter;

    .line 246
    const-string v3, "CN"

    .line 247
    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    .line 248
    invoke-interface {v2}, Lcom/huawei/nfc/PluginPayAdapter;->getServiceCountryCode()Ljava/lang/String;

    move-result-object v3

    .line 251
    :cond_1
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 253
    invoke-virtual {p0, v3, p1}, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->getUrlMapFromGrs(Ljava/lang/String;Lcom/huawei/nfc/carrera/server/overseas/InitGrsResultCallBack;)V

    goto :goto_0

    .line 257
    :cond_2
    const-string v0, "OverSeasManager.initGrs(callBack) countryCode is empty:"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 258
    const-string v0, "02"

    invoke-interface {p1, v0}, Lcom/huawei/nfc/carrera/server/overseas/InitGrsResultCallBack;->finish(Ljava/lang/String;)V

    .line 260
    :goto_0
    return-void
.end method
