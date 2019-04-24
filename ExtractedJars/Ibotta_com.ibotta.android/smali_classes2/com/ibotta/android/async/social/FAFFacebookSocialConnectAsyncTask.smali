.class public Lcom/ibotta/android/async/social/FAFFacebookSocialConnectAsyncTask;
.super Lcom/ibotta/android/async/social/FAFSocialConnectAsyncTask;
.source "FAFFacebookSocialConnectAsyncTask.java"


# instance fields
.field private fbId:Ljava/lang/String;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/service/api/job/CacheClearJobFactory;Lcom/ibotta/android/state/user/UserState;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lcom/ibotta/android/async/social/FAFSocialConnectAsyncTask;-><init>(Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    .line 26
    iput-object p2, p0, Lcom/ibotta/android/async/social/FAFFacebookSocialConnectAsyncTask;->userState:Lcom/ibotta/android/state/user/UserState;

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 20
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/async/social/FAFFacebookSocialConnectAsyncTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 4

    .line 31
    iget-object p1, p0, Lcom/ibotta/android/async/social/FAFFacebookSocialConnectAsyncTask;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {p1}, Lcom/ibotta/android/state/user/UserState;->getFacebookId()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/async/social/FAFFacebookSocialConnectAsyncTask;->fbId:Ljava/lang/String;

    .line 32
    iget-object p1, p0, Lcom/ibotta/android/async/social/FAFFacebookSocialConnectAsyncTask;->fbId:Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_1

    const/4 p1, 0x0

    .line 35
    :try_start_0
    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/facebook/GraphRequest;->newMeRequest(Lcom/facebook/AccessToken;Lcom/facebook/GraphRequest$GraphJSONObjectCallback;)Lcom/facebook/GraphRequest;

    move-result-object v1

    .line 36
    invoke-virtual {v1}, Lcom/facebook/GraphRequest;->executeAndWait()Lcom/facebook/GraphResponse;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 38
    invoke-virtual {v1}, Lcom/facebook/GraphResponse;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, "Retrieving Facebook info."

    .line 39
    new-array v3, p1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    invoke-virtual {v1}, Lcom/facebook/GraphResponse;->getJSONObject()Lorg/json/JSONObject;

    move-result-object v1

    .line 41
    new-instance v2, Lcom/ibotta/android/state/social/FacebookInfo;

    invoke-direct {v2, v1}, Lcom/ibotta/android/state/social/FacebookInfo;-><init>(Lorg/json/JSONObject;)V

    .line 42
    invoke-virtual {v2}, Lcom/ibotta/android/state/social/FacebookInfo;->getId()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/async/social/FAFFacebookSocialConnectAsyncTask;->fbId:Ljava/lang/String;

    .line 43
    iget-object v1, p0, Lcom/ibotta/android/async/social/FAFFacebookSocialConnectAsyncTask;->fbId:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/ibotta/android/async/social/FAFFacebookSocialConnectAsyncTask;->setId(Ljava/lang/String;)V

    .line 45
    invoke-virtual {v2}, Lcom/ibotta/android/state/social/FacebookInfo;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, p1, [Ljava/lang/Object;

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    :cond_0
    new-array v1, p1, [Ljava/lang/Void;

    invoke-super {p0, v1}, Lcom/ibotta/android/async/social/FAFSocialConnectAsyncTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Failed to retrieve Facebook user info."

    .line 50
    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {v1, v2, p1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0

    :cond_1
    :goto_0
    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 20
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/async/social/FAFFacebookSocialConnectAsyncTask;->onPostExecute(Ljava/lang/Void;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/Void;)V
    .locals 1

    .line 60
    invoke-super {p0, p1}, Lcom/ibotta/android/async/social/FAFSocialConnectAsyncTask;->onPostExecute(Ljava/lang/Void;)V

    .line 62
    iget-object p1, p0, Lcom/ibotta/android/async/social/FAFFacebookSocialConnectAsyncTask;->fbId:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/async/social/FAFFacebookSocialConnectAsyncTask;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0, p1}, Lcom/ibotta/android/state/user/UserState;->saveFacebookId(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
