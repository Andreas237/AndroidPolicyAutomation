.class Lo/foc$c;
.super Lo/flv;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/foc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lo/foc;

.field private b:Lo/fmb;

.field private e:Lo/fly;


# direct methods
.method public constructor <init>(Lo/foc;Lo/fmb;Lo/fly;)V
    .locals 0

    .line 189
    iput-object p1, p0, Lo/foc$c;->a:Lo/foc;

    invoke-direct {p0}, Lo/flv;-><init>()V

    .line 190
    iput-object p2, p0, Lo/foc$c;->b:Lo/fmb;

    .line 191
    iput-object p3, p0, Lo/foc$c;->e:Lo/fly;

    .line 192
    return-void
.end method

.method static synthetic e(Lo/foc$c;)Lo/fmb;
    .locals 1

    .line 184
    iget-object v0, p0, Lo/foc$c;->b:Lo/fmb;

    return-object v0
.end method


# virtual methods
.method public c()V
    .locals 6

    .line 256
    iget-object v0, p0, Lo/foc$c;->b:Lo/fmb;

    invoke-virtual {v0}, Lo/fmb;->t()Lo/foo;

    move-result-object v5

    .line 257
    invoke-static {}, Lo/foc;->e()Lo/fty;

    move-result-object v0

    const-string v1, "notification for token [{}] timed out. Canceling all relations with source [{}]"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v5}, Lo/foo;->d()Lo/fmb;

    move-result-object v3

    invoke-virtual {v3}, Lo/fmb;->c()Lo/fma;

    move-result-object v3

    invoke-virtual {v3}, Lo/fma;->i()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v5}, Lo/foo;->e()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 260
    invoke-virtual {v5}, Lo/foo;->b()V

    .line 261
    return-void
.end method

.method public d()V
    .locals 6

    .line 196
    iget-object v2, p0, Lo/foc$c;->b:Lo/fmb;

    monitor-enter v2

    .line 197
    :try_start_0
    iget-object v0, p0, Lo/foc$c;->b:Lo/fmb;

    invoke-virtual {v0}, Lo/fmb;->t()Lo/foo;

    move-result-object v3

    .line 198
    invoke-virtual {v3}, Lo/foo;->g()Lo/fly;

    move-result-object v4

    .line 199
    invoke-virtual {v3, v4}, Lo/foo;->d(Lo/fly;)V

    .line 201
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/foo;->b(Lo/fly;)V

    .line 202
    if-eqz v4, :cond_1

    .line 203
    invoke-static {}, Lo/foc;->e()Lo/fty;

    move-result-object v0

    const-string v1, "notification has been acknowledged, send the next one"

    invoke-interface {v0, v1}, Lo/fty;->a(Ljava/lang/String;)V

    .line 208
    invoke-virtual {v4}, Lo/fly;->b()Lo/flj$e;

    move-result-object v0

    sget-object v1, Lo/flj$e;->e:Lo/flj$e;

    if-ne v0, v1, :cond_0

    .line 209
    invoke-virtual {v3, v4}, Lo/foo;->c(Lo/fly;)V

    .line 213
    :cond_0
    iget-object v0, p0, Lo/foc$c;->a:Lo/foc;

    iget-object v0, v0, Lo/foc;->d:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lo/foc$c$2;

    invoke-direct {v1, p0, v4}, Lo/foc$c$2;-><init>(Lo/foc$c;Lo/fly;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 220
    :cond_1
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v2

    throw v5

    .line 221
    :goto_0
    return-void
.end method

.method public e()V
    .locals 6

    .line 225
    iget-object v2, p0, Lo/foc$c;->b:Lo/fmb;

    monitor-enter v2

    .line 226
    :try_start_0
    iget-object v0, p0, Lo/foc$c;->b:Lo/fmb;

    invoke-virtual {v0}, Lo/fmb;->t()Lo/foo;

    move-result-object v3

    .line 227
    invoke-virtual {v3}, Lo/foo;->g()Lo/fly;

    move-result-object v4

    .line 228
    if-eqz v4, :cond_1

    .line 229
    invoke-static {}, Lo/foc;->e()Lo/fty;

    move-result-object v0

    const-string v1, "notification has timed out and there is a fresher notification for the retransmission"

    invoke-interface {v0, v1}, Lo/fty;->a(Ljava/lang/String;)V

    .line 232
    iget-object v0, p0, Lo/foc$c;->e:Lo/fly;

    invoke-virtual {v0}, Lo/fly;->A()V

    .line 234
    iget-object v0, p0, Lo/foc$c;->b:Lo/fmb;

    invoke-virtual {v0}, Lo/fmb;->o()V

    .line 236
    invoke-virtual {v4}, Lo/fly;->b()Lo/flj$e;

    move-result-object v0

    sget-object v1, Lo/flj$e;->c:Lo/flj$e;

    if-eq v0, v1, :cond_0

    .line 237
    sget-object v0, Lo/flj$e;->c:Lo/flj$e;

    invoke-virtual {v4, v0}, Lo/fly;->d(Lo/flj$e;)Lo/flq;

    .line 238
    iget-object v0, p0, Lo/foc$c;->a:Lo/foc;

    iget-object v1, p0, Lo/foc$c;->b:Lo/fmb;

    invoke-static {v0, v1, v4}, Lo/foc;->b(Lo/foc;Lo/fmb;Lo/fly;)V

    .line 240
    :cond_0
    invoke-virtual {v3, v4}, Lo/foo;->d(Lo/fly;)V

    .line 241
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/foo;->b(Lo/fly;)V

    .line 244
    iget-object v0, p0, Lo/foc$c;->a:Lo/foc;

    iget-object v0, v0, Lo/foc;->d:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lo/foc$c$5;

    invoke-direct {v1, p0, v4}, Lo/foc$c$5;-><init>(Lo/foc$c;Lo/fly;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 251
    :cond_1
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v2

    throw v5

    .line 252
    :goto_0
    return-void
.end method
