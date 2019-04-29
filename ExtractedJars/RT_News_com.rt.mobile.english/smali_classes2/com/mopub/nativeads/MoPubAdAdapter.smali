.class public Lcom/mopub/nativeads/MoPubAdAdapter;
.super Landroid/widget/BaseAdapter;
.source "MoPubAdAdapter.java"


# instance fields
.field private mAdLoadedListener:Lcom/mopub/nativeads/MoPubNativeAdLoadedListener;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final mOriginalAdapter:Landroid/widget/Adapter;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mViewPositionMap:Ljava/util/WeakHashMap;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Landroid/view/View;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final mVisibilityTracker:Lcom/mopub/nativeads/VisibilityTracker;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/widget/Adapter;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/widget/Adapter;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 59
    invoke-static {}, Lcom/mopub/nativeads/MoPubNativeAdPositioning;->serverPositioning()Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubServerPositioning;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/mopub/nativeads/MoPubAdAdapter;-><init>(Landroid/app/Activity;Landroid/widget/Adapter;Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubServerPositioning;)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Landroid/widget/Adapter;Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/widget/Adapter;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 88
    new-instance v0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-direct {v0, p1, p3}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;-><init>(Landroid/app/Activity;Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;)V

    new-instance p3, Lcom/mopub/nativeads/VisibilityTracker;

    invoke-direct {p3, p1}, Lcom/mopub/nativeads/VisibilityTracker;-><init>(Landroid/app/Activity;)V

    invoke-direct {p0, v0, p2, p3}, Lcom/mopub/nativeads/MoPubAdAdapter;-><init>(Lcom/mopub/nativeads/MoPubStreamAdPlacer;Landroid/widget/Adapter;Lcom/mopub/nativeads/VisibilityTracker;)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Landroid/widget/Adapter;Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubServerPositioning;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/widget/Adapter;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubServerPositioning;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 73
    new-instance v0, Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-direct {v0, p1, p3}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;-><init>(Landroid/app/Activity;Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubServerPositioning;)V

    new-instance p3, Lcom/mopub/nativeads/VisibilityTracker;

    invoke-direct {p3, p1}, Lcom/mopub/nativeads/VisibilityTracker;-><init>(Landroid/app/Activity;)V

    invoke-direct {p0, v0, p2, p3}, Lcom/mopub/nativeads/MoPubAdAdapter;-><init>(Lcom/mopub/nativeads/MoPubStreamAdPlacer;Landroid/widget/Adapter;Lcom/mopub/nativeads/VisibilityTracker;)V

    return-void
.end method

.method constructor <init>(Lcom/mopub/nativeads/MoPubStreamAdPlacer;Landroid/widget/Adapter;Lcom/mopub/nativeads/VisibilityTracker;)V
    .locals 0
    .param p1    # Lcom/mopub/nativeads/MoPubStreamAdPlacer;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/widget/Adapter;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/mopub/nativeads/VisibilityTracker;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .line 95
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 96
    iput-object p2, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mOriginalAdapter:Landroid/widget/Adapter;

    .line 97
    iput-object p1, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    .line 98
    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mViewPositionMap:Ljava/util/WeakHashMap;

    .line 100
    iput-object p3, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mVisibilityTracker:Lcom/mopub/nativeads/VisibilityTracker;

    .line 101
    iget-object p1, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mVisibilityTracker:Lcom/mopub/nativeads/VisibilityTracker;

    new-instance p2, Lcom/mopub/nativeads/MoPubAdAdapter$1;

    invoke-direct {p2, p0}, Lcom/mopub/nativeads/MoPubAdAdapter$1;-><init>(Lcom/mopub/nativeads/MoPubAdAdapter;)V

    invoke-virtual {p1, p2}, Lcom/mopub/nativeads/VisibilityTracker;->setVisibilityTrackerListener(Lcom/mopub/nativeads/VisibilityTracker$VisibilityTrackerListener;)V

    .line 108
    iget-object p1, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mOriginalAdapter:Landroid/widget/Adapter;

    new-instance p2, Lcom/mopub/nativeads/MoPubAdAdapter$2;

    invoke-direct {p2, p0}, Lcom/mopub/nativeads/MoPubAdAdapter$2;-><init>(Lcom/mopub/nativeads/MoPubAdAdapter;)V

    invoke-interface {p1, p2}, Landroid/widget/Adapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 121
    iget-object p1, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    new-instance p2, Lcom/mopub/nativeads/MoPubAdAdapter$3;

    invoke-direct {p2, p0}, Lcom/mopub/nativeads/MoPubAdAdapter$3;-><init>(Lcom/mopub/nativeads/MoPubAdAdapter;)V

    invoke-virtual {p1, p2}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->setAdLoadedListener(Lcom/mopub/nativeads/MoPubNativeAdLoadedListener;)V

    .line 134
    iget-object p1, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    iget-object p2, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mOriginalAdapter:Landroid/widget/Adapter;

    invoke-interface {p2}, Landroid/widget/Adapter;->getCount()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->setItemCount(I)V

    return-void
.end method

.method static synthetic access$000(Lcom/mopub/nativeads/MoPubAdAdapter;Ljava/util/List;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1}, Lcom/mopub/nativeads/MoPubAdAdapter;->handleVisibilityChange(Ljava/util/List;)V

    return-void
.end method

.method static synthetic access$100(Lcom/mopub/nativeads/MoPubAdAdapter;)Landroid/widget/Adapter;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mOriginalAdapter:Landroid/widget/Adapter;

    return-object p0
.end method

.method static synthetic access$200(Lcom/mopub/nativeads/MoPubAdAdapter;)Lcom/mopub/nativeads/MoPubStreamAdPlacer;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    return-object p0
.end method

.method private handleVisibilityChange(Ljava/util/List;)V
    .locals 4
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    .line 393
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const v0, 0x7fffffff

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    .line 394
    iget-object v3, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mViewPositionMap:Ljava/util/WeakHashMap;

    invoke-virtual {v3, v2}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-nez v2, :cond_0

    goto :goto_0

    .line 398
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 399
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_0

    .line 401
    :cond_1
    iget-object p1, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->placeAdsInRange(II)V

    return-void
.end method


# virtual methods
.method public areAllItemsEnabled()Z
    .locals 1

    .line 261
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mOriginalAdapter:Landroid/widget/Adapter;

    instance-of v0, v0, Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mOriginalAdapter:Landroid/widget/Adapter;

    check-cast v0, Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->areAllItemsEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public clearAds()V
    .locals 1

    .line 242
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-virtual {v0}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->clearAds()V

    return-void
.end method

.method public destroy()V
    .locals 1

    .line 255
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-virtual {v0}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->destroy()V

    .line 256
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mVisibilityTracker:Lcom/mopub/nativeads/VisibilityTracker;

    invoke-virtual {v0}, Lcom/mopub/nativeads/VisibilityTracker;->destroy()V

    return-void
.end method

.method public getAdjustedPosition(I)I
    .locals 1

    .line 423
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->getAdjustedPosition(I)I

    move-result p1

    return p1
.end method

.method public getCount()I
    .locals 2

    .line 280
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    iget-object v1, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mOriginalAdapter:Landroid/widget/Adapter;

    invoke-interface {v1}, Landroid/widget/Adapter;->getCount()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->getAdjustedCount(I)I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 292
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->getAdData(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 296
    :cond_0
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mOriginalAdapter:Landroid/widget/Adapter;

    iget-object v1, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-virtual {v1, p1}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->getOriginalPosition(I)I

    move-result p1

    invoke-interface {v0, p1}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    .line 310
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->getAdData(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 312
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p1

    neg-int p1, p1

    int-to-long v0, p1

    return-wide v0

    .line 314
    :cond_0
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mOriginalAdapter:Landroid/widget/Adapter;

    iget-object v1, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-virtual {v1, p1}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->getOriginalPosition(I)I

    move-result p1

    invoke-interface {v0, p1}, Landroid/widget/Adapter;->getItemId(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 2

    .line 359
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->getAdViewType(I)I

    move-result v0

    if-eqz v0, :cond_0

    .line 361
    iget-object p1, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mOriginalAdapter:Landroid/widget/Adapter;

    invoke-interface {p1}, Landroid/widget/Adapter;->getViewTypeCount()I

    move-result p1

    add-int/2addr v0, p1

    add-int/lit8 v0, v0, -0x1

    return v0

    .line 363
    :cond_0
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mOriginalAdapter:Landroid/widget/Adapter;

    iget-object v1, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-virtual {v1, p1}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->getOriginalPosition(I)I

    move-result p1

    invoke-interface {v0, p1}, Landroid/widget/Adapter;->getItemViewType(I)I

    move-result p1

    return p1
.end method

.method public getOriginalPosition(I)I
    .locals 1

    .line 412
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->getOriginalPosition(I)I

    move-result p1

    return p1
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 337
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-virtual {v0, p1, p2, p3}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->getAdView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 341
    :cond_0
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mOriginalAdapter:Landroid/widget/Adapter;

    iget-object v1, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-virtual {v1, p1}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->getOriginalPosition(I)I

    move-result v1

    invoke-interface {v0, v1, p2, p3}, Landroid/widget/Adapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 344
    :goto_0
    iget-object p2, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mViewPositionMap:Ljava/util/WeakHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    iget-object p1, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mVisibilityTracker:Lcom/mopub/nativeads/VisibilityTracker;

    const/4 p2, 0x0

    invoke-virtual {p1, v0, p2}, Lcom/mopub/nativeads/VisibilityTracker;->addView(Landroid/view/View;I)V

    return-object v0
.end method

.method public getViewTypeCount()I
    .locals 2

    .line 375
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mOriginalAdapter:Landroid/widget/Adapter;

    invoke-interface {v0}, Landroid/widget/Adapter;->getViewTypeCount()I

    move-result v0

    iget-object v1, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-virtual {v1}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->getAdViewTypeCount()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method handleAdLoaded(I)V
    .locals 1
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .line 139
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mAdLoadedListener:Lcom/mopub/nativeads/MoPubNativeAdLoadedListener;

    if-eqz v0, :cond_0

    .line 140
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mAdLoadedListener:Lcom/mopub/nativeads/MoPubNativeAdLoadedListener;

    invoke-interface {v0, p1}, Lcom/mopub/nativeads/MoPubNativeAdLoadedListener;->onAdLoaded(I)V

    .line 142
    :cond_0
    invoke-virtual {p0}, Lcom/mopub/nativeads/MoPubAdAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method handleAdRemoved(I)V
    .locals 1
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .line 147
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mAdLoadedListener:Lcom/mopub/nativeads/MoPubNativeAdLoadedListener;

    if-eqz v0, :cond_0

    .line 148
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mAdLoadedListener:Lcom/mopub/nativeads/MoPubNativeAdLoadedListener;

    invoke-interface {v0, p1}, Lcom/mopub/nativeads/MoPubNativeAdLoadedListener;->onAdRemoved(I)V

    .line 150
    :cond_0
    invoke-virtual {p0}, Lcom/mopub/nativeads/MoPubAdAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public hasStableIds()Z
    .locals 1

    .line 324
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mOriginalAdapter:Landroid/widget/Adapter;

    invoke-interface {v0}, Landroid/widget/Adapter;->hasStableIds()Z

    move-result v0

    return v0
.end method

.method public insertItem(I)V
    .locals 1

    .line 441
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->insertItem(I)V

    return-void
.end method

.method public isAd(I)Z
    .locals 1

    .line 228
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->isAd(I)Z

    move-result p1

    return p1
.end method

.method public isEmpty()Z
    .locals 2

    .line 385
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mOriginalAdapter:Landroid/widget/Adapter;

    invoke-interface {v0}, Landroid/widget/Adapter;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-virtual {v0, v1}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->getAdjustedCount(I)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public isEnabled(I)Z
    .locals 2

    .line 267
    invoke-virtual {p0, p1}, Lcom/mopub/nativeads/MoPubAdAdapter;->isAd(I)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mOriginalAdapter:Landroid/widget/Adapter;

    instance-of v0, v0, Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mOriginalAdapter:Landroid/widget/Adapter;

    check-cast v0, Landroid/widget/ListAdapter;

    iget-object v1, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-virtual {v1, p1}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->getOriginalPosition(I)I

    move-result p1

    invoke-interface {v0, p1}, Landroid/widget/ListAdapter;->isEnabled(I)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public loadAds(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 195
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->loadAds(Ljava/lang/String;)V

    return-void
.end method

.method public loadAds(Ljava/lang/String;Lcom/mopub/nativeads/RequestParameters;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/mopub/nativeads/RequestParameters;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 214
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-virtual {v0, p1, p2}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->loadAds(Ljava/lang/String;Lcom/mopub/nativeads/RequestParameters;)V

    return-void
.end method

.method public refreshAds(Landroid/widget/ListView;Ljava/lang/String;)V
    .locals 1
    .param p1    # Landroid/widget/ListView;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 601
    invoke-virtual {p0, p1, p2, v0}, Lcom/mopub/nativeads/MoPubAdAdapter;->refreshAds(Landroid/widget/ListView;Ljava/lang/String;Lcom/mopub/nativeads/RequestParameters;)V

    return-void
.end method

.method public refreshAds(Landroid/widget/ListView;Ljava/lang/String;Lcom/mopub/nativeads/RequestParameters;)V
    .locals 7
    .param p1    # Landroid/widget/ListView;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/mopub/nativeads/RequestParameters;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const-string v0, "You called MoPubAdAdapter.refreshAds with a null ListView"

    .line 615
    invoke-static {p1, v0}, Lcom/mopub/common/Preconditions$NoThrow;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 621
    invoke-virtual {p1, v0}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_1

    move v1, v0

    goto :goto_0

    .line 622
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    .line 625
    :goto_0
    invoke-virtual {p1}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v2

    add-int/lit8 v3, v2, -0x1

    .line 626
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 627
    :goto_1
    iget-object v4, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-virtual {v4, v3}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->isAd(I)Z

    move-result v4

    if-eqz v4, :cond_2

    if-lez v3, :cond_2

    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    .line 630
    :cond_2
    invoke-virtual {p1}, Landroid/widget/ListView;->getLastVisiblePosition()I

    move-result v4

    .line 631
    :goto_2
    iget-object v5, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-virtual {v5, v4}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->isAd(I)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {p0}, Lcom/mopub/nativeads/MoPubAdAdapter;->getCount()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    if-ge v4, v5, :cond_3

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 634
    :cond_3
    iget-object v5, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-virtual {v5, v3}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->getOriginalPosition(I)I

    move-result v3

    .line 635
    iget-object v5, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v5, v4}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->getOriginalCount(I)I

    move-result v4

    .line 638
    iget-object v5, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-virtual {p0}, Lcom/mopub/nativeads/MoPubAdAdapter;->getCount()I

    move-result v6

    invoke-virtual {v5, v6}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->getOriginalCount(I)I

    move-result v5

    .line 639
    iget-object v6, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-virtual {v6, v4, v5}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->removeAdsInRange(II)I

    .line 640
    iget-object v4, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-virtual {v4, v0, v3}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->removeAdsInRange(II)I

    move-result v0

    if-lez v0, :cond_4

    sub-int/2addr v2, v0

    .line 644
    invoke-virtual {p1, v2, v1}, Landroid/widget/ListView;->setSelectionFromTop(II)V

    .line 646
    :cond_4
    invoke-virtual {p0, p2, p3}, Lcom/mopub/nativeads/MoPubAdAdapter;->loadAds(Ljava/lang/String;Lcom/mopub/nativeads/RequestParameters;)V

    return-void
.end method

.method public final registerAdRenderer(Lcom/mopub/nativeads/MoPubAdRenderer;)V
    .locals 1
    .param p1    # Lcom/mopub/nativeads/MoPubAdRenderer;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "Tried to set a null ad renderer on the placer."

    .line 163
    invoke-static {p1, v0}, Lcom/mopub/common/Preconditions$NoThrow;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 167
    :cond_0
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->registerAdRenderer(Lcom/mopub/nativeads/MoPubAdRenderer;)V

    return-void
.end method

.method public removeItem(I)V
    .locals 1

    .line 459
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->removeItem(I)V

    return-void
.end method

.method public final setAdLoadedListener(Lcom/mopub/nativeads/MoPubNativeAdLoadedListener;)V
    .locals 0
    .param p1    # Lcom/mopub/nativeads/MoPubNativeAdLoadedListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 183
    iput-object p1, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mAdLoadedListener:Lcom/mopub/nativeads/MoPubNativeAdLoadedListener;

    return-void
.end method

.method public setOnClickListener(Landroid/widget/ListView;Landroid/widget/AdapterView$OnItemClickListener;)V
    .locals 1
    .param p1    # Landroid/widget/ListView;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/widget/AdapterView$OnItemClickListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const-string v0, "You called MoPubAdAdapter.setOnClickListener with a null ListView"

    .line 473
    invoke-static {p1, v0}, Lcom/mopub/common/Preconditions$NoThrow;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p2, :cond_1

    const/4 p2, 0x0

    .line 478
    invoke-virtual {p1, p2}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    return-void

    .line 482
    :cond_1
    new-instance v0, Lcom/mopub/nativeads/MoPubAdAdapter$4;

    invoke-direct {v0, p0, p2}, Lcom/mopub/nativeads/MoPubAdAdapter$4;-><init>(Lcom/mopub/nativeads/MoPubAdAdapter;Landroid/widget/AdapterView$OnItemClickListener;)V

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    return-void
.end method

.method public setOnItemLongClickListener(Landroid/widget/ListView;Landroid/widget/AdapterView$OnItemLongClickListener;)V
    .locals 1
    .param p1    # Landroid/widget/ListView;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/widget/AdapterView$OnItemLongClickListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const-string v0, "You called MoPubAdAdapter.setOnItemLongClickListener with a null ListView"

    .line 505
    invoke-static {p1, v0}, Lcom/mopub/common/Preconditions$NoThrow;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p2, :cond_1

    const/4 p2, 0x0

    .line 510
    invoke-virtual {p1, p2}, Landroid/widget/ListView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    return-void

    .line 514
    :cond_1
    new-instance v0, Lcom/mopub/nativeads/MoPubAdAdapter$5;

    invoke-direct {v0, p0, p2}, Lcom/mopub/nativeads/MoPubAdAdapter$5;-><init>(Lcom/mopub/nativeads/MoPubAdAdapter;Landroid/widget/AdapterView$OnItemLongClickListener;)V

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    return-void
.end method

.method public setOnItemSelectedListener(Landroid/widget/ListView;Landroid/widget/AdapterView$OnItemSelectedListener;)V
    .locals 1
    .param p1    # Landroid/widget/ListView;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/widget/AdapterView$OnItemSelectedListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const-string v0, "You called MoPubAdAdapter.setOnItemSelectedListener with a null ListView"

    .line 533
    invoke-static {p1, v0}, Lcom/mopub/common/Preconditions$NoThrow;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p2, :cond_1

    const/4 p2, 0x0

    .line 538
    invoke-virtual {p1, p2}, Landroid/widget/ListView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    return-void

    .line 542
    :cond_1
    new-instance v0, Lcom/mopub/nativeads/MoPubAdAdapter$6;

    invoke-direct {v0, p0, p2}, Lcom/mopub/nativeads/MoPubAdAdapter$6;-><init>(Lcom/mopub/nativeads/MoPubAdAdapter;Landroid/widget/AdapterView$OnItemSelectedListener;)V

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    return-void
.end method

.method public setSelection(Landroid/widget/ListView;I)V
    .locals 1
    .param p1    # Landroid/widget/ListView;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "You called MoPubAdAdapter.setSelection with a null ListView"

    .line 567
    invoke-static {p1, v0}, Lcom/mopub/common/Preconditions$NoThrow;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 572
    :cond_0
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-virtual {v0, p2}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->getAdjustedPosition(I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/ListView;->setSelection(I)V

    return-void
.end method

.method public smoothScrollToPosition(Landroid/widget/ListView;I)V
    .locals 1
    .param p1    # Landroid/widget/ListView;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "You called MoPubAdAdapter.smoothScrollToPosition with a null ListView"

    .line 584
    invoke-static {p1, v0}, Lcom/mopub/common/Preconditions$NoThrow;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 589
    :cond_0
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter;->mStreamAdPlacer:Lcom/mopub/nativeads/MoPubStreamAdPlacer;

    invoke-virtual {v0, p2}, Lcom/mopub/nativeads/MoPubStreamAdPlacer;->getAdjustedPosition(I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/ListView;->smoothScrollToPosition(I)V

    return-void
.end method
