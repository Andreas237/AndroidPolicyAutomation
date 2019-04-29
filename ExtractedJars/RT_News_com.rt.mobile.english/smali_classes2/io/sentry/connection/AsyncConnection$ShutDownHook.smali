.class final Lio/sentry/connection/AsyncConnection$ShutDownHook;
.super Ljava/lang/Thread;
.source "AsyncConnection.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/connection/AsyncConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "ShutDownHook"
.end annotation


# instance fields
.field private volatile enabled:Z

.field final synthetic this$0:Lio/sentry/connection/AsyncConnection;


# direct methods
.method private constructor <init>(Lio/sentry/connection/AsyncConnection;)V
    .locals 0

    .line 202
    iput-object p1, p0, Lio/sentry/connection/AsyncConnection$ShutDownHook;->this$0:Lio/sentry/connection/AsyncConnection;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 p1, 0x1

    .line 207
    iput-boolean p1, p0, Lio/sentry/connection/AsyncConnection$ShutDownHook;->enabled:Z

    return-void
.end method

.method synthetic constructor <init>(Lio/sentry/connection/AsyncConnection;Lio/sentry/connection/AsyncConnection$1;)V
    .locals 0

    .line 202
    invoke-direct {p0, p1}, Lio/sentry/connection/AsyncConnection$ShutDownHook;-><init>(Lio/sentry/connection/AsyncConnection;)V

    return-void
.end method

.method static synthetic access$202(Lio/sentry/connection/AsyncConnection$ShutDownHook;Z)Z
    .locals 0

    .line 202
    iput-boolean p1, p0, Lio/sentry/connection/AsyncConnection$ShutDownHook;->enabled:Z

    return p1
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 211
    iget-boolean v0, p0, Lio/sentry/connection/AsyncConnection$ShutDownHook;->enabled:Z

    if-nez v0, :cond_0

    return-void

    .line 215
    :cond_0
    invoke-static {}, Lio/sentry/environment/SentryEnvironment;->startManagingThread()V

    .line 218
    :try_start_0
    iget-object v0, p0, Lio/sentry/connection/AsyncConnection$ShutDownHook;->this$0:Lio/sentry/connection/AsyncConnection;

    invoke-static {v0}, Lio/sentry/connection/AsyncConnection;->access$500(Lio/sentry/connection/AsyncConnection;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 222
    :goto_0
    invoke-static {}, Lio/sentry/environment/SentryEnvironment;->stopManagingThread()V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 220
    :try_start_1
    invoke-static {}, Lio/sentry/connection/AsyncConnection;->access$400()Lorg/slf4j/Logger;

    move-result-object v1

    const-string v2, "An exception occurred while closing the connection."

    invoke-interface {v1, v2, v0}, Lorg/slf4j/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :goto_1
    return-void

    .line 222
    :goto_2
    invoke-static {}, Lio/sentry/environment/SentryEnvironment;->stopManagingThread()V

    throw v0
.end method
