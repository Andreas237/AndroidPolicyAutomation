.class public interface abstract Lcom/ibotta/android/tracking/proprietary/TrackingDatabase;
.super Ljava/lang/Object;
.source "TrackingDatabase.java"


# virtual methods
.method public abstract deleteEverything()V
.end method

.method public abstract deleteEverythingInFlight()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/tracking/proprietary/TrackingDatabaseFatalException;
        }
    .end annotation
.end method

.method public abstract findEventsToSend(I)Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/Map<",
            "Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;",
            ">;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/tracking/proprietary/TrackingDatabaseFatalException;
        }
    .end annotation
.end method

.method public abstract release()V
.end method

.method public abstract track(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
.end method

.method public abstract updateEventsSentStatus(Ljava/util/Map;Z)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;",
            ">;>;Z)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/tracking/proprietary/TrackingDatabaseFatalException;
        }
    .end annotation
.end method
