.class abstract Lo/fnr;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:Lo/fty;


# instance fields
.field protected final a:Ljava/nio/ByteBuffer;

.field protected b:Lo/fmb;

.field private final d:I

.field protected e:Z

.field private f:Lo/flq;

.field private g:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<*>;"
        }
    .end annotation
.end field

.field private h:I

.field private i:I

.field private k:Z

.field private m:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 42
    const-class v0, Lo/fnr;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fnr;->c:Lo/fty;

    return-void
.end method

.method protected constructor <init>(II)V
    .locals 1

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lo/fnr;->a:Ljava/nio/ByteBuffer;

    .line 65
    iput p2, p0, Lo/fnr;->d:I

    .line 66
    return-void
.end method


# virtual methods
.method final declared-synchronized a(Lo/flq;)V
    .locals 2

    monitor-enter p0

    .line 256
    if-nez p1, :cond_0

    .line 257
    :try_start_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "message must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 258
    :cond_0
    iget-object v0, p0, Lo/fnr;->f:Lo/flq;

    if-nez v0, :cond_1

    .line 259
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "first message is not set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 260
    :cond_1
    iget-object v0, p0, Lo/fnr;->f:Lo/flq;

    invoke-virtual {v0}, Lo/flq;->r()Lo/fow;

    move-result-object v0

    if-nez v0, :cond_2

    .line 261
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "first message has no peer context"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 262
    :cond_2
    iget-object v0, p0, Lo/fnr;->f:Lo/flq;

    invoke-virtual {v0}, Lo/flq;->r()Lo/fow;

    move-result-object v0

    invoke-interface {v0}, Lo/fow;->e()Ljava/net/InetSocketAddress;

    move-result-object v0

    if-nez v0, :cond_3

    .line 263
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "first message has no peer address"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 266
    :cond_3
    iget-object v0, p0, Lo/fnr;->f:Lo/flq;

    invoke-virtual {v0}, Lo/flq;->r()Lo/fow;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/flq;->c(Lo/fow;)Lo/flq;

    .line 267
    iget-object v0, p0, Lo/fnr;->f:Lo/flq;

    invoke-virtual {v0}, Lo/flq;->b()Lo/flj$e;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/flq;->d(Lo/flj$e;)Lo/flq;

    .line 268
    iget-object v0, p0, Lo/fnr;->f:Lo/flq;

    invoke-virtual {v0}, Lo/flq;->a()I

    move-result v0

    invoke-virtual {p1, v0}, Lo/flq;->d(I)Lo/flq;

    .line 269
    iget-object v0, p0, Lo/fnr;->f:Lo/flq;

    invoke-virtual {v0}, Lo/flq;->k()Lo/flz;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/flq;->e(Lo/flz;)Lo/flq;

    .line 270
    new-instance v0, Lo/flr;

    iget-object v1, p0, Lo/fnr;->f:Lo/flq;

    invoke-virtual {v1}, Lo/flq;->f()Lo/flr;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/flr;-><init>(Lo/flr;)V

    invoke-virtual {p1, v0}, Lo/flq;->e(Lo/flr;)Lo/flq;

    .line 271
    invoke-virtual {p1}, Lo/flq;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->C()Lo/flr;

    .line 272
    invoke-virtual {p1}, Lo/flq;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->F()Lo/flr;

    .line 273
    invoke-virtual {p0}, Lo/fnr;->l()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/flq;->e([B)Lo/flq;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 274
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method final a(I)Z
    .locals 1

    .line 149
    iget v0, p0, Lo/fnr;->d:I

    if-ne v0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method final declared-synchronized a([B)Z
    .locals 4

    monitor-enter p0

    .line 184
    const/4 v3, 0x0

    .line 185
    if-nez p1, :cond_0

    .line 186
    const/4 v3, 0x1

    goto :goto_0

    .line 187
    :cond_0
    if-eqz p1, :cond_1

    :try_start_0
    iget-object v0, p0, Lo/fnr;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    array-length v1, p1

    if-lt v0, v1, :cond_1

    .line 188
    const/4 v3, 0x1

    .line 189
    iget-object v0, p0, Lo/fnr;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    goto :goto_0

    .line 191
    :cond_1
    sget-object v0, Lo/fnr;->c:Lo/fty;

    const-string v1, "resource body exceeds buffer size [{}]"

    invoke-virtual {p0}, Lo/fnr;->g()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 193
    :goto_0
    iget v0, p0, Lo/fnr;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/fnr;->m:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 194
    monitor-exit p0

    return v3

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method final declared-synchronized b()I
    .locals 2

    monitor-enter p0

    .line 102
    :try_start_0
    iget v0, p0, Lo/fnr;->i:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method final declared-synchronized b(I)V
    .locals 0

    monitor-enter p0

    .line 111
    :try_start_0
    iput p1, p0, Lo/fnr;->i:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method final declared-synchronized b(Ljava/util/concurrent/ScheduledFuture;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/concurrent/ScheduledFuture<*>;)V"
        }
    .end annotation

    monitor-enter p0

    .line 286
    :try_start_0
    iget-object v0, p0, Lo/fnr;->g:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    .line 287
    iget-object v0, p0, Lo/fnr;->g:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 289
    :cond_0
    iput-object p1, p0, Lo/fnr;->g:Ljava/util/concurrent/ScheduledFuture;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 290
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method final declared-synchronized c(I)V
    .locals 0

    monitor-enter p0

    .line 138
    :try_start_0
    iput p1, p0, Lo/fnr;->h:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method final declared-synchronized d(Lo/flq;)V
    .locals 0

    monitor-enter p0

    .line 93
    :try_start_0
    iput-object p1, p0, Lo/fnr;->f:Lo/flq;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method protected final declared-synchronized e(Z)V
    .locals 2

    monitor-enter p0

    .line 169
    :try_start_0
    iput-boolean p1, p0, Lo/fnr;->k:Z

    .line 170
    if-eqz p1, :cond_0

    iget-object v0, p0, Lo/fnr;->g:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    .line 171
    iget-object v0, p0, Lo/fnr;->g:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 172
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fnr;->g:Ljava/util/concurrent/ScheduledFuture;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 174
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method final declared-synchronized f()I
    .locals 2

    monitor-enter p0

    .line 212
    :try_start_0
    iget v0, p0, Lo/fnr;->m:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method final declared-synchronized g()I
    .locals 2

    monitor-enter p0

    .line 203
    :try_start_0
    iget-object v0, p0, Lo/fnr;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->capacity()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method final declared-synchronized h()I
    .locals 2

    monitor-enter p0

    .line 120
    :try_start_0
    iget v0, p0, Lo/fnr;->h:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method final declared-synchronized i()Z
    .locals 2

    monitor-enter p0

    .line 158
    :try_start_0
    iget-boolean v0, p0, Lo/fnr;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method final declared-synchronized k()I
    .locals 2

    monitor-enter p0

    .line 129
    :try_start_0
    iget v0, p0, Lo/fnr;->h:I

    invoke-static {v0}, Lo/fll;->e(I)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method final declared-synchronized l()[B
    .locals 2

    monitor-enter p0

    .line 224
    :try_start_0
    iget-object v0, p0, Lo/fnr;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 225
    iget-object v0, p0, Lo/fnr;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    new-array v1, v0, [B

    .line 226
    iget-object v0, p0, Lo/fnr;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 227
    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public m()V
    .locals 2

    .line 296
    iget-object v0, p0, Lo/fnr;->b:Lo/fmb;

    if-eqz v0, :cond_0

    .line 297
    iget-object v0, p0, Lo/fnr;->b:Lo/fmb;

    iget-object v1, p0, Lo/fnr;->b:Lo/fmb;

    invoke-virtual {v1}, Lo/fmb;->b()Lo/fma;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fmb;->a(Lo/flq;)V

    .line 299
    :cond_0
    return-void
.end method

.method final declared-synchronized n()Z
    .locals 2

    monitor-enter p0

    .line 242
    :try_start_0
    iget-boolean v0, p0, Lo/fnr;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public declared-synchronized toString()Ljava/lang/String;
    .locals 5

    monitor-enter p0

    .line 232
    const-string v0, "[currentNum=%d, currentSzx=%d, bufferSize=%d, complete=%b, random access=%b]"

    const/4 v1, 0x5

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    iget v2, p0, Lo/fnr;->i:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/fnr;->h:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lo/fnr;->g()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/fnr;->k:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/fnr;->e:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v4

    monitor-exit p0

    throw v4
.end method
