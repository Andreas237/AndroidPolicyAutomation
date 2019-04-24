.class public Lo/dts;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(D)D
    .locals 9

    .line 93
    const-wide v0, 0x408f400000000000L    # 1000.0

    div-double v2, p0, v0

    .line 94
    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-static {v2, v3, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    .line 95
    invoke-static {}, Ljava/text/NumberFormat;->getInstance()Ljava/text/NumberFormat;

    move-result-object v5

    .line 96
    const-wide/16 v6, 0x0

    .line 98
    :try_start_0
    invoke-virtual {v5, v4}, Ljava/text/NumberFormat;->parse(Ljava/lang/String;)Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-wide v0

    move-wide v6, v0

    .line 103
    goto :goto_0

    .line 99
    :catch_0
    move-exception v8

    .line 100
    const-string v0, "PLGACHIEVE_AchievePersonalParser"

    const-string v1, "NumberFormatException error"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    goto :goto_0

    .line 101
    :catch_1
    move-exception v8

    .line 102
    const-string v0, "PLGACHIEVE_AchievePersonalParser"

    const-string v1, "ParseException error"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    :goto_0
    return-wide v6
.end method

.method public static a(ILjava/lang/String;)Lo/dwk;
    .locals 3

    .line 116
    const/4 v2, 0x0

    .line 117
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 118
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 120
    :pswitch_0
    invoke-static {p1}, Lo/dts;->d(Ljava/lang/String;)Lo/dwk;

    move-result-object v2

    .line 121
    goto :goto_1

    .line 123
    :pswitch_1
    invoke-static {p1}, Lo/dtt;->a(Ljava/lang/String;)Lo/dwk;

    move-result-object v2

    .line 124
    goto :goto_1

    .line 126
    :pswitch_2
    invoke-static {p1}, Lo/dtw;->e(Ljava/lang/String;)Lo/dwk;

    move-result-object v2

    .line 127
    goto :goto_1

    .line 129
    :pswitch_3
    invoke-static {p1}, Lo/dtw;->d(Ljava/lang/String;)Lo/dwk;

    move-result-object v2

    .line 130
    goto :goto_1

    .line 132
    :pswitch_4
    invoke-static {p1}, Lo/dtu;->b(Ljava/lang/String;)Lo/dwk;

    move-result-object v2

    .line 133
    goto :goto_1

    .line 135
    :pswitch_5
    invoke-static {p1}, Lo/dtt;->d(Ljava/lang/String;)Lo/dwk;

    move-result-object v2

    .line 136
    goto :goto_1

    .line 138
    :pswitch_6
    invoke-static {p1}, Lo/dtu;->e(Ljava/lang/String;)Lo/dwk;

    move-result-object v2

    .line 139
    goto :goto_1

    .line 141
    :pswitch_7
    invoke-static {p1}, Lo/dtu;->a(Ljava/lang/String;)Lo/dwk;

    move-result-object v2

    .line 142
    goto :goto_1

    .line 144
    :pswitch_8
    invoke-static {p1}, Lo/dtt;->e(Ljava/lang/String;)Lo/dwk;

    move-result-object v2

    .line 145
    goto :goto_1

    .line 147
    :pswitch_9
    invoke-static {p1}, Lo/dtt;->b(Ljava/lang/String;)Lo/dwk;

    move-result-object v2

    .line 148
    goto :goto_1

    .line 150
    :pswitch_a
    invoke-static {p1}, Lo/dtr;->a(Ljava/lang/String;)Lo/dwk;

    move-result-object v2

    .line 151
    goto :goto_1

    .line 153
    :goto_0
    :pswitch_b
    const-string v0, "PLGACHIEVE_AchievePersonalParser"

    const-string v1, "doParse invalide content type"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    :cond_0
    :goto_1
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_b
        :pswitch_b
        :pswitch_8
        :pswitch_b
        :pswitch_9
        :pswitch_b
        :pswitch_a
    .end packed-switch
.end method

.method public static a(Lo/dwm;Lorg/json/JSONObject;Lorg/json/JSONObject;)V
    .locals 2

    .line 194
    const-string v0, "maxSteps"

    invoke-static {v0, p1}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v0

    invoke-virtual {p0, v0}, Lo/dwm;->c(I)V

    .line 195
    const-string v0, "maxStepsDate"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo/dwm;->d(J)V

    .line 198
    const-string v0, "originalMaxDistance"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 199
    const-string v0, "originalMaxDistance"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-static {v0, v1}, Lo/dts;->a(D)D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo/dwm;->a(D)V

    .line 201
    :cond_0
    const-string v0, "maxDistanceDate"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 202
    const-string v0, "maxDistanceDate"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo/dwm;->a(J)V

    .line 204
    :cond_1
    const-string v0, "maxPace"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 205
    const-string v0, "maxPace"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lo/dwm;->e(I)V

    .line 207
    :cond_2
    const-string v0, "maxPaceDate"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 208
    const-string v0, "maxPaceDate"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo/dwm;->e(J)V

    .line 210
    :cond_3
    const-string v0, "bestRunDistance"

    invoke-static {v0, p2}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/dwm;->f(Ljava/lang/String;)V

    .line 211
    const-string v0, "bestRunPace"

    invoke-static {v0, p2}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/dwm;->o(Ljava/lang/String;)V

    .line 212
    const-string v0, "bestDayStep"

    invoke-static {v0, p2}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/dwm;->i(Ljava/lang/String;)V

    .line 213
    const-string v0, "bestCycleDistance"

    invoke-static {v0, p2}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/dwm;->a(Ljava/lang/String;)V

    .line 214
    const-string v0, "bestCyclePace"

    invoke-static {v0, p2}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/dwm;->c(Ljava/lang/String;)V

    .line 215
    const-string v0, "bestWalkDistance"

    invoke-static {v0, p2}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/dwm;->e(Ljava/lang/String;)V

    .line 216
    const-string v0, "bestRunPartTime3KM"

    invoke-static {v0, p2}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/dwm;->d(Ljava/lang/String;)V

    .line 217
    const-string v0, "bestRunPartTime5KM"

    invoke-static {v0, p2}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/dwm;->b(Ljava/lang/String;)V

    .line 218
    const-string v0, "bestRunPartTime10KM"

    invoke-static {v0, p2}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/dwm;->k(Ljava/lang/String;)V

    .line 219
    const-string v0, "bestRunPartTimeHM"

    invoke-static {v0, p2}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/dwm;->h(Ljava/lang/String;)V

    .line 220
    const-string v0, "bestRunPartTimeFM"

    invoke-static {v0, p2}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/dwm;->g(Ljava/lang/String;)V

    .line 221
    return-void
.end method

.method public static c(Lo/dwj;Lorg/json/JSONObject;Lorg/json/JSONObject;)V
    .locals 2

    .line 232
    const-string v0, "sumDistance"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo/dwj;->b(D)V

    .line 233
    const-string v0, "originalSumSteps"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo/dwj;->e(D)V

    .line 234
    const-string v0, "originalSumKcal"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo/dwj;->d(D)V

    .line 235
    const-string v0, "totalDays"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lo/dwj;->b(I)V

    .line 236
    const-string v0, "firstDate"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo/dwj;->c(J)V

    .line 237
    const-string v0, "lastDate"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo/dwj;->b(J)V

    .line 238
    const-string v0, "sumStepsDesc"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo/dwj;->c(D)V

    .line 240
    const-string v0, "accumulatedHealthTime"

    invoke-static {v0, p2}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/dwj;->e(Ljava/lang/String;)V

    .line 241
    const-string v0, "accumulatedCycleDistance"

    invoke-static {v0, p2}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/dwj;->b(Ljava/lang/String;)V

    .line 242
    const-string v0, "accumulatedRunDistance"

    invoke-static {v0, p2}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/dwj;->c(Ljava/lang/String;)V

    .line 243
    const-string v0, "accumulatedWalkDistance"

    invoke-static {v0, p2}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/dwj;->a(Ljava/lang/String;)V

    .line 244
    return-void
.end method

.method public static d(ILjava/lang/String;Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;Landroid/content/Context;)Ljava/util/ArrayList<Lo/dwk;>;"
        }
    .end annotation

    .line 161
    const-string v0, "PLGACHIEVE_AchievePersonalParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "enter doMedalParse json="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 163
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 164
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 166
    :sswitch_0
    invoke-static {p1}, Lo/dtu;->d(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 167
    goto :goto_1

    .line 169
    :sswitch_1
    invoke-static {p1, p2}, Lo/dtu;->e(Ljava/lang/String;Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v3

    .line 170
    goto :goto_1

    .line 172
    :sswitch_2
    invoke-static {p1, p2}, Lo/dtt;->c(Ljava/lang/String;Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v3

    .line 173
    goto :goto_1

    .line 175
    :sswitch_3
    invoke-static {p1}, Lo/dtr;->d(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 176
    goto :goto_1

    .line 178
    :goto_0
    const-string v0, "PLGACHIEVE_AchievePersonalParser"

    const-string v1, "doParse invalide content type"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    :cond_0
    :goto_1
    return-object v3

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0xb -> :sswitch_2
        0xd -> :sswitch_3
    .end sparse-switch
.end method

.method public static d(Ljava/lang/String;)Lo/dwk;
    .locals 11

    .line 51
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 52
    const-string v0, "resultCode"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 53
    invoke-static {v4}, Lo/dty;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 54
    new-instance v5, Lo/dwk;

    const/4 v0, 0x0

    invoke-direct {v5, v0}, Lo/dwk;-><init>(I)V

    .line 55
    invoke-virtual {v5, v4}, Lo/dwk;->c(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    return-object v5

    .line 58
    :cond_0
    :try_start_1
    new-instance v5, Lo/dwk;

    const/4 v0, 0x0

    invoke-direct {v5, v0}, Lo/dwk;-><init>(I)V

    .line 59
    new-instance v6, Lo/dvh;

    invoke-direct {v6}, Lo/dvh;-><init>()V

    .line 60
    const-string v0, "userLevel"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lo/dvh;->e(I)V

    .line 61
    const-string v0, "userMedals"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-static {v0}, Lo/dty;->e(Lorg/json/JSONArray;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/dvh;->c(Ljava/lang/String;)V

    .line 62
    const-string v0, "kakaSum"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lo/dvh;->d(I)V

    .line 63
    const-string v0, "dayLevel"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lo/dvh;->b(D)V

    .line 64
    const-string v0, "timestamp"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lo/dvh;->c(J)V

    .line 65
    const-string v0, "PLGACHIEVE_AchievePersonalParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parsePersonal achieveInfo:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    const-string v0, "PLGACHIEVE_AchievePersonalParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parsePersonal mds of achieveInfo:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lo/dvh;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    const-string v0, "achievementReport"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v7

    .line 68
    const-string v0, "achievementReportExtend"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v8

    .line 69
    if-nez v7, :cond_1

    .line 70
    invoke-virtual {v5, v6}, Lo/dwk;->c(Lo/dvh;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 71
    return-object v5

    .line 73
    :cond_1
    :try_start_2
    new-instance v9, Lo/dwj;

    invoke-direct {v9}, Lo/dwj;-><init>()V

    .line 74
    invoke-static {v9, v7, v8}, Lo/dts;->c(Lo/dwj;Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    .line 75
    const-string v0, "PLGACHIEVE_AchievePersonalParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parsePersonal totalRecord:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    new-instance v10, Lo/dwm;

    invoke-direct {v10}, Lo/dwm;-><init>()V

    .line 78
    invoke-static {v10, v7, v8}, Lo/dts;->a(Lo/dwm;Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    .line 79
    const-string v0, "PLGACHIEVE_AchievePersonalParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parsePersonal singleDayRecord:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    invoke-virtual {v5, v10}, Lo/dwk;->b(Lo/dwm;)V

    .line 82
    invoke-virtual {v5, v9}, Lo/dwk;->d(Lo/dwj;)V

    .line 83
    invoke-virtual {v5, v6}, Lo/dwk;->c(Lo/dvh;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 84
    return-object v5

    .line 85
    :catch_0
    move-exception v3

    .line 86
    const-string v0, "PLGACHIEVE_AchievePersonalParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parsePersonal Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    new-instance v0, Lo/dwk;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/dwk;-><init>(I)V

    return-object v0
.end method
