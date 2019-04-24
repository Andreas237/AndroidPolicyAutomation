.class public Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;
.super Lcom/newrelic/agent/android/harvest/type/HarvestableObject;
.source "ApplicationInfo.java"


# instance fields
.field private applicationBuild:Ljava/lang/String;

.field private applicationName:Ljava/lang/String;

.field private applicationVersion:Ljava/lang/String;

.field private bundleId:Ljava/lang/String;

.field private processId:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/type/HarvestableObject;-><init>()V

    const-string v0, ""

    .line 13
    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;->applicationName:Ljava/lang/String;

    const-string v0, ""

    .line 14
    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;->applicationVersion:Ljava/lang/String;

    const-string v0, ""

    .line 15
    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;->applicationBuild:Ljava/lang/String;

    const-string v0, ""

    .line 16
    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;->bundleId:Ljava/lang/String;

    const/4 v0, 0x0

    .line 17
    iput v0, p0, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;->processId:I

    return-void
.end method

.method public constructor <init>(Lcom/newrelic/agent/android/harvest/ApplicationInformation;)V
    .locals 1

    .line 23
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/type/HarvestableObject;-><init>()V

    const-string v0, ""

    .line 13
    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;->applicationName:Ljava/lang/String;

    const-string v0, ""

    .line 14
    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;->applicationVersion:Ljava/lang/String;

    const-string v0, ""

    .line 15
    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;->applicationBuild:Ljava/lang/String;

    const-string v0, ""

    .line 16
    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;->bundleId:Ljava/lang/String;

    const/4 v0, 0x0

    .line 17
    iput v0, p0, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;->processId:I

    .line 24
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->getAppName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;->applicationName:Ljava/lang/String;

    .line 25
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->getAppVersion()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;->applicationVersion:Ljava/lang/String;

    .line 26
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->getAppBuild()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;->applicationBuild:Ljava/lang/String;

    .line 27
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->getPackageId()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;->bundleId:Ljava/lang/String;

    return-void
.end method

.method public static newFromJson(Lcom/newrelic/com/google/gson/JsonObject;)Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;
    .locals 2

    .line 49
    new-instance v0, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;

    invoke-direct {v0}, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;-><init>()V

    const-string v1, "appName"

    .line 51
    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;->applicationName:Ljava/lang/String;

    const-string v1, "appVersion"

    .line 52
    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;->applicationVersion:Ljava/lang/String;

    const-string v1, "appBuild"

    .line 53
    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;->applicationBuild:Ljava/lang/String;

    const-string v1, "bundleId"

    .line 54
    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;->bundleId:Ljava/lang/String;

    const-string v1, "processId"

    .line 55
    invoke-virtual {p0, v1}, Lcom/newrelic/com/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object p0

    invoke-virtual {p0}, Lcom/newrelic/com/google/gson/JsonElement;->getAsInt()I

    move-result p0

    iput p0, v0, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;->processId:I

    return-object v0
.end method


# virtual methods
.method public asJsonObject()Lcom/newrelic/com/google/gson/JsonObject;
    .locals 3

    .line 32
    new-instance v0, Lcom/newrelic/com/google/gson/JsonObject;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/JsonObject;-><init>()V

    const-string v1, "appName"

    .line 39
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;->applicationName:Ljava/lang/String;

    invoke-static {v2}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v1, "appVersion"

    .line 40
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;->applicationVersion:Ljava/lang/String;

    invoke-static {v2}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v1, "appBuild"

    .line 41
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;->applicationBuild:Ljava/lang/String;

    invoke-static {v2}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v1, "bundleId"

    .line 42
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;->bundleId:Ljava/lang/String;

    invoke-static {v2}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v1, "processId"

    .line 43
    iget v2, p0, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;->processId:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/Number;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    return-object v0
.end method

.method public getApplicationBuild()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;->applicationBuild:Ljava/lang/String;

    return-object v0
.end method

.method public getApplicationName()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;->applicationName:Ljava/lang/String;

    return-object v0
.end method

.method public getApplicationVersion()Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/crash/ApplicationInfo;->applicationVersion:Ljava/lang/String;

    return-object v0
.end method
