.class Lo/fnd$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fnd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field private a:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<*>;"
        }
    .end annotation
.end field

.field final synthetic d:Lo/fnd;


# direct methods
.method private constructor <init>(Lo/fnd;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lo/fnd$e;->d:Lo/fnd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/fnd;Lo/fnd$4;)V
    .locals 0

    .line 151
    invoke-direct {p0, p1}, Lo/fnd$e;-><init>(Lo/fnd;)V

    return-void
.end method

.method private a()V
    .locals 2

    .line 186
    iget-object v0, p0, Lo/fnd$e;->a:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    .line 187
    iget-object v0, p0, Lo/fnd$e;->a:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 189
    :cond_0
    return-void
.end method

.method static synthetic b(Lo/fnd$e;)V
    .locals 0

    .line 151
    invoke-direct {p0}, Lo/fnd$e;->d()V

    return-void
.end method

.method private d()V
    .locals 4

    .line 179
    iget-object v0, p0, Lo/fnd$e;->d:Lo/fnd;

    invoke-static {v0}, Lo/fnd;->d(Lo/fnd;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    .line 180
    invoke-static {}, Lo/fnd;->d()Lo/fty;

    move-result-object v0

    const-string v1, "CR schedules in {} ms"

    iget-object v2, p0, Lo/fnd$e;->d:Lo/fnd;

    invoke-static {v2}, Lo/fnd;->b(Lo/fnd;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 181
    iget-object v0, p0, Lo/fnd$e;->d:Lo/fnd;

    invoke-static {v0}, Lo/fnd;->d(Lo/fnd;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iget-object v1, p0, Lo/fnd$e;->d:Lo/fnd;

    invoke-static {v1}, Lo/fnd;->b(Lo/fnd;)J

    move-result-wide v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, p0, v1, v2, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lo/fnd$e;->a:Ljava/util/concurrent/ScheduledFuture;

    .line 183
    :cond_0
    return-void
.end method

.method static synthetic d(Lo/fnd$e;)V
    .locals 0

    .line 151
    invoke-direct {p0}, Lo/fnd$e;->a()V

    return-void
.end method

.method private e()V
    .locals 6

    .line 170
    iget-object v0, p0, Lo/fnd$e;->d:Lo/fnd;

    invoke-static {v0}, Lo/fnd;->a(Lo/fnd;)[Lo/fnd$b;

    move-result-object v3

    monitor-enter v3

    .line 171
    :try_start_0
    iget-object v0, p0, Lo/fnd$e;->d:Lo/fnd;

    invoke-static {v0}, Lo/fnd;->e(Lo/fnd;)I

    move-result v4

    .line 172
    iget-object v0, p0, Lo/fnd$e;->d:Lo/fnd;

    iget-object v1, p0, Lo/fnd$e;->d:Lo/fnd;

    invoke-static {v1}, Lo/fnd;->c(Lo/fnd;)I

    move-result v1

    invoke-static {v0, v1}, Lo/fnd;->d(Lo/fnd;I)I

    .line 173
    iget-object v0, p0, Lo/fnd$e;->d:Lo/fnd;

    iget-object v1, p0, Lo/fnd$e;->d:Lo/fnd;

    invoke-static {v1}, Lo/fnd;->c(Lo/fnd;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    rem-int/lit8 v1, v1, 0x3

    invoke-static {v0, v1}, Lo/fnd;->c(Lo/fnd;I)I

    .line 174
    iget-object v0, p0, Lo/fnd$e;->d:Lo/fnd;

    invoke-static {v0}, Lo/fnd;->a(Lo/fnd;)[Lo/fnd$b;

    move-result-object v0

    aget-object v0, v0, v4

    invoke-virtual {v0}, Lo/fnd$b;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 175
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v3

    throw v5

    .line 176
    :goto_0
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 157
    :try_start_0
    invoke-direct {p0}, Lo/fnd$e;->e()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 162
    :try_start_1
    invoke-direct {p0}, Lo/fnd$e;->d()V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    .line 165
    goto :goto_1

    .line 163
    :catch_0
    move-exception v2

    .line 164
    invoke-static {}, Lo/fnd;->d()Lo/fty;

    move-result-object v0

    const-string v1, "Exception while scheduling Crop-Rotation algorithm"

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 166
    goto :goto_1

    .line 158
    :catch_1
    move-exception v2

    .line 159
    :try_start_2
    invoke-static {}, Lo/fnd;->d()Lo/fty;

    move-result-object v0

    const-string v1, "Exception in Crop-Rotation algorithm"

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 162
    :try_start_3
    invoke-direct {p0}, Lo/fnd$e;->d()V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_2

    .line 165
    goto :goto_1

    .line 163
    :catch_2
    move-exception v2

    .line 164
    invoke-static {}, Lo/fnd;->d()Lo/fty;

    move-result-object v0

    const-string v1, "Exception while scheduling Crop-Rotation algorithm"

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 166
    goto :goto_1

    .line 161
    :catchall_0
    move-exception v3

    .line 162
    :try_start_4
    invoke-direct {p0}, Lo/fnd$e;->d()V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_3

    .line 165
    goto :goto_0

    .line 163
    :catch_3
    move-exception v4

    .line 164
    invoke-static {}, Lo/fnd;->d()Lo/fty;

    move-result-object v0

    const-string v1, "Exception while scheduling Crop-Rotation algorithm"

    invoke-interface {v0, v1, v4}, Lo/fty;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 165
    :goto_0
    throw v3

    .line 167
    :goto_1
    return-void
.end method
