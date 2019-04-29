.class public abstract Lcom/mopub/network/BackoffPolicy;
.super Ljava/lang/Object;
.source "BackoffPolicy.java"


# instance fields
.field protected mBackoffMs:I

.field protected mBackoffMultiplier:I

.field protected mDefaultBackoffTimeMs:I

.field protected mMaxBackoffTimeMs:I

.field protected mMaxRetries:I

.field protected mRetryCount:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract backoff(Lcom/mopub/volley/VolleyError;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mopub/volley/VolleyError;
        }
    .end annotation
.end method

.method public getBackoffMs()I
    .locals 1

    .line 27
    iget v0, p0, Lcom/mopub/network/BackoffPolicy;->mBackoffMs:I

    return v0
.end method

.method public getRetryCount()I
    .locals 1

    .line 34
    iget v0, p0, Lcom/mopub/network/BackoffPolicy;->mRetryCount:I

    return v0
.end method

.method public hasAttemptRemaining()Z
    .locals 2

    .line 41
    iget v0, p0, Lcom/mopub/network/BackoffPolicy;->mRetryCount:I

    iget v1, p0, Lcom/mopub/network/BackoffPolicy;->mMaxRetries:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
