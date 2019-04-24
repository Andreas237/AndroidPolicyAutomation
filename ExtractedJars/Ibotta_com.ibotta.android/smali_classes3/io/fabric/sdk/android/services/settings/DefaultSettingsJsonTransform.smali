.class Lio/fabric/sdk/android/services/settings/DefaultSettingsJsonTransform;
.super Ljava/lang/Object;
.source "DefaultSettingsJsonTransform.java"

# interfaces
.implements Lio/fabric/sdk/android/services/settings/SettingsJsonTransform;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private buildAnalyticsSessionDataFrom(Lorg/json/JSONObject;)Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;
    .locals 12

    const-string v0, "url"

    const-string v1, "https://e.crashlytics.com/spi/v2/events"

    .line 123
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v0, "flush_interval_secs"

    const/16 v1, 0x258

    .line 126
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v4

    const-string v0, "max_byte_size_per_file"

    const/16 v1, 0x1f40

    .line 128
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v5

    const-string v0, "max_file_count_per_send"

    const/4 v1, 0x1

    .line 131
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v6

    const-string v0, "max_pending_send_file_count"

    const/16 v2, 0x64

    .line 134
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v7

    const-string v0, "track_custom_events"

    .line 137
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v8

    const-string v0, "track_predefined_events"

    .line 140
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v9

    const-string v0, "sampling_rate"

    .line 143
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v10

    const-string v0, "flush_on_background"

    .line 146
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v11

    .line 150
    new-instance p1, Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;

    move-object v2, p1

    invoke-direct/range {v2 .. v11}, Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;-><init>(Ljava/lang/String;IIIIZZIZ)V

    return-object p1
.end method

.method private buildAppDataFrom(Lorg/json/JSONObject;)Lio/fabric/sdk/android/services/settings/AppSettingsData;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "identifier"

    .line 77
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v0, "status"

    .line 78
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v0, "url"

    .line 79
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "reports_url"

    .line 80
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v0, "update_required"

    const/4 v1, 0x0

    .line 81
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v6

    const-string v0, "icon"

    .line 88
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "icon"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "hash"

    .line 89
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "icon"

    .line 90
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/fabric/sdk/android/services/settings/DefaultSettingsJsonTransform;->buildIconDataFrom(Lorg/json/JSONObject;)Lio/fabric/sdk/android/services/settings/AppIconSettingsData;

    move-result-object p1

    move-object v7, p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    move-object v7, p1

    .line 93
    :goto_0
    new-instance p1, Lio/fabric/sdk/android/services/settings/AppSettingsData;

    move-object v1, p1

    invoke-direct/range {v1 .. v7}, Lio/fabric/sdk/android/services/settings/AppSettingsData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/fabric/sdk/android/services/settings/AppIconSettingsData;)V

    return-object p1
.end method

.method private buildBetaSettingsDataFrom(Lorg/json/JSONObject;)Lio/fabric/sdk/android/services/settings/BetaSettingsData;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "update_endpoint"

    .line 211
    sget-object v1, Lio/fabric/sdk/android/services/settings/SettingsJsonConstants;->BETA_UPDATE_ENDPOINT_DEFAULT:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "update_suspend_duration"

    const/16 v2, 0xe10

    .line 214
    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p1

    .line 218
    new-instance v1, Lio/fabric/sdk/android/services/settings/BetaSettingsData;

    invoke-direct {v1, v0, p1}, Lio/fabric/sdk/android/services/settings/BetaSettingsData;-><init>(Ljava/lang/String;I)V

    return-object v1
.end method

.method private buildFeaturesSessionDataFrom(Lorg/json/JSONObject;)Lio/fabric/sdk/android/services/settings/FeaturesSettingsData;
    .locals 5

    const-string v0, "prompt_enabled"

    const/4 v1, 0x0

    .line 105
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    const-string v2, "collect_logged_exceptions"

    const/4 v3, 0x1

    .line 108
    invoke-virtual {p1, v2, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v2

    const-string v4, "collect_reports"

    .line 111
    invoke-virtual {p1, v4, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    const-string v4, "collect_analytics"

    .line 114
    invoke-virtual {p1, v4, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p1

    .line 118
    new-instance v1, Lio/fabric/sdk/android/services/settings/FeaturesSettingsData;

    invoke-direct {v1, v0, v2, v3, p1}, Lio/fabric/sdk/android/services/settings/FeaturesSettingsData;-><init>(ZZZZ)V

    return-object v1
.end method

.method private buildIconDataFrom(Lorg/json/JSONObject;)Lio/fabric/sdk/android/services/settings/AppIconSettingsData;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "hash"

    .line 97
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "width"

    .line 98
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    const-string v2, "height"

    .line 99
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    .line 101
    new-instance v2, Lio/fabric/sdk/android/services/settings/AppIconSettingsData;

    invoke-direct {v2, v0, v1, p1}, Lio/fabric/sdk/android/services/settings/AppIconSettingsData;-><init>(Ljava/lang/String;II)V

    return-object v2
.end method

.method private buildPromptDataFrom(Lorg/json/JSONObject;)Lio/fabric/sdk/android/services/settings/PromptSettingsData;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "title"

    const-string v1, "Send Crash Report?"

    .line 184
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v0, "message"

    const-string v1, "Looks like we crashed! Please help us fix the problem by sending a crash report."

    .line 187
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "send_button_title"

    const-string v1, "Send"

    .line 190
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v0, "show_cancel_button"

    const/4 v1, 0x1

    .line 193
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v6

    const-string v0, "cancel_button_title"

    const-string v2, "Don\'t Send"

    .line 196
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v0, "show_always_send_button"

    .line 199
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v8

    const-string v0, "always_send_button_title"

    const-string v1, "Always Send"

    .line 202
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 206
    new-instance p1, Lio/fabric/sdk/android/services/settings/PromptSettingsData;

    move-object v2, p1

    invoke-direct/range {v2 .. v9}, Lio/fabric/sdk/android/services/settings/PromptSettingsData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;)V

    return-object p1
.end method

.method private buildSessionDataFrom(Lorg/json/JSONObject;)Lio/fabric/sdk/android/services/settings/SessionSettingsData;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "log_buffer_size"

    const v1, 0xfa00

    .line 156
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v3

    const-string v0, "max_chained_exception_depth"

    const/16 v1, 0x8

    .line 159
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v4

    const-string v0, "max_custom_exception_events"

    const/16 v1, 0x40

    .line 162
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v5

    const-string v0, "max_custom_key_value_pairs"

    .line 165
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v6

    const-string v0, "identifier_mask"

    const/16 v1, 0xff

    .line 168
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v7

    const-string v0, "send_session_without_crash"

    const/4 v1, 0x0

    .line 171
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v8

    const-string v0, "max_complete_sessions_count"

    const/4 v1, 0x4

    .line 174
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v9

    .line 178
    new-instance p1, Lio/fabric/sdk/android/services/settings/SessionSettingsData;

    move-object v2, p1

    invoke-direct/range {v2 .. v9}, Lio/fabric/sdk/android/services/settings/SessionSettingsData;-><init>(IIIIIZI)V

    return-object p1
.end method

.method private getExpiresAtFrom(Lio/fabric/sdk/android/services/common/CurrentTimeProvider;JLorg/json/JSONObject;)J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "expires_at"

    .line 225
    invoke-virtual {p4, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "expires_at"

    .line 227
    invoke-virtual {p4, p1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide p1

    goto :goto_0

    .line 231
    :cond_0
    invoke-interface {p1}, Lio/fabric/sdk/android/services/common/CurrentTimeProvider;->getCurrentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long p2, p2, v2

    add-long p1, v0, p2

    :goto_0
    return-wide p1
.end method

.method private toAnalyticsJson(Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;)Lorg/json/JSONObject;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 284
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "url"

    iget-object v2, p1, Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;->analyticsURL:Ljava/lang/String;

    .line 285
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "flush_interval_secs"

    iget v2, p1, Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;->flushIntervalSeconds:I

    .line 286
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "max_byte_size_per_file"

    iget v2, p1, Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;->maxByteSizePerFile:I

    .line 288
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "max_file_count_per_send"

    iget v2, p1, Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;->maxFileCountPerSend:I

    .line 290
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "max_pending_send_file_count"

    iget p1, p1, Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;->maxPendingSendFileCount:I

    .line 292
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method private toAppJson(Lio/fabric/sdk/android/services/settings/AppSettingsData;)Lorg/json/JSONObject;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 239
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "identifier"

    iget-object v2, p1, Lio/fabric/sdk/android/services/settings/AppSettingsData;->identifier:Ljava/lang/String;

    .line 240
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "status"

    iget-object v2, p1, Lio/fabric/sdk/android/services/settings/AppSettingsData;->status:Ljava/lang/String;

    .line 241
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "url"

    iget-object v2, p1, Lio/fabric/sdk/android/services/settings/AppSettingsData;->url:Ljava/lang/String;

    .line 242
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "reports_url"

    iget-object v2, p1, Lio/fabric/sdk/android/services/settings/AppSettingsData;->reportsUrl:Ljava/lang/String;

    .line 243
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "update_required"

    iget-boolean v2, p1, Lio/fabric/sdk/android/services/settings/AppSettingsData;->updateRequired:Z

    .line 244
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v0

    .line 246
    iget-object v1, p1, Lio/fabric/sdk/android/services/settings/AppSettingsData;->icon:Lio/fabric/sdk/android/services/settings/AppIconSettingsData;

    if-eqz v1, :cond_0

    const-string v1, "icon"

    .line 247
    iget-object p1, p1, Lio/fabric/sdk/android/services/settings/AppSettingsData;->icon:Lio/fabric/sdk/android/services/settings/AppIconSettingsData;

    invoke-direct {p0, p1}, Lio/fabric/sdk/android/services/settings/DefaultSettingsJsonTransform;->toIconJson(Lio/fabric/sdk/android/services/settings/AppIconSettingsData;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    return-object v0
.end method

.method private toBetaJson(Lio/fabric/sdk/android/services/settings/BetaSettingsData;)Lorg/json/JSONObject;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 297
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "update_endpoint"

    iget-object v2, p1, Lio/fabric/sdk/android/services/settings/BetaSettingsData;->updateUrl:Ljava/lang/String;

    .line 298
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "update_suspend_duration"

    iget p1, p1, Lio/fabric/sdk/android/services/settings/BetaSettingsData;->updateSuspendDurationSeconds:I

    .line 299
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method private toFeaturesJson(Lio/fabric/sdk/android/services/settings/FeaturesSettingsData;)Lorg/json/JSONObject;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 260
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "collect_logged_exceptions"

    iget-boolean v2, p1, Lio/fabric/sdk/android/services/settings/FeaturesSettingsData;->collectLoggedException:Z

    .line 261
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "collect_reports"

    iget-boolean v2, p1, Lio/fabric/sdk/android/services/settings/FeaturesSettingsData;->collectReports:Z

    .line 263
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "collect_analytics"

    iget-boolean p1, p1, Lio/fabric/sdk/android/services/settings/FeaturesSettingsData;->collectAnalytics:Z

    .line 264
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method private toIconJson(Lio/fabric/sdk/android/services/settings/AppIconSettingsData;)Lorg/json/JSONObject;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 254
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "hash"

    iget-object v2, p1, Lio/fabric/sdk/android/services/settings/AppIconSettingsData;->hash:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "width"

    iget v2, p1, Lio/fabric/sdk/android/services/settings/AppIconSettingsData;->width:I

    .line 255
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "height"

    iget p1, p1, Lio/fabric/sdk/android/services/settings/AppIconSettingsData;->height:I

    .line 256
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method private toPromptJson(Lio/fabric/sdk/android/services/settings/PromptSettingsData;)Lorg/json/JSONObject;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 304
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "title"

    iget-object v2, p1, Lio/fabric/sdk/android/services/settings/PromptSettingsData;->title:Ljava/lang/String;

    .line 305
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "message"

    iget-object v2, p1, Lio/fabric/sdk/android/services/settings/PromptSettingsData;->message:Ljava/lang/String;

    .line 306
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "send_button_title"

    iget-object v2, p1, Lio/fabric/sdk/android/services/settings/PromptSettingsData;->sendButtonTitle:Ljava/lang/String;

    .line 307
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "show_cancel_button"

    iget-boolean v2, p1, Lio/fabric/sdk/android/services/settings/PromptSettingsData;->showCancelButton:Z

    .line 308
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "cancel_button_title"

    iget-object v2, p1, Lio/fabric/sdk/android/services/settings/PromptSettingsData;->cancelButtonTitle:Ljava/lang/String;

    .line 309
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "show_always_send_button"

    iget-boolean v2, p1, Lio/fabric/sdk/android/services/settings/PromptSettingsData;->showAlwaysSendButton:Z

    .line 310
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "always_send_button_title"

    iget-object p1, p1, Lio/fabric/sdk/android/services/settings/PromptSettingsData;->alwaysSendButtonTitle:Ljava/lang/String;

    .line 312
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method private toSessionJson(Lio/fabric/sdk/android/services/settings/SessionSettingsData;)Lorg/json/JSONObject;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 269
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "log_buffer_size"

    iget v2, p1, Lio/fabric/sdk/android/services/settings/SessionSettingsData;->logBufferSize:I

    .line 270
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "max_chained_exception_depth"

    iget v2, p1, Lio/fabric/sdk/android/services/settings/SessionSettingsData;->maxChainedExceptionDepth:I

    .line 271
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "max_custom_exception_events"

    iget v2, p1, Lio/fabric/sdk/android/services/settings/SessionSettingsData;->maxCustomExceptionEvents:I

    .line 273
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "max_custom_key_value_pairs"

    iget v2, p1, Lio/fabric/sdk/android/services/settings/SessionSettingsData;->maxCustomKeyValuePairs:I

    .line 275
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "identifier_mask"

    iget v2, p1, Lio/fabric/sdk/android/services/settings/SessionSettingsData;->identifierMask:I

    .line 277
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "send_session_without_crash"

    iget-boolean p1, p1, Lio/fabric/sdk/android/services/settings/SessionSettingsData;->sendSessionWithoutCrash:Z

    .line 279
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public buildFromJson(Lio/fabric/sdk/android/services/common/CurrentTimeProvider;Lorg/json/JSONObject;)Lio/fabric/sdk/android/services/settings/SettingsData;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "settings_version"

    const/4 v1, 0x0

    .line 36
    invoke-virtual {p2, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v11

    const-string v0, "cache_duration"

    const/16 v1, 0xe10

    .line 38
    invoke-virtual {p2, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v12

    const-string v0, "app"

    .line 42
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 41
    invoke-direct {p0, v0}, Lio/fabric/sdk/android/services/settings/DefaultSettingsJsonTransform;->buildAppDataFrom(Lorg/json/JSONObject;)Lio/fabric/sdk/android/services/settings/AppSettingsData;

    move-result-object v5

    const-string v0, "session"

    .line 44
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 43
    invoke-direct {p0, v0}, Lio/fabric/sdk/android/services/settings/DefaultSettingsJsonTransform;->buildSessionDataFrom(Lorg/json/JSONObject;)Lio/fabric/sdk/android/services/settings/SessionSettingsData;

    move-result-object v6

    const-string v0, "prompt"

    .line 46
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 45
    invoke-direct {p0, v0}, Lio/fabric/sdk/android/services/settings/DefaultSettingsJsonTransform;->buildPromptDataFrom(Lorg/json/JSONObject;)Lio/fabric/sdk/android/services/settings/PromptSettingsData;

    move-result-object v7

    const-string v0, "features"

    .line 48
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 47
    invoke-direct {p0, v0}, Lio/fabric/sdk/android/services/settings/DefaultSettingsJsonTransform;->buildFeaturesSessionDataFrom(Lorg/json/JSONObject;)Lio/fabric/sdk/android/services/settings/FeaturesSettingsData;

    move-result-object v8

    const-string v0, "analytics"

    .line 50
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 49
    invoke-direct {p0, v0}, Lio/fabric/sdk/android/services/settings/DefaultSettingsJsonTransform;->buildAnalyticsSessionDataFrom(Lorg/json/JSONObject;)Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;

    move-result-object v9

    const-string v0, "beta"

    .line 52
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 51
    invoke-direct {p0, v0}, Lio/fabric/sdk/android/services/settings/DefaultSettingsJsonTransform;->buildBetaSettingsDataFrom(Lorg/json/JSONObject;)Lio/fabric/sdk/android/services/settings/BetaSettingsData;

    move-result-object v10

    int-to-long v0, v12

    .line 54
    invoke-direct {p0, p1, v0, v1, p2}, Lio/fabric/sdk/android/services/settings/DefaultSettingsJsonTransform;->getExpiresAtFrom(Lio/fabric/sdk/android/services/common/CurrentTimeProvider;JLorg/json/JSONObject;)J

    move-result-wide v3

    .line 56
    new-instance p1, Lio/fabric/sdk/android/services/settings/SettingsData;

    move-object v2, p1

    invoke-direct/range {v2 .. v12}, Lio/fabric/sdk/android/services/settings/SettingsData;-><init>(JLio/fabric/sdk/android/services/settings/AppSettingsData;Lio/fabric/sdk/android/services/settings/SessionSettingsData;Lio/fabric/sdk/android/services/settings/PromptSettingsData;Lio/fabric/sdk/android/services/settings/FeaturesSettingsData;Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;Lio/fabric/sdk/android/services/settings/BetaSettingsData;II)V

    return-object p1
.end method

.method public toJson(Lio/fabric/sdk/android/services/settings/SettingsData;)Lorg/json/JSONObject;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 62
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "expires_at"

    iget-wide v2, p1, Lio/fabric/sdk/android/services/settings/SettingsData;->expiresAtMillis:J

    .line 63
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "cache_duration"

    iget v2, p1, Lio/fabric/sdk/android/services/settings/SettingsData;->cacheDuration:I

    .line 64
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "settings_version"

    iget v2, p1, Lio/fabric/sdk/android/services/settings/SettingsData;->settingsVersion:I

    .line 65
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "features"

    iget-object v2, p1, Lio/fabric/sdk/android/services/settings/SettingsData;->featuresData:Lio/fabric/sdk/android/services/settings/FeaturesSettingsData;

    .line 66
    invoke-direct {p0, v2}, Lio/fabric/sdk/android/services/settings/DefaultSettingsJsonTransform;->toFeaturesJson(Lio/fabric/sdk/android/services/settings/FeaturesSettingsData;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "analytics"

    iget-object v2, p1, Lio/fabric/sdk/android/services/settings/SettingsData;->analyticsSettingsData:Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;

    .line 68
    invoke-direct {p0, v2}, Lio/fabric/sdk/android/services/settings/DefaultSettingsJsonTransform;->toAnalyticsJson(Lio/fabric/sdk/android/services/settings/AnalyticsSettingsData;)Lorg/json/JSONObject;

    move-result-object v2

    .line 67
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "beta"

    iget-object v2, p1, Lio/fabric/sdk/android/services/settings/SettingsData;->betaSettingsData:Lio/fabric/sdk/android/services/settings/BetaSettingsData;

    .line 70
    invoke-direct {p0, v2}, Lio/fabric/sdk/android/services/settings/DefaultSettingsJsonTransform;->toBetaJson(Lio/fabric/sdk/android/services/settings/BetaSettingsData;)Lorg/json/JSONObject;

    move-result-object v2

    .line 69
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "app"

    iget-object v2, p1, Lio/fabric/sdk/android/services/settings/SettingsData;->appData:Lio/fabric/sdk/android/services/settings/AppSettingsData;

    .line 71
    invoke-direct {p0, v2}, Lio/fabric/sdk/android/services/settings/DefaultSettingsJsonTransform;->toAppJson(Lio/fabric/sdk/android/services/settings/AppSettingsData;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "session"

    iget-object v2, p1, Lio/fabric/sdk/android/services/settings/SettingsData;->sessionData:Lio/fabric/sdk/android/services/settings/SessionSettingsData;

    .line 72
    invoke-direct {p0, v2}, Lio/fabric/sdk/android/services/settings/DefaultSettingsJsonTransform;->toSessionJson(Lio/fabric/sdk/android/services/settings/SessionSettingsData;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "prompt"

    iget-object p1, p1, Lio/fabric/sdk/android/services/settings/SettingsData;->promptData:Lio/fabric/sdk/android/services/settings/PromptSettingsData;

    .line 73
    invoke-direct {p0, p1}, Lio/fabric/sdk/android/services/settings/DefaultSettingsJsonTransform;->toPromptJson(Lio/fabric/sdk/android/services/settings/PromptSettingsData;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method
