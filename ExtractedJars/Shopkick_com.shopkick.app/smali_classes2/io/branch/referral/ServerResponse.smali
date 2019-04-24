.class public Lio/branch/referral/ServerResponse;
.super Ljava/lang/Object;
.source "ServerResponse.java"


# instance fields
.field private post_:Ljava/lang/Object;

.field private statusCode_:I

.field private tag_:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lio/branch/referral/ServerResponse;->tag_:Ljava/lang/String;

    .line 47
    iput p2, p0, Lio/branch/referral/ServerResponse;->statusCode_:I

    return-void
.end method


# virtual methods
.method public getArray()Lorg/json/JSONArray;
    .locals 2

    .line 102
    iget-object v0, p0, Lio/branch/referral/ServerResponse;->post_:Ljava/lang/Object;

    instance-of v1, v0, Lorg/json/JSONArray;

    if-eqz v1, :cond_0

    .line 103
    check-cast v0, Lorg/json/JSONArray;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getFailReason()Ljava/lang/String;
    .locals 4

    const-string v0, ""

    .line 118
    :try_start_0
    invoke-virtual {p0}, Lio/branch/referral/ServerResponse;->getObject()Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "error"

    .line 120
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "error"

    .line 121
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "message"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "error"

    .line 122
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "message"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 123
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 124
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-object v0
.end method

.method public getObject()Lorg/json/JSONObject;
    .locals 2

    .line 87
    iget-object v0, p0, Lio/branch/referral/ServerResponse;->post_:Ljava/lang/Object;

    instance-of v1, v0, Lorg/json/JSONObject;

    if-eqz v1, :cond_0

    .line 88
    check-cast v0, Lorg/json/JSONObject;

    return-object v0

    .line 91
    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    return-object v0
.end method

.method public getStatusCode()I
    .locals 1

    .line 65
    iget v0, p0, Lio/branch/referral/ServerResponse;->statusCode_:I

    return v0
.end method

.method public getTag()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lio/branch/referral/ServerResponse;->tag_:Ljava/lang/String;

    return-object v0
.end method

.method public setPost(Ljava/lang/Object;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lio/branch/referral/ServerResponse;->post_:Ljava/lang/Object;

    return-void
.end method
