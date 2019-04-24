.class public final Lo/frg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/frr;
.implements Lo/fsb;


# static fields
.field private static final a:Lo/fty;


# instance fields
.field private final b:Lo/fsd;

.field private final d:Lo/fpo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/fpo<Ljava/net/InetSocketAddress;Lo/fqq;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 66
    const-class v0, Lo/frg;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/frg;->a:Lo/fty;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 77
    const v0, 0x249f0

    const-wide/32 v1, 0x1fa40

    invoke-direct {p0, v0, v1, v2}, Lo/frg;-><init>(IJ)V

    .line 78
    return-void
.end method

.method public constructor <init>(IJ)V
    .locals 1

    .line 100
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lo/frg;-><init>(IJLo/fsd;)V

    .line 101
    return-void
.end method

.method public constructor <init>(IJLo/fsd;)V
    .locals 5

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 114
    new-instance v0, Lo/fpo;

    invoke-direct {v0, p1, p2, p3}, Lo/fpo;-><init>(IJ)V

    iput-object v0, p0, Lo/frg;->d:Lo/fpo;

    .line 115
    iput-object p4, p0, Lo/frg;->b:Lo/fsd;

    .line 117
    if-eqz p4, :cond_0

    .line 119
    iget-object v0, p0, Lo/frg;->d:Lo/fpo;

    new-instance v1, Lo/frg$5;

    invoke-direct {v1, p0}, Lo/frg$5;-><init>(Lo/frg;)V

    invoke-virtual {v0, v1}, Lo/fpo;->b(Lo/fpo$e;)V

    .line 127
    :cond_0
    sget-object v0, Lo/frg;->a:Lo/fty;

    const-string v1, "Created new InMemoryConnectionStore [capacity: {}, connection expiration threshold: {}s]"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    return-void
.end method

.method private declared-synchronized a(Lo/fqq;)V
    .locals 2

    monitor-enter p0

    .line 242
    :try_start_0
    iget-object v0, p0, Lo/frg;->b:Lo/fsd;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lo/fqq;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 243
    iget-object v0, p0, Lo/frg;->b:Lo/fsd;

    invoke-virtual {p1}, Lo/fqq;->d()Lo/fqr;

    move-result-object v1

    invoke-virtual {v1}, Lo/fqr;->e()Lo/fsa;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/fsd;->d(Lo/fsa;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 245
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method static synthetic a(Lo/frg;Lo/fqq;)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lo/frg;->a(Lo/fqq;)V

    return-void
.end method

.method private declared-synchronized d(Lo/fsa;)Lo/fqq;
    .locals 2

    monitor-enter p0

    .line 205
    :try_start_0
    iget-object v0, p0, Lo/frg;->d:Lo/fpo;

    new-instance v1, Lo/frg$4;

    invoke-direct {v1, p0, p1}, Lo/frg$4;-><init>(Lo/frg;Lo/fsa;)V

    invoke-virtual {v0, v1}, Lo/fpo;->a(Lo/fpo$c;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fqq;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public declared-synchronized a(Ljava/net/InetSocketAddress;)Lo/fqq;
    .locals 2

    monitor-enter p0

    .line 236
    :try_start_0
    iget-object v0, p0, Lo/frg;->d:Lo/fpo;

    invoke-virtual {v0, p1}, Lo/fpo;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/fqq;

    .line 237
    invoke-direct {p0, v1}, Lo/frg;->a(Lo/fqq;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 238
    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public a(Lo/frd;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 256
    return-void
.end method

.method public declared-synchronized b(Ljava/net/InetSocketAddress;)Lo/fqq;
    .locals 1

    monitor-enter p0

    .line 231
    :try_start_0
    iget-object v0, p0, Lo/frg;->d:Lo/fpo;

    invoke-virtual {v0, p1}, Lo/fpo;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fqq;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized b(Lo/fsa;)Lo/fqq;
    .locals 3

    monitor-enter p0

    .line 164
    if-nez p1, :cond_0

    .line 165
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 167
    :cond_0
    :try_start_0
    invoke-direct {p0, p1}, Lo/frg;->d(Lo/fsa;)Lo/fqq;

    move-result-object v1

    .line 169
    iget-object v0, p0, Lo/frg;->b:Lo/fsd;

    if-nez v0, :cond_1

    .line 171
    monitor-exit p0

    return-object v1

    .line 176
    :cond_1
    iget-object v0, p0, Lo/frg;->b:Lo/fsd;

    invoke-interface {v0, p1}, Lo/fsd;->e(Lo/fsa;)Lo/fsc;

    move-result-object v2

    .line 177
    if-nez v2, :cond_3

    .line 182
    if-eqz v1, :cond_2

    .line 184
    invoke-virtual {v1}, Lo/fqq;->c()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/frg;->a(Ljava/net/InetSocketAddress;)Lo/fqq;

    .line 188
    :cond_2
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 190
    :cond_3
    if-nez v1, :cond_4

    .line 192
    new-instance v0, Lo/fqq;

    invoke-direct {v0, v2}, Lo/fqq;-><init>(Lo/fsc;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 197
    :cond_4
    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized b()V
    .locals 3

    monitor-enter p0

    .line 216
    :try_start_0
    iget-object v0, p0, Lo/frg;->d:Lo/fpo;

    invoke-virtual {v0}, Lo/fpo;->e()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 217
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/fqq;

    .line 218
    if-eqz v2, :cond_0

    .line 219
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lo/fqq;->e(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 221
    :cond_0
    goto :goto_0

    .line 222
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public d(Lo/frd;Lo/fqr;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 260
    iget-object v0, p0, Lo/frg;->b:Lo/fsd;

    if-eqz v0, :cond_0

    .line 262
    iget-object v0, p0, Lo/frg;->b:Lo/fsd;

    invoke-interface {v0, p2}, Lo/fsd;->d(Lo/fqr;)V

    .line 264
    :cond_0
    return-void
.end method

.method public declared-synchronized d(Lo/fqq;)Z
    .locals 2

    monitor-enter p0

    .line 154
    if-eqz p1, :cond_0

    .line 155
    :try_start_0
    iget-object v0, p0, Lo/frg;->d:Lo/fpo;

    invoke-virtual {p1}, Lo/fqq;->c()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lo/fpo;->d(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    .line 157
    :cond_0
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized e()V
    .locals 2

    monitor-enter p0

    .line 249
    :try_start_0
    iget-object v0, p0, Lo/frg;->d:Lo/fpo;

    invoke-virtual {v0}, Lo/fpo;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 251
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public e(Ljava/net/InetSocketAddress;)V
    .locals 0

    .line 269
    return-void
.end method

.method public e(Ljava/net/InetSocketAddress;Ljava/lang/Throwable;)V
    .locals 0

    .line 274
    return-void
.end method
