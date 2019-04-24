.class public final Lo/aaq;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/aaq$e;,
        Lo/aaq$a;
    }
.end annotation


# instance fields
.field private d:Ljava/util/concurrent/ExecutorService;


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aaq;->d:Ljava/util/concurrent/ExecutorService;

    .line 59
    const-string v0, "ThreadPool init!"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->e(Ljava/lang/String;Z)V

    .line 61
    new-instance v0, Lo/aaq$e;

    invoke-direct {v0}, Lo/aaq$e;-><init>()V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newCachedThreadPool(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/aaq;->d:Ljava/util/concurrent/ExecutorService;

    .line 62
    return-void
.end method

.method synthetic constructor <init>(Lo/aaq;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Lo/aaq;-><init>()V

    return-void
.end method

.method public static a()Lo/aaq;
    .locals 1

    .line 72
    sget-object v0, Lo/aaq$a;->d:Lo/aaq;

    return-object v0
.end method


# virtual methods
.method public c(Ljava/lang/Runnable;)V
    .locals 3

    .line 85
    :try_start_0
    iget-object v0, p0, Lo/aaq;->d:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    goto :goto_0

    .line 87
    :catch_0
    move-exception v2

    .line 89
    const-string v0, "the runnable task cannot be accepted for execution"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 91
    :goto_0
    return-void
.end method
