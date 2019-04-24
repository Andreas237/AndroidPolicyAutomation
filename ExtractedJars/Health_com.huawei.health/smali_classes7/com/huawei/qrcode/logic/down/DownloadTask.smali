.class public Lcom/huawei/qrcode/logic/down/DownloadTask;
.super Ljava/lang/Thread;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/qrcode/logic/down/DownloadTask$ProgressRefreshHandler;
    }
.end annotation


# instance fields
.field private bis:Ljava/io/BufferedInputStream;

.field protected volatile cancel:Z

.field private conn:Ljava/net/HttpURLConnection;

.field private downloadEntity:Lcom/huawei/qrcode/logic/down/DownloadEntity;

.field private downloadListener:Lcom/huawei/qrcode/logic/down/IDownloadTaskListener;

.field private downloadURL:Ljava/net/URL;

.field private downloadedSize:J

.field private filePath:Ljava/lang/String;

.field private fileSize:J

.field private progressRefreshHandler:Landroid/os/Handler;

.field private saveFileName:Ljava/lang/String;

.field private saveFileTmpName:Ljava/lang/String;

.field private taskId:Ljava/lang/String;


# direct methods
.method protected constructor <init>(Lcom/huawei/qrcode/logic/down/DownloadEntity;Lcom/huawei/qrcode/logic/down/IDownloadTaskListener;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->fileSize:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadedSize:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->cancel:Z

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->taskId:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/qrcode/logic/down/DownloadEntity;->getSaveFileName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->saveFileName:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/qrcode/logic/down/DownloadEntity;->getDownloadFileSize()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->fileSize:J

    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-virtual {p1}, Lcom/huawei/qrcode/logic/down/DownloadEntity;->getDownloadUrl()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadURL:Ljava/net/URL;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

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

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->w(Ljava/lang/String;Z)V

    :goto_0
    iput-object p2, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadListener:Lcom/huawei/qrcode/logic/down/IDownloadTaskListener;

    iput-object p1, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadEntity:Lcom/huawei/qrcode/logic/down/DownloadEntity;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadedSize:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->cancel:Z

    invoke-static {}, Lcom/huawei/qrcode/logic/down/ThreadLooperManager;->getInstance()Lcom/huawei/qrcode/logic/down/ThreadLooperManager;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    invoke-virtual {v2}, Lcom/huawei/qrcode/logic/down/ThreadLooperManager;->getLooper()Landroid/os/Looper;

    move-result-object v3

    goto :goto_1

    :cond_0
    const-string v0, "DownloadTask threadLooperManager is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    :goto_1
    if-eqz v3, :cond_1

    new-instance v0, Lcom/huawei/qrcode/logic/down/DownloadTask$ProgressRefreshHandler;

    invoke-direct {v0, v3, p0}, Lcom/huawei/qrcode/logic/down/DownloadTask$ProgressRefreshHandler;-><init>(Landroid/os/Looper;Lcom/huawei/qrcode/logic/down/DownloadTask;)V

    iput-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->progressRefreshHandler:Landroid/os/Handler;

    goto :goto_2

    :cond_1
    const-string v0, "DownloadTask looper is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    :goto_2
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/qrcode/logic/down/DownloadTask;Landroid/os/Message;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/qrcode/logic/down/DownloadTask;->handleMessage(Landroid/os/Message;)V

    return-void
.end method

.method private deleteExistFile()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->saveFileName:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->deleteFile(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "DownloadTask delete file success"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "DownloadTask download delete exist file failed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_0
    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->saveFileTmpName:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->deleteFile(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "DownloadTask delete tmp file success"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "DownloadTask download delete temp file failed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_1
    return-void
.end method

.method private deleteFile(Ljava/lang/String;)Z
    .locals 3

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/qrcode/logic/down/StringUtil;->isEmpty(Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v2, Ljava/io/File;

    invoke-direct {p0, p1}, Lcom/huawei/qrcode/logic/down/DownloadTask;->getLocalFilePath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    move-result v0

    return v0

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

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private getAPKPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->saveFileName:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->getLocalFilePath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getFormatStr(J)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/huawei/qrcode/logic/down/BaseCommonContext;->getInstance()Lcom/huawei/qrcode/logic/down/BaseCommonContext;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/qrcode/logic/down/BaseCommonContext;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2}, Landroid/text/format/Formatter;->formatShortFileSize(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getLocalFilePath(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const-string v2, ""

    invoke-static {}, Lcom/huawei/qrcode/logic/down/BaseCommonContext;->getInstance()Lcom/huawei/qrcode/logic/down/BaseCommonContext;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/qrcode/logic/down/BaseCommonContext;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v3

    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const-string v0, "DownloadTask getLocalFilePath cacheDir is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    :goto_0
    return-object v2
.end method

.method private getProgressRefreshPercent()I
    .locals 5

    const/4 v4, 0x0

    iget-wide v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->fileSize:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-wide v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadedSize:J

    const-wide/16 v2, 0x64

    mul-long/2addr v0, v2

    iget-wide v2, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->fileSize:J

    div-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    move-result v4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->getName()Ljava/lang/String;

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

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; progress:  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadedSize:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    :goto_0
    return v4
.end method

.method private getSubServerFileName(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "DownloadTask getSubServerFileName ServerFileName is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v2, 0x0

    const-string v0, "?"

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    const-string v0, "DownloadTask getSubServerFileName group big two."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const-string v0, "\\?"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    const-string v0, "DownloadTask getSubServerFileName group small two."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    :goto_0
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    array-length v0, v2

    const/4 v1, 0x2

    if-lt v0, v1, :cond_2

    const-string v0, "DownloadTask getSubServerFileName fileName is not null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    aget-object v0, v2, v0

    return-object v0

    :cond_2
    const-string v0, "DownloadTask getSubServerFileName fileName is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return-object v0
.end method

.method private handleMessage(Landroid/os/Message;)V
    .locals 5

    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    invoke-direct {p0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->getProgressRefreshPercent()I

    move-result v4

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadListener:Lcom/huawei/qrcode/logic/down/IDownloadTaskListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadListener:Lcom/huawei/qrcode/logic/down/IDownloadTaskListener;

    iget-object v1, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadEntity:Lcom/huawei/qrcode/logic/down/DownloadEntity;

    invoke-interface {v0, v1, v4}, Lcom/huawei/qrcode/logic/down/IDownloadTaskListener;->setProgress(Lcom/huawei/qrcode/logic/down/DownloadEntity;I)V

    :cond_0
    const/16 v0, 0x64

    if-ge v4, v0, :cond_1

    invoke-virtual {p1}, Landroid/os/Message;->getTarget()Landroid/os/Handler;

    move-result-object v0

    const v1, 0xc350

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    :sswitch_1
    invoke-virtual {p1}, Landroid/os/Message;->getTarget()Landroid/os/Handler;

    move-result-object v0

    const v1, 0xc350

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    goto :goto_0

    :sswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iget-wide v1, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadedSize:J

    invoke-direct {p0, v1, v2}, Lcom/huawei/qrcode/logic/down/DownloadTask;->getFormatStr(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->fileSize:J

    invoke-direct {p0, v1, v2}, Lcom/huawei/qrcode/logic/down/DownloadTask;->getFormatStr(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadListener:Lcom/huawei/qrcode/logic/down/IDownloadTaskListener;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadListener:Lcom/huawei/qrcode/logic/down/IDownloadTaskListener;

    iget-object v1, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadEntity:Lcom/huawei/qrcode/logic/down/DownloadEntity;

    invoke-interface {v0, v1, v4}, Lcom/huawei/qrcode/logic/down/IDownloadTaskListener;->setDownloadSize(Lcom/huawei/qrcode/logic/down/DownloadEntity;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1770 -> :sswitch_2
        0xc350 -> :sswitch_0
        0xc351 -> :sswitch_1
    .end sparse-switch
.end method

.method private prepareDownload()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "DownloadTask download task prepareDownload"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadURL:Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    iput-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->conn:Ljava/net/HttpURLConnection;

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->conn:Ljava/net/HttpURLConnection;

    const/16 v1, 0x2710

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->conn:Ljava/net/HttpURLConnection;

    const/16 v1, 0x4e20

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->conn:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v4

    const/16 v0, 0xc8

    if-eq v0, v4, :cond_0

    invoke-direct {p0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->sendFailedMsg()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->conn:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getContentLength()I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->fileSize:J

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadEntity:Lcom/huawei/qrcode/logic/down/DownloadEntity;

    iget-wide v1, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->fileSize:J

    invoke-virtual {v0, v1, v2}, Lcom/huawei/qrcode/logic/down/DownloadEntity;->setDownloadFileSize(J)V

    iget-wide v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->fileSize:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    invoke-direct {p0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->sendFailedMsg()V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->progressRefreshHandler:Landroid/os/Handler;

    const/16 v1, 0x1770

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    invoke-direct {p0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->setFileInfo()V

    invoke-direct {p0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->deleteExistFile()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; connected to server!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    return-void
.end method

.method private reNameTmpFile()Z
    .locals 5

    new-instance v2, Ljava/io/File;

    invoke-direct {p0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->getAPKPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v3, Ljava/io/File;

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->saveFileTmpName:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->getLocalFilePath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v3, v2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v4

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

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    :cond_0
    return v4
.end method

.method private readData()V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "DownloadTask download task readData"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    new-instance v0, Ljava/io/BufferedInputStream;

    iget-object v1, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->conn:Ljava/net/HttpURLConnection;

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->bis:Ljava/io/BufferedInputStream;

    const v0, 0xffff

    new-array v4, v0, [B

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    :try_start_0
    new-instance v6, Ljava/io/FileOutputStream;

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->saveFileTmpName:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/huawei/qrcode/logic/down/DownloadTask;->getLocalFilePath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v6, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    new-instance v0, Ljava/io/BufferedOutputStream;

    invoke-direct {v0, v6}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v7, v0

    :goto_0
    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->bis:Ljava/io/BufferedInputStream;

    invoke-virtual {v0, v4}, Ljava/io/BufferedInputStream;->read([B)I

    move-result v0

    move v5, v0

    if-lez v0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->isCanDownload()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; while(); download finish!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v7, v4, v0, v5}, Ljava/io/BufferedOutputStream;->write([BII)V

    iget-wide v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadedSize:J

    int-to-long v2, v5

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadedSize:J

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->progressRefreshHandler:Landroid/os/Handler;

    const/16 v1, 0x1770

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v7, :cond_3

    :try_start_1
    invoke-virtual {v7}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :catch_0
    move-exception v8

    const-string v0, "finally bos.close failed."

    const/4 v1, 0x0

    invoke-static {v0, v8, v1}, Lcom/huawei/qrcode/util/LogX;->w(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    goto :goto_3

    :catch_1
    move-exception v8

    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; read data IOException:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v8, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    throw v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v9

    if-eqz v7, :cond_2

    :try_start_3
    invoke-virtual {v7}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_2

    :catch_2
    move-exception v10

    const-string v0, "finally bos.close failed."

    const/4 v1, 0x0

    invoke-static {v0, v10, v1}, Lcom/huawei/qrcode/util/LogX;->w(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :cond_2
    :goto_2
    throw v9

    :cond_3
    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; while end! "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; mDownloadedSize= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadedSize:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    return-void
.end method

.method private releaseResource()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->bis:Ljava/io/BufferedInputStream;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->bis:Ljava/io/BufferedInputStream;

    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; buffer input stream close failed,"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v2, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->conn:Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->conn:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_1
    return-void
.end method

.method private sendFailedMsg()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->saveFileTmpName:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->deleteFile(Ljava/lang/String;)Z

    invoke-virtual {p0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->deleteDownloadFile()V

    invoke-static {}, Lcom/huawei/qrcode/logic/down/DownloadManager;->getInstance()Lcom/huawei/qrcode/logic/down/DownloadManager;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->getDownloadEntity()Lcom/huawei/qrcode/logic/down/DownloadEntity;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadListener:Lcom/huawei/qrcode/logic/down/IDownloadTaskListener;

    const/16 v3, 0x7541

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/qrcode/logic/down/DownloadManager;->sendMessage(Lcom/huawei/qrcode/logic/down/DownloadEntity;Lcom/huawei/qrcode/logic/down/IDownloadTaskListener;I)V

    return-void
.end method

.method private setFileInfo()V
    .locals 6

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadEntity:Lcom/huawei/qrcode/logic/down/DownloadEntity;

    invoke-virtual {v0}, Lcom/huawei/qrcode/logic/down/DownloadEntity;->getDownloadUrl()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v3

    const/4 v0, -0x1

    if-eq v0, v3, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadEntity:Lcom/huawei/qrcode/logic/down/DownloadEntity;

    invoke-virtual {v0}, Lcom/huawei/qrcode/logic/down/DownloadEntity;->getDownloadUrl()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v3, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "server name "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    invoke-direct {p0, v2}, Lcom/huawei/qrcode/logic/down/DownloadTask;->getSubServerFileName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v0, 0x1

    invoke-static {v2, v0}, Lcom/huawei/qrcode/logic/down/StringUtil;->isEmpty(Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_1

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

    move-result-object v2

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "local name "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    iput-object v2, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->saveFileName:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".tmp"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->saveFileTmpName:Ljava/lang/String;

    new-instance v4, Ljava/io/File;

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->saveFileName:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->getLocalFilePath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {v4}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->filePath:Ljava/lang/String;

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->filePath:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/qrcode/logic/down/StringUtil;->isEmpty(Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/io/IOException;

    const-string v1, "download file null , can not download file!"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    goto :goto_0

    :catch_0
    move-exception v5

    const-string v0, "get file path failed,"

    const/4 v1, 0x0

    invoke-static {v0, v5, v1}, Lcom/huawei/qrcode/util/LogX;->w(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :goto_0
    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadEntity:Lcom/huawei/qrcode/logic/down/DownloadEntity;

    iget-object v1, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->filePath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/qrcode/logic/down/DownloadEntity;->setFilePath(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DownloadTask download fileName: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->saveFileName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method protected cancel()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->cancel:Z

    const-string v0, "DownloadTask cancel download task"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    return-void
.end method

.method public deleteDownloadFile()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->saveFileName:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->deleteFile(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "DownloadTask delete download file success"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_0
    const-string v0, "DownloadTask delete download file failed"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    :goto_0
    return-void
.end method

.method public getDownloadEntity()Lcom/huawei/qrcode/logic/down/DownloadEntity;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadEntity:Lcom/huawei/qrcode/logic/down/DownloadEntity;

    return-object v0
.end method

.method public getDownloadListener()Lcom/huawei/qrcode/logic/down/IDownloadTaskListener;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadListener:Lcom/huawei/qrcode/logic/down/IDownloadTaskListener;

    return-object v0
.end method

.method public getFilesize()J
    .locals 2

    iget-wide v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->fileSize:J

    return-wide v0
.end method

.method public getProgressRefreshHandler()Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->progressRefreshHandler:Landroid/os/Handler;

    return-object v0
.end method

.method public getTaskId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->taskId:Ljava/lang/String;

    return-object v0
.end method

.method protected isCanDownload()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->cancel:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public run()V
    .locals 9

    const-string v0, "download task thread run."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->isCanDownload()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "DownloadTask download task finish at begining"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->progressRefreshHandler:Landroid/os/Handler;

    const v1, 0xc351

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->progressRefreshHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->releaseResource()V

    return-void

    :cond_0
    :try_start_1
    invoke-static {}, Lcom/huawei/qrcode/logic/down/DownloadManager;->getInstance()Lcom/huawei/qrcode/logic/down/DownloadManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadEntity:Lcom/huawei/qrcode/logic/down/DownloadEntity;

    iget-object v2, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadListener:Lcom/huawei/qrcode/logic/down/IDownloadTaskListener;

    const/16 v3, 0x4e32

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/qrcode/logic/down/DownloadManager;->sendMessage(Lcom/huawei/qrcode/logic/down/DownloadEntity;Lcom/huawei/qrcode/logic/down/IDownloadTaskListener;I)V

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->progressRefreshHandler:Landroid/os/Handler;

    const v1, 0xc350

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    invoke-direct {p0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->prepareDownload()V

    invoke-direct {p0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->readData()V

    iget-boolean v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->cancel:Z

    if-eqz v0, :cond_1

    const-string v0, "DownloadTask run download task cancel"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->saveFileTmpName:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->deleteFile(Ljava/lang/String;)Z

    invoke-direct {p0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->sendFailedMsg()V

    goto/16 :goto_2

    :cond_1
    const/4 v4, 0x0

    invoke-direct {p0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->reNameTmpFile()Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DownloadTask run downloadedSize= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadedSize:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  fileSize= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->fileSize:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    iget-wide v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadedSize:J

    iget-wide v2, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->fileSize:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    const/4 v5, 0x1

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadListener:Lcom/huawei/qrcode/logic/down/IDownloadTaskListener;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadListener:Lcom/huawei/qrcode/logic/down/IDownloadTaskListener;

    iget-object v1, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadEntity:Lcom/huawei/qrcode/logic/down/DownloadEntity;

    invoke-interface {v0, v1}, Lcom/huawei/qrcode/logic/down/IDownloadTaskListener;->validate(Lcom/huawei/qrcode/logic/down/DownloadEntity;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v6, 0x1

    goto :goto_1

    :cond_3
    const/4 v6, 0x0

    :goto_1
    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->saveFileName:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->getLocalFilePath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadEntity:Lcom/huawei/qrcode/logic/down/DownloadEntity;

    invoke-virtual {v1}, Lcom/huawei/qrcode/logic/down/DownloadEntity;->getHashValue()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/Md5Util;->isFileMd5Equal(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DownloadTask run isReadSizeSuccess = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DownloadTask run isValidateSuccess = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DownloadTask run isHashEqual = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    if-eqz v5, :cond_4

    if-eqz v6, :cond_4

    if-eqz v7, :cond_4

    const-string v0, "DownloadTask run isSuccess true."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v4, 0x1

    :cond_4
    if-eqz v4, :cond_5

    invoke-static {}, Lcom/huawei/qrcode/logic/down/DownloadManager;->getInstance()Lcom/huawei/qrcode/logic/down/DownloadManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadEntity:Lcom/huawei/qrcode/logic/down/DownloadEntity;

    iget-object v2, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadListener:Lcom/huawei/qrcode/logic/down/IDownloadTaskListener;

    const/16 v3, 0x4e31

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/qrcode/logic/down/DownloadManager;->sendMessage(Lcom/huawei/qrcode/logic/down/DownloadEntity;Lcom/huawei/qrcode/logic/down/IDownloadTaskListener;I)V

    goto :goto_2

    :cond_5
    const-string v0, "DownloadTask run isSuccess false."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    invoke-direct {p0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->sendFailedMsg()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->progressRefreshHandler:Landroid/os/Handler;

    const v1, 0xc351

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->progressRefreshHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->releaseResource()V

    goto :goto_3

    :catch_0
    move-exception v4

    const-string v0, "download task IOException,"

    const/4 v1, 0x0

    :try_start_2
    invoke-static {v0, v4, v1}, Lcom/huawei/qrcode/util/LogX;->w(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    invoke-direct {p0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->sendFailedMsg()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->progressRefreshHandler:Landroid/os/Handler;

    const v1, 0xc351

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->progressRefreshHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->releaseResource()V

    goto :goto_3

    :catch_1
    move-exception v4

    const-string v0, "download task exception,"

    const/4 v1, 0x0

    :try_start_3
    invoke-static {v0, v4, v1}, Lcom/huawei/qrcode/util/LogX;->w(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    invoke-direct {p0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->sendFailedMsg()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->progressRefreshHandler:Landroid/os/Handler;

    const v1, 0xc351

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->progressRefreshHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->releaseResource()V

    goto :goto_3

    :catchall_0
    move-exception v8

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->progressRefreshHandler:Landroid/os/Handler;

    const v1, 0xc351

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->progressRefreshHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/huawei/qrcode/logic/down/DownloadTask;->releaseResource()V

    throw v8

    :goto_3
    const-string v0, "run download task thread over."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    return-void
.end method

.method public setDownloadListener(Lcom/huawei/qrcode/logic/down/IDownloadTaskListener;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/logic/down/DownloadTask;->downloadListener:Lcom/huawei/qrcode/logic/down/IDownloadTaskListener;

    return-void
.end method
