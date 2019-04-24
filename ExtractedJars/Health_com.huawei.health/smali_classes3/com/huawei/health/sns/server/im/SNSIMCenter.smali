.class public final Lcom/huawei/health/sns/server/im/SNSIMCenter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/im/SNSIMCenter$e;,
        Lcom/huawei/health/sns/server/im/SNSIMCenter$MonitorHandler;
    }
.end annotation


# static fields
.field private static a:Lcom/huawei/health/sns/server/im/SNSIMCenter;


# instance fields
.field private b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private c:Landroid/app/AlarmManager;

.field private d:J

.field private e:Landroid/app/PendingIntent;

.field private f:Lcom/huawei/health/sns/server/im/SNSIMCenter$MonitorHandler;

.field private g:Ljava/util/concurrent/atomic/AtomicInteger;

.field private h:Ljava/lang/String;

.field private final i:Landroid/content/BroadcastReceiver;

.field private k:Z

.field private l:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private m:Lo/azi;

.field private n:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<Lo/azd$c;>;"
        }
    .end annotation
.end field

.field private final o:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Lo/azh;>;"
        }
    .end annotation
.end field

.field private final p:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Lo/azd;>;"
        }
    .end annotation
.end field

.field private q:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private r:Lo/azu;

.field private final s:Landroid/content/BroadcastReceiver;

.field private t:Lo/azf;

.field private final u:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 74
    new-instance v0, Lcom/huawei/health/sns/server/im/SNSIMCenter;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->a:Lcom/huawei/health/sns/server/im/SNSIMCenter;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .line 284
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->d:J

    .line 109
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->e:Landroid/app/PendingIntent;

    .line 129
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 134
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->f:Lcom/huawei/health/sns/server/im/SNSIMCenter$MonitorHandler;

    .line 139
    new-instance v0, Lcom/huawei/health/sns/server/im/SNSIMCenter$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/health/sns/server/im/SNSIMCenter$e;-><init>(Lcom/huawei/health/sns/server/im/SNSIMCenter;Lcom/huawei/health/sns/server/im/SNSIMCenter$2;)V

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->i:Landroid/content/BroadcastReceiver;

    .line 149
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->k:Z

    .line 159
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 200
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lo/azd$c;->c:Lo/azd$c;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->n:Ljava/util/concurrent/atomic/AtomicReference;

    .line 205
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->p:Ljava/util/Set;

    .line 210
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 215
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->m:Lo/azi;

    .line 220
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->o:Ljava/util/Set;

    .line 225
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 230
    new-instance v0, Lcom/huawei/health/sns/server/im/SNSIMCenter$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter$2;-><init>(Lcom/huawei/health/sns/server/im/SNSIMCenter;)V

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->t:Lo/azf;

    .line 684
    new-instance v0, Lcom/huawei/health/sns/server/im/SNSIMCenter$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter$1;-><init>(Lcom/huawei/health/sns/server/im/SNSIMCenter;)V

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->r:Lo/azu;

    .line 931
    new-instance v0, Lcom/huawei/health/sns/server/im/SNSIMCenter$3;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter$3;-><init>(Lcom/huawei/health/sns/server/im/SNSIMCenter;)V

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->u:Landroid/content/BroadcastReceiver;

    .line 972
    new-instance v0, Lcom/huawei/health/sns/server/im/SNSIMCenter$5;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter$5;-><init>(Lcom/huawei/health/sns/server/im/SNSIMCenter;)V

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->s:Landroid/content/BroadcastReceiver;

    .line 285
    new-instance v2, Landroid/os/HandlerThread;

    const-string v0, "IMCenterHandler"

    invoke-direct {v2, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 286
    invoke-virtual {v2}, Landroid/os/HandlerThread;->start()V

    .line 287
    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v3

    .line 288
    if-eqz v3, :cond_0

    .line 290
    new-instance v0, Lcom/huawei/health/sns/server/im/SNSIMCenter$MonitorHandler;

    invoke-direct {v0, p0, v3}, Lcom/huawei/health/sns/server/im/SNSIMCenter$MonitorHandler;-><init>(Lcom/huawei/health/sns/server/im/SNSIMCenter;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->f:Lcom/huawei/health/sns/server/im/SNSIMCenter$MonitorHandler;

    .line 293
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->u()Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->e:Landroid/app/PendingIntent;

    .line 295
    invoke-static {}, Lo/azl;->b()V

    .line 296
    new-instance v0, Lo/azi;

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->t:Lo/azf;

    invoke-direct {v0, v1}, Lo/azi;-><init>(Lo/azf;)V

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->m:Lo/azi;

    .line 298
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->m:Lo/azi;

    invoke-static {}, Lo/apu;->b()Lo/apu;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/azi;->c(Lo/bab;)V

    .line 299
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->m:Lo/azi;

    invoke-static {}, Lo/apv;->e()Lo/apv;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/azi;->c(Lo/bab;)V

    .line 300
    invoke-direct {p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->p()V

    .line 301
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/server/im/SNSIMCenter;J)J
    .locals 0

    .line 64
    iput-wide p1, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->d:J

    return-wide p1
.end method

.method static synthetic a(Lcom/huawei/health/sns/server/im/SNSIMCenter;)Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->h:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/health/sns/server/im/SNSIMCenter;I)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->e(I)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/server/im/SNSIMCenter;Lo/azd$a;)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->d(Lo/azd$a;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/server/im/SNSIMCenter;Lo/azd$c;Lo/azd$a;)V
    .locals 0

    .line 64
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->b(Lo/azd$c;Lo/azd$a;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/server/im/SNSIMCenter;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/health/sns/server/im/SNSIMCenter;IZ)V
    .locals 0

    .line 64
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->e(IZ)V

    return-void
.end method

.method private declared-synchronized b(Lo/azd$c;Lo/azd$a;)V
    .locals 0

    monitor-enter p0

    .line 277
    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->e(Lo/azd$c;Lo/azd$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 278
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public static c()Lcom/huawei/health/sns/server/im/SNSIMCenter;
    .locals 1

    .line 310
    sget-object v0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->a:Lcom/huawei/health/sns/server/im/SNSIMCenter;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/health/sns/server/im/SNSIMCenter;)Lo/azi;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->m:Lo/azi;

    return-object v0
.end method

.method private c(Lo/azh;)V
    .locals 1

    .line 639
    if-eqz p1, :cond_0

    .line 641
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->o:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 643
    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/server/im/SNSIMCenter;)Ljava/util/Set;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->o:Ljava/util/Set;

    return-object v0
.end method

.method private declared-synchronized d(I)V
    .locals 7

    monitor-enter p0

    .line 1020
    :try_start_0
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->h()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1022
    monitor-exit p0

    return-void

    .line 1025
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->r()Landroid/app/AlarmManager;

    move-result-object v6

    .line 1027
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->e:Landroid/app/PendingIntent;

    invoke-virtual {v6, v0}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 1031
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->n:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lo/azd$c;->c:Lo/azd$c;

    if-ne v0, v1, :cond_1

    .line 1033
    monitor-exit p0

    return-void

    .line 1037
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    int-to-long v2, p1

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    add-long/2addr v0, v2

    iget-object v2, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->e:Landroid/app/PendingIntent;

    const/4 v3, 0x3

    invoke-virtual {v6, v3, v0, v1, v2}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    .line 1040
    invoke-static {}, Lo/bpf;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1042
    const-string v0, "SNSIMCenter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Re execute delay logout task. seconds:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1044
    :cond_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method static synthetic d(Lcom/huawei/health/sns/server/im/SNSIMCenter;I)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->d(I)V

    return-void
.end method

.method private declared-synchronized d(Lo/azd$a;)V
    .locals 3

    monitor-enter p0

    .line 460
    const-string v0, "SNSIMCenter"

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "logoutIM loginCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 461
    invoke-direct {p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 463
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->m:Lo/azi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/azi;->a(Z)V

    .line 464
    sget-object v0, Lo/azd$c;->c:Lo/azd$c;

    invoke-direct {p0, v0, p1}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->e(Lo/azd$c;Lo/azd$a;)V

    .line 467
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->q()V

    .line 469
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->h:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 470
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private e(I)V
    .locals 1

    .line 962
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->f:Lcom/huawei/health/sns/server/im/SNSIMCenter$MonitorHandler;

    if-eqz v0, :cond_0

    .line 964
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->f:Lcom/huawei/health/sns/server/im/SNSIMCenter$MonitorHandler;

    invoke-virtual {v0, p1}, Lcom/huawei/health/sns/server/im/SNSIMCenter$MonitorHandler;->removeMessages(I)V

    .line 965
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->f:Lcom/huawei/health/sns/server/im/SNSIMCenter$MonitorHandler;

    invoke-virtual {v0, p1}, Lcom/huawei/health/sns/server/im/SNSIMCenter$MonitorHandler;->sendEmptyMessage(I)Z

    .line 967
    :cond_0
    return-void
.end method

.method private e(IZ)V
    .locals 2

    .line 876
    if-nez p1, :cond_0

    .line 878
    if-eqz p2, :cond_1

    .line 880
    const-string v0, "SNSIMCenter"

    const-string v1, "notifyAppStatusChanged, has Active SNS Activity"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 881
    invoke-direct {p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->q()V

    .line 882
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->b()V

    goto :goto_0

    .line 885
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 887
    if-nez p2, :cond_1

    .line 889
    const-string v0, "SNSIMCenter"

    const-string v1, "notifyAppStatusChanged, has no Active SNS Activity"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 890
    invoke-static {}, Lo/ayy;->d()Lo/ayy;

    move-result-object v0

    invoke-virtual {v0}, Lo/ayy;->e()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->d(I)V

    .line 893
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/server/im/SNSIMCenter;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->n()V

    return-void
.end method

.method private e(Lo/azd$c;Lo/azd$a;)V
    .locals 4

    .line 507
    const-string v0, "SNSIMCenter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setImStatus(status:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",loginCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ") current imStatus:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->n:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 508
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->n:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_0

    .line 510
    return-void

    .line 514
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->n:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 516
    sget-object v0, Lo/azd$c;->e:Lo/azd$c;

    if-ne p1, v0, :cond_2

    .line 518
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 521
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 522
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->m:Lo/azi;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/azi;->a(Z)V

    .line 523
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->n:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lo/azd$c;->c:Lo/azd$c;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 525
    invoke-direct {p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->q()V

    goto :goto_0

    .line 530
    :cond_1
    invoke-static {}, Lo/azz;->e()Lo/azz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->r:Lo/azu;

    invoke-virtual {v0, v1}, Lo/azz;->e(Lo/azu;)V

    .line 531
    invoke-static {}, Lo/azz;->e()Lo/azz;

    move-result-object v0

    invoke-virtual {v0}, Lo/azz;->a()V

    .line 534
    invoke-direct {p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->k()V

    .line 535
    invoke-direct {p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->o()V

    .line 536
    invoke-direct {p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->m()V

    .line 539
    new-instance v0, Lo/bba;

    invoke-direct {v0}, Lo/bba;-><init>()V

    invoke-virtual {v0}, Lo/bba;->a()V

    .line 541
    new-instance v3, Lo/bca;

    invoke-direct {v3}, Lo/bca;-><init>()V

    .line 542
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/bca;->c(Z)V

    .line 544
    invoke-virtual {v3}, Lo/bca;->c()V

    .line 546
    invoke-direct {p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->s()V

    .line 550
    :cond_2
    :goto_0
    sget-object v0, Lo/azd$c;->c:Lo/azd$c;

    if-ne p1, v0, :cond_3

    .line 552
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 553
    invoke-static {}, Lo/azz;->e()Lo/azz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->r:Lo/azu;

    invoke-virtual {v0, v1}, Lo/azz;->c(Lo/azu;)V

    .line 554
    invoke-static {}, Lo/azz;->e()Lo/azz;

    move-result-object v0

    invoke-virtual {v0}, Lo/azz;->b()V

    .line 555
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->h:Ljava/lang/String;

    .line 559
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->n:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/azd$c;

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->p:Ljava/util/Set;

    invoke-static {v0, p2, v1}, Lo/azl;->e(Lo/azd$c;Lo/azd$a;Ljava/util/Set;)V

    .line 560
    return-void
.end method

.method private declared-synchronized e(ZZ)Z
    .locals 5

    monitor-enter p0

    .line 346
    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->h:Ljava/lang/String;

    .line 348
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->n:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/azd$c;

    .line 349
    const-string v0, "SNSIMCenter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Current IMStatus:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",isNeedRetry:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",isCheckOnLine:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 350
    sget-object v0, Lo/azd$c;->e:Lo/azd$c;

    if-ne v3, v0, :cond_0

    .line 353
    monitor-exit p0

    const/4 v0, 0x1

    return v0

    .line 355
    :cond_0
    sget-object v0, Lo/azd$c;->b:Lo/azd$c;

    if-ne v3, v0, :cond_1

    .line 358
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->m:Lo/azi;

    invoke-static {p1, p2}, Lo/azl;->d(ZZ)Lo/azm;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/azi;->b(Lo/azm;)V

    .line 359
    monitor-exit p0

    const/4 v0, 0x1

    return v0

    .line 362
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->f()Z

    move-result v0

    if-nez v0, :cond_2

    .line 365
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 368
    :cond_2
    invoke-static {p1, p2}, Lo/azl;->d(ZZ)Lo/azm;

    move-result-object v4

    .line 369
    if-eqz v4, :cond_3

    .line 371
    sget-object v0, Lo/azd$c;->b:Lo/azd$c;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->e(Lo/azd$c;Lo/azd$a;)V

    .line 372
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->m:Lo/azi;

    invoke-virtual {v0, v4}, Lo/azi;->b(Lo/azm;)V

    .line 374
    invoke-static {}, Lo/bap;->b()Lo/bap;

    move-result-object v0

    invoke-virtual {v0}, Lo/bap;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 375
    monitor-exit p0

    const/4 v0, 0x1

    return v0

    .line 379
    :cond_3
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private f()Z
    .locals 5

    .line 391
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->h()Z

    move-result v0

    if-nez v0, :cond_0

    .line 393
    const-string v0, "SNSIMCenter"

    const-string v1, "validLoginCondition() HW Account has not login! return."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 394
    const/4 v0, 0x0

    return v0

    .line 397
    :cond_0
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isAccountInvalid"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v3

    .line 398
    if-eqz v3, :cond_1

    .line 400
    const-string v0, "SNSIMCenter"

    const-string v1, "validLoginCondition() Account has unregistered! return."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 401
    const/4 v0, 0x0

    return v0

    .line 404
    :cond_1
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 406
    const-string v0, "SNSIMCenter"

    const-string v1, "validLoginCondition() Account status is locked! return."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 407
    const/4 v0, 0x0

    return v0

    .line 409
    :cond_2
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->b()Lo/axr;

    move-result-object v4

    .line 413
    invoke-static {}, Lo/awn;->e()Lo/awn;

    move-result-object v0

    invoke-virtual {v0}, Lo/awn;->a()V

    .line 415
    if-eqz v4, :cond_3

    invoke-static {}, Lo/awn;->e()Lo/awn;

    move-result-object v0

    invoke-virtual {v4}, Lo/axr;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/awn;->d(I)Z

    move-result v0

    if-nez v0, :cond_5

    .line 417
    :cond_3
    const-string v0, "SNSIMCenter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "validLoginCondition() Account is null:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez v4, :cond_4

    const/4 v2, 0x1

    goto :goto_0

    :cond_4
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " or not china site!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 418
    const/4 v0, 0x0

    return v0

    .line 422
    :cond_5
    invoke-static {}, Lo/ayz;->c()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 424
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->k:Z

    .line 425
    const-string v0, "SNSIMCenter"

    const-string v1, "validLoginCondition() Backup is recovering!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 426
    const/4 v0, 0x0

    return v0

    .line 428
    :cond_6
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic g(Lcom/huawei/health/sns/server/im/SNSIMCenter;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object v0
.end method

.method private h()V
    .locals 2

    .line 663
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->n:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lo/azd$c;->e:Lo/azd$c;

    if-ne v0, v1, :cond_0

    .line 666
    invoke-direct {p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->k()V

    .line 668
    :cond_0
    return-void
.end method

.method static synthetic i(Lcom/huawei/health/sns/server/im/SNSIMCenter;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method private k()V
    .locals 4

    .line 698
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 699
    invoke-static {}, Lo/azk;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/health/sns/server/im/login/impl/packet/MCode;->newInstance(Ljava/lang/String;)Lcom/huawei/health/sns/server/im/login/impl/packet/MCode;

    move-result-object v3

    .line 700
    const-string v0, "SNSIMCenter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "request IMServer MCode PacketIQ id:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lcom/huawei/health/sns/server/im/login/impl/packet/MCode;->getStanzaId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 701
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->m:Lo/azi;

    invoke-virtual {v0, v3}, Lo/azi;->e(Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 702
    return-void
.end method

.method private l()Z
    .locals 2

    .line 770
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->n:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lo/azd$c;->e:Lo/azd$c;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->n:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lo/azd$c;->b:Lo/azd$c;

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private m()V
    .locals 4

    .line 709
    invoke-static {}, Lo/azk;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->newInstance(Ljava/lang/String;)Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;

    move-result-object v3

    .line 710
    const-string v0, "SNSIMCenter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "request IMServer SNSConfig PacketIQ id:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->getStanzaId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 711
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->m:Lo/azi;

    invoke-virtual {v0, v3}, Lo/azi;->e(Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 712
    return-void
.end method

.method private n()V
    .locals 2

    .line 835
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->n:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lo/azd$c;->e:Lo/azd$c;

    if-ne v0, v1, :cond_0

    .line 837
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->m:Lo/azi;

    invoke-virtual {v0}, Lo/azi;->a()V

    goto :goto_0

    .line 842
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->d()V

    .line 844
    :goto_0
    return-void
.end method

.method private o()V
    .locals 7

    .line 719
    invoke-static {}, Lo/azk;->e()Ljava/lang/String;

    move-result-object v3

    .line 720
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0}, Lo/apm;->d()J

    move-result-wide v4

    .line 721
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgReq;->newInstance(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgReq;

    move-result-object v6

    .line 722
    const-string v0, "SNSIMCenter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "request IMServer OfflineMsgReq PacketIQ id:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgReq;->getStanzaId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",localSeq:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 724
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->m:Lo/azi;

    invoke-virtual {v0, v6, v4, v5}, Lo/azi;->b(Lorg/jivesoftware/smack/packet/Stanza;J)V

    .line 725
    return-void
.end method

.method private p()V
    .locals 7

    .line 851
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v3

    .line 852
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 854
    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 855
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->u:Landroid/content/BroadcastReceiver;

    invoke-virtual {v3, v0, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 857
    new-instance v5, Landroid/content/IntentFilter;

    invoke-direct {v5}, Landroid/content/IntentFilter;-><init>()V

    .line 859
    const-string v0, "com.huawei.health.sns.logout_im.action"

    invoke-virtual {v5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 860
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->i:Landroid/content/BroadcastReceiver;

    const-string v1, "com.huawei.android.sns.alarm.permission"

    const/4 v2, 0x0

    invoke-virtual {v3, v0, v5, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 863
    new-instance v6, Landroid/content/IntentFilter;

    invoke-direct {v6}, Landroid/content/IntentFilter;-><init>()V

    .line 864
    const-string v0, "msg_active_action"

    invoke-virtual {v6, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 865
    invoke-static {v3}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->s:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v6}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 866
    return-void
.end method

.method private declared-synchronized q()V
    .locals 3

    monitor-enter p0

    .line 1051
    :try_start_0
    invoke-direct {p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->r()Landroid/app/AlarmManager;

    move-result-object v2

    .line 1052
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->e:Landroid/app/PendingIntent;

    invoke-virtual {v2, v0}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 1053
    const-string v0, "SNSIMCenter"

    const-string v1, "cancel delay logout task."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1054
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method private r()Landroid/app/AlarmManager;
    .locals 2

    .line 994
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->c:Landroid/app/AlarmManager;

    if-nez v0, :cond_0

    .line 996
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    .line 997
    const-string v0, "alarm"

    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->c:Landroid/app/AlarmManager;

    .line 999
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->c:Landroid/app/AlarmManager;

    return-object v0
.end method

.method private s()V
    .locals 8

    .line 1061
    const-string v0, "SNSIMCenter"

    const-string v1, "valid IM background alive time."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1063
    invoke-static {}, Lo/aza;->b()Lo/aza;

    move-result-object v0

    invoke-virtual {v0}, Lo/aza;->d()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1065
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->d:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    div-long v4, v0, v2

    .line 1066
    invoke-static {}, Lo/ayy;->d()Lo/ayy;

    move-result-object v0

    invoke-virtual {v0}, Lo/ayy;->e()I

    move-result v6

    .line 1067
    int-to-long v0, v6

    cmp-long v0, v4, v0

    if-gtz v0, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-gtz v0, :cond_1

    .line 1070
    :cond_0
    const/16 v0, 0x3c

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->d(I)V

    goto :goto_0

    .line 1075
    :cond_1
    int-to-long v0, v6

    sub-long/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    long-to-int v7, v0

    .line 1076
    const/16 v0, 0x3c

    invoke-static {v7, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->d(I)V

    .line 1079
    :cond_2
    :goto_0
    return-void
.end method

.method private u()Landroid/app/PendingIntent;
    .locals 4

    .line 1009
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 1010
    const-string v0, "com.huawei.health.sns.logout_im.action"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1011
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1012
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    const/high16 v2, 0x8000000

    invoke-static {v0, v1, v3, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(J)V
    .locals 3

    .line 592
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gtz v0, :cond_0

    .line 594
    return-void

    .line 597
    :cond_0
    invoke-static {}, Lo/azk;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lcom/huawei/health/sns/server/im/message/impl/packet/RejectMessage;->newInstance(Ljava/lang/String;J)Lcom/huawei/health/sns/server/im/message/impl/packet/RejectMessage;

    move-result-object v2

    .line 598
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->m:Lo/azi;

    invoke-virtual {v0, v2}, Lo/azi;->e(Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 599
    return-void
.end method

.method public a(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V
    .locals 5

    .line 579
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getReceiver()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bpd;->b(Ljava/lang/String;)J

    move-result-wide v2

    .line 581
    new-instance v0, Lo/atk;

    invoke-direct {v0}, Lo/atk;-><init>()V

    invoke-virtual {v0, v2, v3}, Lo/atk;->e(J)Ljava/lang/String;

    move-result-object v4

    .line 582
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->m:Lo/azi;

    invoke-static {p1, v4}, Lo/bad;->d(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/azi;->e(Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 583
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 5

    .line 608
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 610
    return-void

    .line 612
    :cond_0
    invoke-static {}, Lo/ave;->b()Lo/ave;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/ave;->e(Ljava/lang/String;)Z

    move-result v3

    .line 613
    if-eqz v3, :cond_2

    .line 615
    invoke-direct {p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 617
    invoke-static {}, Lo/azk;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/huawei/health/sns/server/im/login/impl/packet/PushToken;->newInstance(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/health/sns/server/im/login/impl/packet/PushToken;

    move-result-object v4

    .line 618
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->m:Lo/azi;

    invoke-virtual {v0, v4}, Lo/azi;->e(Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 619
    const-string v0, "SNSIMCenter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Send PushToken IQ Packet to Server. packetID:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/health/sns/server/im/login/impl/packet/PushToken;->getStanzaId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 620
    goto :goto_0

    .line 623
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->a()Z

    goto :goto_0

    .line 628
    :cond_2
    const-string v0, "SNSIMCenter"

    const-string v1, "No need to report IM Server PushToken."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 630
    :goto_0
    return-void
.end method

.method public a(Lo/azd;)V
    .locals 1

    .line 744
    if-eqz p1, :cond_0

    .line 746
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->p:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 748
    :cond_0
    return-void
.end method

.method public a()Z
    .locals 2

    .line 338
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->e(ZZ)Z

    move-result v0

    return v0
.end method

.method public b()V
    .locals 2

    .line 319
    invoke-static {}, Lo/awn;->e()Lo/awn;

    move-result-object v0

    invoke-virtual {v0}, Lo/awn;->a()V

    .line 320
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->e(ZZ)Z

    .line 321
    return-void
.end method

.method public b(IZ)V
    .locals 4

    .line 904
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->d:J

    .line 905
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 906
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->f:Lcom/huawei/health/sns/server/im/SNSIMCenter$MonitorHandler;

    if-eqz v0, :cond_1

    .line 908
    if-eqz p2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 909
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->f:Lcom/huawei/health/sns/server/im/SNSIMCenter$MonitorHandler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1, v2}, Lcom/huawei/health/sns/server/im/SNSIMCenter$MonitorHandler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v3

    .line 910
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->f:Lcom/huawei/health/sns/server/im/SNSIMCenter$MonitorHandler;

    invoke-virtual {v0, v3}, Lcom/huawei/health/sns/server/im/SNSIMCenter$MonitorHandler;->sendMessage(Landroid/os/Message;)Z

    .line 912
    :cond_1
    return-void
.end method

.method public b(Lo/azh;)V
    .locals 0

    .line 677
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->c(Lo/azh;)V

    .line 678
    invoke-direct {p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->h()V

    .line 679
    return-void
.end method

.method public c(Lo/azd;)V
    .locals 1

    .line 757
    if-eqz p1, :cond_0

    .line 759
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->p:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 761
    :cond_0
    return-void
.end method

.method public d()V
    .locals 2

    .line 329
    invoke-static {}, Lo/awn;->e()Lo/awn;

    move-result-object v0

    invoke-virtual {v0}, Lo/awn;->a()V

    .line 330
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->e(ZZ)Z

    .line 331
    return-void
.end method

.method public d(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V
    .locals 2

    .line 569
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->m:Lo/azi;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lo/bad;->d(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/azi;->e(Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 570
    return-void
.end method

.method public e()V
    .locals 5

    .line 436
    const-string v0, "SNSIMCenter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "back up finish check login task:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->k:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 437
    iget-boolean v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->k:Z

    if-eqz v0, :cond_0

    .line 439
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter;->k:Z

    .line 441
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    move-result-wide v3

    .line 442
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->d()V

    .line 443
    invoke-static {v3, v4}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 445
    :cond_0
    return-void
.end method

.method public g()V
    .locals 1

    .line 1086
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->e(I)V

    .line 1087
    return-void
.end method

.method public i()V
    .locals 1

    .line 452
    sget-object v0, Lo/azd$a;->b:Lo/azd$a;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->d(Lo/azd$a;)V

    .line 453
    return-void
.end method
