.class Lio/fabric/sdk/android/services/events/EventsHandler$4;
.super Ljava/lang/Object;
.source "EventsHandler.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fabric/sdk/android/services/events/EventsHandler;->disable()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/fabric/sdk/android/services/events/EventsHandler;


# direct methods
.method constructor <init>(Lio/fabric/sdk/android/services/events/EventsHandler;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lio/fabric/sdk/android/services/events/EventsHandler$4;->this$0:Lio/fabric/sdk/android/services/events/EventsHandler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 96
    :try_start_0
    iget-object v0, p0, Lio/fabric/sdk/android/services/events/EventsHandler$4;->this$0:Lio/fabric/sdk/android/services/events/EventsHandler;

    iget-object v0, v0, Lio/fabric/sdk/android/services/events/EventsHandler;->strategy:Lio/fabric/sdk/android/services/events/EventsStrategy;

    .line 97
    iget-object v1, p0, Lio/fabric/sdk/android/services/events/EventsHandler$4;->this$0:Lio/fabric/sdk/android/services/events/EventsHandler;

    iget-object v2, p0, Lio/fabric/sdk/android/services/events/EventsHandler$4;->this$0:Lio/fabric/sdk/android/services/events/EventsHandler;

    invoke-virtual {v2}, Lio/fabric/sdk/android/services/events/EventsHandler;->getDisabledEventsStrategy()Lio/fabric/sdk/android/services/events/EventsStrategy;

    move-result-object v2

    iput-object v2, v1, Lio/fabric/sdk/android/services/events/EventsHandler;->strategy:Lio/fabric/sdk/android/services/events/EventsStrategy;

    .line 98
    invoke-interface {v0}, Lio/fabric/sdk/android/services/events/EventsStrategy;->deleteAllEvents()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 100
    iget-object v1, p0, Lio/fabric/sdk/android/services/events/EventsHandler$4;->this$0:Lio/fabric/sdk/android/services/events/EventsHandler;

    iget-object v1, v1, Lio/fabric/sdk/android/services/events/EventsHandler;->context:Landroid/content/Context;

    const-string v2, "Failed to disable events."

    invoke-static {v1, v2, v0}, Lio/fabric/sdk/android/services/common/CommonUtils;->logControlledError(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
