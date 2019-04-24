.class public Lcom/huawei/openalliance/ad/download/b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Lcom/huawei/openalliance/ad/download/e;>Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:Landroid/content/Context;

.field public b:Ljava/lang/String;

.field protected c:Lcom/huawei/openalliance/ad/download/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/huawei/openalliance/ad/download/a<TT;>;"
        }
    .end annotation
.end field

.field protected d:Lcom/huawei/openalliance/ad/download/g;

.field protected e:Lcom/huawei/openalliance/ad/download/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/huawei/openalliance/ad/download/c<TT;>;"
        }
    .end annotation
.end field

.field private f:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/String;)Lcom/huawei/openalliance/ad/download/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->e:Lcom/huawei/openalliance/ad/download/c;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/download/c;->a(Ljava/lang/String;)Lcom/huawei/openalliance/ad/download/e;

    move-result-object v0

    return-object v0
.end method

.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->e:Lcom/huawei/openalliance/ad/download/c;

    if-nez v0, :cond_0

    new-instance v0, Lcom/huawei/openalliance/ad/download/c;

    invoke-direct {v0}, Lcom/huawei/openalliance/ad/download/c;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->e:Lcom/huawei/openalliance/ad/download/c;

    :cond_0
    new-instance v0, Lcom/huawei/openalliance/ad/download/f;

    invoke-direct {v0}, Lcom/huawei/openalliance/ad/download/f;-><init>()V

    const/4 v1, 0x1

    invoke-static {v1, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->f:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Lcom/huawei/openalliance/ad/download/g;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/download/g;-><init>(Lcom/huawei/openalliance/ad/download/b;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->d:Lcom/huawei/openalliance/ad/download/g;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->f:Ljava/util/concurrent/ExecutorService;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/download/b;->d:Lcom/huawei/openalliance/ad/download/g;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/download/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/openalliance/ad/download/a<TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/download/b;->c:Lcom/huawei/openalliance/ad/download/a;

    return-void
.end method

.method protected a(Lcom/huawei/openalliance/ad/download/e;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "DownloadManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onDownloadCompleted, taskId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", priority:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->j()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->e:Lcom/huawei/openalliance/ad/download/c;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/download/c;->c(Lcom/huawei/openalliance/ad/download/e;)V

    :cond_1
    return-void
.end method

.method protected a(Lcom/huawei/openalliance/ad/download/e;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "DownloadManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onDownloadProgress, progress:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", taskId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p1, p2}, Lcom/huawei/openalliance/ad/download/e;->b(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->c:Lcom/huawei/openalliance/ad/download/a;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->c:Lcom/huawei/openalliance/ad/download/a;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/download/a;->c(Lcom/huawei/openalliance/ad/download/e;)V

    :cond_3
    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/download/e;Lcom/huawei/openalliance/ad/download/e$b;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;Lcom/huawei/openalliance/ad/download/e$b;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->e:Lcom/huawei/openalliance/ad/download/c;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/download/c;->d(Lcom/huawei/openalliance/ad/download/e;)Z

    move-result v3

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "DownloadManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "pauseTask, succ:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", taskId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    if-eqz v3, :cond_3

    invoke-virtual {p1, p2}, Lcom/huawei/openalliance/ad/download/e;->a(Lcom/huawei/openalliance/ad/download/e$b;)V

    sget-object v0, Lcom/huawei/openalliance/ad/download/d;->a:Lcom/huawei/openalliance/ad/download/d;

    invoke-virtual {p1, v0}, Lcom/huawei/openalliance/ad/download/e;->a(Lcom/huawei/openalliance/ad/download/d;)V

    sget-object v0, Lcom/huawei/openalliance/ad/download/e$b;->b:Lcom/huawei/openalliance/ad/download/e$b;

    if-ne v0, p2, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, p1, v0}, Lcom/huawei/openalliance/ad/download/b;->c(Lcom/huawei/openalliance/ad/download/e;Z)V

    :cond_3
    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/download/e;Z)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;Z)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->k()I

    move-result v0

    const/16 v1, 0x64

    if-lt v0, v1, :cond_1

    invoke-virtual {p0, p1}, Lcom/huawei/openalliance/ad/download/b;->f(Lcom/huawei/openalliance/ad/download/e;)V

    return-void

    :cond_1
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->p()Z

    move-result v3

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/openalliance/ad/download/e;->b(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->e:Lcom/huawei/openalliance/ad/download/c;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/download/c;->e(Lcom/huawei/openalliance/ad/download/e;)Z

    move-result v4

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "DownloadManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "resumeTask, succ:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", taskId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    if-eqz v4, :cond_3

    sget-object v0, Lcom/huawei/openalliance/ad/download/d;->b:Lcom/huawei/openalliance/ad/download/d;

    invoke-virtual {p1, v0}, Lcom/huawei/openalliance/ad/download/e;->a(Lcom/huawei/openalliance/ad/download/d;)V

    invoke-virtual {p0, p1, p2}, Lcom/huawei/openalliance/ad/download/b;->d(Lcom/huawei/openalliance/ad/download/e;Z)V

    goto :goto_0

    :cond_3
    invoke-virtual {p1, v3}, Lcom/huawei/openalliance/ad/download/e;->b(Z)V

    :goto_0
    return-void
.end method

.method protected b()Lcom/huawei/openalliance/ad/download/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->e:Lcom/huawei/openalliance/ad/download/c;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/download/c;->b()Lcom/huawei/openalliance/ad/download/e;

    move-result-object v0

    return-object v0
.end method

.method protected b(Lcom/huawei/openalliance/ad/download/e;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->e:Lcom/huawei/openalliance/ad/download/c;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/download/c;->b(Lcom/huawei/openalliance/ad/download/e;)Z

    move-result v0

    return v0
.end method

.method protected b(Lcom/huawei/openalliance/ad/download/e;Z)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;Z)Z"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    if-eqz p2, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/openalliance/ad/download/e;->b(Z)V

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->e:Lcom/huawei/openalliance/ad/download/c;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/download/c;->f(Lcom/huawei/openalliance/ad/download/e;)Z

    move-result v3

    const-string v0, "DownloadManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "removeTask, succ:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", fromUser:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/huawei/openalliance/ad/download/b$1;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/download/b$1;-><init>(Lcom/huawei/openalliance/ad/download/b;Lcom/huawei/openalliance/ad/download/e;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->d(Ljava/lang/Runnable;)V

    invoke-virtual {p0, p1, p2}, Lcom/huawei/openalliance/ad/download/b;->e(Lcom/huawei/openalliance/ad/download/e;Z)V

    const/4 v0, 0x1

    return v0
.end method

.method protected c()I
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->e:Lcom/huawei/openalliance/ad/download/c;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/download/c;->a()I

    move-result v0

    return v0
.end method

.method protected c(Lcom/huawei/openalliance/ad/download/e;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;Z)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "DownloadManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onDownloadPaused, taskId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->c:Lcom/huawei/openalliance/ad/download/a;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->c:Lcom/huawei/openalliance/ad/download/a;

    invoke-interface {v0, p1, p2}, Lcom/huawei/openalliance/ad/download/a;->b(Lcom/huawei/openalliance/ad/download/e;Z)V

    :cond_3
    return-void
.end method

.method protected c(Lcom/huawei/openalliance/ad/download/e;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->h()Lcom/huawei/openalliance/ad/download/d;

    move-result-object v3

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->p()Z

    move-result v4

    sget-object v0, Lcom/huawei/openalliance/ad/download/d;->b:Lcom/huawei/openalliance/ad/download/d;

    invoke-virtual {p1, v0}, Lcom/huawei/openalliance/ad/download/e;->a(Lcom/huawei/openalliance/ad/download/d;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/openalliance/ad/download/e;->b(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->e:Lcom/huawei/openalliance/ad/download/c;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/download/c;->a(Lcom/huawei/openalliance/ad/download/e;)Z

    move-result v5

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "DownloadManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "addTask, added:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", task:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", priority:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->j()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    if-eqz v5, :cond_1

    invoke-virtual {p0, p1}, Lcom/huawei/openalliance/ad/download/b;->d(Lcom/huawei/openalliance/ad/download/e;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1, v3}, Lcom/huawei/openalliance/ad/download/e;->a(Lcom/huawei/openalliance/ad/download/d;)V

    invoke-virtual {p1, v4}, Lcom/huawei/openalliance/ad/download/e;->b(Z)V

    :goto_0
    return v5
.end method

.method protected d()I
    .locals 1

    const v0, 0x3e800

    return v0
.end method

.method protected d(Lcom/huawei/openalliance/ad/download/e;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "DownloadManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onDownloadWaiting, taskId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->c:Lcom/huawei/openalliance/ad/download/a;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->c:Lcom/huawei/openalliance/ad/download/a;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/download/a;->a(Lcom/huawei/openalliance/ad/download/e;)V

    :cond_3
    return-void
.end method

.method protected d(Lcom/huawei/openalliance/ad/download/e;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;Z)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "DownloadManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onDownloadResumed, taskId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->c:Lcom/huawei/openalliance/ad/download/a;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->c:Lcom/huawei/openalliance/ad/download/a;

    invoke-interface {v0, p1, p2}, Lcom/huawei/openalliance/ad/download/a;->c(Lcom/huawei/openalliance/ad/download/e;Z)V

    :cond_3
    return-void
.end method

.method protected e(Lcom/huawei/openalliance/ad/download/e;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "DownloadManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onDownloadStart, taskId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    sget-object v0, Lcom/huawei/openalliance/ad/download/d;->c:Lcom/huawei/openalliance/ad/download/d;

    invoke-virtual {p1, v0}, Lcom/huawei/openalliance/ad/download/e;->a(Lcom/huawei/openalliance/ad/download/d;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->c:Lcom/huawei/openalliance/ad/download/a;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->c:Lcom/huawei/openalliance/ad/download/a;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/download/a;->b(Lcom/huawei/openalliance/ad/download/e;)V

    :cond_3
    return-void
.end method

.method protected e(Lcom/huawei/openalliance/ad/download/e;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;Z)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "DownloadManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onDownloadDeleted, taskId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->c:Lcom/huawei/openalliance/ad/download/a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->c:Lcom/huawei/openalliance/ad/download/a;

    invoke-interface {v0, p1, p2}, Lcom/huawei/openalliance/ad/download/a;->a(Lcom/huawei/openalliance/ad/download/e;Z)V

    :cond_2
    return-void
.end method

.method protected f(Lcom/huawei/openalliance/ad/download/e;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "DownloadManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onDownloadSuccess, taskId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->e:Lcom/huawei/openalliance/ad/download/c;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/download/c;->b(Lcom/huawei/openalliance/ad/download/e;)Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->c:Lcom/huawei/openalliance/ad/download/a;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->c:Lcom/huawei/openalliance/ad/download/a;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/download/a;->d(Lcom/huawei/openalliance/ad/download/e;)V

    :cond_3
    return-void
.end method

.method protected g(Lcom/huawei/openalliance/ad/download/e;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "DownloadManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onDownloadSwitchSafeUrl, taskId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->c:Lcom/huawei/openalliance/ad/download/a;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->c:Lcom/huawei/openalliance/ad/download/a;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/download/a;->e(Lcom/huawei/openalliance/ad/download/e;)V

    :cond_3
    return-void
.end method

.method protected h(Lcom/huawei/openalliance/ad/download/e;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "DownloadManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onDownloadFail, taskId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/i;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/i;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/openalliance/ad/download/e;->b(I)V

    :cond_3
    invoke-virtual {p0, p1}, Lcom/huawei/openalliance/ad/download/b;->b(Lcom/huawei/openalliance/ad/download/e;)Z

    sget-object v0, Lcom/huawei/openalliance/ad/download/d;->e:Lcom/huawei/openalliance/ad/download/d;

    invoke-virtual {p1, v0}, Lcom/huawei/openalliance/ad/download/e;->a(Lcom/huawei/openalliance/ad/download/d;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->c:Lcom/huawei/openalliance/ad/download/a;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/b;->c:Lcom/huawei/openalliance/ad/download/a;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/download/a;->f(Lcom/huawei/openalliance/ad/download/e;)V

    :cond_4
    return-void
.end method
