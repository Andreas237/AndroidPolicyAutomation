.class Lo/cmu$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cmu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cmu;


# direct methods
.method constructor <init>(Lo/cmu;)V
    .locals 0

    .line 123
    iput-object p1, p0, Lo/cmu$2;->a:Lo/cmu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 126
    iget-object v0, p0, Lo/cmu$2;->a:Lo/cmu;

    invoke-static {v0}, Lo/cmu;->e(Lo/cmu;)I

    .line 127
    iget-object v0, p0, Lo/cmu$2;->a:Lo/cmu;

    invoke-static {v0}, Lo/cmu;->b(Lo/cmu;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "rebind times = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/cmu$2;->a:Lo/cmu;

    invoke-static {v2}, Lo/cmu;->d(Lo/cmu;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 128
    iget-object v0, p0, Lo/cmu$2;->a:Lo/cmu;

    invoke-static {v0}, Lo/cmu;->d(Lo/cmu;)I

    move-result v0

    const/4 v1, 0x5

    if-le v0, v1, :cond_0

    .line 129
    iget-object v0, p0, Lo/cmu$2;->a:Lo/cmu;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cmu;->c(Lo/cmu;I)I

    .line 130
    iget-object v0, p0, Lo/cmu$2;->a:Lo/cmu;

    invoke-static {v0}, Lo/cmu;->b(Lo/cmu;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "retyr 3 times, stop retry"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 131
    return-void

    .line 133
    :cond_0
    iget-object v0, p0, Lo/cmu$2;->a:Lo/cmu;

    invoke-static {v0}, Lo/cmu;->a(Lo/cmu;)Z

    move-result v4

    .line 134
    if-eqz v4, :cond_1

    .line 135
    iget-object v0, p0, Lo/cmu$2;->a:Lo/cmu;

    invoke-static {v0}, Lo/cmu;->c(Lo/cmu;)Z

    move-result v4

    .line 136
    if-eqz v4, :cond_1

    .line 137
    iget-object v0, p0, Lo/cmu$2;->a:Lo/cmu;

    invoke-static {v0}, Lo/cmu;->g(Lo/cmu;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 138
    iget-object v0, p0, Lo/cmu$2;->a:Lo/cmu;

    invoke-virtual {v0}, Lo/cmu;->c()V

    .line 139
    iget-object v0, p0, Lo/cmu$2;->a:Lo/cmu;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cmu;->b(Lo/cmu;Z)Z

    .line 144
    :cond_1
    if-nez v4, :cond_2

    .line 145
    invoke-static {}, Lo/cmu;->h()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iget-object v1, p0, Lo/cmu$2;->a:Lo/cmu;

    invoke-static {v1}, Lo/cmu;->d(Lo/cmu;)I

    move-result v1

    mul-int/lit16 v1, v1, 0x1388

    int-to-long v1, v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, p0, v1, v2, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 147
    :cond_2
    return-void
.end method
