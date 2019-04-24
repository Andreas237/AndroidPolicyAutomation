.class public abstract Lio/branch/referral/network/BranchRemoteInterface;
.super Ljava/lang/Object;
.source "BranchRemoteInterface.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/branch/referral/network/BranchRemoteInterface$BranchRemoteException;,
        Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;
    }
.end annotation


# static fields
.field public static final RETRY_NUMBER:Ljava/lang/String; = "retryNumber"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private addCommonParams(Lorg/json/JSONObject;Ljava/lang/String;)Z
    .locals 2

    .line 203
    :try_start_0
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->UserData:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 204
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->SDK:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android2.19.5"

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    const-string v0, "bnc_no_value"

    .line 206
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 207
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->BranchKey:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private convertJSONtoString(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 8

    .line 217
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz p1, :cond_1

    .line 219
    invoke-virtual {p1}, Lorg/json/JSONObject;->names()Lorg/json/JSONArray;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 222
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    move v5, v4

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_1

    .line 225
    :try_start_0
    invoke-virtual {v1, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    if-eqz v5, :cond_0

    const-string v5, "?"

    .line 228
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v5, v3

    goto :goto_1

    :cond_0
    const-string v7, "&"

    .line 231
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    :goto_1
    invoke-virtual {p1, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 235
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "="

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 237
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    const/4 p1, 0x0

    return-object p1

    .line 244
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public static final getDefaultBranchRemoteInterface(Landroid/content/Context;)Lio/branch/referral/network/BranchRemoteInterface;
    .locals 1

    .line 159
    new-instance v0, Lio/branch/referral/network/BranchRemoteInterfaceUrlConnection;

    invoke-direct {v0, p0}, Lio/branch/referral/network/BranchRemoteInterfaceUrlConnection;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method private processEntityForJSON(Ljava/lang/String;ILjava/lang/String;)Lio/branch/referral/ServerResponse;
    .locals 2

    .line 182
    new-instance v0, Lio/branch/referral/ServerResponse;

    invoke-direct {v0, p3, p2}, Lio/branch/referral/ServerResponse;-><init>(Ljava/lang/String;I)V

    const-string p2, "BranchSDK"

    .line 183
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "returned "

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3}, Lio/branch/referral/PrefHelper;->Debug(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 187
    :try_start_0
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 188
    invoke-virtual {v0, p2}, Lio/branch/referral/ServerResponse;->setPost(Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 191
    :catch_0
    :try_start_1
    new-instance p2, Lorg/json/JSONArray;

    invoke-direct {p2, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 192
    invoke-virtual {v0, p2}, Lio/branch/referral/ServerResponse;->setPost(Ljava/lang/Object;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 194
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "JSON exception: "

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lio/branch/referral/PrefHelper;->Debug(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-object v0
.end method


# virtual methods
.method public abstract doRestfulGet(Ljava/lang/String;)Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/branch/referral/network/BranchRemoteInterface$BranchRemoteException;
        }
    .end annotation
.end method

.method public abstract doRestfulPost(Ljava/lang/String;Lorg/json/JSONObject;)Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/branch/referral/network/BranchRemoteInterface$BranchRemoteException;
        }
    .end annotation
.end method

.method public final make_restful_get(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lio/branch/referral/ServerResponse;
    .locals 4

    if-eqz p2, :cond_0

    goto :goto_0

    .line 88
    :cond_0
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    .line 89
    :goto_0
    invoke-direct {p0, p2, p4}, Lio/branch/referral/network/BranchRemoteInterface;->addCommonParams(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_6

    .line 90
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p2}, Lio/branch/referral/network/BranchRemoteInterface;->convertJSONtoString(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 95
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-string p2, "BranchSDK"

    .line 96
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getting "

    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-static {p2, p4}, Lio/branch/referral/PrefHelper;->Debug(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    :try_start_0
    invoke-virtual {p0, p1}, Lio/branch/referral/network/BranchRemoteInterface;->doRestfulGet(Ljava/lang/String;)Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;

    move-result-object p1

    .line 100
    invoke-static {p1}, Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;->access$000(Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1}, Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;->access$100(Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;)I

    move-result p1

    invoke-direct {p0, p2, p1, p3}, Lio/branch/referral/network/BranchRemoteInterface;->processEntityForJSON(Ljava/lang/String;ILjava/lang/String;)Lio/branch/referral/ServerResponse;

    move-result-object p1
    :try_end_0
    .catch Lio/branch/referral/network/BranchRemoteInterface$BranchRemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 110
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    long-to-int p2, v2

    .line 111
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object p4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "-"

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p3, Lio/branch/referral/Defines$Jsonkey;->Branch_Round_Trip_Time:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p3, p2}, Lio/branch/referral/Branch;->addExtraInstrumentationData(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 102
    :try_start_1
    invoke-static {p1}, Lio/branch/referral/network/BranchRemoteInterface$BranchRemoteException;->access$200(Lio/branch/referral/network/BranchRemoteInterface$BranchRemoteException;)I

    move-result p1

    const/16 p2, -0x6f

    if-ne p1, p2, :cond_3

    .line 103
    new-instance p1, Lio/branch/referral/ServerResponse;

    invoke-direct {p1, p3, p2}, Lio/branch/referral/ServerResponse;-><init>(Ljava/lang/String;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 109
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 110
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    long-to-int p2, v2

    .line 111
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object p4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "-"

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p3, Lio/branch/referral/Defines$Jsonkey;->Branch_Round_Trip_Time:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p3, p2}, Lio/branch/referral/Branch;->addExtraInstrumentationData(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-object p1

    .line 105
    :cond_3
    :try_start_2
    new-instance p1, Lio/branch/referral/ServerResponse;

    const/16 p2, -0x71

    invoke-direct {p1, p3, p2}, Lio/branch/referral/ServerResponse;-><init>(Ljava/lang/String;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 109
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 110
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    long-to-int p2, v2

    .line 111
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object p4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "-"

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p3, Lio/branch/referral/Defines$Jsonkey;->Branch_Round_Trip_Time:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p3, p2}, Lio/branch/referral/Branch;->addExtraInstrumentationData(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    return-object p1

    .line 109
    :goto_1
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object p2

    if-eqz p2, :cond_5

    .line 110
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    long-to-int p2, v2

    .line 111
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object p4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "-"

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p3, Lio/branch/referral/Defines$Jsonkey;->Branch_Round_Trip_Time:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p3, p2}, Lio/branch/referral/Branch;->addExtraInstrumentationData(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    :cond_5
    throw p1

    .line 92
    :cond_6
    new-instance p1, Lio/branch/referral/ServerResponse;

    const/16 p2, -0x72

    invoke-direct {p1, p3, p2}, Lio/branch/referral/ServerResponse;-><init>(Ljava/lang/String;I)V

    return-object p1
.end method

.method public final make_restful_post(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/branch/referral/ServerResponse;
    .locals 4

    .line 126
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    if-eqz p1, :cond_0

    goto :goto_0

    .line 127
    :cond_0
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 129
    :goto_0
    invoke-direct {p0, p1, p4}, Lio/branch/referral/network/BranchRemoteInterface;->addCommonParams(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result p4

    if-nez p4, :cond_1

    .line 130
    new-instance p1, Lio/branch/referral/ServerResponse;

    const/16 p2, -0x72

    invoke-direct {p1, p3, p2}, Lio/branch/referral/ServerResponse;-><init>(Ljava/lang/String;I)V

    return-object p1

    :cond_1
    const-string p4, "BranchSDK"

    .line 132
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "posting to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p4, v2}, Lio/branch/referral/PrefHelper;->Debug(Ljava/lang/String;Ljava/lang/String;)V

    const-string p4, "BranchSDK"

    .line 133
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Post value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p4, v2}, Lio/branch/referral/PrefHelper;->Debug(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    :try_start_0
    invoke-virtual {p0, p2, p1}, Lio/branch/referral/network/BranchRemoteInterface;->doRestfulPost(Ljava/lang/String;Lorg/json/JSONObject;)Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;

    move-result-object p1

    .line 137
    invoke-static {p1}, Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;->access$000(Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1}, Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;->access$100(Lio/branch/referral/network/BranchRemoteInterface$BranchResponse;)I

    move-result p1

    invoke-direct {p0, p2, p1, p3}, Lio/branch/referral/network/BranchRemoteInterface;->processEntityForJSON(Ljava/lang/String;ILjava/lang/String;)Lio/branch/referral/ServerResponse;

    move-result-object p1
    :try_end_0
    .catch Lio/branch/referral/network/BranchRemoteInterface$BranchRemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 146
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    long-to-int p2, v2

    .line 147
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object p4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "-"

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p3, Lio/branch/referral/Defines$Jsonkey;->Branch_Round_Trip_Time:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p3, p2}, Lio/branch/referral/Branch;->addExtraInstrumentationData(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 139
    :try_start_1
    invoke-static {p1}, Lio/branch/referral/network/BranchRemoteInterface$BranchRemoteException;->access$200(Lio/branch/referral/network/BranchRemoteInterface$BranchRemoteException;)I

    move-result p1

    const/16 p2, -0x6f

    if-ne p1, p2, :cond_4

    .line 140
    new-instance p1, Lio/branch/referral/ServerResponse;

    invoke-direct {p1, p3, p2}, Lio/branch/referral/ServerResponse;-><init>(Ljava/lang/String;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 145
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 146
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    long-to-int p2, v2

    .line 147
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object p4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "-"

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p3, Lio/branch/referral/Defines$Jsonkey;->Branch_Round_Trip_Time:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p3, p2}, Lio/branch/referral/Branch;->addExtraInstrumentationData(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    return-object p1

    .line 142
    :cond_4
    :try_start_2
    new-instance p1, Lio/branch/referral/ServerResponse;

    const/16 p2, -0x71

    invoke-direct {p1, p3, p2}, Lio/branch/referral/ServerResponse;-><init>(Ljava/lang/String;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 145
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object p2

    if-eqz p2, :cond_5

    .line 146
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    long-to-int p2, v2

    .line 147
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object p4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "-"

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p3, Lio/branch/referral/Defines$Jsonkey;->Branch_Round_Trip_Time:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p3, p2}, Lio/branch/referral/Branch;->addExtraInstrumentationData(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    return-object p1

    .line 145
    :goto_1
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object p2

    if-eqz p2, :cond_6

    .line 146
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    long-to-int p2, v2

    .line 147
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object p4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "-"

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p3, Lio/branch/referral/Defines$Jsonkey;->Branch_Round_Trip_Time:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p3}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p3, p2}, Lio/branch/referral/Branch;->addExtraInstrumentationData(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    :cond_6
    throw p1
.end method
