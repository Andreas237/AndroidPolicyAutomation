.class public Lio/branch/referral/PrefHelper;
.super Ljava/lang/Object;
.source "PrefHelper.java"


# static fields
.field private static BNC_Dev_Debug:Z = false

.field private static Branch_Key:Ljava/lang/String; = null

.field private static final INTERVAL_RETRY:I = 0x3e8

.field private static final KEY_ACTIONS:Ljava/lang/String; = "bnc_actions"

.field private static final KEY_APP_LINK:Ljava/lang/String; = "bnc_app_link"

.field private static final KEY_APP_VERSION:Ljava/lang/String; = "bnc_app_version"

.field private static final KEY_BRANCH_ANALYTICAL_DATA:Ljava/lang/String; = "bnc_branch_analytical_data"

.field private static final KEY_BRANCH_KEY:Ljava/lang/String; = "bnc_branch_key"

.field private static final KEY_BRANCH_VIEW_NUM_OF_USE:Ljava/lang/String; = "bnc_branch_view_use"

.field private static final KEY_BUCKETS:Ljava/lang/String; = "bnc_buckets"

.field private static final KEY_CREDIT_BASE:Ljava/lang/String; = "bnc_credit_base_"

.field private static final KEY_DEVICE_FINGERPRINT_ID:Ljava/lang/String; = "bnc_device_fingerprint_id"

.field private static final KEY_EXTERNAL_INTENT_EXTRA:Ljava/lang/String; = "bnc_external_intent_extra"

.field private static final KEY_EXTERNAL_INTENT_URI:Ljava/lang/String; = "bnc_external_intent_uri"

.field private static final KEY_GOOGLE_PLAY_INSTALL_REFERRER_EXTRA:Ljava/lang/String; = "bnc_google_play_install_referrer_extras"

.field private static final KEY_GOOGLE_SEARCH_INSTALL_IDENTIFIER:Ljava/lang/String; = "bnc_google_search_install_identifier"

.field private static final KEY_IDENTITY:Ljava/lang/String; = "bnc_identity"

.field private static final KEY_IDENTITY_ID:Ljava/lang/String; = "bnc_identity_id"

.field static final KEY_INSTALL_BEGIN_TS:Ljava/lang/String; = "bnc_install_begin_ts"

.field private static final KEY_INSTALL_PARAMS:Ljava/lang/String; = "bnc_install_params"

.field private static final KEY_INSTALL_REFERRER:Ljava/lang/String; = "bnc_install_referrer"

.field private static final KEY_IS_FULL_APP_CONVERSION:Ljava/lang/String; = "bnc_is_full_app_conversion"

.field private static final KEY_IS_REFERRABLE:Ljava/lang/String; = "bnc_is_referrable"

.field private static final KEY_IS_TRIGGERED_BY_FB_APP_LINK:Ljava/lang/String; = "bnc_triggered_by_fb_app_link"

.field static final KEY_LAST_KNOWN_UPDATE_TIME:Ljava/lang/String; = "bnc_last_known_update_time"

.field private static final KEY_LAST_READ_SYSTEM:Ljava/lang/String; = "bnc_system_read_date"

.field private static final KEY_LAST_STRONG_MATCH_TIME:Ljava/lang/String; = "bnc_branch_strong_match_time"

.field private static final KEY_LIMIT_FACEBOOK_TRACKING:Ljava/lang/String; = "bnc_limit_facebook_tracking"

.field private static final KEY_LINK_CLICK_ID:Ljava/lang/String; = "bnc_link_click_id"

.field private static final KEY_LINK_CLICK_IDENTIFIER:Ljava/lang/String; = "bnc_link_click_identifier"

.field static final KEY_ORIGINAL_INSTALL_TIME:Ljava/lang/String; = "bnc_original_install_time"

.field static final KEY_PREVIOUS_UPDATE_TIME:Ljava/lang/String; = "bnc_previous_update_time"

.field private static final KEY_PUSH_IDENTIFIER:Ljava/lang/String; = "bnc_push_identifier"

.field static final KEY_REFERRER_CLICK_TS:Ljava/lang/String; = "bnc_referrer_click_ts"

.field private static final KEY_RETRY_COUNT:Ljava/lang/String; = "bnc_retry_count"

.field private static final KEY_RETRY_INTERVAL:Ljava/lang/String; = "bnc_retry_interval"

.field private static final KEY_SESSION_ID:Ljava/lang/String; = "bnc_session_id"

.field private static final KEY_SESSION_PARAMS:Ljava/lang/String; = "bnc_session_params"

.field private static final KEY_TIMEOUT:Ljava/lang/String; = "bnc_timeout"

.field private static final KEY_TOTAL_BASE:Ljava/lang/String; = "bnc_total_base_"

.field static final KEY_TRACKING_STATE:Ljava/lang/String; = "bnc_tracking_state"

.field private static final KEY_UNIQUE_BASE:Ljava/lang/String; = "bnc_balance_base_"

.field private static final KEY_USER_URL:Ljava/lang/String; = "bnc_user_url"

.field private static final MAX_RETRIES:I = 0x3

.field public static final NO_STRING_VALUE:Ljava/lang/String; = "bnc_no_value"

.field private static final SHARED_PREF_FILE:Ljava/lang/String; = "branch_referral_shared_pref"

.field private static final TIMEOUT:I = 0x157c

.field private static prefHelper_:Lio/branch/referral/PrefHelper;

.field private static savedAnalyticsData_:Lorg/json/JSONObject;


# instance fields
.field private appSharedPrefs_:Landroid/content/SharedPreferences;

.field private context_:Landroid/content/Context;

.field private final installMetadata:Lorg/json/JSONObject;

.field private prefsEditor_:Landroid/content/SharedPreferences$Editor;

.field private final requestMetadata:Lorg/json/JSONObject;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 148
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "branch_referral_shared_pref"

    const/4 v1, 0x0

    .line 149
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lio/branch/referral/PrefHelper;->appSharedPrefs_:Landroid/content/SharedPreferences;

    .line 151
    iget-object v0, p0, Lio/branch/referral/PrefHelper;->appSharedPrefs_:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iput-object v0, p0, Lio/branch/referral/PrefHelper;->prefsEditor_:Landroid/content/SharedPreferences$Editor;

    .line 152
    iput-object p1, p0, Lio/branch/referral/PrefHelper;->context_:Landroid/content/Context;

    .line 153
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    iput-object p1, p0, Lio/branch/referral/PrefHelper;->requestMetadata:Lorg/json/JSONObject;

    .line 154
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    iput-object p1, p0, Lio/branch/referral/PrefHelper;->installMetadata:Lorg/json/JSONObject;

    return-void
.end method

.method public static Debug(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1194
    sget-object v0, Lio/branch/referral/Branch;->isLogging_:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    sget-boolean v0, Lio/branch/referral/PrefHelper;->BNC_Dev_Debug:Z

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, Lio/branch/referral/Branch;->isLogging_:Ljava/lang/Boolean;

    if-eqz v0, :cond_3

    sget-object v0, Lio/branch/referral/Branch;->isLogging_:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_1
    if-eqz p1, :cond_2

    .line 1196
    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_2
    const-string p1, "An error occurred. Unable to print the log message"

    .line 1198
    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    :goto_0
    return-void
.end method

.method private clearPrefOnBranchKeyChange()V
    .locals 5

    .line 1123
    invoke-virtual {p0}, Lio/branch/referral/PrefHelper;->getLinkClickID()Ljava/lang/String;

    move-result-object v0

    .line 1124
    invoke-virtual {p0}, Lio/branch/referral/PrefHelper;->getLinkClickIdentifier()Ljava/lang/String;

    move-result-object v1

    .line 1125
    invoke-virtual {p0}, Lio/branch/referral/PrefHelper;->getAppLink()Ljava/lang/String;

    move-result-object v2

    .line 1126
    invoke-virtual {p0}, Lio/branch/referral/PrefHelper;->getPushIdentifier()Ljava/lang/String;

    move-result-object v3

    .line 1127
    iget-object v4, p0, Lio/branch/referral/PrefHelper;->prefsEditor_:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 1129
    invoke-virtual {p0, v0}, Lio/branch/referral/PrefHelper;->setLinkClickID(Ljava/lang/String;)V

    .line 1130
    invoke-virtual {p0, v1}, Lio/branch/referral/PrefHelper;->setLinkClickIdentifier(Ljava/lang/String;)V

    .line 1131
    invoke-virtual {p0, v2}, Lio/branch/referral/PrefHelper;->setAppLink(Ljava/lang/String;)V

    .line 1132
    invoke-virtual {p0, v3}, Lio/branch/referral/PrefHelper;->setPushIdentifier(Ljava/lang/String;)V

    .line 1133
    sget-object v0, Lio/branch/referral/PrefHelper;->prefHelper_:Lio/branch/referral/PrefHelper;

    iget-object v0, v0, Lio/branch/referral/PrefHelper;->prefsEditor_:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method private deserializeString(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 915
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, ","

    .line 916
    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 917
    invoke-static {v0, p1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    return-object v0
.end method

.method private getActions()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "bnc_actions"

    .line 830
    invoke-virtual {p0, v0}, Lio/branch/referral/PrefHelper;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "bnc_no_value"

    .line 831
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 832
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 834
    :cond_0
    invoke-direct {p0, v0}, Lio/branch/referral/PrefHelper;->deserializeString(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method private getBuckets()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "bnc_buckets"

    .line 752
    invoke-virtual {p0, v0}, Lio/branch/referral/PrefHelper;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "bnc_no_value"

    .line 753
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 754
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 756
    :cond_0
    invoke-direct {p0, v0}, Lio/branch/referral/PrefHelper;->deserializeString(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public static getInstance(Landroid/content/Context;)Lio/branch/referral/PrefHelper;
    .locals 1

    .line 167
    sget-object v0, Lio/branch/referral/PrefHelper;->prefHelper_:Lio/branch/referral/PrefHelper;

    if-nez v0, :cond_0

    .line 168
    new-instance v0, Lio/branch/referral/PrefHelper;

    invoke-direct {v0, p0}, Lio/branch/referral/PrefHelper;-><init>(Landroid/content/Context;)V

    sput-object v0, Lio/branch/referral/PrefHelper;->prefHelper_:Lio/branch/referral/PrefHelper;

    .line 170
    :cond_0
    sget-object p0, Lio/branch/referral/PrefHelper;->prefHelper_:Lio/branch/referral/PrefHelper;

    return-object p0
.end method

.method private serializeArrayList(Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, ""

    .line 907
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 908
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ","

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 910
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, p1, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private setActions(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 839
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "bnc_actions"

    const-string v0, "bnc_no_value"

    .line 840
    invoke-virtual {p0, p1, v0}, Lio/branch/referral/PrefHelper;->setString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v0, "bnc_actions"

    .line 842
    invoke-direct {p0, p1}, Lio/branch/referral/PrefHelper;->serializeArrayList(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lio/branch/referral/PrefHelper;->setString(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private setBuckets(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 761
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "bnc_buckets"

    const-string v0, "bnc_no_value"

    .line 762
    invoke-virtual {p0, p1, v0}, Lio/branch/referral/PrefHelper;->setString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v0, "bnc_buckets"

    .line 764
    invoke-direct {p0, p1}, Lio/branch/referral/PrefHelper;->serializeArrayList(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lio/branch/referral/PrefHelper;->setString(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method


# virtual methods
.method addInstallMetadata(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1178
    :cond_0
    :try_start_0
    iget-object v0, p0, Lio/branch/referral/PrefHelper;->installMetadata:Lorg/json/JSONObject;

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public clearBranchAnalyticsData()V
    .locals 2

    const/4 v0, 0x0

    .line 1071
    sput-object v0, Lio/branch/referral/PrefHelper;->savedAnalyticsData_:Lorg/json/JSONObject;

    const-string v0, "bnc_branch_analytical_data"

    const-string v1, ""

    .line 1072
    invoke-virtual {p0, v0, v1}, Lio/branch/referral/PrefHelper;->setString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public clearIsReferrable()V
    .locals 2

    const-string v0, "bnc_is_referrable"

    const/4 v1, 0x0

    .line 703
    invoke-virtual {p0, v0, v1}, Lio/branch/referral/PrefHelper;->setInteger(Ljava/lang/String;I)V

    return-void
.end method

.method public clearSystemReadStatus()V
    .locals 6

    .line 711
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const-string v1, "bnc_system_read_date"

    .line 712
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    invoke-virtual {p0, v1, v2, v3}, Lio/branch/referral/PrefHelper;->setLong(Ljava/lang/String;J)V

    return-void
.end method

.method public clearUserValues()V
    .locals 3

    .line 735
    invoke-direct {p0}, Lio/branch/referral/PrefHelper;->getBuckets()Ljava/util/ArrayList;

    move-result-object v0

    .line 736
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 737
    invoke-virtual {p0, v1, v2}, Lio/branch/referral/PrefHelper;->setCreditCount(Ljava/lang/String;I)V

    goto :goto_0

    .line 739
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, v0}, Lio/branch/referral/PrefHelper;->setBuckets(Ljava/util/ArrayList;)V

    .line 741
    invoke-direct {p0}, Lio/branch/referral/PrefHelper;->getActions()Ljava/util/ArrayList;

    move-result-object v0

    .line 742
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 743
    invoke-virtual {p0, v1, v2}, Lio/branch/referral/PrefHelper;->setActionTotalCount(Ljava/lang/String;I)V

    .line 744
    invoke-virtual {p0, v1, v2}, Lio/branch/referral/PrefHelper;->setActionUniqueCount(Ljava/lang/String;I)V

    goto :goto_1

    .line 746
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, v0}, Lio/branch/referral/PrefHelper;->setActions(Ljava/util/ArrayList;)V

    return-void
.end method

.method public getAPIBaseUrl()Ljava/lang/String;
    .locals 1

    const-string v0, "https://api.branch.io/"

    return-object v0
.end method

.method public getActionTotalCount(Ljava/lang/String;)I
    .locals 2

    .line 887
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "bnc_total_base_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/branch/referral/PrefHelper;->getInteger(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public getActionUniqueCount(Ljava/lang/String;)I
    .locals 2

    .line 900
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "bnc_balance_base_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/branch/referral/PrefHelper;->getInteger(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public getAppLink()Ljava/lang/String;
    .locals 1

    const-string v0, "bnc_app_link"

    .line 564
    invoke-virtual {p0, v0}, Lio/branch/referral/PrefHelper;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAppVersion()Ljava/lang/String;
    .locals 1

    const-string v0, "bnc_app_version"

    .line 264
    invoke-virtual {p0, v0}, Lio/branch/referral/PrefHelper;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getBool(Ljava/lang/String;)Z
    .locals 2

    .line 982
    sget-object v0, Lio/branch/referral/PrefHelper;->prefHelper_:Lio/branch/referral/PrefHelper;

    iget-object v0, v0, Lio/branch/referral/PrefHelper;->appSharedPrefs_:Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public getBranchAnalyticsData()Lorg/json/JSONObject;
    .locals 3

    .line 1054
    sget-object v0, Lio/branch/referral/PrefHelper;->savedAnalyticsData_:Lorg/json/JSONObject;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "bnc_branch_analytical_data"

    .line 1057
    invoke-virtual {p0, v0}, Lio/branch/referral/PrefHelper;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1058
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 1059
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "bnc_no_value"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 1061
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v2

    goto :goto_0

    :catch_0
    :cond_1
    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public getBranchKey()Ljava/lang/String;
    .locals 1

    .line 286
    sget-object v0, Lio/branch/referral/PrefHelper;->Branch_Key:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "bnc_branch_key"

    .line 287
    invoke-virtual {p0, v0}, Lio/branch/referral/PrefHelper;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/branch/referral/PrefHelper;->Branch_Key:Ljava/lang/String;

    .line 289
    :cond_0
    sget-object v0, Lio/branch/referral/PrefHelper;->Branch_Key:Ljava/lang/String;

    return-object v0
.end method

.method public getBranchViewUsageCount(Ljava/lang/String;)I
    .locals 2

    .line 1047
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "bnc_branch_view_use_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    .line 1048
    invoke-virtual {p0, p1, v0}, Lio/branch/referral/PrefHelper;->getInteger(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public getCreditCount()I
    .locals 1

    .line 812
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->DefaultBucket:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/branch/referral/PrefHelper;->getCreditCount(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public getCreditCount(Ljava/lang/String;)I
    .locals 2

    .line 824
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "bnc_credit_base_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/branch/referral/PrefHelper;->getInteger(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public getDeviceFingerPrintID()Ljava/lang/String;
    .locals 1

    const-string v0, "bnc_device_fingerprint_id"

    .line 342
    invoke-virtual {p0, v0}, Lio/branch/referral/PrefHelper;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getExternDebug()Z
    .locals 1

    .line 1149
    sget-boolean v0, Lio/branch/referral/PrefHelper;->BNC_Dev_Debug:Z

    return v0
.end method

.method public getExternalIntentExtra()Ljava/lang/String;
    .locals 1

    const-string v0, "bnc_external_intent_extra"

    .line 489
    invoke-virtual {p0, v0}, Lio/branch/referral/PrefHelper;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getExternalIntentUri()Ljava/lang/String;
    .locals 1

    const-string v0, "bnc_external_intent_uri"

    .line 470
    invoke-virtual {p0, v0}, Lio/branch/referral/PrefHelper;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getFloat(Ljava/lang/String;)F
    .locals 2

    .line 962
    sget-object v0, Lio/branch/referral/PrefHelper;->prefHelper_:Lio/branch/referral/PrefHelper;

    iget-object v0, v0, Lio/branch/referral/PrefHelper;->appSharedPrefs_:Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result p1

    return p1
.end method

.method public getGooglePlayReferrer()Ljava/lang/String;
    .locals 1

    const-string v0, "bnc_google_play_install_referrer_extras"

    .line 545
    invoke-virtual {p0, v0}, Lio/branch/referral/PrefHelper;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getGoogleSearchInstallIdentifier()Ljava/lang/String;
    .locals 1

    const-string v0, "bnc_google_search_install_identifier"

    .line 527
    invoke-virtual {p0, v0}, Lio/branch/referral/PrefHelper;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getIdentity()Ljava/lang/String;
    .locals 1

    const-string v0, "bnc_identity"

    .line 414
    invoke-virtual {p0, v0}, Lio/branch/referral/PrefHelper;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getIdentityID()Ljava/lang/String;
    .locals 1

    const-string v0, "bnc_identity_id"

    .line 387
    invoke-virtual {p0, v0}, Lio/branch/referral/PrefHelper;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getInstallMetadata()Lorg/json/JSONObject;
    .locals 1

    .line 1184
    iget-object v0, p0, Lio/branch/referral/PrefHelper;->installMetadata:Lorg/json/JSONObject;

    return-object v0
.end method

.method public getInstallParams()Ljava/lang/String;
    .locals 1

    const-string v0, "bnc_install_params"

    .line 633
    invoke-virtual {p0, v0}, Lio/branch/referral/PrefHelper;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getInstallReferrerParams()Ljava/lang/String;
    .locals 1

    const-string v0, "bnc_install_referrer"

    .line 651
    invoke-virtual {p0, v0}, Lio/branch/referral/PrefHelper;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getInteger(Ljava/lang/String;)I
    .locals 1

    const/4 v0, 0x0

    .line 928
    invoke-virtual {p0, p1, v0}, Lio/branch/referral/PrefHelper;->getInteger(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public getInteger(Ljava/lang/String;I)I
    .locals 1

    .line 942
    sget-object v0, Lio/branch/referral/PrefHelper;->prefHelper_:Lio/branch/referral/PrefHelper;

    iget-object v0, v0, Lio/branch/referral/PrefHelper;->appSharedPrefs_:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public getIsAppLinkTriggeredInit()Z
    .locals 1

    const-string v0, "bnc_triggered_by_fb_app_link"

    .line 452
    invoke-virtual {p0, v0}, Lio/branch/referral/PrefHelper;->getBool(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public getIsReferrable()I
    .locals 1

    const-string v0, "bnc_is_referrable"

    .line 680
    invoke-virtual {p0, v0}, Lio/branch/referral/PrefHelper;->getInteger(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public getLastStrongMatchTime()J
    .locals 2

    const-string v0, "bnc_branch_strong_match_time"

    .line 1113
    invoke-virtual {p0, v0}, Lio/branch/referral/PrefHelper;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public getLinkClickID()Ljava/lang/String;
    .locals 1

    const-string v0, "bnc_link_click_id"

    .line 434
    invoke-virtual {p0, v0}, Lio/branch/referral/PrefHelper;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getLinkClickIdentifier()Ljava/lang/String;
    .locals 1

    const-string v0, "bnc_link_click_identifier"

    .line 509
    invoke-virtual {p0, v0}, Lio/branch/referral/PrefHelper;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getLong(Ljava/lang/String;)J
    .locals 3

    .line 952
    sget-object v0, Lio/branch/referral/PrefHelper;->prefHelper_:Lio/branch/referral/PrefHelper;

    iget-object v0, v0, Lio/branch/referral/PrefHelper;->appSharedPrefs_:Landroid/content/SharedPreferences;

    const-wide/16 v1, 0x0

    invoke-interface {v0, p1, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getPushIdentifier()Ljava/lang/String;
    .locals 1

    const-string v0, "bnc_push_identifier"

    .line 601
    invoke-virtual {p0, v0}, Lio/branch/referral/PrefHelper;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getRequestMetadata()Lorg/json/JSONObject;
    .locals 1

    .line 1170
    iget-object v0, p0, Lio/branch/referral/PrefHelper;->requestMetadata:Lorg/json/JSONObject;

    return-object v0
.end method

.method public getRetryCount()I
    .locals 2

    const-string v0, "bnc_retry_count"

    const/4 v1, 0x3

    .line 224
    invoke-virtual {p0, v0, v1}, Lio/branch/referral/PrefHelper;->getInteger(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getRetryInterval()I
    .locals 2

    const-string v0, "bnc_retry_interval"

    const/16 v1, 0x3e8

    .line 246
    invoke-virtual {p0, v0, v1}, Lio/branch/referral/PrefHelper;->getInteger(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getSessionID()Ljava/lang/String;
    .locals 1

    const-string v0, "bnc_session_id"

    .line 362
    invoke-virtual {p0, v0}, Lio/branch/referral/PrefHelper;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSessionParams()Ljava/lang/String;
    .locals 1

    const-string v0, "bnc_session_params"

    .line 613
    invoke-virtual {p0, v0}, Lio/branch/referral/PrefHelper;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getString(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 972
    sget-object v0, Lio/branch/referral/PrefHelper;->prefHelper_:Lio/branch/referral/PrefHelper;

    iget-object v0, v0, Lio/branch/referral/PrefHelper;->appSharedPrefs_:Landroid/content/SharedPreferences;

    const-string v1, "bnc_no_value"

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getTimeout()I
    .locals 2

    const-string v0, "bnc_timeout"

    const/16 v1, 0x157c

    .line 201
    invoke-virtual {p0, v0, v1}, Lio/branch/referral/PrefHelper;->getInteger(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getUserURL()Ljava/lang/String;
    .locals 1

    const-string v0, "bnc_user_url"

    .line 669
    invoke-virtual {p0, v0}, Lio/branch/referral/PrefHelper;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method isAppTrackingLimited()Z
    .locals 1

    const-string v0, "bnc_limit_facebook_tracking"

    .line 727
    invoke-virtual {p0, v0}, Lio/branch/referral/PrefHelper;->getBool(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public isFullAppConversion()Z
    .locals 1

    const-string v0, "bnc_is_full_app_conversion"

    .line 583
    invoke-virtual {p0, v0}, Lio/branch/referral/PrefHelper;->getBool(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public readBranchKey(Z)Ljava/lang/String;
    .locals 5

    if-eqz p1, :cond_0

    const-string v0, "io.branch.sdk.BranchKey"

    goto :goto_0

    :cond_0
    const-string v0, "io.branch.sdk.BranchKey.test"

    :goto_0
    if-nez p1, :cond_1

    .line 296
    invoke-virtual {p0}, Lio/branch/referral/PrefHelper;->setExternDebug()V

    :cond_1
    const/4 v1, 0x0

    .line 300
    :try_start_0
    iget-object v2, p0, Lio/branch/referral/PrefHelper;->context_:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    iget-object v3, p0, Lio/branch/referral/PrefHelper;->context_:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x80

    invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    .line 301
    iget-object v3, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz v3, :cond_2

    .line 302
    iget-object v3, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    if-nez p1, :cond_2

    .line 304
    iget-object p1, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v2, "io.branch.sdk.BranchKey"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 311
    :catch_0
    :cond_2
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 313
    :try_start_1
    iget-object p1, p0, Lio/branch/referral/PrefHelper;->context_:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const-string/jumbo v2, "string"

    .line 314
    iget-object v3, p0, Lio/branch/referral/PrefHelper;->context_:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v0, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_3
    if-nez v1, :cond_4

    const-string v1, "bnc_no_value"

    :cond_4
    return-object v1
.end method

.method public saveBranchAnalyticsData(Lorg/json/JSONObject;)V
    .locals 3

    .line 1077
    invoke-virtual {p0}, Lio/branch/referral/PrefHelper;->getSessionID()Ljava/lang/String;

    move-result-object v0

    const-string v1, "bnc_no_value"

    .line 1078
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 1079
    sget-object v1, Lio/branch/referral/PrefHelper;->savedAnalyticsData_:Lorg/json/JSONObject;

    if-nez v1, :cond_0

    .line 1080
    invoke-virtual {p0}, Lio/branch/referral/PrefHelper;->getBranchAnalyticsData()Lorg/json/JSONObject;

    move-result-object v1

    sput-object v1, Lio/branch/referral/PrefHelper;->savedAnalyticsData_:Lorg/json/JSONObject;

    .line 1084
    :cond_0
    :try_start_0
    sget-object v1, Lio/branch/referral/PrefHelper;->savedAnalyticsData_:Lorg/json/JSONObject;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1085
    sget-object v1, Lio/branch/referral/PrefHelper;->savedAnalyticsData_:Lorg/json/JSONObject;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    goto :goto_0

    .line 1088
    :cond_1
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 1089
    sget-object v2, Lio/branch/referral/PrefHelper;->savedAnalyticsData_:Lorg/json/JSONObject;

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-object v0, v1

    .line 1091
    :goto_0
    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    const-string p1, "bnc_branch_analytical_data"

    .line 1092
    sget-object v0, Lio/branch/referral/PrefHelper;->savedAnalyticsData_:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/branch/referral/PrefHelper;->setString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    return-void
.end method

.method public saveLastStrongMatchTime(J)V
    .locals 1

    const-string v0, "bnc_branch_strong_match_time"

    .line 1104
    invoke-virtual {p0, v0, p1, p2}, Lio/branch/referral/PrefHelper;->setLong(Ljava/lang/String;J)V

    return-void
.end method

.method public setActionTotalCount(Ljava/lang/String;I)V
    .locals 2

    .line 856
    invoke-direct {p0}, Lio/branch/referral/PrefHelper;->getActions()Ljava/util/ArrayList;

    move-result-object v0

    .line 857
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 858
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 859
    invoke-direct {p0, v0}, Lio/branch/referral/PrefHelper;->setActions(Ljava/util/ArrayList;)V

    .line 861
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "bnc_total_base_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lio/branch/referral/PrefHelper;->setInteger(Ljava/lang/String;I)V

    return-void
.end method

.method public setActionUniqueCount(Ljava/lang/String;I)V
    .locals 2

    .line 874
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "bnc_balance_base_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lio/branch/referral/PrefHelper;->setInteger(Ljava/lang/String;I)V

    return-void
.end method

.method public setAppLink(Ljava/lang/String;)V
    .locals 1

    const-string v0, "bnc_app_link"

    .line 555
    invoke-virtual {p0, v0, p1}, Lio/branch/referral/PrefHelper;->setString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setAppVersion(Ljava/lang/String;)V
    .locals 1

    const-string v0, "bnc_app_version"

    .line 255
    invoke-virtual {p0, v0, p1}, Lio/branch/referral/PrefHelper;->setString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setBool(Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 1

    .line 1036
    sget-object v0, Lio/branch/referral/PrefHelper;->prefHelper_:Lio/branch/referral/PrefHelper;

    iget-object v0, v0, Lio/branch/referral/PrefHelper;->prefsEditor_:Landroid/content/SharedPreferences$Editor;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 1037
    sget-object p1, Lio/branch/referral/PrefHelper;->prefHelper_:Lio/branch/referral/PrefHelper;

    iget-object p1, p1, Lio/branch/referral/PrefHelper;->prefsEditor_:Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setBranchKey(Ljava/lang/String;)Z
    .locals 1

    .line 274
    sput-object p1, Lio/branch/referral/PrefHelper;->Branch_Key:Ljava/lang/String;

    const-string v0, "bnc_branch_key"

    .line 275
    invoke-virtual {p0, v0}, Lio/branch/referral/PrefHelper;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz p1, :cond_1

    if-eqz v0, :cond_1

    .line 276
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    .line 277
    :cond_1
    :goto_0
    invoke-direct {p0}, Lio/branch/referral/PrefHelper;->clearPrefOnBranchKeyChange()V

    const-string v0, "bnc_branch_key"

    .line 278
    invoke-virtual {p0, v0, p1}, Lio/branch/referral/PrefHelper;->setString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public setCreditCount(I)V
    .locals 1

    .line 780
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->DefaultBucket:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lio/branch/referral/PrefHelper;->setCreditCount(Ljava/lang/String;I)V

    return-void
.end method

.method public setCreditCount(Ljava/lang/String;I)V
    .locals 2

    .line 796
    invoke-direct {p0}, Lio/branch/referral/PrefHelper;->getBuckets()Ljava/util/ArrayList;

    move-result-object v0

    .line 797
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 798
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 799
    invoke-direct {p0, v0}, Lio/branch/referral/PrefHelper;->setBuckets(Ljava/util/ArrayList;)V

    .line 801
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "bnc_credit_base_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lio/branch/referral/PrefHelper;->setInteger(Ljava/lang/String;I)V

    return-void
.end method

.method public setDeviceFingerPrintID(Ljava/lang/String;)V
    .locals 1

    const-string v0, "bnc_device_fingerprint_id"

    .line 332
    invoke-virtual {p0, v0, p1}, Lio/branch/referral/PrefHelper;->setString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setExternDebug()V
    .locals 1

    const/4 v0, 0x1

    .line 1140
    sput-boolean v0, Lio/branch/referral/PrefHelper;->BNC_Dev_Debug:Z

    return-void
.end method

.method public setExternalIntentExtra(Ljava/lang/String;)V
    .locals 1

    const-string v0, "bnc_external_intent_extra"

    .line 480
    invoke-virtual {p0, v0, p1}, Lio/branch/referral/PrefHelper;->setString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setExternalIntentUri(Ljava/lang/String;)V
    .locals 1

    const-string v0, "bnc_external_intent_uri"

    .line 461
    invoke-virtual {p0, v0, p1}, Lio/branch/referral/PrefHelper;->setString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setFloat(Ljava/lang/String;F)V
    .locals 1

    .line 1014
    sget-object v0, Lio/branch/referral/PrefHelper;->prefHelper_:Lio/branch/referral/PrefHelper;

    iget-object v0, v0, Lio/branch/referral/PrefHelper;->prefsEditor_:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    .line 1015
    sget-object p1, Lio/branch/referral/PrefHelper;->prefHelper_:Lio/branch/referral/PrefHelper;

    iget-object p1, p1, Lio/branch/referral/PrefHelper;->prefsEditor_:Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setGooglePlayReferrer(Ljava/lang/String;)V
    .locals 1

    const-string v0, "bnc_google_play_install_referrer_extras"

    .line 536
    invoke-virtual {p0, v0, p1}, Lio/branch/referral/PrefHelper;->setString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setGoogleSearchInstallIdentifier(Ljava/lang/String;)V
    .locals 1

    const-string v0, "bnc_google_search_install_identifier"

    .line 518
    invoke-virtual {p0, v0, p1}, Lio/branch/referral/PrefHelper;->setString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setIdentity(Ljava/lang/String;)V
    .locals 1

    const-string v0, "bnc_identity"

    .line 402
    invoke-virtual {p0, v0, p1}, Lio/branch/referral/PrefHelper;->setString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setIdentityID(Ljava/lang/String;)V
    .locals 1

    const-string v0, "bnc_identity_id"

    .line 377
    invoke-virtual {p0, v0, p1}, Lio/branch/referral/PrefHelper;->setString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setInstallParams(Ljava/lang/String;)V
    .locals 1

    const-string v0, "bnc_install_params"

    .line 643
    invoke-virtual {p0, v0, p1}, Lio/branch/referral/PrefHelper;->setString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setInstallReferrerParams(Ljava/lang/String;)V
    .locals 1

    const-string v0, "bnc_install_referrer"

    .line 647
    invoke-virtual {p0, v0, p1}, Lio/branch/referral/PrefHelper;->setString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setInteger(Ljava/lang/String;I)V
    .locals 1

    .line 992
    sget-object v0, Lio/branch/referral/PrefHelper;->prefHelper_:Lio/branch/referral/PrefHelper;

    iget-object v0, v0, Lio/branch/referral/PrefHelper;->prefsEditor_:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 993
    sget-object p1, Lio/branch/referral/PrefHelper;->prefHelper_:Lio/branch/referral/PrefHelper;

    iget-object p1, p1, Lio/branch/referral/PrefHelper;->prefsEditor_:Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setIsAppLinkTriggeredInit(Ljava/lang/Boolean;)V
    .locals 1

    const-string v0, "bnc_triggered_by_fb_app_link"

    .line 443
    invoke-virtual {p0, v0, p1}, Lio/branch/referral/PrefHelper;->setBool(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method

.method public setIsFullAppConversion(Z)V
    .locals 1

    const-string v0, "bnc_is_full_app_conversion"

    .line 574
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lio/branch/referral/PrefHelper;->setBool(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method

.method public setIsReferrable()V
    .locals 2

    const-string v0, "bnc_is_referrable"

    const/4 v1, 0x1

    .line 691
    invoke-virtual {p0, v0, v1}, Lio/branch/referral/PrefHelper;->setInteger(Ljava/lang/String;I)V

    return-void
.end method

.method setLimitFacebookTracking(Z)V
    .locals 1

    const-string v0, "bnc_limit_facebook_tracking"

    .line 720
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lio/branch/referral/PrefHelper;->setBool(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method

.method public setLinkClickID(Ljava/lang/String;)V
    .locals 1

    const-string v0, "bnc_link_click_id"

    .line 424
    invoke-virtual {p0, v0, p1}, Lio/branch/referral/PrefHelper;->setString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setLinkClickIdentifier(Ljava/lang/String;)V
    .locals 1

    const-string v0, "bnc_link_click_identifier"

    .line 499
    invoke-virtual {p0, v0, p1}, Lio/branch/referral/PrefHelper;->setString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setLong(Ljava/lang/String;J)V
    .locals 1

    .line 1003
    sget-object v0, Lio/branch/referral/PrefHelper;->prefHelper_:Lio/branch/referral/PrefHelper;

    iget-object v0, v0, Lio/branch/referral/PrefHelper;->prefsEditor_:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0, p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 1004
    sget-object p1, Lio/branch/referral/PrefHelper;->prefHelper_:Lio/branch/referral/PrefHelper;

    iget-object p1, p1, Lio/branch/referral/PrefHelper;->prefsEditor_:Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setPushIdentifier(Ljava/lang/String;)V
    .locals 1

    const-string v0, "bnc_push_identifier"

    .line 592
    invoke-virtual {p0, v0, p1}, Lio/branch/referral/PrefHelper;->setString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setRequestMetadata(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    if-nez p1, :cond_0

    return-void

    .line 1158
    :cond_0
    iget-object v0, p0, Lio/branch/referral/PrefHelper;->requestMetadata:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p2, :cond_1

    .line 1159
    iget-object v0, p0, Lio/branch/referral/PrefHelper;->requestMetadata:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 1163
    :cond_1
    :try_start_0
    iget-object v0, p0, Lio/branch/referral/PrefHelper;->requestMetadata:Lorg/json/JSONObject;

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public setRetryCount(I)V
    .locals 1

    const-string v0, "bnc_retry_count"

    .line 214
    invoke-virtual {p0, v0, p1}, Lio/branch/referral/PrefHelper;->setInteger(Ljava/lang/String;I)V

    return-void
.end method

.method public setRetryInterval(I)V
    .locals 1

    const-string v0, "bnc_retry_interval"

    .line 235
    invoke-virtual {p0, v0, p1}, Lio/branch/referral/PrefHelper;->setInteger(Ljava/lang/String;I)V

    return-void
.end method

.method public setSessionID(Ljava/lang/String;)V
    .locals 1

    const-string v0, "bnc_session_id"

    .line 352
    invoke-virtual {p0, v0, p1}, Lio/branch/referral/PrefHelper;->setString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setSessionParams(Ljava/lang/String;)V
    .locals 1

    const-string v0, "bnc_session_params"

    .line 623
    invoke-virtual {p0, v0, p1}, Lio/branch/referral/PrefHelper;->setString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setString(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1025
    sget-object v0, Lio/branch/referral/PrefHelper;->prefHelper_:Lio/branch/referral/PrefHelper;

    iget-object v0, v0, Lio/branch/referral/PrefHelper;->prefsEditor_:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1026
    sget-object p1, Lio/branch/referral/PrefHelper;->prefHelper_:Lio/branch/referral/PrefHelper;

    iget-object p1, p1, Lio/branch/referral/PrefHelper;->prefsEditor_:Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public setTimeout(I)V
    .locals 1

    const-string v0, "bnc_timeout"

    .line 189
    invoke-virtual {p0, v0, p1}, Lio/branch/referral/PrefHelper;->setInteger(Ljava/lang/String;I)V

    return-void
.end method

.method public setUserURL(Ljava/lang/String;)V
    .locals 1

    const-string v0, "bnc_user_url"

    .line 660
    invoke-virtual {p0, v0, p1}, Lio/branch/referral/PrefHelper;->setString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public updateBranchViewUsageCount(Ljava/lang/String;)V
    .locals 2

    .line 1041
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "bnc_branch_view_use_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1042
    invoke-virtual {p0, p1}, Lio/branch/referral/PrefHelper;->getBranchViewUsageCount(Ljava/lang/String;)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    .line 1043
    invoke-virtual {p0, v0, p1}, Lio/branch/referral/PrefHelper;->setInteger(Ljava/lang/String;I)V

    return-void
.end method
