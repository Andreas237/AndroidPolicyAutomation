.class Lo/ara$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ara;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field private c:Z

.field final synthetic e:Lo/ara;


# direct methods
.method public constructor <init>(Lo/ara;)V
    .locals 1

    .line 118
    iput-object p1, p0, Lo/ara$a;->e:Lo/ara;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ara$a;->c:Z

    .line 119
    return-void
.end method

.method static synthetic c(Lo/ara$a;)Z
    .locals 1

    .line 107
    iget-boolean v0, p0, Lo/ara$a;->c:Z

    return v0
.end method

.method static synthetic c(Lo/ara$a;Z)Z
    .locals 0

    .line 107
    iput-boolean p1, p0, Lo/ara$a;->c:Z

    return p1
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 124
    iget-object v0, p0, Lo/ara$a;->e:Lo/ara;

    invoke-static {v0}, Lo/ara;->c(Lo/ara;)Ljava/lang/Object;

    move-result-object v3

    monitor-enter v3

    .line 126
    :goto_0
    :try_start_0
    iget-boolean v0, p0, Lo/ara$a;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 130
    :try_start_1
    iget-object v0, p0, Lo/ara$a;->e:Lo/ara;

    invoke-static {v0}, Lo/ara;->c(Lo/ara;)Ljava/lang/Object;

    move-result-object v0

    const-wide/16 v1, 0x7530

    invoke-virtual {v0, v1, v2}, Ljava/lang/Object;->wait(J)V

    .line 131
    iget-object v0, p0, Lo/ara$a;->e:Lo/ara;

    invoke-static {v0}, Lo/ara;->d(Lo/ara;)V

    .line 132
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ara$a;->c:Z
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 137
    goto :goto_0

    .line 134
    :catch_0
    move-exception v4

    .line 136
    const/4 v0, 0x0

    :try_start_2
    iput-boolean v0, p0, Lo/ara$a;->c:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 137
    goto :goto_0

    .line 139
    :cond_0
    monitor-exit v3

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v3

    throw v5

    .line 140
    :goto_1
    return-void
.end method
