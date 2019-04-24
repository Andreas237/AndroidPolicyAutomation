.class Lio/branch/referral/ServerRequestRegisterInstall;
.super Lio/branch/referral/ServerRequestInitSession;
.source "ServerRequestRegisterInstall.java"


# instance fields
.field callback_:Lio/branch/referral/Branch$BranchReferralInitListener;


# direct methods
.method constructor <init>(Landroid/content/Context;Lio/branch/referral/Branch$BranchReferralInitListener;Lio/branch/referral/SystemObserver;Ljava/lang/String;)V
    .locals 1

    .line 29
    sget-object v0, Lio/branch/referral/Defines$RequestPath;->RegisterInstall:Lio/branch/referral/Defines$RequestPath;

    invoke-virtual {v0}, Lio/branch/referral/Defines$RequestPath;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0, p3}, Lio/branch/referral/ServerRequestInitSession;-><init>(Landroid/content/Context;Ljava/lang/String;Lio/branch/referral/SystemObserver;)V

    .line 30
    iput-object p2, p0, Lio/branch/referral/ServerRequestRegisterInstall;->callback_:Lio/branch/referral/Branch$BranchReferralInitListener;

    .line 31
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string p2, "bnc_no_value"

    .line 33
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 34
    sget-object p2, Lio/branch/referral/Defines$Jsonkey;->LinkClickID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 36
    :cond_0
    invoke-virtual {p0, p1}, Lio/branch/referral/ServerRequestRegisterInstall;->setPost(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 38
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    const/4 p1, 0x1

    .line 39
    iput-boolean p1, p0, Lio/branch/referral/ServerRequestRegisterInstall;->constructError_:Z

    :goto_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/json/JSONObject;Landroid/content/Context;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1, p2, p3}, Lio/branch/referral/ServerRequestInitSession;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public clearCallbacks()V
    .locals 1

    const/4 v0, 0x0

    .line 155
    iput-object v0, p0, Lio/branch/referral/ServerRequestRegisterInstall;->callback_:Lio/branch/referral/Branch$BranchReferralInitListener;

    return-void
.end method

.method public getRequestActionName()Ljava/lang/String;
    .locals 1

    const-string v0, "install"

    return-object v0
.end method

.method public handleErrors(Landroid/content/Context;)Z
    .locals 4

    .line 139
    invoke-super {p0, p1}, Lio/branch/referral/ServerRequestInitSession;->doesAppHasInternetPermission(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 140
    iget-object p1, p0, Lio/branch/referral/ServerRequestRegisterInstall;->callback_:Lio/branch/referral/Branch$BranchReferralInitListener;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 141
    new-instance v1, Lio/branch/referral/BranchError;

    const-string v2, "Trouble initializing Branch."

    const/16 v3, -0x66

    invoke-direct {v1, v2, v3}, Lio/branch/referral/BranchError;-><init>(Ljava/lang/String;I)V

    invoke-interface {p1, v0, v1}, Lio/branch/referral/Branch$BranchReferralInitListener;->onInitFinished(Lorg/json/JSONObject;Lio/branch/referral/BranchError;)V

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public handleFailure(ILjava/lang/String;)V
    .locals 5

    .line 126
    iget-object v0, p0, Lio/branch/referral/ServerRequestRegisterInstall;->callback_:Lio/branch/referral/Branch$BranchReferralInitListener;

    if-eqz v0, :cond_0

    .line 127
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "error_message"

    const-string v2, "Trouble reaching server. Please try again in a few minutes"

    .line 129
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 131
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    .line 133
    :goto_0
    iget-object v1, p0, Lio/branch/referral/ServerRequestRegisterInstall;->callback_:Lio/branch/referral/Branch$BranchReferralInitListener;

    new-instance v2, Lio/branch/referral/BranchError;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Trouble initializing Branch. "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v2, p2, p1}, Lio/branch/referral/BranchError;-><init>(Ljava/lang/String;I)V

    invoke-interface {v1, v0, v2}, Lio/branch/referral/Branch$BranchReferralInitListener;->onInitFinished(Lorg/json/JSONObject;Lio/branch/referral/BranchError;)V

    :cond_0
    return-void
.end method

.method public hasCallBack()Z
    .locals 1

    .line 66
    iget-object v0, p0, Lio/branch/referral/ServerRequestRegisterInstall;->callback_:Lio/branch/referral/Branch$BranchReferralInitListener;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isGetRequest()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onPreExecute()V
    .locals 8

    .line 49
    invoke-super {p0}, Lio/branch/referral/ServerRequestInitSession;->onPreExecute()V

    .line 50
    iget-object v0, p0, Lio/branch/referral/ServerRequestRegisterInstall;->prefHelper_:Lio/branch/referral/PrefHelper;

    const-string v1, "bnc_referrer_click_ts"

    invoke-virtual {v0, v1}, Lio/branch/referral/PrefHelper;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    .line 51
    iget-object v2, p0, Lio/branch/referral/ServerRequestRegisterInstall;->prefHelper_:Lio/branch/referral/PrefHelper;

    const-string v3, "bnc_install_begin_ts"

    invoke-virtual {v2, v3}, Lio/branch/referral/PrefHelper;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v6, v0, v4

    if-lez v6, :cond_0

    .line 54
    :try_start_0
    invoke-virtual {p0}, Lio/branch/referral/ServerRequestRegisterInstall;->getPost()Lorg/json/JSONObject;

    move-result-object v6

    sget-object v7, Lio/branch/referral/Defines$Jsonkey;->ClickedReferrerTimeStamp:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v7}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    :cond_0
    cmp-long v0, v2, v4

    if-lez v0, :cond_1

    .line 57
    invoke-virtual {p0}, Lio/branch/referral/ServerRequestRegisterInstall;->getPost()Lorg/json/JSONObject;

    move-result-object v0

    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->InstallBeginTimeStamp:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    return-void
.end method

.method public onRequestSucceeded(Lio/branch/referral/ServerResponse;Lio/branch/referral/Branch;)V
    .locals 3

    .line 71
    invoke-super {p0, p1, p2}, Lio/branch/referral/ServerRequestInitSession;->onRequestSucceeded(Lio/branch/referral/ServerResponse;Lio/branch/referral/Branch;)V

    .line 73
    :try_start_0
    iget-object v0, p0, Lio/branch/referral/ServerRequestRegisterInstall;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {p1}, Lio/branch/referral/ServerResponse;->getObject()Lorg/json/JSONObject;

    move-result-object v1

    sget-object v2, Lio/branch/referral/Defines$Jsonkey;->Link:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/branch/referral/PrefHelper;->setUserURL(Ljava/lang/String;)V

    .line 75
    invoke-virtual {p1}, Lio/branch/referral/ServerResponse;->getObject()Lorg/json/JSONObject;

    move-result-object v0

    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->Data:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 76
    new-instance v0, Lorg/json/JSONObject;

    invoke-virtual {p1}, Lio/branch/referral/ServerResponse;->getObject()Lorg/json/JSONObject;

    move-result-object v1

    sget-object v2, Lio/branch/referral/Defines$Jsonkey;->Data:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 78
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->Clicked_Branch_Link:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->Clicked_Branch_Link:Lio/branch/referral/Defines$Jsonkey;

    .line 79
    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 83
    iget-object v0, p0, Lio/branch/referral/ServerRequestRegisterInstall;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getInstallParams()Ljava/lang/String;

    move-result-object v0

    const-string v1, "bnc_no_value"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 85
    iget-object v0, p0, Lio/branch/referral/ServerRequestRegisterInstall;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getIsReferrable()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 86
    invoke-virtual {p1}, Lio/branch/referral/ServerResponse;->getObject()Lorg/json/JSONObject;

    move-result-object v0

    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->Data:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 87
    iget-object v1, p0, Lio/branch/referral/ServerRequestRegisterInstall;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v1, v0}, Lio/branch/referral/PrefHelper;->setInstallParams(Ljava/lang/String;)V

    .line 93
    :cond_0
    invoke-virtual {p1}, Lio/branch/referral/ServerResponse;->getObject()Lorg/json/JSONObject;

    move-result-object v0

    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->LinkClickID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 94
    iget-object v0, p0, Lio/branch/referral/ServerRequestRegisterInstall;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {p1}, Lio/branch/referral/ServerResponse;->getObject()Lorg/json/JSONObject;

    move-result-object v1

    sget-object v2, Lio/branch/referral/Defines$Jsonkey;->LinkClickID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/branch/referral/PrefHelper;->setLinkClickID(Ljava/lang/String;)V

    goto :goto_0

    .line 96
    :cond_1
    iget-object v0, p0, Lio/branch/referral/ServerRequestRegisterInstall;->prefHelper_:Lio/branch/referral/PrefHelper;

    const-string v1, "bnc_no_value"

    invoke-virtual {v0, v1}, Lio/branch/referral/PrefHelper;->setLinkClickID(Ljava/lang/String;)V

    .line 99
    :goto_0
    invoke-virtual {p1}, Lio/branch/referral/ServerResponse;->getObject()Lorg/json/JSONObject;

    move-result-object v0

    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->Data:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 100
    invoke-virtual {p1}, Lio/branch/referral/ServerResponse;->getObject()Lorg/json/JSONObject;

    move-result-object v0

    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->Data:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 101
    iget-object v1, p0, Lio/branch/referral/ServerRequestRegisterInstall;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v1, v0}, Lio/branch/referral/PrefHelper;->setSessionParams(Ljava/lang/String;)V

    goto :goto_1

    .line 103
    :cond_2
    iget-object v0, p0, Lio/branch/referral/ServerRequestRegisterInstall;->prefHelper_:Lio/branch/referral/PrefHelper;

    const-string v1, "bnc_no_value"

    invoke-virtual {v0, v1}, Lio/branch/referral/PrefHelper;->setSessionParams(Ljava/lang/String;)V

    .line 105
    :goto_1
    iget-object v0, p0, Lio/branch/referral/ServerRequestRegisterInstall;->callback_:Lio/branch/referral/Branch$BranchReferralInitListener;

    if-eqz v0, :cond_3

    iget-boolean v0, p2, Lio/branch/referral/Branch;->isInitReportedThroughCallBack:Z

    if-nez v0, :cond_3

    .line 106
    iget-object v0, p0, Lio/branch/referral/ServerRequestRegisterInstall;->callback_:Lio/branch/referral/Branch$BranchReferralInitListener;

    invoke-virtual {p2}, Lio/branch/referral/Branch;->getLatestReferringParams()Lorg/json/JSONObject;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lio/branch/referral/Branch$BranchReferralInitListener;->onInitFinished(Lorg/json/JSONObject;Lio/branch/referral/BranchError;)V

    .line 109
    :cond_3
    iget-object v0, p0, Lio/branch/referral/ServerRequestRegisterInstall;->prefHelper_:Lio/branch/referral/PrefHelper;

    iget-object v1, p0, Lio/branch/referral/ServerRequestRegisterInstall;->systemObserver_:Lio/branch/referral/SystemObserver;

    invoke-virtual {v1}, Lio/branch/referral/SystemObserver;->getAppVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/branch/referral/PrefHelper;->setAppVersion(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 112
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 114
    :goto_2
    invoke-virtual {p0, p1, p2}, Lio/branch/referral/ServerRequestRegisterInstall;->onInitSessionCompleted(Lio/branch/referral/ServerResponse;Lio/branch/referral/Branch;)V

    return-void
.end method

.method public setInitFinishedCallback(Lio/branch/referral/Branch$BranchReferralInitListener;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 120
    iput-object p1, p0, Lio/branch/referral/ServerRequestRegisterInstall;->callback_:Lio/branch/referral/Branch$BranchReferralInitListener;

    :cond_0
    return-void
.end method
