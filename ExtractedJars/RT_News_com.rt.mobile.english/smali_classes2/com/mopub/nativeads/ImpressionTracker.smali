.class public Lcom/mopub/nativeads/ImpressionTracker;
.super Ljava/lang/Object;
.source "ImpressionTracker.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mopub/nativeads/ImpressionTracker$PollingRunnable;
    }
.end annotation


# static fields
.field private static final PERIOD:I = 0xfa


# instance fields
.field private final mPollHandler:Landroid/os/Handler;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mPollingRunnable:Lcom/mopub/nativeads/ImpressionTracker$PollingRunnable;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mPollingViews:Ljava/util/Map;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/view/View;",
            "Lcom/mopub/nativeads/TimestampWrapper<",
            "Lcom/mopub/nativeads/ImpressionInterface;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mTrackedViews:Ljava/util/Map;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/view/View;",
            "Lcom/mopub/nativeads/ImpressionInterface;",
            ">;"
        }
    .end annotation
.end field

.field private final mVisibilityChecker:Lcom/mopub/nativeads/VisibilityTracker$VisibilityChecker;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mVisibilityTracker:Lcom/mopub/nativeads/VisibilityTracker;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private mVisibilityTrackerListener:Lcom/mopub/nativeads/VisibilityTracker$VisibilityTrackerListener;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 6
    .param p1    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 50
    new-instance v1, Ljava/util/WeakHashMap;

    invoke-direct {v1}, Ljava/util/WeakHashMap;-><init>()V

    new-instance v2, Ljava/util/WeakHashMap;

    invoke-direct {v2}, Ljava/util/WeakHashMap;-><init>()V

    new-instance v3, Lcom/mopub/nativeads/VisibilityTracker$VisibilityChecker;

    invoke-direct {v3}, Lcom/mopub/nativeads/VisibilityTracker$VisibilityChecker;-><init>()V

    new-instance v4, Lcom/mopub/nativeads/VisibilityTracker;

    invoke-direct {v4, p1}, Lcom/mopub/nativeads/VisibilityTracker;-><init>(Landroid/app/Activity;)V

    new-instance v5, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {v5, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/mopub/nativeads/ImpressionTracker;-><init>(Ljava/util/Map;Ljava/util/Map;Lcom/mopub/nativeads/VisibilityTracker$VisibilityChecker;Lcom/mopub/nativeads/VisibilityTracker;Landroid/os/Handler;)V

    return-void
.end method

.method constructor <init>(Ljava/util/Map;Ljava/util/Map;Lcom/mopub/nativeads/VisibilityTracker$VisibilityChecker;Lcom/mopub/nativeads/VisibilityTracker;Landroid/os/Handler;)V
    .locals 0
    .param p1    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/mopub/nativeads/VisibilityTracker$VisibilityChecker;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/mopub/nativeads/VisibilityTracker;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Landroid/os/Handler;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Landroid/view/View;",
            "Lcom/mopub/nativeads/ImpressionInterface;",
            ">;",
            "Ljava/util/Map<",
            "Landroid/view/View;",
            "Lcom/mopub/nativeads/TimestampWrapper<",
            "Lcom/mopub/nativeads/ImpressionInterface;",
            ">;>;",
            "Lcom/mopub/nativeads/VisibilityTracker$VisibilityChecker;",
            "Lcom/mopub/nativeads/VisibilityTracker;",
            "Landroid/os/Handler;",
            ")V"
        }
    .end annotation

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    iput-object p1, p0, Lcom/mopub/nativeads/ImpressionTracker;->mTrackedViews:Ljava/util/Map;

    .line 64
    iput-object p2, p0, Lcom/mopub/nativeads/ImpressionTracker;->mPollingViews:Ljava/util/Map;

    .line 65
    iput-object p3, p0, Lcom/mopub/nativeads/ImpressionTracker;->mVisibilityChecker:Lcom/mopub/nativeads/VisibilityTracker$VisibilityChecker;

    .line 66
    iput-object p4, p0, Lcom/mopub/nativeads/ImpressionTracker;->mVisibilityTracker:Lcom/mopub/nativeads/VisibilityTracker;

    .line 68
    new-instance p1, Lcom/mopub/nativeads/ImpressionTracker$1;

    invoke-direct {p1, p0}, Lcom/mopub/nativeads/ImpressionTracker$1;-><init>(Lcom/mopub/nativeads/ImpressionTracker;)V

    iput-object p1, p0, Lcom/mopub/nativeads/ImpressionTracker;->mVisibilityTrackerListener:Lcom/mopub/nativeads/VisibilityTracker$VisibilityTrackerListener;

    .line 97
    iget-object p1, p0, Lcom/mopub/nativeads/ImpressionTracker;->mVisibilityTracker:Lcom/mopub/nativeads/VisibilityTracker;

    iget-object p2, p0, Lcom/mopub/nativeads/ImpressionTracker;->mVisibilityTrackerListener:Lcom/mopub/nativeads/VisibilityTracker$VisibilityTrackerListener;

    invoke-virtual {p1, p2}, Lcom/mopub/nativeads/VisibilityTracker;->setVisibilityTrackerListener(Lcom/mopub/nativeads/VisibilityTracker$VisibilityTrackerListener;)V

    .line 99
    iput-object p5, p0, Lcom/mopub/nativeads/ImpressionTracker;->mPollHandler:Landroid/os/Handler;

    .line 100
    new-instance p1, Lcom/mopub/nativeads/ImpressionTracker$PollingRunnable;

    invoke-direct {p1, p0}, Lcom/mopub/nativeads/ImpressionTracker$PollingRunnable;-><init>(Lcom/mopub/nativeads/ImpressionTracker;)V

    iput-object p1, p0, Lcom/mopub/nativeads/ImpressionTracker;->mPollingRunnable:Lcom/mopub/nativeads/ImpressionTracker$PollingRunnable;

    return-void
.end method

.method static synthetic access$000(Lcom/mopub/nativeads/ImpressionTracker;)Ljava/util/Map;
    .locals 0

    .line 24
    iget-object p0, p0, Lcom/mopub/nativeads/ImpressionTracker;->mTrackedViews:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic access$100(Lcom/mopub/nativeads/ImpressionTracker;)Ljava/util/Map;
    .locals 0

    .line 24
    iget-object p0, p0, Lcom/mopub/nativeads/ImpressionTracker;->mPollingViews:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic access$200(Lcom/mopub/nativeads/ImpressionTracker;)Lcom/mopub/nativeads/VisibilityTracker$VisibilityChecker;
    .locals 0

    .line 24
    iget-object p0, p0, Lcom/mopub/nativeads/ImpressionTracker;->mVisibilityChecker:Lcom/mopub/nativeads/VisibilityTracker$VisibilityChecker;

    return-object p0
.end method

.method private removePollingView(Landroid/view/View;)V
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/mopub/nativeads/ImpressionTracker;->mPollingViews:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public addView(Landroid/view/View;Lcom/mopub/nativeads/ImpressionInterface;)V
    .locals 1
    .param p2    # Lcom/mopub/nativeads/ImpressionInterface;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 108
    iget-object v0, p0, Lcom/mopub/nativeads/ImpressionTracker;->mTrackedViews:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p2, :cond_0

    return-void

    .line 113
    :cond_0
    invoke-virtual {p0, p1}, Lcom/mopub/nativeads/ImpressionTracker;->removeView(Landroid/view/View;)V

    .line 115
    invoke-interface {p2}, Lcom/mopub/nativeads/ImpressionInterface;->isImpressionRecorded()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 119
    :cond_1
    iget-object v0, p0, Lcom/mopub/nativeads/ImpressionTracker;->mTrackedViews:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    iget-object v0, p0, Lcom/mopub/nativeads/ImpressionTracker;->mVisibilityTracker:Lcom/mopub/nativeads/VisibilityTracker;

    invoke-interface {p2}, Lcom/mopub/nativeads/ImpressionInterface;->getImpressionMinPercentageViewed()I

    move-result p2

    invoke-virtual {v0, p1, p2}, Lcom/mopub/nativeads/VisibilityTracker;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public clear()V
    .locals 2

    .line 133
    iget-object v0, p0, Lcom/mopub/nativeads/ImpressionTracker;->mTrackedViews:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 134
    iget-object v0, p0, Lcom/mopub/nativeads/ImpressionTracker;->mPollingViews:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 135
    iget-object v0, p0, Lcom/mopub/nativeads/ImpressionTracker;->mVisibilityTracker:Lcom/mopub/nativeads/VisibilityTracker;

    invoke-virtual {v0}, Lcom/mopub/nativeads/VisibilityTracker;->clear()V

    .line 136
    iget-object v0, p0, Lcom/mopub/nativeads/ImpressionTracker;->mPollHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    return-void
.end method

.method public destroy()V
    .locals 1

    .line 140
    invoke-virtual {p0}, Lcom/mopub/nativeads/ImpressionTracker;->clear()V

    .line 141
    iget-object v0, p0, Lcom/mopub/nativeads/ImpressionTracker;->mVisibilityTracker:Lcom/mopub/nativeads/VisibilityTracker;

    invoke-virtual {v0}, Lcom/mopub/nativeads/VisibilityTracker;->destroy()V

    const/4 v0, 0x0

    .line 142
    iput-object v0, p0, Lcom/mopub/nativeads/ImpressionTracker;->mVisibilityTrackerListener:Lcom/mopub/nativeads/VisibilityTracker$VisibilityTrackerListener;

    return-void
.end method

.method getVisibilityTrackerListener()Lcom/mopub/nativeads/VisibilityTracker$VisibilityTrackerListener;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 204
    iget-object v0, p0, Lcom/mopub/nativeads/ImpressionTracker;->mVisibilityTrackerListener:Lcom/mopub/nativeads/VisibilityTracker$VisibilityTrackerListener;

    return-object v0
.end method

.method public removeView(Landroid/view/View;)V
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/mopub/nativeads/ImpressionTracker;->mTrackedViews:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    invoke-direct {p0, p1}, Lcom/mopub/nativeads/ImpressionTracker;->removePollingView(Landroid/view/View;)V

    .line 126
    iget-object v0, p0, Lcom/mopub/nativeads/ImpressionTracker;->mVisibilityTracker:Lcom/mopub/nativeads/VisibilityTracker;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/VisibilityTracker;->removeView(Landroid/view/View;)V

    return-void
.end method

.method scheduleNextPoll()V
    .locals 4
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .line 148
    iget-object v0, p0, Lcom/mopub/nativeads/ImpressionTracker;->mPollHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 152
    :cond_0
    iget-object v0, p0, Lcom/mopub/nativeads/ImpressionTracker;->mPollHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/mopub/nativeads/ImpressionTracker;->mPollingRunnable:Lcom/mopub/nativeads/ImpressionTracker$PollingRunnable;

    const-wide/16 v2, 0xfa

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
