.class public Lo/dxt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(ILjava/util/List;)Ljava/util/ArrayList;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lo/dvf;>;)Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 122
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 123
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 124
    return-object v2

    .line 126
    :cond_0
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lo/dxk;->d(IZ)J

    move-result-wide v3

    .line 127
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lo/dxk;->d(IZ)J

    move-result-wide v5

    .line 128
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 129
    const/4 v8, 0x0

    :goto_0
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_3

    .line 130
    move-object/from16 v0, p1

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/dvf;

    .line 131
    instance-of v0, v9, Lo/dvy;

    if-eqz v0, :cond_2

    .line 132
    move-object v10, v9

    check-cast v10, Lo/dvy;

    .line 133
    invoke-virtual {v10}, Lo/dvy;->g()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    .line 134
    goto :goto_2

    .line 136
    :cond_1
    invoke-virtual {v10}, Lo/dvy;->h()Ljava/lang/String;

    move-result-object v11

    .line 137
    const-wide/16 v12, 0x0

    .line 139
    :try_start_0
    invoke-static {v11}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v12, v0

    .line 142
    goto :goto_1

    .line 140
    :catch_0
    move-exception v14

    .line 141
    const-string v0, "PLGACHIEVE_AchieveAnnualPBDataHlr"

    const-string v1, "getData() NumberFormatException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    :goto_1
    cmp-long v0, v12, v3

    if-ltz v0, :cond_2

    cmp-long v0, v12, v5

    if-gtz v0, :cond_2

    .line 144
    invoke-virtual {v10}, Lo/dvy;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    :cond_2
    :goto_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 149
    :cond_3
    invoke-static {v7}, Lo/dxt;->e(Ljava/util/Map;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/String;I)Lo/dyz;
    .locals 10

    .line 83
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 84
    const-string v0, "PLGACHIEVE_AchieveAnnualPBDataHlr"

    const-string v1, "parseBestStep reportData is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    const/4 v0, 0x0

    return-object v0

    .line 87
    :cond_0
    const/4 v3, 0x0

    .line 89
    :try_start_0
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 90
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 91
    const/4 v5, 0x0

    .line 92
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v6, v0, :cond_3

    .line 93
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    .line 94
    const-string v0, "value"

    invoke-static {v0, v7}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v8

    .line 95
    const-string v0, "recordDay"

    invoke-static {v0, v7}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v9

    .line 96
    invoke-static {p1, v9}, Lo/dxk;->b(II)Z

    move-result v0

    if-nez v0, :cond_1

    .line 97
    goto :goto_1

    .line 99
    :cond_1
    new-instance v3, Lo/dyz;

    invoke-direct {v3}, Lo/dyz;-><init>()V

    .line 100
    if-le v8, v5, :cond_2

    .line 101
    move v5, v8

    .line 102
    invoke-virtual {v3, v8}, Lo/dyz;->c(I)V

    .line 103
    invoke-virtual {v3, v9}, Lo/dyz;->e(I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 92
    :cond_2
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 106
    :cond_3
    return-object v3

    .line 110
    :cond_4
    goto :goto_2

    .line 108
    :catch_0
    move-exception v4

    .line 109
    const-string v0, "PLGACHIEVE_AchieveAnnualPBDataHlr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseBestStepByYear Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    :goto_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public static e(Ljava/util/Map;)Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Long;>;)Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 160
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 161
    new-instance v0, Lo/dxt$2;

    invoke-direct {v0}, Lo/dxt$2;-><init>()V

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 181
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 182
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    .line 183
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    .line 184
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/Map$Entry;

    .line 185
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 183
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 187
    :cond_0
    return-object v2
.end method

.method public static e(Ljava/lang/String;I)Lo/dyx;
    .locals 14

    .line 43
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 44
    const/4 v0, 0x0

    return-object v0

    .line 46
    :cond_0
    const/4 v3, 0x0

    .line 48
    :try_start_0
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 49
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 50
    const-wide/16 v5, 0x0

    .line 51
    const/4 v7, 0x0

    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v7, v0, :cond_3

    .line 52
    invoke-virtual {v4, v7}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v8

    .line 53
    const-string v0, "value"

    invoke-static {v0, v8}, Lo/dty;->c(Ljava/lang/String;Lorg/json/JSONObject;)J

    move-result-wide v9

    .line 54
    const-string v0, "startTime"

    invoke-static {v0, v8}, Lo/dty;->c(Ljava/lang/String;Lorg/json/JSONObject;)J

    move-result-wide v11

    .line 55
    invoke-static {p1, v11, v12}, Lo/dxk;->d(IJ)Z

    move-result v0

    if-nez v0, :cond_1

    .line 56
    goto :goto_1

    .line 58
    :cond_1
    new-instance v3, Lo/dyx;

    invoke-direct {v3}, Lo/dyx;-><init>()V

    .line 59
    const-string v0, "source"

    invoke-static {v0, v8}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v13

    .line 60
    cmp-long v0, v9, v5

    if-lez v0, :cond_2

    .line 61
    move-wide v5, v9

    .line 62
    invoke-virtual {v3, v9, v10}, Lo/dyx;->c(J)V

    .line 63
    invoke-virtual {v3, v11, v12}, Lo/dyx;->b(J)V

    .line 64
    invoke-virtual {v3, v13}, Lo/dyx;->d(I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    :cond_2
    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 68
    :cond_3
    return-object v3

    .line 72
    :cond_4
    goto :goto_2

    .line 70
    :catch_0
    move-exception v4

    .line 71
    const-string v0, "PLGACHIEVE_AchieveAnnualPBDataHlr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseBestMotionByYear Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    :goto_2
    const/4 v0, 0x0

    return-object v0
.end method
