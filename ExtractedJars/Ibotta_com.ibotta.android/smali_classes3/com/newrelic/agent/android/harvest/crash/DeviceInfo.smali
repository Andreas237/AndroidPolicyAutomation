.class public Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;
.super Lcom/newrelic/agent/android/harvest/type/HarvestableObject;
.source "DeviceInfo.java"


# instance fields
.field private OSBuild:Ljava/lang/String;

.field private OSVersion:Ljava/lang/String;

.field private architecture:Ljava/lang/String;

.field private deviceName:Ljava/lang/String;

.field private deviceUuid:Ljava/lang/String;

.field private diskAvailable:[J

.field private memoryUsage:J

.field private modelNumber:Ljava/lang/String;

.field private networkStatus:Ljava/lang/String;

.field private orientation:I

.field private runTime:Ljava/lang/String;

.field private screenResolution:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/type/HarvestableObject;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/newrelic/agent/android/harvest/DeviceInformation;Lcom/newrelic/agent/android/harvest/EnvironmentInformation;)V
    .locals 2

    .line 32
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/type/HarvestableObject;-><init>()V

    .line 34
    invoke-virtual {p2}, Lcom/newrelic/agent/android/harvest/EnvironmentInformation;->getMemoryUsage()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->memoryUsage:J

    .line 35
    invoke-virtual {p2}, Lcom/newrelic/agent/android/harvest/EnvironmentInformation;->getOrientation()I

    move-result v0

    iput v0, p0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->orientation:I

    .line 36
    invoke-virtual {p2}, Lcom/newrelic/agent/android/harvest/EnvironmentInformation;->getNetworkStatus()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->networkStatus:Ljava/lang/String;

    .line 37
    invoke-virtual {p2}, Lcom/newrelic/agent/android/harvest/EnvironmentInformation;->getDiskAvailable()[J

    move-result-object p2

    iput-object p2, p0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->diskAvailable:[J

    .line 38
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getOsVersion()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->OSVersion:Ljava/lang/String;

    .line 39
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getManufacturer()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->deviceName:Ljava/lang/String;

    .line 40
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getOsBuild()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->OSBuild:Ljava/lang/String;

    .line 41
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getArchitecture()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->architecture:Ljava/lang/String;

    .line 42
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getModel()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->modelNumber:Ljava/lang/String;

    .line 43
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getSize()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->screenResolution:Ljava/lang/String;

    .line 44
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getDeviceId()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->deviceUuid:Ljava/lang/String;

    .line 45
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getRunTime()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->runTime:Ljava/lang/String;

    return-void
.end method

.method private getDiskAvailableAsJson()Lcom/newrelic/com/google/gson/JsonArray;
    .locals 6

    .line 100
    new-instance v0, Lcom/newrelic/com/google/gson/JsonArray;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/JsonArray;-><init>()V

    .line 102
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->diskAvailable:[J

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-wide v4, v1, v3

    .line 103
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v4}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/Number;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private static longArrayFromJsonArray(Lcom/newrelic/com/google/gson/JsonArray;)[J
    .locals 6

    .line 89
    invoke-virtual {p0}, Lcom/newrelic/com/google/gson/JsonArray;->size()I

    move-result v0

    new-array v0, v0, [J

    .line 92
    invoke-virtual {p0}, Lcom/newrelic/com/google/gson/JsonArray;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/newrelic/com/google/gson/JsonElement;

    add-int/lit8 v3, v1, 0x1

    .line 93
    invoke-virtual {v2}, Lcom/newrelic/com/google/gson/JsonElement;->getAsLong()J

    move-result-wide v4

    aput-wide v4, v0, v1

    move v1, v3

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static newFromJson(Lcom/newrelic/com/google/gson/JsonObject;)Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;
    .locals 3

    .line 69
    new-instance v0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;

    invoke-direct {v0}, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;-><init>()V

    const-string v1, "memoryUsage"

    .line 71
    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonElement;->getAsLong()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->memoryUsage:J

    const-string v1, "orientation"

    .line 72
    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonElement;->getAsInt()I

    move-result v1

    iput v1, v0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->orientation:I

    const-string v1, "networkStatus"

    .line 73
    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->networkStatus:Ljava/lang/String;

    const-string v1, "diskAvailable"

    .line 74
    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonElement;->getAsJsonArray()Lcom/newrelic/com/google/gson/JsonArray;

    move-result-object v1

    invoke-static {v1}, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->longArrayFromJsonArray(Lcom/newrelic/com/google/gson/JsonArray;)[J

    move-result-object v1

    iput-object v1, v0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->diskAvailable:[J

    const-string v1, "osVersion"

    .line 75
    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->OSVersion:Ljava/lang/String;

    const-string v1, "deviceName"

    .line 76
    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->deviceName:Ljava/lang/String;

    const-string v1, "osBuild"

    .line 77
    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->OSBuild:Ljava/lang/String;

    const-string v1, "architecture"

    .line 78
    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->architecture:Ljava/lang/String;

    const-string v1, "runTime"

    .line 79
    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->runTime:Ljava/lang/String;

    const-string v1, "modelNumber"

    .line 80
    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->modelNumber:Ljava/lang/String;

    const-string v1, "screenResolution"

    .line 81
    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->screenResolution:Ljava/lang/String;

    const-string v1, "deviceUuid"

    .line 82
    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object p0

    invoke-virtual {p0}, Lcom/newrelic/com/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->deviceUuid:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public asJsonObject()Lcom/newrelic/com/google/gson/JsonObject;
    .locals 4

    .line 50
    new-instance v0, Lcom/newrelic/com/google/gson/JsonObject;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/JsonObject;-><init>()V

    const-string v1, "memoryUsage"

    .line 52
    iget-wide v2, p0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->memoryUsage:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v2}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/Number;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v1, "orientation"

    .line 53
    iget v2, p0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->orientation:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/Number;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v1, "networkStatus"

    .line 54
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->networkStatus:Ljava/lang/String;

    invoke-static {v2}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v1, "diskAvailable"

    .line 55
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->getDiskAvailableAsJson()Lcom/newrelic/com/google/gson/JsonArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v1, "osVersion"

    .line 56
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->OSVersion:Ljava/lang/String;

    invoke-static {v2}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v1, "deviceName"

    .line 57
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->deviceName:Ljava/lang/String;

    invoke-static {v2}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v1, "osBuild"

    .line 58
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->OSBuild:Ljava/lang/String;

    invoke-static {v2}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v1, "architecture"

    .line 59
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->architecture:Ljava/lang/String;

    invoke-static {v2}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v1, "runTime"

    .line 60
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->runTime:Ljava/lang/String;

    invoke-static {v2}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v1, "modelNumber"

    .line 61
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->modelNumber:Ljava/lang/String;

    invoke-static {v2}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v1, "screenResolution"

    .line 62
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->screenResolution:Ljava/lang/String;

    invoke-static {v2}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v1, "deviceUuid"

    .line 63
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/crash/DeviceInfo;->deviceUuid:Ljava/lang/String;

    invoke-static {v2}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    return-object v0
.end method
