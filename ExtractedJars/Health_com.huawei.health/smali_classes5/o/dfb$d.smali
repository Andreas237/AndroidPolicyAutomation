.class Lo/dfb$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/vq;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dfb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic b:Lo/dfb;


# direct methods
.method private constructor <init>(Lo/dfb;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lo/dfb$d;->b:Lo/dfb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/dfb;Lo/dfb$5;)V
    .locals 0

    .line 110
    invoke-direct {p0, p1}, Lo/dfb$d;-><init>(Lo/dfb;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 8

    .line 122
    const-string v0, "PowerKitManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PowerKitConnectionImp service connected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    iget-object v0, p0, Lo/dfb$d;->b:Lo/dfb;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/dfb;->a(Lo/dfb;Z)Z

    .line 124
    invoke-static {}, Lo/dfb;->b()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    .line 125
    :try_start_0
    iget-object v0, p0, Lo/dfb$d;->b:Lo/dfb;

    invoke-static {v0}, Lo/dfb;->e(Lo/dfb;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/dfb$a;

    .line 126
    invoke-interface {v6}, Lo/dfb$a;->e()V

    .line 127
    goto :goto_0

    .line 128
    :cond_0
    iget-object v0, p0, Lo/dfb$d;->b:Lo/dfb;

    invoke-static {v0}, Lo/dfb;->e(Lo/dfb;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7

    .line 130
    :goto_1
    return-void
.end method

.method public d()V
    .locals 6

    .line 113
    const-string v0, "PowerKitManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PowerKitConnectionImp service disconnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    iget-object v0, p0, Lo/dfb$d;->b:Lo/dfb;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dfb;->a(Lo/dfb;Z)Z

    .line 115
    invoke-static {}, Lo/dfb;->b()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    .line 116
    :try_start_0
    iget-object v0, p0, Lo/dfb$d;->b:Lo/dfb;

    invoke-static {v0}, Lo/dfb;->e(Lo/dfb;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 118
    :goto_0
    return-void
.end method
