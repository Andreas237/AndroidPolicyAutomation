.class public Lcom/newrelic/agent/android/harvest/HarvestData;
.super Lcom/newrelic/agent/android/harvest/type/HarvestableArray;
.source "HarvestData.java"


# static fields
.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# instance fields
.field private activityTraces:Lcom/newrelic/agent/android/harvest/ActivityTraces;

.field private agentHealth:Lcom/newrelic/agent/android/harvest/AgentHealth;

.field private analyticsEnabled:Z

.field private analyticsEvents:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lcom/newrelic/agent/android/analytics/AnalyticsEvent;",
            ">;"
        }
    .end annotation
.end field

.field private dataToken:Lcom/newrelic/agent/android/harvest/DataToken;

.field private deviceInformation:Lcom/newrelic/agent/android/harvest/DeviceInformation;

.field private harvestTimeDelta:D

.field private httpErrors:Lcom/newrelic/agent/android/harvest/HttpErrors;

.field private httpTransactions:Lcom/newrelic/agent/android/harvest/HttpTransactions;

.field private machineMeasurements:Lcom/newrelic/agent/android/harvest/MachineMeasurements;

.field private sessionAttributes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/newrelic/agent/android/analytics/AnalyticAttribute;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 33
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/harvest/HarvestData;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 47
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/type/HarvestableArray;-><init>()V

    .line 48
    new-instance v0, Lcom/newrelic/agent/android/harvest/DataToken;

    invoke-direct {v0}, Lcom/newrelic/agent/android/harvest/DataToken;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->dataToken:Lcom/newrelic/agent/android/harvest/DataToken;

    .line 49
    new-instance v0, Lcom/newrelic/agent/android/harvest/HttpTransactions;

    invoke-direct {v0}, Lcom/newrelic/agent/android/harvest/HttpTransactions;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->httpTransactions:Lcom/newrelic/agent/android/harvest/HttpTransactions;

    .line 50
    new-instance v0, Lcom/newrelic/agent/android/harvest/HttpErrors;

    invoke-direct {v0}, Lcom/newrelic/agent/android/harvest/HttpErrors;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->httpErrors:Lcom/newrelic/agent/android/harvest/HttpErrors;

    .line 51
    new-instance v0, Lcom/newrelic/agent/android/harvest/ActivityTraces;

    invoke-direct {v0}, Lcom/newrelic/agent/android/harvest/ActivityTraces;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->activityTraces:Lcom/newrelic/agent/android/harvest/ActivityTraces;

    .line 52
    new-instance v0, Lcom/newrelic/agent/android/harvest/MachineMeasurements;

    invoke-direct {v0}, Lcom/newrelic/agent/android/harvest/MachineMeasurements;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->machineMeasurements:Lcom/newrelic/agent/android/harvest/MachineMeasurements;

    .line 53
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getDeviceInformation()Lcom/newrelic/agent/android/harvest/DeviceInformation;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->deviceInformation:Lcom/newrelic/agent/android/harvest/DeviceInformation;

    .line 54
    new-instance v0, Lcom/newrelic/agent/android/harvest/AgentHealth;

    invoke-direct {v0}, Lcom/newrelic/agent/android/harvest/AgentHealth;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->agentHealth:Lcom/newrelic/agent/android/harvest/AgentHealth;

    .line 55
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->sessionAttributes:Ljava/util/Set;

    .line 56
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->analyticsEvents:Ljava/util/Collection;

    const/4 v0, 0x0

    .line 57
    iput-boolean v0, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->analyticsEnabled:Z

    return-void
.end method


# virtual methods
.method public asJsonArray()Lcom/newrelic/com/google/gson/JsonArray;
    .locals 7

    .line 66
    new-instance v0, Lcom/newrelic/com/google/gson/JsonArray;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/JsonArray;-><init>()V

    .line 67
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->dataToken:Lcom/newrelic/agent/android/harvest/DataToken;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/harvest/DataToken;->asJson()Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 68
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->deviceInformation:Lcom/newrelic/agent/android/harvest/DeviceInformation;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->asJson()Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 69
    new-instance v1, Lcom/newrelic/com/google/gson/JsonPrimitive;

    iget-wide v2, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->harvestTimeDelta:D

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 70
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->httpTransactions:Lcom/newrelic/agent/android/harvest/HttpTransactions;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/harvest/HttpTransactions;->asJson()Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 71
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->machineMeasurements:Lcom/newrelic/agent/android/harvest/MachineMeasurements;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/harvest/MachineMeasurements;->asJson()Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 72
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->httpErrors:Lcom/newrelic/agent/android/harvest/HttpErrors;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/harvest/HttpErrors;->asJson()Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 74
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->activityTraces:Lcom/newrelic/agent/android/harvest/ActivityTraces;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/harvest/ActivityTraces;->asJson()Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v1

    .line 77
    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonElement;->toString()Ljava/lang/String;

    move-result-object v2

    .line 78
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {}, Lcom/newrelic/agent/android/harvest/Harvest;->getHarvestConfiguration()Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    move-result-object v4

    invoke-virtual {v4}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getActivity_trace_max_size()I

    move-result v4

    if-ge v3, v4, :cond_0

    .line 79
    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    goto :goto_0

    .line 81
    :cond_0
    invoke-static {}, Lcom/newrelic/agent/android/stats/StatsEngine;->get()Lcom/newrelic/agent/android/stats/StatsEngine;

    move-result-object v1

    const-string v3, "Supportability/AgentHealth/BigActivityTracesDropped"

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v1, v3, v2}, Lcom/newrelic/agent/android/stats/StatsEngine;->sample(Ljava/lang/String;F)V

    .line 84
    :goto_0
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->agentHealth:Lcom/newrelic/agent/android/harvest/AgentHealth;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/harvest/AgentHealth;->asJson()Lcom/newrelic/com/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 86
    iget-boolean v1, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->analyticsEnabled:Z

    if-eqz v1, :cond_3

    .line 87
    new-instance v1, Lcom/newrelic/com/google/gson/JsonObject;

    invoke-direct {v1}, Lcom/newrelic/com/google/gson/JsonObject;-><init>()V

    .line 88
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->sessionAttributes:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    .line 89
    sget-object v4, Lcom/newrelic/agent/android/harvest/HarvestData$1;->$SwitchMap$com$newrelic$agent$android$analytics$AnalyticAttribute$AttributeDataType:[I

    invoke-virtual {v3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getAttributeDataType()Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    move-result-object v5

    invoke-virtual {v5}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;->ordinal()I

    move-result v5

    aget v4, v4, v5

    packed-switch v4, :pswitch_data_0

    goto :goto_1

    .line 97
    :pswitch_0
    invoke-virtual {v3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getBooleanValue()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v4, v3}, Lcom/newrelic/com/google/gson/JsonObject;->addProperty(Ljava/lang/String;Ljava/lang/Boolean;)V

    goto :goto_1

    .line 94
    :pswitch_1
    invoke-virtual {v3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getDoubleValue()D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v1, v4, v3}, Lcom/newrelic/com/google/gson/JsonObject;->addProperty(Ljava/lang/String;Ljava/lang/Number;)V

    goto :goto_1

    .line 91
    :pswitch_2
    invoke-virtual {v3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getStringValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v4, v3}, Lcom/newrelic/com/google/gson/JsonObject;->addProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 101
    :cond_1
    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 103
    new-instance v1, Lcom/newrelic/com/google/gson/JsonArray;

    invoke-direct {v1}, Lcom/newrelic/com/google/gson/JsonArray;-><init>()V

    .line 104
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->analyticsEvents:Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;

    .line 105
    invoke-virtual {v3}, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;->asJsonObject()Lcom/newrelic/com/google/gson/JsonObject;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    goto :goto_2

    .line 107
    :cond_2
    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    :cond_3
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getActivityTraces()Lcom/newrelic/agent/android/harvest/ActivityTraces;
    .locals 1

    .line 195
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->activityTraces:Lcom/newrelic/agent/android/harvest/ActivityTraces;

    return-object v0
.end method

.method public getAgentHealth()Lcom/newrelic/agent/android/harvest/AgentHealth;
    .locals 1

    .line 199
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->agentHealth:Lcom/newrelic/agent/android/harvest/AgentHealth;

    return-object v0
.end method

.method public getAnalyticsEvents()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/newrelic/agent/android/analytics/AnalyticsEvent;",
            ">;"
        }
    .end annotation

    .line 171
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->analyticsEvents:Ljava/util/Collection;

    return-object v0
.end method

.method public getDataToken()Lcom/newrelic/agent/android/harvest/DataToken;
    .locals 1

    .line 203
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->dataToken:Lcom/newrelic/agent/android/harvest/DataToken;

    return-object v0
.end method

.method public getDeviceInformation()Lcom/newrelic/agent/android/harvest/DeviceInformation;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->deviceInformation:Lcom/newrelic/agent/android/harvest/DeviceInformation;

    return-object v0
.end method

.method public getHttpErrors()Lcom/newrelic/agent/android/harvest/HttpErrors;
    .locals 1

    .line 183
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->httpErrors:Lcom/newrelic/agent/android/harvest/HttpErrors;

    return-object v0
.end method

.method public getHttpTransactions()Lcom/newrelic/agent/android/harvest/HttpTransactions;
    .locals 1

    .line 187
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->httpTransactions:Lcom/newrelic/agent/android/harvest/HttpTransactions;

    return-object v0
.end method

.method public getMetrics()Lcom/newrelic/agent/android/harvest/MachineMeasurements;
    .locals 1

    .line 191
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->machineMeasurements:Lcom/newrelic/agent/android/harvest/MachineMeasurements;

    return-object v0
.end method

.method public getSessionAttributes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/newrelic/agent/android/analytics/AnalyticAttribute;",
            ">;"
        }
    .end annotation

    .line 162
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->sessionAttributes:Ljava/util/Set;

    return-object v0
.end method

.method public isAnalyticsEnabled()Z
    .locals 1

    .line 207
    iget-boolean v0, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->analyticsEnabled:Z

    return v0
.end method

.method public isValid()Z
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->dataToken:Lcom/newrelic/agent/android/harvest/DataToken;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/DataToken;->isValid()Z

    move-result v0

    return v0
.end method

.method public reset()V
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->httpErrors:Lcom/newrelic/agent/android/harvest/HttpErrors;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HttpErrors;->clear()V

    .line 123
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->httpTransactions:Lcom/newrelic/agent/android/harvest/HttpTransactions;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HttpTransactions;->clear()V

    .line 124
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->activityTraces:Lcom/newrelic/agent/android/harvest/ActivityTraces;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/ActivityTraces;->clear()V

    .line 125
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->machineMeasurements:Lcom/newrelic/agent/android/harvest/MachineMeasurements;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/MachineMeasurements;->clear()V

    .line 126
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->agentHealth:Lcom/newrelic/agent/android/harvest/AgentHealth;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/AgentHealth;->clear()V

    .line 127
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->sessionAttributes:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 128
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->analyticsEvents:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    return-void
.end method

.method public setActivityTraces(Lcom/newrelic/agent/android/harvest/ActivityTraces;)V
    .locals 0

    .line 154
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->activityTraces:Lcom/newrelic/agent/android/harvest/ActivityTraces;

    return-void
.end method

.method public setAnalyticsEnabled(Z)V
    .locals 0

    .line 211
    iput-boolean p1, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->analyticsEnabled:Z

    return-void
.end method

.method public setAnalyticsEvents(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/newrelic/agent/android/analytics/AnalyticsEvent;",
            ">;)V"
        }
    .end annotation

    .line 175
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->analyticsEvents:Ljava/util/Collection;

    return-void
.end method

.method public setDataToken(Lcom/newrelic/agent/android/harvest/DataToken;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    .line 134
    :cond_0
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->dataToken:Lcom/newrelic/agent/android/harvest/DataToken;

    return-void
.end method

.method public setDeviceInformation(Lcom/newrelic/agent/android/harvest/DeviceInformation;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->deviceInformation:Lcom/newrelic/agent/android/harvest/DeviceInformation;

    return-void
.end method

.method public setHarvestTimeDelta(D)V
    .locals 0

    .line 142
    iput-wide p1, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->harvestTimeDelta:D

    return-void
.end method

.method public setHttpErrors(Lcom/newrelic/agent/android/harvest/HttpErrors;)V
    .locals 0

    .line 158
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->httpErrors:Lcom/newrelic/agent/android/harvest/HttpErrors;

    return-void
.end method

.method public setHttpTransactions(Lcom/newrelic/agent/android/harvest/HttpTransactions;)V
    .locals 0

    .line 146
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->httpTransactions:Lcom/newrelic/agent/android/harvest/HttpTransactions;

    return-void
.end method

.method public setMachineMeasurements(Lcom/newrelic/agent/android/harvest/MachineMeasurements;)V
    .locals 0

    .line 150
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->machineMeasurements:Lcom/newrelic/agent/android/harvest/MachineMeasurements;

    return-void
.end method

.method public setSessionAttributes(Ljava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/newrelic/agent/android/analytics/AnalyticAttribute;",
            ">;)V"
        }
    .end annotation

    .line 166
    sget-object v0, Lcom/newrelic/agent/android/harvest/HarvestData;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "HarvestData.setSessionAttributes invoked with attribute set "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 167
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->sessionAttributes:Ljava/util/Set;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 216
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HarvestData{\n\tdataToken="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->dataToken:Lcom/newrelic/agent/android/harvest/DataToken;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", \n\tdeviceInformation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->deviceInformation:Lcom/newrelic/agent/android/harvest/DeviceInformation;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", \n\tharvestTimeDelta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->harvestTimeDelta:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", \n\thttpTransactions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->httpTransactions:Lcom/newrelic/agent/android/harvest/HttpTransactions;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", \n\tmachineMeasurements="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->machineMeasurements:Lcom/newrelic/agent/android/harvest/MachineMeasurements;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", \n\thttpErrors="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->httpErrors:Lcom/newrelic/agent/android/harvest/HttpErrors;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", \n\tactivityTraces="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->activityTraces:Lcom/newrelic/agent/android/harvest/ActivityTraces;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", \n\tsessionAttributes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->sessionAttributes:Ljava/util/Set;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", \n\tanalyticAttributes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestData;->analyticsEvents:Ljava/util/Collection;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
