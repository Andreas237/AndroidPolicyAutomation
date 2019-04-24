.class Lcom/usebutton/sdk/internal/events/EventTracker$1;
.super Ljava/lang/Object;
.source "EventTracker.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/events/EventTracker;->postEventAsync(Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/events/EventTracker;

.field final synthetic val$event:Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/events/EventTracker;Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;)V
    .locals 0

    .line 120
    iput-object p1, p0, Lcom/usebutton/sdk/internal/events/EventTracker$1;->this$0:Lcom/usebutton/sdk/internal/events/EventTracker;

    iput-object p2, p0, Lcom/usebutton/sdk/internal/events/EventTracker$1;->val$event:Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 124
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/EventTracker$1;->this$0:Lcom/usebutton/sdk/internal/events/EventTracker;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/events/EventTracker;->access$000(Lcom/usebutton/sdk/internal/events/EventTracker;)Lcom/usebutton/sdk/internal/events/EventsStore;

    move-result-object v0

    monitor-enter v0

    .line 125
    :try_start_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/events/EventTracker$1;->this$0:Lcom/usebutton/sdk/internal/events/EventTracker;

    invoke-static {v1}, Lcom/usebutton/sdk/internal/events/EventTracker;->access$000(Lcom/usebutton/sdk/internal/events/EventTracker;)Lcom/usebutton/sdk/internal/events/EventsStore;

    move-result-object v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/events/EventTracker$1;->val$event:Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;

    invoke-interface {v1, v2}, Lcom/usebutton/sdk/internal/events/EventsStore;->add(Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;)Z

    .line 126
    iget-object v1, p0, Lcom/usebutton/sdk/internal/events/EventTracker$1;->this$0:Lcom/usebutton/sdk/internal/events/EventTracker;

    invoke-static {v1}, Lcom/usebutton/sdk/internal/events/EventTracker;->access$000(Lcom/usebutton/sdk/internal/events/EventTracker;)Lcom/usebutton/sdk/internal/events/EventsStore;

    move-result-object v1

    const/16 v2, 0x3e8

    invoke-interface {v1, v2}, Lcom/usebutton/sdk/internal/events/EventsStore;->trimToSize(I)V

    .line 127
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
