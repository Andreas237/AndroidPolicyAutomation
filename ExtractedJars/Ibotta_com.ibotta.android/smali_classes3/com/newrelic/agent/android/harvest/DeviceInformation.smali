.class public Lcom/newrelic/agent/android/harvest/DeviceInformation;
.super Lcom/newrelic/agent/android/harvest/type/HarvestableArray;
.source "DeviceInformation.java"


# static fields
.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# instance fields
.field private agentName:Ljava/lang/String;

.field private agentVersion:Ljava/lang/String;

.field private applicationPlatform:Lcom/newrelic/agent/android/ApplicationPlatform;

.field private applicationPlatformVersion:Ljava/lang/String;

.field private architecture:Ljava/lang/String;

.field private countryCode:Ljava/lang/String;

.field private deviceId:Ljava/lang/String;

.field private manufacturer:Ljava/lang/String;

.field private misc:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private model:Ljava/lang/String;

.field private osBuild:Ljava/lang/String;

.field private osName:Ljava/lang/String;

.field private osVersion:Ljava/lang/String;

.field private regionCode:Ljava/lang/String;

.field private runTime:Ljava/lang/String;

.field private size:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 17
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/type/HarvestableArray;-><init>()V

    .line 34
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->misc:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public addMisc(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 150
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->misc:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public asJsonArray()Lcom/newrelic/com/google/gson/JsonArray;
    .locals 4

    .line 38
    new-instance v0, Lcom/newrelic/com/google/gson/JsonArray;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/JsonArray;-><init>()V

    .line 40
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->osName:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->notEmpty(Ljava/lang/String;)V

    .line 41
    new-instance v1, Lcom/newrelic/com/google/gson/JsonPrimitive;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->osName:Ljava/lang/String;

    invoke-direct {v1, v2}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 43
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->osVersion:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->notEmpty(Ljava/lang/String;)V

    .line 44
    new-instance v1, Lcom/newrelic/com/google/gson/JsonPrimitive;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->osVersion:Ljava/lang/String;

    invoke-direct {v1, v2}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 47
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->manufacturer:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->notEmpty(Ljava/lang/String;)V

    .line 48
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->model:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->notEmpty(Ljava/lang/String;)V

    .line 49
    new-instance v1, Lcom/newrelic/com/google/gson/JsonPrimitive;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->manufacturer:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->model:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 51
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->agentName:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->notEmpty(Ljava/lang/String;)V

    .line 52
    new-instance v1, Lcom/newrelic/com/google/gson/JsonPrimitive;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->agentName:Ljava/lang/String;

    invoke-direct {v1, v2}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 54
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->agentVersion:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->notEmpty(Ljava/lang/String;)V

    .line 55
    new-instance v1, Lcom/newrelic/com/google/gson/JsonPrimitive;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->agentVersion:Ljava/lang/String;

    invoke-direct {v1, v2}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 57
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->deviceId:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->notEmpty(Ljava/lang/String;)V

    .line 58
    new-instance v1, Lcom/newrelic/com/google/gson/JsonPrimitive;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->deviceId:Ljava/lang/String;

    invoke-direct {v1, v2}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 61
    new-instance v1, Lcom/newrelic/com/google/gson/JsonPrimitive;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->countryCode:Ljava/lang/String;

    invoke-virtual {p0, v2}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->optional(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 62
    new-instance v1, Lcom/newrelic/com/google/gson/JsonPrimitive;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->regionCode:Ljava/lang/String;

    invoke-virtual {p0, v2}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->optional(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 65
    new-instance v1, Lcom/newrelic/com/google/gson/JsonPrimitive;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->manufacturer:Ljava/lang/String;

    invoke-direct {v1, v2}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 67
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 68
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->misc:Ljava/util/Map;

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 69
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->misc:Ljava/util/Map;

    invoke-interface {v1, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 71
    :cond_0
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->applicationPlatform:Lcom/newrelic/agent/android/ApplicationPlatform;

    if-eqz v2, :cond_1

    const-string v3, "platform"

    .line 72
    invoke-virtual {v2}, Lcom/newrelic/agent/android/ApplicationPlatform;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->applicationPlatformVersion:Ljava/lang/String;

    if-eqz v2, :cond_1

    const-string v3, "platformVersion"

    .line 74
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    :cond_1
    new-instance v2, Lcom/newrelic/com/google/gson/Gson;

    invoke-direct {v2}, Lcom/newrelic/com/google/gson/Gson;-><init>()V

    sget-object v3, Lcom/newrelic/agent/android/harvest/DeviceInformation;->GSON_STRING_MAP_TYPE:Ljava/lang/reflect/Type;

    invoke-virtual {v2, v1, v3}, Lcom/newrelic/com/google/gson/Gson;->toJsonTree(Ljava/lang/Object;Ljava/lang/reflect/Type;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v1

    .line 79
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

    if-eqz p1, :cond_18

    .line 232
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_b

    .line 234
    :cond_1
    check-cast p1, Lcom/newrelic/agent/android/harvest/DeviceInformation;

    .line 236
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->agentName:Ljava/lang/String;

    if-eqz v2, :cond_2

    iget-object v3, p1, Lcom/newrelic/agent/android/harvest/DeviceInformation;->agentName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_2
    iget-object v2, p1, Lcom/newrelic/agent/android/harvest/DeviceInformation;->agentName:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_0
    return v1

    .line 237
    :cond_3
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->agentVersion:Ljava/lang/String;

    if-eqz v2, :cond_4

    iget-object v3, p1, Lcom/newrelic/agent/android/harvest/DeviceInformation;->agentVersion:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_1

    :cond_4
    iget-object v2, p1, Lcom/newrelic/agent/android/harvest/DeviceInformation;->agentVersion:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_1
    return v1

    .line 238
    :cond_5
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->architecture:Ljava/lang/String;

    if-eqz v2, :cond_6

    iget-object v3, p1, Lcom/newrelic/agent/android/harvest/DeviceInformation;->architecture:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_2

    :cond_6
    iget-object v2, p1, Lcom/newrelic/agent/android/harvest/DeviceInformation;->architecture:Ljava/lang/String;

    if-eqz v2, :cond_7

    :goto_2
    return v1

    .line 239
    :cond_7
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->deviceId:Ljava/lang/String;

    if-eqz v2, :cond_8

    iget-object v3, p1, Lcom/newrelic/agent/android/harvest/DeviceInformation;->deviceId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_3

    :cond_8
    iget-object v2, p1, Lcom/newrelic/agent/android/harvest/DeviceInformation;->deviceId:Ljava/lang/String;

    if-eqz v2, :cond_9

    :goto_3
    return v1

    .line 240
    :cond_9
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->manufacturer:Ljava/lang/String;

    if-eqz v2, :cond_a

    iget-object v3, p1, Lcom/newrelic/agent/android/harvest/DeviceInformation;->manufacturer:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    goto :goto_4

    :cond_a
    iget-object v2, p1, Lcom/newrelic/agent/android/harvest/DeviceInformation;->manufacturer:Ljava/lang/String;

    if-eqz v2, :cond_b

    :goto_4
    return v1

    .line 241
    :cond_b
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->model:Ljava/lang/String;

    if-eqz v2, :cond_c

    iget-object v3, p1, Lcom/newrelic/agent/android/harvest/DeviceInformation;->model:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    goto :goto_5

    :cond_c
    iget-object v2, p1, Lcom/newrelic/agent/android/harvest/DeviceInformation;->model:Ljava/lang/String;

    if-eqz v2, :cond_d

    :goto_5
    return v1

    .line 242
    :cond_d
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->osBuild:Ljava/lang/String;

    if-eqz v2, :cond_e

    iget-object v3, p1, Lcom/newrelic/agent/android/harvest/DeviceInformation;->osBuild:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    goto :goto_6

    :cond_e
    iget-object v2, p1, Lcom/newrelic/agent/android/harvest/DeviceInformation;->osBuild:Ljava/lang/String;

    if-eqz v2, :cond_f

    :goto_6
    return v1

    .line 243
    :cond_f
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->osName:Ljava/lang/String;

    if-eqz v2, :cond_10

    iget-object v3, p1, Lcom/newrelic/agent/android/harvest/DeviceInformation;->osName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    goto :goto_7

    :cond_10
    iget-object v2, p1, Lcom/newrelic/agent/android/harvest/DeviceInformation;->osName:Ljava/lang/String;

    if-eqz v2, :cond_11

    :goto_7
    return v1

    .line 244
    :cond_11
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->osVersion:Ljava/lang/String;

    if-eqz v2, :cond_12

    iget-object v3, p1, Lcom/newrelic/agent/android/harvest/DeviceInformation;->osVersion:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    goto :goto_8

    :cond_12
    iget-object v2, p1, Lcom/newrelic/agent/android/harvest/DeviceInformation;->osVersion:Ljava/lang/String;

    if-eqz v2, :cond_13

    :goto_8
    return v1

    .line 245
    :cond_13
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->runTime:Ljava/lang/String;

    if-eqz v2, :cond_14

    iget-object v3, p1, Lcom/newrelic/agent/android/harvest/DeviceInformation;->runTime:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    goto :goto_9

    :cond_14
    iget-object v2, p1, Lcom/newrelic/agent/android/harvest/DeviceInformation;->runTime:Ljava/lang/String;

    if-eqz v2, :cond_15

    :goto_9
    return v1

    .line 246
    :cond_15
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->size:Ljava/lang/String;

    if-eqz v2, :cond_16

    iget-object p1, p1, Lcom/newrelic/agent/android/harvest/DeviceInformation;->size:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_17

    goto :goto_a

    :cond_16
    iget-object p1, p1, Lcom/newrelic/agent/android/harvest/DeviceInformation;->size:Ljava/lang/String;

    if-eqz p1, :cond_17

    :goto_a
    return v1

    :cond_17
    return v0

    :cond_18
    :goto_b
    return v1
.end method

.method public getAgentName()Ljava/lang/String;
    .locals 1

    .line 170
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->agentName:Ljava/lang/String;

    return-object v0
.end method

.method public getAgentVersion()Ljava/lang/String;
    .locals 1

    .line 174
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->agentVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getApplicationPlatform()Lcom/newrelic/agent/android/ApplicationPlatform;
    .locals 1

    .line 206
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->applicationPlatform:Lcom/newrelic/agent/android/ApplicationPlatform;

    return-object v0
.end method

.method public getApplicationPlatformVersion()Ljava/lang/String;
    .locals 1

    .line 210
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->applicationPlatformVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getArchitecture()Ljava/lang/String;
    .locals 1

    .line 194
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->architecture:Ljava/lang/String;

    return-object v0
.end method

.method public getCountryCode()Ljava/lang/String;
    .locals 1

    .line 182
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->countryCode:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceId()Ljava/lang/String;
    .locals 1

    .line 178
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->deviceId:Ljava/lang/String;

    return-object v0
.end method

.method public getManufacturer()Ljava/lang/String;
    .locals 1

    .line 190
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->manufacturer:Ljava/lang/String;

    return-object v0
.end method

.method public getModel()Ljava/lang/String;
    .locals 1

    .line 166
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->model:Ljava/lang/String;

    return-object v0
.end method

.method public getOsBuild()Ljava/lang/String;
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->osBuild:Ljava/lang/String;

    return-object v0
.end method

.method public getOsName()Ljava/lang/String;
    .locals 1

    .line 154
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->osName:Ljava/lang/String;

    return-object v0
.end method

.method public getOsVersion()Ljava/lang/String;
    .locals 1

    .line 158
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->osVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getRegionCode()Ljava/lang/String;
    .locals 1

    .line 186
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->regionCode:Ljava/lang/String;

    return-object v0
.end method

.method public getRunTime()Ljava/lang/String;
    .locals 1

    .line 198
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->runTime:Ljava/lang/String;

    return-object v0
.end method

.method public getSize()Ljava/lang/String;
    .locals 1

    .line 202
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->size:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 253
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->osName:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 254
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->osVersion:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 255
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->osBuild:Ljava/lang/String;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 256
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->model:Ljava/lang/String;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 257
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->agentName:Ljava/lang/String;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_4

    :cond_4
    const/4 v2, 0x0

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 258
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->agentVersion:Ljava/lang/String;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_5

    :cond_5
    const/4 v2, 0x0

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 259
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->deviceId:Ljava/lang/String;

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_6

    :cond_6
    const/4 v2, 0x0

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 260
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->manufacturer:Ljava/lang/String;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_7

    :cond_7
    const/4 v2, 0x0

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 261
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->architecture:Ljava/lang/String;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_8

    :cond_8
    const/4 v2, 0x0

    :goto_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 262
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->runTime:Ljava/lang/String;

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_9

    :cond_9
    const/4 v2, 0x0

    :goto_9
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 263
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->size:Ljava/lang/String;

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :cond_a
    add-int/2addr v0, v1

    return v0
.end method

.method public setAgentName(Ljava/lang/String;)V
    .locals 0

    .line 113
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->agentName:Ljava/lang/String;

    return-void
.end method

.method public setAgentVersion(Ljava/lang/String;)V
    .locals 0

    .line 117
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->agentVersion:Ljava/lang/String;

    return-void
.end method

.method public setApplicationPlatform(Lcom/newrelic/agent/android/ApplicationPlatform;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->applicationPlatform:Lcom/newrelic/agent/android/ApplicationPlatform;

    return-void
.end method

.method public setApplicationPlatformVersion(Ljava/lang/String;)V
    .locals 0

    .line 142
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->applicationPlatformVersion:Ljava/lang/String;

    return-void
.end method

.method public setArchitecture(Ljava/lang/String;)V
    .locals 0

    .line 125
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->architecture:Ljava/lang/String;

    return-void
.end method

.method public setCountryCode(Ljava/lang/String;)V
    .locals 0

    .line 105
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->countryCode:Ljava/lang/String;

    return-void
.end method

.method public setDeviceId(Ljava/lang/String;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->deviceId:Ljava/lang/String;

    return-void
.end method

.method public setManufacturer(Ljava/lang/String;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->manufacturer:Ljava/lang/String;

    return-void
.end method

.method public setMisc(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 146
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->misc:Ljava/util/Map;

    return-void
.end method

.method public setModel(Ljava/lang/String;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->model:Ljava/lang/String;

    return-void
.end method

.method public setOsBuild(Ljava/lang/String;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->osBuild:Ljava/lang/String;

    return-void
.end method

.method public setOsName(Ljava/lang/String;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->osName:Ljava/lang/String;

    return-void
.end method

.method public setOsVersion(Ljava/lang/String;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->osVersion:Ljava/lang/String;

    return-void
.end method

.method public setRegionCode(Ljava/lang/String;)V
    .locals 0

    .line 109
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->regionCode:Ljava/lang/String;

    return-void
.end method

.method public setRunTime(Ljava/lang/String;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->runTime:Ljava/lang/String;

    return-void
.end method

.method public setSize(Ljava/lang/String;)V
    .locals 1

    .line 133
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->size:Ljava/lang/String;

    const-string v0, "size"

    .line 134
    invoke-virtual {p0, v0, p1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->addMisc(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public toJsonString()Ljava/lang/String;
    .locals 3

    .line 215
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DeviceInformation{manufacturer=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->manufacturer:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", osName=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->osName:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", osVersion=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->osVersion:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", model=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->model:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", agentName=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->agentName:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", agentVersion=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->agentVersion:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", deviceId=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->deviceId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", countryCode=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->countryCode:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", regionCode=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/DeviceInformation;->regionCode:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
