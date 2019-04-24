.class Lio/branch/referral/ServerRequestRegisterView;
.super Lio/branch/referral/ServerRequest;
.source "ServerRequestRegisterView.java"


# instance fields
.field callback_:Lio/branch/indexing/BranchUniversalObject$RegisterViewStatusListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/branch/indexing/BranchUniversalObject;Lio/branch/referral/SystemObserver;Lio/branch/indexing/BranchUniversalObject$RegisterViewStatusListener;)V
    .locals 1

    .line 29
    sget-object v0, Lio/branch/referral/Defines$RequestPath;->RegisterView:Lio/branch/referral/Defines$RequestPath;

    invoke-virtual {v0}, Lio/branch/referral/Defines$RequestPath;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lio/branch/referral/ServerRequest;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 30
    iput-object p4, p0, Lio/branch/referral/ServerRequestRegisterView;->callback_:Lio/branch/indexing/BranchUniversalObject$RegisterViewStatusListener;

    .line 33
    :try_start_0
    invoke-direct {p0, p2, p3}, Lio/branch/referral/ServerRequestRegisterView;->createContentViewJson(Lio/branch/indexing/BranchUniversalObject;Lio/branch/referral/SystemObserver;)Lorg/json/JSONObject;

    move-result-object p1

    .line 34
    invoke-virtual {p0, p1}, Lio/branch/referral/ServerRequestRegisterView;->setPost(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 36
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    const/4 p1, 0x1

    .line 37
    iput-boolean p1, p0, Lio/branch/referral/ServerRequestRegisterView;->constructError_:Z

    :goto_0
    return-void
.end method

.method private createContentViewJson(Lio/branch/indexing/BranchUniversalObject;Lio/branch/referral/SystemObserver;)Lorg/json/JSONObject;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 86
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 89
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Android "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    iget-object v1, p0, Lio/branch/referral/ServerRequestRegisterView;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v1}, Lio/branch/referral/PrefHelper;->getSessionID()Ljava/lang/String;

    move-result-object v1

    .line 92
    sget-object v2, Lio/branch/referral/Defines$Jsonkey;->SessionID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 93
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->DeviceFingerprintID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/ServerRequestRegisterView;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v2}, Lio/branch/referral/PrefHelper;->getDeviceFingerPrintID()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 96
    invoke-static {}, Lio/branch/referral/DeviceInfo;->getInstance()Lio/branch/referral/DeviceInfo;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 97
    invoke-static {}, Lio/branch/referral/DeviceInfo;->getInstance()Lio/branch/referral/DeviceInfo;

    move-result-object v1

    invoke-virtual {v1}, Lio/branch/referral/DeviceInfo;->getHardwareID()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 99
    :cond_0
    iget-object v1, p0, Lio/branch/referral/ServerRequestRegisterView;->prefHelper_:Lio/branch/referral/PrefHelper;

    invoke-virtual {v1}, Lio/branch/referral/PrefHelper;->getExternDebug()Z

    move-result v1

    invoke-virtual {p2, v1}, Lio/branch/referral/SystemObserver;->getUniqueID(Z)Ljava/lang/String;

    move-result-object v1

    :goto_0
    const-string v2, "bnc_no_value"

    .line 101
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p2}, Lio/branch/referral/SystemObserver;->hasRealHardwareId()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 102
    sget-object v2, Lio/branch/referral/Defines$Jsonkey;->HardwareID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 105
    :cond_1
    invoke-virtual {p2}, Lio/branch/referral/SystemObserver;->getAppVersion()Ljava/lang/String;

    move-result-object p2

    const-string v1, "bnc_no_value"

    .line 106
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 107
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->AppVersion:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 110
    :cond_2
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    .line 112
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->ContentKeyWords:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/branch/indexing/BranchUniversalObject;->getKeywordsJsonArray()Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 113
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->PublicallyIndexable:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/branch/indexing/BranchUniversalObject;->isPublicallyIndexable()Z

    move-result v2

    invoke-virtual {p2, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 114
    invoke-virtual {p1}, Lio/branch/indexing/BranchUniversalObject;->getPrice()D

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmpl-double v1, v1, v3

    if-lez v1, :cond_3

    .line 115
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->Price:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/branch/indexing/BranchUniversalObject;->getPrice()D

    move-result-wide v2

    invoke-virtual {p2, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 118
    :cond_3
    invoke-virtual {p1}, Lio/branch/indexing/BranchUniversalObject;->getCanonicalIdentifier()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 119
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_4

    .line 120
    sget-object v2, Lio/branch/referral/Defines$Jsonkey;->CanonicalIdentifier:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 122
    :cond_4
    invoke-virtual {p1}, Lio/branch/indexing/BranchUniversalObject;->getCanonicalUrl()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 123
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_5

    .line 124
    sget-object v2, Lio/branch/referral/Defines$Jsonkey;->CanonicalUrl:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 126
    :cond_5
    invoke-virtual {p1}, Lio/branch/indexing/BranchUniversalObject;->getTitle()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 127
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_6

    .line 128
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->ContentTitle:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/branch/indexing/BranchUniversalObject;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 130
    :cond_6
    invoke-virtual {p1}, Lio/branch/indexing/BranchUniversalObject;->getDescription()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    .line 131
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_7

    .line 132
    sget-object v2, Lio/branch/referral/Defines$Jsonkey;->ContentDesc:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 134
    :cond_7
    invoke-virtual {p1}, Lio/branch/indexing/BranchUniversalObject;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_8

    .line 135
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_8

    .line 136
    sget-object v2, Lio/branch/referral/Defines$Jsonkey;->ContentImgUrl:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 138
    :cond_8
    invoke-virtual {p1}, Lio/branch/indexing/BranchUniversalObject;->getType()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_9

    .line 139
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_9

    .line 140
    sget-object v2, Lio/branch/referral/Defines$Jsonkey;->ContentType:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 142
    :cond_9
    invoke-virtual {p1}, Lio/branch/indexing/BranchUniversalObject;->getExpirationTime()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-lez v1, :cond_a

    .line 144
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->ContentExpiryTime:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/branch/indexing/BranchUniversalObject;->getExpirationTime()J

    move-result-wide v2

    invoke-virtual {p2, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 147
    :cond_a
    sget-object v1, Lio/branch/referral/Defines$Jsonkey;->Params:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 149
    invoke-virtual {p1}, Lio/branch/indexing/BranchUniversalObject;->getMetadata()Ljava/util/HashMap;

    move-result-object p1

    .line 150
    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object p2

    .line 151
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 152
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 153
    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    .line 155
    :cond_b
    sget-object p1, Lio/branch/referral/Defines$Jsonkey;->Metadata:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object v0
.end method


# virtual methods
.method public clearCallbacks()V
    .locals 1

    const/4 v0, 0x0

    .line 73
    iput-object v0, p0, Lio/branch/referral/ServerRequestRegisterView;->callback_:Lio/branch/indexing/BranchUniversalObject$RegisterViewStatusListener;

    return-void
.end method

.method public handleErrors(Landroid/content/Context;)Z
    .locals 4

    .line 57
    invoke-super {p0, p1}, Lio/branch/referral/ServerRequest;->doesAppHasInternetPermission(Landroid/content/Context;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_1

    .line 58
    iget-object p1, p0, Lio/branch/referral/ServerRequestRegisterView;->callback_:Lio/branch/indexing/BranchUniversalObject$RegisterViewStatusListener;

    if-eqz p1, :cond_0

    .line 59
    new-instance v1, Lio/branch/referral/BranchError;

    const-string v2, "Unable to register content view"

    const/16 v3, -0x66

    invoke-direct {v1, v2, v3}, Lio/branch/referral/BranchError;-><init>(Ljava/lang/String;I)V

    invoke-interface {p1, v0, v1}, Lio/branch/indexing/BranchUniversalObject$RegisterViewStatusListener;->onRegisterViewFinished(ZLio/branch/referral/BranchError;)V

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method

.method public handleFailure(ILjava/lang/String;)V
    .locals 5

    .line 50
    iget-object v0, p0, Lio/branch/referral/ServerRequestRegisterView;->callback_:Lio/branch/indexing/BranchUniversalObject$RegisterViewStatusListener;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 51
    new-instance v2, Lio/branch/referral/BranchError;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unable to register content view. "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v2, p2, p1}, Lio/branch/referral/BranchError;-><init>(Ljava/lang/String;I)V

    invoke-interface {v0, v1, v2}, Lio/branch/indexing/BranchUniversalObject$RegisterViewStatusListener;->onRegisterViewFinished(ZLio/branch/referral/BranchError;)V

    :cond_0
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
    .locals 1

    .line 43
    iget-object p1, p0, Lio/branch/referral/ServerRequestRegisterView;->callback_:Lio/branch/indexing/BranchUniversalObject$RegisterViewStatusListener;

    if-eqz p1, :cond_0

    const/4 p2, 0x1

    const/4 v0, 0x0

    .line 44
    invoke-interface {p1, p2, v0}, Lio/branch/indexing/BranchUniversalObject$RegisterViewStatusListener;->onRegisterViewFinished(ZLio/branch/referral/BranchError;)V

    :cond_0
    return-void
.end method
