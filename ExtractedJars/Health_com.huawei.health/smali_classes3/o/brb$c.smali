.class Lo/brb$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements Lo/bqy;
.implements Lo/bra;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/brb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Ljava/lang/Object;>Ljava/lang/Object;Ljava/lang/Runnable;Lo/bqy<TT;>;Lo/bra;"
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private c:Lo/brd;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/brd<TT;>;"
        }
    .end annotation
.end field

.field private volatile d:Z

.field private e:Lo/brc;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/brc<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/brd;Lo/brc;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/brd<TT;>;Lo/brc<TT;>;)V"
        }
    .end annotation

    .line 202
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 203
    iput-object p1, p0, Lo/brb$c;->c:Lo/brd;

    .line 204
    iput-object p2, p0, Lo/brb$c;->e:Lo/brc;

    .line 205
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 255
    iget-boolean v0, p0, Lo/brb$c;->d:Z

    return v0
.end method

.method public declared-synchronized b()V
    .locals 2

    monitor-enter p0

    .line 241
    :try_start_0
    iget-boolean v0, p0, Lo/brb$c;->d:Z

    if-eqz v0, :cond_0

    .line 243
    monitor-exit p0

    return-void

    .line 245
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/brb$c;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 246
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public declared-synchronized c()Z
    .locals 2

    monitor-enter p0

    .line 250
    :try_start_0
    iget-boolean v0, p0, Lo/brb$c;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public declared-synchronized e()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    monitor-enter p0

    .line 260
    :goto_0
    :try_start_0
    iget-boolean v0, p0, Lo/brb$c;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 264
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 270
    goto :goto_0

    .line 266
    :catch_0
    move-exception v2

    .line 269
    const-string v0, "hwsns"

    const-string v1, "interrupt InterruptedException"

    :try_start_2
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 270
    goto :goto_0

    .line 272
    :cond_0
    iget-object v0, p0, Lo/brb$c;->b:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method public run()V
    .locals 5

    .line 209
    const/4 v2, 0x0

    .line 212
    :try_start_0
    iget-object v0, p0, Lo/brb$c;->c:Lo/brd;

    invoke-interface {v0, p0}, Lo/brd;->a(Lo/bra;)Ljava/lang/Object;

    move-result-object v2

    .line 214
    move-object v3, p0

    monitor-enter v3
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 216
    :try_start_1
    iput-object v2, p0, Lo/brb$c;->b:Ljava/lang/Object;

    .line 217
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/brb$c;->a:Z

    .line 218
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 219
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    :try_start_2
    throw v4

    .line 220
    :goto_0
    iget-object v0, p0, Lo/brb$c;->e:Lo/brc;

    if-eqz v0, :cond_0

    .line 222
    iget-object v0, p0, Lo/brb$c;->e:Lo/brc;

    invoke-interface {v0, p0}, Lo/brc;->d(Lo/bqy;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    .line 234
    :cond_0
    goto :goto_1

    .line 225
    :catch_0
    move-exception v3

    .line 228
    const-string v0, "hwsns"

    const-string v1, "run exception"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 236
    :goto_1
    invoke-static {}, Lo/brf;->c()Lo/brf;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/brf;->b(Lo/bqy;)V

    .line 237
    return-void
.end method
