.class public interface abstract Lcom/ibotta/android/tracking/proprietary/IbottaTrackingQueue;
.super Ljava/lang/Object;
.source "IbottaTrackingQueue.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract addEntry(Ljava/lang/Object;)V
    .annotation build Landroid/support/annotation/AnyThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method public abstract clearAllEntries()V
    .annotation build Landroid/support/annotation/AnyThread;
    .end annotation
.end method

.method public abstract getEntriesForFlush()Landroid/util/Pair;
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Pair<",
            "Lcom/ibotta/android/tracking/proprietary/TrackingFlushCallback;",
            "Ljava/util/List<",
            "TT;>;>;"
        }
    .end annotation
.end method
