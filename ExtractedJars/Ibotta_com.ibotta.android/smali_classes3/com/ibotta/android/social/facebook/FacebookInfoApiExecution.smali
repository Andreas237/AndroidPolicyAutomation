.class public Lcom/ibotta/android/social/facebook/FacebookInfoApiExecution;
.super Ljava/lang/Object;
.source "FacebookInfoApiExecution.java"

# interfaces
.implements Lcom/ibotta/api/execution/ApiExecution;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abort()V
    .locals 0

    return-void
.end method

.method public executeApiCall(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/api/ApiResponse;
    .locals 6

    const/4 p1, 0x0

    const/4 v0, 0x0

    .line 28
    :try_start_0
    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/facebook/GraphRequest;->newMeRequest(Lcom/facebook/AccessToken;Lcom/facebook/GraphRequest$GraphJSONObjectCallback;)Lcom/facebook/GraphRequest;

    move-result-object v1

    .line 30
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "fields"

    const-string v4, "id,first_name,last_name,birthday,gender,email"

    .line 31
    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    invoke-virtual {v1, v2}, Lcom/facebook/GraphRequest;->setParameters(Landroid/os/Bundle;)V

    .line 34
    invoke-virtual {v1}, Lcom/facebook/GraphRequest;->executeAndWait()Lcom/facebook/GraphResponse;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    if-eqz v1, :cond_0

    .line 36
    :try_start_1
    invoke-virtual {v1}, Lcom/facebook/GraphResponse;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, "Retrieving Facebook info."

    .line 37
    new-array v3, p1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    invoke-virtual {v1}, Lcom/facebook/GraphResponse;->getJSONObject()Lorg/json/JSONObject;

    move-result-object v2

    .line 39
    new-instance v3, Lcom/ibotta/android/state/social/FacebookInfo;

    invoke-direct {v3, v2}, Lcom/ibotta/android/state/social/FacebookInfo;-><init>(Lorg/json/JSONObject;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 40
    :try_start_2
    invoke-virtual {v3}, Lcom/ibotta/android/state/social/FacebookInfo;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, p1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-object v0, v3

    goto :goto_1

    :catch_0
    move-exception v0

    move-object v2, v1

    move-object v1, v0

    move-object v0, v3

    goto :goto_0

    :catch_1
    move-exception v2

    move-object v5, v2

    move-object v2, v1

    move-object v1, v5

    goto :goto_0

    :catch_2
    move-exception v1

    move-object v2, v0

    :goto_0
    const-string v3, "Failed to get user\'s Facebook info."

    .line 43
    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {v1, v3, p1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    move-object v1, v2

    .line 46
    :cond_0
    :goto_1
    new-instance p1, Lcom/ibotta/android/social/facebook/FacebookInfoResponse;

    invoke-direct {p1, v1, v0}, Lcom/ibotta/android/social/facebook/FacebookInfoResponse;-><init>(Lcom/facebook/GraphResponse;Lcom/ibotta/android/state/social/FacebookInfo;)V

    return-object p1
.end method

.method public getEndpoint(Lcom/ibotta/api/ApiCall;)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public isAborted()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
