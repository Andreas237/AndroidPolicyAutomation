.class public interface abstract Lcom/usebutton/sdk/internal/events/EventsStore;
.super Ljava/lang/Object;
.source "EventsStore.java"


# virtual methods
.method public abstract add(Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;)Z
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation
.end method

.method public abstract peek(I)Ljava/util/List;
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;",
            ">;"
        }
    .end annotation
.end method

.method public abstract remove(I)V
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation
.end method

.method public abstract size()I
.end method

.method public abstract trimToSize(I)V
.end method
