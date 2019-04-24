.class public interface abstract Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;
.super Ljava/lang/Object;
.source "PixelTrackingManager.java"


# virtual methods
.method public abstract findPixelsToTrack()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract handlePixelTrackingOutcome(Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;Z)V
.end method

.method public abstract hasPixelsToTrack()Z
.end method

.method public abstract startIfWorkToDo()V
.end method

.method public abstract trackClick(Ljava/lang/String;)V
.end method

.method public abstract trackImpression(Ljava/lang/String;)V
.end method
