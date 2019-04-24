.class Lio/branch/referral/ServerRequestActionCompleted;
.super Lio/branch/referral/ServerRequest;
.source "ServerRequestActionCompleted.java"


# instance fields
.field private final callback_:Lio/branch/referral/BranchViewHandler$IBranchViewEvents;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lorg/json/JSONObject;Lio/branch/referral/BranchViewHandler$IBranchViewEvents;)V
    .locals 2

    .line 31
    sget-object v0, Lio/branch/referral/Defines$RequestPath;->CompletedAction:Lio/branch/referral/Defines$RequestPath;

    invoke-virtual {v0}, Lio/branch/referral/Defines$RequestPath;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lio/branch/referral/ServerRequest;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 32
    iput-object p4, p0, Lio/branch/referral/ServerRequestActionCompleted;->callback_:Lio/branch/referral/BranchViewHandler$IBranchViewEvents;

    .line 33
    new-instance p4, Lorg/json/JSONObject;

    invoke-direct {p4}, Lorg/json/JSONObject;-><init>()V

    .line 36
    :try_start_0
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->IdentityID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/referral/ServerRequestActionCompleted;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v1}, Lio/branch/referral/PrefHelper;->getIdentityID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 37
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->DeviceFingerprintID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/referral/ServerRequestActionCompleted;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v1}, Lio/branch/referral/PrefHelper;->getDeviceFingerPrintID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 38
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->SessionID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/referral/ServerRequestActionCompleted;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v1}, Lio/branch/referral/PrefHelper;->getSessionID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 39
    iget-object v0, p0, Lio/branch/referral/ServerRequestActionCompleted;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getLinkClickID()Ljava/lang/String;

    move-result-object v0

    const-string v1, "bnc_no_value"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 40
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->LinkClickID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/referral/ServerRequestActionCompleted;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v1}, Lio/branch/referral/PrefHelper;->getLinkClickID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 42
    :cond_0
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->Event:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eqz p3, :cond_1

    .line 44
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->Metadata:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 46
    :cond_1
    invoke-virtual {p0, p1, p4}, Lio/branch/referral/ServerRequestActionCompleted;->updateEnvironment(Landroid/content/Context;Lorg/json/JSONObject;)V

    .line 47
    invoke-virtual {p0, p4}, Lio/branch/referral/ServerRequestActionCompleted;->setPost(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 49
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    const/4 p1, 0x1

    .line 50
    iput-boolean p1, p0, Lio/branch/referral/ServerRequestActionCompleted;->constructError_:Z

    :goto_0
    if-eqz p2, :cond_2

    const-string p1, "purchase"

    .line 53
    invoke-virtual {p2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "BranchSDK"

    const-string p2, "Warning: You are sending a purchase event with our non-dedicated purchase function. Please see function sendCommerceEvent"

    .line 54
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/json/JSONObject;Landroid/content/Context;)V
    .locals 0

    .line 59
    invoke-direct {p0, p1, p2, p3}, Lio/branch/referral/ServerRequest;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 60
    iput-object p1, p0, Lio/branch/referral/ServerRequestActionCompleted;->callback_:Lio/branch/referral/BranchViewHandler$IBranchViewEvents;

    return-void
.end method


# virtual methods
.method public clearCallbacks()V
    .locals 0

    return-void
.end method

.method public handleErrors(Landroid/content/Context;)Z
    .locals 1

    .line 100
    invoke-super {p0, p1}, Lio/branch/referral/ServerRequest;->doesAppHasInternetPermission(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "BranchSDK"

    const-string v0, "Trouble executing your request. Please add \'android.permission.INTERNET\' in your applications manifest file"

    .line 101
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public handleFailure(ILjava/lang/String;)V
    .locals 0

    return-void
.end method

.method public isGAdsParamsRequired()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isGetRequest()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onRequestSucceeded(Lio/branch/referral/ServerResponse;Lio/branch/referral/Branch;)V
    .locals 3

    .line 66
    invoke-virtual {p1}, Lio/branch/referral/ServerResponse;->getObject()Lorg/json/JSONObject;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lio/branch/referral/ServerResponse;->getObject()Lorg/json/JSONObject;

    move-result-object p2

    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->BranchViewData:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 67
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object p2

    iget-object p2, p2, Lio/branch/referral/Branch;->currentActivityReference_:Ljava/lang/ref/WeakReference;

    if-eqz p2, :cond_1

    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object p2

    iget-object p2, p2, Lio/branch/referral/Branch;->currentActivityReference_:Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_1

    const-string p2, ""

    .line 70
    :try_start_0
    invoke-virtual {p0}, Lio/branch/referral/ServerRequestActionCompleted;->getPost()Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 71
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->Event:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 72
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->Event:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 74
    :cond_0
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object v0

    iget-object v0, v0, Lio/branch/referral/Branch;->currentActivityReference_:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    .line 75
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object v0

    iget-object v0, v0, Lio/branch/referral/Branch;->currentActivityReference_:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    .line 76
    invoke-virtual {p1}, Lio/branch/referral/ServerResponse;->getObject()Lorg/json/JSONObject;

    move-result-object p1

    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->BranchViewData:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 77
    invoke-static {}, Lio/branch/referral/BranchViewHandler;->getInstance()Lio/branch/referral/BranchViewHandler;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/ServerRequestActionCompleted;->callback_:Lio/branch/referral/BranchViewHandler$IBranchViewEvents;

    invoke-virtual {v1, p1, p2, v0, v2}, Lio/branch/referral/BranchViewHandler;->showBranchView(Lorg/json/JSONObject;Ljava/lang/String;Landroid/content/Context;Lio/branch/referral/BranchViewHandler$IBranchViewEvents;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 80
    :catch_0
    iget-object p1, p0, Lio/branch/referral/ServerRequestActionCompleted;->callback_:Lio/branch/referral/BranchViewHandler$IBranchViewEvents;

    if-eqz p1, :cond_1

    const/16 v0, -0xc9

    const-string v1, "Unable to show branch view. Branch view received is invalid "

    .line 81
    invoke-interface {p1, v0, v1, p2}, Lio/branch/referral/BranchViewHandler$IBranchViewEvents;->onBranchViewError(ILjava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public shouldRetryOnFail()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
