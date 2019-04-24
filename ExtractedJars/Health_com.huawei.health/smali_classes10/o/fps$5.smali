.class Lo/fps$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fkv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fps;->c(Lo/fpd;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/fps;

.field final synthetic e:Lo/fpd;


# direct methods
.method constructor <init>(Lo/fps;Lo/fpd;)V
    .locals 0

    .line 1214
    iput-object p1, p0, Lo/fps$5;->b:Lo/fps;

    iput-object p2, p0, Lo/fps$5;->e:Lo/fpd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/Object;
    .locals 1

    .line 1218
    iget-object v0, p0, Lo/fps$5;->e:Lo/fpd;

    invoke-virtual {v0}, Lo/fpd;->h()Lo/fow;

    move-result-object v0

    invoke-interface {v0}, Lo/fow;->e()Ljava/net/InetSocketAddress;

    move-result-object v0

    return-object v0
.end method

.method public run()V
    .locals 5

    .line 1224
    :try_start_0
    iget-object v0, p0, Lo/fps$5;->b:Lo/fps;

    invoke-static {v0}, Lo/fps;->e(Lo/fps;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 1225
    iget-object v0, p0, Lo/fps$5;->b:Lo/fps;

    invoke-static {v0}, Lo/fps;->a(Lo/fps;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1226
    iget-object v0, p0, Lo/fps$5;->b:Lo/fps;

    iget-object v1, p0, Lo/fps$5;->e:Lo/fpd;

    invoke-static {v0, v1}, Lo/fps;->c(Lo/fps;Lo/fpd;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1234
    :cond_0
    iget-object v0, p0, Lo/fps$5;->b:Lo/fps;

    invoke-static {v0}, Lo/fps;->e(Lo/fps;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 1235
    goto :goto_0

    .line 1228
    :catch_0
    move-exception v3

    .line 1229
    :try_start_1
    iget-object v0, p0, Lo/fps$5;->b:Lo/fps;

    invoke-static {v0}, Lo/fps;->a(Lo/fps;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1230
    invoke-static {}, Lo/fps;->h()Lo/fty;

    move-result-object v0

    const-string v1, "Exception thrown by executor thread [{}]"

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2, v3}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1234
    :cond_1
    iget-object v0, p0, Lo/fps$5;->b:Lo/fps;

    invoke-static {v0}, Lo/fps;->e(Lo/fps;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 1235
    goto :goto_0

    .line 1234
    :catchall_0
    move-exception v4

    iget-object v0, p0, Lo/fps$5;->b:Lo/fps;

    invoke-static {v0}, Lo/fps;->e(Lo/fps;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    throw v4

    .line 1236
    :goto_0
    return-void
.end method
