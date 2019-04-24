.class Lcom/twitter/sdk/android/core/internal/scribe/EnabledScribeStrategy;
.super Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;
.source "EnabledScribeStrategy.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/fabric/sdk/android/services/events/EnabledEventsStrategy<",
        "Lcom/twitter/sdk/android/core/internal/scribe/ScribeEvent;",
        ">;"
    }
.end annotation


# instance fields
.field private final filesSender:Lio/fabric/sdk/android/services/events/FilesSender;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesManager;Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2, p3}, Lio/fabric/sdk/android/services/events/EnabledEventsStrategy;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lio/fabric/sdk/android/services/events/EventsFilesManager;)V

    .line 34
    iput-object p5, p0, Lcom/twitter/sdk/android/core/internal/scribe/EnabledScribeStrategy;->filesSender:Lio/fabric/sdk/android/services/events/FilesSender;

    .line 36
    iget p1, p4, Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;->sendIntervalSeconds:I

    invoke-virtual {p0, p1}, Lcom/twitter/sdk/android/core/internal/scribe/EnabledScribeStrategy;->configureRollover(I)V

    return-void
.end method


# virtual methods
.method public getFilesSender()Lio/fabric/sdk/android/services/events/FilesSender;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/scribe/EnabledScribeStrategy;->filesSender:Lio/fabric/sdk/android/services/events/FilesSender;

    return-object v0
.end method
