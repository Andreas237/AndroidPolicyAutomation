.class public Lo/fps;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fov;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fps$9;,
        Lo/fps$c;,
        Lo/fps$e;
    }
.end annotation


# static fields
.field private static final a:I

.field private static final b:I

.field private static final c:Lo/fty;

.field private static final d:I


# instance fields
.field private final e:Lo/fpz;

.field private f:I

.field private final g:Ljava/util/concurrent/atomic/AtomicInteger;

.field private h:I

.field private i:Ljava/net/InetSocketAddress;

.field private final k:Lo/frr;

.field private l:Lo/fpw;

.field private m:Lo/fps$c;

.field private n:Ljava/net/DatagramSocket;

.field private o:Ljava/util/concurrent/ScheduledExecutorService;

.field private p:Ljava/lang/Object;

.field private q:Lo/fpt;

.field private r:Lo/fsb;

.field private s:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private t:Lo/fpg;

.field private u:Lo/foz;

.field private y:Z

.field private z:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 157
    const-class v0, Lo/fps;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fps;->c:Lo/fty;

    .line 159
    sget-object v0, Lo/fsf;->c:Lo/fsf;

    invoke-virtual {v0}, Lo/fsf;->b()I

    move-result v0

    sput v0, Lo/fps;->d:I

    .line 161
    sget v0, Lo/fps;->d:I

    add-int/lit16 v0, v0, 0x4019

    sput v0, Lo/fps;->a:I

    .line 170
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    mul-int/lit8 v0, v0, 0x6

    sput v0, Lo/fps;->b:I

    return-void
.end method

.method constructor <init>(Lo/fpz;Lo/frr;)V
    .locals 2

    .line 252
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 177
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lo/fps;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 180
    const/16 v0, 0x500

    iput v0, p0, Lo/fps;->h:I

    .line 181
    sget v0, Lo/fps;->a:I

    iput v0, p0, Lo/fps;->f:I

    .line 183
    new-instance v0, Lo/fpw;

    invoke-direct {v0}, Lo/fpw;-><init>()V

    iput-object v0, p0, Lo/fps;->l:Lo/fpw;

    .line 184
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/fps;->p:Ljava/lang/Object;

    .line 196
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo/fps;->s:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 254
    if-nez p1, :cond_0

    .line 255
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Configuration must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 256
    :cond_0
    if-nez p2, :cond_1

    .line 257
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Connection store must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 259
    :cond_1
    iput-object p1, p0, Lo/fps;->e:Lo/fpz;

    .line 260
    iget-object v0, p0, Lo/fps;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v1, p0, Lo/fps;->e:Lo/fpz;

    invoke-virtual {v1}, Lo/fpz;->f()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 261
    iput-object p2, p0, Lo/fps;->k:Lo/frr;

    .line 262
    iget-object v0, p0, Lo/fps;->k:Lo/frr;

    check-cast v0, Lo/fsb;

    iput-object v0, p0, Lo/fps;->r:Lo/fsb;

    .line 264
    return-void
.end method

.method public constructor <init>(Lo/fpz;Lo/fsd;)V
    .locals 4

    .line 238
    new-instance v0, Lo/frg;

    invoke-virtual {p1}, Lo/fpz;->u()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1}, Lo/fpz;->s()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-direct {v0, v1, v2, v3, p2}, Lo/frg;-><init>(IJLo/fsd;)V

    invoke-direct {p0, p1, v0}, Lo/fps;-><init>(Lo/fpz;Lo/frr;)V

    .line 243
    return-void
.end method

.method static synthetic a(Lo/fps;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .line 149
    iget-object v0, p0, Lo/fps;->s:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method private a(Lo/fpd;)Lo/fsb;
    .locals 1

    .line 1365
    new-instance v0, Lo/fps$4;

    invoke-direct {v0, p0, p1}, Lo/fps$4;-><init>(Lo/fps;Lo/fpd;)V

    return-object v0
.end method

.method private a(Ljava/net/InetSocketAddress;)V
    .locals 1

    .line 1741
    if-eqz p1, :cond_0

    .line 1742
    iget-object v0, p0, Lo/fps;->k:Lo/frr;

    invoke-interface {v0, p1}, Lo/frr;->a(Ljava/net/InetSocketAddress;)Lo/fqq;

    .line 1744
    :cond_0
    return-void
.end method

.method private a(Lo/fql;Lo/frl;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 970
    sget-object v0, Lo/fps;->c:Lo/fty;

    invoke-interface {v0}, Lo/fty;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 971
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Processing CLIENT_HELLO from peer ["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 972
    sget-object v0, Lo/fps;->c:Lo/fty;

    invoke-interface {v0}, Lo/fty;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 973
    const-string v0, ":"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 975
    :cond_0
    sget-object v0, Lo/fps;->c:Lo/fty;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/fty;->a(Ljava/lang/String;)V

    .line 980
    :cond_1
    invoke-direct {p0, p1, p2}, Lo/fps;->c(Lo/fql;Lo/frl;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 981
    invoke-virtual {p1}, Lo/fql;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 983
    invoke-direct {p0, p1, p2}, Lo/fps;->b(Lo/fql;Lo/frl;)V

    goto :goto_0

    .line 987
    :cond_2
    invoke-direct {p0, p1, p2}, Lo/fps;->e(Lo/fql;Lo/frl;)V

    .line 990
    :cond_3
    :goto_0
    return-void
.end method

.method private a(Lo/fql;Lo/frl;[B)V
    .locals 10

    .line 1166
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Verifying client IP address [{}] using HELLO_VERIFY_REQUEST"

    invoke-virtual {p2}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1167
    new-instance v7, Lo/frc;

    new-instance v0, Lo/frn;

    invoke-direct {v0}, Lo/frn;-><init>()V

    invoke-virtual {p2}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-direct {v7, v0, p3, v1}, Lo/frc;-><init>(Lo/frn;[BLjava/net/InetSocketAddress;)V

    .line 1172
    invoke-virtual {p1}, Lo/fql;->s()I

    move-result v0

    invoke-virtual {v7, v0}, Lo/frc;->a(I)V

    .line 1176
    new-instance v0, Lo/frl;

    sget-object v1, Lo/fqn;->a:Lo/fqn;

    invoke-virtual {p2}, Lo/frl;->e()J

    move-result-wide v3

    move-object v5, v7

    invoke-virtual {p2}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v6

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v6}, Lo/frl;-><init>(Lo/fqn;IJLo/fqm;Ljava/net/InetSocketAddress;)V

    move-object v8, v0

    .line 1178
    :try_start_0
    invoke-direct {p0, v8}, Lo/fps;->i(Lo/frl;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1181
    goto :goto_0

    .line 1179
    :catch_0
    move-exception v9

    .line 1182
    :goto_0
    return-void
.end method

.method private a(Lo/fqp;)V
    .locals 8

    .line 1491
    iget-object v0, p0, Lo/fps;->e:Lo/fpz;

    invoke-virtual {v0}, Lo/fpz;->a()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 1494
    invoke-virtual {p1}, Lo/fqp;->c()I

    move-result v0

    if-ge v0, v5, :cond_0

    .line 1495
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Re-transmitting flight for [{}], [{}] retransmissions left"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lo/fqp;->e()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p1}, Lo/fqp;->c()I

    move-result v3

    sub-int v3, v5, v3

    add-int/lit8 v3, v3, -0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1499
    :try_start_0
    invoke-virtual {p1}, Lo/fqp;->a()V

    .line 1500
    invoke-virtual {p1}, Lo/fqp;->o()V

    .line 1501
    invoke-direct {p0, p1}, Lo/fps;->d(Lo/fqp;)V

    .line 1504
    invoke-direct {p0, p1}, Lo/fps;->e(Lo/fqp;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1507
    goto :goto_0

    .line 1505
    :catch_0
    move-exception v6

    .line 1506
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Cannot retransmit flight to peer [{}]"

    invoke-virtual {p1}, Lo/fqp;->e()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-interface {v0, v1, v2, v6}, Lo/fty;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1507
    goto :goto_0

    .line 1509
    :cond_0
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Flight for [{}] has reached maximum no. [{}] of retransmissions, discarding ..."

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lo/fqp;->e()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1512
    iget-object v0, p0, Lo/fps;->k:Lo/frr;

    invoke-virtual {p1}, Lo/fqp;->e()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/frr;->b(Ljava/net/InetSocketAddress;)Lo/fqq;

    move-result-object v6

    .line 1513
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 1514
    invoke-virtual {v6}, Lo/fqq;->f()Lo/frd;

    move-result-object v7

    .line 1515
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 1516
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "handshake flight timeout!"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Lo/frd;->c(Ljava/lang/Throwable;)V

    .line 1520
    :cond_1
    :goto_0
    return-void
.end method

.method private a(Lo/fre;Lo/fqq;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 944
    invoke-virtual {p2}, Lo/fqq;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 947
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Ignoring {} received from [{}] while already in an ongoing handshake with peer"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lo/fre;->c()Lo/fra;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p1}, Lo/fre;->e()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 951
    :cond_0
    invoke-virtual {p2}, Lo/fqq;->d()Lo/fqr;

    move-result-object v6

    .line 952
    if-nez v6, :cond_1

    .line 953
    new-instance v6, Lo/fqr;

    invoke-virtual {p1}, Lo/fre;->e()Ljava/net/InetSocketAddress;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {v6, v0, v1}, Lo/fqr;-><init>(Ljava/net/InetSocketAddress;Z)V

    .line 955
    :cond_1
    new-instance v0, Lo/fqi;

    move-object v1, v6

    invoke-direct {p0, p2}, Lo/fps;->b(Lo/fqq;)Lo/frm;

    move-result-object v2

    move-object v3, p2

    iget-object v4, p0, Lo/fps;->e:Lo/fpz;

    iget v5, p0, Lo/fps;->h:I

    invoke-direct/range {v0 .. v5}, Lo/fqi;-><init>(Lo/fqr;Lo/frm;Lo/fsb;Lo/fpz;I)V

    move-object v7, v0

    .line 957
    invoke-direct {p0, v7}, Lo/fps;->c(Lo/frd;)V

    .line 958
    invoke-virtual {v7}, Lo/frd;->e()V

    .line 960
    :goto_0
    return-void
.end method

.method private a(Lo/frl;)V
    .locals 7

    .line 823
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Received {} record from peer [{}]"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lo/frl;->c()Lo/fqn;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p1}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 825
    iget-object v0, p0, Lo/fps;->k:Lo/frr;

    invoke-virtual {p1}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/frr;->b(Ljava/net/InetSocketAddress;)Lo/fqq;

    move-result-object v5

    .line 827
    if-nez v5, :cond_0

    .line 828
    :try_start_0
    invoke-direct {p0, p1}, Lo/fps;->k(Lo/frl;)V

    goto :goto_0

    .line 830
    :cond_0
    invoke-direct {p0, p1, v5}, Lo/fps;->a(Lo/frl;Lo/fqq;)V
    :try_end_0
    .catch Lo/fqx; {:try_start_0 .. :try_end_0} :catch_0

    .line 834
    :goto_0
    goto :goto_1

    .line 832
    :catch_0
    move-exception v6

    .line 833
    invoke-virtual {v6}, Lo/fqx;->d()Lo/fqb;

    move-result-object v0

    invoke-virtual {v0}, Lo/fqb;->d()Lo/fqb$c;

    move-result-object v0

    invoke-virtual {v6}, Lo/fqx;->d()Lo/fqb;

    move-result-object v1

    invoke-virtual {v1}, Lo/fqb;->c()Lo/fqb$b;

    move-result-object v1

    invoke-direct {p0, v6, v0, v1, p1}, Lo/fps;->e(Ljava/lang/Throwable;Lo/fqb$c;Lo/fqb$b;Lo/frl;)V

    .line 835
    :goto_1
    return-void
.end method

.method private a(Lo/frl;Lo/fqq;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 872
    invoke-virtual {p2}, Lo/fqq;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 873
    invoke-virtual {p2}, Lo/fqq;->f()Lo/frd;

    move-result-object v0

    invoke-virtual {v0}, Lo/frd;->k()Lo/fqr;

    move-result-object v5

    .line 874
    invoke-virtual {v5}, Lo/fqr;->h()I

    move-result v0

    invoke-virtual {p1}, Lo/frl;->b()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 876
    invoke-virtual {p1, v5}, Lo/frl;->a(Lo/fqr;)V

    goto :goto_0

    .line 877
    :cond_0
    invoke-virtual {p1}, Lo/frl;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 881
    invoke-virtual {p2}, Lo/fqq;->f()Lo/frd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/frd;->b(Lo/frl;)V

    .line 882
    return-void

    .line 884
    :cond_1
    :goto_0
    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Lo/fqq;->k()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Lo/fqq;->d()Lo/fqr;

    move-result-object v0

    invoke-virtual {v0}, Lo/fqr;->h()I

    move-result v0

    invoke-virtual {p1}, Lo/frl;->b()I

    move-result v1

    if-ne v0, v1, :cond_3

    .line 887
    invoke-virtual {p2}, Lo/fqq;->d()Lo/fqr;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/frl;->a(Lo/fqr;)V

    goto :goto_1

    .line 888
    :cond_3
    invoke-virtual {p1}, Lo/frl;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_1

    .line 892
    :cond_4
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Discarding HANDSHAKE message [epoch={}] from peer [{}] which does not match expected epoch(s)"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lo/frl;->b()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p1}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 895
    return-void

    .line 899
    :goto_1
    :try_start_0
    invoke-virtual {p1}, Lo/frl;->h()Lo/fqm;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/fqy;

    .line 900
    invoke-direct {p0, v5, p1, p2}, Lo/fps;->c(Lo/fqy;Lo/frl;Lo/fqq;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 903
    goto :goto_2

    .line 901
    :catch_0
    move-exception v5

    .line 902
    invoke-static {p1, v5}, Lo/fps;->e(Lo/frl;Ljava/lang/Throwable;)V

    .line 904
    :goto_2
    return-void
.end method

.method private a(Lo/frl;Lo/fqq;Lo/fqr;)V
    .locals 10

    .line 765
    invoke-virtual {p1, p3}, Lo/frl;->a(Lo/fqr;)V

    .line 767
    :try_start_0
    invoke-virtual {p1}, Lo/frl;->h()Lo/fqm;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/fqb;

    .line 768
    invoke-virtual {p2}, Lo/fqq;->f()Lo/frd;

    move-result-object v6

    .line 769
    const/4 v7, 0x0

    .line 770
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Processing {} ALERT from [{}]: {}"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v5}, Lo/fqb;->d()Lo/fqb$c;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v5}, Lo/fqb;->e()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {v5}, Lo/fqb;->c()Lo/fqb$b;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 772
    sget-object v0, Lo/fqb$b;->b:Lo/fqb$b;

    invoke-virtual {v5}, Lo/fqb;->c()Lo/fqb$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fqb$b;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 777
    new-instance v7, Lo/fqx;

    const-string v0, "Received \'close notify\'"

    invoke-direct {v7, v0, v5}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    .line 778
    new-instance v0, Lo/fqb;

    sget-object v1, Lo/fqb$c;->b:Lo/fqb$c;

    sget-object v2, Lo/fqb$b;->b:Lo/fqb$b;

    invoke-virtual {v5}, Lo/fqb;->e()Ljava/net/InetSocketAddress;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {p0, p2, v0, p3}, Lo/fps;->e(Lo/fqq;Lo/fqb;Lo/fqr;)V

    goto :goto_0

    .line 782
    :cond_0
    sget-object v0, Lo/fqb$c;->c:Lo/fqb$c;

    invoke-virtual {v5}, Lo/fqb;->d()Lo/fqb$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fqb$c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 786
    new-instance v7, Lo/fqx;

    const-string v0, "Received \'fatal alert\'"

    invoke-direct {v7, v0, v5}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    .line 787
    invoke-direct {p0, p2}, Lo/fps;->e(Lo/fqq;)V

    .line 792
    :cond_1
    :goto_0
    iget-object v8, p0, Lo/fps;->p:Ljava/lang/Object;

    monitor-enter v8
    :try_end_0
    .catch Lo/fqx; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 793
    :try_start_1
    iget-object v0, p0, Lo/fps;->q:Lo/fpt;

    if-eqz v0, :cond_2

    .line 794
    iget-object v0, p0, Lo/fps;->q:Lo/fpt;

    invoke-virtual {v5}, Lo/fqb;->e()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {v5}, Lo/fqb;->d()Lo/fqb$c;

    move-result-object v2

    invoke-virtual {v5}, Lo/fqb;->c()Lo/fqb$b;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lo/fpt;->c(Ljava/net/InetSocketAddress;Lo/fqb$c;Lo/fqb$b;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 796
    :cond_2
    monitor-exit v8

    goto :goto_1

    :catchall_0
    move-exception v9

    monitor-exit v8

    :try_start_2
    throw v9

    .line 797
    :goto_1
    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    .line 798
    invoke-virtual {v6, v7}, Lo/frd;->c(Ljava/lang/Throwable;)V
    :try_end_2
    .catch Lo/fqx; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_2 .. :try_end_2} :catch_0

    .line 802
    :cond_3
    goto :goto_2

    .line 800
    :catch_0
    move-exception v5

    .line 801
    invoke-static {p1, v5}, Lo/fps;->e(Lo/frl;Ljava/lang/Throwable;)V

    .line 803
    :goto_2
    return-void
.end method

.method static synthetic b(Lo/fps;)I
    .locals 1

    .line 149
    iget v0, p0, Lo/fps;->f:I

    return v0
.end method

.method private b(Lo/fqq;)Lo/frm;
    .locals 1

    .line 1619
    new-instance v0, Lo/fps$8;

    invoke-direct {v0, p0, p1}, Lo/fps$8;-><init>(Lo/fps;Lo/fqq;)V

    return-object v0
.end method

.method private b(Ljava/net/DatagramPacket;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1474
    invoke-direct {p0}, Lo/fps;->f()Ljava/net/DatagramSocket;

    move-result-object v3

    .line 1475
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/net/DatagramSocket;->isClosed()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1477
    :try_start_0
    invoke-virtual {v3, p1}, Ljava/net/DatagramSocket;->send(Ljava/net/DatagramPacket;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1481
    goto :goto_0

    .line 1478
    :catch_0
    move-exception v4

    .line 1479
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Could not send record"

    invoke-interface {v0, v1, v4}, Lo/fty;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1480
    throw v4

    .line 1483
    :cond_0
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Socket [{}] is closed, discarding packet ..."

    iget-object v2, p0, Lo/fps;->e:Lo/fpz;

    invoke-virtual {v2}, Lo/fpz;->i()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1484
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Socket closed."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1486
    :goto_0
    return-void
.end method

.method private b(Lo/fql;Lo/frl;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 1100
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Client [{}] wants to resume session with ID [{}]"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lo/fql;->e()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p1}, Lo/fql;->k()Lo/fsa;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1102
    iget-object v0, p0, Lo/fps;->k:Lo/frr;

    invoke-virtual {p1}, Lo/fql;->k()Lo/fsa;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/frr;->b(Lo/fsa;)Lo/fqq;

    move-result-object v7

    .line 1103
    if-eqz v7, :cond_4

    invoke-virtual {v7}, Lo/fqq;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1106
    new-instance v8, Lo/fqq;

    invoke-virtual {p2}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v0

    iget-object v1, p0, Lo/fps;->e:Lo/fpz;

    invoke-virtual {v1}, Lo/fpz;->q()Ljava/lang/Long;

    move-result-object v1

    invoke-direct {v8, v0, v1}, Lo/fqq;-><init>(Ljava/net/InetSocketAddress;Ljava/lang/Long;)V

    .line 1107
    const/4 v9, 0x0

    .line 1108
    invoke-virtual {v7}, Lo/fqq;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1109
    invoke-virtual {v7}, Lo/fqq;->d()Lo/fqr;

    move-result-object v0

    invoke-virtual {v0}, Lo/fqr;->r()Lo/fsc;

    move-result-object v9

    goto :goto_0

    .line 1110
    :cond_0
    invoke-virtual {v7}, Lo/fqq;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1111
    invoke-virtual {v7}, Lo/fqq;->a()Lo/fsc;

    move-result-object v9

    .line 1115
    :cond_1
    :goto_0
    new-instance v0, Lo/fqr;

    invoke-virtual {p1}, Lo/fql;->k()Lo/fsa;

    move-result-object v1

    invoke-virtual {p2}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v2

    move-object v3, v9

    invoke-virtual {p2}, Lo/frl;->e()J

    move-result-wide v4

    invoke-direct/range {v0 .. v5}, Lo/fqr;-><init>(Lo/fsa;Ljava/net/InetSocketAddress;Lo/fsc;J)V

    move-object v10, v0

    .line 1118
    new-instance v0, Lo/frt;

    invoke-virtual {p1}, Lo/fql;->s()I

    move-result v1

    move-object v2, v10

    invoke-direct {p0, v8}, Lo/fps;->b(Lo/fqq;)Lo/frm;

    move-result-object v3

    move-object v4, v8

    iget-object v5, p0, Lo/fps;->e:Lo/fpz;

    iget v6, p0, Lo/fps;->h:I

    invoke-direct/range {v0 .. v6}, Lo/frt;-><init>(ILo/fqr;Lo/frm;Lo/fsb;Lo/fpz;I)V

    move-object v11, v0

    .line 1120
    invoke-direct {p0, v11}, Lo/fps;->c(Lo/frd;)V

    .line 1122
    invoke-virtual {v7}, Lo/fqq;->k()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1125
    invoke-virtual {v7}, Lo/fqq;->c()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-virtual {v8}, Lo/fqq;->c()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/net/InetSocketAddress;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1127
    new-instance v0, Lo/fps$3;

    invoke-direct {v0, p0, v7}, Lo/fps$3;-><init>(Lo/fps;Lo/fqq;)V

    invoke-virtual {v11, v0}, Lo/frd;->a(Lo/fsb;)V

    goto :goto_1

    .line 1142
    :cond_2
    invoke-direct {p0, v7}, Lo/fps;->e(Lo/fqq;)V

    .line 1150
    :cond_3
    :goto_1
    iget-object v0, p0, Lo/fps;->k:Lo/frr;

    invoke-interface {v0, v8}, Lo/frr;->d(Lo/fqq;)Z

    .line 1153
    invoke-virtual {v11, p2}, Lo/frd;->b(Lo/frl;)V

    .line 1154
    goto :goto_2

    .line 1155
    :cond_4
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Client [{}] tries to resume non-existing session [ID={}], performing full handshake instead ..."

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lo/fql;->e()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p1}, Lo/fql;->k()Lo/fsa;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1158
    invoke-virtual {p1}, Lo/fql;->e()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fps;->c(Ljava/net/InetSocketAddress;)V

    .line 1159
    invoke-direct {p0, p1, p2}, Lo/fps;->e(Lo/fql;Lo/frl;)V

    .line 1161
    :goto_2
    return-void
.end method

.method private b(Lo/fql;Lo/frl;Lo/fqq;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 1001
    sget-object v0, Lo/fps;->c:Lo/fty;

    invoke-interface {v0}, Lo/fty;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1002
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Processing CLIENT_HELLO from peer ["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 1003
    sget-object v0, Lo/fps;->c:Lo/fty;

    invoke-interface {v0}, Lo/fty;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1004
    const-string v0, ":"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1006
    :cond_0
    sget-object v0, Lo/fps;->c:Lo/fty;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/fty;->a(Ljava/lang/String;)V

    .line 1011
    :cond_1
    invoke-direct {p0, p1, p2}, Lo/fps;->c(Lo/fql;Lo/frl;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1012
    invoke-static {p1, p3}, Lo/fps;->c(Lo/fql;Lo/fqq;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1016
    invoke-static {p1, p2, p3}, Lo/fps;->d(Lo/fqy;Lo/frl;Lo/fqq;)V

    goto :goto_0

    .line 1017
    :cond_2
    invoke-virtual {p1}, Lo/fql;->h()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1019
    invoke-direct {p0, p1, p2}, Lo/fps;->b(Lo/fql;Lo/frl;)V

    goto :goto_0

    .line 1024
    :cond_3
    invoke-direct {p0, p3}, Lo/fps;->e(Lo/fqq;)V

    .line 1025
    invoke-direct {p0, p1, p2}, Lo/fps;->e(Lo/fql;Lo/frl;)V

    .line 1028
    :cond_4
    :goto_0
    return-void
.end method

.method private b(Lo/frl;)V
    .locals 5

    .line 806
    iget-object v0, p0, Lo/fps;->k:Lo/frr;

    invoke-virtual {p1}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/frr;->b(Ljava/net/InetSocketAddress;)Lo/fqq;

    move-result-object v3

    .line 807
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lo/fqq;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 810
    :try_start_0
    invoke-virtual {v3}, Lo/fqq;->f()Lo/frd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/frd;->b(Lo/frl;)V
    :try_end_0
    .catch Lo/fqx; {:try_start_0 .. :try_end_0} :catch_0

    .line 813
    goto :goto_0

    .line 811
    :catch_0
    move-exception v4

    .line 812
    invoke-virtual {v4}, Lo/fqx;->d()Lo/fqb;

    move-result-object v0

    invoke-virtual {v0}, Lo/fqb;->d()Lo/fqb$c;

    move-result-object v0

    invoke-virtual {v4}, Lo/fqx;->d()Lo/fqb;

    move-result-object v1

    invoke-virtual {v1}, Lo/fqb;->c()Lo/fqb$b;

    move-result-object v1

    invoke-direct {p0, v4, v0, v1, p1}, Lo/fps;->e(Ljava/lang/Throwable;Lo/fqb$c;Lo/fqb$b;Lo/frl;)V

    .line 813
    goto :goto_0

    .line 817
    :cond_0
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Received CHANGE_CIPHER_SPEC record from peer [{}] with no handshake going on"

    invoke-virtual {p1}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 819
    :goto_0
    return-void
.end method

.method private b(Lo/frl;Lo/fqq;)V
    .locals 5

    .line 753
    invoke-virtual {p2}, Lo/fqq;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lo/fqq;->d()Lo/fqr;

    move-result-object v0

    invoke-virtual {v0}, Lo/fqr;->h()I

    move-result v0

    invoke-virtual {p1}, Lo/frl;->b()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 754
    invoke-virtual {p2}, Lo/fqq;->d()Lo/fqr;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lo/fps;->a(Lo/frl;Lo/fqq;Lo/fqr;)V

    goto :goto_0

    .line 755
    :cond_0
    invoke-virtual {p2}, Lo/fqq;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lo/fqq;->f()Lo/frd;

    move-result-object v0

    invoke-virtual {v0}, Lo/frd;->k()Lo/fqr;

    move-result-object v0

    invoke-virtual {v0}, Lo/fqr;->h()I

    move-result v0

    invoke-virtual {p1}, Lo/frl;->b()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 756
    invoke-virtual {p2}, Lo/fqq;->f()Lo/frd;

    move-result-object v0

    invoke-virtual {v0}, Lo/frd;->k()Lo/fqr;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lo/fps;->a(Lo/frl;Lo/fqq;Lo/fqr;)V

    goto :goto_0

    .line 758
    :cond_1
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Epoch of ALERT record [epoch={}] from [{}] does not match expected epoch(s), discarding ..."

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lo/frl;->b()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p1}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 762
    :goto_0
    return-void
.end method

.method static synthetic c(Lo/fps;)Lo/fpz;
    .locals 1

    .line 149
    iget-object v0, p0, Lo/fps;->e:Lo/fpz;

    return-object v0
.end method

.method private c(Ljava/net/InetSocketAddress;)V
    .locals 1

    .line 620
    if-eqz p1, :cond_0

    .line 621
    iget-object v0, p0, Lo/fps;->k:Lo/frr;

    invoke-interface {v0, p1}, Lo/frr;->b(Ljava/net/InetSocketAddress;)Lo/fqq;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fps;->e(Lo/fqq;)V

    .line 623
    :cond_0
    return-void
.end method

.method private c(Ljava/net/InetSocketAddress;Ljava/lang/Throwable;Lo/fqb$c;Lo/fqb$b;)V
    .locals 3

    .line 634
    iget-object v0, p0, Lo/fps;->k:Lo/frr;

    invoke-interface {v0, p1}, Lo/frr;->b(Ljava/net/InetSocketAddress;)Lo/fqq;

    move-result-object v2

    .line 635
    if-eqz v2, :cond_1

    .line 636
    invoke-virtual {v2}, Lo/fqq;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 637
    new-instance v0, Lo/fqb;

    invoke-direct {v0, p3, p4, p1}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-virtual {v2}, Lo/fqq;->d()Lo/fqr;

    move-result-object v1

    invoke-direct {p0, v2, v0, v1}, Lo/fps;->e(Lo/fqq;Lo/fqb;Lo/fqr;)V

    goto :goto_0

    .line 641
    :cond_0
    invoke-virtual {v2}, Lo/fqq;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 642
    new-instance v0, Lo/fqb;

    invoke-direct {v0, p3, p4, p1}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-virtual {v2}, Lo/fqq;->f()Lo/frd;

    move-result-object v1

    invoke-virtual {v1}, Lo/frd;->k()Lo/fqr;

    move-result-object v1

    invoke-direct {p0, v2, v0, v1}, Lo/fps;->e(Lo/fqq;Lo/fqb;Lo/fqr;)V

    .line 648
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic c(Lo/fps;Lo/fpd;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 149
    invoke-direct {p0, p1}, Lo/fps;->d(Lo/fpd;)V

    return-void
.end method

.method static synthetic c(Lo/fps;Lo/fqp;)V
    .locals 0

    .line 149
    invoke-direct {p0, p1}, Lo/fps;->a(Lo/fqp;)V

    return-void
.end method

.method static synthetic c(Lo/fps;Lo/fqq;)V
    .locals 0

    .line 149
    invoke-direct {p0, p1}, Lo/fps;->e(Lo/fqq;)V

    return-void
.end method

.method private c(Lo/fqy;Lo/frl;Lo/fqq;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 908
    sget-object v0, Lo/fps$9;->c:[I

    invoke-virtual {p1}, Lo/fqy;->c()Lo/fra;

    move-result-object v1

    invoke-virtual {v1}, Lo/fra;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 910
    :sswitch_0
    move-object v0, p1

    check-cast v0, Lo/fql;

    invoke-direct {p0, v0, p2, p3}, Lo/fps;->b(Lo/fql;Lo/frl;Lo/fqq;)V

    .line 911
    goto :goto_1

    .line 913
    :sswitch_1
    move-object v0, p1

    check-cast v0, Lo/fre;

    invoke-direct {p0, v0, p3}, Lo/fps;->a(Lo/fre;Lo/fqq;)V

    .line 914
    goto :goto_1

    .line 916
    :goto_0
    invoke-static {p1, p2, p3}, Lo/fps;->d(Lo/fqy;Lo/frl;Lo/fqq;)V

    .line 918
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method private c(Lo/frd;)V
    .locals 1

    .line 1359
    iget-object v0, p0, Lo/fps;->r:Lo/fsb;

    if-eqz v0, :cond_0

    .line 1360
    iget-object v0, p0, Lo/fps;->r:Lo/fsb;

    invoke-virtual {p1, v0}, Lo/frd;->a(Lo/fsb;)V

    .line 1362
    :cond_0
    return-void
.end method

.method private c(Lo/frl;)V
    .locals 10

    .line 685
    const/4 v4, 0x0

    .line 686
    iget-object v0, p0, Lo/fps;->k:Lo/frr;

    invoke-virtual {p1}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/frr;->b(Ljava/net/InetSocketAddress;)Lo/fqq;

    move-result-object v5

    .line 687
    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lo/fqq;->d()Lo/fqr;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 688
    const/4 v6, 0x0

    .line 689
    move-object v7, v4

    monitor-enter v7

    .line 693
    :try_start_0
    invoke-virtual {p1}, Lo/frl;->b()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1}, Lo/frl;->e()J

    move-result-wide v2

    invoke-virtual {v4, v0, v1, v2, v3}, Lo/fqr;->c(JJ)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    .line 697
    :try_start_1
    invoke-virtual {p1, v4}, Lo/frl;->a(Lo/fqr;)V

    .line 698
    invoke-virtual {p1}, Lo/frl;->h()Lo/fqm;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/fqa;

    .line 701
    invoke-virtual {p1}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/fqq;->e(Ljava/net/InetSocketAddress;)V

    .line 702
    invoke-virtual {p1}, Lo/frl;->b()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1}, Lo/frl;->e()J

    move-result-wide v2

    invoke-virtual {v4, v0, v1, v2, v3}, Lo/fqr;->b(JJ)V

    .line 704
    invoke-virtual {v8}, Lo/fqa;->d()[B

    move-result-object v0

    invoke-virtual {v4}, Lo/fqr;->a()Lo/fou;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/fpd;->e([BLo/fow;Z)Lo/fpd;

    move-result-object v0

    move-object v6, v0

    .line 705
    invoke-virtual {v5}, Lo/fqq;->n()V
    :try_end_1
    .catch Lo/fqx; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 709
    goto :goto_0

    .line 706
    :catch_0
    move-exception v8

    .line 708
    :try_start_2
    invoke-static {p1, v8}, Lo/fps;->e(Lo/frl;Ljava/lang/Throwable;)V

    .line 709
    goto :goto_0

    .line 711
    :cond_0
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Discarding duplicate APPLICATION_DATA record received from peer [{}]"

    invoke-virtual {p1}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 714
    :goto_0
    monitor-exit v7

    goto :goto_1

    :catchall_0
    move-exception v9

    monitor-exit v7

    throw v9

    .line 715
    :goto_1
    iget-object v7, p0, Lo/fps;->t:Lo/fpg;

    .line 717
    if-eqz v7, :cond_1

    if-eqz v6, :cond_1

    .line 718
    invoke-interface {v7, v6}, Lo/fpg;->c(Lo/fpd;)V

    .line 720
    :cond_1
    goto :goto_2

    .line 721
    :cond_2
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Discarding APPLICATION_DATA record received from peer [{}] without an active session"

    invoke-virtual {p1}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 724
    :goto_2
    return-void
.end method

.method private static c(Lo/fql;Lo/fqq;)Z
    .locals 1

    .line 1031
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lo/fqq;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lo/fqq;->f()Lo/frd;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/frd;->a(Lo/fqy;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private c(Lo/fql;Lo/frl;)Z
    .locals 7

    .line 1057
    :try_start_0
    iget-object v0, p0, Lo/fps;->l:Lo/fpw;

    invoke-virtual {v0, p1}, Lo/fpw;->a(Lo/fql;)[B

    move-result-object v6

    .line 1058
    invoke-virtual {p1}, Lo/fql;->l()[B

    move-result-object v0

    invoke-static {v6, v0}, Ljava/util/Arrays;->equals([B[B)Z
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_0

    .line 1059
    const/4 v0, 0x1

    return v0

    .line 1061
    :cond_0
    :try_start_1
    invoke-direct {p0, p1, p2, v6}, Lo/fps;->a(Lo/fql;Lo/frl;[B)V
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_0

    .line 1062
    const/4 v0, 0x0

    return v0

    .line 1064
    :catch_0
    move-exception v6

    .line 1065
    new-instance v0, Lo/fqt;

    const-string v1, "Cannot compute cookie for peer"

    sget-object v2, Lo/fqb$b;->y:Lo/fqb$b;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    invoke-virtual {p1}, Lo/fql;->e()Ljava/net/InetSocketAddress;

    move-result-object v4

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, Lo/fqt;-><init>(Ljava/lang/String;Lo/fqb$b;Lo/fqb$c;Ljava/net/InetSocketAddress;Ljava/lang/Throwable;)V

    throw v0
.end method

.method static synthetic d(Lo/fps;)Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 149
    iget-object v0, p0, Lo/fps;->z:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method private d(Ljava/net/DatagramPacket;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 498
    invoke-direct {p0}, Lo/fps;->f()Ljava/net/DatagramSocket;

    move-result-object v5

    .line 499
    if-nez v5, :cond_0

    .line 501
    return-void

    .line 504
    :cond_0
    invoke-virtual {v5, p1}, Ljava/net/DatagramSocket;->receive(Ljava/net/DatagramPacket;)V

    .line 506
    invoke-virtual {p1}, Ljava/net/DatagramPacket;->getLength()I

    move-result v0

    if-nez v0, :cond_1

    .line 508
    return-void

    .line 510
    :cond_1
    new-instance v6, Ljava/net/InetSocketAddress;

    invoke-virtual {p1}, Ljava/net/DatagramPacket;->getAddress()Ljava/net/InetAddress;

    move-result-object v0

    invoke-virtual {p1}, Ljava/net/DatagramPacket;->getPort()I

    move-result v1

    invoke-direct {v6, v0, v1}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 512
    invoke-virtual {p1}, Ljava/net/DatagramPacket;->getData()[B

    move-result-object v0

    invoke-virtual {p1}, Ljava/net/DatagramPacket;->getOffset()I

    move-result v1

    invoke-virtual {p1}, Ljava/net/DatagramPacket;->getLength()I

    move-result v2

    invoke-static {v0, v1, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v7

    .line 513
    invoke-static {v7, v6}, Lo/frl;->b([BLjava/net/InetSocketAddress;)Ljava/util/List;

    move-result-object v8

    .line 514
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Received {} DTLS records using a {} byte datagram buffer"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget v3, p0, Lo/fps;->f:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 517
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/frl;

    .line 520
    :try_start_0
    sget-object v0, Lo/fps$9;->b:[I

    invoke-virtual {v10}, Lo/frl;->c()Lo/fqn;

    move-result-object v1

    invoke-virtual {v1}, Lo/fqn;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 525
    :pswitch_0
    iget-object v0, p0, Lo/fps;->z:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/fps$1;

    invoke-direct {v1, p0, v10}, Lo/fps$1;-><init>(Lo/fps;Lo/frl;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 537
    goto :goto_2

    .line 539
    :goto_1
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Discarding unsupported record [type: {}, peer: {}]"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v10}, Lo/frl;->c()Lo/fqn;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v10}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 548
    :goto_2
    goto :goto_3

    .line 543
    :catch_0
    move-exception v11

    .line 544
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Unexpected error occurred while processing record [type: {}, peer: {}]"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v10}, Lo/frl;->c()Lo/fqn;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object v6, v2, v3

    const/4 v3, 0x2

    aput-object v11, v2, v3

    invoke-interface {v0, v1, v2}, Lo/fty;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 546
    sget-object v0, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v1, Lo/fqb$b;->y:Lo/fqb$b;

    invoke-direct {p0, v6, v11, v0, v1}, Lo/fps;->c(Ljava/net/InetSocketAddress;Ljava/lang/Throwable;Lo/fqb$c;Lo/fqb$b;)V

    .line 547
    goto :goto_4

    .line 549
    :goto_3
    goto/16 :goto_0

    .line 550
    :cond_2
    :goto_4
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private d(Ljava/net/InetSocketAddress;Ljava/lang/Throwable;Lo/fqb$b;)V
    .locals 9

    .line 597
    iget-object v0, p0, Lo/fps;->k:Lo/frr;

    invoke-interface {v0, p1}, Lo/frr;->b(Ljava/net/InetSocketAddress;)Lo/fqq;

    move-result-object v5

    .line 598
    if-eqz v5, :cond_3

    invoke-virtual {v5}, Lo/fqq;->h()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 599
    sget-object v0, Lo/fps;->c:Lo/fty;

    invoke-interface {v0}, Lo/fty;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 600
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Aborting handshake with peer [{}]:"

    invoke-interface {v0, v1, p1, p2}, Lo/fty;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 601
    :cond_0
    sget-object v0, Lo/fps;->c:Lo/fty;

    invoke-interface {v0}, Lo/fty;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 602
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Aborting handshake with peer [{}]: {}"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 605
    :cond_1
    :goto_0
    invoke-virtual {v5}, Lo/fqq;->f()Lo/frd;

    move-result-object v6

    .line 606
    invoke-virtual {v6}, Lo/frd;->k()Lo/fqr;

    move-result-object v7

    .line 607
    new-instance v8, Lo/fqb;

    sget-object v0, Lo/fqb$c;->c:Lo/fqb$c;

    invoke-direct {v8, v0, p3, p1}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    .line 608
    invoke-virtual {v5}, Lo/fqq;->k()Z

    move-result v0

    if-nez v0, :cond_2

    .line 609
    invoke-direct {p0, v5, v8, v7}, Lo/fps;->e(Lo/fqq;Lo/fqb;Lo/fqr;)V

    goto :goto_1

    .line 612
    :cond_2
    invoke-virtual {p0, v8, v7}, Lo/fps;->d(Lo/fqb;Lo/fqr;)V

    .line 613
    invoke-virtual {v5}, Lo/fqq;->g()V

    .line 615
    :goto_1
    invoke-virtual {v6, p2}, Lo/frd;->c(Ljava/lang/Throwable;)V

    .line 617
    :cond_3
    return-void
.end method

.method private d(Lo/fpd;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 1260
    invoke-virtual {p1}, Lo/fpd;->e()Ljava/net/InetSocketAddress;

    move-result-object v6

    .line 1261
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Sending application layer message to peer [{}]"

    invoke-interface {v0, v1, v6}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1262
    iget-object v0, p0, Lo/fps;->k:Lo/frr;

    invoke-interface {v0, v6}, Lo/frr;->b(Ljava/net/InetSocketAddress;)Lo/fqq;

    move-result-object v7

    .line 1267
    if-nez v7, :cond_0

    .line 1268
    new-instance v7, Lo/fqq;

    iget-object v0, p0, Lo/fps;->e:Lo/fpz;

    invoke-virtual {v0}, Lo/fpz;->q()Ljava/lang/Long;

    move-result-object v0

    invoke-direct {v7, v6, v0}, Lo/fqq;-><init>(Ljava/net/InetSocketAddress;Ljava/lang/Long;)V

    .line 1269
    iget-object v0, p0, Lo/fps;->k:Lo/frr;

    invoke-interface {v0, v7}, Lo/frr;->d(Lo/fqq;)Z

    .line 1272
    :cond_0
    invoke-virtual {v7}, Lo/fqq;->d()Lo/fqr;

    move-result-object v8

    .line 1273
    if-nez v8, :cond_2

    .line 1274
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/fps;->e(Lo/fpd;Lo/fow;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1275
    return-void

    .line 1279
    :cond_1
    new-instance v0, Lo/fqi;

    new-instance v1, Lo/fqr;

    const/4 v2, 0x1

    invoke-direct {v1, v6, v2}, Lo/fqr;-><init>(Ljava/net/InetSocketAddress;Z)V

    invoke-direct {p0, v7}, Lo/fps;->b(Lo/fqq;)Lo/frm;

    move-result-object v2

    move-object v3, v7

    iget-object v4, p0, Lo/fps;->e:Lo/fpz;

    iget v5, p0, Lo/fps;->h:I

    invoke-direct/range {v0 .. v5}, Lo/fqi;-><init>(Lo/fqr;Lo/frm;Lo/fsb;Lo/fpz;I)V

    move-object v9, v0

    .line 1281
    invoke-direct {p0, v9}, Lo/fps;->c(Lo/frd;)V

    .line 1282
    invoke-direct {p0, p1}, Lo/fps;->a(Lo/fpd;)Lo/fsb;

    move-result-object v0

    invoke-virtual {v9, v0}, Lo/frd;->a(Lo/fsb;)V

    .line 1283
    invoke-virtual {v9}, Lo/frd;->e()V

    .line 1284
    goto :goto_0

    .line 1286
    :cond_2
    invoke-virtual {v7}, Lo/fqq;->l()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1288
    new-instance v0, Lo/fqr;

    invoke-virtual {v8}, Lo/fqr;->e()Lo/fsa;

    move-result-object v1

    move-object v2, v6

    invoke-virtual {v8}, Lo/fqr;->r()Lo/fsc;

    move-result-object v3

    const-wide/16 v4, 0x0

    invoke-direct/range {v0 .. v5}, Lo/fqr;-><init>(Lo/fsa;Ljava/net/InetSocketAddress;Lo/fsc;J)V

    move-object v9, v0

    .line 1291
    new-instance v10, Lo/fqq;

    iget-object v0, p0, Lo/fps;->e:Lo/fpz;

    invoke-virtual {v0}, Lo/fpz;->q()Ljava/lang/Long;

    move-result-object v0

    invoke-direct {v10, v6, v0}, Lo/fqq;-><init>(Ljava/net/InetSocketAddress;Ljava/lang/Long;)V

    .line 1292
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v7, v0, v1}, Lo/fps;->e(Lo/fqq;Lo/fqb;Lo/fqr;)V

    .line 1293
    iget-object v0, p0, Lo/fps;->k:Lo/frr;

    invoke-interface {v0, v10}, Lo/frr;->d(Lo/fqq;)Z

    .line 1294
    new-instance v0, Lo/frp;

    move-object v1, v9

    invoke-direct {p0, v10}, Lo/fps;->b(Lo/fqq;)Lo/frm;

    move-result-object v2

    move-object v3, v10

    iget-object v4, p0, Lo/fps;->e:Lo/fpz;

    iget v5, p0, Lo/fps;->h:I

    invoke-direct/range {v0 .. v5}, Lo/frp;-><init>(Lo/fqr;Lo/frm;Lo/fsb;Lo/fpz;I)V

    move-object v11, v0

    .line 1296
    invoke-direct {p0, v11}, Lo/fps;->c(Lo/frd;)V

    .line 1297
    invoke-direct {p0, p1}, Lo/fps;->a(Lo/fpd;)Lo/fsb;

    move-result-object v0

    invoke-virtual {v11, v0}, Lo/frd;->a(Lo/fsb;)V

    .line 1298
    invoke-virtual {v11}, Lo/frd;->e()V

    .line 1299
    goto :goto_0

    .line 1301
    :cond_3
    invoke-direct {p0, p1, v8}, Lo/fps;->e(Lo/fpd;Lo/fqr;)V

    .line 1303
    :goto_0
    return-void
.end method

.method static synthetic d(Lo/fps;Lo/frl;)V
    .locals 0

    .line 149
    invoke-direct {p0, p1}, Lo/fps;->d(Lo/frl;)V

    return-void
.end method

.method private d(Lo/fqp;)V
    .locals 12

    .line 1413
    const/4 v0, 0x0

    new-array v5, v0, [B

    .line 1414
    iget v6, p0, Lo/fps;->h:I

    .line 1415
    invoke-virtual {p1}, Lo/fqp;->d()Lo/fqr;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1419
    invoke-virtual {p1}, Lo/fqp;->d()Lo/fqr;

    move-result-object v0

    invoke-virtual {v0}, Lo/fqr;->o()I

    move-result v6

    .line 1423
    :cond_0
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1426
    :try_start_0
    invoke-virtual {p1}, Lo/fqp;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/frl;

    .line 1428
    invoke-virtual {v9}, Lo/frl;->d()[B

    move-result-object v10

    .line 1429
    array-length v0, v10

    if-le v0, v6, :cond_1

    .line 1430
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "{} record of {} bytes for peer [{}] exceeds max. datagram size [{}], discarding..."

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v9}, Lo/frl;->c()Lo/fqn;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    array-length v3, v10

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {v9}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x3

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1434
    goto :goto_0

    .line 1436
    :cond_1
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Sending record of {} bytes to peer [{}]:\n{}"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    array-length v3, v10

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p1}, Lo/fqp;->e()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x2

    aput-object v9, v2, v3

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1440
    array-length v0, v5

    array-length v1, v10

    add-int/2addr v0, v1

    if-le v0, v6, :cond_2

    .line 1443
    new-instance v11, Ljava/net/DatagramPacket;

    array-length v0, v5

    invoke-virtual {p1}, Lo/fqp;->e()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v1

    invoke-virtual {p1}, Lo/fqp;->e()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v2

    invoke-direct {v11, v5, v0, v1, v2}, Ljava/net/DatagramPacket;-><init>([BILjava/net/InetAddress;I)V

    .line 1445
    invoke-interface {v7, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1446
    const/4 v0, 0x0

    new-array v5, v0, [B

    .line 1449
    :cond_2
    invoke-static {v5, v10}, Lo/fsp;->c([B[B)[B

    move-result-object v5

    .line 1450
    goto/16 :goto_0

    .line 1452
    :cond_3
    new-instance v8, Ljava/net/DatagramPacket;

    array-length v0, v5

    invoke-virtual {p1}, Lo/fqp;->e()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v1

    invoke-virtual {p1}, Lo/fqp;->e()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v2

    invoke-direct {v8, v5, v0, v1, v2}, Ljava/net/DatagramPacket;-><init>([BILjava/net/InetAddress;I)V

    .line 1454
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1457
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Sending flight of {} message(s) to peer [{}] using {} datagram(s) of max. {} bytes"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lo/fqp;->b()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p1}, Lo/fqp;->e()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x3

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1459
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/net/DatagramPacket;

    .line 1460
    invoke-direct {p0, v10}, Lo/fps;->b(Ljava/net/DatagramPacket;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1461
    goto :goto_1

    .line 1464
    :cond_4
    goto :goto_2

    .line 1462
    :catch_0
    move-exception v8

    .line 1463
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Could not send datagram"

    invoke-interface {v0, v1, v8}, Lo/fty;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1465
    :goto_2
    return-void
.end method

.method private d(Lo/fqp;Lo/fqq;)V
    .locals 1

    .line 1400
    if-eqz p1, :cond_1

    .line 1401
    invoke-virtual {p1}, Lo/fqp;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1402
    invoke-virtual {p2, p1}, Lo/fqq;->a(Lo/fqp;)V

    .line 1403
    invoke-direct {p0, p1}, Lo/fps;->e(Lo/fqp;)V

    goto :goto_0

    .line 1406
    :cond_0
    invoke-virtual {p2}, Lo/fqq;->i()V

    .line 1408
    :goto_0
    invoke-direct {p0, p1}, Lo/fps;->d(Lo/fqp;)V

    .line 1410
    :cond_1
    return-void
.end method

.method private static d(Lo/fqy;Lo/frl;Lo/fqq;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 928
    invoke-virtual {p2}, Lo/fqq;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 929
    invoke-virtual {p2}, Lo/fqq;->f()Lo/frd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/frd;->b(Lo/frl;)V

    goto :goto_0

    .line 931
    :cond_0
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Discarding {} message received from peer [{}] with no handshake going on"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0}, Lo/fqy;->c()Lo/fra;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0}, Lo/fqy;->e()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 935
    :goto_0
    return-void
.end method

.method private d(Lo/frl;)V
    .locals 6

    .line 555
    :try_start_0
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Received DTLS record of type [{}]"

    invoke-virtual {p1}, Lo/frl;->c()Lo/fqn;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 557
    sget-object v0, Lo/fps$9;->b:[I

    invoke-virtual {p1}, Lo/frl;->c()Lo/fqn;

    move-result-object v1

    invoke-virtual {v1}, Lo/fqn;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 559
    :pswitch_0
    invoke-direct {p0, p1}, Lo/fps;->c(Lo/frl;)V

    .line 560
    goto :goto_1

    .line 562
    :pswitch_1
    invoke-direct {p0, p1}, Lo/fps;->e(Lo/frl;)V

    .line 563
    goto :goto_1

    .line 565
    :pswitch_2
    invoke-direct {p0, p1}, Lo/fps;->b(Lo/frl;)V

    .line 566
    goto :goto_1

    .line 568
    :pswitch_3
    invoke-direct {p0, p1}, Lo/fps;->a(Lo/frl;)V

    .line 569
    goto :goto_1

    .line 571
    :goto_0
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Discarding record of unsupported type [{}] from peer [{}]"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lo/frl;->c()Lo/fqn;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p1}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 579
    :goto_1
    goto :goto_2

    .line 575
    :catch_0
    move-exception v5

    .line 576
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Unexpected error occurred while processing record from peer [{}]"

    invoke-virtual {p1}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-interface {v0, v1, v2, v5}, Lo/fty;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 578
    invoke-virtual {p1}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v0

    sget-object v1, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v2, Lo/fqb$b;->y:Lo/fqb$b;

    invoke-direct {p0, v0, v5, v1, v2}, Lo/fps;->c(Ljava/net/InetSocketAddress;Ljava/lang/Throwable;Lo/fqb$c;Lo/fqb$b;)V

    .line 580
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic e(Lo/fps;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1

    .line 149
    iget-object v0, p0, Lo/fps;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object v0
.end method

.method private e(Ljava/lang/Throwable;Lo/fqb$c;Lo/fqb$b;Lo/frl;)V
    .locals 1

    .line 1747
    sget-object v0, Lo/fqb$c;->c:Lo/fqb$c;

    invoke-virtual {v0, p2}, Lo/fqb$c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1748
    invoke-virtual {p4}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-direct {p0, v0, p1, p3}, Lo/fps;->d(Ljava/net/InetSocketAddress;Ljava/lang/Throwable;Lo/fqb$b;)V

    goto :goto_0

    .line 1750
    :cond_0
    invoke-static {p4, p1}, Lo/fps;->e(Lo/frl;Ljava/lang/Throwable;)V

    .line 1752
    :goto_0
    return-void
.end method

.method private e(Ljava/net/InetSocketAddress;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 335
    iget-object v0, p0, Lo/fps;->s:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 336
    return-void

    .line 339
    :cond_0
    iget-object v0, p0, Lo/fps;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v1, p0, Lo/fps;->e:Lo/fpz;

    invoke-virtual {v1}, Lo/fpz;->f()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 341
    new-instance v0, Lo/fpn;

    const-string v1, "DTLS-Retransmit-Task-"

    sget-object v2, Lo/fpr;->b:Ljava/lang/ThreadGroup;

    invoke-direct {v0, v1, v2}, Lo/fpn;-><init>(Ljava/lang/String;Ljava/lang/ThreadGroup;)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/fps;->o:Ljava/util/concurrent/ScheduledExecutorService;

    .line 344
    iget-object v0, p0, Lo/fps;->z:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_3

    .line 346
    iget-object v0, p0, Lo/fps;->e:Lo/fpz;

    invoke-virtual {v0}, Lo/fpz;->r()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_1

    .line 347
    sget v5, Lo/fps;->b:I

    goto :goto_0

    .line 349
    :cond_1
    iget-object v0, p0, Lo/fps;->e:Lo/fpz;

    invoke-virtual {v0}, Lo/fpz;->r()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 351
    :goto_0
    const/4 v0, 0x1

    if-ne v5, v0, :cond_2

    .line 353
    new-instance v0, Lo/fpn;

    const-string v1, "DTLS-Connection-Handler-"

    sget-object v2, Lo/fpr;->b:Ljava/lang/ThreadGroup;

    invoke-direct {v0, v1, v2}, Lo/fpn;-><init>(Ljava/lang/String;Ljava/lang/ThreadGroup;)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/fps;->z:Ljava/util/concurrent/ExecutorService;

    goto :goto_1

    .line 355
    :cond_2
    new-instance v0, Lo/fku;

    new-instance v1, Lo/fpn;

    const-string v2, "DTLS-Connection-Handler-"

    sget-object v3, Lo/fpr;->b:Ljava/lang/ThreadGroup;

    invoke-direct {v1, v2, v3}, Lo/fpn;-><init>(Ljava/lang/String;Ljava/lang/ThreadGroup;)V

    invoke-static {v5, v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/fku;-><init>(Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lo/fps;->z:Ljava/util/concurrent/ExecutorService;

    .line 358
    :goto_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fps;->y:Z

    .line 360
    :cond_3
    new-instance v0, Ljava/net/DatagramSocket;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/net/DatagramSocket;-><init>(Ljava/net/SocketAddress;)V

    iput-object v0, p0, Lo/fps;->n:Ljava/net/DatagramSocket;

    .line 361
    invoke-virtual {p1}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lo/fps;->e:Lo/fpz;

    invoke-virtual {v0}, Lo/fpz;->b()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 363
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Enable address reuse for socket!"

    invoke-interface {v0, v1}, Lo/fty;->e(Ljava/lang/String;)V

    .line 364
    iget-object v0, p0, Lo/fps;->n:Ljava/net/DatagramSocket;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/net/DatagramSocket;->setReuseAddress(Z)V

    .line 365
    iget-object v0, p0, Lo/fps;->n:Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->getReuseAddress()Z

    move-result v0

    if-nez v0, :cond_4

    .line 366
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Enable address reuse for socket failed!"

    invoke-interface {v0, v1}, Lo/fty;->b(Ljava/lang/String;)V

    .line 370
    :cond_4
    iget-object v0, p0, Lo/fps;->n:Ljava/net/DatagramSocket;

    invoke-virtual {v0, p1}, Ljava/net/DatagramSocket;->bind(Ljava/net/SocketAddress;)V

    .line 371
    iget-object v0, p0, Lo/fps;->i:Ljava/net/InetSocketAddress;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lo/fps;->n:Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->getLocalAddress()Ljava/net/InetAddress;

    move-result-object v0

    iget-object v1, p0, Lo/fps;->i:Ljava/net/InetSocketAddress;

    invoke-virtual {v1}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/net/InetAddress;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lo/fps;->n:Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->getLocalPort()I

    move-result v0

    iget-object v1, p0, Lo/fps;->i:Ljava/net/InetSocketAddress;

    invoke-virtual {v1}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v1

    if-eq v0, v1, :cond_7

    .line 372
    :cond_5
    iget-object v0, p0, Lo/fps;->k:Lo/frr;

    instance-of v0, v0, Lo/frr;

    if-eqz v0, :cond_6

    .line 373
    iget-object v0, p0, Lo/fps;->k:Lo/frr;

    invoke-interface {v0}, Lo/frr;->b()V

    goto :goto_2

    .line 375
    :cond_6
    iget-object v0, p0, Lo/fps;->k:Lo/frr;

    invoke-interface {v0}, Lo/frr;->e()V

    .line 378
    :cond_7
    :goto_2
    invoke-virtual {p1}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v0

    invoke-static {v0}, Ljava/net/NetworkInterface;->getByInetAddress(Ljava/net/InetAddress;)Ljava/net/NetworkInterface;

    move-result-object v5

    .line 379
    if-eqz v5, :cond_8

    invoke-virtual {v5}, Ljava/net/NetworkInterface;->getMTU()I

    move-result v0

    if-lez v0, :cond_8

    .line 380
    invoke-virtual {v5}, Ljava/net/NetworkInterface;->getMTU()I

    move-result v0

    iput v0, p0, Lo/fps;->h:I

    goto :goto_3

    .line 382
    :cond_8
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Cannot determine MTU of network interface, using minimum MTU [1280] of IPv6 instead"

    invoke-interface {v0, v1}, Lo/fty;->e(Ljava/lang/String;)V

    .line 383
    const/16 v0, 0x500

    iput v0, p0, Lo/fps;->h:I

    .line 386
    :goto_3
    iget-object v0, p0, Lo/fps;->e:Lo/fpz;

    invoke-virtual {v0}, Lo/fpz;->e()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 387
    iget-object v0, p0, Lo/fps;->e:Lo/fpz;

    invoke-virtual {v0}, Lo/fpz;->e()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo/frh$d;->a(I)Lo/frh$d;

    move-result-object v6

    .line 390
    invoke-virtual {v6}, Lo/frh$d;->e()I

    move-result v0

    sget v1, Lo/fps;->d:I

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x19

    iput v0, p0, Lo/fps;->f:I

    .line 395
    :cond_9
    new-instance v0, Ljava/net/InetSocketAddress;

    iget-object v1, p0, Lo/fps;->n:Ljava/net/DatagramSocket;

    invoke-virtual {v1}, Ljava/net/DatagramSocket;->getLocalAddress()Ljava/net/InetAddress;

    move-result-object v1

    iget-object v2, p0, Lo/fps;->n:Ljava/net/DatagramSocket;

    invoke-virtual {v2}, Ljava/net/DatagramSocket;->getLocalPort()I

    move-result v2

    invoke-direct {v0, v1, v2}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    iput-object v0, p0, Lo/fps;->i:Ljava/net/InetSocketAddress;

    .line 396
    iget-object v0, p0, Lo/fps;->s:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 398
    new-instance v0, Lo/fps$2;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "DTLS-Receiver-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/fps;->i:Ljava/net/InetSocketAddress;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/fps$2;-><init>(Lo/fps;Ljava/lang/String;)V

    iput-object v0, p0, Lo/fps;->m:Lo/fps$c;

    .line 409
    iget-object v0, p0, Lo/fps;->m:Lo/fps$c;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fps$c;->setDaemon(Z)V

    .line 410
    iget-object v0, p0, Lo/fps;->m:Lo/fps$c;

    invoke-virtual {v0}, Lo/fps$c;->start()V

    .line 411
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "DTLS connector listening on [{}] with MTU [{}] using (inbound) datagram buffer size [{} bytes]"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lo/fps;->i:Ljava/net/InetSocketAddress;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget v3, p0, Lo/fps;->h:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    iget v3, p0, Lo/fps;->f:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 414
    return-void
.end method

.method private e(Lo/fpd;Lo/fqr;)V
    .locals 12

    .line 1307
    :try_start_0
    invoke-virtual {p2}, Lo/fqr;->d()Lo/fou;

    move-result-object v8

    .line 1308
    invoke-direct {p0, p1, v8}, Lo/fps;->e(Lo/fpd;Lo/fow;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    if-nez v0, :cond_0

    .line 1309
    return-void

    .line 1312
    :cond_0
    :try_start_1
    invoke-virtual {p1, v8}, Lo/fpd;->a(Lo/fow;)V

    .line 1313
    new-instance v0, Lo/frl;

    sget-object v1, Lo/fqn;->c:Lo/fqn;

    invoke-virtual {p2}, Lo/fqr;->i()I

    move-result v2

    invoke-virtual {p2}, Lo/fqr;->g()J

    move-result-wide v3

    new-instance v5, Lo/fqa;

    invoke-virtual {p1}, Lo/fpd;->c()[B

    move-result-object v6

    invoke-virtual {p1}, Lo/fpd;->e()Ljava/net/InetSocketAddress;

    move-result-object v7

    invoke-direct {v5, v6, v7}, Lo/fqa;-><init>([BLjava/net/InetSocketAddress;)V

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lo/frl;-><init>(Lo/fqn;IJLo/fqm;Lo/fqr;)V

    move-object v9, v0

    .line 1320
    invoke-direct {p0, v9}, Lo/fps;->i(Lo/frl;)V

    .line 1321
    invoke-virtual {p1}, Lo/fpd;->g()V

    .line 1322
    invoke-virtual {p1}, Lo/fpd;->e()Ljava/net/InetSocketAddress;

    move-result-object v10

    .line 1323
    iget-object v0, p0, Lo/fps;->k:Lo/frr;

    invoke-interface {v0, v10}, Lo/frr;->b(Ljava/net/InetSocketAddress;)Lo/fqq;

    move-result-object v11

    .line 1324
    if-eqz v11, :cond_1

    .line 1325
    invoke-virtual {v11}, Lo/fqq;->n()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1332
    :cond_1
    goto :goto_0

    .line 1327
    :catch_0
    move-exception v8

    .line 1328
    invoke-virtual {p1, v8}, Lo/fpd;->a(Ljava/lang/Throwable;)V

    .line 1332
    goto :goto_0

    .line 1329
    :catch_1
    move-exception v8

    .line 1330
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Cannot send APPLICATION record to peer [{}]"

    invoke-virtual {p1}, Lo/fpd;->e()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-interface {v0, v1, v2, v8}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1331
    invoke-virtual {p1, v8}, Lo/fpd;->a(Ljava/lang/Throwable;)V

    .line 1333
    :goto_0
    return-void
.end method

.method static synthetic e(Lo/fps;Ljava/net/DatagramPacket;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 149
    invoke-direct {p0, p1}, Lo/fps;->d(Ljava/net/DatagramPacket;)V

    return-void
.end method

.method static synthetic e(Lo/fps;Lo/fpd;Lo/fqr;)V
    .locals 0

    .line 149
    invoke-direct {p0, p1, p2}, Lo/fps;->e(Lo/fpd;Lo/fqr;)V

    return-void
.end method

.method static synthetic e(Lo/fps;Lo/fqp;Lo/fqq;)V
    .locals 0

    .line 149
    invoke-direct {p0, p1, p2}, Lo/fps;->d(Lo/fqp;Lo/fqq;)V

    return-void
.end method

.method private e(Lo/fql;Lo/frl;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 1078
    new-instance v7, Lo/fqq;

    invoke-virtual {p2}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v0

    iget-object v1, p0, Lo/fps;->e:Lo/fpz;

    invoke-virtual {v1}, Lo/fpz;->q()Ljava/lang/Long;

    move-result-object v1

    invoke-direct {v7, v0, v1}, Lo/fqq;-><init>(Ljava/net/InetSocketAddress;Ljava/lang/Long;)V

    .line 1079
    iget-object v0, p0, Lo/fps;->k:Lo/frr;

    invoke-interface {v0, v7}, Lo/frr;->d(Lo/fqq;)Z

    .line 1083
    new-instance v8, Lo/fqr;

    invoke-virtual {p2}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-virtual {p2}, Lo/frl;->e()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v8, v0, v3, v1, v2}, Lo/fqr;-><init>(Ljava/net/InetSocketAddress;ZJ)V

    .line 1086
    new-instance v0, Lo/frq;

    invoke-virtual {p1}, Lo/fql;->s()I

    move-result v1

    move-object v2, v8

    invoke-direct {p0, v7}, Lo/fps;->b(Lo/fqq;)Lo/frm;

    move-result-object v3

    move-object v4, v7

    iget-object v5, p0, Lo/fps;->e:Lo/fpz;

    iget v6, p0, Lo/fps;->h:I

    invoke-direct/range {v0 .. v6}, Lo/frq;-><init>(ILo/fqr;Lo/frm;Lo/fsb;Lo/fpz;I)V

    move-object v9, v0

    .line 1088
    invoke-direct {p0, v9}, Lo/fps;->c(Lo/frd;)V

    .line 1089
    invoke-virtual {v9, p2}, Lo/frd;->b(Lo/frl;)V

    .line 1090
    return-void
.end method

.method private e(Lo/fqp;)V
    .locals 6

    .line 1524
    invoke-virtual {p1}, Lo/fqp;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1527
    invoke-virtual {p1}, Lo/fqp;->h()I

    move-result v0

    if-nez v0, :cond_0

    .line 1529
    iget-object v0, p0, Lo/fps;->e:Lo/fpz;

    invoke-virtual {v0}, Lo/fpz;->d()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Lo/fqp;->a(I)V

    goto :goto_0

    .line 1532
    :cond_0
    invoke-virtual {p1}, Lo/fqp;->g()V

    .line 1536
    :goto_0
    iget-object v0, p0, Lo/fps;->o:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lo/fps$e;

    invoke-direct {v1, p0, p1}, Lo/fps$e;-><init>(Lo/fps;Lo/fqp;)V

    invoke-virtual {p1}, Lo/fqp;->h()I

    move-result v2

    int-to-long v2, v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v5

    .line 1537
    invoke-virtual {p1, v5}, Lo/fqp;->c(Ljava/util/concurrent/ScheduledFuture;)V

    .line 1539
    :cond_1
    return-void
.end method

.method private e(Lo/fqq;)V
    .locals 1

    .line 626
    if-eqz p1, :cond_0

    .line 627
    invoke-virtual {p1}, Lo/fqq;->i()V

    .line 629
    invoke-virtual {p1}, Lo/fqq;->c()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fps;->a(Ljava/net/InetSocketAddress;)V

    .line 631
    :cond_0
    return-void
.end method

.method private e(Lo/fqq;Lo/fqb;Lo/fqr;)V
    .locals 5

    .line 667
    if-eqz p2, :cond_0

    if-nez p3, :cond_0

    .line 668
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Session must not be NULL if alert message is to be sent"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 671
    :cond_0
    invoke-virtual {p1}, Lo/fqq;->i()V

    .line 673
    if-nez p2, :cond_1

    .line 674
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Terminating connection with peer [{}]"

    invoke-virtual {p1}, Lo/fqq;->c()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    .line 676
    :cond_1
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Terminating connection with peer [{}], reason [{}]"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lo/fqq;->c()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p2}, Lo/fqb;->c()Lo/fqb$b;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 678
    invoke-virtual {p0, p2, p3}, Lo/fps;->d(Lo/fqb;Lo/fqr;)V

    .line 681
    :goto_0
    invoke-virtual {p1}, Lo/fqq;->c()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fps;->a(Ljava/net/InetSocketAddress;)V

    .line 682
    return-void
.end method

.method private e(Lo/frl;)V
    .locals 4

    .line 743
    iget-object v0, p0, Lo/fps;->k:Lo/frr;

    invoke-virtual {p1}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/frr;->b(Ljava/net/InetSocketAddress;)Lo/fqq;

    move-result-object v3

    .line 744
    if-nez v3, :cond_0

    .line 745
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Discarding ALERT record from [{}] received without existing connection"

    invoke-virtual {p1}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    .line 747
    :cond_0
    invoke-direct {p0, p1, v3}, Lo/fps;->b(Lo/frl;Lo/fqq;)V

    .line 749
    :goto_0
    return-void
.end method

.method private static e(Lo/frl;Ljava/lang/Throwable;)V
    .locals 5

    .line 1755
    sget-object v0, Lo/fps;->c:Lo/fty;

    invoke-interface {v0}, Lo/fty;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1756
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Discarding {} record from peer [{}]: "

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0}, Lo/frl;->c()Lo/fqn;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x2

    aput-object p1, v2, v3

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1757
    :cond_0
    sget-object v0, Lo/fps;->c:Lo/fty;

    invoke-interface {v0}, Lo/fty;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1758
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Discarding {} record from peer [{}]: {}"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0}, Lo/frl;->c()Lo/fqn;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1762
    :cond_1
    :goto_0
    return-void
.end method

.method private e(Lo/fpd;Lo/fow;)Z
    .locals 6

    .line 1347
    invoke-direct {p0}, Lo/fps;->i()Lo/foz;

    move-result-object v5

    .line 1348
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    invoke-virtual {p1}, Lo/fpd;->h()Lo/fow;

    move-result-object v0

    invoke-interface {v5, v0, p2}, Lo/foz;->d(Lo/fow;Lo/fow;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1349
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "DTLSConnector ({}) drops {} bytes to {}:{}"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    invoke-virtual {p1}, Lo/fpd;->a()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {p1}, Lo/fpd;->d()Ljava/net/InetAddress;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-virtual {p1}, Lo/fpd;->b()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x3

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1352
    new-instance v0, Lo/fpa;

    invoke-direct {v0}, Lo/fpa;-><init>()V

    invoke-virtual {p1, v0}, Lo/fpd;->a(Ljava/lang/Throwable;)V

    .line 1353
    const/4 v0, 0x0

    return v0

    .line 1355
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method private final declared-synchronized f()Ljava/net/DatagramSocket;
    .locals 2

    monitor-enter p0

    .line 463
    :try_start_0
    iget-object v0, p0, Lo/fps;->n:Ljava/net/DatagramSocket;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method static synthetic h()Lo/fty;
    .locals 1

    .line 149
    sget-object v0, Lo/fps;->c:Lo/fty;

    return-object v0
.end method

.method private declared-synchronized i()Lo/foz;
    .locals 2

    monitor-enter p0

    .line 1726
    :try_start_0
    iget-object v0, p0, Lo/fps;->u:Lo/foz;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method private i(Lo/frl;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1468
    invoke-virtual {p1}, Lo/frl;->d()[B

    move-result-object v2

    .line 1469
    new-instance v3, Ljava/net/DatagramPacket;

    array-length v0, v2

    invoke-virtual {p1}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-direct {v3, v2, v0, v1}, Ljava/net/DatagramPacket;-><init>([BILjava/net/SocketAddress;)V

    .line 1470
    invoke-direct {p0, v3}, Lo/fps;->b(Ljava/net/DatagramPacket;)V

    .line 1471
    return-void
.end method

.method private k(Lo/frl;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 843
    invoke-virtual {p1}, Lo/frl;->b()I

    move-result v0

    if-lez v0, :cond_0

    .line 844
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Discarding unexpected handshake message [epoch={}] received from peer [{}] without existing connection"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lo/frl;->b()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p1}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 850
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Lo/frl;->h()Lo/fqm;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/fqy;

    .line 852
    sget-object v0, Lo/fra;->c:Lo/fra;

    invoke-virtual {v5}, Lo/fqy;->c()Lo/fra;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fra;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 853
    move-object v0, v5

    check-cast v0, Lo/fql;

    invoke-direct {p0, v0, p1}, Lo/fps;->a(Lo/fql;Lo/frl;)V

    goto :goto_0

    .line 855
    :cond_1
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Discarding unexpected {} message from peer [{}]"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v5}, Lo/fqy;->c()Lo/fra;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v5}, Lo/fqy;->e()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 861
    :goto_0
    goto :goto_1

    .line 859
    :catch_0
    move-exception v5

    .line 860
    invoke-static {p1, v5}, Lo/fps;->e(Lo/frl;Ljava/lang/Throwable;)V

    .line 863
    :goto_1
    return-void
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 4

    monitor-enter p0

    .line 468
    :try_start_0
    iget-object v0, p0, Lo/fps;->s:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 469
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Stopping DTLS connector on [{}]"

    iget-object v2, p0, Lo/fps;->i:Ljava/net/InetSocketAddress;

    invoke-interface {v0, v1, v2}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 470
    iget-object v0, p0, Lo/fps;->o:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdownNow()Ljava/util/List;

    .line 471
    iget-boolean v0, p0, Lo/fps;->y:Z

    if-eqz v0, :cond_0

    .line 472
    iget-object v0, p0, Lo/fps;->z:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 473
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fps;->z:Ljava/util/concurrent/ExecutorService;

    .line 474
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fps;->y:Z

    .line 476
    :cond_0
    invoke-virtual {p0}, Lo/fps;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 478
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v3

    monitor-exit p0

    throw v3
.end method

.method public final b()Ljava/net/InetSocketAddress;
    .locals 4

    .line 1601
    invoke-direct {p0}, Lo/fps;->f()Ljava/net/DatagramSocket;

    move-result-object v3

    .line 1602
    if-nez v3, :cond_0

    .line 1603
    iget-object v0, p0, Lo/fps;->e:Lo/fpz;

    invoke-virtual {v0}, Lo/fpz;->i()Ljava/net/InetSocketAddress;

    move-result-object v0

    return-object v0

    .line 1605
    :cond_0
    new-instance v0, Ljava/net/InetSocketAddress;

    invoke-virtual {v3}, Ljava/net/DatagramSocket;->getLocalAddress()Ljava/net/InetAddress;

    move-result-object v1

    invoke-virtual {v3}, Ljava/net/DatagramSocket;->getLocalPort()I

    move-result v2

    invoke-direct {v0, v1, v2}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1766
    const-string v0, "DTLS"

    return-object v0
.end method

.method public final c(Lo/fpd;)V
    .locals 3

    .line 1205
    if-nez p1, :cond_0

    .line 1206
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Message must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1207
    :cond_0
    iget-object v0, p0, Lo/fps;->s:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1208
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "connector must be started before sending messages is possible"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1209
    :cond_1
    invoke-virtual {p1}, Lo/fpd;->c()[B

    move-result-object v0

    array-length v0, v0

    const/16 v1, 0x4000

    if-le v0, v1, :cond_2

    .line 1210
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Message data must not exceed 16384 bytes"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1213
    :cond_2
    iget-object v0, p0, Lo/fps;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-ltz v0, :cond_3

    .line 1214
    iget-object v0, p0, Lo/fps;->z:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/fps$5;

    invoke-direct {v1, p0, p1}, Lo/fps$5;-><init>(Lo/fps;Lo/fpd;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 1240
    :cond_3
    iget-object v0, p0, Lo/fps;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 1241
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Outbound message overflow! Dropping outbound message to peer [{}]"

    invoke-virtual {p1}, Lo/fpd;->e()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1245
    :goto_0
    return-void
.end method

.method public c(Lo/fpg;)V
    .locals 2

    .line 1714
    invoke-virtual {p0}, Lo/fps;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1715
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "message handler cannot be set on running connector"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1717
    :cond_0
    iput-object p1, p0, Lo/fps;->t:Lo/fpg;

    .line 1718
    return-void
.end method

.method final declared-synchronized d()V
    .locals 3

    monitor-enter p0

    .line 454
    :try_start_0
    iget-object v0, p0, Lo/fps;->s:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 455
    iget-object v0, p0, Lo/fps;->n:Ljava/net/DatagramSocket;

    if-eqz v0, :cond_0

    .line 456
    iget-object v0, p0, Lo/fps;->n:Ljava/net/DatagramSocket;

    invoke-virtual {v0}, Ljava/net/DatagramSocket;->close()V

    .line 457
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fps;->n:Ljava/net/DatagramSocket;

    .line 459
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/fps;->h:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 460
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method public declared-synchronized d(Lo/foz;)V
    .locals 0

    monitor-enter p0

    .line 1722
    :try_start_0
    iput-object p1, p0, Lo/fps;->u:Lo/foz;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1723
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method d(Lo/fqb;Lo/fqr;)V
    .locals 8

    .line 1185
    if-nez p1, :cond_0

    .line 1186
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Alert must not be NULL"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1187
    :cond_0
    if-nez p2, :cond_1

    .line 1188
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Session must not be NULL"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1191
    :cond_1
    :try_start_0
    new-instance v0, Lo/frl;

    sget-object v1, Lo/fqn;->e:Lo/fqn;

    invoke-virtual {p2}, Lo/fqr;->i()I

    move-result v2

    invoke-virtual {p2}, Lo/fqr;->g()J

    move-result-wide v3

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lo/frl;-><init>(Lo/fqn;IJLo/fqm;Lo/fqr;)V

    invoke-direct {p0, v0}, Lo/fps;->i(Lo/frl;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1

    .line 1196
    goto :goto_0

    .line 1192
    :catch_0
    move-exception v7

    .line 1196
    goto :goto_0

    .line 1194
    :catch_1
    move-exception v7

    .line 1195
    sget-object v0, Lo/fps;->c:Lo/fty;

    const-string v1, "Cannot create ALERT message for peer [{}]"

    invoke-virtual {p2}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-interface {v0, v1, v2, v7}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1198
    :goto_0
    return-void
.end method

.method public final declared-synchronized e()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 315
    :try_start_0
    iget-object v0, p0, Lo/fps;->e:Lo/fpz;

    invoke-virtual {v0}, Lo/fpz;->i()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fps;->e(Ljava/net/InetSocketAddress;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 316
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public final k()Z
    .locals 1

    .line 1615
    iget-object v0, p0, Lo/fps;->s:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1771
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lo/fps;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lo/fps;->b()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
