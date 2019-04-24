.class public Lio/branch/referral/BranchUtil$JsonReader;
.super Ljava/lang/Object;
.source "BranchUtil.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/branch/referral/BranchUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "JsonReader"
.end annotation


# instance fields
.field private final jsonObject:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 2

    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 92
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    .line 95
    :catch_0
    iput-object v0, p0, Lio/branch/referral/BranchUtil$JsonReader;->jsonObject:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public getJsonObject()Lorg/json/JSONObject;
    .locals 1

    .line 99
    iget-object v0, p0, Lio/branch/referral/BranchUtil$JsonReader;->jsonObject:Lorg/json/JSONObject;

    return-object v0
.end method

.method public has(Ljava/lang/String;)Z
    .locals 1

    .line 169
    iget-object v0, p0, Lio/branch/referral/BranchUtil$JsonReader;->jsonObject:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public keys()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 173
    iget-object v0, p0, Lio/branch/referral/BranchUtil$JsonReader;->jsonObject:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public readOut(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 163
    iget-object v0, p0, Lio/branch/referral/BranchUtil$JsonReader;->jsonObject:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 164
    iget-object v1, p0, Lio/branch/referral/BranchUtil$JsonReader;->jsonObject:Lorg/json/JSONObject;

    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    return-object v0
.end method

.method public readOutBoolean(Ljava/lang/String;)Z
    .locals 2

    .line 151
    iget-object v0, p0, Lio/branch/referral/BranchUtil$JsonReader;->jsonObject:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v0

    .line 152
    iget-object v1, p0, Lio/branch/referral/BranchUtil$JsonReader;->jsonObject:Lorg/json/JSONObject;

    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    return v0
.end method

.method public readOutDouble(Ljava/lang/String;)D
    .locals 3

    .line 136
    iget-object v0, p0, Lio/branch/referral/BranchUtil$JsonReader;->jsonObject:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v0

    .line 137
    iget-object v2, p0, Lio/branch/referral/BranchUtil$JsonReader;->jsonObject:Lorg/json/JSONObject;

    invoke-virtual {v2, p1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    return-wide v0
.end method

.method public readOutDouble(Ljava/lang/String;Ljava/lang/Double;)Ljava/lang/Double;
    .locals 2

    .line 143
    iget-object v0, p0, Lio/branch/referral/BranchUtil$JsonReader;->jsonObject:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 144
    iget-object p2, p0, Lio/branch/referral/BranchUtil$JsonReader;->jsonObject:Lorg/json/JSONObject;

    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    .line 145
    iget-object v0, p0, Lio/branch/referral/BranchUtil$JsonReader;->jsonObject:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    :cond_0
    return-object p2
.end method

.method public readOutInt(Ljava/lang/String;)I
    .locals 2

    .line 103
    iget-object v0, p0, Lio/branch/referral/BranchUtil$JsonReader;->jsonObject:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    .line 104
    iget-object v1, p0, Lio/branch/referral/BranchUtil$JsonReader;->jsonObject:Lorg/json/JSONObject;

    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    return v0
.end method

.method public readOutInt(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 1

    .line 110
    iget-object v0, p0, Lio/branch/referral/BranchUtil$JsonReader;->jsonObject:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 111
    iget-object p2, p0, Lio/branch/referral/BranchUtil$JsonReader;->jsonObject:Lorg/json/JSONObject;

    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    .line 112
    iget-object v0, p0, Lio/branch/referral/BranchUtil$JsonReader;->jsonObject:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    :cond_0
    return-object p2
.end method

.method public readOutJsonArray(Ljava/lang/String;)Lorg/json/JSONArray;
    .locals 2

    .line 157
    iget-object v0, p0, Lio/branch/referral/BranchUtil$JsonReader;->jsonObject:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 158
    iget-object v1, p0, Lio/branch/referral/BranchUtil$JsonReader;->jsonObject:Lorg/json/JSONObject;

    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    return-object v0
.end method

.method public readOutLong(Ljava/lang/String;)J
    .locals 3

    .line 130
    iget-object v0, p0, Lio/branch/referral/BranchUtil$JsonReader;->jsonObject:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    .line 131
    iget-object v2, p0, Lio/branch/referral/BranchUtil$JsonReader;->jsonObject:Lorg/json/JSONObject;

    invoke-virtual {v2, p1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    return-wide v0
.end method

.method public readOutString(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 118
    iget-object v0, p0, Lio/branch/referral/BranchUtil$JsonReader;->jsonObject:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 119
    iget-object v1, p0, Lio/branch/referral/BranchUtil$JsonReader;->jsonObject:Lorg/json/JSONObject;

    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    return-object v0
.end method

.method public readOutString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 124
    iget-object v0, p0, Lio/branch/referral/BranchUtil$JsonReader;->jsonObject:Lorg/json/JSONObject;

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 125
    iget-object v0, p0, Lio/branch/referral/BranchUtil$JsonReader;->jsonObject:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    return-object p2
.end method
