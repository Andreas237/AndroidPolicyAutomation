.class final Lio/sentry/connection/AsyncConnection$EventSubmitter;
.super Ljava/lang/Object;
.source "AsyncConnection.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/connection/AsyncConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "EventSubmitter"
.end annotation


# instance fields
.field private final event:Lio/sentry/event/Event;

.field private mdcContext:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lio/sentry/connection/AsyncConnection;


# direct methods
.method private constructor <init>(Lio/sentry/connection/AsyncConnection;Lio/sentry/event/Event;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/sentry/event/Event;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 167
    iput-object p1, p0, Lio/sentry/connection/AsyncConnection$EventSubmitter;->this$0:Lio/sentry/connection/AsyncConnection;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 168
    iput-object p2, p0, Lio/sentry/connection/AsyncConnection$EventSubmitter;->event:Lio/sentry/event/Event;

    .line 169
    iput-object p3, p0, Lio/sentry/connection/AsyncConnection$EventSubmitter;->mdcContext:Ljava/util/Map;

    return-void
.end method

.method synthetic constructor <init>(Lio/sentry/connection/AsyncConnection;Lio/sentry/event/Event;Ljava/util/Map;Lio/sentry/connection/AsyncConnection$1;)V
    .locals 0

    .line 163
    invoke-direct {p0, p1, p2, p3}, Lio/sentry/connection/AsyncConnection$EventSubmitter;-><init>(Lio/sentry/connection/AsyncConnection;Lio/sentry/event/Event;Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 174
    invoke-static {}, Lio/sentry/environment/SentryEnvironment;->startManagingThread()V

    .line 176
    invoke-static {}, Lorg/slf4j/MDC;->getCopyOfContextMap()Ljava/util/Map;

    move-result-object v0

    .line 177
    iget-object v1, p0, Lio/sentry/connection/AsyncConnection$EventSubmitter;->mdcContext:Ljava/util/Map;

    if-nez v1, :cond_0

    .line 178
    invoke-static {}, Lorg/slf4j/MDC;->clear()V

    goto :goto_0

    .line 180
    :cond_0
    iget-object v1, p0, Lio/sentry/connection/AsyncConnection$EventSubmitter;->mdcContext:Ljava/util/Map;

    invoke-static {v1}, Lorg/slf4j/MDC;->setContextMap(Ljava/util/Map;)V

    .line 185
    :goto_0
    :try_start_0
    iget-object v1, p0, Lio/sentry/connection/AsyncConnection$EventSubmitter;->this$0:Lio/sentry/connection/AsyncConnection;

    invoke-static {v1}, Lio/sentry/connection/AsyncConnection;->access$300(Lio/sentry/connection/AsyncConnection;)Lio/sentry/connection/Connection;

    move-result-object v1

    iget-object v2, p0, Lio/sentry/connection/AsyncConnection$EventSubmitter;->event:Lio/sentry/event/Event;

    invoke-interface {v1, v2}, Lio/sentry/connection/Connection;->send(Lio/sentry/event/Event;)V
    :try_end_0
    .catch Lio/sentry/connection/LockedDownException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lio/sentry/connection/TooManyRequestsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    .line 192
    :goto_1
    invoke-static {}, Lorg/slf4j/MDC;->clear()V

    goto :goto_2

    .line 194
    :cond_1
    invoke-static {v0}, Lorg/slf4j/MDC;->setContextMap(Ljava/util/Map;)V

    .line 197
    :goto_2
    invoke-static {}, Lio/sentry/environment/SentryEnvironment;->stopManagingThread()V

    goto :goto_3

    :catchall_0
    move-exception v1

    goto :goto_4

    :catch_0
    move-exception v1

    .line 189
    :try_start_1
    invoke-static {}, Lio/sentry/connection/AsyncConnection;->access$400()Lorg/slf4j/Logger;

    move-result-object v2

    const-string v3, "An exception occurred while sending the event to Sentry."

    invoke-interface {v2, v3, v1}, Lorg/slf4j/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    if-nez v0, :cond_1

    goto :goto_1

    .line 187
    :catch_1
    invoke-static {}, Lio/sentry/connection/AsyncConnection;->access$400()Lorg/slf4j/Logger;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Dropping an Event due to lockdown: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lio/sentry/connection/AsyncConnection$EventSubmitter;->event:Lio/sentry/event/Event;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_1

    goto :goto_1

    :goto_3
    return-void

    :goto_4
    if-nez v0, :cond_2

    .line 192
    invoke-static {}, Lorg/slf4j/MDC;->clear()V

    goto :goto_5

    .line 194
    :cond_2
    invoke-static {v0}, Lorg/slf4j/MDC;->setContextMap(Ljava/util/Map;)V

    .line 197
    :goto_5
    invoke-static {}, Lio/sentry/environment/SentryEnvironment;->stopManagingThread()V

    throw v1
.end method
