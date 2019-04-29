.class Lcom/mopub/nativeads/VisibilityTracker$VisibilityChecker;
.super Ljava/lang/Object;
.source "VisibilityTracker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/nativeads/VisibilityTracker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "VisibilityChecker"
.end annotation


# instance fields
.field private final mClipRect:Landroid/graphics/Rect;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 245
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 247
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/mopub/nativeads/VisibilityTracker$VisibilityChecker;->mClipRect:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method hasRequiredTimeElapsed(JI)Z
    .locals 4

    .line 253
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    sub-long v2, v0, p1

    int-to-long p1, p3

    cmp-long p3, v2, p1

    if-ltz p3, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method isVisible(Landroid/view/View;Landroid/view/View;I)Z
    .locals 6
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-eqz p2, :cond_4

    .line 266
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 270
    :cond_0
    iget-object p1, p0, Lcom/mopub/nativeads/VisibilityTracker$VisibilityChecker;->mClipRect:Landroid/graphics/Rect;

    invoke-virtual {p2, p1}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    move-result p1

    if-nez p1, :cond_1

    return v0

    .line 276
    :cond_1
    iget-object p1, p0, Lcom/mopub/nativeads/VisibilityTracker$VisibilityChecker;->mClipRect:Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    int-to-long v1, p1

    iget-object p1, p0, Lcom/mopub/nativeads/VisibilityTracker$VisibilityChecker;->mClipRect:Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result p1

    int-to-long v3, p1

    mul-long/2addr v1, v3

    .line 277
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-long v3, p1

    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-long p1, p1

    mul-long/2addr v3, p1

    const-wide/16 p1, 0x0

    cmp-long v5, v3, p1

    if-gtz v5, :cond_2

    return v0

    :cond_2
    const-wide/16 p1, 0x64

    mul-long/2addr p1, v1

    int-to-long v1, p3

    mul-long/2addr v1, v3

    cmp-long p3, p1, v1

    if-ltz p3, :cond_3

    const/4 v0, 0x1

    :cond_3
    return v0

    :cond_4
    :goto_0
    return v0
.end method
