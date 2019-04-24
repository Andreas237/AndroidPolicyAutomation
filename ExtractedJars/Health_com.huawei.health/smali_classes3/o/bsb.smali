.class public Lo/bsb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brz;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private c()Z
    .locals 2

    .line 487
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v0

    const/4 v1, 0x3

    invoke-interface {v0, v1}, Lo/brr;->c(I)Z

    move-result v0

    return v0
.end method

.method private e(Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 5

    .line 998
    if-nez p1, :cond_0

    .line 999
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 1002
    :cond_0
    move-object v4, p2

    .line 1003
    if-nez v4, :cond_1

    .line 1004
    :try_start_0
    invoke-static {}, Lo/bse;->d()Ljava/lang/String;

    move-result-object v4

    .line 1006
    :cond_1
    const-string v0, "lang"

    invoke-virtual {p1, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1009
    goto :goto_0

    .line 1007
    :catch_0
    move-exception v4

    .line 1008
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " addLanguageParams "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1010
    :goto_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 980
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/bsl;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsa;->e(Ljava/lang/String;)V

    .line 981
    return-void
.end method

.method public a(III[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;ILo/bsr;)V
    .locals 6

    .line 94
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 96
    const-string v0, "pageStart"

    :try_start_0
    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 97
    const-string v0, "pageSize"

    invoke-virtual {v4, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 98
    invoke-static {}, Lo/bse;->d()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v4, v0}, Lo/bsb;->e(Lorg/json/JSONObject;Ljava/lang/String;)V

    .line 99
    if-eqz p3, :cond_0

    const/4 v0, 0x1

    if-ne p3, v0, :cond_1

    .line 100
    :cond_0
    const-string v0, "supportWear"

    invoke-virtual {v4, v0, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 102
    :cond_1
    const/4 v0, 0x0

    if-eq v0, p4, :cond_2

    .line 103
    const-string v0, "classList"

    new-instance v1, Lorg/json/JSONArray;

    invoke-static {p4}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 105
    :cond_2
    const/4 v0, 0x0

    if-eq v0, p5, :cond_3

    .line 106
    const-string v0, "trainingPoints"

    new-instance v1, Lorg/json/JSONArray;

    invoke-static {p5}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 108
    :cond_3
    const/4 v0, 0x0

    if-eq v0, p6, :cond_4

    .line 109
    const-string v0, "difficulty"

    new-instance v1, Lorg/json/JSONArray;

    invoke-static {p6}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 111
    :cond_4
    const/4 v0, 0x0

    if-eq v0, p7, :cond_5

    .line 112
    const-string v0, "equipments"

    new-instance v1, Lorg/json/JSONArray;

    invoke-static {p7}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 114
    :cond_5
    const/4 v0, 0x1

    if-ne p8, v0, :cond_6

    .line 115
    const-string v0, "my"

    invoke-virtual {v4, v0, p8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 117
    :cond_6
    invoke-static {}, Lo/bsl;->m()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 118
    const-string v0, "sportSuggestUrl"

    new-instance v1, Lo/bsb$1;

    invoke-direct {v1, p0, v4, p9}, Lo/bsb$1;-><init>(Lo/bsb;Lorg/json/JSONObject;Lo/bsr;)V

    invoke-static {v0, v1}, Lo/bzu$c;->e(Ljava/lang/String;Lo/cza;)V

    goto :goto_0

    .line 133
    :cond_7
    invoke-static {}, Lo/bsl;->m()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, p9}, Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 138
    :goto_0
    goto :goto_1

    .line 135
    :catch_0
    move-exception v5

    .line 136
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    const/4 v0, -0x5

    invoke-static {v0}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x5

    invoke-virtual {p9, v1, v0}, Lo/bsr;->d(ILjava/lang/String;)V

    .line 139
    :goto_1
    return-void
.end method

.method public a(IILo/bsr;)V
    .locals 6

    .line 929
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 931
    const-string v0, "logId"

    :try_start_0
    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 932
    const-string v0, "type"

    invoke-virtual {v4, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 935
    goto :goto_0

    .line 933
    :catch_0
    move-exception v5

    .line 934
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBehaviorList Jsons parse error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 937
    :goto_0
    invoke-static {}, Lo/bsl;->N()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, p3}, Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V

    .line 938
    return-void
.end method

.method public a(ILo/bsr;)V
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 532
    invoke-static {}, Lo/bse;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0, p2}, Lo/bsb;->e(ILjava/lang/String;Lo/bsr;)V

    .line 533
    return-void
.end method

.method public a(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;Lo/bsr;)V
    .locals 7

    .line 615
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 616
    new-instance v5, Lcom/google/gson/Gson;

    invoke-direct {v5}, Lcom/google/gson/Gson;-><init>()V

    .line 618
    :try_start_0
    invoke-virtual {v5, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 619
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pkgInfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 620
    const-string v0, "userFitnessPlanInfo"

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 623
    goto :goto_0

    .line 621
    :catch_0
    move-exception v6

    .line 622
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateFitnessPackagePlan exception = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 625
    :goto_0
    invoke-static {}, Lo/bsl;->E()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, p2}, Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V

    .line 626
    return-void
.end method

.method public a(Ljava/lang/String;ILo/bsr;)V
    .locals 6

    .line 412
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 414
    const-string v0, "planId"

    :try_start_0
    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 415
    const-string v0, "remindTime"

    invoke-virtual {v4, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 416
    invoke-static {}, Lo/bsl;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, p3}, Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 420
    goto :goto_0

    .line 417
    :catch_0
    move-exception v5

    .line 418
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 419
    const/4 v0, -0x5

    invoke-static {v0}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x5

    invoke-virtual {p3, v1, v0}, Lo/bsr;->d(ILjava/lang/String;)V

    .line 421
    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;Lcom/huawei/health/suggestion/model/PlanStat;Lo/bsr;)V
    .locals 7

    .line 431
    invoke-direct {p0}, Lo/bsb;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 432
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postBestRecord failed since switch-off"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 433
    return-void

    .line 436
    :cond_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 438
    :try_start_0
    invoke-static {p2}, Lo/bsy;->c(Lcom/huawei/health/suggestion/model/PlanStat;)Lorg/json/JSONObject;

    move-result-object v5

    .line 439
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 440
    const-string v0, "bestRecords"

    invoke-virtual {v4, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 442
    :cond_1
    const-string v0, "planId"

    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 443
    invoke-static {p2}, Lo/bsy;->a(Lcom/huawei/health/suggestion/model/PlanStat;)Lorg/json/JSONObject;

    move-result-object v6

    .line 444
    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 445
    const-string v0, "userBestRecords"

    invoke-virtual {v4, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 447
    :cond_2
    invoke-static {}, Lo/bsl;->p()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, p3}, Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 451
    goto :goto_0

    .line 448
    :catch_0
    move-exception v5

    .line 449
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 450
    const/4 v0, -0x5

    invoke-static {v0}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x5

    invoke-virtual {p3, v1, v0}, Lo/bsr;->d(ILjava/lang/String;)V

    .line 452
    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Lo/bsr;)V
    .locals 6

    .line 223
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 224
    const-string v0, "weekInfos"

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1, p2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 225
    invoke-static {}, Lo/bsl;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, p3}, Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 229
    goto :goto_0

    .line 226
    :catch_0
    move-exception v5

    .line 227
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    const/4 v0, -0x5

    invoke-static {v0}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x5

    invoke-virtual {p3, v1, v0}, Lo/bsr;->d(ILjava/lang/String;)V

    .line 230
    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;Lo/bsr;)V
    .locals 6

    .line 869
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 871
    const-string v0, "workoutId"

    :try_start_0
    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 874
    goto :goto_0

    .line 872
    :catch_0
    move-exception v5

    .line 873
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "collectBehavior Jsons parse error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 875
    :goto_0
    new-instance v5, Ljava/util/HashMap;

    const/4 v0, 0x1

    invoke-direct {v5, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 876
    const-string v0, "iVersion"

    const-string v1, "2"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 877
    invoke-static {}, Lo/bsl;->j()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, v5, p2}, Lo/bsa;->d(Ljava/lang/String;Lorg/json/JSONObject;Ljava/util/Map;Lo/bsr;)V

    .line 878
    return-void
.end method

.method public a(Ljava/util/List;Lo/bsr;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;Lo/bsr;)V"
        }
    .end annotation

    .line 774
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 778
    const-string v0, "list"

    :try_start_0
    invoke-static {p1}, Lo/bso;->e(Ljava/util/List;)Lorg/json/JSONArray;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 779
    invoke-static {}, Lo/bsl;->t()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, p2}, Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 783
    goto :goto_0

    .line 780
    :catch_0
    move-exception v5

    .line 781
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 782
    const/4 v0, -0x5

    invoke-static {v0}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x5

    invoke-virtual {p2, v1, v0}, Lo/bsr;->d(ILjava/lang/String;)V

    .line 784
    :goto_0
    return-void
.end method

.method public a(Ljava/util/Map;JLo/bsr;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;JLo/bsr;)V"
        }
    .end annotation

    .line 743
    invoke-direct {p0}, Lo/bsb;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 744
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setEvent failed since switch-off"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 745
    const-string v0, "post switch-off"

    const v1, 0x30d59

    invoke-virtual {p4, v1, v0}, Lo/bsr;->d(ILjava/lang/String;)V

    .line 746
    return-void

    .line 748
    :cond_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 750
    const-string v0, "key"

    const-string v1, "EXERCISE_FINISH"

    :try_start_0
    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 751
    const-string v0, "keyType"

    const-string v1, "complex"

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 752
    const-string v0, "timestamp"

    invoke-virtual {v4, v0, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 753
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 755
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/Map$Entry;

    .line 756
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 757
    goto :goto_0

    .line 758
    :cond_1
    const-string v0, "value"

    invoke-virtual {v4, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 761
    goto :goto_1

    .line 759
    :catch_0
    move-exception v5

    .line 760
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Jsons parse error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 762
    :goto_1
    invoke-static {}, Lo/bsl;->L()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, p4}, Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V

    .line 763
    return-void
.end method

.method public a(Lo/bsr;)V
    .locals 2

    .line 497
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 498
    invoke-static {}, Lo/bsl;->s()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1, p1}, Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V

    .line 499
    return-void
.end method

.method public b()V
    .locals 1

    .line 988
    invoke-static {}, Lo/bsc;->b()Lo/bsc;

    move-result-object v0

    invoke-virtual {v0}, Lo/bsc;->e()V

    .line 989
    return-void
.end method

.method public b(FJIIILjava/lang/String;Lo/bsr;)V
    .locals 6

    .line 191
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 193
    const-string v0, "beginDate"

    :try_start_0
    invoke-static {p2, p3}, Lo/cap;->b(J)J

    move-result-wide v1

    invoke-virtual {v4, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 194
    const-string v0, "subType"

    invoke-virtual {v4, v0, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 195
    const-string v0, "difficulty"

    add-int/lit8 v1, p5, 0x0

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 196
    const-string v0, "movementTimes"

    invoke-virtual {v4, v0, p6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 197
    const-string v0, "excludedDate"

    invoke-virtual {v4, v0, p7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 198
    const-string v0, "weight"

    float-to-double v1, p1

    invoke-virtual {v4, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 199
    invoke-static {}, Lo/bsl;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, p8}, Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V

    .line 201
    const/4 v0, 0x1

    if-ne v0, p4, :cond_0

    .line 202
    invoke-static {p5, p6, p7}, Lo/bzm;->a(IILjava/lang/String;)V

    goto :goto_0

    .line 204
    :cond_0
    invoke-static {p5, p6, p7}, Lo/bzm;->b(IILjava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 209
    :goto_0
    goto :goto_1

    .line 206
    :catch_0
    move-exception v5

    .line 207
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    const/4 v0, -0x5

    invoke-static {v0}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x5

    invoke-virtual {p8, v1, v0}, Lo/bsr;->d(ILjava/lang/String;)V

    .line 210
    :goto_1
    return-void
.end method

.method public b(IILjava/lang/String;Lo/bsr;)V
    .locals 6

    .line 1089
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 1091
    const-string v0, "pageNum"

    :try_start_0
    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1092
    const-string v0, "topicId"

    invoke-virtual {v4, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1093
    invoke-direct {p0, v4, p3}, Lo/bsb;->e(Lorg/json/JSONObject;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1096
    goto :goto_0

    .line 1094
    :catch_0
    move-exception v5

    .line 1095
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Jsons parse error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1097
    :goto_0
    invoke-static {}, Lo/bsl;->z()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, p4}, Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V

    .line 1098
    return-void
.end method

.method public b(IILo/bsr;)V
    .locals 6

    .line 575
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 577
    const-string v0, "pageStart"

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 578
    const-string v0, "pageSize"

    const/16 v1, 0x32

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 581
    goto :goto_0

    .line 579
    :catch_0
    move-exception v5

    .line 580
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFitnessPkgInfo "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 583
    :goto_0
    invoke-static {}, Lo/bsl;->F()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, p3}, Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V

    .line 584
    return-void
.end method

.method public b(ILo/bsr;)V
    .locals 6

    .line 838
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 840
    const-string v0, "type"

    :try_start_0
    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 843
    goto :goto_0

    .line 841
    :catch_0
    move-exception v5

    .line 842
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Jsons parse error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 844
    :goto_0
    invoke-static {}, Lo/bsl;->C()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 845
    const-string v0, "sportSuggestUrl"

    new-instance v1, Lo/bsb$4;

    invoke-direct {v1, p0, v4, p2}, Lo/bsb$4;-><init>(Lo/bsb;Lorg/json/JSONObject;Lo/bsr;)V

    invoke-static {v0, v1}, Lo/bzu$c;->e(Ljava/lang/String;Lo/cza;)V

    goto :goto_1

    .line 860
    :cond_0
    invoke-static {}, Lo/bsl;->C()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, p2}, Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V

    .line 862
    :goto_1
    return-void
.end method

.method public b(Lcom/huawei/health/suggestion/model/BestRecordFitStat;Lo/bsr;)V
    .locals 10

    .line 457
    invoke-direct {p0}, Lo/bsb;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 458
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postBestRecord failed since switch-off"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 459
    return-void

    .line 462
    :cond_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 464
    :try_start_0
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/BestRecordFitStat;->acquireBestRecords()Ljava/util/Map;

    move-result-object v5

    .line 465
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    invoke-interface {v5}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 466
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 468
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v7

    .line 469
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/util/Map$Entry;

    .line 470
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 471
    goto :goto_0

    .line 472
    :cond_1
    const-string v0, "bestRecords"

    invoke-virtual {v4, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 474
    :cond_2
    const-string v0, "id"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/BestRecordFitStat;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 475
    const-string v0, "completeTime"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/BestRecordFitStat;->acquireCompleteTime()J

    move-result-wide v1

    invoke-virtual {v4, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 477
    new-instance v6, Ljava/util/HashMap;

    const/4 v0, 0x1

    invoke-direct {v6, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 478
    const-string v0, "iVersion"

    const-string v1, "2"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 479
    invoke-static {}, Lo/bsl;->n()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, v6, p2}, Lo/bsa;->d(Ljava/lang/String;Lorg/json/JSONObject;Ljava/util/Map;Lo/bsr;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 483
    goto :goto_1

    .line 480
    :catch_0
    move-exception v5

    .line 481
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 482
    const/4 v0, -0x5

    invoke-static {v0}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x5

    invoke-virtual {p2, v1, v0}, Lo/bsr;->d(ILjava/lang/String;)V

    .line 484
    :goto_1
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Lo/bsr;)V
    .locals 6

    .line 392
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 394
    const-string v0, "planId"

    :try_start_0
    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 395
    const-string v0, "name"

    invoke-virtual {v4, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 396
    invoke-static {}, Lo/bsl;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, p3}, Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 400
    goto :goto_0

    .line 397
    :catch_0
    move-exception v5

    .line 398
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 399
    const/4 v0, -0x5

    invoke-static {v0}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x5

    invoke-virtual {p3, v1, v0}, Lo/bsr;->d(ILjava/lang/String;)V

    .line 401
    :goto_0
    return-void
.end method

.method public b(Ljava/lang/String;Lo/bsr;)V
    .locals 6

    .line 888
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 890
    const-string v0, "workoutId"

    :try_start_0
    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 891
    const-string v0, "operType"

    const/4 v1, 0x2

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 894
    goto :goto_0

    .line 892
    :catch_0
    move-exception v5

    .line 893
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteBehavior Jsons parse error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 895
    :goto_0
    new-instance v5, Ljava/util/HashMap;

    const/4 v0, 0x1

    invoke-direct {v5, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 896
    const-string v0, "iVersion"

    const-string v1, "2"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 897
    invoke-static {}, Lo/bsl;->D()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, v5, p2}, Lo/bsa;->d(Ljava/lang/String;Lorg/json/JSONObject;Ljava/util/Map;Lo/bsr;)V

    .line 898
    return-void
.end method

.method public b(Ljava/util/List;ILo/bsr;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;ILo/bsr;)V"
        }
    .end annotation

    .line 1102
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 1103
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 1104
    :cond_0
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "actionIds is empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1105
    if-eqz p3, :cond_1

    .line 1106
    const/4 v0, -0x5

    invoke-static {v0}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x5

    invoke-virtual {p3, v1, v0}, Lo/bsr;->d(ILjava/lang/String;)V

    .line 1108
    :cond_1
    return-void

    .line 1112
    :cond_2
    :try_start_0
    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 1113
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 1114
    invoke-virtual {v5, v7}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1115
    goto :goto_0

    .line 1116
    :cond_3
    const-string v0, "actionIdList"

    invoke-virtual {v4, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1117
    const-string v0, "sex"

    invoke-virtual {v4, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1120
    goto :goto_1

    .line 1118
    :catch_0
    move-exception v5

    .line 1119
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getWorkOutsByTopicId Jsons parse error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1121
    :goto_1
    invoke-static {}, Lo/bsl;->K()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, p3}, Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V

    .line 1122
    return-void
.end method

.method public b(Lo/bsr;)V
    .locals 2

    .line 380
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 381
    invoke-static {}, Lo/bsl;->l()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1, p1}, Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V

    .line 382
    return-void
.end method

.method public c(ILcom/huawei/health/suggestion/model/WorkoutRecord;Lo/bsr;)V
    .locals 5

    .line 259
    invoke-direct {p0}, Lo/bsb;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 260
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finishExercise failed since switch-off"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    const-string v0, "post switch-off"

    const v1, 0x30d59

    invoke-virtual {p3, v1, v0}, Lo/bsr;->d(ILjava/lang/String;)V

    .line 262
    return-void

    .line 264
    :cond_0
    invoke-static {p1, p2}, Lo/bsx;->b(ILcom/huawei/health/suggestion/model/WorkoutRecord;)Lorg/json/JSONObject;

    move-result-object v4

    .line 265
    invoke-static {}, Lo/bsl;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, p3}, Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V

    .line 266
    return-void
.end method

.method public c(Ljava/lang/String;FFFJLo/bsr;)V
    .locals 6

    .line 299
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 301
    const-string v0, "planId"

    :try_start_0
    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 302
    const-string v0, "completionRate"

    invoke-static {p2}, Lo/bzr;->i(F)F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v4, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 303
    const-string v0, "actualDistance"

    invoke-static {p3}, Lo/bzr;->b(F)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 304
    const-string v0, "actualCalorie"

    float-to-double v1, p4

    invoke-virtual {v4, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 305
    const-string v0, "dateTime"

    invoke-static {p5, p6}, Lo/cap;->b(J)J

    move-result-wide v1

    invoke-virtual {v4, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 306
    invoke-static {}, Lo/bsl;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, p7}, Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 311
    goto :goto_0

    .line 308
    :catch_0
    move-exception v5

    .line 309
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    const/4 v0, -0x5

    invoke-static {v0}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x5

    invoke-virtual {p7, v1, v0}, Lo/bsr;->d(ILjava/lang/String;)V

    .line 312
    :goto_0
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;ILo/bsr;)V
    .locals 6

    .line 361
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 363
    const-string v0, "workoutId"

    :try_start_0
    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 364
    const-string v0, "version"

    invoke-virtual {v4, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 365
    const-string v0, "operType"

    invoke-virtual {v4, v0, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 366
    invoke-static {}, Lo/bsl;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, p4}, Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 370
    goto :goto_0

    .line 367
    :catch_0
    move-exception v5

    .line 368
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 369
    const/4 v0, -0x5

    invoke-static {v0}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x5

    invoke-virtual {p4, v1, v0}, Lo/bsr;->d(ILjava/lang/String;)V

    .line 371
    :goto_0
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Lo/bsr;)V
    .locals 3

    .line 950
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 951
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 952
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 953
    invoke-static {p1, v1, p2, p3}, Lo/bsa;->e(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Lo/bsr;)V

    goto :goto_0

    .line 955
    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p3, v0}, Lo/bsr;->b(Lorg/json/JSONObject;)V

    .line 957
    :goto_0
    return-void
.end method

.method public c(Ljava/lang/String;Lo/bsr;)V
    .locals 6

    .line 665
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 667
    const-string v0, "planId"

    :try_start_0
    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 670
    goto :goto_0

    .line 668
    :catch_0
    move-exception v5

    .line 669
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteFitnessPkgPlan exception = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 672
    :goto_0
    invoke-static {}, Lo/bsl;->I()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, p2}, Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V

    .line 673
    return-void
.end method

.method public c(Lo/bsr;)V
    .locals 1

    .line 73
    invoke-static {}, Lo/bse;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lo/bsb;->h(Ljava/lang/String;Lo/bsr;)V

    .line 74
    return-void
.end method

.method public d(IILjava/lang/String;Lo/bsr;)V
    .locals 6

    .line 143
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 145
    const-string v0, "pageStart"

    :try_start_0
    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 146
    const-string v0, "pageSize"

    invoke-virtual {v4, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 147
    const-string v0, "fuzzyKeyWords"

    invoke-virtual {v4, v0, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 148
    invoke-static {}, Lo/bsl;->m()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, p4}, Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 152
    goto :goto_0

    .line 149
    :catch_0
    move-exception v5

    .line 150
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    const/4 v0, -0x5

    invoke-static {v0}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x5

    invoke-virtual {p4, v1, v0}, Lo/bsr;->d(ILjava/lang/String;)V

    .line 153
    :goto_0
    return-void
.end method

.method public d(IILo/bsr;)V
    .locals 1

    .line 735
    invoke-static {}, Lo/bse;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0, p3}, Lo/bsb;->b(IILjava/lang/String;Lo/bsr;)V

    .line 736
    return-void
.end method

.method public d(ILo/bsr;)V
    .locals 6

    .line 694
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 696
    const-string v0, "pageType"

    :try_start_0
    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 699
    goto :goto_0

    .line 697
    :catch_0
    move-exception v5

    .line 698
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Jsons parse error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 700
    :goto_0
    invoke-static {}, Lo/bsl;->x()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 701
    const-string v0, "sportSuggestUrl"

    new-instance v1, Lo/bsb$5;

    invoke-direct {v1, p0, v4, p2}, Lo/bsb$5;-><init>(Lo/bsb;Lorg/json/JSONObject;Lo/bsr;)V

    invoke-static {v0, v1}, Lo/bzu$c;->e(Ljava/lang/String;Lo/cza;)V

    goto :goto_1

    .line 716
    :cond_0
    invoke-static {}, Lo/bsl;->x()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, p2}, Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V

    .line 718
    :goto_1
    return-void
.end method

.method public d(JLjava/lang/String;Lo/bsr;)V
    .locals 6

    .line 540
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 542
    const-string v0, "version"

    :try_start_0
    invoke-virtual {v4, v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 545
    goto :goto_0

    .line 543
    :catch_0
    move-exception v5

    .line 544
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Jsons parse error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 546
    :goto_0
    invoke-static {}, Lo/bsl;->v()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 547
    const-string v0, "sportSuggestUrl"

    new-instance v1, Lo/bsb$2;

    invoke-direct {v1, p0, v4, p4}, Lo/bsb$2;-><init>(Lo/bsb;Lorg/json/JSONObject;Lo/bsr;)V

    invoke-static {v0, v1}, Lo/bzu$c;->e(Ljava/lang/String;Lo/cza;)V

    goto :goto_1

    .line 562
    :cond_0
    invoke-static {}, Lo/bsl;->v()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, p3, p4}, Lo/bsa;->d(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Lo/bsr;)V

    .line 564
    :goto_1
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/bsr;)V
    .locals 6

    .line 1027
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 1029
    const-string v0, "workoutId"

    :try_start_0
    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1030
    invoke-direct {p0, v4, p4}, Lo/bsb;->e(Lorg/json/JSONObject;Ljava/lang/String;)V

    .line 1031
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1032
    const-string v0, "version"

    invoke-virtual {v4, v0, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1034
    :cond_0
    invoke-static {}, Lo/bsl;->o()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1035
    const-string v0, "sportSuggestUrl"

    new-instance v1, Lo/bsb$6;

    invoke-direct {v1, p0, v4, p5}, Lo/bsb$6;-><init>(Lo/bsb;Lorg/json/JSONObject;Lo/bsr;)V

    invoke-static {v0, v1}, Lo/bzu$c;->e(Ljava/lang/String;Lo/cza;)V

    goto :goto_0

    .line 1050
    :cond_1
    invoke-static {}, Lo/bsl;->o()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, p5}, Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1055
    :goto_0
    goto :goto_1

    .line 1052
    :catch_0
    move-exception v5

    .line 1053
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1054
    const/4 v0, -0x5

    invoke-static {v0}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x5

    invoke-virtual {p5, v1, v0}, Lo/bsr;->d(ILjava/lang/String;)V

    .line 1056
    :goto_1
    return-void
.end method

.method public d(Ljava/lang/String;Lo/bsr;)V
    .locals 6

    .line 277
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 279
    const-string v0, "planId"

    :try_start_0
    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 280
    invoke-static {}, Lo/bsl;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, p2}, Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 284
    goto :goto_0

    .line 281
    :catch_0
    move-exception v5

    .line 282
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 283
    const/4 v0, -0x5

    invoke-static {v0}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x5

    invoke-virtual {p2, v1, v0}, Lo/bsr;->d(ILjava/lang/String;)V

    .line 285
    :goto_0
    return-void
.end method

.method public d(Lo/bsr;)V
    .locals 4

    .line 503
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 504
    new-instance v3, Ljava/util/HashMap;

    const/4 v0, 0x1

    invoke-direct {v3, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 505
    const-string v0, "iVersion"

    const-string v1, "2"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 506
    invoke-static {}, Lo/bsl;->q()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2, v3, p1}, Lo/bsa;->d(Ljava/lang/String;Lorg/json/JSONObject;Ljava/util/Map;Lo/bsr;)V

    .line 507
    return-void
.end method

.method public e(IIILo/bsr;)V
    .locals 6

    .line 911
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 913
    const-string v0, "pageStart"

    :try_start_0
    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 914
    const-string v0, "pageSize"

    invoke-virtual {v4, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 915
    const-string v0, "operType"

    invoke-virtual {v4, v0, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 918
    goto :goto_0

    .line 916
    :catch_0
    move-exception v5

    .line 917
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBehaviorList Jsons parse error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 919
    :goto_0
    new-instance v5, Ljava/util/HashMap;

    const/4 v0, 0x1

    invoke-direct {v5, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 920
    const-string v0, "iVersion"

    const-string v1, "2"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 921
    invoke-static {}, Lo/bsl;->A()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, v5, p4}, Lo/bsa;->d(Ljava/lang/String;Lorg/json/JSONObject;Ljava/util/Map;Lo/bsr;)V

    .line 922
    return-void
.end method

.method public e(IILo/bsr;)V
    .locals 6

    .line 341
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 343
    const-string v0, "pageStart"

    :try_start_0
    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 344
    const-string v0, "pageSize"

    invoke-virtual {v4, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 345
    invoke-static {}, Lo/bsl;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, p3}, Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 349
    goto :goto_0

    .line 346
    :catch_0
    move-exception v5

    .line 347
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    const/4 v0, -0x5

    invoke-static {v0}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x5

    invoke-virtual {p3, v1, v0}, Lo/bsr;->d(ILjava/lang/String;)V

    .line 350
    :goto_0
    return-void
.end method

.method public e(ILjava/lang/String;Lo/bsr;)V
    .locals 6

    .line 1060
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 1062
    const-string v0, "pageNum"

    :try_start_0
    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1063
    invoke-direct {p0, v4, p2}, Lo/bsb;->e(Lorg/json/JSONObject;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1066
    goto :goto_0

    .line 1064
    :catch_0
    move-exception v5

    .line 1065
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Jsons parse error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1067
    :goto_0
    invoke-static {}, Lo/bsl;->u()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1068
    const-string v0, "sportSuggestUrl"

    new-instance v1, Lo/bsb$8;

    invoke-direct {v1, p0, v4, p3}, Lo/bsb$8;-><init>(Lo/bsb;Lorg/json/JSONObject;Lo/bsr;)V

    invoke-static {v0, v1}, Lo/bzu$c;->e(Ljava/lang/String;Lo/cza;)V

    goto :goto_1

    .line 1083
    :cond_0
    invoke-static {}, Lo/bsl;->u()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, p3}, Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V

    .line 1085
    :goto_1
    return-void
.end method

.method public e(ILo/bsr;)V
    .locals 6

    .line 806
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 808
    const-string v0, "type"

    :try_start_0
    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 811
    goto :goto_0

    .line 809
    :catch_0
    move-exception v5

    .line 810
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Jsons parse error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 812
    :goto_0
    invoke-static {}, Lo/bsl;->B()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 813
    const-string v0, "sportSuggestUrl"

    new-instance v1, Lo/bsb$3;

    invoke-direct {v1, p0, v4, p2}, Lo/bsb$3;-><init>(Lo/bsb;Lorg/json/JSONObject;Lo/bsr;)V

    invoke-static {v0, v1}, Lo/bzu$c;->e(Ljava/lang/String;Lo/cza;)V

    goto :goto_1

    .line 828
    :cond_0
    invoke-static {}, Lo/bsl;->B()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, p2}, Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V

    .line 830
    :goto_1
    return-void
.end method

.method public e(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;Lo/bsr;)V
    .locals 7

    .line 594
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 595
    new-instance v5, Lcom/google/gson/Gson;

    invoke-direct {v5}, Lcom/google/gson/Gson;-><init>()V

    .line 597
    :try_start_0
    invoke-virtual {v5, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 598
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pkgInfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 599
    const-string v0, "userFitnessPlanInfo"

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 602
    goto :goto_0

    .line 600
    :catch_0
    move-exception v6

    .line 601
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "createFitnessPackagePlan exception = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 604
    :goto_0
    invoke-static {}, Lo/bsl;->H()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, p2}, Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V

    .line 605
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/bsr;)V
    .locals 6
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 174
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-static {}, Lo/bse;->d()Ljava/lang/String;

    move-result-object v4

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lo/bsb;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/bsr;)V

    .line 175
    return-void
.end method

.method public e(Ljava/lang/String;Lo/bsr;)V
    .locals 6

    .line 511
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 513
    const-string v0, "workoutId"

    :try_start_0
    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 514
    new-instance v5, Ljava/util/HashMap;

    const/4 v0, 0x1

    invoke-direct {v5, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 515
    const-string v0, "iVersion"

    const-string v1, "2"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 516
    invoke-static {}, Lo/bsl;->r()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4, v5, p2}, Lo/bsa;->d(Ljava/lang/String;Lorg/json/JSONObject;Ljava/util/Map;Lo/bsr;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 520
    goto :goto_0

    .line 517
    :catch_0
    move-exception v5

    .line 518
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 519
    const/4 v0, -0x5

    invoke-static {v0}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x5

    invoke-virtual {p2, v1, v0}, Lo/bsr;->d(ILjava/lang/String;)V

    .line 521
    :goto_0
    return-void
.end method

.method public e(Lo/bsr;)V
    .locals 2

    .line 653
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 654
    invoke-static {}, Lo/bsl;->G()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1, p1}, Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V

    .line 655
    return-void
.end method

.method public g(Lo/bsr;)V
    .locals 2

    .line 682
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 683
    invoke-static {}, Lo/bsl;->J()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1, p1}, Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V

    .line 684
    return-void
.end method

.method public h(Ljava/lang/String;Lo/bsr;)V
    .locals 2

    .line 1020
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 1021
    invoke-direct {p0, v1, p1}, Lo/bsb;->e(Lorg/json/JSONObject;Ljava/lang/String;)V

    .line 1022
    invoke-static {}, Lo/bsl;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1, p2}, Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V

    .line 1023
    return-void
.end method
