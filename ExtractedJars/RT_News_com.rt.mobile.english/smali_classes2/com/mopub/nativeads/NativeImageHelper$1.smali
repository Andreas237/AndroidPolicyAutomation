.class final Lcom/mopub/nativeads/NativeImageHelper$1;
.super Ljava/lang/Object;
.source "NativeImageHelper.java"

# interfaces
.implements Lcom/mopub/volley/toolbox/ImageLoader$ImageListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mopub/nativeads/NativeImageHelper;->preCacheImages(Landroid/content/Context;Ljava/util/List;Lcom/mopub/nativeads/NativeImageHelper$ImageListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$anyFailures:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final synthetic val$imageCounter:Ljava/util/concurrent/atomic/AtomicInteger;

.field final synthetic val$imageListener:Lcom/mopub/nativeads/NativeImageHelper$ImageListener;


# direct methods
.method constructor <init>(Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/mopub/nativeads/NativeImageHelper$ImageListener;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/mopub/nativeads/NativeImageHelper$1;->val$imageCounter:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p2, p0, Lcom/mopub/nativeads/NativeImageHelper$1;->val$anyFailures:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p3, p0, Lcom/mopub/nativeads/NativeImageHelper$1;->val$imageListener:Lcom/mopub/nativeads/NativeImageHelper$ImageListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onErrorResponse(Lcom/mopub/volley/VolleyError;)V
    .locals 1

    const-string v0, "Failed to download a native ads image:"

    .line 69
    invoke-static {v0, p1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 70
    iget-object p1, p0, Lcom/mopub/nativeads/NativeImageHelper$1;->val$anyFailures:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result p1

    .line 71
    iget-object v0, p0, Lcom/mopub/nativeads/NativeImageHelper$1;->val$imageCounter:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    if-nez p1, :cond_0

    .line 73
    iget-object p1, p0, Lcom/mopub/nativeads/NativeImageHelper$1;->val$imageListener:Lcom/mopub/nativeads/NativeImageHelper$ImageListener;

    sget-object v0, Lcom/mopub/nativeads/NativeErrorCode;->IMAGE_DOWNLOAD_FAILURE:Lcom/mopub/nativeads/NativeErrorCode;

    invoke-interface {p1, v0}, Lcom/mopub/nativeads/NativeImageHelper$ImageListener;->onImagesFailedToCache(Lcom/mopub/nativeads/NativeErrorCode;)V

    :cond_0
    return-void
.end method

.method public onResponse(Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;Z)V
    .locals 0

    .line 59
    invoke-virtual {p1}, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 60
    iget-object p1, p0, Lcom/mopub/nativeads/NativeImageHelper$1;->val$imageCounter:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p1

    if-nez p1, :cond_0

    .line 61
    iget-object p1, p0, Lcom/mopub/nativeads/NativeImageHelper$1;->val$anyFailures:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-nez p1, :cond_0

    .line 62
    iget-object p1, p0, Lcom/mopub/nativeads/NativeImageHelper$1;->val$imageListener:Lcom/mopub/nativeads/NativeImageHelper$ImageListener;

    invoke-interface {p1}, Lcom/mopub/nativeads/NativeImageHelper$ImageListener;->onImagesCached()V

    :cond_0
    return-void
.end method
