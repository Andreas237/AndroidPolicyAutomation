.class public Lo/dqb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Z

.field private b:Landroid/content/Context;

.field private c:Landroid/os/Handler;

.field private final d:Ljava/lang/String;

.field private e:Ljava/lang/Boolean;

.field private g:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/Boolean;ZZ)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    const-string v0, "DownloadService"

    iput-object v0, p0, Lo/dqb;->d:Ljava/lang/String;

    .line 28
    iput-object p1, p0, Lo/dqb;->b:Landroid/content/Context;

    .line 29
    iput-object p2, p0, Lo/dqb;->c:Landroid/os/Handler;

    .line 30
    iput-object p3, p0, Lo/dqb;->e:Ljava/lang/Boolean;

    .line 31
    iput-boolean p4, p0, Lo/dqb;->g:Z

    .line 32
    iput-boolean p5, p0, Lo/dqb;->a:Z

    .line 33
    return-void
.end method

.method private a(Ljava/lang/Boolean;)Lo/doy;
    .locals 1

    .line 204
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 205
    invoke-static {}, Lo/dpm;->m()Lo/doy;

    move-result-object v0

    return-object v0

    .line 207
    :cond_0
    iget-boolean v0, p0, Lo/dqb;->g:Z

    if-eqz v0, :cond_1

    .line 208
    invoke-static {}, Lo/dpm;->p()Lo/doy;

    move-result-object v0

    return-object v0

    .line 209
    :cond_1
    iget-boolean v0, p0, Lo/dqb;->a:Z

    if-eqz v0, :cond_2

    .line 210
    invoke-static {}, Lo/dpm;->n()Lo/doy;

    move-result-object v0

    return-object v0

    .line 212
    :cond_2
    invoke-static {}, Lo/dpm;->l()Lo/doy;

    move-result-object v0

    return-object v0
.end method

.method private a()V
    .locals 5

    .line 117
    const-wide/16 v0, 0x7d0

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 120
    goto :goto_0

    .line 118
    :catch_0
    move-exception v4

    .line 119
    const-string v0, "DownloadService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    :goto_0
    invoke-static {}, Lo/dpm;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 122
    const-string v0, "DownloadService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "2s\u5185\u5e95\u5c42\u4e0b\u8f7d\u7ebf\u7a0b\u672a\u505c\u6389 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    const-wide/16 v0, 0xbb8

    :try_start_1
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 129
    goto :goto_1

    .line 127
    :catch_1
    move-exception v4

    .line 128
    const-string v0, "DownloadService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    :cond_0
    :goto_1
    invoke-static {}, Lo/dpm;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 132
    const-string v0, "DownloadService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "5s\u5185\u5e95\u5c42\u4e0b\u8f7d\u7ebf\u7a0b\u672a\u505c\u6389 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    const-wide/16 v0, 0x1388

    :try_start_2
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_2

    .line 139
    goto :goto_2

    .line 137
    :catch_2
    move-exception v4

    .line 138
    const-string v0, "DownloadService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    :cond_1
    :goto_2
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dqf;->b(Z)V

    .line 142
    const-string v0, "DownloadService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DownloadService set cancel download flag"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    return-void
.end method

.method private b()V
    .locals 5

    .line 103
    const-string v0, "DownloadService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DonwloadService NetworkAvailable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    const-wide/16 v0, 0x1f4

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 110
    goto :goto_0

    .line 108
    :catch_0
    move-exception v4

    .line 109
    const-string v0, "DownloadService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    :goto_0
    return-void
.end method

.method private c()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 182
    iget-object v0, p0, Lo/dqb;->e:Ljava/lang/Boolean;

    invoke-direct {p0, v0}, Lo/dqb;->a(Ljava/lang/Boolean;)Lo/doy;

    move-result-object v0

    iget-object v4, v0, Lo/doy;->h:Ljava/lang/String;

    .line 183
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 184
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v5

    .line 185
    iget-object v0, p0, Lo/dqb;->e:Ljava/lang/Boolean;

    invoke-direct {p0, v0}, Lo/dqb;->a(Ljava/lang/Boolean;)Lo/doy;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "download"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/doy;->A:Ljava/lang/String;

    .line 186
    goto :goto_0

    .line 187
    :cond_0
    iget-object v0, p0, Lo/dqb;->e:Ljava/lang/Boolean;

    invoke-direct {p0, v0}, Lo/dqb;->a(Ljava/lang/Boolean;)Lo/doy;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lo/dqb;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/doy;->A:Ljava/lang/String;

    .line 189
    :goto_0
    const-string v0, "DownloadService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "apk storage path="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dqb;->e:Ljava/lang/Boolean;

    invoke-direct {p0, v3}, Lo/dqb;->a(Ljava/lang/Boolean;)Lo/doy;

    move-result-object v3

    iget-object v3, v3, Lo/doy;->A:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; mContext.getFilesDir() + File.separator ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dqb;->b:Landroid/content/Context;

    .line 190
    invoke-virtual {v3}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 189
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    iget-object v0, p0, Lo/dqb;->e:Ljava/lang/Boolean;

    invoke-direct {p0, v0}, Lo/dqb;->a(Ljava/lang/Boolean;)Lo/doy;

    move-result-object v0

    iget-object v0, v0, Lo/doy;->A:Ljava/lang/String;

    invoke-static {v0}, Lo/dpm;->k(Ljava/lang/String;)Z

    .line 192
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dpm;->a(I)V

    .line 193
    return-void
.end method

.method private c(Ljava/lang/Object;I)V
    .locals 2

    .line 196
    iget-object v0, p0, Lo/dqb;->c:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 197
    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    .line 198
    iput-object p1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 199
    iput p2, v1, Landroid/os/Message;->what:I

    .line 200
    iget-object v0, p0, Lo/dqb;->c:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 202
    :cond_0
    return-void
.end method

.method private d()V
    .locals 9

    .line 57
    :goto_0
    invoke-static {}, Lo/dpm;->f()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 58
    const-string v0, "DownloadService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DownloadService DOWNLOADING_STATE_END"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    goto/16 :goto_2

    .line 62
    :cond_0
    invoke-static {}, Lo/dpm;->f()I

    move-result v0

    if-nez v0, :cond_1

    .line 64
    const-string v0, "DownloadService"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DOWNLOADING_STATE_START"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    const-wide/16 v0, 0x7d0

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    goto :goto_0

    .line 66
    :catch_0
    move-exception v6

    .line 67
    const-string v0, "DownloadService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "InterruptedException e:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    goto :goto_0

    .line 72
    :cond_1
    invoke-static {}, Lo/dpm;->f()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 73
    invoke-direct {p0}, Lo/dqb;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 74
    goto/16 :goto_2

    .line 77
    :cond_2
    iget-object v0, p0, Lo/dqb;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dpm;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 78
    invoke-direct {p0}, Lo/dqb;->b()V

    .line 79
    const-class v6, Lo/dqb;

    monitor-enter v6

    .line 80
    :try_start_1
    invoke-static {}, Lo/dpm;->k()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 81
    const-string v0, "DownloadService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DonwloadService downloadThread already running,do not start new download"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    monitor-exit v6

    goto/16 :goto_0

    .line 84
    :cond_3
    :try_start_2
    invoke-static {}, Lo/dpm;->f()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 85
    const-string v0, "DownloadService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DownloadService DOWNLOADING_STATE_END"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 86
    monitor-exit v6

    goto :goto_2

    .line 88
    :cond_4
    const-string v0, "DownloadService"

    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DonwloadService start downloadThread"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dpm;->d(I)V

    .line 90
    new-instance v0, Lo/dqf;

    iget-object v1, p0, Lo/dqb;->b:Landroid/content/Context;

    iget-object v2, p0, Lo/dqb;->c:Landroid/os/Handler;

    iget-object v3, p0, Lo/dqb;->e:Ljava/lang/Boolean;

    iget-boolean v4, p0, Lo/dqb;->g:Z

    iget-boolean v5, p0, Lo/dqb;->a:Z

    invoke-direct/range {v0 .. v5}, Lo/dqf;-><init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/Boolean;ZZ)V

    move-object v7, v0

    .line 91
    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, v7}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 92
    const/4 v0, 0x1

    invoke-static {v0}, Lo/dpm;->a(Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 94
    monitor-exit v6

    goto :goto_1

    :catchall_0
    move-exception v8

    monitor-exit v6

    throw v8

    :goto_1
    goto/16 :goto_0

    .line 96
    :cond_5
    const/4 v0, 0x3

    invoke-static {v0}, Lo/dpm;->d(I)V

    goto/16 :goto_0

    .line 99
    :goto_2
    return-void
.end method

.method private e()Z
    .locals 7

    .line 146
    invoke-static {}, Lo/dpm;->g()I

    move-result v4

    .line 147
    const-string v0, "DownloadService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "retryNum is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    iget-object v0, p0, Lo/dqb;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->m(Landroid/content/Context;)Z

    move-result v5

    .line 150
    const-string v0, "DownloadService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isTypeMobile is :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    if-eqz v5, :cond_0

    .line 152
    const/4 v0, 0x0

    const/16 v1, 0xb

    invoke-direct {p0, v0, v1}, Lo/dqb;->c(Ljava/lang/Object;I)V

    .line 153
    const/4 v0, -0x1

    invoke-static {v0}, Lo/dpm;->d(I)V

    .line 154
    const/4 v0, 0x1

    return v0

    .line 156
    :cond_0
    const/4 v0, 0x3

    if-ge v4, v0, :cond_2

    .line 158
    const-string v0, "DownloadService"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DOWNLOADING_STATE_RETRY, retry in 10S,current retryNum is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    const-wide/16 v0, 0x1388

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 160
    iget-object v0, p0, Lo/dqb;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->m(Landroid/content/Context;)Z

    move-result v5

    .line 161
    const-string v0, "DownloadService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isTypeMobile is :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    if-eqz v5, :cond_1

    .line 163
    const/4 v0, 0x0

    const/16 v1, 0xb

    invoke-direct {p0, v0, v1}, Lo/dqb;->c(Ljava/lang/Object;I)V

    .line 164
    const/4 v0, -0x1

    invoke-static {v0}, Lo/dpm;->d(I)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 165
    const/4 v0, 0x1

    return v0

    .line 167
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 168
    :try_start_1
    invoke-static {v4}, Lo/dpm;->a(I)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 171
    goto :goto_0

    .line 169
    :catch_0
    move-exception v6

    .line 170
    const-string v0, "DownloadService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "InterruptedException e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    goto :goto_0

    .line 173
    :cond_2
    const-string v0, "DownloadService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DOWNLOADING_STATE_RETRY, retryOver,so stop send message DOWNLOAD_FAILED_CONNECT_ERROR"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    const/4 v0, 0x1

    invoke-static {v0}, Lo/dpm;->d(I)V

    .line 175
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v1}, Lo/dqb;->c(Ljava/lang/Object;I)V

    .line 176
    const/4 v0, 0x1

    return v0

    .line 178
    :goto_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 36
    const-string v0, "DownloadService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DownloadService run"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 37
    invoke-direct {p0}, Lo/dqb;->a()V

    .line 38
    const/4 v0, -0x1

    invoke-static {v0}, Lo/dpm;->d(I)V

    .line 40
    :try_start_0
    invoke-direct {p0}, Lo/dqb;->c()V

    .line 41
    invoke-direct {p0}, Lo/dqb;->d()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    goto :goto_0

    .line 42
    :catch_0
    move-exception v4

    .line 43
    const-string v0, "DownloadService"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RuntimeException e1:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    goto :goto_0

    .line 45
    :catch_1
    move-exception v4

    .line 46
    const-string v0, "DownloadService"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception  e :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 52
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v5

    .line 52
    throw v5

    .line 53
    :goto_0
    return-void
.end method
