.class Lcom/twitter/sdk/android/core/internal/scribe/ScribeHandler;
.super Lio/fabric/sdk/android/services/events/EventsHandler;
.source "ScribeHandler.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/fabric/sdk/android/services/events/EventsHandler<",
        "Lcom/twitter/sdk/android/core/internal/scribe/ScribeEvent;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/fabric/sdk/android/services/events/EventsStrategy;Lio/fabric/sdk/android/services/events/EventsFilesManager;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lio/fabric/sdk/android/services/events/EventsStrategy<",
            "Lcom/twitter/sdk/android/core/internal/scribe/ScribeEvent;",
            ">;",
            "Lio/fabric/sdk/android/services/events/EventsFilesManager;",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ")V"
        }
    .end annotation

    .line 33
    invoke-direct {p0, p1, p2, p3, p4}, Lio/fabric/sdk/android/services/events/EventsHandler;-><init>(Landroid/content/Context;Lio/fabric/sdk/android/services/events/EventsStrategy;Lio/fabric/sdk/android/services/events/EventsFilesManager;Ljava/util/concurrent/ScheduledExecutorService;)V

    return-void
.end method


# virtual methods
.method public scribe(Lcom/twitter/sdk/android/core/internal/scribe/ScribeEvent;)V
    .locals 1

    const/4 v0, 0x0

    .line 40
    invoke-virtual {p0, p1, v0}, Lcom/twitter/sdk/android/core/internal/scribe/ScribeHandler;->recordEventAsync(Ljava/lang/Object;Z)V

    return-void
.end method
