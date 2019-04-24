.class Lio/branch/referral/ServerRequestLogout;
.super Lio/branch/referral/ServerRequest;
.source "ServerRequestLogout.java"


# instance fields
.field private callback_:Lio/branch/referral/Branch$LogoutStatusListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/branch/referral/Branch$LogoutStatusListener;)V
    .locals 1

    .line 28
    sget-object v0, Lio/branch/referral/Defines$RequestPath;->Logout:Lio/branch/referral/Defines$RequestPath;

    invoke-virtual {v0}, Lio/branch/referral/Defines$RequestPath;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lio/branch/referral/ServerRequest;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 29
    iput-object p2, p0, Lio/branch/referral/ServerRequestLogout;->callback_:Lio/branch/referral/Branch$LogoutStatusListener;

    .line 30
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 32
    :try_start_0
    sget-object p2, Lio/branch/referral/Defines$Jsonkey;->IdentityID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lio/branch/referral/ServerRequestLogout;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getIdentityID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 33
    sget-object p2, Lio/branch/referral/Defines$Jsonkey;->DeviceFingerprintID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lio/branch/referral/ServerRequestLogout;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getDeviceFingerPrintID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 34
    sget-object p2, Lio/branch/referral/Defines$Jsonkey;->SessionID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lio/branch/referral/ServerRequestLogout;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getSessionID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 35
    iget-object p2, p0, Lio/branch/referral/ServerRequestLogout;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {p2}, Lio/branch/referral/PrefHelper;->getLinkClickID()Ljava/lang/String;

    move-result-object p2

    const-string v0, "bnc_no_value"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 36
    sget-object p2, Lio/branch/referral/Defines$Jsonkey;->LinkClickID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lio/branch/referral/ServerRequestLogout;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getLinkClickID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 38
    :cond_0
    invoke-virtual {p0, p1}, Lio/branch/referral/ServerRequestLogout;->setPost(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 40
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    const/4 p1, 0x1

    .line 41
    iput-boolean p1, p0, Lio/branch/referral/ServerRequestLogout;->constructError_:Z

    :goto_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/json/JSONObject;Landroid/content/Context;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2, p3}, Lio/branch/referral/ServerRequest;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public clearCallbacks()V
    .locals 1

    const/4 v0, 0x0

    .line 95
    iput-object v0, p0, Lio/branch/referral/ServerRequestLogout;->callback_:Lio/branch/referral/Branch$LogoutStatusListener;

    return-void
.end method

.method public handleErrors(Landroid/content/Context;)Z
    .locals 4

    .line 78
    invoke-super {p0, p1}, Lio/branch/referral/ServerRequest;->doesAppHasInternetPermission(Landroid/content/Context;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_1

    const-string p1, "BranchSDK"

    const-string v1, "Trouble executing your request. Please add \'android.permission.INTERNET\' in your applications manifest file"

    .line 79
    invoke-static {p1, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    iget-object p1, p0, Lio/branch/referral/ServerRequestLogout;->callback_:Lio/branch/referral/Branch$LogoutStatusListener;

    if-eqz p1, :cond_0

    .line 81
    new-instance v1, Lio/branch/referral/BranchError;

    const-string v2, "Logout failed"

    const/16 v3, -0x66

    invoke-direct {v1, v2, v3}, Lio/branch/referral/BranchError;-><init>(Ljava/lang/String;I)V

    invoke-interface {p1, v0, v1}, Lio/branch/referral/Branch$LogoutStatusListener;->onLogoutFinished(ZLio/branch/referral/BranchError;)V

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method

.method public handleFailure(ILjava/lang/String;)V
    .locals 5

    .line 71
    iget-object v0, p0, Lio/branch/referral/ServerRequestLogout;->callback_:Lio/branch/referral/Branch$LogoutStatusListener;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 72
    new-instance v2, Lio/branch/referral/BranchError;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Logout error. "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v2, p2, p1}, Lio/branch/referral/BranchError;-><init>(Ljava/lang/String;I)V

    invoke-interface {v0, v1, v2}, Lio/branch/referral/Branch$LogoutStatusListener;->onLogoutFinished(ZLio/branch/referral/BranchError;)V

    :cond_0
    return-void
.end method

.method public isGetRequest()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method isPersistable()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onRequestSucceeded(Lio/branch/referral/ServerResponse;Lio/branch/referral/Branch;)V
    .locals 4

    const/4 p2, 0x0

    const/4 v0, 0x1

    .line 52
    :try_start_0
    iget-object v1, p0, Lio/branch/referral/ServerRequestLogout;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {p1}, Lio/branch/referral/ServerResponse;->getObject()Lorg/json/JSONObject;

    move-result-object v2

    sget-object v3, Lio/branch/referral/Defines$Jsonkey;->SessionID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/branch/referral/PrefHelper;->setSessionID(Ljava/lang/String;)V

    .line 53
    iget-object v1, p0, Lio/branch/referral/ServerRequestLogout;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {p1}, Lio/branch/referral/ServerResponse;->getObject()Lorg/json/JSONObject;

    move-result-object v2

    sget-object v3, Lio/branch/referral/Defines$Jsonkey;->IdentityID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/branch/referral/PrefHelper;->setIdentityID(Ljava/lang/String;)V

    .line 54
    iget-object v1, p0, Lio/branch/referral/ServerRequestLogout;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {p1}, Lio/branch/referral/ServerResponse;->getObject()Lorg/json/JSONObject;

    move-result-object p1

    sget-object v2, Lio/branch/referral/Defines$Jsonkey;->Link:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lio/branch/referral/PrefHelper;->setUserURL(Ljava/lang/String;)V

    .line 56
    iget-object p1, p0, Lio/branch/referral/ServerRequestLogout;->prefHelper_:Lio/branch/referral/PrefHelper;

    const-string v1, "bnc_no_value"

    invoke-virtual {p1, v1}, Lio/branch/referral/PrefHelper;->setInstallParams(Ljava/lang/String;)V

    .line 57
    iget-object p1, p0, Lio/branch/referral/ServerRequestLogout;->prefHelper_:Lio/branch/referral/PrefHelper;

    const-string v1, "bnc_no_value"

    invoke-virtual {p1, v1}, Lio/branch/referral/PrefHelper;->setSessionParams(Ljava/lang/String;)V

    .line 58
    iget-object p1, p0, Lio/branch/referral/ServerRequestLogout;->prefHelper_:Lio/branch/referral/PrefHelper;

    const-string v1, "bnc_no_value"

    invoke-virtual {p1, v1}, Lio/branch/referral/PrefHelper;->setIdentity(Ljava/lang/String;)V

    .line 59
    iget-object p1, p0, Lio/branch/referral/ServerRequestLogout;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {p1}, Lio/branch/referral/PrefHelper;->clearUserValues()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    iget-object p1, p0, Lio/branch/referral/ServerRequestLogout;->callback_:Lio/branch/referral/Branch$LogoutStatusListener;

    if-eqz p1, :cond_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 61
    :try_start_1
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    iget-object p1, p0, Lio/branch/referral/ServerRequestLogout;->callback_:Lio/branch/referral/Branch$LogoutStatusListener;

    if-eqz p1, :cond_0

    .line 64
    :goto_0
    invoke-interface {p1, v0, p2}, Lio/branch/referral/Branch$LogoutStatusListener;->onLogoutFinished(ZLio/branch/referral/BranchError;)V

    :cond_0
    return-void

    .line 63
    :goto_1
    iget-object v1, p0, Lio/branch/referral/ServerRequestLogout;->callback_:Lio/branch/referral/Branch$LogoutStatusListener;

    if-eqz v1, :cond_1

    .line 64
    invoke-interface {v1, v0, p2}, Lio/branch/referral/Branch$LogoutStatusListener;->onLogoutFinished(ZLio/branch/referral/BranchError;)V

    :cond_1
    throw p1
.end method
