.class public Lo/dtu;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Lorg/json/JSONObject;)Lo/dvy;
    .locals 2

    .line 307
    new-instance v1, Lo/dvy;

    invoke-direct {v1}, Lo/dvy;-><init>()V

    .line 308
    const-string v0, "medalWeight"

    invoke-static {v0, p0}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v0

    invoke-virtual {v1, v0}, Lo/dvy;->d(I)V

    .line 309
    const-string v0, "firstTabPriority"

    invoke-static {v0, p0}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v0

    invoke-virtual {v1, v0}, Lo/dvy;->c(I)V

    .line 310
    const-string v0, "secondTabPriority"

    invoke-static {v0, p0}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v0

    invoke-virtual {v1, v0}, Lo/dvy;->b(I)V

    .line 311
    const-string v0, "firstTabDesc"

    invoke-static {v0, p0}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dvy;->e(Ljava/lang/String;)V

    .line 312
    const-string v0, "secondTabDesc"

    invoke-static {v0, p0}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dvy;->a(Ljava/lang/String;)V

    .line 313
    const-string v0, ""

    invoke-virtual {v1, v0}, Lo/dvy;->d(Ljava/lang/String;)V

    .line 314
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lo/dvy;->a(I)V

    .line 315
    return-object v1
.end method

.method public static a(Ljava/lang/String;)Lo/dwk;
    .locals 6

    .line 52
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 53
    const-string v0, "resultCode"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 54
    const-string v0, "PLGACHIEVE_AchieveMedalParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseTakeMedal resultCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    invoke-static {v4}, Lo/dty;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 56
    new-instance v5, Lo/dwk;

    const/4 v0, 0x7

    invoke-direct {v5, v0}, Lo/dwk;-><init>(I)V

    .line 57
    invoke-virtual {v5, v4}, Lo/dwk;->c(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    return-object v5

    .line 60
    :cond_0
    :try_start_1
    new-instance v0, Lo/dwk;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lo/dwk;-><init>(I)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    .line 61
    :catch_0
    move-exception v3

    .line 62
    const-string v0, "PLGACHIEVE_AchieveMedalParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseTakeMedal Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    new-instance v0, Lo/dwk;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lo/dwk;-><init>(I)V

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Lo/dwk;
    .locals 12

    .line 76
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 77
    const-string v0, "resultCode"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 78
    invoke-static {v4}, Lo/dty;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 79
    new-instance v5, Lo/dwk;

    const/4 v0, 0x4

    invoke-direct {v5, v0}, Lo/dwk;-><init>(I)V

    .line 80
    invoke-virtual {v5, v4}, Lo/dwk;->c(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    return-object v5

    .line 83
    :cond_0
    const-string v0, "messages"

    :try_start_1
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    .line 84
    if-nez v5, :cond_1

    .line 85
    new-instance v0, Lo/dwk;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lo/dwk;-><init>(I)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    .line 87
    :cond_1
    :try_start_2
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 88
    const/4 v7, 0x0

    :goto_0
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v7, v0, :cond_4

    .line 89
    invoke-virtual {v5, v7}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    move-result-object v8

    .line 90
    instance-of v0, v8, Lorg/json/JSONObject;

    if-eqz v0, :cond_3

    .line 91
    move-object v9, v8

    check-cast v9, Lorg/json/JSONObject;

    .line 92
    new-instance v10, Lo/dvk;

    invoke-direct {v10}, Lo/dvk;-><init>()V

    .line 93
    const-string v0, "msgType"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v11

    .line 94
    invoke-virtual {v10, v11}, Lo/dvk;->d(I)V

    .line 95
    const/4 v0, 0x2

    if-ne v11, v0, :cond_2

    .line 96
    const-string v0, "medalType"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lo/dvk;->a(Ljava/lang/String;)V

    .line 98
    :cond_2
    const-string v0, "level"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v10, v0}, Lo/dvk;->c(I)V

    .line 99
    const-string v0, "medalId"

    invoke-static {v0, v9}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lo/dvk;->c(Ljava/lang/String;)V

    .line 100
    const-string v0, "takeDate"

    invoke-static {v0, v9}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lo/dvk;->b(Ljava/lang/String;)V

    .line 101
    invoke-interface {v6, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 104
    :cond_4
    const-string v0, "PLGACHIEVE_AchieveMedalParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseMsgRemind messages:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    new-instance v7, Lo/dwa;

    invoke-direct {v7, v6}, Lo/dwa;-><init>(Ljava/util/List;)V

    .line 106
    new-instance v8, Lo/dwk;

    const/4 v0, 0x4

    invoke-direct {v8, v0}, Lo/dwk;-><init>(I)V

    .line 107
    invoke-virtual {v8, v7}, Lo/dwk;->e(Lo/dwa;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 108
    return-object v8

    .line 109
    :catch_0
    move-exception v3

    .line 110
    const-string v0, "PLGACHIEVE_AchieveMedalParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseMsgRemind Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    new-instance v0, Lo/dwk;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lo/dwk;-><init>(I)V

    return-object v0
.end method

.method public static d(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/ArrayList<Lo/dwk;>;"
        }
    .end annotation

    .line 327
    const-string v0, "PLGACHIEVE_AchieveMedalParser"

    const-string v1, "enter parsePersonal UserAchieveWrapper"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 328
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 330
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 331
    const-string v0, "resultCode"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 332
    invoke-static {v5}, Lo/dty;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 333
    new-instance v6, Lo/dwk;

    const/4 v0, 0x0

    invoke-direct {v6, v0}, Lo/dwk;-><init>(I)V

    .line 334
    invoke-virtual {v6, v5}, Lo/dwk;->c(Ljava/lang/String;)V

    .line 335
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 336
    return-object v3

    .line 338
    :cond_0
    const-string v0, "userMedals"

    :try_start_1
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    .line 339
    if-nez v6, :cond_1

    .line 340
    new-instance v7, Lo/dwk;

    const/4 v0, 0x0

    invoke-direct {v7, v0}, Lo/dwk;-><init>(I)V

    .line 341
    invoke-virtual {v7, v5}, Lo/dwk;->c(Ljava/lang/String;)V

    .line 342
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 343
    return-object v3

    .line 345
    :cond_1
    :try_start_2
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v7

    .line 346
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_3

    .line 347
    invoke-virtual {v6, v8}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    move-result-object v9

    .line 348
    instance-of v0, v9, Lorg/json/JSONObject;

    if-eqz v0, :cond_2

    .line 349
    move-object v10, v9

    check-cast v10, Lorg/json/JSONObject;

    .line 351
    new-instance v11, Lo/dvy;

    invoke-direct {v11}, Lo/dvy;-><init>()V

    .line 352
    const-string v0, "medalId"

    invoke-static {v0, v10}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lo/dvy;->b(Ljava/lang/String;)V

    .line 353
    const-string v0, "takeDate"

    invoke-static {v0, v10}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lo/dvy;->d(Ljava/lang/String;)V

    .line 354
    const-string v0, "gainCount"

    invoke-static {v0, v10}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v0

    invoke-virtual {v11, v0}, Lo/dvy;->a(I)V

    .line 355
    new-instance v12, Lo/dwk;

    const/4 v0, 0x0

    invoke-direct {v12, v0}, Lo/dwk;-><init>(I)V

    .line 356
    const-string v0, "PLGACHIEVE_AchieveMedalParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mLocation="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v11}, Lo/dvy;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 357
    invoke-virtual {v12, v11}, Lo/dwk;->e(Lo/dvy;)V

    .line 358
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 346
    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 361
    :cond_3
    return-object v3

    .line 362
    :catch_0
    move-exception v4

    .line 363
    const-string v0, "PLGACHIEVE_AchieveMedalParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parsePersonal Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 365
    return-object v3
.end method

.method private static d(Lorg/json/JSONObject;Lorg/json/JSONObject;)Lo/dvu;
    .locals 2

    .line 267
    new-instance v1, Lo/dvu;

    invoke-direct {v1}, Lo/dvu;-><init>()V

    .line 269
    const-string v0, "type"

    invoke-static {v0, p0}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dvu;->q(Ljava/lang/String;)V

    .line 270
    const-string v0, "message"

    invoke-static {v0, p0}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dvu;->d(Ljava/lang/String;)V

    .line 271
    const-string v0, "grayDescription"

    invoke-static {v0, p0}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dvu;->c(Ljava/lang/String;)V

    .line 272
    const-string v0, "grayDetailStyle"

    invoke-static {v0, p0}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dvu;->m(Ljava/lang/String;)V

    .line 273
    const-string v0, "grayPromotionName"

    invoke-static {v0, p0}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dvu;->f(Ljava/lang/String;)V

    .line 274
    const-string v0, "grayPromotionUrl"

    invoke-static {v0, p0}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dvu;->h(Ljava/lang/String;)V

    .line 275
    const-string v0, "grayListStyle"

    invoke-static {v0, p0}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dvu;->k(Ljava/lang/String;)V

    .line 278
    const-string v0, "lightDescription"

    invoke-static {v0, p0}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dvu;->a(Ljava/lang/String;)V

    .line 279
    const-string v0, "lightDetailStyle"

    invoke-static {v0, p0}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dvu;->p(Ljava/lang/String;)V

    .line 280
    const-string v0, "lightPromotionName"

    invoke-static {v0, p0}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dvu;->i(Ljava/lang/String;)V

    .line 281
    const-string v0, "lightPromotionUrl"

    invoke-static {v0, p0}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dvu;->g(Ljava/lang/String;)V

    .line 282
    const-string v0, "lightListStyle"

    invoke-static {v0, p0}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dvu;->n(Ljava/lang/String;)V

    .line 284
    const-string v0, "shareImageUrl"

    invoke-static {v0, p0}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dvu;->o(Ljava/lang/String;)V

    .line 285
    const-string v0, "label"

    invoke-static {v0, p0}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v0

    invoke-virtual {v1, v0}, Lo/dvu;->f(I)V

    .line 287
    const-string v0, "actionType"

    invoke-static {v0, p1}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v0

    invoke-virtual {v1, v0}, Lo/dvu;->g(I)V

    .line 288
    const-string v0, "goal"

    invoke-static {v0, p1}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v0

    invoke-virtual {v1, v0}, Lo/dvu;->a(I)V

    .line 289
    const-string v0, "location"

    invoke-static {v0, p1}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dvu;->l(Ljava/lang/String;)V

    .line 290
    const-string v0, "activityId"

    invoke-static {v0, p1}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v0

    invoke-virtual {v1, v0}, Lo/dvu;->e(I)V

    .line 292
    const-string v0, "level"

    invoke-static {v0, p1}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v0

    invoke-virtual {v1, v0}, Lo/dvu;->i(I)V

    .line 293
    const-string v0, "unit"

    invoke-static {v0, p1}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v0

    invoke-virtual {v1, v0}, Lo/dvu;->k(I)V

    .line 295
    const-string v0, "startTime"

    invoke-static {v0, p1}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dvu;->r(Ljava/lang/String;)V

    .line 296
    const-string v0, "endTime"

    invoke-static {v0, p1}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dvu;->u(Ljava/lang/String;)V

    .line 297
    const-string v0, "takeEffectTime"

    invoke-static {v0, p1}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dvu;->t(Ljava/lang/String;)V

    .line 298
    const-string v0, "repeatable"

    invoke-static {v0, p1}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v0

    invoke-virtual {v1, v0}, Lo/dvu;->b(I)V

    .line 299
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lo/dvu;->h(I)V

    .line 300
    return-object v1
.end method

.method public static e(Ljava/lang/String;Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Landroid/content/Context;)Ljava/util/ArrayList<Lo/dwk;>;"
        }
    .end annotation

    .line 154
    const-string v0, "PLGACHIEVE_AchieveMedalParser"

    const-string v1, "enter parsemedalBasic"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 156
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 157
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 159
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    move-object/from16 v0, p0

    invoke-direct {v7, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 160
    const-string v0, "resultCode"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 161
    const-string v0, "timestamp"

    const-wide/16 v1, 0x0

    invoke-virtual {v7, v0, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v9

    .line 162
    invoke-static {v8}, Lo/dty;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 163
    new-instance v11, Lo/dwk;

    const/16 v0, 0x8

    invoke-direct {v11, v0}, Lo/dwk;-><init>(I)V

    .line 164
    invoke-virtual {v11, v8}, Lo/dwk;->c(Ljava/lang/String;)V

    .line 165
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 166
    return-object v4

    .line 169
    :cond_0
    const-string v0, "medalInfos"

    :try_start_1
    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v11

    .line 170
    const/4 v0, 0x0

    if-ne v0, v11, :cond_1

    .line 171
    new-instance v0, Lo/dwk;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lo/dwk;-><init>(I)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 172
    return-object v4

    .line 174
    :cond_1
    const/4 v12, 0x0

    :goto_0
    :try_start_2
    invoke-virtual {v11}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v12, v0, :cond_a

    .line 175
    invoke-virtual {v11, v12}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v13

    .line 176
    const-string v0, "medalBasic"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v14

    .line 177
    const-string v0, "medalLocation"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v15

    .line 178
    const-string v0, "medalRule"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v16

    .line 179
    const/4 v0, 0x0

    if-eq v0, v14, :cond_2

    const/4 v0, 0x0

    move-object/from16 v1, v16

    if-ne v0, v1, :cond_3

    .line 180
    :cond_2
    new-instance v0, Lo/dwk;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lo/dwk;-><init>(I)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 181
    return-object v4

    .line 183
    :cond_3
    :try_start_3
    new-instance v17, Lo/dvt;

    invoke-direct/range {v17 .. v17}, Lo/dvt;-><init>()V

    .line 184
    const-string v0, "veinUrl"

    invoke-virtual {v14, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    .line 185
    const-string v0, "type"

    invoke-virtual {v14, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    .line 186
    const-string v0, "level"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    .line 188
    const-string v0, "name"

    invoke-static {v0, v14}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v21

    .line 189
    const-string v0, "medalId"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    .line 191
    move-object/from16 v0, v20

    move-object/from16 v1, v19

    move-object/from16 v2, v18

    invoke-static {v0, v1, v2}, Lo/dtx;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 192
    new-instance v0, Lo/dwk;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lo/dwk;-><init>(I)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    .line 193
    return-object v4

    .line 195
    :cond_4
    :try_start_4
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 196
    invoke-static/range {v22 .. v22}, Lo/dtx;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 197
    goto/16 :goto_3

    .line 200
    :cond_5
    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-static {v0, v1}, Lo/dty;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v23

    .line 202
    const-string v0, "medalIsException"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v24

    .line 203
    invoke-static/range {v24 .. v24}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 204
    move-object/from16 v0, v22

    move-object/from16 v1, p1

    invoke-static {v0, v1}, Lo/dtx;->c(Ljava/lang/String;Landroid/content/Context;)V

    .line 205
    move-object/from16 v0, v22

    move-object/from16 v1, p1

    invoke-static {v0, v1}, Lo/dtx;->b(Ljava/lang/String;Landroid/content/Context;)V

    .line 207
    :cond_6
    invoke-static {v15}, Lo/dtu;->a(Lorg/json/JSONObject;)Lo/dvy;

    move-result-object v25

    .line 208
    move-object/from16 v0, v25

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lo/dvy;->b(Ljava/lang/String;)V

    .line 209
    move-object/from16 v0, v25

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Lo/dvy;->c(Ljava/lang/String;)V

    .line 210
    move-object/from16 v0, v25

    invoke-virtual {v0, v9, v10}, Lo/dvy;->a(J)V

    .line 212
    move-object/from16 v0, v16

    invoke-static {v14, v0}, Lo/dtu;->d(Lorg/json/JSONObject;Lorg/json/JSONObject;)Lo/dvu;

    move-result-object v26

    .line 213
    const-string v0, "endTime"

    move-object/from16 v1, v16

    invoke-static {v0, v1}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v27

    .line 214
    const-string v0, "takeEffectTime"

    move-object/from16 v1, v16

    invoke-static {v0, v1}, Lo/dty;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v28

    .line 215
    move-object/from16 v0, v26

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lo/dvu;->b(Ljava/lang/String;)V

    .line 216
    move-object/from16 v0, v26

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Lo/dvu;->e(Ljava/lang/String;)V

    .line 217
    move-object/from16 v0, v22

    move-object/from16 v1, v27

    move-object/from16 v2, v28

    invoke-static {v0, v1, v2}, Lo/dtx;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 218
    move-object/from16 v0, v26

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dvu;->c(I)V

    .line 220
    move-object/from16 v0, v22

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    const-string v0, ","

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    invoke-virtual/range {v25 .. v25}, Lo/dvy;->e()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v22

    invoke-static {v6, v0, v1}, Lo/dty;->d(Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v6

    goto :goto_1

    .line 227
    :cond_7
    move-object/from16 v0, v26

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dvu;->c(I)V

    .line 229
    :goto_1
    move-object/from16 v0, v26

    invoke-virtual {v0, v9, v10}, Lo/dvu;->c(J)V

    .line 231
    const-string v0, "PLGACHIEVE_AchieveMedalParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "medalName="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, v23

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "veinUrl"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, v18

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lo/dvt;->e(Ljava/lang/String;)V

    .line 233
    move-object/from16 v0, v17

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Lo/dvt;->d(Ljava/lang/String;)V

    .line 234
    move-object/from16 v0, v17

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lo/dvt;->c(Ljava/lang/String;)V

    .line 235
    move-object/from16 v0, v17

    invoke-virtual {v0, v9, v10}, Lo/dvt;->d(J)V

    .line 236
    invoke-static/range {v16 .. v16}, Lo/dty;->a(Lorg/json/JSONObject;)Lo/dvs;

    move-result-object v29

    .line 237
    const/4 v0, 0x0

    move-object/from16 v1, v29

    if-eq v0, v1, :cond_8

    .line 238
    move-object/from16 v0, v29

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lo/dvs;->d(Ljava/lang/String;)V

    .line 239
    move-object/from16 v0, v29

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Lo/dvs;->g(Ljava/lang/String;)V

    .line 240
    move-object/from16 v0, v29

    invoke-virtual {v0, v9, v10}, Lo/dvs;->a(J)V

    .line 242
    :cond_8
    new-instance v0, Lo/dwk;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lo/dwk;-><init>(I)V

    move-object/from16 v30, v0

    .line 244
    const-string v0, "PLGACHIEVE_AchieveMedalParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "eventRecord="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/4 v2, 0x0

    move-object/from16 v3, v29

    if-eq v2, v3, :cond_9

    invoke-virtual/range {v29 .. v29}, Lo/dvs;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_9
    const-string v2, "null"

    :goto_2
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    move-object/from16 v0, v30

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lo/dwk;->d(Lo/dvt;)V

    .line 246
    move-object/from16 v0, v30

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Lo/dwk;->e(Lo/dvy;)V

    .line 247
    move-object/from16 v0, v30

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Lo/dwk;->c(Lo/dvu;)V

    .line 248
    move-object/from16 v0, v30

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Lo/dwk;->e(Lo/dvs;)V

    .line 249
    move-object/from16 v0, v30

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 174
    :goto_3
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_0

    .line 252
    :cond_a
    const-string v0, "PLGACHIEVE_AchieveMedalParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "myMedalRedPointShow str ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 253
    const-string v0, "medalIsException"

    const-string v1, ""

    move-object/from16 v2, p1

    invoke-static {v2, v0, v1}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    const-string v0, "my_medal_red_point"

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p1

    invoke-static {v2, v0, v1}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    move-object/from16 v0, p1

    invoke-static {v0, v6}, Lo/dtx;->d(Landroid/content/Context;Ljava/util/HashMap;)V
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_0

    .line 256
    return-object v4

    .line 257
    :catch_0
    move-exception v7

    .line 258
    const-string v0, "PLGACHIEVE_AchieveMedalParser"

    const-string v1, "parsemedalBasic Exception"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    return-object v4
.end method

.method public static e(Ljava/lang/String;)Lo/dwk;
    .locals 7

    .line 126
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 127
    const-string v0, "resultCode"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 128
    invoke-static {v4}, Lo/dty;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 129
    new-instance v5, Lo/dwk;

    const/4 v0, 0x6

    invoke-direct {v5, v0}, Lo/dwk;-><init>(I)V

    .line 130
    invoke-virtual {v5, v4}, Lo/dwk;->c(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    return-object v5

    .line 133
    :cond_0
    :try_start_1
    new-instance v5, Lo/dwk;

    const/4 v0, 0x6

    invoke-direct {v5, v0}, Lo/dwk;-><init>(I)V

    .line 134
    new-instance v6, Lo/dwb;

    const-string v0, "languageVersion"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "url"

    .line 135
    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v6, v0, v1}, Lo/dwb;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    invoke-virtual {v5, v6}, Lo/dwk;->e(Lo/dwb;)V

    .line 137
    const-string v0, "PLGACHIEVE_AchieveMedalParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseLanguageResUrl languageRes:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 138
    return-object v5

    .line 139
    :catch_0
    move-exception v3

    .line 140
    const-string v0, "PLGACHIEVE_AchieveMedalParser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseLanguageResUrl Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    new-instance v0, Lo/dwk;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lo/dwk;-><init>(I)V

    return-object v0
.end method
