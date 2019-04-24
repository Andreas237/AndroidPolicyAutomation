.class public Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;
.super Lcom/newrelic/agent/android/harvest/type/HarvestableObject;
.source "ThreadInfo.java"


# instance fields
.field private crashed:Z

.field private stackTrace:[Ljava/lang/StackTraceElement;

.field private state:Ljava/lang/String;

.field private threadId:J

.field private threadName:Ljava/lang/String;

.field private threadPriority:I


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/type/HarvestableObject;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;)V
    .locals 2

    .line 44
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/type/HarvestableObject;-><init>()V

    const/4 v0, 0x0

    .line 46
    iput-boolean v0, p0, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;->crashed:Z

    .line 47
    invoke-virtual {p1}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;->threadId:J

    .line 48
    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;->threadName:Ljava/lang/String;

    .line 49
    invoke-virtual {p1}, Ljava/lang/Thread;->getPriority()I

    move-result v0

    iput v0, p0, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;->threadPriority:I

    .line 50
    iput-object p2, p0, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;->stackTrace:[Ljava/lang/StackTraceElement;

    .line 51
    invoke-virtual {p1}, Ljava/lang/Thread;->getState()Ljava/lang/Thread$State;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread$State;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;->state:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 2

    .line 31
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/type/HarvestableObject;-><init>()V

    const/4 v0, 0x1

    .line 35
    iput-boolean v0, p0, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;->crashed:Z

    .line 36
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;->threadId:J

    .line 37
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;->threadName:Ljava/lang/String;

    .line 38
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getPriority()I

    move-result v0

    iput v0, p0, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;->threadPriority:I

    .line 39
    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p1

    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;->stackTrace:[Ljava/lang/StackTraceElement;

    .line 40
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->getState()Ljava/lang/Thread$State;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread$State;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;->state:Ljava/lang/String;

    return-void
.end method

.method public static extractThreads(Ljava/lang/Throwable;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            ")",
            "Ljava/util/List<",
            "Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;",
            ">;"
        }
    .end annotation

    .line 59
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 60
    new-instance v1, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;

    invoke-direct {v1, p0}, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;-><init>(Ljava/lang/Throwable;)V

    .line 61
    invoke-virtual {v1}, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;->getThreadId()J

    move-result-wide v2

    .line 63
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    invoke-static {}, Ljava/lang/Thread;->getAllStackTraces()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 66
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Thread;

    .line 67
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/StackTraceElement;

    .line 69
    invoke-virtual {v4}, Ljava/lang/Thread;->getId()J

    move-result-wide v5

    cmp-long v7, v5, v2

    if-eqz v7, :cond_0

    .line 70
    new-instance v5, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;

    invoke-direct {v5, v4, v1}, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;-><init>(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private getStackAsJson()Lcom/newrelic/com/google/gson/JsonArray;
    .locals 8

    .line 139
    new-instance v0, Lcom/newrelic/com/google/gson/JsonArray;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/JsonArray;-><init>()V

    .line 141
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;->stackTrace:[Ljava/lang/StackTraceElement;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    .line 142
    new-instance v5, Lcom/newrelic/com/google/gson/JsonObject;

    invoke-direct {v5}, Lcom/newrelic/com/google/gson/JsonObject;-><init>()V

    .line 144
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_0

    const-string v6, "fileName"

    .line 145
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    :cond_0
    const-string v6, "className"

    .line 148
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v6, "methodName"

    .line 149
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v6, "lineNumber"

    .line 150
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/Number;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v4

    invoke-virtual {v5, v6, v4}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 152
    invoke-virtual {v0, v5}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static newFromJson(Lcom/newrelic/com/google/gson/JsonObject;)Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;
    .locals 3

    .line 92
    new-instance v0, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;

    invoke-direct {v0}, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;-><init>()V

    const-string v1, "crashed"

    .line 94
    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonElement;->getAsBoolean()Z

    move-result v1

    iput-boolean v1, v0, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;->crashed:Z

    const-string v1, "state"

    .line 95
    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;->state:Ljava/lang/String;

    const-string v1, "threadNumber"

    .line 96
    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonElement;->getAsLong()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;->threadId:J

    const-string v1, "threadId"

    .line 97
    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;->threadName:Ljava/lang/String;

    const-string v1, "priority"

    .line 98
    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonElement;->getAsInt()I

    move-result v1

    iput v1, v0, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;->threadPriority:I

    const-string v1, "stack"

    .line 99
    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object p0

    invoke-virtual {p0}, Lcom/newrelic/com/google/gson/JsonElement;->getAsJsonArray()Lcom/newrelic/com/google/gson/JsonArray;

    move-result-object p0

    invoke-static {p0}, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;->stackTraceFromJson(Lcom/newrelic/com/google/gson/JsonArray;)[Ljava/lang/StackTraceElement;

    move-result-object p0

    iput-object p0, v0, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;->stackTrace:[Ljava/lang/StackTraceElement;

    return-object v0
.end method

.method public static newListFromJson(Lcom/newrelic/com/google/gson/JsonArray;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/newrelic/com/google/gson/JsonArray;",
            ")",
            "Ljava/util/List<",
            "Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;",
            ">;"
        }
    .end annotation

    .line 129
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 131
    invoke-virtual {p0}, Lcom/newrelic/com/google/gson/JsonArray;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/com/google/gson/JsonElement;

    .line 132
    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonElement;->getAsJsonObject()Lcom/newrelic/com/google/gson/JsonObject;

    move-result-object v1

    invoke-static {v1}, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;->newFromJson(Lcom/newrelic/com/google/gson/JsonObject;)Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static stackTraceFromJson(Lcom/newrelic/com/google/gson/JsonArray;)[Ljava/lang/StackTraceElement;
    .locals 7

    .line 105
    invoke-virtual {p0}, Lcom/newrelic/com/google/gson/JsonArray;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/StackTraceElement;

    .line 108
    invoke-virtual {p0}, Lcom/newrelic/com/google/gson/JsonArray;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/newrelic/com/google/gson/JsonElement;

    const-string v3, "unknown"

    .line 111
    invoke-virtual {v2}, Lcom/newrelic/com/google/gson/JsonElement;->getAsJsonObject()Lcom/newrelic/com/google/gson/JsonObject;

    move-result-object v4

    const-string v5, "fileName"

    invoke-virtual {v4, v5}, Lcom/newrelic/com/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 112
    invoke-virtual {v2}, Lcom/newrelic/com/google/gson/JsonElement;->getAsJsonObject()Lcom/newrelic/com/google/gson/JsonObject;

    move-result-object v3

    const-string v4, "fileName"

    invoke-virtual {v3, v4}, Lcom/newrelic/com/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v3

    invoke-virtual {v3}, Lcom/newrelic/com/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v3

    .line 115
    :cond_0
    invoke-virtual {v2}, Lcom/newrelic/com/google/gson/JsonElement;->getAsJsonObject()Lcom/newrelic/com/google/gson/JsonObject;

    move-result-object v4

    const-string v5, "className"

    invoke-virtual {v4, v5}, Lcom/newrelic/com/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v4

    invoke-virtual {v4}, Lcom/newrelic/com/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v4

    .line 116
    invoke-virtual {v2}, Lcom/newrelic/com/google/gson/JsonElement;->getAsJsonObject()Lcom/newrelic/com/google/gson/JsonObject;

    move-result-object v5

    const-string v6, "methodName"

    invoke-virtual {v5, v6}, Lcom/newrelic/com/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v5

    invoke-virtual {v5}, Lcom/newrelic/com/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v5

    .line 117
    invoke-virtual {v2}, Lcom/newrelic/com/google/gson/JsonElement;->getAsJsonObject()Lcom/newrelic/com/google/gson/JsonObject;

    move-result-object v2

    const-string v6, "lineNumber"

    invoke-virtual {v2, v6}, Lcom/newrelic/com/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v2

    invoke-virtual {v2}, Lcom/newrelic/com/google/gson/JsonElement;->getAsInt()I

    move-result v2

    .line 119
    new-instance v6, Ljava/lang/StackTraceElement;

    invoke-direct {v6, v4, v5, v3, v2}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    add-int/lit8 v2, v1, 0x1

    .line 121
    aput-object v6, v0, v1

    move v1, v2

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public asJsonObject()Lcom/newrelic/com/google/gson/JsonObject;
    .locals 4

    .line 79
    new-instance v0, Lcom/newrelic/com/google/gson/JsonObject;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/JsonObject;-><init>()V

    const-string v1, "crashed"

    .line 81
    iget-boolean v2, p0, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;->crashed:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v2}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/Boolean;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v1, "state"

    .line 82
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;->state:Ljava/lang/String;

    invoke-static {v2}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v1, "threadNumber"

    .line 83
    iget-wide v2, p0, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;->threadId:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v2}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/Number;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v1, "threadId"

    .line 84
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;->threadName:Ljava/lang/String;

    invoke-static {v2}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v1, "priority"

    .line 85
    iget v2, p0, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;->threadPriority:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/Number;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v1, "stack"

    .line 86
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;->getStackAsJson()Lcom/newrelic/com/google/gson/JsonArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    return-object v0
.end method

.method public getThreadId()J
    .locals 2

    .line 55
    iget-wide v0, p0, Lcom/newrelic/agent/android/harvest/crash/ThreadInfo;->threadId:J

    return-wide v0
.end method
