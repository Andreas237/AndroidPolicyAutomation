.class public Lcom/usebutton/sdk/internal/core/Storage;
.super Ljava/lang/Object;
.source "Storage.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# static fields
.field private static final KEY_CONFIGURATION:Ljava/lang/String; = "configuration"

.field private static final KEY_CONFIG_TIME_OF_LAST_CHECK_IN_MS:Ljava/lang/String; = "config-time-of-last-check-in-ms"

.field private static final KEY_DETECTABLE_APPLICATIONS:Ljava/lang/String; = "detectable-applications"

.field private static final KEY_EVENT_SEQ_NUMBER:Ljava/lang/String; = "event-sequence-number"

.field private static final KEY_EXCEPTION:Ljava/lang/String; = "exception"

.field private static final KEY_EXCEPTION_TIME:Ljava/lang/String; = "exception-time"

.field private static final KEY_INSTANT_REWARD_CARD_DISPLAY_COUNT:Ljava/lang/String; = "instant-reward-card-display-count"

.field private static final KEY_LAST_APPLICATION_PROBE_MS:Ljava/lang/String; = "last-application-probe-ms"

.field private static final KEY_LAST_EVENT_REPORT_MS:Ljava/lang/String; = "last-event-report-ms"

.field private static final KEY_PREFERRED_GROUP:Ljava/lang/String; = "preferred-group"

.field private static final KEY_REWARD_ELIGIBLE_CARD_DISPLAY_COUNT:Ljava/lang/String; = "reward-eligible-card-display-count"

.field private static final KEY_REWARD_INELIGIBLE_CARD_DISPLAY_COUNT:Ljava/lang/String; = "reward-ineligible-card-display-count"

.field private static final KEY_SESSION_ID:Ljava/lang/String; = "session-id"

.field private static final KEY_USER_IDENTIFIER:Ljava/lang/String; = "user-identifier"

.field private static final TAG:Ljava/lang/String; = "Storage"


# instance fields
.field private final applicationId:Ljava/lang/String;

.field private final prefs:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "btnprefs"

    const/4 v1, 0x0

    .line 50
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/core/Storage;->prefs:Landroid/content/SharedPreferences;

    .line 51
    iput-object p2, p0, Lcom/usebutton/sdk/internal/core/Storage;->applicationId:Ljava/lang/String;

    return-void
.end method

.method private getCardTypeKey(Lcom/usebutton/sdk/internal/models/BrowserCardType;)Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 275
    sget-object v0, Lcom/usebutton/sdk/internal/core/Storage$1;->$SwitchMap$com$usebutton$sdk$internal$models$BrowserCardType:[I

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/BrowserCardType;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    return-object p1

    :pswitch_0
    const-string p1, "reward-eligible-card-display-count"

    return-object p1

    :pswitch_1
    const-string p1, "reward-ineligible-card-display-count"

    return-object p1

    :pswitch_2
    const-string p1, "instant-reward-card-display-count"

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private getLong(Ljava/lang/String;)J
    .locals 3

    .line 318
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/Storage;->prefs:Landroid/content/SharedPreferences;

    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/core/Storage;->keyFor(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-wide/16 v1, 0x0

    invoke-interface {v0, p1, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method private getString(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 310
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/Storage;->prefs:Landroid/content/SharedPreferences;

    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/core/Storage;->keyFor(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private keyFor(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const-string v0, "%s.%s"

    const/4 v1, 0x2

    .line 298
    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/core/Storage;->applicationId:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private promotionKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "%s-%s"

    const/4 v1, 0x2

    .line 302
    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/core/Storage;->keyFor(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object p2, v1, p1

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private putLong(Ljava/lang/String;J)V
    .locals 1

    .line 314
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/Storage;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/core/Storage;->keyFor(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method private putString(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 306
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/Storage;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/core/Storage;->keyFor(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/Storage;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public clearException()V
    .locals 2

    .line 227
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/Storage;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "exception"

    invoke-direct {p0, v1}, Lcom/usebutton/sdk/internal/core/Storage;->keyFor(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public getAndIncrementEventSequenceNumber()I
    .locals 4

    .line 121
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/Storage;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "event-sequence-number"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 122
    iget-object v1, p0, Lcom/usebutton/sdk/internal/core/Storage;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "event-sequence-number"

    add-int/lit8 v3, v0, 0x1

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return v0
.end method

.method public getApplicationId()Ljava/lang/String;
    .locals 1

    .line 193
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/Storage;->applicationId:Ljava/lang/String;

    return-object v0
.end method

.method public getConfigState()Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy$State;
    .locals 3

    .line 292
    new-instance v0, Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy$State;

    const-string v1, "config-time-of-last-check-in-ms"

    invoke-direct {p0, v1}, Lcom/usebutton/sdk/internal/core/Storage;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy$State;-><init>(J)V

    return-object v0
.end method

.method public getConfiguration()Lcom/usebutton/sdk/internal/models/Configuration;
    .locals 6
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const-string v0, "configuration"

    .line 141
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/core/Storage;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 142
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 147
    :cond_0
    :try_start_0
    new-instance v2, Lcom/usebutton/sdk/internal/models/Configuration;

    new-instance v3, Lorg/json/JSONObject;

    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/JSONObjectInstrumentation;->init(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/usebutton/sdk/internal/models/Configuration;-><init>(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    move-exception v2

    const-string v3, "Storage"

    .line 149
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Could not restore configuration from "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1

    :cond_1
    :goto_0
    return-object v1
.end method

.method public getDetectableApplications()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 74
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/Storage;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "detectable-applications"

    invoke-direct {p0, v1}, Lcom/usebutton/sdk/internal/core/Storage;->keyFor(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/usebutton/sdk/internal/commands/ProbeForApplicationsCommand;->DEFAULT_DETECTABLE:Ljava/util/Set;

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getException()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const-string v0, "exception"

    .line 220
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/core/Storage;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getExceptionTime()J
    .locals 2

    const-string v0, "exception-time"

    .line 242
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/core/Storage;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public getInternalRewardCardDisplayCount(Lcom/usebutton/sdk/internal/models/BrowserCardType;)I
    .locals 2

    .line 252
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/core/Storage;->getCardTypeKey(Lcom/usebutton/sdk/internal/models/BrowserCardType;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 254
    iget-object v1, p0, Lcom/usebutton/sdk/internal/core/Storage;->prefs:Landroid/content/SharedPreferences;

    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/core/Storage;->keyFor(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    return p1

    :cond_0
    return v0
.end method

.method public getPreferredInventoryGroup(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 162
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/Storage;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "preferred-group"

    invoke-direct {p0, p1, v1}, Lcom/usebutton/sdk/internal/core/Storage;->promotionKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getSessionId()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const-string v0, "session-id"

    .line 59
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/core/Storage;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTimeOfLastApplicationProbe()J
    .locals 2

    const-string v0, "last-application-probe-ms"

    .line 93
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/core/Storage;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public getTimeOfLastEventReport()J
    .locals 2

    const-string v0, "last-event-report-ms"

    .line 107
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/core/Storage;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public getUserIdentifier()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const-string v0, "user-identifier"

    .line 186
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/core/Storage;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public markDidRemoteLog()V
    .locals 3

    const-string v0, "exception-time"

    .line 235
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-direct {p0, v0, v1, v2}, Lcom/usebutton/sdk/internal/core/Storage;->putLong(Ljava/lang/String;J)V

    return-void
.end method

.method public setConfigState(Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy$State;)V
    .locals 3

    const-string v0, "config-time-of-last-check-in-ms"

    .line 288
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy$State;->getTimeOfLastCheckInMs()J

    move-result-wide v1

    invoke-direct {p0, v0, v1, v2}, Lcom/usebutton/sdk/internal/core/Storage;->putLong(Ljava/lang/String;J)V

    return-void
.end method

.method public setConfiguration(Lcom/usebutton/sdk/internal/models/Configuration;)V
    .locals 1
    .param p1    # Lcom/usebutton/sdk/internal/models/Configuration;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "configuration"

    .line 130
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/Configuration;->getJsonString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/usebutton/sdk/internal/core/Storage;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setDetectableApplications(Ljava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 83
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/Storage;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "detectable-applications"

    .line 84
    invoke-direct {p0, v1}, Lcom/usebutton/sdk/internal/core/Storage;->keyFor(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v0, "last-application-probe-ms"

    .line 85
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/core/Storage;->keyFor(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 86
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setInternalRewardCardDisplayCount(Lcom/usebutton/sdk/internal/models/BrowserCardType;I)V
    .locals 1

    .line 267
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/core/Storage;->getCardTypeKey(Lcom/usebutton/sdk/internal/models/BrowserCardType;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 269
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/Storage;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/core/Storage;->keyFor(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_0
    return-void
.end method

.method public setPreferredInventoryGroup(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 176
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/Storage;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "preferred-group"

    .line 177
    invoke-direct {p0, p1, v1}, Lcom/usebutton/sdk/internal/core/Storage;->promotionKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 178
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setSessionId(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const-string v0, "session-id"

    .line 66
    invoke-direct {p0, v0, p1}, Lcom/usebutton/sdk/internal/core/Storage;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setTimeOfLastEventReport(J)V
    .locals 1

    const-string v0, "last-event-report-ms"

    .line 100
    invoke-direct {p0, v0, p1, p2}, Lcom/usebutton/sdk/internal/core/Storage;->putLong(Ljava/lang/String;J)V

    return-void
.end method

.method public setUserIdentifier(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CommitPrefEdits"
        }
    .end annotation

    const-string v0, "user-identifier"

    .line 202
    invoke-direct {p0, v0, p1}, Lcom/usebutton/sdk/internal/core/Storage;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public storeException(Ljava/lang/String;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CommitPrefEdits"
        }
    .end annotation

    .line 211
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/Storage;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "exception"

    invoke-direct {p0, v1}, Lcom/usebutton/sdk/internal/core/Storage;->keyFor(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method
