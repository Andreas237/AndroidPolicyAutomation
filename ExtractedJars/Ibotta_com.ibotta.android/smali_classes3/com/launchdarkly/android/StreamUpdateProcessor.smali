.class Lcom/launchdarkly/android/StreamUpdateProcessor;
.super Ljava/lang/Object;
.source "StreamUpdateProcessor.java"

# interfaces
.implements Lcom/launchdarkly/android/UpdateProcessor;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# static fields
.field private static final DELETE:Ljava/lang/String; = "delete"

.field private static final MAX_RECONNECT_TIME_MS:J = 0x36ee80L

.field private static final METHOD_REPORT:Ljava/lang/String; = "REPORT"

.field private static final PATCH:Ljava/lang/String; = "patch"

.field private static final PING:Ljava/lang/String; = "ping"

.field private static final PUT:Ljava/lang/String; = "put"


# instance fields
.field private final config:Lcom/launchdarkly/android/LDConfig;

.field private connection401Error:Z

.field private final environmentName:Ljava/lang/String;

.field private es:Lcom/launchdarkly/eventsource/EventSource;

.field private final executor:Ljava/util/concurrent/ExecutorService;

.field private initFuture:Lcom/google/common/util/concurrent/SettableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/SettableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private final initialized:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private queue:Lcom/launchdarkly/android/Debounce;

.field private volatile running:Z

.field private final userManager:Lcom/launchdarkly/android/UserManager;


# direct methods
.method constructor <init>(Lcom/launchdarkly/android/LDConfig;Lcom/launchdarkly/android/UserManager;Ljava/lang/String;)V
    .locals 2

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->initialized:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 40
    iput-boolean v1, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->running:Z

    .line 43
    iput-boolean v1, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->connection401Error:Z

    .line 48
    iput-object p1, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->config:Lcom/launchdarkly/android/LDConfig;

    .line 49
    iput-object p2, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->userManager:Lcom/launchdarkly/android/UserManager;

    .line 50
    iput-object p3, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->environmentName:Ljava/lang/String;

    .line 51
    new-instance p1, Lcom/launchdarkly/android/Debounce;

    invoke-direct {p1}, Lcom/launchdarkly/android/Debounce;-><init>()V

    iput-object p1, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->queue:Lcom/launchdarkly/android/Debounce;

    .line 53
    new-instance p1, Lcom/launchdarkly/android/BackgroundThreadExecutor;

    invoke-direct {p1}, Lcom/launchdarkly/android/BackgroundThreadExecutor;-><init>()V

    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Lcom/launchdarkly/android/BackgroundThreadExecutor;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->executor:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method static synthetic access$000(Lcom/launchdarkly/android/StreamUpdateProcessor;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->initialized:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method static synthetic access$100(Lcom/launchdarkly/android/StreamUpdateProcessor;Ljava/lang/String;Ljava/lang/String;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2}, Lcom/launchdarkly/android/StreamUpdateProcessor;->handle(Ljava/lang/String;Ljava/lang/String;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Lcom/launchdarkly/android/StreamUpdateProcessor;)Lcom/google/common/util/concurrent/SettableFuture;
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->initFuture:Lcom/google/common/util/concurrent/SettableFuture;

    return-object p0
.end method

.method static synthetic access$300(Lcom/launchdarkly/android/StreamUpdateProcessor;)Lcom/launchdarkly/android/Debounce;
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->queue:Lcom/launchdarkly/android/Debounce;

    return-object p0
.end method

.method static synthetic access$400(Lcom/launchdarkly/android/StreamUpdateProcessor;)Lcom/launchdarkly/android/UserManager;
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->userManager:Lcom/launchdarkly/android/UserManager;

    return-object p0
.end method

.method static synthetic access$500(Lcom/launchdarkly/android/StreamUpdateProcessor;Lcom/launchdarkly/android/LDUser;)Ljava/net/URI;
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lcom/launchdarkly/android/StreamUpdateProcessor;->getUri(Lcom/launchdarkly/android/LDUser;)Ljava/net/URI;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$602(Lcom/launchdarkly/android/StreamUpdateProcessor;Z)Z
    .locals 0

    .line 25
    iput-boolean p1, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->running:Z

    return p1
.end method

.method static synthetic access$702(Lcom/launchdarkly/android/StreamUpdateProcessor;Z)Z
    .locals 0

    .line 25
    iput-boolean p1, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->connection401Error:Z

    return p1
.end method

.method static synthetic access$800(Lcom/launchdarkly/android/StreamUpdateProcessor;)Ljava/lang/String;
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->environmentName:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$900(Lcom/launchdarkly/android/StreamUpdateProcessor;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/launchdarkly/android/StreamUpdateProcessor;->stopSync()V

    return-void
.end method

.method private getRequestBody(Lcom/launchdarkly/android/LDUser;)Lokhttp3/RequestBody;
    .locals 3
    .param p1    # Lcom/launchdarkly/android/LDUser;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const-string v0, "Attempting to report user in stream"

    const/4 v1, 0x0

    .line 152
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "application/json;charset=UTF-8"

    .line 153
    invoke-static {v0}, Lokhttp3/MediaType;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v0

    sget-object v1, Lcom/launchdarkly/android/LDConfig;->GSON:Lcom/google/gson/Gson;

    instance-of v2, v1, Lcom/google/gson/Gson;

    if-nez v2, :cond_0

    invoke-virtual {v1, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast v1, Lcom/google/gson/Gson;

    invoke-static {v1, p1}, Lcom/newrelic/agent/android/instrumentation/GsonInstrumentation;->toJson(Lcom/google/gson/Gson;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-static {v0, p1}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;

    move-result-object p1

    return-object p1
.end method

.method private getUri(Lcom/launchdarkly/android/LDUser;)Ljava/net/URI;
    .locals 2
    .param p1    # Lcom/launchdarkly/android/LDUser;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 158
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->config:Lcom/launchdarkly/android/LDConfig;

    invoke-virtual {v1}, Lcom/launchdarkly/android/LDConfig;->getStreamUri()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/meval"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 160
    iget-object v1, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->config:Lcom/launchdarkly/android/LDConfig;

    invoke-virtual {v1}, Lcom/launchdarkly/android/LDConfig;->isUseReport()Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz p1, :cond_0

    .line 161
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getAsUrlSafeBase64()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 164
    :cond_0
    invoke-static {v0}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object p1

    return-object p1
.end method

.method private handle(Ljava/lang/String;Ljava/lang/String;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 168
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, -0x4f997a55

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v1, v2, :cond_3

    const v2, 0x1b30f

    if-eq v1, v2, :cond_2

    const v2, 0x348172

    if-eq v1, v2, :cond_1

    const v2, 0x6582048

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "patch"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x2

    goto :goto_1

    :cond_1
    const-string v1, "ping"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    const-string v1, "put"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    const-string v1, "delete"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x3

    goto :goto_1

    :cond_4
    :goto_0
    const/4 v0, -0x1

    :goto_1
    packed-switch v0, :pswitch_data_0

    const-string p2, "Found an unknown stream protocol: %s"

    .line 178
    new-array v0, v4, [Ljava/lang/Object;

    aput-object p1, v0, v3

    invoke-static {p2, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    invoke-static {}, Lcom/google/common/util/concurrent/SettableFuture;->create()Lcom/google/common/util/concurrent/SettableFuture;

    move-result-object p1

    return-object p1

    .line 176
    :pswitch_0
    iget-object p1, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {p1, p2}, Lcom/launchdarkly/android/UserManager;->deleteCurrentUserFlag(Ljava/lang/String;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 174
    :pswitch_1
    iget-object p1, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {p1, p2}, Lcom/launchdarkly/android/UserManager;->patchCurrentUserFlags(Ljava/lang/String;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 172
    :pswitch_2
    iget-object p1, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {p1, p2}, Lcom/launchdarkly/android/UserManager;->putCurrentUserFlags(Ljava/lang/String;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    .line 170
    :pswitch_3
    iget-object p1, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {p1}, Lcom/launchdarkly/android/UserManager;->updateCurrentUser()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private declared-synchronized stopSync()V
    .locals 2

    monitor-enter p0

    .line 197
    :try_start_0
    iget-object v0, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->es:Lcom/launchdarkly/eventsource/EventSource;

    if-eqz v0, :cond_0

    .line 198
    iget-object v0, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->es:Lcom/launchdarkly/eventsource/EventSource;

    invoke-virtual {v0}, Lcom/launchdarkly/eventsource/EventSource;->close()V

    :cond_0
    const/4 v0, 0x0

    .line 200
    iput-boolean v0, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->running:Z

    const/4 v1, 0x0

    .line 201
    iput-object v1, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->es:Lcom/launchdarkly/eventsource/EventSource;

    const-string v1, "Stopped."

    .line 202
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 203
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public isInitialized()Z
    .locals 1

    .line 206
    iget-object v0, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->initialized:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public declared-synchronized restart()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    .line 211
    :try_start_0
    invoke-static {}, Lcom/google/common/util/concurrent/SettableFuture;->create()Lcom/google/common/util/concurrent/SettableFuture;

    move-result-object v0

    .line 212
    iget-object v1, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lcom/launchdarkly/android/StreamUpdateProcessor$3;

    invoke-direct {v2, p0, v0}, Lcom/launchdarkly/android/StreamUpdateProcessor$3;-><init>(Lcom/launchdarkly/android/StreamUpdateProcessor;Lcom/google/common/util/concurrent/SettableFuture;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 219
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized start()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    .line 57
    :try_start_0
    iget-boolean v0, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->running:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->connection401Error:Z

    if-nez v0, :cond_1

    .line 58
    invoke-static {}, Lcom/google/common/util/concurrent/SettableFuture;->create()Lcom/google/common/util/concurrent/SettableFuture;

    move-result-object v0

    iput-object v0, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->initFuture:Lcom/google/common/util/concurrent/SettableFuture;

    .line 59
    iget-object v0, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->initialized:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 60
    invoke-virtual {p0}, Lcom/launchdarkly/android/StreamUpdateProcessor;->stop()V

    const-string v0, "Starting."

    .line 61
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    new-instance v0, Lokhttp3/Headers$Builder;

    invoke-direct {v0}, Lokhttp3/Headers$Builder;-><init>()V

    const-string v1, "Authorization"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "api_key "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->config:Lcom/launchdarkly/android/LDConfig;

    .line 63
    invoke-virtual {v3}, Lcom/launchdarkly/android/LDConfig;->getMobileKeys()Ljava/util/Map;

    move-result-object v3

    iget-object v4, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->environmentName:Ljava/lang/String;

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lokhttp3/Headers$Builder;->add(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;

    move-result-object v0

    const-string v1, "User-Agent"

    const-string v2, "AndroidClient/2.6.0"

    .line 64
    invoke-virtual {v0, v1, v2}, Lokhttp3/Headers$Builder;->add(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;

    move-result-object v0

    const-string v1, "Accept"

    const-string v2, "text/event-stream"

    .line 65
    invoke-virtual {v0, v1, v2}, Lokhttp3/Headers$Builder;->add(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;

    move-result-object v0

    .line 66
    invoke-virtual {v0}, Lokhttp3/Headers$Builder;->build()Lokhttp3/Headers;

    move-result-object v0

    .line 68
    new-instance v1, Lcom/launchdarkly/android/StreamUpdateProcessor$1;

    invoke-direct {v1, p0}, Lcom/launchdarkly/android/StreamUpdateProcessor$1;-><init>(Lcom/launchdarkly/android/StreamUpdateProcessor;)V

    .line 131
    new-instance v2, Lcom/launchdarkly/eventsource/EventSource$Builder;

    iget-object v3, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v3}, Lcom/launchdarkly/android/UserManager;->getCurrentUser()Lcom/launchdarkly/android/LDUser;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/launchdarkly/android/StreamUpdateProcessor;->getUri(Lcom/launchdarkly/android/LDUser;)Ljava/net/URI;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Lcom/launchdarkly/eventsource/EventSource$Builder;-><init>(Lcom/launchdarkly/eventsource/EventHandler;Ljava/net/URI;)V

    .line 132
    invoke-virtual {v2, v0}, Lcom/launchdarkly/eventsource/EventSource$Builder;->headers(Lokhttp3/Headers;)Lcom/launchdarkly/eventsource/EventSource$Builder;

    move-result-object v0

    .line 134
    iget-object v1, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->config:Lcom/launchdarkly/android/LDConfig;

    invoke-virtual {v1}, Lcom/launchdarkly/android/LDConfig;->isUseReport()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "REPORT"

    .line 135
    invoke-virtual {v0, v1}, Lcom/launchdarkly/eventsource/EventSource$Builder;->method(Ljava/lang/String;)Lcom/launchdarkly/eventsource/EventSource$Builder;

    .line 136
    iget-object v1, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->userManager:Lcom/launchdarkly/android/UserManager;

    invoke-virtual {v1}, Lcom/launchdarkly/android/UserManager;->getCurrentUser()Lcom/launchdarkly/android/LDUser;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/launchdarkly/android/StreamUpdateProcessor;->getRequestBody(Lcom/launchdarkly/android/LDUser;)Lokhttp3/RequestBody;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/launchdarkly/eventsource/EventSource$Builder;->body(Lokhttp3/RequestBody;)Lcom/launchdarkly/eventsource/EventSource$Builder;

    :cond_0
    const-wide/32 v1, 0x36ee80

    .line 139
    invoke-virtual {v0, v1, v2}, Lcom/launchdarkly/eventsource/EventSource$Builder;->maxReconnectTimeMs(J)Lcom/launchdarkly/eventsource/EventSource$Builder;

    .line 141
    invoke-virtual {v0}, Lcom/launchdarkly/eventsource/EventSource$Builder;->build()Lcom/launchdarkly/eventsource/EventSource;

    move-result-object v0

    iput-object v0, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->es:Lcom/launchdarkly/eventsource/EventSource;

    .line 142
    iget-object v0, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->es:Lcom/launchdarkly/eventsource/EventSource;

    invoke-virtual {v0}, Lcom/launchdarkly/eventsource/EventSource;->start()V

    const/4 v0, 0x1

    .line 144
    iput-boolean v0, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->running:Z

    .line 146
    :cond_1
    iget-object v0, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->initFuture:Lcom/google/common/util/concurrent/SettableFuture;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized stop()V
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "Stopping."

    const/4 v1, 0x0

    .line 184
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    iget-object v0, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->es:Lcom/launchdarkly/eventsource/EventSource;

    if-eqz v0, :cond_0

    .line 187
    iget-object v0, p0, Lcom/launchdarkly/android/StreamUpdateProcessor;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/launchdarkly/android/StreamUpdateProcessor$2;

    invoke-direct {v1, p0}, Lcom/launchdarkly/android/StreamUpdateProcessor$2;-><init>(Lcom/launchdarkly/android/StreamUpdateProcessor;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 194
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
