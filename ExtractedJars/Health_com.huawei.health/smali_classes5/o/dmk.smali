.class public Lo/dmk;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final e:Ljava/lang/Object;

.field private static final i:Lo/dmk;


# instance fields
.field private a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Lo/dmj;>;"
        }
    .end annotation
.end field

.field private b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Lo/dmi;>;>;"
        }
    .end annotation
.end field

.field private c:Landroid/content/Context;

.field private d:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

.field private g:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 55
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dmk;->e:Ljava/lang/Object;

    .line 68
    new-instance v0, Lo/dmk;

    invoke-direct {v0}, Lo/dmk;-><init>()V

    sput-object v0, Lo/dmk;->i:Lo/dmk;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/dmk;->b:Ljava/util/Map;

    .line 51
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/dmk;->a:Ljava/util/Map;

    .line 57
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/dmk;->g:Ljava/util/concurrent/ExecutorService;

    .line 71
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/dmk;->c:Landroid/content/Context;

    .line 72
    return-void
.end method

.method private a(I)Ljava/lang/String;
    .locals 5

    .line 133
    const-string v4, ""

    .line 134
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 136
    :pswitch_0
    const-string v4, "activityUrl"

    .line 137
    goto :goto_1

    .line 142
    :pswitch_1
    const-string v4, "healthRecommendUrl"

    .line 143
    goto :goto_1

    .line 145
    :goto_0
    const-string v0, "SMART_SmartHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUrl invalid contentType"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    :goto_1
    return-object v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private a()V
    .locals 1

    .line 396
    iget-object v0, p0, Lo/dmk;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 397
    return-void
.end method

.method private a(Ljava/util/HashMap;Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 312
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 313
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 314
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 315
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/Map$Entry;

    .line 316
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    .line 317
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    .line 318
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    const-string v0, "SMART_SmartHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addPrivateParam->:[key="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", val="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/16 v3, 0x5d

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 320
    goto :goto_0

    .line 322
    :cond_0
    return-void
.end method

.method private b(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;I)Ljava/util/HashMap;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;I)Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 252
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 254
    sget-object v0, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->d:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->d()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 255
    const-string v0, "appType"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 256
    :cond_0
    sget-object v0, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->e:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->d()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 257
    const-string v0, "appType"

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    :cond_1
    :goto_0
    const-string v0, "ts"

    invoke-static {}, Lo/dmk;->d()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    const/4 v0, 0x4

    if-eq p2, v0, :cond_4

    .line 262
    const-string v0, "tokenType"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getSeverToken()Ljava/lang/String;

    move-result-object v5

    .line 264
    const-string v0, "token"

    invoke-virtual {v4, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    const-string v6, ""

    .line 267
    iget-object v0, p0, Lo/dmk;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->isLoginedByWear()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 268
    const-string v0, "SMART_SmartHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callService appid wear logined"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 269
    sget-object v0, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->e:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->c()Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    .line 271
    :cond_2
    const-string v0, "SMART_SmartHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callService appid health logined"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    sget-object v0, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->d:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->c()Ljava/lang/String;

    move-result-object v6

    .line 274
    :goto_1
    const-string v0, "appId"

    invoke-virtual {v4, v0, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    iget-object v0, p0, Lo/dmk;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->g(Landroid/content/Context;)I

    move-result v7

    .line 277
    const-string v0, "deviceType"

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getDeviceId()Ljava/lang/String;

    move-result-object v8

    .line 280
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 281
    const-string v8, "clientnull"

    .line 283
    :cond_3
    const-string v0, "deviceId"

    invoke-virtual {v4, v0, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    const-string v0, "sysVersion"

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    const-string v0, "bindDeviceType"

    invoke-virtual {p1}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getBindDeviceType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    const-string v0, "iVersion"

    invoke-static {}, Lo/czu;->c()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v9

    .line 288
    iget-object v0, v9, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v10

    .line 289
    const-string v0, "language"

    invoke-virtual {v4, v0, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    const-string v0, "environment"

    iget-object v1, p0, Lo/dmk;->c:Landroid/content/Context;

    invoke-static {v1}, Lo/dbf;->o(Landroid/content/Context;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    const-string v0, "upDeviceType"

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getDeviceType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    :cond_4
    const-string v0, "SMART_SmartHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getPublicParams->mapParams:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/util/HashMap;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    return-object v4
.end method

.method public static b()Lo/dmk;
    .locals 1

    .line 75
    sget-object v0, Lo/dmk;->i:Lo/dmk;

    return-object v0
.end method

.method private c()V
    .locals 5

    .line 400
    sget-object v1, Lo/dmk;->e:Ljava/lang/Object;

    monitor-enter v1

    .line 401
    :try_start_0
    iget-object v0, p0, Lo/dmk;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/Map$Entry;

    .line 402
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 403
    goto :goto_0

    .line 404
    :cond_0
    iget-object v0, p0, Lo/dmk;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 405
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v1

    throw v4

    .line 406
    :goto_1
    return-void
.end method

.method static synthetic c(Lo/dmk;ILjava/lang/String;ILo/dmd;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2, p3, p4}, Lo/dmk;->e(ILjava/lang/String;ILo/dmd;)V

    return-void
.end method

.method private static d()J
    .locals 2

    .line 301
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic d(Lo/dmk;)Landroid/content/Context;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/dmk;->c:Landroid/content/Context;

    return-object v0
.end method

.method private d(I)Ljava/util/HashMap;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 234
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 235
    iget-object v0, p0, Lo/dmk;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->k(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    .line 236
    const-string v0, "x-version"

    invoke-virtual {v4, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    .line 238
    iget-object v0, p0, Lo/dmk;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "user_id"

    invoke-virtual {v0, v1}, Lo/dcn;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 239
    const-string v0, "x-huid"

    invoke-virtual {v4, v0, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    :cond_0
    const-string v0, "SMART_SmartHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHeaders mapHeaders:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/util/HashMap;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 242
    return-object v4
.end method

.method static synthetic d(Lo/dmk;Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/util/Map;I)Ljava/util/HashMap;
    .locals 1

    .line 41
    invoke-direct {p0, p1, p2, p3}, Lo/dmk;->e(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/util/Map;I)Ljava/util/HashMap;

    move-result-object v0

    return-object v0
.end method

.method private d(ILcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;)V
    .locals 9

    .line 202
    sget-object v4, Lo/dmk;->e:Ljava/lang/Object;

    monitor-enter v4

    .line 203
    :try_start_0
    iget-object v0, p0, Lo/dmk;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    .line 205
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 206
    :cond_0
    const-string v0, "SMART_SmartHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "subscriber "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " is already unregitered or never register!"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 207
    monitor-exit v4

    return-void

    .line 210
    :cond_1
    const-string v0, "SMART_SmartHttpUtil"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notifyCorrespondSubscriber size is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 211
    iget-object v0, p0, Lo/dmk;->g:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 212
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/dmk;->g:Ljava/util/concurrent/ExecutorService;

    .line 214
    :cond_2
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/dmi;

    .line 215
    iget-object v0, p0, Lo/dmk;->g:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dmk$4;

    invoke-direct {v1, p0, v7, p2}, Lo/dmk$4;-><init>(Lo/dmk;Lo/dmi;Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 222
    goto :goto_0

    .line 223
    :cond_3
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v8

    monitor-exit v4

    throw v8

    .line 225
    :goto_1
    return-void
.end method

.method private e(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/util/Map;I)Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;I)Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 327
    invoke-direct {p0, p1, p3}, Lo/dmk;->b(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;I)Ljava/util/HashMap;

    move-result-object v0

    .line 328
    invoke-direct {p0, v0, p2}, Lo/dmk;->a(Ljava/util/HashMap;Ljava/util/Map;)V

    .line 329
    return-object v0
.end method

.method static synthetic e(Lo/dmk;I)Ljava/util/HashMap;
    .locals 1

    .line 41
    invoke-direct {p0, p1}, Lo/dmk;->d(I)Ljava/util/HashMap;

    move-result-object v0

    return-object v0
.end method

.method private e(ILjava/lang/String;ILo/dmd;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:Ljava/lang/Object;>(ILjava/lang/String;ILo/dmd<TV;>;)V"
        }
    .end annotation

    .line 179
    const/16 v0, 0xc8

    if-ne v0, p1, :cond_2

    .line 181
    iget-object v0, p0, Lo/dmk;->a:Ljava/util/Map;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/dmj;

    .line 182
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 183
    const-string v0, "SMART_SmartHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parser in null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    return-void

    .line 186
    :cond_0
    iget-object v0, p0, Lo/dmk;->a:Ljava/util/Map;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dmj;

    invoke-virtual {v0, p2}, Lo/dmj;->b(Ljava/lang/String;)Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;

    move-result-object v5

    .line 187
    const-string v0, "SMART_SmartHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "============ "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;->getResponse()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    const/4 v0, 0x0

    if-eq v0, p4, :cond_1

    .line 189
    invoke-virtual {v5}, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;->getResponse()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p4, v1, v0}, Lo/dmd;->b(ILjava/lang/Object;)V

    .line 191
    :cond_1
    invoke-direct {p0, p3, v5}, Lo/dmk;->d(ILcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;)V

    .line 192
    return-void

    .line 195
    :cond_2
    const-string v0, "SMART_SmartHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "smartCenter connection failed, errCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    const/4 v0, 0x0

    if-eq v0, p4, :cond_3

    .line 197
    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {p4, v0, v1}, Lo/dmd;->b(ILjava/lang/Object;)V

    .line 199
    :cond_3
    return-void
.end method


# virtual methods
.method public b(ILo/dmi;)V
    .locals 5

    .line 358
    sget-object v2, Lo/dmk;->e:Ljava/lang/Object;

    monitor-enter v2

    .line 359
    :try_start_0
    iget-object v0, p0, Lo/dmk;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 360
    iget-object v0, p0, Lo/dmk;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    .line 361
    invoke-interface {v3, p2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 363
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    .line 364
    :goto_0
    return-void
.end method

.method public c(I)Ljava/lang/String;
    .locals 5

    .line 152
    const-string v4, ""

    .line 153
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 155
    :pswitch_0
    const-string v4, "/activity/getActivities"

    .line 156
    goto :goto_1

    .line 158
    :pswitch_1
    const-string v4, "/dataRecommend/label/getUserLabel"

    .line 159
    goto :goto_1

    .line 161
    :pswitch_2
    const-string v4, "/dataRecommend/goal/achieveGoal"

    .line 162
    goto :goto_1

    .line 164
    :pswitch_3
    const-string v4, "/dataRecommend/goal/getCompletionNum"

    .line 165
    goto :goto_1

    .line 167
    :pswitch_4
    const-string v4, "/mall/commodity/getCommodityInfo"

    .line 168
    goto :goto_1

    .line 170
    :goto_0
    const-string v0, "SMART_SmartHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUrl invalid contentType"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    :goto_1
    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public c(ILjava/util/Map;Lo/dmd;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Lo/dmd;)V"
        }
    .end annotation

    .line 79
    iget-object v0, p0, Lo/dmk;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    invoke-virtual {v0}, Lo/dwr;->a()Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    move-result-object v0

    iput-object v0, p0, Lo/dmk;->d:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    .line 80
    iget-object v0, p0, Lo/dmk;->d:Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    invoke-virtual {p0, p1, v0, p2, p3}, Lo/dmk;->e(ILcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/util/Map;Lo/dmd;)V

    .line 81
    return-void
.end method

.method public c(ILo/dmj;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:Ljava/lang/Object;>(ILo/dmj<TI;>;)V"
        }
    .end annotation

    .line 373
    iget-object v0, p0, Lo/dmk;->a:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 374
    iget-object v0, p0, Lo/dmk;->a:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 377
    :cond_0
    return-void
.end method

.method public e(ILcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/util/Map;Lo/dmd;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:Ljava/lang/Object;>(ILcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Lo/dmd<TR;>;)V"
        }
    .end annotation

    .line 92
    const-string v0, "SMART_SmartHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter pullData():contentType =  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    if-nez p2, :cond_0

    .line 94
    return-void

    .line 96
    :cond_0
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 97
    const-string v0, "SMART_SmartHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "request, isNoCloudVersion, return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    if-eqz p4, :cond_1

    .line 99
    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {p4, v0, v1}, Lo/dmd;->b(ILjava/lang/Object;)V

    .line 101
    :cond_1
    return-void

    .line 104
    :cond_2
    iget-object v0, p0, Lo/dmk;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    invoke-direct {p0, p1}, Lo/dmk;->a(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/dmk$2;

    move-object v3, p0

    move v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-direct/range {v2 .. v7}, Lo/dmk$2;-><init>(Lo/dmk;ILcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/util/Map;Lo/dmd;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 130
    return-void
.end method

.method public e(ILo/dmi;)V
    .locals 5

    .line 338
    sget-object v2, Lo/dmk;->e:Ljava/lang/Object;

    monitor-enter v2

    .line 340
    :try_start_0
    iget-object v0, p0, Lo/dmk;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 341
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 342
    invoke-interface {v3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 343
    iget-object v0, p0, Lo/dmk;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 345
    :cond_0
    iget-object v0, p0, Lo/dmk;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    .line 346
    invoke-interface {v3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 349
    :goto_0
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    .line 350
    :goto_1
    return-void
.end method

.method protected finalize()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 386
    iget-object v0, p0, Lo/dmk;->g:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    .line 387
    iget-object v0, p0, Lo/dmk;->g:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 390
    :cond_0
    invoke-direct {p0}, Lo/dmk;->c()V

    .line 391
    invoke-direct {p0}, Lo/dmk;->a()V

    .line 392
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 393
    return-void
.end method
