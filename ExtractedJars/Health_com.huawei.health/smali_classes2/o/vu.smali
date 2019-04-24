.class public Lo/vu;
.super Lo/eac;
.source "SourceFile"


# static fields
.field private static a:Lo/vu;

.field private static d:I


# instance fields
.field private b:Ljava/lang/String;

.field private c:I

.field private e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/bone/social/manager/db/SocialRankingTable;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 57
    const/4 v0, 0x0

    sput v0, Lo/vu;->d:I

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 68
    invoke-direct {p0}, Lo/eac;-><init>()V

    .line 49
    const-string v0, "PSocial_PluginSocial"

    iput-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    .line 52
    const v0, 0x36ee80

    iput v0, p0, Lo/vu;->c:I

    .line 69
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "context"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    return-void
.end method

.method public static a(Landroid/content/Context;)Lo/vu;
    .locals 2

    .line 59
    sget-object v0, Lo/vu;->a:Lo/vu;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 60
    new-instance v0, Lo/vu;

    invoke-direct {v0, p0}, Lo/vu;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/vu;->a:Lo/vu;

    .line 62
    :cond_0
    sget-object v0, Lo/vu;->a:Lo/vu;

    return-object v0
.end method

.method static synthetic b(Lo/vu;)I
    .locals 1

    .line 48
    iget v0, p0, Lo/vu;->c:I

    return v0
.end method

.method static synthetic c(Lo/vu;)Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a(Lo/xj;)V
    .locals 4

    .line 413
    invoke-static {}, Lo/xy;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 414
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegisterSocialObserver don\'t support social"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 415
    return-void

    .line 417
    :cond_0
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter unRegisterSocialObserver "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 421
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/wr;->d(Lo/xj;)V

    .line 423
    return-void
.end method

.method public a()Z
    .locals 6

    .line 495
    const/4 v4, 0x0

    .line 496
    invoke-static {}, Lo/xy;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 497
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLoginState don\'t support social"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 498
    return v4

    .line 500
    :cond_0
    invoke-virtual {p0}, Lo/vu;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/vv;

    .line 501
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 502
    invoke-interface {v5}, Lo/vv;->e()Z

    move-result v4

    .line 503
    invoke-static {v4}, Lo/wm;->b(Z)V

    .line 506
    :cond_1
    return v4
.end method

.method public b()Ljava/lang/String;
    .locals 5

    .line 88
    const-string v4, ""

    .line 89
    invoke-static {}, Lo/xy;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 90
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSocialStorageLitterSize don\'t support social"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    return-object v4

    .line 93
    :cond_0
    return-object v4
.end method

.method public b(Landroid/content/Context;)V
    .locals 4

    .line 246
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v0

    if-nez v0, :cond_0

    .line 247
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not login"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    return-void

    .line 250
    :cond_0
    invoke-static {}, Lo/xy;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 251
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initAssistent don\'t support social"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 252
    return-void

    .line 256
    :cond_1
    invoke-static {}, Lo/xw;->a()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    new-instance v1, Lo/vu$5;

    invoke-direct {v1, p0, p1}, Lo/vu$5;-><init>(Lo/vu;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 273
    return-void
.end method

.method public b(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5

    .line 458
    invoke-static {}, Lo/xy;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 459
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTodayFitnessTotalData don\'t support social"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 460
    return-void

    .line 462
    :cond_0
    invoke-virtual {p0}, Lo/vu;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/vv;

    .line 463
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 464
    invoke-interface {v4, p1, p2}, Lo/vv;->d(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 467
    :cond_1
    return-void
.end method

.method public b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 336
    invoke-static {}, Lo/xy;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 337
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shareToSocial don\'t support social"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 338
    return-void

    .line 340
    :cond_0
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter shareToSocial title:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " content"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 341
    if-eqz p6, :cond_1

    .line 342
    const-string v0, ""

    const/4 v1, -0x1

    invoke-interface {p6, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 345
    :cond_1
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 6

    .line 517
    invoke-static {}, Lo/xy;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 518
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLoginUserId don\'t support social"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 519
    const-string v0, "1"

    return-object v0

    .line 521
    :cond_0
    invoke-virtual {p0}, Lo/vu;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/vv;

    .line 522
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 523
    invoke-interface {v4}, Lo/vv;->c()Ljava/lang/String;

    move-result-object v5

    .line 524
    invoke-static {v5}, Lo/wm;->b(Ljava/lang/String;)V

    .line 525
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 526
    :cond_1
    const-string v5, "1"

    .line 528
    :cond_2
    return-object v5

    .line 530
    :cond_3
    const-string v0, "1"

    return-object v0
.end method

.method public c(Lo/xk;Landroid/content/Context;)Lo/xh;
    .locals 6

    .line 438
    const/4 v4, 0x0

    .line 439
    invoke-static {}, Lo/xy;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 440
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAchievePersonalData don\'t support social"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 441
    return-object v4

    .line 443
    :cond_0
    invoke-virtual {p0}, Lo/vu;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/vv;

    .line 444
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 445
    invoke-interface {v5, p1, p2}, Lo/vv;->d(Lo/xk;Landroid/content/Context;)Lo/xh;

    move-result-object v4

    .line 447
    :cond_1
    return-object v4
.end method

.method public c(Landroid/content/Context;)V
    .locals 5

    .line 191
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v0

    if-nez v0, :cond_0

    .line 192
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not login"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    return-void

    .line 196
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 197
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openMoment context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    return-void

    .line 201
    :cond_1
    invoke-static {}, Lo/xy;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 202
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openRankingList don\'t support social"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    return-void

    .line 205
    :cond_2
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 206
    const-string v0, "com.huawei.bone.social.ui.LauncherActivity"

    invoke-virtual {v4, p1, v0}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 207
    const-string v0, "choose_fragemnt_key"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 208
    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0, v4}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 209
    return-void
.end method

.method public d()V
    .locals 4

    .line 101
    invoke-static {}, Lo/xy;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 102
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteImageFileOrDirectory don\'t support social"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    return-void

    .line 106
    :cond_0
    return-void
.end method

.method public d(Landroid/content/Context;)V
    .locals 5

    .line 219
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v0

    if-nez v0, :cond_0

    .line 220
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not login"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    return-void

    .line 223
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 224
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openMoment context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    return-void

    .line 228
    :cond_1
    invoke-static {}, Lo/xy;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 229
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openRankingList don\'t support social"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 230
    return-void

    .line 233
    :cond_2
    invoke-static {}, Lo/vs;->a()Lo/vs;

    invoke-static {}, Lo/vs;->a()Lo/vs;

    move-result-object v4

    .line 234
    invoke-virtual {v4, p1}, Lo/vs;->c(Landroid/content/Context;)V

    .line 235
    invoke-virtual {v4, p1}, Lo/vs;->e(Landroid/content/Context;)V

    .line 236
    return-void
.end method

.method public d(Lo/xj;)V
    .locals 4

    .line 397
    invoke-static {}, Lo/xy;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 398
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerSocialObserver don\'t support social"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 399
    return-void

    .line 402
    :cond_0
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter registerSocialObserver "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 405
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/wr;->b(Lo/xj;)V

    .line 409
    return-void
.end method

.method public e(Landroid/content/Context;)I
    .locals 11

    .line 117
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v0

    if-nez v0, :cond_0

    .line 118
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not login"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    const/4 v0, 0x1

    return v0

    .line 122
    :cond_0
    invoke-static {}, Lo/xy;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 123
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getRankNum don\'t support social"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    const/4 v0, 0x1

    return v0

    .line 127
    :cond_1
    const/4 v4, 0x1

    .line 128
    invoke-static {p1}, Lo/xr;->d(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lo/vu;->e:Ljava/util/ArrayList;

    .line 129
    iget-object v0, p0, Lo/vu;->e:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 130
    return v4

    .line 133
    :cond_2
    invoke-virtual {p0}, Lo/vu;->c()Ljava/lang/String;

    move-result-object v5

    .line 134
    invoke-static {v5}, Lo/xl;->e(Ljava/lang/String;)J

    move-result-wide v6

    .line 135
    const/4 v8, 0x0

    .line 136
    iget-object v0, p0, Lo/vu;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/bone/social/manager/db/SocialRankingTable;

    .line 137
    add-int/lit8 v8, v8, 0x1

    .line 138
    invoke-virtual {v10}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getHuId()J

    move-result-wide v0

    cmp-long v0, v0, v6

    if-nez v0, :cond_3

    .line 139
    move v4, v8

    .line 140
    goto :goto_1

    .line 142
    :cond_3
    goto :goto_0

    .line 143
    :cond_4
    :goto_1
    return v4
.end method

.method public e()Ljava/lang/String;
    .locals 6

    .line 544
    const-string v4, ""

    .line 545
    invoke-static {}, Lo/xy;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 546
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAccessToken don\'t support social"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 547
    return-object v4

    .line 552
    :cond_0
    invoke-virtual {p0}, Lo/vu;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/vv;

    .line 553
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 554
    invoke-interface {v5}, Lo/vv;->d()Ljava/lang/String;

    move-result-object v4

    .line 555
    invoke-static {v4}, Lo/wm;->c(Ljava/lang/String;)V

    .line 556
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getAccessToken :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 558
    :cond_1
    return-object v4
.end method

.method public e(Landroid/content/Context;J)V
    .locals 6

    .line 354
    invoke-static {}, Lo/xy;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 355
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openFriendDetails don\'t support social"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 356
    return-void

    .line 358
    :cond_0
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter openAddFriend huid:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 360
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v0

    if-nez v0, :cond_1

    .line 361
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not login"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 365
    :cond_1
    new-instance v4, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;

    invoke-direct {v4}, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;-><init>()V

    .line 366
    const/4 v0, 0x4

    iput v0, v4, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;->ui:I

    .line 367
    iput-wide p2, v4, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;->param:J

    .line 368
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;->transaction:Ljava/lang/String;

    .line 369
    invoke-static {}, Lo/vs;->a()Lo/vs;

    move-result-object v5

    .line 370
    invoke-virtual {v5, v4, p1}, Lo/vs;->b(Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;Landroid/content/Context;)I

    .line 372
    return-void
.end method

.method public e(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5

    .line 478
    invoke-static {}, Lo/xy;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 479
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shareBitmapAndText don\'t support social"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 480
    return-void

    .line 482
    :cond_0
    invoke-virtual {p0}, Lo/vu;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/vv;

    .line 483
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 484
    invoke-interface {v4, p1, p2, p3, p4}, Lo/vv;->d(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 487
    :cond_1
    return-void
.end method

.method public f(Landroid/content/Context;)V
    .locals 4

    .line 281
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v0

    if-nez v0, :cond_0

    .line 282
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not login"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 283
    return-void

    .line 286
    :cond_0
    invoke-static {}, Lo/xy;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 287
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getRankingList don\'t support social"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 288
    return-void

    .line 292
    :cond_1
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lo/vu$3;

    invoke-direct {v1, p0, p1}, Lo/vu$3;-><init>(Lo/vu;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 303
    return-void
.end method

.method public finish()V
    .locals 0

    .line 671
    invoke-super {p0}, Lo/eac;->finish()V

    .line 672
    return-void
.end method

.method public getAdapter()Lo/eab;
    .locals 1

    .line 653
    invoke-super {p0}, Lo/eac;->getAdapter()Lo/eab;

    move-result-object v0

    return-object v0
.end method

.method public h()V
    .locals 5

    .line 569
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "socialRankSwitch"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lo/xt;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 570
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 571
    new-instance v4, Lo/wq;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v4, v0}, Lo/wq;-><init>(Landroid/content/Context;)V

    .line 572
    new-instance v0, Lo/vu$2;

    invoke-direct {v0, p0}, Lo/vu$2;-><init>(Lo/vu;)V

    invoke-virtual {v4, v0}, Lo/wq;->d(Lo/wo;)V

    .line 596
    :cond_0
    return-void
.end method

.method public i()Ljava/lang/String;
    .locals 6

    .line 603
    invoke-virtual {p0}, Lo/vu;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/vv;

    .line 604
    const-string v5, ""

    .line 605
    invoke-static {}, Lo/xy;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 606
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getServiceToken don\'t support social"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 607
    return-object v5

    .line 609
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 610
    invoke-interface {v4}, Lo/vv;->a()Ljava/lang/String;

    move-result-object v5

    .line 611
    invoke-static {v5}, Lo/wm;->a(Ljava/lang/String;)V

    .line 613
    :cond_1
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getServiceToken :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 614
    return-object v5
.end method

.method public i(Landroid/content/Context;)V
    .locals 5

    .line 380
    invoke-static {}, Lo/xy;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 381
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifySocialUpdateFriendList don\'t support social"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 382
    return-void

    .line 384
    :cond_0
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter notifySocialUpdateFriendList "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 387
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "friend change,need to update db"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 388
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 389
    const-string v0, "com.huawei.bone.social.login_expire"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 390
    const-string v0, "bundle_task"

    const/16 v1, 0x74

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 391
    sget-object v0, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {p1, v4, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 393
    return-void
.end method

.method public init(Landroid/content/Context;)V
    .locals 1

    .line 665
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-super {p0, v0}, Lo/eac;->init(Landroid/content/Context;)V

    .line 666
    invoke-virtual {p0}, Lo/vu;->h()V

    .line 667
    return-void
.end method

.method public k()V
    .locals 5

    .line 621
    invoke-static {}, Lo/xy;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 622
    iget-object v0, p0, Lo/vu;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshToken don\'t support social"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 623
    return-void

    .line 625
    :cond_0
    invoke-virtual {p0}, Lo/vu;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/vv;

    .line 626
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 627
    invoke-interface {v4}, Lo/vv;->b()V

    .line 630
    :cond_1
    return-void
.end method

.method public setAdapter(Lo/eab;)V
    .locals 0

    .line 658
    invoke-super {p0, p1}, Lo/eac;->setAdapter(Lo/eab;)V

    .line 661
    return-void
.end method
