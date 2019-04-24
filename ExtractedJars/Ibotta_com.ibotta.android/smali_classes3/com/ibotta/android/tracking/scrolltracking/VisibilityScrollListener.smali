.class public Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;
.super Ljava/lang/Object;
.source "VisibilityScrollListener.java"

# interfaces
.implements Lcom/ibotta/android/tracking/scrolltracking/DataSetListener;
.implements Lcom/ibotta/android/tracking/scrolltracking/ScrollListener;


# static fields
.field public static final DEFAULT_PERCENTAGE_VISIBLE:D = 0.75


# instance fields
.field private debugTrackingLabel:Ljava/lang/String;

.field private enabled:Z

.field protected final insufficientlyVisibleChildren:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field protected final newTrackedChildren:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private observing:Z

.field protected final percentageVisible:D

.field protected final scrollDirection:Lcom/ibotta/android/tracking/scrolltracking/ScrollDirection;

.field protected scrollState:Lcom/ibotta/android/tracking/scrolltracking/ScrollState;

.field protected final scrollableViewWrapper:Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;

.field protected final sufficientlyVisibleChildren:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final trackRunnable:Ljava/lang/Runnable;

.field private final trackedView:Landroid/view/View;

.field private visibilityTrackingListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;DLandroid/view/View;)V
    .locals 6

    .line 44
    sget-object v4, Lcom/ibotta/android/tracking/scrolltracking/ScrollDirection;->VERTICAL:Lcom/ibotta/android/tracking/scrolltracking/ScrollDirection;

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;-><init>(Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;DLcom/ibotta/android/tracking/scrolltracking/ScrollDirection;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;DLcom/ibotta/android/tracking/scrolltracking/ScrollDirection;Landroid/view/View;)V
    .locals 1

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    sget-object v0, Lcom/ibotta/android/tracking/scrolltracking/ScrollState;->IDLE:Lcom/ibotta/android/tracking/scrolltracking/ScrollState;

    iput-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->scrollState:Lcom/ibotta/android/tracking/scrolltracking/ScrollState;

    .line 25
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->sufficientlyVisibleChildren:Ljava/util/Set;

    .line 26
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->insufficientlyVisibleChildren:Ljava/util/Set;

    .line 27
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->newTrackedChildren:Ljava/util/Set;

    const-string v0, ""

    .line 30
    iput-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->debugTrackingLabel:Ljava/lang/String;

    const/4 v0, 0x0

    .line 31
    iput-boolean v0, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->observing:Z

    const/4 v0, 0x1

    .line 32
    iput-boolean v0, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->enabled:Z

    .line 53
    iput-object p1, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->scrollableViewWrapper:Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;

    .line 54
    iput-wide p2, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->percentageVisible:D

    .line 55
    iput-object p4, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->scrollDirection:Lcom/ibotta/android/tracking/scrolltracking/ScrollDirection;

    .line 56
    iput-object p5, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->trackedView:Landroid/view/View;

    .line 57
    invoke-interface {p1, p0}, Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;->registerScrollListener(Lcom/ibotta/android/tracking/scrolltracking/ScrollListener;)V

    .line 58
    invoke-interface {p1, p0}, Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;->registerDataSetListener(Lcom/ibotta/android/tracking/scrolltracking/DataSetListener;)V

    .line 59
    iput-boolean v0, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->observing:Z

    .line 60
    new-instance p1, Lcom/ibotta/android/tracking/scrolltracking/-$$Lambda$xn6tdJSASZLuNCYqg3YSjXL-9f8;

    invoke-direct {p1, p0}, Lcom/ibotta/android/tracking/scrolltracking/-$$Lambda$xn6tdJSASZLuNCYqg3YSjXL-9f8;-><init>(Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;)V

    iput-object p1, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->trackRunnable:Ljava/lang/Runnable;

    .line 61
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->onDataChanged()V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;Landroid/view/View;)V
    .locals 2

    const-wide/high16 v0, 0x3fe8000000000000L    # 0.75

    .line 36
    invoke-direct {p0, p1, v0, v1, p2}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;-><init>(Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;DLandroid/view/View;)V

    return-void
.end method

.method private varargs debug(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3

    .line 298
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 300
    iget-object p2, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->debugTrackingLabel:Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    const-string p2, "%1$s: %2$s"

    const/4 v1, 0x2

    .line 301
    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->debugTrackingLabel:Ljava/lang/String;

    aput-object v2, v1, v0

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {p2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 304
    :cond_0
    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private findSufficientlyVisibleIndexes(II)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 216
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    :goto_0
    if-gt p1, p2, :cond_1

    .line 219
    iget-object v1, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->scrollableViewWrapper:Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;

    invoke-interface {v1, p1}, Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->isSufficientlyVisible(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 220
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private getVisibilityPercentage(Landroid/view/View;)D
    .locals 2

    .line 240
    sget-object v0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener$1;->$SwitchMap$com$ibotta$android$tracking$scrolltracking$ScrollDirection:[I

    iget-object v1, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->scrollDirection:Lcom/ibotta/android/tracking/scrolltracking/ScrollDirection;

    invoke-virtual {v1}, Lcom/ibotta/android/tracking/scrolltracking/ScrollDirection;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 246
    invoke-direct {p0, p1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->getVisibilityPercentageVertical(Landroid/view/View;)D

    move-result-wide v0

    goto :goto_0

    .line 242
    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->getVisibilityPercentageHorizontal(Landroid/view/View;)D

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method private getVisibilityPercentageHorizontal(Landroid/view/View;)D
    .locals 9

    .line 278
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    const-wide/16 v1, 0x0

    if-lez v0, :cond_0

    .line 280
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->scrollableViewWrapper:Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;->getWidth()I

    move-result v0

    int-to-double v3, v0

    .line 282
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    int-to-double v5, v0

    .line 283
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v0

    int-to-double v7, v0

    .line 285
    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    .line 286
    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->min(DD)D

    move-result-wide v2

    sub-double/2addr v2, v0

    .line 289
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-double v0, p1

    div-double v1, v2, v0

    :cond_0
    return-wide v1
.end method

.method private getVisibilityPercentageVertical(Landroid/view/View;)D
    .locals 9

    .line 256
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    const-wide/16 v1, 0x0

    if-lez v0, :cond_0

    .line 258
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->scrollableViewWrapper:Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;->getHeight()I

    move-result v0

    int-to-double v3, v0

    .line 260
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v0

    int-to-double v5, v0

    .line 261
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result v0

    int-to-double v7, v0

    .line 263
    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    .line 264
    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->min(DD)D

    move-result-wide v2

    sub-double/2addr v2, v0

    .line 267
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-double v0, p1

    div-double v1, v2, v0

    :cond_0
    return-wide v1
.end method

.method private isSufficientlyVisible(Landroid/view/View;)Z
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 232
    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->getVisibilityPercentage(Landroid/view/View;)D

    move-result-wide v1

    .line 234
    iget-wide v3, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->percentageVisible:D

    cmpl-double p1, v1, v3

    if-ltz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method private syncWithTrackableRows()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DefaultLocale"
        }
    .end annotation

    .line 105
    iget-boolean v0, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->enabled:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "Ignoring syncWithTrackableRows, not enabled."

    .line 106
    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 109
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->scrollableViewWrapper:Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;->getChildCount()I

    move-result v0

    if-gtz v0, :cond_1

    const-string v0, "Ignoring syncWithTrackableRows, no children detected."

    .line 110
    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    const-string v0, "Syncing with trackable rows now.: %1$d"

    const/4 v2, 0x1

    .line 114
    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->scrollableViewWrapper:Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;

    invoke-interface {v3}, Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;->getChildCount()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v1

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->sufficientlyVisibleChildren:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->insufficientlyVisibleChildren:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->trackedView:Landroid/view/View;

    iget-object v1, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->trackRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->trackedView:Landroid/view/View;

    iget-object v1, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->trackRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public isEnabled()Z
    .locals 1

    .line 75
    iget-boolean v0, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->enabled:Z

    return v0
.end method

.method public onDataChanged()V
    .locals 2

    .line 94
    iget-boolean v0, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->enabled:Z

    if-nez v0, :cond_0

    const-string v0, "Ignoring onChanged, currently disabled."

    const/4 v1, 0x0

    .line 95
    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 99
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->syncWithTrackableRows()V

    return-void
.end method

.method public onScrollStateChanged(Lcom/ibotta/android/tracking/scrolltracking/ScrollState;)V
    .locals 2
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 126
    iget-boolean v0, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->enabled:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string p1, "Ignoring onScrollStateChanged, currently disabled."

    .line 127
    new-array v0, v1, [Ljava/lang/Object;

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 130
    :cond_0
    iput-object p1, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->scrollState:Lcom/ibotta/android/tracking/scrolltracking/ScrollState;

    .line 132
    sget-object v0, Lcom/ibotta/android/tracking/scrolltracking/ScrollState;->IDLE:Lcom/ibotta/android/tracking/scrolltracking/ScrollState;

    if-ne p1, v0, :cond_1

    iget-boolean v0, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->observing:Z

    if-nez v0, :cond_1

    .line 133
    iget-object p1, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->scrollableViewWrapper:Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;

    invoke-interface {p1, p0}, Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;->registerDataSetListener(Lcom/ibotta/android/tracking/scrolltracking/DataSetListener;)V

    const/4 p1, 0x1

    .line 134
    iput-boolean p1, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->observing:Z

    .line 135
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->track()V

    goto :goto_0

    .line 136
    :cond_1
    sget-object v0, Lcom/ibotta/android/tracking/scrolltracking/ScrollState;->IDLE:Lcom/ibotta/android/tracking/scrolltracking/ScrollState;

    if-eq p1, v0, :cond_2

    iget-boolean p1, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->observing:Z

    if-eqz p1, :cond_2

    .line 137
    iget-object p1, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->scrollableViewWrapper:Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;

    invoke-interface {p1, p0}, Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;->unregisterDataSetListener(Lcom/ibotta/android/tracking/scrolltracking/DataSetListener;)V

    .line 138
    iput-boolean v1, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->observing:Z

    :cond_2
    :goto_0
    return-void
.end method

.method public reset()V
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->sufficientlyVisibleChildren:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->insufficientlyVisibleChildren:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->newTrackedChildren:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method

.method public setDebugTrackingLabel(Ljava/lang/String;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->debugTrackingLabel:Ljava/lang/String;

    return-void
.end method

.method public setEnabled(Z)V
    .locals 1
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 66
    iget-boolean v0, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->enabled:Z

    if-ne v0, p1, :cond_0

    return-void

    .line 70
    :cond_0
    iput-boolean p1, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->enabled:Z

    .line 71
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->onDataChanged()V

    return-void
.end method

.method public setVisibilityTrackingListener(Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 85
    iput-object p1, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->visibilityTrackingListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;

    return-void
.end method

.method protected track()V
    .locals 11
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 144
    iget-boolean v0, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->enabled:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "Ignoring track, not enabled."

    .line 145
    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 148
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->scrollableViewWrapper:Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;->getChildCount()I

    move-result v0

    if-gtz v0, :cond_1

    return-void

    .line 153
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->scrollableViewWrapper:Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;->getFirstVisibleViewIndex()I

    move-result v0

    .line 155
    iget-object v2, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->scrollableViewWrapper:Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;

    invoke-interface {v2}, Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;->getLastVisibleViewIndex()I

    move-result v2

    if-ge v2, v0, :cond_2

    move v2, v0

    .line 162
    :cond_2
    invoke-direct {p0, v0, v2}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->findSufficientlyVisibleIndexes(II)Ljava/util/Set;

    move-result-object v3

    .line 163
    new-instance v4, Ljava/util/LinkedHashSet;

    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 165
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    .line 166
    iget-object v6, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->scrollableViewWrapper:Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-interface {v6, v5}, Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;->getPositionForChildIndex(I)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 169
    :cond_3
    iget-object v3, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->newTrackedChildren:Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->clear()V

    .line 170
    iget-object v3, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->insufficientlyVisibleChildren:Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->clear()V

    .line 173
    iget-object v3, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->sufficientlyVisibleChildren:Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 174
    :cond_4
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x1

    if-eqz v5, :cond_5

    .line 175
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 176
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v4, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    const-string v7, "Stop tracking child=%1$d"

    .line 178
    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v6, v1

    invoke-direct {p0, v7, v6}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    .line 180
    iget-object v6, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->insufficientlyVisibleChildren:Ljava/util/Set;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v6, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 185
    :cond_5
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 186
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    .line 187
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 189
    iget-object v5, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->sufficientlyVisibleChildren:Ljava/util/Set;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v5, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    const-string v5, "Tracking newly visible child=%1$d"

    .line 191
    new-array v7, v6, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v1

    invoke-direct {p0, v5, v7}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    iget-object v5, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->sufficientlyVisibleChildren:Ljava/util/Set;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v5, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 193
    iget-object v5, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->newTrackedChildren:Ljava/util/Set;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v5, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    const-string v5, "Already tracked visible child=%1$d"

    .line 195
    new-array v7, v6, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v7, v1

    invoke-direct {p0, v5, v7}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 199
    :cond_7
    iget-object v3, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->scrollableViewWrapper:Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;

    invoke-interface {v3, v0}, Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->getVisibilityPercentage(Landroid/view/View;)D

    move-result-wide v3

    .line 200
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->scrollableViewWrapper:Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;

    invoke-interface {v0, v2}, Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->getVisibilityPercentage(Landroid/view/View;)D

    move-result-wide v7

    const-string v0, "First perc visible: %1$f%%"

    .line 202
    new-array v2, v6, [Ljava/lang/Object;

    const-wide/high16 v9, 0x4059000000000000L    # 100.0

    mul-double v3, v3, v9

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    aput-object v3, v2, v1

    invoke-direct {p0, v0, v2}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "Last perc visible: %1$f%%"

    .line 203
    new-array v2, v6, [Ljava/lang/Object;

    mul-double v7, v7, v9

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    aput-object v3, v2, v1

    invoke-direct {p0, v0, v2}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->visibilityTrackingListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;

    if-eqz v0, :cond_8

    .line 206
    iget-object v1, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->sufficientlyVisibleChildren:Ljava/util/Set;

    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;->onSufficientlyVisible(Ljava/util/Set;)V

    .line 207
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->visibilityTrackingListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;

    iget-object v1, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->insufficientlyVisibleChildren:Ljava/util/Set;

    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;->onInsufficientlyVisible(Ljava/util/Set;)V

    .line 209
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->newTrackedChildren:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 210
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->visibilityTrackingListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;

    iget-object v1, p0, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->newTrackedChildren:Ljava/util/Set;

    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;->onTrackChildren(Ljava/util/Set;)V

    :cond_8
    return-void
.end method
