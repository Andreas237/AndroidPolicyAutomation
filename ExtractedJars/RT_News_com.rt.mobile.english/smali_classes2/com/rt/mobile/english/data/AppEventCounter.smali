.class public Lcom/rt/mobile/english/data/AppEventCounter;
.super Ljava/lang/Object;
.source "AppEventCounter.java"


# static fields
.field public static final DAY_MILLIS:J = 0x5265c00L

.field public static final PREFERENCE_APP_LAUNCH_COUNT:Ljava/lang/String; = "pref_app_launch_count"

.field public static final PREFERENCE_ARTICLES_OPEN_COUNT:Ljava/lang/String; = "pref_articles_open_count"

.field public static final PREFERENCE_FIRST_LAUNCH_DATE:Ljava/lang/String; = "pref_first_launch_date_count"

.field public static final PREFERENCE_LAST_ARTICLES_OPEN_COUNT:Ljava/lang/String; = "pref_last_articles_open_count"

.field public static final PREFERENCE_LAST_RATE_APP_VERSION:Ljava/lang/String; = "pref_last_rate_app_version"

.field public static final PREFERENCE_LAST_RATE_DATE:Ljava/lang/String; = "pref_last_rate_date"

.field public static final PREFERENCE_LAST_RATE_STATUS:Ljava/lang/String; = "pref_last_rate_status"

.field public static final RATE_STATUS_DISLIKED:I = 0x3

.field public static final RATE_STATUS_DISLIKED_AND_REVIEWED:I = 0x5

.field public static final RATE_STATUS_IGNORED:I = 0x1

.field public static final RATE_STATUS_LIKED:I = 0x2

.field public static final RATE_STATUS_LIKED_AND_REVIEWED:I = 0x4

.field public static final SHARED_PREFERENCES_NAME:Ljava/lang/String; = "app_event_counter"


# instance fields
.field private sharedPreferences:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "app_event_counter"

    const/4 v1, 0x0

    .line 35
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/data/AppEventCounter;->sharedPreferences:Landroid/content/SharedPreferences;

    return-void
.end method


# virtual methods
.method public appLaunched()V
    .locals 6

    .line 40
    iget-object v0, p0, Lcom/rt/mobile/english/data/AppEventCounter;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "pref_app_launch_count"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    const-wide/16 v2, 0x1

    add-long v4, v0, v2

    .line 41
    iget-object v0, p0, Lcom/rt/mobile/english/data/AppEventCounter;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "pref_app_launch_count"

    invoke-interface {v0, v1, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    cmp-long v1, v4, v2

    if-gtz v1, :cond_0

    const-string v1, "pref_first_launch_date_count"

    .line 44
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 47
    :cond_0
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public articleOpened()V
    .locals 8

    .line 52
    iget-object v0, p0, Lcom/rt/mobile/english/data/AppEventCounter;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "pref_articles_open_count"

    iget-object v2, p0, Lcom/rt/mobile/english/data/AppEventCounter;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v3, "pref_articles_open_count"

    const-wide/16 v4, 0x0

    .line 53
    invoke-interface {v2, v3, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    const-wide/16 v4, 0x1

    add-long v6, v2, v4

    invoke-interface {v0, v1, v6, v7}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 54
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public needShowRate()Z
    .locals 11

    .line 74
    iget-object v0, p0, Lcom/rt/mobile/english/data/AppEventCounter;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "pref_last_rate_date"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    .line 75
    iget-object v4, p0, Lcom/rt/mobile/english/data/AppEventCounter;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v5, "pref_first_launch_date_count"

    invoke-interface {v4, v5, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    .line 76
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long v8, v6, v0

    .line 78
    iget-object v0, p0, Lcom/rt/mobile/english/data/AppEventCounter;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "pref_last_rate_status"

    const/4 v6, 0x0

    invoke-interface {v0, v1, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    packed-switch v0, :pswitch_data_0

    .line 95
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    sub-long v9, v7, v4

    const-wide/32 v4, 0xf731400

    cmp-long v0, v9, v4

    if-lez v0, :cond_3

    iget-object v0, p0, Lcom/rt/mobile/english/data/AppEventCounter;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v4, "pref_app_launch_count"

    .line 96
    invoke-interface {v0, v4, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    const-wide/16 v7, 0x3

    cmp-long v0, v4, v7

    if-ltz v0, :cond_3

    iget-object v0, p0, Lcom/rt/mobile/english/data/AppEventCounter;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v4, "pref_articles_open_count"

    .line 97
    invoke-interface {v0, v4, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    cmp-long v0, v2, v7

    if-ltz v0, :cond_3

    goto :goto_3

    .line 91
    :pswitch_0
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v0

    invoke-virtual {v0}, Lcom/rt/mobile/english/Utils;->getAppVersionCode()I

    move-result v0

    iget-object v2, p0, Lcom/rt/mobile/english/data/AppEventCounter;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v3, "pref_last_rate_app_version"

    invoke-interface {v2, v3, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    if-le v0, v2, :cond_0

    const-wide v2, 0x9a7ec800L

    cmp-long v0, v8, v2

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    move v1, v6

    :goto_0
    return v1

    :pswitch_1
    return v6

    :pswitch_2
    const-wide v2, 0x134fd9000L

    cmp-long v0, v8, v2

    if-lez v0, :cond_1

    goto :goto_1

    :cond_1
    move v1, v6

    :goto_1
    return v1

    :pswitch_3
    const-wide/32 v4, 0x240c8400

    cmp-long v0, v8, v4

    if-lez v0, :cond_2

    .line 84
    iget-object v0, p0, Lcom/rt/mobile/english/data/AppEventCounter;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v4, "pref_articles_open_count"

    .line 85
    invoke-interface {v0, v4, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    iget-object v0, p0, Lcom/rt/mobile/english/data/AppEventCounter;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v7, "pref_last_articles_open_count"

    invoke-interface {v0, v7, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    sub-long v7, v4, v2

    const-wide/16 v2, 0x5

    cmp-long v0, v7, v2

    if-ltz v0, :cond_2

    goto :goto_2

    :cond_2
    move v1, v6

    :goto_2
    return v1

    :cond_3
    move v1, v6

    :goto_3
    return v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public rateAppShowed()V
    .locals 4

    .line 58
    iget-object v0, p0, Lcom/rt/mobile/english/data/AppEventCounter;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "pref_last_rate_status"

    const/4 v2, 0x1

    .line 59
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "pref_last_rate_date"

    .line 60
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "pref_last_rate_app_version"

    .line 61
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v2

    invoke-virtual {v2}, Lcom/rt/mobile/english/Utils;->getAppVersionCode()I

    move-result v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 62
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setLastRateStatus(I)V
    .locals 5

    .line 66
    iget-object v0, p0, Lcom/rt/mobile/english/data/AppEventCounter;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "pref_last_rate_status"

    .line 67
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v0, "pref_last_articles_open_count"

    iget-object v1, p0, Lcom/rt/mobile/english/data/AppEventCounter;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v2, "pref_articles_open_count"

    const-wide/16 v3, 0x0

    .line 68
    invoke-interface {v1, v2, v3, v4}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 69
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
