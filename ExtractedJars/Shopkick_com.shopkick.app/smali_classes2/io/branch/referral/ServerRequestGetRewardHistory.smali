.class Lio/branch/referral/ServerRequestGetRewardHistory;
.super Lio/branch/referral/ServerRequest;
.source "ServerRequestGetRewardHistory.java"


# instance fields
.field callback_:Lio/branch/referral/Branch$BranchListResponseListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILio/branch/referral/Branch$CreditHistoryOrder;Lio/branch/referral/Branch$BranchListResponseListener;)V
    .locals 1

    .line 43
    sget-object v0, Lio/branch/referral/Defines$RequestPath;->GetCreditHistory:Lio/branch/referral/Defines$RequestPath;

    invoke-virtual {v0}, Lio/branch/referral/Defines$RequestPath;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lio/branch/referral/ServerRequest;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 44
    iput-object p6, p0, Lio/branch/referral/ServerRequestGetRewardHistory;->callback_:Lio/branch/referral/Branch$BranchListResponseListener;

    .line 46
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 48
    :try_start_0
    sget-object p6, Lio/branch/referral/Defines$Jsonkey;->IdentityID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p6}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p6

    iget-object v0, p0, Lio/branch/referral/ServerRequestGetRewardHistory;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getIdentityID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p6, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 49
    sget-object p6, Lio/branch/referral/Defines$Jsonkey;->DeviceFingerprintID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p6}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p6

    iget-object v0, p0, Lio/branch/referral/ServerRequestGetRewardHistory;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getDeviceFingerPrintID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p6, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 50
    sget-object p6, Lio/branch/referral/Defines$Jsonkey;->SessionID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p6}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p6

    iget-object v0, p0, Lio/branch/referral/ServerRequestGetRewardHistory;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getSessionID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p6, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 51
    iget-object p6, p0, Lio/branch/referral/ServerRequestGetRewardHistory;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {p6}, Lio/branch/referral/PrefHelper;->getLinkClickID()Ljava/lang/String;

    move-result-object p6

    const-string v0, "bnc_no_value"

    invoke-virtual {p6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p6

    if-nez p6, :cond_0

    .line 52
    sget-object p6, Lio/branch/referral/Defines$Jsonkey;->LinkClickID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p6}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p6

    iget-object v0, p0, Lio/branch/referral/ServerRequestGetRewardHistory;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getLinkClickID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p6, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 54
    :cond_0
    sget-object p6, Lio/branch/referral/Defines$Jsonkey;->Length:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p6}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p6

    invoke-virtual {p1, p6, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 55
    sget-object p4, Lio/branch/referral/Defines$Jsonkey;->Direction:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p4}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p5}, Lio/branch/referral/Branch$CreditHistoryOrder;->ordinal()I

    move-result p5

    invoke-virtual {p1, p4, p5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    if-eqz p2, :cond_1

    .line 58
    sget-object p4, Lio/branch/referral/Defines$Jsonkey;->Bucket:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p4}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1, p4, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    if-eqz p3, :cond_2

    .line 62
    sget-object p2, Lio/branch/referral/Defines$Jsonkey;->BeginAfterID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 64
    :cond_2
    invoke-virtual {p0, p1}, Lio/branch/referral/ServerRequestGetRewardHistory;->setPost(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 66
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    const/4 p1, 0x1

    .line 67
    iput-boolean p1, p0, Lio/branch/referral/ServerRequestGetRewardHistory;->constructError_:Z

    :goto_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/json/JSONObject;Landroid/content/Context;)V
    .locals 0

    .line 73
    invoke-direct {p0, p1, p2, p3}, Lio/branch/referral/ServerRequest;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public clearCallbacks()V
    .locals 1

    const/4 v0, 0x0

    .line 108
    iput-object v0, p0, Lio/branch/referral/ServerRequestGetRewardHistory;->callback_:Lio/branch/referral/Branch$BranchListResponseListener;

    return-void
.end method

.method public handleErrors(Landroid/content/Context;)Z
    .locals 4

    .line 92
    invoke-super {p0, p1}, Lio/branch/referral/ServerRequest;->doesAppHasInternetPermission(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 93
    iget-object p1, p0, Lio/branch/referral/ServerRequestGetRewardHistory;->callback_:Lio/branch/referral/Branch$BranchListResponseListener;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 94
    new-instance v1, Lio/branch/referral/BranchError;

    const-string v2, "Trouble retrieving user credit history."

    const/16 v3, -0x66

    invoke-direct {v1, v2, v3}, Lio/branch/referral/BranchError;-><init>(Ljava/lang/String;I)V

    invoke-interface {p1, v0, v1}, Lio/branch/referral/Branch$BranchListResponseListener;->onReceivingResponse(Lorg/json/JSONArray;Lio/branch/referral/BranchError;)V

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public handleFailure(ILjava/lang/String;)V
    .locals 5

    .line 85
    iget-object v0, p0, Lio/branch/referral/ServerRequestGetRewardHistory;->callback_:Lio/branch/referral/Branch$BranchListResponseListener;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 86
    new-instance v2, Lio/branch/referral/BranchError;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Trouble retrieving user credit history. "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v2, p2, p1}, Lio/branch/referral/BranchError;-><init>(Ljava/lang/String;I)V

    invoke-interface {v0, v1, v2}, Lio/branch/referral/Branch$BranchListResponseListener;->onReceivingResponse(Lorg/json/JSONArray;Lio/branch/referral/BranchError;)V

    :cond_0
    return-void
.end method

.method public isGetRequest()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onRequestSucceeded(Lio/branch/referral/ServerResponse;Lio/branch/referral/Branch;)V
    .locals 1

    .line 78
    iget-object p2, p0, Lio/branch/referral/ServerRequestGetRewardHistory;->callback_:Lio/branch/referral/Branch$BranchListResponseListener;

    if-eqz p2, :cond_0

    .line 79
    invoke-virtual {p1}, Lio/branch/referral/ServerResponse;->getArray()Lorg/json/JSONArray;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p2, p1, v0}, Lio/branch/referral/Branch$BranchListResponseListener;->onReceivingResponse(Lorg/json/JSONArray;Lio/branch/referral/BranchError;)V

    :cond_0
    return-void
.end method
