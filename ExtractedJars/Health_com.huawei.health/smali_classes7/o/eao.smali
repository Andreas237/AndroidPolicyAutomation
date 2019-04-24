.class public Lo/eao;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lo/eat;
    .locals 11

    .line 23
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter parseIndexFile:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    new-instance v4, Lo/eat;

    invoke-direct {v4}, Lo/eat;-><init>()V

    .line 26
    const/4 v5, -0x1

    .line 28
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const-string v0, ""

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 29
    :cond_0
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileName is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    return-object v4

    .line 34
    :cond_1
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 35
    const-string v0, "plugins"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 37
    const-string v0, "version"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 38
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "version = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    invoke-virtual {v4, v7}, Lo/eat;->d(Ljava/lang/String;)V

    .line 42
    const-string v0, "updatedTime"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 43
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updatedTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    invoke-virtual {v4, v8}, Lo/eat;->b(Ljava/lang/String;)V

    .line 47
    const-string v0, "plugins"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v9

    .line 48
    const/4 v0, 0x0

    if-eq v0, v9, :cond_2

    .line 49
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jsonArray.length = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    invoke-static {v9}, Lo/eao;->e(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v10

    .line 51
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ezPluginIndexInfos is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    invoke-virtual {v4, v10}, Lo/eat;->d(Ljava/util/List;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    :cond_2
    goto :goto_0

    .line 55
    :catch_0
    move-exception v6

    .line 56
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "JSONException : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    :goto_0
    return-object v4
.end method

.method public static b(Ljava/lang/String;)Lo/eav;
    .locals 30

    .line 160
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter parseDescJsonFile:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    new-instance v4, Lo/eav;

    invoke-direct {v4}, Lo/eav;-><init>()V

    .line 162
    const/4 v5, -0x1

    .line 164
    const/4 v0, 0x0

    move-object/from16 v1, p0

    if-eq v0, v1, :cond_0

    const-string v0, ""

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 165
    :cond_0
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileName is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    return-object v4

    .line 170
    :cond_1
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    move-object/from16 v0, p0

    invoke-direct {v6, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 173
    const-string v0, "form"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 174
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "form = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    invoke-virtual {v4, v7}, Lo/eav;->g(Ljava/lang/String;)V

    .line 177
    const-string v0, "updatedTime"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 178
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updatedTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    invoke-virtual {v4, v8}, Lo/eav;->a(Ljava/lang/String;)V

    .line 182
    const-string v0, "uuid"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 183
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uuid = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    invoke-virtual {v4, v9}, Lo/eav;->b(Ljava/lang/String;)V

    .line 187
    const-string v0, "version"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 188
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "version = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    invoke-virtual {v4, v10}, Lo/eav;->e(Ljava/lang/String;)V

    .line 192
    const-string v11, ""

    .line 193
    const-string v12, ""

    .line 194
    const-string v0, "name"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v13

    .line 195
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jsonArrayName = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v13, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    const/4 v0, 0x0

    if-eq v0, v13, :cond_4

    .line 197
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " jsonArrayName.length() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v13}, Lorg/json/JSONArray;->length()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    const/4 v14, 0x0

    :goto_0
    invoke-virtual {v13}, Lorg/json/JSONArray;->length()I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_3

    move-result v0

    if-ge v14, v0, :cond_4

    .line 200
    :try_start_1
    invoke-virtual {v13, v14}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v15

    .line 201
    const-string v0, "en_us"

    invoke-virtual {v15, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 202
    const-string v0, "en_us"

    invoke-virtual {v15, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 203
    invoke-virtual {v4, v11}, Lo/eav;->c(Ljava/lang/String;)V

    .line 204
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "name_enUs : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v11, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    :cond_2
    const-string v0, "zh_rCN"

    invoke-virtual {v15, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 207
    const-string v0, "zh_rCN"

    invoke-virtual {v15, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 208
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "name_zh_rCN : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v12, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 212
    :cond_3
    goto :goto_1

    .line 210
    :catch_0
    move-exception v15

    .line 211
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "JSONException : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v15}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    :goto_1
    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_0

    .line 217
    :cond_4
    const-string v14, ""

    .line 218
    const-string v15, ""

    .line 219
    const-string v0, "description"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v16

    .line 220
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jsonArrayDescription = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v16, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    const/4 v0, 0x0

    move-object/from16 v1, v16

    if-eq v0, v1, :cond_7

    .line 222
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jsonArrayDescription.length() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {v16 .. v16}, Lorg/json/JSONArray;->length()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    const/16 v17, 0x0

    :goto_2
    invoke-virtual/range {v16 .. v16}, Lorg/json/JSONArray;->length()I
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_3

    move-result v0

    move/from16 v1, v17

    if-ge v1, v0, :cond_7

    .line 225
    move-object/from16 v0, v16

    move/from16 v1, v17

    :try_start_3
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v18

    .line 226
    const-string v0, "en_us"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 227
    const-string v0, "en_us"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 228
    invoke-virtual {v4, v14}, Lo/eav;->i(Ljava/lang/String;)V

    .line 229
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "description_enUs : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v14, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    :cond_5
    const-string v0, "zh_rCN"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 232
    const-string v0, "zh_rCN"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 233
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "description_zh_rCN : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v15, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    .line 237
    :cond_6
    goto :goto_3

    .line 235
    :catch_1
    move-exception v18

    .line 236
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "JSONException : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {v18 .. v18}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    :goto_3
    add-int/lit8 v17, v17, 0x1

    goto/16 :goto_2

    .line 241
    :cond_7
    const-string v17, ""

    .line 242
    const-string v18, ""

    .line 243
    const-string v0, "authorization"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v19

    .line 244
    const/4 v0, 0x0

    move-object/from16 v1, v19

    if-eq v0, v1, :cond_b

    .line 245
    const-string v0, "permissions"

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v20

    .line 246
    const-string v0, "prompt"

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v21

    .line 247
    const/4 v0, 0x0

    move-object/from16 v1, v20

    if-eq v0, v1, :cond_8

    .line 248
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jsonArrayPermissions = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v20, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 250
    :cond_8
    const/4 v0, 0x0

    move-object/from16 v1, v21

    if-eq v0, v1, :cond_b

    .line 251
    const/16 v22, 0x0

    :goto_4
    invoke-virtual/range {v21 .. v21}, Lorg/json/JSONArray;->length()I
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_3

    move-result v0

    move/from16 v1, v22

    if-ge v1, v0, :cond_b

    .line 253
    move-object/from16 v0, v21

    move/from16 v1, v22

    :try_start_5
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v23

    .line 254
    const-string v0, "en_us"

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 255
    const-string v0, "en_us"

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    .line 256
    move-object/from16 v0, v17

    invoke-virtual {v4, v0}, Lo/eav;->h(Ljava/lang/String;)V

    .line 257
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "authorization_enUs : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v17, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    :cond_9
    const-string v0, "zh_rCN"

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_a

    .line 260
    const-string v0, "zh_rCN"

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    .line 261
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "authorization_zh_rCN : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v18, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_2

    .line 266
    :cond_a
    goto :goto_5

    .line 263
    :catch_2
    move-exception v23

    .line 264
    :try_start_6
    invoke-virtual/range {v23 .. v23}, Lorg/json/JSONException;->printStackTrace()V

    .line 265
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "JSONException : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {v23 .. v23}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 251
    :goto_5
    add-int/lit8 v22, v22, 0x1

    goto/16 :goto_4

    .line 272
    :cond_b
    const-string v0, "fileSize"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dbf;->c(Ljava/lang/String;I)I

    move-result v20

    .line 273
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileSize = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 274
    move/from16 v0, v20

    invoke-virtual {v4, v0}, Lo/eav;->c(I)V

    .line 278
    const-string v0, "filename"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v21

    .line 279
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileName_plugin = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v21, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    move-object/from16 v0, v21

    invoke-virtual {v4, v0}, Lo/eav;->k(Ljava/lang/String;)V

    .line 283
    const-string v0, "fileType"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    .line 284
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileType_plugin = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v22, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 285
    move-object/from16 v0, v22

    invoke-virtual {v4, v0}, Lo/eav;->f(Ljava/lang/String;)V

    .line 288
    const-string v0, "digest"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v23

    .line 289
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "digest = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v23, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 290
    move-object/from16 v0, v23

    invoke-virtual {v4, v0}, Lo/eav;->d(Ljava/lang/String;)V

    .line 292
    const-string v0, "wear_device_info"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1d

    .line 293
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "description is wear device info "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    new-instance v24, Lo/ean;

    invoke-direct/range {v24 .. v24}, Lo/ean;-><init>()V

    .line 295
    const-string v0, "wear_device_info"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v25

    .line 296
    const-string v0, "entry_img"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 298
    const-string v0, "entry_img"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lo/ean;->b(Ljava/lang/String;)V

    .line 299
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "set entry_image "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "entry_img"

    move-object/from16 v3, v25

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    :cond_c
    const-string v0, "buy_url"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 303
    const-string v0, "buy_url"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lo/ean;->d(Ljava/lang/String;)V

    .line 305
    :cond_d
    const-string v0, "des_img"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 307
    const-string v0, "des_img"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v26

    .line 308
    new-instance v27, Ljava/util/ArrayList;

    invoke-direct/range {v27 .. v27}, Ljava/util/ArrayList;-><init>()V

    .line 309
    const/16 v28, 0x0

    :goto_6
    invoke-virtual/range {v26 .. v26}, Lorg/json/JSONArray;->length()I

    move-result v0

    move/from16 v1, v28

    if-ge v1, v0, :cond_e

    .line 310
    move-object/from16 v0, v26

    move/from16 v1, v28

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v27

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 309
    add-int/lit8 v28, v28, 0x1

    goto :goto_6

    .line 312
    :cond_e
    move-object/from16 v0, v24

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Lo/ean;->e(Ljava/util/ArrayList;)V

    .line 314
    :cond_f
    const-string v0, "guide"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 316
    const-string v0, "guide"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v26

    .line 317
    const-string v0, "guide_img"

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 319
    const-string v0, "guide_img"

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lo/ean;->e(Ljava/lang/String;)V

    .line 321
    :cond_10
    const-string v0, "ani_img"

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 323
    const-string v0, "ani_img"

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v27

    .line 324
    new-instance v28, Ljava/util/ArrayList;

    invoke-direct/range {v28 .. v28}, Ljava/util/ArrayList;-><init>()V

    .line 325
    const/16 v29, 0x0

    :goto_7
    invoke-virtual/range {v27 .. v27}, Lorg/json/JSONArray;->length()I

    move-result v0

    move/from16 v1, v29

    if-ge v1, v0, :cond_11

    .line 326
    move-object/from16 v0, v27

    move/from16 v1, v29

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v28

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 325
    add-int/lit8 v29, v29, 0x1

    goto :goto_7

    .line 328
    :cond_11
    move-object/from16 v0, v24

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Lo/ean;->b(Ljava/util/ArrayList;)V

    .line 330
    :cond_12
    const-string v0, "background_img"

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 332
    const-string v0, "background_img"

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lo/ean;->a(Ljava/lang/String;)V

    .line 335
    :cond_13
    const-string v0, "home_img"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 337
    const-string v0, "home_img"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lo/ean;->c(Ljava/lang/String;)V

    .line 339
    :cond_14
    const-string v0, "home_img_new"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 341
    const-string v0, "home_img_new"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lo/ean;->f(Ljava/lang/String;)V

    .line 343
    :cond_15
    const-string v0, "update_img"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 345
    const-string v0, "update_img"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lo/ean;->k(Ljava/lang/String;)V

    .line 348
    :cond_16
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ywx start parse description.json"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    const-string v0, "device_brand"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 351
    const-string v0, "device_brand"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lo/ean;->n(Ljava/lang/String;)V

    .line 352
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ywx setBrand : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {v24 .. v24}, Lo/ean;->o()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 355
    :cond_17
    const-string v0, "bluetooth_name"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 356
    const-string v0, "bluetooth_name"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v26

    .line 357
    new-instance v27, Ljava/util/ArrayList;

    invoke-direct/range {v27 .. v27}, Ljava/util/ArrayList;-><init>()V

    .line 358
    const/16 v28, 0x0

    :goto_8
    invoke-virtual/range {v26 .. v26}, Lorg/json/JSONArray;->length()I

    move-result v0

    move/from16 v1, v28

    if-ge v1, v0, :cond_18

    .line 359
    move-object/from16 v0, v26

    move/from16 v1, v28

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v27

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 358
    add-int/lit8 v28, v28, 0x1

    goto :goto_8

    .line 361
    :cond_18
    move-object/from16 v0, v24

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Lo/ean;->a(Ljava/util/ArrayList;)V

    .line 362
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ywx setBluetooth : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {v24 .. v24}, Lo/ean;->m()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 366
    :cond_19
    const-string v0, "device_string"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 367
    const-string v0, "device_string"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v26

    .line 368
    move-object/from16 v0, v26

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->isNull(I)Z

    move-result v0

    if-nez v0, :cond_1a

    .line 369
    move-object/from16 v0, v26

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lo/ean;->i(Ljava/lang/String;)V

    .line 370
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ywx setDeviceName : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {v24 .. v24}, Lo/ean;->g()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 372
    :cond_1a
    move-object/from16 v0, v26

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->isNull(I)Z

    move-result v0

    if-nez v0, :cond_1b

    .line 373
    move-object/from16 v0, v26

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lo/ean;->h(Ljava/lang/String;)V

    .line 374
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ywx setBriefDescription : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {v24 .. v24}, Lo/ean;->h()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 376
    :cond_1b
    move-object/from16 v0, v26

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->isNull(I)Z

    move-result v0

    if-nez v0, :cond_1c

    .line 377
    move-object/from16 v0, v26

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lo/ean;->g(Ljava/lang/String;)V

    .line 378
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ywx setDescription : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {v24 .. v24}, Lo/ean;->l()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 382
    :cond_1c
    move-object/from16 v0, v24

    invoke-virtual {v4, v0}, Lo/eav;->b(Lo/ean;)V

    .line 383
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deviceInfo :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {v24 .. v24}, Lo/ean;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_3

    .line 388
    :cond_1d
    goto :goto_9

    .line 386
    :catch_3
    move-exception v6

    .line 387
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "JSONException : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 389
    :goto_9
    return-object v4
.end method

.method private static e(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONArray;)Ljava/util/List<Lo/ear;>;"
        }
    .end annotation

    .line 68
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseJsonArray"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 72
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 73
    :cond_0
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jsonArray is null or no data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    return-object v4

    .line 77
    :cond_1
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jsonArray.length() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v5, v0, :cond_10

    .line 81
    :try_start_0
    invoke-virtual {p0, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    .line 82
    const/4 v0, 0x0

    if-eq v0, v6, :cond_f

    .line 83
    new-instance v7, Lo/ear;

    invoke-direct {v7}, Lo/ear;-><init>()V

    .line 84
    const-string v0, "uuid"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 85
    const-string v0, "uuid"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/ear;->c(Ljava/lang/String;)V

    .line 87
    :cond_2
    const-string v0, "version"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 88
    const-string v0, "version"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/ear;->b(Ljava/lang/String;)V

    .line 90
    :cond_3
    const-string v0, "digest"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 91
    const-string v0, "digest"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/ear;->e(Ljava/lang/String;)V

    .line 93
    :cond_4
    const-string v0, "filename"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 94
    const-string v0, "filename"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/ear;->i(Ljava/lang/String;)V

    .line 96
    :cond_5
    const-string v0, "fileSize"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 97
    const-string v0, "fileSize"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dbf;->c(Ljava/lang/String;I)I

    move-result v8

    .line 98
    invoke-virtual {v7, v8}, Lo/ear;->c(I)V

    .line 100
    :cond_6
    const-string v0, "descUrl"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 101
    const-string v0, "descUrl"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/ear;->k(Ljava/lang/String;)V

    .line 104
    :cond_7
    const-string v0, "applyRules"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 105
    const-string v0, "applyRules"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 107
    new-instance v8, Lo/eau;

    invoke-direct {v8}, Lo/eau;-><init>()V

    .line 108
    const-string v0, "applyRules"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v9

    .line 109
    const/4 v0, 0x0

    if-eq v0, v9, :cond_a

    .line 110
    const-string v0, "minAppVersion"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 111
    const-string v0, "minAppVersion"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 112
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "minAppVersion is : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    invoke-virtual {v8, v10}, Lo/eau;->e(Ljava/lang/String;)V

    .line 115
    :cond_8
    const-string v0, "minIndexVersion"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 116
    const-string v0, "minIndexVersion"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 117
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "minIndexVersion is : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    invoke-virtual {v8, v10}, Lo/eau;->c(Ljava/lang/String;)V

    .line 120
    :cond_9
    invoke-virtual {v7, v8}, Lo/ear;->d(Lo/eau;)V

    .line 122
    :cond_a
    goto :goto_1

    .line 124
    :cond_b
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no have apprule"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    :cond_c
    :goto_1
    const-string v0, "wearkind"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 128
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is wear device info---kind"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    const-string v0, "wearkind"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_d

    .line 130
    const-string v0, "wearkind"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/ear;->d(Ljava/lang/String;)V

    .line 134
    :cond_d
    const-string v0, "publish_mode"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 136
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is wear device info---Publish Mode"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    const-string v0, "publish_mode"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_e

    .line 138
    const-string v0, "publish_mode"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/ear;->a(Ljava/lang/String;)V

    .line 142
    :cond_e
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 143
    goto :goto_2

    .line 144
    :cond_f
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jsonObject is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 148
    :goto_2
    goto :goto_3

    .line 146
    :catch_0
    move-exception v6

    .line 147
    const-string v0, "EzPlugin_EzPluginIndexParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "JSONException : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 150
    :cond_10
    return-object v4
.end method
