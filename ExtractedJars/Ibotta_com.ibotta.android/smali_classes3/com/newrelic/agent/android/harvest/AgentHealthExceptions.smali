.class public Lcom/newrelic/agent/android/harvest/AgentHealthExceptions;
.super Lcom/newrelic/agent/android/harvest/type/HarvestableObject;
.source "AgentHealthExceptions.java"


# static fields
.field private static final keyArray:Lcom/newrelic/com/google/gson/JsonArray;


# instance fields
.field private final agentHealthExceptions:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/newrelic/agent/android/harvest/AgentHealthException;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 15
    new-instance v0, Lcom/newrelic/com/google/gson/JsonArray;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/JsonArray;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/harvest/AgentHealthExceptions;->keyArray:Lcom/newrelic/com/google/gson/JsonArray;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 20
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/type/HarvestableObject;-><init>()V

    .line 17
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/AgentHealthExceptions;->agentHealthExceptions:Ljava/util/Map;

    .line 22
    sget-object v0, Lcom/newrelic/agent/android/harvest/AgentHealthExceptions;->keyArray:Lcom/newrelic/com/google/gson/JsonArray;

    new-instance v1, Lcom/newrelic/com/google/gson/JsonPrimitive;

    const-string v2, "ExceptionClass"

    invoke-direct {v1, v2}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 23
    sget-object v0, Lcom/newrelic/agent/android/harvest/AgentHealthExceptions;->keyArray:Lcom/newrelic/com/google/gson/JsonArray;

    new-instance v1, Lcom/newrelic/com/google/gson/JsonPrimitive;

    const-string v2, "Message"

    invoke-direct {v1, v2}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 24
    sget-object v0, Lcom/newrelic/agent/android/harvest/AgentHealthExceptions;->keyArray:Lcom/newrelic/com/google/gson/JsonArray;

    new-instance v1, Lcom/newrelic/com/google/gson/JsonPrimitive;

    const-string v2, "ThreadName"

    invoke-direct {v1, v2}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 25
    sget-object v0, Lcom/newrelic/agent/android/harvest/AgentHealthExceptions;->keyArray:Lcom/newrelic/com/google/gson/JsonArray;

    new-instance v1, Lcom/newrelic/com/google/gson/JsonPrimitive;

    const-string v2, "CallStack"

    invoke-direct {v1, v2}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 26
    sget-object v0, Lcom/newrelic/agent/android/harvest/AgentHealthExceptions;->keyArray:Lcom/newrelic/com/google/gson/JsonArray;

    new-instance v1, Lcom/newrelic/com/google/gson/JsonPrimitive;

    const-string v2, "Count"

    invoke-direct {v1, v2}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 27
    sget-object v0, Lcom/newrelic/agent/android/harvest/AgentHealthExceptions;->keyArray:Lcom/newrelic/com/google/gson/JsonArray;

    new-instance v1, Lcom/newrelic/com/google/gson/JsonPrimitive;

    const-string v2, "Extras"

    invoke-direct {v1, v2}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    return-void
.end method


# virtual methods
.method public add(Lcom/newrelic/agent/android/harvest/AgentHealthException;)V
    .locals 3

    .line 31
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/harvest/AgentHealthExceptions;->getKey(Lcom/newrelic/agent/android/harvest/AgentHealthException;)Ljava/lang/String;

    move-result-object v0

    .line 32
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/AgentHealthExceptions;->agentHealthExceptions:Ljava/util/Map;

    monitor-enter v1

    .line 33
    :try_start_0
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/AgentHealthExceptions;->agentHealthExceptions:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/newrelic/agent/android/harvest/AgentHealthException;

    if-nez v2, :cond_0

    .line 36
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/AgentHealthExceptions;->agentHealthExceptions:Ljava/util/Map;

    invoke-interface {v2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {v2}, Lcom/newrelic/agent/android/harvest/AgentHealthException;->increment()V

    .line 40
    :goto_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public asJsonObject()Lcom/newrelic/com/google/gson/JsonObject;
    .locals 5

    .line 70
    new-instance v0, Lcom/newrelic/com/google/gson/JsonObject;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/JsonObject;-><init>()V

    .line 72
    new-instance v1, Lcom/newrelic/com/google/gson/JsonArray;

    invoke-direct {v1}, Lcom/newrelic/com/google/gson/JsonArray;-><init>()V

    .line 74
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/AgentHealthExceptions;->agentHealthExceptions:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/newrelic/agent/android/harvest/AgentHealthException;

    .line 75
    invoke-virtual {v3}, Lcom/newrelic/agent/android/harvest/AgentHealthException;->asJsonArray()Lcom/newrelic/com/google/gson/JsonArray;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    goto :goto_0

    :cond_0
    const-string v2, "Type"

    .line 78
    new-instance v3, Lcom/newrelic/com/google/gson/JsonPrimitive;

    const-string v4, "AgentErrors"

    invoke-direct {v3, v4}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2, v3}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v2, "Keys"

    .line 79
    sget-object v3, Lcom/newrelic/agent/android/harvest/AgentHealthExceptions;->keyArray:Lcom/newrelic/com/google/gson/JsonArray;

    invoke-virtual {v0, v2, v3}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v2, "Data"

    .line 80
    invoke-virtual {v0, v2, v1}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    return-object v0
.end method

.method public clear()V
    .locals 2

    .line 44
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/AgentHealthExceptions;->agentHealthExceptions:Ljava/util/Map;

    monitor-enter v0

    .line 45
    :try_start_0
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/AgentHealthExceptions;->agentHealthExceptions:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 46
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getAgentHealthExceptions()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/newrelic/agent/android/harvest/AgentHealthException;",
            ">;"
        }
    .end annotation

    .line 54
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/AgentHealthExceptions;->agentHealthExceptions:Ljava/util/Map;

    return-object v0
.end method

.method public final getKey(Lcom/newrelic/agent/android/harvest/AgentHealthException;)Ljava/lang/String;
    .locals 2

    .line 61
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    if-eqz p1, :cond_0

    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/AgentHealthException;->getExceptionClass()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/AgentHealthException;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p1

    const/4 v1, 0x0

    aget-object p1, p1, v1

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public isEmpty()Z
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/AgentHealthExceptions;->agentHealthExceptions:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    return v0
.end method
