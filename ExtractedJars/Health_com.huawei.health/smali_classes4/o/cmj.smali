.class public Lo/cmj;
.super Lo/cmp;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cmj$a;,
        Lo/cmj$e;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Landroid/content/Context;

.field private c:Ljava/lang/Object;

.field d:Landroid/content/ServiceConnection;

.field e:Landroid/content/ServiceConnection;

.field private f:Lo/abf;

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/cmj$a;>;"
        }
    .end annotation
.end field

.field private h:Lo/dle;

.field private i:Lo/cmo;

.field private k:Landroid/os/HandlerThread;

.field private l:Lo/cmj$e;

.field private m:Lo/cnc;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 32
    invoke-direct {p0}, Lo/cmp;-><init>()V

    .line 56
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/cmj;->c:Ljava/lang/Object;

    .line 57
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cmj;->b:Landroid/content/Context;

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cmj;->a:Ljava/lang/String;

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cmj;->f:Lo/abf;

    .line 62
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cmj;->h:Lo/dle;

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cmj;->i:Lo/cmo;

    .line 66
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cmj;->g:Ljava/util/List;

    .line 68
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cmj;->k:Landroid/os/HandlerThread;

    .line 69
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cmj;->l:Lo/cmj$e;

    .line 72
    new-instance v0, Lo/cnb;

    invoke-direct {v0}, Lo/cnb;-><init>()V

    iput-object v0, p0, Lo/cmj;->m:Lo/cnc;

    .line 487
    new-instance v0, Lo/cmj$2;

    invoke-direct {v0, p0}, Lo/cmj$2;-><init>(Lo/cmj;)V

    iput-object v0, p0, Lo/cmj;->e:Landroid/content/ServiceConnection;

    .line 510
    new-instance v0, Lo/cmj$4;

    invoke-direct {v0, p0}, Lo/cmj$4;-><init>(Lo/cmj;)V

    iput-object v0, p0, Lo/cmj;->d:Landroid/content/ServiceConnection;

    return-void
.end method

.method static synthetic a(Lo/cmj;)Ljava/util/List;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/cmj;->g:Ljava/util/List;

    return-object v0
.end method

.method static synthetic a(Lo/cmj;Lo/abf;)Lo/abf;
    .locals 0

    .line 32
    iput-object p1, p0, Lo/cmj;->f:Lo/abf;

    return-object p1
.end method

.method static synthetic b(Lo/cmj;)Lo/abf;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/cmj;->f:Lo/abf;

    return-object v0
.end method

.method private b(ILo/cmj$a;)V
    .locals 6

    .line 596
    const/4 v4, 0x0

    :goto_0
    if-ge v4, p1, :cond_2

    .line 598
    invoke-direct {p0, p2}, Lo/cmj;->b(Lo/cmj$a;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 601
    const-string v0, "HealthOpenSDK"

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Try register sleep:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 602
    const-wide/16 v0, 0x32

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 605
    goto :goto_1

    .line 603
    :catch_0
    move-exception v5

    .line 604
    const-string v0, "HealthOpenSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "tryToRegisterTrack : RemoteEx"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 605
    goto :goto_1

    .line 609
    :cond_0
    if-eqz p2, :cond_1

    .line 610
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lo/cmj$a;->a(Z)V

    .line 613
    :cond_1
    return-void

    .line 596
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 618
    :cond_2
    if-eqz p2, :cond_3

    .line 619
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lo/cmj$a;->a(Z)V

    .line 621
    :cond_3
    return-void
.end method

.method private b(Lo/cmj$a;)Z
    .locals 5

    .line 160
    move-object v4, p1

    .line 161
    const-string v0, "HealthOpenSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "registerTrackingReportInter:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " at:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 162
    iget-object v0, p0, Lo/cmj;->l:Lo/cmj$e;

    if-nez v0, :cond_0

    .line 163
    const/4 v0, 0x0

    return v0

    .line 165
    :cond_0
    iget-object v0, p0, Lo/cmj;->l:Lo/cmj$e;

    new-instance v1, Lo/cmj$1;

    invoke-direct {v1, p0, v4}, Lo/cmj$1;-><init>(Lo/cmj;Lo/cmj$a;)V

    invoke-virtual {v0, v1}, Lo/cmj$e;->post(Ljava/lang/Runnable;)Z

    .line 180
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic c(Lo/cmj;)Ljava/lang/Object;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/cmj;->c:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic d(Lo/cmj;Lo/dle;)Lo/dle;
    .locals 0

    .line 32
    iput-object p1, p0, Lo/cmj;->h:Lo/dle;

    return-object p1
.end method

.method static synthetic d(Lo/cmj;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lo/cmj;->f()V

    return-void
.end method

.method static synthetic e(Lo/cmj;)Lo/cmo;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/cmj;->i:Lo/cmo;

    return-object v0
.end method

.method static synthetic e(Lo/cmj;ILo/cmj$a;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1, p2}, Lo/cmj;->b(ILo/cmj$a;)V

    return-void
.end method

.method private f()V
    .locals 4

    .line 674
    iget-object v0, p0, Lo/cmj;->g:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 675
    iget-object v2, p0, Lo/cmj;->g:Ljava/util/List;

    monitor-enter v2

    .line 676
    const-string v0, "HealthOpenSDK"

    const-string v1, "cleanTrackProxyList"

    :try_start_0
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 677
    iget-object v0, p0, Lo/cmj;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 678
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 680
    :cond_0
    :goto_0
    return-void
.end method

.method private h()Z
    .locals 6

    .line 478
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 479
    const-string v0, "com.huawei.healthcloud.plugintrack.trackSdk.TrackService"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 480
    const-string v0, "com.huawei.health"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 482
    iget-object v0, p0, Lo/cmj;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/cmj;->d:Landroid/content/ServiceConnection;

    const/4 v2, 0x0

    invoke-virtual {v0, v5, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v4

    .line 483
    const-string v0, "HealthOpenSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Bind Track Service at "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 484
    return v4
.end method

.method static synthetic i(Lo/cmj;)Z
    .locals 1

    .line 32
    invoke-direct {p0}, Lo/cmj;->h()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 373
    iget-object v0, p0, Lo/cmj;->m:Lo/cnc;

    invoke-interface {v0}, Lo/cnc;->k()I

    move-result v0

    return v0
.end method

.method public a(Landroid/content/Context;Lo/cmo;Ljava/lang/String;)I
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 79
    const-string v0, "HealthOpenSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "deprecated initSDK : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", ver:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lo/cmj;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", this:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 81
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 82
    :cond_0
    const-string v0, "HealthOpenSDK"

    const-string v1, "deprecated initSDK :context == null || cb == null"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 83
    const/4 v0, -0x2

    return v0

    .line 86
    :cond_1
    iget-object v0, p0, Lo/cmj;->k:Landroid/os/HandlerThread;

    if-eqz v0, :cond_2

    .line 87
    const-string v0, "HealthOpenSDK"

    const-string v1, "deprecated initSDK :mWorkingThread != null"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    const/4 v0, -0x3

    return v0

    .line 91
    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/cmj;->b:Landroid/content/Context;

    .line 92
    iput-object p3, p0, Lo/cmj;->a:Ljava/lang/String;

    .line 94
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "health_sdk"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/cmj;->k:Landroid/os/HandlerThread;

    .line 95
    iget-object v0, p0, Lo/cmj;->k:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 96
    new-instance v0, Lo/cmj$e;

    iget-object v1, p0, Lo/cmj;->k:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/cmj$e;-><init>(Lo/cmj;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/cmj;->l:Lo/cmj$e;

    .line 99
    const-string v0, "hwstepcounter"

    invoke-virtual {p0, v0, p2}, Lo/cmj;->a(Ljava/lang/String;Lo/cmo;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cnc;

    iput-object v0, p0, Lo/cmj;->m:Lo/cnc;

    .line 100
    const-string v0, "HealthOpenSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "deprecated initSDK iHwStepCounter = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/cmj;->m:Lo/cnc;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 101
    const/4 v0, 0x0

    return v0
.end method

.method public a(Ljava/lang/String;Lo/cmo;)Ljava/lang/Object;
    .locals 6

    .line 702
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 703
    const-string v0, "HealthOpenSDK"

    const-string v1, "getOpenSDKService: cb is null"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 704
    const/4 v0, 0x0

    return-object v0

    .line 706
    :cond_0
    iput-object p2, p0, Lo/cmj;->i:Lo/cmo;

    .line 707
    const-string v0, "HealthOpenSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getOpenSDKService cb = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", name = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 708
    iget-object v0, p0, Lo/cmj;->b:Landroid/content/Context;

    invoke-static {v0, p1, p0}, Lo/cmv;->a(Landroid/content/Context;Ljava/lang/String;Lo/cmj;)Ljava/lang/Object;

    move-result-object v3

    .line 709
    const-string v0, "HealthOpenSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getOpenSDKService result = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 710
    if-eqz v3, :cond_1

    .line 711
    move-object v4, v3

    check-cast v4, Lo/cmr;

    .line 712
    invoke-interface {v4}, Lo/cmr;->d()Z

    move-result v5

    .line 713
    const-string v0, "HealthOpenSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getOpenSDKService: isServiceReady = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 714
    if-eqz v5, :cond_1

    .line 715
    iget-object v0, p0, Lo/cmj;->l:Lo/cmj$e;

    new-instance v1, Lo/cmj$3;

    invoke-direct {v1, p0}, Lo/cmj$3;-><init>(Lo/cmj;)V

    invoke-virtual {v0, v1}, Lo/cmj$e;->post(Ljava/lang/Runnable;)Z

    .line 723
    :cond_1
    return-object v3
.end method

.method public a(Ljava/lang/Object;)V
    .locals 2

    .line 734
    const-string v0, "HealthOpenSDK"

    const-string v1, "notifyServiceReady"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 735
    iget-object v0, p0, Lo/cmj;->i:Lo/cmo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 736
    iget-object v0, p0, Lo/cmj;->i:Lo/cmo;

    invoke-interface {v0, p1}, Lo/cmo;->a(Ljava/lang/Object;)V

    .line 738
    :cond_0
    return-void
.end method

.method public a(Lo/cmo;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 354
    iget-object v0, p0, Lo/cmj;->m:Lo/cnc;

    invoke-interface {v0, p1}, Lo/cnc;->d(Lo/cmo;)V

    .line 355
    return-void
.end method

.method public a(Lo/cmq;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 223
    iget-object v0, p0, Lo/cmj;->m:Lo/cnc;

    invoke-interface {v0, p1}, Lo/cnc;->e(Lo/cmq;)V

    .line 224
    return-void
.end method

.method public a(Lo/cmx;I)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 228
    iget-object v0, p0, Lo/cmj;->m:Lo/cnc;

    invoke-interface {v0, p1, p2}, Lo/cnc;->d(Lo/cmx;I)V

    .line 229
    const/4 v0, 0x1

    return v0
.end method

.method public b()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 369
    iget-object v0, p0, Lo/cmj;->m:Lo/cnc;

    invoke-interface {v0}, Lo/cnc;->b()I

    move-result v0

    return v0
.end method

.method public b(Lo/cms;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 320
    iget-object v0, p0, Lo/cmj;->m:Lo/cnc;

    invoke-interface {v0, p1}, Lo/cnc;->b(Lo/cms;)V

    .line 321
    return-void
.end method

.method public b(Lo/cmo;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 428
    iget-object v0, p0, Lo/cmj;->m:Lo/cnc;

    invoke-interface {v0, p1}, Lo/cnc;->a(Lo/cmo;)V

    .line 429
    const/4 v0, 0x1

    return v0
.end method

.method public c(Lo/cmo;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 359
    iget-object v0, p0, Lo/cmj;->m:Lo/cnc;

    invoke-interface {v0, p1}, Lo/cnc;->e(Lo/cmo;)V

    .line 360
    return-void
.end method

.method public c(Z)V
    .locals 5

    .line 537
    move v3, p1

    .line 539
    :try_start_0
    iget-object v0, p0, Lo/cmj;->m:Lo/cnc;

    invoke-interface {v0, v3}, Lo/cnc;->b(Z)V

    .line 540
    const-string v0, "HealthOpenSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "switchTrackMonitor "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 543
    goto :goto_0

    .line 541
    :catch_0
    move-exception v4

    .line 542
    const-string v0, "HealthOpenSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "switchTrackMonitor : RemoteEx "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 545
    :goto_0
    return-void
.end method

.method public c(ZLo/cmo;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 343
    iget-object v0, p0, Lo/cmj;->m:Lo/cnc;

    invoke-interface {v0, p1, p2}, Lo/cnc;->b(ZLo/cmo;)V

    .line 345
    return-void
.end method

.method public c()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 234
    iget-object v0, p0, Lo/cmj;->m:Lo/cnc;

    invoke-interface {v0}, Lo/cnc;->e()V

    .line 235
    const/4 v0, 0x1

    return v0
.end method

.method public d()V
    .locals 3

    .line 124
    const-string v0, "HealthOpenSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "destorySDK "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/cmj;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", this:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 125
    iget-object v0, p0, Lo/cmj;->m:Lo/cnc;

    if-eqz v0, :cond_0

    .line 126
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cmj;->m:Lo/cnc;

    .line 128
    :cond_0
    invoke-static {p0}, Lo/cmv;->e(Lo/cmj;)V

    .line 129
    iget-object v0, p0, Lo/cmj;->h:Lo/dle;

    if-eqz v0, :cond_1

    .line 130
    iget-object v0, p0, Lo/cmj;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/cmj;->e:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 131
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cmj;->h:Lo/dle;

    .line 133
    :cond_1
    return-void
.end method

.method public d(Lo/cmo;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 349
    iget-object v0, p0, Lo/cmj;->m:Lo/cnc;

    invoke-interface {v0, p1}, Lo/cnc;->b(Lo/cmo;)V

    .line 350
    return-void
.end method

.method public d(Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 364
    iget-object v0, p0, Lo/cmj;->m:Lo/cnc;

    invoke-interface {v0, p1}, Lo/cnc;->a(Z)V

    .line 365
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 2

    .line 138
    const-string v0, "HealthOpenSDK"

    const-string v1, "getSDKVersion 2.1.0.100"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 139
    const-string v0, "2.1.0.100"

    return-object v0
.end method

.method public e(Ljava/lang/Object;)V
    .locals 2

    .line 727
    const-string v0, "HealthOpenSDK"

    const-string v1, "notifyServiceReady"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 728
    iget-object v0, p0, Lo/cmj;->i:Lo/cmo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 729
    iget-object v0, p0, Lo/cmj;->i:Lo/cmo;

    invoke-interface {v0, p1}, Lo/cmo;->b(Ljava/lang/Object;)V

    .line 731
    :cond_0
    return-void
.end method

.method public e(ZLo/cmo;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 338
    iget-object v0, p0, Lo/cmj;->m:Lo/cnc;

    invoke-interface {v0, p1, p2}, Lo/cnc;->e(ZLo/cmo;)V

    .line 339
    return-void
.end method

.method public e(Lo/cmo;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 384
    iget-object v0, p0, Lo/cmj;->m:Lo/cnc;

    invoke-interface {v0, p1}, Lo/cnc;->c(Lo/cmo;)V

    .line 385
    const/4 v0, 0x1

    return v0
.end method

.method public e(Lo/cmq;Lo/cmo;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 217
    iget-object v0, p0, Lo/cmj;->m:Lo/cnc;

    invoke-interface {v0, p1, p2}, Lo/cnc;->a(Lo/cmq;Lo/cmo;)V

    .line 218
    const/4 v0, 0x1

    return v0
.end method

.method public f(Lo/cmo;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 452
    iget-object v0, p0, Lo/cmj;->m:Lo/cnc;

    invoke-interface {v0, p1}, Lo/cnc;->h(Lo/cmo;)V

    .line 453
    return-void
.end method

.method public g()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 446
    iget-object v0, p0, Lo/cmj;->m:Lo/cnc;

    invoke-interface {v0}, Lo/cnc;->g()V

    .line 447
    return-void
.end method

.method public g(Lo/cmo;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 434
    iget-object v0, p0, Lo/cmj;->m:Lo/cnc;

    invoke-interface {v0, p1}, Lo/cnc;->k(Lo/cmo;)V

    .line 435
    return-void
.end method

.method public h(Lo/cmo;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 440
    iget-object v0, p0, Lo/cmj;->m:Lo/cnc;

    invoke-interface {v0, p1}, Lo/cnc;->f(Lo/cmo;)V

    .line 441
    return-void
.end method

.method public i()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 390
    iget-object v0, p0, Lo/cmj;->m:Lo/cnc;

    invoke-interface {v0}, Lo/cnc;->a()Z

    move-result v0

    return v0
.end method

.method public k()V
    .locals 4

    .line 549
    :try_start_0
    iget-object v0, p0, Lo/cmj;->m:Lo/cnc;

    invoke-interface {v0}, Lo/cnc;->f()V

    .line 550
    const-string v0, "HealthOpenSDK"

    const-string v1, "tickTrackDog over "

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 553
    goto :goto_0

    .line 551
    :catch_0
    move-exception v3

    .line 552
    const-string v0, "HealthOpenSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "tickTrackDog : RemoteEx "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 554
    :goto_0
    return-void
.end method
