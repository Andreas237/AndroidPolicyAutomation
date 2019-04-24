.class Lcom/moat/analytics/mobile/spck/f;
.super Lcom/moat/analytics/mobile/spck/i;

# interfaces
.implements Lcom/google/android/exoplayer/ExoPlayer$Listener;
.implements Lcom/moat/analytics/mobile/spck/ExoVideoTracker;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/moat/analytics/mobile/spck/i<",
        "Lcom/google/android/exoplayer/ExoPlayer;",
        ">;",
        "Lcom/google/android/exoplayer/ExoPlayer$Listener;",
        "Lcom/moat/analytics/mobile/spck/ExoVideoTracker;"
    }
.end annotation


# instance fields
.field private m:I

.field private n:I

.field private o:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/moat/analytics/mobile/spck/i;-><init>(Ljava/lang/String;)V

    const/4 p1, -0x1

    iput p1, p0, Lcom/moat/analytics/mobile/spck/f;->n:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/moat/analytics/mobile/spck/f;->o:Z

    const-string p1, "ExoVideoTracker"

    const-string v0, "Initializing."

    const/4 v1, 0x3

    invoke-static {v1, p1, p0, v0}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "[SUCCESS] "

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/f;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " created"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/moat/analytics/mobile/spck/q;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private r()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/moat/analytics/mobile/spck/f;->o:Z

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/f;->i:Ljava/util/Map;

    iget-object v1, p0, Lcom/moat/analytics/mobile/spck/f;->j:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/moat/analytics/mobile/spck/f;->k:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-super {p0, v0, v1, v2}, Lcom/moat/analytics/mobile/spck/i;->a(Ljava/util/Map;Ljava/lang/Object;Landroid/view/View;)Z

    return-void
.end method


# virtual methods
.method a()Ljava/lang/String;
    .locals 1

    const-string v0, "ExoVideoTracker"

    return-object v0
.end method

.method public synthetic a(Ljava/util/Map;Ljava/lang/Object;Landroid/view/View;)Z
    .locals 0

    check-cast p2, Lcom/google/android/exoplayer/ExoPlayer;

    invoke-virtual {p0, p1, p2, p3}, Lcom/moat/analytics/mobile/spck/f;->trackVideoAd(Ljava/util/Map;Lcom/google/android/exoplayer/ExoPlayer;Landroid/view/View;)Z

    move-result p1

    return p1
.end method

.method protected g()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lcom/moat/analytics/mobile/spck/f;->k:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    const-string/jumbo v3, "width"

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "height"

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "duration"

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/f;->o()Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method protected j()V
    .locals 1

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/f;->j:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer/ExoPlayer;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/google/android/exoplayer/ExoPlayer;->removeListener(Lcom/google/android/exoplayer/ExoPlayer$Listener;)V

    :cond_0
    invoke-super {p0}, Lcom/moat/analytics/mobile/spck/i;->j()V

    return-void
.end method

.method protected l()Z
    .locals 2

    invoke-super {p0}, Lcom/moat/analytics/mobile/spck/i;->l()Z

    move-result v0

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/f;->m()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, p0, Lcom/moat/analytics/mobile/spck/f;->n:I

    return v0
.end method

.method protected m()Ljava/lang/Integer;
    .locals 2

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/f;->j:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer/ExoPlayer;

    invoke-interface {v0}, Lcom/google/android/exoplayer/ExoPlayer;->getCurrentPosition()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected n()Z
    .locals 6

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/f;->m()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget v1, p0, Lcom/moat/analytics/mobile/spck/f;->n:I

    sub-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/f;->q()Lcom/moat/analytics/mobile/spck/i$a;

    move-result-object v1

    sget-object v2, Lcom/moat/analytics/mobile/spck/i$a;->a:Lcom/moat/analytics/mobile/spck/i$a;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v1, v2, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v4

    :goto_0
    iget v2, p0, Lcom/moat/analytics/mobile/spck/f;->m:I

    const/4 v5, 0x3

    if-eq v2, v5, :cond_1

    if-eqz v1, :cond_2

    const/16 v1, 0x64

    if-lt v0, v1, :cond_1

    goto :goto_1

    :cond_1
    move v3, v4

    :cond_2
    :goto_1
    return v3
.end method

.method protected o()Ljava/lang/Integer;
    .locals 2

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/f;->j:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer/ExoPlayer;

    invoke-interface {v0}, Lcom/google/android/exoplayer/ExoPlayer;->getDuration()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public onPlayWhenReadyCommitted()V
    .locals 0

    return-void
.end method

.method public onPlayerError(Lcom/google/android/exoplayer/ExoPlaybackException;)V
    .locals 2

    const-string p1, "ExoVideoTracker"

    const-string v0, "received player error"

    const/4 v1, 0x3

    invoke-static {v1, p1, p0, v0}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/moat/analytics/mobile/spck/MoatAdEvent;

    sget-object v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_STOPPED:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    iget v1, p0, Lcom/moat/analytics/mobile/spck/f;->n:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/moat/analytics/mobile/spck/MoatAdEvent;-><init>(Lcom/moat/analytics/mobile/spck/MoatAdEventType;Ljava/lang/Integer;)V

    invoke-virtual {p0, p1}, Lcom/moat/analytics/mobile/spck/f;->dispatchEvent(Lcom/moat/analytics/mobile/spck/MoatAdEvent;)V

    return-void
.end method

.method public onPlayerStateChanged(ZI)V
    .locals 5

    const-string p1, "ExoVideoTracker"

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string/jumbo v1, "updated state from player: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v1, p1, p0, v0}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    if-eq p2, v1, :cond_1

    const/4 p1, 0x4

    if-ne p2, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x5

    if-ne p2, p1, :cond_2

    const-string p1, "ExoVideoTracker"

    const-string v0, "playback completed"

    invoke-static {v1, p1, p0, v0}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/moat/analytics/mobile/spck/MoatAdEvent;

    sget-object v0, Lcom/moat/analytics/mobile/spck/MoatAdEventType;->AD_EVT_COMPLETE:Lcom/moat/analytics/mobile/spck/MoatAdEventType;

    iget v1, p0, Lcom/moat/analytics/mobile/spck/f;->l:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/moat/analytics/mobile/spck/MoatAdEvent;-><init>(Lcom/moat/analytics/mobile/spck/MoatAdEventType;Ljava/lang/Integer;)V

    invoke-virtual {p0, p1}, Lcom/moat/analytics/mobile/spck/f;->dispatchEvent(Lcom/moat/analytics/mobile/spck/MoatAdEvent;)V

    goto :goto_1

    :cond_1
    :goto_0
    iget-boolean p1, p0, Lcom/moat/analytics/mobile/spck/f;->o:Z

    if-nez p1, :cond_2

    const-string p1, "ExoVideoTracker"

    const-string v0, "player ready to play; starting tracking"

    invoke-static {v1, p1, p0, v0}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/f;->r()V

    :cond_2
    :goto_1
    iput p2, p0, Lcom/moat/analytics/mobile/spck/f;->m:I

    return-void
.end method

.method public stopTracking()V
    .locals 1

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/f;->j:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer/ExoPlayer;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/google/android/exoplayer/ExoPlayer;->removeListener(Lcom/google/android/exoplayer/ExoPlayer$Listener;)V

    :cond_0
    invoke-super {p0}, Lcom/moat/analytics/mobile/spck/i;->stopTracking()V

    return-void
.end method

.method public trackVideoAd(Ljava/util/Map;Lcom/google/android/exoplayer/ExoPlayer;Landroid/view/View;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/exoplayer/ExoPlayer;",
            "Landroid/view/View;",
            ")Z"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/moat/analytics/mobile/spck/f;->e:Z

    const/4 v1, 0x0

    const/4 v2, 0x3

    if-eqz v0, :cond_0

    const-string p1, "ExoVideoTracker"

    const-string/jumbo p2, "trackVideoAd already called"

    invoke-static {v2, p1, p0, p2}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "[ERROR] "

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/f;->a()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " trackVideoAd can\'t be called twice"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/moat/analytics/mobile/spck/q;->a(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_0
    iput-object p1, p0, Lcom/moat/analytics/mobile/spck/f;->i:Ljava/util/Map;

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/moat/analytics/mobile/spck/f;->j:Ljava/lang/ref/WeakReference;

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/moat/analytics/mobile/spck/f;->k:Ljava/lang/ref/WeakReference;

    :try_start_0
    invoke-interface {p2, p0}, Lcom/google/android/exoplayer/ExoPlayer;->addListener(Lcom/google/android/exoplayer/ExoPlayer$Listener;)V

    invoke-interface {p2}, Lcom/google/android/exoplayer/ExoPlayer;->getPlaybackState()I

    move-result p1

    iget-boolean p2, p0, Lcom/moat/analytics/mobile/spck/f;->o:Z

    if-nez p2, :cond_2

    if-eq p1, v2, :cond_1

    const/4 p2, 0x4

    if-ne p1, p2, :cond_2

    :cond_1
    const-string p1, "ExoVideoTracker"

    const-string p2, "player might already be playing. start tracking it right away."

    invoke-static {v2, p1, p0, p2}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/f;->r()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception p1

    invoke-static {p1}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    return v1
.end method
