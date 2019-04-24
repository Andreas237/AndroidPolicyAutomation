.class public Lcom/newrelic/agent/android/harvest/crash/ExceptionInfo;
.super Lcom/newrelic/agent/android/harvest/type/HarvestableObject;
.source "ExceptionInfo.java"


# instance fields
.field private className:Ljava/lang/String;

.field private message:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/type/HarvestableObject;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 2

    .line 19
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/type/HarvestableObject;-><init>()V

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.newrelic.agent.android.unity.UnityException"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 22
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/crash/ExceptionInfo;->className:Ljava/lang/String;

    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/crash/ExceptionInfo;->className:Ljava/lang/String;

    .line 27
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 28
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/crash/ExceptionInfo;->message:Ljava/lang/String;

    goto :goto_1

    :cond_1
    const-string p1, ""

    .line 30
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/crash/ExceptionInfo;->message:Ljava/lang/String;

    :goto_1
    return-void
.end method

.method public static newFromJson(Lcom/newrelic/com/google/gson/JsonObject;)Lcom/newrelic/agent/android/harvest/crash/ExceptionInfo;
    .locals 2

    .line 53
    new-instance v0, Lcom/newrelic/agent/android/harvest/crash/ExceptionInfo;

    invoke-direct {v0}, Lcom/newrelic/agent/android/harvest/crash/ExceptionInfo;-><init>()V

    const-string v1, "name"

    .line 55
    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/gson/JsonObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "name"

    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    iput-object v1, v0, Lcom/newrelic/agent/android/harvest/crash/ExceptionInfo;->className:Ljava/lang/String;

    const-string v1, "cause"

    .line 57
    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/gson/JsonObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "cause"

    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object p0

    invoke-virtual {p0}, Lcom/newrelic/com/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    :cond_1
    const-string p0, ""

    :goto_1
    iput-object p0, v0, Lcom/newrelic/agent/android/harvest/crash/ExceptionInfo;->message:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public asJsonObject()Lcom/newrelic/com/google/gson/JsonObject;
    .locals 4

    .line 44
    new-instance v0, Lcom/newrelic/com/google/gson/JsonObject;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/JsonObject;-><init>()V

    const-string v1, "name"

    .line 46
    new-instance v2, Lcom/newrelic/com/google/gson/JsonPrimitive;

    iget-object v3, p0, Lcom/newrelic/agent/android/harvest/crash/ExceptionInfo;->className:Ljava/lang/String;

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const-string v3, ""

    :goto_0
    invoke-direct {v2, v3}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v1, "cause"

    .line 47
    new-instance v2, Lcom/newrelic/com/google/gson/JsonPrimitive;

    iget-object v3, p0, Lcom/newrelic/agent/android/harvest/crash/ExceptionInfo;->message:Ljava/lang/String;

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, ""

    :goto_1
    invoke-direct {v2, v3}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    return-object v0
.end method

.method public getClassName()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/crash/ExceptionInfo;->className:Ljava/lang/String;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/crash/ExceptionInfo;->message:Ljava/lang/String;

    return-object v0
.end method
