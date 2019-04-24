.class public Lo/ahr;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ahr$e;
    }
.end annotation


# static fields
.field private static d:Lo/ahr;

.field private static e:J


# instance fields
.field private a:Landroid/os/HandlerThread;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;>;"
        }
    .end annotation
.end field

.field private c:Lo/ahr$e;

.field private f:Lo/aff;


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 183
    new-instance v0, Lo/ahr$4;

    invoke-direct {v0, p0}, Lo/ahr$4;-><init>(Lo/ahr;)V

    iput-object v0, p0, Lo/ahr;->f:Lo/aff;

    .line 57
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "updata_device"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/ahr;->a:Landroid/os/HandlerThread;

    .line 58
    iget-object v0, p0, Lo/ahr;->a:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 59
    new-instance v0, Lo/ahr$e;

    iget-object v1, p0, Lo/ahr;->a:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/ahr$e;-><init>(Lo/ahr;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/ahr;->c:Lo/ahr$e;

    .line 60
    return-void
.end method

.method static synthetic a(Lo/ahr;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lo/ahr;->i()V

    return-void
.end method

.method static synthetic b(Lo/ahr;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 44
    iput-object p1, p0, Lo/ahr;->b:Ljava/util/List;

    return-object p1
.end method

.method private b(Ljava/lang/String;)Lo/afj;
    .locals 4

    .line 266
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 267
    const-string v0, "UpdataDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getProduct null == productid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 268
    const/4 v0, 0x0

    return-object v0

    .line 270
    :cond_0
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    return-object v0
.end method

.method private b(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;>;)V"
        }
    .end annotation

    .line 240
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 241
    const-string v0, "UpdataDeviceControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updataLocalDevice infos size "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 242
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v4, v0, -0x1

    :goto_0
    if-ltz v4, :cond_0

    .line 243
    const-string v0, "UpdataDeviceControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updataLocalDevice deviceid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;

    iget-object v2, v2, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->devId:Ljava/lang/String;

    invoke-static {v2}, Lo/aho;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 244
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;

    invoke-direct {p0, v0}, Lo/ahr;->d(Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;)V

    .line 242
    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    :cond_0
    goto :goto_1

    .line 247
    :cond_1
    const-string v0, "UpdataDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updataLocalDevice infos is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 249
    :goto_1
    invoke-direct {p0}, Lo/ahr;->o()V

    .line 250
    return-void
.end method

.method static synthetic b(Lo/ahr;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lo/ahr;->l()V

    return-void
.end method

.method static synthetic c(Lo/ahr;)Ljava/util/List;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/ahr;->b:Ljava/util/List;

    return-object v0
.end method

.method private c()Z
    .locals 6

    .line 74
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 75
    const-string v0, "UpdataDeviceControl"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isSync nextSyncTime:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-wide v2, Lo/ahr;->e:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " mCurrentTime,"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 76
    const-wide/32 v0, 0xea60

    sub-long v0, v4, v0

    sget-wide v2, Lo/ahr;->e:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 77
    sput-wide v4, Lo/ahr;->e:J

    .line 78
    const/4 v0, 0x1

    return v0

    .line 80
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static d()Lo/ahr;
    .locals 2

    .line 63
    sget-object v0, Lo/ahr;->d:Lo/ahr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 64
    new-instance v0, Lo/ahr;

    invoke-direct {v0}, Lo/ahr;-><init>()V

    sput-object v0, Lo/ahr;->d:Lo/ahr;

    .line 66
    :cond_0
    sget-object v0, Lo/ahr;->d:Lo/ahr;

    return-object v0
.end method

.method private d(Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;)V
    .locals 7

    .line 274
    const/4 v0, 0x0

    if-eq v0, p1, :cond_4

    .line 275
    const-string v0, "UpdataDeviceControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveWiFiDevice deviceid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p1, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->devId:Ljava/lang/String;

    invoke-static {v2}, Lo/aho;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 276
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ajo;->e(Landroid/content/Context;)Lo/ajo;

    move-result-object v4

    .line 277
    iget-object v0, p1, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->devInfo:Lcom/huawei/hwcloudmodel/model/unite/DevInfo;

    iget-object v0, v0, Lcom/huawei/hwcloudmodel/model/unite/DevInfo;->prodId:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lo/ajo;->b(Ljava/lang/String;)Lo/ajs;

    move-result-object v5

    .line 279
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 280
    iget-object v0, v5, Lo/ajs;->c:Ljava/lang/String;

    invoke-direct {p0, v0}, Lo/ahr;->b(Ljava/lang/String;)Lo/afj;

    move-result-object v6

    goto :goto_0

    .line 282
    :cond_0
    const-string v0, "UpdataDeviceControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveWiFiDevice null == table ProdId"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p1, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->devInfo:Lcom/huawei/hwcloudmodel/model/unite/DevInfo;

    invoke-virtual {v2}, Lcom/huawei/hwcloudmodel/model/unite/DevInfo;->getProdId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 283
    const-string v0, "e4b0b1d5-2003-4d88-8b5f-c4f64542040b"

    invoke-direct {p0, v0}, Lo/ahr;->b(Ljava/lang/String;)Lo/afj;

    move-result-object v6

    .line 284
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    iget-object v0, v6, Lo/afj;->h:Lo/ace;

    iget-object v1, p1, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->devInfo:Lcom/huawei/hwcloudmodel/model/unite/DevInfo;

    invoke-virtual {v1}, Lcom/huawei/hwcloudmodel/model/unite/DevInfo;->getProdId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ace;->e(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 285
    :cond_1
    const-string v0, "a8ba095d-4123-43c4-a30a-0240011c58de"

    invoke-direct {p0, v0}, Lo/ahr;->b(Ljava/lang/String;)Lo/afj;

    move-result-object v6

    .line 286
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    iget-object v0, v6, Lo/afj;->h:Lo/ace;

    iget-object v1, p1, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->devInfo:Lcom/huawei/hwcloudmodel/model/unite/DevInfo;

    invoke-virtual {v1}, Lcom/huawei/hwcloudmodel/model/unite/DevInfo;->getProdId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ace;->e(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 287
    :cond_2
    const/4 v6, 0x0

    .line 291
    :cond_3
    :goto_0
    invoke-direct {p0, v6, p1}, Lo/ahr;->e(Lo/afj;Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;)V

    .line 292
    goto :goto_1

    .line 293
    :cond_4
    const-string v0, "UpdataDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveWiFiDevice null != info"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 295
    :goto_1
    return-void
.end method

.method static synthetic d(Lo/ahr;Ljava/lang/String;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lo/ahr;->e(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d(Lo/ahr;)Z
    .locals 1

    .line 44
    invoke-direct {p0}, Lo/ahr;->c()Z

    move-result v0

    return v0
.end method

.method private e(Ljava/lang/String;)V
    .locals 6

    .line 347
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/afd;->e(Ljava/lang/String;)Lo/acl;

    move-result-object v4

    .line 348
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ajw;->d(Landroid/content/Context;)Z

    move-result v5

    .line 349
    const-string v0, "UpdataDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "wifi: device: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", network connect: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 350
    if-eqz v4, :cond_0

    instance-of v0, v4, Lo/aja;

    if-eqz v0, :cond_0

    if-eqz v5, :cond_0

    .line 351
    invoke-static {}, Lo/ahs;->e()Lo/ahs;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/ahs;->e(Ljava/lang/String;)V

    .line 353
    :cond_0
    return-void
.end method

.method private e(Lo/afj;Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;)V
    .locals 7

    .line 298
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 299
    const-string v0, "UpdataDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bindDevice null == product"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 300
    return-void

    .line 302
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 303
    const-string v0, "UpdataDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bindDevice null == info"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 304
    return-void

    .line 306
    :cond_1
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p1, Lo/afj;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 v4, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    .line 307
    :goto_0
    const-string v0, "UpdataDeviceControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bindDevice isExist "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 308
    new-instance v5, Lo/aja;

    invoke-direct {v5}, Lo/aja;-><init>()V

    .line 309
    invoke-virtual {v5, p2}, Lo/aja;->e(Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;)V

    .line 310
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/aja;->c(Z)V

    .line 311
    sget-object v0, Lo/acl$a;->c:Lo/acl$a;

    invoke-virtual {v5, v0}, Lo/aja;->d(Lo/acl$a;)V

    .line 312
    invoke-virtual {p1}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v5, Lo/aja;->e:Ljava/lang/String;

    .line 313
    if-eqz v4, :cond_3

    .line 314
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p1, Lo/afj;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lo/ahr$2;

    invoke-direct {v3, p0, p2}, Lo/ahr$2;-><init>(Lo/ahr;Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;)V

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/afd;->e(Ljava/lang/String;Ljava/lang/String;Lo/acl;Lo/aby;)Z

    move-result v6

    .line 326
    const-string v0, "UpdataDeviceControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bindWiFiUpdateDevice isSuccess "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 327
    return-void

    .line 329
    :cond_3
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p1, Lo/afj;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lo/ahr$1;

    invoke-direct {v3, p0, p2}, Lo/ahr$1;-><init>(Lo/ahr;Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;)V

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/afd;->b(Ljava/lang/String;Ljava/lang/String;Lo/acl;Lo/aby;)Z

    move-result v6

    .line 341
    const-string v0, "UpdataDeviceControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bindDevice isSuccess "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 342
    return-void
.end method

.method static synthetic e(Lo/ahr;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lo/ahr;->k()V

    return-void
.end method

.method public static e()Z
    .locals 1

    .line 117
    const/4 v0, 0x0

    return v0
.end method

.method private f()Z
    .locals 3

    .line 171
    new-instance v2, Lo/aev;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    const-string v1, "devicedownloadtime"

    invoke-direct {v2, v0, v1}, Lo/aev;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 172
    const-string v0, "firstUnzipRes"

    invoke-virtual {v2, v0}, Lo/aev;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 173
    const/4 v0, 0x1

    return v0

    .line 175
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private g()V
    .locals 4

    .line 178
    const-string v0, "UpdataDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initDeviceResource in"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 179
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lo/ahr;->f:Lo/aff;

    invoke-virtual {v0, v1}, Lo/afq;->a(Lo/aff;)V

    .line 180
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0}, Lo/afq;->h()V

    .line 181
    return-void
.end method

.method static synthetic g(Lo/ahr;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lo/ahr;->p()V

    return-void
.end method

.method private h()V
    .locals 2

    .line 121
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    const-string v1, "a8ba095d-4123-43c4-a30a-0240011c58de"

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 122
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    const-string v1, "a8ba095d-4123-43c4-a30a-0240011c58de"

    invoke-virtual {v0, v1}, Lo/afq;->f(Ljava/lang/String;)V

    .line 124
    :cond_0
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    const-string v1, "e4b0b1d5-2003-4d88-8b5f-c4f64542040b"

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 125
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    const-string v1, "e4b0b1d5-2003-4d88-8b5f-c4f64542040b"

    invoke-virtual {v0, v1}, Lo/afq;->f(Ljava/lang/String;)V

    .line 127
    :cond_1
    return-void
.end method

.method static synthetic i(Lo/ahr;)Lo/ahr$e;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/ahr;->c:Lo/ahr$e;

    return-object v0
.end method

.method private i()V
    .locals 4

    .line 142
    const-string v0, "UpdataDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncWiFiDevice in"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 143
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    new-instance v1, Lo/ahr$3;

    invoke-direct {v1, p0}, Lo/ahr$3;-><init>(Lo/ahr;)V

    invoke-virtual {v0, v1}, Lo/czg;->b(Lo/cyx;)V

    .line 169
    return-void
.end method

.method private k()V
    .locals 4

    .line 194
    invoke-direct {p0}, Lo/ahr;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 195
    invoke-direct {p0}, Lo/ahr;->g()V

    .line 196
    iget-object v0, p0, Lo/ahr;->c:Lo/ahr$e;

    const/16 v1, 0x103

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Lo/ahr$e;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 198
    :cond_0
    iget-object v0, p0, Lo/ahr;->c:Lo/ahr$e;

    const/16 v1, 0x103

    invoke-virtual {v0, v1}, Lo/ahr$e;->sendEmptyMessage(I)Z

    .line 200
    :goto_0
    return-void
.end method

.method static synthetic k(Lo/ahr;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lo/ahr;->h()V

    return-void
.end method

.method private l()V
    .locals 4

    .line 234
    const-string v0, "UpdataDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteAllDevice in "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 235
    invoke-direct {p0}, Lo/ahr;->n()V

    .line 236
    invoke-direct {p0}, Lo/ahr;->o()V

    .line 237
    return-void
.end method

.method private n()V
    .locals 8

    .line 211
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0}, Lo/afd;->d()Ljava/util/ArrayList;

    move-result-object v4

    .line 212
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 213
    const-string v0, "UpdataDeviceControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteDevice deviceIds "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 214
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 215
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/afd;->f(Ljava/lang/String;)Z

    move-result v7

    .line 216
    const-string v0, "UpdataDeviceControl"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteDevice deviceid:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Lo/aho;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " isSuccess:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 217
    goto :goto_0

    :cond_0
    goto :goto_1

    .line 219
    :cond_1
    const-string v0, "UpdataDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteDevice device is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 221
    :goto_1
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    const-string v1, "e4b0b1d5-2003-4d88-8b5f-c4f64542040b"

    invoke-virtual {v0, v1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v5

    .line 222
    const-string v0, "UpdataDeviceControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteDevice check huawei device "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    if-nez v5, :cond_2

    const-string v2, "is null"

    goto :goto_2

    :cond_2
    invoke-virtual {v5}, Lo/acl;->e()Ljava/lang/String;

    move-result-object v2

    :goto_2
    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 223
    if-eqz v5, :cond_3

    .line 224
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    const-string v1, "e4b0b1d5-2003-4d88-8b5f-c4f64542040b"

    invoke-virtual {v0, v1}, Lo/afd;->i(Ljava/lang/String;)Z

    .line 226
    :cond_3
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    const-string v1, "a8ba095d-4123-43c4-a30a-0240011c58de"

    invoke-virtual {v0, v1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v6

    .line 227
    const-string v0, "UpdataDeviceControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteDevice check honor device "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    if-nez v6, :cond_4

    const-string v2, "is null"

    goto :goto_3

    :cond_4
    invoke-virtual {v6}, Lo/acl;->e()Ljava/lang/String;

    move-result-object v2

    :goto_3
    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 228
    if-eqz v6, :cond_5

    .line 229
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    const-string v1, "a8ba095d-4123-43c4-a30a-0240011c58de"

    invoke-virtual {v0, v1}, Lo/afd;->i(Ljava/lang/String;)Z

    .line 231
    :cond_5
    return-void
.end method

.method private o()V
    .locals 3

    .line 254
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 255
    const-string v0, "com.huawei.bone.action.DEVICE_THIRD_DELETE"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 256
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 258
    invoke-static {}, Lo/ahu;->a()V

    .line 259
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ahr;->b:Ljava/util/List;

    .line 260
    iget-object v0, p0, Lo/ahr;->c:Lo/ahr$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 261
    iget-object v0, p0, Lo/ahr;->c:Lo/ahr$e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ahr$e;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 263
    :cond_0
    return-void
.end method

.method private p()V
    .locals 4

    .line 205
    const-string v0, "UpdataDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "replaceDevice in"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 206
    invoke-direct {p0}, Lo/ahr;->n()V

    .line 207
    iget-object v0, p0, Lo/ahr;->b:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/ahr;->b(Ljava/util/List;)V

    .line 208
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 137
    const-string v0, "UpdataDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncDevice in"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 138
    iget-object v0, p0, Lo/ahr;->c:Lo/ahr$e;

    const/16 v1, 0x101

    invoke-virtual {v0, v1}, Lo/ahr$e;->sendEmptyMessage(I)Z

    .line 139
    return-void
.end method

.method public b()V
    .locals 4

    .line 130
    const-string v0, "UpdataDeviceControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncDelayedDevice in"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 131
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/aii;->b(Landroid/content/Context;)Z

    .line 132
    iget-object v0, p0, Lo/ahr;->c:Lo/ahr$e;

    const/16 v1, 0x104

    invoke-virtual {v0, v1}, Lo/ahr$e;->sendEmptyMessage(I)Z

    .line 133
    iget-object v0, p0, Lo/ahr;->c:Lo/ahr$e;

    const/16 v1, 0x101

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Lo/ahr$e;->sendEmptyMessageDelayed(IJ)Z

    .line 134
    return-void
.end method
