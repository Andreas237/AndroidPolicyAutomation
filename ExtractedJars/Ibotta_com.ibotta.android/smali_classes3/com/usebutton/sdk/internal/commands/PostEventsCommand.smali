.class public Lcom/usebutton/sdk/internal/commands/PostEventsCommand;
.super Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;
.source "PostEventsCommand.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "PostEventsCommand"


# instance fields
.field private final mEventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Lcom/usebutton/sdk/internal/events/EventTracker;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1, p2}, Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;-><init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;)V

    .line 24
    iput-object p3, p0, Lcom/usebutton/sdk/internal/commands/PostEventsCommand;->mEventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    return-void
.end method


# virtual methods
.method public execute()Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 29
    invoke-super {p0}, Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;->execute()Ljava/lang/Object;

    .line 30
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/commands/PostEventsCommand;->isCancelled()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    .line 34
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/commands/PostEventsCommand;->mEventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/events/EventTracker;->getPendingEvents()Ljava/util/List;

    move-result-object v0

    .line 35
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v0, "PostEventsCommand"

    const-string v2, "No events to post."

    .line 36
    invoke-static {v0, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->info(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    .line 40
    :cond_1
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v2

    const-string v3, "PostEventsCommand"

    const-string v4, "Posting %d event%s"

    const/4 v5, 0x2

    .line 41
    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v7, 0x0

    aput-object v6, v5, v7

    const/4 v6, 0x1

    if-ne v2, v6, :cond_2

    const-string v2, ""

    goto :goto_0

    :cond_2
    const-string v2, "s"

    :goto_0
    aput-object v2, v5, v6

    invoke-static {v3, v4, v5}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    :try_start_0
    iget-object v2, p0, Lcom/usebutton/sdk/internal/commands/PostEventsCommand;->mApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    invoke-virtual {v2, v0}, Lcom/usebutton/sdk/internal/api/ButtonApi;->postEvents(Ljava/util/Collection;)Lorg/json/JSONObject;

    .line 45
    iget-object v2, p0, Lcom/usebutton/sdk/internal/commands/PostEventsCommand;->mEventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/usebutton/sdk/internal/events/EventTracker;->removeEvents(I)V

    .line 46
    iget-object v2, p0, Lcom/usebutton/sdk/internal/commands/PostEventsCommand;->mEventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/events/EventTracker;->onEventsReported()V

    const-string v2, "PostEventsCommand"

    const-string v3, "Successfully posted events %d"

    .line 47
    new-array v4, v6, [Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v7

    invoke-static {v2, v3, v4}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/usebutton/sdk/internal/api/ButtonNetworkException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v2

    const-string v3, "PostEventsCommand"

    const-string v4, "Error posting events."

    .line 49
    invoke-static {v3, v4, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 50
    instance-of v3, v2, Lcom/usebutton/sdk/internal/api/ButtonHttpStatusException;

    if-eqz v3, :cond_3

    .line 51
    check-cast v2, Lcom/usebutton/sdk/internal/api/ButtonHttpStatusException;

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/api/ButtonHttpStatusException;->wasBadRequest()Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v2, "PostEventsCommand"

    const-string v3, "Request was malformed, not likely that we will recover. Scrap events and move on."

    .line 52
    invoke-static {v2, v3}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    iget-object v2, p0, Lcom/usebutton/sdk/internal/commands/PostEventsCommand;->mEventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/usebutton/sdk/internal/events/EventTracker;->removeEvents(I)V

    :cond_3
    :goto_1
    return-object v1
.end method

.method public key()Ljava/lang/String;
    .locals 1

    const-string v0, "post-events"

    return-object v0
.end method
