.class Lo/ahi$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ahi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field a:Landroid/os/Handler;

.field b:Lo/ahi$e;


# direct methods
.method constructor <init>(Lo/ahi$e;I)V
    .locals 3

    .line 220
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 221
    iput-object p1, p0, Lo/ahi$d;->b:Lo/ahi$e;

    .line 222
    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    .line 223
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    .line 224
    if-nez v2, :cond_0

    .line 225
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "No Looper; Looper.prepare() wasn\'t called on this thread."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 227
    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lo/ahi$d;->a:Landroid/os/Handler;

    .line 228
    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    if-ne p2, v0, :cond_2

    .line 229
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lo/ahi$d;->a:Landroid/os/Handler;

    goto :goto_0

    .line 232
    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ahi$d;->a:Landroid/os/Handler;

    .line 234
    :goto_0
    return-void
.end method


# virtual methods
.method a(Lo/ahi$a;)V
    .locals 2

    .line 237
    new-instance v1, Lo/ahi$d$1;

    invoke-direct {v1, p0, p1}, Lo/ahi$d$1;-><init>(Lo/ahi$d;Lo/ahi$a;)V

    .line 259
    iget-object v0, p0, Lo/ahi$d;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 260
    iget-object v0, p0, Lo/ahi$d;->a:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 262
    :cond_0
    invoke-static {}, Lo/ahi;->b()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    if-nez v0, :cond_1

    .line 263
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lo/ahi;->c(Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ExecutorService;

    .line 265
    :cond_1
    invoke-static {}, Lo/ahi;->b()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 267
    :goto_0
    return-void
.end method
