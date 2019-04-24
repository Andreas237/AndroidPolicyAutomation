.class public Lcom/newrelic/agent/android/SavedState;
.super Lcom/newrelic/agent/android/harvest/HarvestAdapter;
.source "SavedState.java"


# static fields
.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# instance fields
.field private final NEW_RELIC_AGENT_DISABLED_VERSION_KEY:Ljava/lang/String;

.field private final PREFERENCE_FILE_PREFIX:Ljava/lang/String;

.field private final PREF_ACCOUNT_ID:Ljava/lang/String;

.field private final PREF_ACTIVITY_TRACE_MIN_UTILIZATION:Ljava/lang/String;

.field private final PREF_AGENT_NAME:Ljava/lang/String;

.field private final PREF_AGENT_VERSION:Ljava/lang/String;

.field private final PREF_APPLICATION_ID:Ljava/lang/String;

.field private final PREF_APP_BUILD:Ljava/lang/String;

.field private final PREF_APP_NAME:Ljava/lang/String;

.field private final PREF_APP_TOKEN:Ljava/lang/String;

.field private final PREF_APP_VERSION:Ljava/lang/String;

.field private final PREF_COLLECT_NETWORK_ERRORS:Ljava/lang/String;

.field private final PREF_CROSS_PROCESS_ID:Ljava/lang/String;

.field private final PREF_DATA_TOKEN:Ljava/lang/String;

.field private final PREF_DEVICE_ARCHITECTURE:Ljava/lang/String;

.field private final PREF_DEVICE_ID:Ljava/lang/String;

.field private final PREF_DEVICE_MANUFACTURER:Ljava/lang/String;

.field private final PREF_DEVICE_MODEL:Ljava/lang/String;

.field private final PREF_DEVICE_RUN_TIME:Ljava/lang/String;

.field private final PREF_DEVICE_SIZE:Ljava/lang/String;

.field private final PREF_ERROR_LIMIT:Ljava/lang/String;

.field private final PREF_HARVEST_INTERVAL:Ljava/lang/String;

.field private final PREF_MAX_TRANSACTION_AGE:Ljava/lang/String;

.field private final PREF_MAX_TRANSACTION_COUNT:Ljava/lang/String;

.field private final PREF_OS_BUILD:Ljava/lang/String;

.field private final PREF_OS_NAME:Ljava/lang/String;

.field private final PREF_OS_VERSION:Ljava/lang/String;

.field private final PREF_PACKAGE_ID:Ljava/lang/String;

.field private final PREF_PLATFORM:Ljava/lang/String;

.field private final PREF_PLATFORM_VERSION:Ljava/lang/String;

.field private final PREF_PRIORITY_ENCODING_KEY:Ljava/lang/String;

.field private final PREF_RESPONSE_BODY_LIMIT:Ljava/lang/String;

.field private final PREF_SERVER_TIMESTAMP:Ljava/lang/String;

.field private final PREF_STACK_TRACE_LIMIT:Ljava/lang/String;

.field private final PREF_VERSION_CODE:Ljava/lang/String;

.field private activityTraceMinUtilization:Ljava/lang/Float;

.field private final configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

.field private final connectInformation:Lcom/newrelic/agent/android/harvest/ConnectInformation;

.field private final editor:Landroid/content/SharedPreferences$Editor;

.field private final lock:Ljava/util/concurrent/locks/Lock;

.field private final prefs:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/SavedState;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CommitPrefEdits"
        }
    .end annotation

    .line 70
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/HarvestAdapter;-><init>()V

    const-string v0, "com.newrelic.android.agent.v1_"

    .line 20
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREFERENCE_FILE_PREFIX:Ljava/lang/String;

    const-string v0, "maxTransactionCount"

    .line 23
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_MAX_TRANSACTION_COUNT:Ljava/lang/String;

    const-string v0, "maxTransactionAgeInSeconds"

    .line 24
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_MAX_TRANSACTION_AGE:Ljava/lang/String;

    const-string v0, "harvestIntervalInSeconds"

    .line 25
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_HARVEST_INTERVAL:Ljava/lang/String;

    const-string v0, "serverTimestamp"

    .line 26
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_SERVER_TIMESTAMP:Ljava/lang/String;

    const-string v0, "crossProcessId"

    .line 27
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_CROSS_PROCESS_ID:Ljava/lang/String;

    const-string v0, "encoding_key"

    .line 28
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_PRIORITY_ENCODING_KEY:Ljava/lang/String;

    const-string v0, "account_id"

    .line 29
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_ACCOUNT_ID:Ljava/lang/String;

    const-string v0, "application_id"

    .line 30
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_APPLICATION_ID:Ljava/lang/String;

    const-string v0, "dataToken"

    .line 31
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_DATA_TOKEN:Ljava/lang/String;

    const-string v0, "appToken"

    .line 32
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_APP_TOKEN:Ljava/lang/String;

    const-string v0, "stackTraceLimit"

    .line 33
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_STACK_TRACE_LIMIT:Ljava/lang/String;

    const-string v0, "responseBodyLimit"

    .line 34
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_RESPONSE_BODY_LIMIT:Ljava/lang/String;

    const-string v0, "collectNetworkErrors"

    .line 35
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_COLLECT_NETWORK_ERRORS:Ljava/lang/String;

    const-string v0, "errorLimit"

    .line 36
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_ERROR_LIMIT:Ljava/lang/String;

    const-string v0, "NewRelicAgentDisabledVersion"

    .line 37
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->NEW_RELIC_AGENT_DISABLED_VERSION_KEY:Ljava/lang/String;

    const-string v0, "activityTraceMinUtilization"

    .line 38
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_ACTIVITY_TRACE_MIN_UTILIZATION:Ljava/lang/String;

    .line 41
    new-instance v0, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    invoke-direct {v0}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    const-string v0, "appName"

    .line 44
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_APP_NAME:Ljava/lang/String;

    const-string v0, "appVersion"

    .line 45
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_APP_VERSION:Ljava/lang/String;

    const-string v0, "appBuild"

    .line 46
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_APP_BUILD:Ljava/lang/String;

    const-string v0, "packageId"

    .line 47
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_PACKAGE_ID:Ljava/lang/String;

    const-string v0, "versionCode"

    .line 48
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_VERSION_CODE:Ljava/lang/String;

    const-string v0, "agentName"

    .line 49
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_AGENT_NAME:Ljava/lang/String;

    const-string v0, "agentVersion"

    .line 50
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_AGENT_VERSION:Ljava/lang/String;

    const-string v0, "deviceArchitecture"

    .line 51
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_DEVICE_ARCHITECTURE:Ljava/lang/String;

    const-string v0, "deviceId"

    .line 52
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_DEVICE_ID:Ljava/lang/String;

    const-string v0, "deviceModel"

    .line 53
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_DEVICE_MODEL:Ljava/lang/String;

    const-string v0, "deviceManufacturer"

    .line 54
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_DEVICE_MANUFACTURER:Ljava/lang/String;

    const-string v0, "deviceRunTime"

    .line 55
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_DEVICE_RUN_TIME:Ljava/lang/String;

    const-string v0, "deviceSize"

    .line 56
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_DEVICE_SIZE:Ljava/lang/String;

    const-string v0, "osName"

    .line 57
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_OS_NAME:Ljava/lang/String;

    const-string v0, "osBuild"

    .line 58
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_OS_BUILD:Ljava/lang/String;

    const-string v0, "osVersion"

    .line 59
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_OS_VERSION:Ljava/lang/String;

    const-string v0, "platform"

    .line 60
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_PLATFORM:Ljava/lang/String;

    const-string v0, "platformVersion"

    .line 61
    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->PREF_PLATFORM_VERSION:Ljava/lang/String;

    .line 63
    new-instance v0, Lcom/newrelic/agent/android/harvest/ConnectInformation;

    new-instance v1, Lcom/newrelic/agent/android/harvest/ApplicationInformation;

    invoke-direct {v1}, Lcom/newrelic/agent/android/harvest/ApplicationInformation;-><init>()V

    new-instance v2, Lcom/newrelic/agent/android/harvest/DeviceInformation;

    invoke-direct {v2}, Lcom/newrelic/agent/android/harvest/DeviceInformation;-><init>()V

    invoke-direct {v0, v1, v2}, Lcom/newrelic/agent/android/harvest/ConnectInformation;-><init>(Lcom/newrelic/agent/android/harvest/ApplicationInformation;Lcom/newrelic/agent/android/harvest/DeviceInformation;)V

    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->connectInformation:Lcom/newrelic/agent/android/harvest/ConnectInformation;

    .line 67
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->lock:Ljava/util/concurrent/locks/Lock;

    .line 71
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getPreferenceFileName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lcom/newrelic/agent/android/SavedState;->prefs:Landroid/content/SharedPreferences;

    .line 72
    iget-object p1, p0, Lcom/newrelic/agent/android/SavedState;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    iput-object p1, p0, Lcom/newrelic/agent/android/SavedState;->editor:Landroid/content/SharedPreferences$Editor;

    .line 73
    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->loadHarvestConfiguration()V

    .line 74
    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->loadConnectInformation()V

    return-void
.end method

.method private getPreferenceFileName(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 541
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "com.newrelic.android.agent.v1_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private has(Ljava/lang/String;)Z
    .locals 1

    .line 248
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method private saveApplicationInformation(Lcom/newrelic/agent/android/harvest/ApplicationInformation;)V
    .locals 2

    const-string v0, "appName"

    .line 171
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->getAppName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "appVersion"

    .line 172
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->getAppVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "appBuild"

    .line 173
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->getAppBuild()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "packageId"

    .line 174
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->getPackageId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "versionCode"

    .line 175
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->getVersionCode()I

    move-result p1

    invoke-virtual {p0, v0, p1}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;I)V

    return-void
.end method

.method private saveDeviceInformation(Lcom/newrelic/agent/android/harvest/DeviceInformation;)V
    .locals 2

    const-string v0, "agentName"

    .line 179
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getAgentName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "agentVersion"

    .line 180
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getAgentVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "deviceArchitecture"

    .line 181
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getArchitecture()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "deviceId"

    .line 182
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getDeviceId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "deviceModel"

    .line 183
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getModel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "deviceManufacturer"

    .line 184
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getManufacturer()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "deviceRunTime"

    .line 185
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getRunTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "deviceSize"

    .line 186
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getSize()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "osName"

    .line 187
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getOsName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "osBuild"

    .line 188
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getOsBuild()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "osVersion"

    .line 189
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getOsVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "platform"

    .line 190
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getApplicationPlatform()Lcom/newrelic/agent/android/ApplicationPlatform;

    move-result-object v1

    invoke-virtual {v1}, Lcom/newrelic/agent/android/ApplicationPlatform;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "platformVersion"

    .line 191
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getApplicationPlatformVersion()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 2

    .line 545
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 547
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 548
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 549
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setDefaultValues()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 551
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/newrelic/agent/android/SavedState;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public getAccountId()Ljava/lang/String;
    .locals 1

    const-string v0, "account_id"

    .line 395
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getActivityTraceMinUtilization()F
    .locals 1

    .line 440
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->activityTraceMinUtilization:Ljava/lang/Float;

    if-nez v0, :cond_0

    const-string v0, "activityTraceMinUtilization"

    .line 441
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getFloat(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->activityTraceMinUtilization:Ljava/lang/Float;

    .line 442
    :cond_0
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->activityTraceMinUtilization:Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0
.end method

.method public getAgentName()Ljava/lang/String;
    .locals 1

    const-string v0, "agentName"

    .line 476
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAgentVersion()Ljava/lang/String;
    .locals 1

    const-string v0, "agentVersion"

    .line 480
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAppBuild()Ljava/lang/String;
    .locals 1

    const-string v0, "appBuild"

    .line 468
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAppName()Ljava/lang/String;
    .locals 1

    const-string v0, "appName"

    .line 456
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAppToken()Ljava/lang/String;
    .locals 1

    const-string v0, "appToken"

    .line 163
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAppVersion()Ljava/lang/String;
    .locals 1

    const-string v0, "appVersion"

    .line 460
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getApplicationId()Ljava/lang/String;
    .locals 1

    const-string v0, "application_id"

    .line 399
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getApplicationPlatform()Ljava/lang/String;
    .locals 1

    const-string v0, "platform"

    .line 520
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getApplicationPlatformVersion()Ljava/lang/String;
    .locals 1

    const-string v0, "platformVersion"

    .line 524
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getBoolean(Ljava/lang/String;)Z
    .locals 2

    .line 331
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->prefs:Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public getConnectInformation()Lcom/newrelic/agent/android/harvest/ConnectInformation;
    .locals 1

    .line 244
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->connectInformation:Lcom/newrelic/agent/android/harvest/ConnectInformation;

    return-object v0
.end method

.method public getCrossProcessId()Ljava/lang/String;
    .locals 1

    const-string v0, "crossProcessId"

    .line 387
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDataToken()[I
    .locals 4

    const/4 v0, 0x2

    .line 361
    new-array v0, v0, [I

    const-string v1, "dataToken"

    .line 362
    invoke-virtual {p0, v1}, Lcom/newrelic/agent/android/SavedState;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    .line 368
    :cond_0
    :try_start_0
    new-instance v3, Lorg/json/JSONTokener;

    invoke-direct {v3, v1}, Lorg/json/JSONTokener;-><init>(Ljava/lang/String;)V

    .line 372
    invoke-virtual {v3}, Lorg/json/JSONTokener;->nextValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/json/JSONArray;

    if-nez v1, :cond_1

    return-object v2

    :cond_1
    const/4 v2, 0x0

    .line 377
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->getInt(I)I

    move-result v3

    aput v3, v0, v2

    const/4 v2, 0x1

    .line 378
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->getInt(I)I

    move-result v1

    aput v1, v0, v2
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 380
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    :goto_0
    return-object v0
.end method

.method public getDeviceArchitecture()Ljava/lang/String;
    .locals 1

    const-string v0, "deviceArchitecture"

    .line 484
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDeviceId()Ljava/lang/String;
    .locals 1

    const-string v0, "deviceId"

    .line 488
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDeviceManufacturer()Ljava/lang/String;
    .locals 1

    const-string v0, "deviceManufacturer"

    .line 496
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDeviceModel()Ljava/lang/String;
    .locals 1

    const-string v0, "deviceModel"

    .line 492
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDeviceRunTime()Ljava/lang/String;
    .locals 1

    const-string v0, "deviceRunTime"

    .line 500
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDeviceSize()Ljava/lang/String;
    .locals 1

    const-string v0, "deviceSize"

    .line 504
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDisabledVersion()Ljava/lang/String;
    .locals 1

    const-string v0, "NewRelicAgentDisabledVersion"

    .line 353
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getErrorLimit()I
    .locals 1

    const-string v0, "errorLimit"

    .line 431
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getInt(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public getFloat(Ljava/lang/String;)Ljava/lang/Float;
    .locals 2

    .line 343
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 346
    :cond_0
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->prefs:Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result p1

    const/high16 v0, 0x42c80000    # 100.0f

    mul-float p1, p1, v0

    float-to-int p1, p1

    int-to-float p1, p1

    div-float/2addr p1, v0

    .line 349
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public getHarvestConfiguration()Lcom/newrelic/agent/android/harvest/HarvestConfiguration;
    .locals 1

    .line 240
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    return-object v0
.end method

.method public getHarvestInterval()J
    .locals 2

    const-string v0, "harvestIntervalInSeconds"

    .line 411
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public getHarvestIntervalInSeconds()J
    .locals 2

    .line 446
    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getHarvestInterval()J

    move-result-wide v0

    return-wide v0
.end method

.method public getInt(Ljava/lang/String;)I
    .locals 2

    .line 339
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->prefs:Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public getLong(Ljava/lang/String;)J
    .locals 3

    .line 335
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->prefs:Landroid/content/SharedPreferences;

    const-wide/16 v1, 0x0

    invoke-interface {v0, p1, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getMaxTransactionAge()J
    .locals 2

    const-string v0, "maxTransactionAgeInSeconds"

    .line 415
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public getMaxTransactionAgeInSeconds()J
    .locals 2

    .line 451
    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getMaxTransactionAge()J

    move-result-wide v0

    return-wide v0
.end method

.method public getMaxTransactionCount()J
    .locals 2

    const-string v0, "maxTransactionCount"

    .line 419
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public getOsBuild()Ljava/lang/String;
    .locals 1

    const-string v0, "osBuild"

    .line 512
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getOsName()Ljava/lang/String;
    .locals 1

    const-string v0, "osName"

    .line 508
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getOsVersion()Ljava/lang/String;
    .locals 1

    const-string v0, "osVersion"

    .line 516
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPackageId()Ljava/lang/String;
    .locals 1

    const-string v0, "packageId"

    .line 472
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPlatform()Lcom/newrelic/agent/android/ApplicationPlatform;
    .locals 2

    .line 528
    sget-object v0, Lcom/newrelic/agent/android/ApplicationPlatform;->Native:Lcom/newrelic/agent/android/ApplicationPlatform;

    :try_start_0
    const-string v1, "platform"

    .line 530
    invoke-virtual {p0, v1}, Lcom/newrelic/agent/android/SavedState;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/newrelic/agent/android/ApplicationPlatform;->valueOf(Ljava/lang/String;)Lcom/newrelic/agent/android/ApplicationPlatform;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public getPlatformVersion()Ljava/lang/String;
    .locals 1

    const-string v0, "platformVersion"

    .line 537
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPriorityEncodingKey()Ljava/lang/String;
    .locals 1

    const-string v0, "encoding_key"

    .line 391
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getResponseBodyLimit()I
    .locals 1

    const-string v0, "responseBodyLimit"

    .line 427
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getInt(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public getServerTimestamp()J
    .locals 2

    const-string v0, "serverTimestamp"

    .line 407
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public getStackTraceLimit()I
    .locals 1

    const-string v0, "stackTraceLimit"

    .line 423
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getInt(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public getString(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 324
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 327
    :cond_0
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getVersionCode()I
    .locals 1

    const-string v0, "versionCode"

    .line 464
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getInt(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public isCollectingNetworkErrors()Z
    .locals 1

    const-string v0, "collectNetworkErrors"

    .line 403
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public loadConnectInformation()V
    .locals 3

    .line 195
    new-instance v0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;

    invoke-direct {v0}, Lcom/newrelic/agent/android/harvest/ApplicationInformation;-><init>()V

    const-string v1, "appName"

    .line 196
    invoke-direct {p0, v1}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 197
    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getAppName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->setAppName(Ljava/lang/String;)V

    :cond_0
    const-string v1, "appVersion"

    .line 198
    invoke-direct {p0, v1}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 199
    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getAppVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->setAppVersion(Ljava/lang/String;)V

    :cond_1
    const-string v1, "appBuild"

    .line 200
    invoke-direct {p0, v1}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 201
    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getAppBuild()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->setAppBuild(Ljava/lang/String;)V

    :cond_2
    const-string v1, "packageId"

    .line 202
    invoke-direct {p0, v1}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 203
    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getPackageId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->setPackageId(Ljava/lang/String;)V

    :cond_3
    const-string v1, "versionCode"

    .line 204
    invoke-direct {p0, v1}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 205
    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getVersionCode()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->setVersionCode(I)V

    .line 207
    :cond_4
    new-instance v1, Lcom/newrelic/agent/android/harvest/DeviceInformation;

    invoke-direct {v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;-><init>()V

    const-string v2, "agentName"

    .line 208
    invoke-direct {p0, v2}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 209
    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getAgentName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setAgentName(Ljava/lang/String;)V

    :cond_5
    const-string v2, "agentVersion"

    .line 210
    invoke-direct {p0, v2}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 211
    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getAgentVersion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setAgentVersion(Ljava/lang/String;)V

    :cond_6
    const-string v2, "deviceArchitecture"

    .line 212
    invoke-direct {p0, v2}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 213
    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getDeviceArchitecture()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setArchitecture(Ljava/lang/String;)V

    :cond_7
    const-string v2, "deviceId"

    .line 214
    invoke-direct {p0, v2}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 215
    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getDeviceId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setDeviceId(Ljava/lang/String;)V

    :cond_8
    const-string v2, "deviceModel"

    .line 216
    invoke-direct {p0, v2}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 217
    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getDeviceModel()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setModel(Ljava/lang/String;)V

    :cond_9
    const-string v2, "deviceManufacturer"

    .line 218
    invoke-direct {p0, v2}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 219
    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getDeviceManufacturer()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setManufacturer(Ljava/lang/String;)V

    :cond_a
    const-string v2, "deviceRunTime"

    .line 220
    invoke-direct {p0, v2}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b

    .line 221
    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getDeviceRunTime()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setRunTime(Ljava/lang/String;)V

    :cond_b
    const-string v2, "deviceSize"

    .line 222
    invoke-direct {p0, v2}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_c

    .line 223
    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getDeviceSize()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setSize(Ljava/lang/String;)V

    :cond_c
    const-string v2, "osName"

    .line 224
    invoke-direct {p0, v2}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_d

    .line 225
    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getOsName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setOsName(Ljava/lang/String;)V

    :cond_d
    const-string v2, "osBuild"

    .line 226
    invoke-direct {p0, v2}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_e

    .line 227
    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getOsBuild()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setOsBuild(Ljava/lang/String;)V

    :cond_e
    const-string v2, "osVersion"

    .line 228
    invoke-direct {p0, v2}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_f

    .line 229
    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getOsVersion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setOsVersion(Ljava/lang/String;)V

    :cond_f
    const-string v2, "platform"

    .line 230
    invoke-direct {p0, v2}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_10

    .line 231
    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getPlatform()Lcom/newrelic/agent/android/ApplicationPlatform;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setApplicationPlatform(Lcom/newrelic/agent/android/ApplicationPlatform;)V

    :cond_10
    const-string v2, "platformVersion"

    .line 232
    invoke-direct {p0, v2}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_11

    .line 233
    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getPlatformVersion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setApplicationPlatformVersion(Ljava/lang/String;)V

    .line 235
    :cond_11
    iget-object v2, p0, Lcom/newrelic/agent/android/SavedState;->connectInformation:Lcom/newrelic/agent/android/harvest/ConnectInformation;

    invoke-virtual {v2, v0}, Lcom/newrelic/agent/android/harvest/ConnectInformation;->setApplicationInformation(Lcom/newrelic/agent/android/harvest/ApplicationInformation;)V

    .line 236
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->connectInformation:Lcom/newrelic/agent/android/harvest/ConnectInformation;

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/ConnectInformation;->setDeviceInformation(Lcom/newrelic/agent/android/harvest/DeviceInformation;)V

    return-void
.end method

.method public loadHarvestConfiguration()V
    .locals 3

    const-string v0, "dataToken"

    .line 109
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 110
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getDataToken()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setData_token([I)V

    :cond_0
    const-string v0, "crossProcessId"

    .line 111
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 112
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getCrossProcessId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setCross_process_id(Ljava/lang/String;)V

    :cond_1
    const-string v0, "encoding_key"

    .line 113
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 114
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getPriorityEncodingKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setPriority_encoding_key(Ljava/lang/String;)V

    :cond_2
    const-string v0, "account_id"

    .line 115
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 116
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getAccountId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setAccount_id(Ljava/lang/String;)V

    :cond_3
    const-string v0, "application_id"

    .line 117
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 118
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getApplicationId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setApplication_id(Ljava/lang/String;)V

    :cond_4
    const-string v0, "serverTimestamp"

    .line 119
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 120
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getServerTimestamp()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setServer_timestamp(J)V

    :cond_5
    const-string v0, "harvestIntervalInSeconds"

    .line 121
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 122
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getHarvestIntervalInSeconds()J

    move-result-wide v1

    long-to-int v2, v1

    invoke-virtual {v0, v2}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setData_report_period(I)V

    :cond_6
    const-string v0, "maxTransactionAgeInSeconds"

    .line 123
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 124
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getMaxTransactionAgeInSeconds()J

    move-result-wide v1

    long-to-int v2, v1

    invoke-virtual {v0, v2}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setReport_max_transaction_age(I)V

    :cond_7
    const-string v0, "maxTransactionCount"

    .line 125
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 126
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getMaxTransactionCount()J

    move-result-wide v1

    long-to-int v2, v1

    invoke-virtual {v0, v2}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setReport_max_transaction_count(I)V

    :cond_8
    const-string v0, "stackTraceLimit"

    .line 127
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 128
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getStackTraceLimit()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setStack_trace_limit(I)V

    :cond_9
    const-string v0, "responseBodyLimit"

    .line 129
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 130
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getResponseBodyLimit()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setResponse_body_limit(I)V

    :cond_a
    const-string v0, "collectNetworkErrors"

    .line 131
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 132
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->isCollectingNetworkErrors()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setCollect_network_errors(Z)V

    :cond_b
    const-string v0, "errorLimit"

    .line 133
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 134
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getErrorLimit()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setError_limit(I)V

    :cond_c
    const-string v0, "activityTraceMinUtilization"

    .line 135
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 136
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getActivityTraceMinUtilization()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setActivity_trace_min_utilization(D)V

    :cond_d
    const-string v0, "encoding_key"

    .line 137
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 138
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getPriorityEncodingKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setPriority_encoding_key(Ljava/lang/String;)V

    :cond_e
    const-string v0, "account_id"

    .line 139
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 140
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getAccountId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setAccount_id(Ljava/lang/String;)V

    :cond_f
    const-string v0, "application_id"

    .line 141
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/SavedState;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 142
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->getApplicationId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setApplication_id(Ljava/lang/String;)V

    .line 144
    :cond_10
    sget-object v0, Lcom/newrelic/agent/android/SavedState;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Loaded configuration: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/SavedState;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->info(Ljava/lang/String;)V

    return-void
.end method

.method public onHarvestComplete()V
    .locals 0

    return-void
.end method

.method public onHarvestConnected()V
    .locals 1

    .line 253
    invoke-static {}, Lcom/newrelic/agent/android/harvest/Harvest;->getHarvestConfiguration()Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->saveHarvestConfiguration(Lcom/newrelic/agent/android/harvest/HarvestConfiguration;)V

    return-void
.end method

.method public onHarvestDisabled()V
    .locals 4

    .line 268
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getDeviceInformation()Lcom/newrelic/agent/android/harvest/DeviceInformation;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getAgentVersion()Ljava/lang/String;

    move-result-object v0

    .line 269
    sget-object v1, Lcom/newrelic/agent/android/SavedState;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Disabling agent version "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/newrelic/agent/android/logging/AgentLog;->info(Ljava/lang/String;)V

    .line 270
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/SavedState;->saveDisabledVersion(Ljava/lang/String;)V

    return-void
.end method

.method public onHarvestDisconnected()V
    .locals 2

    .line 262
    sget-object v0, Lcom/newrelic/agent/android/SavedState;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "Clearing harvest configuration."

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->info(Ljava/lang/String;)V

    .line 263
    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->clear()V

    return-void
.end method

.method public save(Ljava/lang/String;F)V
    .locals 1

    .line 314
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 316
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    .line 317
    iget-object p1, p0, Lcom/newrelic/agent/android/SavedState;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 319
    iget-object p1, p0, Lcom/newrelic/agent/android/SavedState;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/newrelic/agent/android/SavedState;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public save(Ljava/lang/String;I)V
    .locals 1

    .line 294
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 296
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 297
    iget-object p1, p0, Lcom/newrelic/agent/android/SavedState;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 299
    iget-object p1, p0, Lcom/newrelic/agent/android/SavedState;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/newrelic/agent/android/SavedState;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public save(Ljava/lang/String;J)V
    .locals 1

    .line 304
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 306
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0, p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 307
    iget-object p1, p0, Lcom/newrelic/agent/android/SavedState;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 309
    iget-object p1, p0, Lcom/newrelic/agent/android/SavedState;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/newrelic/agent/android/SavedState;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public save(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 274
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 276
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 277
    iget-object p1, p0, Lcom/newrelic/agent/android/SavedState;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 279
    iget-object p1, p0, Lcom/newrelic/agent/android/SavedState;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/newrelic/agent/android/SavedState;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public save(Ljava/lang/String;Z)V
    .locals 1

    .line 284
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 286
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 287
    iget-object p1, p0, Lcom/newrelic/agent/android/SavedState;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 289
    iget-object p1, p0, Lcom/newrelic/agent/android/SavedState;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/newrelic/agent/android/SavedState;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public saveActivityTraceMinUtilization(F)V
    .locals 1

    .line 435
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/SavedState;->activityTraceMinUtilization:Ljava/lang/Float;

    const-string v0, "activityTraceMinUtilization"

    .line 436
    invoke-virtual {p0, v0, p1}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;F)V

    return-void
.end method

.method public saveAppToken(Ljava/lang/String;)V
    .locals 1

    const-string v0, "appToken"

    .line 167
    invoke-virtual {p0, v0, p1}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public saveConnectInformation(Lcom/newrelic/agent/android/harvest/ConnectInformation;)V
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->connectInformation:Lcom/newrelic/agent/android/harvest/ConnectInformation;

    invoke-virtual {v0, p1}, Lcom/newrelic/agent/android/harvest/ConnectInformation;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 151
    :cond_0
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/ConnectInformation;->getApplicationInformation()Lcom/newrelic/agent/android/harvest/ApplicationInformation;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/SavedState;->saveApplicationInformation(Lcom/newrelic/agent/android/harvest/ApplicationInformation;)V

    .line 152
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/ConnectInformation;->getDeviceInformation()Lcom/newrelic/agent/android/harvest/DeviceInformation;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/SavedState;->saveDeviceInformation(Lcom/newrelic/agent/android/harvest/DeviceInformation;)V

    .line 154
    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->loadConnectInformation()V

    return-void
.end method

.method public saveDeviceId(Ljava/lang/String;)V
    .locals 1

    const-string v0, "deviceId"

    .line 158
    invoke-virtual {p0, v0, p1}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->connectInformation:Lcom/newrelic/agent/android/harvest/ConnectInformation;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/ConnectInformation;->getDeviceInformation()Lcom/newrelic/agent/android/harvest/DeviceInformation;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setDeviceId(Ljava/lang/String;)V

    return-void
.end method

.method public saveDisabledVersion(Ljava/lang/String;)V
    .locals 1

    const-string v0, "NewRelicAgentDisabledVersion"

    .line 357
    invoke-virtual {p0, v0, p1}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public saveHarvestConfiguration(Lcom/newrelic/agent/android/harvest/HarvestConfiguration;)V
    .locals 4

    .line 79
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    invoke-virtual {v0, p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 82
    :cond_0
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getDataToken()Lcom/newrelic/agent/android/harvest/DataToken;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/DataToken;->isValid()Z

    move-result v0

    if-nez v0, :cond_1

    .line 83
    iget-object v0, p0, Lcom/newrelic/agent/android/SavedState;->configuration:Lcom/newrelic/agent/android/harvest/HarvestConfiguration;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getData_token()[I

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->setData_token([I)V

    .line 85
    :cond_1
    sget-object v0, Lcom/newrelic/agent/android/SavedState;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Saving configuration: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->info(Ljava/lang/String;)V

    .line 87
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getDataToken()Lcom/newrelic/agent/android/harvest/DataToken;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/DataToken;->toJsonString()Ljava/lang/String;

    move-result-object v0

    .line 88
    sget-object v1, Lcom/newrelic/agent/android/SavedState;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "!! saving data token: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    const-string v1, "dataToken"

    .line 89
    invoke-virtual {p0, v1, v0}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "crossProcessId"

    .line 90
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getCross_process_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "serverTimestamp"

    .line 91
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getServer_timestamp()J

    move-result-wide v1

    invoke-virtual {p0, v0, v1, v2}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;J)V

    const-string v0, "harvestIntervalInSeconds"

    .line 92
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getData_report_period()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {p0, v0, v1, v2}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;J)V

    const-string v0, "maxTransactionAgeInSeconds"

    .line 93
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getReport_max_transaction_age()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {p0, v0, v1, v2}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;J)V

    const-string v0, "maxTransactionCount"

    .line 94
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getReport_max_transaction_count()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {p0, v0, v1, v2}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;J)V

    const-string v0, "stackTraceLimit"

    .line 95
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getStack_trace_limit()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;I)V

    const-string v0, "responseBodyLimit"

    .line 96
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getResponse_body_limit()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;I)V

    const-string v0, "collectNetworkErrors"

    .line 97
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->isCollect_network_errors()Z

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;Z)V

    const-string v0, "errorLimit"

    .line 98
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getError_limit()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;I)V

    const-string v0, "encoding_key"

    .line 99
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getPriority_encoding_key()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "account_id"

    .line 100
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getAccount_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application_id"

    .line 101
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getApplication_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/newrelic/agent/android/SavedState;->save(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HarvestConfiguration;->getActivity_trace_min_utilization()D

    move-result-wide v0

    double-to-float p1, v0

    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/SavedState;->saveActivityTraceMinUtilization(F)V

    .line 105
    invoke-virtual {p0}, Lcom/newrelic/agent/android/SavedState;->loadHarvestConfiguration()V

    return-void
.end method
