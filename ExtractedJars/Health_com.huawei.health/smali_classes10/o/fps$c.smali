.class abstract Lo/fps$c;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fps;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x400
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lo/fps;


# direct methods
.method protected constructor <init>(Lo/fps;Ljava/lang/String;)V
    .locals 1

    .line 1678
    iput-object p1, p0, Lo/fps$c;->a:Lo/fps;

    .line 1679
    sget-object v0, Lo/fpr;->b:Ljava/lang/ThreadGroup;

    invoke-direct {p0, v0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/ThreadGroup;Ljava/lang/String;)V

    .line 1680
    return-void
.end method


# virtual methods
.method protected abstract c()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public run()V
    .locals 5

    .line 1685
    :try_start_0
    invoke-static {}, Lo/fps;->h()Lo/fty;

    move-result-object v0

    const-string v1, "Starting worker thread [{}]"

    invoke-virtual {p0}, Lo/fps$c;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1686
    :goto_0
    iget-object v0, p0, Lo/fps$c;->a:Lo/fps;

    invoke-static {v0}, Lo/fps;->a(Lo/fps;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 1688
    :try_start_1
    invoke-virtual {p0}, Lo/fps$c;->c()V
    :try_end_1
    .catch Ljava/nio/channels/ClosedByInterruptException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1695
    goto :goto_0

    .line 1689
    :catch_0
    move-exception v3

    .line 1690
    :try_start_2
    invoke-static {}, Lo/fps;->h()Lo/fty;

    move-result-object v0

    const-string v1, "Worker thread [{}] has been interrupted"

    invoke-virtual {p0}, Lo/fps$c;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1695
    goto :goto_0

    .line 1691
    :catch_1
    move-exception v3

    .line 1692
    iget-object v0, p0, Lo/fps$c;->a:Lo/fps;

    invoke-static {v0}, Lo/fps;->a(Lo/fps;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1693
    invoke-static {}, Lo/fps;->h()Lo/fty;

    move-result-object v0

    const-string v1, "Exception thrown by worker thread [{}]"

    invoke-virtual {p0}, Lo/fps$c;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2, v3}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1695
    :cond_0
    goto :goto_0

    .line 1698
    :cond_1
    invoke-static {}, Lo/fps;->h()Lo/fty;

    move-result-object v0

    const-string v1, "Worker thread [{}] has terminated"

    invoke-virtual {p0}, Lo/fps$c;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1699
    goto :goto_1

    .line 1698
    :catchall_0
    move-exception v4

    invoke-static {}, Lo/fps;->h()Lo/fty;

    move-result-object v0

    const-string v1, "Worker thread [{}] has terminated"

    invoke-virtual {p0}, Lo/fps$c;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Object;)V

    throw v4

    .line 1700
    :goto_1
    return-void
.end method
