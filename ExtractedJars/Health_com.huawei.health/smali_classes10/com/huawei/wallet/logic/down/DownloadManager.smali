.class public final Lcom/huawei/wallet/logic/down/DownloadManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/huawei/wallet/logic/down/DownloadManager;

.field private static final d:[B


# instance fields
.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lcom/huawei/wallet/logic/down/DownloadTask;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 36
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/wallet/logic/down/DownloadManager;->d:[B

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ljava/util/HashMap;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadManager;->c:Ljava/util/Map;

    .line 32
    return-void
.end method

.method public static c()Lcom/huawei/wallet/logic/down/DownloadManager;
    .locals 4

    .line 45
    sget-object v2, Lcom/huawei/wallet/logic/down/DownloadManager;->d:[B

    monitor-enter v2

    .line 46
    :try_start_0
    sget-object v0, Lcom/huawei/wallet/logic/down/DownloadManager;->a:Lcom/huawei/wallet/logic/down/DownloadManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 47
    new-instance v0, Lcom/huawei/wallet/logic/down/DownloadManager;

    invoke-direct {v0}, Lcom/huawei/wallet/logic/down/DownloadManager;-><init>()V

    sput-object v0, Lcom/huawei/wallet/logic/down/DownloadManager;->a:Lcom/huawei/wallet/logic/down/DownloadManager;

    .line 49
    :cond_0
    sget-object v0, Lcom/huawei/wallet/logic/down/DownloadManager;->a:Lcom/huawei/wallet/logic/down/DownloadManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 50
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public b(Lcom/huawei/wallet/logic/down/DownloadEntity;Lcom/huawei/wallet/logic/down/IDownloadTaskListener;I)V
    .locals 2

    .line 79
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 81
    :cond_0
    const-string v0, "DownloadManager DownloadEntity is null or listener is null , do not send message."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V

    .line 82
    return-void

    .line 86
    :cond_1
    sparse-switch p3, :sswitch_data_0

    goto :goto_0

    .line 91
    :sswitch_0
    invoke-interface {p2, p1}, Lcom/huawei/wallet/logic/down/IDownloadTaskListener;->e(Lcom/huawei/wallet/logic/down/DownloadEntity;)V

    .line 92
    const/4 v0, 0x0

    invoke-interface {p2, p1, v0}, Lcom/huawei/wallet/logic/down/IDownloadTaskListener;->a(Lcom/huawei/wallet/logic/down/DownloadEntity;I)V

    .line 93
    goto :goto_0

    .line 98
    :sswitch_1
    const/16 v0, 0x64

    invoke-interface {p2, p1, v0}, Lcom/huawei/wallet/logic/down/IDownloadTaskListener;->a(Lcom/huawei/wallet/logic/down/DownloadEntity;I)V

    .line 99
    invoke-interface {p2, p1}, Lcom/huawei/wallet/logic/down/IDownloadTaskListener;->a(Lcom/huawei/wallet/logic/down/DownloadEntity;)V

    .line 100
    goto :goto_0

    .line 105
    :sswitch_2
    invoke-interface {p2, p1, p3}, Lcom/huawei/wallet/logic/down/IDownloadTaskListener;->c(Lcom/huawei/wallet/logic/down/DownloadEntity;I)V

    .line 106
    .line 111
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x4e31 -> :sswitch_1
        0x4e32 -> :sswitch_0
        0x7541 -> :sswitch_2
    .end sparse-switch
.end method

.method public e(Ljava/lang/String;Lcom/huawei/wallet/logic/down/IDownloadTaskListener;JJ)Ljava/lang/String;
    .locals 10

    .line 61
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

    move-result-object v7

    .line 62
    new-instance v0, Lcom/huawei/wallet/logic/down/DownloadEntity;

    move-object v1, p1

    move-object v2, v7

    move-wide v3, p3

    move-wide v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/huawei/wallet/logic/down/DownloadEntity;-><init>(Ljava/lang/String;Ljava/lang/String;JJ)V

    move-object v8, v0

    .line 63
    new-instance v9, Lcom/huawei/wallet/logic/down/DownloadTask;

    invoke-direct {v9, v8, p2}, Lcom/huawei/wallet/logic/down/DownloadTask;-><init>(Lcom/huawei/wallet/logic/down/DownloadEntity;Lcom/huawei/wallet/logic/down/IDownloadTaskListener;)V

    .line 64
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadManager;->c:Ljava/util/Map;

    invoke-virtual {v9}, Lcom/huawei/wallet/logic/down/DownloadTask;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    invoke-static {}, Lcom/huawei/wallet/logic/down/ThreadPoolManager;->d()Lcom/huawei/wallet/logic/down/ThreadPoolManager;

    move-result-object v0

    invoke-virtual {v0, v9}, Lcom/huawei/wallet/logic/down/ThreadPoolManager;->c(Ljava/lang/Runnable;)V

    .line 66
    invoke-virtual {v9}, Lcom/huawei/wallet/logic/down/DownloadTask;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 3

    .line 120
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/DownloadManager;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/wallet/logic/down/DownloadTask;

    .line 121
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 123
    invoke-virtual {v2}, Lcom/huawei/wallet/logic/down/DownloadTask;->a()Landroid/os/Handler;

    move-result-object v0

    const v1, 0xc351

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 124
    invoke-virtual {v2}, Lcom/huawei/wallet/logic/down/DownloadTask;->a()Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 125
    invoke-virtual {v2}, Lcom/huawei/wallet/logic/down/DownloadTask;->b()V

    goto :goto_0

    .line 129
    :cond_0
    const-string v0, "DownloadManager cancelDownloadTask task is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V

    .line 131
    :goto_0
    return-void
.end method
