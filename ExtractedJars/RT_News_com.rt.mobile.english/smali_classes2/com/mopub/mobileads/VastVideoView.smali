.class public Lcom/mopub/mobileads/VastVideoView;
.super Landroid/widget/VideoView;
.source "VastVideoView.java"


# static fields
.field private static final MAX_VIDEO_RETRIES:I = 0x1

.field private static final VIDEO_VIEW_FILE_PERMISSION_ERROR:I = -0x80000000


# instance fields
.field private mBlurLastVideoFrameTask:Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mMediaMetadataRetriever:Landroid/media/MediaMetadataRetriever;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mVideoRetries:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 36
    invoke-direct {p0, p1}, Landroid/widget/VideoView;-><init>(Landroid/content/Context;)V

    const-string v0, "context cannot be null"

    .line 37
    invoke-static {p1, v0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-virtual {p0}, Lcom/mopub/mobileads/VastVideoView;->createMediaMetadataRetriever()Landroid/media/MediaMetadataRetriever;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/mobileads/VastVideoView;->mMediaMetadataRetriever:Landroid/media/MediaMetadataRetriever;

    return-void
.end method


# virtual methods
.method createMediaMetadataRetriever()Landroid/media/MediaMetadataRetriever;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .line 127
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xa

    if-lt v0, v1, :cond_0

    .line 128
    new-instance v0, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v0}, Landroid/media/MediaMetadataRetriever;-><init>()V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method getBlurLastVideoFrameTask()Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 146
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoView;->mBlurLastVideoFrameTask:Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;

    return-object v0
.end method

.method getVideoRetries()I
    .locals 1
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 160
    iget v0, p0, Lcom/mopub/mobileads/VastVideoView;->mVideoRetries:I

    return v0
.end method

.method public onDestroy()V
    .locals 2

    .line 71
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoView;->mBlurLastVideoFrameTask:Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoView;->mBlurLastVideoFrameTask:Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;

    invoke-virtual {v0}, Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;->getStatus()Landroid/os/AsyncTask$Status;

    move-result-object v0

    sget-object v1, Landroid/os/AsyncTask$Status;->FINISHED:Landroid/os/AsyncTask$Status;

    if-eq v0, v1, :cond_0

    .line 73
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoView;->mBlurLastVideoFrameTask:Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;->cancel(Z)Z

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 1

    const/4 v0, 0x0

    .line 121
    iput v0, p0, Lcom/mopub/mobileads/VastVideoView;->mVideoRetries:I

    return-void
.end method

.method public prepareBlurredLastVideoFrame(Landroid/widget/ImageView;Ljava/lang/String;)V
    .locals 3
    .param p1    # Landroid/widget/ImageView;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 51
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoView;->mMediaMetadataRetriever:Landroid/media/MediaMetadataRetriever;

    if-eqz v0, :cond_0

    .line 52
    new-instance v0, Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;

    iget-object v1, p0, Lcom/mopub/mobileads/VastVideoView;->mMediaMetadataRetriever:Landroid/media/MediaMetadataRetriever;

    invoke-virtual {p0}, Lcom/mopub/mobileads/VastVideoView;->getDuration()I

    move-result v2

    invoke-direct {v0, v1, p1, v2}, Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;-><init>(Landroid/media/MediaMetadataRetriever;Landroid/widget/ImageView;I)V

    iput-object v0, p0, Lcom/mopub/mobileads/VastVideoView;->mBlurLastVideoFrameTask:Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;

    .line 56
    :try_start_0
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoView;->mBlurLastVideoFrameTask:Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    invoke-static {p1, v0}, Lcom/mopub/common/util/AsyncTasks;->safeExecuteOnExecutor(Landroid/os/AsyncTask;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "Failed to blur last video frame"

    .line 61
    invoke-static {p2, p1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method

.method retryMediaPlayer(Landroid/media/MediaPlayer;IILjava/lang/String;)Z
    .locals 3
    .param p4    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 85
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x10

    if-ge v0, v2, :cond_0

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    const/high16 p2, -0x80000000

    if-ne p3, p2, :cond_0

    iget p2, p0, Lcom/mopub/mobileads/VastVideoView;->mVideoRetries:I

    if-ge p2, v0, :cond_0

    const/4 p2, 0x0

    .line 92
    :try_start_0
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->reset()V

    .line 93
    new-instance p3, Ljava/io/File;

    invoke-direct {p3, p4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 94
    new-instance p4, Ljava/io/FileInputStream;

    invoke-direct {p4, p3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 95
    :try_start_1
    invoke-virtual {p4}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;)V

    .line 102
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->prepareAsync()V

    .line 103
    invoke-virtual {p0}, Lcom/mopub/mobileads/VastVideoView;->start()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    invoke-static {p4}, Lcom/mopub/common/util/Streams;->closeStream(Ljava/io/Closeable;)V

    .line 109
    iget p1, p0, Lcom/mopub/mobileads/VastVideoView;->mVideoRetries:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/mopub/mobileads/VastVideoView;->mVideoRetries:I

    return v0

    :catchall_0
    move-exception p1

    move-object p2, p4

    goto :goto_0

    :catch_0
    move-object p2, p4

    goto :goto_1

    :catchall_1
    move-exception p1

    .line 108
    :goto_0
    invoke-static {p2}, Lcom/mopub/common/util/Streams;->closeStream(Ljava/io/Closeable;)V

    .line 109
    iget p2, p0, Lcom/mopub/mobileads/VastVideoView;->mVideoRetries:I

    add-int/2addr p2, v0

    iput p2, p0, Lcom/mopub/mobileads/VastVideoView;->mVideoRetries:I

    throw p1

    .line 108
    :catch_1
    :goto_1
    invoke-static {p2}, Lcom/mopub/common/util/Streams;->closeStream(Ljava/io/Closeable;)V

    .line 109
    iget p1, p0, Lcom/mopub/mobileads/VastVideoView;->mVideoRetries:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/mopub/mobileads/VastVideoView;->mVideoRetries:I

    return v1

    :cond_0
    return v1
.end method

.method setBlurLastVideoFrameTask(Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;)V
    .locals 0
    .param p1    # Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 153
    iput-object p1, p0, Lcom/mopub/mobileads/VastVideoView;->mBlurLastVideoFrameTask:Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;

    return-void
.end method

.method setMediaMetadataRetriever(Landroid/media/MediaMetadataRetriever;)V
    .locals 0
    .param p1    # Landroid/media/MediaMetadataRetriever;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 138
    iput-object p1, p0, Lcom/mopub/mobileads/VastVideoView;->mMediaMetadataRetriever:Landroid/media/MediaMetadataRetriever;

    return-void
.end method
