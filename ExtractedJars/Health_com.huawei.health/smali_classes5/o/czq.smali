.class public Lo/czq;
.super Lo/czk;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/czq$a;
    }
.end annotation


# static fields
.field private static b:Z

.field private static f:J

.field private static i:Lo/czq$a;


# instance fields
.field private e:Ljava/lang/String;

.field private h:Landroid/content/Context;

.field private k:Lcom/huawei/login/ui/login/LoginInit;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 53
    const/4 v0, 0x0

    sput-boolean v0, Lo/czq;->b:Z

    .line 54
    const/4 v0, 0x0

    sput-object v0, Lo/czq;->i:Lo/czq$a;

    .line 70
    const-wide/16 v0, 0x0

    sput-wide v0, Lo/czq;->f:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 88
    invoke-direct {p0}, Lo/czk;-><init>()V

    .line 84
    const/4 v0, 0x0

    iput-object v0, p0, Lo/czq;->h:Landroid/content/Context;

    .line 86
    const/4 v0, 0x0

    iput-object v0, p0, Lo/czq;->k:Lcom/huawei/login/ui/login/LoginInit;

    .line 89
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/czq;->h:Landroid/content/Context;

    .line 90
    iget-object v0, p0, Lo/czq;->k:Lcom/huawei/login/ui/login/LoginInit;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 91
    iget-object v0, p0, Lo/czq;->h:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    iput-object v0, p0, Lo/czq;->k:Lcom/huawei/login/ui/login/LoginInit;

    .line 93
    :cond_0
    sget-object v0, Lo/czq;->i:Lo/czq$a;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 94
    new-instance v0, Lo/czq$a;

    invoke-direct {v0}, Lo/czq$a;-><init>()V

    sput-object v0, Lo/czq;->i:Lo/czq$a;

    .line 95
    invoke-direct {p0}, Lo/czq;->g()V

    .line 96
    invoke-direct {p0}, Lo/czq;->k()V

    .line 98
    :cond_1
    return-void
.end method

.method public static a()J
    .locals 2

    .line 63
    sget-wide v0, Lo/czq;->f:J

    return-wide v0
.end method

.method static synthetic a(Lo/czq;)Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lo/czq;->e:Ljava/lang/String;

    return-object v0
.end method

.method private b()V
    .locals 8

    .line 385
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter pushNotification"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 386
    iget-object v5, p0, Lo/czq;->e:Ljava/lang/String;

    .line 387
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 388
    iget-object v0, p0, Lo/czq;->h:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "cloud_st_invalid_flag"

    new-instance v2, Lo/dcy;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lo/dcy;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Lo/dcn;->a(Ljava/lang/String;Lo/dcy;)Ljava/lang/String;

    move-result-object v5

    .line 390
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    const-string v0, "0"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 391
    :cond_1
    return-void

    .line 394
    :cond_2
    const-wide/16 v0, 0xbb8

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 397
    goto :goto_0

    .line 395
    :catch_0
    move-exception v6

    .line 396
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Thread Sleep InterrupteException"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 398
    :goto_0
    iget-object v0, p0, Lo/czq;->h:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->hasLoginAccount(Landroid/content/Context;)Z

    move-result v6

    .line 399
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isLoginAccount is :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",isLogout is :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-boolean v3, Lo/czq;->b:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 400
    if-eqz v6, :cond_3

    sget-boolean v0, Lo/czq;->b:Z

    if-nez v0, :cond_3

    .line 401
    move-object v7, v5

    .line 402
    iget-object v0, p0, Lo/czq;->h:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    iget-object v1, p0, Lo/czq;->h:Landroid/content/Context;

    new-instance v2, Lo/czq$2;

    invoke-direct {v2, p0, v7}, Lo/czq$2;-><init>(Lo/czq;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lcom/huawei/login/ui/login/LoginInit;->notAuthLogin(Landroid/content/Context;Lcom/huawei/login/ui/login/util/ILoginCallback;)V

    .line 429
    goto :goto_1

    .line 430
    :cond_3
    iget-object v0, p0, Lo/czq;->h:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "cloud_st_invalid_flag"

    const-string v2, "0"

    new-instance v3, Lo/dcy;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Lo/dcy;-><init>(I)V

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcy;Lo/dcx;)V

    .line 432
    :goto_1
    return-void
.end method

.method private b(Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/up/utils/NSPException;
        }
    .end annotation

    .line 259
    const-string v0, "ts"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    const-string v0, "tokenType"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    iget-object v0, p0, Lo/czq;->k:Lcom/huawei/login/ui/login/LoginInit;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 265
    new-instance v0, Lcom/huawei/up/utils/NSPException;

    const-string v1, "mLogin is null."

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Lcom/huawei/up/utils/NSPException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 268
    :cond_0
    iget-object v0, p0, Lo/czq;->h:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "server_token"

    invoke-virtual {v0, v1}, Lo/dcn;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 269
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callService severToken from db = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 273
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callService severToken is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 274
    iget-object v0, p0, Lo/czq;->h:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->moveInfoFromSPTODB()V

    .line 275
    iget-object v0, p0, Lo/czq;->h:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->isTokenInValidFlag()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 277
    invoke-direct {p0}, Lo/czq;->c()V

    .line 279
    :cond_1
    new-instance v0, Lcom/huawei/up/utils/NSPException;

    const-string v1, "severToken is null."

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Lcom/huawei/up/utils/NSPException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 282
    :cond_2
    iput-object v4, p0, Lo/czq;->e:Ljava/lang/String;

    .line 283
    const-string v0, "token"

    invoke-interface {p1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    const-string v5, ""

    .line 286
    iget-object v0, p0, Lo/czq;->h:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->isLoginedByWear()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 287
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callService appid wear logined"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 288
    sget-object v0, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->e:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->c()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 290
    :cond_3
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callService appid health logined"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 291
    sget-object v0, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->d:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->c()Ljava/lang/String;

    move-result-object v5

    .line 293
    :goto_0
    const-string v0, "com.huawei.bone"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 294
    const-string v0, "source"

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 296
    :cond_4
    const-string v0, "source"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    :goto_1
    const-string v0, "appId"

    invoke-interface {p1, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    return-void
.end method

.method static synthetic b(Z)Z
    .locals 0

    .line 49
    sput-boolean p0, Lo/czq;->b:Z

    return p0
.end method

.method private c()V
    .locals 6

    .line 350
    invoke-static {}, Lo/dbf;->b()Z

    move-result v4

    .line 351
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ShowReloginActivity with isStoreVersion="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/dbf;->b()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 352
    if-nez v4, :cond_3

    .line 353
    iget-object v0, p0, Lo/czq;->h:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->q(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 354
    const-string v0, "com.huawei.health.STTimeoutActivity"

    iget-object v1, p0, Lo/czq;->h:Landroid/content/Context;

    invoke-static {v1}, Lo/dbf;->s(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "com.huawei.health.MainActivity"

    iget-object v1, p0, Lo/czq;->h:Landroid/content/Context;

    .line 355
    invoke-static {v1}, Lo/dbf;->s(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lo/czq;->h:Landroid/content/Context;

    .line 356
    invoke-static {v0}, Lo/dbf;->s(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.huawei.hwid"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "com.huawei.health.ad.HiAdSplashActivity"

    iget-object v1, p0, Lo/czq;->h:Landroid/content/Context;

    .line 357
    invoke-static {v1}, Lo/dbf;->s(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "com.huawei.hwid.api.common.apkimpl.OtaDownloadActivity"

    iget-object v1, p0, Lo/czq;->h:Landroid/content/Context;

    .line 358
    invoke-static {v1}, Lo/dbf;->s(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "com.huawei.hwid.api.common.apkimpl.DummyActivity"

    iget-object v1, p0, Lo/czq;->h:Landroid/content/Context;

    .line 359
    invoke-static {v1}, Lo/dbf;->s(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "com.huawei.health.splash.GuideActivity"

    iget-object v1, p0, Lo/czq;->h:Landroid/content/Context;

    .line 360
    invoke-static {v1}, Lo/dbf;->s(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity"

    iget-object v1, p0, Lo/czq;->h:Landroid/content/Context;

    .line 361
    invoke-static {v1}, Lo/dbf;->s(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 362
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showReLoginActivity currentTopActivity is = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/czq;->h:Landroid/content/Context;

    invoke-static {v3}, Lo/dbf;->s(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 363
    invoke-static {}, Lo/czq;->a()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0x1388

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 364
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showReLoginActivity."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 365
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/czq;->c(J)V

    .line 366
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 367
    const/high16 v0, 0x10000000

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 369
    iget-object v0, p0, Lo/czq;->h:Landroid/content/Context;

    const-string v1, "com.huawei.health.STTimeoutActivity"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 370
    iget-object v0, p0, Lo/czq;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 371
    goto :goto_0

    .line 372
    :cond_0
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter not time"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 375
    :cond_1
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter avtivity equal"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 378
    :cond_2
    invoke-direct {p0}, Lo/czq;->b()V

    .line 379
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter not forward"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 382
    :cond_3
    :goto_0
    return-void
.end method

.method public static c(J)V
    .locals 0

    .line 67
    sput-wide p0, Lo/czq;->f:J

    .line 68
    return-void
.end method

.method static synthetic c(Lo/czq;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lo/czq;->b()V

    return-void
.end method

.method static synthetic d(Lo/czq;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lo/czq;->c()V

    return-void
.end method

.method private d(Lo/czs;Lcom/google/gson/Gson;)V
    .locals 7

    .line 303
    invoke-virtual {p1}, Lo/czs;->a()[B

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 304
    invoke-virtual {p1}, Lo/czs;->a()[B

    move-result-object v0

    invoke-static {v0}, Lo/czu;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 305
    if-eqz v4, :cond_3

    .line 306
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x400

    if-ge v0, v1, :cond_0

    .line 307
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callService response content="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 309
    :cond_0
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callService response content="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    const/16 v3, 0x3ff

    invoke-virtual {v4, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 311
    :goto_0
    const/4 v5, 0x0

    .line 313
    :try_start_0
    const-class v0, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;

    invoke-virtual {p2, v4, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v5, v0

    .line 321
    goto :goto_2

    .line 314
    :catch_0
    move-exception v6

    .line 315
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x1e

    if-ge v0, v1, :cond_1

    .line 316
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fromJson exception response content="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 318
    :cond_1
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fromJson exception response content="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    const/16 v3, 0x1e

    invoke-virtual {v4, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 320
    :goto_1
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processResponseContent fromJson exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    :goto_2
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    invoke-virtual {v5}, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;->getResultCode()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x3ea

    if-eq v1, v0, :cond_2

    invoke-virtual {v5}, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;->getResultCode()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x3ec

    if-ne v1, v0, :cond_3

    .line 323
    :cond_2
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "auth failed, so need to logout!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 324
    iget-object v0, p0, Lo/czq;->k:Lcom/huawei/login/ui/login/LoginInit;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 325
    iget-object v0, p0, Lo/czq;->k:Lcom/huawei/login/ui/login/LoginInit;

    new-instance v1, Lo/czq$1;

    invoke-direct {v1, p0}, Lo/czq$1;-><init>(Lo/czq;)V

    invoke-virtual {v0, v1}, Lcom/huawei/login/ui/login/LoginInit;->logoutWhenStTimeout(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 347
    :cond_3
    return-void
.end method

.method static synthetic e(Lo/czq;)Landroid/content/Context;
    .locals 1

    .line 49
    iget-object v0, p0, Lo/czq;->h:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e()Z
    .locals 1

    .line 49
    sget-boolean v0, Lo/czq;->b:Z

    return v0
.end method

.method private g()V
    .locals 5

    .line 443
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "register accout logout broadcast "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 444
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.hwid.ACTION_REMOVE_ACCOUNT"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 445
    iget-object v0, p0, Lo/czq;->h:Landroid/content/Context;

    sget-object v1, Lo/czq;->i:Lo/czq$a;

    invoke-virtual {v0, v1, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 446
    return-void
.end method

.method private k()V
    .locals 5

    .line 449
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "register accout logout broadcast "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 450
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.plugin.account.login"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 451
    iget-object v0, p0, Lo/czq;->h:Landroid/content/Context;

    sget-object v1, Lo/czq;->i:Lo/czq$a;

    invoke-virtual {v0, v1, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 452
    return-void
.end method


# virtual methods
.method protected b(Ljava/lang/String;Ljava/util/Map;III)Lo/czs;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;III)Lo/czs;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/up/utils/NSPException;
        }
    .end annotation

    .line 256
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    const/4 v6, 0x1

    invoke-virtual/range {v0 .. v6}, Lo/czq;->d(Ljava/lang/String;Ljava/util/Map;IIII)Lo/czs;

    move-result-object v0

    return-object v0
.end method

.method protected d(Ljava/lang/String;Ljava/util/Map;IIII)Lo/czs;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;IIII)Lo/czs;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/up/utils/NSPException;
        }
    .end annotation

    .line 150
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter callService urlType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p6

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 153
    invoke-static/range {p1 .. p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 154
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Service isEmpty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    new-instance v0, Lcom/huawei/up/utils/NSPException;

    const-string v1, "Service name is empty."

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Lcom/huawei/up/utils/NSPException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 164
    :cond_0
    move-object/from16 v0, p0

    invoke-direct {v0, v7}, Lo/czq;->b(Ljava/util/Map;)V

    .line 165
    invoke-static {}, Lo/czu;->e()Z

    move-result v8

    .line 166
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "callService isOverSea ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    if-eqz v8, :cond_1

    .line 168
    const-string v0, "siteId"

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getSiteId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "callService getSiteId="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/login/ui/login/LoginInit;->getSiteId()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/czq;->h:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->g(Landroid/content/Context;)I

    move-result v9

    .line 175
    const-string v0, "deviceType"

    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/czq;->h:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getDeviceType()Ljava/lang/String;

    move-result-object v10

    .line 178
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "callService upDeviceType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    const-string v0, "upDeviceType"

    invoke-interface {v7, v0, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/czq;->h:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getDeviceId()Ljava/lang/String;

    move-result-object v11

    .line 183
    const-string v0, ""

    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 184
    const-string v11, "clientnull"

    .line 186
    :cond_2
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "callService deviceId="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    const-string v0, "deviceId"

    invoke-interface {v7, v0, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    const-string v0, "sysVersion"

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    const-string v0, "/dataQuery/path/getMotionPathByVersion"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "/dataQuery/path/getMotionPathData"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 195
    :cond_3
    const-string v0, "iVersion"

    invoke-static {}, Lo/czu;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 197
    :cond_4
    const-string v0, "iVersion"

    invoke-static {}, Lo/czu;->c()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    :goto_0
    const-string v0, "isManually"

    invoke-static {}, Lo/czu;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    const-string v0, "language"

    const-string v1, "zh"

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    const-string v0, "oaId"

    const-string v1, ""

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/czq;->h:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "cloud_user_privacy10"

    invoke-virtual {v0, v1}, Lo/dcn;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 209
    const/4 v0, 0x0

    if-eq v0, v12, :cond_5

    const-string v0, "true"

    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 210
    const-string v0, "isTrackingEnabled"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 212
    :cond_5
    const-string v0, "isTrackingEnabled"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    :goto_1
    invoke-interface/range {p2 .. p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Ljava/util/Map$Entry;

    .line 216
    invoke-interface {v14}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Ljava/lang/String;

    .line 217
    invoke-interface {v14}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v16

    .line 218
    move-object/from16 v0, v16

    invoke-interface {v7, v15, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    goto :goto_2

    .line 220
    :cond_6
    new-instance v13, Lcom/google/gson/Gson;

    invoke-direct {v13}, Lcom/google/gson/Gson;-><init>()V

    .line 221
    invoke-virtual {v13, v7}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    .line 222
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x400

    if-ge v0, v1, :cond_7

    .line 223
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callService data = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v14, v1, v2

    const-string v2, " apiURL="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/czq;->a:Ljava/lang/String;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "1111"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 225
    :cond_7
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callService data = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    const/16 v3, 0x3ff

    invoke-virtual {v14, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " apiURL="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/czq;->a:Ljava/lang/String;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "2222"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    :goto_3
    new-instance v15, Ljava/lang/StringBuffer;

    invoke-direct {v15}, Ljava/lang/StringBuffer;-><init>()V

    .line 228
    move/from16 v0, p6

    const/4 v1, 0x2

    if-ne v0, v1, :cond_8

    .line 230
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/czq;->h:Landroid/content/Context;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "healthDeviceUrl"

    invoke-virtual {v0, v1}, Lo/cze;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/czq;->d:Ljava/lang/String;

    goto :goto_4

    .line 231
    :cond_8
    const-string v0, "/dataRecommend/common/updateCommentRemainderTimes"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    const-string v0, "/dataRecommend/common/getCommentRemainderTimes"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 232
    :cond_9
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/czq;->h:Landroid/content/Context;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "healthRecommendUrl"

    invoke-virtual {v0, v1}, Lo/cze;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/czq;->d:Ljava/lang/String;

    goto :goto_4

    .line 234
    :cond_a
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/czq;->h:Landroid/content/Context;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "healthCloudUrl"

    invoke-virtual {v0, v1}, Lo/cze;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/czq;->d:Ljava/lang/String;

    .line 237
    :goto_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/czq;->d:Ljava/lang/String;

    invoke-virtual {v15, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 238
    move-object/from16 v0, p1

    invoke-virtual {v15, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 239
    invoke-virtual {v15}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v16

    .line 240
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "callService apiURL="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v16

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 241
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/czq;->h:Landroid/content/Context;

    move-object/from16 v2, v16

    move-object v3, v14

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    invoke-virtual/range {v0 .. v6}, Lo/czq;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;III)Lo/czs;

    move-result-object v17

    .line 242
    if-nez v17, :cond_b

    .line 243
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callService response=null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    new-instance v0, Lcom/huawei/up/utils/NSPException;

    const-string v1, "Server No Response"

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Lcom/huawei/up/utils/NSPException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 247
    :cond_b
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "callService response=[status:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v17 .. v17}, Lo/czs;->b()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", code:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v17 .. v17}, Lo/czs;->c()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "]"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-direct {v0, v1, v13}, Lo/czq;->d(Lo/czs;Lcom/google/gson/Gson;)V

    .line 251
    return-object v17
.end method

.method public d()V
    .locals 3

    .line 436
    new-instance v2, Landroid/content/Intent;

    const-string v0, "com.huawei.health.SERVER_TOKEN_INVALIDE"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 437
    iget-object v0, p0, Lo/czq;->h:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 438
    iget-object v0, p0, Lo/czq;->h:Landroid/content/Context;

    const-string v1, "com.huawei.health.INTERNAL_PERMISSION"

    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 440
    :cond_0
    return-void
.end method
