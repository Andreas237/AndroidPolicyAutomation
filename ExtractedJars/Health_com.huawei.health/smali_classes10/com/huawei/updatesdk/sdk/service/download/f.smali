.class public Lcom/huawei/updatesdk/sdk/service/download/f;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/updatesdk/sdk/service/download/k;
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Lcom/huawei/updatesdk/sdk/service/download/c;

.field private b:Landroid/os/Handler;

.field private volatile c:Z

.field private d:Z

.field private e:I

.field private f:I

.field private g:J

.field private h:J

.field private i:Lcom/huawei/updatesdk/sdk/service/download/d;

.field private j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

.field private k:Ljava/lang/Object;

.field private l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/updatesdk/sdk/service/download/g;>;"
        }
    .end annotation
.end field

.field private m:Z

.field private n:Z

.field private o:Z

.field private p:Z

.field private q:Lcom/huawei/updatesdk/sdk/service/download/bean/a;

.field private r:I


# direct methods
.method public constructor <init>(Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;Landroid/os/Handler;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/huawei/updatesdk/sdk/service/download/b;

    invoke-direct {v0}, Lcom/huawei/updatesdk/sdk/service/download/b;-><init>()V

    iput-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->a:Lcom/huawei/updatesdk/sdk/service/download/c;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->c:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->d:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->e:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->f:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->g:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->h:J

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->i:Lcom/huawei/updatesdk/sdk/service/download/d;

    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->k:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->l:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->m:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->n:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->o:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->p:Z

    new-instance v0, Lcom/huawei/updatesdk/sdk/service/download/bean/a;

    invoke-direct {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/a;-><init>()V

    iput-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->q:Lcom/huawei/updatesdk/sdk/service/download/bean/a;

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->r:I

    iput-object p1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->c(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->b:Landroid/os/Handler;

    return-void
.end method

.method private A()V
    .locals 7

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/updatesdk/sdk/service/download/bean/b;

    int-to-long v0, v4

    invoke-virtual {v6}, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->d()J

    move-result-wide v2

    add-long/2addr v0, v2

    long-to-int v4, v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    int-to-long v1, v4

    invoke-virtual {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->b(J)V

    return-void
.end method

.method private B()V
    .locals 6

    iget-object v3, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->k:Ljava/lang/Object;

    monitor-enter v3

    :goto_0
    :try_start_0
    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->q()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    iget-boolean v0, v0, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->p:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    :try_start_1
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->k:Ljava/lang/Object;

    const-wide/16 v1, 0x190

    invoke-virtual {v0, v1, v2}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v4

    const-string v0, "HiAppDownload"

    const-string v1, "task lock interrupted"

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :cond_0
    monitor-exit v3

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v3

    throw v5

    :goto_1
    const-string v0, "HiAppDownload"

    const-string v1, "waitAllDownloadThreadsDone finished"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private a(I)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    const-string v0, "HiAppDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "sendMessage2: interrupted = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    iget-boolean v2, v2, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->p:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", interrupted reason = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    iget v2, v2, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->s:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", state = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", progress = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->q()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->b:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->b:Landroid/os/Handler;

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v1, p1, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_0
    return-void
.end method

.method private a(Ljava/io/File;)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Ljava/io/File;->setReadable(ZZ)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v0, "HiAppDownload"

    const-string v1, "can not set readable to apk"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private a(Z)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/updatesdk/sdk/service/download/d;
        }
    .end annotation

    const-string v0, "HiAppDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "begin doDispatch, useHttps: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  package:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->x()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, p1, v3}, Lcom/huawei/updatesdk/sdk/service/download/f;->a(ZLjava/util/List;)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->q:Lcom/huawei/updatesdk/sdk/service/download/bean/a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/a;->b(J)V

    const/4 v4, 0x0

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    const-string v0, "HiAppDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "do dispatch with one url:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->c(Ljava/lang/String;)V

    const-string v0, "HiAppDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "doDispatch try one url : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->x()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v6}, Lcom/huawei/updatesdk/sdk/service/download/f;->c(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object v0

    move-object v4, v0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    goto :goto_0

    :cond_1
    const/4 v7, 0x0

    :try_start_1
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseCode()I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v7

    goto :goto_1

    :catch_0
    move-exception v8

    const-string v0, "HiAppDownload"

    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "connection.getResponseCode exception: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    goto/16 :goto_0

    :goto_1
    const/4 v0, -0x1

    if-ne v7, v0, :cond_2

    const-string v0, "HiAppDownload"

    const-string v1, " dispatch onece failed: responsecode is -1"

    :try_start_3
    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    goto/16 :goto_0

    :cond_2
    const-string v0, "HiAppDownload"

    :try_start_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "dispatch response code:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0x12e

    if-ne v7, v0, :cond_5

    invoke-direct {p0, v4}, Lcom/huawei/updatesdk/sdk/service/download/f;->a(Ljava/net/HttpURLConnection;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->q:Lcom/huawei/updatesdk/sdk/service/download/bean/a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/a;->c(J)V

    if-nez p1, :cond_3

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->l()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/updatesdk/sdk/service/download/f;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->c(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->o:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v4, :cond_a

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    goto/16 :goto_3

    :cond_3
    const-string v0, "HiAppDownload"

    :try_start_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "doDispatch succeed, package: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->x()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_4
    return-void

    :cond_5
    const/16 v0, 0xc8

    if-ne v7, v0, :cond_7

    :try_start_6
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0, v6}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->c(Ljava/lang/String;)V

    const-string v0, "HiAppDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "doDispatch succeed, no redirect, package: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->x()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", url="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->q:Lcom/huawei/updatesdk/sdk/service/download/bean/a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/a;->c(J)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_6
    return-void

    :cond_7
    if-eqz v4, :cond_9

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    goto :goto_2

    :catchall_0
    move-exception v9

    if-eqz v4, :cond_8

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_8
    throw v9

    :cond_9
    :goto_2
    goto/16 :goto_0

    :cond_a
    :goto_3
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->b(Ljava/util/concurrent/Future;)V

    const-string v0, "HiAppDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "doDispatch failed, package: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->x()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->q:Lcom/huawei/updatesdk/sdk/service/download/bean/a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/a;->c(J)V

    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    const-string v0, "dispatch failed [url = "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    new-instance v0, Lcom/huawei/updatesdk/sdk/service/download/d;

    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x77

    invoke-direct {v0, v2, v1}, Lcom/huawei/updatesdk/sdk/service/download/d;-><init>(ILjava/lang/String;)V

    throw v0
.end method

.method private a(ZLjava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZLjava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    if-nez p1, :cond_2

    invoke-static {}, Lcom/huawei/updatesdk/sdk/service/download/a;->a()Lcom/huawei/updatesdk/sdk/service/download/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/a;->d()Ljava/util/List;

    move-result-object v1

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->m()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->m()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lcom/huawei/updatesdk/sdk/service/download/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3}, Lcom/huawei/updatesdk/sdk/service/download/f;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    goto :goto_0

    :cond_1
    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->m()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/updatesdk/sdk/service/download/f;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->m()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-static {}, Lcom/huawei/updatesdk/sdk/service/download/a;->a()Lcom/huawei/updatesdk/sdk/service/download/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/a;->c()Ljava/lang/String;

    move-result-object v1

    const/4 v0, 0x0

    if-eq v0, v1, :cond_4

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->m()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    :goto_1
    return-void
.end method

.method private a(Ljava/net/HttpURLConnection;)Z
    .locals 5

    const-string v0, "location"

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/huawei/updatesdk/sdk/a/c/f;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "HiAppDownload"

    const-string v1, "location header is blank"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->c(I)V

    new-instance v4, Ljava/net/URL;

    invoke-direct {v4, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    const-string v0, "dispatcher=1"

    invoke-virtual {v3, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {v4}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/updatesdk/sdk/a/c/f;->f(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->c(I)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    goto :goto_0

    :catch_0
    move-exception v4

    const-string v0, "HiAppDownload"

    const-string v1, "doRedirect MalformedURLException happened"

    invoke-static {v0, v1, v4}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return v0

    :goto_0
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0, v3}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->l()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/updatesdk/sdk/service/download/f;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    goto :goto_1

    :cond_2
    const/4 v1, 0x1

    :goto_1
    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->b(I)V

    const-string v0, "HiAppDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " url redirected , dispatcher = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->k()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", protocol = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->j()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", url="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    return v0
.end method

.method private b(Lcom/huawei/updatesdk/sdk/service/download/d;)V
    .locals 3

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->z()V

    invoke-virtual {p1}, Lcom/huawei/updatesdk/sdk/service/download/d;->b()I

    move-result v0

    const/16 v1, 0x68

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/updatesdk/sdk/service/download/d;->b()I

    move-result v0

    const/16 v1, 0x69

    if-ne v0, v1, :cond_1

    :cond_0
    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->x()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->d(I)V

    invoke-virtual {p1}, Lcom/huawei/updatesdk/sdk/service/download/d;->b()I

    move-result v0

    const/16 v1, 0x79

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->d(I)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->a:Lcom/huawei/updatesdk/sdk/service/download/c;

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/c;->a(Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;)Lcom/huawei/updatesdk/sdk/service/download/c$a;

    move-result-object v2

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->a:Lcom/huawei/updatesdk/sdk/service/download/c;

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/service/download/c;->a(Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;Lcom/huawei/updatesdk/sdk/service/download/c$a;)V

    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->o()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_3

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->A()V

    :cond_3
    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->w()V

    return-void
.end method

.method private b(Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/updatesdk/sdk/service/download/d;
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->q:Lcom/huawei/updatesdk/sdk/service/download/bean/a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/a;->a(J)V

    const-string v0, "HiAppDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "doDownloadOnece begin:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->x()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->i:Lcom/huawei/updatesdk/sdk/service/download/d;

    :try_start_0
    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->g()V

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->d()Z

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->l()V

    invoke-direct {p0, p1}, Lcom/huawei/updatesdk/sdk/service/download/f;->a(Z)V

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->o()V

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->u()V

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->y()V

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->B()V

    invoke-virtual {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->c()V

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->A()V

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/updatesdk/sdk/service/download/f;->c(Z)V

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->e()V

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->h()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->d:Z

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->e()Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask$b;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask$b;->b(J)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->e()Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask$b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->p:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->e()Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask$b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask$b;->a(Z)V

    :cond_0
    const-string v0, "HiAppDownload"

    const-string v1, "doDownloadOnece succeed!"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->i:Lcom/huawei/updatesdk/sdk/service/download/d;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->i:Lcom/huawei/updatesdk/sdk/service/download/d;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/d;->b()I

    move-result v0

    const/16 v1, 0x6a

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->i:Lcom/huawei/updatesdk/sdk/service/download/d;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/d;->b()I

    move-result v0

    const/16 v1, 0x7a

    if-ne v0, v1, :cond_3

    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->o:Z

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->i:Lcom/huawei/updatesdk/sdk/service/download/d;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/d;->b()I

    move-result v0

    const/16 v1, 0x7a

    if-ne v0, v1, :cond_3

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->t()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->m:Z

    :cond_3
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->i:Lcom/huawei/updatesdk/sdk/service/download/d;

    throw v0
    :try_end_0
    .catch Lcom/huawei/updatesdk/sdk/service/download/d; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    :cond_4
    :goto_0
    goto/16 :goto_1

    :catch_0
    move-exception v3

    const-string v0, "HiAppDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "doDownloadOnece exception, errorcode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lcom/huawei/updatesdk/sdk/service/download/d;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", errormessag:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lcom/huawei/updatesdk/sdk/service/download/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->d()Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask$a;

    move-result-object v0

    invoke-virtual {v3}, Lcom/huawei/updatesdk/sdk/service/download/d;->b()I

    move-result v1

    iput v1, v0, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask$a;->a:I

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->d()Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask$a;

    move-result-object v0

    invoke-virtual {v3}, Lcom/huawei/updatesdk/sdk/service/download/d;->a()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask$a;->b:Ljava/lang/String;

    invoke-direct {p0, v3}, Lcom/huawei/updatesdk/sdk/service/download/f;->c(Lcom/huawei/updatesdk/sdk/service/download/d;)Z

    move-result v0

    if-eqz v0, :cond_5

    throw v3

    :cond_5
    goto :goto_1

    :catch_1
    move-exception v3

    const-string v0, "HiAppDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "doDownloadOnece exception,  errormessag:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->d()Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask$a;

    move-result-object v0

    const/16 v1, 0x6f

    iput v1, v0, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask$a;->a:I

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->d()Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask$a;

    move-result-object v0

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask$a;->b:Ljava/lang/String;

    :goto_1
    return-void
.end method

.method static b(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "https"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private c(Ljava/lang/String;)Ljava/net/HttpURLConnection;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/updatesdk/sdk/service/download/d;
        }
    .end annotation

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    :cond_0
    invoke-virtual {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->c()V

    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-lez v0, :cond_1

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->l()V

    invoke-virtual {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->c()V

    const-string v0, "HiAppDownload"

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "doDispatchByOneUrl will try again after timeout:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v8

    const-string v0, "HiAppDownload"

    const-string v1, "sleep interrupted!"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    const-wide/16 v4, 0x0

    :cond_1
    invoke-virtual {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->c()V

    :try_start_1
    invoke-static {}, Lcom/huawei/updatesdk/sdk/service/download/h;->a()Lcom/huawei/updatesdk/sdk/service/download/h;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/huawei/updatesdk/sdk/service/download/h;->a(Ljava/lang/String;Z)Ljava/net/HttpURLConnection;

    move-result-object v7

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    const/4 v1, 0x1

    invoke-static {v0, v7, v1}, Lcom/huawei/updatesdk/sdk/service/download/h;->a(Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;Ljava/net/HttpURLConnection;Z)Lcom/huawei/updatesdk/sdk/service/download/h$a;

    move-result-object v8

    invoke-virtual {v8}, Lcom/huawei/updatesdk/sdk/service/download/h$a;->a()Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    if-eqz v0, :cond_2

    return-object v7

    :cond_2
    :try_start_2
    invoke-virtual {v8}, Lcom/huawei/updatesdk/sdk/service/download/h$a;->b()Ljava/lang/Exception;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object v9

    const/4 v0, 0x0

    if-ne v0, v9, :cond_3

    goto :goto_3

    :cond_3
    instance-of v0, v9, Ljava/net/SocketTimeoutException;

    if-eqz v0, :cond_4

    add-int/lit8 v6, v6, 0x1

    int-to-long v0, v6

    const-wide/16 v2, 0x7d0

    mul-long v4, v2, v0

    goto :goto_1

    :cond_4
    goto :goto_3

    :goto_1
    goto :goto_2

    :catch_1
    move-exception v8

    const-string v0, "HiAppDownload"

    const-string v1, "openConnection"

    invoke-static {v0, v1, v8}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return-object v0

    :goto_2
    const/4 v0, 0x3

    if-lt v6, v0, :cond_0

    :goto_3
    const/4 v0, 0x0

    return-object v0
.end method

.method private c(Z)V
    .locals 14

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->s()J

    move-result-wide v6

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x5dc

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/updatesdk/sdk/service/download/bean/b;

    invoke-virtual {v13}, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->d()J

    move-result-wide v0

    add-long/2addr v8, v0

    goto :goto_0

    :cond_0
    long-to-double v0, v8

    long-to-double v2, v6

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    double-to-int v10, v0

    iget v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->e:I

    sub-int v0, v10, v0

    const/4 v1, 0x5

    if-ge v0, v1, :cond_1

    const/16 v11, 0x320

    :cond_1
    iget v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->f:I

    sub-int v0, v10, v0

    if-lez v0, :cond_3

    iget-wide v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->g:J

    sub-long v0, v4, v0

    int-to-long v2, v11

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    iget v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->f:I

    sub-int v0, v10, v0

    const/16 v1, 0xa

    if-ge v0, v1, :cond_2

    if-eqz p1, :cond_3

    :cond_2
    iget-wide v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->g:J

    sub-long v0, v4, v0

    long-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double v12, v0, v2

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    iget-wide v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->h:J

    sub-long v1, v8, v1

    long-to-double v1, v1

    div-double/2addr v1, v12

    double-to-int v1, v1

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->g(I)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0, v10}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->f(I)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0, v8, v9}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->b(J)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->d(I)V

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->w()V

    iput-wide v4, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->g:J

    iput-wide v8, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->h:J

    iput v10, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->f:I

    :cond_3
    return-void
.end method

.method private c(Lcom/huawei/updatesdk/sdk/service/download/d;)Z
    .locals 2

    invoke-virtual {p1}, Lcom/huawei/updatesdk/sdk/service/download/d;->b()I

    move-result v1

    const/16 v0, 0x64

    if-eq v1, v0, :cond_0

    const/16 v0, 0x66

    if-eq v1, v0, :cond_0

    const/16 v0, 0x68

    if-eq v1, v0, :cond_0

    const/16 v0, 0x69

    if-eq v1, v0, :cond_0

    const/16 v0, 0x79

    if-eq v1, v0, :cond_0

    const/16 v0, 0x75

    if-ne v1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private d()Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/updatesdk/sdk/service/download/d;
        }
    .end annotation

    const-string v0, "HiAppDownload"

    const-string v1, "begin checkLocalBeforeDownload"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->a:Lcom/huawei/updatesdk/sdk/service/download/c;

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/c;->a(Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;)Lcom/huawei/updatesdk/sdk/service/download/c$a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/updatesdk/sdk/service/download/c$a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "HiAppDownload"

    const-string v1, "space not enough"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/huawei/updatesdk/sdk/service/download/d;

    const-string v1, "space not enough"

    const/16 v2, 0x79

    invoke-direct {v0, v2, v1}, Lcom/huawei/updatesdk/sdk/service/download/d;-><init>(ILjava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {v3}, Lcom/huawei/updatesdk/sdk/service/download/c$a;->c()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/updatesdk/sdk/service/download/f;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "HiAppDownload"

    const-string v1, "prepare file failed"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/huawei/updatesdk/sdk/service/download/d;

    const-string v1, "prepare file failed"

    const/16 v2, 0x66

    invoke-direct {v0, v2, v1}, Lcom/huawei/updatesdk/sdk/service/download/d;-><init>(ILjava/lang/String;)V

    throw v0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private d(Ljava/lang/String;)Z
    .locals 7

    new-instance v3, Ljava/io/File;

    const-string v0, "tmp"

    invoke-direct {v3, p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->u()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/updatesdk/sdk/a/c/f;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v4, Ljava/io/File;

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->u()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->v()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_3
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->G()Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".vcdiff"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".apk"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    :goto_0
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v3, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "HiAppDownload"

    const-string v1, "file delete failed!"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_5
    :try_start_0
    invoke-virtual {v4}, Ljava/io/File;->createNewFile()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->h(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->b(J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :cond_6
    const-string v0, "HiAppDownload"

    const-string v1, "creat new file failed!"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v6

    const/4 v4, 0x0

    const-string v0, "HiAppDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "create "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->u()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", failed!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v6}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method private e()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/updatesdk/sdk/service/download/d;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->c()V

    const-string v0, "HiAppDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "begin checkDownloadedFile :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->x()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v4, 0x0

    const-string v5, ""

    const/16 v6, 0x76

    const/4 v7, 0x0

    :try_start_0
    new-instance v0, Lcom/huawei/updatesdk/sdk/service/download/i;

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->u()Ljava/lang/String;

    move-result-object v1

    const-string v2, "r"

    invoke-direct {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/service/download/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v4, v0

    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->s()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[package="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->x()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", fileSize= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", storeSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->s()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->l()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/updatesdk/sdk/a/c/f;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "null"

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->l()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "checkDownloadedFile error: file length wrong "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v5, v0

    goto :goto_2

    :cond_1
    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->f()Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[package="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->x()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->l()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/updatesdk/sdk/a/c/f;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "null"

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->l()Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "checkDownloadedFile error : file hash error "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v5, v0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->o:Z

    goto :goto_2

    :cond_3
    const-string v0, "HiAppDownload"

    const-string v1, "checkDownloadedFile succeed"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v7, 0x1

    :goto_2
    invoke-static {v4}, Lcom/huawei/updatesdk/sdk/a/c/c;->a(Ljava/io/Closeable;)V

    goto :goto_3

    :catch_0
    move-exception v8

    const-string v0, "HiAppDownload"

    const-string v1, "checkDownloadedFile IOException:"

    :try_start_1
    invoke-static {v0, v1, v8}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/16 v6, 0x7b

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v5

    invoke-static {v4}, Lcom/huawei/updatesdk/sdk/a/c/c;->a(Ljava/io/Closeable;)V

    goto :goto_3

    :catch_1
    move-exception v8

    const-string v0, "HiAppDownload"

    const-string v1, "checkDownloadedFile IllegalArgumentException:"

    :try_start_2
    invoke-static {v0, v1, v8}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {v4}, Lcom/huawei/updatesdk/sdk/a/c/c;->a(Ljava/io/Closeable;)V

    goto :goto_3

    :catchall_0
    move-exception v9

    invoke-static {v4}, Lcom/huawei/updatesdk/sdk/a/c/c;->a(Ljava/io/Closeable;)V

    throw v9

    :goto_3
    if-nez v7, :cond_4

    const-string v0, "HiAppDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "end checkDownloadedFile failed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->t()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->m:Z

    new-instance v0, Lcom/huawei/updatesdk/sdk/service/download/d;

    invoke-direct {v0, v6, v5}, Lcom/huawei/updatesdk/sdk/service/download/d;-><init>(ILjava/lang/String;)V

    throw v0

    :cond_4
    return-void
.end method

.method private f()Z
    .locals 3

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->n()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/huawei/updatesdk/sdk/a/c/f;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->u()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SHA-256"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/c/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "HiAppDownload"

    const-string v1, "file sha256 check failed"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_0
    const-string v0, "HiAppDownload"

    const-string v1, "file sha256 check succeed"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string v0, "HiAppDownload"

    const-string v1, "checkDownloadedFile warning: file sha256 is null"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method private g()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/updatesdk/sdk/service/download/d;
        }
    .end annotation

    const-string v4, ""

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->m()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/updatesdk/sdk/a/c/f;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v4, "dispatchUrl is null"

    const-string v0, "HiAppDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "before download, check task failed:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/huawei/updatesdk/sdk/service/download/d;

    const/16 v1, 0x64

    invoke-direct {v0, v1, v4}, Lcom/huawei/updatesdk/sdk/service/download/d;-><init>(ILjava/lang/String;)V

    throw v0

    :cond_0
    :try_start_0
    new-instance v0, Ljava/net/URL;

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->m()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "url is wrong : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v0, "HiAppDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "before download, check task failed:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/huawei/updatesdk/sdk/service/download/d;

    const/16 v1, 0x64

    invoke-direct {v0, v1, v4}, Lcom/huawei/updatesdk/sdk/service/download/d;-><init>(ILjava/lang/String;)V

    throw v0

    :goto_0
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->s()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_1

    const-string v4, "fileSize is wrong "

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[fileSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->s()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", backupFileSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->i()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "diffSha256 is null? ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->E()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/updatesdk/sdk/a/c/f;->a(Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", alreadyDownloadSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->t()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", roundCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->r:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v0, "HiAppDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "before download, check task failed:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/huawei/updatesdk/sdk/service/download/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x64

    invoke-direct {v0, v2, v1}, Lcom/huawei/updatesdk/sdk/service/download/d;-><init>(ILjava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method private h()V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/updatesdk/sdk/service/download/d;
        }
    .end annotation

    const-string v0, "HiAppDownload"

    const-string v1, "begin processDownloadedTempFile"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0x6f

    const-string v4, "processDownloadedTempFile failed"

    const/4 v5, 0x0

    new-instance v6, Ljava/io/File;

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->u()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/huawei/updatesdk/sdk/service/download/f;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->v()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v8, Ljava/io/File;

    invoke-direct {v8, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v8}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    invoke-direct {p0, v6}, Lcom/huawei/updatesdk/sdk/service/download/f;->a(Ljava/io/File;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0, v8}, Lcom/huawei/updatesdk/sdk/service/download/f;->a(Ljava/io/File;)V

    :goto_0
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0, v7}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->h(Ljava/lang/String;)V

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const-string v0, "HiAppDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Downloaded file not exist:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->x()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0x78

    const-string v4, "Downloaded file not exist when process file "

    :goto_1
    const-string v0, "HiAppDownload"

    const-string v1, "end processDownloadedTempFile"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v5, :cond_2

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->t()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->m:Z

    new-instance v0, Lcom/huawei/updatesdk/sdk/service/download/d;

    invoke-direct {v0, v3, v4}, Lcom/huawei/updatesdk/sdk/service/download/d;-><init>(ILjava/lang/String;)V

    throw v0

    :cond_2
    return-void
.end method

.method private i()V
    .locals 3

    iget-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->m:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->z()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->B()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->A()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const-string v0, "HiAppDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "notifyReDownloadInHttpsStarted, package :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->x()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0xa

    invoke-direct {p0, v0}, Lcom/huawei/updatesdk/sdk/service/download/f;->a(I)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->m:Z

    :cond_1
    return-void
.end method

.method private j()Z
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/updatesdk/sdk/service/download/d;
        }
    .end annotation

    const/16 v0, 0x9

    invoke-direct {p0, v0}, Lcom/huawei/updatesdk/sdk/service/download/f;->a(I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const-wide/16 v4, 0x1388

    add-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    const-wide/16 v0, 0x64

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v7

    const-string v0, "HiAppDownload"

    const-string v1, "isRestartInHttpsConfirmed interrupted"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->c()V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->B()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->A()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->d(Z)V

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private k()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->G()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/updatesdk/sdk/a/c/f;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/huawei/updatesdk/sdk/service/download/a;->a()Lcom/huawei/updatesdk/sdk/service/download/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/a;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/huawei/updatesdk/sdk/service/download/a;->a()Lcom/huawei/updatesdk/sdk/service/download/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/download/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0, v3}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->g(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->i()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->a(J)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->k(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->a:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method private l()V
    .locals 4

    invoke-static {}, Lcom/huawei/updatesdk/sdk/service/a/a;->a()Lcom/huawei/updatesdk/sdk/service/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/a/a;->b()Landroid/content/Context;

    move-result-object v3

    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    invoke-static {v3}, Lcom/huawei/updatesdk/sdk/a/c/c/b;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "HiAppDownload"

    const-string v1, "download interrupted as no active network"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    const/4 v1, 0x1

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->a(ZI)V

    :cond_0
    return-void
.end method

.method private m()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/updatesdk/sdk/service/download/d;
        }
    .end annotation

    const-string v0, "HiAppDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "begin downloadrunnable download ,package:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->x()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->d:Z

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->d(I)V

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->w()V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->m()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/updatesdk/sdk/service/download/f;->b(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->z()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/huawei/updatesdk/sdk/service/download/e;->a()Lcom/huawei/updatesdk/sdk/service/download/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/e;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v3, 0x1

    :cond_0
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->D()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v3, 0x1

    :cond_1
    if-eqz v3, :cond_2

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->k()V

    :cond_2
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->r:I

    invoke-direct {p0, v3}, Lcom/huawei/updatesdk/sdk/service/download/f;->b(Z)V

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->n()V

    iget-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->o:Z

    if-eqz v0, :cond_3

    const-string v0, "HiAppDownload"

    const-string v1, "possibly hijacked !"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/updatesdk/sdk/service/download/e;->a()Lcom/huawei/updatesdk/sdk/service/download/e;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/e;->a(Z)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->o:Z

    :cond_3
    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->l()V

    iget-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->d:Z

    if-nez v0, :cond_8

    invoke-virtual {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->c()V

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->r()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->G()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/updatesdk/sdk/a/c/f;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    return-void

    :cond_4
    iget-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->m:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->q()I

    move-result v0

    if-lez v0, :cond_5

    const/4 v0, 0x1

    goto :goto_0

    :cond_5
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->m:Z

    iget-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->m:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->z()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->j()Z

    move-result v0

    if-nez v0, :cond_6

    return-void

    :cond_6
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->G()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->c()V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/huawei/updatesdk/sdk/service/download/a;->a()Lcom/huawei/updatesdk/sdk/service/download/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/download/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0, v4}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0, v4}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->g(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->i()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->a(J)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->k(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->a:Ljava/lang/String;

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->t()V

    goto :goto_1

    :cond_7
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->r()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/huawei/updatesdk/sdk/service/download/a;->a()Lcom/huawei/updatesdk/sdk/service/download/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/download/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->c()V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0, v4}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0, v4}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->g(Ljava/lang/String;)V

    :goto_1
    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->i()V

    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->r:I

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/updatesdk/sdk/service/download/f;->b(Z)V

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->n()V

    :cond_8
    return-void
.end method

.method private n()V
    .locals 8

    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    const-string v0, "profileData: package = "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->x()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ",roundCount = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->r:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ",timeFromSubmitToDownload = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->q:Lcom/huawei/updatesdk/sdk/service/download/bean/a;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/a;->a()J

    move-result-wide v1

    iget-object v3, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v3}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->C()J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ", dispatchTime = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->q:Lcom/huawei/updatesdk/sdk/service/download/bean/a;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/a;->c()J

    move-result-wide v1

    iget-object v3, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->q:Lcom/huawei/updatesdk/sdk/service/download/bean/a;

    invoke-virtual {v3}, Lcom/huawei/updatesdk/sdk/service/download/bean/a;->b()J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/updatesdk/sdk/service/download/g;

    const-string v0, ", timeFromThreadSubmit = "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/updatesdk/sdk/service/download/g;->d()J

    move-result-wide v1

    iget-object v3, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->q:Lcom/huawei/updatesdk/sdk/service/download/bean/a;

    invoke-virtual {v3}, Lcom/huawei/updatesdk/sdk/service/download/bean/a;->d()J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ", threadCostTime = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/updatesdk/sdk/service/download/g;->e()J

    move-result-wide v1

    invoke-virtual {v7}, Lcom/huawei/updatesdk/sdk/service/download/g;->d()J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    goto :goto_0

    :cond_0
    const-string v0, "HiAppDownload"

    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private o()V
    .locals 19
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/updatesdk/sdk/service/download/d;
        }
    .end annotation

    const-string v0, "HiAppDownload"

    const-string v1, "begin initDownloadThreadInfo"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->c()V

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->s()J

    move-result-wide v8

    const/4 v10, 0x2

    const-wide/32 v0, 0x200000

    cmp-long v0, v8, v0

    if-gez v0, :cond_0

    const/4 v10, 0x1

    :cond_0
    const/4 v11, 0x0

    :goto_0
    if-ge v11, v10, :cond_2

    int-to-long v0, v10

    div-long v12, v8, v0

    int-to-long v0, v11

    mul-long v14, v12, v0

    add-int/lit8 v0, v10, -0x1

    if-ne v11, v0, :cond_1

    const-wide/16 v0, 0x1

    sub-long v16, v8, v0

    goto :goto_1

    :cond_1
    add-long v0, v14, v12

    const-wide/16 v2, 0x1

    sub-long v16, v0, v2

    :goto_1
    new-instance v0, Lcom/huawei/updatesdk/sdk/service/download/bean/b;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->p()I

    move-result v1

    invoke-static {}, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->a()I

    move-result v2

    move-wide v3, v14

    move-wide/from16 v5, v16

    invoke-direct/range {v0 .. v6}, Lcom/huawei/updatesdk/sdk/service/download/bean/b;-><init>(IIJJ)V

    move-object/from16 v18, v0

    move-object/from16 v0, v18

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v7}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method private p()Z
    .locals 3

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/updatesdk/sdk/service/download/g;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/download/g;->a()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private q()Z
    .locals 3

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/updatesdk/sdk/service/download/g;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/download/g;->b()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private r()Z
    .locals 2

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->l()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->l()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->l()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/updatesdk/sdk/service/download/f;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lcom/huawei/updatesdk/sdk/service/download/a;->a()Lcom/huawei/updatesdk/sdk/service/download/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/a;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private s()V
    .locals 3

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->k:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->k:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    :goto_0
    return-void
.end method

.method private t()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->y()V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->b(J)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->f(I)V

    return-void
.end method

.method private u()V
    .locals 8

    const-wide/16 v4, 0x0

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/updatesdk/sdk/service/download/bean/b;

    invoke-virtual {v7}, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->d()J

    move-result-wide v0

    add-long/2addr v4, v0

    goto :goto_0

    :cond_0
    long-to-double v0, v4

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->s()J

    move-result-wide v2

    long-to-double v2, v2

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    double-to-int v6, v0

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0, v6}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->f(I)V

    iput v6, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->f:I

    iput v6, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->e:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->g:J

    iput-wide v4, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->h:J

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->d()Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask$a;

    move-result-object v0

    const/4 v1, 0x0

    iput v1, v0, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask$a;->a:I

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->d()Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask$a;

    move-result-object v0

    const-string v1, ""

    iput-object v1, v0, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask$a;->b:Ljava/lang/String;

    return-void
.end method

.method private v()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->o()I

    move-result v0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->o()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->y()V

    :cond_1
    return-void
.end method

.method private w()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    const-string v0, "HiAppDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "sendMessage: interrupted = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    iget-boolean v2, v2, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->p:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", interrupted reason = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    iget v2, v2, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->s:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", status = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->o()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", progress = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->q()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->b:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->b:Landroid/os/Handler;

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->o()I

    move-result v2

    iget-object v3, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_0
    return-void
.end method

.method private x()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->g()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->d(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->g()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->g()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->d(I)V

    :cond_2
    :goto_0
    return-void
.end method

.method private y()V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/updatesdk/sdk/service/download/d;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->c()V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-static {}, Lcom/huawei/updatesdk/sdk/service/a/a;->a()Lcom/huawei/updatesdk/sdk/service/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/a/a;->c()Landroid/net/ConnectivityManager;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v5

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0, v5}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->a(Landroid/net/NetworkInfo;)V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->p:Z

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/updatesdk/sdk/service/download/bean/b;

    invoke-virtual {v6}, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->b()J

    move-result-wide v0

    invoke-virtual {v6}, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->d()J

    move-result-wide v2

    add-long/2addr v0, v2

    invoke-virtual {v6}, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->c()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    const-string v0, "HiAppDownload"

    const-string v1, "one thread already download finished before, ingnore"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    new-instance v7, Lcom/huawei/updatesdk/sdk/service/download/g;

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-direct {v7, v0, v6, p0}, Lcom/huawei/updatesdk/sdk/service/download/g;-><init>(Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;Lcom/huawei/updatesdk/sdk/service/download/bean/b;Lcom/huawei/updatesdk/sdk/service/download/k;)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->l:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lcom/huawei/updatesdk/sdk/service/download/e;->a()Lcom/huawei/updatesdk/sdk/service/download/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/e;->c()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-interface {v0, v7}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/huawei/updatesdk/sdk/service/download/g;->a(Ljava/util/concurrent/Future;)V

    const-string v0, "HiAppDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "summit thread task, start="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->b()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " end="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->c()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " finished="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->d()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    iget-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->p:Z

    if-eqz v0, :cond_2

    invoke-virtual {v6}, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->d()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    iput-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->p:Z

    goto/16 :goto_0

    :cond_3
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->q:Lcom/huawei/updatesdk/sdk/service/download/bean/a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/a;->d(J)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->e()Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask$b;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask$b;->a(J)V

    return-void
.end method

.method private z()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/updatesdk/sdk/service/download/g;

    invoke-virtual {v3}, Lcom/huawei/updatesdk/sdk/service/download/g;->c()V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->w()Ljava/util/concurrent/Future;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->w()Ljava/util/concurrent/Future;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_0
    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    if-nez p1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    move-object v2, p1

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "tmp"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_2
    :goto_0
    return-object v2
.end method

.method public a()V
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->n:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->s()V

    return-void
.end method

.method public a(Lcom/huawei/updatesdk/sdk/service/download/c;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->a:Lcom/huawei/updatesdk/sdk/service/download/c;

    return-void
.end method

.method public a(Lcom/huawei/updatesdk/sdk/service/download/d;)V
    .locals 3

    iget-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->n:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "HiAppDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "one thread downloadFailed : errorcode "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/updatesdk/sdk/service/download/d;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  errormessage: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/updatesdk/sdk/service/download/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->i:Lcom/huawei/updatesdk/sdk/service/download/d;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    iput-object p1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->i:Lcom/huawei/updatesdk/sdk/service/download/d;

    :cond_1
    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->z()V

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->s()V

    return-void
.end method

.method public b()V
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->n:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/updatesdk/sdk/service/download/f;->c(Z)V

    return-void
.end method

.method protected c()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/updatesdk/sdk/service/download/d;
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    iget-boolean v0, v0, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->p:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->c:Z

    :cond_0
    iget-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->c:Z

    if-nez v0, :cond_2

    const-string v0, "HiAppDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "throwIfInterrupt reason : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->g()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, -0x1

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->g()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    const/16 v3, 0x68

    goto :goto_0

    :cond_1
    const/16 v3, 0x69

    :goto_0
    new-instance v0, Lcom/huawei/updatesdk/sdk/service/download/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "download interrputed : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->g()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v3, v1}, Lcom/huawei/updatesdk/sdk/service/download/d;-><init>(ILjava/lang/String;)V

    throw v0

    :cond_2
    return-void
.end method

.method public run()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;
    :try_end_0
    .catch Lcom/huawei/updatesdk/sdk/service/download/d; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    return-void

    :cond_0
    :try_start_1
    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->m()V

    iget-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->d:Z

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->c()V

    const-string v0, "HiAppDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "quit downloadrunnalbe, result : failed, err:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->d()Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask$a;

    move-result-object v2

    iget-object v2, v2, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask$a;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",  package:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->x()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->d(I)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->d()Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask$a;

    move-result-object v0

    iget v3, v0, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask$a;->a:I

    const/16 v0, 0x71

    if-eq v3, v0, :cond_1

    const/16 v0, 0x70

    if-eq v3, v0, :cond_1

    const/16 v0, 0x77

    if-ne v3, v0, :cond_3

    :cond_1
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->e(Z)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    const/4 v1, 0x1

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->a(ZI)V

    const/16 v0, 0x77

    if-ne v3, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->a(ZI)V

    :cond_2
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->d(I)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->o()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_3

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->A()V

    :cond_3
    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->w()V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->a:Lcom/huawei/updatesdk/sdk/service/download/c;

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->u()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/service/download/c;->a(Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->d(I)V

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->w()V

    const-string v0, "HiAppDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "quit downloadrunnalbe, result : succeed ,  package:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->x()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Lcom/huawei/updatesdk/sdk/service/download/d; {:try_start_1 .. :try_end_1} :catch_0

    :goto_0
    goto :goto_1

    :catch_0
    move-exception v3

    invoke-direct {p0, v3}, Lcom/huawei/updatesdk/sdk/service/download/f;->b(Lcom/huawei/updatesdk/sdk/service/download/d;)V

    const-string v0, "HiAppDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "quit downloadrunnalbe, result : failed, errorcode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lcom/huawei/updatesdk/sdk/service/download/d;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", error message: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lcom/huawei/updatesdk/sdk/service/download/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",  package:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->j:Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->x()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/f;->v()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/download/f;->n:Z

    return-void
.end method
