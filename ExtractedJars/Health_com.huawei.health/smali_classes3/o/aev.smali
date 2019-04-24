.class public Lo/aev;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Landroid/content/Context;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    const-string v0, "threedevicecloudSPfile"

    iput-object v0, p0, Lo/aev;->e:Ljava/lang/String;

    .line 29
    iget-object v0, p0, Lo/aev;->e:Ljava/lang/String;

    iput-object v0, p0, Lo/aev;->d:Ljava/lang/String;

    .line 30
    iput-object p1, p0, Lo/aev;->b:Landroid/content/Context;

    .line 31
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    const-string v0, "threedevicecloudSPfile"

    iput-object v0, p0, Lo/aev;->e:Ljava/lang/String;

    .line 33
    iput-object p2, p0, Lo/aev;->d:Ljava/lang/String;

    .line 34
    iput-object p1, p0, Lo/aev;->b:Landroid/content/Context;

    .line 35
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)J
    .locals 5

    .line 106
    iget-object v0, p0, Lo/aev;->b:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 107
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLongData mContext is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    const-wide/16 v0, 0x0

    return-wide v0

    .line 110
    :cond_0
    iget-object v0, p0, Lo/aev;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/aev;->d:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 111
    invoke-interface {v4, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 112
    const-wide/16 v0, 0x0

    return-wide v0

    .line 114
    :cond_1
    const-wide/16 v0, 0x0

    invoke-interface {v4, p1, v0, v1}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public a(Ljava/lang/String;Ljava/util/Map;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 169
    iget-object v0, p0, Lo/aev;->b:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 170
    return-void

    .line 172
    :cond_0
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 173
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 175
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 177
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 178
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/Map$Entry;

    .line 180
    :try_start_0
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 183
    goto :goto_1

    .line 181
    :catch_0
    move-exception v8

    .line 182
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHashMapData :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    :goto_1
    goto :goto_0

    .line 185
    :cond_1
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 187
    iget-object v0, p0, Lo/aev;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/aev;->d:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v7

    .line 189
    invoke-interface {v7}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v8

    .line 190
    invoke-virtual {v4}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v8, p1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 191
    invoke-interface {v8}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 192
    return-void
.end method

.method public b(Ljava/lang/String;J)V
    .locals 5

    .line 118
    iget-object v0, p0, Lo/aev;->b:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 119
    return-void

    .line 121
    :cond_0
    iget-object v0, p0, Lo/aev;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/aev;->d:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 122
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    .line 123
    invoke-interface {v4, p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 124
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 125
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 37
    if-eqz p2, :cond_0

    iget-object v0, p0, Lo/aev;->b:Landroid/content/Context;

    if-nez v0, :cond_1

    .line 38
    :cond_0
    return-void

    .line 40
    :cond_1
    iget-object v0, p0, Lo/aev;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/aev;->d:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 41
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    .line 42
    invoke-interface {v4, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 43
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 44
    return-void
.end method

.method public b(Ljava/lang/String;)Z
    .locals 5

    .line 81
    iget-object v0, p0, Lo/aev;->b:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 82
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStatusFromSharePreferences mContext is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    const/4 v0, 0x0

    return v0

    .line 85
    :cond_0
    iget-object v0, p0, Lo/aev;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/aev;->d:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 86
    invoke-interface {v4, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 87
    const/4 v0, 0x0

    return v0

    .line 89
    :cond_1
    const/4 v0, 0x0

    invoke-interface {v4, p1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public c(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 57
    const-string v4, "0"

    .line 58
    iget-object v0, p0, Lo/aev;->b:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 59
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceCloudSharePreferencesManager getFreshTimeFromSharePreferences mContext is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    return-object v4

    .line 62
    :cond_0
    iget-object v0, p0, Lo/aev;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/aev;->d:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v5

    .line 63
    invoke-interface {v5, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 64
    return-object v4

    .line 66
    :cond_1
    invoke-interface {v5, p1, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;Z)V
    .locals 5

    .line 71
    iget-object v0, p0, Lo/aev;->b:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 72
    return-void

    .line 74
    :cond_0
    iget-object v0, p0, Lo/aev;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/aev;->d:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 75
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    .line 76
    invoke-interface {v4, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 77
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 78
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 140
    iget-object v0, p0, Lo/aev;->b:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 141
    return-void

    .line 143
    :cond_0
    iget-object v0, p0, Lo/aev;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/aev;->d:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 144
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    .line 145
    invoke-interface {v4, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 146
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 147
    return-void
.end method

.method public d(Ljava/lang/String;Z)V
    .locals 5

    .line 47
    iget-object v0, p0, Lo/aev;->b:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 48
    return-void

    .line 50
    :cond_0
    iget-object v0, p0, Lo/aev;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/aev;->d:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 51
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    .line 52
    invoke-interface {v4, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 53
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 54
    return-void
.end method

.method public d(Ljava/lang/String;)Z
    .locals 4

    .line 93
    iget-object v0, p0, Lo/aev;->b:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 94
    const/4 v0, 0x0

    return v0

    .line 97
    :cond_0
    iget-object v0, p0, Lo/aev;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/aev;->d:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 99
    invoke-interface {v3, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 100
    const/4 v0, 0x0

    return v0

    .line 102
    :cond_1
    const/4 v0, 0x0

    invoke-interface {v3, p1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public e(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 128
    iget-object v0, p0, Lo/aev;->b:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 129
    const-string v0, ""

    return-object v0

    .line 131
    :cond_0
    iget-object v0, p0, Lo/aev;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/aev;->d:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 133
    invoke-interface {v3, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 134
    const-string v0, ""

    return-object v0

    .line 136
    :cond_1
    const-string v0, ""

    invoke-interface {v3, p1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g(Ljava/lang/String;)Ljava/util/Map;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 195
    iget-object v0, p0, Lo/aev;->b:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 196
    const/4 v0, 0x0

    return-object v0

    .line 198
    :cond_0
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 199
    iget-object v0, p0, Lo/aev;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/aev;->d:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v5

    .line 200
    const-string v0, ""

    invoke-interface {v5, p1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 202
    :try_start_0
    new-instance v7, Lorg/json/JSONArray;

    invoke-direct {v7, v6}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 203
    const/4 v8, 0x0

    :goto_0
    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v8, v0, :cond_2

    .line 204
    invoke-virtual {v7, v8}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v9

    .line 205
    invoke-virtual {v9}, Lorg/json/JSONObject;->names()Lorg/json/JSONArray;

    move-result-object v10

    .line 206
    if-eqz v10, :cond_1

    .line 207
    const/4 v11, 0x0

    :goto_1
    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v11, v0, :cond_1

    .line 208
    invoke-virtual {v10, v11}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v12

    .line 209
    invoke-virtual {v9, v12}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 210
    invoke-interface {v4, v12, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 207
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 203
    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 216
    :cond_2
    goto :goto_2

    .line 214
    :catch_0
    move-exception v7

    .line 215
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHashMapData :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    :goto_2
    return-object v4
.end method
