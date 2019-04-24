.class public Lo/dtt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lo/dwk;
    .locals 11

    .line 106
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 107
    const-string v0, "resultCode"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 108
    invoke-static {v4}, Lo/dty;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 109
    new-instance v5, Lo/dwk;

    const/4 v0, 0x1

    invoke-direct {v5, v0}, Lo/dwk;-><init>(I)V

    .line 110
    invoke-virtual {v5, v4}, Lo/dwk;->c(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 111
    return-object v5

    .line 113
    :cond_0
    const-string v0, "kakas"

    :try_start_1
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    .line 114
    if-nez v5, :cond_1

    .line 115
    new-instance v0, Lo/dwk;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lo/dwk;-><init>(I)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    .line 118
    :cond_1
    :try_start_2
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 119
    const/4 v7, 0x0

    :goto_0
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v7, v0, :cond_3

    .line 120
    invoke-virtual {v5, v7}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    move-result-object v8

    .line 121
    instance-of v0, v8, Lorg/json/JSONObject;

    if-eqz v0, :cond_2

    .line 122
    move-object v9, v8

    check-cast v9, Lorg/json/JSONObject;

    .line 123
    new-instance v10, Lo/dvo;

    invoke-direct {v10}, Lo/dvo;-><init>()V

    .line 124
    const-string v0, "timestamp"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lo/dvo;->d(J)V

    .line 125
    const-string v0, "kaka"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v10, v0}, Lo/dvo;->d(I)V

    .line 126
    const-string v0, "reason"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v10, v0}, Lo/dvo;->a(I)V

    .line 127
    const-string v0, "occurDate"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lo/dvo;->e(J)V

    .line 128
    invoke-interface {v6, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 129
    const-string v0, "PLGACHIEVE_AchieveKakaParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseCaCaLine record:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 132
    :cond_3
    new-instance v7, Lo/dvr;

    invoke-direct {v7}, Lo/dvr;-><init>()V

    .line 133
    invoke-virtual {v7, v6}, Lo/dvr;->b(Ljava/util/List;)V

    .line 134
    new-instance v8, Lo/dwk;

    const/4 v0, 0x1

    invoke-direct {v8, v0}, Lo/dwk;-><init>(I)V

    .line 135
    invoke-virtual {v8, v7}, Lo/dwk;->a(Lo/dvr;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 136
    return-object v8

    .line 137
    :catch_0
    move-exception v3

    .line 138
    const-string v0, "PLGACHIEVE_AchieveKakaParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseCaCaLine Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    new-instance v0, Lo/dwk;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lo/dwk;-><init>(I)V

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Lo/dwk;
    .locals 7

    .line 306
    const-string v0, "PLGACHIEVE_AchieveKakaParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseKakaUpdateBody json="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 307
    new-instance v3, Lo/dwk;

    const/16 v0, 0xc

    invoke-direct {v3, v0}, Lo/dwk;-><init>(I)V

    .line 309
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 310
    const-string v0, "resultCode"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 311
    invoke-static {v5}, Lo/dty;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 312
    invoke-virtual {v3, v5}, Lo/dwk;->c(Ljava/lang/String;)V

    .line 313
    new-instance v6, Lo/dvp;

    invoke-direct {v6}, Lo/dvp;-><init>()V

    .line 314
    const-string v0, "taskId"

    invoke-static {v0, v4}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/dvp;->a(Ljava/lang/String;)V

    .line 315
    invoke-virtual {v3, v6}, Lo/dwk;->e(Lo/dvp;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 316
    return-object v3

    .line 318
    :cond_0
    :try_start_1
    new-instance v6, Lo/dvp;

    invoke-direct {v6}, Lo/dvp;-><init>()V

    .line 319
    const-string v0, "resultDesc"

    invoke-static {v0, v4}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/dvp;->d(Ljava/lang/String;)V

    .line 320
    const-string v0, "kaka"

    invoke-static {v0, v4}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v0

    invoke-virtual {v6, v0}, Lo/dvp;->a(I)V

    .line 321
    const-string v0, "totalKaka"

    invoke-static {v0, v4}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v0

    invoke-virtual {v6, v0}, Lo/dvp;->c(I)V

    .line 322
    const-string v0, "taskId"

    invoke-static {v0, v4}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/dvp;->a(Ljava/lang/String;)V

    .line 323
    invoke-virtual {v3, v6}, Lo/dwk;->e(Lo/dvp;)V

    .line 324
    const-string v0, "PLGACHIEVE_AchieveKakaParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "kakaUpdateReturnBody="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lo/dvp;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 327
    goto :goto_0

    .line 325
    :catch_0
    move-exception v4

    .line 326
    const-string v0, "PLGACHIEVE_AchieveKakaParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseKakaUpdateBody Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 328
    :goto_0
    return-object v3
.end method

.method public static c(Ljava/lang/String;Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Landroid/content/Context;)Ljava/util/ArrayList<Lo/dwk;>;"
        }
    .end annotation

    .line 152
    const-string v0, "PLGACHIEVE_AchieveKakaParser"

    const-string v1, "parseKakaTaskInfo json"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 154
    const/4 v6, 0x1

    .line 155
    const-string v0, "kakaSyncDate"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 156
    const-wide/16 v8, 0x0

    .line 157
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 158
    const-string v0, "PLGACHIEVE_AchieveKakaParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "syncDate="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    :try_start_0
    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v8, v0

    .line 163
    goto :goto_0

    .line 161
    :catch_0
    move-exception v10

    .line 162
    const-string v0, "PLGACHIEVE_AchieveKakaParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "NumberFormatException"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v10}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    :cond_0
    :goto_0
    :try_start_1
    new-instance v10, Lorg/json/JSONObject;

    move-object/from16 v0, p0

    invoke-direct {v10, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 167
    const-string v0, "resultCode"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 168
    invoke-static {v11}, Lo/dty;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 169
    new-instance v12, Lo/dwk;

    const/16 v0, 0xb

    invoke-direct {v12, v0}, Lo/dwk;-><init>(I)V

    .line 170
    invoke-virtual {v12, v11}, Lo/dwk;->c(Ljava/lang/String;)V

    .line 171
    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 172
    return-object v5

    .line 174
    :cond_1
    const-string v0, "tasks"

    :try_start_2
    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v12

    .line 175
    const/4 v0, 0x0

    if-ne v0, v12, :cond_2

    .line 176
    new-instance v13, Lo/dwk;

    const/16 v0, 0xb

    invoke-direct {v13, v0}, Lo/dwk;-><init>(I)V

    .line 177
    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 178
    return-object v5

    .line 180
    :cond_2
    const-string v0, "currentTimestamp"

    const-wide/16 v1, 0x0

    :try_start_3
    invoke-virtual {v10, v0, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v13

    .line 181
    const/4 v15, 0x0

    :goto_1
    invoke-virtual {v12}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v15, v0, :cond_8

    .line 182
    invoke-virtual {v12, v15}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v16

    .line 183
    new-instance v0, Lo/dwk;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lo/dwk;-><init>(I)V

    move-object/from16 v17, v0

    .line 184
    const/4 v0, 0x0

    move-object/from16 v1, v16

    if-ne v0, v1, :cond_3

    .line 185
    move-object/from16 v0, v17

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 187
    :cond_3
    const-string v0, "modifyTime"

    move-object/from16 v1, v16

    invoke-static {v0, v1}, Lo/dty;->c(Ljava/lang/String;Lorg/json/JSONObject;)J

    move-result-wide v18

    .line 188
    const-string v0, "taskId"

    move-object/from16 v1, v16

    invoke-static {v0, v1}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v20

    .line 189
    invoke-static/range {v20 .. v20}, Lo/dzo;->l(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 190
    const-string v0, "PLGACHIEVE_AchieveKakaParser"

    const-string v1, "taskId is Invalid on current version!"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    goto/16 :goto_3

    .line 193
    :cond_4
    invoke-static {v8, v9, v13, v14}, Lo/dzo;->b(JJ)Z

    move-result v21

    .line 194
    const-string v0, "status"

    move-object/from16 v1, v16

    invoke-static {v0, v1}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v22

    .line 195
    new-instance v23, Lo/dvq;

    invoke-direct/range {v23 .. v23}, Lo/dvq;-><init>()V

    .line 196
    move-object/from16 v0, v23

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dvq;->k(I)V

    .line 197
    move-object/from16 v0, v23

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dvq;->h(I)V

    .line 198
    move-object/from16 v0, v23

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Lo/dvq;->e(Ljava/lang/String;)V

    .line 199
    const-string v0, "taskName"

    move-object/from16 v1, v16

    invoke-static {v0, v1}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v24

    .line 200
    invoke-static/range {v24 .. v24}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 201
    const-string v0, "taskNameFirst"

    move-object/from16 v1, v16

    invoke-static {v0, v1}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v24

    .line 203
    :cond_5
    move-object/from16 v0, v23

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Lo/dvq;->b(Ljava/lang/String;)V

    .line 204
    const-string v0, "taskType"

    move-object/from16 v1, v16

    invoke-static {v0, v1}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lo/dvq;->c(I)V

    .line 205
    move-wide/from16 v0, v18

    invoke-static {v0, v1, v13, v14}, Lo/dzo;->b(JJ)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 206
    const-string v0, "PLGACHIEVE_AchieveKakaParser"

    const-string v1, "syncDate differentDays"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    move-object/from16 v0, v23

    move-object/from16 v1, p1

    move/from16 v2, v21

    move-object/from16 v3, v22

    move-object/from16 v4, v20

    invoke-static {v0, v1, v2, v3, v4}, Lo/dtt;->d(Lo/dvq;Landroid/content/Context;ZLjava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 209
    :cond_6
    move-object/from16 v0, v23

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lo/dvq;->f(Ljava/lang/String;)V

    .line 210
    move-object/from16 v0, v23

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dvq;->g(I)V

    .line 212
    :goto_2
    move-object/from16 v0, v23

    move-object/from16 v1, v16

    invoke-static {v0, v1}, Lo/dtt;->c(Lo/dvq;Lorg/json/JSONObject;)V

    .line 213
    move-object/from16 v0, v23

    move-wide/from16 v1, v18

    invoke-virtual {v0, v1, v2}, Lo/dvq;->a(J)V

    .line 214
    move-object/from16 v0, v23

    invoke-virtual {v0, v13, v14}, Lo/dvq;->b(J)V

    .line 215
    if-eqz v6, :cond_7

    .line 216
    const-string v0, "kakaSyncDate"

    invoke-static {v13, v14}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p1

    invoke-static {v2, v0, v1}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    const/4 v6, 0x0

    .line 219
    :cond_7
    const-string v0, "PLGACHIEVE_AchieveKakaParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseKakaTaskInfo kakaTaskInfo:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual/range {v23 .. v23}, Lo/dvq;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    move-object/from16 v0, v17

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Lo/dwk;->d(Lo/dvq;)V

    .line 221
    move-object/from16 v0, v17

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    .line 181
    :goto_3
    add-int/lit8 v15, v15, 0x1

    goto/16 :goto_1

    .line 223
    :cond_8
    return-object v5

    .line 224
    :catch_1
    move-exception v10

    .line 225
    const-string v0, "PLGACHIEVE_AchieveKakaParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseKakaTaskInfo Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v10}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    return-object v5
.end method

.method private static c(Lo/dvq;Lorg/json/JSONObject;)V
    .locals 4

    .line 273
    const-string v0, "conditions"

    invoke-static {v0, p1}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/dvq;->k(Ljava/lang/String;)V

    .line 275
    const-string v0, "specification"

    invoke-static {v0, p1}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/dvq;->c(Ljava/lang/String;)V

    .line 276
    const-string v0, "description"

    invoke-static {v0, p1}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v2

    .line 277
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 278
    const-string v0, "descriptionFirst"

    invoke-static {v0, p1}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v2

    .line 280
    :cond_0
    invoke-virtual {p0, v2}, Lo/dvq;->d(Ljava/lang/String;)V

    .line 281
    const-string v0, "taskIcon"

    invoke-static {v0, p1}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/dvq;->g(Ljava/lang/String;)V

    .line 283
    const-string v0, "kaka"

    invoke-static {v0, p1}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v3

    .line 284
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 285
    const-string v0, "kakaFirst"

    invoke-static {v0, p1}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v3

    .line 287
    :cond_1
    invoke-virtual {p0, v3}, Lo/dvq;->e(I)V

    .line 288
    const-string v0, "rewardExperience"

    invoke-static {v0, p1}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v0

    invoke-virtual {p0, v0}, Lo/dvq;->d(I)V

    .line 291
    const-string v0, "detailUrl"

    invoke-static {v0, p1}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/dvq;->a(Ljava/lang/String;)V

    .line 292
    const-string v0, "startTime"

    invoke-static {v0, p1}, Lo/dty;->c(Ljava/lang/String;Lorg/json/JSONObject;)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo/dvq;->d(J)V

    .line 293
    const-string v0, "endTime"

    invoke-static {v0, p1}, Lo/dty;->c(Ljava/lang/String;Lorg/json/JSONObject;)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo/dvq;->e(J)V

    .line 296
    const-string v0, "remainTimes"

    invoke-static {v0, p1}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v0

    invoke-virtual {p0, v0}, Lo/dvq;->b(I)V

    .line 297
    return-void
.end method

.method public static d(Ljava/lang/String;)Lo/dwk;
    .locals 7

    .line 45
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 46
    const-string v0, "resultCode"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 47
    invoke-static {v4}, Lo/dty;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 48
    new-instance v5, Lo/dwk;

    const/4 v0, 0x5

    invoke-direct {v5, v0}, Lo/dwk;-><init>(I)V

    .line 49
    invoke-virtual {v5, v4}, Lo/dwk;->c(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    return-object v5

    .line 52
    :cond_0
    :try_start_1
    new-instance v5, Lo/dwk;

    const/4 v0, 0x5

    invoke-direct {v5, v0}, Lo/dwk;-><init>(I)V

    .line 53
    new-instance v6, Lo/dvn;

    const-string v0, "kaka"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    const-string v1, "kcal"

    .line 54
    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-direct {v6, v0, v1}, Lo/dvn;-><init>(II)V

    .line 55
    invoke-virtual {v5, v6}, Lo/dwk;->a(Lo/dvn;)V

    .line 56
    const-string v0, "PLGACHIEVE_AchieveKakaParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseCalorieExchange calorieExchange:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 57
    return-object v5

    .line 58
    :catch_0
    move-exception v3

    .line 59
    const-string v0, "PLGACHIEVE_AchieveKakaParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseCalorieExchange Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    new-instance v0, Lo/dwk;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lo/dwk;-><init>(I)V

    return-object v0
.end method

.method private static d(Lo/dvq;Landroid/content/Context;ZLjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 241
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 242
    invoke-virtual {p0, p3}, Lo/dvq;->f(Ljava/lang/String;)V

    .line 243
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/dvq;->g(I)V

    goto :goto_0

    .line 245
    :cond_0
    invoke-static {p4}, Lo/dzo;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 246
    invoke-static {p3}, Lo/dzo;->o(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 247
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/dvq;->f(Ljava/lang/String;)V

    .line 248
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/dvq;->g(I)V

    goto :goto_0

    .line 250
    :cond_1
    invoke-virtual {p0, p3}, Lo/dvq;->f(Ljava/lang/String;)V

    .line 251
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/dvq;->g(I)V

    goto :goto_0

    .line 254
    :cond_2
    if-eqz p2, :cond_3

    .line 255
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/dvq;->f(Ljava/lang/String;)V

    .line 256
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/dvq;->g(I)V

    .line 257
    const-string v0, "taskReachInfo"

    const-string v1, ""

    invoke-static {p1, v0, v1}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 259
    :cond_3
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/dvq;->f(Ljava/lang/String;)V

    .line 260
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/dvq;->g(I)V

    .line 264
    :goto_0
    return-void
.end method

.method public static e(Ljava/lang/String;)Lo/dwk;
    .locals 8

    .line 71
    const-string v0, "PLGACHIEVE_AchieveKakaParser"

    const-string v1, "enter parseActivityInfo"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 74
    const-string v0, "resultCode"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 75
    invoke-static {v4}, Lo/dty;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 76
    const-string v0, "PLGACHIEVE_AchieveKakaParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseActivityInfo resultCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    new-instance v5, Lo/dwk;

    const/16 v0, 0xa

    invoke-direct {v5, v0}, Lo/dwk;-><init>(I)V

    .line 78
    invoke-virtual {v5, v4}, Lo/dwk;->c(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    return-object v5

    .line 81
    :cond_0
    const-string v0, "activity"

    :try_start_1
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 82
    new-instance v6, Lo/dwk;

    const/16 v0, 0xa

    invoke-direct {v6, v0}, Lo/dwk;-><init>(I)V

    .line 83
    new-instance v7, Lo/dvl;

    invoke-direct {v7}, Lo/dvl;-><init>()V

    .line 84
    const-string v0, "activityId"

    invoke-static {v0, v5}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/dvl;->b(Ljava/lang/String;)V

    .line 85
    const-string v0, "beginDate"

    invoke-static {v0, v5}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/dvl;->e(Ljava/lang/String;)V

    .line 86
    const-string v0, "endDate"

    invoke-static {v0, v5}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/dvl;->a(Ljava/lang/String;)V

    .line 87
    invoke-virtual {v6, v7}, Lo/dwk;->c(Lo/dvl;)V

    .line 88
    const-string v0, "PLGACHIEVE_AchieveKakaParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseActivityInfo"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Lo/dvl;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 89
    return-object v6

    .line 90
    :catch_0
    move-exception v3

    .line 91
    const-string v0, "PLGACHIEVE_AchieveKakaParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseActivityInfo Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    new-instance v0, Lo/dwk;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lo/dwk;-><init>(I)V

    return-object v0
.end method
