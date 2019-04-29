.class Lcom/mopub/nativeads/ServerPositioningSource;
.super Ljava/lang/Object;
.source "ServerPositioningSource.java"

# interfaces
.implements Lcom/mopub/nativeads/PositioningSource;


# static fields
.field private static final DEFAULT_RETRY_TIME_MILLISECONDS:D = 1000.0

.field private static final EXPONENTIAL_BACKOFF_FACTOR:D = 2.0

.field private static final MAXIMUM_RETRY_TIME_MILLISECONDS:I = 0x493e0


# instance fields
.field private final mContext:Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mErrorListener:Lcom/mopub/volley/Response$ErrorListener;

.field private mListener:Lcom/mopub/nativeads/PositioningSource$PositioningListener;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mMaximumRetryTimeMillis:I

.field private final mPositioningListener:Lcom/mopub/volley/Response$Listener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/mopub/volley/Response$Listener<",
            "Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;",
            ">;"
        }
    .end annotation
.end field

.field private mRequest:Lcom/mopub/nativeads/PositioningRequest;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mRetryCount:I

.field private final mRetryHandler:Landroid/os/Handler;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mRetryRunnable:Ljava/lang/Runnable;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private mRetryUrl:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x493e0

    .line 55
    iput v0, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mMaximumRetryTimeMillis:I

    .line 71
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mContext:Landroid/content/Context;

    .line 73
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mRetryHandler:Landroid/os/Handler;

    .line 74
    new-instance p1, Lcom/mopub/nativeads/ServerPositioningSource$1;

    invoke-direct {p1, p0}, Lcom/mopub/nativeads/ServerPositioningSource$1;-><init>(Lcom/mopub/nativeads/ServerPositioningSource;)V

    iput-object p1, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mRetryRunnable:Ljava/lang/Runnable;

    .line 81
    new-instance p1, Lcom/mopub/nativeads/ServerPositioningSource$2;

    invoke-direct {p1, p0}, Lcom/mopub/nativeads/ServerPositioningSource$2;-><init>(Lcom/mopub/nativeads/ServerPositioningSource;)V

    iput-object p1, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mPositioningListener:Lcom/mopub/volley/Response$Listener;

    .line 88
    new-instance p1, Lcom/mopub/nativeads/ServerPositioningSource$3;

    invoke-direct {p1, p0}, Lcom/mopub/nativeads/ServerPositioningSource$3;-><init>(Lcom/mopub/nativeads/ServerPositioningSource;)V

    iput-object p1, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mErrorListener:Lcom/mopub/volley/Response$ErrorListener;

    return-void
.end method

.method static synthetic access$000(Lcom/mopub/nativeads/ServerPositioningSource;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/mopub/nativeads/ServerPositioningSource;->requestPositioningInternal()V

    return-void
.end method

.method static synthetic access$100(Lcom/mopub/nativeads/ServerPositioningSource;Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/mopub/nativeads/ServerPositioningSource;->handleSuccess(Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;)V

    return-void
.end method

.method static synthetic access$200(Lcom/mopub/nativeads/ServerPositioningSource;)Landroid/content/Context;
    .locals 0

    .line 47
    iget-object p0, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$300(Lcom/mopub/nativeads/ServerPositioningSource;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/mopub/nativeads/ServerPositioningSource;->handleFailure()V

    return-void
.end method

.method private handleFailure()V
    .locals 5

    .line 143
    iget v0, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mRetryCount:I

    add-int/lit8 v0, v0, 0x1

    int-to-double v0, v0

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    mul-double/2addr v2, v0

    double-to-int v0, v2

    .line 145
    iget v1, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mMaximumRetryTimeMillis:I

    if-lt v0, v1, :cond_1

    const-string v0, "Error downloading positioning information"

    .line 146
    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 147
    iget-object v0, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mListener:Lcom/mopub/nativeads/PositioningSource$PositioningListener;

    if-eqz v0, :cond_0

    .line 148
    iget-object v0, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mListener:Lcom/mopub/nativeads/PositioningSource$PositioningListener;

    invoke-interface {v0}, Lcom/mopub/nativeads/PositioningSource$PositioningListener;->onFailed()V

    :cond_0
    const/4 v0, 0x0

    .line 150
    iput-object v0, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mListener:Lcom/mopub/nativeads/PositioningSource$PositioningListener;

    return-void

    .line 154
    :cond_1
    iget v1, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mRetryCount:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mRetryCount:I

    .line 155
    iget-object v1, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mRetryHandler:Landroid/os/Handler;

    iget-object v2, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mRetryRunnable:Ljava/lang/Runnable;

    int-to-long v3, v0

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private handleSuccess(Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;)V
    .locals 1
    .param p1    # Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 135
    iget-object v0, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mListener:Lcom/mopub/nativeads/PositioningSource$PositioningListener;

    if-eqz v0, :cond_0

    .line 136
    iget-object v0, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mListener:Lcom/mopub/nativeads/PositioningSource$PositioningListener;

    invoke-interface {v0, p1}, Lcom/mopub/nativeads/PositioningSource$PositioningListener;->onLoad(Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;)V

    :cond_0
    const/4 p1, 0x0

    .line 138
    iput-object p1, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mListener:Lcom/mopub/nativeads/PositioningSource$PositioningListener;

    const/4 p1, 0x0

    .line 139
    iput p1, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mRetryCount:I

    return-void
.end method

.method private requestPositioningInternal()V
    .locals 4

    .line 127
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Loading positioning from: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mRetryUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 129
    new-instance v0, Lcom/mopub/nativeads/PositioningRequest;

    iget-object v1, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mRetryUrl:Ljava/lang/String;

    iget-object v2, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mPositioningListener:Lcom/mopub/volley/Response$Listener;

    iget-object v3, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mErrorListener:Lcom/mopub/volley/Response$ErrorListener;

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/nativeads/PositioningRequest;-><init>(Ljava/lang/String;Lcom/mopub/volley/Response$Listener;Lcom/mopub/volley/Response$ErrorListener;)V

    iput-object v0, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mRequest:Lcom/mopub/nativeads/PositioningRequest;

    .line 130
    iget-object v0, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/mopub/network/Networking;->getRequestQueue(Landroid/content/Context;)Lcom/mopub/network/MoPubRequestQueue;

    move-result-object v0

    .line 131
    iget-object v1, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mRequest:Lcom/mopub/nativeads/PositioningRequest;

    invoke-virtual {v0, v1}, Lcom/mopub/volley/RequestQueue;->add(Lcom/mopub/volley/Request;)Lcom/mopub/volley/Request;

    return-void
.end method


# virtual methods
.method public loadPositions(Ljava/lang/String;Lcom/mopub/nativeads/PositioningSource$PositioningListener;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/mopub/nativeads/PositioningSource$PositioningListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 108
    iget-object v0, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mRequest:Lcom/mopub/nativeads/PositioningRequest;

    if-eqz v0, :cond_0

    .line 109
    iget-object v0, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mRequest:Lcom/mopub/nativeads/PositioningRequest;

    invoke-virtual {v0}, Lcom/mopub/nativeads/PositioningRequest;->cancel()V

    const/4 v0, 0x0

    .line 110
    iput-object v0, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mRequest:Lcom/mopub/nativeads/PositioningRequest;

    .line 114
    :cond_0
    iget v0, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mRetryCount:I

    if-lez v0, :cond_1

    .line 115
    iget-object v0, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mRetryHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mRetryRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    .line 116
    iput v0, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mRetryCount:I

    .line 119
    :cond_1
    iput-object p2, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mListener:Lcom/mopub/nativeads/PositioningSource$PositioningListener;

    .line 120
    new-instance p2, Lcom/mopub/nativeads/PositioningUrlGenerator;

    iget-object v0, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mContext:Landroid/content/Context;

    invoke-direct {p2, v0}, Lcom/mopub/nativeads/PositioningUrlGenerator;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, p1}, Lcom/mopub/nativeads/PositioningUrlGenerator;->withAdUnitId(Ljava/lang/String;)Lcom/mopub/nativeads/PositioningUrlGenerator;

    move-result-object p1

    const-string p2, "ads.mopub.com"

    invoke-virtual {p1, p2}, Lcom/mopub/nativeads/PositioningUrlGenerator;->generateUrlString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mRetryUrl:Ljava/lang/String;

    .line 123
    invoke-direct {p0}, Lcom/mopub/nativeads/ServerPositioningSource;->requestPositioningInternal()V

    return-void
.end method

.method setMaximumRetryTimeMilliseconds(I)V
    .locals 0
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 161
    iput p1, p0, Lcom/mopub/nativeads/ServerPositioningSource;->mMaximumRetryTimeMillis:I

    return-void
.end method
