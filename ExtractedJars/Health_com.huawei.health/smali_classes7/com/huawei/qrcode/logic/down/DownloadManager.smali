.class public final Lcom/huawei/qrcode/logic/down/DownloadManager;
.super Ljava/lang/Object;


# static fields
.field public static final DOWNLOAD_PATH:Ljava/lang/String; = "OTO"

.field private static final SYNC_LOCK:[B

.field private static instance:Lcom/huawei/qrcode/logic/down/DownloadManager; = null


# instance fields
.field private taskMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lcom/huawei/qrcode/logic/down/DownloadTask;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/qrcode/logic/down/DownloadManager;->SYNC_LOCK:[B

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadManager;->taskMap:Ljava/util/Map;

    return-void
.end method

.method public static getInstance()Lcom/huawei/qrcode/logic/down/DownloadManager;
    .locals 4

    sget-object v2, Lcom/huawei/qrcode/logic/down/DownloadManager;->SYNC_LOCK:[B

    monitor-enter v2

    :try_start_0
    sget-object v0, Lcom/huawei/qrcode/logic/down/DownloadManager;->instance:Lcom/huawei/qrcode/logic/down/DownloadManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    new-instance v0, Lcom/huawei/qrcode/logic/down/DownloadManager;

    invoke-direct {v0}, Lcom/huawei/qrcode/logic/down/DownloadManager;-><init>()V

    sput-object v0, Lcom/huawei/qrcode/logic/down/DownloadManager;->instance:Lcom/huawei/qrcode/logic/down/DownloadManager;

    :cond_0
    sget-object v0, Lcom/huawei/qrcode/logic/down/DownloadManager;->instance:Lcom/huawei/qrcode/logic/down/DownloadManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public cancelDownloadTask(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadManager;->taskMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/qrcode/logic/down/DownloadTask;

    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    invoke-virtual {v2}, Lcom/huawei/qrcode/logic/down/DownloadTask;->getProgressRefreshHandler()Landroid/os/Handler;

    move-result-object v0

    const v1, 0xc351

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    invoke-virtual {v2}, Lcom/huawei/qrcode/logic/down/DownloadTask;->getProgressRefreshHandler()Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/huawei/qrcode/logic/down/DownloadTask;->cancel()V

    goto :goto_0

    :cond_0
    const-string v0, "DownloadManager cancelDownloadTask task is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    :goto_0
    return-void
.end method

.method public download(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/qrcode/logic/down/IDownloadTaskListener;)Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "OTO"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/huawei/qrcode/logic/down/DownloadEntity;

    invoke-direct {v3, p1, v2, p2}, Lcom/huawei/qrcode/logic/down/DownloadEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Lcom/huawei/qrcode/logic/down/DownloadTask;

    invoke-direct {v4, v3, p3}, Lcom/huawei/qrcode/logic/down/DownloadTask;-><init>(Lcom/huawei/qrcode/logic/down/DownloadEntity;Lcom/huawei/qrcode/logic/down/IDownloadTaskListener;)V

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadManager;->taskMap:Ljava/util/Map;

    invoke-virtual {v4}, Lcom/huawei/qrcode/logic/down/DownloadTask;->getTaskId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/huawei/qrcode/logic/down/ThreadPoolManager;->getInstance()Lcom/huawei/qrcode/logic/down/ThreadPoolManager;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/qrcode/logic/down/ThreadPoolManager;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v4}, Lcom/huawei/qrcode/logic/down/DownloadTask;->getTaskId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDownloadTask(Ljava/lang/String;)Lcom/huawei/qrcode/logic/down/DownloadTask;
    .locals 2

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/qrcode/logic/down/StringUtil;->isEmpty(Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "DownloadManager getDownloadTask downloadTaskId is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadManager;->taskMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/qrcode/logic/down/DownloadTask;

    return-object v0
.end method

.method public sendMessage(Lcom/huawei/qrcode/logic/down/DownloadEntity;Lcom/huawei/qrcode/logic/down/IDownloadTaskListener;I)V
    .locals 2

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    :cond_0
    const-string v0, "DownloadManager DownloadEntity is null or listener is null , do not send message."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    return-void

    :cond_1
    sparse-switch p3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-interface {p2, p1}, Lcom/huawei/qrcode/logic/down/IDownloadTaskListener;->onDownloadStart(Lcom/huawei/qrcode/logic/down/DownloadEntity;)V

    const/4 v0, 0x0

    invoke-interface {p2, p1, v0}, Lcom/huawei/qrcode/logic/down/IDownloadTaskListener;->setProgress(Lcom/huawei/qrcode/logic/down/DownloadEntity;I)V

    goto :goto_0

    :sswitch_1
    const/16 v0, 0x64

    invoke-interface {p2, p1, v0}, Lcom/huawei/qrcode/logic/down/IDownloadTaskListener;->setProgress(Lcom/huawei/qrcode/logic/down/DownloadEntity;I)V

    invoke-interface {p2, p1}, Lcom/huawei/qrcode/logic/down/IDownloadTaskListener;->onDownloadFinish(Lcom/huawei/qrcode/logic/down/DownloadEntity;)V

    goto :goto_0

    :sswitch_2
    invoke-interface {p2, p1, p3}, Lcom/huawei/qrcode/logic/down/IDownloadTaskListener;->onDownloadFail(Lcom/huawei/qrcode/logic/down/DownloadEntity;I)V

    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x4e31 -> :sswitch_1
        0x4e32 -> :sswitch_0
        0x7541 -> :sswitch_2
    .end sparse-switch
.end method
