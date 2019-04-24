.class public final Lo/azz;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/azz$e;
    }
.end annotation


# static fields
.field private static final a:Lo/azz;

.field private static e:I

.field private static final g:Ljava/util/concurrent/ExecutorService;


# instance fields
.field private b:Landroid/app/AlarmManager;

.field private final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Lo/azu;>;"
        }
    .end annotation
.end field

.field private final d:Landroid/app/PendingIntent;

.field private f:Landroid/content/BroadcastReceiver;

.field private h:Lo/azt;

.field private i:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 47
    const/4 v0, 0x3

    sput v0, Lo/azz;->e:I

    .line 57
    new-instance v0, Lo/azz;

    invoke-direct {v0}, Lo/azz;-><init>()V

    sput-object v0, Lo/azz;->a:Lo/azz;

    .line 92
    new-instance v0, Lo/azz$1;

    invoke-direct {v0}, Lo/azz$1;-><init>()V

    const/4 v1, 0x1

    invoke-static {v1, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lo/azz;->g:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lo/azz;->c:Ljava/util/Set;

    .line 72
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo/azz;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 534
    new-instance v0, Lo/azz$5;

    invoke-direct {v0, p0}, Lo/azz$5;-><init>(Lo/azz;)V

    iput-object v0, p0, Lo/azz;->f:Landroid/content/BroadcastReceiver;

    .line 110
    invoke-static {}, Lo/azs;->a()Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, p0, Lo/azz;->d:Landroid/app/PendingIntent;

    .line 112
    invoke-direct {p0}, Lo/azz;->i()Landroid/app/AlarmManager;

    move-result-object v0

    iput-object v0, p0, Lo/azz;->b:Landroid/app/AlarmManager;

    .line 114
    invoke-direct {p0}, Lo/azz;->g()V

    .line 116
    invoke-static {}, Lo/baa;->e()Lo/baa;

    move-result-object v0

    invoke-virtual {v0}, Lo/baa;->c()V

    .line 117
    return-void
.end method

.method private a(J)Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;
        }
    .end annotation

    .line 201
    const/4 v2, 0x0

    .line 202
    invoke-direct {p0}, Lo/azz;->h()Lorg/jivesoftware/smack/XMPPConnection;

    move-result-object v3

    .line 203
    if-eqz v3, :cond_1

    .line 208
    :try_start_0
    invoke-interface {v3}, Lorg/jivesoftware/smack/XMPPConnection;->getServiceName()Lo/fsz;

    move-result-object v4

    .line 209
    if-eqz v4, :cond_0

    .line 211
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1, p2}, Lo/azz;->b(Ljava/lang/String;J)Z
    :try_end_0
    .catch Lorg/jivesoftware/smack/SmackException$NoResponseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    .line 218
    :cond_0
    goto :goto_0

    .line 214
    :catch_0
    move-exception v4

    .line 216
    const/4 v2, 0x0

    .line 217
    const-string v0, "PingModule"

    const-string v1, "ping server meet NoResponseException!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    :cond_1
    :goto_0
    return v2
.end method

.method private b(Lo/azz$e;)V
    .locals 3

    .line 499
    :try_start_0
    sget-object v0, Lo/azz;->g:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 504
    goto :goto_0

    .line 501
    :catch_0
    move-exception v2

    .line 503
    const-string v0, "PingModule"

    const-string v1, "submitPingTask RejectedExecutionException"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 505
    :goto_0
    return-void
.end method

.method static synthetic b(Lo/azz;Z)V
    .locals 0

    .line 37
    invoke-direct {p0, p1}, Lo/azz;->d(Z)V

    return-void
.end method

.method private b(Z)V
    .locals 3

    .line 384
    if-nez p1, :cond_2

    .line 386
    iget-object v0, p0, Lo/azz;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 389
    return-void

    .line 391
    :cond_0
    iget-object v0, p0, Lo/azz;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/azu;

    .line 393
    invoke-interface {v2}, Lo/azu;->e()V

    .line 394
    goto :goto_0

    :cond_1
    goto :goto_1

    .line 399
    :cond_2
    invoke-virtual {p0}, Lo/azz;->c()V

    .line 401
    :goto_1
    return-void
.end method

.method private b(JZ)Z
    .locals 2

    .line 283
    if-nez p3, :cond_0

    .line 286
    const/4 v0, 0x0

    return v0

    .line 288
    :cond_0
    invoke-static {p1, p2}, Lo/azs;->a(J)I

    move-result v1

    .line 289
    if-lez v1, :cond_1

    .line 291
    invoke-direct {p0, v1}, Lo/azz;->e(I)V

    .line 292
    const/4 v0, 0x1

    return v0

    .line 294
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private b(Ljava/lang/String;J)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;,
            Lorg/jivesoftware/smack/SmackException$NoResponseException;
        }
    .end annotation

    .line 234
    invoke-direct {p0}, Lo/azz;->h()Lorg/jivesoftware/smack/XMPPConnection;

    move-result-object v1

    .line 237
    if-eqz v1, :cond_0

    invoke-interface {v1}, Lorg/jivesoftware/smack/XMPPConnection;->isAuthenticated()Z

    move-result v0

    if-nez v0, :cond_1

    .line 239
    :cond_0
    new-instance v0, Lorg/jivesoftware/smack/SmackException$NotConnectedException;

    invoke-direct {v0}, Lorg/jivesoftware/smack/SmackException$NotConnectedException;-><init>()V

    throw v0

    .line 241
    :cond_1
    new-instance v2, Lorg/jivesoftware/smackx/ping/packet/Ping;

    invoke-direct {v2, p1}, Lorg/jivesoftware/smackx/ping/packet/Ping;-><init>(Ljava/lang/String;)V

    .line 245
    :try_start_0
    invoke-interface {v1, v2}, Lorg/jivesoftware/smack/XMPPConnection;->createStanzaCollectorAndSend(Lorg/jivesoftware/smack/packet/IQ;)Lorg/jivesoftware/smack/StanzaCollector;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lorg/jivesoftware/smack/StanzaCollector;->nextResultOrThrow(J)Lorg/jivesoftware/smack/packet/Stanza;
    :try_end_0
    .catch Lorg/jivesoftware/smack/XMPPException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    .line 254
    goto :goto_0

    .line 247
    :catch_0
    move-exception v3

    .line 249
    invoke-interface {v1}, Lorg/jivesoftware/smack/XMPPConnection;->getServiceName()Lo/fsz;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lo/azz;->e(Ljava/lang/String;Lo/fsz;)Z

    move-result v0

    return v0

    .line 251
    :catch_1
    move-exception v3

    .line 253
    invoke-interface {v1}, Lorg/jivesoftware/smack/XMPPConnection;->getServiceName()Lo/fsz;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lo/azz;->e(Ljava/lang/String;Lo/fsz;)Z

    move-result v0

    return v0

    .line 255
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic d(Lo/azz;I)V
    .locals 0

    .line 37
    invoke-direct {p0, p1}, Lo/azz;->e(I)V

    return-void
.end method

.method private d(Z)V
    .locals 8

    .line 302
    invoke-direct {p0}, Lo/azz;->h()Lorg/jivesoftware/smack/XMPPConnection;

    move-result-object v3

    .line 303
    if-nez v3, :cond_0

    .line 305
    const-string v0, "PingModule"

    const-string v1, "pingServer,connection is null.Return."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    return-void

    .line 308
    :cond_0
    const-string v0, "PingModule"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "pingServer,Is valid interval:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 310
    invoke-interface {v3}, Lorg/jivesoftware/smack/XMPPConnection;->getLastStanzaReceived()J

    move-result-wide v0

    invoke-direct {p0, v0, v1, p1}, Lo/azz;->b(JZ)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 312
    return-void

    .line 315
    :cond_1
    invoke-interface {v3}, Lorg/jivesoftware/smack/XMPPConnection;->isAuthenticated()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 317
    const/16 v4, 0x3e8

    .line 318
    const/4 v5, 0x0

    .line 319
    const/4 v6, 0x0

    :goto_0
    sget v0, Lo/azz;->e:I

    if-ge v6, v0, :cond_7

    .line 321
    iget-object v0, p0, Lo/azz;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_2

    .line 324
    const-string v0, "PingModule"

    const-string v1, "Ping task has stopped."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 325
    return-void

    .line 327
    :cond_2
    if-eqz v6, :cond_3

    .line 331
    const-wide/16 v0, 0x3e8

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 338
    goto :goto_1

    .line 333
    :catch_0
    move-exception v7

    .line 336
    const-string v0, "PingModule"

    const-string v1, "Ping thread meet InterruptedException!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 337
    return-void

    .line 340
    :cond_3
    :goto_1
    iget-object v0, p0, Lo/azz;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_4

    .line 343
    const-string v0, "PingModule"

    const-string v1, "Ping task has stopped."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 344
    return-void

    .line 348
    :cond_4
    :try_start_1
    invoke-direct {p0}, Lo/azz;->f()Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    move-result v5

    .line 361
    goto :goto_2

    .line 350
    :catch_1
    move-exception v7

    .line 352
    instance-of v0, v7, Lorg/jivesoftware/smack/SmackException$NotConnectedException;

    if-eqz v0, :cond_5

    .line 354
    const-string v0, "PingModule"

    const-string v1, "ping server meet NotConnectedException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 355
    const/4 v5, 0x0

    .line 357
    goto :goto_3

    .line 359
    :cond_5
    const-string v0, "PingModule"

    const-string v1, "ping server meet Exception!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 360
    const/4 v5, 0x0

    .line 362
    :goto_2
    const-string v0, "PingModule"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Ping Server: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    add-int/lit8 v2, v6, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lo/azz;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " times, Result:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 364
    if-eqz v5, :cond_6

    .line 366
    goto :goto_3

    .line 319
    :cond_6
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 369
    :cond_7
    :goto_3
    invoke-direct {p0, v5}, Lo/azz;->b(Z)V

    .line 370
    goto :goto_4

    .line 373
    :cond_8
    const-string v0, "PingModule"

    const-string v1, "ping server,connection is not authenticated!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 375
    :goto_4
    return-void
.end method

.method public static e()Lo/azz;
    .locals 1

    .line 160
    sget-object v0, Lo/azz;->a:Lo/azz;

    return-object v0
.end method

.method private declared-synchronized e(I)V
    .locals 8

    monitor-enter p0

    .line 460
    :try_start_0
    invoke-direct {p0}, Lo/azz;->k()V

    .line 462
    if-gtz p1, :cond_0

    .line 464
    new-instance v0, Lo/azz$e;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lo/azz$e;-><init>(Lo/azz;Z)V

    invoke-direct {p0, v0}, Lo/azz;->b(Lo/azz$e;)V

    goto :goto_0

    .line 468
    :cond_0
    const-string v0, "PingModule"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "maybeSchedulePingServerTask delaySeconds:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 469
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    int-to-long v2, p1

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    add-long v6, v0, v2

    .line 470
    invoke-direct {p0}, Lo/azz;->i()Landroid/app/AlarmManager;

    move-result-object v0

    iget-object v1, p0, Lo/azz;->d:Landroid/app/PendingIntent;

    const/4 v2, 0x3

    invoke-virtual {v0, v2, v6, v7, v1}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 472
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private e(Ljava/lang/String;Lo/fsz;)Z
    .locals 1

    .line 267
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 269
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 271
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private f()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;
        }
    .end annotation

    .line 171
    invoke-static {}, Lo/baa;->e()Lo/baa;

    move-result-object v0

    invoke-virtual {v0}, Lo/baa;->a()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lo/azz;->a(J)Z

    move-result v0

    return v0
.end method

.method private g()V
    .locals 5

    .line 550
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v3

    .line 551
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 552
    const-string v0, "com.huawei.health.sns.smart_ping_action"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 553
    iget-object v0, p0, Lo/azz;->f:Landroid/content/BroadcastReceiver;

    const-string v1, "com.huawei.android.sns.alarm.permission"

    const/4 v2, 0x0

    invoke-virtual {v3, v0, v4, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 554
    return-void
.end method

.method private final h()Lorg/jivesoftware/smack/XMPPConnection;
    .locals 1

    .line 446
    iget-object v0, p0, Lo/azz;->h:Lo/azt;

    if-eqz v0, :cond_0

    .line 448
    iget-object v0, p0, Lo/azz;->h:Lo/azt;

    invoke-interface {v0}, Lo/azt;->b()Lorg/jivesoftware/smack/XMPPConnection;

    move-result-object v0

    return-object v0

    .line 450
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private i()Landroid/app/AlarmManager;
    .locals 2

    .line 523
    iget-object v0, p0, Lo/azz;->b:Landroid/app/AlarmManager;

    if-nez v0, :cond_0

    .line 525
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    .line 526
    const-string v0, "alarm"

    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    iput-object v0, p0, Lo/azz;->b:Landroid/app/AlarmManager;

    .line 528
    :cond_0
    iget-object v0, p0, Lo/azz;->b:Landroid/app/AlarmManager;

    return-object v0
.end method

.method private k()V
    .locals 2

    .line 512
    invoke-direct {p0}, Lo/azz;->i()Landroid/app/AlarmManager;

    move-result-object v1

    .line 513
    iget-object v0, p0, Lo/azz;->d:Landroid/app/PendingIntent;

    invoke-virtual {v1, v0}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 514
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 134
    const-string v0, "PingModule"

    const-string v1, "start Ping Task."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    invoke-virtual {p0}, Lo/azz;->c()V

    .line 137
    return-void
.end method

.method public b()V
    .locals 2

    .line 144
    const-string v0, "PingModule"

    const-string v1, "stop Ping Task."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    iget-object v0, p0, Lo/azz;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 148
    invoke-static {}, Lo/baa;->e()Lo/baa;

    move-result-object v0

    invoke-virtual {v0}, Lo/baa;->c()V

    .line 150
    invoke-direct {p0}, Lo/azz;->k()V

    .line 151
    return-void
.end method

.method public c()V
    .locals 3

    .line 408
    iget-object v0, p0, Lo/azz;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 409
    invoke-static {}, Lo/baa;->e()Lo/baa;

    move-result-object v0

    invoke-virtual {v0}, Lo/baa;->d()I

    move-result v2

    .line 410
    invoke-direct {p0, v2}, Lo/azz;->e(I)V

    .line 411
    return-void
.end method

.method public c(Lo/azu;)V
    .locals 1

    .line 433
    if-eqz p1, :cond_0

    .line 435
    iget-object v0, p0, Lo/azz;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 437
    :cond_0
    return-void
.end method

.method public d()Z
    .locals 4

    .line 563
    const/4 v2, 0x0

    .line 566
    const/4 v3, 0x1

    :goto_0
    const/4 v0, 0x3

    if-ge v3, v0, :cond_1

    .line 568
    :try_start_0
    invoke-static {}, Lo/baa;->e()Lo/baa;

    move-result-object v0

    invoke-virtual {v0}, Lo/baa;->a()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lo/azz;->a(J)Z
    :try_end_0
    .catch Lorg/jivesoftware/smack/SmackException$NotConnectedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v2, v0

    .line 569
    if-eqz v2, :cond_0

    .line 571
    goto :goto_1

    .line 566
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 578
    :cond_1
    :goto_1
    goto :goto_2

    .line 575
    :catch_0
    move-exception v3

    .line 577
    const-string v0, "PingModule"

    const-string v1, "Ping Server for checking Connection, meet NotConnectedException!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 579
    :goto_2
    return v2
.end method

.method public e(Lo/azt;)V
    .locals 0

    .line 126
    iput-object p1, p0, Lo/azz;->h:Lo/azt;

    .line 127
    return-void
.end method

.method public e(Lo/azu;)V
    .locals 1

    .line 420
    if-eqz p1, :cond_0

    .line 422
    iget-object v0, p0, Lo/azz;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 424
    :cond_0
    return-void
.end method
