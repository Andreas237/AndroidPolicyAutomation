.class Lcom/mopub/nativeads/ImpressionTracker$1;
.super Ljava/lang/Object;
.source "ImpressionTracker.java"

# interfaces
.implements Lcom/mopub/nativeads/VisibilityTracker$VisibilityTrackerListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mopub/nativeads/ImpressionTracker;-><init>(Ljava/util/Map;Ljava/util/Map;Lcom/mopub/nativeads/VisibilityTracker$VisibilityChecker;Lcom/mopub/nativeads/VisibilityTracker;Landroid/os/Handler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mopub/nativeads/ImpressionTracker;


# direct methods
.method constructor <init>(Lcom/mopub/nativeads/ImpressionTracker;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/mopub/nativeads/ImpressionTracker$1;->this$0:Lcom/mopub/nativeads/ImpressionTracker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onVisibilityChanged(Ljava/util/List;Ljava/util/List;)V
    .locals 4
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    .line 71
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 75
    iget-object v1, p0, Lcom/mopub/nativeads/ImpressionTracker$1;->this$0:Lcom/mopub/nativeads/ImpressionTracker;

    invoke-static {v1}, Lcom/mopub/nativeads/ImpressionTracker;->access$000(Lcom/mopub/nativeads/ImpressionTracker;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mopub/nativeads/ImpressionInterface;

    if-nez v1, :cond_0

    .line 77
    iget-object v1, p0, Lcom/mopub/nativeads/ImpressionTracker$1;->this$0:Lcom/mopub/nativeads/ImpressionTracker;

    invoke-virtual {v1, v0}, Lcom/mopub/nativeads/ImpressionTracker;->removeView(Landroid/view/View;)V

    goto :goto_0

    .line 82
    :cond_0
    iget-object v2, p0, Lcom/mopub/nativeads/ImpressionTracker$1;->this$0:Lcom/mopub/nativeads/ImpressionTracker;

    invoke-static {v2}, Lcom/mopub/nativeads/ImpressionTracker;->access$100(Lcom/mopub/nativeads/ImpressionTracker;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mopub/nativeads/TimestampWrapper;

    if-eqz v2, :cond_1

    .line 83
    iget-object v2, v2, Lcom/mopub/nativeads/TimestampWrapper;->mInstance:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    .line 88
    :cond_1
    iget-object v2, p0, Lcom/mopub/nativeads/ImpressionTracker$1;->this$0:Lcom/mopub/nativeads/ImpressionTracker;

    invoke-static {v2}, Lcom/mopub/nativeads/ImpressionTracker;->access$100(Lcom/mopub/nativeads/ImpressionTracker;)Ljava/util/Map;

    move-result-object v2

    new-instance v3, Lcom/mopub/nativeads/TimestampWrapper;

    invoke-direct {v3, v1}, Lcom/mopub/nativeads/TimestampWrapper;-><init>(Ljava/lang/Object;)V

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 91
    :cond_2
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    .line 92
    iget-object v0, p0, Lcom/mopub/nativeads/ImpressionTracker$1;->this$0:Lcom/mopub/nativeads/ImpressionTracker;

    invoke-static {v0}, Lcom/mopub/nativeads/ImpressionTracker;->access$100(Lcom/mopub/nativeads/ImpressionTracker;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 94
    :cond_3
    iget-object p1, p0, Lcom/mopub/nativeads/ImpressionTracker$1;->this$0:Lcom/mopub/nativeads/ImpressionTracker;

    invoke-virtual {p1}, Lcom/mopub/nativeads/ImpressionTracker;->scheduleNextPoll()V

    return-void
.end method
