.class final Lio/sentry/connection/BufferedConnection$ShutDownHook;
.super Ljava/lang/Thread;
.source "BufferedConnection.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/connection/BufferedConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "ShutDownHook"
.end annotation


# instance fields
.field private volatile enabled:Z

.field final synthetic this$0:Lio/sentry/connection/BufferedConnection;


# direct methods
.method private constructor <init>(Lio/sentry/connection/BufferedConnection;)V
    .locals 0

    .line 269
    iput-object p1, p0, Lio/sentry/connection/BufferedConnection$ShutDownHook;->this$0:Lio/sentry/connection/BufferedConnection;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 p1, 0x1

    .line 274
    iput-boolean p1, p0, Lio/sentry/connection/BufferedConnection$ShutDownHook;->enabled:Z

    return-void
.end method

.method synthetic constructor <init>(Lio/sentry/connection/BufferedConnection;Lio/sentry/connection/BufferedConnection$1;)V
    .locals 0

    .line 269
    invoke-direct {p0, p1}, Lio/sentry/connection/BufferedConnection$ShutDownHook;-><init>(Lio/sentry/connection/BufferedConnection;)V

    return-void
.end method

.method static synthetic access$102(Lio/sentry/connection/BufferedConnection$ShutDownHook;Z)Z
    .locals 0

    .line 269
    iput-boolean p1, p0, Lio/sentry/connection/BufferedConnection$ShutDownHook;->enabled:Z

    return p1
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 278
    iget-boolean v0, p0, Lio/sentry/connection/BufferedConnection$ShutDownHook;->enabled:Z

    if-nez v0, :cond_0

    return-void

    .line 282
    :cond_0
    invoke-static {}, Lio/sentry/environment/SentryEnvironment;->startManagingThread()V

    .line 285
    :try_start_0
    iget-object v0, p0, Lio/sentry/connection/BufferedConnection$ShutDownHook;->this$0:Lio/sentry/connection/BufferedConnection;

    invoke-virtual {v0}, Lio/sentry/connection/BufferedConnection;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 289
    :goto_0
    invoke-static {}, Lio/sentry/environment/SentryEnvironment;->stopManagingThread()V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 287
    :try_start_1
    invoke-static {}, Lio/sentry/connection/BufferedConnection;->access$300()Lorg/slf4j/Logger;

    move-result-object v1

    const-string v2, "An exception occurred while closing the connection."

    invoke-interface {v1, v2, v0}, Lorg/slf4j/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :goto_1
    return-void

    .line 289
    :goto_2
    invoke-static {}, Lio/sentry/environment/SentryEnvironment;->stopManagingThread()V

    throw v0
.end method
