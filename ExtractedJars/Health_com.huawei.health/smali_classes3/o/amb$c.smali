.class Lo/amb$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/alb;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/amb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic c:Lo/amb;


# direct methods
.method private constructor <init>(Lo/amb;)V
    .locals 0

    .line 489
    iput-object p1, p0, Lo/amb$c;->c:Lo/amb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/amb;Lo/amb$5;)V
    .locals 0

    .line 489
    invoke-direct {p0, p1}, Lo/amb$c;-><init>(Lo/amb;)V

    return-void
.end method


# virtual methods
.method public b(Lo/ald;)V
    .locals 9

    .line 494
    if-nez p1, :cond_0

    .line 495
    return-void

    .line 498
    :cond_0
    move-object v4, p0

    monitor-enter v4

    .line 501
    :try_start_0
    iget-object v0, p0, Lo/amb$c;->c:Lo/amb;

    invoke-static {v0}, Lo/amb;->d(Lo/amb;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 505
    goto :goto_0

    .line 502
    :catch_0
    move-exception v6

    .line 503
    const/4 v5, 0x0

    .line 504
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "report state not reade"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 506
    :goto_0
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Report client count "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->c(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 508
    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_1

    .line 510
    :try_start_2
    invoke-virtual {p1}, Lo/ald;->c()Landroid/os/Bundle;

    move-result-object v7

    .line 511
    iget-object v0, p0, Lo/amb$c;->c:Lo/amb;

    invoke-static {v0}, Lo/amb;->d(Lo/amb;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lo/abg;

    invoke-interface {v0, v7}, Lo/abg;->e(Landroid/os/Bundle;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 515
    goto :goto_2

    .line 513
    :catch_1
    move-exception v7

    .line 514
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "report remote exception..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 508
    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 519
    :cond_1
    :try_start_4
    iget-object v0, p0, Lo/amb$c;->c:Lo/amb;

    invoke-static {v0}, Lo/amb;->d(Lo/amb;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V
    :try_end_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 523
    goto :goto_3

    .line 520
    :catch_2
    move-exception v6

    .line 521
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x1

    :try_start_5
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "report state not reade"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 524
    :goto_3
    monitor-exit v4

    goto :goto_4

    :catchall_0
    move-exception v8

    monitor-exit v4

    throw v8

    .line 525
    :goto_4
    return-void
.end method
