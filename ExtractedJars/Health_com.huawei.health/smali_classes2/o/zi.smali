.class public final Lo/zi;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static c()Lo/zf;
    .locals 1

    .line 50
    const-string v0, "grs_sdk_global_route_config.json"

    invoke-static {v0}, Lo/aar;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/zi;->e(Ljava/lang/String;)Lo/zf;

    move-result-object v0

    return-object v0
.end method

.method private static e(Ljava/lang/String;)Lo/zf;
    .locals 24

    .line 63
    const/4 v3, 0x0

    .line 65
    invoke-static/range {p0 .. p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 67
    const-string v0, "getConfigMgr configContent is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 68
    return-object v3

    .line 71
    :cond_0
    new-instance v4, Lo/yu;

    invoke-direct {v4}, Lo/yu;-><init>()V

    .line 72
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 73
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 78
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    move-object/from16 v0, p0

    invoke-direct {v7, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 81
    const-string v0, "countryGroups"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v8

    .line 83
    invoke-virtual {v8}, Lorg/json/JSONObject;->length()I

    move-result v0

    if-eqz v0, :cond_3

    .line 86
    invoke-virtual {v8}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v9

    .line 88
    goto/16 :goto_1

    .line 90
    :cond_1
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/String;

    .line 92
    new-instance v11, Lo/zb;

    invoke-direct {v11}, Lo/zb;-><init>()V

    .line 93
    invoke-virtual {v11, v10}, Lo/zb;->e(Ljava/lang/String;)V

    .line 95
    invoke-virtual {v8, v10}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v12

    .line 97
    const-string v0, "name"

    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 98
    invoke-virtual {v11, v13}, Lo/zb;->d(Ljava/lang/String;)V

    .line 100
    const-string v0, "description"

    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 101
    invoke-virtual {v11, v14}, Lo/zb;->c(Ljava/lang/String;)V

    .line 103
    const-string v0, "countries"

    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v15

    .line 105
    new-instance v16, Ljava/util/HashSet;

    invoke-direct/range {v16 .. v16}, Ljava/util/HashSet;-><init>()V

    .line 107
    const/16 v17, 0x0

    goto :goto_0

    .line 109
    :cond_2
    move/from16 v0, v17

    invoke-virtual {v15, v0}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Ljava/lang/String;

    .line 110
    move-object/from16 v0, v16

    move-object/from16 v1, v18

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 107
    add-int/lit8 v17, v17, 0x1

    :goto_0
    invoke-virtual {v15}, Lorg/json/JSONArray;->length()I

    move-result v0

    move/from16 v1, v17

    if-lt v1, v0, :cond_2

    .line 112
    move-object/from16 v0, v16

    invoke-virtual {v11, v0}, Lo/zb;->b(Ljava/util/Set;)V

    .line 114
    invoke-interface {v6, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 121
    :cond_3
    const-string v0, "services"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v9

    .line 123
    invoke-virtual {v9}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v10

    .line 125
    goto/16 :goto_4

    .line 127
    :cond_4
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/lang/String;

    .line 129
    new-instance v12, Lo/za;

    invoke-direct {v12}, Lo/za;-><init>()V

    .line 130
    invoke-virtual {v12, v11}, Lo/za;->e(Ljava/lang/String;)V

    .line 132
    invoke-virtual {v9, v11}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v13

    .line 134
    const-string v0, "routeBy"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 136
    invoke-virtual {v12, v14}, Lo/za;->a(Ljava/lang/String;)V

    .line 138
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 139
    const-string v0, "servings"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v16

    .line 140
    const/16 v17, 0x0

    goto/16 :goto_3

    .line 142
    :cond_5
    move-object/from16 v0, v16

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lorg/json/JSONObject;

    .line 144
    new-instance v19, Lo/zc;

    invoke-direct/range {v19 .. v19}, Lo/zc;-><init>()V

    .line 146
    const-string v0, "countryGroup"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 148
    const-string v0, "countryGroup"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    .line 150
    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Lo/zc;->d(Ljava/lang/String;)V

    .line 153
    :cond_6
    const-string v0, "addresses"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v20

    .line 155
    new-instance v21, Ljava/util/HashMap;

    invoke-direct/range {v21 .. v21}, Ljava/util/HashMap;-><init>()V

    .line 157
    invoke-virtual/range {v20 .. v20}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v22

    .line 158
    goto :goto_2

    .line 160
    :cond_7
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v23, v0

    check-cast v23, Ljava/lang/String;

    .line 161
    move-object/from16 v0, v20

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v21

    move-object/from16 v2, v23

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    :goto_2
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_7

    .line 164
    move-object/from16 v0, v19

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Lo/zc;->b(Ljava/util/Map;)V

    .line 166
    move-object/from16 v0, v19

    invoke-interface {v15, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 167
    invoke-virtual {v12, v15}, Lo/za;->b(Ljava/util/List;)V

    .line 140
    add-int/lit8 v17, v17, 0x1

    :goto_3
    invoke-virtual/range {v16 .. v16}, Lorg/json/JSONArray;->length()I

    move-result v0

    move/from16 v1, v17

    if-lt v1, v0, :cond_5

    .line 171
    invoke-interface {v5, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_4

    .line 175
    const-string v0, "application"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v11

    .line 177
    const-string v0, "name"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 178
    const-string v0, "cacheControl"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v13

    .line 179
    const-string v0, "services"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v15

    .line 181
    invoke-virtual {v4, v12}, Lo/yu;->b(Ljava/lang/String;)V

    .line 182
    invoke-virtual {v4, v13, v14}, Lo/yu;->e(J)V

    .line 184
    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    .line 185
    const/16 v17, 0x0

    goto :goto_5

    .line 187
    :cond_8
    move/from16 v0, v17

    invoke-virtual {v15, v0}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Ljava/lang/String;

    .line 188
    move-object/from16 v0, v16

    move-object/from16 v1, v18

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 185
    add-int/lit8 v17, v17, 0x1

    :goto_5
    invoke-virtual {v15}, Lorg/json/JSONArray;->length()I

    move-result v0

    move/from16 v1, v17

    if-lt v1, v0, :cond_8

    .line 191
    move-object/from16 v0, v16

    invoke-virtual {v4, v0}, Lo/yu;->d(Ljava/util/List;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 193
    goto :goto_6

    .line 194
    :catch_0
    move-exception v7

    .line 196
    const-string v0, "getConfigMgr JSONException: "

    const/4 v1, 0x0

    invoke-static {v0, v7, v1}, Lo/aap;->b(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 197
    const/4 v0, 0x0

    return-object v0

    .line 200
    :goto_6
    new-instance v7, Lo/yz;

    invoke-direct {v7}, Lo/yz;-><init>()V

    .line 201
    invoke-virtual {v7, v4, v5, v6}, Lo/yz;->a(Lo/yu;Ljava/util/Map;Ljava/util/Map;)V

    .line 203
    new-instance v3, Lo/zf;

    invoke-direct {v3, v7}, Lo/zf;-><init>(Lo/yz;)V

    .line 205
    return-object v3
.end method
