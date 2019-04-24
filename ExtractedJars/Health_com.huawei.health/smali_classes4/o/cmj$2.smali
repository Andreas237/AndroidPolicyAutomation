.class Lo/cmj$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cmj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/cmj;


# direct methods
.method constructor <init>(Lo/cmj;)V
    .locals 0

    .line 487
    iput-object p1, p0, Lo/cmj$2;->b:Lo/cmj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 4

    .line 490
    const-string v0, "HealthOpenSDK"

    const-string v1, "onServiceConnected"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 491
    iget-object v0, p0, Lo/cmj$2;->b:Lo/cmj;

    invoke-static {p2}, Lo/dle$c;->b(Landroid/os/IBinder;)Lo/dle;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cmj;->d(Lo/cmj;Lo/dle;)Lo/dle;

    .line 492
    iget-object v0, p0, Lo/cmj$2;->b:Lo/cmj;

    invoke-static {v0}, Lo/cmj;->c(Lo/cmj;)Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 493
    :try_start_0
    iget-object v0, p0, Lo/cmj$2;->b:Lo/cmj;

    invoke-static {v0}, Lo/cmj;->c(Lo/cmj;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 494
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 496
    :goto_0
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 5

    .line 500
    const-string v0, "HealthOpenSDK"

    const-string v1, "onServiceDisconnected"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 501
    const-string v0, "HealthOpenSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onServiceDisconnected "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 502
    iget-object v0, p0, Lo/cmj$2;->b:Lo/cmj;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cmj;->d(Lo/cmj;Lo/dle;)Lo/dle;

    .line 503
    iget-object v0, p0, Lo/cmj$2;->b:Lo/cmj;

    invoke-static {v0}, Lo/cmj;->c(Lo/cmj;)Ljava/lang/Object;

    move-result-object v3

    monitor-enter v3

    .line 504
    :try_start_0
    iget-object v0, p0, Lo/cmj$2;->b:Lo/cmj;

    invoke-static {v0}, Lo/cmj;->c(Lo/cmj;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 505
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 506
    :goto_0
    return-void
.end method
