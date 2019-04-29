.class Lcom/mopub/nativeads/VisibilityTracker$VisibilityRunnable;
.super Ljava/lang/Object;
.source "VisibilityTracker.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/nativeads/VisibilityTracker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "VisibilityRunnable"
.end annotation


# instance fields
.field private final mInvisibleViews:Ljava/util/ArrayList;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private final mVisibleViews:Ljava/util/ArrayList;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/mopub/nativeads/VisibilityTracker;


# direct methods
.method constructor <init>(Lcom/mopub/nativeads/VisibilityTracker;)V
    .locals 0

    .line 214
    iput-object p1, p0, Lcom/mopub/nativeads/VisibilityTracker$VisibilityRunnable;->this$0:Lcom/mopub/nativeads/VisibilityTracker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 215
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/mopub/nativeads/VisibilityTracker$VisibilityRunnable;->mInvisibleViews:Ljava/util/ArrayList;

    .line 216
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/mopub/nativeads/VisibilityTracker$VisibilityRunnable;->mVisibleViews:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 221
    iget-object v0, p0, Lcom/mopub/nativeads/VisibilityTracker$VisibilityRunnable;->this$0:Lcom/mopub/nativeads/VisibilityTracker;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/mopub/nativeads/VisibilityTracker;->access$002(Lcom/mopub/nativeads/VisibilityTracker;Z)Z

    .line 222
    iget-object v0, p0, Lcom/mopub/nativeads/VisibilityTracker$VisibilityRunnable;->this$0:Lcom/mopub/nativeads/VisibilityTracker;

    invoke-static {v0}, Lcom/mopub/nativeads/VisibilityTracker;->access$100(Lcom/mopub/nativeads/VisibilityTracker;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 223
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    .line 224
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/mopub/nativeads/VisibilityTracker$TrackingInfo;

    iget v3, v3, Lcom/mopub/nativeads/VisibilityTracker$TrackingInfo;->mMinViewablePercent:I

    .line 225
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/mopub/nativeads/VisibilityTracker$TrackingInfo;

    iget v4, v4, Lcom/mopub/nativeads/VisibilityTracker$TrackingInfo;->mMaxInvisiblePercent:I

    .line 226
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mopub/nativeads/VisibilityTracker$TrackingInfo;

    iget-object v1, v1, Lcom/mopub/nativeads/VisibilityTracker$TrackingInfo;->mRootView:Landroid/view/View;

    .line 228
    iget-object v5, p0, Lcom/mopub/nativeads/VisibilityTracker$VisibilityRunnable;->this$0:Lcom/mopub/nativeads/VisibilityTracker;

    invoke-static {v5}, Lcom/mopub/nativeads/VisibilityTracker;->access$200(Lcom/mopub/nativeads/VisibilityTracker;)Lcom/mopub/nativeads/VisibilityTracker$VisibilityChecker;

    move-result-object v5

    invoke-virtual {v5, v1, v2, v3}, Lcom/mopub/nativeads/VisibilityTracker$VisibilityChecker;->isVisible(Landroid/view/View;Landroid/view/View;I)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 229
    iget-object v1, p0, Lcom/mopub/nativeads/VisibilityTracker$VisibilityRunnable;->mVisibleViews:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 230
    :cond_1
    iget-object v3, p0, Lcom/mopub/nativeads/VisibilityTracker$VisibilityRunnable;->this$0:Lcom/mopub/nativeads/VisibilityTracker;

    invoke-static {v3}, Lcom/mopub/nativeads/VisibilityTracker;->access$200(Lcom/mopub/nativeads/VisibilityTracker;)Lcom/mopub/nativeads/VisibilityTracker$VisibilityChecker;

    move-result-object v3

    invoke-virtual {v3, v1, v2, v4}, Lcom/mopub/nativeads/VisibilityTracker$VisibilityChecker;->isVisible(Landroid/view/View;Landroid/view/View;I)Z

    move-result v1

    if-nez v1, :cond_0

    .line 231
    iget-object v1, p0, Lcom/mopub/nativeads/VisibilityTracker$VisibilityRunnable;->mInvisibleViews:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 235
    :cond_2
    iget-object v0, p0, Lcom/mopub/nativeads/VisibilityTracker$VisibilityRunnable;->this$0:Lcom/mopub/nativeads/VisibilityTracker;

    invoke-static {v0}, Lcom/mopub/nativeads/VisibilityTracker;->access$300(Lcom/mopub/nativeads/VisibilityTracker;)Lcom/mopub/nativeads/VisibilityTracker$VisibilityTrackerListener;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 236
    iget-object v0, p0, Lcom/mopub/nativeads/VisibilityTracker$VisibilityRunnable;->this$0:Lcom/mopub/nativeads/VisibilityTracker;

    invoke-static {v0}, Lcom/mopub/nativeads/VisibilityTracker;->access$300(Lcom/mopub/nativeads/VisibilityTracker;)Lcom/mopub/nativeads/VisibilityTracker$VisibilityTrackerListener;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/nativeads/VisibilityTracker$VisibilityRunnable;->mVisibleViews:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/mopub/nativeads/VisibilityTracker$VisibilityRunnable;->mInvisibleViews:Ljava/util/ArrayList;

    invoke-interface {v0, v1, v2}, Lcom/mopub/nativeads/VisibilityTracker$VisibilityTrackerListener;->onVisibilityChanged(Ljava/util/List;Ljava/util/List;)V

    .line 240
    :cond_3
    iget-object v0, p0, Lcom/mopub/nativeads/VisibilityTracker$VisibilityRunnable;->mVisibleViews:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 241
    iget-object v0, p0, Lcom/mopub/nativeads/VisibilityTracker$VisibilityRunnable;->mInvisibleViews:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method
