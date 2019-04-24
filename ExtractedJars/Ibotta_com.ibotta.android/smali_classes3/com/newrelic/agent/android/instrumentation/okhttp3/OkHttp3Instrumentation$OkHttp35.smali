.class public Lcom/newrelic/agent/android/instrumentation/okhttp3/OkHttp3Instrumentation$OkHttp35;
.super Ljava/lang/Object;
.source "OkHttp3Instrumentation.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/newrelic/agent/android/instrumentation/okhttp3/OkHttp3Instrumentation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "OkHttp35"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static newWebSocketCall(Lokhttp3/internal/Internal;Lokhttp3/OkHttpClient;Lokhttp3/Request;)Lokhttp3/Call;
    .locals 8
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
    .end annotation

    const/4 v0, 0x0

    .line 133
    :try_start_0
    const-class v1, Lokhttp3/internal/Internal;

    const-string v2, "newWebSocketCall"

    const/4 v3, 0x2

    new-array v4, v3, [Ljava/lang/Class;

    const-class v5, Lokhttp3/OkHttpClient;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const-class v5, Lokhttp3/Request;

    const/4 v7, 0x1

    aput-object v5, v4, v7

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 135
    new-instance v2, Lcom/newrelic/agent/android/instrumentation/TransactionState;

    invoke-direct {v2}, Lcom/newrelic/agent/android/instrumentation/TransactionState;-><init>()V

    .line 136
    sget-object v4, Lcom/newrelic/agent/android/FeatureFlag;->DistributedTracing:Lcom/newrelic/agent/android/FeatureFlag;

    invoke-static {v4}, Lcom/newrelic/agent/android/FeatureFlag;->featureEnabled(Lcom/newrelic/agent/android/FeatureFlag;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 137
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getCatFacade()Lcom/newrelic/agent/android/connectivity/CatFacade;

    move-result-object v4

    invoke-virtual {v4}, Lcom/newrelic/agent/android/connectivity/CatFacade;->startTrip()Lcom/newrelic/agent/android/connectivity/CatPayload;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->setCatPayload(Lcom/newrelic/agent/android/connectivity/CatPayload;)V

    .line 138
    invoke-virtual {p2}, Lokhttp3/Request;->newBuilder()Lokhttp3/Request$Builder;

    move-result-object p2

    const-string v4, "newrelic"

    .line 139
    invoke-virtual {v2}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->getCatPayload()Lcom/newrelic/agent/android/connectivity/CatPayload;

    move-result-object v5

    invoke-virtual {v5}, Lcom/newrelic/agent/android/connectivity/CatPayload;->asBase64Json()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v4, v5}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p2

    .line 140
    invoke-virtual {p2}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object p2

    .line 141
    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v6

    aput-object p2, v3, v7

    invoke-virtual {v1, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lokhttp3/Call;

    .line 142
    new-instance v1, Lcom/newrelic/agent/android/instrumentation/okhttp3/CallExtension;

    invoke-direct {v1, p1, p2, p0, v2}, Lcom/newrelic/agent/android/instrumentation/okhttp3/CallExtension;-><init>(Lokhttp3/OkHttpClient;Lokhttp3/Request;Lokhttp3/Call;Lcom/newrelic/agent/android/instrumentation/TransactionState;)V

    move-object v0, v1

    goto :goto_0

    .line 144
    :cond_0
    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v6

    aput-object p2, v3, v7

    invoke-virtual {v1, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lokhttp3/Call;

    .line 145
    new-instance v1, Lcom/newrelic/agent/android/instrumentation/okhttp3/CallExtension;

    invoke-direct {v1, p1, p2, p0, v2}, Lcom/newrelic/agent/android/instrumentation/okhttp3/CallExtension;-><init>(Lokhttp3/OkHttpClient;Lokhttp3/Request;Lokhttp3/Call;Lcom/newrelic/agent/android/instrumentation/TransactionState;)V

    move-object v0, v1

    goto :goto_0

    :cond_1
    const-string p0, "newWebSocketCall(Lokhttp3/OkHttpClient;Lokhttp3/Request;)Lokhttp3/Call;"

    .line 148
    invoke-static {p0}, Lcom/newrelic/agent/android/instrumentation/okhttp3/OkHttp3Instrumentation;->access$000(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 151
    invoke-static {}, Lcom/newrelic/agent/android/instrumentation/okhttp3/OkHttp3Instrumentation;->access$100()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OkHttp3Instrumentation: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method
