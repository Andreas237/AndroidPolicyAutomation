.class public Lo/fqp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/frl;>;"
        }
    .end annotation
.end field

.field private c:I

.field private d:Ljava/net/InetSocketAddress;

.field private e:Lo/fqr;

.field private f:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<*>;"
        }
    .end annotation
.end field

.field private h:Z

.field private i:Z


# direct methods
.method public constructor <init>()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    const/4 v0, 0x0

    iput v0, p0, Lo/fqp;->c:I

    .line 76
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fqp;->i:Z

    .line 99
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fqp;->b:Ljava/util/List;

    .line 100
    const/4 v0, 0x0

    iput v0, p0, Lo/fqp;->a:I

    .line 101
    const/4 v0, 0x0

    iput v0, p0, Lo/fqp;->c:I

    .line 102
    return-void
.end method

.method public constructor <init>(Lo/fqr;)V
    .locals 2

    .line 134
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    const/4 v0, 0x0

    iput v0, p0, Lo/fqp;->c:I

    .line 76
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fqp;->i:Z

    .line 135
    if-nez p1, :cond_0

    .line 136
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Session must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 138
    :cond_0
    invoke-virtual {p1}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v0

    if-nez v0, :cond_1

    .line 139
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Peer address must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 141
    :cond_1
    iput-object p1, p0, Lo/fqp;->e:Lo/fqr;

    .line 142
    invoke-virtual {p1}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v0

    iput-object v0, p0, Lo/fqp;->d:Ljava/net/InetSocketAddress;

    .line 143
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fqp;->b:Ljava/util/List;

    .line 144
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fqp;->i:Z

    .line 145
    return-void
.end method

.method private final n()V
    .locals 2

    .line 244
    iget-object v0, p0, Lo/fqp;->f:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_1

    .line 245
    iget-object v0, p0, Lo/fqp;->f:Ljava/util/concurrent/ScheduledFuture;

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledFuture;->isDone()Z

    move-result v0

    if-nez v0, :cond_0

    .line 246
    iget-object v0, p0, Lo/fqp;->f:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 248
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fqp;->f:Ljava/util/concurrent/ScheduledFuture;

    .line 250
    :cond_1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 211
    iget v0, p0, Lo/fqp;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/fqp;->a:I

    .line 212
    return-void
.end method

.method public a(I)V
    .locals 0

    .line 219
    iput p1, p0, Lo/fqp;->c:I

    .line 220
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 235
    iput-boolean p1, p0, Lo/fqp;->i:Z

    .line 236
    return-void
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/frl;>;"
        }
    .end annotation

    .line 171
    iget-object v0, p0, Lo/fqp;->b:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c()I
    .locals 1

    .line 207
    iget v0, p0, Lo/fqp;->a:I

    return v0
.end method

.method public declared-synchronized c(Ljava/util/concurrent/ScheduledFuture;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/concurrent/ScheduledFuture<*>;)V"
        }
    .end annotation

    monitor-enter p0

    .line 275
    :try_start_0
    iget-boolean v0, p0, Lo/fqp;->h:Z

    if-eqz v0, :cond_0

    .line 276
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    goto :goto_0

    .line 278
    :cond_0
    invoke-direct {p0}, Lo/fqp;->n()V

    .line 279
    iput-object p1, p0, Lo/fqp;->f:Ljava/util/concurrent/ScheduledFuture;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 281
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public d()Lo/fqr;
    .locals 1

    .line 191
    iget-object v0, p0, Lo/fqp;->e:Lo/fqr;

    return-object v0
.end method

.method public d(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/frl;>;)V"
        }
    .end annotation

    .line 153
    iget-object v0, p0, Lo/fqp;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 154
    return-void
.end method

.method public e()Ljava/net/InetSocketAddress;
    .locals 1

    .line 175
    iget-object v0, p0, Lo/fqp;->d:Ljava/net/InetSocketAddress;

    return-object v0
.end method

.method public declared-synchronized f()V
    .locals 2

    monitor-enter p0

    .line 259
    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lo/fqp;->h:Z

    .line 260
    invoke-direct {p0}, Lo/fqp;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 261
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public g()V
    .locals 2

    .line 227
    iget v0, p0, Lo/fqp;->c:I

    mul-int/lit8 v0, v0, 0x2

    iput v0, p0, Lo/fqp;->c:I

    .line 228
    return-void
.end method

.method public h()I
    .locals 1

    .line 215
    iget v0, p0, Lo/fqp;->c:I

    return v0
.end method

.method public declared-synchronized i()Z
    .locals 2

    monitor-enter p0

    .line 289
    :try_start_0
    iget-boolean v0, p0, Lo/fqp;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public k()Z
    .locals 1

    .line 231
    iget-boolean v0, p0, Lo/fqp;->i:Z

    return v0
.end method

.method public o()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 301
    invoke-virtual {p0}, Lo/fqp;->c()I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, Lo/fqp;->e:Lo/fqr;

    if-eqz v0, :cond_1

    .line 302
    iget-object v0, p0, Lo/fqp;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/frl;

    .line 304
    invoke-virtual {v3}, Lo/frl;->b()I

    move-result v4

    .line 305
    iget-object v0, p0, Lo/fqp;->e:Lo/fqr;

    invoke-virtual {v0, v4}, Lo/fqr;->b(I)J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lo/frl;->e(J)V

    .line 306
    goto :goto_0

    :cond_0
    goto :goto_1

    .line 308
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can only set new sequence numbers for retransmitted flight with session"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 310
    :goto_1
    return-void
.end method
