.class final Lo/aze$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aze;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Lo/aze;

.field private b:Ljava/lang/Runnable;

.field private d:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method private constructor <init>(Lo/aze;Ljava/lang/Runnable;)V
    .locals 2

    .line 122
    iput-object p1, p0, Lo/aze$e;->a:Lo/aze;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 114
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo/aze$e;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 123
    iput-object p2, p0, Lo/aze$e;->b:Ljava/lang/Runnable;

    .line 124
    return-void
.end method

.method synthetic constructor <init>(Lo/aze;Ljava/lang/Runnable;Lo/aze$5;)V
    .locals 0

    .line 104
    invoke-direct {p0, p1, p2}, Lo/aze$e;-><init>(Lo/aze;Ljava/lang/Runnable;)V

    return-void
.end method

.method private d()V
    .locals 2

    .line 131
    iget-object v0, p0, Lo/aze$e;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 132
    return-void
.end method

.method static synthetic d(Lo/aze$e;)V
    .locals 0

    .line 104
    invoke-direct {p0}, Lo/aze$e;->d()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 137
    iget-object v0, p0, Lo/aze$e;->b:Ljava/lang/Runnable;

    if-eqz v0, :cond_1

    .line 141
    :try_start_0
    iget-object v0, p0, Lo/aze$e;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 143
    iget-object v0, p0, Lo/aze$e;->b:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 149
    :cond_0
    goto :goto_0

    .line 146
    :catch_0
    move-exception v2

    .line 148
    const-string v0, "IMThreadExecutor"

    const-string v1, "meet Throwable Exception."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    :goto_0
    iget-object v0, p0, Lo/aze$e;->a:Lo/aze;

    invoke-static {v0}, Lo/aze;->b(Lo/aze;)Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/Queue;->remove(Ljava/lang/Object;)Z

    .line 153
    :cond_1
    return-void
.end method
