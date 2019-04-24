.class public Lcom/newrelic/agent/android/harvest/ConnectInformation;
.super Lcom/newrelic/agent/android/harvest/type/HarvestableArray;
.source "ConnectInformation.java"


# static fields
.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# instance fields
.field private applicationInformation:Lcom/newrelic/agent/android/harvest/ApplicationInformation;

.field private deviceInformation:Lcom/newrelic/agent/android/harvest/DeviceInformation;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 12
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/harvest/ConnectInformation;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-void
.end method

.method public constructor <init>(Lcom/newrelic/agent/android/harvest/ApplicationInformation;Lcom/newrelic/agent/android/harvest/DeviceInformation;)V
    .locals 2

    .line 17
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/type/HarvestableArray;-><init>()V

    if-nez p1, :cond_0

    .line 19
    sget-object v0, Lcom/newrelic/agent/android/harvest/ConnectInformation;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "null applicationInformation passed into ConnectInformation constructor"

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    :cond_0
    if-nez p2, :cond_1

    .line 22
    sget-object v0, Lcom/newrelic/agent/android/harvest/ConnectInformation;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "null deviceInformation passed into ConnectInformation constructor"

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    .line 24
    :cond_1
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/ConnectInformation;->applicationInformation:Lcom/newrelic/agent/android/harvest/ApplicationInformation;

    .line 25
    iput-object p2, p0, Lcom/newrelic/agent/android/harvest/ConnectInformation;->deviceInformation:Lcom/newrelic/agent/android/harvest/DeviceInformation;

    return-void
.end method


# virtual methods
.method public asJsonArray()Lcom/newrelic/com/google/gson/JsonArray;
    .locals 2

    .line 30
    new-instance v0, Lcom/newrelic/com/google/gson/JsonArray;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/JsonArray;-><init>()V

    .line 32
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/ConnectInformation;->applicationInformation:Lcom/newrelic/agent/android/harvest/ApplicationInformation;

    invoke-virtual {p0, v1}, Lcom/newrelic/agent/android/harvest/ConnectInformation;->notNull(Ljava/lang/Object;)V

    .line 33
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/ConnectInformation;->applicationInformation:Lcom/newrelic/agent/android/harvest/ApplicationInformation;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->asJsonArray()Lcom/newrelic/com/google/gson/JsonArray;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 35
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/ConnectInformation;->deviceInformation:Lcom/newrelic/agent/android/harvest/DeviceInformation;

    invoke-virtual {p0, v1}, Lcom/newrelic/agent/android/harvest/ConnectInformation;->notNull(Ljava/lang/Object;)V

    .line 36
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/ConnectInformation;->deviceInformation:Lcom/newrelic/agent/android/harvest/DeviceInformation;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->asJsonArray()Lcom/newrelic/com/google/gson/JsonArray;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_6

    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_2

    .line 62
    :cond_1
    check-cast p1, Lcom/newrelic/agent/android/harvest/ConnectInformation;

    .line 64
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/ConnectInformation;->applicationInformation:Lcom/newrelic/agent/android/harvest/ApplicationInformation;

    if-eqz v2, :cond_2

    iget-object v3, p1, Lcom/newrelic/agent/android/harvest/ConnectInformation;->applicationInformation:Lcom/newrelic/agent/android/harvest/ApplicationInformation;

    invoke-virtual {v2, v3}, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_2
    iget-object v2, p1, Lcom/newrelic/agent/android/harvest/ConnectInformation;->applicationInformation:Lcom/newrelic/agent/android/harvest/ApplicationInformation;

    if-eqz v2, :cond_3

    :goto_0
    return v1

    .line 66
    :cond_3
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/ConnectInformation;->deviceInformation:Lcom/newrelic/agent/android/harvest/DeviceInformation;

    if-eqz v2, :cond_4

    iget-object p1, p1, Lcom/newrelic/agent/android/harvest/ConnectInformation;->deviceInformation:Lcom/newrelic/agent/android/harvest/DeviceInformation;

    invoke-virtual {v2, p1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_1

    :cond_4
    iget-object p1, p1, Lcom/newrelic/agent/android/harvest/ConnectInformation;->deviceInformation:Lcom/newrelic/agent/android/harvest/DeviceInformation;

    if-eqz p1, :cond_5

    :goto_1
    return v1

    :cond_5
    return v0

    :cond_6
    :goto_2
    return v1
.end method

.method public getApplicationInformation()Lcom/newrelic/agent/android/harvest/ApplicationInformation;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/ConnectInformation;->applicationInformation:Lcom/newrelic/agent/android/harvest/ApplicationInformation;

    return-object v0
.end method

.method public getDeviceInformation()Lcom/newrelic/agent/android/harvest/DeviceInformation;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/ConnectInformation;->deviceInformation:Lcom/newrelic/agent/android/harvest/DeviceInformation;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 74
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/ConnectInformation;->applicationInformation:Lcom/newrelic/agent/android/harvest/ApplicationInformation;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 75
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/ConnectInformation;->deviceInformation:Lcom/newrelic/agent/android/harvest/DeviceInformation;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->hashCode()I

    move-result v1

    :cond_1
    add-int/2addr v0, v1

    return v0
.end method

.method public setApplicationInformation(Lcom/newrelic/agent/android/harvest/ApplicationInformation;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/ConnectInformation;->applicationInformation:Lcom/newrelic/agent/android/harvest/ApplicationInformation;

    return-void
.end method

.method public setDeviceInformation(Lcom/newrelic/agent/android/harvest/DeviceInformation;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/ConnectInformation;->deviceInformation:Lcom/newrelic/agent/android/harvest/DeviceInformation;

    return-void
.end method
