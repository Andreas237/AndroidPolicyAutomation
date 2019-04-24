.class public Lcom/shopkick/app/overlays/other/OverlayImagePreloader;
.super Ljava/lang/Object;
.source "OverlayImagePreloader.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/overlays/other/OverlayImagePreloader$OverlayImagePreloaderListener;
    }
.end annotation


# instance fields
.field private doneFetching:Z

.field private imagePreloaderListenerWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/overlays/other/OverlayImagePreloader$OverlayImagePreloaderListener;",
            ">;"
        }
    .end annotation
.end field

.field private imagesFetched:I

.field private needsToFetch:Z

.field private overlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

.field private urlsToPreload:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/other/OverlayImagePreloader$OverlayImagePreloaderListener;)V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 30
    iput v0, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->imagesFetched:I

    .line 40
    iput-object p1, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->overlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    .line 41
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->preloadUrls:Ljava/util/List;

    iput-object p1, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->urlsToPreload:Ljava/util/List;

    if-eqz p2, :cond_0

    .line 44
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->imagePreloaderListenerWeakReference:Ljava/lang/ref/WeakReference;

    .line 46
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->urlsToPreload:Ljava/util/List;

    const/4 p2, 0x1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    move v0, p2

    :cond_1
    iput-boolean v0, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->needsToFetch:Z

    .line 47
    iget-boolean p1, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->needsToFetch:Z

    xor-int/2addr p1, p2

    iput-boolean p1, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->doneFetching:Z

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/overlays/other/OverlayImagePreloader;)Z
    .locals 0

    .line 24
    iget-boolean p0, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->doneFetching:Z

    return p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/overlays/other/OverlayImagePreloader;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->notifyError()V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/app/overlays/other/OverlayImagePreloader;)I
    .locals 0

    .line 24
    iget p0, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->imagesFetched:I

    return p0
.end method

.method static synthetic access$208(Lcom/shopkick/app/overlays/other/OverlayImagePreloader;)I
    .locals 2

    .line 24
    iget v0, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->imagesFetched:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->imagesFetched:I

    return v0
.end method

.method static synthetic access$300(Lcom/shopkick/app/overlays/other/OverlayImagePreloader;)Ljava/util/List;
    .locals 0

    .line 24
    iget-object p0, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->urlsToPreload:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/overlays/other/OverlayImagePreloader;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->notifySuccess()V

    return-void
.end method

.method private notifyError()V
    .locals 2

    const/4 v0, 0x1

    .line 113
    iput-boolean v0, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->doneFetching:Z

    .line 114
    iget-object v0, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->imagePreloaderListenerWeakReference:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 115
    iget-object v0, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->imagePreloaderListenerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader$OverlayImagePreloaderListener;

    if-eqz v0, :cond_0

    .line 117
    iget-object v1, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->overlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-interface {v0, v1}, Lcom/shopkick/app/overlays/other/OverlayImagePreloader$OverlayImagePreloaderListener;->onPreloadError(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    :cond_0
    return-void
.end method

.method private notifySuccess()V
    .locals 1

    const/4 v0, 0x1

    .line 102
    iput-boolean v0, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->doneFetching:Z

    .line 103
    iget-object v0, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->imagePreloaderListenerWeakReference:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 104
    iget-object v0, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->imagePreloaderListenerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader$OverlayImagePreloaderListener;

    if-eqz v0, :cond_0

    .line 106
    invoke-interface {v0}, Lcom/shopkick/app/overlays/other/OverlayImagePreloader$OverlayImagePreloaderListener;->onPreloadSuccess()V

    :cond_0
    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 0

    return-void
.end method

.method public doneLoading()Z
    .locals 1

    .line 54
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->doneFetching:Z

    return v0
.end method

.method public preload()V
    .locals 5

    .line 64
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->needsToFetch:Z

    if-nez v0, :cond_0

    return-void

    .line 72
    :cond_0
    invoke-static {}, Lcom/shopkick/app/application/SKApp;->getInstance()Lcom/shopkick/app/application/SKApp;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/shopkick/app/application/SKApp;->getInstance()Lcom/shopkick/app/application/SKApp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/application/SKApp;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 73
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->urlsToPreload:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 74
    invoke-static {v0}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/content/Context;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v3

    new-instance v4, Lcom/shopkick/app/overlays/other/OverlayImagePreloader$1;

    invoke-direct {v4, p0, v2}, Lcom/shopkick/app/overlays/other/OverlayImagePreloader$1;-><init>(Lcom/shopkick/app/overlays/other/OverlayImagePreloader;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v2

    .line 95
    invoke-virtual {v2}, Lcom/shopkick/app/util/GlideRequest;->submit()Lcom/bumptech/glide/request/FutureTarget;

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    .line 97
    iput-boolean v0, p0, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->needsToFetch:Z

    return-void
.end method
