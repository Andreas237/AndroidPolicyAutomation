.class Lcom/yandex/metrica/impl/ob/hl;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(JLjava/lang/String;)Lcom/yandex/metrica/impl/ob/he;
    .locals 13
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 58
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 60
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p2, "receive_timestamp"

    const-wide/16 v2, 0x0

    .line 62
    invoke-virtual {v0, p2, v2, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v6

    const-string p2, "collection_mode"

    .line 64
    invoke-virtual {v0, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/yandex/metrica/impl/ob/gs$a;->a(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/gs$a;

    move-result-object v5

    .line 66
    new-instance v8, Landroid/location/Location;

    const-string p2, "provider"

    invoke-virtual {v0, p2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v8, p2}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    const-string p2, "lon"

    const-wide/16 v9, 0x0

    .line 67
    invoke-virtual {v0, p2, v9, v10}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v11

    invoke-virtual {v8, v11, v12}, Landroid/location/Location;->setLongitude(D)V

    const-string p2, "lat"

    .line 68
    invoke-virtual {v0, p2, v9, v10}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v11

    invoke-virtual {v8, v11, v12}, Landroid/location/Location;->setLatitude(D)V

    const-string p2, "timestamp"

    .line 69
    invoke-virtual {v0, p2, v2, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v2

    invoke-virtual {v8, v2, v3}, Landroid/location/Location;->setTime(J)V

    const-string p2, "precision"

    .line 70
    invoke-virtual {v0, p2, v9, v10}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v2

    double-to-float p2, v2

    invoke-virtual {v8, p2}, Landroid/location/Location;->setAccuracy(F)V

    const-string p2, "direction"

    .line 71
    invoke-virtual {v0, p2, v9, v10}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v2

    double-to-float p2, v2

    invoke-virtual {v8, p2}, Landroid/location/Location;->setBearing(F)V

    const-string p2, "speed"

    .line 72
    invoke-virtual {v0, p2, v9, v10}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v2

    double-to-float p2, v2

    invoke-virtual {v8, p2}, Landroid/location/Location;->setSpeed(F)V

    const-string p2, "altitude"

    .line 73
    invoke-virtual {v0, p2, v9, v10}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v2

    invoke-virtual {v8, v2, v3}, Landroid/location/Location;->setAltitude(D)V

    .line 75
    new-instance p2, Lcom/yandex/metrica/impl/ob/he;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    move-object v4, p2

    invoke-direct/range {v4 .. v9}, Lcom/yandex/metrica/impl/ob/he;-><init>(Lcom/yandex/metrica/impl/ob/gs$a;JLandroid/location/Location;Ljava/lang/Long;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    move-object p2, v1

    :goto_0
    return-object p2
.end method

.method public static a(Lcom/yandex/metrica/impl/ob/gx;)Ljava/lang/String;
    .locals 4
    .param p0    # Lcom/yandex/metrica/impl/ob/gx;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 106
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "timestamp"

    .line 107
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/gx;->b()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "wifi_info"

    .line 108
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/gx;->c()Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "cell_info"

    .line 109
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/gx;->d()Lorg/json/JSONArray;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 110
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static a(Lcom/yandex/metrica/impl/ob/he;)Ljava/lang/String;
    .locals 5
    .param p0    # Lcom/yandex/metrica/impl/ob/he;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    .line 28
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "collection_mode"

    .line 29
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/he;->a:Lcom/yandex/metrica/impl/ob/gs$a;

    .line 30
    invoke-virtual {v3}, Lcom/yandex/metrica/impl/ob/gs$a;->toString()Ljava/lang/String;

    move-result-object v3

    .line 29
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "lat"

    .line 31
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/he;->c()Landroid/location/Location;

    move-result-object v3

    invoke-virtual {v3}, Landroid/location/Location;->getLatitude()D

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    const-string v2, "lon"

    .line 32
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/he;->c()Landroid/location/Location;

    move-result-object v3

    invoke-virtual {v3}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    const-string v2, "timestamp"

    .line 35
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/he;->c()Landroid/location/Location;

    move-result-object v3

    invoke-virtual {v3}, Landroid/location/Location;->getTime()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "receive_timestamp"

    .line 37
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/he;->b()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    .line 36
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "precision"

    .line 39
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/he;->c()Landroid/location/Location;

    move-result-object v3

    invoke-virtual {v3}, Landroid/location/Location;->hasAccuracy()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/he;->c()Landroid/location/Location;

    move-result-object v3

    invoke-virtual {v3}, Landroid/location/Location;->getAccuracy()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v0

    .line 38
    :goto_0
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "direction"

    .line 41
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/he;->c()Landroid/location/Location;

    move-result-object v3

    invoke-virtual {v3}, Landroid/location/Location;->hasBearing()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/he;->c()Landroid/location/Location;

    move-result-object v3

    invoke-virtual {v3}, Landroid/location/Location;->getBearing()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v0

    .line 40
    :goto_1
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "speed"

    .line 43
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/he;->c()Landroid/location/Location;

    move-result-object v3

    invoke-virtual {v3}, Landroid/location/Location;->hasSpeed()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/he;->c()Landroid/location/Location;

    move-result-object v3

    invoke-virtual {v3}, Landroid/location/Location;->getSpeed()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    goto :goto_2

    :cond_2
    move-object v3, v0

    .line 42
    :goto_2
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "altitude"

    .line 45
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/he;->c()Landroid/location/Location;

    move-result-object v3

    invoke-virtual {v3}, Landroid/location/Location;->hasAltitude()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/he;->c()Landroid/location/Location;

    move-result-object v3

    invoke-virtual {v3}, Landroid/location/Location;->getAltitude()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    goto :goto_3

    :cond_3
    move-object v3, v0

    .line 44
    :goto_3
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "provider"

    .line 47
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/he;->c()Landroid/location/Location;

    move-result-object p0

    invoke-virtual {p0}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v0}, Lcom/yandex/metrica/impl/bp;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 46
    invoke-virtual {v1, v2, p0}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 48
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object v0
.end method

.method public static b(JLjava/lang/String;)Lcom/yandex/metrica/impl/ob/gx;
    .locals 3
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 87
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 89
    :try_start_0
    new-instance v0, Lcom/yandex/metrica/impl/ob/gx;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/gx;-><init>()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 90
    :try_start_1
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/yandex/metrica/impl/ob/gx;->a(Ljava/lang/Long;)V

    .line 91
    new-instance p0, Lorg/json/JSONObject;

    invoke-direct {p0, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "timestamp"

    const-wide/16 v1, 0x0

    .line 92
    invoke-virtual {p0, p1, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide p1

    .line 93
    invoke-virtual {v0, p1, p2}, Lcom/yandex/metrica/impl/ob/gx;->a(J)V

    const-string p1, "cell_info"

    .line 94
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/gx;->b(Lorg/json/JSONArray;)V

    const-string p1, "wifi_info"

    .line 95
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/yandex/metrica/impl/ob/gx;->a(Lorg/json/JSONArray;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-object v1, v0

    :catch_1
    :cond_0
    return-object v1
.end method
