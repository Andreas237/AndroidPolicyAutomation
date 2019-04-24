.class public Lo/cnq;
.super Lo/clg$a;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/concurrent/ExecutorService;

.field private b:Ljava/util/concurrent/ExecutorService;

.field private c:Landroid/content/Context;

.field private d:Lo/cun;

.field private e:Lo/csk;

.field private i:Lo/cur;

.field private k:Lo/cnw;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 155
    invoke-direct {p0}, Lo/clg$a;-><init>()V

    .line 149
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cnq;->i:Lo/cur;

    .line 156
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    .line 157
    invoke-static {}, Lo/cun;->e()Lo/cun;

    move-result-object v0

    iput-object v0, p0, Lo/cnq;->d:Lo/cun;

    .line 158
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/csk;->a(Landroid/content/Context;)Lo/csk;

    move-result-object v0

    iput-object v0, p0, Lo/cnq;->e:Lo/csk;

    .line 159
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cnw;->a(Landroid/content/Context;)Lo/cnw;

    move-result-object v0

    iput-object v0, p0, Lo/cnq;->k:Lo/cnw;

    .line 160
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/cnq;->b:Ljava/util/concurrent/ExecutorService;

    .line 161
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/cnq;->a:Ljava/util/concurrent/ExecutorService;

    .line 162
    new-instance v0, Lo/cur;

    invoke-direct {v0}, Lo/cur;-><init>()V

    iput-object v0, p0, Lo/cnq;->i:Lo/cur;

    .line 163
    iget-object v0, p0, Lo/cnq;->i:Lo/cur;

    iget-object v1, p0, Lo/cnq;->a:Ljava/util/concurrent/ExecutorService;

    invoke-virtual {v0, p1, v1}, Lo/cur;->d(Landroid/content/Context;Ljava/util/concurrent/ExecutorService;)V

    .line 164
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->d(Landroid/content/Context;)V

    .line 167
    iget-object v0, p0, Lo/cnq;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/cnq$1;

    invoke-direct {v1, p0}, Lo/cnq$1;-><init>(Lo/cnq;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 178
    return-void
.end method

.method static synthetic a(Lo/cnq;)Lo/cnw;
    .locals 1

    .line 114
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    return-object v0
.end method

.method static synthetic b(Lo/cnq;)Lo/cun;
    .locals 1

    .line 114
    iget-object v0, p0, Lo/cnq;->d:Lo/cun;

    return-object v0
.end method

.method private b(Lcom/huawei/hihealth/HiAggregateOption;)Z
    .locals 2

    .line 518
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiAggregateOption;->getType()[I

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->sort([I)V

    .line 519
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiAggregateOption;->getType()[I

    move-result-object v0

    const/16 v1, 0x385

    invoke-static {v0, v1}, Ljava/util/Arrays;->binarySearch([II)I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private b(Lcom/huawei/hihealthservice/auth/HiUserAuth;Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealthservice/auth/HiUserAuth;Ljava/util/List<Lo/coa;>;)Z"
        }
    .end annotation

    .line 325
    invoke-static {p2}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic b(Lo/cnq;Lcom/huawei/hihealthservice/auth/HiUserAuth;Ljava/util/List;)Z
    .locals 1

    .line 114
    invoke-direct {p0, p1, p2}, Lo/cnq;->b(Lcom/huawei/hihealthservice/auth/HiUserAuth;Ljava/util/List;)Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lo/cnq;)Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 114
    iget-object v0, p0, Lo/cnq;->b:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method private c(Ljava/lang/String;I)Z
    .locals 1

    .line 329
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    invoke-static {}, Lo/cra;->c()Lo/cra;

    move-result-object v0

    .line 330
    invoke-virtual {v0, p1}, Lo/cra;->a(Ljava/lang/String;)Lcom/huawei/hihealthservice/auth/WhiteListApp;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 329
    :goto_0
    return v0
.end method

.method private c(Ljava/lang/String;Lcom/huawei/hihealth/HiAccountInfo;Lo/crd;)Z
    .locals 2

    .line 320
    invoke-virtual {p3}, Lo/crd;->d()I

    move-result v0

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAccountInfo;->getAppId()I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiAccountInfo;->getAccessToken()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic d(Lo/cnq;)Landroid/content/Context;
    .locals 1

    .line 114
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    return-object v0
.end method

.method private d(Lcom/huawei/hihealth/HiAggregateOption;)Z
    .locals 1

    .line 513
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cuy;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lo/cnq;->b(Lcom/huawei/hihealth/HiAggregateOption;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic d(Lo/cnq;Ljava/lang/String;Lcom/huawei/hihealth/HiAccountInfo;Lo/crd;)Z
    .locals 1

    .line 114
    invoke-direct {p0, p1, p2, p3}, Lo/cnq;->c(Ljava/lang/String;Lcom/huawei/hihealth/HiAccountInfo;Lo/crd;)Z

    move-result v0

    return v0
.end method

.method static synthetic e(Lo/cnq;)Lo/csk;
    .locals 1

    .line 114
    iget-object v0, p0, Lo/cnq;->e:Lo/csk;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 1565
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ondestory "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1566
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/crf;->b(Landroid/content/Context;)Lo/crf;

    move-result-object v0

    invoke-virtual {v0}, Lo/crf;->b()V

    .line 1567
    iget-object v0, p0, Lo/cnq;->b:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1568
    iget-object v0, p0, Lo/cnq;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 1570
    :cond_0
    iget-object v0, p0, Lo/cnq;->a:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1571
    iget-object v0, p0, Lo/cnq;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 1573
    :cond_1
    iget-object v0, p0, Lo/cnq;->d:Lo/cun;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 1574
    iget-object v0, p0, Lo/cnq;->d:Lo/cun;

    invoke-virtual {v0}, Lo/cun;->b()V

    .line 1576
    :cond_2
    iget-object v0, p0, Lo/cnq;->i:Lo/cur;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 1577
    iget-object v0, p0, Lo/cnq;->i:Lo/cur;

    invoke-virtual {v0}, Lo/cur;->d()V

    .line 1579
    :cond_3
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->o()V

    .line 1580
    return-void
.end method

.method public a(ILcom/huawei/hihealth/HiHealthUnit;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1069
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    .line 1070
    return-void
.end method

.method public a(Lcom/huawei/hihealth/HiAppInfo;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 182
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 183
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initHiHealth appInfo = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqw;->e(Landroid/content/Context;)V

    .line 186
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cnt;->a(Landroid/content/Context;I)V

    .line 187
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cnt;->k(Landroid/content/Context;)V

    .line 188
    invoke-static {}, Lo/cun;->e()Lo/cun;

    move-result-object v0

    const-string v1, "initHiHealth"

    new-instance v2, Lo/crd;

    iget-object v3, p0, Lo/cnq;->c:Landroid/content/Context;

    .line 190
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lo/crd;-><init>(Ljava/lang/String;)V

    .line 189
    const/16 v3, 0xc8

    invoke-virtual {v0, v3, v1, v2}, Lo/cun;->d(ILjava/lang/String;Lo/crd;)V

    .line 191
    return-void

    .line 193
    :cond_0
    iget-object v0, p0, Lo/cnq;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/cnq$8;

    invoke-direct {v1, p0, p1}, Lo/cnq$8;-><init>(Lo/cnq;Lcom/huawei/hihealth/HiAppInfo;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 211
    return-void
.end method

.method public a(Lcom/huawei/hihealth/HiDeviceInfo;Ljava/util/List;Lo/clk;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 930
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    move-result v7

    .line 931
    const/4 v0, -0x1

    if-ne v7, v0, :cond_0

    .line 932
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerDataClient() appType is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 933
    const/4 v0, 0x0

    invoke-static {p3, v0}, Lo/cnn;->b(Lo/clk;Lcom/huawei/hihealth/HiHealthClient;)V

    .line 934
    return-void

    .line 936
    :cond_0
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->c()I

    move-result v8

    .line 938
    invoke-static {p1}, Lo/cvj;->a(Lcom/huawei/hihealth/HiDeviceInfo;)Z

    move-result v9

    .line 939
    if-nez v9, :cond_1

    .line 940
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "device is invalid, deviceInfo="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 941
    const/4 v0, 0x0

    invoke-static {p3, v0}, Lo/cnn;->b(Lo/clk;Lcom/huawei/hihealth/HiHealthClient;)V

    .line 942
    return-void

    .line 944
    :cond_1
    iget-object v0, p0, Lo/cnq;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/cnq$12;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v5, v8

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lo/cnq$12;-><init>(Lo/cnq;Lcom/huawei/hihealth/HiDeviceInfo;Ljava/util/List;ILo/clk;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 954
    return-void
.end method

.method public a(Ljava/util/List;Lo/clm;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 413
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    move-result v4

    .line 414
    const/4 v0, -0x1

    if-ne v4, v0, :cond_0

    .line 415
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unSubscribeHiHealthData appType is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 416
    const/4 v0, 0x0

    invoke-static {p2, v0}, Lo/cnn;->d(Lo/clm;Z)V

    .line 417
    return-void

    .line 419
    :cond_0
    iget-object v0, p0, Lo/cnq;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/cnq$7;

    invoke-direct {v1, p0, p1, p2}, Lo/cnq$7;-><init>(Lo/cnq;Ljava/util/List;Lo/clm;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 435
    return-void
.end method

.method public a(Lo/cli;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 987
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    move-result v4

    .line 988
    const/4 v0, -0x1

    if-ne v4, v0, :cond_0

    .line 989
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchBuildInDataClient() appType is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 990
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo/cnn;->e(Lo/cli;Ljava/util/List;)V

    .line 991
    return-void

    .line 993
    :cond_0
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchBuildInDataClient"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 994
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/crb;->e(Landroid/content/Context;)Lo/crb;

    move-result-object v0

    iget-object v1, p0, Lo/cnq;->c:Landroid/content/Context;

    .line 995
    invoke-static {v1}, Lo/cne;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v2}, Lo/cnw;->c()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/crb;->a(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v5

    .line 996
    invoke-static {p1, v5}, Lo/cnn;->e(Lo/cli;Ljava/util/List;)V

    .line 997
    return-void
.end method

.method public a(Ljava/lang/String;)Z
    .locals 5

    .line 1550
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->k()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1551
    const/4 v0, 0x1

    return v0

    .line 1553
    :cond_0
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0, p1}, Lo/cqf;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    .line 1554
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkHiHealthLogin huid = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, ",isLogin = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1555
    return v4
.end method

.method public b(Ljava/lang/String;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 923
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    .line 924
    const/4 v0, 0x0

    return v0
.end method

.method public b(ILjava/util/List;Lo/cla;)V
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1424
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    .line 1425
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->a()Lo/crd;

    move-result-object v12

    .line 1426
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 1427
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    move-result v14

    .line 1428
    const/4 v0, -0x1

    if-ne v14, v0, :cond_0

    .line 1429
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setGoalInfo() appType is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1430
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1431
    move-object/from16 v0, p3

    const/16 v1, 0x11

    invoke-static {v0, v1, v13}, Lo/cnn;->c(Lo/cla;ILjava/util/List;)V

    .line 1432
    return-void

    .line 1434
    :cond_0
    iget-object v0, p0, Lo/cnq;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/cnq$6;

    move-object v2, p0

    move-object/from16 v3, p2

    move/from16 v4, p1

    move-object v5, v13

    move-object/from16 v6, p3

    move-object v7, v12

    move-wide v8, v10

    invoke-direct/range {v1 .. v9}, Lo/cnq$6;-><init>(Lo/cnq;Ljava/util/List;ILjava/util/ArrayList;Lo/cla;Lo/crd;J)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1471
    return-void
.end method

.method public b(Lcom/huawei/hihealth/HiAuthorizationOption;Lo/clc;)V
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 222
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestAuthorization authorOption = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    const/4 v8, 0x1

    new-array v8, v8, [I

    fill-array-data v8, :array_0

    .line 224
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->a()Lo/crd;

    move-result-object v9

    .line 225
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cuz;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v10

    .line 226
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    move-result v11

    .line 227
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestAuthorization packageName = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    const-string v2, " appType = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    const/4 v0, -0x1

    if-ne v11, v0, :cond_0

    .line 229
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestAuthorization appType is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 230
    move-object/from16 v0, p2

    const/16 v1, 0x11

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/cnn;->b(Lo/clc;ILjava/util/List;)V

    .line 231
    return-void

    .line 233
    :cond_0
    if-nez v11, :cond_1

    .line 234
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestAuthorization do not need requestAuth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    move-object/from16 v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/cnn;->b(Lo/clc;ILjava/util/List;)V

    .line 236
    return-void

    .line 238
    :cond_1
    invoke-direct {p0, v10, v11}, Lo/cnq;->c(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 239
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestAuthorization appType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    invoke-static {}, Lo/cvc;->d()V

    .line 243
    :cond_2
    :try_start_0
    iget-object v0, p0, Lo/cnq;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/cnq$10;

    move-object v2, p0

    move v3, v11

    move-object v4, v10

    move-object v5, p1

    move-object v6, v8

    move-object v7, v9

    invoke-direct/range {v1 .. v7}, Lo/cnq$10;-><init>(Lo/cnq;ILjava/lang/String;Lcom/huawei/hihealth/HiAuthorizationOption;[ILo/crd;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 303
    const-wide/16 v2, 0x4e20

    invoke-interface {v0, v2, v3, v1}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 314
    const/4 v0, 0x0

    aget v0, v8, v0

    move-object/from16 v1, p2

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lo/cnn;->b(Lo/clc;ILjava/util/List;)V

    .line 315
    goto/16 :goto_0

    .line 304
    :catch_0
    move-exception v12

    .line 305
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestAuthorization TimeoutException = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v12}, Ljava/util/concurrent/TimeoutException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 306
    const/16 v0, 0x15

    const/4 v1, 0x0

    aput v0, v8, v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 314
    const/4 v0, 0x0

    aget v0, v8, v0

    move-object/from16 v1, p2

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lo/cnn;->b(Lo/clc;ILjava/util/List;)V

    .line 315
    goto :goto_0

    .line 307
    :catch_1
    move-exception v12

    .line 308
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestAuthorization InterruptedException = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v12}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    const/16 v0, 0x16

    const/4 v1, 0x0

    aput v0, v8, v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 314
    const/4 v0, 0x0

    aget v0, v8, v0

    move-object/from16 v1, p2

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lo/cnn;->b(Lo/clc;ILjava/util/List;)V

    .line 315
    goto :goto_0

    .line 310
    :catch_2
    move-exception v12

    .line 311
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestAuthorization ExecutionException = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v12}, Ljava/util/concurrent/ExecutionException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 312
    const/16 v0, 0x16

    const/4 v1, 0x0

    aput v0, v8, v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 314
    const/4 v0, 0x0

    aget v0, v8, v0

    move-object/from16 v1, p2

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lo/cnn;->b(Lo/clc;ILjava/util/List;)V

    .line 315
    goto :goto_0

    .line 314
    :catchall_0
    move-exception v13

    const/4 v0, 0x0

    aget v0, v8, v0

    move-object/from16 v1, p2

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lo/cnn;->b(Lo/clc;ILjava/util/List;)V

    .line 315
    throw v13

    .line 316
    :goto_0
    return-void

    :array_0
    .array-data 4
        0x0
    .end array-data
.end method

.method public b(Lcom/huawei/hihealth/HiDeviceInfo;Lcom/huawei/hihealth/HiUserInfo;Ljava/util/List;Lo/clk;)V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 959
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    move-result v8

    .line 960
    const/4 v0, -0x1

    if-ne v8, v0, :cond_0

    .line 961
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerDataClientWithUserInfo() appType is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 962
    const/4 v0, 0x0

    invoke-static {p4, v0}, Lo/cnn;->b(Lo/clk;Lcom/huawei/hihealth/HiHealthClient;)V

    .line 963
    return-void

    .line 965
    :cond_0
    invoke-static {p1}, Lo/cvj;->a(Lcom/huawei/hihealth/HiDeviceInfo;)Z

    move-result v9

    .line 966
    if-nez v9, :cond_1

    .line 967
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "device is invalid, deviceInfo="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 968
    const/4 v0, 0x0

    invoke-static {p4, v0}, Lo/cnn;->b(Lo/clk;Lcom/huawei/hihealth/HiHealthClient;)V

    .line 969
    return-void

    .line 971
    :cond_1
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->c()I

    move-result v10

    .line 972
    iget-object v0, p0, Lo/cnq;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/cnq$15;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move v6, v10

    move-object v7, p4

    invoke-direct/range {v1 .. v7}, Lo/cnq$15;-><init>(Lo/cnq;Lcom/huawei/hihealth/HiDeviceInfo;Lcom/huawei/hihealth/HiUserInfo;Ljava/util/List;ILo/clk;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 983
    return-void
.end method

.method public b(Ljava/util/List;Lo/cla;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1258
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1259
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    move-result v5

    .line 1260
    const/4 v0, -0x1

    if-ne v5, v0, :cond_0

    .line 1261
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkDataStatus() appType is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1262
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1263
    const/16 v0, 0x11

    invoke-static {p2, v0, v4}, Lo/cnn;->c(Lo/cla;ILjava/util/List;)V

    .line 1264
    return-void

    .line 1266
    :cond_0
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkDataStatus"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1267
    invoke-static {p1}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1268
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkDataStatus healthTypes is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1269
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1270
    const/4 v0, 0x7

    invoke-static {p2, v0, v4}, Lo/cnn;->c(Lo/cla;ILjava/util/List;)V

    .line 1271
    return-void

    .line 1274
    :cond_1
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v1}, Lo/cnw;->c()I

    move-result v1

    invoke-static {v0, v1}, Lo/cqf;->d(Landroid/content/Context;I)I

    move-result v6

    .line 1275
    if-gtz v6, :cond_2

    .line 1276
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkDataStatus error who is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1277
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1278
    const/4 v0, 0x2

    invoke-static {p2, v0, v4}, Lo/cnn;->c(Lo/cla;ILjava/util/List;)V

    .line 1279
    return-void

    .line 1281
    :cond_2
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0, v6, p1}, Lo/cui;->e(Landroid/content/Context;ILjava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1282
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1283
    const/4 v0, 0x0

    invoke-static {p2, v0, v4}, Lo/cnn;->a(Lo/cla;ILjava/util/List;)V

    goto :goto_0

    .line 1285
    :cond_3
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkDataStatus() fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1286
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1287
    const/4 v0, 0x0

    invoke-static {p2, v0, v4}, Lo/cnn;->c(Lo/cla;ILjava/util/List;)V

    .line 1289
    :goto_0
    return-void
.end method

.method public b(Lcom/huawei/hihealth/HiUserPreference;Z)Z
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1499
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    move-result v4

    .line 1500
    const/4 v0, -0x1

    if-ne v4, v0, :cond_0

    .line 1501
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserPreference() appType is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1502
    const/4 v0, 0x0

    return v0

    .line 1504
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 1505
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserPreference userPreference = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1506
    const/4 v0, 0x0

    return v0

    .line 1508
    :cond_1
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->a()Lo/crd;

    move-result-object v5

    .line 1509
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-virtual {v5}, Lo/crd;->d()I

    move-result v1

    invoke-static {v0, v1}, Lo/cqf;->d(Landroid/content/Context;I)I

    move-result v6

    .line 1510
    if-gtz v6, :cond_2

    .line 1511
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserPreference userID <= 0 appID = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lo/crd;->d()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1512
    const/4 v0, 0x0

    return v0

    .line 1515
    :cond_2
    invoke-virtual {p1, v6}, Lcom/huawei/hihealth/HiUserPreference;->setUserId(I)V

    .line 1516
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqp;->b(Landroid/content/Context;)Lo/cqp;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cqp;->d(Lcom/huawei/hihealth/HiUserPreference;)Z

    move-result v7

    .line 1517
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserPreference result = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1518
    if-eqz v7, :cond_3

    if-eqz p2, :cond_3

    .line 1519
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cnt;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 1520
    iget-object v0, p0, Lo/cnq;->d:Lo/cun;

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->getKey()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x66

    invoke-virtual {v0, v2, v1, v5}, Lo/cun;->d(ILjava/lang/String;Lo/crd;)V

    .line 1522
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    const/4 v1, 0x7

    invoke-static {v0, v1}, Lo/cnt;->c(Landroid/content/Context;I)V

    .line 1524
    :cond_3
    return v7
.end method

.method public c(I)Lcom/huawei/hihealth/HiHealthUnit;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1063
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    .line 1064
    const/4 v0, 0x0

    return-object v0
.end method

.method public c(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1529
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    move-result v4

    .line 1530
    const/4 v0, -0x1

    if-ne v4, v0, :cond_0

    .line 1531
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserPreference() appType is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1532
    const/4 v0, 0x0

    return-object v0

    .line 1534
    :cond_0
    invoke-static {p1}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1535
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserPreference key = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1536
    const/4 v0, 0x0

    return-object v0

    .line 1538
    :cond_1
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->c()I

    move-result v5

    .line 1539
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0, v5}, Lo/cqf;->d(Landroid/content/Context;I)I

    move-result v6

    .line 1540
    if-gtz v6, :cond_2

    .line 1541
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserPreference who <= 0 app = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1542
    const/4 v0, 0x0

    return-object v0

    .line 1545
    :cond_2
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqp;->b(Landroid/content/Context;)Lo/cqp;

    move-result-object v0

    invoke-virtual {v0, v6, p1}, Lo/cqp;->a(ILjava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v0

    return-object v0
.end method

.method public c()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1293
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    .line 1294
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "synCloudCancel"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1295
    return-void
.end method

.method public c(ILjava/lang/String;Lo/cli;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1044
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    move-result v4

    .line 1045
    const/4 v0, -0x1

    if-ne v4, v0, :cond_0

    .line 1046
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchDataClientByUniqueID() appType is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1047
    const/4 v0, 0x0

    invoke-static {p3, v0}, Lo/cnn;->e(Lo/cli;Ljava/util/List;)V

    .line 1048
    return-void

    .line 1050
    :cond_0
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchDataClientByUniqueID"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1051
    invoke-static {p2}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1052
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchDataClientByUniqueID uniqueID = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1053
    const/4 v0, 0x0

    invoke-static {p3, v0}, Lo/cnn;->e(Lo/cli;Ljava/util/List;)V

    .line 1054
    return-void

    .line 1056
    :cond_1
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/crb;->e(Landroid/content/Context;)Lo/crb;

    move-result-object v0

    iget-object v1, p0, Lo/cnq;->k:Lo/cnw;

    .line 1057
    invoke-virtual {v1}, Lo/cnw;->c()I

    move-result v1

    invoke-virtual {v0, p2, v1}, Lo/crb;->a(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v5

    .line 1058
    invoke-static {p3, v5}, Lo/cnn;->e(Lo/cli;Ljava/util/List;)V

    .line 1059
    return-void
.end method

.method public c(ILo/cln;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 335
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    .line 336
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchSupportedTypes"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 337
    return-void
.end method

.method public c(Lcom/huawei/hihealth/HiAggregateOption;Lo/clb;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 447
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 448
    const/4 v6, 0x0

    .line 449
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->h()I

    move-result v7

    .line 450
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->d()I

    move-result v8

    .line 451
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    move-result v9

    .line 452
    const/4 v0, -0x1

    if-ne v9, v0, :cond_0

    .line 453
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aggregateHiHealthData appType is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 454
    const/4 v0, 0x0

    const/16 v1, 0x11

    const/4 v2, 0x2

    invoke-static {p2, v0, v1, v2}, Lo/cnn;->b(Lo/clb;Ljava/util/List;II)V

    .line 456
    return-void

    .line 458
    :cond_0
    if-gtz v8, :cond_1

    .line 459
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aggregateHiHealthData() who <= 0 ,app = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 460
    const/16 v6, 0x18

    .line 461
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p2, v0, v6, v1}, Lo/cnn;->b(Lo/clb;Ljava/util/List;II)V

    .line 462
    return-void

    .line 464
    :cond_1
    const-string v0, "HiH_HiHealthBinder"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aggregateHiHealthData() checkAppType  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " appID = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " id = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " time= "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    .line 465
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    .line 464
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 466
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aggregateHiHealthData aggregateOption is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 467
    if-eqz v9, :cond_3

    .line 468
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0, v7}, Lo/cnw;->e(I)I

    move-result v6

    .line 469
    if-eqz v6, :cond_2

    .line 470
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p2, v0, v6, v1}, Lo/cnn;->b(Lo/clb;Ljava/util/List;II)V

    .line 471
    return-void

    .line 474
    :cond_2
    :try_start_0
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hihealthservice/auth/HiAuthManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hihealthservice/auth/HiAuthManager;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiAggregateOption;->getType()[I

    move-result-object v1

    invoke-virtual {v0, v7, v8, v1}, Lcom/huawei/hihealthservice/auth/HiAuthManager;->checkReadAuth(II[I)V
    :try_end_0
    .catch Lcom/huawei/hihealthservice/auth/HiAuthException; {:try_start_0 .. :try_end_0} :catch_0

    .line 481
    goto :goto_0

    .line 475
    :catch_0
    move-exception v10

    .line 476
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aggregateHiHealthData() HiAuthException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Lcom/huawei/hihealthservice/auth/HiAuthException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " appID = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " who = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 477
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 476
    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 478
    const/16 v6, 0x8

    .line 479
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p2, v0, v6, v1}, Lo/cnn;->b(Lo/clb;Ljava/util/List;II)V

    .line 480
    return-void

    .line 484
    :cond_3
    :goto_0
    :try_start_1
    new-instance v10, Lo/cvh;

    invoke-direct {v10}, Lo/cvh;-><init>()V

    .line 485
    invoke-virtual {v10, p1}, Lo/cvh;->e(Lcom/huawei/hihealth/HiAggregateOption;)V
    :try_end_1
    .catch Lo/cvo; {:try_start_1 .. :try_end_1} :catch_1

    .line 491
    goto :goto_1

    .line 486
    :catch_1
    move-exception v10

    .line 487
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aggregateHiHealthData() HiValidException = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Lo/cvo;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 488
    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x2

    invoke-static {p2, v0, v1, v2}, Lo/cnn;->b(Lo/clb;Ljava/util/List;II)V

    .line 490
    return-void

    .line 494
    :goto_1
    :try_start_2
    invoke-direct {p0, p1}, Lo/cnq;->d(Lcom/huawei/hihealth/HiAggregateOption;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 495
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/cnw;->c(J)V

    .line 496
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cuy;->c(Landroid/content/Context;)V

    .line 499
    :cond_4
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/crm;->e(Landroid/content/Context;)Lo/crm;

    move-result-object v0

    new-instance v1, Lo/crd;

    invoke-direct {v1, v7, v8}, Lo/crd;-><init>(II)V

    .line 500
    invoke-virtual {v0, v1, p1}, Lo/crm;->d(Lo/crd;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List;

    move-result-object v10

    .line 501
    invoke-static {v10, p2}, Lo/cnm;->e(Ljava/util/List;Lo/clb;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 506
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p2, v0, v6, v1}, Lo/cnn;->b(Lo/clb;Ljava/util/List;II)V

    .line 507
    goto :goto_2

    .line 502
    :catch_2
    move-exception v10

    .line 503
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aggregateHiHealthData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 504
    const/4 v6, 0x5

    .line 506
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p2, v0, v6, v1}, Lo/cnn;->b(Lo/clb;Ljava/util/List;II)V

    .line 507
    goto :goto_2

    .line 506
    :catchall_0
    move-exception v11

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p2, v0, v6, v1}, Lo/cnn;->b(Lo/clb;Ljava/util/List;II)V

    .line 507
    throw v11

    .line 508
    :goto_2
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aggregateHiHealthData() time = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", totalTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 510
    return-void
.end method

.method public c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/clh;)V
    .locals 20
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 618
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    .line 619
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->f()Lo/crd;

    move-result-object v13

    .line 620
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->i()I

    move-result v14

    .line 621
    const/4 v15, 0x1

    new-array v15, v15, [I

    fill-array-data v15, :array_0

    .line 622
    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    .line 623
    const/4 v0, 0x0

    invoke-static {v0}, Lo/clw;->b(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 624
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 625
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertOption is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 626
    const/4 v0, 0x7

    const/4 v1, 0x0

    aput v0, v15, v1

    .line 627
    const/4 v0, 0x0

    aget v0, v15, v0

    move-object/from16 v1, p2

    move-object/from16 v2, v16

    invoke-static {v1, v0, v2}, Lo/cnn;->a(Lo/clh;ILjava/util/List;)V

    .line 628
    return-void

    .line 630
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    move-result v17

    .line 631
    move/from16 v0, v17

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 632
    const/16 v0, 0x11

    const/4 v1, 0x0

    aput v0, v15, v1

    .line 633
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertHiHealthData() appType is invalid errorCode is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    aget v2, v15, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 634
    const/4 v0, 0x0

    aget v0, v15, v0

    move-object/from16 v1, p2

    move-object/from16 v2, v16

    invoke-static {v1, v0, v2}, Lo/cnn;->a(Lo/clh;ILjava/util/List;)V

    .line 635
    return-void

    .line 638
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiDataInsertOption;->getDatas()Ljava/util/List;

    move-result-object v18

    .line 639
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertHiHealthData() checkAppType  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " appID = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 640
    if-eqz v17, :cond_3

    .line 641
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0, v14}, Lo/cnw;->e(I)I

    move-result v0

    const/4 v1, 0x0

    aput v0, v15, v1

    .line 642
    const/4 v0, 0x0

    aget v0, v15, v0

    if-eqz v0, :cond_2

    .line 643
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertHiHealthData() errorCode is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    aget v2, v15, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 644
    const/4 v0, 0x0

    aget v0, v15, v0

    invoke-static {v0}, Lo/clw;->b(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 645
    const/4 v0, 0x0

    aget v0, v15, v0

    move-object/from16 v1, p2

    move-object/from16 v2, v16

    invoke-static {v1, v0, v2}, Lo/cnn;->a(Lo/clh;ILjava/util/List;)V

    .line 646
    return-void

    .line 649
    :cond_2
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hihealthservice/auth/HiAuthManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hihealthservice/auth/HiAuthManager;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cnq;->k:Lo/cnw;

    .line 650
    invoke-virtual {v1}, Lo/cnw;->d()I

    move-result v1

    move-object/from16 v2, v18

    invoke-virtual {v0, v14, v1, v2}, Lcom/huawei/hihealthservice/auth/HiAuthManager;->checkInsertAuth(IILjava/util/List;)V
    :try_end_0
    .catch Lcom/huawei/hihealthservice/auth/HiAuthException; {:try_start_0 .. :try_end_0} :catch_0

    .line 657
    goto :goto_0

    .line 651
    :catch_0
    move-exception v19

    .line 652
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertHiHealthData() HiAuthException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {v19 .. v19}, Lcom/huawei/hihealthservice/auth/HiAuthException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " appID = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 653
    const/16 v0, 0x8

    const/4 v1, 0x0

    aput v0, v15, v1

    .line 654
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    aget v1, v15, v1

    invoke-static {v1}, Lo/clw;->b(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {v19 .. v19}, Lcom/huawei/hihealthservice/auth/HiAuthException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 655
    const/4 v0, 0x0

    aget v0, v15, v0

    move-object/from16 v1, p2

    move-object/from16 v2, v16

    invoke-static {v1, v0, v2}, Lo/cnn;->a(Lo/clh;ILjava/util/List;)V

    .line 656
    return-void

    .line 660
    :cond_3
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cnq;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/cnq$14;

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, v16

    move-object/from16 v5, p2

    move-wide v6, v11

    move-object/from16 v8, v18

    move-object v9, v13

    move-object v10, v15

    invoke-direct/range {v1 .. v10}, Lo/cnq$14;-><init>(Lo/cnq;Lcom/huawei/hihealth/HiDataInsertOption;Ljava/util/ArrayList;Lo/clh;JLjava/util/List;Lo/crd;[I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 712
    return-void

    :array_0
    .array-data 4
        0x0
    .end array-data
.end method

.method public c(Lcom/huawei/hihealth/HiUserInfo;Lo/cla;)V
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1094
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    .line 1095
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->a()Lo/crd;

    move-result-object v11

    .line 1096
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 1097
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1098
    if-nez p1, :cond_0

    .line 1099
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userInfo is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1100
    move-object/from16 v0, p2

    const/16 v1, 0xe

    invoke-static {v0, v1, v12}, Lo/cnn;->c(Lo/cla;ILjava/util/List;)V

    .line 1101
    return-void

    .line 1103
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiUserInfo;->getUser()I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_1

    .line 1104
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserData userInfo(other):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 1105
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiUserInfo;->getUnitType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 1104
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1106
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserData caller:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1107
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v13

    .line 1108
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cnq;->i:Lo/cur;

    invoke-virtual {v13}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p2

    invoke-virtual {v0, v1, v2}, Lo/cur;->c(Ljava/lang/String;Lo/cla;)V

    .line 1109
    new-instance v14, Landroid/content/Intent;

    invoke-direct {v14}, Landroid/content/Intent;-><init>()V

    .line 1110
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cnq;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.huawei.hwuserprofilemgr.UserInfoModifyService"

    invoke-virtual {v14, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1111
    const-string v0, "modifyUserData"

    invoke-virtual {v14, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1112
    new-instance v15, Landroid/os/Bundle;

    invoke-direct {v15}, Landroid/os/Bundle;-><init>()V

    .line 1113
    const-string v0, "uuid"

    invoke-virtual {v13}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v15, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1114
    const-string v0, "userInfo"

    move-object/from16 v1, p1

    invoke-virtual {v15, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1115
    invoke-virtual {v14, v15}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 1116
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cnq;->c:Landroid/content/Context;

    invoke-virtual {v0, v14}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 1117
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v12, v1, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1118
    move-object/from16 v0, p2

    const/4 v1, 0x0

    invoke-static {v0, v1, v12}, Lo/cnn;->a(Lo/cla;ILjava/util/List;)V

    .line 1119
    return-void

    .line 1121
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiUserInfo;->getModifiedIntent()I

    move-result v0

    if-nez v0, :cond_2

    .line 1122
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error set ALL data to UserInfo,user:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiUserInfo;->getUser()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " modifiedIntent"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 1123
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiUserInfo;->getModifiedIntent()I

    move-result v2

    .line 1122
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1124
    move-object/from16 v0, p2

    const/16 v1, 0xe

    invoke-static {v0, v1, v12}, Lo/cnn;->c(Lo/cla;ILjava/util/List;)V

    .line 1125
    return-void

    .line 1127
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    move-result v13

    .line 1128
    const/4 v0, -0x1

    if-ne v13, v0, :cond_3

    .line 1129
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserData() appType is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1130
    move-object/from16 v0, p2

    const/16 v1, 0x11

    invoke-static {v0, v1, v12}, Lo/cnn;->c(Lo/cla;ILjava/util/List;)V

    .line 1131
    return-void

    .line 1133
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cnq;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/cnq$3;

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object v4, v11

    move-object v5, v12

    move-object/from16 v6, p2

    move-wide v7, v9

    invoke-direct/range {v1 .. v8}, Lo/cnq$3;-><init>(Lo/cnq;Lcom/huawei/hihealth/HiUserInfo;Lo/crd;Ljava/util/ArrayList;Lo/cla;J)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1155
    return-void
.end method

.method public c(Lo/cla;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1397
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 1398
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1399
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    move-result v7

    .line 1400
    const/4 v0, -0x1

    if-ne v7, v0, :cond_0

    .line 1401
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchAccountInfo() appType is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1402
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1403
    const/16 v0, 0x11

    invoke-static {p1, v0, v6}, Lo/cnn;->c(Lo/cla;ILjava/util/List;)V

    .line 1404
    return-void

    .line 1406
    :cond_0
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchAccountInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1407
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cnv;->c(Landroid/content/Context;)Lo/cnv;

    move-result-object v0

    iget-object v1, p0, Lo/cnq;->k:Lo/cnw;

    .line 1408
    invoke-virtual {v1}, Lo/cnw;->a()Lo/crd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cnv;->c(Lo/crd;)Lcom/huawei/hihealth/HiAccountInfo;

    move-result-object v8

    .line 1409
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    .line 1410
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 1411
    invoke-interface {v9, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1412
    const/4 v0, 0x0

    invoke-static {p1, v0, v9}, Lo/cnn;->a(Lo/cla;ILjava/util/List;)V

    .line 1413
    goto :goto_0

    .line 1414
    :cond_1
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchAccountInfo() fail "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1415
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1416
    const/16 v0, 0xf

    invoke-static {p1, v0, v6}, Lo/cnn;->c(Lo/cla;ILjava/util/List;)V

    .line 1418
    :goto_0
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchAccountInfo() end! totalTime is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1419
    return-void
.end method

.method public c(Lo/cli;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1015
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    move-result v4

    .line 1016
    const/4 v0, -0x1

    if-ne v4, v0, :cond_0

    .line 1017
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchPhoneDataClient() appType is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1018
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo/cnn;->e(Lo/cli;Ljava/util/List;)V

    .line 1019
    return-void

    .line 1021
    :cond_0
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchPhoneDataClient"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1022
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/crb;->e(Landroid/content/Context;)Lo/crb;

    move-result-object v0

    iget-object v1, p0, Lo/cnq;->c:Landroid/content/Context;

    .line 1023
    invoke-static {v1}, Lo/cne;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v2}, Lo/cnw;->c()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/crb;->a(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v5

    .line 1024
    invoke-static {p1, v5}, Lo/cnn;->e(Lo/cli;Ljava/util/List;)V

    .line 1025
    return-void
.end method

.method public d(Ljava/lang/String;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 917
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    .line 918
    const/4 v0, 0x0

    return v0
.end method

.method public d()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 215
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    .line 216
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unBindHiHealth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    return-void
.end method

.method public d(ILcom/huawei/hihealth/HiTimeInterval;Lo/cli;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1075
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    move-result v4

    .line 1076
    const/4 v0, -0x1

    if-ne v4, v0, :cond_0

    .line 1077
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchDataSourceByType() appType is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1078
    const/4 v0, 0x0

    invoke-static {p3, v0}, Lo/cnn;->e(Lo/cli;Ljava/util/List;)V

    .line 1079
    return-void

    .line 1081
    :cond_0
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchDataSourceByType type = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",timeInterval = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1082
    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 1083
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchDataSourceByType timeInterval is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1084
    const/4 v0, 0x0

    invoke-static {p3, v0}, Lo/cnn;->e(Lo/cli;Ljava/util/List;)V

    .line 1085
    return-void

    .line 1087
    :cond_1
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/crb;->e(Landroid/content/Context;)Lo/crb;

    move-result-object v0

    iget-object v1, p0, Lo/cnq;->k:Lo/cnw;

    .line 1088
    invoke-virtual {v1}, Lo/cnw;->c()I

    move-result v1

    invoke-virtual {v0, p1, p2, v1}, Lo/crb;->a(ILcom/huawei/hihealth/HiTimeInterval;I)Ljava/util/List;

    move-result-object v5

    .line 1089
    invoke-static {p3, v5}, Lo/cnn;->e(Lo/cli;Ljava/util/List;)V

    .line 1090
    return-void
.end method

.method public d(Lcom/huawei/hihealth/HiDataReadOption;Lo/clj;)V
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 801
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 802
    const/4 v6, 0x0

    .line 803
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 804
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readOption is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 805
    move-object/from16 v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x7

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cnn;->b(Lo/clj;Ljava/util/List;II)V

    .line 807
    return-void

    .line 809
    :cond_0
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->h()I

    move-result v7

    .line 810
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->d()I

    move-result v8

    .line 811
    if-gtz v8, :cond_1

    .line 812
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readHiHealthData() userID <= 0 ,appID = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 813
    move-object/from16 v0, p2

    const/4 v1, 0x0

    const/16 v2, 0x18

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cnn;->b(Lo/clj;Ljava/util/List;II)V

    .line 815
    return-void

    .line 817
    :cond_1
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    move-result v9

    .line 818
    const/4 v0, -0x1

    if-ne v9, v0, :cond_2

    .line 819
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readHiHealthData() appType is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 820
    move-object/from16 v0, p2

    const/4 v1, 0x0

    const/16 v2, 0x11

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cnn;->b(Lo/clj;Ljava/util/List;II)V

    .line 822
    return-void

    .line 824
    :cond_2
    const-string v0, "HiH_HiHealthBinder"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readHiHealthData() checkAppType  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " appID = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " id = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " time = "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    .line 825
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    .line 824
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 826
    if-eqz v9, :cond_4

    .line 827
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0, v7}, Lo/cnw;->e(I)I

    move-result v6

    .line 828
    if-eqz v6, :cond_3

    .line 829
    move-object/from16 v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v6, v2}, Lo/cnn;->b(Lo/clj;Ljava/util/List;II)V

    .line 830
    return-void

    .line 833
    :cond_3
    :try_start_0
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hihealthservice/auth/HiAuthManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hihealthservice/auth/HiAuthManager;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getType()[I

    move-result-object v1

    invoke-virtual {v0, v7, v8, v1}, Lcom/huawei/hihealthservice/auth/HiAuthManager;->checkReadAuth(II[I)V
    :try_end_0
    .catch Lcom/huawei/hihealthservice/auth/HiAuthException; {:try_start_0 .. :try_end_0} :catch_0

    .line 840
    goto :goto_0

    .line 834
    :catch_0
    move-exception v10

    .line 835
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readHiHealthData() HiAuthException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Lcom/huawei/hihealthservice/auth/HiAuthException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " appID = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " who = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 836
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 835
    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 837
    const/16 v6, 0x8

    .line 838
    move-object/from16 v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v6, v2}, Lo/cnn;->b(Lo/clj;Ljava/util/List;II)V

    .line 839
    return-void

    .line 842
    :cond_4
    :goto_0
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readHiHealthData() readOption = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 844
    :try_start_1
    new-instance v10, Lo/cvi;

    invoke-direct {v10}, Lo/cvi;-><init>()V

    .line 845
    invoke-virtual {v10, p1}, Lo/cvi;->b(Lcom/huawei/hihealth/HiDataReadOption;)V
    :try_end_1
    .catch Lo/cvo; {:try_start_1 .. :try_end_1} :catch_1

    .line 851
    goto :goto_1

    .line 846
    :catch_1
    move-exception v10

    .line 847
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readHiHealthData() HiValidException = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Lo/cvo;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 848
    move-object/from16 v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cnn;->b(Lo/clj;Ljava/util/List;II)V

    .line 850
    return-void

    .line 855
    :goto_1
    :try_start_2
    new-instance v10, Lo/crd;

    invoke-direct {v10, v7, v8}, Lo/crd;-><init>(II)V

    .line 856
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getAlignType()I

    move-result v11

    .line 857
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/crm;->e(Landroid/content/Context;)Lo/crm;

    move-result-object v12

    .line 858
    if-lez v11, :cond_5

    .line 859
    move-object/from16 v0, p2

    invoke-virtual {v12, v11, v10, p1, v0}, Lo/crm;->c(ILo/crd;Lcom/huawei/hihealth/HiDataReadOption;Lo/clj;)V

    goto :goto_2

    .line 861
    :cond_5
    move-object/from16 v0, p2

    invoke-virtual {v12, p1, v10, v0}, Lo/crm;->b(Lcom/huawei/hihealth/HiDataReadOption;Lo/crd;Lo/clj;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 867
    :goto_2
    move-object/from16 v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v6, v2}, Lo/cnn;->b(Lo/clj;Ljava/util/List;II)V

    .line 868
    goto :goto_3

    .line 863
    :catch_2
    move-exception v10

    .line 864
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readHiHealthData() e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 865
    const/4 v6, 0x5

    .line 867
    move-object/from16 v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v6, v2}, Lo/cnn;->b(Lo/clj;Ljava/util/List;II)V

    .line 868
    goto :goto_3

    .line 867
    :catchall_0
    move-exception v13

    move-object/from16 v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v6, v2}, Lo/cnn;->b(Lo/clj;Ljava/util/List;II)V

    .line 868
    throw v13

    .line 869
    :goto_3
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readHiHealthData() end time = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", totalTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 870
    return-void
.end method

.method public d(Lcom/huawei/hihealth/HiDataUpdateOption;Lo/clh;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 874
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 875
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    move-result v6

    .line 876
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 877
    const/4 v0, -0x1

    if-ne v6, v0, :cond_1

    .line 878
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateHiHealthData() appType is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 879
    if-eqz p2, :cond_0

    .line 880
    const/16 v0, 0x11

    invoke-static {v0}, Lo/clw;->b(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 881
    const/16 v0, 0x11

    invoke-interface {p2, v0, v7}, Lo/clh;->b(ILjava/util/List;)V

    .line 883
    :cond_0
    return-void

    .line 885
    :cond_1
    if-nez p1, :cond_3

    .line 886
    if-eqz p2, :cond_2

    .line 887
    const/16 v0, 0x12

    invoke-static {v0}, Lo/clw;->b(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 888
    const/16 v0, 0x12

    invoke-interface {p2, v0, v7}, Lo/clh;->b(ILjava/util/List;)V

    .line 890
    :cond_2
    return-void

    .line 892
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataUpdateOption;->getType()I

    move-result v8

    .line 893
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateHiHealthData() type is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 894
    const/16 v0, 0x65

    if-ne v8, v0, :cond_4

    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->k()Z

    move-result v0

    if-nez v0, :cond_4

    .line 895
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateHiHealthData() do default user login "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 896
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    iget-object v1, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v1}, Lo/cuz;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cnw;->d(Ljava/lang/String;)I

    .line 897
    if-eqz p2, :cond_4

    .line 898
    const/4 v0, 0x0

    invoke-static {v0}, Lo/clw;->b(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 899
    const/4 v0, 0x0

    invoke-interface {p2, v0, v7}, Lo/clh;->b(ILjava/util/List;)V

    .line 900
    return-void

    .line 903
    :cond_4
    invoke-static {v8}, Lo/cus;->b(I)Lo/cuu;

    move-result-object v9

    .line 904
    if-eqz v9, :cond_5

    .line 905
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-interface {v9, p1, p2, v0}, Lo/cuu;->b(Lcom/huawei/hihealth/HiDataUpdateOption;Lo/clh;Landroid/content/Context;)V

    .line 906
    return-void

    .line 908
    :cond_5
    if-eqz p2, :cond_6

    .line 909
    const/16 v0, 0x12

    invoke-static {v0}, Lo/clw;->b(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 910
    const/16 v0, 0x12

    invoke-interface {p2, v0, v7}, Lo/clh;->b(ILjava/util/List;)V

    .line 912
    :cond_6
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateHiHealthData() end totalTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 913
    return-void
.end method

.method public d(Ljava/util/List;Lo/cld;)V
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 531
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aggregateHiHealthDataEx() aggregateOptions = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 532
    const/4 v4, 0x0

    .line 533
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 534
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aggregateHiHealthDataEx() aggregateOptions = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 535
    const/4 v4, 0x7

    .line 536
    move-object/from16 v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v4, v2}, Lo/cnn;->c(Lo/cld;Ljava/util/List;II)V

    .line 537
    return-void

    .line 539
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->h()I

    move-result v5

    .line 541
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->d()I

    move-result v6

    .line 542
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    move-result v7

    .line 543
    const/4 v0, -0x1

    if-ne v7, v0, :cond_1

    .line 544
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aggregateHiHealthDataEx appType is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 545
    const/16 v4, 0x11

    .line 546
    move-object/from16 v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v4, v2}, Lo/cnn;->c(Lo/cld;Ljava/util/List;II)V

    .line 547
    return-void

    .line 549
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 550
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 552
    move-object/from16 v0, p1

    :try_start_0
    invoke-interface {v10, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 555
    goto :goto_0

    .line 553
    :catch_0
    move-exception v11

    .line 554
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aggregateHiHealthDataEx() ClassCastException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 556
    :goto_0
    if-gtz v6, :cond_2

    .line 557
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aggregateHiHealthDataEx() who <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 558
    const/16 v4, 0x18

    .line 559
    move-object/from16 v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v4, v2}, Lo/cnn;->c(Lo/cld;Ljava/util/List;II)V

    .line 560
    return-void

    .line 562
    :cond_2
    if-eqz v7, :cond_3

    .line 563
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0, v5}, Lo/cnw;->e(I)I

    move-result v4

    .line 564
    if-eqz v4, :cond_3

    .line 565
    move-object/from16 v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v4, v2}, Lo/cnn;->c(Lo/cld;Ljava/util/List;II)V

    .line 566
    return-void

    .line 570
    :cond_3
    :try_start_1
    new-instance v11, Lo/cvh;

    invoke-direct {v11}, Lo/cvh;-><init>()V

    .line 571
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/hihealth/HiAggregateOption;

    .line 572
    invoke-virtual {v11, v13}, Lo/cvh;->e(Lcom/huawei/hihealth/HiAggregateOption;)V
    :try_end_1
    .catch Lo/cvo; {:try_start_1 .. :try_end_1} :catch_1

    .line 573
    goto :goto_1

    .line 579
    :cond_4
    goto :goto_2

    .line 574
    :catch_1
    move-exception v11

    .line 575
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aggregateHiHealthDataEx() HiValidException = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Lo/cvo;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 576
    const/4 v4, 0x3

    .line 577
    move-object/from16 v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v4, v2}, Lo/cnn;->c(Lo/cld;Ljava/util/List;II)V

    .line 578
    return-void

    .line 581
    :goto_2
    :try_start_2
    new-instance v11, Lo/crd;

    invoke-direct {v11}, Lo/crd;-><init>()V

    .line 582
    invoke-virtual {v11, v6}, Lo/crd;->d(I)V

    .line 583
    invoke-virtual {v11, v5}, Lo/crd;->b(I)V

    .line 585
    const/4 v13, 0x0

    :goto_3
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    if-ge v13, v0, :cond_6

    .line 586
    invoke-interface {v10, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hihealth/HiAggregateOption;

    .line 587
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aggregateHiHealthDataEx() checkAppType  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " appID = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 588
    if-eqz v7, :cond_5

    .line 589
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hihealthservice/auth/HiAuthManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hihealthservice/auth/HiAuthManager;

    move-result-object v0

    invoke-virtual {v12}, Lcom/huawei/hihealth/HiAggregateOption;->getType()[I

    move-result-object v1

    invoke-virtual {v0, v5, v6, v1}, Lcom/huawei/hihealthservice/auth/HiAuthManager;->checkReadAuth(II[I)V

    .line 591
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/crm;->e(Landroid/content/Context;)Lo/crm;

    move-result-object v0

    .line 592
    invoke-virtual {v0, v11, v12}, Lo/crm;->d(Lo/crd;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List;

    move-result-object v14

    .line 593
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aggregateHiHealthDataEx() i = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",hihealthdatas = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v14, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 594
    move-object/from16 v0, p2

    invoke-static {v13, v14, v0}, Lo/cnm;->d(ILjava/util/List;Lo/cld;)V
    :try_end_2
    .catch Lcom/huawei/hihealthservice/auth/HiAuthException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 585
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_3

    .line 603
    :cond_6
    move-object/from16 v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v4, v2}, Lo/cnn;->c(Lo/cld;Ljava/util/List;II)V

    .line 604
    goto :goto_4

    .line 596
    :catch_2
    move-exception v11

    .line 597
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aggregateHiHealthDataEx() HiAuthException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Lcom/huawei/hihealthservice/auth/HiAuthException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 598
    const/16 v4, 0x8

    .line 603
    move-object/from16 v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v4, v2}, Lo/cnn;->c(Lo/cld;Ljava/util/List;II)V

    .line 604
    goto :goto_4

    .line 599
    :catch_3
    move-exception v11

    .line 600
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aggregateHiHealthDataEx()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 601
    const/4 v4, 0x5

    .line 603
    move-object/from16 v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v4, v2}, Lo/cnn;->c(Lo/cld;Ljava/util/List;II)V

    .line 604
    goto :goto_4

    .line 603
    :catchall_0
    move-exception v15

    move-object/from16 v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v4, v2}, Lo/cnn;->c(Lo/cld;Ljava/util/List;II)V

    .line 604
    throw v15

    .line 605
    :goto_4
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aggregateHiHealthDataEx() end totalTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v8

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 606
    return-void
.end method

.method public d(Ljava/util/List;Lo/clo;)V
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 342
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->h()I

    move-result v8

    .line 343
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->d()I

    move-result v9

    .line 344
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    move-result v10

    .line 345
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 346
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 347
    const/4 v0, -0x1

    if-ne v10, v0, :cond_0

    .line 348
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "subscribeHiHealthData appType is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 349
    const/16 v0, 0x11

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 350
    move-object/from16 v0, p2

    const/4 v1, 0x0

    invoke-static {v0, v1, v11}, Lo/cnn;->c(Lo/clo;Ljava/util/List;Ljava/util/List;)V

    .line 351
    return-void

    .line 353
    :cond_0
    if-gtz v9, :cond_1

    .line 354
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "subscribeHiHealthData() who <= 0 ,app = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 355
    move-object/from16 v0, p2

    invoke-static {v0, v11, v12}, Lo/cnn;->c(Lo/clo;Ljava/util/List;Ljava/util/List;)V

    .line 356
    return-void

    .line 358
    :cond_1
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "subscribeHiHealthData() checkAppType  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " appID = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 359
    if-eqz v10, :cond_3

    .line 360
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0, v8}, Lo/cnw;->e(I)I

    move-result v7

    .line 361
    if-eqz v7, :cond_2

    .line 362
    move-object/from16 v0, p2

    invoke-static {v0, v11, v12}, Lo/cnn;->c(Lo/clo;Ljava/util/List;Ljava/util/List;)V

    .line 363
    return-void

    .line 366
    :cond_2
    :try_start_0
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hihealthservice/auth/HiAuthManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hihealthservice/auth/HiAuthManager;

    move-result-object v0

    iget-object v1, p0, Lo/cnq;->k:Lo/cnw;

    .line 367
    invoke-virtual {v1, p1}, Lo/cnw;->b(Ljava/util/List;)[I

    move-result-object v1

    invoke-virtual {v0, v8, v9, v1}, Lcom/huawei/hihealthservice/auth/HiAuthManager;->checkReadAuth(II[I)V
    :try_end_0
    .catch Lcom/huawei/hihealthservice/auth/HiAuthException; {:try_start_0 .. :try_end_0} :catch_0

    .line 373
    goto :goto_0

    .line 368
    :catch_0
    move-exception v13

    .line 369
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "subscribeHiHealthData() HiAuthException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v13}, Lcom/huawei/hihealthservice/auth/HiAuthException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " appID = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " who = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 370
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 369
    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 371
    move-object/from16 v0, p2

    invoke-static {v0, v11, v12}, Lo/cnn;->c(Lo/clo;Ljava/util/List;Ljava/util/List;)V

    .line 372
    return-void

    .line 375
    :cond_3
    :goto_0
    iget-object v0, p0, Lo/cnq;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/cnq$9;

    move-object v2, p0

    move-object v3, p1

    move-object/from16 v4, p2

    move-object v5, v12

    move-object v6, v11

    invoke-direct/range {v1 .. v6}, Lo/cnq$9;-><init>(Lo/cnq;Ljava/util/List;Lo/clo;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 398
    return-void
.end method

.method public d(Lo/cla;)V
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1159
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 1160
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchUserData start! time is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1163
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1164
    const/4 v0, 0x0

    invoke-static {v0}, Lo/clw;->b(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1166
    :try_start_0
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->h()I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v7

    .line 1172
    goto :goto_0

    .line 1167
    :catch_0
    move-exception v9

    .line 1168
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchUserData() getappid exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1169
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v8, v1, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1170
    const/16 v0, 0xb

    invoke-static {p1, v0, v8}, Lo/cnn;->c(Lo/cla;ILjava/util/List;)V

    .line 1171
    return-void

    .line 1173
    :goto_0
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->d()I

    move-result v9

    .line 1174
    const/4 v10, 0x1

    new-array v10, v10, [I

    fill-array-data v10, :array_0

    .line 1175
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    move-result v11

    .line 1176
    const/4 v0, -0x1

    if-ne v11, v0, :cond_0

    .line 1177
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchUserData() appType is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1178
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v8, v1, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1179
    const/16 v0, 0x11

    invoke-static {p1, v0, v8}, Lo/cnn;->c(Lo/cla;ILjava/util/List;)V

    .line 1180
    return-void

    .line 1182
    :cond_0
    if-gtz v9, :cond_1

    .line 1183
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchUserData() userID <= 0 ,appID = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1184
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v8, v1, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1185
    const/16 v0, 0x18

    invoke-static {p1, v0, v8}, Lo/cnn;->c(Lo/cla;ILjava/util/List;)V

    .line 1186
    return-void

    .line 1188
    :cond_1
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchUserData() checkAppType  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " appID = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1189
    if-eqz v11, :cond_3

    .line 1190
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0, v7}, Lo/cnw;->e(I)I

    move-result v6

    .line 1191
    if-eqz v6, :cond_2

    .line 1192
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v8, v1, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1193
    invoke-static {p1, v6, v8}, Lo/cnn;->c(Lo/cla;ILjava/util/List;)V

    .line 1194
    return-void

    .line 1197
    :cond_2
    :try_start_1
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hihealthservice/auth/HiAuthManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hihealthservice/auth/HiAuthManager;

    move-result-object v0

    invoke-virtual {v0, v7, v9, v10}, Lcom/huawei/hihealthservice/auth/HiAuthManager;->checkReadAuth(II[I)V
    :try_end_1
    .catch Lcom/huawei/hihealthservice/auth/HiAuthException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1205
    goto :goto_1

    .line 1198
    :catch_1
    move-exception v12

    .line 1199
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchUserData() HiAuthException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v12}, Lcom/huawei/hihealthservice/auth/HiAuthException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " appID = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " who = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 1200
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 1199
    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1201
    const/16 v6, 0x8

    .line 1202
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v8, v1, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1203
    invoke-static {p1, v6, v8}, Lo/cnn;->c(Lo/cla;ILjava/util/List;)V

    .line 1204
    return-void

    .line 1208
    :cond_3
    :goto_1
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cnv;->c(Landroid/content/Context;)Lo/cnv;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/cnv;->b(I)Ljava/util/List;

    move-result-object v12

    .line 1209
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchUserData userInfos = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v12, v1, v2

    const-string v2, ",app = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1210
    const/4 v0, 0x0

    if-eq v0, v12, :cond_4

    .line 1211
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetch userInfo1):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-interface {v12, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiUserInfo;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-interface {v12, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiUserInfo;->getBirthday()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 1212
    const/4 v2, 0x0

    invoke-interface {v12, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiUserInfo;->getGender()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 1211
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1213
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetch userInfo2):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-interface {v12, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-interface {v12, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 1214
    const/4 v2, 0x0

    invoke-interface {v12, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiUserInfo;->getUnitType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 1213
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1215
    const/4 v0, 0x0

    invoke-static {p1, v0, v12}, Lo/cnn;->a(Lo/cla;ILjava/util/List;)V

    goto :goto_2

    .line 1217
    :cond_4
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchUserData() fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1218
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 1219
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1220
    const/16 v0, 0xe

    invoke-static {p1, v0, v13}, Lo/cnn;->c(Lo/cla;ILjava/util/List;)V

    .line 1222
    :goto_2
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchUserData end! cost time is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1223
    return-void

    nop

    :array_0
    .array-data 4
        -0x1
    .end array-data
.end method

.method public d(Lo/clf;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1584
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readDeviceInfo enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1585
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cpu;->b(Landroid/content/Context;)Lo/cpu;

    move-result-object v0

    iget-object v1, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cpu;->a(Ljava/lang/String;)I

    move-result v4

    .line 1586
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cpr;->b(Landroid/content/Context;)Lo/cpr;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/cpr;->b(I)Ljava/lang/String;

    move-result-object v5

    .line 1587
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqs;->b(Landroid/content/Context;)Lo/cqs;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v5, v1}, Lo/cqs;->e(Ljava/lang/String;I)I

    move-result v6

    .line 1588
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/cpw;->h(I)Ljava/util/List;

    move-result-object v7

    .line 1589
    invoke-static {v7}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1590
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAllHealthClientList() deviceIDs is null who = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1592
    :cond_0
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqa;->a(Landroid/content/Context;)Lo/cqa;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/cqa;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    .line 1593
    if-eqz v8, :cond_1

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1594
    :cond_1
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAllHealthClientList() deviceInfos is null devices = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1596
    :cond_2
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readDeviceInfo deviceInfos = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1597
    invoke-interface {p1, v8}, Lo/clf;->d(Ljava/util/List;)V

    .line 1598
    return-void
.end method

.method public e()I
    .locals 4

    .line 1560
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHiHealthVersionCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const v2, 0x1312d01

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1561
    const v0, 0x1312d01

    return v0
.end method

.method public e(IILo/cla;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1475
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 1476
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1477
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    move-result v7

    .line 1478
    const/4 v0, -0x1

    if-ne v7, v0, :cond_0

    .line 1479
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchGoalInfo() appType is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1480
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1481
    const/16 v0, 0x11

    invoke-static {p3, v0, v6}, Lo/cnn;->c(Lo/cla;ILjava/util/List;)V

    .line 1482
    return-void

    .line 1484
    :cond_0
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchGoalInfo who = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1485
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cnv;->c(Landroid/content/Context;)Lo/cnv;

    move-result-object v0

    iget-object v1, p0, Lo/cnq;->k:Lo/cnw;

    .line 1486
    invoke-virtual {v1}, Lo/cnw;->c()I

    move-result v1

    invoke-virtual {v0, p1, p2, v1}, Lo/cnv;->e(III)Ljava/util/List;

    move-result-object v8

    .line 1487
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    .line 1488
    const/4 v0, 0x0

    invoke-static {p3, v0, v8}, Lo/cnn;->a(Lo/cla;ILjava/util/List;)V

    goto :goto_0

    .line 1490
    :cond_1
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchGoalInfo() fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1491
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1492
    const/16 v0, 0x10

    invoke-static {p3, v0, v6}, Lo/cnn;->c(Lo/cla;ILjava/util/List;)V

    .line 1494
    :goto_0
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " fetchGoalInfo() end! totalTime is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1495
    return-void
.end method

.method public e(ILo/cli;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1029
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    move-result v4

    .line 1030
    const/4 v0, -0x1

    if-ne v4, v0, :cond_0

    .line 1031
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchRegisteredDataClient() appType is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1032
    const/4 v0, 0x0

    invoke-static {p2, v0}, Lo/cnn;->e(Lo/cli;Ljava/util/List;)V

    .line 1033
    return-void

    .line 1035
    :cond_0
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchRegisteredDataClient"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1036
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/crb;->e(Landroid/content/Context;)Lo/crb;

    move-result-object v0

    iget-object v1, p0, Lo/cnq;->k:Lo/cnw;

    .line 1037
    invoke-virtual {v1}, Lo/cnw;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/crb;->b(I)Ljava/util/List;

    move-result-object v5

    .line 1038
    invoke-static {p2, v5}, Lo/cnn;->e(Lo/cli;Ljava/util/List;)V

    .line 1039
    return-void
.end method

.method public e(Lcom/huawei/hihealth/HiAccountInfo;Lo/cla;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1299
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->a()Lo/crd;

    move-result-object v8

    .line 1300
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->l()Z

    move-result v9

    .line 1301
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 1302
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    move-result v11

    .line 1303
    const/4 v0, -0x1

    if-ne v11, v0, :cond_0

    .line 1304
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiLogin() appType is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1305
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1306
    const/16 v0, 0x11

    invoke-static {p2, v0, v10}, Lo/cnn;->c(Lo/cla;ILjava/util/List;)V

    .line 1307
    return-void

    .line 1309
    :cond_0
    iget-object v0, p0, Lo/cnq;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/cnq$4;

    move-object v2, p0

    move-object v3, p1

    move-object v4, v8

    move-object v5, v10

    move-object v6, p2

    move v7, v9

    invoke-direct/range {v1 .. v7}, Lo/cnq$4;-><init>(Lo/cnq;Lcom/huawei/hihealth/HiAccountInfo;Lo/crd;Ljava/util/ArrayList;Lo/cla;Z)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1360
    return-void
.end method

.method public e(Lcom/huawei/hihealth/HiDataDeleteOption;Lo/clh;)V
    .locals 20
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 724
    const/4 v11, 0x1

    new-array v11, v11, [I

    fill-array-data v11, :array_0

    .line 725
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 726
    const/4 v0, 0x0

    invoke-static {v0}, Lo/clw;->b(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 727
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 728
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteOption is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 729
    const/4 v0, 0x7

    const/4 v1, 0x0

    aput v0, v11, v1

    .line 730
    const/4 v0, 0x0

    aget v0, v11, v0

    move-object/from16 v1, p2

    invoke-static {v1, v0, v12}, Lo/cnn;->a(Lo/clh;ILjava/util/List;)V

    .line 731
    return-void

    .line 733
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    .line 734
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->a()Lo/crd;

    move-result-object v15

    .line 735
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->h()I

    move-result v16

    .line 736
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    move-result v17

    .line 737
    move/from16 v0, v17

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 738
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteHiHealthData() appType is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 739
    const/16 v0, 0x11

    const/4 v1, 0x0

    aput v0, v11, v1

    .line 740
    const/4 v0, 0x0

    aget v0, v11, v0

    move-object/from16 v1, p2

    invoke-static {v1, v0, v12}, Lo/cnn;->a(Lo/clh;ILjava/util/List;)V

    .line 741
    return-void

    .line 743
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiDataDeleteOption;->getTypes()[I

    move-result-object v18

    .line 744
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteHiHealthData() checkAppType  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " appID = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 745
    if-eqz v17, :cond_3

    .line 746
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cnq;->k:Lo/cnw;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Lo/cnw;->e(I)I

    move-result v0

    const/4 v1, 0x0

    aput v0, v11, v1

    .line 747
    const/4 v0, 0x0

    aget v0, v11, v0

    if-eqz v0, :cond_2

    .line 748
    const/4 v0, 0x0

    aget v0, v11, v0

    move-object/from16 v1, p2

    invoke-static {v1, v0, v12}, Lo/cnn;->a(Lo/clh;ILjava/util/List;)V

    .line 749
    return-void

    .line 752
    :cond_2
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hihealthservice/auth/HiAuthManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hihealthservice/auth/HiAuthManager;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cnq;->k:Lo/cnw;

    .line 753
    invoke-virtual {v1}, Lo/cnw;->d()I

    move-result v1

    move/from16 v2, v16

    move-object/from16 v3, v18

    invoke-virtual {v0, v2, v1, v3}, Lcom/huawei/hihealthservice/auth/HiAuthManager;->checkDeleteAuth(II[I)V
    :try_end_0
    .catch Lcom/huawei/hihealthservice/auth/HiAuthException; {:try_start_0 .. :try_end_0} :catch_0

    .line 758
    goto :goto_0

    .line 754
    :catch_0
    move-exception v19

    .line 755
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteHiHealthData() HiAuthException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {v19 .. v19}, Lcom/huawei/hihealthservice/auth/HiAuthException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 756
    const/16 v0, 0x8

    const/4 v1, 0x0

    aput v0, v11, v1

    .line 757
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    aget v1, v11, v1

    invoke-static {v1}, Lo/clw;->b(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {v19 .. v19}, Lcom/huawei/hihealthservice/auth/HiAuthException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 760
    :cond_3
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cnq;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/cnq$13;

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object v4, v11

    move/from16 v5, v16

    move-object v6, v12

    move-object v7, v15

    move-object/from16 v8, p2

    move-wide v9, v13

    invoke-direct/range {v1 .. v10}, Lo/cnq$13;-><init>(Lo/cnq;Lcom/huawei/hihealth/HiDataDeleteOption;[IILjava/util/ArrayList;Lo/crd;Lo/clh;J)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 790
    return-void

    nop

    :array_0
    .array-data 4
        0x0
    .end array-data
.end method

.method public e(Lcom/huawei/hihealth/HiSyncOption;Lo/cla;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1227
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    const-string v1, "com.huawei.health"

    invoke-virtual {v0, v1}, Lo/cnw;->b(Ljava/lang/String;)I

    move-result v7

    .line 1228
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1229
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    move-result v9

    .line 1230
    const/4 v0, -0x1

    if-ne v9, v0, :cond_0

    .line 1231
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "synCloud() appType is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1232
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1233
    const/16 v0, 0x11

    invoke-static {p2, v0, v8}, Lo/cnn;->c(Lo/cla;ILjava/util/List;)V

    .line 1234
    return-void

    .line 1236
    :cond_0
    const-string v0, "com.huawei.health"

    iget-object v1, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v1}, Lo/cuz;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    .line 1237
    const-string v0, "com.huawei.bone"

    iget-object v1, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v1}, Lo/cuz;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    .line 1238
    iget-object v0, p0, Lo/cnq;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/cnq$5;

    move-object v2, p0

    move v3, v10

    move v4, v11

    move-object v5, p1

    move v6, v7

    invoke-direct/range {v1 .. v6}, Lo/cnq$5;-><init>(Lo/cnq;ZZLcom/huawei/hihealth/HiSyncOption;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1254
    return-void
.end method

.method public e(Lo/cla;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1364
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->a()Lo/crd;

    move-result-object v4

    .line 1365
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1366
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    move-result v6

    .line 1367
    const/4 v0, -0x1

    if-ne v6, v0, :cond_0

    .line 1368
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiLogout() appType is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1369
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1370
    const/16 v0, 0x11

    invoke-static {p1, v0, v5}, Lo/cnn;->c(Lo/cla;ILjava/util/List;)V

    .line 1371
    return-void

    .line 1373
    :cond_0
    iget-object v0, p0, Lo/cnq;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/cnq$2;

    invoke-direct {v1, p0, v4, v5, p1}, Lo/cnq$2;-><init>(Lo/cnq;Lo/crd;Ljava/util/ArrayList;Lo/cla;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1393
    return-void
.end method

.method public e(Lo/cli;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1001
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    move-result v4

    .line 1002
    const/4 v0, -0x1

    if-ne v4, v0, :cond_0

    .line 1003
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchManualDataClient() appType is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1004
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo/cnn;->e(Lo/cli;Ljava/util/List;)V

    .line 1005
    return-void

    .line 1007
    :cond_0
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchManualDataClient"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1008
    iget-object v0, p0, Lo/cnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/crb;->e(Landroid/content/Context;)Lo/crb;

    move-result-object v0

    const-string v1, "-1"

    iget-object v2, p0, Lo/cnq;->k:Lo/cnw;

    .line 1009
    invoke-virtual {v2}, Lo/cnw;->c()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/crb;->a(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v5

    .line 1010
    invoke-static {p1, v5}, Lo/cnn;->e(Lo/cli;Ljava/util/List;)V

    .line 1011
    return-void
.end method

.method public e(IILcom/huawei/hihealth/HiSubscribeTrigger;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 402
    iget-object v0, p0, Lo/cnq;->k:Lo/cnw;

    invoke-virtual {v0}, Lo/cnw;->g()I

    move-result v4

    .line 403
    const/4 v0, -0x1

    if-ne v4, v0, :cond_0

    .line 404
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addExternalSubscribeTrigger appType is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 405
    const/4 v0, 0x0

    return v0

    .line 407
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
