.class public Lo/dtr;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lo/dwk;
    .locals 7

    .line 103
    const-string v0, "PLGACHIEVE_AchieveLevelParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseLevelUpdateInfo json="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    new-instance v3, Lo/dwk;

    const/16 v0, 0xe

    invoke-direct {v3, v0}, Lo/dwk;-><init>(I)V

    .line 106
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 107
    const-string v0, "resultCode"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 108
    invoke-static {v5}, Lo/dty;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 109
    invoke-virtual {v3, v5}, Lo/dwk;->c(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 110
    return-object v3

    .line 112
    :cond_0
    :try_start_1
    new-instance v6, Lo/dvw;

    invoke-direct {v6}, Lo/dvw;-><init>()V

    .line 113
    const-string v0, "resultDesc"

    invoke-static {v0, v4}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/dvw;->e(Ljava/lang/String;)V

    .line 114
    const-string v0, "experience"

    invoke-static {v0, v4}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v0

    invoke-virtual {v6, v0}, Lo/dvw;->b(I)V

    .line 115
    const-string v0, "totalExperience"

    invoke-static {v0, v4}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v0

    invoke-virtual {v6, v0}, Lo/dvw;->d(I)V

    .line 116
    invoke-virtual {v3, v6}, Lo/dwk;->a(Lo/dvw;)V

    .line 117
    const-string v0, "PLGACHIEVE_AchieveLevelParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "levelUpdateReturnBody="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lo/dvw;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 120
    goto :goto_0

    .line 118
    :catch_0
    move-exception v4

    .line 119
    const-string v0, "PLGACHIEVE_AchieveLevelParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseLevelUpdateInfo Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    :goto_0
    return-object v3
.end method

.method public static a(Ljava/util/ArrayList;Lorg/json/JSONArray;J)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/dwk;>;Lorg/json/JSONArray;J)V"
        }
    .end annotation

    .line 80
    const-string v0, "PLGACHIEVE_AchieveLevelParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "array size="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v3, v0, :cond_0

    .line 82
    new-instance v4, Lo/dwk;

    const/16 v0, 0xd

    invoke-direct {v4, v0}, Lo/dwk;-><init>(I)V

    .line 83
    new-instance v5, Lo/dvm;

    invoke-direct {v5}, Lo/dvm;-><init>()V

    .line 84
    add-int/lit8 v0, v3, 0x1

    invoke-virtual {v5, v0}, Lo/dvm;->e(I)V

    .line 86
    :try_start_0
    invoke-virtual {p1, v3}, Lorg/json/JSONArray;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lo/dvm;->c(I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    goto :goto_1

    .line 87
    :catch_0
    move-exception v6

    .line 88
    const-string v0, "PLGACHIEVE_AchieveLevelParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseLevelList Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    :goto_1
    invoke-virtual {v5, p2, p3}, Lo/dvm;->c(J)V

    .line 91
    invoke-virtual {v4, v5}, Lo/dwk;->d(Lo/dvm;)V

    .line 92
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 94
    :cond_0
    return-void
.end method

.method public static d(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/ArrayList<Lo/dwk;>;"
        }
    .end annotation

    .line 35
    const-string v0, "PLGACHIEVE_AchieveLevelParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "json="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 37
    new-instance v4, Lo/dwk;

    const/16 v0, 0xd

    invoke-direct {v4, v0}, Lo/dwk;-><init>(I)V

    .line 39
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 40
    const-string v0, "resultCode"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 41
    invoke-static {v6}, Lo/dty;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 42
    invoke-virtual {v4, v6}, Lo/dwk;->c(Ljava/lang/String;)V

    .line 43
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    return-object v3

    .line 46
    :cond_0
    :try_start_1
    new-instance v7, Lo/dvj;

    invoke-direct {v7}, Lo/dvj;-><init>()V

    .line 47
    const-string v0, "dayLevel"

    invoke-static {v0, v5}, Lo/dty;->a(Ljava/lang/String;Lorg/json/JSONObject;)D

    move-result-wide v8

    .line 48
    const-string v0, "userLevel"

    invoke-static {v0, v5}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v10

    .line 49
    const-string v0, "userExperience"

    invoke-static {v0, v5}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v11

    .line 50
    const-string v0, "timestamp"

    invoke-static {v0, v5}, Lo/dty;->c(Ljava/lang/String;Lorg/json/JSONObject;)J

    move-result-wide v12

    .line 51
    invoke-virtual {v7, v10}, Lo/dvj;->c(I)V

    .line 52
    invoke-virtual {v7, v11}, Lo/dvj;->b(I)V

    .line 53
    invoke-virtual {v7, v12, v13}, Lo/dvj;->c(J)V

    .line 54
    invoke-virtual {v7, v8, v9}, Lo/dvj;->b(D)V

    .line 55
    invoke-virtual {v4, v7}, Lo/dwk;->e(Lo/dvj;)V

    .line 56
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    const-string v0, "PLGACHIEVE_AchieveLevelParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "achieveUserLevelInfo="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    const-string v0, "levelUserCountList"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v14

    .line 60
    const/4 v0, 0x0

    if-ne v0, v14, :cond_1

    .line 61
    const-string v0, "PLGACHIEVE_AchieveLevelParser"

    const-string v1, "array is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 63
    :cond_1
    invoke-static {v3, v14, v12, v13}, Lo/dtr;->a(Ljava/util/ArrayList;Lorg/json/JSONArray;J)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 68
    :goto_0
    goto :goto_1

    .line 66
    :catch_0
    move-exception v5

    .line 67
    const-string v0, "PLGACHIEVE_AchieveLevelParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseLevelInfo Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    :goto_1
    return-object v3
.end method
