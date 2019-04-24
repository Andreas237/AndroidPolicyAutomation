.class public Lcom/scandit/base/util/JSONHelpers;
.super Ljava/lang/Object;
.source "JSONHelpers.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getBoolean(Lorg/json/JSONObject;Ljava/lang/String;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/scandit/base/util/JSONParseException;
        }
    .end annotation

    .line 101
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 105
    :try_start_0
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    .line 107
    :catch_0
    new-instance p0, Lcom/scandit/base/util/JSONParseException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' must be a boolean"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/scandit/base/util/JSONParseException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 102
    :cond_0
    new-instance p0, Lcom/scandit/base/util/JSONParseException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' does not exist"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/scandit/base/util/JSONParseException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static getDouble(Lorg/json/JSONObject;Ljava/lang/String;Z)D
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/scandit/base/util/JSONParseException;
        }
    .end annotation

    .line 42
    invoke-static {p0, p1, p2}, Lcom/scandit/base/util/JSONHelpers;->hasKey(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 44
    :try_start_0
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p0

    .line 47
    :catch_0
    :cond_0
    new-instance p0, Lcom/scandit/base/util/JSONParseException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "\'"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' must be a double"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/scandit/base/util/JSONParseException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static getObject(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/scandit/base/util/JSONParseException;
        }
    .end annotation

    .line 31
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 35
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 37
    :catch_0
    new-instance p0, Lcom/scandit/base/util/JSONParseException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' must be an object"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/scandit/base/util/JSONParseException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static getPoint(Lorg/json/JSONObject;Ljava/lang/String;Z)Landroid/graphics/PointF;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/scandit/base/util/JSONParseException;
        }
    .end annotation

    .line 51
    invoke-static {p0, p1, p2}, Lcom/scandit/base/util/JSONHelpers;->hasKey(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    .line 53
    :try_start_0
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 54
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    .line 55
    new-instance v1, Landroid/graphics/PointF;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->getDouble(I)D

    move-result-wide v2

    double-to-float v2, v2

    invoke-virtual {v0, p2}, Lorg/json/JSONArray;->getDouble(I)D

    move-result-wide v3

    double-to-float v0, v3

    invoke-direct {v1, v2, v0}, Landroid/graphics/PointF;-><init>(FF)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 61
    :catch_0
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_1

    const-string v0, "x"

    .line 62
    invoke-static {p0, v0, p2}, Lcom/scandit/base/util/JSONHelpers;->hasKey(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "y"

    invoke-static {p0, v0, p2}, Lcom/scandit/base/util/JSONHelpers;->hasKey(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 63
    new-instance v0, Landroid/graphics/PointF;

    const-string v1, "x"

    invoke-static {p0, v1, p2}, Lcom/scandit/base/util/JSONHelpers;->getDouble(Lorg/json/JSONObject;Ljava/lang/String;Z)D

    move-result-wide v1

    double-to-float v1, v1

    const-string v2, "y"

    .line 64
    invoke-static {p0, v2, p2}, Lcom/scandit/base/util/JSONHelpers;->getDouble(Lorg/json/JSONObject;Ljava/lang/String;Z)D

    move-result-wide v2

    double-to-float p0, v2

    invoke-direct {v0, v1, p0}, Landroid/graphics/PointF;-><init>(FF)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    .line 68
    :catch_1
    :cond_1
    new-instance p0, Lcom/scandit/base/util/JSONParseException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "\'"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' does not exist or is not an object or an array of size 2"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/scandit/base/util/JSONParseException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static getRect(Lorg/json/JSONObject;Ljava/lang/String;Z)Landroid/graphics/RectF;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/scandit/base/util/JSONParseException;
        }
    .end annotation

    .line 72
    invoke-static {p0, p1, p2}, Lcom/scandit/base/util/JSONHelpers;->hasKey(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    .line 74
    :try_start_0
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 75
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    const/4 v1, 0x0

    .line 76
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getDouble(I)D

    move-result-wide v1

    double-to-float v1, v1

    .line 77
    invoke-virtual {v0, p2}, Lorg/json/JSONArray;->getDouble(I)D

    move-result-wide v2

    double-to-float v2, v2

    const/4 v3, 0x2

    .line 78
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->getDouble(I)D

    move-result-wide v3

    double-to-float v3, v3

    add-float/2addr v3, v1

    const/4 v4, 0x3

    .line 79
    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getDouble(I)D

    move-result-wide v4

    double-to-float v0, v4

    add-float/2addr v0, v2

    .line 80
    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4, v1, v2, v3, v0}, Landroid/graphics/RectF;-><init>(FFFF)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v4

    .line 86
    :catch_0
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_1

    const-string v0, "x"

    .line 87
    invoke-static {p0, v0, p2}, Lcom/scandit/base/util/JSONHelpers;->hasKey(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "y"

    invoke-static {p0, v0, p2}, Lcom/scandit/base/util/JSONHelpers;->hasKey(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "width"

    .line 88
    invoke-static {p0, v0, p2}, Lcom/scandit/base/util/JSONHelpers;->hasKey(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "height"

    invoke-static {p0, v0, p2}, Lcom/scandit/base/util/JSONHelpers;->hasKey(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "x"

    .line 89
    invoke-static {p0, v0, p2}, Lcom/scandit/base/util/JSONHelpers;->getDouble(Lorg/json/JSONObject;Ljava/lang/String;Z)D

    move-result-wide v0

    double-to-float v0, v0

    const-string v1, "y"

    .line 90
    invoke-static {p0, v1, p2}, Lcom/scandit/base/util/JSONHelpers;->getDouble(Lorg/json/JSONObject;Ljava/lang/String;Z)D

    move-result-wide v1

    double-to-float v1, v1

    const-string v2, "width"

    .line 91
    invoke-static {p0, v2, p2}, Lcom/scandit/base/util/JSONHelpers;->getDouble(Lorg/json/JSONObject;Ljava/lang/String;Z)D

    move-result-wide v2

    double-to-float v2, v2

    add-float/2addr v2, v0

    const-string v3, "height"

    .line 92
    invoke-static {p0, v3, p2}, Lcom/scandit/base/util/JSONHelpers;->getDouble(Lorg/json/JSONObject;Ljava/lang/String;Z)D

    move-result-wide v3

    double-to-float p0, v3

    add-float/2addr p0, v1

    .line 93
    new-instance p2, Landroid/graphics/RectF;

    invoke-direct {p2, v0, v1, v2, p0}, Landroid/graphics/RectF;-><init>(FFFF)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p2

    .line 97
    :catch_1
    :cond_1
    new-instance p0, Lcom/scandit/base/util/JSONParseException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "\'"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' must either be an object, or an array of size 4"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/scandit/base/util/JSONParseException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/scandit/base/util/JSONParseException;
        }
    .end annotation

    .line 114
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p2

    .line 118
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 120
    :catch_0
    new-instance p0, Lcom/scandit/base/util/JSONParseException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "\'"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' must be a string"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/scandit/base/util/JSONParseException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static hasKey(Lorg/json/JSONObject;Ljava/lang/String;Z)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/scandit/base/util/JSONParseException;
        }
    .end annotation

    .line 21
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_1

    if-nez p2, :cond_0

    const/4 p0, 0x0

    return p0

    .line 23
    :cond_0
    new-instance p0, Lcom/scandit/base/util/JSONParseException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "\'"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' does not exist"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/scandit/base/util/JSONParseException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method
