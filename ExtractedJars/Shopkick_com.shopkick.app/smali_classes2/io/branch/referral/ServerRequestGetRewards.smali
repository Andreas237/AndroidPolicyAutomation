.class Lio/branch/referral/ServerRequestGetRewards;
.super Lio/branch/referral/ServerRequest;
.source "ServerRequestGetRewards.java"


# instance fields
.field callback_:Lio/branch/referral/Branch$BranchReferralStateChangedListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/branch/referral/Branch$BranchReferralStateChangedListener;)V
    .locals 1

    .line 30
    sget-object v0, Lio/branch/referral/Defines$RequestPath;->GetCredits:Lio/branch/referral/Defines$RequestPath;

    invoke-virtual {v0}, Lio/branch/referral/Defines$RequestPath;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lio/branch/referral/ServerRequest;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 31
    iput-object p2, p0, Lio/branch/referral/ServerRequestGetRewards;->callback_:Lio/branch/referral/Branch$BranchReferralStateChangedListener;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/json/JSONObject;Landroid/content/Context;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2, p3}, Lio/branch/referral/ServerRequest;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public clearCallbacks()V
    .locals 1

    const/4 v0, 0x0

    .line 91
    iput-object v0, p0, Lio/branch/referral/ServerRequestGetRewards;->callback_:Lio/branch/referral/Branch$BranchReferralStateChangedListener;

    return-void
.end method

.method public getRequestUrl()Ljava/lang/String;
    .locals 2

    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Lio/branch/referral/ServerRequest;->getRequestUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/branch/referral/ServerRequestGetRewards;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v1}, Lio/branch/referral/PrefHelper;->getIdentityID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public handleErrors(Landroid/content/Context;)Z
    .locals 4

    .line 75
    invoke-super {p0, p1}, Lio/branch/referral/ServerRequest;->doesAppHasInternetPermission(Landroid/content/Context;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_1

    .line 76
    iget-object p1, p0, Lio/branch/referral/ServerRequestGetRewards;->callback_:Lio/branch/referral/Branch$BranchReferralStateChangedListener;

    if-eqz p1, :cond_0

    .line 77
    new-instance v1, Lio/branch/referral/BranchError;

    const-string v2, "Trouble retrieving user credits."

    const/16 v3, -0x66

    invoke-direct {v1, v2, v3}, Lio/branch/referral/BranchError;-><init>(Ljava/lang/String;I)V

    invoke-interface {p1, v0, v1}, Lio/branch/referral/Branch$BranchReferralStateChangedListener;->onStateChanged(ZLio/branch/referral/BranchError;)V

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method

.method public handleFailure(ILjava/lang/String;)V
    .locals 5

    .line 68
    iget-object v0, p0, Lio/branch/referral/ServerRequestGetRewards;->callback_:Lio/branch/referral/Branch$BranchReferralStateChangedListener;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 69
    new-instance v2, Lio/branch/referral/BranchError;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Trouble retrieving user credits. "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v2, p2, p1}, Lio/branch/referral/BranchError;-><init>(Ljava/lang/String;I)V

    invoke-interface {v0, v1, v2}, Lio/branch/referral/Branch$BranchReferralStateChangedListener;->onStateChanged(ZLio/branch/referral/BranchError;)V

    :cond_0
    return-void
.end method

.method public isGetRequest()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public onRequestSucceeded(Lio/branch/referral/ServerResponse;Lio/branch/referral/Branch;)V
    .locals 4

    .line 46
    invoke-virtual {p1}, Lio/branch/referral/ServerResponse;->getObject()Lorg/json/JSONObject;

    move-result-object p2

    invoke-virtual {p2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object p2

    const/4 v0, 0x0

    .line 47
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 48
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 51
    :try_start_0
    invoke-virtual {p1}, Lio/branch/referral/ServerResponse;->getObject()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    .line 53
    iget-object v3, p0, Lio/branch/referral/ServerRequestGetRewards;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v3, v1}, Lio/branch/referral/PrefHelper;->getCreditCount(Ljava/lang/String;)I

    move-result v3

    if-eq v2, v3, :cond_0

    const/4 v0, 0x1

    .line 56
    :cond_0
    iget-object v3, p0, Lio/branch/referral/ServerRequestGetRewards;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v3, v1, v2}, Lio/branch/referral/PrefHelper;->setCreditCount(Ljava/lang/String;I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 58
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0

    .line 61
    :cond_1
    iget-object p1, p0, Lio/branch/referral/ServerRequestGetRewards;->callback_:Lio/branch/referral/Branch$BranchReferralStateChangedListener;

    if-eqz p1, :cond_2

    const/4 p2, 0x0

    .line 62
    invoke-interface {p1, v0, p2}, Lio/branch/referral/Branch$BranchReferralStateChangedListener;->onStateChanged(ZLio/branch/referral/BranchError;)V

    :cond_2
    return-void
.end method
