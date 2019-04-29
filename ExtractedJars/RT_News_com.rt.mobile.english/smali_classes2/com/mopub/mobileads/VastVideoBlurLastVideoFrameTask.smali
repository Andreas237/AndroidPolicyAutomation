.class public Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;
.super Landroid/os/AsyncTask;
.source "VastVideoBlurLastVideoFrameTask.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# static fields
.field private static final MICROSECONDS_PER_MILLISECOND:I = 0x3e8

.field private static final OFFSET_IN_MICROSECONDS:I = 0x30d40


# instance fields
.field private mBlurredLastVideoFrame:Landroid/graphics/Bitmap;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final mBlurredLastVideoFrameImageView:Landroid/widget/ImageView;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private mLastVideoFrame:Landroid/graphics/Bitmap;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final mMediaMetadataRetriever:Landroid/media/MediaMetadataRetriever;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private mVideoDuration:I


# direct methods
.method public constructor <init>(Landroid/media/MediaMetadataRetriever;Landroid/widget/ImageView;I)V
    .locals 0
    .param p1    # Landroid/media/MediaMetadataRetriever;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/widget/ImageView;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 33
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;->mMediaMetadataRetriever:Landroid/media/MediaMetadataRetriever;

    .line 35
    iput-object p2, p0, Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;->mBlurredLastVideoFrameImageView:Landroid/widget/ImageView;

    .line 36
    iput p3, p0, Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;->mVideoDuration:I

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 4

    .line 41
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0xa

    if-lt v0, v2, :cond_3

    if-eqz p1, :cond_2

    .line 42
    array-length v0, p1

    if-eqz v0, :cond_2

    aget-object v0, p1, v1

    if-nez v0, :cond_0

    goto :goto_0

    .line 47
    :cond_0
    :try_start_0
    aget-object p1, p1, v1

    .line 49
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;->mMediaMetadataRetriever:Landroid/media/MediaMetadataRetriever;

    invoke-virtual {v0, p1}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 54
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;->mMediaMetadataRetriever:Landroid/media/MediaMetadataRetriever;

    iget v0, p0, Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;->mVideoDuration:I

    mul-int/lit16 v0, v0, 0x3e8

    const v2, 0x30d40

    sub-int/2addr v0, v2

    int-to-long v2, v0

    const/4 v0, 0x3

    invoke-virtual {p1, v2, v3, v0}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(JI)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;->mLastVideoFrame:Landroid/graphics/Bitmap;

    .line 58
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;->mLastVideoFrame:Landroid/graphics/Bitmap;

    if-nez p1, :cond_1

    .line 59
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 62
    :cond_1
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;->mLastVideoFrame:Landroid/graphics/Bitmap;

    const/4 v0, 0x4

    invoke-static {p1, v0}, Lcom/mopub/common/util/ImageUtils;->applyFastGaussianBlurToBitmap(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;->mBlurredLastVideoFrame:Landroid/graphics/Bitmap;

    const/4 p1, 0x1

    .line 65
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const-string v0, "Failed to blur last video frame"

    .line 67
    invoke-static {v0, p1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 68
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 43
    :cond_2
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 72
    :cond_3
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 16
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;->doInBackground([Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method getBlurredLastVideoFrame()Landroid/graphics/Bitmap;
    .locals 1
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 98
    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;->mBlurredLastVideoFrame:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method protected onCancelled()V
    .locals 1

    const-string v0, "VastVideoBlurLastVideoFrameTask was cancelled."

    .line 91
    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/Boolean;)V
    .locals 1

    .line 77
    invoke-virtual {p0}, Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 78
    invoke-virtual {p0}, Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;->onCancelled()V

    return-void

    :cond_0
    if-eqz p1, :cond_1

    .line 82
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 83
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;->mBlurredLastVideoFrameImageView:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;->mBlurredLastVideoFrame:Landroid/graphics/Bitmap;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 84
    iget-object p1, p0, Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;->mBlurredLastVideoFrameImageView:Landroid/widget/ImageView;

    const/16 v0, 0x64

    invoke-static {p1, v0}, Lcom/mopub/common/util/ImageUtils;->setImageViewAlpha(Landroid/widget/ImageView;I)V

    :cond_1
    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 16
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/mopub/mobileads/VastVideoBlurLastVideoFrameTask;->onPostExecute(Ljava/lang/Boolean;)V

    return-void
.end method
