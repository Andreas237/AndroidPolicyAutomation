.class public Lcom/huawei/wallet/logic/down/DownloadTask;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/wallet/logic/down/DownloadTask$ProgressRefreshHandler;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field protected volatile d:Z

.field private e:Ljava/net/URL;

.field private f:J

.field private g:Lcom/huawei/wallet/logic/down/IDownloadTaskListener;

.field private h:J

.field private i:J

.field private k:J

.field private l:Lcom/huawei/wallet/logic/down/DownloadEntity;

.field private m:Ljava/net/HttpURLConnection;

.field private n:Ljava/lang/String;

.field private o:Landroid/os/Handler;

.field private p:Ljava/io/BufferedInputStream;


# direct methods
.method protected constructor <init>(Lcom/huawei/wallet/logic/down/DownloadEntity;Lcom/huawei/wallet/logic/down/IDownloadTaskListener;)V
    .locals 4

    .line 656
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 57
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->h:J

    .line 62
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->k:J

    .line 67
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->i:J

    .line 72
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->f:J

    .line 102
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->d:Z

    .line 657
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->n:Ljava/lang/String;

    .line 659
    invoke-virtual {p1}, Lcom/huawei/wallet/logic/down/DownloadEntity;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->b:Ljava/lang/String;

    .line 660
    invoke-virtual {p1}, Lcom/huawei/wallet/logic/down/DownloadEntity;->e()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->h:J

    .line 663
    invoke-virtual {p1}, Lcom/huawei/wallet/logic/down/DownloadEntity;->i()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->i:J

    .line 664
    invoke-virtual {p1}, Lcom/huawei/wallet/logic/down/DownloadEntity;->d()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->f:J

    .line 668
    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-virtual {p1}, Lcom/huawei/wallet/logic/down/DownloadEntity;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->e:Ljava/net/URL;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 673
    goto :goto_0

    .line 670
    :catch_0
    move-exception v2

    .line 672
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "new downloadTask exception: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Z)V

    .line 675
    :goto_0
    iput-object p2, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->g:Lcom/huawei/wallet/logic/down/IDownloadTaskListener;

    .line 676
    iput-object p1, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->l:Lcom/huawei/wallet/logic/down/DownloadEntity;

    .line 677
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->k:J

    .line 678
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->d:Z

    .line 680
    invoke-static {}, Lcom/huawei/wallet/logic/down/ThreadLooperManager;->b()Lcom/huawei/wallet/logic/down/ThreadLooperManager;

    move-result-object v2

    .line 681
    const/4 v3, 0x0

    .line 682
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 684
    invoke-virtual {v2}, Lcom/huawei/wallet/logic/down/ThreadLooperManager;->e()Landroid/os/Looper;

    move-result-object v3

    goto :goto_1

    .line 688
    :cond_0
    const-string v0, "DownloadTask threadLooperManager is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V

    .line 691
    :goto_1
    if-eqz v3, :cond_1

    .line 693
    new-instance v0, Lcom/huawei/wallet/logic/down/DownloadTask$ProgressRefreshHandler;

    invoke-direct {v0, v3, p0}, Lcom/huawei/wallet/logic/down/DownloadTask$ProgressRefreshHandler;-><init>(Landroid/os/Looper;Lcom/huawei/wallet/logic/down/DownloadTask;)V

    iput-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->o:Landroid/os/Handler;

    goto :goto_2

    .line 697
    :cond_1
    const-string v0, "DownloadTask looper is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V

    .line 700
    :goto_2
    return-void
.end method

.method private a(Landroid/os/Message;)V
    .locals 5

    .line 496
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    .line 500
    :sswitch_0
    invoke-direct {p0}, Lcom/huawei/wallet/logic/down/DownloadTask;->p()I

    move-result v4

    .line 502
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->g:Lcom/huawei/wallet/logic/down/IDownloadTaskListener;

    if-eqz v0, :cond_0

    .line 505
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->g:Lcom/huawei/wallet/logic/down/IDownloadTaskListener;

    iget-object v1, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->l:Lcom/huawei/wallet/logic/down/DownloadEntity;

    invoke-interface {v0, v1, v4}, Lcom/huawei/wallet/logic/down/IDownloadTaskListener;->a(Lcom/huawei/wallet/logic/down/DownloadEntity;I)V

    .line 509
    :cond_0
    const/16 v0, 0x64

    if-ge v4, v0, :cond_3

    .line 511
    invoke-virtual {p1}, Landroid/os/Message;->getTarget()Landroid/os/Handler;

    move-result-object v0

    const v1, 0xc350

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_1

    .line 520
    :sswitch_1
    invoke-virtual {p1}, Landroid/os/Message;->getTarget()Landroid/os/Handler;

    move-result-object v0

    const v1, 0xc350

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 521
    goto/16 :goto_1

    .line 528
    :sswitch_2
    const/4 v4, 0x0

    .line 530
    iget-wide v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->i:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_2

    .line 532
    iget-wide v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->f:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 534
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iget-wide v1, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->f:J

    .line 535
    invoke-direct {p0, v1, v2}, Lcom/huawei/wallet/logic/down/DownloadTask;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 536
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->i:J

    .line 537
    invoke-direct {p0, v1, v2}, Lcom/huawei/wallet/logic/down/DownloadTask;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 538
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 542
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iget-wide v1, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->k:J

    .line 543
    invoke-direct {p0, v1, v2}, Lcom/huawei/wallet/logic/down/DownloadTask;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 544
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->i:J

    .line 545
    invoke-direct {p0, v1, v2}, Lcom/huawei/wallet/logic/down/DownloadTask;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 546
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 551
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iget-wide v1, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->k:J

    .line 552
    invoke-direct {p0, v1, v2}, Lcom/huawei/wallet/logic/down/DownloadTask;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 553
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->h:J

    .line 554
    invoke-direct {p0, v1, v2}, Lcom/huawei/wallet/logic/down/DownloadTask;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 555
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 558
    :goto_0
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->g:Lcom/huawei/wallet/logic/down/IDownloadTaskListener;

    if-eqz v0, :cond_3

    .line 560
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->g:Lcom/huawei/wallet/logic/down/IDownloadTaskListener;

    iget-object v1, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->l:Lcom/huawei/wallet/logic/down/DownloadEntity;

    invoke-interface {v0, v1, v4}, Lcom/huawei/wallet/logic/down/IDownloadTaskListener;->c(Lcom/huawei/wallet/logic/down/DownloadEntity;Ljava/lang/String;)V

    .line 567
    :cond_3
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1770 -> :sswitch_2
        0xc350 -> :sswitch_0
        0xc351 -> :sswitch_1
    .end sparse-switch
.end method

.method private b(J)Ljava/lang/String;
    .locals 1

    .line 610
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2}, Landroid/text/format/Formatter;->formatShortFileSize(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b(Ljava/lang/String;)Z
    .locals 3

    .line 419
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/wallet/logic/down/StringUtil;->e(Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 421
    new-instance v2, Ljava/io/File;

    invoke-direct {p0, p1}, Lcom/huawei/wallet/logic/down/DownloadTask;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 422
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 424
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    move-result v0

    return v0

    .line 428
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DownloadTask delete file not exist:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 431
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic c(Lcom/huawei/wallet/logic/down/DownloadTask;Landroid/os/Message;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/huawei/wallet/logic/down/DownloadTask;->a(Landroid/os/Message;)V

    return-void
.end method

.method private d(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 852
    const/4 v2, 0x0

    .line 853
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    .line 854
    invoke-static {v3}, Lcom/huawei/wallet/storage/path/PayStorageUtil;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 855
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 856
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 858
    invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_0

    .line 860
    const-string v0, "make cache dir failed"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 863
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 864
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 866
    return-object v2
.end method

.method private f()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 135
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->b:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/wallet/logic/down/DownloadTask;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 137
    const-string v0, "DownloadTask delete file success"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    goto :goto_0

    .line 142
    :cond_0
    const-string v0, " DownloadTask delete file fail"

    const-string v1, "DownloadTask.deleteExistFile"

    iget-object v2, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->b:Ljava/lang/String;

    .line 144
    invoke-static {v1, v2}, Lcom/huawei/wallet/utils/log/LogErrorConstant;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 142
    const v2, 0x361185c5

    const/4 v3, 0x0

    invoke-static {v0, v2, v1, v3}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;ILjava/util/Map;Z)V

    .line 148
    new-instance v0, Ljava/io/IOException;

    const-string v1, "DownloadTask download delete exist file failed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 152
    :goto_0
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->c:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/wallet/logic/down/DownloadTask;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 154
    const-string v0, "DownloadTask delete tmp file success"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    goto :goto_1

    .line 159
    :cond_1
    const-string v0, " DownloadTask delete tmp  file fail"

    const-string v1, "DownloadTask.deleteExistFile"

    iget-object v2, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->c:Ljava/lang/String;

    .line 161
    invoke-static {v1, v2}, Lcom/huawei/wallet/utils/log/LogErrorConstant;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 159
    const v2, 0x361185c5

    const/4 v3, 0x0

    invoke-static {v0, v2, v1, v3}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;ILjava/util/Map;Z)V

    .line 165
    new-instance v0, Ljava/io/IOException;

    const-string v1, "DownloadTask download delete temp file failed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 167
    :goto_1
    return-void
.end method

.method private g()V
    .locals 3

    .line 176
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->p:Ljava/io/BufferedInputStream;

    if-eqz v0, :cond_0

    .line 180
    :try_start_0
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->p:Ljava/io/BufferedInputStream;

    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 185
    goto :goto_0

    .line 182
    :catch_0
    move-exception v2

    .line 184
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/wallet/logic/down/DownloadTask;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; buffer input stream close failed,"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v2, v1}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 187
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->m:Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_1

    .line 189
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->m:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 191
    :cond_1
    return-void
.end method

.method private h()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 202
    const-string v0, "DownloadTask download task prepareDownload"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V

    .line 205
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->e:Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    iput-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->m:Ljava/net/HttpURLConnection;

    .line 206
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->m:Ljava/net/HttpURLConnection;

    const/16 v1, 0x2710

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 207
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->m:Ljava/net/HttpURLConnection;

    const/16 v1, 0x4e20

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 208
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->m:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v4

    .line 209
    const/16 v0, 0xc8

    if-eq v0, v4, :cond_0

    .line 212
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "url:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->e:Ljava/net/URL;

    invoke-virtual {v1}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " code:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 213
    const-string v0, " DownloadTask down getresponsecode err."

    const-string v1, "DownloadTask.prepareDownload"

    .line 215
    invoke-static {v1, v5}, Lcom/huawei/wallet/utils/log/LogErrorConstant;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 213
    const v2, 0x361185e9

    const/4 v3, 0x0

    invoke-static {v0, v2, v1, v3}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;ILjava/util/Map;Z)V

    .line 219
    invoke-direct {p0}, Lcom/huawei/wallet/logic/down/DownloadTask;->o()V

    .line 220
    return-void

    .line 223
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->m:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getContentLength()I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->h:J

    .line 224
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->l:Lcom/huawei/wallet/logic/down/DownloadEntity;

    iget-wide v1, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->h:J

    invoke-virtual {v0, v1, v2}, Lcom/huawei/wallet/logic/down/DownloadEntity;->c(J)V

    .line 225
    iget-wide v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->h:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 228
    invoke-direct {p0}, Lcom/huawei/wallet/logic/down/DownloadTask;->o()V

    .line 229
    return-void

    .line 231
    :cond_1
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->o:Landroid/os/Handler;

    const/16 v1, 0x1770

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 234
    invoke-direct {p0}, Lcom/huawei/wallet/logic/down/DownloadTask;->k()V

    .line 237
    invoke-direct {p0}, Lcom/huawei/wallet/logic/down/DownloadTask;->f()V

    .line 239
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/wallet/logic/down/DownloadTask;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; connected to server!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V

    .line 240
    return-void
.end method

.method private k()V
    .locals 8

    .line 247
    const/4 v4, 0x0

    .line 248
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->l:Lcom/huawei/wallet/logic/down/DownloadEntity;

    invoke-virtual {v0}, Lcom/huawei/wallet/logic/down/DownloadEntity;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v5

    .line 249
    const/4 v0, -0x1

    if-eq v0, v5, :cond_0

    .line 251
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->l:Lcom/huawei/wallet/logic/down/DownloadEntity;

    invoke-virtual {v0}, Lcom/huawei/wallet/logic/down/DownloadEntity;->b()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v5, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    .line 254
    :cond_0
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/wallet/logic/down/StringUtil;->e(Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 256
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".apk"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 259
    :cond_1
    iput-object v4, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->b:Ljava/lang/String;

    .line 260
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".tmp"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->c:Ljava/lang/String;

    .line 263
    new-instance v6, Ljava/io/File;

    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->b:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/wallet/logic/down/DownloadTask;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 264
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    .line 268
    :try_start_0
    invoke-virtual {v6}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->a:Ljava/lang/String;

    .line 271
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->a:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/wallet/logic/down/StringUtil;->e(Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 274
    const-string v0, " DownloadTask filepath isempty."

    const-string v1, "DownloadTask.setFileInfo"

    .line 276
    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/huawei/wallet/utils/log/LogErrorConstant;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 274
    const v2, 0x361185c7

    const/4 v3, 0x0

    invoke-static {v0, v2, v1, v3}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;ILjava/util/Map;Z)V

    .line 279
    new-instance v0, Ljava/io/IOException;

    const-string v1, "download file null , can not download file!"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 285
    :cond_2
    goto :goto_0

    .line 282
    :catch_0
    move-exception v7

    .line 284
    const-string v0, "get file path failed,"

    const/4 v1, 0x0

    invoke-static {v0, v7, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 286
    :goto_0
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->l:Lcom/huawei/wallet/logic/down/DownloadEntity;

    iget-object v1, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/logic/down/DownloadEntity;->a(Ljava/lang/String;)V

    .line 289
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DownloadTask download fileName: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V

    .line 290
    return-void
.end method

.method private l()Ljava/lang/String;
    .locals 1

    .line 876
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->b:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/wallet/logic/down/DownloadTask;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private m()V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 301
    const-string v0, "DownloadTask download task readData"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V

    .line 304
    new-instance v0, Ljava/io/BufferedInputStream;

    iget-object v1, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->m:Ljava/net/HttpURLConnection;

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->p:Ljava/io/BufferedInputStream;

    .line 305
    const v0, 0xffff

    new-array v4, v0, [B

    .line 306
    const/4 v5, 0x0

    .line 307
    const/4 v6, 0x0

    .line 308
    const/4 v7, 0x0

    .line 312
    :try_start_0
    new-instance v6, Ljava/io/FileOutputStream;

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->c:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/huawei/wallet/logic/down/DownloadTask;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v6, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 313
    new-instance v0, Ljava/io/BufferedOutputStream;

    invoke-direct {v0, v6}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v7, v0

    .line 315
    :goto_0
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->p:Ljava/io/BufferedInputStream;

    invoke-virtual {v0, v4}, Ljava/io/BufferedInputStream;->read([B)I

    move-result v0

    move v5, v0

    if-lez v0, :cond_1

    .line 317
    invoke-virtual {p0}, Lcom/huawei/wallet/logic/down/DownloadTask;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 319
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/wallet/logic/down/DownloadTask;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; while(); download finish!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V

    .line 320
    goto :goto_1

    .line 322
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v7, v4, v0, v5}, Ljava/io/BufferedOutputStream;->write([BII)V

    .line 323
    iget-wide v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->k:J

    int-to-long v2, v5

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->k:J

    .line 324
    iget-wide v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->f:J

    int-to-long v2, v5

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->f:J

    .line 325
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->o:Landroid/os/Handler;

    const/16 v1, 0x1770

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 335
    :cond_1
    :goto_1
    if-eqz v7, :cond_3

    .line 339
    :try_start_1
    invoke-virtual {v7}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 345
    goto :goto_3

    .line 341
    :catch_0
    move-exception v8

    .line 344
    const-string v0, "finally bos.close failed."

    const/4 v1, 0x0

    invoke-static {v0, v8, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 345
    goto :goto_3

    .line 328
    :catch_1
    move-exception v8

    .line 330
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/wallet/logic/down/DownloadTask;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; read data IOException:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v8, v1}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 331
    throw v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 335
    :catchall_0
    move-exception v9

    if-eqz v7, :cond_2

    .line 339
    :try_start_3
    invoke-virtual {v7}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 345
    goto :goto_2

    .line 341
    :catch_2
    move-exception v10

    .line 344
    const-string v0, "finally bos.close failed."

    const/4 v1, 0x0

    invoke-static {v0, v10, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 347
    :cond_2
    :goto_2
    throw v9

    .line 350
    :cond_3
    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/wallet/logic/down/DownloadTask;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; while end! "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V

    .line 351
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/wallet/logic/down/DownloadTask;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; mDownloadedSize= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->k:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V

    .line 352
    return-void
.end method

.method private n()Z
    .locals 5

    .line 400
    new-instance v2, Ljava/io/File;

    invoke-direct {p0}, Lcom/huawei/wallet/logic/down/DownloadTask;->l()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 401
    new-instance v3, Ljava/io/File;

    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->c:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/wallet/logic/down/DownloadTask;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 403
    const/4 v4, 0x0

    .line 404
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 406
    invoke-virtual {v3, v2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v4

    .line 407
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "reNameTmpFile isReNameSus= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 410
    :cond_0
    return v4
.end method

.method private o()V
    .locals 4

    .line 455
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->c:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/wallet/logic/down/DownloadTask;->b(Ljava/lang/String;)Z

    .line 456
    invoke-virtual {p0}, Lcom/huawei/wallet/logic/down/DownloadTask;->c()V

    .line 457
    invoke-static {}, Lcom/huawei/wallet/logic/down/DownloadManager;->c()Lcom/huawei/wallet/logic/down/DownloadManager;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/wallet/logic/down/DownloadTask;->i()Lcom/huawei/wallet/logic/down/DownloadEntity;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->g:Lcom/huawei/wallet/logic/down/IDownloadTaskListener;

    const/16 v3, 0x7541

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/wallet/logic/down/DownloadManager;->b(Lcom/huawei/wallet/logic/down/DownloadEntity;Lcom/huawei/wallet/logic/down/IDownloadTaskListener;I)V

    .line 460
    return-void
.end method

.method private p()I
    .locals 5

    .line 574
    const/4 v4, 0x0

    .line 576
    iget-wide v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->i:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 578
    iget-wide v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->f:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 581
    iget-wide v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->f:J

    const-wide/16 v2, 0x64

    mul-long/2addr v0, v2

    iget-wide v2, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->i:J

    div-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    move-result v4

    goto :goto_0

    .line 586
    :cond_0
    iget-wide v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->k:J

    const-wide/16 v2, 0x64

    mul-long/2addr v0, v2

    iget-wide v2, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->i:J

    div-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    move-result v4

    .line 588
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/wallet/logic/down/DownloadTask;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; progress:  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "   %"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V

    goto :goto_1

    .line 592
    :cond_1
    iget-wide v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->h:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 595
    iget-wide v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->k:J

    const-wide/16 v2, 0x64

    mul-long/2addr v0, v2

    iget-wide v2, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->h:J

    div-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    move-result v4

    .line 596
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/wallet/logic/down/DownloadTask;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; progress:  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "   %"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V

    goto :goto_1

    .line 601
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/wallet/logic/down/DownloadTask;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; progress:  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->k:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V

    .line 604
    :goto_1
    return v4
.end method


# virtual methods
.method public a()Landroid/os/Handler;
    .locals 1

    .line 635
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->o:Landroid/os/Handler;

    return-object v0
.end method

.method protected b()V
    .locals 2

    .line 111
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->d:Z

    .line 112
    const-string v0, "DownloadTask cancel download task"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 113
    return-void
.end method

.method public c()V
    .locals 2

    .line 439
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->b:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/wallet/logic/down/DownloadTask;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 441
    const-string v0, "DownloadTask delete download file success"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    goto :goto_0

    .line 445
    :cond_0
    const-string v0, "DownloadTask delete download file failed"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 447
    :goto_0
    return-void
.end method

.method protected d()Z
    .locals 1

    .line 123
    iget-boolean v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->d:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 719
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->n:Ljava/lang/String;

    return-object v0
.end method

.method public i()Lcom/huawei/wallet/logic/down/DownloadEntity;
    .locals 1

    .line 749
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->l:Lcom/huawei/wallet/logic/down/DownloadEntity;

    return-object v0
.end method

.method public run()V
    .locals 8

    .line 758
    const-string v0, "download task thread run."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V

    .line 763
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/wallet/logic/down/DownloadTask;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 765
    const-string v0, "DownloadTask download task finish at begining"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 840
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->o:Landroid/os/Handler;

    const v1, 0xc351

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 841
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->o:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 844
    invoke-direct {p0}, Lcom/huawei/wallet/logic/down/DownloadTask;->g()V

    .line 766
    return-void

    .line 770
    :cond_0
    :try_start_1
    invoke-static {}, Lcom/huawei/wallet/logic/down/DownloadManager;->c()Lcom/huawei/wallet/logic/down/DownloadManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->l:Lcom/huawei/wallet/logic/down/DownloadEntity;

    iget-object v2, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->g:Lcom/huawei/wallet/logic/down/IDownloadTaskListener;

    const/16 v3, 0x4e32

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/wallet/logic/down/DownloadManager;->b(Lcom/huawei/wallet/logic/down/DownloadEntity;Lcom/huawei/wallet/logic/down/IDownloadTaskListener;I)V

    .line 773
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->o:Landroid/os/Handler;

    const v1, 0xc350

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 776
    invoke-direct {p0}, Lcom/huawei/wallet/logic/down/DownloadTask;->h()V

    .line 779
    invoke-direct {p0}, Lcom/huawei/wallet/logic/down/DownloadTask;->m()V

    .line 781
    iget-boolean v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->d:Z

    if-eqz v0, :cond_1

    .line 784
    const-string v0, "DownloadTask run download task cancel"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 785
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->c:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/wallet/logic/down/DownloadTask;->b(Ljava/lang/String;)Z

    .line 786
    invoke-direct {p0}, Lcom/huawei/wallet/logic/down/DownloadTask;->o()V

    goto/16 :goto_2

    .line 790
    :cond_1
    const/4 v4, 0x0

    .line 791
    invoke-direct {p0}, Lcom/huawei/wallet/logic/down/DownloadTask;->n()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 793
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DownloadTask run downloadedSize= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->k:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  fileSize= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->h:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 795
    iget-wide v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->k:J

    iget-wide v2, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->h:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    const/4 v5, 0x1

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    .line 797
    :goto_0
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->g:Lcom/huawei/wallet/logic/down/IDownloadTaskListener;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->g:Lcom/huawei/wallet/logic/down/IDownloadTaskListener;

    iget-object v1, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->l:Lcom/huawei/wallet/logic/down/DownloadEntity;

    invoke-interface {v0, v1}, Lcom/huawei/wallet/logic/down/IDownloadTaskListener;->d(Lcom/huawei/wallet/logic/down/DownloadEntity;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v6, 0x1

    goto :goto_1

    :cond_3
    const/4 v6, 0x0

    .line 799
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DownloadTask run isReadSizeSuccess = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " isValidateSuccess = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 802
    if-eqz v5, :cond_4

    if-eqz v6, :cond_4

    .line 804
    const-string v0, "DownloadTask run isSuccess true."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 805
    const/4 v4, 0x1

    .line 809
    :cond_4
    if-eqz v4, :cond_5

    .line 812
    invoke-static {}, Lcom/huawei/wallet/logic/down/DownloadManager;->c()Lcom/huawei/wallet/logic/down/DownloadManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->l:Lcom/huawei/wallet/logic/down/DownloadEntity;

    iget-object v2, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->g:Lcom/huawei/wallet/logic/down/IDownloadTaskListener;

    const/16 v3, 0x4e31

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/wallet/logic/down/DownloadManager;->b(Lcom/huawei/wallet/logic/down/DownloadEntity;Lcom/huawei/wallet/logic/down/IDownloadTaskListener;I)V

    goto :goto_2

    .line 818
    :cond_5
    const-string v0, "DownloadTask run isSuccess false."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 820
    invoke-direct {p0}, Lcom/huawei/wallet/logic/down/DownloadTask;->o()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 840
    :goto_2
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->o:Landroid/os/Handler;

    const v1, 0xc351

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 841
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->o:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 844
    invoke-direct {p0}, Lcom/huawei/wallet/logic/down/DownloadTask;->g()V

    .line 845
    goto :goto_3

    .line 824
    :catch_0
    move-exception v4

    .line 827
    const-string v0, "download task IOException,"

    const/4 v1, 0x0

    :try_start_2
    invoke-static {v0, v4, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 828
    invoke-direct {p0}, Lcom/huawei/wallet/logic/down/DownloadTask;->o()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 840
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->o:Landroid/os/Handler;

    const v1, 0xc351

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 841
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->o:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 844
    invoke-direct {p0}, Lcom/huawei/wallet/logic/down/DownloadTask;->g()V

    .line 845
    goto :goto_3

    .line 830
    :catch_1
    move-exception v4

    .line 833
    const-string v0, "download task exception,"

    const/4 v1, 0x0

    :try_start_3
    invoke-static {v0, v4, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 834
    invoke-direct {p0}, Lcom/huawei/wallet/logic/down/DownloadTask;->o()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 840
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->o:Landroid/os/Handler;

    const v1, 0xc351

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 841
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->o:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 844
    invoke-direct {p0}, Lcom/huawei/wallet/logic/down/DownloadTask;->g()V

    .line 845
    goto :goto_3

    .line 840
    :catchall_0
    move-exception v7

    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->o:Landroid/os/Handler;

    const v1, 0xc351

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 841
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadTask;->o:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 844
    invoke-direct {p0}, Lcom/huawei/wallet/logic/down/DownloadTask;->g()V

    .line 845
    throw v7

    .line 847
    :goto_3
    const-string v0, "run download task thread over."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V

    .line 848
    return-void
.end method
