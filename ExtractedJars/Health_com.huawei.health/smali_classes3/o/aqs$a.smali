.class Lo/aqs$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aqs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field private a:Z

.field final synthetic c:Lo/aqs;


# direct methods
.method public constructor <init>(Lo/aqs;)V
    .locals 1

    .line 429
    iput-object p1, p0, Lo/aqs$a;->c:Lo/aqs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 423
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aqs$a;->a:Z

    .line 430
    return-void
.end method

.method static synthetic b(Lo/aqs$a;Z)Z
    .locals 0

    .line 418
    iput-boolean p1, p0, Lo/aqs$a;->a:Z

    return p1
.end method

.method static synthetic c(Lo/aqs$a;)Z
    .locals 1

    .line 418
    iget-boolean v0, p0, Lo/aqs$a;->a:Z

    return v0
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 435
    iget-object v0, p0, Lo/aqs$a;->c:Lo/aqs;

    invoke-static {v0}, Lo/aqs;->a(Lo/aqs;)Ljava/lang/Object;

    move-result-object v3

    monitor-enter v3

    .line 437
    :goto_0
    :try_start_0
    iget-boolean v0, p0, Lo/aqs$a;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 441
    :try_start_1
    iget-object v0, p0, Lo/aqs$a;->c:Lo/aqs;

    invoke-static {v0}, Lo/aqs;->a(Lo/aqs;)Ljava/lang/Object;

    move-result-object v0

    const-wide/16 v1, 0x7530

    invoke-virtual {v0, v1, v2}, Ljava/lang/Object;->wait(J)V

    .line 442
    iget-object v0, p0, Lo/aqs$a;->c:Lo/aqs;

    invoke-static {v0}, Lo/aqs;->e(Lo/aqs;)V

    .line 443
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aqs$a;->a:Z
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 448
    goto :goto_0

    .line 445
    :catch_0
    move-exception v4

    .line 447
    const/4 v0, 0x0

    :try_start_2
    iput-boolean v0, p0, Lo/aqs$a;->a:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 448
    goto :goto_0

    .line 450
    :cond_0
    monitor-exit v3

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v3

    throw v5

    .line 451
    :goto_1
    return-void
.end method
