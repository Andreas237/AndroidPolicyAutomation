.class public Lcom/ibotta/android/tracking/tmonitor/NoOpTMonitorClientImpl;
.super Ljava/lang/Object;
.source "NoOpTMonitorClientImpl.java"

# interfaces
.implements Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public notify(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 0

    return-void
.end method

.method public notify(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public start()V
    .locals 0

    return-void
.end method

.method public stop()V
    .locals 0

    return-void
.end method
