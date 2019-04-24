.class public Lcom/usebutton/sdk/internal/events/EventTracker;
.super Ljava/lang/Object;
.source "EventTracker.java"


# static fields
.field private static final MAX_EVENTS_UPLOAD_COUNT:I = 0x190

.field public static final MAX_SIZE:I = 0x3e8

.field private static final TAG:Ljava/lang/String; = "EventTracker"


# instance fields
.field private mConfigurationFlags:Lorg/json/JSONArray;

.field private final mEventPoster:Ljava/util/concurrent/Executor;

.field private final mEventsStore:Lcom/usebutton/sdk/internal/events/EventsStore;

.field private final mPolicy:Lcom/usebutton/sdk/internal/events/ReportPolicy;

.field private final mStorage:Lcom/usebutton/sdk/internal/core/Storage;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/usebutton/sdk/internal/core/Storage;)V
    .locals 3

    .line 50
    new-instance v0, Lcom/usebutton/sdk/internal/util/ButtonThreadFactory;

    const-string v1, "EventTracker"

    invoke-direct {v0, v1}, Lcom/usebutton/sdk/internal/util/ButtonThreadFactory;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/usebutton/sdk/internal/events/IntermediateStore;

    new-instance v2, Lcom/usebutton/sdk/internal/events/DatabaseStore;

    invoke-direct {v2, p1}, Lcom/usebutton/sdk/internal/events/DatabaseStore;-><init>(Landroid/content/Context;)V

    invoke-direct {v1, v2}, Lcom/usebutton/sdk/internal/events/IntermediateStore;-><init>(Lcom/usebutton/sdk/internal/events/EventsStore;)V

    invoke-direct {p0, p2, v0, v1}, Lcom/usebutton/sdk/internal/events/EventTracker;-><init>(Lcom/usebutton/sdk/internal/core/Storage;Ljava/util/concurrent/Executor;Lcom/usebutton/sdk/internal/events/EventsStore;)V

    return-void
.end method

.method constructor <init>(Lcom/usebutton/sdk/internal/core/Storage;Ljava/util/concurrent/Executor;Lcom/usebutton/sdk/internal/events/EventsStore;)V
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, Lcom/usebutton/sdk/internal/events/EventTracker;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    .line 57
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/core/Storage;->getConfiguration()Lcom/usebutton/sdk/internal/models/Configuration;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/events/EventTracker;->toArray(Lcom/usebutton/sdk/internal/models/Configuration;)Lorg/json/JSONArray;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/events/EventTracker;->mConfigurationFlags:Lorg/json/JSONArray;

    .line 58
    iput-object p3, p0, Lcom/usebutton/sdk/internal/events/EventTracker;->mEventsStore:Lcom/usebutton/sdk/internal/events/EventsStore;

    .line 59
    new-instance p3, Lcom/usebutton/sdk/internal/events/ReportPolicy;

    invoke-direct {p3, p1}, Lcom/usebutton/sdk/internal/events/ReportPolicy;-><init>(Lcom/usebutton/sdk/internal/core/Storage;)V

    iput-object p3, p0, Lcom/usebutton/sdk/internal/events/EventTracker;->mPolicy:Lcom/usebutton/sdk/internal/events/ReportPolicy;

    .line 60
    iput-object p2, p0, Lcom/usebutton/sdk/internal/events/EventTracker;->mEventPoster:Ljava/util/concurrent/Executor;

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/sdk/internal/events/EventTracker;)Lcom/usebutton/sdk/internal/events/EventsStore;
    .locals 0

    .line 36
    iget-object p0, p0, Lcom/usebutton/sdk/internal/events/EventTracker;->mEventsStore:Lcom/usebutton/sdk/internal/events/EventsStore;

    return-object p0
.end method

.method private postEventAsync(Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;)V
    .locals 2

    .line 120
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/EventTracker;->mEventPoster:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/usebutton/sdk/internal/events/EventTracker$1;

    invoke-direct {v1, p0, p1}, Lcom/usebutton/sdk/internal/events/EventTracker$1;-><init>(Lcom/usebutton/sdk/internal/events/EventTracker;Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private toArray(Lcom/usebutton/sdk/internal/models/Configuration;)Lorg/json/JSONArray;
    .locals 2

    .line 64
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    if-nez p1, :cond_0

    return-object v0

    .line 66
    :cond_0
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/Configuration;->getFlags()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 67
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public getPendingEvents()Ljava/util/List;
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;",
            ">;"
        }
    .end annotation

    const/16 v0, 0x190

    .line 167
    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/events/EventTracker;->getPendingEvents(I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method getPendingEvents(I)Ljava/util/List;
    .locals 5
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

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

    .line 173
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 174
    iget-object v1, p0, Lcom/usebutton/sdk/internal/events/EventTracker;->mEventsStore:Lcom/usebutton/sdk/internal/events/EventsStore;

    monitor-enter v1

    .line 175
    :try_start_0
    iget-object v2, p0, Lcom/usebutton/sdk/internal/events/EventTracker;->mEventsStore:Lcom/usebutton/sdk/internal/events/EventsStore;

    invoke-interface {v2, p1}, Lcom/usebutton/sdk/internal/events/EventsStore;->peek(I)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 176
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string p1, "EventTracker"

    const-string v1, "Returning %d pending events."

    const/4 v2, 0x1

    .line 177
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {p1, v1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0

    :catchall_0
    move-exception p1

    .line 176
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method getTotalPendingEvents()I
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 192
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/EventTracker;->mEventsStore:Lcom/usebutton/sdk/internal/events/EventsStore;

    invoke-interface {v0}, Lcom/usebutton/sdk/internal/events/EventsStore;->size()I

    move-result v0

    return v0
.end method

.method public onAppLaunch()V
    .locals 1

    .line 196
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/EventTracker;->mPolicy:Lcom/usebutton/sdk/internal/events/ReportPolicy;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/events/ReportPolicy;->onAppLaunch()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;)V
    .locals 1

    .line 200
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/EventTracker;->mPolicy:Lcom/usebutton/sdk/internal/events/ReportPolicy;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/events/ReportPolicy;->onEvent(Ljava/lang/String;)V

    return-void
.end method

.method public onEventsReported()V
    .locals 1

    .line 208
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/EventTracker;->mPolicy:Lcom/usebutton/sdk/internal/events/ReportPolicy;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/events/ReportPolicy;->onEventsReported()V

    return-void
.end method

.method public onOrder()V
    .locals 1

    .line 204
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/EventTracker;->mPolicy:Lcom/usebutton/sdk/internal/events/ReportPolicy;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/events/ReportPolicy;->onOrder()V

    return-void
.end method

.method public removeEvents(I)V
    .locals 4
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 184
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/EventTracker;->mEventsStore:Lcom/usebutton/sdk/internal/events/EventsStore;

    monitor-enter v0

    .line 185
    :try_start_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/events/EventTracker;->mEventsStore:Lcom/usebutton/sdk/internal/events/EventsStore;

    invoke-interface {v1, p1}, Lcom/usebutton/sdk/internal/events/EventsStore;->remove(I)V

    .line 186
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v0, "EventTracker"

    const-string v1, "Removed %d events."

    const/4 v2, 0x1

    .line 187
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    .line 186
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public setConfiguration(Lcom/usebutton/sdk/internal/models/Configuration;)V
    .locals 0
    .param p1    # Lcom/usebutton/sdk/internal/models/Configuration;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 73
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/events/EventTracker;->toArray(Lcom/usebutton/sdk/internal/models/Configuration;)Lorg/json/JSONArray;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/events/EventTracker;->mConfigurationFlags:Lorg/json/JSONArray;

    return-void
.end method

.method public subscribeWeak(Lcom/usebutton/sdk/internal/events/ReportPolicy$Listener;)V
    .locals 1

    .line 212
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/EventTracker;->mPolicy:Lcom/usebutton/sdk/internal/events/ReportPolicy;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/events/ReportPolicy;->getObservable()Lcom/usebutton/sdk/internal/functional/Observable;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/usebutton/sdk/internal/functional/Observable;->subscribeWeak(Ljava/lang/Object;)V

    return-void
.end method

.method public trackActionAvailable(Lcom/usebutton/sdk/internal/models/MetaInfo;)V
    .locals 3

    .line 150
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "promotion_source_token"

    .line 152
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getSourceToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 153
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getRequestTime()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getRequestTime()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "request_time"

    .line 154
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getRequestTime()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    const-string p1, "btn:button-action-available"

    .line 161
    invoke-virtual {p0, p1, v0}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithProperties(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void

    :catch_0
    move-exception p1

    const-string v0, "EventTracker"

    const-string v1, "Error tracking event."

    .line 158
    invoke-static {v0, v1, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public trackEvent(Ljava/lang/String;)V
    .locals 1

    .line 77
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p0, p1, v0}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithProperties(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public trackEventWithPromotionSourceToken(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 133
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "promotion_source_token"

    .line 135
    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 141
    invoke-virtual {p0, p1, v0}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithProperties(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void

    :catch_0
    move-exception p1

    const-string p2, "EventTracker"

    const-string v0, "Error tracking event."

    .line 138
    invoke-static {p2, v0, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public trackEventWithProperties(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    if-nez p1, :cond_0

    return-void

    :cond_0
    :try_start_0
    const-string v0, "flags"

    .line 94
    iget-object v1, p0, Lcom/usebutton/sdk/internal/events/EventTracker;->mConfigurationFlags:Lorg/json/JSONArray;

    invoke-virtual {p2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "EventTracker"

    const-string v1, "Couldn\'t add flags to event payload."

    .line 96
    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    const/4 v0, 0x0

    .line 99
    invoke-static {v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->getInstance(Lcom/usebutton/sdk/internal/secure/SecureStore;)Lcom/usebutton/sdk/internal/user/UserImpl;

    move-result-object v0

    :try_start_1
    const-string v1, "autofill_enabled"

    .line 102
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->isAutofillEnabled()Z

    move-result v2

    invoke-virtual {p2, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    const-string v1, "EventTracker"

    const-string v2, "Couldn\'t add autofill_enabled to event payload."

    .line 104
    invoke-static {v1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    :try_start_2
    const-string v1, "autofill_pub_profile"

    .line 108
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->hasProfileData()Z

    move-result v0

    invoke-virtual {p2, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    const-string v0, "EventTracker"

    const-string v1, "Couldn\'t add autofill_pub_profile to event payload."

    .line 110
    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    :goto_2
    new-instance v0, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-direct {v0, p1, p2, v1}, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Ljava/util/UUID;)V

    .line 114
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/events/EventTracker;->postEventAsync(Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;)V

    .line 115
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/events/EventTracker;->onEvent(Ljava/lang/String;)V

    const-string p1, "EventTracker"

    const-string p2, "Tracked event: %s"

    const/4 v1, 0x1

    .line 116
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    invoke-static {p1, p2, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public varargs trackEventWithProperties(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 2

    if-eqz p2, :cond_0

    .line 81
    array-length v0, p2

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 82
    invoke-static {p2}, Lcom/usebutton/sdk/internal/util/JsonBuilder;->toJson([Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithProperties(Ljava/lang/String;Lorg/json/JSONObject;)V

    goto :goto_0

    .line 84
    :cond_0
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p0, p1, p2}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithProperties(Ljava/lang/String;Lorg/json/JSONObject;)V

    :goto_0
    return-void
.end method

.method public unsubscribe(Lcom/usebutton/sdk/internal/events/ReportPolicy$Listener;)V
    .locals 1

    .line 216
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/EventTracker;->mPolicy:Lcom/usebutton/sdk/internal/events/ReportPolicy;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/events/ReportPolicy;->getObservable()Lcom/usebutton/sdk/internal/functional/Observable;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/usebutton/sdk/internal/functional/Observable;->unsubscribe(Ljava/lang/Object;)V

    return-void
.end method
