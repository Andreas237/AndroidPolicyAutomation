.class public Lcom/mopub/mobileads/VastXmlManagerAggregator;
.super Landroid/os/AsyncTask;
.source "VastXmlManagerAggregator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mopub/mobileads/VastXmlManagerAggregator$CompanionOrientation;,
        Lcom/mopub/mobileads/VastXmlManagerAggregator$VastXmlManagerAggregatorListener;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Lcom/mopub/mobileads/VastVideoConfig;",
        ">;"
    }
.end annotation


# static fields
.field public static final ADS_BY_AD_SLOT_ID:Ljava/lang/String; = "adsBy"

.field private static final AREA_WEIGHT:D = 30.0

.field private static final ASPECT_RATIO_WEIGHT:D = 70.0

.field static final MAX_TIMES_TO_FOLLOW_VAST_REDIRECT:I = 0xa

.field private static final MINIMUM_COMPANION_AD_HEIGHT:I = 0xfa

.field private static final MINIMUM_COMPANION_AD_WIDTH:I = 0x12c

.field private static final MOPUB:Ljava/lang/String; = "MoPub"

.field public static final SOCIAL_ACTIONS_AD_SLOT_ID:Ljava/lang/String; = "socialActions"

.field private static final VIDEO_MIME_TYPES:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final mContext:Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mScreenAreaDp:I

.field private final mScreenAspectRatio:D

.field private mTimesFollowedVastRedirect:I

.field private final mVastXmlManagerAggregatorListener:Ljava/lang/ref/WeakReference;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/mopub/mobileads/VastXmlManagerAggregator$VastXmlManagerAggregatorListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x2

    .line 75
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "video/mp4"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "video/3gpp"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/mopub/mobileads/VastXmlManagerAggregator;->VIDEO_MIME_TYPES:Ljava/util/List;

    return-void
.end method

.method constructor <init>(Lcom/mopub/mobileads/VastXmlManagerAggregator$VastXmlManagerAggregatorListener;DILandroid/content/Context;)V
    .locals 1
    .param p1    # Lcom/mopub/mobileads/VastXmlManagerAggregator$VastXmlManagerAggregatorListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 95
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 97
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 98
    invoke-static {p5}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 99
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/mopub/mobileads/VastXmlManagerAggregator;->mVastXmlManagerAggregatorListener:Ljava/lang/ref/WeakReference;

    .line 101
    iput-wide p2, p0, Lcom/mopub/mobileads/VastXmlManagerAggregator;->mScreenAspectRatio:D

    .line 102
    iput p4, p0, Lcom/mopub/mobileads/VastXmlManagerAggregator;->mScreenAreaDp:I

    .line 103
    invoke-virtual {p5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/mobileads/VastXmlManagerAggregator;->mContext:Landroid/content/Context;

    return-void
.end method

.method private calculateFitness(II)D
    .locals 4

    int-to-double v0, p1

    int-to-double v2, p2

    div-double/2addr v0, v2

    mul-int/2addr p1, p2

    .line 768
    iget-wide v2, p0, Lcom/mopub/mobileads/VastXmlManagerAggregator;->mScreenAspectRatio:D

    div-double/2addr v0, v2

    int-to-double p1, p1

    .line 769
    iget v2, p0, Lcom/mopub/mobileads/VastXmlManagerAggregator;->mScreenAreaDp:I

    int-to-double v2, v2

    div-double/2addr p1, v2

    .line 770
    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v2, 0x4051800000000000L    # 70.0

    mul-double/2addr v2, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->log(D)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Math;->abs(D)D

    move-result-wide p1

    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    mul-double/2addr v0, p1

    add-double/2addr v2, v0

    return-wide v2
.end method

.method private evaluateInLineXmlManager(Lcom/mopub/mobileads/VastInLineXmlManager;Ljava/util/List;)Lcom/mopub/mobileads/VastVideoConfig;
    .locals 4
    .param p1    # Lcom/mopub/mobileads/VastInLineXmlManager;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mopub/mobileads/VastInLineXmlManager;",
            "Ljava/util/List<",
            "Lcom/mopub/mobileads/VastTracker;",
            ">;)",
            "Lcom/mopub/mobileads/VastVideoConfig;"
        }
    .end annotation

    .line 299
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 300
    invoke-static {p2}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 302
    invoke-virtual {p1}, Lcom/mopub/mobileads/VastInLineXmlManager;->getLinearXmlManagers()Ljava/util/List;

    move-result-object v0

    .line 305
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mopub/mobileads/VastLinearXmlManager;

    .line 306
    invoke-virtual {v1}, Lcom/mopub/mobileads/VastLinearXmlManager;->getMediaXmlManagers()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/mopub/mobileads/VastXmlManagerAggregator;->getBestMediaFileUrl(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 309
    new-instance v0, Lcom/mopub/mobileads/VastVideoConfig;

    invoke-direct {v0}, Lcom/mopub/mobileads/VastVideoConfig;-><init>()V

    .line 310
    invoke-virtual {p1}, Lcom/mopub/mobileads/VastInLineXmlManager;->getImpressionTrackers()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/mopub/mobileads/VastVideoConfig;->addImpressionTrackers(Ljava/util/List;)V

    .line 311
    invoke-direct {p0, v1, v0}, Lcom/mopub/mobileads/VastXmlManagerAggregator;->populateLinearTrackersAndIcon(Lcom/mopub/mobileads/VastLinearXmlManager;Lcom/mopub/mobileads/VastVideoConfig;)V

    .line 316
    invoke-virtual {v1}, Lcom/mopub/mobileads/VastLinearXmlManager;->getClickThroughUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/VastVideoConfig;->setClickThroughUrl(Ljava/lang/String;)V

    .line 317
    invoke-virtual {v0, v2}, Lcom/mopub/mobileads/VastVideoConfig;->setNetworkMediaFileUrl(Ljava/lang/String;)V

    .line 319
    invoke-virtual {p1}, Lcom/mopub/mobileads/VastInLineXmlManager;->getCompanionAdXmlManagers()Ljava/util/List;

    move-result-object v1

    .line 321
    sget-object v2, Lcom/mopub/mobileads/VastXmlManagerAggregator$CompanionOrientation;->LANDSCAPE:Lcom/mopub/mobileads/VastXmlManagerAggregator$CompanionOrientation;

    invoke-virtual {p0, v1, v2}, Lcom/mopub/mobileads/VastXmlManagerAggregator;->getBestCompanionAd(Ljava/util/List;Lcom/mopub/mobileads/VastXmlManagerAggregator$CompanionOrientation;)Lcom/mopub/mobileads/VastCompanionAdConfig;

    move-result-object v2

    sget-object v3, Lcom/mopub/mobileads/VastXmlManagerAggregator$CompanionOrientation;->PORTRAIT:Lcom/mopub/mobileads/VastXmlManagerAggregator$CompanionOrientation;

    invoke-virtual {p0, v1, v3}, Lcom/mopub/mobileads/VastXmlManagerAggregator;->getBestCompanionAd(Ljava/util/List;Lcom/mopub/mobileads/VastXmlManagerAggregator$CompanionOrientation;)Lcom/mopub/mobileads/VastCompanionAdConfig;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/mopub/mobileads/VastVideoConfig;->setVastCompanionAd(Lcom/mopub/mobileads/VastCompanionAdConfig;Lcom/mopub/mobileads/VastCompanionAdConfig;)V

    .line 326
    invoke-virtual {p0, v1}, Lcom/mopub/mobileads/VastXmlManagerAggregator;->getSocialActionsCompanionAds(Ljava/util/List;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/VastVideoConfig;->setSocialActionsCompanionAds(Ljava/util/Map;)V

    .line 328
    invoke-virtual {p1}, Lcom/mopub/mobileads/VastInLineXmlManager;->getErrorTrackers()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 329
    invoke-virtual {v0, p2}, Lcom/mopub/mobileads/VastVideoConfig;->addErrorTrackers(Ljava/util/List;)V

    .line 330
    invoke-direct {p0, p1, v0}, Lcom/mopub/mobileads/VastXmlManagerAggregator;->populateVideoViewabilityTracker(Lcom/mopub/mobileads/VastBaseInLineWrapperXmlManager;Lcom/mopub/mobileads/VastVideoConfig;)V

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private evaluateWrapperRedirect(Lcom/mopub/mobileads/VastWrapperXmlManager;Ljava/util/List;)Ljava/lang/String;
    .locals 2
    .param p1    # Lcom/mopub/mobileads/VastWrapperXmlManager;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mopub/mobileads/VastWrapperXmlManager;",
            "Ljava/util/List<",
            "Lcom/mopub/mobileads/VastTracker;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 374
    invoke-virtual {p1}, Lcom/mopub/mobileads/VastWrapperXmlManager;->getVastAdTagURI()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 381
    :cond_0
    :try_start_0
    invoke-direct {p0, p1}, Lcom/mopub/mobileads/VastXmlManagerAggregator;->followVastRedirect(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v1, "Failed to follow VAST redirect"

    .line 383
    invoke-static {v1, p1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 384
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    .line 385
    sget-object p1, Lcom/mopub/mobileads/VastErrorCode;->WRAPPER_TIMEOUT:Lcom/mopub/mobileads/VastErrorCode;

    iget-object v1, p0, Lcom/mopub/mobileads/VastXmlManagerAggregator;->mContext:Landroid/content/Context;

    invoke-static {p2, p1, v0, v0, v1}, Lcom/mopub/network/TrackingRequest;->makeVastTrackingHttpRequest(Ljava/util/List;Lcom/mopub/mobileads/VastErrorCode;Ljava/lang/Integer;Ljava/lang/String;Landroid/content/Context;)V

    :cond_1
    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method private fireErrorTrackerIfNoAds(Ljava/util/List;Lcom/mopub/mobileads/VastXmlManager;Landroid/content/Context;)Z
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/mopub/mobileads/VastXmlManager;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/mopub/mobileads/VastAdXmlManager;",
            ">;",
            "Lcom/mopub/mobileads/VastXmlManager;",
            "Landroid/content/Context;",
            ")Z"
        }
    .end annotation

    .line 474
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p2}, Lcom/mopub/mobileads/VastXmlManager;->getErrorTracker()Lcom/mopub/mobileads/VastTracker;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 476
    invoke-virtual {p2}, Lcom/mopub/mobileads/VastXmlManager;->getErrorTracker()Lcom/mopub/mobileads/VastTracker;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iget p2, p0, Lcom/mopub/mobileads/VastXmlManagerAggregator;->mTimesFollowedVastRedirect:I

    if-lez p2, :cond_0

    sget-object p2, Lcom/mopub/mobileads/VastErrorCode;->NO_ADS_VAST_RESPONSE:Lcom/mopub/mobileads/VastErrorCode;

    goto :goto_0

    :cond_0
    sget-object p2, Lcom/mopub/mobileads/VastErrorCode;->UNDEFINED_ERROR:Lcom/mopub/mobileads/VastErrorCode;

    :goto_0
    const/4 v0, 0x0

    invoke-static {p1, p2, v0, v0, p3}, Lcom/mopub/network/TrackingRequest;->makeVastTrackingHttpRequest(Ljava/util/List;Lcom/mopub/mobileads/VastErrorCode;Ljava/lang/Integer;Ljava/lang/String;Landroid/content/Context;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private followVastRedirect(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 800
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 802
    iget v0, p0, Lcom/mopub/mobileads/VastXmlManagerAggregator;->mTimesFollowedVastRedirect:I

    const/4 v1, 0x0

    const/16 v2, 0xa

    if-ge v0, v2, :cond_2

    .line 803
    iget v0, p0, Lcom/mopub/mobileads/VastXmlManagerAggregator;->mTimesFollowedVastRedirect:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/mopub/mobileads/VastXmlManagerAggregator;->mTimesFollowedVastRedirect:I

    .line 808
    :try_start_0
    invoke-static {p1}, Lcom/mopub/common/MoPubHttpUrlConnection;->getHttpUrlConnection(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 809
    :try_start_1
    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 811
    :try_start_2
    invoke-static {v0}, Lcom/mopub/common/util/Strings;->fromStream(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 813
    invoke-static {v0}, Lcom/mopub/common/util/Streams;->closeStream(Ljava/io/Closeable;)V

    if-eqz p1, :cond_0

    .line 815
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_0
    return-object v1

    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    goto :goto_0

    :catchall_1
    move-exception v0

    goto :goto_0

    :catchall_2
    move-exception p1

    move-object v0, p1

    move-object p1, v1

    .line 813
    :goto_0
    invoke-static {v1}, Lcom/mopub/common/util/Streams;->closeStream(Ljava/io/Closeable;)V

    if-eqz p1, :cond_1

    .line 815
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_1
    throw v0

    :cond_2
    return-object v1
.end method

.method static isValidSequenceNumber(Ljava/lang/String;)Z
    .locals 2
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 785
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 789
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x2

    if-ge p0, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1

    :catch_0
    return v1
.end method

.method private populateLinearTrackersAndIcon(Lcom/mopub/mobileads/VastLinearXmlManager;Lcom/mopub/mobileads/VastVideoConfig;)V
    .locals 1
    .param p1    # Lcom/mopub/mobileads/VastLinearXmlManager;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/mopub/mobileads/VastVideoConfig;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "linearXmlManager cannot be null"

    .line 403
    invoke-static {p1, v0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vastVideoConfig cannot be null"

    .line 404
    invoke-static {p2, v0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 406
    invoke-virtual {p1}, Lcom/mopub/mobileads/VastLinearXmlManager;->getAbsoluteProgressTrackers()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/mopub/mobileads/VastVideoConfig;->addAbsoluteTrackers(Ljava/util/List;)V

    .line 407
    invoke-virtual {p1}, Lcom/mopub/mobileads/VastLinearXmlManager;->getFractionalProgressTrackers()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/mopub/mobileads/VastVideoConfig;->addFractionalTrackers(Ljava/util/List;)V

    .line 409
    invoke-virtual {p1}, Lcom/mopub/mobileads/VastLinearXmlManager;->getPauseTrackers()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/mopub/mobileads/VastVideoConfig;->addPauseTrackers(Ljava/util/List;)V

    .line 410
    invoke-virtual {p1}, Lcom/mopub/mobileads/VastLinearXmlManager;->getResumeTrackers()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/mopub/mobileads/VastVideoConfig;->addResumeTrackers(Ljava/util/List;)V

    .line 411
    invoke-virtual {p1}, Lcom/mopub/mobileads/VastLinearXmlManager;->getVideoCompleteTrackers()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/mopub/mobileads/VastVideoConfig;->addCompleteTrackers(Ljava/util/List;)V

    .line 412
    invoke-virtual {p1}, Lcom/mopub/mobileads/VastLinearXmlManager;->getVideoCloseTrackers()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/mopub/mobileads/VastVideoConfig;->addCloseTrackers(Ljava/util/List;)V

    .line 413
    invoke-virtual {p1}, Lcom/mopub/mobileads/VastLinearXmlManager;->getVideoSkipTrackers()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/mopub/mobileads/VastVideoConfig;->addSkipTrackers(Ljava/util/List;)V

    .line 414
    invoke-virtual {p1}, Lcom/mopub/mobileads/VastLinearXmlManager;->getClickTrackers()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/mopub/mobileads/VastVideoConfig;->addClickTrackers(Ljava/util/List;)V

    .line 417
    invoke-virtual {p2}, Lcom/mopub/mobileads/VastVideoConfig;->getSkipOffsetString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 418
    invoke-virtual {p1}, Lcom/mopub/mobileads/VastLinearXmlManager;->getSkipOffset()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/mopub/mobileads/VastVideoConfig;->setSkipOffset(Ljava/lang/String;)V

    .line 422
    :cond_0
    invoke-virtual {p2}, Lcom/mopub/mobileads/VastVideoConfig;->getVastIconConfig()Lcom/mopub/mobileads/VastIconConfig;

    move-result-object v0

    if-nez v0, :cond_1

    .line 423
    invoke-virtual {p1}, Lcom/mopub/mobileads/VastLinearXmlManager;->getIconXmlManagers()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/mopub/mobileads/VastXmlManagerAggregator;->getBestIcon(Ljava/util/List;)Lcom/mopub/mobileads/VastIconConfig;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/mopub/mobileads/VastVideoConfig;->setVastIconConfig(Lcom/mopub/mobileads/VastIconConfig;)V

    :cond_1
    return-void
.end method

.method private populateMoPubCustomElements(Lcom/mopub/mobileads/VastXmlManager;Lcom/mopub/mobileads/VastVideoConfig;)V
    .locals 1
    .param p1    # Lcom/mopub/mobileads/VastXmlManager;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/mopub/mobileads/VastVideoConfig;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "xmlManager cannot be null"

    .line 438
    invoke-static {p1, v0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vastVideoConfig cannot be null"

    .line 439
    invoke-static {p2, v0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 441
    invoke-virtual {p1}, Lcom/mopub/mobileads/VastXmlManager;->getMoPubImpressionTrackers()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/mopub/mobileads/VastVideoConfig;->addImpressionTrackers(Ljava/util/List;)V

    .line 443
    invoke-virtual {p2}, Lcom/mopub/mobileads/VastVideoConfig;->getCustomCtaText()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 444
    invoke-virtual {p1}, Lcom/mopub/mobileads/VastXmlManager;->getCustomCtaText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/mopub/mobileads/VastVideoConfig;->setCustomCtaText(Ljava/lang/String;)V

    .line 446
    :cond_0
    invoke-virtual {p2}, Lcom/mopub/mobileads/VastVideoConfig;->getCustomSkipText()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 447
    invoke-virtual {p1}, Lcom/mopub/mobileads/VastXmlManager;->getCustomSkipText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/mopub/mobileads/VastVideoConfig;->setCustomSkipText(Ljava/lang/String;)V

    .line 449
    :cond_1
    invoke-virtual {p2}, Lcom/mopub/mobileads/VastVideoConfig;->getCustomCloseIconUrl()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    .line 450
    invoke-virtual {p1}, Lcom/mopub/mobileads/VastXmlManager;->getCustomCloseIconUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/mopub/mobileads/VastVideoConfig;->setCustomCloseIconUrl(Ljava/lang/String;)V

    .line 452
    :cond_2
    invoke-virtual {p2}, Lcom/mopub/mobileads/VastVideoConfig;->isCustomForceOrientationSet()Z

    move-result v0

    if-nez v0, :cond_3

    .line 453
    invoke-virtual {p1}, Lcom/mopub/mobileads/VastXmlManager;->getCustomForceOrientation()Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/mopub/mobileads/VastVideoConfig;->setCustomForceOrientation(Lcom/mopub/common/util/DeviceUtils$ForceOrientation;)V

    :cond_3
    return-void
.end method

.method private populateVideoViewabilityTracker(Lcom/mopub/mobileads/VastBaseInLineWrapperXmlManager;Lcom/mopub/mobileads/VastVideoConfig;)V
    .locals 3
    .param p1    # Lcom/mopub/mobileads/VastBaseInLineWrapperXmlManager;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/mopub/mobileads/VastVideoConfig;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 342
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 343
    invoke-static {p2}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 345
    invoke-virtual {p2}, Lcom/mopub/mobileads/VastVideoConfig;->getVideoViewabilityTracker()Lcom/mopub/mobileads/VideoViewabilityTracker;

    move-result-object v0

    if-eqz v0, :cond_0

    return-void

    .line 349
    :cond_0
    invoke-virtual {p1}, Lcom/mopub/mobileads/VastBaseInLineWrapperXmlManager;->getVastExtensionParentXmlManager()Lcom/mopub/mobileads/VastExtensionParentXmlManager;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 352
    invoke-virtual {p1}, Lcom/mopub/mobileads/VastExtensionParentXmlManager;->getVastExtensionXmlManagers()Ljava/util/List;

    move-result-object p1

    .line 354
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/mobileads/VastExtensionXmlManager;

    const-string v1, "MoPub"

    .line 355
    invoke-virtual {v0}, Lcom/mopub/mobileads/VastExtensionXmlManager;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 356
    invoke-virtual {v0}, Lcom/mopub/mobileads/VastExtensionXmlManager;->getVideoViewabilityTracker()Lcom/mopub/mobileads/VideoViewabilityTracker;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/mopub/mobileads/VastVideoConfig;->setVideoViewabilityTracker(Lcom/mopub/mobileads/VideoViewabilityTracker;)V

    :cond_2
    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/String;)Lcom/mopub/mobileads/VastVideoConfig;
    .locals 3
    .param p1    # [Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 115
    array-length v1, p1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    aget-object v2, p1, v1

    if-nez v2, :cond_0

    goto :goto_0

    .line 120
    :cond_0
    :try_start_0
    aget-object p1, p1, v1

    .line 121
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, p1, v1}, Lcom/mopub/mobileads/VastXmlManagerAggregator;->evaluateVastXmlManager(Ljava/lang/String;Ljava/util/List;)Lcom/mopub/mobileads/VastVideoConfig;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const-string v1, "Unable to generate VastVideoConfig."

    .line 123
    invoke-static {v1, p1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0

    :cond_1
    :goto_0
    return-object v0
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 43
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/mopub/mobileads/VastXmlManagerAggregator;->doInBackground([Ljava/lang/String;)Lcom/mopub/mobileads/VastVideoConfig;

    move-result-object p1

    return-object p1
.end method

.method evaluateVastXmlManager(Ljava/lang/String;Ljava/util/List;)Lcom/mopub/mobileads/VastVideoConfig;
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/mopub/mobileads/VastTracker;",
            ">;)",
            "Lcom/mopub/mobileads/VastVideoConfig;"
        }
    .end annotation

    const-string v0, "vastXml cannot be null"

    .line 166
    invoke-static {p1, v0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorTrackers cannot be null"

    .line 167
    invoke-static {p2, v0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    new-instance v0, Lcom/mopub/mobileads/VastXmlManager;

    invoke-direct {v0}, Lcom/mopub/mobileads/VastXmlManager;-><init>()V

    const/4 v1, 0x0

    .line 171
    :try_start_0
    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/VastXmlManager;->parseVastXml(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 179
    invoke-virtual {v0}, Lcom/mopub/mobileads/VastXmlManager;->getAdXmlManagers()Ljava/util/List;

    move-result-object p1

    .line 182
    iget-object v2, p0, Lcom/mopub/mobileads/VastXmlManagerAggregator;->mContext:Landroid/content/Context;

    invoke-direct {p0, p1, v0, v2}, Lcom/mopub/mobileads/VastXmlManagerAggregator;->fireErrorTrackerIfNoAds(Ljava/util/List;Lcom/mopub/mobileads/VastXmlManager;Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    .line 186
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mopub/mobileads/VastAdXmlManager;

    .line 187
    invoke-virtual {v2}, Lcom/mopub/mobileads/VastAdXmlManager;->getSequence()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/mopub/mobileads/VastXmlManagerAggregator;->isValidSequenceNumber(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    .line 192
    :cond_2
    invoke-virtual {v2}, Lcom/mopub/mobileads/VastAdXmlManager;->getInLineXmlManager()Lcom/mopub/mobileads/VastInLineXmlManager;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 195
    invoke-direct {p0, v3, p2}, Lcom/mopub/mobileads/VastXmlManagerAggregator;->evaluateInLineXmlManager(Lcom/mopub/mobileads/VastInLineXmlManager;Ljava/util/List;)Lcom/mopub/mobileads/VastVideoConfig;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 199
    invoke-direct {p0, v0, v3}, Lcom/mopub/mobileads/VastXmlManagerAggregator;->populateMoPubCustomElements(Lcom/mopub/mobileads/VastXmlManager;Lcom/mopub/mobileads/VastVideoConfig;)V

    return-object v3

    .line 205
    :cond_3
    invoke-virtual {v2}, Lcom/mopub/mobileads/VastAdXmlManager;->getWrapperXmlManager()Lcom/mopub/mobileads/VastWrapperXmlManager;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 208
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 209
    invoke-virtual {v2}, Lcom/mopub/mobileads/VastWrapperXmlManager;->getErrorTrackers()Ljava/util/List;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 210
    invoke-direct {p0, v2, v3}, Lcom/mopub/mobileads/VastXmlManagerAggregator;->evaluateWrapperRedirect(Lcom/mopub/mobileads/VastWrapperXmlManager;Ljava/util/List;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_4

    goto :goto_0

    .line 216
    :cond_4
    invoke-virtual {p0, v4, v3}, Lcom/mopub/mobileads/VastXmlManagerAggregator;->evaluateVastXmlManager(Ljava/lang/String;Ljava/util/List;)Lcom/mopub/mobileads/VastVideoConfig;

    move-result-object v3

    if-nez v3, :cond_5

    goto :goto_0

    .line 229
    :cond_5
    invoke-virtual {v2}, Lcom/mopub/mobileads/VastWrapperXmlManager;->getImpressionTrackers()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v3, p1}, Lcom/mopub/mobileads/VastVideoConfig;->addImpressionTrackers(Ljava/util/List;)V

    .line 231
    invoke-virtual {v2}, Lcom/mopub/mobileads/VastWrapperXmlManager;->getLinearXmlManagers()Ljava/util/List;

    move-result-object p1

    .line 233
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/mopub/mobileads/VastLinearXmlManager;

    .line 234
    invoke-direct {p0, p2, v3}, Lcom/mopub/mobileads/VastXmlManagerAggregator;->populateLinearTrackersAndIcon(Lcom/mopub/mobileads/VastLinearXmlManager;Lcom/mopub/mobileads/VastVideoConfig;)V

    goto :goto_1

    .line 236
    :cond_6
    invoke-direct {p0, v2, v3}, Lcom/mopub/mobileads/VastXmlManagerAggregator;->populateVideoViewabilityTracker(Lcom/mopub/mobileads/VastBaseInLineWrapperXmlManager;Lcom/mopub/mobileads/VastVideoConfig;)V

    .line 238
    invoke-virtual {v2}, Lcom/mopub/mobileads/VastWrapperXmlManager;->getCompanionAdXmlManagers()Ljava/util/List;

    move-result-object p1

    .line 242
    invoke-virtual {v3}, Lcom/mopub/mobileads/VastVideoConfig;->hasCompanionAd()Z

    move-result p2

    if-nez p2, :cond_7

    .line 243
    sget-object p2, Lcom/mopub/mobileads/VastXmlManagerAggregator$CompanionOrientation;->LANDSCAPE:Lcom/mopub/mobileads/VastXmlManagerAggregator$CompanionOrientation;

    invoke-virtual {p0, p1, p2}, Lcom/mopub/mobileads/VastXmlManagerAggregator;->getBestCompanionAd(Ljava/util/List;Lcom/mopub/mobileads/VastXmlManagerAggregator$CompanionOrientation;)Lcom/mopub/mobileads/VastCompanionAdConfig;

    move-result-object p2

    sget-object v1, Lcom/mopub/mobileads/VastXmlManagerAggregator$CompanionOrientation;->PORTRAIT:Lcom/mopub/mobileads/VastXmlManagerAggregator$CompanionOrientation;

    invoke-virtual {p0, p1, v1}, Lcom/mopub/mobileads/VastXmlManagerAggregator;->getBestCompanionAd(Ljava/util/List;Lcom/mopub/mobileads/VastXmlManagerAggregator$CompanionOrientation;)Lcom/mopub/mobileads/VastCompanionAdConfig;

    move-result-object v1

    invoke-virtual {v3, p2, v1}, Lcom/mopub/mobileads/VastVideoConfig;->setVastCompanionAd(Lcom/mopub/mobileads/VastCompanionAdConfig;Lcom/mopub/mobileads/VastCompanionAdConfig;)V

    goto :goto_3

    :cond_7
    const/4 p2, 0x2

    .line 250
    invoke-virtual {v3, p2}, Lcom/mopub/mobileads/VastVideoConfig;->getVastCompanionAd(I)Lcom/mopub/mobileads/VastCompanionAdConfig;

    move-result-object p2

    const/4 v1, 0x1

    .line 252
    invoke-virtual {v3, v1}, Lcom/mopub/mobileads/VastVideoConfig;->getVastCompanionAd(I)Lcom/mopub/mobileads/VastCompanionAdConfig;

    move-result-object v1

    if-eqz p2, :cond_9

    if-eqz v1, :cond_9

    .line 255
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_8
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/mopub/mobileads/VastCompanionAdXmlManager;

    .line 256
    invoke-virtual {v4}, Lcom/mopub/mobileads/VastCompanionAdXmlManager;->hasResources()Z

    move-result v5

    if-nez v5, :cond_8

    .line 257
    invoke-virtual {v4}, Lcom/mopub/mobileads/VastCompanionAdXmlManager;->getClickTrackers()Ljava/util/List;

    move-result-object v5

    invoke-virtual {p2, v5}, Lcom/mopub/mobileads/VastCompanionAdConfig;->addClickTrackers(Ljava/util/List;)V

    .line 259
    invoke-virtual {v4}, Lcom/mopub/mobileads/VastCompanionAdXmlManager;->getCompanionCreativeViewTrackers()Ljava/util/List;

    move-result-object v5

    invoke-virtual {p2, v5}, Lcom/mopub/mobileads/VastCompanionAdConfig;->addCreativeViewTrackers(Ljava/util/List;)V

    .line 261
    invoke-virtual {v4}, Lcom/mopub/mobileads/VastCompanionAdXmlManager;->getClickTrackers()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/mopub/mobileads/VastCompanionAdConfig;->addClickTrackers(Ljava/util/List;)V

    .line 263
    invoke-virtual {v4}, Lcom/mopub/mobileads/VastCompanionAdXmlManager;->getCompanionCreativeViewTrackers()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/mopub/mobileads/VastCompanionAdConfig;->addCreativeViewTrackers(Ljava/util/List;)V

    goto :goto_2

    .line 270
    :cond_9
    :goto_3
    invoke-virtual {v3}, Lcom/mopub/mobileads/VastVideoConfig;->getSocialActionsCompanionAds()Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_a

    .line 271
    invoke-virtual {p0, p1}, Lcom/mopub/mobileads/VastXmlManagerAggregator;->getSocialActionsCompanionAds(Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v3, p1}, Lcom/mopub/mobileads/VastVideoConfig;->setSocialActionsCompanionAds(Ljava/util/Map;)V

    .line 275
    :cond_a
    invoke-direct {p0, v0, v3}, Lcom/mopub/mobileads/VastXmlManagerAggregator;->populateMoPubCustomElements(Lcom/mopub/mobileads/VastXmlManager;Lcom/mopub/mobileads/VastVideoConfig;)V

    return-object v3

    :cond_b
    return-object v1

    :catch_0
    move-exception p1

    const-string v0, "Failed to parse VAST XML"

    .line 173
    invoke-static {v0, p1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 174
    sget-object p1, Lcom/mopub/mobileads/VastErrorCode;->XML_PARSING_ERROR:Lcom/mopub/mobileads/VastErrorCode;

    iget-object v0, p0, Lcom/mopub/mobileads/VastXmlManagerAggregator;->mContext:Landroid/content/Context;

    invoke-static {p2, p1, v1, v1, v0}, Lcom/mopub/network/TrackingRequest;->makeVastTrackingHttpRequest(Ljava/util/List;Lcom/mopub/mobileads/VastErrorCode;Ljava/lang/Integer;Ljava/lang/String;Landroid/content/Context;)V

    return-object v1
.end method

.method getBestCompanionAd(Ljava/util/List;Lcom/mopub/mobileads/VastXmlManagerAggregator$CompanionOrientation;)Lcom/mopub/mobileads/VastCompanionAdConfig;
    .locals 23
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/mopub/mobileads/VastXmlManagerAggregator$CompanionOrientation;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/mopub/mobileads/VastCompanionAdXmlManager;",
            ">;",
            "Lcom/mopub/mobileads/VastXmlManagerAggregator$CompanionOrientation;",
            ")",
            "Lcom/mopub/mobileads/VastCompanionAdConfig;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "managers cannot be null"

    .line 527
    invoke-static {v1, v3}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "orientation cannot be null"

    .line 528
    invoke-static {v2, v3}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 530
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 538
    invoke-static {}, Lcom/mopub/mobileads/VastResource$Type;->values()[Lcom/mopub/mobileads/VastResource$Type;

    move-result-object v1

    const-wide/high16 v5, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    const/4 v7, 0x0

    array-length v8, v1

    move-wide v10, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    :goto_0
    if-ge v7, v8, :cond_8

    aget-object v12, v1, v7

    .line 539
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    .line 541
    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_6

    .line 542
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/mopub/mobileads/VastCompanionAdXmlManager;

    .line 544
    invoke-virtual {v14}, Lcom/mopub/mobileads/VastCompanionAdXmlManager;->getWidth()Ljava/lang/Integer;

    move-result-object v15

    .line 545
    invoke-virtual {v14}, Lcom/mopub/mobileads/VastCompanionAdXmlManager;->getHeight()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v15, :cond_4

    move-object/from16 v16, v1

    .line 546
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v1

    move-object/from16 v17, v3

    const/16 v3, 0x12c

    if-lt v1, v3, :cond_5

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v3, 0xfa

    if-ge v1, v3, :cond_0

    goto :goto_4

    .line 551
    :cond_0
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v0, v1, v3, v12, v2}, Lcom/mopub/mobileads/VastXmlManagerAggregator;->getScaledDimensions(IILcom/mopub/mobileads/VastResource$Type;Lcom/mopub/mobileads/VastXmlManagerAggregator$CompanionOrientation;)Landroid/graphics/Point;

    move-result-object v1

    .line 552
    invoke-virtual {v14}, Lcom/mopub/mobileads/VastCompanionAdXmlManager;->getResourceXmlManager()Lcom/mopub/mobileads/VastResourceXmlManager;

    move-result-object v3

    move-object/from16 v18, v6

    iget v6, v1, Landroid/graphics/Point;->x:I

    move/from16 v19, v8

    iget v8, v1, Landroid/graphics/Point;->y:I

    invoke-static {v3, v12, v6, v8}, Lcom/mopub/mobileads/VastResource;->fromVastResourceXmlManager(Lcom/mopub/mobileads/VastResourceXmlManager;Lcom/mopub/mobileads/VastResource$Type;II)Lcom/mopub/mobileads/VastResource;

    move-result-object v6

    if-nez v6, :cond_1

    goto :goto_5

    .line 560
    :cond_1
    sget-object v3, Lcom/mopub/mobileads/VastXmlManagerAggregator$CompanionOrientation;->PORTRAIT:Lcom/mopub/mobileads/VastXmlManagerAggregator$CompanionOrientation;

    if-ne v3, v2, :cond_2

    .line 561
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-direct {v0, v3, v4}, Lcom/mopub/mobileads/VastXmlManagerAggregator;->calculateFitness(II)D

    move-result-wide v3

    goto :goto_2

    .line 563
    :cond_2
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-direct {v0, v3, v4}, Lcom/mopub/mobileads/VastXmlManagerAggregator;->calculateFitness(II)D

    move-result-wide v3

    :goto_2
    cmpg-double v8, v3, v10

    if-gez v8, :cond_3

    move-object v9, v1

    move-wide v10, v3

    move-object v5, v14

    goto :goto_3

    :cond_3
    move-object/from16 v6, v18

    :goto_3
    move-object/from16 v1, v16

    move-object/from16 v3, v17

    goto :goto_6

    :cond_4
    move-object/from16 v16, v1

    move-object/from16 v17, v3

    :cond_5
    :goto_4
    move-object/from16 v18, v6

    move/from16 v19, v8

    :goto_5
    move-object/from16 v1, v16

    move-object/from16 v3, v17

    move-object/from16 v6, v18

    :goto_6
    move/from16 v8, v19

    goto/16 :goto_1

    :cond_6
    move-object/from16 v16, v1

    move-object/from16 v17, v3

    move-object/from16 v18, v6

    move/from16 v19, v8

    if-eqz v5, :cond_7

    move-object/from16 v19, v18

    goto :goto_7

    :cond_7
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v1, v16

    move-object/from16 v3, v17

    move-object/from16 v6, v18

    move/from16 v8, v19

    goto/16 :goto_0

    :cond_8
    move-object/from16 v19, v6

    :goto_7
    if-eqz v5, :cond_9

    .line 578
    new-instance v1, Lcom/mopub/mobileads/VastCompanionAdConfig;

    iget v2, v9, Landroid/graphics/Point;->x:I

    iget v3, v9, Landroid/graphics/Point;->y:I

    invoke-virtual {v5}, Lcom/mopub/mobileads/VastCompanionAdXmlManager;->getClickThroughUrl()Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v5}, Lcom/mopub/mobileads/VastCompanionAdXmlManager;->getClickTrackers()Ljava/util/List;

    move-result-object v21

    invoke-virtual {v5}, Lcom/mopub/mobileads/VastCompanionAdXmlManager;->getCompanionCreativeViewTrackers()Ljava/util/List;

    move-result-object v22

    move-object/from16 v16, v1

    move/from16 v17, v2

    move/from16 v18, v3

    invoke-direct/range {v16 .. v22}, Lcom/mopub/mobileads/VastCompanionAdConfig;-><init>(IILcom/mopub/mobileads/VastResource;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    return-object v1

    :cond_9
    const/4 v1, 0x0

    return-object v1
.end method

.method getBestIcon(Ljava/util/List;)Lcom/mopub/mobileads/VastIconConfig;
    .locals 19
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/mopub/mobileads/VastIconXmlManager;",
            ">;)",
            "Lcom/mopub/mobileads/VastIconConfig;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "managers cannot be null"

    .line 716
    invoke-static {v0, v1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 717
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 720
    invoke-static {}, Lcom/mopub/mobileads/VastResource$Type;->values()[Lcom/mopub/mobileads/VastResource$Type;

    move-result-object v0

    const/4 v2, 0x0

    array-length v3, v0

    :goto_0
    if-ge v2, v3, :cond_4

    aget-object v4, v0, v2

    .line 721
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 722
    :cond_0
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    .line 723
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/mopub/mobileads/VastIconXmlManager;

    .line 725
    invoke-virtual {v6}, Lcom/mopub/mobileads/VastIconXmlManager;->getWidth()Ljava/lang/Integer;

    move-result-object v7

    .line 726
    invoke-virtual {v6}, Lcom/mopub/mobileads/VastIconXmlManager;->getHeight()Ljava/lang/Integer;

    move-result-object v8

    if-eqz v7, :cond_0

    .line 729
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-lez v9, :cond_0

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v9

    const/16 v10, 0x12c

    if-gt v9, v10, :cond_0

    if-eqz v8, :cond_0

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-lez v9, :cond_0

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-le v9, v10, :cond_1

    goto :goto_1

    .line 734
    :cond_1
    invoke-virtual {v6}, Lcom/mopub/mobileads/VastIconXmlManager;->getResourceXmlManager()Lcom/mopub/mobileads/VastResourceXmlManager;

    move-result-object v9

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static {v9, v4, v7, v8}, Lcom/mopub/mobileads/VastResource;->fromVastResourceXmlManager(Lcom/mopub/mobileads/VastResourceXmlManager;Lcom/mopub/mobileads/VastResource$Type;II)Lcom/mopub/mobileads/VastResource;

    move-result-object v15

    if-nez v15, :cond_2

    goto :goto_1

    .line 741
    :cond_2
    new-instance v0, Lcom/mopub/mobileads/VastIconConfig;

    invoke-virtual {v6}, Lcom/mopub/mobileads/VastIconXmlManager;->getWidth()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-virtual {v6}, Lcom/mopub/mobileads/VastIconXmlManager;->getHeight()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-virtual {v6}, Lcom/mopub/mobileads/VastIconXmlManager;->getOffsetMS()Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v6}, Lcom/mopub/mobileads/VastIconXmlManager;->getDurationMS()Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual {v6}, Lcom/mopub/mobileads/VastIconXmlManager;->getClickTrackingUris()Ljava/util/List;

    move-result-object v16

    invoke-virtual {v6}, Lcom/mopub/mobileads/VastIconXmlManager;->getClickThroughUri()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v6}, Lcom/mopub/mobileads/VastIconXmlManager;->getViewTrackingUris()Ljava/util/List;

    move-result-object v18

    move-object v10, v0

    invoke-direct/range {v10 .. v18}, Lcom/mopub/mobileads/VastIconConfig;-><init>(IILjava/lang/Integer;Ljava/lang/Integer;Lcom/mopub/mobileads/VastResource;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V

    return-object v0

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    return-object v0
.end method

.method getBestMediaFileUrl(Ljava/util/List;)Ljava/lang/String;
    .locals 7
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/mopub/mobileads/VastMediaXmlManager;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "managers cannot be null"

    .line 490
    invoke-static {p1, v0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 491
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 495
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const-wide/high16 v0, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    const/4 v2, 0x0

    .line 496
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 497
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/mopub/mobileads/VastMediaXmlManager;

    .line 499
    invoke-virtual {v3}, Lcom/mopub/mobileads/VastMediaXmlManager;->getType()Ljava/lang/String;

    move-result-object v4

    .line 500
    invoke-virtual {v3}, Lcom/mopub/mobileads/VastMediaXmlManager;->getMediaUrl()Ljava/lang/String;

    move-result-object v5

    .line 501
    sget-object v6, Lcom/mopub/mobileads/VastXmlManagerAggregator;->VIDEO_MIME_TYPES:Ljava/util/List;

    invoke-interface {v6, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    if-nez v5, :cond_1

    goto :goto_1

    .line 506
    :cond_1
    invoke-virtual {v3}, Lcom/mopub/mobileads/VastMediaXmlManager;->getWidth()Ljava/lang/Integer;

    move-result-object v4

    .line 507
    invoke-virtual {v3}, Lcom/mopub/mobileads/VastMediaXmlManager;->getHeight()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v4, :cond_0

    .line 508
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-lez v6, :cond_0

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-gtz v6, :cond_2

    goto :goto_0

    .line 512
    :cond_2
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-direct {p0, v4, v3}, Lcom/mopub/mobileads/VastXmlManagerAggregator;->calculateFitness(II)D

    move-result-wide v3

    cmpg-double v6, v3, v0

    if-gez v6, :cond_0

    move-wide v0, v3

    move-object v2, v5

    goto :goto_0

    .line 502
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_4
    return-object v2
.end method

.method getScaledDimensions(IILcom/mopub/mobileads/VastResource$Type;Lcom/mopub/mobileads/VastXmlManagerAggregator$CompanionOrientation;)Landroid/graphics/Point;
    .locals 5
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .line 659
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0, p1, p2}, Landroid/graphics/Point;-><init>(II)V

    .line 660
    iget-object v1, p0, Lcom/mopub/mobileads/VastXmlManagerAggregator;->mContext:Landroid/content/Context;

    const-string v2, "window"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/WindowManager;

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    .line 662
    invoke-virtual {v1}, Landroid/view/Display;->getWidth()I

    move-result v2

    .line 663
    invoke-virtual {v1}, Landroid/view/Display;->getHeight()I

    move-result v1

    int-to-float p1, p1

    .line 665
    iget-object v3, p0, Lcom/mopub/mobileads/VastXmlManagerAggregator;->mContext:Landroid/content/Context;

    invoke-static {p1, v3}, Lcom/mopub/common/util/Dips;->dipsToIntPixels(FLandroid/content/Context;)I

    move-result p1

    int-to-float p2, p2

    .line 666
    iget-object v3, p0, Lcom/mopub/mobileads/VastXmlManagerAggregator;->mContext:Landroid/content/Context;

    invoke-static {p2, v3}, Lcom/mopub/common/util/Dips;->dipsToIntPixels(FLandroid/content/Context;)I

    move-result p2

    .line 669
    sget-object v3, Lcom/mopub/mobileads/VastXmlManagerAggregator$CompanionOrientation;->LANDSCAPE:Lcom/mopub/mobileads/VastXmlManagerAggregator$CompanionOrientation;

    if-ne v3, p4, :cond_0

    .line 670
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result p4

    .line 671
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_0

    .line 673
    :cond_0
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result p4

    .line 674
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    :goto_0
    add-int/lit8 v2, p4, -0x10

    if-gt p1, v2, :cond_1

    add-int/lit8 v2, v1, -0x10

    if-gt p2, v2, :cond_1

    return-object v0

    .line 683
    :cond_1
    new-instance v2, Landroid/graphics/Point;

    invoke-direct {v2}, Landroid/graphics/Point;-><init>()V

    .line 684
    sget-object v3, Lcom/mopub/mobileads/VastResource$Type;->HTML_RESOURCE:Lcom/mopub/mobileads/VastResource$Type;

    if-ne v3, p3, :cond_2

    .line 685
    invoke-static {p4, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, v2, Landroid/graphics/Point;->x:I

    .line 686
    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, v2, Landroid/graphics/Point;->y:I

    goto :goto_1

    :cond_2
    int-to-float p1, p1

    int-to-float p3, p4

    div-float p3, p1, p3

    int-to-float p2, p2

    int-to-float v3, v1

    div-float v3, p2, v3

    cmpl-float v4, p3, v3

    if-ltz v4, :cond_3

    .line 692
    iput p4, v2, Landroid/graphics/Point;->x:I

    div-float/2addr p2, p3

    float-to-int p1, p2

    .line 693
    iput p1, v2, Landroid/graphics/Point;->y:I

    goto :goto_1

    :cond_3
    div-float/2addr p1, v3

    float-to-int p1, p1

    .line 695
    iput p1, v2, Landroid/graphics/Point;->x:I

    .line 696
    iput v1, v2, Landroid/graphics/Point;->y:I

    .line 700
    :goto_1
    iget p1, v2, Landroid/graphics/Point;->x:I

    add-int/lit8 p1, p1, -0x10

    iput p1, v2, Landroid/graphics/Point;->x:I

    .line 701
    iget p1, v2, Landroid/graphics/Point;->y:I

    add-int/lit8 p1, p1, -0x10

    iput p1, v2, Landroid/graphics/Point;->y:I

    .line 703
    iget p1, v2, Landroid/graphics/Point;->x:I

    if-ltz p1, :cond_5

    iget p1, v2, Landroid/graphics/Point;->y:I

    if-gez p1, :cond_4

    goto :goto_2

    .line 707
    :cond_4
    iget p1, v2, Landroid/graphics/Point;->x:I

    int-to-float p1, p1

    iget-object p2, p0, Lcom/mopub/mobileads/VastXmlManagerAggregator;->mContext:Landroid/content/Context;

    invoke-static {p1, p2}, Lcom/mopub/common/util/Dips;->pixelsToIntDips(FLandroid/content/Context;)I

    move-result p1

    iput p1, v2, Landroid/graphics/Point;->x:I

    .line 708
    iget p1, v2, Landroid/graphics/Point;->y:I

    int-to-float p1, p1

    iget-object p2, p0, Lcom/mopub/mobileads/VastXmlManagerAggregator;->mContext:Landroid/content/Context;

    invoke-static {p1, p2}, Lcom/mopub/common/util/Dips;->pixelsToIntDips(FLandroid/content/Context;)I

    move-result p1

    iput p1, v2, Landroid/graphics/Point;->y:I

    return-object v2

    :cond_5
    :goto_2
    return-object v0
.end method

.method getSocialActionsCompanionAds(Ljava/util/List;)Ljava/util/Map;
    .locals 17
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/mopub/mobileads/VastCompanionAdXmlManager;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/mopub/mobileads/VastCompanionAdConfig;",
            ">;"
        }
    .end annotation

    const-string v0, "managers cannot be null"

    move-object/from16 v1, p1

    .line 594
    invoke-static {v1, v0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 596
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 599
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mopub/mobileads/VastCompanionAdXmlManager;

    .line 600
    invoke-virtual {v2}, Lcom/mopub/mobileads/VastCompanionAdXmlManager;->getWidth()Ljava/lang/Integer;

    move-result-object v3

    .line 601
    invoke-virtual {v2}, Lcom/mopub/mobileads/VastCompanionAdXmlManager;->getHeight()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v3, :cond_0

    if-nez v4, :cond_1

    goto :goto_0

    .line 606
    :cond_1
    invoke-virtual {v2}, Lcom/mopub/mobileads/VastCompanionAdXmlManager;->getAdSlotId()Ljava/lang/String;

    move-result-object v5

    const-string v6, "adsBy"

    .line 607
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    const/16 v7, 0xa

    const/16 v8, 0x32

    if-eqz v6, :cond_2

    .line 609
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/16 v9, 0x19

    if-lt v6, v9, :cond_0

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/16 v9, 0x4b

    if-gt v6, v9, :cond_0

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-lt v6, v7, :cond_0

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-le v6, v8, :cond_3

    goto :goto_0

    :cond_2
    const-string v6, "socialActions"

    .line 612
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 614
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-lt v6, v8, :cond_0

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/16 v9, 0x96

    if-gt v6, v9, :cond_0

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-lt v6, v7, :cond_0

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-le v6, v8, :cond_3

    goto :goto_0

    .line 622
    :cond_3
    invoke-virtual {v2}, Lcom/mopub/mobileads/VastCompanionAdXmlManager;->getResourceXmlManager()Lcom/mopub/mobileads/VastResourceXmlManager;

    move-result-object v6

    sget-object v7, Lcom/mopub/mobileads/VastResource$Type;->HTML_RESOURCE:Lcom/mopub/mobileads/VastResource$Type;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static {v6, v7, v8, v9}, Lcom/mopub/mobileads/VastResource;->fromVastResourceXmlManager(Lcom/mopub/mobileads/VastResourceXmlManager;Lcom/mopub/mobileads/VastResource$Type;II)Lcom/mopub/mobileads/VastResource;

    move-result-object v13

    if-nez v13, :cond_4

    goto :goto_0

    .line 629
    :cond_4
    new-instance v6, Lcom/mopub/mobileads/VastCompanionAdConfig;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-virtual {v2}, Lcom/mopub/mobileads/VastCompanionAdXmlManager;->getClickThroughUrl()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v2}, Lcom/mopub/mobileads/VastCompanionAdXmlManager;->getClickTrackers()Ljava/util/List;

    move-result-object v15

    invoke-virtual {v2}, Lcom/mopub/mobileads/VastCompanionAdXmlManager;->getCompanionCreativeViewTrackers()Ljava/util/List;

    move-result-object v16

    move-object v10, v6

    invoke-direct/range {v10 .. v16}, Lcom/mopub/mobileads/VastCompanionAdConfig;-><init>(IILcom/mopub/mobileads/VastResource;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_5
    return-object v0
.end method

.method protected onCancelled()V
    .locals 2

    .line 138
    iget-object v0, p0, Lcom/mopub/mobileads/VastXmlManagerAggregator;->mVastXmlManagerAggregatorListener:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/mobileads/VastXmlManagerAggregator$VastXmlManagerAggregatorListener;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 140
    invoke-interface {v0, v1}, Lcom/mopub/mobileads/VastXmlManagerAggregator$VastXmlManagerAggregatorListener;->onAggregationComplete(Lcom/mopub/mobileads/VastVideoConfig;)V

    :cond_0
    return-void
.end method

.method protected onPostExecute(Lcom/mopub/mobileads/VastVideoConfig;)V
    .locals 1
    .param p1    # Lcom/mopub/mobileads/VastVideoConfig;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 130
    iget-object v0, p0, Lcom/mopub/mobileads/VastXmlManagerAggregator;->mVastXmlManagerAggregatorListener:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/mobileads/VastXmlManagerAggregator$VastXmlManagerAggregatorListener;

    if-eqz v0, :cond_0

    .line 132
    invoke-interface {v0, p1}, Lcom/mopub/mobileads/VastXmlManagerAggregator$VastXmlManagerAggregatorListener;->onAggregationComplete(Lcom/mopub/mobileads/VastVideoConfig;)V

    :cond_0
    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 43
    check-cast p1, Lcom/mopub/mobileads/VastVideoConfig;

    invoke-virtual {p0, p1}, Lcom/mopub/mobileads/VastXmlManagerAggregator;->onPostExecute(Lcom/mopub/mobileads/VastVideoConfig;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/mopub/mobileads/VastXmlManagerAggregator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/mopub/network/Networking;->getUserAgent(Landroid/content/Context;)Ljava/lang/String;

    return-void
.end method

.method setTimesFollowedVastRedirect(I)V
    .locals 0
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 826
    iput p1, p0, Lcom/mopub/mobileads/VastXmlManagerAggregator;->mTimesFollowedVastRedirect:I

    return-void
.end method
