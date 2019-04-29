.class public Lcom/mopub/mobileads/VastManager;
.super Ljava/lang/Object;
.source "VastManager.java"

# interfaces
.implements Lcom/mopub/mobileads/VastXmlManagerAggregator$VastXmlManagerAggregatorListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mopub/mobileads/VastManager$VastManagerListener;
    }
.end annotation


# instance fields
.field private mDspCreativeId:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mScreenAreaDp:I

.field private mScreenAspectRatio:D

.field private final mShouldPreCacheVideo:Z

.field private mVastManagerListener:Lcom/mopub/mobileads/VastManager$VastManagerListener;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mVastXmlManagerAggregator:Lcom/mopub/mobileads/VastXmlManagerAggregator;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    invoke-direct {p0, p1}, Lcom/mopub/mobileads/VastManager;->initializeScreenDimensions(Landroid/content/Context;)V

    .line 50
    iput-boolean p2, p0, Lcom/mopub/mobileads/VastManager;->mShouldPreCacheVideo:Z

    return-void
.end method

.method static synthetic access$000(Lcom/mopub/mobileads/VastManager;Lcom/mopub/mobileads/VastVideoConfig;)Z
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Lcom/mopub/mobileads/VastManager;->updateDiskMediaFileUrl(Lcom/mopub/mobileads/VastVideoConfig;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$100(Lcom/mopub/mobileads/VastManager;)Lcom/mopub/mobileads/VastManager$VastManagerListener;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/mopub/mobileads/VastManager;->mVastManagerListener:Lcom/mopub/mobileads/VastManager$VastManagerListener;

    return-object p0
.end method

.method private initializeScreenDimensions(Landroid/content/Context;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "context cannot be null"

    .line 152
    invoke-static {p1, v0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "window"

    .line 154
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 155
    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v1

    .line 156
    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v0

    .line 159
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    const/4 v2, 0x0

    cmpg-float v2, p1, v2

    if-gtz v2, :cond_0

    const/high16 p1, 0x3f800000    # 1.0f

    .line 165
    :cond_0
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 166
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    int-to-double v3, v2

    int-to-double v5, v0

    div-double/2addr v3, v5

    .line 167
    iput-wide v3, p0, Lcom/mopub/mobileads/VastManager;->mScreenAspectRatio:D

    int-to-float v1, v2

    div-float/2addr v1, p1

    int-to-float v0, v0

    div-float/2addr v0, p1

    mul-float/2addr v1, v0

    float-to-int p1, v1

    .line 168
    iput p1, p0, Lcom/mopub/mobileads/VastManager;->mScreenAreaDp:I

    return-void
.end method

.method private updateDiskMediaFileUrl(Lcom/mopub/mobileads/VastVideoConfig;)Z
    .locals 2
    .param p1    # Lcom/mopub/mobileads/VastVideoConfig;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "vastVideoConfig cannot be null"

    .line 140
    invoke-static {p1, v0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    invoke-virtual {p1}, Lcom/mopub/mobileads/VastVideoConfig;->getNetworkMediaFileUrl()Ljava/lang/String;

    move-result-object v0

    .line 143
    invoke-static {v0}, Lcom/mopub/common/CacheService;->containsKeyDiskCache(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 144
    invoke-static {v0}, Lcom/mopub/common/CacheService;->getFilePathDiskCache(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 145
    invoke-virtual {p1, v0}, Lcom/mopub/mobileads/VastVideoConfig;->setDiskMediaFileUrl(Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public cancel()V
    .locals 2

    .line 86
    iget-object v0, p0, Lcom/mopub/mobileads/VastManager;->mVastXmlManagerAggregator:Lcom/mopub/mobileads/VastXmlManagerAggregator;

    if-eqz v0, :cond_0

    .line 87
    iget-object v0, p0, Lcom/mopub/mobileads/VastManager;->mVastXmlManagerAggregator:Lcom/mopub/mobileads/VastXmlManagerAggregator;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/VastXmlManagerAggregator;->cancel(Z)Z

    const/4 v0, 0x0

    .line 88
    iput-object v0, p0, Lcom/mopub/mobileads/VastManager;->mVastXmlManagerAggregator:Lcom/mopub/mobileads/VastXmlManagerAggregator;

    :cond_0
    return-void
.end method

.method getScreenAreaDp()I
    .locals 1
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 174
    iget v0, p0, Lcom/mopub/mobileads/VastManager;->mScreenAreaDp:I

    return v0
.end method

.method getScreenAspectRatio()D
    .locals 2
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 180
    iget-wide v0, p0, Lcom/mopub/mobileads/VastManager;->mScreenAspectRatio:D

    return-wide v0
.end method

.method public onAggregationComplete(Lcom/mopub/mobileads/VastVideoConfig;)V
    .locals 1
    .param p1    # Lcom/mopub/mobileads/VastVideoConfig;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 94
    iget-object v0, p0, Lcom/mopub/mobileads/VastManager;->mVastManagerListener:Lcom/mopub/mobileads/VastManager$VastManagerListener;

    if-nez v0, :cond_0

    .line 95
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "mVastManagerListener cannot be null here. Did you call prepareVastVideoConfiguration()?"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    if-nez p1, :cond_1

    .line 101
    iget-object p1, p0, Lcom/mopub/mobileads/VastManager;->mVastManagerListener:Lcom/mopub/mobileads/VastManager$VastManagerListener;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/mopub/mobileads/VastManager$VastManagerListener;->onVastVideoConfigurationPrepared(Lcom/mopub/mobileads/VastVideoConfig;)V

    return-void

    .line 105
    :cond_1
    iget-object v0, p0, Lcom/mopub/mobileads/VastManager;->mDspCreativeId:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 106
    iget-object v0, p0, Lcom/mopub/mobileads/VastManager;->mDspCreativeId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/mopub/mobileads/VastVideoConfig;->setDspCreativeId(Ljava/lang/String;)V

    .line 110
    :cond_2
    iget-boolean v0, p0, Lcom/mopub/mobileads/VastManager;->mShouldPreCacheVideo:Z

    if-eqz v0, :cond_4

    invoke-direct {p0, p1}, Lcom/mopub/mobileads/VastManager;->updateDiskMediaFileUrl(Lcom/mopub/mobileads/VastVideoConfig;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    .line 115
    :cond_3
    new-instance v0, Lcom/mopub/mobileads/VastManager$1;

    invoke-direct {v0, p0, p1}, Lcom/mopub/mobileads/VastManager$1;-><init>(Lcom/mopub/mobileads/VastManager;Lcom/mopub/mobileads/VastVideoConfig;)V

    .line 127
    invoke-virtual {p1}, Lcom/mopub/mobileads/VastVideoConfig;->getNetworkMediaFileUrl()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lcom/mopub/mobileads/VideoDownloader;->cache(Ljava/lang/String;Lcom/mopub/mobileads/VideoDownloader$VideoDownloaderListener;)V

    return-void

    .line 111
    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/mopub/mobileads/VastManager;->mVastManagerListener:Lcom/mopub/mobileads/VastManager$VastManagerListener;

    invoke-interface {v0, p1}, Lcom/mopub/mobileads/VastManager$VastManagerListener;->onVastVideoConfigurationPrepared(Lcom/mopub/mobileads/VastVideoConfig;)V

    return-void
.end method

.method public prepareVastVideoConfiguration(Ljava/lang/String;Lcom/mopub/mobileads/VastManager$VastManagerListener;Ljava/lang/String;Landroid/content/Context;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/mopub/mobileads/VastManager$VastManagerListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "vastManagerListener cannot be null"

    .line 64
    invoke-static {p2, v0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context cannot be null"

    .line 65
    invoke-static {p4, v0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    iget-object v0, p0, Lcom/mopub/mobileads/VastManager;->mVastXmlManagerAggregator:Lcom/mopub/mobileads/VastXmlManagerAggregator;

    if-nez v0, :cond_0

    .line 68
    iput-object p2, p0, Lcom/mopub/mobileads/VastManager;->mVastManagerListener:Lcom/mopub/mobileads/VastManager$VastManagerListener;

    .line 69
    new-instance p2, Lcom/mopub/mobileads/VastXmlManagerAggregator;

    iget-wide v3, p0, Lcom/mopub/mobileads/VastManager;->mScreenAspectRatio:D

    iget v5, p0, Lcom/mopub/mobileads/VastManager;->mScreenAreaDp:I

    invoke-virtual {p4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    move-object v1, p2

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lcom/mopub/mobileads/VastXmlManagerAggregator;-><init>(Lcom/mopub/mobileads/VastXmlManagerAggregator$VastXmlManagerAggregatorListener;DILandroid/content/Context;)V

    iput-object p2, p0, Lcom/mopub/mobileads/VastManager;->mVastXmlManagerAggregator:Lcom/mopub/mobileads/VastXmlManagerAggregator;

    .line 71
    iput-object p3, p0, Lcom/mopub/mobileads/VastManager;->mDspCreativeId:Ljava/lang/String;

    .line 74
    :try_start_0
    iget-object p2, p0, Lcom/mopub/mobileads/VastManager;->mVastXmlManagerAggregator:Lcom/mopub/mobileads/VastXmlManagerAggregator;

    const/4 p3, 0x1

    new-array p3, p3, [Ljava/lang/String;

    const/4 p4, 0x0

    aput-object p1, p3, p4

    invoke-static {p2, p3}, Lcom/mopub/common/util/AsyncTasks;->safeExecuteOnExecutor(Landroid/os/AsyncTask;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "Failed to aggregate vast xml"

    .line 76
    invoke-static {p2, p1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 77
    iget-object p1, p0, Lcom/mopub/mobileads/VastManager;->mVastManagerListener:Lcom/mopub/mobileads/VastManager$VastManagerListener;

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Lcom/mopub/mobileads/VastManager$VastManagerListener;->onVastVideoConfigurationPrepared(Lcom/mopub/mobileads/VastVideoConfig;)V

    :cond_0
    :goto_0
    return-void
.end method
