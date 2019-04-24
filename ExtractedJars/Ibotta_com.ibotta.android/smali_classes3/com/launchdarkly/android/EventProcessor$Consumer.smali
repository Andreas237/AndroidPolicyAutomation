.class Lcom/launchdarkly/android/EventProcessor$Consumer;
.super Ljava/lang/Object;
.source "EventProcessor.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/launchdarkly/android/EventProcessor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "Consumer"
.end annotation


# instance fields
.field private config:Lcom/launchdarkly/android/LDConfig;

.field final synthetic this$0:Lcom/launchdarkly/android/EventProcessor;


# direct methods
.method constructor <init>(Lcom/launchdarkly/android/EventProcessor;Lcom/launchdarkly/android/LDConfig;)V
    .locals 0

    .line 116
    iput-object p1, p0, Lcom/launchdarkly/android/EventProcessor$Consumer;->this$0:Lcom/launchdarkly/android/EventProcessor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 117
    iput-object p2, p0, Lcom/launchdarkly/android/EventProcessor$Consumer;->config:Lcom/launchdarkly/android/LDConfig;

    return-void
.end method

.method private postEvents(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/launchdarkly/android/Event;",
            ">;)V"
        }
    .end annotation

    .line 142
    iget-object v0, p0, Lcom/launchdarkly/android/EventProcessor$Consumer;->config:Lcom/launchdarkly/android/LDConfig;

    invoke-virtual {v0}, Lcom/launchdarkly/android/LDConfig;->getFilteredEventGson()Lcom/google/gson/Gson;

    move-result-object v0

    instance-of v1, v0, Lcom/google/gson/Gson;

    if-nez v1, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    check-cast v0, Lcom/google/gson/Gson;

    invoke-static {v0, p1}, Lcom/newrelic/agent/android/instrumentation/GsonInstrumentation;->toJson(Lcom/google/gson/Gson;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 143
    :goto_0
    iget-object v1, p0, Lcom/launchdarkly/android/EventProcessor$Consumer;->config:Lcom/launchdarkly/android/LDConfig;

    iget-object v2, p0, Lcom/launchdarkly/android/EventProcessor$Consumer;->this$0:Lcom/launchdarkly/android/EventProcessor;

    invoke-static {v2}, Lcom/launchdarkly/android/EventProcessor;->access$100(Lcom/launchdarkly/android/EventProcessor;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/launchdarkly/android/LDConfig;->getRequestBuilderFor(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/launchdarkly/android/EventProcessor$Consumer;->config:Lcom/launchdarkly/android/LDConfig;

    .line 144
    invoke-virtual {v2}, Lcom/launchdarkly/android/LDConfig;->getEventsUri()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v1

    sget-object v2, Lcom/launchdarkly/android/LDConfig;->JSON:Lokhttp3/MediaType;

    .line 145
    invoke-static {v2, v0}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;

    move-result-object v0

    invoke-virtual {v1, v0}, Lokhttp3/Request$Builder;->post(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    move-result-object v0

    const-string v1, "Content-Type"

    const-string v2, "application/json"

    .line 146
    invoke-virtual {v0, v1, v2}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v0

    const-string v1, "X-LaunchDarkly-Event-Schema"

    const-string v2, "3"

    .line 147
    invoke-virtual {v0, v1, v2}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v0

    .line 148
    instance-of v1, v0, Lokhttp3/Request$Builder;

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v0

    goto :goto_1

    :cond_1
    check-cast v0, Lokhttp3/Request$Builder;

    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/okhttp3/OkHttp3Instrumentation;->build(Lokhttp3/Request$Builder;)Lokhttp3/Request;

    move-result-object v0

    :goto_1
    const-string v1, "Posting %s event(s) to %s"

    const/4 v2, 0x2

    .line 150
    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object p1

    const/4 v4, 0x1

    aput-object p1, v2, v4

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 154
    :try_start_0
    iget-object v1, p0, Lcom/launchdarkly/android/EventProcessor$Consumer;->this$0:Lcom/launchdarkly/android/EventProcessor;

    invoke-static {v1}, Lcom/launchdarkly/android/EventProcessor;->access$500(Lcom/launchdarkly/android/EventProcessor;)Lokhttp3/OkHttpClient;

    move-result-object v1

    instance-of v2, v1, Lokhttp3/OkHttpClient;

    if-nez v2, :cond_2

    invoke-virtual {v1, v0}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object v1

    goto :goto_2

    :cond_2
    check-cast v1, Lokhttp3/OkHttpClient;

    invoke-static {v1, v0}, Lcom/newrelic/agent/android/instrumentation/okhttp3/OkHttp3Instrumentation;->newCall(Lokhttp3/OkHttpClient;Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    move-result-object p1

    const-string v1, "Events Response: %s"

    .line 155
    new-array v2, v4, [Ljava/lang/Object;

    invoke-virtual {p1}, Lokhttp3/Response;->code()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v2, v3

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v1, "Events Response Date: %s"

    .line 156
    new-array v2, v4, [Ljava/lang/Object;

    const-string v5, "Date"

    invoke-virtual {p1, v5}, Lokhttp3/Response;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v2, v3

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v1, "Date"

    .line 158
    invoke-virtual {p1, v1}, Lokhttp3/Response;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 159
    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v5, "EEE, dd MMM yyyy HH:mm:ss zzz"

    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v2, v5, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 161
    :try_start_1
    invoke-virtual {v2, v1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    .line 162
    iget-object v2, p0, Lcom/launchdarkly/android/EventProcessor$Consumer;->this$0:Lcom/launchdarkly/android/EventProcessor;

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    invoke-static {v2, v5, v6}, Lcom/launchdarkly/android/EventProcessor;->access$602(Lcom/launchdarkly/android/EventProcessor;J)J
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catch_0
    move-exception v1

    :try_start_2
    const-string v2, "Failed to parse date header"

    .line 164
    new-array v5, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v5}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_3
    if-eqz p1, :cond_3

    goto :goto_4

    :catchall_0
    move-exception v0

    goto :goto_5

    :catch_1
    move-exception v1

    :try_start_3
    const-string v2, "Unhandled exception in LaunchDarkly client attempting to connect to URI: %s"

    .line 167
    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v0}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v0

    aput-object v0, v4, v3

    invoke-static {v1, v2, v4}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz p1, :cond_3

    .line 169
    :goto_4
    invoke-virtual {p1}, Lokhttp3/Response;->close()V

    :cond_3
    return-void

    :goto_5
    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lokhttp3/Response;->close()V

    :cond_4
    throw v0
.end method


# virtual methods
.method public declared-synchronized flush()V
    .locals 3

    monitor-enter p0

    .line 126
    :try_start_0
    iget-object v0, p0, Lcom/launchdarkly/android/EventProcessor$Consumer;->this$0:Lcom/launchdarkly/android/EventProcessor;

    invoke-static {v0}, Lcom/launchdarkly/android/EventProcessor;->access$000(Lcom/launchdarkly/android/EventProcessor;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/launchdarkly/android/EventProcessor$Consumer;->this$0:Lcom/launchdarkly/android/EventProcessor;

    invoke-static {v1}, Lcom/launchdarkly/android/EventProcessor;->access$100(Lcom/launchdarkly/android/EventProcessor;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/launchdarkly/android/Util;->isClientConnected(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 127
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/launchdarkly/android/EventProcessor$Consumer;->this$0:Lcom/launchdarkly/android/EventProcessor;

    invoke-static {v1}, Lcom/launchdarkly/android/EventProcessor;->access$200(Lcom/launchdarkly/android/EventProcessor;)Ljava/util/concurrent/BlockingQueue;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 128
    iget-object v1, p0, Lcom/launchdarkly/android/EventProcessor$Consumer;->this$0:Lcom/launchdarkly/android/EventProcessor;

    invoke-static {v1}, Lcom/launchdarkly/android/EventProcessor;->access$200(Lcom/launchdarkly/android/EventProcessor;)Ljava/util/concurrent/BlockingQueue;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/concurrent/BlockingQueue;->drainTo(Ljava/util/Collection;)I

    .line 129
    iget-object v1, p0, Lcom/launchdarkly/android/EventProcessor$Consumer;->this$0:Lcom/launchdarkly/android/EventProcessor;

    invoke-static {v1}, Lcom/launchdarkly/android/EventProcessor;->access$300(Lcom/launchdarkly/android/EventProcessor;)Lcom/launchdarkly/android/SummaryEvent;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 130
    iget-object v1, p0, Lcom/launchdarkly/android/EventProcessor$Consumer;->this$0:Lcom/launchdarkly/android/EventProcessor;

    invoke-static {v1}, Lcom/launchdarkly/android/EventProcessor;->access$300(Lcom/launchdarkly/android/EventProcessor;)Lcom/launchdarkly/android/SummaryEvent;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 131
    iget-object v1, p0, Lcom/launchdarkly/android/EventProcessor$Consumer;->this$0:Lcom/launchdarkly/android/EventProcessor;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/launchdarkly/android/EventProcessor;->access$302(Lcom/launchdarkly/android/EventProcessor;Lcom/launchdarkly/android/SummaryEvent;)Lcom/launchdarkly/android/SummaryEvent;

    .line 132
    iget-object v1, p0, Lcom/launchdarkly/android/EventProcessor$Consumer;->this$0:Lcom/launchdarkly/android/EventProcessor;

    invoke-static {v1}, Lcom/launchdarkly/android/EventProcessor;->access$400(Lcom/launchdarkly/android/EventProcessor;)Lcom/launchdarkly/android/response/SummaryEventSharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Lcom/launchdarkly/android/response/SummaryEventSharedPreferences;->clear()V

    .line 135
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 136
    invoke-direct {p0, v0}, Lcom/launchdarkly/android/EventProcessor$Consumer;->postEvents(Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public run()V
    .locals 0

    .line 122
    invoke-virtual {p0}, Lcom/launchdarkly/android/EventProcessor$Consumer;->flush()V

    return-void
.end method
