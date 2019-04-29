.class Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderTask;
.super Landroid/os/AsyncTask;
.source "VideoDownloader.java"


# annotations
.annotation build Lcom/mopub/common/VisibleForTesting;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/mobileads/VideoDownloader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "VideoDownloaderTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field private final mListener:Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderListener;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mWeakSelf:Ljava/lang/ref/WeakReference;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderTask;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderListener;)V
    .locals 1
    .param p1    # Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .line 95
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 96
    iput-object p1, p0, Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderTask;->mListener:Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderListener;

    .line 97
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderTask;->mWeakSelf:Ljava/lang/ref/WeakReference;

    .line 98
    invoke-static {}, Lcom/mopub/mobileads/VideoDownloader;->access$000()Ljava/util/Deque;

    move-result-object p1

    iget-object v0, p0, Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderTask;->mWeakSelf:Ljava/lang/ref/WeakReference;

    invoke-interface {p1, v0}, Ljava/util/Deque;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 6

    const/4 v0, 0x0

    if-eqz p1, :cond_9

    .line 103
    array-length v1, p1

    if-eqz v1, :cond_9

    aget-object v1, p1, v0

    if-nez v1, :cond_0

    goto/16 :goto_3

    .line 108
    :cond_0
    aget-object p1, p1, v0

    const/4 v1, 0x0

    .line 112
    :try_start_0
    invoke-static {p1}, Lcom/mopub/common/MoPubHttpUrlConnection;->getHttpUrlConnection(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 113
    :try_start_1
    new-instance v3, Ljava/io/BufferedInputStream;

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 116
    :try_start_2
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v1

    const/16 v4, 0xc8

    if-lt v1, v4, :cond_5

    const/16 v4, 0x12c

    if-lt v1, v4, :cond_1

    goto :goto_0

    .line 125
    :cond_1
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getContentLength()I

    move-result v1

    const/high16 v4, 0x1900000

    if-le v1, v4, :cond_3

    const-string p1, "VideoDownloader encountered video larger than disk cap. (%d bytes / %d maximum)."

    const/4 v5, 0x2

    .line 127
    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v5, v0

    const/4 v1, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v5, v1

    invoke-static {p1, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 132
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 141
    invoke-static {v3}, Lcom/mopub/common/util/Streams;->closeStream(Ljava/io/Closeable;)V

    if-eqz v2, :cond_2

    .line 143
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_2
    return-object p1

    .line 135
    :cond_3
    :try_start_3
    invoke-static {p1, v3}, Lcom/mopub/common/CacheService;->putToDiskCache(Ljava/lang/String;Ljava/io/InputStream;)Z

    move-result p1

    .line 136
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 141
    invoke-static {v3}, Lcom/mopub/common/util/Streams;->closeStream(Ljava/io/Closeable;)V

    if-eqz v2, :cond_4

    .line 143
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_4
    return-object p1

    .line 119
    :cond_5
    :goto_0
    :try_start_4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "VideoDownloader encountered unexpected statusCode: "

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 121
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 141
    invoke-static {v3}, Lcom/mopub/common/util/Streams;->closeStream(Ljava/io/Closeable;)V

    if-eqz v2, :cond_6

    .line 143
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_6
    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    move-object v1, v3

    goto :goto_1

    :catchall_1
    move-exception p1

    move-object v3, v1

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_1

    :catchall_2
    move-exception p1

    move-object v2, v1

    move-object v3, v2

    goto :goto_2

    :catch_2
    move-exception p1

    move-object v2, v1

    :goto_1
    :try_start_5
    const-string v3, "VideoDownloader task threw an internal exception."

    .line 138
    invoke-static {v3, p1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 139
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 141
    invoke-static {v1}, Lcom/mopub/common/util/Streams;->closeStream(Ljava/io/Closeable;)V

    if-eqz v2, :cond_7

    .line 143
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_7
    return-object p1

    .line 141
    :goto_2
    invoke-static {v3}, Lcom/mopub/common/util/Streams;->closeStream(Ljava/io/Closeable;)V

    if-eqz v2, :cond_8

    .line 143
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_8
    throw p1

    :cond_9
    :goto_3
    const-string p1, "VideoDownloader task tried to execute null or empty url."

    .line 104
    invoke-static {p1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 105
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 89
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderTask;->doInBackground([Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method protected onCancelled()V
    .locals 2

    const-string v0, "VideoDownloader task was cancelled."

    .line 167
    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 168
    invoke-static {}, Lcom/mopub/mobileads/VideoDownloader;->access$000()Ljava/util/Deque;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderTask;->mWeakSelf:Ljava/lang/ref/WeakReference;

    invoke-interface {v0, v1}, Ljava/util/Deque;->remove(Ljava/lang/Object;)Z

    .line 169
    iget-object v0, p0, Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderTask;->mListener:Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderListener;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderListener;->onComplete(Z)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/Boolean;)V
    .locals 2

    .line 150
    invoke-virtual {p0}, Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderTask;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 151
    invoke-virtual {p0}, Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderTask;->onCancelled()V

    return-void

    .line 155
    :cond_0
    invoke-static {}, Lcom/mopub/mobileads/VideoDownloader;->access$000()Ljava/util/Deque;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderTask;->mWeakSelf:Ljava/lang/ref/WeakReference;

    invoke-interface {v0, v1}, Ljava/util/Deque;->remove(Ljava/lang/Object;)Z

    if-nez p1, :cond_1

    .line 158
    iget-object p1, p0, Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderTask;->mListener:Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderListener;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderListener;->onComplete(Z)V

    return-void

    .line 162
    :cond_1
    iget-object v0, p0, Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderTask;->mListener:Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderListener;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-interface {v0, p1}, Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderListener;->onComplete(Z)V

    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 89
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderTask;->onPostExecute(Ljava/lang/Boolean;)V

    return-void
.end method
