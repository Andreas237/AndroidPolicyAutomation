.class public interface abstract Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;
.super Ljava/lang/Object;
.source "TMonitorClient.java"


# virtual methods
.method public abstract notify(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
.end method

.method public abstract notify(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract start()V
.end method

.method public abstract stop()V
.end method
