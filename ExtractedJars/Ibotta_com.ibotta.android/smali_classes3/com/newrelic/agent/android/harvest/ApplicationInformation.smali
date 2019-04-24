.class public Lcom/newrelic/agent/android/harvest/ApplicationInformation;
.super Lcom/newrelic/agent/android/harvest/type/HarvestableArray;
.source "ApplicationInformation.java"


# instance fields
.field private appBuild:Ljava/lang/String;

.field private appName:Ljava/lang/String;

.field private appVersion:Ljava/lang/String;

.field private packageId:Ljava/lang/String;

.field private versionCode:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/type/HarvestableArray;-><init>()V

    const/4 v0, -0x1

    .line 17
    iput v0, p0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->versionCode:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/ApplicationInformation;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->appName:Ljava/lang/String;

    .line 26
    iput-object p2, p0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->appVersion:Ljava/lang/String;

    .line 27
    iput-object p3, p0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->packageId:Ljava/lang/String;

    .line 28
    iput-object p4, p0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->appBuild:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public asJsonArray()Lcom/newrelic/com/google/gson/JsonArray;
    .locals 3

    .line 33
    new-instance v0, Lcom/newrelic/com/google/gson/JsonArray;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/JsonArray;-><init>()V

    .line 40
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->appName:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->notEmpty(Ljava/lang/String;)V

    .line 41
    new-instance v1, Lcom/newrelic/com/google/gson/JsonPrimitive;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->appName:Ljava/lang/String;

    invoke-direct {v1, v2}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 42
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->appVersion:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->notEmpty(Ljava/lang/String;)V

    .line 43
    new-instance v1, Lcom/newrelic/com/google/gson/JsonPrimitive;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->appVersion:Ljava/lang/String;

    invoke-direct {v1, v2}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 44
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->packageId:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->notEmpty(Ljava/lang/String;)V

    .line 45
    new-instance v1, Lcom/newrelic/com/google/gson/JsonPrimitive;

    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->packageId:Ljava/lang/String;

    invoke-direct {v1, v2}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

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

    if-eqz p1, :cond_b

    .line 93
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_4

    .line 95
    :cond_1
    check-cast p1, Lcom/newrelic/agent/android/harvest/ApplicationInformation;

    .line 97
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->appName:Ljava/lang/String;

    if-eqz v2, :cond_2

    iget-object v3, p1, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->appName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_2
    iget-object v2, p1, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->appName:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_0
    return v1

    .line 98
    :cond_3
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->appVersion:Ljava/lang/String;

    if-eqz v2, :cond_4

    iget-object v3, p1, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->appVersion:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_1

    :cond_4
    iget-object v2, p1, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->appVersion:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_1
    return v1

    .line 99
    :cond_5
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->appBuild:Ljava/lang/String;

    if-eqz v2, :cond_6

    iget-object v3, p1, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->appBuild:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_2

    :cond_6
    iget-object v2, p1, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->appBuild:Ljava/lang/String;

    if-eqz v2, :cond_7

    :goto_2
    return v1

    .line 100
    :cond_7
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->packageId:Ljava/lang/String;

    if-eqz v2, :cond_8

    iget-object v3, p1, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->packageId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_3

    :cond_8
    iget-object v2, p1, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->packageId:Ljava/lang/String;

    if-eqz v2, :cond_9

    :goto_3
    return v1

    .line 101
    :cond_9
    iget v2, p0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->versionCode:I

    iget p1, p1, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->versionCode:I

    if-eq v2, p1, :cond_a

    return v1

    :cond_a
    return v0

    :cond_b
    :goto_4
    return v1
.end method

.method public getAppBuild()Ljava/lang/String;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->appBuild:Ljava/lang/String;

    return-object v0
.end method

.method public getAppName()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->appName:Ljava/lang/String;

    return-object v0
.end method

.method public getAppVersion()Ljava/lang/String;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->appVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getPackageId()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->packageId:Ljava/lang/String;

    return-object v0
.end method

.method public getVersionCode()I
    .locals 1

    .line 87
    iget v0, p0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->versionCode:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 108
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->appName:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 109
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->appVersion:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 110
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->appBuild:Ljava/lang/String;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 111
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->packageId:Ljava/lang/String;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :cond_3
    add-int/2addr v0, v1

    return v0
.end method

.method public isAppUpgrade(Lcom/newrelic/agent/android/harvest/ApplicationInformation;)Z
    .locals 4

    .line 122
    iget v0, p1, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->versionCode:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_1

    .line 123
    iget v0, p0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->versionCode:I

    if-ltz v0, :cond_0

    iget-object p1, p1, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->appVersion:Ljava/lang/String;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    .line 125
    :cond_1
    iget p1, p0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->versionCode:I

    if-le p1, v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public setAppBuild(Ljava/lang/String;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->appBuild:Ljava/lang/String;

    return-void
.end method

.method public setAppName(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->appName:Ljava/lang/String;

    return-void
.end method

.method public setAppVersion(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->appVersion:Ljava/lang/String;

    return-void
.end method

.method public setPackageId(Ljava/lang/String;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->packageId:Ljava/lang/String;

    return-void
.end method

.method public setVersionCode(I)V
    .locals 0

    .line 83
    iput p1, p0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->versionCode:I

    return-void
.end method
