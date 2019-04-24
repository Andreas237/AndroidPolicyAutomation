.class public interface abstract Lcom/moat/analytics/mobile/spck/ExoVideoTracker;
.super Ljava/lang/Object;


# virtual methods
.method public abstract changeTargetView(Landroid/view/View;)V
.end method

.method public abstract setActivity(Landroid/app/Activity;)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract setPlayerVolume(Ljava/lang/Double;)V
.end method

.method public abstract stopTracking()V
.end method

.method public abstract trackVideoAd(Ljava/util/Map;Lcom/google/android/exoplayer/ExoPlayer;Landroid/view/View;)Z
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
.end method
