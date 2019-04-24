.class Lio/branch/referral/util/BranchEvent$ServerRequestLogEvent;
.super Lio/branch/referral/ServerRequest;
.source "BranchEvent.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/branch/referral/util/BranchEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ServerRequestLogEvent"
.end annotation


# instance fields
.field final synthetic this$0:Lio/branch/referral/util/BranchEvent;


# direct methods
.method constructor <init>(Lio/branch/referral/util/BranchEvent;Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 217
    iput-object p1, p0, Lio/branch/referral/util/BranchEvent$ServerRequestLogEvent;->this$0:Lio/branch/referral/util/BranchEvent;

    .line 218
    invoke-direct {p0, p2, p3}, Lio/branch/referral/ServerRequest;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 219
    new-instance p3, Lorg/json/JSONObject;

    invoke-direct {p3}, Lorg/json/JSONObject;-><init>()V

    .line 221
    :try_start_0
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->Name:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lio/branch/referral/util/BranchEvent;->access$000(Lio/branch/referral/util/BranchEvent;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 222
    invoke-static {p1}, Lio/branch/referral/util/BranchEvent;->access$100(Lio/branch/referral/util/BranchEvent;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 223
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->CustomData:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lio/branch/referral/util/BranchEvent;->access$100(Lio/branch/referral/util/BranchEvent;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {p3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 226
    :cond_0
    invoke-static {p1}, Lio/branch/referral/util/BranchEvent;->access$200(Lio/branch/referral/util/BranchEvent;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 227
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->EventData:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lio/branch/referral/util/BranchEvent;->access$200(Lio/branch/referral/util/BranchEvent;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {p3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 229
    :cond_1
    invoke-static {p1}, Lio/branch/referral/util/BranchEvent;->access$300(Lio/branch/referral/util/BranchEvent;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 230
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 231
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->ContentItems:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 232
    invoke-static {p1}, Lio/branch/referral/util/BranchEvent;->access$300(Lio/branch/referral/util/BranchEvent;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/branch/indexing/BranchUniversalObject;

    .line 233
    invoke-virtual {v1}, Lio/branch/indexing/BranchUniversalObject;->convertToJson()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    .line 236
    :cond_2
    invoke-virtual {p0, p3}, Lio/branch/referral/util/BranchEvent$ServerRequestLogEvent;->setPost(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 238
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    .line 240
    :goto_1
    invoke-virtual {p0, p2, p3}, Lio/branch/referral/util/BranchEvent$ServerRequestLogEvent;->updateEnvironment(Landroid/content/Context;Lorg/json/JSONObject;)V

    return-void
.end method


# virtual methods
.method public clearCallbacks()V
    .locals 0

    return-void
.end method

.method public getBranchRemoteAPIVersion()Lio/branch/referral/ServerRequest$BRANCH_API_VERSION;
    .locals 1

    .line 267
    sget-object v0, Lio/branch/referral/ServerRequest$BRANCH_API_VERSION;->V2:Lio/branch/referral/ServerRequest$BRANCH_API_VERSION;

    return-object v0
.end method

.method public handleErrors(Landroid/content/Context;)Z
    .locals 0

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
    .locals 0

    return-void
.end method

.method public shouldRetryOnFail()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected shouldUpdateLimitFacebookTracking()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
