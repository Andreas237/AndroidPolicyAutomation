.class Lo/eek$4;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eek;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/eek;


# direct methods
.method constructor <init>(Lo/eek;)V
    .locals 0

    .line 119
    iput-object p1, p0, Lo/eek$4;->a:Lo/eek;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 123
    iget-object v0, p0, Lo/eek$4;->a:Lo/eek;

    invoke-static {v0}, Lo/eek;->c(Lo/eek;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 125
    :try_start_0
    iget-object v0, p0, Lo/eek$4;->a:Lo/eek;

    invoke-static {v0}, Lo/eek;->e(Lo/eek;)Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 127
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 129
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/een;

    .line 130
    invoke-virtual {v3}, Lo/een;->d()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    .line 134
    :try_start_1
    invoke-virtual {v3}, Lo/een;->e()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 139
    goto :goto_1

    .line 136
    :catch_0
    move-exception v4

    .line 138
    :try_start_2
    invoke-virtual {v4}, Ljava/lang/Exception;->printStackTrace()V

    .line 140
    :goto_1
    iget-object v0, p0, Lo/eek$4;->a:Lo/eek;

    invoke-static {v0}, Lo/eek;->e(Lo/eek;)Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0, v3}, Ljava/util/Queue;->remove(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 143
    :cond_1
    monitor-exit v1

    goto :goto_2

    :catchall_0
    move-exception v5

    monitor-exit v1

    throw v5

    .line 144
    :goto_2
    return-void
.end method
