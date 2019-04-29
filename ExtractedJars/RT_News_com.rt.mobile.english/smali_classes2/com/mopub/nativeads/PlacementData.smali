.class Lcom/mopub/nativeads/PlacementData;
.super Ljava/lang/Object;
.source "PlacementData.java"


# static fields
.field private static final MAX_ADS:I = 0xc8

.field public static final NOT_FOUND:I = -0x1


# instance fields
.field private final mAdjustedAdPositions:[I
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private mDesiredCount:I

.field private final mDesiredInsertionPositions:[I
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mDesiredOriginalPositions:[I
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mNativeAds:[Lcom/mopub/nativeads/NativeAd;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mOriginalAdPositions:[I
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private mPlacedCount:I


# direct methods
.method private constructor <init>([I)V
    .locals 3
    .param p1    # [I
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 144
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xc8

    .line 133
    new-array v1, v0, [I

    iput-object v1, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredOriginalPositions:[I

    .line 134
    new-array v1, v0, [I

    iput-object v1, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredInsertionPositions:[I

    const/4 v1, 0x0

    .line 135
    iput v1, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredCount:I

    .line 136
    new-array v2, v0, [I

    iput-object v2, p0, Lcom/mopub/nativeads/PlacementData;->mOriginalAdPositions:[I

    .line 137
    new-array v2, v0, [I

    iput-object v2, p0, Lcom/mopub/nativeads/PlacementData;->mAdjustedAdPositions:[I

    .line 138
    new-array v2, v0, [Lcom/mopub/nativeads/NativeAd;

    iput-object v2, p0, Lcom/mopub/nativeads/PlacementData;->mNativeAds:[Lcom/mopub/nativeads/NativeAd;

    .line 139
    iput v1, p0, Lcom/mopub/nativeads/PlacementData;->mPlacedCount:I

    .line 145
    array-length v2, p1

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredCount:I

    .line 146
    iget-object v0, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredInsertionPositions:[I

    iget v2, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredCount:I

    invoke-static {p1, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 147
    iget-object v0, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredOriginalPositions:[I

    iget v2, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredCount:I

    invoke-static {p1, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method private static binarySearch([IIII)I
    .locals 2

    add-int/lit8 p2, p2, -0x1

    :goto_0
    if-gt p1, p2, :cond_2

    add-int v0, p1, p2

    ushr-int/lit8 v0, v0, 0x1

    .line 515
    aget v1, p0, v0

    if-ge v1, p3, :cond_0

    add-int/lit8 v0, v0, 0x1

    move p1, v0

    goto :goto_0

    :cond_0
    if-le v1, p3, :cond_1

    add-int/lit8 v0, v0, -0x1

    move p2, v0

    goto :goto_0

    :cond_1
    return v0

    :cond_2
    xor-int/lit8 p0, p1, -0x1

    return p0
.end method

.method private static binarySearchFirstEquals([III)I
    .locals 1

    const/4 v0, 0x0

    .line 473
    invoke-static {p0, v0, p1, p2}, Lcom/mopub/nativeads/PlacementData;->binarySearch([IIII)I

    move-result p1

    if-gez p1, :cond_0

    xor-int/lit8 p0, p1, -0x1

    return p0

    .line 481
    :cond_0
    aget p2, p0, p1

    :goto_0
    if-ltz p1, :cond_1

    .line 482
    aget v0, p0, p1

    if-ne v0, p2, :cond_1

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method private static binarySearchGreaterThan([III)I
    .locals 2

    const/4 v0, 0x0

    .line 490
    invoke-static {p0, v0, p1, p2}, Lcom/mopub/nativeads/PlacementData;->binarySearch([IIII)I

    move-result p2

    if-gez p2, :cond_0

    xor-int/lit8 p0, p2, -0x1

    return p0

    .line 498
    :cond_0
    aget v0, p0, p2

    :goto_0
    if-ge p2, p1, :cond_1

    .line 499
    aget v1, p0, p2

    if-ne v1, v0, :cond_1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    return p2
.end method

.method static empty()Lcom/mopub/nativeads/PlacementData;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 177
    new-instance v0, Lcom/mopub/nativeads/PlacementData;

    const/4 v1, 0x0

    new-array v1, v1, [I

    invoke-direct {v0, v1}, Lcom/mopub/nativeads/PlacementData;-><init>([I)V

    return-object v0
.end method

.method static fromAdPositioning(Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;)Lcom/mopub/nativeads/PlacementData;
    .locals 6
    .param p0    # Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 152
    invoke-virtual {p0}, Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;->getFixedPositions()Ljava/util/List;

    move-result-object v0

    .line 153
    invoke-virtual {p0}, Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;->getRepeatingInterval()I

    move-result p0

    const v1, 0x7fffffff

    if-ne p0, v1, :cond_0

    .line 155
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    goto :goto_0

    :cond_0
    const/16 v1, 0xc8

    .line 156
    :goto_0
    new-array v2, v1, [I

    .line 162
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    move v4, v3

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    .line 163
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    sub-int/2addr v4, v3

    add-int/lit8 v5, v3, 0x1

    .line 164
    aput v4, v2, v3

    move v3, v5

    goto :goto_1

    :cond_1
    :goto_2
    if-ge v3, v1, :cond_2

    add-int/2addr v4, p0

    add-int/lit8 v4, v4, -0x1

    add-int/lit8 v0, v3, 0x1

    .line 170
    aput v4, v2, v3

    move v3, v0

    goto :goto_2

    .line 172
    :cond_2
    new-instance p0, Lcom/mopub/nativeads/PlacementData;

    invoke-direct {p0, v2}, Lcom/mopub/nativeads/PlacementData;-><init>([I)V

    return-object p0
.end method


# virtual methods
.method clearAds()V
    .locals 3

    .line 409
    iget v0, p0, Lcom/mopub/nativeads/PlacementData;->mPlacedCount:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 413
    iget-object v1, p0, Lcom/mopub/nativeads/PlacementData;->mAdjustedAdPositions:[I

    iget v2, p0, Lcom/mopub/nativeads/PlacementData;->mPlacedCount:I

    add-int/lit8 v2, v2, -0x1

    aget v1, v1, v2

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/mopub/nativeads/PlacementData;->clearAdsInRange(II)I

    return-void
.end method

.method clearAdsInRange(II)I
    .locals 9

    .line 348
    iget v0, p0, Lcom/mopub/nativeads/PlacementData;->mPlacedCount:I

    new-array v0, v0, [I

    .line 349
    iget v1, p0, Lcom/mopub/nativeads/PlacementData;->mPlacedCount:I

    new-array v1, v1, [I

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    .line 354
    :goto_0
    iget v5, p0, Lcom/mopub/nativeads/PlacementData;->mPlacedCount:I

    if-ge v3, v5, :cond_2

    .line 355
    iget-object v5, p0, Lcom/mopub/nativeads/PlacementData;->mOriginalAdPositions:[I

    aget v5, v5, v3

    .line 356
    iget-object v6, p0, Lcom/mopub/nativeads/PlacementData;->mAdjustedAdPositions:[I

    aget v6, v6, v3

    if-gt p1, v6, :cond_0

    if-ge v6, p2, :cond_0

    .line 360
    aput v5, v0, v4

    sub-int/2addr v6, v4

    .line 361
    aput v6, v1, v4

    .line 364
    iget-object v5, p0, Lcom/mopub/nativeads/PlacementData;->mNativeAds:[Lcom/mopub/nativeads/NativeAd;

    aget-object v5, v5, v3

    invoke-virtual {v5}, Lcom/mopub/nativeads/NativeAd;->destroy()V

    .line 365
    iget-object v5, p0, Lcom/mopub/nativeads/PlacementData;->mNativeAds:[Lcom/mopub/nativeads/NativeAd;

    const/4 v6, 0x0

    aput-object v6, v5, v3

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    if-lez v4, :cond_1

    sub-int v7, v3, v4

    .line 370
    iget-object v8, p0, Lcom/mopub/nativeads/PlacementData;->mOriginalAdPositions:[I

    aput v5, v8, v7

    .line 371
    iget-object v5, p0, Lcom/mopub/nativeads/PlacementData;->mAdjustedAdPositions:[I

    sub-int/2addr v6, v4

    aput v6, v5, v7

    .line 372
    iget-object v5, p0, Lcom/mopub/nativeads/PlacementData;->mNativeAds:[Lcom/mopub/nativeads/NativeAd;

    iget-object v6, p0, Lcom/mopub/nativeads/PlacementData;->mNativeAds:[Lcom/mopub/nativeads/NativeAd;

    aget-object v6, v6, v3

    aput-object v6, v5, v7

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    if-nez v4, :cond_3

    return v2

    .line 384
    :cond_3
    aget p1, v1, v2

    .line 385
    iget-object p2, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredInsertionPositions:[I

    iget v3, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredCount:I

    invoke-static {p2, v3, p1}, Lcom/mopub/nativeads/PlacementData;->binarySearchFirstEquals([III)I

    move-result p1

    .line 387
    iget p2, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredCount:I

    add-int/lit8 p2, p2, -0x1

    :goto_2
    if-lt p2, p1, :cond_4

    .line 388
    iget-object v3, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredOriginalPositions:[I

    add-int v5, p2, v4

    iget-object v6, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredOriginalPositions:[I

    aget v6, v6, p2

    aput v6, v3, v5

    .line 389
    iget-object v3, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredInsertionPositions:[I

    iget-object v6, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredInsertionPositions:[I

    aget v6, v6, p2

    sub-int/2addr v6, v4

    aput v6, v3, v5

    add-int/lit8 p2, p2, -0x1

    goto :goto_2

    :cond_4
    :goto_3
    if-ge v2, v4, :cond_5

    .line 394
    iget-object p2, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredOriginalPositions:[I

    add-int v3, p1, v2

    aget v5, v0, v2

    aput v5, p2, v3

    .line 395
    iget-object p2, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredInsertionPositions:[I

    aget v5, v1, v2

    aput v5, p2, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 399
    :cond_5
    iget p1, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredCount:I

    add-int/2addr p1, v4

    iput p1, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredCount:I

    .line 400
    iget p1, p0, Lcom/mopub/nativeads/PlacementData;->mPlacedCount:I

    sub-int/2addr p1, v4

    iput p1, p0, Lcom/mopub/nativeads/PlacementData;->mPlacedCount:I

    return v4
.end method

.method getAdjustedCount(I)I
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    add-int/lit8 p1, p1, -0x1

    .line 337
    invoke-virtual {p0, p1}, Lcom/mopub/nativeads/PlacementData;->getAdjustedPosition(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method getAdjustedPosition(I)I
    .locals 2

    .line 313
    iget-object v0, p0, Lcom/mopub/nativeads/PlacementData;->mOriginalAdPositions:[I

    iget v1, p0, Lcom/mopub/nativeads/PlacementData;->mPlacedCount:I

    invoke-static {v0, v1, p1}, Lcom/mopub/nativeads/PlacementData;->binarySearchGreaterThan([III)I

    move-result v0

    add-int/2addr p1, v0

    return p1
.end method

.method getOriginalCount(I)I
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    add-int/lit8 p1, p1, -0x1

    .line 326
    invoke-virtual {p0, p1}, Lcom/mopub/nativeads/PlacementData;->getOriginalPosition(I)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    add-int/lit8 v0, p1, 0x1

    :goto_0
    return v0
.end method

.method getOriginalPosition(I)I
    .locals 3

    .line 297
    iget-object v0, p0, Lcom/mopub/nativeads/PlacementData;->mAdjustedAdPositions:[I

    iget v1, p0, Lcom/mopub/nativeads/PlacementData;->mPlacedCount:I

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, p1}, Lcom/mopub/nativeads/PlacementData;->binarySearch([IIII)I

    move-result v0

    const/4 v1, -0x1

    if-gez v0, :cond_0

    xor-int/2addr v0, v1

    sub-int/2addr p1, v0

    return p1

    :cond_0
    return v1
.end method

.method getPlacedAd(I)Lcom/mopub/nativeads/NativeAd;
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 275
    iget-object v0, p0, Lcom/mopub/nativeads/PlacementData;->mAdjustedAdPositions:[I

    iget v1, p0, Lcom/mopub/nativeads/PlacementData;->mPlacedCount:I

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, p1}, Lcom/mopub/nativeads/PlacementData;->binarySearch([IIII)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 279
    :cond_0
    iget-object v0, p0, Lcom/mopub/nativeads/PlacementData;->mNativeAds:[Lcom/mopub/nativeads/NativeAd;

    aget-object p1, v0, p1

    return-object p1
.end method

.method getPlacedAdPositions()[I
    .locals 4
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 288
    iget v0, p0, Lcom/mopub/nativeads/PlacementData;->mPlacedCount:I

    new-array v0, v0, [I

    .line 289
    iget-object v1, p0, Lcom/mopub/nativeads/PlacementData;->mAdjustedAdPositions:[I

    iget v2, p0, Lcom/mopub/nativeads/PlacementData;->mPlacedCount:I

    const/4 v3, 0x0

    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method insertItem(I)V
    .locals 3

    .line 422
    iget-object v0, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredOriginalPositions:[I

    iget v1, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredCount:I

    invoke-static {v0, v1, p1}, Lcom/mopub/nativeads/PlacementData;->binarySearchFirstEquals([III)I

    move-result v0

    .line 424
    :goto_0
    iget v1, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredCount:I

    if-ge v0, v1, :cond_0

    .line 425
    iget-object v1, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredOriginalPositions:[I

    aget v2, v1, v0

    add-int/lit8 v2, v2, 0x1

    aput v2, v1, v0

    .line 426
    iget-object v1, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredInsertionPositions:[I

    aget v2, v1, v0

    add-int/lit8 v2, v2, 0x1

    aput v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 430
    :cond_0
    iget-object v0, p0, Lcom/mopub/nativeads/PlacementData;->mOriginalAdPositions:[I

    iget v1, p0, Lcom/mopub/nativeads/PlacementData;->mPlacedCount:I

    invoke-static {v0, v1, p1}, Lcom/mopub/nativeads/PlacementData;->binarySearchFirstEquals([III)I

    move-result p1

    .line 432
    :goto_1
    iget v0, p0, Lcom/mopub/nativeads/PlacementData;->mPlacedCount:I

    if-ge p1, v0, :cond_1

    .line 433
    iget-object v0, p0, Lcom/mopub/nativeads/PlacementData;->mOriginalAdPositions:[I

    aget v1, v0, p1

    add-int/lit8 v1, v1, 0x1

    aput v1, v0, p1

    .line 434
    iget-object v0, p0, Lcom/mopub/nativeads/PlacementData;->mAdjustedAdPositions:[I

    aget v1, v0, p1

    add-int/lit8 v1, v1, 0x1

    aput v1, v0, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method isPlacedAd(I)Z
    .locals 3

    .line 265
    iget-object v0, p0, Lcom/mopub/nativeads/PlacementData;->mAdjustedAdPositions:[I

    iget v1, p0, Lcom/mopub/nativeads/PlacementData;->mPlacedCount:I

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, p1}, Lcom/mopub/nativeads/PlacementData;->binarySearch([IIII)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 v2, 0x1

    :cond_0
    return v2
.end method

.method moveItem(II)V
    .locals 0

    .line 468
    invoke-virtual {p0, p1}, Lcom/mopub/nativeads/PlacementData;->removeItem(I)V

    .line 469
    invoke-virtual {p0, p2}, Lcom/mopub/nativeads/PlacementData;->insertItem(I)V

    return-void
.end method

.method nextInsertionPosition(I)I
    .locals 2

    .line 193
    iget-object v0, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredInsertionPositions:[I

    iget v1, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredCount:I

    invoke-static {v0, v1, p1}, Lcom/mopub/nativeads/PlacementData;->binarySearchGreaterThan([III)I

    move-result p1

    .line 195
    iget v0, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredCount:I

    if-ne p1, v0, :cond_0

    const/4 p1, -0x1

    return p1

    .line 198
    :cond_0
    iget-object v0, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredInsertionPositions:[I

    aget p1, v0, p1

    return p1
.end method

.method placeAd(ILcom/mopub/nativeads/NativeAd;)V
    .locals 7

    .line 219
    iget-object v0, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredInsertionPositions:[I

    iget v1, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredCount:I

    invoke-static {v0, v1, p1}, Lcom/mopub/nativeads/PlacementData;->binarySearchFirstEquals([III)I

    move-result v0

    .line 221
    iget v1, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredCount:I

    if-eq v0, v1, :cond_4

    iget-object v1, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredInsertionPositions:[I

    aget v1, v1, v0

    if-eq v1, p1, :cond_0

    goto/16 :goto_2

    .line 228
    :cond_0
    iget-object v1, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredOriginalPositions:[I

    aget v1, v1, v0

    .line 229
    iget-object v2, p0, Lcom/mopub/nativeads/PlacementData;->mOriginalAdPositions:[I

    iget v3, p0, Lcom/mopub/nativeads/PlacementData;->mPlacedCount:I

    invoke-static {v2, v3, v1}, Lcom/mopub/nativeads/PlacementData;->binarySearchGreaterThan([III)I

    move-result v2

    .line 231
    iget v3, p0, Lcom/mopub/nativeads/PlacementData;->mPlacedCount:I

    if-ge v2, v3, :cond_1

    .line 232
    iget v3, p0, Lcom/mopub/nativeads/PlacementData;->mPlacedCount:I

    sub-int/2addr v3, v2

    .line 233
    iget-object v4, p0, Lcom/mopub/nativeads/PlacementData;->mOriginalAdPositions:[I

    iget-object v5, p0, Lcom/mopub/nativeads/PlacementData;->mOriginalAdPositions:[I

    add-int/lit8 v6, v2, 0x1

    invoke-static {v4, v2, v5, v6, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 235
    iget-object v4, p0, Lcom/mopub/nativeads/PlacementData;->mAdjustedAdPositions:[I

    iget-object v5, p0, Lcom/mopub/nativeads/PlacementData;->mAdjustedAdPositions:[I

    invoke-static {v4, v2, v5, v6, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 237
    iget-object v4, p0, Lcom/mopub/nativeads/PlacementData;->mNativeAds:[Lcom/mopub/nativeads/NativeAd;

    iget-object v5, p0, Lcom/mopub/nativeads/PlacementData;->mNativeAds:[Lcom/mopub/nativeads/NativeAd;

    invoke-static {v4, v2, v5, v6, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 239
    :cond_1
    iget-object v3, p0, Lcom/mopub/nativeads/PlacementData;->mOriginalAdPositions:[I

    aput v1, v3, v2

    .line 240
    iget-object v1, p0, Lcom/mopub/nativeads/PlacementData;->mAdjustedAdPositions:[I

    aput p1, v1, v2

    .line 241
    iget-object p1, p0, Lcom/mopub/nativeads/PlacementData;->mNativeAds:[Lcom/mopub/nativeads/NativeAd;

    aput-object p2, p1, v2

    .line 242
    iget p1, p0, Lcom/mopub/nativeads/PlacementData;->mPlacedCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/mopub/nativeads/PlacementData;->mPlacedCount:I

    .line 245
    iget p1, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredCount:I

    sub-int/2addr p1, v0

    add-int/lit8 p1, p1, -0x1

    .line 246
    iget-object p2, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredInsertionPositions:[I

    add-int/lit8 v1, v0, 0x1

    iget-object v3, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredInsertionPositions:[I

    invoke-static {p2, v1, v3, v0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 248
    iget-object p2, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredOriginalPositions:[I

    iget-object v3, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredOriginalPositions:[I

    invoke-static {p2, v1, v3, v0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 250
    iget p1, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredCount:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredCount:I

    .line 253
    :goto_0
    iget p1, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredCount:I

    if-ge v0, p1, :cond_2

    .line 254
    iget-object p1, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredInsertionPositions:[I

    aget p2, p1, v0

    add-int/lit8 p2, p2, 0x1

    aput p2, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 256
    iget p1, p0, Lcom/mopub/nativeads/PlacementData;->mPlacedCount:I

    if-ge v2, p1, :cond_3

    .line 257
    iget-object p1, p0, Lcom/mopub/nativeads/PlacementData;->mAdjustedAdPositions:[I

    aget p2, p1, v2

    add-int/lit8 p2, p2, 0x1

    aput p2, p1, v2

    goto :goto_1

    :cond_3
    return-void

    :cond_4
    :goto_2
    const-string p1, "Attempted to insert an ad at an invalid position"

    .line 223
    invoke-static {p1}, Lcom/mopub/common/logging/MoPubLog;->w(Ljava/lang/String;)V

    return-void
.end method

.method previousInsertionPosition(I)I
    .locals 2

    .line 206
    iget-object v0, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredInsertionPositions:[I

    iget v1, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredCount:I

    invoke-static {v0, v1, p1}, Lcom/mopub/nativeads/PlacementData;->binarySearchFirstEquals([III)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, -0x1

    return p1

    .line 211
    :cond_0
    iget-object v0, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredInsertionPositions:[I

    add-int/lit8 p1, p1, -0x1

    aget p1, v0, p1

    return p1
.end method

.method removeItem(I)V
    .locals 3

    .line 446
    iget-object v0, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredOriginalPositions:[I

    iget v1, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredCount:I

    invoke-static {v0, v1, p1}, Lcom/mopub/nativeads/PlacementData;->binarySearchGreaterThan([III)I

    move-result v0

    .line 450
    :goto_0
    iget v1, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredCount:I

    if-ge v0, v1, :cond_0

    .line 451
    iget-object v1, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredOriginalPositions:[I

    aget v2, v1, v0

    add-int/lit8 v2, v2, -0x1

    aput v2, v1, v0

    .line 452
    iget-object v1, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredInsertionPositions:[I

    aget v2, v1, v0

    add-int/lit8 v2, v2, -0x1

    aput v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 455
    :cond_0
    iget-object v0, p0, Lcom/mopub/nativeads/PlacementData;->mOriginalAdPositions:[I

    iget v1, p0, Lcom/mopub/nativeads/PlacementData;->mPlacedCount:I

    invoke-static {v0, v1, p1}, Lcom/mopub/nativeads/PlacementData;->binarySearchGreaterThan([III)I

    move-result p1

    .line 458
    :goto_1
    iget v0, p0, Lcom/mopub/nativeads/PlacementData;->mPlacedCount:I

    if-ge p1, v0, :cond_1

    .line 459
    iget-object v0, p0, Lcom/mopub/nativeads/PlacementData;->mOriginalAdPositions:[I

    aget v1, v0, p1

    add-int/lit8 v1, v1, -0x1

    aput v1, v0, p1

    .line 460
    iget-object v0, p0, Lcom/mopub/nativeads/PlacementData;->mAdjustedAdPositions:[I

    aget v1, v0, p1

    add-int/lit8 v1, v1, -0x1

    aput v1, v0, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method shouldPlaceAd(I)Z
    .locals 3

    .line 184
    iget-object v0, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredInsertionPositions:[I

    iget v1, p0, Lcom/mopub/nativeads/PlacementData;->mDesiredCount:I

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, p1}, Lcom/mopub/nativeads/PlacementData;->binarySearch([IIII)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 v2, 0x1

    :cond_0
    return v2
.end method
