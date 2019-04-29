.class public final Lcom/mopub/nativeads/AdapterHelper;
.super Ljava/lang/Object;
.source "AdapterHelper.java"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private final mActivity:Ljava/lang/ref/WeakReference;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private final mApplicationContext:Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mInterval:I

.field private final mStart:I


# direct methods
.method public constructor <init>(Landroid/content/Context;II)V
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Context cannot be null."

    .line 29
    invoke-static {p1, v0}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    instance-of v0, p1, Landroid/app/Activity;

    const-string v1, "Context must be an Activity."

    invoke-static {v0, v1}, Lcom/mopub/common/Preconditions;->checkArgument(ZLjava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ltz p2, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    const-string v3, "start position must be non-negative"

    .line 31
    invoke-static {v2, v3}, Lcom/mopub/common/Preconditions;->checkArgument(ZLjava/lang/String;)V

    const/4 v2, 0x2

    if-lt p3, v2, :cond_1

    move v0, v1

    :cond_1
    const-string v1, "interval must be at least 2"

    .line 32
    invoke-static {v0, v1}, Lcom/mopub/common/Preconditions;->checkArgument(ZLjava/lang/String;)V

    .line 34
    new-instance v0, Ljava/lang/ref/WeakReference;

    move-object v1, p1

    check-cast v1, Landroid/app/Activity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/mopub/nativeads/AdapterHelper;->mActivity:Ljava/lang/ref/WeakReference;

    .line 35
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/nativeads/AdapterHelper;->mApplicationContext:Landroid/content/Context;

    .line 36
    iput p2, p0, Lcom/mopub/nativeads/AdapterHelper;->mStart:I

    .line 37
    iput p3, p0, Lcom/mopub/nativeads/AdapterHelper;->mInterval:I

    return-void
.end method

.method private numberOfAdsSeenUpToPosition(I)I
    .locals 4

    .line 87
    iget v0, p0, Lcom/mopub/nativeads/AdapterHelper;->mStart:I

    if-gt p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 92
    :cond_0
    iget v0, p0, Lcom/mopub/nativeads/AdapterHelper;->mStart:I

    sub-int/2addr p1, v0

    int-to-double v0, p1

    iget p1, p0, Lcom/mopub/nativeads/AdapterHelper;->mInterval:I

    int-to-double v2, p1

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int p1, v0

    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method private numberOfAdsThatCouldFitWithContent(I)I
    .locals 5

    .line 99
    iget v0, p0, Lcom/mopub/nativeads/AdapterHelper;->mStart:I

    if-gt p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 103
    :cond_0
    iget v0, p0, Lcom/mopub/nativeads/AdapterHelper;->mInterval:I

    add-int/lit8 v0, v0, -0x1

    .line 104
    iget v1, p0, Lcom/mopub/nativeads/AdapterHelper;->mStart:I

    sub-int v1, p1, v1

    rem-int/2addr v1, v0

    if-nez v1, :cond_1

    .line 106
    iget v1, p0, Lcom/mopub/nativeads/AdapterHelper;->mStart:I

    sub-int/2addr p1, v1

    div-int/2addr p1, v0

    return p1

    .line 109
    :cond_1
    iget v1, p0, Lcom/mopub/nativeads/AdapterHelper;->mStart:I

    sub-int/2addr p1, v1

    int-to-double v1, p1

    int-to-double v3, v0

    div-double/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int p1, v0

    add-int/lit8 p1, p1, 0x1

    return p1
.end method


# virtual methods
.method clearActivityContext()V
    .locals 1
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 117
    iget-object v0, p0, Lcom/mopub/nativeads/AdapterHelper;->mActivity:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->clear()V

    return-void
.end method

.method public getAdView(Landroid/view/View;Landroid/view/ViewGroup;Lcom/mopub/nativeads/NativeAd;Lcom/mopub/nativeads/ViewBinder;)Landroid/view/View;
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/mopub/nativeads/NativeAd;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/mopub/nativeads/ViewBinder;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 46
    iget-object v0, p0, Lcom/mopub/nativeads/AdapterHelper;->mActivity:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-nez v0, :cond_0

    const-string p1, "Weak reference to Activity Context in AdapterHelper became null. Returning empty view."

    .line 48
    invoke-static {p1}, Lcom/mopub/common/logging/MoPubLog;->w(Ljava/lang/String;)V

    .line 50
    new-instance p1, Landroid/view/View;

    iget-object p2, p0, Lcom/mopub/nativeads/AdapterHelper;->mApplicationContext:Landroid/content/Context;

    invoke-direct {p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    return-object p1

    .line 53
    :cond_0
    invoke-static {p1, p2, v0, p3, p4}, Lcom/mopub/nativeads/NativeAdViewHelper;->getAdView(Landroid/view/View;Landroid/view/ViewGroup;Landroid/app/Activity;Lcom/mopub/nativeads/NativeAd;Lcom/mopub/nativeads/ViewBinder;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public isAdPosition(I)Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 76
    iget v0, p0, Lcom/mopub/nativeads/AdapterHelper;->mStart:I

    const/4 v1, 0x0

    if-ge p1, v0, :cond_0

    return v1

    .line 80
    :cond_0
    iget v0, p0, Lcom/mopub/nativeads/AdapterHelper;->mStart:I

    sub-int/2addr p1, v0

    iget v0, p0, Lcom/mopub/nativeads/AdapterHelper;->mInterval:I

    rem-int/2addr p1, v0

    if-nez p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public shiftedCount(I)I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 65
    invoke-direct {p0, p1}, Lcom/mopub/nativeads/AdapterHelper;->numberOfAdsThatCouldFitWithContent(I)I

    move-result v0

    add-int/2addr p1, v0

    return p1
.end method

.method public shiftedPosition(I)I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 71
    invoke-direct {p0, p1}, Lcom/mopub/nativeads/AdapterHelper;->numberOfAdsSeenUpToPosition(I)I

    move-result v0

    sub-int/2addr p1, v0

    return p1
.end method
