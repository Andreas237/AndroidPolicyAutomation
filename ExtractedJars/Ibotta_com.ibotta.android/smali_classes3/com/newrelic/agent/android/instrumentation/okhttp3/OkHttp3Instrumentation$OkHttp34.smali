.class public Lcom/newrelic/agent/android/instrumentation/okhttp3/OkHttp3Instrumentation$OkHttp34;
.super Ljava/lang/Object;
.source "OkHttp3Instrumentation.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/newrelic/agent/android/instrumentation/okhttp3/OkHttp3Instrumentation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "OkHttp34"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static callEngineGetStreamAllocation(Lokhttp3/internal/Internal;Lokhttp3/Call;)Lokhttp3/internal/connection/StreamAllocation;
    .locals 7
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
    .end annotation

    const/4 v0, 0x0

    .line 107
    :try_start_0
    instance-of v1, p1, Lcom/newrelic/agent/android/instrumentation/okhttp3/CallExtension;

    if-eqz v1, :cond_0

    .line 108
    check-cast p1, Lcom/newrelic/agent/android/instrumentation/okhttp3/CallExtension;

    invoke-virtual {p1}, Lcom/newrelic/agent/android/instrumentation/okhttp3/CallExtension;->getImpl()Lokhttp3/Call;

    move-result-object p1

    .line 111
    :cond_0
    const-class v1, Lokhttp3/internal/Internal;

    const-string v2, "callEngineGetStreamAllocation"

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Class;

    const-class v5, Lokhttp3/Call;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 113
    new-array v2, v3, [Ljava/lang/Object;

    aput-object p1, v2, v6

    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lokhttp3/internal/connection/StreamAllocation;

    move-object v0, p0

    goto :goto_0

    :cond_1
    const-string p0, "callEngineGetStreamAllocation(Lokhttp3/Call;)Lokhttp3/internal/connection/StreamAllocation;"

    .line 115
    invoke-static {p0}, Lcom/newrelic/agent/android/instrumentation/okhttp3/OkHttp3Instrumentation;->access$000(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 119
    invoke-static {}, Lcom/newrelic/agent/android/instrumentation/okhttp3/OkHttp3Instrumentation;->access$100()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "OkHttp3Instrumentation: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method

.method public static setCallWebSocket(Lokhttp3/internal/Internal;Lokhttp3/Call;)V
    .locals 6
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
    .end annotation

    .line 86
    :try_start_0
    instance-of v0, p1, Lcom/newrelic/agent/android/instrumentation/okhttp3/CallExtension;

    if-eqz v0, :cond_0

    .line 87
    check-cast p1, Lcom/newrelic/agent/android/instrumentation/okhttp3/CallExtension;

    invoke-virtual {p1}, Lcom/newrelic/agent/android/instrumentation/okhttp3/CallExtension;->getImpl()Lokhttp3/Call;

    move-result-object p1

    .line 90
    :cond_0
    const-class v0, Lokhttp3/internal/Internal;

    const-string v1, "setCallWebSocket"

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Class;

    const-class v4, Lokhttp3/Call;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 92
    new-array v1, v2, [Ljava/lang/Object;

    aput-object p1, v1, v5

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    const-string p0, "setCallWebSocket(Lokhttp3/Call;)V"

    .line 94
    invoke-static {p0}, Lcom/newrelic/agent/android/instrumentation/okhttp3/OkHttp3Instrumentation;->access$000(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 98
    invoke-static {}, Lcom/newrelic/agent/android/instrumentation/okhttp3/OkHttp3Instrumentation;->access$100()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OkHttp3Instrumentation: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
