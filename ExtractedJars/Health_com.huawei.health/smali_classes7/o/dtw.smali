.class public Lo/dtw;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/String;)Lo/dwk;
    .locals 17

    .line 40
    new-instance v4, Lo/dwk;

    const/4 v0, 0x3

    invoke-direct {v4, v0}, Lo/dwk;-><init>(I)V

    .line 41
    new-instance v5, Lo/dwd;

    invoke-direct {v5}, Lo/dwd;-><init>()V

    .line 43
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    move-object/from16 v0, p0

    invoke-direct {v6, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 44
    const-string v0, "resultCode"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 45
    const-string v0, "reportNo"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v8

    .line 46
    const-string v0, "minReportNo"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v9

    .line 47
    const-string v0, "firstDate"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v10

    .line 48
    const-string v0, "endDate"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v12

    .line 49
    invoke-virtual {v4, v7}, Lo/dwk;->c(Ljava/lang/String;)V

    .line 50
    invoke-virtual {v5, v8}, Lo/dwd;->e(I)V

    .line 51
    invoke-virtual {v5, v9}, Lo/dwd;->a(I)V

    .line 52
    invoke-virtual {v5, v12, v13}, Lo/dwd;->e(J)V

    .line 53
    invoke-virtual {v5, v10, v11}, Lo/dwd;->d(J)V

    .line 54
    invoke-static {v7}, Lo/dty;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 55
    if-nez v9, :cond_0

    move v0, v8

    goto :goto_0

    :cond_0
    move v0, v9

    :goto_0
    invoke-virtual {v5, v0}, Lo/dwd;->a(I)V

    .line 56
    invoke-virtual {v4, v5}, Lo/dwk;->b(Lo/dwd;)V

    .line 57
    const-string v0, "PLGACHIEVE_AchieveReportParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseMonthly monthRecord:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    return-object v4

    .line 60
    :cond_1
    const-string v0, "userReport"

    :try_start_1
    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v14

    .line 61
    if-nez v14, :cond_2

    .line 62
    invoke-virtual {v4, v5}, Lo/dwk;->b(Lo/dwd;)V

    .line 63
    const-string v0, "PLGACHIEVE_AchieveReportParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseMonthly monthRecord:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 64
    return-object v4

    .line 66
    :cond_2
    const-string v0, "originalSteps"

    :try_start_2
    invoke-virtual {v14, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lo/dwd;->b(D)V

    .line 67
    const-string v0, "sumRunDistance"

    invoke-virtual {v14, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-static {v0, v1}, Lo/dts;->a(D)D

    move-result-wide v15

    .line 68
    move-wide v0, v15

    invoke-virtual {v5, v0, v1}, Lo/dwd;->a(D)V

    .line 69
    const-string v0, "kaka"

    invoke-virtual {v14, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lo/dwd;->d(I)V

    .line 70
    const-string v0, "price"

    invoke-virtual {v14, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lo/dwd;->c(I)V

    .line 71
    const-string v0, "userMedals"

    invoke-virtual {v14, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-static {v0}, Lo/dty;->c(Lorg/json/JSONArray;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/dwd;->b(Ljava/lang/String;)V

    .line 72
    const-string v0, "sumRunDistanceDesc"

    move-wide v1, v15

    const/4 v3, 0x1

    invoke-static {v0, v14, v1, v2, v3}, Lo/dty;->b(Ljava/lang/String;Lorg/json/JSONObject;DI)D

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lo/dwd;->d(D)V

    .line 73
    const-string v0, "sumStepsDesc"

    invoke-virtual {v14, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lo/dwd;->e(D)V

    .line 74
    const-string v0, "PLGACHIEVE_AchieveReportParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseMonthly monthRecord:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    invoke-virtual {v4, v5}, Lo/dwk;->b(Lo/dwd;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 76
    return-object v4

    .line 77
    :catch_0
    move-exception v6

    .line 78
    const-string v0, "PLGACHIEVE_AchieveReportParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseMonthly Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    invoke-virtual {v4, v5}, Lo/dwk;->b(Lo/dwd;)V

    .line 81
    const-string v0, "PLGACHIEVE_AchieveReportParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseMonthly monthRecord:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    return-object v4
.end method

.method public static e(Ljava/lang/String;)Lo/dwk;
    .locals 17

    .line 93
    new-instance v4, Lo/dwk;

    const/4 v0, 0x2

    invoke-direct {v4, v0}, Lo/dwk;-><init>(I)V

    .line 94
    new-instance v5, Lo/dwh;

    invoke-direct {v5}, Lo/dwh;-><init>()V

    .line 96
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    move-object/from16 v0, p0

    invoke-direct {v6, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 97
    const-string v0, "resultCode"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 98
    const-string v0, "reportNo"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v8

    .line 99
    const-string v0, "minReportNo"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v9

    .line 100
    const-string v0, "firstDate"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v10

    .line 101
    const-string v0, "endDate"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v12

    .line 102
    invoke-virtual {v4, v7}, Lo/dwk;->c(Ljava/lang/String;)V

    .line 103
    invoke-virtual {v5, v8}, Lo/dwh;->c(I)V

    .line 104
    invoke-virtual {v5, v9}, Lo/dwh;->a(I)V

    .line 105
    invoke-virtual {v5, v12, v13}, Lo/dwh;->e(J)V

    .line 106
    invoke-virtual {v5, v10, v11}, Lo/dwh;->c(J)V

    .line 107
    invoke-static {v7}, Lo/dty;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 108
    if-nez v9, :cond_0

    move v0, v8

    goto :goto_0

    :cond_0
    move v0, v9

    :goto_0
    invoke-virtual {v5, v0}, Lo/dwh;->a(I)V

    .line 109
    invoke-virtual {v4, v5}, Lo/dwk;->a(Lo/dwh;)V

    .line 110
    const-string v0, "PLGACHIEVE_AchieveReportParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseWeekly weekRecord:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 111
    return-object v4

    .line 114
    :cond_1
    const-string v0, "userReport"

    :try_start_1
    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v14

    .line 115
    if-nez v14, :cond_2

    .line 116
    invoke-virtual {v4, v5}, Lo/dwk;->a(Lo/dwh;)V

    .line 117
    const-string v0, "PLGACHIEVE_AchieveReportParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseWeekly weekRecord:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 118
    return-object v4

    .line 120
    :cond_2
    const-string v0, "originalSteps"

    :try_start_2
    invoke-virtual {v14, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lo/dwh;->a(D)V

    .line 121
    const-string v0, "sumRunDistance"

    invoke-virtual {v14, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-static {v0, v1}, Lo/dts;->a(D)D

    move-result-wide v15

    .line 122
    move-wide v0, v15

    invoke-virtual {v5, v0, v1}, Lo/dwh;->b(D)V

    .line 123
    const-string v0, "kaka"

    invoke-virtual {v14, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lo/dwh;->d(I)V

    .line 124
    const-string v0, "price"

    invoke-virtual {v14, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lo/dwh;->b(I)V

    .line 125
    const-string v0, "userMedals"

    invoke-virtual {v14, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-static {v0}, Lo/dty;->c(Lorg/json/JSONArray;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/dwh;->b(Ljava/lang/String;)V

    .line 127
    const-string v0, "sumRunDistanceDesc"

    move-wide v1, v15

    const/4 v3, 0x0

    invoke-static {v0, v14, v1, v2, v3}, Lo/dty;->b(Ljava/lang/String;Lorg/json/JSONObject;DI)D

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lo/dwh;->c(D)V

    .line 128
    const-string v0, "sumStepsDesc"

    invoke-virtual {v14, v0}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lo/dwh;->e(D)V

    .line 129
    const-string v0, "PLGACHIEVE_AchieveReportParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseWeekly weekRecord:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    invoke-virtual {v4, v5}, Lo/dwk;->a(Lo/dwh;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 131
    return-object v4

    .line 132
    :catch_0
    move-exception v6

    .line 133
    const-string v0, "PLGACHIEVE_AchieveReportParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseWeekly Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    invoke-virtual {v4, v5}, Lo/dwk;->a(Lo/dwh;)V

    .line 136
    const-string v0, "PLGACHIEVE_AchieveReportParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseWeekly weekRecord:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    return-object v4
.end method
