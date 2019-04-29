.class public Lcom/mopub/mobileads/VideoDownloader;
.super Ljava/lang/Object;
.source "VideoDownloader.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderTask;,
        Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderListener;
    }
.end annotation


# static fields
.field private static final MAX_VIDEO_SIZE:I = 0x1900000

.field private static final sDownloaderTasks:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderTask;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    sput-object v0, Lcom/mopub/mobileads/VideoDownloader;->sDownloaderTasks:Ljava/util/Deque;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000()Ljava/util/Deque;
    .locals 1

    .line 22
    sget-object v0, Lcom/mopub/mobileads/VideoDownloader;->sDownloaderTasks:Ljava/util/Deque;

    return-object v0
.end method

.method public static cache(Ljava/lang/String;Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderListener;)V
    .locals 3
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p1    # Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 35
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-nez p0, :cond_0

    const-string p0, "VideoDownloader attempted to cache video with null url."

    .line 38
    invoke-static {p0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 39
    invoke-interface {p1, v0}, Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderListener;->onComplete(Z)V

    return-void

    .line 43
    :cond_0
    new-instance v1, Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderTask;

    invoke-direct {v1, p1}, Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderTask;-><init>(Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderListener;)V

    const/4 v2, 0x1

    .line 45
    :try_start_0
    new-array v2, v2, [Ljava/lang/String;

    aput-object p0, v2, v0

    invoke-static {v1, v2}, Lcom/mopub/common/util/AsyncTasks;->safeExecuteOnExecutor(Landroid/os/AsyncTask;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 47
    :catch_0
    invoke-interface {p1, v0}, Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderListener;->onComplete(Z)V

    :goto_0
    return-void
.end method

.method public static cancelAllDownloaderTasks()V
    .locals 2

    .line 53
    sget-object v0, Lcom/mopub/mobileads/VideoDownloader;->sDownloaderTasks:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 54
    invoke-static {v1}, Lcom/mopub/mobileads/VideoDownloader;->cancelOneTask(Ljava/lang/ref/WeakReference;)Z

    goto :goto_0

    .line 57
    :cond_0
    sget-object v0, Lcom/mopub/mobileads/VideoDownloader;->sDownloaderTasks:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->clear()V

    return-void
.end method

.method public static cancelLastDownloadTask()V
    .locals 1

    .line 61
    sget-object v0, Lcom/mopub/mobileads/VideoDownloader;->sDownloaderTasks:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 65
    :cond_0
    sget-object v0, Lcom/mopub/mobileads/VideoDownloader;->sDownloaderTasks:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->peekLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    invoke-static {v0}, Lcom/mopub/mobileads/VideoDownloader;->cancelOneTask(Ljava/lang/ref/WeakReference;)Z

    .line 66
    sget-object v0, Lcom/mopub/mobileads/VideoDownloader;->sDownloaderTasks:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->removeLast()Ljava/lang/Object;

    return-void
.end method

.method private static cancelOneTask(Ljava/lang/ref/WeakReference;)Z
    .locals 1
    .param p0    # Ljava/lang/ref/WeakReference;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderTask;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    .line 81
    :cond_0
    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderTask;

    if-nez p0, :cond_1

    return v0

    :cond_1
    const/4 v0, 0x1

    .line 86
    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderTask;->cancel(Z)Z

    move-result p0

    return p0
.end method

.method public static clearDownloaderTasks()V
    .locals 1
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 182
    sget-object v0, Lcom/mopub/mobileads/VideoDownloader;->sDownloaderTasks:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->clear()V

    return-void
.end method

.method public static getDownloaderTasks()Ljava/util/Deque;
    .locals 1
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Deque<",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderTask;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 176
    sget-object v0, Lcom/mopub/mobileads/VideoDownloader;->sDownloaderTasks:Ljava/util/Deque;

    return-object v0
.end method
