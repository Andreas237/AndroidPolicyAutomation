.class public Lcom/newrelic/agent/android/harvest/AgentHealthException;
.super Lcom/newrelic/agent/android/harvest/type/HarvestableArray;
.source "AgentHealthException.java"


# instance fields
.field private final count:Ljava/util/concurrent/atomic/AtomicLong;

.field private exceptionClass:Ljava/lang/String;

.field private extras:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private message:Ljava/lang/String;

.field private stackTrace:[Ljava/lang/StackTraceElement;

.field private threadName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Exception;)V
    .locals 1

    .line 24
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/newrelic/agent/android/harvest/AgentHealthException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Exception;Ljava/lang/String;)V
    .locals 2

    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Exception;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p1

    invoke-direct {p0, v0, v1, p2, p1}, Lcom/newrelic/agent/android/harvest/AgentHealthException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/StackTraceElement;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/StackTraceElement;)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 32
    invoke-direct/range {v0 .. v5}, Lcom/newrelic/agent/android/harvest/AgentHealthException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/StackTraceElement;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/StackTraceElement;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/StackTraceElement;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 36
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/type/HarvestableArray;-><init>()V

    .line 20
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x1

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/AgentHealthException;->count:Ljava/util/concurrent/atomic/AtomicLong;

    .line 38
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/AgentHealthException;->exceptionClass:Ljava/lang/String;

    .line 39
    iput-object p2, p0, Lcom/newrelic/agent/android/harvest/AgentHealthException;->message:Ljava/lang/String;

    .line 40
    iput-object p3, p0, Lcom/newrelic/agent/android/harvest/AgentHealthException;->threadName:Ljava/lang/String;

    .line 41
    iput-object p4, p0, Lcom/newrelic/agent/android/harvest/AgentHealthException;->stackTrace:[Ljava/lang/StackTraceElement;

    .line 42
    iput-object p5, p0, Lcom/newrelic/agent/android/harvest/AgentHealthException;->extras:Ljava/util/Map;

    return-void
.end method

.method private extrasToJson()Lcom/newrelic/com/google/gson/JsonObject;
    .locals 4

    .line 110
    new-instance v0, Lcom/newrelic/com/google/gson/JsonObject;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/JsonObject;-><init>()V

    .line 112
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/AgentHealthException;->extras:Ljava/util/Map;

    if-eqz v1, :cond_0

    .line 113
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 114
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private stackTraceToJson()Lcom/newrelic/com/google/gson/JsonArray;
    .locals 5

    .line 100
    new-instance v0, Lcom/newrelic/com/google/gson/JsonArray;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/JsonArray;-><init>()V

    .line 102
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/AgentHealthException;->stackTrace:[Ljava/lang/StackTraceElement;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    .line 103
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public asJsonArray()Lcom/newrelic/com/google/gson/JsonArray;
    .locals 3

    .line 87
    new-instance v0, Lcom/newrelic/com/google/gson/JsonArray;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/JsonArray;-><init>()V

    .line 89
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/AgentHealthException;->exceptionClass:Ljava/lang/String;

    invoke-static {v1}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 90
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/AgentHealthException;->message:Ljava/lang/String;

    if-nez v1, :cond_0

    const-string v1, ""

    :cond_0
    invoke-static {v1}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 91
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/AgentHealthException;->threadName:Ljava/lang/String;

    invoke-static {v1}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 92
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/AgentHealthException;->stackTraceToJson()Lcom/newrelic/com/google/gson/JsonArray;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 93
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/AgentHealthException;->count:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v1}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/Number;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 94
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/AgentHealthException;->extrasToJson()Lcom/newrelic/com/google/gson/JsonObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    return-object v0
.end method

.method public getCount()J
    .locals 2

    .line 70
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/AgentHealthException;->count:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    return-wide v0
.end method

.method public getExceptionClass()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/AgentHealthException;->exceptionClass:Ljava/lang/String;

    return-object v0
.end method

.method public getExtras()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 74
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/AgentHealthException;->extras:Ljava/util/Map;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/AgentHealthException;->message:Ljava/lang/String;

    return-object v0
.end method

.method public getSourceClass()Ljava/lang/String;
    .locals 2

    .line 78
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/AgentHealthException;->stackTrace:[Ljava/lang/StackTraceElement;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSourceMethod()Ljava/lang/String;
    .locals 2

    .line 82
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/AgentHealthException;->stackTrace:[Ljava/lang/StackTraceElement;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getStackTrace()[Ljava/lang/StackTraceElement;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/AgentHealthException;->stackTrace:[Ljava/lang/StackTraceElement;

    return-object v0
.end method

.method public getThreadName()Ljava/lang/String;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/AgentHealthException;->threadName:Ljava/lang/String;

    return-object v0
.end method

.method public increment()V
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/AgentHealthException;->count:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    return-void
.end method

.method public increment(J)V
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/AgentHealthException;->count:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->getAndAdd(J)J

    return-void
.end method
