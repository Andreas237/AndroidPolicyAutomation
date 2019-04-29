.class Lcom/mopub/mraid/MraidScreenMetrics;
.super Ljava/lang/Object;
.source "MraidScreenMetrics.java"


# instance fields
.field private final mContext:Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mCurrentAdRect:Landroid/graphics/Rect;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mCurrentAdRectDips:Landroid/graphics/Rect;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mDefaultAdRect:Landroid/graphics/Rect;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mDefaultAdRectDips:Landroid/graphics/Rect;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mDensity:F

.field private final mRootViewRect:Landroid/graphics/Rect;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mRootViewRectDips:Landroid/graphics/Rect;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mScreenRect:Landroid/graphics/Rect;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mScreenRectDips:Landroid/graphics/Rect;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;F)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mContext:Landroid/content/Context;

    .line 33
    iput p2, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mDensity:F

    .line 35
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mScreenRect:Landroid/graphics/Rect;

    .line 36
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mScreenRectDips:Landroid/graphics/Rect;

    .line 38
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mRootViewRect:Landroid/graphics/Rect;

    .line 39
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mRootViewRectDips:Landroid/graphics/Rect;

    .line 41
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mCurrentAdRect:Landroid/graphics/Rect;

    .line 42
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mCurrentAdRectDips:Landroid/graphics/Rect;

    .line 44
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mDefaultAdRect:Landroid/graphics/Rect;

    .line 45
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mDefaultAdRectDips:Landroid/graphics/Rect;

    return-void
.end method

.method private convertToDips(Landroid/graphics/Rect;Landroid/graphics/Rect;)V
    .locals 4

    .line 49
    iget v0, p1, Landroid/graphics/Rect;->left:I

    int-to-float v0, v0

    iget-object v1, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mContext:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/mopub/common/util/Dips;->pixelsToIntDips(FLandroid/content/Context;)I

    move-result v0

    iget v1, p1, Landroid/graphics/Rect;->top:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mContext:Landroid/content/Context;

    invoke-static {v1, v2}, Lcom/mopub/common/util/Dips;->pixelsToIntDips(FLandroid/content/Context;)I

    move-result v1

    iget v2, p1, Landroid/graphics/Rect;->right:I

    int-to-float v2, v2

    iget-object v3, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mContext:Landroid/content/Context;

    invoke-static {v2, v3}, Lcom/mopub/common/util/Dips;->pixelsToIntDips(FLandroid/content/Context;)I

    move-result v2

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    int-to-float p1, p1

    iget-object v3, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mContext:Landroid/content/Context;

    invoke-static {p1, v3}, Lcom/mopub/common/util/Dips;->pixelsToIntDips(FLandroid/content/Context;)I

    move-result p1

    invoke-virtual {p2, v0, v1, v2, p1}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method


# virtual methods
.method getCurrentAdRect()Landroid/graphics/Rect;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 96
    iget-object v0, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mCurrentAdRect:Landroid/graphics/Rect;

    return-object v0
.end method

.method getCurrentAdRectDips()Landroid/graphics/Rect;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 101
    iget-object v0, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mCurrentAdRectDips:Landroid/graphics/Rect;

    return-object v0
.end method

.method getDefaultAdRect()Landroid/graphics/Rect;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 111
    iget-object v0, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mDefaultAdRect:Landroid/graphics/Rect;

    return-object v0
.end method

.method getDefaultAdRectDips()Landroid/graphics/Rect;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 116
    iget-object v0, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mDefaultAdRectDips:Landroid/graphics/Rect;

    return-object v0
.end method

.method public getDensity()F
    .locals 1

    .line 56
    iget v0, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mDensity:F

    return v0
.end method

.method getRootViewRect()Landroid/graphics/Rect;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 81
    iget-object v0, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mRootViewRect:Landroid/graphics/Rect;

    return-object v0
.end method

.method getRootViewRectDips()Landroid/graphics/Rect;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 86
    iget-object v0, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mRootViewRectDips:Landroid/graphics/Rect;

    return-object v0
.end method

.method getScreenRect()Landroid/graphics/Rect;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 66
    iget-object v0, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mScreenRect:Landroid/graphics/Rect;

    return-object v0
.end method

.method getScreenRectDips()Landroid/graphics/Rect;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 71
    iget-object v0, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mScreenRectDips:Landroid/graphics/Rect;

    return-object v0
.end method

.method setCurrentAdPosition(IIII)V
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mCurrentAdRect:Landroid/graphics/Rect;

    add-int/2addr p3, p1

    add-int/2addr p4, p2

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    .line 91
    iget-object p1, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mCurrentAdRect:Landroid/graphics/Rect;

    iget-object p2, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mCurrentAdRectDips:Landroid/graphics/Rect;

    invoke-direct {p0, p1, p2}, Lcom/mopub/mraid/MraidScreenMetrics;->convertToDips(Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    return-void
.end method

.method setDefaultAdPosition(IIII)V
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mDefaultAdRect:Landroid/graphics/Rect;

    add-int/2addr p3, p1

    add-int/2addr p4, p2

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    .line 106
    iget-object p1, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mDefaultAdRect:Landroid/graphics/Rect;

    iget-object p2, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mDefaultAdRectDips:Landroid/graphics/Rect;

    invoke-direct {p0, p1, p2}, Lcom/mopub/mraid/MraidScreenMetrics;->convertToDips(Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    return-void
.end method

.method setRootViewPosition(IIII)V
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mRootViewRect:Landroid/graphics/Rect;

    add-int/2addr p3, p1

    add-int/2addr p4, p2

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    .line 76
    iget-object p1, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mRootViewRect:Landroid/graphics/Rect;

    iget-object p2, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mRootViewRectDips:Landroid/graphics/Rect;

    invoke-direct {p0, p1, p2}, Lcom/mopub/mraid/MraidScreenMetrics;->convertToDips(Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    return-void
.end method

.method setScreenSize(II)V
    .locals 2

    .line 60
    iget-object v0, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mScreenRect:Landroid/graphics/Rect;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1, p1, p2}, Landroid/graphics/Rect;->set(IIII)V

    .line 61
    iget-object p1, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mScreenRect:Landroid/graphics/Rect;

    iget-object p2, p0, Lcom/mopub/mraid/MraidScreenMetrics;->mScreenRectDips:Landroid/graphics/Rect;

    invoke-direct {p0, p1, p2}, Lcom/mopub/mraid/MraidScreenMetrics;->convertToDips(Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    return-void
.end method
