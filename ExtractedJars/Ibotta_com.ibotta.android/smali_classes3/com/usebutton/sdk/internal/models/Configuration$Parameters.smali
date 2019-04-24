.class public Lcom/usebutton/sdk/internal/models/Configuration$Parameters;
.super Ljava/lang/Object;
.source "Configuration.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/models/Configuration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Parameters"
.end annotation


# instance fields
.field private final appToAppNotificationEnabled:Z

.field private final attendedInstallAutoOpenSeconds:I

.field private final autofillEnabled:Z

.field private final blacklistedWebResources:Ljava/util/Set;

.field private final browserTransitionStyle:Lcom/usebutton/sdk/internal/BrowserTransitionStyle;

.field private final cacheImageGlobalSizeBytes:I

.field private final cacheImageMaxSizeBytes:I

.field private final configUpdateMinimumInterval:I

.field private final crashReportingInterval:I

.field private final eventFlushSeconds:I

.field private final eventReportIntervalSeconds:I

.field private final instantRewardsCardEnabled:Z

.field private final inventoryButtonLimit:I

.field private final isButtonDisabled:Z

.field private final isCrashReportingEnabled:Z

.field private final isInstallNotificationDisabled:Z

.field private final isPurchasePathExtensionDisabled:Z

.field private final isWebNavigateEventsDisabled:Z

.field private final pageViewReportingEnabled:Z

.field private final predictableRewardsCardEnabled:Z

.field private final restrictedCookiesDomains:Ljava/util/Set;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 3

    .line 159
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "button_disabled"

    const/4 v1, 0x0

    .line 160
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->isButtonDisabled:Z

    const-string v0, "crash_reporting_enabled"

    .line 161
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->isCrashReportingEnabled:Z

    const-string v0, "disable_install_notification"

    .line 162
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->isInstallNotificationDisabled:Z

    const-string v0, "disable_webview_navigate_events"

    .line 163
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->isWebNavigateEventsDisabled:Z

    const-string v0, "checkout_extension_disabled"

    .line 164
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->isPurchasePathExtensionDisabled:Z

    const-string v0, "event_flush_seconds"

    const/4 v2, 0x5

    .line 165
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->eventFlushSeconds:I

    const-string v0, "events_report_interval_seconds"

    const v2, 0x15180

    .line 166
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->eventReportIntervalSeconds:I

    const-string v0, "config_update_minimum_interval_seconds"

    const/16 v2, 0x12c

    .line 167
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->configUpdateMinimumInterval:I

    const-string v0, "cache_image_global_size_bytes"

    const/high16 v2, 0x200000

    .line 168
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->cacheImageGlobalSizeBytes:I

    const-string v0, "cache_image_max_size_bytes"

    const v2, 0x19000

    .line 169
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->cacheImageMaxSizeBytes:I

    const-string v0, "crash_reporting_interval_seconds"

    const/16 v2, 0xe10

    .line 170
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->crashReportingInterval:I

    const-string v0, "attended_install_auto_open_seconds"

    const/16 v2, 0x1e

    .line 171
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->attendedInstallAutoOpenSeconds:I

    const-string v0, "inventory_button_item_limit"

    .line 172
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->inventoryButtonLimit:I

    const-string v0, "blacklisted_web_resources"

    .line 173
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->arrayToSet(Lorg/json/JSONArray;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->blacklistedWebResources:Ljava/util/Set;

    const-string v0, "restricted_cookies_domains"

    .line 174
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "restricted_cookies_domains"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->arrayToSet(Lorg/json/JSONArray;)Ljava/util/Set;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->restrictedCookiesDomains:Ljava/util/Set;

    const-string v0, "pageview_reporting_enabled"

    const/4 v2, 0x1

    .line 175
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->pageViewReportingEnabled:Z

    const-string v0, "autofill_enabled"

    .line 176
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->autofillEnabled:Z

    const-string v0, "predictable_rewards_card_enabled"

    .line 177
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->predictableRewardsCardEnabled:Z

    const-string v0, "instant_rewards_card_enabled"

    .line 178
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->instantRewardsCardEnabled:Z

    const-string v0, "app_to_app_notification_enabled"

    .line 179
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->appToAppNotificationEnabled:Z

    const-string v0, "browser_transition_style"

    const-string v1, "default"

    .line 180
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 181
    invoke-static {p1}, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;->fromJson(Ljava/lang/String;)Lcom/usebutton/sdk/internal/BrowserTransitionStyle;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->browserTransitionStyle:Lcom/usebutton/sdk/internal/BrowserTransitionStyle;

    return-void
.end method

.method private arrayToSet(Lorg/json/JSONArray;)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 185
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    if-eqz p1, :cond_2

    .line 186
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 189
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 190
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    :goto_1
    return-object v0
.end method


# virtual methods
.method public getAttendedInstallAutoOpenSeconds()I
    .locals 1

    .line 265
    iget v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->attendedInstallAutoOpenSeconds:I

    return v0
.end method

.method public getBlacklistedWebResources()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 290
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->blacklistedWebResources:Ljava/util/Set;

    return-object v0
.end method

.method public getBrowserTransitionStyle()Lcom/usebutton/sdk/internal/BrowserTransitionStyle;
    .locals 1

    .line 345
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->browserTransitionStyle:Lcom/usebutton/sdk/internal/BrowserTransitionStyle;

    return-object v0
.end method

.method public getCacheImageGlobalSizeBytes()I
    .locals 1

    .line 242
    iget v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->cacheImageGlobalSizeBytes:I

    return v0
.end method

.method public getCacheImageMaxSizeBytes()I
    .locals 1

    .line 250
    iget v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->cacheImageMaxSizeBytes:I

    return v0
.end method

.method public getConfigUpdateMinimumInterval()I
    .locals 1

    .line 235
    iget v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->configUpdateMinimumInterval:I

    return v0
.end method

.method public getCrashReportingIntervalSeconds()I
    .locals 1

    .line 257
    iget v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->crashReportingInterval:I

    return v0
.end method

.method public getEventFlushSeconds()I
    .locals 1

    .line 221
    iget v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->eventFlushSeconds:I

    return v0
.end method

.method public getEventReportIntervalSeconds()I
    .locals 1

    .line 228
    iget v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->eventReportIntervalSeconds:I

    return v0
.end method

.method public getInventoryButtonLimit()I
    .locals 1

    .line 279
    iget v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->inventoryButtonLimit:I

    return v0
.end method

.method public getRestrictedCookiesDomains()Ljava/util/Set;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 298
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->restrictedCookiesDomains:Ljava/util/Set;

    return-object v0
.end method

.method public isAppToAppNotificationEnabled()Z
    .locals 1

    .line 337
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->appToAppNotificationEnabled:Z

    return v0
.end method

.method public isAutofillEnabled()Z
    .locals 1

    .line 314
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->autofillEnabled:Z

    return v0
.end method

.method public isButtonDisabled()Z
    .locals 1

    .line 200
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->isButtonDisabled:Z

    return v0
.end method

.method public isCrashReporterEnabled()Z
    .locals 1

    .line 207
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->isCrashReportingEnabled:Z

    return v0
.end method

.method public isInstallNotificationDisabled()Z
    .locals 1

    .line 272
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->isInstallNotificationDisabled:Z

    return v0
.end method

.method public isInstantRewardsCardEnabled()Z
    .locals 1

    .line 329
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->instantRewardsCardEnabled:Z

    return v0
.end method

.method public isPageViewReportingEnabled()Z
    .locals 1

    .line 306
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->pageViewReportingEnabled:Z

    return v0
.end method

.method public isPredictableRewardsCardEnabled()Z
    .locals 1

    .line 321
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->predictableRewardsCardEnabled:Z

    return v0
.end method

.method public isPurchasePathExtensionDisabled()Z
    .locals 1

    .line 214
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->isPurchasePathExtensionDisabled:Z

    return v0
.end method

.method public isWebNavigateEventsDisabled()Z
    .locals 1

    .line 283
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->isWebNavigateEventsDisabled:Z

    return v0
.end method
