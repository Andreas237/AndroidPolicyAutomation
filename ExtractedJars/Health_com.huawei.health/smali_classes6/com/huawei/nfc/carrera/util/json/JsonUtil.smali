.class public final Lcom/huawei/nfc/carrera/util/json/JsonUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "JsonUtil"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    return-void
.end method

.method public static getDoubleValue(Lorg/json/JSONObject;Ljava/lang/String;)D
    .locals 5

    .line 124
    const-wide/16 v2, 0x0

    .line 125
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 129
    :try_start_0
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v2, v0

    .line 134
    goto :goto_0

    .line 131
    :catch_0
    move-exception v4

    .line 133
    const-string v0, "JsonUtil"

    const-string v1, "getDoubleValue failed."

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    :cond_0
    :goto_0
    return-wide v2
.end method

.method public static getIntValue(Lorg/json/JSONObject;Ljava/lang/String;I)I
    .locals 3

    .line 61
    move v1, p2

    .line 62
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 66
    :try_start_0
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    .line 71
    goto :goto_0

    .line 68
    :catch_0
    move-exception v2

    .line 70
    move v1, p2

    .line 73
    :cond_0
    :goto_0
    return v1
.end method

.method public static getJsonArray(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONArray;
    .locals 4

    .line 95
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 97
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 101
    :try_start_0
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 103
    :catch_0
    move-exception v3

    .line 106
    const-string v0, "JsonUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getJsonArray failed:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static getJsonObject(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 4

    .line 148
    const/4 v2, 0x0

    .line 151
    :try_start_0
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 156
    goto :goto_0

    .line 153
    :catch_0
    move-exception v3

    .line 155
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getJsonObject error:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 157
    :goto_0
    return-object v2
.end method

.method public static getLongValue(Lorg/json/JSONObject;Ljava/lang/String;J)J
    .locals 4

    .line 78
    move-wide v1, p2

    .line 79
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 83
    :try_start_0
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v1

    .line 88
    goto :goto_0

    .line 85
    :catch_0
    move-exception v3

    .line 87
    move-wide v1, p2

    .line 90
    :cond_0
    :goto_0
    return-wide v1
.end method

.method public static getStringArrayValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 169
    const/4 v1, 0x0

    .line 172
    :try_start_0
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 173
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 175
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v1, v0

    .line 176
    const/4 v3, 0x0

    .line 177
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v4, v0, :cond_0

    .line 179
    invoke-virtual {v2, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 180
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 177
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 187
    :cond_0
    goto :goto_1

    .line 184
    :catch_0
    move-exception v2

    .line 186
    const-string v0, "getStringArrayValue, json exception."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 189
    :goto_1
    return-object v1
.end method

.method public static getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 36
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 40
    :try_start_0
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 42
    :catch_0
    move-exception v1

    .line 44
    const/4 v0, 0x0

    return-object v0

    .line 47
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
