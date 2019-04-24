.class public final Lo/fqq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fsb;


# static fields
.field private static final a:Lo/fty;


# instance fields
.field private final b:Lo/fsc;

.field private final c:Ljava/net/InetSocketAddress;

.field private final d:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<Lo/frd;>;"
        }
    .end annotation
.end field

.field private volatile e:Lo/fqr;

.field private final g:Ljava/lang/Long;

.field private volatile h:Z

.field private final i:Ljava/util/concurrent/atomic/AtomicLong;

.field private final k:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<Lo/fqp;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 45
    const-class v0, Lo/fqq;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fqq;->a:Lo/fty;

    return-void
.end method

.method public constructor <init>(Ljava/net/InetSocketAddress;Ljava/lang/Long;)V
    .locals 1

    .line 64
    const/4 v0, 0x0

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lo/fqq;-><init>(Ljava/net/InetSocketAddress;Lo/frd;Ljava/lang/Long;)V

    .line 65
    return-void
.end method

.method public constructor <init>(Ljava/net/InetSocketAddress;Lo/frd;Ljava/lang/Long;)V
    .locals 2

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lo/fqq;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 50
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lo/fqq;->k:Ljava/util/concurrent/atomic/AtomicReference;

    .line 51
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Lo/fqq;->i:Ljava/util/concurrent/atomic/AtomicLong;

    .line 55
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fqq;->h:Z

    .line 91
    if-nez p1, :cond_0

    .line 92
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Peer address must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 94
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fqq;->b:Lo/fsc;

    .line 95
    iput-object p1, p0, Lo/fqq;->c:Ljava/net/InetSocketAddress;

    .line 96
    iput-object p3, p0, Lo/fqq;->g:Ljava/lang/Long;

    .line 97
    iget-object v0, p0, Lo/fqq;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 99
    return-void
.end method

.method public constructor <init>(Lo/fsc;)V
    .locals 2

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lo/fqq;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 50
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lo/fqq;->k:Ljava/util/concurrent/atomic/AtomicReference;

    .line 51
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Lo/fqq;->i:Ljava/util/concurrent/atomic/AtomicLong;

    .line 55
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fqq;->h:Z

    .line 74
    if-nez p1, :cond_0

    .line 75
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "session ticket must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 77
    :cond_0
    iput-object p1, p0, Lo/fqq;->b:Lo/fsc;

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fqq;->c:Ljava/net/InetSocketAddress;

    .line 79
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fqq;->g:Ljava/lang/Long;

    .line 80
    return-void
.end method


# virtual methods
.method public a()Lo/fsc;
    .locals 1

    .line 120
    iget-object v0, p0, Lo/fqq;->b:Lo/fsc;

    return-object v0
.end method

.method public a(Lo/fqp;)V
    .locals 2

    .line 209
    iget-object v0, p0, Lo/fqq;->k:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/fqp;

    .line 210
    if-eqz v1, :cond_0

    if-eq v1, p1, :cond_0

    .line 211
    invoke-virtual {v1}, Lo/fqp;->f()V

    .line 213
    :cond_0
    return-void
.end method

.method public a(Lo/frd;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 247
    iget-object v0, p0, Lo/fqq;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 248
    sget-object v0, Lo/fqq;->a:Lo/fty;

    const-string v1, "Handshake with [{}] has been started"

    invoke-virtual {p1}, Lo/frd;->i()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 249
    return-void
.end method

.method public b()Z
    .locals 1

    .line 111
    iget-object v0, p0, Lo/fqq;->e:Lo/fqr;

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/fqq;->b:Lo/fsc;

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c()Ljava/net/InetSocketAddress;
    .locals 1

    .line 139
    iget-object v0, p0, Lo/fqq;->c:Ljava/net/InetSocketAddress;

    return-object v0
.end method

.method public d()Lo/fqr;
    .locals 1

    .line 148
    iget-object v0, p0, Lo/fqq;->e:Lo/fqr;

    return-object v0
.end method

.method public d(Lo/frd;)V
    .locals 1

    .line 184
    iget-object v0, p0, Lo/fqq;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 185
    return-void
.end method

.method public d(Lo/frd;Lo/fqr;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 253
    iput-object p2, p0, Lo/fqq;->e:Lo/fqr;

    .line 254
    sget-object v0, Lo/fqq;->a:Lo/fty;

    const-string v1, "Session with [{}] has been established"

    invoke-virtual {p2}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 255
    return-void
.end method

.method public e(Ljava/net/InetSocketAddress;)V
    .locals 3

    .line 259
    iget-object v0, p0, Lo/fqq;->d:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/frd;

    .line 260
    if-eqz v2, :cond_0

    .line 261
    invoke-virtual {p0}, Lo/fqq;->i()V

    .line 262
    sget-object v0, Lo/fqq;->a:Lo/fty;

    const-string v1, "Handshake with [{}] has been completed"

    invoke-interface {v0, v1, p1}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 264
    :cond_0
    return-void
.end method

.method public e(Ljava/net/InetSocketAddress;Ljava/lang/Throwable;)V
    .locals 3

    .line 268
    iget-object v0, p0, Lo/fqq;->d:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/frd;

    .line 269
    if-eqz v2, :cond_0

    .line 270
    invoke-virtual {p0}, Lo/fqq;->i()V

    .line 271
    sget-object v0, Lo/fqq;->a:Lo/fty;

    const-string v1, "Handshake with [{}] has failed"

    invoke-interface {v0, v1, p1}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 273
    :cond_0
    return-void
.end method

.method public e(Z)V
    .locals 0

    .line 316
    iput-boolean p1, p0, Lo/fqq;->h:Z

    .line 317
    return-void
.end method

.method public e()Z
    .locals 1

    .line 130
    iget-object v0, p0, Lo/fqq;->b:Lo/fsc;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public f()Lo/frd;
    .locals 1

    .line 166
    iget-object v0, p0, Lo/fqq;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/frd;

    return-object v0
.end method

.method public g()V
    .locals 1

    .line 195
    invoke-virtual {p0}, Lo/fqq;->i()V

    .line 196
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/fqq;->d(Lo/frd;)V

    .line 197
    return-void
.end method

.method public h()Z
    .locals 1

    .line 175
    iget-object v0, p0, Lo/fqq;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public i()V
    .locals 1

    .line 222
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/fqq;->a(Lo/fqp;)V

    .line 223
    return-void
.end method

.method public k()Z
    .locals 1

    .line 157
    iget-object v0, p0, Lo/fqq;->e:Lo/fqr;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public l()Z
    .locals 1

    .line 279
    iget-boolean v0, p0, Lo/fqq;->h:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lo/fqq;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public n()V
    .locals 5

    .line 305
    iget-object v0, p0, Lo/fqq;->g:Ljava/lang/Long;

    if-eqz v0, :cond_0

    .line 306
    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v3

    .line 307
    iget-object v0, p0, Lo/fqq;->i:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 309
    :cond_0
    return-void
.end method

.method public p()Z
    .locals 6

    .line 289
    iget-object v0, p0, Lo/fqq;->g:Ljava/lang/Long;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fqq;->e:Lo/fqr;

    if-eqz v0, :cond_0

    .line 290
    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    .line 291
    iget-object v0, p0, Lo/fqq;->i:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    iget-object v2, p0, Lo/fqq;->g:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    add-long/2addr v0, v2

    sub-long/2addr v0, v4

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 292
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/fqq;->e(Z)V

    .line 293
    iget-boolean v0, p0, Lo/fqq;->h:Z

    return v0

    .line 296
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
