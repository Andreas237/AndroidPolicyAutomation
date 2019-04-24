.class public Lcom/newrelic/agent/android/connectivity/CatPayload;
.super Ljava/lang/Object;
.source "CatPayload.java"


# static fields
.field public static final ACCOUNT_ID_KEY:Ljava/lang/String; = "ac"

.field public static final APP_ID_KEY:Ljava/lang/String; = "ap"

.field public static final DATA_KEY:Ljava/lang/String; = "d"

.field public static final DISTRIBUTED_TRACING_VERSION_KEY:Ljava/lang/String; = "v"

.field public static final PAYLOAD_ID_KEY:Ljava/lang/String; = "id"

.field public static final PAYLOAD_TYPE_KEY:Ljava/lang/String; = "ty"

.field public static final TIMESTAMP_KEY:Ljava/lang/String; = "ti"

.field public static final TRACE_ID_KEY:Ljava/lang/String; = "tr"

.field private static final gson:Lcom/newrelic/com/google/gson/Gson;

.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# instance fields
.field private callerAccountId:Ljava/lang/String;

.field private callerAppId:Ljava/lang/String;

.field private final callerType:Ljava/lang/String;

.field private data:Ljava/lang/String;

.field private id:Ljava/lang/String;

.field private final majorVersion:I

.field private final minorVersion:I

.field private timestampMs:J

.field private traceId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/connectivity/CatPayload;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    .line 19
    new-instance v0, Lcom/newrelic/com/google/gson/Gson;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/Gson;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/connectivity/CatPayload;->gson:Lcom/newrelic/com/google/gson/Gson;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 30
    iput v0, p0, Lcom/newrelic/agent/android/connectivity/CatPayload;->majorVersion:I

    const/4 v0, 0x2

    .line 31
    iput v0, p0, Lcom/newrelic/agent/android/connectivity/CatPayload;->minorVersion:I

    const-string v0, "Mobile"

    .line 32
    iput-object v0, p0, Lcom/newrelic/agent/android/connectivity/CatPayload;->callerType:Ljava/lang/String;

    .line 41
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/newrelic/agent/android/connectivity/CatPayload;->timestampMs:J

    .line 42
    iput-object p1, p0, Lcom/newrelic/agent/android/connectivity/CatPayload;->callerAccountId:Ljava/lang/String;

    .line 43
    iput-object p2, p0, Lcom/newrelic/agent/android/connectivity/CatPayload;->callerAppId:Ljava/lang/String;

    .line 44
    iput-object p3, p0, Lcom/newrelic/agent/android/connectivity/CatPayload;->id:Ljava/lang/String;

    .line 45
    iput-object p4, p0, Lcom/newrelic/agent/android/connectivity/CatPayload;->traceId:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public asBase64Json()Ljava/lang/String;
    .locals 2

    .line 91
    :try_start_0
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getEncoder()Lcom/newrelic/agent/android/util/Encoder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/newrelic/agent/android/connectivity/CatPayload;->asJson()Lcom/newrelic/com/google/gson/JsonObject;

    move-result-object v1

    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/util/Encoder;->encodeNoWrap([B)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 93
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    const-string v0, ""

    return-object v0
.end method

.method public asJson()Lcom/newrelic/com/google/gson/JsonObject;
    .locals 7

    .line 65
    new-instance v0, Lcom/newrelic/com/google/gson/JsonObject;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/JsonObject;-><init>()V

    .line 66
    new-instance v1, Lcom/newrelic/com/google/gson/JsonArray;

    invoke-direct {v1}, Lcom/newrelic/com/google/gson/JsonArray;-><init>()V

    .line 67
    new-instance v2, Lcom/newrelic/com/google/gson/JsonObject;

    invoke-direct {v2}, Lcom/newrelic/com/google/gson/JsonObject;-><init>()V

    .line 69
    :try_start_0
    new-instance v3, Lcom/newrelic/com/google/gson/JsonPrimitive;

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    invoke-virtual {v1, v3}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 70
    new-instance v3, Lcom/newrelic/com/google/gson/JsonPrimitive;

    const/4 v4, 0x2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    invoke-virtual {v1, v3}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v3, "ty"

    .line 72
    new-instance v4, Lcom/newrelic/com/google/gson/JsonPrimitive;

    const-string v5, "Mobile"

    invoke-direct {v4, v5}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3, v4}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v3, "ac"

    .line 73
    new-instance v4, Lcom/newrelic/com/google/gson/JsonPrimitive;

    iget-object v5, p0, Lcom/newrelic/agent/android/connectivity/CatPayload;->callerAccountId:Ljava/lang/String;

    invoke-direct {v4, v5}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3, v4}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v3, "ap"

    .line 74
    new-instance v4, Lcom/newrelic/com/google/gson/JsonPrimitive;

    iget-object v5, p0, Lcom/newrelic/agent/android/connectivity/CatPayload;->callerAppId:Ljava/lang/String;

    invoke-direct {v4, v5}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3, v4}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v3, "id"

    .line 75
    new-instance v4, Lcom/newrelic/com/google/gson/JsonPrimitive;

    iget-object v5, p0, Lcom/newrelic/agent/android/connectivity/CatPayload;->id:Ljava/lang/String;

    invoke-direct {v4, v5}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3, v4}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v3, "tr"

    .line 76
    new-instance v4, Lcom/newrelic/com/google/gson/JsonPrimitive;

    iget-object v5, p0, Lcom/newrelic/agent/android/connectivity/CatPayload;->traceId:Ljava/lang/String;

    invoke-direct {v4, v5}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3, v4}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v3, "ti"

    .line 77
    new-instance v4, Lcom/newrelic/com/google/gson/JsonPrimitive;

    iget-wide v5, p0, Lcom/newrelic/agent/android/connectivity/CatPayload;->timestampMs:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-direct {v4, v5}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    invoke-virtual {v2, v3, v4}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v3, "v"

    .line 79
    invoke-virtual {v0, v3, v1}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v1, "d"

    .line 80
    invoke-virtual {v0, v1, v2}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 83
    sget-object v2, Lcom/newrelic/agent/android/connectivity/CatPayload;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v3, "Unable to create payload asJSON"

    invoke-interface {v2, v3, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-object v0
.end method

.method public asMapForRequest()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 49
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "guid"

    .line 50
    iget-object v2, p0, Lcom/newrelic/agent/android/connectivity/CatPayload;->id:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "traceId"

    .line 51
    iget-object v2, p0, Lcom/newrelic/agent/android/connectivity/CatPayload;->traceId:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public asMapForUserAction()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 57
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "guid"

    .line 58
    iget-object v2, p0, Lcom/newrelic/agent/android/connectivity/CatPayload;->id:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "traceId"

    .line 59
    iget-object v2, p0, Lcom/newrelic/agent/android/connectivity/CatPayload;->traceId:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public getData()Ljava/lang/String;
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/newrelic/agent/android/connectivity/CatPayload;->data:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/newrelic/agent/android/connectivity/CatPayload;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getTraceId()Ljava/lang/String;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/newrelic/agent/android/connectivity/CatPayload;->traceId:Ljava/lang/String;

    return-object v0
.end method

.method public setData(Ljava/lang/String;)V
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/newrelic/agent/android/connectivity/CatPayload;->data:Ljava/lang/String;

    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .line 111
    iput-object p1, p0, Lcom/newrelic/agent/android/connectivity/CatPayload;->id:Ljava/lang/String;

    return-void
.end method
