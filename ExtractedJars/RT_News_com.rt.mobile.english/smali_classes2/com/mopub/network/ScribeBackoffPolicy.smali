.class public Lcom/mopub/network/ScribeBackoffPolicy;
.super Lcom/mopub/network/BackoffPolicy;
.source "ScribeBackoffPolicy.java"


# static fields
.field private static final BACKOFF_MULTIPLIER:I = 0x2

.field private static final DEFAULT_BACKOFF_TIME_MS:I = 0xea60

.field private static final MAX_RETRIES:I = 0x5


# direct methods
.method public constructor <init>()V
    .locals 3

    const v0, 0xea60

    const/4 v1, 0x5

    const/4 v2, 0x2

    .line 17
    invoke-direct {p0, v0, v1, v2}, Lcom/mopub/network/ScribeBackoffPolicy;-><init>(III)V

    return-void
.end method

.method constructor <init>(III)V
    .locals 0
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .line 21
    invoke-direct {p0}, Lcom/mopub/network/BackoffPolicy;-><init>()V

    .line 22
    iput p1, p0, Lcom/mopub/network/ScribeBackoffPolicy;->mDefaultBackoffTimeMs:I

    .line 23
    iput p2, p0, Lcom/mopub/network/ScribeBackoffPolicy;->mMaxRetries:I

    .line 24
    iput p3, p0, Lcom/mopub/network/ScribeBackoffPolicy;->mBackoffMultiplier:I

    return-void
.end method

.method private updateBackoffTime()V
    .locals 4

    .line 49
    iget v0, p0, Lcom/mopub/network/ScribeBackoffPolicy;->mBackoffMultiplier:I

    int-to-double v0, v0

    iget v2, p0, Lcom/mopub/network/ScribeBackoffPolicy;->mRetryCount:I

    int-to-double v2, v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    .line 50
    iget v2, p0, Lcom/mopub/network/ScribeBackoffPolicy;->mDefaultBackoffTimeMs:I

    int-to-double v2, v2

    mul-double/2addr v2, v0

    double-to-int v0, v2

    iput v0, p0, Lcom/mopub/network/ScribeBackoffPolicy;->mBackoffMs:I

    .line 51
    iget v0, p0, Lcom/mopub/network/ScribeBackoffPolicy;->mRetryCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/mopub/network/ScribeBackoffPolicy;->mRetryCount:I

    return-void
.end method


# virtual methods
.method public backoff(Lcom/mopub/volley/VolleyError;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mopub/volley/VolleyError;
        }
    .end annotation

    .line 29
    invoke-virtual {p0}, Lcom/mopub/network/ScribeBackoffPolicy;->hasAttemptRemaining()Z

    move-result v0

    if-nez v0, :cond_0

    .line 30
    throw p1

    .line 33
    :cond_0
    instance-of v0, p1, Lcom/mopub/volley/NoConnectionError;

    if-eqz v0, :cond_1

    .line 34
    invoke-direct {p0}, Lcom/mopub/network/ScribeBackoffPolicy;->updateBackoffTime()V

    return-void

    .line 38
    :cond_1
    iget-object v0, p1, Lcom/mopub/volley/VolleyError;->networkResponse:Lcom/mopub/volley/NetworkResponse;

    if-eqz v0, :cond_3

    .line 39
    iget v1, v0, Lcom/mopub/volley/NetworkResponse;->statusCode:I

    const/16 v2, 0x1f7

    if-eq v1, v2, :cond_2

    iget v0, v0, Lcom/mopub/volley/NetworkResponse;->statusCode:I

    const/16 v1, 0x1f8

    if-ne v0, v1, :cond_3

    .line 41
    :cond_2
    invoke-direct {p0}, Lcom/mopub/network/ScribeBackoffPolicy;->updateBackoffTime()V

    return-void

    .line 45
    :cond_3
    throw p1
.end method
