.class public Lo/akh;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/akh$c;,
        Lo/akh$h;,
        Lo/akh$a;,
        Lo/akh$b;,
        Lo/akh$d;,
        Lo/akh$e;,
        Lo/akh$i;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/Object;


# instance fields
.field private b:Lo/akh$e;

.field public c:Lo/ajd;

.field private d:Lo/ajm;

.field private e:Landroid/content/Context;

.field private f:Ljava/lang/String;

.field private g:Lo/akh$i;

.field private h:I

.field private i:I

.field private k:Lo/akh$d;

.field private o:Lo/aka;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 49
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/akh;->a:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 6

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    const/4 v0, 0x0

    iput v0, p0, Lo/akh;->h:I

    .line 88
    sget-object v0, Lo/akh$i;->d:Lo/akh$i;

    iput-object v0, p0, Lo/akh;->g:Lo/akh$i;

    .line 607
    new-instance v0, Lo/akh$1;

    move-object v1, p0

    const-wide/32 v2, 0x15f90

    const-wide/16 v4, 0x7d0

    invoke-direct/range {v0 .. v5}, Lo/akh$1;-><init>(Lo/akh;JJ)V

    iput-object v0, p0, Lo/akh;->o:Lo/aka;

    .line 100
    iput-object p1, p0, Lo/akh;->e:Landroid/content/Context;

    .line 101
    new-instance v0, Lo/akh$d;

    invoke-direct {v0, p0}, Lo/akh$d;-><init>(Lo/akh;)V

    iput-object v0, p0, Lo/akh;->k:Lo/akh$d;

    .line 102
    new-instance v0, Lo/akh$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/akh$b;-><init>(Lo/akh;Lo/akh$3;)V

    iput-object v0, p0, Lo/akh;->b:Lo/akh$e;

    .line 103
    return-void
.end method

.method static synthetic a(Lo/akh;)Lo/akh$d;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/akh;->k:Lo/akh$d;

    return-object v0
.end method

.method static synthetic a(Lo/akh;Ljava/lang/Object;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lo/akh;->e(Ljava/lang/Object;)V

    return-void
.end method

.method public static b(Lo/ajd;Landroid/content/Context;)Ljava/lang/String;
    .locals 7

    .line 544
    const-string v4, ""

    .line 545
    invoke-virtual {p0}, Lo/ajd;->h()Ljava/lang/String;

    move-result-object v0

    const-string v1, "coap"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 546
    invoke-virtual {p0}, Lo/ajd;->h()Ljava/lang/String;

    move-result-object v0

    const-string v1, "wifiap"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 548
    :cond_0
    invoke-virtual {p0}, Lo/ajd;->i()Ljava/lang/String;

    move-result-object v5

    .line 549
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 550
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDeviceIp: uri is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 551
    const-string v0, "coap://"

    invoke-virtual {v5, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "coaps://"

    invoke-virtual {v5, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 552
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "coap://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 554
    :cond_1
    :try_start_0
    new-instance v0, Ljava/net/URI;

    invoke-direct {v0, v5}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v0

    move-object v4, v0

    .line 555
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDeviceIp: ip is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 558
    goto :goto_0

    .line 556
    :catch_0
    move-exception v6

    .line 557
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDeviceIp: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/net/URISyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 561
    :cond_2
    :goto_0
    return-object v4
.end method

.method static synthetic b(Lo/akh;)Lo/aka;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/akh;->o:Lo/aka;

    return-object v0
.end method

.method static synthetic c(Lo/akh;)I
    .locals 2

    .line 45
    iget v0, p0, Lo/akh;->h:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lo/akh;->h:I

    return v0
.end method

.method static synthetic c(Lo/akh;I)I
    .locals 0

    .line 45
    iput p1, p0, Lo/akh;->h:I

    return p1
.end method

.method static synthetic c()Ljava/lang/Object;
    .locals 1

    .line 45
    sget-object v0, Lo/akh;->a:Ljava/lang/Object;

    return-object v0
.end method

.method private c(I)V
    .locals 4

    .line 268
    sget-object v2, Lo/akh;->a:Ljava/lang/Object;

    monitor-enter v2

    .line 269
    :try_start_0
    iget-object v0, p0, Lo/akh;->d:Lo/ajm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 270
    iget-object v0, p0, Lo/akh;->d:Lo/ajm;

    invoke-interface {v0, p1}, Lo/ajm;->onFailure(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 272
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 273
    :goto_0
    return-void
.end method

.method static synthetic d(Lo/akh;)I
    .locals 1

    .line 45
    iget v0, p0, Lo/akh;->h:I

    return v0
.end method

.method static synthetic e(Lo/akh;)Lo/akh$e;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/akh;->b:Lo/akh$e;

    return-object v0
.end method

.method public static e(Landroid/content/Context;)Lo/akh;
    .locals 1

    .line 96
    new-instance v0, Lo/akh;

    invoke-direct {v0, p0}, Lo/akh;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method private e(Ljava/lang/Object;)V
    .locals 4

    .line 260
    sget-object v2, Lo/akh;->a:Ljava/lang/Object;

    monitor-enter v2

    .line 261
    :try_start_0
    iget-object v0, p0, Lo/akh;->d:Lo/ajm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 262
    iget-object v0, p0, Lo/akh;->d:Lo/ajm;

    invoke-interface {v0, p1}, Lo/ajm;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 264
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 265
    :goto_0
    return-void
.end method

.method static synthetic e(Lo/akh;I)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lo/akh;->c(I)V

    return-void
.end method

.method static synthetic f(Lo/akh;)Lo/akh$i;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/akh;->g:Lo/akh$i;

    return-object v0
.end method

.method static synthetic i(Lo/akh;)Lo/ajm;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/akh;->d:Lo/ajm;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 171
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 172
    invoke-virtual {p0}, Lo/akh;->d()V

    .line 173
    iget-object v0, p0, Lo/akh;->k:Lo/akh$d;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 174
    iget-object v0, p0, Lo/akh;->k:Lo/akh$d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/akh$d;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 175
    const/4 v0, 0x0

    iput-object v0, p0, Lo/akh;->k:Lo/akh$d;

    .line 177
    :cond_0
    iget-object v0, p0, Lo/akh;->b:Lo/akh$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 178
    const/4 v0, 0x0

    iput-object v0, p0, Lo/akh;->b:Lo/akh$e;

    .line 180
    :cond_1
    iget-object v0, p0, Lo/akh;->o:Lo/aka;

    if-eqz v0, :cond_2

    .line 181
    iget-object v0, p0, Lo/akh;->o:Lo/aka;

    invoke-virtual {v0}, Lo/aka;->d()V

    .line 182
    const/4 v0, 0x0

    iput-object v0, p0, Lo/akh;->o:Lo/aka;

    .line 184
    :cond_2
    return-void
.end method

.method public b()V
    .locals 5

    .line 565
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " getOuthedDeviceFromCloud() DevId errCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/akh;->c:Lo/ajd;

    invoke-virtual {v3}, Lo/ajd;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 566
    iget-object v0, p0, Lo/akh;->c:Lo/ajd;

    invoke-virtual {v0}, Lo/ajd;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 568
    new-instance v4, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoReq;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoReq;-><init>()V

    .line 569
    iget-object v0, p0, Lo/akh;->c:Lo/ajd;

    invoke-virtual {v0}, Lo/ajd;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoReq;->setDevId(Ljava/lang/String;)V

    .line 570
    iget-object v0, p0, Lo/akh;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    new-instance v1, Lo/akh$3;

    invoke-direct {v1, p0}, Lo/akh$3;-><init>(Lo/akh;)V

    invoke-virtual {v0, v4, v1}, Lo/czg;->b(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoReq;Lo/cyx;)V

    .line 601
    goto :goto_0

    .line 602
    :cond_0
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getOuthedDeviceFromCloud mAddDeviceInfo  DevId is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 604
    :goto_0
    return-void
.end method

.method public b(Lo/ajd;Lo/akh$i;Lo/ajm;)V
    .locals 3

    .line 287
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 288
    return-void

    .line 290
    :cond_0
    iput-object p2, p0, Lo/akh;->g:Lo/akh$i;

    .line 291
    sget-object v1, Lo/akh;->a:Ljava/lang/Object;

    monitor-enter v1

    .line 292
    :try_start_0
    iput-object p3, p0, Lo/akh;->d:Lo/ajm;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 293
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 294
    :goto_0
    iput-object p1, p0, Lo/akh;->c:Lo/ajd;

    .line 295
    sget-object v0, Lo/akh$i;->d:Lo/akh$i;

    if-ne p2, v0, :cond_2

    .line 296
    iget-object v0, p0, Lo/akh;->o:Lo/aka;

    if-eqz v0, :cond_1

    .line 297
    iget-object v0, p0, Lo/akh;->o:Lo/aka;

    invoke-virtual {v0}, Lo/aka;->d()V

    .line 298
    iget-object v0, p0, Lo/akh;->o:Lo/aka;

    invoke-virtual {v0}, Lo/aka;->e()Lo/aka;

    .line 300
    :cond_1
    invoke-virtual {p0}, Lo/akh;->d()V

    .line 302
    :cond_2
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lo/akh;->d(I)V

    .line 303
    return-void
.end method

.method public d()V
    .locals 1

    .line 276
    const/4 v0, 0x0

    iput v0, p0, Lo/akh;->h:I

    .line 277
    return-void
.end method

.method public d(I)V
    .locals 4

    .line 349
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerDeviceGetVerifyCode: ,max "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 350
    iget-object v0, p0, Lo/akh;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    new-instance v1, Lo/akh$a;

    invoke-direct {v1, p0, p1}, Lo/akh$a;-><init>(Lo/akh;I)V

    invoke-virtual {v0, v1}, Lo/czg;->e(Lo/cyx;)V

    .line 351
    return-void
.end method

.method public e(Lo/aix;I)V
    .locals 20

    .line 359
    const-string v9, ""

    .line 360
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5411\u8bbe\u5907\u5199\u5165\u9a8c\u8bc1\u7801\u5b8c\u6210\u6ce8\u518c,registerDeviceWriteVerifyCode: retry "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 362
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/akh;->c:Lo/ajd;

    invoke-virtual {v0}, Lo/ajd;->h()Ljava/lang/String;

    move-result-object v0

    const-string v1, "coap"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/akh;->c:Lo/ajd;

    .line 363
    invoke-virtual {v0}, Lo/ajd;->h()Ljava/lang/String;

    move-result-object v0

    const-string v1, "wifiap"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 365
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/akh;->c:Lo/ajd;

    invoke-virtual {v0}, Lo/ajd;->i()Ljava/lang/String;

    move-result-object v10

    .line 366
    const/4 v0, 0x0

    if-eq v0, v10, :cond_2

    .line 367
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerDeviceWriteVerifyCode: uri is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 368
    const-string v0, "coap://"

    invoke-virtual {v10, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "coaps://"

    invoke-virtual {v10, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 369
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "coap://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 371
    :cond_1
    :try_start_0
    new-instance v0, Ljava/net/URI;

    invoke-direct {v0, v10}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v0

    move-object v9, v0

    .line 372
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerDeviceWriteVerifyCode: ip is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 375
    goto :goto_0

    .line 373
    :catch_0
    move-exception v11

    .line 374
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerDeviceWriteVerifyCode: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Ljava/net/URISyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 377
    :cond_2
    :goto_0
    goto :goto_1

    .line 378
    :cond_3
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerDeviceWriteVerifyCode Unknown device source type:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/akh;->c:Lo/ajd;

    invoke-virtual {v3}, Lo/ajd;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 380
    :goto_1
    new-instance v10, Lo/aik;

    invoke-direct {v10}, Lo/aik;-><init>()V

    .line 381
    new-instance v11, Lo/aiy;

    invoke-direct {v11}, Lo/aiy;-><init>()V

    .line 382
    invoke-virtual/range {p1 .. p1}, Lo/aix;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v11, Lo/aiy;->b:Ljava/lang/String;

    .line 383
    invoke-virtual/range {p1 .. p1}, Lo/aix;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v11, Lo/aiy;->e:Ljava/lang/String;

    .line 384
    invoke-virtual/range {p1 .. p1}, Lo/aix;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v11, Lo/aiy;->c:Ljava/lang/String;

    .line 386
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/akh;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "healthAPPToDeviceUrl"

    invoke-virtual {v0, v1}, Lo/cze;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v11, Lo/aiy;->a:Ljava/lang/String;

    .line 387
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerDeviceWriteVerifyCode to device url "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, v11, Lo/aiy;->a:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 388
    invoke-virtual/range {p1 .. p1}, Lo/aix;->k()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v12

    .line 389
    invoke-virtual/range {p1 .. p1}, Lo/aix;->a()Ljava/lang/String;

    move-result-object v13

    .line 390
    invoke-virtual/range {p1 .. p1}, Lo/aix;->b()Ljava/lang/String;

    move-result-object v14

    .line 391
    invoke-virtual/range {p1 .. p1}, Lo/aix;->h()Ljava/lang/String;

    move-result-object v15

    .line 392
    invoke-virtual/range {p1 .. p1}, Lo/aix;->f()Ljava/lang/Long;

    move-result-object v16

    .line 393
    invoke-virtual/range {p1 .. p1}, Lo/aix;->g()Ljava/lang/Integer;

    move-result-object v17

    .line 394
    invoke-virtual/range {p1 .. p1}, Lo/aix;->i()I

    move-result v18

    .line 395
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerDeviceWriteVerifyCode modeResp = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 396
    new-instance v0, Lo/akh$h;

    move-object/from16 v1, p0

    move/from16 v2, p2

    move-object/from16 v3, p1

    invoke-direct {v0, v1, v2, v3}, Lo/akh$h;-><init>(Lo/akh;ILo/aix;)V

    move-object/from16 v19, v0

    .line 397
    const/4 v0, 0x2

    if-eq v12, v0, :cond_4

    const/4 v0, 0x3

    if-ne v12, v0, :cond_5

    .line 398
    :cond_4
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5bcc\u8bbe\u5907\u4e0b\u53d1\u6ce8\u518c\u7801"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 399
    move-object v0, v10

    move-object v1, v9

    move-object v2, v11

    move-object v3, v13

    move-object v4, v14

    move-object/from16 v5, v17

    move-object/from16 v6, v19

    invoke-virtual/range {v0 .. v6}, Lo/aik;->b(Ljava/lang/String;Lo/aiy;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lo/aiq$d;)V

    goto :goto_2

    .line 400
    :cond_5
    const/4 v0, 0x1

    if-ne v12, v0, :cond_6

    .line 401
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5ecb\u8bbe\u5907\u4e0b\u53d1\u6ce8\u518c\u7801"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 402
    move-object v0, v10

    move-object v1, v9

    move-object v2, v11

    move-object v3, v13

    move-object v4, v14

    move-object v5, v15

    move-object/from16 v6, v16

    move/from16 v7, v18

    move-object/from16 v8, v19

    invoke-virtual/range {v0 .. v8}, Lo/aik;->c(Ljava/lang/String;Lo/aiy;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ILo/aiq$d;)V

    .line 404
    :cond_6
    :goto_2
    return-void
.end method

.method public e(Lo/aix;IZ)V
    .locals 9

    .line 504
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerDeviceCreatSession: max "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " isRetry "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 505
    if-nez p3, :cond_0

    .line 506
    invoke-static {}, Lo/ajt;->d()[B

    move-result-object v4

    .line 507
    invoke-static {v4}, Lo/ajw;->d([B)Ljava/lang/String;

    move-result-object v5

    .line 508
    new-instance v6, Ljava/security/SecureRandom;

    invoke-direct {v6}, Ljava/security/SecureRandom;-><init>()V

    .line 509
    const/16 v0, 0x7fff

    invoke-virtual {v6, v0}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v7

    .line 510
    iput-object v5, p0, Lo/akh;->f:Ljava/lang/String;

    .line 511
    iput v7, p0, Lo/akh;->i:I

    .line 512
    invoke-virtual {p1, v5}, Lo/aix;->d(Ljava/lang/String;)V

    .line 513
    invoke-virtual {p1, v7}, Lo/aix;->c(I)V

    .line 514
    goto :goto_0

    .line 515
    :cond_0
    iget-object v0, p0, Lo/akh;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lo/aix;->d(Ljava/lang/String;)V

    .line 516
    iget v0, p0, Lo/akh;->i:I

    invoke-virtual {p1, v0}, Lo/aix;->c(I)V

    .line 519
    :goto_0
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerDeviceCreatSession: sn1 is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/akh;->f:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 520
    iget-object v0, p0, Lo/akh;->c:Lo/ajd;

    iget-object v1, p0, Lo/akh;->e:Landroid/content/Context;

    invoke-static {v0, v1}, Lo/akh;->b(Lo/ajd;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 521
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 522
    iget-object v0, p0, Lo/akh;->b:Lo/akh$e;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const/16 v2, 0xc20

    invoke-interface {v0, v2, v1}, Lo/akh$e;->e(I[Ljava/lang/String;)V

    .line 523
    return-void

    .line 525
    :cond_1
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerDeviceCreatSession: ip is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 526
    const/4 v5, 0x1

    .line 527
    const/4 v6, 0x3

    .line 528
    new-instance v7, Lo/aik;

    invoke-direct {v7}, Lo/aik;-><init>()V

    .line 529
    new-instance v8, Lo/aiw;

    invoke-direct {v8}, Lo/aiw;-><init>()V

    .line 530
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/aiw;->b(Ljava/lang/Integer;)V

    .line 531
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/aiw;->a(Ljava/lang/Integer;)V

    .line 532
    iget-object v0, p0, Lo/akh;->f:Ljava/lang/String;

    invoke-virtual {v8, v0}, Lo/aiw;->a(Ljava/lang/String;)V

    .line 533
    iget v0, p0, Lo/akh;->i:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/aiw;->e(Ljava/lang/Integer;)V

    .line 534
    new-instance v0, Lo/akh$c;

    invoke-direct {v0, p0, p1, p2}, Lo/akh$c;-><init>(Lo/akh;Lo/aix;I)V

    invoke-virtual {v7, v4, v8, v0}, Lo/aik;->d(Ljava/lang/String;Lo/aiw;Lo/aiq$d;)V

    .line 535
    return-void
.end method
