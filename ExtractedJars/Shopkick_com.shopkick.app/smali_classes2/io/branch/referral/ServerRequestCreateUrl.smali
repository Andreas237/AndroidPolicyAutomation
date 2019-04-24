.class Lio/branch/referral/ServerRequestCreateUrl;
.super Lio/branch/referral/ServerRequest;
.source "ServerRequestCreateUrl.java"


# static fields
.field private static final DEF_BASE_URL:Ljava/lang/String; = "https://bnc.lt/a/"


# instance fields
.field private callback_:Lio/branch/referral/Branch$BranchLinkCreateListener;

.field private defaultToLongUrl_:Z

.field private isAsync_:Z

.field private isReqStartedFromBranchShareSheet_:Z

.field private linkPost_:Lio/branch/referral/BranchLinkData;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;IILjava/util/Collection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lio/branch/referral/Branch$BranchLinkCreateListener;ZZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            "Lio/branch/referral/Branch$BranchLinkCreateListener;",
            "ZZ)V"
        }
    .end annotation

    .line 64
    sget-object v0, Lio/branch/referral/Defines$RequestPath;->GetURL:Lio/branch/referral/Defines$RequestPath;

    invoke-virtual {v0}, Lio/branch/referral/Defines$RequestPath;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lio/branch/referral/ServerRequest;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 21
    iput-boolean p1, p0, Lio/branch/referral/ServerRequestCreateUrl;->isAsync_:Z

    .line 26
    iput-boolean p1, p0, Lio/branch/referral/ServerRequestCreateUrl;->defaultToLongUrl_:Z

    .line 66
    iput-object p11, p0, Lio/branch/referral/ServerRequestCreateUrl;->callback_:Lio/branch/referral/Branch$BranchLinkCreateListener;

    .line 67
    iput-boolean p12, p0, Lio/branch/referral/ServerRequestCreateUrl;->isAsync_:Z

    .line 68
    iput-boolean p13, p0, Lio/branch/referral/ServerRequestCreateUrl;->defaultToLongUrl_:Z

    .line 70
    new-instance p11, Lio/branch/referral/BranchLinkData;

    invoke-direct {p11}, Lio/branch/referral/BranchLinkData;-><init>()V

    iput-object p11, p0, Lio/branch/referral/ServerRequestCreateUrl;->linkPost_:Lio/branch/referral/BranchLinkData;

    .line 72
    :try_start_0
    iget-object p11, p0, Lio/branch/referral/ServerRequestCreateUrl;->linkPost_:Lio/branch/referral/BranchLinkData;

    sget-object p12, Lio/branch/referral/Defines$Jsonkey;->IdentityID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p12}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p12

    iget-object p13, p0, Lio/branch/referral/ServerRequestCreateUrl;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {p13}, Lio/branch/referral/PrefHelper;->getIdentityID()Ljava/lang/String;

    move-result-object p13

    invoke-virtual {p11, p12, p13}, Lio/branch/referral/BranchLinkData;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 73
    iget-object p11, p0, Lio/branch/referral/ServerRequestCreateUrl;->linkPost_:Lio/branch/referral/BranchLinkData;

    sget-object p12, Lio/branch/referral/Defines$Jsonkey;->DeviceFingerprintID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p12}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p12

    iget-object p13, p0, Lio/branch/referral/ServerRequestCreateUrl;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {p13}, Lio/branch/referral/PrefHelper;->getDeviceFingerPrintID()Ljava/lang/String;

    move-result-object p13

    invoke-virtual {p11, p12, p13}, Lio/branch/referral/BranchLinkData;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 74
    iget-object p11, p0, Lio/branch/referral/ServerRequestCreateUrl;->linkPost_:Lio/branch/referral/BranchLinkData;

    sget-object p12, Lio/branch/referral/Defines$Jsonkey;->SessionID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p12}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p12

    iget-object p13, p0, Lio/branch/referral/ServerRequestCreateUrl;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {p13}, Lio/branch/referral/PrefHelper;->getSessionID()Ljava/lang/String;

    move-result-object p13

    invoke-virtual {p11, p12, p13}, Lio/branch/referral/BranchLinkData;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 75
    iget-object p11, p0, Lio/branch/referral/ServerRequestCreateUrl;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {p11}, Lio/branch/referral/PrefHelper;->getLinkClickID()Ljava/lang/String;

    move-result-object p11

    const-string p12, "bnc_no_value"

    invoke-virtual {p11, p12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p11

    if-nez p11, :cond_0

    .line 76
    iget-object p11, p0, Lio/branch/referral/ServerRequestCreateUrl;->linkPost_:Lio/branch/referral/BranchLinkData;

    sget-object p12, Lio/branch/referral/Defines$Jsonkey;->LinkClickID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p12}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p12

    iget-object p13, p0, Lio/branch/referral/ServerRequestCreateUrl;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {p13}, Lio/branch/referral/PrefHelper;->getLinkClickID()Ljava/lang/String;

    move-result-object p13

    invoke-virtual {p11, p12, p13}, Lio/branch/referral/BranchLinkData;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 79
    :cond_0
    iget-object p11, p0, Lio/branch/referral/ServerRequestCreateUrl;->linkPost_:Lio/branch/referral/BranchLinkData;

    invoke-virtual {p11, p3}, Lio/branch/referral/BranchLinkData;->putType(I)V

    .line 80
    iget-object p3, p0, Lio/branch/referral/ServerRequestCreateUrl;->linkPost_:Lio/branch/referral/BranchLinkData;

    invoke-virtual {p3, p4}, Lio/branch/referral/BranchLinkData;->putDuration(I)V

    .line 81
    iget-object p3, p0, Lio/branch/referral/ServerRequestCreateUrl;->linkPost_:Lio/branch/referral/BranchLinkData;

    invoke-virtual {p3, p5}, Lio/branch/referral/BranchLinkData;->putTags(Ljava/util/Collection;)V

    .line 82
    iget-object p3, p0, Lio/branch/referral/ServerRequestCreateUrl;->linkPost_:Lio/branch/referral/BranchLinkData;

    invoke-virtual {p3, p2}, Lio/branch/referral/BranchLinkData;->putAlias(Ljava/lang/String;)V

    .line 83
    iget-object p2, p0, Lio/branch/referral/ServerRequestCreateUrl;->linkPost_:Lio/branch/referral/BranchLinkData;

    invoke-virtual {p2, p6}, Lio/branch/referral/BranchLinkData;->putChannel(Ljava/lang/String;)V

    .line 84
    iget-object p2, p0, Lio/branch/referral/ServerRequestCreateUrl;->linkPost_:Lio/branch/referral/BranchLinkData;

    invoke-virtual {p2, p7}, Lio/branch/referral/BranchLinkData;->putFeature(Ljava/lang/String;)V

    .line 85
    iget-object p2, p0, Lio/branch/referral/ServerRequestCreateUrl;->linkPost_:Lio/branch/referral/BranchLinkData;

    invoke-virtual {p2, p8}, Lio/branch/referral/BranchLinkData;->putStage(Ljava/lang/String;)V

    .line 86
    iget-object p2, p0, Lio/branch/referral/ServerRequestCreateUrl;->linkPost_:Lio/branch/referral/BranchLinkData;

    invoke-virtual {p2, p9}, Lio/branch/referral/BranchLinkData;->putCampaign(Ljava/lang/String;)V

    .line 87
    iget-object p2, p0, Lio/branch/referral/ServerRequestCreateUrl;->linkPost_:Lio/branch/referral/BranchLinkData;

    invoke-virtual {p2, p10}, Lio/branch/referral/BranchLinkData;->putParams(Lorg/json/JSONObject;)V

    .line 89
    iget-object p2, p0, Lio/branch/referral/ServerRequestCreateUrl;->linkPost_:Lio/branch/referral/BranchLinkData;

    invoke-virtual {p0, p2}, Lio/branch/referral/ServerRequestCreateUrl;->setPost(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    .line 92
    invoke-virtual {p2}, Lorg/json/JSONException;->printStackTrace()V

    .line 93
    iput-boolean p1, p0, Lio/branch/referral/ServerRequestCreateUrl;->constructError_:Z

    :goto_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/json/JSONObject;Landroid/content/Context;)V
    .locals 0

    .line 99
    invoke-direct {p0, p1, p2, p3}, Lio/branch/referral/ServerRequest;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Landroid/content/Context;)V

    const/4 p1, 0x1

    .line 21
    iput-boolean p1, p0, Lio/branch/referral/ServerRequestCreateUrl;->isAsync_:Z

    .line 26
    iput-boolean p1, p0, Lio/branch/referral/ServerRequestCreateUrl;->defaultToLongUrl_:Z

    return-void
.end method

.method private generateLongUrlWithParams(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 197
    :try_start_0
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object v0

    invoke-virtual {v0}, Lio/branch/referral/Branch;->isTrackingDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "https://bnc.lt/a/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 199
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->getQuery()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 201
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "?"

    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, ""

    goto :goto_0

    :cond_1
    const-string v1, "?"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 202
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "?"

    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, ""

    goto :goto_1

    :cond_2
    const-string v1, "&"

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 204
    iget-object v0, p0, Lio/branch/referral/ServerRequestCreateUrl;->linkPost_:Lio/branch/referral/BranchLinkData;

    invoke-virtual {v0}, Lio/branch/referral/BranchLinkData;->getTags()Ljava/util/Collection;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 206
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_3

    .line 207
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_3

    .line 208
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lio/branch/referral/Defines$LinkParam;->Tags:Lio/branch/referral/Defines$LinkParam;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "UTF8"

    invoke-static {v1, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    .line 211
    :cond_4
    iget-object v0, p0, Lio/branch/referral/ServerRequestCreateUrl;->linkPost_:Lio/branch/referral/BranchLinkData;

    invoke-virtual {v0}, Lio/branch/referral/BranchLinkData;->getAlias()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 212
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_5

    .line 213
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lio/branch/referral/Defines$LinkParam;->Alias:Lio/branch/referral/Defines$LinkParam;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "UTF8"

    invoke-static {v0, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "&"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 216
    :cond_5
    iget-object v0, p0, Lio/branch/referral/ServerRequestCreateUrl;->linkPost_:Lio/branch/referral/BranchLinkData;

    invoke-virtual {v0}, Lio/branch/referral/BranchLinkData;->getChannel()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 217
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_6

    .line 218
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lio/branch/referral/Defines$LinkParam;->Channel:Lio/branch/referral/Defines$LinkParam;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "UTF8"

    invoke-static {v0, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "&"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 221
    :cond_6
    iget-object v0, p0, Lio/branch/referral/ServerRequestCreateUrl;->linkPost_:Lio/branch/referral/BranchLinkData;

    invoke-virtual {v0}, Lio/branch/referral/BranchLinkData;->getFeature()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 222
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_7

    .line 223
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lio/branch/referral/Defines$LinkParam;->Feature:Lio/branch/referral/Defines$LinkParam;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "UTF8"

    invoke-static {v0, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "&"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 226
    :cond_7
    iget-object v0, p0, Lio/branch/referral/ServerRequestCreateUrl;->linkPost_:Lio/branch/referral/BranchLinkData;

    invoke-virtual {v0}, Lio/branch/referral/BranchLinkData;->getStage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 227
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_8

    .line 228
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lio/branch/referral/Defines$LinkParam;->Stage:Lio/branch/referral/Defines$LinkParam;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "UTF8"

    invoke-static {v0, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "&"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 231
    :cond_8
    iget-object v0, p0, Lio/branch/referral/ServerRequestCreateUrl;->linkPost_:Lio/branch/referral/BranchLinkData;

    invoke-virtual {v0}, Lio/branch/referral/BranchLinkData;->getCampaign()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 232
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_9

    .line 233
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lio/branch/referral/Defines$LinkParam;->Campaign:Lio/branch/referral/Defines$LinkParam;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "UTF8"

    invoke-static {v0, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "&"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 236
    :cond_9
    iget-object v0, p0, Lio/branch/referral/ServerRequestCreateUrl;->linkPost_:Lio/branch/referral/BranchLinkData;

    invoke-virtual {v0}, Lio/branch/referral/BranchLinkData;->getType()I

    move-result v0

    int-to-long v0, v0

    .line 237
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lio/branch/referral/Defines$LinkParam;->Type:Lio/branch/referral/Defines$LinkParam;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, "&"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 239
    iget-object v0, p0, Lio/branch/referral/ServerRequestCreateUrl;->linkPost_:Lio/branch/referral/BranchLinkData;

    invoke-virtual {v0}, Lio/branch/referral/BranchLinkData;->getDuration()I

    move-result v0

    int-to-long v0, v0

    .line 240
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lio/branch/referral/Defines$LinkParam;->Duration:Lio/branch/referral/Defines$LinkParam;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 242
    iget-object v0, p0, Lio/branch/referral/ServerRequestCreateUrl;->linkPost_:Lio/branch/referral/BranchLinkData;

    invoke-virtual {v0}, Lio/branch/referral/BranchLinkData;->getParams()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 243
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_a

    .line 244
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    const/4 v1, 0x2

    .line 245
    invoke-static {v0, v1}, Lio/branch/referral/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF8"

    .line 246
    invoke-static {v0, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 247
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "&source=android&data="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    .line 250
    :catch_0
    iget-object v0, p0, Lio/branch/referral/ServerRequestCreateUrl;->callback_:Lio/branch/referral/Branch$BranchLinkCreateListener;

    const/4 v1, 0x0

    new-instance v2, Lio/branch/referral/BranchError;

    const-string v3, "Trouble creating a URL."

    const/16 v4, -0x74

    invoke-direct {v2, v3, v4}, Lio/branch/referral/BranchError;-><init>(Ljava/lang/String;I)V

    invoke-interface {v0, v1, v2}, Lio/branch/referral/Branch$BranchLinkCreateListener;->onLinkCreate(Ljava/lang/String;Lio/branch/referral/BranchError;)V

    :cond_a
    :goto_3
    return-object p1
.end method

.method private updateShareEventToFabric(Ljava/lang/String;)V
    .locals 3

    .line 266
    iget-object p1, p0, Lio/branch/referral/ServerRequestCreateUrl;->linkPost_:Lio/branch/referral/BranchLinkData;

    invoke-virtual {p1}, Lio/branch/referral/BranchLinkData;->getLinkDataJsonObject()Lorg/json/JSONObject;

    move-result-object p1

    .line 267
    invoke-virtual {p0}, Lio/branch/referral/ServerRequestCreateUrl;->isReqStartedFromBranchShareSheet()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 268
    new-instance v0, Lio/branch/referral/ExtendedAnswerProvider;

    invoke-direct {v0}, Lio/branch/referral/ExtendedAnswerProvider;-><init>()V

    const-string v1, "Branch Share"

    iget-object v2, p0, Lio/branch/referral/ServerRequestCreateUrl;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v2}, Lio/branch/referral/PrefHelper;->getIdentityID()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, p1, v2}, Lio/branch/referral/ExtendedAnswerProvider;->provideData(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public clearCallbacks()V
    .locals 1

    const/4 v0, 0x0

    .line 182
    iput-object v0, p0, Lio/branch/referral/ServerRequestCreateUrl;->callback_:Lio/branch/referral/Branch$BranchLinkCreateListener;

    return-void
.end method

.method public getLinkPost()Lio/branch/referral/BranchLinkData;
    .locals 1

    .line 103
    iget-object v0, p0, Lio/branch/referral/ServerRequestCreateUrl;->linkPost_:Lio/branch/referral/BranchLinkData;

    return-object v0
.end method

.method public getLongUrl()Ljava/lang/String;
    .locals 2

    .line 160
    iget-object v0, p0, Lio/branch/referral/ServerRequestCreateUrl;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getUserURL()Ljava/lang/String;

    move-result-object v0

    const-string v1, "bnc_no_value"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 161
    iget-object v0, p0, Lio/branch/referral/ServerRequestCreateUrl;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v0}, Lio/branch/referral/PrefHelper;->getUserURL()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/branch/referral/ServerRequestCreateUrl;->generateLongUrlWithParams(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 163
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "https://bnc.lt/a/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/branch/referral/ServerRequestCreateUrl;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v1}, Lio/branch/referral/PrefHelper;->getBranchKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/branch/referral/ServerRequestCreateUrl;->generateLongUrlWithParams(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public handleDuplicateURLError()V
    .locals 5

    .line 169
    iget-object v0, p0, Lio/branch/referral/ServerRequestCreateUrl;->callback_:Lio/branch/referral/Branch$BranchLinkCreateListener;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 170
    new-instance v2, Lio/branch/referral/BranchError;

    const-string v3, "Trouble creating a URL."

    const/16 v4, -0x69

    invoke-direct {v2, v3, v4}, Lio/branch/referral/BranchError;-><init>(Ljava/lang/String;I)V

    invoke-interface {v0, v1, v2}, Lio/branch/referral/Branch$BranchLinkCreateListener;->onLinkCreate(Ljava/lang/String;Lio/branch/referral/BranchError;)V

    :cond_0
    return-void
.end method

.method public handleErrors(Landroid/content/Context;)Z
    .locals 4

    .line 112
    invoke-super {p0, p1}, Lio/branch/referral/ServerRequest;->doesAppHasInternetPermission(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 113
    iget-object p1, p0, Lio/branch/referral/ServerRequestCreateUrl;->callback_:Lio/branch/referral/Branch$BranchLinkCreateListener;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 114
    new-instance v1, Lio/branch/referral/BranchError;

    const-string v2, "Trouble creating a URL."

    const/16 v3, -0x66

    invoke-direct {v1, v2, v3}, Lio/branch/referral/BranchError;-><init>(Ljava/lang/String;I)V

    invoke-interface {p1, v0, v1}, Lio/branch/referral/Branch$BranchLinkCreateListener;->onLinkCreate(Ljava/lang/String;Lio/branch/referral/BranchError;)V

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public handleFailure(ILjava/lang/String;)V
    .locals 5

    .line 149
    iget-object v0, p0, Lio/branch/referral/ServerRequestCreateUrl;->callback_:Lio/branch/referral/Branch$BranchLinkCreateListener;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 151
    iget-boolean v1, p0, Lio/branch/referral/ServerRequestCreateUrl;->defaultToLongUrl_:Z

    if-eqz v1, :cond_0

    .line 152
    invoke-virtual {p0}, Lio/branch/referral/ServerRequestCreateUrl;->getLongUrl()Ljava/lang/String;

    move-result-object v0

    .line 154
    :cond_0
    iget-object v1, p0, Lio/branch/referral/ServerRequestCreateUrl;->callback_:Lio/branch/referral/Branch$BranchLinkCreateListener;

    new-instance v2, Lio/branch/referral/BranchError;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Trouble creating a URL. "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v2, p2, p1}, Lio/branch/referral/BranchError;-><init>(Ljava/lang/String;I)V

    invoke-interface {v1, v0, v2}, Lio/branch/referral/Branch$BranchLinkCreateListener;->onLinkCreate(Ljava/lang/String;Lio/branch/referral/BranchError;)V

    :cond_1
    return-void
.end method

.method public isAsync()Z
    .locals 1

    .line 186
    iget-boolean v0, p0, Lio/branch/referral/ServerRequestCreateUrl;->isAsync_:Z

    return v0
.end method

.method isDefaultToLongUrl()Z
    .locals 1

    .line 107
    iget-boolean v0, p0, Lio/branch/referral/ServerRequestCreateUrl;->defaultToLongUrl_:Z

    return v0
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

.method isReqStartedFromBranchShareSheet()Z
    .locals 1

    .line 261
    iget-boolean v0, p0, Lio/branch/referral/ServerRequestCreateUrl;->isReqStartedFromBranchShareSheet_:Z

    return v0
.end method

.method public onRequestSucceeded(Lio/branch/referral/ServerResponse;Lio/branch/referral/Branch;)V
    .locals 1

    .line 124
    :try_start_0
    invoke-virtual {p1}, Lio/branch/referral/ServerResponse;->getObject()Lorg/json/JSONObject;

    move-result-object p1

    const-string/jumbo p2, "url"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 125
    iget-object p2, p0, Lio/branch/referral/ServerRequestCreateUrl;->callback_:Lio/branch/referral/Branch$BranchLinkCreateListener;

    if-eqz p2, :cond_0

    .line 126
    iget-object p2, p0, Lio/branch/referral/ServerRequestCreateUrl;->callback_:Lio/branch/referral/Branch$BranchLinkCreateListener;

    const/4 v0, 0x0

    invoke-interface {p2, p1, v0}, Lio/branch/referral/Branch$BranchLinkCreateListener;->onLinkCreate(Ljava/lang/String;Lio/branch/referral/BranchError;)V

    .line 128
    :cond_0
    invoke-direct {p0, p1}, Lio/branch/referral/ServerRequestCreateUrl;->updateShareEventToFabric(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 130
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public onUrlAvailable(Ljava/lang/String;)V
    .locals 2

    .line 141
    iget-object v0, p0, Lio/branch/referral/ServerRequestCreateUrl;->callback_:Lio/branch/referral/Branch$BranchLinkCreateListener;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 142
    invoke-interface {v0, p1, v1}, Lio/branch/referral/Branch$BranchLinkCreateListener;->onLinkCreate(Ljava/lang/String;Lio/branch/referral/BranchError;)V

    .line 144
    :cond_0
    invoke-direct {p0, p1}, Lio/branch/referral/ServerRequestCreateUrl;->updateShareEventToFabric(Ljava/lang/String;)V

    return-void
.end method

.method setIsReqStartedFromBranchShareSheet(Z)V
    .locals 0

    .line 257
    iput-boolean p1, p0, Lio/branch/referral/ServerRequestCreateUrl;->isReqStartedFromBranchShareSheet_:Z

    return-void
.end method
