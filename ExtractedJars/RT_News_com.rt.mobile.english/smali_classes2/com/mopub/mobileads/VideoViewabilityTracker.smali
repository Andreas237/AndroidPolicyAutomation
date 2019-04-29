.class public Lcom/mopub/mobileads/VideoViewabilityTracker;
.super Lcom/mopub/mobileads/VastTracker;
.source "VideoViewabilityTracker.java"


# instance fields
.field private final mPercentViewable:I

.field private final mViewablePlaytimeMS:I


# direct methods
.method public constructor <init>(IILjava/lang/String;)V
    .locals 0
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 11
    invoke-direct {p0, p3}, Lcom/mopub/mobileads/VastTracker;-><init>(Ljava/lang/String;)V

    .line 12
    iput p1, p0, Lcom/mopub/mobileads/VideoViewabilityTracker;->mViewablePlaytimeMS:I

    .line 13
    iput p2, p0, Lcom/mopub/mobileads/VideoViewabilityTracker;->mPercentViewable:I

    return-void
.end method


# virtual methods
.method public getPercentViewable()I
    .locals 1

    .line 21
    iget v0, p0, Lcom/mopub/mobileads/VideoViewabilityTracker;->mPercentViewable:I

    return v0
.end method

.method public getViewablePlaytimeMS()I
    .locals 1

    .line 17
    iget v0, p0, Lcom/mopub/mobileads/VideoViewabilityTracker;->mViewablePlaytimeMS:I

    return v0
.end method
