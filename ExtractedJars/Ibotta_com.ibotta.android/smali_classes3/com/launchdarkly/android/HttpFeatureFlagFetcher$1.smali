.class Lcom/launchdarkly/android/HttpFeatureFlagFetcher$1;
.super Ljava/lang/Object;
.source "HttpFeatureFlagFetcher.java"

# interfaces
.implements Lokhttp3/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/launchdarkly/android/HttpFeatureFlagFetcher;->fetch(Lcom/launchdarkly/android/LDUser;)Lcom/google/common/util/concurrent/ListenableFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/launchdarkly/android/HttpFeatureFlagFetcher;

.field final synthetic val$doneFuture:Lcom/google/common/util/concurrent/SettableFuture;

.field final synthetic val$request:Lokhttp3/Request;


# direct methods
.method constructor <init>(Lcom/launchdarkly/android/HttpFeatureFlagFetcher;Lcom/google/common/util/concurrent/SettableFuture;Lokhttp3/Request;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/launchdarkly/android/HttpFeatureFlagFetcher$1;->this$0:Lcom/launchdarkly/android/HttpFeatureFlagFetcher;

    iput-object p2, p0, Lcom/launchdarkly/android/HttpFeatureFlagFetcher$1;->val$doneFuture:Lcom/google/common/util/concurrent/SettableFuture;

    iput-object p3, p0, Lcom/launchdarkly/android/HttpFeatureFlagFetcher$1;->val$request:Lokhttp3/Request;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lokhttp3/Call;Ljava/io/IOException;)V
    .locals 1
    .param p1    # Lokhttp3/Call;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/io/IOException;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string p1, "Exception when fetching flags."

    const/4 v0, 0x0

    .line 89
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p2, p1, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    iget-object p1, p0, Lcom/launchdarkly/android/HttpFeatureFlagFetcher$1;->val$doneFuture:Lcom/google/common/util/concurrent/SettableFuture;

    invoke-virtual {p1, p2}, Lcom/google/common/util/concurrent/SettableFuture;->setException(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public onResponse(Lokhttp3/Call;Lokhttp3/Response;)V
    .locals 6
    .param p1    # Lokhttp3/Call;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lokhttp3/Response;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string p1, ""

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 97
    :try_start_0
    invoke-virtual {p2}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 99
    invoke-virtual {v3}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    move-result-object p1

    .line 101
    :cond_0
    invoke-virtual {p2}, Lokhttp3/Response;->isSuccessful()Z

    move-result v3

    if-nez v3, :cond_2

    .line 102
    invoke-virtual {p2}, Lokhttp3/Response;->code()I

    move-result v3

    const/16 v4, 0x190

    if-ne v3, v4, :cond_1

    const-string v3, "Received 400 response when fetching flag values. Please check recommended ProGuard settings"

    .line 103
    new-array v4, v2, [Ljava/lang/Object;

    invoke-static {v3, v4}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    :cond_1
    new-instance v3, Ljava/io/IOException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Unexpected response when retrieving Feature Flags: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " using url: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/launchdarkly/android/HttpFeatureFlagFetcher$1;->val$request:Lokhttp3/Request;

    .line 106
    invoke-virtual {v5}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " with body: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 108
    :cond_2
    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {p1, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v3, "Cache hit count: %s Cache network Count: %s"

    .line 109
    new-array v4, v0, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/launchdarkly/android/HttpFeatureFlagFetcher$1;->this$0:Lcom/launchdarkly/android/HttpFeatureFlagFetcher;

    invoke-static {v5}, Lcom/launchdarkly/android/HttpFeatureFlagFetcher;->access$000(Lcom/launchdarkly/android/HttpFeatureFlagFetcher;)Lokhttp3/OkHttpClient;

    move-result-object v5

    invoke-virtual {v5}, Lokhttp3/OkHttpClient;->cache()Lokhttp3/Cache;

    move-result-object v5

    invoke-virtual {v5}, Lokhttp3/Cache;->hitCount()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    iget-object v5, p0, Lcom/launchdarkly/android/HttpFeatureFlagFetcher$1;->this$0:Lcom/launchdarkly/android/HttpFeatureFlagFetcher;

    invoke-static {v5}, Lcom/launchdarkly/android/HttpFeatureFlagFetcher;->access$000(Lcom/launchdarkly/android/HttpFeatureFlagFetcher;)Lokhttp3/OkHttpClient;

    move-result-object v5

    invoke-virtual {v5}, Lokhttp3/OkHttpClient;->cache()Lokhttp3/Cache;

    move-result-object v5

    invoke-virtual {v5}, Lokhttp3/Cache;->networkCount()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v1

    invoke-static {v3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v3, "Cache response: %s"

    .line 110
    new-array v4, v1, [Ljava/lang/Object;

    invoke-virtual {p2}, Lokhttp3/Response;->cacheResponse()Lokhttp3/Response;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v3, "Network response: %s"

    .line 111
    new-array v4, v1, [Ljava/lang/Object;

    invoke-virtual {p2}, Lokhttp3/Response;->networkResponse()Lokhttp3/Response;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    new-instance v3, Lcom/google/gson/JsonParser;

    invoke-direct {v3}, Lcom/google/gson/JsonParser;-><init>()V

    .line 114
    invoke-virtual {v3, p1}, Lcom/google/gson/JsonParser;->parse(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object v3

    .line 115
    iget-object v4, p0, Lcom/launchdarkly/android/HttpFeatureFlagFetcher$1;->val$doneFuture:Lcom/google/common/util/concurrent/SettableFuture;

    invoke-virtual {v4, v3}, Lcom/google/common/util/concurrent/SettableFuture;->set(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p2, :cond_3

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception v3

    :try_start_1
    const-string v4, "Exception when handling response for url: %s with body: %s"

    .line 117
    new-array v0, v0, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/launchdarkly/android/HttpFeatureFlagFetcher$1;->val$request:Lokhttp3/Request;

    invoke-virtual {v5}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v5

    aput-object v5, v0, v2

    aput-object p1, v0, v1

    invoke-static {v3, v4, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    iget-object p1, p0, Lcom/launchdarkly/android/HttpFeatureFlagFetcher$1;->val$doneFuture:Lcom/google/common/util/concurrent/SettableFuture;

    invoke-virtual {p1, v3}, Lcom/google/common/util/concurrent/SettableFuture;->setException(Ljava/lang/Throwable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p2, :cond_3

    .line 121
    :goto_0
    invoke-virtual {p2}, Lokhttp3/Response;->close()V

    :cond_3
    return-void

    :goto_1
    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lokhttp3/Response;->close()V

    :cond_4
    throw p1
.end method
