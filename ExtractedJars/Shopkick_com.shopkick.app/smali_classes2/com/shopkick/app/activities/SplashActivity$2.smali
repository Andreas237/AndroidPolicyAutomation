.class Lcom/shopkick/app/activities/SplashActivity$2;
.super Ljava/lang/Object;
.source "SplashActivity.java"

# interfaces
.implements Lio/branch/referral/Branch$BranchReferralInitListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/activities/SplashActivity;->handleOnStart()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/activities/SplashActivity;


# direct methods
.method constructor <init>(Lcom/shopkick/app/activities/SplashActivity;)V
    .locals 0

    .line 161
    iput-object p1, p0, Lcom/shopkick/app/activities/SplashActivity$2;->this$0:Lcom/shopkick/app/activities/SplashActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInitFinished(Lorg/json/JSONObject;Lio/branch/referral/BranchError;)V
    .locals 6

    if-nez p2, :cond_2

    if-eqz p1, :cond_2

    :try_start_0
    const-string/jumbo p2, "sk_wr_id"

    .line 170
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string/jumbo p2, "sk_wr_id"

    .line 172
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 173
    invoke-static {p2}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 174
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity$2;->this$0:Lcom/shopkick/app/activities/SplashActivity;

    invoke-static {v0}, Lcom/shopkick/app/activities/SplashActivity;->access$200(Lcom/shopkick/app/activities/SplashActivity;)Lcom/shopkick/app/application/AppPreferences;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/shopkick/app/application/AppPreferences;->setWebRegistrationId(Ljava/lang/String;)V

    :cond_0
    const-string p2, "promo_code"

    .line 178
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    const-string p2, "promo_code"

    .line 179
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 180
    invoke-static {p1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 181
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v0, 0xaae67

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 182
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity$2;->this$0:Lcom/shopkick/app/activities/SplashActivity;

    iget-object v0, v0, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    if-eqz v0, :cond_1

    .line 183
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity$2;->this$0:Lcom/shopkick/app/activities/SplashActivity;

    iget-object v0, v0, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setUserId(Ljava/lang/String;)V

    .line 185
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity$2;->this$0:Lcom/shopkick/app/activities/SplashActivity;

    iget-object v0, v0, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    .line 186
    iget-object p2, p0, Lcom/shopkick/app/activities/SplashActivity$2;->this$0:Lcom/shopkick/app/activities/SplashActivity;

    invoke-static {p2}, Lcom/shopkick/app/activities/SplashActivity;->access$200(Lcom/shopkick/app/activities/SplashActivity;)Lcom/shopkick/app/application/AppPreferences;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/shopkick/app/application/AppPreferences;->setReferralPromoCode(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    move-object v3, p1

    .line 191
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object p1, Lcom/shopkick/logging/Area;->APP_LAUNCH:Lcom/shopkick/logging/Area;

    invoke-virtual {p1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide p1

    sget-object v1, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    .line 192
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    or-long/2addr v1, p1

    const-string v4, "Error in branch json object parsing"

    const/4 p1, 0x0

    new-array v5, p1, [Ljava/lang/Object;

    .line 191
    invoke-virtual/range {v0 .. v5}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/activities/SplashActivity$2;->this$0:Lcom/shopkick/app/activities/SplashActivity;

    iget-object p1, p1, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "notification center cannot be null."

    invoke-static {p1, p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    iget-object p1, p0, Lcom/shopkick/app/activities/SplashActivity$2;->this$0:Lcom/shopkick/app/activities/SplashActivity;

    iget-object p1, p1, Lcom/shopkick/app/activities/SplashActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "BRANCH_CALLBACK_FINISHED"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    return-void
.end method
